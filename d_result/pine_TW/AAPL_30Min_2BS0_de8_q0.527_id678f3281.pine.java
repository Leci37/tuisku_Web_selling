//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AAPL_30Min_2BS0_678f3281 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_2BS0_678f3281", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_678f3281(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= 6.15738 )
		if( k <= 25.8149 )
			if( rsi1 <= 26.4445 )
				if( d <= 42.3988 )
					if( d_k <= 18.3948 )
						if( smoothD_d <= -1.04798 )
							if( bbm <= 0.812437 )
								if( bearPower <= -2.80502 )
									ret := 0.675676
								if( bearPower > -2.80502 )
									ret := 0.076493
							if( bbm > 0.812437 )
								if( smoothD_d <= -1.89081 )
									ret := -0.230640
								if( smoothD_d > -1.89081 )
									ret := 0.082645
						if( smoothD_d > -1.04798 )
							if( bbm <= 0.631866 )
								if( bullPower <= -1.40123 )
									ret := -0.412791
								if( bullPower > -1.40123 )
									ret := -0.054669
							if( bbm > 0.631866 )
								if( d <= 5.80558 )
									ret := -0.357527
								if( d > 5.80558 )
									ret := -0.111051
					if( d_k > 18.3948 )
						if( rsi1 <= 26.1173 )
							if( bbm <= 0.274436 )
								if( bullPower <= -0.23188 )
									ret := 0.000000
								if( bullPower > -0.23188 )
									ret := -0.695652
							if( bbm > 0.274436 )
								if( smoothD_d <= 34.2472 )
									ret := 0.225275
								if( smoothD_d > 34.2472 )
									ret := 0.636364
						if( rsi1 > 26.1173 )
							ret := 1.000000 // buy
				if( d > 42.3988 )
					if( bullPower <= -0.094976 )
						if( bullPower <= -0.236943 )
							if( d_k <= 27.8012 )
								if( k <= 24.0736 )
									ret := -1.000000 // sell
								if( k > 24.0736 )
									ret := -0.777778 // sell
							if( d_k > 27.8012 )
								if( smoothD_d <= 49.6561 )
									ret := -0.700000 // sell
								if( smoothD_d > 49.6561 )
									ret := -0.928571 // sell
						if( bullPower > -0.236943 )
							ret := -0.571429
					if( bullPower > -0.094976 )
						ret := -1.000000 // sell
			if( rsi1 > 26.4445 )
				if( k <= 5.98286 )
					if( d <= 0.001384 )
						if( bbm <= 0.449293 )
							if( bbp <= -0.889057 )
								ret := -0.400000
							if( bbp > -0.889057 )
								if( bearPower <= -0.244266 )
									ret := 0.217391
								if( bearPower > -0.244266 )
									ret := -0.112676
						if( bbm > 0.449293 )
							if( bearPower <= -0.461708 )
								if( bbm <= 1.35 )
									ret := -0.319149
								if( bbm > 1.35 )
									ret := 0.100000
							if( bearPower > -0.461708 )
								if( bbp <= 0.278563 )
									ret := -0.785714 // sell
								if( bbp > 0.278563 )
									ret := -0.900000 // sell
					if( d > 0.001384 )
						if( d_k <= 10.6886 )
							if( bullPower <= -1.46937 )
								if( bearPower <= -4.38633 )
									ret := -0.130435
								if( bearPower > -4.38633 )
									ret := 0.655462
							if( bullPower > -1.46937 )
								if( bbm <= 0.897308 )
									ret := 0.072487
								if( bbm > 0.897308 )
									ret := -0.130472
						if( d_k > 10.6886 )
							if( bearPower <= -2.39108 )
								if( bbp <= -2.9592 )
									ret := 0.802817 // buy
								if( bbp > -2.9592 )
									ret := -0.888889 // sell
							if( bearPower > -2.39108 )
								if( k <= 3.79449 )
									ret := 0.062893
								if( k > 3.79449 )
									ret := 0.345109
				if( k > 5.98286 )
					if( d_k <= 18.931 )
						if( k <= 22.0162 )
							if( d <= 5.93593 )
								if( d <= 2.96962 )
									ret := 0.190141
								if( d > 2.96962 )
									ret := -0.189145
							if( d > 5.93593 )
								if( rsi1 <= 67.9228 )
									ret := -0.024269
								if( rsi1 > 67.9228 )
									ret := 0.252525
						if( k > 22.0162 )
							if( bullPower <= -2.05549 )
								ret := 0.761905 // buy
							if( bullPower > -2.05549 )
								if( bbm <= 1.15821 )
									ret := -0.162977
								if( bbm > 1.15821 )
									ret := 0.027778
					if( d_k > 18.931 )
						if( bullPower <= -1.50682 )
							if( bearPower <= -6.02631 )
								ret := 0.222222
							if( bearPower > -6.02631 )
								if( bearPower <= -3.10669 )
									ret := 1.000000 // buy
								if( bearPower > -3.10669 )
									ret := 0.600000
						if( bullPower > -1.50682 )
							if( d <= 33.5599 )
								if( smoothK_k <= 7.46963 )
									ret := 0.393939
								if( smoothK_k > 7.46963 )
									ret := -0.089286
							if( d > 33.5599 )
								if( smoothD_d <= 35.3093 )
									ret := -0.133333
								if( smoothD_d > 35.3093 )
									ret := 0.090909
		if( k > 25.8149 )
			if( bearPower <= 0.588557 )
				if( k <= 70.7818 )
					if( d <= 82.5072 )
						if( rsi1 <= 47.4348 )
							if( smoothD_d <= 22.3343 )
								if( bbm <= 0.23963 )
									ret := 0.142119
								if( bbm > 0.23963 )
									ret := -0.053915
							if( smoothD_d > 22.3343 )
								if( bbp <= 1.61863 )
									ret := 0.094753
								if( bbp > 1.61863 )
									ret := 1.000000 // buy
						if( rsi1 > 47.4348 )
							if( smoothD_d <= 61.3535 )
								if( bullPower <= 1.56673 )
									ret := 0.015078
								if( bullPower > 1.56673 )
									ret := 0.263001
							if( smoothD_d > 61.3535 )
								if( smoothD_d <= 68.9974 )
									ret := -0.126563
								if( smoothD_d > 68.9974 )
									ret := 0.005010
					if( d > 82.5072 )
						if( k <= 66.0052 )
							if( bbp <= -3.18297 )
								ret := 0.937500 // buy
							if( bbp > -3.18297 )
								if( d_k <= 22.2781 )
									ret := 0.114943
								if( d_k > 22.2781 )
									ret := -0.555556
						if( k > 66.0052 )
							if( bullPower <= 0.195799 )
								if( bbm <= 1.60648 )
									ret := 0.287356
								if( bbm > 1.60648 )
									ret := -0.538462
							if( bullPower > 0.195799 )
								if( bullPower <= 0.36048 )
									ret := 0.851852 // buy
								if( bullPower > 0.36048 )
									ret := 0.500000
				if( k > 70.7818 )
					if( bbm <= 1.29002 )
						if( bullPower <= -7.27783 )
							ret := -1.000000 // sell
						if( bullPower > -7.27783 )
							if( smoothK_k <= 67.9855 )
								if( bbm <= 0.166168 )
									ret := 0.347826
								if( bbm > 0.166168 )
									ret := -0.482759
							if( smoothK_k > 67.9855 )
								if( rsi1 <= 80.2562 )
									ret := -0.018466
								if( rsi1 > 80.2562 )
									ret := 0.127325
					if( bbm > 1.29002 )
						if( smoothD_d <= 93.2181 )
							if( rsi1 <= 67.1097 )
								if( bullPower <= 1.48277 )
									ret := -0.203152
								if( bullPower > 1.48277 )
									ret := -0.440268
							if( rsi1 > 67.1097 )
								if( smoothK_k <= 87.3796 )
									ret := 0.199179
								if( smoothK_k > 87.3796 )
									ret := -0.182692
						if( smoothD_d > 93.2181 )
							if( rsi1 <= 79.085 )
								if( d_k <= 0.169688 )
									ret := -0.265193
								if( d_k > 0.169688 )
									ret := 0.108280
							if( rsi1 > 79.085 )
								if( bullPower <= 2.20625 )
									ret := 0.090909
								if( bullPower > 2.20625 )
									ret := 0.764706 // buy
			if( bearPower > 0.588557 )
				if( d_k <= -8.60099 )
					if( bbm <= 1.12589 )
						if( d_k <= -12.0249 )
							if( bearPower <= 0.958561 )
								if( d <= 83.846 )
									ret := -0.060000
								if( d > 83.846 )
									ret := 0.500000
							if( bearPower > 0.958561 )
								if( bbp <= 2.68485 )
									ret := -0.163934
								if( bbp > 2.68485 )
									ret := 0.250000
						if( d_k > -12.0249 )
							if( bearPower <= 0.778773 )
								if( bbp <= 1.85951 )
									ret := 0.013514
								if( bbp > 1.85951 )
									ret := 0.363636
							if( bearPower > 0.778773 )
								if( smoothD_d <= 47.6571 )
									ret := 0.142857
								if( smoothD_d > 47.6571 )
									ret := -0.545894
					if( bbm > 1.12589 )
						if( d <= 82.8653 )
							if( bbm <= 1.15953 )
								if( rsi1 <= 61.755 )
									ret := -0.571429
								if( rsi1 > 61.755 )
									ret := -1.000000 // sell
							if( bbm > 1.15953 )
								if( d_k <= -20.8292 )
									ret := -0.420118
								if( d_k > -20.8292 )
									ret := -0.077273
						if( d > 82.8653 )
							if( d_k <= -13.0851 )
								if( bbp <= 4.98905 )
									ret := 0.777778 // buy
								if( bbp > 4.98905 )
									ret := 0.111111
							if( d_k > -13.0851 )
								if( bbm <= 1.46468 )
									ret := -0.583333
								if( bbm > 1.46468 )
									ret := 0.090909
				if( d_k > -8.60099 )
					if( bearPower <= 0.600047 )
						if( bullPower <= 0.889241 )
							if( bbp <= 1.42927 )
								if( bbp <= 1.28129 )
									ret := 0.250000
								if( bbp > 1.28129 )
									ret := 0.000000
							if( bbp > 1.42927 )
								ret := -0.538462
						if( bullPower > 0.889241 )
							if( k <= 67.5732 )
								if( rsi1 <= 77.2335 )
									ret := 0.384615
								if( rsi1 > 77.2335 )
									ret := -0.555556
							if( k > 67.5732 )
								if( bullPower <= 1.67697 )
									ret := 0.622642
								if( bullPower > 1.67697 )
									ret := 0.133333
					if( bearPower > 0.600047 )
						if( smoothD_d <= 61.0343 )
							if( bullPower <= 1.54221 )
								if( d <= 58.2005 )
									ret := -0.085714
								if( d > 58.2005 )
									ret := 0.458824
							if( bullPower > 1.54221 )
								if( k <= 56.0473 )
									ret := 0.330798
								if( k > 56.0473 )
									ret := 0.616000
						if( smoothD_d > 61.0343 )
							if( smoothK_k <= 66.7259 )
								if( d_k <= 18.9729 )
									ret := -0.224684
								if( d_k > 18.9729 )
									ret := 0.437500
							if( smoothK_k > 66.7259 )
								if( d <= 93.3971 )
									ret := 0.140766
								if( d > 93.3971 )
									ret := 0.023702
	if( bullPower > 6.15738 )
		if( k <= 94.0842 )
			if( d <= 26.889 )
				ret := 0.666667
			if( d > 26.889 )
				if( d_k <= -25.5128 )
					ret := 0.250000
				if( d_k > -25.5128 )
					if( bearPower <= -0.099156 )
						ret := -1.000000 // sell
					if( bearPower > -0.099156 )
						if( d_k <= -9.75784 )
							if( bearPower <= 3.74511 )
								ret := -0.142857
							if( bearPower > 3.74511 )
								if( rsi1 <= 77.6683 )
									ret := -0.944444 // sell
								if( rsi1 > 77.6683 )
									ret := -0.750000 // sell
						if( d_k > -9.75784 )
							if( bullPower <= 6.84503 )
								ret := 0.636364
							if( bullPower > 6.84503 )
								if( d <= 72.3997 )
									ret := -0.041667
								if( d > 72.3997 )
									ret := -0.500000
		if( k > 94.0842 )
			if( d <= 99.6392 )
				if( k <= 99.3674 )
					if( k <= 97.9256 )
						if( bullPower <= 8.10338 )
							if( rsi1 <= 69.5984 )
								ret := -1.000000 // sell
							if( rsi1 > 69.5984 )
								if( d <= 95.6256 )
									ret := -0.800000 // sell
								if( d > 95.6256 )
									ret := -0.900000 // sell
						if( bullPower > 8.10338 )
							ret := -0.600000
					if( k > 97.9256 )
						if( k <= 98.7628 )
							ret := -0.200000
						if( k > 98.7628 )
							ret := -0.769231 // sell
				if( k > 99.3674 )
					if( d <= 97.5254 )
						if( bbp <= 11.4421 )
							ret := -0.769231 // sell
						if( bbp > 11.4421 )
							ret := -1.000000 // sell
					if( d > 97.5254 )
						ret := -0.727273 // sell
			if( d > 99.6392 )
				ret := -0.125000
	
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
float op_operation = decision_tree_0_AAPL_30Min_678f3281(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


