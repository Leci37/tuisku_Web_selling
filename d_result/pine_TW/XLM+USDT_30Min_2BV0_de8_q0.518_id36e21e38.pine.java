//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: XLMUSDT_30Min_2BV0_36e21e38 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2BV0_36e21e38", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_36e21e38(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.000495 )
		if( VIP <= 1.04595 )
			if( bullPower <= -0.011099 )
				if( bbm <= 0.009413 )
					if( VIP_VIM <= -0.457303 )
						if( VIP <= 0.630537 )
							ret := -0.600000
						if( VIP > 0.630537 )
							if( VIM <= 1.299 )
								ret := 1.000000 // buy
							if( VIM > 1.299 )
								ret := 0.333333
					if( VIP_VIM > -0.457303 )
						ret := -1.000000 // sell
				if( bbm > 0.009413 )
					if( VIP <= 0.419432 )
						ret := -1.000000 // sell
					if( VIP > 0.419432 )
						if( bearPower <= -0.03944 )
							if( VIM <= 1.10176 )
								ret := 0.000000
							if( VIM > 1.10176 )
								if( VIP_VIM <= -0.392465 )
									ret := 0.712644 // buy
								if( VIP_VIM > -0.392465 )
									ret := 1.000000 // buy
						if( bearPower > -0.03944 )
							if( bbp <= -0.042429 )
								if( VIM <= 1.30369 )
									ret := -0.015385
								if( VIM > 1.30369 )
									ret := 0.750000 // buy
							if( bbp > -0.042429 )
								if( VIP <= 0.760538 )
									ret := 0.813559 // buy
								if( VIP > 0.760538 )
									ret := 0.269231
			if( bullPower > -0.011099 )
				if( bbm <= 0.003159 )
					if( bullPower <= 0.000651 )
						if( VIM <= 1.01042 )
							if( bbm <= 0.00253 )
								if( VIP_VIM <= 0.089163 )
									ret := -0.014818
								if( VIP_VIM > 0.089163 )
									ret := -0.190184
							if( bbm > 0.00253 )
								if( bbm <= 0.002584 )
									ret := 0.888889 // buy
								if( bbm > 0.002584 )
									ret := 0.250000
						if( VIM > 1.01042 )
							if( VIP_VIM <= -0.147957 )
								if( VIM <= 1.27841 )
									ret := 0.059801
								if( VIM > 1.27841 )
									ret := -0.019756
							if( VIP_VIM > -0.147957 )
								if( VIP <= 0.970757 )
									ret := 0.162162
								if( VIP > 0.970757 )
									ret := 0.045244
					if( bullPower > 0.000651 )
						if( VIP_VIM <= -0.157909 )
							if( VIM <= 1.20308 )
								if( bbm <= 0.001605 )
									ret := 0.096774
								if( bbm > 0.001605 )
									ret := -0.300716
							if( VIM > 1.20308 )
								if( VIP <= 0.778718 )
									ret := -0.333333
								if( VIP > 0.778718 )
									ret := 0.760000 // buy
						if( VIP_VIM > -0.157909 )
							if( VIM <= 1.06137 )
								if( VIP_VIM <= 0.139814 )
									ret := -0.017021
								if( VIP_VIM > 0.139814 )
									ret := 0.348485
							if( VIM > 1.06137 )
								if( VIP <= 0.995371 )
									ret := 0.120000
								if( VIP > 0.995371 )
									ret := 0.666667
				if( bbm > 0.003159 )
					if( VIM <= 1.25973 )
						if( bbp <= 0.014739 )
							if( bullPower <= -0.000894 )
								if( VIM <= 1.10164 )
									ret := 0.043114
								if( VIM > 1.10164 )
									ret := 0.210781
							if( bullPower > -0.000894 )
								if( bbp <= 2e-05 )
									ret := 0.066638
								if( bbp > 2e-05 )
									ret := 0.158426
						if( bbp > 0.014739 )
							if( VIM <= 1.02044 )
								if( VIP_VIM <= 0.016564 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.016564 )
									ret := -0.846154 // sell
							if( VIM > 1.02044 )
								ret := -1.000000 // sell
					if( VIM > 1.25973 )
						if( bullPower <= -0.000572 )
							if( VIM <= 1.27529 )
								if( bearPower <= -0.009529 )
									ret := -0.646341
								if( bearPower > -0.009529 )
									ret := -0.073171
							if( VIM > 1.27529 )
								if( VIM <= 1.36726 )
									ret := 0.043478
								if( VIM > 1.36726 )
									ret := -0.300000
						if( bullPower > -0.000572 )
							if( VIP_VIM <= -0.613554 )
								ret := 0.500000
							if( VIP_VIM > -0.613554 )
								ret := 1.000000 // buy
		if( VIP > 1.04595 )
			if( bbp <= 0.009892 )
				if( bearPower <= -0.000828 )
					if( VIM <= 0.854524 )
						if( VIP <= 1.24691 )
							if( bbm <= 0.005838 )
								if( VIM <= 0.835139 )
									ret := 0.060000
								if( VIM > 0.835139 )
									ret := 0.490741
							if( bbm > 0.005838 )
								if( bearPower <= -0.0082 )
									ret := -0.076923
								if( bearPower > -0.0082 )
									ret := 0.609091
						if( VIP > 1.24691 )
							if( bbp <= -0.000215 )
								ret := 0.000000
							if( bbp > -0.000215 )
								if( bbp <= 0.00197 )
									ret := -1.000000 // sell
								if( bbp > 0.00197 )
									ret := -0.250000
					if( VIM > 0.854524 )
						if( VIP_VIM <= 0.082533 )
							if( VIP <= 1.05457 )
								if( bbm <= 0.005446 )
									ret := 0.700000 // buy
								if( bbm > 0.005446 )
									ret := 0.068966
							if( VIP > 1.05457 )
								if( VIM <= 1.00456 )
									ret := 0.641791
								if( VIM > 1.00456 )
									ret := 0.160714
						if( VIP_VIM > 0.082533 )
							if( bbp <= 0.002207 )
								if( VIM <= 0.865117 )
									ret := -0.222222
								if( VIM > 0.865117 )
									ret := 0.217787
							if( bbp > 0.002207 )
								if( VIP_VIM <= 0.23157 )
									ret := -0.132143
								if( VIP_VIM > 0.23157 )
									ret := 0.375000
				if( bearPower > -0.000828 )
					if( bullPower <= 0.00011 )
						if( VIP <= 1.05212 )
							if( bullPower <= -4.5e-05 )
								ret := 0.000000
							if( bullPower > -4.5e-05 )
								if( bearPower <= -0.000683 )
									ret := -0.250000
								if( bearPower > -0.000683 )
									ret := -0.650000
						if( VIP > 1.05212 )
							if( bbp <= -0.000546 )
								if( VIM <= 1.05767 )
									ret := 0.102190
								if( VIM > 1.05767 )
									ret := -0.461538
							if( bbp > -0.000546 )
								if( bbp <= -0.000452 )
									ret := -0.476190
								if( bbp > -0.000452 )
									ret := 0.285714
					if( bullPower > 0.00011 )
						if( bbp <= 0.001022 )
							if( VIP <= 1.16042 )
								if( VIP <= 1.08705 )
									ret := 0.009153
								if( VIP > 1.08705 )
									ret := 0.243842
							if( VIP > 1.16042 )
								if( VIP_VIM <= 0.341397 )
									ret := -0.500000
								if( VIP_VIM > 0.341397 )
									ret := 0.102564
						if( bbp > 0.001022 )
							if( bbp <= 0.001086 )
								ret := 1.000000 // buy
							if( bbp > 0.001086 )
								if( VIP <= 1.08851 )
									ret := 0.323353
								if( VIP > 1.08851 )
									ret := 0.111554
			if( bbp > 0.009892 )
				if( VIP <= 1.07458 )
					if( bearPower <= -0.00076 )
						if( VIP <= 1.06498 )
							if( bbp <= 0.016485 )
								if( VIM <= 0.944868 )
									ret := -1.000000 // sell
								if( VIM > 0.944868 )
									ret := -0.500000
							if( bbp > 0.016485 )
								ret := 0.166667
						if( VIP > 1.06498 )
							ret := -1.000000 // sell
					if( bearPower > -0.00076 )
						if( VIM <= 0.913602 )
							ret := 0.666667
						if( VIM > 0.913602 )
							ret := -1.000000 // sell
				if( VIP > 1.07458 )
					if( bbp <= 0.010943 )
						if( bbm <= 0.012012 )
							ret := 0.250000
						if( bbm > 0.012012 )
							if( VIP <= 1.09911 )
								if( VIP <= 1.08806 )
									ret := -0.600000
								if( VIP > 1.08806 )
									ret := 0.250000
							if( VIP > 1.09911 )
								if( VIP_VIM <= 0.265437 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.265437 )
									ret := -0.750000 // sell
					if( bbp > 0.010943 )
						if( VIM <= 0.806682 )
							if( VIP <= 1.17137 )
								if( bbp <= 0.012255 )
									ret := 0.500000
								if( bbp > 0.012255 )
									ret := -0.894737 // sell
							if( VIP > 1.17137 )
								ret := 1.000000 // buy
						if( VIM > 0.806682 )
							if( VIM <= 0.888057 )
								if( VIP_VIM <= 0.292272 )
									ret := 0.857143 // buy
								if( VIP_VIM > 0.292272 )
									ret := 0.142857
							if( VIM > 0.888057 )
								if( bearPower <= -0.001021 )
									ret := -0.800000 // sell
								if( bearPower > -0.001021 )
									ret := 0.500000
	if( bearPower > -0.000495 )
		if( bbm <= 0.038998 )
			if( VIP_VIM <= 1.03395 )
				if( bearPower <= 0.001603 )
					if( VIM <= 0.74964 )
						if( bbm <= 0.000642 )
							if( VIP <= 1.30034 )
								if( bullPower <= 0.001152 )
									ret := -0.047826
								if( bullPower > 0.001152 )
									ret := -0.290698
							if( VIP > 1.30034 )
								if( VIP_VIM <= 0.720215 )
									ret := 0.175182
								if( VIP_VIM > 0.720215 )
									ret := -0.064516
						if( bbm > 0.000642 )
							if( bearPower <= 0.000997 )
								if( VIM <= 0.72948 )
									ret := 0.219370
								if( VIM > 0.72948 )
									ret := 0.425234
							if( bearPower > 0.000997 )
								if( VIP_VIM <= 0.616329 )
									ret := -0.055409
								if( VIP_VIM > 0.616329 )
									ret := 0.251938
					if( VIM > 0.74964 )
						if( VIP_VIM <= 0.566319 )
							if( VIP_VIM <= 0.545615 )
								if( bbm <= 0.000804 )
									ret := -0.006197
								if( bbm > 0.000804 )
									ret := 0.031573
							if( VIP_VIM > 0.545615 )
								if( bearPower <= 0.000433 )
									ret := 0.066667
								if( bearPower > 0.000433 )
									ret := 0.707317 // buy
						if( VIP_VIM > 0.566319 )
							if( bullPower <= 0.00082 )
								ret := 0.000000
							if( bullPower > 0.00082 )
								if( bearPower <= 0.000867 )
									ret := -0.894737 // sell
								if( bearPower > 0.000867 )
									ret := -0.500000
				if( bearPower > 0.001603 )
					if( VIP_VIM <= 0.436753 )
						if( VIP_VIM <= 0.429675 )
							if( bearPower <= 0.002858 )
								if( VIP <= 1.16776 )
									ret := 0.020000
								if( VIP > 1.16776 )
									ret := -0.159836
							if( bearPower > 0.002858 )
								if( VIP_VIM <= 0.288844 )
									ret := -0.080392
								if( VIP_VIM > 0.288844 )
									ret := 0.180217
						if( VIP_VIM > 0.429675 )
							if( VIP <= 1.24968 )
								if( bearPower <= 0.004488 )
									ret := 0.296296
								if( bearPower > 0.004488 )
									ret := 0.904762 // buy
							if( VIP > 1.24968 )
								if( bbm <= 0.002314 )
									ret := -0.750000 // sell
								if( bbm > 0.002314 )
									ret := -1.000000 // sell
					if( VIP_VIM > 0.436753 )
						if( VIM <= 0.533054 )
							if( VIM <= 0.458714 )
								if( VIP <= 1.37929 )
									ret := -0.500000
								if( VIP > 1.37929 )
									ret := -1.000000 // sell
							if( VIM > 0.458714 )
								if( bullPower <= 0.010129 )
									ret := -0.200000
								if( bullPower > 0.010129 )
									ret := 0.596491
						if( VIM > 0.533054 )
							if( bullPower <= 0.023631 )
								if( VIP_VIM <= 0.448392 )
									ret := -0.484536
								if( VIP_VIM > 0.448392 )
									ret := -0.140434
							if( bullPower > 0.023631 )
								if( VIM <= 0.613026 )
									ret := -0.703704 // sell
								if( VIM > 0.613026 )
									ret := 0.154717
			if( VIP_VIM > 1.03395 )
				if( VIP <= 1.54447 )
					ret := 1.000000 // buy
				if( VIP > 1.54447 )
					ret := -0.500000
		if( bbm > 0.038998 )
			if( bbm <= 0.048309 )
				if( bbm <= 0.042404 )
					if( VIM <= 0.713267 )
						ret := -0.750000 // sell
					if( VIM > 0.713267 )
						ret := -1.000000 // sell
				if( bbm > 0.042404 )
					ret := 0.250000
			if( bbm > 0.048309 )
				ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_36e21e38(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)

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


