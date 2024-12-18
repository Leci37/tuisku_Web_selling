//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: ATOMUSDT_30Min_1BOL_d5252e5c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_1BOL_d5252e5c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_d5252e5c(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( vrsi <= 30.5552 )
		if( dif_source_BBupper <= -7.93893 )
			if( vrsi <= 27.7483 )
				if( vrsi <= 0.036275 )
					if( dif_source_BBlower <= -0.420884 )
						ret := 0.200000
					if( dif_source_BBlower > -0.420884 )
						ret := -0.500000
				if( vrsi > 0.036275 )
					if( BBlower <= 12.2361 )
						if( BBlower <= 10.2523 )
							if( vrsi <= 23.2969 )
								ret := 0.750000 // buy
							if( vrsi > 23.2969 )
								ret := 0.500000
						if( BBlower > 10.2523 )
							if( BBlower <= 11.5295 )
								ret := -0.714286 // sell
							if( BBlower > 11.5295 )
								ret := -1.000000 // sell
					if( BBlower > 12.2361 )
						if( vrsi <= 9.01018 )
							if( BBupper <= 43.2024 )
								if( dif_source_BBupper <= -9.94575 )
									ret := 0.952381 // buy
								if( dif_source_BBupper > -9.94575 )
									ret := 0.461538
							if( BBupper > 43.2024 )
								if( BBupper <= 43.698 )
									ret := -1.000000 // sell
								if( BBupper > 43.698 )
									ret := -0.181818
						if( vrsi > 9.01018 )
							if( BBlower <= 26.8451 )
								if( dif_source_BBupper <= -8.51377 )
									ret := 0.662921
								if( dif_source_BBupper > -8.51377 )
									ret := 0.888889 // buy
							if( BBlower > 26.8451 )
								if( BBupper <= 42.8453 )
									ret := 0.061728
								if( BBupper > 42.8453 )
									ret := 0.857143 // buy
			if( vrsi > 27.7483 )
				if( BBlower <= 31.0684 )
					if( BBlower <= 9.82608 )
						ret := 0.142857
					if( BBlower > 9.82608 )
						if( BBupper <= 28.9531 )
							ret := -1.000000 // sell
						if( BBupper > 28.9531 )
							ret := -0.583333
				if( BBlower > 31.0684 )
					ret := 0.000000
		if( dif_source_BBupper > -7.93893 )
			if( BBlower <= 26.0617 )
				if( dif_source_BBlower <= -0.111339 )
					if( BBupper <= 19.0149 )
						if( BBupper <= 16.9829 )
							if( dif_source_BBlower <= -0.672161 )
								if( BBlower <= 8.99308 )
									ret := 0.066667
								if( BBlower > 8.99308 )
									ret := 0.888889 // buy
							if( dif_source_BBlower > -0.672161 )
								if( dif_source_BBupper <= -2.2436 )
									ret := 0.017370
								if( dif_source_BBupper > -2.2436 )
									ret := 0.231610
						if( BBupper > 16.9829 )
							if( BBupper <= 17.8489 )
								if( vrsi <= 22.7825 )
									ret := 0.000000
								if( vrsi > 22.7825 )
									ret := -0.772727 // sell
							if( BBupper > 17.8489 )
								if( BBupper <= 18.5013 )
									ret := -0.733333 // sell
								if( BBupper > 18.5013 )
									ret := -1.000000 // sell
					if( BBupper > 19.0149 )
						if( dif_source_BBupper <= -6.02304 )
							if( dif_source_BBlower <= -0.986953 )
								if( dif_source_BBlower <= -1.17054 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -1.17054 )
									ret := -0.250000
							if( dif_source_BBlower > -0.986953 )
								if( dif_source_BBlower <= -0.336878 )
									ret := 0.982143 // buy
								if( dif_source_BBlower > -0.336878 )
									ret := 0.619048
						if( dif_source_BBupper > -6.02304 )
							if( dif_source_BBupper <= -5.46574 )
								ret := -0.450000
							if( dif_source_BBupper > -5.46574 )
								if( dif_source_BBlower <= -0.370526 )
									ret := 0.659091
								if( dif_source_BBlower > -0.370526 )
									ret := 0.450000
				if( dif_source_BBlower > -0.111339 )
					if( dif_source_BBlower <= 0.184412 )
						if( dif_source_BBupper <= -1.36073 )
							if( dif_source_BBupper <= -4.7666 )
								if( dif_source_BBlower <= 0.143181 )
									ret := 0.389831
								if( dif_source_BBlower > 0.143181 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -4.7666 )
								if( vrsi <= 29.0834 )
									ret := 0.086294
								if( vrsi > 29.0834 )
									ret := 0.728814 // buy
						if( dif_source_BBupper > -1.36073 )
							if( BBlower <= 4.97881 )
								if( dif_source_BBupper <= -0.873178 )
									ret := 0.179775
								if( dif_source_BBupper > -0.873178 )
									ret := -0.231461
							if( BBlower > 4.97881 )
								if( vrsi <= 0.117206 )
									ret := -0.380734
								if( vrsi > 0.117206 )
									ret := -0.040788
					if( dif_source_BBlower > 0.184412 )
						if( BBlower <= 11.3806 )
							if( dif_source_BBlower <= 0.838523 )
								if( BBlower <= 4.57017 )
									ret := 0.322581
								if( BBlower > 4.57017 )
									ret := 0.082899
							if( dif_source_BBlower > 0.838523 )
								if( vrsi <= 5.60927 )
									ret := -0.054054
								if( vrsi > 5.60927 )
									ret := 0.200685
						if( BBlower > 11.3806 )
							if( BBupper <= 20.1495 )
								if( dif_source_BBlower <= 1.14489 )
									ret := -0.143040
								if( dif_source_BBlower > 1.14489 )
									ret := 0.047018
							if( BBupper > 20.1495 )
								if( dif_source_BBlower <= 3.90247 )
									ret := 0.063330
								if( dif_source_BBlower > 3.90247 )
									ret := 0.260494
			if( BBlower > 26.0617 )
				if( vrsi <= 26.912 )
					if( dif_source_BBlower <= -0.990217 )
						if( BBlower <= 28.1529 )
							ret := -0.105263
						if( BBlower > 28.1529 )
							if( BBupper <= 37.3555 )
								ret := 0.538462
							if( BBupper > 37.3555 )
								ret := 1.000000 // buy
					if( dif_source_BBlower > -0.990217 )
						if( BBlower <= 26.1732 )
							if( dif_source_BBupper <= -5.50689 )
								ret := 0.411765
							if( dif_source_BBupper > -5.50689 )
								if( vrsi <= 21.1212 )
									ret := -0.741935 // sell
								if( vrsi > 21.1212 )
									ret := -0.047619
						if( BBlower > 26.1732 )
							if( vrsi <= 1.56787 )
								if( dif_source_BBupper <= -6.91501 )
									ret := -0.352941
								if( dif_source_BBupper > -6.91501 )
									ret := 0.232323
							if( vrsi > 1.56787 )
								if( BBupper <= 42.543 )
									ret := -0.056264
								if( BBupper > 42.543 )
									ret := -0.425926
				if( vrsi > 26.912 )
					if( vrsi <= 28.3378 )
						if( BBupper <= 30.7918 )
							if( BBupper <= 30.0186 )
								ret := -0.900000 // sell
							if( BBupper > 30.0186 )
								ret := -0.230769
						if( BBupper > 30.7918 )
							if( BBlower <= 27.9092 )
								ret := 0.210526
							if( BBlower > 27.9092 )
								if( dif_source_BBupper <= -6.21509 )
									ret := 0.136364
								if( dif_source_BBupper > -6.21509 )
									ret := 0.664286
					if( vrsi > 28.3378 )
						if( dif_source_BBupper <= -3.30545 )
							if( dif_source_BBlower <= 0.339411 )
								if( vrsi <= 29.7512 )
									ret := 0.250000
								if( vrsi > 29.7512 )
									ret := -0.058824
							if( dif_source_BBlower > 0.339411 )
								if( vrsi <= 29.0141 )
									ret := 0.100000
								if( vrsi > 29.0141 )
									ret := -0.704918 // sell
						if( dif_source_BBupper > -3.30545 )
							if( BBupper <= 41.5788 )
								if( BBupper <= 30.0589 )
									ret := -0.500000
								if( BBupper > 30.0589 )
									ret := 0.297030
							if( BBupper > 41.5788 )
								if( BBlower <= 33.5168 )
									ret := -0.250000
								if( BBlower > 33.5168 )
									ret := -0.562500
	if( vrsi > 30.5552 )
		if( dif_source_BBupper <= 0.185811 )
			if( dif_source_BBlower <= 5.49785 )
				if( dif_source_BBlower <= -0.18846 )
					if( dif_source_BBupper <= -4.80343 )
						if( dif_source_BBlower <= -0.642529 )
							if( BBlower <= 17.1844 )
								if( dif_source_BBupper <= -10.8036 )
									ret := -0.923077 // sell
								if( dif_source_BBupper > -10.8036 )
									ret := 0.848485 // buy
							if( BBlower > 17.1844 )
								if( dif_source_BBupper <= -11.3866 )
									ret := 0.469388
								if( dif_source_BBupper > -11.3866 )
									ret := 0.713376 // buy
						if( dif_source_BBlower > -0.642529 )
							if( vrsi <= 44.3278 )
								if( BBupper <= 28.5102 )
									ret := 0.476190
								if( BBupper > 28.5102 )
									ret := -0.235294
							if( vrsi > 44.3278 )
								if( dif_source_BBlower <= -0.273844 )
									ret := 0.649485
								if( dif_source_BBlower > -0.273844 )
									ret := 0.173913
					if( dif_source_BBupper > -4.80343 )
						if( BBlower <= 14.4271 )
							if( dif_source_BBupper <= -1.63221 )
								if( BBlower <= 8.19824 )
									ret := 0.860465 // buy
								if( BBlower > 8.19824 )
									ret := 0.280488
							if( dif_source_BBupper > -1.63221 )
								if( dif_source_BBlower <= -0.247943 )
									ret := 0.222222
								if( dif_source_BBlower > -0.247943 )
									ret := 0.027778
						if( BBlower > 14.4271 )
							if( BBlower <= 19.0362 )
								if( BBupper <= 16.6709 )
									ret := -1.000000 // sell
								if( BBupper > 16.6709 )
									ret := -0.500000
							if( BBlower > 19.0362 )
								if( dif_source_BBupper <= -4.30946 )
									ret := -0.578947
								if( dif_source_BBupper > -4.30946 )
									ret := 0.346154
				if( dif_source_BBlower > -0.18846 )
					if( dif_source_BBlower <= 0.171009 )
						if( dif_source_BBupper <= -0.739971 )
							if( BBlower <= 4.83075 )
								if( BBupper <= 5.7821 )
									ret := 0.354651
								if( BBupper > 5.7821 )
									ret := -0.761905 // sell
							if( BBlower > 4.83075 )
								if( BBupper <= 28.4173 )
									ret := -0.042845
								if( BBupper > 28.4173 )
									ret := 0.359073
						if( dif_source_BBupper > -0.739971 )
							if( dif_source_BBlower <= 0.170535 )
								if( BBlower <= 11.7862 )
									ret := -0.105161
								if( BBlower > 11.7862 )
									ret := -0.650943
							if( dif_source_BBlower > 0.170535 )
								if( BBlower <= 5.95335 )
									ret := -0.833333 // sell
								if( BBlower > 5.95335 )
									ret := -0.200000
					if( dif_source_BBlower > 0.171009 )
						if( BBlower <= 35.4792 )
							if( BBlower <= 31.0698 )
								if( BBlower <= 28.3672 )
									ret := 0.009602
								if( BBlower > 28.3672 )
									ret := -0.317133
							if( BBlower > 31.0698 )
								if( dif_source_BBlower <= 4.39739 )
									ret := 0.102041
								if( dif_source_BBlower > 4.39739 )
									ret := 0.412017
						if( BBlower > 35.4792 )
							if( dif_source_BBupper <= -1.22543 )
								if( dif_source_BBlower <= 1.01049 )
									ret := 0.061350
								if( dif_source_BBlower > 1.01049 )
									ret := -0.597959
							if( dif_source_BBupper > -1.22543 )
								if( dif_source_BBupper <= 0.047362 )
									ret := 0.196078
								if( dif_source_BBupper > 0.047362 )
									ret := 0.571429
			if( dif_source_BBlower > 5.49785 )
				if( vrsi <= 75.3283 )
					if( BBlower <= 30.5838 )
						if( BBupper <= 26.5904 )
							if( vrsi <= 45.8068 )
								ret := -0.176829
							if( vrsi > 45.8068 )
								if( dif_source_BBlower <= 7.33868 )
									ret := -0.537118
								if( dif_source_BBlower > 7.33868 )
									ret := -0.232877
						if( BBupper > 26.5904 )
							if( BBlower <= 24.4602 )
								if( BBupper <= 28.2625 )
									ret := -0.116022
								if( BBupper > 28.2625 )
									ret := 0.206219
							if( BBlower > 24.4602 )
								if( BBlower <= 26.5357 )
									ret := -0.248276
								if( BBlower > 26.5357 )
									ret := 0.015576
					if( BBlower > 30.5838 )
						ret := -0.437970
				if( vrsi > 75.3283 )
					if( BBupper <= 44.345 )
						if( dif_source_BBupper <= -3.25678 )
							if( vrsi <= 81.9748 )
								if( BBupper <= 39.8907 )
									ret := 0.000000
								if( BBupper > 39.8907 )
									ret := 0.000000
							if( vrsi > 81.9748 )
								if( BBupper <= 42.8618 )
									ret := 0.611111
								if( BBupper > 42.8618 )
									ret := 0.888889 // buy
						if( dif_source_BBupper > -3.25678 )
							if( BBlower <= 18.8605 )
								if( dif_source_BBupper <= -0.147835 )
									ret := -0.906780 // sell
								if( dif_source_BBupper > -0.147835 )
									ret := -0.400000
							if( BBlower > 18.8605 )
								if( BBupper <= 30.0165 )
									ret := 0.375000
								if( BBupper > 30.0165 )
									ret := -0.389068
					if( BBupper > 44.345 )
						ret := -1.000000 // sell
		if( dif_source_BBupper > 0.185811 )
			if( BBlower <= 4.9 )
				if( BBlower <= 4.56509 )
					ret := -0.454545
				if( BBlower > 4.56509 )
					if( dif_source_BBupper <= 0.278932 )
						if( dif_source_BBupper <= 0.226646 )
							ret := -0.937500 // sell
						if( dif_source_BBupper > 0.226646 )
							ret := -0.857143 // sell
					if( dif_source_BBupper > 0.278932 )
						ret := -1.000000 // sell
			if( BBlower > 4.9 )
				if( BBupper <= 38.8623 )
					if( dif_source_BBlower <= 12.7652 )
						if( BBupper <= 34.3405 )
							if( dif_source_BBupper <= 1.76172 )
								if( vrsi <= 83.4085 )
									ret := -0.068485
								if( vrsi > 83.4085 )
									ret := -0.271084
							if( dif_source_BBupper > 1.76172 )
								if( dif_source_BBupper <= 2.25189 )
									ret := -0.655172
								if( dif_source_BBupper > 2.25189 )
									ret := -1.000000 // sell
						if( BBupper > 34.3405 )
							if( BBlower <= 27.3181 )
								if( vrsi <= 85.8429 )
									ret := 0.583333
								if( vrsi > 85.8429 )
									ret := 1.000000 // buy
							if( BBlower > 27.3181 )
								if( dif_source_BBlower <= 8.51292 )
									ret := 0.318182
								if( dif_source_BBlower > 8.51292 )
									ret := -0.800000 // sell
					if( dif_source_BBlower > 12.7652 )
						if( vrsi <= 71.0609 )
							ret := -0.764706 // sell
						if( vrsi > 71.0609 )
							if( BBlower <= 22.408 )
								ret := -1.000000 // sell
							if( BBlower > 22.408 )
								ret := -0.916667 // sell
				if( BBupper > 38.8623 )
					if( dif_source_BBlower <= 7.9962 )
						if( dif_source_BBupper <= 0.320785 )
							ret := 0.533333
						if( dif_source_BBupper > 0.320785 )
							ret := -0.111111
					if( dif_source_BBlower > 7.9962 )
						if( vrsi <= 83.666 )
							if( dif_source_BBupper <= 1.38133 )
								if( dif_source_BBlower <= 11.9054 )
									ret := -0.915493 // sell
								if( dif_source_BBlower > 11.9054 )
									ret := -0.416667
							if( dif_source_BBupper > 1.38133 )
								ret := -1.000000 // sell
						if( vrsi > 83.666 )
							if( BBupper <= 40.9206 )
								if( dif_source_BBupper <= 1.1683 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > 1.1683 )
									ret := 0.200000
							if( BBupper > 40.9206 )
								ret := -0.928571 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_d5252e5c(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


