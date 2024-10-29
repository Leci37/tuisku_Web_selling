//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Vortex_Indicator
// ID_model: TWLO_1Hour_1V00_0980c419 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_1Hour_1V00_0980c419", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_1Hour_0980c419(VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP <= 1.02444 )
		if( VIP_VIM <= -1.04712 )
			if( VIP <= 0.462074 )
				if( VIP_VIM <= -1.06158 )
					if( VIM <= 1.52328 )
						ret := 0.000000
					if( VIM > 1.52328 )
						ret := 0.666667
				if( VIP_VIM > -1.06158 )
					ret := -1.000000 // sell
			if( VIP > 0.462074 )
				if( VIP <= 0.501125 )
					ret := 1.000000 // buy
				if( VIP > 0.501125 )
					ret := 0.833333 // buy
		if( VIP_VIM > -1.04712 )
			if( VIP_VIM <= 0.096904 )
				if( VIP_VIM <= 0.017775 )
					if( VIP <= 0.656257 )
						if( VIP <= 0.653563 )
							ret := -0.188800
						if( VIP > 0.653563 )
							ret := -0.870968 // sell
					if( VIP > 0.656257 )
						if( VIP <= 1.00318 )
							ret := -0.038042
						if( VIP > 1.00318 )
							ret := -0.178571
				if( VIP_VIM > 0.017775 )
					if( VIP <= 1.01026 )
						if( VIM <= 0.940707 )
							ret := -0.440678
						if( VIM > 0.940707 )
							ret := -0.807692 // sell
					if( VIP > 1.01026 )
						if( VIP_VIM <= 0.062334 )
							ret := 0.010101
						if( VIP_VIM > 0.062334 )
							ret := -0.676471
			if( VIP_VIM > 0.096904 )
				if( VIM <= 0.855378 )
					if( VIM <= 0.847983 )
						if( VIM <= 0.84751 )
							ret := -0.240000
						if( VIM > 0.84751 )
							ret := 1.000000 // buy
					if( VIM > 0.847983 )
						if( VIP_VIM <= 0.127908 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.127908 )
							ret := -0.250000
				if( VIM > 0.855378 )
					if( VIM <= 0.918144 )
						if( VIP_VIM <= 0.113401 )
							ret := 1.000000 // buy
						if( VIP_VIM > 0.113401 )
							ret := 0.775000 // buy
					if( VIM > 0.918144 )
						ret := 0.000000
	if( VIP > 1.02444 )
		if( VIM <= 1.07701 )
			if( VIP_VIM <= 0.823533 )
				if( VIP_VIM <= 0.711078 )
					if( VIP_VIM <= 0.704297 )
						if( VIM <= 0.70077 )
							ret := -0.177546
						if( VIM > 0.70077 )
							ret := 0.021990
					if( VIP_VIM > 0.704297 )
						if( VIM <= 0.710257 )
							ret := 0.909091 // buy
						if( VIM > 0.710257 )
							ret := 0.000000
				if( VIP_VIM > 0.711078 )
					if( VIP <= 1.49828 )
						if( VIM <= 0.601017 )
							ret := 0.396226
						if( VIM > 0.601017 )
							ret := -0.177112
					if( VIP > 1.49828 )
						if( VIM <= 0.878537 )
							ret := -0.564356
						if( VIM > 0.878537 )
							ret := -0.083333
			if( VIP_VIM > 0.823533 )
				if( VIM <= 0.626646 )
					if( VIM <= 0.605992 )
						if( VIP_VIM <= 1.19017 )
							ret := 0.075540
						if( VIP_VIM > 1.19017 )
							ret := 0.857143 // buy
					if( VIM > 0.605992 )
						if( VIP_VIM <= 0.914338 )
							ret := -0.423077
						if( VIP_VIM > 0.914338 )
							ret := -0.958333 // sell
				if( VIM > 0.626646 )
					if( VIP_VIM <= 0.82916 )
						if( VIP <= 1.60532 )
							ret := 1.000000 // buy
						if( VIP > 1.60532 )
							ret := 0.000000
					if( VIP_VIM > 0.82916 )
						if( VIP_VIM <= 0.852251 )
							ret := -0.058824
						if( VIP_VIM > 0.852251 )
							ret := 0.639344
		if( VIM > 1.07701 )
			if( VIP_VIM <= -0.100306 )
				if( VIP <= 1.25372 )
					if( VIM <= 1.21006 )
						if( VIP <= 1.08398 )
							ret := 0.068259
						if( VIP > 1.08398 )
							ret := 0.941176 // buy
					if( VIM > 1.21006 )
						if( VIM <= 1.22337 )
							ret := -0.609195
						if( VIM > 1.22337 )
							ret := -0.088271
				if( VIP > 1.25372 )
					if( VIP <= 1.4829 )
						if( VIM <= 1.41717 )
							ret := 0.200000
						if( VIM > 1.41717 )
							ret := 0.757576 // buy
					if( VIP > 1.4829 )
						ret := -0.500000
			if( VIP_VIM > -0.100306 )
				if( VIP_VIM <= 0.123293 )
					if( VIP <= 1.31519 )
						if( VIP <= 1.07473 )
							ret := 0.379531
						if( VIP > 1.07473 )
							ret := 0.125397
					if( VIP > 1.31519 )
						if( VIM <= 1.39757 )
							ret := 0.692308
						if( VIM > 1.39757 )
							ret := 0.235294
				if( VIP_VIM > 0.123293 )
					if( VIP <= 1.24977 )
						if( VIP <= 1.23223 )
							ret := 0.222222
						if( VIP > 1.23223 )
							ret := -0.769231 // sell
					if( VIP > 1.24977 )
						if( VIP <= 1.37838 )
							ret := 0.185185
						if( VIP > 1.37838 )
							ret := -0.082019
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_TWLO_1Hour_0980c419(VIP, VIP_VIM, VIM)

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


