//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: ATOMUSDT_30Min_2BB0_1aae1a48 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_2BB0_1aae1a48", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_1aae1a48(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Lower_Band <= 39.2027 )
		if( bullPower <= -0.047832 )
			if( Lower_Band <= 22.0539 )
				if( bbm <= 0.101435 )
					if( Upper_Band <= 9.58117 )
						if( bbm <= 0.054084 )
							if( bullPower <= -0.064488 )
								if( bbp <= -0.281174 )
									ret := 0.444444
								if( bbp > -0.281174 )
									ret := -0.242424
							if( bullPower > -0.064488 )
								if( bbm <= 0.045585 )
									ret := 0.130000
								if( bbm > 0.045585 )
									ret := -0.166667
						if( bbm > 0.054084 )
							if( bbp <= -0.172286 )
								if( Upper_Band <= 9.42412 )
									ret := 0.159292
								if( Upper_Band > 9.42412 )
									ret := 0.750000 // buy
							if( bbp > -0.172286 )
								if( Lower_Band <= 4.8809 )
									ret := 0.684211
								if( Lower_Band > 4.8809 )
									ret := -0.303030
					if( Upper_Band > 9.58117 )
						if( Upper_Band <= 10.2845 )
							if( bearPower <= -0.162663 )
								if( bbm <= 0.082709 )
									ret := 0.378378
								if( bbm > 0.082709 )
									ret := -0.483871
							if( bearPower > -0.162663 )
								if( bearPower <= -0.150959 )
									ret := -0.634615
								if( bearPower > -0.150959 )
									ret := -0.257669
						if( Upper_Band > 10.2845 )
							if( Lower_Band <= 11.923 )
								if( Upper_Band <= 10.6701 )
									ret := 0.216418
								if( Upper_Band > 10.6701 )
									ret := -0.142454
							if( Lower_Band > 11.923 )
								if( Lower_Band <= 13.4732 )
									ret := 0.210526
								if( Lower_Band > 13.4732 )
									ret := -0.169492
				if( bbm > 0.101435 )
					if( bearPower <= -0.90517 )
						if( Lower_Band <= 18.7273 )
							if( Lower_Band <= 12.9353 )
								if( basis <= 13.2189 )
									ret := 0.222222
								if( basis > 13.2189 )
									ret := 0.730159 // buy
							if( Lower_Band > 12.9353 )
								if( basis <= 16.2514 )
									ret := -0.483871
								if( basis > 16.2514 )
									ret := 0.179894
						if( Lower_Band > 18.7273 )
							if( basis <= 22.8289 )
								if( bbp <= -1.75558 )
									ret := -0.409091
								if( bbp > -1.75558 )
									ret := 0.555556
							if( basis > 22.8289 )
								if( basis <= 23.0584 )
									ret := 1.000000 // buy
								if( basis > 23.0584 )
									ret := 0.600000
					if( bearPower > -0.90517 )
						if( bullPower <= -0.361462 )
							if( bearPower <= -0.767765 )
								if( Lower_Band <= 15.2181 )
									ret := -0.324324
								if( Lower_Band > 15.2181 )
									ret := 0.602273
							if( bearPower > -0.767765 )
								if( bbm <= 0.268944 )
									ret := -0.150538
								if( bbm > 0.268944 )
									ret := -0.467290
						if( bullPower > -0.361462 )
							if( basis <= 22.2309 )
								if( basis <= 21.8916 )
									ret := 0.149648
								if( basis > 21.8916 )
									ret := -0.642336
							if( basis > 22.2309 )
								if( bearPower <= -0.380959 )
									ret := 0.763514 // buy
								if( bearPower > -0.380959 )
									ret := 0.000000
			if( Lower_Band > 22.0539 )
				if( bbm <= 0.654932 )
					if( Upper_Band <= 39.3942 )
						if( basis <= 33.7789 )
							if( basis <= 28.251 )
								if( bbm <= 0.228323 )
									ret := 0.177465
								if( bbm > 0.228323 )
									ret := -0.061069
							if( basis > 28.251 )
								if( bbm <= 0.389839 )
									ret := -0.294197
								if( bbm > 0.389839 )
									ret := -0.125000
						if( basis > 33.7789 )
							if( basis <= 34.7478 )
								if( bearPower <= -0.491451 )
									ret := 0.724138 // buy
								if( bearPower > -0.491451 )
									ret := 0.292683
							if( basis > 34.7478 )
								if( Upper_Band <= 38.2382 )
									ret := -0.011086
								if( Upper_Band > 38.2382 )
									ret := 0.453125
					if( Upper_Band > 39.3942 )
						if( Upper_Band <= 40.7332 )
							if( Upper_Band <= 39.9095 )
								if( bbm <= 0.372373 )
									ret := 0.062500
								if( bbm > 0.372373 )
									ret := -0.572727
							if( Upper_Band > 39.9095 )
								if( bearPower <= -0.871871 )
									ret := 0.560000
								if( bearPower > -0.871871 )
									ret := -0.058824
						if( Upper_Band > 40.7332 )
							if( bbm <= 0.387831 )
								if( basis <= 39.8589 )
									ret := -0.947368 // sell
								if( basis > 39.8589 )
									ret := -0.500000
							if( bbm > 0.387831 )
								if( Upper_Band <= 41.2464 )
									ret := 0.100000
								if( Upper_Band > 41.2464 )
									ret := -0.675676
				if( bbm > 0.654932 )
					if( Upper_Band <= 38.1789 )
						if( basis <= 32.8425 )
							if( basis <= 31.3885 )
								if( bullPower <= -0.123485 )
									ret := 0.055696
								if( bullPower > -0.123485 )
									ret := 0.938776 // buy
							if( basis > 31.3885 )
								if( bbp <= -2.96764 )
									ret := 0.000000
								if( bbp > -2.96764 )
									ret := 0.780952 // buy
						if( basis > 32.8425 )
							if( bullPower <= -1.19223 )
								ret := 0.481481
							if( bullPower > -1.19223 )
								if( Upper_Band <= 34.7869 )
									ret := 0.384615
								if( Upper_Band > 34.7869 )
									ret := -0.327273
					if( Upper_Band > 38.1789 )
						if( basis <= 40.6626 )
							if( bbm <= 1.49969 )
								if( bbp <= -2.28895 )
									ret := 0.744681 // buy
								if( bbp > -2.28895 )
									ret := 0.332031
							if( bbm > 1.49969 )
								if( basis <= 39.4214 )
									ret := 0.968750 // buy
								if( basis > 39.4214 )
									ret := 0.875000 // buy
						if( basis > 40.6626 )
							if( bearPower <= -1.84845 )
								ret := 0.375000
							if( bearPower > -1.84845 )
								if( bbm <= 0.765127 )
									ret := -1.000000 // sell
								if( bbm > 0.765127 )
									ret := -0.714286 // sell
		if( bullPower > -0.047832 )
			if( bearPower <= 0.936071 )
				if( Lower_Band <= 36.6498 )
					if( Lower_Band <= 36.2024 )
						if( bbm <= 0.046978 )
							if( bbp <= 0.022673 )
								if( bbm <= 0.033815 )
									ret := -0.094976
								if( bbm > 0.033815 )
									ret := -0.046582
							if( bbp > 0.022673 )
								if( bbp <= 0.21526 )
									ret := 0.006397
								if( bbp > 0.21526 )
									ret := -0.290000
						if( bbm > 0.046978 )
							if( basis <= 4.84506 )
								if( Upper_Band <= 4.27063 )
									ret := -0.094340
								if( Upper_Band > 4.27063 )
									ret := 0.266467
							if( basis > 4.84506 )
								if( bbp <= -0.492201 )
									ret := 0.200824
								if( bbp > -0.492201 )
									ret := -0.005373
					if( Lower_Band > 36.2024 )
						if( Lower_Band <= 36.3907 )
							if( bbm <= 0.310397 )
								ret := -0.086957
							if( bbm > 0.310397 )
								if( basis <= 38.3691 )
									ret := 0.697436
								if( basis > 38.3691 )
									ret := -0.272727
						if( Lower_Band > 36.3907 )
							if( bbm <= 0.266707 )
								ret := -0.846154 // sell
							if( bbm > 0.266707 )
								if( bbm <= 1.375 )
									ret := 0.348259
								if( bbm > 1.375 )
									ret := -0.846154 // sell
				if( Lower_Band > 36.6498 )
					if( bearPower <= -0.3175 )
						if( bbp <= 0.388616 )
							if( bbp <= -0.175651 )
								if( Upper_Band <= 39.3557 )
									ret := 0.121951
								if( Upper_Band > 39.3557 )
									ret := -0.247191
							if( bbp > -0.175651 )
								if( bullPower <= 0.596962 )
									ret := 0.666667
								if( bullPower > 0.596962 )
									ret := 0.055556
						if( bbp > 0.388616 )
							ret := -1.000000 // sell
					if( bearPower > -0.3175 )
						if( Lower_Band <= 37.4987 )
							if( bearPower <= -0.054333 )
								if( bbm <= 0.38951 )
									ret := -0.767442 // sell
								if( bbm > 0.38951 )
									ret := 0.127273
							if( bearPower > -0.054333 )
								if( bullPower <= 1.0437 )
									ret := -0.928571 // sell
								if( bullPower > 1.0437 )
									ret := -0.500000
						if( Lower_Band > 37.4987 )
							if( Lower_Band <= 38.3646 )
								if( basis <= 39.3636 )
									ret := 0.503876
								if( basis > 39.3636 )
									ret := -0.135000
							if( Lower_Band > 38.3646 )
								if( bbm <= 0.40512 )
									ret := 0.230769
								if( bbm > 0.40512 )
									ret := -0.620192
			if( bearPower > 0.936071 )
				if( bbp <= 3.71205 )
					if( basis <= 29.6413 )
						if( bullPower <= 2.15776 )
							if( Lower_Band <= 22.4442 )
								if( basis <= 22.6954 )
									ret := -0.857143 // sell
								if( basis > 22.6954 )
									ret := -0.076923
							if( Lower_Band > 22.4442 )
								if( Upper_Band <= 30.2918 )
									ret := -1.000000 // sell
								if( Upper_Band > 30.2918 )
									ret := -0.888889 // sell
						if( bullPower > 2.15776 )
							ret := -1.000000 // sell
					if( basis > 29.6413 )
						if( basis <= 37.8075 )
							if( Lower_Band <= 32.8431 )
								if( bearPower <= 1.1455 )
									ret := -0.051282
								if( bearPower > 1.1455 )
									ret := -0.687500
							if( Lower_Band > 32.8431 )
								if( bearPower <= 1.11753 )
									ret := 1.000000 // buy
								if( bearPower > 1.11753 )
									ret := 0.909091 // buy
						if( basis > 37.8075 )
							if( bbm <= 0.80571 )
								ret := -0.363636
							if( bbm > 0.80571 )
								if( Lower_Band <= 36.9315 )
									ret := -0.714286 // sell
								if( Lower_Band > 36.9315 )
									ret := -1.000000 // sell
				if( bbp > 3.71205 )
					if( basis <= 33.7148 )
						if( bearPower <= 1.5032 )
							ret := -1.000000 // sell
						if( bearPower > 1.5032 )
							if( bbm <= 1.31163 )
								ret := -0.666667
							if( bbm > 1.31163 )
								ret := -0.923077 // sell
					if( basis > 33.7148 )
						if( Upper_Band <= 40.7593 )
							ret := 0.428571
						if( Upper_Band > 40.7593 )
							if( basis <= 38.9177 )
								ret := -1.000000 // sell
							if( basis > 38.9177 )
								ret := -0.800000 // sell
	if( Lower_Band > 39.2027 )
		if( basis <= 40.8755 )
			if( bullPower <= -0.073257 )
				if( bbm <= 0.48416 )
					if( bullPower <= -0.252581 )
						ret := -0.100000
					if( bullPower > -0.252581 )
						ret := 0.875000 // buy
				if( bbm > 0.48416 )
					if( bbm <= 0.607059 )
						ret := -0.611111
					if( bbm > 0.607059 )
						ret := -0.111111
			if( bullPower > -0.073257 )
				if( bbp <= -0.564568 )
					if( bbp <= -0.777926 )
						ret := -0.909091 // sell
					if( bbp > -0.777926 )
						ret := -0.944444 // sell
				if( bbp > -0.564568 )
					if( bbm <= 0.716206 )
						if( basis <= 40.5419 )
							if( bullPower <= 0.251573 )
								ret := -0.187500
							if( bullPower > 0.251573 )
								if( bearPower <= -0.030287 )
									ret := -0.583333
								if( bearPower > -0.030287 )
									ret := -0.846154 // sell
						if( basis > 40.5419 )
							ret := 0.600000
					if( bbm > 0.716206 )
						if( bbm <= 0.925595 )
							ret := -0.812500 // sell
						if( bbm > 0.925595 )
							ret := -0.545455
		if( basis > 40.8755 )
			if( bullPower <= 0.038552 )
				if( bearPower <= -0.480371 )
					if( bbp <= -1.90461 )
						ret := 0.083333
					if( bbp > -1.90461 )
						if( Lower_Band <= 40.868 )
							if( bullPower <= -0.405249 )
								ret := -0.526316
							if( bullPower > -0.405249 )
								if( bbp <= -1.07901 )
									ret := -0.968750 // sell
								if( bbp > -1.07901 )
									ret := -0.724138 // sell
						if( Lower_Band > 40.868 )
							if( Upper_Band <= 43.7657 )
								ret := 0.142857
							if( Upper_Band > 43.7657 )
								ret := -0.714286 // sell
				if( bearPower > -0.480371 )
					ret := 0.071429
			if( bullPower > 0.038552 )
				if( basis <= 41.8944 )
					if( bbm <= 1.07948 )
						if( Lower_Band <= 39.3658 )
							ret := -0.818182 // sell
						if( Lower_Band > 39.3658 )
							if( bearPower <= -0.593274 )
								ret := -0.900000 // sell
							if( bearPower > -0.593274 )
								ret := -1.000000 // sell
					if( bbm > 1.07948 )
						ret := -0.600000
				if( basis > 41.8944 )
					if( Lower_Band <= 40.5467 )
						if( bullPower <= 0.887076 )
							ret := -0.357143
						if( bullPower > 0.887076 )
							ret := -1.000000 // sell
					if( Lower_Band > 40.5467 )
						if( bullPower <= 0.602357 )
							if( basis <= 42.983 )
								if( bbm <= 0.521069 )
									ret := -0.500000
								if( bbm > 0.521069 )
									ret := -0.794118 // sell
							if( basis > 42.983 )
								ret := -0.933333 // sell
						if( bullPower > 0.602357 )
							if( bbm <= 0.856386 )
								ret := -0.900000 // sell
							if( bbm > 0.856386 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_1aae1a48(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


