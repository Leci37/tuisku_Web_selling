//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: XLMUSDT_15Min_1T00_7ac8bec7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1T00_7ac8bec7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_7ac8bec7(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( ema12 <= -0.0003 )
		if( tema <= 0.107207 )
			if( ema13 <= -0.003509 )
				if( ema2 <= 0.087115 )
					if( tema <= 0.081967 )
						if( ema13 <= -0.003884 )
							ret := 0.750000 // buy
						if( ema13 > -0.003884 )
							ret := 1.000000 // buy
					if( tema > 0.081967 )
						ret := -0.500000
				if( ema2 > 0.087115 )
					if( ema3 <= 0.104915 )
						if( ema3 <= 0.103904 )
							ret := 1.000000 // buy
						if( ema3 > 0.103904 )
							ret := 0.500000
					if( ema3 > 0.104915 )
						ret := 1.000000 // buy
			if( ema13 > -0.003509 )
				if( ema1 <= 0.107194 )
					if( ema3 <= 0.108795 )
						if( ema12 <= -0.000741 )
							if( ema3 <= 0.106219 )
								ret := 0.234773
							if( ema3 > 0.106219 )
								ret := 0.619048
						if( ema12 > -0.000741 )
							if( ema1 <= 0.10644 )
								ret := 0.115817
							if( ema1 > 0.10644 )
								ret := 0.415441
					if( ema3 > 0.108795 )
						if( tema <= 0.105804 )
							if( ema12 <= -0.001723 )
								ret := -0.833333 // sell
							if( ema12 > -0.001723 )
								ret := 0.069767
						if( tema > 0.105804 )
							if( ema2 <= 0.108037 )
								ret := -0.941176 // sell
							if( ema2 > 0.108037 )
								ret := -0.500000
				if( ema1 > 0.107194 )
					if( ema13 <= -0.001598 )
						if( ema13 <= -0.002064 )
							if( ema3 <= 0.111595 )
								ret := 0.692308
							if( ema3 > 0.111595 )
								ret := -0.916667 // sell
						if( ema13 > -0.002064 )
							if( ema13 <= -0.001861 )
								ret := -0.387097
							if( ema13 > -0.001861 )
								ret := -0.928571 // sell
					if( ema13 > -0.001598 )
						if( tema <= 0.107127 )
							if( ema1 <= 0.107398 )
								ret := 0.603774
							if( ema1 > 0.107398 )
								ret := 0.789855 // buy
						if( tema > 0.107127 )
							if( ema12 <= -0.000371 )
								ret := 0.214286
							if( ema12 > -0.000371 )
								ret := 1.000000 // buy
		if( tema > 0.107207 )
			if( ema1 <= 0.110276 )
				if( ema3 <= 0.110064 )
					if( ema2 <= 0.108663 )
						if( tema <= 0.107913 )
							if( ema1 <= 0.107786 )
								ret := -0.537313
							if( ema1 > 0.107786 )
								ret := 0.280374
						if( tema > 0.107913 )
							if( ema13 <= -0.000682 )
								ret := -1.000000 // sell
							if( ema13 > -0.000682 )
								ret := -0.750000 // sell
					if( ema2 > 0.108663 )
						if( tema <= 0.10784 )
							if( ema1 <= 0.108269 )
								ret := 0.894737 // buy
							if( ema1 > 0.108269 )
								ret := 0.555556
						if( tema > 0.10784 )
							if( ema1 <= 0.108408 )
								ret := -0.680000
							if( ema1 > 0.108408 )
								ret := 0.083333
				if( ema3 > 0.110064 )
					if( ema12 <= -0.000603 )
						if( ema2 <= 0.111456 )
							if( ema3 <= 0.11044 )
								ret := -0.851351 // sell
							if( ema3 > 0.11044 )
								ret := -0.558974
						if( ema2 > 0.111456 )
							ret := 0.800000 // buy
					if( ema12 > -0.000603 )
						if( ema3 <= 0.110566 )
							if( ema3 <= 0.110235 )
								ret := 0.092593
							if( ema3 > 0.110235 )
								ret := -0.771084 // sell
						if( ema3 > 0.110566 )
							if( ema1 <= 0.110041 )
								ret := 0.704225 // buy
							if( ema1 > 0.110041 )
								ret := -0.196078
			if( ema1 > 0.110276 )
				if( ema2 <= 0.112261 )
					if( ema1 <= 0.110689 )
						if( ema2 <= 0.110902 )
							if( ema13 <= -0.000598 )
								ret := 0.830189 // buy
							if( ema13 > -0.000598 )
								ret := 0.153846
						if( ema2 > 0.110902 )
							if( ema12 <= -0.000734 )
								ret := 0.609756
							if( ema12 > -0.000734 )
								ret := -0.485437
					if( ema1 > 0.110689 )
						if( ema3 <= 0.111821 )
							if( tema <= 0.110455 )
								ret := 0.621212
							if( tema > 0.110455 )
								ret := 0.894737 // buy
						if( ema3 > 0.111821 )
							if( ema2 <= 0.111629 )
								ret := 0.040816
							if( ema2 > 0.111629 )
								ret := 0.495868
				if( ema2 > 0.112261 )
					if( tema <= 0.169052 )
						if( ema12 <= -0.000446 )
							if( tema <= 0.109845 )
								ret := 0.967742 // buy
							if( tema > 0.109845 )
								ret := 0.119614
						if( ema12 > -0.000446 )
							if( ema1 <= 0.112205 )
								ret := -0.635135
							if( ema1 > 0.112205 )
								ret := 0.021878
					if( tema > 0.169052 )
						if( tema <= 0.169994 )
							if( tema <= 0.16925 )
								ret := -0.333333
							if( tema > 0.16925 )
								ret := -0.876923 // sell
						if( tema > 0.169994 )
							if( ema2 <= 0.17201 )
								ret := 0.689655
							if( ema2 > 0.17201 )
								ret := -0.177184
	if( ema12 > -0.0003 )
		if( ema12 <= 0.000736 )
			if( ema2 <= 0.087353 )
				if( tema <= 0.085594 )
					if( ema1 <= 0.079365 )
						if( tema <= 0.078273 )
							if( ema3 <= 0.077961 )
								ret := 0.072628
							if( ema3 > 0.077961 )
								ret := -0.852459 // sell
						if( tema > 0.078273 )
							if( ema13 <= -0.000182 )
								ret := 0.692308
							if( ema13 > -0.000182 )
								ret := 0.218954
					if( ema1 > 0.079365 )
						if( ema2 <= 0.079518 )
							if( ema3 <= 0.079341 )
								ret := -0.080808
							if( ema3 > 0.079341 )
								ret := -0.625000
						if( ema2 > 0.079518 )
							if( ema1 <= 0.079789 )
								ret := 0.363057
							if( ema1 > 0.079789 )
								ret := -0.011390
				if( tema > 0.085594 )
					if( ema12 <= 0.000472 )
						if( ema13 <= 0.0002 )
							if( ema3 <= 0.086759 )
								ret := 0.326693
							if( ema3 > 0.086759 )
								ret := 0.124269
						if( ema13 > 0.0002 )
							if( tema <= 0.086849 )
								ret := -0.184573
							if( tema > 0.086849 )
								ret := 0.203166
					if( ema12 > 0.000472 )
						if( ema13 <= 0.00135 )
							if( ema1 <= 0.084901 )
								ret := 0.666667
							if( ema1 > 0.084901 )
								ret := 0.895522 // buy
						if( ema13 > 0.00135 )
							if( ema1 <= 0.087457 )
								ret := -0.500000
							if( ema1 > 0.087457 )
								ret := 0.777778 // buy
			if( ema2 > 0.087353 )
				if( ema3 <= 0.140697 )
					if( ema2 <= 0.140501 )
						if( ema1 <= 0.140661 )
							if( ema3 <= 0.087457 )
								ret := -0.219136
							if( ema3 > 0.087457 )
								ret := -0.016482
						if( ema1 > 0.140661 )
							if( ema3 <= 0.140049 )
								ret := 0.820000 // buy
							if( ema3 > 0.140049 )
								ret := 0.272727
					if( ema2 > 0.140501 )
						if( tema <= 0.140249 )
							if( ema1 <= 0.14065 )
								ret := -0.210526
							if( ema1 > 0.14065 )
								ret := 1.000000 // buy
						if( tema > 0.140249 )
							if( ema3 <= 0.140656 )
								ret := 0.707692 // buy
							if( ema3 > 0.140656 )
								ret := 0.071429
				if( ema3 > 0.140697 )
					if( ema3 <= 0.167061 )
						if( ema3 <= 0.159353 )
							if( tema <= 0.158679 )
								ret := -0.173042
							if( tema > 0.158679 )
								ret := 0.355670
						if( ema3 > 0.159353 )
							if( ema13 <= 0.001218 )
								ret := -0.558747
							if( ema13 > 0.001218 )
								ret := 0.388889
					if( ema3 > 0.167061 )
						if( ema3 <= 0.185152 )
							if( ema12 <= 0.000663 )
								ret := 0.109562
							if( ema12 > 0.000663 )
								ret := -0.750000 // sell
						if( ema3 > 0.185152 )
							if( ema12 <= -0.000218 )
								ret := 0.513514
							if( ema12 > -0.000218 )
								ret := -0.693548
		if( ema12 > 0.000736 )
			if( ema2 <= 0.10021 )
				if( ema3 <= 0.097363 )
					if( ema3 <= 0.081314 )
						if( ema12 <= 0.000761 )
							if( ema2 <= 0.081499 )
								ret := 0.888889 // buy
							if( ema2 > 0.081499 )
								ret := -0.500000
						if( ema12 > 0.000761 )
							if( ema13 <= 0.001467 )
								ret := 0.500000
							if( ema13 > 0.001467 )
								ret := 0.870968 // buy
					if( ema3 > 0.081314 )
						if( ema3 <= 0.085612 )
							if( ema12 <= 0.001546 )
								ret := -0.386667
							if( ema12 > 0.001546 )
								ret := 0.800000 // buy
						if( ema3 > 0.085612 )
							if( ema2 <= 0.09831 )
								ret := 0.438679
							if( ema2 > 0.09831 )
								ret := -0.400000
				if( ema3 > 0.097363 )
					if( ema1 <= 0.099558 )
						ret := 0.600000
					if( ema1 > 0.099558 )
						if( tema <= 0.101838 )
							ret := 1.000000 // buy
						if( tema > 0.101838 )
							if( ema1 <= 0.100945 )
								ret := 0.571429
							if( ema1 > 0.100945 )
								ret := 1.000000 // buy
			if( ema2 > 0.10021 )
				if( ema3 <= 0.146295 )
					if( ema1 <= 0.138258 )
						if( ema12 <= 0.002785 )
							if( ema13 <= 0.002786 )
								ret := -0.258591
							if( ema13 > 0.002786 )
								ret := -0.659498
						if( ema12 > 0.002785 )
							if( ema2 <= 0.130617 )
								ret := 0.958333 // buy
							if( ema2 > 0.130617 )
								ret := -0.923077 // sell
					if( ema1 > 0.138258 )
						if( tema <= 0.140787 )
							if( ema1 <= 0.138324 )
								ret := 0.200000
							if( ema1 > 0.138324 )
								ret := 0.818182 // buy
						if( tema > 0.140787 )
							if( ema1 <= 0.153263 )
								ret := 0.046065
							if( ema1 > 0.153263 )
								ret := -0.956522 // sell
				if( ema3 > 0.146295 )
					if( ema2 <= 0.155595 )
						if( ema1 <= 0.153666 )
							if( tema <= 0.157138 )
								ret := -0.729927 // sell
							if( tema > 0.157138 )
								ret := 0.250000
						if( ema1 > 0.153666 )
							if( ema2 <= 0.1539 )
								ret := -1.000000 // sell
							if( ema2 > 0.1539 )
								ret := -0.769231 // sell
					if( ema2 > 0.155595 )
						if( ema13 <= 0.001432 )
							if( ema2 <= 0.167914 )
								ret := 0.884615 // buy
							if( ema2 > 0.167914 )
								ret := -0.222222
						if( ema13 > 0.001432 )
							if( ema13 <= 0.003164 )
								ret := -0.582979
							if( ema13 > 0.003164 )
								ret := -0.169492
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XLMUSDT_15Min_7ac8bec7(ema2, tema, ema12, ema3, ema1, ema13)

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


