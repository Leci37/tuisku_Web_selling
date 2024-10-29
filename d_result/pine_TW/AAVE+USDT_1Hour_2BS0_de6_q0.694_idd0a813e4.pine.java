//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AAVEUSDT_1Hour_2BS0_d0a813e4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_1Hour_2BS0_d0a813e4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_1Hour_d0a813e4(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 1.51351 )
		if( rsi1 <= 52.9594 )
			if( bbp <= -0.863502 )
				if( rsi1 <= 32.6781 )
					if( d_k <= -5.3992 )
						if( d <= 9.00909 )
							ret := 0.651982
						if( d > 9.00909 )
							ret := 0.007109
					if( d_k > -5.3992 )
						if( rsi1 <= 16.9882 )
							ret := -0.500000
						if( rsi1 > 16.9882 )
							ret := -0.172840
				if( rsi1 > 32.6781 )
					if( smoothK_k <= -0.343507 )
						if( bbm <= 1.52439 )
							ret := 0.147727
						if( bbm > 1.52439 )
							ret := -0.462633
					if( smoothK_k > -0.343507 )
						if( bullPower <= -0.905753 )
							ret := 0.498161
						if( bullPower > -0.905753 )
							ret := 0.174994
			if( bbp > -0.863502 )
				if( smoothK_k <= 96.2689 )
					if( bbp <= 1.14279 )
						if( bbm <= 0.805221 )
							ret := -0.091310
						if( bbm > 0.805221 )
							ret := -0.209625
					if( bbp > 1.14279 )
						if( smoothK_k <= 95.4589 )
							ret := -0.428571
						if( smoothK_k > 95.4589 )
							ret := 0.344828
				if( smoothK_k > 96.2689 )
					if( bbm <= 1.163 )
						if( bbp <= 0.383729 )
							ret := 0.215686
						if( bbp > 0.383729 )
							ret := -0.764706 // sell
					if( bbm > 1.163 )
						if( k <= 99.8143 )
							ret := 0.902439 // buy
						if( k > 99.8143 )
							ret := 0.505747
		if( rsi1 > 52.9594 )
			if( bbp <= 2.29303 )
				if( bearPower <= -0.30885 )
					if( rsi1 <= 60.9678 )
						if( d <= 25.4833 )
							ret := 0.630631
						if( d > 25.4833 )
							ret := 0.432480
					if( rsi1 > 60.9678 )
						if( smoothD_d <= 58.1466 )
							ret := 0.862144 // buy
						if( smoothD_d > 58.1466 )
							ret := 0.543276
				if( bearPower > -0.30885 )
					if( bbm <= 0.401182 )
						if( rsi1 <= 76.7251 )
							ret := 0.058824
						if( rsi1 > 76.7251 )
							ret := 0.430769
					if( bbm > 0.401182 )
						if( rsi1 <= 70.5132 )
							ret := 0.239348
						if( rsi1 > 70.5132 )
							ret := 0.609813
			if( bbp > 2.29303 )
				if( rsi1 <= 77.7179 )
					if( bearPower <= 1.14616 )
						if( smoothD_d <= 35.8048 )
							ret := 0.409009
						if( smoothD_d > 35.8048 )
							ret := 0.151755
					if( bearPower > 1.14616 )
						if( d <= 3.05716 )
							ret := 0.918919 // buy
						if( d > 3.05716 )
							ret := -0.012201
				if( rsi1 > 77.7179 )
					if( smoothK_k <= 96.3789 )
						if( bullPower <= 35.6581 )
							ret := 0.404348
						if( bullPower > 35.6581 )
							ret := -0.459459
					if( smoothK_k > 96.3789 )
						if( smoothD_d <= 96.9678 )
							ret := 0.735060 // buy
						if( smoothD_d > 96.9678 )
							ret := 0.321429
	if( d_k > 1.51351 )
		if( bearPower <= -2.32517 )
			if( rsi1 <= 44.652 )
				if( rsi1 <= 33.555 )
					if( d_k <= 15.0001 )
						if( bbm <= 2.37634 )
							ret := -0.092593
						if( bbm > 2.37634 )
							ret := -0.371644
					if( d_k > 15.0001 )
						if( smoothD_d <= 48.3103 )
							ret := -0.768966 // sell
						if( smoothD_d > 48.3103 )
							ret := -0.304348
				if( rsi1 > 33.555 )
					if( bullPower <= 4.51015 )
						if( d_k <= 4.4452 )
							ret := 0.115646
						if( d_k > 4.4452 )
							ret := -0.154808
					if( bullPower > 4.51015 )
						if( d_k <= 21.5113 )
							ret := -0.872549 // sell
						if( d_k > 21.5113 )
							ret := 0.500000
			if( rsi1 > 44.652 )
				if( bullPower <= 1.98982 )
					if( d_k <= 1.73775 )
						if( bearPower <= -9.69013 )
							ret := 0.600000
						if( bearPower > -9.69013 )
							ret := -0.863636 // sell
					if( d_k > 1.73775 )
						if( bbm <= 11.8928 )
							ret := 0.399522
						if( bbm > 11.8928 )
							ret := -0.237288
				if( bullPower > 1.98982 )
					if( bullPower <= 20.4795 )
						if( bbm <= 22.176 )
							ret := -0.036190
						if( bbm > 22.176 )
							ret := 0.562500
					if( bullPower > 20.4795 )
						if( d <= 87.4912 )
							ret := -0.906250 // sell
						if( d > 87.4912 )
							ret := 1.000000 // buy
		if( bearPower > -2.32517 )
			if( d_k <= 8.13124 )
				if( smoothD_d <= 45.1145 )
					if( rsi1 <= 48.5763 )
						if( bbp <= 0.678374 )
							ret := -0.321016
						if( bbp > 0.678374 )
							ret := -0.684385
					if( rsi1 > 48.5763 )
						if( bearPower <= -0.083591 )
							ret := 0.173540
						if( bearPower > -0.083591 )
							ret := -0.263254
				if( smoothD_d > 45.1145 )
					if( rsi1 <= 52.3256 )
						if( bullPower <= 0.496292 )
							ret := -0.096436
						if( bullPower > 0.496292 )
							ret := -0.426606
					if( rsi1 > 52.3256 )
						if( smoothD_d <= 90.6274 )
							ret := 0.119635
						if( smoothD_d > 90.6274 )
							ret := -0.255835
			if( d_k > 8.13124 )
				if( d <= 87.218 )
					if( rsi1 <= 46.0602 )
						if( bullPower <= 1.14798 )
							ret := -0.469880
						if( bullPower > 1.14798 )
							ret := -0.750000 // sell
					if( rsi1 > 46.0602 )
						if( BBPower_Color <= 0.5 )
							ret := 0.094949
						if( BBPower_Color > 0.5 )
							ret := -0.241484
				if( d > 87.218 )
					if( bbm <= 0.801024 )
						if( bbm <= 0.583174 )
							ret := -0.031250
						if( bbm > 0.583174 )
							ret := -0.354167
					if( bbm > 0.801024 )
						if( bullPower <= 17.1347 )
							ret := -0.763265 // sell
						if( bullPower > 17.1347 )
							ret := 0.500000
	
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AAVEUSDT_1Hour_d0a813e4(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


