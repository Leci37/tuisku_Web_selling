//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: SNOW_30Min_1M00_0c9e352f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_30Min_1M00_0c9e352f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_30Min_0c9e352f(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Positive_Money_Flow <= 87755.8 )
		if( Raw_Money_Flow <= 1.50286e+07 )
			if( Negative_Money_Flow_Sum <= 1.68527e+08 )
				if( Negative_Money_Flow <= 41435.8 )
					if( Positive_Money_Flow_Sum <= 2.01012e+08 )
						if( Negative_Money_Flow <= 612.643 )
							ret := -0.090000
						if( Negative_Money_Flow > 612.643 )
							ret := -0.436364
					if( Positive_Money_Flow_Sum > 2.01012e+08 )
						if( Negative_Money_Flow_Sum <= 1.62862e+08 )
							ret := 0.049180
						if( Negative_Money_Flow_Sum > 1.62862e+08 )
							ret := -0.538462
				if( Negative_Money_Flow > 41435.8 )
					if( Positive_Money_Flow_Sum <= 3.8491e+08 )
						if( Money_Flow_Ratio <= 0.169544 )
							ret := 0.256267
						if( Money_Flow_Ratio > 0.169544 )
							ret := 0.021386
					if( Positive_Money_Flow_Sum > 3.8491e+08 )
						if( Positive_Money_Flow_Sum <= 4.38789e+08 )
							ret := 0.612613
						if( Positive_Money_Flow_Sum > 4.38789e+08 )
							ret := 0.103846
			if( Negative_Money_Flow_Sum > 1.68527e+08 )
				if( Negative_Money_Flow_Sum <= 1.792e+08 )
					if( Positive_Money_Flow_Sum <= 1.67476e+08 )
						if( Raw_Money_Flow <= 808106 )
							ret := 0.699387
						if( Raw_Money_Flow > 808106 )
							ret := 0.148148
					if( Positive_Money_Flow_Sum > 1.67476e+08 )
						if( MFI_High <= -26.5378 )
							ret := -0.533333
						if( MFI_High > -26.5378 )
							ret := 0.129412
				if( Negative_Money_Flow_Sum > 1.792e+08 )
					if( Positive_Money_Flow_Sum <= 4.13083e+07 )
						if( Raw_Money_Flow <= 1.1554e+06 )
							ret := -0.083333
						if( Raw_Money_Flow > 1.1554e+06 )
							ret := 0.386792
					if( Positive_Money_Flow_Sum > 4.13083e+07 )
						if( Negative_Money_Flow_Sum <= 2.55048e+08 )
							ret := 0.045807
						if( Negative_Money_Flow_Sum > 2.55048e+08 )
							ret := 0.182383
		if( Raw_Money_Flow > 1.50286e+07 )
			if( Positive_Money_Flow_Sum <= 2.0274e+06 )
				if( Negative_Money_Flow_Sum <= 9.86953e+08 )
					if( Positive_Money_Flow_Sum <= 294537 )
						ret := 0.454545
					if( Positive_Money_Flow_Sum > 294537 )
						if( Negative_Money_Flow <= 9.50038e+07 )
							ret := -0.407932
						if( Negative_Money_Flow > 9.50038e+07 )
							ret := -0.673913
				if( Negative_Money_Flow_Sum > 9.86953e+08 )
					ret := 0.846154 // buy
			if( Positive_Money_Flow_Sum > 2.0274e+06 )
				if( Positive_Money_Flow_Sum <= 5.78866e+07 )
					if( Negative_Money_Flow <= 2.2656e+07 )
						if( Money_Flow_Ratio <= 0.676498 )
							ret := -0.542169
						if( Money_Flow_Ratio > 0.676498 )
							ret := 0.294118
					if( Negative_Money_Flow > 2.2656e+07 )
						if( Negative_Money_Flow_Sum <= 1.06616e+08 )
							ret := 0.602041
						if( Negative_Money_Flow_Sum > 1.06616e+08 )
							ret := 0.150070
				if( Positive_Money_Flow_Sum > 5.78866e+07 )
					if( Positive_Money_Flow_Sum <= 2.41503e+08 )
						if( Positive_Money_Flow_Sum <= 2.39247e+08 )
							ret := -0.075970
						if( Positive_Money_Flow_Sum > 2.39247e+08 )
							ret := -0.639344
					if( Positive_Money_Flow_Sum > 2.41503e+08 )
						if( Typical_Price <= 173.892 )
							ret := 0.175468
						if( Typical_Price > 173.892 )
							ret := -0.019755
	if( Positive_Money_Flow > 87755.8 )
		if( Negative_Money_Flow_Sum <= 3.30472e+08 )
			if( Negative_Money_Flow_Sum <= 5.4027e+06 )
				if( Negative_Money_Flow_Sum <= 3.45963e+06 )
					if( MFI_High <= -23.2338 )
						if( Raw_Money_Flow <= 320963 )
							ret := -0.840000 // sell
						if( Raw_Money_Flow > 320963 )
							ret := 0.598131
					if( MFI_High > -23.2338 )
						if( Positive_Money_Flow_Sum <= 3.37536e+06 )
							ret := -0.614679
						if( Positive_Money_Flow_Sum > 3.37536e+06 )
							ret := -0.044667
				if( Negative_Money_Flow_Sum > 3.45963e+06 )
					if( Negative_Money_Flow <= 477286 )
						if( Negative_Money_Flow_Sum <= 4.09005e+06 )
							ret := -0.574561
						if( Negative_Money_Flow_Sum > 4.09005e+06 )
							ret := -0.217791
					if( Negative_Money_Flow > 477286 )
						if( Raw_Money_Flow <= 1.81406e+06 )
							ret := 0.263158
						if( Raw_Money_Flow > 1.81406e+06 )
							ret := 0.833333 // buy
			if( Negative_Money_Flow_Sum > 5.4027e+06 )
				if( Positive_Money_Flow_Sum <= 1.84131e+09 )
					if( Typical_Price <= 140.738 )
						if( Positive_Money_Flow_Sum <= 2.96418e+08 )
							ret := 0.196303
						if( Positive_Money_Flow_Sum > 2.96418e+08 )
							ret := -0.209964
					if( Typical_Price > 140.738 )
						if( Money_Flow_Ratio <= 4.21948 )
							ret := -0.032163
						if( Money_Flow_Ratio > 4.21948 )
							ret := 0.088425
				if( Positive_Money_Flow_Sum > 1.84131e+09 )
					if( Negative_Money_Flow_Sum <= 9.79765e+07 )
						if( Negative_Money_Flow_Sum <= 1.42793e+07 )
							ret := -0.900000 // sell
						if( Negative_Money_Flow_Sum > 1.42793e+07 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 9.79765e+07 )
						ret := -0.538462
		if( Negative_Money_Flow_Sum > 3.30472e+08 )
			if( Typical_Price <= 173.561 )
				if( Typical_Price <= 142.616 )
					if( Typical_Price <= 136.928 )
						if( Raw_Money_Flow <= 199940 )
							ret := 0.580645
						if( Raw_Money_Flow > 199940 )
							ret := -0.003663
					if( Typical_Price > 136.928 )
						if( Positive_Money_Flow <= 3.32079e+07 )
							ret := 0.087719
						if( Positive_Money_Flow > 3.32079e+07 )
							ret := 0.580645
				if( Typical_Price > 142.616 )
					if( Typical_Price <= 163.28 )
						if( Positive_Money_Flow_Sum <= 8.94813e+08 )
							ret := -0.212766
						if( Positive_Money_Flow_Sum > 8.94813e+08 )
							ret := 0.410714
					if( Typical_Price > 163.28 )
						if( Raw_Money_Flow <= 6.14998e+07 )
							ret := 0.005464
						if( Raw_Money_Flow > 6.14998e+07 )
							ret := 0.378641
			if( Typical_Price > 173.561 )
				if( Negative_Money_Flow_Sum <= 3.73237e+08 )
					if( MFI_Low <= 20.9133 )
						if( Positive_Money_Flow_Sum <= 2.25353e+08 )
							ret := -0.336066
						if( Positive_Money_Flow_Sum > 2.25353e+08 )
							ret := 0.647059
					if( MFI_Low > 20.9133 )
						if( MFI <= 57.0738 )
							ret := -0.737778 // sell
						if( MFI > 57.0738 )
							ret := -0.294964
				if( Negative_Money_Flow_Sum > 3.73237e+08 )
					if( Negative_Money_Flow_Sum <= 4.16928e+08 )
						if( Money_Flow_Ratio <= 1.40877 )
							ret := 0.182927
						if( Money_Flow_Ratio > 1.40877 )
							ret := -0.321839
					if( Negative_Money_Flow_Sum > 4.16928e+08 )
						if( MFI_Low <= 54.6473 )
							ret := -0.203781
						if( MFI_Low > 54.6473 )
							ret := 0.538462
	
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
float op_operation = decision_tree_0_SNOW_30Min_0c9e352f(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


