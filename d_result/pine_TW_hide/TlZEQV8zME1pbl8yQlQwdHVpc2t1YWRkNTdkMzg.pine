//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: NVDA_30Min_2BT0_add57d38 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2BT0_add57d38", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_add57d38(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= 4.45298 )
		if( ema3 <= 103.835 )
			if( ema12 <= -0.167574 )
				if( ema12 <= -0.70317 )
					if( bbm <= 0.571354 )
						if( ema2 <= 94.7773 )
							if( ema12 <= -0.773616 )
								ret := 0.600000
							if( ema12 > -0.773616 )
								ret := 1.000000 // buy
						if( ema2 > 94.7773 )
							ret := -0.133333
					if( bbm > 0.571354 )
						if( bbp <= -1.79857 )
							if( bullPower <= -1.42569 )
								ret := 0.950000 // buy
							if( bullPower > -1.42569 )
								if( ema1 <= 99.9018 )
									ret := 0.555556
								if( ema1 > 99.9018 )
									ret := -0.272727
						if( bbp > -1.79857 )
							if( bearPower <= -1.03662 )
								ret := -0.785714 // sell
							if( bearPower > -1.03662 )
								ret := -0.363636
				if( ema12 > -0.70317 )
					if( bbm <= 0.231678 )
						if( tema <= 25.1012 )
							ret := 1.000000 // buy
						if( tema > 25.1012 )
							if( ema3 <= 93.0871 )
								if( bearPower <= -0.485528 )
									ret := -0.666667
								if( bearPower > -0.485528 )
									ret := -0.330189
							if( ema3 > 93.0871 )
								if( bullPower <= -0.154562 )
									ret := -0.144928
								if( bullPower > -0.154562 )
									ret := 0.433333
					if( bbm > 0.231678 )
						if( bbp <= -2.07873 )
							if( ema13 <= -0.930143 )
								ret := 0.000000
							if( ema13 > -0.930143 )
								if( bullPower <= -0.684048 )
									ret := 0.400000
								if( bullPower > -0.684048 )
									ret := 0.866667 // buy
						if( bbp > -2.07873 )
							if( bearPower <= -1.59065 )
								ret := 1.000000 // buy
							if( bearPower > -1.59065 )
								if( ema3 <= 70.6324 )
									ret := 0.064789
								if( ema3 > 70.6324 )
									ret := -0.284404
			if( ema12 > -0.167574 )
				if( ema3 <= 28.1946 )
					if( bbp <= -0.186225 )
						if( ema1 <= 25.2929 )
							ret := 0.900000 // buy
						if( ema1 > 25.2929 )
							if( tema <= 27.37 )
								if( ema1 <= 27.3759 )
									ret := -0.523810
								if( ema1 > 27.3759 )
									ret := -1.000000 // sell
							if( tema > 27.37 )
								ret := 0.545455
					if( bbp > -0.186225 )
						if( bbp <= 0.475479 )
							if( ema2 <= 28.0858 )
								if( bbm <= 0.224474 )
									ret := 0.874074 // buy
								if( bbm > 0.224474 )
									ret := 0.369863
							if( ema2 > 28.0858 )
								ret := 0.076923
						if( bbp > 0.475479 )
							if( bbp <= 0.664233 )
								if( ema2 <= 27.1848 )
									ret := 0.250000
								if( ema2 > 27.1848 )
									ret := -0.611111
							if( bbp > 0.664233 )
								if( bearPower <= 0.169583 )
									ret := -0.500000
								if( bearPower > 0.169583 )
									ret := 0.591549
				if( ema3 > 28.1946 )
					if( bearPower <= -0.451324 )
						if( bullPower <= 0.256666 )
							if( ema3 <= 102.566 )
								if( bbm <= 0.95 )
									ret := 0.288043
								if( bbm > 0.95 )
									ret := 0.837838 // buy
							if( ema3 > 102.566 )
								if( ema1 <= 102.636 )
									ret := -1.000000 // sell
								if( ema1 > 102.636 )
									ret := 0.500000
						if( bullPower > 0.256666 )
							if( bbm <= 2.3225 )
								if( bbm <= 1.39656 )
									ret := 0.923913 // buy
								if( bbm > 1.39656 )
									ret := 0.727273 // buy
							if( bbm > 2.3225 )
								ret := 0.277778
					if( bearPower > -0.451324 )
						if( ema3 <= 31.6897 )
							if( bbp <= -0.40068 )
								if( ema13 <= -0.230233 )
									ret := 1.000000 // buy
								if( ema13 > -0.230233 )
									ret := -0.166667
							if( bbp > -0.40068 )
								if( bullPower <= -0.033221 )
									ret := -0.564706
								if( bullPower > -0.033221 )
									ret := -0.189922
						if( ema3 > 31.6897 )
							if( tema <= 103.625 )
								if( tema <= 35.5064 )
									ret := 0.245926
								if( tema > 35.5064 )
									ret := 0.058090
							if( tema > 103.625 )
								if( bullPower <= 2.15498 )
									ret := 0.495690
								if( bullPower > 2.15498 )
									ret := -0.172414
		if( ema3 > 103.835 )
			if( bearPower <= 0.794025 )
				if( ema12 <= -4.44778 )
					if( ema3 <= 509.321 )
						if( ema1 <= 177.824 )
							if( bbm <= 0.995 )
								ret := -0.714286 // sell
							if( bbm > 0.995 )
								if( ema3 <= 157.234 )
									ret := -0.187500
								if( ema3 > 157.234 )
									ret := 0.576923
						if( ema1 > 177.824 )
							if( ema1 <= 300.091 )
								if( bbm <= 2.573 )
									ret := 0.029126
								if( bbm > 2.573 )
									ret := 0.669014
							if( ema1 > 300.091 )
								if( bullPower <= -3.09822 )
									ret := 0.709459 // buy
								if( bullPower > -3.09822 )
									ret := -0.150000
					if( ema3 > 509.321 )
						if( ema1 <= 530.108 )
							if( bbm <= 3.36004 )
								if( bbp <= -320.176 )
									ret := -0.388889
								if( bbp > -320.176 )
									ret := 0.166667
							if( bbm > 3.36004 )
								if( tema <= 515.796 )
									ret := -0.294118
								if( tema > 515.796 )
									ret := -0.967213 // sell
						if( ema1 > 530.108 )
							if( bbp <= -17.1736 )
								if( ema2 <= 905.871 )
									ret := -0.213235
								if( ema2 > 905.871 )
									ret := 0.415842
							if( bbp > -17.1736 )
								if( bearPower <= -5.00592 )
									ret := 0.464029
								if( bearPower > -5.00592 )
									ret := -0.208333
				if( ema12 > -4.44778 )
					if( bbm <= 0.80995 )
						if( bullPower <= 1.20964 )
							if( ema3 <= 293.193 )
								if( ema3 <= 154.85 )
									ret := 0.050997
								if( ema3 > 154.85 )
									ret := -0.036564
							if( ema3 > 293.193 )
								if( ema3 <= 423.603 )
									ret := 0.319838
								if( ema3 > 423.603 )
									ret := 0.076246
						if( bullPower > 1.20964 )
							if( bullPower <= 1.40551 )
								if( bearPower <= 0.54384 )
									ret := 0.097744
								if( bearPower > 0.54384 )
									ret := -0.254364
							if( bullPower > 1.40551 )
								if( ema1 <= 203.853 )
									ret := -0.257143
								if( ema1 > 203.853 )
									ret := 0.341176
					if( bbm > 0.80995 )
						if( ema13 <= 5.93032 )
							if( ema3 <= 105.532 )
								if( ema1 <= 104.785 )
									ret := -0.055556
								if( ema1 > 104.785 )
									ret := -0.766667 // sell
							if( ema3 > 105.532 )
								if( ema1 <= 1205.69 )
									ret := -0.046180
								if( ema1 > 1205.69 )
									ret := -0.916667 // sell
						if( ema13 > 5.93032 )
							if( ema1 <= 682.301 )
								if( bbm <= 9.9325 )
									ret := 0.310078
								if( bbm > 9.9325 )
									ret := -0.405797
							if( ema1 > 682.301 )
								if( ema3 <= 743.065 )
									ret := 0.897436 // buy
								if( ema3 > 743.065 )
									ret := 0.413174
			if( bearPower > 0.794025 )
				if( tema <= 119.672 )
					if( ema1 <= 108.177 )
						if( ema1 <= 105.886 )
							ret := -0.100000
						if( ema1 > 105.886 )
							if( bearPower <= 0.965116 )
								ret := -0.461538
							if( bearPower > 0.965116 )
								if( ema13 <= 1.79326 )
									ret := -1.000000 // sell
								if( ema13 > 1.79326 )
									ret := -0.636364
					if( ema1 > 108.177 )
						if( ema13 <= 1.10011 )
							ret := -0.095238
						if( ema13 > 1.10011 )
							if( bbp <= 6.01934 )
								if( ema12 <= 0.865144 )
									ret := 0.583333
								if( ema12 > 0.865144 )
									ret := 0.815920 // buy
							if( bbp > 6.01934 )
								ret := -0.214286
				if( tema > 119.672 )
					if( ema3 <= 135.594 )
						if( ema2 <= 128.248 )
							if( tema <= 125.575 )
								if( ema2 <= 122.918 )
									ret := -0.192053
								if( ema2 > 122.918 )
									ret := -0.866667 // sell
							if( tema > 125.575 )
								if( bullPower <= 4.25673 )
									ret := 0.385714
								if( bullPower > 4.25673 )
									ret := -1.000000 // sell
						if( ema2 > 128.248 )
							if( bullPower <= 1.60334 )
								if( ema13 <= 1.1163 )
									ret := 0.833333 // buy
								if( ema13 > 1.1163 )
									ret := -0.317073
							if( bullPower > 1.60334 )
								if( bbp <= 5.66807 )
									ret := -0.710526 // sell
								if( bbp > 5.66807 )
									ret := 0.368421
					if( ema3 > 135.594 )
						if( tema <= 146.568 )
							if( bbm <= 1.42 )
								if( ema13 <= 3.09518 )
									ret := 0.540284
								if( ema13 > 3.09518 )
									ret := -0.250000
							if( bbm > 1.42 )
								ret := -0.250000
						if( tema > 146.568 )
							if( ema13 <= 2.47993 )
								if( ema1 <= 996.689 )
									ret := -0.032910
								if( ema1 > 996.689 )
									ret := 0.692308
							if( ema13 > 2.47993 )
								if( ema1 <= 163.76 )
									ret := 0.462687
								if( ema1 > 163.76 )
									ret := 0.072075
	if( bearPower > 4.45298 )
		if( ema2 <= 264.452 )
			if( ema13 <= 3.0547 )
				if( bbm <= 2.41485 )
					ret := 0.692308
				if( bbm > 2.41485 )
					ret := 1.000000 // buy
			if( ema13 > 3.0547 )
				if( ema3 <= 222.723 )
					if( bbm <= 1.78316 )
						if( tema <= 227.282 )
							if( ema2 <= 125.351 )
								ret := -0.933333 // sell
							if( ema2 > 125.351 )
								if( tema <= 161.202 )
									ret := 1.000000 // buy
								if( tema > 161.202 )
									ret := -0.217391
						if( tema > 227.282 )
							if( bbm <= 1.13913 )
								ret := -1.000000 // sell
							if( bbm > 1.13913 )
								ret := -0.846154 // sell
					if( bbm > 1.78316 )
						if( ema1 <= 144.917 )
							ret := 1.000000 // buy
						if( ema1 > 144.917 )
							if( tema <= 168.164 )
								if( bullPower <= 8.3504 )
									ret := -0.666667
								if( bullPower > 8.3504 )
									ret := -0.866667 // sell
							if( tema > 168.164 )
								if( ema13 <= 3.85066 )
									ret := -0.545455
								if( ema13 > 3.85066 )
									ret := 0.338235
				if( ema3 > 222.723 )
					if( bearPower <= 4.81327 )
						ret := 0.133333
					if( bearPower > 4.81327 )
						if( bbm <= 2.81699 )
							if( bbp <= 15.3397 )
								if( ema12 <= 4.16316 )
									ret := -0.363636
								if( ema12 > 4.16316 )
									ret := -0.962963 // sell
							if( bbp > 15.3397 )
								ret := 0.000000
						if( bbm > 2.81699 )
							if( ema12 <= 3.97074 )
								ret := -0.875000 // sell
							if( ema12 > 3.97074 )
								ret := -1.000000 // sell
		if( ema2 > 264.452 )
			if( tema <= 494.332 )
				if( tema <= 278.406 )
					ret := -0.400000
				if( tema > 278.406 )
					if( bullPower <= 10.3489 )
						if( bullPower <= 7.81984 )
							if( ema12 <= 4.66237 )
								if( ema12 <= 3.67927 )
									ret := 0.647059
								if( ema12 > 3.67927 )
									ret := 0.151515
							if( ema12 > 4.66237 )
								if( bullPower <= 7.27443 )
									ret := 0.840000 // buy
								if( bullPower > 7.27443 )
									ret := 0.500000
						if( bullPower > 7.81984 )
							if( ema3 <= 411.771 )
								if( bearPower <= 6.31482 )
									ret := -0.613636
								if( bearPower > 6.31482 )
									ret := 0.540541
							if( ema3 > 411.771 )
								if( bbm <= 3.18445 )
									ret := 0.100000
								if( bbm > 3.18445 )
									ret := 0.783784 // buy
					if( bullPower > 10.3489 )
						if( ema1 <= 377.782 )
							if( bearPower <= 20.9957 )
								if( bullPower <= 12.3011 )
									ret := 0.826087 // buy
								if( bullPower > 12.3011 )
									ret := 0.978723 // buy
							if( bearPower > 20.9957 )
								if( bbm <= 7.90189 )
									ret := 0.833333 // buy
								if( bbm > 7.90189 )
									ret := 0.555556
						if( ema1 > 377.782 )
							if( bbp <= 23.088 )
								if( ema2 <= 454.933 )
									ret := 0.977778 // buy
								if( ema2 > 454.933 )
									ret := 0.642857
							if( bbp > 23.088 )
								ret := -0.117647
			if( tema > 494.332 )
				if( tema <= 1196.48 )
					if( ema3 <= 1110.55 )
						if( ema13 <= 3.27313 )
							if( bbp <= 15.1127 )
								if( ema13 <= 2.0573 )
									ret := -0.050000
								if( ema13 > 2.0573 )
									ret := 0.363636
							if( bbp > 15.1127 )
								if( ema1 <= 724.42 )
									ret := -0.916667 // sell
								if( ema1 > 724.42 )
									ret := -0.684211
						if( ema13 > 3.27313 )
							if( ema2 <= 1055.46 )
								if( ema13 <= 15.3529 )
									ret := 0.255648
								if( ema13 > 15.3529 )
									ret := -0.005747
							if( ema2 > 1055.46 )
								if( ema3 <= 1084.75 )
									ret := 0.934783 // buy
								if( ema3 > 1084.75 )
									ret := 0.727273 // buy
					if( ema3 > 1110.55 )
						if( tema <= 1154.65 )
							ret := -0.863636 // sell
						if( tema > 1154.65 )
							ret := 0.111111
				if( tema > 1196.48 )
					if( bullPower <= 16.4784 )
						ret := 0.571429
					if( bullPower > 16.4784 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_NVDA_30Min_add57d38(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


