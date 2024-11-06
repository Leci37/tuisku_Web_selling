//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: LYFT_1Min_1WAV_0ee56cff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1WAV_0ee56cff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_0ee56cff(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d_tci <= -35.5894 )
		if( ci_wt2 <= 51.858 )
			if( d_tci <= -56.4706 )
				if( d <= 0.049242 )
					if( ap <= 9.73583 )
						if( wt2 <= 65.9454 )
							if( wt2 <= 57.2536 )
								ret := -0.200000
							if( wt2 > 57.2536 )
								if( ci_wt2 <= 10.3726 )
									ret := 1.000000 // buy
								if( ci_wt2 > 10.3726 )
									ret := 0.600000
						if( wt2 > 65.9454 )
							ret := -0.300000
					if( ap > 9.73583 )
						if( d_tci <= -76.312 )
							if( ci_wt2 <= 15.9669 )
								if( wt2 <= 77.2114 )
									ret := 0.166667
								if( wt2 > 77.2114 )
									ret := 0.000000
							if( ci_wt2 > 15.9669 )
								if( ci <= 98.9307 )
									ret := 1.000000 // buy
								if( ci > 98.9307 )
									ret := 0.700000 // buy
						if( d_tci > -76.312 )
							if( ap <= 15.2806 )
								if( wt2 <= 65.6721 )
									ret := -0.176374
								if( wt2 > 65.6721 )
									ret := -0.353228
							if( ap > 15.2806 )
								if( ap <= 15.6052 )
									ret := 0.380531
								if( ap > 15.6052 )
									ret := -0.096921
				if( d > 0.049242 )
					if( tci <= 70.8091 )
						if( ci <= 82.0057 )
							if( tci <= 64.8074 )
								if( ci <= 73.8005 )
									ret := -0.071795
								if( ci > 73.8005 )
									ret := -0.904762 // sell
							if( tci > 64.8074 )
								if( ci <= 32.6246 )
									ret := -0.214286
								if( ci > 32.6246 )
									ret := 0.717391 // buy
						if( ci > 82.0057 )
							if( d_tci <= -61.5999 )
								if( ap <= 15.4786 )
									ret := 1.000000 // buy
								if( ap > 15.4786 )
									ret := 0.465116
							if( d_tci > -61.5999 )
								if( d <= 0.061239 )
									ret := 0.533333
								if( d > 0.061239 )
									ret := -0.916667 // sell
					if( tci > 70.8091 )
						if( esa <= 11.2498 )
							if( esa <= 11.042 )
								ret := -0.400000
							if( esa > 11.042 )
								if( tci <= 76.5537 )
									ret := 1.000000 // buy
								if( tci > 76.5537 )
									ret := 0.909091 // buy
						if( esa > 11.2498 )
							if( d_tci <= -78.5335 )
								if( d <= 0.2288 )
									ret := 0.259259
								if( d > 0.2288 )
									ret := -0.900000 // sell
							if( d_tci > -78.5335 )
								if( tci <= 72.3012 )
									ret := -0.153846
								if( tci > 72.3012 )
									ret := -0.637097
			if( d_tci > -56.4706 )
				if( ci <= -38.6624 )
					if( d <= 0.019472 )
						if( esa <= 12.0651 )
							if( esa <= 10.3153 )
								ret := -0.133333
							if( esa > 10.3153 )
								if( wt2 <= 51.8456 )
									ret := 0.587302
								if( wt2 > 51.8456 )
									ret := -0.044444
						if( esa > 12.0651 )
							if( tci <= 54.5908 )
								if( wt2 <= 57.8906 )
									ret := -0.091463
								if( wt2 > 57.8906 )
									ret := -0.758621 // sell
							if( tci > 54.5908 )
								ret := 0.500000
					if( d > 0.019472 )
						if( ci_wt2 <= -88.0373 )
							if( wt2 <= 53.6866 )
								if( tci <= 37.2038 )
									ret := -0.222222
								if( tci > 37.2038 )
									ret := 0.622047
							if( wt2 > 53.6866 )
								if( tci <= 46.8932 )
									ret := -0.473684
								if( tci > 46.8932 )
									ret := 0.596774
						if( ci_wt2 > -88.0373 )
							if( wt2 <= 42.4375 )
								ret := 0.750000 // buy
							if( wt2 > 42.4375 )
								ret := 1.000000 // buy
				if( ci > -38.6624 )
					if( d_tci <= -49.6744 )
						if( d_tci <= -53.6687 )
							if( ap <= 9.96735 )
								if( wt2 <= 52.9584 )
									ret := -0.750000 // sell
								if( wt2 > 52.9584 )
									ret := 0.307692
							if( ap > 9.96735 )
								if( ap <= 11.3 )
									ret := 0.217143
								if( ap > 11.3 )
									ret := -0.050052
						if( d_tci > -53.6687 )
							if( esa <= 11.2585 )
								if( tci <= 50.2598 )
									ret := 0.023256
								if( tci > 50.2598 )
									ret := 0.511737
							if( esa > 11.2585 )
								if( esa <= 15.2765 )
									ret := 0.002217
								if( esa > 15.2765 )
									ret := 0.175214
					if( d_tci > -49.6744 )
						if( wt2 <= 41.0322 )
							if( ci_wt2 <= 49.7795 )
								if( d <= 0.038832 )
									ret := 0.028863
								if( d > 0.038832 )
									ret := -0.622642
							if( ci_wt2 > 49.7795 )
								if( esa <= 12.2608 )
									ret := 0.750000 // buy
								if( esa > 12.2608 )
									ret := 0.204545
						if( wt2 > 41.0322 )
							if( d <= 0.016115 )
								if( ap <= 10.7314 )
									ret := -0.238095
								if( ap > 10.7314 )
									ret := 0.002085
							if( d > 0.016115 )
								if( ci_wt2 <= 7.41626 )
									ret := -0.184158
								if( ci_wt2 > 7.41626 )
									ret := -0.358696
		if( ci_wt2 > 51.858 )
			if( ci_wt2 <= 137.356 )
				if( esa <= 12.5055 )
					if( ap <= 10.33 )
						if( ci_wt2 <= 58.8065 )
							if( wt2 <= 35.5079 )
								if( ci_wt2 <= 56.8365 )
									ret := -0.666667
								if( ci_wt2 > 56.8365 )
									ret := -1.000000 // sell
							if( wt2 > 35.5079 )
								ret := -0.533333
						if( ci_wt2 > 58.8065 )
							if( tci <= 39.8982 )
								if( d <= 0.015932 )
									ret := -0.656250
								if( d > 0.015932 )
									ret := 0.111111
							if( tci > 39.8982 )
								if( ci <= 137.263 )
									ret := 0.166667
								if( ci > 137.263 )
									ret := -0.642857
					if( ap > 10.33 )
						if( ci <= 165.367 )
							if( d_tci <= -73.1496 )
								ret := 0.857143 // buy
							if( d_tci > -73.1496 )
								if( ci_wt2 <= 126.785 )
									ret := -0.077687
								if( ci_wt2 > 126.785 )
									ret := 0.750000 // buy
						if( ci > 165.367 )
							ret := -0.923077 // sell
				if( esa > 12.5055 )
					if( d_tci <= -75.6256 )
						ret := 0.666667
					if( d_tci > -75.6256 )
						if( ci_wt2 <= 93.7868 )
							if( ci_wt2 <= 64.9594 )
								if( wt2 <= 45.9418 )
									ret := -0.115023
								if( wt2 > 45.9418 )
									ret := -0.480952
							if( ci_wt2 > 64.9594 )
								if( ci_wt2 <= 68.8189 )
									ret := -0.641221
								if( ci_wt2 > 68.8189 )
									ret := -0.391821
						if( ci_wt2 > 93.7868 )
							if( ci <= 128.006 )
								if( ap <= 13.6721 )
									ret := 0.000000
								if( ap > 13.6721 )
									ret := 0.707692 // buy
							if( ci > 128.006 )
								if( esa <= 12.6593 )
									ret := -0.763158 // sell
								if( esa > 12.6593 )
									ret := -0.122995
			if( ci_wt2 > 137.356 )
				if( ap <= 10.8793 )
					ret := 0.294118
				if( ap > 10.8793 )
					if( ap <= 16.5675 )
						if( d <= 0.030719 )
							if( ci_wt2 <= 166.541 )
								if( ci_wt2 <= 142.74 )
									ret := -0.944444 // sell
								if( ci_wt2 > 142.74 )
									ret := -0.488889
							if( ci_wt2 > 166.541 )
								if( ci <= 269.295 )
									ret := 0.093750
								if( ci > 269.295 )
									ret := 1.000000 // buy
						if( d > 0.030719 )
							if( tci <= 51.6693 )
								if( ci_wt2 <= 154.301 )
									ret := -1.000000 // sell
								if( ci_wt2 > 154.301 )
									ret := -0.352941
							if( tci > 51.6693 )
								ret := -1.000000 // sell
					if( ap > 16.5675 )
						if( ci_wt2 <= 165.852 )
							ret := -1.000000 // sell
						if( ci_wt2 > 165.852 )
							ret := -0.900000 // sell
	if( d_tci > -35.5894 )
		if( ci_wt2 <= 13.8444 )
			if( d <= 0.009695 )
				if( ci_wt2 <= -151.292 )
					if( esa <= 10.4155 )
						if( ci <= -159.197 )
							ret := -0.500000
						if( ci > -159.197 )
							ret := 0.111111
					if( esa > 10.4155 )
						if( d_tci <= -2.90361 )
							if( esa <= 12.4256 )
								if( ap <= 11.5817 )
									ret := 0.785714 // buy
								if( ap > 11.5817 )
									ret := 1.000000 // buy
							if( esa > 12.4256 )
								if( ap <= 12.7705 )
									ret := -0.363636
								if( ap > 12.7705 )
									ret := 0.642857
						if( d_tci > -2.90361 )
							if( tci <= -32.7555 )
								ret := 0.700000 // buy
							if( tci > -32.7555 )
								if( wt2 <= -8.50372 )
									ret := -0.666667
								if( wt2 > -8.50372 )
									ret := 0.224138
				if( ci_wt2 > -151.292 )
					if( tci <= 31.2119 )
						if( esa <= 10.7221 )
							if( d_tci <= -1.43163 )
								if( wt2 <= 15.9185 )
									ret := 0.190476
								if( wt2 > 15.9185 )
									ret := 0.463687
							if( d_tci > -1.43163 )
								if( tci <= -12.877 )
									ret := 0.219512
								if( tci > -12.877 )
									ret := 0.007353
						if( esa > 10.7221 )
							if( ci_wt2 <= 7.17122 )
								if( wt2 <= 35.2368 )
									ret := 0.000939
								if( wt2 > 35.2368 )
									ret := -0.263889
							if( ci_wt2 > 7.17122 )
								if( d_tci <= 23.8415 )
									ret := 0.284884
								if( d_tci > 23.8415 )
									ret := 0.069620
					if( tci > 31.2119 )
						if( d_tci <= -33.6436 )
							if( ci_wt2 <= -31.746 )
								if( tci <= 34.9738 )
									ret := -0.034483
								if( tci > 34.9738 )
									ret := -0.608696
							if( ci_wt2 > -31.746 )
								if( ci <= 10.386 )
									ret := 0.571429
								if( ci > 10.386 )
									ret := 0.074074
						if( d_tci > -33.6436 )
							if( ap <= 11.6753 )
								if( d_tci <= -32.4634 )
									ret := -0.208333
								if( d_tci > -32.4634 )
									ret := -0.642857
							if( ap > 11.6753 )
								if( ap <= 16.0198 )
									ret := -0.225000
								if( ap > 16.0198 )
									ret := 0.076923
			if( d > 0.009695 )
				if( d_tci <= 37.1469 )
					if( ci <= -17.0562 )
						if( d_tci <= -0.845156 )
							if( d_tci <= -1.94602 )
								if( tci <= 2.01129 )
									ret := -0.812500 // sell
								if( tci > 2.01129 )
									ret := 0.212228
							if( d_tci > -1.94602 )
								if( esa <= 17.1259 )
									ret := 0.443925
								if( esa > 17.1259 )
									ret := 0.857143 // buy
						if( d_tci > -0.845156 )
							if( ci_wt2 <= -161.464 )
								if( d_tci <= 28.6411 )
									ret := 0.438163
								if( d_tci > 28.6411 )
									ret := 0.017241
							if( ci_wt2 > -161.464 )
								if( ap <= 13.415 )
									ret := 0.188805
								if( ap > 13.415 )
									ret := 0.055801
					if( ci > -17.0562 )
						if( d <= 0.050939 )
							if( ci <= 37.5252 )
								if( esa <= 14.8948 )
									ret := -0.069662
								if( esa > 14.8948 )
									ret := 0.069264
							if( ci > 37.5252 )
								if( d_tci <= -32.172 )
									ret := 0.183908
								if( d_tci > -32.172 )
									ret := 0.559524
						if( d > 0.050939 )
							if( d_tci <= -27.2239 )
								ret := -1.000000 // sell
							if( d_tci > -27.2239 )
								if( wt2 <= 23.2665 )
									ret := -0.818182 // sell
								if( wt2 > 23.2665 )
									ret := -0.500000
				if( d_tci > 37.1469 )
					if( ci_wt2 <= -30.4533 )
						if( esa <= 15.7113 )
							if( d_tci <= 73.3432 )
								if( esa <= 9.69352 )
									ret := -0.307692
								if( esa > 9.69352 )
									ret := 0.181768
							if( d_tci > 73.3432 )
								if( ci <= -116.702 )
									ret := -0.589286
								if( ci > -116.702 )
									ret := 0.081633
						if( esa > 15.7113 )
							if( d_tci <= 62.634 )
								if( ci <= -115.958 )
									ret := -0.214286
								if( ci > -115.958 )
									ret := 0.044678
							if( d_tci > 62.634 )
								if( ci_wt2 <= -46.6285 )
									ret := 0.457143
								if( ci_wt2 > -46.6285 )
									ret := 0.152941
					if( ci_wt2 > -30.4533 )
						if( esa <= 13.5759 )
							if( d_tci <= 63.6354 )
								if( ci_wt2 <= 12.69 )
									ret := 0.042977
								if( ci_wt2 > 12.69 )
									ret := 0.736842 // buy
							if( d_tci > 63.6354 )
								if( d <= 0.057413 )
									ret := 0.285942
								if( d > 0.057413 )
									ret := 0.675926
						if( esa > 13.5759 )
							if( ci_wt2 <= -27.4789 )
								if( ap <= 16.9864 )
									ret := -0.629032
								if( ap > 16.9864 )
									ret := -0.193548
							if( ci_wt2 > -27.4789 )
								if( tci <= -41.3593 )
									ret := -0.086007
								if( tci > -41.3593 )
									ret := 0.239631
		if( ci_wt2 > 13.8444 )
			if( ci_wt2 <= 111.623 )
				if( ap <= 17.266 )
					if( ci <= 38.2264 )
						if( ci_wt2 <= 14.0657 )
							if( ap <= 11.7873 )
								ret := 0.307692
							if( ap > 11.7873 )
								if( ci <= 6.25398 )
									ret := -0.744186 // sell
								if( ci > 6.25398 )
									ret := -0.117647
						if( ci_wt2 > 14.0657 )
							if( d <= 0.043567 )
								if( esa <= 9.63433 )
									ret := 0.407080
								if( esa > 9.63433 )
									ret := -0.000647
							if( d > 0.043567 )
								if( tci <= -70.1481 )
									ret := 0.671642
								if( tci > -70.1481 )
									ret := -0.242199
					if( ci > 38.2264 )
						if( d_tci <= -29.9408 )
							if( wt2 <= 21.6056 )
								if( d_tci <= -30.088 )
									ret := -0.250000
								if( d_tci > -30.088 )
									ret := 0.500000
							if( wt2 > 21.6056 )
								if( ci <= 110.859 )
									ret := 0.094554
								if( ci > 110.859 )
									ret := -0.491525
						if( d_tci > -29.9408 )
							if( ci <= 105.925 )
								if( tci <= 6.79333 )
									ret := -0.064324
								if( tci > 6.79333 )
									ret := -0.160090
							if( ci > 105.925 )
								if( wt2 <= 5.27034 )
									ret := 0.328042
								if( wt2 > 5.27034 )
									ret := -0.044543
				if( ap > 17.266 )
					if( wt2 <= -66.8032 )
						ret := 0.900000 // buy
					if( wt2 > -66.8032 )
						if( ci_wt2 <= 19.2866 )
							if( ci <= 13.053 )
								ret := -0.350000
							if( ci > 13.053 )
								if( wt2 <= 16.6181 )
									ret := -0.714286 // sell
								if( wt2 > 16.6181 )
									ret := -0.944444 // sell
						if( ci_wt2 > 19.2866 )
							if( ap <= 17.4606 )
								if( ci_wt2 <= 20.7578 )
									ret := 0.888889 // buy
								if( ci_wt2 > 20.7578 )
									ret := -0.182724
							if( ap > 17.4606 )
								if( tci <= -4.94024 )
									ret := -0.513761
								if( tci > -4.94024 )
									ret := -0.323232
			if( ci_wt2 > 111.623 )
				if( esa <= 17.3648 )
					if( ci <= 147.048 )
						if( ci <= 107.068 )
							if( ci <= 77.54 )
								if( wt2 <= -61.1916 )
									ret := 0.500000
								if( wt2 > -61.1916 )
									ret := -0.044944
							if( ci > 77.54 )
								if( ci_wt2 <= 131.881 )
									ret := -0.256356
								if( ci_wt2 > 131.881 )
									ret := -0.498371
						if( ci > 107.068 )
							if( wt2 <= -9.35045 )
								if( ap <= 11.5006 )
									ret := 0.347826
								if( ap > 11.5006 )
									ret := -0.080982
							if( wt2 > -9.35045 )
								if( d_tci <= -16.2462 )
									ret := -0.120921
								if( d_tci > -16.2462 )
									ret := -0.324910
					if( ci > 147.048 )
						if( ci_wt2 <= 227.093 )
							if( ci <= 184.576 )
								if( ap <= 12.1337 )
									ret := -0.569565
								if( ap > 12.1337 )
									ret := -0.300640
							if( ci > 184.576 )
								if( esa <= 11.4198 )
									ret := 0.529412
								if( esa > 11.4198 )
									ret := -0.063380
						if( ci_wt2 > 227.093 )
							if( d_tci <= -0.036215 )
								if( ci <= 246.99 )
									ret := 0.064516
								if( ci > 246.99 )
									ret := -0.937500 // sell
							if( d_tci > -0.036215 )
								if( d <= 0.028452 )
									ret := -1.000000 // sell
								if( d > 0.028452 )
									ret := -0.538462
				if( esa > 17.3648 )
					if( ci_wt2 <= 161.402 )
						if( wt2 <= -35.8909 )
							ret := -0.933333 // sell
						if( wt2 > -35.8909 )
							if( d <= 0.041949 )
								if( wt2 <= 5.13754 )
									ret := -0.375000
								if( wt2 > 5.13754 )
									ret := -0.800000 // sell
							if( d > 0.041949 )
								if( ap <= 17.6183 )
									ret := -0.888889 // sell
								if( ap > 17.6183 )
									ret := -1.000000 // sell
					if( ci_wt2 > 161.402 )
						ret := 0.235294
	
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
float op_operation = decision_tree_0_LYFT_1Min_0ee56cff(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


