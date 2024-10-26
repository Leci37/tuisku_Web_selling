//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SOLUSDT_1Hour_2MS0_0d839e1e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Hour_2MS0_0d839e1e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Hour_0d839e1e(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -0.584343 )
		if( Typical_Price <= 5.10046 )
			if( Money_Flow_Ratio <= 1.62005 )
				if( Negative_Money_Flow_Sum <= 2.01477e+06 )
					if( Typical_Price <= 1.59575 )
						if( Positive_Money_Flow_Sum <= 406294 )
							ret := -0.247706
						if( Positive_Money_Flow_Sum > 406294 )
							ret := 0.412587
					if( Typical_Price > 1.59575 )
						if( MFI <= 58.1253 )
							ret := -0.312500
						if( MFI > 58.1253 )
							ret := 0.203125
				if( Negative_Money_Flow_Sum > 2.01477e+06 )
					if( Typical_Price <= 2.3601 )
						if( Money_Flow_Ratio <= 0.345864 )
							ret := -0.151515
						if( Money_Flow_Ratio > 0.345864 )
							ret := 0.631148
					if( Typical_Price > 2.3601 )
						if( d_k <= -5.29951 )
							ret := -0.287958
						if( d_k > -5.29951 )
							ret := -0.002519
			if( Money_Flow_Ratio > 1.62005 )
				if( Positive_Money_Flow_Sum <= 4.70877e+06 )
					if( Positive_Money_Flow_Sum <= 4.10732e+06 )
						if( Raw_Money_Flow <= 173966 )
							ret := -0.477193
						if( Raw_Money_Flow > 173966 )
							ret := -0.135294
					if( Positive_Money_Flow_Sum > 4.10732e+06 )
						if( Negative_Money_Flow_Sum <= 2.0747e+06 )
							ret := 0.672131
						if( Negative_Money_Flow_Sum > 2.0747e+06 )
							ret := -0.578947
				if( Positive_Money_Flow_Sum > 4.70877e+06 )
					if( smoothD_d <= 91.3751 )
						if( Positive_Money_Flow_Sum <= 1.46542e+07 )
							ret := -0.876847 // sell
						if( Positive_Money_Flow_Sum > 1.46542e+07 )
							ret := -0.117647
					if( smoothD_d > 91.3751 )
						ret := 0.300000
		if( Typical_Price > 5.10046 )
			if( rsi1 <= 45.0373 )
				if( Negative_Money_Flow <= 1.1691e+07 )
					if( rsi1 <= 33.8488 )
						if( Positive_Money_Flow_Sum <= 2.70578e+07 )
							ret := -0.101710
						if( Positive_Money_Flow_Sum > 2.70578e+07 )
							ret := -0.407614
					if( rsi1 > 33.8488 )
						if( Money_Flow_Ratio <= 0.540966 )
							ret := 0.225751
						if( Money_Flow_Ratio > 0.540966 )
							ret := -0.174497
				if( Negative_Money_Flow > 1.1691e+07 )
					if( d_k <= -4.38787 )
						if( Positive_Money_Flow_Sum <= 3.10442e+08 )
							ret := 0.574491
						if( Positive_Money_Flow_Sum > 3.10442e+08 )
							ret := -0.410256
					if( d_k > -4.38787 )
						if( rsi1 <= 26.6792 )
							ret := -0.296651
						if( rsi1 > 26.6792 )
							ret := 0.176734
			if( rsi1 > 45.0373 )
				if( rsi1 <= 59.714 )
					if( MFI <= 53.3684 )
						if( Negative_Money_Flow <= 2.26766e+06 )
							ret := 0.292816
						if( Negative_Money_Flow > 2.26766e+06 )
							ret := 0.538056
					if( MFI > 53.3684 )
						if( Positive_Money_Flow <= 7.36476e+06 )
							ret := 0.052198
						if( Positive_Money_Flow > 7.36476e+06 )
							ret := -0.371775
				if( rsi1 > 59.714 )
					if( MFI_High <= -20.1701 )
						if( d <= 77.6434 )
							ret := 0.683819
						if( d > 77.6434 )
							ret := 0.426000
					if( MFI_High > -20.1701 )
						if( rsi1 <= 71.0624 )
							ret := 0.206999
						if( rsi1 > 71.0624 )
							ret := 0.563592
	if( d_k > -0.584343 )
		if( rsi1 <= 47.8054 )
			if( Positive_Money_Flow_Sum <= 5.13628e+06 )
				if( Typical_Price <= 3.81177 )
					if( Money_Flow_Ratio <= 0.26268 )
						if( Negative_Money_Flow_Sum <= 3.38016e+06 )
							ret := 0.416667
						if( Negative_Money_Flow_Sum > 3.38016e+06 )
							ret := 0.813187 // buy
					if( Money_Flow_Ratio > 0.26268 )
						if( Positive_Money_Flow_Sum <= 469655 )
							ret := -0.429936
						if( Positive_Money_Flow_Sum > 469655 )
							ret := 0.136919
				if( Typical_Price > 3.81177 )
					if( Positive_Money_Flow <= 112563 )
						if( smoothD_d <= 34.7209 )
							ret := -0.231579
						if( smoothD_d > 34.7209 )
							ret := -0.644231
					if( Positive_Money_Flow > 112563 )
						if( Typical_Price <= 8.21087 )
							ret := 0.842105 // buy
						if( Typical_Price > 8.21087 )
							ret := -0.157895
			if( Positive_Money_Flow_Sum > 5.13628e+06 )
				if( rsi1 <= 32.6282 )
					if( MFI_Low <= 6.08354 )
						if( Negative_Money_Flow_Sum <= 2.86419e+07 )
							ret := -0.609524
						if( Negative_Money_Flow_Sum > 2.86419e+07 )
							ret := -0.263208
					if( MFI_Low > 6.08354 )
						if( d <= 10.4716 )
							ret := -0.453224
						if( d > 10.4716 )
							ret := -0.681678
				if( rsi1 > 32.6282 )
					if( Money_Flow_Ratio <= 0.601305 )
						if( rsi1 <= 37.6557 )
							ret := -0.216667
						if( rsi1 > 37.6557 )
							ret := 0.147914
					if( Money_Flow_Ratio > 0.601305 )
						if( k <= 18.0741 )
							ret := -0.224411
						if( k > 18.0741 )
							ret := -0.469810
		if( rsi1 > 47.8054 )
			if( rsi1 <= 64.7518 )
				if( Money_Flow_Ratio <= 2.22151 )
					if( MFI <= 57.9532 )
						if( smoothD_d <= 68.2205 )
							ret := 0.163644
						if( smoothD_d > 68.2205 )
							ret := -0.006811
					if( MFI > 57.9532 )
						if( rsi1 <= 57.5071 )
							ret := -0.261490
						if( rsi1 > 57.5071 )
							ret := 0.066423
				if( Money_Flow_Ratio > 2.22151 )
					if( Positive_Money_Flow_Sum <= 3.69028e+06 )
						if( Negative_Money_Flow_Sum <= 915433 )
							ret := 0.180851
						if( Negative_Money_Flow_Sum > 915433 )
							ret := 0.813953 // buy
					if( Positive_Money_Flow_Sum > 3.69028e+06 )
						if( Positive_Money_Flow <= 1.29992e+07 )
							ret := -0.383296
						if( Positive_Money_Flow > 1.29992e+07 )
							ret := -0.702970 // sell
			if( rsi1 > 64.7518 )
				if( Money_Flow_Ratio <= 4.30839 )
					if( Negative_Money_Flow <= 219595 )
						if( rsi1 <= 74.463 )
							ret := 0.024676
						if( rsi1 > 74.463 )
							ret := 0.340625
					if( Negative_Money_Flow > 219595 )
						if( rsi1 <= 70.2387 )
							ret := 0.254579
						if( rsi1 > 70.2387 )
							ret := 0.504513
				if( Money_Flow_Ratio > 4.30839 )
					if( rsi1 <= 80.8953 )
						if( smoothD_d <= 78.5176 )
							ret := -0.036667
						if( smoothD_d > 78.5176 )
							ret := -0.485666
					if( rsi1 > 80.8953 )
						if( Typical_Price <= 3.82228 )
							ret := -1.000000 // sell
						if( Typical_Price > 3.82228 )
							ret := 0.318182
	
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
float op_operation = decision_tree_0_SOLUSDT_1Hour_0d839e1e(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


