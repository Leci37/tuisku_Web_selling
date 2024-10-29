//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: APPS_1Min_2BS0_bb538101 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_1Min_2BS0_bb538101", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_1Min_bb538101(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= -0.000898 )
		if( bullPower <= -0.011873 )
			if( bbm <= 0.004032 )
				if( d <= 0.936777 )
					if( rsi1 <= 26.525 )
						if( d <= 0.023612 )
							ret := -0.190476
						if( d > 0.023612 )
							ret := -0.783333 // sell
					if( rsi1 > 26.525 )
						if( rsi1 <= 36.2075 )
							ret := 0.272727
						if( rsi1 > 36.2075 )
							ret := 1.000000 // buy
				if( d > 0.936777 )
					if( d <= 48.6566 )
						if( k <= 42.234 )
							ret := 0.367314
						if( k > 42.234 )
							ret := -0.333333
					if( d > 48.6566 )
						if( rsi1 <= 53.9563 )
							ret := 0.605740
						if( rsi1 > 53.9563 )
							ret := -0.406250
			if( bbm > 0.004032 )
				if( d_k <= -10.1899 )
					if( smoothD_d <= 21.7987 )
						if( k <= 26.1571 )
							ret := -0.666667
						if( k > 26.1571 )
							ret := 0.720000 // buy
					if( smoothD_d > 21.7987 )
						if( rsi1 <= 43.8488 )
							ret := -0.694444
						if( rsi1 > 43.8488 )
							ret := 0.117647
				if( d_k > -10.1899 )
					if( d_k <= 25.2366 )
						if( bbm <= 0.005007 )
							ret := -0.094862
						if( bbm > 0.005007 )
							ret := 0.225608
					if( d_k > 25.2366 )
						if( bearPower <= -0.040787 )
							ret := 0.983871 // buy
						if( bearPower > -0.040787 )
							ret := 0.475000
		if( bullPower > -0.011873 )
			if( smoothD_d <= 46.599 )
				if( d_k <= 11.1143 )
					if( d <= 41.8033 )
						if( smoothD_d <= 34.0072 )
							ret := 0.022812
						if( smoothD_d > 34.0072 )
							ret := 0.226984
					if( d > 41.8033 )
						if( bbp <= -0.011446 )
							ret := -0.295585
						if( bbp > -0.011446 )
							ret := 0.004890
				if( d_k > 11.1143 )
					if( smoothD_d <= 19.266 )
						if( k <= 6.89115 )
							ret := 0.014599
						if( k > 6.89115 )
							ret := -0.538462
					if( smoothD_d > 19.266 )
						if( smoothD_d <= 41.2714 )
							ret := 0.300601
						if( smoothD_d > 41.2714 )
							ret := -0.029520
			if( smoothD_d > 46.599 )
				if( bbp <= -0.039565 )
					if( smoothD_d <= 72.6234 )
						if( smoothD_d <= 54.2356 )
							ret := -0.600000
						if( smoothD_d > 54.2356 )
							ret := -0.880952 // sell
					if( smoothD_d > 72.6234 )
						if( rsi1 <= 41.7232 )
							ret := 0.750000 // buy
						if( rsi1 > 41.7232 )
							ret := -0.076923
				if( bbp > -0.039565 )
					if( d_k <= -1.45251 )
						if( bbm <= 0.004854 )
							ret := 0.176670
						if( bbm > 0.004854 )
							ret := -0.136558
					if( d_k > -1.45251 )
						if( smoothD_d <= 90.4892 )
							ret := 0.243586
						if( smoothD_d > 90.4892 )
							ret := -0.008097
	if( bullPower > -0.000898 )
		if( bbp <= 0.006907 )
			if( k <= 75.251 )
				if( d <= 80.3223 )
					if( d_k <= -12.0761 )
						if( smoothK_k <= 30.8385 )
							ret := -0.380503
						if( smoothK_k > 30.8385 )
							ret := -0.064831
					if( d_k > -12.0761 )
						if( rsi1 <= 59.2764 )
							ret := 0.043079
						if( rsi1 > 59.2764 )
							ret := -0.150400
				if( d > 80.3223 )
					if( smoothK_k <= 63.8398 )
						if( bbm <= 0.004722 )
							ret := 0.785714 // buy
						if( bbm > 0.004722 )
							ret := -0.189189
					if( smoothK_k > 63.8398 )
						if( bbm <= 0.000375 )
							ret := 0.016667
						if( bbm > 0.000375 )
							ret := 0.579137
			if( k > 75.251 )
				if( smoothD_d <= 87.7043 )
					if( rsi1 <= 60.592 )
						if( rsi1 <= 46.4484 )
							ret := 0.021459
						if( rsi1 > 46.4484 )
							ret := -0.184178
					if( rsi1 > 60.592 )
						if( d_k <= -6.67768 )
							ret := 0.236364
						if( d_k > -6.67768 )
							ret := -0.071429
				if( smoothD_d > 87.7043 )
					if( d_k <= 4.96835 )
						if( bearPower <= -0.022953 )
							ret := 0.800000 // buy
						if( bearPower > -0.022953 )
							ret := -0.058060
					if( d_k > 4.96835 )
						if( smoothD_d <= 90.7259 )
							ret := 0.081761
						if( smoothD_d > 90.7259 )
							ret := 0.522727
		if( bbp > 0.006907 )
			if( bbm <= 0.004698 )
				if( bbp <= 0.050082 )
					if( rsi1 <= 98.9927 )
						if( k <= 7.32718 )
							ret := 0.338028
						if( k > 7.32718 )
							ret := -0.201092
					if( rsi1 > 98.9927 )
						if( d <= 98.2718 )
							ret := 0.100000
						if( d > 98.2718 )
							ret := 0.909091 // buy
				if( bbp > 0.050082 )
					if( k <= 97.5524 )
						if( bullPower <= 0.040558 )
							ret := -0.517007
						if( bullPower > 0.040558 )
							ret := -0.868421 // sell
					if( k > 97.5524 )
						if( smoothD_d <= 95.5215 )
							ret := 0.458333
						if( smoothD_d > 95.5215 )
							ret := -0.803922 // sell
			if( bbm > 0.004698 )
				if( smoothD_d <= 3.16983 )
					if( k <= 12.2203 )
						if( bullPower <= 0.011635 )
							ret := -0.168675
						if( bullPower > 0.011635 )
							ret := -0.688442
					if( k > 12.2203 )
						ret := 0.550000
				if( smoothD_d > 3.16983 )
					if( bearPower <= 0.01028 )
						if( bullPower <= 0.055792 )
							ret := -0.064611
						if( bullPower > 0.055792 )
							ret := -0.585526
					if( bearPower > 0.01028 )
						if( rsi1 <= 55.4259 )
							ret := -0.343849
						if( rsi1 > 55.4259 )
							ret := 0.053470
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_APPS_1Min_bb538101(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


