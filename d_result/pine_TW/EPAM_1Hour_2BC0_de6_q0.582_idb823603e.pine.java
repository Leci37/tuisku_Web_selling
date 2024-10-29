//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: EPAM_1Hour_2BC0_b823603e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_1Hour_2BC0_b823603e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_1Hour_b823603e(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= 5595.42 )
		if( bbm <= 4.11272 )
			if( bullPower <= -3.39382 )
				if( bullPower <= -14.5926 )
					if( mf <= -0.161067 )
						if( bbm <= 2.95145 )
							ret := -0.363636
						if( bbm > 2.95145 )
							ret := -1.000000 // sell
					if( mf > -0.161067 )
						if( bbm <= 3.3485 )
							ret := 0.842105 // buy
						if( bbm > 3.3485 )
							ret := -0.500000
				if( bullPower > -14.5926 )
					if( bbm <= 2.55447 )
						if( ad_mf <= -0.103212 )
							ret := 0.273743
						if( ad_mf > -0.103212 )
							ret := -0.207692
					if( bbm > 2.55447 )
						if( bbm <= 3.96063 )
							ret := -0.435407
						if( bbm > 3.96063 )
							ret := 0.300000
			if( bullPower > -3.39382 )
				if( mf <= 0.384929 )
					if( ad <= -37324 )
						if( mf <= -0.171965 )
							ret := -0.070270
						if( mf > -0.171965 )
							ret := 0.255901
					if( ad > -37324 )
						if( bearPower <= 14.2158 )
							ret := 0.058087
						if( bearPower > 14.2158 )
							ret := 0.947368 // buy
				if( mf > 0.384929 )
					if( mf <= 0.517461 )
						if( bearPower <= 13.2103 )
							ret := -0.277778
						if( bearPower > 13.2103 )
							ret := -1.000000 // sell
					if( mf > 0.517461 )
						ret := -1.000000 // sell
		if( bbm > 4.11272 )
			if( bbm <= 12.2402 )
				if( bullPower <= -29.4256 )
					ret := 1.000000 // buy
				if( bullPower > -29.4256 )
					if( ad_mf <= 2417.19 )
						if( ad_mf <= 2194.67 )
							ret := -0.089533
						if( ad_mf > 2194.67 )
							ret := -0.863636 // sell
					if( ad_mf > 2417.19 )
						if( bbm <= 4.89756 )
							ret := -0.454545
						if( bbm > 4.89756 )
							ret := 0.552239
			if( bbm > 12.2402 )
				if( bullPower <= 18.4883 )
					if( bbm <= 30.9077 )
						if( ad_mf <= -228728 )
							ret := 0.882353 // buy
						if( ad_mf > -228728 )
							ret := 0.131250
					if( bbm > 30.9077 )
						ret := -0.666667
				if( bullPower > 18.4883 )
					if( mf <= -0.045432 )
						ret := 0.666667
					if( mf > -0.045432 )
						ret := 1.000000 // buy
	if( ad_mf > 5595.42 )
		if( ad_mf <= 7758.19 )
			if( bearPower <= -13.2666 )
				ret := 0.833333 // buy
			if( bearPower > -13.2666 )
				if( bbm <= 2.11257 )
					if( bbp <= 10.8298 )
						if( bullPower <= 1.7708 )
							ret := -0.112245
						if( bullPower > 1.7708 )
							ret := 0.206349
					if( bbp > 10.8298 )
						ret := -0.800000 // sell
				if( bbm > 2.11257 )
					if( bearPower <= -0.336761 )
						if( bbp <= -5.78292 )
							ret := -0.634615
						if( bbp > -5.78292 )
							ret := -0.245902
					if( bearPower > -0.336761 )
						if( ad <= 6697.13 )
							ret := -0.348837
						if( ad > 6697.13 )
							ret := -0.824324 // sell
		if( ad_mf > 7758.19 )
			if( bearPower <= -19.0364 )
				if( mf <= -0.309839 )
					ret := 1.000000 // buy
				if( mf > -0.309839 )
					if( mf <= -0.011058 )
						if( bbm <= 11.8404 )
							ret := -0.166667
						if( bbm > 11.8404 )
							ret := -0.782609 // sell
					if( mf > -0.011058 )
						if( bbp <= -39.3085 )
							ret := -0.428571
						if( bbp > -39.3085 )
							ret := -1.000000 // sell
			if( bearPower > -19.0364 )
				if( mf <= -0.253982 )
					if( ad <= 34523.2 )
						if( bbp <= 11.7024 )
							ret := -0.101124
						if( bbp > 11.7024 )
							ret := 1.000000 // buy
					if( ad > 34523.2 )
						if( bullPower <= 10.1415 )
							ret := 0.813559 // buy
						if( bullPower > 10.1415 )
							ret := -0.500000
				if( mf > -0.253982 )
					if( bullPower <= 0.54877 )
						if( bullPower <= -5.04455 )
							ret := 0.194175
						if( bullPower > -5.04455 )
							ret := -0.177820
					if( bullPower > 0.54877 )
						if( bearPower <= -8.22415 )
							ret := -0.743590 // sell
						if( bearPower > -8.22415 )
							ret := -0.005349
	
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
float op_operation = decision_tree_0_EPAM_1Hour_b823603e(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


