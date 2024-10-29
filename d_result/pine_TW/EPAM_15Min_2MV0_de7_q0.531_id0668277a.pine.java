//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: EPAM_15Min_2MV0_0668277a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2MV0_0668277a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_0668277a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 1.4832e+06 )
		if( VIM <= 0.647595 )
			if( VIP <= 1.28353 )
				if( MFI <= 42.0032 )
					ret := 0.555556
				if( MFI > 42.0032 )
					if( VIM <= 0.618858 )
						if( Positive_Money_Flow <= 7.17951e+06 )
							if( VIP_VIM <= 0.635975 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.635975 )
								ret := -0.166667
						if( Positive_Money_Flow > 7.17951e+06 )
							if( Positive_Money_Flow_Sum <= 8.24056e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8.24056e+07 )
								ret := -0.857143 // sell
					if( VIM > 0.618858 )
						if( Typical_Price <= 319.792 )
							ret := -0.500000
						if( Typical_Price > 319.792 )
							ret := 0.222222
			if( VIP > 1.28353 )
				if( Negative_Money_Flow_Sum <= 6.09688e+07 )
					if( Positive_Money_Flow_Sum <= 7.59842e+07 )
						if( Raw_Money_Flow <= 706041 )
							if( VIP <= 1.46282 )
								ret := -0.068966
							if( VIP > 1.46282 )
								ret := 0.285714
						if( Raw_Money_Flow > 706041 )
							if( Positive_Money_Flow_Sum <= 5.70654e+07 )
								ret := -0.121911
							if( Positive_Money_Flow_Sum > 5.70654e+07 )
								ret := -0.531646
					if( Positive_Money_Flow_Sum > 7.59842e+07 )
						if( VIM <= 0.575603 )
							if( Typical_Price <= 127.198 )
								ret := 0.777778 // buy
							if( Typical_Price > 127.198 )
								ret := -0.250000
						if( VIM > 0.575603 )
							if( Raw_Money_Flow <= 1.46232e+06 )
								ret := 0.928571 // buy
							if( Raw_Money_Flow > 1.46232e+06 )
								ret := 0.303704
				if( Negative_Money_Flow_Sum > 6.09688e+07 )
					if( VIP_VIM <= 0.789035 )
						ret := -0.272727
					if( VIP_VIM > 0.789035 )
						ret := -1.000000 // sell
		if( VIM > 0.647595 )
			if( Positive_Money_Flow_Sum <= 2.40592e+08 )
				if( Positive_Money_Flow_Sum <= 1.32386e+07 )
					if( Negative_Money_Flow_Sum <= 1.22091e+07 )
						if( Negative_Money_Flow_Sum <= 1.07174e+07 )
							if( Typical_Price <= 194.677 )
								ret := 0.046087
							if( Typical_Price > 194.677 )
								ret := -0.073171
						if( Negative_Money_Flow_Sum > 1.07174e+07 )
							if( Positive_Money_Flow <= 1.32938e+06 )
								ret := 0.117479
							if( Positive_Money_Flow > 1.32938e+06 )
								ret := 0.338164
					if( Negative_Money_Flow_Sum > 1.22091e+07 )
						if( VIP <= 1.07612 )
							if( Money_Flow_Ratio <= 0.064935 )
								ret := 0.292517
							if( Money_Flow_Ratio > 0.064935 )
								ret := -0.098231
						if( VIP > 1.07612 )
							if( Raw_Money_Flow <= 63894.2 )
								ret := 0.666667
							if( Raw_Money_Flow > 63894.2 )
								ret := 0.068401
				if( Positive_Money_Flow_Sum > 1.32386e+07 )
					if( MFI <= 14.9075 )
						if( Raw_Money_Flow <= 4.42493e+06 )
							if( Typical_Price <= 321.64 )
								ret := 0.733333 // buy
							if( Typical_Price > 321.64 )
								ret := 0.365854
						if( Raw_Money_Flow > 4.42493e+06 )
							if( VIM <= 1.48659 )
								ret := -0.431818
							if( VIM > 1.48659 )
								ret := 0.631579
					if( MFI > 14.9075 )
						if( Negative_Money_Flow_Sum <= 1.443e+08 )
							if( MFI_High <= -51.3818 )
								ret := 0.228819
							if( MFI_High > -51.3818 )
								ret := 0.052257
						if( Negative_Money_Flow_Sum > 1.443e+08 )
							if( Negative_Money_Flow_Sum <= 2.15805e+08 )
								ret := -0.460714
							if( Negative_Money_Flow_Sum > 2.15805e+08 )
								ret := 0.007042
			if( Positive_Money_Flow_Sum > 2.40592e+08 )
				if( Typical_Price <= 213.017 )
					if( VIP <= 1.30891 )
						if( MFI_High <= -22.9511 )
							if( Positive_Money_Flow_Sum <= 3.09009e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.09009e+08 )
								ret := 0.857143 // buy
						if( MFI_High > -22.9511 )
							if( Negative_Money_Flow <= 409447 )
								ret := 0.050000
							if( Negative_Money_Flow > 409447 )
								ret := 0.571429
					if( VIP > 1.30891 )
						if( MFI_Low <= 74.8295 )
							ret := -1.000000 // sell
						if( MFI_Low > 74.8295 )
							ret := -0.142857
				if( Typical_Price > 213.017 )
					if( Negative_Money_Flow <= 2142.31 )
						if( VIM <= 0.781702 )
							if( Positive_Money_Flow <= 2.22547e+07 )
								ret := -0.434783
							if( Positive_Money_Flow > 2.22547e+07 )
								ret := 0.600000
						if( VIM > 0.781702 )
							if( VIP <= 1.10386 )
								ret := -0.075949
							if( VIP > 1.10386 )
								ret := -0.585106
					if( Negative_Money_Flow > 2142.31 )
						if( MFI_High <= -24.3713 )
							if( Negative_Money_Flow <= 83569.6 )
								ret := -0.714286 // sell
							if( Negative_Money_Flow > 83569.6 )
								ret := 0.875000 // buy
						if( MFI_High > -24.3713 )
							if( Negative_Money_Flow_Sum <= 5.5551e+07 )
								ret := -0.451613
							if( Negative_Money_Flow_Sum > 5.5551e+07 )
								ret := -0.960000 // sell
	if( Negative_Money_Flow > 1.4832e+06 )
		if( Money_Flow_Ratio <= 0.208505 )
			if( Typical_Price <= 288.775 )
				if( Negative_Money_Flow_Sum <= 7.99561e+07 )
					if( Negative_Money_Flow_Sum <= 4.8367e+07 )
						if( Raw_Money_Flow <= 3.4186e+06 )
							if( Negative_Money_Flow_Sum <= 3.13915e+07 )
								ret := 0.330317
							if( Negative_Money_Flow_Sum > 3.13915e+07 )
								ret := 0.024691
						if( Raw_Money_Flow > 3.4186e+06 )
							if( VIP <= 0.601283 )
								ret := 0.854167 // buy
							if( VIP > 0.601283 )
								ret := 0.395833
					if( Negative_Money_Flow_Sum > 4.8367e+07 )
						if( VIP_VIM <= -0.882598 )
							if( Negative_Money_Flow_Sum <= 6.67011e+07 )
								ret := 0.222222
							if( Negative_Money_Flow_Sum > 6.67011e+07 )
								ret := 0.933333 // buy
						if( VIP_VIM > -0.882598 )
							if( Positive_Money_Flow_Sum <= 2.33756e+06 )
								ret := -0.823529 // sell
							if( Positive_Money_Flow_Sum > 2.33756e+06 )
								ret := -0.016461
				if( Negative_Money_Flow_Sum > 7.99561e+07 )
					if( VIP_VIM <= -0.887365 )
						if( Raw_Money_Flow <= 1.97457e+07 )
							ret := -0.545455
						if( Raw_Money_Flow > 1.97457e+07 )
							ret := 0.888889 // buy
					if( VIP_VIM > -0.887365 )
						if( VIM <= 1.10685 )
							ret := -0.272727
						if( VIM > 1.10685 )
							if( VIM <= 1.37043 )
								ret := 0.621212
							if( VIM > 1.37043 )
								ret := 0.916667 // buy
			if( Typical_Price > 288.775 )
				if( VIP_VIM <= -1.05903 )
					if( Negative_Money_Flow_Sum <= 1.1152e+08 )
						if( Typical_Price <= 320.308 )
							ret := -0.571429
						if( Typical_Price > 320.308 )
							if( Positive_Money_Flow_Sum <= 282505 )
								ret := -0.857143 // sell
							if( Positive_Money_Flow_Sum > 282505 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.1152e+08 )
						ret := 0.300000
				if( VIP_VIM > -1.05903 )
					if( VIP <= 0.889673 )
						if( Negative_Money_Flow <= 3.38615e+07 )
							if( Raw_Money_Flow <= 1.50487e+07 )
								ret := 0.210526
							if( Raw_Money_Flow > 1.50487e+07 )
								ret := -0.255102
						if( Negative_Money_Flow > 3.38615e+07 )
							if( Positive_Money_Flow_Sum <= 2.26203e+07 )
								ret := 0.804348 // buy
							if( Positive_Money_Flow_Sum > 2.26203e+07 )
								ret := 0.133333
					if( VIP > 0.889673 )
						if( Money_Flow_Ratio <= 0.204304 )
							if( MFI_Low <= -7.62443 )
								ret := 0.134146
							if( MFI_Low > -7.62443 )
								ret := -0.404762
						if( Money_Flow_Ratio > 0.204304 )
							if( VIP <= 1.05903 )
								ret := 0.333333
							if( VIP > 1.05903 )
								ret := 0.875000 // buy
		if( Money_Flow_Ratio > 0.208505 )
			if( VIM <= 1.1978 )
				if( Typical_Price <= 457.284 )
					if( Positive_Money_Flow_Sum <= 9.39286e+07 )
						if( Positive_Money_Flow_Sum <= 8.92279e+07 )
							if( Positive_Money_Flow <= 300202 )
								ret := 0.101312
							if( Positive_Money_Flow > 300202 )
								ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 8.92279e+07 )
							if( MFI <= 73.9287 )
								ret := -0.652174
							if( MFI > 73.9287 )
								ret := 0.368421
					if( Positive_Money_Flow_Sum > 9.39286e+07 )
						if( Positive_Money_Flow_Sum <= 2.02106e+08 )
							if( MFI_Low <= 42.6509 )
								ret := -0.089744
							if( MFI_Low > 42.6509 )
								ret := 0.505695
						if( Positive_Money_Flow_Sum > 2.02106e+08 )
							if( Negative_Money_Flow_Sum <= 1.06863e+08 )
								ret := -0.237500
							if( Negative_Money_Flow_Sum > 1.06863e+08 )
								ret := 0.641791
				if( Typical_Price > 457.284 )
					if( Positive_Money_Flow_Sum <= 2.76795e+07 )
						if( Positive_Money_Flow_Sum <= 2.62518e+07 )
							if( VIP_VIM <= -0.330959 )
								ret := -0.250000
							if( VIP_VIM > -0.330959 )
								ret := 0.164557
						if( Positive_Money_Flow_Sum > 2.62518e+07 )
							if( Negative_Money_Flow_Sum <= 3.37595e+07 )
								ret := 0.045455
							if( Negative_Money_Flow_Sum > 3.37595e+07 )
								ret := 0.711111 // buy
					if( Positive_Money_Flow_Sum > 2.76795e+07 )
						if( MFI_Low <= 11.8713 )
							if( Raw_Money_Flow <= 3.52596e+06 )
								ret := 0.111111
							if( Raw_Money_Flow > 3.52596e+06 )
								ret := -0.559322
						if( MFI_Low > 11.8713 )
							if( Negative_Money_Flow_Sum <= 2.60725e+08 )
								ret := -0.066368
							if( Negative_Money_Flow_Sum > 2.60725e+08 )
								ret := 0.580000
			if( VIM > 1.1978 )
				if( Positive_Money_Flow_Sum <= 6.59591e+06 )
					if( Typical_Price <= 128.404 )
						if( Raw_Money_Flow <= 4.04734e+06 )
							if( Positive_Money_Flow_Sum <= 3.91559e+06 )
								ret := -0.435897
							if( Positive_Money_Flow_Sum > 3.91559e+06 )
								ret := 0.031250
						if( Raw_Money_Flow > 4.04734e+06 )
							if( Negative_Money_Flow_Sum <= 1.31403e+07 )
								ret := -0.142857
							if( Negative_Money_Flow_Sum > 1.31403e+07 )
								ret := 0.857143 // buy
					if( Typical_Price > 128.404 )
						if( Money_Flow_Ratio <= 0.35445 )
							if( Positive_Money_Flow_Sum <= 5.45584e+06 )
								ret := 0.347826
							if( Positive_Money_Flow_Sum > 5.45584e+06 )
								ret := -0.034483
						if( Money_Flow_Ratio > 0.35445 )
							if( Positive_Money_Flow_Sum <= 5.22255e+06 )
								ret := 0.727273 // buy
							if( Positive_Money_Flow_Sum > 5.22255e+06 )
								ret := 0.392857
				if( Positive_Money_Flow_Sum > 6.59591e+06 )
					if( Raw_Money_Flow <= 8.96443e+07 )
						if( Positive_Money_Flow <= 3.30584e+06 )
							if( Positive_Money_Flow_Sum <= 4.54513e+08 )
								ret := -0.040179
							if( Positive_Money_Flow_Sum > 4.54513e+08 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 3.30584e+06 )
							if( Typical_Price <= 282.343 )
								ret := -1.000000 // sell
							if( Typical_Price > 282.343 )
								ret := -0.428571
					if( Raw_Money_Flow > 8.96443e+07 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_EPAM_15Min_0668277a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


