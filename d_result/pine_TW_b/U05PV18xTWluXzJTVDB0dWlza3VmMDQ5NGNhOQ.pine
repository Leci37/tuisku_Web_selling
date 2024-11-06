//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: SNOW_1Min_2ST0_f0494ca9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2ST0_f0494ca9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_f0494ca9(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema1 <= 109.875 )
		if( d_k <= -1.59596 )
			if( ema1 <= 109.06 )
				if( smoothD_d <= 86.1283 )
					if( ema12 <= -0.151147 )
						ret := -0.904762 // sell
					if( ema12 > -0.151147 )
						if( ema2 <= 107.981 )
							if( tema <= 107.784 )
								if( ema13 <= -0.134485 )
									ret := -0.250000
								if( ema13 > -0.134485 )
									ret := 0.105263
							if( tema > 107.784 )
								ret := 0.470588
						if( ema2 > 107.981 )
							if( ema12 <= -0.034191 )
								if( ema3 <= 108.578 )
									ret := -0.565217
								if( ema3 > 108.578 )
									ret := 0.049180
							if( ema12 > -0.034191 )
								if( ema13 <= -0.002552 )
									ret := -0.878788 // sell
								if( ema13 > -0.002552 )
									ret := -0.363636
				if( smoothD_d > 86.1283 )
					if( ema2 <= 108.446 )
						if( k <= 99.9523 )
							ret := 1.000000 // buy
						if( k > 99.9523 )
							ret := 0.444444
					if( ema2 > 108.446 )
						ret := 0.111111
			if( ema1 > 109.06 )
				if( ema3 <= 110.248 )
					if( smoothD_d <= 7.36991 )
						if( d <= 4.10056 )
							ret := 0.133333
						if( d > 4.10056 )
							if( d_k <= -4.78597 )
								if( ema12 <= -0.134707 )
									ret := -0.833333 // sell
								if( ema12 > -0.134707 )
									ret := 0.000000
							if( d_k > -4.78597 )
								ret := -0.714286 // sell
					if( smoothD_d > 7.36991 )
						if( rsi1 <= 75.26 )
							if( ema13 <= -0.485938 )
								ret := -0.692308
							if( ema13 > -0.485938 )
								if( ema1 <= 109.285 )
									ret := 0.413462
								if( ema1 > 109.285 )
									ret := 0.109589
						if( rsi1 > 75.26 )
							if( ema1 <= 109.76 )
								ret := -0.250000
							if( ema1 > 109.76 )
								ret := -0.866667 // sell
				if( ema3 > 110.248 )
					ret := 1.000000 // buy
		if( d_k > -1.59596 )
			if( ema3 <= 109.599 )
				if( d_k <= 21.9234 )
					if( k <= 89.7959 )
						if( ema12 <= 0.012881 )
							if( d <= 1.81761 )
								if( ema12 <= -0.088779 )
									ret := 0.250000
								if( ema12 > -0.088779 )
									ret := 0.787879 // buy
							if( d > 1.81761 )
								if( rsi1 <= 42.5196 )
									ret := 0.248980
								if( rsi1 > 42.5196 )
									ret := -0.190789
						if( ema12 > 0.012881 )
							if( d <= 84.5503 )
								if( ema3 <= 109.277 )
									ret := 0.845238 // buy
								if( ema3 > 109.277 )
									ret := 0.296875
							if( d > 84.5503 )
								if( tema <= 109.407 )
									ret := 0.333333
								if( tema > 109.407 )
									ret := -0.115385
					if( k > 89.7959 )
						if( smoothK_k <= 93.117 )
							if( d <= 95.6273 )
								if( ema3 <= 108.94 )
									ret := 0.984615 // buy
								if( ema3 > 108.94 )
									ret := 0.375000
							if( d > 95.6273 )
								if( smoothD_d <= 94.2227 )
									ret := -0.375000
								if( smoothD_d > 94.2227 )
									ret := 0.500000
						if( smoothK_k > 93.117 )
							if( smoothD_d <= 94.6884 )
								ret := -0.125000
							if( smoothD_d > 94.6884 )
								if( d <= 99.499 )
									ret := 0.708333 // buy
								if( d > 99.499 )
									ret := 0.133333
				if( d_k > 21.9234 )
					if( k <= 31.4594 )
						if( ema13 <= 0.062647 )
							ret := -0.454545
						if( ema13 > 0.062647 )
							ret := 0.250000
					if( k > 31.4594 )
						if( ema1 <= 109.309 )
							ret := -0.454545
						if( ema1 > 109.309 )
							ret := -1.000000 // sell
			if( ema3 > 109.599 )
				if( d <= 4.81722 )
					if( ema1 <= 109.518 )
						ret := 0.272727
					if( ema1 > 109.518 )
						if( tema <= 109.43 )
							ret := 1.000000 // buy
						if( tema > 109.43 )
							ret := 0.705882 // buy
				if( d > 4.81722 )
					if( smoothK_k <= -0.522059 )
						if( ema1 <= 109.612 )
							ret := 0.000000
						if( ema1 > 109.612 )
							ret := -0.454545
					if( smoothK_k > -0.522059 )
						if( smoothD_d <= 84.9216 )
							if( ema13 <= -0.031408 )
								if( d_k <= -0.211936 )
									ret := 0.142857
								if( d_k > -0.211936 )
									ret := 0.654028
							if( ema13 > -0.031408 )
								if( ema13 <= 0.13535 )
									ret := 0.228261
								if( ema13 > 0.13535 )
									ret := 0.846154 // buy
						if( smoothD_d > 84.9216 )
							if( ema13 <= 0.006334 )
								if( d_k <= 1.09261 )
									ret := 0.538462
								if( d_k > 1.09261 )
									ret := 0.200000
							if( ema13 > 0.006334 )
								if( ema1 <= 109.83 )
									ret := -0.333333
								if( ema1 > 109.83 )
									ret := 0.142857
	if( ema1 > 109.875 )
		if( ema3 <= 170.478 )
			if( ema12 <= 0.007378 )
				if( ema3 <= 135.013 )
					if( d_k <= -7.32762 )
						if( tema <= 131.53 )
							if( smoothK_k <= 15.7314 )
								if( k <= 16.9233 )
									ret := -0.161290
								if( k > 16.9233 )
									ret := -0.531429
							if( smoothK_k > 15.7314 )
								if( ema12 <= -0.32388 )
									ret := 0.239766
								if( ema12 > -0.32388 )
									ret := -0.057812
						if( tema > 131.53 )
							if( ema13 <= -0.739167 )
								if( d <= 61.3696 )
									ret := -1.000000 // sell
								if( d > 61.3696 )
									ret := -0.500000
							if( ema13 > -0.739167 )
								if( ema13 <= -0.017724 )
									ret := 0.231839
								if( ema13 > -0.017724 )
									ret := -0.035294
					if( d_k > -7.32762 )
						if( d <= 93.4097 )
							if( d <= 61.2413 )
								if( ema2 <= 129.592 )
									ret := 0.081172
								if( ema2 > 129.592 )
									ret := -0.056108
							if( d > 61.2413 )
								if( rsi1 <= 49.6494 )
									ret := 0.168127
								if( rsi1 > 49.6494 )
									ret := 0.056818
						if( d > 93.4097 )
							if( d_k <= -3.26031 )
								if( smoothK_k <= 96.6 )
									ret := -0.693333
								if( smoothK_k > 96.6 )
									ret := -0.169014
							if( d_k > -3.26031 )
								if( smoothK_k <= 96.5687 )
									ret := -0.104418
								if( smoothK_k > 96.5687 )
									ret := 0.253886
				if( ema3 > 135.013 )
					if( smoothD_d <= -0.266 )
						if( tema <= 148.437 )
							if( ema1 <= 144.786 )
								if( ema13 <= 0.002927 )
									ret := -0.341014
								if( ema13 > 0.002927 )
									ret := 0.727273 // buy
							if( ema1 > 144.786 )
								if( smoothD_d <= -1.38235 )
									ret := 0.696721
								if( smoothD_d > -1.38235 )
									ret := -0.333333
						if( tema > 148.437 )
							if( smoothK_k <= 0.587368 )
								if( tema <= 161.24 )
									ret := -0.379121
								if( tema > 161.24 )
									ret := -0.142857
							if( smoothK_k > 0.587368 )
								if( k <= 4.67575 )
									ret := 0.222222
								if( k > 4.67575 )
									ret := -0.235294
					if( smoothD_d > -0.266 )
						if( ema1 <= 149.04 )
							if( d <= 97.1277 )
								if( smoothK_k <= 69.5206 )
									ret := -0.044818
								if( smoothK_k > 69.5206 )
									ret := -0.250817
							if( d > 97.1277 )
								if( tema <= 135.2 )
									ret := -0.222222
								if( tema > 135.2 )
									ret := 0.567901
						if( ema1 > 149.04 )
							if( d_k <= 9.1726 )
								if( k <= 90.9807 )
									ret := 0.030532
								if( k > 90.9807 )
									ret := -0.162427
							if( d_k > 9.1726 )
								if( ema2 <= 165.495 )
									ret := 0.178890
								if( ema2 > 165.495 )
									ret := 0.818182 // buy
			if( ema12 > 0.007378 )
				if( d <= 70.3808 )
					if( smoothD_d <= 0.652976 )
						if( ema13 <= 0.261313 )
							if( k <= 7.18303 )
								if( smoothK_k <= -2.07849 )
									ret := 0.178261
								if( smoothK_k > -2.07849 )
									ret := -0.139098
							if( k > 7.18303 )
								if( d_k <= -5.82772 )
									ret := 0.090909
								if( d_k > -5.82772 )
									ret := 0.708333 // buy
						if( ema13 > 0.261313 )
							if( ema3 <= 136.789 )
								if( smoothD_d <= 0.056564 )
									ret := 0.821429 // buy
								if( smoothD_d > 0.056564 )
									ret := 0.266667
							if( ema3 > 136.789 )
								if( smoothD_d <= -0.470573 )
									ret := -0.238095
								if( smoothD_d > -0.470573 )
									ret := 0.500000
					if( smoothD_d > 0.652976 )
						if( ema2 <= 130.558 )
							if( ema13 <= 0.104065 )
								if( smoothK_k <= 82.4091 )
									ret := -0.112657
								if( smoothK_k > 82.4091 )
									ret := 0.232000
							if( ema13 > 0.104065 )
								if( ema12 <= 0.478268 )
									ret := 0.015273
								if( ema12 > 0.478268 )
									ret := -0.909091 // sell
						if( ema2 > 130.558 )
							if( smoothD_d <= 62.6227 )
								if( d_k <= -30.1092 )
									ret := -0.789474 // sell
								if( d_k > -30.1092 )
									ret := -0.083804
							if( smoothD_d > 62.6227 )
								if( ema2 <= 158.056 )
									ret := -0.174037
								if( ema2 > 158.056 )
									ret := -0.561497
				if( d > 70.3808 )
					if( ema1 <= 163.86 )
						if( k <= 65.2778 )
							if( tema <= 118.988 )
								if( smoothK_k <= 58.752 )
									ret := -0.412935
								if( smoothK_k > 58.752 )
									ret := 0.139130
							if( tema > 118.988 )
								if( rsi1 <= 67.7274 )
									ret := 0.304762
								if( rsi1 > 67.7274 )
									ret := -0.105263
						if( k > 65.2778 )
							if( d_k <= -17.7652 )
								if( d <= 76.9933 )
									ret := 0.449838
								if( d > 76.9933 )
									ret := 0.008130
							if( d_k > -17.7652 )
								if( ema2 <= 163.636 )
									ret := -0.016375
								if( ema2 > 163.636 )
									ret := 0.718750 // buy
					if( ema1 > 163.86 )
						if( ema12 <= 0.224369 )
							if( smoothD_d <= 94.0744 )
								if( k <= 58.9449 )
									ret := -0.750000 // sell
								if( k > 58.9449 )
									ret := 0.032374
							if( smoothD_d > 94.0744 )
								if( tema <= 164.353 )
									ret := -1.000000 // sell
								if( tema > 164.353 )
									ret := -0.342105
						if( ema12 > 0.224369 )
							if( smoothK_k <= 83.6555 )
								if( smoothD_d <= 84.2981 )
									ret := -0.870968 // sell
								if( smoothD_d > 84.2981 )
									ret := 0.500000
							if( smoothK_k > 83.6555 )
								if( ema13 <= 0.396184 )
									ret := -0.714286 // sell
								if( ema13 > 0.396184 )
									ret := -0.981132 // sell
		if( ema3 > 170.478 )
			if( ema12 <= -0.824993 )
				ret := 1.000000 // buy
			if( ema12 > -0.824993 )
				if( ema12 <= 0.149791 )
					if( rsi1 <= 49.5996 )
						if( ema3 <= 171.055 )
							if( d_k <= 10.191 )
								if( ema12 <= -0.284134 )
									ret := 0.000000
								if( ema12 > -0.284134 )
									ret := -0.652174
							if( d_k > 10.191 )
								ret := 0.250000
						if( ema3 > 171.055 )
							if( k <= 5.51998 )
								ret := -0.384615
							if( k > 5.51998 )
								if( d_k <= -6.54221 )
									ret := -0.500000
								if( d_k > -6.54221 )
									ret := -0.925926 // sell
					if( rsi1 > 49.5996 )
						if( d_k <= 2.93578 )
							if( tema <= 171.166 )
								ret := 0.533333
							if( tema > 171.166 )
								ret := 1.000000 // buy
						if( d_k > 2.93578 )
							ret := -0.461538
				if( ema12 > 0.149791 )
					if( smoothK_k <= 25.556 )
						ret := -0.461538
					if( smoothK_k > 25.556 )
						if( ema12 <= 0.269107 )
							if( smoothK_k <= 46.5905 )
								ret := -0.888889 // sell
							if( smoothK_k > 46.5905 )
								ret := -1.000000 // sell
						if( ema12 > 0.269107 )
							ret := -0.777778 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_f0494ca9(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


