//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: ABNB_1Hour_2CM0_c6733e10 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_1Hour_2CM0_c6733e10", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_1Hour_c6733e10(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Typical_Price <= 118.067 )
		if( MFI_Low <= -4.82897 )
			if( MFI_High <= -65.649 )
				if( Raw_Money_Flow <= 91189.8 )
					ret := -0.764706 // sell
				if( Raw_Money_Flow > 91189.8 )
					if( Positive_Money_Flow_Sum <= 8.36573e+07 )
						if( Typical_Price <= 116.236 )
							ret := 0.283871
						if( Typical_Price > 116.236 )
							ret := -0.450000
					if( Positive_Money_Flow_Sum > 8.36573e+07 )
						if( Raw_Money_Flow <= 2.22293e+08 )
							ret := -0.347826
						if( Raw_Money_Flow > 2.22293e+08 )
							ret := -1.000000 // sell
			if( MFI_High > -65.649 )
				if( Raw_Money_Flow <= 2.33648e+07 )
					if( mf <= -0.541763 )
						ret := -0.900000 // sell
					if( mf > -0.541763 )
						ret := -1.000000 // sell
				if( Raw_Money_Flow > 2.33648e+07 )
					ret := -0.600000
		if( MFI_Low > -4.82897 )
			if( MFI_Low <= 6.2437 )
				if( Raw_Money_Flow <= 8.19533e+06 )
					if( Positive_Money_Flow_Sum <= 6.56704e+07 )
						ret := -0.444444
					if( Positive_Money_Flow_Sum > 6.56704e+07 )
						if( Typical_Price <= 116.958 )
							ret := 0.716667 // buy
						if( Typical_Price > 116.958 )
							ret := -0.151515
				if( Raw_Money_Flow > 8.19533e+06 )
					if( MFI_Low <= 4.57776 )
						if( Raw_Money_Flow <= 5.20177e+07 )
							ret := -0.272727
						if( Raw_Money_Flow > 5.20177e+07 )
							ret := 0.198718
					if( MFI_Low > 4.57776 )
						if( Typical_Price <= 113.771 )
							ret := 0.809524 // buy
						if( Typical_Price > 113.771 )
							ret := 0.214286
			if( MFI_Low > 6.2437 )
				if( Raw_Money_Flow <= 3.05865e+06 )
					if( Positive_Money_Flow_Sum <= 3.65089e+08 )
						if( Negative_Money_Flow_Sum <= 1.24371e+08 )
							ret := -0.650943
						if( Negative_Money_Flow_Sum > 1.24371e+08 )
							ret := -0.031633
					if( Positive_Money_Flow_Sum > 3.65089e+08 )
						if( MFI <= 57.54 )
							ret := 0.623967
						if( MFI > 57.54 )
							ret := 0.012963
				if( Raw_Money_Flow > 3.05865e+06 )
					if( Raw_Money_Flow <= 1.14574e+08 )
						if( ad <= -662240 )
							ret := -0.360000
						if( ad > -662240 )
							ret := 0.266164
					if( Raw_Money_Flow > 1.14574e+08 )
						if( Negative_Money_Flow_Sum <= 4.19644e+08 )
							ret := 0.123377
						if( Negative_Money_Flow_Sum > 4.19644e+08 )
							ret := -0.420635
	if( Typical_Price > 118.067 )
		if( mf <= 0.187339 )
			if( Money_Flow_Ratio <= 0.146904 )
				if( Typical_Price <= 143.596 )
					if( mf <= -0.147833 )
						if( Negative_Money_Flow_Sum <= 6.78949e+08 )
							ret := -0.671875
						if( Negative_Money_Flow_Sum > 6.78949e+08 )
							ret := 0.219512
					if( mf > -0.147833 )
						if( Positive_Money_Flow_Sum <= 9.78106e+07 )
							ret := 0.666667
						if( Positive_Money_Flow_Sum > 9.78106e+07 )
							ret := -0.545455
				if( Typical_Price > 143.596 )
					if( Raw_Money_Flow <= 3.29542e+06 )
						if( MFI <= 0.158087 )
							ret := 0.222222
						if( MFI > 0.158087 )
							ret := -0.761317 // sell
					if( Raw_Money_Flow > 3.29542e+06 )
						if( Typical_Price <= 164.809 )
							ret := -0.099448
						if( Typical_Price > 164.809 )
							ret := -0.470588
			if( Money_Flow_Ratio > 0.146904 )
				if( Typical_Price <= 202.566 )
					if( Positive_Money_Flow_Sum <= 4.25122e+09 )
						if( Positive_Money_Flow_Sum <= 1.87839e+09 )
							ret := -0.053068
						if( Positive_Money_Flow_Sum > 1.87839e+09 )
							ret := -0.613139
					if( Positive_Money_Flow_Sum > 4.25122e+09 )
						if( Negative_Money_Flow <= 276585 )
							ret := 0.928571 // buy
						if( Negative_Money_Flow > 276585 )
							ret := 1.000000 // buy
				if( Typical_Price > 202.566 )
					if( Positive_Money_Flow_Sum <= 3.38205e+08 )
						ret := -0.066667
					if( Positive_Money_Flow_Sum > 3.38205e+08 )
						if( mf <= 0.133514 )
							ret := -0.855556 // sell
						if( mf > 0.133514 )
							ret := 0.076923
		if( mf > 0.187339 )
			if( ad <= 361.057 )
				if( Raw_Money_Flow <= 4.74013e+07 )
					if( Raw_Money_Flow <= 499563 )
						if( Negative_Money_Flow_Sum <= 2.16881e+08 )
							ret := 0.391111
						if( Negative_Money_Flow_Sum > 2.16881e+08 )
							ret := 0.057471
					if( Raw_Money_Flow > 499563 )
						if( Positive_Money_Flow_Sum <= 2.06009e+09 )
							ret := 0.494071
						if( Positive_Money_Flow_Sum > 2.06009e+09 )
							ret := -0.382353
				if( Raw_Money_Flow > 4.74013e+07 )
					if( Negative_Money_Flow_Sum <= 1.90251e+09 )
						if( mf <= 0.32331 )
							ret := -0.097633
						if( mf > 0.32331 )
							ret := 0.311321
					if( Negative_Money_Flow_Sum > 1.90251e+09 )
						ret := -1.000000 // sell
			if( ad > 361.057 )
				if( Positive_Money_Flow <= 3.42843e+08 )
					if( MFI <= 62.0699 )
						if( Positive_Money_Flow <= 2.38931e+07 )
							ret := 0.224949
						if( Positive_Money_Flow > 2.38931e+07 )
							ret := -0.195286
					if( MFI > 62.0699 )
						if( Raw_Money_Flow <= 1.36643e+08 )
							ret := -0.192396
						if( Raw_Money_Flow > 1.36643e+08 )
							ret := 0.105660
				if( Positive_Money_Flow > 3.42843e+08 )
					if( Typical_Price <= 184.644 )
						if( MFI <= 69.3529 )
							ret := 0.066667
						if( MFI > 69.3529 )
							ret := 0.943396 // buy
					if( Typical_Price > 184.644 )
						ret := -0.555556
	
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
float op_operation = decision_tree_0_ABNB_1Hour_c6733e10(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


