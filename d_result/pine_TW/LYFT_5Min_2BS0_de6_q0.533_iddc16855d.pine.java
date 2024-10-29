//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LYFT_5Min_2BS0_dc16855d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_5Min_2BS0_dc16855d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_5Min_dc16855d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( d_k <= -6.30307 )
		if( d_k <= -19.9883 )
			if( bullPower <= 0.234255 )
				if( bbp <= -0.051868 )
					if( smoothD_d <= 42.6201 )
						if( bullPower <= 0.000818 )
							ret := -0.264706
						if( bullPower > 0.000818 )
							ret := 0.500000
					if( smoothD_d > 42.6201 )
						if( smoothK_k <= 79.2218 )
							ret := -0.846774 // sell
						if( smoothK_k > 79.2218 )
							ret := -0.162791
				if( bbp > -0.051868 )
					if( bbp <= 0.015121 )
						if( k <= 83.1043 )
							ret := -0.067698
						if( k > 83.1043 )
							ret := 0.211009
					if( bbp > 0.015121 )
						if( rsi1 <= 78.6122 )
							ret := -0.214328
						if( rsi1 > 78.6122 )
							ret := 0.338235
			if( bullPower > 0.234255 )
				if( d <= 71.8799 )
					if( rsi1 <= 51.9753 )
						ret := 0.375000
					if( rsi1 > 51.9753 )
						if( smoothK_k <= 57.4156 )
							ret := 0.000000
						if( smoothK_k > 57.4156 )
							ret := -0.962500 // sell
				if( d > 71.8799 )
					if( bearPower <= 0.121577 )
						ret := -0.571429
					if( bearPower > 0.121577 )
						ret := 0.900000 // buy
		if( d_k > -19.9883 )
			if( bbp <= 0.046214 )
				if( rsi1 <= 61.1025 )
					if( smoothK_k <= 86.8709 )
						if( d <= 35.3532 )
							ret := 0.023561
						if( d > 35.3532 )
							ret := -0.073877
					if( smoothK_k > 86.8709 )
						if( bullPower <= 0.031345 )
							ret := 0.095087
						if( bullPower > 0.031345 )
							ret := 0.448276
				if( rsi1 > 61.1025 )
					if( bearPower <= -0.015801 )
						if( rsi1 <= 74.4697 )
							ret := -0.535211
						if( rsi1 > 74.4697 )
							ret := 0.666667
					if( bearPower > -0.015801 )
						if( smoothK_k <= 36.1247 )
							ret := 0.433333
						if( smoothK_k > 36.1247 )
							ret := -0.137056
			if( bbp > 0.046214 )
				if( smoothD_d <= 87.4452 )
					if( rsi1 <= 65.3391 )
						if( smoothD_d <= 77.3228 )
							ret := -0.211620
						if( smoothD_d > 77.3228 )
							ret := 0.015355
					if( rsi1 > 65.3391 )
						if( bbm <= 0.035383 )
							ret := -0.206406
						if( bbm > 0.035383 )
							ret := 0.012899
				if( smoothD_d > 87.4452 )
					if( rsi1 <= 70.6289 )
						if( bbm <= 0.080005 )
							ret := -0.036697
						if( bbm > 0.080005 )
							ret := -0.857143 // sell
					if( rsi1 > 70.6289 )
						if( bullPower <= 0.363657 )
							ret := -0.709402 // sell
						if( bullPower > 0.363657 )
							ret := 0.111111
	if( d_k > -6.30307 )
		if( d_k <= 13.0688 )
			if( k <= 90.5813 )
				if( bearPower <= -0.118297 )
					if( rsi1 <= 16.6682 )
						if( bearPower <= -0.134492 )
							ret := 0.083799
						if( bearPower > -0.134492 )
							ret := 0.627660
					if( rsi1 > 16.6682 )
						if( d <= 1.52907 )
							ret := -0.374677
						if( d > 1.52907 )
							ret := -0.067057
				if( bearPower > -0.118297 )
					if( bbp <= 0.152542 )
						if( bbm <= 0.038205 )
							ret := 0.077328
						if( bbm > 0.038205 )
							ret := -0.022555
					if( bbp > 0.152542 )
						if( bbm <= 0.025198 )
							ret := -0.357143
						if( bbm > 0.025198 )
							ret := 0.167581
			if( k > 90.5813 )
				if( rsi1 <= 42.29 )
					if( smoothK_k <= 94.3091 )
						if( bbp <= -0.066738 )
							ret := 0.890110 // buy
						if( bbp > -0.066738 )
							ret := 0.521127
					if( smoothK_k > 94.3091 )
						if( smoothK_k <= 94.8407 )
							ret := -0.555556
						if( smoothK_k > 94.8407 )
							ret := 0.343284
				if( rsi1 > 42.29 )
					if( d <= 99.9608 )
						if( bullPower <= 0.823066 )
							ret := -0.105735
						if( bullPower > 0.823066 )
							ret := 0.956522 // buy
					if( d > 99.9608 )
						if( bbm <= 0.063779 )
							ret := -0.016304
						if( bbm > 0.063779 )
							ret := 0.635294
		if( d_k > 13.0688 )
			if( bullPower <= 0.050671 )
				if( bullPower <= -0.011108 )
					if( bbm <= 0.017222 )
						if( bearPower <= -0.029526 )
							ret := 0.472727
						if( bearPower > -0.029526 )
							ret := 0.162162
					if( bbm > 0.017222 )
						if( smoothD_d <= 75.3861 )
							ret := 0.104801
						if( smoothD_d > 75.3861 )
							ret := 0.543689
				if( bullPower > -0.011108 )
					if( rsi1 <= 33.3818 )
						if( d <= 46.2214 )
							ret := 0.176471
						if( d > 46.2214 )
							ret := 0.674286
					if( rsi1 > 33.3818 )
						if( smoothD_d <= 82.8009 )
							ret := -0.025070
						if( smoothD_d > 82.8009 )
							ret := 0.381443
			if( bullPower > 0.050671 )
				if( bbp <= -0.012291 )
					if( k <= 11.3352 )
						ret := 0.000000
					if( k > 11.3352 )
						if( rsi1 <= 54.5409 )
							ret := 0.944444 // buy
						if( rsi1 > 54.5409 )
							ret := 0.500000
				if( bbp > -0.012291 )
					if( bullPower <= 0.244198 )
						if( bbp <= 0.230323 )
							ret := 0.263323
						if( bbp > 0.230323 )
							ret := 0.681159
					if( bullPower > 0.244198 )
						if( smoothD_d <= 47.1605 )
							ret := 0.571429
						if( smoothD_d > 47.1605 )
							ret := -0.647059
	
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
float op_operation = decision_tree_0_LYFT_5Min_dc16855d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


