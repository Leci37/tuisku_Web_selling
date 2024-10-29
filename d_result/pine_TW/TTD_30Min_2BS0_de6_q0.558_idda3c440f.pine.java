//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: TTD_30Min_2BS0_da3c440f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_30Min_2BS0_da3c440f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_30Min_da3c440f(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bearPower <= -18.6535 )
		if( d_k <= 21.9798 )
			if( bullPower <= -70.0083 )
				ret := 0.733333 // buy
			if( bullPower > -70.0083 )
				if( bullPower <= -22.2123 )
					if( bbm <= 4.03853 )
						ret := -0.266667
					if( bbm > 4.03853 )
						if( bearPower <= -51.3027 )
							ret := -0.700000 // sell
						if( bearPower > -51.3027 )
							ret := -0.940476 // sell
				if( bullPower > -22.2123 )
					if( bbp <= -33.8849 )
						if( k <= 0.077956 )
							ret := 0.640000
						if( k > 0.077956 )
							ret := -0.083871
					if( bbp > -33.8849 )
						if( d_k <= -9.26742 )
							ret := 0.444444
						if( d_k > -9.26742 )
							ret := -0.625000
		if( d_k > 21.9798 )
			if( d <= 37.7993 )
				if( rsi1 <= 29.292 )
					ret := 0.500000
				if( rsi1 > 29.292 )
					ret := -0.705882 // sell
			if( d > 37.7993 )
				if( bbm <= 17.439 )
					ret := 1.000000 // buy
				if( bbm > 17.439 )
					ret := 0.500000
	if( bearPower > -18.6535 )
		if( bullPower <= -0.735717 )
			if( d_k <= 5.96357 )
				if( bbp <= -5.23646 )
					if( d_k <= -6.70446 )
						if( bearPower <= -9.29385 )
							ret := 0.036697
						if( bearPower > -9.29385 )
							ret := -0.364821
					if( d_k > -6.70446 )
						if( smoothK_k <= -2.99992 )
							ret := 0.252137
						if( smoothK_k > -2.99992 )
							ret := -0.027616
				if( bbp > -5.23646 )
					if( rsi1 <= 21.733 )
						if( bearPower <= -3.00141 )
							ret := 0.614286
						if( bearPower > -3.00141 )
							ret := -0.086375
					if( rsi1 > 21.733 )
						if( rsi1 <= 26.6056 )
							ret := 0.412109
						if( rsi1 > 26.6056 )
							ret := 0.086285
			if( d_k > 5.96357 )
				if( rsi1 <= 25.569 )
					if( d <= 24.8266 )
						if( bbm <= 3.29464 )
							ret := -0.061798
						if( bbm > 3.29464 )
							ret := 0.686275
					if( d > 24.8266 )
						if( bullPower <= -0.998683 )
							ret := 0.700375 // buy
						if( bullPower > -0.998683 )
							ret := 0.272727
				if( rsi1 > 25.569 )
					if( smoothD_d <= 9.93515 )
						if( smoothK_k <= -2.999 )
							ret := 0.057143
						if( smoothK_k > -2.999 )
							ret := 0.654867
					if( smoothD_d > 9.93515 )
						if( rsi1 <= 34.3378 )
							ret := -0.006729
						if( rsi1 > 34.3378 )
							ret := 0.208696
		if( bullPower > -0.735717 )
			if( rsi1 <= 92.5394 )
				if( bullPower <= 26.488 )
					if( k <= 95.5265 )
						if( bullPower <= 0.568506 )
							ret := 0.015414
						if( bullPower > 0.568506 )
							ret := -0.024143
					if( k > 95.5265 )
						if( bullPower <= -0.010497 )
							ret := -0.337110
						if( bullPower > -0.010497 )
							ret := -0.044305
				if( bullPower > 26.488 )
					if( d_k <= 1.84587 )
						if( smoothK_k <= 80.0013 )
							ret := -0.967742 // sell
						if( smoothK_k > 80.0013 )
							ret := -0.625000
					if( d_k > 1.84587 )
						ret := 0.428571
			if( rsi1 > 92.5394 )
				if( bullPower <= 6.26799 )
					if( rsi1 <= 95.6254 )
						if( bullPower <= 2.17391 )
							ret := -0.638889
						if( bullPower > 2.17391 )
							ret := 0.101010
					if( rsi1 > 95.6254 )
						if( smoothK_k <= 96.9662 )
							ret := 0.119048
						if( smoothK_k > 96.9662 )
							ret := 0.731707 // buy
				if( bullPower > 6.26799 )
					if( rsi1 <= 97.4269 )
						if( rsi1 <= 93.3037 )
							ret := 0.458333
						if( rsi1 > 93.3037 )
							ret := 0.858491 // buy
					if( rsi1 > 97.4269 )
						ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TTD_30Min_da3c440f(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


