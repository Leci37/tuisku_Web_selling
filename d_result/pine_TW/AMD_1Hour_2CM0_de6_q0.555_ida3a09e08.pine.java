//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AMD_1Hour_2CM0_a3a09e08 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Hour_2CM0_a3a09e08", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Hour_a3a09e08(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( mf <= -0.399681 )
		if( Positive_Money_Flow_Sum <= 2.47292e+09 )
			if( Positive_Money_Flow_Sum <= 3.88365e+07 )
				if( MFI_Low <= -19.5871 )
					if( mf <= -0.452359 )
						if( Positive_Money_Flow_Sum <= 1.43232e+07 )
							ret := 0.764706 // buy
						if( Positive_Money_Flow_Sum > 1.43232e+07 )
							ret := 0.125000
					if( mf > -0.452359 )
						ret := -0.235294
				if( MFI_Low > -19.5871 )
					if( ad <= -337001 )
						ret := 0.875000 // buy
					if( ad > -337001 )
						ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 3.88365e+07 )
				if( Negative_Money_Flow_Sum <= 1.10954e+10 )
					if( MFI <= 10.2434 )
						if( Negative_Money_Flow_Sum <= 6.48661e+09 )
							ret := 0.062500
						if( Negative_Money_Flow_Sum > 6.48661e+09 )
							ret := -0.583333
					if( MFI > 10.2434 )
						if( MFI_High <= -64.475 )
							ret := 0.572917
						if( MFI_High > -64.475 )
							ret := 0.011765
				if( Negative_Money_Flow_Sum > 1.10954e+10 )
					if( mf <= -0.542001 )
						if( Typical_Price <= 162.748 )
							ret := 1.000000 // buy
						if( Typical_Price > 162.748 )
							ret := 0.545455
					if( mf > -0.542001 )
						ret := 0.166667
		if( Positive_Money_Flow_Sum > 2.47292e+09 )
			if( Positive_Money_Flow <= 3.83584e+08 )
				if( mf <= -0.406357 )
					if( Typical_Price <= 104.726 )
						ret := 0.600000
					if( Typical_Price > 104.726 )
						if( Negative_Money_Flow_Sum <= 6.57418e+09 )
							ret := 0.900000 // buy
						if( Negative_Money_Flow_Sum > 6.57418e+09 )
							ret := 1.000000 // buy
				if( mf > -0.406357 )
					ret := 0.384615
			if( Positive_Money_Flow > 3.83584e+08 )
				ret := 0.153846
	if( mf > -0.399681 )
		if( Negative_Money_Flow_Sum <= 6.49985e+09 )
			if( Negative_Money_Flow_Sum <= 6.15101e+09 )
				if( MFI <= 35.8132 )
					if( Positive_Money_Flow_Sum <= 1.63479e+09 )
						if( Negative_Money_Flow_Sum <= 2.8254e+09 )
							ret := -0.081211
						if( Negative_Money_Flow_Sum > 2.8254e+09 )
							ret := 0.045419
					if( Positive_Money_Flow_Sum > 1.63479e+09 )
						if( Positive_Money_Flow_Sum <= 2.69824e+09 )
							ret := -0.321429
						if( Positive_Money_Flow_Sum > 2.69824e+09 )
							ret := 0.309278
				if( MFI > 35.8132 )
					if( Money_Flow_Ratio <= 0.6346 )
						if( Raw_Money_Flow <= 4.9755e+07 )
							ret := 0.448225
						if( Raw_Money_Flow > 4.9755e+07 )
							ret := 0.053191
					if( Money_Flow_Ratio > 0.6346 )
						if( Typical_Price <= 97.6329 )
							ret := 0.029821
						if( Typical_Price > 97.6329 )
							ret := -0.054058
			if( Negative_Money_Flow_Sum > 6.15101e+09 )
				if( Positive_Money_Flow <= 3.60142e+06 )
					if( Typical_Price <= 122.181 )
						if( Raw_Money_Flow <= 8.57609e+08 )
							ret := 0.500000
						if( Raw_Money_Flow > 8.57609e+08 )
							ret := -0.312500
					if( Typical_Price > 122.181 )
						if( Typical_Price <= 166.182 )
							ret := 0.812500 // buy
						if( Typical_Price > 166.182 )
							ret := 0.375000
				if( Positive_Money_Flow > 3.60142e+06 )
					if( Positive_Money_Flow <= 1.10956e+07 )
						if( Money_Flow_Ratio <= 0.274757 )
							ret := 0.428571
						if( Money_Flow_Ratio > 0.274757 )
							ret := -0.714286 // sell
					if( Positive_Money_Flow > 1.10956e+07 )
						if( MFI_High <= -58.4456 )
							ret := 0.909091 // buy
						if( MFI_High > -58.4456 )
							ret := 0.218750
		if( Negative_Money_Flow_Sum > 6.49985e+09 )
			if( Positive_Money_Flow <= 5073.48 )
				if( ad <= -1.83432e+06 )
					if( MFI_High <= -45.8314 )
						if( Typical_Price <= 108.175 )
							ret := 0.028571
						if( Typical_Price > 108.175 )
							ret := -0.448276
					if( MFI_High > -45.8314 )
						if( Raw_Money_Flow <= 1.65073e+09 )
							ret := 0.090909
						if( Raw_Money_Flow > 1.65073e+09 )
							ret := 0.823529 // buy
				if( ad > -1.83432e+06 )
					if( ad_mf <= -76702.5 )
						if( Negative_Money_Flow <= 1.24881e+09 )
							ret := 0.495935
						if( Negative_Money_Flow > 1.24881e+09 )
							ret := -0.285714
					if( ad_mf > -76702.5 )
						if( Positive_Money_Flow_Sum <= 3.49217e+09 )
							ret := 0.092838
						if( Positive_Money_Flow_Sum > 3.49217e+09 )
							ret := -0.261307
			if( Positive_Money_Flow > 5073.48 )
				if( Positive_Money_Flow <= 2.69499e+07 )
					if( ad <= -172760 )
						if( Negative_Money_Flow_Sum <= 1.19875e+10 )
							ret := 0.900000 // buy
						if( Negative_Money_Flow_Sum > 1.19875e+10 )
							ret := -0.666667
					if( ad > -172760 )
						if( Positive_Money_Flow_Sum <= 2.15284e+09 )
							ret := -0.705882 // sell
						if( Positive_Money_Flow_Sum > 2.15284e+09 )
							ret := -0.339623
				if( Positive_Money_Flow > 2.69499e+07 )
					if( Negative_Money_Flow_Sum <= 7.16156e+09 )
						if( ad <= -1.49108e+06 )
							ret := 0.368421
						if( ad > -1.49108e+06 )
							ret := -0.634409
					if( Negative_Money_Flow_Sum > 7.16156e+09 )
						if( Negative_Money_Flow_Sum <= 1.28724e+10 )
							ret := 0.155738
						if( Negative_Money_Flow_Sum > 1.28724e+10 )
							ret := -0.718750 // sell
	
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
float op_operation = decision_tree_0_AMD_1Hour_a3a09e08(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


