//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: HUBS_15Min_2CS0_0979e3db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2CS0_0979e3db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_0979e3db(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ad <= -33941.4 )
		if( k <= 79.8907 )
			if( d <= 5.21363 )
				if( rsi1 <= 24.8402 )
					if( mf <= -0.194249 )
						if( k <= 1.4445 )
							if( rsi1 <= 13.159 )
								ret := 0.111111
							if( rsi1 > 13.159 )
								ret := -0.411765
						if( k > 1.4445 )
							if( d_k <= 0.426786 )
								ret := -0.500000
							if( d_k > 0.426786 )
								ret := -0.956522 // sell
					if( mf > -0.194249 )
						if( k <= 0.660845 )
							ret := -0.214286
						if( k > 0.660845 )
							ret := 0.545455
				if( rsi1 > 24.8402 )
					if( d <= 3.83881 )
						if( ad <= -41398.7 )
							if( d_k <= -0.269359 )
								ret := 0.785714 // buy
							if( d_k > -0.269359 )
								if( smoothK_k <= -2.86058 )
									ret := 0.545455
								if( smoothK_k > -2.86058 )
									ret := 0.000000
						if( ad > -41398.7 )
							ret := -0.105263
					if( d > 3.83881 )
						if( ad <= -47558.7 )
							ret := 0.307692
						if( ad > -47558.7 )
							ret := -0.666667
			if( d > 5.21363 )
				if( ad_mf <= -38051.6 )
					if( ad <= -38328.1 )
						if( smoothD_d <= 16.5302 )
							if( rsi1 <= 54.7539 )
								if( ad_mf <= -168176 )
									ret := -0.500000
								if( ad_mf > -168176 )
									ret := 0.178344
							if( rsi1 > 54.7539 )
								ret := -0.800000 // sell
						if( smoothD_d > 16.5302 )
							if( mf <= -0.424135 )
								if( smoothD_d <= 69.3386 )
									ret := 0.884615 // buy
								if( smoothD_d > 69.3386 )
									ret := -0.066667
							if( mf > -0.424135 )
								if( ad_mf <= -77787.9 )
									ret := 0.464968
								if( ad_mf > -77787.9 )
									ret := 0.266376
					if( ad > -38328.1 )
						if( smoothD_d <= 37.3748 )
							ret := -0.933333 // sell
						if( smoothD_d > 37.3748 )
							ret := -0.461538
				if( ad_mf > -38051.6 )
					if( d_k <= 16.2063 )
						if( rsi1 <= 49.1869 )
							if( d <= 51.8638 )
								if( smoothK_k <= 1.01474 )
									ret := 0.368421
								if( smoothK_k > 1.01474 )
									ret := 0.792899 // buy
							if( d > 51.8638 )
								if( rsi1 <= 39.3543 )
									ret := -0.538462
								if( rsi1 > 39.3543 )
									ret := 0.775000 // buy
						if( rsi1 > 49.1869 )
							if( ad <= -35227.2 )
								if( d_k <= 12.7467 )
									ret := 0.278689
								if( d_k > 12.7467 )
									ret := 1.000000 // buy
							if( ad > -35227.2 )
								if( rsi1 <= 54.8098 )
									ret := -0.900000 // sell
								if( rsi1 > 54.8098 )
									ret := -0.142857
					if( d_k > 16.2063 )
						if( smoothK_k <= 30.0369 )
							ret := 0.071429
						if( smoothK_k > 30.0369 )
							ret := -0.666667
		if( k > 79.8907 )
			if( ad_mf <= -137837 )
				ret := 0.823529 // buy
			if( ad_mf > -137837 )
				if( d_k <= -10.4533 )
					if( ad_mf <= -43327 )
						if( d <= 71.7364 )
							if( rsi1 <= 55.9536 )
								ret := -0.333333
							if( rsi1 > 55.9536 )
								ret := 0.545455
						if( d > 71.7364 )
							ret := 0.857143 // buy
					if( ad_mf > -43327 )
						ret := -0.384615
				if( d_k > -10.4533 )
					if( mf <= -0.176773 )
						if( ad <= -83525.4 )
							ret := 0.200000
						if( ad > -83525.4 )
							if( d_k <= 1.91567 )
								if( smoothK_k <= 84.3582 )
									ret := -0.800000 // sell
								if( smoothK_k > 84.3582 )
									ret := -1.000000 // sell
							if( d_k > 1.91567 )
								if( smoothK_k <= 80.688 )
									ret := 0.000000
								if( smoothK_k > 80.688 )
									ret := -0.416667
					if( mf > -0.176773 )
						if( mf <= -0.020349 )
							if( smoothD_d <= 79.026 )
								ret := -0.545455
							if( smoothD_d > 79.026 )
								if( d <= 87.492 )
									ret := 0.708333 // buy
								if( d > 87.492 )
									ret := 0.228070
						if( mf > -0.020349 )
							if( smoothD_d <= 92.8136 )
								if( d_k <= 7.26839 )
									ret := 0.137931
								if( d_k > 7.26839 )
									ret := -0.625000
							if( smoothD_d > 92.8136 )
								if( mf <= 0.139265 )
									ret := -0.933333 // sell
								if( mf > 0.139265 )
									ret := -0.500000
	if( ad > -33941.4 )
		if( d_k <= -8.74601 )
			if( ad <= 124071 )
				if( mf <= 0.3172 )
					if( d <= 62.0046 )
						if( smoothK_k <= 79.9294 )
							if( rsi1 <= 74.83 )
								if( ad <= 11874.8 )
									ret := 0.032139
								if( ad > 11874.8 )
									ret := -0.052133
							if( rsi1 > 74.83 )
								if( mf <= 0.196514 )
									ret := -0.371257
								if( mf > 0.196514 )
									ret := 0.200000
						if( smoothK_k > 79.9294 )
							if( ad <= 25314.7 )
								if( k <= 85.8252 )
									ret := 0.566265
								if( k > 85.8252 )
									ret := 0.113924
							if( ad > 25314.7 )
								ret := -0.888889 // sell
					if( d > 62.0046 )
						if( smoothK_k <= 74.0686 )
							if( ad_mf <= -1860.7 )
								if( smoothK_k <= 72.3807 )
									ret := 0.324324
								if( smoothK_k > 72.3807 )
									ret := -0.470588
							if( ad_mf > -1860.7 )
								if( ad <= 1224.95 )
									ret := -0.800000 // sell
								if( ad > 1224.95 )
									ret := -0.272727
						if( smoothK_k > 74.0686 )
							if( ad_mf <= -11969.2 )
								if( smoothK_k <= 83.6247 )
									ret := -0.589286
								if( smoothK_k > 83.6247 )
									ret := -0.172840
							if( ad_mf > -11969.2 )
								if( ad_mf <= 34735.5 )
									ret := -0.041142
								if( ad_mf > 34735.5 )
									ret := 0.264463
				if( mf > 0.3172 )
					if( ad_mf <= -0.434236 )
						if( smoothK_k <= 36.8624 )
							ret := 0.062500
						if( smoothK_k > 36.8624 )
							if( mf <= 0.517839 )
								if( rsi1 <= 53.0392 )
									ret := -0.882353 // sell
								if( rsi1 > 53.0392 )
									ret := -0.386667
							if( mf > 0.517839 )
								ret := -1.000000 // sell
					if( ad_mf > -0.434236 )
						if( ad_mf <= 5914.58 )
							if( smoothD_d <= 60.0925 )
								if( d <= 20.6749 )
									ret := -0.350000
								if( d > 20.6749 )
									ret := 0.333333
							if( smoothD_d > 60.0925 )
								if( smoothD_d <= 64.4455 )
									ret := -0.800000 // sell
								if( smoothD_d > 64.4455 )
									ret := -0.027027
						if( ad_mf > 5914.58 )
							if( rsi1 <= 76.8599 )
								if( mf <= 0.337764 )
									ret := -0.096774
								if( mf > 0.337764 )
									ret := -0.496933
							if( rsi1 > 76.8599 )
								if( d <= 83.297 )
									ret := -0.062500
								if( d > 83.297 )
									ret := 0.571429
			if( ad > 124071 )
				if( d_k <= -13.1544 )
					if( d_k <= -20.5892 )
						ret := 1.000000 // buy
					if( d_k > -20.5892 )
						ret := 0.750000 // buy
				if( d_k > -13.1544 )
					ret := 0.333333
		if( d_k > -8.74601 )
			if( ad_mf <= 349.804 )
				if( ad <= -3102.91 )
					if( smoothK_k <= 49.9344 )
						if( k <= 28.521 )
							if( ad_mf <= -12490.6 )
								if( rsi1 <= 25.8311 )
									ret := 0.129032
								if( rsi1 > 25.8311 )
									ret := -0.081868
							if( ad_mf > -12490.6 )
								if( ad_mf <= -7004 )
									ret := 0.165760
								if( ad_mf > -7004 )
									ret := 0.017500
						if( k > 28.521 )
							if( mf <= -0.270809 )
								if( d <= 54.4145 )
									ret := -0.386792
								if( d > 54.4145 )
									ret := 0.150000
							if( mf > -0.270809 )
								if( rsi1 <= 18.3354 )
									ret := -0.809524 // sell
								if( rsi1 > 18.3354 )
									ret := -0.020116
					if( smoothK_k > 49.9344 )
						if( d <= 69.4028 )
							if( mf <= -0.282553 )
								if( mf <= -0.298058 )
									ret := -0.051948
								if( mf > -0.298058 )
									ret := -0.727273 // sell
							if( mf > -0.282553 )
								if( rsi1 <= 50.2247 )
									ret := 0.331776
								if( rsi1 > 50.2247 )
									ret := 0.168810
						if( d > 69.4028 )
							if( ad <= -3615.99 )
								if( ad_mf <= -32409.2 )
									ret := 0.656250
								if( ad_mf > -32409.2 )
									ret := 0.069013
							if( ad > -3615.99 )
								if( ad <= -3513.37 )
									ret := -0.548387
								if( ad > -3513.37 )
									ret := -0.116981
				if( ad > -3102.91 )
					if( d_k <= -2.32834 )
						if( rsi1 <= 23.256 )
							if( ad_mf <= -0.103351 )
								if( mf <= -0.212777 )
									ret := -0.208333
								if( mf > -0.212777 )
									ret := 0.296296
							if( ad_mf > -0.103351 )
								if( smoothK_k <= 5.75081 )
									ret := -0.250000
								if( smoothK_k > 5.75081 )
									ret := 0.787879 // buy
						if( rsi1 > 23.256 )
							if( d <= 22.429 )
								if( ad_mf <= -0.137547 )
									ret := 0.109053
								if( ad_mf > -0.137547 )
									ret := -0.391045
							if( d > 22.429 )
								if( smoothK_k <= 42.2172 )
									ret := 0.266467
								if( smoothK_k > 42.2172 )
									ret := 0.067010
					if( d_k > -2.32834 )
						if( k <= 0.291354 )
							if( ad_mf <= -41.2536 )
								if( mf <= -0.198965 )
									ret := 0.447368
								if( mf > -0.198965 )
									ret := 0.061224
							if( ad_mf > -41.2536 )
								if( d_k <= 6.47615 )
									ret := 0.617284
								if( d_k > 6.47615 )
									ret := 0.032787
						if( k > 0.291354 )
							if( smoothD_d <= 4.02628 )
								if( ad_mf <= -1648.01 )
									ret := 0.347305
								if( ad_mf > -1648.01 )
									ret := -0.081081
							if( smoothD_d > 4.02628 )
								if( smoothD_d <= 7.40069 )
									ret := 0.404867
								if( smoothD_d > 7.40069 )
									ret := 0.134560
			if( ad_mf > 349.804 )
				if( ad <= 98768.7 )
					if( ad <= 62059.8 )
						if( mf <= -0.105827 )
							if( ad_mf <= 2543.04 )
								if( d <= 29.1689 )
									ret := -0.204819
								if( d > 29.1689 )
									ret := -0.001927
							if( ad_mf > 2543.04 )
								if( ad_mf <= 19680.8 )
									ret := 0.090794
								if( ad_mf > 19680.8 )
									ret := 0.290993
						if( mf > -0.105827 )
							if( d <= 14.2772 )
								if( ad_mf <= 1459.73 )
									ret := 0.231481
								if( ad_mf > 1459.73 )
									ret := 0.067420
							if( d > 14.2772 )
								if( rsi1 <= 50.5335 )
									ret := -0.079114
								if( rsi1 > 50.5335 )
									ret := 0.022357
					if( ad > 62059.8 )
						if( ad_mf <= 72542.6 )
							if( smoothD_d <= 91.7678 )
								if( ad <= 70878 )
									ret := 0.419643
								if( ad > 70878 )
									ret := 0.937500 // buy
							if( smoothD_d > 91.7678 )
								ret := -0.400000
						if( ad_mf > 72542.6 )
							if( ad_mf <= 89436.1 )
								if( d <= 44.4012 )
									ret := -0.192308
								if( d > 44.4012 )
									ret := 0.196429
							if( ad_mf > 89436.1 )
								if( d_k <= -2.94757 )
									ret := 0.750000 // buy
								if( d_k > -2.94757 )
									ret := 0.181818
				if( ad > 98768.7 )
					if( mf <= 0.072584 )
						if( smoothK_k <= 42.722 )
							ret := -0.727273 // sell
						if( smoothK_k > 42.722 )
							ret := -1.000000 // sell
					if( mf > 0.072584 )
						if( ad <= 179500 )
							if( ad_mf <= 162965 )
								if( smoothD_d <= 57.5372 )
									ret := -0.394366
								if( smoothD_d > 57.5372 )
									ret := 0.169811
							if( ad_mf > 162965 )
								ret := -0.952381 // sell
						if( ad > 179500 )
							if( smoothD_d <= 69.2188 )
								if( ad <= 237507 )
									ret := 0.916667 // buy
								if( ad > 237507 )
									ret := 0.357143
							if( smoothD_d > 69.2188 )
								ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_HUBS_15Min_0979e3db(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


