//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: SPOT_30Min_2BC0_15f2ab0d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_30Min_2BC0_15f2ab0d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_30Min_15f2ab0d(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -1.70259 )
		if( ad <= 2505.21 )
			if( bbp <= -5.60826 )
				if( mf <= 0.127791 )
					if( ad_mf <= -0.056598 )
						if( bbm <= 7.372 )
							ret := 0.164717
						if( bbm > 7.372 )
							ret := 0.787879 // buy
					if( ad_mf > -0.056598 )
						if( mf <= -0.081971 )
							ret := 0.044776
						if( mf > -0.081971 )
							ret := -0.412844
				if( mf > 0.127791 )
					if( bbm <= 0.02 )
						if( bearPower <= -8.1381 )
							ret := 0.000000
						if( bearPower > -8.1381 )
							ret := 1.000000 // buy
					if( bbm > 0.02 )
						if( mf <= 0.244541 )
							ret := 0.710526 // buy
						if( mf > 0.244541 )
							ret := -0.076923
			if( bbp > -5.60826 )
				if( bullPower <= -2.4316 )
					if( mf <= -0.189309 )
						if( ad_mf <= 0.256172 )
							ret := -0.333333
						if( ad_mf > 0.256172 )
							ret := 0.722222 // buy
					if( mf > -0.189309 )
						if( ad_mf <= -211.24 )
							ret := 0.000000
						if( ad_mf > -211.24 )
							ret := 0.898876 // buy
				if( bullPower > -2.4316 )
					if( ad_mf <= 1392.19 )
						if( bullPower <= -2.4283 )
							ret := -1.000000 // sell
						if( bullPower > -2.4283 )
							ret := 0.276699
					if( ad_mf > 1392.19 )
						if( bbp <= -5.45883 )
							ret := 0.000000
						if( bbp > -5.45883 )
							ret := 0.956522 // buy
		if( ad > 2505.21 )
			if( ad <= 71843.4 )
				if( ad_mf <= 3031.29 )
					if( bbm <= 5.85528 )
						if( mf <= -0.198185 )
							ret := -1.000000 // sell
						if( mf > -0.198185 )
							ret := -0.692308
					if( bbm > 5.85528 )
						ret := 0.000000
				if( ad_mf > 3031.29 )
					if( ad_mf <= 3659.96 )
						if( bullPower <= -1.8361 )
							ret := 0.818182 // buy
						if( bullPower > -1.8361 )
							ret := -0.400000
					if( ad_mf > 3659.96 )
						if( ad <= 4334.81 )
							ret := -0.935484 // sell
						if( ad > 4334.81 )
							ret := -0.109562
			if( ad > 71843.4 )
				if( mf <= -0.361455 )
					if( ad_mf <= 130157 )
						ret := 0.000000
					if( ad_mf > 130157 )
						if( mf <= -0.393579 )
							ret := -1.000000 // sell
						if( mf > -0.393579 )
							ret := -0.400000
				if( mf > -0.361455 )
					if( ad <= 103235 )
						if( bbm <= 1.78811 )
							ret := 0.184211
						if( bbm > 1.78811 )
							ret := 0.731343 // buy
					if( ad > 103235 )
						if( bbm <= 5.85433 )
							ret := 0.204651
						if( bbm > 5.85433 )
							ret := -0.714286 // sell
	if( bullPower > -1.70259 )
		if( ad_mf <= -0.061966 )
			if( bbp <= 2.54901 )
				if( bbm <= 2.94967 )
					if( mf <= 0.364781 )
						if( ad_mf <= -0.083817 )
							ret := 0.046987
						if( ad_mf > -0.083817 )
							ret := 0.335294
					if( mf > 0.364781 )
						if( ad_mf <= -0.412131 )
							ret := 0.267606
						if( ad_mf > -0.412131 )
							ret := 0.603604
				if( bbm > 2.94967 )
					if( ad <= -52472.6 )
						if( bbp <= -10.3544 )
							ret := 0.866667 // buy
						if( bbp > -10.3544 )
							ret := -0.175781
					if( ad > -52472.6 )
						if( bullPower <= 0.642078 )
							ret := 0.294340
						if( bullPower > 0.642078 )
							ret := -0.040000
			if( bbp > 2.54901 )
				if( bullPower <= 1.41493 )
					if( bullPower <= 1.36296 )
						if( bearPower <= 1.34039 )
							ret := -0.692308
						if( bearPower > 1.34039 )
							ret := 0.266667
					if( bullPower > 1.36296 )
						if( ad <= -446 )
							ret := 0.000000
						if( ad > -446 )
							ret := -0.851852 // sell
				if( bullPower > 1.41493 )
					if( ad_mf <= -1232.88 )
						if( bearPower <= 0.374314 )
							ret := -0.271540
						if( bearPower > 0.374314 )
							ret := 0.057273
					if( ad_mf > -1232.88 )
						if( ad_mf <= -0.17416 )
							ret := -0.322072
						if( ad_mf > -0.17416 )
							ret := 0.107692
		if( ad_mf > -0.061966 )
			if( ad_mf <= 0.09362 )
				if( bullPower <= 0.781843 )
					if( bullPower <= 0.690578 )
						if( bearPower <= -1.39108 )
							ret := 0.470588
						if( bearPower > -1.39108 )
							ret := -0.167226
					if( bullPower > 0.690578 )
						if( ad_mf <= 0.058955 )
							ret := 0.666667
						if( ad_mf > 0.058955 )
							ret := -0.166667
				if( bullPower > 0.781843 )
					if( bbp <= 2.31133 )
						if( mf <= 0.051167 )
							ret := -0.731092 // sell
						if( mf > 0.051167 )
							ret := -0.181818
					if( bbp > 2.31133 )
						if( bullPower <= 1.59961 )
							ret := 0.238095
						if( bullPower > 1.59961 )
							ret := -0.426087
			if( ad_mf > 0.09362 )
				if( bbm <= 0.496971 )
					if( mf <= -0.410431 )
						if( bullPower <= 1.08439 )
							ret := -0.182927
						if( bullPower > 1.08439 )
							ret := -0.857143 // sell
					if( mf > -0.410431 )
						if( bullPower <= 2.88545 )
							ret := 0.063627
						if( bullPower > 2.88545 )
							ret := -0.341463
				if( bbm > 0.496971 )
					if( mf <= -0.004601 )
						if( ad <= 48770.7 )
							ret := -0.078963
						if( ad > 48770.7 )
							ret := -0.233405
					if( mf > -0.004601 )
						if( ad <= 447.475 )
							ret := -0.531034
						if( ad > 447.475 )
							ret := -0.014096
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SPOT_30Min_15f2ab0d(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)

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


