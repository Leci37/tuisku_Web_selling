//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: SNAP_1Min_1WAV_667e818e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1WAV_667e818e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_667e818e(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tci <= 15.0228 )
		if( ci_wt2 <= 16.0037 )
			if( tci <= -39.3764 )
				if( d <= 0.060555 )
					if( ci <= -95.5353 )
						if( wt2 <= -49.5634 )
							if( ci_wt2 <= -124.496 )
								ret := -0.923077 // sell
							if( ci_wt2 > -124.496 )
								if( ci_wt2 <= -80.2885 )
									ret := 0.415929
								if( ci_wt2 > -80.2885 )
									ret := 0.014368
						if( wt2 > -49.5634 )
							if( wt2 <= -42.9998 )
								if( tci <= -51.5655 )
									ret := 0.276339
								if( tci > -51.5655 )
									ret := 0.587097
							if( wt2 > -42.9998 )
								if( esa <= 9.29535 )
									ret := 0.394366
								if( esa > 9.29535 )
									ret := 0.060632
					if( ci > -95.5353 )
						if( d <= 0.034279 )
							if( ci <= -42.8236 )
								if( wt2 <= -65.4793 )
									ret := 0.246606
								if( wt2 > -65.4793 )
									ret := -0.091255
							if( ci > -42.8236 )
								if( ci <= -35.833 )
									ret := 0.320796
								if( ci > -35.833 )
									ret := -0.075581
						if( d > 0.034279 )
							if( ci_wt2 <= -30.2635 )
								if( ci_wt2 <= -32.6957 )
									ret := -0.056075
								if( ci_wt2 > -32.6957 )
									ret := -0.548387
							if( ci_wt2 > -30.2635 )
								if( wt2 <= -72.2001 )
									ret := 0.635135
								if( wt2 > -72.2001 )
									ret := 0.134096
				if( d > 0.060555 )
					if( d <= 0.193849 )
						if( ap <= 16.3465 )
							if( tci <= -52.5149 )
								if( ci <= -122.495 )
									ret := 0.911111 // buy
								if( ci > -122.495 )
									ret := 0.481203
							if( tci > -52.5149 )
								if( d_tci <= 51.0972 )
									ret := 0.161491
								if( d_tci > 51.0972 )
									ret := -1.000000 // sell
						if( ap > 16.3465 )
							if( d_tci <= 61.5936 )
								if( d_tci <= 51.7019 )
									ret := -0.583333
								if( d_tci > 51.7019 )
									ret := 0.800000 // buy
							if( d_tci > 61.5936 )
								if( ap <= 16.5358 )
									ret := -0.925926 // sell
								if( ap > 16.5358 )
									ret := -0.714286 // sell
					if( d > 0.193849 )
						ret := 1.000000 // buy
			if( tci > -39.3764 )
				if( d_tci <= 2.77782 )
					if( esa <= 9.59659 )
						if( esa <= 9.58119 )
							if( d <= 0.013972 )
								if( tci <= -2.6676 )
									ret := 1.000000 // buy
								if( tci > -2.6676 )
									ret := 0.208702
							if( d > 0.013972 )
								if( d_tci <= -12.7655 )
									ret := 0.138889
								if( d_tci > -12.7655 )
									ret := 0.650307
						if( esa > 9.58119 )
							ret := 1.000000 // buy
					if( esa > 9.59659 )
						if( esa <= 16.297 )
							if( ci <= 3.62005 )
								if( ci <= -184.537 )
									ret := 0.758621 // buy
								if( ci > -184.537 )
									ret := 0.162100
							if( ci > 3.62005 )
								if( wt2 <= 1.52281 )
									ret := 0.322581
								if( wt2 > 1.52281 )
									ret := -0.171739
						if( esa > 16.297 )
							if( ci_wt2 <= -63.0538 )
								if( wt2 <= 17.1911 )
									ret := 0.208092
								if( wt2 > 17.1911 )
									ret := -0.016260
							if( ci_wt2 > -63.0538 )
								if( tci <= 14.3477 )
									ret := -0.169231
								if( tci > 14.3477 )
									ret := 0.600000
				if( d_tci > 2.77782 )
					if( ap <= 13.3414 )
						if( d_tci <= 32.6091 )
							if( ci <= -50.8448 )
								if( tci <= -22.052 )
									ret := 0.079935
								if( tci > -22.052 )
									ret := 0.215260
							if( ci > -50.8448 )
								if( wt2 <= -7.80907 )
									ret := 0.083285
								if( wt2 > -7.80907 )
									ret := -0.082902
						if( d_tci > 32.6091 )
							if( wt2 <= -41.9408 )
								ret := -0.625000
							if( wt2 > -41.9408 )
								if( ap <= 12.1946 )
									ret := 0.255115
								if( ap > 12.1946 )
									ret := 0.610294
					if( ap > 13.3414 )
						if( wt2 <= 6.21995 )
							if( ci <= -98.2959 )
								if( ci_wt2 <= -217.446 )
									ret := 0.884615 // buy
								if( ci_wt2 > -217.446 )
									ret := 0.230544
							if( ci > -98.2959 )
								if( d_tci <= 3.85971 )
									ret := 0.429688
								if( d_tci > 3.85971 )
									ret := 0.032071
						if( wt2 > 6.21995 )
							if( ci_wt2 <= -140.138 )
								if( d_tci <= 12.0004 )
									ret := 0.339623
								if( d_tci > 12.0004 )
									ret := -0.181818
							if( ci_wt2 > -140.138 )
								if( tci <= -4.09165 )
									ret := -0.234848
								if( tci > -4.09165 )
									ret := -0.467290
		if( ci_wt2 > 16.0037 )
			if( wt2 <= -75.7463 )
				if( esa <= 15.0586 )
					if( ap <= 10.325 )
						if( ci_wt2 <= 34.2761 )
							ret := -0.117647
						if( ci_wt2 > 34.2761 )
							ret := -0.454545
					if( ap > 10.325 )
						if( tci <= -78.3034 )
							if( d_tci <= 98.4354 )
								ret := 1.000000 // buy
							if( d_tci > 98.4354 )
								ret := 0.187500
						if( tci > -78.3034 )
							ret := -0.375000
				if( esa > 15.0586 )
					if( ci_wt2 <= 29.421 )
						ret := 0.642857
					if( ci_wt2 > 29.421 )
						if( wt2 <= -77.0451 )
							ret := 1.000000 // buy
						if( wt2 > -77.0451 )
							ret := 0.842105 // buy
			if( wt2 > -75.7463 )
				if( ci_wt2 <= 129.391 )
					if( ap <= 9.71288 )
						if( d_tci <= 60.5422 )
							if( wt2 <= -3.76806 )
								if( d <= 0.045665 )
									ret := -0.101852
								if( d > 0.045665 )
									ret := 0.609756
							if( wt2 > -3.76806 )
								if( ci <= 89.9762 )
									ret := -0.189858
								if( ci > 89.9762 )
									ret := -0.582645
						if( d_tci > 60.5422 )
							if( ci_wt2 <= 48.5734 )
								if( tci <= -66.1915 )
									ret := -0.232558
								if( tci > -66.1915 )
									ret := -0.705479 // sell
							if( ci_wt2 > 48.5734 )
								if( tci <= -64.9248 )
									ret := -0.333333
								if( tci > -64.9248 )
									ret := 0.444444
					if( ap > 9.71288 )
						if( ci_wt2 <= 17.7977 )
							if( wt2 <= -43.8547 )
								if( ci_wt2 <= 16.2671 )
									ret := 0.291667
								if( ci_wt2 > 16.2671 )
									ret := -0.624161
							if( wt2 > -43.8547 )
								if( tci <= 12.0914 )
									ret := -0.169312
								if( tci > 12.0914 )
									ret := 0.928571 // buy
						if( ci_wt2 > 17.7977 )
							if( tci <= -56.6233 )
								if( ci <= 34.2464 )
									ret := 0.108578
								if( ci > 34.2464 )
									ret := -0.800000 // sell
							if( tci > -56.6233 )
								if( tci <= -24.4889 )
									ret := -0.097784
								if( tci > -24.4889 )
									ret := -0.021267
				if( ci_wt2 > 129.391 )
					if( ci <= 206.874 )
						if( ap <= 11.0982 )
							if( ci_wt2 <= 186.829 )
								if( ci_wt2 <= 170.504 )
									ret := -0.160630
								if( ci_wt2 > 170.504 )
									ret := 0.202247
							if( ci_wt2 > 186.829 )
								if( d <= 0.00985 )
									ret := -0.275862
								if( d > 0.00985 )
									ret := -0.754386 // sell
						if( ap > 11.0982 )
							if( esa <= 15.2042 )
								if( ci_wt2 <= 131.797 )
									ret := -0.129630
								if( ci_wt2 > 131.797 )
									ret := -0.477387
							if( esa > 15.2042 )
								if( ci_wt2 <= 187.365 )
									ret := -0.306799
								if( ci_wt2 > 187.365 )
									ret := 0.347826
					if( ci > 206.874 )
						if( ci_wt2 <= 266.595 )
							if( ap <= 9.80827 )
								ret := -0.875000 // sell
							if( ap > 9.80827 )
								ret := -1.000000 // sell
						if( ci_wt2 > 266.595 )
							if( ci_wt2 <= 274.831 )
								ret := -0.285714
							if( ci_wt2 > 274.831 )
								ret := -1.000000 // sell
	if( tci > 15.0228 )
		if( d_tci <= -42.0957 )
			if( d <= 0.018082 )
				if( tci <= 43.9256 )
					if( esa <= 8.94981 )
						if( ci <= 25.2014 )
							ret := 0.000000
						if( ci > 25.2014 )
							if( ci <= 72.3538 )
								ret := -1.000000 // sell
							if( ci > 72.3538 )
								ret := -0.666667
					if( esa > 8.94981 )
						if( ap <= 9.24529 )
							if( tci <= 43.6421 )
								if( d <= 0.008468 )
									ret := -0.368421
								if( d > 0.008468 )
									ret := 0.675000
							if( tci > 43.6421 )
								ret := -0.600000
						if( ap > 9.24529 )
							if( ci_wt2 <= -32.835 )
								if( tci <= 43.0016 )
									ret := 0.307692
								if( tci > 43.0016 )
									ret := -0.061538
							if( ci_wt2 > -32.835 )
								if( wt2 <= 44.014 )
									ret := -0.250712
								if( wt2 > 44.014 )
									ret := -0.632353
				if( tci > 43.9256 )
					if( ci_wt2 <= 76.6913 )
						if( tci <= 48.5978 )
							if( d_tci <= -45.8976 )
								if( esa <= 9.2514 )
									ret := -0.051282
								if( esa > 9.2514 )
									ret := 0.294798
							if( d_tci > -45.8976 )
								if( tci <= 44.8629 )
									ret := 0.122667
								if( tci > 44.8629 )
									ret := -0.071429
						if( tci > 48.5978 )
							if( d_tci <= -58.3863 )
								if( ap <= 8.88034 )
									ret := 0.500000
								if( ap > 8.88034 )
									ret := 0.087175
							if( d_tci > -58.3863 )
								if( d <= 0.013294 )
									ret := 0.065438
								if( d > 0.013294 )
									ret := -0.056156
					if( ci_wt2 > 76.6913 )
						if( ci_wt2 <= 150.293 )
							if( d_tci <= -70.7895 )
								ret := -0.866667 // sell
							if( d_tci > -70.7895 )
								if( esa <= 9.51251 )
									ret := -0.475410
								if( esa > 9.51251 )
									ret := -0.126984
						if( ci_wt2 > 150.293 )
							if( ap <= 11.3338 )
								if( d <= 0.012535 )
									ret := -0.111111
								if( d > 0.012535 )
									ret := 0.000000
							if( ap > 11.3338 )
								ret := 1.000000 // buy
			if( d > 0.018082 )
				if( d <= 0.146855 )
					if( ap <= 16.604 )
						if( tci <= 43.0869 )
							if( ci <= 75.0753 )
								if( ci_wt2 <= 28.126 )
									ret := -0.392000
								if( ci_wt2 > 28.126 )
									ret := 0.461538
							if( ci > 75.0753 )
								if( esa <= 14.5461 )
									ret := -0.333333
								if( esa > 14.5461 )
									ret := -0.804348 // sell
						if( tci > 43.0869 )
							if( ci <= 86.9638 )
								if( ci <= 26.3943 )
									ret := 0.091806
								if( ci > 26.3943 )
									ret := -0.092134
							if( ci > 86.9638 )
								if( d_tci <= -71.1531 )
									ret := -0.039634
								if( d_tci > -71.1531 )
									ret := -0.333158
					if( ap > 16.604 )
						if( esa <= 16.5823 )
							if( ci <= 112.048 )
								ret := -1.000000 // sell
							if( ci > 112.048 )
								ret := -0.272727
						if( esa > 16.5823 )
							if( d <= 0.101915 )
								if( wt2 <= 74.4857 )
									ret := -0.344017
								if( wt2 > 74.4857 )
									ret := -0.777778 // sell
							if( d > 0.101915 )
								ret := 0.692308
				if( d > 0.146855 )
					if( ci_wt2 <= 2.39357 )
						ret := -0.818182 // sell
					if( ci_wt2 > 2.39357 )
						ret := -1.000000 // sell
		if( d_tci > -42.0957 )
			if( d_tci <= -41.6229 )
				if( d_tci <= -41.6886 )
					if( esa <= 9.43027 )
						if( d <= 0.013001 )
							if( ci <= 55.4515 )
								ret := 0.636364
							if( ci > 55.4515 )
								ret := -0.181818
						if( d > 0.013001 )
							ret := -0.705882 // sell
					if( esa > 9.43027 )
						if( ci <= 1.08669 )
							if( ci_wt2 <= -61.2818 )
								if( tci <= 42.0099 )
									ret := 0.350000
								if( tci > 42.0099 )
									ret := 0.000000
							if( ci_wt2 > -61.2818 )
								if( tci <= 41.8377 )
									ret := 0.800000 // buy
								if( tci > 41.8377 )
									ret := 0.928571 // buy
						if( ci > 1.08669 )
							if( ci_wt2 <= 17.6892 )
								if( esa <= 15.8481 )
									ret := 0.094340
								if( esa > 15.8481 )
									ret := -0.264706
							if( ci_wt2 > 17.6892 )
								if( ci <= 63.8055 )
									ret := 0.777778 // buy
								if( ci > 63.8055 )
									ret := 0.244444
				if( d_tci > -41.6886 )
					if( ci <= 37.9913 )
						ret := 0.769231 // buy
					if( ci > 37.9913 )
						ret := 0.312500
			if( d_tci > -41.6229 )
				if( d_tci <= -16.8112 )
					if( ci_wt2 <= 3.99394 )
						if( ci <= -86.1501 )
							if( ap <= 15.4644 )
								if( ci_wt2 <= -157.994 )
									ret := 0.571429
								if( ci_wt2 > -157.994 )
									ret := 0.264977
							if( ap > 15.4644 )
								if( d <= 0.029365 )
									ret := -0.256944
								if( d > 0.029365 )
									ret := 0.357143
						if( ci > -86.1501 )
							if( d <= 0.030903 )
								if( ci_wt2 <= -0.067583 )
									ret := 0.009281
								if( ci_wt2 > -0.067583 )
									ret := 0.265060
							if( d > 0.030903 )
								if( d_tci <= -20.5464 )
									ret := 0.324056
								if( d_tci > -20.5464 )
									ret := -0.490566
					if( ci_wt2 > 3.99394 )
						if( d <= 0.035771 )
							if( tci <= 17.5068 )
								if( wt2 <= 4.21352 )
									ret := 0.400000
								if( wt2 > 4.21352 )
									ret := 0.027344
							if( tci > 17.5068 )
								if( d_tci <= -41.0315 )
									ret := -0.280702
								if( d_tci > -41.0315 )
									ret := -0.062104
						if( d > 0.035771 )
							if( d <= 0.305844 )
								if( ci <= 102.56 )
									ret := -0.113367
								if( ci > 102.56 )
									ret := -0.669725
							if( d > 0.305844 )
								ret := 0.833333 // buy
				if( d_tci > -16.8112 )
					if( ci_wt2 <= -39.7172 )
						if( ci <= -26.3169 )
							if( wt2 <= 18.3968 )
								ret := 0.666667
							if( wt2 > 18.3968 )
								if( ci <= -47.9811 )
									ret := 0.156250
								if( ci > -47.9811 )
									ret := -0.228070
						if( ci > -26.3169 )
							if( ap <= 14.8427 )
								ret := 0.375000
							if( ap > 14.8427 )
								ret := 0.842105 // buy
					if( ci_wt2 > -39.7172 )
						if( wt2 <= 22.5083 )
							if( ci <= -2.59776 )
								if( ci_wt2 <= -24.1646 )
									ret := 0.017241
								if( ci_wt2 > -24.1646 )
									ret := 0.750000 // buy
							if( ci > -2.59776 )
								if( ap <= 16.0286 )
									ret := -0.150685
								if( ap > 16.0286 )
									ret := -0.471074
						if( wt2 > 22.5083 )
							if( d_tci <= -15.7226 )
								if( d <= 0.008712 )
									ret := -0.833333 // sell
								if( d > 0.008712 )
									ret := -0.500000
							if( d_tci > -15.7226 )
								ret := -0.416667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_667e818e(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)

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


