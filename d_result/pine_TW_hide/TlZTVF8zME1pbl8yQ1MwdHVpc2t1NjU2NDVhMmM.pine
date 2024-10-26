//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: NVST_30Min_2CS0_65645a2c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVST_30Min_2CS0_65645a2c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVST_30Min_65645a2c(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( mf <= 0.123038 )
		if( rsi1 <= 30.7098 )
			if( ad <= 102474 )
				if( mf <= 0.074424 )
					if( ad_mf <= -375796 )
						if( smoothD_d <= 11.9062 )
							ret := -0.809524 // sell
						if( smoothD_d > 11.9062 )
							ret := 0.571429
					if( ad_mf > -375796 )
						if( ad_mf <= -278782 )
							ret := 0.640625
						if( ad_mf > -278782 )
							ret := 0.128215
				if( mf > 0.074424 )
					if( d_k <= -1.21388 )
						if( ad <= 680.17 )
							ret := 0.729167 // buy
						if( ad > 680.17 )
							ret := 0.176471
					if( d_k > -1.21388 )
						if( d_k <= -0.086789 )
							ret := -0.421053
						if( d_k > -0.086789 )
							ret := 0.333333
			if( ad > 102474 )
				if( smoothD_d <= 27.3104 )
					if( ad_mf <= 111884 )
						if( mf <= -0.063626 )
							ret := 0.062500
						if( mf > -0.063626 )
							ret := -0.954545 // sell
					if( ad_mf > 111884 )
						if( d_k <= -2.8629 )
							ret := -0.166667
						if( d_k > -2.8629 )
							ret := 0.279070
				if( smoothD_d > 27.3104 )
					if( rsi1 <= 27.8649 )
						if( rsi1 <= 22.8459 )
							ret := -0.769231 // sell
						if( rsi1 > 22.8459 )
							ret := -1.000000 // sell
					if( rsi1 > 27.8649 )
						ret := -0.300000
		if( rsi1 > 30.7098 )
			if( rsi1 <= 77.8915 )
				if( smoothD_d <= 90.6835 )
					if( ad_mf <= 374488 )
						if( ad <= 350389 )
							ret := 0.006177
						if( ad > 350389 )
							ret := -0.622642
					if( ad_mf > 374488 )
						if( smoothK_k <= 89.075 )
							ret := 0.403727
						if( smoothK_k > 89.075 )
							ret := -0.900000 // sell
				if( smoothD_d > 90.6835 )
					if( ad <= 577277 )
						if( ad_mf <= 27139.4 )
							ret := 0.122399
						if( ad_mf > 27139.4 )
							ret := 0.383562
					if( ad > 577277 )
						ret := -0.846154 // sell
			if( rsi1 > 77.8915 )
				if( d_k <= -0.088567 )
					if( ad <= 1639.17 )
						if( ad_mf <= -341.2 )
							ret := -0.236364
						if( ad_mf > -341.2 )
							ret := -0.769231 // sell
					if( ad > 1639.17 )
						if( ad_mf <= 31972.4 )
							ret := 0.087719
						if( ad_mf > 31972.4 )
							ret := -0.411765
				if( d_k > -0.088567 )
					if( ad_mf <= 0.141742 )
						if( ad_mf <= -31137.8 )
							ret := 0.219512
						if( ad_mf > -31137.8 )
							ret := -0.475410
					if( ad_mf > 0.141742 )
						if( rsi1 <= 78.8361 )
							ret := -0.250000
						if( rsi1 > 78.8361 )
							ret := 0.250000
	if( mf > 0.123038 )
		if( rsi1 <= 36.9932 )
			if( d_k <= 9.04857 )
				if( d <= 14.5645 )
					if( smoothK_k <= -0.272029 )
						if( smoothK_k <= -2.10729 )
							ret := 0.173913
						if( smoothK_k > -2.10729 )
							ret := -0.465116
					if( smoothK_k > -0.272029 )
						if( k <= 19.6724 )
							ret := 0.241379
						if( k > 19.6724 )
							ret := 0.809524 // buy
				if( d > 14.5645 )
					if( d_k <= 3.49169 )
						if( smoothK_k <= 56.5674 )
							ret := -0.271429
						if( smoothK_k > 56.5674 )
							ret := 0.333333
					if( d_k > 3.49169 )
						if( smoothD_d <= 15.4782 )
							ret := 0.100000
						if( smoothD_d > 15.4782 )
							ret := -0.793103 // sell
			if( d_k > 9.04857 )
				if( smoothK_k <= -2.99188 )
					ret := -0.058824
				if( smoothK_k > -2.99188 )
					if( mf <= 0.317882 )
						if( d_k <= 18.7672 )
							ret := 0.680000
						if( d_k > 18.7672 )
							ret := 0.315789
					if( mf > 0.317882 )
						ret := -0.181818
		if( rsi1 > 36.9932 )
			if( smoothD_d <= 95.2669 )
				if( mf <= 0.329131 )
					if( rsi1 <= 61.0706 )
						if( smoothD_d <= 52.7425 )
							ret := -0.177665
						if( smoothD_d > 52.7425 )
							ret := 0.055085
					if( rsi1 > 61.0706 )
						if( d <= 44.176 )
							ret := -0.014035
						if( d > 44.176 )
							ret := -0.218750
				if( mf > 0.329131 )
					if( ad_mf <= 68171.6 )
						if( k <= 73.4109 )
							ret := 0.067460
						if( k > 73.4109 )
							ret := -0.256000
					if( ad_mf > 68171.6 )
						if( ad_mf <= 344993 )
							ret := 0.434783
						if( ad_mf > 344993 )
							ret := -0.100000
			if( smoothD_d > 95.2669 )
				if( d_k <= -0.601038 )
					if( ad_mf <= -0.18219 )
						ret := 1.000000 // buy
					if( ad_mf > -0.18219 )
						if( rsi1 <= 76.6504 )
							ret := 0.066667
						if( rsi1 > 76.6504 )
							ret := 0.615385
				if( d_k > -0.601038 )
					if( rsi1 <= 84.2272 )
						if( d_k <= -0.242183 )
							ret := -0.687500
						if( d_k > -0.242183 )
							ret := -0.102941
					if( rsi1 > 84.2272 )
						if( ad <= 2354.3 )
							ret := 0.600000
						if( ad > 2354.3 )
							ret := 0.111111
	
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
float op_operation = decision_tree_0_NVST_30Min_65645a2c(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


