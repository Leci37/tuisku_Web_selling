//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: PTON_5Min_2BM0_9d90e8d9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_5Min_2BM0_9d90e8d9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_5Min_9d90e8d9(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= -0.003135 )
		if( Raw_Money_Flow <= 62047.7 )
			if( Typical_Price <= 4.42286 )
				if( Negative_Money_Flow <= 0.138643 )
					if( MFI <= 2.8172 )
						ret := -0.625000
					if( MFI > 2.8172 )
						if( Positive_Money_Flow_Sum <= 33782.6 )
							ret := 0.506579
						if( Positive_Money_Flow_Sum > 33782.6 )
							ret := 0.162095
				if( Negative_Money_Flow > 0.138643 )
					if( bbm <= 0.018812 )
						if( bearPower <= -0.021234 )
							ret := 0.692171
						if( bearPower > -0.021234 )
							ret := 0.473404
					if( bbm > 0.018812 )
						if( Positive_Money_Flow_Sum <= 74211.9 )
							ret := 0.710692 // buy
						if( Positive_Money_Flow_Sum > 74211.9 )
							ret := -0.158940
			if( Typical_Price > 4.42286 )
				if( bbp <= -0.037034 )
					if( Positive_Money_Flow_Sum <= 51421.5 )
						if( MFI <= 8.18072 )
							ret := 0.019231
						if( MFI > 8.18072 )
							ret := 0.509217
					if( Positive_Money_Flow_Sum > 51421.5 )
						if( MFI_High <= -3.06684 )
							ret := 0.248139
						if( MFI_High > -3.06684 )
							ret := 0.661871
				if( bbp > -0.037034 )
					if( Raw_Money_Flow <= 41096 )
						if( bbm <= 0.000118 )
							ret := 0.112303
						if( bbm > 0.000118 )
							ret := 0.323296
					if( Raw_Money_Flow > 41096 )
						if( Positive_Money_Flow_Sum <= 46167 )
							ret := 0.666667
						if( Positive_Money_Flow_Sum > 46167 )
							ret := -0.397590
		if( Raw_Money_Flow > 62047.7 )
			if( Negative_Money_Flow_Sum <= 7.82225e+06 )
				if( bbm <= 0.019554 )
					if( Positive_Money_Flow_Sum <= 2.05998e+06 )
						if( Negative_Money_Flow <= 603107 )
							ret := 0.000578
						if( Negative_Money_Flow > 603107 )
							ret := 0.520000
					if( Positive_Money_Flow_Sum > 2.05998e+06 )
						if( Raw_Money_Flow <= 311655 )
							ret := 0.393471
						if( Raw_Money_Flow > 311655 )
							ret := 0.007519
				if( bbm > 0.019554 )
					if( MFI_Low <= 53.8748 )
						if( bbm <= 0.302711 )
							ret := -0.095181
						if( bbm > 0.302711 )
							ret := 1.000000 // buy
					if( MFI_Low > 53.8748 )
						if( MFI_High <= -1.8858 )
							ret := 1.000000 // buy
						if( MFI_High > -1.8858 )
							ret := 0.700000 // buy
			if( Negative_Money_Flow_Sum > 7.82225e+06 )
				if( bbp <= -0.117881 )
					if( bullPower <= -0.162974 )
						if( Positive_Money_Flow_Sum <= 998935 )
							ret := 0.500000
						if( Positive_Money_Flow_Sum > 998935 )
							ret := -0.634615
					if( bullPower > -0.162974 )
						if( bbm <= 0.08321 )
							ret := -0.011646
						if( bbm > 0.08321 )
							ret := 0.357430
				if( bbp > -0.117881 )
					if( Typical_Price <= 4.26972 )
						if( Positive_Money_Flow <= 1.59488e+06 )
							ret := 0.640483
						if( Positive_Money_Flow > 1.59488e+06 )
							ret := 0.048780
					if( Typical_Price > 4.26972 )
						if( Positive_Money_Flow <= 672632 )
							ret := 0.257891
						if( Positive_Money_Flow > 672632 )
							ret := -0.165192
	if( bullPower > -0.003135 )
		if( Positive_Money_Flow_Sum <= 1.28528e+06 )
			if( bbp <= 0.015853 )
				if( Negative_Money_Flow <= 842.228 )
					if( Typical_Price <= 4.50573 )
						if( bbm <= 0.030135 )
							ret := -0.159312
						if( bbm > 0.030135 )
							ret := -0.452055
					if( Typical_Price > 4.50573 )
						if( MFI_Low <= 55.6811 )
							ret := -0.083283
						if( MFI_Low > 55.6811 )
							ret := 0.226415
				if( Negative_Money_Flow > 842.228 )
					if( Raw_Money_Flow <= 99333.4 )
						if( bbp <= -0.01291 )
							ret := 0.361111
						if( bbp > -0.01291 )
							ret := 0.108945
					if( Raw_Money_Flow > 99333.4 )
						if( Money_Flow_Ratio <= 1.9724 )
							ret := -0.210914
						if( Money_Flow_Ratio > 1.9724 )
							ret := 0.933333 // buy
			if( bbp > 0.015853 )
				if( Positive_Money_Flow <= 39.7274 )
					if( bbp <= 0.058355 )
						if( Negative_Money_Flow_Sum <= 12652.2 )
							ret := 0.293578
						if( Negative_Money_Flow_Sum > 12652.2 )
							ret := -0.062844
					if( bbp > 0.058355 )
						if( Positive_Money_Flow_Sum <= 70021.6 )
							ret := -0.082192
						if( Positive_Money_Flow_Sum > 70021.6 )
							ret := -0.481061
				if( Positive_Money_Flow > 39.7274 )
					if( Positive_Money_Flow <= 17317.3 )
						if( bearPower <= 0.025983 )
							ret := -0.381455
						if( bearPower > 0.025983 )
							ret := -0.589491
					if( Positive_Money_Flow > 17317.3 )
						if( bbp <= 0.165606 )
							ret := -0.131458
						if( bbp > 0.165606 )
							ret := -0.747475 // sell
		if( Positive_Money_Flow_Sum > 1.28528e+06 )
			if( Negative_Money_Flow <= 14.5925 )
				if( bbm <= 0.009996 )
					if( bullPower <= 0.027889 )
						if( bbm <= 0.009927 )
							ret := -0.111321
						if( bbm > 0.009927 )
							ret := -0.875000 // sell
					if( bullPower > 0.027889 )
						if( Positive_Money_Flow_Sum <= 5.08717e+06 )
							ret := -0.930556 // sell
						if( Positive_Money_Flow_Sum > 5.08717e+06 )
							ret := -0.344444
				if( bbm > 0.009996 )
					if( Money_Flow_Ratio <= 124.429 )
						if( Negative_Money_Flow_Sum <= 700562 )
							ret := 0.163989
						if( Negative_Money_Flow_Sum > 700562 )
							ret := -0.027500
					if( Money_Flow_Ratio > 124.429 )
						if( bullPower <= 0.172583 )
							ret := -0.200000
						if( bullPower > 0.172583 )
							ret := -0.700000 // sell
			if( Negative_Money_Flow > 14.5925 )
				if( Negative_Money_Flow_Sum <= 5.7308e+07 )
					if( Positive_Money_Flow_Sum <= 4.6246e+07 )
						if( Money_Flow_Ratio <= 1.44356 )
							ret := 0.017986
						if( Money_Flow_Ratio > 1.44356 )
							ret := 0.117159
					if( Positive_Money_Flow_Sum > 4.6246e+07 )
						if( Positive_Money_Flow_Sum <= 8.3796e+07 )
							ret := 0.948980 // buy
						if( Positive_Money_Flow_Sum > 8.3796e+07 )
							ret := -0.242424
				if( Negative_Money_Flow_Sum > 5.7308e+07 )
					if( Raw_Money_Flow <= 2.29863e+06 )
						ret := 0.200000
					if( Raw_Money_Flow > 2.29863e+06 )
						if( MFI <= 43.2776 )
							ret := -0.500000
						if( MFI > 43.2776 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_PTON_5Min_9d90e8d9(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


