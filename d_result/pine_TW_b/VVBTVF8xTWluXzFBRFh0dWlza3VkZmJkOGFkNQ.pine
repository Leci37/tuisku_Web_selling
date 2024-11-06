//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: UPST_1Min_1ADX_dfbd8ad5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1ADX_dfbd8ad5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_dfbd8ad5(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( directionalMovementMinus <= 0.090401 )
		if( directionalMovementMinus <= 0.036578 )
			if( directionalMovementPlus <= 0.101964 )
				if( diPlus <= 66.0983 )
					if( adx <= 16.9236 )
						if( directionalMovementPlus <= 0.001348 )
							if( smoothedTrueRange <= 0.06178 )
								if( diMinus <= 43.307 )
									ret := 0.018467
								if( diMinus > 43.307 )
									ret := 0.154114
							if( smoothedTrueRange > 0.06178 )
								if( diPlus <= 48.3082 )
									ret := -0.104686
								if( diPlus > 48.3082 )
									ret := 0.225490
						if( directionalMovementPlus > 0.001348 )
							if( diMinus <= 58.4664 )
								if( dx <= 2.82968 )
									ret := -0.294199
								if( dx > 2.82968 )
									ret := -0.117781
							if( diMinus > 58.4664 )
								if( adx <= 13.8337 )
									ret := 0.000000
								if( adx > 13.8337 )
									ret := 0.666667
					if( adx > 16.9236 )
						if( smoothedDirectionalMovementPlus <= 0.070178 )
							if( diPlus <= 48.436 )
								if( smoothedDirectionalMovementMinus <= 0.042387 )
									ret := 0.018919
								if( smoothedDirectionalMovementMinus > 0.042387 )
									ret := -0.078786
							if( diPlus > 48.436 )
								if( smoothedDirectionalMovementMinus <= 0.020844 )
									ret := -0.063668
								if( smoothedDirectionalMovementMinus > 0.020844 )
									ret := -0.332731
						if( smoothedDirectionalMovementPlus > 0.070178 )
							if( dx <= 95.8664 )
								if( trueRange <= 0.487868 )
									ret := 0.220459
								if( trueRange > 0.487868 )
									ret := -0.541667
							if( dx > 95.8664 )
								if( diMinus <= 0.098322 )
									ret := 0.266667
								if( diMinus > 0.098322 )
									ret := -1.000000 // sell
				if( diPlus > 66.0983 )
					if( dx <= 75.3718 )
						if( diPlus <= 78.6757 )
							if( diMinus <= 21.9479 )
								if( diPlus <= 73.8004 )
									ret := -0.586957
								if( diPlus > 73.8004 )
									ret := -0.208791
							if( diMinus > 21.9479 )
								if( dx <= 38.098 )
									ret := -0.465753
								if( dx > 38.098 )
									ret := -0.116041
						if( diPlus > 78.6757 )
							if( smoothedDirectionalMovementMinus <= 0.004867 )
								if( adx <= 34.9917 )
									ret := 0.666667
								if( adx > 34.9917 )
									ret := 0.928571 // buy
							if( smoothedDirectionalMovementMinus > 0.004867 )
								if( adx <= 43.1849 )
									ret := 0.196078
								if( adx > 43.1849 )
									ret := -0.735294 // sell
					if( dx > 75.3718 )
						if( directionalMovementPlus <= 0.041717 )
							if( smoothedDirectionalMovementPlus <= 0.033698 )
								if( trueRange <= 0.025 )
									ret := -0.400000
								if( trueRange > 0.025 )
									ret := -0.700000 // sell
							if( smoothedDirectionalMovementPlus > 0.033698 )
								if( dx <= 91.8061 )
									ret := -0.892308 // sell
								if( dx > 91.8061 )
									ret := -0.631579
						if( directionalMovementPlus > 0.041717 )
							if( directionalMovementPlus <= 0.062394 )
								ret := 0.269231
							if( directionalMovementPlus > 0.062394 )
								ret := -0.666667
			if( directionalMovementPlus > 0.101964 )
				if( smoothedTrueRange <= 0.092599 )
					if( diPlus <= 51.1249 )
						if( dx <= 6.25587 )
							if( diMinus <= 41.3228 )
								if( adx <= 15.7215 )
									ret := -0.750000 // sell
								if( adx > 15.7215 )
									ret := 0.149254
							if( diMinus > 41.3228 )
								if( smoothedDirectionalMovementPlus <= 0.022889 )
									ret := -0.171429
								if( smoothedDirectionalMovementPlus > 0.022889 )
									ret := -0.723810 // sell
						if( dx > 6.25587 )
							if( smoothedTrueRange <= 0.041255 )
								if( directionalMovementPlus <= 0.132925 )
									ret := -0.647059
								if( directionalMovementPlus > 0.132925 )
									ret := -0.928571 // sell
							if( smoothedTrueRange > 0.041255 )
								if( diPlus <= 50.3063 )
									ret := -0.114434
								if( diPlus > 50.3063 )
									ret := 0.439024
					if( diPlus > 51.1249 )
						if( trueRange <= 0.140357 )
							if( smoothedDirectionalMovementMinus <= 0.008469 )
								if( diMinus <= 17.5988 )
									ret := 0.061224
								if( diMinus > 17.5988 )
									ret := -0.708333 // sell
							if( smoothedDirectionalMovementMinus > 0.008469 )
								if( trueRange <= 0.105748 )
									ret := 0.111111
								if( trueRange > 0.105748 )
									ret := -0.553922
						if( trueRange > 0.140357 )
							if( diPlus <= 81.7841 )
								if( adx <= 14.0633 )
									ret := -0.239437
								if( adx > 14.0633 )
									ret := -0.713604 // sell
							if( diPlus > 81.7841 )
								ret := -1.000000 // sell
				if( smoothedTrueRange > 0.092599 )
					if( smoothedDirectionalMovementMinus <= 0.109233 )
						if( diPlus <= 63.0327 )
							if( directionalMovementMinus <= 0.001353 )
								if( adx <= 13.4011 )
									ret := -0.467742
								if( adx > 13.4011 )
									ret := -0.078922
							if( directionalMovementMinus > 0.001353 )
								if( adx <= 67.7454 )
									ret := -0.236000
								if( adx > 67.7454 )
									ret := -1.000000 // sell
						if( diPlus > 63.0327 )
							if( diMinus <= 12.0789 )
								if( trueRange <= 0.200085 )
									ret := -1.000000 // sell
								if( trueRange > 0.200085 )
									ret := -0.240000
							if( diMinus > 12.0789 )
								if( smoothedDirectionalMovementPlus <= 0.08914 )
									ret := -0.967742 // sell
								if( smoothedDirectionalMovementPlus > 0.08914 )
									ret := -0.761905 // sell
					if( smoothedDirectionalMovementMinus > 0.109233 )
						if( directionalMovementPlus <= 0.23995 )
							if( diPlus <= 16.4095 )
								if( adx <= 66.2239 )
									ret := 0.833333 // buy
								if( adx > 66.2239 )
									ret := 1.000000 // buy
							if( diPlus > 16.4095 )
								ret := 0.300000
						if( directionalMovementPlus > 0.23995 )
							if( smoothedDirectionalMovementPlus <= 0.086264 )
								ret := -0.235294
							if( smoothedDirectionalMovementPlus > 0.086264 )
								ret := 0.333333
		if( directionalMovementMinus > 0.036578 )
			if( diPlus <= 23.3607 )
				if( diPlus <= 0.292095 )
					if( smoothedDirectionalMovementPlus <= 9.6e-05 )
						if( smoothedTrueRange <= 0.102275 )
							if( smoothedTrueRange <= 0.057075 )
								if( smoothedDirectionalMovementPlus <= 3.2e-05 )
									ret := -0.500000
								if( smoothedDirectionalMovementPlus > 3.2e-05 )
									ret := -1.000000 // sell
							if( smoothedTrueRange > 0.057075 )
								ret := -1.000000 // sell
						if( smoothedTrueRange > 0.102275 )
							ret := -0.571429
					if( smoothedDirectionalMovementPlus > 9.6e-05 )
						ret := 0.000000
				if( diPlus > 0.292095 )
					if( smoothedTrueRange <= 0.194501 )
						if( trueRange <= 0.20032 )
							if( smoothedTrueRange <= 0.030871 )
								if( smoothedDirectionalMovementMinus <= 0.010593 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.010593 )
									ret := 0.389831
							if( smoothedTrueRange > 0.030871 )
								if( smoothedDirectionalMovementMinus <= 0.077534 )
									ret := -0.022219
								if( smoothedDirectionalMovementMinus > 0.077534 )
									ret := -0.630769
						if( trueRange > 0.20032 )
							if( directionalMovementMinus <= 0.044373 )
								if( directionalMovementPlus <= 0.000312 )
									ret := 1.000000 // buy
								if( directionalMovementPlus > 0.000312 )
									ret := 0.777778 // buy
							if( directionalMovementMinus > 0.044373 )
								if( diMinus <= 19.3729 )
									ret := 0.740741 // buy
								if( diMinus > 19.3729 )
									ret := 0.146341
					if( smoothedTrueRange > 0.194501 )
						if( smoothedDirectionalMovementPlus <= 0.036188 )
							if( diMinus <= 42.0906 )
								if( diPlus <= 15.5934 )
									ret := -0.217391
								if( diPlus > 15.5934 )
									ret := 0.268293
							if( diMinus > 42.0906 )
								if( trueRange <= 0.131009 )
									ret := 0.818182 // buy
								if( trueRange > 0.131009 )
									ret := 0.500000
						if( smoothedDirectionalMovementPlus > 0.036188 )
							if( directionalMovementMinus <= 0.048951 )
								if( directionalMovementPlus <= 0.007617 )
									ret := 0.150000
								if( directionalMovementPlus > 0.007617 )
									ret := -0.684211
							if( directionalMovementMinus > 0.048951 )
								if( dx <= 18.7138 )
									ret := -0.365854
								if( dx > 18.7138 )
									ret := -0.677778
			if( diPlus > 23.3607 )
				if( diMinus <= 35.9824 )
					if( smoothedTrueRange <= 0.084298 )
						if( trueRange <= 0.146196 )
							if( directionalMovementPlus <= 0.002129 )
								if( dx <= 59.4758 )
									ret := 0.000000
								if( dx > 59.4758 )
									ret := -0.420561
							if( directionalMovementPlus > 0.002129 )
								if( adx <= 15.2659 )
									ret := -0.764706 // sell
								if( adx > 15.2659 )
									ret := -0.164751
						if( trueRange > 0.146196 )
							if( adx <= 23.9665 )
								if( diMinus <= 29.6782 )
									ret := 0.642857
								if( diMinus > 29.6782 )
									ret := 1.000000 // buy
							if( adx > 23.9665 )
								if( directionalMovementMinus <= 0.06314 )
									ret := 0.352941
								if( directionalMovementMinus > 0.06314 )
									ret := -0.555556
					if( smoothedTrueRange > 0.084298 )
						if( diMinus <= 35.5369 )
							if( directionalMovementPlus <= 0.152507 )
								if( diMinus <= 5.19351 )
									ret := -0.400000
								if( diMinus > 5.19351 )
									ret := 0.146287
							if( directionalMovementPlus > 0.152507 )
								ret := -0.888889 // sell
						if( diMinus > 35.5369 )
							ret := -0.857143 // sell
				if( diMinus > 35.9824 )
					if( smoothedDirectionalMovementPlus <= 0.01907 )
						if( diMinus <= 66.1522 )
							if( directionalMovementPlus <= 0.000491 )
								if( adx <= 9.38768 )
									ret := -0.166667
								if( adx > 9.38768 )
									ret := 0.349265
							if( directionalMovementPlus > 0.000491 )
								if( diPlus <= 35.7765 )
									ret := 0.868421 // buy
								if( diPlus > 35.7765 )
									ret := 0.333333
						if( diMinus > 66.1522 )
							if( directionalMovementPlus <= 0.003674 )
								if( dx <= 37.423 )
									ret := 0.538462
								if( dx > 37.423 )
									ret := 0.875000 // buy
							if( directionalMovementPlus > 0.003674 )
								ret := 0.000000
					if( smoothedDirectionalMovementPlus > 0.01907 )
						if( diMinus <= 57.9662 )
							if( adx <= 16.7783 )
								if( trueRange <= 0.131157 )
									ret := 0.076253
								if( trueRange > 0.131157 )
									ret := -0.454545
							if( adx > 16.7783 )
								if( smoothedDirectionalMovementMinus <= 0.047703 )
									ret := 0.330909
								if( smoothedDirectionalMovementMinus > 0.047703 )
									ret := -0.034884
						if( diMinus > 57.9662 )
							if( smoothedDirectionalMovementMinus <= 0.036802 )
								ret := 0.076923
							if( smoothedDirectionalMovementMinus > 0.036802 )
								if( trueRange <= 0.050516 )
									ret := 0.153846
								if( trueRange > 0.050516 )
									ret := 0.830769 // buy
	if( directionalMovementMinus > 0.090401 )
		if( directionalMovementMinus <= 0.240169 )
			if( smoothedDirectionalMovementMinus <= 0.03162 )
				if( diMinus <= 39.6976 )
					if( diPlus <= 23.7528 )
						if( smoothedTrueRange <= 0.059646 )
							if( adx <= 24.8415 )
								ret := 0.000000
							if( adx > 24.8415 )
								ret := 1.000000 // buy
						if( smoothedTrueRange > 0.059646 )
							if( trueRange <= 0.114206 )
								if( adx <= 18.0939 )
									ret := -1.000000 // sell
								if( adx > 18.0939 )
									ret := -0.288889
							if( trueRange > 0.114206 )
								if( diMinus <= 34.7882 )
									ret := 0.102339
								if( diMinus > 34.7882 )
									ret := -0.365385
					if( diPlus > 23.7528 )
						if( adx <= 77.1676 )
							if( smoothedDirectionalMovementPlus <= 0.017454 )
								if( diMinus <= 29.78 )
									ret := 0.312500
								if( diMinus > 29.78 )
									ret := 0.746667 // buy
							if( smoothedDirectionalMovementPlus > 0.017454 )
								if( smoothedTrueRange <= 0.045783 )
									ret := -0.529412
								if( smoothedTrueRange > 0.045783 )
									ret := 0.263761
						if( adx > 77.1676 )
							ret := -0.882353 // sell
				if( diMinus > 39.6976 )
					if( smoothedDirectionalMovementMinus <= 0.019036 )
						if( trueRange <= 0.1195 )
							if( smoothedDirectionalMovementMinus <= 0.014373 )
								ret := 1.000000 // buy
							if( smoothedDirectionalMovementMinus > 0.014373 )
								if( adx <= 30.5606 )
									ret := 0.625000
								if( adx > 30.5606 )
									ret := 0.181818
						if( trueRange > 0.1195 )
							if( diMinus <= 46.5998 )
								ret := 0.818182 // buy
							if( diMinus > 46.5998 )
								ret := 1.000000 // buy
					if( smoothedDirectionalMovementMinus > 0.019036 )
						if( smoothedTrueRange <= 0.039694 )
							if( dx <= 22.2565 )
								ret := -0.823529 // sell
							if( dx > 22.2565 )
								if( smoothedTrueRange <= 0.031788 )
									ret := -0.222222
								if( smoothedTrueRange > 0.031788 )
									ret := 0.404762
						if( smoothedTrueRange > 0.039694 )
							if( directionalMovementMinus <= 0.13089 )
								if( smoothedDirectionalMovementMinus <= 0.023197 )
									ret := 0.666667
								if( smoothedDirectionalMovementMinus > 0.023197 )
									ret := 0.282297
							if( directionalMovementMinus > 0.13089 )
								if( directionalMovementMinus <= 0.153832 )
									ret := 0.627660
								if( directionalMovementMinus > 0.153832 )
									ret := 0.868687 // buy
			if( smoothedDirectionalMovementMinus > 0.03162 )
				if( diPlus <= 40.337 )
					if( directionalMovementMinus <= 0.091397 )
						if( smoothedDirectionalMovementPlus <= 0.036655 )
							if( smoothedTrueRange <= 0.150961 )
								if( directionalMovementMinus <= 0.090895 )
									ret := 1.000000 // buy
								if( directionalMovementMinus > 0.090895 )
									ret := 0.846154 // buy
							if( smoothedTrueRange > 0.150961 )
								ret := 0.571429
						if( smoothedDirectionalMovementPlus > 0.036655 )
							ret := -0.285714
					if( directionalMovementMinus > 0.091397 )
						if( adx <= 10.6236 )
							if( trueRange <= 0.192415 )
								if( smoothedDirectionalMovementPlus <= 0.032158 )
									ret := -0.210526
								if( smoothedDirectionalMovementPlus > 0.032158 )
									ret := -0.642857
							if( trueRange > 0.192415 )
								if( smoothedTrueRange <= 0.139838 )
									ret := -0.636364
								if( smoothedTrueRange > 0.139838 )
									ret := -0.958333 // sell
						if( adx > 10.6236 )
							if( smoothedDirectionalMovementPlus <= 0.001158 )
								if( adx <= 63.7466 )
									ret := 0.428571
								if( adx > 63.7466 )
									ret := 0.909091 // buy
							if( smoothedDirectionalMovementPlus > 0.001158 )
								if( diMinus <= 9.95054 )
									ret := -0.909091 // sell
								if( diMinus > 9.95054 )
									ret := 0.070652
				if( diPlus > 40.337 )
					if( trueRange <= 0.19004 )
						if( diMinus <= 19.0879 )
							ret := -1.000000 // sell
						if( diMinus > 19.0879 )
							if( diMinus <= 26.6366 )
								ret := 1.000000 // buy
							if( diMinus > 26.6366 )
								if( diMinus <= 34.4031 )
									ret := -0.733333 // sell
								if( diMinus > 34.4031 )
									ret := 0.504132
					if( trueRange > 0.19004 )
						if( diPlus <= 49.0524 )
							if( smoothedDirectionalMovementMinus <= 0.040896 )
								if( smoothedDirectionalMovementPlus <= 0.038573 )
									ret := 0.363636
								if( smoothedDirectionalMovementPlus > 0.038573 )
									ret := 0.933333 // buy
							if( smoothedDirectionalMovementMinus > 0.040896 )
								if( trueRange <= 0.222573 )
									ret := 0.900000 // buy
								if( trueRange > 0.222573 )
									ret := 1.000000 // buy
						if( diPlus > 49.0524 )
							if( diMinus <= 24.2901 )
								ret := 0.444444
							if( diMinus > 24.2901 )
								ret := 0.166667
		if( directionalMovementMinus > 0.240169 )
			if( adx <= 49.0378 )
				if( smoothedDirectionalMovementPlus <= 0.028475 )
					if( diPlus <= 9.76294 )
						if( smoothedTrueRange <= 0.110309 )
							ret := 0.833333 // buy
						if( smoothedTrueRange > 0.110309 )
							if( dx <= 81.5533 )
								if( smoothedTrueRange <= 0.206532 )
									ret := 0.111111
								if( smoothedTrueRange > 0.206532 )
									ret := -0.571429
							if( dx > 81.5533 )
								ret := -0.900000 // sell
					if( diPlus > 9.76294 )
						if( diMinus <= 73.6121 )
							if( diPlus <= 23.7887 )
								if( diMinus <= 63.757 )
									ret := 0.515152
								if( diMinus > 63.757 )
									ret := 0.882353 // buy
							if( diPlus > 23.7887 )
								if( trueRange <= 0.474659 )
									ret := 1.000000 // buy
								if( trueRange > 0.474659 )
									ret := 0.900000 // buy
						if( diMinus > 73.6121 )
							ret := 0.066667
				if( smoothedDirectionalMovementPlus > 0.028475 )
					if( adx <= 21.8817 )
						if( smoothedDirectionalMovementPlus <= 0.037057 )
							if( diPlus <= 39.4259 )
								if( directionalMovementMinus <= 0.303392 )
									ret := 0.545455
								if( directionalMovementMinus > 0.303392 )
									ret := -0.272727
							if( diPlus > 39.4259 )
								ret := -0.666667
						if( smoothedDirectionalMovementPlus > 0.037057 )
							if( smoothedDirectionalMovementPlus <= 0.068149 )
								if( smoothedDirectionalMovementPlus <= 0.043962 )
									ret := 0.861111 // buy
								if( smoothedDirectionalMovementPlus > 0.043962 )
									ret := 0.405405
							if( smoothedDirectionalMovementPlus > 0.068149 )
								ret := 1.000000 // buy
					if( adx > 21.8817 )
						if( trueRange <= 0.668827 )
							if( adx <= 23.5501 )
								if( smoothedTrueRange <= 0.210027 )
									ret := -0.636364
								if( smoothedTrueRange > 0.210027 )
									ret := -1.000000 // sell
							if( adx > 23.5501 )
								if( dx <= 43.2615 )
									ret := 0.116071
								if( dx > 43.2615 )
									ret := 0.870968 // buy
						if( trueRange > 0.668827 )
							if( adx <= 26.251 )
								ret := -1.000000 // sell
							if( adx > 26.251 )
								ret := -0.642857
			if( adx > 49.0378 )
				if( smoothedDirectionalMovementPlus <= 0.117143 )
					if( smoothedTrueRange <= 0.110835 )
						ret := 0.333333
					if( smoothedTrueRange > 0.110835 )
						if( dx <= 69.908 )
							if( dx <= 53.6252 )
								if( diMinus <= 26.5204 )
									ret := 0.731707 // buy
								if( diMinus > 26.5204 )
									ret := 1.000000 // buy
							if( dx > 53.6252 )
								ret := 0.384615
						if( dx > 69.908 )
							if( smoothedDirectionalMovementMinus <= 0.086943 )
								ret := 0.833333 // buy
							if( smoothedDirectionalMovementMinus > 0.086943 )
								ret := 1.000000 // buy
				if( smoothedDirectionalMovementPlus > 0.117143 )
					ret := 0.235294
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_UPST_1Min_dfbd8ad5(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)

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


