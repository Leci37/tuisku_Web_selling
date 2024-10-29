//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: RIVN_30Min_2MV0_b5b20dcc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_30Min_2MV0_b5b20dcc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_30Min_b5b20dcc(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 2.26438e+07 )
		if( VIP <= 0.879487 )
			if( Negative_Money_Flow_Sum <= 3.77109e+06 )
				if( VIM <= 0.938379 )
					if( Positive_Money_Flow_Sum <= 4.21767e+06 )
						if( Money_Flow_Ratio <= 3.04955 )
							ret := 0.869565 // buy
						if( Money_Flow_Ratio > 3.04955 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 4.21767e+06 )
						ret := -0.625000
				if( VIM > 0.938379 )
					if( Negative_Money_Flow <= 1.88129e+06 )
						if( MFI_Low <= -10.797 )
							ret := 0.875000 // buy
						if( MFI_Low > -10.797 )
							ret := -0.354680
					if( Negative_Money_Flow > 1.88129e+06 )
						ret := 0.800000 // buy
			if( Negative_Money_Flow_Sum > 3.77109e+06 )
				if( Typical_Price <= 15.3497 )
					if( VIP_VIM <= -0.370831 )
						if( MFI_Low <= 12.5718 )
							ret := 0.177570
						if( MFI_Low > 12.5718 )
							ret := -0.875000 // sell
					if( VIP_VIM > -0.370831 )
						if( VIP <= 0.835784 )
							ret := 0.735849 // buy
						if( VIP > 0.835784 )
							ret := 0.297710
				if( Typical_Price > 15.3497 )
					if( Money_Flow_Ratio <= 0.685162 )
						if( Typical_Price <= 17.294 )
							ret := -0.320158
						if( Typical_Price > 17.294 )
							ret := 0.007088
					if( Money_Flow_Ratio > 0.685162 )
						if( VIM <= 0.962388 )
							ret := -0.625000
						if( VIM > 0.962388 )
							ret := 0.617886
		if( VIP > 0.879487 )
			if( Typical_Price <= 31.4072 )
				if( Negative_Money_Flow <= 4.75572e+07 )
					if( Negative_Money_Flow <= 1.28215e+07 )
						if( Positive_Money_Flow_Sum <= 343648 )
							ret := 0.565217
						if( Positive_Money_Flow_Sum > 343648 )
							ret := -0.080028
					if( Negative_Money_Flow > 1.28215e+07 )
						if( VIP <= 0.915293 )
							ret := 0.785714 // buy
						if( VIP > 0.915293 )
							ret := 0.201923
				if( Negative_Money_Flow > 4.75572e+07 )
					if( Typical_Price <= 11.8706 )
						ret := 1.000000 // buy
					if( Typical_Price > 11.8706 )
						if( Raw_Money_Flow <= 1.23872e+08 )
							ret := -0.770115 // sell
						if( Raw_Money_Flow > 1.23872e+08 )
							ret := 0.117647
			if( Typical_Price > 31.4072 )
				if( Positive_Money_Flow_Sum <= 2.28903e+06 )
					if( Typical_Price <= 36.7015 )
						if( Negative_Money_Flow <= 831736 )
							ret := -0.164000
						if( Negative_Money_Flow > 831736 )
							ret := -0.728261 // sell
					if( Typical_Price > 36.7015 )
						if( MFI_High <= -78.6532 )
							ret := -0.292683
						if( MFI_High > -78.6532 )
							ret := 0.290640
				if( Positive_Money_Flow_Sum > 2.28903e+06 )
					if( VIM <= 0.821185 )
						if( VIP_VIM <= 0.499704 )
							ret := 0.223404
						if( VIP_VIM > 0.499704 )
							ret := -0.655172
					if( VIM > 0.821185 )
						if( Positive_Money_Flow <= 19437.8 )
							ret := -0.618947
						if( Positive_Money_Flow > 19437.8 )
							ret := -0.363636
	if( Positive_Money_Flow_Sum > 2.26438e+07 )
		if( Positive_Money_Flow_Sum <= 1.2362e+09 )
			if( Positive_Money_Flow_Sum <= 8.79669e+08 )
				if( Negative_Money_Flow <= 74.851 )
					if( Money_Flow_Ratio <= 103.827 )
						if( Negative_Money_Flow_Sum <= 1.50232e+08 )
							ret := -0.035648
						if( Negative_Money_Flow_Sum > 1.50232e+08 )
							ret := 0.048708
					if( Money_Flow_Ratio > 103.827 )
						if( Positive_Money_Flow <= 1.68952e+08 )
							ret := 0.264484
						if( Positive_Money_Flow > 1.68952e+08 )
							ret := -0.674419
				if( Negative_Money_Flow > 74.851 )
					if( Positive_Money_Flow_Sum <= 6.45283e+08 )
						if( Positive_Money_Flow_Sum <= 5.62122e+08 )
							ret := 0.057151
						if( Positive_Money_Flow_Sum > 5.62122e+08 )
							ret := -0.378109
					if( Positive_Money_Flow_Sum > 6.45283e+08 )
						if( Typical_Price <= 20.3762 )
							ret := -0.347826
						if( Typical_Price > 20.3762 )
							ret := 0.514019
			if( Positive_Money_Flow_Sum > 8.79669e+08 )
				if( VIP_VIM <= 0.371755 )
					if( VIM <= 1.17845 )
						if( Positive_Money_Flow_Sum <= 1.08119e+09 )
							ret := 0.431579
						if( Positive_Money_Flow_Sum > 1.08119e+09 )
							ret := -0.222222
					if( VIM > 1.17845 )
						if( Negative_Money_Flow <= 5.19303e+08 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 5.19303e+08 )
							ret := 0.000000
				if( VIP_VIM > 0.371755 )
					if( Raw_Money_Flow <= 2.42029e+07 )
						if( Money_Flow_Ratio <= 2.02291 )
							ret := -0.615385
						if( Money_Flow_Ratio > 2.02291 )
							ret := 0.148148
					if( Raw_Money_Flow > 2.42029e+07 )
						if( Positive_Money_Flow <= 5.53401e+08 )
							ret := -0.664122
						if( Positive_Money_Flow > 5.53401e+08 )
							ret := 1.000000 // buy
		if( Positive_Money_Flow_Sum > 1.2362e+09 )
			if( Negative_Money_Flow_Sum <= 5.35944e+08 )
				if( VIM <= 1.00985 )
					if( Negative_Money_Flow <= 35555.7 )
						if( Raw_Money_Flow <= 3.27984e+08 )
							ret := 0.312500
						if( Raw_Money_Flow > 3.27984e+08 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow > 35555.7 )
						if( Negative_Money_Flow_Sum <= 2.1508e+08 )
							ret := 0.615385
						if( Negative_Money_Flow_Sum > 2.1508e+08 )
							ret := 0.986486 // buy
				if( VIM > 1.00985 )
					ret := 0.285714
			if( Negative_Money_Flow_Sum > 5.35944e+08 )
				if( Negative_Money_Flow_Sum <= 2.82107e+09 )
					if( Negative_Money_Flow_Sum <= 1.925e+09 )
						if( Raw_Money_Flow <= 8.69031e+07 )
							ret := 0.406250
						if( Raw_Money_Flow > 8.69031e+07 )
							ret := -0.287671
					if( Negative_Money_Flow_Sum > 1.925e+09 )
						if( Typical_Price <= 64.7912 )
							ret := 0.833333 // buy
						if( Typical_Price > 64.7912 )
							ret := -0.753623 // sell
				if( Negative_Money_Flow_Sum > 2.82107e+09 )
					if( VIP_VIM <= -0.205935 )
						if( Positive_Money_Flow <= 2.02942e+07 )
							ret := 0.647059
						if( Positive_Money_Flow > 2.02942e+07 )
							ret := -0.470588
					if( VIP_VIM > -0.205935 )
						if( Typical_Price <= 173.857 )
							ret := 0.873418 // buy
						if( Typical_Price > 173.857 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_RIVN_30Min_b5b20dcc(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


