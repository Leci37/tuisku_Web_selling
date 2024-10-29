//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AMD_1Hour_2CS0_2568fa56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Hour_2CS0_2568fa56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Hour_2568fa56(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= -2.62334 )
		if( ad_mf <= -1.44386e+07 )
			if( ad_mf <= -1.71822e+07 )
				if( rsi1 <= 62.3702 )
					if( rsi1 <= 50.898 )
						ret := 0.000000
					if( rsi1 > 50.898 )
						ret := 1.000000 // buy
				if( rsi1 > 62.3702 )
					ret := -0.666667
			if( ad_mf > -1.71822e+07 )
				if( d_k <= -16.2539 )
					ret := 0.000000
				if( d_k > -16.2539 )
					if( rsi1 <= 68.2394 )
						ret := -1.000000 // sell
					if( rsi1 > 68.2394 )
						ret := -0.750000 // sell
		if( ad_mf > -1.44386e+07 )
			if( ad_mf <= 2.66627e+07 )
				if( mf <= -0.392948 )
					if( ad <= -45563.8 )
						if( ad_mf <= -88259.9 )
							ret := 0.606557
						if( ad_mf > -88259.9 )
							ret := 0.941176 // buy
					if( ad > -45563.8 )
						if( k <= 23.4073 )
							ret := 0.517857
						if( k > 23.4073 )
							ret := 0.180000
				if( mf > -0.392948 )
					if( d_k <= -2.646 )
						if( d_k <= -7.59078 )
							ret := 0.090681
						if( d_k > -7.59078 )
							ret := 0.024159
					if( d_k > -2.646 )
						if( d_k <= -2.63823 )
							ret := 0.933333 // buy
						if( d_k > -2.63823 )
							ret := 0.380952
			if( ad_mf > 2.66627e+07 )
				if( d <= 47.2603 )
					ret := 0.000000
				if( d > 47.2603 )
					ret := 1.000000 // buy
	if( d_k > -2.62334 )
		if( mf <= -0.354581 )
			if( ad_mf <= -1.71075e+07 )
				ret := -1.000000 // sell
			if( ad_mf > -1.71075e+07 )
				if( mf <= -0.428001 )
					if( ad <= 90387.4 )
						if( k <= 1.08761 )
							ret := 0.153846
						if( k > 1.08761 )
							ret := 0.584615
					if( ad > 90387.4 )
						ret := -0.181818
				if( mf > -0.428001 )
					if( d_k <= -0.73521 )
						if( smoothD_d <= -1.68707 )
							ret := -0.090909
						if( smoothD_d > -1.68707 )
							ret := 0.600000
					if( d_k > -0.73521 )
						if( smoothD_d <= 72.2128 )
							ret := -0.014706
						if( smoothD_d > 72.2128 )
							ret := 0.466667
		if( mf > -0.354581 )
			if( k <= 8.0295 )
				if( ad <= -1.42152e+07 )
					if( ad_mf <= -2.07041e+07 )
						ret := 0.687500
					if( ad_mf > -2.07041e+07 )
						if( mf <= 0.234156 )
							ret := -0.902439 // sell
						if( mf > 0.234156 )
							ret := 0.000000
				if( ad > -1.42152e+07 )
					if( smoothK_k <= 4.93135 )
						if( ad_mf <= -5.02145e+06 )
							ret := 0.039080
						if( ad_mf > -5.02145e+06 )
							ret := -0.146736
					if( smoothK_k > 4.93135 )
						if( smoothD_d <= 7.44252 )
							ret := -0.500000
						if( smoothD_d > 7.44252 )
							ret := -1.000000 // sell
			if( k > 8.0295 )
				if( d <= 96.3206 )
					if( ad <= -1.37824e+07 )
						if( mf <= 0.050751 )
							ret := 0.088757
						if( mf > 0.050751 )
							ret := 0.666667
					if( ad > -1.37824e+07 )
						if( ad <= -1.08522e+07 )
							ret := -0.425439
						if( ad > -1.08522e+07 )
							ret := -0.039544
				if( d > 96.3206 )
					if( mf <= -0.214036 )
						if( ad_mf <= -7116.84 )
							ret := -0.040000
						if( ad_mf > -7116.84 )
							ret := -0.674419
					if( mf > -0.214036 )
						if( ad <= 1.88458e+07 )
							ret := 0.105029
						if( ad > 1.88458e+07 )
							ret := 0.782609 // buy
	
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
float op_operation = decision_tree_0_AMD_1Hour_2568fa56(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


