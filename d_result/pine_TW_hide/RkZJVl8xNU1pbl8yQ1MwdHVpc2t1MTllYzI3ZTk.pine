//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: FFIV_15Min_2CS0_19ec27e9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2CS0_19ec27e9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_19ec27e9(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= 134.533 )
		if( ad <= -333.112 )
			if( d_k <= 10.2309 )
				if( rsi1 <= 39.8809 )
					if( ad_mf <= -333057 )
						if( k <= 1.2229 )
							ret := -0.500000
						if( k > 1.2229 )
							ret := -1.000000 // sell
					if( ad_mf > -333057 )
						if( d_k <= 3.75333 )
							if( ad <= -4120.75 )
								if( ad_mf <= -4368 )
									ret := 0.038256
								if( ad_mf > -4368 )
									ret := -0.266055
							if( ad > -4120.75 )
								if( d <= 90.762 )
									ret := 0.129104
								if( d > 90.762 )
									ret := -0.500000
						if( d_k > 3.75333 )
							if( mf <= -0.205632 )
								if( ad <= -26257.9 )
									ret := 0.248227
								if( ad > -26257.9 )
									ret := -0.063158
							if( mf > -0.205632 )
								if( mf <= -0.140438 )
									ret := 0.315789
								if( mf > -0.140438 )
									ret := 0.155158
				if( rsi1 > 39.8809 )
					if( ad <= -364.34 )
						if( d_k <= 2.6167 )
							if( mf <= 0.325514 )
								if( ad_mf <= -606.591 )
									ret := 0.050346
								if( ad_mf > -606.591 )
									ret := -0.164706
							if( mf > 0.325514 )
								if( ad <= -43778.2 )
									ret := -1.000000 // sell
								if( ad > -43778.2 )
									ret := -0.148368
						if( d_k > 2.6167 )
							if( ad_mf <= -5993.03 )
								if( d_k <= 2.62485 )
									ret := -0.857143 // sell
								if( d_k > 2.62485 )
									ret := 0.034110
							if( ad_mf > -5993.03 )
								if( ad <= -2935.94 )
									ret := -0.159710
								if( ad > -2935.94 )
									ret := 0.021552
					if( ad > -364.34 )
						if( k <= 81.4926 )
							if( smoothD_d <= 15.0124 )
								ret := 0.000000
							if( smoothD_d > 15.0124 )
								if( mf <= -0.035392 )
									ret := -0.250000
								if( mf > -0.035392 )
									ret := -0.869565 // sell
						if( k > 81.4926 )
							if( rsi1 <= 49.2276 )
								ret := 0.500000
							if( rsi1 > 49.2276 )
								if( ad_mf <= -361.623 )
									ret := -0.500000
								if( ad_mf > -361.623 )
									ret := 0.000000
			if( d_k > 10.2309 )
				if( ad <= -220454 )
					ret := 1.000000 // buy
				if( ad > -220454 )
					if( rsi1 <= 24.0045 )
						if( d <= 40.6044 )
							if( mf <= -0.040305 )
								if( d_k <= 12.399 )
									ret := 0.047619
								if( d_k > 12.399 )
									ret := 0.640625
							if( mf > -0.040305 )
								if( ad_mf <= -22120.8 )
									ret := 0.600000
								if( ad_mf > -22120.8 )
									ret := 0.016393
						if( d > 40.6044 )
							if( rsi1 <= 21.7951 )
								if( mf <= -0.299444 )
									ret := 0.545455
								if( mf > -0.299444 )
									ret := -0.166667
							if( rsi1 > 21.7951 )
								if( smoothD_d <= 59.3377 )
									ret := 0.071429
								if( smoothD_d > 59.3377 )
									ret := 0.608696
					if( rsi1 > 24.0045 )
						if( ad <= -39314.6 )
							if( smoothD_d <= 56.6354 )
								if( mf <= -0.055887 )
									ret := 0.277778
								if( mf > -0.055887 )
									ret := 0.661765
							if( smoothD_d > 56.6354 )
								if( ad <= -212201 )
									ret := -1.000000 // sell
								if( ad > -212201 )
									ret := 0.084967
						if( ad > -39314.6 )
							if( ad <= -37551.9 )
								if( ad <= -38921.3 )
									ret := -0.250000
								if( ad > -38921.3 )
									ret := -1.000000 // sell
							if( ad > -37551.9 )
								if( ad <= -36726.2 )
									ret := 0.666667
								if( ad > -36726.2 )
									ret := 0.069481
		if( ad > -333.112 )
			if( d_k <= -2.39061 )
				if( smoothD_d <= 45.5021 )
					if( d <= 32.7249 )
						if( d_k <= -6.29067 )
							if( d_k <= -17.8177 )
								if( rsi1 <= 68.9192 )
									ret := -0.161765
								if( rsi1 > 68.9192 )
									ret := 0.857143 // buy
							if( d_k > -17.8177 )
								if( smoothK_k <= 43.5992 )
									ret := 0.219585
								if( smoothK_k > 43.5992 )
									ret := 0.866667 // buy
						if( d_k > -6.29067 )
							if( rsi1 <= 49.823 )
								if( ad_mf <= -0.246411 )
									ret := 0.357143
								if( ad_mf > -0.246411 )
									ret := -0.247619
							if( rsi1 > 49.823 )
								if( smoothK_k <= 8.7414 )
									ret := -1.000000 // sell
								if( smoothK_k > 8.7414 )
									ret := 0.444444
					if( d > 32.7249 )
						if( smoothK_k <= 38.0572 )
							if( d <= 35.2035 )
								ret := -1.000000 // sell
							if( d > 35.2035 )
								if( d_k <= -3.31435 )
									ret := -0.900000 // sell
								if( d_k > -3.31435 )
									ret := -0.200000
						if( smoothK_k > 38.0572 )
							if( mf <= 0.290153 )
								if( ad <= -203.769 )
									ret := 0.333333
								if( ad > -203.769 )
									ret := -0.171429
							if( mf > 0.290153 )
								if( rsi1 <= 47.2728 )
									ret := 0.000000
								if( rsi1 > 47.2728 )
									ret := -0.913043 // sell
				if( smoothD_d > 45.5021 )
					if( rsi1 <= 57.2662 )
						if( d_k <= -8.11413 )
							if( rsi1 <= 38.8044 )
								if( smoothD_d <= 70.7201 )
									ret := -0.027778
								if( smoothD_d > 70.7201 )
									ret := -0.777778 // sell
							if( rsi1 > 38.8044 )
								if( smoothD_d <= 82.6995 )
									ret := 0.310606
								if( smoothD_d > 82.6995 )
									ret := -0.255319
						if( d_k > -8.11413 )
							if( d <= 94.7878 )
								if( rsi1 <= 35.2188 )
									ret := -0.200000
								if( rsi1 > 35.2188 )
									ret := 0.614907
							if( d > 94.7878 )
								ret := -0.142857
					if( rsi1 > 57.2662 )
						if( d_k <= -3.94465 )
							if( d <= 93.484 )
								if( mf <= -0.156918 )
									ret := -0.454545
								if( mf > -0.156918 )
									ret := 0.020484
							if( d > 93.484 )
								if( mf <= 0.205364 )
									ret := 0.708333 // buy
								if( mf > 0.205364 )
									ret := -0.500000
						if( d_k > -3.94465 )
							if( mf <= 0.226554 )
								if( ad <= -263.725 )
									ret := 1.000000 // buy
								if( ad > -263.725 )
									ret := -0.532110
							if( mf > 0.226554 )
								if( smoothK_k <= 72.9209 )
									ret := -0.500000
								if( smoothK_k > 72.9209 )
									ret := 0.647059
			if( d_k > -2.39061 )
				if( k <= 27.7423 )
					if( ad_mf <= 0.064945 )
						if( rsi1 <= 13.6212 )
							if( d_k <= 1.61344 )
								if( ad <= -210.211 )
									ret := -0.750000 // sell
								if( ad > -210.211 )
									ret := 0.500000
							if( d_k > 1.61344 )
								if( d <= 4.5951 )
									ret := -0.750000 // sell
								if( d > 4.5951 )
									ret := -1.000000 // sell
						if( rsi1 > 13.6212 )
							if( k <= 16.4702 )
								if( d <= 14.2431 )
									ret := 0.260700
								if( d > 14.2431 )
									ret := -0.025751
							if( k > 16.4702 )
								if( rsi1 <= 39.947 )
									ret := 0.012987
								if( rsi1 > 39.947 )
									ret := 0.518717
					if( ad_mf > 0.064945 )
						if( rsi1 <= 15.259 )
							if( k <= 1.70137 )
								if( k <= 0.548154 )
									ret := 0.782609 // buy
								if( k > 0.548154 )
									ret := 1.000000 // buy
							if( k > 1.70137 )
								if( smoothD_d <= 0.731981 )
									ret := -0.333333
								if( smoothD_d > 0.731981 )
									ret := 0.500000
						if( rsi1 > 15.259 )
							if( d_k <= 0.054237 )
								if( mf <= -0.1928 )
									ret := 0.818182 // buy
								if( mf > -0.1928 )
									ret := 0.553030
							if( d_k > 0.054237 )
								if( smoothD_d <= 9.44157 )
									ret := 0.000000
								if( smoothD_d > 9.44157 )
									ret := 0.401361
				if( k > 27.7423 )
					if( k <= 56.0443 )
						if( d_k <= 6.11883 )
							if( smoothD_d <= 24.7598 )
								ret := -1.000000 // sell
							if( smoothD_d > 24.7598 )
								if( smoothD_d <= 30.2313 )
									ret := 0.677419
								if( smoothD_d > 30.2313 )
									ret := 0.141762
						if( d_k > 6.11883 )
							if( rsi1 <= 42.9731 )
								if( smoothD_d <= 55.481 )
									ret := -0.219512
								if( smoothD_d > 55.481 )
									ret := 0.352941
							if( rsi1 > 42.9731 )
								if( smoothD_d <= 63.0114 )
									ret := -0.082237
								if( smoothD_d > 63.0114 )
									ret := -0.671053
					if( k > 56.0443 )
						if( d <= 74.6648 )
							if( smoothD_d <= 54.7159 )
								ret := -1.000000 // sell
							if( smoothD_d > 54.7159 )
								if( ad_mf <= -0.028055 )
									ret := 0.313187
								if( ad_mf > -0.028055 )
									ret := 0.584416
						if( d > 74.6648 )
							if( rsi1 <= 91.1655 )
								if( d <= 98.9053 )
									ret := 0.152605
								if( d > 98.9053 )
									ret := 0.459259
							if( rsi1 > 91.1655 )
								if( d_k <= -0.745969 )
									ret := 0.363636
								if( d_k > -0.745969 )
									ret := -0.636364
	if( ad > 134.533 )
		if( smoothK_k <= 6.34468 )
			if( ad_mf <= 608.94 )
				if( ad_mf <= 386.898 )
					if( d_k <= 7.71972 )
						if( ad <= 322.035 )
							if( ad <= 238.652 )
								ret := 0.000000
							if( ad > 238.652 )
								if( smoothD_d <= 3.45638 )
									ret := -0.750000 // sell
								if( smoothD_d > 3.45638 )
									ret := -0.111111
						if( ad > 322.035 )
							if( d <= 6.57058 )
								if( mf <= -0.099722 )
									ret := 0.250000
								if( mf > -0.099722 )
									ret := 0.000000
							if( d > 6.57058 )
								ret := -0.250000
					if( d_k > 7.71972 )
						if( d <= 25.4869 )
							if( rsi1 <= 40.4511 )
								if( d_k <= 9.74236 )
									ret := 0.250000
								if( d_k > 9.74236 )
									ret := 0.000000
							if( rsi1 > 40.4511 )
								ret := 1.000000 // buy
						if( d > 25.4869 )
							ret := -0.250000
				if( ad_mf > 386.898 )
					if( ad <= 401.716 )
						if( d_k <= -0.281829 )
							ret := -1.000000 // sell
						if( d_k > -0.281829 )
							if( smoothK_k <= -0.99881 )
								ret := -0.750000 // sell
							if( smoothK_k > -0.99881 )
								ret := -0.800000 // sell
					if( ad > 401.716 )
						if( ad_mf <= 490.914 )
							if( smoothD_d <= 0.598136 )
								if( smoothD_d <= -1.02752 )
									ret := 0.000000
								if( smoothD_d > -1.02752 )
									ret := -0.750000 // sell
							if( smoothD_d > 0.598136 )
								ret := 0.000000
						if( ad_mf > 490.914 )
							if( rsi1 <= 52.9176 )
								if( mf <= -0.11688 )
									ret := -1.000000 // sell
								if( mf > -0.11688 )
									ret := -0.296296
							if( rsi1 > 52.9176 )
								ret := -1.000000 // sell
			if( ad_mf > 608.94 )
				if( mf <= -0.10903 )
					if( ad_mf <= 1069.65 )
						if( d <= 3.3519 )
							ret := -0.428571
						if( d > 3.3519 )
							if( mf <= -0.210577 )
								if( d_k <= 10.4203 )
									ret := 0.000000
								if( d_k > 10.4203 )
									ret := 0.750000 // buy
							if( mf > -0.210577 )
								if( d_k <= 0.966613 )
									ret := 0.400000
								if( d_k > 0.966613 )
									ret := 0.875000 // buy
					if( ad_mf > 1069.65 )
						if( ad <= 88581.7 )
							if( ad_mf <= 63416.4 )
								if( ad_mf <= 37380.7 )
									ret := 0.021622
								if( ad_mf > 37380.7 )
									ret := 0.545455
							if( ad_mf > 63416.4 )
								if( rsi1 <= 32.3546 )
									ret := -0.500000
								if( rsi1 > 32.3546 )
									ret := -1.000000 // sell
						if( ad > 88581.7 )
							if( ad <= 90236.5 )
								ret := 1.000000 // buy
							if( ad > 90236.5 )
								ret := 0.400000
				if( mf > -0.10903 )
					if( rsi1 <= 49.5366 )
						if( ad <= 9940.39 )
							if( ad_mf <= 9666.91 )
								if( ad <= 2976.46 )
									ret := -0.022869
								if( ad > 2976.46 )
									ret := -0.150943
							if( ad_mf > 9666.91 )
								if( rsi1 <= 31.3203 )
									ret := -0.500000
								if( rsi1 > 31.3203 )
									ret := -0.931034 // sell
						if( ad > 9940.39 )
							if( ad_mf <= 20506.2 )
								if( d_k <= -0.694564 )
									ret := 0.291209
								if( d_k > -0.694564 )
									ret := -0.015873
							if( ad_mf > 20506.2 )
								if( ad_mf <= 24307.5 )
									ret := -0.557692
								if( ad_mf > 24307.5 )
									ret := -0.129534
					if( rsi1 > 49.5366 )
						if( smoothK_k <= 2.0228 )
							if( mf <= -0.022962 )
								if( d <= 7.98847 )
									ret := 0.933333 // buy
								if( d > 7.98847 )
									ret := -0.076923
							if( mf > -0.022962 )
								if( mf <= 0.146847 )
									ret := -0.009709
								if( mf > 0.146847 )
									ret := 0.178744
						if( smoothK_k > 2.0228 )
							if( d_k <= -3.72169 )
								if( smoothD_d <= 0.581747 )
									ret := 0.041667
								if( smoothD_d > 0.581747 )
									ret := 0.600000
							if( d_k > -3.72169 )
								if( ad_mf <= 14303.8 )
									ret := -0.047368
								if( ad_mf > 14303.8 )
									ret := -0.300000
		if( smoothK_k > 6.34468 )
			if( ad_mf <= 225.799 )
				if( smoothD_d <= 91.2515 )
					if( mf <= 0.077021 )
						if( rsi1 <= 78.174 )
							if( ad_mf <= 165.327 )
								if( d_k <= 2.8687 )
									ret := -0.636364
								if( d_k > 2.8687 )
									ret := 0.142857
							if( ad_mf > 165.327 )
								if( ad <= 180.372 )
									ret := 0.571429
								if( ad > 180.372 )
									ret := -0.234043
						if( rsi1 > 78.174 )
							ret := -1.000000 // sell
					if( mf > 0.077021 )
						if( k <= 68.6111 )
							if( d <= 71.6842 )
								if( ad_mf <= 199.796 )
									ret := -0.235294
								if( ad_mf > 199.796 )
									ret := -0.833333 // sell
							if( d > 71.6842 )
								ret := 0.750000 // buy
						if( k > 68.6111 )
							if( k <= 84.0623 )
								if( rsi1 <= 63.6328 )
									ret := -1.000000 // sell
								if( rsi1 > 63.6328 )
									ret := -0.750000 // sell
							if( k > 84.0623 )
								ret := -0.285714
				if( smoothD_d > 91.2515 )
					if( rsi1 <= 77.8885 )
						if( ad <= 200.065 )
							ret := 0.166667
						if( ad > 200.065 )
							if( ad <= 206.629 )
								ret := 0.750000 // buy
							if( ad > 206.629 )
								ret := 1.000000 // buy
					if( rsi1 > 77.8885 )
						ret := -0.428571
			if( ad_mf > 225.799 )
				if( ad <= 90715 )
					if( ad_mf <= 76838.4 )
						if( ad <= 46992.5 )
							if( ad_mf <= 14421.4 )
								if( ad <= 14075.7 )
									ret := 0.033147
								if( ad > 14075.7 )
									ret := -0.211823
							if( ad_mf > 14421.4 )
								if( ad_mf <= 15578.5 )
									ret := 0.224283
								if( ad_mf > 15578.5 )
									ret := 0.062360
						if( ad > 46992.5 )
							if( ad <= 50598.5 )
								if( smoothD_d <= 73.5814 )
									ret := -0.271739
								if( smoothD_d > 73.5814 )
									ret := -0.795918 // sell
							if( ad > 50598.5 )
								if( rsi1 <= 37.8225 )
									ret := -0.545455
								if( rsi1 > 37.8225 )
									ret := 0.005034
					if( ad_mf > 76838.4 )
						if( ad_mf <= 83769.4 )
							if( mf <= -0.124762 )
								if( k <= 57.0541 )
									ret := -0.750000 // sell
								if( k > 57.0541 )
									ret := 0.000000
							if( mf > -0.124762 )
								if( k <= 65.6107 )
									ret := 0.850000 // buy
								if( k > 65.6107 )
									ret := 0.600000
						if( ad_mf > 83769.4 )
							if( ad_mf <= 88007 )
								if( ad_mf <= 85469.7 )
									ret := 0.238095
								if( ad_mf > 85469.7 )
									ret := -0.913043 // sell
							if( ad_mf > 88007 )
								if( rsi1 <= 56.8202 )
									ret := 0.928571 // buy
								if( rsi1 > 56.8202 )
									ret := 0.700000 // buy
				if( ad > 90715 )
					if( ad <= 98311.7 )
						if( d <= 73.5131 )
							if( rsi1 <= 37.513 )
								ret := -0.500000
							if( rsi1 > 37.513 )
								if( ad_mf <= 95790.2 )
									ret := -0.833333 // sell
								if( ad_mf > 95790.2 )
									ret := -1.000000 // sell
						if( d > 73.5131 )
							if( ad_mf <= 97799.5 )
								if( k <= 93.8358 )
									ret := -0.142857
								if( k > 93.8358 )
									ret := 0.250000
							if( ad_mf > 97799.5 )
								ret := -1.000000 // sell
					if( ad > 98311.7 )
						if( rsi1 <= 77.3827 )
							if( mf <= 0.375532 )
								if( d <= 18.428 )
									ret := -0.277778
								if( d > 18.428 )
									ret := 0.251029
							if( mf > 0.375532 )
								if( mf <= 0.506821 )
									ret := -0.642857
								if( mf > 0.506821 )
									ret := 0.000000
						if( rsi1 > 77.3827 )
							if( d_k <= 1.9261 )
								if( d_k <= -0.003545 )
									ret := -0.794872 // sell
								if( d_k > -0.003545 )
									ret := -0.200000
							if( d_k > 1.9261 )
								if( d_k <= 3.13606 )
									ret := 0.750000 // buy
								if( d_k > 3.13606 )
									ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_FFIV_15Min_19ec27e9(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


