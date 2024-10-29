//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: DOTUSDT_30Min_2TV0_7a58eac2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2TV0_7a58eac2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_7a58eac2(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.040023 )
		if( ema2 <= 6.91113 )
			if( ema1 <= 5.10145 )
				if( ema2 <= 4.17254 )
					if( ema1 <= 4.02141 )
						if( ema1 <= 3.94797 )
							if( ema3 <= 3.98724 )
								ret := 0.392857
							if( ema3 > 3.98724 )
								ret := 0.878788 // buy
						if( ema1 > 3.94797 )
							if( VIP_VIM <= -0.219494 )
								ret := 0.400000
							if( VIP_VIM > -0.219494 )
								ret := -0.625000
					if( ema1 > 4.02141 )
						if( ema1 <= 4.06925 )
							if( tema <= 3.99295 )
								ret := 1.000000 // buy
							if( tema > 3.99295 )
								ret := 0.714286 // buy
						if( ema1 > 4.06925 )
							if( ema3 <= 4.2082 )
								ret := 0.000000
							if( ema3 > 4.2082 )
								ret := 0.857143 // buy
				if( ema2 > 4.17254 )
					if( ema3 <= 4.69574 )
						if( VIP_VIM <= -0.582892 )
							if( ema13 <= -0.091272 )
								ret := -0.620253
							if( ema13 > -0.091272 )
								ret := 0.034483
						if( VIP_VIM > -0.582892 )
							if( tema <= 4.39741 )
								ret := 0.132979
							if( tema > 4.39741 )
								ret := -0.476923
					if( ema3 > 4.69574 )
						if( tema <= 4.61488 )
							if( VIM <= 1.13696 )
								ret := -0.272727
							if( VIM > 1.13696 )
								ret := 0.720430 // buy
						if( tema > 4.61488 )
							if( ema13 <= -0.231924 )
								ret := 0.904762 // buy
							if( ema13 > -0.231924 )
								ret := -0.133005
			if( ema1 > 5.10145 )
				if( ema12 <= -0.052665 )
					if( ema2 <= 5.38211 )
						if( VIM <= 1.29267 )
							if( tema <= 5.02027 )
								ret := -0.285714
							if( tema > 5.02027 )
								ret := 0.846154 // buy
						if( VIM > 1.29267 )
							if( ema12 <= -0.083349 )
								ret := 0.750000 // buy
							if( ema12 > -0.083349 )
								ret := -0.111111
					if( ema2 > 5.38211 )
						if( ema2 <= 6.52248 )
							if( tema <= 6.22092 )
								ret := 0.334004
							if( tema > 6.22092 )
								ret := -0.072464
						if( ema2 > 6.52248 )
							if( VIM <= 1.25414 )
								ret := 0.697917
							if( VIM > 1.25414 )
								ret := 0.300000
				if( ema12 > -0.052665 )
					if( VIM <= 1.21608 )
						if( ema2 <= 5.2561 )
							if( ema1 <= 5.17094 )
								ret := 0.666667
							if( ema1 > 5.17094 )
								ret := 0.928571 // buy
						if( ema2 > 5.2561 )
							if( VIP_VIM <= -0.47306 )
								ret := -0.200000
							if( VIP_VIM > -0.47306 )
								ret := 0.291111
					if( VIM > 1.21608 )
						if( VIP <= 0.763803 )
							if( tema <= 5.29869 )
								ret := 0.458333
							if( tema > 5.29869 )
								ret := -0.115942
						if( VIP > 0.763803 )
							if( ema2 <= 6.55725 )
								ret := -0.678571
							if( ema2 > 6.55725 )
								ret := -0.100000
		if( ema2 > 6.91113 )
			if( ema1 <= 41.355 )
				if( ema12 <= -0.213135 )
					if( VIM <= 1.19276 )
						if( ema1 <= 33.247 )
							if( ema3 <= 32.4568 )
								ret := 0.324455
							if( ema3 > 32.4568 )
								ret := 0.668790
						if( ema1 > 33.247 )
							if( tema <= 33.3252 )
								ret := -0.471429
							if( tema > 33.3252 )
								ret := 0.218029
					if( VIM > 1.19276 )
						if( tema <= 11.1563 )
							if( ema13 <= -0.37738 )
								ret := 0.767442 // buy
							if( ema13 > -0.37738 )
								ret := 0.250000
						if( tema > 11.1563 )
							if( ema3 <= 36.1557 )
								ret := 0.013233
							if( ema3 > 36.1557 )
								ret := 0.497537
				if( ema12 > -0.213135 )
					if( VIP <= 1.00176 )
						if( ema2 <= 34.6661 )
							if( ema2 <= 32.3996 )
								ret := 0.047833
							if( ema2 > 32.3996 )
								ret := 0.368812
						if( ema2 > 34.6661 )
							if( ema12 <= -0.149289 )
								ret := 0.169863
							if( ema12 > -0.149289 )
								ret := -0.269171
					if( VIP > 1.00176 )
						if( ema2 <= 9.43707 )
							if( VIP <= 1.02554 )
								ret := 0.000000
							if( VIP > 1.02554 )
								ret := 0.791667 // buy
						if( ema2 > 9.43707 )
							if( VIP_VIM <= 0.118598 )
								ret := 0.238356
							if( VIP_VIM > 0.118598 )
								ret := -0.253521
			if( ema1 > 41.355 )
				if( ema3 <= 46.5718 )
					if( ema1 <= 41.5245 )
						if( VIP <= 0.860768 )
							if( VIM <= 1.21217 )
								ret := -0.785714 // sell
							if( VIM > 1.21217 )
								ret := -1.000000 // sell
						if( VIP > 0.860768 )
							if( ema12 <= -0.164296 )
								ret := 0.000000
							if( ema12 > -0.164296 )
								ret := -0.888889 // sell
					if( ema1 > 41.5245 )
						if( ema3 <= 42.7248 )
							if( ema2 <= 42.6145 )
								ret := 0.016393
							if( ema2 > 42.6145 )
								ret := 1.000000 // buy
						if( ema3 > 42.7248 )
							if( ema1 <= 41.85 )
								ret := 1.000000 // buy
							if( ema1 > 41.85 )
								ret := -0.263866
				if( ema3 > 46.5718 )
					if( ema3 <= 51.0447 )
						if( tema <= 48.1273 )
							if( ema1 <= 46.7632 )
								ret := 0.707692 // buy
							if( ema1 > 46.7632 )
								ret := -0.306452
						if( tema > 48.1273 )
							if( VIP <= 0.783659 )
								ret := 0.000000
							if( VIP > 0.783659 )
								ret := 0.802817 // buy
					if( ema3 > 51.0447 )
						if( ema3 <= 52.9881 )
							if( VIP_VIM <= -0.174105 )
								ret := -0.184211
							if( VIP_VIM > -0.174105 )
								ret := -0.750000 // sell
						if( ema3 > 52.9881 )
							if( ema3 <= 53.0911 )
								ret := 0.533333
							if( ema3 > 53.0911 )
								ret := 0.074074
	if( ema12 > -0.040023 )
		if( ema2 <= 43.1948 )
			if( ema13 <= 1.6314 )
				if( ema12 <= 0.621166 )
					if( tema <= 4.32532 )
						if( ema1 <= 4.32321 )
							if( ema12 <= 0.016221 )
								ret := 0.055644
							if( ema12 > 0.016221 )
								ret := 0.212443
						if( ema1 > 4.32321 )
							if( ema2 <= 4.36081 )
								ret := 0.618644
							if( ema2 > 4.36081 )
								ret := -0.266667
					if( tema > 4.32532 )
						if( ema13 <= 0.00633 )
							if( ema12 <= -0.021837 )
								ret := 0.057397
							if( ema12 > -0.021837 )
								ret := -0.005688
						if( ema13 > 0.00633 )
							if( ema2 <= 4.36763 )
								ret := -0.119318
							if( ema2 > 4.36763 )
								ret := 0.046828
				if( ema12 > 0.621166 )
					if( VIP <= 1.21897 )
						if( ema2 <= 28.6617 )
							if( ema13 <= 1.049 )
								ret := -0.857143 // sell
							if( ema13 > 1.049 )
								ret := 0.714286 // buy
						if( ema2 > 28.6617 )
							if( VIP <= 1.11584 )
								ret := -0.285714
							if( VIP > 1.11584 )
								ret := -0.901408 // sell
					if( VIP > 1.21897 )
						if( VIP <= 1.30686 )
							if( VIM <= 0.737917 )
								ret := 0.235294
							if( VIM > 0.737917 )
								ret := -0.500000
						if( VIP > 1.30686 )
							if( ema1 <= 35.939 )
								ret := -0.453125
							if( ema1 > 35.939 )
								ret := -0.833333 // sell
			if( ema13 > 1.6314 )
				if( ema13 <= 3.17381 )
					if( VIM <= 0.759777 )
						if( ema1 <= 37.2499 )
							ret := 0.333333
						if( ema1 > 37.2499 )
							if( ema13 <= 2.50396 )
								ret := 0.933333 // buy
							if( ema13 > 2.50396 )
								ret := 0.615385
					if( VIM > 0.759777 )
						if( VIP <= 1.20081 )
							ret := 0.285714
						if( VIP > 1.20081 )
							ret := -0.285714
				if( ema13 > 3.17381 )
					ret := -0.400000
		if( ema2 > 43.1948 )
			if( ema3 <= 42.946 )
				if( ema2 <= 43.3106 )
					ret := -0.571429
				if( ema2 > 43.3106 )
					if( VIP <= 1.2864 )
						ret := -0.857143 // sell
					if( VIP > 1.2864 )
						ret := -1.000000 // sell
			if( ema3 > 42.946 )
				if( ema12 <= 0.576273 )
					if( ema13 <= 0.186845 )
						if( ema12 <= 0.014379 )
							if( tema <= 51.5155 )
								ret := -0.484536
							if( tema > 51.5155 )
								ret := 0.115385
						if( ema12 > 0.014379 )
							if( ema1 <= 45.6199 )
								ret := -0.185714
							if( ema1 > 45.6199 )
								ret := 0.362903
					if( ema13 > 0.186845 )
						if( VIP_VIM <= 0.172117 )
							if( ema3 <= 52.9949 )
								ret := -0.616438
							if( ema3 > 52.9949 )
								ret := -0.083333
						if( VIP_VIM > 0.172117 )
							if( ema13 <= 0.435032 )
								ret := -0.029412
							if( ema13 > 0.435032 )
								ret := -0.445055
				if( ema12 > 0.576273 )
					if( ema1 <= 44.9982 )
						if( VIM <= 0.684165 )
							ret := 1.000000 // buy
						if( VIM > 0.684165 )
							if( VIP <= 1.25399 )
								ret := 0.800000 // buy
							if( VIP > 1.25399 )
								ret := 0.285714
					if( ema1 > 44.9982 )
						if( ema1 <= 45.6907 )
							if( ema2 <= 44.3893 )
								ret := -1.000000 // sell
							if( ema2 > 44.3893 )
								ret := -0.571429
						if( ema1 > 45.6907 )
							if( ema3 <= 45.9616 )
								ret := 0.880000 // buy
							if( ema3 > 45.9616 )
								ret := -0.305556
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_7a58eac2(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


