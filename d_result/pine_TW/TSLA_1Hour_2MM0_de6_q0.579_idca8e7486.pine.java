//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: TSLA_1Hour_2MM0_ca8e7486 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_1Hour_2MM0_ca8e7486", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_1Hour_ca8e7486(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( MFI_Low <= 38.7017 )
		if( Negative_Money_Flow <= 1.50496e+09 )
			if( Long_MA <= 1628.75 )
				if( MFI_High <= -60.2218 )
					if( MFI_High <= -69.8957 )
						if( Long_MA <= 220.571 )
							ret := 0.567073
						if( Long_MA > 220.571 )
							ret := -0.067295
					if( MFI_High > -69.8957 )
						if( Raw_Money_Flow <= 1.11687e+08 )
							ret := -0.345224
						if( Raw_Money_Flow > 1.11687e+08 )
							ret := -0.094737
				if( MFI_High > -60.2218 )
					if( Short_Long_Diff <= 22.0526 )
						if( MFI <= 21.1899 )
							ret := 0.234763
						if( MFI > 21.1899 )
							ret := -0.050856
					if( Short_Long_Diff > 22.0526 )
						if( Negative_Money_Flow_Sum <= 7.32795e+09 )
							ret := 0.100000
						if( Negative_Money_Flow_Sum > 7.32795e+09 )
							ret := 0.901961 // buy
			if( Long_MA > 1628.75 )
				if( MFI <= 41.8485 )
					if( Short_Long_Diff <= -203.298 )
						ret := 1.000000 // buy
					if( Short_Long_Diff > -203.298 )
						if( Negative_Money_Flow_Sum <= 2.10721e+10 )
							ret := -0.777778 // sell
						if( Negative_Money_Flow_Sum > 2.10721e+10 )
							ret := -0.133333
				if( MFI > 41.8485 )
					if( Long_MA <= 1888.87 )
						ret := 1.000000 // buy
					if( Long_MA > 1888.87 )
						if( Short_Long_Diff <= -5.54881 )
							ret := 1.000000 // buy
						if( Short_Long_Diff > -5.54881 )
							ret := 0.352941
		if( Negative_Money_Flow > 1.50496e+09 )
			if( Short_Long_Diff <= -26.6638 )
				if( MFI_High <= -45.9402 )
					if( Negative_Money_Flow_Sum <= 3.44063e+10 )
						if( Typical_Price <= 522.202 )
							ret := 0.000000
						if( Typical_Price > 522.202 )
							ret := 0.935484 // buy
					if( Negative_Money_Flow_Sum > 3.44063e+10 )
						if( Short_Long_Diff <= -36.0966 )
							ret := -0.545455
						if( Short_Long_Diff > -36.0966 )
							ret := 1.000000 // buy
				if( MFI_High > -45.9402 )
					if( MFI <= 40.4177 )
						ret := -1.000000 // sell
					if( MFI > 40.4177 )
						if( Money_Flow_Ratio <= 1.13604 )
							ret := 0.909091 // buy
						if( Money_Flow_Ratio > 1.13604 )
							ret := 0.400000
			if( Short_Long_Diff > -26.6638 )
				if( MA_Cross <= 11.2889 )
					if( Positive_Money_Flow_Sum <= 5.47644e+09 )
						if( Positive_Money_Flow_Sum <= 5.1921e+09 )
							ret := -0.105290
						if( Positive_Money_Flow_Sum > 5.1921e+09 )
							ret := 0.300000
					if( Positive_Money_Flow_Sum > 5.47644e+09 )
						if( MFI_High <= -60.795 )
							ret := -0.891304 // sell
						if( MFI_High > -60.795 )
							ret := -0.278832
				if( MA_Cross > 11.2889 )
					if( Negative_Money_Flow_Sum <= 7.85263e+09 )
						if( Positive_Money_Flow_Sum <= 3.63676e+09 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.63676e+09 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 7.85263e+09 )
						if( Short_Long_Diff <= 3.43112 )
							ret := 0.803279 // buy
						if( Short_Long_Diff > 3.43112 )
							ret := -0.600000
	if( MFI_Low > 38.7017 )
		if( Typical_Price <= 382.323 )
			if( Positive_Money_Flow_Sum <= 3.42587e+10 )
				if( Positive_Money_Flow_Sum <= 1.62704e+10 )
					if( Positive_Money_Flow_Sum <= 7.8407e+09 )
						if( Typical_Price <= 290.546 )
							ret := 0.107607
						if( Typical_Price > 290.546 )
							ret := -0.064706
					if( Positive_Money_Flow_Sum > 7.8407e+09 )
						if( Raw_Money_Flow <= 3.20819e+08 )
							ret := -0.267045
						if( Raw_Money_Flow > 3.20819e+08 )
							ret := -0.010319
				if( Positive_Money_Flow_Sum > 1.62704e+10 )
					if( Long_MA <= 165.37 )
						if( Short_Long_Diff <= 4.80401 )
							ret := 0.748148 // buy
						if( Short_Long_Diff > 4.80401 )
							ret := -0.133333
					if( Long_MA > 165.37 )
						if( Money_Flow_Ratio <= 7.34622 )
							ret := 0.220087
						if( Money_Flow_Ratio > 7.34622 )
							ret := -0.175355
			if( Positive_Money_Flow_Sum > 3.42587e+10 )
				if( Positive_Money_Flow_Sum <= 3.62624e+10 )
					if( Raw_Money_Flow <= 1.24784e+09 )
						if( Short_MA <= 192.882 )
							ret := 0.000000
						if( Short_MA > 192.882 )
							ret := -1.000000 // sell
					if( Raw_Money_Flow > 1.24784e+09 )
						ret := -0.333333
				if( Positive_Money_Flow_Sum > 3.62624e+10 )
					if( Short_Long_Diff <= 10.106 )
						if( Short_MA <= 197.469 )
							ret := -0.840000 // sell
						if( Short_MA > 197.469 )
							ret := -0.243902
					if( Short_Long_Diff > 10.106 )
						ret := 0.750000 // buy
		if( Typical_Price > 382.323 )
			if( Negative_Money_Flow_Sum <= 1.64245e+10 )
				if( Money_Flow_Ratio <= 5.14274 )
					if( Negative_Money_Flow_Sum <= 9.54019e+09 )
						if( Negative_Money_Flow <= 2.07413e+09 )
							ret := 0.144842
						if( Negative_Money_Flow > 2.07413e+09 )
							ret := -0.197492
					if( Negative_Money_Flow_Sum > 9.54019e+09 )
						if( Raw_Money_Flow <= 2.70947e+08 )
							ret := 0.617747
						if( Raw_Money_Flow > 2.70947e+08 )
							ret := 0.264368
				if( Money_Flow_Ratio > 5.14274 )
					if( Raw_Money_Flow <= 9.09288e+09 )
						if( Positive_Money_Flow_Sum <= 2.77509e+10 )
							ret := 0.291332
						if( Positive_Money_Flow_Sum > 2.77509e+10 )
							ret := 0.586449
					if( Raw_Money_Flow > 9.09288e+09 )
						if( Long_MA <= 683.419 )
							ret := 1.000000 // buy
						if( Long_MA > 683.419 )
							ret := -0.931034 // sell
			if( Negative_Money_Flow_Sum > 1.64245e+10 )
				if( Positive_Money_Flow_Sum <= 4.77653e+10 )
					if( Negative_Money_Flow <= 5.72503e+08 )
						if( Long_MA <= 840.171 )
							ret := -0.666667
						if( Long_MA > 840.171 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 5.72503e+08 )
						if( Negative_Money_Flow_Sum <= 1.90683e+10 )
							ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 1.90683e+10 )
							ret := -0.933333 // sell
				if( Positive_Money_Flow_Sum > 4.77653e+10 )
					if( Positive_Money_Flow <= 2.15435e+08 )
						if( Negative_Money_Flow <= 1.26538e+09 )
							ret := 0.714286 // buy
						if( Negative_Money_Flow > 1.26538e+09 )
							ret := -0.285714
					if( Positive_Money_Flow > 2.15435e+08 )
						if( Negative_Money_Flow_Sum <= 4.52696e+10 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 4.52696e+10 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_TSLA_1Hour_ca8e7486(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


