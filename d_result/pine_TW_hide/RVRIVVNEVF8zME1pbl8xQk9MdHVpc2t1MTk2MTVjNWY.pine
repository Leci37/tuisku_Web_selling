//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: ETHUSDT_30Min_1BOL_19615c5f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1BOL_19615c5f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_19615c5f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( BBlower <= 1090.74 )
		if( BBupper <= 676.607 )
			if( BBlower <= 578.209 )
				if( BBlower <= 577.233 )
					if( BBlower <= 338.037 )
						if( dif_source_BBlower <= 39.6917 )
							if( dif_source_BBupper <= -41.0006 )
								ret := -0.219697
							if( dif_source_BBupper > -41.0006 )
								ret := 0.403287
						if( dif_source_BBlower > 39.6917 )
							if( BBlower <= 329.337 )
								ret := -0.516393
							if( BBlower > 329.337 )
								ret := 0.170213
					if( BBlower > 338.037 )
						if( vrsi <= 64.8033 )
							if( crossunder_rsi_bbupperInt <= 0.5 )
								ret := 0.063797
							if( crossunder_rsi_bbupperInt > 0.5 )
								ret := 0.294118
						if( vrsi > 64.8033 )
							if( BBupper <= 632.193 )
								ret := -0.035120
							if( BBupper > 632.193 )
								ret := -0.370833
				if( BBlower > 577.233 )
					if( BBupper <= 621.616 )
						ret := 0.428571
					if( BBupper > 621.616 )
						if( BBupper <= 666.438 )
							ret := 1.000000 // buy
						if( BBupper > 666.438 )
							ret := 0.600000
			if( BBlower > 578.209 )
				if( BBupper <= 666.328 )
					if( dif_source_BBlower <= 9.06217 )
						if( BBlower <= 607.328 )
							ret := 0.285714
						if( BBlower > 607.328 )
							ret := -1.000000 // sell
					if( dif_source_BBlower > 9.06217 )
						if( vrsi <= 45.1451 )
							ret := -0.714286 // sell
						if( vrsi > 45.1451 )
							if( dif_source_BBlower <= 10.7881 )
								ret := -0.944444 // sell
							if( dif_source_BBlower > 10.7881 )
								ret := -1.000000 // sell
				if( BBupper > 666.328 )
					if( dif_source_BBupper <= -90.2032 )
						if( BBupper <= 668.255 )
							ret := 1.000000 // buy
						if( BBupper > 668.255 )
							ret := 0.000000
					if( dif_source_BBupper > -90.2032 )
						if( dif_source_BBlower <= -4.91749 )
							if( BBupper <= 672.86 )
								ret := 0.272727
							if( BBupper > 672.86 )
								ret := 0.750000 // buy
						if( dif_source_BBlower > -4.91749 )
							if( vrsi <= 40.9813 )
								ret := -0.378788
							if( vrsi > 40.9813 )
								ret := -0.718447 // sell
		if( BBupper > 676.607 )
			if( BBupper <= 1237.75 )
				if( dif_source_BBupper <= -36.4847 )
					if( dif_source_BBlower <= 448.436 )
						if( BBupper <= 1093.45 )
							if( BBupper <= 776.155 )
								ret := 0.725490 // buy
							if( BBupper > 776.155 )
								ret := 0.940476 // buy
						if( BBupper > 1093.45 )
							if( dif_source_BBupper <= -174.339 )
								ret := 0.876543 // buy
							if( dif_source_BBupper > -174.339 )
								ret := 0.348837
					if( dif_source_BBlower > 448.436 )
						if( vrsi <= 56.931 )
							ret := -1.000000 // sell
						if( vrsi > 56.931 )
							if( BBupper <= 1189.47 )
								ret := 0.000000
							if( BBupper > 1189.47 )
								ret := -1.000000 // sell
				if( dif_source_BBupper > -36.4847 )
					if( BBupper <= 1194.77 )
						if( dif_source_BBlower <= 434.442 )
							if( dif_source_BBupper <= -4.97347 )
								ret := -0.134583
							if( dif_source_BBupper > -4.97347 )
								ret := 0.448936
						if( dif_source_BBlower > 434.442 )
							if( vrsi <= 94.8843 )
								ret := -1.000000 // sell
							if( vrsi > 94.8843 )
								ret := -0.625000
					if( BBupper > 1194.77 )
						if( BBupper <= 1213.25 )
							if( vrsi <= 62.3837 )
								ret := 0.950000 // buy
							if( vrsi > 62.3837 )
								ret := 0.431034
						if( BBupper > 1213.25 )
							if( vrsi <= 56.8953 )
								ret := 0.516484
							if( vrsi > 56.8953 )
								ret := -0.698113
			if( BBupper > 1237.75 )
				if( dif_source_BBlower <= 237.474 )
					if( dif_source_BBupper <= -347.173 )
						if( BBupper <= 1682.26 )
							if( vrsi <= 23.3155 )
								ret := 1.000000 // buy
							if( vrsi > 23.3155 )
								ret := 0.633987
						if( BBupper > 1682.26 )
							if( dif_source_BBupper <= -568.786 )
								ret := 0.695652
							if( dif_source_BBupper > -568.786 )
								ret := -0.183673
					if( dif_source_BBupper > -347.173 )
						if( BBlower <= 965.733 )
							if( BBupper <= 1239.78 )
								ret := -0.818182 // sell
							if( BBupper > 1239.78 )
								ret := 0.462151
						if( BBlower > 965.733 )
							if( BBupper <= 1392.47 )
								ret := 0.020364
							if( BBupper > 1392.47 )
								ret := -0.587302
				if( dif_source_BBlower > 237.474 )
					if( BBlower <= 1055.84 )
						if( dif_source_BBupper <= -90.5713 )
							if( dif_source_BBupper <= -438.144 )
								ret := 0.400000
							if( dif_source_BBupper > -438.144 )
								ret := -0.963855 // sell
						if( dif_source_BBupper > -90.5713 )
							if( dif_source_BBupper <= -60.3344 )
								ret := 0.703704 // buy
							if( dif_source_BBupper > -60.3344 )
								ret := -0.283163
					if( BBlower > 1055.84 )
						if( BBlower <= 1069.08 )
							if( dif_source_BBupper <= -11.8023 )
								ret := 0.736842 // buy
							if( dif_source_BBupper > -11.8023 )
								ret := 1.000000 // buy
						if( BBlower > 1069.08 )
							if( dif_source_BBupper <= -2.09726 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -2.09726 )
								ret := -0.916667 // sell
	if( BBlower > 1090.74 )
		if( BBlower <= 1158.1 )
			if( dif_source_BBlower <= -20.4979 )
				if( BBlower <= 1098.59 )
					ret := -0.750000 // sell
				if( BBlower > 1098.59 )
					if( dif_source_BBupper <= -173.012 )
						if( BBupper <= 1442.18 )
							if( vrsi <= 20.3606 )
								ret := 0.166667
							if( vrsi > 20.3606 )
								ret := -0.428571
						if( BBupper > 1442.18 )
							ret := 1.000000 // buy
					if( dif_source_BBupper > -173.012 )
						if( dif_source_BBupper <= -144.42 )
							ret := 1.000000 // buy
						if( dif_source_BBupper > -144.42 )
							ret := 0.500000
			if( dif_source_BBlower > -20.4979 )
				if( vrsi <= 79.9279 )
					if( dif_source_BBlower <= 14.9773 )
						if( vrsi <= 67.7187 )
							if( BBupper <= 1622.04 )
								ret := -0.650190
							if( BBupper > 1622.04 )
								ret := 0.800000 // buy
						if( vrsi > 67.7187 )
							if( BBupper <= 1256.46 )
								ret := -0.400000
							if( BBupper > 1256.46 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 14.9773 )
						if( BBlower <= 1147.18 )
							if( dif_source_BBupper <= -121.187 )
								ret := 0.132075
							if( dif_source_BBupper > -121.187 )
								ret := -0.230297
						if( BBlower > 1147.18 )
							ret := -0.445946
				if( vrsi > 79.9279 )
					if( dif_source_BBlower <= 115.031 )
						if( BBlower <= 1109.11 )
							ret := -1.000000 // sell
						if( BBlower > 1109.11 )
							if( BBupper <= 1450.47 )
								ret := 0.475610
							if( BBupper > 1450.47 )
								ret := 0.896552 // buy
					if( dif_source_BBlower > 115.031 )
						if( dif_source_BBupper <= -6.91891 )
							if( BBlower <= 1142.64 )
								ret := 0.057692
							if( BBlower > 1142.64 )
								ret := -0.764706 // sell
						if( dif_source_BBupper > -6.91891 )
							if( dif_source_BBlower <= 267.399 )
								ret := 0.035714
							if( dif_source_BBlower > 267.399 )
								ret := -0.960784 // sell
		if( BBlower > 1158.1 )
			if( dif_source_BBlower <= 4.41275 )
				if( dif_source_BBlower <= -124.753 )
					if( BBlower <= 2801.53 )
						if( dif_source_BBupper <= -691.099 )
							if( BBlower <= 2426.25 )
								ret := 0.241379
							if( BBlower > 2426.25 )
								ret := -0.484536
						if( dif_source_BBupper > -691.099 )
							if( vrsi <= 27.0941 )
								ret := 0.977273 // buy
							if( vrsi > 27.0941 )
								ret := 0.500000
					if( BBlower > 2801.53 )
						if( dif_source_BBlower <= -152.595 )
							if( dif_source_BBupper <= -667.086 )
								ret := 0.761194 // buy
							if( dif_source_BBupper > -667.086 )
								ret := 0.250000
						if( dif_source_BBlower > -152.595 )
							if( BBupper <= 4559.42 )
								ret := 0.351064
							if( BBupper > 4559.42 )
								ret := -0.846154 // sell
				if( dif_source_BBlower > -124.753 )
					if( dif_source_BBlower <= -68.8861 )
						if( dif_source_BBlower <= -121.898 )
							if( BBlower <= 2860.22 )
								ret := -1.000000 // sell
							if( BBlower > 2860.22 )
								ret := 0.071429
						if( dif_source_BBlower > -121.898 )
							if( BBlower <= 2574.43 )
								ret := 0.413242
							if( BBlower > 2574.43 )
								ret := -0.203125
					if( dif_source_BBlower > -68.8861 )
						if( vrsi <= 44.9204 )
							if( dif_source_BBlower <= -56.6414 )
								ret := -0.209746
							if( dif_source_BBlower > -56.6414 )
								ret := -0.064268
						if( vrsi > 44.9204 )
							if( dif_source_BBupper <= -692.689 )
								ret := 0.401460
							if( dif_source_BBupper > -692.689 )
								ret := -0.250338
			if( dif_source_BBlower > 4.41275 )
				if( BBlower <= 1713.35 )
					if( dif_source_BBupper <= -85.4142 )
						if( BBupper <= 1411 )
							if( dif_source_BBlower <= 36.9309 )
								ret := 0.873333 // buy
							if( dif_source_BBlower > 36.9309 )
								ret := 0.270270
						if( BBupper > 1411 )
							if( vrsi <= 79.2736 )
								ret := 0.117214
							if( vrsi > 79.2736 )
								ret := 0.268041
					if( dif_source_BBupper > -85.4142 )
						if( BBupper <= 1972.62 )
							if( vrsi <= 94.5387 )
								ret := 0.004733
							if( vrsi > 94.5387 )
								ret := 0.294845
						if( BBupper > 1972.62 )
							if( dif_source_BBlower <= 343.215 )
								ret := 0.435986
							if( dif_source_BBlower > 343.215 )
								ret := -0.063694
				if( BBlower > 1713.35 )
					if( vrsi <= 87.7713 )
						if( BBupper <= 4937.83 )
							if( dif_source_BBlower <= 952.326 )
								ret := -0.021625
							if( dif_source_BBlower > 952.326 )
								ret := -0.505747
						if( BBupper > 4937.83 )
							if( dif_source_BBlower <= 152.832 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 152.832 )
								ret := 0.906250 // buy
					if( vrsi > 87.7713 )
						if( BBupper <= 3392.52 )
							if( BBlower <= 1717.3 )
								ret := -0.850000 // sell
							if( BBlower > 1717.3 )
								ret := 0.178256
						if( BBupper > 3392.52 )
							if( vrsi <= 87.9719 )
								ret := 0.466667
							if( vrsi > 87.9719 )
								ret := -0.136605
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_19615c5f(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


