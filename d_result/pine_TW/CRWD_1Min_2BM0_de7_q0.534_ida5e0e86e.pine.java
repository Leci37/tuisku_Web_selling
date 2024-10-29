//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: CRWD_1Min_2BM0_a5e0e86e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2BM0_a5e0e86e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_a5e0e86e(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.49237e+06 )
		if( BBPower_Color <= 0.5 )
			if( bbm <= 0.818371 )
				if( Positive_Money_Flow_Sum <= 472874 )
					if( Typical_Price <= 283.183 )
						if( Typical_Price <= 243.3 )
							if( Negative_Money_Flow_Sum <= 564556 )
								ret := -0.928571 // sell
							if( Negative_Money_Flow_Sum > 564556 )
								ret := -0.474576
						if( Typical_Price > 243.3 )
							if( Negative_Money_Flow <= 26201.7 )
								ret := 0.181818
							if( Negative_Money_Flow > 26201.7 )
								ret := -0.220280
					if( Typical_Price > 283.183 )
						if( Negative_Money_Flow_Sum <= 568550 )
							ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 568550 )
							if( MFI_Low <= -16.8632 )
								ret := -0.241379
							if( MFI_Low > -16.8632 )
								ret := 0.414384
				if( Positive_Money_Flow_Sum > 472874 )
					if( Negative_Money_Flow_Sum <= 7.97353e+06 )
						if( Typical_Price <= 258.545 )
							if( Raw_Money_Flow <= 74830.9 )
								ret := 0.647059
							if( Raw_Money_Flow > 74830.9 )
								ret := 0.325737
						if( Typical_Price > 258.545 )
							if( bearPower <= -0.429556 )
								ret := 0.329762
							if( bearPower > -0.429556 )
								ret := 0.139019
					if( Negative_Money_Flow_Sum > 7.97353e+06 )
						if( bearPower <= -0.677215 )
							if( Positive_Money_Flow_Sum <= 1.38228e+06 )
								ret := -0.515789
							if( Positive_Money_Flow_Sum > 1.38228e+06 )
								ret := 0.400000
						if( bearPower > -0.677215 )
							if( Typical_Price <= 266.958 )
								ret := 0.591837
							if( Typical_Price > 266.958 )
								ret := -0.060000
			if( bbm > 0.818371 )
				if( Raw_Money_Flow <= 3.00712e+07 )
					if( Positive_Money_Flow <= 407418 )
						if( Typical_Price <= 288.492 )
							if( Typical_Price <= 247.224 )
								ret := 0.555556
							if( Typical_Price > 247.224 )
								ret := 0.875000 // buy
						if( Typical_Price > 288.492 )
							if( Raw_Money_Flow <= 2.01349e+07 )
								ret := 0.302521
							if( Raw_Money_Flow > 2.01349e+07 )
								ret := 0.896552 // buy
					if( Positive_Money_Flow > 407418 )
						ret := -0.375000
				if( Raw_Money_Flow > 3.00712e+07 )
					ret := -0.714286 // sell
		if( BBPower_Color > 0.5 )
			if( Negative_Money_Flow_Sum <= 361239 )
				if( Positive_Money_Flow_Sum <= 1.21083e+06 )
					if( Money_Flow_Ratio <= 6.14946 )
						if( bearPower <= 0.968057 )
							if( Positive_Money_Flow_Sum <= 766818 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 766818 )
								ret := 0.513514
						if( bearPower > 0.968057 )
							ret := -0.300000
					if( Money_Flow_Ratio > 6.14946 )
						if( Negative_Money_Flow_Sum <= 131832 )
							ret := -0.285714
						if( Negative_Money_Flow_Sum > 131832 )
							ret := -0.875000 // sell
				if( Positive_Money_Flow_Sum > 1.21083e+06 )
					if( bbm <= 0.036389 )
						if( Money_Flow_Ratio <= 5.36076 )
							if( Typical_Price <= 260.271 )
								ret := 0.785714 // buy
							if( Typical_Price > 260.271 )
								ret := 0.444444
						if( Money_Flow_Ratio > 5.36076 )
							ret := 1.000000 // buy
					if( bbm > 0.036389 )
						ret := 0.083333
			if( Negative_Money_Flow_Sum > 361239 )
				if( Typical_Price <= 218.235 )
					if( bbp <= 0.464154 )
						ret := -0.818182 // sell
					if( bbp > 0.464154 )
						ret := -1.000000 // sell
				if( Typical_Price > 218.235 )
					if( Typical_Price <= 325.202 )
						if( Money_Flow_Ratio <= 2.58534 )
							if( Positive_Money_Flow_Sum <= 767600 )
								ret := -0.040201
							if( Positive_Money_Flow_Sum > 767600 )
								ret := 0.137640
						if( Money_Flow_Ratio > 2.58534 )
							if( Typical_Price <= 249.03 )
								ret := -0.051282
							if( Typical_Price > 249.03 )
								ret := -0.629630
					if( Typical_Price > 325.202 )
						if( MFI <= 29.4134 )
							if( bbp <= 0.196949 )
								ret := 0.000000
							if( bbp > 0.196949 )
								ret := -0.573034
						if( MFI > 29.4134 )
							if( MFI <= 36.3931 )
								ret := 0.384615
							if( MFI > 36.3931 )
								ret := -0.184466
	if( Positive_Money_Flow_Sum > 1.49237e+06 )
		if( bearPower <= 0.508754 )
			if( Negative_Money_Flow <= 373.704 )
				if( Typical_Price <= 231.006 )
					if( Positive_Money_Flow_Sum <= 1.40773e+08 )
						if( Typical_Price <= 230.783 )
							if( Typical_Price <= 201.015 )
								ret := 0.814815 // buy
							if( Typical_Price > 201.015 )
								ret := 0.169200
						if( Typical_Price > 230.783 )
							if( bbm <= 0.548074 )
								ret := 0.666667
							if( bbm > 0.548074 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.40773e+08 )
						if( Positive_Money_Flow_Sum <= 1.59658e+08 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.59658e+08 )
							ret := -0.428571
				if( Typical_Price > 231.006 )
					if( Negative_Money_Flow_Sum <= 1.79498e+08 )
						if( bbm <= 1.03506 )
							if( MFI <= 10.9287 )
								ret := -0.323741
							if( MFI > 10.9287 )
								ret := 0.010049
						if( bbm > 1.03506 )
							if( Positive_Money_Flow_Sum <= 4.44199e+06 )
								ret := -0.583333
							if( Positive_Money_Flow_Sum > 4.44199e+06 )
								ret := 0.148057
					if( Negative_Money_Flow_Sum > 1.79498e+08 )
						if( Positive_Money_Flow_Sum <= 3.6968e+08 )
							if( Negative_Money_Flow_Sum <= 8.03269e+08 )
								ret := -0.309927
							if( Negative_Money_Flow_Sum > 8.03269e+08 )
								ret := 0.882353 // buy
						if( Positive_Money_Flow_Sum > 3.6968e+08 )
							if( MFI_High <= -9.72269 )
								ret := 0.574074
							if( MFI_High > -9.72269 )
								ret := -0.333333
			if( Negative_Money_Flow > 373.704 )
				if( Negative_Money_Flow <= 157856 )
					if( bullPower <= -0.373417 )
						if( MFI <= 31.9974 )
							if( Positive_Money_Flow_Sum <= 7.46824e+06 )
								ret := -0.416667
							if( Positive_Money_Flow_Sum > 7.46824e+06 )
								ret := 0.432836
						if( MFI > 31.9974 )
							if( Positive_Money_Flow_Sum <= 1.63175e+06 )
								ret := -0.058824
							if( Positive_Money_Flow_Sum > 1.63175e+06 )
								ret := 0.634855
					if( bullPower > -0.373417 )
						if( Typical_Price <= 390.975 )
							if( bearPower <= 0.065746 )
								ret := 0.216819
							if( bearPower > 0.065746 )
								ret := 0.034221
						if( Typical_Price > 390.975 )
							ret := -0.916667 // sell
				if( Negative_Money_Flow > 157856 )
					if( Positive_Money_Flow_Sum <= 9.82403e+07 )
						if( bullPower <= -0.26192 )
							if( Money_Flow_Ratio <= 2.39201 )
								ret := 0.099458
							if( Money_Flow_Ratio > 2.39201 )
								ret := 0.551724
						if( bullPower > -0.26192 )
							if( Typical_Price <= 200.144 )
								ret := 1.000000 // buy
							if( Typical_Price > 200.144 )
								ret := 0.038866
					if( Positive_Money_Flow_Sum > 9.82403e+07 )
						if( Negative_Money_Flow_Sum <= 4.37663e+08 )
							if( Typical_Price <= 274.246 )
								ret := 0.079566
							if( Typical_Price > 274.246 )
								ret := 0.351695
						if( Negative_Money_Flow_Sum > 4.37663e+08 )
							if( Positive_Money_Flow <= 3.33969e+07 )
								ret := -0.608108
							if( Positive_Money_Flow > 3.33969e+07 )
								ret := 0.400000
		if( bearPower > 0.508754 )
			if( bbm <= 0.19723 )
				if( Positive_Money_Flow_Sum <= 4.01698e+06 )
					if( Positive_Money_Flow <= 181833 )
						if( Positive_Money_Flow_Sum <= 3.40609e+06 )
							if( bullPower <= 0.713179 )
								ret := -0.213836
							if( bullPower > 0.713179 )
								ret := -0.446154
						if( Positive_Money_Flow_Sum > 3.40609e+06 )
							if( Money_Flow_Ratio <= 2.13451 )
								ret := -0.750000 // sell
							if( Money_Flow_Ratio > 2.13451 )
								ret := 0.523810
					if( Positive_Money_Flow > 181833 )
						if( Typical_Price <= 261.203 )
							if( Positive_Money_Flow_Sum <= 3.27966e+06 )
								ret := -0.607843
							if( Positive_Money_Flow_Sum > 3.27966e+06 )
								ret := 0.500000
						if( Typical_Price > 261.203 )
							if( bullPower <= 0.758033 )
								ret := -0.176471
							if( bullPower > 0.758033 )
								ret := 0.545455
				if( Positive_Money_Flow_Sum > 4.01698e+06 )
					if( bearPower <= 0.816149 )
						if( Negative_Money_Flow_Sum <= 6.8012e+07 )
							if( Raw_Money_Flow <= 37797.5 )
								ret := 0.571429
							if( Raw_Money_Flow > 37797.5 )
								ret := -0.382143
						if( Negative_Money_Flow_Sum > 6.8012e+07 )
							if( Negative_Money_Flow_Sum <= 8.96972e+07 )
								ret := 0.900000 // buy
							if( Negative_Money_Flow_Sum > 8.96972e+07 )
								ret := 0.000000
					if( bearPower > 0.816149 )
						if( Raw_Money_Flow <= 88441.7 )
							if( Positive_Money_Flow_Sum <= 3.64545e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 3.64545e+07 )
								ret := -0.772727 // sell
						if( Raw_Money_Flow > 88441.7 )
							if( bbm <= 0.169464 )
								ret := -0.794118 // sell
							if( bbm > 0.169464 )
								ret := -0.272727
			if( bbm > 0.19723 )
				if( Negative_Money_Flow_Sum <= 3.88955e+07 )
					if( Money_Flow_Ratio <= 0.652722 )
						if( Positive_Money_Flow <= 2.6458e+06 )
							if( bbm <= 0.50625 )
								ret := 0.400000
							if( bbm > 0.50625 )
								ret := 0.968750 // buy
						if( Positive_Money_Flow > 2.6458e+06 )
							ret := -0.285714
					if( Money_Flow_Ratio > 0.652722 )
						if( Typical_Price <= 276.254 )
							if( bullPower <= 5.33683 )
								ret := -0.250689
							if( bullPower > 5.33683 )
								ret := 1.000000 // buy
						if( Typical_Price > 276.254 )
							if( Typical_Price <= 386.166 )
								ret := 0.000535
							if( Typical_Price > 386.166 )
								ret := -0.469027
				if( Negative_Money_Flow_Sum > 3.88955e+07 )
					if( Raw_Money_Flow <= 3.39187e+07 )
						if( Positive_Money_Flow_Sum <= 1.83562e+08 )
							if( Negative_Money_Flow_Sum <= 1.60096e+08 )
								ret := 0.158621
							if( Negative_Money_Flow_Sum > 1.60096e+08 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.83562e+08 )
							if( Positive_Money_Flow_Sum <= 3.72791e+08 )
								ret := 0.597990
							if( Positive_Money_Flow_Sum > 3.72791e+08 )
								ret := -0.750000 // sell
					if( Raw_Money_Flow > 3.39187e+07 )
						if( bbm <= 3.71646 )
							if( Negative_Money_Flow_Sum <= 3.32921e+08 )
								ret := -0.508929
							if( Negative_Money_Flow_Sum > 3.32921e+08 )
								ret := 0.400000
						if( bbm > 3.71646 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_CRWD_1Min_a5e0e86e(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


