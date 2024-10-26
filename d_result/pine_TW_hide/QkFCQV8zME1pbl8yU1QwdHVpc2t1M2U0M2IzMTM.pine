//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: BABA_30Min_2ST0_3e43b313 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_2ST0_3e43b313", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_3e43b313(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothK_k <= 24.9714 )
		if( ema3 <= 72.3898 )
			if( ema3 <= 61.9516 )
				if( d <= 6.47629 )
					ret := 0.600000
				if( d > 6.47629 )
					if( d_k <= 11.9462 )
						ret := 1.000000 // buy
					if( d_k > 11.9462 )
						ret := 0.909091 // buy
			if( ema3 > 61.9516 )
				if( ema13 <= 0.336586 )
					if( tema <= 70.0496 )
						if( smoothD_d <= 7.57494 )
							if( ema2 <= 66.6131 )
								if( d <= 7.0481 )
									ret := 0.687500
								if( d > 7.0481 )
									ret := -0.333333
							if( ema2 > 66.6131 )
								if( rsi1 <= 24.6675 )
									ret := -0.504762
								if( rsi1 > 24.6675 )
									ret := -0.071429
						if( smoothD_d > 7.57494 )
							if( rsi1 <= 34.1185 )
								if( ema12 <= -0.414379 )
									ret := 0.318841
								if( ema12 > -0.414379 )
									ret := 0.648000
							if( rsi1 > 34.1185 )
								if( d_k <= 11.3933 )
									ret := -0.384615
								if( d_k > 11.3933 )
									ret := 0.464646
					if( tema > 70.0496 )
						if( d <= 26.9502 )
							if( smoothK_k <= 15.4757 )
								if( d <= 24.3602 )
									ret := 0.384840
								if( d > 24.3602 )
									ret := -0.600000
							if( smoothK_k > 15.4757 )
								if( ema2 <= 71.869 )
									ret := 0.733333 // buy
								if( ema2 > 71.869 )
									ret := 0.925000 // buy
						if( d > 26.9502 )
							if( ema12 <= 0.059903 )
								if( smoothD_d <= 37.1649 )
									ret := -0.325000
								if( smoothD_d > 37.1649 )
									ret := 0.153846
							if( ema12 > 0.059903 )
								ret := 0.789474 // buy
				if( ema13 > 0.336586 )
					if( ema2 <= 68.3481 )
						if( ema13 <= 0.632092 )
							if( ema3 <= 66.793 )
								ret := -1.000000 // sell
							if( ema3 > 66.793 )
								ret := -0.888889 // sell
						if( ema13 > 0.632092 )
							ret := -0.636364
					if( ema2 > 68.3481 )
						if( k <= 22.519 )
							if( k <= 18.0882 )
								if( ema2 <= 70.37 )
									ret := -0.647059
								if( ema2 > 70.37 )
									ret := 0.259259
							if( k > 18.0882 )
								if( tema <= 69.9153 )
									ret := 0.100000
								if( tema > 69.9153 )
									ret := 0.857143 // buy
						if( k > 22.519 )
							ret := -0.916667 // sell
		if( ema3 > 72.3898 )
			if( d <= 13.2627 )
				if( d <= 0.951267 )
					if( ema1 <= 275.402 )
						if( ema13 <= -8.72819 )
							ret := -1.000000 // sell
						if( ema13 > -8.72819 )
							if( tema <= 138.692 )
								if( rsi1 <= 24.1353 )
									ret := -0.027444
								if( rsi1 > 24.1353 )
									ret := 0.208020
							if( tema > 138.692 )
								if( tema <= 172.859 )
									ret := 0.445230
								if( tema > 172.859 )
									ret := 0.092473
					if( ema1 > 275.402 )
						if( tema <= 285.802 )
							if( ema2 <= 279.984 )
								ret := 0.750000 // buy
							if( ema2 > 279.984 )
								ret := 1.000000 // buy
						if( tema > 285.802 )
							ret := 0.454545
				if( d > 0.951267 )
					if( ema2 <= 72.7164 )
						if( k <= 7.62053 )
							if( ema3 <= 72.6969 )
								if( d_k <= -1.08275 )
									ret := -0.583333
								if( d_k > -1.08275 )
									ret := -0.854167 // sell
							if( ema3 > 72.6969 )
								if( ema3 <= 72.7923 )
									ret := 0.166667
								if( ema3 > 72.7923 )
									ret := -0.437500
						if( k > 7.62053 )
							ret := 0.133333
					if( ema2 > 72.7164 )
						if( ema13 <= -9.54379 )
							if( ema3 <= 251.071 )
								ret := -1.000000 // sell
							if( ema3 > 251.071 )
								ret := -0.454545
						if( ema13 > -9.54379 )
							if( ema3 <= 315.975 )
								if( ema13 <= 2.57641 )
									ret := -0.020319
								if( ema13 > 2.57641 )
									ret := 0.534884
							if( ema3 > 315.975 )
								ret := -1.000000 // sell
			if( d > 13.2627 )
				if( ema3 <= 222.975 )
					if( ema13 <= -2.5221 )
						if( rsi1 <= 26.1519 )
							if( rsi1 <= 15.9071 )
								if( ema12 <= -1.39383 )
									ret := 0.357143
								if( ema12 > -1.39383 )
									ret := -0.428571
							if( rsi1 > 15.9071 )
								if( ema1 <= 117.141 )
									ret := 0.973684 // buy
								if( ema1 > 117.141 )
									ret := 0.786408 // buy
						if( rsi1 > 26.1519 )
							if( rsi1 <= 27.514 )
								ret := 0.071429
							if( rsi1 > 27.514 )
								if( ema3 <= 184.845 )
									ret := -0.272727
								if( ema3 > 184.845 )
									ret := -0.750000 // sell
					if( ema13 > -2.5221 )
						if( ema13 <= 2.56422 )
							if( ema1 <= 77.8311 )
								if( ema3 <= 77.3495 )
									ret := 0.116751
								if( ema3 > 77.3495 )
									ret := 0.576642
							if( ema1 > 77.8311 )
								if( d_k <= 28.1897 )
									ret := 0.025428
								if( d_k > 28.1897 )
									ret := 0.279070
						if( ema13 > 2.56422 )
							if( d_k <= 21.1225 )
								if( ema1 <= 95.9909 )
									ret := 1.000000 // buy
								if( ema1 > 95.9909 )
									ret := 0.645833
							if( d_k > 21.1225 )
								ret := -0.105263
				if( ema3 > 222.975 )
					if( tema <= 221.248 )
						ret := 1.000000 // buy
					if( tema > 221.248 )
						if( ema13 <= -5.17981 )
							if( ema1 <= 293.1 )
								ret := -0.636364
							if( ema1 > 293.1 )
								ret := -1.000000 // sell
						if( ema13 > -5.17981 )
							if( ema12 <= 0.903774 )
								if( ema12 <= -1.66997 )
									ret := 0.444444
								if( ema12 > -1.66997 )
									ret := 0.136976
							if( ema12 > 0.903774 )
								if( ema13 <= 2.22333 )
									ret := 0.952381 // buy
								if( ema13 > 2.22333 )
									ret := 0.430000
	if( smoothK_k > 24.9714 )
		if( ema3 <= 308.245 )
			if( ema1 <= 280.072 )
				if( smoothD_d <= 92.9466 )
					if( rsi1 <= 83.4756 )
						if( ema3 <= 272.743 )
							if( d_k <= -28.3412 )
								if( k <= 57.1021 )
									ret := 0.909091 // buy
								if( k > 57.1021 )
									ret := -0.247387
							if( d_k > -28.3412 )
								if( tema <= 77.8739 )
									ret := 0.050129
								if( tema > 77.8739 )
									ret := -0.016611
						if( ema3 > 272.743 )
							if( d <= 18.0656 )
								ret := 0.375000
							if( d > 18.0656 )
								if( rsi1 <= 78.6163 )
									ret := -0.384906
								if( rsi1 > 78.6163 )
									ret := 0.466667
					if( rsi1 > 83.4756 )
						if( d <= 95.4064 )
							if( smoothD_d <= 91.5936 )
								if( d <= 91.7319 )
									ret := 0.167003
								if( d > 91.7319 )
									ret := -0.058376
							if( smoothD_d > 91.5936 )
								if( k <= 98.6094 )
									ret := 0.297297
								if( k > 98.6094 )
									ret := 0.647059
						if( d > 95.4064 )
							if( ema3 <= 216.339 )
								if( ema1 <= 114.495 )
									ret := 0.095238
								if( ema1 > 114.495 )
									ret := -0.295455
							if( ema3 > 216.339 )
								ret := -0.857143 // sell
				if( smoothD_d > 92.9466 )
					if( tema <= 229.042 )
						if( tema <= 109.785 )
							if( rsi1 <= 83.492 )
								if( smoothD_d <= 93.925 )
									ret := -0.236742
								if( smoothD_d > 93.925 )
									ret := -0.006399
							if( rsi1 > 83.492 )
								if( ema13 <= 2.33038 )
									ret := 0.261644
								if( ema13 > 2.33038 )
									ret := -0.114504
						if( tema > 109.785 )
							if( ema1 <= 138.437 )
								if( k <= 94.0065 )
									ret := 0.222222
								if( k > 94.0065 )
									ret := -0.463268
							if( ema1 > 138.437 )
								if( rsi1 <= 98.4987 )
									ret := -0.063207
								if( rsi1 > 98.4987 )
									ret := 0.814815 // buy
					if( tema > 229.042 )
						if( smoothD_d <= 95.4744 )
							if( tema <= 234.088 )
								if( ema3 <= 228.671 )
									ret := -0.642857
								if( ema3 > 228.671 )
									ret := -0.916667 // sell
							if( tema > 234.088 )
								if( ema3 <= 254.052 )
									ret := 0.130435
								if( ema3 > 254.052 )
									ret := -0.480447
						if( smoothD_d > 95.4744 )
							if( rsi1 <= 66.8507 )
								if( d <= 98.9762 )
									ret := -0.777778 // sell
								if( d > 98.9762 )
									ret := 0.214286
							if( rsi1 > 66.8507 )
								if( ema12 <= 1.30028 )
									ret := -0.783784 // sell
								if( ema12 > 1.30028 )
									ret := -0.428571
			if( ema1 > 280.072 )
				if( ema1 <= 289.553 )
					if( d_k <= -0.547839 )
						if( k <= 77.309 )
							if( k <= 31.4944 )
								ret := -0.333333
							if( k > 31.4944 )
								if( ema12 <= 1.46143 )
									ret := 0.514706
								if( ema12 > 1.46143 )
									ret := -0.125000
						if( k > 77.309 )
							if( smoothK_k <= 79.148 )
								ret := -0.900000 // sell
							if( smoothK_k > 79.148 )
								if( smoothD_d <= 86.1805 )
									ret := 0.000000
								if( smoothD_d > 86.1805 )
									ret := -0.500000
					if( d_k > -0.547839 )
						if( k <= 60.1834 )
							if( ema13 <= 1.58014 )
								ret := 0.894737 // buy
							if( ema13 > 1.58014 )
								ret := 0.200000
						if( k > 60.1834 )
							if( d_k <= 4.70965 )
								if( d_k <= 1.30251 )
									ret := 0.937500 // buy
								if( d_k > 1.30251 )
									ret := 0.580000
							if( d_k > 4.70965 )
								if( ema2 <= 284.115 )
									ret := 1.000000 // buy
								if( ema2 > 284.115 )
									ret := 0.903226 // buy
				if( ema1 > 289.553 )
					if( tema <= 292.383 )
						if( k <= 60.5612 )
							if( ema2 <= 289.733 )
								ret := 0.700000 // buy
							if( ema2 > 289.733 )
								ret := -0.857143 // sell
						if( k > 60.5612 )
							if( rsi1 <= 57.0203 )
								ret := 0.153846
							if( rsi1 > 57.0203 )
								if( tema <= 291.285 )
									ret := -1.000000 // sell
								if( tema > 291.285 )
									ret := -0.742857 // sell
					if( tema > 292.383 )
						if( tema <= 309.177 )
							if( smoothD_d <= 92.4425 )
								if( ema3 <= 304.843 )
									ret := 0.025126
								if( ema3 > 304.843 )
									ret := 0.439655
							if( smoothD_d > 92.4425 )
								if( ema1 <= 295.815 )
									ret := 1.000000 // buy
								if( ema1 > 295.815 )
									ret := 0.400000
						if( tema > 309.177 )
							if( k <= 92.0125 )
								if( ema2 <= 307.285 )
									ret := -0.750000 // sell
								if( ema2 > 307.285 )
									ret := -0.157895
							if( k > 92.0125 )
								ret := -1.000000 // sell
		if( ema3 > 308.245 )
			if( k <= 90.9505 )
				if( ema13 <= 0.553557 )
					if( d_k <= -7.00814 )
						if( smoothK_k <= 62.4055 )
							if( ema13 <= -0.867291 )
								ret := -0.333333
							if( ema13 > -0.867291 )
								ret := -0.769231 // sell
						if( smoothK_k > 62.4055 )
							ret := -1.000000 // sell
					if( d_k > -7.00814 )
						if( rsi1 <= 49.9396 )
							if( k <= 49.5734 )
								ret := 0.090909
							if( k > 49.5734 )
								ret := -0.700000 // sell
						if( rsi1 > 49.9396 )
							ret := 0.421053
				if( ema13 > 0.553557 )
					if( smoothK_k <= 49.4535 )
						if( tema <= 311.961 )
							ret := -1.000000 // sell
						if( tema > 311.961 )
							ret := -0.846154 // sell
					if( smoothK_k > 49.4535 )
						if( rsi1 <= 57.3769 )
							ret := -1.000000 // sell
						if( rsi1 > 57.3769 )
							if( smoothD_d <= 62.1456 )
								ret := -0.250000
							if( smoothD_d > 62.1456 )
								if( tema <= 310.922 )
									ret := -0.909091 // sell
								if( tema > 310.922 )
									ret := -0.500000
			if( k > 90.9505 )
				if( rsi1 <= 84.1345 )
					if( ema3 <= 309.389 )
						ret := 0.214286
					if( ema3 > 309.389 )
						ret := 0.615385
				if( rsi1 > 84.1345 )
					ret := -0.928571 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BABA_30Min_3e43b313(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


