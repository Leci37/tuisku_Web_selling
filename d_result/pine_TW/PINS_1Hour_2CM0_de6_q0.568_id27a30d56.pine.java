//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: PINS_1Hour_2CM0_27a30d56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_1Hour_2CM0_27a30d56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_1Hour_27a30d56(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow <= 2548.51 )
		if( Negative_Money_Flow_Sum <= 3.28537e+07 )
			if( MFI_High <= -8.77095 )
				if( ad_mf <= -5291.33 )
					if( mf <= -0.058741 )
						ret := 0.500000
					if( mf > -0.058741 )
						ret := -0.428571
				if( ad_mf > -5291.33 )
					if( Positive_Money_Flow_Sum <= 2.95687e+07 )
						ret := -0.125000
					if( Positive_Money_Flow_Sum > 2.95687e+07 )
						if( mf <= 0.155856 )
							ret := 0.835616 // buy
						if( mf > 0.155856 )
							ret := 0.416667
			if( MFI_High > -8.77095 )
				if( MFI_High <= 0.761439 )
					if( Money_Flow_Ratio <= 2.96564 )
						if( ad_mf <= 82134.2 )
							ret := 0.000000
						if( ad_mf > 82134.2 )
							ret := -0.272727
					if( Money_Flow_Ratio > 2.96564 )
						if( ad <= 1725 )
							ret := -0.931818 // sell
						if( ad > 1725 )
							ret := -0.384615
				if( MFI_High > 0.761439 )
					if( Typical_Price <= 27.7435 )
						if( Money_Flow_Ratio <= 89.447 )
							ret := 0.421212
						if( Money_Flow_Ratio > 89.447 )
							ret := -0.089888
					if( Typical_Price > 27.7435 )
						if( Typical_Price <= 30.5452 )
							ret := -0.528302
						if( Typical_Price > 30.5452 )
							ret := 0.063492
		if( Negative_Money_Flow_Sum > 3.28537e+07 )
			if( Positive_Money_Flow <= 7.54356e+06 )
				if( mf <= 0.367411 )
					if( Negative_Money_Flow_Sum <= 5.075e+07 )
						if( Positive_Money_Flow_Sum <= 2.03074e+08 )
							ret := -0.320856
						if( Positive_Money_Flow_Sum > 2.03074e+08 )
							ret := -0.927536 // sell
					if( Negative_Money_Flow_Sum > 5.075e+07 )
						if( Negative_Money_Flow_Sum <= 1.08573e+08 )
							ret := -0.041434
						if( Negative_Money_Flow_Sum > 1.08573e+08 )
							ret := -0.237826
				if( mf > 0.367411 )
					if( MFI <= 87.5413 )
						if( MFI_High <= -8.782 )
							ret := 0.028169
						if( MFI_High > -8.782 )
							ret := 0.524390
					if( MFI > 87.5413 )
						if( Typical_Price <= 51.4332 )
							ret := -0.902439 // sell
						if( Typical_Price > 51.4332 )
							ret := -0.050000
			if( Positive_Money_Flow > 7.54356e+06 )
				if( mf <= -0.359413 )
					if( Negative_Money_Flow_Sum <= 3.47759e+08 )
						if( Typical_Price <= 22.9802 )
							ret := 0.714286 // buy
						if( Typical_Price > 22.9802 )
							ret := -0.035714
					if( Negative_Money_Flow_Sum > 3.47759e+08 )
						if( ad_mf <= 970954 )
							ret := 1.000000 // buy
						if( ad_mf > 970954 )
							ret := 0.444444
				if( mf > -0.359413 )
					if( mf <= 0.009399 )
						if( Positive_Money_Flow_Sum <= 1.21379e+08 )
							ret := -0.035171
						if( Positive_Money_Flow_Sum > 1.21379e+08 )
							ret := -0.201389
					if( mf > 0.009399 )
						if( Negative_Money_Flow_Sum <= 1.74206e+08 )
							ret := -0.062989
						if( Negative_Money_Flow_Sum > 1.74206e+08 )
							ret := 0.124587
	if( Negative_Money_Flow > 2548.51 )
		if( Positive_Money_Flow_Sum <= 5.61438e+08 )
			if( Negative_Money_Flow_Sum <= 1.81037e+08 )
				if( Positive_Money_Flow_Sum <= 1.6091e+08 )
					if( Money_Flow_Ratio <= 4.62023 )
						if( Positive_Money_Flow <= 72231.8 )
							ret := 0.068590
						if( Positive_Money_Flow > 72231.8 )
							ret := 0.342037
					if( Money_Flow_Ratio > 4.62023 )
						if( ad <= 157084 )
							ret := 0.702703 // buy
						if( ad > 157084 )
							ret := -0.333333
				if( Positive_Money_Flow_Sum > 1.6091e+08 )
					if( MFI_Low <= 36.3489 )
						if( mf <= -0.021161 )
							ret := 0.000000
						if( mf > -0.021161 )
							ret := -0.556250
					if( MFI_Low > 36.3489 )
						if( Money_Flow_Ratio <= 1.32535 )
							ret := 0.693878
						if( Money_Flow_Ratio > 1.32535 )
							ret := -0.022737
			if( Negative_Money_Flow_Sum > 1.81037e+08 )
				if( Typical_Price <= 21.4451 )
					if( Positive_Money_Flow_Sum <= 9.96573e+07 )
						if( MFI <= 27.0232 )
							ret := 0.288321
						if( MFI > 27.0232 )
							ret := -0.705882 // sell
					if( Positive_Money_Flow_Sum > 9.96573e+07 )
						if( MFI_High <= -27.4754 )
							ret := 0.631579
						if( MFI_High > -27.4754 )
							ret := -0.061538
				if( Typical_Price > 21.4451 )
					if( ad_mf <= 347.97 )
						if( Typical_Price <= 71.979 )
							ret := 0.175148
						if( Typical_Price > 71.979 )
							ret := -0.118211
					if( ad_mf > 347.97 )
						if( Negative_Money_Flow_Sum <= 1.52519e+09 )
							ret := 0.034392
						if( Negative_Money_Flow_Sum > 1.52519e+09 )
							ret := -1.000000 // sell
		if( Positive_Money_Flow_Sum > 5.61438e+08 )
			if( MFI <= 65.8774 )
				if( ad_mf <= 2.69549e+06 )
					if( Negative_Money_Flow <= 110662 )
						if( Positive_Money_Flow_Sum <= 7.57737e+08 )
							ret := -0.071429
						if( Positive_Money_Flow_Sum > 7.57737e+08 )
							ret := 0.615385
					if( Negative_Money_Flow > 110662 )
						if( mf <= -0.146046 )
							ret := -0.177778
						if( mf > -0.146046 )
							ret := -0.707031 // sell
				if( ad_mf > 2.69549e+06 )
					ret := 1.000000 // buy
			if( MFI > 65.8774 )
				if( Positive_Money_Flow_Sum <= 1.37733e+09 )
					if( Raw_Money_Flow <= 4.83354e+07 )
						if( Typical_Price <= 66.2626 )
							ret := -0.311558
						if( Typical_Price > 66.2626 )
							ret := 0.260563
					if( Raw_Money_Flow > 4.83354e+07 )
						if( Positive_Money_Flow_Sum <= 9.87755e+08 )
							ret := 0.107143
						if( Positive_Money_Flow_Sum > 9.87755e+08 )
							ret := 0.862745 // buy
				if( Positive_Money_Flow_Sum > 1.37733e+09 )
					if( Positive_Money_Flow_Sum <= 1.53685e+09 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.53685e+09 )
						if( ad <= 492275 )
							ret := 0.200000
						if( ad > 492275 )
							ret := -0.833333 // sell
	
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
float op_operation = decision_tree_0_PINS_1Hour_27a30d56(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


