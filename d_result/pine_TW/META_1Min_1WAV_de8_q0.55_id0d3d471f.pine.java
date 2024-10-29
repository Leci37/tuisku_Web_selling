//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: META_1Min_1WAV_0d3d471f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_1WAV_0d3d471f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_0d3d471f(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wt2 <= 3.42406 )
		if( ci_wt2 <= 144.671 )
			if( tci <= -19.3596 )
				if( ci <= -44.6022 )
					if( ap <= 430.821 )
						if( d_tci <= 35.1977 )
							if( wt2 <= -16.1138 )
								if( ci_wt2 <= -54.6738 )
									ret := -0.302326
								if( ci_wt2 > -54.6738 )
									ret := 0.550000
							if( wt2 > -16.1138 )
								if( wt2 <= -9.40878 )
									ret := 0.500000
								if( wt2 > -9.40878 )
									ret := 0.923077 // buy
						if( d_tci > 35.1977 )
							if( ci_wt2 <= -15.8335 )
								if( d <= 0.311377 )
									ret := 0.096774
								if( d > 0.311377 )
									ret := 0.664921
							if( ci_wt2 > -15.8335 )
								if( tci <= -72.7621 )
									ret := 0.823529 // buy
								if( tci > -72.7621 )
									ret := 0.142857
					if( ap > 430.821 )
						if( ap <= 459.215 )
							if( tci <= -69.4927 )
								if( ap <= 445.822 )
									ret := 0.870588 // buy
								if( ap > 445.822 )
									ret := -0.225000
							if( tci > -69.4927 )
								if( tci <= -53.6768 )
									ret := -0.372007
								if( tci > -53.6768 )
									ret := -0.029070
						if( ap > 459.215 )
							if( ci_wt2 <= -28.175 )
								if( tci <= -83.8433 )
									ret := -0.833333 // sell
								if( tci > -83.8433 )
									ret := 0.032806
							if( ci_wt2 > -28.175 )
								if( d_tci <= 79.9327 )
									ret := 0.112127
								if( d_tci > 79.9327 )
									ret := -0.355828
				if( ci > -44.6022 )
					if( tci <= -50.2118 )
						if( ci <= -31.3755 )
							if( ap <= 466.384 )
								if( esa <= 458.718 )
									ret := -0.394231
								if( esa > 458.718 )
									ret := 0.546296
							if( ap > 466.384 )
								if( esa <= 524.271 )
									ret := -0.375897
								if( esa > 524.271 )
									ret := -0.143646
						if( ci > -31.3755 )
							if( esa <= 464.506 )
								if( ci_wt2 <= 39.6796 )
									ret := 0.873016 // buy
								if( ci_wt2 > 39.6796 )
									ret := 0.306250
							if( esa > 464.506 )
								if( esa <= 545.244 )
									ret := -0.152511
								if( esa > 545.244 )
									ret := 0.150838
					if( tci > -50.2118 )
						if( d <= 7.10875 )
							if( d <= 0.434707 )
								if( ap <= 440.076 )
									ret := 0.337408
								if( ap > 440.076 )
									ret := 0.028187
							if( d > 0.434707 )
								if( d_tci <= 22.8128 )
									ret := -0.260223
								if( d_tci > 22.8128 )
									ret := -0.022923
						if( d > 7.10875 )
							ret := -1.000000 // sell
			if( tci > -19.3596 )
				if( esa <= 500.715 )
					if( d <= 0.661947 )
						if( wt2 <= -11.1561 )
							if( tci <= -16.3648 )
								if( wt2 <= -14.3029 )
									ret := 0.089209
								if( wt2 > -14.3029 )
									ret := -0.320442
							if( tci > -16.3648 )
								if( esa <= 468.169 )
									ret := -0.318129
								if( esa > 468.169 )
									ret := -0.108484
						if( wt2 > -11.1561 )
							if( esa <= 416.538 )
								ret := 0.888889 // buy
							if( esa > 416.538 )
								if( tci <= -1.54763 )
									ret := 0.114998
								if( tci > -1.54763 )
									ret := -0.027978
					if( d > 0.661947 )
						if( wt2 <= -2.3219 )
							if( esa <= 430.659 )
								if( ap <= 426.073 )
									ret := -0.970588 // sell
								if( ap > 426.073 )
									ret := -0.600000
							if( esa > 430.659 )
								if( wt2 <= -19.3594 )
									ret := -0.059322
								if( wt2 > -19.3594 )
									ret := -0.285484
						if( wt2 > -2.3219 )
							if( ap <= 481.231 )
								if( wt2 <= -1.71556 )
									ret := 0.666667
								if( wt2 > -1.71556 )
									ret := -0.296000
							if( ap > 481.231 )
								if( tci <= 3.93083 )
									ret := 0.875000 // buy
								if( tci > 3.93083 )
									ret := -0.258065
				if( esa > 500.715 )
					if( wt2 <= -13.1847 )
						if( tci <= -18.4282 )
							if( ci_wt2 <= 20.9819 )
								if( wt2 <= -15.7452 )
									ret := 0.333333
								if( wt2 > -15.7452 )
									ret := -0.305556
							if( ci_wt2 > 20.9819 )
								if( ci_wt2 <= 51.6971 )
									ret := -0.807692 // sell
								if( ci_wt2 > 51.6971 )
									ret := -0.411215
						if( tci > -18.4282 )
							if( d <= 1.05384 )
								if( d_tci <= 2.9844 )
									ret := 0.316770
								if( d_tci > 2.9844 )
									ret := -0.022527
							if( d > 1.05384 )
								ret := 0.842105 // buy
					if( wt2 > -13.1847 )
						if( wt2 <= -6.80585 )
							if( d <= 0.714355 )
								if( ci_wt2 <= 112.806 )
									ret := -0.233581
								if( ci_wt2 > 112.806 )
									ret := 0.096552
							if( d > 0.714355 )
								if( wt2 <= -7.91502 )
									ret := -0.833333 // sell
								if( wt2 > -7.91502 )
									ret := -0.076923
						if( wt2 > -6.80585 )
							if( esa <= 593.699 )
								if( ap <= 530.33 )
									ret := -0.076237
								if( ap > 530.33 )
									ret := -0.178065
							if( esa > 593.699 )
								if( ci_wt2 <= -95.4489 )
									ret := 0.000000
								if( ci_wt2 > -95.4489 )
									ret := -0.714286 // sell
		if( ci_wt2 > 144.671 )
			if( esa <= 535.409 )
				if( d <= 0.356609 )
					if( tci <= 18.7495 )
						if( d <= 0.142801 )
							if( wt2 <= -26.5921 )
								ret := 0.066667
							if( wt2 > -26.5921 )
								if( ap <= 492.411 )
									ret := -0.333333
								if( ap > 492.411 )
									ret := 0.214286
						if( d > 0.142801 )
							if( ap <= 431.81 )
								ret := 0.090909
							if( ap > 431.81 )
								if( ci_wt2 <= 262.518 )
									ret := -0.601578
								if( ci_wt2 > 262.518 )
									ret := -1.000000 // sell
					if( tci > 18.7495 )
						ret := 0.071429
				if( d > 0.356609 )
					if( d_tci <= 26.7235 )
						if( ci_wt2 <= 182.594 )
							if( ci_wt2 <= 167.805 )
								if( d <= 1.15957 )
									ret := -0.164384
								if( d > 1.15957 )
									ret := 0.533333
							if( ci_wt2 > 167.805 )
								if( ci <= 160.354 )
									ret := 0.088889
								if( ci > 160.354 )
									ret := 0.837209 // buy
						if( ci_wt2 > 182.594 )
							if( ci <= 181.327 )
								if( ap <= 476.019 )
									ret := -0.416667
								if( ap > 476.019 )
									ret := -1.000000 // sell
							if( ci > 181.327 )
								if( esa <= 507.776 )
									ret := -0.581633
								if( esa > 507.776 )
									ret := 0.275862
					if( d_tci > 26.7235 )
						if( ap <= 497.999 )
							if( ap <= 455.776 )
								ret := -1.000000 // sell
							if( ap > 455.776 )
								if( tci <= -36.1471 )
									ret := 0.294118
								if( tci > -36.1471 )
									ret := -0.423077
						if( ap > 497.999 )
							if( d <= 0.484905 )
								if( ci_wt2 <= 156.004 )
									ret := -0.923077 // sell
								if( ci_wt2 > 156.004 )
									ret := -0.714286 // sell
							if( d > 0.484905 )
								if( ci <= 104.271 )
									ret := -0.900000 // sell
								if( ci > 104.271 )
									ret := -1.000000 // sell
			if( esa > 535.409 )
				if( d <= 0.346842 )
					if( ci_wt2 <= 162.06 )
						if( ci_wt2 <= 150.611 )
							ret := -0.375000
						if( ci_wt2 > 150.611 )
							if( ap <= 539.083 )
								ret := 0.583333
							if( ap > 539.083 )
								if( tci <= -15.6954 )
									ret := 0.200000
								if( tci > -15.6954 )
									ret := -0.083333
					if( ci_wt2 > 162.06 )
						if( d_tci <= 20.5153 )
							if( d <= 0.262276 )
								if( ci <= 184.529 )
									ret := -0.227273
								if( ci > 184.529 )
									ret := -0.909091 // sell
							if( d > 0.262276 )
								ret := -0.066667
						if( d_tci > 20.5153 )
							if( d_tci <= 21.9619 )
								ret := -1.000000 // sell
							if( d_tci > 21.9619 )
								ret := -0.615385
				if( d > 0.346842 )
					if( esa <= 584.215 )
						if( d_tci <= 12.7791 )
							if( ap <= 557.876 )
								ret := 0.800000 // buy
							if( ap > 557.876 )
								ret := -0.636364
						if( d_tci > 12.7791 )
							ret := 0.913043 // buy
					if( esa > 584.215 )
						ret := -0.400000
	if( wt2 > 3.42406 )
		if( tci <= 55.9269 )
			if( d_tci <= -8.41823 )
				if( ci <= -137.838 )
					if( esa <= 500.848 )
						if( tci <= 17.5782 )
							if( wt2 <= 24.9258 )
								ret := 0.888889 // buy
							if( wt2 > 24.9258 )
								if( ci_wt2 <= -183.591 )
									ret := 0.894737 // buy
								if( ci_wt2 > -183.591 )
									ret := 0.238095
						if( tci > 17.5782 )
							if( ci_wt2 <= -201.109 )
								if( esa <= 460.583 )
									ret := 0.888889 // buy
								if( esa > 460.583 )
									ret := 0.971429 // buy
							if( ci_wt2 > -201.109 )
								if( d <= 0.430817 )
									ret := 0.461538
								if( d > 0.430817 )
									ret := 1.000000 // buy
					if( esa > 500.848 )
						if( d_tci <= -11.838 )
							if( ci_wt2 <= -232.728 )
								ret := -0.222222
							if( ci_wt2 > -232.728 )
								if( tci <= 21.3948 )
									ret := 0.829268 // buy
								if( tci > 21.3948 )
									ret := 0.333333
						if( d_tci > -11.838 )
							if( ci <= -148.779 )
								if( ap <= 538.248 )
									ret := 0.846154 // buy
								if( ap > 538.248 )
									ret := 0.000000
							if( ci > -148.779 )
								ret := -0.764706 // sell
				if( ci > -137.838 )
					if( esa <= 432.46 )
						if( ap <= 424.742 )
							if( d_tci <= -14.4734 )
								if( ci <= -16.0107 )
									ret := 0.970149 // buy
								if( ci > -16.0107 )
									ret := 0.394495
							if( d_tci > -14.4734 )
								ret := -0.333333
						if( ap > 424.742 )
							if( d_tci <= -31.4865 )
								if( tci <= 48.9947 )
									ret := 0.457944
								if( tci > 48.9947 )
									ret := 0.113924
							if( d_tci > -31.4865 )
								if( tci <= 27.1759 )
									ret := 0.206478
								if( tci > 27.1759 )
									ret := -0.419753
					if( esa > 432.46 )
						if( esa <= 496.925 )
							if( d <= 0.355829 )
								if( d_tci <= -24.878 )
									ret := 0.076459
								if( d_tci > -24.878 )
									ret := -0.053687
							if( d > 0.355829 )
								if( wt2 <= 62.5097 )
									ret := -0.056711
								if( wt2 > 62.5097 )
									ret := -0.754717 // sell
						if( esa > 496.925 )
							if( ap <= 520.514 )
								if( ci <= -113.852 )
									ret := 0.758333 // buy
								if( ci > -113.852 )
									ret := 0.086648
							if( ap > 520.514 )
								if( d <= 0.845312 )
									ret := 0.026630
								if( d > 0.845312 )
									ret := -0.280303
			if( d_tci > -8.41823 )
				if( ap <= 517.437 )
					if( ci <= 82.7317 )
						if( ci <= -113.446 )
							if( ci_wt2 <= -137.847 )
								if( esa <= 453.627 )
									ret := -0.397727
								if( esa > 453.627 )
									ret := 0.258706
							if( ci_wt2 > -137.847 )
								if( d_tci <= 8.82649 )
									ret := 0.318182
								if( d_tci > 8.82649 )
									ret := 0.831169 // buy
						if( ci > -113.446 )
							if( esa <= 490.013 )
								if( esa <= 473.798 )
									ret := 0.175546
								if( esa > 473.798 )
									ret := -0.164265
							if( esa > 490.013 )
								if( d_tci <= 8.94572 )
									ret := 0.177541
								if( d_tci > 8.94572 )
									ret := 0.893617 // buy
					if( ci > 82.7317 )
						ret := -0.950000 // sell
				if( ap > 517.437 )
					if( ci <= -82.989 )
						if( tci <= -6.22529 )
							if( d_tci <= 14.2473 )
								if( esa <= 584.242 )
									ret := -0.156250
								if( esa > 584.242 )
									ret := -0.600000
							if( d_tci > 14.2473 )
								ret := 0.681818
						if( tci > -6.22529 )
							if( ap <= 536.952 )
								if( esa <= 519.836 )
									ret := -0.343750
								if( esa > 519.836 )
									ret := 0.462500
							if( ap > 536.952 )
								if( ap <= 589.676 )
									ret := -0.008000
								if( ap > 589.676 )
									ret := 0.444444
					if( ci > -82.989 )
						if( ap <= 536.998 )
							if( esa <= 530.412 )
								if( ci_wt2 <= 38.3977 )
									ret := -0.023873
								if( ci_wt2 > 38.3977 )
									ret := -0.896552 // sell
							if( esa > 530.412 )
								if( ap <= 532.248 )
									ret := -0.614035
								if( ap > 532.248 )
									ret := -0.295652
						if( ap > 536.998 )
							if( ci <= -68.4474 )
								if( ci_wt2 <= -90.0378 )
									ret := 0.309524
								if( ci_wt2 > -90.0378 )
									ret := -0.452174
							if( ci > -68.4474 )
								if( ap <= 570.091 )
									ret := 0.344660
								if( ap > 570.091 )
									ret := -0.035088
		if( tci > 55.9269 )
			if( ci_wt2 <= 106.334 )
				if( d <= 0.603332 )
					if( esa <= 483.212 )
						if( tci <= 77.3658 )
							if( ci <= 126.357 )
								if( wt2 <= 64.7286 )
									ret := 0.046826
								if( wt2 > 64.7286 )
									ret := 0.278947
							if( ci > 126.357 )
								if( esa <= 464.391 )
									ret := -0.062500
								if( esa > 464.391 )
									ret := 0.700000 // buy
						if( tci > 77.3658 )
							if( ci <= 81.8868 )
								ret := 0.454545
							if( ci > 81.8868 )
								if( ci <= 104.456 )
									ret := 0.935484 // buy
								if( ci > 104.456 )
									ret := 0.615385
					if( esa > 483.212 )
						if( tci <= 70.6348 )
							if( ap <= 527.859 )
								if( wt2 <= 59.0145 )
									ret := -0.214403
								if( wt2 > 59.0145 )
									ret := -0.040992
							if( ap > 527.859 )
								if( ap <= 529.557 )
									ret := 0.458333
								if( ap > 529.557 )
									ret := 0.034029
						if( tci > 70.6348 )
							if( ci <= 128.751 )
								if( ap <= 494.138 )
									ret := -0.388889
								if( ap > 494.138 )
									ret := 0.298932
							if( ci > 128.751 )
								ret := -0.583333
				if( d > 0.603332 )
					if( ap <= 529.107 )
						if( wt2 <= 47.8721 )
							if( d_tci <= -56.2527 )
								if( esa <= 468.601 )
									ret := 0.375000
								if( esa > 468.601 )
									ret := 0.892857 // buy
							if( d_tci > -56.2527 )
								if( ci <= 119.529 )
									ret := 0.727273 // buy
								if( ci > 119.529 )
									ret := -0.500000
						if( wt2 > 47.8721 )
							if( ap <= 519.071 )
								if( ci_wt2 <= 91.1269 )
									ret := -0.220816
								if( ci_wt2 > 91.1269 )
									ret := 0.730769 // buy
							if( ap > 519.071 )
								if( ci <= 31.5534 )
									ret := 0.171429
								if( ci > 31.5534 )
									ret := -0.637255
					if( ap > 529.107 )
						if( ci_wt2 <= -29.7217 )
							if( wt2 <= 74.3746 )
								if( ap <= 541.268 )
									ret := 0.075000
								if( ap > 541.268 )
									ret := 0.538462
							if( wt2 > 74.3746 )
								if( d_tci <= -73.8064 )
									ret := 0.904762 // buy
								if( d_tci > -73.8064 )
									ret := 0.705882 // buy
						if( ci_wt2 > -29.7217 )
							if( tci <= 68.5996 )
								if( ci <= 35.2188 )
									ret := -1.000000 // sell
								if( ci > 35.2188 )
									ret := -0.217949
							if( tci > 68.5996 )
								if( d <= 0.894948 )
									ret := 0.120253
								if( d > 0.894948 )
									ret := 0.396825
			if( ci_wt2 > 106.334 )
				if( esa <= 465.514 )
					ret := 0.909091 // buy
				if( esa > 465.514 )
					if( wt2 <= 48.7223 )
						if( ci <= 193.83 )
							if( d <= 0.450742 )
								ret := 0.000000
							if( d > 0.450742 )
								if( ci_wt2 <= 129.693 )
									ret := -0.903226 // sell
								if( ci_wt2 > 129.693 )
									ret := -0.600000
						if( ci > 193.83 )
							ret := -1.000000 // sell
					if( wt2 > 48.7223 )
						if( wt2 <= 51.7784 )
							ret := 0.000000
						if( wt2 > 51.7784 )
							ret := -0.700000 // sell
	
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
float op_operation = decision_tree_0_META_1Min_0d3d471f(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


