//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: MELI_1Min_2CS0_e1ae23ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Min_2CS0_e1ae23ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Min_e1ae23ec(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -127.756 )
		if( mf <= -0.04449 )
			if( ad <= -1903.65 )
				if( smoothD_d <= 66.3107 )
					if( ad_mf <= -3234.75 )
						if( rsi1 <= 36.2311 )
							ret := 0.541667
						if( rsi1 > 36.2311 )
							ret := 0.028807
					if( ad_mf > -3234.75 )
						if( d <= 0.932622 )
							ret := 0.454545
						if( d > 0.932622 )
							ret := -0.292585
				if( smoothD_d > 66.3107 )
					if( ad_mf <= -2236.34 )
						if( ad <= -2406.41 )
							ret := 0.282895
						if( ad > -2406.41 )
							ret := -0.766667 // sell
					if( ad_mf > -2236.34 )
						if( k <= 88.0498 )
							ret := 0.711111 // buy
						if( k > 88.0498 )
							ret := 0.263158
			if( ad > -1903.65 )
				if( ad <= -1717.58 )
					if( d_k <= 6.51574 )
						if( d <= 4.53453 )
							ret := 0.153846
						if( d > 4.53453 )
							ret := 0.756757 // buy
					if( d_k > 6.51574 )
						if( ad <= -1784.28 )
							ret := -0.500000
						if( ad > -1784.28 )
							ret := 0.562500
				if( ad > -1717.58 )
					if( d <= 96.3277 )
						if( mf <= -0.345963 )
							ret := 0.328455
						if( mf > -0.345963 )
							ret := 0.166565
					if( d > 96.3277 )
						if( rsi1 <= 60.9356 )
							ret := -0.560976
						if( rsi1 > 60.9356 )
							ret := -0.013514
		if( mf > -0.04449 )
			if( ad <= -993.147 )
				if( ad_mf <= -1015.13 )
					if( d_k <= -17.8042 )
						if( d <= 40.1238 )
							ret := -0.967742 // sell
						if( d > 40.1238 )
							ret := -0.354839
					if( d_k > -17.8042 )
						if( ad <= -3378.21 )
							ret := -0.332000
						if( ad > -3378.21 )
							ret := -0.047870
				if( ad_mf > -1015.13 )
					if( smoothK_k <= 47.2611 )
						if( smoothK_k <= 13.2294 )
							ret := -0.666667
						if( smoothK_k > 13.2294 )
							ret := -1.000000 // sell
					if( smoothK_k > 47.2611 )
						ret := 0.235294
			if( ad > -993.147 )
				if( smoothK_k <= 0.461292 )
					if( mf <= 0.030907 )
						if( mf <= 0.012358 )
							ret := 0.123288
						if( mf > 0.012358 )
							ret := 0.937500 // buy
					if( mf > 0.030907 )
						if( ad <= -656.687 )
							ret := 0.000000
						if( ad > -656.687 )
							ret := -0.478261
				if( smoothK_k > 0.461292 )
					if( smoothK_k <= 29.4665 )
						if( ad <= -551.617 )
							ret := 0.466501
						if( ad > -551.617 )
							ret := 0.140351
					if( smoothK_k > 29.4665 )
						if( mf <= 0.085408 )
							ret := 0.224165
						if( mf > 0.085408 )
							ret := -0.020134
	if( ad > -127.756 )
		if( k <= 0.371405 )
			if( ad_mf <= -0.034648 )
				if( d_k <= -0.030118 )
					ret := 0.000000
				if( d_k > -0.030118 )
					if( rsi1 <= 35.1217 )
						if( ad_mf <= -0.073505 )
							ret := 0.000000
						if( ad_mf > -0.073505 )
							ret := 0.800000 // buy
					if( rsi1 > 35.1217 )
						if( d_k <= 4.65086 )
							ret := 0.726027 // buy
						if( d_k > 4.65086 )
							ret := 0.425926
			if( ad_mf > -0.034648 )
				if( smoothK_k <= -2.87361 )
					if( mf <= -0.239425 )
						if( d <= 1.01887 )
							ret := 0.617647
						if( d > 1.01887 )
							ret := 0.206897
					if( mf > -0.239425 )
						if( smoothD_d <= 0.31267 )
							ret := 0.111111
						if( smoothD_d > 0.31267 )
							ret := -0.230216
				if( smoothK_k > -2.87361 )
					if( d_k <= 7.97994 )
						if( d <= 2.43807 )
							ret := 0.354167
						if( d > 2.43807 )
							ret := 0.968750 // buy
					if( d_k > 7.97994 )
						ret := -0.333333
		if( k > 0.371405 )
			if( rsi1 <= 68.858 )
				if( ad_mf <= 2225.58 )
					if( ad <= 423.304 )
						if( rsi1 <= 21.7353 )
							ret := 0.307278
						if( rsi1 > 21.7353 )
							ret := -0.020446
					if( ad > 423.304 )
						if( ad <= 481.58 )
							ret := -0.408602
						if( ad > 481.58 )
							ret := -0.096157
				if( ad_mf > 2225.58 )
					if( k <= 6.5745 )
						if( rsi1 <= 30.5202 )
							ret := 0.296296
						if( rsi1 > 30.5202 )
							ret := -0.656716
					if( k > 6.5745 )
						if( ad_mf <= 4051.28 )
							ret := 0.228401
						if( ad_mf > 4051.28 )
							ret := -0.051282
			if( rsi1 > 68.858 )
				if( d <= 94.0456 )
					if( smoothD_d <= 90.0177 )
						if( ad_mf <= 4358.7 )
							ret := -0.158293
						if( ad_mf > 4358.7 )
							ret := -0.600000
					if( smoothD_d > 90.0177 )
						if( ad <= 1094.28 )
							ret := -0.638462
						if( ad > 1094.28 )
							ret := -0.133333
				if( d > 94.0456 )
					if( rsi1 <= 87.9856 )
						if( ad_mf <= -1.46213 )
							ret := -0.818182 // sell
						if( ad_mf > -1.46213 )
							ret := 0.079848
					if( rsi1 > 87.9856 )
						if( smoothK_k <= 94.9456 )
							ret := 0.147059
						if( smoothK_k > 94.9456 )
							ret := -0.492063
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_MELI_1Min_e1ae23ec(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


