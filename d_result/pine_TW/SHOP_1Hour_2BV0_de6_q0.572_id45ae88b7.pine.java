//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: SHOP_1Hour_2BV0_45ae88b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Hour_2BV0_45ae88b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Hour_45ae88b7(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP_VIM <= -0.350978 )
		if( bbm <= 24.0075 )
			if( bearPower <= -0.102299 )
				if( bullPower <= -3.74776 )
					if( VIP <= 0.872608 )
						if( bbp <= -62.861 )
							ret := 0.109589
						if( bbp > -62.861 )
							ret := -0.310944
					if( VIP > 0.872608 )
						if( VIP <= 2.79924 )
							ret := 0.163743
						if( VIP > 2.79924 )
							ret := -0.894737 // sell
				if( bullPower > -3.74776 )
					if( VIP <= 0.559043 )
						if( bbm <= 0.354309 )
							ret := -0.230769
						if( bbm > 0.354309 )
							ret := 0.660377
					if( VIP > 0.559043 )
						if( VIM <= 1.43078 )
							ret := -0.031160
						if( VIM > 1.43078 )
							ret := -0.326007
			if( bearPower > -0.102299 )
				if( bullPower <= 0.097866 )
					if( bbp <= -0.060129 )
						ret := -0.833333 // sell
					if( bbp > -0.060129 )
						if( bbp <= -0.034762 )
							ret := 0.666667
						if( bbp > -0.034762 )
							ret := 0.000000
				if( bullPower > 0.097866 )
					if( VIP <= 1.15525 )
						if( bbp <= 1.71694 )
							ret := -0.685714
						if( bbp > 1.71694 )
							ret := -0.916667 // sell
					if( VIP > 1.15525 )
						ret := 0.000000
		if( bbm > 24.0075 )
			if( bullPower <= 20.8244 )
				if( VIP_VIM <= -0.778402 )
					if( VIP <= 0.582239 )
						if( bbp <= -73.0068 )
							ret := -0.235294
						if( bbp > -73.0068 )
							ret := 0.900000 // buy
					if( VIP > 0.582239 )
						if( bbm <= 28.4049 )
							ret := -1.000000 // sell
						if( bbm > 28.4049 )
							ret := -0.416667
				if( VIP_VIM > -0.778402 )
					if( bbp <= -18.4006 )
						if( VIM <= 1.25368 )
							ret := 0.007874
						if( VIM > 1.25368 )
							ret := 0.402542
					if( bbp > -18.4006 )
						if( bbm <= 30.206 )
							ret := -0.250000
						if( bbm > 30.206 )
							ret := -1.000000 // sell
			if( bullPower > 20.8244 )
				ret := 1.000000 // buy
	if( VIP_VIM > -0.350978 )
		if( VIP_VIM <= 0.493253 )
			if( bearPower <= 7.39799 )
				if( VIP <= 1.34182 )
					if( VIM <= 1.16502 )
						if( bbp <= 37.4073 )
							ret := 0.000130
						if( bbp > 37.4073 )
							ret := -0.478723
					if( VIM > 1.16502 )
						if( bearPower <= -7.76316 )
							ret := 0.000000
						if( bearPower > -7.76316 )
							ret := 0.140699
				if( VIP > 1.34182 )
					if( VIM <= 0.986538 )
						if( bbm <= 0.374986 )
							ret := 0.452381
						if( bbm > 0.374986 )
							ret := -0.053191
					if( VIM > 0.986538 )
						if( bearPower <= -2.02948 )
							ret := 0.875000 // buy
						if( bearPower > -2.02948 )
							ret := 0.301887
			if( bearPower > 7.39799 )
				if( bbp <= 26.4335 )
					if( bullPower <= 10.8174 )
						if( bbp <= 20.4674 )
							ret := -0.282828
						if( bbp > 20.4674 )
							ret := 0.900000 // buy
					if( bullPower > 10.8174 )
						if( VIP <= 1.09167 )
							ret := 0.368421
						if( VIP > 1.09167 )
							ret := -0.586614
				if( bbp > 26.4335 )
					if( VIM <= 0.852533 )
						if( bearPower <= 11.1898 )
							ret := 0.597701
						if( bearPower > 11.1898 )
							ret := 0.160000
					if( VIM > 0.852533 )
						if( VIM <= 1.03608 )
							ret := -0.115591
						if( VIM > 1.03608 )
							ret := -0.652174
		if( VIP_VIM > 0.493253 )
			if( VIM <= 0.79779 )
				if( bbm <= 22.3685 )
					if( bullPower <= 41.7848 )
						if( bbp <= 1.02433 )
							ret := 0.295918
						if( bbp > 1.02433 )
							ret := 0.071072
					if( bullPower > 41.7848 )
						if( bbm <= 21.7496 )
							ret := 0.645161
						if( bbm > 21.7496 )
							ret := -0.181818
				if( bbm > 22.3685 )
					if( VIM <= 0.701537 )
						if( bullPower <= 46.6102 )
							ret := 0.342105
						if( bullPower > 46.6102 )
							ret := -0.309524
					if( VIM > 0.701537 )
						if( VIP <= 1.31143 )
							ret := -0.964286 // sell
						if( VIP > 1.31143 )
							ret := -0.515152
			if( VIM > 0.79779 )
				if( bearPower <= 16.4762 )
					if( bearPower <= 10.4649 )
						if( VIM <= 0.865289 )
							ret := 0.099150
						if( VIM > 0.865289 )
							ret := 0.448980
					if( bearPower > 10.4649 )
						if( bullPower <= 28.7882 )
							ret := 0.811475 // buy
						if( bullPower > 28.7882 )
							ret := -1.000000 // sell
				if( bearPower > 16.4762 )
					if( bearPower <= 27.8402 )
						if( bbp <= 54.6972 )
							ret := -0.020408
						if( bbp > 54.6972 )
							ret := -0.875000 // sell
					if( bearPower > 27.8402 )
						ret := 0.727273 // buy
	
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
float op_operation = decision_tree_0_SHOP_1Hour_45ae88b7(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)

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


