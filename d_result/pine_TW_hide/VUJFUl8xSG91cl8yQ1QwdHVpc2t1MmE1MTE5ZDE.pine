//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: UBER_1Hour_2CT0_2a5119d1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Hour_2CT0_2a5119d1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Hour_2a5119d1(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ad_mf <= -0.043278 )
		if( ad <= -329108 )
			if( mf <= -0.281297 )
				if( tema <= 55.8915 )
					if( ad <= -1.08984e+07 )
						if( ema12 <= -0.263655 )
							ret := 1.000000 // buy
						if( ema12 > -0.263655 )
							ret := 0.666667
					if( ad > -1.08984e+07 )
						if( ad <= -6.28616e+06 )
							ret := -0.421053
						if( ad > -6.28616e+06 )
							ret := 0.257642
				if( tema > 55.8915 )
					if( mf <= -0.304022 )
						if( mf <= -0.493112 )
							ret := -0.857143 // sell
						if( mf > -0.493112 )
							ret := -0.184615
					if( mf > -0.304022 )
						if( ema13 <= -0.548529 )
							ret := 0.625000
						if( ema13 > -0.548529 )
							ret := 0.000000
			if( mf > -0.281297 )
				if( ema12 <= -0.091607 )
					if( ema3 <= 44.2765 )
						if( tema <= 33.4965 )
							ret := -0.089196
						if( tema > 33.4965 )
							ret := -0.255464
					if( ema3 > 44.2765 )
						if( ema3 <= 60.6772 )
							ret := -0.042435
						if( ema3 > 60.6772 )
							ret := 0.113208
				if( ema12 > -0.091607 )
					if( ema2 <= 26.7111 )
						if( ad <= -431074 )
							ret := 0.269231
						if( ad > -431074 )
							ret := 0.937500 // buy
					if( ema2 > 26.7111 )
						if( ema13 <= 1.40538 )
							ret := -0.008236
						if( ema13 > 1.40538 )
							ret := 0.566038
		if( ad > -329108 )
			if( ema1 <= 21.6607 )
				if( ema2 <= 20.4553 )
					if( mf <= -0.091426 )
						ret := 1.000000 // buy
					if( mf > -0.091426 )
						ret := -1.000000 // sell
				if( ema2 > 20.4553 )
					if( ema2 <= 21.2623 )
						if( ema3 <= 20.7989 )
							ret := 0.000000
						if( ema3 > 20.7989 )
							ret := 1.000000 // buy
					if( ema2 > 21.2623 )
						if( ema12 <= -0.191444 )
							ret := 0.823529 // buy
						if( ema12 > -0.191444 )
							ret := 0.227273
			if( ema1 > 21.6607 )
				if( mf <= 0.005496 )
					if( ema12 <= -0.125128 )
						if( ad <= -35680.3 )
							ret := 0.329114
						if( ad > -35680.3 )
							ret := 0.028898
					if( ema12 > -0.125128 )
						if( ad <= -668.574 )
							ret := -0.073014
						if( ad > -668.574 )
							ret := -0.327044
				if( mf > 0.005496 )
					if( mf <= 0.201007 )
						if( ema1 <= 35.6189 )
							ret := 0.268604
						if( ema1 > 35.6189 )
							ret := 0.150893
					if( mf > 0.201007 )
						if( ema12 <= -0.362646 )
							ret := 0.702703 // buy
						if( ema12 > -0.362646 )
							ret := 0.058399
	if( ad_mf > -0.043278 )
		if( ad <= 34356.5 )
			if( ema12 <= 0.148456 )
				if( ad <= 12779.3 )
					if( tema <= 22.748 )
						if( ema1 <= 21.4162 )
							ret := -0.161290
						if( ema1 > 21.4162 )
							ret := 0.640000
					if( tema > 22.748 )
						if( mf <= 0.066615 )
							ret := -0.199746
						if( mf > 0.066615 )
							ret := 0.016290
				if( ad > 12779.3 )
					if( ema1 <= 29.2789 )
						if( ad_mf <= 19156.4 )
							ret := -0.750000 // sell
						if( ad_mf > 19156.4 )
							ret := -0.433333
					if( ema1 > 29.2789 )
						if( ad <= 28252.4 )
							ret := -0.241803
						if( ad > 28252.4 )
							ret := -0.686275
			if( ema12 > 0.148456 )
				if( mf <= 0.262678 )
					if( ema2 <= 72.186 )
						if( ema1 <= 48.2195 )
							ret := 0.057179
						if( ema1 > 48.2195 )
							ret := 0.254958
					if( ema2 > 72.186 )
						if( ema12 <= 0.823875 )
							ret := -0.326531
						if( ema12 > 0.823875 )
							ret := 1.000000 // buy
				if( mf > 0.262678 )
					if( ema1 <= 63.7493 )
						if( ad_mf <= 10531.2 )
							ret := -0.301538
						if( ad_mf > 10531.2 )
							ret := 0.008929
					if( ema1 > 63.7493 )
						if( ad <= 1873.72 )
							ret := 0.550000
						if( ad > 1873.72 )
							ret := 0.000000
		if( ad > 34356.5 )
			if( ad <= 45608.4 )
				if( ema12 <= 0.01083 )
					if( ema12 <= -0.242858 )
						if( ema1 <= 26.9247 )
							ret := -1.000000 // sell
						if( ema1 > 26.9247 )
							ret := 0.724138 // buy
					if( ema12 > -0.242858 )
						if( ad <= 34929.7 )
							ret := 0.769231 // buy
						if( ad > 34929.7 )
							ret := -0.263889
				if( ema12 > 0.01083 )
					if( mf <= 0.276153 )
						if( ad_mf <= 43750.6 )
							ret := 0.677419
						if( ad_mf > 43750.6 )
							ret := 0.950000 // buy
					if( mf > 0.276153 )
						if( ad_mf <= 40497.9 )
							ret := 0.571429
						if( ad_mf > 40497.9 )
							ret := -1.000000 // sell
			if( ad > 45608.4 )
				if( ema12 <= 1.12418 )
					if( ema12 <= -0.193529 )
						if( ad <= 3.1691e+06 )
							ret := -0.045381
						if( ad > 3.1691e+06 )
							ret := -0.363296
					if( ema12 > -0.193529 )
						if( mf <= 0.182819 )
							ret := -0.013052
						if( mf > 0.182819 )
							ret := 0.084458
				if( ema12 > 1.12418 )
					if( ad_mf <= 1.62756e+06 )
						if( ad <= 50182.1 )
							ret := 1.000000 // buy
						if( ad > 50182.1 )
							ret := -0.133333
					if( ad_mf > 1.62756e+06 )
						if( mf <= 0.110997 )
							ret := -0.285714
						if( mf > 0.110997 )
							ret := 0.835616 // buy
	
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
float op_operation = decision_tree_0_UBER_1Hour_2a5119d1(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)

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


