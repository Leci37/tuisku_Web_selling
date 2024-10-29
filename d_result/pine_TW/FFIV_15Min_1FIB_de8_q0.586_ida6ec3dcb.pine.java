//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: FFIV_15Min_1FIB_a6ec3dcb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1FIB_a6ec3dcb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_a6ec3dcb(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( upper_2 <= 117.364 )
		if( lower_6 <= 92.3784 )
			if( lower_3 <= 87.9714 )
				if( upper_2 <= 110.786 )
					if( lower_2 <= 90.2553 )
						ret := 1.000000 // buy
					if( lower_2 > 90.2553 )
						ret := 0.714286 // buy
				if( upper_2 > 110.786 )
					ret := 0.000000
			if( lower_3 > 87.9714 )
				if( upper_3 <= 110.353 )
					if( basis_max <= -14.8798 )
						if( basis <= 96.4985 )
							ret := -1.000000 // sell
						if( basis > 96.4985 )
							if( basis_minus <= 15.0667 )
								if( lower_1 <= 93.2812 )
									ret := -1.000000 // sell
								if( lower_1 > 93.2812 )
									ret := -0.470588
							if( basis_minus > 15.0667 )
								if( basis_minus <= 16.588 )
									ret := 0.460094
								if( basis_minus > 16.588 )
									ret := 0.070423
					if( basis_max > -14.8798 )
						if( basis <= 96.7218 )
							ret := 0.666667
						if( basis > 96.7218 )
							ret := 1.000000 // buy
				if( upper_3 > 110.353 )
					if( upper_2 <= 109.535 )
						if( basis <= 103.329 )
							if( lower_4 <= 92.6928 )
								ret := -0.875000 // sell
							if( lower_4 > 92.6928 )
								ret := -1.000000 // sell
						if( basis > 103.329 )
							if( basis <= 103.666 )
								if( upper_4 <= 112.831 )
									ret := -0.533333
								if( upper_4 > 112.831 )
									ret := 0.000000
							if( basis > 103.666 )
								ret := -1.000000 // sell
					if( upper_2 > 109.535 )
						if( lower_5 <= 93.5692 )
							if( upper_2 <= 110.424 )
								if( basis <= 104.319 )
									ret := 1.000000 // buy
								if( basis > 104.319 )
									ret := 0.866667 // buy
							if( upper_2 > 110.424 )
								if( upper_2 <= 115.142 )
									ret := -0.500000
								if( upper_2 > 115.142 )
									ret := 0.160920
						if( lower_5 > 93.5692 )
							if( lower_4 <= 97.2066 )
								if( lower_2 <= 99.8689 )
									ret := -0.722222 // sell
								if( lower_2 > 99.8689 )
									ret := -1.000000 // sell
							if( lower_4 > 97.2066 )
								ret := -0.214286
		if( lower_6 > 92.3784 )
			if( basis <= 107.991 )
				if( basis <= 107.358 )
					if( upper_5 <= 116.081 )
						if( basis_max <= -12.3837 )
							ret := -0.818182 // sell
						if( basis_max > -12.3837 )
							if( upper_2 <= 111.268 )
								ret := 0.933333 // buy
							if( upper_2 > 111.268 )
								ret := 0.700000 // buy
					if( upper_5 > 116.081 )
						if( lower_5 <= 96.393 )
							ret := 1.000000 // buy
						if( lower_5 > 96.393 )
							ret := 0.846154 // buy
				if( basis > 107.358 )
					if( upper_2 <= 111.272 )
						ret := 0.000000
					if( upper_2 > 111.272 )
						if( upper_4 <= 113.672 )
							ret := -1.000000 // sell
						if( upper_4 > 113.672 )
							ret := -0.181818
			if( basis > 107.991 )
				if( upper_4 <= 114.675 )
					if( upper_5 <= 114.778 )
						if( lower_5 <= 101.866 )
							ret := 1.000000 // buy
						if( lower_5 > 101.866 )
							ret := 0.466667
					if( upper_5 > 114.778 )
						ret := 1.000000 // buy
				if( upper_4 > 114.675 )
					if( upper_3 <= 115.393 )
						ret := -0.428571
					if( upper_3 > 115.393 )
						if( upper_3 <= 117.399 )
							if( upper_4 <= 117.016 )
								ret := -0.272727
							if( upper_4 > 117.016 )
								if( upper_3 <= 116.869 )
									ret := 0.836066 // buy
								if( upper_3 > 116.869 )
									ret := 0.294118
						if( upper_3 > 117.399 )
							if( lower_3 <= 102.583 )
								ret := 1.000000 // buy
							if( lower_3 > 102.583 )
								if( upper_1 <= 117.051 )
									ret := 0.250000
								if( upper_1 > 117.051 )
									ret := 1.000000 // buy
	if( upper_2 > 117.364 )
		if( upper_5 <= 152.984 )
			if( basis_max <= -22.973 )
				if( basis_max <= -23.4721 )
					if( basis_minus <= 23.6759 )
						ret := -1.000000 // sell
					if( basis_minus > 23.6759 )
						if( lower_1 <= 124.15 )
							ret := -0.444444
						if( lower_1 > 124.15 )
							if( basis <= 130.504 )
								ret := -1.000000 // sell
							if( basis > 130.504 )
								ret := -0.750000 // sell
				if( basis_max > -23.4721 )
					if( lower_6 <= 86.4953 )
						ret := 0.428571
					if( lower_6 > 86.4953 )
						ret := -1.000000 // sell
			if( basis_max > -22.973 )
				if( upper_4 <= 148.256 )
					if( upper_6 <= 148.688 )
						if( lower_3 <= 139 )
							if( lower_3 <= 138.906 )
								if( basis_max <= -1.25029 )
									ret := 0.024159
								if( basis_max > -1.25029 )
									ret := 1.000000 // buy
							if( lower_3 > 138.906 )
								if( lower_5 <= 137.657 )
									ret := -0.796875 // sell
								if( lower_5 > 137.657 )
									ret := 0.000000
						if( lower_3 > 139 )
							if( lower_5 <= 140.657 )
								if( basis_max <= -4.78752 )
									ret := 0.508121
								if( basis_max > -4.78752 )
									ret := 0.171558
							if( lower_5 > 140.657 )
								if( lower_2 <= 141.982 )
									ret := -0.842105 // sell
								if( lower_2 > 141.982 )
									ret := 0.055771
					if( upper_6 > 148.688 )
						if( upper_2 <= 146.842 )
							if( lower_2 <= 143.401 )
								if( lower_3 <= 133.209 )
									ret := -0.333333
								if( lower_3 > 133.209 )
									ret := -0.079011
							if( lower_2 > 143.401 )
								if( lower_3 <= 143.393 )
									ret := -0.734848 // sell
								if( lower_3 > 143.393 )
									ret := -0.972973 // sell
						if( upper_2 > 146.842 )
							if( lower_1 <= 145.482 )
								if( upper_4 <= 147.696 )
									ret := -0.422222
								if( upper_4 > 147.696 )
									ret := 0.524064
							if( lower_1 > 145.482 )
								if( lower_5 <= 144.072 )
									ret := -0.909091 // sell
								if( lower_5 > 144.072 )
									ret := -0.010000
				if( upper_4 > 148.256 )
					if( upper_6 <= 151.61 )
						if( upper_3 <= 147.7 )
							if( basis_minus <= 7.88692 )
								if( upper_3 <= 147.473 )
									ret := 0.966667 // buy
								if( upper_3 > 147.473 )
									ret := 0.420635
							if( basis_minus > 7.88692 )
								if( upper_6 <= 151.577 )
									ret := 0.222222
								if( upper_6 > 151.577 )
									ret := -1.000000 // sell
						if( upper_3 > 147.7 )
							if( upper_4 <= 149.784 )
								if( upper_5 <= 149.145 )
									ret := 0.436170
								if( upper_5 > 149.145 )
									ret := -0.067013
							if( upper_4 > 149.784 )
								if( upper_5 <= 150.516 )
									ret := -0.702381 // sell
								if( upper_5 > 150.516 )
									ret := -0.156250
					if( upper_6 > 151.61 )
						if( lower_3 <= 128.564 )
							if( upper_5 <= 151.739 )
								ret := -0.285714
							if( upper_5 > 151.739 )
								ret := -1.000000 // sell
						if( lower_3 > 128.564 )
							if( lower_6 <= 129.012 )
								if( upper_6 <= 156.628 )
									ret := 0.607046
								if( upper_6 > 156.628 )
									ret := -0.238095
							if( lower_6 > 129.012 )
								if( lower_1 <= 140.049 )
									ret := -0.319853
								if( lower_1 > 140.049 )
									ret := 0.152937
		if( upper_5 > 152.984 )
			if( lower_2 <= 148.632 )
				if( lower_5 <= 143.368 )
					if( upper_3 <= 151.036 )
						if( basis_max <= -20.5919 )
							if( upper_4 <= 152.902 )
								if( basis_max <= -26.8568 )
									ret := 0.275862
								if( basis_max > -26.8568 )
									ret := 0.870370 // buy
							if( upper_4 > 152.902 )
								if( lower_6 <= 107.148 )
									ret := 0.500000
								if( lower_6 > 107.148 )
									ret := -0.660000
						if( basis_max > -20.5919 )
							if( upper_2 <= 148.297 )
								if( upper_2 <= 147.033 )
									ret := -0.025316
								if( upper_2 > 147.033 )
									ret := -0.733813 // sell
							if( upper_2 > 148.297 )
								if( basis_minus <= 9.67892 )
									ret := -0.681818
								if( basis_minus > 9.67892 )
									ret := 0.333333
					if( upper_3 > 151.036 )
						if( basis_max <= -8.16314 )
							if( upper_5 <= 161.725 )
								if( basis <= 150.348 )
									ret := -0.098620
								if( basis > 150.348 )
									ret := -0.617424
							if( upper_5 > 161.725 )
								if( upper_2 <= 159.237 )
									ret := 0.550676
								if( upper_2 > 159.237 )
									ret := -0.195122
						if( basis_max > -8.16314 )
							if( lower_1 <= 146.723 )
								if( upper_5 <= 153.401 )
									ret := -0.133333
								if( upper_5 > 153.401 )
									ret := 0.674797
							if( lower_1 > 146.723 )
								if( basis_max <= -7.31961 )
									ret := 0.691358
								if( basis_max > -7.31961 )
									ret := -0.125000
				if( lower_5 > 143.368 )
					if( upper_6 <= 157.676 )
						if( upper_3 <= 153.526 )
							if( upper_1 <= 150.321 )
								if( lower_2 <= 145.917 )
									ret := -0.076923
								if( lower_2 > 145.917 )
									ret := -0.790210 // sell
							if( upper_1 > 150.321 )
								if( lower_3 <= 146.718 )
									ret := 0.060284
								if( lower_3 > 146.718 )
									ret := -0.517588
						if( upper_3 > 153.526 )
							if( upper_6 <= 157.127 )
								ret := 1.000000 // buy
							if( upper_6 > 157.127 )
								if( upper_6 <= 157.409 )
									ret := -0.312500
								if( upper_6 > 157.409 )
									ret := 0.613445
					if( upper_6 > 157.676 )
						if( lower_4 <= 145.804 )
							if( lower_6 <= 140.869 )
								ret := -0.100000
							if( lower_6 > 140.869 )
								if( basis_minus <= 7.89944 )
									ret := -0.458333
								if( basis_minus > 7.89944 )
									ret := -0.829545 // sell
						if( lower_4 > 145.804 )
							if( lower_2 <= 148.139 )
								if( lower_6 <= 142.972 )
									ret := 0.717949 // buy
								if( lower_6 > 142.972 )
									ret := -0.142857
							if( lower_2 > 148.139 )
								if( basis_max <= -7.55843 )
									ret := -0.369792
								if( basis_max > -7.55843 )
									ret := -0.718750 // sell
			if( lower_2 > 148.632 )
				if( lower_5 <= 229.418 )
					if( lower_2 <= 233.608 )
						if( lower_6 <= 223.835 )
							if( upper_2 <= 236.372 )
								if( upper_3 <= 236.391 )
									ret := -0.010608
								if( upper_3 > 236.391 )
									ret := 0.561290
							if( upper_2 > 236.372 )
								if( upper_1 <= 235.517 )
									ret := -0.903614 // sell
								if( upper_1 > 235.517 )
									ret := -0.246241
						if( lower_6 > 223.835 )
							if( basis <= 233.557 )
								if( lower_2 <= 229.738 )
									ret := 0.650794
								if( lower_2 > 229.738 )
									ret := 0.898305 // buy
							if( basis > 233.557 )
								if( upper_6 <= 249.832 )
									ret := -0.347458
								if( upper_6 > 249.832 )
									ret := 0.631579
					if( lower_2 > 233.608 )
						if( basis_minus <= 15.7713 )
							if( basis <= 240.471 )
								ret := 0.500000
							if( basis > 240.471 )
								ret := 1.000000 // buy
						if( basis_minus > 15.7713 )
							ret := 1.000000 // buy
				if( lower_5 > 229.418 )
					if( upper_3 <= 247.9 )
						if( lower_5 <= 229.469 )
							ret := -1.000000 // sell
						if( lower_5 > 229.469 )
							if( upper_5 <= 250.079 )
								if( lower_1 <= 234.81 )
									ret := -0.375000
								if( lower_1 > 234.81 )
									ret := -0.903846 // sell
							if( upper_5 > 250.079 )
								ret := -0.333333
					if( upper_3 > 247.9 )
						if( upper_3 <= 248.148 )
							if( upper_3 <= 248.088 )
								ret := 0.444444
							if( upper_3 > 248.088 )
								ret := 1.000000 // buy
						if( upper_3 > 248.148 )
							if( basis <= 242.566 )
								if( basis <= 241.947 )
									ret := -0.933333 // sell
								if( basis > 241.947 )
									ret := -0.370370
							if( basis > 242.566 )
								if( upper_5 <= 251.733 )
									ret := -0.727273 // sell
								if( upper_5 > 251.733 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_FFIV_15Min_a6ec3dcb(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


