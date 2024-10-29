//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: UNIUSDT_15Min_2BT0_72b35435 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2BT0_72b35435", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_72b35435(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.015966 )
		if( ema13 <= -0.246008 )
			if( bbm <= 0.252201 )
				if( bullPower <= -0.366953 )
					ret := 1.000000 // buy
				if( bullPower > -0.366953 )
					if( bearPower <= -0.505765 )
						if( ema13 <= -0.41562 )
							ret := -0.750000 // sell
						if( ema13 > -0.41562 )
							ret := -1.000000 // sell
					if( bearPower > -0.505765 )
						if( tema <= 10.3668 )
							if( ema1 <= 6.57519 )
								if( bearPower <= -0.242783 )
									ret := 0.042857
								if( bearPower > -0.242783 )
									ret := 0.884615 // buy
							if( ema1 > 6.57519 )
								if( ema1 <= 6.88327 )
									ret := -0.687500
								if( ema1 > 6.88327 )
									ret := 0.112150
						if( tema > 10.3668 )
							if( bbp <= -0.52152 )
								if( bearPower <= -0.379793 )
									ret := 0.538462
								if( bearPower > -0.379793 )
									ret := -0.285714
							if( bbp > -0.52152 )
								if( ema12 <= -0.127241 )
									ret := 0.796610 // buy
								if( ema12 > -0.127241 )
									ret := 0.000000
			if( bbm > 0.252201 )
				if( ema2 <= 10.9929 )
					if( bbp <= -0.744264 )
						if( tema <= 5.90764 )
							ret := 0.857143 // buy
						if( tema > 5.90764 )
							ret := 1.000000 // buy
					if( bbp > -0.744264 )
						if( ema13 <= -0.444665 )
							ret := 0.400000
						if( ema13 > -0.444665 )
							if( bearPower <= -0.453869 )
								if( bbp <= -0.636442 )
									ret := 1.000000 // buy
								if( bbp > -0.636442 )
									ret := 0.666667
							if( bearPower > -0.453869 )
								ret := 1.000000 // buy
				if( ema2 > 10.9929 )
					if( ema3 <= 12.3339 )
						if( bullPower <= -0.271556 )
							ret := -1.000000 // sell
						if( bullPower > -0.271556 )
							ret := 0.200000
					if( ema3 > 12.3339 )
						if( ema12 <= -0.168752 )
							if( bbm <= 0.2955 )
								ret := 0.500000
							if( bbm > 0.2955 )
								ret := 1.000000 // buy
						if( ema12 > -0.168752 )
							ret := 0.250000
		if( ema13 > -0.246008 )
			if( bbm <= 0.028074 )
				if( ema13 <= -0.053995 )
					if( tema <= 6.83064 )
						if( ema2 <= 6.86339 )
							if( tema <= 5.10849 )
								if( tema <= 4.95876 )
									ret := 0.162162
								if( tema > 4.95876 )
									ret := 0.848485 // buy
							if( tema > 5.10849 )
								if( tema <= 5.20066 )
									ret := -0.575758
								if( tema > 5.20066 )
									ret := 0.101732
						if( ema2 > 6.86339 )
							if( ema2 <= 6.87941 )
								ret := -1.000000 // sell
							if( ema2 > 6.87941 )
								ret := -0.500000
					if( tema > 6.83064 )
						if( ema1 <= 6.90231 )
							ret := 1.000000 // buy
						if( ema1 > 6.90231 )
							if( tema <= 7.67929 )
								if( bbm <= 0.025465 )
									ret := -0.021739
								if( bbm > 0.025465 )
									ret := 0.444444
							if( tema > 7.67929 )
								if( ema2 <= 8.88343 )
									ret := 0.555556
								if( ema2 > 8.88343 )
									ret := 0.166667
				if( ema13 > -0.053995 )
					if( ema3 <= 4.57845 )
						if( tema <= 4.27316 )
							if( bbm <= 0.014447 )
								if( tema <= 3.89808 )
									ret := -0.750000 // sell
								if( tema > 3.89808 )
									ret := -0.047619
							if( bbm > 0.014447 )
								if( ema12 <= -0.021041 )
									ret := 0.440000
								if( ema12 > -0.021041 )
									ret := 0.058824
						if( tema > 4.27316 )
							if( ema12 <= -0.025008 )
								if( bbp <= -0.056748 )
									ret := 0.045455
								if( bbp > -0.056748 )
									ret := 0.750000 // buy
							if( ema12 > -0.025008 )
								if( tema <= 4.34278 )
									ret := -0.693548
								if( tema > 4.34278 )
									ret := -0.269231
					if( ema3 > 4.57845 )
						if( ema1 <= 5.15036 )
							if( bearPower <= -0.044499 )
								if( bbm <= 0.023052 )
									ret := 0.298246
								if( bbm > 0.023052 )
									ret := 0.761905 // buy
							if( bearPower > -0.044499 )
								if( bearPower <= -0.034375 )
									ret := 0.186047
								if( bearPower > -0.034375 )
									ret := -0.070588
						if( ema1 > 5.15036 )
							if( tema <= 5.62438 )
								if( tema <= 5.5157 )
									ret := -0.113269
								if( tema > 5.5157 )
									ret := -0.694444
							if( tema > 5.62438 )
								if( ema1 <= 6.05524 )
									ret := 0.156442
								if( ema1 > 6.05524 )
									ret := -0.035567
			if( bbm > 0.028074 )
				if( ema1 <= 5.35765 )
					if( bullPower <= -0.002878 )
						if( tema <= 4.56179 )
							if( ema1 <= 4.49868 )
								if( ema1 <= 4.41152 )
									ret := 0.151093
								if( ema1 > 4.41152 )
									ret := 0.727273 // buy
							if( ema1 > 4.49868 )
								if( bearPower <= -0.158214 )
									ret := -1.000000 // sell
								if( bearPower > -0.158214 )
									ret := -0.181818
						if( tema > 4.56179 )
							if( ema3 <= 4.84042 )
								if( ema13 <= -0.0366 )
									ret := 0.744186 // buy
								if( ema13 > -0.0366 )
									ret := 0.360000
							if( ema3 > 4.84042 )
								if( bullPower <= -0.010321 )
									ret := 0.282392
								if( bullPower > -0.010321 )
									ret := 0.573171
					if( bullPower > -0.002878 )
						if( ema3 <= 4.33474 )
							if( tema <= 3.81373 )
								if( ema1 <= 3.58714 )
									ret := 0.500000
								if( ema1 > 3.58714 )
									ret := -0.947368 // sell
							if( tema > 3.81373 )
								if( ema3 <= 4.1551 )
									ret := 0.285714
								if( ema3 > 4.1551 )
									ret := -0.578947
						if( ema3 > 4.33474 )
							if( ema2 <= 4.92434 )
								if( ema13 <= -0.030581 )
									ret := 0.521368
								if( ema13 > -0.030581 )
									ret := -0.136364
							if( ema2 > 4.92434 )
								if( ema13 <= -0.045508 )
									ret := -0.167598
								if( ema13 > -0.045508 )
									ret := 0.193750
				if( ema1 > 5.35765 )
					if( ema2 <= 5.59421 )
						if( bbm <= 0.0795 )
							if( ema3 <= 5.58491 )
								if( ema3 <= 5.56831 )
									ret := 0.068182
								if( ema3 > 5.56831 )
									ret := 0.730769 // buy
							if( ema3 > 5.58491 )
								if( ema13 <= -0.152108 )
									ret := 0.750000 // buy
								if( ema13 > -0.152108 )
									ret := -0.473684
						if( bbm > 0.0795 )
							if( ema13 <= -0.086469 )
								if( tema <= 5.29726 )
									ret := -0.100000
								if( tema > 5.29726 )
									ret := -0.863636 // sell
							if( ema13 > -0.086469 )
								if( bullPower <= -0.046035 )
									ret := 0.454545
								if( bullPower > -0.046035 )
									ret := -0.440000
					if( ema2 > 5.59421 )
						if( tema <= 5.63578 )
							if( ema13 <= -0.057639 )
								if( tema <= 5.48638 )
									ret := 0.173077
								if( tema > 5.48638 )
									ret := 0.600823
							if( ema13 > -0.057639 )
								if( bbp <= -0.088446 )
									ret := -0.301075
								if( bbp > -0.088446 )
									ret := 0.416667
						if( tema > 5.63578 )
							if( ema3 <= 6.7188 )
								if( tema <= 6.17321 )
									ret := 0.136501
								if( tema > 6.17321 )
									ret := -0.029425
							if( ema3 > 6.7188 )
								if( ema2 <= 6.82756 )
									ret := 0.472308
								if( ema2 > 6.82756 )
									ret := 0.124655
	if( ema12 > -0.015966 )
		if( ema3 <= 7.10365 )
			if( ema1 <= 3.59036 )
				if( bbp <= 0.113207 )
					if( bullPower <= 0.0619 )
						ret := 1.000000 // buy
					if( bullPower > 0.0619 )
						if( ema13 <= -0.022258 )
							ret := 1.000000 // buy
						if( ema13 > -0.022258 )
							ret := 0.750000 // buy
				if( bbp > 0.113207 )
					ret := 0.250000
			if( ema1 > 3.59036 )
				if( bbm <= 0.021144 )
					if( ema13 <= -0.000632 )
						if( ema13 <= -0.036049 )
							if( ema13 <= -0.050244 )
								ret := 1.000000 // buy
							if( ema13 > -0.050244 )
								if( bearPower <= -0.015768 )
									ret := 0.440000
								if( bearPower > -0.015768 )
									ret := 0.093750
						if( ema13 > -0.036049 )
							if( ema1 <= 3.88933 )
								if( bbp <= -0.008131 )
									ret := 0.541667
								if( bbp > -0.008131 )
									ret := 0.000000
							if( ema1 > 3.88933 )
								if( ema12 <= 0.007491 )
									ret := -0.028196
								if( ema12 > 0.007491 )
									ret := -0.750000 // sell
					if( ema13 > -0.000632 )
						if( ema3 <= 6.4495 )
							if( ema1 <= 6.45015 )
								if( tema <= 4.05366 )
									ret := 0.237762
								if( tema > 4.05366 )
									ret := 0.041483
							if( ema1 > 6.45015 )
								if( bbm <= 0.019144 )
									ret := 0.327586
								if( bbm > 0.019144 )
									ret := 0.866667 // buy
						if( ema3 > 6.4495 )
							if( ema1 <= 6.49047 )
								if( ema2 <= 6.47593 )
									ret := -0.298246
								if( ema2 > 6.47593 )
									ret := -0.833333 // sell
							if( ema1 > 6.49047 )
								if( tema <= 7.03281 )
									ret := -0.019123
								if( tema > 7.03281 )
									ret := -0.293333
				if( bbm > 0.021144 )
					if( ema1 <= 6.16181 )
						if( tema <= 6.20344 )
							if( bbp <= 0.224793 )
								if( tema <= 5.13824 )
									ret := 0.028200
								if( tema > 5.13824 )
									ret := 0.111857
							if( bbp > 0.224793 )
								if( ema2 <= 4.88434 )
									ret := 0.695652
								if( ema2 > 4.88434 )
									ret := 0.108747
						if( tema > 6.20344 )
							if( ema13 <= 0.080762 )
								if( bullPower <= 0.123683 )
									ret := -0.590909
								if( bullPower > 0.123683 )
									ret := 0.400000
							if( ema13 > 0.080762 )
								if( bearPower <= 0.086297 )
									ret := -0.681818
								if( bearPower > 0.086297 )
									ret := -1.000000 // sell
					if( ema1 > 6.16181 )
						if( ema3 <= 7.03672 )
							if( ema2 <= 6.18775 )
								if( ema3 <= 6.1587 )
									ret := -0.032200
								if( ema3 > 6.1587 )
									ret := -0.353365
							if( ema2 > 6.18775 )
								if( bearPower <= 0.004548 )
									ret := -0.003811
								if( bearPower > 0.004548 )
									ret := 0.065627
						if( ema3 > 7.03672 )
							if( ema12 <= -0.009965 )
								if( ema3 <= 7.08659 )
									ret := 0.362500
								if( ema3 > 7.08659 )
									ret := 0.984127 // buy
							if( ema12 > -0.009965 )
								if( ema2 <= 7.13916 )
									ret := 0.206816
								if( ema2 > 7.13916 )
									ret := -0.433962
		if( ema3 > 7.10365 )
			if( ema13 <= 0.810559 )
				if( ema13 <= 0.428395 )
					if( tema <= 12.4848 )
						if( tema <= 12.2883 )
							if( ema2 <= 12.0639 )
								if( bbm <= 0.084361 )
									ret := -0.058173
								if( bbm > 0.084361 )
									ret := 0.031585
							if( ema2 > 12.0639 )
								if( bbp <= -0.056843 )
									ret := 0.357143
								if( bbp > -0.056843 )
									ret := -0.568807
						if( tema > 12.2883 )
							if( ema1 <= 12.3625 )
								if( ema13 <= 0.013376 )
									ret := 0.291667
								if( ema13 > 0.013376 )
									ret := 0.923810 // buy
							if( ema1 > 12.3625 )
								if( ema3 <= 12.3705 )
									ret := -0.693878
								if( ema3 > 12.3705 )
									ret := 0.525424
					if( tema > 12.4848 )
						if( tema <= 13.7115 )
							if( ema1 <= 12.7636 )
								if( ema3 <= 12.5842 )
									ret := -0.324074
								if( ema3 > 12.5842 )
									ret := 0.170000
							if( ema1 > 12.7636 )
								if( bearPower <= -0.190197 )
									ret := 0.800000 // buy
								if( bearPower > -0.190197 )
									ret := -0.504087
						if( tema > 13.7115 )
							if( bbp <= 0.256914 )
								if( ema2 <= 14.2266 )
									ret := 0.215827
								if( ema2 > 14.2266 )
									ret := -0.137705
							if( bbp > 0.256914 )
								if( ema13 <= 0.237443 )
									ret := -0.727273 // sell
								if( ema13 > 0.237443 )
									ret := 0.250000
				if( ema13 > 0.428395 )
					if( tema <= 13.3535 )
						if( bbp <= 0.518152 )
							if( ema3 <= 11.1628 )
								if( bbm <= 0.156028 )
									ret := 0.947368 // buy
								if( bbm > 0.156028 )
									ret := 0.666667
							if( ema3 > 11.1628 )
								ret := 0.000000
						if( bbp > 0.518152 )
							if( ema1 <= 8.69561 )
								if( bearPower <= 0.393625 )
									ret := 0.750000 // buy
								if( bearPower > 0.393625 )
									ret := 1.000000 // buy
							if( ema1 > 8.69561 )
								if( bearPower <= 0.430633 )
									ret := -0.600000
								if( bearPower > 0.430633 )
									ret := 0.600000
					if( tema > 13.3535 )
						if( tema <= 16.0066 )
							if( bbp <= 1.18003 )
								if( bearPower <= 0.373782 )
									ret := 1.000000 // buy
								if( bearPower > 0.373782 )
									ret := 0.875000 // buy
							if( bbp > 1.18003 )
								ret := 0.600000
						if( tema > 16.0066 )
							ret := -0.500000
			if( ema13 > 0.810559 )
				if( bbm <= 1.29309 )
					if( bbm <= 0.57334 )
						ret := -1.000000 // sell
					if( bbm > 0.57334 )
						ret := -0.833333 // sell
				if( bbm > 1.29309 )
					ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_UNIUSDT_15Min_72b35435(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


