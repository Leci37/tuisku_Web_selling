//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: PTON_5Min_2MS0_39c827f7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_5Min_2MS0_39c827f7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_5Min_39c827f7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow <= 178.975 )
		if( Positive_Money_Flow_Sum <= 639313 )
			if( rsi1 <= 50.0721 )
				if( d_k <= 2.13566 )
					if( MFI_High <= -34.2808 )
						if( Positive_Money_Flow <= 433.437 )
							ret := 0.182836
						if( Positive_Money_Flow > 433.437 )
							ret := -0.081726
					if( MFI_High > -34.2808 )
						if( Typical_Price <= 4.2339 )
							ret := -0.435484
						if( Typical_Price > 4.2339 )
							ret := -0.132203
				if( d_k > 2.13566 )
					if( Negative_Money_Flow <= 3.24398 )
						if( k <= 47.889 )
							ret := 0.048304
						if( k > 47.889 )
							ret := 0.306569
					if( Negative_Money_Flow > 3.24398 )
						if( Negative_Money_Flow <= 96.9193 )
							ret := 0.956522 // buy
						if( Negative_Money_Flow > 96.9193 )
							ret := 0.047619
			if( rsi1 > 50.0721 )
				if( Positive_Money_Flow <= 10.1846 )
					if( rsi1 <= 51.9062 )
						if( k <= 54.6425 )
							ret := -0.857143 // sell
						if( k > 54.6425 )
							ret := 0.187500
					if( rsi1 > 51.9062 )
						if( Raw_Money_Flow <= 11072.1 )
							ret := 0.127660
						if( Raw_Money_Flow > 11072.1 )
							ret := -0.346154
				if( Positive_Money_Flow > 10.1846 )
					if( Typical_Price <= 8.23697 )
						if( d_k <= -1.38327 )
							ret := -0.466361
						if( d_k > -1.38327 )
							ret := -0.263586
					if( Typical_Price > 8.23697 )
						if( rsi1 <= 65.8421 )
							ret := 0.022876
						if( rsi1 > 65.8421 )
							ret := -0.551402
		if( Positive_Money_Flow_Sum > 639313 )
			if( Raw_Money_Flow <= 4.49314e+06 )
				if( Typical_Price <= 3.67191 )
					if( Positive_Money_Flow_Sum <= 1.49761e+07 )
						if( Raw_Money_Flow <= 8487.02 )
							ret := -0.158576
						if( Raw_Money_Flow > 8487.02 )
							ret := 0.088416
					if( Positive_Money_Flow_Sum > 1.49761e+07 )
						if( rsi1 <= 58.0027 )
							ret := 0.190476
						if( rsi1 > 58.0027 )
							ret := -0.760000 // sell
				if( Typical_Price > 3.67191 )
					if( Negative_Money_Flow_Sum <= 363116 )
						if( rsi1 <= 80.3339 )
							ret := 0.164436
						if( rsi1 > 80.3339 )
							ret := -0.392857
					if( Negative_Money_Flow_Sum > 363116 )
						if( Negative_Money_Flow_Sum <= 4.88719e+06 )
							ret := -0.094198
						if( Negative_Money_Flow_Sum > 4.88719e+06 )
							ret := -0.003755
			if( Raw_Money_Flow > 4.49314e+06 )
				if( rsi1 <= 66.6444 )
					if( Positive_Money_Flow_Sum <= 5.35241e+07 )
						if( Typical_Price <= 4.47263 )
							ret := -0.692308
						if( Typical_Price > 4.47263 )
							ret := 0.088710
					if( Positive_Money_Flow_Sum > 5.35241e+07 )
						if( Positive_Money_Flow <= 6.5312e+06 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow > 6.5312e+06 )
							ret := 0.750000 // buy
				if( rsi1 > 66.6444 )
					if( Positive_Money_Flow <= 7.53748e+06 )
						if( Typical_Price <= 3.43932 )
							ret := 0.066667
						if( Typical_Price > 3.43932 )
							ret := -0.733333 // sell
					if( Positive_Money_Flow > 7.53748e+06 )
						if( Money_Flow_Ratio <= 115.472 )
							ret := -0.022727
						if( Money_Flow_Ratio > 115.472 )
							ret := -0.882353 // sell
	if( Negative_Money_Flow > 178.975 )
		if( Negative_Money_Flow <= 93811.7 )
			if( rsi1 <= 54.1778 )
				if( d_k <= -1.11537 )
					if( Negative_Money_Flow_Sum <= 30729.1 )
						if( Raw_Money_Flow <= 7548.28 )
							ret := 0.286136
						if( Raw_Money_Flow > 7548.28 )
							ret := 0.850746 // buy
					if( Negative_Money_Flow_Sum > 30729.1 )
						if( Positive_Money_Flow_Sum <= 10733.9 )
							ret := -0.557971
						if( Positive_Money_Flow_Sum > 10733.9 )
							ret := 0.110903
				if( d_k > -1.11537 )
					if( Negative_Money_Flow_Sum <= 57248.4 )
						if( rsi1 <= 45.3873 )
							ret := 0.645761
						if( rsi1 > 45.3873 )
							ret := 0.371055
					if( Negative_Money_Flow_Sum > 57248.4 )
						if( Raw_Money_Flow <= 538312 )
							ret := 0.302800
						if( Raw_Money_Flow > 538312 )
							ret := 1.000000 // buy
			if( rsi1 > 54.1778 )
				if( d_k <= 0.405421 )
					if( Positive_Money_Flow_Sum <= 1.32477e+06 )
						if( Positive_Money_Flow <= 25.5897 )
							ret := -0.148990
						if( Positive_Money_Flow > 25.5897 )
							ret := -0.455919
					if( Positive_Money_Flow_Sum > 1.32477e+06 )
						if( MFI_Low <= 76.5883 )
							ret := 0.082324
						if( MFI_Low > 76.5883 )
							ret := -0.468085
				if( d_k > 0.405421 )
					if( rsi1 <= 67.4072 )
						if( MFI_Low <= 59.2238 )
							ret := 0.100957
						if( MFI_Low > 59.2238 )
							ret := 0.558233
					if( rsi1 > 67.4072 )
						if( Positive_Money_Flow_Sum <= 798919 )
							ret := -0.401274
						if( Positive_Money_Flow_Sum > 798919 )
							ret := 0.028986
		if( Negative_Money_Flow > 93811.7 )
			if( Positive_Money_Flow_Sum <= 1.51514e+06 )
				if( rsi1 <= 39.6402 )
					if( Typical_Price <= 4.57589 )
						if( Negative_Money_Flow_Sum <= 8.25992e+06 )
							ret := 0.025489
						if( Negative_Money_Flow_Sum > 8.25992e+06 )
							ret := 0.405660
					if( Typical_Price > 4.57589 )
						if( Positive_Money_Flow_Sum <= 24491.6 )
							ret := -0.554455
						if( Positive_Money_Flow_Sum > 24491.6 )
							ret := -0.088050
				if( rsi1 > 39.6402 )
					if( MFI <= 19.0925 )
						if( Typical_Price <= 7.75021 )
							ret := -0.494652
						if( Typical_Price > 7.75021 )
							ret := 0.333333
					if( MFI > 19.0925 )
						if( Negative_Money_Flow_Sum <= 474395 )
							ret := 0.340426
						if( Negative_Money_Flow_Sum > 474395 )
							ret := -0.189409
			if( Positive_Money_Flow_Sum > 1.51514e+06 )
				if( Negative_Money_Flow_Sum <= 8.05814e+06 )
					if( Typical_Price <= 4.68318 )
						if( Positive_Money_Flow_Sum <= 2.18138e+07 )
							ret := 0.120778
						if( Positive_Money_Flow_Sum > 2.18138e+07 )
							ret := -1.000000 // sell
					if( Typical_Price > 4.68318 )
						if( MFI_Low <= 47.0753 )
							ret := -0.064723
						if( MFI_Low > 47.0753 )
							ret := 0.079524
				if( Negative_Money_Flow_Sum > 8.05814e+06 )
					if( Typical_Price <= 6.36364 )
						if( smoothD_d <= 1.5381 )
							ret := -0.202899
						if( smoothD_d > 1.5381 )
							ret := 0.273650
					if( Typical_Price > 6.36364 )
						if( Positive_Money_Flow_Sum <= 3.04724e+07 )
							ret := 0.038525
						if( Positive_Money_Flow_Sum > 3.04724e+07 )
							ret := -0.719626 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_PTON_5Min_39c827f7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


