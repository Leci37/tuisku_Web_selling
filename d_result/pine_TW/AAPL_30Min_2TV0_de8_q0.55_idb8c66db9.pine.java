//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: AAPL_30Min_2TV0_b8c66db9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_2TV0_b8c66db9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_b8c66db9(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 328.71 )
		if( ema2 <= 146.043 )
			if( tema <= 92.6589 )
				if( VIP_VIM <= 0.328979 )
					if( ema2 <= 93.1101 )
						if( ema13 <= -0.547423 )
							if( ema12 <= -0.343345 )
								ret := 0.000000
							if( ema12 > -0.343345 )
								if( ema13 <= -0.665547 )
									ret := -0.750000 // sell
								if( ema13 > -0.665547 )
									ret := -0.250000
						if( ema13 > -0.547423 )
							if( ema2 <= 90.5656 )
								if( ema13 <= -0.211236 )
									ret := 0.250000
								if( ema13 > -0.211236 )
									ret := 1.000000 // buy
							if( ema2 > 90.5656 )
								if( ema2 <= 90.6731 )
									ret := -0.222222
								if( ema2 > 90.6731 )
									ret := 0.587302
					if( ema2 > 93.1101 )
						if( ema12 <= -0.732127 )
							if( ema12 <= -0.763546 )
								ret := 1.000000 // buy
							if( ema12 > -0.763546 )
								ret := 0.500000
						if( ema12 > -0.732127 )
							ret := 1.000000 // buy
				if( VIP_VIM > 0.328979 )
					if( ema13 <= 0.658046 )
						if( ema13 <= 0.408202 )
							ret := -0.500000
						if( ema13 > 0.408202 )
							ret := -1.000000 // sell
					if( ema13 > 0.658046 )
						ret := 1.000000 // buy
			if( tema > 92.6589 )
				if( ema13 <= -1.76008 )
					if( tema <= 136.865 )
						if( ema2 <= 99.5394 )
							if( ema12 <= -1.2161 )
								ret := -1.000000 // sell
							if( ema12 > -1.2161 )
								ret := 0.000000
						if( ema2 > 99.5394 )
							if( ema3 <= 135.198 )
								if( ema1 <= 119.304 )
									ret := 0.751938 // buy
								if( ema1 > 119.304 )
									ret := 0.091837
							if( ema3 > 135.198 )
								if( VIM <= 1.27605 )
									ret := 0.919355 // buy
								if( VIM > 1.27605 )
									ret := 0.657895
					if( tema > 136.865 )
						if( ema3 <= 146.778 )
							if( ema3 <= 143.337 )
								if( ema12 <= -0.900902 )
									ret := -0.470588
								if( ema12 > -0.900902 )
									ret := 0.470588
							if( ema3 > 143.337 )
								if( ema2 <= 142.691 )
									ret := 0.823529 // buy
								if( ema2 > 142.691 )
									ret := 0.125000
						if( ema3 > 146.778 )
							if( VIP <= 0.805429 )
								ret := -1.000000 // sell
							if( VIP > 0.805429 )
								if( ema1 <= 132.266 )
									ret := -1.000000 // sell
								if( ema1 > 132.266 )
									ret := 0.000000
				if( ema13 > -1.76008 )
					if( ema2 <= 100.771 )
						if( ema2 <= 99.7451 )
							if( ema13 <= -1.34892 )
								if( VIP <= 0.857412 )
									ret := 0.790698 // buy
								if( VIP > 0.857412 )
									ret := -0.333333
							if( ema13 > -1.34892 )
								if( ema13 <= -0.576646 )
									ret := -0.313253
								if( ema13 > -0.576646 )
									ret := 0.041203
						if( ema2 > 99.7451 )
							if( VIM <= 1.21884 )
								if( VIP <= 1.1657 )
									ret := -0.520619
								if( VIP > 1.1657 )
									ret := -0.070175
							if( VIM > 1.21884 )
								if( ema3 <= 100.061 )
									ret := 0.000000
								if( ema3 > 100.061 )
									ret := 0.421053
					if( ema2 > 100.771 )
						if( VIM <= 0.754057 )
							if( tema <= 147.019 )
								if( ema1 <= 101.927 )
									ret := -0.727273 // sell
								if( ema1 > 101.927 )
									ret := 0.232658
							if( tema > 147.019 )
								if( ema3 <= 144.233 )
									ret := 0.208333
								if( ema3 > 144.233 )
									ret := -0.604651
						if( VIM > 0.754057 )
							if( ema12 <= -0.43058 )
								if( ema2 <= 139.015 )
									ret := -0.127732
								if( ema2 > 139.015 )
									ret := 0.183986
							if( ema12 > -0.43058 )
								if( ema12 <= -0.070672 )
									ret := 0.139578
								if( ema12 > -0.070672 )
									ret := 0.066246
		if( ema2 > 146.043 )
			if( VIP <= 0.669306 )
				if( ema2 <= 232.652 )
					if( ema12 <= -1.33561 )
						if( ema2 <= 219.615 )
							if( ema3 <= 151.451 )
								if( ema13 <= -2.85379 )
									ret := 0.615385
								if( ema13 > -2.85379 )
									ret := -1.000000 // sell
							if( ema3 > 151.451 )
								if( ema2 <= 168.092 )
									ret := -0.737226 // sell
								if( ema2 > 168.092 )
									ret := -0.403226
						if( ema2 > 219.615 )
							if( ema2 <= 227.515 )
								if( ema1 <= 220.768 )
									ret := 0.000000
								if( ema1 > 220.768 )
									ret := -0.600000
							if( ema2 > 227.515 )
								if( ema1 <= 226.244 )
									ret := 1.000000 // buy
								if( ema1 > 226.244 )
									ret := 0.166667
					if( ema12 > -1.33561 )
						if( ema3 <= 219.548 )
							if( ema3 <= 164.71 )
								if( ema13 <= -1.36855 )
									ret := 0.087500
								if( ema13 > -1.36855 )
									ret := -0.441718
							if( ema3 > 164.71 )
								if( ema2 <= 167.015 )
									ret := 0.875000 // buy
								if( ema2 > 167.015 )
									ret := -0.058333
						if( ema3 > 219.548 )
							if( VIP <= 0.586071 )
								ret := -1.000000 // sell
							if( VIP > 0.586071 )
								if( ema2 <= 221.176 )
									ret := -0.100000
								if( ema2 > 221.176 )
									ret := -0.655172
				if( ema2 > 232.652 )
					if( tema <= 242.837 )
						ret := 1.000000 // buy
					if( tema > 242.837 )
						if( ema13 <= -3.32972 )
							if( ema2 <= 316.73 )
								ret := -0.200000
							if( ema2 > 316.73 )
								ret := -1.000000 // sell
						if( ema13 > -3.32972 )
							if( ema12 <= -1.39142 )
								if( ema3 <= 256.557 )
									ret := 0.000000
								if( ema3 > 256.557 )
									ret := 0.727273 // buy
							if( ema12 > -1.39142 )
								if( tema <= 261.848 )
									ret := -0.500000
								if( tema > 261.848 )
									ret := 0.200000
			if( VIP > 0.669306 )
				if( ema3 <= 324.238 )
					if( ema1 <= 146.355 )
						if( VIP_VIM <= -0.345444 )
							if( tema <= 145.907 )
								if( ema3 <= 146.429 )
									ret := 0.166667
								if( ema3 > 146.429 )
									ret := -0.669355
							if( tema > 145.907 )
								ret := 0.333333
						if( VIP_VIM > -0.345444 )
							if( tema <= 145.623 )
								if( VIP <= 1.1368 )
									ret := 0.425532
								if( VIP > 1.1368 )
									ret := -0.857143 // sell
							if( tema > 145.623 )
								if( ema12 <= 0.178019 )
									ret := -0.386861
								if( ema12 > 0.178019 )
									ret := 0.800000 // buy
					if( ema1 > 146.355 )
						if( ema3 <= 235.119 )
							if( ema2 <= 146.449 )
								if( tema <= 146.41 )
									ret := 0.833333 // buy
								if( tema > 146.41 )
									ret := -0.469231
							if( ema2 > 146.449 )
								if( ema12 <= 0.121084 )
									ret := 0.044880
								if( ema12 > 0.121084 )
									ret := -0.002033
						if( ema3 > 235.119 )
							if( ema1 <= 241.492 )
								if( ema3 <= 241.223 )
									ret := 0.349693
								if( ema3 > 241.223 )
									ret := 0.911765 // buy
							if( ema1 > 241.492 )
								if( ema12 <= 2.73531 )
									ret := 0.086816
								if( ema12 > 2.73531 )
									ret := -0.488000
				if( ema3 > 324.238 )
					if( ema2 <= 323.496 )
						ret := 1.000000 // buy
					if( ema2 > 323.496 )
						if( VIP <= 0.815046 )
							if( ema12 <= -0.406305 )
								if( VIP <= 0.777288 )
									ret := 0.000000
								if( VIP > 0.777288 )
									ret := 0.500000
							if( ema12 > -0.406305 )
								ret := -0.750000 // sell
						if( VIP > 0.815046 )
							if( tema <= 323.755 )
								if( ema12 <= -0.516617 )
									ret := -0.772727 // sell
								if( ema12 > -0.516617 )
									ret := -1.000000 // sell
							if( tema > 323.755 )
								if( VIP_VIM <= -0.153146 )
									ret := 0.062500
								if( VIP_VIM > -0.153146 )
									ret := -0.640449
	if( tema > 328.71 )
		if( VIP_VIM <= 0.354459 )
			if( tema <= 337.116 )
				if( ema3 <= 330.386 )
					if( ema3 <= 330.168 )
						ret := 0.000000
					if( ema3 > 330.168 )
						if( VIM <= 1.02233 )
							ret := 0.250000
						if( VIM > 1.02233 )
							ret := 0.250000
				if( ema3 > 330.386 )
					if( ema1 <= 331.444 )
						ret := 1.000000 // buy
					if( ema1 > 331.444 )
						if( tema <= 333.133 )
							if( ema12 <= -0.1343 )
								ret := 0.285714
							if( ema12 > -0.1343 )
								ret := 0.750000 // buy
						if( tema > 333.133 )
							if( ema13 <= -5.64106 )
								ret := 0.500000
							if( ema13 > -5.64106 )
								if( VIM <= 1.1198 )
									ret := 0.823529 // buy
								if( VIM > 1.1198 )
									ret := 1.000000 // buy
			if( tema > 337.116 )
				if( ema3 <= 503.666 )
					if( ema3 <= 385.496 )
						if( VIM <= 1.12877 )
							if( ema1 <= 369.01 )
								if( ema12 <= 0.237324 )
									ret := -0.387931
								if( ema12 > 0.237324 )
									ret := 0.095808
							if( ema1 > 369.01 )
								if( ema3 <= 383.06 )
									ret := 0.307985
								if( ema3 > 383.06 )
									ret := 0.677966
						if( VIM > 1.12877 )
							if( ema13 <= -2.73651 )
								if( ema1 <= 340.389 )
									ret := 1.000000 // buy
								if( ema1 > 340.389 )
									ret := -0.147541
							if( ema13 > -2.73651 )
								if( ema3 <= 374.752 )
									ret := 0.697143
								if( ema3 > 374.752 )
									ret := -0.032258
					if( ema3 > 385.496 )
						if( tema <= 406.778 )
							if( tema <= 389.566 )
								if( ema1 <= 384.749 )
									ret := -0.809524 // sell
								if( ema1 > 384.749 )
									ret := -0.071942
							if( tema > 389.566 )
								if( ema3 <= 388.66 )
									ret := -0.250000
								if( ema3 > 388.66 )
									ret := -0.892857 // sell
						if( tema > 406.778 )
							if( ema12 <= 0.854936 )
								if( ema2 <= 448.002 )
									ret := 0.575342
								if( ema2 > 448.002 )
									ret := 0.123867
							if( ema12 > 0.854936 )
								if( ema3 <= 420.393 )
									ret := 0.521739
								if( ema3 > 420.393 )
									ret := -0.463768
				if( ema3 > 503.666 )
					if( ema1 <= 505.698 )
						if( ema3 <= 505.006 )
							if( ema1 <= 505.036 )
								if( ema2 <= 504.722 )
									ret := -0.896552 // sell
								if( ema2 > 504.722 )
									ret := -0.500000
							if( ema1 > 505.036 )
								ret := 0.200000
						if( ema3 > 505.006 )
							if( ema13 <= 0.112085 )
								if( tema <= 504.123 )
									ret := 0.533333
								if( tema > 504.123 )
									ret := -0.692308
							if( ema13 > 0.112085 )
								ret := 1.000000 // buy
					if( ema1 > 505.698 )
						if( ema2 <= 505.999 )
							ret := 0.000000
						if( ema2 > 505.999 )
							if( tema <= 504.363 )
								ret := -0.800000 // sell
							if( tema > 504.363 )
								ret := -1.000000 // sell
		if( VIP_VIM > 0.354459 )
			if( ema2 <= 502.028 )
				if( ema2 <= 466.147 )
					if( tema <= 462.22 )
						if( ema13 <= 4.66439 )
							if( tema <= 382.665 )
								if( ema1 <= 366.01 )
									ret := 0.492891
								if( ema1 > 366.01 )
									ret := -0.065217
							if( tema > 382.665 )
								if( ema13 <= 3.78793 )
									ret := 0.733333 // buy
								if( ema13 > 3.78793 )
									ret := 0.222222
						if( ema13 > 4.66439 )
							if( VIP <= 1.45151 )
								if( ema12 <= 4.03392 )
									ret := -0.515152
								if( ema12 > 4.03392 )
									ret := 0.100000
							if( VIP > 1.45151 )
								if( ema2 <= 419.143 )
									ret := 0.000000
								if( ema2 > 419.143 )
									ret := 1.000000 // buy
					if( tema > 462.22 )
						if( ema3 <= 460.472 )
							if( VIP_VIM <= 0.481129 )
								ret := -0.500000
							if( VIP_VIM > 0.481129 )
								ret := -1.000000 // sell
						if( ema3 > 460.472 )
							ret := 0.000000
				if( ema2 > 466.147 )
					if( VIM <= 0.594621 )
						ret := -0.666667
					if( VIM > 0.594621 )
						if( ema3 <= 498.82 )
							if( VIP_VIM <= 0.388071 )
								ret := 0.500000
							if( VIP_VIM > 0.388071 )
								if( VIP_VIM <= 0.587922 )
									ret := 0.979592 // buy
								if( VIP_VIM > 0.587922 )
									ret := 0.809524 // buy
						if( ema3 > 498.82 )
							ret := 0.250000
			if( ema2 > 502.028 )
				ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3



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
float op_operation = decision_tree_0_AAPL_30Min_b8c66db9(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


