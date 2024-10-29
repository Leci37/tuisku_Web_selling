//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ZI_1Hour_2CT0_df4f1802 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_1Hour_2CT0_df4f1802", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_1Hour_df4f1802(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 48.0787 )
		if( ema1 <= 19.2287 )
			if( tema <= 9.64174 )
				if( ema12 <= 0.054889 )
					if( ema13 <= -0.098303 )
						if( ema3 <= 8.74499 )
							ret := 0.857143 // buy
						if( ema3 > 8.74499 )
							ret := 0.026316
					if( ema13 > -0.098303 )
						if( ema12 <= -0.007955 )
							ret := 0.750000 // buy
						if( ema12 > -0.007955 )
							ret := 0.260870
				if( ema12 > 0.054889 )
					if( tema <= 9.29021 )
						ret := 0.000000
					if( tema > 9.29021 )
						if( tema <= 9.47402 )
							ret := -1.000000 // sell
						if( tema > 9.47402 )
							ret := 0.000000
			if( tema > 9.64174 )
				if( tema <= 19.2293 )
					if( ema12 <= -0.407625 )
						if( ema13 <= -1.16736 )
							ret := -0.322581
						if( ema13 > -1.16736 )
							ret := -1.000000 // sell
					if( ema12 > -0.407625 )
						if( ema12 <= -0.020876 )
							ret := 0.036145
						if( ema12 > -0.020876 )
							ret := -0.096099
				if( tema > 19.2293 )
					ret := -1.000000 // sell
		if( ema1 > 19.2287 )
			if( ema13 <= -3.55429 )
				if( ema3 <= 43.5629 )
					if( mf <= -0.174136 )
						ret := 0.000000
					if( mf > -0.174136 )
						ret := -1.000000 // sell
				if( ema3 > 43.5629 )
					ret := -0.285714
			if( ema13 > -3.55429 )
				if( ad <= -1.10884e+06 )
					if( ema12 <= 0.436423 )
						if( mf <= 0.271734 )
							ret := 0.526718
						if( mf > 0.271734 )
							ret := -1.000000 // sell
					if( ema12 > 0.436423 )
						ret := -0.857143 // sell
				if( ad > -1.10884e+06 )
					if( ad <= -993600 )
						if( ema12 <= -1.14852 )
							ret := 0.000000
						if( ema12 > -1.14852 )
							ret := -0.885714 // sell
					if( ad > -993600 )
						if( ema12 <= -0.774087 )
							ret := -0.111111
						if( ema12 > -0.774087 )
							ret := 0.072792
	if( tema > 48.0787 )
		if( ad_mf <= 0.034399 )
			if( ema13 <= -0.473764 )
				if( ad_mf <= -931311 )
					if( mf <= -0.278833 )
						if( ema12 <= -0.771658 )
							ret := -0.933333 // sell
						if( ema12 > -0.771658 )
							ret := 0.000000
					if( mf > -0.278833 )
						ret := 0.000000
				if( ad_mf > -931311 )
					if( ad_mf <= -648802 )
						if( ema12 <= -0.799547 )
							ret := 0.928571 // buy
						if( ema12 > -0.799547 )
							ret := 0.562500
					if( ad_mf > -648802 )
						if( mf <= -0.298653 )
							ret := -0.227848
						if( mf > -0.298653 )
							ret := 0.272727
			if( ema13 > -0.473764 )
				if( tema <= 49.7671 )
					if( ema2 <= 47.0949 )
						ret := 0.600000
					if( ema2 > 47.0949 )
						if( ad <= -435.931 )
							ret := -0.267045
						if( ad > -435.931 )
							ret := -0.666667
				if( tema > 49.7671 )
					if( ema3 <= 50.1824 )
						if( ema13 <= 2.58593 )
							ret := 0.216783
						if( ema13 > 2.58593 )
							ret := 0.857143 // buy
					if( ema3 > 50.1824 )
						if( mf <= -0.249267 )
							ret := -0.705882 // sell
						if( mf > -0.249267 )
							ret := -0.073021
		if( ad_mf > 0.034399 )
			if( ad_mf <= 5449.63 )
				if( ema2 <= 49.2439 )
					if( mf <= -0.32736 )
						ret := 1.000000 // buy
					if( mf > -0.32736 )
						if( ad <= 2788.01 )
							ret := -0.905882 // sell
						if( ad > 2788.01 )
							ret := 0.200000
				if( ema2 > 49.2439 )
					if( mf <= -0.141847 )
						if( ema2 <= 52.9908 )
							ret := 0.134615
						if( ema2 > 52.9908 )
							ret := -0.688623
					if( mf > -0.141847 )
						if( ema12 <= -0.910729 )
							ret := 0.789474 // buy
						if( ema12 > -0.910729 )
							ret := -0.155340
			if( ad_mf > 5449.63 )
				if( ad <= 133974 )
					if( ema2 <= 52.5169 )
						if( ema13 <= -0.651165 )
							ret := 0.578947
						if( ema13 > -0.651165 )
							ret := 0.016529
					if( ema2 > 52.5169 )
						if( ema12 <= 0.364534 )
							ret := -0.053872
						if( ema12 > 0.364534 )
							ret := -0.366667
				if( ad > 133974 )
					if( ema1 <= 47.824 )
						if( tema <= 48.2914 )
							ret := 0.200000
						if( tema > 48.2914 )
							ret := 0.923077 // buy
					if( ema1 > 47.824 )
						if( ema12 <= -0.601519 )
							ret := 0.045455
						if( ema12 > -0.601519 )
							ret := -0.272597
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ZI_1Hour_df4f1802(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)

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


