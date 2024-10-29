//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MSFT_30Min_2ST0_2bd891df Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2ST0_2bd891df", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_2bd891df(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 38.1572 )
		if( ema12 <= -0.287834 )
			if( d_k <= 2.54845 )
				if( ema2 <= 106.554 )
					if( rsi1 <= 30.9285 )
						if( ema13 <= -0.53846 )
							if( tema <= 98.6187 )
								if( ema3 <= 90.3199 )
									ret := 0.494624
								if( ema3 > 90.3199 )
									ret := 0.082873
							if( tema > 98.6187 )
								if( ema1 <= 104.299 )
									ret := 0.813008 // buy
								if( ema1 > 104.299 )
									ret := 0.560000
						if( ema13 > -0.53846 )
							if( rsi1 <= 21.3265 )
								if( rsi1 <= 16.2916 )
									ret := 0.545455
								if( rsi1 > 16.2916 )
									ret := 0.125000
							if( rsi1 > 21.3265 )
								if( k <= 18.9612 )
									ret := -0.558140
								if( k > 18.9612 )
									ret := 0.833333 // buy
					if( rsi1 > 30.9285 )
						if( d_k <= -7.38093 )
							if( ema1 <= 75.7808 )
								if( ema13 <= -0.774545 )
									ret := -1.000000 // sell
								if( ema13 > -0.774545 )
									ret := -0.200000
							if( ema1 > 75.7808 )
								if( ema12 <= -0.666268 )
									ret := -0.500000
								if( ema12 > -0.666268 )
									ret := 0.476923
						if( d_k > -7.38093 )
							if( smoothD_d <= 9.05461 )
								if( ema2 <= 52.1395 )
									ret := -0.833333 // sell
								if( ema2 > 52.1395 )
									ret := 0.175439
							if( smoothD_d > 9.05461 )
								if( tema <= 105.372 )
									ret := -0.701493 // sell
								if( tema > 105.372 )
									ret := 0.500000
				if( ema2 > 106.554 )
					if( ema1 <= 109.395 )
						if( smoothK_k <= 24.0548 )
							if( tema <= 107.63 )
								if( smoothD_d <= 3.45457 )
									ret := 0.074074
								if( smoothD_d > 3.45457 )
									ret := -0.714286 // sell
							if( tema > 107.63 )
								if( smoothK_k <= 0.150392 )
									ret := -0.666667
								if( smoothK_k > 0.150392 )
									ret := -1.000000 // sell
						if( smoothK_k > 24.0548 )
							if( rsi1 <= 35.2692 )
								if( ema3 <= 110.479 )
									ret := 0.400000
								if( ema3 > 110.479 )
									ret := -1.000000 // sell
							if( rsi1 > 35.2692 )
								if( ema3 <= 107.893 )
									ret := 0.000000
								if( ema3 > 107.893 )
									ret := -1.000000 // sell
					if( ema1 > 109.395 )
						if( d <= 88.6793 )
							if( tema <= 202.197 )
								if( ema13 <= -1.47644 )
									ret := 0.354597
								if( ema13 > -1.47644 )
									ret := 0.079130
							if( tema > 202.197 )
								if( smoothK_k <= 86.782 )
									ret := 0.062972
								if( smoothK_k > 86.782 )
									ret := -0.402597
						if( d > 88.6793 )
							if( ema2 <= 279.379 )
								if( ema3 <= 258.88 )
									ret := 0.518987
								if( ema3 > 258.88 )
									ret := 0.937500 // buy
							if( ema2 > 279.379 )
								if( rsi1 <= 32.0543 )
									ret := -0.500000
								if( rsi1 > 32.0543 )
									ret := 0.225806
			if( d_k > 2.54845 )
				if( tema <= 306.208 )
					if( ema3 <= 243.038 )
						if( ema13 <= -2.77819 )
							if( rsi1 <= 34.6008 )
								if( tema <= 217.039 )
									ret := 0.877358 // buy
								if( tema > 217.039 )
									ret := 0.363636
							if( rsi1 > 34.6008 )
								ret := 0.000000
						if( ema13 > -2.77819 )
							if( tema <= 133.985 )
								if( rsi1 <= 22.2256 )
									ret := 0.513333
								if( rsi1 > 22.2256 )
									ret := 0.072165
							if( tema > 133.985 )
								if( tema <= 154.026 )
									ret := 0.573529
								if( tema > 154.026 )
									ret := 0.316602
					if( ema3 > 243.038 )
						if( k <= 0.155495 )
							if( d_k <= 24.6982 )
								if( ema13 <= -1.91313 )
									ret := -0.576923
								if( ema13 > -1.91313 )
									ret := -0.023810
							if( d_k > 24.6982 )
								ret := -1.000000 // sell
						if( k > 0.155495 )
							if( ema3 <= 251.463 )
								if( k <= 15.7622 )
									ret := -0.402597
								if( k > 15.7622 )
									ret := 0.266667
							if( ema3 > 251.463 )
								if( ema13 <= -0.815491 )
									ret := 0.350296
								if( ema13 > -0.815491 )
									ret := 0.056034
				if( tema > 306.208 )
					if( ema2 <= 459.931 )
						if( ema12 <= -3.2258 )
							if( ema2 <= 403.417 )
								ret := 0.500000
							if( ema2 > 403.417 )
								ret := 1.000000 // buy
						if( ema12 > -3.2258 )
							if( rsi1 <= 27.8485 )
								if( ema13 <= -3.63682 )
									ret := 0.459459
								if( ema13 > -3.63682 )
									ret := -0.144670
							if( rsi1 > 27.8485 )
								if( ema1 <= 368.541 )
									ret := 0.006116
								if( ema1 > 368.541 )
									ret := 0.262712
					if( ema2 > 459.931 )
						ret := -1.000000 // sell
		if( ema12 > -0.287834 )
			if( smoothK_k <= 72.0177 )
				if( rsi1 <= 28.1911 )
					if( ema13 <= -0.346959 )
						if( ema1 <= 70.2835 )
							if( ema3 <= 68.8547 )
								if( d_k <= -1.31124 )
									ret := -0.341463
								if( d_k > -1.31124 )
									ret := 0.123077
							if( ema3 > 68.8547 )
								if( ema13 <= -0.481332 )
									ret := 0.000000
								if( ema13 > -0.481332 )
									ret := -0.806452 // sell
						if( ema1 > 70.2835 )
							if( ema13 <= -0.378934 )
								if( d_k <= 6.79229 )
									ret := 0.311224
								if( d_k > 6.79229 )
									ret := -0.079365
							if( ema13 > -0.378934 )
								if( ema1 <= 111.837 )
									ret := -0.400000
								if( ema1 > 111.837 )
									ret := 0.066667
					if( ema13 > -0.346959 )
						if( tema <= 288.897 )
							if( smoothD_d <= 17.2493 )
								if( ema3 <= 181.718 )
									ret := 0.130769
								if( ema3 > 181.718 )
									ret := 0.500000
							if( smoothD_d > 17.2493 )
								if( ema3 <= 57.4222 )
									ret := 0.702381 // buy
								if( ema3 > 57.4222 )
									ret := 0.273292
						if( tema > 288.897 )
							if( d_k <= 0.365625 )
								if( d_k <= -0.861301 )
									ret := -0.200000
								if( d_k > -0.861301 )
									ret := -0.875000 // sell
							if( d_k > 0.365625 )
								if( k <= 0.679654 )
									ret := -0.333333
								if( k > 0.679654 )
									ret := 0.066667
				if( rsi1 > 28.1911 )
					if( ema2 <= 54.6082 )
						if( ema3 <= 50.5824 )
							if( smoothD_d <= 8.08528 )
								if( d <= 4.09911 )
									ret := 0.500000
								if( d > 4.09911 )
									ret := -0.636364
							if( smoothD_d > 8.08528 )
								if( ema13 <= -0.218073 )
									ret := 0.100000
								if( ema13 > -0.218073 )
									ret := 0.640000
						if( ema3 > 50.5824 )
							if( ema12 <= -0.078031 )
								if( ema12 <= -0.177325 )
									ret := -0.460177
								if( ema12 > -0.177325 )
									ret := 0.064516
							if( ema12 > -0.078031 )
								if( d <= 28.0158 )
									ret := -0.633333
								if( d > 28.0158 )
									ret := -0.096774
					if( ema2 > 54.6082 )
						if( ema1 <= 56.2978 )
							if( rsi1 <= 37.4285 )
								if( d_k <= 5.84316 )
									ret := 0.523256
								if( d_k > 5.84316 )
									ret := -0.050000
							if( rsi1 > 37.4285 )
								if( ema3 <= 55.8202 )
									ret := -0.600000
								if( ema3 > 55.8202 )
									ret := 0.250000
						if( ema1 > 56.2978 )
							if( smoothK_k <= 45.1638 )
								if( ema1 <= 136.884 )
									ret := 0.053535
								if( ema1 > 136.884 )
									ret := -0.043129
							if( smoothK_k > 45.1638 )
								if( tema <= 95.0493 )
									ret := 0.011976
								if( tema > 95.0493 )
									ret := 0.250814
			if( smoothK_k > 72.0177 )
				if( ema12 <= -0.130549 )
					if( tema <= 83.3756 )
						if( rsi1 <= 34.8661 )
							if( ema13 <= -0.428259 )
								if( rsi1 <= 26.305 )
									ret := -0.500000
								if( rsi1 > 26.305 )
									ret := -0.941176 // sell
							if( ema13 > -0.428259 )
								if( smoothK_k <= 77.068 )
									ret := -0.200000
								if( smoothK_k > 77.068 )
									ret := -0.647059
						if( rsi1 > 34.8661 )
							if( smoothK_k <= 81.4818 )
								if( ema13 <= -0.384608 )
									ret := -1.000000 // sell
								if( ema13 > -0.384608 )
									ret := -0.250000
							if( smoothK_k > 81.4818 )
								if( ema3 <= 60.7657 )
									ret := 0.750000 // buy
								if( ema3 > 60.7657 )
									ret := 0.000000
					if( tema > 83.3756 )
						if( ema1 <= 103.239 )
							if( d <= 73.491 )
								ret := 0.000000
							if( d > 73.491 )
								if( ema12 <= -0.191122 )
									ret := 1.000000 // buy
								if( ema12 > -0.191122 )
									ret := 0.500000
						if( ema1 > 103.239 )
							if( ema13 <= -0.6814 )
								if( d_k <= 2.06115 )
									ret := -0.066667
								if( d_k > 2.06115 )
									ret := 0.600000
							if( ema13 > -0.6814 )
								if( ema2 <= 210.765 )
									ret := -0.500000
								if( ema2 > 210.765 )
									ret := -0.090909
				if( ema12 > -0.130549 )
					if( rsi1 <= 36.1921 )
						if( rsi1 <= 35.8041 )
							if( d_k <= 1.1335 )
								ret := 0.000000
							if( d_k > 1.1335 )
								if( d <= 89.9201 )
									ret := 0.625000
								if( d > 89.9201 )
									ret := -0.166667
						if( rsi1 > 35.8041 )
							ret := 0.714286 // buy
					if( rsi1 > 36.1921 )
						if( rsi1 <= 37.9974 )
							if( d_k <= -13.5272 )
								ret := 0.000000
							if( d_k > -13.5272 )
								if( smoothD_d <= 84.2791 )
									ret := -0.857143 // sell
								if( smoothD_d > 84.2791 )
									ret := -0.166667
						if( rsi1 > 37.9974 )
							ret := 0.142857
	if( rsi1 > 38.1572 )
		if( ema12 <= 1.14659 )
			if( ema3 <= 49.8326 )
				if( ema13 <= -0.34189 )
					ret := -0.428571
				if( ema13 > -0.34189 )
					if( smoothK_k <= 86.2943 )
						if( k <= 45.2557 )
							if( rsi1 <= 54.8301 )
								if( smoothK_k <= 13.6171 )
									ret := 0.846154 // buy
								if( smoothK_k > 13.6171 )
									ret := 0.000000
							if( rsi1 > 54.8301 )
								if( ema13 <= 0.243126 )
									ret := -0.090909
								if( ema13 > 0.243126 )
									ret := -0.800000 // sell
						if( k > 45.2557 )
							if( ema13 <= 0.333152 )
								if( ema3 <= 49.1586 )
									ret := 0.600000
								if( ema3 > 49.1586 )
									ret := 0.917808 // buy
							if( ema13 > 0.333152 )
								if( ema12 <= 0.185933 )
									ret := -0.500000
								if( ema12 > 0.185933 )
									ret := 0.400000
					if( smoothK_k > 86.2943 )
						if( rsi1 <= 59.0688 )
							if( d_k <= -1.29533 )
								ret := 0.000000
							if( d_k > -1.29533 )
								if( tema <= 49.879 )
									ret := 1.000000 // buy
								if( tema > 49.879 )
									ret := 0.750000 // buy
						if( rsi1 > 59.0688 )
							if( ema3 <= 49.634 )
								if( d <= 95.0735 )
									ret := 0.000000
								if( d > 95.0735 )
									ret := -0.500000
							if( ema3 > 49.634 )
								if( k <= 95.0304 )
									ret := 0.000000
								if( k > 95.0304 )
									ret := 0.500000
			if( ema3 > 49.8326 )
				if( ema12 <= 0.572505 )
					if( tema <= 407.046 )
						if( ema2 <= 379.577 )
							if( ema13 <= -1.44952 )
								if( d_k <= -6.85013 )
									ret := 0.030075
								if( d_k > -6.85013 )
									ret := -0.264484
							if( ema13 > -1.44952 )
								if( ema3 <= 258.061 )
									ret := 0.037478
								if( ema3 > 258.061 )
									ret := -0.008279
						if( ema2 > 379.577 )
							if( ema1 <= 400.335 )
								if( smoothD_d <= 75.2654 )
									ret := 0.340164
								if( smoothD_d > 75.2654 )
									ret := 0.784810 // buy
							if( ema1 > 400.335 )
								if( k <= 92.08 )
									ret := 0.231818
								if( k > 92.08 )
									ret := -0.175676
					if( tema > 407.046 )
						if( ema3 <= 436.453 )
							if( smoothD_d <= 63.1084 )
								if( ema12 <= 0.295464 )
									ret := -0.107507
								if( ema12 > 0.295464 )
									ret := 0.172297
							if( smoothD_d > 63.1084 )
								if( ema12 <= -0.122606 )
									ret := 0.018182
								if( ema12 > -0.122606 )
									ret := -0.305916
						if( ema3 > 436.453 )
							if( ema1 <= 447.318 )
								if( rsi1 <= 49.8726 )
									ret := 0.555556
								if( rsi1 > 49.8726 )
									ret := 0.071429
							if( ema1 > 447.318 )
								if( d <= 10.0678 )
									ret := -0.625000
								if( d > 10.0678 )
									ret := 0.000000
				if( ema12 > 0.572505 )
					if( d <= 5.90503 )
						if( tema <= 339.97 )
							if( ema3 <= 156.742 )
								ret := -0.500000
							if( ema3 > 156.742 )
								if( ema12 <= 0.776457 )
									ret := 0.575758
								if( ema12 > 0.776457 )
									ret := 0.921053 // buy
						if( tema > 339.97 )
							if( ema1 <= 431.868 )
								if( rsi1 <= 59.473 )
									ret := -0.250000
								if( rsi1 > 59.473 )
									ret := 0.000000
							if( ema1 > 431.868 )
								ret := 0.600000
					if( d > 5.90503 )
						if( ema3 <= 95.4936 )
							if( rsi1 <= 86.576 )
								if( ema1 <= 56.8387 )
									ret := -0.875000 // sell
								if( ema1 > 56.8387 )
									ret := 0.629630
							if( rsi1 > 86.576 )
								if( ema1 <= 89.5456 )
									ret := -0.733333 // sell
								if( ema1 > 89.5456 )
									ret := 0.000000
						if( ema3 > 95.4936 )
							if( tema <= 127.839 )
								if( rsi1 <= 82.6623 )
									ret := -0.112903
								if( rsi1 > 82.6623 )
									ret := -0.711111 // sell
							if( tema > 127.839 )
								if( ema12 <= 0.981305 )
									ret := 0.128097
								if( ema12 > 0.981305 )
									ret := -0.019709
		if( ema12 > 1.14659 )
			if( d_k <= -1.81859 )
				if( tema <= 161.735 )
					if( ema12 <= 1.7957 )
						if( d_k <= -19.2575 )
							if( ema12 <= 1.47223 )
								ret := -1.000000 // sell
							if( ema12 > 1.47223 )
								ret := -0.750000 // sell
						if( d_k > -19.2575 )
							if( ema3 <= 152.921 )
								if( ema2 <= 142.166 )
									ret := -0.705882 // sell
								if( ema2 > 142.166 )
									ret := 0.440000
							if( ema3 > 152.921 )
								ret := -1.000000 // sell
					if( ema12 > 1.7957 )
						if( d_k <= -23.0976 )
							ret := -0.750000 // sell
						if( d_k > -23.0976 )
							ret := -1.000000 // sell
				if( tema > 161.735 )
					if( smoothD_d <= 33.7169 )
						if( k <= 19.9746 )
							ret := 0.142857
						if( k > 19.9746 )
							if( smoothK_k <= 21.375 )
								ret := -1.000000 // sell
							if( smoothK_k > 21.375 )
								if( smoothK_k <= 43.2276 )
									ret := -0.586207
								if( smoothK_k > 43.2276 )
									ret := -1.000000 // sell
					if( smoothD_d > 33.7169 )
						if( tema <= 199.41 )
							if( d <= 71.404 )
								ret := -0.500000
							if( d > 71.404 )
								if( ema13 <= 3.04726 )
									ret := 0.655172
								if( ema13 > 3.04726 )
									ret := -0.250000
						if( tema > 199.41 )
							if( ema1 <= 209.153 )
								if( smoothK_k <= 93.039 )
									ret := -1.000000 // sell
								if( smoothK_k > 93.039 )
									ret := 0.000000
							if( ema1 > 209.153 )
								if( rsi1 <= 56.8763 )
									ret := 0.625000
								if( rsi1 > 56.8763 )
									ret := -0.212366
			if( d_k > -1.81859 )
				if( tema <= 145.747 )
					if( rsi1 <= 77.2908 )
						if( ema3 <= 141.541 )
							ret := 1.000000 // buy
						if( ema3 > 141.541 )
							ret := 0.750000 // buy
					if( rsi1 > 77.2908 )
						if( ema13 <= 2.15855 )
							ret := 0.833333 // buy
						if( ema13 > 2.15855 )
							if( smoothK_k <= 92.5482 )
								ret := -0.333333
							if( smoothK_k > 92.5482 )
								ret := -0.800000 // sell
				if( tema > 145.747 )
					if( ema3 <= 156.417 )
						if( smoothK_k <= 66.6396 )
							if( k <= 62.068 )
								if( smoothD_d <= 9.86084 )
									ret := 0.000000
								if( smoothD_d > 9.86084 )
									ret := -0.500000
							if( k > 62.068 )
								ret := 1.000000 // buy
						if( smoothK_k > 66.6396 )
							if( d <= 98.4363 )
								if( d_k <= 5.7287 )
									ret := -0.916667 // sell
								if( d_k > 5.7287 )
									ret := 0.000000
							if( d > 98.4363 )
								if( ema2 <= 151.186 )
									ret := -0.700000 // sell
								if( ema2 > 151.186 )
									ret := 0.538462
					if( ema3 > 156.417 )
						if( ema1 <= 286.998 )
							if( tema <= 274.798 )
								if( k <= 99.7271 )
									ret := 0.033898
								if( k > 99.7271 )
									ret := -0.446809
							if( tema > 274.798 )
								if( smoothD_d <= 87.1303 )
									ret := -0.081967
								if( smoothD_d > 87.1303 )
									ret := 0.654206
						if( ema1 > 286.998 )
							if( ema1 <= 290.36 )
								if( rsi1 <= 70.4996 )
									ret := 1.000000 // buy
								if( rsi1 > 70.4996 )
									ret := -0.653846
							if( ema1 > 290.36 )
								if( tema <= 299.181 )
									ret := 0.348485
								if( tema > 299.181 )
									ret := -0.083632
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_MSFT_30Min_2bd891df(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


