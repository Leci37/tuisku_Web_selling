//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SOLUSDT_1Hour_2BS0_c0f65294 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Hour_2BS0_c0f65294", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Hour_c0f65294(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 56.3113 )
		if( d_k <= -1.64003 )
			if( bbp <= -0.392328 )
				if( d_k <= -5.92101 )
					if( rsi1 <= 35.9058 )
						if( d <= 12.3267 )
							ret := 0.430851
						if( d > 12.3267 )
							ret := -0.110676
					if( rsi1 > 35.9058 )
						if( bullPower <= -0.406398 )
							ret := 0.589041
						if( bullPower > -0.406398 )
							ret := 0.316898
				if( d_k > -5.92101 )
					if( rsi1 <= 32.8439 )
						if( smoothD_d <= 0.05303 )
							ret := 0.347561
						if( smoothD_d > 0.05303 )
							ret := -0.201397
					if( rsi1 > 32.8439 )
						if( bearPower <= -3.20067 )
							ret := 0.563265
						if( bearPower > -3.20067 )
							ret := 0.194355
			if( bbp > -0.392328 )
				if( d <= 21.7838 )
					if( d_k <= -7.78636 )
						if( bearPower <= -0.187216 )
							ret := 0.497024
						if( bearPower > -0.187216 )
							ret := 0.118519
					if( d_k > -7.78636 )
						if( smoothD_d <= -0.145058 )
							ret := 0.352459
						if( smoothD_d > -0.145058 )
							ret := -0.086957
				if( d > 21.7838 )
					if( bearPower <= -0.034173 )
						if( rsi1 <= 46.329 )
							ret := -0.213869
						if( rsi1 > 46.329 )
							ret := 0.039879
					if( bearPower > -0.034173 )
						if( k <= 92.9871 )
							ret := -0.219402
						if( k > 92.9871 )
							ret := -0.552995
		if( d_k > -1.64003 )
			if( bullPower <= 0.083463 )
				if( bbm <= 0.081874 )
					if( rsi1 <= 23.4318 )
						if( bearPower <= -0.052703 )
							ret := 0.600000
						if( bearPower > -0.052703 )
							ret := -0.235294
					if( rsi1 > 23.4318 )
						if( rsi1 <= 24.8252 )
							ret := -0.630435
						if( rsi1 > 24.8252 )
							ret := 0.138172
				if( bbm > 0.081874 )
					if( smoothK_k <= -0.060934 )
						if( rsi1 <= 41.7923 )
							ret := -0.406290
						if( rsi1 > 41.7923 )
							ret := 0.169565
					if( smoothK_k > -0.060934 )
						if( rsi1 <= 32.827 )
							ret := -0.348311
						if( rsi1 > 32.827 )
							ret := 0.031750
			if( bullPower > 0.083463 )
				if( d_k <= 8.65856 )
					if( rsi1 <= 36.9887 )
						if( bbp <= -0.281356 )
							ret := -0.456019
						if( bbp > -0.281356 )
							ret := -0.693827
					if( rsi1 > 36.9887 )
						if( bearPower <= 0.012381 )
							ret := -0.153510
						if( bearPower > 0.012381 )
							ret := -0.468220
				if( d_k > 8.65856 )
					if( rsi1 <= 43.6843 )
						if( bbm <= 7.50933 )
							ret := -0.654084
						if( bbm > 7.50933 )
							ret := 0.750000 // buy
					if( rsi1 > 43.6843 )
						if( bearPower <= 0.206955 )
							ret := -0.285059
						if( bearPower > 0.206955 )
							ret := -0.697500
	if( rsi1 > 56.3113 )
		if( bearPower <= -0.021866 )
			if( d_k <= -5.00211 )
				if( BBPower_Color <= 0.5 )
					if( bbm <= 0.124741 )
						if( k <= 86.687 )
							ret := -0.179487
						if( k > 86.687 )
							ret := 0.380952
					if( bbm > 0.124741 )
						if( rsi1 <= 59.8729 )
							ret := 0.633663
						if( rsi1 > 59.8729 )
							ret := 0.832808 // buy
				if( BBPower_Color > 0.5 )
					if( rsi1 <= 74.8165 )
						if( rsi1 <= 59.5813 )
							ret := 0.216312
						if( rsi1 > 59.5813 )
							ret := 0.464901
					if( rsi1 > 74.8165 )
						if( rsi1 <= 78.2897 )
							ret := 0.962264 // buy
						if( rsi1 > 78.2897 )
							ret := 0.782609 // buy
			if( d_k > -5.00211 )
				if( rsi1 <= 64.1377 )
					if( bbp <= 1.39855 )
						if( smoothD_d <= 31.5179 )
							ret := 0.508734
						if( smoothD_d > 31.5179 )
							ret := 0.230199
					if( bbp > 1.39855 )
						if( rsi1 <= 59.5759 )
							ret := -0.486239
						if( rsi1 > 59.5759 )
							ret := 0.204724
				if( rsi1 > 64.1377 )
					if( rsi1 <= 73.142 )
						if( BBPower_Color <= 0.5 )
							ret := 0.630435
						if( BBPower_Color > 0.5 )
							ret := 0.435855
					if( rsi1 > 73.142 )
						if( d_k <= -0.618319 )
							ret := 0.505495
						if( d_k > -0.618319 )
							ret := 0.881481 // buy
		if( bearPower > -0.021866 )
			if( rsi1 <= 69.5743 )
				if( bbp <= 4.48346 )
					if( d_k <= 6.31712 )
						if( bullPower <= 1.08708 )
							ret := -0.053502
						if( bullPower > 1.08708 )
							ret := 0.189847
					if( d_k > 6.31712 )
						if( bearPower <= 0.167756 )
							ret := 0.044496
						if( bearPower > 0.167756 )
							ret := -0.401816
				if( bbp > 4.48346 )
					if( d_k <= 14.4395 )
						if( d <= 14.3316 )
							ret := -0.653061
						if( d > 14.3316 )
							ret := -0.251682
					if( d_k > 14.4395 )
						if( smoothK_k <= 22.4984 )
							ret := -0.294118
						if( smoothK_k > 22.4984 )
							ret := -0.801980 // sell
			if( rsi1 > 69.5743 )
				if( d_k <= 1.88289 )
					if( bullPower <= 0.250358 )
						if( bbm <= 0.148928 )
							ret := -0.197309
						if( bbm > 0.148928 )
							ret := 0.451613
					if( bullPower > 0.250358 )
						if( bbm <= 0.251613 )
							ret := 0.150127
						if( bbm > 0.251613 )
							ret := 0.511831
				if( d_k > 1.88289 )
					if( d <= 89.9959 )
						if( bullPower <= 0.125645 )
							ret := -0.571429
						if( bullPower > 0.125645 )
							ret := 0.236818
					if( d > 89.9959 )
						if( d_k <= 4.19324 )
							ret := 0.018779
						if( d_k > 4.19324 )
							ret := -0.546174
	
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
float op_operation = decision_tree_0_SOLUSDT_1Hour_c0f65294(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


