//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: GME_1Hour_1C00_09227f53 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Hour_1C00_09227f53", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Hour_09227f53(mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -671.286 )
		if( mf <= 0.020424 )
			if( ad_mf <= -3.79712e+06 )
				if( ad_mf <= -4.46021e+06 )
					if( mf <= -0.214647 )
						if( mf <= -0.413445 )
							ret := -0.909091 // sell
						if( mf > -0.413445 )
							ret := -0.095238
					if( mf > -0.214647 )
						if( ad <= -4.84737e+06 )
							ret := 0.658228
						if( ad > -4.84737e+06 )
							ret := 0.100000
				if( ad_mf > -4.46021e+06 )
					if( ad_mf <= -4.03081e+06 )
						ret := 1.000000 // buy
					if( ad_mf > -4.03081e+06 )
						ret := 0.916667 // buy
			if( ad_mf > -3.79712e+06 )
				if( ad <= -2.20633e+06 )
					if( mf <= -0.288193 )
						if( ad <= -3.20151e+06 )
							ret := -1.000000 // sell
						if( ad > -3.20151e+06 )
							ret := -0.833333 // sell
					if( mf > -0.288193 )
						if( ad <= -2.66445e+06 )
							ret := 0.271186
						if( ad > -2.66445e+06 )
							ret := -0.553191
				if( ad > -2.20633e+06 )
					if( ad <= -348088 )
						if( ad_mf <= -370313 )
							ret := 0.062038
						if( ad_mf > -370313 )
							ret := 0.387283
					if( ad > -348088 )
						if( ad <= -345291 )
							ret := -0.687500
						if( ad > -345291 )
							ret := -0.020031
		if( mf > 0.020424 )
			if( ad <= -752845 )
				if( ad <= -2.25604e+06 )
					if( ad <= -2.30037e+06 )
						if( mf <= 0.155937 )
							ret := 0.628571
						if( mf > 0.155937 )
							ret := -0.733333 // sell
					if( ad > -2.30037e+06 )
						ret := -1.000000 // sell
				if( ad > -2.25604e+06 )
					if( ad_mf <= -798925 )
						if( ad <= -1.06933e+06 )
							ret := 0.468085
						if( ad > -1.06933e+06 )
							ret := 0.178947
					if( ad_mf > -798925 )
						if( ad_mf <= -782093 )
							ret := 0.900000 // buy
						if( ad_mf > -782093 )
							ret := 0.615385
			if( ad > -752845 )
				if( ad_mf <= -408209 )
					if( ad <= -411750 )
						if( ad_mf <= -684613 )
							ret := -0.536585
						if( ad_mf > -684613 )
							ret := -0.044521
					if( ad > -411750 )
						ret := -0.928571 // sell
				if( ad_mf > -408209 )
					if( ad <= -709.99 )
						if( ad_mf <= -70529 )
							ret := 0.176676
						if( ad_mf > -70529 )
							ret := 0.038685
					if( ad > -709.99 )
						if( ad <= -695.984 )
							ret := 0.571429
						if( ad > -695.984 )
							ret := 0.894737 // buy
	if( ad > -671.286 )
		if( ad <= 2249.69 )
			if( ad_mf <= 2144.02 )
				if( ad <= -620.51 )
					if( mf <= -0.270045 )
						ret := -0.400000
					if( mf > -0.270045 )
						if( ad <= -635.589 )
							ret := -0.833333 // sell
						if( ad > -635.589 )
							ret := -0.615385
				if( ad > -620.51 )
					if( mf <= -0.07021 )
						if( ad_mf <= 1861.3 )
							ret := -0.183161
						if( ad_mf > 1861.3 )
							ret := -0.496241
					if( mf > -0.07021 )
						if( ad <= -557.834 )
							ret := 0.603175
						if( ad > -557.834 )
							ret := -0.032367
			if( ad_mf > 2144.02 )
				if( ad_mf <= 2158.94 )
					if( ad <= 2151.4 )
						ret := -0.666667
					if( ad > 2151.4 )
						ret := -0.928571 // sell
				if( ad_mf > 2158.94 )
					if( ad_mf <= 2192.62 )
						ret := -0.333333
					if( ad_mf > 2192.62 )
						if( mf <= -0.038989 )
							ret := -0.450000
						if( mf > -0.038989 )
							ret := -0.913043 // sell
		if( ad > 2249.69 )
			if( ad <= 3166.94 )
				if( ad <= 2867.5 )
					if( ad <= 2744.97 )
						if( ad <= 2256.26 )
							ret := 0.700000 // buy
						if( ad > 2256.26 )
							ret := 0.194570
					if( ad > 2744.97 )
						if( mf <= -0.363451 )
							ret := -0.368421
						if( mf > -0.363451 )
							ret := -0.088235
				if( ad > 2867.5 )
					if( ad_mf <= 2922.34 )
						if( ad <= 2899.2 )
							ret := 1.000000 // buy
						if( ad > 2899.2 )
							ret := 0.727273 // buy
					if( ad_mf > 2922.34 )
						if( ad <= 3112.92 )
							ret := 0.119048
						if( ad > 3112.92 )
							ret := 0.739130 // buy
			if( ad > 3166.94 )
				if( ad <= 3464.5 )
					if( mf <= -0.308553 )
						ret := 0.272727
					if( mf > -0.308553 )
						if( mf <= -0.18961 )
							ret := -0.903226 // sell
						if( mf > -0.18961 )
							ret := -0.367089
				if( ad > 3464.5 )
					if( ad_mf <= 4017.43 )
						if( ad <= 3625.68 )
							ret := -0.020408
						if( ad > 3625.68 )
							ret := 0.380531
					if( ad_mf > 4017.43 )
						if( ad_mf <= 196667 )
							ret := -0.061530
						if( ad_mf > 196667 )
							ret := 0.012936
	
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
float op_operation = decision_tree_0_GME_1Hour_09227f53(mf, ad_mf, ad)

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


