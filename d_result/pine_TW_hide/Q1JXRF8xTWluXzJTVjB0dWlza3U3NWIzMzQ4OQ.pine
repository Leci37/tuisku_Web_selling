//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: CRWD_1Min_2SV0_75b33489 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2SV0_75b33489", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_75b33489(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothK_k <= 75.6563 )
		if( rsi1 <= 25.1237 )
			if( d_k <= -3.89493 )
				if( k <= 7.71565 )
					if( smoothK_k <= 3.7456 )
						ret := 0.176471
					if( smoothK_k > 3.7456 )
						ret := -0.866667 // sell
				if( k > 7.71565 )
					if( VIM <= 1.46639 )
						if( smoothD_d <= 12.4538 )
							if( rsi1 <= 17.1711 )
								if( d_k <= -4.92665 )
									ret := -0.200000
								if( d_k > -4.92665 )
									ret := 0.800000 // buy
							if( rsi1 > 17.1711 )
								if( VIP <= 0.74007 )
									ret := 0.573991
								if( VIP > 0.74007 )
									ret := 0.230769
						if( smoothD_d > 12.4538 )
							if( smoothD_d <= 36.682 )
								if( VIP_VIM <= -0.720726 )
									ret := -0.428571
								if( VIP_VIM > -0.720726 )
									ret := 0.060870
							if( smoothD_d > 36.682 )
								if( smoothD_d <= 46.7009 )
									ret := 0.666667
								if( smoothD_d > 46.7009 )
									ret := 0.272727
					if( VIM > 1.46639 )
						if( rsi1 <= 21.1474 )
							if( rsi1 <= 15.1123 )
								ret := 0.761905 // buy
							if( rsi1 > 15.1123 )
								if( VIP <= 2.20646 )
									ret := 0.534884
								if( VIP > 2.20646 )
									ret := -0.230769
						if( rsi1 > 21.1474 )
							if( VIP_VIM <= -0.732154 )
								if( k <= 16.6466 )
									ret := 1.000000 // buy
								if( k > 16.6466 )
									ret := 0.533333
							if( VIP_VIM > -0.732154 )
								if( d <= 11.6965 )
									ret := 0.900000 // buy
								if( d > 11.6965 )
									ret := 1.000000 // buy
			if( d_k > -3.89493 )
				if( VIP <= 0.719492 )
					if( smoothK_k <= -2.7627 )
						if( VIP <= 0.692478 )
							if( d_k <= 6.73818 )
								if( smoothD_d <= -2.83095 )
									ret := 0.502857
								if( smoothD_d > -2.83095 )
									ret := 0.295775
							if( d_k > 6.73818 )
								if( smoothD_d <= 5.20224 )
									ret := -0.607143
								if( smoothD_d > 5.20224 )
									ret := 0.000000
						if( VIP > 0.692478 )
							if( VIM <= 1.33643 )
								if( d <= 0.151889 )
									ret := -0.901961 // sell
								if( d > 0.151889 )
									ret := -0.018182
							if( VIM > 1.33643 )
								if( d_k <= 1.14673 )
									ret := 0.533333
								if( d_k > 1.14673 )
									ret := 0.700000 // buy
					if( smoothK_k > -2.7627 )
						if( rsi1 <= 19.9866 )
							if( smoothD_d <= 18.374 )
								if( VIM <= 1.50153 )
									ret := -0.281147
								if( VIM > 1.50153 )
									ret := 0.195122
							if( smoothD_d > 18.374 )
								if( d <= 27.1782 )
									ret := 0.829787 // buy
								if( d > 27.1782 )
									ret := 0.066667
						if( rsi1 > 19.9866 )
							if( d_k <= -0.89315 )
								if( smoothK_k <= 8.13189 )
									ret := -0.345550
								if( smoothK_k > 8.13189 )
									ret := 0.232558
							if( d_k > -0.89315 )
								if( smoothK_k <= 5.93225 )
									ret := 0.392405
								if( smoothK_k > 5.93225 )
									ret := -0.045714
				if( VIP > 0.719492 )
					if( k <= 3.01966 )
						if( VIM <= 1.26858 )
							if( d <= 0.232019 )
								if( VIP_VIM <= -0.459442 )
									ret := -0.571429
								if( VIP_VIM > -0.459442 )
									ret := -0.833333 // sell
							if( d > 0.232019 )
								if( d_k <= -0.88022 )
									ret := 0.818182 // buy
								if( d_k > -0.88022 )
									ret := -0.216216
						if( VIM > 1.26858 )
							if( k <= 1.44455 )
								if( rsi1 <= 8.70019 )
									ret := -0.466667
								if( rsi1 > 8.70019 )
									ret := 0.450521
							if( k > 1.44455 )
								if( smoothK_k <= -1.13129 )
									ret := -0.560000
								if( smoothK_k > -1.13129 )
									ret := 0.110236
					if( k > 3.01966 )
						if( rsi1 <= 23.1116 )
							if( d <= 15.7876 )
								if( VIP <= 0.762539 )
									ret := 0.321918
								if( VIP > 0.762539 )
									ret := 0.664671
							if( d > 15.7876 )
								if( VIP <= 3.98294 )
									ret := 0.235616
								if( VIP > 3.98294 )
									ret := -0.666667
						if( rsi1 > 23.1116 )
							if( k <= 10.5915 )
								if( smoothD_d <= 19.8831 )
									ret := 0.005780
								if( smoothD_d > 19.8831 )
									ret := -1.000000 // sell
							if( k > 10.5915 )
								if( VIM <= 1.58688 )
									ret := 0.152542
								if( VIM > 1.58688 )
									ret := 0.641791
		if( rsi1 > 25.1237 )
			if( VIP_VIM <= -0.173295 )
				if( d <= 43.9776 )
					if( k <= 0.094153 )
						if( d <= 2.33471 )
							if( d <= 1.54238 )
								if( VIP <= 0.876644 )
									ret := -0.258427
								if( VIP > 0.876644 )
									ret := 0.084112
							if( d > 1.54238 )
								if( d_k <= 1.81125 )
									ret := 0.851852 // buy
								if( d_k > 1.81125 )
									ret := 0.452381
						if( d > 2.33471 )
							if( d_k <= 5.70541 )
								if( VIM <= 1.56925 )
									ret := -0.471774
								if( VIM > 1.56925 )
									ret := 0.466667
							if( d_k > 5.70541 )
								if( smoothK_k <= -2.98202 )
									ret := -0.125448
								if( smoothK_k > -2.98202 )
									ret := 0.545455
					if( k > 0.094153 )
						if( rsi1 <= 33.0472 )
							if( rsi1 <= 27.9492 )
								if( VIP <= 0.898482 )
									ret := -0.161246
								if( VIP > 0.898482 )
									ret := 0.223529
							if( rsi1 > 27.9492 )
								if( VIP_VIM <= -0.747348 )
									ret := 0.454082
								if( VIP_VIM > -0.747348 )
									ret := 0.040962
						if( rsi1 > 33.0472 )
							if( k <= 19.3022 )
								if( VIP_VIM <= -0.282694 )
									ret := -0.139960
								if( VIP_VIM > -0.282694 )
									ret := -0.041971
							if( k > 19.3022 )
								if( k <= 21.6052 )
									ret := 0.106589
								if( k > 21.6052 )
									ret := -0.045155
				if( d > 43.9776 )
					if( d_k <= 30.6976 )
						if( rsi1 <= 28.8299 )
							if( smoothD_d <= 60.1466 )
								if( VIP <= 0.925807 )
									ret := 0.443396
								if( VIP > 0.925807 )
									ret := 0.906977 // buy
							if( smoothD_d > 60.1466 )
								if( d <= 77.1647 )
									ret := -0.260274
								if( d > 77.1647 )
									ret := 0.551724
						if( rsi1 > 28.8299 )
							if( VIM <= 319.162 )
								if( VIP <= 1.03869 )
									ret := -0.001046
								if( VIP > 1.03869 )
									ret := 0.123164
							if( VIM > 319.162 )
								ret := -1.000000 // sell
					if( d_k > 30.6976 )
						if( rsi1 <= 31.3586 )
							if( VIM <= 1.23029 )
								ret := -0.900000 // sell
							if( VIM > 1.23029 )
								ret := -1.000000 // sell
						if( rsi1 > 31.3586 )
							ret := -0.523810
			if( VIP_VIM > -0.173295 )
				if( rsi1 <= 57.363 )
					if( VIM <= 1.13318 )
						if( k <= 50.1752 )
							if( k <= 47.6942 )
								if( smoothD_d <= 40.0373 )
									ret := 0.082614
								if( smoothD_d > 40.0373 )
									ret := -0.060051
							if( k > 47.6942 )
								if( VIM <= 1.0882 )
									ret := 0.323144
								if( VIM > 1.0882 )
									ret := -0.250000
						if( k > 50.1752 )
							if( smoothK_k <= 63.1597 )
								if( VIP <= 0.897616 )
									ret := 0.652174
								if( VIP > 0.897616 )
									ret := -0.051374
							if( smoothK_k > 63.1597 )
								if( d <= 65.5945 )
									ret := 0.145005
								if( d > 65.5945 )
									ret := 0.005233
					if( VIM > 1.13318 )
						if( d <= 24.5062 )
							if( d_k <= -16.1335 )
								if( VIP_VIM <= 0.193716 )
									ret := -0.666667
								if( VIP_VIM > 0.193716 )
									ret := -1.000000 // sell
							if( d_k > -16.1335 )
								if( d <= 14.4983 )
									ret := 0.131742
								if( d > 14.4983 )
									ret := -0.064436
						if( d > 24.5062 )
							if( rsi1 <= 46.7608 )
								if( d <= 26.4925 )
									ret := 0.682692
								if( d > 26.4925 )
									ret := 0.261059
							if( rsi1 > 46.7608 )
								if( VIM <= 20.998 )
									ret := 0.124552
								if( VIM > 20.998 )
									ret := 0.548673
				if( rsi1 > 57.363 )
					if( k <= 75.9742 )
						if( VIM <= 267.314 )
							if( VIM <= 0.864613 )
								if( VIM <= 0.780695 )
									ret := -0.050248
								if( VIM > 0.780695 )
									ret := 0.062703
							if( VIM > 0.864613 )
								if( VIP <= 49.0036 )
									ret := -0.070092
								if( VIP > 49.0036 )
									ret := 0.727273 // buy
						if( VIM > 267.314 )
							if( VIP_VIM <= 0.245445 )
								if( d <= 44.7159 )
									ret := -1.000000 // sell
								if( d > 44.7159 )
									ret := -0.947368 // sell
							if( VIP_VIM > 0.245445 )
								ret := -0.727273 // sell
					if( k > 75.9742 )
						if( smoothD_d <= 70.7157 )
							if( rsi1 <= 63.4363 )
								if( VIM <= 0.890586 )
									ret := 0.461538
								if( VIM > 0.890586 )
									ret := -0.092105
							if( rsi1 > 63.4363 )
								if( rsi1 <= 72.4756 )
									ret := 0.674419
								if( rsi1 > 72.4756 )
									ret := -0.240000
						if( smoothD_d > 70.7157 )
							if( smoothD_d <= 78.0001 )
								if( VIM <= 0.890353 )
									ret := -0.182692
								if( VIM > 0.890353 )
									ret := -0.522936
							if( smoothD_d > 78.0001 )
								if( d <= 85.0879 )
									ret := 0.016667
								if( d > 85.0879 )
									ret := 0.316239
	if( smoothK_k > 75.6563 )
		if( k <= 80.1168 )
			if( VIM <= 0.857868 )
				if( smoothD_d <= 69.501 )
					if( rsi1 <= 65.887 )
						ret := -0.722222 // sell
					if( rsi1 > 65.887 )
						ret := 0.650000
				if( smoothD_d > 69.501 )
					if( VIP <= 1.37066 )
						if( VIP_VIM <= 0.611592 )
							if( VIM <= 0.82533 )
								if( smoothK_k <= 75.7828 )
									ret := -1.000000 // sell
								if( smoothK_k > 75.7828 )
									ret := -0.631068
							if( VIM > 0.82533 )
								if( VIM <= 0.838983 )
									ret := 0.238095
								if( VIM > 0.838983 )
									ret := -0.791667 // sell
						if( VIP_VIM > 0.611592 )
							if( k <= 79.3647 )
								ret := 0.583333
							if( k > 79.3647 )
								ret := -0.217391
					if( VIP > 1.37066 )
						if( rsi1 <= 73.0065 )
							ret := -0.666667
						if( rsi1 > 73.0065 )
							ret := -0.961538 // sell
			if( VIM > 0.857868 )
				if( d <= 69.4127 )
					if( d_k <= -12.1639 )
						if( rsi1 <= 71.1358 )
							if( VIM <= 0.972853 )
								if( d <= 64.7836 )
									ret := 0.464286
								if( d > 64.7836 )
									ret := -0.416667
							if( VIM > 0.972853 )
								if( smoothK_k <= 77.0072 )
									ret := -0.177419
								if( smoothK_k > 77.0072 )
									ret := -0.750000 // sell
						if( rsi1 > 71.1358 )
							ret := 0.764706 // buy
					if( d_k > -12.1639 )
						if( smoothD_d <= 65.4199 )
							if( VIM <= 1.21131 )
								ret := 0.357143
							if( VIM > 1.21131 )
								ret := 1.000000 // buy
						if( smoothD_d > 65.4199 )
							ret := 0.285714
				if( d > 69.4127 )
					if( VIP <= 1.23253 )
						if( d <= 90.6616 )
							if( k <= 79.1884 )
								if( k <= 79.1278 )
									ret := 0.161616
								if( k > 79.1278 )
									ret := 0.900000 // buy
							if( k > 79.1884 )
								if( VIP <= 0.966349 )
									ret := -0.529412
								if( VIP > 0.966349 )
									ret := -0.066225
						if( d > 90.6616 )
							ret := 0.857143 // buy
					if( VIP > 1.23253 )
						if( rsi1 <= 63.375 )
							if( smoothK_k <= 76.285 )
								if( VIP <= 2.004 )
									ret := -0.923077 // sell
								if( VIP > 2.004 )
									ret := -0.363636
							if( smoothK_k > 76.285 )
								if( d <= 73.3632 )
									ret := 0.636364
								if( d > 73.3632 )
									ret := -0.375000
						if( rsi1 > 63.375 )
							if( smoothD_d <= 81.882 )
								if( rsi1 <= 69.7991 )
									ret := 0.263158
								if( rsi1 > 69.7991 )
									ret := -0.571429
							if( smoothD_d > 81.882 )
								ret := 0.583333
		if( k > 80.1168 )
			if( VIM <= 0.873205 )
				if( VIP_VIM <= 0.859124 )
					if( d_k <= 1.40633 )
						if( rsi1 <= 86.1592 )
							if( smoothD_d <= 88.8113 )
								if( smoothD_d <= 87.0064 )
									ret := -0.144686
								if( smoothD_d > 87.0064 )
									ret := -0.490476
							if( smoothD_d > 88.8113 )
								if( d_k <= 1.35562 )
									ret := -0.063301
								if( d_k > 1.35562 )
									ret := -0.640000
						if( rsi1 > 86.1592 )
							if( VIP <= 1.47889 )
								if( rsi1 <= 90.936 )
									ret := -0.652893
								if( rsi1 > 90.936 )
									ret := -0.062500
							if( VIP > 1.47889 )
								ret := 0.461538
					if( d_k > 1.40633 )
						if( smoothD_d <= 95.5575 )
							if( VIP <= 1.19463 )
								if( k <= 94.205 )
									ret := -0.190476
								if( k > 94.205 )
									ret := -0.603448
							if( VIP > 1.19463 )
								if( smoothK_k <= 85.6082 )
									ret := 0.108298
								if( smoothK_k > 85.6082 )
									ret := -0.103004
						if( smoothD_d > 95.5575 )
							if( k <= 97.5564 )
								if( VIP <= 1.2902 )
									ret := 0.673469
								if( VIP > 1.2902 )
									ret := 0.342857
							if( k > 97.5564 )
								ret := -0.153846
				if( VIP_VIM > 0.859124 )
					if( VIM <= 0.572437 )
						if( smoothD_d <= 90.1292 )
							if( d <= 91.8163 )
								if( d <= 88.5522 )
									ret := 0.558824
								if( d > 88.5522 )
									ret := 0.095238
							if( d > 91.8163 )
								ret := 1.000000 // buy
						if( smoothD_d > 90.1292 )
							if( rsi1 <= 92.4588 )
								if( smoothD_d <= 93.3821 )
									ret := -0.351852
								if( smoothD_d > 93.3821 )
									ret := 0.421053
							if( rsi1 > 92.4588 )
								if( smoothD_d <= 95.89 )
									ret := -0.750000 // sell
								if( smoothD_d > 95.89 )
									ret := -0.032258
					if( VIM > 0.572437 )
						if( smoothK_k <= 94.3172 )
							if( k <= 93.0073 )
								if( VIM <= 0.668118 )
									ret := -0.117647
								if( VIM > 0.668118 )
									ret := -0.809524 // sell
							if( k > 93.0073 )
								if( d_k <= 2.04321 )
									ret := 0.533333
								if( d_k > 2.04321 )
									ret := -0.100000
						if( smoothK_k > 94.3172 )
							if( k <= 99.9917 )
								if( VIM <= 0.680529 )
									ret := -0.775510 // sell
								if( VIM > 0.680529 )
									ret := -0.272727
							if( k > 99.9917 )
								if( d <= 99.9945 )
									ret := -0.068966
								if( d > 99.9945 )
									ret := -0.500000
			if( VIM > 0.873205 )
				if( VIP_VIM <= 0.641036 )
					if( rsi1 <= 48.2933 )
						if( VIP <= 0.961739 )
							if( VIP_VIM <= -0.447685 )
								if( rsi1 <= 29.9963 )
									ret := 0.670886
								if( rsi1 > 29.9963 )
									ret := 0.063063
							if( VIP_VIM > -0.447685 )
								if( k <= 81.1816 )
									ret := -0.481928
								if( k > 81.1816 )
									ret := 0.039009
						if( VIP > 0.961739 )
							if( VIP_VIM <= -0.16761 )
								if( smoothD_d <= 91.9927 )
									ret := 0.099644
								if( smoothD_d > 91.9927 )
									ret := -0.720000 // sell
							if( VIP_VIM > -0.16761 )
								if( k <= 80.5268 )
									ret := -0.333333
								if( k > 80.5268 )
									ret := 0.275026
					if( rsi1 > 48.2933 )
						if( rsi1 <= 50.7073 )
							if( smoothK_k <= 94.7239 )
								if( d_k <= 3.82327 )
									ret := -0.207469
								if( d_k > 3.82327 )
									ret := -0.584416
							if( smoothK_k > 94.7239 )
								if( d_k <= -6.87151 )
									ret := -0.190476
								if( d_k > -6.87151 )
									ret := 0.466667
						if( rsi1 > 50.7073 )
							if( VIM <= 120.39 )
								if( rsi1 <= 54.4429 )
									ret := 0.101004
								if( rsi1 > 54.4429 )
									ret := -0.013705
							if( VIM > 120.39 )
								if( VIP_VIM <= -0.75 )
									ret := -0.800000 // sell
								if( VIP_VIM > -0.75 )
									ret := -0.384615
				if( VIP_VIM > 0.641036 )
					if( rsi1 <= 68.2039 )
						if( smoothD_d <= 67.047 )
							if( smoothD_d <= 63.4539 )
								ret := -0.300000
							if( smoothD_d > 63.4539 )
								ret := -0.900000 // sell
						if( smoothD_d > 67.047 )
							if( VIP_VIM <= 0.793551 )
								if( VIP_VIM <= 0.66151 )
									ret := -0.214286
								if( VIP_VIM > 0.66151 )
									ret := 0.464286
							if( VIP_VIM > 0.793551 )
								if( VIP <= 5.03224 )
									ret := -0.104167
								if( VIP > 5.03224 )
									ret := 0.188034
					if( rsi1 > 68.2039 )
						if( smoothD_d <= 79.9746 )
							if( VIP <= 10.7971 )
								if( smoothD_d <= 68.7506 )
									ret := -0.880952 // sell
								if( smoothD_d > 68.7506 )
									ret := 0.098901
							if( VIP > 10.7971 )
								ret := 0.960000 // buy
						if( smoothD_d > 79.9746 )
							if( d <= 99.1788 )
								if( VIM <= 6.60687 )
									ret := -0.450363
								if( VIM > 6.60687 )
									ret := 0.011905
							if( d > 99.1788 )
								if( d <= 99.5786 )
									ret := -1.000000 // sell
								if( d > 99.5786 )
									ret := -0.637931
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_CRWD_1Min_75b33489(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


