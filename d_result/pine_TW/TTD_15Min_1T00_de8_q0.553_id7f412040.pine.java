//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TTD_15Min_1T00_7f412040 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_1T00_7f412040", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_7f412040(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 42.7931 )
		if( ema2 <= 42.106 )
			if( ema3 <= 36.9347 )
				if( ema3 <= 31.5035 )
					if( ema2 <= 27.7039 )
						if( ema13 <= 0.550948 )
							if( ema3 <= 26.5492 )
								if( tema <= 25.7688 )
									ret := 0.923077 // buy
								if( tema > 25.7688 )
									ret := -0.242105
							if( ema3 > 26.5492 )
								if( ema3 <= 27.512 )
									ret := 0.345029
								if( ema3 > 27.512 )
									ret := 0.833333 // buy
						if( ema13 > 0.550948 )
							ret := -0.833333 // sell
					if( ema2 > 27.7039 )
						if( ema12 <= 0.246257 )
							if( tema <= 28.2065 )
								if( ema1 <= 27.8908 )
									ret := 0.192308
								if( ema1 > 27.8908 )
									ret := -0.600000
							if( tema > 28.2065 )
								if( tema <= 28.6563 )
									ret := 0.450216
								if( tema > 28.6563 )
									ret := 0.086429
						if( ema12 > 0.246257 )
							if( ema2 <= 29.4107 )
								if( tema <= 28.8299 )
									ret := -0.692308
								if( tema > 28.8299 )
									ret := -0.976744 // sell
							if( ema2 > 29.4107 )
								if( tema <= 32.064 )
									ret := -0.106383
								if( tema > 32.064 )
									ret := -1.000000 // sell
				if( ema3 > 31.5035 )
					if( ema13 <= -0.425078 )
						if( ema13 <= -0.583569 )
							if( ema13 <= -0.764201 )
								ret := 1.000000 // buy
							if( ema13 > -0.764201 )
								if( ema12 <= -0.339185 )
									ret := 0.714286 // buy
								if( ema12 > -0.339185 )
									ret := 1.000000 // buy
						if( ema13 > -0.583569 )
							if( ema13 <= -0.555646 )
								ret := 0.454545
							if( ema13 > -0.555646 )
								if( ema13 <= -0.509947 )
									ret := 1.000000 // buy
								if( ema13 > -0.509947 )
									ret := 0.675676
					if( ema13 > -0.425078 )
						if( ema12 <= 0.033776 )
							if( ema3 <= 36.541 )
								if( ema2 <= 34.4579 )
									ret := -0.783784 // sell
								if( ema2 > 34.4579 )
									ret := 0.585635
							if( ema3 > 36.541 )
								if( ema3 <= 36.9117 )
									ret := -0.768293 // sell
								if( ema3 > 36.9117 )
									ret := 0.920000 // buy
						if( ema12 > 0.033776 )
							if( ema3 <= 33.6438 )
								if( ema2 <= 31.829 )
									ret := 0.600000
								if( ema2 > 31.829 )
									ret := 0.886076 // buy
							if( ema3 > 33.6438 )
								if( tema <= 34.7523 )
									ret := -0.826087 // sell
								if( tema > 34.7523 )
									ret := 0.468514
			if( ema3 > 36.9347 )
				if( ema1 <= 38.943 )
					if( ema12 <= -0.347714 )
						if( ema12 <= -0.392464 )
							ret := 1.000000 // buy
						if( ema12 > -0.392464 )
							ret := 0.727273 // buy
					if( ema12 > -0.347714 )
						if( ema12 <= 0.373136 )
							if( ema12 <= -0.1107 )
								if( ema13 <= -0.190849 )
									ret := -0.313333
								if( ema13 > -0.190849 )
									ret := 0.820000 // buy
							if( ema12 > -0.1107 )
								if( ema3 <= 37.3541 )
									ret := -0.530405
								if( ema3 > 37.3541 )
									ret := -0.159864
						if( ema12 > 0.373136 )
							ret := 1.000000 // buy
				if( ema1 > 38.943 )
					if( ema3 <= 40.777 )
						if( ema2 <= 39.5743 )
							if( ema13 <= 0.146125 )
								if( ema13 <= -0.149116 )
									ret := 0.000000
								if( ema13 > -0.149116 )
									ret := -0.840000 // sell
							if( ema13 > 0.146125 )
								if( ema1 <= 39.9039 )
									ret := 0.533333
								if( ema1 > 39.9039 )
									ret := 1.000000 // buy
						if( ema2 > 39.5743 )
							if( ema1 <= 39.5793 )
								if( ema1 <= 39.353 )
									ret := 0.875000 // buy
								if( ema1 > 39.353 )
									ret := 1.000000 // buy
							if( ema1 > 39.5793 )
								if( ema1 <= 39.8623 )
									ret := 0.303030
								if( ema1 > 39.8623 )
									ret := 0.625000
					if( ema3 > 40.777 )
						if( ema12 <= -0.82203 )
							ret := 0.952381 // buy
						if( ema12 > -0.82203 )
							if( tema <= 40.5044 )
								if( ema1 <= 40.7048 )
									ret := -0.458333
								if( ema1 > 40.7048 )
									ret := -1.000000 // sell
							if( tema > 40.5044 )
								if( ema2 <= 41.06 )
									ret := 0.878788 // buy
								if( ema2 > 41.06 )
									ret := -0.067568
		if( ema2 > 42.106 )
			if( ema1 <= 42.1246 )
				if( ema1 <= 42.0251 )
					if( ema12 <= -0.380408 )
						ret := 1.000000 // buy
					if( ema12 > -0.380408 )
						ret := 0.714286 // buy
				if( ema1 > 42.0251 )
					if( tema <= 41.9915 )
						ret := 1.000000 // buy
					if( tema > 41.9915 )
						ret := 0.200000
			if( ema1 > 42.1246 )
				if( ema2 <= 42.4845 )
					if( ema1 <= 42.2973 )
						if( tema <= 42.3362 )
							ret := 0.416667
						if( tema > 42.3362 )
							ret := -0.272727
					if( ema1 > 42.2973 )
						if( ema1 <= 42.7544 )
							if( ema3 <= 42.5055 )
								if( ema13 <= 0.101235 )
									ret := 0.440000
								if( ema13 > 0.101235 )
									ret := 0.841270 // buy
							if( ema3 > 42.5055 )
								ret := 1.000000 // buy
						if( ema1 > 42.7544 )
							if( ema3 <= 42.019 )
								ret := 0.846154 // buy
							if( ema3 > 42.019 )
								ret := -0.333333
				if( ema2 > 42.4845 )
					if( ema13 <= 0.486439 )
						if( ema3 <= 42.7065 )
							if( ema1 <= 42.6277 )
								ret := 0.368421
							if( ema1 > 42.6277 )
								if( ema13 <= 0.401884 )
									ret := 1.000000 // buy
								if( ema13 > 0.401884 )
									ret := 0.846154 // buy
						if( ema3 > 42.7065 )
							if( ema12 <= -0.240439 )
								ret := 0.823529 // buy
							if( ema12 > -0.240439 )
								if( ema1 <= 42.4159 )
									ret := -1.000000 // sell
								if( ema1 > 42.4159 )
									ret := 0.100000
					if( ema13 > 0.486439 )
						if( ema12 <= 0.617843 )
							if( ema1 <= 43.0696 )
								ret := -0.769231 // sell
							if( ema1 > 43.0696 )
								ret := -0.300000
						if( ema12 > 0.617843 )
							ret := 0.800000 // buy
	if( ema2 > 42.7931 )
		if( ema12 <= -0.165679 )
			if( ema13 <= -23.0169 )
				if( ema1 <= 131.736 )
					if( ema3 <= 173.074 )
						if( ema13 <= -57.2832 )
							ret := 1.000000 // buy
						if( ema13 > -57.2832 )
							ret := 0.888889 // buy
					if( ema3 > 173.074 )
						ret := 0.666667
				if( ema1 > 131.736 )
					if( ema3 <= 632.591 )
						if( ema2 <= 599.641 )
							if( tema <= 488.076 )
								ret := -0.187500
							if( tema > 488.076 )
								ret := -1.000000 // sell
						if( ema2 > 599.641 )
							ret := 1.000000 // buy
					if( ema3 > 632.591 )
						if( ema12 <= -15.297 )
							if( ema13 <= -39.5334 )
								if( tema <= 542.937 )
									ret := -0.750000 // sell
								if( tema > 542.937 )
									ret := -1.000000 // sell
							if( ema13 > -39.5334 )
								if( ema3 <= 811.668 )
									ret := -0.444444
								if( ema3 > 811.668 )
									ret := 0.280000
						if( ema12 > -15.297 )
							if( ema13 <= -26.3539 )
								if( ema13 <= -27.3702 )
									ret := -1.000000 // sell
								if( ema13 > -27.3702 )
									ret := -0.666667
							if( ema13 > -26.3539 )
								ret := -1.000000 // sell
			if( ema13 > -23.0169 )
				if( ema12 <= -0.438139 )
					if( ema2 <= 65.5972 )
						if( ema3 <= 49.2331 )
							if( ema13 <= -1.27822 )
								if( ema3 <= 44.2332 )
									ret := 0.172414
								if( ema3 > 44.2332 )
									ret := 0.780488 // buy
							if( ema13 > -1.27822 )
								if( ema1 <= 47.8541 )
									ret := -0.463470
								if( ema1 > 47.8541 )
									ret := 0.195122
						if( ema3 > 49.2331 )
							if( ema1 <= 51.6255 )
								if( ema2 <= 50.866 )
									ret := 0.258065
								if( ema2 > 50.866 )
									ret := 0.654255
							if( ema1 > 51.6255 )
								if( ema12 <= -1.49525 )
									ret := 0.857143 // buy
								if( ema12 > -1.49525 )
									ret := 0.093156
					if( ema2 > 65.5972 )
						if( ema1 <= 97.9862 )
							if( ema3 <= 67.4055 )
								if( ema1 <= 66.4221 )
									ret := -0.675000
								if( ema1 > 66.4221 )
									ret := 1.000000 // buy
							if( ema3 > 67.4055 )
								if( ema2 <= 79.6809 )
									ret := -0.043948
								if( ema2 > 79.6809 )
									ret := -0.236964
						if( ema1 > 97.9862 )
							if( ema3 <= 115.202 )
								if( ema2 <= 109.995 )
									ret := 0.084656
								if( ema2 > 109.995 )
									ret := 0.577778
							if( ema3 > 115.202 )
								if( ema13 <= -19.4442 )
									ret := 0.544444
								if( ema13 > -19.4442 )
									ret := 0.005940
				if( ema12 > -0.438139 )
					if( tema <= 140.062 )
						if( tema <= 99.5393 )
							if( ema2 <= 97.5636 )
								if( tema <= 46.693 )
									ret := 0.249135
								if( tema > 46.693 )
									ret := 0.091308
							if( ema2 > 97.5636 )
								if( ema13 <= -0.157421 )
									ret := -0.467213
								if( ema13 > -0.157421 )
									ret := 0.833333 // buy
						if( tema > 99.5393 )
							if( ema3 <= 107.16 )
								if( ema13 <= -0.546524 )
									ret := 0.021277
								if( ema13 > -0.546524 )
									ret := 0.625000
							if( ema3 > 107.16 )
								if( ema13 <= 0.087392 )
									ret := 0.187032
								if( ema13 > 0.087392 )
									ret := -0.789474 // sell
					if( tema > 140.062 )
						if( tema <= 848.134 )
							if( ema3 <= 147.569 )
								if( ema1 <= 143.299 )
									ret := 0.000000
								if( ema1 > 143.299 )
									ret := -0.635417
							if( ema3 > 147.569 )
								if( ema2 <= 150.997 )
									ret := 0.771429 // buy
								if( ema2 > 150.997 )
									ret := -0.013640
						if( tema > 848.134 )
							if( tema <= 864.678 )
								ret := 0.909091 // buy
							if( tema > 864.678 )
								if( ema1 <= 911.235 )
									ret := 0.000000
								if( ema1 > 911.235 )
									ret := 0.722222 // buy
		if( ema12 > -0.165679 )
			if( ema3 <= 104.472 )
				if( ema13 <= 1.90981 )
					if( ema3 <= 42.9699 )
						if( ema1 <= 43.606 )
							if( tema <= 43.5914 )
								if( ema13 <= -0.163223 )
									ret := 0.636364
								if( ema13 > -0.163223 )
									ret := -0.647727
							if( tema > 43.5914 )
								if( ema12 <= 0.464179 )
									ret := 1.000000 // buy
								if( ema12 > 0.464179 )
									ret := 0.545455
						if( ema1 > 43.606 )
							if( tema <= 44.3154 )
								ret := -0.500000
							if( tema > 44.3154 )
								ret := -1.000000 // sell
					if( ema3 > 42.9699 )
						if( ema2 <= 49.3713 )
							if( ema2 <= 49.073 )
								if( tema <= 48.743 )
									ret := 0.007826
								if( tema > 48.743 )
									ret := -0.156790
							if( ema2 > 49.073 )
								if( ema12 <= -0.085353 )
									ret := -0.204545
								if( ema12 > -0.085353 )
									ret := 0.367188
						if( ema2 > 49.3713 )
							if( ema2 <= 49.7477 )
								if( tema <= 50.288 )
									ret := -0.369318
								if( tema > 50.288 )
									ret := 0.416667
							if( ema2 > 49.7477 )
								if( ema13 <= -0.488029 )
									ret := -0.488372
								if( ema13 > -0.488029 )
									ret := -0.054183
				if( ema13 > 1.90981 )
					if( ema12 <= 2.81633 )
						if( tema <= 47.8466 )
							ret := -1.000000 // sell
						if( tema > 47.8466 )
							if( ema2 <= 96.9162 )
								if( ema13 <= 3.74981 )
									ret := 0.254545
								if( ema13 > 3.74981 )
									ret := -0.318182
							if( ema2 > 96.9162 )
								if( ema13 <= 2.38624 )
									ret := 0.300000
								if( ema13 > 2.38624 )
									ret := -0.882353 // sell
					if( ema12 > 2.81633 )
						if( ema13 <= 6.51215 )
							if( ema13 <= 5.04597 )
								ret := 0.761905 // buy
							if( ema13 > 5.04597 )
								ret := 0.125000
						if( ema13 > 6.51215 )
							if( ema1 <= 84.5823 )
								ret := 1.000000 // buy
							if( ema1 > 84.5823 )
								if( ema3 <= 96.3144 )
									ret := 0.666667
								if( ema3 > 96.3144 )
									ret := 0.888889 // buy
			if( ema3 > 104.472 )
				if( tema <= 865.131 )
					if( ema12 <= -0.013625 )
						if( tema <= 137.06 )
							if( ema3 <= 132.698 )
								if( ema1 <= 108.231 )
									ret := 0.504505
								if( ema1 > 108.231 )
									ret := 0.242206
							if( ema3 > 132.698 )
								if( ema1 <= 133.651 )
									ret := 1.000000 // buy
								if( ema1 > 133.651 )
									ret := 0.428571
						if( tema > 137.06 )
							if( ema3 <= 215.661 )
								if( ema12 <= -0.015768 )
									ret := -0.153707
								if( ema12 > -0.015768 )
									ret := 0.538462
							if( ema3 > 215.661 )
								if( ema3 <= 571.686 )
									ret := 0.234168
								if( ema3 > 571.686 )
									ret := -0.030864
					if( ema12 > -0.013625 )
						if( ema13 <= 1.24318 )
							if( ema1 <= 862.097 )
								if( tema <= 782.22 )
									ret := -0.048898
								if( tema > 782.22 )
									ret := -0.418605
							if( ema1 > 862.097 )
								if( ema13 <= 0.645392 )
									ret := 0.900000 // buy
								if( ema13 > 0.645392 )
									ret := 1.000000 // buy
						if( ema13 > 1.24318 )
							if( ema13 <= 10.156 )
								if( ema1 <= 194.808 )
									ret := 0.156566
								if( ema1 > 194.808 )
									ret := 0.017793
							if( ema13 > 10.156 )
								if( tema <= 808.955 )
									ret := 0.335329
								if( tema > 808.955 )
									ret := -0.302083
				if( tema > 865.131 )
					if( ema13 <= 1.96391 )
						if( ema3 <= 876.356 )
							if( ema3 <= 864.838 )
								ret := 0.111111
							if( ema3 > 864.838 )
								if( ema2 <= 875.314 )
									ret := -0.888889 // sell
								if( ema2 > 875.314 )
									ret := -1.000000 // sell
						if( ema3 > 876.356 )
							if( tema <= 948.504 )
								if( tema <= 934.966 )
									ret := 0.611765
								if( tema > 934.966 )
									ret := 0.155556
							if( tema > 948.504 )
								ret := -0.857143 // sell
					if( ema13 > 1.96391 )
						if( ema12 <= 2.43935 )
							if( tema <= 868.758 )
								if( ema3 <= 862.892 )
									ret := -0.300000
								if( ema3 > 862.892 )
									ret := -0.837838 // sell
							if( tema > 868.758 )
								if( ema3 <= 921.119 )
									ret := -0.076923
								if( ema3 > 921.119 )
									ret := 0.348837
						if( ema12 > 2.43935 )
							if( tema <= 943.473 )
								if( ema3 <= 929.689 )
									ret := -0.527778
								if( ema3 > 929.689 )
									ret := -1.000000 // sell
							if( tema > 943.473 )
								if( ema13 <= 6.78653 )
									ret := -0.567568
								if( ema13 > 6.78653 )
									ret := 0.156250
	
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
float op_operation = decision_tree_0_TTD_15Min_7f412040(ema2, ema1, ema12, ema3, ema13, tema)

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


