//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: DBX_1Hour_2MS0_615e46d3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_1Hour_2MS0_615e46d3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_1Hour_615e46d3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Typical_Price <= 22.5064 )
		if( Negative_Money_Flow <= 76.206 )
			if( Positive_Money_Flow <= 2.58912e+06 )
				if( Positive_Money_Flow_Sum <= 9.49864e+07 )
					if( MFI_High <= -14.4357 )
						if( MFI_Low <= 39.6797 )
							ret := -0.092293
						if( MFI_Low > 39.6797 )
							ret := -0.600000
					if( MFI_High > -14.4357 )
						if( k <= 59.252 )
							ret := 0.015625
						if( k > 59.252 )
							ret := 0.595588
				if( Positive_Money_Flow_Sum > 9.49864e+07 )
					if( smoothK_k <= 6.55782 )
						ret := 0.454545
					if( smoothK_k > 6.55782 )
						if( smoothK_k <= 96.9453 )
							ret := -0.689655
						if( smoothK_k > 96.9453 )
							ret := 0.571429
			if( Positive_Money_Flow > 2.58912e+06 )
				if( Money_Flow_Ratio <= 48.3837 )
					if( smoothK_k <= 51.5309 )
						if( Negative_Money_Flow_Sum <= 1.59639e+08 )
							ret := 0.122830
						if( Negative_Money_Flow_Sum > 1.59639e+08 )
							ret := -0.482759
					if( smoothK_k > 51.5309 )
						if( Negative_Money_Flow_Sum <= 1.02848e+08 )
							ret := -0.074198
						if( Negative_Money_Flow_Sum > 1.02848e+08 )
							ret := 0.388235
				if( Money_Flow_Ratio > 48.3837 )
					if( Typical_Price <= 20.2182 )
						ret := -1.000000 // sell
					if( Typical_Price > 20.2182 )
						if( Negative_Money_Flow_Sum <= 19727.7 )
							ret := 0.000000
						if( Negative_Money_Flow_Sum > 19727.7 )
							ret := 0.894737 // buy
		if( Negative_Money_Flow > 76.206 )
			if( Negative_Money_Flow <= 21113.1 )
				if( Money_Flow_Ratio <= 1.10898 )
					if( d_k <= 2.6956 )
						if( rsi1 <= 65.689 )
							ret := 0.401042
						if( rsi1 > 65.689 )
							ret := -1.000000 // sell
					if( d_k > 2.6956 )
						if( Raw_Money_Flow <= 2127.93 )
							ret := -0.250000
						if( Raw_Money_Flow > 2127.93 )
							ret := 0.741259 // buy
				if( Money_Flow_Ratio > 1.10898 )
					if( MFI_Low <= 38.1466 )
						if( Positive_Money_Flow_Sum <= 6.76507e+07 )
							ret := -0.472441
						if( Positive_Money_Flow_Sum > 6.76507e+07 )
							ret := 0.722222 // buy
					if( MFI_Low > 38.1466 )
						if( Negative_Money_Flow_Sum <= 4.85359e+07 )
							ret := 0.378378
						if( Negative_Money_Flow_Sum > 4.85359e+07 )
							ret := -0.216667
			if( Negative_Money_Flow > 21113.1 )
				if( d_k <= -1.84023 )
					if( Raw_Money_Flow <= 301904 )
						if( Typical_Price <= 19.4209 )
							ret := 0.204819
						if( Typical_Price > 19.4209 )
							ret := -0.546218
					if( Raw_Money_Flow > 301904 )
						if( Negative_Money_Flow_Sum <= 3.52204e+07 )
							ret := 0.262712
						if( Negative_Money_Flow_Sum > 3.52204e+07 )
							ret := -0.095440
				if( d_k > -1.84023 )
					if( Typical_Price <= 21.0447 )
						if( MFI_High <= -39.4626 )
							ret := 0.432958
						if( MFI_High > -39.4626 )
							ret := 0.126135
					if( Typical_Price > 21.0447 )
						if( Typical_Price <= 21.0734 )
							ret := -0.863636 // sell
						if( Typical_Price > 21.0734 )
							ret := 0.088024
	if( Typical_Price > 22.5064 )
		if( Raw_Money_Flow <= 16085.3 )
			if( rsi1 <= 50.0413 )
				if( Negative_Money_Flow <= 10.7314 )
					if( d_k <= -6.3884 )
						if( d <= 62.2135 )
							ret := -0.632353
						if( d > 62.2135 )
							ret := 0.500000
					if( d_k > -6.3884 )
						if( d <= 33.3622 )
							ret := 0.229508
						if( d > 33.3622 )
							ret := -0.362069
				if( Negative_Money_Flow > 10.7314 )
					if( Positive_Money_Flow <= 1210.36 )
						if( MFI_Low <= 60.1121 )
							ret := 0.635897
						if( MFI_Low > 60.1121 )
							ret := -0.100000
					if( Positive_Money_Flow > 1210.36 )
						if( d_k <= -3.68 )
							ret := -0.395349
						if( d_k > -3.68 )
							ret := 0.682927
			if( rsi1 > 50.0413 )
				if( d_k <= 7.22767 )
					if( Positive_Money_Flow_Sum <= 5.69771e+07 )
						if( Negative_Money_Flow <= 7125.58 )
							ret := -0.516129
						if( Negative_Money_Flow > 7125.58 )
							ret := 0.592593
					if( Positive_Money_Flow_Sum > 5.69771e+07 )
						if( Negative_Money_Flow_Sum <= 1.17408e+08 )
							ret := 0.095679
						if( Negative_Money_Flow_Sum > 1.17408e+08 )
							ret := -0.483871
				if( d_k > 7.22767 )
					if( smoothK_k <= 33.3821 )
						if( Money_Flow_Ratio <= 0.791917 )
							ret := 0.454545
						if( Money_Flow_Ratio > 0.791917 )
							ret := -0.625000
					if( smoothK_k > 33.3821 )
						if( MFI <= 99.9536 )
							ret := 0.467391
						if( MFI > 99.9536 )
							ret := -1.000000 // sell
		if( Raw_Money_Flow > 16085.3 )
			if( Negative_Money_Flow <= 1.24312e+07 )
				if( Negative_Money_Flow_Sum <= 2.45116e+08 )
					if( Positive_Money_Flow_Sum <= 5.26232e+07 )
						if( Positive_Money_Flow <= 1.68636e+07 )
							ret := -0.203813
						if( Positive_Money_Flow > 1.68636e+07 )
							ret := 0.468354
					if( Positive_Money_Flow_Sum > 5.26232e+07 )
						if( rsi1 <= 60.9848 )
							ret := 0.026435
						if( rsi1 > 60.9848 )
							ret := -0.205594
				if( Negative_Money_Flow_Sum > 2.45116e+08 )
					if( MFI <= 54.5744 )
						if( Typical_Price <= 23.7252 )
							ret := -0.142857
						if( Typical_Price > 23.7252 )
							ret := -0.876543 // sell
					if( MFI > 54.5744 )
						ret := 1.000000 // buy
			if( Negative_Money_Flow > 1.24312e+07 )
				if( Negative_Money_Flow_Sum <= 7.03029e+07 )
					if( d_k <= 22.2229 )
						if( Typical_Price <= 23.3356 )
							ret := 0.084034
						if( Typical_Price > 23.3356 )
							ret := -0.293956
					if( d_k > 22.2229 )
						if( Raw_Money_Flow <= 1.973e+07 )
							ret := 0.782609 // buy
						if( Raw_Money_Flow > 1.973e+07 )
							ret := -0.500000
				if( Negative_Money_Flow_Sum > 7.03029e+07 )
					if( Positive_Money_Flow_Sum <= 2.25051e+08 )
						if( Negative_Money_Flow_Sum <= 1.30726e+08 )
							ret := 0.262467
						if( Negative_Money_Flow_Sum > 1.30726e+08 )
							ret := -0.046099
					if( Positive_Money_Flow_Sum > 2.25051e+08 )
						if( k <= 13.606 )
							ret := -0.909091 // sell
						if( k > 13.606 )
							ret := -0.181818
	
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
float op_operation = decision_tree_0_DBX_1Hour_615e46d3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


