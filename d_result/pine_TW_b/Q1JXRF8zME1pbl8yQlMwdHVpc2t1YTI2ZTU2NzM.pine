//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: CRWD_30Min_2BS0_a26e5673 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_30Min_2BS0_a26e5673", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_30Min_a26e5673(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( smoothK_k <= -1.66724 )
		if( rsi1 <= 18.7377 )
			if( d_k <= -0.001671 )
				if( rsi1 <= 13.3719 )
					if( bullPower <= -1.57764 )
						if( bullPower <= -4.01132 )
							ret := 0.888889 // buy
						if( bullPower > -4.01132 )
							ret := 0.375000
					if( bullPower > -1.57764 )
						if( bullPower <= -1.14959 )
							ret := 1.000000 // buy
						if( bullPower > -1.14959 )
							ret := 0.888889 // buy
				if( rsi1 > 13.3719 )
					if( bbm <= 1.05995 )
						ret := -0.866667 // sell
					if( bbm > 1.05995 )
						ret := 0.562500
			if( d_k > -0.001671 )
				if( bbm <= 6.24865 )
					if( bearPower <= -2.28974 )
						if( bearPower <= -3.11254 )
							ret := -0.030769
						if( bearPower > -3.11254 )
							ret := -0.605769
					if( bearPower > -2.28974 )
						if( rsi1 <= 15.6101 )
							ret := 0.616667
						if( rsi1 > 15.6101 )
							ret := -0.142857
				if( bbm > 6.24865 )
					ret := 0.937500 // buy
		if( rsi1 > 18.7377 )
			if( bbp <= -0.225218 )
				if( bullPower <= -0.760594 )
					if( bullPower <= -7.84059 )
						ret := -0.909091 // sell
					if( bullPower > -7.84059 )
						if( rsi1 <= 24.436 )
							ret := 0.380952
						if( rsi1 > 24.436 )
							ret := 0.092885
				if( bullPower > -0.760594 )
					if( d_k <= 0.558424 )
						if( bearPower <= -2.41049 )
							ret := 0.000000
						if( bearPower > -2.41049 )
							ret := 0.743590 // buy
					if( d_k > 0.558424 )
						if( d_k <= 3.80778 )
							ret := 0.166667
						if( d_k > 3.80778 )
							ret := 0.451178
			if( bbp > -0.225218 )
				if( rsi1 <= 36.7564 )
					if( d <= 2.33427 )
						if( rsi1 <= 33.567 )
							ret := 0.083333
						if( rsi1 > 33.567 )
							ret := -0.964286 // sell
					if( d > 2.33427 )
						if( d <= 14.6125 )
							ret := 0.333333
						if( d > 14.6125 )
							ret := -0.833333 // sell
				if( rsi1 > 36.7564 )
					if( bullPower <= 0.308401 )
						if( rsi1 <= 52.0147 )
							ret := 0.800000 // buy
						if( rsi1 > 52.0147 )
							ret := 0.000000
					if( bullPower > 0.308401 )
						if( rsi1 <= 47.7821 )
							ret := 0.358491
						if( rsi1 > 47.7821 )
							ret := -0.151685
	if( smoothK_k > -1.66724 )
		if( bullPower <= 0.468195 )
			if( smoothK_k <= 90.4701 )
				if( rsi1 <= 56.2163 )
					if( bbm <= 13.8898 )
						if( bbp <= 0.28376 )
							ret := 0.039209
						if( bbp > 0.28376 )
							ret := -0.130631
					if( bbm > 13.8898 )
						ret := 1.000000 // buy
				if( rsi1 > 56.2163 )
					if( bearPower <= 0.143895 )
						if( d_k <= -21.4412 )
							ret := 0.573770
						if( d_k > -21.4412 )
							ret := 0.172956
					if( bearPower > 0.143895 )
						if( bearPower <= 0.198887 )
							ret := -0.290323
						if( bearPower > 0.198887 )
							ret := 0.102719
			if( smoothK_k > 90.4701 )
				if( d_k <= -6.33732 )
					if( rsi1 <= 65.4492 )
						if( bbm <= 1.66036 )
							ret := 0.002801
						if( bbm > 1.66036 )
							ret := -0.685714
					if( rsi1 > 65.4492 )
						if( d <= 78.6308 )
							ret := -0.733333 // sell
						if( d > 78.6308 )
							ret := 0.685185
				if( d_k > -6.33732 )
					if( k <= 93.8729 )
						if( rsi1 <= 48.7694 )
							ret := -0.933333 // sell
						if( rsi1 > 48.7694 )
							ret := -0.400000
					if( k > 93.8729 )
						if( smoothK_k <= 91.5484 )
							ret := 0.171429
						if( smoothK_k > 91.5484 )
							ret := -0.296849
		if( bullPower > 0.468195 )
			if( d_k <= 11.0993 )
				if( rsi1 <= 56.4649 )
					if( smoothD_d <= 91.0896 )
						if( bbp <= 6.60638 )
							ret := -0.142689
						if( bbp > 6.60638 )
							ret := 0.415094
					if( smoothD_d > 91.0896 )
						if( smoothK_k <= 87.9164 )
							ret := 0.844444 // buy
						if( smoothK_k > 87.9164 )
							ret := 0.082474
				if( rsi1 > 56.4649 )
					if( bbm <= 5.92439 )
						if( d <= 99.7509 )
							ret := -0.002707
						if( d > 99.7509 )
							ret := -0.279883
					if( bbm > 5.92439 )
						if( d_k <= -2.67591 )
							ret := -0.615819
						if( d_k > -2.67591 )
							ret := 0.064516
			if( d_k > 11.0993 )
				if( d_k <= 27.1657 )
					if( bbm <= 0.7625 )
						if( rsi1 <= 46.4013 )
							ret := 0.414634
						if( rsi1 > 46.4013 )
							ret := -0.080725
					if( bbm > 0.7625 )
						if( bbm <= 5.41087 )
							ret := 0.219736
						if( bbm > 5.41087 )
							ret := -0.153846
				if( d_k > 27.1657 )
					if( bbm <= 1.33 )
						if( bullPower <= 0.559518 )
							ret := 0.444444
						if( bullPower > 0.559518 )
							ret := -0.145455
					if( bbm > 1.33 )
						if( k <= 33.3659 )
							ret := -0.779661 // sell
						if( k > 33.3659 )
							ret := -0.090909
	
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
float op_operation = decision_tree_0_CRWD_30Min_a26e5673(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


