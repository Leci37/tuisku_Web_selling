//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: PTON_1Hour_1C00_3d9255e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_1Hour_1C00_3d9255e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_1Hour_3d9255e6(mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -3782.53 )
		if( ad_mf <= -5389.61 )
			if( ad_mf <= -12724.5 )
				if( ad_mf <= -13225.5 )
					if( mf <= -0.42936 )
						if( ad <= -876052 )
							ret := 0.596154
						if( ad > -876052 )
							ret := 0.069565
					if( mf > -0.42936 )
						if( ad <= -14529.2 )
							ret := 0.067289
						if( ad > -14529.2 )
							ret := -0.380282
				if( ad_mf > -13225.5 )
					if( ad_mf <= -12985.7 )
						if( mf <= 0.025849 )
							ret := 0.941176 // buy
						if( mf > 0.025849 )
							ret := 0.750000 // buy
					if( ad_mf > -12985.7 )
						if( mf <= 0.054245 )
							ret := 0.500000
						if( mf > 0.054245 )
							ret := 0.750000 // buy
			if( ad_mf > -12724.5 )
				if( ad <= -10034.6 )
					if( mf <= 0.005308 )
						if( ad <= -12172 )
							ret := 0.440000
						if( ad > -12172 )
							ret := -0.389706
					if( mf > 0.005308 )
						if( ad_mf <= -10695.2 )
							ret := -0.794118 // sell
						if( ad_mf > -10695.2 )
							ret := -0.342105
				if( ad > -10034.6 )
					if( ad <= -9382.44 )
						if( mf <= -0.044349 )
							ret := 0.878788 // buy
						if( mf > -0.044349 )
							ret := 0.370370
					if( ad > -9382.44 )
						if( ad <= -8795.1 )
							ret := 0.219780
						if( ad > -8795.1 )
							ret := -0.059451
		if( ad_mf > -5389.61 )
			if( ad <= -5012.43 )
				if( mf <= -0.187713 )
					ret := 0.428571
				if( mf > -0.187713 )
					if( ad_mf <= -5281.97 )
						if( ad <= -5335.64 )
							ret := 0.727273 // buy
						if( ad > -5335.64 )
							ret := 1.000000 // buy
					if( ad_mf > -5281.97 )
						if( ad_mf <= -5257.24 )
							ret := 0.300000
						if( ad_mf > -5257.24 )
							ret := 0.808511 // buy
			if( ad > -5012.43 )
				if( mf <= 0.062028 )
					if( ad <= -4912.56 )
						ret := -0.666667
					if( ad > -4912.56 )
						if( ad_mf <= -4868.34 )
							ret := 0.769231 // buy
						if( ad_mf > -4868.34 )
							ret := 0.109375
				if( mf > 0.062028 )
					if( ad <= -4625.34 )
						if( mf <= 0.202571 )
							ret := 0.882353 // buy
						if( mf > 0.202571 )
							ret := 0.263158
					if( ad > -4625.34 )
						if( ad <= -3932.17 )
							ret := 0.080460
						if( ad > -3932.17 )
							ret := 0.705882 // buy
	if( ad > -3782.53 )
		if( ad <= 15809.5 )
			if( ad_mf <= -0.047681 )
				if( ad <= -2005.46 )
					if( ad_mf <= -2500.97 )
						if( ad <= -2915.03 )
							ret := -0.128079
						if( ad > -2915.03 )
							ret := 0.135747
					if( ad_mf > -2500.97 )
						if( ad_mf <= -2434.16 )
							ret := -0.840909 // sell
						if( ad_mf > -2434.16 )
							ret := -0.269565
				if( ad > -2005.46 )
					if( mf <= 0.187354 )
						if( ad_mf <= -0.077403 )
							ret := -0.003757
						if( ad_mf > -0.077403 )
							ret := 0.464646
					if( mf > 0.187354 )
						if( ad_mf <= -0.270095 )
							ret := 0.170175
						if( ad_mf > -0.270095 )
							ret := 0.549383
			if( ad_mf > -0.047681 )
				if( ad <= 15633.5 )
					if( ad_mf <= 2639.09 )
						if( ad_mf <= 0.300003 )
							ret := -0.081749
						if( ad_mf > 0.300003 )
							ret := -0.232203
					if( ad_mf > 2639.09 )
						if( ad <= 2736.18 )
							ret := 0.510204
						if( ad > 2736.18 )
							ret := -0.092429
				if( ad > 15633.5 )
					ret := -1.000000 // sell
		if( ad > 15809.5 )
			if( mf <= 0.209761 )
				if( ad <= 17155.3 )
					if( ad <= 16209.1 )
						if( ad_mf <= 16005.7 )
							ret := 0.636364
						if( ad_mf > 16005.7 )
							ret := 0.000000
					if( ad > 16209.1 )
						if( ad_mf <= 16906.1 )
							ret := 0.666667
						if( ad_mf > 16906.1 )
							ret := 1.000000 // buy
				if( ad > 17155.3 )
					if( ad <= 307826 )
						if( mf <= 0.203505 )
							ret := -0.066324
						if( mf > 0.203505 )
							ret := -0.846154 // sell
					if( ad > 307826 )
						if( ad <= 495544 )
							ret := 0.113065
						if( ad > 495544 )
							ret := -0.018396
			if( mf > 0.209761 )
				if( ad_mf <= 2.71149e+06 )
					if( ad <= 2.38016e+06 )
						if( ad_mf <= 2.00502e+06 )
							ret := 0.165236
						if( ad_mf > 2.00502e+06 )
							ret := -0.275362
					if( ad > 2.38016e+06 )
						if( ad <= 2.63767e+06 )
							ret := 0.750000 // buy
						if( ad > 2.63767e+06 )
							ret := 0.125000
				if( ad_mf > 2.71149e+06 )
					if( ad_mf <= 2.92257e+06 )
						if( ad_mf <= 2.83975e+06 )
							ret := -0.894737 // sell
						if( ad_mf > 2.83975e+06 )
							ret := -0.958333 // sell
					if( ad_mf > 2.92257e+06 )
						if( ad <= 9.55374e+06 )
							ret := 0.006757
						if( ad > 9.55374e+06 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_PTON_1Hour_3d9255e6(mf, ad_mf, ad)

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


