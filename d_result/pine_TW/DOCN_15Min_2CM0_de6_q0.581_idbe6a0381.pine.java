//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: DOCN_15Min_2CM0_be6a0381 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOCN_15Min_2CM0_be6a0381", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOCN_15Min_be6a0381(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Positive_Money_Flow <= 114.816 )
		if( Raw_Money_Flow <= 44741.1 )
			if( Positive_Money_Flow_Sum <= 4.55562e+06 )
				if( Negative_Money_Flow_Sum <= 174236 )
					if( Typical_Price <= 28.9083 )
						ret := -1.000000 // sell
					if( Typical_Price > 28.9083 )
						if( Positive_Money_Flow_Sum <= 288623 )
							ret := 0.914286 // buy
						if( Positive_Money_Flow_Sum > 288623 )
							ret := -0.333333
				if( Negative_Money_Flow_Sum > 174236 )
					if( MFI <= 10.2094 )
						if( Negative_Money_Flow_Sum <= 1.65315e+07 )
							ret := -0.185185
						if( Negative_Money_Flow_Sum > 1.65315e+07 )
							ret := 0.469136
					if( MFI > 10.2094 )
						if( mf <= -0.324783 )
							ret := -0.812500 // sell
						if( mf > -0.324783 )
							ret := -0.269625
			if( Positive_Money_Flow_Sum > 4.55562e+06 )
				if( ad <= -3.85548 )
					if( mf <= -0.288373 )
						if( Positive_Money_Flow_Sum <= 5.51649e+06 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 5.51649e+06 )
							ret := -0.142857
					if( mf > -0.288373 )
						if( Negative_Money_Flow_Sum <= 1.71177e+06 )
							ret := -0.027778
						if( Negative_Money_Flow_Sum > 1.71177e+06 )
							ret := 0.621094
				if( ad > -3.85548 )
					if( Negative_Money_Flow_Sum <= 3.06945e+07 )
						if( Negative_Money_Flow_Sum <= 2.98804e+07 )
							ret := 0.313464
						if( Negative_Money_Flow_Sum > 2.98804e+07 )
							ret := 0.930233 // buy
					if( Negative_Money_Flow_Sum > 3.06945e+07 )
						if( Positive_Money_Flow_Sum <= 4.03203e+07 )
							ret := 0.206897
						if( Positive_Money_Flow_Sum > 4.03203e+07 )
							ret := -0.261538
		if( Raw_Money_Flow > 44741.1 )
			if( Positive_Money_Flow_Sum <= 555024 )
				if( Raw_Money_Flow <= 133235 )
					if( mf <= -0.301203 )
						if( Negative_Money_Flow_Sum <= 279840 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 279840 )
							ret := -0.859649 // sell
					if( mf > -0.301203 )
						if( ad_mf <= 576.797 )
							ret := 0.373494
						if( ad_mf > 576.797 )
							ret := -0.444444
				if( Raw_Money_Flow > 133235 )
					if( Money_Flow_Ratio <= 0.008753 )
						if( Negative_Money_Flow_Sum <= 8.27606e+07 )
							ret := -0.104895
						if( Negative_Money_Flow_Sum > 8.27606e+07 )
							ret := 0.818182 // buy
					if( Money_Flow_Ratio > 0.008753 )
						if( Typical_Price <= 31.0183 )
							ret := -0.074074
						if( Typical_Price > 31.0183 )
							ret := 0.605187
			if( Positive_Money_Flow_Sum > 555024 )
				if( Positive_Money_Flow_Sum <= 3.76624e+06 )
					if( Typical_Price <= 57.3046 )
						if( ad_mf <= -18880.2 )
							ret := 0.164425
						if( ad_mf > -18880.2 )
							ret := -0.117459
					if( Typical_Price > 57.3046 )
						if( Raw_Money_Flow <= 2.62903e+07 )
							ret := -0.518987
						if( Raw_Money_Flow > 2.62903e+07 )
							ret := 0.285714
				if( Positive_Money_Flow_Sum > 3.76624e+06 )
					if( Negative_Money_Flow_Sum <= 2.83052e+06 )
						if( MFI <= 97.4999 )
							ret := 0.315556
						if( MFI > 97.4999 )
							ret := 0.795455 // buy
					if( Negative_Money_Flow_Sum > 2.83052e+06 )
						if( Raw_Money_Flow <= 235932 )
							ret := 0.265806
						if( Raw_Money_Flow > 235932 )
							ret := 0.030530
	if( Positive_Money_Flow > 114.816 )
		if( Positive_Money_Flow <= 281684 )
			if( ad_mf <= -0.268071 )
				if( Typical_Price <= 31.0631 )
					if( Money_Flow_Ratio <= 2.01663 )
						if( mf <= -0.10835 )
							ret := -0.820000 // sell
						if( mf > -0.10835 )
							ret := -0.353846
					if( Money_Flow_Ratio > 2.01663 )
						if( Typical_Price <= 24.3729 )
							ret := -0.909091 // sell
						if( Typical_Price > 24.3729 )
							ret := 0.201439
				if( Typical_Price > 31.0631 )
					if( mf <= -0.138985 )
						if( Typical_Price <= 81.5092 )
							ret := 0.267773
						if( Typical_Price > 81.5092 )
							ret := -0.600000
					if( mf > -0.138985 )
						if( Money_Flow_Ratio <= 5.27074 )
							ret := -0.138767
						if( Money_Flow_Ratio > 5.27074 )
							ret := 0.186851
			if( ad_mf > -0.268071 )
				if( Positive_Money_Flow_Sum <= 1.32401e+08 )
					if( mf <= 0.39119 )
						if( Negative_Money_Flow <= 12.8402 )
							ret := -0.306060
						if( Negative_Money_Flow > 12.8402 )
							ret := -0.139135
					if( mf > 0.39119 )
						if( Positive_Money_Flow_Sum <= 2.80627e+07 )
							ret := -0.868132 // sell
						if( Positive_Money_Flow_Sum > 2.80627e+07 )
							ret := 0.571429
				if( Positive_Money_Flow_Sum > 1.32401e+08 )
					if( Negative_Money_Flow_Sum <= 3.90567e+07 )
						if( Typical_Price <= 80.485 )
							ret := 1.000000 // buy
						if( Typical_Price > 80.485 )
							ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.90567e+07 )
						ret := -0.722222 // sell
		if( Positive_Money_Flow > 281684 )
			if( ad_mf <= 15416.1 )
				if( Positive_Money_Flow_Sum <= 3.59946e+07 )
					if( Negative_Money_Flow_Sum <= 2.63358e+07 )
						if( Negative_Money_Flow_Sum <= 2.19487e+07 )
							ret := 0.011737
						if( Negative_Money_Flow_Sum > 2.19487e+07 )
							ret := 0.402640
					if( Negative_Money_Flow_Sum > 2.63358e+07 )
						if( Money_Flow_Ratio <= 0.188033 )
							ret := -0.712644 // sell
						if( Money_Flow_Ratio > 0.188033 )
							ret := -0.090406
				if( Positive_Money_Flow_Sum > 3.59946e+07 )
					if( Money_Flow_Ratio <= 3.98842 )
						if( Negative_Money_Flow <= 8.25748e+06 )
							ret := 0.391111
						if( Negative_Money_Flow > 8.25748e+06 )
							ret := -1.000000 // sell
					if( Money_Flow_Ratio > 3.98842 )
						if( Negative_Money_Flow <= 7344.47 )
							ret := 0.068841
						if( Negative_Money_Flow > 7344.47 )
							ret := -0.854545 // sell
			if( ad_mf > 15416.1 )
				if( Typical_Price <= 34.3109 )
					if( Positive_Money_Flow <= 5.78641e+06 )
						if( Money_Flow_Ratio <= 3.59156 )
							ret := 0.080531
						if( Money_Flow_Ratio > 3.59156 )
							ret := -0.335260
					if( Positive_Money_Flow > 5.78641e+06 )
						if( ad <= 266050 )
							ret := 0.676190
						if( ad > 266050 )
							ret := -0.500000
				if( Typical_Price > 34.3109 )
					if( Positive_Money_Flow_Sum <= 2.86992e+07 )
						if( mf <= 0.25214 )
							ret := -0.137174
						if( mf > 0.25214 )
							ret := -0.360360
					if( Positive_Money_Flow_Sum > 2.86992e+07 )
						if( mf <= 0.080058 )
							ret := 0.205592
						if( mf > 0.080058 )
							ret := -0.089623
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_DOCN_15Min_be6a0381(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


