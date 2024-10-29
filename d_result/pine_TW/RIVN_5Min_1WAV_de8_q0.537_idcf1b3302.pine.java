//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: RIVN_5Min_1WAV_cf1b3302 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_1WAV_cf1b3302", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_cf1b3302(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tci <= -65.8983 )
		if( ci <= -67.1649 )
			if( tci <= -79.8366 )
				if( d <= 0.081961 )
					if( ci <= -124.922 )
						if( wt2 <= -71.6858 )
							ret := 0.923077 // buy
						if( wt2 > -71.6858 )
							ret := 0.250000
					if( ci > -124.922 )
						if( wt2 <= -80.155 )
							ret := 0.900000 // buy
						if( wt2 > -80.155 )
							ret := -0.307692
				if( d > 0.081961 )
					if( ci_wt2 <= -2.5874 )
						if( wt2 <= -78.3939 )
							if( ci_wt2 <= -19.7578 )
								if( esa <= 17.0765 )
									ret := -1.000000 // sell
								if( esa > 17.0765 )
									ret := -0.500000
							if( ci_wt2 > -19.7578 )
								ret := -0.437500
						if( wt2 > -78.3939 )
							if( d <= 0.098051 )
								ret := 0.153846
							if( d > 0.098051 )
								if( ci <= -148.935 )
									ret := 0.076923
								if( ci > -148.935 )
									ret := -0.671875
					if( ci_wt2 > -2.5874 )
						if( wt2 <= -83.1115 )
							if( tci <= -86.6503 )
								if( ci_wt2 <= 4.30456 )
									ret := 0.700000 // buy
								if( ci_wt2 > 4.30456 )
									ret := 0.000000
							if( tci > -86.6503 )
								ret := -0.615385
						if( wt2 > -83.1115 )
							ret := 0.785714 // buy
			if( tci > -79.8366 )
				if( d <= 0.134306 )
					if( ap <= 20.7473 )
						if( tci <= -68.0014 )
							if( d <= 0.029412 )
								ret := 0.040000
							if( d > 0.029412 )
								if( d <= 0.123178 )
									ret := 0.635789
								if( d > 0.123178 )
									ret := 0.934783 // buy
						if( tci > -68.0014 )
							if( d <= 0.051963 )
								if( esa <= 14.339 )
									ret := 0.697368
								if( esa > 14.339 )
									ret := -0.066667
							if( d > 0.051963 )
								if( d_tci <= 67.0863 )
									ret := -0.276923
								if( d_tci > 67.0863 )
									ret := 0.378788
					if( ap > 20.7473 )
						if( wt2 <= -71.4931 )
							ret := 0.785714 // buy
						if( wt2 > -71.4931 )
							if( ci_wt2 <= -77.236 )
								ret := -0.772727 // sell
							if( ci_wt2 > -77.236 )
								if( tci <= -70.6148 )
									ret := -0.181818
								if( tci > -70.6148 )
									ret := -0.500000
				if( d > 0.134306 )
					if( tci <= -75.1246 )
						if( esa <= 14.0123 )
							ret := -0.250000
						if( esa > 14.0123 )
							if( ci <= -160.341 )
								ret := 0.000000
							if( ci > -160.341 )
								if( tci <= -76.7063 )
									ret := 0.684211
								if( tci > -76.7063 )
									ret := 0.909091 // buy
					if( tci > -75.1246 )
						if( ap <= 11.0336 )
							ret := 0.928571 // buy
						if( ap > 11.0336 )
							if( esa <= 12.9469 )
								if( ci <= -73.102 )
									ret := -1.000000 // sell
								if( ci > -73.102 )
									ret := -0.272727
							if( esa > 12.9469 )
								if( ci <= -74.5889 )
									ret := -0.312195
								if( ci > -74.5889 )
									ret := 0.733333 // buy
		if( ci > -67.1649 )
			if( wt2 <= -76.5457 )
				if( ci_wt2 <= 44.4767 )
					if( wt2 <= -85.2589 )
						if( ap <= 22.0349 )
							if( ap <= 17.889 )
								ret := -0.375000
							if( ap > 17.889 )
								ret := 0.812500 // buy
						if( ap > 22.0349 )
							ret := -1.000000 // sell
					if( wt2 > -85.2589 )
						if( d_tci <= 73.4402 )
							ret := 0.200000
						if( d_tci > 73.4402 )
							if( ci <= -43.4305 )
								if( tci <= -79.7291 )
									ret := -0.392157
								if( tci > -79.7291 )
									ret := -0.791667 // sell
							if( ci > -43.4305 )
								ret := -0.210526
				if( ci_wt2 > 44.4767 )
					if( ci <= -33.1963 )
						if( wt2 <= -86.4561 )
							ret := 0.777778 // buy
						if( wt2 > -86.4561 )
							ret := 1.000000 // buy
					if( ci > -33.1963 )
						if( ap <= 15.3908 )
							if( wt2 <= -79.6433 )
								ret := -0.136364
							if( wt2 > -79.6433 )
								ret := -0.636364
						if( ap > 15.3908 )
							ret := 0.428571
			if( wt2 > -76.5457 )
				if( ci <= -60.1939 )
					if( ci_wt2 <= 0.193178 )
						ret := 0.666667
					if( ci_wt2 > 0.193178 )
						if( wt2 <= -66.0051 )
							if( wt2 <= -70.4183 )
								if( d_tci <= 71.436 )
									ret := -0.722222 // sell
								if( d_tci > 71.436 )
									ret := -0.137255
							if( wt2 > -70.4183 )
								if( tci <= -69.1956 )
									ret := 0.500000
								if( tci > -69.1956 )
									ret := -0.208333
						if( wt2 > -66.0051 )
							ret := -1.000000 // sell
				if( ci > -60.1939 )
					if( wt2 <= -68.6461 )
						if( esa <= 23.882 )
							if( ap <= 10.1156 )
								ret := -0.636364
							if( ap > 10.1156 )
								if( ci_wt2 <= 32.465 )
									ret := 0.191710
								if( ci_wt2 > 32.465 )
									ret := 0.520710
						if( esa > 23.882 )
							if( tci <= -72.8715 )
								ret := 0.833333 // buy
							if( tci > -72.8715 )
								if( ci <= -48.9037 )
									ret := 1.000000 // buy
								if( ci > -48.9037 )
									ret := 0.714286 // buy
					if( wt2 > -68.6461 )
						if( ci <= -58.4105 )
							ret := 0.818182 // buy
						if( ci > -58.4105 )
							if( d_tci <= 66.7485 )
								ret := 0.066667
							if( d_tci > 66.7485 )
								if( ci_wt2 <= 29.3497 )
									ret := -0.367347
								if( ci_wt2 > 29.3497 )
									ret := -1.000000 // sell
	if( tci > -65.8983 )
		if( ci <= 35.2548 )
			if( esa <= 16.4064 )
				if( wt2 <= -58.2604 )
					if( d <= 0.050205 )
						if( tci <= -50.7626 )
							if( ci_wt2 <= -10.7155 )
								if( ci <= -79.5191 )
									ret := 0.087719
								if( ci > -79.5191 )
									ret := 0.761905 // buy
							if( ci_wt2 > -10.7155 )
								if( tci <= -63.4204 )
									ret := 0.323077
								if( tci > -63.4204 )
									ret := -0.090487
						if( tci > -50.7626 )
							ret := 0.888889 // buy
					if( d > 0.050205 )
						if( ci_wt2 <= 50.9456 )
							if( wt2 <= -61.7566 )
								if( ci_wt2 <= 41.6787 )
									ret := 0.013187
								if( ci_wt2 > 41.6787 )
									ret := -0.636364
							if( wt2 > -61.7566 )
								if( tci <= -56.0107 )
									ret := -0.403941
								if( tci > -56.0107 )
									ret := 0.261905
						if( ci_wt2 > 50.9456 )
							if( tci <= -59.9286 )
								if( d_tci <= 60.987 )
									ret := 0.571429
								if( d_tci > 60.987 )
									ret := -0.642857
							if( tci > -59.9286 )
								if( ci <= 7.09354 )
									ret := -0.964286 // sell
								if( ci > 7.09354 )
									ret := -0.416667
				if( wt2 > -58.2604 )
					if( ci <= -119.668 )
						if( esa <= 9.23887 )
							if( ci_wt2 <= -134.506 )
								if( esa <= 9.03819 )
									ret := 0.571429
								if( esa > 9.03819 )
									ret := -0.222222
							if( ci_wt2 > -134.506 )
								if( wt2 <= -37.1026 )
									ret := -0.650000
								if( wt2 > -37.1026 )
									ret := -0.193548
						if( esa > 9.23887 )
							if( ap <= 16.3009 )
								if( ci_wt2 <= -208.143 )
									ret := 0.423280
								if( ci_wt2 > -208.143 )
									ret := 0.142857
							if( ap > 16.3009 )
								ret := 0.875000 // buy
					if( ci > -119.668 )
						if( ci_wt2 <= 57.181 )
							if( ci_wt2 <= 52.1644 )
								if( esa <= 14.3435 )
									ret := 0.030551
								if( esa > 14.3435 )
									ret := 0.075276
							if( ci_wt2 > 52.1644 )
								if( tci <= -46.084 )
									ret := -0.916667 // sell
								if( tci > -46.084 )
									ret := -0.126531
						if( ci_wt2 > 57.181 )
							if( d_tci <= 48.5694 )
								if( d <= 0.075965 )
									ret := 0.248257
								if( d > 0.075965 )
									ret := -0.422222
							if( d_tci > 48.5694 )
								if( tci <= -50.4953 )
									ret := -0.062500
								if( tci > -50.4953 )
									ret := 0.887324 // buy
			if( esa > 16.4064 )
				if( d_tci <= 0.865053 )
					if( ci <= -28.746 )
						if( ci_wt2 <= -130.924 )
							if( d_tci <= -25.1074 )
								if( wt2 <= 42.5205 )
									ret := 0.913043 // buy
								if( wt2 > 42.5205 )
									ret := 0.363636
							if( d_tci > -25.1074 )
								if( ap <= 19.5823 )
									ret := -0.055944
								if( ap > 19.5823 )
									ret := 0.308696
						if( ci_wt2 > -130.924 )
							if( d_tci <= -28.3639 )
								if( tci <= 35.0125 )
									ret := 0.368421
								if( tci > 35.0125 )
									ret := 0.134703
							if( d_tci > -28.3639 )
								if( tci <= 22.4135 )
									ret := 0.070146
								if( tci > 22.4135 )
									ret := -0.174699
					if( ci > -28.746 )
						if( ci_wt2 <= -16.3519 )
							if( tci <= 2.81151 )
								if( wt2 <= 7.29289 )
									ret := 0.757576 // buy
								if( wt2 > 7.29289 )
									ret := 0.166667
							if( tci > 2.81151 )
								if( esa <= 23.673 )
									ret := -0.034327
								if( esa > 23.673 )
									ret := -0.211640
						if( ci_wt2 > -16.3519 )
							if( tci <= 47.1693 )
								if( ci_wt2 <= 0.273931 )
									ret := 0.178487
								if( ci_wt2 > 0.273931 )
									ret := -0.067729
							if( tci > 47.1693 )
								if( tci <= 48.4108 )
									ret := 0.972222 // buy
								if( tci > 48.4108 )
									ret := 0.000000
				if( d_tci > 0.865053 )
					if( ap <= 22.3867 )
						if( ci_wt2 <= -76.4797 )
							if( d_tci <= 2.36631 )
								if( esa <= 19.0151 )
									ret := -0.125000
								if( esa > 19.0151 )
									ret := -0.750000 // sell
							if( d_tci > 2.36631 )
								if( ap <= 17.2099 )
									ret := -0.088235
								if( ap > 17.2099 )
									ret := 0.080131
						if( ci_wt2 > -76.4797 )
							if( ci <= -49.281 )
								if( d <= 0.029206 )
									ret := -0.008576
								if( d > 0.029206 )
									ret := -0.227938
							if( ci > -49.281 )
								if( tci <= -54.8624 )
									ret := 0.209424
								if( tci > -54.8624 )
									ret := -0.053865
					if( ap > 22.3867 )
						if( ap <= 22.6322 )
							if( d_tci <= 10.3574 )
								if( ci_wt2 <= -36.2469 )
									ret := 0.705882 // buy
								if( ci_wt2 > -36.2469 )
									ret := 1.000000 // buy
							if( d_tci > 10.3574 )
								if( tci <= -15.2932 )
									ret := 0.232804
								if( tci > -15.2932 )
									ret := -0.454545
						if( ap > 22.6322 )
							if( wt2 <= -6.03762 )
								if( ci <= -86.4622 )
									ret := -0.088486
								if( ci > -86.4622 )
									ret := 0.064538
							if( wt2 > -6.03762 )
								if( d <= 0.059673 )
									ret := -0.028078
								if( d > 0.059673 )
									ret := -0.380471
		if( ci > 35.2548 )
			if( esa <= 20.9695 )
				if( tci <= 80.1493 )
					if( tci <= 68.6984 )
						if( wt2 <= 60.4393 )
							if( ci_wt2 <= 22.7643 )
								if( d_tci <= -36.5261 )
									ret := 0.069794
								if( d_tci > -36.5261 )
									ret := -0.133412
							if( ci_wt2 > 22.7643 )
								if( d_tci <= -63.8148 )
									ret := -0.365957
								if( d_tci > -63.8148 )
									ret := -0.060893
						if( wt2 > 60.4393 )
							if( d_tci <= -63.2913 )
								if( d <= 0.048113 )
									ret := 0.211538
								if( d > 0.048113 )
									ret := -0.212014
							if( d_tci > -63.2913 )
								if( ci <= 65.1421 )
									ret := -0.461972
								if( ci > 65.1421 )
									ret := 0.081395
					if( tci > 68.6984 )
						if( ci <= 37.4483 )
							ret := 0.909091 // buy
						if( ci > 37.4483 )
							if( ap <= 14.8792 )
								if( tci <= 72.3065 )
									ret := 0.508197
								if( tci > 72.3065 )
									ret := 0.038278
							if( ap > 14.8792 )
								if( tci <= 73.0735 )
									ret := -0.035714
								if( tci > 73.0735 )
									ret := -0.346154
				if( tci > 80.1493 )
					if( ci_wt2 <= 83.442 )
						if( esa <= 15.7629 )
							if( ci_wt2 <= 5.69738 )
								if( d <= 0.124242 )
									ret := -0.650000
								if( d > 0.124242 )
									ret := -0.883117 // sell
							if( ci_wt2 > 5.69738 )
								if( ap <= 13.9073 )
									ret := -0.150000
								if( ap > 13.9073 )
									ret := -0.720000 // sell
						if( esa > 15.7629 )
							if( ci_wt2 <= 14.0272 )
								if( ci <= 79.2252 )
									ret := -0.034483
								if( ci > 79.2252 )
									ret := 0.450000
							if( ci_wt2 > 14.0272 )
								if( d <= 0.230276 )
									ret := -0.517241
								if( d > 0.230276 )
									ret := -1.000000 // sell
					if( ci_wt2 > 83.442 )
						if( ci_wt2 <= 121.618 )
							ret := 0.357143
						if( ci_wt2 > 121.618 )
							ret := 1.000000 // buy
			if( esa > 20.9695 )
				if( d <= 0.088161 )
					if( ci_wt2 <= 40.2347 )
						if( esa <= 26.2539 )
							if( ci <= 68.0592 )
								if( d <= 0.059009 )
									ret := -0.044860
								if( d > 0.059009 )
									ret := 0.110749
							if( ci > 68.0592 )
								if( tci <= 57.718 )
									ret := -0.471591
								if( tci > 57.718 )
									ret := 0.000000
						if( esa > 26.2539 )
							if( wt2 <= 39.7729 )
								if( tci <= 25.8917 )
									ret := -0.375000
								if( tci > 25.8917 )
									ret := 0.133333
							if( wt2 > 39.7729 )
								if( d <= 0.051345 )
									ret := 0.083333
								if( d > 0.051345 )
									ret := 0.809524 // buy
					if( ci_wt2 > 40.2347 )
						if( ci <= 247.275 )
							if( ap <= 24.1587 )
								if( wt2 <= 44.8395 )
									ret := 0.073333
								if( wt2 > 44.8395 )
									ret := -0.337209
							if( ap > 24.1587 )
								if( tci <= 7.6469 )
									ret := 0.053659
								if( tci > 7.6469 )
									ret := 0.281005
						if( ci > 247.275 )
							if( ci <= 267.973 )
								ret := -0.846154 // sell
							if( ci > 267.973 )
								ret := -0.214286
				if( d > 0.088161 )
					if( d <= 0.089675 )
						if( wt2 <= 46.8886 )
							if( ci <= 77.5727 )
								if( ci_wt2 <= 51.5087 )
									ret := 0.333333
								if( ci_wt2 > 51.5087 )
									ret := -0.538462
							if( ci > 77.5727 )
								if( ap <= 23.6349 )
									ret := -0.200000
								if( ap > 23.6349 )
									ret := -0.800000 // sell
						if( wt2 > 46.8886 )
							ret := -0.904762 // sell
					if( d > 0.089675 )
						if( d_tci <= 27.0746 )
							if( ci <= 58.8327 )
								if( d <= 0.269285 )
									ret := -0.012567
								if( d > 0.269285 )
									ret := 0.456522
							if( ci > 58.8327 )
								if( ci_wt2 <= 90.2592 )
									ret := -0.067953
								if( ci_wt2 > 90.2592 )
									ret := -0.316489
						if( d_tci > 27.0746 )
							if( wt2 <= -46.2876 )
								if( d_tci <= 38.6454 )
									ret := -0.117647
								if( d_tci > 38.6454 )
									ret := 0.400000
							if( wt2 > -46.2876 )
								if( wt2 <= -43.8432 )
									ret := 1.000000 // buy
								if( wt2 > -43.8432 )
									ret := 0.555556
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_RIVN_5Min_cf1b3302(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)

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


