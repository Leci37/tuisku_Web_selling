//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: VETUSDT_1Hour_2CS0_b25d5eca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_1Hour_2CS0_b25d5eca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_1Hour_b25d5eca(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( d_k <= -1.16752 )
		if( ad <= 1.29644e+07 )
			if( rsi1 <= 48.7272 )
				if( ad_mf <= -4.74081e+06 )
					if( ad_mf <= -1.07605e+08 )
						if( ad_mf <= -1.70014e+08 )
							ret := 0.066667
						if( ad_mf > -1.70014e+08 )
							ret := 0.680000
					if( ad_mf > -1.07605e+08 )
						if( ad <= -4.78483e+06 )
							ret := 0.124272
						if( ad > -4.78483e+06 )
							ret := 0.950000 // buy
				if( ad_mf > -4.74081e+06 )
					if( d_k <= -9.93474 )
						if( rsi1 <= 34.3788 )
							ret := -0.226087
						if( rsi1 > 34.3788 )
							ret := 0.140625
					if( d_k > -9.93474 )
						if( rsi1 <= 46.1227 )
							ret := -0.158340
						if( rsi1 > 46.1227 )
							ret := 0.086316
			if( rsi1 > 48.7272 )
				if( rsi1 <= 56.4546 )
					if( mf <= 0.051141 )
						if( ad_mf <= -1.57671e+08 )
							ret := -0.444444
						if( ad_mf > -1.57671e+08 )
							ret := 0.328032
					if( mf > 0.051141 )
						if( ad <= 1.26603e+07 )
							ret := 0.157576
						if( ad > 1.26603e+07 )
							ret := -0.625000
				if( rsi1 > 56.4546 )
					if( mf <= 0.07571 )
						if( rsi1 <= 67.955 )
							ret := 0.451085
						if( rsi1 > 67.955 )
							ret := 0.612834
					if( mf > 0.07571 )
						if( mf <= 0.194904 )
							ret := 0.368071
						if( mf > 0.194904 )
							ret := 0.165171
		if( ad > 1.29644e+07 )
			if( rsi1 <= 50.5053 )
				if( ad_mf <= 1.64134e+08 )
					if( ad <= 6.60626e+07 )
						if( smoothK_k <= 91.4679 )
							ret := -0.157222
						if( smoothK_k > 91.4679 )
							ret := 0.326087
					if( ad > 6.60626e+07 )
						if( mf <= -0.090658 )
							ret := 0.275862
						if( mf > -0.090658 )
							ret := -0.440252
				if( ad_mf > 1.64134e+08 )
					if( mf <= -0.001997 )
						if( d <= 41.2729 )
							ret := 0.456522
						if( d > 41.2729 )
							ret := 0.964286 // buy
					if( mf > -0.001997 )
						if( ad_mf <= 1.89491e+08 )
							ret := 0.785714 // buy
						if( ad_mf > 1.89491e+08 )
							ret := -0.109890
			if( rsi1 > 50.5053 )
				if( smoothK_k <= 85.6759 )
					if( mf <= 0.053628 )
						if( rsi1 <= 60.5864 )
							ret := 0.155973
						if( rsi1 > 60.5864 )
							ret := 0.436019
					if( mf > 0.053628 )
						if( ad_mf <= 4.63535e+07 )
							ret := 0.194201
						if( ad_mf > 4.63535e+07 )
							ret := -0.109991
				if( smoothK_k > 85.6759 )
					if( ad <= 2.86481e+08 )
						if( ad <= 1.3306e+07 )
							ret := -0.818182 // sell
						if( ad > 1.3306e+07 )
							ret := 0.349442
					if( ad > 2.86481e+08 )
						if( smoothD_d <= 82.8843 )
							ret := 0.500000
						if( smoothD_d > 82.8843 )
							ret := -0.750000 // sell
	if( d_k > -1.16752 )
		if( rsi1 <= 52.1651 )
			if( ad_mf <= -9.10664e+06 )
				if( ad <= -1.35185e+08 )
					if( rsi1 <= 30.4244 )
						if( ad <= -1.94585e+08 )
							ret := 0.404762
						if( ad > -1.94585e+08 )
							ret := 0.831325 // buy
					if( rsi1 > 30.4244 )
						if( ad <= -3.17118e+08 )
							ret := 0.928571 // buy
						if( ad > -3.17118e+08 )
							ret := 0.180505
				if( ad > -1.35185e+08 )
					if( ad_mf <= -4.5872e+07 )
						if( ad <= -8.3263e+07 )
							ret := -0.235489
						if( ad > -8.3263e+07 )
							ret := 0.008419
					if( ad_mf > -4.5872e+07 )
						if( ad_mf <= -4.19209e+07 )
							ret := -0.600775
						if( ad_mf > -4.19209e+07 )
							ret := -0.169022
			if( ad_mf > -9.10664e+06 )
				if( d_k <= 5.02636 )
					if( ad_mf <= -1.07397e+06 )
						if( rsi1 <= 47.7092 )
							ret := -0.216722
						if( rsi1 > 47.7092 )
							ret := 0.132450
					if( ad_mf > -1.07397e+06 )
						if( ad <= 1.54698e+08 )
							ret := -0.321279
						if( ad > 1.54698e+08 )
							ret := 0.266667
				if( d_k > 5.02636 )
					if( smoothK_k <= 12.3057 )
						if( mf <= -0.19096 )
							ret := 0.000000
						if( mf > -0.19096 )
							ret := -0.314385
					if( smoothK_k > 12.3057 )
						if( rsi1 <= 42.8389 )
							ret := -0.533831
						if( rsi1 > 42.8389 )
							ret := -0.315596
		if( rsi1 > 52.1651 )
			if( rsi1 <= 63.3781 )
				if( mf <= 0.049929 )
					if( ad_mf <= -7.3583e+06 )
						if( rsi1 <= 59.1398 )
							ret := 0.166512
						if( rsi1 > 59.1398 )
							ret := 0.364796
					if( ad_mf > -7.3583e+06 )
						if( rsi1 <= 58.6269 )
							ret := -0.012739
						if( rsi1 > 58.6269 )
							ret := 0.159122
				if( mf > 0.049929 )
					if( d <= 30.3958 )
						if( ad <= 6.6738e+07 )
							ret := 0.085683
						if( ad > 6.6738e+07 )
							ret := -0.297297
					if( d > 30.3958 )
						if( ad <= -1.57986e+06 )
							ret := -0.001640
						if( ad > -1.57986e+06 )
							ret := -0.179711
			if( rsi1 > 63.3781 )
				if( mf <= 0.102742 )
					if( ad_mf <= 6.1728e+07 )
						if( ad_mf <= -8.81277e+07 )
							ret := 0.516393
						if( ad_mf > -8.81277e+07 )
							ret := 0.235950
					if( ad_mf > 6.1728e+07 )
						if( smoothK_k <= 80.3803 )
							ret := -0.415385
						if( smoothK_k > 80.3803 )
							ret := 0.098039
				if( mf > 0.102742 )
					if( rsi1 <= 70.3103 )
						if( ad_mf <= 1.16555e+08 )
							ret := 0.029809
						if( ad_mf > 1.16555e+08 )
							ret := -0.445946
					if( rsi1 > 70.3103 )
						if( ad <= 2.15326e+08 )
							ret := 0.174588
						if( ad > 2.15326e+08 )
							ret := -0.585366
	
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
float op_operation = decision_tree_0_VETUSDT_1Hour_b25d5eca(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


