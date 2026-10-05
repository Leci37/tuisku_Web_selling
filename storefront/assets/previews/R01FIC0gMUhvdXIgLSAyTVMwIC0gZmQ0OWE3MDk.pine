//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: GME_1Hour_2MS0_fd49a709 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Hour_2MS0_fd49a709", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Hour_fd49a709(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Money_Flow_Ratio <= 1.40028 )
		if( Typical_Price <= 152.511 )
			if( Positive_Money_Flow_Sum <= 4.50463e+06 )
				if( Negative_Money_Flow <= 957329 )
					if( Typical_Price <= 11.86 )
						if( Negative_Money_Flow_Sum <= 1.09706e+07 )
							ret := -0.312292
						if( Negative_Money_Flow_Sum > 1.09706e+07 )
							ret := -0.691983
					if( Typical_Price > 11.86 )
						if( d_k <= -4.55222 )
							ret := -0.529412
						if( d_k > -4.55222 )
							ret := 0.073684
				if( Negative_Money_Flow > 957329 )
					if( rsi1 <= 35.5653 )
						if( Money_Flow_Ratio <= 0.064143 )
							ret := 0.330882
						if( Money_Flow_Ratio > 0.064143 )
							ret := -0.026432
					if( rsi1 > 35.5653 )
						if( d <= 14.4099 )
							ret := -0.878788 // sell
						if( d > 14.4099 )
							ret := -0.206522
			if( Positive_Money_Flow_Sum > 4.50463e+06 )
				if( Negative_Money_Flow_Sum <= 7.86918e+07 )
					if( Typical_Price <= 3.70533 )
						if( MFI_Low <= 11.3971 )
							ret := -0.032258
						if( MFI_Low > 11.3971 )
							ret := 0.702128 // buy
					if( Typical_Price > 3.70533 )
						if( Raw_Money_Flow <= 29773.8 )
							ret := -0.125541
						if( Raw_Money_Flow > 29773.8 )
							ret := 0.058943
				if( Negative_Money_Flow_Sum > 7.86918e+07 )
					if( Negative_Money_Flow_Sum <= 1.06115e+08 )
						if( rsi1 <= 48.9916 )
							ret := -0.415929
						if( rsi1 > 48.9916 )
							ret := -0.020408
					if( Negative_Money_Flow_Sum > 1.06115e+08 )
						if( smoothD_d <= 59.5845 )
							ret := -0.076756
						if( smoothD_d > 59.5845 )
							ret := 0.226537
		if( Typical_Price > 152.511 )
			if( Negative_Money_Flow <= 7.66257e+08 )
				if( Typical_Price <= 325.953 )
					if( Positive_Money_Flow_Sum <= 2.74699e+09 )
						if( Negative_Money_Flow_Sum <= 5.26314e+09 )
							ret := -0.175525
						if( Negative_Money_Flow_Sum > 5.26314e+09 )
							ret := -0.875000 // sell
					if( Positive_Money_Flow_Sum > 2.74699e+09 )
						if( rsi1 <= 52.2017 )
							ret := 0.330357
						if( rsi1 > 52.2017 )
							ret := -0.454545
				if( Typical_Price > 325.953 )
					ret := -1.000000 // sell
			if( Negative_Money_Flow > 7.66257e+08 )
				if( Raw_Money_Flow <= 2.03598e+09 )
					if( Raw_Money_Flow <= 1.19754e+09 )
						ret := 0.250000
					if( Raw_Money_Flow > 1.19754e+09 )
						if( Money_Flow_Ratio <= 0.361434 )
							ret := 0.800000 // buy
						if( Money_Flow_Ratio > 0.361434 )
							ret := 1.000000 // buy
				if( Raw_Money_Flow > 2.03598e+09 )
					ret := -0.500000
	if( Money_Flow_Ratio > 1.40028 )
		if( Negative_Money_Flow <= 1.26537 )
			if( Positive_Money_Flow_Sum <= 8.98691e+08 )
				if( rsi1 <= 54.9969 )
					if( MFI <= 62.7224 )
						if( Negative_Money_Flow_Sum <= 1.30858e+08 )
							ret := 0.018182
						if( Negative_Money_Flow_Sum > 1.30858e+08 )
							ret := -0.585714
					if( MFI > 62.7224 )
						if( Typical_Price <= 4.35336 )
							ret := 0.621212
						if( Typical_Price > 4.35336 )
							ret := 0.185053
				if( rsi1 > 54.9969 )
					if( k <= 60.6259 )
						if( d_k <= 13.8412 )
							ret := -0.264736
						if( d_k > 13.8412 )
							ret := 0.203125
					if( k > 60.6259 )
						if( Negative_Money_Flow_Sum <= 2.95164e+08 )
							ret := -0.055295
						if( Negative_Money_Flow_Sum > 2.95164e+08 )
							ret := 0.671875
			if( Positive_Money_Flow_Sum > 8.98691e+08 )
				if( Typical_Price <= 259.283 )
					if( Negative_Money_Flow_Sum <= 1.61835e+09 )
						if( Positive_Money_Flow <= 4.78077e+08 )
							ret := 0.372414
						if( Positive_Money_Flow > 4.78077e+08 )
							ret := -0.111765
					if( Negative_Money_Flow_Sum > 1.61835e+09 )
						if( Negative_Money_Flow_Sum <= 3.27417e+09 )
							ret := 0.913978 // buy
						if( Negative_Money_Flow_Sum > 3.27417e+09 )
							ret := -0.090909
				if( Typical_Price > 259.283 )
					if( d_k <= 0.070075 )
						if( Positive_Money_Flow <= 1.10756e+08 )
							ret := -0.157895
						if( Positive_Money_Flow > 1.10756e+08 )
							ret := -0.923077 // sell
					if( d_k > 0.070075 )
						if( Negative_Money_Flow_Sum <= 1.91741e+09 )
							ret := -0.258065
						if( Negative_Money_Flow_Sum > 1.91741e+09 )
							ret := 0.555556
		if( Negative_Money_Flow > 1.26537 )
			if( rsi1 <= 89.523 )
				if( Positive_Money_Flow_Sum <= 3.31523e+09 )
					if( Typical_Price <= 176.872 )
						if( Negative_Money_Flow_Sum <= 1.7e+07 )
							ret := 0.066751
						if( Negative_Money_Flow_Sum > 1.7e+07 )
							ret := 0.243995
					if( Typical_Price > 176.872 )
						if( Negative_Money_Flow_Sum <= 8.58224e+08 )
							ret := -0.035144
						if( Negative_Money_Flow_Sum > 8.58224e+08 )
							ret := -0.721519 // sell
				if( Positive_Money_Flow_Sum > 3.31523e+09 )
					if( Typical_Price <= 254.393 )
						if( Negative_Money_Flow <= 1.48147e+09 )
							ret := 0.748691 // buy
						if( Negative_Money_Flow > 1.48147e+09 )
							ret := -0.833333 // sell
					if( Typical_Price > 254.393 )
						if( k <= 31.509 )
							ret := 0.818182 // buy
						if( k > 31.509 )
							ret := -0.400000
			if( rsi1 > 89.523 )
				if( k <= 98.4877 )
					ret := -1.000000 // sell
				if( k > 98.4877 )
					ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_GME_1Hour_fd49a709(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


