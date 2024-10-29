//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: SPOT_5Min_2CM0_52d1ea42 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_5Min_2CM0_52d1ea42", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_5Min_52d1ea42(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad <= 7278.48 )
		if( Positive_Money_Flow_Sum <= 1.34143e+07 )
			if( Negative_Money_Flow_Sum <= 1.92238e+08 )
				if( mf <= 0.037595 )
					if( Positive_Money_Flow_Sum <= 1.1065e+07 )
						if( Negative_Money_Flow_Sum <= 308197 )
							ret := 0.675926
						if( Negative_Money_Flow_Sum > 308197 )
							ret := -0.011591
					if( Positive_Money_Flow_Sum > 1.1065e+07 )
						if( Raw_Money_Flow <= 350859 )
							ret := 0.612069
						if( Raw_Money_Flow > 350859 )
							ret := 0.121115
				if( mf > 0.037595 )
					if( Negative_Money_Flow_Sum <= 252016 )
						if( Raw_Money_Flow <= 136870 )
							ret := -0.891892 // sell
						if( Raw_Money_Flow > 136870 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 252016 )
						if( Negative_Money_Flow_Sum <= 6.6735e+07 )
							ret := 0.144305
						if( Negative_Money_Flow_Sum > 6.6735e+07 )
							ret := 0.864865 // buy
			if( Negative_Money_Flow_Sum > 1.92238e+08 )
				if( Negative_Money_Flow_Sum <= 2.3132e+08 )
					if( Negative_Money_Flow_Sum <= 2.02375e+08 )
						ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.02375e+08 )
						ret := 0.833333 // buy
				if( Negative_Money_Flow_Sum > 2.3132e+08 )
					if( Negative_Money_Flow_Sum <= 3.69853e+08 )
						ret := 0.181818
					if( Negative_Money_Flow_Sum > 3.69853e+08 )
						ret := 1.000000 // buy
		if( Positive_Money_Flow_Sum > 1.34143e+07 )
			if( Money_Flow_Ratio <= 1.57283 )
				if( Raw_Money_Flow <= 2.96629e+07 )
					if( Positive_Money_Flow_Sum <= 1.10888e+08 )
						if( Negative_Money_Flow_Sum <= 5.02756e+07 )
							ret := -0.059130
						if( Negative_Money_Flow_Sum > 5.02756e+07 )
							ret := 0.049881
					if( Positive_Money_Flow_Sum > 1.10888e+08 )
						if( Positive_Money_Flow_Sum <= 1.35034e+08 )
							ret := -0.648148
						if( Positive_Money_Flow_Sum > 1.35034e+08 )
							ret := 0.102459
				if( Raw_Money_Flow > 2.96629e+07 )
					if( Positive_Money_Flow_Sum <= 5.25194e+07 )
						if( Negative_Money_Flow <= 3.82435e+07 )
							ret := 0.750000 // buy
						if( Negative_Money_Flow > 3.82435e+07 )
							ret := 0.262500
					if( Positive_Money_Flow_Sum > 5.25194e+07 )
						if( Typical_Price <= 290.565 )
							ret := -0.518987
						if( Typical_Price > 290.565 )
							ret := 0.275000
			if( Money_Flow_Ratio > 1.57283 )
				if( MFI_High <= -7.48483 )
					if( Raw_Money_Flow <= 3.58163e+07 )
						if( Negative_Money_Flow_Sum <= 3.08113e+07 )
							ret := 0.083549
						if( Negative_Money_Flow_Sum > 3.08113e+07 )
							ret := 0.246401
					if( Raw_Money_Flow > 3.58163e+07 )
						if( MFI_High <= -7.74196 )
							ret := 0.965517 // buy
						if( MFI_High > -7.74196 )
							ret := 0.000000
				if( MFI_High > -7.48483 )
					if( ad_mf <= -71088.2 )
						if( Positive_Money_Flow_Sum <= 8.41054e+07 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 8.41054e+07 )
							ret := -0.758065 // sell
					if( ad_mf > -71088.2 )
						if( Positive_Money_Flow_Sum <= 2.83982e+08 )
							ret := 0.014534
						if( Positive_Money_Flow_Sum > 2.83982e+08 )
							ret := -0.578947
	if( ad > 7278.48 )
		if( MFI <= 74.2586 )
			if( Positive_Money_Flow_Sum <= 1.07088e+08 )
				if( Raw_Money_Flow <= 2.79924e+07 )
					if( Positive_Money_Flow_Sum <= 7.19999e+07 )
						if( Negative_Money_Flow_Sum <= 5.63489e+06 )
							ret := 0.382353
						if( Negative_Money_Flow_Sum > 5.63489e+06 )
							ret := -0.053243
					if( Positive_Money_Flow_Sum > 7.19999e+07 )
						if( ad_mf <= 35376.2 )
							ret := 0.074866
						if( ad_mf > 35376.2 )
							ret := 0.722892 // buy
				if( Raw_Money_Flow > 2.79924e+07 )
					if( Negative_Money_Flow_Sum <= 1.49807e+08 )
						if( Money_Flow_Ratio <= 0.969513 )
							ret := -0.705882 // sell
						if( Money_Flow_Ratio > 0.969513 )
							ret := -0.077778
					if( Negative_Money_Flow_Sum > 1.49807e+08 )
						if( MFI_Low <= -7.09768 )
							ret := -0.333333
						if( MFI_Low > -7.09768 )
							ret := 0.941176 // buy
			if( Positive_Money_Flow_Sum > 1.07088e+08 )
				if( Positive_Money_Flow <= 9.816e+06 )
					if( Positive_Money_Flow_Sum <= 1.24343e+08 )
						if( MFI <= 68.0174 )
							ret := -0.593023
						if( MFI > 68.0174 )
							ret := 0.454545
					if( Positive_Money_Flow_Sum > 1.24343e+08 )
						if( MFI_Low <= 38.091 )
							ret := -0.324324
						if( MFI_Low > 38.091 )
							ret := 0.462264
				if( Positive_Money_Flow > 9.816e+06 )
					if( Negative_Money_Flow <= 1.19839e+07 )
						if( mf <= 0.008629 )
							ret := -0.776471 // sell
						if( mf > 0.008629 )
							ret := -0.374429
					if( Negative_Money_Flow > 1.19839e+07 )
						ret := 1.000000 // buy
		if( MFI > 74.2586 )
			if( Positive_Money_Flow_Sum <= 4.1267e+07 )
				if( ad_mf <= 16698.3 )
					if( MFI_Low <= 75.0577 )
						if( Money_Flow_Ratio <= 3.11024 )
							ret := -0.493151
						if( Money_Flow_Ratio > 3.11024 )
							ret := -0.089404
					if( MFI_Low > 75.0577 )
						if( Positive_Money_Flow_Sum <= 1.64667e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.64667e+07 )
							ret := 0.862069 // buy
				if( ad_mf > 16698.3 )
					if( Negative_Money_Flow_Sum <= 498086 )
						if( Positive_Money_Flow_Sum <= 3.60398e+07 )
							ret := -0.888889 // sell
						if( Positive_Money_Flow_Sum > 3.60398e+07 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 498086 )
						if( MFI <= 78.1835 )
							ret := -0.102041
						if( MFI > 78.1835 )
							ret := 0.591954
			if( Positive_Money_Flow_Sum > 4.1267e+07 )
				if( Negative_Money_Flow_Sum <= 563547 )
					if( mf <= 0.25329 )
						ret := -0.818182 // sell
					if( mf > 0.25329 )
						if( Positive_Money_Flow_Sum <= 9.0373e+07 )
							ret := 0.969697 // buy
						if( Positive_Money_Flow_Sum > 9.0373e+07 )
							ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 563547 )
					if( Negative_Money_Flow_Sum <= 1.02242e+07 )
						if( Negative_Money_Flow_Sum <= 2.13114e+06 )
							ret := -0.196970
						if( Negative_Money_Flow_Sum > 2.13114e+06 )
							ret := -0.678445
					if( Negative_Money_Flow_Sum > 1.02242e+07 )
						if( Typical_Price <= 153.461 )
							ret := 0.223881
						if( Typical_Price > 153.461 )
							ret := -0.321381
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_SPOT_5Min_52d1ea42(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


