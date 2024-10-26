//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ABNB_1Min_2MS0_ac94ec83 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_1Min_2MS0_ac94ec83", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_1Min_ac94ec83(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Raw_Money_Flow <= 107038 )
		if( Negative_Money_Flow <= 7083.7 )
			if( Positive_Money_Flow <= 6812.72 )
				if( Negative_Money_Flow_Sum <= 1.05614e+08 )
					if( MFI_High <= 0.588094 )
						if( MFI_Low <= 48.9549 )
							ret := 0.305466
						if( MFI_Low > 48.9549 )
							ret := 0.791667 // buy
					if( MFI_High > 0.588094 )
						if( d_k <= -2.70464 )
							ret := 0.157895
						if( d_k > -2.70464 )
							ret := -0.568966
				if( Negative_Money_Flow_Sum > 1.05614e+08 )
					if( Negative_Money_Flow_Sum <= 1.27295e+08 )
						if( rsi1 <= 50.0202 )
							ret := -0.565217
						if( rsi1 > 50.0202 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.27295e+08 )
						ret := -0.150000
			if( Positive_Money_Flow > 6812.72 )
				if( Typical_Price <= 127.298 )
					if( d_k <= -4.48627 )
						if( Positive_Money_Flow_Sum <= 155455 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 155455 )
							ret := -0.201893
					if( d_k > -4.48627 )
						if( Negative_Money_Flow_Sum <= 4.50401e+07 )
							ret := 0.107965
						if( Negative_Money_Flow_Sum > 4.50401e+07 )
							ret := 0.617647
				if( Typical_Price > 127.298 )
					if( rsi1 <= 44.948 )
						if( Raw_Money_Flow <= 40185.6 )
							ret := 0.316667
						if( Raw_Money_Flow > 40185.6 )
							ret := -0.149171
					if( rsi1 > 44.948 )
						if( smoothK_k <= 89.5231 )
							ret := -0.374552
						if( smoothK_k > 89.5231 )
							ret := 0.038168
		if( Negative_Money_Flow > 7083.7 )
			if( smoothK_k <= -1.85053 )
				if( Negative_Money_Flow_Sum <= 1.06043e+08 )
					if( rsi1 <= 32.6797 )
						ret := -0.760000 // sell
					if( rsi1 > 32.6797 )
						ret := 0.538462
				if( Negative_Money_Flow_Sum > 1.06043e+08 )
					ret := -1.000000 // sell
			if( smoothK_k > -1.85053 )
				if( Positive_Money_Flow <= 13.3616 )
					if( Positive_Money_Flow_Sum <= 6.31642e+06 )
						if( Typical_Price <= 143.263 )
							ret := 0.429443
						if( Typical_Price > 143.263 )
							ret := 0.179700
					if( Positive_Money_Flow_Sum > 6.31642e+06 )
						if( Negative_Money_Flow <= 17299.3 )
							ret := 0.148936
						if( Negative_Money_Flow > 17299.3 )
							ret := 0.654297
				if( Positive_Money_Flow > 13.3616 )
					if( Typical_Price <= 144.646 )
						if( MFI_High <= -18.3959 )
							ret := 0.389163
						if( MFI_High > -18.3959 )
							ret := -0.062857
					if( Typical_Price > 144.646 )
						if( Raw_Money_Flow <= 84238.7 )
							ret := 0.000000
						if( Raw_Money_Flow > 84238.7 )
							ret := -0.812500 // sell
	if( Raw_Money_Flow > 107038 )
		if( rsi1 <= 46.234 )
			if( Positive_Money_Flow_Sum <= 1.76638e+07 )
				if( Positive_Money_Flow_Sum <= 1.65919e+06 )
					if( rsi1 <= 31.8623 )
						if( Positive_Money_Flow <= 1758 )
							ret := 0.139068
						if( Positive_Money_Flow > 1758 )
							ret := 0.488166
					if( rsi1 > 31.8623 )
						if( Negative_Money_Flow_Sum <= 877789 )
							ret := 0.379085
						if( Negative_Money_Flow_Sum > 877789 )
							ret := -0.014286
				if( Positive_Money_Flow_Sum > 1.65919e+06 )
					if( MFI_High <= -24.2851 )
						if( Negative_Money_Flow_Sum <= 6.14441e+07 )
							ret := -0.012518
						if( Negative_Money_Flow_Sum > 6.14441e+07 )
							ret := 0.350993
					if( MFI_High > -24.2851 )
						if( rsi1 <= 32.2347 )
							ret := 0.512195
						if( rsi1 > 32.2347 )
							ret := 0.078541
			if( Positive_Money_Flow_Sum > 1.76638e+07 )
				if( Raw_Money_Flow <= 4.47694e+06 )
					if( Typical_Price <= 142.787 )
						if( Negative_Money_Flow <= 3.27077e+06 )
							ret := 0.185031
						if( Negative_Money_Flow > 3.27077e+06 )
							ret := 0.809524 // buy
					if( Typical_Price > 142.787 )
						if( Typical_Price <= 146.795 )
							ret := 0.766234 // buy
						if( Typical_Price > 146.795 )
							ret := 0.416357
				if( Raw_Money_Flow > 4.47694e+06 )
					if( d_k <= 14.7175 )
						if( Negative_Money_Flow_Sum <= 5.43526e+07 )
							ret := -0.113879
						if( Negative_Money_Flow_Sum > 5.43526e+07 )
							ret := 0.332203
					if( d_k > 14.7175 )
						if( Positive_Money_Flow_Sum <= 3.22854e+07 )
							ret := -0.214286
						if( Positive_Money_Flow_Sum > 3.22854e+07 )
							ret := -0.970588 // sell
		if( rsi1 > 46.234 )
			if( Negative_Money_Flow_Sum <= 4.32426e+07 )
				if( smoothD_d <= 50.1187 )
					if( Positive_Money_Flow_Sum <= 2.42515e+06 )
						if( d_k <= 8.86295 )
							ret := -0.364662
						if( d_k > 8.86295 )
							ret := 0.128440
					if( Positive_Money_Flow_Sum > 2.42515e+06 )
						if( Typical_Price <= 154.122 )
							ret := -0.075726
						if( Typical_Price > 154.122 )
							ret := 0.123547
				if( smoothD_d > 50.1187 )
					if( rsi1 <= 60.0558 )
						if( Negative_Money_Flow <= 5.03739e+06 )
							ret := 0.030168
						if( Negative_Money_Flow > 5.03739e+06 )
							ret := 0.425926
					if( rsi1 > 60.0558 )
						if( rsi1 <= 83.8062 )
							ret := -0.070266
						if( rsi1 > 83.8062 )
							ret := 0.091375
			if( Negative_Money_Flow_Sum > 4.32426e+07 )
				if( Money_Flow_Ratio <= 0.726075 )
					if( rsi1 <= 56.3007 )
						if( Money_Flow_Ratio <= 0.111449 )
							ret := -0.528302
						if( Money_Flow_Ratio > 0.111449 )
							ret := 0.245714
					if( rsi1 > 56.3007 )
						if( d <= 72.2754 )
							ret := -0.870588 // sell
						if( d > 72.2754 )
							ret := -0.164179
				if( Money_Flow_Ratio > 0.726075 )
					if( Raw_Money_Flow <= 1.22966e+07 )
						if( MFI_Low <= 35.5513 )
							ret := -0.906977 // sell
						if( MFI_Low > 35.5513 )
							ret := -0.495327
					if( Raw_Money_Flow > 1.22966e+07 )
						if( Raw_Money_Flow <= 1.5865e+07 )
							ret := 0.171053
						if( Raw_Money_Flow > 1.5865e+07 )
							ret := -0.578947
	
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
float op_operation = decision_tree_0_ABNB_1Min_ac94ec83(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


