//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: ADAUSDT_15Min_2BS0_81943a24 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_2BS0_81943a24", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_81943a24(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 38.4024 )
		if( rsi1 <= 48.647 )
			if( bbp <= 8.4e-05 )
				if( rsi1 <= 32.9251 )
					if( bbp <= -0.006719 )
						if( d_k <= -2.51947 )
							if( smoothD_d <= 12.0335 )
								ret := -0.420550
							if( smoothD_d > 12.0335 )
								ret := -0.123047
						if( d_k > -2.51947 )
							if( bullPower <= -0.003918 )
								ret := 0.181339
							if( bullPower > -0.003918 )
								ret := -0.128166
					if( bbp > -0.006719 )
						if( rsi1 <= 24.5744 )
							if( bbm <= 0.001004 )
								ret := -0.365506
							if( bbm > 0.001004 )
								ret := -0.640050
						if( rsi1 > 24.5744 )
							if( bullPower <= 0.000157 )
								ret := -0.249697
							if( bullPower > 0.000157 )
								ret := -0.610195
				if( rsi1 > 32.9251 )
					if( bullPower <= -6.7e-05 )
						if( bbp <= -0.004408 )
							if( d_k <= -10.1193 )
								ret := -0.076923
							if( d_k > -10.1193 )
								ret := 0.240857
						if( bbp > -0.004408 )
							if( rsi1 <= 42.3994 )
								ret := -0.051799
							if( rsi1 > 42.3994 )
								ret := 0.128898
					if( bullPower > -6.7e-05 )
						if( rsi1 <= 40.2559 )
							if( bbp <= -0.003045 )
								ret := -0.022472
							if( bbp > -0.003045 )
								ret := -0.327673
						if( rsi1 > 40.2559 )
							if( bbp <= -0.001713 )
								ret := 0.032193
							if( bbp > -0.001713 )
								ret := -0.103085
			if( bbp > 8.4e-05 )
				if( bbp <= 0.001471 )
					if( BBPower_Color <= 0.5 )
						if( bbm <= 0.004617 )
							if( rsi1 <= 44.5597 )
								ret := -0.857143 // sell
							if( rsi1 > 44.5597 )
								ret := -0.324675
						if( bbm > 0.004617 )
							if( rsi1 <= 40.1311 )
								ret := -0.875000 // sell
							if( rsi1 > 40.1311 )
								ret := 0.277778
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 39.1165 )
							if( bullPower <= 0.000926 )
								ret := -0.435294
							if( bullPower > 0.000926 )
								ret := -0.711297 // sell
						if( rsi1 > 39.1165 )
							if( bullPower <= 0.00069 )
								ret := -0.114441
							if( bullPower > 0.00069 )
								ret := -0.291289
				if( bbp > 0.001471 )
					if( rsi1 <= 40.6838 )
						if( bbp <= 0.00198 )
							if( rsi1 <= 38.8765 )
								ret := -0.805054 // sell
							if( rsi1 > 38.8765 )
								ret := -0.602941
						if( bbp > 0.00198 )
							if( bearPower <= 0.001094 )
								ret := -0.877119 // sell
							if( bearPower > 0.001094 )
								ret := -0.976879 // sell
					if( rsi1 > 40.6838 )
						if( smoothD_d <= 3.29845 )
							if( bbm <= 0.002105 )
								ret := -0.715026 // sell
							if( bbm > 0.002105 )
								ret := -0.858044 // sell
						if( smoothD_d > 3.29845 )
							if( bearPower <= 0.000538 )
								ret := -0.469430
							if( bearPower > 0.000538 )
								ret := -0.691358
		if( rsi1 > 48.647 )
			if( bearPower <= 6.3e-05 )
				if( bearPower <= -0.002393 )
					if( smoothK_k <= 15.3676 )
						if( d_k <= 11.6274 )
							if( smoothK_k <= -0.853807 )
								ret := 0.810345 // buy
							if( smoothK_k > -0.853807 )
								ret := 0.233607
						if( d_k > 11.6274 )
							if( d_k <= 16.5081 )
								ret := -0.586957
							if( d_k > 16.5081 )
								ret := 0.083333
					if( smoothK_k > 15.3676 )
						if( d_k <= 12.6368 )
							if( d <= 29.6234 )
								ret := 0.402135
							if( d > 29.6234 )
								ret := 0.742308 // buy
						if( d_k > 12.6368 )
							if( d <= 52.4051 )
								ret := -0.342466
							if( d > 52.4051 )
								ret := 0.524590
				if( bearPower > -0.002393 )
					if( rsi1 <= 59.1917 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 51.8321 )
								ret := 0.048436
							if( rsi1 > 51.8321 )
								ret := 0.269504
						if( BBPower_Color > 0.5 )
							if( d_k <= 2.01056 )
								ret := -0.158127
							if( d_k > 2.01056 )
								ret := 0.027190
					if( rsi1 > 59.1917 )
						if( rsi1 <= 65.8765 )
							if( bullPower <= 0.009419 )
								ret := 0.281022
							if( bullPower > 0.009419 )
								ret := -0.500000
						if( rsi1 > 65.8765 )
							if( smoothD_d <= 37.4615 )
								ret := 0.649425
							if( smoothD_d > 37.4615 )
								ret := 0.155556
			if( bearPower > 6.3e-05 )
				if( rsi1 <= 64.7533 )
					if( bbp <= 0.004552 )
						if( rsi1 <= 56.8145 )
							if( bullPower <= 0.001468 )
								ret := -0.055402
							if( bullPower > 0.001468 )
								ret := -0.341463
						if( rsi1 > 56.8145 )
							if( BBPower_Color <= 0.5 )
								ret := 0.851852 // buy
							if( BBPower_Color > 0.5 )
								ret := -0.016411
					if( bbp > 0.004552 )
						if( bbp <= 0.008058 )
							if( bbm <= 0.002384 )
								ret := -0.562814
							if( bbm > 0.002384 )
								ret := -0.201538
						if( bbp > 0.008058 )
							if( bearPower <= 0.001908 )
								ret := -0.130769
							if( bearPower > 0.001908 )
								ret := -0.637705
				if( rsi1 > 64.7533 )
					if( bearPower <= 0.002945 )
						if( rsi1 <= 67.7892 )
							if( bearPower <= 0.000516 )
								ret := 0.439024
							if( bearPower > 0.000516 )
								ret := 0.075163
						if( rsi1 > 67.7892 )
							if( smoothK_k <= 20.3253 )
								ret := 0.637209
							if( smoothK_k > 20.3253 )
								ret := 0.292763
					if( bearPower > 0.002945 )
						if( smoothD_d <= 9.00389 )
							if( bearPower <= 0.004893 )
								ret := -0.111111
							if( bearPower > 0.004893 )
								ret := -0.774194 // sell
						if( smoothD_d > 9.00389 )
							if( rsi1 <= 70.4717 )
								ret := -0.325301
							if( rsi1 > 70.4717 )
								ret := 0.383234
	if( smoothK_k > 38.4024 )
		if( rsi1 <= 61.7929 )
			if( BBPower_Color <= 0.5 )
				if( rsi1 <= 48.7936 )
					if( bullPower <= -0.001099 )
						if( rsi1 <= 35.1611 )
							if( rsi1 <= 29.694 )
								ret := -0.191104
							if( rsi1 > 29.694 )
								ret := 0.201586
						if( rsi1 > 35.1611 )
							if( bbp <= -0.00587 )
								ret := 0.620867
							if( bbp > -0.00587 )
								ret := 0.356495
					if( bullPower > -0.001099 )
						if( rsi1 <= 41.6523 )
							if( bullPower <= 7.8e-05 )
								ret := -0.078840
							if( bullPower > 7.8e-05 )
								ret := -0.298788
						if( rsi1 > 41.6523 )
							if( bbp <= -0.002455 )
								ret := 0.312057
							if( bbp > -0.002455 )
								ret := -0.012033
				if( rsi1 > 48.7936 )
					if( bbp <= -0.001761 )
						if( smoothK_k <= 83.2622 )
							if( d_k <= -25.0056 )
								ret := 0.062500
							if( d_k > -25.0056 )
								ret := 0.582240
						if( smoothK_k > 83.2622 )
							if( bbm <= 0.001501 )
								ret := 0.516529
							if( bbm > 0.001501 )
								ret := 0.776583 // buy
					if( bbp > -0.001761 )
						if( rsi1 <= 55.1746 )
							if( bbm <= 0.001716 )
								ret := 0.090849
							if( bbm > 0.001716 )
								ret := 0.259894
						if( rsi1 > 55.1746 )
							if( bbm <= 0.001102 )
								ret := 0.232376
							if( bbm > 0.001102 )
								ret := 0.527714
			if( BBPower_Color > 0.5 )
				if( bbp <= 0.002577 )
					if( rsi1 <= 53.6039 )
						if( rsi1 <= 47.9165 )
							if( bullPower <= 0.000875 )
								ret := -0.076482
							if( bullPower > 0.000875 )
								ret := -0.304788
						if( rsi1 > 47.9165 )
							if( d <= 40.236 )
								ret := 0.177914
							if( d > 40.236 )
								ret := -0.094130
					if( rsi1 > 53.6039 )
						if( rsi1 <= 59.3583 )
							if( bearPower <= -0.000466 )
								ret := 0.125140
							if( bearPower > -0.000466 )
								ret := -0.023062
						if( rsi1 > 59.3583 )
							if( bearPower <= -0.000301 )
								ret := 0.252465
							if( bearPower > -0.000301 )
								ret := 0.103929
				if( bbp > 0.002577 )
					if( d <= 86.632 )
						if( rsi1 <= 47.9295 )
							if( d_k <= -5.65526 )
								ret := -0.080000
							if( d_k > -5.65526 )
								ret := -0.793478 // sell
						if( rsi1 > 47.9295 )
							if( rsi1 <= 56.6285 )
								ret := -0.342605
							if( rsi1 > 56.6285 )
								ret := -0.182654
					if( d > 86.632 )
						if( d_k <= 1.51552 )
							if( d <= 88.3109 )
								ret := 0.170455
							if( d > 88.3109 )
								ret := -0.292585
						if( d_k > 1.51552 )
							if( bbp <= 0.011203 )
								ret := 0.155508
							if( bbp > 0.011203 )
								ret := -0.472222
		if( rsi1 > 61.7929 )
			if( BBPower_Color <= 0.5 )
				if( bbm <= 0.000902 )
					if( bullPower <= 0.000375 )
						if( bearPower <= -0.000619 )
							if( smoothK_k <= 93.5979 )
								ret := 0.474576
							if( smoothK_k > 93.5979 )
								ret := 0.750000 // buy
						if( bearPower > -0.000619 )
							if( rsi1 <= 73.6921 )
								ret := 0.255924
							if( rsi1 > 73.6921 )
								ret := 0.645833
					if( bullPower > 0.000375 )
						if( rsi1 <= 63.1235 )
							ret := 0.444444
						if( rsi1 > 63.1235 )
							if( bbm <= 0.0009 )
								ret := 1.000000 // buy
							if( bbm > 0.0009 )
								ret := 0.500000
				if( bbm > 0.000902 )
					if( rsi1 <= 69.7164 )
						if( bearPower <= -0.001959 )
							if( d_k <= 5.25638 )
								ret := 0.891408 // buy
							if( d_k > 5.25638 )
								ret := 0.390244
						if( bearPower > -0.001959 )
							if( smoothK_k <= 39.4022 )
								ret := -0.272727
							if( smoothK_k > 39.4022 )
								ret := 0.705882 // buy
					if( rsi1 > 69.7164 )
						if( bbp <= -1.5e-05 )
							if( bearPower <= -0.000859 )
								ret := 0.917485 // buy
							if( bearPower > -0.000859 )
								ret := 0.683544
						if( bbp > -1.5e-05 )
							ret := 1.000000 // buy
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 74.1797 )
					if( bbp <= 0.007907 )
						if( bearPower <= -0.000115 )
							if( smoothD_d <= 90.9294 )
								ret := 0.352337
							if( smoothD_d > 90.9294 )
								ret := 0.555205
						if( bearPower > -0.000115 )
							if( d_k <= 2.84948 )
								ret := 0.131367
							if( d_k > 2.84948 )
								ret := 0.304429
					if( bbp > 0.007907 )
						if( d_k <= 6.74591 )
							if( rsi1 <= 68.7842 )
								ret := -0.250617
							if( rsi1 > 68.7842 )
								ret := 0.051342
						if( d_k > 6.74591 )
							if( d <= 78.9536 )
								ret := -0.092166
							if( d > 78.9536 )
								ret := 0.572034
				if( rsi1 > 74.1797 )
					if( rsi1 <= 81.8223 )
						if( bearPower <= 0.001555 )
							if( bbm <= 0.000901 )
								ret := 0.264069
							if( bbm > 0.000901 )
								ret := 0.574257
						if( bearPower > 0.001555 )
							if( d_k <= 1.20781 )
								ret := 0.141930
							if( d_k > 1.20781 )
								ret := 0.394144
					if( rsi1 > 81.8223 )
						if( bearPower <= 0.003954 )
							if( rsi1 <= 83.3366 )
								ret := 0.565315
							if( rsi1 > 83.3366 )
								ret := 0.749141 // buy
						if( bearPower > 0.003954 )
							if( bullPower <= 0.034778 )
								ret := 0.427653
							if( bullPower > 0.034778 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ADAUSDT_15Min_81943a24(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


