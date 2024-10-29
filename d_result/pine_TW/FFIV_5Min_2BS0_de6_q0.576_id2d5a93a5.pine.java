//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: FFIV_5Min_2BS0_2d5a93a5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_5Min_2BS0_2d5a93a5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_5Min_2d5a93a5(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 1.14445 )
		if( d_k <= -1.14931 )
			if( smoothD_d <= -0.504685 )
				if( d_k <= -1.2735 )
					if( k <= 5.41883 )
						if( rsi1 <= 24.4032 )
							ret := -0.193878
						if( rsi1 > 24.4032 )
							ret := -0.556650
					if( k > 5.41883 )
						if( bullPower <= -0.197575 )
							ret := -0.333333
						if( bullPower > -0.197575 )
							ret := 0.171429
				if( d_k > -1.2735 )
					if( rsi1 <= 36.0276 )
						ret := -0.250000
					if( rsi1 > 36.0276 )
						if( d <= 1.07276 )
							ret := -0.250000
						if( d > 1.07276 )
							ret := 0.900000 // buy
			if( smoothD_d > -0.504685 )
				if( d_k <= -9.73334 )
					if( smoothK_k <= 22.7085 )
						if( bbp <= -0.846886 )
							ret := 0.611111
						if( bbp > -0.846886 )
							ret := -0.264605
					if( smoothK_k > 22.7085 )
						if( rsi1 <= 21.6119 )
							ret := 0.826087 // buy
						if( rsi1 > 21.6119 )
							ret := 0.033277
				if( d_k > -9.73334 )
					if( bearPower <= -0.940344 )
						if( bearPower <= -1.30382 )
							ret := 0.006289
						if( bearPower > -1.30382 )
							ret := -0.490000
					if( bearPower > -0.940344 )
						if( rsi1 <= 25.7456 )
							ret := 0.278846
						if( rsi1 > 25.7456 )
							ret := -0.061717
		if( d_k > -1.14931 )
			if( bullPower <= -1.38318 )
				if( d_k <= 2.89353 )
					if( bbm <= 2.06965 )
						if( k <= 26.2789 )
							ret := 0.986111 // buy
						if( k > 26.2789 )
							ret := 0.000000
					if( bbm > 2.06965 )
						ret := 0.000000
				if( d_k > 2.89353 )
					if( rsi1 <= 14.7986 )
						ret := -0.600000
					if( rsi1 > 14.7986 )
						if( bbp <= -4.5082 )
							ret := 1.000000 // buy
						if( bbp > -4.5082 )
							ret := 0.629630
			if( bullPower > -1.38318 )
				if( rsi1 <= 91.5601 )
					if( smoothD_d <= 94.5537 )
						if( rsi1 <= 17.6894 )
							ret := 0.215054
						if( rsi1 > 17.6894 )
							ret := 0.014171
					if( smoothD_d > 94.5537 )
						if( bbm <= 0.079331 )
							ret := 0.476636
						if( bbm > 0.079331 )
							ret := 0.090416
				if( rsi1 > 91.5601 )
					if( d_k <= -0.851247 )
						ret := -1.000000 // sell
					if( d_k > -0.851247 )
						if( bullPower <= 0.501978 )
							ret := 0.984375 // buy
						if( bullPower > 0.501978 )
							ret := 0.200000
	if( bbp > 1.14445 )
		if( d <= 71.611 )
			if( d_k <= -3.47981 )
				if( rsi1 <= 59.9101 )
					if( k <= 28.0421 )
						if( k <= 20.8242 )
							ret := -1.000000 // sell
						if( k > 20.8242 )
							ret := 0.750000 // buy
					if( k > 28.0421 )
						if( bullPower <= 0.975036 )
							ret := -0.636364
						if( bullPower > 0.975036 )
							ret := -0.952381 // sell
				if( rsi1 > 59.9101 )
					if( rsi1 <= 75.9472 )
						if( d <= 17.807 )
							ret := -0.703125 // sell
						if( d > 17.807 )
							ret := -0.173077
					if( rsi1 > 75.9472 )
						if( smoothD_d <= 21.1059 )
							ret := 0.600000
						if( smoothD_d > 21.1059 )
							ret := -0.880342 // sell
			if( d_k > -3.47981 )
				if( bearPower <= 0.981186 )
					if( d_k <= -0.185171 )
						if( d <= 65.8415 )
							ret := 0.422222
						if( d > 65.8415 )
							ret := -0.888889 // sell
					if( d_k > -0.185171 )
						if( smoothD_d <= 52.9284 )
							ret := -0.581818
						if( smoothD_d > 52.9284 )
							ret := 0.090909
				if( bearPower > 0.981186 )
					if( rsi1 <= 58.762 )
						if( rsi1 <= 48.6716 )
							ret := 1.000000 // buy
						if( rsi1 > 48.6716 )
							ret := -0.833333 // sell
					if( rsi1 > 58.762 )
						if( bbm <= 1.01 )
							ret := 1.000000 // buy
						if( bbm > 1.01 )
							ret := 0.714286 // buy
		if( d > 71.611 )
			if( k <= 99.6208 )
				if( d <= 97.8415 )
					if( bearPower <= 1.01562 )
						if( d_k <= -10.8099 )
							ret := 0.424658
						if( d_k > -10.8099 )
							ret := -0.083497
					if( bearPower > 1.01562 )
						if( bbm <= 0.272897 )
							ret := -0.857143 // sell
						if( bbm > 0.272897 )
							ret := -0.184874
				if( d > 97.8415 )
					if( d <= 99.4609 )
						if( bullPower <= 0.808086 )
							ret := -0.200000
						if( bullPower > 0.808086 )
							ret := 0.673611
					if( d > 99.4609 )
						if( rsi1 <= 81.7318 )
							ret := 0.857143 // buy
						if( rsi1 > 81.7318 )
							ret := -0.720000 // sell
			if( k > 99.6208 )
				if( rsi1 <= 70.6141 )
					if( d_k <= -0.209601 )
						if( bearPower <= 0.400368 )
							ret := 1.000000 // buy
						if( bearPower > 0.400368 )
							ret := 0.326087
					if( d_k > -0.209601 )
						ret := -0.300000
				if( rsi1 > 70.6141 )
					if( bbm <= 0.321423 )
						if( bearPower <= 0.613022 )
							ret := 0.279070
						if( bearPower > 0.613022 )
							ret := -0.494624
					if( bbm > 0.321423 )
						if( bearPower <= 0.192588 )
							ret := 1.000000 // buy
						if( bearPower > 0.192588 )
							ret := -0.756579 // sell
	
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
float op_operation = decision_tree_0_FFIV_5Min_2d5a93a5(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


