//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: DOGEUSDT_1Hour_2CS0_feba30f6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_1Hour_2CS0_feba30f6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_1Hour_feba30f6(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 0.422578 )
		if( rsi1 <= 53.5675 )
			if( ad_mf <= -1.35966e+07 )
				if( d_k <= -4.29496 )
					if( smoothD_d <= 24.1397 )
						if( ad_mf <= -1.58026e+08 )
							ret := 0.907692 // buy
						if( ad_mf > -1.58026e+08 )
							ret := 0.420398
					if( smoothD_d > 24.1397 )
						if( rsi1 <= 32.6652 )
							ret := -0.200000
						if( rsi1 > 32.6652 )
							ret := 0.311641
				if( d_k > -4.29496 )
					if( ad <= -4.08618e+07 )
						if( ad_mf <= -1.13426e+08 )
							ret := 0.082111
						if( ad_mf > -1.13426e+08 )
							ret := 0.305322
					if( ad > -4.08618e+07 )
						if( rsi1 <= 47.1726 )
							ret := -0.090164
						if( rsi1 > 47.1726 )
							ret := 0.430380
			if( ad_mf > -1.35966e+07 )
				if( d_k <= -7.24128 )
					if( ad <= 6.56828e+07 )
						if( ad_mf <= -5.02438e+06 )
							ret := 0.192504
						if( ad_mf > -5.02438e+06 )
							ret := -0.014211
					if( ad > 6.56828e+07 )
						if( d_k <= -14.5073 )
							ret := 0.472477
						if( d_k > -14.5073 )
							ret := 0.068736
				if( d_k > -7.24128 )
					if( ad_mf <= 7.13463e+06 )
						if( rsi1 <= 40.772 )
							ret := -0.146654
						if( rsi1 > 40.772 )
							ret := 0.030085
					if( ad_mf > 7.13463e+06 )
						if( d_k <= -2.07854 )
							ret := -0.156656
						if( d_k > -2.07854 )
							ret := -0.360156
		if( rsi1 > 53.5675 )
			if( rsi1 <= 67.7995 )
				if( ad_mf <= -4.11953e+06 )
					if( smoothK_k <= 75.5326 )
						if( d_k <= -12.1768 )
							ret := 0.301449
						if( d_k > -12.1768 )
							ret := 0.520331
					if( smoothK_k > 75.5326 )
						if( ad_mf <= -2.15806e+08 )
							ret := -0.777778 // sell
						if( ad_mf > -2.15806e+08 )
							ret := 0.304211
				if( ad_mf > -4.11953e+06 )
					if( mf <= 0.206252 )
						if( ad <= 5.57171e+07 )
							ret := 0.248355
						if( ad > 5.57171e+07 )
							ret := 0.064166
					if( mf > 0.206252 )
						if( ad_mf <= 7.60374e+07 )
							ret := 0.004608
						if( ad_mf > 7.60374e+07 )
							ret := -0.409524
			if( rsi1 > 67.7995 )
				if( mf <= 0.200781 )
					if( d <= 80.7718 )
						if( d_k <= -18.3931 )
							ret := 0.347059
						if( d_k > -18.3931 )
							ret := 0.608666
					if( d > 80.7718 )
						if( ad <= -1.09297e+08 )
							ret := -0.123457
						if( ad > -1.09297e+08 )
							ret := 0.365953
				if( mf > 0.200781 )
					if( d <= 32.4973 )
						if( mf <= 0.204178 )
							ret := -1.000000 // sell
						if( mf > 0.204178 )
							ret := 0.719298 // buy
					if( d > 32.4973 )
						if( ad_mf <= 2.4795e+08 )
							ret := 0.199088
						if( ad_mf > 2.4795e+08 )
							ret := -0.110236
	if( d_k > 0.422578 )
		if( rsi1 <= 48.6579 )
			if( rsi1 <= 35.8198 )
				if( mf <= -0.129726 )
					if( ad <= -2.94415e+08 )
						if( smoothD_d <= 31.1896 )
							ret := 0.958333 // buy
						if( smoothD_d > 31.1896 )
							ret := 0.142857
					if( ad > -2.94415e+08 )
						if( d <= 45.5424 )
							ret := -0.147264
						if( d > 45.5424 )
							ret := -0.452489
				if( mf > -0.129726 )
					if( ad <= 3.27306e+08 )
						if( smoothD_d <= 4.55115 )
							ret := -0.306551
						if( smoothD_d > 4.55115 )
							ret := -0.491201
					if( ad > 3.27306e+08 )
						if( smoothD_d <= 16.0872 )
							ret := 1.000000 // buy
						if( smoothD_d > 16.0872 )
							ret := 0.428571
			if( rsi1 > 35.8198 )
				if( ad <= 6.65159e+06 )
					if( d_k <= 13.2474 )
						if( mf <= -0.080704 )
							ret := -0.031797
						if( mf > -0.080704 )
							ret := -0.157184
					if( d_k > 13.2474 )
						if( ad <= -1.49982e+07 )
							ret := -0.371622
						if( ad > -1.49982e+07 )
							ret := -0.259880
				if( ad > 6.65159e+06 )
					if( ad <= 3.83039e+07 )
						if( k <= 24.8722 )
							ret := -0.195683
						if( k > 24.8722 )
							ret := -0.435818
					if( ad > 3.83039e+07 )
						if( ad <= 6.38527e+07 )
							ret := -0.732601 // sell
						if( ad > 6.38527e+07 )
							ret := -0.440559
		if( rsi1 > 48.6579 )
			if( ad <= -2.91882e+06 )
				if( rsi1 <= 74.3035 )
					if( mf <= 0.056966 )
						if( d <= 51.2905 )
							ret := 0.278459
						if( d > 51.2905 )
							ret := 0.089896
					if( mf > 0.056966 )
						if( rsi1 <= 63.8164 )
							ret := -0.118514
						if( rsi1 > 63.8164 )
							ret := 0.150350
				if( rsi1 > 74.3035 )
					if( ad <= -6.17371e+08 )
						if( ad <= -1.79721e+09 )
							ret := 1.000000 // buy
						if( ad > -1.79721e+09 )
							ret := -0.933333 // sell
					if( ad > -6.17371e+08 )
						if( smoothD_d <= 91.6526 )
							ret := 0.544803
						if( smoothD_d > 91.6526 )
							ret := 0.126437
			if( ad > -2.91882e+06 )
				if( rsi1 <= 65.7004 )
					if( d <= 81.8187 )
						if( mf <= 0.058943 )
							ret := 0.024522
						if( mf > 0.058943 )
							ret := -0.126303
					if( d > 81.8187 )
						if( ad_mf <= 6.75036e+07 )
							ret := -0.211401
						if( ad_mf > 6.75036e+07 )
							ret := -0.664179
				if( rsi1 > 65.7004 )
					if( d_k <= 5.41814 )
						if( mf <= 0.349938 )
							ret := 0.176327
						if( mf > 0.349938 )
							ret := -0.814815 // sell
					if( d_k > 5.41814 )
						if( smoothD_d <= 76.4156 )
							ret := -0.018135
						if( smoothD_d > 76.4156 )
							ret := -0.321981
	
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
float op_operation = decision_tree_0_DOGEUSDT_1Hour_feba30f6(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


