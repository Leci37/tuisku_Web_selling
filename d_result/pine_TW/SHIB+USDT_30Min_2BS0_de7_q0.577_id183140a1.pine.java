//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SHIBUSDT_30Min_2BS0_183140a1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_2BS0_183140a1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_183140a1(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 53.6156 )
		if( BBPower_Color <= 0.5 )
			if( smoothK_k <= 18.869 )
				if( d_k <= 0.618933 )
					if( d <= 4.6322 )
						if( k <= 7.93928 )
							if( bearPower <= -3e-06 )
								ret := 0.829787 // buy
							if( bearPower > -3e-06 )
								ret := -0.112666
						if( k > 7.93928 )
							if( rsi1 <= 36.4519 )
								ret := -0.615764
							if( rsi1 > 36.4519 )
								ret := -0.225225
					if( d > 4.6322 )
						if( rsi1 <= 29.8246 )
							if( rsi1 <= 17.3913 )
								ret := 0.380531
							if( rsi1 > 17.3913 )
								ret := -0.109461
						if( rsi1 > 29.8246 )
							if( bbp <= -4e-06 )
								ret := -0.950000 // sell
							if( bbp > -4e-06 )
								ret := 0.072032
				if( d_k > 0.618933 )
					if( k <= 2.50377 )
						if( rsi1 <= 24.9949 )
							if( d <= 23.1863 )
								ret := -0.502703
							if( d > 23.1863 )
								ret := 0.461538
						if( rsi1 > 24.9949 )
							if( smoothD_d <= 18.037 )
								ret := -0.258410
							if( smoothD_d > 18.037 )
								ret := 0.272727
					if( k > 2.50377 )
						if( d_k <= 17.0781 )
							if( rsi1 <= 10.5256 )
								ret := 0.869565 // buy
							if( rsi1 > 10.5256 )
								ret := -0.159259
						if( d_k > 17.0781 )
							if( rsi1 <= 41.1352 )
								ret := -0.435982
							if( rsi1 > 41.1352 )
								ret := -0.171717
			if( smoothK_k > 18.869 )
				if( rsi1 <= 40.9066 )
					if( d_k <= -0.749491 )
						if( d <= 13.1566 )
							if( k <= 26.8582 )
								ret := -0.153226
							if( k > 26.8582 )
								ret := -0.655172
						if( d > 13.1566 )
							if( d_k <= -13.3041 )
								ret := 0.241843
							if( d_k > -13.3041 )
								ret := 0.025061
					if( d_k > -0.749491 )
						if( bbp <= -3e-06 )
							if( rsi1 <= 35.8835 )
								ret := 0.550000
							if( rsi1 > 35.8835 )
								ret := -1.000000 // sell
						if( bbp > -3e-06 )
							if( d_k <= 6.74982 )
								ret := -0.113904
							if( d_k > 6.74982 )
								ret := -0.299232
				if( rsi1 > 40.9066 )
					if( smoothD_d <= 42.7905 )
						if( d_k <= -3.26571 )
							if( rsi1 <= 45.2437 )
								ret := 0.202307
							if( rsi1 > 45.2437 )
								ret := 0.341332
						if( d_k > -3.26571 )
							if( d <= 40.4749 )
								ret := -0.034483
							if( d > 40.4749 )
								ret := 0.154047
					if( smoothD_d > 42.7905 )
						if( d_k <= -6.68175 )
							if( d_k <= -19.3398 )
								ret := 0.472628
							if( d_k > -19.3398 )
								ret := 0.209723
						if( d_k > -6.68175 )
							if( smoothK_k <= 86.0214 )
								ret := -0.094557
							if( smoothK_k > 86.0214 )
								ret := 0.090476
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 42.8261 )
				if( d_k <= 18.0949 )
					if( d_k <= -0.070608 )
						if( rsi1 <= 41.3142 )
							if( d <= 91.2968 )
								ret := -0.069565
							if( d > 91.2968 )
								ret := -0.636364
						if( rsi1 > 41.3142 )
							if( k <= 11.9376 )
								ret := -0.673913
							if( k > 11.9376 )
								ret := -0.223404
					if( d_k > -0.070608 )
						if( smoothD_d <= 41.8425 )
							if( d <= 8.15639 )
								ret := -0.479508
							if( d > 8.15639 )
								ret := -0.243243
						if( smoothD_d > 41.8425 )
							if( rsi1 <= 38.7001 )
								ret := -0.635514
							if( rsi1 > 38.7001 )
								ret := -0.391813
				if( d_k > 18.0949 )
					if( d_k <= 19.2763 )
						if( d <= 35.7104 )
							if( smoothD_d <= 15.5661 )
								ret := -0.750000 // sell
							if( smoothD_d > 15.5661 )
								ret := -1.000000 // sell
						if( d > 35.7104 )
							if( d_k <= 18.4358 )
								ret := -1.000000 // sell
							if( d_k > 18.4358 )
								ret := -0.730769 // sell
					if( d_k > 19.2763 )
						if( smoothD_d <= 73.6723 )
							if( smoothD_d <= 68.6767 )
								ret := -0.666667
							if( smoothD_d > 68.6767 )
								ret := -0.920000 // sell
						if( smoothD_d > 73.6723 )
							if( rsi1 <= 39.4671 )
								ret := -0.714286 // sell
							if( rsi1 > 39.4671 )
								ret := 0.142857
			if( rsi1 > 42.8261 )
				if( d_k <= 12.5252 )
					if( smoothD_d <= 8.52535 )
						if( smoothK_k <= 5.92428 )
							if( bbm <= 2e-06 )
								ret := -0.410745
							if( bbm > 2e-06 )
								ret := 0.666667
						if( smoothK_k > 5.92428 )
							if( smoothK_k <= 12.6925 )
								ret := -0.062112
							if( smoothK_k > 12.6925 )
								ret := -0.402597
					if( smoothD_d > 8.52535 )
						if( d <= 89.6907 )
							if( k <= 92.1439 )
								ret := -0.086148
							if( k > 92.1439 )
								ret := -0.338710
						if( d > 89.6907 )
							if( d <= 91.6069 )
								ret := -0.481013
							if( d > 91.6069 )
								ret := -0.212302
				if( d_k > 12.5252 )
					if( smoothK_k <= 63.9342 )
						if( d <= 28.3444 )
							if( k <= 6.37132 )
								ret := -0.450000
							if( k > 6.37132 )
								ret := -0.017857
						if( d > 28.3444 )
							if( smoothK_k <= 5.22619 )
								ret := -0.972222 // sell
							if( smoothK_k > 5.22619 )
								ret := -0.456933
					if( smoothK_k > 63.9342 )
						if( rsi1 <= 50.5208 )
							if( bbp <= 0 )
								ret := -0.379310
							if( bbp > 0 )
								ret := -1.000000 // sell
						if( rsi1 > 50.5208 )
							if( k <= 68.8942 )
								ret := 0.571429
							if( k > 68.8942 )
								ret := 0.066667
	if( rsi1 > 53.6156 )
		if( rsi1 <= 72.0081 )
			if( k <= 22.8354 )
				if( bearPower <= -1e-06 )
					if( d <= 18.7031 )
						if( k <= 6.88274 )
							ret := 1.000000 // buy
						if( k > 6.88274 )
							ret := 0.666667
					if( d > 18.7031 )
						ret := 1.000000 // buy
				if( bearPower > -1e-06 )
					if( d_k <= 23.3928 )
						if( BBPower_Color <= 0.5 )
							if( k <= 2.1339 )
								ret := 0.717949 // buy
							if( k > 2.1339 )
								ret := 0.091711
						if( BBPower_Color > 0.5 )
							if( d_k <= -11.797 )
								ret := 0.750000 // buy
							if( d_k > -11.797 )
								ret := -0.148840
					if( d_k > 23.3928 )
						if( smoothD_d <= 43.7857 )
							if( smoothK_k <= -1.42392 )
								ret := 0.400000
							if( smoothK_k > -1.42392 )
								ret := -0.703297 // sell
						if( smoothD_d > 43.7857 )
							if( d_k <= 28.5149 )
								ret := 0.750000 // buy
							if( d_k > 28.5149 )
								ret := -0.333333
			if( k > 22.8354 )
				if( d_k <= 5.82772 )
					if( d_k <= -3.19696 )
						if( BBPower_Color <= 0.5 )
							if( d_k <= -9.28053 )
								ret := 0.604593
							if( d_k > -9.28053 )
								ret := 0.382114
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 62.3535 )
								ret := 0.028462
							if( rsi1 > 62.3535 )
								ret := 0.174685
					if( d_k > -3.19696 )
						if( smoothK_k <= 71.2189 )
							if( d <= 24.113 )
								ret := -0.431818
							if( d > 24.113 )
								ret := 0.181818
						if( smoothK_k > 71.2189 )
							if( BBPower_Color <= 0.5 )
								ret := 0.213284
							if( BBPower_Color > 0.5 )
								ret := 0.003919
				if( d_k > 5.82772 )
					if( rsi1 <= 69.0485 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 57.16 )
								ret := -0.034904
							if( rsi1 > 57.16 )
								ret := 0.318665
						if( BBPower_Color > 0.5 )
							if( smoothK_k <= 62.0779 )
								ret := -0.228653
							if( smoothK_k > 62.0779 )
								ret := -0.087248
					if( rsi1 > 69.0485 )
						if( d <= 96.0515 )
							if( d_k <= 11.6271 )
								ret := -0.211221
							if( d_k > 11.6271 )
								ret := -0.465517
						if( d > 96.0515 )
							if( rsi1 <= 71.0132 )
								ret := 0.428571
							if( rsi1 > 71.0132 )
								ret := 0.833333 // buy
		if( rsi1 > 72.0081 )
			if( d_k <= 0.451366 )
				if( smoothD_d <= 76.2664 )
					if( BBPower_Color <= 0.5 )
						if( smoothK_k <= 93.359 )
							if( rsi1 <= 72.2349 )
								ret := 0.833333 // buy
							if( rsi1 > 72.2349 )
								ret := 0.980198 // buy
						if( smoothK_k > 93.359 )
							if( rsi1 <= 74.539 )
								ret := 0.500000
							if( rsi1 > 74.539 )
								ret := 0.909091 // buy
					if( BBPower_Color > 0.5 )
						if( smoothD_d <= 73.9542 )
							if( smoothK_k <= 86.5891 )
								ret := 0.404435
							if( smoothK_k > 86.5891 )
								ret := -0.137931
						if( smoothD_d > 73.9542 )
							if( d_k <= -15.8433 )
								ret := -0.545455
							if( d_k > -15.8433 )
								ret := 0.776978 // buy
				if( smoothD_d > 76.2664 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 1e-06 )
							if( smoothD_d <= 92.8538 )
								ret := 0.924528 // buy
							if( smoothD_d > 92.8538 )
								ret := 0.717391 // buy
						if( bullPower > 1e-06 )
							ret := 0.000000
					if( BBPower_Color > 0.5 )
						if( k <= 99.7819 )
							if( bbp <= 4e-06 )
								ret := 0.165429
							if( bbp > 4e-06 )
								ret := -0.159091
						if( k > 99.7819 )
							if( bullPower <= 4e-06 )
								ret := 0.440106
							if( bullPower > 4e-06 )
								ret := -0.772727 // sell
			if( d_k > 0.451366 )
				if( smoothD_d <= 92.2426 )
					if( d <= 91.7909 )
						if( d_k <= 5.38225 )
							if( bullPower <= 2e-06 )
								ret := 0.375000
							if( bullPower > 2e-06 )
								ret := -0.500000
						if( d_k > 5.38225 )
							if( smoothD_d <= 40.3871 )
								ret := 0.574468
							if( smoothD_d > 40.3871 )
								ret := -0.080808
					if( d > 91.7909 )
						if( k <= 91.7102 )
							if( bbp <= 3e-06 )
								ret := -0.024896
							if( bbp > 3e-06 )
								ret := -1.000000 // sell
						if( k > 91.7102 )
							if( d_k <= 2.08774 )
								ret := -0.391892
							if( d_k > 2.08774 )
								ret := -0.780488 // sell
				if( smoothD_d > 92.2426 )
					if( d_k <= 1.95858 )
						if( smoothD_d <= 92.9723 )
							if( bullPower <= 1e-06 )
								ret := 0.653061
							if( bullPower > 1e-06 )
								ret := -1.000000 // sell
						if( smoothD_d > 92.9723 )
							if( k <= 94.9624 )
								ret := -0.450000
							if( k > 94.9624 )
								ret := 0.137931
					if( d_k > 1.95858 )
						if( bullPower <= 2e-06 )
							if( rsi1 <= 75.6504 )
								ret := 0.263636
							if( rsi1 > 75.6504 )
								ret := 0.667984
						if( bullPower > 2e-06 )
							if( d_k <= 5.2947 )
								ret := -0.552632
							if( d_k > 5.2947 )
								ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_183140a1(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


