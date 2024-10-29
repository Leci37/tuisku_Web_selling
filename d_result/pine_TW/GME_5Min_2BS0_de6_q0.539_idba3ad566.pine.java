//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: GME_5Min_2BS0_ba3ad566 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_5Min_2BS0_ba3ad566", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_5Min_ba3ad566(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= -0.023798 )
		if( bbm <= 0.946849 )
			if( d_k <= 2.95028 )
				if( bullPower <= -0.556747 )
					if( d_k <= -9.1119 )
						ret := -0.833333 // sell
					if( d_k > -9.1119 )
						if( bbm <= 0.763865 )
							ret := 0.479339
						if( bbm > 0.763865 )
							ret := 1.000000 // buy
				if( bullPower > -0.556747 )
					if( smoothD_d <= 58.1715 )
						if( bullPower <= -0.163765 )
							ret := 0.121951
						if( bullPower > -0.163765 )
							ret := -0.006616
					if( smoothD_d > 58.1715 )
						if( bullPower <= -0.073306 )
							ret := 0.366279
						if( bullPower > -0.073306 )
							ret := 0.085441
			if( d_k > 2.95028 )
				if( bbp <= -0.183516 )
					if( bbm <= 0.026163 )
						if( d <= 4.5969 )
							ret := -0.857143 // sell
						if( d > 4.5969 )
							ret := 0.628788
					if( bbm > 0.026163 )
						if( smoothK_k <= 1.76572 )
							ret := 0.037987
						if( smoothK_k > 1.76572 )
							ret := 0.220131
				if( bbp > -0.183516 )
					if( bbm <= 0.346943 )
						if( bullPower <= -0.035008 )
							ret := 0.195172
						if( bullPower > -0.035008 )
							ret := 0.049552
					if( bbm > 0.346943 )
						if( bullPower <= 0.303852 )
							ret := 0.635135
						if( bullPower > 0.303852 )
							ret := -0.611111
		if( bbm > 0.946849 )
			if( d <= 13.6635 )
				if( d <= 3.73692 )
					if( bbp <= -6.14225 )
						if( bbm <= 3.24641 )
							ret := 0.571429
						if( bbm > 3.24641 )
							ret := -1.000000 // sell
					if( bbp > -6.14225 )
						if( rsi1 <= 44.0733 )
							ret := -0.794118 // sell
						if( rsi1 > 44.0733 )
							ret := 1.000000 // buy
				if( d > 3.73692 )
					if( k <= 14.5909 )
						if( d_k <= 2.46596 )
							ret := 0.769231 // buy
						if( d_k > 2.46596 )
							ret := 0.093750
					if( k > 14.5909 )
						if( bearPower <= -1.63741 )
							ret := 0.200000
						if( bearPower > -1.63741 )
							ret := -1.000000 // sell
			if( d > 13.6635 )
				if( bullPower <= -2.75118 )
					if( d <= 49.0404 )
						ret := 1.000000 // buy
					if( d > 49.0404 )
						ret := -1.000000 // sell
				if( bullPower > -2.75118 )
					if( k <= 77.7535 )
						if( smoothD_d <= 21.8873 )
							ret := -0.832061 // sell
						if( smoothD_d > 21.8873 )
							ret := -0.427136
					if( k > 77.7535 )
						if( d_k <= -12.85 )
							ret := 0.800000 // buy
						if( d_k > -12.85 )
							ret := -0.109756
	if( bbp > -0.023798 )
		if( d_k <= -15.9018 )
			if( bbp <= 0.078818 )
				if( rsi1 <= 39.8218 )
					if( bbp <= 0.065934 )
						if( d <= 46.291 )
							ret := 0.104167
						if( d > 46.291 )
							ret := 0.634146
					if( bbp > 0.065934 )
						ret := -1.000000 // sell
				if( rsi1 > 39.8218 )
					if( d_k <= -16.0533 )
						if( smoothD_d <= 23.282 )
							ret := -0.241107
						if( smoothD_d > 23.282 )
							ret := -0.053245
					if( d_k > -16.0533 )
						if( bearPower <= 0.012051 )
							ret := -0.725000 // sell
						if( bearPower > 0.012051 )
							ret := 0.333333
			if( bbp > 0.078818 )
				if( bbm <= 0.039775 )
					if( bullPower <= 0.07671 )
						if( smoothK_k <= 84.0468 )
							ret := -0.211921
						if( smoothK_k > 84.0468 )
							ret := -0.687500
					if( bullPower > 0.07671 )
						if( smoothD_d <= 74.9405 )
							ret := -0.746988 // sell
						if( smoothD_d > 74.9405 )
							ret := 0.000000
				if( bbm > 0.039775 )
					if( bbp <= 0.863446 )
						if( d_k <= -24.9351 )
							ret := -0.370175
						if( d_k > -24.9351 )
							ret := -0.169626
					if( bbp > 0.863446 )
						if( bbm <= 2.61031 )
							ret := 0.149153
						if( bbm > 2.61031 )
							ret := -0.806452 // sell
		if( d_k > -15.9018 )
			if( rsi1 <= 59.7909 )
				if( smoothD_d <= 92.1525 )
					if( bbm <= 0.058932 )
						if( bearPower <= 0.009892 )
							ret := -0.007874
						if( bearPower > 0.009892 )
							ret := -0.115002
					if( bbm > 0.058932 )
						if( d_k <= 1.61271 )
							ret := 0.006524
						if( d_k > 1.61271 )
							ret := 0.119680
				if( smoothD_d > 92.1525 )
					if( bullPower <= 0.19196 )
						if( smoothK_k <= 96.9962 )
							ret := -0.165829
						if( smoothK_k > 96.9962 )
							ret := 0.214953
					if( bullPower > 0.19196 )
						if( bbp <= 0.046045 )
							ret := 1.000000 // buy
						if( bbp > 0.046045 )
							ret := -0.942857 // sell
			if( rsi1 > 59.7909 )
				if( bearPower <= 0.04465 )
					if( rsi1 <= 72.9291 )
						if( rsi1 <= 69.4991 )
							ret := -0.024912
						if( rsi1 > 69.4991 )
							ret := -0.178698
					if( rsi1 > 72.9291 )
						if( d <= 98.7757 )
							ret := 0.158710
						if( d > 98.7757 )
							ret := -0.270270
				if( bearPower > 0.04465 )
					if( bbm <= 0.057758 )
						if( smoothK_k <= 77.5453 )
							ret := -0.424818
						if( smoothK_k > 77.5453 )
							ret := -0.222707
					if( bbm > 0.057758 )
						if( bullPower <= 6.21134 )
							ret := -0.075370
						if( bullPower > 6.21134 )
							ret := -0.892857 // sell
	
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_GME_5Min_ba3ad566(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


