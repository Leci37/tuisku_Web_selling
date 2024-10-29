//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: PTON_5Min_2BS0_4af75fbb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_5Min_2BS0_4af75fbb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_5Min_4af75fbb(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= -0.000487 )
		if( bbm <= 0.014988 )
			if( bullPower <= -0.014818 )
				if( d_k <= 8.23639 )
					if( bbm <= 0.0086 )
						if( d_k <= -4.6104 )
							ret := 0.030418
						if( d_k > -4.6104 )
							ret := 0.377888
					if( bbm > 0.0086 )
						if( d <= 2.81128 )
							ret := 0.430657
						if( d > 2.81128 )
							ret := 0.062849
				if( d_k > 8.23639 )
					if( bearPower <= -0.021172 )
						if( bbm <= 0.007902 )
							ret := 0.625000
						if( bbm > 0.007902 )
							ret := 0.421927
					if( bearPower > -0.021172 )
						if( d_k <= 9.66857 )
							ret := 0.741935 // buy
						if( d_k > 9.66857 )
							ret := 0.230769
			if( bullPower > -0.014818 )
				if( rsi1 <= 46.7296 )
					if( rsi1 <= 45.1643 )
						if( bbm <= 0.010112 )
							ret := 0.069458
						if( bbm > 0.010112 )
							ret := 0.272021
					if( rsi1 > 45.1643 )
						if( smoothK_k <= 58.1943 )
							ret := -0.253289
						if( smoothK_k > 58.1943 )
							ret := 0.185185
				if( rsi1 > 46.7296 )
					if( d_k <= 14.6424 )
						if( d_k <= 10.914 )
							ret := 0.214205
						if( d_k > 10.914 )
							ret := -0.099379
					if( d_k > 14.6424 )
						if( rsi1 <= 55.5617 )
							ret := 0.544186
						if( rsi1 > 55.5617 )
							ret := -0.269231
		if( bbm > 0.014988 )
			if( bbm <= 0.05996 )
				if( rsi1 <= 29.413 )
					if( smoothK_k <= 4.77979 )
						if( smoothK_k <= 0.500961 )
							ret := 0.124525
						if( smoothK_k > 0.500961 )
							ret := -0.128162
					if( smoothK_k > 4.77979 )
						if( d <= 6.59155 )
							ret := 0.580311
						if( d > 6.59155 )
							ret := 0.165979
				if( rsi1 > 29.413 )
					if( smoothK_k <= 18.7256 )
						if( bbm <= 0.04995 )
							ret := -0.044272
						if( bbm > 0.04995 )
							ret := -0.348765
					if( smoothK_k > 18.7256 )
						if( k <= 73.3102 )
							ret := 0.137101
						if( k > 73.3102 )
							ret := -0.080629
			if( bbm > 0.05996 )
				if( d <= 3.28989 )
					if( d_k <= 1.60007 )
						if( bearPower <= -0.108798 )
							ret := -0.061321
						if( bearPower > -0.108798 )
							ret := 0.600000
					if( d_k > 1.60007 )
						if( bearPower <= -0.262436 )
							ret := 0.222222
						if( bearPower > -0.262436 )
							ret := 0.847826 // buy
				if( d > 3.28989 )
					if( rsi1 <= 14.9113 )
						if( smoothD_d <= 25.7971 )
							ret := -0.740385 // sell
						if( smoothD_d > 25.7971 )
							ret := 0.100000
					if( rsi1 > 14.9113 )
						if( rsi1 <= 31.4186 )
							ret := 0.065421
						if( rsi1 > 31.4186 )
							ret := -0.248996
	if( bullPower > -0.000487 )
		if( bbm <= 0.009159 )
			if( bullPower <= 0.036932 )
				if( bullPower <= 0.012145 )
					if( smoothD_d <= 73.3489 )
						if( bullPower <= 0.000898 )
							ret := 0.141818
						if( bullPower > 0.000898 )
							ret := -0.125650
					if( smoothD_d > 73.3489 )
						if( bullPower <= 0.001172 )
							ret := 0.403226
						if( bullPower > 0.001172 )
							ret := 0.088319
				if( bullPower > 0.012145 )
					if( k <= 56.3661 )
						if( bbm <= 0.000318 )
							ret := -0.276206
						if( bbm > 0.000318 )
							ret := -0.637931
					if( k > 56.3661 )
						if( bullPower <= 0.03014 )
							ret := -0.168822
						if( bullPower > 0.03014 )
							ret := 0.012605
			if( bullPower > 0.036932 )
				if( bullPower <= 0.061858 )
					if( bbm <= 0.000925 )
						if( d_k <= -4.01077 )
							ret := -0.477124
						if( d_k > -4.01077 )
							ret := -0.155689
					if( bbm > 0.000925 )
						if( d_k <= -21.4671 )
							ret := -0.083333
						if( d_k > -21.4671 )
							ret := -0.779874 // sell
				if( bullPower > 0.061858 )
					if( smoothD_d <= 64.181 )
						if( bullPower <= 0.067073 )
							ret := -0.863636 // sell
						if( bullPower > 0.067073 )
							ret := -1.000000 // sell
					if( smoothD_d > 64.181 )
						if( smoothD_d <= 73.8197 )
							ret := -0.310345
						if( smoothD_d > 73.8197 )
							ret := -0.847059 // sell
		if( bbm > 0.009159 )
			if( rsi1 <= 89.4455 )
				if( d_k <= -22.1052 )
					if( d_k <= -25.5094 )
						if( bullPower <= 0.077571 )
							ret := 0.069948
						if( bullPower > 0.077571 )
							ret := -0.248062
					if( d_k > -25.5094 )
						if( rsi1 <= 65.0285 )
							ret := -0.426850
						if( rsi1 > 65.0285 )
							ret := -0.040724
				if( d_k > -22.1052 )
					if( rsi1 <= 53.2377 )
						if( bullPower <= 0.012233 )
							ret := -0.035248
						if( bullPower > 0.012233 )
							ret := 0.054002
					if( rsi1 > 53.2377 )
						if( d_k <= 0.000403 )
							ret := -0.088909
						if( d_k > 0.000403 )
							ret := 0.011739
			if( rsi1 > 89.4455 )
				if( bbp <= 0.057852 )
					if( rsi1 <= 90.0351 )
						ret := -0.600000
					if( rsi1 > 90.0351 )
						if( bbm <= 0.015624 )
							ret := -0.090909
						if( bbm > 0.015624 )
							ret := 0.571429
				if( bbp > 0.057852 )
					if( bullPower <= 0.065903 )
						if( bearPower <= 0.023341 )
							ret := -0.307692
						if( bearPower > 0.023341 )
							ret := -0.865854 // sell
					if( bullPower > 0.065903 )
						if( rsi1 <= 91.8995 )
							ret := -0.246032
						if( rsi1 > 91.8995 )
							ret := -0.640845
	
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
float op_operation = decision_tree_0_PTON_5Min_4af75fbb(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


