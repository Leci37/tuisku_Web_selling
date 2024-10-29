//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: MATICUSDT_30Min_1B00_bb3a6390 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1B00_bb3a6390", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_bb3a6390(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.103756 )
		if( bbp <= -0.115281 )
			if( bullPower <= -0.063018 )
				if( bearPower <= -0.226015 )
					ret := 1.000000 // buy
				if( bearPower > -0.226015 )
					if( bbm <= 0.100859 )
						if( bbp <= -0.227989 )
							ret := 1.000000 // buy
						if( bbp > -0.227989 )
							if( bullPower <= -0.066398 )
								if( bbp <= -0.187219 )
									ret := 0.681818
								if( bbp > -0.187219 )
									ret := 0.000000
							if( bullPower > -0.066398 )
								if( bearPower <= -0.111468 )
									ret := 1.000000 // buy
								if( bearPower > -0.111468 )
									ret := 0.750000 // buy
					if( bbm > 0.100859 )
						if( bearPower <= -0.173694 )
							if( bearPower <= -0.179759 )
								ret := 0.250000
							if( bearPower > -0.179759 )
								ret := 1.000000 // buy
						if( bearPower > -0.173694 )
							ret := -0.500000
			if( bullPower > -0.063018 )
				if( bullPower <= -0.046908 )
					if( bbp <= -0.172165 )
						if( bbp <= -0.213834 )
							if( bbm <= 0.167571 )
								if( bbm <= 0.127104 )
									ret := 0.157895
								if( bbm > 0.127104 )
									ret := -1.000000 // sell
							if( bbm > 0.167571 )
								ret := 1.000000 // buy
						if( bbp > -0.213834 )
							if( bearPower <= -0.139631 )
								if( bearPower <= -0.148588 )
									ret := 1.000000 // buy
								if( bearPower > -0.148588 )
									ret := 0.750000 // buy
							if( bearPower > -0.139631 )
								if( bullPower <= -0.056181 )
									ret := 0.714286 // buy
								if( bullPower > -0.056181 )
									ret := 0.333333
					if( bbp > -0.172165 )
						if( bbp <= -0.150867 )
							if( bbm <= 0.055272 )
								if( bearPower <= -0.097556 )
									ret := -0.960000 // sell
								if( bearPower > -0.097556 )
									ret := -0.666667
							if( bbm > 0.055272 )
								if( bullPower <= -0.054486 )
									ret := 1.000000 // buy
								if( bullPower > -0.054486 )
									ret := -0.250000
						if( bbp > -0.150867 )
							if( bbp <= -0.125802 )
								if( bearPower <= -0.085099 )
									ret := 0.133333
								if( bearPower > -0.085099 )
									ret := 0.760000 // buy
							if( bbp > -0.125802 )
								if( bearPower <= -0.071276 )
									ret := -1.000000 // sell
								if( bearPower > -0.071276 )
									ret := -0.333333
				if( bullPower > -0.046908 )
					if( bbp <= -0.182473 )
						if( bbm <= 0.171 )
							if( bearPower <= -0.175328 )
								ret := -1.000000 // sell
							if( bearPower > -0.175328 )
								if( bullPower <= -0.02886 )
									ret := -0.647059
								if( bullPower > -0.02886 )
									ret := 0.750000 // buy
						if( bbm > 0.171 )
							if( bbm <= 0.24643 )
								if( bullPower <= -0.005192 )
									ret := 0.187500
								if( bullPower > -0.005192 )
									ret := 0.857143 // buy
							if( bbm > 0.24643 )
								ret := -0.750000 // sell
					if( bbp > -0.182473 )
						if( bbm <= 0.070124 )
							if( bullPower <= -0.0328 )
								if( bbm <= 0.048995 )
									ret := 0.097222
								if( bbm > 0.048995 )
									ret := 0.643678
							if( bullPower > -0.0328 )
								if( bbm <= 0.0565 )
									ret := 0.857143 // buy
								if( bbm > 0.0565 )
									ret := -0.676471
						if( bbm > 0.070124 )
							if( bbp <= -0.115931 )
								if( bbm <= 0.077937 )
									ret := 0.885714 // buy
								if( bbm > 0.077937 )
									ret := 0.521739
							if( bbp > -0.115931 )
								ret := -1.000000 // sell
		if( bbp > -0.115281 )
			if( bbm <= 0.03583 )
				if( bullPower <= -0.037914 )
					if( bbm <= 0.024869 )
						if( bearPower <= -0.064704 )
							ret := 0.500000
						if( bearPower > -0.064704 )
							ret := 1.000000 // buy
					if( bbm > 0.024869 )
						if( bbm <= 0.02615 )
							ret := -0.600000
						if( bbm > 0.02615 )
							if( bbp <= -0.110917 )
								if( bearPower <= -0.072186 )
									ret := 0.250000
								if( bearPower > -0.072186 )
									ret := 0.777778 // buy
							if( bbp > -0.110917 )
								if( bbm <= 0.02809 )
									ret := 0.545455
								if( bbm > 0.02809 )
									ret := -0.750000 // sell
				if( bullPower > -0.037914 )
					if( bearPower <= -0.069039 )
						ret := -0.750000 // sell
					if( bearPower > -0.069039 )
						ret := -1.000000 // sell
			if( bbm > 0.03583 )
				if( bbm <= 0.0535 )
					if( bearPower <= -0.073874 )
						if( bullPower <= -0.030109 )
							if( bearPower <= -0.077897 )
								if( bearPower <= -0.077964 )
									ret := 1.000000 // buy
								if( bearPower > -0.077964 )
									ret := 0.250000
							if( bearPower > -0.077897 )
								ret := 1.000000 // buy
						if( bullPower > -0.030109 )
							if( bullPower <= -0.028819 )
								ret := 0.714286 // buy
							if( bullPower > -0.028819 )
								if( bullPower <= -0.027561 )
									ret := 1.000000 // buy
								if( bullPower > -0.027561 )
									ret := 0.833333 // buy
					if( bearPower > -0.073874 )
						ret := 0.000000
				if( bbm > 0.0535 )
					if( bearPower <= -0.08374 )
						if( bearPower <= -0.093596 )
							if( bearPower <= -0.099089 )
								if( bullPower <= -0.005145 )
									ret := 0.142857
								if( bullPower > -0.005145 )
									ret := 0.875000 // buy
							if( bearPower > -0.099089 )
								ret := -1.000000 // sell
						if( bearPower > -0.093596 )
							if( bbp <= -0.112797 )
								if( bullPower <= -0.028784 )
									ret := 1.000000 // buy
								if( bullPower > -0.028784 )
									ret := 0.000000
							if( bbp > -0.112797 )
								if( bbp <= -0.111914 )
									ret := 0.800000 // buy
								if( bbp > -0.111914 )
									ret := 1.000000 // buy
					if( bearPower > -0.08374 )
						ret := -0.500000
	if( bbp > -0.103756 )
		if( bbp <= -0.03377 )
			if( bbm <= 0.048777 )
				if( bullPower <= -0.017674 )
					if( bbp <= -0.093781 )
						if( bbm <= 0.022967 )
							if( bbm <= 0.019865 )
								if( bullPower <= -0.041117 )
									ret := 0.750000 // buy
								if( bullPower > -0.041117 )
									ret := 1.000000 // buy
							if( bbm > 0.019865 )
								if( bullPower <= -0.038624 )
									ret := 0.400000
								if( bullPower > -0.038624 )
									ret := 0.750000 // buy
						if( bbm > 0.022967 )
							if( bullPower <= -0.02401 )
								if( bbp <= -0.094402 )
									ret := -0.247191
								if( bbp > -0.094402 )
									ret := -0.916667 // sell
							if( bullPower > -0.02401 )
								ret := 1.000000 // buy
					if( bbp > -0.093781 )
						if( bbm <= 0.00885 )
							if( bearPower <= -0.024556 )
								if( bbm <= 0.00718 )
									ret := 0.392857
								if( bbm > 0.00718 )
									ret := 0.714286 // buy
							if( bearPower > -0.024556 )
								if( bullPower <= -0.018692 )
									ret := 1.000000 // buy
								if( bullPower > -0.018692 )
									ret := 0.750000 // buy
						if( bbm > 0.00885 )
							if( bearPower <= -0.035701 )
								if( bbp <= -0.057963 )
									ret := 0.277439
								if( bbp > -0.057963 )
									ret := 0.618421
							if( bearPower > -0.035701 )
								if( bullPower <= -0.019363 )
									ret := -0.277778
								if( bullPower > -0.019363 )
									ret := 0.291045
				if( bullPower > -0.017674 )
					if( bbp <= -0.034938 )
						if( bbp <= -0.071597 )
							if( bullPower <= -0.017536 )
								ret := 0.000000
							if( bullPower > -0.017536 )
								if( bbp <= -0.078635 )
									ret := 0.428571
								if( bbp > -0.078635 )
									ret := 0.787879 // buy
						if( bbp > -0.071597 )
							if( bbm <= 0.037434 )
								if( bullPower <= -0.002353 )
									ret := 0.092215
								if( bullPower > -0.002353 )
									ret := 0.829268 // buy
							if( bbm > 0.037434 )
								if( bearPower <= -0.040014 )
									ret := -0.159892
								if( bearPower > -0.040014 )
									ret := 0.757576 // buy
					if( bbp > -0.034938 )
						if( bullPower <= -0.012849 )
							if( bearPower <= -0.021181 )
								if( bearPower <= -0.021591 )
									ret := -0.333333
								if( bearPower > -0.021591 )
									ret := -1.000000 // sell
							if( bearPower > -0.021181 )
								if( bearPower <= -0.020406 )
									ret := 0.428571
								if( bearPower > -0.020406 )
									ret := -0.285714
						if( bullPower > -0.012849 )
							if( bullPower <= -0.012291 )
								if( bullPower <= -0.012663 )
									ret := 0.400000
								if( bullPower > -0.012663 )
									ret := 0.833333 // buy
							if( bullPower > -0.012291 )
								if( bbm <= 0.014595 )
									ret := 0.113924
								if( bbm > 0.014595 )
									ret := 0.471831
			if( bbm > 0.048777 )
				if( bbm <= 0.091024 )
					if( bearPower <= -0.044246 )
						if( bbp <= -0.08128 )
							if( bullPower <= -0.021814 )
								if( bbp <= -0.099208 )
									ret := 0.571429
								if( bbp > -0.099208 )
									ret := -0.272727
							if( bullPower > -0.021814 )
								if( bearPower <= -0.086434 )
									ret := -0.806452 // sell
								if( bearPower > -0.086434 )
									ret := -0.413043
						if( bbp > -0.08128 )
							if( bbp <= -0.077098 )
								if( bbm <= 0.077945 )
									ret := 0.195652
								if( bbm > 0.077945 )
									ret := 1.000000 // buy
							if( bbp > -0.077098 )
								if( bbm <= 0.082238 )
									ret := -0.187692
								if( bbm > 0.082238 )
									ret := -0.814815 // sell
					if( bearPower > -0.044246 )
						if( bbm <= 0.049312 )
							ret := -0.500000
						if( bbm > 0.049312 )
							if( bearPower <= -0.043617 )
								ret := 1.000000 // buy
							if( bearPower > -0.043617 )
								ret := 0.750000 // buy
				if( bbm > 0.091024 )
					if( bearPower <= -0.116479 )
						if( bearPower <= -0.146077 )
							ret := 0.000000
						if( bearPower > -0.146077 )
							ret := -1.000000 // sell
					if( bearPower > -0.116479 )
						if( bbp <= -0.042745 )
							if( bbp <= -0.085134 )
								ret := 1.000000 // buy
							if( bbp > -0.085134 )
								if( bbp <= -0.084287 )
									ret := 0.500000
								if( bbp > -0.084287 )
									ret := 0.891892 // buy
						if( bbp > -0.042745 )
							if( bullPower <= 0.037008 )
								if( bullPower <= 0.029574 )
									ret := -0.500000
								if( bullPower > 0.029574 )
									ret := 0.800000 // buy
							if( bullPower > 0.037008 )
								ret := -0.750000 // sell
		if( bbp > -0.03377 )
			if( bbm <= 0.001387 )
				if( bearPower <= -0.000233 )
					if( bbp <= -0.000458 )
						if( bbp <= -0.000532 )
							if( bbp <= -0.001219 )
								if( bbp <= -0.001403 )
									ret := 0.116719
								if( bbp > -0.001403 )
									ret := -0.341463
							if( bbp > -0.001219 )
								if( bearPower <= -0.000788 )
									ret := 0.447811
								if( bearPower > -0.000788 )
									ret := 0.105121
						if( bbp > -0.000532 )
							if( bbm <= 0.000133 )
								if( bbm <= 0.000105 )
									ret := 0.000000
								if( bbm > 0.000105 )
									ret := -0.750000 // sell
							if( bbm > 0.000133 )
								if( bullPower <= -0.000151 )
									ret := 0.361111
								if( bullPower > -0.000151 )
									ret := -0.266272
					if( bbp > -0.000458 )
						if( bullPower <= 6.5e-05 )
							if( bbm <= 0.000461 )
								if( bbm <= 0.000415 )
									ret := 0.290909
								if( bbm > 0.000415 )
									ret := -0.523810
							if( bbm > 0.000461 )
								ret := 1.000000 // buy
						if( bullPower > 6.5e-05 )
							if( bbp <= -0.000178 )
								if( bearPower <= -0.000426 )
									ret := 0.149485
								if( bearPower > -0.000426 )
									ret := -0.455446
							if( bbp > -0.000178 )
								if( bbp <= 0.000102 )
									ret := 0.396364
								if( bbp > 0.000102 )
									ret := 0.079812
				if( bearPower > -0.000233 )
					if( bbp <= -0.000231 )
						if( bullPower <= -0.000118 )
							if( bearPower <= -0.000226 )
								if( bbp <= -0.000357 )
									ret := 0.285714
								if( bbp > -0.000357 )
									ret := -0.750000 // sell
							if( bearPower > -0.000226 )
								if( bearPower <= -0.000173 )
									ret := 0.468750
								if( bearPower > -0.000173 )
									ret := -0.142857
						if( bullPower > -0.000118 )
							if( bbp <= -0.00033 )
								if( bullPower <= -0.000106 )
									ret := -0.666667
								if( bullPower > -0.000106 )
									ret := -1.000000 // sell
							if( bbp > -0.00033 )
								if( bullPower <= -2.9e-05 )
									ret := -0.303167
								if( bullPower > -2.9e-05 )
									ret := 0.375000
					if( bbp > -0.000231 )
						if( bbm <= 9.8e-05 )
							if( bullPower <= 8.6e-05 )
								if( bbp <= -0.00018 )
									ret := -0.400000
								if( bbp > -0.00018 )
									ret := 0.037707
							if( bullPower > 8.6e-05 )
								if( bbp <= 0.000168 )
									ret := -0.375940
								if( bbp > 0.000168 )
									ret := -0.168750
						if( bbm > 9.8e-05 )
							if( bbp <= -0.000172 )
								if( bbm <= 0.000121 )
									ret := -0.069444
								if( bbm > 0.000121 )
									ret := 0.428571
							if( bbp > -0.000172 )
								if( bbp <= 0.001995 )
									ret := 0.097809
								if( bbp > 0.001995 )
									ret := -0.068000
			if( bbm > 0.001387 )
				if( bullPower <= 0.06608 )
					if( bearPower <= -0.012548 )
						if( bbp <= -0.028745 )
							if( bullPower <= -0.009819 )
								if( bbp <= -0.031951 )
									ret := -0.071823
								if( bbp > -0.031951 )
									ret := 0.274336
							if( bullPower > -0.009819 )
								if( bullPower <= -0.008781 )
									ret := -0.415094
								if( bullPower > -0.008781 )
									ret := -0.070322
						if( bbp > -0.028745 )
							if( bbm <= 0.03975 )
								if( bbm <= 0.036994 )
									ret := 0.091848
								if( bbm > 0.036994 )
									ret := -0.349462
							if( bbm > 0.03975 )
								if( bbp <= -0.02665 )
									ret := -0.382353
								if( bbp > -0.02665 )
									ret := 0.217788
					if( bearPower > -0.012548 )
						if( bullPower <= -0.001739 )
							if( bearPower <= -0.010319 )
								if( bearPower <= -0.012031 )
									ret := -0.114114
								if( bearPower > -0.012031 )
									ret := 0.089344
							if( bearPower > -0.010319 )
								if( bbm <= 0.007305 )
									ret := -0.053428
								if( bbm > 0.007305 )
									ret := -0.410072
						if( bullPower > -0.001739 )
							if( bearPower <= 0.038123 )
								if( bbm <= 0.035983 )
									ret := 0.033551
								if( bbm > 0.035983 )
									ret := -0.058981
							if( bearPower > 0.038123 )
								if( bearPower <= 0.041617 )
									ret := 0.609375
								if( bearPower > 0.041617 )
									ret := -0.190476
				if( bullPower > 0.06608 )
					if( bbp <= 0.059646 )
						if( bbp <= 0.037159 )
							if( bullPower <= 0.093959 )
								ret := 0.250000
							if( bullPower > 0.093959 )
								ret := -1.000000 // sell
						if( bbp > 0.037159 )
							if( bullPower <= 0.072143 )
								ret := 0.500000
							if( bullPower > 0.072143 )
								if( bearPower <= -0.051247 )
									ret := 0.857143 // buy
								if( bearPower > -0.051247 )
									ret := 1.000000 // buy
					if( bbp > 0.059646 )
						if( bearPower <= 0.05171 )
							if( bbp <= 0.172686 )
								if( bbp <= 0.072443 )
									ret := -0.693548
								if( bbp > 0.072443 )
									ret := -0.164773
							if( bbp > 0.172686 )
								if( bbm <= 0.127905 )
									ret := -0.727273 // sell
								if( bbm > 0.127905 )
									ret := -0.931034 // sell
						if( bearPower > 0.05171 )
							if( bbm <= 0.048595 )
								if( bullPower <= 0.084602 )
									ret := 0.375000
								if( bullPower > 0.084602 )
									ret := -0.581818
							if( bbm > 0.048595 )
								if( bbp <= 0.328642 )
									ret := 0.268775
								if( bbp > 0.328642 )
									ret := -0.340000
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_bb3a6390(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


