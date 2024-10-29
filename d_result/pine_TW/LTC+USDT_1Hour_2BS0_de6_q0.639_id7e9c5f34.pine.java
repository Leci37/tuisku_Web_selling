//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LTCUSDT_1Hour_2BS0_7e9c5f34 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_1Hour_2BS0_7e9c5f34", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_1Hour_7e9c5f34(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 1.0596 )
		if( rsi1 <= 38.2118 )
			if( d_k <= -4.19704 )
				if( bullPower <= -0.309962 )
					if( smoothD_d <= 19.6781 )
						if( rsi1 <= 18.4719 )
							ret := -0.462366
						if( rsi1 > 18.4719 )
							ret := 0.370998
					if( smoothD_d > 19.6781 )
						if( rsi1 <= 32.2998 )
							ret := -0.153713
						if( rsi1 > 32.2998 )
							ret := 0.277228
				if( bullPower > -0.309962 )
					if( bullPower <= 0.205937 )
						if( rsi1 <= 30.4805 )
							ret := -0.390438
						if( rsi1 > 30.4805 )
							ret := -0.035952
					if( bullPower > 0.205937 )
						if( bearPower <= -2.43462 )
							ret := 0.045455
						if( bearPower > -2.43462 )
							ret := -0.552632
			if( d_k > -4.19704 )
				if( rsi1 <= 21.1813 )
					if( bullPower <= -0.38134 )
						if( bearPower <= -2.47346 )
							ret := -0.430034
						if( bearPower > -2.47346 )
							ret := -0.179431
					if( bullPower > -0.38134 )
						if( d_k <= -0.649778 )
							ret := -0.407895
						if( d_k > -0.649778 )
							ret := -0.777778 // sell
				if( rsi1 > 21.1813 )
					if( bbp <= -4.08847 )
						if( k <= 1.09634 )
							ret := -0.683673
						if( k > 1.09634 )
							ret := 0.132626
					if( bbp > -4.08847 )
						if( rsi1 <= 32.58 )
							ret := -0.317663
						if( rsi1 > 32.58 )
							ret := -0.108392
		if( rsi1 > 38.2118 )
			if( bbp <= -0.706834 )
				if( rsi1 <= 52.7576 )
					if( bullPower <= -0.137686 )
						if( bullPower <= -2.69625 )
							ret := 0.872093 // buy
						if( bullPower > -2.69625 )
							ret := 0.468940
					if( bullPower > -0.137686 )
						if( bearPower <= -2.86516 )
							ret := -0.150171
						if( bearPower > -2.86516 )
							ret := 0.260119
				if( rsi1 > 52.7576 )
					if( k <= 6.41481 )
						ret := -0.333333
					if( k > 6.41481 )
						if( smoothK_k <= 79.9165 )
							ret := 0.751252 // buy
						if( smoothK_k > 79.9165 )
							ret := 0.555556
			if( bbp > -0.706834 )
				if( k <= 98.9445 )
					if( rsi1 <= 48.0346 )
						if( bullPower <= 0.34739 )
							ret := 0.014972
						if( bullPower > 0.34739 )
							ret := -0.303097
					if( rsi1 > 48.0346 )
						if( BBPower_Color <= 0.5 )
							ret := 0.363000
						if( BBPower_Color > 0.5 )
							ret := 0.108745
				if( k > 98.9445 )
					if( rsi1 <= 81.2145 )
						if( bbm <= 0.60069 )
							ret := 0.146694
						if( bbm > 0.60069 )
							ret := 0.388579
					if( rsi1 > 81.2145 )
						if( d_k <= 0.004511 )
							ret := 0.683694
						if( d_k > 0.004511 )
							ret := 0.384615
	if( d_k > 1.0596 )
		if( rsi1 <= 31.6828 )
			if( bullPower <= -0.026132 )
				if( d <= 18.6893 )
					if( bbm <= 7.29155 )
						if( rsi1 <= 22.5428 )
							ret := -0.373626
						if( rsi1 > 22.5428 )
							ret := -0.056117
					if( bbm > 7.29155 )
						if( rsi1 <= 22.0424 )
							ret := -0.913043 // sell
						if( rsi1 > 22.0424 )
							ret := -0.392157
				if( d > 18.6893 )
					if( rsi1 <= 27.3018 )
						if( d_k <= 6.74461 )
							ret := -0.379310
						if( d_k > 6.74461 )
							ret := -0.646799
					if( rsi1 > 27.3018 )
						if( d_k <= 16.5883 )
							ret := -0.419134
						if( d_k > 16.5883 )
							ret := 0.014925
			if( bullPower > -0.026132 )
				if( bbp <= -4.11574 )
					if( bearPower <= -5.50928 )
						if( d_k <= 8.5895 )
							ret := -0.636364
						if( d_k > 8.5895 )
							ret := 0.444444
					if( bearPower > -5.50928 )
						ret := 0.842105 // buy
				if( bbp > -4.11574 )
					if( bbm <= 0.282214 )
						if( bullPower <= 0.124718 )
							ret := 0.000000
						if( bullPower > 0.124718 )
							ret := -0.333333
					if( bbm > 0.282214 )
						if( bearPower <= -1.05184 )
							ret := -0.617801
						if( bearPower > -1.05184 )
							ret := -0.826953 // sell
		if( rsi1 > 31.6828 )
			if( bbp <= -0.215182 )
				if( rsi1 <= 44.5258 )
					if( bbp <= -2.35506 )
						if( smoothD_d <= 5.29263 )
							ret := -0.314286
						if( smoothD_d > 5.29263 )
							ret := 0.163683
					if( bbp > -2.35506 )
						if( bullPower <= -0.375965 )
							ret := 0.195846
						if( bullPower > -0.375965 )
							ret := -0.178799
				if( rsi1 > 44.5258 )
					if( bullPower <= -0.297357 )
						if( smoothD_d <= 18.3511 )
							ret := 0.728571 // buy
						if( smoothD_d > 18.3511 )
							ret := 0.404459
					if( bullPower > -0.297357 )
						if( rsi1 <= 53.1368 )
							ret := 0.097122
						if( rsi1 > 53.1368 )
							ret := 0.354102
			if( bbp > -0.215182 )
				if( rsi1 <= 63.0587 )
					if( bbp <= 0.877706 )
						if( rsi1 <= 47.5182 )
							ret := -0.402850
						if( rsi1 > 47.5182 )
							ret := -0.067380
					if( bbp > 0.877706 )
						if( bearPower <= -0.081888 )
							ret := -0.301370
						if( bearPower > -0.081888 )
							ret := -0.536284
				if( rsi1 > 63.0587 )
					if( bullPower <= 1.64235 )
						if( bearPower <= -0.040267 )
							ret := 0.334405
						if( bearPower > -0.040267 )
							ret := 0.041103
					if( bullPower > 1.64235 )
						if( rsi1 <= 71.3292 )
							ret := -0.261047
						if( rsi1 > 71.3292 )
							ret := 0.032095
	
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
float op_operation = decision_tree_0_LTCUSDT_1Hour_7e9c5f34(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


