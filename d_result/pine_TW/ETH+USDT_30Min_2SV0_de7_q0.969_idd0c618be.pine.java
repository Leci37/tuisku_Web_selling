//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: ETHUSDT_30Min_2SV0_d0c618be Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_2SV0_d0c618be", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_d0c618be(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 56.0815 )
		if( d_k <= -3.00963 )
			if( smoothD_d <= 6.87406 )
				if( rsi1 <= 29.7342 )
					if( VIP <= 0.828993 )
						if( rsi1 <= 22.438 )
							if( VIP_VIM <= -0.614705 )
								ret := -0.449612
							if( VIP_VIM > -0.614705 )
								ret := -0.797101 // sell
						if( rsi1 > 22.438 )
							if( VIP_VIM <= -0.443609 )
								ret := 0.075377
							if( VIP_VIM > -0.443609 )
								ret := -0.409091
					if( VIP > 0.828993 )
						if( d <= 2.66839 )
							if( d_k <= -3.69702 )
								ret := -1.000000 // sell
							if( d_k > -3.69702 )
								ret := -0.888889 // sell
						if( d > 2.66839 )
							if( d <= 5.06127 )
								ret := -0.541667
							if( d > 5.06127 )
								ret := -0.806452 // sell
				if( rsi1 > 29.7342 )
					if( VIP <= 0.969136 )
						if( rsi1 <= 36.2288 )
							if( VIP <= 0.818945 )
								ret := 0.155660
							if( VIP > 0.818945 )
								ret := -0.437722
						if( rsi1 > 36.2288 )
							if( rsi1 <= 47.2684 )
								ret := 0.061261
							if( rsi1 > 47.2684 )
								ret := 0.435185
					if( VIP > 0.969136 )
						if( rsi1 <= 48.4611 )
							if( VIM <= 1.01688 )
								ret := -0.528678
							if( VIM > 1.01688 )
								ret := -0.221311
						if( rsi1 > 48.4611 )
							if( rsi1 <= 55.1832 )
								ret := -0.074349
							if( rsi1 > 55.1832 )
								ret := 0.575000
			if( smoothD_d > 6.87406 )
				if( VIP_VIM <= -0.114952 )
					if( rsi1 <= 40.7612 )
						if( VIP <= 0.791252 )
							if( rsi1 <= 24.1955 )
								ret := -0.130802
							if( rsi1 > 24.1955 )
								ret := 0.313990
						if( VIP > 0.791252 )
							if( rsi1 <= 33.6802 )
								ret := -0.323611
							if( rsi1 > 33.6802 )
								ret := 0.040956
					if( rsi1 > 40.7612 )
						if( VIP_VIM <= -0.181948 )
							if( VIP <= 0.83912 )
								ret := 0.569897
							if( VIP > 0.83912 )
								ret := 0.406203
						if( VIP_VIM > -0.181948 )
							if( rsi1 <= 45.6217 )
								ret := 0.012220
							if( rsi1 > 45.6217 )
								ret := 0.359184
				if( VIP_VIM > -0.114952 )
					if( rsi1 <= 47.8716 )
						if( k <= 56.4957 )
							if( rsi1 <= 42.2288 )
								ret := -0.575758
							if( rsi1 > 42.2288 )
								ret := -0.277049
						if( k > 56.4957 )
							if( d_k <= -3.15593 )
								ret := -0.152941
							if( d_k > -3.15593 )
								ret := 0.857143 // buy
					if( rsi1 > 47.8716 )
						if( VIM <= 0.978581 )
							if( VIP <= 1.00438 )
								ret := 0.164062
							if( VIP > 1.00438 )
								ret := -0.216867
						if( VIM > 0.978581 )
							if( d_k <= -14.751 )
								ret := -0.129630
							if( d_k > -14.751 )
								ret := 0.260076
		if( d_k > -3.00963 )
			if( rsi1 <= 32.4197 )
				if( VIP_VIM <= -0.269777 )
					if( rsi1 <= 22.662 )
						if( VIP_VIM <= -0.471584 )
							if( rsi1 <= 14.1469 )
								ret := -0.769585 // sell
							if( rsi1 > 14.1469 )
								ret := -0.371148
						if( VIP_VIM > -0.471584 )
							if( rsi1 <= 15.3771 )
								ret := -0.935780 // sell
							if( rsi1 > 15.3771 )
								ret := -0.766707 // sell
					if( rsi1 > 22.662 )
						if( k <= 69.122 )
							if( VIM <= 1.16006 )
								ret := -0.366667
							if( VIM > 1.16006 )
								ret := -0.136329
						if( k > 69.122 )
							if( VIP <= 0.692069 )
								ret := 0.444444
							if( VIP > 0.692069 )
								ret := -0.765957 // sell
				if( VIP_VIM > -0.269777 )
					if( rsi1 <= 23.806 )
						if( smoothK_k <= -0.334838 )
							if( VIM <= 1.14119 )
								ret := -0.873487 // sell
							if( VIM > 1.14119 )
								ret := -0.428571
						if( smoothK_k > -0.334838 )
							if( rsi1 <= 19.7528 )
								ret := -0.849650 // sell
							if( rsi1 > 19.7528 )
								ret := -0.706667 // sell
					if( rsi1 > 23.806 )
						if( d_k <= 5.18812 )
							if( smoothD_d <= 3.55866 )
								ret := -0.620599
							if( smoothD_d > 3.55866 )
								ret := -0.451411
						if( d_k > 5.18812 )
							if( VIM <= 1.06047 )
								ret := -0.783666 // sell
							if( VIM > 1.06047 )
								ret := -0.632302
			if( rsi1 > 32.4197 )
				if( VIP_VIM <= 0.061968 )
					if( rsi1 <= 43.7007 )
						if( VIP_VIM <= -0.104513 )
							if( VIP_VIM <= -0.267253 )
								ret := 0.120640
							if( VIP_VIM > -0.267253 )
								ret := -0.133628
						if( VIP_VIM > -0.104513 )
							if( rsi1 <= 38.6547 )
								ret := -0.525873
							if( rsi1 > 38.6547 )
								ret := -0.324395
					if( rsi1 > 43.7007 )
						if( VIM <= 1.07128 )
							if( smoothK_k <= 81.5958 )
								ret := 0.088350
							if( smoothK_k > 81.5958 )
								ret := -0.178988
						if( VIM > 1.07128 )
							if( VIP <= 0.928294 )
								ret := 0.340587
							if( VIP > 0.928294 )
								ret := 0.101887
				if( VIP_VIM > 0.061968 )
					if( rsi1 <= 48.4492 )
						if( VIM <= 0.967115 )
							if( rsi1 <= 40.9182 )
								ret := -0.622970
							if( rsi1 > 40.9182 )
								ret := -0.473255
						if( VIM > 0.967115 )
							if( rsi1 <= 45.1757 )
								ret := -0.409502
							if( rsi1 > 45.1757 )
								ret := -0.051136
					if( rsi1 > 48.4492 )
						if( VIP_VIM <= 0.204434 )
							if( smoothD_d <= 4.7223 )
								ret := 0.208955
							if( smoothD_d > 4.7223 )
								ret := -0.111961
						if( VIP_VIM > 0.204434 )
							if( d <= 28.2034 )
								ret := -0.228677
							if( d > 28.2034 )
								ret := -0.459429
	if( rsi1 > 56.0815 )
		if( smoothK_k <= 85.8165 )
			if( VIP_VIM <= 0.114343 )
				if( d_k <= -10.491 )
					if( VIP <= 0.995966 )
						if( rsi1 <= 66.713 )
							if( VIP_VIM <= 0.040842 )
								ret := 0.659389
							if( VIP_VIM > 0.040842 )
								ret := 0.000000
						if( rsi1 > 66.713 )
							if( VIP <= 0.934152 )
								ret := 0.709302 // buy
							if( VIP > 0.934152 )
								ret := 0.876923 // buy
					if( VIP > 0.995966 )
						if( rsi1 <= 63.3008 )
							if( d_k <= -15.0866 )
								ret := 0.174359
							if( d_k > -15.0866 )
								ret := 0.480000
						if( rsi1 > 63.3008 )
							if( VIM <= 1.08866 )
								ret := 0.719921 // buy
							if( VIM > 1.08866 )
								ret := 0.000000
				if( d_k > -10.491 )
					if( rsi1 <= 58.5769 )
						if( k <= 64.2332 )
							if( smoothK_k <= 31.7894 )
								ret := 0.314136
							if( smoothK_k > 31.7894 )
								ret := 0.544643
						if( k > 64.2332 )
							if( VIM <= 0.95624 )
								ret := -0.174603
							if( VIM > 0.95624 )
								ret := 0.303571
					if( rsi1 > 58.5769 )
						if( d_k <= 5.58395 )
							if( d <= 23.457 )
								ret := 0.668639
							if( d > 23.457 )
								ret := 0.444792
						if( d_k > 5.58395 )
							if( d_k <= 5.79277 )
								ret := 0.960000 // buy
							if( d_k > 5.79277 )
								ret := 0.586667
			if( VIP_VIM > 0.114343 )
				if( d_k <= -0.048755 )
					if( rsi1 <= 65.331 )
						if( rsi1 <= 57.4157 )
							if( smoothK_k <= 40.3688 )
								ret := -0.435185
							if( smoothK_k > 40.3688 )
								ret := -0.086022
						if( rsi1 > 57.4157 )
							if( VIP_VIM <= 0.287083 )
								ret := 0.272222
							if( VIP_VIM > 0.287083 )
								ret := 0.016997
					if( rsi1 > 65.331 )
						if( VIP_VIM <= 0.499319 )
							if( VIP_VIM <= 0.260295 )
								ret := 0.592959
							if( VIP_VIM > 0.260295 )
								ret := 0.442895
						if( VIP_VIM > 0.499319 )
							if( d <= 0.651676 )
								ret := 1.000000 // buy
							if( d > 0.651676 )
								ret := 0.145695
				if( d_k > -0.048755 )
					if( rsi1 <= 67.7884 )
						if( VIM <= 0.797039 )
							if( d_k <= 8.09813 )
								ret := -0.155598
							if( d_k > 8.09813 )
								ret := -0.371406
						if( VIM > 0.797039 )
							if( rsi1 <= 60.2873 )
								ret := -0.095035
							if( rsi1 > 60.2873 )
								ret := 0.158654
					if( rsi1 > 67.7884 )
						if( VIP <= 1.21274 )
							if( d_k <= 5.41531 )
								ret := 0.378378
							if( d_k > 5.41531 )
								ret := 0.621827
						if( VIP > 1.21274 )
							if( rsi1 <= 75.5995 )
								ret := -0.053127
							if( rsi1 > 75.5995 )
								ret := 0.317199
		if( smoothK_k > 85.8165 )
			if( rsi1 <= 71.4878 )
				if( VIP <= 1.09004 )
					if( rsi1 <= 63.2319 )
						if( VIP <= 0.969481 )
							if( smoothK_k <= 94.3565 )
								ret := 0.454392
							if( smoothK_k > 94.3565 )
								ret := 0.659483
						if( VIP > 0.969481 )
							if( rsi1 <= 59.0467 )
								ret := 0.190909
							if( rsi1 > 59.0467 )
								ret := 0.352697
					if( rsi1 > 63.2319 )
						if( d_k <= -9.39786 )
							if( VIM <= 1.13057 )
								ret := 0.761029 // buy
							if( VIM > 1.13057 )
								ret := 0.464286
						if( d_k > -9.39786 )
							if( k <= 94.9376 )
								ret := 0.439502
							if( k > 94.9376 )
								ret := 0.599099
				if( VIP > 1.09004 )
					if( rsi1 <= 63.0656 )
						if( VIP_VIM <= 0.195906 )
							if( rsi1 <= 59.5802 )
								ret := -0.033898
							if( rsi1 > 59.5802 )
								ret := 0.356164
						if( VIP_VIM > 0.195906 )
							if( d <= 97.3625 )
								ret := -0.288770
							if( d > 97.3625 )
								ret := 0.441860
					if( rsi1 > 63.0656 )
						if( VIP_VIM <= 0.340901 )
							if( d <= 81.9401 )
								ret := 0.730769 // buy
							if( d > 81.9401 )
								ret := 0.352201
						if( VIP_VIM > 0.340901 )
							if( smoothK_k <= 96.3675 )
								ret := 0.140065
							if( smoothK_k > 96.3675 )
								ret := -0.647059
			if( rsi1 > 71.4878 )
				if( VIP_VIM <= 0.435732 )
					if( rsi1 <= 81.0818 )
						if( VIP_VIM <= 0.377596 )
							if( d_k <= -10.9292 )
								ret := 0.835955 // buy
							if( d_k > -10.9292 )
								ret := 0.686126
						if( VIP_VIM > 0.377596 )
							if( rsi1 <= 72.925 )
								ret := 0.068182
							if( rsi1 > 72.925 )
								ret := 0.583333
					if( rsi1 > 81.0818 )
						if( rsi1 <= 84.397 )
							if( d <= 99.4096 )
								ret := 0.837398 // buy
							if( d > 99.4096 )
								ret := 0.712644 // buy
						if( rsi1 > 84.397 )
							if( k <= 99.6225 )
								ret := 0.849498 // buy
							if( k > 99.6225 )
								ret := 0.928726 // buy
				if( VIP_VIM > 0.435732 )
					if( rsi1 <= 81.1048 )
						if( d_k <= -13.7872 )
							if( VIP <= 1.23399 )
								ret := -0.571429
							if( VIP > 1.23399 )
								ret := -0.950000 // sell
						if( d_k > -13.7872 )
							if( k <= 97.3296 )
								ret := 0.277992
							if( k > 97.3296 )
								ret := 0.000000
					if( rsi1 > 81.1048 )
						if( VIP <= 1.25358 )
							if( rsi1 <= 87.2033 )
								ret := 0.746324 // buy
							if( rsi1 > 87.2033 )
								ret := 0.944785 // buy
						if( VIP > 1.25358 )
							if( rsi1 <= 88.1207 )
								ret := 0.337209
							if( rsi1 > 88.1207 )
								ret := 0.699140
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_d0c618be(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


