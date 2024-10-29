//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ASAN_30Min_2BV0_479b8606 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_30Min_2BV0_479b8606", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_30Min_479b8606(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbm <= 0.258738 )
		if( bbp <= 0.94043 )
			if( bbp <= -1.77987 )
				if( VIP_VIM <= -0.441726 )
					if( VIP <= 0.715395 )
						ret := 0.928571 // buy
					if( VIP > 0.715395 )
						if( bearPower <= -1.19601 )
							ret := -0.243902
						if( bearPower > -1.19601 )
							ret := 0.310345
				if( VIP_VIM > -0.441726 )
					if( VIP_VIM <= -0.179444 )
						if( bbp <= -4.14326 )
							ret := -0.076923
						if( bbp > -4.14326 )
							ret := 0.716667 // buy
					if( VIP_VIM > -0.179444 )
						if( VIM <= 1.10707 )
							ret := 0.166667
						if( VIM > 1.10707 )
							ret := 0.955056 // buy
			if( bbp > -1.77987 )
				if( VIP <= 0.907378 )
					if( bullPower <= -0.557968 )
						if( VIP_VIM <= -0.86283 )
							ret := 0.800000 // buy
						if( VIP_VIM > -0.86283 )
							ret := -0.256198
					if( bullPower > -0.557968 )
						if( bbp <= 0.189922 )
							ret := 0.186678
						if( bbp > 0.189922 )
							ret := -0.607143
				if( VIP > 0.907378 )
					if( VIP <= 2.30633 )
						if( VIM <= 1.03697 )
							ret := 0.118951
						if( VIM > 1.03697 )
							ret := -0.033842
					if( VIP > 2.30633 )
						if( bullPower <= -0.134454 )
							ret := -0.500000
						if( bullPower > -0.134454 )
							ret := 0.791209 // buy
		if( bbp > 0.94043 )
			if( VIM <= 1.00692 )
				if( VIP <= 1.35935 )
					if( bullPower <= 1.09711 )
						if( bbm <= 0.149548 )
							ret := 0.490909
						if( bbm > 0.149548 )
							ret := -0.102564
					if( bullPower > 1.09711 )
						if( VIM <= 0.930984 )
							ret := -0.291667
						if( VIM > 0.930984 )
							ret := -0.875000 // sell
				if( VIP > 1.35935 )
					if( bullPower <= 0.544086 )
						ret := 0.555556
					if( bullPower > 0.544086 )
						if( bearPower <= 0.504775 )
							ret := -0.666667
						if( bearPower > 0.504775 )
							ret := -0.287129
			if( VIM > 1.00692 )
				if( bbm <= 0.052788 )
					if( VIP_VIM <= 0.43771 )
						if( bbp <= 1.47525 )
							ret := -0.522059
						if( bbp > 1.47525 )
							ret := -0.820513 // sell
					if( VIP_VIM > 0.43771 )
						ret := 0.384615
				if( bbm > 0.052788 )
					if( bearPower <= 0.562537 )
						if( VIP_VIM <= -0.077937 )
							ret := -0.916667 // sell
						if( VIP_VIM > -0.077937 )
							ret := 0.000000
					if( bearPower > 0.562537 )
						if( VIM <= 1.04197 )
							ret := -0.600000
						if( VIM > 1.04197 )
							ret := 0.462687
	if( bbm > 0.258738 )
		if( bullPower <= -0.229076 )
			if( bullPower <= -1.13924 )
				if( bbp <= -3.46416 )
					if( VIP <= 1.05003 )
						if( bbm <= 2.4393 )
							ret := -0.087591
						if( bbm > 2.4393 )
							ret := -0.658333
					if( VIP > 1.05003 )
						if( VIM <= 1.2405 )
							ret := 0.000000
						if( VIM > 1.2405 )
							ret := 1.000000 // buy
				if( bbp > -3.46416 )
					if( VIP_VIM <= -0.639978 )
						if( bullPower <= -1.35252 )
							ret := -1.000000 // sell
						if( bullPower > -1.35252 )
							ret := 0.076923
					if( VIP_VIM > -0.639978 )
						if( bbp <= -3.1622 )
							ret := -0.915254 // sell
						if( bbp > -3.1622 )
							ret := -0.466667
			if( bullPower > -1.13924 )
				if( VIP_VIM <= -0.228181 )
					if( bullPower <= -0.86703 )
						if( bbp <= -4.72701 )
							ret := -1.000000 // sell
						if( bbp > -4.72701 )
							ret := 0.506726
					if( bullPower > -0.86703 )
						if( VIP <= 0.691672 )
							ret := 0.268293
						if( VIP > 0.691672 )
							ret := 0.018490
				if( VIP_VIM > -0.228181 )
					if( bullPower <= -0.661071 )
						if( bbm <= 2.76687 )
							ret := 0.955882 // buy
						if( bbm > 2.76687 )
							ret := 0.000000
					if( bullPower > -0.661071 )
						if( bullPower <= -0.572842 )
							ret := -0.560000
						if( bullPower > -0.572842 )
							ret := 0.346021
		if( bullPower > -0.229076 )
			if( VIP <= 1.1132 )
				if( bbp <= -0.375893 )
					if( bbp <= -0.595926 )
						if( VIM <= 1.15829 )
							ret := 0.068123
						if( VIM > 1.15829 )
							ret := -0.316290
					if( bbp > -0.595926 )
						if( bearPower <= -0.980455 )
							ret := 0.772727 // buy
						if( bearPower > -0.980455 )
							ret := 0.080670
				if( bbp > -0.375893 )
					if( bullPower <= 0.00639 )
						if( VIP_VIM <= -0.115261 )
							ret := -0.307692
						if( VIP_VIM > -0.115261 )
							ret := -0.841270 // sell
					if( bullPower > 0.00639 )
						if( bbm <= 1.70902 )
							ret := -0.185798
						if( bbm > 1.70902 )
							ret := 0.052265
			if( VIP > 1.1132 )
				if( bullPower <= 0.596965 )
					if( VIP <= 2.21883 )
						if( VIM <= 1.32251 )
							ret := 0.114579
						if( VIM > 1.32251 )
							ret := -0.083807
					if( VIP > 2.21883 )
						if( bearPower <= 0.058493 )
							ret := -1.000000 // sell
						if( bearPower > 0.058493 )
							ret := 0.000000
				if( bullPower > 0.596965 )
					if( bearPower <= 0.258008 )
						if( bullPower <= 0.615409 )
							ret := -0.758621 // sell
						if( bullPower > 0.615409 )
							ret := -0.165247
					if( bearPower > 0.258008 )
						if( VIM <= 1.80659 )
							ret := -0.023026
						if( VIM > 1.80659 )
							ret := 0.964286 // buy
	
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
float op_operation = decision_tree_0_ASAN_30Min_479b8606(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


