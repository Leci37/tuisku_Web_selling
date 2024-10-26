//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: PTON_1Min_2MT0_a1fe61a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_1Min_2MT0_a1fe61a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_1Min_a1fe61a7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= 0.00034 )
		if( Negative_Money_Flow <= 4.1963 )
			if( Typical_Price <= 3.49274 )
				if( Positive_Money_Flow_Sum <= 680796 )
					if( Raw_Money_Flow <= 6420.86 )
						if( Positive_Money_Flow <= 359.283 )
							ret := 0.088235
						if( Positive_Money_Flow > 359.283 )
							ret := -0.273728
					if( Raw_Money_Flow > 6420.86 )
						if( Negative_Money_Flow_Sum <= 337382 )
							ret := 0.123957
						if( Negative_Money_Flow_Sum > 337382 )
							ret := -0.044273
				if( Positive_Money_Flow_Sum > 680796 )
					if( ema13 <= -0.073074 )
						if( Positive_Money_Flow_Sum <= 4.01867e+06 )
							ret := -0.250000
						if( Positive_Money_Flow_Sum > 4.01867e+06 )
							ret := -1.000000 // sell
					if( ema13 > -0.073074 )
						if( Positive_Money_Flow_Sum <= 3.07198e+06 )
							ret := 0.244952
						if( Positive_Money_Flow_Sum > 3.07198e+06 )
							ret := -0.121795
			if( Typical_Price > 3.49274 )
				if( ema12 <= -0.031579 )
					if( MFI_High <= -53.6757 )
						if( Money_Flow_Ratio <= 0.293198 )
							ret := -0.616667
						if( Money_Flow_Ratio > 0.293198 )
							ret := 0.800000 // buy
					if( MFI_High > -53.6757 )
						if( Positive_Money_Flow <= 2.12072e+06 )
							ret := -0.920000 // sell
						if( Positive_Money_Flow > 2.12072e+06 )
							ret := 1.000000 // buy
				if( ema12 > -0.031579 )
					if( Raw_Money_Flow <= 1444.19 )
						if( Positive_Money_Flow <= 119.612 )
							ret := 0.074074
						if( Positive_Money_Flow > 119.612 )
							ret := -0.406844
					if( Raw_Money_Flow > 1444.19 )
						if( Positive_Money_Flow_Sum <= 5.02136e+06 )
							ret := -0.063590
						if( Positive_Money_Flow_Sum > 5.02136e+06 )
							ret := 0.342308
		if( Negative_Money_Flow > 4.1963 )
			if( Positive_Money_Flow_Sum <= 41526.8 )
				if( Negative_Money_Flow_Sum <= 100985 )
					if( Positive_Money_Flow <= 0.82139 )
						if( ema13 <= -0.015831 )
							ret := 0.780612 // buy
						if( ema13 > -0.015831 )
							ret := 0.541945
					if( Positive_Money_Flow > 0.82139 )
						if( MFI_High <= -25.9081 )
							ret := 0.008772
						if( MFI_High > -25.9081 )
							ret := 0.586207
				if( Negative_Money_Flow_Sum > 100985 )
					if( Negative_Money_Flow_Sum <= 121985 )
						if( Raw_Money_Flow <= 26872.5 )
							ret := -0.466667
						if( Raw_Money_Flow > 26872.5 )
							ret := 0.275862
					if( Negative_Money_Flow_Sum > 121985 )
						if( Negative_Money_Flow <= 4175.82 )
							ret := 0.663866
						if( Negative_Money_Flow > 4175.82 )
							ret := 0.274659
			if( Positive_Money_Flow_Sum > 41526.8 )
				if( MFI_Low <= 50.7045 )
					if( Negative_Money_Flow <= 2683.34 )
						if( Negative_Money_Flow_Sum <= 1.4687e+06 )
							ret := 0.134269
						if( Negative_Money_Flow_Sum > 1.4687e+06 )
							ret := 0.663158
					if( Negative_Money_Flow > 2683.34 )
						if( Negative_Money_Flow_Sum <= 134146 )
							ret := 0.341241
						if( Negative_Money_Flow_Sum > 134146 )
							ret := 0.057331
				if( MFI_Low > 50.7045 )
					if( Positive_Money_Flow_Sum <= 58738.9 )
						if( Negative_Money_Flow_Sum <= 13555.7 )
							ret := 0.292308
						if( Negative_Money_Flow_Sum > 13555.7 )
							ret := -0.615385
					if( Positive_Money_Flow_Sum > 58738.9 )
						if( Negative_Money_Flow_Sum <= 33330.1 )
							ret := 0.737805 // buy
						if( Negative_Money_Flow_Sum > 33330.1 )
							ret := 0.417738
	if( ema12 > 0.00034 )
		if( Negative_Money_Flow <= 530.462 )
			if( Raw_Money_Flow <= 4965.84 )
				if( ema12 <= 0.005625 )
					if( Negative_Money_Flow <= 92.3259 )
						if( Positive_Money_Flow_Sum <= 5.33274e+06 )
							ret := -0.302130
						if( Positive_Money_Flow_Sum > 5.33274e+06 )
							ret := 0.703704 // buy
					if( Negative_Money_Flow > 92.3259 )
						if( Positive_Money_Flow_Sum <= 99461.3 )
							ret := 0.244648
						if( Positive_Money_Flow_Sum > 99461.3 )
							ret := -0.317647
				if( ema12 > 0.005625 )
					if( Positive_Money_Flow <= 1.32581 )
						if( MFI_High <= -49.1051 )
							ret := -0.791045 // sell
						if( MFI_High > -49.1051 )
							ret := -0.172949
					if( Positive_Money_Flow > 1.32581 )
						if( Negative_Money_Flow_Sum <= 54425.8 )
							ret := -0.584130
						if( Negative_Money_Flow_Sum > 54425.8 )
							ret := -0.339623
			if( Raw_Money_Flow > 4965.84 )
				if( Negative_Money_Flow_Sum <= 52301.4 )
					if( Positive_Money_Flow <= 163.42 )
						if( Negative_Money_Flow_Sum <= 7152.38 )
							ret := 0.615385
						if( Negative_Money_Flow_Sum > 7152.38 )
							ret := -0.067511
					if( Positive_Money_Flow > 163.42 )
						if( MFI_Low <= 74.3512 )
							ret := -0.334370
						if( MFI_Low > 74.3512 )
							ret := -0.064516
				if( Negative_Money_Flow_Sum > 52301.4 )
					if( Positive_Money_Flow_Sum <= 1.41039e+07 )
						if( Positive_Money_Flow_Sum <= 312506 )
							ret := -0.193616
						if( Positive_Money_Flow_Sum > 312506 )
							ret := -0.066148
					if( Positive_Money_Flow_Sum > 1.41039e+07 )
						if( Negative_Money_Flow_Sum <= 914195 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 914195 )
							ret := -0.733813 // sell
		if( Negative_Money_Flow > 530.462 )
			if( Negative_Money_Flow_Sum <= 461306 )
				if( Raw_Money_Flow <= 4217.33 )
					if( ema12 <= 0.023669 )
						if( ema12 <= 0.004661 )
							ret := 0.391358
						if( ema12 > 0.004661 )
							ret := 0.118881
					if( ema12 > 0.023669 )
						if( Negative_Money_Flow_Sum <= 35384.3 )
							ret := -0.916667 // sell
						if( Negative_Money_Flow_Sum > 35384.3 )
							ret := 0.000000
				if( Raw_Money_Flow > 4217.33 )
					if( Positive_Money_Flow_Sum <= 544139 )
						if( Positive_Money_Flow_Sum <= 480791 )
							ret := 0.048504
						if( Positive_Money_Flow_Sum > 480791 )
							ret := -0.300493
					if( Positive_Money_Flow_Sum > 544139 )
						if( Positive_Money_Flow_Sum <= 1.17704e+06 )
							ret := 0.235599
						if( Positive_Money_Flow_Sum > 1.17704e+06 )
							ret := 0.041401
			if( Negative_Money_Flow_Sum > 461306 )
				if( ema13 <= 0.086952 )
					if( MFI_High <= -12.3682 )
						if( Negative_Money_Flow <= 1.45538e+06 )
							ret := -0.078847
						if( Negative_Money_Flow > 1.45538e+06 )
							ret := 0.424051
					if( MFI_High > -12.3682 )
						if( tema <= 3.82889 )
							ret := -0.054321
						if( tema > 3.82889 )
							ret := 0.238337
				if( ema13 > 0.086952 )
					if( Typical_Price <= 3.70573 )
						ret := 0.642857
					if( Typical_Price > 3.70573 )
						if( ema12 <= 0.136623 )
							ret := -0.717391 // sell
						if( ema12 > 0.136623 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_PTON_1Min_a1fe61a7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


