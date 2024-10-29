//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: UNIUSDT_1Hour_2MS0_31dde72d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_1Hour_2MS0_31dde72d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_1Hour_31dde72d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -1.94169 )
		if( rsi1 <= 52.5839 )
			if( Negative_Money_Flow <= 360426 )
				if( rsi1 <= 38.7924 )
					if( Raw_Money_Flow <= 485237 )
						if( Positive_Money_Flow_Sum <= 2.74268e+06 )
							ret := -0.080087
						if( Positive_Money_Flow_Sum > 2.74268e+06 )
							ret := 0.209677
					if( Raw_Money_Flow > 485237 )
						if( d_k <= -7.34262 )
							ret := -0.051007
						if( d_k > -7.34262 )
							ret := -0.384319
				if( rsi1 > 38.7924 )
					if( MFI_Low <= 22.1744 )
						if( MFI_High <= -44.395 )
							ret := 0.380985
						if( MFI_High > -44.395 )
							ret := 0.174036
					if( MFI_Low > 22.1744 )
						if( MFI_High <= -22.5096 )
							ret := 0.043402
						if( MFI_High > -22.5096 )
							ret := -0.355882
			if( Negative_Money_Flow > 360426 )
				if( MFI <= 37.3336 )
					if( rsi1 <= 27.377 )
						if( Typical_Price <= 9.2356 )
							ret := 0.293103
						if( Typical_Price > 9.2356 )
							ret := -0.209091
					if( rsi1 > 27.377 )
						if( Money_Flow_Ratio <= 0.359418 )
							ret := 0.650943
						if( Money_Flow_Ratio > 0.359418 )
							ret := 0.449699
				if( MFI > 37.3336 )
					if( Typical_Price <= 12.3341 )
						if( Positive_Money_Flow_Sum <= 3.70044e+06 )
							ret := 0.298780
						if( Positive_Money_Flow_Sum > 3.70044e+06 )
							ret := -0.199226
					if( Typical_Price > 12.3341 )
						if( d_k <= -6.36694 )
							ret := 0.509709
						if( d_k > -6.36694 )
							ret := -0.006557
		if( rsi1 > 52.5839 )
			if( Money_Flow_Ratio <= 1.27136 )
				if( k <= 88.6258 )
					if( smoothK_k <= 11.523 )
						if( Positive_Money_Flow_Sum <= 6.68618e+07 )
							ret := -0.089552
						if( Positive_Money_Flow_Sum > 6.68618e+07 )
							ret := 0.833333 // buy
					if( smoothK_k > 11.523 )
						if( Negative_Money_Flow <= 306876 )
							ret := 0.501291
						if( Negative_Money_Flow > 306876 )
							ret := 0.714286 // buy
				if( k > 88.6258 )
					if( rsi1 <= 65.8908 )
						if( MFI <= 53.2012 )
							ret := 0.317322
						if( MFI > 53.2012 )
							ret := -0.197917
					if( rsi1 > 65.8908 )
						if( Raw_Money_Flow <= 126967 )
							ret := 0.000000
						if( Raw_Money_Flow > 126967 )
							ret := 0.606897
			if( Money_Flow_Ratio > 1.27136 )
				if( rsi1 <= 60.4397 )
					if( Positive_Money_Flow <= 1.03259e+06 )
						if( k <= 45.4714 )
							ret := 0.418994
						if( k > 45.4714 )
							ret := 0.052632
					if( Positive_Money_Flow > 1.03259e+06 )
						if( Negative_Money_Flow_Sum <= 6.55408e+07 )
							ret := -0.344173
						if( Negative_Money_Flow_Sum > 6.55408e+07 )
							ret := 0.685714
				if( rsi1 > 60.4397 )
					if( Positive_Money_Flow <= 8.46496e+06 )
						if( Typical_Price <= 4.15866 )
							ret := 0.000000
						if( Typical_Price > 4.15866 )
							ret := 0.448287
					if( Positive_Money_Flow > 8.46496e+06 )
						if( Negative_Money_Flow_Sum <= 2.93541e+07 )
							ret := -0.335616
						if( Negative_Money_Flow_Sum > 2.93541e+07 )
							ret := 0.192893
	if( d_k > -1.94169 )
		if( rsi1 <= 49.7129 )
			if( rsi1 <= 41.5337 )
				if( Negative_Money_Flow <= 1.52954e+06 )
					if( d_k <= 6.41479 )
						if( Typical_Price <= 5.48026 )
							ret := -0.221434
						if( Typical_Price > 5.48026 )
							ret := -0.429894
					if( d_k > 6.41479 )
						if( rsi1 <= 27.792 )
							ret := -0.703549 // sell
						if( rsi1 > 27.792 )
							ret := -0.514875
				if( Negative_Money_Flow > 1.52954e+06 )
					if( d_k <= -0.458276 )
						if( MFI <= 37.6981 )
							ret := 0.281124
						if( MFI > 37.6981 )
							ret := -0.223684
					if( d_k > -0.458276 )
						if( Typical_Price <= 5.80233 )
							ret := 0.118380
						if( Typical_Price > 5.80233 )
							ret := -0.360482
			if( rsi1 > 41.5337 )
				if( MFI <= 51.1935 )
					if( MFI <= 35.831 )
						if( Negative_Money_Flow <= 477005 )
							ret := 0.126168
						if( Negative_Money_Flow > 477005 )
							ret := 0.486486
					if( MFI > 35.831 )
						if( smoothD_d <= 51.2853 )
							ret := 0.025888
						if( smoothD_d > 51.2853 )
							ret := -0.203647
				if( MFI > 51.1935 )
					if( Raw_Money_Flow <= 733931 )
						if( d_k <= 0.489582 )
							ret := 0.069767
						if( d_k > 0.489582 )
							ret := -0.340407
					if( Raw_Money_Flow > 733931 )
						if( Positive_Money_Flow <= 179365 )
							ret := -0.421760
						if( Positive_Money_Flow > 179365 )
							ret := -0.662732
		if( rsi1 > 49.7129 )
			if( d_k <= 2.46356 )
				if( Positive_Money_Flow <= 589204 )
					if( rsi1 <= 64.79 )
						if( MFI_Low <= 35.7252 )
							ret := 0.356498
						if( MFI_Low > 35.7252 )
							ret := 0.059553
					if( rsi1 > 64.79 )
						if( Positive_Money_Flow_Sum <= 3.51291e+07 )
							ret := 0.412893
						if( Positive_Money_Flow_Sum > 3.51291e+07 )
							ret := 0.044118
				if( Positive_Money_Flow > 589204 )
					if( rsi1 <= 75.8849 )
						if( MFI_Low <= 43.0325 )
							ret := 0.161176
						if( MFI_Low > 43.0325 )
							ret := -0.232258
					if( rsi1 > 75.8849 )
						if( MFI <= 87.1921 )
							ret := 0.424028
						if( MFI > 87.1921 )
							ret := -0.007407
			if( d_k > 2.46356 )
				if( MFI_Low <= 54.1501 )
					if( rsi1 <= 63.7128 )
						if( d <= 49.5811 )
							ret := 0.119158
						if( d > 49.5811 )
							ret := -0.154002
					if( rsi1 > 63.7128 )
						if( d <= 82.1181 )
							ret := 0.379584
						if( d > 82.1181 )
							ret := 0.124006
				if( MFI_Low > 54.1501 )
					if( rsi1 <= 67.9907 )
						if( Positive_Money_Flow <= 269217 )
							ret := -0.350759
						if( Positive_Money_Flow > 269217 )
							ret := -0.642263
					if( rsi1 > 67.9907 )
						if( Negative_Money_Flow_Sum <= 1.43388e+07 )
							ret := -0.232731
						if( Negative_Money_Flow_Sum > 1.43388e+07 )
							ret := 0.324138
	
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
float op_operation = decision_tree_0_UNIUSDT_1Hour_31dde72d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


