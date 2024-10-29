//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: MDB_1Hour_2BC0_62f997f3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_1Hour_2BC0_62f997f3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_1Hour_62f997f3(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bbp <= -0.827467 )
		if( bbm <= 15.1934 )
			if( ad_mf <= 210421 )
				if( ad <= 171896 )
					if( ad_mf <= 168860 )
						if( bearPower <= -0.453062 )
							ret := -0.024026
						if( bearPower > -0.453062 )
							ret := -0.857143 // sell
					if( ad_mf > 168860 )
						if( ad <= 170493 )
							ret := -1.000000 // sell
						if( ad > 170493 )
							ret := -0.615385
				if( ad > 171896 )
					if( bbm <= 7.46917 )
						if( ad_mf <= 201177 )
							ret := 0.730337 // buy
						if( ad_mf > 201177 )
							ret := -0.250000
					if( bbm > 7.46917 )
						if( mf <= 0.046101 )
							ret := -0.826087 // sell
						if( mf > 0.046101 )
							ret := 0.461538
			if( ad_mf > 210421 )
				if( ad_mf <= 299219 )
					if( mf <= 0.015732 )
						if( mf <= -0.128868 )
							ret := -0.444444
						if( mf > -0.128868 )
							ret := -0.870968 // sell
					if( mf > 0.015732 )
						if( bullPower <= 0.163038 )
							ret := -0.022222
						if( bullPower > 0.163038 )
							ret := -0.681818
				if( ad_mf > 299219 )
					if( mf <= 0.043032 )
						if( ad <= 359198 )
							ret := 0.904762 // buy
						if( ad > 359198 )
							ret := 0.227273
					if( mf > 0.043032 )
						if( bearPower <= -7.96077 )
							ret := -0.733333 // sell
						if( bearPower > -7.96077 )
							ret := -0.087500
		if( bbm > 15.1934 )
			if( ad <= -232024 )
				if( ad <= -792662 )
					ret := -1.000000 // sell
				if( ad > -792662 )
					if( bbm <= 17.2217 )
						ret := 0.235294
					if( bbm > 17.2217 )
						if( bullPower <= -1.05577 )
							ret := 0.625000
						if( bullPower > -1.05577 )
							ret := 1.000000 // buy
			if( ad > -232024 )
				if( bearPower <= -10.0714 )
					if( bbp <= -7.88176 )
						if( bbm <= 20.7012 )
							ret := -0.327869
						if( bbm > 20.7012 )
							ret := -0.769231 // sell
					if( bbp > -7.88176 )
						if( bullPower <= 6.27926 )
							ret := -0.846154 // sell
						if( bullPower > 6.27926 )
							ret := -1.000000 // sell
				if( bearPower > -10.0714 )
					ret := 0.066667
	if( bbp > -0.827467 )
		if( ad <= 52412.6 )
			if( ad_mf <= 15971.8 )
				if( ad_mf <= -0.169452 )
					if( ad_mf <= -0.22185 )
						if( bbp <= 22.2271 )
							ret := 0.030517
						if( bbp > 22.2271 )
							ret := 0.379032
					if( ad_mf > -0.22185 )
						if( bearPower <= 1.84403 )
							ret := 0.584615
						if( bearPower > 1.84403 )
							ret := 0.000000
				if( ad_mf > -0.169452 )
					if( mf <= 0.020389 )
						if( ad_mf <= 0.021436 )
							ret := -0.133333
						if( ad_mf > 0.021436 )
							ret := 0.164041
					if( mf > 0.020389 )
						if( mf <= 0.323825 )
							ret := -0.101449
						if( mf > 0.323825 )
							ret := -0.421965
			if( ad_mf > 15971.8 )
				if( mf <= 0.119587 )
					if( bearPower <= 4.18747 )
						if( bbm <= 12.5942 )
							ret := 0.429504
						if( bbm > 12.5942 )
							ret := -0.111111
					if( bearPower > 4.18747 )
						if( mf <= -0.031286 )
							ret := 0.388889
						if( mf > -0.031286 )
							ret := -0.177778
				if( mf > 0.119587 )
					if( ad_mf <= 51386.6 )
						if( ad <= 33775.6 )
							ret := 0.201365
						if( ad > 33775.6 )
							ret := -0.076336
					if( ad_mf > 51386.6 )
						if( bearPower <= -0.92232 )
							ret := 1.000000 // buy
						if( bearPower > -0.92232 )
							ret := 0.727273 // buy
		if( ad > 52412.6 )
			if( ad <= 58957.2 )
				if( ad_mf <= 58027.2 )
					if( mf <= 0.084104 )
						if( bearPower <= 1.40232 )
							ret := -0.735294 // sell
						if( bearPower > 1.40232 )
							ret := -0.093750
					if( mf > 0.084104 )
						if( mf <= 0.259989 )
							ret := 0.029412
						if( mf > 0.259989 )
							ret := -0.605263
				if( ad_mf > 58027.2 )
					if( bullPower <= 1.78022 )
						ret := -1.000000 // sell
					if( bullPower > 1.78022 )
						if( bearPower <= 1.24119 )
							ret := -0.615385
						if( bearPower > 1.24119 )
							ret := -1.000000 // sell
			if( ad > 58957.2 )
				if( ad <= 88959.1 )
					if( ad <= 88408.7 )
						if( ad_mf <= 87963.2 )
							ret := 0.155589
						if( ad_mf > 87963.2 )
							ret := -0.600000
					if( ad > 88408.7 )
						if( ad <= 88565.2 )
							ret := 0.533333
						if( ad > 88565.2 )
							ret := 0.909091 // buy
				if( ad > 88959.1 )
					if( ad_mf <= 101520 )
						if( ad <= 96383.7 )
							ret := 0.029851
						if( ad > 96383.7 )
							ret := -0.576577
					if( ad_mf > 101520 )
						if( ad <= 103448 )
							ret := 0.755556 // buy
						if( ad > 103448 )
							ret := -0.024685
	
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
float op_operation = decision_tree_0_MDB_1Hour_62f997f3(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


