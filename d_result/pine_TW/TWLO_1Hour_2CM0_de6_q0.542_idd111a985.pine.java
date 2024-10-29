//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: TWLO_1Hour_2CM0_d111a985 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_1Hour_2CM0_d111a985", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_1Hour_d111a985(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Positive_Money_Flow <= 48718.7 )
		if( Negative_Money_Flow <= 7.4865e+07 )
			if( Positive_Money_Flow_Sum <= 2.56308e+08 )
				if( Money_Flow_Ratio <= 1.03049 )
					if( ad_mf <= -334744 )
						if( Negative_Money_Flow_Sum <= 1.55158e+08 )
							ret := -0.147727
						if( Negative_Money_Flow_Sum > 1.55158e+08 )
							ret := 0.288136
					if( ad_mf > -334744 )
						if( Positive_Money_Flow_Sum <= 2.52289e+08 )
							ret := 0.004524
						if( Positive_Money_Flow_Sum > 2.52289e+08 )
							ret := -0.774194 // sell
				if( Money_Flow_Ratio > 1.03049 )
					if( mf <= 0.063697 )
						if( Negative_Money_Flow <= 1.87926e+06 )
							ret := 0.353659
						if( Negative_Money_Flow > 1.87926e+06 )
							ret := 0.074007
					if( mf > 0.063697 )
						if( ad <= -209.651 )
							ret := 0.174644
						if( ad > -209.651 )
							ret := -0.087264
			if( Positive_Money_Flow_Sum > 2.56308e+08 )
				if( Typical_Price <= 400.85 )
					if( Money_Flow_Ratio <= 6.06598 )
						if( MFI <= 58.67 )
							ret := 0.252648
						if( MFI > 58.67 )
							ret := 0.059524
					if( Money_Flow_Ratio > 6.06598 )
						if( Positive_Money_Flow_Sum <= 5.85431e+08 )
							ret := 0.256831
						if( Positive_Money_Flow_Sum > 5.85431e+08 )
							ret := 0.695652
				if( Typical_Price > 400.85 )
					if( Negative_Money_Flow <= 5.049e+07 )
						if( Money_Flow_Ratio <= 0.385769 )
							ret := 0.000000
						if( Money_Flow_Ratio > 0.385769 )
							ret := -0.833333 // sell
					if( Negative_Money_Flow > 5.049e+07 )
						ret := 0.000000
		if( Negative_Money_Flow > 7.4865e+07 )
			if( Negative_Money_Flow <= 1.06677e+08 )
				if( Negative_Money_Flow_Sum <= 1.56449e+08 )
					if( ad_mf <= -18739.3 )
						if( MFI_High <= -6.72166 )
							ret := 0.074074
						if( MFI_High > -6.72166 )
							ret := 0.750000 // buy
					if( ad_mf > -18739.3 )
						if( Typical_Price <= 137.322 )
							ret := -1.000000 // sell
						if( Typical_Price > 137.322 )
							ret := -0.166667
				if( Negative_Money_Flow_Sum > 1.56449e+08 )
					if( Typical_Price <= 371.227 )
						if( ad_mf <= -411421 )
							ret := -0.409091
						if( ad_mf > -411421 )
							ret := -0.100152
					if( Typical_Price > 371.227 )
						if( mf <= 0.200253 )
							ret := -0.540000
						if( mf > 0.200253 )
							ret := -1.000000 // sell
			if( Negative_Money_Flow > 1.06677e+08 )
				if( mf <= 0.152755 )
					if( Raw_Money_Flow <= 3.78346e+08 )
						if( MFI_High <= -76.4086 )
							ret := 0.615385
						if( MFI_High > -76.4086 )
							ret := 0.108374
					if( Raw_Money_Flow > 3.78346e+08 )
						if( Money_Flow_Ratio <= 0.262626 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.262626 )
							ret := -0.200000
				if( mf > 0.152755 )
					if( MFI_Low <= 30.5546 )
						if( MFI_High <= -41.8865 )
							ret := 0.000000
						if( MFI_High > -41.8865 )
							ret := -0.904762 // sell
					if( MFI_Low > 30.5546 )
						if( Negative_Money_Flow_Sum <= 1.95827e+08 )
							ret := -0.760000 // sell
						if( Negative_Money_Flow_Sum > 1.95827e+08 )
							ret := 0.018182
	if( Positive_Money_Flow > 48718.7 )
		if( Money_Flow_Ratio <= 0.429136 )
			if( Negative_Money_Flow_Sum <= 9.2847e+08 )
				if( Money_Flow_Ratio <= 0.00991 )
					if( mf <= -0.53861 )
						ret := -1.000000 // sell
					if( mf > -0.53861 )
						if( Typical_Price <= 318.937 )
							ret := 0.790698 // buy
						if( Typical_Price > 318.937 )
							ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.00991 )
					if( Negative_Money_Flow <= 1.65157e+07 )
						if( MFI <= 11.8758 )
							ret := -0.516854
						if( MFI > 11.8758 )
							ret := -0.169100
					if( Negative_Money_Flow > 1.65157e+07 )
						ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 9.2847e+08 )
				if( Typical_Price <= 194.11 )
					if( Typical_Price <= 178.125 )
						if( Typical_Price <= 130.624 )
							ret := 0.043478
						if( Typical_Price > 130.624 )
							ret := -0.777778 // sell
					if( Typical_Price > 178.125 )
						ret := 0.875000 // buy
				if( Typical_Price > 194.11 )
					if( Negative_Money_Flow <= 3062.64 )
						if( mf <= -0.257944 )
							ret := -0.052632
						if( mf > -0.257944 )
							ret := -0.679245
					if( Negative_Money_Flow > 3062.64 )
						ret := -1.000000 // sell
		if( Money_Flow_Ratio > 0.429136 )
			if( Positive_Money_Flow <= 2.85058e+07 )
				if( Typical_Price <= 56.2557 )
					if( Raw_Money_Flow <= 6.88296e+06 )
						if( Raw_Money_Flow <= 69420.8 )
							ret := -0.407407
						if( Raw_Money_Flow > 69420.8 )
							ret := 0.527094
					if( Raw_Money_Flow > 6.88296e+06 )
						if( Negative_Money_Flow_Sum <= 7.64309e+07 )
							ret := 0.197368
						if( Negative_Money_Flow_Sum > 7.64309e+07 )
							ret := -0.260504
				if( Typical_Price > 56.2557 )
					if( Positive_Money_Flow_Sum <= 2.30416e+09 )
						if( ad <= 1486.05 )
							ret := -0.070312
						if( ad > 1486.05 )
							ret := -0.178871
					if( Positive_Money_Flow_Sum > 2.30416e+09 )
						if( Negative_Money_Flow_Sum <= 2.314e+09 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.314e+09 )
							ret := 0.000000
			if( Positive_Money_Flow > 2.85058e+07 )
				if( Positive_Money_Flow_Sum <= 1.22574e+09 )
					if( Positive_Money_Flow <= 1.28877e+08 )
						if( Raw_Money_Flow <= 7.88434e+07 )
							ret := 0.003238
						if( Raw_Money_Flow > 7.88434e+07 )
							ret := 0.188993
					if( Positive_Money_Flow > 1.28877e+08 )
						if( MFI_Low <= 39.5537 )
							ret := -0.387352
						if( MFI_Low > 39.5537 )
							ret := 0.057143
				if( Positive_Money_Flow_Sum > 1.22574e+09 )
					if( ad <= 1.51581e+06 )
						if( Money_Flow_Ratio <= 6.91337 )
							ret := -0.820000 // sell
						if( Money_Flow_Ratio > 6.91337 )
							ret := -0.037037
					if( ad > 1.51581e+06 )
						if( MFI <= 92.5536 )
							ret := 1.000000 // buy
						if( MFI > 92.5536 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_TWLO_1Hour_d111a985(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


