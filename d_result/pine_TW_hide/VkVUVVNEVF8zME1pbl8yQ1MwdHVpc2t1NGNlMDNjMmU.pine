//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: VETUSDT_30Min_2CS0_4ce03c2e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2CS0_4ce03c2e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_4ce03c2e(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( d_k <= -0.921882 )
		if( k <= 33.6428 )
			if( k <= 16.7727 )
				if( rsi1 <= 37.9409 )
					if( ad_mf <= -5.27977e+07 )
						if( ad_mf <= -5.82835e+07 )
							if( mf <= -0.048396 )
								ret := 0.447368
							if( mf > -0.048396 )
								ret := -0.823529 // sell
						if( ad_mf > -5.82835e+07 )
							if( ad <= -5.58082e+07 )
								ret := 1.000000 // buy
							if( ad > -5.58082e+07 )
								ret := 0.714286 // buy
					if( ad_mf > -5.27977e+07 )
						if( mf <= -0.119216 )
							if( rsi1 <= 24.8646 )
								ret := -0.426752
							if( rsi1 > 24.8646 )
								ret := -0.195312
						if( mf > -0.119216 )
							if( rsi1 <= 31.8666 )
								ret := -0.642559
							if( rsi1 > 31.8666 )
								ret := -0.389228
				if( rsi1 > 37.9409 )
					if( rsi1 <= 45.4765 )
						if( ad <= -3.59664e+07 )
							if( mf <= 0.054374 )
								ret := 0.521739
							if( mf > 0.054374 )
								ret := -0.333333
						if( ad > -3.59664e+07 )
							if( mf <= 0.0262 )
								ret := -0.093878
							if( mf > 0.0262 )
								ret := -0.358578
					if( rsi1 > 45.4765 )
						if( ad_mf <= -2.15411e+06 )
							if( smoothK_k <= 8.16876 )
								ret := 0.023585
							if( smoothK_k > 8.16876 )
								ret := 0.350877
						if( ad_mf > -2.15411e+06 )
							if( mf <= 0.102971 )
								ret := 0.057971
							if( mf > 0.102971 )
								ret := -0.190476
			if( k > 16.7727 )
				if( d_k <= -4.74845 )
					if( ad_mf <= -7.51278e+06 )
						if( k <= 21.8961 )
							if( mf <= 0.096078 )
								ret := 0.142857
							if( mf > 0.096078 )
								ret := 0.666667
						if( k > 21.8961 )
							if( rsi1 <= 44.6029 )
								ret := 0.235294
							if( rsi1 > 44.6029 )
								ret := 0.678261
					if( ad_mf > -7.51278e+06 )
						if( ad <= 4.58433e+06 )
							if( ad <= -2.89309e+06 )
								ret := 0.046667
							if( ad > -2.89309e+06 )
								ret := -0.181098
						if( ad > 4.58433e+06 )
							if( rsi1 <= 49.5969 )
								ret := -0.015515
							if( rsi1 > 49.5969 )
								ret := 0.331429
				if( d_k > -4.74845 )
					if( ad <= -7.1579e+06 )
						if( rsi1 <= 37.6276 )
							if( ad <= -2.96437e+07 )
								ret := 0.157143
							if( ad > -2.96437e+07 )
								ret := -0.352201
						if( rsi1 > 37.6276 )
							if( d_k <= -4.27911 )
								ret := 0.021739
							if( d_k > -4.27911 )
								ret := 0.405556
					if( ad > -7.1579e+06 )
						if( mf <= -0.008336 )
							if( ad_mf <= 8.08297e+06 )
								ret := -0.209524
							if( ad_mf > 8.08297e+06 )
								ret := -0.386503
						if( mf > -0.008336 )
							if( d_k <= -2.97955 )
								ret := -0.026860
							if( d_k > -2.97955 )
								ret := -0.190789
		if( k > 33.6428 )
			if( smoothK_k <= 59.6689 )
				if( rsi1 <= 46.0067 )
					if( ad_mf <= -7.50406e+06 )
						if( d_k <= -3.52709 )
							if( ad_mf <= -1.15216e+07 )
								ret := 0.521396
							if( ad_mf > -1.15216e+07 )
								ret := 0.229839
						if( d_k > -3.52709 )
							if( ad <= -3.11375e+07 )
								ret := 0.266667
							if( ad > -3.11375e+07 )
								ret := -0.110526
					if( ad_mf > -7.50406e+06 )
						if( d_k <= -6.6341 )
							if( mf <= 0.028522 )
								ret := 0.011344
							if( mf > 0.028522 )
								ret := -0.232759
						if( d_k > -6.6341 )
							if( rsi1 <= 35.9113 )
								ret := -0.407767
							if( rsi1 > 35.9113 )
								ret := -0.188188
				if( rsi1 > 46.0067 )
					if( d_k <= -3.2475 )
						if( mf <= 0.112422 )
							if( ad_mf <= -2.65458e+06 )
								ret := 0.679235
							if( ad_mf > -2.65458e+06 )
								ret := 0.409811
						if( mf > 0.112422 )
							if( rsi1 <= 56.6088 )
								ret := 0.015267
							if( rsi1 > 56.6088 )
								ret := 0.450056
					if( d_k > -3.2475 )
						if( d_k <= -1.86024 )
							if( ad <= -124284 )
								ret := 0.500000
							if( ad > -124284 )
								ret := 0.256198
						if( d_k > -1.86024 )
							if( d_k <= -1.34178 )
								ret := 0.151786
							if( d_k > -1.34178 )
								ret := 0.359788
			if( smoothK_k > 59.6689 )
				if( ad <= -2.51165e+06 )
					if( d_k <= -2.62681 )
						if( smoothK_k <= 68.6305 )
							if( mf <= -0.098179 )
								ret := 0.403141
							if( mf > -0.098179 )
								ret := 0.619639
						if( smoothK_k > 68.6305 )
							if( mf <= -0.402402 )
								ret := -0.428571
							if( mf > -0.402402 )
								ret := 0.638111
					if( d_k > -2.62681 )
						if( smoothD_d <= 64.9983 )
							if( smoothD_d <= 63.3415 )
								ret := 0.574713
							if( smoothD_d > 63.3415 )
								ret := 0.883721 // buy
						if( smoothD_d > 64.9983 )
							if( k <= 78.4661 )
								ret := 0.254902
							if( k > 78.4661 )
								ret := 0.514706
				if( ad > -2.51165e+06 )
					if( rsi1 <= 53.7324 )
						if( d_k <= -7.09192 )
							if( ad <= 9.58245e+06 )
								ret := 0.148241
							if( ad > 9.58245e+06 )
								ret := 0.376866
						if( d_k > -7.09192 )
							if( mf <= -0.056285 )
								ret := 0.136076
							if( mf > -0.056285 )
								ret := -0.092958
					if( rsi1 > 53.7324 )
						if( rsi1 <= 63.6422 )
							if( mf <= 0.11025 )
								ret := 0.495097
							if( mf > 0.11025 )
								ret := 0.147668
						if( rsi1 > 63.6422 )
							if( mf <= 0.142603 )
								ret := 0.661548
							if( mf > 0.142603 )
								ret := 0.533838
	if( d_k > -0.921882 )
		if( k <= 59.9075 )
			if( smoothK_k <= 22.8176 )
				if( rsi1 <= 42.4242 )
					if( ad <= -5.01745e+07 )
						if( ad_mf <= -9.90479e+07 )
							if( ad <= -1.42753e+08 )
								ret := -0.750000 // sell
							if( ad > -1.42753e+08 )
								ret := 0.846154 // buy
						if( ad_mf > -9.90479e+07 )
							if( ad_mf <= -5.06494e+07 )
								ret := -0.254438
							if( ad_mf > -5.06494e+07 )
								ret := 1.000000 // buy
					if( ad > -5.01745e+07 )
						if( k <= 0.000242 )
							if( rsi1 <= 24.862 )
								ret := -0.615842
							if( rsi1 > 24.862 )
								ret := -0.397698
						if( k > 0.000242 )
							if( rsi1 <= 33.3322 )
								ret := -0.692486
							if( rsi1 > 33.3322 )
								ret := -0.555652
				if( rsi1 > 42.4242 )
					if( ad <= 3.16012e+06 )
						if( rsi1 <= 51.6621 )
							if( d_k <= 3.76455 )
								ret := -0.163721
							if( d_k > 3.76455 )
								ret := -0.335676
						if( rsi1 > 51.6621 )
							if( rsi1 <= 60.6917 )
								ret := -0.057074
							if( rsi1 > 60.6917 )
								ret := 0.187348
					if( ad > 3.16012e+06 )
						if( rsi1 <= 49.9412 )
							if( mf <= 0.076916 )
								ret := -0.377637
							if( mf > 0.076916 )
								ret := -0.665037
						if( rsi1 > 49.9412 )
							if( mf <= 0.195948 )
								ret := -0.145695
							if( mf > 0.195948 )
								ret := -0.439072
			if( smoothK_k > 22.8176 )
				if( ad <= 4.42534e+06 )
					if( d_k <= 6.26551 )
						if( k <= 44.8185 )
							if( ad_mf <= -5.26255e+07 )
								ret := 0.258427
							if( ad_mf > -5.26255e+07 )
								ret := -0.208660
						if( k > 44.8185 )
							if( rsi1 <= 54.2324 )
								ret := -0.209241
							if( rsi1 > 54.2324 )
								ret := 0.344733
					if( d_k > 6.26551 )
						if( rsi1 <= 54.7809 )
							if( ad_mf <= -9.05674e+07 )
								ret := 0.684211
							if( ad_mf > -9.05674e+07 )
								ret := -0.459361
						if( rsi1 > 54.7809 )
							if( mf <= 0.09611 )
								ret := 0.134034
							if( mf > 0.09611 )
								ret := -0.060254
				if( ad > 4.42534e+06 )
					if( ad <= 1.27886e+08 )
						if( rsi1 <= 55.0747 )
							if( d_k <= 4.52416 )
								ret := -0.433423
							if( d_k > 4.52416 )
								ret := -0.684063
						if( rsi1 > 55.0747 )
							if( rsi1 <= 63.6831 )
								ret := -0.208408
							if( rsi1 > 63.6831 )
								ret := 0.156900
					if( ad > 1.27886e+08 )
						if( smoothD_d <= 34.3344 )
							if( rsi1 <= 48.0974 )
								ret := -0.500000
							if( rsi1 > 48.0974 )
								ret := -1.000000 // sell
						if( smoothD_d > 34.3344 )
							if( d_k <= 6.87704 )
								ret := -0.941176 // sell
							if( d_k > 6.87704 )
								ret := -1.000000 // sell
		if( k > 59.9075 )
			if( k <= 82.2667 )
				if( ad_mf <= 6.59131e+06 )
					if( rsi1 <= 52.6263 )
						if( ad_mf <= 3.26461e+06 )
							if( rsi1 <= 45.2322 )
								ret := -0.284588
							if( rsi1 > 45.2322 )
								ret := -0.104564
						if( ad_mf > 3.26461e+06 )
							if( rsi1 <= 51.6459 )
								ret := -0.508197
							if( rsi1 > 51.6459 )
								ret := 0.139535
					if( rsi1 > 52.6263 )
						if( smoothD_d <= 63.6857 )
							if( rsi1 <= 58.4016 )
								ret := 0.354167
							if( rsi1 > 58.4016 )
								ret := 0.626667
						if( smoothD_d > 63.6857 )
							if( rsi1 <= 64.3597 )
								ret := 0.139812
							if( rsi1 > 64.3597 )
								ret := 0.397302
				if( ad_mf > 6.59131e+06 )
					if( mf <= 0.156799 )
						if( d_k <= 3.99423 )
							if( rsi1 <= 63.7697 )
								ret := -0.361905
							if( rsi1 > 63.7697 )
								ret := 0.554974
						if( d_k > 3.99423 )
							if( smoothK_k <= 70.9837 )
								ret := -0.516667
							if( smoothK_k > 70.9837 )
								ret := -0.323974
					if( mf > 0.156799 )
						if( ad_mf <= 1.18801e+08 )
							if( ad <= 6.26265e+07 )
								ret := 0.001279
							if( ad > 6.26265e+07 )
								ret := -0.287129
						if( ad_mf > 1.18801e+08 )
							if( ad_mf <= 2.17922e+08 )
								ret := -1.000000 // sell
							if( ad_mf > 2.17922e+08 )
								ret := -0.500000
			if( k > 82.2667 )
				if( smoothK_k <= 88.2452 )
					if( rsi1 <= 53.05 )
						if( smoothD_d <= 84.4419 )
							if( ad <= -4.21339e+07 )
								ret := 1.000000 // buy
							if( ad > -4.21339e+07 )
								ret := -0.055300
						if( smoothD_d > 84.4419 )
							if( ad <= 7.52778e+06 )
								ret := -0.070968
							if( ad > 7.52778e+06 )
								ret := -0.453125
					if( rsi1 > 53.05 )
						if( ad <= 9.30875e+06 )
							if( rsi1 <= 62.2698 )
								ret := 0.296566
							if( rsi1 > 62.2698 )
								ret := 0.480638
						if( ad > 9.30875e+06 )
							if( rsi1 <= 70.4516 )
								ret := 0.003630
							if( rsi1 > 70.4516 )
								ret := 0.321321
				if( smoothK_k > 88.2452 )
					if( rsi1 <= 56.0427 )
						if( ad_mf <= -871993 )
							if( ad <= -3.71769e+07 )
								ret := -0.428571
							if( ad > -3.71769e+07 )
								ret := 0.301724
						if( ad_mf > -871993 )
							if( ad_mf <= 4.61351e+07 )
								ret := 0.007317
							if( ad_mf > 4.61351e+07 )
								ret := 0.600000
					if( rsi1 > 56.0427 )
						if( rsi1 <= 76.142 )
							if( ad <= 5.25571e+07 )
								ret := 0.443213
							if( ad > 5.25571e+07 )
								ret := -0.084746
						if( rsi1 > 76.142 )
							if( ad <= -5.03517e+07 )
								ret := -0.454545
							if( ad > -5.03517e+07 )
								ret := 0.613714
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_4ce03c2e(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


