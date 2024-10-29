//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: DOGEUSDT_1Hour_2BS0_19531c0d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_1Hour_2BS0_19531c0d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_1Hour_19531c0d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 47.5027 )
		if( d_k <= -1.84198 )
			if( bullPower <= -0.000173 )
				if( bullPower <= -0.00158 )
					if( rsi1 <= 31.0558 )
						if( k <= 22.2584 )
							ret := 0.379157
						if( k > 22.2584 )
							ret := -0.062500
					if( rsi1 > 31.0558 )
						if( d_k <= -3.502 )
							ret := 0.713424 // buy
						if( d_k > -3.502 )
							ret := 0.256757
				if( bullPower > -0.00158 )
					if( rsi1 <= 36.9052 )
						if( d <= 53.227 )
							ret := 0.031714
						if( d > 53.227 )
							ret := -0.438596
					if( rsi1 > 36.9052 )
						if( rsi1 <= 45.9291 )
							ret := 0.418699
						if( rsi1 > 45.9291 )
							ret := 0.675000
			if( bullPower > -0.000173 )
				if( bullPower <= 0.001396 )
					if( rsi1 <= 40.2962 )
						if( bbm <= 7.6e-05 )
							ret := -0.043357
						if( bbm > 7.6e-05 )
							ret := -0.295045
					if( rsi1 > 40.2962 )
						if( bbp <= -0.000149 )
							ret := 0.145201
						if( bbp > -0.000149 )
							ret := -0.098010
				if( bullPower > 0.001396 )
					if( rsi1 <= 42.7145 )
						if( d_k <= -13.3389 )
							ret := -0.373333
						if( d_k > -13.3389 )
							ret := -0.819936 // sell
					if( rsi1 > 42.7145 )
						if( bearPower <= -0.003221 )
							ret := 0.102041
						if( bearPower > -0.003221 )
							ret := -0.500000
		if( d_k > -1.84198 )
			if( bbm <= 0.0004 )
				if( bullPower <= 9.2e-05 )
					if( rsi1 <= 9.81162 )
						if( bbm <= 6.6e-05 )
							ret := 0.545455
						if( bbm > 6.6e-05 )
							ret := 1.000000 // buy
					if( rsi1 > 9.81162 )
						if( rsi1 <= 36.297 )
							ret := -0.052288
						if( rsi1 > 36.297 )
							ret := 0.085095
				if( bullPower > 9.2e-05 )
					if( rsi1 <= 42.5313 )
						if( d <= 73.2523 )
							ret := -0.331461
						if( d > 73.2523 )
							ret := -0.767442 // sell
					if( rsi1 > 42.5313 )
						if( smoothD_d <= 48.3329 )
							ret := 0.121212
						if( smoothD_d > 48.3329 )
							ret := -0.288660
			if( bbm > 0.0004 )
				if( bbp <= -1.6e-05 )
					if( rsi1 <= 35.1201 )
						if( bullPower <= 0.000122 )
							ret := -0.376486
						if( bullPower > 0.000122 )
							ret := -0.630784
					if( rsi1 > 35.1201 )
						if( bullPower <= 0.00015 )
							ret := -0.051640
						if( bullPower > 0.00015 )
							ret := -0.307655
				if( bbp > -1.6e-05 )
					if( rsi1 <= 39.2943 )
						if( smoothD_d <= -0.29172 )
							ret := -0.222222
						if( smoothD_d > -0.29172 )
							ret := -0.784636 // sell
					if( rsi1 > 39.2943 )
						if( d_k <= 3.48099 )
							ret := -0.298677
						if( d_k > 3.48099 )
							ret := -0.553846
	if( rsi1 > 47.5027 )
		if( BBPower_Color <= 0.5 )
			if( rsi1 <= 62.0611 )
				if( bbp <= -0.00042 )
					if( rsi1 <= 50.6507 )
						if( d_k <= 6.9791 )
							ret := 0.385597
						if( d_k > 6.9791 )
							ret := -0.015198
					if( rsi1 > 50.6507 )
						if( bullPower <= -0.000473 )
							ret := 0.767908 // buy
						if( bullPower > -0.000473 )
							ret := 0.452962
				if( bbp > -0.00042 )
					if( smoothK_k <= 92.6171 )
						if( rsi1 <= 56.3972 )
							ret := 0.022139
						if( rsi1 > 56.3972 )
							ret := 0.302376
					if( smoothK_k > 92.6171 )
						if( k <= 99.9993 )
							ret := 0.533333
						if( k > 99.9993 )
							ret := 0.121212
			if( rsi1 > 62.0611 )
				if( bbm <= 6.4e-05 )
					if( d_k <= -11.8015 )
						ret := -0.461538
					if( d_k > -11.8015 )
						if( bullPower <= 1.5e-05 )
							ret := -0.100000
						if( bullPower > 1.5e-05 )
							ret := 0.545455
				if( bbm > 6.4e-05 )
					if( d_k <= -11.9088 )
						if( bbm <= 0.000515 )
							ret := 0.666667
						if( bbm > 0.000515 )
							ret := 0.932817 // buy
					if( d_k > -11.9088 )
						if( k <= 92.7748 )
							ret := 0.724138 // buy
						if( k > 92.7748 )
							ret := 0.517073
		if( BBPower_Color > 0.5 )
			if( d_k <= 1.5851 )
				if( rsi1 <= 63.8681 )
					if( bullPower <= 0.003025 )
						if( rsi1 <= 57.7802 )
							ret := -0.124044
						if( rsi1 > 57.7802 )
							ret := 0.075312
					if( bullPower > 0.003025 )
						if( k <= 99.7263 )
							ret := -0.320388
						if( k > 99.7263 )
							ret := 0.326087
				if( rsi1 > 63.8681 )
					if( bullPower <= 0.00023 )
						if( rsi1 <= 87.6572 )
							ret := 0.030362
						if( rsi1 > 87.6572 )
							ret := -0.600000
					if( bullPower > 0.00023 )
						if( bearPower <= -2.2e-05 )
							ret := 0.624427
						if( bearPower > -2.2e-05 )
							ret := 0.349488
			if( d_k > 1.5851 )
				if( rsi1 <= 63.4716 )
					if( bbp <= 0.00144 )
						if( rsi1 <= 54.008 )
							ret := -0.185738
						if( rsi1 > 54.008 )
							ret := 0.013123
					if( bbp > 0.00144 )
						if( bearPower <= -0.000322 )
							ret := -0.151807
						if( bearPower > -0.000322 )
							ret := -0.511302
				if( rsi1 > 63.4716 )
					if( bbp <= 0.003363 )
						if( k <= 90.0315 )
							ret := 0.205714
						if( k > 90.0315 )
							ret := -0.112583
					if( bbp > 0.003363 )
						if( rsi1 <= 71.3351 )
							ret := -0.287367
						if( rsi1 > 71.3351 )
							ret := 0.047672
	
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
float op_operation = decision_tree_0_DOGEUSDT_1Hour_19531c0d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


