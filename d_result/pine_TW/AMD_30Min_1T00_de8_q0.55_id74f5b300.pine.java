//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AMD_30Min_1T00_74f5b300 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1T00_74f5b300", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_74f5b300(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema3 <= 6.70082 )
		if( ema3 <= 2.90832 )
			if( ema3 <= 2.78948 )
				if( ema1 <= 1.85508 )
					if( ema12 <= -0.001964 )
						if( tema <= 1.83037 )
							if( ema1 <= 1.82944 )
								ret := 0.333333
							if( ema1 > 1.82944 )
								if( ema1 <= 1.84269 )
									ret := 1.000000 // buy
								if( ema1 > 1.84269 )
									ret := 0.818182 // buy
						if( tema > 1.83037 )
							ret := -0.090909
					if( ema12 > -0.001964 )
						if( ema3 <= 1.85177 )
							ret := 1.000000 // buy
						if( ema3 > 1.85177 )
							ret := 0.866667 // buy
				if( ema1 > 1.85508 )
					if( ema2 <= 1.88204 )
						if( ema1 <= 1.86123 )
							if( ema12 <= 0.00303 )
								ret := -0.300000
							if( ema12 > 0.00303 )
								ret := -0.739130 // sell
						if( ema1 > 1.86123 )
							if( ema3 <= 1.85912 )
								if( ema13 <= 0.013738 )
									ret := -0.937500 // sell
								if( ema13 > 0.013738 )
									ret := -0.666667
							if( ema3 > 1.85912 )
								ret := -1.000000 // sell
					if( ema2 > 1.88204 )
						if( ema1 <= 2.79974 )
							if( ema1 <= 2.48666 )
								if( ema3 <= 2.29388 )
									ret := 0.050235
								if( ema3 > 2.29388 )
									ret := -0.230964
							if( ema1 > 2.48666 )
								if( ema3 <= 2.52363 )
									ret := 0.759494 // buy
								if( ema3 > 2.52363 )
									ret := 0.122137
						if( ema1 > 2.79974 )
							if( ema13 <= 0.027437 )
								ret := -0.500000
							if( ema13 > 0.027437 )
								ret := -1.000000 // sell
			if( ema3 > 2.78948 )
				if( ema2 <= 2.89779 )
					if( ema13 <= -0.020056 )
						if( ema13 <= -0.044215 )
							if( ema2 <= 2.80784 )
								ret := -0.625000
							if( ema2 > 2.80784 )
								ret := -0.352941
						if( ema13 > -0.044215 )
							if( ema12 <= -0.012119 )
								if( ema3 <= 2.87322 )
									ret := 0.882353 // buy
								if( ema3 > 2.87322 )
									ret := 0.500000
							if( ema12 > -0.012119 )
								ret := 0.000000
					if( ema13 > -0.020056 )
						if( ema12 <= 0.018459 )
							if( ema12 <= -0.006084 )
								if( ema2 <= 2.79332 )
									ret := -0.916667 // sell
								if( ema2 > 2.79332 )
									ret := 0.179487
							if( ema12 > -0.006084 )
								if( ema1 <= 2.79441 )
									ret := -0.111111
								if( ema1 > 2.79441 )
									ret := -0.787356 // sell
						if( ema12 > 0.018459 )
							if( tema <= 2.91324 )
								if( ema1 <= 2.87415 )
									ret := 0.666667
								if( ema1 > 2.87415 )
									ret := 0.875000 // buy
							if( tema > 2.91324 )
								ret := -0.692308
				if( ema2 > 2.89779 )
					if( ema2 <= 2.8997 )
						ret := -0.928571 // sell
					if( ema2 > 2.8997 )
						ret := -1.000000 // sell
		if( ema3 > 2.90832 )
			if( ema1 <= 3.62649 )
				if( ema2 <= 3.49587 )
					if( ema3 <= 3.04501 )
						ret := 0.900000 // buy
					if( ema3 > 3.04501 )
						ret := 1.000000 // buy
				if( ema2 > 3.49587 )
					if( ema1 <= 3.54901 )
						if( ema12 <= -0.053042 )
							ret := -0.888889 // sell
						if( ema12 > -0.053042 )
							ret := 0.000000
					if( ema1 > 3.54901 )
						if( ema3 <= 3.61189 )
							if( ema13 <= 0.022538 )
								if( ema13 <= -0.000997 )
									ret := 0.775000 // buy
								if( ema13 > -0.000997 )
									ret := 1.000000 // buy
							if( ema13 > 0.022538 )
								ret := 0.363636
						if( ema3 > 3.61189 )
							if( tema <= 3.59876 )
								if( ema3 <= 3.64702 )
									ret := 0.625000
								if( ema3 > 3.64702 )
									ret := 0.950000 // buy
							if( tema > 3.59876 )
								if( ema3 <= 3.61528 )
									ret := -0.333333
								if( ema3 > 3.61528 )
									ret := -0.680000
			if( ema1 > 3.62649 )
				if( ema1 <= 3.6819 )
					if( ema2 <= 3.64911 )
						if( ema2 <= 3.60961 )
							ret := -0.882353 // sell
						if( ema2 > 3.60961 )
							if( tema <= 3.66811 )
								ret := -0.176471
							if( tema > 3.66811 )
								if( ema3 <= 3.61007 )
									ret := 0.900000 // buy
								if( ema3 > 3.61007 )
									ret := 0.368421
					if( ema2 > 3.64911 )
						if( ema13 <= -0.012312 )
							if( ema12 <= -0.01459 )
								ret := -0.266667
							if( ema12 > -0.01459 )
								ret := 0.363636
						if( ema13 > -0.012312 )
							if( ema2 <= 3.67415 )
								if( ema1 <= 3.65707 )
									ret := -0.666667
								if( ema1 > 3.65707 )
									ret := -1.000000 // sell
							if( ema2 > 3.67415 )
								if( ema1 <= 3.6788 )
									ret := -0.538462
								if( ema1 > 3.6788 )
									ret := -0.909091 // sell
				if( ema1 > 3.6819 )
					if( tema <= 6.86623 )
						if( ema1 <= 6.68259 )
							if( tema <= 3.71723 )
								if( ema12 <= 0.003821 )
									ret := 0.500000
								if( ema12 > 0.003821 )
									ret := 0.885714 // buy
							if( tema > 3.71723 )
								if( ema12 <= -0.068001 )
									ret := 0.537931
								if( ema12 > -0.068001 )
									ret := 0.108015
						if( ema1 > 6.68259 )
							if( ema3 <= 6.61709 )
								if( ema13 <= 0.099225 )
									ret := -1.000000 // sell
								if( ema13 > 0.099225 )
									ret := 0.619048
							if( ema3 > 6.61709 )
								if( ema1 <= 6.72501 )
									ret := 0.955882 // buy
								if( ema1 > 6.72501 )
									ret := 0.549451
					if( tema > 6.86623 )
						if( ema3 <= 6.61288 )
							if( ema13 <= 0.22823 )
								ret := -0.916667 // sell
							if( ema13 > 0.22823 )
								ret := -1.000000 // sell
						if( ema3 > 6.61288 )
							ret := -0.166667
	if( ema3 > 6.70082 )
		if( ema2 <= 7.5657 )
			if( tema <= 7.51737 )
				if( ema13 <= -0.105892 )
					if( tema <= 6.53661 )
						if( tema <= 6.52508 )
							if( ema13 <= -0.185144 )
								if( ema12 <= -0.140012 )
									ret := -0.300000
								if( ema12 > -0.140012 )
									ret := -1.000000 // sell
							if( ema13 > -0.185144 )
								if( ema1 <= 6.64411 )
									ret := 0.384615
								if( ema1 > 6.64411 )
									ret := -0.125000
						if( tema > 6.52508 )
							ret := -1.000000 // sell
					if( tema > 6.53661 )
						if( ema2 <= 7.20816 )
							if( ema12 <= -0.064197 )
								if( ema3 <= 6.88203 )
									ret := 0.800000 // buy
								if( ema3 > 6.88203 )
									ret := 0.953125 // buy
							if( ema12 > -0.064197 )
								if( ema1 <= 7.06797 )
									ret := 0.545455
								if( ema1 > 7.06797 )
									ret := 1.000000 // buy
						if( ema2 > 7.20816 )
							if( ema2 <= 7.25723 )
								ret := -0.555556
							if( ema2 > 7.25723 )
								ret := 0.277778
				if( ema13 > -0.105892 )
					if( ema1 <= 6.80582 )
						if( tema <= 6.7041 )
							if( tema <= 6.63945 )
								if( ema13 <= -0.080632 )
									ret := 0.800000 // buy
								if( ema13 > -0.080632 )
									ret := 0.375000
							if( tema > 6.63945 )
								if( ema13 <= -0.03738 )
									ret := -0.283333
								if( ema13 > -0.03738 )
									ret := -0.773585 // sell
						if( tema > 6.7041 )
							if( ema2 <= 6.72717 )
								if( ema3 <= 6.72032 )
									ret := -0.933333 // sell
								if( ema3 > 6.72032 )
									ret := 0.000000
							if( ema2 > 6.72717 )
								if( ema1 <= 6.74657 )
									ret := 0.837209 // buy
								if( ema1 > 6.74657 )
									ret := 0.269006
					if( ema1 > 6.80582 )
						if( ema13 <= 0.060191 )
							if( ema3 <= 6.9659 )
								if( tema <= 6.84628 )
									ret := -0.136000
								if( tema > 6.84628 )
									ret := -0.681992
							if( ema3 > 6.9659 )
								if( ema12 <= -0.003997 )
									ret := -0.336134
								if( ema12 > -0.003997 )
									ret := 0.096774
						if( ema13 > 0.060191 )
							if( ema1 <= 6.90353 )
								if( ema2 <= 6.82846 )
									ret := -0.486486
								if( ema2 > 6.82846 )
									ret := -1.000000 // sell
							if( ema1 > 6.90353 )
								if( ema2 <= 7.15858 )
									ret := 0.402235
								if( ema2 > 7.15858 )
									ret := -0.214286
			if( tema > 7.51737 )
				if( ema2 <= 7.44729 )
					if( tema <= 7.53707 )
						ret := -0.666667
					if( tema > 7.53707 )
						ret := -1.000000 // sell
				if( ema2 > 7.44729 )
					if( ema3 <= 7.4847 )
						ret := 0.250000
					if( ema3 > 7.4847 )
						if( ema1 <= 7.54081 )
							ret := -1.000000 // sell
						if( ema1 > 7.54081 )
							ret := -0.833333 // sell
		if( ema2 > 7.5657 )
			if( ema3 <= 9.89965 )
				if( ema13 <= 0.19002 )
					if( ema13 <= -0.09883 )
						if( ema13 <= -0.192673 )
							ret := -0.235294
						if( ema13 > -0.192673 )
							if( ema3 <= 9.83775 )
								if( ema2 <= 9.39677 )
									ret := 0.500000
								if( ema2 > 9.39677 )
									ret := 0.903846 // buy
							if( ema3 > 9.83775 )
								ret := -0.500000
					if( ema13 > -0.09883 )
						if( ema1 <= 8.91001 )
							if( ema1 <= 8.42057 )
								if( ema12 <= 0.053154 )
									ret := 0.149068
								if( ema12 > 0.053154 )
									ret := -0.842105 // sell
							if( ema1 > 8.42057 )
								if( ema1 <= 8.76303 )
									ret := 0.593103
								if( ema1 > 8.76303 )
									ret := 0.286822
						if( ema1 > 8.91001 )
							if( ema1 <= 9.22392 )
								if( ema12 <= 0.027397 )
									ret := -0.245283
								if( ema12 > 0.027397 )
									ret := -0.812500 // sell
							if( ema1 > 9.22392 )
								if( tema <= 9.47495 )
									ret := 0.711111 // buy
								if( tema > 9.47495 )
									ret := 0.088773
				if( ema13 > 0.19002 )
					if( ema3 <= 9.2605 )
						if( ema3 <= 7.77193 )
							ret := 0.916667 // buy
						if( ema3 > 7.77193 )
							if( ema12 <= 0.138404 )
								ret := 0.583333
							if( ema12 > 0.138404 )
								ret := 0.157895
					if( ema3 > 9.2605 )
						if( ema12 <= 0.12476 )
							ret := 1.000000 // buy
						if( ema12 > 0.12476 )
							ret := 0.583333
			if( ema3 > 9.89965 )
				if( ema13 <= -1.0153 )
					if( ema1 <= 39.9553 )
						if( ema2 <= 31.5968 )
							if( ema1 <= 24.7562 )
								if( ema2 <= 20.1989 )
									ret := 0.066667
								if( ema2 > 20.1989 )
									ret := 1.000000 // buy
							if( ema1 > 24.7562 )
								if( ema2 <= 25.7604 )
									ret := -1.000000 // sell
								if( ema2 > 25.7604 )
									ret := -0.100000
						if( ema2 > 31.5968 )
							if( ema1 <= 31.4899 )
								ret := 0.916667 // buy
							if( ema1 > 31.4899 )
								ret := 1.000000 // buy
					if( ema1 > 39.9553 )
						if( ema2 <= 43.1879 )
							if( tema <= 39.1653 )
								ret := -0.750000 // sell
							if( tema > 39.1653 )
								if( ema1 <= 42.2726 )
									ret := -1.000000 // sell
								if( ema1 > 42.2726 )
									ret := -0.777778 // sell
						if( ema2 > 43.1879 )
							if( ema2 <= 83.5006 )
								if( ema3 <= 73.9091 )
									ret := -0.160745
								if( ema3 > 73.9091 )
									ret := 0.251656
							if( ema2 > 83.5006 )
								if( ema1 <= 84.1227 )
									ret := -0.523256
								if( ema1 > 84.1227 )
									ret := -0.111988
				if( ema13 > -1.0153 )
					if( ema13 <= 5.32989 )
						if( ema2 <= 177.754 )
							if( ema1 <= 104.344 )
								if( ema2 <= 103.934 )
									ret := -0.004966
								if( ema2 > 103.934 )
									ret := -0.724138 // sell
							if( ema1 > 104.344 )
								if( ema13 <= 5.25734 )
									ret := 0.042757
								if( ema13 > 5.25734 )
									ret := -1.000000 // sell
						if( ema2 > 177.754 )
							if( ema3 <= 180.113 )
								if( ema13 <= -0.513538 )
									ret := 0.166667
								if( ema13 > -0.513538 )
									ret := -0.466887
							if( ema3 > 180.113 )
								if( ema13 <= -0.302833 )
									ret := -0.500000
								if( ema13 > -0.302833 )
									ret := 0.047203
					if( ema13 > 5.32989 )
						if( tema <= 186.155 )
							if( ema1 <= 146.966 )
								if( ema3 <= 139.421 )
									ret := 0.478261
								if( ema3 > 139.421 )
									ret := 1.000000 // buy
							if( ema1 > 146.966 )
								ret := -0.277778
						if( tema > 186.155 )
							if( ema2 <= 187.236 )
								ret := 1.000000 // buy
							if( ema2 > 187.236 )
								ret := 0.583333
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AMD_30Min_74f5b300(ema3, tema, ema2, ema12, ema13, ema1)

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


