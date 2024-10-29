//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: PYPL_1Min_1B00_d055bd5a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1B00_d055bd5a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_d055bd5a(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= 0.060751 )
		if( bullPower <= -0.047335 )
			if( bbm <= 0.020014 )
				if( bbp <= -0.323145 )
					if( bbm <= 0.001069 )
						if( bearPower <= -0.242672 )
							if( bullPower <= -0.250584 )
								if( bbp <= -0.572382 )
									ret := 0.435294
								if( bbp > -0.572382 )
									ret := 0.887324 // buy
							if( bullPower > -0.250584 )
								if( bbp <= -0.492409 )
									ret := -0.875000 // sell
								if( bbp > -0.492409 )
									ret := 0.034483
						if( bearPower > -0.242672 )
							if( bearPower <= -0.200205 )
								if( bbp <= -0.47965 )
									ret := 0.636364
								if( bbp > -0.47965 )
									ret := 0.896000 // buy
							if( bearPower > -0.200205 )
								if( bullPower <= -0.193373 )
									ret := 0.000000
								if( bullPower > -0.193373 )
									ret := 0.744792 // buy
					if( bbm > 0.001069 )
						if( bullPower <= -0.220892 )
							if( bullPower <= -0.306337 )
								ret := 0.733333 // buy
							if( bullPower > -0.306337 )
								if( bbp <= -0.52814 )
									ret := 0.875000 // buy
								if( bbp > -0.52814 )
									ret := 1.000000 // buy
						if( bullPower > -0.220892 )
							if( bearPower <= -0.174352 )
								if( bbm <= 0.008891 )
									ret := -0.750000 // sell
								if( bbm > 0.008891 )
									ret := 0.041667
							if( bearPower > -0.174352 )
								ret := 1.000000 // buy
				if( bbp > -0.323145 )
					if( bbm <= 0.000115 )
						if( bullPower <= -0.133986 )
							if( bearPower <= -0.14273 )
								if( bullPower <= -0.160631 )
									ret := -0.925926 // sell
								if( bullPower > -0.160631 )
									ret := 0.391061
							if( bearPower > -0.14273 )
								if( bbp <= -0.270231 )
									ret := -0.529412
								if( bbp > -0.270231 )
									ret := 0.083333
						if( bullPower > -0.133986 )
							if( bearPower <= -0.123161 )
								if( bbp <= -0.265848 )
									ret := 0.400000
								if( bbp > -0.265848 )
									ret := 0.778443 // buy
							if( bearPower > -0.123161 )
								if( bullPower <= -0.079388 )
									ret := 0.311000
								if( bullPower > -0.079388 )
									ret := 0.461932
					if( bbm > 0.000115 )
						if( bearPower <= -0.069228 )
							if( bbp <= -0.314704 )
								ret := 0.857143 // buy
							if( bbp > -0.314704 )
								if( bbp <= -0.298228 )
									ret := -0.354839
								if( bbp > -0.298228 )
									ret := 0.187617
						if( bearPower > -0.069228 )
							if( bbp <= -0.1229 )
								if( bearPower <= -0.067966 )
									ret := 1.000000 // buy
								if( bearPower > -0.067966 )
									ret := 0.884615 // buy
							if( bbp > -0.1229 )
								if( bbp <= -0.11605 )
									ret := 0.085714
								if( bbp > -0.11605 )
									ret := 0.436620
			if( bbm > 0.020014 )
				if( bearPower <= -0.090245 )
					if( bullPower <= -0.05586 )
						if( bbp <= -0.280123 )
							if( bbp <= -0.304301 )
								if( bbp <= -0.327237 )
									ret := 0.050351
								if( bbp > -0.327237 )
									ret := -0.138393
							if( bbp > -0.304301 )
								if( bullPower <= -0.080844 )
									ret := 0.135246
								if( bullPower > -0.080844 )
									ret := 0.616071
						if( bbp > -0.280123 )
							if( bearPower <= -0.157738 )
								if( bbp <= -0.234615 )
									ret := -0.121145
								if( bbp > -0.234615 )
									ret := -0.469512
							if( bearPower > -0.157738 )
								if( bbp <= -0.214742 )
									ret := 0.126597
								if( bbp > -0.214742 )
									ret := -0.053444
					if( bullPower > -0.05586 )
						if( bearPower <= -0.109198 )
							if( bullPower <= -0.054446 )
								if( bbm <= 0.07995 )
									ret := 0.701299 // buy
								if( bbm > 0.07995 )
									ret := 0.285714
							if( bullPower > -0.054446 )
								if( bullPower <= -0.05211 )
									ret := -0.068376
								if( bullPower > -0.05211 )
									ret := 0.262391
						if( bearPower > -0.109198 )
							if( bullPower <= -0.048784 )
								if( bbp <= -0.158149 )
									ret := -0.722222 // sell
								if( bbp > -0.158149 )
									ret := -0.022727
							if( bullPower > -0.048784 )
								if( bbm <= 0.046257 )
									ret := 0.944444 // buy
								if( bbm > 0.046257 )
									ret := 0.266667
				if( bearPower > -0.090245 )
					if( bbp <= -0.136536 )
						if( bearPower <= -0.081876 )
							if( bullPower <= -0.049698 )
								if( bbm <= 0.02496 )
									ret := -0.941176 // sell
								if( bbm > 0.02496 )
									ret := -0.295082
							if( bullPower > -0.049698 )
								if( bullPower <= -0.048683 )
									ret := -0.733333 // sell
								if( bullPower > -0.048683 )
									ret := -0.933333 // sell
						if( bearPower > -0.081876 )
							ret := -0.941176 // sell
					if( bbp > -0.136536 )
						if( bullPower <= -0.052082 )
							if( bearPower <= -0.082325 )
								ret := 0.533333
							if( bearPower > -0.082325 )
								if( bearPower <= -0.080947 )
									ret := 0.125000
								if( bearPower > -0.080947 )
									ret := 0.307692
						if( bullPower > -0.052082 )
							if( bearPower <= -0.077989 )
								if( bullPower <= -0.051289 )
									ret := -0.920000 // sell
								if( bullPower > -0.051289 )
									ret := 0.155963
							if( bearPower > -0.077989 )
								if( bearPower <= -0.07695 )
									ret := -0.941176 // sell
								if( bearPower > -0.07695 )
									ret := -0.312500
		if( bullPower > -0.047335 )
			if( bbm <= 0.929211 )
				if( bbp <= -0.680449 )
					ret := -1.000000 // sell
				if( bbp > -0.680449 )
					if( bullPower <= -0.015578 )
						if( bbp <= -0.045947 )
							if( bbp <= -0.097449 )
								if( bbm <= 0.080456 )
									ret := -0.064411
								if( bbm > 0.080456 )
									ret := 0.088877
							if( bbp > -0.097449 )
								if( bbm <= 0.01005 )
									ret := 0.176415
								if( bbm > 0.01005 )
									ret := 0.015342
						if( bbp > -0.045947 )
							if( bbp <= -0.045514 )
								ret := 0.952381 // buy
							if( bbp > -0.045514 )
								if( bullPower <= -0.019729 )
									ret := 0.082305
								if( bullPower > -0.019729 )
									ret := 0.400000
					if( bullPower > -0.015578 )
						if( bbm <= 0.049899 )
							if( bullPower <= 0.005521 )
								if( bearPower <= -0.020088 )
									ret := -0.057957
								if( bearPower > -0.020088 )
									ret := 0.110223
							if( bullPower > 0.005521 )
								if( bbp <= 0.133062 )
									ret := -0.058870
								if( bbp > 0.133062 )
									ret := 0.126543
						if( bbm > 0.049899 )
							if( bearPower <= 0.056755 )
								if( bullPower <= 0.530568 )
									ret := 0.017488
								if( bullPower > 0.530568 )
									ret := -0.603175
							if( bearPower > 0.056755 )
								if( bbm <= 0.100932 )
									ret := 0.509009
								if( bbm > 0.100932 )
									ret := 0.126214
			if( bbm > 0.929211 )
				if( bbp <= -3.27527 )
					ret := -0.944444 // sell
				if( bbp > -3.27527 )
					if( bbm <= 1.06278 )
						if( bbp <= -0.429393 )
							ret := -0.300000
						if( bbp > -0.429393 )
							ret := 0.833333 // buy
					if( bbm > 1.06278 )
						ret := 1.000000 // buy
	if( bearPower > 0.060751 )
		if( bearPower <= 0.237829 )
			if( bbp <= 0.356621 )
				if( bbm <= 0.016947 )
					if( bbp <= 0.277633 )
						if( bullPower <= 0.071234 )
							if( bullPower <= 0.069095 )
								if( bullPower <= 0.068353 )
									ret := -0.219340
								if( bullPower > 0.068353 )
									ret := -0.958333 // sell
							if( bullPower > 0.069095 )
								if( bbp <= 0.138426 )
									ret := 0.846154 // buy
								if( bbp > 0.138426 )
									ret := 0.169492
						if( bullPower > 0.071234 )
							if( bullPower <= 0.075097 )
								if( bullPower <= 0.071889 )
									ret := -0.317073
								if( bullPower > 0.071889 )
									ret := -0.608889
							if( bullPower > 0.075097 )
								if( bbm <= 0.010394 )
									ret := -0.293520
								if( bbm > 0.010394 )
									ret := -0.716418 // sell
					if( bbp > 0.277633 )
						if( bbm <= 1e-05 )
							if( bearPower <= 0.164732 )
								if( bbp <= 0.319229 )
									ret := -0.682657
								if( bbp > 0.319229 )
									ret := -0.250000
							if( bearPower > 0.164732 )
								if( bearPower <= 0.174822 )
									ret := -0.844660 // sell
								if( bearPower > 0.174822 )
									ret := -0.428571
						if( bbm > 1e-05 )
							if( bbp <= 0.311903 )
								if( bbm <= 0.009333 )
									ret := 0.692308
								if( bbm > 0.009333 )
									ret := -0.230769
							if( bbp > 0.311903 )
								if( bbm <= 0.008973 )
									ret := -0.846154 // sell
								if( bbm > 0.008973 )
									ret := -0.470588
				if( bbm > 0.016947 )
					if( bearPower <= 0.110792 )
						if( bullPower <= 0.272193 )
							if( bullPower <= 0.246545 )
								if( bbm <= 0.030002 )
									ret := 0.081522
								if( bbm > 0.030002 )
									ret := -0.131871
							if( bullPower > 0.246545 )
								if( bearPower <= 0.062348 )
									ret := 0.133333
								if( bearPower > 0.062348 )
									ret := 0.730769 // buy
						if( bullPower > 0.272193 )
							ret := -1.000000 // sell
					if( bearPower > 0.110792 )
						if( bbp <= 0.320603 )
							if( bbp <= 0.310767 )
								if( bullPower <= 0.181858 )
									ret := -0.217765
								if( bullPower > 0.181858 )
									ret := -0.718750 // sell
							if( bbp > 0.310767 )
								if( bullPower <= 0.187761 )
									ret := -0.444444
								if( bullPower > 0.187761 )
									ret := 0.553191
						if( bbp > 0.320603 )
							if( bbp <= 0.353499 )
								if( bearPower <= 0.139045 )
									ret := -0.454545
								if( bearPower > 0.139045 )
									ret := -0.860465 // sell
							if( bbp > 0.353499 )
								if( bbm <= 0.064418 )
									ret := -0.454545
								if( bbm > 0.064418 )
									ret := 0.555556
			if( bbp > 0.356621 )
				if( bearPower <= 0.097324 )
					if( bbp <= 0.382713 )
						ret := -1.000000 // sell
					if( bbp > 0.382713 )
						if( bullPower <= 0.355784 )
							if( bbm <= 0.23614 )
								ret := -0.818182 // sell
							if( bbm > 0.23614 )
								if( bullPower <= 0.344591 )
									ret := 1.000000 // buy
								if( bullPower > 0.344591 )
									ret := 0.166667
						if( bullPower > 0.355784 )
							if( bbp <= 0.516403 )
								if( bearPower <= 0.07422 )
									ret := -0.631579
								if( bearPower > 0.07422 )
									ret := -1.000000 // sell
							if( bbp > 0.516403 )
								if( bbm <= 0.383732 )
									ret := 0.400000
								if( bbm > 0.383732 )
									ret := -0.357143
				if( bearPower > 0.097324 )
					if( bearPower <= 0.134375 )
						if( bbp <= 0.465758 )
							if( bullPower <= 0.329057 )
								if( bullPower <= 0.311343 )
									ret := 0.345946
								if( bullPower > 0.311343 )
									ret := -0.444444
							if( bullPower > 0.329057 )
								ret := 1.000000 // buy
						if( bbp > 0.465758 )
							if( bbp <= 0.502422 )
								if( bullPower <= 0.361873 )
									ret := -0.818182 // sell
								if( bullPower > 0.361873 )
									ret := -1.000000 // sell
							if( bbp > 0.502422 )
								if( bearPower <= 0.113626 )
									ret := -0.428571
								if( bearPower > 0.113626 )
									ret := 0.789474 // buy
					if( bearPower > 0.134375 )
						if( bullPower <= 0.251354 )
							if( bbp <= 0.375157 )
								if( bullPower <= 0.226597 )
									ret := 0.141975
								if( bullPower > 0.226597 )
									ret := -0.772727 // sell
							if( bbp > 0.375157 )
								if( bullPower <= 0.21334 )
									ret := -0.573643
								if( bullPower > 0.21334 )
									ret := -0.343333
						if( bullPower > 0.251354 )
							if( bullPower <= 0.446193 )
								if( bbm <= 0.12005 )
									ret := -0.215947
								if( bbm > 0.12005 )
									ret := 0.153453
							if( bullPower > 0.446193 )
								if( bbp <= 0.691314 )
									ret := -0.812500 // sell
								if( bbp > 0.691314 )
									ret := -0.170455
		if( bearPower > 0.237829 )
			if( bullPower <= 0.294788 )
				if( bbp <= 0.531731 )
					if( bullPower <= 0.269603 )
						if( bearPower <= 0.260829 )
							if( bullPower <= 0.244334 )
								ret := -0.312500
							if( bullPower > 0.244334 )
								if( bullPower <= 0.2477 )
									ret := 0.611111
								if( bullPower > 0.2477 )
									ret := -0.038462
						if( bearPower > 0.260829 )
							ret := -0.900000 // sell
					if( bullPower > 0.269603 )
						ret := 0.846154 // buy
				if( bbp > 0.531731 )
					if( bbp <= 0.565232 )
						if( bullPower <= 0.277109 )
							if( bearPower <= 0.267737 )
								ret := -0.800000 // sell
							if( bearPower > 0.267737 )
								ret := -1.000000 // sell
						if( bullPower > 0.277109 )
							ret := -0.692308
					if( bbp > 0.565232 )
						ret := -1.000000 // sell
			if( bullPower > 0.294788 )
				if( bbp <= 0.681331 )
					if( bullPower <= 0.377239 )
						if( bbp <= 0.586051 )
							if( bbm <= 0.090373 )
								ret := 0.800000 // buy
							if( bbm > 0.090373 )
								ret := 1.000000 // buy
						if( bbp > 0.586051 )
							if( bullPower <= 0.335363 )
								if( bullPower <= 0.327077 )
									ret := -0.242424
								if( bullPower > 0.327077 )
									ret := 0.800000 // buy
							if( bullPower > 0.335363 )
								if( bearPower <= 0.258949 )
									ret := -1.000000 // sell
								if( bearPower > 0.258949 )
									ret := -0.428571
					if( bullPower > 0.377239 )
						if( bbp <= 0.671829 )
							if( bbm <= 0.135713 )
								if( bbm <= 0.129425 )
									ret := 0.428571
								if( bbm > 0.129425 )
									ret := 0.588235
							if( bbm > 0.135713 )
								if( bearPower <= 0.247502 )
									ret := 0.833333 // buy
								if( bearPower > 0.247502 )
									ret := 1.000000 // buy
						if( bbp > 0.671829 )
							if( bbp <= 0.680023 )
								ret := 0.400000
							if( bbp > 0.680023 )
								ret := 0.312500
				if( bbp > 0.681331 )
					if( bbm <= 0.153031 )
						if( bullPower <= 0.401656 )
							if( bbp <= 0.756241 )
								if( bearPower <= 0.353736 )
									ret := -0.700000 // sell
								if( bearPower > 0.353736 )
									ret := -0.111111
							if( bbp > 0.756241 )
								if( bbp <= 0.776533 )
									ret := 0.928571 // buy
								if( bbp > 0.776533 )
									ret := 1.000000 // buy
						if( bullPower > 0.401656 )
							if( bearPower <= 0.447036 )
								if( bbp <= 0.723729 )
									ret := -0.952381 // sell
								if( bbp > 0.723729 )
									ret := -0.694444
							if( bearPower > 0.447036 )
								if( bullPower <= 0.612503 )
									ret := 0.396226
								if( bullPower > 0.612503 )
									ret := -0.833333 // sell
					if( bbm > 0.153031 )
						if( bearPower <= 0.246389 )
							ret := -0.833333 // sell
						if( bearPower > 0.246389 )
							if( bbp <= 0.785012 )
								if( bbp <= 0.745314 )
									ret := 0.297297
								if( bbp > 0.745314 )
									ret := 1.000000 // buy
							if( bbp > 0.785012 )
								if( bearPower <= 0.315539 )
									ret := -0.282051
								if( bearPower > 0.315539 )
									ret := 0.152000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_d055bd5a(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


