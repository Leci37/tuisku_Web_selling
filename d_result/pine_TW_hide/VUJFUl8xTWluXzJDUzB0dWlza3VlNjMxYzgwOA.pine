//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: UBER_1Min_2CS0_e631c808 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2CS0_e631c808", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_e631c808(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= 0.545782 )
		if( d_k <= 0.343204 )
			if( k <= 98.0239 )
				if( rsi1 <= 49.1599 )
					if( ad <= -1694.45 )
						if( k <= 9.95181 )
							if( ad <= -27224.7 )
								if( d <= 1.24122 )
									ret := -0.137097
								if( d > 1.24122 )
									ret := 0.176895
							if( ad > -27224.7 )
								if( smoothK_k <= 5.611 )
									ret := -0.097233
								if( smoothK_k > 5.611 )
									ret := -0.418919
						if( k > 9.95181 )
							if( ad <= -2356.65 )
								if( k <= 94.0919 )
									ret := 0.044040
								if( k > 94.0919 )
									ret := -0.293750
							if( ad > -2356.65 )
								if( ad <= -2188.39 )
									ret := -0.517241
								if( ad > -2188.39 )
									ret := -0.076923
					if( ad > -1694.45 )
						if( d <= 49.5187 )
							if( smoothK_k <= 32.1322 )
								if( d <= 26.5253 )
									ret := 0.145551
								if( d > 26.5253 )
									ret := 0.639456
							if( smoothK_k > 32.1322 )
								if( ad <= -593.555 )
									ret := -0.254545
								if( ad > -593.555 )
									ret := 0.073171
						if( d > 49.5187 )
							if( mf <= -0.270897 )
								if( rsi1 <= 34.94 )
									ret := 0.647059
								if( rsi1 > 34.94 )
									ret := -0.106383
							if( mf > -0.270897 )
								if( rsi1 <= 43.5458 )
									ret := 0.500000
								if( rsi1 > 43.5458 )
									ret := 0.248837
				if( rsi1 > 49.1599 )
					if( d <= 43.7854 )
						if( ad <= -411.255 )
							if( smoothD_d <= 35.3039 )
								if( mf <= 0.145048 )
									ret := 0.066748
								if( mf > 0.145048 )
									ret := -0.214085
							if( smoothD_d > 35.3039 )
								if( k <= 45.1366 )
									ret := -0.620690
								if( k > 45.1366 )
									ret := -0.169014
						if( ad > -411.255 )
							if( smoothK_k <= 41.4298 )
								if( smoothK_k <= 27.6544 )
									ret := -0.329564
								if( smoothK_k > 27.6544 )
									ret := 0.021239
							if( smoothK_k > 41.4298 )
								if( smoothK_k <= 42.9756 )
									ret := -0.723077 // sell
								if( smoothK_k > 42.9756 )
									ret := -0.420779
					if( d > 43.7854 )
						if( ad <= -670.288 )
							if( smoothK_k <= 93.289 )
								if( ad <= -150865 )
									ret := -0.677419
								if( ad > -150865 )
									ret := 0.027586
							if( smoothK_k > 93.289 )
								if( d <= 93.601 )
									ret := 0.041237
								if( d > 93.601 )
									ret := 0.295775
						if( ad > -670.288 )
							if( ad <= -505.873 )
								if( mf <= 0.107651 )
									ret := -0.684211
								if( mf > 0.107651 )
									ret := 0.000000
							if( ad > -505.873 )
								if( ad_mf <= 0.366742 )
									ret := -0.076019
								if( ad_mf > 0.366742 )
									ret := -0.352518
			if( k > 98.0239 )
				if( ad <= -69.1404 )
					if( k <= 98.2617 )
						if( smoothK_k <= 95.073 )
							ret := -0.187500
						if( smoothK_k > 95.073 )
							if( ad_mf <= -12698.9 )
								if( rsi1 <= 51.2556 )
									ret := -1.000000 // sell
								if( rsi1 > 51.2556 )
									ret := -0.785714 // sell
							if( ad_mf > -12698.9 )
								if( smoothD_d <= 92.1678 )
									ret := -0.875000 // sell
								if( smoothD_d > 92.1678 )
									ret := -0.333333
					if( k > 98.2617 )
						if( smoothD_d <= 84.7818 )
							if( rsi1 <= 38.1773 )
								ret := 0.800000 // buy
							if( rsi1 > 38.1773 )
								if( ad <= -1536.41 )
									ret := -0.017391
								if( ad > -1536.41 )
									ret := 0.535714
						if( smoothD_d > 84.7818 )
							if( mf <= 0.039639 )
								if( rsi1 <= 70.6734 )
									ret := -0.057971
								if( rsi1 > 70.6734 )
									ret := 0.259259
							if( mf > 0.039639 )
								if( smoothD_d <= 91.4383 )
									ret := -0.480769
								if( smoothD_d > 91.4383 )
									ret := -0.133663
				if( ad > -69.1404 )
					if( smoothD_d <= 83.5675 )
						if( d_k <= -20.5894 )
							ret := -0.125000
						if( d_k > -20.5894 )
							if( d <= 85.0781 )
								if( d <= 82.4025 )
									ret := 0.272727
								if( d > 82.4025 )
									ret := 0.947368 // buy
							if( d > 85.0781 )
								ret := 0.166667
					if( smoothD_d > 83.5675 )
						if( d_k <= -0.881701 )
							if( mf <= -0.106843 )
								if( rsi1 <= 56.2758 )
									ret := -0.955556 // sell
								if( rsi1 > 56.2758 )
									ret := -0.534483
							if( mf > -0.106843 )
								if( d_k <= -9.34134 )
									ret := -0.903226 // sell
								if( d_k > -9.34134 )
									ret := -0.455959
						if( d_k > -0.881701 )
							if( k <= 99.9985 )
								if( smoothD_d <= 95.8711 )
									ret := -0.350000
								if( smoothD_d > 95.8711 )
									ret := 0.500000
							if( k > 99.9985 )
								if( mf <= 0.184619 )
									ret := -0.512195
								if( mf > 0.184619 )
									ret := 0.000000
		if( d_k > 0.343204 )
			if( mf <= -0.326299 )
				if( rsi1 <= 38.3376 )
					if( ad_mf <= -2674.23 )
						if( ad <= -12932.6 )
							if( ad <= -24083.1 )
								if( mf <= -0.845446 )
									ret := 0.882353 // buy
								if( mf > -0.845446 )
									ret := 0.143852
							if( ad > -24083.1 )
								if( d_k <= 9.8092 )
									ret := 0.410526
								if( d_k > 9.8092 )
									ret := 0.788462 // buy
						if( ad > -12932.6 )
							if( ad_mf <= -9099.7 )
								if( d_k <= 4.42714 )
									ret := -0.521739
								if( d_k > 4.42714 )
									ret := -0.181818
							if( ad_mf > -9099.7 )
								if( mf <= -0.43571 )
									ret := 0.538462
								if( mf > -0.43571 )
									ret := -0.111111
					if( ad_mf > -2674.23 )
						if( mf <= -0.385991 )
							if( ad <= -1408.75 )
								if( d <= 21.2137 )
									ret := 1.000000 // buy
								if( d > 21.2137 )
									ret := 0.909091 // buy
							if( ad > -1408.75 )
								if( rsi1 <= 23.954 )
									ret := -0.272727
								if( rsi1 > 23.954 )
									ret := 0.494737
						if( mf > -0.385991 )
							if( rsi1 <= 31.1875 )
								if( ad_mf <= 0.331482 )
									ret := 0.687500
								if( ad_mf > 0.331482 )
									ret := 1.000000 // buy
							if( rsi1 > 31.1875 )
								if( rsi1 <= 36.4794 )
									ret := 0.210526
								if( rsi1 > 36.4794 )
									ret := 0.928571 // buy
				if( rsi1 > 38.3376 )
					if( ad <= -258905 )
						if( smoothK_k <= 66.845 )
							ret := 1.000000 // buy
						if( smoothK_k > 66.845 )
							ret := 0.428571
					if( ad > -258905 )
						if( ad <= -20834.3 )
							if( smoothD_d <= 42.4565 )
								if( smoothD_d <= 11.8496 )
									ret := -0.428571
								if( smoothD_d > 11.8496 )
									ret := 0.521739
							if( smoothD_d > 42.4565 )
								if( smoothD_d <= 63.8006 )
									ret := -0.360000
								if( smoothD_d > 63.8006 )
									ret := -0.681818
						if( ad > -20834.3 )
							if( smoothK_k <= 20.7155 )
								if( smoothD_d <= 31.9572 )
									ret := 0.188679
								if( smoothD_d > 31.9572 )
									ret := 0.812500 // buy
							if( smoothK_k > 20.7155 )
								if( d <= 34.0385 )
									ret := -0.655172
								if( d > 34.0385 )
									ret := 0.046185
			if( mf > -0.326299 )
				if( rsi1 <= 54.8557 )
					if( ad <= -1165.33 )
						if( ad <= -25324.6 )
							if( ad <= -25401.3 )
								if( d_k <= 3.62765 )
									ret := -0.006679
								if( d_k > 3.62765 )
									ret := 0.113995
							if( ad > -25401.3 )
								if( smoothK_k <= 38.1727 )
									ret := 0.966667 // buy
								if( smoothK_k > 38.1727 )
									ret := 0.727273 // buy
						if( ad > -25324.6 )
							if( ad <= -24707 )
								if( mf <= 0.017821 )
									ret := -0.355556
								if( mf > 0.017821 )
									ret := -0.883333 // sell
							if( ad > -24707 )
								if( ad <= -20206.8 )
									ret := -0.148080
								if( ad > -20206.8 )
									ret := -0.013235
					if( ad > -1165.33 )
						if( k <= 67.5463 )
							if( d_k <= 12.9738 )
								if( smoothK_k <= 52.7782 )
									ret := 0.168683
								if( smoothK_k > 52.7782 )
									ret := 0.431718
							if( d_k > 12.9738 )
								if( smoothK_k <= 5.21998 )
									ret := 0.687500
								if( smoothK_k > 5.21998 )
									ret := 0.351702
						if( k > 67.5463 )
							if( rsi1 <= 50.3662 )
								if( d_k <= 3.47931 )
									ret := 0.532847
								if( d_k > 3.47931 )
									ret := 0.037559
							if( rsi1 > 50.3662 )
								if( k <= 83.6658 )
									ret := 0.023392
								if( k > 83.6658 )
									ret := -0.410714
				if( rsi1 > 54.8557 )
					if( d <= 79.7575 )
						if( ad <= -25979.5 )
							if( ad_mf <= -150991 )
								if( ad <= -223443 )
									ret := -0.285714
								if( ad > -223443 )
									ret := -0.837838 // sell
							if( ad_mf > -150991 )
								if( ad_mf <= -27355.5 )
									ret := 0.109244
								if( ad_mf > -27355.5 )
									ret := 0.800000 // buy
						if( ad > -25979.5 )
							if( d <= 74.3477 )
								if( k <= 68.4611 )
									ret := -0.088944
								if( k > 68.4611 )
									ret := 0.472973
							if( d > 74.3477 )
								if( mf <= 0.210151 )
									ret := -0.110329
								if( mf > 0.210151 )
									ret := -0.393064
					if( d > 79.7575 )
						if( smoothK_k <= 70.8743 )
							if( d <= 81.0635 )
								if( k <= 72.5242 )
									ret := 0.107527
								if( k > 72.5242 )
									ret := -0.615385
							if( d > 81.0635 )
								if( ad_mf <= -9963.42 )
									ret := -0.054795
								if( ad_mf > -9963.42 )
									ret := 0.552486
						if( smoothK_k > 70.8743 )
							if( ad_mf <= -46553.8 )
								if( d_k <= 5.17124 )
									ret := 0.086207
								if( d_k > 5.17124 )
									ret := 0.536000
							if( ad_mf > -46553.8 )
								if( ad_mf <= -45030.8 )
									ret := -1.000000 // sell
								if( ad_mf > -45030.8 )
									ret := 0.014364
	if( ad_mf > 0.545782 )
		if( smoothD_d <= 80.4167 )
			if( d_k <= -7.87161 )
				if( ad <= 2740.23 )
					if( smoothD_d <= 10.2637 )
						if( mf <= -0.59646 )
							ret := 0.100000
						if( mf > -0.59646 )
							if( k <= 20.3285 )
								if( rsi1 <= 47.3304 )
									ret := -0.666667
								if( rsi1 > 47.3304 )
									ret := -0.250000
							if( k > 20.3285 )
								if( ad_mf <= 2342.82 )
									ret := -0.822222 // sell
								if( ad_mf > 2342.82 )
									ret := -1.000000 // sell
					if( smoothD_d > 10.2637 )
						if( ad_mf <= 0.734289 )
							if( smoothK_k <= 83.2979 )
								if( d <= 22.5828 )
									ret := -0.869565 // sell
								if( d > 22.5828 )
									ret := -0.327869
							if( smoothK_k > 83.2979 )
								if( rsi1 <= 50.5416 )
									ret := -0.777778 // sell
								if( rsi1 > 50.5416 )
									ret := -1.000000 // sell
						if( ad_mf > 0.734289 )
							if( mf <= -0.123587 )
								if( ad <= 72.3568 )
									ret := 0.264706
								if( ad > 72.3568 )
									ret := -0.138075
							if( mf > -0.123587 )
								if( ad <= 2530.55 )
									ret := -0.266867
								if( ad > 2530.55 )
									ret := -0.723404 // sell
				if( ad > 2740.23 )
					if( ad <= 3100.77 )
						if( ad <= 2768.12 )
							ret := 0.769231 // buy
						if( ad > 2768.12 )
							if( ad_mf <= 2877.38 )
								ret := 0.000000
							if( ad_mf > 2877.38 )
								if( mf <= 0.088631 )
									ret := 0.236842
								if( mf > 0.088631 )
									ret := 0.785714 // buy
					if( ad > 3100.77 )
						if( k <= 91.1886 )
							if( ad <= 94260 )
								if( ad_mf <= 34648.9 )
									ret := -0.038536
								if( ad_mf > 34648.9 )
									ret := -0.159749
							if( ad > 94260 )
								if( smoothK_k <= 78.7077 )
									ret := 0.205962
								if( smoothK_k > 78.7077 )
									ret := -0.390625
						if( k > 91.1886 )
							if( ad_mf <= 5611.79 )
								if( ad <= 4304.2 )
									ret := 0.200000
								if( ad > 4304.2 )
									ret := -0.421053
							if( ad_mf > 5611.79 )
								if( k <= 99.9853 )
									ret := 0.206704
								if( k > 99.9853 )
									ret := -0.044118
			if( d_k > -7.87161 )
				if( ad <= 2243.75 )
					if( ad <= 2193.1 )
						if( smoothK_k <= -1.95586 )
							if( ad <= 528.875 )
								if( rsi1 <= 30.5889 )
									ret := -0.259259
								if( rsi1 > 30.5889 )
									ret := 0.076923
							if( ad > 528.875 )
								if( ad <= 1931.25 )
									ret := -0.814815 // sell
								if( ad > 1931.25 )
									ret := 0.000000
						if( smoothK_k > -1.95586 )
							if( rsi1 <= 51.9866 )
								if( smoothK_k <= 27.4825 )
									ret := -0.090909
								if( smoothK_k > 27.4825 )
									ret := 0.129707
							if( rsi1 > 51.9866 )
								if( ad_mf <= 917.63 )
									ret := -0.356800
								if( ad_mf > 917.63 )
									ret := -0.046326
					if( ad > 2193.1 )
						if( rsi1 <= 54.8329 )
							if( smoothD_d <= 52.0977 )
								if( smoothK_k <= 26.5917 )
									ret := -0.375000
								if( smoothK_k > 26.5917 )
									ret := 0.545455
							if( smoothD_d > 52.0977 )
								ret := -0.769231 // sell
						if( rsi1 > 54.8329 )
							if( rsi1 <= 63.4968 )
								ret := -1.000000 // sell
							if( rsi1 > 63.4968 )
								ret := -0.666667
				if( ad > 2243.75 )
					if( mf <= 0.318401 )
						if( d_k <= 5.56728 )
							if( ad_mf <= 2729.91 )
								if( mf <= -0.07163 )
									ret := 0.029412
								if( mf > -0.07163 )
									ret := 0.413613
							if( ad_mf > 2729.91 )
								if( ad <= 15252.3 )
									ret := -0.033474
								if( ad > 15252.3 )
									ret := 0.043845
						if( d_k > 5.56728 )
							if( ad_mf <= 3209.21 )
								if( k <= 50.2418 )
									ret := 0.166667
								if( k > 50.2418 )
									ret := 0.605263
							if( ad_mf > 3209.21 )
								if( smoothK_k <= 10.4959 )
									ret := -0.225462
								if( smoothK_k > 10.4959 )
									ret := -0.035774
					if( mf > 0.318401 )
						if( k <= 17.1612 )
							if( ad <= 26399.2 )
								if( ad_mf <= 4517.75 )
									ret := 0.557692
								if( ad_mf > 4517.75 )
									ret := 0.134228
							if( ad > 26399.2 )
								if( k <= 5.15458 )
									ret := 0.125000
								if( k > 5.15458 )
									ret := 0.640625
						if( k > 17.1612 )
							if( smoothD_d <= 78.7317 )
								if( ad_mf <= 182720 )
									ret := 0.242236
								if( ad_mf > 182720 )
									ret := -0.500000
							if( smoothD_d > 78.7317 )
								if( k <= 83.0609 )
									ret := -0.343750
								if( k > 83.0609 )
									ret := 0.294118
		if( smoothD_d > 80.4167 )
			if( ad <= 127017 )
				if( mf <= -0.312344 )
					if( d_k <= 6.9527 )
						if( rsi1 <= 45.9405 )
							if( ad <= 804.972 )
								ret := 0.388889
							if( ad > 804.972 )
								if( smoothD_d <= 90.3385 )
									ret := -0.200000
								if( smoothD_d > 90.3385 )
									ret := -0.857143 // sell
						if( rsi1 > 45.9405 )
							if( smoothD_d <= 86.1247 )
								if( rsi1 <= 52.5725 )
									ret := -0.956522 // sell
								if( rsi1 > 52.5725 )
									ret := -0.576923
							if( smoothD_d > 86.1247 )
								if( d <= 94.745 )
									ret := -0.333333
								if( d > 94.745 )
									ret := -0.645161
					if( d_k > 6.9527 )
						if( ad <= 187.5 )
							ret := 0.769231 // buy
						if( ad > 187.5 )
							ret := -0.250000
				if( mf > -0.312344 )
					if( ad <= 121503 )
						if( mf <= 0.496088 )
							if( k <= 99.3696 )
								if( mf <= 0.291121 )
									ret := -0.059712
								if( mf > 0.291121 )
									ret := -0.172462
							if( k > 99.3696 )
								if( ad <= 34046.7 )
									ret := -0.032869
								if( ad > 34046.7 )
									ret := 0.247748
						if( mf > 0.496088 )
							if( ad <= 3636.49 )
								if( ad <= 1307.66 )
									ret := -0.461538
								if( ad > 1307.66 )
									ret := -0.966667 // sell
							if( ad > 3636.49 )
								if( ad_mf <= 31426.7 )
									ret := 0.120000
								if( ad_mf > 31426.7 )
									ret := -0.760000 // sell
					if( ad > 121503 )
						ret := 0.818182 // buy
			if( ad > 127017 )
				if( ad_mf <= 161578 )
					if( ad <= 129213 )
						if( rsi1 <= 68.2995 )
							ret := -0.785714 // sell
						if( rsi1 > 68.2995 )
							ret := -1.000000 // sell
					if( ad > 129213 )
						if( ad <= 145775 )
							if( k <= 96.9388 )
								ret := 0.235294
							if( k > 96.9388 )
								ret := -0.538462
						if( ad > 145775 )
							if( mf <= 0.251245 )
								if( smoothK_k <= 92.5453 )
									ret := 0.100000
								if( smoothK_k > 92.5453 )
									ret := -0.363636
							if( mf > 0.251245 )
								if( smoothD_d <= 89.4442 )
									ret := -1.000000 // sell
								if( smoothD_d > 89.4442 )
									ret := -0.800000 // sell
				if( ad_mf > 161578 )
					if( ad_mf <= 456850 )
						if( ad <= 185259 )
							if( ad_mf <= 170469 )
								ret := -0.157895
							if( ad_mf > 170469 )
								ret := 0.533333
						if( ad > 185259 )
							if( d <= 86.4213 )
								ret := -0.733333 // sell
							if( d > 86.4213 )
								if( rsi1 <= 73.9981 )
									ret := -0.419355
								if( rsi1 > 73.9981 )
									ret := 0.181818
					if( ad_mf > 456850 )
						ret := -0.730769 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_UBER_1Min_e631c808(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


