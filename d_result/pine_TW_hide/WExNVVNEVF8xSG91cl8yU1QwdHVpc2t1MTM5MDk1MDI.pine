//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: XLMUSDT_1Hour_2ST0_13909502 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_1Hour_2ST0_13909502", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_1Hour_13909502(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 0.171923 )
		if( rsi1 <= 45.8014 )
			if( ema12 <= -0.000925 )
				if( rsi1 <= 38.0898 )
					if( d_k <= -1.47983 )
						if( smoothK_k <= 55.4143 )
							ret := 0.165441
						if( smoothK_k > 55.4143 )
							ret := -0.172043
					if( d_k > -1.47983 )
						if( tema <= 0.100607 )
							ret := 0.429825
						if( tema > 0.100607 )
							ret := -0.304624
				if( rsi1 > 38.0898 )
					if( ema13 <= -0.01053 )
						if( d <= 90.6723 )
							ret := 0.786957 // buy
						if( d > 90.6723 )
							ret := 0.000000
					if( ema13 > -0.01053 )
						if( tema <= 0.407026 )
							ret := 0.353815
						if( tema > 0.407026 )
							ret := -0.305970
			if( ema12 > -0.000925 )
				if( ema1 <= 0.121095 )
					if( ema12 <= -0.000215 )
						if( ema13 <= -0.001689 )
							ret := -0.298387
						if( ema13 > -0.001689 )
							ret := -0.007867
					if( ema12 > -0.000215 )
						if( ema1 <= 0.110012 )
							ret := -0.166526
						if( ema1 > 0.110012 )
							ret := -0.367742
				if( ema1 > 0.121095 )
					if( rsi1 <= 38.4373 )
						if( ema12 <= -0.000485 )
							ret := -0.390306
						if( ema12 > -0.000485 )
							ret := -0.692308
					if( rsi1 > 38.4373 )
						if( ema13 <= -0.000856 )
							ret := 0.001946
						if( ema13 > -0.000856 )
							ret := -0.370629
		if( rsi1 > 45.8014 )
			if( ema12 <= -0.000206 )
				if( ema13 <= -0.004031 )
					if( smoothD_d <= 92.2918 )
						if( d <= 93.0826 )
							ret := 0.687307
						if( d > 93.0826 )
							ret := -0.086957
					if( smoothD_d > 92.2918 )
						if( ema2 <= 0.226912 )
							ret := 0.700000 // buy
						if( ema2 > 0.226912 )
							ret := 0.974026 // buy
				if( ema13 > -0.004031 )
					if( rsi1 <= 62.5407 )
						if( smoothD_d <= 59.5601 )
							ret := 0.440418
						if( smoothD_d > 59.5601 )
							ret := 0.282787
					if( rsi1 > 62.5407 )
						if( ema2 <= 0.291123 )
							ret := 0.933333 // buy
						if( ema2 > 0.291123 )
							ret := 0.363636
			if( ema12 > -0.000206 )
				if( rsi1 <= 59.5843 )
					if( ema12 <= 7.8e-05 )
						if( rsi1 <= 50.3163 )
							ret := -0.018182
						if( rsi1 > 50.3163 )
							ret := 0.209794
					if( ema12 > 7.8e-05 )
						if( rsi1 <= 51.8066 )
							ret := -0.256073
						if( rsi1 > 51.8066 )
							ret := -0.019305
				if( rsi1 > 59.5843 )
					if( ema2 <= 0.082871 )
						if( ema12 <= 0.000815 )
							ret := 0.040152
						if( ema12 > 0.000815 )
							ret := -0.273077
					if( ema2 > 0.082871 )
						if( ema13 <= 2.8e-05 )
							ret := 0.571042
						if( ema13 > 2.8e-05 )
							ret := 0.282311
	if( d_k > 0.171923 )
		if( rsi1 <= 40.3646 )
			if( tema <= 0.084856 )
				if( d <= 2.52227 )
					if( d <= 1.7425 )
						if( smoothD_d <= -2.4651 )
							ret := -0.142857
						if( smoothD_d > -2.4651 )
							ret := 0.281250
					if( d > 1.7425 )
						if( rsi1 <= 30.1683 )
							ret := 0.533333
						if( rsi1 > 30.1683 )
							ret := 1.000000 // buy
				if( d > 2.52227 )
					if( tema <= 0.072616 )
						if( smoothK_k <= 63.4991 )
							ret := -0.014085
						if( smoothK_k > 63.4991 )
							ret := 0.482353
					if( tema > 0.072616 )
						if( rsi1 <= 17.6635 )
							ret := -0.711111 // sell
						if( rsi1 > 17.6635 )
							ret := -0.167192
			if( tema > 0.084856 )
				if( ema12 <= -0.001886 )
					if( rsi1 <= 29.9365 )
						if( d <= 2.39037 )
							ret := -0.674033
						if( d > 2.39037 )
							ret := -0.208814
					if( rsi1 > 29.9365 )
						if( d_k <= 5.36022 )
							ret := 0.280303
						if( d_k > 5.36022 )
							ret := -0.146388
				if( ema12 > -0.001886 )
					if( ema1 <= 0.131362 )
						if( rsi1 <= 29.5943 )
							ret := -0.541836
						if( rsi1 > 29.5943 )
							ret := -0.251055
					if( ema1 > 0.131362 )
						if( ema12 <= -0.000976 )
							ret := -0.512148
						if( ema12 > -0.000976 )
							ret := -0.690675
		if( rsi1 > 40.3646 )
			if( ema12 <= 3.1e-05 )
				if( ema13 <= -0.002559 )
					if( ema13 <= -0.005592 )
						if( d_k <= 0.819982 )
							ret := 0.466667
						if( d_k > 0.819982 )
							ret := 0.899225 // buy
					if( ema13 > -0.005592 )
						if( rsi1 <= 41.6781 )
							ret := -0.142857
						if( rsi1 > 41.6781 )
							ret := 0.640777
				if( ema13 > -0.002559 )
					if( ema1 <= 0.091523 )
						if( d <= 14.6691 )
							ret := -0.144385
						if( d > 14.6691 )
							ret := 0.306122
					if( ema1 > 0.091523 )
						if( rsi1 <= 46.6988 )
							ret := -0.110357
						if( rsi1 > 46.6988 )
							ret := 0.259789
			if( ema12 > 3.1e-05 )
				if( rsi1 <= 52.2358 )
					if( ema1 <= 0.0838 )
						if( rsi1 <= 46.2088 )
							ret := -0.275000
						if( rsi1 > 46.2088 )
							ret := 0.203333
					if( ema1 > 0.0838 )
						if( ema12 <= 0.001643 )
							ret := -0.416260
						if( ema12 > 0.001643 )
							ret := -0.828877 // sell
				if( rsi1 > 52.2358 )
					if( ema12 <= 0.002142 )
						if( ema3 <= 0.099211 )
							ret := 0.135316
						if( ema3 > 0.099211 )
							ret := 0.004869
					if( ema12 > 0.002142 )
						if( ema3 <= 0.184792 )
							ret := 0.069731
						if( ema3 > 0.184792 )
							ret := -0.207427
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_XLMUSDT_1Hour_13909502(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


