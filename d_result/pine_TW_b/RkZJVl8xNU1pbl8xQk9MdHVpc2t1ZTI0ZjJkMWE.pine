//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: FFIV_15Min_1BOL_e24f2d1a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1BOL_e24f2d1a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_e24f2d1a(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBlower <= 6.11778 )
		if( dif_source_BBupper <= -28.1448 )
			if( BBlower <= 202.608 )
				if( dif_source_BBupper <= -47.3903 )
					if( dif_source_BBlower <= -3.31865 )
						if( dif_source_BBupper <= -51.0586 )
							ret := 1.000000 // buy
						if( dif_source_BBupper > -51.0586 )
							if( dif_source_BBupper <= -49.4224 )
								ret := 0.500000
							if( dif_source_BBupper > -49.4224 )
								ret := 0.000000
					if( dif_source_BBlower > -3.31865 )
						if( BBlower <= 194 )
							ret := 1.000000 // buy
						if( BBlower > 194 )
							ret := 0.833333 // buy
				if( dif_source_BBupper > -47.3903 )
					if( dif_source_BBlower <= -3.22502 )
						if( BBupper <= 214.394 )
							if( dif_source_BBlower <= -15.5056 )
								ret := -0.750000 // sell
							if( dif_source_BBlower > -15.5056 )
								ret := -1.000000 // sell
						if( BBupper > 214.394 )
							if( vrsi <= 7.41207 )
								ret := 1.000000 // buy
							if( vrsi > 7.41207 )
								if( vrsi <= 53.4199 )
									ret := 0.000000
								if( vrsi > 53.4199 )
									ret := -0.666667
					if( dif_source_BBlower > -3.22502 )
						if( dif_source_BBlower <= 1.62515 )
							if( BBlower <= 186.571 )
								if( BBlower <= 90.3012 )
									ret := 0.590909
								if( BBlower > 90.3012 )
									ret := 0.965517 // buy
							if( BBlower > 186.571 )
								if( dif_source_BBupper <= -35.2174 )
									ret := 0.800000 // buy
								if( dif_source_BBupper > -35.2174 )
									ret := 0.142857
						if( dif_source_BBlower > 1.62515 )
							if( BBlower <= 91.5791 )
								if( BBlower <= 88.2856 )
									ret := 0.483871
								if( BBlower > 88.2856 )
									ret := -0.789474 // sell
							if( BBlower > 91.5791 )
								if( vrsi <= 62.025 )
									ret := 0.744186 // buy
								if( vrsi > 62.025 )
									ret := 0.052632
			if( BBlower > 202.608 )
				if( vrsi <= 18.4097 )
					ret := 0.428571
				if( vrsi > 18.4097 )
					if( BBlower <= 205.822 )
						ret := 0.000000
					if( BBlower > 205.822 )
						ret := -1.000000 // sell
		if( dif_source_BBupper > -28.1448 )
			if( BBupper <= 117.701 )
				if( dif_source_BBupper <= -0.370545 )
					if( dif_source_BBupper <= -7.51816 )
						if( vrsi <= 48.5598 )
							ret := 1.000000 // buy
						if( vrsi > 48.5598 )
							if( BBupper <= 115.022 )
								ret := 1.000000 // buy
							if( BBupper > 115.022 )
								ret := 0.400000
					if( dif_source_BBupper > -7.51816 )
						if( dif_source_BBlower <= 4.74212 )
							if( BBlower <= 115.246 )
								if( BBupper <= 113.509 )
									ret := 1.000000 // buy
								if( BBupper > 113.509 )
									ret := 0.333333
							if( BBlower > 115.246 )
								ret := 1.000000 // buy
						if( dif_source_BBlower > 4.74212 )
							if( dif_source_BBlower <= 5.20903 )
								ret := 0.000000
							if( dif_source_BBlower > 5.20903 )
								ret := 0.500000
				if( dif_source_BBupper > -0.370545 )
					if( BBupper <= 117.239 )
						if( vrsi <= 91.4095 )
							if( dif_source_BBupper <= -0.128144 )
								if( dif_source_BBupper <= -0.185013 )
									ret := -0.250000
								if( dif_source_BBupper > -0.185013 )
									ret := 0.000000
							if( dif_source_BBupper > -0.128144 )
								if( vrsi <= 69.3233 )
									ret := -0.200000
								if( vrsi > 69.3233 )
									ret := -0.600000
						if( vrsi > 91.4095 )
							ret := 0.000000
					if( BBupper > 117.239 )
						if( vrsi <= 87.9254 )
							if( dif_source_BBlower <= 2.08009 )
								if( dif_source_BBupper <= 0.170239 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > 0.170239 )
									ret := 0.000000
							if( dif_source_BBlower > 2.08009 )
								ret := 1.000000 // buy
						if( vrsi > 87.9254 )
							if( BBlower <= 116.073 )
								ret := -0.250000
							if( BBlower > 116.073 )
								ret := 0.000000
			if( BBupper > 117.701 )
				if( BBupper <= 156.505 )
					if( BBlower <= 112.218 )
						if( dif_source_BBupper <= -26.9009 )
							if( BBupper <= 124.148 )
								ret := -1.000000 // sell
							if( BBupper > 124.148 )
								if( dif_source_BBupper <= -27.5759 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -27.5759 )
									ret := 0.466667
						if( dif_source_BBupper > -26.9009 )
							if( vrsi <= 91.5885 )
								if( dif_source_BBlower <= -1.9628 )
									ret := -0.384615
								if( dif_source_BBlower > -1.9628 )
									ret := -0.824000 // sell
							if( vrsi > 91.5885 )
								ret := 0.714286 // buy
					if( BBlower > 112.218 )
						if( dif_source_BBupper <= -15.8094 )
							if( BBlower <= 135.264 )
								if( vrsi <= 48.9905 )
									ret := 0.672840
								if( vrsi > 48.9905 )
									ret := 0.254386
							if( BBlower > 135.264 )
								if( vrsi <= 4.15931 )
									ret := 0.615385
								if( vrsi > 4.15931 )
									ret := -0.545455
						if( dif_source_BBupper > -15.8094 )
							if( BBlower <= 141.735 )
								if( BBupper <= 139.45 )
									ret := 0.059375
								if( BBupper > 139.45 )
									ret := 0.155073
							if( BBlower > 141.735 )
								if( BBupper <= 154.355 )
									ret := -0.029726
								if( BBupper > 154.355 )
									ret := 0.295518
				if( BBupper > 156.505 )
					if( vrsi <= 14.5503 )
						if( BBlower <= 163.585 )
							if( dif_source_BBlower <= -1.81015 )
								if( BBupper <= 171.791 )
									ret := 0.166667
								if( BBupper > 171.791 )
									ret := 0.933333 // buy
							if( dif_source_BBlower > -1.81015 )
								if( dif_source_BBupper <= -3.09741 )
									ret := -0.184325
								if( dif_source_BBupper > -3.09741 )
									ret := 0.306122
						if( BBlower > 163.585 )
							if( BBlower <= 187.514 )
								if( BBlower <= 171.578 )
									ret := 0.288973
								if( BBlower > 171.578 )
									ret := 0.021429
							if( BBlower > 187.514 )
								if( vrsi <= 0.111005 )
									ret := 0.603774
								if( vrsi > 0.111005 )
									ret := 0.294425
					if( vrsi > 14.5503 )
						if( dif_source_BBupper <= -23.7261 )
							if( BBupper <= 215.721 )
								if( BBupper <= 192.254 )
									ret := 0.465517
								if( BBupper > 192.254 )
									ret := -0.080000
							if( BBupper > 215.721 )
								ret := 1.000000 // buy
						if( dif_source_BBupper > -23.7261 )
							if( dif_source_BBupper <= -11.9159 )
								if( BBlower <= 224.406 )
									ret := -0.087262
								if( BBlower > 224.406 )
									ret := 0.208122
							if( dif_source_BBupper > -11.9159 )
								if( BBlower <= 227.508 )
									ret := 0.038173
								if( BBlower > 227.508 )
									ret := -0.596774
	if( dif_source_BBlower > 6.11778 )
		if( BBupper <= 121.893 )
			if( vrsi <= 63.4778 )
				if( vrsi <= 58.5781 )
					if( vrsi <= 52.8467 )
						if( BBupper <= 113.755 )
							if( vrsi <= 22.7593 )
								if( BBlower <= 85.8212 )
									ret := 0.833333 // buy
								if( BBlower > 85.8212 )
									ret := 1.000000 // buy
							if( vrsi > 22.7593 )
								if( BBupper <= 110.201 )
									ret := 0.378788
								if( BBupper > 110.201 )
									ret := 0.878788 // buy
						if( BBupper > 113.755 )
							if( BBlower <= 97.1203 )
								if( BBupper <= 114.071 )
									ret := -0.733333 // sell
								if( BBupper > 114.071 )
									ret := -0.045455
							if( BBlower > 97.1203 )
								if( vrsi <= 20.655 )
									ret := 0.428571
								if( vrsi > 20.655 )
									ret := 0.953488 // buy
					if( vrsi > 52.8467 )
						if( BBupper <= 120.211 )
							if( BBupper <= 106.621 )
								if( BBupper <= 106.473 )
									ret := 1.000000 // buy
								if( BBupper > 106.473 )
									ret := 0.750000 // buy
							if( BBupper > 106.621 )
								if( BBlower <= 86.4571 )
									ret := -1.000000 // sell
								if( BBlower > 86.4571 )
									ret := -0.222222
						if( BBupper > 120.211 )
							ret := 1.000000 // buy
				if( vrsi > 58.5781 )
					if( BBupper <= 116.326 )
						if( dif_source_BBlower <= 14.8524 )
							if( BBupper <= 115.118 )
								if( dif_source_BBlower <= 12.0928 )
									ret := 0.500000
								if( dif_source_BBlower > 12.0928 )
									ret := 1.000000 // buy
							if( BBupper > 115.118 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > 14.8524 )
							if( BBlower <= 86.4172 )
								ret := 0.250000
							if( BBlower > 86.4172 )
								if( dif_source_BBupper <= -2.11676 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -2.11676 )
									ret := 0.692308
					if( BBupper > 116.326 )
						ret := 1.000000 // buy
			if( vrsi > 63.4778 )
				if( dif_source_BBupper <= -14.7523 )
					if( dif_source_BBupper <= -26.8141 )
						if( vrsi <= 86.4524 )
							ret := 1.000000 // buy
						if( vrsi > 86.4524 )
							ret := 0.000000
					if( dif_source_BBupper > -26.8141 )
						ret := 1.000000 // buy
				if( dif_source_BBupper > -14.7523 )
					if( BBlower <= 95.0659 )
						if( BBupper <= 106.455 )
							if( vrsi <= 72.4774 )
								ret := 1.000000 // buy
							if( vrsi > 72.4774 )
								ret := 0.750000 // buy
						if( BBupper > 106.455 )
							if( dif_source_BBupper <= -1.17438 )
								if( BBupper <= 108.124 )
									ret := -0.935484 // sell
								if( BBupper > 108.124 )
									ret := -0.114754
							if( dif_source_BBupper > -1.17438 )
								if( dif_source_BBupper <= 0.197082 )
									ret := -0.900000 // sell
								if( dif_source_BBupper > 0.197082 )
									ret := -1.000000 // sell
					if( BBlower > 95.0659 )
						if( dif_source_BBlower <= 8.25784 )
							if( BBlower <= 99.1536 )
								if( dif_source_BBlower <= 6.32057 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 6.32057 )
									ret := -0.400000
							if( BBlower > 99.1536 )
								if( vrsi <= 75.2254 )
									ret := -0.666667
								if( vrsi > 75.2254 )
									ret := 0.500000
						if( dif_source_BBlower > 8.25784 )
							if( dif_source_BBupper <= 2.26698 )
								if( dif_source_BBupper <= -4.12853 )
									ret := 0.000000
								if( dif_source_BBupper > -4.12853 )
									ret := 0.725806 // buy
							if( dif_source_BBupper > 2.26698 )
								if( BBlower <= 101.6 )
									ret := -1.000000 // sell
								if( BBlower > 101.6 )
									ret := 0.583333
		if( BBupper > 121.893 )
			if( vrsi <= 56.297 )
				if( dif_source_BBlower <= 27.4131 )
					if( BBlower <= 146.758 )
						if( vrsi <= 5.22253 )
							if( BBlower <= 140.695 )
								if( BBupper <= 124.661 )
									ret := -1.000000 // sell
								if( BBupper > 124.661 )
									ret := 0.611465
							if( BBlower > 140.695 )
								if( BBupper <= 164.743 )
									ret := -0.592593
								if( BBupper > 164.743 )
									ret := 1.000000 // buy
						if( vrsi > 5.22253 )
							if( BBupper <= 164.854 )
								if( BBupper <= 151.246 )
									ret := 0.027798
								if( BBupper > 151.246 )
									ret := -0.234489
							if( BBupper > 164.854 )
								if( dif_source_BBlower <= 14.5721 )
									ret := 0.619048
								if( dif_source_BBlower > 14.5721 )
									ret := 0.247312
					if( BBlower > 146.758 )
						if( BBupper <= 215.925 )
							if( vrsi <= 13.8016 )
								if( dif_source_BBupper <= -7.16054 )
									ret := 0.618182
								if( dif_source_BBupper > -7.16054 )
									ret := 0.143498
							if( vrsi > 13.8016 )
								if( dif_source_BBupper <= -7.87969 )
									ret := 0.280172
								if( dif_source_BBupper > -7.87969 )
									ret := 0.068011
						if( BBupper > 215.925 )
							if( BBupper <= 220.837 )
								if( dif_source_BBupper <= -50.0341 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -50.0341 )
									ret := -0.425397
							if( BBupper > 220.837 )
								if( BBupper <= 236.719 )
									ret := 0.197531
								if( BBupper > 236.719 )
									ret := -0.146707
				if( dif_source_BBlower > 27.4131 )
					if( dif_source_BBupper <= -0.705035 )
						if( BBupper <= 212.073 )
							if( BBupper <= 182.858 )
								if( vrsi <= 18.8223 )
									ret := 0.571429
								if( vrsi > 18.8223 )
									ret := -0.375000
							if( BBupper > 182.858 )
								if( dif_source_BBupper <= -2.79505 )
									ret := 0.838710 // buy
								if( dif_source_BBupper > -2.79505 )
									ret := 0.000000
						if( BBupper > 212.073 )
							if( BBlower <= 163.278 )
								if( dif_source_BBupper <= -17.9784 )
									ret := -0.250000
								if( dif_source_BBupper > -17.9784 )
									ret := -0.969697 // sell
							if( BBlower > 163.278 )
								if( dif_source_BBlower <= 29.4658 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 29.4658 )
									ret := 0.000000
					if( dif_source_BBupper > -0.705035 )
						if( BBlower <= 160.365 )
							if( BBlower <= 123.769 )
								if( BBupper <= 143.464 )
									ret := -0.666667
								if( BBupper > 143.464 )
									ret := -0.923077 // sell
							if( BBlower > 123.769 )
								ret := -1.000000 // sell
						if( BBlower > 160.365 )
							if( vrsi <= 31.5945 )
								ret := 0.200000
							if( vrsi > 31.5945 )
								if( BBupper <= 194.737 )
									ret := -0.777778 // sell
								if( BBupper > 194.737 )
									ret := -1.000000 // sell
			if( vrsi > 56.297 )
				if( dif_source_BBupper <= -45.0264 )
					if( dif_source_BBupper <= -45.2577 )
						ret := 1.000000 // buy
					if( dif_source_BBupper > -45.2577 )
						ret := 0.750000 // buy
				if( dif_source_BBupper > -45.0264 )
					if( BBlower <= 133.551 )
						if( dif_source_BBupper <= -12.5893 )
							if( dif_source_BBlower <= 8.9861 )
								if( BBlower <= 129.791 )
									ret := 0.063158
								if( BBlower > 129.791 )
									ret := -0.642857
							if( dif_source_BBlower > 8.9861 )
								if( dif_source_BBlower <= 12.2296 )
									ret := -0.824561 // sell
								if( dif_source_BBlower > 12.2296 )
									ret := 0.000000
						if( dif_source_BBupper > -12.5893 )
							if( BBupper <= 133.295 )
								if( dif_source_BBlower <= 6.36108 )
									ret := 0.375000
								if( dif_source_BBlower > 6.36108 )
									ret := -0.136876
							if( BBupper > 133.295 )
								if( dif_source_BBlower <= 33.5895 )
									ret := 0.231381
								if( dif_source_BBlower > 33.5895 )
									ret := -0.750000 // sell
					if( BBlower > 133.551 )
						if( BBlower <= 147.644 )
							if( dif_source_BBupper <= 3.10483 )
								if( BBupper <= 155.001 )
									ret := -0.086233
								if( BBupper > 155.001 )
									ret := -0.301173
							if( dif_source_BBupper > 3.10483 )
								if( dif_source_BBlower <= 22.0984 )
									ret := 0.481013
								if( dif_source_BBlower > 22.0984 )
									ret := -0.909091 // sell
						if( BBlower > 147.644 )
							if( BBlower <= 154.496 )
								if( dif_source_BBlower <= 10.948 )
									ret := 0.311620
								if( dif_source_BBlower > 10.948 )
									ret := -0.020576
							if( BBlower > 154.496 )
								if( dif_source_BBlower <= 41.9025 )
									ret := -0.069835
								if( dif_source_BBlower > 41.9025 )
									ret := -0.708333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_FFIV_15Min_e24f2d1a(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


