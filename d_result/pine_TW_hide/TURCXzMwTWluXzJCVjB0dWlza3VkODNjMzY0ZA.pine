//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: MDB_30Min_2BV0_d83c364d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_30Min_2BV0_d83c364d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_30Min_d83c364d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP_VIM <= -0.068937 )
		if( bearPower <= 0.455697 )
			if( bbm <= 0.33733 )
				if( VIM <= 1.59053 )
					if( bbm <= 0.061557 )
						if( VIP <= 0.849715 )
							ret := -0.212598
						if( VIP > 0.849715 )
							ret := 0.052448
					if( bbm > 0.061557 )
						if( VIM <= 1.47866 )
							ret := 0.210075
						if( VIM > 1.47866 )
							ret := -0.325581
				if( VIM > 1.59053 )
					if( bearPower <= -3.09234 )
						if( bearPower <= -5.74116 )
							ret := 0.482759
						if( bearPower > -5.74116 )
							ret := -0.272727
					if( bearPower > -3.09234 )
						if( VIP <= 1.00246 )
							ret := 0.255556
						if( VIP > 1.00246 )
							ret := 0.613636
			if( bbm > 0.33733 )
				if( bbp <= 4.63842 )
					if( VIP_VIM <= -0.821302 )
						if( bbp <= -40.9343 )
							ret := -0.614035
						if( bbp > -40.9343 )
							ret := 0.251497
					if( VIP_VIM > -0.821302 )
						if( bbm <= 6.24053 )
							ret := -0.068765
						if( bbm > 6.24053 )
							ret := 0.034140
				if( bbp > 4.63842 )
					if( bearPower <= -1.01148 )
						if( bbm <= 10.3655 )
							ret := -0.769231 // sell
						if( bbm > 10.3655 )
							ret := 0.333333
					if( bearPower > -1.01148 )
						if( VIM <= 1.03064 )
							ret := -0.500000
						if( VIM > 1.03064 )
							ret := 0.862745 // buy
		if( bearPower > 0.455697 )
			if( bbp <= 6.84531 )
				if( bullPower <= 2.77071 )
					if( bearPower <= 2.18476 )
						if( VIP <= 0.987352 )
							ret := -0.136612
						if( VIP > 0.987352 )
							ret := -0.392857
					if( bearPower > 2.18476 )
						if( bearPower <= 2.67667 )
							ret := -0.943662 // sell
						if( bearPower > 2.67667 )
							ret := -0.500000
				if( bullPower > 2.77071 )
					if( bbp <= 6.26703 )
						if( bullPower <= 2.851 )
							ret := 0.833333 // buy
						if( bullPower > 2.851 )
							ret := 0.089286
					if( bbp > 6.26703 )
						if( VIP <= 1.28538 )
							ret := -0.642857
						if( VIP > 1.28538 )
							ret := 1.000000 // buy
			if( bbp > 6.84531 )
				if( bbp <= 11.2601 )
					if( bullPower <= 3.61131 )
						ret := -1.000000 // sell
					if( bullPower > 3.61131 )
						if( VIP <= 1.31122 )
							ret := 0.311475
						if( VIP > 1.31122 )
							ret := 0.866667 // buy
				if( bbp > 11.2601 )
					ret := -0.200000
	if( VIP_VIM > -0.068937 )
		if( bearPower <= 0.51186 )
			if( VIP <= 1.41661 )
				if( bbp <= -4.17554 )
					if( bullPower <= -2.48432 )
						if( bearPower <= -6.19466 )
							ret := -0.200000
						if( bearPower > -6.19466 )
							ret := 0.306011
					if( bullPower > -2.48432 )
						if( VIP <= 0.975203 )
							ret := 0.289474
						if( VIP > 0.975203 )
							ret := -0.352941
				if( bbp > -4.17554 )
					if( VIP_VIM <= 0.489508 )
						if( VIM <= 1.13353 )
							ret := 0.082019
						if( VIM > 1.13353 )
							ret := -0.044872
					if( VIP_VIM > 0.489508 )
						if( bbp <= 1.00025 )
							ret := -0.450495
						if( bbp > 1.00025 )
							ret := -0.090909
			if( VIP > 1.41661 )
				if( bullPower <= 1.62198 )
					if( VIM <= 0.870103 )
						if( bbp <= 1.55029 )
							ret := 0.678322
						if( bbp > 1.55029 )
							ret := -0.461538
					if( VIM > 0.870103 )
						if( bbp <= -1.17981 )
							ret := 0.418033
						if( bbp > -1.17981 )
							ret := 0.112710
				if( bullPower > 1.62198 )
					if( bbp <= 3.19586 )
						if( bearPower <= 0.242954 )
							ret := 0.081301
						if( bearPower > 0.242954 )
							ret := -0.642857
					if( bbp > 3.19586 )
						if( bbm <= 2.339 )
							ret := 1.000000 // buy
						if( bbm > 2.339 )
							ret := -0.428571
		if( bearPower > 0.51186 )
			if( bbm <= 0.653981 )
				if( VIP <= 1.34436 )
					if( bearPower <= 0.694605 )
						if( bbp <= 1.66513 )
							ret := -0.365188
						if( bbp > 1.66513 )
							ret := 0.270270
					if( bearPower > 0.694605 )
						if( bbm <= 0.001213 )
							ret := -0.074338
						if( bbm > 0.001213 )
							ret := 0.214863
				if( VIP > 1.34436 )
					if( VIP_VIM <= 0.694116 )
						if( VIP_VIM <= 0.318873 )
							ret := -0.019324
						if( VIP_VIM > 0.318873 )
							ret := -0.394904
					if( VIP_VIM > 0.694116 )
						if( bbp <= 1.53781 )
							ret := 0.638298
						if( bbp > 1.53781 )
							ret := -0.061100
			if( bbm > 0.653981 )
				if( bbp <= 1.97534 )
					if( bearPower <= 0.534624 )
						ret := -0.363636
					if( bearPower > 0.534624 )
						if( VIM <= 1.00129 )
							ret := 0.852459 // buy
						if( VIM > 1.00129 )
							ret := -0.333333
				if( bbp > 1.97534 )
					if( VIM <= 0.570233 )
						if( VIP <= 1.46646 )
							ret := 0.061538
						if( VIP > 1.46646 )
							ret := 0.532164
					if( VIM > 0.570233 )
						if( bbm <= 15.9768 )
							ret := 0.033097
						if( bbm > 15.9768 )
							ret := -0.826087 // sell
	
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
float op_operation = decision_tree_0_MDB_30Min_d83c364d(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


