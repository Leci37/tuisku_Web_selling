//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: MSFT_30Min_2TV0_153440bc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2TV0_153440bc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_153440bc(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 1.11573 )
		if( ema1 <= 257.857 )
			if( ema3 <= 49.8714 )
				if( VIP_VIM <= 0.58775 )
					if( VIP <= 0.833354 )
						if( VIM <= 1.31426 )
							ret := 0.555556
						if( VIM > 1.31426 )
							ret := -0.777778 // sell
					if( VIP > 0.833354 )
						if( ema13 <= -0.013093 )
							if( ema1 <= 48.9785 )
								if( ema3 <= 48.9827 )
									ret := 0.904762 // buy
								if( ema3 > 48.9827 )
									ret := 1.000000 // buy
							if( ema1 > 48.9785 )
								if( ema13 <= -0.299088 )
									ret := 0.115385
								if( ema13 > -0.299088 )
									ret := 0.785714 // buy
						if( ema13 > -0.013093 )
							if( ema2 <= 49.2717 )
								if( VIP_VIM <= 0.123119 )
									ret := 0.888889 // buy
								if( VIP_VIM > 0.123119 )
									ret := -0.014925
							if( ema2 > 49.2717 )
								if( VIM <= 1.18723 )
									ret := 0.706767 // buy
								if( VIM > 1.18723 )
									ret := 0.033333
				if( VIP_VIM > 0.58775 )
					ret := -0.615385
			if( ema3 > 49.8714 )
				if( ema1 <= 255.864 )
					if( ema2 <= 255.967 )
						if( ema13 <= 1.47235 )
							if( VIP <= 1.12647 )
								if( ema1 <= 50.0025 )
									ret := -0.341346
								if( ema1 > 50.0025 )
									ret := 0.041458
							if( VIP > 1.12647 )
								if( ema12 <= -0.157239 )
									ret := 0.179279
								if( ema12 > -0.157239 )
									ret := -0.047682
						if( ema13 > 1.47235 )
							if( VIP <= 1.40518 )
								if( ema1 <= 100.941 )
									ret := 0.708861 // buy
								if( ema1 > 100.941 )
									ret := 0.243437
							if( VIP > 1.40518 )
								if( ema1 <= 208.038 )
									ret := -0.404255
								if( ema1 > 208.038 )
									ret := 0.538462
					if( ema2 > 255.967 )
						if( ema3 <= 257.352 )
							ret := -1.000000 // sell
						if( ema3 > 257.352 )
							if( ema3 <= 257.775 )
								ret := 0.785714 // buy
							if( ema3 > 257.775 )
								if( ema3 <= 258.542 )
									ret := -0.900000 // sell
								if( ema3 > 258.542 )
									ret := -0.352941
				if( ema1 > 255.864 )
					if( ema13 <= -3.83513 )
						if( ema12 <= -2.36164 )
							ret := -0.272727
						if( ema12 > -2.36164 )
							ret := -0.937500 // sell
					if( ema13 > -3.83513 )
						if( tema <= 256.868 )
							if( VIM <= 0.900071 )
								ret := -0.142857
							if( VIM > 0.900071 )
								if( ema2 <= 256.401 )
									ret := 0.829060 // buy
								if( ema2 > 256.401 )
									ret := 0.428986
						if( tema > 256.868 )
							if( ema13 <= 0.562146 )
								if( ema13 <= -0.011126 )
									ret := -0.149425
								if( ema13 > -0.011126 )
									ret := 0.585586
							if( ema13 > 0.562146 )
								if( ema3 <= 255.206 )
									ret := 0.416667
								if( ema3 > 255.206 )
									ret := -0.354430
		if( ema1 > 257.857 )
			if( ema13 <= -4.31972 )
				if( VIP_VIM <= -0.780582 )
					if( ema3 <= 334.833 )
						if( VIM <= 1.48448 )
							if( ema2 <= 319.053 )
								ret := -0.384615
							if( ema2 > 319.053 )
								if( tema <= 320.527 )
									ret := -0.916667 // sell
								if( tema > 320.527 )
									ret := -0.571429
						if( VIM > 1.48448 )
							ret := 0.428571
					if( ema3 > 334.833 )
						if( ema3 <= 431.035 )
							ret := 0.296296
						if( ema3 > 431.035 )
							ret := 0.000000
				if( VIP_VIM > -0.780582 )
					if( VIM <= 1.28257 )
						if( ema3 <= 346.402 )
							if( ema3 <= 295.003 )
								ret := 1.000000 // buy
							if( ema3 > 295.003 )
								ret := 0.307692
						if( ema3 > 346.402 )
							if( ema1 <= 416.528 )
								ret := 1.000000 // buy
							if( ema1 > 416.528 )
								ret := 0.900000 // buy
					if( VIM > 1.28257 )
						if( ema12 <= -2.80258 )
							if( VIP <= 0.65448 )
								if( ema13 <= -5.61048 )
									ret := 1.000000 // buy
								if( ema13 > -5.61048 )
									ret := 0.294118
							if( VIP > 0.65448 )
								if( tema <= 353.817 )
									ret := -0.363636
								if( tema > 353.817 )
									ret := -0.777778 // sell
						if( ema12 > -2.80258 )
							if( VIM <= 1.30548 )
								ret := 0.272727
							if( VIM > 1.30548 )
								if( ema1 <= 327.769 )
									ret := 0.939394 // buy
								if( ema1 > 327.769 )
									ret := 0.666667
			if( ema13 > -4.31972 )
				if( ema13 <= 2.32992 )
					if( ema3 <= 423.414 )
						if( tema <= 263.128 )
							if( ema12 <= -0.864498 )
								if( ema2 <= 264.203 )
									ret := -0.422078
								if( ema2 > 264.203 )
									ret := -0.835821 // sell
							if( ema12 > -0.864498 )
								if( ema2 <= 258.442 )
									ret := 0.146825
								if( ema2 > 258.442 )
									ret := -0.215054
						if( tema > 263.128 )
							if( ema3 <= 263.47 )
								if( VIM <= 0.836032 )
									ret := -0.050000
								if( VIM > 0.836032 )
									ret := 0.733871 // buy
							if( ema3 > 263.47 )
								if( ema12 <= -0.253252 )
									ret := 0.024191
								if( ema12 > -0.253252 )
									ret := -0.047418
					if( ema3 > 423.414 )
						if( ema2 <= 426.065 )
							if( ema3 <= 424.049 )
								if( ema12 <= 0.022519 )
									ret := -0.854167 // sell
								if( ema12 > 0.022519 )
									ret := -0.617284
							if( ema3 > 424.049 )
								if( ema3 <= 425.362 )
									ret := -0.109091
								if( ema3 > 425.362 )
									ret := -0.793103 // sell
						if( ema2 > 426.065 )
							if( ema13 <= -2.45642 )
								if( ema2 <= 443.252 )
									ret := 0.644737
								if( ema2 > 443.252 )
									ret := 0.148148
							if( ema13 > -2.45642 )
								if( ema1 <= 425.857 )
									ret := -0.909091 // sell
								if( ema1 > 425.857 )
									ret := -0.103237
				if( ema13 > 2.32992 )
					if( tema <= 287.627 )
						if( ema12 <= 1.04472 )
							if( ema3 <= 263.684 )
								ret := 1.000000 // buy
							if( ema3 > 263.684 )
								ret := 0.937500 // buy
						if( ema12 > 1.04472 )
							ret := 0.600000
					if( tema > 287.627 )
						if( ema12 <= 0.943728 )
							if( VIP <= 1.15998 )
								ret := 0.625000
							if( VIP > 1.15998 )
								ret := 1.000000 // buy
						if( ema12 > 0.943728 )
							if( ema12 <= 1.08482 )
								if( VIM <= 0.842782 )
									ret := 0.125000
								if( VIM > 0.842782 )
									ret := -0.500000
							if( ema12 > 1.08482 )
								ret := 0.428571
	if( ema12 > 1.11573 )
		if( ema1 <= 143.735 )
			if( ema1 <= 141.754 )
				if( VIM <= 0.940168 )
					if( VIM <= 0.734365 )
						ret := -0.800000 // sell
					if( VIM > 0.734365 )
						if( tema <= 143.153 )
							ret := 0.500000
						if( tema > 143.153 )
							ret := -1.000000 // sell
				if( VIM > 0.940168 )
					ret := 0.692308
			if( ema1 > 141.754 )
				if( tema <= 145.257 )
					ret := 1.000000 // buy
				if( tema > 145.257 )
					ret := 0.777778 // buy
		if( ema1 > 143.735 )
			if( VIM <= 0.897113 )
				if( ema2 <= 236.419 )
					if( VIM <= 0.797655 )
						if( ema13 <= 3.0575 )
							if( VIM <= 0.730865 )
								if( ema1 <= 170.696 )
									ret := 0.709091 // buy
								if( ema1 > 170.696 )
									ret := -0.353774
							if( VIM > 0.730865 )
								if( ema1 <= 235.248 )
									ret := 0.215686
								if( ema1 > 235.248 )
									ret := 0.956522 // buy
						if( ema13 > 3.0575 )
							if( ema12 <= 2.71391 )
								if( tema <= 238.536 )
									ret := 0.508287
								if( tema > 238.536 )
									ret := 1.000000 // buy
							if( ema12 > 2.71391 )
								if( VIP <= 1.42303 )
									ret := -1.000000 // sell
								if( VIP > 1.42303 )
									ret := 0.652174
					if( VIM > 0.797655 )
						if( ema1 <= 144.584 )
							ret := -0.909091 // sell
						if( ema1 > 144.584 )
							if( ema12 <= 1.17056 )
								if( ema12 <= 1.14528 )
									ret := -0.250000
								if( ema12 > 1.14528 )
									ret := 1.000000 // buy
							if( ema12 > 1.17056 )
								if( ema2 <= 164.86 )
									ret := -0.545455
								if( ema2 > 164.86 )
									ret := -0.008333
				if( ema2 > 236.419 )
					if( ema2 <= 261.413 )
						if( ema3 <= 259.483 )
							if( ema1 <= 260.38 )
								if( VIP_VIM <= 0.607554 )
									ret := -0.562914
								if( VIP_VIM > 0.607554 )
									ret := -0.201646
							if( ema1 > 260.38 )
								if( VIP <= 1.22875 )
									ret := -0.600000
								if( VIP > 1.22875 )
									ret := 0.371429
						if( ema3 > 259.483 )
							if( ema12 <= 1.20529 )
								ret := -0.666667
							if( ema12 > 1.20529 )
								ret := -1.000000 // sell
					if( ema2 > 261.413 )
						if( ema2 <= 267.084 )
							if( VIP <= 1.23124 )
								if( VIM <= 0.871304 )
									ret := 0.941176 // buy
								if( VIM > 0.871304 )
									ret := 0.700000 // buy
							if( VIP > 1.23124 )
								ret := 0.210526
						if( ema2 > 267.084 )
							if( ema1 <= 452.258 )
								if( ema13 <= 1.84691 )
									ret := 0.290909
								if( ema13 > 1.84691 )
									ret := -0.148040
							if( ema1 > 452.258 )
								if( ema2 <= 462.24 )
									ret := 0.729730 // buy
								if( ema2 > 462.24 )
									ret := 0.000000
			if( VIM > 0.897113 )
				if( ema13 <= 1.9528 )
					if( ema3 <= 409.854 )
						if( tema <= 187.285 )
							ret := -0.545455
						if( tema > 187.285 )
							if( ema2 <= 351.821 )
								if( ema12 <= 1.17868 )
									ret := -0.181818
								if( ema12 > 1.17868 )
									ret := 0.085714
							if( ema2 > 351.821 )
								ret := -0.500000
					if( ema3 > 409.854 )
						ret := 0.333333
				if( ema13 > 1.9528 )
					if( VIP <= 1.28625 )
						if( VIP_VIM <= 0.200144 )
							if( ema2 <= 299.945 )
								if( ema3 <= 253.955 )
									ret := -0.755102 // sell
								if( ema3 > 253.955 )
									ret := -0.159091
							if( ema2 > 299.945 )
								if( VIM <= 1.00748 )
									ret := -0.944444 // sell
								if( VIM > 1.00748 )
									ret := -0.605263
						if( VIP_VIM > 0.200144 )
							if( tema <= 199.048 )
								if( VIP_VIM <= 0.24482 )
									ret := -0.555556
								if( VIP_VIM > 0.24482 )
									ret := -0.952381 // sell
							if( tema > 199.048 )
								if( tema <= 224.753 )
									ret := 0.956522 // buy
								if( tema > 224.753 )
									ret := -0.135802
					if( VIP > 1.28625 )
						if( ema3 <= 332.537 )
							if( VIP_VIM <= 0.515772 )
								if( ema12 <= 1.24641 )
									ret := -0.333333
								if( ema12 > 1.24641 )
									ret := -0.739837 // sell
							if( VIP_VIM > 0.515772 )
								ret := 0.384615
						if( ema3 > 332.537 )
							if( ema2 <= 397.407 )
								ret := -1.000000 // sell
							if( ema2 > 397.407 )
								if( VIP_VIM <= 0.337793 )
									ret := -0.538462
								if( VIP_VIM > 0.337793 )
									ret := -0.909091 // sell
	
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
float op_operation = decision_tree_0_MSFT_30Min_153440bc(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


