//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: ABNB_15Min_2MV0_b6926cdc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_15Min_2MV0_b6926cdc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_15Min_b6926cdc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Typical_Price <= 120.642 )
		if( Negative_Money_Flow_Sum <= 1.2704e+08 )
			if( Positive_Money_Flow <= 852911 )
				if( Negative_Money_Flow <= 122.181 )
					if( VIM <= 1.01879 )
						if( Negative_Money_Flow_Sum <= 1.66195e+07 )
							ret := 0.350000
						if( Negative_Money_Flow_Sum > 1.66195e+07 )
							ret := -0.075829
					if( VIM > 1.01879 )
						if( Positive_Money_Flow <= 205943 )
							ret := -0.086957
						if( Positive_Money_Flow > 205943 )
							ret := -0.323181
				if( Negative_Money_Flow > 122.181 )
					if( Typical_Price <= 104.528 )
						if( Negative_Money_Flow_Sum <= 809099 )
							ret := 0.352657
						if( Negative_Money_Flow_Sum > 809099 )
							ret := -0.033079
					if( Typical_Price > 104.528 )
						if( VIP_VIM <= -0.217754 )
							ret := 0.246177
						if( VIP_VIM > -0.217754 )
							ret := 0.111923
			if( Positive_Money_Flow > 852911 )
				if( Raw_Money_Flow <= 4.57351e+07 )
					if( Negative_Money_Flow <= 6597.82 )
						if( Negative_Money_Flow_Sum <= 1.16124e+08 )
							ret := 0.169362
						if( Negative_Money_Flow_Sum > 1.16124e+08 )
							ret := 0.467742
					if( Negative_Money_Flow > 6597.82 )
						if( VIP_VIM <= 0.404454 )
							ret := 1.000000 // buy
						if( VIP_VIM > 0.404454 )
							ret := 0.000000
				if( Raw_Money_Flow > 4.57351e+07 )
					if( Positive_Money_Flow_Sum <= 5.13192e+07 )
						if( Positive_Money_Flow_Sum <= 4.95225e+07 )
							ret := -0.142857
						if( Positive_Money_Flow_Sum > 4.95225e+07 )
							ret := -0.916667 // sell
					if( Positive_Money_Flow_Sum > 5.13192e+07 )
						if( VIP_VIM <= 0.631164 )
							ret := 0.185606
						if( VIP_VIM > 0.631164 )
							ret := -0.600000
		if( Negative_Money_Flow_Sum > 1.2704e+08 )
			if( Positive_Money_Flow_Sum <= 1.47551e+08 )
				if( VIP <= 0.647683 )
					if( Negative_Money_Flow_Sum <= 4.12364e+08 )
						if( Negative_Money_Flow_Sum <= 2.05115e+08 )
							ret := 0.178571
						if( Negative_Money_Flow_Sum > 2.05115e+08 )
							ret := 0.629630
					if( Negative_Money_Flow_Sum > 4.12364e+08 )
						if( Negative_Money_Flow_Sum <= 5.64695e+08 )
							ret := -0.076923
						if( Negative_Money_Flow_Sum > 5.64695e+08 )
							ret := -0.700000 // sell
				if( VIP > 0.647683 )
					if( Raw_Money_Flow <= 4.00584e+07 )
						if( Negative_Money_Flow <= 1.33262e+07 )
							ret := 0.013288
						if( Negative_Money_Flow > 1.33262e+07 )
							ret := -0.154731
					if( Raw_Money_Flow > 4.00584e+07 )
						if( Raw_Money_Flow <= 4.50251e+07 )
							ret := 0.777778 // buy
						if( Raw_Money_Flow > 4.50251e+07 )
							ret := 0.116279
			if( Positive_Money_Flow_Sum > 1.47551e+08 )
				if( Positive_Money_Flow_Sum <= 7.02774e+08 )
					if( Positive_Money_Flow_Sum <= 1.61505e+08 )
						if( VIP_VIM <= -0.253854 )
							ret := -0.860759 // sell
						if( VIP_VIM > -0.253854 )
							ret := -0.343511
					if( Positive_Money_Flow_Sum > 1.61505e+08 )
						if( Positive_Money_Flow_Sum <= 4.18187e+08 )
							ret := -0.051173
						if( Positive_Money_Flow_Sum > 4.18187e+08 )
							ret := -0.601351
				if( Positive_Money_Flow_Sum > 7.02774e+08 )
					if( Negative_Money_Flow <= 6.38218e+07 )
						if( MFI_Low <= 47.5792 )
							ret := 0.636364
						if( MFI_Low > 47.5792 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow > 6.38218e+07 )
						ret := 0.153846
	if( Typical_Price > 120.642 )
		if( MFI_Low <= 11.6719 )
			if( Negative_Money_Flow_Sum <= 6.21649e+08 )
				if( Raw_Money_Flow <= 1.07781e+07 )
					if( Positive_Money_Flow_Sum <= 341455 )
						if( Money_Flow_Ratio <= 0.181578 )
							ret := -0.346341
						if( Money_Flow_Ratio > 0.181578 )
							ret := 0.257576
					if( Positive_Money_Flow_Sum > 341455 )
						if( Positive_Money_Flow <= 26597 )
							ret := 0.192695
						if( Positive_Money_Flow > 26597 )
							ret := 0.058845
				if( Raw_Money_Flow > 1.07781e+07 )
					if( Raw_Money_Flow <= 1.68393e+08 )
						if( Negative_Money_Flow <= 1.05488e+08 )
							ret := -0.074089
						if( Negative_Money_Flow > 1.05488e+08 )
							ret := 0.316406
					if( Raw_Money_Flow > 1.68393e+08 )
						if( Negative_Money_Flow_Sum <= 5.56965e+08 )
							ret := -0.700000 // sell
						if( Negative_Money_Flow_Sum > 5.56965e+08 )
							ret := 0.333333
			if( Negative_Money_Flow_Sum > 6.21649e+08 )
				if( Raw_Money_Flow <= 4.20082e+06 )
					if( VIP_VIM <= 0.130839 )
						if( Negative_Money_Flow_Sum <= 6.99982e+08 )
							ret := 0.080000
						if( Negative_Money_Flow_Sum > 6.99982e+08 )
							ret := -0.508475
					if( VIP_VIM > 0.130839 )
						ret := 0.625000
				if( Raw_Money_Flow > 4.20082e+06 )
					if( Positive_Money_Flow <= 8.39173e+07 )
						if( Typical_Price <= 139.472 )
							ret := 0.166667
						if( Typical_Price > 139.472 )
							ret := 0.654545
					if( Positive_Money_Flow > 8.39173e+07 )
						if( MFI_Low <= -2.16684 )
							ret := 0.090909
						if( MFI_Low > -2.16684 )
							ret := -0.962963 // sell
		if( MFI_Low > 11.6719 )
			if( Typical_Price <= 181.647 )
				if( VIM <= 0.627819 )
					if( VIP <= 1.49443 )
						if( Positive_Money_Flow <= 3.94954e+07 )
							ret := 0.558952
						if( Positive_Money_Flow > 3.94954e+07 )
							ret := 0.082418
					if( VIP > 1.49443 )
						if( Positive_Money_Flow_Sum <= 7.73039e+06 )
							ret := -0.777778 // sell
						if( Positive_Money_Flow_Sum > 7.73039e+06 )
							ret := 0.031579
				if( VIM > 0.627819 )
					if( Raw_Money_Flow <= 3.52554e+07 )
						if( Negative_Money_Flow_Sum <= 9.56393e+07 )
							ret := -0.013081
						if( Negative_Money_Flow_Sum > 9.56393e+07 )
							ret := -0.098680
					if( Raw_Money_Flow > 3.52554e+07 )
						if( Money_Flow_Ratio <= 57.9805 )
							ret := 0.075701
						if( Money_Flow_Ratio > 57.9805 )
							ret := -0.239224
			if( Typical_Price > 181.647 )
				if( Negative_Money_Flow_Sum <= 3.0136e+08 )
					if( Negative_Money_Flow_Sum <= 2.50699e+08 )
						if( Raw_Money_Flow <= 867493 )
							ret := 0.040909
						if( Raw_Money_Flow > 867493 )
							ret := -0.215418
					if( Negative_Money_Flow_Sum > 2.50699e+08 )
						if( Money_Flow_Ratio <= 1.08106 )
							ret := 0.160920
						if( Money_Flow_Ratio > 1.08106 )
							ret := 0.684932
				if( Negative_Money_Flow_Sum > 3.0136e+08 )
					if( VIP_VIM <= 0.406059 )
						if( Negative_Money_Flow_Sum <= 5.56141e+08 )
							ret := -0.647815
						if( Negative_Money_Flow_Sum > 5.56141e+08 )
							ret := -0.118421
					if( VIP_VIM > 0.406059 )
						if( Negative_Money_Flow <= 7.03437e+07 )
							ret := -0.076923
						if( Negative_Money_Flow > 7.03437e+07 )
							ret := 0.894737 // buy
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_ABNB_15Min_b6926cdc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


