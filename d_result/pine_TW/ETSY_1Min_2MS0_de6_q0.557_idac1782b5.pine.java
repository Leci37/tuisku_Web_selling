//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ETSY_1Min_2MS0_ac1782b5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_1Min_2MS0_ac1782b5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_1Min_ac1782b5(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 40.5162 )
		if( Positive_Money_Flow_Sum <= 6.62874e+06 )
			if( Negative_Money_Flow_Sum <= 1.45262e+07 )
				if( Positive_Money_Flow_Sum <= 73190.1 )
					if( Positive_Money_Flow_Sum <= 32370.4 )
						ret := 0.500000
					if( Positive_Money_Flow_Sum > 32370.4 )
						if( rsi1 <= 19.1323 )
							ret := 0.153846
						if( rsi1 > 19.1323 )
							ret := -0.900000 // sell
				if( Positive_Money_Flow_Sum > 73190.1 )
					if( Negative_Money_Flow_Sum <= 499992 )
						if( Positive_Money_Flow_Sum <= 619552 )
							ret := 0.752475 // buy
						if( Positive_Money_Flow_Sum > 619552 )
							ret := -0.700000 // sell
					if( Negative_Money_Flow_Sum > 499992 )
						if( Positive_Money_Flow_Sum <= 708385 )
							ret := -0.077257
						if( Positive_Money_Flow_Sum > 708385 )
							ret := 0.044280
			if( Negative_Money_Flow_Sum > 1.45262e+07 )
				if( Negative_Money_Flow <= 169115 )
					if( Negative_Money_Flow_Sum <= 4.72928e+07 )
						if( MFI_High <= -61.2504 )
							ret := 0.508197
						if( MFI_High > -61.2504 )
							ret := -0.614035
					if( Negative_Money_Flow_Sum > 4.72928e+07 )
						if( Typical_Price <= 59.0054 )
							ret := 0.521739
						if( Typical_Price > 59.0054 )
							ret := -0.983333 // sell
				if( Negative_Money_Flow > 169115 )
					if( Positive_Money_Flow_Sum <= 5.45692e+06 )
						if( Negative_Money_Flow_Sum <= 5.32903e+07 )
							ret := 0.839744 // buy
						if( Negative_Money_Flow_Sum > 5.32903e+07 )
							ret := 0.285714
					if( Positive_Money_Flow_Sum > 5.45692e+06 )
						if( Typical_Price <= 59.904 )
							ret := 0.857143 // buy
						if( Typical_Price > 59.904 )
							ret := -0.631579
		if( Positive_Money_Flow_Sum > 6.62874e+06 )
			if( Raw_Money_Flow <= 2.31304e+06 )
				if( d_k <= -0.020108 )
					if( Typical_Price <= 56.1435 )
						if( Positive_Money_Flow_Sum <= 2.43962e+07 )
							ret := -0.573770
						if( Positive_Money_Flow_Sum > 2.43962e+07 )
							ret := 0.550000
					if( Typical_Price > 56.1435 )
						if( MFI_High <= -33.1821 )
							ret := 0.744526 // buy
						if( MFI_High > -33.1821 )
							ret := 0.333333
				if( d_k > -0.020108 )
					if( Raw_Money_Flow <= 15756.8 )
						if( Typical_Price <= 53.955 )
							ret := 0.666667
						if( Typical_Price > 53.955 )
							ret := 0.980952 // buy
					if( Raw_Money_Flow > 15756.8 )
						if( d_k <= 23.1907 )
							ret := 0.694789
						if( d_k > 23.1907 )
							ret := -0.095238
			if( Raw_Money_Flow > 2.31304e+06 )
				if( Positive_Money_Flow_Sum <= 3.19271e+07 )
					if( MFI_Low <= 23.8507 )
						if( Negative_Money_Flow_Sum <= 4.65862e+07 )
							ret := 0.309677
						if( Negative_Money_Flow_Sum > 4.65862e+07 )
							ret := -0.666667
					if( MFI_Low > 23.8507 )
						if( Typical_Price <= 57.877 )
							ret := 0.206897
						if( Typical_Price > 57.877 )
							ret := -0.750000 // sell
				if( Positive_Money_Flow_Sum > 3.19271e+07 )
					ret := 1.000000 // buy
	if( rsi1 > 40.5162 )
		if( Negative_Money_Flow_Sum <= 79632.6 )
			if( Positive_Money_Flow_Sum <= 600442 )
				if( MFI_High <= -7.69144 )
					if( rsi1 <= 55.3292 )
						ret := 0.583333
					if( rsi1 > 55.3292 )
						ret := -1.000000 // sell
				if( MFI_High > -7.69144 )
					if( Positive_Money_Flow <= 35301.5 )
						if( Raw_Money_Flow <= 15842.8 )
							ret := 0.829787 // buy
						if( Raw_Money_Flow > 15842.8 )
							ret := 0.990291 // buy
					if( Positive_Money_Flow > 35301.5 )
						if( d_k <= -0.085334 )
							ret := -0.111111
						if( d_k > -0.085334 )
							ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 600442 )
				if( d <= 73.8116 )
					ret := -0.777778 // sell
				if( d > 73.8116 )
					if( Money_Flow_Ratio <= 79.5898 )
						ret := 0.583333
					if( Money_Flow_Ratio > 79.5898 )
						ret := -0.166667
		if( Negative_Money_Flow_Sum > 79632.6 )
			if( Negative_Money_Flow_Sum <= 5.52916e+06 )
				if( Negative_Money_Flow_Sum <= 4.04593e+06 )
					if( Money_Flow_Ratio <= 18.685 )
						if( Raw_Money_Flow <= 214823 )
							ret := -0.051993
						if( Raw_Money_Flow > 214823 )
							ret := 0.001956
					if( Money_Flow_Ratio > 18.685 )
						if( Positive_Money_Flow_Sum <= 6.3303e+06 )
							ret := -0.662162
						if( Positive_Money_Flow_Sum > 6.3303e+06 )
							ret := -0.071130
				if( Negative_Money_Flow_Sum > 4.04593e+06 )
					if( Positive_Money_Flow <= 1.71572e+06 )
						if( rsi1 <= 69.6511 )
							ret := 0.129602
						if( rsi1 > 69.6511 )
							ret := -0.437500
					if( Positive_Money_Flow > 1.71572e+06 )
						if( Positive_Money_Flow_Sum <= 3.05612e+07 )
							ret := 0.604938
						if( Positive_Money_Flow_Sum > 3.05612e+07 )
							ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 5.52916e+06 )
				if( Typical_Price <= 52.4435 )
					if( Positive_Money_Flow_Sum <= 8.84100e+06 )
						if( Positive_Money_Flow_Sum <= 5.11626e+06 )
							ret := 0.322222
						if( Positive_Money_Flow_Sum > 5.11626e+06 )
							ret := -0.424242
					if( Positive_Money_Flow_Sum > 8.84100e+06 )
						if( d_k <= -13.5111 )
							ret := -0.333333
						if( d_k > -13.5111 )
							ret := 0.761538 // buy
				if( Typical_Price > 52.4435 )
					if( Raw_Money_Flow <= 1.01318e+06 )
						if( rsi1 <= 50.0363 )
							ret := -0.058030
						if( rsi1 > 50.0363 )
							ret := -0.371264
					if( Raw_Money_Flow > 1.01318e+06 )
						if( Typical_Price <= 64.5076 )
							ret := 0.040488
						if( Typical_Price > 64.5076 )
							ret := -0.321678
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_ETSY_1Min_ac1782b5(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


