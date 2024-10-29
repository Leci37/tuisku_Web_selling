//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: VETUSDT_30Min_1B00_f6301c4d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1B00_f6301c4d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_f6301c4d(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.000498 )
		if( bearPower <= -0.016128 )
			if( bbm <= 0.012433 )
				if( bullPower <= -0.007224 )
					if( bullPower <= -0.009718 )
						ret := 0.200000
					if( bullPower > -0.009718 )
						ret := 1.000000 // buy
				if( bullPower > -0.007224 )
					ret := -0.285714
			if( bbm > 0.012433 )
				if( bearPower <= -0.020886 )
					if( bbp <= -0.027482 )
						if( bullPower <= -0.008237 )
							if( bullPower <= -0.00946 )
								ret := 0.857143 // buy
							if( bullPower > -0.00946 )
								ret := -0.250000
						if( bullPower > -0.008237 )
							if( bbp <= -0.033114 )
								ret := 0.600000
							if( bbp > -0.033114 )
								if( bearPower <= -0.023238 )
									ret := 1.000000 // buy
								if( bearPower > -0.023238 )
									ret := 0.875000 // buy
					if( bbp > -0.027482 )
						ret := 0.000000
				if( bearPower > -0.020886 )
					if( bearPower <= -0.016813 )
						ret := 1.000000 // buy
					if( bearPower > -0.016813 )
						ret := 0.750000 // buy
		if( bearPower > -0.016128 )
			if( bullPower <= -0.000502 )
				if( bearPower <= -0.001027 )
					if( bbm <= 0.00179 )
						if( bbm <= 0.000932 )
							if( bbp <= -0.002951 )
								if( bbp <= -0.003093 )
									ret := -0.022556
								if( bbp > -0.003093 )
									ret := -0.531250
							if( bbp > -0.002951 )
								if( bbm <= 0.000448 )
									ret := -0.113821
								if( bbm > 0.000448 )
									ret := 0.200387
						if( bbm > 0.000932 )
							if( bbm <= 0.000999 )
								if( bbp <= -0.00517 )
									ret := -0.500000
								if( bbp > -0.00517 )
									ret := 0.622857
							if( bbm > 0.000999 )
								if( bbp <= -0.003209 )
									ret := 0.331781
								if( bbp > -0.003209 )
									ret := 0.111258
					if( bbm > 0.00179 )
						if( bbp <= -0.005153 )
							if( bullPower <= -0.001607 )
								if( bbp <= -0.013538 )
									ret := 0.405263
								if( bbp > -0.013538 )
									ret := 0.022222
							if( bullPower > -0.001607 )
								if( bbm <= 0.006753 )
									ret := 0.304000
								if( bbm > 0.006753 )
									ret := 0.720000 // buy
						if( bbp > -0.005153 )
							if( bbp <= -0.004866 )
								if( bearPower <= -0.004276 )
									ret := 0.000000
								if( bearPower > -0.004276 )
									ret := -0.540816
							if( bbp > -0.004866 )
								if( bullPower <= -0.000706 )
									ret := 0.156600
								if( bullPower > -0.000706 )
									ret := -0.194570
				if( bearPower > -0.001027 )
					if( bbm <= 0.00028 )
						if( bbm <= 0.000207 )
							if( bbm <= 0.000182 )
								if( bbm <= 0.000125 )
									ret := 0.750000 // buy
								if( bbm > 0.000125 )
									ret := 0.142857
							if( bbm > 0.000182 )
								if( bullPower <= -0.000578 )
									ret := 0.500000
								if( bullPower > -0.000578 )
									ret := 1.000000 // buy
						if( bbm > 0.000207 )
							if( bullPower <= -0.00051 )
								if( bullPower <= -0.000522 )
									ret := 0.135135
								if( bullPower > -0.000522 )
									ret := 0.750000 // buy
							if( bullPower > -0.00051 )
								ret := -0.400000
					if( bbm > 0.00028 )
						if( bbp <= -0.001657 )
							ret := -0.400000
						if( bbp > -0.001657 )
							if( bullPower <= -0.000551 )
								if( bbm <= 0.000417 )
									ret := 0.875000 // buy
								if( bbm > 0.000417 )
									ret := 0.333333
							if( bullPower > -0.000551 )
								if( bbm <= 0.000451 )
									ret := 0.288462
								if( bbm > 0.000451 )
									ret := 0.800000 // buy
			if( bullPower > -0.000502 )
				if( bearPower <= -0.000867 )
					if( bearPower <= -0.000924 )
						if( bullPower <= -0.00016 )
							if( bbm <= 0.000569 )
								if( bbp <= -0.001327 )
									ret := 0.172131
								if( bbp > -0.001327 )
									ret := 0.931034 // buy
							if( bbm > 0.000569 )
								if( bbp <= -0.001328 )
									ret := 0.042211
								if( bbp > -0.001328 )
									ret := -0.175978
						if( bullPower > -0.00016 )
							if( bearPower <= -0.005264 )
								if( bullPower <= 0.000255 )
									ret := -0.607143
								if( bullPower > 0.000255 )
									ret := -0.044872
							if( bearPower > -0.005264 )
								if( bbp <= -0.00379 )
									ret := 0.618182
								if( bbp > -0.00379 )
									ret := 0.133481
					if( bearPower > -0.000924 )
						if( bullPower <= -2.5e-05 )
							if( bbp <= -0.001104 )
								if( bullPower <= -0.000257 )
									ret := -0.456000
								if( bullPower > -0.000257 )
									ret := 0.428571
							if( bbp > -0.001104 )
								if( bullPower <= -0.000203 )
									ret := -0.200000
								if( bullPower > -0.000203 )
									ret := -0.575472
						if( bullPower > -2.5e-05 )
							if( bearPower <= -0.000885 )
								if( bbm <= 0.00097 )
									ret := 0.631579
								if( bbm > 0.00097 )
									ret := -0.066667
							if( bearPower > -0.000885 )
								if( bbp <= -0.000738 )
									ret := -0.510638
								if( bbp > -0.000738 )
									ret := -0.090909
				if( bearPower > -0.000867 )
					if( bbp <= -0.000509 )
						if( bearPower <= -0.000755 )
							if( bbp <= -0.001064 )
								if( bbm <= 0.000305 )
									ret := -0.727273 // sell
								if( bbm > 0.000305 )
									ret := 0.133144
							if( bbp > -0.001064 )
								if( bbp <= -0.001047 )
									ret := 0.880000 // buy
								if( bbp > -0.001047 )
									ret := 0.263447
						if( bearPower > -0.000755 )
							if( bbm <= 0.000669 )
								if( bullPower <= -0.000332 )
									ret := 0.274648
								if( bullPower > -0.000332 )
									ret := 0.094628
							if( bbm > 0.000669 )
								if( bbm <= 0.000829 )
									ret := -0.262687
								if( bbm > 0.000829 )
									ret := 0.310811
					if( bbp > -0.000509 )
						if( bearPower <= -0.000557 )
							if( bullPower <= 0.000241 )
								if( bearPower <= -0.000699 )
									ret := -0.250000
								if( bearPower > -0.000699 )
									ret := 0.700000 // buy
							if( bullPower > 0.000241 )
								ret := 1.000000 // buy
						if( bearPower > -0.000557 )
							if( bearPower <= -0.00055 )
								ret := -1.000000 // sell
							if( bearPower > -0.00055 )
								if( bullPower <= -0.000123 )
									ret := 0.500000
								if( bullPower > -0.000123 )
									ret := 0.271845
	if( bbp > -0.000498 )
		if( bearPower <= 0.003536 )
			if( bbm <= 0.000123 )
				if( bbp <= -0.000388 )
					if( bullPower <= -0.000182 )
						if( bbm <= 9e-05 )
							if( bullPower <= -0.000205 )
								ret := 0.400000
							if( bullPower > -0.000205 )
								if( bearPower <= -0.000273 )
									ret := 0.000000
								if( bearPower > -0.000273 )
									ret := -0.272727
						if( bbm > 9e-05 )
							if( bbp <= -0.000474 )
								if( bearPower <= -0.000292 )
									ret := -0.450000
								if( bearPower > -0.000292 )
									ret := 0.500000
							if( bbp > -0.000474 )
								ret := -1.000000 // sell
					if( bullPower > -0.000182 )
						if( bullPower <= -0.000175 )
							if( bbp <= -0.000436 )
								if( bearPower <= -0.000295 )
									ret := 0.250000
								if( bearPower > -0.000295 )
									ret := 0.857143 // buy
							if( bbp > -0.000436 )
								ret := 0.000000
						if( bullPower > -0.000175 )
							if( bbm <= 0.00012 )
								if( bullPower <= -0.000146 )
									ret := 0.388889
								if( bullPower > -0.000146 )
									ret := -0.090909
							if( bbm > 0.00012 )
								if( bearPower <= -0.000261 )
									ret := -0.178571
								if( bearPower > -0.000261 )
									ret := 0.571429
				if( bbp > -0.000388 )
					if( bbp <= 0.000521 )
						if( bullPower <= 0.000118 )
							if( bullPower <= 6.8e-05 )
								if( bearPower <= -8e-05 )
									ret := -0.033751
								if( bearPower > -8e-05 )
									ret := 0.009818
							if( bullPower > 6.8e-05 )
								if( bearPower <= -3e-05 )
									ret := -0.177215
								if( bearPower > -3e-05 )
									ret := -0.040313
						if( bullPower > 0.000118 )
							if( bbp <= 0.000378 )
								if( bullPower <= 0.000213 )
									ret := 0.033427
								if( bullPower > 0.000213 )
									ret := 0.145907
							if( bbp > 0.000378 )
								if( bearPower <= 0.000134 )
									ret := -0.542857
								if( bearPower > 0.000134 )
									ret := -0.072948
					if( bbp > 0.000521 )
						if( bearPower <= 0.000212 )
							if( bullPower <= 0.000324 )
								if( bbm <= 0.000111 )
									ret := 0.500000
								if( bbm > 0.000111 )
									ret := 1.000000 // buy
							if( bullPower > 0.000324 )
								ret := 0.200000
						if( bearPower > 0.000212 )
							if( bullPower <= 0.000634 )
								if( bullPower <= 0.000473 )
									ret := 0.062500
								if( bullPower > 0.000473 )
									ret := 0.571429
							if( bullPower > 0.000634 )
								ret := -1.000000 // sell
			if( bbm > 0.000123 )
				if( bullPower <= 6.8e-05 )
					if( bearPower <= -0.000403 )
						if( bearPower <= -0.000528 )
							if( bearPower <= -0.000534 )
								if( bbm <= 0.000592 )
									ret := -0.200000
								if( bbm > 0.000592 )
									ret := 0.473684
							if( bearPower > -0.000534 )
								if( bullPower <= 4.6e-05 )
									ret := 0.500000
								if( bullPower > 4.6e-05 )
									ret := 1.000000 // buy
						if( bearPower > -0.000528 )
							if( bbm <= 0.00048 )
								if( bbm <= 0.000443 )
									ret := -0.196154
								if( bbm > 0.000443 )
									ret := 0.142857
							if( bbm > 0.00048 )
								if( bbm <= 0.000499 )
									ret := -0.743590 // sell
								if( bbm > 0.000499 )
									ret := -0.234899
					if( bearPower > -0.000403 )
						if( bbm <= 0.00043 )
							if( bbp <= -0.000357 )
								if( bullPower <= -0.000112 )
									ret := -0.024390
								if( bullPower > -0.000112 )
									ret := 0.130372
							if( bbp > -0.000357 )
								if( bbp <= -0.000251 )
									ret := -0.051643
								if( bbp > -0.000251 )
									ret := 0.021311
						if( bbm > 0.00043 )
							if( bullPower <= 5.3e-05 )
								ret := 0.000000
							if( bullPower > 5.3e-05 )
								if( bbm <= 0.00046 )
									ret := 0.947368 // buy
								if( bbm > 0.00046 )
									ret := 0.600000
				if( bullPower > 6.8e-05 )
					if( bearPower <= -0.000601 )
						if( bbm <= 0.001394 )
							if( bullPower <= 0.000548 )
								if( bbp <= -0.000322 )
									ret := 0.253555
								if( bbp > -0.000322 )
									ret := -0.080402
							if( bullPower > 0.000548 )
								if( bbm <= 0.001263 )
									ret := 0.100000
								if( bbm > 0.001263 )
									ret := 0.784091 // buy
						if( bbm > 0.001394 )
							if( bbp <= -0.000349 )
								if( bbm <= 0.00337 )
									ret := -0.443787
								if( bbm > 0.00337 )
									ret := 0.846154 // buy
							if( bbp > -0.000349 )
								if( bbp <= 0.004238 )
									ret := 0.093521
								if( bbp > 0.004238 )
									ret := 0.545455
					if( bearPower > -0.000601 )
						if( bearPower <= -0.000595 )
							if( bbm <= 0.000814 )
								if( bbm <= 0.000758 )
									ret := -0.625000
								if( bbm > 0.000758 )
									ret := 0.666667
							if( bbm > 0.000814 )
								if( bbp <= -0.000178 )
									ret := -0.913043 // sell
								if( bbp > -0.000178 )
									ret := -0.285714
						if( bearPower > -0.000595 )
							if( bullPower <= 0.004118 )
								if( bullPower <= 0.00286 )
									ret := 0.037451
								if( bullPower > 0.00286 )
									ret := 0.145805
							if( bullPower > 0.004118 )
								if( bullPower <= 0.004599 )
									ret := -0.325301
								if( bullPower > 0.004599 )
									ret := 0.006024
		if( bearPower > 0.003536 )
			if( bullPower <= 0.006484 )
				if( bullPower <= 0.006016 )
					ret := -0.500000
				if( bullPower > 0.006016 )
					if( bullPower <= 0.006232 )
						ret := -1.000000 // sell
					if( bullPower > 0.006232 )
						ret := -0.714286 // sell
			if( bullPower > 0.006484 )
				if( bbp <= 0.010578 )
					ret := 1.000000 // buy
				if( bbp > 0.010578 )
					if( bbp <= 0.019028 )
						if( bearPower <= 0.004262 )
							if( bearPower <= 0.004153 )
								if( bbm <= 0.003439 )
									ret := -0.812500 // sell
								if( bbm > 0.003439 )
									ret := -0.138462
							if( bearPower > 0.004153 )
								if( bullPower <= 0.008932 )
									ret := 1.000000 // buy
								if( bullPower > 0.008932 )
									ret := 0.000000
						if( bearPower > 0.004262 )
							if( bbp <= 0.013066 )
								if( bullPower <= 0.008112 )
									ret := -0.565217
								if( bullPower > 0.008112 )
									ret := 1.000000 // buy
							if( bbp > 0.013066 )
								if( bullPower <= 0.008824 )
									ret := -1.000000 // sell
								if( bullPower > 0.008824 )
									ret := -0.658537
					if( bbp > 0.019028 )
						if( bbp <= 0.020572 )
							if( bullPower <= 0.014683 )
								if( bbp <= 0.019289 )
									ret := 0.500000
								if( bbp > 0.019289 )
									ret := 0.923077 // buy
							if( bullPower > 0.014683 )
								if( bearPower <= 0.004842 )
									ret := 0.600000
								if( bearPower > 0.004842 )
									ret := 0.000000
						if( bbp > 0.020572 )
							if( bullPower <= 0.027239 )
								if( bbp <= 0.021294 )
									ret := -1.000000 // sell
								if( bbp > 0.021294 )
									ret := -0.101695
							if( bullPower > 0.027239 )
								if( bbm <= 0.016971 )
									ret := -0.888889 // sell
								if( bbm > 0.016971 )
									ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_VETUSDT_30Min_f6301c4d(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


