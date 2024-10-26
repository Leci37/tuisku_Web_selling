//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: TRXUSDT_15Min_1S00_6c92f76c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1S00_6c92f76c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_6c92f76c(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( rsi1 <= 45.5819 )
		if( k <= 18.086 )
			if( k <= 1.94387 )
				if( k <= 0.759366 )
					if( d_k <= 9.3e-05 )
						if( smoothD_d <= -2.46257 )
							if( k <= 0.629728 )
								ret := -0.601660
							if( k > 0.629728 )
								ret := -0.819277 // sell
						if( smoothD_d > -2.46257 )
							if( smoothK_k <= -2.37712 )
								ret := -0.888889 // sell
							if( smoothK_k > -2.37712 )
								ret := 0.029412
					if( d_k > 9.3e-05 )
						if( k <= 0.275352 )
							if( rsi1 <= 22.9707 )
								ret := -0.549020
							if( rsi1 > 22.9707 )
								ret := -0.359963
						if( k > 0.275352 )
							if( smoothD_d <= -1.68866 )
								ret := -0.560976
							if( smoothD_d > -1.68866 )
								ret := -0.140811
				if( k > 0.759366 )
					if( d <= 2.28747 )
						if( d_k <= 0.910724 )
							if( smoothD_d <= -2.28471 )
								ret := -0.740291 // sell
							if( smoothD_d > -2.28471 )
								ret := -0.591530
						if( d_k > 0.910724 )
							if( smoothK_k <= -2.16299 )
								ret := -0.777778 // sell
							if( smoothK_k > -2.16299 )
								ret := 0.133333
					if( d > 2.28747 )
						if( k <= 1.62451 )
							if( smoothD_d <= 7.59164 )
								ret := -0.335417
							if( smoothD_d > 7.59164 )
								ret := -0.655367
						if( k > 1.62451 )
							if( smoothD_d <= 1.82045 )
								ret := -0.009091
							if( smoothD_d > 1.82045 )
								ret := -0.370130
			if( k > 1.94387 )
				if( smoothD_d <= 0.618115 )
					if( rsi1 <= 10.5483 )
						if( smoothD_d <= -1.31536 )
							if( rsi1 <= 7.07711 )
								ret := -0.666667
							if( rsi1 > 7.07711 )
								ret := -1.000000 // sell
						if( smoothD_d > -1.31536 )
							if( d <= 2.07627 )
								ret := -0.222222
							if( d > 2.07627 )
								ret := -0.864865 // sell
					if( rsi1 > 10.5483 )
						if( k <= 2.72052 )
							if( d_k <= 0.221341 )
								ret := -0.371765
							if( d_k > 0.221341 )
								ret := -0.074074
						if( k > 2.72052 )
							if( d_k <= -1.61852 )
								ret := -0.518001
							if( d_k > -1.61852 )
								ret := -0.403372
				if( smoothD_d > 0.618115 )
					if( smoothD_d <= 5.15841 )
						if( rsi1 <= 17.5188 )
							if( smoothK_k <= 3.80437 )
								ret := -0.515152
							if( smoothK_k > 3.80437 )
								ret := -0.819853 // sell
						if( rsi1 > 17.5188 )
							if( rsi1 <= 27.2503 )
								ret := -0.402542
							if( rsi1 > 27.2503 )
								ret := -0.262350
					if( smoothD_d > 5.15841 )
						if( rsi1 <= 28.0221 )
							if( rsi1 <= 13.3149 )
								ret := -0.846591 // sell
							if( rsi1 > 13.3149 )
								ret := -0.358732
						if( rsi1 > 28.0221 )
							if( smoothK_k <= 14.0944 )
								ret := -0.175744
							if( smoothK_k > 14.0944 )
								ret := -0.447863
		if( k > 18.086 )
			if( rsi1 <= 26.7484 )
				if( d_k <= 4.96775 )
					if( smoothK_k <= 34.9879 )
						if( rsi1 <= 17.1343 )
							if( d_k <= -9.62027 )
								ret := -0.826087 // sell
							if( d_k > -9.62027 )
								ret := -0.265432
						if( rsi1 > 17.1343 )
							if( smoothD_d <= 19.0817 )
								ret := -0.225376
							if( smoothD_d > 19.0817 )
								ret := -0.010799
					if( smoothK_k > 34.9879 )
						if( smoothD_d <= 34.5348 )
							if( d <= 25.0155 )
								ret := -0.181818
							if( d > 25.0155 )
								ret := -0.710938 // sell
						if( smoothD_d > 34.5348 )
							if( d_k <= 2.9241 )
								ret := -0.165794
							if( d_k > 2.9241 )
								ret := -0.642857
				if( d_k > 4.96775 )
					if( d <= 36.7742 )
						if( smoothK_k <= 17.5874 )
							if( d_k <= 12.4672 )
								ret := -0.250000
							if( d_k > 12.4672 )
								ret := -1.000000 // sell
						if( smoothK_k > 17.5874 )
							if( smoothK_k <= 18.8242 )
								ret := 0.823529 // buy
							if( smoothK_k > 18.8242 )
								ret := 0.069767
					if( d > 36.7742 )
						if( smoothD_d <= 84.5085 )
							if( smoothK_k <= 27.181 )
								ret := -0.342657
							if( smoothK_k > 27.181 )
								ret := -0.742347 // sell
						if( smoothD_d > 84.5085 )
							ret := 0.166667
			if( rsi1 > 26.7484 )
				if( smoothD_d <= 56.6543 )
					if( k <= 48.2403 )
						if( smoothD_d <= 45.6392 )
							if( d_k <= -16.5988 )
								ret := -0.507375
							if( d_k > -16.5988 )
								ret := -0.091037
						if( smoothD_d > 45.6392 )
							if( d_k <= 29.4516 )
								ret := -0.351744
							if( d_k > 29.4516 )
								ret := -0.707692 // sell
					if( k > 48.2403 )
						if( d <= 56.783 )
							if( d <= 54.3072 )
								ret := 0.051095
							if( d > 54.3072 )
								ret := 0.293948
						if( d > 56.783 )
							if( smoothK_k <= 69.7533 )
								ret := -0.300676
							if( smoothK_k > 69.7533 )
								ret := 0.208333
				if( smoothD_d > 56.6543 )
					if( d_k <= 0.340942 )
						if( k <= 99.6535 )
							if( k <= 94.5524 )
								ret := 0.127077
							if( k > 94.5524 )
								ret := -0.097804
						if( k > 99.6535 )
							if( smoothD_d <= 84.6869 )
								ret := 0.691489
							if( smoothD_d > 84.6869 )
								ret := 0.346614
					if( d_k > 0.340942 )
						if( k <= 51.2126 )
							if( d_k <= 22.5713 )
								ret := 0.297424
							if( d_k > 22.5713 )
								ret := -0.152493
						if( k > 51.2126 )
							if( d <= 91.262 )
								ret := -0.171875
							if( d > 91.262 )
								ret := 0.086168
	if( rsi1 > 45.5819 )
		if( rsi1 <= 69.9476 )
			if( smoothK_k <= 57.4624 )
				if( smoothD_d <= 13.9794 )
					if( d <= 5.76707 )
						if( rsi1 <= 47.2733 )
							if( k <= 11.1714 )
								ret := -0.485488
							if( k > 11.1714 )
								ret := 0.269231
						if( rsi1 > 47.2733 )
							if( k <= 2.68803 )
								ret := -0.077939
							if( k > 2.68803 )
								ret := -0.380435
					if( d > 5.76707 )
						if( k <= 27.3194 )
							if( smoothD_d <= 3.48244 )
								ret := 0.085938
							if( smoothD_d > 3.48244 )
								ret := -0.162437
						if( k > 27.3194 )
							if( smoothK_k <= 25.2018 )
								ret := 0.375000
							if( smoothK_k > 25.2018 )
								ret := -0.055814
				if( smoothD_d > 13.9794 )
					if( d_k <= 0.440196 )
						if( smoothK_k <= 39.2951 )
							if( rsi1 <= 63.904 )
								ret := 0.142513
							if( rsi1 > 63.904 )
								ret := 0.355072
						if( smoothK_k > 39.2951 )
							if( smoothD_d <= 29.764 )
								ret := -0.099668
							if( smoothD_d > 29.764 )
								ret := 0.120185
					if( d_k > 0.440196 )
						if( smoothK_k <= -0.666795 )
							if( d <= 20.235 )
								ret := -0.742857 // sell
							if( d > 20.235 )
								ret := -0.244444
						if( smoothK_k > -0.666795 )
							if( d_k <= 7.52966 )
								ret := 0.025589
							if( d_k > 7.52966 )
								ret := -0.055529
			if( smoothK_k > 57.4624 )
				if( smoothD_d <= 86.8495 )
					if( d <= 89.2102 )
						if( d_k <= -9.50668 )
							if( smoothK_k <= 96.4007 )
								ret := 0.197047
							if( smoothK_k > 96.4007 )
								ret := 0.483173
						if( d_k > -9.50668 )
							if( smoothD_d <= 51.6271 )
								ret := 0.565657
							if( smoothD_d > 51.6271 )
								ret := 0.108911
					if( d > 89.2102 )
						if( d_k <= -5.73771 )
							if( smoothK_k <= 94.3017 )
								ret := 0.600000
							if( smoothK_k > 94.3017 )
								ret := -0.061224
						if( d_k > -5.73771 )
							if( k <= 88.3326 )
								ret := 0.062745
							if( k > 88.3326 )
								ret := -0.291667
				if( smoothD_d > 86.8495 )
					if( d_k <= -5.98133 )
						if( rsi1 <= 52.0937 )
							if( rsi1 <= 50.4665 )
								ret := 0.410714
							if( rsi1 > 50.4665 )
								ret := -0.600000
						if( rsi1 > 52.0937 )
							if( rsi1 <= 59.5434 )
								ret := 0.805970 // buy
							if( rsi1 > 59.5434 )
								ret := 0.469208
					if( d_k > -5.98133 )
						if( d <= 95.8967 )
							if( rsi1 <= 68.5164 )
								ret := 0.221699
							if( rsi1 > 68.5164 )
								ret := -0.048780
						if( d > 95.8967 )
							if( smoothK_k <= 91.4881 )
								ret := 0.480882
							if( smoothK_k > 91.4881 )
								ret := 0.280941
		if( rsi1 > 69.9476 )
			if( d <= 92.068 )
				if( d_k <= -8.24395 )
					if( smoothD_d <= 31.6126 )
						if( smoothK_k <= 52.033 )
							if( d_k <= -14.7354 )
								ret := 0.434783
							if( d_k > -14.7354 )
								ret := 0.158940
						if( smoothK_k > 52.033 )
							if( rsi1 <= 89.0541 )
								ret := -0.617021
							if( rsi1 > 89.0541 )
								ret := 1.000000 // buy
					if( smoothD_d > 31.6126 )
						if( smoothD_d <= 83.2427 )
							if( k <= 91.9138 )
								ret := 0.483344
							if( k > 91.9138 )
								ret := 0.337517
						if( smoothD_d > 83.2427 )
							if( smoothD_d <= 88.6583 )
								ret := 0.667638
							if( smoothD_d > 88.6583 )
								ret := -0.285714
				if( d_k > -8.24395 )
					if( smoothD_d <= 42.3823 )
						if( d <= 37.4235 )
							if( smoothD_d <= 31.871 )
								ret := 0.079174
							if( smoothD_d > 31.871 )
								ret := 0.630952
						if( d > 37.4235 )
							if( d <= 40.1133 )
								ret := -0.433333
							if( d > 40.1133 )
								ret := -0.005556
					if( smoothD_d > 42.3823 )
						if( rsi1 <= 80.9402 )
							if( smoothK_k <= 61.6139 )
								ret := 0.342949
							if( smoothK_k > 61.6139 )
								ret := 0.143865
						if( rsi1 > 80.9402 )
							if( k <= 62.8428 )
								ret := 0.181818
							if( k > 62.8428 )
								ret := 0.497056
			if( d > 92.068 )
				if( smoothK_k <= 96.9028 )
					if( smoothD_d <= 96.8668 )
						if( smoothK_k <= 95.4442 )
							if( rsi1 <= 81.9694 )
								ret := 0.427097
							if( rsi1 > 81.9694 )
								ret := 0.620139
						if( smoothK_k > 95.4442 )
							if( d_k <= -5.10769 )
								ret := 0.797203 // buy
							if( d_k > -5.10769 )
								ret := 0.363571
					if( smoothD_d > 96.8668 )
						if( rsi1 <= 76.246 )
							if( k <= 99.8671 )
								ret := 0.714286 // buy
							if( k > 99.8671 )
								ret := 1.000000 // buy
						if( rsi1 > 76.246 )
							if( d <= 99.956 )
								ret := -0.049180
							if( d > 99.956 )
								ret := -1.000000 // sell
				if( smoothK_k > 96.9028 )
					if( rsi1 <= 86.8539 )
						if( d <= 99.3643 )
							if( rsi1 <= 80.7494 )
								ret := 0.508446
							if( rsi1 > 80.7494 )
								ret := 0.747934 // buy
						if( d > 99.3643 )
							if( smoothD_d <= 96.9999 )
								ret := 0.091241
							if( smoothD_d > 96.9999 )
								ret := 0.488706
					if( rsi1 > 86.8539 )
						if( smoothD_d <= 96.9777 )
							if( d_k <= -0.113524 )
								ret := 0.778409 // buy
							if( d_k > -0.113524 )
								ret := 0.219512
						if( smoothD_d > 96.9777 )
							if( smoothD_d <= 96.9943 )
								ret := 1.000000 // buy
							if( smoothD_d > 96.9943 )
								ret := 0.895480 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TRXUSDT_15Min_6c92f76c(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


