//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: NVDA_5Min_2ST0_9cc20074 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_2ST0_9cc20074", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_9cc20074(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.072132 )
		if( d <= 1.00656 )
			if( rsi1 <= 11.6485 )
				if( ema1 <= 117.81 )
					ret := -0.866667 // sell
				if( ema1 > 117.81 )
					if( ema13 <= -4.88248 )
						if( ema1 <= 853.462 )
							if( rsi1 <= 7.11845 )
								ret := -0.153846
							if( rsi1 > 7.11845 )
								ret := -0.823529 // sell
						if( ema1 > 853.462 )
							ret := 0.230769
					if( ema13 > -4.88248 )
						if( d <= 0.003141 )
							if( tema <= 460.691 )
								if( rsi1 <= 9.50237 )
									ret := 0.117647
								if( rsi1 > 9.50237 )
									ret := 0.727273 // buy
							if( tema > 460.691 )
								ret := -0.538462
						if( d > 0.003141 )
							if( k <= 0.000407 )
								ret := 0.000000
							if( k > 0.000407 )
								if( d <= 0.147567 )
									ret := 0.931034 // buy
								if( d > 0.147567 )
									ret := 0.500000
			if( rsi1 > 11.6485 )
				if( d <= 0.03264 )
					if( tema <= 101.018 )
						ret := 1.000000 // buy
					if( tema > 101.018 )
						if( ema2 <= 888.841 )
							if( ema2 <= 104.972 )
								ret := -1.000000 // sell
							if( ema2 > 104.972 )
								if( rsi1 <= 20.4392 )
									ret := -0.300000
								if( rsi1 > 20.4392 )
									ret := 0.212871
						if( ema2 > 888.841 )
							if( ema3 <= 930.233 )
								if( tema <= 897.38 )
									ret := -0.812500 // sell
								if( tema > 897.38 )
									ret := -0.500000
							if( ema3 > 930.233 )
								if( ema13 <= -1.25232 )
									ret := 0.285714
								if( ema13 > -1.25232 )
									ret := 0.000000
				if( d > 0.03264 )
					if( smoothD_d <= -2.90632 )
						if( smoothD_d <= -2.91987 )
							if( tema <= 402.939 )
								if( k <= 0.081337 )
									ret := -0.250000
								if( k > 0.081337 )
									ret := -0.222222
							if( tema > 402.939 )
								if( ema3 <= 462.266 )
									ret := -1.000000 // sell
								if( ema3 > 462.266 )
									ret := -0.315789
						if( smoothD_d > -2.91987 )
							ret := -1.000000 // sell
					if( smoothD_d > -2.90632 )
						if( ema1 <= 106.603 )
							if( ema2 <= 106.381 )
								ret := 0.200000
							if( ema2 > 106.381 )
								ret := 0.888889 // buy
						if( ema1 > 106.603 )
							if( rsi1 <= 49.5733 )
								if( ema2 <= 109.991 )
									ret := -0.907407 // sell
								if( ema2 > 109.991 )
									ret := -0.275238
							if( rsi1 > 49.5733 )
								ret := 0.333333
		if( d > 1.00656 )
			if( rsi1 <= 35.4006 )
				if( tema <= 537.296 )
					if( ema2 <= 423.966 )
						if( ema1 <= 103.951 )
							if( d_k <= -3.47783 )
								if( ema2 <= 101.759 )
									ret := -0.285714
								if( ema2 > 101.759 )
									ret := 0.583333
							if( d_k > -3.47783 )
								if( rsi1 <= 28.3775 )
									ret := -0.609865
								if( rsi1 > 28.3775 )
									ret := 0.317460
						if( ema1 > 103.951 )
							if( smoothK_k <= 95.096 )
								if( d_k <= 20.8832 )
									ret := 0.080785
								if( d_k > 20.8832 )
									ret := -0.158311
							if( smoothK_k > 95.096 )
								if( smoothD_d <= 95.6102 )
									ret := -0.250000
								if( smoothD_d > 95.6102 )
									ret := -1.000000 // sell
					if( ema2 > 423.966 )
						if( ema13 <= -8.23467 )
							if( ema1 <= 488.936 )
								ret := 1.000000 // buy
							if( ema1 > 488.936 )
								ret := 0.600000
						if( ema13 > -8.23467 )
							if( d_k <= 30.5545 )
								if( rsi1 <= 33.2662 )
									ret := -0.144114
								if( rsi1 > 33.2662 )
									ret := -0.001076
							if( d_k > 30.5545 )
								if( smoothD_d <= 52.522 )
									ret := 0.318182
								if( smoothD_d > 52.522 )
									ret := 0.923077 // buy
				if( tema > 537.296 )
					if( ema1 <= 614.309 )
						if( ema2 <= 614.152 )
							if( ema12 <= -0.544863 )
								if( tema <= 553.623 )
									ret := 0.826087 // buy
								if( tema > 553.623 )
									ret := 0.268421
							if( ema12 > -0.544863 )
								if( d_k <= 0.160705 )
									ret := 0.272727
								if( d_k > 0.160705 )
									ret := -0.141304
						if( ema2 > 614.152 )
							if( d <= 5.22491 )
								ret := 1.000000 // buy
							if( d > 5.22491 )
								if( smoothK_k <= 14.8777 )
									ret := 0.838710 // buy
								if( smoothK_k > 14.8777 )
									ret := 0.400000
					if( ema1 > 614.309 )
						if( k <= 21.5261 )
							if( ema1 <= 624.676 )
								if( rsi1 <= 31.8623 )
									ret := -0.440678
								if( rsi1 > 31.8623 )
									ret := -0.960784 // sell
							if( ema1 > 624.676 )
								if( ema13 <= -25.6039 )
									ret := -0.727273 // sell
								if( ema13 > -25.6039 )
									ret := 0.045338
						if( k > 21.5261 )
							if( ema12 <= -8.36078 )
								ret := 1.000000 // buy
							if( ema12 > -8.36078 )
								if( k <= 49.6981 )
									ret := 0.258837
								if( k > 49.6981 )
									ret := -0.035477
			if( rsi1 > 35.4006 )
				if( tema <= 1205.61 )
					if( ema1 <= 982.771 )
						if( ema3 <= 957.752 )
							if( ema12 <= -0.962328 )
								if( smoothD_d <= 89.0423 )
									ret := -0.223065
								if( smoothD_d > 89.0423 )
									ret := 0.194595
							if( ema12 > -0.962328 )
								if( d <= 9.59026 )
									ret := -0.139596
								if( d > 9.59026 )
									ret := -0.017589
						if( ema3 > 957.752 )
							if( ema13 <= -0.79161 )
								ret := -1.000000 // sell
							if( ema13 > -0.79161 )
								if( ema3 <= 958.893 )
									ret := -0.869565 // sell
								if( ema3 > 958.893 )
									ret := 0.000000
					if( ema1 > 982.771 )
						if( smoothD_d <= 90.7218 )
							if( d <= 36.5696 )
								if( ema1 <= 1198.79 )
									ret := 0.039735
								if( ema1 > 1198.79 )
									ret := 0.744681 // buy
							if( d > 36.5696 )
								if( ema13 <= -4.9779 )
									ret := 0.194444
								if( ema13 > -4.9779 )
									ret := 0.663300
						if( smoothD_d > 90.7218 )
							if( ema1 <= 1120.43 )
								if( d <= 94.5854 )
									ret := -0.800000 // sell
								if( d > 94.5854 )
									ret := -1.000000 // sell
							if( ema1 > 1120.43 )
								if( ema3 <= 1136.08 )
									ret := 1.000000 // buy
								if( ema3 > 1136.08 )
									ret := 0.000000
				if( tema > 1205.61 )
					if( ema3 <= 1225.18 )
						if( ema13 <= -0.212769 )
							if( ema1 <= 1207.61 )
								ret := -0.600000
							if( ema1 > 1207.61 )
								if( ema2 <= 1214.52 )
									ret := -1.000000 // sell
								if( ema2 > 1214.52 )
									ret := -0.900000 // sell
						if( ema13 > -0.212769 )
							ret := -0.588235
					if( ema3 > 1225.18 )
						if( ema1 <= 1242.55 )
							if( d <= 39.7688 )
								ret := 0.200000
							if( d > 39.7688 )
								ret := -0.454545
						if( ema1 > 1242.55 )
							ret := -0.538462
	if( ema12 > 0.072132 )
		if( ema3 <= 1242 )
			if( ema12 <= 2.23695 )
				if( ema3 <= 1035.62 )
					if( ema1 <= 846.932 )
						if( ema3 <= 827.724 )
							if( d <= 98.3787 )
								if( ema1 <= 98.8748 )
									ret := 0.852941 // buy
								if( ema1 > 98.8748 )
									ret := 0.033768
							if( d > 98.3787 )
								if( tema <= 509.105 )
									ret := 0.130316
								if( tema > 509.105 )
									ret := 0.504902
						if( ema3 > 827.724 )
							if( ema13 <= 2.68734 )
								if( ema3 <= 833.739 )
									ret := 0.726316 // buy
								if( ema3 > 833.739 )
									ret := 0.341463
							if( ema13 > 2.68734 )
								if( k <= 46.0286 )
									ret := 0.400000
								if( k > 46.0286 )
									ret := -0.272727
					if( ema1 > 846.932 )
						if( smoothD_d <= 2.76176 )
							if( ema1 <= 909.311 )
								if( k <= 7.50199 )
									ret := -0.745223 // sell
								if( k > 7.50199 )
									ret := 0.100000
							if( ema1 > 909.311 )
								if( ema12 <= 1.0625 )
									ret := -0.184211
								if( ema12 > 1.0625 )
									ret := 0.454545
						if( smoothD_d > 2.76176 )
							if( rsi1 <= 57.6443 )
								if( ema2 <= 852.211 )
									ret := -0.295918
								if( ema2 > 852.211 )
									ret := 0.140361
							if( rsi1 > 57.6443 )
								if( ema1 <= 852.912 )
									ret := -0.328173
								if( ema1 > 852.912 )
									ret := -0.053513
				if( ema3 > 1035.62 )
					if( ema3 <= 1131.82 )
						if( rsi1 <= 64.5042 )
							if( smoothK_k <= 51.6408 )
								if( rsi1 <= 50.7019 )
									ret := -0.035714
								if( rsi1 > 50.7019 )
									ret := 0.629032
							if( smoothK_k > 51.6408 )
								if( ema3 <= 1083.12 )
									ret := 0.727273 // buy
								if( ema3 > 1083.12 )
									ret := 0.890244 // buy
						if( rsi1 > 64.5042 )
							if( ema2 <= 1096.65 )
								if( ema13 <= 3.04909 )
									ret := -0.100000
								if( ema13 > 3.04909 )
									ret := 0.474576
							if( ema2 > 1096.65 )
								if( smoothD_d <= 92.0628 )
									ret := 0.636364
								if( smoothD_d > 92.0628 )
									ret := 1.000000 // buy
					if( ema3 > 1131.82 )
						if( ema2 <= 1213.36 )
							if( ema1 <= 1206.45 )
								if( tema <= 1137.12 )
									ret := 0.714286 // buy
								if( tema > 1137.12 )
									ret := 0.136964
							if( ema1 > 1206.45 )
								if( smoothK_k <= 78.4024 )
									ret := -0.219512
								if( smoothK_k > 78.4024 )
									ret := -1.000000 // sell
						if( ema2 > 1213.36 )
							if( smoothK_k <= 95.8747 )
								if( ema3 <= 1227.65 )
									ret := 0.740741 // buy
								if( ema3 > 1227.65 )
									ret := 0.100000
							if( smoothK_k > 95.8747 )
								ret := 1.000000 // buy
			if( ema12 > 2.23695 )
				if( ema2 <= 352.149 )
					ret := 1.000000 // buy
				if( ema2 > 352.149 )
					if( smoothK_k <= 0.676159 )
						if( ema3 <= 873.349 )
							if( ema2 <= 722.685 )
								if( ema2 <= 464.272 )
									ret := -0.880952 // sell
								if( ema2 > 464.272 )
									ret := -1.000000 // sell
							if( ema2 > 722.685 )
								ret := -0.545455
						if( ema3 > 873.349 )
							ret := 0.615385
					if( smoothK_k > 0.676159 )
						if( tema <= 867.328 )
							if( smoothD_d <= 71.2567 )
								if( smoothK_k <= 6.84628 )
									ret := 0.391304
								if( smoothK_k > 6.84628 )
									ret := -0.495763
							if( smoothD_d > 71.2567 )
								if( tema <= 474.8 )
									ret := -0.325490
								if( tema > 474.8 )
									ret := 0.203661
						if( tema > 867.328 )
							if( smoothD_d <= 66.6197 )
								if( k <= 61.601 )
									ret := 0.245353
								if( k > 61.601 )
									ret := -0.103704
							if( smoothD_d > 66.6197 )
								if( ema2 <= 867.819 )
									ret := 0.485714
								if( ema2 > 867.819 )
									ret := -0.319536
		if( ema3 > 1242 )
			ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_NVDA_5Min_9cc20074(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


