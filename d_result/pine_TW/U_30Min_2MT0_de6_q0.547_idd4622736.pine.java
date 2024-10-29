//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: U_30Min_2MT0_d4622736 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_30Min_2MT0_d4622736", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_30Min_d4622736(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 3.77137e+06 )
		if( tema <= 16.1973 )
			if( Raw_Money_Flow <= 411281 )
				if( Positive_Money_Flow_Sum <= 841851 )
					if( ema13 <= -0.052505 )
						if( Raw_Money_Flow <= 15882 )
							ret := 0.000000
						if( Raw_Money_Flow > 15882 )
							ret := 1.000000 // buy
					if( ema13 > -0.052505 )
						if( ema3 <= 15.4955 )
							ret := 0.875000 // buy
						if( ema3 > 15.4955 )
							ret := 0.153846
				if( Positive_Money_Flow_Sum > 841851 )
					if( Positive_Money_Flow_Sum <= 858775 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 858775 )
						if( Positive_Money_Flow_Sum <= 868386 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 868386 )
							ret := -0.138889
			if( Raw_Money_Flow > 411281 )
				if( ema3 <= 16.2245 )
					ret := 1.000000 // buy
				if( ema3 > 16.2245 )
					ret := 0.000000
		if( tema > 16.1973 )
			if( Positive_Money_Flow_Sum <= 1.82519e+06 )
				if( ema12 <= -0.603084 )
					if( Negative_Money_Flow_Sum <= 974518 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 974518 )
						if( MFI <= 16.4267 )
							ret := 0.000000
						if( MFI > 16.4267 )
							ret := 0.962264 // buy
				if( ema12 > -0.603084 )
					if( Typical_Price <= 71.0042 )
						if( Positive_Money_Flow_Sum <= 1.11589e+06 )
							ret := -0.196940
						if( Positive_Money_Flow_Sum > 1.11589e+06 )
							ret := -0.371532
					if( Typical_Price > 71.0042 )
						if( Positive_Money_Flow_Sum <= 1.60129e+06 )
							ret := 0.065574
						if( Positive_Money_Flow_Sum > 1.60129e+06 )
							ret := -0.829268 // sell
			if( Positive_Money_Flow_Sum > 1.82519e+06 )
				if( ema3 <= 39.4999 )
					if( MFI_Low <= 65.4644 )
						if( Negative_Money_Flow <= 1.91574e+06 )
							ret := 0.257186
						if( Negative_Money_Flow > 1.91574e+06 )
							ret := -0.740741 // sell
					if( MFI_Low > 65.4644 )
						if( ema3 <= 36.8249 )
							ret := -0.066246
						if( ema3 > 36.8249 )
							ret := 0.366279
				if( ema3 > 39.4999 )
					if( MFI_Low <= 78.385 )
						if( ema13 <= -0.582724 )
							ret := 0.118421
						if( ema13 > -0.582724 )
							ret := -0.256006
					if( MFI_Low > 78.385 )
						if( Positive_Money_Flow_Sum <= 9.22051e+07 )
							ret := 0.448529
						if( Positive_Money_Flow_Sum > 9.22051e+07 )
							ret := -0.112403
	if( Negative_Money_Flow_Sum > 3.77137e+06 )
		if( Negative_Money_Flow <= 4618.24 )
			if( Negative_Money_Flow_Sum <= 2.88991e+07 )
				if( ema12 <= -0.41687 )
					if( ema1 <= 119.732 )
						if( ema12 <= -1.77723 )
							ret := -1.000000 // sell
						if( ema12 > -1.77723 )
							ret := 0.884615 // buy
					if( ema1 > 119.732 )
						if( Negative_Money_Flow_Sum <= 1.14478e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.14478e+07 )
							ret := 0.631579
				if( ema12 > -0.41687 )
					if( ema12 <= 0.404544 )
						if( Positive_Money_Flow_Sum <= 6.06963e+07 )
							ret := 0.066030
						if( Positive_Money_Flow_Sum > 6.06963e+07 )
							ret := -0.170442
					if( ema12 > 0.404544 )
						if( Negative_Money_Flow_Sum <= 5.21492e+06 )
							ret := -0.266667
						if( Negative_Money_Flow_Sum > 5.21492e+06 )
							ret := 0.284047
			if( Negative_Money_Flow_Sum > 2.88991e+07 )
				if( MFI <= 75.3513 )
					if( ema13 <= 0.011041 )
						if( MFI_High <= -50.7936 )
							ret := 0.003901
						if( MFI_High > -50.7936 )
							ret := -0.122548
					if( ema13 > 0.011041 )
						if( Negative_Money_Flow_Sum <= 3.3913e+07 )
							ret := -0.310185
						if( Negative_Money_Flow_Sum > 3.3913e+07 )
							ret := 0.041591
				if( MFI > 75.3513 )
					if( MFI_Low <= 70.341 )
						if( MFI_High <= 3.83251 )
							ret := -0.280868
						if( MFI_High > 3.83251 )
							ret := 0.008596
					if( MFI_Low > 70.341 )
						if( Positive_Money_Flow_Sum <= 8.14056e+08 )
							ret := -0.687500
						if( Positive_Money_Flow_Sum > 8.14056e+08 )
							ret := 0.777778 // buy
		if( Negative_Money_Flow > 4618.24 )
			if( Raw_Money_Flow <= 2.25054e+06 )
				if( ema12 <= -0.245769 )
					if( Negative_Money_Flow_Sum <= 2.71765e+08 )
						if( MFI_High <= -19.494 )
							ret := 0.248854
						if( MFI_High > -19.494 )
							ret := 0.626923
					if( Negative_Money_Flow_Sum > 2.71765e+08 )
						if( MFI_High <= -69.7506 )
							ret := -0.750000 // sell
						if( MFI_High > -69.7506 )
							ret := -0.014493
				if( ema12 > -0.245769 )
					if( MFI_Low <= -19.1437 )
						if( tema <= 40.5841 )
							ret := 0.177419
						if( tema > 40.5841 )
							ret := -0.781818 // sell
					if( MFI_Low > -19.1437 )
						if( ema13 <= -0.09577 )
							ret := 0.033054
						if( ema13 > -0.09577 )
							ret := 0.142141
			if( Raw_Money_Flow > 2.25054e+06 )
				if( ema12 <= 0.796238 )
					if( tema <= 41.1777 )
						if( ema3 <= 41.0839 )
							ret := 0.029436
						if( ema3 > 41.0839 )
							ret := 0.537815
					if( tema > 41.1777 )
						if( ema12 <= -0.614339 )
							ret := 0.044909
						if( ema12 > -0.614339 )
							ret := -0.148909
				if( ema12 > 0.796238 )
					if( Raw_Money_Flow <= 6.4479e+07 )
						if( Negative_Money_Flow_Sum <= 1.72044e+08 )
							ret := 0.230539
						if( Negative_Money_Flow_Sum > 1.72044e+08 )
							ret := 0.688679
					if( Raw_Money_Flow > 6.4479e+07 )
						if( Typical_Price <= 175.613 )
							ret := -0.506329
						if( Typical_Price > 175.613 )
							ret := 0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_U_30Min_d4622736(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


