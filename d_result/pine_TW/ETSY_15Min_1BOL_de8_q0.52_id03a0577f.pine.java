//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: ETSY_15Min_1BOL_03a0577f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_1BOL_03a0577f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_03a0577f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 52.6269 )
		if( BBlower <= 50.6248 )
			if( dif_source_BBupper <= -8.82661 )
				if( dif_source_BBupper <= -15.1249 )
					if( BBlower <= 37.1809 )
						if( BBupper <= 56.1022 )
							if( vrsi <= 27.6887 )
								if( dif_source_BBlower <= 0.310564 )
									ret := 0.939394 // buy
								if( dif_source_BBlower > 0.310564 )
									ret := 0.642857
							if( vrsi > 27.6887 )
								ret := -0.400000
						if( BBupper > 56.1022 )
							ret := 1.000000 // buy
					if( BBlower > 37.1809 )
						if( BBlower <= 39.1226 )
							if( dif_source_BBlower <= 3.23405 )
								if( BBlower <= 37.2526 )
									ret := 1.000000 // buy
								if( BBlower > 37.2526 )
									ret := 0.200000
							if( dif_source_BBlower > 3.23405 )
								if( dif_source_BBupper <= -18.747 )
									ret := -0.100000
								if( dif_source_BBupper > -18.747 )
									ret := -0.969697 // sell
						if( BBlower > 39.1226 )
							if( vrsi <= 44.7296 )
								if( BBupper <= 65.6283 )
									ret := 0.457143
								if( BBupper > 65.6283 )
									ret := -0.177778
							if( vrsi > 44.7296 )
								if( dif_source_BBupper <= -17.9628 )
									ret := -0.821429 // sell
								if( dif_source_BBupper > -17.9628 )
									ret := 0.000000
				if( dif_source_BBupper > -15.1249 )
					if( BBupper <= 45.7842 )
						if( dif_source_BBlower <= 3.17035 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 3.17035 )
							ret := 0.250000
					if( BBupper > 45.7842 )
						if( BBupper <= 48.1966 )
							if( vrsi <= 45.3243 )
								if( vrsi <= 19.1609 )
									ret := 0.000000
								if( vrsi > 19.1609 )
									ret := -1.000000 // sell
							if( vrsi > 45.3243 )
								ret := 0.250000
						if( BBupper > 48.1966 )
							if( vrsi <= 45.2631 )
								if( BBupper <= 48.96 )
									ret := 0.454545
								if( BBupper > 48.96 )
									ret := -0.417219
							if( vrsi > 45.2631 )
								if( dif_source_BBlower <= 4.54124 )
									ret := 0.393939
								if( dif_source_BBlower > 4.54124 )
									ret := -0.500000
			if( dif_source_BBupper > -8.82661 )
				if( BBupper <= 53.6985 )
					if( BBupper <= 52.7572 )
						if( dif_source_BBupper <= 0.487263 )
							if( vrsi <= 9.98769 )
								if( BBlower <= 16.3183 )
									ret := 0.138298
								if( BBlower > 16.3183 )
									ret := 0.332865
							if( vrsi > 9.98769 )
								if( BBlower <= 44.1023 )
									ret := 0.100875
								if( BBlower > 44.1023 )
									ret := 0.236264
						if( dif_source_BBupper > 0.487263 )
							if( BBupper <= 49.6163 )
								if( dif_source_BBupper <= 1.56288 )
									ret := 0.000000
								if( dif_source_BBupper > 1.56288 )
									ret := -0.687500
							if( BBupper > 49.6163 )
								if( dif_source_BBupper <= 0.649273 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > 0.649273 )
									ret := -1.000000 // sell
					if( BBupper > 52.7572 )
						if( dif_source_BBlower <= 8.56508 )
							if( vrsi <= 50.6785 )
								if( vrsi <= 44.0598 )
									ret := -0.223729
								if( vrsi > 44.0598 )
									ret := 0.157143
							if( vrsi > 50.6785 )
								if( dif_source_BBupper <= -5.06727 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -5.06727 )
									ret := -0.375000
						if( dif_source_BBlower > 8.56508 )
							if( BBlower <= 41.4115 )
								ret := 1.000000 // buy
							if( BBlower > 41.4115 )
								ret := 0.500000
				if( BBupper > 53.6985 )
					if( BBlower <= 37.4484 )
						if( vrsi <= 28.3542 )
							if( dif_source_BBupper <= -4.61246 )
								ret := 0.500000
							if( dif_source_BBupper > -4.61246 )
								ret := -0.166667
						if( vrsi > 28.3542 )
							if( BBupper <= 55.2185 )
								if( BBlower <= 33.9196 )
									ret := 0.250000
								if( BBlower > 33.9196 )
									ret := 0.000000
							if( BBupper > 55.2185 )
								if( dif_source_BBlower <= 16.893 )
									ret := 0.958333 // buy
								if( dif_source_BBlower > 16.893 )
									ret := 0.677419
					if( BBlower > 37.4484 )
						if( dif_source_BBlower <= 10.9186 )
							if( BBupper <= 59.2563 )
								if( dif_source_BBlower <= 10.4296 )
									ret := 0.236431
								if( dif_source_BBlower > 10.4296 )
									ret := 0.804348 // buy
							if( BBupper > 59.2563 )
								if( dif_source_BBupper <= -3.04369 )
									ret := 0.797468 // buy
								if( dif_source_BBupper > -3.04369 )
									ret := 0.358491
						if( dif_source_BBlower > 10.9186 )
							if( BBupper <= 57.8825 )
								if( dif_source_BBupper <= -2.28003 )
									ret := 0.583333
								if( dif_source_BBupper > -2.28003 )
									ret := -0.052632
							if( BBupper > 57.8825 )
								if( BBupper <= 62.4969 )
									ret := -0.491228
								if( BBupper > 62.4969 )
									ret := 0.257143
		if( BBlower > 50.6248 )
			if( dif_source_BBlower <= 12.6954 )
				if( dif_source_BBupper <= -2.98787 )
					if( BBlower <= 112.197 )
						if( dif_source_BBupper <= -18.5774 )
							if( BBupper <= 120.179 )
								if( dif_source_BBupper <= -22.7039 )
									ret := 0.684211
								if( dif_source_BBupper > -22.7039 )
									ret := 0.121457
							if( BBupper > 120.179 )
								if( vrsi <= 12.1845 )
									ret := 0.350000
								if( vrsi > 12.1845 )
									ret := 0.674419
						if( dif_source_BBupper > -18.5774 )
							if( dif_source_BBupper <= -8.54576 )
								if( vrsi <= 10.8906 )
									ret := 0.189310
								if( vrsi > 10.8906 )
									ret := -0.046320
							if( dif_source_BBupper > -8.54576 )
								if( BBlower <= 57.8107 )
									ret := -0.004227
								if( BBlower > 57.8107 )
									ret := 0.141321
					if( BBlower > 112.197 )
						if( BBlower <= 117.176 )
							if( dif_source_BBupper <= -32.27 )
								if( dif_source_BBlower <= 4.76013 )
									ret := 0.666667
								if( dif_source_BBlower > 4.76013 )
									ret := 0.944444 // buy
							if( dif_source_BBupper > -32.27 )
								if( dif_source_BBupper <= -5.26867 )
									ret := -0.316949
								if( dif_source_BBupper > -5.26867 )
									ret := 0.026549
						if( BBlower > 117.176 )
							if( vrsi <= 20.3957 )
								if( BBlower <= 119.48 )
									ret := 0.574074
								if( BBlower > 119.48 )
									ret := 0.132099
							if( vrsi > 20.3957 )
								if( dif_source_BBlower <= -5.28494 )
									ret := 0.709091 // buy
								if( dif_source_BBlower > -5.28494 )
									ret := -0.006294
				if( dif_source_BBupper > -2.98787 )
					if( BBlower <= 102.226 )
						if( BBlower <= 100.914 )
							if( dif_source_BBlower <= 10.7256 )
								if( dif_source_BBupper <= -2.17763 )
									ret := -0.047822
								if( dif_source_BBupper > -2.17763 )
									ret := 0.026466
							if( dif_source_BBlower > 10.7256 )
								if( vrsi <= 32.33 )
									ret := 0.615385
								if( vrsi > 32.33 )
									ret := 0.115044
						if( BBlower > 100.914 )
							if( dif_source_BBlower <= 10.9592 )
								if( BBupper <= 113.648 )
									ret := 0.507576
								if( BBupper > 113.648 )
									ret := -0.250000
							if( dif_source_BBlower > 10.9592 )
								ret := -0.800000 // sell
					if( BBlower > 102.226 )
						if( BBlower <= 109.76 )
							if( vrsi <= 49.3237 )
								if( BBlower <= 106.523 )
									ret := -0.450549
								if( BBlower > 106.523 )
									ret := -0.886792 // sell
							if( vrsi > 49.3237 )
								if( dif_source_BBupper <= -1.47179 )
									ret := -0.214286
								if( dif_source_BBupper > -1.47179 )
									ret := 0.750000 // buy
						if( BBlower > 109.76 )
							if( BBlower <= 111.874 )
								if( BBupper <= 121.8 )
									ret := -0.095238
								if( BBupper > 121.8 )
									ret := 0.409091
							if( BBlower > 111.874 )
								if( BBupper <= 139.162 )
									ret := -0.325581
								if( BBupper > 139.162 )
									ret := -0.155556
			if( dif_source_BBlower > 12.6954 )
				if( BBupper <= 225.243 )
					if( vrsi <= 41.8392 )
						if( BBlower <= 197.268 )
							if( BBlower <= 196.912 )
								if( dif_source_BBupper <= -12.3745 )
									ret := 0.460526
								if( dif_source_BBupper > -12.3745 )
									ret := 0.187348
							if( BBlower > 196.912 )
								if( dif_source_BBupper <= -0.49631 )
									ret := -0.444444
								if( dif_source_BBupper > -0.49631 )
									ret := -1.000000 // sell
						if( BBlower > 197.268 )
							if( dif_source_BBupper <= -4.46931 )
								if( vrsi <= 1.33359 )
									ret := 0.800000 // buy
								if( vrsi > 1.33359 )
									ret := 0.171429
							if( dif_source_BBupper > -4.46931 )
								if( dif_source_BBupper <= 0.211981 )
									ret := 0.894737 // buy
								if( dif_source_BBupper > 0.211981 )
									ret := 0.000000
					if( vrsi > 41.8392 )
						if( BBupper <= 86.2114 )
							if( dif_source_BBlower <= 17.501 )
								if( BBlower <= 58.8101 )
									ret := 0.368421
								if( BBlower > 58.8101 )
									ret := 0.738462 // buy
							if( dif_source_BBlower > 17.501 )
								if( vrsi <= 49.412 )
									ret := -0.250000
								if( vrsi > 49.412 )
									ret := -1.000000 // sell
						if( BBupper > 86.2114 )
							if( BBlower <= 159.481 )
								if( BBlower <= 120.127 )
									ret := 0.040516
								if( BBlower > 120.127 )
									ret := -0.272727
							if( BBlower > 159.481 )
								if( BBupper <= 194.529 )
									ret := 0.565217
								if( BBupper > 194.529 )
									ret := 0.169492
				if( BBupper > 225.243 )
					if( dif_source_BBupper <= -42.6761 )
						if( BBlower <= 198.799 )
							if( dif_source_BBlower <= 17.349 )
								ret := -0.600000
							if( dif_source_BBlower > 17.349 )
								if( vrsi <= 44.1973 )
									ret := 0.200000
								if( vrsi > 44.1973 )
									ret := 0.941176 // buy
						if( BBlower > 198.799 )
							if( dif_source_BBlower <= 13.5213 )
								ret := 0.750000 // buy
							if( dif_source_BBlower > 13.5213 )
								ret := 1.000000 // buy
					if( dif_source_BBupper > -42.6761 )
						if( BBlower <= 273.746 )
							if( dif_source_BBupper <= -30.263 )
								if( vrsi <= 48.3658 )
									ret := -0.698630
								if( vrsi > 48.3658 )
									ret := 0.200000
							if( dif_source_BBupper > -30.263 )
								if( dif_source_BBlower <= 18.072 )
									ret := -0.310345
								if( dif_source_BBlower > 18.072 )
									ret := -0.025994
						if( BBlower > 273.746 )
							ret := 1.000000 // buy
	if( vrsi > 52.6269 )
		if( BBlower <= 266.94 )
			if( BBlower <= 241.393 )
				if( BBlower <= 217.463 )
					if( BBupper <= 257.689 )
						if( vrsi <= 74.5934 )
							if( BBupper <= 12.8394 )
								if( BBlower <= 10.4186 )
									ret := 0.132479
								if( BBlower > 10.4186 )
									ret := 0.623853
							if( BBupper > 12.8394 )
								if( dif_source_BBupper <= -0.87568 )
									ret := 0.047275
								if( dif_source_BBupper > -0.87568 )
									ret := -0.016817
						if( vrsi > 74.5934 )
							if( dif_source_BBupper <= -0.077057 )
								if( dif_source_BBupper <= -5.90067 )
									ret := -0.040161
								if( dif_source_BBupper > -5.90067 )
									ret := 0.021959
							if( dif_source_BBupper > -0.077057 )
								if( dif_source_BBupper <= 4.22656 )
									ret := -0.084065
								if( dif_source_BBupper > 4.22656 )
									ret := 0.165746
					if( BBupper > 257.689 )
						if( dif_source_BBlower <= 30.2843 )
							if( BBupper <= 260.135 )
								if( BBlower <= 177.786 )
									ret := 0.800000 // buy
								if( BBlower > 177.786 )
									ret := 1.000000 // buy
							if( BBupper > 260.135 )
								if( dif_source_BBlower <= 23.2614 )
									ret := 0.321429
								if( dif_source_BBlower > 23.2614 )
									ret := 0.782609 // buy
						if( dif_source_BBlower > 30.2843 )
							ret := -0.750000 // sell
				if( BBlower > 217.463 )
					if( dif_source_BBlower <= 4.54625 )
						if( vrsi <= 70.5539 )
							if( BBupper <= 249.209 )
								if( BBlower <= 223.502 )
									ret := 0.000000
								if( BBlower > 223.502 )
									ret := 0.600000
							if( BBupper > 249.209 )
								if( BBlower <= 236.485 )
									ret := 0.761905 // buy
								if( BBlower > 236.485 )
									ret := 0.000000
						if( vrsi > 70.5539 )
							if( BBupper <= 251.83 )
								ret := 0.000000
							if( BBupper > 251.83 )
								if( BBlower <= 236.759 )
									ret := -0.250000
								if( BBlower > 236.759 )
									ret := -1.000000 // sell
					if( dif_source_BBlower > 4.54625 )
						if( dif_source_BBupper <= -43.0684 )
							if( dif_source_BBupper <= -67.8303 )
								ret := -0.500000
							if( dif_source_BBupper > -67.8303 )
								ret := -1.000000 // sell
						if( dif_source_BBupper > -43.0684 )
							if( BBlower <= 229.085 )
								if( dif_source_BBupper <= -5.06198 )
									ret := -0.581699
								if( dif_source_BBupper > -5.06198 )
									ret := -0.043011
							if( BBlower > 229.085 )
								if( BBupper <= 267.281 )
									ret := -0.173913
								if( BBupper > 267.281 )
									ret := 0.343750
			if( BBlower > 241.393 )
				if( BBupper <= 302.321 )
					if( BBlower <= 246.165 )
						if( dif_source_BBlower <= 8.26693 )
							ret := 0.000000
						if( dif_source_BBlower > 8.26693 )
							if( dif_source_BBupper <= 3.80025 )
								if( vrsi <= 72.4552 )
									ret := 0.692308
								if( vrsi > 72.4552 )
									ret := 0.976190 // buy
							if( dif_source_BBupper > 3.80025 )
								ret := 0.000000
					if( BBlower > 246.165 )
						if( BBlower <= 258.772 )
							if( dif_source_BBupper <= -11.0732 )
								ret := 0.500000
							if( dif_source_BBupper > -11.0732 )
								ret := 0.000000
						if( BBlower > 258.772 )
							if( dif_source_BBupper <= -2.22466 )
								if( dif_source_BBupper <= -5.74991 )
									ret := 0.500000
								if( dif_source_BBupper > -5.74991 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -2.22466 )
								ret := -0.200000
				if( BBupper > 302.321 )
					if( dif_source_BBupper <= -55.0755 )
						ret := -0.750000 // sell
					if( dif_source_BBupper > -55.0755 )
						ret := -1.000000 // sell
		if( BBlower > 266.94 )
			if( dif_source_BBlower <= 6.46675 )
				if( dif_source_BBlower <= 4.40829 )
					ret := 0.666667
				if( dif_source_BBlower > 4.40829 )
					if( vrsi <= 68.9873 )
						ret := 0.000000
					if( vrsi > 68.9873 )
						ret := 0.250000
			if( dif_source_BBlower > 6.46675 )
				if( dif_source_BBlower <= 13.6041 )
					if( dif_source_BBupper <= -13.3856 )
						if( BBlower <= 272.337 )
							ret := -1.000000 // sell
						if( BBlower > 272.337 )
							if( BBlower <= 273.79 )
								if( BBlower <= 273.647 )
									ret := -0.538462
								if( BBlower > 273.647 )
									ret := 0.200000
							if( BBlower > 273.79 )
								ret := -1.000000 // sell
					if( dif_source_BBupper > -13.3856 )
						ret := -1.000000 // sell
				if( dif_source_BBlower > 13.6041 )
					if( dif_source_BBupper <= -2.55432 )
						if( dif_source_BBlower <= 15.4459 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 15.4459 )
							if( dif_source_BBlower <= 26.2953 )
								if( BBlower <= 272.716 )
									ret := -1.000000 // sell
								if( BBlower > 272.716 )
									ret := 0.153846
							if( dif_source_BBlower > 26.2953 )
								ret := 0.500000
					if( dif_source_BBupper > -2.55432 )
						if( vrsi <= 93.2505 )
							if( dif_source_BBupper <= -1.11767 )
								ret := -0.833333 // sell
							if( dif_source_BBupper > -1.11767 )
								ret := -0.166667
						if( vrsi > 93.2505 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ETSY_15Min_03a0577f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


