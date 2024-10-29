//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: XLMUSDT_30Min_1T00_6dd8be39 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_1T00_6dd8be39", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_6dd8be39(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema2 <= 0.679435 )
		if( ema3 <= 0.090548 )
			if( ema3 <= 0.089959 )
				if( ema13 <= -0.001915 )
					if( ema2 <= 0.075159 )
						ret := -0.277778
					if( ema2 > 0.075159 )
						if( ema1 <= 0.083313 )
							if( ema13 <= -0.003353 )
								ret := -0.600000
							if( ema13 > -0.003353 )
								if( ema1 <= 0.078933 )
									ret := 0.775000 // buy
								if( ema1 > 0.078933 )
									ret := 0.329114
						if( ema1 > 0.083313 )
							if( ema2 <= 0.087638 )
								if( ema1 <= 0.085708 )
									ret := 0.925926 // buy
								if( ema1 > 0.085708 )
									ret := 0.642857
							if( ema2 > 0.087638 )
								ret := 0.272727
				if( ema13 > -0.001915 )
					if( ema13 <= 0.001527 )
						if( ema3 <= 0.08072 )
							if( ema2 <= 0.079964 )
								if( ema2 <= 0.077907 )
									ret := 0.116786
								if( ema2 > 0.077907 )
									ret := -0.111623
							if( ema2 > 0.079964 )
								if( ema1 <= 0.080099 )
									ret := 0.666667
								if( ema1 > 0.080099 )
									ret := 0.175983
						if( ema3 > 0.08072 )
							if( ema13 <= -0.001127 )
								if( ema1 <= 0.080401 )
									ret := 0.142857
								if( ema1 > 0.080401 )
									ret := -0.573840
							if( ema13 > -0.001127 )
								if( ema2 <= 0.081496 )
									ret := -0.295943
								if( ema2 > 0.081496 )
									ret := 0.053403
					if( ema13 > 0.001527 )
						if( ema1 <= 0.078533 )
							if( ema13 <= 0.001607 )
								ret := 1.000000 // buy
							if( ema13 > 0.001607 )
								if( ema3 <= 0.074927 )
									ret := 0.266667
								if( ema3 > 0.074927 )
									ret := 0.972222 // buy
						if( ema1 > 0.078533 )
							if( ema12 <= 0.001837 )
								if( tema <= 0.093082 )
									ret := 0.304348
								if( tema > 0.093082 )
									ret := 1.000000 // buy
							if( ema12 > 0.001837 )
								ret := -0.750000 // sell
			if( ema3 > 0.089959 )
				if( ema3 <= 0.090208 )
					if( ema2 <= 0.090533 )
						if( ema3 <= 0.090016 )
							if( ema3 <= 0.089976 )
								ret := 0.571429
							if( ema3 > 0.089976 )
								if( ema2 <= 0.090102 )
									ret := 0.000000
								if( ema2 > 0.090102 )
									ret := 0.230769
						if( ema3 > 0.090016 )
							if( tema <= 0.090575 )
								if( ema12 <= -0.000183 )
									ret := 0.454545
								if( ema12 > -0.000183 )
									ret := 0.729508 // buy
							if( tema > 0.090575 )
								if( ema13 <= 0.000595 )
									ret := 0.000000
								if( ema13 > 0.000595 )
									ret := 0.923077 // buy
					if( ema2 > 0.090533 )
						if( ema12 <= 0.000225 )
							ret := -1.000000 // sell
						if( ema12 > 0.000225 )
							ret := 0.375000
				if( ema3 > 0.090208 )
					if( ema12 <= -0.000401 )
						if( ema12 <= -0.000696 )
							ret := 0.357143
						if( ema12 > -0.000696 )
							if( ema1 <= 0.089281 )
								ret := 1.000000 // buy
							if( ema1 > 0.089281 )
								ret := 0.500000
					if( ema12 > -0.000401 )
						if( ema3 <= 0.090493 )
							if( ema3 <= 0.090411 )
								if( ema2 <= 0.090391 )
									ret := 0.038462
								if( ema2 > 0.090391 )
									ret := -0.303371
							if( ema3 > 0.090411 )
								if( ema1 <= 0.090783 )
									ret := -0.060606
								if( ema1 > 0.090783 )
									ret := 0.428571
						if( ema3 > 0.090493 )
							if( ema2 <= 0.090434 )
								ret := 0.000000
							if( ema2 > 0.090434 )
								if( ema2 <= 0.090796 )
									ret := 0.789474 // buy
								if( ema2 > 0.090796 )
									ret := 0.111111
		if( ema3 > 0.090548 )
			if( ema2 <= 0.222818 )
				if( ema2 <= 0.217851 )
					if( ema13 <= -0.001003 )
						if( ema2 <= 0.19574 )
							if( ema13 <= -0.006749 )
								if( ema1 <= 0.173273 )
									ret := 0.767857 // buy
								if( ema1 > 0.173273 )
									ret := 0.400000
							if( ema13 > -0.006749 )
								if( ema2 <= 0.192746 )
									ret := 0.046573
								if( ema2 > 0.192746 )
									ret := 0.565217
						if( ema2 > 0.19574 )
							if( ema1 <= 0.215425 )
								if( ema3 <= 0.213751 )
									ret := -0.203800
								if( ema3 > 0.213751 )
									ret := -0.718121 // sell
							if( ema1 > 0.215425 )
								if( ema1 <= 0.216939 )
									ret := 0.976744 // buy
								if( ema1 > 0.216939 )
									ret := 0.500000
					if( ema13 > -0.001003 )
						if( ema2 <= 0.100798 )
							if( ema2 <= 0.100035 )
								if( tema <= 0.09948 )
									ret := -0.096941
								if( tema > 0.09948 )
									ret := 0.172205
							if( ema2 > 0.100035 )
								if( ema13 <= 0.002371 )
									ret := -0.510638
								if( ema13 > 0.002371 )
									ret := 0.363636
						if( ema2 > 0.100798 )
							if( tema <= 0.10868 )
								if( ema2 <= 0.101462 )
									ret := 0.490066
								if( ema2 > 0.101462 )
									ret := 0.064353
							if( tema > 0.10868 )
								if( ema3 <= 0.209978 )
									ret := -0.056489
								if( ema3 > 0.209978 )
									ret := 0.203704
				if( ema2 > 0.217851 )
					if( ema3 <= 0.22448 )
						if( ema2 <= 0.221229 )
							if( ema13 <= -0.000252 )
								if( tema <= 0.214206 )
									ret := 0.444444
								if( tema > 0.214206 )
									ret := -0.764228 // sell
							if( ema13 > -0.000252 )
								if( tema <= 0.219167 )
									ret := 0.538462
								if( tema > 0.219167 )
									ret := -0.190840
						if( ema2 > 0.221229 )
							if( ema12 <= -0.000162 )
								if( ema13 <= -0.00161 )
									ret := -0.700000 // sell
								if( ema13 > -0.00161 )
									ret := -1.000000 // sell
							if( ema12 > -0.000162 )
								if( ema12 <= 0.001089 )
									ret := 0.066667
								if( ema12 > 0.001089 )
									ret := -0.666667
					if( ema3 > 0.22448 )
						ret := 0.900000 // buy
			if( ema2 > 0.222818 )
				if( tema <= 0.234251 )
					if( ema12 <= 5.6e-05 )
						if( ema3 <= 0.23651 )
							if( tema <= 0.222576 )
								if( ema3 <= 0.224584 )
									ret := -1.000000 // sell
								if( ema3 > 0.224584 )
									ret := 0.709302 // buy
							if( tema > 0.222576 )
								if( ema1 <= 0.229785 )
									ret := -0.201258
								if( ema1 > 0.229785 )
									ret := 0.061224
						if( ema3 > 0.23651 )
							if( ema13 <= -0.007315 )
								if( ema13 <= -0.012087 )
									ret := 1.000000 // buy
								if( ema13 > -0.012087 )
									ret := -0.392857
							if( ema13 > -0.007315 )
								if( ema13 <= -0.002645 )
									ret := 0.836957 // buy
								if( ema13 > -0.002645 )
									ret := 0.533333
					if( ema12 > 5.6e-05 )
						if( ema2 <= 0.225208 )
							if( ema13 <= 9.1e-05 )
								ret := -0.555556
							if( ema13 > 9.1e-05 )
								ret := 0.809524 // buy
						if( ema2 > 0.225208 )
							if( tema <= 0.231238 )
								if( ema3 <= 0.225231 )
									ret := 0.333333
								if( ema3 > 0.225231 )
									ret := 0.902778 // buy
							if( tema > 0.231238 )
								if( ema1 <= 0.22953 )
									ret := -0.272727
								if( ema1 > 0.22953 )
									ret := 0.581967
				if( tema > 0.234251 )
					if( ema13 <= -0.031278 )
						if( ema12 <= -0.017322 )
							if( ema1 <= 0.389503 )
								if( ema13 <= -0.033767 )
									ret := -0.250000
								if( ema13 > -0.033767 )
									ret := 1.000000 // buy
							if( ema1 > 0.389503 )
								if( ema3 <= 0.605602 )
									ret := 0.809524 // buy
								if( ema3 > 0.605602 )
									ret := 1.000000 // buy
						if( ema12 > -0.017322 )
							if( ema2 <= 0.433974 )
								ret := 0.769231 // buy
							if( ema2 > 0.433974 )
								ret := -0.375000
					if( ema13 > -0.031278 )
						if( tema <= 0.244666 )
							if( ema3 <= 0.255401 )
								if( ema13 <= -0.001506 )
									ret := 0.058997
								if( ema13 > -0.001506 )
									ret := -0.268378
							if( ema3 > 0.255401 )
								ret := 1.000000 // buy
						if( tema > 0.244666 )
							if( ema2 <= 0.25836 )
								if( tema <= 0.255287 )
									ret := 0.110698
								if( tema > 0.255287 )
									ret := 0.417445
							if( ema2 > 0.25836 )
								if( ema3 <= 0.263099 )
									ret := -0.238914
								if( ema3 > 0.263099 )
									ret := 0.013091
	if( ema2 > 0.679435 )
		if( ema3 <= 0.682669 )
			if( ema2 <= 0.681405 )
				ret := -0.583333
			if( ema2 > 0.681405 )
				ret := -1.000000 // sell
		if( ema3 > 0.682669 )
			if( ema13 <= 0.017613 )
				if( tema <= 0.693966 )
					if( ema1 <= 0.688996 )
						if( ema1 <= 0.674748 )
							ret := 0.000000
						if( ema1 > 0.674748 )
							if( ema1 <= 0.687357 )
								if( ema2 <= 0.690908 )
									ret := -1.000000 // sell
								if( ema2 > 0.690908 )
									ret := -0.916667 // sell
							if( ema1 > 0.687357 )
								ret := -0.800000 // sell
					if( ema1 > 0.688996 )
						if( ema13 <= -0.009943 )
							if( ema1 <= 0.692035 )
								ret := -0.928571 // sell
							if( ema1 > 0.692035 )
								ret := 0.428571
						if( ema13 > -0.009943 )
							if( ema13 <= -0.003513 )
								ret := 0.900000 // buy
							if( ema13 > -0.003513 )
								ret := 0.944444 // buy
				if( tema > 0.693966 )
					if( ema3 <= 0.696592 )
						ret := -0.333333
					if( ema3 > 0.696592 )
						if( ema1 <= 0.714476 )
							if( ema13 <= -0.00454 )
								ret := -1.000000 // sell
							if( ema13 > -0.00454 )
								ret := -0.545455
						if( ema1 > 0.714476 )
							if( ema1 <= 0.761952 )
								ret := -1.000000 // sell
							if( ema1 > 0.761952 )
								ret := -0.900000 // sell
			if( ema13 > 0.017613 )
				if( tema <= 0.76397 )
					if( ema2 <= 0.703806 )
						ret := 1.000000 // buy
					if( ema2 > 0.703806 )
						if( ema2 <= 0.712228 )
							ret := -0.307692
						if( ema2 > 0.712228 )
							ret := 1.000000 // buy
				if( tema > 0.76397 )
					ret := -0.550000
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_6dd8be39(ema2, tema, ema12, ema3, ema1, ema13)

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


