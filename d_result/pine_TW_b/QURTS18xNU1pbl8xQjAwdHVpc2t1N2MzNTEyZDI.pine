//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: ADSK_15Min_1B00_7c3512d2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_1B00_7c3512d2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_7c3512d2(bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= -0.213505 )
		if( bbp <= -1.49441 )
			if( bbp <= -10.3973 )
				if( bearPower <= -23.0201 )
					ret := -1.000000 // sell
				if( bearPower > -23.0201 )
					if( bbp <= -18.5529 )
						if( bbm <= 2.85 )
							if( bbm <= 1.675 )
								ret := 0.846154 // buy
							if( bbm > 1.675 )
								ret := 1.000000 // buy
						if( bbm > 2.85 )
							if( bearPower <= -19.4571 )
								ret := 0.666667
							if( bearPower > -19.4571 )
								ret := 0.357143
					if( bbp > -18.5529 )
						if( bbp <= -15.561 )
							if( bbm <= 0.607963 )
								if( bbp <= -16.32 )
									ret := -1.000000 // sell
								if( bbp > -16.32 )
									ret := -0.150000
							if( bbm > 0.607963 )
								if( bbp <= -16.8315 )
									ret := 0.766667 // buy
								if( bbp > -16.8315 )
									ret := -0.421053
						if( bbp > -15.561 )
							if( bbp <= -14.1028 )
								if( bbm <= 3.23006 )
									ret := 0.864407 // buy
								if( bbm > 3.23006 )
									ret := -0.400000
							if( bbp > -14.1028 )
								if( bbm <= 2.29702 )
									ret := 0.038889
								if( bbm > 2.29702 )
									ret := 0.488636
			if( bbp > -10.3973 )
				if( bearPower <= -0.817419 )
					if( bbp <= -9.45455 )
						if( bullPower <= -4.65039 )
							ret := -0.111111
						if( bullPower > -4.65039 )
							if( bearPower <= -6.33271 )
								ret := -0.461538
							if( bearPower > -6.33271 )
								if( bearPower <= -6.03927 )
									ret := -0.904762 // sell
								if( bearPower > -6.03927 )
									ret := -0.648148
					if( bbp > -9.45455 )
						if( bbm <= 0.000769 )
							if( bbp <= -1.69333 )
								if( bullPower <= -1.86456 )
									ret := -0.066225
								if( bullPower > -1.86456 )
									ret := 0.164811
							if( bbp > -1.69333 )
								if( bearPower <= -0.830579 )
									ret := 0.953846 // buy
								if( bearPower > -0.830579 )
									ret := 0.348837
						if( bbm > 0.000769 )
							if( bullPower <= -2.11716 )
								if( bbm <= 3.35385 )
									ret := 0.073096
								if( bbm > 3.35385 )
									ret := 0.704918 // buy
							if( bullPower > -2.11716 )
								if( bbp <= -7.59037 )
									ret := -0.745763 // sell
								if( bbp > -7.59037 )
									ret := -0.029822
				if( bearPower > -0.817419 )
					if( bbp <= -1.60672 )
						if( bbp <= -1.61937 )
							ret := -1.000000 // sell
						if( bbp > -1.61937 )
							ret := -0.687500
					if( bbp > -1.60672 )
						if( bullPower <= -0.754195 )
							if( bullPower <= -0.7625 )
								if( bbp <= -1.52983 )
									ret := -0.291339
								if( bbp > -1.52983 )
									ret := 0.222222
							if( bullPower > -0.7625 )
								if( bearPower <= -0.760789 )
									ret := -1.000000 // sell
								if( bearPower > -0.760789 )
									ret := -0.090909
						if( bullPower > -0.754195 )
							ret := 0.200000
		if( bbp > -1.49441 )
			if( bbp <= -1.44971 )
				if( bbm <= 0.659794 )
					if( bbp <= -1.47973 )
						if( bbm <= 0.26882 )
							if( bearPower <= -0.769377 )
								ret := 0.875000 // buy
							if( bearPower > -0.769377 )
								ret := 0.214286
						if( bbm > 0.26882 )
							ret := 0.071429
					if( bbp > -1.47973 )
						if( bbm <= 0.505 )
							if( bearPower <= -0.733429 )
								if( bbm <= 0.32551 )
									ret := 0.870370 // buy
								if( bbm > 0.32551 )
									ret := -0.090909
							if( bearPower > -0.733429 )
								ret := -0.181818
						if( bbm > 0.505 )
							if( bbp <= -1.46899 )
								ret := 0.625000
							if( bbp > -1.46899 )
								ret := 1.000000 // buy
				if( bbm > 0.659794 )
					if( bbp <= -1.46534 )
						if( bullPower <= -0.289388 )
							if( bbm <= 0.811567 )
								if( bearPower <= -1.1167 )
									ret := 0.400000
								if( bearPower > -1.1167 )
									ret := -0.100000
							if( bbm > 0.811567 )
								ret := -0.583333
						if( bullPower > -0.289388 )
							ret := 0.666667
					if( bbp > -1.46534 )
						if( bbp <= -1.46025 )
							ret := 0.652174
						if( bbp > -1.46025 )
							ret := 0.272727
			if( bbp > -1.44971 )
				if( bullPower <= -0.716238 )
					ret := -0.655172
				if( bullPower > -0.716238 )
					if( bbp <= -1.17216 )
						if( bbp <= -1.25047 )
							if( bbm <= 0.855658 )
								if( bbm <= 0.175 )
									ret := 0.293333
								if( bbm > 0.175 )
									ret := 0.057447
							if( bbm > 0.855658 )
								if( bbm <= 0.940304 )
									ret := 0.631579
								if( bbm > 0.940304 )
									ret := -0.275862
						if( bbp > -1.25047 )
							if( bullPower <= -0.604431 )
								if( bearPower <= -0.614281 )
									ret := 0.928571 // buy
								if( bearPower > -0.614281 )
									ret := 0.553191
							if( bullPower > -0.604431 )
								if( bbm <= 0.007775 )
									ret := -0.071429
								if( bbm > 0.007775 )
									ret := 0.391192
					if( bbp > -1.17216 )
						if( bbm <= 0.278188 )
							if( bbp <= -1.11351 )
								if( bullPower <= -0.574404 )
									ret := 0.650000
								if( bullPower > -0.574404 )
									ret := -0.504762
							if( bbp > -1.11351 )
								if( bearPower <= -0.321718 )
									ret := 0.237550
								if( bearPower > -0.321718 )
									ret := 0.096661
						if( bbm > 0.278188 )
							if( bullPower <= -0.404455 )
								if( bbp <= -1.14691 )
									ret := -0.705882 // sell
								if( bbp > -1.14691 )
									ret := -0.500000
							if( bullPower > -0.404455 )
								if( bullPower <= -0.394273 )
									ret := 0.640000
								if( bullPower > -0.394273 )
									ret := 0.008787
	if( bullPower > -0.213505 )
		if( bearPower <= 0.035494 )
			if( bbm <= 3.31283 )
				if( bbm <= 2.7411 )
					if( bbm <= 0.755653 )
						if( bbp <= 0.757963 )
							if( bearPower <= 0.019132 )
								if( bearPower <= -0.915788 )
									ret := 0.777778 // buy
								if( bearPower > -0.915788 )
									ret := -0.008969
							if( bearPower > 0.019132 )
								if( bbp <= 0.040824 )
									ret := -0.953488 // sell
								if( bbp > 0.040824 )
									ret := -0.195730
						if( bbp > 0.757963 )
							if( bbp <= 0.778088 )
								ret := 0.384615
							if( bbp > 0.778088 )
								ret := 0.857143 // buy
					if( bbm > 0.755653 )
						if( bullPower <= 1.93397 )
							if( bullPower <= -0.168662 )
								if( bbp <= -1.38009 )
									ret := 0.000000
								if( bbp > -1.38009 )
									ret := -0.491329
							if( bullPower > -0.168662 )
								if( bullPower <= -0.132269 )
									ret := 0.256173
								if( bullPower > -0.132269 )
									ret := -0.073535
						if( bullPower > 1.93397 )
							if( bearPower <= -0.325857 )
								if( bearPower <= -0.374806 )
									ret := 0.386667
								if( bearPower > -0.374806 )
									ret := 0.903226 // buy
							if( bearPower > -0.325857 )
								if( bbm <= 2.19983 )
									ret := 0.311475
								if( bbm > 2.19983 )
									ret := -0.076923
				if( bbm > 2.7411 )
					if( bbp <= -2.70459 )
						if( bearPower <= -2.99534 )
							ret := -0.111111
						if( bearPower > -2.99534 )
							if( bbp <= -2.81056 )
								ret := 0.250000
							if( bbp > -2.81056 )
								if( bearPower <= -2.84234 )
									ret := 0.888889 // buy
								if( bearPower > -2.84234 )
									ret := 1.000000 // buy
					if( bbp > -2.70459 )
						if( bbp <= -1.16096 )
							if( bbp <= -1.38567 )
								if( bbp <= -1.74537 )
									ret := -0.567308
								if( bbp > -1.74537 )
									ret := -0.203704
							if( bbp > -1.38567 )
								ret := -1.000000 // sell
						if( bbp > -1.16096 )
							if( bullPower <= 1.67766 )
								if( bullPower <= 1.17534 )
									ret := -0.295455
								if( bullPower > 1.17534 )
									ret := 0.252525
							if( bullPower > 1.67766 )
								if( bearPower <= -1.24073 )
									ret := 0.818182 // buy
								if( bearPower > -1.24073 )
									ret := -0.448148
			if( bbm > 3.31283 )
				if( bbp <= -1.27667 )
					if( bullPower <= 1.03453 )
						if( bbp <= -5.42609 )
							if( bbm <= 7.42191 )
								if( bbm <= 5.62775 )
									ret := 1.000000 // buy
								if( bbm > 5.62775 )
									ret := 0.857143 // buy
							if( bbm > 7.42191 )
								ret := 0.400000
						if( bbp > -5.42609 )
							if( bbp <= -4.21958 )
								if( bbp <= -4.67249 )
									ret := -1.000000 // sell
								if( bbp > -4.67249 )
									ret := -0.533333
							if( bbp > -4.21958 )
								if( bullPower <= 0.749268 )
									ret := -0.253012
								if( bullPower > 0.749268 )
									ret := 0.369565
					if( bullPower > 1.03453 )
						if( bearPower <= -11.7127 )
							if( bearPower <= -16.6527 )
								ret := -0.333333
							if( bearPower > -16.6527 )
								ret := -0.894737 // sell
						if( bearPower > -11.7127 )
							if( bearPower <= -6.73868 )
								ret := 0.916667 // buy
							if( bearPower > -6.73868 )
								if( bullPower <= 1.41556 )
									ret := -0.537037
								if( bullPower > 1.41556 )
									ret := 0.000000
				if( bbp > -1.27667 )
					if( bbm <= 4.07222 )
						if( bullPower <= 2.94282 )
							if( bbp <= 0.711548 )
								if( bbp <= 0.455659 )
									ret := 0.473684
								if( bbp > 0.455659 )
									ret := 0.925000 // buy
							if( bbp > 0.711548 )
								if( bbm <= 3.47347 )
									ret := 0.837838 // buy
								if( bbm > 3.47347 )
									ret := -0.507463
						if( bullPower > 2.94282 )
							if( bbm <= 3.60349 )
								if( bbp <= 2.95573 )
									ret := 1.000000 // buy
								if( bbp > 2.95573 )
									ret := 0.777778 // buy
							if( bbm > 3.60349 )
								if( bearPower <= -0.563867 )
									ret := 0.810811 // buy
								if( bearPower > -0.563867 )
									ret := 0.527778
					if( bbm > 4.07222 )
						if( bearPower <= -2.48935 )
							if( bbp <= -0.17927 )
								if( bbm <= 5.27806 )
									ret := 0.575758
								if( bbm > 5.27806 )
									ret := -0.333333
							if( bbp > -0.17927 )
								if( bullPower <= 9.78276 )
									ret := 0.809524 // buy
								if( bullPower > 9.78276 )
									ret := 0.166667
						if( bearPower > -2.48935 )
							if( bbp <= 0.261735 )
								if( bbp <= -0.312513 )
									ret := -0.952381 // sell
								if( bbp > -0.312513 )
									ret := -0.692308
							if( bbp > 0.261735 )
								if( bbm <= 4.70101 )
									ret := 0.220000
								if( bbm > 4.70101 )
									ret := -0.224044
		if( bearPower > 0.035494 )
			if( bbp <= 0.57716 )
				if( bullPower <= 0.102396 )
					if( bullPower <= 0.055758 )
						if( bbp <= 0.072464 )
							if( bbp <= 0.071726 )
								ret := -0.090909
							if( bbp > 0.071726 )
								ret := -0.444444
						if( bbp > 0.072464 )
							if( bearPower <= 0.041724 )
								if( bbp <= 0.074505 )
									ret := 0.807692 // buy
								if( bbp > 0.074505 )
									ret := 0.604167
							if( bearPower > 0.041724 )
								if( bearPower <= 0.05288 )
									ret := 0.012195
								if( bearPower > 0.05288 )
									ret := 0.590909
					if( bullPower > 0.055758 )
						if( bullPower <= 0.078066 )
							if( bearPower <= 0.075089 )
								if( bearPower <= 0.069412 )
									ret := -0.092784
								if( bearPower > 0.069412 )
									ret := -0.675676
							if( bearPower > 0.075089 )
								if( bearPower <= 0.076841 )
									ret := 0.750000 // buy
								if( bearPower > 0.076841 )
									ret := 0.937500 // buy
						if( bullPower > 0.078066 )
							if( bullPower <= 0.088029 )
								ret := -0.632353
							if( bullPower > 0.088029 )
								if( bearPower <= 0.095578 )
									ret := -0.098039
								if( bearPower > 0.095578 )
									ret := -0.513514
				if( bullPower > 0.102396 )
					if( bbm <= 0.0913 )
						if( bearPower <= 0.211453 )
							if( bbp <= 0.390678 )
								if( bbm <= 0.025 )
									ret := 0.406199
								if( bbm > 0.025 )
									ret := -0.193548
							if( bbp > 0.390678 )
								if( bearPower <= 0.200669 )
									ret := 0.924731 // buy
								if( bearPower > 0.200669 )
									ret := 0.535714
						if( bearPower > 0.211453 )
							if( bearPower <= 0.279705 )
								if( bearPower <= 0.277707 )
									ret := 0.091837
								if( bearPower > 0.277707 )
									ret := -0.852941 // sell
							if( bearPower > 0.279705 )
								if( bullPower <= 0.283849 )
									ret := 0.486486
								if( bullPower > 0.283849 )
									ret := 0.925926 // buy
					if( bbm > 0.0913 )
						if( bullPower <= 0.274612 )
							if( bullPower <= 0.248293 )
								if( bbm <= 0.1907 )
									ret := 0.080139
								if( bbm > 0.1907 )
									ret := -0.300000
							if( bullPower > 0.248293 )
								if( bullPower <= 0.272733 )
									ret := -0.226415
								if( bullPower > 0.272733 )
									ret := -0.750000 // sell
						if( bullPower > 0.274612 )
							if( bearPower <= 0.042633 )
								if( bearPower <= 0.042162 )
									ret := 0.418367
								if( bearPower > 0.042162 )
									ret := 1.000000 // buy
							if( bearPower > 0.042633 )
								if( bbp <= 0.44923 )
									ret := 0.272981
								if( bbp > 0.44923 )
									ret := 0.028609
			if( bbp > 0.57716 )
				if( bbm <= 3e-06 )
					if( bbp <= 3.7323 )
						if( bullPower <= 1.80798 )
							if( bbp <= 3.36361 )
								if( bbp <= 3.22913 )
									ret := -0.093086
								if( bbp > 3.22913 )
									ret := 0.520000
							if( bbp > 3.36361 )
								if( bullPower <= 1.75825 )
									ret := -0.626866
								if( bullPower > 1.75825 )
									ret := 0.071429
						if( bullPower > 1.80798 )
							if( bullPower <= 1.84345 )
								if( bullPower <= 1.82533 )
									ret := 0.692308
								if( bullPower > 1.82533 )
									ret := 0.888889 // buy
							if( bullPower > 1.84345 )
								ret := 0.166667
					if( bbp > 3.7323 )
						if( bbp <= 5.28533 )
							if( bbp <= 4.41296 )
								if( bbp <= 4.10359 )
									ret := -0.482014
								if( bbp > 4.10359 )
									ret := 0.160000
							if( bbp > 4.41296 )
								if( bearPower <= 2.3064 )
									ret := -0.971429 // sell
								if( bearPower > 2.3064 )
									ret := -0.621118
						if( bbp > 5.28533 )
							if( bbp <= 6.54611 )
								if( bearPower <= 2.78181 )
									ret := 0.800000 // buy
								if( bearPower > 2.78181 )
									ret := 0.127119
							if( bbp > 6.54611 )
								if( bullPower <= 4.63492 )
									ret := -0.401361
								if( bullPower > 4.63492 )
									ret := -0.750000 // sell
				if( bbm > 3e-06 )
					if( bullPower <= 0.340914 )
						if( bearPower <= 0.299687 )
							ret := 0.888889 // buy
						if( bearPower > 0.299687 )
							ret := 1.000000 // buy
					if( bullPower > 0.340914 )
						if( bbm <= 0.826848 )
							if( bullPower <= 1.15267 )
								if( bbm <= 0.0825 )
									ret := 0.232955
								if( bbm > 0.0825 )
									ret := 0.013082
							if( bullPower > 1.15267 )
								if( bbm <= 0.737613 )
									ret := 0.072757
								if( bbm > 0.737613 )
									ret := 0.190855
						if( bbm > 0.826848 )
							if( bullPower <= 2.76861 )
								if( bullPower <= 1.06666 )
									ret := -0.386957
								if( bullPower > 1.06666 )
									ret := -0.062267
							if( bullPower > 2.76861 )
								if( bullPower <= 2.90776 )
									ret := 0.384365
								if( bullPower > 2.90776 )
									ret := 0.020792
	
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
float op_operation = decision_tree_0_ADSK_15Min_7c3512d2(bullPower, bbp, bearPower, bbm, BBPower_Color)

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


