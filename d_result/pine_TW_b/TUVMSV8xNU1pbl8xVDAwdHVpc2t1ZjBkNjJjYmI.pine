//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: MELI_15Min_1T00_f0d62cbb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1T00_f0d62cbb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_f0d62cbb(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -6.30238 )
		if( tema <= 632.711 )
			if( ema12 <= -7.78419 )
				if( tema <= 449.885 )
					if( ema12 <= -7.94914 )
						if( ema1 <= 453.366 )
							ret := 1.000000 // buy
						if( ema1 > 453.366 )
							if( tema <= 441.512 )
								ret := 0.875000 // buy
							if( tema > 441.512 )
								ret := 0.923077 // buy
					if( ema12 > -7.94914 )
						ret := 0.642857
				if( tema > 449.885 )
					if( ema2 <= 492.645 )
						if( tema <= 456.722 )
							ret := -0.769231 // sell
						if( tema > 456.722 )
							ret := -0.866667 // sell
					if( ema2 > 492.645 )
						if( ema1 <= 644.432 )
							if( ema1 <= 636.181 )
								if( ema3 <= 652.166 )
									ret := 0.725610 // buy
								if( ema3 > 652.166 )
									ret := -0.045455
							if( ema1 > 636.181 )
								ret := 1.000000 // buy
						if( ema1 > 644.432 )
							ret := -0.500000
			if( ema12 > -7.78419 )
				if( ema2 <= 461.152 )
					if( ema12 <= -6.53082 )
						if( ema2 <= 315.361 )
							ret := 0.416667
						if( ema2 > 315.361 )
							if( tema <= 439.938 )
								if( ema1 <= 354.741 )
									ret := 1.000000 // buy
								if( ema1 > 354.741 )
									ret := 0.733333 // buy
							if( tema > 439.938 )
								ret := 0.400000
					if( ema12 > -6.53082 )
						if( ema12 <= -6.45576 )
							ret := -0.384615
						if( ema12 > -6.45576 )
							ret := 0.000000
				if( ema2 > 461.152 )
					if( tema <= 460.396 )
						ret := -1.000000 // sell
					if( tema > 460.396 )
						if( ema2 <= 503.203 )
							if( tema <= 475.897 )
								ret := -0.500000
							if( tema > 475.897 )
								ret := 1.000000 // buy
						if( ema2 > 503.203 )
							if( ema1 <= 515.278 )
								if( ema3 <= 520.878 )
									ret := -0.100000
								if( ema3 > 520.878 )
									ret := -1.000000 // sell
							if( ema1 > 515.278 )
								if( ema2 <= 572.036 )
									ret := 0.625000
								if( ema2 > 572.036 )
									ret := -0.288462
		if( tema > 632.711 )
			if( ema12 <= -22.7035 )
				if( tema <= 1217.37 )
					if( tema <= 1105.8 )
						if( ema12 <= -26.929 )
							ret := 0.764706 // buy
						if( ema12 > -26.929 )
							ret := 0.125000
					if( tema > 1105.8 )
						ret := -0.777778 // sell
				if( tema > 1217.37 )
					if( ema2 <= 1765.42 )
						if( ema3 <= 1744.39 )
							if( ema2 <= 1512.18 )
								ret := 1.000000 // buy
							if( ema2 > 1512.18 )
								if( ema1 <= 1606.67 )
									ret := 0.416667
								if( ema1 > 1606.67 )
									ret := 0.636364
						if( ema3 > 1744.39 )
							if( ema13 <= -52.2012 )
								ret := 0.894737 // buy
							if( ema13 > -52.2012 )
								ret := 1.000000 // buy
					if( ema2 > 1765.42 )
						if( ema2 <= 1801 )
							ret := -0.875000 // sell
						if( ema2 > 1801 )
							if( ema1 <= 1872.23 )
								ret := 0.384615
							if( ema1 > 1872.23 )
								ret := 0.875000 // buy
			if( ema12 > -22.7035 )
				if( tema <= 785.761 )
					if( tema <= 775.062 )
						if( ema13 <= -29.2565 )
							ret := 0.562500
						if( ema13 > -29.2565 )
							if( ema3 <= 797.642 )
								if( ema1 <= 676.527 )
									ret := 0.120879
								if( ema1 > 676.527 )
									ret := -0.513716
							if( ema3 > 797.642 )
								if( ema12 <= -12.2968 )
									ret := 0.000000
								if( ema12 > -12.2968 )
									ret := 0.774194 // buy
					if( tema > 775.062 )
						if( ema3 <= 803.735 )
							if( ema3 <= 801.487 )
								ret := -1.000000 // sell
							if( ema3 > 801.487 )
								ret := -0.333333
						if( ema3 > 803.735 )
							if( ema2 <= 806.592 )
								ret := -1.000000 // sell
							if( ema2 > 806.592 )
								ret := -0.692308
				if( tema > 785.761 )
					if( ema13 <= -24.5308 )
						if( ema2 <= 1689.5 )
							if( ema3 <= 1215.57 )
								if( ema2 <= 1145.45 )
									ret := -0.184438
								if( ema2 > 1145.45 )
									ret := 0.325758
							if( ema3 > 1215.57 )
								if( ema1 <= 1329.16 )
									ret := -0.649351
								if( ema1 > 1329.16 )
									ret := -0.305400
						if( ema2 > 1689.5 )
							if( ema3 <= 1867.58 )
								if( ema1 <= 1829.88 )
									ret := 0.219512
								if( ema1 > 1829.88 )
									ret := -0.785714 // sell
							if( ema3 > 1867.58 )
								if( ema12 <= -20.5804 )
									ret := -0.333333
								if( ema12 > -20.5804 )
									ret := 0.586957
					if( ema13 > -24.5308 )
						if( ema2 <= 830.552 )
							if( ema3 <= 821.387 )
								if( ema2 <= 814.368 )
									ret := 0.687500
								if( ema2 > 814.368 )
									ret := -0.600000
							if( ema3 > 821.387 )
								if( ema3 <= 828.224 )
									ret := 0.920000 // buy
								if( ema3 > 828.224 )
									ret := 0.560000
						if( ema2 > 830.552 )
							if( ema12 <= -7.83397 )
								if( ema1 <= 1738.5 )
									ret := -0.026166
								if( ema1 > 1738.5 )
									ret := -0.293233
							if( ema12 > -7.83397 )
								if( tema <= 1786.09 )
									ret := -0.205357
								if( tema > 1786.09 )
									ret := 0.437500
	if( ema12 > -6.30238 )
		if( ema12 <= 1.67751 )
			if( ema2 <= 153.443 )
				if( ema12 <= 0.21747 )
					if( ema3 <= 153.645 )
						if( ema13 <= -1.00123 )
							ret := 0.928571 // buy
						if( ema13 > -1.00123 )
							if( ema2 <= 152.471 )
								if( ema13 <= 0.147923 )
									ret := 0.884615 // buy
								if( ema13 > 0.147923 )
									ret := 0.333333
							if( ema2 > 152.471 )
								ret := 0.000000
					if( ema3 > 153.645 )
						ret := 1.000000 // buy
				if( ema12 > 0.21747 )
					ret := -0.250000
			if( ema2 > 153.443 )
				if( ema3 <= 1188.75 )
					if( ema3 <= 1149.07 )
						if( ema1 <= 1121.08 )
							if( ema3 <= 1107.37 )
								if( tema <= 1019.5 )
									ret := 0.037852
								if( tema > 1019.5 )
									ret := -0.132114
							if( ema3 > 1107.37 )
								if( ema1 <= 1109.01 )
									ret := 0.758929 // buy
								if( ema1 > 1109.01 )
									ret := 0.254480
						if( ema1 > 1121.08 )
							if( ema2 <= 1122.4 )
								if( ema12 <= 0.615989 )
									ret := 1.000000 // buy
								if( ema12 > 0.615989 )
									ret := 0.363636
							if( ema2 > 1122.4 )
								if( ema2 <= 1131.57 )
									ret := -0.737374 // sell
								if( ema2 > 1131.57 )
									ret := -0.285333
					if( ema3 > 1149.07 )
						if( ema13 <= -2.72337 )
							if( ema1 <= 1162.36 )
								if( ema3 <= 1167.25 )
									ret := 0.112583
								if( ema3 > 1167.25 )
									ret := 0.900000 // buy
							if( ema1 > 1162.36 )
								if( tema <= 1160.66 )
									ret := 0.564103
								if( tema > 1160.66 )
									ret := -0.196911
						if( ema13 > -2.72337 )
							if( ema1 <= 1182.21 )
								if( ema1 <= 1166.24 )
									ret := 0.637363
								if( ema1 > 1166.24 )
									ret := 0.143617
							if( ema1 > 1182.21 )
								if( ema13 <= 4.18037 )
									ret := 0.824000 // buy
								if( ema13 > 4.18037 )
									ret := 0.285714
				if( ema3 > 1188.75 )
					if( ema1 <= 1189.3 )
						if( tema <= 1180.53 )
							if( ema1 <= 1182.08 )
								ret := -0.090909
							if( ema1 > 1182.08 )
								ret := -0.380952
						if( tema > 1180.53 )
							if( tema <= 1181.25 )
								ret := -1.000000 // sell
							if( tema > 1181.25 )
								if( ema3 <= 1195.04 )
									ret := -0.658537
								if( ema3 > 1195.04 )
									ret := -0.869565 // sell
					if( ema1 > 1189.3 )
						if( ema3 <= 1359.36 )
							if( ema2 <= 1342.11 )
								if( ema12 <= 1.48804 )
									ret := -0.043990
								if( ema12 > 1.48804 )
									ret := 0.253247
							if( ema2 > 1342.11 )
								if( ema13 <= -4.75679 )
									ret := -0.222222
								if( ema13 > -4.75679 )
									ret := -0.676647
						if( ema3 > 1359.36 )
							if( tema <= 1365.21 )
								if( ema3 <= 1363.23 )
									ret := 0.156250
								if( ema3 > 1363.23 )
									ret := 0.518868
							if( tema > 1365.21 )
								if( ema12 <= -1.86041 )
									ret := 0.066279
								if( ema12 > -1.86041 )
									ret := 0.008240
		if( ema12 > 1.67751 )
			if( ema2 <= 260.999 )
				if( ema3 <= 228.562 )
					if( ema1 <= 185.848 )
						ret := 0.000000
					if( ema1 > 185.848 )
						ret := -0.777778 // sell
				if( ema3 > 228.562 )
					if( ema1 <= 241.441 )
						ret := 0.416667
					if( ema1 > 241.441 )
						if( ema1 <= 258.65 )
							if( ema12 <= 4.23693 )
								if( ema13 <= 4.67105 )
									ret := 0.656250
								if( ema13 > 4.67105 )
									ret := 0.917808 // buy
							if( ema12 > 4.23693 )
								ret := 0.125000
						if( ema1 > 258.65 )
							ret := 1.000000 // buy
			if( ema2 > 260.999 )
				if( ema1 <= 649.689 )
					if( tema <= 606.715 )
						if( ema1 <= 563.851 )
							if( ema2 <= 312.783 )
								if( ema2 <= 310.412 )
									ret := -0.022189
								if( ema2 > 310.412 )
									ret := 0.750000 // buy
							if( ema2 > 312.783 )
								if( tema <= 361.761 )
									ret := -0.318709
								if( tema > 361.761 )
									ret := -0.086977
						if( ema1 > 563.851 )
							if( ema12 <= 9.42616 )
								if( ema12 <= 4.3773 )
									ret := 0.016706
								if( ema12 > 4.3773 )
									ret := 0.540107
							if( ema12 > 9.42616 )
								if( ema12 <= 9.96175 )
									ret := -0.666667
								if( ema12 > 9.96175 )
									ret := -1.000000 // sell
					if( tema > 606.715 )
						if( ema3 <= 612.554 )
							if( ema2 <= 609.643 )
								if( ema1 <= 608.492 )
									ret := -0.492308
								if( ema1 > 608.492 )
									ret := 0.309524
							if( ema2 > 609.643 )
								if( tema <= 626.414 )
									ret := -0.824176 // sell
								if( tema > 626.414 )
									ret := -0.259259
						if( ema3 > 612.554 )
							if( ema3 <= 617.645 )
								if( ema12 <= 2.92992 )
									ret := 0.781250 // buy
								if( ema12 > 2.92992 )
									ret := 0.147059
							if( ema3 > 617.645 )
								if( ema13 <= 5.51212 )
									ret := -0.090909
								if( ema13 > 5.51212 )
									ret := -0.516129
				if( ema1 > 649.689 )
					if( tema <= 1604.57 )
						if( ema3 <= 736.752 )
							if( ema13 <= 12.9453 )
								if( ema12 <= 6.14499 )
									ret := 0.168129
								if( ema12 > 6.14499 )
									ret := -0.515152
							if( ema13 > 12.9453 )
								if( ema13 <= 14.6516 )
									ret := 0.753247 // buy
								if( ema13 > 14.6516 )
									ret := 0.274854
						if( ema3 > 736.752 )
							if( ema1 <= 751.21 )
								if( ema12 <= 2.18947 )
									ret := -0.692308
								if( ema12 > 2.18947 )
									ret := -0.968750 // sell
							if( ema1 > 751.21 )
								if( ema12 <= 5.86246 )
									ret := 0.045937
								if( ema12 > 5.86246 )
									ret := -0.040030
					if( tema > 1604.57 )
						if( ema3 <= 2043.48 )
							if( ema13 <= 10.6288 )
								if( ema3 <= 1897.5 )
									ret := -0.245663
								if( ema3 > 1897.5 )
									ret := 0.089347
							if( ema13 > 10.6288 )
								if( ema12 <= 14.1034 )
									ret := -0.062898
								if( ema12 > 14.1034 )
									ret := 0.199387
						if( ema3 > 2043.48 )
							if( tema <= 2069.38 )
								if( ema1 <= 2053.92 )
									ret := -0.777778 // sell
								if( ema1 > 2053.92 )
									ret := -1.000000 // sell
							if( tema > 2069.38 )
								if( ema1 <= 2125.06 )
									ret := -0.037037
								if( ema1 > 2125.06 )
									ret := -0.640000
	
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
float op_operation = decision_tree_0_MELI_15Min_f0d62cbb(ema12, ema3, ema13, tema, ema1, ema2)

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


