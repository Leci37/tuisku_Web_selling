//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: UBER_1Min_2BB0_cee3e03e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2BB0_cee3e03e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_cee3e03e(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=7, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( bearPower <= 0.086667 )
		if( Upper_Band <= 56.8541 )
			if( bbp <= 0.270501 )
				if( Lower_Band <= 53.2986 )
					ret := 1.000000 // buy
				if( Lower_Band > 53.2986 )
					if( bullPower <= -0.146723 )
						if( bbm <= 0.019373 )
							if( Lower_Band <= 54.9188 )
								ret := -1.000000 // sell
							if( Lower_Band > 54.9188 )
								ret := 0.760870 // buy
						if( bbm > 0.019373 )
							if( Lower_Band <= 55.3705 )
								ret := -0.954545 // sell
							if( Lower_Band > 55.3705 )
								ret := -0.400000
					if( bullPower > -0.146723 )
						if( Lower_Band <= 55.3526 )
							if( basis <= 55.5943 )
								ret := -0.956044 // sell
							if( basis > 55.5943 )
								ret := -0.363636
						if( Lower_Band > 55.3526 )
							ret := -1.000000 // sell
			if( bbp > 0.270501 )
				ret := 1.000000 // buy
		if( Upper_Band > 56.8541 )
			if( bbp <= -0.149411 )
				if( bearPower <= -0.136596 )
					if( bbm <= 0.048259 )
						if( bbm <= 0.006998 )
							if( Lower_Band <= 72.4252 )
								ret := 0.664275
							if( Lower_Band > 72.4252 )
								ret := 0.371622
						if( bbm > 0.006998 )
							if( Upper_Band <= 74.5313 )
								ret := 0.347202
							if( Upper_Band > 74.5313 )
								ret := -0.212500
					if( bbm > 0.048259 )
						if( Upper_Band <= 61.5673 )
							if( bullPower <= -0.012134 )
								ret := 0.552000
							if( bullPower > -0.012134 )
								ret := -0.188679
						if( Upper_Band > 61.5673 )
							if( Upper_Band <= 70.9949 )
								ret := -0.078511
							if( Upper_Band > 70.9949 )
								ret := 0.036888
				if( bearPower > -0.136596 )
					if( bbm <= 0.028432 )
						if( basis <= 63.1396 )
							if( Lower_Band <= 61.1245 )
								ret := 0.369565
							if( Lower_Band > 61.1245 )
								ret := -0.830189 // sell
						if( basis > 63.1396 )
							if( basis <= 70.9569 )
								ret := 0.574353
							if( basis > 70.9569 )
								ret := 0.298984
					if( bbm > 0.028432 )
						if( bullPower <= -0.082239 )
							if( Upper_Band <= 67.1324 )
								ret := -0.025641
							if( Upper_Band > 67.1324 )
								ret := 0.485149
						if( bullPower > -0.082239 )
							if( basis <= 66.3038 )
								ret := -0.093923
							if( basis > 66.3038 )
								ret := 0.086777
			if( bbp > -0.149411 )
				if( bullPower <= -0.047033 )
					if( bbm <= 0.017716 )
						if( Lower_Band <= 65.2708 )
							if( basis <= 59.4676 )
								ret := -0.090909
							if( basis > 59.4676 )
								ret := 0.722222 // buy
						if( Lower_Band > 65.2708 )
							if( basis <= 65.6235 )
								ret := -1.000000 // sell
							if( basis > 65.6235 )
								ret := 0.234205
					if( bbm > 0.017716 )
						if( bbp <= -0.147928 )
							if( bbp <= -0.149367 )
								ret := -0.909091 // sell
							if( bbp > -0.149367 )
								ret := -0.262295
						if( bbp > -0.147928 )
							if( basis <= 77.6517 )
								ret := 0.000000
							if( basis > 77.6517 )
								ret := 0.681818
				if( bullPower > -0.047033 )
					if( basis <= 56.8311 )
						if( Upper_Band <= 57.1494 )
							if( bearPower <= -0.023988 )
								ret := 0.857143 // buy
							if( bearPower > -0.023988 )
								ret := 1.000000 // buy
						if( Upper_Band > 57.1494 )
							if( Upper_Band <= 57.3255 )
								ret := 0.250000
							if( Upper_Band > 57.3255 )
								ret := 1.000000 // buy
					if( basis > 56.8311 )
						if( Lower_Band <= 57.5446 )
							if( bearPower <= -0.090254 )
								ret := 0.294118
							if( bearPower > -0.090254 )
								ret := -0.946809 // sell
						if( Lower_Band > 57.5446 )
							if( Upper_Band <= 58.0831 )
								ret := 0.798246 // buy
							if( Upper_Band > 58.0831 )
								ret := -0.001484
	if( bearPower > 0.086667 )
		if( bbm <= 0.009412 )
			if( basis <= 66.8942 )
				if( Upper_Band <= 55.7118 )
					ret := 1.000000 // buy
				if( Upper_Band > 55.7118 )
					if( bbp <= 0.722631 )
						if( basis <= 64.6317 )
							if( basis <= 64.4191 )
								ret := -0.561983
							if( basis > 64.4191 )
								ret := 0.448276
						if( basis > 64.6317 )
							if( bbp <= 0.199503 )
								ret := -0.409836
							if( bbp > 0.199503 )
								ret := -0.786550 // sell
					if( bbp > 0.722631 )
						if( bearPower <= 0.436872 )
							if( Upper_Band <= 63.7631 )
								ret := -0.111111
							if( Upper_Band > 63.7631 )
								ret := 0.615385
						if( bearPower > 0.436872 )
							ret := -1.000000 // sell
			if( basis > 66.8942 )
				if( Upper_Band <= 67.3283 )
					if( bullPower <= 0.136048 )
						ret := -0.666667
					if( bullPower > 0.136048 )
						if( Lower_Band <= 66.754 )
							ret := 0.166667
						if( Lower_Band > 66.754 )
							ret := 1.000000 // buy
				if( Upper_Band > 67.3283 )
					if( Lower_Band <= 81.5175 )
						if( bullPower <= 0.128374 )
							if( bbm <= 0.006599 )
								ret := -0.225296
							if( bbm > 0.006599 )
								ret := -0.700000 // sell
						if( bullPower > 0.128374 )
							if( Upper_Band <= 78.0895 )
								ret := -0.471178
							if( Upper_Band > 78.0895 )
								ret := 0.314286
					if( Lower_Band > 81.5175 )
						if( Upper_Band <= 82.3477 )
							ret := 1.000000 // buy
						if( Upper_Band > 82.3477 )
							ret := 0.200000
		if( bbm > 0.009412 )
			if( Upper_Band <= 58.8557 )
				if( Lower_Band <= 53.2638 )
					ret := 1.000000 // buy
				if( Lower_Band > 53.2638 )
					if( basis <= 53.999 )
						ret := -1.000000 // sell
					if( basis > 53.999 )
						if( basis <= 55.1724 )
							if( bullPower <= 0.793721 )
								ret := 1.000000 // buy
							if( bullPower > 0.793721 )
								ret := 0.500000
						if( basis > 55.1724 )
							if( bearPower <= 0.216202 )
								ret := 0.698413
							if( bearPower > 0.216202 )
								ret := 0.147059
			if( Upper_Band > 58.8557 )
				if( basis <= 74.7872 )
					if( bearPower <= 0.183709 )
						if( Upper_Band <= 67.8205 )
							if( bbm <= 0.10995 )
								ret := -0.052071
							if( bbm > 0.10995 )
								ret := 0.233471
						if( Upper_Band > 67.8205 )
							if( bullPower <= 0.208251 )
								ret := -0.057194
							if( bullPower > 0.208251 )
								ret := -0.255008
					if( bearPower > 0.183709 )
						if( Lower_Band <= 65.8005 )
							if( Lower_Band <= 64.958 )
								ret := -0.263291
							if( Lower_Band > 64.958 )
								ret := 0.318681
						if( Lower_Band > 65.8005 )
							if( basis <= 70.7196 )
								ret := -0.598361
							if( basis > 70.7196 )
								ret := -0.294872
				if( basis > 74.7872 )
					if( bullPower <= 0.472041 )
						if( basis <= 84.8824 )
							if( bbp <= 0.531588 )
								ret := 0.182469
							if( bbp > 0.531588 )
								ret := -0.341463
						if( basis > 84.8824 )
							if( bearPower <= 0.098526 )
								ret := 0.375000
							if( bearPower > 0.098526 )
								ret := -0.750000 // sell
					if( bullPower > 0.472041 )
						if( bbp <= 0.810564 )
							if( basis <= 81.7778 )
								ret := 0.500000
							if( basis > 81.7778 )
								ret := 1.000000 // buy
						if( bbp > 0.810564 )
							if( bbp <= 0.855709 )
								ret := -0.500000
							if( bbp > 0.855709 )
								ret := 0.605263
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_cee3e03e(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


