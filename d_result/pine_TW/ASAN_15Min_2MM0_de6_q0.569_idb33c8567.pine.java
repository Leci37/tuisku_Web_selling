//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: ASAN_15Min_2MM0_b33c8567 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_15Min_2MM0_b33c8567", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_15Min_b33c8567(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow <= 58.3129 )
		if( Raw_Money_Flow <= 232412 )
			if( Long_MA <= 80.4432 )
				if( MA_Cross <= 3.10547 )
					if( Positive_Money_Flow_Sum <= 1.7127e+07 )
						if( Positive_Money_Flow_Sum <= 1.56632e+07 )
							ret := -0.176863
						if( Positive_Money_Flow_Sum > 1.56632e+07 )
							ret := -0.537143
					if( Positive_Money_Flow_Sum > 1.7127e+07 )
						if( Short_Long_Diff <= 0.147648 )
							ret := 0.110577
						if( Short_Long_Diff > 0.147648 )
							ret := -0.216374
				if( MA_Cross > 3.10547 )
					if( MFI_High <= -74.7393 )
						ret := 1.000000 // buy
					if( MFI_High > -74.7393 )
						if( Positive_Money_Flow_Sum <= 1.08868e+07 )
							ret := -0.676230
						if( Positive_Money_Flow_Sum > 1.08868e+07 )
							ret := -0.140351
			if( Long_MA > 80.4432 )
				if( Short_Long_Diff <= -0.278041 )
					if( Negative_Money_Flow_Sum <= 5.1336e+07 )
						if( Short_MA <= 104.461 )
							ret := 0.890909 // buy
						if( Short_MA > 104.461 )
							ret := 0.444444
					if( Negative_Money_Flow_Sum > 5.1336e+07 )
						if( Negative_Money_Flow_Sum <= 9.15115e+07 )
							ret := -0.208333
						if( Negative_Money_Flow_Sum > 9.15115e+07 )
							ret := 0.555556
				if( Short_Long_Diff > -0.278041 )
					if( Negative_Money_Flow_Sum <= 9.50192e+07 )
						if( Raw_Money_Flow <= 30984.7 )
							ret := -0.227273
						if( Raw_Money_Flow > 30984.7 )
							ret := 0.196078
					if( Negative_Money_Flow_Sum > 9.50192e+07 )
						if( MFI_High <= -61.692 )
							ret := -0.920000 // sell
						if( MFI_High > -61.692 )
							ret := -0.176471
		if( Raw_Money_Flow > 232412 )
			if( MFI_Low <= 78.3575 )
				if( Positive_Money_Flow_Sum <= 2.01806e+06 )
					if( Money_Flow_Ratio <= 1.02747 )
						if( Typical_Price <= 32.6797 )
							ret := -0.166667
						if( Typical_Price > 32.6797 )
							ret := 0.345794
					if( Money_Flow_Ratio > 1.02747 )
						if( Money_Flow_Ratio <= 4.14005 )
							ret := -0.600000
						if( Money_Flow_Ratio > 4.14005 )
							ret := 0.365854
				if( Positive_Money_Flow_Sum > 2.01806e+06 )
					if( Short_Long_Diff <= 0.741295 )
						if( Negative_Money_Flow_Sum <= 134656 )
							ret := -0.604938
						if( Negative_Money_Flow_Sum > 134656 )
							ret := 0.039730
					if( Short_Long_Diff > 0.741295 )
						if( Money_Flow_Ratio <= 6.48886 )
							ret := -0.026135
						if( Money_Flow_Ratio > 6.48886 )
							ret := -0.618056
			if( MFI_Low > 78.3575 )
				if( Positive_Money_Flow_Sum <= 8.61927e+06 )
					if( Short_MA <= 15.2636 )
						ret := 0.071429
					if( Short_MA > 15.2636 )
						if( Short_Long_Diff <= 0.210317 )
							ret := -0.612500
						if( Short_Long_Diff > 0.210317 )
							ret := -0.923077 // sell
				if( Positive_Money_Flow_Sum > 8.61927e+06 )
					if( Positive_Money_Flow_Sum <= 1.67964e+07 )
						if( Positive_Money_Flow <= 5.64055e+06 )
							ret := 0.092593
						if( Positive_Money_Flow > 5.64055e+06 )
							ret := -0.655172
					if( Positive_Money_Flow_Sum > 1.67964e+07 )
						if( Raw_Money_Flow <= 9.03633e+06 )
							ret := -0.637931
						if( Raw_Money_Flow > 9.03633e+06 )
							ret := -0.281553
	if( Negative_Money_Flow > 58.3129 )
		if( Negative_Money_Flow <= 93888.3 )
			if( MFI_High <= 15.0567 )
				if( Positive_Money_Flow <= 141.287 )
					if( Positive_Money_Flow_Sum <= 5.06578e+07 )
						if( MA_Cross <= 4.396 )
							ret := 0.231881
						if( MA_Cross > 4.396 )
							ret := -0.093023
					if( Positive_Money_Flow_Sum > 5.06578e+07 )
						if( Typical_Price <= 30.1317 )
							ret := 0.625000
						if( Typical_Price > 30.1317 )
							ret := -0.171598
				if( Positive_Money_Flow > 141.287 )
					if( Positive_Money_Flow <= 289540 )
						if( Negative_Money_Flow_Sum <= 4.20082e+07 )
							ret := 0.058421
						if( Negative_Money_Flow_Sum > 4.20082e+07 )
							ret := -0.265487
					if( Positive_Money_Flow > 289540 )
						if( Negative_Money_Flow <= 274.598 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 274.598 )
							ret := 0.231552
			if( MFI_High > 15.0567 )
				if( Negative_Money_Flow_Sum <= 147611 )
					if( Short_Long_Diff <= 0.091886 )
						if( Long_MA <= 26.8038 )
							ret := -0.452632
						if( Long_MA > 26.8038 )
							ret := 0.785714 // buy
					if( Short_Long_Diff > 0.091886 )
						if( Raw_Money_Flow <= 24188.5 )
							ret := 0.685714
						if( Raw_Money_Flow > 24188.5 )
							ret := 0.085106
				if( Negative_Money_Flow_Sum > 147611 )
					if( Money_Flow_Ratio <= 81.509 )
						if( Negative_Money_Flow_Sum <= 759884 )
							ret := -0.861538 // sell
						if( Negative_Money_Flow_Sum > 759884 )
							ret := 0.150000
					if( Money_Flow_Ratio > 81.509 )
						if( Short_Long_Diff <= 0.028672 )
							ret := 0.560000
						if( Short_Long_Diff > 0.028672 )
							ret := -0.255556
		if( Negative_Money_Flow > 93888.3 )
			if( Positive_Money_Flow_Sum <= 8.32367e+07 )
				if( Typical_Price <= 18.9268 )
					if( Money_Flow_Ratio <= 0.159937 )
						if( Short_MA <= 18.9894 )
							ret := -0.201970
						if( Short_MA > 18.9894 )
							ret := 0.741935 // buy
					if( Money_Flow_Ratio > 0.159937 )
						if( Positive_Money_Flow_Sum <= 1.55346e+07 )
							ret := 0.053536
						if( Positive_Money_Flow_Sum > 1.55346e+07 )
							ret := 0.287703
				if( Typical_Price > 18.9268 )
					if( Short_Long_Diff <= -0.110554 )
						if( Negative_Money_Flow_Sum <= 1.04519e+07 )
							ret := -0.138545
						if( Negative_Money_Flow_Sum > 1.04519e+07 )
							ret := 0.067166
					if( Short_Long_Diff > -0.110554 )
						if( Positive_Money_Flow_Sum <= 4.61154e+07 )
							ret := -0.126250
						if( Positive_Money_Flow_Sum > 4.61154e+07 )
							ret := 0.089147
			if( Positive_Money_Flow_Sum > 8.32367e+07 )
				if( Long_MA <= 102.994 )
					if( Raw_Money_Flow <= 6.2148e+06 )
						if( Short_Long_Diff <= 1.61599 )
							ret := -0.167630
						if( Short_Long_Diff > 1.61599 )
							ret := 0.777778 // buy
					if( Raw_Money_Flow > 6.2148e+06 )
						if( Raw_Money_Flow <= 2.06532e+07 )
							ret := 0.602305
						if( Raw_Money_Flow > 2.06532e+07 )
							ret := -0.529412
				if( Long_MA > 102.994 )
					if( Positive_Money_Flow_Sum <= 1.13458e+08 )
						if( Short_Long_Diff <= 0.033049 )
							ret := 0.542857
						if( Short_Long_Diff > 0.033049 )
							ret := 0.060241
					if( Positive_Money_Flow_Sum > 1.13458e+08 )
						if( Negative_Money_Flow <= 2.74678e+06 )
							ret := 0.363636
						if( Negative_Money_Flow > 2.74678e+06 )
							ret := -0.523810
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ASAN_15Min_b33c8567(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


