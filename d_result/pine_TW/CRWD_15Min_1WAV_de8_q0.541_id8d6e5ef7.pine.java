//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: CRWD_15Min_1WAV_8d6e5ef7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1WAV_8d6e5ef7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_8d6e5ef7(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d_tci <= -11.447 )
		if( ci_wt2 <= -26.1125 )
			if( tci <= 16.5007 )
				if( ci <= -39.996 )
					if( ci_wt2 <= -68.6926 )
						if( d_tci <= -13.5248 )
							if( ci_wt2 <= -99.6071 )
								if( d <= 0.651617 )
									ret := 0.062992
								if( d > 0.651617 )
									ret := 0.523077
							if( ci_wt2 > -99.6071 )
								if( d_tci <= -14.5417 )
									ret := -0.200000
								if( d_tci > -14.5417 )
									ret := 0.100000
						if( d_tci > -13.5248 )
							if( ci_wt2 <= -191.552 )
								if( d <= 0.607285 )
									ret := 0.000000
								if( d > 0.607285 )
									ret := -0.842105 // sell
							if( ci_wt2 > -191.552 )
								if( ci <= -85.4339 )
									ret := 0.043478
								if( ci > -85.4339 )
									ret := -0.262857
					if( ci_wt2 > -68.6926 )
						if( d <= 0.572542 )
							if( tci <= 14.8852 )
								if( d_tci <= -13.2439 )
									ret := 0.600000
								if( d_tci > -13.2439 )
									ret := 0.857143 // buy
							if( tci > 14.8852 )
								ret := 0.133333
						if( d > 0.572542 )
							ret := -0.461538
				if( ci > -39.996 )
					if( ci_wt2 <= -49.0641 )
						if( ci_wt2 <= -59.361 )
							ret := 0.210526
						if( ci_wt2 > -59.361 )
							if( tci <= 12.8314 )
								ret := 0.200000
							if( tci > 12.8314 )
								if( d_tci <= -13.4267 )
									ret := -0.530612
								if( d_tci > -13.4267 )
									ret := -0.970588 // sell
					if( ci_wt2 > -49.0641 )
						if( ci <= -16.7631 )
							if( ci <= -29.9218 )
								ret := -0.461538
							if( ci > -29.9218 )
								if( ap <= 115.086 )
									ret := 0.600000
								if( ap > 115.086 )
									ret := 0.087500
						if( ci > -16.7631 )
							if( d <= 0.338955 )
								if( wt2 <= 18.905 )
									ret := 0.714286 // buy
								if( wt2 > 18.905 )
									ret := 0.076923
							if( d > 0.338955 )
								if( esa <= 199.51 )
									ret := -0.702128 // sell
								if( esa > 199.51 )
									ret := -0.185185
			if( tci > 16.5007 )
				if( tci <= 20.9717 )
					if( esa <= 133.038 )
						if( d_tci <= -18.965 )
							if( tci <= 19.4225 )
								ret := -0.833333 // sell
							if( tci > 19.4225 )
								if( ci <= -40.4249 )
									ret := 0.168421
								if( ci > -40.4249 )
									ret := -0.253012
						if( d_tci > -18.965 )
							if( d_tci <= -17.0549 )
								if( esa <= 112.319 )
									ret := 0.335821
								if( esa > 112.319 )
									ret := -0.244444
							if( d_tci > -17.0549 )
								if( d <= 0.510438 )
									ret := 0.623188
								if( d > 0.510438 )
									ret := 0.000000
					if( esa > 133.038 )
						if( wt2 <= 37.7118 )
							if( tci <= 16.6194 )
								if( tci <= 16.5665 )
									ret := 0.714286 // buy
								if( tci > 16.5665 )
									ret := 0.933333 // buy
							if( tci > 16.6194 )
								if( ci_wt2 <= -188.016 )
									ret := 1.000000 // buy
								if( ci_wt2 > -188.016 )
									ret := 0.346972
						if( wt2 > 37.7118 )
							if( wt2 <= 39.0775 )
								ret := -0.636364
							if( wt2 > 39.0775 )
								ret := 0.090909
				if( tci > 20.9717 )
					if( tci <= 39.7932 )
						if( wt2 <= 36.9168 )
							if( wt2 <= 36.7777 )
								if( ap <= 308.677 )
									ret := 0.092937
								if( ap > 308.677 )
									ret := -0.252525
							if( wt2 > 36.7777 )
								if( d_tci <= -27.9455 )
									ret := 0.611111
								if( d_tci > -27.9455 )
									ret := 0.857143 // buy
						if( wt2 > 36.9168 )
							if( ap <= 98.4375 )
								if( d <= 0.633774 )
									ret := 0.072144
								if( d > 0.633774 )
									ret := 0.681818
							if( ap > 98.4375 )
								if( ap <= 133.045 )
									ret := -0.267760
								if( ap > 133.045 )
									ret := -0.065392
					if( tci > 39.7932 )
						if( esa <= 150.924 )
							if( ap <= 147.974 )
								if( esa <= 45.7472 )
									ret := 1.000000 // buy
								if( esa > 45.7472 )
									ret := 0.223374
							if( ap > 147.974 )
								if( wt2 <= 59.6 )
									ret := 0.342105
								if( wt2 > 59.6 )
									ret := 1.000000 // buy
						if( esa > 150.924 )
							if( wt2 <= 58.6643 )
								if( esa <= 319.572 )
									ret := 0.125117
								if( esa > 319.572 )
									ret := -0.428571
							if( wt2 > 58.6643 )
								if( esa <= 220.703 )
									ret := 0.020833
								if( esa > 220.703 )
									ret := -0.258760
		if( ci_wt2 > -26.1125 )
			if( wt2 <= 2.08749 )
				if( d <= 1.74554 )
					if( tci <= 15.9842 )
						if( ci_wt2 <= 141.227 )
							if( esa <= 151.174 )
								if( ap <= 117.51 )
									ret := -0.197674
								if( ap > 117.51 )
									ret := -0.684211
							if( esa > 151.174 )
								if( ci_wt2 <= 132.489 )
									ret := 0.134615
								if( ci_wt2 > 132.489 )
									ret := -0.555556
						if( ci_wt2 > 141.227 )
							if( wt2 <= -5.66729 )
								if( d <= 1.09689 )
									ret := 0.266667
								if( d > 1.09689 )
									ret := 0.789474 // buy
							if( wt2 > -5.66729 )
								if( tci <= 12.4549 )
									ret := -0.875000 // sell
								if( tci > 12.4549 )
									ret := 0.285714
					if( tci > 15.9842 )
						if( esa <= 87.4669 )
							if( ci <= 138.036 )
								ret := -0.470588
							if( ci > 138.036 )
								ret := 0.473684
						if( esa > 87.4669 )
							if( ci <= 173.713 )
								if( d_tci <= -17.4683 )
									ret := -0.096774
								if( d_tci > -17.4683 )
									ret := -0.634146
							if( ci > 173.713 )
								if( tci <= 19.2658 )
									ret := -0.696970
								if( tci > 19.2658 )
									ret := -1.000000 // sell
				if( d > 1.74554 )
					if( d_tci <= -13.3965 )
						if( ci_wt2 <= 143.151 )
							ret := -0.833333 // sell
						if( ci_wt2 > 143.151 )
							ret := -1.000000 // sell
					if( d_tci > -13.3965 )
						ret := 0.214286
			if( wt2 > 2.08749 )
				if( esa <= 338.738 )
					if( d <= 0.054605 )
						ret := 0.818182 // buy
					if( d > 0.054605 )
						if( ci <= 22.9682 )
							if( d_tci <= -16.1854 )
								if( ap <= 150.644 )
									ret := -0.381356
								if( ap > 150.644 )
									ret := -0.088889
							if( d_tci > -16.1854 )
								if( esa <= 126.964 )
									ret := -0.311475
								if( esa > 126.964 )
									ret := 0.246753
						if( ci > 22.9682 )
							if( ap <= 40.9222 )
								if( d_tci <= -35.1205 )
									ret := -0.872340 // sell
								if( d_tci > -35.1205 )
									ret := -0.051282
							if( ap > 40.9222 )
								if( d <= 10.9311 )
									ret := -0.051320
								if( d > 10.9311 )
									ret := 1.000000 // buy
				if( esa > 338.738 )
					if( ci_wt2 <= 90.3203 )
						if( d <= 2.5655 )
							if( wt2 <= 61.861 )
								if( d <= 0.482363 )
									ret := 0.135135
								if( d > 0.482363 )
									ret := -0.340659
							if( wt2 > 61.861 )
								ret := 0.500000
						if( d > 2.5655 )
							if( d <= 7.57315 )
								if( ci_wt2 <= 2.69195 )
									ret := -0.945946 // sell
								if( ci_wt2 > 2.69195 )
									ret := -0.666667
							if( d > 7.57315 )
								ret := -0.181818
					if( ci_wt2 > 90.3203 )
						if( ap <= 370.899 )
							if( d <= 1.13787 )
								ret := -0.875000 // sell
							if( d > 1.13787 )
								ret := 0.600000
						if( ap > 370.899 )
							if( ci_wt2 <= 163.405 )
								if( d <= 0.920495 )
									ret := -0.285714
								if( d > 0.920495 )
									ret := 0.307692
							if( ci_wt2 > 163.405 )
								ret := 0.866667 // buy
	if( d_tci > -11.447 )
		if( ci <= 32.1284 )
			if( ci <= -138.738 )
				if( d <= 0.740044 )
					if( ap <= 57.7623 )
						if( ci_wt2 <= -192.113 )
							if( tci <= -6.17217 )
								ret := 0.954545 // buy
							if( tci > -6.17217 )
								ret := 0.750000 // buy
						if( ci_wt2 > -192.113 )
							if( wt2 <= -6.46109 )
								if( tci <= -56.8463 )
									ret := 0.250000
								if( tci > -56.8463 )
									ret := 0.800000 // buy
							if( wt2 > -6.46109 )
								if( ci_wt2 <= -173.454 )
									ret := -0.272727
								if( ci_wt2 > -173.454 )
									ret := 0.200000
					if( ap > 57.7623 )
						if( tci <= -55.9401 )
							if( d_tci <= 64.077 )
								if( ci_wt2 <= -112.24 )
									ret := -0.666667
								if( ci_wt2 > -112.24 )
									ret := 0.100000
							if( d_tci > 64.077 )
								if( ci_wt2 <= -97.6166 )
									ret := 0.636364
								if( ci_wt2 > -97.6166 )
									ret := -0.200000
						if( tci > -55.9401 )
							if( esa <= 113.97 )
								if( d <= 0.604301 )
									ret := 0.231383
								if( d > 0.604301 )
									ret := -0.440000
							if( esa > 113.97 )
								if( d_tci <= 48.0003 )
									ret := 0.350074
								if( d_tci > 48.0003 )
									ret := 0.758065 // buy
				if( d > 0.740044 )
					if( ci_wt2 <= -144.029 )
						if( d_tci <= 8.70542 )
							if( ci <= -224.327 )
								ret := -0.909091 // sell
							if( ci > -224.327 )
								if( ap <= 271.818 )
									ret := 0.317708
								if( ap > 271.818 )
									ret := -0.661538
						if( d_tci > 8.70542 )
							if( esa <= 199.986 )
								if( ap <= 168.536 )
									ret := -0.250000
								if( ap > 168.536 )
									ret := -0.669725
							if( esa > 199.986 )
								if( tci <= -36.4687 )
									ret := 0.580645
								if( tci > -36.4687 )
									ret := -0.341615
					if( ci_wt2 > -144.029 )
						if( ap <= 98.7566 )
							if( ci <= -153.204 )
								ret := 0.800000 // buy
							if( ci > -153.204 )
								ret := 0.923077 // buy
						if( ap > 98.7566 )
							if( d_tci <= 39.9996 )
								if( tci <= -36.2312 )
									ret := 0.774194 // buy
								if( tci > -36.2312 )
									ret := 0.315789
							if( d_tci > 39.9996 )
								if( esa <= 127.558 )
									ret := -0.870968 // sell
								if( esa > 127.558 )
									ret := -0.055288
			if( ci > -138.738 )
				if( d <= 0.731486 )
					if( d_tci <= 72.037 )
						if( ap <= 37.8467 )
							if( d <= 0.510547 )
								if( ci <= -64.4151 )
									ret := 0.857143 // buy
								if( ci > -64.4151 )
									ret := -0.500000
							if( d > 0.510547 )
								if( esa <= 37.1904 )
									ret := 0.913043 // buy
								if( esa > 37.1904 )
									ret := 0.500000
						if( ap > 37.8467 )
							if( ap <= 317.973 )
								if( ci <= -119.337 )
									ret := -0.061728
								if( ci > -119.337 )
									ret := 0.068001
							if( ap > 317.973 )
								if( wt2 <= -31.5836 )
									ret := -0.559055
								if( wt2 > -31.5836 )
									ret := 0.019277
					if( d_tci > 72.037 )
						if( ci_wt2 <= -7.2835 )
							if( d_tci <= 75.7501 )
								ret := -1.000000 // sell
							if( d_tci > 75.7501 )
								ret := -0.909091 // sell
						if( ci_wt2 > -7.2835 )
							if( d_tci <= 78.7405 )
								ret := 0.210526
							if( d_tci > 78.7405 )
								ret := -1.000000 // sell
				if( d > 0.731486 )
					if( esa <= 101.506 )
						if( esa <= 74.4896 )
							if( d_tci <= 32.983 )
								if( ci <= -74.3606 )
									ret := -0.393939
								if( ci > -74.3606 )
									ret := -0.841463 // sell
							if( d_tci > 32.983 )
								if( tci <= -54.3819 )
									ret := 0.236534
								if( tci > -54.3819 )
									ret := -0.030303
						if( esa > 74.4896 )
							if( d_tci <= 65.5784 )
								if( d_tci <= 47.7785 )
									ret := 0.239741
								if( d_tci > 47.7785 )
									ret := 0.672222
							if( d_tci > 65.5784 )
								if( ci_wt2 <= -7.60916 )
									ret := -0.554054
								if( ci_wt2 > -7.60916 )
									ret := 0.517544
					if( esa > 101.506 )
						if( esa <= 106.278 )
							if( ap <= 103.303 )
								if( ci <= -87.5784 )
									ret := -0.612500
								if( ci > -87.5784 )
									ret := 0.211268
							if( ap > 103.303 )
								if( esa <= 105.511 )
									ret := -0.682927
								if( esa > 105.511 )
									ret := -1.000000 // sell
						if( esa > 106.278 )
							if( wt2 <= -64.7368 )
								if( tci <= -84.2627 )
									ret := -0.657143
								if( tci > -84.2627 )
									ret := 0.166801
							if( wt2 > -64.7368 )
								if( tci <= -13.032 )
									ret := -0.033374
								if( tci > -13.032 )
									ret := 0.048169
		if( ci > 32.1284 )
			if( ap <= 160.085 )
				if( ci <= 165.83 )
					if( ci_wt2 <= 184.7 )
						if( d <= 0.74927 )
							if( ap <= 54.4704 )
								if( tci <= -21.4435 )
									ret := -0.666667
								if( tci > -21.4435 )
									ret := -0.158358
							if( ap > 54.4704 )
								if( ci <= 156.335 )
									ret := -0.073451
								if( ci > 156.335 )
									ret := 0.681818
						if( d > 0.74927 )
							if( tci <= 9.85282 )
								if( esa <= 45.8076 )
									ret := 1.000000 // buy
								if( esa > 45.8076 )
									ret := -0.264706
							if( tci > 9.85282 )
								if( ci <= 54.3632 )
									ret := -0.411765
								if( ci > 54.3632 )
									ret := -0.857143 // sell
					if( ci_wt2 > 184.7 )
						if( ci <= 153.756 )
							ret := 0.200000
						if( ci > 153.756 )
							if( tci <= -20.0815 )
								ret := 0.777778 // buy
							if( tci > -20.0815 )
								ret := 0.888889 // buy
				if( ci > 165.83 )
					if( wt2 <= -35.4137 )
						if( d_tci <= 23.8534 )
							ret := 0.400000
						if( d_tci > 23.8534 )
							ret := 0.933333 // buy
					if( wt2 > -35.4137 )
						if( ap <= 155.261 )
							if( ci <= 205 )
								if( ap <= 118.117 )
									ret := -0.583333
								if( ap > 118.117 )
									ret := -0.891566 // sell
							if( ci > 205 )
								if( wt2 <= -22.6615 )
									ret := 0.375000
								if( wt2 > -22.6615 )
									ret := -0.222222
						if( ap > 155.261 )
							ret := 0.818182 // buy
			if( ap > 160.085 )
				if( wt2 <= -8.58534 )
					if( tci <= -44.0254 )
						if( esa <= 264.388 )
							if( ap <= 260.017 )
								if( ap <= 226.565 )
									ret := 0.620690
								if( ap > 226.565 )
									ret := -0.357143
							if( ap > 260.017 )
								ret := 1.000000 // buy
						if( esa > 264.388 )
							ret := -0.300000
					if( tci > -44.0254 )
						if( ci_wt2 <= 171.169 )
							if( wt2 <= -29.0408 )
								if( esa <= 183.87 )
									ret := 0.288525
								if( esa > 183.87 )
									ret := -0.098341
							if( wt2 > -29.0408 )
								if( tci <= -17.7345 )
									ret := -0.341969
								if( tci > -17.7345 )
									ret := -0.118093
						if( ci_wt2 > 171.169 )
							if( d <= 1.38995 )
								if( tci <= -4.31606 )
									ret := 0.325926
								if( tci > -4.31606 )
									ret := -0.247423
							if( d > 1.38995 )
								if( tci <= -10.2606 )
									ret := 0.212121
								if( tci > -10.2606 )
									ret := 0.826667 // buy
				if( wt2 > -8.58534 )
					if( ci_wt2 <= 25.0792 )
						ret := -1.000000 // sell
					if( ci_wt2 > 25.0792 )
						if( ap <= 172.788 )
							if( ci <= 115.324 )
								if( d_tci <= -9.00132 )
									ret := 0.785714 // buy
								if( d_tci > -9.00132 )
									ret := 0.211268
							if( ci > 115.324 )
								if( wt2 <= -5.66561 )
									ret := 0.625000
								if( wt2 > -5.66561 )
									ret := 0.941176 // buy
						if( ap > 172.788 )
							if( ap <= 345.443 )
								if( ap <= 321.347 )
									ret := 0.114724
								if( ap > 321.347 )
									ret := -0.366197
							if( ap > 345.443 )
								if( wt2 <= -1.97408 )
									ret := 0.250000
								if( wt2 > -1.97408 )
									ret := 0.851852 // buy
	
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
float op_operation = decision_tree_0_CRWD_15Min_8d6e5ef7(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


