//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: BNBUSDT_30Min_1WAV_aa23d312 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1WAV_aa23d312", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_aa23d312(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( esa <= 589.799 )
		if( d_tci <= 74.4837 )
			if( esa <= 218.212 )
				if( d <= 0.930805 )
					if( wt2 <= -69.2917 )
						if( ci_wt2 <= 21.179 )
							if( ap <= 29.191 )
								if( esa <= 27.9758 )
									ret := 0.500000
								if( esa > 27.9758 )
									ret := 0.000000
							if( ap > 29.191 )
								ret := -1.000000 // sell
						if( ci_wt2 > 21.179 )
							if( d <= 0.408892 )
								if( ap <= 27.5272 )
									ret := -0.428571
								if( ap > 27.5272 )
									ret := -0.875000 // sell
							if( d > 0.408892 )
								if( wt2 <= -75.0176 )
									ret := -0.750000 // sell
								if( wt2 > -75.0176 )
									ret := -1.000000 // sell
					if( wt2 > -69.2917 )
						if( ci_wt2 <= -171.119 )
							if( ap <= 43.1718 )
								if( esa <= 33.7377 )
									ret := 0.613636
								if( esa > 33.7377 )
									ret := 0.942857 // buy
							if( ap > 43.1718 )
								if( wt2 <= 45.5011 )
									ret := 0.000000
								if( wt2 > 45.5011 )
									ret := -0.750000 // sell
						if( ci_wt2 > -171.119 )
							if( d_tci <= -70.8669 )
								if( esa <= 28.346 )
									ret := -0.850000 // sell
								if( esa > 28.346 )
									ret := -0.171429
							if( d_tci > -70.8669 )
								if( d <= 0.502784 )
									ret := 0.069635
								if( d > 0.502784 )
									ret := 0.189270
				if( d > 0.930805 )
					if( ap <= 123.878 )
						if( tci <= 76.0949 )
							if( esa <= 74.628 )
								if( ci <= -35.9862 )
									ret := 0.882353 // buy
								if( ci > -35.9862 )
									ret := 0.134021
							if( esa > 74.628 )
								if( ci_wt2 <= 35.8016 )
									ret := 0.888199 // buy
								if( ci_wt2 > 35.8016 )
									ret := 0.593750
						if( tci > 76.0949 )
							if( d <= 1.71884 )
								if( ap <= 50.0701 )
									ret := -0.750000 // sell
								if( ap > 50.0701 )
									ret := 1.000000 // buy
							if( d > 1.71884 )
								if( d <= 2.72257 )
									ret := -0.678571
								if( d > 2.72257 )
									ret := 0.200000
					if( ap > 123.878 )
						if( ap <= 146.281 )
							if( ci <= -64.8404 )
								if( ci_wt2 <= -143.511 )
									ret := -0.600000
								if( ci_wt2 > -143.511 )
									ret := 0.854545 // buy
							if( ci > -64.8404 )
								if( esa <= 132.782 )
									ret := 0.033816
								if( esa > 132.782 )
									ret := -0.462500
						if( ap > 146.281 )
							if( ci <= 73.3018 )
								if( ci <= 63.6212 )
									ret := 0.282158
								if( ci > 63.6212 )
									ret := -0.241935
							if( ci > 73.3018 )
								if( wt2 <= -32.4975 )
									ret := -0.250000
								if( wt2 > -32.4975 )
									ret := 0.579208
			if( esa > 218.212 )
				if( d <= 1.29408 )
					if( d_tci <= -63.3274 )
						if( ap <= 241.483 )
							if( ap <= 239.229 )
								if( d_tci <= -68.002 )
									ret := 0.000000
								if( d_tci > -68.002 )
									ret := 0.666667
							if( ap > 239.229 )
								if( ap <= 239.345 )
									ret := 0.750000 // buy
								if( ap > 239.345 )
									ret := 1.000000 // buy
						if( ap > 241.483 )
							if( wt2 <= 59.7984 )
								if( tci <= 66.5925 )
									ret := 0.777778 // buy
								if( tci > 66.5925 )
									ret := 0.214286
							if( wt2 > 59.7984 )
								if( d_tci <= -63.4701 )
									ret := 0.037383
								if( d_tci > -63.4701 )
									ret := 0.750000 // buy
					if( d_tci > -63.3274 )
						if( ci <= 132.19 )
							if( esa <= 220.341 )
								if( ci <= -97.5083 )
									ret := 0.263158
								if( ci > -97.5083 )
									ret := -0.305263
							if( esa > 220.341 )
								if( esa <= 324.588 )
									ret := 0.020989
								if( esa > 324.588 )
									ret := -0.033295
						if( ci > 132.19 )
							if( ci <= 213.547 )
								if( wt2 <= 52.33 )
									ret := 0.160055
								if( wt2 > 52.33 )
									ret := -0.714286 // sell
							if( ci > 213.547 )
								if( d <= 0.600357 )
									ret := -0.333333
								if( d > 0.600357 )
									ret := 0.760000 // buy
				if( d > 1.29408 )
					if( ci_wt2 <= -32.6052 )
						if( esa <= 233.164 )
							if( ci <= -69.9081 )
								if( wt2 <= 14.12 )
									ret := 0.037037
								if( wt2 > 14.12 )
									ret := 0.692308
							if( ci > -69.9081 )
								if( d <= 2.64561 )
									ret := -0.371429
								if( d > 2.64561 )
									ret := -0.950000 // sell
						if( esa > 233.164 )
							if( d <= 3.13221 )
								if( esa <= 282.68 )
									ret := 0.222125
								if( esa > 282.68 )
									ret := 0.067506
							if( d > 3.13221 )
								if( esa <= 564.165 )
									ret := 0.234704
								if( esa > 564.165 )
									ret := -0.003824
					if( ci_wt2 > -32.6052 )
						if( ap <= 438.649 )
							if( wt2 <= 80.2927 )
								if( d <= 2.6661 )
									ret := 0.055597
								if( d > 2.6661 )
									ret := -0.059238
							if( wt2 > 80.2927 )
								if( esa <= 399.305 )
									ret := 0.528455
								if( esa > 399.305 )
									ret := -0.800000 // sell
						if( ap > 438.649 )
							if( esa <= 518.474 )
								if( wt2 <= 38.3794 )
									ret := 0.215237
								if( wt2 > 38.3794 )
									ret := 0.009259
							if( esa > 518.474 )
								if( esa <= 535.967 )
									ret := -0.135542
								if( esa > 535.967 )
									ret := 0.090437
		if( d_tci > 74.4837 )
			if( ci_wt2 <= 15.9462 )
				if( ap <= 268.731 )
					if( d <= 0.430145 )
						if( esa <= 28.7456 )
							if( tci <= -75.9411 )
								ret := -1.000000 // sell
							if( tci > -75.9411 )
								ret := -0.750000 // sell
						if( esa > 28.7456 )
							ret := 0.000000
					if( d > 0.430145 )
						if( ci_wt2 <= 8.801 )
							if( d_tci <= 77.1277 )
								if( tci <= -75.3865 )
									ret := -0.400000
								if( tci > -75.3865 )
									ret := 0.583333
							if( d_tci > 77.1277 )
								if( ci <= -81.6581 )
									ret := 0.809859 // buy
								if( ci > -81.6581 )
									ret := 0.545455
						if( ci_wt2 > 8.801 )
							if( esa <= 248.381 )
								if( ap <= 235.949 )
									ret := 0.714286 // buy
								if( ap > 235.949 )
									ret := -0.250000
							if( esa > 248.381 )
								if( ap <= 257.523 )
									ret := -1.000000 // sell
								if( ap > 257.523 )
									ret := 0.250000
				if( ap > 268.731 )
					if( d <= 9.93754 )
						if( wt2 <= -70.8304 )
							if( esa <= 364.073 )
								if( ap <= 331.815 )
									ret := 0.274194
								if( ap > 331.815 )
									ret := -0.761905 // sell
							if( esa > 364.073 )
								if( ap <= 422.39 )
									ret := 0.881356 // buy
								if( ap > 422.39 )
									ret := 0.396226
						if( wt2 > -70.8304 )
							if( d_tci <= 75.0678 )
								if( wt2 <= -67.0577 )
									ret := 0.882353 // buy
								if( wt2 > -67.0577 )
									ret := 0.125000
							if( d_tci > 75.0678 )
								if( ci_wt2 <= -14.8743 )
									ret := 0.170103
								if( ci_wt2 > -14.8743 )
									ret := -0.213333
					if( d > 9.93754 )
						if( ap <= 466.385 )
							if( ap <= 445.307 )
								if( tci <= -70.2542 )
									ret := 0.831325 // buy
								if( tci > -70.2542 )
									ret := 0.233333
							if( ap > 445.307 )
								if( d_tci <= 86.3643 )
									ret := 0.500000
								if( d_tci > 86.3643 )
									ret := -1.000000 // sell
						if( ap > 466.385 )
							if( esa <= 487.37 )
								ret := 0.714286 // buy
							if( esa > 487.37 )
								if( d_tci <= 96.0772 )
									ret := 0.945946 // buy
								if( d_tci > 96.0772 )
									ret := 0.750000 // buy
			if( ci_wt2 > 15.9462 )
				if( esa <= 28.9767 )
					if( ci_wt2 <= 26.3599 )
						ret := 1.000000 // buy
					if( ci_wt2 > 26.3599 )
						ret := 0.250000
				if( esa > 28.9767 )
					if( esa <= 240.448 )
						if( ap <= 210.147 )
							ret := -0.250000
						if( ap > 210.147 )
							if( esa <= 230.184 )
								if( ap <= 219.774 )
									ret := -1.000000 // sell
								if( ap > 219.774 )
									ret := -0.750000 // sell
							if( esa > 230.184 )
								ret := -0.500000
					if( esa > 240.448 )
						if( esa <= 429.355 )
							if( ci_wt2 <= 21.7418 )
								if( ap <= 341.163 )
									ret := -0.461538
								if( ap > 341.163 )
									ret := 0.923077 // buy
							if( ci_wt2 > 21.7418 )
								if( ci_wt2 <= 24.7763 )
									ret := 0.689655
								if( ci_wt2 > 24.7763 )
									ret := 0.256410
						if( esa > 429.355 )
							if( esa <= 486.188 )
								if( esa <= 479.15 )
									ret := -0.222222
								if( esa > 479.15 )
									ret := -0.962963 // sell
							if( esa > 486.188 )
								if( ci_wt2 <= 53.2318 )
									ret := 0.571429
								if( ci_wt2 > 53.2318 )
									ret := -0.727273 // sell
	if( esa > 589.799 )
		if( esa <= 598.867 )
			if( ci_wt2 <= -62.2096 )
				if( wt2 <= -56.1435 )
					ret := 1.000000 // buy
				if( wt2 > -56.1435 )
					if( ci <= -101.968 )
						if( wt2 <= 0.595592 )
							if( ci <= -133.373 )
								if( d_tci <= 25.9542 )
									ret := -0.666667
								if( d_tci > 25.9542 )
									ret := 0.421053
							if( ci > -133.373 )
								if( d <= 2.6379 )
									ret := 0.000000
								if( d > 2.6379 )
									ret := -0.794118 // sell
						if( wt2 > 0.595592 )
							if( d <= 0.884884 )
								ret := 0.000000
							if( d > 0.884884 )
								if( d_tci <= -20.8636 )
									ret := -0.500000
								if( d_tci > -20.8636 )
									ret := -0.915254 // sell
					if( ci > -101.968 )
						if( ci <= -73.5731 )
							if( wt2 <= 42.0779 )
								if( ap <= 591.02 )
									ret := 0.250000
								if( ap > 591.02 )
									ret := -0.206897
							if( wt2 > 42.0779 )
								ret := -0.800000 // sell
						if( ci > -73.5731 )
							if( wt2 <= 46.6437 )
								if( ci <= -24.3208 )
									ret := -0.422222
								if( ci > -24.3208 )
									ret := 0.800000 // buy
							if( wt2 > 46.6437 )
								if( d_tci <= -49.2564 )
									ret := -0.142857
								if( d_tci > -49.2564 )
									ret := -0.761905 // sell
			if( ci_wt2 > -62.2096 )
				if( ap <= 590.248 )
					if( d <= 8.5794 )
						if( ci_wt2 <= -11.6949 )
							if( tci <= -59.3167 )
								if( ap <= 585.424 )
									ret := 0.500000
								if( ap > 585.424 )
									ret := 1.000000 // buy
							if( tci > -59.3167 )
								if( tci <= -46.3612 )
									ret := -0.050000
								if( tci > -46.3612 )
									ret := 0.500000
						if( ci_wt2 > -11.6949 )
							if( d <= 2.71501 )
								ret := 0.142857
							if( d > 2.71501 )
								if( ci <= -53.698 )
									ret := -0.250000
								if( ci > -53.698 )
									ret := -1.000000 // sell
					if( d > 8.5794 )
						if( esa <= 594.768 )
							ret := 1.000000 // buy
						if( esa > 594.768 )
							ret := 0.750000 // buy
				if( ap > 590.248 )
					if( tci <= -38.2782 )
						if( d_tci <= 50.5548 )
							if( wt2 <= -40.1578 )
								if( d <= 1.79054 )
									ret := -0.187500
								if( d > 1.79054 )
									ret := -0.852459 // sell
							if( wt2 > -40.1578 )
								if( wt2 <= -38.4236 )
									ret := -0.250000
								if( wt2 > -38.4236 )
									ret := 0.000000
						if( d_tci > 50.5548 )
							if( d <= 2.43271 )
								if( ci <= -22.1468 )
									ret := 0.000000
								if( ci > -22.1468 )
									ret := 0.200000
							if( d > 2.43271 )
								if( wt2 <= -58.8796 )
									ret := -0.071429
								if( wt2 > -58.8796 )
									ret := -0.714286 // sell
					if( tci > -38.2782 )
						if( ap <= 599.725 )
							if( ci <= 42.6887 )
								if( tci <= 40.7021 )
									ret := -0.095588
								if( tci > 40.7021 )
									ret := -0.521739
							if( ci > 42.6887 )
								if( tci <= 26.6741 )
									ret := -0.104972
								if( tci > 26.6741 )
									ret := 0.303483
						if( ap > 599.725 )
							if( wt2 <= -29.4727 )
								ret := 0.857143 // buy
							if( wt2 > -29.4727 )
								if( d_tci <= -38.15 )
									ret := -0.500000
								if( d_tci > -38.15 )
									ret := 0.000000
		if( esa > 598.867 )
			if( ap <= 648.685 )
				if( esa <= 648.369 )
					if( esa <= 622.694 )
						if( d_tci <= 60.3676 )
							if( d <= 5.98533 )
								if( d_tci <= -61.3158 )
									ret := 0.608696
								if( d_tci > -61.3158 )
									ret := -0.058313
							if( d > 5.98533 )
								if( esa <= 600.208 )
									ret := 0.444444
								if( esa > 600.208 )
									ret := -0.508197
						if( d_tci > 60.3676 )
							if( ci <= -36.7619 )
								if( esa <= 613.3 )
									ret := 0.397260
								if( esa > 613.3 )
									ret := 0.866667 // buy
							if( ci > -36.7619 )
								if( ci <= -19.1638 )
									ret := -0.375000
								if( ci > -19.1638 )
									ret := -1.000000 // sell
					if( esa > 622.694 )
						if( d_tci <= 17.8005 )
							if( wt2 <= 26.8912 )
								if( tci <= -1.64085 )
									ret := 0.152174
								if( tci > -1.64085 )
									ret := 0.613636
							if( wt2 > 26.8912 )
								if( tci <= 44.6047 )
									ret := -0.267241
								if( tci > 44.6047 )
									ret := 0.227679
						if( d_tci > 17.8005 )
							if( ap <= 619.128 )
								if( ci <= -115.692 )
									ret := 0.083333
								if( ci > -115.692 )
									ret := 0.789474 // buy
							if( ap > 619.128 )
								if( tci <= -50.3027 )
									ret := 0.132231
								if( tci > -50.3027 )
									ret := -0.354978
				if( esa > 648.369 )
					if( d <= 8.13335 )
						if( wt2 <= -0.85516 )
							if( wt2 <= -64.0494 )
								ret := -0.500000
							if( wt2 > -64.0494 )
								if( ci <= -148.41 )
									ret := -0.666667
								if( ci > -148.41 )
									ret := -0.961538 // sell
						if( wt2 > -0.85516 )
							if( wt2 <= 5.09846 )
								ret := 0.666667
							if( wt2 > 5.09846 )
								if( ci_wt2 <= -107.264 )
									ret := -0.166667
								if( ci_wt2 > -107.264 )
									ret := -0.700000 // sell
					if( d > 8.13335 )
						ret := 0.400000
			if( ap > 648.685 )
				if( ap <= 655.969 )
					if( d <= 5.86292 )
						if( wt2 <= 18.7697 )
							if( ci_wt2 <= 107.025 )
								if( d <= 1.83686 )
									ret := -0.555556
								if( d > 1.83686 )
									ret := -0.871429 // sell
							if( ci_wt2 > 107.025 )
								if( ci <= 117.361 )
									ret := 0.250000
								if( ci > 117.361 )
									ret := 0.000000
						if( wt2 > 18.7697 )
							if( d_tci <= -25.6057 )
								if( ci_wt2 <= -26.8053 )
									ret := 0.181818
								if( ci_wt2 > -26.8053 )
									ret := -0.593220
							if( d_tci > -25.6057 )
								if( d <= 2.64318 )
									ret := 0.000000
								if( d > 2.64318 )
									ret := 1.000000 // buy
					if( d > 5.86292 )
						if( ci_wt2 <= -92.199 )
							ret := -1.000000 // sell
						if( ci_wt2 > -92.199 )
							if( esa <= 647.177 )
								if( d <= 7.30409 )
									ret := 0.454545
								if( d > 7.30409 )
									ret := -0.857143 // sell
							if( esa > 647.177 )
								ret := 1.000000 // buy
				if( ap > 655.969 )
					if( ci <= 79.8525 )
						if( tci <= -17.9556 )
							if( esa <= 673.24 )
								if( d <= 3.88348 )
									ret := -0.976744 // sell
								if( d > 3.88348 )
									ret := -0.181818
							if( esa > 673.24 )
								if( ci <= 30.7468 )
									ret := -0.098039
								if( ci > 30.7468 )
									ret := 0.500000
						if( tci > -17.9556 )
							if( ci <= -57.3946 )
								if( d <= 2.56134 )
									ret := 0.702703 // buy
								if( d > 2.56134 )
									ret := -0.086957
							if( ci > -57.3946 )
								if( ap <= 707.8 )
									ret := 0.057762
								if( ap > 707.8 )
									ret := -0.937500 // sell
					if( ci > 79.8525 )
						if( wt2 <= -5.43957 )
							if( ci <= 128.202 )
								ret := 0.200000
							if( ci > 128.202 )
								ret := 1.000000 // buy
						if( wt2 > -5.43957 )
							if( ci_wt2 <= 32.6038 )
								if( tci <= 72.8398 )
									ret := 0.800000 // buy
								if( tci > 72.8398 )
									ret := 0.000000
							if( ci_wt2 > 32.6038 )
								if( d <= 1.58675 )
									ret := 0.400000
								if( d > 1.58675 )
									ret := -0.697674
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_aa23d312(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


