//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: BNBUSDT_30Min_1BOL_685f88b9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1BOL_685f88b9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_685f88b9(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( dif_source_BBupper <= -109.201 )
		if( dif_source_BBlower <= 46.7463 )
			if( BBupper <= 382.454 )
				if( vrsi <= 15.1177 )
					if( vrsi <= 3.7013 )
						ret := -0.833333 // sell
					if( vrsi > 3.7013 )
						ret := 0.181818
				if( vrsi > 15.1177 )
					if( BBupper <= 328.491 )
						if( vrsi <= 42.484 )
							ret := 0.714286 // buy
						if( vrsi > 42.484 )
							ret := 1.000000 // buy
					if( BBupper > 328.491 )
						ret := 1.000000 // buy
			if( BBupper > 382.454 )
				if( BBupper <= 506.732 )
					if( vrsi <= 55.8908 )
						if( dif_source_BBupper <= -193.887 )
							if( dif_source_BBlower <= -12.9223 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -12.9223 )
								ret := 0.714286 // buy
						if( dif_source_BBupper > -193.887 )
							if( dif_source_BBupper <= -135.884 )
								ret := -0.869048 // sell
							if( dif_source_BBupper > -135.884 )
								ret := 0.038961
					if( vrsi > 55.8908 )
						if( BBlower <= 317.606 )
							if( dif_source_BBlower <= 40.7439 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 40.7439 )
								ret := 0.714286 // buy
						if( BBlower > 317.606 )
							ret := 0.142857
				if( BBupper > 506.732 )
					if( BBlower <= 542.09 )
						if( BBlower <= 536.059 )
							if( BBlower <= 283.882 )
								ret := 0.926829 // buy
							if( BBlower > 283.882 )
								ret := 0.317427
						if( BBlower > 536.059 )
							if( BBupper <= 676.904 )
								ret := -0.687500
							if( BBupper > 676.904 )
								ret := 1.000000 // buy
					if( BBlower > 542.09 )
						if( BBlower <= 592.713 )
							if( vrsi <= 75.0699 )
								ret := 0.822086 // buy
							if( vrsi > 75.0699 )
								ret := -0.181818
						if( BBlower > 592.713 )
							if( vrsi <= 18.5257 )
								ret := 0.916667 // buy
							if( vrsi > 18.5257 )
								ret := -0.148936
		if( dif_source_BBlower > 46.7463 )
			if( dif_source_BBupper <= -206.118 )
				if( dif_source_BBupper <= -242.296 )
					ret := 1.000000 // buy
				if( dif_source_BBupper > -242.296 )
					if( BBupper <= 624.952 )
						if( dif_source_BBlower <= 63.7442 )
							if( BBlower <= 265.937 )
								ret := 0.866667 // buy
							if( BBlower > 265.937 )
								ret := -0.888889 // sell
						if( dif_source_BBlower > 63.7442 )
							if( vrsi <= 56.0418 )
								ret := 0.884615 // buy
							if( vrsi > 56.0418 )
								ret := 0.142857
					if( BBupper > 624.952 )
						ret := -0.888889 // sell
			if( dif_source_BBupper > -206.118 )
				if( dif_source_BBupper <= -155.993 )
					if( BBlower <= 259.091 )
						ret := 0.666667
					if( BBlower > 259.091 )
						if( BBupper <= 587.808 )
							ret := -1.000000 // sell
						if( BBupper > 587.808 )
							if( BBupper <= 596.321 )
								ret := -0.857143 // sell
							if( BBupper > 596.321 )
								ret := -1.000000 // sell
				if( dif_source_BBupper > -155.993 )
					if( BBupper <= 427.121 )
						if( dif_source_BBupper <= -130.867 )
							if( BBupper <= 426.729 )
								ret := 1.000000 // buy
							if( BBupper > 426.729 )
								ret := 0.857143 // buy
						if( dif_source_BBupper > -130.867 )
							if( BBlower <= 218.004 )
								ret := 1.000000 // buy
							if( BBlower > 218.004 )
								ret := -1.000000 // sell
					if( BBupper > 427.121 )
						if( dif_source_BBlower <= 53.7105 )
							if( BBupper <= 507.406 )
								ret := -0.823529 // sell
							if( BBupper > 507.406 )
								ret := 0.392857
						if( dif_source_BBlower > 53.7105 )
							if( BBlower <= 398.404 )
								ret := -0.973684 // sell
							if( BBlower > 398.404 )
								ret := -0.312500
	if( dif_source_BBupper > -109.201 )
		if( BBlower <= 194.709 )
			if( BBupper <= 52.2181 )
				if( dif_source_BBlower <= 5.30184 )
					if( dif_source_BBupper <= -7.65514 )
						if( BBlower <= 38.7826 )
							if( vrsi <= 57.1619 )
								ret := 0.861386 // buy
							if( vrsi > 57.1619 )
								ret := 0.000000
						if( BBlower > 38.7826 )
							if( dif_source_BBupper <= -8.90518 )
								ret := 0.800000 // buy
							if( dif_source_BBupper > -8.90518 )
								ret := -0.481481
					if( dif_source_BBupper > -7.65514 )
						if( BBupper <= 27.4505 )
							if( BBlower <= 18.5995 )
								ret := -0.560976
							if( BBlower > 18.5995 )
								ret := 0.404762
						if( BBupper > 27.4505 )
							if( BBlower <= 29.8248 )
								ret := 0.046538
							if( BBlower > 29.8248 )
								ret := 0.165814
				if( dif_source_BBlower > 5.30184 )
					if( vrsi <= 28.8498 )
						if( dif_source_BBlower <= 6.11767 )
							if( dif_source_BBupper <= -1.80923 )
								ret := 0.714286 // buy
							if( dif_source_BBupper > -1.80923 )
								ret := -0.318182
						if( dif_source_BBlower > 6.11767 )
							if( BBlower <= 22.2923 )
								ret := 0.952381 // buy
							if( BBlower > 22.2923 )
								ret := 0.511628
					if( vrsi > 28.8498 )
						if( BBupper <= 29.8295 )
							if( BBlower <= 21.7611 )
								ret := -0.228571
							if( BBlower > 21.7611 )
								ret := 0.897959 // buy
						if( BBupper > 29.8295 )
							if( BBlower <= 40.5903 )
								ret := -0.324207
							if( BBlower > 40.5903 )
								ret := 0.718750 // buy
			if( BBupper > 52.2181 )
				if( dif_source_BBlower <= 22.7765 )
					if( BBupper <= 136.484 )
						if( BBlower <= 42.8593 )
							if( dif_source_BBlower <= 10.4205 )
								ret := 0.623762
							if( dif_source_BBlower > 10.4205 )
								ret := -0.827586 // sell
						if( BBlower > 42.8593 )
							if( BBupper <= 79.0168 )
								ret := 0.630081
							if( BBupper > 79.0168 )
								ret := 0.913978 // buy
					if( BBupper > 136.484 )
						if( dif_source_BBupper <= -7.63106 )
							if( BBlower <= 114.099 )
								ret := -0.166667
							if( BBlower > 114.099 )
								ret := 0.575540
						if( dif_source_BBupper > -7.63106 )
							if( dif_source_BBlower <= 10.8684 )
								ret := -0.476923
							if( dif_source_BBlower > 10.8684 )
								ret := 0.231579
				if( dif_source_BBlower > 22.7765 )
					if( BBlower <= 47.6549 )
						if( dif_source_BBlower <= 83.946 )
							if( BBlower <= 44.9641 )
								ret := 0.207407
							if( BBlower > 44.9641 )
								ret := -0.833333 // sell
						if( dif_source_BBlower > 83.946 )
							if( BBlower <= 45.695 )
								ret := -0.962264 // sell
							if( BBlower > 45.695 )
								ret := 0.142857
					if( BBlower > 47.6549 )
						if( dif_source_BBupper <= 1.38011 )
							if( vrsi <= 22.5862 )
								ret := 0.753846 // buy
							if( vrsi > 22.5862 )
								ret := -0.031524
						if( dif_source_BBupper > 1.38011 )
							if( dif_source_BBlower <= 261.674 )
								ret := 0.615385
							if( dif_source_BBlower > 261.674 )
								ret := -1.000000 // sell
		if( BBlower > 194.709 )
			if( BBupper <= 671.735 )
				if( BBlower <= 198.256 )
					if( dif_source_BBlower <= 22.2005 )
						if( dif_source_BBlower <= 19.4497 )
							if( dif_source_BBupper <= -38.2115 )
								ret := -0.148148
							if( dif_source_BBupper > -38.2115 )
								ret := -0.852941 // sell
						if( dif_source_BBlower > 19.4497 )
							if( dif_source_BBupper <= -61.8508 )
								ret := -1.000000 // sell
							if( dif_source_BBupper > -61.8508 )
								ret := 0.545455
					if( dif_source_BBlower > 22.2005 )
						if( BBupper <= 259.07 )
							if( BBlower <= 197.983 )
								ret := -0.777778 // sell
							if( BBlower > 197.983 )
								ret := -0.142857
						if( BBupper > 259.07 )
							if( dif_source_BBupper <= -76.539 )
								ret := -0.285714
							if( dif_source_BBupper > -76.539 )
								ret := -1.000000 // sell
				if( BBlower > 198.256 )
					if( dif_source_BBupper <= 9.6028 )
						if( BBupper <= 584.989 )
							if( BBupper <= 582.28 )
								ret := 0.047106
							if( BBupper > 582.28 )
								ret := 0.303493
						if( BBupper > 584.989 )
							if( BBlower <= 388.776 )
								ret := -0.871795 // sell
							if( BBlower > 388.776 )
								ret := -0.012539
					if( dif_source_BBupper > 9.6028 )
						if( BBlower <= 354.731 )
							if( BBlower <= 227.697 )
								ret := 0.057143
							if( BBlower > 227.697 )
								ret := -0.559727
						if( BBlower > 354.731 )
							if( dif_source_BBlower <= 207.534 )
								ret := -0.076046
							if( dif_source_BBlower > 207.534 )
								ret := -1.000000 // sell
			if( BBupper > 671.735 )
				if( vrsi <= 51.6773 )
					if( BBupper <= 684.199 )
						if( BBupper <= 681.59 )
							if( dif_source_BBlower <= -6.56352 )
								ret := 0.727273 // buy
							if( dif_source_BBlower > -6.56352 )
								ret := -0.188312
						if( BBupper > 681.59 )
							if( BBlower <= 609.033 )
								ret := 0.586207
							if( BBlower > 609.033 )
								ret := 0.848485 // buy
					if( BBupper > 684.199 )
						if( vrsi <= 26.1362 )
							if( BBlower <= 666.957 )
								ret := -0.570513
							if( BBlower > 666.957 )
								ret := 0.266667
						if( vrsi > 26.1362 )
							if( vrsi <= 35.1114 )
								ret := 0.206349
							if( vrsi > 35.1114 )
								ret := -0.240506
				if( vrsi > 51.6773 )
					if( BBlower <= 609.008 )
						if( BBupper <= 702.619 )
							if( dif_source_BBlower <= 70.7775 )
								ret := -0.761628 // sell
							if( dif_source_BBlower > 70.7775 )
								ret := -0.353846
						if( BBupper > 702.619 )
							if( dif_source_BBupper <= -76.477 )
								ret := 0.322581
							if( dif_source_BBupper > -76.477 )
								ret := -0.520833
					if( BBlower > 609.008 )
						if( dif_source_BBlower <= 20.1292 )
							if( dif_source_BBlower <= -9.15385 )
								ret := 0.666667
							if( dif_source_BBlower > -9.15385 )
								ret := -0.586667
						if( dif_source_BBlower > 20.1292 )
							if( dif_source_BBupper <= -6.79039 )
								ret := 0.346154
							if( dif_source_BBupper > -6.79039 )
								ret := -0.875000 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_685f88b9(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


