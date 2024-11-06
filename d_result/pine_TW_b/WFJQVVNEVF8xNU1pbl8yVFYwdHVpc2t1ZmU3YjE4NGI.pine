//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: XRPUSDT_15Min_2TV0_fe7b184b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2TV0_fe7b184b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_fe7b184b(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( ema12 <= -0.001969 )
		if( ema12 <= -0.003743 )
			if( ema2 <= 0.566679 )
				if( VIM <= 1.28246 )
					if( VIP_VIM <= -0.22252 )
						if( tema <= 0.452767 )
							if( VIP <= 0.624933 )
								ret := 0.875000 // buy
							if( VIP > 0.624933 )
								ret := -0.181185
						if( tema > 0.452767 )
							if( tema <= 0.5001 )
								ret := 0.375921
							if( tema > 0.5001 )
								ret := -0.053879
					if( VIP_VIM > -0.22252 )
						if( tema <= 0.458639 )
							ret := -1.000000 // sell
						if( tema > 0.458639 )
							if( VIP_VIM <= -0.20354 )
								ret := 0.000000
							if( VIP_VIM > -0.20354 )
								ret := -0.666667
				if( VIM > 1.28246 )
					if( tema <= 0.505255 )
						if( VIP_VIM <= -0.779718 )
							if( VIM <= 1.4019 )
								ret := 0.973684 // buy
							if( VIM > 1.4019 )
								ret := 0.782609 // buy
						if( VIP_VIM > -0.779718 )
							if( VIM <= 1.34191 )
								ret := 0.441423
							if( VIM > 1.34191 )
								ret := -0.200000
					if( tema > 0.505255 )
						if( ema13 <= -0.008387 )
							if( ema1 <= 0.523899 )
								ret := -0.055556
							if( ema1 > 0.523899 )
								ret := 0.981481 // buy
						if( ema13 > -0.008387 )
							if( VIP <= 0.663989 )
								ret := -0.840909 // sell
							if( VIP > 0.663989 )
								ret := -0.333333
			if( ema2 > 0.566679 )
				if( VIP_VIM <= -0.497292 )
					if( ema2 <= 0.614693 )
						if( VIP_VIM <= -0.594778 )
							if( ema3 <= 0.616621 )
								ret := 0.790476 // buy
							if( ema3 > 0.616621 )
								ret := -0.600000
						if( VIP_VIM > -0.594778 )
							if( ema13 <= -0.011031 )
								ret := -0.712121 // sell
							if( ema13 > -0.011031 )
								ret := 0.013423
					if( ema2 > 0.614693 )
						if( tema <= 0.617993 )
							if( ema13 <= -0.012081 )
								ret := 0.250000
							if( ema13 > -0.012081 )
								ret := 0.725490 // buy
						if( tema > 0.617993 )
							if( tema <= 0.660597 )
								ret := 0.130435
							if( tema > 0.660597 )
								ret := 0.592593
				if( VIP_VIM > -0.497292 )
					if( ema2 <= 0.724228 )
						if( ema2 <= 0.644576 )
							if( ema3 <= 0.621005 )
								ret := 0.665914
							if( ema3 > 0.621005 )
								ret := 0.168421
						if( ema2 > 0.644576 )
							if( ema1 <= 0.706774 )
								ret := 0.838565 // buy
							if( ema1 > 0.706774 )
								ret := 0.500000
					if( ema2 > 0.724228 )
						if( ema3 <= 0.7586 )
							if( VIM <= 1.09195 )
								ret := 0.333333
							if( VIM > 1.09195 )
								ret := -0.791667 // sell
						if( ema3 > 0.7586 )
							if( ema12 <= -0.007383 )
								ret := 0.765957 // buy
							if( ema12 > -0.007383 )
								ret := 0.145161
		if( ema12 > -0.003743 )
			if( tema <= 0.609645 )
				if( VIM <= 1.21354 )
					if( ema1 <= 0.314797 )
						if( tema <= 0.311025 )
							if( VIP <= 0.780638 )
								ret := 0.200000
							if( VIP > 0.780638 )
								ret := 1.000000 // buy
						if( tema > 0.311025 )
							ret := 0.333333
					if( ema1 > 0.314797 )
						if( ema1 <= 0.315059 )
							ret := -1.000000 // sell
						if( ema1 > 0.315059 )
							if( ema3 <= 0.499714 )
								ret := 0.280625
							if( ema3 > 0.499714 )
								ret := 0.148400
				if( VIM > 1.21354 )
					if( tema <= 0.439082 )
						if( ema3 <= 0.315501 )
							if( tema <= 0.304922 )
								ret := 1.000000 // buy
							if( tema > 0.304922 )
								ret := 0.846154 // buy
						if( ema3 > 0.315501 )
							if( tema <= 0.324218 )
								ret := -0.433498
							if( tema > 0.324218 )
								ret := -0.044212
					if( tema > 0.439082 )
						if( tema <= 0.471466 )
							if( ema2 <= 0.464467 )
								ret := 0.346667
							if( ema2 > 0.464467 )
								ret := 0.668539
						if( tema > 0.471466 )
							if( VIP_VIM <= -0.742435 )
								ret := -0.710526 // sell
							if( VIP_VIM > -0.742435 )
								ret := 0.128986
			if( tema > 0.609645 )
				if( VIP_VIM <= -0.346172 )
					if( VIP <= 0.719257 )
						if( ema13 <= -0.003747 )
							if( VIP <= 0.685852 )
								ret := -0.023810
							if( VIP > 0.685852 )
								ret := 0.605263
						if( ema13 > -0.003747 )
							if( VIP <= 0.70746 )
								ret := -0.052632
							if( VIP > 0.70746 )
								ret := -1.000000 // sell
					if( VIP > 0.719257 )
						if( ema2 <= 0.696131 )
							if( VIP <= 0.825253 )
								ret := -0.350993
							if( VIP > 0.825253 )
								ret := 0.378378
						if( ema2 > 0.696131 )
							if( ema3 <= 0.721147 )
								ret := 0.507692
							if( ema3 > 0.721147 )
								ret := -0.405797
				if( VIP_VIM > -0.346172 )
					if( ema2 <= 0.67179 )
						if( VIP_VIM <= -0.297015 )
							if( ema12 <= -0.002709 )
								ret := 0.568966
							if( ema12 > -0.002709 )
								ret := 0.000000
						if( VIP_VIM > -0.297015 )
							if( VIM <= 1.11033 )
								ret := -0.346405
							if( VIM > 1.11033 )
								ret := 0.170732
					if( ema2 > 0.67179 )
						if( VIM <= 1.09985 )
							if( VIM <= 1.03361 )
								ret := -0.500000
							if( VIM > 1.03361 )
								ret := 0.636986
						if( VIM > 1.09985 )
							if( tema <= 0.683979 )
								ret := 0.672414
							if( tema > 0.683979 )
								ret := -0.212121
	if( ema12 > -0.001969 )
		if( ema1 <= 0.621194 )
			if( ema12 <= -0.000486 )
				if( ema2 <= 0.528642 )
					if( ema3 <= 0.517528 )
						if( VIP <= 0.887846 )
							if( ema3 <= 0.40279 )
								ret := 0.091854
							if( ema3 > 0.40279 )
								ret := -0.023327
						if( VIP > 0.887846 )
							if( VIP <= 0.902757 )
								ret := 0.283390
							if( VIP > 0.902757 )
								ret := 0.095007
					if( ema3 > 0.517528 )
						if( ema1 <= 0.519578 )
							if( ema2 <= 0.518898 )
								ret := 0.211039
							if( ema2 > 0.518898 )
								ret := 0.474916
						if( ema1 > 0.519578 )
							if( VIM <= 1.14979 )
								ret := 0.201950
							if( VIM > 1.14979 )
								ret := -0.015801
				if( ema2 > 0.528642 )
					if( ema13 <= -0.003226 )
						if( ema3 <= 0.607222 )
							if( VIP_VIM <= -0.264588 )
								ret := 0.077220
							if( VIP_VIM > -0.264588 )
								ret := 0.464945
						if( ema3 > 0.607222 )
							if( ema2 <= 0.609791 )
								ret := -0.509804
							if( ema2 > 0.609791 )
								ret := 0.160000
					if( ema13 > -0.003226 )
						if( ema2 <= 0.556727 )
							if( ema1 <= 0.533948 )
								ret := -0.010191
							if( ema1 > 0.533948 )
								ret := -0.230068
						if( ema2 > 0.556727 )
							if( ema3 <= 0.612835 )
								ret := 0.046145
							if( ema3 > 0.612835 )
								ret := -0.147799
			if( ema12 > -0.000486 )
				if( ema3 <= 0.314588 )
					if( VIM <= 0.849885 )
						if( VIM <= 0.800184 )
							if( ema3 <= 0.309971 )
								ret := -0.210526
							if( ema3 > 0.309971 )
								ret := 0.656250
						if( VIM > 0.800184 )
							if( ema12 <= 0.001783 )
								ret := -0.611111
							if( ema12 > 0.001783 )
								ret := 0.052632
					if( VIM > 0.849885 )
						if( VIP <= 0.954703 )
							if( VIM <= 1.09566 )
								ret := -0.347826
							if( VIM > 1.09566 )
								ret := 0.666667
						if( VIP > 0.954703 )
							if( ema1 <= 0.313267 )
								ret := 0.364407
							if( ema1 > 0.313267 )
								ret := 0.699346
				if( ema3 > 0.314588 )
					if( tema <= 0.623983 )
						if( VIM <= 0.611413 )
							if( ema2 <= 0.594615 )
								ret := -0.364835
							if( ema2 > 0.594615 )
								ret := 0.480000
						if( VIM > 0.611413 )
							if( VIP <= 0.960084 )
								ret := -0.076480
							if( VIP > 0.960084 )
								ret := -0.012156
					if( tema > 0.623983 )
						if( ema3 <= 0.608111 )
							if( VIM <= 0.548097 )
								ret := 0.400000
							if( VIM > 0.548097 )
								ret := 0.945455 // buy
						if( ema3 > 0.608111 )
							if( ema13 <= 0.007378 )
								ret := -0.121951
							if( ema13 > 0.007378 )
								ret := 0.636364
		if( ema1 > 0.621194 )
			if( VIM <= 0.825706 )
				if( VIM <= 0.684448 )
					if( ema1 <= 0.622618 )
						if( VIP <= 1.31426 )
							ret := 0.923077 // buy
						if( VIP > 1.31426 )
							ret := -0.444444
					if( ema1 > 0.622618 )
						if( VIP_VIM <= 0.891551 )
							if( VIP <= 1.23874 )
								ret := -0.200000
							if( VIP > 1.23874 )
								ret := -0.750000 // sell
						if( VIP_VIM > 0.891551 )
							if( VIP_VIM <= 0.957925 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.957925 )
								ret := -0.857143 // sell
				if( VIM > 0.684448 )
					if( VIP_VIM <= 0.649245 )
						if( ema3 <= 0.624461 )
							if( ema1 <= 0.630491 )
								ret := -0.178841
							if( ema1 > 0.630491 )
								ret := 0.783784 // buy
						if( ema3 > 0.624461 )
							if( ema13 <= 0.001359 )
								ret := 0.517241
							if( ema13 > 0.001359 )
								ret := -0.328155
					if( VIP_VIM > 0.649245 )
						if( ema13 <= 0.00357 )
							ret := 0.000000
						if( ema13 > 0.00357 )
							if( ema2 <= 0.640104 )
								ret := 0.000000
							if( ema2 > 0.640104 )
								ret := 1.000000 // buy
			if( VIM > 0.825706 )
				if( ema3 <= 0.623251 )
					if( ema3 <= 0.619421 )
						if( ema13 <= 0.007139 )
							if( ema2 <= 0.620328 )
								ret := 0.107143
							if( ema2 > 0.620328 )
								ret := 0.741935 // buy
						if( ema13 > 0.007139 )
							if( VIP_VIM <= 0.372844 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.372844 )
								ret := -0.333333
					if( ema3 > 0.619421 )
						if( tema <= 0.628255 )
							if( VIP <= 0.990013 )
								ret := -0.519231
							if( VIP > 0.990013 )
								ret := -0.270677
						if( tema > 0.628255 )
							if( ema12 <= 0.003699 )
								ret := -1.000000 // sell
							if( ema12 > 0.003699 )
								ret := -0.875000 // sell
				if( ema3 > 0.623251 )
					if( VIM <= 1.12673 )
						if( ema3 <= 0.713365 )
							if( tema <= 0.682322 )
								ret := -0.054823
							if( tema > 0.682322 )
								ret := 0.055273
						if( ema3 > 0.713365 )
							if( ema2 <= 0.771538 )
								ret := -0.236779
							if( ema2 > 0.771538 )
								ret := 0.017588
					if( VIM > 1.12673 )
						if( VIP <= 0.8279 )
							if( ema1 <= 0.688111 )
								ret := -0.463492
							if( ema1 > 0.688111 )
								ret := -0.112903
						if( VIP > 0.8279 )
							if( VIP_VIM <= -0.181521 )
								ret := -0.102787
							if( VIP_VIM > -0.181521 )
								ret := -0.606061
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_fe7b184b(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)

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


