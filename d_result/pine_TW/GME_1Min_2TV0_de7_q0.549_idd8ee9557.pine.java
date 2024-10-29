//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: GME_1Min_2TV0_d8ee9557 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_2TV0_d8ee9557", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_d8ee9557(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 15.9424 )
		if( ema3 <= 13.5745 )
			if( VIP <= 1.22605 )
				if( VIM <= 0.978608 )
					if( ema1 <= 13.6217 )
						if( ema12 <= 0.066474 )
							if( ema13 <= 0.065831 )
								ret := 0.234912
							if( ema13 > 0.065831 )
								ret := 0.728571 // buy
						if( ema12 > 0.066474 )
							ret := -0.923077 // sell
					if( ema1 > 13.6217 )
						ret := -1.000000 // sell
				if( VIM > 0.978608 )
					if( ema13 <= -0.07822 )
						if( ema1 <= 11.3341 )
							if( ema3 <= 10.8651 )
								ret := 0.789474 // buy
							if( ema3 > 10.8651 )
								ret := 1.000000 // buy
						if( ema1 > 11.3341 )
							if( ema3 <= 11.7702 )
								ret := -0.250000
							if( ema3 > 11.7702 )
								ret := 0.600000
					if( ema13 > -0.07822 )
						if( tema <= 13.5179 )
							if( ema1 <= 13.0315 )
								ret := 0.058919
							if( ema1 > 13.0315 )
								ret := 0.500000
						if( tema > 13.5179 )
							if( ema1 <= 13.5223 )
								ret := -0.933333 // sell
							if( ema1 > 13.5223 )
								ret := -0.153846
			if( VIP > 1.22605 )
				if( tema <= 10.198 )
					if( VIP_VIM <= -0.82166 )
						if( ema2 <= 10.1647 )
							ret := 1.000000 // buy
						if( ema2 > 10.1647 )
							if( ema2 <= 10.1704 )
								ret := 0.714286 // buy
							if( ema2 > 10.1704 )
								ret := 0.909091 // buy
					if( VIP_VIM > -0.82166 )
						if( ema1 <= 10.1398 )
							if( tema <= 10.0885 )
								ret := 0.338462
							if( tema > 10.0885 )
								ret := -0.285714
						if( ema1 > 10.1398 )
							if( ema3 <= 10.131 )
								ret := 0.928571 // buy
							if( ema3 > 10.131 )
								ret := 0.333333
				if( tema > 10.198 )
					if( ema13 <= 0.070879 )
						if( tema <= 12.5662 )
							if( tema <= 11.9968 )
								ret := -0.115915
							if( tema > 11.9968 )
								ret := 0.576642
						if( tema > 12.5662 )
							if( ema3 <= 12.5999 )
								ret := -0.911111 // sell
							if( ema3 > 12.5999 )
								ret := -0.173077
					if( ema13 > 0.070879 )
						if( tema <= 12.0326 )
							if( ema1 <= 11.2605 )
								ret := 0.125000
							if( ema1 > 11.2605 )
								ret := 0.544715
						if( tema > 12.0326 )
							if( tema <= 12.1518 )
								ret := -0.846154 // sell
							if( tema > 12.1518 )
								ret := 0.098592
		if( ema3 > 13.5745 )
			if( tema <= 16.0565 )
				if( ema12 <= 0.040768 )
					if( ema2 <= 15.9031 )
						if( tema <= 15.8105 )
							if( ema2 <= 15.6009 )
								ret := 0.168632
							if( ema2 > 15.6009 )
								ret := 0.473846
						if( tema > 15.8105 )
							if( VIP <= 2.06159 )
								ret := -0.252577
							if( VIP > 2.06159 )
								ret := 1.000000 // buy
					if( ema2 > 15.9031 )
						if( VIM <= 0.890409 )
							ret := -0.181818
						if( VIM > 0.890409 )
							if( VIP_VIM <= -0.163048 )
								ret := 0.325000
							if( VIP_VIM > -0.163048 )
								ret := 0.735099 // buy
				if( ema12 > 0.040768 )
					if( tema <= 15.9926 )
						if( VIP <= 1.36428 )
							if( ema12 <= 0.133651 )
								ret := 0.605042
							if( ema12 > 0.133651 )
								ret := 0.909910 // buy
						if( VIP > 1.36428 )
							if( VIP <= 1.38636 )
								ret := -0.750000 // sell
							if( VIP > 1.38636 )
								ret := 0.222222
					if( tema > 15.9926 )
						if( VIP_VIM <= 0.411749 )
							if( ema3 <= 15.8557 )
								ret := 1.000000 // buy
							if( ema3 > 15.8557 )
								ret := 0.857143 // buy
						if( VIP_VIM > 0.411749 )
							if( ema13 <= 0.124904 )
								ret := -0.260870
							if( ema13 > 0.124904 )
								ret := -1.000000 // sell
			if( tema > 16.0565 )
				if( ema13 <= 0.341016 )
					if( ema2 <= 15.9755 )
						if( VIP <= 1.22598 )
							if( ema3 <= 15.8885 )
								ret := -0.444444
							if( ema3 > 15.8885 )
								ret := -1.000000 // sell
						if( VIP > 1.22598 )
							if( tema <= 16.2422 )
								ret := -1.000000 // sell
							if( tema > 16.2422 )
								ret := -0.857143 // sell
					if( ema2 > 15.9755 )
						ret := 0.000000
				if( ema13 > 0.341016 )
					if( VIM <= 0.701644 )
						ret := -1.000000 // sell
					if( VIM > 0.701644 )
						if( ema3 <= 15.6631 )
							ret := 0.857143 // buy
						if( ema3 > 15.6631 )
							ret := 1.000000 // buy
	if( ema3 > 15.9424 )
		if( ema13 <= -0.035358 )
			if( tema <= 50.1856 )
				if( ema2 <= 49.8937 )
					if( VIM <= 0.957941 )
						if( ema13 <= -0.063412 )
							if( VIP_VIM <= 0.015974 )
								ret := 0.095238
							if( VIP_VIM > 0.015974 )
								ret := 0.635417
						if( ema13 > -0.063412 )
							if( ema3 <= 17.8923 )
								ret := -0.875000 // sell
							if( ema3 > 17.8923 )
								ret := 0.216867
					if( VIM > 0.957941 )
						if( VIP <= 0.555122 )
							if( ema13 <= -0.169687 )
								ret := 0.585774
							if( ema13 > -0.169687 )
								ret := 0.054264
						if( VIP > 0.555122 )
							if( ema1 <= 29.2279 )
								ret := 0.096019
							if( ema1 > 29.2279 )
								ret := 0.011414
				if( ema2 > 49.8937 )
					if( tema <= 43.7068 )
						ret := -1.000000 // sell
					if( tema > 43.7068 )
						if( ema13 <= -2.10655 )
							if( VIP <= 0.756798 )
								ret := 0.977778 // buy
							if( VIP > 0.756798 )
								ret := 0.666667
						if( ema13 > -2.10655 )
							if( ema3 <= 50.2212 )
								ret := 0.911111 // buy
							if( ema3 > 50.2212 )
								ret := 0.254237
			if( tema > 50.1856 )
				if( ema2 <= 57.5693 )
					if( ema13 <= -0.095538 )
						if( VIM <= 1.13821 )
							if( VIM <= 0.958541 )
								ret := 0.466667
							if( VIM > 0.958541 )
								ret := -0.602151
						if( VIM > 1.13821 )
							if( tema <= 50.6163 )
								ret := -0.941176 // sell
							if( tema > 50.6163 )
								ret := -0.006452
					if( ema13 > -0.095538 )
						if( tema <= 53.0679 )
							ret := -0.142857
						if( tema > 53.0679 )
							if( ema1 <= 54.6486 )
								ret := 0.821429 // buy
							if( ema1 > 54.6486 )
								ret := 0.000000
				if( ema2 > 57.5693 )
					if( ema1 <= 61.4808 )
						if( ema2 <= 61.382 )
							if( ema2 <= 60.0929 )
								ret := 0.703704 // buy
							if( ema2 > 60.0929 )
								ret := -0.442623
						if( ema2 > 61.382 )
							if( VIM <= 1.222 )
								ret := 0.949153 // buy
							if( VIM > 1.222 )
								ret := -0.333333
					if( ema1 > 61.4808 )
						if( ema13 <= -0.65761 )
							if( ema13 <= -3.74741 )
								ret := -0.428571
							if( ema13 > -3.74741 )
								ret := -0.954545 // sell
						if( ema13 > -0.65761 )
							if( VIP <= 0.825125 )
								ret := -1.000000 // sell
							if( VIP > 0.825125 )
								ret := 0.194030
		if( ema13 > -0.035358 )
			if( ema2 <= 62.1039 )
				if( ema2 <= 42.8327 )
					if( ema13 <= 0.511549 )
						if( ema3 <= 16.2539 )
							if( tema <= 16.4539 )
								ret := -0.209443
							if( tema > 16.4539 )
								ret := 0.850000 // buy
						if( ema3 > 16.2539 )
							if( ema1 <= 16.4547 )
								ret := 0.581560
							if( ema1 > 16.4547 )
								ret := 0.021850
					if( ema13 > 0.511549 )
						if( ema1 <= 34.0979 )
							if( tema <= 31.2716 )
								ret := -0.158358
							if( tema > 31.2716 )
								ret := -0.676329
						if( ema1 > 34.0979 )
							if( ema3 <= 35.446 )
								ret := 0.500000
							if( ema3 > 35.446 )
								ret := -0.176015
				if( ema2 > 42.8327 )
					if( ema2 <= 43.3091 )
						if( VIM <= 0.774963 )
							ret := 0.000000
						if( VIM > 0.774963 )
							if( ema2 <= 42.8695 )
								ret := 0.285714
							if( ema2 > 42.8695 )
								ret := 0.950617 // buy
					if( ema2 > 43.3091 )
						if( tema <= 63.0452 )
							if( tema <= 62.3355 )
								ret := 0.168724
							if( tema > 62.3355 )
								ret := -0.687500
						if( tema > 63.0452 )
							if( VIM <= 0.6837 )
								ret := 0.714286 // buy
							if( VIM > 0.6837 )
								ret := 1.000000 // buy
			if( ema2 > 62.1039 )
				if( ema3 <= 63.8047 )
					if( VIP_VIM <= 0.13199 )
						if( VIP_VIM <= 0.006565 )
							if( ema2 <= 62.6277 )
								ret := -1.000000 // sell
							if( ema2 > 62.6277 )
								ret := -0.857143 // sell
						if( VIP_VIM > 0.006565 )
							if( tema <= 62.4243 )
								ret := 0.000000
							if( tema > 62.4243 )
								ret := 0.714286 // buy
					if( VIP_VIM > 0.13199 )
						if( ema3 <= 61.2393 )
							ret := -0.857143 // sell
						if( ema3 > 61.2393 )
							ret := -1.000000 // sell
				if( ema3 > 63.8047 )
					if( ema1 <= 67.701 )
						if( ema3 <= 64.7453 )
							ret := 0.714286 // buy
						if( ema3 > 64.7453 )
							ret := 1.000000 // buy
					if( ema1 > 67.701 )
						if( ema13 <= 2.73166 )
							if( ema1 <= 68.1781 )
								ret := 0.000000
							if( ema1 > 68.1781 )
								ret := -0.900000 // sell
						if( ema13 > 2.73166 )
							if( ema12 <= 1.13229 )
								ret := 1.000000 // buy
							if( ema12 > 1.13229 )
								ret := -0.818182 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3



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
float op_operation = decision_tree_0_GME_1Min_d8ee9557(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


