//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: DOTUSDT_30Min_1T00_d23a58bd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_1T00_d23a58bd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_d23a58bd(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.276409 )
		if( tema <= 17.7843 )
			if( ema3 <= 16.471 )
				if( tema <= 7.85581 )
					if( ema12 <= -0.300472 )
						if( tema <= 7.73728 )
							ret := 1.000000 // buy
						if( tema > 7.73728 )
							if( ema12 <= -0.350423 )
								ret := 1.000000 // buy
							if( ema12 > -0.350423 )
								ret := 0.666667
					if( ema12 > -0.300472 )
						ret := 0.571429
				if( tema > 7.85581 )
					if( ema12 <= -0.309687 )
						if( ema13 <= -0.825977 )
							if( ema2 <= 15.17 )
								ret := 1.000000 // buy
							if( ema2 > 15.17 )
								ret := 0.500000
						if( ema13 > -0.825977 )
							if( ema3 <= 15.5282 )
								if( ema3 <= 15.3604 )
									ret := -0.322581
								if( ema3 > 15.3604 )
									ret := 0.750000 // buy
							if( ema3 > 15.5282 )
								if( ema12 <= -0.447954 )
									ret := -0.500000
								if( ema12 > -0.447954 )
									ret := -1.000000 // sell
					if( ema12 > -0.309687 )
						if( ema3 <= 11.0192 )
							if( tema <= 9.13995 )
								ret := 0.600000
							if( tema > 9.13995 )
								ret := -1.000000 // sell
						if( ema3 > 11.0192 )
							if( tema <= 12.7295 )
								if( ema2 <= 11.639 )
									ret := 0.800000 // buy
								if( ema2 > 11.639 )
									ret := 0.250000
							if( tema > 12.7295 )
								ret := 1.000000 // buy
			if( ema3 > 16.471 )
				if( ema3 <= 19.687 )
					if( tema <= 16.2336 )
						if( ema13 <= -0.575765 )
							ret := 1.000000 // buy
						if( ema13 > -0.575765 )
							ret := 0.500000
					if( tema > 16.2336 )
						if( ema2 <= 17.8845 )
							if( ema3 <= 17.4292 )
								if( tema <= 16.369 )
									ret := 0.750000 // buy
								if( tema > 16.369 )
									ret := 1.000000 // buy
							if( ema3 > 17.4292 )
								if( ema2 <= 17.2769 )
									ret := -1.000000 // sell
								if( ema2 > 17.2769 )
									ret := 0.000000
						if( ema2 > 17.8845 )
							if( ema3 <= 18.8594 )
								if( tema <= 17.3826 )
									ret := 0.857143 // buy
								if( tema > 17.3826 )
									ret := 0.333333
							if( ema3 > 18.8594 )
								if( ema2 <= 18.7407 )
									ret := 1.000000 // buy
								if( ema2 > 18.7407 )
									ret := 0.833333 // buy
				if( ema3 > 19.687 )
					if( tema <= 17.1643 )
						ret := -1.000000 // sell
					if( tema > 17.1643 )
						ret := 0.500000
		if( tema > 17.7843 )
			if( ema12 <= -1.50115 )
				if( tema <= 27.2039 )
					if( ema1 <= 28.4257 )
						ret := 0.750000 // buy
					if( ema1 > 28.4257 )
						ret := 1.000000 // buy
				if( tema > 27.2039 )
					if( ema1 <= 30.5689 )
						ret := -0.500000
					if( ema1 > 30.5689 )
						if( ema13 <= -2.52813 )
							ret := 0.500000
						if( ema13 > -2.52813 )
							ret := 1.000000 // buy
			if( ema12 > -1.50115 )
				if( ema3 <= 46.6161 )
					if( tema <= 41.2206 )
						if( ema2 <= 38.4309 )
							if( ema3 <= 31.5685 )
								if( ema1 <= 28.8963 )
									ret := 0.140196
								if( ema1 > 28.8963 )
									ret := 0.701493 // buy
							if( ema3 > 31.5685 )
								if( ema12 <= -0.391569 )
									ret := -0.135008
								if( ema12 > -0.391569 )
									ret := 0.231608
						if( ema2 > 38.4309 )
							if( tema <= 38.6259 )
								if( tema <= 37.6026 )
									ret := 0.977778 // buy
								if( tema > 37.6026 )
									ret := 0.567568
							if( tema > 38.6259 )
								if( ema3 <= 40.2099 )
									ret := -0.196078
								if( ema3 > 40.2099 )
									ret := 0.381818
					if( tema > 41.2206 )
						if( tema <= 45.3823 )
							if( ema3 <= 45.8387 )
								if( ema3 <= 44.6262 )
									ret := -0.125828
								if( ema3 > 44.6262 )
									ret := -0.785714 // sell
							if( ema3 > 45.8387 )
								if( ema12 <= -0.358851 )
									ret := 0.769231 // buy
								if( ema12 > -0.358851 )
									ret := -0.125000
						if( tema > 45.3823 )
							if( ema13 <= -0.542303 )
								ret := -1.000000 // sell
							if( ema13 > -0.542303 )
								ret := -0.750000 // sell
				if( ema3 > 46.6161 )
					if( ema3 <= 51.0211 )
						if( ema12 <= -0.915097 )
							ret := -0.250000
						if( ema12 > -0.915097 )
							if( ema12 <= -0.31816 )
								if( ema12 <= -0.505963 )
									ret := 0.944444 // buy
								if( ema12 > -0.505963 )
									ret := 0.714286 // buy
							if( ema12 > -0.31816 )
								if( ema2 <= 48.6582 )
									ret := -0.125000
								if( ema2 > 48.6582 )
									ret := 1.000000 // buy
					if( ema3 > 51.0211 )
						if( ema2 <= 51.1209 )
							ret := -0.500000
						if( ema2 > 51.1209 )
							if( ema12 <= -0.302363 )
								if( tema <= 50.9828 )
									ret := 0.285714
								if( tema > 50.9828 )
									ret := -0.111111
							if( ema12 > -0.302363 )
								ret := 0.500000
	if( ema12 > -0.276409 )
		if( ema3 <= 42.7026 )
			if( ema12 <= -0.021819 )
				if( ema1 <= 6.77798 )
					if( ema13 <= -0.069852 )
						if( tema <= 4.83792 )
							if( tema <= 4.02601 )
								if( tema <= 3.9048 )
									ret := 0.826667 // buy
								if( tema > 3.9048 )
									ret := 0.412500
							if( tema > 4.02601 )
								if( ema13 <= -0.297405 )
									ret := 1.000000 // buy
								if( ema13 > -0.297405 )
									ret := -0.070288
						if( tema > 4.83792 )
							if( ema2 <= 6.49667 )
								if( ema1 <= 5.29361 )
									ret := 0.452685
								if( ema1 > 5.29361 )
									ret := 0.219075
							if( ema2 > 6.49667 )
								if( ema3 <= 6.68597 )
									ret := 0.616822
								if( ema3 > 6.68597 )
									ret := 0.373239
					if( ema13 > -0.069852 )
						if( ema3 <= 4.70404 )
							if( ema3 <= 4.65796 )
								if( ema3 <= 4.46978 )
									ret := 0.262473
								if( ema3 > 4.46978 )
									ret := 0.030864
							if( ema3 > 4.65796 )
								if( ema13 <= -0.054119 )
									ret := 0.269231
								if( ema13 > -0.054119 )
									ret := 0.850000 // buy
						if( ema3 > 4.70404 )
							if( ema3 <= 4.72619 )
								if( tema <= 4.63436 )
									ret := -0.200000
								if( tema > 4.63436 )
									ret := -0.736842 // sell
							if( ema3 > 4.72619 )
								if( ema1 <= 4.67328 )
									ret := 1.000000 // buy
								if( ema1 > 4.67328 )
									ret := 0.034318
				if( ema1 > 6.77798 )
					if( ema2 <= 42.1308 )
						if( ema12 <= -0.099198 )
							if( ema1 <= 41.3538 )
								if( ema1 <= 7.02667 )
									ret := -0.453333
								if( ema1 > 7.02667 )
									ret := 0.106736
							if( ema1 > 41.3538 )
								if( ema3 <= 41.8192 )
									ret := -0.909091 // sell
								if( ema3 > 41.8192 )
									ret := -0.383333
						if( ema12 > -0.099198 )
							if( tema <= 6.72338 )
								if( ema12 <= -0.088913 )
									ret := 0.727273 // buy
								if( ema12 > -0.088913 )
									ret := 0.950000 // buy
							if( tema > 6.72338 )
								if( ema2 <= 6.81618 )
									ret := -0.666667
								if( ema2 > 6.81618 )
									ret := 0.023747
					if( ema2 > 42.1308 )
						if( ema12 <= -0.106622 )
							if( ema1 <= 42.212 )
								if( ema13 <= -0.297464 )
									ret := 0.961538 // buy
								if( ema13 > -0.297464 )
									ret := 0.833333 // buy
							if( ema1 > 42.212 )
								if( ema2 <= 42.6266 )
									ret := -0.250000
								if( ema2 > 42.6266 )
									ret := 1.000000 // buy
						if( ema12 > -0.106622 )
							if( ema3 <= 42.477 )
								if( ema2 <= 42.3185 )
									ret := 0.250000
								if( ema2 > 42.3185 )
									ret := 0.000000
							if( ema3 > 42.477 )
								ret := 0.500000
			if( ema12 > -0.021819 )
				if( ema13 <= 0.005201 )
					if( ema3 <= 7.03429 )
						if( ema3 <= 6.91716 )
							if( tema <= 6.83255 )
								if( ema1 <= 4.41988 )
									ret := 0.061777
								if( ema1 > 4.41988 )
									ret := -0.002027
							if( tema > 6.83255 )
								if( ema1 <= 6.87279 )
									ret := -0.432432
								if( ema1 > 6.87279 )
									ret := 0.018182
						if( ema3 > 6.91716 )
							if( tema <= 6.99051 )
								if( ema2 <= 6.99944 )
									ret := 0.283262
								if( ema2 > 6.99944 )
									ret := 0.740741 // buy
							if( tema > 6.99051 )
								if( tema <= 7.03986 )
									ret := -0.069767
								if( tema > 7.03986 )
									ret := 0.900000 // buy
					if( ema3 > 7.03429 )
						if( tema <= 7.21448 )
							if( ema2 <= 7.09881 )
								if( ema2 <= 7.038 )
									ret := -0.123288
								if( ema2 > 7.038 )
									ret := -0.415385
							if( ema2 > 7.09881 )
								if( ema2 <= 7.22591 )
									ret := -0.115839
								if( ema2 > 7.22591 )
									ret := -0.560000
						if( tema > 7.21448 )
							if( ema2 <= 7.30021 )
								if( ema1 <= 7.26759 )
									ret := 0.039326
								if( ema1 > 7.26759 )
									ret := 0.716667 // buy
							if( ema2 > 7.30021 )
								if( ema13 <= -0.256913 )
									ret := -0.641026
								if( ema13 > -0.256913 )
									ret := -0.039092
				if( ema13 > 0.005201 )
					if( ema13 <= 0.717118 )
						if( ema12 <= -0.001812 )
							if( ema3 <= 16.9484 )
								if( ema1 <= 8.35827 )
									ret := 0.106825
								if( ema1 > 8.35827 )
									ret := 0.503759
							if( ema3 > 16.9484 )
								if( ema2 <= 17.1376 )
									ret := -0.789474 // sell
								if( ema2 > 17.1376 )
									ret := 0.139466
						if( ema12 > -0.001812 )
							if( ema2 <= 41.0953 )
								if( ema2 <= 40.8246 )
									ret := 0.052648
								if( ema2 > 40.8246 )
									ret := 0.687023
							if( ema2 > 41.0953 )
								if( tema <= 41.7333 )
									ret := -0.368421
								if( tema > 41.7333 )
									ret := -0.026119
					if( ema13 > 0.717118 )
						if( tema <= 44.2801 )
							if( ema2 <= 38.3185 )
								if( tema <= 38.8812 )
									ret := -0.082084
								if( tema > 38.8812 )
									ret := 0.711111 // buy
							if( ema2 > 38.3185 )
								if( ema2 <= 40.8972 )
									ret := -0.557047
								if( ema2 > 40.8972 )
									ret := 0.066667
						if( tema > 44.2801 )
							if( ema1 <= 43.6925 )
								if( ema1 <= 43.1491 )
									ret := 0.750000 // buy
								if( ema1 > 43.1491 )
									ret := 1.000000 // buy
							if( ema1 > 43.6925 )
								ret := 0.250000
		if( ema3 > 42.7026 )
			if( ema1 <= 42.5898 )
				if( ema13 <= -0.238258 )
					if( ema2 <= 42.7253 )
						ret := -1.000000 // sell
					if( ema2 > 42.7253 )
						ret := -0.400000
				if( ema13 > -0.238258 )
					ret := -0.500000
			if( ema1 > 42.5898 )
				if( ema12 <= 0.497408 )
					if( ema13 <= -0.471901 )
						if( ema1 <= 43.7035 )
							if( ema3 <= 43.169 )
								ret := -1.000000 // sell
							if( ema3 > 43.169 )
								ret := 0.285714
						if( ema1 > 43.7035 )
							if( tema <= 46.9689 )
								if( ema1 <= 45.1918 )
									ret := -1.000000 // sell
								if( ema1 > 45.1918 )
									ret := -0.833333 // sell
							if( tema > 46.9689 )
								if( ema1 <= 51.3396 )
									ret := 0.125000
								if( ema1 > 51.3396 )
									ret := -1.000000 // sell
					if( ema13 > -0.471901 )
						if( ema13 <= 0.355669 )
							if( ema3 <= 42.8664 )
								if( tema <= 43.4351 )
									ret := 0.500000
								if( tema > 43.4351 )
									ret := 1.000000 // buy
							if( ema3 > 42.8664 )
								if( ema12 <= 0.14509 )
									ret := -0.158798
								if( ema12 > 0.14509 )
									ret := 0.288660
						if( ema13 > 0.355669 )
							if( ema1 <= 45.033 )
								if( ema2 <= 43.9738 )
									ret := -0.312500
								if( ema2 > 43.9738 )
									ret := 0.295455
							if( ema1 > 45.033 )
								if( ema12 <= 0.219706 )
									ret := -0.108108
								if( ema12 > 0.219706 )
									ret := -0.602649
				if( ema12 > 0.497408 )
					if( tema <= 45.4966 )
						if( tema <= 44.4865 )
							ret := 0.500000
						if( tema > 44.4865 )
							if( ema3 <= 43.3182 )
								if( ema12 <= 0.611302 )
									ret := 1.000000 // buy
								if( ema12 > 0.611302 )
									ret := 0.857143 // buy
							if( ema3 > 43.3182 )
								ret := 0.500000
					if( tema > 45.4966 )
						if( ema1 <= 45.5887 )
							if( tema <= 45.6784 )
								ret := 0.200000
							if( tema > 45.6784 )
								if( ema12 <= 0.915668 )
									ret := -0.750000 // sell
								if( ema12 > 0.915668 )
									ret := -1.000000 // sell
						if( ema1 > 45.5887 )
							if( ema2 <= 51.0073 )
								if( ema1 <= 48.7412 )
									ret := 0.378788
								if( ema1 > 48.7412 )
									ret := -0.772727 // sell
							if( ema2 > 51.0073 )
								if( ema1 <= 52.3234 )
									ret := 1.000000 // buy
								if( ema1 > 52.3234 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_d23a58bd(ema12, ema3, ema13, tema, ema1, ema2)

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


