//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: SNAP_15Min_1BOL_2f917fe8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_15Min_1BOL_2f917fe8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_15Min_2f917fe8(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( vrsi <= 43.8618 )
		if( BBlower <= 29.6607 )
			if( BBlower <= 10.0117 )
				if( BBlower <= 9.99535 )
					if( BBlower <= 6.27486 )
						if( BBlower <= 5.55119 )
							if( dif_source_BBlower <= 0.066068 )
								if( BBupper <= 6.05437 )
									ret := -0.786885 // sell
								if( BBupper > 6.05437 )
									ret := -0.045455
							if( dif_source_BBlower > 0.066068 )
								if( BBlower <= 4.72935 )
									ret := -0.333333
								if( BBlower > 4.72935 )
									ret := 0.204176
						if( BBlower > 5.55119 )
							if( vrsi <= 13.1839 )
								if( dif_source_BBlower <= 1.0694 )
									ret := -0.219653
								if( dif_source_BBlower > 1.0694 )
									ret := 0.928571 // buy
							if( vrsi > 13.1839 )
								if( dif_source_BBupper <= -1.01722 )
									ret := 0.811966 // buy
								if( dif_source_BBupper > -1.01722 )
									ret := 0.237173
					if( BBlower > 6.27486 )
						if( dif_source_BBlower <= -0.035955 )
							if( dif_source_BBlower <= -0.043009 )
								if( BBupper <= 9.45996 )
									ret := 0.475000
								if( BBupper > 9.45996 )
									ret := 0.169697
							if( dif_source_BBlower > -0.043009 )
								if( dif_source_BBupper <= -0.644872 )
									ret := 0.714286 // buy
								if( dif_source_BBupper > -0.644872 )
									ret := 0.440000
						if( dif_source_BBlower > -0.035955 )
							if( BBupper <= 8.49454 )
								if( BBupper <= 7.74588 )
									ret := -0.101235
								if( BBupper > 7.74588 )
									ret := -0.529801
							if( BBupper > 8.49454 )
								if( BBlower <= 7.74983 )
									ret := 0.377892
								if( BBlower > 7.74983 )
									ret := 0.105734
				if( BBlower > 9.99535 )
					if( dif_source_BBlower <= 0.419002 )
						if( BBupper <= 10.6462 )
							ret := 0.666667
						if( BBupper > 10.6462 )
							if( dif_source_BBlower <= 0.049087 )
								ret := 0.636364
							if( dif_source_BBlower > 0.049087 )
								if( BBupper <= 11.7015 )
									ret := -0.350000
								if( BBupper > 11.7015 )
									ret := 0.166667
					if( dif_source_BBlower > 0.419002 )
						if( BBlower <= 10.0096 )
							if( BBupper <= 11.4137 )
								if( dif_source_BBupper <= -0.207779 )
									ret := 0.966667 // buy
								if( dif_source_BBupper > -0.207779 )
									ret := 0.333333
							if( BBupper > 11.4137 )
								if( vrsi <= 32.0121 )
									ret := 0.000000
								if( vrsi > 32.0121 )
									ret := 0.625000
						if( BBlower > 10.0096 )
							ret := 0.272727
			if( BBlower > 10.0117 )
				if( dif_source_BBupper <= -15.5641 )
					ret := 0.958333 // buy
				if( dif_source_BBupper > -15.5641 )
					if( dif_source_BBlower <= 0.625837 )
						if( BBupper <= 31.3895 )
							if( dif_source_BBlower <= -2.06571 )
								if( dif_source_BBupper <= -9.49065 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -9.49065 )
									ret := -0.300000
							if( dif_source_BBlower > -2.06571 )
								if( BBlower <= 10.0369 )
									ret := -0.258741
								if( BBlower > 10.0369 )
									ret := 0.025186
						if( BBupper > 31.3895 )
							if( dif_source_BBupper <= -10.2252 )
								if( BBupper <= 37.7717 )
									ret := -0.576923
								if( BBupper > 37.7717 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -10.2252 )
								if( vrsi <= 18.42 )
									ret := 0.330435
								if( vrsi > 18.42 )
									ret := 0.648148
					if( dif_source_BBlower > 0.625837 )
						if( dif_source_BBlower <= 6.47364 )
							if( dif_source_BBlower <= 2.41784 )
								if( BBupper <= 10.9337 )
									ret := -0.557377
								if( BBupper > 10.9337 )
									ret := 0.092266
							if( dif_source_BBlower > 2.41784 )
								if( BBupper <= 16.5745 )
									ret := 0.538462
								if( BBupper > 16.5745 )
									ret := 0.167687
						if( dif_source_BBlower > 6.47364 )
							if( dif_source_BBupper <= -3.82478 )
								if( BBupper <= 42.2497 )
									ret := 0.853659 // buy
								if( BBupper > 42.2497 )
									ret := 0.144737
							if( dif_source_BBupper > -3.82478 )
								if( dif_source_BBupper <= 0.51507 )
									ret := -0.246809
								if( dif_source_BBupper > 0.51507 )
									ret := -0.727273 // sell
		if( BBlower > 29.6607 )
			if( BBupper <= 34.3919 )
				if( dif_source_BBlower <= 0.840036 )
					if( BBupper <= 34.3412 )
						ret := -1.000000 // sell
					if( BBupper > 34.3412 )
						ret := -0.615385
				if( dif_source_BBlower > 0.840036 )
					ret := -1.000000 // sell
			if( BBupper > 34.3919 )
				if( BBlower <= 34.7913 )
					if( BBupper <= 37.1703 )
						if( BBlower <= 29.7003 )
							ret := -1.000000 // sell
						if( BBlower > 29.7003 )
							if( dif_source_BBlower <= -0.439782 )
								if( vrsi <= 11.2486 )
									ret := 1.000000 // buy
								if( vrsi > 11.2486 )
									ret := 0.695652
							if( dif_source_BBlower > -0.439782 )
								if( dif_source_BBlower <= 3.02203 )
									ret := -0.037879
								if( dif_source_BBlower > 3.02203 )
									ret := 0.842105 // buy
					if( BBupper > 37.1703 )
						if( BBupper <= 40.9231 )
							if( dif_source_BBlower <= -0.172854 )
								if( BBlower <= 33.7772 )
									ret := -0.300000
								if( BBlower > 33.7772 )
									ret := 0.909091 // buy
							if( dif_source_BBlower > -0.172854 )
								if( dif_source_BBlower <= 2.61014 )
									ret := -0.640884
								if( dif_source_BBlower > 2.61014 )
									ret := 0.000000
						if( BBupper > 40.9231 )
							if( BBupper <= 44.0918 )
								if( dif_source_BBupper <= -1.70717 )
									ret := 0.431818
								if( dif_source_BBupper > -1.70717 )
									ret := 0.750000 // buy
							if( BBupper > 44.0918 )
								if( dif_source_BBlower <= 1.47596 )
									ret := -0.615385
								if( dif_source_BBlower > 1.47596 )
									ret := -0.300000
				if( BBlower > 34.7913 )
					if( BBlower <= 74.2275 )
						if( dif_source_BBupper <= -7.84604 )
							if( dif_source_BBlower <= 1.11308 )
								if( vrsi <= 21.9491 )
									ret := 0.618182
								if( vrsi > 21.9491 )
									ret := 0.169118
							if( dif_source_BBlower > 1.11308 )
								if( BBlower <= 51.1302 )
									ret := 0.365269
								if( BBlower > 51.1302 )
									ret := -0.283951
						if( dif_source_BBupper > -7.84604 )
							if( dif_source_BBlower <= 12.5967 )
								if( crossunder_rsi_bbupperInt <= 0.5 )
									ret := -0.021969
								if( crossunder_rsi_bbupperInt > 0.5 )
									ret := -0.055556
							if( dif_source_BBlower > 12.5967 )
								if( BBupper <= 81.0029 )
									ret := 0.833333 // buy
								if( BBupper > 81.0029 )
									ret := -0.111111
					if( BBlower > 74.2275 )
						if( dif_source_BBupper <= -8.69659 )
							ret := 0.583333
						if( dif_source_BBupper > -8.69659 )
							if( BBupper <= 79.2267 )
								if( dif_source_BBlower <= 0.917229 )
									ret := 0.192308
								if( dif_source_BBlower > 0.917229 )
									ret := -0.534091
							if( BBupper > 79.2267 )
								if( vrsi <= 34.6144 )
									ret := -0.604651
								if( vrsi > 34.6144 )
									ret := -0.945946 // sell
	if( vrsi > 43.8618 )
		if( BBlower <= 70.5461 )
			if( dif_source_BBupper <= 3.54581 )
				if( BBupper <= 11.2548 )
					if( BBupper <= 10.2006 )
						if( BBupper <= 6.32633 )
							if( BBupper <= 6.26456 )
								if( BBlower <= 5.55383 )
									ret := 0.110505
								if( BBlower > 5.55383 )
									ret := -0.180380
							if( BBupper > 6.26456 )
								if( vrsi <= 63.1538 )
									ret := 0.789474 // buy
								if( vrsi > 63.1538 )
									ret := 0.138889
						if( BBupper > 6.32633 )
							if( dif_source_BBlower <= 2.75201 )
								if( dif_source_BBupper <= -0.114701 )
									ret := 0.004513
								if( dif_source_BBupper > -0.114701 )
									ret := -0.144578
							if( dif_source_BBlower > 2.75201 )
								if( BBlower <= 5.90672 )
									ret := -0.500000
								if( BBlower > 5.90672 )
									ret := -0.850000 // sell
					if( BBupper > 10.2006 )
						if( dif_source_BBlower <= 1.68259 )
							if( dif_source_BBupper <= 0.137747 )
								if( vrsi <= 92.1548 )
									ret := 0.075485
								if( vrsi > 92.1548 )
									ret := -0.220070
							if( dif_source_BBupper > 0.137747 )
								if( vrsi <= 75.3798 )
									ret := 0.083333
								if( vrsi > 75.3798 )
									ret := -0.395161
						if( dif_source_BBlower > 1.68259 )
							if( BBupper <= 10.4764 )
								if( dif_source_BBupper <= -0.595785 )
									ret := 0.861111 // buy
								if( dif_source_BBupper > -0.595785 )
									ret := -0.857143 // sell
							if( BBupper > 10.4764 )
								if( BBlower <= 9.25989 )
									ret := 0.691429
								if( BBlower > 9.25989 )
									ret := 0.234043
				if( BBupper > 11.2548 )
					if( crossunder_rsi_bbupperInt <= 0.5 )
						if( dif_source_BBupper <= -0.076156 )
							if( dif_source_BBupper <= -27.2777 )
								if( BBlower <= 47.0996 )
									ret := 1.000000 // buy
								if( BBlower > 47.0996 )
									ret := -0.450000
							if( dif_source_BBupper > -27.2777 )
								if( vrsi <= 80.852 )
									ret := -0.031281
								if( vrsi > 80.852 )
									ret := -0.150020
						if( dif_source_BBupper > -0.076156 )
							if( dif_source_BBlower <= 1.37938 )
								if( dif_source_BBlower <= 1.13831 )
									ret := -0.075510
								if( dif_source_BBlower > 1.13831 )
									ret := 0.064270
							if( dif_source_BBlower > 1.37938 )
								if( dif_source_BBlower <= 3.19355 )
									ret := -0.233258
								if( dif_source_BBlower > 3.19355 )
									ret := -0.023602
					if( crossunder_rsi_bbupperInt > 0.5 )
						if( BBlower <= 12.2523 )
							ret := -0.250000
						if( BBlower > 12.2523 )
							if( dif_source_BBlower <= 1.49256 )
								ret := 0.833333 // buy
							if( dif_source_BBlower > 1.49256 )
								ret := 0.300000
			if( dif_source_BBupper > 3.54581 )
				if( dif_source_BBupper <= 4.48738 )
					ret := 0.533333
				if( dif_source_BBupper > 4.48738 )
					ret := 1.000000 // buy
		if( BBlower > 70.5461 )
			if( BBupper <= 77.3786 )
				if( vrsi <= 91.9473 )
					if( BBupper <= 75.5927 )
						if( BBlower <= 70.6774 )
							if( BBlower <= 70.6176 )
								ret := 0.578947
							if( BBlower > 70.6176 )
								ret := 0.222222
						if( BBlower > 70.6774 )
							if( BBupper <= 75.5539 )
								if( dif_source_BBupper <= -0.131951 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -0.131951 )
									ret := 0.727273 // buy
							if( BBupper > 75.5539 )
								ret := 0.600000
					if( BBupper > 75.5927 )
						if( BBlower <= 73.3536 )
							if( BBlower <= 72.6258 )
								if( dif_source_BBupper <= 0.691107 )
									ret := 0.355330
								if( dif_source_BBupper > 0.691107 )
									ret := -0.611111
							if( BBlower > 72.6258 )
								if( dif_source_BBlower <= 2.55701 )
									ret := 0.252830
								if( dif_source_BBlower > 2.55701 )
									ret := -0.144444
						if( BBlower > 73.3536 )
							if( dif_source_BBupper <= -0.579953 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -0.579953 )
								ret := 0.555556
				if( vrsi > 91.9473 )
					if( vrsi <= 98.4851 )
						if( BBlower <= 72.538 )
							ret := -0.523810
						if( BBlower > 72.538 )
							ret := -0.181818
					if( vrsi > 98.4851 )
						ret := -0.615385
			if( BBupper > 77.3786 )
				if( dif_source_BBupper <= -2.82016 )
					if( dif_source_BBupper <= -7.87875 )
						if( BBlower <= 72.5446 )
							if( BBupper <= 84.967 )
								ret := 0.142857
							if( BBupper > 84.967 )
								ret := 0.555556
						if( BBlower > 72.5446 )
							if( dif_source_BBlower <= 0.617208 )
								if( dif_source_BBupper <= -9.00646 )
									ret := 0.428571
								if( dif_source_BBupper > -9.00646 )
									ret := -0.142857
							if( dif_source_BBlower > 0.617208 )
								if( dif_source_BBupper <= -9.28427 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -9.28427 )
									ret := -0.800000 // sell
					if( dif_source_BBupper > -7.87875 )
						if( vrsi <= 56.2052 )
							if( BBupper <= 78.6331 )
								if( BBlower <= 74.2047 )
									ret := 0.630137
								if( BBlower > 74.2047 )
									ret := 0.071429
							if( BBupper > 78.6331 )
								if( dif_source_BBupper <= -3.45153 )
									ret := 0.619048
								if( dif_source_BBupper > -3.45153 )
									ret := 0.000000
						if( vrsi > 56.2052 )
							if( dif_source_BBupper <= -6.31633 )
								ret := 0.909091 // buy
							if( dif_source_BBupper > -6.31633 )
								if( vrsi <= 61.1529 )
									ret := -0.414634
								if( vrsi > 61.1529 )
									ret := 0.221311
				if( dif_source_BBupper > -2.82016 )
					if( vrsi <= 60.5536 )
						if( dif_source_BBupper <= -0.734574 )
							if( vrsi <= 47.1169 )
								if( BBupper <= 78.3509 )
									ret := -0.600000
								if( BBupper > 78.3509 )
									ret := 0.176471
							if( vrsi > 47.1169 )
								if( dif_source_BBlower <= 5.77198 )
									ret := -0.679487
								if( dif_source_BBlower > 5.77198 )
									ret := 0.000000
						if( dif_source_BBupper > -0.734574 )
							if( vrsi <= 48.638 )
								ret := -0.200000
							if( vrsi > 48.638 )
								if( BBupper <= 78.1673 )
									ret := 0.000000
								if( BBupper > 78.1673 )
									ret := 0.250000
					if( vrsi > 60.5536 )
						if( BBupper <= 80.0201 )
							if( dif_source_BBupper <= -2.00076 )
								if( dif_source_BBupper <= -2.60367 )
									ret := -0.214286
								if( dif_source_BBupper > -2.60367 )
									ret := 0.250000
							if( dif_source_BBupper > -2.00076 )
								if( dif_source_BBlower <= 3.51507 )
									ret := -0.622951
								if( dif_source_BBlower > 3.51507 )
									ret := -0.217391
						if( BBupper > 80.0201 )
							if( BBupper <= 82.2181 )
								if( dif_source_BBlower <= 7.83132 )
									ret := 0.777778 // buy
								if( dif_source_BBlower > 7.83132 )
									ret := 1.000000 // buy
							if( BBupper > 82.2181 )
								ret := -0.055556
	
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
float op_operation = decision_tree_0_SNAP_15Min_2f917fe8(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)

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


