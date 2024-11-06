//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: SNOW_1Min_1FIB_580ee24a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1FIB_580ee24a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_580ee24a(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( basis <= 111.183 )
		if( lower_1 <= 110.597 )
			if( upper_1 <= 111.778 )
				if( upper_3 <= 111.646 )
					if( lower_1 <= 110.585 )
						if( lower_3 <= 106.994 )
							if( lower_2 <= 107.401 )
								ret := 0.966667 // buy
							if( lower_2 > 107.401 )
								ret := 0.777778 // buy
						if( lower_3 > 106.994 )
							if( lower_4 <= 107.213 )
								ret := -0.534722
							if( lower_4 > 107.213 )
								ret := 0.106600
					if( lower_1 > 110.585 )
						if( lower_2 <= 110.434 )
							if( lower_4 <= 110.17 )
								ret := -0.315789
							if( lower_4 > 110.17 )
								ret := -1.000000 // sell
						if( lower_2 > 110.434 )
							if( lower_6 <= 110.064 )
								ret := 0.370370
							if( lower_6 > 110.064 )
								ret := -0.460674
				if( upper_3 > 111.646 )
					if( upper_3 <= 111.992 )
						if( lower_4 <= 109.901 )
							if( basis_max <= -2.4108 )
								ret := -0.664948
							if( basis_max > -2.4108 )
								ret := -0.008850
						if( lower_4 > 109.901 )
							if( lower_4 <= 109.927 )
								ret := -0.769231 // sell
							if( lower_4 > 109.927 )
								ret := -0.978261 // sell
					if( upper_3 > 111.992 )
						if( upper_1 <= 111.598 )
							if( basis_max <= -2.17809 )
								ret := 0.761538 // buy
							if( basis_max > -2.17809 )
								ret := -0.560000
						if( upper_1 > 111.598 )
							if( lower_3 <= 109.828 )
								ret := -0.288889
							if( lower_3 > 109.828 )
								ret := -0.894737 // sell
			if( upper_1 > 111.778 )
				if( basis <= 111.155 )
					if( upper_2 <= 112.318 )
						if( upper_4 <= 112.889 )
							if( basis_max <= -2.77693 )
								ret := 1.000000 // buy
							if( basis_max > -2.77693 )
								ret := 0.750000 // buy
						if( upper_4 > 112.889 )
							if( basis <= 111.069 )
								ret := 0.000000
							if( basis > 111.069 )
								ret := -0.550000
					if( upper_2 > 112.318 )
						if( lower_6 <= 106.342 )
							if( upper_4 <= 114.017 )
								ret := 0.937500 // buy
							if( upper_4 > 114.017 )
								ret := 0.250000
						if( lower_6 > 106.342 )
							if( lower_2 <= 109.422 )
								ret := 0.000000
							if( lower_2 > 109.422 )
								ret := 0.600000
				if( basis > 111.155 )
					if( lower_4 <= 109.268 )
						ret := 0.500000
					if( lower_4 > 109.268 )
						if( upper_3 <= 112.692 )
							ret := 1.000000 // buy
						if( upper_3 > 112.692 )
							ret := 0.750000 // buy
		if( lower_1 > 110.597 )
			if( lower_1 <= 110.851 )
				if( basis_minus <= 1.46812 )
					if( basis_minus <= 1.41323 )
						if( lower_5 <= 110.072 )
							if( basis <= 111.034 )
								ret := 0.843537 // buy
							if( basis > 111.034 )
								ret := 0.000000
						if( lower_5 > 110.072 )
							if( lower_2 <= 110.646 )
								ret := 0.046512
							if( lower_2 > 110.646 )
								ret := 0.697674
					if( basis_minus > 1.41323 )
						if( upper_6 <= 112.575 )
							if( lower_3 <= 110.388 )
								ret := -0.767123 // sell
							if( lower_3 > 110.388 )
								ret := 0.000000
						if( upper_6 > 112.575 )
							if( upper_6 <= 112.586 )
								ret := 0.111111
							if( upper_6 > 112.586 )
								ret := 1.000000 // buy
				if( basis_minus > 1.46812 )
					if( lower_2 <= 110.469 )
						if( basis_max <= -1.76436 )
							if( upper_5 <= 112.765 )
								ret := 0.395833
							if( upper_5 > 112.765 )
								ret := 1.000000 // buy
						if( basis_max > -1.76436 )
							if( upper_2 <= 111.698 )
								ret := -0.363636
							if( upper_2 > 111.698 )
								ret := 0.000000
					if( lower_2 > 110.469 )
						if( upper_1 <= 111.552 )
							if( lower_3 <= 110.375 )
								ret := 0.929825 // buy
							if( lower_3 > 110.375 )
								ret := 0.581081
						if( upper_1 > 111.552 )
							ret := -0.666667
			if( lower_1 > 110.851 )
				if( upper_4 <= 111.921 )
					ret := -0.500000
				if( upper_4 > 111.921 )
					if( upper_3 <= 111.869 )
						ret := -1.000000 // sell
					if( upper_3 > 111.869 )
						ret := -0.750000 // sell
	if( basis > 111.183 )
		if( basis_minus <= 4.22131 )
			if( lower_3 <= 164.187 )
				if( lower_6 <= 118.332 )
					if( lower_3 <= 114.263 )
						if( lower_1 <= 114.423 )
							if( upper_1 <= 114.312 )
								ret := -0.001352
							if( upper_1 > 114.312 )
								ret := -0.152587
						if( lower_1 > 114.423 )
							if( upper_5 <= 115.823 )
								ret := -0.067568
							if( upper_5 > 115.823 )
								ret := 0.348668
					if( lower_3 > 114.263 )
						if( basis <= 115.234 )
							if( lower_1 <= 114.6 )
								ret := -0.179775
							if( lower_1 > 114.6 )
								ret := -0.604811
						if( basis > 115.234 )
							if( basis <= 115.289 )
								ret := 0.735849 // buy
							if( basis > 115.289 )
								ret := -0.168840
				if( lower_6 > 118.332 )
					if( lower_4 <= 125.498 )
						if( lower_4 <= 125.063 )
							if( upper_3 <= 121.878 )
								ret := 0.315508
							if( upper_3 > 121.878 )
								ret := 0.028801
						if( lower_4 > 125.063 )
							if( lower_3 <= 125.313 )
								ret := 0.692015
							if( lower_3 > 125.313 )
								ret := 0.214597
					if( lower_4 > 125.498 )
						if( basis_max <= -3.48214 )
							if( lower_2 <= 147.309 )
								ret := -0.218737
							if( lower_2 > 147.309 )
								ret := 0.068408
						if( basis_max > -3.48214 )
							if( upper_2 <= 159.528 )
								ret := -0.016199
							if( upper_2 > 159.528 )
								ret := 0.081439
			if( lower_3 > 164.187 )
				if( lower_6 <= 168.167 )
					if( upper_1 <= 170.926 )
						if( lower_1 <= 164.584 )
							if( upper_3 <= 165.077 )
								ret := -0.775000 // sell
							if( upper_3 > 165.077 )
								ret := -0.007042
						if( lower_1 > 164.584 )
							if( upper_6 <= 172.626 )
								ret := -0.552743
							if( upper_6 > 172.626 )
								ret := -0.868687 // sell
					if( upper_1 > 170.926 )
						if( lower_1 <= 169.735 )
							if( lower_5 <= 167.78 )
								ret := 0.972973 // buy
							if( lower_5 > 167.78 )
								ret := 0.750000 // buy
						if( lower_1 > 169.735 )
							if( basis_max <= -3.5964 )
								ret := -0.437500
							if( basis_max > -3.5964 )
								ret := -0.947368 // sell
				if( lower_6 > 168.167 )
					if( upper_1 <= 170.375 )
						if( upper_4 <= 170.924 )
							if( upper_5 <= 171.138 )
								ret := 0.375000
							if( upper_5 > 171.138 )
								ret := 1.000000 // buy
						if( upper_4 > 170.924 )
							if( upper_2 <= 170.547 )
								ret := -1.000000 // sell
							if( upper_2 > 170.547 )
								ret := 0.285714
					if( upper_1 > 170.375 )
						if( basis_minus <= 1.74758 )
							ret := 0.750000 // buy
						if( basis_minus > 1.74758 )
							ret := 1.000000 // buy
		if( basis_minus > 4.22131 )
			if( lower_3 <= 154.772 )
				if( basis_minus <= 4.83881 )
					if( lower_1 <= 114.813 )
						if( lower_5 <= 109.259 )
							if( lower_2 <= 110.263 )
								ret := -0.279070
							if( lower_2 > 110.263 )
								ret := 0.444444
						if( lower_5 > 109.259 )
							if( lower_2 <= 113.859 )
								ret := -0.235602
							if( lower_2 > 113.859 )
								ret := -0.896552 // sell
					if( lower_1 > 114.813 )
						if( lower_3 <= 125.968 )
							if( lower_1 <= 121.095 )
								ret := 0.249071
							if( lower_1 > 121.095 )
								ret := 0.591078
						if( lower_3 > 125.968 )
							if( lower_5 <= 127.454 )
								ret := -0.102725
							if( lower_5 > 127.454 )
								ret := 0.253623
				if( basis_minus > 4.83881 )
					if( lower_1 <= 155.242 )
						if( basis_max <= -18.7079 )
							if( upper_1 <= 163.526 )
								ret := 0.864865 // buy
							if( upper_1 > 163.526 )
								ret := 0.307692
						if( basis_max > -18.7079 )
							if( basis <= 119.002 )
								ret := 0.180137
							if( basis > 119.002 )
								ret := -0.057661
					if( lower_1 > 155.242 )
						if( lower_1 <= 156.704 )
							if( lower_2 <= 154.624 )
								ret := 0.712121 // buy
							if( lower_2 > 154.624 )
								ret := 0.380952
						if( lower_1 > 156.704 )
							if( upper_1 <= 163.085 )
								ret := -0.750000 // sell
							if( upper_1 > 163.085 )
								ret := -1.000000 // sell
			if( lower_3 > 154.772 )
				if( lower_4 <= 155.037 )
					if( basis_minus <= 4.49855 )
						ret := 0.000000
					if( basis_minus > 4.49855 )
						if( upper_5 <= 161.309 )
							if( lower_3 <= 155.408 )
								ret := -0.886792 // sell
							if( lower_3 > 155.408 )
								ret := -0.974026 // sell
						if( upper_5 > 161.309 )
							if( upper_1 <= 158.904 )
								ret := 0.076923
							if( upper_1 > 158.904 )
								ret := -0.880952 // sell
				if( lower_4 > 155.037 )
					if( lower_2 <= 156.393 )
						if( lower_3 <= 155.581 )
							ret := 0.333333
						if( lower_3 > 155.581 )
							if( upper_5 <= 161.014 )
								ret := 0.857143 // buy
							if( upper_5 > 161.014 )
								ret := 0.978261 // buy
					if( lower_2 > 156.393 )
						if( upper_2 <= 160.679 )
							if( lower_5 <= 154.805 )
								ret := -0.187500
							if( lower_5 > 154.805 )
								ret := -0.897436 // sell
						if( upper_2 > 160.679 )
							if( lower_5 <= 155.647 )
								ret := 0.757576 // buy
							if( lower_5 > 155.647 )
								ret := -0.024032
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_580ee24a(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


