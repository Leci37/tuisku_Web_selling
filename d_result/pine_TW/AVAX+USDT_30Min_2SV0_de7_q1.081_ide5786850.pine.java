//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AVAXUSDT_30Min_2SV0_e5786850 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2SV0_e5786850", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_e5786850(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( rsi1 <= 50.2722 )
		if( d_k <= -3.04787 )
			if( rsi1 <= 31.2471 )
				if( VIP_VIM <= -0.432427 )
					if( k <= 17.604 )
						if( smoothD_d <= 1.76077 )
							if( VIM <= 1.21096 )
								ret := 0.000000
							if( VIM > 1.21096 )
								ret := -0.768212 // sell
						if( smoothD_d > 1.76077 )
							if( smoothK_k <= 12.6539 )
								ret := -0.171875
							if( smoothK_k > 12.6539 )
								ret := -0.661972
					if( k > 17.604 )
						if( smoothK_k <= 63.2745 )
							if( VIP <= 0.541834 )
								ret := 0.651515
							if( VIP > 0.541834 )
								ret := -0.062721
						if( smoothK_k > 63.2745 )
							if( VIM <= 1.33166 )
								ret := -0.475000
							if( VIM > 1.33166 )
								ret := 0.042553
				if( VIP_VIM > -0.432427 )
					if( VIP <= 0.855493 )
						if( smoothD_d <= 34.5704 )
							if( VIP_VIM <= -0.333069 )
								ret := -0.410023
							if( VIP_VIM > -0.333069 )
								ret := -0.627451
						if( smoothD_d > 34.5704 )
							if( d <= 46.0027 )
								ret := -0.873016 // sell
							if( d > 46.0027 )
								ret := -0.448980
					if( VIP > 0.855493 )
						if( d <= 20.7983 )
							if( VIM <= 1.20025 )
								ret := -0.806250 // sell
							if( VIM > 1.20025 )
								ret := -0.200000
						if( d > 20.7983 )
							if( k <= 36.4906 )
								ret := -0.130435
							if( k > 36.4906 )
								ret := -0.757576 // sell
			if( rsi1 > 31.2471 )
				if( d_k <= -16.5266 )
					if( VIP <= 0.938517 )
						if( k <= 75.4858 )
							if( d <= 55.143 )
								ret := 0.396472
							if( d > 55.143 )
								ret := -0.541667
						if( k > 75.4858 )
							if( VIP_VIM <= -0.302535 )
								ret := 0.597598
							if( VIP_VIM > -0.302535 )
								ret := 0.239130
					if( VIP > 0.938517 )
						if( k <= 49.473 )
							if( VIP_VIM <= -0.083979 )
								ret := -0.062500
							if( VIP_VIM > -0.083979 )
								ret := -0.759259 // sell
						if( k > 49.473 )
							if( rsi1 <= 45.6227 )
								ret := 0.279070
							if( rsi1 > 45.6227 )
								ret := -0.290698
				if( d_k > -16.5266 )
					if( VIP_VIM <= -0.110728 )
						if( d_k <= -6.95538 )
							if( VIP_VIM <= -0.416081 )
								ret := 0.483728
							if( VIP_VIM > -0.416081 )
								ret := 0.127009
						if( d_k > -6.95538 )
							if( k <= 99.7483 )
								ret := 0.064099
							if( k > 99.7483 )
								ret := 0.698630
					if( VIP_VIM > -0.110728 )
						if( VIP_VIM <= 0.021165 )
							if( rsi1 <= 42.3153 )
								ret := -0.636170
							if( rsi1 > 42.3153 )
								ret := -0.002287
						if( VIP_VIM > 0.021165 )
							if( rsi1 <= 45.4405 )
								ret := -0.576305
							if( rsi1 > 45.4405 )
								ret := -0.266169
		if( d_k > -3.04787 )
			if( rsi1 <= 38.3918 )
				if( VIM <= 1.07492 )
					if( smoothK_k <= -0.405487 )
						if( d <= 14.129 )
							if( rsi1 <= 27.7664 )
								ret := -0.826923 // sell
							if( rsi1 > 27.7664 )
								ret := -0.658816
						if( d > 14.129 )
							if( VIM <= 1.06559 )
								ret := -0.908629 // sell
							if( VIM > 1.06559 )
								ret := -0.285714
					if( smoothK_k > -0.405487 )
						if( VIP <= 0.88011 )
							if( k <= 47.508 )
								ret := -0.282051
							if( k > 47.508 )
								ret := 0.545455
						if( VIP > 0.88011 )
							if( d <= 30.952 )
								ret := -0.659737
							if( d > 30.952 )
								ret := -0.743172 // sell
				if( VIM > 1.07492 )
					if( smoothD_d <= -0.37368 )
						if( smoothK_k <= -2.37202 )
							if( rsi1 <= 22.0223 )
								ret := -0.841294 // sell
							if( rsi1 > 22.0223 )
								ret := -0.492188
						if( smoothK_k > -2.37202 )
							if( d_k <= 1.36987 )
								ret := -0.595472
							if( d_k > 1.36987 )
								ret := 0.315789
					if( smoothD_d > -0.37368 )
						if( VIP <= 0.848083 )
							if( VIM <= 1.29223 )
								ret := -0.295082
							if( VIM > 1.29223 )
								ret := 0.027972
						if( VIP > 0.848083 )
							if( VIP_VIM <= -0.321357 )
								ret := -0.186441
							if( VIP_VIM > -0.321357 )
								ret := -0.517861
			if( rsi1 > 38.3918 )
				if( VIP_VIM <= -0.079716 )
					if( VIM <= 1.1462 )
						if( smoothK_k <= 92.9695 )
							if( rsi1 <= 42.4964 )
								ret := -0.077042
							if( rsi1 > 42.4964 )
								ret := 0.187595
						if( smoothK_k > 92.9695 )
							if( rsi1 <= 44.8669 )
								ret := 0.333333
							if( rsi1 > 44.8669 )
								ret := -0.532609
					if( VIM > 1.1462 )
						if( VIP_VIM <= -0.297715 )
							if( smoothD_d <= 64.4477 )
								ret := 0.630872
							if( smoothD_d > 64.4477 )
								ret := 0.356077
						if( VIP_VIM > -0.297715 )
							if( smoothK_k <= 95.3709 )
								ret := 0.132075
							if( smoothK_k > 95.3709 )
								ret := -0.812500 // sell
				if( VIP_VIM > -0.079716 )
					if( VIP_VIM <= 0.067722 )
						if( rsi1 <= 45.1419 )
							if( smoothD_d <= -1.25044 )
								ret := -0.743056 // sell
							if( smoothD_d > -1.25044 )
								ret := -0.385379
						if( rsi1 > 45.1419 )
							if( k <= 50.237 )
								ret := 0.023275
							if( k > 50.237 )
								ret := -0.339075
					if( VIP_VIM > 0.067722 )
						if( rsi1 <= 47.6175 )
							if( d_k <= 4.2884 )
								ret := -0.516236
							if( d_k > 4.2884 )
								ret := -0.665891
						if( rsi1 > 47.6175 )
							if( VIM <= 0.961718 )
								ret := -0.445122
							if( VIM > 0.961718 )
								ret := -0.055276
	if( rsi1 > 50.2722 )
		if( d_k <= 2.30365 )
			if( VIP <= 0.957528 )
				if( d_k <= -10.3405 )
					if( rsi1 <= 62.2701 )
						if( smoothK_k <= 89.0083 )
							if( smoothD_d <= 43.2312 )
								ret := 0.699132
							if( smoothD_d > 43.2312 )
								ret := 0.568182
						if( smoothK_k > 89.0083 )
							if( d <= 67.9542 )
								ret := 0.400000
							if( d > 67.9542 )
								ret := 0.749263 // buy
					if( rsi1 > 62.2701 )
						if( rsi1 <= 72.6685 )
							if( d_k <= -21.3607 )
								ret := 0.895349 // buy
							if( d_k > -21.3607 )
								ret := 0.772300 // buy
						if( rsi1 > 72.6685 )
							if( VIP <= 0.833869 )
								ret := 0.625000
							if( VIP > 0.833869 )
								ret := 0.983471 // buy
				if( d_k > -10.3405 )
					if( rsi1 <= 59.7781 )
						if( VIP <= 0.915293 )
							if( rsi1 <= 52.9419 )
								ret := 0.400978
							if( rsi1 > 52.9419 )
								ret := 0.553824
						if( VIP > 0.915293 )
							if( k <= 80.2075 )
								ret := 0.502924
							if( k > 80.2075 )
								ret := 0.144397
					if( rsi1 > 59.7781 )
						if( d <= 84.0158 )
							if( VIP_VIM <= -0.116307 )
								ret := 0.283333
							if( VIP_VIM > -0.116307 )
								ret := 0.740000 // buy
						if( d > 84.0158 )
							if( k <= 97.2241 )
								ret := 0.747934 // buy
							if( k > 97.2241 )
								ret := 0.656506
			if( VIP > 0.957528 )
				if( k <= 94.9762 )
					if( d_k <= -5.73912 )
						if( VIM <= 0.733947 )
							if( rsi1 <= 84.3187 )
								ret := -0.173611
							if( rsi1 > 84.3187 )
								ret := -0.888889 // sell
						if( VIM > 0.733947 )
							if( rsi1 <= 63.7464 )
								ret := 0.273715
							if( rsi1 > 63.7464 )
								ret := 0.675332
					if( d_k > -5.73912 )
						if( rsi1 <= 62.0841 )
							if( VIM <= 0.900916 )
								ret := -0.185934
							if( VIM > 0.900916 )
								ret := 0.157386
						if( rsi1 > 62.0841 )
							if( VIP <= 1.16017 )
								ret := 0.508816
							if( VIP > 1.16017 )
								ret := 0.224451
				if( k > 94.9762 )
					if( k <= 99.8105 )
						if( rsi1 <= 65.254 )
							if( rsi1 <= 56.1702 )
								ret := -0.018018
							if( rsi1 > 56.1702 )
								ret := 0.313707
						if( rsi1 > 65.254 )
							if( smoothD_d <= 73.5099 )
								ret := -0.076923
							if( smoothD_d > 73.5099 )
								ret := 0.632419
					if( k > 99.8105 )
						if( smoothD_d <= 80.1136 )
							if( VIP_VIM <= 0.11768 )
								ret := 0.777778 // buy
							if( VIP_VIM > 0.11768 )
								ret := -0.169811
						if( smoothD_d > 80.1136 )
							if( VIP_VIM <= 0.67391 )
								ret := 0.707267 // buy
							if( VIP_VIM > 0.67391 )
								ret := 0.418605
		if( d_k > 2.30365 )
			if( d <= 88.5123 )
				if( VIM <= 0.92364 )
					if( rsi1 <= 66.4341 )
						if( VIP_VIM <= 0.426696 )
							if( rsi1 <= 57.6425 )
								ret := -0.349144
							if( rsi1 > 57.6425 )
								ret := -0.008032
						if( VIP_VIM > 0.426696 )
							if( d_k <= 9.76862 )
								ret := -0.327236
							if( d_k > 9.76862 )
								ret := -0.549898
					if( rsi1 > 66.4341 )
						if( VIP_VIM <= 0.5276 )
							if( d_k <= 17.3515 )
								ret := 0.383323
							if( d_k > 17.3515 )
								ret := -0.341772
						if( VIP_VIM > 0.5276 )
							if( smoothD_d <= 77.2891 )
								ret := 0.091769
							if( smoothD_d > 77.2891 )
								ret := -0.272171
				if( VIM > 0.92364 )
					if( rsi1 <= 52.911 )
						if( smoothK_k <= 63.0198 )
							if( VIP_VIM <= -0.091199 )
								ret := 0.666667
							if( VIP_VIM > -0.091199 )
								ret := 0.052174
						if( smoothK_k > 63.0198 )
							if( VIP_VIM <= 0.025643 )
								ret := 0.196429
							if( VIP_VIM > 0.025643 )
								ret := -0.449198
					if( rsi1 > 52.911 )
						if( VIP <= 1.07418 )
							if( d_k <= 3.03742 )
								ret := 0.203252
							if( d_k > 3.03742 )
								ret := 0.456961
						if( VIP > 1.07418 )
							if( d_k <= 19.4679 )
								ret := 0.060952
							if( d_k > 19.4679 )
								ret := 0.727273 // buy
			if( d > 88.5123 )
				if( smoothD_d <= 90.7555 )
					if( smoothK_k <= 87.7981 )
						if( VIP_VIM <= 0.037182 )
							if( k <= 83.2651 )
								ret := 0.220588
							if( k > 83.2651 )
								ret := 0.598566
						if( VIP_VIM > 0.037182 )
							if( VIM <= 0.830698 )
								ret := 0.208743
							if( VIM > 0.830698 )
								ret := -0.057827
					if( smoothK_k > 87.7981 )
						if( k <= 91.219 )
							if( VIM <= 0.89318 )
								ret := -1.000000 // sell
							if( VIM > 0.89318 )
								ret := -0.666667
						if( k > 91.219 )
							ret := 0.666667
				if( smoothD_d > 90.7555 )
					if( rsi1 <= 69.5012 )
						if( VIP_VIM <= 0.032043 )
							if( smoothD_d <= 94.99 )
								ret := 0.532951
							if( smoothD_d > 94.99 )
								ret := -0.078947
						if( VIP_VIM > 0.032043 )
							if( VIM <= 0.880981 )
								ret := -0.121457
							if( VIM > 0.880981 )
								ret := 0.202929
					if( rsi1 > 69.5012 )
						if( VIP_VIM <= 0.505778 )
							if( k <= 95.4108 )
								ret := 0.684536
							if( k > 95.4108 )
								ret := 0.971014 // buy
						if( VIP_VIM > 0.505778 )
							if( d_k <= 3.93617 )
								ret := 0.191919
							if( d_k > 3.93617 )
								ret := 0.535714
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_e5786850(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


