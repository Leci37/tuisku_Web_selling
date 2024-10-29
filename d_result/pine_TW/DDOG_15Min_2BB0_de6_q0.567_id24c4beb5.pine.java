//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: DDOG_15Min_2BB0_24c4beb5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_15Min_2BB0_24c4beb5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_15Min_24c4beb5(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 0.447672 )
		if( Upper_Band <= 170.848 )
			if( bbp <= -5.90253 )
				if( Lower_Band <= 96.3962 )
					if( Upper_Band <= 77.3185 )
						ret := -0.333333
					if( Upper_Band > 77.3185 )
						if( bbp <= -6.27244 )
							ret := 0.792000 // buy
						if( bbp > -6.27244 )
							ret := 0.407407
				if( Lower_Band > 96.3962 )
					if( basis <= 108.224 )
						if( Upper_Band <= 110.912 )
							ret := -0.104167
						if( Upper_Band > 110.912 )
							ret := -0.866667 // sell
					if( basis > 108.224 )
						if( Lower_Band <= 107.26 )
							ret := 0.931034 // buy
						if( Lower_Band > 107.26 )
							ret := 0.295213
			if( bbp > -5.90253 )
				if( Upper_Band <= 29.0901 )
					if( bullPower <= 0.259093 )
						ret := 1.000000 // buy
					if( bullPower > 0.259093 )
						ret := -0.333333
				if( Upper_Band > 29.0901 )
					if( basis <= 156.925 )
						if( Upper_Band <= 157.448 )
							ret := 0.049121
						if( Upper_Band > 157.448 )
							ret := -0.452830
					if( basis > 156.925 )
						if( bullPower <= -0.461256 )
							ret := 0.436261
						if( bullPower > -0.461256 )
							ret := 0.076377
		if( Upper_Band > 170.848 )
			if( basis <= 173.861 )
				if( basis <= 168.776 )
					if( Upper_Band <= 175.059 )
						if( bearPower <= -5.22225 )
							ret := -0.800000 // sell
						if( bearPower > -5.22225 )
							ret := -0.117647
					if( Upper_Band > 175.059 )
						if( Lower_Band <= 158.219 )
							ret := 0.888889 // buy
						if( Lower_Band > 158.219 )
							ret := -0.400000
				if( basis > 168.776 )
					if( bullPower <= 0.086707 )
						if( bearPower <= -5.1421 )
							ret := 0.333333
						if( bearPower > -5.1421 )
							ret := -0.871429 // sell
					if( bullPower > 0.086707 )
						if( Upper_Band <= 177.915 )
							ret := -0.318182
						if( Upper_Band > 177.915 )
							ret := 1.000000 // buy
			if( basis > 173.861 )
				if( Upper_Band <= 180.031 )
					if( bearPower <= -0.826303 )
						if( basis <= 176.582 )
							ret := -0.142857
						if( basis > 176.582 )
							ret := 0.857143 // buy
					if( bearPower > -0.826303 )
						if( bullPower <= -0.443177 )
							ret := 0.000000
						if( bullPower > -0.443177 )
							ret := 0.844444 // buy
				if( Upper_Band > 180.031 )
					if( basis <= 183.255 )
						if( bullPower <= -0.172017 )
							ret := -0.083333
						if( bullPower > -0.172017 )
							ret := -0.484018
					if( basis > 183.255 )
						if( basis <= 191.38 )
							ret := 0.707792 // buy
						if( basis > 191.38 )
							ret := -0.380734
	if( bbp > 0.447672 )
		if( bbm <= 0.166517 )
			if( bullPower <= 1.27595 )
				if( Upper_Band <= 34.8923 )
					if( bearPower <= 0.269352 )
						if( basis <= 29.0528 )
							ret := 1.000000 // buy
						if( basis > 29.0528 )
							ret := -0.352941
					if( bearPower > 0.269352 )
						if( bullPower <= 0.629389 )
							ret := 0.878788 // buy
						if( bullPower > 0.629389 )
							ret := 0.277778
				if( Upper_Band > 34.8923 )
					if( Lower_Band <= 108.239 )
						if( Lower_Band <= 107.25 )
							ret := -0.130571
						if( Lower_Band > 107.25 )
							ret := 0.635135
					if( Lower_Band > 108.239 )
						if( Upper_Band <= 126.7 )
							ret := -0.344388
						if( Upper_Band > 126.7 )
							ret := -0.138695
			if( bullPower > 1.27595 )
				if( Upper_Band <= 126.683 )
					if( basis <= 79.1361 )
						if( Lower_Band <= 31.1947 )
							ret := 0.400000
						if( Lower_Band > 31.1947 )
							ret := -0.920635 // sell
					if( basis > 79.1361 )
						if( Lower_Band <= 96.0949 )
							ret := -0.128571
						if( Lower_Band > 96.0949 )
							ret := -0.664286
				if( Upper_Band > 126.683 )
					if( bearPower <= 1.30384 )
						if( bbp <= 2.51611 )
							ret := 0.000000
						if( bbp > 2.51611 )
							ret := -0.904762 // sell
					if( bearPower > 1.30384 )
						if( basis <= 182.641 )
							ret := -0.114650
						if( basis > 182.641 )
							ret := 0.600000
		if( bbm > 0.166517 )
			if( basis <= 31.5335 )
				if( bbp <= 1.16895 )
					if( basis <= 31.2428 )
						if( bearPower <= -0.076474 )
							ret := 1.000000 // buy
						if( bearPower > -0.076474 )
							ret := -0.777778 // sell
					if( basis > 31.2428 )
						if( bearPower <= 0.281695 )
							ret := 0.740741 // buy
						if( bearPower > 0.281695 )
							ret := -1.000000 // sell
				if( bbp > 1.16895 )
					if( Upper_Band <= 33.4564 )
						if( basis <= 28.3838 )
							ret := -1.000000 // sell
						if( basis > 28.3838 )
							ret := 0.973451 // buy
					if( Upper_Band > 33.4564 )
						ret := -0.875000 // sell
			if( basis > 31.5335 )
				if( Upper_Band <= 34.6976 )
					if( bullPower <= 0.746737 )
						if( bearPower <= 0.197553 )
							ret := 0.668874
						if( bearPower > 0.197553 )
							ret := 0.166667
					if( bullPower > 0.746737 )
						if( bbp <= 0.475249 )
							ret := 1.000000 // buy
						if( bbp > 0.475249 )
							ret := -0.422535
				if( Upper_Band > 34.6976 )
					if( Lower_Band <= 39.4869 )
						if( basis <= 38.2704 )
							ret := -0.224313
						if( basis > 38.2704 )
							ret := -0.603774
					if( Lower_Band > 39.4869 )
						if( basis <= 96.1399 )
							ret := -0.010097
						if( basis > 96.1399 )
							ret := -0.119762
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_DDOG_15Min_24c4beb5(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


