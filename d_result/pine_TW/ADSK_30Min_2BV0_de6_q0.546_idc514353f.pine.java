//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ADSK_30Min_2BV0_c514353f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_30Min_2BV0_c514353f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_30Min_c514353f(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bbm <= 0.920528 )
		if( bearPower <= 1.67694 )
			if( VIM <= 1.52945 )
				if( bullPower <= -1.83214 )
					if( bearPower <= -1.95019 )
						if( VIP_VIM <= 0.020156 )
							ret := -0.170878
						if( VIP_VIM > 0.020156 )
							ret := 0.346154
					if( bearPower > -1.95019 )
						if( VIP <= 0.783413 )
							ret := -0.944444 // sell
						if( VIP > 0.783413 )
							ret := -0.375000
				if( bullPower > -1.83214 )
					if( bearPower <= 1.05167 )
						if( bearPower <= 0.760788 )
							ret := 0.046517
						if( bearPower > 0.760788 )
							ret := -0.066463
					if( bearPower > 1.05167 )
						if( VIM <= 1.1042 )
							ret := 0.051444
						if( VIM > 1.1042 )
							ret := 0.465190
			if( VIM > 1.52945 )
				if( VIP_VIM <= -0.135494 )
					if( bearPower <= 1.36271 )
						if( VIP <= 0.75658 )
							ret := 0.056818
						if( VIP > 0.75658 )
							ret := 0.347352
					if( bearPower > 1.36271 )
						ret := -0.750000 // sell
				if( VIP_VIM > -0.135494 )
					if( VIM <= 2.7768 )
						if( bbp <= -4.0982 )
							ret := 0.481481
						if( bbp > -4.0982 )
							ret := -0.319588
					if( VIM > 2.7768 )
						ret := 0.809524 // buy
		if( bearPower > 1.67694 )
			if( VIM <= 0.973069 )
				if( bearPower <= 1.83617 )
					if( VIP_VIM <= 0.594457 )
						if( VIP <= 1.26485 )
							ret := -0.058824
						if( VIP > 1.26485 )
							ret := -0.725806 // sell
					if( VIP_VIM > 0.594457 )
						if( bullPower <= 1.87073 )
							ret := 0.289474
						if( bullPower > 1.87073 )
							ret := -0.400000
				if( bearPower > 1.83617 )
					if( bbp <= 4.50751 )
						if( bullPower <= 2.0454 )
							ret := 0.194805
						if( bullPower > 2.0454 )
							ret := 0.663366
					if( bbp > 4.50751 )
						if( bullPower <= 2.60312 )
							ret := -0.493333
						if( bullPower > 2.60312 )
							ret := 0.075601
			if( VIM > 0.973069 )
				if( bullPower <= 2.18436 )
					if( bbp <= 3.72579 )
						if( VIM <= 1.15891 )
							ret := -1.000000 // sell
						if( VIM > 1.15891 )
							ret := -0.687500
					if( bbp > 3.72579 )
						if( VIP <= 1.53507 )
							ret := -0.422222
						if( VIP > 1.53507 )
							ret := -0.916667 // sell
				if( bullPower > 2.18436 )
					if( bearPower <= 2.14302 )
						if( VIP_VIM <= 0.214683 )
							ret := -0.470588
						if( VIP_VIM > 0.214683 )
							ret := 0.558140
					if( bearPower > 2.14302 )
						if( VIP_VIM <= 0.407341 )
							ret := -0.257246
						if( VIP_VIM > 0.407341 )
							ret := -0.750000 // sell
	if( bbm > 0.920528 )
		if( VIM <= 0.915753 )
			if( bullPower <= 0.670084 )
				if( bbm <= 3.54332 )
					if( VIP <= 1.09014 )
						if( VIP_VIM <= 0.196716 )
							ret := 0.250000
						if( VIP_VIM > 0.196716 )
							ret := -0.428571
					if( VIP > 1.09014 )
						if( bearPower <= -0.791668 )
							ret := 0.738095 // buy
						if( bearPower > -0.791668 )
							ret := 0.285714
				if( bbm > 3.54332 )
					ret := -0.777778 // sell
			if( bullPower > 0.670084 )
				if( VIP <= 1.59693 )
					if( bbm <= 1.45906 )
						if( bullPower <= 3.81969 )
							ret := -0.043149
						if( bullPower > 3.81969 )
							ret := -0.300546
					if( bbm > 1.45906 )
						if( bbp <= 8.94712 )
							ret := 0.105347
						if( bbp > 8.94712 )
							ret := -0.239216
				if( VIP > 1.59693 )
					if( VIP <= 1.82556 )
						if( bearPower <= 2.47192 )
							ret := 0.114754
						if( bearPower > 2.47192 )
							ret := 0.640351
					if( VIP > 1.82556 )
						if( bearPower <= 3.74566 )
							ret := 0.555556
						if( bearPower > 3.74566 )
							ret := -0.705882 // sell
		if( VIM > 0.915753 )
			if( bearPower <= 2.04982 )
				if( bbm <= 6.95824 )
					if( VIM <= 1.59351 )
						if( bbm <= 2.85156 )
							ret := -0.037345
						if( bbm > 2.85156 )
							ret := -0.132880
					if( VIM > 1.59351 )
						if( bbm <= 2.66399 )
							ret := 0.075581
						if( bbm > 2.66399 )
							ret := 0.821429 // buy
				if( bbm > 6.95824 )
					if( bbm <= 8.25665 )
						if( VIP <= 0.715031 )
							ret := -0.833333 // sell
						if( VIP > 0.715031 )
							ret := 0.855072 // buy
					if( bbm > 8.25665 )
						if( bullPower <= 4.88107 )
							ret := 0.412698
						if( bullPower > 4.88107 )
							ret := -0.324324
			if( bearPower > 2.04982 )
				if( bbp <= 14.6432 )
					if( bbm <= 1.78991 )
						if( bearPower <= 2.26409 )
							ret := -0.641026
						if( bearPower > 2.26409 )
							ret := -0.011976
					if( bbm > 1.78991 )
						if( bbp <= 8.86873 )
							ret := -0.484211
						if( bbp > 8.86873 )
							ret := -0.793103 // sell
				if( bbp > 14.6432 )
					if( bbm <= 1.9786 )
						ret := -0.200000
					if( bbm > 1.9786 )
						ret := 0.916667 // buy
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_ADSK_30Min_c514353f(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


