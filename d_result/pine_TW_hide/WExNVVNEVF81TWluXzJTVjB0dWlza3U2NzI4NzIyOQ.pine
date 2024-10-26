//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: XLMUSDT_5Min_2SV0_67287229 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_5Min_2SV0_67287229", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_5Min_67287229(smoothK_k, d_k, k, smoothD_d, rsi1, d, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( d_k <= -1.40725 )
		if( d_k <= -8.82749 )
			if( rsi1 <= 55.5639 )
				if( VIP <= 0.906244 )
					if( rsi1 <= 44.4478 )
						if( VIP <= 0.799337 )
							if( rsi1 <= 33.338 )
								ret := 0.163596
							if( rsi1 > 33.338 )
								ret := 0.600239
						if( VIP > 0.799337 )
							if( rsi1 <= 40.9574 )
								ret := -0.042110
							if( rsi1 > 40.9574 )
								ret := 0.261985
					if( rsi1 > 44.4478 )
						if( VIP <= 0.86106 )
							if( VIP_VIM <= -0.280064 )
								ret := 0.757563 // buy
							if( VIP_VIM > -0.280064 )
								ret := 0.591054
						if( VIP > 0.86106 )
							if( rsi1 <= 47.0694 )
								ret := 0.331418
							if( rsi1 > 47.0694 )
								ret := 0.608640
				if( VIP > 0.906244 )
					if( rsi1 <= 47.1846 )
						if( VIP_VIM <= -0.124676 )
							if( k <= 49.0253 )
								ret := 0.092348
							if( k > 49.0253 )
								ret := -0.080000
						if( VIP_VIM > -0.124676 )
							if( VIP_VIM <= -0.123013 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.123013 )
								ret := -0.211800
					if( rsi1 > 47.1846 )
						if( VIP_VIM <= -0.080028 )
							if( rsi1 <= 52.9509 )
								ret := 0.270036
							if( rsi1 > 52.9509 )
								ret := 0.477519
						if( VIP_VIM > -0.080028 )
							if( rsi1 <= 53.7267 )
								ret := -0.079277
							if( rsi1 > 53.7267 )
								ret := 0.159912
			if( rsi1 > 55.5639 )
				if( VIM <= 1.00001 )
					if( rsi1 <= 66.6694 )
						if( VIP_VIM <= 0.090831 )
							if( rsi1 <= 60.0007 )
								ret := 0.297040
							if( rsi1 > 60.0007 )
								ret := 0.549533
						if( VIP_VIM > 0.090831 )
							if( rsi1 <= 60.4404 )
								ret := -0.050407
							if( rsi1 > 60.4404 )
								ret := 0.277647
					if( rsi1 > 66.6694 )
						if( VIP <= 1.1132 )
							if( VIM <= 0.999945 )
								ret := 0.752990 // buy
							if( VIM > 0.999945 )
								ret := 0.458599
						if( VIP > 1.1132 )
							if( rsi1 <= 75.0208 )
								ret := 0.216063
							if( rsi1 > 75.0208 )
								ret := 0.657698
				if( VIM > 1.00001 )
					if( VIP <= 0.99995 )
						if( VIM <= 1.01747 )
							if( VIP_VIM <= -0.01295 )
								ret := 0.962264 // buy
							if( VIP_VIM > -0.01295 )
								ret := 0.684211
						if( VIM > 1.01747 )
							if( VIP <= 0.984771 )
								ret := 0.743098 // buy
							if( VIP > 0.984771 )
								ret := 0.924812 // buy
					if( VIP > 0.99995 )
						if( VIM <= 1.02083 )
							if( VIP <= 1.08956 )
								ret := 0.809955 // buy
							if( VIP > 1.08956 )
								ret := 0.250000
						if( VIM > 1.02083 )
							if( VIP <= 1.00005 )
								ret := 0.322957
							if( VIP > 1.00005 )
								ret := 0.624402
		if( d_k > -8.82749 )
			if( rsi1 <= 46.7021 )
				if( rsi1 <= 33.5022 )
					if( VIP_VIM <= -0.332996 )
						if( rsi1 <= 23.1491 )
							if( VIP_VIM <= -0.640536 )
								ret := -0.165854
							if( VIP_VIM > -0.640536 )
								ret := -0.417857
						if( rsi1 > 23.1491 )
							if( VIP_VIM <= -0.488657 )
								ret := 0.176718
							if( VIP_VIM > -0.488657 )
								ret := -0.087293
					if( VIP_VIM > -0.332996 )
						if( rsi1 <= 33.3291 )
							if( VIP <= 0.875054 )
								ret := -0.452138
							if( VIP > 0.875054 )
								ret := -0.608491
						if( rsi1 > 33.3291 )
							if( k <= 15.3932 )
								ret := -0.447581
							if( k > 15.3932 )
								ret := -0.037190
				if( rsi1 > 33.5022 )
					if( VIP <= 0.859118 )
						if( rsi1 <= 40.0025 )
							if( VIP <= 0.760707 )
								ret := 0.624352
							if( VIP > 0.760707 )
								ret := 0.186011
						if( rsi1 > 40.0025 )
							if( VIP_VIM <= -0.326593 )
								ret := 0.676732
							if( VIP_VIM > -0.326593 )
								ret := 0.484171
					if( VIP > 0.859118 )
						if( VIP <= 0.954564 )
							if( rsi1 <= 40.5941 )
								ret := -0.155409
							if( rsi1 > 40.5941 )
								ret := 0.151448
						if( VIP > 0.954564 )
							if( VIM <= 0.999996 )
								ret := -0.463659
							if( VIM > 0.999996 )
								ret := -0.200305
			if( rsi1 > 46.7021 )
				if( rsi1 <= 63.6406 )
					if( VIM <= 1.00001 )
						if( rsi1 <= 55.8524 )
							if( VIM <= 0.928555 )
								ret := -0.341719
							if( VIM > 0.928555 )
								ret := 0.027938
						if( rsi1 > 55.8524 )
							if( VIP <= 1.09573 )
								ret := 0.291569
							if( VIP > 1.09573 )
								ret := -0.002292
					if( VIM > 1.00001 )
						if( VIM <= 1.06671 )
							if( rsi1 <= 50.0937 )
								ret := 0.197358
							if( rsi1 > 50.0937 )
								ret := 0.481744
						if( VIM > 1.06671 )
							if( VIP <= 0.958313 )
								ret := 0.616240
							if( VIP > 0.958313 )
								ret := 0.368812
				if( rsi1 > 63.6406 )
					if( VIM <= 0.857287 )
						if( k <= 96.3644 )
							if( rsi1 <= 77.8078 )
								ret := 0.202351
							if( rsi1 > 77.8078 )
								ret := 0.604610
						if( k > 96.3644 )
							if( rsi1 <= 80.0424 )
								ret := 0.273115
							if( rsi1 > 80.0424 )
								ret := 0.611807
					if( VIM > 0.857287 )
						if( VIM <= 1.00005 )
							if( rsi1 <= 70.0168 )
								ret := 0.468496
							if( rsi1 > 70.0168 )
								ret := 0.635092
						if( VIM > 1.00005 )
							if( smoothD_d <= 17.7398 )
								ret := 0.000000
							if( smoothD_d > 17.7398 )
								ret := 0.770465 // buy
	if( d_k > -1.40725 )
		if( rsi1 <= 52.0916 )
			if( VIP <= 1.00019 )
				if( rsi1 <= 36.3534 )
					if( VIP_VIM <= -0.221934 )
						if( rsi1 <= 29.8425 )
							if( VIP_VIM <= -0.483381 )
								ret := -0.204698
							if( VIP_VIM > -0.483381 )
								ret := -0.519206
						if( rsi1 > 29.8425 )
							if( VIP_VIM <= -0.331755 )
								ret := 0.019231
							if( VIP_VIM > -0.331755 )
								ret := -0.185854
					if( VIP_VIM > -0.221934 )
						if( rsi1 <= 33.1455 )
							if( VIP <= 0.999985 )
								ret := -0.710997 // sell
							if( VIP > 0.999985 )
								ret := -0.508039
						if( rsi1 > 33.1455 )
							if( VIP <= 0.926908 )
								ret := -0.316571
							if( VIP > 0.926908 )
								ret := -0.512946
				if( rsi1 > 36.3534 )
					if( rsi1 <= 44.4487 )
						if( VIP_VIM <= -0.149399 )
							if( VIP_VIM <= -0.308852 )
								ret := 0.310744
							if( VIP_VIM > -0.308852 )
								ret := 0.056247
						if( VIP_VIM > -0.149399 )
							if( rsi1 <= 39.9995 )
								ret := -0.399103
							if( rsi1 > 39.9995 )
								ret := -0.149586
					if( rsi1 > 44.4487 )
						if( VIP <= 0.999085 )
							if( VIP <= 0.908905 )
								ret := 0.428346
							if( VIP > 0.908905 )
								ret := 0.168831
						if( VIP > 0.999085 )
							if( rsi1 <= 46.2202 )
								ret := -0.177500
							if( rsi1 > 46.2202 )
								ret := 0.007686
			if( VIP > 1.00019 )
				if( VIP_VIM <= 0.166686 )
					if( rsi1 <= 44.3339 )
						if( rsi1 <= 39.8951 )
							if( VIM <= 1.06307 )
								ret := -0.758662 // sell
							if( VIM > 1.06307 )
								ret := -0.471429
						if( rsi1 > 39.8951 )
							if( VIM <= 0.999737 )
								ret := -0.619475
							if( VIM > 0.999737 )
								ret := -0.340629
					if( rsi1 > 44.3339 )
						if( VIM <= 0.999743 )
							if( VIM <= 0.944443 )
								ret := -0.373005
							if( VIM > 0.944443 )
								ret := -0.240191
						if( VIM > 0.999743 )
							if( VIM <= 1.02592 )
								ret := -0.081652
							if( VIM > 1.02592 )
								ret := 0.112339
				if( VIP_VIM > 0.166686 )
					if( rsi1 <= 45.4496 )
						if( rsi1 <= 44.5416 )
							if( VIP <= 1.12124 )
								ret := -0.683010
							if( VIP > 1.12124 )
								ret := -0.775961 // sell
						if( rsi1 > 44.5416 )
							if( VIM <= 0.919872 )
								ret := -0.951049 // sell
							if( VIM > 0.919872 )
								ret := -0.789474 // sell
					if( rsi1 > 45.4496 )
						if( VIP_VIM <= 0.334522 )
							if( rsi1 <= 49.9973 )
								ret := -0.568627
							if( rsi1 > 49.9973 )
								ret := -0.412264
						if( VIP_VIM > 0.334522 )
							if( rsi1 <= 50.156 )
								ret := -0.658120
							if( rsi1 > 50.156 )
								ret := -0.866197 // sell
		if( rsi1 > 52.0916 )
			if( k <= 94.3464 )
				if( d_k <= 6.27604 )
					if( rsi1 <= 70.5967 )
						if( VIP_VIM <= 0.225676 )
							if( rsi1 <= 60.0298 )
								ret := 0.150798
							if( rsi1 > 60.0298 )
								ret := 0.448884
						if( VIP_VIM > 0.225676 )
							if( rsi1 <= 58.32 )
								ret := -0.345455
							if( rsi1 > 58.32 )
								ret := 0.012568
					if( rsi1 > 70.5967 )
						if( d <= 94.2198 )
							if( VIM <= 0.793355 )
								ret := 0.312793
							if( VIM > 0.793355 )
								ret := 0.504107
						if( d > 94.2198 )
							if( VIM <= 0.55314 )
								ret := -0.608696
							if( VIM > 0.55314 )
								ret := 0.160247
				if( d_k > 6.27604 )
					if( VIP_VIM <= 0.345335 )
						if( VIP_VIM <= 0.173722 )
							if( rsi1 <= 57.1954 )
								ret := 0.126793
							if( rsi1 > 57.1954 )
								ret := 0.327974
						if( VIP_VIM > 0.173722 )
							if( rsi1 <= 58.1407 )
								ret := -0.237370
							if( rsi1 > 58.1407 )
								ret := 0.180190
					if( VIP_VIM > 0.345335 )
						if( rsi1 <= 63.567 )
							if( VIM <= 0.777583 )
								ret := -0.631897
							if( VIM > 0.777583 )
								ret := -0.372703
						if( rsi1 > 63.567 )
							if( d <= 86.7002 )
								ret := 0.023856
							if( d > 86.7002 )
								ret := -0.273070
			if( k > 94.3464 )
				if( rsi1 <= 76.9042 )
					if( VIM <= 0.885915 )
						if( d <= 97.2552 )
							if( rsi1 <= 72.7929 )
								ret := -0.156667
							if( rsi1 > 72.7929 )
								ret := 0.278261
						if( d > 97.2552 )
							if( smoothD_d <= 95.2048 )
								ret := 0.393103
							if( smoothD_d > 95.2048 )
								ret := 0.134472
					if( VIM > 0.885915 )
						if( rsi1 <= 60.447 )
							if( VIM <= 1.00062 )
								ret := 0.041074
							if( VIM > 1.00062 )
								ret := 0.440454
						if( rsi1 > 60.447 )
							if( VIP_VIM <= 0.090864 )
								ret := 0.655682
							if( VIP_VIM > 0.090864 )
								ret := 0.447691
				if( rsi1 > 76.9042 )
					if( VIP_VIM <= 0.711943 )
						if( rsi1 <= 84.2276 )
							if( VIP <= 1.15615 )
								ret := 0.670616
							if( VIP > 1.15615 )
								ret := 0.404520
						if( rsi1 > 84.2276 )
							if( d <= 99.3837 )
								ret := 0.563910
							if( d > 99.3837 )
								ret := 0.714808 // buy
					if( VIP_VIM > 0.711943 )
						if( VIP_VIM <= 0.970588 )
							if( rsi1 <= 92.2234 )
								ret := 0.321267
							if( rsi1 > 92.2234 )
								ret := 0.015873
						if( VIP_VIM > 0.970588 )
							if( smoothD_d <= 96.7537 )
								ret := -0.428571
							if( smoothD_d > 96.7537 )
								ret := -0.933333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_XLMUSDT_5Min_67287229(smoothK_k, d_k, k, smoothD_d, rsi1, d, VIP_VIM, VIP, VIM)

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


