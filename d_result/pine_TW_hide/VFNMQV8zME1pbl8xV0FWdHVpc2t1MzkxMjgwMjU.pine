//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: TSLA_30Min_1WAV_39128025 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_1WAV_39128025", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_39128025(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wt2 <= 64.4046 )
		if( wt2 <= -71.805 )
			if( d <= 2.69574 )
				if( ap <= 151.991 )
					if( ci <= -73.9274 )
						ret := -0.666667
					if( ci > -73.9274 )
						ret := -1.000000 // sell
				if( ap > 151.991 )
					if( esa <= 198.226 )
						if( esa <= 167.345 )
							if( ap <= 163.991 )
								ret := -0.166667
							if( ap > 163.991 )
								ret := -1.000000 // sell
						if( esa > 167.345 )
							if( ci_wt2 <= 39.9946 )
								if( d <= 1.61582 )
									ret := 0.166667
								if( d > 1.61582 )
									ret := 0.714286 // buy
							if( ci_wt2 > 39.9946 )
								if( wt2 <= -74.4713 )
									ret := 0.000000
								if( wt2 > -74.4713 )
									ret := -0.500000
					if( esa > 198.226 )
						if( tci <= -77.8489 )
							if( esa <= 250.853 )
								if( wt2 <= -83.1785 )
									ret := -0.666667
								if( wt2 > -83.1785 )
									ret := -1.000000 // sell
							if( esa > 250.853 )
								if( ap <= 349.855 )
									ret := -0.071429
								if( ap > 349.855 )
									ret := -1.000000 // sell
						if( tci > -77.8489 )
							if( ci <= -40.5145 )
								if( ci_wt2 <= 22.9799 )
									ret := -0.200000
								if( ci_wt2 > 22.9799 )
									ret := -0.727273 // sell
							if( ci > -40.5145 )
								if( ap <= 239.022 )
									ret := 0.625000
								if( ap > 239.022 )
									ret := -0.055556
			if( d > 2.69574 )
				if( esa <= 194.21 )
					if( tci <= -77.0291 )
						ret := -0.500000
					if( tci > -77.0291 )
						if( tci <= -72.096 )
							ret := 1.000000 // buy
						if( tci > -72.096 )
							ret := 0.500000
				if( esa > 194.21 )
					if( d_tci <= 83.8054 )
						if( d <= 8.16676 )
							if( esa <= 216.602 )
								if( d <= 4.65538 )
									ret := -0.800000 // sell
								if( d > 4.65538 )
									ret := -0.200000
							if( esa > 216.602 )
								if( d_tci <= 81.6849 )
									ret := 0.048485
								if( d_tci > 81.6849 )
									ret := -0.531915
						if( d > 8.16676 )
							if( ap <= 619.63 )
								if( ap <= 417.83 )
									ret := -0.750000 // sell
								if( ap > 417.83 )
									ret := 1.000000 // buy
							if( ap > 619.63 )
								if( ci_wt2 <= -0.108132 )
									ret := -0.250000
								if( ci_wt2 > -0.108132 )
									ret := -0.948718 // sell
					if( d_tci > 83.8054 )
						if( ci <= -59.1101 )
							if( d_tci <= 481.324 )
								if( d <= 11.6719 )
									ret := 0.302632
								if( d > 11.6719 )
									ret := 0.741935 // buy
							if( d_tci > 481.324 )
								ret := -1.000000 // sell
						if( ci > -59.1101 )
							if( tci <= -70.2242 )
								if( d_tci <= 87.653 )
									ret := -0.111111
								if( d_tci > 87.653 )
									ret := -0.666667
							if( tci > -70.2242 )
								ret := 0.750000 // buy
		if( wt2 > -71.805 )
			if( esa <= 119.844 )
				if( d <= 0.610655 )
					if( esa <= 117.063 )
						if( ci_wt2 <= -22.502 )
							ret := 0.250000
						if( ci_wt2 > -22.502 )
							if( esa <= 113.322 )
								if( tci <= -12.0683 )
									ret := -1.000000 // sell
								if( tci > -12.0683 )
									ret := 0.000000
							if( esa > 113.322 )
								ret := -1.000000 // sell
					if( esa > 117.063 )
						if( ci_wt2 <= 36.0762 )
							if( wt2 <= 9.16142 )
								ret := 0.750000 // buy
							if( wt2 > 9.16142 )
								ret := 1.000000 // buy
						if( ci_wt2 > 36.0762 )
							if( esa <= 118.149 )
								ret := -0.500000
							if( esa > 118.149 )
								ret := 0.000000
				if( d > 0.610655 )
					if( ci <= -87.2526 )
						if( ci_wt2 <= -90.6532 )
							if( ci_wt2 <= -175.519 )
								ret := -0.750000 // sell
							if( ci_wt2 > -175.519 )
								if( ap <= 114.446 )
									ret := -0.250000
								if( ap > 114.446 )
									ret := 1.000000 // buy
						if( ci_wt2 > -90.6532 )
							if( d <= 3.02089 )
								if( ci_wt2 <= -79.7783 )
									ret := -0.750000 // sell
								if( ci_wt2 > -79.7783 )
									ret := -1.000000 // sell
							if( d > 3.02089 )
								ret := -0.500000
					if( ci > -87.2526 )
						if( ci_wt2 <= 54.8677 )
							if( ap <= 104.896 )
								if( ci <= -73.642 )
									ret := 1.000000 // buy
								if( ci > -73.642 )
									ret := -0.800000 // sell
							if( ap > 104.896 )
								if( wt2 <= -70.8248 )
									ret := -0.250000
								if( wt2 > -70.8248 )
									ret := 0.784038 // buy
						if( ci_wt2 > 54.8677 )
							if( ap <= 111.475 )
								if( esa <= 108.482 )
									ret := 0.928571 // buy
								if( esa > 108.482 )
									ret := 0.333333
							if( ap > 111.475 )
								if( ci <= 58.6353 )
									ret := 0.500000
								if( ci > 58.6353 )
									ret := -0.173913
			if( esa > 119.844 )
				if( ci_wt2 <= 33.884 )
					if( esa <= 2254.63 )
						if( esa <= 501.083 )
							if( d_tci <= 136.635 )
								if( ap <= 343.402 )
									ret := 0.053579
								if( ap > 343.402 )
									ret := -0.023202
							if( d_tci > 136.635 )
								if( ap <= 302.307 )
									ret := -0.833333 // sell
								if( ap > 302.307 )
									ret := -1.000000 // sell
						if( esa > 501.083 )
							if( ap <= 563.887 )
								if( esa <= 1017.93 )
									ret := 0.376559
								if( esa > 1017.93 )
									ret := -0.909091 // sell
							if( ap > 563.887 )
								if( d <= 13.3619 )
									ret := 0.083017
								if( d > 13.3619 )
									ret := -0.060748
					if( esa > 2254.63 )
						if( d_tci <= 8.54942 )
							ret := -1.000000 // sell
						if( d_tci > 8.54942 )
							ret := -0.750000 // sell
				if( ci_wt2 > 33.884 )
					if( ci <= 176.645 )
						if( d <= 5.18219 )
							if( tci <= 41.4564 )
								if( ci <= 36.2867 )
									ret := 0.064077
								if( ci > 36.2867 )
									ret := -0.014936
							if( tci > 41.4564 )
								if( ci <= 110.351 )
									ret := -0.010989
								if( ci > 110.351 )
									ret := 0.156757
						if( d > 5.18219 )
							if( ap <= 563.242 )
								if( ap <= 517.002 )
									ret := -0.122112
								if( ap > 517.002 )
									ret := -0.876543 // sell
							if( ap > 563.242 )
								if( ap <= 585.367 )
									ret := 0.666667
								if( ap > 585.367 )
									ret := -0.048184
					if( ci > 176.645 )
						if( tci <= 43.8879 )
							if( ap <= 188.282 )
								if( wt2 <= 19.7775 )
									ret := -0.536232
								if( wt2 > 19.7775 )
									ret := 0.500000
							if( ap > 188.282 )
								if( ci_wt2 <= 222.241 )
									ret := 0.081535
								if( ci_wt2 > 222.241 )
									ret := 0.402685
						if( tci > 43.8879 )
							if( d_tci <= -71.093 )
								if( ci <= 194.741 )
									ret := 1.000000 // buy
								if( ci > 194.741 )
									ret := 0.750000 // buy
							if( d_tci > -71.093 )
								if( esa <= 217.167 )
									ret := 0.678161
								if( esa > 217.167 )
									ret := 0.214286
	if( wt2 > 64.4046 )
		if( d <= 8.17941 )
			if( ap <= 194.32 )
				if( ci_wt2 <= -19.3123 )
					if( ci <= 23.4596 )
						if( ap <= 173.038 )
							if( esa <= 165.104 )
								ret := 0.500000
							if( esa > 165.104 )
								ret := -1.000000 // sell
						if( ap > 173.038 )
							if( d <= 2.17403 )
								if( ci_wt2 <= -62.7782 )
									ret := 0.714286 // buy
								if( ci_wt2 > -62.7782 )
									ret := 0.153846
							if( d > 2.17403 )
								ret := -0.400000
					if( ci > 23.4596 )
						if( esa <= 185.476 )
							if( d <= 4.37446 )
								if( ap <= 169.992 )
									ret := 0.921875 // buy
								if( ap > 169.992 )
									ret := 0.753623 // buy
							if( d > 4.37446 )
								ret := 0.000000
						if( esa > 185.476 )
							if( d <= 1.42176 )
								if( ap <= 189.412 )
									ret := 0.500000
								if( ap > 189.412 )
									ret := 0.500000
							if( d > 1.42176 )
								if( tci <= 65.6394 )
									ret := -0.250000
								if( tci > 65.6394 )
									ret := 0.200000
				if( ci_wt2 > -19.3123 )
					if( esa <= 180.118 )
						if( esa <= 169.291 )
							if( esa <= 126.682 )
								if( d_tci <= -70.7231 )
									ret := -0.250000
								if( d_tci > -70.7231 )
									ret := -0.857143 // sell
							if( esa > 126.682 )
								if( ci <= 97.6621 )
									ret := 0.307692
								if( ci > 97.6621 )
									ret := 0.923077 // buy
						if( esa > 169.291 )
							if( d <= 1.88651 )
								if( esa <= 174.839 )
									ret := -0.368421
								if( esa > 174.839 )
									ret := 0.578947
							if( d > 1.88651 )
								if( wt2 <= 77.0548 )
									ret := -0.694444
								if( wt2 > 77.0548 )
									ret := 0.400000
					if( esa > 180.118 )
						if( tci <= 75.1447 )
							if( ci_wt2 <= 16.0655 )
								if( ci_wt2 <= -7.83744 )
									ret := 0.782609 // buy
								if( ci_wt2 > -7.83744 )
									ret := -0.045455
							if( ci_wt2 > 16.0655 )
								if( d_tci <= -69.6159 )
									ret := 0.750000 // buy
								if( d_tci > -69.6159 )
									ret := 1.000000 // buy
						if( tci > 75.1447 )
							if( ci <= 65.4229 )
								ret := 0.750000 // buy
							if( ci > 65.4229 )
								ret := 1.000000 // buy
			if( ap > 194.32 )
				if( d_tci <= -61.9037 )
					if( ci_wt2 <= 32.2258 )
						if( d_tci <= -66.0393 )
							if( d <= 1.12958 )
								if( tci <= 68.2537 )
									ret := 0.000000
								if( tci > 68.2537 )
									ret := 0.733333 // buy
							if( d > 1.12958 )
								if( d_tci <= -87.7109 )
									ret := 0.777778 // buy
								if( d_tci > -87.7109 )
									ret := -0.116598
						if( d_tci > -66.0393 )
							if( ap <= 213.075 )
								if( esa <= 205.322 )
									ret := 0.111111
								if( esa > 205.322 )
									ret := -0.709677 // sell
							if( ap > 213.075 )
								if( d <= 1.62289 )
									ret := -0.125000
								if( d > 1.62289 )
									ret := 0.158311
					if( ci_wt2 > 32.2258 )
						if( esa <= 225.317 )
							if( d_tci <= -68.3937 )
								if( ci_wt2 <= 37.152 )
									ret := -0.250000
								if( ci_wt2 > 37.152 )
									ret := 0.729167 // buy
							if( d_tci > -68.3937 )
								ret := -0.600000
						if( esa > 225.317 )
							if( ap <= 570.07 )
								if( d <= 5.16494 )
									ret := -0.114754
								if( d > 5.16494 )
									ret := -1.000000 // sell
							if( ap > 570.07 )
								if( d_tci <= -67.3154 )
									ret := 0.545455
								if( d_tci > -67.3154 )
									ret := -0.111111
				if( d_tci > -61.9037 )
					if( ci_wt2 <= -15.1706 )
						if( d <= 1.21298 )
							if( esa <= 212.433 )
								if( d_tci <= -60.672 )
									ret := -0.875000 // sell
								if( d_tci > -60.672 )
									ret := -0.250000
							if( esa > 212.433 )
								if( esa <= 216.07 )
									ret := 0.800000 // buy
								if( esa > 216.07 )
									ret := -0.347826
						if( d > 1.21298 )
							if( ap <= 293.01 )
								if( esa <= 197.453 )
									ret := -0.500000
								if( esa > 197.453 )
									ret := 0.504587
							if( ap > 293.01 )
								if( ci_wt2 <= -39.0143 )
									ret := -0.159292
								if( ci_wt2 > -39.0143 )
									ret := 0.184211
					if( ci_wt2 > -15.1706 )
						if( ci <= 76.3009 )
							if( ap <= 290.34 )
								ret := -0.285714
							if( ap > 290.34 )
								if( tci <= 68.5999 )
									ret := 0.632479
								if( tci > 68.5999 )
									ret := -0.500000
						if( ci > 76.3009 )
							if( d_tci <= -59.8251 )
								if( ap <= 485.202 )
									ret := 0.500000
								if( ap > 485.202 )
									ret := -0.166667
							if( d_tci > -59.8251 )
								ret := -0.800000 // sell
		if( d > 8.17941 )
			if( tci <= 78.9502 )
				if( d_tci <= -47.9371 )
					if( esa <= 1166.76 )
						if( ci_wt2 <= -11.0496 )
							if( d <= 9.27436 )
								if( ci_wt2 <= -43.822 )
									ret := 0.000000
								if( ci_wt2 > -43.822 )
									ret := 0.829787 // buy
							if( d > 9.27436 )
								if( esa <= 1156.58 )
									ret := 0.315789
								if( esa > 1156.58 )
									ret := 0.944444 // buy
						if( ci_wt2 > -11.0496 )
							if( ci_wt2 <= -1.93823 )
								if( ap <= 930.112 )
									ret := -0.442623
								if( ap > 930.112 )
									ret := 0.562500
							if( ci_wt2 > -1.93823 )
								if( d <= 14.3114 )
									ret := 0.350318
								if( d > 14.3114 )
									ret := -0.378378
					if( esa > 1166.76 )
						if( ap <= 1249.02 )
							if( ci_wt2 <= 22.6193 )
								if( ci_wt2 <= -25.6257 )
									ret := -0.500000
								if( ci_wt2 > -25.6257 )
									ret := -1.000000 // sell
							if( ci_wt2 > 22.6193 )
								ret := -0.400000
						if( ap > 1249.02 )
							if( tci <= 68.5417 )
								ret := -0.571429
							if( tci > 68.5417 )
								if( d_tci <= -49.5117 )
									ret := 0.125000
								if( d_tci > -49.5117 )
									ret := 0.687500
				if( d_tci > -47.9371 )
					if( d_tci <= -20.6969 )
						if( esa <= 1854.81 )
							if( d_tci <= -38.7128 )
								if( d <= 35.3447 )
									ret := 0.734513 // buy
								if( d > 35.3447 )
									ret := -0.500000
							if( d_tci > -38.7128 )
								if( ap <= 1828.01 )
									ret := 0.964286 // buy
								if( ap > 1828.01 )
									ret := 0.692308
						if( esa > 1854.81 )
							if( wt2 <= 66.8514 )
								if( d_tci <= -41.0034 )
									ret := -1.000000 // sell
								if( d_tci > -41.0034 )
									ret := -0.250000
							if( wt2 > 66.8514 )
								if( ci_wt2 <= -13.0844 )
									ret := 0.714286 // buy
								if( ci_wt2 > -13.0844 )
									ret := -0.500000
					if( d_tci > -20.6969 )
						ret := -1.000000 // sell
			if( tci > 78.9502 )
				if( d <= 22.2796 )
					if( wt2 <= 73.8345 )
						ret := 0.142857
					if( wt2 > 73.8345 )
						if( ap <= 639.427 )
							if( d_tci <= -75.9743 )
								ret := 0.750000 // buy
							if( d_tci > -75.9743 )
								ret := 1.000000 // buy
						if( ap > 639.427 )
							if( tci <= 83.2615 )
								if( ci <= 100.373 )
									ret := 0.642857
								if( ci > 100.373 )
									ret := -0.166667
							if( tci > 83.2615 )
								if( esa <= 682.111 )
									ret := 0.500000
								if( esa > 682.111 )
									ret := 0.934783 // buy
				if( d > 22.2796 )
					if( ci <= 74.9989 )
						if( ci <= 52.4657 )
							ret := 0.750000 // buy
						if( ci > 52.4657 )
							if( ap <= 881.887 )
								if( wt2 <= 89.3618 )
									ret := -1.000000 // sell
								if( wt2 > 89.3618 )
									ret := -0.400000
							if( ap > 881.887 )
								ret := 0.000000
					if( ci > 74.9989 )
						if( wt2 <= 77.5631 )
							ret := 0.857143 // buy
						if( wt2 > 77.5631 )
							if( ap <= 804.42 )
								ret := 0.800000 // buy
							if( ap > 804.42 )
								if( wt2 <= 79.564 )
									ret := 0.250000
								if( wt2 > 79.564 )
									ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TSLA_30Min_39128025(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


