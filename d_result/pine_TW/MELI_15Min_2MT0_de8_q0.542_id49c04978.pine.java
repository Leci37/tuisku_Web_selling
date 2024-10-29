//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: MELI_15Min_2MT0_49c04978 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2MT0_49c04978", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_49c04978(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 8.02609e+08 )
		if( Negative_Money_Flow_Sum <= 1.78069e+07 )
			if( Positive_Money_Flow <= 1.15565e+08 )
				if( Negative_Money_Flow_Sum <= 4.85751e+06 )
					if( Raw_Money_Flow <= 7.6484e+06 )
						if( ema13 <= 3.00887 )
							if( tema <= 556.802 )
								if( Positive_Money_Flow <= 1.79473e+06 )
									ret := 0.116883
								if( Positive_Money_Flow > 1.79473e+06 )
									ret := 0.509091
							if( tema > 556.802 )
								ret := -0.600000
						if( ema13 > 3.00887 )
							if( ema12 <= 7.61242 )
								if( MFI <= 39.0667 )
									ret := 0.500000
								if( MFI > 39.0667 )
									ret := 0.960526 // buy
							if( ema12 > 7.61242 )
								if( MFI_Low <= 79.4515 )
									ret := -0.166667
								if( MFI_Low > 79.4515 )
									ret := 0.750000 // buy
					if( Raw_Money_Flow > 7.6484e+06 )
						if( Positive_Money_Flow <= 2.14148e+07 )
							if( ema13 <= 1.00714 )
								ret := 0.500000
							if( ema13 > 1.00714 )
								if( ema1 <= 479.343 )
									ret := -0.727273 // sell
								if( ema1 > 479.343 )
									ret := 0.000000
						if( Positive_Money_Flow > 2.14148e+07 )
							if( Money_Flow_Ratio <= 306.372 )
								if( ema3 <= 542.432 )
									ret := 0.600000
								if( ema3 > 542.432 )
									ret := 0.962963 // buy
							if( Money_Flow_Ratio > 306.372 )
								if( ema1 <= 625.25 )
									ret := 0.500000
								if( ema1 > 625.25 )
									ret := -0.636364
				if( Negative_Money_Flow_Sum > 4.85751e+06 )
					if( Money_Flow_Ratio <= 32.0131 )
						if( ema13 <= -2.40644 )
							if( Typical_Price <= 1254.4 )
								if( Negative_Money_Flow <= 1.41016e+06 )
									ret := 0.893617 // buy
								if( Negative_Money_Flow > 1.41016e+06 )
									ret := 0.000000
							if( Typical_Price > 1254.4 )
								ret := -0.142857
						if( ema13 > -2.40644 )
							if( MFI_High <= 16.5102 )
								if( Raw_Money_Flow <= 124284 )
									ret := 0.593750
								if( Raw_Money_Flow > 124284 )
									ret := 0.098957
							if( MFI_High > 16.5102 )
								if( Negative_Money_Flow_Sum <= 9.5111e+06 )
									ret := -0.863636 // sell
								if( Negative_Money_Flow_Sum > 9.5111e+06 )
									ret := 0.000000
					if( Money_Flow_Ratio > 32.0131 )
						if( Raw_Money_Flow <= 7.9936e+06 )
							if( MFI_Low <= 78.9084 )
								if( Negative_Money_Flow_Sum <= 5.6964e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 5.6964e+06 )
									ret := 1.000000 // buy
							if( MFI_Low > 78.9084 )
								ret := 0.500000
						if( Raw_Money_Flow > 7.9936e+06 )
							if( Positive_Money_Flow <= 1.77932e+07 )
								if( Typical_Price <= 1318.15 )
									ret := -1.000000 // sell
								if( Typical_Price > 1318.15 )
									ret := -0.125000
							if( Positive_Money_Flow > 1.77932e+07 )
								if( MFI <= 96.7651 )
									ret := 1.000000 // buy
								if( MFI > 96.7651 )
									ret := 0.285714
			if( Positive_Money_Flow > 1.15565e+08 )
				if( Money_Flow_Ratio <= 59.4021 )
					if( ema2 <= 1008.19 )
						ret := -0.750000 // sell
					if( ema2 > 1008.19 )
						ret := 0.250000
				if( Money_Flow_Ratio > 59.4021 )
					if( MFI_High <= 18.933 )
						ret := -1.000000 // sell
					if( MFI_High > 18.933 )
						if( ema3 <= 1022.63 )
							ret := -1.000000 // sell
						if( ema3 > 1022.63 )
							if( Typical_Price <= 1664.4 )
								ret := 0.000000
							if( Typical_Price > 1664.4 )
								ret := -0.800000 // sell
		if( Negative_Money_Flow_Sum > 1.78069e+07 )
			if( Positive_Money_Flow_Sum <= 2.22007e+08 )
				if( ema13 <= -12.5036 )
					if( Negative_Money_Flow_Sum <= 4.75964e+08 )
						if( tema <= 616.737 )
							if( ema13 <= -14.8628 )
								if( ema12 <= -9.21082 )
									ret := 0.818182 // buy
								if( ema12 > -9.21082 )
									ret := 0.125000
							if( ema13 > -14.8628 )
								if( Negative_Money_Flow <= 6.13475e+06 )
									ret := 0.313725
								if( Negative_Money_Flow > 6.13475e+06 )
									ret := -0.387755
						if( tema > 616.737 )
							if( Money_Flow_Ratio <= 0.089867 )
								if( Money_Flow_Ratio <= 0.022984 )
									ret := 0.648649
								if( Money_Flow_Ratio > 0.022984 )
									ret := 0.114286
							if( Money_Flow_Ratio > 0.089867 )
								if( Negative_Money_Flow_Sum <= 4.12565e+08 )
									ret := -0.075846
								if( Negative_Money_Flow_Sum > 4.12565e+08 )
									ret := -0.406375
					if( Negative_Money_Flow_Sum > 4.75964e+08 )
						if( ema13 <= -44.8267 )
							if( Raw_Money_Flow <= 2.67833e+07 )
								ret := 0.500000
							if( Raw_Money_Flow > 2.67833e+07 )
								if( Positive_Money_Flow_Sum <= 1.90112e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.90112e+08 )
									ret := 0.750000 // buy
						if( ema13 > -44.8267 )
							if( Positive_Money_Flow_Sum <= 6.80107e+07 )
								if( ema12 <= -5.38047 )
									ret := 0.652174
								if( ema12 > -5.38047 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 6.80107e+07 )
								if( Positive_Money_Flow_Sum <= 1.07448e+08 )
									ret := -0.369863
								if( Positive_Money_Flow_Sum > 1.07448e+08 )
									ret := 0.231884
				if( ema13 > -12.5036 )
					if( Negative_Money_Flow <= 2.754e+07 )
						if( Positive_Money_Flow_Sum <= 1.11618e+08 )
							if( Negative_Money_Flow_Sum <= 6.80187e+07 )
								if( Negative_Money_Flow_Sum <= 6.5002e+07 )
									ret := 0.021260
								if( Negative_Money_Flow_Sum > 6.5002e+07 )
									ret := -0.147253
							if( Negative_Money_Flow_Sum > 6.80187e+07 )
								if( Positive_Money_Flow_Sum <= 1.04538e+08 )
									ret := 0.065096
								if( Positive_Money_Flow_Sum > 1.04538e+08 )
									ret := -0.062888
						if( Positive_Money_Flow_Sum > 1.11618e+08 )
							if( MFI <= 34.5439 )
								if( Raw_Money_Flow <= 4.88029e+06 )
									ret := 0.620321
								if( Raw_Money_Flow > 4.88029e+06 )
									ret := 0.241843
							if( MFI > 34.5439 )
								if( Negative_Money_Flow_Sum <= 2.72786e+08 )
									ret := 0.091475
								if( Negative_Money_Flow_Sum > 2.72786e+08 )
									ret := -0.479769
					if( Negative_Money_Flow > 2.754e+07 )
						if( ema3 <= 1277.71 )
							if( ema13 <= 10.8359 )
								if( Positive_Money_Flow_Sum <= 2.15649e+08 )
									ret := 0.236934
								if( Positive_Money_Flow_Sum > 2.15649e+08 )
									ret := -0.400000
							if( ema13 > 10.8359 )
								if( Raw_Money_Flow <= 3.44797e+07 )
									ret := 0.307692
								if( Raw_Money_Flow > 3.44797e+07 )
									ret := -0.433333
						if( ema3 > 1277.71 )
							if( MFI_Low <= -7.0199 )
								if( ema1 <= 1655.91 )
									ret := 0.661017
								if( ema1 > 1655.91 )
									ret := -0.375000
							if( MFI_Low > -7.0199 )
								if( Negative_Money_Flow_Sum <= 4.74815e+08 )
									ret := 0.021310
								if( Negative_Money_Flow_Sum > 4.74815e+08 )
									ret := -0.666667
			if( Positive_Money_Flow_Sum > 2.22007e+08 )
				if( ema13 <= -32.8458 )
					if( ema3 <= 1763.77 )
						if( ema12 <= -21.8774 )
							ret := 1.000000 // buy
						if( ema12 > -21.8774 )
							if( ema3 <= 1489.02 )
								if( ema13 <= -33.8868 )
									ret := 0.947368 // buy
								if( ema13 > -33.8868 )
									ret := 0.250000
							if( ema3 > 1489.02 )
								ret := -0.142857
					if( ema3 > 1763.77 )
						if( Positive_Money_Flow_Sum <= 2.8771e+08 )
							if( MFI_High <= -40.479 )
								ret := 0.200000
							if( MFI_High > -40.479 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 2.8771e+08 )
							if( Typical_Price <= 1968.3 )
								if( Raw_Money_Flow <= 2.97648e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.97648e+07 )
									ret := 0.500000
							if( Typical_Price > 1968.3 )
								ret := 0.000000
				if( ema13 > -32.8458 )
					if( Raw_Money_Flow <= 2.08811e+07 )
						if( Positive_Money_Flow_Sum <= 5.41675e+08 )
							if( Negative_Money_Flow_Sum <= 3.9236e+08 )
								if( ema13 <= 48.8827 )
									ret := -0.061082
								if( ema13 > 48.8827 )
									ret := -0.710526 // sell
							if( Negative_Money_Flow_Sum > 3.9236e+08 )
								if( MFI_Low <= 12.9976 )
									ret := 0.222222
								if( MFI_Low > 12.9976 )
									ret := -0.718750 // sell
						if( Positive_Money_Flow_Sum > 5.41675e+08 )
							if( MFI <= 95.0241 )
								if( Typical_Price <= 1127.61 )
									ret := 0.083333
								if( Typical_Price > 1127.61 )
									ret := -0.627451
							if( MFI > 95.0241 )
								if( MFI_Low <= 76.2153 )
									ret := 1.000000 // buy
								if( MFI_Low > 76.2153 )
									ret := 0.750000 // buy
					if( Raw_Money_Flow > 2.08811e+07 )
						if( Positive_Money_Flow_Sum <= 5.13771e+08 )
							if( Money_Flow_Ratio <= 3.80201 )
								if( Negative_Money_Flow_Sum <= 2.30156e+08 )
									ret := 0.098634
								if( Negative_Money_Flow_Sum > 2.30156e+08 )
									ret := -0.071884
							if( Money_Flow_Ratio > 3.80201 )
								if( Negative_Money_Flow <= 4.2367e+07 )
									ret := -0.085876
								if( Negative_Money_Flow > 4.2367e+07 )
									ret := -0.903226 // sell
						if( Positive_Money_Flow_Sum > 5.13771e+08 )
							if( Negative_Money_Flow_Sum <= 1.75495e+08 )
								if( Negative_Money_Flow_Sum <= 4.00697e+07 )
									ret := -0.227273
								if( Negative_Money_Flow_Sum > 4.00697e+07 )
									ret := 0.620690
							if( Negative_Money_Flow_Sum > 1.75495e+08 )
								if( Money_Flow_Ratio <= 2.37493 )
									ret := 0.489583
								if( Money_Flow_Ratio > 2.37493 )
									ret := -0.144330
	if( Negative_Money_Flow_Sum > 8.02609e+08 )
		if( ema12 <= -2.46004 )
			if( tema <= 1014.71 )
				ret := 0.500000
			if( tema > 1014.71 )
				if( MFI <= 8.14772 )
					ret := 0.500000
				if( MFI > 8.14772 )
					if( Positive_Money_Flow_Sum <= 2.00396e+08 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.00396e+08 )
						if( Raw_Money_Flow <= 9.68735e+07 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 9.68735e+07 )
							ret := 0.714286 // buy
		if( ema12 > -2.46004 )
			if( ema1 <= 1495.44 )
				ret := -0.142857
			if( ema1 > 1495.44 )
				ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MELI_15Min_49c04978(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


