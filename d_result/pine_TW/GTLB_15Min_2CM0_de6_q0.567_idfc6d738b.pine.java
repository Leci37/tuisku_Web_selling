//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: GTLB_15Min_2CM0_fc6d738b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_15Min_2CM0_fc6d738b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_15Min_fc6d738b(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Typical_Price <= 53.2066 )
		if( Raw_Money_Flow <= 5.5275e+06 )
			if( MFI <= 79.343 )
				if( Negative_Money_Flow_Sum <= 6.66412e+06 )
					if( Negative_Money_Flow_Sum <= 706498 )
						if( Negative_Money_Flow_Sum <= 494524 )
							ret := 0.034722
						if( Negative_Money_Flow_Sum > 494524 )
							ret := -0.662791
					if( Negative_Money_Flow_Sum > 706498 )
						if( Negative_Money_Flow_Sum <= 2.59334e+06 )
							ret := 0.504274
						if( Negative_Money_Flow_Sum > 2.59334e+06 )
							ret := 0.162672
				if( Negative_Money_Flow_Sum > 6.66412e+06 )
					if( Negative_Money_Flow_Sum <= 8.53431e+06 )
						if( Raw_Money_Flow <= 3.32327e+06 )
							ret := -0.163909
						if( Raw_Money_Flow > 3.32327e+06 )
							ret := 0.347826
					if( Negative_Money_Flow_Sum > 8.53431e+06 )
						if( Positive_Money_Flow_Sum <= 2.62919e+07 )
							ret := 0.031777
						if( Positive_Money_Flow_Sum > 2.62919e+07 )
							ret := 0.138110
			if( MFI > 79.343 )
				if( Positive_Money_Flow_Sum <= 1.2722e+08 )
					if( Positive_Money_Flow <= 1483.94 )
						if( Raw_Money_Flow <= 3.1967e+06 )
							ret := 0.109501
						if( Raw_Money_Flow > 3.1967e+06 )
							ret := -0.780488 // sell
					if( Positive_Money_Flow > 1483.94 )
						if( Negative_Money_Flow_Sum <= 3.22709e+06 )
							ret := -0.108527
						if( Negative_Money_Flow_Sum > 3.22709e+06 )
							ret := -0.394330
				if( Positive_Money_Flow_Sum > 1.2722e+08 )
					if( Negative_Money_Flow_Sum <= 1.02526e+07 )
						ret := -0.357143
					if( Negative_Money_Flow_Sum > 1.02526e+07 )
						if( Typical_Price <= 38.8421 )
							ret := 0.000000
						if( Typical_Price > 38.8421 )
							ret := 0.918919 // buy
		if( Raw_Money_Flow > 5.5275e+06 )
			if( mf <= -0.242328 )
				if( Positive_Money_Flow_Sum <= 1.59177e+07 )
					if( ad <= 100014 )
						if( Positive_Money_Flow_Sum <= 175661 )
							ret := -0.153846
						if( Positive_Money_Flow_Sum > 175661 )
							ret := 0.764151 // buy
					if( ad > 100014 )
						ret := -0.333333
				if( Positive_Money_Flow_Sum > 1.59177e+07 )
					if( Negative_Money_Flow <= 7.19898e+06 )
						if( Typical_Price <= 49.8669 )
							ret := 0.688679
						if( Typical_Price > 49.8669 )
							ret := -0.571429
					if( Negative_Money_Flow > 7.19898e+06 )
						if( mf <= -0.366361 )
							ret := 0.500000
						if( mf > -0.366361 )
							ret := -0.351351
			if( mf > -0.242328 )
				if( Negative_Money_Flow <= 1.15115e+07 )
					if( ad_mf <= 90355.2 )
						if( Positive_Money_Flow_Sum <= 1.27846e+08 )
							ret := 0.148686
						if( Positive_Money_Flow_Sum > 1.27846e+08 )
							ret := 0.640449
					if( ad_mf > 90355.2 )
						if( Positive_Money_Flow <= 7.84684e+06 )
							ret := -0.217899
						if( Positive_Money_Flow > 7.84684e+06 )
							ret := 0.140704
				if( Negative_Money_Flow > 1.15115e+07 )
					if( Money_Flow_Ratio <= 0.242322 )
						if( Raw_Money_Flow <= 1.27675e+07 )
							ret := 0.000000
						if( Raw_Money_Flow > 1.27675e+07 )
							ret := 0.807692 // buy
					if( Money_Flow_Ratio > 0.242322 )
						if( Money_Flow_Ratio <= 1.62314 )
							ret := -0.165605
						if( Money_Flow_Ratio > 1.62314 )
							ret := -0.711111 // sell
	if( Typical_Price > 53.2066 )
		if( Positive_Money_Flow <= 556046 )
			if( Positive_Money_Flow <= 76.2689 )
				if( Negative_Money_Flow_Sum <= 1.70736e+07 )
					if( MFI <= 92.4672 )
						if( Raw_Money_Flow <= 32473.9 )
							ret := 0.174074
						if( Raw_Money_Flow > 32473.9 )
							ret := -0.182498
					if( MFI > 92.4672 )
						if( Positive_Money_Flow_Sum <= 3.84942e+07 )
							ret := -0.423077
						if( Positive_Money_Flow_Sum > 3.84942e+07 )
							ret := 0.597222
				if( Negative_Money_Flow_Sum > 1.70736e+07 )
					if( Negative_Money_Flow <= 44415.5 )
						if( MFI_Low <= 21.4792 )
							ret := 0.079498
						if( MFI_Low > 21.4792 )
							ret := 0.470588
					if( Negative_Money_Flow > 44415.5 )
						if( Typical_Price <= 57.9966 )
							ret := 0.104148
						if( Typical_Price > 57.9966 )
							ret := -0.038744
			if( Positive_Money_Flow > 76.2689 )
				if( Positive_Money_Flow_Sum <= 4.12086e+06 )
					if( Negative_Money_Flow <= 69998.7 )
						if( Positive_Money_Flow_Sum <= 792457 )
							ret := -0.171053
						if( Positive_Money_Flow_Sum > 792457 )
							ret := 0.357143
					if( Negative_Money_Flow > 69998.7 )
						if( ad <= -9751.68 )
							ret := 0.500000
						if( ad > -9751.68 )
							ret := -0.826087 // sell
				if( Positive_Money_Flow_Sum > 4.12086e+06 )
					if( Positive_Money_Flow <= 30502.6 )
						if( Money_Flow_Ratio <= 0.613243 )
							ret := -0.660326
						if( Money_Flow_Ratio > 0.613243 )
							ret := -0.310976
					if( Positive_Money_Flow > 30502.6 )
						if( Negative_Money_Flow_Sum <= 5.57637e+06 )
							ret := -0.504950
						if( Negative_Money_Flow_Sum > 5.57637e+06 )
							ret := -0.140878
		if( Positive_Money_Flow > 556046 )
			if( ad_mf <= 25496 )
				if( Raw_Money_Flow <= 1.05884e+07 )
					if( Positive_Money_Flow_Sum <= 3.95893e+07 )
						if( Raw_Money_Flow <= 5.58691e+06 )
							ret := 0.017314
						if( Raw_Money_Flow > 5.58691e+06 )
							ret := 0.297030
					if( Positive_Money_Flow_Sum > 3.95893e+07 )
						if( Positive_Money_Flow_Sum <= 4.12133e+07 )
							ret := 0.897436 // buy
						if( Positive_Money_Flow_Sum > 4.12133e+07 )
							ret := 0.216216
				if( Raw_Money_Flow > 1.05884e+07 )
					if( Negative_Money_Flow_Sum <= 2.11105e+08 )
						if( Raw_Money_Flow <= 1.16367e+07 )
							ret := -0.766667 // sell
						if( Raw_Money_Flow > 1.16367e+07 )
							ret := -0.030000
					if( Negative_Money_Flow_Sum > 2.11105e+08 )
						if( Positive_Money_Flow <= 2.28187e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 2.28187e+07 )
							ret := 0.000000
			if( ad_mf > 25496 )
				if( Positive_Money_Flow_Sum <= 1.82042e+07 )
					if( Raw_Money_Flow <= 4.17417e+06 )
						if( Positive_Money_Flow <= 3.46132e+06 )
							ret := -0.190476
						if( Positive_Money_Flow > 3.46132e+06 )
							ret := 0.507937
					if( Raw_Money_Flow > 4.17417e+06 )
						if( ad <= 145750 )
							ret := -0.651064
						if( ad > 145750 )
							ret := 0.727273 // buy
				if( Positive_Money_Flow_Sum > 1.82042e+07 )
					if( Negative_Money_Flow_Sum <= 4.38056e+07 )
						if( Negative_Money_Flow_Sum <= 2.09995e+07 )
							ret := 0.072289
						if( Negative_Money_Flow_Sum > 2.09995e+07 )
							ret := -0.244565
					if( Negative_Money_Flow_Sum > 4.38056e+07 )
						if( Raw_Money_Flow <= 2.40942e+07 )
							ret := 0.263598
						if( Raw_Money_Flow > 2.40942e+07 )
							ret := -0.933333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GTLB_15Min_fc6d738b(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


