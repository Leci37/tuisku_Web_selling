//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: APPS_1Hour_2BC0_37eaac46 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_1Hour_2BC0_37eaac46", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_1Hour_37eaac46(bullPower, bbp, bearPower, bbm, BBPower_Color, ad, mf, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -0.039347 )
		if( bearPower <= -0.242754 )
			if( bbp <= -1.72814 )
				if( mf <= -0.409025 )
					if( ad_mf <= -101304 )
						if( bbp <= -3.35171 )
							ret := -0.136364
						if( bbp > -3.35171 )
							ret := -0.625000
					if( ad_mf > -101304 )
						if( ad_mf <= -6380.39 )
							ret := 0.500000
						if( ad_mf > -6380.39 )
							ret := -0.500000
				if( mf > -0.409025 )
					if( bbm <= 1.55845 )
						if( ad <= -1829.86 )
							ret := -0.020964
						if( ad > -1829.86 )
							ret := 0.446429
					if( bbm > 1.55845 )
						if( bullPower <= 1.51245 )
							ret := 0.424028
						if( bullPower > 1.51245 )
							ret := -1.000000 // sell
			if( bbp > -1.72814 )
				if( ad <= -3910.42 )
					if( ad_mf <= -161820 )
						if( bearPower <= -0.443997 )
							ret := -0.083149
						if( bearPower > -0.443997 )
							ret := 0.256198
					if( ad_mf > -161820 )
						if( ad_mf <= -108935 )
							ret := -0.456338
						if( ad_mf > -108935 )
							ret := -0.125903
				if( ad > -3910.42 )
					if( mf <= -0.012081 )
						if( ad <= -1210.53 )
							ret := 0.197479
						if( ad > -1210.53 )
							ret := -0.378277
					if( mf > -0.012081 )
						if( ad_mf <= -480.686 )
							ret := 0.306667
						if( ad_mf > -480.686 )
							ret := 0.600000
		if( bearPower > -0.242754 )
			if( bearPower <= -0.005208 )
				if( ad_mf <= -80699.2 )
					if( bearPower <= -0.097644 )
						if( bullPower <= 1.21481 )
							ret := -0.027816
						if( bullPower > 1.21481 )
							ret := -0.769231 // sell
					if( bearPower > -0.097644 )
						if( bullPower <= 0.028396 )
							ret := 0.305842
						if( bullPower > 0.028396 )
							ret := 0.082474
				if( ad_mf > -80699.2 )
					if( bearPower <= -0.02568 )
						if( ad <= -5279.68 )
							ret := 0.256816
						if( ad > -5279.68 )
							ret := 0.089754
					if( bearPower > -0.02568 )
						if( bullPower <= -0.01132 )
							ret := 0.600000
						if( bullPower > -0.01132 )
							ret := 0.336493
			if( bearPower > -0.005208 )
				if( bearPower <= 0.071408 )
					if( ad_mf <= -62717.2 )
						if( mf <= 0.05856 )
							ret := 0.245791
						if( mf > 0.05856 )
							ret := -0.046632
					if( ad_mf > -62717.2 )
						if( bbp <= 0.052209 )
							ret := 0.149466
						if( bbp > 0.052209 )
							ret := -0.135802
				if( bearPower > 0.071408 )
					if( bbm <= 2.18824 )
						if( ad_mf <= -745075 )
							ret := 0.731707 // buy
						if( ad_mf > -745075 )
							ret := 0.129969
					if( bbm > 2.18824 )
						if( bearPower <= 1.59269 )
							ret := -0.680000
						if( bearPower > 1.59269 )
							ret := 0.555556
	if( ad_mf > -0.039347 )
		if( ad <= 18557.5 )
			if( bullPower <= 0.011726 )
				if( bullPower <= -0.831009 )
					if( bearPower <= -1.65857 )
						if( mf <= -0.259423 )
							ret := 0.676471
						if( mf > -0.259423 )
							ret := -0.250000
					if( bearPower > -1.65857 )
						if( ad_mf <= 472.126 )
							ret := 0.843750 // buy
						if( ad_mf > 472.126 )
							ret := 0.187500
				if( bullPower > -0.831009 )
					if( mf <= -0.217281 )
						if( bearPower <= -0.288572 )
							ret := -0.450980
						if( bearPower > -0.288572 )
							ret := -0.120000
					if( mf > -0.217281 )
						if( bearPower <= -1.01532 )
							ret := -0.490000
						if( bearPower > -1.01532 )
							ret := 0.023279
			if( bullPower > 0.011726 )
				if( bbp <= 0.195277 )
					if( bbm <= 0.490584 )
						if( mf <= 0.218013 )
							ret := -0.322404
						if( mf > 0.218013 )
							ret := 0.119205
					if( bbm > 0.490584 )
						if( bbp <= 0.154082 )
							ret := -0.707763 // sell
						if( bbp > 0.154082 )
							ret := 0.071429
				if( bbp > 0.195277 )
					if( bbm <= 0.01267 )
						if( mf <= -0.248134 )
							ret := 0.291667
						if( mf > -0.248134 )
							ret := -0.417293
					if( bbm > 0.01267 )
						if( bullPower <= 1.85522 )
							ret := -0.082090
						if( bullPower > 1.85522 )
							ret := -0.504854
		if( ad > 18557.5 )
			if( ad <= 92771.6 )
				if( ad_mf <= 75128.4 )
					if( ad <= 66784.1 )
						if( ad_mf <= 21451.6 )
							ret := 0.398601
						if( ad_mf > 21451.6 )
							ret := 0.082563
					if( ad > 66784.1 )
						if( mf <= 0.192594 )
							ret := -0.451923
						if( mf > 0.192594 )
							ret := 0.163636
				if( ad_mf > 75128.4 )
					if( bearPower <= 0.094 )
						if( ad <= 77813.1 )
							ret := 0.582609
						if( ad > 77813.1 )
							ret := 0.116456
					if( bearPower > 0.094 )
						if( ad_mf <= 85548.6 )
							ret := 0.898305 // buy
						if( ad_mf > 85548.6 )
							ret := 0.571429
			if( ad > 92771.6 )
				if( ad_mf <= 93963.8 )
					if( ad <= 93361.3 )
						ret := -0.058824
					if( ad > 93361.3 )
						if( bearPower <= -0.04618 )
							ret := -1.000000 // sell
						if( bearPower > -0.04618 )
							ret := -0.466667
				if( ad_mf > 93963.8 )
					if( ad <= 1.22897e+06 )
						if( bearPower <= -0.51918 )
							ret := -0.137011
						if( bearPower > -0.51918 )
							ret := -0.014686
					if( ad > 1.22897e+06 )
						if( ad <= 3.30242e+06 )
							ret := 0.522222
						if( ad > 3.30242e+06 )
							ret := -0.461538
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_APPS_1Hour_37eaac46(bullPower, bbp, bearPower, bbm, BBPower_Color, ad, mf, ad_mf)

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


