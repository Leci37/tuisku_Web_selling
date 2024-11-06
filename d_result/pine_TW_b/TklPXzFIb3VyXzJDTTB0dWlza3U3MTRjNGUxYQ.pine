//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: NIO_1Hour_2CM0_714c4e1a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Hour_2CM0_714c4e1a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Hour_714c4e1a(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( mf <= -0.114494 )
		if( Raw_Money_Flow <= 1.17091e+06 )
			if( Positive_Money_Flow_Sum <= 6.30113e+07 )
				if( mf <= -0.237217 )
					if( Typical_Price <= 3.045 )
						if( Typical_Price <= 1.44 )
							ret := 0.600000
						if( Typical_Price > 1.44 )
							ret := -0.780000 // sell
					if( Typical_Price > 3.045 )
						if( Negative_Money_Flow_Sum <= 5.50228e+07 )
							ret := -0.024194
						if( Negative_Money_Flow_Sum > 5.50228e+07 )
							ret := -0.484496
				if( mf > -0.237217 )
					if( Positive_Money_Flow_Sum <= 3.90997e+07 )
						if( Positive_Money_Flow_Sum <= 7.26529e+06 )
							ret := -0.700000 // sell
						if( Positive_Money_Flow_Sum > 7.26529e+06 )
							ret := -0.023333
					if( Positive_Money_Flow_Sum > 3.90997e+07 )
						if( Typical_Price <= 4.04333 )
							ret := -0.796296 // sell
						if( Typical_Price > 4.04333 )
							ret := -0.293839
			if( Positive_Money_Flow_Sum > 6.30113e+07 )
				if( MFI_High <= -14.3768 )
					if( Negative_Money_Flow_Sum <= 4.59914e+08 )
						if( Positive_Money_Flow_Sum <= 3.29213e+08 )
							ret := 0.037736
						if( Positive_Money_Flow_Sum > 3.29213e+08 )
							ret := -0.525424
					if( Negative_Money_Flow_Sum > 4.59914e+08 )
						if( MFI <= 44.2615 )
							ret := -0.322785
						if( MFI > 44.2615 )
							ret := -0.768116 // sell
				if( MFI_High > -14.3768 )
					if( Typical_Price <= 2.45353 )
						ret := -1.000000 // sell
					if( Typical_Price > 2.45353 )
						if( Positive_Money_Flow <= 1.0629e+06 )
							ret := 0.887640 // buy
						if( Positive_Money_Flow > 1.0629e+06 )
							ret := -0.400000
		if( Raw_Money_Flow > 1.17091e+06 )
			if( Typical_Price <= 44.4317 )
				if( Positive_Money_Flow_Sum <= 4.50379e+08 )
					if( Negative_Money_Flow_Sum <= 1.02582e+09 )
						if( Positive_Money_Flow <= 1.35015e+08 )
							ret := 0.002189
						if( Positive_Money_Flow > 1.35015e+08 )
							ret := -0.533333
					if( Negative_Money_Flow_Sum > 1.02582e+09 )
						if( Typical_Price <= 31.4201 )
							ret := -0.442500
						if( Typical_Price > 31.4201 )
							ret := -0.060000
				if( Positive_Money_Flow_Sum > 4.50379e+08 )
					if( Negative_Money_Flow_Sum <= 6.95899e+08 )
						if( mf <= -0.178334 )
							ret := -0.245098
						if( mf > -0.178334 )
							ret := 0.151515
					if( Negative_Money_Flow_Sum > 6.95899e+08 )
						if( mf <= -0.129629 )
							ret := 0.317411
						if( mf > -0.129629 )
							ret := -0.277778
			if( Typical_Price > 44.4317 )
				if( Raw_Money_Flow <= 1.52136e+08 )
					if( Raw_Money_Flow <= 4.606e+06 )
						if( mf <= -0.287153 )
							ret := -0.800000 // sell
						if( mf > -0.287153 )
							ret := 0.102041
					if( Raw_Money_Flow > 4.606e+06 )
						if( Positive_Money_Flow_Sum <= 1.72221e+09 )
							ret := -0.732143 // sell
						if( Positive_Money_Flow_Sum > 1.72221e+09 )
							ret := -0.037037
				if( Raw_Money_Flow > 1.52136e+08 )
					if( MFI <= 22.8876 )
						if( ad <= -3.2743e+06 )
							ret := -0.777778 // sell
						if( ad > -3.2743e+06 )
							ret := -0.071429
					if( MFI > 22.8876 )
						if( Raw_Money_Flow <= 1.43843e+09 )
							ret := 0.390805
						if( Raw_Money_Flow > 1.43843e+09 )
							ret := -0.750000 // sell
	if( mf > -0.114494 )
		if( Negative_Money_Flow_Sum <= 1.47425e+09 )
			if( ad_mf <= 2844.67 )
				if( Typical_Price <= 2.42358 )
					if( ad <= -205053 )
						if( Negative_Money_Flow <= 2.62178e+07 )
							ret := 0.611702
						if( Negative_Money_Flow > 2.62178e+07 )
							ret := -1.000000 // sell
					if( ad > -205053 )
						if( Negative_Money_Flow_Sum <= 4.07623e+06 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 4.07623e+06 )
							ret := 0.082707
				if( Typical_Price > 2.42358 )
					if( Positive_Money_Flow_Sum <= 6.69661e+08 )
						if( Typical_Price <= 24.172 )
							ret := 0.049474
						if( Typical_Price > 24.172 )
							ret := -0.421546
					if( Positive_Money_Flow_Sum > 6.69661e+08 )
						if( MFI <= 76.59 )
							ret := 0.277728
						if( MFI > 76.59 )
							ret := 0.019185
			if( ad_mf > 2844.67 )
				if( Raw_Money_Flow <= 4.2988e+08 )
					if( Negative_Money_Flow_Sum <= 3.62772e+08 )
						if( MFI_Low <= 52.6024 )
							ret := -0.058694
						if( MFI_Low > 52.6024 )
							ret := 0.073497
					if( Negative_Money_Flow_Sum > 3.62772e+08 )
						if( Negative_Money_Flow_Sum <= 5.47401e+08 )
							ret := -0.296893
						if( Negative_Money_Flow_Sum > 5.47401e+08 )
							ret := -0.077416
				if( Raw_Money_Flow > 4.2988e+08 )
					if( MFI_Low <= 29.9249 )
						if( mf <= -0.024837 )
							ret := 0.000000
						if( mf > -0.024837 )
							ret := 0.902439 // buy
					if( MFI_Low > 29.9249 )
						if( ad <= 2.1933e+07 )
							ret := 0.084112
						if( ad > 2.1933e+07 )
							ret := 0.526316
		if( Negative_Money_Flow_Sum > 1.47425e+09 )
			if( Typical_Price <= 38.717 )
				if( Negative_Money_Flow_Sum <= 2.68441e+09 )
					if( Raw_Money_Flow <= 2.01662e+08 )
						if( Negative_Money_Flow <= 776.677 )
							ret := 0.240964
						if( Negative_Money_Flow > 776.677 )
							ret := 0.755396 // buy
					if( Raw_Money_Flow > 2.01662e+08 )
						if( mf <= -0.017299 )
							ret := 0.433333
						if( mf > -0.017299 )
							ret := -0.500000
				if( Negative_Money_Flow_Sum > 2.68441e+09 )
					if( Negative_Money_Flow <= 1871.5 )
						if( ad <= -267248 )
							ret := 1.000000 // buy
						if( ad > -267248 )
							ret := 0.291667
					if( Negative_Money_Flow > 1871.5 )
						if( ad_mf <= -1.1804e+07 )
							ret := 0.222222
						if( ad_mf > -1.1804e+07 )
							ret := 0.937500 // buy
			if( Typical_Price > 38.717 )
				if( MFI_High <= -62.0261 )
					if( Negative_Money_Flow_Sum <= 4.70645e+09 )
						if( MFI_High <= -68.8844 )
							ret := -0.500000
						if( MFI_High > -68.8844 )
							ret := -0.879310 // sell
					if( Negative_Money_Flow_Sum > 4.70645e+09 )
						if( ad <= -972686 )
							ret := 1.000000 // buy
						if( ad > -972686 )
							ret := -0.250000
				if( MFI_High > -62.0261 )
					if( MFI <= 47.2135 )
						if( Money_Flow_Ratio <= 0.698579 )
							ret := 0.136015
						if( Money_Flow_Ratio > 0.698579 )
							ret := -0.298701
					if( MFI > 47.2135 )
						if( Positive_Money_Flow_Sum <= 4.09577e+09 )
							ret := 0.183099
						if( Positive_Money_Flow_Sum > 4.09577e+09 )
							ret := 0.547038
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_NIO_1Hour_714c4e1a(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


