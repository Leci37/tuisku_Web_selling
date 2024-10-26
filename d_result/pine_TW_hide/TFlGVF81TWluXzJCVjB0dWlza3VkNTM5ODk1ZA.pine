//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: LYFT_5Min_2BV0_d539895d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_5Min_2BV0_d539895d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_5Min_d539895d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.019775 )
		if( VIP <= 1.50519 )
			if( VIP_VIM <= -0.597331 )
				if( bullPower <= -0.24504 )
					if( VIM <= 1.46066 )
						if( VIM <= 1.32401 )
							ret := 0.818182 // buy
						if( VIM > 1.32401 )
							ret := -0.844444 // sell
					if( VIM > 1.46066 )
						if( bbm <= 0.230509 )
							ret := 0.529412
						if( bbm > 0.230509 )
							ret := -1.000000 // sell
				if( bullPower > -0.24504 )
					if( VIM <= 1.51582 )
						if( bbp <= -0.112144 )
							ret := 0.165043
						if( bbp > -0.112144 )
							ret := -0.154008
					if( VIM > 1.51582 )
						if( bearPower <= -0.031864 )
							ret := 0.361702
						if( bearPower > -0.031864 )
							ret := 0.022901
			if( VIP_VIM > -0.597331 )
				if( bullPower <= -0.263816 )
					if( bearPower <= -0.492045 )
						if( bbm <= 0.253091 )
							ret := 0.000000
						if( bbm > 0.253091 )
							ret := 1.000000 // buy
					if( bearPower > -0.492045 )
						ret := -1.000000 // sell
				if( bullPower > -0.263816 )
					if( VIP <= 0.659757 )
						if( bullPower <= -0.02999 )
							ret := 0.000000
						if( bullPower > -0.02999 )
							ret := 0.971429 // buy
					if( VIP > 0.659757 )
						if( bbm <= 0.020366 )
							ret := 0.056216
						if( bbm > 0.020366 )
							ret := -0.033219
		if( VIP > 1.50519 )
			if( bbp <= -0.030787 )
				if( bullPower <= -0.036046 )
					if( bbm <= 0.135981 )
						if( VIP_VIM <= -0.434472 )
							ret := 0.473354
						if( VIP_VIM > -0.434472 )
							ret := 0.724203 // buy
					if( bbm > 0.135981 )
						ret := -1.000000 // sell
				if( bullPower > -0.036046 )
					if( VIP_VIM <= 1.35122 )
						if( VIP <= 4.99204 )
							ret := 0.304318
						if( VIP > 4.99204 )
							ret := 0.757062 // buy
					if( VIP_VIM > 1.35122 )
						if( bullPower <= -0.03117 )
							ret := 1.000000 // buy
						if( bullPower > -0.03117 )
							ret := -0.750000 // sell
			if( bbp > -0.030787 )
				if( bbm <= 0.040149 )
					if( bearPower <= 0.010715 )
						if( VIM <= 26.1216 )
							ret := 0.133353
						if( VIM > 26.1216 )
							ret := -0.333333
					if( bearPower > 0.010715 )
						if( VIP <= 4.57985 )
							ret := -0.081752
						if( VIP > 4.57985 )
							ret := 0.277778
				if( bbm > 0.040149 )
					if( VIP_VIM <= -0.748799 )
						ret := 1.000000 // buy
					if( VIP_VIM > -0.748799 )
						if( VIP <= 1.62911 )
							ret := 0.153846
						if( VIP > 1.62911 )
							ret := -0.700000 // sell
	if( bullPower > 0.019775 )
		if( bbm <= 0.009941 )
			if( VIP_VIM <= 1.3079 )
				if( bullPower <= 0.026773 )
					if( bbp <= 0.039596 )
						if( VIP <= 1.10503 )
							ret := -0.857143 // sell
						if( VIP > 1.10503 )
							ret := 0.276923
					if( bbp > 0.039596 )
						if( VIM <= 0.80227 )
							ret := 0.900000 // buy
						if( VIM > 0.80227 )
							ret := -0.236615
				if( bullPower > 0.026773 )
					if( VIM <= 0.888939 )
						if( bbm <= 0.0098 )
							ret := 0.122222
						if( bbm > 0.0098 )
							ret := -0.500000
					if( VIM > 0.888939 )
						if( bbm <= 1e-05 )
							ret := -0.343220
						if( bbm > 1e-05 )
							ret := -0.597701
			if( VIP_VIM > 1.3079 )
				if( VIM <= 1.72293 )
					if( VIM <= 1.05259 )
						ret := -0.200000
					if( VIM > 1.05259 )
						ret := -1.000000 // sell
				if( VIM > 1.72293 )
					if( VIP <= 8.31066 )
						if( bbm <= 0.004724 )
							ret := 0.830508 // buy
						if( bbm > 0.004724 )
							ret := -1.000000 // sell
					if( VIP > 8.31066 )
						if( VIP_VIM <= 1.39994 )
							ret := -1.000000 // sell
						if( VIP_VIM > 1.39994 )
							ret := -0.190476
		if( bbm > 0.009941 )
			if( VIP <= 1.9041 )
				if( VIP_VIM <= 0.251224 )
					if( VIP <= 0.820213 )
						if( VIM <= 1.02983 )
							ret := 0.662338
						if( VIM > 1.02983 )
							ret := 0.170290
					if( VIP > 0.820213 )
						if( VIP_VIM <= 0.102215 )
							ret := -0.022698
						if( VIP_VIM > 0.102215 )
							ret := -0.107040
				if( VIP_VIM > 0.251224 )
					if( bullPower <= 3.50694 )
						if( VIP_VIM <= 1.00189 )
							ret := 0.018344
						if( VIP_VIM > 1.00189 )
							ret := 0.471429
					if( bullPower > 3.50694 )
						ret := -1.000000 // sell
			if( VIP > 1.9041 )
				if( VIP_VIM <= -0.099751 )
					if( VIP_VIM <= -0.550471 )
						if( VIM <= 2.98911 )
							ret := 0.500000
						if( VIM > 2.98911 )
							ret := -0.482143
					if( VIP_VIM > -0.550471 )
						if( bbp <= 0.041303 )
							ret := 0.648936
						if( bbp > 0.041303 )
							ret := 0.296610
				if( VIP_VIM > -0.099751 )
					if( VIP <= 2.65101 )
						if( VIM <= 2.13333 )
							ret := -0.319805
						if( VIM > 2.13333 )
							ret := -0.756579 // sell
					if( VIP > 2.65101 )
						if( bbp <= 0.124386 )
							ret := 0.024000
						if( bbp > 0.124386 )
							ret := -0.433333
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_LYFT_5Min_d539895d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


