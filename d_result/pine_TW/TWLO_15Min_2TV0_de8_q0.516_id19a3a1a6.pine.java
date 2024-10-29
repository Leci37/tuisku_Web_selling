//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: TWLO_15Min_2TV0_19a3a1a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2TV0_19a3a1a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_19a3a1a6(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema2 <= 24.0824 )
		if( VIP_VIM <= 0.443875 )
			if( tema <= 23.1494 )
				if( VIP_VIM <= -0.452437 )
					if( VIP <= 0.701508 )
						ret := 0.625000
					if( VIP > 0.701508 )
						ret := 1.000000 // buy
				if( VIP_VIM > -0.452437 )
					if( ema1 <= 23.105 )
						ret := 1.000000 // buy
					if( ema1 > 23.105 )
						ret := 0.363636
			if( tema > 23.1494 )
				if( tema <= 23.3772 )
					if( ema1 <= 23.2286 )
						if( VIM <= 1.10933 )
							if( VIP_VIM <= -0.103488 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.103488 )
								if( ema1 <= 23.2034 )
									ret := 0.000000
								if( ema1 > 23.2034 )
									ret := 1.000000 // buy
						if( VIM > 1.10933 )
							if( ema12 <= -0.008928 )
								ret := 0.000000
							if( ema12 > -0.008928 )
								ret := -0.727273 // sell
					if( ema1 > 23.2286 )
						if( ema13 <= -0.078865 )
							ret := 0.400000
						if( ema13 > -0.078865 )
							ret := -0.954545 // sell
				if( tema > 23.3772 )
					if( VIP <= 0.699672 )
						ret := -1.000000 // sell
					if( VIP > 0.699672 )
						if( ema3 <= 23.9821 )
							if( ema13 <= 0.098982 )
								if( VIP_VIM <= -0.532348 )
									ret := 0.571429
								if( VIP_VIM > -0.532348 )
									ret := 0.941176 // buy
							if( ema13 > 0.098982 )
								if( VIP <= 1.16573 )
									ret := 0.825000 // buy
								if( VIP > 1.16573 )
									ret := 0.000000
						if( ema3 > 23.9821 )
							if( ema2 <= 24.0624 )
								if( ema13 <= -0.1509 )
									ret := 0.653846
								if( ema13 > -0.1509 )
									ret := -0.250000
							if( ema2 > 24.0624 )
								if( ema3 <= 24.0754 )
									ret := 0.821429 // buy
								if( ema3 > 24.0754 )
									ret := 0.461538
		if( VIP_VIM > 0.443875 )
			if( tema <= 24.3695 )
				if( ema1 <= 23.7386 )
					ret := -1.000000 // sell
				if( ema1 > 23.7386 )
					if( tema <= 24.115 )
						ret := -0.083333
					if( tema > 24.115 )
						ret := -0.400000
			if( tema > 24.3695 )
				ret := 1.000000 // buy
	if( ema2 > 24.0824 )
		if( tema <= 437.305 )
			if( ema12 <= -0.006968 )
				if( VIM <= 1.15393 )
					if( ema12 <= -0.141849 )
						if( ema13 <= -0.334986 )
							if( tema <= 379.106 )
								if( ema12 <= -1.88573 )
									ret := -0.474227
								if( ema12 > -1.88573 )
									ret := -0.118259
							if( tema > 379.106 )
								if( ema12 <= -0.419508 )
									ret := 0.410714
								if( ema12 > -0.419508 )
									ret := -0.130952
						if( ema13 > -0.334986 )
							if( ema12 <= -0.143786 )
								if( VIM <= 0.927041 )
									ret := -0.428571
								if( VIM > 0.927041 )
									ret := 0.069200
							if( ema12 > -0.143786 )
								if( ema12 <= -0.142524 )
									ret := -0.324324
								if( ema12 > -0.142524 )
									ret := -0.928571 // sell
					if( ema12 > -0.141849 )
						if( ema1 <= 340.145 )
							if( ema13 <= -0.12881 )
								if( ema2 <= 70.6337 )
									ret := -0.032448
								if( ema2 > 70.6337 )
									ret := -0.178275
							if( ema13 > -0.12881 )
								if( ema3 <= 39.1653 )
									ret := -0.021075
								if( ema3 > 39.1653 )
									ret := 0.114191
						if( ema1 > 340.145 )
							if( ema3 <= 409.185 )
								if( ema3 <= 399.003 )
									ret := 0.276119
								if( ema3 > 399.003 )
									ret := 0.666667
							if( ema3 > 409.185 )
								ret := -0.428571
				if( VIM > 1.15393 )
					if( ema3 <= 130.563 )
						if( tema <= 118.494 )
							if( ema12 <= -1.37896 )
								if( ema2 <= 66.0207 )
									ret := -0.767442 // sell
								if( ema2 > 66.0207 )
									ret := 0.474960
							if( ema12 > -1.37896 )
								if( VIP <= 2.44166 )
									ret := 0.081914
								if( VIP > 2.44166 )
									ret := -0.146907
						if( tema > 118.494 )
							if( ema3 <= 125.868 )
								if( VIP_VIM <= -0.773232 )
									ret := -0.371429
								if( VIP_VIM > -0.773232 )
									ret := 0.614907
							if( ema3 > 125.868 )
								if( VIM <= 1.34902 )
									ret := 0.295739
								if( VIM > 1.34902 )
									ret := -0.073469
					if( ema3 > 130.563 )
						if( VIP_VIM <= -0.694953 )
							if( ema12 <= -1.07635 )
								if( ema12 <= -1.33495 )
									ret := -0.202569
								if( ema12 > -1.33495 )
									ret := 0.344828
							if( ema12 > -1.07635 )
								if( ema2 <= 136.604 )
									ret := 0.407407
								if( ema2 > 136.604 )
									ret := -0.474227
						if( VIP_VIM > -0.694953 )
							if( ema2 <= 131.815 )
								if( ema2 <= 130.865 )
									ret := -0.625000
								if( ema2 > 130.865 )
									ret := -0.257143
							if( ema2 > 131.815 )
								if( tema <= 365.746 )
									ret := 0.066294
								if( tema > 365.746 )
									ret := -0.125000
			if( ema12 > -0.006968 )
				if( VIP <= 2.04032 )
					if( VIM <= 1.40136 )
						if( VIM <= 0.700222 )
							if( tema <= 60.6178 )
								if( ema3 <= 43.265 )
									ret := -0.077994
								if( ema3 > 43.265 )
									ret := 0.257709
							if( tema > 60.6178 )
								if( tema <= 80.336 )
									ret := -0.457887
								if( tema > 80.336 )
									ret := -0.098572
						if( VIM > 0.700222 )
							if( VIP <= 1.27697 )
								if( ema2 <= 432.468 )
									ret := -0.024304
								if( ema2 > 432.468 )
									ret := 0.689655
							if( VIP > 1.27697 )
								if( tema <= 412.796 )
									ret := 0.044242
								if( tema > 412.796 )
									ret := -0.894737 // sell
					if( VIM > 1.40136 )
						if( VIP_VIM <= 0.51813 )
							if( ema3 <= 337.785 )
								if( ema2 <= 325.39 )
									ret := -0.112143
								if( ema2 > 325.39 )
									ret := 0.714286 // buy
							if( ema3 > 337.785 )
								if( tema <= 375.929 )
									ret := -0.546125
								if( tema > 375.929 )
									ret := -0.013793
						if( VIP_VIM > 0.51813 )
							if( tema <= 73.4761 )
								if( ema13 <= 0.024864 )
									ret := 1.000000 // buy
								if( ema13 > 0.024864 )
									ret := 0.636364
							if( tema > 73.4761 )
								if( VIP <= 2.00171 )
									ret := -0.727273 // sell
								if( VIP > 2.00171 )
									ret := 0.384615
				if( VIP > 2.04032 )
					if( ema3 <= 27.7989 )
						if( ema2 <= 26.8433 )
							if( ema13 <= 0.031683 )
								ret := 0.562500
							if( ema13 > 0.031683 )
								ret := -0.176471
						if( ema2 > 26.8433 )
							if( VIM <= 2.00599 )
								ret := 0.684211
							if( VIM > 2.00599 )
								ret := 1.000000 // buy
					if( ema3 > 27.7989 )
						if( ema13 <= 2.88452 )
							if( ema3 <= 137.758 )
								if( VIP_VIM <= 0.176658 )
									ret := -0.068884
								if( VIP_VIM > 0.176658 )
									ret := -0.260740
							if( ema3 > 137.758 )
								if( ema3 <= 144.166 )
									ret := 0.636364
								if( ema3 > 144.166 )
									ret := 0.008865
						if( ema13 > 2.88452 )
							if( VIM <= 1.53846 )
								if( VIM <= 1.2955 )
									ret := -0.833333 // sell
								if( VIM > 1.2955 )
									ret := 0.280000
							if( VIM > 1.53846 )
								if( tema <= 360.159 )
									ret := -0.829060 // sell
								if( tema > 360.159 )
									ret := 0.000000
		if( tema > 437.305 )
			if( VIP <= 0.871773 )
				ret := 0.454545
			if( VIP > 0.871773 )
				if( ema2 <= 444.063 )
					if( ema2 <= 438.666 )
						if( ema13 <= 3.36926 )
							if( VIM <= 0.973139 )
								ret := -0.916667 // sell
							if( VIM > 0.973139 )
								ret := -0.944444 // sell
						if( ema13 > 3.36926 )
							ret := -0.714286 // sell
					if( ema2 > 438.666 )
						ret := 0.000000
				if( ema2 > 444.063 )
					if( VIP <= 1.10516 )
						if( ema13 <= -2.11661 )
							ret := -0.818182 // sell
						if( ema13 > -2.11661 )
							ret := -1.000000 // sell
					if( VIP > 1.10516 )
						ret := -0.823529 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TWLO_15Min_19a3a1a6(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


