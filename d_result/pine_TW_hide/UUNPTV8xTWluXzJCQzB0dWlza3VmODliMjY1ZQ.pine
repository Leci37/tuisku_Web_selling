//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: QCOM_1Min_2BC0_f89b265e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2BC0_f89b265e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_f89b265e(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.539177 )
		if( bullPower <= -0.298244 )
			if( mf <= 0.150462 )
				if( bbm <= 0.001307 )
					if( ad_mf <= 0.322746 )
						if( ad_mf <= 0.153564 )
							if( bbp <= -1.74041 )
								if( mf <= -0.003966 )
									ret := 0.725490 // buy
								if( mf > -0.003966 )
									ret := -0.420290
							if( bbp > -1.74041 )
								if( bullPower <= -0.562627 )
									ret := 0.559322
								if( bullPower > -0.562627 )
									ret := 0.290254
						if( ad_mf > 0.153564 )
							if( bbp <= -1.4251 )
								if( bearPower <= -0.819686 )
									ret := 0.047619
								if( bearPower > -0.819686 )
									ret := 0.545455
							if( bbp > -1.4251 )
								if( mf <= -0.183657 )
									ret := -0.147959
								if( mf > -0.183657 )
									ret := -0.539474
					if( ad_mf > 0.322746 )
						if( bearPower <= -1.00211 )
							if( ad_mf <= 0.476318 )
								if( mf <= -0.410552 )
									ret := 0.600000
								if( mf > -0.410552 )
									ret := 1.000000 // buy
							if( ad_mf > 0.476318 )
								ret := 1.000000 // buy
						if( bearPower > -1.00211 )
							if( bearPower <= -0.422573 )
								if( bbp <= -1.04559 )
									ret := 0.541667
								if( bbp > -1.04559 )
									ret := 0.049180
							if( bearPower > -0.422573 )
								if( mf <= -0.361686 )
									ret := 0.602151
								if( mf > -0.361686 )
									ret := 0.937500 // buy
				if( bbm > 0.001307 )
					if( mf <= -0.053776 )
						if( ad <= -19950.2 )
							if( bbm <= 0.2501 )
								if( ad_mf <= -57955.6 )
									ret := -0.571429
								if( ad_mf > -57955.6 )
									ret := 0.272727
							if( bbm > 0.2501 )
								if( ad_mf <= -50843.3 )
									ret := 0.075472
								if( ad_mf > -50843.3 )
									ret := -0.256329
						if( ad > -19950.2 )
							if( bbm <= 0.294771 )
								if( mf <= -0.160297 )
									ret := 0.029647
								if( mf > -0.160297 )
									ret := -0.151163
							if( bbm > 0.294771 )
								if( ad <= -17841.5 )
									ret := 0.708333 // buy
								if( ad > -17841.5 )
									ret := 0.125919
					if( mf > -0.053776 )
						if( ad_mf <= 10983.2 )
							if( bearPower <= -1.10465 )
								if( bullPower <= -2.95734 )
									ret := -1.000000 // sell
								if( bullPower > -2.95734 )
									ret := 0.637168
							if( bearPower > -1.10465 )
								if( ad_mf <= -33979.6 )
									ret := 0.866667 // buy
								if( ad_mf > -33979.6 )
									ret := 0.151210
						if( ad_mf > 10983.2 )
							if( ad <= 46806.9 )
								if( ad <= 11210.3 )
									ret := -1.000000 // sell
								if( ad > 11210.3 )
									ret := -0.182540
							if( ad > 46806.9 )
								if( ad_mf <= 137849 )
									ret := 0.750000 // buy
								if( ad_mf > 137849 )
									ret := -0.500000
			if( mf > 0.150462 )
				if( ad_mf <= -0.250384 )
					if( ad_mf <= -626 )
						if( bearPower <= -1.30722 )
							ret := 1.000000 // buy
						if( bearPower > -1.30722 )
							if( mf <= 0.163867 )
								if( mf <= 0.158149 )
									ret := 0.400000
								if( mf > 0.158149 )
									ret := 1.000000 // buy
							if( mf > 0.163867 )
								if( bearPower <= -0.407437 )
									ret := -0.044444
								if( bearPower > -0.407437 )
									ret := 0.800000 // buy
					if( ad_mf > -626 )
						if( ad_mf <= -0.700407 )
							if( bullPower <= -0.735117 )
								ret := 0.250000
							if( bullPower > -0.735117 )
								if( bbp <= -0.713222 )
									ret := 1.000000 // buy
								if( bbp > -0.713222 )
									ret := 0.818182 // buy
						if( ad_mf > -0.700407 )
							if( ad_mf <= -0.456983 )
								if( bullPower <= -0.714721 )
									ret := 0.928571 // buy
								if( bullPower > -0.714721 )
									ret := 0.301887
							if( ad_mf > -0.456983 )
								if( bearPower <= -0.376623 )
									ret := 0.784314 // buy
								if( bearPower > -0.376623 )
									ret := 0.527778
				if( ad_mf > -0.250384 )
					if( bullPower <= -1.28542 )
						if( mf <= 0.228464 )
							ret := -1.000000 // sell
						if( mf > 0.228464 )
							ret := 0.666667
					if( bullPower > -1.28542 )
						if( bbm <= 0.740055 )
							if( mf <= 0.199536 )
								if( mf <= 0.161526 )
									ret := 0.333333
								if( mf > 0.161526 )
									ret := 0.741573 // buy
							if( mf > 0.199536 )
								if( bbm <= 0.264418 )
									ret := 0.023529
								if( bbm > 0.264418 )
									ret := 0.735294 // buy
						if( bbm > 0.740055 )
							if( bullPower <= -0.402064 )
								ret := -1.000000 // sell
							if( bullPower > -0.402064 )
								ret := -0.142857
		if( bullPower > -0.298244 )
			if( bearPower <= 0.20125 )
				if( mf <= -0.270308 )
					if( bbm <= 0.876049 )
						if( mf <= -0.608848 )
							if( ad <= 1328.3 )
								if( mf <= -0.650716 )
									ret := 0.195122
								if( mf > -0.650716 )
									ret := 0.399015
							if( ad > 1328.3 )
								if( bbm <= 0.462621 )
									ret := 0.121212
								if( bbm > 0.462621 )
									ret := -0.750000 // sell
						if( mf > -0.608848 )
							if( bbm <= 0.444453 )
								if( BBPower_Color <= 0.5 )
									ret := 0.143838
								if( BBPower_Color > 0.5 )
									ret := 0.029263
							if( bbm > 0.444453 )
								if( ad <= -97455.5 )
									ret := 0.666667
								if( ad > -97455.5 )
									ret := -0.064050
					if( bbm > 0.876049 )
						if( ad <= 52.4443 )
							if( bullPower <= 2.17105 )
								if( bullPower <= 0.957489 )
									ret := 0.551136
								if( bullPower > 0.957489 )
									ret := 0.914286 // buy
							if( bullPower > 2.17105 )
								ret := -0.400000
						if( ad > 52.4443 )
							if( bbm <= 1.4275 )
								if( bullPower <= -0.019415 )
									ret := -1.000000 // sell
								if( bullPower > -0.019415 )
									ret := 0.161290
							if( bbm > 1.4275 )
								if( mf <= -0.281231 )
									ret := -1.000000 // sell
								if( mf > -0.281231 )
									ret := -0.750000 // sell
				if( mf > -0.270308 )
					if( bearPower <= -0.280264 )
						if( bbp <= -0.929864 )
							if( ad_mf <= 10496.3 )
								if( ad <= -8279.15 )
									ret := 0.136364
								if( ad > -8279.15 )
									ret := 0.509317
							if( ad_mf > 10496.3 )
								if( ad_mf <= 89989.5 )
									ret := -0.311321
								if( ad_mf > 89989.5 )
									ret := 0.448276
						if( bbp > -0.929864 )
							if( ad <= -8862.41 )
								if( ad_mf <= -150560 )
									ret := -0.666667
								if( ad_mf > -150560 )
									ret := 0.050290
							if( ad > -8862.41 )
								if( ad <= -8488.36 )
									ret := -0.443038
								if( ad > -8488.36 )
									ret := -0.031241
					if( bearPower > -0.280264 )
						if( bullPower <= -0.245189 )
							if( ad_mf <= -0.302699 )
								if( mf <= 0.714682 )
									ret := 0.514286
								if( mf > 0.714682 )
									ret := 1.000000 // buy
							if( ad_mf > -0.302699 )
								if( mf <= 0.145089 )
									ret := 0.339286
								if( mf > 0.145089 )
									ret := -0.629630
						if( bullPower > -0.245189 )
							if( bullPower <= 0.216087 )
								if( mf <= -0.073202 )
									ret := 0.008915
								if( mf > -0.073202 )
									ret := 0.062328
							if( bullPower > 0.216087 )
								if( ad <= 163.294 )
									ret := 0.127680
								if( ad > 163.294 )
									ret := 0.059256
			if( bearPower > 0.20125 )
				if( bbm <= 0.00889 )
					if( mf <= 0.958171 )
						if( bullPower <= 0.50459 )
							if( bearPower <= 0.492884 )
								if( mf <= 0.137847 )
									ret := -0.104050
								if( mf > 0.137847 )
									ret := -0.272000
							if( bearPower > 0.492884 )
								if( mf <= 7.3e-05 )
									ret := -0.777778 // sell
								if( mf > 7.3e-05 )
									ret := 0.307692
						if( bullPower > 0.50459 )
							if( mf <= -0.154498 )
								if( ad_mf <= 0.619474 )
									ret := -0.560000
								if( ad_mf > 0.619474 )
									ret := 0.428571
							if( mf > -0.154498 )
								if( bbp <= 1.06503 )
									ret := 0.600000
								if( bbp > 1.06503 )
									ret := 0.285714
					if( mf > 0.958171 )
						ret := 1.000000 // buy
				if( bbm > 0.00889 )
					if( ad <= 443.119 )
						if( bullPower <= 0.936686 )
							if( bullPower <= 0.775827 )
								if( ad_mf <= -452.728 )
									ret := 0.087730
								if( ad_mf > -452.728 )
									ret := 0.291498
							if( bullPower > 0.775827 )
								if( bbm <= 0.623512 )
									ret := 0.397260
								if( bbm > 0.623512 )
									ret := -0.600000
						if( bullPower > 0.936686 )
							if( bbm <= 0.738501 )
								if( ad_mf <= -95185.4 )
									ret := 0.500000
								if( ad_mf > -95185.4 )
									ret := -0.553846
							if( bbm > 0.738501 )
								if( ad_mf <= -40940.8 )
									ret := -0.687500
								if( ad_mf > -40940.8 )
									ret := 0.193548
					if( ad > 443.119 )
						if( ad_mf <= 698.618 )
							if( ad <= 666.435 )
								if( mf <= 0.145871 )
									ret := -0.014085
								if( mf > 0.145871 )
									ret := -0.480000
							if( ad > 666.435 )
								if( bbm <= 0.106852 )
									ret := -0.250000
								if( bbm > 0.106852 )
									ret := -0.937500 // sell
						if( ad_mf > 698.618 )
							if( ad <= 985.11 )
								if( ad <= 942.312 )
									ret := 0.130435
								if( ad > 942.312 )
									ret := 0.827586 // buy
							if( ad > 985.11 )
								if( ad_mf <= 3662.94 )
									ret := -0.168576
								if( ad_mf > 3662.94 )
									ret := 0.011952
	if( bearPower > 0.539177 )
		if( bullPower <= 2.32575 )
			if( mf <= -0.858435 )
				if( bearPower <= 1.05566 )
					if( mf <= -0.961274 )
						ret := -0.250000
					if( mf > -0.961274 )
						ret := 1.000000 // buy
				if( bearPower > 1.05566 )
					ret := -0.750000 // sell
			if( mf > -0.858435 )
				if( bbp <= 1.29995 )
					if( bbp <= 1.16864 )
						if( bearPower <= 0.567528 )
							if( bearPower <= 0.540634 )
								ret := -1.000000 // sell
							if( bearPower > 0.540634 )
								if( mf <= -0.373472 )
									ret := -1.000000 // sell
								if( mf > -0.373472 )
									ret := -0.267606
						if( bearPower > 0.567528 )
							if( mf <= 0.044659 )
								if( mf <= -0.12356 )
									ret := 0.500000
								if( mf > -0.12356 )
									ret := 0.750000 // buy
							if( mf > 0.044659 )
								if( ad_mf <= -0.225766 )
									ret := 0.357143
								if( ad_mf > -0.225766 )
									ret := -0.250000
					if( bbp > 1.16864 )
						if( bbm <= 0.017961 )
							if( ad_mf <= -0.073632 )
								if( ad_mf <= -0.151719 )
									ret := -0.720930 // sell
								if( ad_mf > -0.151719 )
									ret := 0.133333
							if( ad_mf > -0.073632 )
								if( mf <= -0.086827 )
									ret := -0.711111 // sell
								if( mf > -0.086827 )
									ret := -0.947368 // sell
						if( bbm > 0.017961 )
							if( bullPower <= 0.731307 )
								if( bearPower <= 0.549452 )
									ret := 0.600000
								if( bearPower > 0.549452 )
									ret := -0.242424
							if( bullPower > 0.731307 )
								ret := -1.000000 // sell
				if( bbp > 1.29995 )
					if( bearPower <= 0.701871 )
						if( bbm <= 0.175744 )
							if( mf <= -0.281587 )
								if( ad_mf <= -257.51 )
									ret := 0.750000 // buy
								if( ad_mf > -257.51 )
									ret := -0.812500 // sell
							if( mf > -0.281587 )
								if( ad_mf <= -0.154941 )
									ret := -0.162791
								if( ad_mf > -0.154941 )
									ret := 0.339623
						if( bbm > 0.175744 )
							if( mf <= 0.330904 )
								if( bbm <= 0.259119 )
									ret := -0.428571
								if( bbm > 0.259119 )
									ret := 0.045685
							if( mf > 0.330904 )
								if( bbp <= 1.58059 )
									ret := 0.166667
								if( bbp > 1.58059 )
									ret := -0.723404 // sell
					if( bearPower > 0.701871 )
						if( bearPower <= 1.53996 )
							if( ad_mf <= -0.153339 )
								if( bbp <= 1.48924 )
									ret := -0.750000 // sell
								if( bbp > 1.48924 )
									ret := -0.119342
							if( ad_mf > -0.153339 )
								if( mf <= 0.174839 )
									ret := -0.498681
								if( mf > 0.174839 )
									ret := -0.051095
						if( bearPower > 1.53996 )
							if( ad_mf <= 0.314161 )
								if( bullPower <= 1.9234 )
									ret := 0.578947
								if( bullPower > 1.9234 )
									ret := 0.000000
							if( ad_mf > 0.314161 )
								if( mf <= 0.15996 )
									ret := -0.800000 // sell
								if( mf > 0.15996 )
									ret := 0.400000
		if( bullPower > 2.32575 )
			if( bbp <= 4.1875 )
				if( bbm <= 1.55775 )
					if( bullPower <= 2.42014 )
						ret := -0.428571
					if( bullPower > 2.42014 )
						ret := -1.000000 // sell
				if( bbm > 1.55775 )
					ret := -0.142857
			if( bbp > 4.1875 )
				if( mf <= -0.20602 )
					ret := -0.750000 // sell
				if( mf > -0.20602 )
					ret := -1.000000 // sell
	
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_QCOM_1Min_f89b265e(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)

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


