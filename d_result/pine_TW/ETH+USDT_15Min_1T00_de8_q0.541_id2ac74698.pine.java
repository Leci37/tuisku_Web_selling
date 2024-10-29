//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ETHUSDT_15Min_1T00_2ac74698 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1T00_2ac74698", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_2ac74698(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 1095.15 )
		if( ema12 <= 3.69166 )
			if( ema1 <= 1062.19 )
				if( ema2 <= 1009.98 )
					if( ema3 <= 972.487 )
						if( tema <= 960.424 )
							if( ema2 <= 958.379 )
								ret := 1.000000 // buy
							if( ema2 > 958.379 )
								if( ema12 <= -4.64569 )
									ret := 1.000000 // buy
								if( ema12 > -4.64569 )
									ret := 0.400000
						if( tema > 960.424 )
							if( ema13 <= -0.480519 )
								ret := -1.000000 // sell
							if( ema13 > -0.480519 )
								if( ema2 <= 959.186 )
									ret := 1.000000 // buy
								if( ema2 > 959.186 )
									ret := 0.500000
					if( ema3 > 972.487 )
						if( ema3 <= 1012.72 )
							if( ema3 <= 1002.73 )
								if( ema3 <= 975.878 )
									ret := -0.600000
								if( ema3 > 975.878 )
									ret := -0.965517 // sell
							if( ema3 > 1002.73 )
								if( ema12 <= -2.12166 )
									ret := 0.200000
								if( ema12 > -2.12166 )
									ret := -0.800000 // sell
						if( ema3 > 1012.72 )
							ret := 0.500000
				if( ema2 > 1009.98 )
					if( tema <= 1028.05 )
						if( ema2 <= 1035.3 )
							if( ema13 <= 0.192193 )
								if( ema1 <= 1021.31 )
									ret := 0.974359 // buy
								if( ema1 > 1021.31 )
									ret := 0.615385
							if( ema13 > 0.192193 )
								ret := 1.000000 // buy
						if( ema2 > 1035.3 )
							if( ema2 <= 1055.57 )
								if( ema3 <= 1057.2 )
									ret := 0.000000
								if( ema3 > 1057.2 )
									ret := -0.857143 // sell
							if( ema2 > 1055.57 )
								if( ema13 <= -31.8052 )
									ret := 1.000000 // buy
								if( ema13 > -31.8052 )
									ret := 0.428571
					if( tema > 1028.05 )
						if( ema2 <= 1032.43 )
							if( ema3 <= 1026.48 )
								if( ema1 <= 1025.83 )
									ret := -1.000000 // sell
								if( ema1 > 1025.83 )
									ret := 0.666667
							if( ema3 > 1026.48 )
								ret := -1.000000 // sell
						if( ema2 > 1032.43 )
							if( ema13 <= 1.65817 )
								if( ema3 <= 1061.69 )
									ret := 0.178161
								if( ema3 > 1061.69 )
									ret := 0.592391
							if( ema13 > 1.65817 )
								if( ema12 <= 2.84866 )
									ret := 0.860215 // buy
								if( ema12 > 2.84866 )
									ret := 0.472222
			if( ema1 > 1062.19 )
				if( ema2 <= 1079.75 )
					if( ema1 <= 1065.56 )
						if( ema13 <= -15.6323 )
							ret := -1.000000 // sell
						if( ema13 > -15.6323 )
							if( ema1 <= 1064.42 )
								if( ema12 <= -9.51004 )
									ret := 1.000000 // buy
								if( ema12 > -9.51004 )
									ret := 0.064516
							if( ema1 > 1064.42 )
								if( ema12 <= 0.89123 )
									ret := 1.000000 // buy
								if( ema12 > 0.89123 )
									ret := -0.200000
					if( ema1 > 1065.56 )
						if( ema3 <= 1072.01 )
							if( tema <= 1067.84 )
								if( ema1 <= 1066.86 )
									ret := -0.416667
								if( ema1 > 1066.86 )
									ret := 0.560000
							if( tema > 1067.84 )
								if( tema <= 1070.4 )
									ret := -0.947368 // sell
								if( tema > 1070.4 )
									ret := -0.153846
						if( ema3 > 1072.01 )
							if( ema12 <= -10.1951 )
								ret := -1.000000 // sell
							if( ema12 > -10.1951 )
								if( ema12 <= -7.45408 )
									ret := 0.375000
								if( ema12 > -7.45408 )
									ret := -0.531250
				if( ema2 > 1079.75 )
					if( tema <= 1081.94 )
						if( ema2 <= 1110.98 )
							if( ema1 <= 1081.1 )
								if( ema2 <= 1081.09 )
									ret := 0.823529 // buy
								if( ema2 > 1081.09 )
									ret := 0.410959
							if( ema1 > 1081.1 )
								if( ema1 <= 1092.02 )
									ret := 0.863636 // buy
								if( ema1 > 1092.02 )
									ret := 0.125000
						if( ema2 > 1110.98 )
							ret := -1.000000 // sell
					if( tema > 1081.94 )
						if( ema13 <= -1.13502 )
							if( ema2 <= 1096.1 )
								if( ema12 <= -0.798692 )
									ret := -0.380952
								if( ema12 > -0.798692 )
									ret := -0.812500 // sell
							if( ema2 > 1096.1 )
								if( ema3 <= 1099.31 )
									ret := -0.333333
								if( ema3 > 1099.31 )
									ret := 0.608000
						if( ema13 > -1.13502 )
							if( ema2 <= 1088.93 )
								if( ema1 <= 1087.86 )
									ret := 0.808824 // buy
								if( ema1 > 1087.86 )
									ret := -0.230769
							if( ema2 > 1088.93 )
								ret := 1.000000 // buy
		if( ema12 > 3.69166 )
			if( ema1 <= 984.453 )
				if( ema3 <= 952.226 )
					if( ema2 <= 950.591 )
						ret := 0.750000 // buy
					if( ema2 > 950.591 )
						ret := 0.500000
				if( ema3 > 952.226 )
					ret := 1.000000 // buy
			if( ema1 > 984.453 )
				if( ema3 <= 1061.94 )
					if( ema2 <= 1046.56 )
						if( ema3 <= 1024.9 )
							if( ema1 <= 994.758 )
								ret := -1.000000 // sell
							if( ema1 > 994.758 )
								if( ema1 <= 1028.51 )
									ret := -0.500000
								if( ema1 > 1028.51 )
									ret := -0.900000 // sell
						if( ema3 > 1024.9 )
							if( ema3 <= 1032.69 )
								ret := 0.500000
							if( ema3 > 1032.69 )
								if( ema1 <= 1050.26 )
									ret := -1.000000 // sell
								if( ema1 > 1050.26 )
									ret := -0.750000 // sell
					if( ema2 > 1046.56 )
						if( ema12 <= 5.38359 )
							if( ema2 <= 1060.59 )
								if( ema13 <= 6.08608 )
									ret := -0.142857
								if( ema13 > 6.08608 )
									ret := 0.800000 // buy
							if( ema2 > 1060.59 )
								if( ema12 <= 4.66359 )
									ret := -1.000000 // sell
								if( ema12 > 4.66359 )
									ret := -0.200000
						if( ema12 > 5.38359 )
							if( ema13 <= 10.1031 )
								if( ema2 <= 1062.84 )
									ret := 1.000000 // buy
								if( ema2 > 1062.84 )
									ret := 0.800000 // buy
							if( ema13 > 10.1031 )
								if( ema1 <= 1073.97 )
									ret := 0.047619
								if( ema1 > 1073.97 )
									ret := 1.000000 // buy
				if( ema3 > 1061.94 )
					if( ema2 <= 1074.12 )
						if( ema3 <= 1067.16 )
							if( ema13 <= 7.21679 )
								ret := -1.000000 // sell
							if( ema13 > 7.21679 )
								if( ema12 <= 7.98928 )
									ret := -0.333333
								if( ema12 > 7.98928 )
									ret := -1.000000 // sell
						if( ema3 > 1067.16 )
							ret := 0.000000
					if( ema2 > 1074.12 )
						if( tema <= 1085.4 )
							ret := -0.750000 // sell
						if( tema > 1085.4 )
							ret := -1.000000 // sell
	if( tema > 1095.15 )
		if( ema12 <= 36.2017 )
			if( ema12 <= -6.09437 )
				if( ema12 <= -55.1572 )
					if( ema1 <= 3536.99 )
						if( ema1 <= 2438.91 )
							if( ema1 <= 1883.89 )
								ret := 0.500000
							if( ema1 > 1883.89 )
								if( tema <= 2259.24 )
									ret := 0.857143 // buy
								if( tema > 2259.24 )
									ret := 1.000000 // buy
						if( ema1 > 2438.91 )
							if( ema12 <= -61.8264 )
								if( ema2 <= 3348.65 )
									ret := 0.000000
								if( ema2 > 3348.65 )
									ret := 0.750000 // buy
							if( ema12 > -61.8264 )
								if( ema12 <= -58.9609 )
									ret := 0.750000 // buy
								if( ema12 > -58.9609 )
									ret := 1.000000 // buy
					if( ema1 > 3536.99 )
						ret := -0.333333
				if( ema12 > -55.1572 )
					if( ema2 <= 1219.1 )
						if( ema1 <= 1182.17 )
							if( ema13 <= -11.2385 )
								if( ema3 <= 1122.11 )
									ret := -0.550000
								if( ema3 > 1122.11 )
									ret := 0.310580
							if( ema13 > -11.2385 )
								if( ema12 <= -6.43007 )
									ret := -0.666667
								if( ema12 > -6.43007 )
									ret := -1.000000 // sell
						if( ema1 > 1182.17 )
							if( ema13 <= -18.8275 )
								if( ema1 <= 1188.89 )
									ret := -0.782609 // sell
								if( ema1 > 1188.89 )
									ret := 0.414634
							if( ema13 > -18.8275 )
								if( ema12 <= -6.66693 )
									ret := -0.641892
								if( ema12 > -6.66693 )
									ret := 0.172414
					if( ema2 > 1219.1 )
						if( ema3 <= 1278.11 )
							if( ema12 <= -6.37511 )
								if( ema13 <= -10.9515 )
									ret := 0.739535 // buy
								if( ema13 > -10.9515 )
									ret := -0.705882 // sell
							if( ema12 > -6.37511 )
								if( tema <= 1226.77 )
									ret := -0.750000 // sell
								if( tema > 1226.77 )
									ret := 0.500000
						if( ema3 > 1278.11 )
							if( ema2 <= 1271.54 )
								if( ema13 <= -36.3037 )
									ret := -0.925926 // sell
								if( ema13 > -36.3037 )
									ret := 0.250000
							if( ema2 > 1271.54 )
								if( tema <= 1731.58 )
									ret := 0.161302
								if( tema > 1731.58 )
									ret := 0.076743
			if( ema12 > -6.09437 )
				if( tema <= 1141.53 )
					if( ema2 <= 1096.99 )
						if( ema12 <= 4.39424 )
							if( ema12 <= 2.63256 )
								ret := 1.000000 // buy
							if( ema12 > 2.63256 )
								if( ema1 <= 1095.47 )
									ret := 0.900000 // buy
								if( ema1 > 1095.47 )
									ret := 0.500000
						if( ema12 > 4.39424 )
							if( ema13 <= 10.9471 )
								if( ema3 <= 1086.69 )
									ret := -0.688889
								if( ema3 > 1086.69 )
									ret := 0.083333
							if( ema13 > 10.9471 )
								if( ema1 <= 1105.82 )
									ret := 0.487179
								if( ema1 > 1105.82 )
									ret := -0.600000
					if( ema2 > 1096.99 )
						if( ema1 <= 1116.5 )
							if( ema1 <= 1110 )
								if( ema1 <= 1101.99 )
									ret := -0.640625
								if( ema1 > 1101.99 )
									ret := 0.016129
							if( ema1 > 1110 )
								if( ema12 <= -1.76355 )
									ret := -0.090909
								if( ema12 > -1.76355 )
									ret := -0.850467 // sell
						if( ema1 > 1116.5 )
							if( ema1 <= 1131.42 )
								if( tema <= 1119.13 )
									ret := -0.350649
								if( tema > 1119.13 )
									ret := 0.146580
							if( ema1 > 1131.42 )
								if( ema2 <= 1132.09 )
									ret := -0.746479 // sell
								if( ema2 > 1132.09 )
									ret := -0.207407
				if( tema > 1141.53 )
					if( ema3 <= 1587.39 )
						if( tema <= 1423.04 )
							if( ema2 <= 1209.33 )
								if( ema1 <= 1210.43 )
									ret := 0.116351
								if( ema1 > 1210.43 )
									ret := 0.659574
							if( ema2 > 1209.33 )
								if( ema12 <= 2.46073 )
									ret := 0.033817
								if( ema12 > 2.46073 )
									ret := -0.142180
						if( tema > 1423.04 )
							if( ema1 <= 1597.81 )
								if( tema <= 1460.53 )
									ret := 0.329545
								if( tema > 1460.53 )
									ret := 0.114176
							if( ema1 > 1597.81 )
								if( ema3 <= 1581.25 )
									ret := 0.111111
								if( ema3 > 1581.25 )
									ret := 0.864198 // buy
					if( ema3 > 1587.39 )
						if( ema13 <= 19.1042 )
							if( ema3 <= 1589.77 )
								if( tema <= 1580.05 )
									ret := 0.785714 // buy
								if( tema > 1580.05 )
									ret := -0.370107
							if( ema3 > 1589.77 )
								if( ema3 <= 3811.8 )
									ret := 0.036312
								if( ema3 > 3811.8 )
									ret := -0.085284
						if( ema13 > 19.1042 )
							if( tema <= 3057.48 )
								if( tema <= 2355.52 )
									ret := -0.014655
								if( tema > 2355.52 )
									ret := -0.218391
							if( tema > 3057.48 )
								if( tema <= 3483.95 )
									ret := 0.153677
								if( tema > 3483.95 )
									ret := -0.142336
		if( ema12 > 36.2017 )
			if( ema1 <= 2333.4 )
				ret := -0.500000
			if( ema1 > 2333.4 )
				if( tema <= 3792.01 )
					if( tema <= 3163.08 )
						if( tema <= 2483.32 )
							ret := 1.000000 // buy
						if( tema > 2483.32 )
							if( ema12 <= 46.5429 )
								ret := -0.250000
							if( ema12 > 46.5429 )
								ret := -0.750000 // sell
					if( tema > 3163.08 )
						if( ema2 <= 3363.29 )
							ret := 1.000000 // buy
						if( ema2 > 3363.29 )
							if( ema2 <= 3396.33 )
								if( tema <= 3488.92 )
									ret := 0.000000
								if( tema > 3488.92 )
									ret := 0.500000
							if( ema2 > 3396.33 )
								if( ema1 <= 3549.03 )
									ret := 1.000000 // buy
								if( ema1 > 3549.03 )
									ret := 0.790698 // buy
				if( tema > 3792.01 )
					if( ema13 <= 77.3022 )
						if( ema12 <= 43.3373 )
							ret := 1.000000 // buy
						if( ema12 > 43.3373 )
							ret := 0.500000
					if( ema13 > 77.3022 )
						if( ema3 <= 3718.24 )
							ret := 0.000000
						if( ema3 > 3718.24 )
							ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_ETHUSDT_15Min_2ac74698(ema12, ema3, ema13, tema, ema1, ema2)

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


