//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: BNBUSDT_15Min_2BS0_b89a94a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2BS0_b89a94a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_b89a94a2(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 34.2544 )
		if( smoothD_d <= 5.33018 )
			if( bbp <= -0.278422 )
				if( rsi1 <= 28.5293 )
					if( bbp <= -2.5237 )
						if( bullPower <= -0.390657 )
							if( bbp <= -22.3329 )
								ret := 0.573333
							if( bbp > -22.3329 )
								ret := -0.357709
						if( bullPower > -0.390657 )
							if( d_k <= 4.59218 )
								ret := -0.867704 // sell
							if( d_k > 4.59218 )
								ret := 0.333333
					if( bbp > -2.5237 )
						if( smoothK_k <= -1.59687 )
							if( rsi1 <= 21.9899 )
								ret := -0.815873 // sell
							if( rsi1 > 21.9899 )
								ret := -0.651485
						if( smoothK_k > -1.59687 )
							if( bullPower <= -0.100546 )
								ret := -0.429479
							if( bullPower > -0.100546 )
								ret := -0.723451 // sell
				if( rsi1 > 28.5293 )
					if( rsi1 <= 42.6342 )
						if( d_k <= -3.67548 )
							if( smoothD_d <= 3.64137 )
								ret := -0.516997
							if( smoothD_d > 3.64137 )
								ret := -0.320475
						if( d_k > -3.67548 )
							if( bullPower <= -0.022551 )
								ret := -0.082727
							if( bullPower > -0.022551 )
								ret := -0.339363
					if( rsi1 > 42.6342 )
						if( k <= 9.57261 )
							if( d <= 4.35105 )
								ret := 0.037313
							if( d > 4.35105 )
								ret := 0.328502
						if( k > 9.57261 )
							if( bearPower <= -3.42277 )
								ret := 0.785714 // buy
							if( bearPower > -3.42277 )
								ret := -0.245833
			if( bbp > -0.278422 )
				if( smoothD_d <= -1.22158 )
					if( rsi1 <= 42.9327 )
						if( bbm <= 0.400375 )
							if( rsi1 <= 31.9091 )
								ret := -0.684211
							if( rsi1 > 31.9091 )
								ret := -0.138889
						if( bbm > 0.400375 )
							if( bullPower <= 1.02279 )
								ret := -0.780105 // sell
							if( bullPower > 1.02279 )
								ret := -0.909574 // sell
					if( rsi1 > 42.9327 )
						if( bullPower <= 1.10216 )
							if( rsi1 <= 48.989 )
								ret := -0.112500
							if( rsi1 > 48.989 )
								ret := 0.303571
						if( bullPower > 1.10216 )
							if( bbp <= 1.02406 )
								ret := 0.000000
							if( bbp > 1.02406 )
								ret := -0.715909 // sell
				if( smoothD_d > -1.22158 )
					if( bearPower <= 0.521855 )
						if( bbm <= 0.6 )
							if( rsi1 <= 46.4987 )
								ret := -0.384615
							if( rsi1 > 46.4987 )
								ret := 0.004762
						if( bbm > 0.6 )
							if( rsi1 <= 46.392 )
								ret := -0.724138 // sell
							if( rsi1 > 46.392 )
								ret := -0.152542
					if( bearPower > 0.521855 )
						if( k <= 9.37732 )
							if( k <= 2.08264 )
								ret := -0.601449
							if( k > 2.08264 )
								ret := -0.775510 // sell
						if( k > 9.37732 )
							if( bbp <= 3.34066 )
								ret := 0.037037
							if( bbp > 3.34066 )
								ret := -0.666667
		if( smoothD_d > 5.33018 )
			if( bbp <= 0.308341 )
				if( rsi1 <= 42.3084 )
					if( bbp <= -1.88943 )
						if( rsi1 <= 28.6111 )
							if( smoothK_k <= 28.6037 )
								ret := -0.160520
							if( smoothK_k > 28.6037 )
								ret := -0.473684
						if( rsi1 > 28.6111 )
							if( d_k <= -8.65534 )
								ret := -0.314145
							if( d_k > -8.65534 )
								ret := 0.094136
					if( bbp > -1.88943 )
						if( rsi1 <= 30.7684 )
							if( rsi1 <= 21.4207 )
								ret := -0.792023 // sell
							if( rsi1 > 21.4207 )
								ret := -0.520670
						if( rsi1 > 30.7684 )
							if( bbp <= -0.611076 )
								ret := -0.166616
							if( bbp > -0.611076 )
								ret := -0.390648
				if( rsi1 > 42.3084 )
					if( bbp <= -1.15814 )
						if( d <= 52.9337 )
							if( bullPower <= -4.03194 )
								ret := -0.904762 // sell
							if( bullPower > -4.03194 )
								ret := 0.297272
						if( d > 52.9337 )
							if( rsi1 <= 53.0563 )
								ret := -0.607143
							if( rsi1 > 53.0563 )
								ret := 0.857143 // buy
					if( bbp > -1.15814 )
						if( bearPower <= -1.05866 )
							if( rsi1 <= 52.861 )
								ret := 0.046377
							if( rsi1 > 52.861 )
								ret := 0.529412
						if( bearPower > -1.05866 )
							if( smoothD_d <= 15.4057 )
								ret := -0.053044
							if( smoothD_d > 15.4057 )
								ret := 0.058932
			if( bbp > 0.308341 )
				if( rsi1 <= 47.4349 )
					if( bullPower <= 1.45376 )
						if( d_k <= -10.143 )
							if( d_k <= -15.4506 )
								ret := 0.923077 // buy
							if( d_k > -15.4506 )
								ret := 0.070423
						if( d_k > -10.143 )
							if( bbm <= 0.401301 )
								ret := -0.263636
							if( bbm > 0.401301 )
								ret := -0.648219
					if( bullPower > 1.45376 )
						if( d_k <= -2.41009 )
							if( k <= 21.2618 )
								ret := -0.909091 // sell
							if( k > 21.2618 )
								ret := -0.304762
						if( d_k > -2.41009 )
							if( d <= 57.6802 )
								ret := -0.865766 // sell
							if( d > 57.6802 )
								ret := -0.222222
				if( rsi1 > 47.4349 )
					if( rsi1 <= 60.8955 )
						if( bearPower <= 0.621037 )
							if( rsi1 <= 51.5235 )
								ret := -0.307399
							if( rsi1 > 51.5235 )
								ret := -0.098422
						if( bearPower > 0.621037 )
							if( bearPower <= 1.16611 )
								ret := -0.474315
							if( bearPower > 1.16611 )
								ret := -0.711304 // sell
					if( rsi1 > 60.8955 )
						if( bearPower <= 2.3056 )
							if( bbp <= 1.246 )
								ret := 0.281319
							if( bbp > 1.246 )
								ret := 0.070088
						if( bearPower > 2.3056 )
							if( d_k <= 16.6938 )
								ret := -0.545455
							if( d_k > 16.6938 )
								ret := -0.050000
	if( smoothK_k > 34.2544 )
		if( smoothK_k <= 76.3702 )
			if( rsi1 <= 45.4725 )
				if( BBPower_Color <= 0.5 )
					if( bbp <= -1.3277 )
						if( smoothD_d <= 21.2826 )
							if( bullPower <= 0.44277 )
								ret := -0.575000
							if( bullPower > 0.44277 )
								ret := 1.000000 // buy
						if( smoothD_d > 21.2826 )
							if( bearPower <= -13.2391 )
								ret := 0.736264 // buy
							if( bearPower > -13.2391 )
								ret := 0.110608
					if( bbp > -1.3277 )
						if( bbm <= 0.942405 )
							if( bullPower <= 0.333703 )
								ret := -0.127425
							if( bullPower > 0.333703 )
								ret := -0.600000
						if( bbm > 0.942405 )
							if( smoothK_k <= 36.1866 )
								ret := 0.057554
							if( smoothK_k > 36.1866 )
								ret := -0.386103
				if( BBPower_Color > 0.5 )
					if( d_k <= -11.0251 )
						if( smoothD_d <= 22.3595 )
							if( d_k <= -14.6015 )
								ret := 0.300000
							if( d_k > -14.6015 )
								ret := -0.875000 // sell
						if( smoothD_d > 22.3595 )
							if( smoothK_k <= 67.4629 )
								ret := 0.201389
							if( smoothK_k > 67.4629 )
								ret := -0.325000
					if( d_k > -11.0251 )
						if( bbp <= 0.902784 )
							if( k <= 43.0937 )
								ret := -0.455814
							if( k > 43.0937 )
								ret := -0.207039
						if( bbp > 0.902784 )
							if( k <= 60.325 )
								ret := -0.801325 // sell
							if( k > 60.325 )
								ret := -0.635659
			if( rsi1 > 45.4725 )
				if( BBPower_Color <= 0.5 )
					if( bbp <= -1.7178 )
						if( bullPower <= -0.301053 )
							if( bearPower <= -3.06973 )
								ret := 0.801802 // buy
							if( bearPower > -3.06973 )
								ret := 0.585573
						if( bullPower > -0.301053 )
							if( rsi1 <= 53.0475 )
								ret := 0.332579
							if( rsi1 > 53.0475 )
								ret := 0.617162
					if( bbp > -1.7178 )
						if( rsi1 <= 55.6011 )
							if( bearPower <= -0.238367 )
								ret := 0.158160
							if( bearPower > -0.238367 )
								ret := -0.163539
						if( rsi1 > 55.6011 )
							if( rsi1 <= 64.0014 )
								ret := 0.403122
							if( rsi1 > 64.0014 )
								ret := 0.820189 // buy
				if( BBPower_Color > 0.5 )
					if( d <= 73.1156 )
						if( bearPower <= 0.221334 )
							if( smoothD_d <= 35.4497 )
								ret := 0.127432
							if( smoothD_d > 35.4497 )
								ret := 0.016672
						if( bearPower > 0.221334 )
							if( d_k <= 20.1285 )
								ret := -0.169926
							if( d_k > 20.1285 )
								ret := 0.290476
					if( d > 73.1156 )
						if( rsi1 <= 61.2532 )
							if( bbp <= 4.88344 )
								ret := 0.015679
							if( bbp > 4.88344 )
								ret := -0.580952
						if( rsi1 > 61.2532 )
							if( smoothD_d <= 78.8409 )
								ret := 0.201258
							if( smoothD_d > 78.8409 )
								ret := 0.390909
		if( smoothK_k > 76.3702 )
			if( rsi1 <= 68.1884 )
				if( bullPower <= -0.091748 )
					if( rsi1 <= 44.4659 )
						if( bearPower <= -5.33207 )
							if( rsi1 <= 34.6081 )
								ret := 0.099237
							if( rsi1 > 34.6081 )
								ret := 0.684543
						if( bearPower > -5.33207 )
							if( rsi1 <= 35.4704 )
								ret := -0.037143
							if( rsi1 > 35.4704 )
								ret := 0.264271
					if( rsi1 > 44.4659 )
						if( bbm <= 0.500393 )
							if( rsi1 <= 50.0771 )
								ret := 0.065934
							if( rsi1 > 50.0771 )
								ret := 0.483516
						if( bbm > 0.500393 )
							if( rsi1 <= 54.217 )
								ret := 0.626816
							if( rsi1 > 54.217 )
								ret := 0.828642 // buy
				if( bullPower > -0.091748 )
					if( rsi1 <= 53.6114 )
						if( smoothD_d <= 76.9765 )
							if( bbm <= 6.08564 )
								ret := -0.175613
							if( bbm > 6.08564 )
								ret := 0.923077 // buy
						if( smoothD_d > 76.9765 )
							if( rsi1 <= 46.5312 )
								ret := -0.088038
							if( rsi1 > 46.5312 )
								ret := 0.090421
					if( rsi1 > 53.6114 )
						if( BBPower_Color <= 0.5 )
							if( smoothD_d <= 51.3574 )
								ret := -0.606061
							if( smoothD_d > 51.3574 )
								ret := 0.486486
						if( BBPower_Color > 0.5 )
							if( d <= 83.73 )
								ret := -0.001812
							if( d > 83.73 )
								ret := 0.116271
			if( rsi1 > 68.1884 )
				if( BBPower_Color <= 0.5 )
					if( k <= 87.5835 )
						if( rsi1 <= 71.4399 )
							if( smoothK_k <= 82.5327 )
								ret := 0.714286 // buy
							if( smoothK_k > 82.5327 )
								ret := -0.166667
						if( rsi1 > 71.4399 )
							if( bbm <= 0.417845 )
								ret := 0.470588
							if( bbm > 0.417845 )
								ret := 0.968750 // buy
					if( k > 87.5835 )
						if( rsi1 <= 75.0111 )
							if( bearPower <= -0.6526 )
								ret := 0.926667 // buy
							if( bearPower > -0.6526 )
								ret := 0.755162 // buy
						if( rsi1 > 75.0111 )
							if( smoothD_d <= 96.3306 )
								ret := 0.938575 // buy
							if( smoothD_d > 96.3306 )
								ret := 0.991525 // buy
				if( BBPower_Color > 0.5 )
					if( d <= 95.267 )
						if( bearPower <= 0.135292 )
							if( bbm <= 0.900453 )
								ret := 0.426813
							if( bbm > 0.900453 )
								ret := 0.649765
						if( bearPower > 0.135292 )
							if( rsi1 <= 73.9549 )
								ret := 0.121491
							if( rsi1 > 73.9549 )
								ret := 0.361921
					if( d > 95.267 )
						if( bearPower <= 0.430854 )
							if( bbm <= 0.301008 )
								ret := 0.333333
							if( bbm > 0.301008 )
								ret := 0.660314
						if( bearPower > 0.430854 )
							if( smoothK_k <= 88.2281 )
								ret := 0.760331 // buy
							if( smoothK_k > 88.2281 )
								ret := 0.275422
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_BNBUSDT_15Min_b89a94a2(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


