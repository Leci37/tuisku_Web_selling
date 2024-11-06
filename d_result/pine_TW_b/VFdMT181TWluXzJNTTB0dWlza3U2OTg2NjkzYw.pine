//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: TWLO_5Min_2MM0_6986693c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_5Min_2MM0_6986693c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_5Min_6986693c(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow <= 198.118 )
		if( Raw_Money_Flow <= 353366 )
			if( Positive_Money_Flow <= 2320.06 )
				if( MFI_High <= -62.7761 )
					if( Negative_Money_Flow_Sum <= 1.11107e+07 )
						ret := 0.818182 // buy
					if( Negative_Money_Flow_Sum > 1.11107e+07 )
						if( Positive_Money_Flow <= 429.594 )
							ret := -0.419355
						if( Positive_Money_Flow > 429.594 )
							ret := -1.000000 // sell
				if( MFI_High > -62.7761 )
					if( MFI_High <= 7.04212 )
						if( Negative_Money_Flow_Sum <= 217083 )
							ret := 0.564706
						if( Negative_Money_Flow_Sum > 217083 )
							ret := 0.182432
					if( MFI_High > 7.04212 )
						if( Raw_Money_Flow <= 11064.4 )
							ret := -0.736842 // sell
						if( Raw_Money_Flow > 11064.4 )
							ret := 0.066667
			if( Positive_Money_Flow > 2320.06 )
				if( Positive_Money_Flow_Sum <= 182692 )
					if( Short_Long_Diff <= 0.162751 )
						if( Long_MA <= 60.0162 )
							ret := -0.151685
						if( Long_MA > 60.0162 )
							ret := 0.296137
					if( Short_Long_Diff > 0.162751 )
						if( Positive_Money_Flow_Sum <= 114011 )
							ret := -0.214286
						if( Positive_Money_Flow_Sum > 114011 )
							ret := -0.806452 // sell
				if( Positive_Money_Flow_Sum > 182692 )
					if( MA_Cross <= 0.688155 )
						if( Long_MA <= 59.4864 )
							ret := -0.124747
						if( Long_MA > 59.4864 )
							ret := -0.271031
					if( MA_Cross > 0.688155 )
						if( MA_Cross <= 45.6108 )
							ret := -0.813953 // sell
						if( MA_Cross > 45.6108 )
							ret := -0.250000
		if( Raw_Money_Flow > 353366 )
			if( MFI_High <= 14.2433 )
				if( Positive_Money_Flow_Sum <= 5.08576e+07 )
					if( Negative_Money_Flow_Sum <= 543469 )
						if( Short_Long_Diff <= 0.165548 )
							ret := -0.629921
						if( Short_Long_Diff > 0.165548 )
							ret := 0.120000
					if( Negative_Money_Flow_Sum > 543469 )
						if( Short_Long_Diff <= 0.208913 )
							ret := -0.029430
						if( Short_Long_Diff > 0.208913 )
							ret := -0.167019
				if( Positive_Money_Flow_Sum > 5.08576e+07 )
					if( Typical_Price <= 62.4296 )
						if( MFI_Low <= 33.2942 )
							ret := -0.626087
						if( MFI_Low > 33.2942 )
							ret := 0.090604
					if( Typical_Price > 62.4296 )
						if( Negative_Money_Flow_Sum <= 5.96231e+07 )
							ret := -0.693548
						if( Negative_Money_Flow_Sum > 5.96231e+07 )
							ret := -0.085714
			if( MFI_High > 14.2433 )
				if( Short_MA <= 61.5259 )
					if( Short_Long_Diff <= 0.286389 )
						if( Short_Long_Diff <= -0.062751 )
							ret := 0.145455
						if( Short_Long_Diff > -0.062751 )
							ret := 0.645695
					if( Short_Long_Diff > 0.286389 )
						if( Positive_Money_Flow <= 7.15152e+06 )
							ret := -0.121212
						if( Positive_Money_Flow > 7.15152e+06 )
							ret := 0.928571 // buy
				if( Short_MA > 61.5259 )
					if( Short_Long_Diff <= 0.029574 )
						if( Negative_Money_Flow_Sum <= 164123 )
							ret := 0.974359 // buy
						if( Negative_Money_Flow_Sum > 164123 )
							ret := 0.340000
					if( Short_Long_Diff > 0.029574 )
						if( Negative_Money_Flow_Sum <= 220606 )
							ret := -0.690141
						if( Negative_Money_Flow_Sum > 220606 )
							ret := -0.165289
	if( Negative_Money_Flow > 198.118 )
		if( Negative_Money_Flow <= 251420 )
			if( Money_Flow_Ratio <= 0.720493 )
				if( MA_Cross <= 0.300001 )
					if( Negative_Money_Flow_Sum <= 1.09819e+07 )
						if( Positive_Money_Flow_Sum <= 303562 )
							ret := 0.371477
						if( Positive_Money_Flow_Sum > 303562 )
							ret := -0.026379
					if( Negative_Money_Flow_Sum > 1.09819e+07 )
						if( Short_MA <= 57.3612 )
							ret := 0.256579
						if( Short_MA > 57.3612 )
							ret := 0.497784
				if( MA_Cross > 0.300001 )
					if( Negative_Money_Flow <= 159354 )
						if( Negative_Money_Flow_Sum <= 5.14311e+06 )
							ret := -0.932203 // sell
						if( Negative_Money_Flow_Sum > 5.14311e+06 )
							ret := 0.107527
					if( Negative_Money_Flow > 159354 )
						ret := 1.000000 // buy
			if( Money_Flow_Ratio > 0.720493 )
				if( Positive_Money_Flow_Sum <= 3.1683e+07 )
					if( Typical_Price <= 61.7602 )
						if( Negative_Money_Flow_Sum <= 225814 )
							ret := 0.538283
						if( Negative_Money_Flow_Sum > 225814 )
							ret := 0.161366
					if( Typical_Price > 61.7602 )
						if( Positive_Money_Flow_Sum <= 2.82753e+07 )
							ret := -0.099835
						if( Positive_Money_Flow_Sum > 2.82753e+07 )
							ret := 0.491667
				if( Positive_Money_Flow_Sum > 3.1683e+07 )
					if( Short_Long_Diff <= 0.040564 )
						if( Long_MA <= 59.076 )
							ret := 0.388889
						if( Long_MA > 59.076 )
							ret := 0.720588 // buy
					if( Short_Long_Diff > 0.040564 )
						if( Positive_Money_Flow_Sum <= 6.03058e+07 )
							ret := 0.374702
						if( Positive_Money_Flow_Sum > 6.03058e+07 )
							ret := -0.252174
		if( Negative_Money_Flow > 251420 )
			if( Money_Flow_Ratio <= 0.118274 )
				if( Short_Long_Diff <= 0.194771 )
					if( Negative_Money_Flow_Sum <= 8.10166e+06 )
						if( MFI <= 2.46011 )
							ret := 0.606061
						if( MFI > 2.46011 )
							ret := -0.020833
					if( Negative_Money_Flow_Sum > 8.10166e+06 )
						if( Negative_Money_Flow_Sum <= 8.41394e+07 )
							ret := -0.354305
						if( Negative_Money_Flow_Sum > 8.41394e+07 )
							ret := 0.833333 // buy
				if( Short_Long_Diff > 0.194771 )
					if( Raw_Money_Flow <= 4.46103e+06 )
						if( Money_Flow_Ratio <= 0.063783 )
							ret := -0.297297
						if( Money_Flow_Ratio > 0.063783 )
							ret := -0.931034 // sell
					if( Raw_Money_Flow > 4.46103e+06 )
						ret := -1.000000 // sell
			if( Money_Flow_Ratio > 0.118274 )
				if( Typical_Price <= 50.8124 )
					if( Short_Long_Diff <= 0.341767 )
						if( Raw_Money_Flow <= 3.79638e+06 )
							ret := 0.220930
						if( Raw_Money_Flow > 3.79638e+06 )
							ret := 0.820225 // buy
					if( Short_Long_Diff > 0.341767 )
						if( MFI_Low <= 49.2919 )
							ret := -1.000000 // sell
						if( MFI_Low > 49.2919 )
							ret := -0.666667
				if( Typical_Price > 50.8124 )
					if( Positive_Money_Flow <= 567.371 )
						if( Positive_Money_Flow_Sum <= 1.1426e+06 )
							ret := 0.353896
						if( Positive_Money_Flow_Sum > 1.1426e+06 )
							ret := 0.013478
					if( Positive_Money_Flow > 567.371 )
						if( Long_MA <= 57.3276 )
							ret := 0.185185
						if( Long_MA > 57.3276 )
							ret := -0.321767
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_TWLO_5Min_6986693c(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


