//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: VETUSDT_15Min_2CS0_bea69b09 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_2CS0_bea69b09", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_bea69b09(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothD_d <= 39.6291 )
		if( k <= 25.5099 )
			if( ad_mf <= -2.70768e+06 )
				if( rsi1 <= 48.7893 )
					if( ad_mf <= -4.28346e+06 )
						if( ad_mf <= -3.04529e+07 )
							if( ad <= -6.80853e+07 )
								ret := -0.916667 // sell
							if( ad > -6.80853e+07 )
								ret := 0.388889
						if( ad_mf > -3.04529e+07 )
							if( ad <= -2.80493e+07 )
								ret := -0.958333 // sell
							if( ad > -2.80493e+07 )
								ret := -0.136797
					if( ad_mf > -4.28346e+06 )
						if( ad_mf <= -3.32824e+06 )
							if( ad <= -3.34953e+06 )
								ret := -0.381592
							if( ad > -3.34953e+06 )
								ret := -0.914894 // sell
						if( ad_mf > -3.32824e+06 )
							if( rsi1 <= 36.8519 )
								ret := -0.288110
							if( rsi1 > 36.8519 )
								ret := 0.024096
				if( rsi1 > 48.7893 )
					if( smoothD_d <= 5.57688 )
						if( ad <= -6.40677e+06 )
							if( k <= 4.75329 )
								ret := -0.379310
							if( k > 4.75329 )
								ret := -0.806452 // sell
						if( ad > -6.40677e+06 )
							if( rsi1 <= 58.7853 )
								ret := -0.121212
							if( rsi1 > 58.7853 )
								ret := 0.500000
					if( smoothD_d > 5.57688 )
						if( rsi1 <= 69.1294 )
							if( mf <= 0.067467 )
								ret := 0.227964
							if( mf > 0.067467 )
								ret := 0.030769
						if( rsi1 > 69.1294 )
							if( ad_mf <= -4.0642e+06 )
								ret := 0.884615 // buy
							if( ad_mf > -4.0642e+06 )
								ret := 0.166667
			if( ad_mf > -2.70768e+06 )
				if( mf <= -0.198392 )
					if( ad_mf <= 1.26453e+06 )
						if( d <= 14.4895 )
							if( ad_mf <= -1.05127e+06 )
								ret := -0.443902
							if( ad_mf > -1.05127e+06 )
								ret := -0.282642
						if( d > 14.4895 )
							if( rsi1 <= 38.2597 )
								ret := -0.250549
							if( rsi1 > 38.2597 )
								ret := 0.014184
					if( ad_mf > 1.26453e+06 )
						if( d_k <= 3.32971 )
							if( ad <= 1.16304e+07 )
								ret := 0.215909
							if( ad > 1.16304e+07 )
								ret := -0.500000
						if( d_k > 3.32971 )
							if( smoothK_k <= 9.16623 )
								ret := -0.600000
							if( smoothK_k > 9.16623 )
								ret := 0.033333
				if( mf > -0.198392 )
					if( k <= 12.9909 )
						if( rsi1 <= 38.8108 )
							if( rsi1 <= 29.6273 )
								ret := -0.608420
							if( rsi1 > 29.6273 )
								ret := -0.481459
						if( rsi1 > 38.8108 )
							if( rsi1 <= 47.9401 )
								ret := -0.341380
							if( rsi1 > 47.9401 )
								ret := -0.164835
					if( k > 12.9909 )
						if( k <= 19.0004 )
							if( ad_mf <= -1.15493e+06 )
								ret := -0.292035
							if( ad_mf > -1.15493e+06 )
								ret := -0.378785
						if( k > 19.0004 )
							if( smoothK_k <= 21.8499 )
								ret := -0.283340
							if( smoothK_k > 21.8499 )
								ret := -0.380531
		if( k > 25.5099 )
			if( ad_mf <= -1.35948e+06 )
				if( rsi1 <= 47.3001 )
					if( mf <= -0.072847 )
						if( d <= 19.0999 )
							if( d_k <= -15.3163 )
								ret := -0.866667 // sell
							if( d_k > -15.3163 )
								ret := -0.310000
						if( d > 19.0999 )
							if( ad <= -3.55416e+06 )
								ret := 0.209968
							if( ad > -3.55416e+06 )
								ret := -0.037831
					if( mf > -0.072847 )
						if( mf <= 0.043678 )
							if( ad <= -7.8856e+06 )
								ret := 0.152381
							if( ad > -7.8856e+06 )
								ret := -0.194861
						if( mf > 0.043678 )
							if( rsi1 <= 44.2087 )
								ret := -0.461538
							if( rsi1 > 44.2087 )
								ret := -0.141791
				if( rsi1 > 47.3001 )
					if( d_k <= 2.18886 )
						if( d <= 23.1185 )
							if( ad_mf <= -4.56802e+06 )
								ret := -0.087719
							if( ad_mf > -4.56802e+06 )
								ret := 0.162338
						if( d > 23.1185 )
							if( ad <= -1.56026e+07 )
								ret := 0.687500
							if( ad > -1.56026e+07 )
								ret := 0.314770
					if( d_k > 2.18886 )
						if( d_k <= 14.1676 )
							if( ad <= -1.49811e+06 )
								ret := 0.119048
							if( ad > -1.49811e+06 )
								ret := -0.909091 // sell
						if( d_k > 14.1676 )
							ret := 1.000000 // buy
			if( ad_mf > -1.35948e+06 )
				if( smoothK_k <= 34.1992 )
					if( smoothK_k <= 29.8991 )
						if( ad_mf <= 4.42439e+06 )
							if( ad <= 395372 )
								ret := -0.187897
							if( ad > 395372 )
								ret := -0.298153
						if( ad_mf > 4.42439e+06 )
							if( mf <= 0.037863 )
								ret := -0.014493
							if( mf > 0.037863 )
								ret := -0.261905
					if( smoothK_k > 29.8991 )
						if( smoothD_d <= 33.8814 )
							if( ad <= 1.02446e+07 )
								ret := -0.124231
							if( ad > 1.02446e+07 )
								ret := -0.475410
						if( smoothD_d > 33.8814 )
							if( mf <= -0.090163 )
								ret := 0.000000
							if( mf > -0.090163 )
								ret := -0.314356
				if( smoothK_k > 34.1992 )
					if( d <= 34.991 )
						if( rsi1 <= 49.1531 )
							if( smoothD_d <= 20.7649 )
								ret := -0.440476
							if( smoothD_d > 20.7649 )
								ret := -0.258209
						if( rsi1 > 49.1531 )
							if( ad <= -400986 )
								ret := 0.245833
							if( ad > -400986 )
								ret := -0.004695
					if( d > 34.991 )
						if( ad <= 659948 )
							if( rsi1 <= 46.1461 )
								ret := -0.211594
							if( rsi1 > 46.1461 )
								ret := 0.221725
						if( ad > 659948 )
							if( mf <= -0.106763 )
								ret := 0.115987
							if( mf > -0.106763 )
								ret := -0.127884
	if( smoothD_d > 39.6291 )
		if( k <= 66.3374 )
			if( k <= 52.2179 )
				if( ad <= 314476 )
					if( rsi1 <= 50.0003 )
						if( ad <= -3.55144e+06 )
							if( rsi1 <= 30.2372 )
								ret := -0.178571
							if( rsi1 > 30.2372 )
								ret := 0.136878
						if( ad > -3.55144e+06 )
							if( d_k <= -0.002669 )
								ret := -0.022556
							if( d_k > -0.002669 )
								ret := -0.212403
					if( rsi1 > 50.0003 )
						if( d <= 50.7722 )
							if( ad <= -7.91998e+06 )
								ret := -0.225000
							if( ad > -7.91998e+06 )
								ret := 0.257426
						if( d > 50.7722 )
							if( rsi1 <= 69.7348 )
								ret := 0.066215
							if( rsi1 > 69.7348 )
								ret := 0.392157
				if( ad > 314476 )
					if( rsi1 <= 52.5186 )
						if( d_k <= -2.52789 )
							if( rsi1 <= 46.2778 )
								ret := -0.079365
							if( rsi1 > 46.2778 )
								ret := 0.256757
						if( d_k > -2.52789 )
							if( rsi1 <= 43.5445 )
								ret := -0.449275
							if( rsi1 > 43.5445 )
								ret := -0.246397
					if( rsi1 > 52.5186 )
						if( rsi1 <= 59.7903 )
							if( ad_mf <= 1.08459e+06 )
								ret := 0.053292
							if( ad_mf > 1.08459e+06 )
								ret := -0.195850
						if( rsi1 > 59.7903 )
							if( mf <= 0.315647 )
								ret := 0.154776
							if( mf > 0.315647 )
								ret := -0.243056
			if( k > 52.2179 )
				if( rsi1 <= 47.0721 )
					if( ad <= -3.58291e+06 )
						if( smoothD_d <= 53.0996 )
							if( mf <= -0.184231 )
								ret := 0.666667
							if( mf > -0.184231 )
								ret := 0.167598
						if( smoothD_d > 53.0996 )
							if( d <= 79.468 )
								ret := -0.041131
							if( d > 79.468 )
								ret := 0.761905 // buy
					if( ad > -3.58291e+06 )
						if( d_k <= -7.326 )
							if( mf <= 0.120393 )
								ret := 0.045770
							if( mf > 0.120393 )
								ret := -0.525000
						if( d_k > -7.326 )
							if( ad_mf <= 0.067956 )
								ret := -0.128311
							if( ad_mf > 0.067956 )
								ret := -0.306007
				if( rsi1 > 47.0721 )
					if( ad_mf <= 1.57363e+06 )
						if( smoothD_d <= 54.8195 )
							if( rsi1 <= 59.2277 )
								ret := 0.232378
							if( rsi1 > 59.2277 )
								ret := 0.460026
						if( smoothD_d > 54.8195 )
							if( rsi1 <= 63.0385 )
								ret := 0.093730
							if( rsi1 > 63.0385 )
								ret := 0.321839
					if( ad_mf > 1.57363e+06 )
						if( rsi1 <= 65.4035 )
							if( mf <= 0.176736 )
								ret := 0.015482
							if( mf > 0.176736 )
								ret := -0.292011
						if( rsi1 > 65.4035 )
							if( mf <= 0.301164 )
								ret := 0.256566
							if( mf > 0.301164 )
								ret := -0.051471
		if( k > 66.3374 )
			if( k <= 80.8194 )
				if( d <= 86.7531 )
					if( ad_mf <= -82489.8 )
						if( rsi1 <= 55.9353 )
							if( mf <= 0.021761 )
								ret := 0.216781
							if( mf > 0.021761 )
								ret := 0.004646
						if( rsi1 > 55.9353 )
							if( d <= 65.4985 )
								ret := 0.509537
							if( d > 65.4985 )
								ret := 0.346337
					if( ad_mf > -82489.8 )
						if( rsi1 <= 44.8251 )
							if( ad <= 1.20741e+07 )
								ret := -0.144941
							if( ad > 1.20741e+07 )
								ret := 0.530612
						if( rsi1 > 44.8251 )
							if( rsi1 <= 66.9733 )
								ret := 0.136794
							if( rsi1 > 66.9733 )
								ret := 0.316249
				if( d > 86.7531 )
					if( ad_mf <= -8.08155e+06 )
						if( mf <= -0.034308 )
							if( mf <= -0.085774 )
								ret := 0.000000
							if( mf > -0.085774 )
								ret := 1.000000 // buy
						if( mf > -0.034308 )
							if( smoothK_k <= 74.0487 )
								ret := -0.142857
							if( smoothK_k > 74.0487 )
								ret := -0.812500 // sell
					if( ad_mf > -8.08155e+06 )
						if( mf <= -0.11838 )
							if( d <= 88.3484 )
								ret := -0.053571
							if( d > 88.3484 )
								ret := 0.275862
						if( mf > -0.11838 )
							if( ad <= 5.05523e+06 )
								ret := 0.389758
							if( ad > 5.05523e+06 )
								ret := 0.772727 // buy
			if( k > 80.8194 )
				if( rsi1 <= 60.0056 )
					if( ad_mf <= -669285 )
						if( mf <= -0.007155 )
							if( d_k <= 4.36012 )
								ret := 0.427413
							if( d_k > 4.36012 )
								ret := 0.244373
						if( mf > -0.007155 )
							if( ad <= -4.65924e+06 )
								ret := -0.166667
							if( ad > -4.65924e+06 )
								ret := 0.245245
					if( ad_mf > -669285 )
						if( mf <= -0.017814 )
							if( ad <= 2.96395e+06 )
								ret := 0.249928
							if( ad > 2.96395e+06 )
								ret := 0.121045
						if( mf > -0.017814 )
							if( rsi1 <= 50.0865 )
								ret := -0.003722
							if( rsi1 > 50.0865 )
								ret := 0.184271
				if( rsi1 > 60.0056 )
					if( mf <= 0.203393 )
						if( rsi1 <= 72.7276 )
							if( ad_mf <= 4.08541e+06 )
								ret := 0.458733
							if( ad_mf > 4.08541e+06 )
								ret := 0.257360
						if( rsi1 > 72.7276 )
							if( ad <= -4.82076e+06 )
								ret := 0.151659
							if( ad > -4.82076e+06 )
								ret := 0.605858
					if( mf > 0.203393 )
						if( ad_mf <= 1.09958e+07 )
							if( rsi1 <= 74.7364 )
								ret := 0.216514
							if( rsi1 > 74.7364 )
								ret := 0.383648
						if( ad_mf > 1.09958e+07 )
							if( rsi1 <= 79.0865 )
								ret := -0.175758
							if( rsi1 > 79.0865 )
								ret := 0.414634
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_bea69b09(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


