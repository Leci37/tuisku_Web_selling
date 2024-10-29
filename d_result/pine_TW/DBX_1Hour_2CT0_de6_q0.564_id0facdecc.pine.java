//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DBX_1Hour_2CT0_0facdecc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_1Hour_2CT0_0facdecc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_1Hour_0facdecc(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 22.4473 )
		if( ad <= 17.1938 )
			if( ad_mf <= -707520 )
				if( ema3 <= 22.2552 )
					if( ema1 <= 15.9522 )
						ret := -1.000000 // sell
					if( ema1 > 15.9522 )
						if( ad_mf <= -1.04971e+06 )
							ret := 0.678571
						if( ad_mf > -1.04971e+06 )
							ret := 0.451923
				if( ema3 > 22.2552 )
					if( mf <= -0.146526 )
						if( ad <= -1.26095e+06 )
							ret := 0.428571
						if( ad > -1.26095e+06 )
							ret := -0.875000 // sell
					if( mf > -0.146526 )
						if( ema1 <= 22.2226 )
							ret := -1.000000 // sell
						if( ema1 > 22.2226 )
							ret := 0.526316
			if( ad_mf > -707520 )
				if( mf <= -0.004741 )
					if( ema13 <= 0.055056 )
						if( ad <= -615814 )
							ret := -0.513274
						if( ad > -615814 )
							ret := 0.125828
					if( ema13 > 0.055056 )
						if( ad_mf <= 0.059482 )
							ret := -0.082589
						if( ad_mf > 0.059482 )
							ret := -0.542857
				if( mf > -0.004741 )
					if( ema13 <= -0.137784 )
						if( ad_mf <= -11398.3 )
							ret := 0.240343
						if( ad_mf > -11398.3 )
							ret := 0.625000
					if( ema13 > -0.137784 )
						if( ema1 <= 18.0793 )
							ret := 0.589928
						if( ema1 > 18.0793 )
							ret := 0.136453
		if( ad > 17.1938 )
			if( mf <= 0.169513 )
				if( ema13 <= 0.051474 )
					if( ad_mf <= 5452.93 )
						if( tema <= 21.1027 )
							ret := -0.134615
						if( tema > 21.1027 )
							ret := -0.401015
					if( ad_mf > 5452.93 )
						if( ema13 <= -0.315721 )
							ret := -0.170426
						if( ema13 > -0.315721 )
							ret := 0.086455
				if( ema13 > 0.051474 )
					if( ema13 <= 1.14921 )
						if( ad <= 383605 )
							ret := -0.198780
						if( ad > 383605 )
							ret := -0.534188
					if( ema13 > 1.14921 )
						ret := 1.000000 // buy
			if( mf > 0.169513 )
				if( ad_mf <= 499.797 )
					if( ad_mf <= 351.803 )
						ret := 0.666667
					if( ad_mf > 351.803 )
						if( mf <= 0.439248 )
							ret := -0.933333 // sell
						if( mf > 0.439248 )
							ret := 0.000000
				if( ad_mf > 499.797 )
					if( ema12 <= 0.165892 )
						if( ad_mf <= 2.03879e+06 )
							ret := 0.208889
						if( ad_mf > 2.03879e+06 )
							ret := -0.592593
					if( ema12 > 0.165892 )
						if( tema <= 22.0021 )
							ret := -0.218182
						if( tema > 22.0021 )
							ret := 0.340426
	if( tema > 22.4473 )
		if( ema12 <= 0.106298 )
			if( ema13 <= 0.245047 )
				if( ad_mf <= -1.3461e+06 )
					if( ad_mf <= -1.62896e+06 )
						if( ad <= -1.94494e+06 )
							ret := 0.629630
						if( ad > -1.94494e+06 )
							ret := -0.857143 // sell
					if( ad_mf > -1.62896e+06 )
						if( tema <= 25.9173 )
							ret := 0.982759 // buy
						if( tema > 25.9173 )
							ret := -0.666667
				if( ad_mf > -1.3461e+06 )
					if( ad <= -9082.47 )
						if( ema13 <= -0.388405 )
							ret := -0.442922
						if( ema13 > -0.388405 )
							ret := -0.089963
					if( ad > -9082.47 )
						if( ad_mf <= 57194.4 )
							ret := 0.077867
						if( ad_mf > 57194.4 )
							ret := -0.093246
			if( ema13 > 0.245047 )
				if( ad <= 834.505 )
					if( ema2 <= 27.8953 )
						if( mf <= 0.329411 )
							ret := 0.875000 // buy
						if( mf > 0.329411 )
							ret := 0.000000
					if( ema2 > 27.8953 )
						ret := -0.500000
				if( ad > 834.505 )
					if( ema12 <= 0.078718 )
						ret := 0.750000 // buy
					if( ema12 > 0.078718 )
						if( ema12 <= 0.100367 )
							ret := 0.000000
						if( ema12 > 0.100367 )
							ret := -0.750000 // sell
		if( ema12 > 0.106298 )
			if( ema12 <= 0.39789 )
				if( ad <= -220442 )
					if( ema13 <= 0.21985 )
						if( ad <= -345616 )
							ret := -0.608696
						if( ad > -345616 )
							ret := -0.066667
					if( ema13 > 0.21985 )
						if( ad <= -1.40553e+06 )
							ret := -0.466667
						if( ad > -1.40553e+06 )
							ret := 0.181070
				if( ad > -220442 )
					if( ad <= 21220.8 )
						if( ad <= 2187.96 )
							ret := -0.235460
						if( ad > 2187.96 )
							ret := -0.567073
					if( ad > 21220.8 )
						if( ad_mf <= 581705 )
							ret := -0.034783
						if( ad_mf > 581705 )
							ret := -0.404040
			if( ema12 > 0.39789 )
				if( ema13 <= 1.04027 )
					if( mf <= 0.348267 )
						if( ad <= 180651 )
							ret := -0.770833 // sell
						if( ad > 180651 )
							ret := -0.111111
					if( mf > 0.348267 )
						if( ad <= -4006.45 )
							ret := 0.666667
						if( ad > -4006.45 )
							ret := -0.454545
				if( ema13 > 1.04027 )
					if( tema <= 22.5105 )
						ret := 1.000000 // buy
					if( tema > 22.5105 )
						if( tema <= 23.4706 )
							ret := -1.000000 // sell
						if( tema > 23.4706 )
							ret := -0.625000
	
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
float op_operation = decision_tree_0_DBX_1Hour_0facdecc(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


