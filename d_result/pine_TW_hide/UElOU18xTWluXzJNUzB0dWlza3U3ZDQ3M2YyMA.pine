//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: PINS_1Min_2MS0_7d473f20 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_1Min_2MS0_7d473f20", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_1Min_7d473f20(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 49.515 )
		if( Positive_Money_Flow_Sum <= 2.17628e+07 )
			if( Negative_Money_Flow_Sum <= 66792.9 )
				if( d_k <= -8.62188 )
					ret := -0.733333 // sell
				if( d_k > -8.62188 )
					if( Typical_Price <= 42.5031 )
						if( Negative_Money_Flow_Sum <= 46473.9 )
							ret := 0.538462
						if( Negative_Money_Flow_Sum > 46473.9 )
							ret := 0.892562 // buy
					if( Typical_Price > 42.5031 )
						ret := -0.100000
			if( Negative_Money_Flow_Sum > 66792.9 )
				if( Money_Flow_Ratio <= 0.096826 )
					if( Raw_Money_Flow <= 79457.3 )
						if( rsi1 <= 41.0561 )
							ret := 0.747826 // buy
						if( rsi1 > 41.0561 )
							ret := 0.210227
					if( Raw_Money_Flow > 79457.3 )
						if( Positive_Money_Flow <= 1835.89 )
							ret := 0.200565
						if( Positive_Money_Flow > 1835.89 )
							ret := -0.397163
				if( Money_Flow_Ratio > 0.096826 )
					if( Negative_Money_Flow <= 4.56432e+06 )
						if( Positive_Money_Flow_Sum <= 4.2142e+06 )
							ret := 0.036327
						if( Positive_Money_Flow_Sum > 4.2142e+06 )
							ret := -0.042397
					if( Negative_Money_Flow > 4.56432e+06 )
						if( d <= 19.1398 )
							ret := 0.044248
						if( d > 19.1398 )
							ret := 0.585903
		if( Positive_Money_Flow_Sum > 2.17628e+07 )
			if( rsi1 <= 34.9274 )
				if( Positive_Money_Flow_Sum <= 3.30088e+07 )
					if( rsi1 <= 28.9547 )
						if( Negative_Money_Flow <= 2.32735e+06 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 2.32735e+06 )
							ret := 0.200000
					if( rsi1 > 28.9547 )
						if( Typical_Price <= 33.2291 )
							ret := -0.741935 // sell
						if( Typical_Price > 33.2291 )
							ret := 0.714286 // buy
				if( Positive_Money_Flow_Sum > 3.30088e+07 )
					if( MFI_Low <= 54.9767 )
						if( Positive_Money_Flow_Sum <= 4.00031e+07 )
							ret := -0.960000 // sell
						if( Positive_Money_Flow_Sum > 4.00031e+07 )
							ret := -0.393443
					if( MFI_Low > 54.9767 )
						if( Negative_Money_Flow_Sum <= 1.53533e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.53533e+07 )
							ret := 0.100000
			if( rsi1 > 34.9274 )
				if( smoothD_d <= 10.3897 )
					if( Raw_Money_Flow <= 4.33355e+06 )
						if( smoothK_k <= 7.97328 )
							ret := -0.666667
						if( smoothK_k > 7.97328 )
							ret := 0.200000
					if( Raw_Money_Flow > 4.33355e+06 )
						if( Positive_Money_Flow_Sum <= 3.88821e+07 )
							ret := 0.852941 // buy
						if( Positive_Money_Flow_Sum > 3.88821e+07 )
							ret := -0.571429
				if( smoothD_d > 10.3897 )
					if( rsi1 <= 48.7269 )
						if( Negative_Money_Flow <= 8.44705e+06 )
							ret := 0.664835
						if( Negative_Money_Flow > 8.44705e+06 )
							ret := -0.269231
					if( rsi1 > 48.7269 )
						if( Negative_Money_Flow_Sum <= 2.39816e+07 )
							ret := -0.156863
						if( Negative_Money_Flow_Sum > 2.39816e+07 )
							ret := 0.500000
	if( rsi1 > 49.515 )
		if( Raw_Money_Flow <= 2.66716e+06 )
			if( Positive_Money_Flow_Sum <= 1.06538e+06 )
				if( d_k <= 4.05046 )
					if( Typical_Price <= 33.2955 )
						if( Negative_Money_Flow_Sum <= 79588.2 )
							ret := 0.328947
						if( Negative_Money_Flow_Sum > 79588.2 )
							ret := -0.183550
					if( Typical_Price > 33.2955 )
						if( rsi1 <= 57.2196 )
							ret := -0.193029
						if( rsi1 > 57.2196 )
							ret := -0.520642
				if( d_k > 4.05046 )
					if( Negative_Money_Flow_Sum <= 162270 )
						if( Negative_Money_Flow <= 1076.26 )
							ret := -0.003390
						if( Negative_Money_Flow > 1076.26 )
							ret := 0.543919
					if( Negative_Money_Flow_Sum > 162270 )
						if( MFI_Low <= 21.6266 )
							ret := 0.087379
						if( MFI_Low > 21.6266 )
							ret := -0.324484
			if( Positive_Money_Flow_Sum > 1.06538e+06 )
				if( Negative_Money_Flow_Sum <= 1.09362e+06 )
					if( MFI <= 76.6917 )
						if( MFI <= 66.0381 )
							ret := -0.025894
						if( MFI > 66.0381 )
							ret := 0.289149
					if( MFI > 76.6917 )
						if( Typical_Price <= 32.7896 )
							ret := 0.171154
						if( Typical_Price > 32.7896 )
							ret := -0.116368
				if( Negative_Money_Flow_Sum > 1.09362e+06 )
					if( Positive_Money_Flow_Sum <= 2.86684e+07 )
						if( Positive_Money_Flow_Sum <= 2.80607e+07 )
							ret := -0.024169
						if( Positive_Money_Flow_Sum > 2.80607e+07 )
							ret := 0.591837
					if( Positive_Money_Flow_Sum > 2.86684e+07 )
						if( d_k <= 10.2958 )
							ret := -0.239594
						if( d_k > 10.2958 )
							ret := 0.272000
		if( Raw_Money_Flow > 2.66716e+06 )
			if( rsi1 <= 67.7427 )
				if( Positive_Money_Flow_Sum <= 1.99832e+07 )
					if( MFI_Low <= 35.0881 )
						if( smoothD_d <= 28.2944 )
							ret := 0.395349
						if( smoothD_d > 28.2944 )
							ret := -0.555874
					if( MFI_Low > 35.0881 )
						if( d <= 51.9149 )
							ret := -0.384956
						if( d > 51.9149 )
							ret := 0.049822
				if( Positive_Money_Flow_Sum > 1.99832e+07 )
					if( Raw_Money_Flow <= 6.56912e+06 )
						if( Positive_Money_Flow <= 4.13364e+06 )
							ret := 0.044534
						if( Positive_Money_Flow > 4.13364e+06 )
							ret := 0.585106
					if( Raw_Money_Flow > 6.56912e+06 )
						if( rsi1 <= 61.6648 )
							ret := -0.122137
						if( rsi1 > 61.6648 )
							ret := -0.790323 // sell
			if( rsi1 > 67.7427 )
				if( d_k <= -11.865 )
					if( Positive_Money_Flow_Sum <= 2.89068e+07 )
						if( MFI_High <= -6.29909 )
							ret := -0.904762 // sell
						if( MFI_High > -6.29909 )
							ret := 0.352941
					if( Positive_Money_Flow_Sum > 2.89068e+07 )
						if( Positive_Money_Flow_Sum <= 4.73156e+07 )
							ret := 0.875000 // buy
						if( Positive_Money_Flow_Sum > 4.73156e+07 )
							ret := 1.000000 // buy
				if( d_k > -11.865 )
					if( Raw_Money_Flow <= 4.06576e+06 )
						if( smoothK_k <= 46.1416 )
							ret := -0.930233 // sell
						if( smoothK_k > 46.1416 )
							ret := -0.145594
					if( Raw_Money_Flow > 4.06576e+06 )
						if( MFI_Low <= 13.3385 )
							ret := 0.500000
						if( MFI_Low > 13.3385 )
							ret := -0.705556 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PINS_1Min_7d473f20(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


