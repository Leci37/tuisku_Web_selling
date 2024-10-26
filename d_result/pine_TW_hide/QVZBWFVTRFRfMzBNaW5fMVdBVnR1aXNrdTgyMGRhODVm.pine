//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AVAXUSDT_30Min_1WAV_820da85f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_1WAV_820da85f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_820da85f(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_tci <= 66.0304 )
		if( ci <= -76.5899 )
			if( esa <= 65.1431 )
				if( d <= 0.574151 )
					if( d <= 0.12754 )
						if( ap <= 5.7944 )
							if( d <= 0.021608 )
								if( ci <= -83.5617 )
									ret := -0.079070
								if( ci > -83.5617 )
									ret := 0.326531
							if( d > 0.021608 )
								if( tci <= -3.19794 )
									ret := 0.328549
								if( tci > -3.19794 )
									ret := -0.108911
						if( ap > 5.7944 )
							if( d_tci <= 12.1502 )
								if( tci <= 13.8006 )
									ret := 0.126005
								if( tci > 13.8006 )
									ret := -0.044386
							if( d_tci > 12.1502 )
								if( ap <= 12.2083 )
									ret := 0.021118
								if( ap > 12.2083 )
									ret := -0.084158
					if( d > 0.12754 )
						if( ap <= 16.8097 )
							if( ci <= -119.796 )
								if( d <= 0.171067 )
									ret := 0.327103
								if( d > 0.171067 )
									ret := -0.039604
							if( ci > -119.796 )
								if( d <= 0.196842 )
									ret := 0.289189
								if( d > 0.196842 )
									ret := 0.626543
						if( ap > 16.8097 )
							if( d_tci <= 8.19127 )
								if( ci <= -178.641 )
									ret := -0.866667 // sell
								if( ci > -178.641 )
									ret := -0.051739
							if( d_tci > 8.19127 )
								if( ap <= 31.3261 )
									ret := 0.221870
								if( ap > 31.3261 )
									ret := 0.054742
				if( d > 0.574151 )
					if( d <= 1.13186 )
						if( ci_wt2 <= -163.587 )
							ret := 1.000000 // buy
						if( ci_wt2 > -163.587 )
							if( esa <= 54.5463 )
								if( esa <= 49.6977 )
									ret := 0.299566
								if( esa > 49.6977 )
									ret := 0.663265
							if( esa > 54.5463 )
								if( ci <= -110.657 )
									ret := 0.529412
								if( ci > -110.657 )
									ret := -0.156028
					if( d > 1.13186 )
						if( d_tci <= 63.0436 )
							if( ci_wt2 <= -92.4684 )
								if( wt2 <= 45.7838 )
									ret := 0.949153 // buy
								if( wt2 > 45.7838 )
									ret := 0.500000
							if( ci_wt2 > -92.4684 )
								if( tci <= -36.7771 )
									ret := 0.719101 // buy
								if( tci > -36.7771 )
									ret := -0.461538
						if( d_tci > 63.0436 )
							if( ci_wt2 <= -28.0962 )
								ret := 0.000000
							if( ci_wt2 > -28.0962 )
								ret := -0.750000 // sell
			if( esa > 65.1431 )
				if( ci <= -145.03 )
					if( wt2 <= -45.5796 )
						if( d <= 0.69645 )
							if( d <= 0.606623 )
								ret := -0.500000
							if( d > 0.606623 )
								ret := -1.000000 // sell
						if( d > 0.69645 )
							if( wt2 <= -48.8448 )
								ret := 0.250000
							if( wt2 > -48.8448 )
								ret := -0.500000
					if( wt2 > -45.5796 )
						if( ci_wt2 <= -111.761 )
							if( ci_wt2 <= -153.951 )
								if( ap <= 95.945 )
									ret := 0.353846
								if( ap > 95.945 )
									ret := 0.800000 // buy
							if( ci_wt2 > -153.951 )
								if( d_tci <= 19.3333 )
									ret := -0.666667
								if( d_tci > 19.3333 )
									ret := 0.136986
						if( ci_wt2 > -111.761 )
							if( d <= 0.60956 )
								if( ci_wt2 <= -107.939 )
									ret := 0.750000 // buy
								if( ci_wt2 > -107.939 )
									ret := 0.250000
							if( d > 0.60956 )
								if( tci <= -52.2164 )
									ret := 0.750000 // buy
								if( tci > -52.2164 )
									ret := 1.000000 // buy
				if( ci > -145.03 )
					if( ci <= -85.5759 )
						if( ci <= -113.568 )
							if( ci <= -125.052 )
								if( ap <= 126.65 )
									ret := -0.260223
								if( ap > 126.65 )
									ret := 1.000000 // buy
							if( ci > -125.052 )
								if( ap <= 73.3422 )
									ret := -0.218182
								if( ap > 73.3422 )
									ret := 0.524823
						if( ci > -113.568 )
							if( ap <= 69.7633 )
								if( ap <= 64.8167 )
									ret := -0.500000
								if( ap > 64.8167 )
									ret := 0.252174
							if( ap > 69.7633 )
								if( ci_wt2 <= -136.421 )
									ret := 0.380952
								if( ci_wt2 > -136.421 )
									ret := -0.293725
					if( ci > -85.5759 )
						if( ap <= 85.8553 )
							if( ap <= 65.4506 )
								if( d_tci <= 54.2027 )
									ret := -0.333333
								if( d_tci > 54.2027 )
									ret := -1.000000 // sell
							if( ap > 65.4506 )
								if( ap <= 84.7321 )
									ret := 0.337500
								if( ap > 84.7321 )
									ret := 1.000000 // buy
						if( ap > 85.8553 )
							if( tci <= 12.2638 )
								if( wt2 <= -12.8325 )
									ret := -0.155340
								if( wt2 > -12.8325 )
									ret := 0.341463
							if( tci > 12.2638 )
								if( d_tci <= -21.1038 )
									ret := -0.250000
								if( d_tci > -21.1038 )
									ret := -0.900000 // sell
		if( ci > -76.5899 )
			if( tci <= -9.80899 )
				if( esa <= 65.5818 )
					if( ci <= -63.4565 )
						if( d <= 0.212475 )
							if( esa <= 7.07779 )
								if( d <= 0.043655 )
									ret := 0.088496
								if( d > 0.043655 )
									ret := 0.666667
							if( esa > 7.07779 )
								if( ci_wt2 <= -44.0604 )
									ret := -0.137339
								if( ci_wt2 > -44.0604 )
									ret := 0.025516
						if( d > 0.212475 )
							if( tci <= -60.4658 )
								if( d <= 0.627327 )
									ret := -0.051948
								if( d > 0.627327 )
									ret := -0.607843
							if( tci > -60.4658 )
								if( ap <= 27.3688 )
									ret := 0.443804
								if( ap > 27.3688 )
									ret := 0.173375
					if( ci > -63.4565 )
						if( d <= 0.818478 )
							if( esa <= 57.841 )
								if( ci_wt2 <= 138.275 )
									ret := 0.006266
								if( ci_wt2 > 138.275 )
									ret := 0.202198
							if( esa > 57.841 )
								if( ci_wt2 <= 102.011 )
									ret := 0.301508
								if( ci_wt2 > 102.011 )
									ret := -0.297872
						if( d > 0.818478 )
							if( d_tci <= 36.8592 )
								if( esa <= 53.7596 )
									ret := -0.735537 // sell
								if( esa > 53.7596 )
									ret := -0.219512
							if( d_tci > 36.8592 )
								if( wt2 <= -64.8692 )
									ret := 0.356164
								if( wt2 > -64.8692 )
									ret := -0.118110
				if( esa > 65.5818 )
					if( esa <= 119.379 )
						if( d_tci <= 56.6098 )
							if( tci <= -12.7615 )
								if( wt2 <= -57.9515 )
									ret := -0.606061
								if( wt2 > -57.9515 )
									ret := -0.125789
							if( tci > -12.7615 )
								if( ci <= 3.40537 )
									ret := 0.371429
								if( ci > 3.40537 )
									ret := -0.117647
						if( d_tci > 56.6098 )
							if( ci <= -73.2137 )
								if( d <= 1.09868 )
									ret := 0.200000
								if( d > 1.09868 )
									ret := -0.705882 // sell
							if( ci > -73.2137 )
								if( ci_wt2 <= 38.55 )
									ret := 0.284444
								if( ci_wt2 > 38.55 )
									ret := -0.157143
					if( esa > 119.379 )
						if( ci_wt2 <= -25.8019 )
							if( d <= 2.02661 )
								if( ci <= -71.5385 )
									ret := 0.333333
								if( ci > -71.5385 )
									ret := -0.500000
							if( d > 2.02661 )
								ret := 0.500000
						if( ci_wt2 > -25.8019 )
							if( d <= 0.549958 )
								ret := 0.500000
							if( d > 0.549958 )
								if( ci <= -51.5961 )
									ret := -0.266667
								if( ci > -51.5961 )
									ret := -0.795699 // sell
			if( tci > -9.80899 )
				if( wt2 <= 19.0908 )
					if( ap <= 94.2764 )
						if( esa <= 86.4214 )
							if( d <= 0.73357 )
								if( esa <= 59.2245 )
									ret := 0.076777
								if( esa > 59.2245 )
									ret := 0.197991
							if( d > 0.73357 )
								if( tci <= -3.44114 )
									ret := -0.592105
								if( tci > -3.44114 )
									ret := -0.020089
						if( esa > 86.4214 )
							if( d_tci <= -26.9634 )
								if( tci <= 28.7421 )
									ret := -0.750000 // sell
								if( tci > 28.7421 )
									ret := -1.000000 // sell
							if( d_tci > -26.9634 )
								if( d <= 0.99455 )
									ret := -0.218121
								if( d > 0.99455 )
									ret := 0.446809
					if( ap > 94.2764 )
						if( tci <= -2.10003 )
							if( ci <= -5.37492 )
								if( ap <= 123.377 )
									ret := 0.081633
								if( ap > 123.377 )
									ret := 1.000000 // buy
							if( ci > -5.37492 )
								if( tci <= -8.54278 )
									ret := 0.150000
								if( tci > -8.54278 )
									ret := -0.480000
						if( tci > -2.10003 )
							if( ci <= 129.312 )
								if( esa <= 113.4 )
									ret := 0.524804
								if( esa > 113.4 )
									ret := 0.075188
							if( ci > 129.312 )
								if( ap <= 99.46 )
									ret := -0.952381 // sell
								if( ap > 99.46 )
									ret := 0.450000
				if( wt2 > 19.0908 )
					if( ci_wt2 <= -85.2206 )
						if( d <= 1.21594 )
							if( ci_wt2 <= -168.077 )
								if( ci_wt2 <= -218.093 )
									ret := 0.500000
								if( ci_wt2 > -218.093 )
									ret := -0.888889 // sell
							if( ci_wt2 > -168.077 )
								if( ci <= -22.7462 )
									ret := -0.098313
								if( ci > -22.7462 )
									ret := 0.400000
						if( d > 1.21594 )
							if( ci_wt2 <= -111.47 )
								if( ci <= -64.2519 )
									ret := -1.000000 // sell
								if( ci > -64.2519 )
									ret := -0.250000
							if( ci_wt2 > -111.47 )
								if( ci_wt2 <= -105.681 )
									ret := 1.000000 // buy
								if( ci_wt2 > -105.681 )
									ret := 0.812500 // buy
					if( ci_wt2 > -85.2206 )
						if( ci_wt2 <= -6.99765 )
							if( tci <= 18.0096 )
								if( ci_wt2 <= -80.0219 )
									ret := 0.262626
								if( ci_wt2 > -80.0219 )
									ret := -0.151466
							if( tci > 18.0096 )
								if( ap <= 3.69786 )
									ret := 0.336996
								if( ap > 3.69786 )
									ret := 0.076807
						if( ci_wt2 > -6.99765 )
							if( d <= 2.20976 )
								if( wt2 <= 70.2379 )
									ret := 0.020808
								if( wt2 > 70.2379 )
									ret := -0.203354
							if( d > 2.20976 )
								if( ci_wt2 <= 49.5083 )
									ret := -0.346939
								if( ci_wt2 > 49.5083 )
									ret := -0.857143 // sell
	if( d_tci > 66.0304 )
		if( esa <= 27.1903 )
			if( ci <= -165.914 )
				if( esa <= 20.2119 )
					if( ap <= 18.2911 )
						if( tci <= -76.0799 )
							ret := 1.000000 // buy
						if( tci > -76.0799 )
							if( ap <= 9.61273 )
								ret := 1.000000 // buy
							if( ap > 9.61273 )
								if( ci <= -197.606 )
									ret := 0.000000
								if( ci > -197.606 )
									ret := 0.500000
					if( ap > 18.2911 )
						ret := -0.750000 // sell
				if( esa > 20.2119 )
					ret := 1.000000 // buy
			if( ci > -165.914 )
				if( ci_wt2 <= -83.8786 )
					if( ap <= 19.04 )
						if( ci_wt2 <= -102.806 )
							ret := -0.857143 // sell
						if( ci_wt2 > -102.806 )
							if( d_tci <= 68.9037 )
								ret := -0.250000
							if( d_tci > 68.9037 )
								if( ci_wt2 <= -89.446 )
									ret := 0.000000
								if( ci_wt2 > -89.446 )
									ret := 0.250000
					if( ap > 19.04 )
						ret := -1.000000 // sell
				if( ci_wt2 > -83.8786 )
					if( ap <= 8.94 )
						if( ci_wt2 <= 25.9924 )
							if( d <= 0.036264 )
								if( ci_wt2 <= -44.8661 )
									ret := -0.900000 // sell
								if( ci_wt2 > -44.8661 )
									ret := 0.333333
							if( d > 0.036264 )
								if( wt2 <= -68.1019 )
									ret := 0.478261
								if( wt2 > -68.1019 )
									ret := 0.714286 // buy
						if( ci_wt2 > 25.9924 )
							if( ci <= -35.0723 )
								if( d <= 0.075167 )
									ret := -0.250000
								if( d > 0.075167 )
									ret := -1.000000 // sell
							if( ci > -35.0723 )
								if( d_tci <= 70.3142 )
									ret := 0.600000
								if( d_tci > 70.3142 )
									ret := 0.000000
					if( ap > 8.94 )
						if( d_tci <= 83.9444 )
							if( tci <= -72.4092 )
								if( esa <= 16.3725 )
									ret := 0.127660
								if( esa > 16.3725 )
									ret := -0.264840
							if( tci > -72.4092 )
								if( wt2 <= -62.9932 )
									ret := 0.171375
								if( wt2 > -62.9932 )
									ret := -0.156250
						if( d_tci > 83.9444 )
							if( esa <= 11.0373 )
								ret := -0.500000
							if( esa > 11.0373 )
								if( d <= 0.318927 )
									ret := 0.000000
								if( d > 0.318927 )
									ret := 0.750000 // buy
		if( esa > 27.1903 )
			if( ap <= 33.6294 )
				if( d <= 0.37361 )
					if( esa <= 28.5455 )
						if( tci <= -67.2411 )
							ret := 0.500000
						if( tci > -67.2411 )
							ret := 1.000000 // buy
					if( esa > 28.5455 )
						if( ap <= 29.3299 )
							if( d <= 0.306266 )
								ret := 0.000000
							if( d > 0.306266 )
								ret := -0.500000
						if( ap > 29.3299 )
							if( d <= 0.275827 )
								if( ci_wt2 <= -9.14498 )
									ret := 0.000000
								if( ci_wt2 > -9.14498 )
									ret := -0.250000
							if( d > 0.275827 )
								if( d_tci <= 67.3899 )
									ret := 1.000000 // buy
								if( d_tci > 67.3899 )
									ret := 0.421053
				if( d > 0.37361 )
					if( ci_wt2 <= 54.7278 )
						if( wt2 <= -60.7623 )
							if( ci_wt2 <= -14.3428 )
								if( wt2 <= -61.1951 )
									ret := 0.948052 // buy
								if( wt2 > -61.1951 )
									ret := 0.600000
							if( ci_wt2 > -14.3428 )
								if( d <= 0.658468 )
									ret := 0.472222
								if( d > 0.658468 )
									ret := 0.826923 // buy
						if( wt2 > -60.7623 )
							if( ci_wt2 <= -44.8749 )
								if( ci_wt2 <= -102.923 )
									ret := -0.200000
								if( ci_wt2 > -102.923 )
									ret := 0.937500 // buy
							if( ci_wt2 > -44.8749 )
								ret := -0.666667
					if( ci_wt2 > 54.7278 )
						ret := -0.250000
			if( ap > 33.6294 )
				if( ci_wt2 <= 15.7831 )
					if( wt2 <= -75.8884 )
						if( ap <= 96.756 )
							if( ci <= -70.874 )
								if( d_tci <= 76.4846 )
									ret := 0.750000 // buy
								if( d_tci > 76.4846 )
									ret := 1.000000 // buy
							if( ci > -70.874 )
								if( wt2 <= -77.5553 )
									ret := 1.000000 // buy
								if( wt2 > -77.5553 )
									ret := 0.250000
						if( ap > 96.756 )
							if( ap <= 101.495 )
								ret := -0.800000 // sell
							if( ap > 101.495 )
								ret := 0.600000
					if( wt2 > -75.8884 )
						if( d <= 1.11618 )
							if( ci <= -109.386 )
								if( ci_wt2 <= -66.8607 )
									ret := 0.351351
								if( ci_wt2 > -66.8607 )
									ret := 0.655172
							if( ci > -109.386 )
								if( wt2 <= -74.2706 )
									ret := 0.750000 // buy
								if( wt2 > -74.2706 )
									ret := -0.054348
						if( d > 1.11618 )
							if( tci <= -75.0325 )
								if( tci <= -76.3726 )
									ret := 0.076923
								if( tci > -76.3726 )
									ret := -0.619048
							if( tci > -75.0325 )
								if( ap <= 57.061 )
									ret := 0.849057 // buy
								if( ap > 57.061 )
									ret := 0.495575
				if( ci_wt2 > 15.7831 )
					if( wt2 <= -67.3449 )
						if( ci_wt2 <= 67.1623 )
							if( esa <= 40.4258 )
								if( ci_wt2 <= 43.0573 )
									ret := -0.500000
								if( ci_wt2 > 43.0573 )
									ret := 0.368421
							if( esa > 40.4258 )
								if( ci_wt2 <= 17.6881 )
									ret := -0.714286 // sell
								if( ci_wt2 > 17.6881 )
									ret := 0.413793
						if( ci_wt2 > 67.1623 )
							if( ci <= 2.52104 )
								ret := -1.000000 // sell
							if( ci > 2.52104 )
								ret := 0.000000
					if( wt2 > -67.3449 )
						if( esa <= 78.3079 )
							if( d <= 0.821084 )
								ret := -0.500000
							if( d > 0.821084 )
								if( d_tci <= 66.4682 )
									ret := -0.750000 // sell
								if( d_tci > 66.4682 )
									ret := -1.000000 // sell
						if( esa > 78.3079 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_820da85f(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


