//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: U_30Min_2MV0_9e94d422 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_30Min_2MV0_9e94d422", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_30Min_9e94d422(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 5.87939e+06 )
		if( Positive_Money_Flow <= 945015 )
			if( VIP_VIM <= -0.366537 )
				if( Negative_Money_Flow_Sum <= 3.11133e+06 )
					if( VIM <= 1.2011 )
						if( VIP_VIM <= -0.393791 )
							ret := 0.680000
						if( VIP_VIM > -0.393791 )
							ret := -0.555556
					if( VIM > 1.2011 )
						if( Money_Flow_Ratio <= 0.10976 )
							ret := 0.260870
						if( Money_Flow_Ratio > 0.10976 )
							ret := -0.578947
				if( Negative_Money_Flow_Sum > 3.11133e+06 )
					if( MFI_Low <= 13.5542 )
						if( Negative_Money_Flow_Sum <= 3.73938e+06 )
							ret := 0.644068
						if( Negative_Money_Flow_Sum > 3.73938e+06 )
							ret := -0.034483
					if( MFI_Low > 13.5542 )
						if( VIP <= 0.818534 )
							ret := -0.894737 // sell
						if( VIP > 0.818534 )
							ret := -0.250000
			if( VIP_VIM > -0.366537 )
				if( Positive_Money_Flow <= 151.905 )
					if( Positive_Money_Flow_Sum <= 590774 )
						if( Positive_Money_Flow_Sum <= 183918 )
							ret := -0.724138 // sell
						if( Positive_Money_Flow_Sum > 183918 )
							ret := 0.214286
					if( Positive_Money_Flow_Sum > 590774 )
						if( Positive_Money_Flow_Sum <= 1.35275e+06 )
							ret := -0.311140
						if( Positive_Money_Flow_Sum > 1.35275e+06 )
							ret := -0.032440
				if( Positive_Money_Flow > 151.905 )
					if( VIP <= 0.883924 )
						if( Positive_Money_Flow_Sum <= 1.03313e+06 )
							ret := 0.761905 // buy
						if( Positive_Money_Flow_Sum > 1.03313e+06 )
							ret := -0.021739
					if( VIP > 0.883924 )
						if( Raw_Money_Flow <= 352776 )
							ret := -0.189117
						if( Raw_Money_Flow > 352776 )
							ret := -0.340156
		if( Positive_Money_Flow > 945015 )
			if( Typical_Price <= 41.7428 )
				if( VIP <= 0.981392 )
					if( Positive_Money_Flow_Sum <= 7.56118e+07 )
						if( Positive_Money_Flow_Sum <= 2.86951e+06 )
							ret := -0.250000
						if( Positive_Money_Flow_Sum > 2.86951e+06 )
							ret := 0.616071
					if( Positive_Money_Flow_Sum > 7.56118e+07 )
						if( VIP_VIM <= -0.08801 )
							ret := -0.833333 // sell
						if( VIP_VIM > -0.08801 )
							ret := 0.000000
				if( VIP > 0.981392 )
					if( Negative_Money_Flow_Sum <= 2.78618e+06 )
						if( VIM <= 0.933607 )
							ret := 0.174667
						if( VIM > 0.933607 )
							ret := -0.272727
					if( Negative_Money_Flow_Sum > 2.78618e+06 )
						if( Positive_Money_Flow <= 2.6653e+07 )
							ret := 0.011236
						if( Positive_Money_Flow > 2.6653e+07 )
							ret := -0.605634
			if( Typical_Price > 41.7428 )
				if( Positive_Money_Flow <= 3.82972e+07 )
					if( Raw_Money_Flow <= 3.32574e+07 )
						if( VIM <= 0.755511 )
							ret := -0.402597
						if( VIM > 0.755511 )
							ret := -0.001669
					if( Raw_Money_Flow > 3.32574e+07 )
						if( Money_Flow_Ratio <= 37.2545 )
							ret := -0.142857
						if( Money_Flow_Ratio > 37.2545 )
							ret := 0.779412 // buy
				if( Positive_Money_Flow > 3.82972e+07 )
					if( Negative_Money_Flow_Sum <= 1.07413e+06 )
						if( Positive_Money_Flow <= 4.85877e+07 )
							ret := -0.388889
						if( Positive_Money_Flow > 4.85877e+07 )
							ret := 0.508197
					if( Negative_Money_Flow_Sum > 1.07413e+06 )
						if( VIP <= 0.86522 )
							ret := 0.500000
						if( VIP > 0.86522 )
							ret := -0.408108
	if( Negative_Money_Flow_Sum > 5.87939e+06 )
		if( MFI <= 86.2494 )
			if( Negative_Money_Flow <= 1437 )
				if( Money_Flow_Ratio <= 3.07327 )
					if( MFI_High <= -26.2608 )
						if( Positive_Money_Flow <= 2.44055e+07 )
							ret := -0.080350
						if( Positive_Money_Flow > 2.44055e+07 )
							ret := 0.102877
					if( MFI_High > -26.2608 )
						if( Raw_Money_Flow <= 8.51659e+06 )
							ret := -0.008502
						if( Raw_Money_Flow > 8.51659e+06 )
							ret := 0.137360
				if( Money_Flow_Ratio > 3.07327 )
					if( Positive_Money_Flow_Sum <= 7.14997e+07 )
						if( Negative_Money_Flow_Sum <= 1.98908e+07 )
							ret := -0.041667
						if( Negative_Money_Flow_Sum > 1.98908e+07 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 7.14997e+07 )
						if( VIP <= 1.30084 )
							ret := -0.249553
						if( VIP > 1.30084 )
							ret := -0.064286
			if( Negative_Money_Flow > 1437 )
				if( Raw_Money_Flow <= 5.82439e+07 )
					if( Positive_Money_Flow_Sum <= 2.61685e+08 )
						if( Raw_Money_Flow <= 1.08043e+07 )
							ret := 0.090532
						if( Raw_Money_Flow > 1.08043e+07 )
							ret := 0.000860
					if( Positive_Money_Flow_Sum > 2.61685e+08 )
						if( Negative_Money_Flow <= 2.35637e+07 )
							ret := 0.127586
						if( Negative_Money_Flow > 2.35637e+07 )
							ret := 0.463277
				if( Raw_Money_Flow > 5.82439e+07 )
					if( VIP <= 1.2981 )
						if( Positive_Money_Flow <= 1.8583e+07 )
							ret := -0.174374
						if( Positive_Money_Flow > 1.8583e+07 )
							ret := -0.937500 // sell
					if( VIP > 1.2981 )
						if( Negative_Money_Flow <= 8.29907e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 8.29907e+07 )
							ret := 0.400000
		if( MFI > 86.2494 )
			if( Positive_Money_Flow <= 2.90318e+07 )
				if( Negative_Money_Flow_Sum <= 7.40945e+06 )
					if( Negative_Money_Flow <= 41817 )
						if( Typical_Price <= 28.065 )
							ret := -0.058824
						if( Typical_Price > 28.065 )
							ret := 0.421053
					if( Negative_Money_Flow > 41817 )
						if( VIP <= 1.26585 )
							ret := -0.333333
						if( VIP > 1.26585 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 7.40945e+06 )
					if( Positive_Money_Flow_Sum <= 3.29613e+08 )
						if( Positive_Money_Flow_Sum <= 9.31565e+07 )
							ret := 0.135714
						if( Positive_Money_Flow_Sum > 9.31565e+07 )
							ret := 0.460587
					if( Positive_Money_Flow_Sum > 3.29613e+08 )
						if( Negative_Money_Flow <= 9740.52 )
							ret := -0.282609
						if( Negative_Money_Flow > 9740.52 )
							ret := 0.322981
			if( Positive_Money_Flow > 2.90318e+07 )
				if( VIM <= 0.58759 )
					if( Positive_Money_Flow_Sum <= 3.54906e+08 )
						ret := 0.000000
					if( Positive_Money_Flow_Sum > 3.54906e+08 )
						if( Money_Flow_Ratio <= 44.823 )
							ret := 0.636364
						if( Money_Flow_Ratio > 44.823 )
							ret := 1.000000 // buy
				if( VIM > 0.58759 )
					if( Typical_Price <= 36.9138 )
						if( Positive_Money_Flow <= 9.88138e+07 )
							ret := 0.074074
						if( Positive_Money_Flow > 9.88138e+07 )
							ret := 0.965517 // buy
					if( Typical_Price > 36.9138 )
						if( Positive_Money_Flow_Sum <= 7.04217e+08 )
							ret := -0.168067
						if( Positive_Money_Flow_Sum > 7.04217e+08 )
							ret := -0.933333 // sell
	
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
float op_operation = decision_tree_0_U_30Min_9e94d422(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)

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


