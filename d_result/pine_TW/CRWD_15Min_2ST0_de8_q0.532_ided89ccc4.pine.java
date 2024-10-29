//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: CRWD_15Min_2ST0_ed89ccc4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2ST0_ed89ccc4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_ed89ccc4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.033526 )
		if( d <= 77.326 )
			if( k <= 63.0278 )
				if( ema1 <= 174.646 )
					if( ema3 <= 171.869 )
						if( k <= 49.629 )
							if( rsi1 <= 34.3966 )
								if( ema2 <= 85.9681 )
									ret := 0.232330
								if( ema2 > 85.9681 )
									ret := 0.068952
							if( rsi1 > 34.3966 )
								if( ema13 <= -0.656231 )
									ret := -0.107123
								if( ema13 > -0.656231 )
									ret := 0.043496
						if( k > 49.629 )
							if( d <= 66.8536 )
								if( d <= 58.523 )
									ret := 0.154472
								if( d > 58.523 )
									ret := 0.497030
							if( d > 66.8536 )
								if( tema <= 48.3141 )
									ret := 0.958333 // buy
								if( tema > 48.3141 )
									ret := -0.077612
					if( ema3 > 171.869 )
						if( d_k <= -0.861398 )
							if( ema13 <= -3.14137 )
								if( tema <= 169.706 )
									ret := 0.103448
								if( tema > 169.706 )
									ret := -0.850000 // sell
							if( ema13 > -3.14137 )
								if( ema12 <= -1.45196 )
									ret := 0.833333 // buy
								if( ema12 > -1.45196 )
									ret := 0.302326
						if( d_k > -0.861398 )
							if( d_k <= 13.3703 )
								if( ema13 <= 0.184236 )
									ret := 0.624561
								if( ema13 > 0.184236 )
									ret := -0.272727
							if( d_k > 13.3703 )
								if( smoothK_k <= 10.948 )
									ret := 0.583333
								if( smoothK_k > 10.948 )
									ret := 0.191781
				if( ema1 > 174.646 )
					if( smoothD_d <= 25.1333 )
						if( ema13 <= -14.1722 )
							if( ema12 <= -14.0867 )
								ret := 0.733333 // buy
							if( ema12 > -14.0867 )
								ret := 1.000000 // buy
						if( ema13 > -14.1722 )
							if( ema1 <= 213.594 )
								if( smoothD_d <= -2.23457 )
									ret := 0.257919
								if( smoothD_d > -2.23457 )
									ret := -0.113135
							if( ema1 > 213.594 )
								if( ema3 <= 225.596 )
									ret := 0.299459
								if( ema3 > 225.596 )
									ret := 0.002625
					if( smoothD_d > 25.1333 )
						if( ema13 <= -1.52098 )
							if( ema3 <= 214.365 )
								if( d_k <= 2.74295 )
									ret := 0.426877
								if( d_k > 2.74295 )
									ret := -0.009174
							if( ema3 > 214.365 )
								if( rsi1 <= 28.6388 )
									ret := 0.080851
								if( rsi1 > 28.6388 )
									ret := -0.319688
						if( ema13 > -1.52098 )
							if( d_k <= 18.693 )
								if( d <= 74.0352 )
									ret := 0.154762
								if( d > 74.0352 )
									ret := 0.818182 // buy
							if( d_k > 18.693 )
								if( d <= 31.0275 )
									ret := 0.550000
								if( d > 31.0275 )
									ret := -0.093195
			if( k > 63.0278 )
				if( k <= 69.7413 )
					if( ema3 <= 101.941 )
						if( ema3 <= 91.2336 )
							if( rsi1 <= 48.9948 )
								if( ema2 <= 51.2836 )
									ret := 0.833333 // buy
								if( ema2 > 51.2836 )
									ret := 0.120253
							if( rsi1 > 48.9948 )
								if( k <= 65.1971 )
									ret := 0.194444
								if( k > 65.1971 )
									ret := -0.609195
						if( ema3 > 91.2336 )
							if( ema12 <= -0.163141 )
								if( smoothK_k <= 62.2848 )
									ret := 0.750000 // buy
								if( smoothK_k > 62.2848 )
									ret := 1.000000 // buy
							if( ema12 > -0.163141 )
								ret := 0.600000
					if( ema3 > 101.941 )
						if( ema12 <= -0.494327 )
							if( d_k <= 1.4249 )
								if( ema12 <= -2.14475 )
									ret := 1.000000 // buy
								if( ema12 > -2.14475 )
									ret := -0.337037
							if( d_k > 1.4249 )
								if( d <= 71.2141 )
									ret := -0.940000 // sell
								if( d > 71.2141 )
									ret := -0.390244
						if( ema12 > -0.494327 )
							if( smoothD_d <= 37.3654 )
								ret := -0.800000 // sell
							if( smoothD_d > 37.3654 )
								if( d <= 76.7153 )
									ret := -0.146814
								if( d > 76.7153 )
									ret := -0.800000 // sell
				if( k > 69.7413 )
					if( ema1 <= 58.672 )
						if( d <= 66.4792 )
							if( d <= 57.9197 )
								if( tema <= 56.1358 )
									ret := 0.272727
								if( tema > 56.1358 )
									ret := 0.962963 // buy
							if( d > 57.9197 )
								if( ema2 <= 54.7785 )
									ret := 0.172414
								if( ema2 > 54.7785 )
									ret := -0.706897 // sell
						if( d > 66.4792 )
							if( rsi1 <= 37.8526 )
								if( smoothD_d <= 67.0951 )
									ret := 0.647059
								if( smoothD_d > 67.0951 )
									ret := -0.818182 // sell
							if( rsi1 > 37.8526 )
								if( ema2 <= 54.8869 )
									ret := 0.581395
								if( ema2 > 54.8869 )
									ret := 0.975000 // buy
					if( ema1 > 58.672 )
						if( ema13 <= -0.374858 )
							if( ema12 <= -0.848916 )
								if( smoothK_k <= 78.795 )
									ret := 0.326923
								if( smoothK_k > 78.795 )
									ret := -0.201754
							if( ema12 > -0.848916 )
								if( ema3 <= 318.653 )
									ret := -0.108417
								if( ema3 > 318.653 )
									ret := -0.495575
						if( ema13 > -0.374858 )
							if( ema1 <= 188.636 )
								if( ema2 <= 181.305 )
									ret := 0.066536
								if( ema2 > 181.305 )
									ret := -0.625000
							if( ema1 > 188.636 )
								if( ema1 <= 295.589 )
									ret := 0.456790
								if( ema1 > 295.589 )
									ret := -0.096774
		if( d > 77.326 )
			if( ema2 <= 69.0044 )
				if( tema <= 63.4505 )
					if( ema12 <= -0.325319 )
						if( ema1 <= 57.3353 )
							if( ema1 <= 53.3234 )
								ret := -0.333333
							if( ema1 > 53.3234 )
								if( smoothK_k <= 82.9559 )
									ret := -1.000000 // sell
								if( smoothK_k > 82.9559 )
									ret := -0.769231 // sell
						if( ema1 > 57.3353 )
							ret := 0.100000
					if( ema12 > -0.325319 )
						if( smoothD_d <= 94.4779 )
							if( ema2 <= 58.4504 )
								if( smoothD_d <= 93.5577 )
									ret := -0.226415
								if( smoothD_d > 93.5577 )
									ret := -0.880000 // sell
							if( ema2 > 58.4504 )
								if( smoothK_k <= 84.2649 )
									ret := -0.041096
								if( smoothK_k > 84.2649 )
									ret := 0.525000
						if( smoothD_d > 94.4779 )
							if( rsi1 <= 55.6369 )
								ret := 1.000000 // buy
							if( rsi1 > 55.6369 )
								ret := 0.315789
				if( tema > 63.4505 )
					if( k <= 98.5177 )
						if( rsi1 <= 55.7793 )
							if( smoothD_d <= 81.7674 )
								if( ema3 <= 67.496 )
									ret := -0.980000 // sell
								if( ema3 > 67.496 )
									ret := -0.625000
							if( smoothD_d > 81.7674 )
								if( ema1 <= 67.2716 )
									ret := -0.400000
								if( ema1 > 67.2716 )
									ret := -0.913043 // sell
						if( rsi1 > 55.7793 )
							if( tema <= 65.5279 )
								ret := -0.133333
							if( tema > 65.5279 )
								ret := -0.777778 // sell
					if( k > 98.5177 )
						ret := 0.250000
			if( ema2 > 69.0044 )
				if( ema3 <= 146.909 )
					if( ema1 <= 118.836 )
						if( ema2 <= 93.6497 )
							if( ema3 <= 76.8754 )
								if( ema3 <= 75.1891 )
									ret := 0.385965
								if( ema3 > 75.1891 )
									ret := 0.896552 // buy
							if( ema3 > 76.8754 )
								if( tema <= 91.7234 )
									ret := -0.065421
								if( tema > 91.7234 )
									ret := 0.481481
						if( ema2 > 93.6497 )
							if( k <= 79.0434 )
								if( tema <= 96.7696 )
									ret := 0.576923
								if( tema > 96.7696 )
									ret := -0.063158
							if( k > 79.0434 )
								if( rsi1 <= 41.6774 )
									ret := -0.038961
								if( rsi1 > 41.6774 )
									ret := -0.419672
					if( ema1 > 118.836 )
						if( k <= 98.8193 )
							if( ema2 <= 130.704 )
								if( smoothD_d <= 91.6099 )
									ret := 0.462555
								if( smoothD_d > 91.6099 )
									ret := 0.775510 // buy
							if( ema2 > 130.704 )
								if( ema3 <= 139.246 )
									ret := -0.159420
								if( ema3 > 139.246 )
									ret := 0.500000
						if( k > 98.8193 )
							if( ema12 <= -0.150588 )
								if( d <= 99.3952 )
									ret := 0.000000
								if( d > 99.3952 )
									ret := 0.333333
							if( ema12 > -0.150588 )
								if( rsi1 <= 55.337 )
									ret := -0.083333
								if( rsi1 > 55.337 )
									ret := -0.714286 // sell
				if( ema3 > 146.909 )
					if( ema3 <= 209.803 )
						if( tema <= 204.037 )
							if( ema1 <= 193.567 )
								if( rsi1 <= 34.5771 )
									ret := 0.278351
								if( rsi1 > 34.5771 )
									ret := -0.217469
							if( ema1 > 193.567 )
								if( k <= 66.3593 )
									ret := -0.913043 // sell
								if( k > 66.3593 )
									ret := 0.227941
						if( tema > 204.037 )
							if( k <= 92.0912 )
								if( k <= 88.7347 )
									ret := -0.523810
								if( k > 88.7347 )
									ret := 0.500000
							if( k > 92.0912 )
								if( d_k <= -3.37023 )
									ret := -1.000000 // sell
								if( d_k > -3.37023 )
									ret := -0.689655
					if( ema3 > 209.803 )
						if( smoothD_d <= 90.1475 )
							if( ema12 <= -0.687712 )
								if( ema1 <= 269.896 )
									ret := 0.296296
								if( ema1 > 269.896 )
									ret := -0.418803
							if( ema12 > -0.687712 )
								if( smoothD_d <= 83.098 )
									ret := 0.027397
								if( smoothD_d > 83.098 )
									ret := 0.309524
						if( smoothD_d > 90.1475 )
							if( smoothK_k <= 94.5653 )
								if( ema1 <= 256.483 )
									ret := -0.287500
								if( ema1 > 256.483 )
									ret := -0.582192
							if( smoothK_k > 94.5653 )
								if( ema3 <= 271.032 )
									ret := -0.129412
								if( ema3 > 271.032 )
									ret := 0.418182
	if( ema12 > 0.033526 )
		if( tema <= 50.9073 )
			if( ema3 <= 49.1889 )
				if( ema13 <= -0.043482 )
					if( k <= 85.7388 )
						ret := -0.500000
					if( k > 85.7388 )
						if( ema13 <= -0.090595 )
							ret := -1.000000 // sell
						if( ema13 > -0.090595 )
							ret := -0.750000 // sell
				if( ema13 > -0.043482 )
					if( ema3 <= 38.6954 )
						if( smoothK_k <= 85.0093 )
							if( ema2 <= 34.7446 )
								ret := 0.833333 // buy
							if( ema2 > 34.7446 )
								if( k <= 86.3774 )
									ret := -0.438356
								if( k > 86.3774 )
									ret := 0.555556
						if( smoothK_k > 85.0093 )
							if( smoothK_k <= 95.3776 )
								ret := -1.000000 // sell
							if( smoothK_k > 95.3776 )
								if( ema12 <= 0.949929 )
									ret := 0.066667
								if( ema12 > 0.949929 )
									ret := -0.642857
					if( ema3 > 38.6954 )
						if( ema1 <= 46.7138 )
							if( d <= 46.97 )
								ret := -0.764706 // sell
							if( d > 46.97 )
								if( d_k <= -7.75414 )
									ret := -0.625000
								if( d_k > -7.75414 )
									ret := 0.628205
						if( ema1 > 46.7138 )
							if( ema2 <= 49.1412 )
								if( d <= 80.6249 )
									ret := -0.078086
								if( d > 80.6249 )
									ret := -0.429952
							if( ema2 > 49.1412 )
								if( rsi1 <= 82.6216 )
									ret := 0.404255
								if( rsi1 > 82.6216 )
									ret := 1.000000 // buy
			if( ema3 > 49.1889 )
				if( k <= 82.8625 )
					if( ema13 <= 0.153731 )
						if( ema13 <= 0.10476 )
							if( smoothD_d <= 42.4564 )
								ret := -0.333333
							if( smoothD_d > 42.4564 )
								ret := -0.764706 // sell
						if( ema13 > 0.10476 )
							if( smoothD_d <= 45.2805 )
								ret := -1.000000 // sell
							if( smoothD_d > 45.2805 )
								ret := -0.923077 // sell
					if( ema13 > 0.153731 )
						if( tema <= 49.873 )
							if( d_k <= 1.31525 )
								ret := -0.954545 // sell
							if( d_k > 1.31525 )
								ret := -0.666667
						if( tema > 49.873 )
							if( ema12 <= 0.21368 )
								if( rsi1 <= 56.1457 )
									ret := 0.200000
								if( rsi1 > 56.1457 )
									ret := -0.327869
							if( ema12 > 0.21368 )
								ret := 0.428571
				if( k > 82.8625 )
					if( ema13 <= 0.116793 )
						ret := -0.411765
					if( ema13 > 0.116793 )
						if( smoothD_d <= 89.6868 )
							if( smoothD_d <= 87.7452 )
								if( smoothD_d <= 77.5075 )
									ret := -1.000000 // sell
								if( smoothD_d > 77.5075 )
									ret := -0.846154 // sell
							if( smoothD_d > 87.7452 )
								ret := -0.600000
						if( smoothD_d > 89.6868 )
							ret := -1.000000 // sell
		if( tema > 50.9073 )
			if( smoothD_d <= 93.3807 )
				if( ema2 <= 56.4923 )
					if( ema13 <= 0.216657 )
						if( smoothK_k <= 71.077 )
							if( ema12 <= 0.04571 )
								if( ema1 <= 53.5955 )
									ret := -0.944444 // sell
								if( ema1 > 53.5955 )
									ret := -0.400000
							if( ema12 > 0.04571 )
								if( ema2 <= 55.5078 )
									ret := -0.454545
								if( ema2 > 55.5078 )
									ret := 0.000000
						if( smoothK_k > 71.077 )
							if( k <= 85.6097 )
								if( ema13 <= 0.088013 )
									ret := 0.809524 // buy
								if( ema13 > 0.088013 )
									ret := 0.176471
							if( k > 85.6097 )
								if( d <= 93.7225 )
									ret := 0.105263
								if( d > 93.7225 )
									ret := -0.750000 // sell
					if( ema13 > 0.216657 )
						if( k <= 92.4325 )
							if( d_k <= 12.6207 )
								if( rsi1 <= 68.8207 )
									ret := 0.317919
								if( rsi1 > 68.8207 )
									ret := -0.211679
							if( d_k > 12.6207 )
								if( ema13 <= 0.832828 )
									ret := 0.295775
								if( ema13 > 0.832828 )
									ret := 0.973684 // buy
						if( k > 92.4325 )
							if( smoothD_d <= 92.3105 )
								if( smoothK_k <= 89.8533 )
									ret := 0.909091 // buy
								if( smoothK_k > 89.8533 )
									ret := 0.982456 // buy
							if( smoothD_d > 92.3105 )
								ret := 0.235294
				if( ema2 > 56.4923 )
					if( tema <= 386.911 )
						if( tema <= 89.601 )
							if( ema1 <= 84.0398 )
								if( ema1 <= 81.5754 )
									ret := -0.064917
								if( ema1 > 81.5754 )
									ret := 0.337209
							if( ema1 > 84.0398 )
								if( smoothD_d <= 90.8928 )
									ret := -0.454945
								if( smoothD_d > 90.8928 )
									ret := 0.583333
						if( tema > 89.601 )
							if( tema <= 94.6941 )
								if( rsi1 <= 44.9921 )
									ret := 0.954545 // buy
								if( rsi1 > 44.9921 )
									ret := 0.237374
							if( tema > 94.6941 )
								if( d <= 94.1894 )
									ret := -0.028994
								if( d > 94.1894 )
									ret := 0.097695
					if( tema > 386.911 )
						if( ema12 <= 0.216381 )
							if( d <= 48.7913 )
								ret := 0.000000
							if( d > 48.7913 )
								ret := -0.333333
						if( ema12 > 0.216381 )
							if( smoothD_d <= 86.3954 )
								if( d <= 61.6756 )
									ret := -0.111111
								if( d > 61.6756 )
									ret := -0.623762
							if( smoothD_d > 86.3954 )
								if( ema1 <= 388.144 )
									ret := -0.100000
								if( ema1 > 388.144 )
									ret := 0.000000
			if( smoothD_d > 93.3807 )
				if( ema2 <= 130.676 )
					if( ema1 <= 129.414 )
						if( ema3 <= 54.6939 )
							if( ema3 <= 51.9495 )
								if( ema12 <= 0.800568 )
									ret := -0.818182 // sell
								if( ema12 > 0.800568 )
									ret := -1.000000 // sell
							if( ema3 > 51.9495 )
								if( smoothK_k <= 92.6516 )
									ret := -0.230769
								if( smoothK_k > 92.6516 )
									ret := 0.815385 // buy
						if( ema3 > 54.6939 )
							if( k <= 94.7844 )
								if( ema12 <= 0.210865 )
									ret := -0.400000
								if( ema12 > 0.210865 )
									ret := 0.255556
							if( k > 94.7844 )
								if( ema2 <= 100.049 )
									ret := -0.398473
								if( ema2 > 100.049 )
									ret := -0.192488
					if( ema1 > 129.414 )
						if( smoothD_d <= 94.2563 )
							ret := -0.555556
						if( smoothD_d > 94.2563 )
							if( tema <= 132.109 )
								ret := -1.000000 // sell
							if( tema > 132.109 )
								ret := -0.857143 // sell
				if( ema2 > 130.676 )
					if( d_k <= 0.009723 )
						if( ema12 <= 0.104329 )
							if( ema3 <= 182.046 )
								if( d_k <= -1.43935 )
									ret := -0.533333
								if( d_k > -1.43935 )
									ret := -1.000000 // sell
							if( ema3 > 182.046 )
								ret := 0.000000
						if( ema12 > 0.104329 )
							if( ema3 <= 187.971 )
								if( ema12 <= 0.676164 )
									ret := -0.123932
								if( ema12 > 0.676164 )
									ret := 0.399497
							if( ema3 > 187.971 )
								if( tema <= 236.502 )
									ret := -0.273723
								if( tema > 236.502 )
									ret := 0.070529
					if( d_k > 0.009723 )
						if( tema <= 325.144 )
							if( ema13 <= 0.297593 )
								if( smoothK_k <= 93.0869 )
									ret := -0.621212
								if( smoothK_k > 93.0869 )
									ret := -0.285714
							if( ema13 > 0.297593 )
								if( smoothK_k <= 94.3549 )
									ret := -0.011696
								if( smoothK_k > 94.3549 )
									ret := -0.229075
						if( tema > 325.144 )
							if( ema13 <= 3.30094 )
								if( k <= 97.2649 )
									ret := -0.050000
								if( k > 97.2649 )
									ret := -0.555556
							if( ema13 > 3.30094 )
								if( d_k <= 2.32559 )
									ret := -1.000000 // sell
								if( d_k > 2.32559 )
									ret := -0.833333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_CRWD_15Min_ed89ccc4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


