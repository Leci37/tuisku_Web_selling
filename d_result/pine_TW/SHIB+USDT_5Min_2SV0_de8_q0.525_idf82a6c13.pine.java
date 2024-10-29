//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: SHIBUSDT_5Min_2SV0_f82a6c13 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_5Min_2SV0_f82a6c13", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_5Min_f82a6c13(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 67.7645 )
		if( rsi1 <= 21.4714 )
			if( d <= 15.0917 )
				if( VIP <= 0.688146 )
					if( rsi1 <= 5.34897 )
						if( d <= 0.868958 )
							if( smoothK_k <= -2.82115 )
								ret := 0.133333
							if( smoothK_k > -2.82115 )
								if( smoothK_k <= -2.31516 )
									ret := -0.800000 // sell
								if( smoothK_k > -2.31516 )
									ret := -1.000000 // sell
						if( d > 0.868958 )
							ret := 0.666667
					if( rsi1 > 5.34897 )
						if( d <= 3.96656 )
							if( rsi1 <= 12.1899 )
								if( d <= 1.43162 )
									ret := 0.345622
								if( d > 1.43162 )
									ret := -0.160494
							if( rsi1 > 12.1899 )
								if( VIP_VIM <= -0.650627 )
									ret := 0.651163
								if( VIP_VIM > -0.650627 )
									ret := 0.334356
						if( d > 3.96656 )
							if( smoothD_d <= 11.2041 )
								if( smoothD_d <= 3.47599 )
									ret := 0.530120
								if( smoothD_d > 3.47599 )
									ret := 0.726562 // buy
							if( smoothD_d > 11.2041 )
								if( smoothD_d <= 11.3706 )
									ret := -0.636364
								if( smoothD_d > 11.3706 )
									ret := 0.321429
				if( VIP > 0.688146 )
					if( smoothD_d <= 2.56909 )
						if( d <= 5.0809 )
							if( smoothD_d <= 1.81479 )
								if( rsi1 <= 8.98039 )
									ret := 0.639344
								if( rsi1 > 8.98039 )
									ret := -0.023140
							if( smoothD_d > 1.81479 )
								if( VIP_VIM <= -0.445584 )
									ret := 0.738095 // buy
								if( VIP_VIM > -0.445584 )
									ret := -0.153846
						if( d > 5.0809 )
							if( k <= 7.52805 )
								if( smoothD_d <= 2.50285 )
									ret := 0.212121
								if( smoothD_d > 2.50285 )
									ret := -0.285714
							if( k > 7.52805 )
								if( smoothK_k <= 7.24057 )
									ret := -1.000000 // sell
								if( smoothK_k > 7.24057 )
									ret := -0.800000 // sell
					if( smoothD_d > 2.56909 )
						if( d <= 6.71304 )
							if( smoothK_k <= 5.22283 )
								if( rsi1 <= 14.6429 )
									ret := 0.930233 // buy
								if( rsi1 > 14.6429 )
									ret := 0.694444
							if( smoothK_k > 5.22283 )
								if( rsi1 <= 20.1933 )
									ret := 0.677419
								if( rsi1 > 20.1933 )
									ret := 0.000000
						if( d > 6.71304 )
							if( k <= 6.9234 )
								if( smoothD_d <= 10.5497 )
									ret := 0.414861
								if( smoothD_d > 10.5497 )
									ret := -0.500000
							if( k > 6.9234 )
								if( rsi1 <= 18.2388 )
									ret := 0.393333
								if( rsi1 > 18.2388 )
									ret := -0.167331
			if( d > 15.0917 )
				if( smoothD_d <= 12.9028 )
					if( d_k <= 4.27509 )
						if( rsi1 <= 16.0368 )
							ret := -1.000000 // sell
						if( rsi1 > 16.0368 )
							if( rsi1 <= 17.6948 )
								ret := 0.000000
							if( rsi1 > 17.6948 )
								if( smoothD_d <= 12.5429 )
									ret := -0.933333 // sell
								if( smoothD_d > 12.5429 )
									ret := -0.769231 // sell
					if( d_k > 4.27509 )
						if( d <= 15.529 )
							ret := -0.250000
						if( d > 15.529 )
							ret := 0.076923
				if( smoothD_d > 12.9028 )
					if( VIM <= 1.27179 )
						if( d_k <= 29.8357 )
							if( rsi1 <= 18.7167 )
								if( VIP_VIM <= -0.540193 )
									ret := 0.700000 // buy
								if( VIP_VIM > -0.540193 )
									ret := 0.118012
							if( rsi1 > 18.7167 )
								if( VIP <= 0.727922 )
									ret := 0.530387
								if( VIP > 0.727922 )
									ret := -0.121951
						if( d_k > 29.8357 )
							ret := -0.769231 // sell
					if( VIM > 1.27179 )
						if( k <= 5.44456 )
							if( d <= 20.7745 )
								ret := -0.461538
							if( d > 20.7745 )
								if( smoothD_d <= 21.1017 )
									ret := 1.000000 // buy
								if( smoothD_d > 21.1017 )
									ret := 0.846154 // buy
						if( k > 5.44456 )
							if( smoothD_d <= 20.6277 )
								if( VIP <= 0.599827 )
									ret := -0.684211
								if( VIP > 0.599827 )
									ret := 0.158537
							if( smoothD_d > 20.6277 )
								if( rsi1 <= 20.632 )
									ret := -0.596774
								if( rsi1 > 20.632 )
									ret := 0.095238
		if( rsi1 > 21.4714 )
			if( VIM <= 1.10273 )
				if( smoothD_d <= 13.0158 )
					if( VIM <= 0.934214 )
						if( d_k <= -15.1981 )
							if( rsi1 <= 62.9122 )
								ret := 0.000000
							if( rsi1 > 62.9122 )
								if( d_k <= -18.4818 )
									ret := -0.800000 // sell
								if( d_k > -18.4818 )
									ret := -1.000000 // sell
						if( d_k > -15.1981 )
							if( k <= 26.7712 )
								if( smoothK_k <= 10.8997 )
									ret := -0.163161
								if( smoothK_k > 10.8997 )
									ret := -0.320542
							if( k > 26.7712 )
								if( VIP_VIM <= 0.153388 )
									ret := 0.500000
								if( VIP_VIM > 0.153388 )
									ret := 0.827586 // buy
					if( VIM > 0.934214 )
						if( rsi1 <= 58.5642 )
							if( k <= 5.19914 )
								if( d_k <= -1.32106 )
									ret := -0.272189
								if( d_k > -1.32106 )
									ret := 0.041905
							if( k > 5.19914 )
								if( VIP <= 0.913021 )
									ret := -0.175258
								if( VIP > 0.913021 )
									ret := -0.019842
						if( rsi1 > 58.5642 )
							if( smoothD_d <= 1.67775 )
								if( smoothD_d <= 0.962645 )
									ret := -0.071429
								if( smoothD_d > 0.962645 )
									ret := 0.352941
							if( smoothD_d > 1.67775 )
								if( rsi1 <= 59.7404 )
									ret := -0.603306
								if( rsi1 > 59.7404 )
									ret := -0.160494
				if( smoothD_d > 13.0158 )
					if( VIM <= 0.949528 )
						if( smoothK_k <= 53.6523 )
							if( smoothD_d <= 70.2286 )
								if( rsi1 <= 52.9989 )
									ret := 0.236607
								if( rsi1 > 52.9989 )
									ret := 0.063301
							if( smoothD_d > 70.2286 )
								if( d_k <= 26.6149 )
									ret := 0.632124
								if( d_k > 26.6149 )
									ret := -0.550000
						if( smoothK_k > 53.6523 )
							if( d <= 64.2368 )
								if( d_k <= -2.55258 )
									ret := -0.069908
								if( d_k > -2.55258 )
									ret := -0.330404
							if( d > 64.2368 )
								if( smoothD_d <= 61.7898 )
									ret := 0.417910
								if( smoothD_d > 61.7898 )
									ret := 0.015851
					if( VIM > 0.949528 )
						if( smoothK_k <= 1.64761 )
							if( rsi1 <= 38.5782 )
								if( d_k <= 20.6448 )
									ret := -0.049180
								if( d_k > 20.6448 )
									ret := -0.500000
							if( rsi1 > 38.5782 )
								if( d_k <= 19.1635 )
									ret := 0.143939
								if( d_k > 19.1635 )
									ret := 0.440816
						if( smoothK_k > 1.64761 )
							if( VIP <= 0.889057 )
								if( smoothD_d <= 93.0968 )
									ret := 0.070815
								if( smoothD_d > 93.0968 )
									ret := 0.880000 // buy
							if( VIP > 0.889057 )
								if( k <= 78.2478 )
									ret := -0.031629
								if( k > 78.2478 )
									ret := 0.020154
			if( VIM > 1.10273 )
				if( smoothD_d <= 89.6037 )
					if( VIP <= 0.791063 )
						if( smoothK_k <= -1.1698 )
							if( rsi1 <= 22.4297 )
								if( VIP <= 0.774953 )
									ret := -0.094017
								if( VIP > 0.774953 )
									ret := -0.764706 // sell
							if( rsi1 > 22.4297 )
								if( VIP_VIM <= -0.440709 )
									ret := 0.328877
								if( VIP_VIM > -0.440709 )
									ret := 0.150358
						if( smoothK_k > -1.1698 )
							if( d_k <= 13.6291 )
								if( smoothD_d <= 74.9323 )
									ret := 0.040348
								if( smoothD_d > 74.9323 )
									ret := -0.322430
							if( d_k > 13.6291 )
								if( d_k <= 32.4846 )
									ret := 0.328221
								if( d_k > 32.4846 )
									ret := -0.733333 // sell
					if( VIP > 0.791063 )
						if( VIP <= 0.837789 )
							if( d_k <= -18.3732 )
								if( smoothD_d <= 55.5389 )
									ret := -0.207101
								if( smoothD_d > 55.5389 )
									ret := -0.755556 // sell
							if( d_k > -18.3732 )
								if( d <= 8.66727 )
									ret := -0.093596
								if( d > 8.66727 )
									ret := 0.035108
						if( VIP > 0.837789 )
							if( VIP <= 0.983816 )
								if( d_k <= 28.1488 )
									ret := 0.034661
								if( d_k > 28.1488 )
									ret := -0.286624
							if( VIP > 0.983816 )
								if( VIM <= 1.16985 )
									ret := -0.271429
								if( VIM > 1.16985 )
									ret := 0.179104
				if( smoothD_d > 89.6037 )
					if( VIP <= 0.942385 )
						if( k <= 87.7702 )
							ret := -0.692308
						if( k > 87.7702 )
							if( VIM <= 1.11731 )
								if( VIP_VIM <= -0.181464 )
									ret := 0.065041
								if( VIP_VIM > -0.181464 )
									ret := 0.863636 // buy
							if( VIM > 1.11731 )
								if( d_k <= -1.56605 )
									ret := 0.036697
								if( d_k > -1.56605 )
									ret := 0.691542
					if( VIP > 0.942385 )
						if( VIP <= 0.997769 )
							if( VIP_VIM <= -0.163812 )
								ret := -0.833333 // sell
							if( VIP_VIM > -0.163812 )
								ret := -0.307692
						if( VIP > 0.997769 )
							ret := 0.050000
	if( rsi1 > 67.7645 )
		if( rsi1 <= 81.1656 )
			if( VIP <= 1.38352 )
				if( smoothK_k <= 32.5981 )
					if( smoothK_k <= 20.5336 )
						if( VIP_VIM <= 0.474642 )
							if( d <= 6.73119 )
								if( d_k <= -0.914949 )
									ret := 0.750000 // buy
								if( d_k > -0.914949 )
									ret := 0.857143 // buy
							if( d > 6.73119 )
								if( d_k <= 15.868 )
									ret := -0.334545
								if( d_k > 15.868 )
									ret := 0.166667
						if( VIP_VIM > 0.474642 )
							if( d_k <= 18.1322 )
								if( rsi1 <= 76.1825 )
									ret := 0.842697 // buy
								if( rsi1 > 76.1825 )
									ret := -0.142857
							if( d_k > 18.1322 )
								ret := -0.400000
					if( smoothK_k > 20.5336 )
						if( rsi1 <= 68.7087 )
							if( VIM <= 0.787765 )
								if( rsi1 <= 68.1291 )
									ret := 1.000000 // buy
								if( rsi1 > 68.1291 )
									ret := 0.166667
							if( VIM > 0.787765 )
								if( VIP <= 1.11852 )
									ret := 0.764706 // buy
								if( VIP > 1.11852 )
									ret := -0.428571
						if( rsi1 > 68.7087 )
							if( k <= 29.8478 )
								if( VIM <= 0.769148 )
									ret := -0.634921
								if( VIM > 0.769148 )
									ret := -0.825688 // sell
							if( k > 29.8478 )
								if( d_k <= -4.57622 )
									ret := 0.087719
								if( d_k > -4.57622 )
									ret := -0.524138
				if( smoothK_k > 32.5981 )
					if( k <= 72.9224 )
						if( VIM <= 0.680756 )
							if( d_k <= -12.4509 )
								if( d_k <= -18.902 )
									ret := -1.000000 // sell
								if( d_k > -18.902 )
									ret := -0.764706 // sell
							if( d_k > -12.4509 )
								if( k <= 49.9619 )
									ret := -0.774194 // sell
								if( k > 49.9619 )
									ret := 0.033333
						if( VIM > 0.680756 )
							if( smoothK_k <= 68.8393 )
								if( VIP <= 1.3254 )
									ret := -0.016017
								if( VIP > 1.3254 )
									ret := 0.850000 // buy
							if( smoothK_k > 68.8393 )
								if( smoothD_d <= 74.1708 )
									ret := 0.571429
								if( smoothD_d > 74.1708 )
									ret := -0.166667
					if( k > 72.9224 )
						if( d_k <= 8.48058 )
							if( smoothK_k <= 73.8096 )
								if( VIP_VIM <= 0.421412 )
									ret := -0.232432
								if( VIP_VIM > 0.421412 )
									ret := -0.519878
							if( smoothK_k > 73.8096 )
								if( smoothK_k <= 75.8486 )
									ret := 0.157044
								if( smoothK_k > 75.8486 )
									ret := -0.098878
						if( d_k > 8.48058 )
							if( d_k <= 9.78903 )
								if( rsi1 <= 69.8909 )
									ret := 0.068966
								if( rsi1 > 69.8909 )
									ret := 0.556452
							if( d_k > 9.78903 )
								if( k <= 84.7385 )
									ret := 0.136986
								if( k > 84.7385 )
									ret := -1.000000 // sell
			if( VIP > 1.38352 )
				if( d_k <= -2.14214 )
					ret := -0.214286
				if( d_k > -2.14214 )
					if( smoothK_k <= 89.2609 )
						ret := -1.000000 // sell
					if( smoothK_k > 89.2609 )
						if( smoothD_d <= 95.1345 )
							if( VIP <= 1.40789 )
								ret := -1.000000 // sell
							if( VIP > 1.40789 )
								ret := -0.300000
						if( smoothD_d > 95.1345 )
							ret := -0.250000
		if( rsi1 > 81.1656 )
			if( VIM <= 0.68027 )
				if( smoothK_k <= 94.8732 )
					if( VIP_VIM <= 0.637671 )
						if( d_k <= -0.351214 )
							if( smoothK_k <= 90.5379 )
								if( d <= 79.1631 )
									ret := -0.716418 // sell
								if( d > 79.1631 )
									ret := 0.000000
							if( smoothK_k > 90.5379 )
								if( VIP <= 1.27637 )
									ret := -0.958333 // sell
								if( VIP > 1.27637 )
									ret := -0.777778 // sell
						if( d_k > -0.351214 )
							if( k <= 80.1215 )
								if( VIM <= 0.654537 )
									ret := 0.733333 // buy
								if( VIM > 0.654537 )
									ret := -0.647059
							if( k > 80.1215 )
								if( smoothK_k <= 85.3542 )
									ret := -0.937500 // sell
								if( smoothK_k > 85.3542 )
									ret := -0.184211
					if( VIP_VIM > 0.637671 )
						if( VIP_VIM <= 0.832474 )
							if( d <= 98.4926 )
								if( VIM <= 0.635253 )
									ret := -0.142857
								if( VIM > 0.635253 )
									ret := 0.227723
							if( d > 98.4926 )
								if( k <= 97.534 )
									ret := -0.836735 // sell
								if( k > 97.534 )
									ret := 1.000000 // buy
						if( VIP_VIM > 0.832474 )
							if( VIP <= 1.39317 )
								if( d_k <= -1.44578 )
									ret := -0.523810
								if( d_k > -1.44578 )
									ret := 0.384615
							if( VIP > 1.39317 )
								if( d_k <= -0.107346 )
									ret := -0.882353 // sell
								if( d_k > -0.107346 )
									ret := -0.714286 // sell
				if( smoothK_k > 94.8732 )
					if( VIP <= 1.32784 )
						if( rsi1 <= 85.1688 )
							if( smoothD_d <= 88.8193 )
								if( smoothK_k <= 96.1127 )
									ret := -0.964286 // sell
								if( smoothK_k > 96.1127 )
									ret := 0.136364
							if( smoothD_d > 88.8193 )
								if( rsi1 <= 81.8374 )
									ret := -0.600000
								if( rsi1 > 81.8374 )
									ret := -0.897727 // sell
						if( rsi1 > 85.1688 )
							if( d_k <= -4.34086 )
								if( d <= 92.3506 )
									ret := -0.875000 // sell
								if( d > 92.3506 )
									ret := 0.774194 // buy
							if( d_k > -4.34086 )
								if( d_k <= -3.5673 )
									ret := -0.884615 // sell
								if( d_k > -3.5673 )
									ret := -0.393443
					if( VIP > 1.32784 )
						if( VIM <= 0.464872 )
							if( VIP <= 1.42705 )
								ret := -1.000000 // sell
							if( VIP > 1.42705 )
								ret := -0.875000 // sell
						if( VIM > 0.464872 )
							if( rsi1 <= 84.7491 )
								if( VIM <= 0.653012 )
									ret := -0.857143 // sell
								if( VIM > 0.653012 )
									ret := 0.280000
							if( rsi1 > 84.7491 )
								if( rsi1 <= 86.6969 )
									ret := 0.464286
								if( rsi1 > 86.6969 )
									ret := -0.306773
			if( VIM > 0.68027 )
				if( VIP_VIM <= 0.601498 )
					if( smoothK_k <= 87.1829 )
						if( smoothK_k <= 85.482 )
							if( smoothD_d <= 81.0943 )
								if( rsi1 <= 83.1525 )
									ret := -0.131148
								if( rsi1 > 83.1525 )
									ret := 0.350000
							if( smoothD_d > 81.0943 )
								if( VIP_VIM <= 0.5052 )
									ret := 0.360000
								if( VIP_VIM > 0.5052 )
									ret := -0.627119
						if( smoothK_k > 85.482 )
							if( VIM <= 0.722355 )
								ret := 0.083333
							if( VIM > 0.722355 )
								if( k <= 88.688 )
									ret := 0.923077 // buy
								if( k > 88.688 )
									ret := 0.413793
					if( smoothK_k > 87.1829 )
						if( rsi1 <= 86.4515 )
							if( VIM <= 0.696438 )
								if( d <= 96.8035 )
									ret := -0.823529 // sell
								if( d > 96.8035 )
									ret := -0.150000
							if( VIM > 0.696438 )
								if( smoothK_k <= 88.4426 )
									ret := -0.758621 // sell
								if( smoothK_k > 88.4426 )
									ret := -0.188782
						if( rsi1 > 86.4515 )
							if( k <= 93.1152 )
								if( k <= 91.5698 )
									ret := -0.166667
								if( k > 91.5698 )
									ret := -0.838710 // sell
							if( k > 93.1152 )
								if( VIM <= 0.735088 )
									ret := 0.019608
								if( VIM > 0.735088 )
									ret := 0.250000
				if( VIP_VIM > 0.601498 )
					if( smoothK_k <= 94.0915 )
						if( d <= 95.827 )
							if( smoothK_k <= 90.3267 )
								if( rsi1 <= 82.8029 )
									ret := -0.500000
								if( rsi1 > 82.8029 )
									ret := 0.460000
							if( smoothK_k > 90.3267 )
								ret := -0.454545
						if( d > 95.827 )
							if( rsi1 <= 86.2261 )
								ret := 0.333333
							if( rsi1 > 86.2261 )
								ret := 0.909091 // buy
					if( smoothK_k > 94.0915 )
						if( d <= 95.9778 )
							ret := -0.850000 // sell
						if( d > 95.9778 )
							if( VIP_VIM <= 0.616996 )
								if( d <= 99.1793 )
									ret := 0.882353 // buy
								if( d > 99.1793 )
									ret := -0.153846
							if( VIP_VIM > 0.616996 )
								if( VIM <= 0.682361 )
									ret := 0.333333
								if( VIM > 0.682361 )
									ret := -0.421053
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_SHIBUSDT_5Min_f82a6c13(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


