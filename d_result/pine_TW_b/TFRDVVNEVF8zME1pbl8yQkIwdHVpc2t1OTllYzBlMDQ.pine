//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: LTCUSDT_30Min_2BB0_99ec0e04 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_2BB0_99ec0e04", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_99ec0e04(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -1.27274 )
		if( basis <= 373.135 )
			if( bbm <= 0.710822 )
				if( bullPower <= -0.754973 )
					if( Upper_Band <= 118.588 )
						if( Upper_Band <= 113.698 )
							if( Upper_Band <= 93.3002 )
								if( Lower_Band <= 60.655 )
									ret := 0.006173
								if( Lower_Band > 60.655 )
									ret := -0.304147
							if( Upper_Band > 93.3002 )
								if( Lower_Band <= 98.1309 )
									ret := 0.235294
								if( Lower_Band > 98.1309 )
									ret := -0.189655
						if( Upper_Band > 113.698 )
							if( Upper_Band <= 115.735 )
								if( basis <= 112.706 )
									ret := -1.000000 // sell
								if( basis > 112.706 )
									ret := -0.750000 // sell
							if( Upper_Band > 115.735 )
								ret := -0.250000
					if( Upper_Band > 118.588 )
						if( Upper_Band <= 121.515 )
							ret := 1.000000 // buy
						if( Upper_Band > 121.515 )
							if( Lower_Band <= 152.949 )
								if( basis <= 122.97 )
									ret := -0.500000
								if( basis > 122.97 )
									ret := 0.115385
							if( Lower_Band > 152.949 )
								ret := 0.800000 // buy
				if( bullPower > -0.754973 )
					if( basis <= 47.4122 )
						ret := -1.000000 // sell
					if( basis > 47.4122 )
						if( basis <= 107.548 )
							if( Lower_Band <= 72.7133 )
								if( basis <= 66.35 )
									ret := 0.297297
								if( basis > 66.35 )
									ret := -0.550000
							if( Lower_Band > 72.7133 )
								if( bbm <= 0.695117 )
									ret := 0.659091
								if( bbm > 0.695117 )
									ret := 0.000000
						if( basis > 107.548 )
							if( basis <= 119.44 )
								if( bbm <= 0.689005 )
									ret := -0.500000
								if( bbm > 0.689005 )
									ret := -1.000000 // sell
							if( basis > 119.44 )
								if( bbp <= -2.06294 )
									ret := 0.428571
								if( bbp > -2.06294 )
									ret := -0.100000
			if( bbm > 0.710822 )
				if( bullPower <= 8.17056 )
					if( Lower_Band <= 96.7847 )
						if( basis <= 97.0651 )
							if( bearPower <= -5.57181 )
								if( basis <= 63.8932 )
									ret := 0.100000
								if( basis > 63.8932 )
									ret := 0.755102 // buy
							if( bearPower > -5.57181 )
								if( Upper_Band <= 83.2834 )
									ret := 0.297207
								if( Upper_Band > 83.2834 )
									ret := 0.120903
						if( basis > 97.0651 )
							if( bbp <= -8.19473 )
								ret := -0.333333
							if( bbp > -8.19473 )
								if( bbm <= 0.942682 )
									ret := 0.238095
								if( bbm > 0.942682 )
									ret := 0.770701 // buy
					if( Lower_Band > 96.7847 )
						if( Upper_Band <= 123.255 )
							if( bullPower <= -0.625207 )
								if( bullPower <= -1.58988 )
									ret := 0.080000
								if( bullPower > -1.58988 )
									ret := -0.287425
							if( bullPower > -0.625207 )
								if( Upper_Band <= 120.915 )
									ret := 0.153263
								if( Upper_Band > 120.915 )
									ret := -0.403846
						if( Upper_Band > 123.255 )
							if( bullPower <= 0.204729 )
								if( Lower_Band <= 128.735 )
									ret := 0.320843
								if( Lower_Band > 128.735 )
									ret := 0.153487
							if( bullPower > 0.204729 )
								if( bbm <= 2.71688 )
									ret := -0.032727
								if( bbm > 2.71688 )
									ret := 0.128269
				if( bullPower > 8.17056 )
					if( bbp <= 7.67386 )
						if( bullPower <= 8.64307 )
							ret := -1.000000 // sell
						if( bullPower > 8.64307 )
							if( Upper_Band <= 329.007 )
								if( bullPower <= 9.53069 )
									ret := -0.250000
								if( bullPower > 9.53069 )
									ret := 0.500000
							if( Upper_Band > 329.007 )
								ret := -0.666667
					if( bbp > 7.67386 )
						if( Upper_Band <= 352.882 )
							ret := -1.000000 // sell
						if( Upper_Band > 352.882 )
							ret := -0.750000 // sell
		if( basis > 373.135 )
			if( bbm <= 8.97463 )
				if( bearPower <= -8.35313 )
					ret := -0.250000
				if( bearPower > -8.35313 )
					if( Lower_Band <= 369.171 )
						ret := -0.400000
					if( Lower_Band > 369.171 )
						if( bearPower <= -4.8765 )
							ret := -1.000000 // sell
						if( bearPower > -4.8765 )
							if( bullPower <= 2.50366 )
								ret := -0.500000
							if( bullPower > 2.50366 )
								ret := -1.000000 // sell
			if( bbm > 8.97463 )
				if( bearPower <= -9.0782 )
					if( basis <= 379.658 )
						if( Lower_Band <= 352.917 )
							ret := -0.750000 // sell
						if( Lower_Band > 352.917 )
							ret := -1.000000 // sell
					if( basis > 379.658 )
						if( Lower_Band <= 384.505 )
							if( bbm <= 14.56 )
								if( Lower_Band <= 371.648 )
									ret := 0.750000 // buy
								if( Lower_Band > 371.648 )
									ret := 1.000000 // buy
							if( bbm > 14.56 )
								ret := 0.600000
						if( Lower_Band > 384.505 )
							ret := 0.000000
				if( bearPower > -9.0782 )
					if( bbm <= 9.74 )
						ret := -0.750000 // sell
					if( bbm > 9.74 )
						ret := -1.000000 // sell
	if( bearPower > -1.27274 )
		if( Upper_Band <= 63.675 )
			if( basis <= 61.1091 )
				if( bearPower <= -0.130715 )
					if( basis <= 44.5625 )
						if( BBPower_Color <= 0.5 )
							if( bullPower <= 0.149654 )
								if( bearPower <= -0.688199 )
									ret := 0.133333
								if( bearPower > -0.688199 )
									ret := 0.687500
							if( bullPower > 0.149654 )
								if( Lower_Band <= 41.3287 )
									ret := 0.500000
								if( Lower_Band > 41.3287 )
									ret := -0.700000 // sell
						if( BBPower_Color > 0.5 )
							if( bbm <= 1.04789 )
								if( Upper_Band <= 45.9883 )
									ret := 0.750000 // buy
								if( Upper_Band > 45.9883 )
									ret := 0.750000 // buy
							if( bbm > 1.04789 )
								ret := 1.000000 // buy
					if( basis > 44.5625 )
						if( bbm <= 1.64938 )
							if( bbm <= 0.272502 )
								if( Upper_Band <= 55.7668 )
									ret := 0.052326
								if( Upper_Band > 55.7668 )
									ret := -0.144876
							if( bbm > 0.272502 )
								if( Upper_Band <= 62.3878 )
									ret := 0.107849
								if( Upper_Band > 62.3878 )
									ret := 0.660000
						if( bbm > 1.64938 )
							if( basis <= 52.9502 )
								ret := 1.000000 // buy
							if( basis > 52.9502 )
								if( basis <= 58.4317 )
									ret := -0.448276
								if( basis > 58.4317 )
									ret := -0.823529 // sell
				if( bearPower > -0.130715 )
					if( basis <= 59.7137 )
						if( Upper_Band <= 61.1067 )
							if( basis <= 44.0027 )
								if( Lower_Band <= 43.193 )
									ret := 0.075949
								if( Lower_Band > 43.193 )
									ret := 0.821429 // buy
							if( basis > 44.0027 )
								if( bbm <= 1.37372 )
									ret := -0.009131
								if( bbm > 1.37372 )
									ret := 0.372093
						if( Upper_Band > 61.1067 )
							if( bullPower <= 2.22969 )
								if( bearPower <= 1.03836 )
									ret := 0.711340 // buy
								if( bearPower > 1.03836 )
									ret := -0.555556
							if( bullPower > 2.22969 )
								if( basis <= 58.8135 )
									ret := -0.750000 // sell
								if( basis > 58.8135 )
									ret := -1.000000 // sell
					if( basis > 59.7137 )
						if( bbm <= 0.296287 )
							if( bbp <= 0.431872 )
								if( Upper_Band <= 61.3133 )
									ret := 0.295082
								if( Upper_Band > 61.3133 )
									ret := 0.000000
							if( bbp > 0.431872 )
								if( bbm <= 0.214808 )
									ret := 0.000000
								if( bbm > 0.214808 )
									ret := -0.466667
						if( bbm > 0.296287 )
							if( bullPower <= 1.76787 )
								if( Lower_Band <= 60.4014 )
									ret := -0.394822
								if( Lower_Band > 60.4014 )
									ret := 0.000000
							if( bullPower > 1.76787 )
								if( bbp <= 4.61956 )
									ret := 0.470588
								if( bbp > 4.61956 )
									ret := -0.750000 // sell
			if( basis > 61.1091 )
				if( Lower_Band <= 60.4591 )
					if( Lower_Band <= 60.2259 )
						if( Upper_Band <= 63.4024 )
							if( bearPower <= -0.421507 )
								if( bullPower <= -0.01449 )
									ret := 0.450000
								if( bullPower > -0.01449 )
									ret := 0.916667 // buy
							if( bearPower > -0.421507 )
								if( Upper_Band <= 62.2371 )
									ret := -0.846154 // sell
								if( Upper_Band > 62.2371 )
									ret := 0.027397
						if( Upper_Band > 63.4024 )
							if( bbm <= 0.625205 )
								if( bbm <= 0.475 )
									ret := -0.600000
								if( bbm > 0.475 )
									ret := 0.000000
							if( bbm > 0.625205 )
								if( bbm <= 1.23737 )
									ret := -1.000000 // sell
								if( bbm > 1.23737 )
									ret := -0.750000 // sell
					if( Lower_Band > 60.2259 )
						if( bearPower <= -1.08683 )
							ret := -0.500000
						if( bearPower > -1.08683 )
							if( bbm <= 0.291822 )
								if( Upper_Band <= 62.3189 )
									ret := 0.400000
								if( Upper_Band > 62.3189 )
									ret := 0.000000
							if( bbm > 0.291822 )
								if( bbm <= 0.745 )
									ret := 0.789474 // buy
								if( bbm > 0.745 )
									ret := 0.363636
				if( Lower_Band > 60.4591 )
					if( basis <= 61.7981 )
						if( Lower_Band <= 60.9894 )
							if( basis <= 61.3708 )
								if( basis <= 61.1518 )
									ret := 0.440000
								if( basis > 61.1518 )
									ret := -0.208955
							if( basis > 61.3708 )
								if( bearPower <= 0.042461 )
									ret := 0.127168
								if( bearPower > 0.042461 )
									ret := 0.481928
						if( Lower_Band > 60.9894 )
							if( Upper_Band <= 61.8963 )
								if( Upper_Band <= 61.8411 )
									ret := -0.048780
								if( Upper_Band > 61.8411 )
									ret := 0.428571
							if( Upper_Band > 61.8963 )
								if( bearPower <= 0.149992 )
									ret := -0.259843
								if( bearPower > 0.149992 )
									ret := -0.916667 // sell
					if( basis > 61.7981 )
						if( bbm <= 0.350992 )
							if( bullPower <= 0.560597 )
								if( basis <= 61.9484 )
									ret := 0.300000
								if( basis > 61.9484 )
									ret := 0.033835
							if( bullPower > 0.560597 )
								if( bullPower <= 0.642445 )
									ret := 0.736842 // buy
								if( bullPower > 0.642445 )
									ret := 0.250000
						if( bbm > 0.350992 )
							if( bbm <= 0.885 )
								if( basis <= 61.9917 )
									ret := 0.672269
								if( basis > 61.9917 )
									ret := 0.365169
							if( bbm > 0.885 )
								if( bullPower <= 1.12396 )
									ret := -0.536585
								if( bullPower > 1.12396 )
									ret := 0.333333
		if( Upper_Band > 63.675 )
			if( basis <= 376.569 )
				if( basis <= 358.136 )
					if( Lower_Band <= 328.306 )
						if( bbp <= -1.17536 )
							if( Upper_Band <= 95.6463 )
								if( Upper_Band <= 66.7417 )
									ret := -0.076190
								if( Upper_Band > 66.7417 )
									ret := 0.192680
							if( Upper_Band > 95.6463 )
								if( Lower_Band <= 93.4989 )
									ret := -0.461538
								if( Lower_Band > 93.4989 )
									ret := 0.020359
						if( bbp > -1.17536 )
							if( bullPower <= 0.104175 )
								if( bearPower <= -0.745915 )
									ret := 0.056358
								if( bearPower > -0.745915 )
									ret := -0.039196
							if( bullPower > 0.104175 )
								if( basis <= 60.955 )
									ret := 0.880000 // buy
								if( basis > 60.955 )
									ret := 0.019056
					if( Lower_Band > 328.306 )
						if( bbm <= 4.87076 )
							if( Upper_Band <= 351.928 )
								if( Lower_Band <= 337.526 )
									ret := 0.125000
								if( Lower_Band > 337.526 )
									ret := -1.000000 // sell
							if( Upper_Band > 351.928 )
								if( bbp <= 3.54167 )
									ret := 1.000000 // buy
								if( bbp > 3.54167 )
									ret := 0.200000
						if( bbm > 4.87076 )
							if( bbp <= 8.03277 )
								if( bearPower <= -1.08247 )
									ret := 0.250000
								if( bearPower > -1.08247 )
									ret := -0.480000
							if( bbp > 8.03277 )
								if( bullPower <= 8.93632 )
									ret := -0.888889 // sell
								if( bullPower > 8.93632 )
									ret := -1.000000 // sell
				if( basis > 358.136 )
					if( Lower_Band <= 350.336 )
						if( basis <= 359.818 )
							ret := 0.800000 // buy
						if( basis > 359.818 )
							ret := 1.000000 // buy
					if( Lower_Band > 350.336 )
						if( Upper_Band <= 379.045 )
							if( basis <= 365.089 )
								ret := 0.250000
							if( basis > 365.089 )
								ret := 1.000000 // buy
						if( Upper_Band > 379.045 )
							ret := 0.000000
			if( basis > 376.569 )
				if( Upper_Band <= 420.798 )
					if( bearPower <= 5.21188 )
						ret := -1.000000 // sell
					if( bearPower > 5.21188 )
						ret := -0.250000
				if( Upper_Band > 420.798 )
					ret := 0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_LTCUSDT_30Min_99ec0e04(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


