//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: CRSR_15Min_2ST0_3fc6965c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_15Min_2ST0_3fc6965c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_15Min_3fc6965c(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 57.4133 )
		if( ema2 <= 24.404 )
			if( d_k <= 7.33166 )
				if( rsi1 <= 44.8254 )
					if( tema <= 21.3019 )
						if( k <= 98.2165 )
							ret := 0.053704
						if( k > 98.2165 )
							ret := -0.571429
					if( tema > 21.3019 )
						if( d <= 5.5009 )
							ret := 0.164179
						if( d > 5.5009 )
							ret := -0.228972
				if( rsi1 > 44.8254 )
					if( d_k <= -16.2951 )
						if( smoothD_d <= 43.6337 )
							ret := 0.005435
						if( smoothD_d > 43.6337 )
							ret := 0.284507
					if( d_k > -16.2951 )
						if( tema <= 20.9456 )
							ret := -0.065726
						if( tema > 20.9456 )
							ret := -0.298444
			if( d_k > 7.33166 )
				if( ema13 <= -0.122897 )
					if( ema1 <= 9.44163 )
						if( smoothK_k <= 38.5655 )
							ret := -0.027027
						if( smoothK_k > 38.5655 )
							ret := -0.863636 // sell
					if( ema1 > 9.44163 )
						if( d <= 14.9394 )
							ret := -0.043011
						if( d > 14.9394 )
							ret := 0.410920
				if( ema13 > -0.122897 )
					if( k <= 84.0047 )
						if( ema3 <= 6.32465 )
							ret := 0.690476
						if( ema3 > 6.32465 )
							ret := 0.126026
					if( k > 84.0047 )
						if( ema13 <= 0.000337 )
							ret := -0.833333 // sell
						if( ema13 > 0.000337 )
							ret := 0.000000
		if( ema2 > 24.404 )
			if( smoothK_k <= 5.36107 )
				if( ema12 <= -0.430184 )
					if( ema13 <= -0.600622 )
						if( tema <= 47.0631 )
							ret := 0.584746
						if( tema > 47.0631 )
							ret := -0.833333 // sell
					if( ema13 > -0.600622 )
						if( d_k <= -1.92373 )
							ret := 1.000000 // buy
						if( d_k > -1.92373 )
							ret := -0.888889 // sell
				if( ema12 > -0.430184 )
					if( rsi1 <= 53.233 )
						if( d_k <= -1.3521 )
							ret := -0.153226
						if( d_k > -1.3521 )
							ret := 0.276218
					if( rsi1 > 53.233 )
						if( smoothK_k <= 4.92918 )
							ret := -0.327103
						if( smoothK_k > 4.92918 )
							ret := 0.625000
			if( smoothK_k > 5.36107 )
				if( tema <= 24.4119 )
					if( smoothK_k <= 66.9578 )
						if( d_k <= 23.4424 )
							ret := 0.941176 // buy
						if( d_k > 23.4424 )
							ret := 0.000000
					if( smoothK_k > 66.9578 )
						ret := -0.666667
				if( tema > 24.4119 )
					if( ema1 <= 39.1886 )
						if( ema13 <= -0.764564 )
							ret := 0.423077
						if( ema13 > -0.764564 )
							ret := 0.076729
					if( ema1 > 39.1886 )
						if( smoothD_d <= 37.9359 )
							ret := 0.068351
						if( smoothD_d > 37.9359 )
							ret := -0.189807
	if( rsi1 > 57.4133 )
		if( k <= 46.3834 )
			if( ema13 <= 0.455192 )
				if( d_k <= -4.25253 )
					if( d <= 5.14842 )
						ret := 0.529412
					if( d > 5.14842 )
						if( rsi1 <= 58.2528 )
							ret := -0.177570
						if( rsi1 > 58.2528 )
							ret := -0.530103
				if( d_k > -4.25253 )
					if( smoothK_k <= 8.03818 )
						if( tema <= 18.9654 )
							ret := -0.224000
						if( tema > 18.9654 )
							ret := 0.294118
					if( smoothK_k > 8.03818 )
						if( tema <= 39.8398 )
							ret := -0.295741
						if( tema > 39.8398 )
							ret := 0.482759
			if( ema13 > 0.455192 )
				if( k <= 34.3064 )
					if( ema12 <= 0.791035 )
						if( d_k <= 25.8621 )
							ret := -0.177419
						if( d_k > 25.8621 )
							ret := 0.833333 // buy
					if( ema12 > 0.791035 )
						ret := -1.000000 // sell
				if( k > 34.3064 )
					if( d <= 27.7809 )
						ret := -0.900000 // sell
					if( d > 27.7809 )
						if( ema3 <= 42.886 )
							ret := 0.656863
						if( ema3 > 42.886 )
							ret := -0.714286 // sell
		if( k > 46.3834 )
			if( ema12 <= 0.38271 )
				if( smoothD_d <= 80.4669 )
					if( d_k <= 6.68973 )
						if( ema2 <= 42.6624 )
							ret := -0.150238
						if( ema2 > 42.6624 )
							ret := 0.480519
					if( d_k > 6.68973 )
						if( tema <= 38.0218 )
							ret := 0.093264
						if( tema > 38.0218 )
							ret := -0.301205
				if( smoothD_d > 80.4669 )
					if( ema1 <= 6.44697 )
						if( ema13 <= 0.011172 )
							ret := -0.400000
						if( ema13 > 0.011172 )
							ret := 0.645161
					if( ema1 > 6.44697 )
						if( ema13 <= 0.412807 )
							ret := -0.028315
						if( ema13 > 0.412807 )
							ret := 0.171598
			if( ema12 > 0.38271 )
				if( k <= 56.7961 )
					if( d <= 36.8168 )
						ret := -1.000000 // sell
					if( d > 36.8168 )
						if( tema <= 43.9693 )
							ret := 0.833333 // buy
						if( tema > 43.9693 )
							ret := -0.333333
				if( k > 56.7961 )
					if( ema13 <= 0.748153 )
						if( smoothK_k <= 91.6161 )
							ret := 0.037594
						if( smoothK_k > 91.6161 )
							ret := -0.594595
					if( ema13 > 0.748153 )
						if( rsi1 <= 69.489 )
							ret := -0.311321
						if( rsi1 > 69.489 )
							ret := -0.725962 // sell
	
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
float op_operation = decision_tree_0_CRSR_15Min_3fc6965c(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


