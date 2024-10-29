//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: MELI_15Min_1BOL_b3f6c110 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1BOL_b3f6c110", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_b3f6c110(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBlower <= 271.428 )
		if( dif_source_BBupper <= 3.57799 )
			if( BBupper <= 305.615 )
				if( dif_source_BBupper <= -41.0631 )
					if( BBlower <= 234.596 )
						if( BBupper <= 285.47 )
							if( vrsi <= 28.3277 )
								if( dif_source_BBlower <= 16.1636 )
									ret := 0.500000
								if( dif_source_BBlower > 16.1636 )
									ret := 0.000000
							if( vrsi > 28.3277 )
								if( BBlower <= 219.551 )
									ret := -0.777778 // sell
								if( BBlower > 219.551 )
									ret := -0.090909
						if( BBupper > 285.47 )
							if( BBupper <= 291.158 )
								if( dif_source_BBlower <= 7.3173 )
									ret := 0.727273 // buy
								if( dif_source_BBlower > 7.3173 )
									ret := 0.420000
							if( BBupper > 291.158 )
								if( dif_source_BBlower <= 3.76086 )
									ret := 0.428571
								if( dif_source_BBlower > 3.76086 )
									ret := -0.777778 // sell
					if( BBlower > 234.596 )
						if( BBupper <= 297.704 )
							if( BBlower <= 243.382 )
								if( dif_source_BBlower <= -4.62811 )
									ret := -0.500000
								if( dif_source_BBlower > -4.62811 )
									ret := -1.000000 // sell
							if( BBlower > 243.382 )
								ret := 0.142857
						if( BBupper > 297.704 )
							if( BBlower <= 262.829 )
								if( dif_source_BBupper <= -47.5969 )
									ret := -0.142857
								if( dif_source_BBupper > -47.5969 )
									ret := -0.666667
							if( BBlower > 262.829 )
								ret := 0.800000 // buy
				if( dif_source_BBupper > -41.0631 )
					if( BBlower <= 148.994 )
						if( vrsi <= 11.4587 )
							ret := 0.000000
						if( vrsi > 11.4587 )
							if( BBupper <= 167.486 )
								if( BBupper <= 166.973 )
									ret := -0.357143
								if( BBupper > 166.973 )
									ret := -0.750000 // sell
							if( BBupper > 167.486 )
								ret := 0.000000
					if( BBlower > 148.994 )
						if( BBupper <= 273.125 )
							if( dif_source_BBupper <= -3.70345 )
								if( BBupper <= 160.604 )
									ret := 0.857143 // buy
								if( BBupper > 160.604 )
									ret := 0.204884
							if( dif_source_BBupper > -3.70345 )
								if( dif_source_BBlower <= 9.35519 )
									ret := 0.137275
								if( dif_source_BBlower > 9.35519 )
									ret := 0.012208
						if( BBupper > 273.125 )
							if( dif_source_BBlower <= -0.438947 )
								if( dif_source_BBupper <= -36.8307 )
									ret := 0.732394 // buy
								if( dif_source_BBupper > -36.8307 )
									ret := 0.201681
							if( dif_source_BBlower > -0.438947 )
								if( BBupper <= 302.065 )
									ret := -0.021140
								if( BBupper > 302.065 )
									ret := 0.280702
			if( BBupper > 305.615 )
				if( dif_source_BBlower <= 66.4986 )
					if( vrsi <= 52.8241 )
						if( BBlower <= 254.49 )
							if( vrsi <= 16.1739 )
								if( dif_source_BBupper <= -21.8444 )
									ret := 0.625000
								if( dif_source_BBupper > -21.8444 )
									ret := 0.125000
							if( vrsi > 16.1739 )
								if( BBlower <= 248.804 )
									ret := -0.500000
								if( BBlower > 248.804 )
									ret := -0.100000
						if( BBlower > 254.49 )
							if( vrsi <= 23.3494 )
								if( dif_source_BBupper <= -37.9747 )
									ret := 0.615385
								if( dif_source_BBupper > -37.9747 )
									ret := 0.971429 // buy
							if( vrsi > 23.3494 )
								if( dif_source_BBupper <= -12.2626 )
									ret := 0.528736
								if( dif_source_BBupper > -12.2626 )
									ret := 0.784314 // buy
					if( vrsi > 52.8241 )
						if( dif_source_BBlower <= 11.9258 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 11.9258 )
							if( dif_source_BBupper <= -7.23361 )
								if( BBupper <= 341.059 )
									ret := 0.113821
								if( BBupper > 341.059 )
									ret := -0.782609 // sell
							if( dif_source_BBupper > -7.23361 )
								if( dif_source_BBlower <= 55.4729 )
									ret := 0.906250 // buy
								if( dif_source_BBlower > 55.4729 )
									ret := -0.181818
				if( dif_source_BBlower > 66.4986 )
					if( vrsi <= 62.4163 )
						ret := -1.000000 // sell
					if( vrsi > 62.4163 )
						ret := -0.571429
		if( dif_source_BBupper > 3.57799 )
			if( BBlower <= 218.796 )
				if( dif_source_BBupper <= 15.6853 )
					if( dif_source_BBlower <= 53.825 )
						if( BBlower <= 217.639 )
							if( vrsi <= 37.8971 )
								ret := 0.250000
							if( vrsi > 37.8971 )
								ret := 0.000000
						if( BBlower > 217.639 )
							ret := -0.500000
					if( dif_source_BBlower > 53.825 )
						if( dif_source_BBlower <= 61.5375 )
							if( dif_source_BBupper <= 9.74647 )
								ret := 0.857143 // buy
							if( dif_source_BBupper > 9.74647 )
								ret := 0.250000
						if( dif_source_BBlower > 61.5375 )
							ret := 0.000000
				if( dif_source_BBupper > 15.6853 )
					ret := -1.000000 // sell
			if( BBlower > 218.796 )
				if( dif_source_BBlower <= 53.2428 )
					if( dif_source_BBupper <= 10.1085 )
						if( vrsi <= 84.5028 )
							if( BBupper <= 288.378 )
								if( dif_source_BBlower <= 43.4422 )
									ret := 0.644928
								if( dif_source_BBlower > 43.4422 )
									ret := -0.333333
							if( BBupper > 288.378 )
								if( vrsi <= 70.6489 )
									ret := 0.333333
								if( vrsi > 70.6489 )
									ret := -0.833333 // sell
						if( vrsi > 84.5028 )
							if( dif_source_BBlower <= 28.3125 )
								if( dif_source_BBupper <= 4.60307 )
									ret := 0.555556
								if( dif_source_BBupper > 4.60307 )
									ret := 0.000000
							if( dif_source_BBlower > 28.3125 )
								if( BBupper <= 304.857 )
									ret := 0.914894 // buy
								if( BBupper > 304.857 )
									ret := 0.500000
					if( dif_source_BBupper > 10.1085 )
						if( dif_source_BBlower <= 41.0584 )
							if( vrsi <= 87.9828 )
								ret := 1.000000 // buy
							if( vrsi > 87.9828 )
								ret := 0.750000 // buy
						if( dif_source_BBlower > 41.0584 )
							ret := 1.000000 // buy
				if( dif_source_BBlower > 53.2428 )
					if( dif_source_BBupper <= 7.49455 )
						if( BBlower <= 254.699 )
							ret := -0.500000
						if( BBlower > 254.699 )
							if( BBupper <= 319.379 )
								if( dif_source_BBupper <= 5.74701 )
									ret := 0.500000
								if( dif_source_BBupper > 5.74701 )
									ret := 1.000000 // buy
							if( BBupper > 319.379 )
								ret := 0.000000
					if( dif_source_BBupper > 7.49455 )
						if( BBupper <= 316.19 )
							if( BBlower <= 239.887 )
								ret := -1.000000 // sell
							if( BBlower > 239.887 )
								if( dif_source_BBlower <= 65.2819 )
									ret := -0.538462
								if( dif_source_BBlower > 65.2819 )
									ret := -1.000000 // sell
						if( BBupper > 316.19 )
							ret := 0.200000
	if( BBlower > 271.428 )
		if( dif_source_BBupper <= -376.528 )
			if( BBupper <= 1774.05 )
				if( dif_source_BBlower <= 13.1491 )
					if( BBupper <= 1433.77 )
						if( vrsi <= 3.79163 )
							ret := 0.250000
						if( vrsi > 3.79163 )
							ret := 0.500000
					if( BBupper > 1433.77 )
						ret := -0.571429
				if( dif_source_BBlower > 13.1491 )
					if( BBlower <= 1326.42 )
						if( vrsi <= 79.8659 )
							if( vrsi <= 45.9838 )
								ret := 1.000000 // buy
							if( vrsi > 45.9838 )
								if( dif_source_BBupper <= -394.689 )
									ret := 0.600000
								if( dif_source_BBupper > -394.689 )
									ret := 1.000000 // buy
						if( vrsi > 79.8659 )
							ret := 0.400000
					if( BBlower > 1326.42 )
						ret := 0.250000
			if( BBupper > 1774.05 )
				ret := 1.000000 // buy
		if( dif_source_BBupper > -376.528 )
			if( dif_source_BBupper <= -172.905 )
				if( BBupper <= 1050.04 )
					if( BBlower <= 677.977 )
						if( dif_source_BBupper <= -273.53 )
							if( BBupper <= 903.274 )
								if( dif_source_BBupper <= -293.171 )
									ret := 0.909091 // buy
								if( dif_source_BBupper > -293.171 )
									ret := 1.000000 // buy
							if( BBupper > 903.274 )
								if( dif_source_BBupper <= -283.09 )
									ret := 0.512821
								if( dif_source_BBupper > -283.09 )
									ret := -1.000000 // sell
						if( dif_source_BBupper > -273.53 )
							if( dif_source_BBlower <= -5.65108 )
								if( BBupper <= 892.108 )
									ret := 0.957447 // buy
								if( BBupper > 892.108 )
									ret := -0.100000
							if( dif_source_BBlower > -5.65108 )
								if( BBlower <= 545.882 )
									ret := -0.623377
								if( BBlower > 545.882 )
									ret := 0.075472
					if( BBlower > 677.977 )
						if( BBlower <= 707.97 )
							if( BBlower <= 703.047 )
								ret := -1.000000 // sell
							if( BBlower > 703.047 )
								ret := -0.857143 // sell
						if( BBlower > 707.97 )
							if( dif_source_BBlower <= 15.6764 )
								if( vrsi <= 27.1487 )
									ret := 0.647059
								if( vrsi > 27.1487 )
									ret := 0.111111
							if( dif_source_BBlower > 15.6764 )
								if( vrsi <= 29.5162 )
									ret := -0.400000
								if( vrsi > 29.5162 )
									ret := -0.833333 // sell
				if( BBupper > 1050.04 )
					if( BBupper <= 1072.86 )
						if( dif_source_BBupper <= -365.456 )
							if( dif_source_BBlower <= 1.99992 )
								ret := 0.750000 // buy
							if( dif_source_BBlower > 1.99992 )
								ret := -0.500000
						if( dif_source_BBupper > -365.456 )
							if( dif_source_BBlower <= -1.51877 )
								if( BBlower <= 819.811 )
									ret := 0.833333 // buy
								if( BBlower > 819.811 )
									ret := -0.628571
							if( dif_source_BBlower > -1.51877 )
								if( BBlower <= 824.26 )
									ret := -0.944444 // sell
								if( BBlower > 824.26 )
									ret := -0.250000
					if( BBupper > 1072.86 )
						if( BBlower <= 819.451 )
							if( vrsi <= 88.6177 )
								ret := 1.000000 // buy
							if( vrsi > 88.6177 )
								if( BBupper <= 1177.12 )
									ret := -0.200000
								if( BBupper > 1177.12 )
									ret := 0.800000 // buy
						if( BBlower > 819.451 )
							if( BBlower <= 1028.8 )
								if( BBupper <= 1257.38 )
									ret := -0.068213
								if( BBupper > 1257.38 )
									ret := 0.766234 // buy
							if( BBlower > 1028.8 )
								if( BBupper <= 1496.88 )
									ret := -0.335652
								if( BBupper > 1496.88 )
									ret := -0.064748
			if( dif_source_BBupper > -172.905 )
				if( BBupper <= 299.039 )
					if( dif_source_BBupper <= -36.1089 )
						ret := 1.000000 // buy
					if( dif_source_BBupper > -36.1089 )
						if( dif_source_BBupper <= -15.1777 )
							if( BBlower <= 273.567 )
								if( vrsi <= 37.295 )
									ret := 0.666667
								if( vrsi > 37.295 )
									ret := -0.500000
							if( BBlower > 273.567 )
								if( dif_source_BBlower <= -10.7879 )
									ret := 0.333333
								if( dif_source_BBlower > -10.7879 )
									ret := -0.924242 // sell
						if( dif_source_BBupper > -15.1777 )
							if( vrsi <= 88.0185 )
								if( BBlower <= 273.135 )
									ret := -0.568421
								if( BBlower > 273.135 )
									ret := -0.135417
							if( vrsi > 88.0185 )
								if( vrsi <= 99.2171 )
									ret := 0.625000
								if( vrsi > 99.2171 )
									ret := -0.142857
				if( BBupper > 299.039 )
					if( dif_source_BBupper <= 43.4607 )
						if( dif_source_BBupper <= -70.0406 )
							if( vrsi <= 51.4004 )
								if( BBlower <= 588.908 )
									ret := 0.314152
								if( BBlower > 588.908 )
									ret := 0.097989
							if( vrsi > 51.4004 )
								if( BBlower <= 539.762 )
									ret := -0.282946
								if( BBlower > 539.762 )
									ret := 0.043478
						if( dif_source_BBupper > -70.0406 )
							if( BBlower <= 1489.2 )
								if( BBupper <= 1457.32 )
									ret := 0.034774
								if( BBupper > 1457.32 )
									ret := 0.196143
							if( BBlower > 1489.2 )
								if( vrsi <= 0.882801 )
									ret := -0.412500
								if( vrsi > 0.882801 )
									ret := -0.009194
					if( dif_source_BBupper > 43.4607 )
						if( BBlower <= 1493.37 )
							if( vrsi <= 56.2167 )
								if( dif_source_BBlower <= 167.214 )
									ret := 0.800000 // buy
								if( dif_source_BBlower > 167.214 )
									ret := 0.000000
							if( vrsi > 56.2167 )
								if( dif_source_BBupper <= 53.5997 )
									ret := -0.280899
								if( dif_source_BBupper > 53.5997 )
									ret := -0.785714 // sell
						if( BBlower > 1493.37 )
							if( BBupper <= 1719.53 )
								if( dif_source_BBupper <= 80.8916 )
									ret := 0.866667 // buy
								if( dif_source_BBupper > 80.8916 )
									ret := -0.571429
							if( BBupper > 1719.53 )
								if( vrsi <= 80.7569 )
									ret := -0.750000 // sell
								if( vrsi > 80.7569 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_MELI_15Min_b3f6c110(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


