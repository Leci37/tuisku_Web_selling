//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: PTON_15Min_1BOL_a3c3aabb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_1BOL_a3c3aabb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_a3c3aabb(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( vrsi <= 47.023 )
		if( BBupper <= 117.642 )
			if( BBlower <= 4.28065 )
				if( dif_source_BBlower <= 0.437683 )
					if( BBupper <= 4.7362 )
						if( BBupper <= 3.7166 )
							if( dif_source_BBupper <= -0.144263 )
								if( BBlower <= 3.47382 )
									ret := 0.169554
								if( BBlower > 3.47382 )
									ret := -1.000000 // sell
							if( dif_source_BBupper > -0.144263 )
								if( vrsi <= 45.7462 )
									ret := 0.395408
								if( vrsi > 45.7462 )
									ret := 0.000000
						if( BBupper > 3.7166 )
							if( BBupper <= 4.42878 )
								if( vrsi <= 40.0092 )
									ret := 0.107735
								if( vrsi > 40.0092 )
									ret := -0.334448
							if( BBupper > 4.42878 )
								if( dif_source_BBupper <= -0.591494 )
									ret := 0.941176 // buy
								if( dif_source_BBupper > -0.591494 )
									ret := 0.222947
					if( BBupper > 4.7362 )
						if( dif_source_BBupper <= -0.377823 )
							if( dif_source_BBupper <= -1.06968 )
								if( BBlower <= 3.97282 )
									ret := -0.200000
								if( BBlower > 3.97282 )
									ret := 0.388889
							if( dif_source_BBupper > -1.06968 )
								if( dif_source_BBlower <= 0.026188 )
									ret := 0.375000
								if( dif_source_BBlower > 0.026188 )
									ret := 0.694215
						if( dif_source_BBupper > -0.377823 )
							if( BBlower <= 4.20869 )
								if( BBlower <= 4.19546 )
									ret := 0.642857
								if( BBlower > 4.19546 )
									ret := 0.785714 // buy
							if( BBlower > 4.20869 )
								if( vrsi <= 22.9991 )
									ret := 0.529412
								if( vrsi > 22.9991 )
									ret := 0.000000
				if( dif_source_BBlower > 0.437683 )
					ret := 0.022593
			if( BBlower > 4.28065 )
				if( dif_source_BBupper <= -2.05739 )
					if( dif_source_BBlower <= 9.65806 )
						if( BBupper <= 11.1003 )
							if( BBupper <= 8.05827 )
								if( BBlower <= 5.14288 )
									ret := 0.833333 // buy
								if( BBlower > 5.14288 )
									ret := -0.036364
							if( BBupper > 8.05827 )
								if( dif_source_BBlower <= 0.226703 )
									ret := 0.829457 // buy
								if( dif_source_BBlower > 0.226703 )
									ret := 0.301587
						if( BBupper > 11.1003 )
							if( dif_source_BBupper <= -2.85835 )
								if( dif_source_BBlower <= -10.866 )
									ret := -0.976744 // sell
								if( dif_source_BBlower > -10.866 )
									ret := 0.117595
							if( dif_source_BBupper > -2.85835 )
								if( dif_source_BBupper <= -2.06395 )
									ret := 0.023432
								if( dif_source_BBupper > -2.06395 )
									ret := 0.562500
					if( dif_source_BBlower > 9.65806 )
						if( vrsi <= 21.2473 )
							if( dif_source_BBupper <= -4.46888 )
								if( dif_source_BBlower <= 9.90403 )
									ret := -0.583333
								if( dif_source_BBlower > 9.90403 )
									ret := 0.491228
							if( dif_source_BBupper > -4.46888 )
								if( dif_source_BBlower <= 15.4869 )
									ret := -0.269231
								if( dif_source_BBlower > 15.4869 )
									ret := 0.437500
						if( vrsi > 21.2473 )
							if( BBlower <= 71.7517 )
								if( dif_source_BBupper <= -39.4164 )
									ret := -0.843750 // sell
								if( dif_source_BBupper > -39.4164 )
									ret := 0.059701
							if( BBlower > 71.7517 )
								if( dif_source_BBlower <= 13.2892 )
									ret := -0.400749
								if( dif_source_BBlower > 13.2892 )
									ret := -0.788136 // sell
				if( dif_source_BBupper > -2.05739 )
					if( dif_source_BBlower <= -0.246722 )
						if( vrsi <= 0.475583 )
							ret := 0.400000
						if( vrsi > 0.475583 )
							if( dif_source_BBlower <= -0.362378 )
								if( BBupper <= 9.33949 )
									ret := -0.830189 // sell
								if( BBupper > 9.33949 )
									ret := -0.075472
							if( dif_source_BBlower > -0.362378 )
								if( dif_source_BBupper <= -1.74253 )
									ret := 0.023256
								if( dif_source_BBupper > -1.74253 )
									ret := -0.627451
					if( dif_source_BBlower > -0.246722 )
						if( dif_source_BBupper <= -0.592768 )
							if( BBupper <= 10.2435 )
								if( BBlower <= 6.10456 )
									ret := -0.054656
								if( BBlower > 6.10456 )
									ret := 0.107301
							if( BBupper > 10.2435 )
								if( dif_source_BBupper <= -2.05301 )
									ret := -0.700000 // sell
								if( dif_source_BBupper > -2.05301 )
									ret := -0.029536
						if( dif_source_BBupper > -0.592768 )
							if( BBlower <= 7.34713 )
								if( dif_source_BBupper <= -0.241297 )
									ret := 0.070492
								if( dif_source_BBupper > -0.241297 )
									ret := -0.141357
							if( BBlower > 7.34713 )
								if( BBupper <= 11.8584 )
									ret := 0.273249
								if( BBupper > 11.8584 )
									ret := 0.049420
		if( BBupper > 117.642 )
			if( dif_source_BBupper <= -28.7686 )
				if( dif_source_BBupper <= -37.8702 )
					if( vrsi <= 9.51077 )
						ret := 0.818182 // buy
					if( vrsi > 9.51077 )
						ret := 1.000000 // buy
				if( dif_source_BBupper > -37.8702 )
					if( dif_source_BBupper <= -34.1562 )
						if( dif_source_BBupper <= -35.6719 )
							ret := -0.750000 // sell
						if( dif_source_BBupper > -35.6719 )
							ret := -0.333333
					if( dif_source_BBupper > -34.1562 )
						if( BBupper <= 133.235 )
							if( vrsi <= 29.8407 )
								if( vrsi <= 17.3867 )
									ret := 0.800000 // buy
								if( vrsi > 17.3867 )
									ret := -0.117647
							if( vrsi > 29.8407 )
								ret := 1.000000 // buy
						if( BBupper > 133.235 )
							if( dif_source_BBlower <= -1.89575 )
								ret := 0.933333 // buy
							if( dif_source_BBlower > -1.89575 )
								if( dif_source_BBlower <= 6.24727 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > 6.24727 )
									ret := 0.421053
			if( dif_source_BBupper > -28.7686 )
				if( vrsi <= 14.6082 )
					if( BBlower <= 142.922 )
						if( dif_source_BBlower <= 1.79502 )
							if( BBupper <= 128.514 )
								if( BBupper <= 124.652 )
									ret := 0.298701
								if( BBupper > 124.652 )
									ret := 0.662162
							if( BBupper > 128.514 )
								if( BBlower <= 141.191 )
									ret := -0.264151
								if( BBlower > 141.191 )
									ret := 0.944444 // buy
						if( dif_source_BBlower > 1.79502 )
							if( vrsi <= 3.5179 )
								if( vrsi <= 0.441533 )
									ret := -0.142857
								if( vrsi > 0.441533 )
									ret := -0.466667
							if( vrsi > 3.5179 )
								if( vrsi <= 7.55719 )
									ret := 0.397959
								if( vrsi > 7.55719 )
									ret := -0.013100
					if( BBlower > 142.922 )
						if( dif_source_BBupper <= -13.5947 )
							if( BBlower <= 149.221 )
								if( dif_source_BBupper <= -16.0645 )
									ret := 0.230769
								if( dif_source_BBupper > -16.0645 )
									ret := 0.400000
							if( BBlower > 149.221 )
								ret := 0.000000
						if( dif_source_BBupper > -13.5947 )
							if( BBupper <= 166.575 )
								if( dif_source_BBupper <= -5.74055 )
									ret := -0.580000
								if( dif_source_BBupper > -5.74055 )
									ret := -0.125000
							if( BBupper > 166.575 )
								ret := -0.842105 // sell
				if( vrsi > 14.6082 )
					if( BBlower <= 108.456 )
						if( dif_source_BBupper <= -25.3286 )
							if( dif_source_BBupper <= -27.0555 )
								if( dif_source_BBlower <= 1.79484 )
									ret := -0.888889 // sell
								if( dif_source_BBlower > 1.79484 )
									ret := -1.000000 // sell
							if( dif_source_BBupper > -27.0555 )
								if( BBlower <= 104.054 )
									ret := -0.906250 // sell
								if( BBlower > 104.054 )
									ret := 0.000000
						if( dif_source_BBupper > -25.3286 )
							if( BBlower <= 95.8595 )
								if( vrsi <= 37.5247 )
									ret := 0.648649
								if( vrsi > 37.5247 )
									ret := -0.352941
							if( BBlower > 95.8595 )
								if( dif_source_BBlower <= 3.48058 )
									ret := 0.009346
								if( dif_source_BBlower > 3.48058 )
									ret := -0.443775
					if( BBlower > 108.456 )
						if( dif_source_BBupper <= -21.2995 )
							if( dif_source_BBlower <= -3.09508 )
								ret := 0.916667 // buy
							if( dif_source_BBlower > -3.09508 )
								if( BBupper <= 147.764 )
									ret := 0.000000
								if( BBupper > 147.764 )
									ret := 0.489796
						if( dif_source_BBupper > -21.2995 )
							if( BBupper <= 123.463 )
								if( vrsi <= 16.8164 )
									ret := -0.257143
								if( vrsi > 16.8164 )
									ret := 0.296651
							if( BBupper > 123.463 )
								ret := -0.101037
	if( vrsi > 47.023 )
		if( BBlower <= 148.604 )
			if( dif_source_BBupper <= -0.24884 )
				if( vrsi <= 93.7563 )
					if( crossover_rsi_bblowerInt <= 0.5 )
						if( BBlower <= 42.624 )
							if( dif_source_BBlower <= 0.045558 )
								if( BBlower <= 41.4869 )
									ret := 0.092827
								if( BBlower > 41.4869 )
									ret := -0.681818
							if( dif_source_BBlower > 0.045558 )
								if( BBlower <= 30.1595 )
									ret := -0.068834
								if( BBlower > 30.1595 )
									ret := -0.188131
						if( BBlower > 42.624 )
							if( BBlower <= 88.48 )
								if( BBupper <= 105.943 )
									ret := 0.070866
								if( BBupper > 105.943 )
									ret := -0.905660 // sell
							if( BBlower > 88.48 )
								if( BBlower <= 88.9757 )
									ret := -0.582418
								if( BBlower > 88.9757 )
									ret := -0.049529
					if( crossover_rsi_bblowerInt > 0.5 )
						if( BBupper <= 80.3631 )
							if( dif_source_BBlower <= 0.302058 )
								if( BBlower <= 23.5995 )
									ret := -0.173077
								if( BBlower > 23.5995 )
									ret := 0.444444
							if( dif_source_BBlower > 0.302058 )
								ret := -0.875000 // sell
						if( BBupper > 80.3631 )
							ret := 0.150000
				if( vrsi > 93.7563 )
					if( vrsi <= 99.9388 )
						if( vrsi <= 95.3572 )
							if( dif_source_BBlower <= 1.26051 )
								if( dif_source_BBupper <= -0.731185 )
									ret := -0.696078
								if( dif_source_BBupper > -0.731185 )
									ret := -0.945455 // sell
							if( dif_source_BBlower > 1.26051 )
								if( BBupper <= 26.1228 )
									ret := 0.300000
								if( BBupper > 26.1228 )
									ret := -0.198630
						if( vrsi > 95.3572 )
							if( vrsi <= 96.0186 )
								if( vrsi <= 95.8365 )
									ret := 0.054795
								if( vrsi > 95.8365 )
									ret := 0.518519
							if( vrsi > 96.0186 )
								if( BBupper <= 11.4127 )
									ret := -0.477941
								if( BBupper > 11.4127 )
									ret := -0.201681
					if( vrsi > 99.9388 )
						if( BBlower <= 18.8938 )
							if( BBlower <= 10.8908 )
								if( dif_source_BBlower <= 0.360799 )
									ret := -0.409396
								if( dif_source_BBlower > 0.360799 )
									ret := 0.085890
							if( BBlower > 10.8908 )
								if( dif_source_BBupper <= -1.63248 )
									ret := -0.318182
								if( dif_source_BBupper > -1.63248 )
									ret := -0.759259 // sell
						if( BBlower > 18.8938 )
							if( BBupper <= 28.8503 )
								if( dif_source_BBlower <= 1.91118 )
									ret := 0.877193 // buy
								if( dif_source_BBlower > 1.91118 )
									ret := 0.378378
							if( BBupper > 28.8503 )
								if( BBupper <= 33.5523 )
									ret := -0.318681
								if( BBupper > 33.5523 )
									ret := 0.268382
			if( dif_source_BBupper > -0.24884 )
				if( dif_source_BBupper <= 0.504031 )
					if( BBlower <= 7.12597 )
						if( dif_source_BBlower <= 0.402936 )
							if( vrsi <= 90.9985 )
								if( dif_source_BBlower <= 0.399126 )
									ret := 0.084345
								if( dif_source_BBlower > 0.399126 )
									ret := 0.571429
							if( vrsi > 90.9985 )
								if( BBupper <= 3.52807 )
									ret := -0.706522 // sell
								if( BBupper > 3.52807 )
									ret := -0.149068
						if( dif_source_BBlower > 0.402936 )
							if( vrsi <= 58.5352 )
								if( vrsi <= 58.3324 )
									ret := -0.053296
								if( vrsi > 58.3324 )
									ret := 0.675676
							if( vrsi > 58.5352 )
								if( dif_source_BBlower <= 1.20625 )
									ret := -0.152004
								if( dif_source_BBlower > 1.20625 )
									ret := -0.346420
					if( BBlower > 7.12597 )
						if( vrsi <= 53.6052 )
							if( dif_source_BBlower <= 1.47041 )
								if( BBupper <= 9.35657 )
									ret := -0.097222
								if( BBupper > 9.35657 )
									ret := 0.500000
							if( dif_source_BBlower > 1.47041 )
								if( vrsi <= 53.3668 )
									ret := -0.159251
								if( vrsi > 53.3668 )
									ret := -0.941176 // sell
						if( vrsi > 53.6052 )
							if( dif_source_BBupper <= 0.076158 )
								if( BBupper <= 8.75125 )
									ret := 0.374046
								if( BBupper > 8.75125 )
									ret := 0.114692
							if( dif_source_BBupper > 0.076158 )
								if( dif_source_BBlower <= 8.30814 )
									ret := -0.035924
								if( dif_source_BBlower > 8.30814 )
									ret := 0.153527
				if( dif_source_BBupper > 0.504031 )
					if( dif_source_BBupper <= 0.598475 )
						if( dif_source_BBupper <= 0.595906 )
							if( BBupper <= 4.03903 )
								ret := 1.000000 // buy
							if( BBupper > 4.03903 )
								if( vrsi <= 97.4526 )
									ret := 0.224719
								if( vrsi > 97.4526 )
									ret := 0.535714
						if( dif_source_BBupper > 0.595906 )
							ret := 1.000000 // buy
					if( dif_source_BBupper > 0.598475 )
						if( BBlower <= 125.527 )
							if( BBupper <= 123.254 )
								if( dif_source_BBlower <= 3.03768 )
									ret := 0.591837
								if( dif_source_BBlower > 3.03768 )
									ret := 0.033627
							if( BBupper > 123.254 )
								if( vrsi <= 89.7418 )
									ret := -0.550562
								if( vrsi > 89.7418 )
									ret := -0.814815 // sell
						if( BBlower > 125.527 )
							if( dif_source_BBlower <= 21.4145 )
								if( BBupper <= 150.456 )
									ret := 0.666667
								if( BBupper > 150.456 )
									ret := 0.025974
							if( dif_source_BBlower > 21.4145 )
								if( BBupper <= 157.202 )
									ret := 0.709091 // buy
								if( BBupper > 157.202 )
									ret := 0.166667
		if( BBlower > 148.604 )
			if( dif_source_BBlower <= -0.342779 )
				ret := 0.000000
			if( dif_source_BBlower > -0.342779 )
				if( dif_source_BBlower <= 1.70971 )
					ret := -1.000000 // sell
				if( dif_source_BBlower > 1.70971 )
					if( vrsi <= 61.5203 )
						ret := -0.600000
					if( vrsi > 61.5203 )
						ret := -0.923077 // sell
	
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
float op_operation = decision_tree_0_PTON_15Min_a3c3aabb(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


