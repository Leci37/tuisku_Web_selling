//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AVAXUSDT_15Min_2ST0_c3d6923f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_2ST0_c3d6923f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_c3d6923f(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 52.9515 )
		if( smoothK_k <= 24.6728 )
			if( ema1 <= 25.9983 )
				if( ema12 <= 0.005294 )
					if( rsi1 <= 32.5603 )
						if( ema12 <= -0.056979 )
							if( ema13 <= -0.233514 )
								ret := 0.068888
							if( ema13 > -0.233514 )
								ret := -0.151882
						if( ema12 > -0.056979 )
							if( rsi1 <= 24.9977 )
								ret := -0.579029
							if( rsi1 > 24.9977 )
								ret := -0.324476
					if( rsi1 > 32.5603 )
						if( ema12 <= -0.019545 )
							if( d_k <= -4.60605 )
								ret := -0.180308
							if( d_k > -4.60605 )
								ret := 0.107649
						if( ema12 > -0.019545 )
							if( rsi1 <= 39.8002 )
								ret := -0.234089
							if( rsi1 > 39.8002 )
								ret := 0.020861
				if( ema12 > 0.005294 )
					if( rsi1 <= 45.4274 )
						if( ema12 <= 0.033105 )
							if( d_k <= -0.453529 )
								ret := -0.603535
							if( d_k > -0.453529 )
								ret := -0.408722
						if( ema12 > 0.033105 )
							if( ema13 <= 0.293345 )
								ret := -0.685446
							if( ema13 > 0.293345 )
								ret := -0.132075
					if( rsi1 > 45.4274 )
						if( ema12 <= 0.041496 )
							if( ema13 <= 0.096076 )
								ret := -0.160988
							if( ema13 > 0.096076 )
								ret := 0.540541
						if( ema12 > 0.041496 )
							if( ema2 <= 14.3848 )
								ret := -0.744000 // sell
							if( ema2 > 14.3848 )
								ret := -0.244211
			if( ema1 > 25.9983 )
				if( rsi1 <= 33.4952 )
					if( ema13 <= -0.249795 )
						if( ema1 <= 29.6908 )
							if( d_k <= -10.558 )
								ret := -0.833333 // sell
							if( d_k > -10.558 )
								ret := 0.086310
						if( ema1 > 29.6908 )
							if( ema12 <= -0.60753 )
								ret := 0.061611
							if( ema12 > -0.60753 )
								ret := -0.505609
					if( ema13 > -0.249795 )
						if( ema12 <= -0.043542 )
							if( rsi1 <= 24.9809 )
								ret := -0.805320 // sell
							if( rsi1 > 24.9809 )
								ret := -0.516432
						if( ema12 > -0.043542 )
							if( ema12 <= 0.016982 )
								ret := -0.801316 // sell
							if( ema12 > 0.016982 )
								ret := -0.916865 // sell
				if( rsi1 > 33.4952 )
					if( ema12 <= -0.0434 )
						if( rsi1 <= 43.9152 )
							if( ema12 <= -0.134608 )
								ret := 0.135725
							if( ema12 > -0.134608 )
								ret := -0.258621
						if( rsi1 > 43.9152 )
							if( tema <= 33.8234 )
								ret := 0.000000
							if( tema > 33.8234 )
								ret := 0.531429
					if( ema12 > -0.0434 )
						if( ema12 <= 0.070799 )
							if( ema13 <= 0.161927 )
								ret := -0.384909
							if( ema13 > 0.161927 )
								ret := -0.060870
						if( ema12 > 0.070799 )
							if( ema2 <= 66.0573 )
								ret := -0.640305
							if( ema2 > 66.0573 )
								ret := 0.909091 // buy
		if( smoothK_k > 24.6728 )
			if( ema12 <= -0.105468 )
				if( rsi1 <= 43.0546 )
					if( rsi1 <= 29.0366 )
						if( ema3 <= 21.2461 )
							if( d <= 48.9259 )
								ret := 0.013274
							if( d > 48.9259 )
								ret := 0.402116
						if( ema3 > 21.2461 )
							if( ema13 <= -0.789045 )
								ret := 0.195402
							if( ema13 > -0.789045 )
								ret := -0.487755
					if( rsi1 > 29.0366 )
						if( ema12 <= -0.408938 )
							if( d <= 18.0181 )
								ret := -0.625000
							if( d > 18.0181 )
								ret := 0.549632
						if( ema12 > -0.408938 )
							if( ema1 <= 42.8142 )
								ret := 0.189625
							if( ema1 > 42.8142 )
								ret := -0.287190
				if( rsi1 > 43.0546 )
					if( ema3 <= 54.9811 )
						if( ema1 <= 24.6668 )
							if( tema <= 24.1178 )
								ret := 0.406349
							if( tema > 24.1178 )
								ret := -0.473684
						if( ema1 > 24.6668 )
							if( ema12 <= -0.176273 )
								ret := 0.718007 // buy
							if( ema12 > -0.176273 )
								ret := 0.478261
					if( ema3 > 54.9811 )
						if( rsi1 <= 47.8607 )
							if( smoothD_d <= 30.2097 )
								ret := 0.571429
							if( smoothD_d > 30.2097 )
								ret := -0.397260
						if( rsi1 > 47.8607 )
							if( ema12 <= -0.236154 )
								ret := 0.826087 // buy
							if( ema12 > -0.236154 )
								ret := 0.060606
			if( ema12 > -0.105468 )
				if( ema2 <= 30.1042 )
					if( ema12 <= 0.011964 )
						if( rsi1 <= 40.5511 )
							if( ema3 <= 20.2123 )
								ret := -0.052851
							if( ema3 > 20.2123 )
								ret := -0.293089
						if( rsi1 > 40.5511 )
							if( ema12 <= -0.036751 )
								ret := 0.214142
							if( ema12 > -0.036751 )
								ret := 0.020395
					if( ema12 > 0.011964 )
						if( rsi1 <= 44.8917 )
							if( rsi1 <= 40.9422 )
								ret := -0.778947 // sell
							if( rsi1 > 40.9422 )
								ret := -0.490798
						if( rsi1 > 44.8917 )
							if( tema <= 30.1566 )
								ret := -0.193038
							if( tema > 30.1566 )
								ret := 1.000000 // buy
				if( ema2 > 30.1042 )
					if( rsi1 <= 45.7814 )
						if( ema12 <= -0.014168 )
							if( ema13 <= -0.173161 )
								ret := -0.584302
							if( ema13 > -0.173161 )
								ret := -0.329060
						if( ema12 > -0.014168 )
							if( ema13 <= -0.051383 )
								ret := -0.884298 // sell
							if( ema13 > -0.051383 )
								ret := -0.646341
					if( rsi1 > 45.7814 )
						if( ema12 <= -0.010808 )
							if( rsi1 <= 49.7165 )
								ret := -0.015474
							if( rsi1 > 49.7165 )
								ret := 0.274611
						if( ema12 > -0.010808 )
							if( rsi1 <= 49.825 )
								ret := -0.476190
							if( rsi1 > 49.825 )
								ret := -0.223958
	if( rsi1 > 52.9515 )
		if( ema12 <= -0.008781 )
			if( rsi1 <= 58.0653 )
				if( ema12 <= -0.04931 )
					if( ema12 <= -0.095197 )
						if( ema13 <= -0.705177 )
							if( ema1 <= 50.8798 )
								ret := 0.260870
							if( ema1 > 50.8798 )
								ret := 0.866667 // buy
						if( ema13 > -0.705177 )
							if( d_k <= 7.96883 )
								ret := 0.817579 // buy
							if( d_k > 7.96883 )
								ret := 0.300000
					if( ema12 > -0.095197 )
						if( ema13 <= -0.13838 )
							if( smoothD_d <= 84.3074 )
								ret := 0.065574
							if( smoothD_d > 84.3074 )
								ret := 0.693467
						if( ema13 > -0.13838 )
							if( k <= 47.5772 )
								ret := 0.390244
							if( k > 47.5772 )
								ret := 0.783972 // buy
				if( ema12 > -0.04931 )
					if( ema13 <= -0.119157 )
						if( smoothD_d <= 93.449 )
							if( ema12 <= -0.033478 )
								ret := 0.148148
							if( ema12 > -0.033478 )
								ret := -0.591837
						if( smoothD_d > 93.449 )
							if( ema12 <= -0.045364 )
								ret := 0.285714
							if( ema12 > -0.045364 )
								ret := 0.739130 // buy
					if( ema13 > -0.119157 )
						if( ema12 <= -0.022318 )
							if( ema3 <= 15.3665 )
								ret := 0.670588
							if( ema3 > 15.3665 )
								ret := 0.442953
						if( ema12 > -0.022318 )
							if( d_k <= 4.91483 )
								ret := 0.246224
							if( d_k > 4.91483 )
								ret := 0.554622
			if( rsi1 > 58.0653 )
				if( ema2 <= 23.0086 )
					if( rsi1 <= 65.6276 )
						if( d_k <= 2.38342 )
							if( ema12 <= -0.028573 )
								ret := 0.730290 // buy
							if( ema12 > -0.028573 )
								ret := 0.438095
						if( d_k > 2.38342 )
							if( rsi1 <= 64.5512 )
								ret := 0.863158 // buy
							if( rsi1 > 64.5512 )
								ret := 0.375000
					if( rsi1 > 65.6276 )
						if( k <= 92.9502 )
							if( ema3 <= 17.306 )
								ret := 0.372549
							if( ema3 > 17.306 )
								ret := 0.800000 // buy
						if( k > 92.9502 )
							if( ema13 <= -0.272651 )
								ret := 0.000000
							if( ema13 > -0.272651 )
								ret := 0.836066 // buy
				if( ema2 > 23.0086 )
					if( rsi1 <= 61.0674 )
						if( d <= 27.0295 )
							ret := 0.076923
						if( d > 27.0295 )
							if( ema13 <= -0.850271 )
								ret := 0.142857
							if( ema13 > -0.850271 )
								ret := 0.746951 // buy
					if( rsi1 > 61.0674 )
						if( d_k <= -1.19084 )
							if( d <= 42.2026 )
								ret := 0.571429
							if( d > 42.2026 )
								ret := 0.833509 // buy
						if( d_k > -1.19084 )
							if( ema12 <= -0.013918 )
								ret := 0.944444 // buy
							if( ema12 > -0.013918 )
								ret := 0.686275
		if( ema12 > -0.008781 )
			if( rsi1 <= 66.6702 )
				if( ema12 <= 0.106906 )
					if( ema3 <= 26.101 )
						if( ema12 <= 0.011302 )
							if( rsi1 <= 61.5441 )
								ret := 0.144073
							if( rsi1 > 61.5441 )
								ret := 0.357346
						if( ema12 > 0.011302 )
							if( rsi1 <= 55.9308 )
								ret := -0.070050
							if( rsi1 > 55.9308 )
								ret := 0.081583
					if( ema3 > 26.101 )
						if( ema12 <= 0.039045 )
							if( rsi1 <= 56.2517 )
								ret := 0.165254
							if( rsi1 > 56.2517 )
								ret := 0.482038
						if( ema12 > 0.039045 )
							if( rsi1 <= 56.4976 )
								ret := -0.053265
							if( rsi1 > 56.4976 )
								ret := 0.307596
				if( ema12 > 0.106906 )
					if( ema12 <= 0.3034 )
						if( ema1 <= 40.5415 )
							if( rsi1 <= 60.3588 )
								ret := -0.231050
							if( rsi1 > 60.3588 )
								ret := -0.082510
						if( ema1 > 40.5415 )
							if( rsi1 <= 58.7269 )
								ret := -0.103448
							if( rsi1 > 58.7269 )
								ret := 0.223744
					if( ema12 > 0.3034 )
						if( rsi1 <= 60.5913 )
							if( ema12 <= 0.400422 )
								ret := -0.475610
							if( ema12 > 0.400422 )
								ret := -0.750000 // sell
						if( rsi1 > 60.5913 )
							if( d_k <= 8.278 )
								ret := -0.472527
							if( d_k > 8.278 )
								ret := 0.033520
			if( rsi1 > 66.6702 )
				if( ema3 <= 24.7371 )
					if( ema12 <= 0.078372 )
						if( rsi1 <= 75.0267 )
							if( ema3 <= 20.6476 )
								ret := 0.299583
							if( ema3 > 20.6476 )
								ret := 0.549751
						if( rsi1 > 75.0267 )
							if( ema12 <= 0.047751 )
								ret := 0.646396
							if( ema12 > 0.047751 )
								ret := 0.432722
					if( ema12 > 0.078372 )
						if( d_k <= -0.329434 )
							if( rsi1 <= 74.7289 )
								ret := -0.127440
							if( rsi1 > 74.7289 )
								ret := 0.158586
						if( d_k > -0.329434 )
							if( smoothD_d <= 94.9024 )
								ret := 0.278846
							if( smoothD_d > 94.9024 )
								ret := 0.607798
				if( ema3 > 24.7371 )
					if( ema12 <= 0.277983 )
						if( rsi1 <= 77.046 )
							if( ema12 <= 0.109065 )
								ret := 0.672374
							if( ema12 > 0.109065 )
								ret := 0.469677
						if( rsi1 > 77.046 )
							if( ema13 <= 0.247352 )
								ret := 0.865772 // buy
							if( ema13 > 0.247352 )
								ret := 0.699360
					if( ema12 > 0.277983 )
						if( rsi1 <= 77.9722 )
							if( d_k <= 3.72012 )
								ret := -0.095455
							if( d_k > 3.72012 )
								ret := 0.245977
						if( rsi1 > 77.9722 )
							if( ema13 <= 1.75822 )
								ret := 0.679513
							if( ema13 > 1.75822 )
								ret := -0.783784 // sell
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_c3d6923f(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


