//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: TSLA_1Hour_2CS0_0806564a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_1Hour_2CS0_0806564a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_1Hour_0806564a(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( k <= 61.0966 )
		if( d_k <= -0.245608 )
			if( ad <= -2.1701e+06 )
				if( d_k <= -0.342727 )
					if( rsi1 <= 30.0557 )
						if( ad <= -2.63887e+06 )
							ret := -0.256545
						if( ad > -2.63887e+06 )
							ret := -0.693548
					if( rsi1 > 30.0557 )
						if( d_k <= -4.12184 )
							ret := -0.199203
						if( d_k > -4.12184 )
							ret := 0.040816
				if( d_k > -0.342727 )
					ret := 0.769231 // buy
			if( ad > -2.1701e+06 )
				if( ad_mf <= -266714 )
					if( ad <= -432997 )
						if( ad <= -692128 )
							ret := 0.250804
						if( ad > -692128 )
							ret := -0.179487
					if( ad > -432997 )
						if( mf <= 0.066396 )
							ret := 0.547619
						if( mf > 0.066396 )
							ret := -0.122449
				if( ad_mf > -266714 )
					if( ad_mf <= -165627 )
						if( ad_mf <= -183090 )
							ret := -0.183007
						if( ad_mf > -183090 )
							ret := -0.795918 // sell
					if( ad_mf > -165627 )
						if( rsi1 <= 56.6657 )
							ret := -0.003711
						if( rsi1 > 56.6657 )
							ret := 0.113562
		if( d_k > -0.245608 )
			if( mf <= 0.21109 )
				if( d_k <= 3.93149 )
					if( ad_mf <= 158852 )
						if( ad <= -1.11011e+06 )
							ret := -0.196809
						if( ad > -1.11011e+06 )
							ret := -0.020521
					if( ad_mf > 158852 )
						if( ad_mf <= 355163 )
							ret := -0.570000
						if( ad_mf > 355163 )
							ret := -0.208984
				if( d_k > 3.93149 )
					if( ad <= 3.55588e+06 )
						if( ad <= 3.33991e+06 )
							ret := -0.227514
						if( ad > 3.33991e+06 )
							ret := -1.000000 // sell
					if( ad > 3.55588e+06 )
						if( rsi1 <= 32.3703 )
							ret := 0.714286 // buy
						if( rsi1 > 32.3703 )
							ret := -0.062762
			if( mf > 0.21109 )
				if( ad_mf <= 29572.5 )
					if( ad_mf <= -22997.8 )
						if( ad <= -43326.8 )
							ret := 0.101289
						if( ad > -43326.8 )
							ret := -0.634146
					if( ad_mf > -22997.8 )
						if( d <= 30.916 )
							ret := 0.188976
						if( d > 30.916 )
							ret := 0.450549
				if( ad_mf > 29572.5 )
					if( ad <= 3.59492e+06 )
						if( d_k <= 14.6392 )
							ret := -0.130734
						if( d_k > 14.6392 )
							ret := -0.520202
					if( ad > 3.59492e+06 )
						if( rsi1 <= 42.9269 )
							ret := 0.826087 // buy
						if( rsi1 > 42.9269 )
							ret := 0.033898
	if( k > 61.0966 )
		if( rsi1 <= 67.9589 )
			if( d_k <= 2.00448 )
				if( ad <= -320546 )
					if( ad <= -371248 )
						if( mf <= -0.503041 )
							ret := 1.000000 // buy
						if( mf > -0.503041 )
							ret := 0.189935
					if( ad > -371248 )
						if( d_k <= -2.06988 )
							ret := 0.310345
						if( d_k > -2.06988 )
							ret := 0.961538 // buy
				if( ad > -320546 )
					if( d_k <= -9.00633 )
						if( rsi1 <= 51.8586 )
							ret := -0.161006
						if( rsi1 > 51.8586 )
							ret := 0.007472
					if( d_k > -9.00633 )
						if( ad_mf <= -3310.6 )
							ret := 0.154064
						if( ad_mf > -3310.6 )
							ret := 0.052430
			if( d_k > 2.00448 )
				if( mf <= 0.144848 )
					if( ad <= -1.36268e+07 )
						if( smoothD_d <= 74.9486 )
							ret := 1.000000 // buy
						if( smoothD_d > 74.9486 )
							ret := 0.161290
					if( ad > -1.36268e+07 )
						if( ad_mf <= -1.19806e+07 )
							ret := -0.933333 // sell
						if( ad_mf > -1.19806e+07 )
							ret := -0.111754
				if( mf > 0.144848 )
					if( k <= 64.218 )
						if( ad_mf <= -28662.3 )
							ret := 0.258065
						if( ad_mf > -28662.3 )
							ret := 0.745455 // buy
					if( k > 64.218 )
						if( ad_mf <= -125210 )
							ret := -0.295455
						if( ad_mf > -125210 )
							ret := 0.078704
		if( rsi1 > 67.9589 )
			if( d <= 91.4342 )
				if( ad_mf <= 2.78585e+06 )
					if( mf <= 0.413539 )
						if( rsi1 <= 82.43 )
							ret := 0.214321
						if( rsi1 > 82.43 )
							ret := -0.013605
					if( mf > 0.413539 )
						if( rsi1 <= 86.2532 )
							ret := 0.504587
						if( rsi1 > 86.2532 )
							ret := -0.136364
				if( ad_mf > 2.78585e+06 )
					if( ad <= 6.33496e+06 )
						if( mf <= 0.02383 )
							ret := -0.090909
						if( mf > 0.02383 )
							ret := 0.612546
					if( ad > 6.33496e+06 )
						if( ad_mf <= 8.94295e+06 )
							ret := -0.275362
						if( ad_mf > 8.94295e+06 )
							ret := 0.405204
			if( d > 91.4342 )
				if( mf <= -0.18762 )
					if( smoothD_d <= 95.9154 )
						ret := -0.833333 // sell
					if( smoothD_d > 95.9154 )
						ret := -0.071429
				if( mf > -0.18762 )
					if( smoothD_d <= 90.3332 )
						if( ad_mf <= 12276.6 )
							ret := 0.158621
						if( ad_mf > 12276.6 )
							ret := -0.176768
					if( smoothD_d > 90.3332 )
						if( smoothD_d <= 91.0117 )
							ret := 0.387755
						if( smoothD_d > 91.0117 )
							ret := 0.164361
	
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
float op_operation = decision_tree_0_TSLA_1Hour_0806564a(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


