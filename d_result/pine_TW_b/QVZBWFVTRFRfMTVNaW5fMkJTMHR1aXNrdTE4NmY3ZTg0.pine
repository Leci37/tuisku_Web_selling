//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AVAXUSDT_15Min_2BS0_186f7e84 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_2BS0_186f7e84", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_186f7e84(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 44.3348 )
		if( rsi1 <= 47.5938 )
			if( bullPower <= 0.045297 )
				if( rsi1 <= 29.8691 )
					if( bullPower <= -0.092884 )
						if( smoothD_d <= 7.60831 )
							if( bullPower <= -0.140175 )
								ret := -0.216520
							if( bullPower > -0.140175 )
								ret := -0.472264
						if( smoothD_d > 7.60831 )
							if( d_k <= -9.43411 )
								ret := -0.488000
							if( d_k > -9.43411 )
								ret := 0.009725
					if( bullPower > -0.092884 )
						if( d <= 4.3243 )
							if( bbm <= 0.050214 )
								ret := -0.408971
							if( bbm > 0.050214 )
								ret := -0.688776
						if( d > 4.3243 )
							if( rsi1 <= 18.0397 )
								ret := -0.683891
							if( rsi1 > 18.0397 )
								ret := -0.334612
				if( rsi1 > 29.8691 )
					if( bullPower <= -0.034816 )
						if( rsi1 <= 34.9592 )
							if( d_k <= -0.395446 )
								ret := -0.141224
							if( d_k > -0.395446 )
								ret := 0.087230
						if( rsi1 > 34.9592 )
							if( d <= 5.38964 )
								ret := -0.156805
							if( d > 5.38964 )
								ret := 0.228769
					if( bullPower > -0.034816 )
						if( rsi1 <= 40.8717 )
							if( bullPower <= 0.013661 )
								ret := -0.154438
							if( bullPower > 0.013661 )
								ret := -0.324173
						if( rsi1 > 40.8717 )
							if( bearPower <= -0.334418 )
								ret := 0.345455
							if( bearPower > -0.334418 )
								ret := -0.013571
			if( bullPower > 0.045297 )
				if( bbp <= 0.105396 )
					if( smoothK_k <= 24.9864 )
						if( rsi1 <= 36.1691 )
							if( rsi1 <= 27.023 )
								ret := -0.887828 // sell
							if( rsi1 > 27.023 )
								ret := -0.650083
						if( rsi1 > 36.1691 )
							if( rsi1 <= 43.5849 )
								ret := -0.424159
							if( rsi1 > 43.5849 )
								ret := -0.199552
					if( smoothK_k > 24.9864 )
						if( bearPower <= -0.255541 )
							if( smoothK_k <= 27.4947 )
								ret := 0.771429 // buy
							if( smoothK_k > 27.4947 )
								ret := 0.010638
						if( bearPower > -0.255541 )
							if( rsi1 <= 36.884 )
								ret := -0.614286
							if( rsi1 > 36.884 )
								ret := -0.199761
				if( bbp > 0.105396 )
					if( d_k <= -4.24748 )
						if( k <= 30.0012 )
							if( BBPower_Color <= 0.5 )
								ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								ret := -0.610687
						if( k > 30.0012 )
							if( bbm <= 0.185251 )
								ret := 0.279070
							if( bbm > 0.185251 )
								ret := -0.432836
					if( d_k > -4.24748 )
						if( rsi1 <= 39.889 )
							if( bullPower <= 0.238479 )
								ret := -0.771639 // sell
							if( bullPower > 0.238479 )
								ret := -0.921488 // sell
						if( rsi1 > 39.889 )
							if( bbp <= 0.150645 )
								ret := -0.500000
							if( bbp > 0.150645 )
								ret := -0.714054 // sell
		if( rsi1 > 47.5938 )
			if( bearPower <= -0.00559 )
				if( rsi1 <= 54.0646 )
					if( bbp <= -0.106576 )
						if( d <= 20.9027 )
							if( k <= 27.4091 )
								ret := 0.231454
							if( k > 27.4091 )
								ret := -0.283333
						if( d > 20.9027 )
							if( smoothD_d <= 42.3444 )
								ret := 0.512953
							if( smoothD_d > 42.3444 )
								ret := 0.150943
					if( bbp > -0.106576 )
						if( bbp <= 0.186177 )
							if( smoothD_d <= -2.50388 )
								ret := 0.809524 // buy
							if( smoothD_d > -2.50388 )
								ret := 0.010188
						if( bbp > 0.186177 )
							if( d_k <= 25.5672 )
								ret := -0.414847
							if( d_k > 25.5672 )
								ret := 0.615385
				if( rsi1 > 54.0646 )
					if( bearPower <= -0.095725 )
						if( d_k <= 21.1833 )
							if( smoothD_d <= 48.7853 )
								ret := 0.520661
							if( smoothD_d > 48.7853 )
								ret := 0.016129
						if( d_k > 21.1833 )
							if( d <= 51.4667 )
								ret := -0.583333
							if( d > 51.4667 )
								ret := 0.142857
					if( bearPower > -0.095725 )
						if( bbm <= 0.050546 )
							if( d <= 61.9573 )
								ret := 0.072386
							if( d > 61.9573 )
								ret := 0.750000 // buy
						if( bbm > 0.050546 )
							if( BBPower_Color <= 0.5 )
								ret := 0.370518
							if( BBPower_Color > 0.5 )
								ret := 0.234234
			if( bearPower > -0.00559 )
				if( rsi1 <= 63.7901 )
					if( bearPower <= 0.072079 )
						if( rsi1 <= 54.9414 )
							if( bbp <= 0.108305 )
								ret := -0.086614
							if( bbp > 0.108305 )
								ret := -0.314706
						if( rsi1 > 54.9414 )
							if( rsi1 <= 59.6831 )
								ret := -0.043908
							if( rsi1 > 59.6831 )
								ret := 0.092470
					if( bearPower > 0.072079 )
						if( smoothD_d <= 66.9863 )
							if( bearPower <= 0.148845 )
								ret := -0.368771
							if( bearPower > 0.148845 )
								ret := -0.583705
						if( smoothD_d > 66.9863 )
							if( bbp <= 1.00819 )
								ret := 0.428571
							if( bbp > 1.00819 )
								ret := 1.000000 // buy
				if( rsi1 > 63.7901 )
					if( bearPower <= 0.754663 )
						if( rsi1 <= 67.6224 )
							if( bearPower <= 0.088419 )
								ret := 0.212581
							if( bearPower > 0.088419 )
								ret := -0.145604
						if( rsi1 > 67.6224 )
							if( smoothD_d <= 21.2224 )
								ret := 0.112385
							if( smoothD_d > 21.2224 )
								ret := 0.369347
					if( bearPower > 0.754663 )
						if( bearPower <= 0.826996 )
							ret := -0.333333
						if( bearPower > 0.826996 )
							if( d_k <= 12.5141 )
								ret := -0.714286 // sell
							if( d_k > 12.5141 )
								ret := -1.000000 // sell
	if( smoothK_k > 44.3348 )
		if( rsi1 <= 55.9335 )
			if( bbp <= -0.170426 )
				if( rsi1 <= 44.4917 )
					if( bullPower <= -0.154171 )
						if( rsi1 <= 27.754 )
							if( bearPower <= -0.934054 )
								ret := 0.402062
							if( bearPower > -0.934054 )
								ret := -0.217593
						if( rsi1 > 27.754 )
							if( d <= 47.4785 )
								ret := 0.088083
							if( d > 47.4785 )
								ret := 0.576000
					if( bullPower > -0.154171 )
						if( d <= 37.7301 )
							if( rsi1 <= 39.6591 )
								ret := -0.638889
							if( rsi1 > 39.6591 )
								ret := 0.013158
						if( d > 37.7301 )
							if( bullPower <= -0.052899 )
								ret := 0.171079
							if( bullPower > -0.052899 )
								ret := -0.005076
				if( rsi1 > 44.4917 )
					if( bullPower <= -0.076955 )
						if( d_k <= 10.1018 )
							if( bearPower <= -0.387964 )
								ret := 0.843750 // buy
							if( bearPower > -0.387964 )
								ret := 0.609712
						if( d_k > 10.1018 )
							if( bbp <= -0.80212 )
								ret := -0.458333
							if( bbp > -0.80212 )
								ret := 0.437500
					if( bullPower > -0.076955 )
						if( rsi1 <= 48.2137 )
							if( k <= 83.7811 )
								ret := 0.427553
							if( k > 83.7811 )
								ret := 0.162500
						if( rsi1 > 48.2137 )
							if( bullPower <= 0.159597 )
								ret := 0.535081
							if( bullPower > 0.159597 )
								ret := -0.025000
			if( bbp > -0.170426 )
				if( bbp <= 0.071717 )
					if( rsi1 <= 48.94 )
						if( rsi1 <= 37.4469 )
							if( bullPower <= 0.070356 )
								ret := -0.220238
							if( bullPower > 0.070356 )
								ret := -0.655914
						if( rsi1 > 37.4469 )
							if( bullPower <= 0.012773 )
								ret := 0.034075
							if( bullPower > 0.012773 )
								ret := -0.139398
					if( rsi1 > 48.94 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 51.1395 )
								ret := 0.103608
							if( rsi1 > 51.1395 )
								ret := 0.276643
						if( BBPower_Color > 0.5 )
							if( bbm <= 0.244258 )
								ret := -0.022680
							if( bbm > 0.244258 )
								ret := 0.225352
				if( bbp > 0.071717 )
					if( rsi1 <= 43.9923 )
						if( d_k <= -3.62157 )
							if( d <= 84.3375 )
								ret := -0.393162
							if( d > 84.3375 )
								ret := 1.000000 // buy
						if( d_k > -3.62157 )
							if( BBPower_Color <= 0.5 )
								ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								ret := -0.695187
					if( rsi1 > 43.9923 )
						if( bbp <= 0.176967 )
							if( rsi1 <= 55.0467 )
								ret := -0.177894
							if( rsi1 > 55.0467 )
								ret := 0.047847
						if( bbp > 0.176967 )
							if( smoothD_d <= 67.2939 )
								ret := -0.446384
							if( smoothD_d > 67.2939 )
								ret := -0.212571
		if( rsi1 > 55.9335 )
			if( BBPower_Color <= 0.5 )
				if( bbm <= 0.050238 )
					if( rsi1 <= 64.7233 )
						if( bbp <= 0.000282 )
							if( bearPower <= -0.043047 )
								ret := 0.364865
							if( bearPower > -0.043047 )
								ret := 0.094567
						if( bbp > 0.000282 )
							if( k <= 83.0952 )
								ret := 1.000000 // buy
							if( k > 83.0952 )
								ret := 0.714286 // buy
					if( rsi1 > 64.7233 )
						if( rsi1 <= 75.2464 )
							if( bbm <= 0.030706 )
								ret := 0.200000
							if( bbm > 0.030706 )
								ret := 0.584699
						if( rsi1 > 75.2464 )
							if( bullPower <= 0.013698 )
								ret := 0.785714 // buy
							if( bullPower > 0.013698 )
								ret := 0.961538 // buy
				if( bbm > 0.050238 )
					if( rsi1 <= 63.1078 )
						if( bbp <= -0.112959 )
							if( bullPower <= 0.179449 )
								ret := 0.765645 // buy
							if( bullPower > 0.179449 )
								ret := 0.181818
						if( bbp > -0.112959 )
							if( bbm <= 0.100692 )
								ret := 0.378812
							if( bbm > 0.100692 )
								ret := 0.582327
					if( rsi1 > 63.1078 )
						if( d_k <= 13.6512 )
							if( rsi1 <= 65.8022 )
								ret := 0.762195 // buy
							if( rsi1 > 65.8022 )
								ret := 0.892277 // buy
						if( d_k > 13.6512 )
							ret := -0.181818
			if( BBPower_Color > 0.5 )
				if( d <= 89.9388 )
					if( rsi1 <= 71.9231 )
						if( bbp <= 0.458109 )
							if( rsi1 <= 66.9324 )
								ret := 0.073252
							if( rsi1 > 66.9324 )
								ret := 0.265244
						if( bbp > 0.458109 )
							if( d_k <= 11.3888 )
								ret := -0.271863
							if( d_k > 11.3888 )
								ret := 0.221311
					if( rsi1 > 71.9231 )
						if( bearPower <= 0.004195 )
							if( bullPower <= 0.059827 )
								ret := 0.341463
							if( bullPower > 0.059827 )
								ret := 0.741047 // buy
						if( bearPower > 0.004195 )
							if( rsi1 <= 76.657 )
								ret := 0.200127
							if( rsi1 > 76.657 )
								ret := 0.391333
				if( d > 89.9388 )
					if( rsi1 <= 67.6985 )
						if( bbp <= 0.329315 )
							if( bearPower <= -0.027724 )
								ret := 0.446456
							if( bearPower > -0.027724 )
								ret := 0.126235
						if( bbp > 0.329315 )
							if( d_k <= -0.386022 )
								ret := -0.367876
							if( d_k > -0.386022 )
								ret := -0.020677
					if( rsi1 > 67.6985 )
						if( rsi1 <= 76.9256 )
							if( bearPower <= -0.019639 )
								ret := 0.741107 // buy
							if( bearPower > -0.019639 )
								ret := 0.325695
						if( rsi1 > 76.9256 )
							if( bullPower <= 2.54315 )
								ret := 0.615957
							if( bullPower > 2.54315 )
								ret := -0.850000 // sell
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_186f7e84(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


