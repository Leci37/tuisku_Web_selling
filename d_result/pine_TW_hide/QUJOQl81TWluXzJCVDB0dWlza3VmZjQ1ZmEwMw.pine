//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ABNB_5Min_2BT0_ff45fa03 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_5Min_2BT0_ff45fa03", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_5Min_ff45fa03(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.010518 )
		if( ema13 <= -0.307336 )
			if( tema <= 104.619 )
				if( ema3 <= 104.882 )
					ret := 0.000000
				if( ema3 > 104.882 )
					if( ema13 <= -0.782151 )
						ret := 0.000000
					if( ema13 > -0.782151 )
						if( ema2 <= 104.703 )
							ret := 0.000000
						if( ema2 > 104.703 )
							ret := 0.959184 // buy
			if( tema > 104.619 )
				if( ema3 <= 108.871 )
					if( bbm <= 0.485875 )
						if( bbm <= 0.194831 )
							ret := -0.175439
						if( bbm > 0.194831 )
							ret := -0.709677 // sell
					if( bbm > 0.485875 )
						if( ema2 <= 107.877 )
							ret := 0.961538 // buy
						if( ema2 > 107.877 )
							ret := -0.833333 // sell
				if( ema3 > 108.871 )
					if( bearPower <= -0.603188 )
						if( ema3 <= 124.665 )
							ret := 0.310788
						if( ema3 > 124.665 )
							ret := -0.026141
					if( bearPower > -0.603188 )
						if( tema <= 111.369 )
							ret := 0.746032 // buy
						if( tema > 111.369 )
							ret := -0.068927
		if( ema13 > -0.307336 )
			if( bullPower <= -0.294458 )
				if( bbm <= 0.211454 )
					if( ema3 <= 162.824 )
						if( bullPower <= -0.304756 )
							ret := 0.625850
						if( bullPower > -0.304756 )
							ret := 0.119048
					if( ema3 > 162.824 )
						if( bearPower <= -0.736784 )
							ret := 0.846154 // buy
						if( bearPower > -0.736784 )
							ret := -0.370370
				if( bbm > 0.211454 )
					if( ema13 <= 0.239153 )
						if( tema <= 121.252 )
							ret := -0.371429
						if( tema > 121.252 )
							ret := 0.275735
					if( ema13 > 0.239153 )
						if( bearPower <= -0.813921 )
							ret := -0.947368 // sell
						if( bearPower > -0.813921 )
							ret := 0.500000
			if( bullPower > -0.294458 )
				if( bbm <= 0.349073 )
					if( ema12 <= 0.001319 )
						if( ema2 <= 125.316 )
							ret := 0.139241
						if( ema2 > 125.316 )
							ret := 0.037565
					if( ema12 > 0.001319 )
						if( ema1 <= 163.229 )
							ret := 0.253545
						if( ema1 > 163.229 )
							ret := -0.666667
				if( bbm > 0.349073 )
					if( ema3 <= 161.259 )
						if( ema2 <= 142.507 )
							ret := -0.216301
						if( ema2 > 142.507 )
							ret := 0.122807
					if( ema3 > 161.259 )
						if( bearPower <= -0.499803 )
							ret := -0.732394 // sell
						if( bearPower > -0.499803 )
							ret := -0.275862
	if( bullPower > 0.010518 )
		if( bbm <= 0.258295 )
			if( bearPower <= 0.078538 )
				if( ema2 <= 117.015 )
					if( ema3 <= 116.916 )
						if( bbp <= -0.182217 )
							ret := -0.846154 // sell
						if( bbp > -0.182217 )
							ret := 0.087057
					if( ema3 > 116.916 )
						if( ema13 <= -0.144494 )
							ret := 0.200000
						if( ema13 > -0.144494 )
							ret := 0.814815 // buy
				if( ema2 > 117.015 )
					if( tema <= 118.262 )
						if( tema <= 117.968 )
							ret := -0.124294
						if( tema > 117.968 )
							ret := -0.642336
					if( tema > 118.262 )
						if( ema2 <= 118.268 )
							ret := 0.771930 // buy
						if( ema2 > 118.268 )
							ret := -0.042302
			if( bearPower > 0.078538 )
				if( ema13 <= 0.247687 )
					if( ema3 <= 165.241 )
						if( ema3 <= 154.849 )
							ret := -0.199725
						if( ema3 > 154.849 )
							ret := 0.173333
					if( ema3 > 165.241 )
						if( bearPower <= 0.233026 )
							ret := -0.372549
						if( bearPower > 0.233026 )
							ret := -0.953125 // sell
				if( ema13 > 0.247687 )
					if( ema12 <= 0.639072 )
						if( bullPower <= 0.650796 )
							ret := -0.022633
						if( bullPower > 0.650796 )
							ret := -0.286585
					if( ema12 > 0.639072 )
						if( bbp <= 1.80923 )
							ret := -0.272727
						if( bbp > 1.80923 )
							ret := 0.750000 // buy
		if( bbm > 0.258295 )
			if( ema3 <= 155.348 )
				if( ema13 <= 0.454418 )
					if( ema3 <= 154.914 )
						if( ema2 <= 117.019 )
							ret := 0.100055
						if( ema2 > 117.019 )
							ret := -0.021852
					if( ema3 > 154.914 )
						if( tema <= 155.262 )
							ret := 0.370370
						if( tema > 155.262 )
							ret := 0.948718 // buy
				if( ema13 > 0.454418 )
					if( tema <= 111.697 )
						if( bearPower <= 0.282824 )
							ret := 0.773913 // buy
						if( bearPower > 0.282824 )
							ret := 0.285714
					if( tema > 111.697 )
						if( tema <= 118.951 )
							ret := -0.156662
						if( tema > 118.951 )
							ret := 0.122037
			if( ema3 > 155.348 )
				if( bbp <= 1.05621 )
					if( tema <= 156.253 )
						if( ema3 <= 155.563 )
							ret := 0.600000
						if( ema3 > 155.563 )
							ret := -0.925926 // sell
					if( tema > 156.253 )
						if( bearPower <= -0.629786 )
							ret := -0.626866
						if( bearPower > -0.629786 )
							ret := 0.009558
				if( bbp > 1.05621 )
					if( bbm <= 0.295844 )
						if( ema1 <= 163.547 )
							ret := 0.473684
						if( ema1 > 163.547 )
							ret := -1.000000 // sell
					if( bbm > 0.295844 )
						if( bearPower <= 0.427017 )
							ret := -0.615789
						if( bearPower > 0.427017 )
							ret := -0.341772
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_ABNB_5Min_ff45fa03(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


