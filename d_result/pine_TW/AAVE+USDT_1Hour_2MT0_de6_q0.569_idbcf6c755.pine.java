//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AAVEUSDT_1Hour_2MT0_bcf6c755 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_1Hour_2MT0_bcf6c755", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_1Hour_bcf6c755(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema13 <= -13.5083 )
		if( MFI_Low <= 12.0002 )
			if( Negative_Money_Flow <= 1.27243e+06 )
				if( Positive_Money_Flow_Sum <= 1.50614e+07 )
					if( Negative_Money_Flow_Sum <= 2.90674e+07 )
						if( ema1 <= 319.651 )
							ret := 0.800000 // buy
						if( ema1 > 319.651 )
							ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.90674e+07 )
						if( MFI_High <= -67.0319 )
							ret := 0.833333 // buy
						if( MFI_High > -67.0319 )
							ret := -0.702703 // sell
				if( Positive_Money_Flow_Sum > 1.50614e+07 )
					if( ema2 <= 401.797 )
						if( Positive_Money_Flow_Sum <= 3.85932e+07 )
							ret := 0.859375 // buy
						if( Positive_Money_Flow_Sum > 3.85932e+07 )
							ret := -0.333333
					if( ema2 > 401.797 )
						if( Positive_Money_Flow <= 5.51519e+06 )
							ret := 0.333333
						if( Positive_Money_Flow > 5.51519e+06 )
							ret := -1.000000 // sell
			if( Negative_Money_Flow > 1.27243e+06 )
				if( ema13 <= -22.4465 )
					if( MFI_High <= -54.9589 )
						if( Raw_Money_Flow <= 6.98558e+06 )
							ret := -0.222222
						if( Raw_Money_Flow > 6.98558e+06 )
							ret := 0.635135
					if( MFI_High > -54.9589 )
						ret := -1.000000 // sell
				if( ema13 > -22.4465 )
					if( ema12 <= -7.70851 )
						if( tema <= 157.266 )
							ret := -0.250000
						if( tema > 157.266 )
							ret := 0.777372 // buy
					if( ema12 > -7.70851 )
						if( Negative_Money_Flow_Sum <= 2.53124e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.53124e+07 )
							ret := 0.103448
		if( MFI_Low > 12.0002 )
			if( Typical_Price <= 470.725 )
				if( Negative_Money_Flow_Sum <= 7.24106e+07 )
					if( Negative_Money_Flow_Sum <= 5.56151e+07 )
						if( Positive_Money_Flow_Sum <= 2.5252e+07 )
							ret := -0.425926
						if( Positive_Money_Flow_Sum > 2.5252e+07 )
							ret := 0.647059
					if( Negative_Money_Flow_Sum > 5.56151e+07 )
						if( MFI_High <= -46.8953 )
							ret := 0.333333
						if( MFI_High > -46.8953 )
							ret := -0.888889 // sell
				if( Negative_Money_Flow_Sum > 7.24106e+07 )
					if( ema13 <= -13.8395 )
						if( ema13 <= -66.1768 )
							ret := 0.600000
						if( ema13 > -66.1768 )
							ret := 0.955224 // buy
					if( ema13 > -13.8395 )
						ret := -1.000000 // sell
			if( Typical_Price > 470.725 )
				if( ema3 <= 625.07 )
					if( Positive_Money_Flow_Sum <= 1.62949e+08 )
						if( Positive_Money_Flow <= 3.10157e+07 )
							ret := -0.578947
						if( Positive_Money_Flow > 3.10157e+07 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.62949e+08 )
						ret := -1.000000 // sell
				if( ema3 > 625.07 )
					ret := 1.000000 // buy
	if( ema13 > -13.5083 )
		if( ema3 <= 406.35 )
			if( Positive_Money_Flow_Sum <= 681786 )
				if( Positive_Money_Flow_Sum <= 456861 )
					if( Raw_Money_Flow <= 57027.4 )
						if( Positive_Money_Flow_Sum <= 203424 )
							ret := 0.139241
						if( Positive_Money_Flow_Sum > 203424 )
							ret := -0.233161
					if( Raw_Money_Flow > 57027.4 )
						if( ema3 <= 62.7261 )
							ret := 0.234783
						if( ema3 > 62.7261 )
							ret := -0.056848
				if( Positive_Money_Flow_Sum > 456861 )
					if( Typical_Price <= 48.3082 )
						if( Negative_Money_Flow <= 223663 )
							ret := -0.615385
						if( Negative_Money_Flow > 223663 )
							ret := 0.300000
					if( Typical_Price > 48.3082 )
						if( Positive_Money_Flow <= 149891 )
							ret := -0.232323
						if( Positive_Money_Flow > 149891 )
							ret := 0.183673
			if( Positive_Money_Flow_Sum > 681786 )
				if( Typical_Price <= 81.6905 )
					if( ema12 <= 2.55058 )
						if( Negative_Money_Flow <= 602042 )
							ret := 0.060312
						if( Negative_Money_Flow > 602042 )
							ret := 0.213907
					if( ema12 > 2.55058 )
						if( ema12 <= 4.30721 )
							ret := -0.923077 // sell
						if( ema12 > 4.30721 )
							ret := 0.600000
				if( Typical_Price > 81.6905 )
					if( Positive_Money_Flow_Sum <= 1.75705e+08 )
						if( Negative_Money_Flow_Sum <= 4.79606e+07 )
							ret := -0.004934
						if( Negative_Money_Flow_Sum > 4.79606e+07 )
							ret := 0.386454
					if( Positive_Money_Flow_Sum > 1.75705e+08 )
						if( Money_Flow_Ratio <= 2.7754 )
							ret := -0.857143 // sell
						if( Money_Flow_Ratio > 2.7754 )
							ret := -1.000000 // sell
		if( ema3 > 406.35 )
			if( Typical_Price <= 398.487 )
				if( Positive_Money_Flow_Sum <= 4.10457e+07 )
					if( Negative_Money_Flow_Sum <= 2.42086e+07 )
						if( Negative_Money_Flow <= 3.06973e+06 )
							ret := -0.636364
						if( Negative_Money_Flow > 3.06973e+06 )
							ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.42086e+07 )
						ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 4.10457e+07 )
					ret := 0.000000
			if( Typical_Price > 398.487 )
				if( Negative_Money_Flow <= 1.20036e+07 )
					if( Money_Flow_Ratio <= 1.17963 )
						if( ema12 <= -2.234 )
							ret := -0.327273
						if( ema12 > -2.234 )
							ret := 0.032922
					if( Money_Flow_Ratio > 1.17963 )
						if( Positive_Money_Flow_Sum <= 3.87223e+07 )
							ret := -0.622642
						if( Positive_Money_Flow_Sum > 3.87223e+07 )
							ret := -0.311628
				if( Negative_Money_Flow > 1.20036e+07 )
					if( ema12 <= -5.05882 )
						ret := -0.692308
					if( ema12 > -5.05882 )
						if( ema12 <= 12.4391 )
							ret := 0.769231 // buy
						if( ema12 > 12.4391 )
							ret := -0.235294
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_AAVEUSDT_1Hour_bcf6c755(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


