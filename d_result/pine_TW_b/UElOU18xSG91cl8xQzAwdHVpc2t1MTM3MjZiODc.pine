//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: PINS_1Hour_1C00_13726b87 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_1Hour_1C00_13726b87", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_1Hour_13726b87(mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -65.3734 )
		if( ad_mf <= -24980.6 )
			if( ad_mf <= -46255.6 )
				if( ad_mf <= -1.16486e+06 )
					if( ad <= -1.25333e+06 )
						if( ad <= -1.50989e+06 )
							ret := 0.133005
						if( ad > -1.50989e+06 )
							ret := -0.118343
					if( ad > -1.25333e+06 )
						if( ad <= -1.17456e+06 )
							ret := 0.394366
						if( ad > -1.17456e+06 )
							ret := 0.685714
				if( ad_mf > -1.16486e+06 )
					if( mf <= -0.392843 )
						if( ad <= -186674 )
							ret := 0.421053
						if( ad > -186674 )
							ret := 0.705882 // buy
					if( mf > -0.392843 )
						if( ad <= -1.06966e+06 )
							ret := -0.265217
						if( ad > -1.06966e+06 )
							ret := 0.005446
			if( ad_mf > -46255.6 )
				if( mf <= 0.026507 )
					if( ad <= -30659.5 )
						if( ad <= -35258.2 )
							ret := -0.500000
						if( ad > -35258.2 )
							ret := -0.730769 // sell
					if( ad > -30659.5 )
						if( ad_mf <= -29094.4 )
							ret := 0.950000 // buy
						if( ad_mf > -29094.4 )
							ret := -0.555556
				if( mf > 0.026507 )
					if( ad <= -27378.1 )
						if( mf <= 0.380779 )
							ret := 0.039604
						if( mf > 0.380779 )
							ret := 0.642857
					if( ad > -27378.1 )
						if( ad <= -26053.2 )
							ret := -0.615385
						if( ad > -26053.2 )
							ret := -0.300000
		if( ad_mf > -24980.6 )
			if( ad <= -299.328 )
				if( ad <= -19260.6 )
					if( ad_mf <= -21722.6 )
						if( ad <= -22143.6 )
							ret := 0.260870
						if( ad > -22143.6 )
							ret := -0.136364
					if( ad_mf > -21722.6 )
						if( mf <= 0.132711 )
							ret := 0.818182 // buy
						if( mf > 0.132711 )
							ret := 0.270270
				if( ad > -19260.6 )
					if( ad_mf <= -18243.1 )
						if( ad <= -18795.3 )
							ret := -0.166667
						if( ad > -18795.3 )
							ret := -0.933333 // sell
					if( ad_mf > -18243.1 )
						if( ad_mf <= -344.203 )
							ret := 0.113309
						if( ad_mf > -344.203 )
							ret := -0.315068
			if( ad > -299.328 )
				if( mf <= 0.223174 )
					if( ad_mf <= -247.427 )
						if( mf <= -0.155119 )
							ret := 0.250000
						if( mf > -0.155119 )
							ret := 0.857143 // buy
					if( ad_mf > -247.427 )
						if( ad <= -223.914 )
							ret := -0.357143
						if( ad > -223.914 )
							ret := 0.493151
				if( mf > 0.223174 )
					if( ad_mf <= -173.074 )
						ret := -0.352941
					if( ad_mf > -173.074 )
						ret := 1.000000 // buy
	if( ad > -65.3734 )
		if( ad <= 126637 )
			if( mf <= -0.523876 )
				if( ad <= 953.559 )
					ret := 0.818182 // buy
				if( ad > 953.559 )
					ret := 0.916667 // buy
			if( mf > -0.523876 )
				if( ad_mf <= -0.373629 )
					if( ad_mf <= -0.434658 )
						if( ad <= -13.668 )
							ret := -0.642857
						if( ad > -13.668 )
							ret := 0.139241
					if( ad_mf > -0.434658 )
						if( ad_mf <= -0.415753 )
							ret := 0.812500 // buy
						if( ad_mf > -0.415753 )
							ret := 0.593750
				if( ad_mf > -0.373629 )
					if( ad <= 114305 )
						if( ad_mf <= -0.170953 )
							ret := -0.348089
						if( ad_mf > -0.170953 )
							ret := -0.090522
					if( ad > 114305 )
						if( ad_mf <= 121903 )
							ret := -0.636364
						if( ad_mf > 121903 )
							ret := -0.464286
		if( ad > 126637 )
			if( ad <= 251391 )
				if( ad <= 131976 )
					if( mf <= 0.031518 )
						ret := 0.466667
					if( mf > 0.031518 )
						if( mf <= 0.178926 )
							ret := 0.888889 // buy
						if( mf > 0.178926 )
							ret := 0.625000
				if( ad > 131976 )
					if( ad_mf <= 250106 )
						if( ad_mf <= 170916 )
							ret := 0.043825
						if( ad_mf > 170916 )
							ret := 0.183556
					if( ad_mf > 250106 )
						ret := 0.818182 // buy
			if( ad > 251391 )
				if( ad_mf <= 451115 )
					if( mf <= 0.145102 )
						if( ad <= 270722 )
							ret := 0.108108
						if( ad > 270722 )
							ret := -0.226969
					if( mf > 0.145102 )
						if( ad_mf <= 448279 )
							ret := 0.142029
						if( ad_mf > 448279 )
							ret := -0.833333 // sell
				if( ad_mf > 451115 )
					if( ad <= 511925 )
						if( mf <= -0.145856 )
							ret := -0.229167
						if( mf > -0.145856 )
							ret := 0.294118
					if( ad > 511925 )
						if( mf <= 0.506429 )
							ret := 0.007878
						if( mf > 0.506429 )
							ret := -0.452830
	
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
float op_operation = decision_tree_0_PINS_1Hour_13726b87(mf, ad_mf, ad)

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


