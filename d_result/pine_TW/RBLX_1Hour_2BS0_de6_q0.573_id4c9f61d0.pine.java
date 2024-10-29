//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: RBLX_1Hour_2BS0_4c9f61d0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RBLX_1Hour_2BS0_4c9f61d0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RBLX_1Hour_4c9f61d0(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 0.65792 )
		if( rsi1 <= 34 )
			if( d <= 69.0847 )
				if( rsi1 <= 16.1853 )
					if( bbm <= 1.18184 )
						if( bullPower <= -0.743253 )
							ret := 0.047458
						if( bullPower > -0.743253 )
							ret := -0.348101
					if( bbm > 1.18184 )
						if( smoothD_d <= 8.08592 )
							ret := 0.326316
						if( smoothD_d > 8.08592 )
							ret := 0.818182 // buy
				if( rsi1 > 16.1853 )
					if( smoothK_k <= -2.92412 )
						if( rsi1 <= 17.9239 )
							ret := -0.039216
						if( rsi1 > 17.9239 )
							ret := -0.569767
					if( smoothK_k > -2.92412 )
						if( bearPower <= -5.13218 )
							ret := -0.936170 // sell
						if( bearPower > -5.13218 )
							ret := -0.093128
			if( d > 69.0847 )
				if( smoothK_k <= 85.0457 )
					if( bullPower <= -0.487797 )
						if( bearPower <= -2.63222 )
							ret := 0.875000 // buy
						if( bearPower > -2.63222 )
							ret := -0.200000
					if( bullPower > -0.487797 )
						if( bbm <= 8.79071 )
							ret := 0.539062
						if( bbm > 8.79071 )
							ret := -1.000000 // sell
				if( smoothK_k > 85.0457 )
					if( d_k <= -11.7594 )
						ret := 0.000000
					if( d_k > -11.7594 )
						if( rsi1 <= 32.7957 )
							ret := -0.884615 // sell
						if( rsi1 > 32.7957 )
							ret := 0.000000
		if( rsi1 > 34 )
			if( bbm <= 2.67725 )
				if( BBPower_Color <= 0.5 )
					if( bbp <= 0.01089 )
						if( bullPower <= -0.11207 )
							ret := 0.179398
						if( bullPower > -0.11207 )
							ret := 0.048999
					if( bbp > 0.01089 )
						if( d <= 96.6724 )
							ret := 0.272727
						if( d > 96.6724 )
							ret := -0.777778 // sell
				if( BBPower_Color > 0.5 )
					if( rsi1 <= 71.7203 )
						if( k <= 11.7791 )
							ret := -0.219269
						if( k > 11.7791 )
							ret := 0.019334
					if( rsi1 > 71.7203 )
						if( d_k <= -1.46421 )
							ret := -0.084615
						if( d_k > -1.46421 )
							ret := 0.390071
			if( bbm > 2.67725 )
				if( rsi1 <= 54.6407 )
					if( k <= 57.8856 )
						if( d <= 61.8104 )
							ret := -0.324324
						if( d > 61.8104 )
							ret := 0.647059
					if( k > 57.8856 )
						if( k <= 86.5451 )
							ret := -0.980000 // sell
						if( k > 86.5451 )
							ret := -0.400000
				if( rsi1 > 54.6407 )
					if( d_k <= 20.3986 )
						if( BBPower_Color <= 0.5 )
							ret := 0.814815 // buy
						if( BBPower_Color > 0.5 )
							ret := -1.000000 // sell
					if( d_k > 20.3986 )
						ret := -1.000000 // sell
	if( bbp > 0.65792 )
		if( k <= 41.2701 )
			if( d_k <= -16.8248 )
				if( BBPower_Color <= 0.5 )
					ret := -0.333333
				if( BBPower_Color > 0.5 )
					if( bbm <= 0.423383 )
						ret := 0.250000
					if( bbm > 0.423383 )
						if( bbp <= 0.749891 )
							ret := 0.000000
						if( bbp > 0.749891 )
							ret := 1.000000 // buy
			if( d_k > -16.8248 )
				if( bbp <= 1.21135 )
					if( d <= 18.0987 )
						if( rsi1 <= 67.3488 )
							ret := -0.205128
						if( rsi1 > 67.3488 )
							ret := -0.853333 // sell
					if( d > 18.0987 )
						if( smoothD_d <= 15.8772 )
							ret := 1.000000 // buy
						if( smoothD_d > 15.8772 )
							ret := -0.080000
				if( bbp > 1.21135 )
					if( smoothK_k <= 15.3 )
						if( d <= 10.4589 )
							ret := -0.442623
						if( d > 10.4589 )
							ret := 0.241935
					if( smoothK_k > 15.3 )
						if( d_k <= -13.2485 )
							ret := -0.045455
						if( d_k > -13.2485 )
							ret := -0.721190 // sell
		if( k > 41.2701 )
			if( bbm <= 1.16481 )
				if( d_k <= 12.812 )
					if( rsi1 <= 90.2883 )
						if( d_k <= -18.4098 )
							ret := 0.216535
						if( d_k > -18.4098 )
							ret := -0.024005
					if( rsi1 > 90.2883 )
						if( smoothK_k <= 96.5475 )
							ret := 0.692308
						if( smoothK_k > 96.5475 )
							ret := -0.100000
				if( d_k > 12.812 )
					if( rsi1 <= 58.0398 )
						ret := 0.700000 // buy
					if( rsi1 > 58.0398 )
						if( bbp <= 0.829164 )
							ret := 0.250000
						if( bbp > 0.829164 )
							ret := -0.698795
			if( bbm > 1.16481 )
				if( smoothD_d <= 73.7068 )
					if( bullPower <= 4.35447 )
						if( bbm <= 1.195 )
							ret := -0.920000 // sell
						if( bbm > 1.195 )
							ret := 0.043988
					if( bullPower > 4.35447 )
						if( d <= 73.7274 )
							ret := 0.850746 // buy
						if( d > 73.7274 )
							ret := -1.000000 // sell
				if( smoothD_d > 73.7068 )
					if( bearPower <= 0.39681 )
						if( d_k <= 8.39244 )
							ret := -0.555944
						if( d_k > 8.39244 )
							ret := 0.277778
					if( bearPower > 0.39681 )
						if( bullPower <= 5.10235 )
							ret := -0.331754
						if( bullPower > 5.10235 )
							ret := 0.254237
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_RBLX_1Hour_4c9f61d0(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


