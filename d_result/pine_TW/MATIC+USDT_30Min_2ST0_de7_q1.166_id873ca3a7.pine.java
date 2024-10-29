//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MATICUSDT_30Min_2ST0_873ca3a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2ST0_873ca3a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_873ca3a7(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 52.8493 )
		if( ema12 <= 0.000167 )
			if( rsi1 <= 36.4375 )
				if( ema2 <= 0.122007 )
					if( d_k <= -0.35755 )
						if( ema13 <= -0.00173 )
							if( ema3 <= 0.043354 )
								ret := -0.500000
							if( ema3 > 0.043354 )
								ret := 0.452055
						if( ema13 > -0.00173 )
							if( ema1 <= 0.050901 )
								ret := -0.028213
							if( ema1 > 0.050901 )
								ret := -0.872340 // sell
					if( d_k > -0.35755 )
						if( rsi1 <= 8.90301 )
							if( tema <= 0.019944 )
								ret := -0.500000
							if( tema > 0.019944 )
								ret := -1.000000 // sell
						if( rsi1 > 8.90301 )
							if( smoothK_k <= -2.39018 )
								ret := 0.667969
							if( smoothK_k > -2.39018 )
								ret := 0.274390
				if( ema2 > 0.122007 )
					if( d_k <= -1.52954 )
						if( ema12 <= -0.009608 )
							if( d <= 5.65322 )
								ret := -0.488599
							if( d > 5.65322 )
								ret := 0.187228
						if( ema12 > -0.009608 )
							if( smoothD_d <= 6.65028 )
								ret := -0.599872
							if( smoothD_d > 6.65028 )
								ret := -0.352866
					if( d_k > -1.52954 )
						if( ema1 <= 0.921846 )
							if( rsi1 <= 29.4263 )
								ret := -0.677419
							if( rsi1 > 29.4263 )
								ret := -0.356204
						if( ema1 > 0.921846 )
							if( rsi1 <= 28.2742 )
								ret := -0.807643 // sell
							if( rsi1 > 28.2742 )
								ret := -0.611318
			if( rsi1 > 36.4375 )
				if( rsi1 <= 46.0174 )
					if( d_k <= -6.54402 )
						if( ema12 <= -0.005798 )
							if( ema13 <= -0.025343 )
								ret := 0.756281 // buy
							if( ema13 > -0.025343 )
								ret := 0.557772
						if( ema12 > -0.005798 )
							if( ema2 <= 0.561284 )
								ret := 0.202137
							if( ema2 > 0.561284 )
								ret := -0.144772
					if( d_k > -6.54402 )
						if( ema12 <= -0.003997 )
							if( d <= 31.802 )
								ret := 0.363716
							if( d > 31.802 )
								ret := -0.056678
						if( ema12 > -0.003997 )
							if( tema <= 0.31799 )
								ret := 0.138889
							if( tema > 0.31799 )
								ret := -0.264950
				if( rsi1 > 46.0174 )
					if( ema13 <= -0.010413 )
						if( ema12 <= -0.004737 )
							if( d_k <= -10.9061 )
								ret := 0.808803 // buy
							if( d_k > -10.9061 )
								ret := 0.555430
						if( ema12 > -0.004737 )
							if( ema12 <= -0.00349 )
								ret := 0.108108
							if( ema12 > -0.00349 )
								ret := -0.471264
					if( ema13 > -0.010413 )
						if( ema12 <= -0.002041 )
							if( smoothD_d <= 56.6278 )
								ret := 0.599681
							if( smoothD_d > 56.6278 )
								ret := 0.358770
						if( ema12 > -0.002041 )
							if( smoothD_d <= 70.8557 )
								ret := 0.193120
							if( smoothD_d > 70.8557 )
								ret := -0.064852
		if( ema12 > 0.000167 )
			if( tema <= 0.905897 )
				if( ema12 <= 0.002977 )
					if( ema1 <= 0.499507 )
						if( ema12 <= 0.000493 )
							if( ema13 <= 0.003978 )
								ret := -0.496659
							if( ema13 > 0.003978 )
								ret := 0.777778 // buy
						if( ema12 > 0.000493 )
							if( rsi1 <= 47.5144 )
								ret := -0.801272 // sell
							if( rsi1 > 47.5144 )
								ret := -0.539595
					if( ema1 > 0.499507 )
						if( smoothK_k <= -1.44483 )
							if( rsi1 <= 39.5166 )
								ret := -0.721133 // sell
							if( rsi1 > 39.5166 )
								ret := -0.057554
						if( smoothK_k > -1.44483 )
							if( rsi1 <= 46.112 )
								ret := -0.581649
							if( rsi1 > 46.112 )
								ret := -0.144437
				if( ema12 > 0.002977 )
					if( d_k <= 4.31511 )
						if( rsi1 <= 45.2023 )
							if( ema1 <= 0.876221 )
								ret := -0.833333 // sell
							if( ema1 > 0.876221 )
								ret := -0.529412
						if( rsi1 > 45.2023 )
							if( ema2 <= 0.867096 )
								ret := -0.581267
							if( ema2 > 0.867096 )
								ret := 0.000000
					if( d_k > 4.31511 )
						if( ema13 <= 0.00138 )
							ret := 0.285714
						if( ema13 > 0.00138 )
							if( rsi1 <= 50.515 )
								ret := -0.827489 // sell
							if( rsi1 > 50.515 )
								ret := -0.690647
			if( tema > 0.905897 )
				if( ema12 <= 0.005211 )
					if( ema12 <= 0.002203 )
						if( rsi1 <= 47.0956 )
							if( smoothD_d <= 20.1774 )
								ret := -0.564677
							if( smoothD_d > 20.1774 )
								ret := -0.731324 // sell
						if( rsi1 > 47.0956 )
							if( smoothD_d <= 55.1644 )
								ret := -0.017241
							if( smoothD_d > 55.1644 )
								ret := -0.371930
					if( ema12 > 0.002203 )
						if( rsi1 <= 41.6665 )
							if( ema13 <= 0.024172 )
								ret := -0.897328 // sell
							if( ema13 > 0.024172 )
								ret := 0.000000
						if( rsi1 > 41.6665 )
							if( d <= 16.5421 )
								ret := -0.250000
							if( d > 16.5421 )
								ret := -0.632139
				if( ema12 > 0.005211 )
					if( smoothD_d <= 13.6072 )
						if( rsi1 <= 50.0636 )
							if( smoothK_k <= 0.646701 )
								ret := -0.824691 // sell
							if( smoothK_k > 0.646701 )
								ret := -0.585253
						if( rsi1 > 50.0636 )
							if( d_k <= 1.5137 )
								ret := 0.028169
							if( d_k > 1.5137 )
								ret := -0.602410
					if( smoothD_d > 13.6072 )
						if( ema12 <= 0.012572 )
							if( rsi1 <= 48.7614 )
								ret := -0.903522 // sell
							if( rsi1 > 48.7614 )
								ret := -0.781780 // sell
						if( ema12 > 0.012572 )
							if( ema13 <= 0.081745 )
								ret := -0.958449 // sell
							if( ema13 > 0.081745 )
								ret := -0.500000
	if( rsi1 > 52.8493 )
		if( smoothK_k <= 86.977 )
			if( ema13 <= -0.000182 )
				if( ema13 <= -0.003412 )
					if( ema12 <= -0.001591 )
						if( d_k <= -5.65747 )
							if( ema12 <= -0.006272 )
								ret := 0.947826 // buy
							if( ema12 > -0.006272 )
								ret := 0.808094 // buy
						if( d_k > -5.65747 )
							if( ema13 <= -0.025853 )
								ret := -0.571429
							if( ema13 > -0.025853 )
								ret := 0.725728 // buy
					if( ema12 > -0.001591 )
						if( k <= 85.1792 )
							if( ema12 <= 0.000191 )
								ret := 0.285714
							if( ema12 > 0.000191 )
								ret := -0.782609 // sell
						if( k > 85.1792 )
							if( ema13 <= -0.01307 )
								ret := -0.666667
							if( ema13 > -0.01307 )
								ret := 0.576271
				if( ema13 > -0.003412 )
					if( ema12 <= -0.000641 )
						if( rsi1 <= 59.532 )
							if( ema1 <= 0.492743 )
								ret := 0.841727 // buy
							if( ema1 > 0.492743 )
								ret := 0.525424
						if( rsi1 > 59.532 )
							if( ema12 <= -0.001504 )
								ret := 0.932039 // buy
							if( ema12 > -0.001504 )
								ret := 0.762215 // buy
					if( ema12 > -0.000641 )
						if( rsi1 <= 54.3499 )
							if( ema13 <= -0.00136 )
								ret := -0.433333
							if( ema13 > -0.00136 )
								ret := 0.074324
						if( rsi1 > 54.3499 )
							if( ema3 <= 0.069829 )
								ret := -0.384615
							if( ema3 > 0.069829 )
								ret := 0.422964
			if( ema13 > -0.000182 )
				if( d_k <= 1.20393 )
					if( ema2 <= 0.055313 )
						if( ema13 <= 0.000217 )
							if( rsi1 <= 61.8846 )
								ret := 0.149789
							if( rsi1 > 61.8846 )
								ret := -0.237705
						if( ema13 > 0.000217 )
							if( d <= 30.7144 )
								ret := -0.105263
							if( d > 30.7144 )
								ret := -0.431933
					if( ema2 > 0.055313 )
						if( rsi1 <= 63.6323 )
							if( ema12 <= 0.002979 )
								ret := 0.409305
							if( ema12 > 0.002979 )
								ret := 0.053654
						if( rsi1 > 63.6323 )
							if( ema3 <= 0.893402 )
								ret := 0.460284
							if( ema3 > 0.893402 )
								ret := 0.667807
				if( d_k > 1.20393 )
					if( ema13 <= 0.012742 )
						if( ema12 <= 0.004483 )
							if( ema1 <= 0.414387 )
								ret := 0.041269
							if( ema1 > 0.414387 )
								ret := 0.225967
						if( ema12 > 0.004483 )
							if( rsi1 <= 63.2608 )
								ret := -0.461464
							if( rsi1 > 63.2608 )
								ret := 0.183021
					if( ema13 > 0.012742 )
						if( ema12 <= 0.014359 )
							if( d_k <= 18.272 )
								ret := -0.023749
							if( d_k > 18.272 )
								ret := -0.453191
						if( ema12 > 0.014359 )
							if( d_k <= 9.22203 )
								ret := -0.242546
							if( d_k > 9.22203 )
								ret := -0.622537
		if( smoothK_k > 86.977 )
			if( ema2 <= 0.119071 )
				if( ema12 <= 4.4e-05 )
					if( tema <= 0.021825 )
						if( smoothD_d <= 84.3841 )
							if( d_k <= -7.1937 )
								ret := 0.030303
							if( d_k > -7.1937 )
								ret := 0.900000 // buy
						if( smoothD_d > 84.3841 )
							if( d <= 89.8251 )
								ret := -0.466667
							if( d > 89.8251 )
								ret := -0.060976
					if( tema > 0.021825 )
						if( k <= 95.7861 )
							if( rsi1 <= 54.0055 )
								ret := 0.750000 // buy
							if( rsi1 > 54.0055 )
								ret := 1.000000 // buy
						if( k > 95.7861 )
							if( d_k <= -2.35285 )
								ret := -0.269231
							if( d_k > -2.35285 )
								ret := 0.666667
				if( ema12 > 4.4e-05 )
					if( k <= 98.3043 )
						if( d_k <= 1.44358 )
							if( ema12 <= 0.000224 )
								ret := -0.083056
							if( ema12 > 0.000224 )
								ret := -0.392694
						if( d_k > 1.44358 )
							if( d_k <= 5.09957 )
								ret := 0.231405
							if( d_k > 5.09957 )
								ret := -0.777778 // sell
					if( k > 98.3043 )
						if( k <= 99.9861 )
							if( smoothK_k <= 96.0115 )
								ret := -0.271429
							if( smoothK_k > 96.0115 )
								ret := -0.728972 // sell
						if( k > 99.9861 )
							if( d_k <= -0.449642 )
								ret := -0.281553
							if( d_k > -0.449642 )
								ret := 0.285714
			if( ema2 > 0.119071 )
				if( smoothK_k <= 92.915 )
					if( rsi1 <= 65.0104 )
						if( ema13 <= -0.000766 )
							if( smoothD_d <= 88.5636 )
								ret := 0.648615
							if( smoothD_d > 88.5636 )
								ret := 0.411290
						if( ema13 > -0.000766 )
							if( ema12 <= 0.01044 )
								ret := 0.171731
							if( ema12 > 0.01044 )
								ret := -0.512346
					if( rsi1 > 65.0104 )
						if( d <= 87.018 )
							if( d_k <= -7.4856 )
								ret := 0.805970 // buy
							if( d_k > -7.4856 )
								ret := 0.567164
						if( d > 87.018 )
							if( rsi1 <= 74.2784 )
								ret := 0.458874
							if( rsi1 > 74.2784 )
								ret := 0.671539
				if( smoothK_k > 92.915 )
					if( smoothK_k <= 96.6567 )
						if( rsi1 <= 69.2074 )
							if( ema12 <= -0.001436 )
								ret := 0.706337 // buy
							if( ema12 > -0.001436 )
								ret := 0.377939
						if( rsi1 > 69.2074 )
							if( ema12 <= 0.057601 )
								ret := 0.727682 // buy
							if( ema12 > 0.057601 )
								ret := -0.294118
					if( smoothK_k > 96.6567 )
						if( ema12 <= 0.003052 )
							if( ema13 <= -0.005018 )
								ret := 0.785408 // buy
							if( ema13 > -0.005018 )
								ret := 0.621961
						if( ema12 > 0.003052 )
							if( ema1 <= 0.168338 )
								ret := -0.500000
							if( ema1 > 0.168338 )
								ret := 0.865066 // buy
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_873ca3a7(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


