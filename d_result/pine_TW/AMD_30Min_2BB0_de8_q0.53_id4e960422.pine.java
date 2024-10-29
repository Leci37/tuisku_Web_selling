//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: AMD_30Min_2BB0_4e960422 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_2BB0_4e960422", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_4e960422(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Lower_Band <= 1.86207 )
		if( bullPower <= 0.03325 )
			if( Lower_Band <= 1.80967 )
				if( Upper_Band <= 1.91685 )
					ret := 1.000000 // buy
				if( Upper_Band > 1.91685 )
					if( bullPower <= -0.00114 )
						if( bbp <= -0.064726 )
							ret := 0.416667
						if( bbp > -0.064726 )
							if( bbp <= -0.028916 )
								ret := 1.000000 // buy
							if( bbp > -0.028916 )
								ret := 0.909091 // buy
					if( bullPower > -0.00114 )
						ret := -0.250000
			if( Lower_Band > 1.80967 )
				if( Upper_Band <= 1.97899 )
					if( Lower_Band <= 1.85354 )
						if( bullPower <= 0.007517 )
							if( Upper_Band <= 1.94554 )
								ret := -0.277778
							if( Upper_Band > 1.94554 )
								ret := -0.777778 // sell
						if( bullPower > 0.007517 )
							ret := -0.038462
					if( Lower_Band > 1.85354 )
						if( bearPower <= -0.01842 )
							ret := 0.181818
						if( bearPower > -0.01842 )
							ret := 1.000000 // buy
				if( Upper_Band > 1.97899 )
					ret := 1.000000 // buy
		if( bullPower > 0.03325 )
			if( Upper_Band <= 1.90752 )
				ret := 0.944444 // buy
			if( Upper_Band > 1.90752 )
				if( bbm <= 0.042022 )
					if( bbp <= 0.065762 )
						if( bullPower <= 0.04313 )
							ret := -0.600000
						if( bullPower > 0.04313 )
							ret := -0.937500 // sell
					if( bbp > 0.065762 )
						ret := -0.083333
				if( bbm > 0.042022 )
					ret := -0.952381 // sell
	if( Lower_Band > 1.86207 )
		if( bullPower <= 0.101114 )
			if( bbm <= 0.50995 )
				if( Lower_Band <= 3.02998 )
					if( bearPower <= 0.065442 )
						if( Lower_Band <= 2.80772 )
							if( bearPower <= 0.023658 )
								if( basis <= 2.85917 )
									ret := -0.058635
								if( basis > 2.85917 )
									ret := 0.690909
							if( bearPower > 0.023658 )
								if( basis <= 2.08392 )
									ret := -0.878378 // sell
								if( basis > 2.08392 )
									ret := -0.156682
						if( Lower_Band > 2.80772 )
							if( Upper_Band <= 2.88086 )
								ret := 0.142857
							if( Upper_Band > 2.88086 )
								if( bbm <= 0.040284 )
									ret := -0.837838 // sell
								if( bbm > 0.040284 )
									ret := -1.000000 // sell
					if( bearPower > 0.065442 )
						ret := 1.000000 // buy
				if( Lower_Band > 3.02998 )
					if( Lower_Band <= 6.66271 )
						if( Lower_Band <= 6.08653 )
							if( bbm <= 0.021863 )
								if( bbp <= -0.077034 )
									ret := 0.793103 // buy
								if( bbp > -0.077034 )
									ret := 0.187675
							if( bbm > 0.021863 )
								if( Lower_Band <= 5.07461 )
									ret := 0.133510
								if( Lower_Band > 5.07461 )
									ret := -0.353511
						if( Lower_Band > 6.08653 )
							if( basis <= 6.53306 )
								if( basis <= 6.35199 )
									ret := 0.335260
								if( basis > 6.35199 )
									ret := 0.683128
							if( basis > 6.53306 )
								if( Upper_Band <= 6.75367 )
									ret := 0.447293
								if( Upper_Band > 6.75367 )
									ret := 0.047414
					if( Lower_Band > 6.66271 )
						if( bbp <= -1.21633 )
							if( Upper_Band <= 27.4445 )
								if( bullPower <= -0.586022 )
									ret := 0.911765 // buy
								if( bullPower > -0.586022 )
									ret := 0.533333
							if( Upper_Band > 27.4445 )
								if( basis <= 26.6579 )
									ret := -0.781250 // sell
								if( basis > 26.6579 )
									ret := 0.130414
						if( bbp > -1.21633 )
							if( Lower_Band <= 8.25286 )
								if( Upper_Band <= 6.862 )
									ret := 0.777778 // buy
								if( Upper_Band > 6.862 )
									ret := -0.298899
							if( Lower_Band > 8.25286 )
								if( basis <= 9.78928 )
									ret := 0.393043
								if( basis > 9.78928 )
									ret := 0.027865
			if( bbm > 0.50995 )
				if( Lower_Band <= 24.7783 )
					if( Upper_Band <= 26.1213 )
						if( Upper_Band <= 25.4747 )
							if( bbp <= -0.48188 )
								if( basis <= 20.0376 )
									ret := 0.804348 // buy
								if( basis > 20.0376 )
									ret := 0.150000
							if( bbp > -0.48188 )
								ret := 0.058824
						if( Upper_Band > 25.4747 )
							ret := -0.500000
					if( Upper_Band > 26.1213 )
						ret := 1.000000 // buy
				if( Lower_Band > 24.7783 )
					if( basis <= 33.691 )
						if( bbm <= 1.12196 )
							if( Lower_Band <= 30.7591 )
								if( Lower_Band <= 27.1909 )
									ret := -0.812500 // sell
								if( Lower_Band > 27.1909 )
									ret := 0.157143
							if( Lower_Band > 30.7591 )
								if( Upper_Band <= 33.3758 )
									ret := -0.588235
								if( Upper_Band > 33.3758 )
									ret := -0.948276 // sell
						if( bbm > 1.12196 )
							ret := 0.875000 // buy
					if( basis > 33.691 )
						if( Lower_Band <= 39.1376 )
							if( Lower_Band <= 38.2996 )
								if( Upper_Band <= 41.9474 )
									ret := 0.545455
								if( Upper_Band > 41.9474 )
									ret := 0.976190 // buy
							if( Lower_Band > 38.2996 )
								ret := 0.428571
						if( Lower_Band > 39.1376 )
							if( bbp <= -1.46743 )
								if( bbp <= -5.96999 )
									ret := -0.204868
								if( bbp > -5.96999 )
									ret := 0.018090
							if( bbp > -1.46743 )
								if( bullPower <= 0.034286 )
									ret := -0.166907
								if( bullPower > 0.034286 )
									ret := 0.054759
		if( bullPower > 0.101114 )
			if( Lower_Band <= 175.602 )
				if( Lower_Band <= 5.64591 )
					if( bullPower <= 0.114056 )
						if( Upper_Band <= 4.44645 )
							if( basis <= 3.67762 )
								ret := -0.466667
							if( basis > 3.67762 )
								ret := 1.000000 // buy
						if( Upper_Band > 4.44645 )
							if( bbp <= 0.183078 )
								if( basis <= 5.2513 )
									ret := -0.857143 // sell
								if( basis > 5.2513 )
									ret := 0.142857
							if( bbp > 0.183078 )
								ret := 0.166667
					if( bullPower > 0.114056 )
						if( bearPower <= 0.15917 )
							if( bullPower <= 0.164601 )
								if( bullPower <= 0.128684 )
									ret := 0.435294
								if( bullPower > 0.128684 )
									ret := 0.021898
							if( bullPower > 0.164601 )
								if( bbp <= 0.266892 )
									ret := 0.488889
								if( bbp > 0.266892 )
									ret := 0.873786 // buy
						if( bearPower > 0.15917 )
							if( bullPower <= 0.342477 )
								if( bbp <= 0.410155 )
									ret := -0.928571 // sell
								if( bbp > 0.410155 )
									ret := -1.000000 // sell
							if( bullPower > 0.342477 )
								if( Lower_Band <= 5.49187 )
									ret := -0.578947
								if( Lower_Band > 5.49187 )
									ret := 1.000000 // buy
				if( Lower_Band > 5.64591 )
					if( Upper_Band <= 7.10263 )
						if( bbm <= 0.117861 )
							if( bullPower <= 0.158501 )
								if( basis <= 6.74598 )
									ret := -0.168224
								if( basis > 6.74598 )
									ret := -0.820225 // sell
							if( bullPower > 0.158501 )
								if( Lower_Band <= 6.56058 )
									ret := 0.296296
								if( Lower_Band > 6.56058 )
									ret := -0.875000 // sell
						if( bbm > 0.117861 )
							if( basis <= 5.86922 )
								ret := -1.000000 // sell
							if( basis > 5.86922 )
								if( basis <= 6.53742 )
									ret := -0.357143
								if( basis > 6.53742 )
									ret := -0.723077 // sell
					if( Upper_Band > 7.10263 )
						if( bearPower <= -1.14973 )
							if( bbp <= -4.12314 )
								if( bbp <= -6.72783 )
									ret := -1.000000 // sell
								if( bbp > -6.72783 )
									ret := -0.466667
							if( bbp > -4.12314 )
								if( Upper_Band <= 88.8463 )
									ret := 0.477204
								if( Upper_Band > 88.8463 )
									ret := 0.018182
						if( bearPower > -1.14973 )
							if( bearPower <= -0.567934 )
								if( basis <= 51.3354 )
									ret := -0.367521
								if( basis > 51.3354 )
									ret := -0.071945
							if( bearPower > -0.567934 )
								if( basis <= 178.269 )
									ret := -0.014658
								if( basis > 178.269 )
									ret := 0.717172 // buy
			if( Lower_Band > 175.602 )
				if( basis <= 194.329 )
					if( bearPower <= 2.00678 )
						if( basis <= 182.738 )
							if( Lower_Band <= 175.854 )
								if( bullPower <= 1.31671 )
									ret := -0.657143
								if( bullPower > 1.31671 )
									ret := 0.000000
							if( Lower_Band > 175.854 )
								if( bullPower <= 1.01309 )
									ret := -0.031128
								if( bullPower > 1.01309 )
									ret := -0.473988
						if( basis > 182.738 )
							if( Lower_Band <= 191.32 )
								if( bbm <= 0.688937 )
									ret := 0.076923
								if( bbm > 0.688937 )
									ret := -0.733333 // sell
							if( Lower_Band > 191.32 )
								ret := -1.000000 // sell
					if( bearPower > 2.00678 )
						ret := 0.800000 // buy
				if( basis > 194.329 )
					if( basis <= 202.565 )
						if( bearPower <= -0.01507 )
							if( Upper_Band <= 201.733 )
								if( bearPower <= -0.709414 )
									ret := 0.736842 // buy
								if( bearPower > -0.709414 )
									ret := 0.000000
							if( Upper_Band > 201.733 )
								if( Lower_Band <= 198.342 )
									ret := 0.846154 // buy
								if( Lower_Band > 198.342 )
									ret := 0.979592 // buy
						if( bearPower > -0.01507 )
							if( bearPower <= 0.396472 )
								ret := 0.238095
							if( bearPower > 0.396472 )
								if( Upper_Band <= 204.124 )
									ret := 0.000000
								if( Upper_Band > 204.124 )
									ret := -0.153846
					if( basis > 202.565 )
						if( bearPower <= -0.635034 )
							if( basis <= 211.99 )
								if( Lower_Band <= 204.626 )
									ret := -0.200000
								if( Lower_Band > 204.626 )
									ret := 0.444444
							if( basis > 211.99 )
								ret := -1.000000 // sell
						if( bearPower > -0.635034 )
							if( bbp <= 2.09106 )
								if( Lower_Band <= 200.547 )
									ret := 0.384615
								if( Lower_Band > 200.547 )
									ret := -0.660377
							if( bbp > 2.09106 )
								if( Lower_Band <= 202.288 )
									ret := 0.000000
								if( Lower_Band > 202.288 )
									ret := -0.892857 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_AMD_30Min_4e960422(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


