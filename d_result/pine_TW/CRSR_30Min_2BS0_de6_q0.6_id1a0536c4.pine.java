//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: CRSR_30Min_2BS0_1a0536c4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_30Min_2BS0_1a0536c4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_30Min_1a0536c4(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.010545 )
		if( bbp <= -0.758769 )
			if( smoothK_k <= -0.813255 )
				if( d_k <= 14.4937 )
					if( rsi1 <= 20.8039 )
						if( d <= 11.2208 )
							ret := -0.409836
						if( d > 11.2208 )
							ret := 0.823529 // buy
					if( rsi1 > 20.8039 )
						if( d_k <= 6.75212 )
							ret := 0.547771
						if( d_k > 6.75212 )
							ret := -0.437500
				if( d_k > 14.4937 )
					if( rsi1 <= 44.0708 )
						if( bbp <= -1.82009 )
							ret := 0.333333
						if( bbp > -1.82009 )
							ret := -0.948718 // sell
					if( rsi1 > 44.0708 )
						ret := 1.000000 // buy
			if( smoothK_k > -0.813255 )
				if( d <= 1.91121 )
					if( smoothK_k <= -0.68388 )
						ret := 1.000000 // buy
					if( smoothK_k > -0.68388 )
						if( rsi1 <= 20.4921 )
							ret := 0.000000
						if( rsi1 > 20.4921 )
							ret := -0.777778 // sell
				if( d > 1.91121 )
					if( bearPower <= -1.11562 )
						if( smoothD_d <= 11.804 )
							ret := 0.400000
						if( smoothD_d > 11.804 )
							ret := 0.021645
					if( bearPower > -1.11562 )
						if( bullPower <= -0.524813 )
							ret := 0.750000 // buy
						if( bullPower > -0.524813 )
							ret := 0.335556
		if( bbp > -0.758769 )
			if( bbm <= 0.034969 )
				if( bullPower <= -0.083457 )
					if( smoothD_d <= 82.6864 )
						if( d <= 66.4223 )
							ret := 0.317492
						if( d > 66.4223 )
							ret := 0.681081
					if( smoothD_d > 82.6864 )
						if( rsi1 <= 31.4389 )
							ret := -1.000000 // sell
						if( rsi1 > 31.4389 )
							ret := 0.028986
				if( bullPower > -0.083457 )
					if( rsi1 <= 51.0908 )
						if( d_k <= -6.37139 )
							ret := -0.151203
						if( d_k > -6.37139 )
							ret := 0.082616
					if( rsi1 > 51.0908 )
						if( smoothK_k <= 84.6574 )
							ret := 0.370629
						if( smoothK_k > 84.6574 )
							ret := -0.111111
			if( bbm > 0.034969 )
				if( d <= 10.9718 )
					if( smoothK_k <= 1.53543 )
						if( rsi1 <= 38.1427 )
							ret := 0.060811
						if( rsi1 > 38.1427 )
							ret := -0.334928
					if( smoothK_k > 1.53543 )
						if( bbp <= -0.121522 )
							ret := -0.214173
						if( bbp > -0.121522 )
							ret := -0.567010
				if( d > 10.9718 )
					if( bearPower <= -0.318016 )
						if( smoothD_d <= 10.1046 )
							ret := 0.515152
						if( smoothD_d > 10.1046 )
							ret := -0.055304
					if( bearPower > -0.318016 )
						if( bbp <= -0.243306 )
							ret := 0.205660
						if( bbp > -0.243306 )
							ret := 0.052941
	if( bullPower > 0.010545 )
		if( smoothK_k <= 24.5825 )
			if( d <= 36.1706 )
				if( bbm <= 0.138588 )
					if( bullPower <= 0.20742 )
						if( d <= 11.1015 )
							ret := -0.185294
						if( d > 11.1015 )
							ret := 0.026403
					if( bullPower > 0.20742 )
						if( smoothK_k <= 15.8712 )
							ret := -0.196078
						if( smoothK_k > 15.8712 )
							ret := -0.906250 // sell
				if( bbm > 0.138588 )
					if( bullPower <= 1.47332 )
						if( bullPower <= 0.373915 )
							ret := 0.097705
						if( bullPower > 0.373915 )
							ret := 0.382550
					if( bullPower > 1.47332 )
						if( bbm <= 2.65259 )
							ret := -1.000000 // sell
						if( bbm > 2.65259 )
							ret := 1.000000 // buy
			if( d > 36.1706 )
				if( bearPower <= 0.048377 )
					if( bullPower <= 0.036612 )
						if( k <= 18.304 )
							ret := 0.600000
						if( k > 18.304 )
							ret := -0.125000
					if( bullPower > 0.036612 )
						if( bbp <= 0.241783 )
							ret := 0.666667
						if( bbp > 0.241783 )
							ret := -0.333333
				if( bearPower > 0.048377 )
					if( d <= 46.0749 )
						if( smoothK_k <= 21.121 )
							ret := 0.702703 // buy
						if( smoothK_k > 21.121 )
							ret := -0.411765
					if( d > 46.0749 )
						if( bbm <= 0.016944 )
							ret := -0.375000
						if( bbm > 0.016944 )
							ret := -1.000000 // sell
		if( smoothK_k > 24.5825 )
			if( bbm <= 0.02165 )
				if( bullPower <= 0.128224 )
					if( k <= 88.36 )
						if( k <= 31.1426 )
							ret := -0.714286 // sell
						if( k > 31.1426 )
							ret := -0.084337
					if( k > 88.36 )
						if( bbp <= 0.241403 )
							ret := -0.537688
						if( bbp > 0.241403 )
							ret := 0.380952
				if( bullPower > 0.128224 )
					if( d <= 57.9528 )
						if( d_k <= -5.6113 )
							ret := -0.783217 // sell
						if( d_k > -5.6113 )
							ret := -0.528736
					if( d > 57.9528 )
						if( smoothK_k <= 88.8416 )
							ret := -0.250871
						if( smoothK_k > 88.8416 )
							ret := -0.619289
			if( bbm > 0.02165 )
				if( rsi1 <= 46.1723 )
					if( d <= 23.7182 )
						if( k <= 29.3222 )
							ret := -0.323529
						if( k > 29.3222 )
							ret := 0.647059
					if( d > 23.7182 )
						if( d <= 90.7002 )
							ret := 0.014113
						if( d > 90.7002 )
							ret := 0.481928
				if( rsi1 > 46.1723 )
					if( smoothD_d <= 35.8023 )
						if( bbp <= 0.273599 )
							ret := -0.143969
						if( bbp > 0.273599 )
							ret := -0.331579
					if( smoothD_d > 35.8023 )
						if( d_k <= 14.1276 )
							ret := -0.089246
						if( d_k > 14.1276 )
							ret := 0.184676
	
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
float op_operation = decision_tree_0_CRSR_30Min_1a0536c4(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


