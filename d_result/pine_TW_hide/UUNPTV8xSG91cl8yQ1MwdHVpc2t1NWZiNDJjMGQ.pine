//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: QCOM_1Hour_2CS0_5fb42c0d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Hour_2CS0_5fb42c0d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Hour_5fb42c0d(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( k <= 79.6313 )
		if( rsi1 <= 17.3556 )
			if( ad <= -195898 )
				if( mf <= -0.35619 )
					if( k <= 13.1566 )
						if( smoothD_d <= 2.34092 )
							ret := 0.684211
						if( smoothD_d > 2.34092 )
							ret := -0.454545
					if( k > 13.1566 )
						ret := 1.000000 // buy
				if( mf > -0.35619 )
					if( ad_mf <= -964218 )
						if( mf <= -0.282702 )
							ret := -0.250000
						if( mf > -0.282702 )
							ret := 0.315789
					if( ad_mf > -964218 )
						if( ad <= -835733 )
							ret := -0.772727 // sell
						if( ad > -835733 )
							ret := -0.375000
			if( ad > -195898 )
				if( ad <= -2686.37 )
					if( mf <= -0.228112 )
						if( ad_mf <= -84121.9 )
							ret := -0.500000
						if( ad_mf > -84121.9 )
							ret := 0.545455
					if( mf > -0.228112 )
						if( smoothD_d <= -1.69905 )
							ret := 0.300000
						if( smoothD_d > -1.69905 )
							ret := 0.830508 // buy
				if( ad > -2686.37 )
					if( rsi1 <= 16.4244 )
						if( ad_mf <= -268.481 )
							ret := -0.204082
						if( ad_mf > -268.481 )
							ret := 0.218391
					if( rsi1 > 16.4244 )
						ret := 0.736842 // buy
		if( rsi1 > 17.3556 )
			if( d_k <= -5.08355 )
				if( ad_mf <= -591122 )
					if( d_k <= -9.42755 )
						if( ad_mf <= -615482 )
							ret := -0.291262
						if( ad_mf > -615482 )
							ret := -0.954545 // sell
					if( d_k > -9.42755 )
						if( d <= 7.96996 )
							ret := -0.800000 // sell
						if( d > 7.96996 )
							ret := 0.150602
				if( ad_mf > -591122 )
					if( rsi1 <= 61.4602 )
						if( smoothD_d <= 10.1866 )
							ret := -0.095624
						if( smoothD_d > 10.1866 )
							ret := 0.122812
					if( rsi1 > 61.4602 )
						if( mf <= 0.340646 )
							ret := -0.074271
						if( mf > 0.340646 )
							ret := -0.400000
			if( d_k > -5.08355 )
				if( ad_mf <= 1.17033e+06 )
					if( ad <= 545613 )
						if( ad_mf <= 0.029111 )
							ret := -0.019082
						if( ad_mf > 0.029111 )
							ret := -0.107416
					if( ad > 545613 )
						if( ad <= 779891 )
							ret := 0.339383
						if( ad > 779891 )
							ret := -0.069159
				if( ad_mf > 1.17033e+06 )
					if( d_k <= 4.54441 )
						if( ad <= 1.25449e+06 )
							ret := -0.694444
						if( ad > 1.25449e+06 )
							ret := -0.268371
					if( d_k > 4.54441 )
						if( k <= 8.28607 )
							ret := -0.588235
						if( k > 8.28607 )
							ret := 0.081081
	if( k > 79.6313 )
		if( rsi1 <= 72.8269 )
			if( mf <= -0.00234 )
				if( ad <= -3.23495e+06 )
					if( smoothD_d <= 89.0932 )
						ret := -0.111111
					if( smoothD_d > 89.0932 )
						ret := -0.785714 // sell
				if( ad > -3.23495e+06 )
					if( ad_mf <= -2065.12 )
						if( ad <= -2697.59 )
							ret := 0.211630
						if( ad > -2697.59 )
							ret := 0.701754 // buy
					if( ad_mf > -2065.12 )
						if( ad <= -1113.91 )
							ret := -0.280000
						if( ad > -1113.91 )
							ret := 0.134615
			if( mf > -0.00234 )
				if( d <= 98.5868 )
					if( mf <= 0.352861 )
						if( ad <= -5730.46 )
							ret := -0.083333
						if( ad > -5730.46 )
							ret := 0.079675
					if( mf > 0.352861 )
						if( k <= 94.6441 )
							ret := 0.425743
						if( k > 94.6441 )
							ret := -0.226415
				if( d > 98.5868 )
					if( ad_mf <= 81701.2 )
						if( d_k <= 0.176648 )
							ret := -0.204545
						if( d_k > 0.176648 )
							ret := -0.618182
					if( ad_mf > 81701.2 )
						if( ad_mf <= 1.04436e+06 )
							ret := 0.000000
						if( ad_mf > 1.04436e+06 )
							ret := 0.437500
		if( rsi1 > 72.8269 )
			if( rsi1 <= 86.6266 )
				if( d <= 95.9452 )
					if( mf <= 0.199617 )
						if( smoothD_d <= 88.6259 )
							ret := -0.169604
						if( smoothD_d > 88.6259 )
							ret := -0.412245
					if( mf > 0.199617 )
						if( rsi1 <= 84.476 )
							ret := -0.022436
						if( rsi1 > 84.476 )
							ret := -0.366667
				if( d > 95.9452 )
					if( mf <= 0.440197 )
						if( mf <= 0.352629 )
							ret := -0.026403
						if( mf > 0.352629 )
							ret := 0.418605
					if( mf > 0.440197 )
						if( smoothK_k <= 96.149 )
							ret := -0.522727
						if( smoothK_k > 96.149 )
							ret := 0.555556
			if( rsi1 > 86.6266 )
				if( ad_mf <= 92.1167 )
					if( smoothK_k <= 85.5757 )
						ret := -0.809524 // sell
					if( smoothK_k > 85.5757 )
						if( smoothD_d <= 95.6888 )
							ret := -0.111111
						if( smoothD_d > 95.6888 )
							ret := 0.500000
				if( ad_mf > 92.1167 )
					if( ad <= 7212.33 )
						if( smoothK_k <= 96.1172 )
							ret := 0.666667
						if( smoothK_k > 96.1172 )
							ret := 0.166667
					if( ad > 7212.33 )
						if( k <= 85.5561 )
							ret := 0.769231 // buy
						if( k > 85.5561 )
							ret := -0.040000
	
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
float op_operation = decision_tree_0_QCOM_1Hour_5fb42c0d(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


