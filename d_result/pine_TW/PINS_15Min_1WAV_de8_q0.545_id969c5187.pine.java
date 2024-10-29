//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: PINS_15Min_1WAV_969c5187 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1WAV_969c5187", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_969c5187(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ci_wt2 <= -23.6243 )
		if( ci <= -121.358 )
			if( ci_wt2 <= -82.3833 )
				if( d <= 0.183067 )
					if( wt2 <= -46.3291 )
						if( ap <= 19.395 )
							ret := 0.272727
						if( ap > 19.395 )
							if( ci_wt2 <= -88.5059 )
								if( esa <= 30.2627 )
									ret := 0.894737 // buy
								if( esa > 30.2627 )
									ret := 0.568182
							if( ci_wt2 > -88.5059 )
								ret := 0.125000
					if( wt2 > -46.3291 )
						if( ci_wt2 <= -193.504 )
							if( ci <= -261.558 )
								ret := -0.250000
							if( ci > -261.558 )
								if( ap <= 18.69 )
									ret := -0.500000
								if( ap > 18.69 )
									ret := 0.552486
						if( ci_wt2 > -193.504 )
							if( ap <= 21.7138 )
								if( d_tci <= 48.942 )
									ret := 0.411471
								if( d_tci > 48.942 )
									ret := -0.184211
							if( ap > 21.7138 )
								if( ci_wt2 <= -111.296 )
									ret := 0.196315
								if( ci_wt2 > -111.296 )
									ret := -0.037801
				if( d > 0.183067 )
					if( d <= 0.859905 )
						if( ci <= -122.419 )
							if( ci_wt2 <= -84.5922 )
								if( ci_wt2 <= -91.4106 )
									ret := 0.070251
								if( ci_wt2 > -91.4106 )
									ret := 0.600000
							if( ci_wt2 > -84.5922 )
								if( esa <= 26.8528 )
									ret := -0.800000 // sell
								if( esa > 26.8528 )
									ret := -0.266667
						if( ci > -122.419 )
							if( wt2 <= -6.97118 )
								ret := 0.400000
							if( wt2 > -6.97118 )
								ret := 1.000000 // buy
					if( d > 0.859905 )
						if( ci <= -192.949 )
							ret := 0.000000
						if( ci > -192.949 )
							if( ci <= -137.165 )
								if( ci_wt2 <= -122.059 )
									ret := 1.000000 // buy
								if( ci_wt2 > -122.059 )
									ret := 0.625000
							if( ci > -137.165 )
								ret := 0.333333
			if( ci_wt2 > -82.3833 )
				if( tci <= -84.929 )
					ret := -0.176471
				if( tci > -84.929 )
					if( ap <= 18.7137 )
						if( d_tci <= 66.9512 )
							ret := 0.800000 // buy
						if( d_tci > 66.9512 )
							ret := -0.285714
					if( ap > 18.7137 )
						if( ap <= 35.8543 )
							if( ci <= -124.022 )
								if( tci <= -62.2751 )
									ret := 0.716049 // buy
								if( tci > -62.2751 )
									ret := 0.964912 // buy
							if( ci > -124.022 )
								if( ci_wt2 <= -64.0988 )
									ret := 0.210526
								if( ci_wt2 > -64.0988 )
									ret := 0.785714 // buy
						if( ap > 35.8543 )
							if( ci_wt2 <= -70.7908 )
								if( ci_wt2 <= -77.8827 )
									ret := 0.000000
								if( ci_wt2 > -77.8827 )
									ret := 0.750000 // buy
							if( ci_wt2 > -70.7908 )
								ret := -0.222222
		if( ci > -121.358 )
			if( wt2 <= 60.761 )
				if( wt2 <= -18.8171 )
					if( wt2 <= -19.9874 )
						if( esa <= 27.2213 )
							if( tci <= -36.0974 )
								if( esa <= 15.6195 )
									ret := 0.730769 // buy
								if( esa > 15.6195 )
									ret := 0.255687
							if( tci > -36.0974 )
								if( ap <= 13.3825 )
									ret := -0.750000 // sell
								if( ap > 13.3825 )
									ret := 0.100649
						if( esa > 27.2213 )
							if( esa <= 76.1266 )
								if( esa <= 32.7809 )
									ret := -0.065740
								if( esa > 32.7809 )
									ret := 0.149859
							if( esa > 76.1266 )
								if( d <= 0.606824 )
									ret := -0.568182
								if( d > 0.606824 )
									ret := -0.036585
					if( wt2 > -19.9874 )
						if( esa <= 19.5355 )
							ret := -0.142857
						if( esa > 19.5355 )
							if( d_tci <= 31.2492 )
								if( esa <= 66.3598 )
									ret := 0.566038
								if( esa > 66.3598 )
									ret := 0.000000
							if( d_tci > 31.2492 )
								if( tci <= -33.1897 )
									ret := 0.272727
								if( tci > -33.1897 )
									ret := -0.333333
				if( wt2 > -18.8171 )
					if( wt2 <= 33.3109 )
						if( ap <= 85.7921 )
							if( ap <= 74.6194 )
								if( ci <= -19.9763 )
									ret := 0.058407
								if( ci > -19.9763 )
									ret := -0.049080
							if( ap > 74.6194 )
								if( d <= 0.671616 )
									ret := 0.174455
								if( d > 0.671616 )
									ret := 0.931034 // buy
						if( ap > 85.7921 )
							if( ap <= 87.0955 )
								ret := -0.705882 // sell
							if( ap > 87.0955 )
								ret := -0.888889 // sell
					if( wt2 > 33.3109 )
						if( ci <= -70.1971 )
							if( esa <= 22.6901 )
								if( ci_wt2 <= -125.998 )
									ret := 0.860656 // buy
								if( ci_wt2 > -125.998 )
									ret := 0.525424
							if( esa > 22.6901 )
								if( ci <= -92.225 )
									ret := 0.091633
								if( ci > -92.225 )
									ret := 0.398176
						if( ci > -70.1971 )
							if( d <= 0.073466 )
								if( ci_wt2 <= -26.1363 )
									ret := -0.045610
								if( ci_wt2 > -26.1363 )
									ret := 0.477273
							if( d > 0.073466 )
								if( tci <= 33.5887 )
									ret := 0.272838
								if( tci > 33.5887 )
									ret := 0.108429
			if( wt2 > 60.761 )
				if( wt2 <= 75.4711 )
					if( d <= 0.358488 )
						if( wt2 <= 68.6399 )
							if( ap <= 28.3511 )
								if( d_tci <= -63.9952 )
									ret := -0.600000
								if( d_tci > -63.9952 )
									ret := 0.353293
							if( ap > 28.3511 )
								if( ci <= 24.6619 )
									ret := 0.190083
								if( ci > 24.6619 )
									ret := -0.362319
						if( wt2 > 68.6399 )
							if( esa <= 23.806 )
								if( tci <= 66.3127 )
									ret := 0.722222 // buy
								if( tci > 66.3127 )
									ret := 0.916667 // buy
							if( esa > 23.806 )
								if( ci_wt2 <= -54.5769 )
									ret := -0.275000
								if( ci_wt2 > -54.5769 )
									ret := 0.428571
					if( d > 0.358488 )
						if( wt2 <= 63.1498 )
							if( ap <= 33.0455 )
								ret := 0.875000 // buy
							if( ap > 33.0455 )
								if( esa <= 62.2637 )
									ret := -0.600000
								if( esa > 62.2637 )
									ret := 0.434783
						if( wt2 > 63.1498 )
							if( ci <= 42.7583 )
								if( d <= 0.382776 )
									ret := 0.434783
								if( d > 0.382776 )
									ret := 0.750000 // buy
							if( ci > 42.7583 )
								if( esa <= 38.4385 )
									ret := 0.000000
								if( esa > 38.4385 )
									ret := 0.466667
				if( wt2 > 75.4711 )
					if( d_tci <= -137.955 )
						if( d <= 0.130246 )
							ret := 1.000000 // buy
						if( d > 0.130246 )
							ret := 0.625000
					if( d_tci > -137.955 )
						if( d <= 0.416763 )
							if( d <= 0.219037 )
								if( d_tci <= -75.2382 )
									ret := 0.083333
								if( d_tci > -75.2382 )
									ret := 0.363636
							if( d > 0.219037 )
								if( d_tci <= -74.2533 )
									ret := -0.866667 // sell
								if( d_tci > -74.2533 )
									ret := -0.142857
						if( d > 0.416763 )
							if( tci <= 91.2966 )
								if( ci_wt2 <= -42.0396 )
									ret := -0.096774
								if( ci_wt2 > -42.0396 )
									ret := 0.560976
							if( tci > 91.2966 )
								ret := -0.600000
	if( ci_wt2 > -23.6243 )
		if( ci <= 142.633 )
			if( ci <= -58.5933 )
				if( ci <= -70.0054 )
					if( ap <= 20.3962 )
						if( ap <= 13.0016 )
							ret := 1.000000 // buy
						if( ap > 13.0016 )
							if( d_tci <= 63.5002 )
								if( ci_wt2 <= -21.7525 )
									ret := -0.153846
								if( ci_wt2 > -21.7525 )
									ret := -0.816327 // sell
							if( d_tci > 63.5002 )
								if( esa <= 14.8338 )
									ret := -0.833333 // sell
								if( esa > 14.8338 )
									ret := 0.052632
					if( ap > 20.3962 )
						if( esa <= 25.9874 )
							if( d_tci <= 57.9778 )
								if( ci_wt2 <= -19.1789 )
									ret := -0.347826
								if( ci_wt2 > -19.1789 )
									ret := 0.818182 // buy
							if( d_tci > 57.9778 )
								if( d_tci <= 78.0672 )
									ret := 0.592179
								if( d_tci > 78.0672 )
									ret := -0.142857
						if( esa > 25.9874 )
							if( ap <= 50.5 )
								if( esa <= 35.3694 )
									ret := 0.077982
								if( esa > 35.3694 )
									ret := -0.455621
							if( ap > 50.5 )
								if( tci <= -67.0116 )
									ret := 0.645161
								if( tci > -67.0116 )
									ret := 0.037975
				if( ci > -70.0054 )
					if( tci <= -74.1814 )
						if( d_tci <= 78.0338 )
							if( wt2 <= -78.3594 )
								ret := -1.000000 // sell
							if( wt2 > -78.3594 )
								if( esa <= 32.0042 )
									ret := -0.062500
								if( esa > 32.0042 )
									ret := -0.866667 // sell
						if( d_tci > 78.0338 )
							if( ci_wt2 <= 18.3549 )
								ret := 0.235294
							if( ci_wt2 > 18.3549 )
								ret := -0.100000
					if( tci > -74.1814 )
						if( d <= 0.280311 )
							if( wt2 <= -56.3942 )
								if( ap <= 22.9785 )
									ret := 0.621622
								if( ap > 22.9785 )
									ret := 0.157407
							if( wt2 > -56.3942 )
								if( d <= 0.127657 )
									ret := -0.071749
								if( d > 0.127657 )
									ret := 0.228125
						if( d > 0.280311 )
							if( esa <= 37.0861 )
								if( ci <= -66.5005 )
									ret := 0.500000
								if( ci > -66.5005 )
									ret := 0.844444 // buy
							if( esa > 37.0861 )
								if( d <= 0.395268 )
									ret := -0.146341
								if( d > 0.395268 )
									ret := 0.298780
			if( ci > -58.5933 )
				if( ap <= 86.2083 )
					if( ci <= 49.098 )
						if( tci <= 53.9496 )
							if( ci_wt2 <= -3.08141 )
								if( d <= 0.240885 )
									ret := -0.001627
								if( d > 0.240885 )
									ret := -0.166186
							if( ci_wt2 > -3.08141 )
								if( wt2 <= 44.1669 )
									ret := 0.032118
								if( wt2 > 44.1669 )
									ret := 0.342466
						if( tci > 53.9496 )
							if( ap <= 23.383 )
								if( d_tci <= -57.9112 )
									ret := 0.085106
								if( d_tci > -57.9112 )
									ret := 0.691667
							if( ap > 23.383 )
								if( ap <= 83.4317 )
									ret := 0.061033
								if( ap > 83.4317 )
									ret := 1.000000 // buy
					if( ci > 49.098 )
						if( esa <= 18.1027 )
							if( tci <= 56.0091 )
								if( wt2 <= 24.9176 )
									ret := 0.168203
								if( wt2 > 24.9176 )
									ret := -0.159817
							if( tci > 56.0091 )
								if( wt2 <= 64.5993 )
									ret := 0.714286 // buy
								if( wt2 > 64.5993 )
									ret := 0.130435
						if( esa > 18.1027 )
							if( tci <= 77.6289 )
								if( ci <= 127.401 )
									ret := -0.027962
								if( ci > 127.401 )
									ret := 0.092803
							if( tci > 77.6289 )
								if( d <= 0.855607 )
									ret := -0.369668
								if( d > 0.855607 )
									ret := 0.454545
				if( ap > 86.2083 )
					if( tci <= 21.6931 )
						ret := -0.869565 // sell
					if( tci > 21.6931 )
						if( ci <= 94.8943 )
							if( ci_wt2 <= 24.9004 )
								if( ci_wt2 <= -8.0873 )
									ret := -0.100000
								if( ci_wt2 > -8.0873 )
									ret := -0.794872 // sell
							if( ci_wt2 > 24.9004 )
								ret := -0.117647
						if( ci > 94.8943 )
							ret := 0.200000
		if( ci > 142.633 )
			if( ap <= 23.6472 )
				if( ci_wt2 <= 139.962 )
					if( wt2 <= 57.789 )
						if( ci <= 156.161 )
							if( esa <= 22.6107 )
								if( ci <= 147.009 )
									ret := -0.562500
								if( ci > 147.009 )
									ret := 0.058824
							if( esa > 22.6107 )
								ret := 0.615385
						if( ci > 156.161 )
							if( ap <= 20.0525 )
								ret := 0.384615
							if( ap > 20.0525 )
								if( ci_wt2 <= 131.794 )
									ret := 0.769231 // buy
								if( ci_wt2 > 131.794 )
									ret := 1.000000 // buy
					if( wt2 > 57.789 )
						ret := -0.615385
				if( ci_wt2 > 139.962 )
					if( esa <= 18.8557 )
						if( tci <= 1.86146 )
							if( d_tci <= 0.741406 )
								ret := 1.000000 // buy
							if( d_tci > 0.741406 )
								if( ci_wt2 <= 224.43 )
									ret := -0.181818
								if( ci_wt2 > 224.43 )
									ret := 0.733333 // buy
						if( tci > 1.86146 )
							if( ci_wt2 <= 225.198 )
								if( ci <= 180.339 )
									ret := -0.166667
								if( ci > 180.339 )
									ret := 0.750000 // buy
							if( ci_wt2 > 225.198 )
								ret := -1.000000 // sell
					if( esa > 18.8557 )
						if( tci <= 24.7971 )
							if( wt2 <= 0.906708 )
								if( ci_wt2 <= 249.948 )
									ret := -0.192053
								if( ci_wt2 > 249.948 )
									ret := -0.818182 // sell
							if( wt2 > 0.906708 )
								if( tci <= 19.1754 )
									ret := -0.833333 // sell
								if( tci > 19.1754 )
									ret := -0.962963 // sell
						if( tci > 24.7971 )
							if( ci_wt2 <= 159.865 )
								if( wt2 <= 25.7599 )
									ret := -0.617647
								if( wt2 > 25.7599 )
									ret := 0.000000
							if( ci_wt2 > 159.865 )
								if( tci <= 38.7025 )
									ret := 0.866667 // buy
								if( tci > 38.7025 )
									ret := -0.103448
			if( ap > 23.6472 )
				if( d_tci <= -52.9388 )
					if( d <= 0.357049 )
						if( ci_wt2 <= 93.3239 )
							ret := -0.666667
						if( ci_wt2 > 93.3239 )
							if( d <= 0.207181 )
								if( ci <= 186.004 )
									ret := 0.178218
								if( ci > 186.004 )
									ret := -0.482759
							if( d > 0.207181 )
								if( d_tci <= -69.8837 )
									ret := -0.153846
								if( d_tci > -69.8837 )
									ret := 0.612903
					if( d > 0.357049 )
						if( ap <= 33.0902 )
							ret := 0.473684
						if( ap > 33.0902 )
							if( ci_wt2 <= 106.262 )
								if( ci <= 148.068 )
									ret := -0.875000 // sell
								if( ci > 148.068 )
									ret := -1.000000 // sell
							if( ci_wt2 > 106.262 )
								if( ci <= 230.397 )
									ret := -0.160000
								if( ci > 230.397 )
									ret := -1.000000 // sell
				if( d_tci > -52.9388 )
					if( d <= 0.95285 )
						if( d <= 0.065418 )
							if( tci <= 24.6439 )
								if( ap <= 28.7315 )
									ret := -0.340426
								if( ap > 28.7315 )
									ret := 0.060606
							if( tci > 24.6439 )
								if( ci <= 191.565 )
									ret := 0.076923
								if( ci > 191.565 )
									ret := 0.769231 // buy
						if( d > 0.065418 )
							if( ap <= 31.8773 )
								if( wt2 <= -30.0304 )
									ret := 0.096774
								if( wt2 > -30.0304 )
									ret := -0.478599
							if( ap > 31.8773 )
								if( ci <= 226.619 )
									ret := -0.170772
								if( ci > 226.619 )
									ret := -0.698413
					if( d > 0.95285 )
						ret := 0.692308
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_PINS_15Min_969c5187(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


