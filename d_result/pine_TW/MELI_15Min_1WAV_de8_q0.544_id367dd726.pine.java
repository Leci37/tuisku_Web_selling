//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MELI_15Min_1WAV_367dd726 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1WAV_367dd726", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_367dd726(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ap <= 266.301 )
		if( d <= 1.87584 )
			if( ci <= 15.4177 )
				if( ci_wt2 <= 8.09691 )
					if( wt2 <= -6.38668 )
						if( esa <= 177.004 )
							if( ci_wt2 <= -100.65 )
								if( d <= 0.508091 )
									ret := -0.571429
								if( d > 0.508091 )
									ret := -1.000000 // sell
							if( ci_wt2 > -100.65 )
								if( ci_wt2 <= -17.0655 )
									ret := 0.056075
								if( ci_wt2 > -17.0655 )
									ret := -0.294872
						if( esa > 177.004 )
							if( d <= 1.51216 )
								if( d_tci <= 24.2548 )
									ret := -0.077419
								if( d_tci > 24.2548 )
									ret := 0.202869
							if( d > 1.51216 )
								if( ci <= -98.312 )
									ret := 0.176471
								if( ci > -98.312 )
									ret := -0.489796
					if( wt2 > -6.38668 )
						if( ci <= -77.6876 )
							if( ap <= 209.244 )
								if( d <= 0.613652 )
									ret := 0.382979
								if( d > 0.613652 )
									ret := 0.843750 // buy
							if( ap > 209.244 )
								if( ci <= -164.537 )
									ret := -0.105263
								if( ci > -164.537 )
									ret := 0.250000
						if( ci > -77.6876 )
							if( ci_wt2 <= -37.5686 )
								if( d <= 1.16466 )
									ret := 0.164241
								if( d > 1.16466 )
									ret := -0.515152
							if( ci_wt2 > -37.5686 )
								if( esa <= 156.291 )
									ret := 0.764706 // buy
								if( esa > 156.291 )
									ret := 0.270042
				if( ci_wt2 > 8.09691 )
					if( d <= 0.380992 )
						if( ci <= -17.2007 )
							if( d <= 0.269626 )
								ret := 0.000000
							if( d > 0.269626 )
								if( ci_wt2 <= 17.9402 )
									ret := 1.000000 // buy
								if( ci_wt2 > 17.9402 )
									ret := 0.250000
						if( ci > -17.2007 )
							if( ci_wt2 <= 14.0879 )
								if( ci <= 2.79157 )
									ret := -0.250000
								if( ci > 2.79157 )
									ret := -0.500000
							if( ci_wt2 > 14.0879 )
								if( esa <= 166.623 )
									ret := -0.250000
								if( esa > 166.623 )
									ret := 0.000000
					if( d > 0.380992 )
						if( esa <= 262.619 )
							if( esa <= 218.685 )
								if( tci <= -50.4676 )
									ret := -0.102041
								if( tci > -50.4676 )
									ret := 0.558824
							if( esa > 218.685 )
								if( esa <= 237.282 )
									ret := 0.784615 // buy
								if( esa > 237.282 )
									ret := 0.475610
						if( esa > 262.619 )
							if( d <= 1.0976 )
								if( tci <= -51.4812 )
									ret := -1.000000 // sell
								if( tci > -51.4812 )
									ret := -0.500000
							if( d > 1.0976 )
								if( ci <= -19.4919 )
									ret := -0.142857
								if( ci > -19.4919 )
									ret := 1.000000 // buy
			if( ci > 15.4177 )
				if( ap <= 260.434 )
					if( wt2 <= 67.3259 )
						if( d <= 0.978982 )
							if( esa <= 156.325 )
								if( ci <= 62.2593 )
									ret := 0.000000
								if( ci > 62.2593 )
									ret := 0.625000
							if( esa > 156.325 )
								if( ap <= 173.806 )
									ret := -0.260638
								if( ap > 173.806 )
									ret := 0.058158
						if( d > 0.978982 )
							if( tci <= 59.0082 )
								if( esa <= 157.582 )
									ret := -0.750000 // sell
								if( esa > 157.582 )
									ret := -0.065744
							if( tci > 59.0082 )
								if( d <= 1.27146 )
									ret := -0.604651
								if( d > 1.27146 )
									ret := -0.235294
					if( wt2 > 67.3259 )
						if( d_tci <= -75.8256 )
							if( ci <= 121.492 )
								if( esa <= 189.371 )
									ret := -0.200000
								if( esa > 189.371 )
									ret := -0.750000 // sell
							if( ci > 121.492 )
								ret := 0.250000
						if( d_tci > -75.8256 )
							if( ci_wt2 <= -24.6275 )
								ret := 0.000000
							if( ci_wt2 > -24.6275 )
								if( esa <= 163.843 )
									ret := 0.000000
								if( esa > 163.843 )
									ret := 0.742857 // buy
				if( ap > 260.434 )
					if( wt2 <= 25.2825 )
						if( wt2 <= -32.3703 )
							if( d <= 1.39274 )
								ret := 0.000000
							if( d > 1.39274 )
								ret := 0.250000
						if( wt2 > -32.3703 )
							if( d <= 0.918853 )
								if( ci_wt2 <= 50.9451 )
									ret := 0.588235
								if( ci_wt2 > 50.9451 )
									ret := 0.100000
							if( d > 0.918853 )
								if( ap <= 263.9 )
									ret := 0.931034 // buy
								if( ap > 263.9 )
									ret := 0.558824
					if( wt2 > 25.2825 )
						if( wt2 <= 51.2074 )
							if( tci <= 48.8848 )
								ret := 0.000000
							if( tci > 48.8848 )
								if( ap <= 262.656 )
									ret := -0.600000
								if( ap > 262.656 )
									ret := -1.000000 // sell
						if( wt2 > 51.2074 )
							if( wt2 <= 56.7345 )
								ret := 1.000000 // buy
							if( wt2 > 56.7345 )
								ret := 0.000000
		if( d > 1.87584 )
			if( tci <= -37.1054 )
				if( esa <= 261.14 )
					if( d <= 3.36081 )
						if( ci_wt2 <= -10.9388 )
							if( wt2 <= -63.9819 )
								if( ap <= 237.722 )
									ret := -0.714286 // sell
								if( ap > 237.722 )
									ret := 0.833333 // buy
							if( wt2 > -63.9819 )
								if( d <= 1.94094 )
									ret := 0.750000 // buy
								if( d > 1.94094 )
									ret := -0.653846
						if( ci_wt2 > -10.9388 )
							if( ci <= -43.0309 )
								if( d_tci <= 68.5325 )
									ret := 0.823529 // buy
								if( d_tci > 68.5325 )
									ret := 0.250000
							if( ci > -43.0309 )
								if( ci_wt2 <= 53.6957 )
									ret := 0.166667
								if( ci_wt2 > 53.6957 )
									ret := -0.500000
					if( d > 3.36081 )
						if( ci_wt2 <= 11.6366 )
							if( d <= 3.58216 )
								if( d <= 3.40783 )
									ret := -0.500000
								if( d > 3.40783 )
									ret := -1.000000 // sell
							if( d > 3.58216 )
								if( d_tci <= 69.4472 )
									ret := 0.555556
								if( d_tci > 69.4472 )
									ret := -0.250000
						if( ci_wt2 > 11.6366 )
							ret := -1.000000 // sell
				if( esa > 261.14 )
					if( esa <= 268.709 )
						if( d <= 5.52265 )
							if( d <= 3.48125 )
								if( d <= 2.75345 )
									ret := 0.425000
								if( d > 2.75345 )
									ret := 1.000000 // buy
							if( d > 3.48125 )
								if( d_tci <= 73.9747 )
									ret := -0.500000
								if( d_tci > 73.9747 )
									ret := 0.800000 // buy
						if( d > 5.52265 )
							if( ci <= -54.2511 )
								ret := 1.000000 // buy
							if( ci > -54.2511 )
								ret := 0.750000 // buy
					if( esa > 268.709 )
						if( ci_wt2 <= -106.111 )
							ret := 1.000000 // buy
						if( ci_wt2 > -106.111 )
							if( ci_wt2 <= -20.4014 )
								ret := -1.000000 // sell
							if( ci_wt2 > -20.4014 )
								ret := -0.714286 // sell
			if( tci > -37.1054 )
				if( d_tci <= -76.6019 )
					if( ci_wt2 <= 9.65475 )
						if( ap <= 243.754 )
							ret := 0.250000
						if( ap > 243.754 )
							ret := 0.000000
					if( ci_wt2 > 9.65475 )
						if( ap <= 234.76 )
							ret := -0.500000
						if( ap > 234.76 )
							ret := -1.000000 // sell
				if( d_tci > -76.6019 )
					if( d <= 2.2163 )
						if( d_tci <= -37.0543 )
							if( esa <= 246.841 )
								if( wt2 <= 51.6659 )
									ret := -0.285714
								if( wt2 > 51.6659 )
									ret := 0.000000
							if( esa > 246.841 )
								if( d_tci <= -64.9041 )
									ret := 0.500000
								if( d_tci > -64.9041 )
									ret := 1.000000 // buy
						if( d_tci > -37.0543 )
							if( ap <= 220.089 )
								ret := 1.000000 // buy
							if( ap > 220.089 )
								if( d_tci <= 7.8648 )
									ret := 0.333333
								if( d_tci > 7.8648 )
									ret := 0.750000 // buy
					if( d > 2.2163 )
						if( d <= 4.82357 )
							if( esa <= 259.987 )
								if( d_tci <= 23.0617 )
									ret := 0.828571 // buy
								if( d_tci > 23.0617 )
									ret := 0.000000
							if( esa > 259.987 )
								if( d_tci <= 34.812 )
									ret := 0.821429 // buy
								if( d_tci > 34.812 )
									ret := 1.000000 // buy
						if( d > 4.82357 )
							if( ci <= -73.6608 )
								ret := 1.000000 // buy
							if( ci > -73.6608 )
								if( esa <= 266.648 )
									ret := 0.545455
								if( esa > 266.648 )
									ret := -0.666667
	if( ap > 266.301 )
		if( d <= 7.05097 )
			if( tci <= -68.0716 )
				if( esa <= 354.548 )
					if( esa <= 277.58 )
						if( esa <= 272.871 )
							ret := -0.750000 // sell
						if( esa > 272.871 )
							ret := -1.000000 // sell
					if( esa > 277.58 )
						if( ci_wt2 <= -100.697 )
							ret := -1.000000 // sell
						if( ci_wt2 > -100.697 )
							if( ci_wt2 <= 13.0848 )
								if( d <= 3.43695 )
									ret := 0.533333
								if( d > 3.43695 )
									ret := 0.945205 // buy
							if( ci_wt2 > 13.0848 )
								if( wt2 <= -73.6303 )
									ret := 0.045455
								if( wt2 > -73.6303 )
									ret := 0.928571 // buy
				if( esa > 354.548 )
					if( ap <= 361.532 )
						if( ci_wt2 <= -35.7646 )
							ret := -0.428571
						if( ci_wt2 > -35.7646 )
							ret := -1.000000 // sell
					if( ap > 361.532 )
						if( ci <= -64.1352 )
							if( tci <= -68.2256 )
								if( ci <= -95.6382 )
									ret := 0.307692
								if( ci > -95.6382 )
									ret := -0.115942
							if( tci > -68.2256 )
								if( wt2 <= -60.9175 )
									ret := 0.500000
								if( wt2 > -60.9175 )
									ret := 1.000000 // buy
						if( ci > -64.1352 )
							if( esa <= 539.183 )
								if( d_tci <= 72.4786 )
									ret := 0.500000
								if( d_tci > 72.4786 )
									ret := 1.000000 // buy
							if( esa > 539.183 )
								if( esa <= 1421.15 )
									ret := 0.105263
								if( esa > 1421.15 )
									ret := 0.750000 // buy
			if( tci > -68.0716 )
				if( esa <= 2014.93 )
					if( ci <= 171.027 )
						if( esa <= 1961.34 )
							if( ap <= 1944.75 )
								if( esa <= 434.891 )
									ret := 0.030086
								if( esa > 434.891 )
									ret := 0.063039
							if( ap > 1944.75 )
								if( d_tci <= -26.6124 )
									ret := -0.727273 // sell
								if( d_tci > -26.6124 )
									ret := -0.238095
						if( esa > 1961.34 )
							if( wt2 <= -14.3928 )
								if( wt2 <= -16.1736 )
									ret := 0.067308
								if( wt2 > -16.1736 )
									ret := -0.666667
							if( wt2 > -14.3928 )
								if( tci <= 39.2605 )
									ret := 0.427027
								if( tci > 39.2605 )
									ret := -0.064516
					if( ci > 171.027 )
						if( tci <= 18.8548 )
							if( ap <= 1006.46 )
								if( d <= 3.10601 )
									ret := -0.267606
								if( d > 3.10601 )
									ret := -0.877551 // sell
							if( ap > 1006.46 )
								if( esa <= 1930.08 )
									ret := -0.032258
								if( esa > 1930.08 )
									ret := -0.888889 // sell
						if( tci > 18.8548 )
							if( ap <= 355.21 )
								if( wt2 <= 41.7376 )
									ret := 0.033708
								if( wt2 > 41.7376 )
									ret := -0.941176 // sell
							if( ap > 355.21 )
								if( ap <= 1634 )
									ret := 0.229268
								if( ap > 1634 )
									ret := -0.289474
				if( esa > 2014.93 )
					if( ci <= -29.4195 )
						if( ci_wt2 <= -125.928 )
							if( ap <= 2085.61 )
								if( wt2 <= -10.0445 )
									ret := -0.900000 // sell
								if( wt2 > -10.0445 )
									ret := -0.333333
							if( ap > 2085.61 )
								if( esa <= 2105.74 )
									ret := 0.000000
								if( esa > 2105.74 )
									ret := 0.500000
						if( ci_wt2 > -125.928 )
							if( d <= 4.89991 )
								if( ci_wt2 <= -1.76832 )
									ret := 0.052632
								if( ci_wt2 > -1.76832 )
									ret := 0.500000
							if( d > 4.89991 )
								if( ci <= -86.8843 )
									ret := -0.125000
								if( ci > -86.8843 )
									ret := 0.585366
					if( ci > -29.4195 )
						if( d <= 4.3909 )
							if( ci_wt2 <= -19.5408 )
								if( tci <= 21.1445 )
									ret := -0.400000
								if( tci > 21.1445 )
									ret := -0.882353 // sell
							if( ci_wt2 > -19.5408 )
								if( d <= 3.93919 )
									ret := -0.273504
								if( d > 3.93919 )
									ret := -0.722222 // sell
						if( d > 4.3909 )
							if( tci <= 42.235 )
								if( d <= 6.16122 )
									ret := 0.023810
								if( d > 6.16122 )
									ret := 0.333333
							if( tci > 42.235 )
								if( ci_wt2 <= 47.0985 )
									ret := -0.142857
								if( ci_wt2 > 47.0985 )
									ret := -0.692308
		if( d > 7.05097 )
			if( d_tci <= 75.8037 )
				if( d <= 20.786 )
					if( ci <= -105.971 )
						if( wt2 <= -15.9099 )
							if( esa <= 1806.17 )
								if( ci <= -107.583 )
									ret := -0.010684
								if( ci > -107.583 )
									ret := 0.543478
							if( esa > 1806.17 )
								if( d <= 8.6828 )
									ret := 0.200000
								if( d > 8.6828 )
									ret := -0.888889 // sell
						if( wt2 > -15.9099 )
							if( ap <= 1131.87 )
								if( tci <= 3.41127 )
									ret := 0.666667
								if( tci > 3.41127 )
									ret := 0.166667
							if( ap > 1131.87 )
								if( ci <= -242.289 )
									ret := -1.000000 // sell
								if( ci > -242.289 )
									ret := 0.106667
					if( ci > -105.971 )
						if( d_tci <= -62.3142 )
							if( wt2 <= 66.3798 )
								if( ci <= 191.728 )
									ret := 0.055556
								if( ci > 191.728 )
									ret := 0.833333 // buy
							if( wt2 > 66.3798 )
								if( d <= 7.43053 )
									ret := 0.107143
								if( d > 7.43053 )
									ret := -0.375000
						if( d_tci > -62.3142 )
							if( ci_wt2 <= -130.221 )
								if( d <= 13.5499 )
									ret := -0.465116
								if( d > 13.5499 )
									ret := -1.000000 // sell
							if( ci_wt2 > -130.221 )
								if( d_tci <= -9.15252 )
									ret := 0.018103
								if( d_tci > -9.15252 )
									ret := -0.042796
				if( d > 20.786 )
					if( ci_wt2 <= -109.395 )
						if( ap <= 1685.14 )
							if( tci <= -16.276 )
								ret := -0.166667
							if( tci > -16.276 )
								if( ci <= -118.51 )
									ret := -0.818182 // sell
								if( ci > -118.51 )
									ret := -1.000000 // sell
						if( ap > 1685.14 )
							if( ap <= 1904.81 )
								ret := 0.750000 // buy
							if( ap > 1904.81 )
								if( ap <= 1926.85 )
									ret := -1.000000 // sell
								if( ap > 1926.85 )
									ret := 0.250000
					if( ci_wt2 > -109.395 )
						if( ci <= 87.4024 )
							if( tci <= 68.9875 )
								if( d <= 44.7845 )
									ret := 0.450882
								if( d > 44.7845 )
									ret := -0.846154 // sell
							if( tci > 68.9875 )
								if( ci <= 45.4272 )
									ret := -0.928571 // sell
								if( ci > 45.4272 )
									ret := -0.076923
						if( ci > 87.4024 )
							if( ci <= 151.425 )
								if( d <= 47.8736 )
									ret := -0.426966
								if( d > 47.8736 )
									ret := 0.750000 // buy
							if( ci > 151.425 )
								if( d <= 27.4173 )
									ret := 0.250000
								if( d > 27.4173 )
									ret := 0.900000 // buy
			if( d_tci > 75.8037 )
				if( esa <= 656.792 )
					if( d <= 7.55952 )
						if( esa <= 572.536 )
							if( esa <= 349.437 )
								ret := 0.750000 // buy
							if( esa > 349.437 )
								ret := 0.750000 // buy
						if( esa > 572.536 )
							ret := -0.600000
					if( d > 7.55952 )
						if( ci_wt2 <= 43.4127 )
							if( tci <= -74.0123 )
								if( d_tci <= 83.9847 )
									ret := 0.500000
								if( d_tci > 83.9847 )
									ret := 0.894737 // buy
							if( tci > -74.0123 )
								if( ci <= -39.9333 )
									ret := 1.000000 // buy
								if( ci > -39.9333 )
									ret := 0.750000 // buy
						if( ci_wt2 > 43.4127 )
							ret := 0.400000
				if( esa > 656.792 )
					if( esa <= 746.482 )
						if( d <= 16.2464 )
							if( ap <= 681.982 )
								if( wt2 <= -67.6555 )
									ret := -0.538462
								if( wt2 > -67.6555 )
									ret := 0.250000
							if( ap > 681.982 )
								if( d <= 10.4866 )
									ret := 0.000000
								if( d > 10.4866 )
									ret := -0.937500 // sell
						if( d > 16.2464 )
							if( ci <= -76.7392 )
								ret := -0.400000
							if( ci > -76.7392 )
								ret := 0.666667
					if( esa > 746.482 )
						if( ap <= 1363.09 )
							if( esa <= 894.142 )
								if( ap <= 852.125 )
									ret := -0.023256
								if( ap > 852.125 )
									ret := 0.913793 // buy
							if( esa > 894.142 )
								if( d <= 15.7172 )
									ret := 0.079156
								if( d > 15.7172 )
									ret := -0.217544
						if( ap > 1363.09 )
							if( esa <= 1451.56 )
								if( tci <= -65.6745 )
									ret := 1.000000 // buy
								if( tci > -65.6745 )
									ret := 0.862069 // buy
							if( esa > 1451.56 )
								if( esa <= 1584.47 )
									ret := 0.018072
								if( esa > 1584.47 )
									ret := 0.362205
	
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
float op_operation = decision_tree_0_MELI_15Min_367dd726(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


