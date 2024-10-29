//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: ABNB_30Min_2CM0_6da52ab9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_30Min_2CM0_6da52ab9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_30Min_6da52ab9(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Typical_Price <= 116.572 )
		if( Negative_Money_Flow_Sum <= 3.30694e+08 )
			if( Raw_Money_Flow <= 825128 )
				if( Negative_Money_Flow_Sum <= 3.36966e+06 )
					if( Negative_Money_Flow_Sum <= 1.44025e+06 )
						if( Money_Flow_Ratio <= 0.842514 )
							ret := -0.888889 // sell
						if( Money_Flow_Ratio > 0.842514 )
							ret := 0.182609
					if( Negative_Money_Flow_Sum > 1.44025e+06 )
						if( Positive_Money_Flow_Sum <= 1.13714e+08 )
							ret := -0.915254 // sell
						if( Positive_Money_Flow_Sum > 1.13714e+08 )
							ret := -0.117647
				if( Negative_Money_Flow_Sum > 3.36966e+06 )
					if( Raw_Money_Flow <= 128313 )
						if( Positive_Money_Flow <= 97196.3 )
							ret := 0.010924
						if( Positive_Money_Flow > 97196.3 )
							ret := -0.402778
					if( Raw_Money_Flow > 128313 )
						if( Negative_Money_Flow <= 43.5008 )
							ret := 0.049296
						if( Negative_Money_Flow > 43.5008 )
							ret := 0.278008
			if( Raw_Money_Flow > 825128 )
				if( Positive_Money_Flow_Sum <= 3.38866e+08 )
					if( MFI_Low <= 50.9966 )
						if( mf <= 0.348302 )
							ret := 0.208717
						if( mf > 0.348302 )
							ret := -0.333333
					if( MFI_Low > 50.9966 )
						if( Positive_Money_Flow_Sum <= 2.29782e+08 )
							ret := 0.289644
						if( Positive_Money_Flow_Sum > 2.29782e+08 )
							ret := 0.565371
				if( Positive_Money_Flow_Sum > 3.38866e+08 )
					if( Negative_Money_Flow <= 4.62466e+07 )
						if( Positive_Money_Flow_Sum <= 3.87878e+08 )
							ret := -0.464000
						if( Positive_Money_Flow_Sum > 3.87878e+08 )
							ret := 0.044872
					if( Negative_Money_Flow > 4.62466e+07 )
						if( Positive_Money_Flow_Sum <= 3.75951e+08 )
							ret := -0.222222
						if( Positive_Money_Flow_Sum > 3.75951e+08 )
							ret := 0.542857
		if( Negative_Money_Flow_Sum > 3.30694e+08 )
			if( mf <= -0.313003 )
				if( Typical_Price <= 113.68 )
					if( Raw_Money_Flow <= 3.58459e+06 )
						if( mf <= -0.352658 )
							ret := -0.361702
						if( mf > -0.352658 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 3.58459e+06 )
						if( MFI_Low <= 9.49176 )
							ret := -0.728972 // sell
						if( MFI_Low > 9.49176 )
							ret := -0.111111
				if( Typical_Price > 113.68 )
					if( MFI_Low <= -1.34414 )
						if( MFI_High <= -69.3384 )
							ret := 0.700000 // buy
						if( MFI_High > -69.3384 )
							ret := -0.333333
					if( MFI_Low > -1.34414 )
						ret := 0.875000 // buy
			if( mf > -0.313003 )
				if( Negative_Money_Flow_Sum <= 7.5901e+08 )
					if( ad_mf <= -2.02853e+06 )
						ret := 1.000000 // buy
					if( ad_mf > -2.02853e+06 )
						if( Positive_Money_Flow <= 14176.1 )
							ret := 0.019355
						if( Positive_Money_Flow > 14176.1 )
							ret := -0.235507
				if( Negative_Money_Flow_Sum > 7.5901e+08 )
					if( Positive_Money_Flow <= 3.09489e+07 )
						if( Negative_Money_Flow_Sum <= 1.01423e+09 )
							ret := 0.780488 // buy
						if( Negative_Money_Flow_Sum > 1.01423e+09 )
							ret := 0.000000
					if( Positive_Money_Flow > 3.09489e+07 )
						if( MFI_High <= -60.7943 )
							ret := -0.600000
						if( MFI_High > -60.7943 )
							ret := -1.000000 // sell
	if( Typical_Price > 116.572 )
		if( MFI_High <= 17.9932 )
			if( Money_Flow_Ratio <= 0.045715 )
				if( Negative_Money_Flow <= 653343 )
					if( Negative_Money_Flow_Sum <= 8.54007e+08 )
						if( Positive_Money_Flow_Sum <= 1.78029e+06 )
							ret := -0.266497
						if( Positive_Money_Flow_Sum > 1.78029e+06 )
							ret := -0.595890
					if( Negative_Money_Flow_Sum > 8.54007e+08 )
						if( ad <= 2244.44 )
							ret := 0.791667 // buy
						if( ad > 2244.44 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow > 653343 )
					if( MFI <= 0.394985 )
						if( mf <= -0.258501 )
							ret := 0.736842 // buy
						if( mf > -0.258501 )
							ret := -0.047619
					if( MFI > 0.394985 )
						if( Positive_Money_Flow_Sum <= 1.19407e+07 )
							ret := -0.219697
						if( Positive_Money_Flow_Sum > 1.19407e+07 )
							ret := 0.400000
			if( Money_Flow_Ratio > 0.045715 )
				if( ad_mf <= 0.29019 )
					if( Raw_Money_Flow <= 1.41468e+07 )
						if( Typical_Price <= 160.653 )
							ret := 0.117869
						if( Typical_Price > 160.653 )
							ret := -0.031310
					if( Raw_Money_Flow > 1.41468e+07 )
						if( Negative_Money_Flow_Sum <= 2.13191e+08 )
							ret := 0.021781
						if( Negative_Money_Flow_Sum > 2.13191e+08 )
							ret := -0.142407
				if( ad_mf > 0.29019 )
					if( Negative_Money_Flow_Sum <= 1.34128e+07 )
						if( Raw_Money_Flow <= 1.51634e+08 )
							ret := -0.231438
						if( Raw_Money_Flow > 1.51634e+08 )
							ret := 0.492308
					if( Negative_Money_Flow_Sum > 1.34128e+07 )
						if( Raw_Money_Flow <= 59542.4 )
							ret := -0.253298
						if( Raw_Money_Flow > 59542.4 )
							ret := -0.056793
		if( MFI_High > 17.9932 )
			if( Typical_Price <= 183.016 )
				if( MFI_High <= 19.8291 )
					if( Positive_Money_Flow_Sum <= 1.8012e+08 )
						if( Raw_Money_Flow <= 236990 )
							ret := 0.571429
						if( Raw_Money_Flow > 236990 )
							ret := -0.025281
					if( Positive_Money_Flow_Sum > 1.8012e+08 )
						if( Positive_Money_Flow_Sum <= 2.24932e+08 )
							ret := 0.665116
						if( Positive_Money_Flow_Sum > 2.24932e+08 )
							ret := 0.279522
				if( MFI_High > 19.8291 )
					if( mf <= -0.116722 )
						ret := 0.636364
					if( mf > -0.116722 )
						if( Negative_Money_Flow_Sum <= 593336 )
							ret := -0.573770
						if( Negative_Money_Flow_Sum > 593336 )
							ret := 0.200000
			if( Typical_Price > 183.016 )
				if( ad <= -137989 )
					if( Raw_Money_Flow <= 1.98196e+08 )
						ret := 0.916667 // buy
					if( Raw_Money_Flow > 1.98196e+08 )
						ret := -1.000000 // sell
				if( ad > -137989 )
					if( Positive_Money_Flow_Sum <= 1.58004e+08 )
						if( Positive_Money_Flow_Sum <= 1.38564e+08 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.38564e+08 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.58004e+08 )
						if( Negative_Money_Flow_Sum <= 588585 )
							ret := 0.000000
						if( Negative_Money_Flow_Sum > 588585 )
							ret := -0.978261 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ABNB_30Min_6da52ab9(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


