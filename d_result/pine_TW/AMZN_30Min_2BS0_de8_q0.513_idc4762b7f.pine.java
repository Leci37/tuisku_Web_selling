//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AMZN_30Min_2BS0_c4762b7f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2BS0_c4762b7f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_c4762b7f(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= 38.3103 )
		if( k <= 0.194852 )
			if( smoothD_d <= 1.58641 )
				if( bbp <= -0.495174 )
					if( rsi1 <= 17.0151 )
						if( d <= 0.026999 )
							if( smoothK_k <= -2.99932 )
								ret := 0.393750
							if( smoothK_k > -2.99932 )
								if( bearPower <= -22.5388 )
									ret := 0.941176 // buy
								if( bearPower > -22.5388 )
									ret := 0.272727
						if( d > 0.026999 )
							if( rsi1 <= 11.2178 )
								if( k <= 0.105975 )
									ret := -0.226087
								if( k > 0.105975 )
									ret := 0.541667
							if( rsi1 > 11.2178 )
								if( bullPower <= -23.4913 )
									ret := 0.868421 // buy
								if( bullPower > -23.4913 )
									ret := 0.333333
					if( rsi1 > 17.0151 )
						if( d <= 0.529492 )
							if( d_k <= -0.049535 )
								if( d <= 0.050714 )
									ret := 0.888889 // buy
								if( d > 0.050714 )
									ret := 0.333333
							if( d_k > -0.049535 )
								if( rsi1 <= 27.4592 )
									ret := -0.270270
								if( rsi1 > 27.4592 )
									ret := 0.126984
						if( d > 0.529492 )
							if( bbm <= 10.0457 )
								if( bullPower <= -12.2907 )
									ret := 0.705882 // buy
								if( bullPower > -12.2907 )
									ret := 0.165625
							if( bbm > 10.0457 )
								if( d_k <= 2.11524 )
									ret := -0.238806
								if( d_k > 2.11524 )
									ret := 0.188406
				if( bbp > -0.495174 )
					if( d <= 2.85804 )
						if( bbm <= 0.132388 )
							if( bullPower <= 1.34303 )
								ret := 0.000000
							if( bullPower > 1.34303 )
								ret := 0.272727
						if( bbm > 0.132388 )
							if( d <= 1.43734 )
								if( rsi1 <= 33.7499 )
									ret := 0.896552 // buy
								if( rsi1 > 33.7499 )
									ret := 0.638095
							if( d > 1.43734 )
								if( bbm <= 1.31159 )
									ret := 0.693878
								if( bbm > 1.31159 )
									ret := 0.000000
					if( d > 2.85804 )
						if( smoothD_d <= 0.14836 )
							if( bbm <= 2.26 )
								ret := 0.083333
							if( bbm > 2.26 )
								ret := -0.538462
						if( smoothD_d > 0.14836 )
							if( bbp <= 7.41939 )
								if( bearPower <= 0.025384 )
									ret := 0.166667
								if( bearPower > 0.025384 )
									ret := 0.000000
							if( bbp > 7.41939 )
								ret := 0.714286 // buy
			if( smoothD_d > 1.58641 )
				if( rsi1 <= 37.3473 )
					if( bbp <= -98.5553 )
						if( bbm <= 18.316 )
							ret := 0.545455
						if( bbm > 18.316 )
							ret := 0.941176 // buy
					if( bbp > -98.5553 )
						if( BBPower_Color <= 0.5 )
							if( smoothD_d <= 12.7996 )
								if( k <= 0.000916 )
									ret := -0.101887
								if( k > 0.000916 )
									ret := -0.342105
							if( smoothD_d > 12.7996 )
								if( bullPower <= -0.352767 )
									ret := -0.560748
								if( bullPower > -0.352767 )
									ret := 0.000000
						if( BBPower_Color > 0.5 )
							ret := 0.600000
				if( rsi1 > 37.3473 )
					if( d_k <= 6.9219 )
						if( bullPower <= 3.92778 )
							if( smoothK_k <= -2.98734 )
								if( rsi1 <= 55.5112 )
									ret := -0.183333
								if( rsi1 > 55.5112 )
									ret := 0.100000
							if( smoothK_k > -2.98734 )
								ret := -0.736842 // sell
						if( bullPower > 3.92778 )
							ret := 0.476190
					if( d_k > 6.9219 )
						if( bbp <= 0.426998 )
							if( d_k <= 11.2461 )
								if( bbm <= 0.984888 )
									ret := 0.517857
								if( bbm > 0.984888 )
									ret := -0.256410
							if( d_k > 11.2461 )
								if( rsi1 <= 53.9706 )
									ret := 0.614035
								if( rsi1 > 53.9706 )
									ret := -0.545455
						if( bbp > 0.426998 )
							if( bullPower <= 6.52616 )
								if( bullPower <= 1.48655 )
									ret := -0.450000
								if( bullPower > 1.48655 )
									ret := -0.083333
							if( bullPower > 6.52616 )
								ret := 0.733333 // buy
		if( k > 0.194852 )
			if( rsi1 <= 68.4821 )
				if( k <= 91.2866 )
					if( bbp <= 51.3965 )
						if( bearPower <= -30.7386 )
							if( bullPower <= -52.3357 )
								if( rsi1 <= 10.3954 )
									ret := -0.166667
								if( rsi1 > 10.3954 )
									ret := 0.471264
							if( bullPower > -52.3357 )
								if( smoothD_d <= 88.6012 )
									ret := -0.133152
								if( smoothD_d > 88.6012 )
									ret := 0.875000 // buy
						if( bearPower > -30.7386 )
							if( bbm <= 1.04509 )
								if( bullPower <= -2.47456 )
									ret := 0.195652
								if( bullPower > -2.47456 )
									ret := 0.031989
							if( bbm > 1.04509 )
								if( rsi1 <= 60.7977 )
									ret := -0.039058
								if( rsi1 > 60.7977 )
									ret := 0.036015
					if( bbp > 51.3965 )
						if( smoothK_k <= 11.2186 )
							ret := 0.300000
						if( smoothK_k > 11.2186 )
							if( k <= 60.9736 )
								if( bbp <= 54.6983 )
									ret := -0.962963 // sell
								if( bbp > 54.6983 )
									ret := -0.613445
							if( k > 60.9736 )
								if( k <= 76.1718 )
									ret := -0.150000
								if( k > 76.1718 )
									ret := -0.543210
				if( k > 91.2866 )
					if( d_k <= -26.1024 )
						if( bbm <= 22.8516 )
							if( BBPower_Color <= 0.5 )
								if( k <= 98.7535 )
									ret := 0.735294 // buy
								if( k > 98.7535 )
									ret := 0.235294
							if( BBPower_Color > 0.5 )
								if( bullPower <= 24.8934 )
									ret := 0.064516
								if( bullPower > 24.8934 )
									ret := 0.875000 // buy
						if( bbm > 22.8516 )
							ret := -0.363636
					if( d_k > -26.1024 )
						if( bbp <= 27.0649 )
							if( bullPower <= -15.1547 )
								if( bullPower <= -18.9176 )
									ret := 0.484848
								if( bullPower > -18.9176 )
									ret := 0.950000 // buy
							if( bullPower > -15.1547 )
								if( smoothK_k <= 92.5244 )
									ret := -0.179615
								if( smoothK_k > 92.5244 )
									ret := -0.043676
						if( bbp > 27.0649 )
							if( bearPower <= 22.1215 )
								if( smoothK_k <= 90.4692 )
									ret := -0.183333
								if( smoothK_k > 90.4692 )
									ret := -0.544379
							if( bearPower > 22.1215 )
								if( smoothD_d <= 94.6881 )
									ret := -0.292683
								if( smoothD_d > 94.6881 )
									ret := 0.758621 // buy
			if( rsi1 > 68.4821 )
				if( d_k <= 1.69446 )
					if( bullPower <= 62.3496 )
						if( rsi1 <= 85.2824 )
							if( k <= 98.0674 )
								if( bbp <= 19.8122 )
									ret := 0.002982
								if( bbp > 19.8122 )
									ret := 0.148990
							if( k > 98.0674 )
								if( d <= 85.5657 )
									ret := -0.447236
								if( d > 85.5657 )
									ret := -0.054916
						if( rsi1 > 85.2824 )
							if( bearPower <= 19.8972 )
								if( d <= 94.9051 )
									ret := 0.256164
								if( d > 94.9051 )
									ret := 0.029348
							if( bearPower > 19.8972 )
								if( smoothK_k <= 90.9232 )
									ret := 0.000000
								if( smoothK_k > 90.9232 )
									ret := 0.493776
					if( bullPower > 62.3496 )
						if( d <= 84.6838 )
							if( smoothK_k <= 64.2446 )
								ret := -0.636364
							if( smoothK_k > 64.2446 )
								ret := -1.000000 // sell
						if( d > 84.6838 )
							if( d <= 96.3757 )
								ret := 0.500000
							if( d > 96.3757 )
								ret := -0.263158
				if( d_k > 1.69446 )
					if( smoothK_k <= 34.0484 )
						if( bbp <= 28.5416 )
							if( smoothD_d <= 43.8667 )
								if( d <= 38.3729 )
									ret := 0.300971
								if( d > 38.3729 )
									ret := 0.545455
							if( smoothD_d > 43.8667 )
								if( bearPower <= 7.78402 )
									ret := 0.132743
								if( bearPower > 7.78402 )
									ret := -0.666667
						if( bbp > 28.5416 )
							if( d <= 49.6083 )
								if( bbp <= 37.7731 )
									ret := 0.766667 // buy
								if( bbp > 37.7731 )
									ret := 0.028571
							if( d > 49.6083 )
								ret := 1.000000 // buy
					if( smoothK_k > 34.0484 )
						if( smoothK_k <= 91.0344 )
							if( rsi1 <= 84.57 )
								if( rsi1 <= 77.3502 )
									ret := 0.079579
								if( rsi1 > 77.3502 )
									ret := 0.238783
							if( rsi1 > 84.57 )
								if( bbm <= 10.8375 )
									ret := -0.134259
								if( bbm > 10.8375 )
									ret := 0.372549
						if( smoothK_k > 91.0344 )
							if( bullPower <= 4.15175 )
								if( bbp <= 2.98363 )
									ret := 0.317536
								if( bbp > 2.98363 )
									ret := 0.795455 // buy
							if( bullPower > 4.15175 )
								if( bearPower <= 8.63497 )
									ret := -0.184211
								if( bearPower > 8.63497 )
									ret := 0.314815
	if( bearPower > 38.3103 )
		if( bbp <= 96.6867 )
			if( bbm <= 5.58146 )
				if( smoothD_d <= 91.223 )
					if( smoothK_k <= 74.2609 )
						ret := 0.000000
					if( smoothK_k > 74.2609 )
						if( bbm <= 3.15527 )
							if( smoothD_d <= 81.6512 )
								ret := -0.937500 // sell
							if( smoothD_d > 81.6512 )
								ret := -0.666667
						if( bbm > 3.15527 )
							ret := -0.400000
				if( smoothD_d > 91.223 )
					ret := 0.428571
			if( bbm > 5.58146 )
				if( d <= 77.1377 )
					ret := 0.461538
				if( d > 77.1377 )
					ret := -0.083333
		if( bbp > 96.6867 )
			if( d <= 99.4309 )
				if( d <= 85.9959 )
					if( k <= 79.1681 )
						if( d <= 49.8626 )
							ret := -0.333333
						if( d > 49.8626 )
							if( bbp <= 118.087 )
								ret := -0.937500 // sell
							if( bbp > 118.087 )
								ret := -0.714286 // sell
					if( k > 79.1681 )
						if( k <= 93.2029 )
							if( d <= 83.1837 )
								ret := 0.533333
							if( d > 83.1837 )
								ret := -0.222222
						if( k > 93.2029 )
							ret := -0.909091 // sell
				if( d > 85.9959 )
					if( bullPower <= 82.0864 )
						if( smoothK_k <= 86.3979 )
							ret := -1.000000 // sell
						if( smoothK_k > 86.3979 )
							if( bbm <= 14.5617 )
								if( d_k <= -0.17724 )
									ret := -0.578947
								if( d_k > -0.17724 )
									ret := -0.750000 // sell
							if( bbm > 14.5617 )
								if( bearPower <= 41.8365 )
									ret := -0.800000 // sell
								if( bearPower > 41.8365 )
									ret := -1.000000 // sell
					if( bullPower > 82.0864 )
						if( d <= 89.794 )
							ret := -0.866667 // sell
						if( d > 89.794 )
							if( d_k <= 1.62812 )
								ret := 0.000000
							if( d_k > 1.62812 )
								ret := -0.833333 // sell
			if( d > 99.4309 )
				if( bbm <= 23.4839 )
					ret := 0.000000
				if( bbm > 23.4839 )
					ret := 0.200000
	
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
float op_operation = decision_tree_0_AMZN_30Min_c4762b7f(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


