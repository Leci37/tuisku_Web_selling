//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AMZN_5Min_2ST0_05de806f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_2ST0_05de806f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_05de806f(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema3 <= 128.684 )
		if( smoothK_k <= 32.5737 )
			if( ema3 <= 106.117 )
				if( ema12 <= -0.016079 )
					if( tema <= 103.851 )
						if( ema13 <= -0.176931 )
							if( d <= 9.12898 )
								if( smoothD_d <= -2.65057 )
									ret := -0.454545
								if( smoothD_d > -2.65057 )
									ret := -0.933333 // sell
							if( d > 9.12898 )
								if( d_k <= 14.5069 )
									ret := -0.225000
								if( d_k > 14.5069 )
									ret := -0.888889 // sell
						if( ema13 > -0.176931 )
							if( rsi1 <= 25.4834 )
								ret := -1.000000 // sell
							if( rsi1 > 25.4834 )
								if( ema1 <= 102.673 )
									ret := 1.000000 // buy
								if( ema1 > 102.673 )
									ret := 0.076923
					if( tema > 103.851 )
						if( rsi1 <= 28.9206 )
							if( k <= 6.08332 )
								if( d_k <= 1.16069 )
									ret := 0.050000
								if( d_k > 1.16069 )
									ret := 0.629630
							if( k > 6.08332 )
								if( tema <= 105.356 )
									ret := 0.918033 // buy
								if( tema > 105.356 )
									ret := 0.444444
						if( rsi1 > 28.9206 )
							if( ema3 <= 105.233 )
								if( rsi1 <= 35.8303 )
									ret := 0.627451
								if( rsi1 > 35.8303 )
									ret := -0.194444
							if( ema3 > 105.233 )
								if( rsi1 <= 38.7985 )
									ret := -0.500000
								if( rsi1 > 38.7985 )
									ret := 0.197802
				if( ema12 > -0.016079 )
					if( d_k <= 22.5855 )
						if( ema1 <= 105.336 )
							if( ema2 <= 104.143 )
								if( ema1 <= 102.982 )
									ret := -0.714286 // sell
								if( ema1 > 102.982 )
									ret := 0.169811
							if( ema2 > 104.143 )
								if( d_k <= 12.8164 )
									ret := -0.829268 // sell
								if( d_k > 12.8164 )
									ret := -0.190476
						if( ema1 > 105.336 )
							if( smoothD_d <= 10.9502 )
								if( tema <= 105.65 )
									ret := 0.190476
								if( tema > 105.65 )
									ret := 0.850000 // buy
							if( smoothD_d > 10.9502 )
								if( tema <= 105.519 )
									ret := -0.052632
								if( tema > 105.519 )
									ret := -0.685185
					if( d_k > 22.5855 )
						ret := 0.619048
			if( ema3 > 106.117 )
				if( tema <= 123.567 )
					if( d <= 32.3443 )
						if( tema <= 107.408 )
							if( d <= 1.21732 )
								if( d_k <= -0.145662 )
									ret := -1.000000 // sell
								if( d_k > -0.145662 )
									ret := -0.818182 // sell
							if( d > 1.21732 )
								if( rsi1 <= 42.5247 )
									ret := -0.211180
								if( rsi1 > 42.5247 )
									ret := 0.570000
						if( tema > 107.408 )
							if( smoothD_d <= -2.29713 )
								if( tema <= 116.963 )
									ret := 0.883117 // buy
								if( tema > 116.963 )
									ret := 0.222222
							if( smoothD_d > -2.29713 )
								if( ema2 <= 109.357 )
									ret := 0.758170 // buy
								if( ema2 > 109.357 )
									ret := 0.292866
					if( d > 32.3443 )
						if( d <= 42.0496 )
							if( ema2 <= 107.909 )
								ret := 0.181818
							if( ema2 > 107.909 )
								if( k <= 34.8384 )
									ret := -0.595890
								if( k > 34.8384 )
									ret := 0.200000
						if( d > 42.0496 )
							if( k <= 30.9418 )
								if( ema12 <= -0.005606 )
									ret := 0.726190 // buy
								if( ema12 > -0.005606 )
									ret := 0.074074
							if( k > 30.9418 )
								if( smoothD_d <= 51.9655 )
									ret := -0.555556
								if( smoothD_d > 51.9655 )
									ret := 0.428571
				if( tema > 123.567 )
					if( ema12 <= 0.30155 )
						if( d <= 0.336348 )
							if( ema3 <= 126.162 )
								if( ema12 <= -0.146627 )
									ret := 0.300000
								if( ema12 > -0.146627 )
									ret := -0.200000
							if( ema3 > 126.162 )
								if( ema3 <= 127.368 )
									ret := -0.800000 // sell
								if( ema3 > 127.368 )
									ret := -0.380952
						if( d > 0.336348 )
							if( k <= 0.989335 )
								if( rsi1 <= 27.6471 )
									ret := 0.570000
								if( rsi1 > 27.6471 )
									ret := 0.231111
							if( k > 0.989335 )
								if( smoothD_d <= 3.71677 )
									ret := -0.084980
								if( smoothD_d > 3.71677 )
									ret := 0.149979
					if( ema12 > 0.30155 )
						if( d_k <= 17.751 )
							if( d_k <= 4.86761 )
								if( smoothK_k <= 13.2438 )
									ret := -1.000000 // sell
								if( smoothK_k > 13.2438 )
									ret := -0.600000
							if( d_k > 4.86761 )
								ret := -0.583333
						if( d_k > 17.751 )
							ret := 0.066667
		if( smoothK_k > 32.5737 )
			if( ema3 <= 108.871 )
				if( ema13 <= 0.166863 )
					if( ema2 <= 103.996 )
						if( ema13 <= -0.09271 )
							if( rsi1 <= 33.8782 )
								ret := 0.636364
							if( rsi1 > 33.8782 )
								if( d_k <= 0.462616 )
									ret := -0.076923
								if( d_k > 0.462616 )
									ret := -0.750000 // sell
						if( ema13 > -0.09271 )
							if( smoothD_d <= 71.9203 )
								if( tema <= 101.837 )
									ret := 0.281250
								if( tema > 101.837 )
									ret := 0.788732 // buy
							if( smoothD_d > 71.9203 )
								if( ema2 <= 102.958 )
									ret := -0.200000
								if( ema2 > 102.958 )
									ret := 0.417910
					if( ema2 > 103.996 )
						if( ema3 <= 107.075 )
							if( ema2 <= 105.665 )
								if( ema1 <= 104.113 )
									ret := -0.431373
								if( ema1 > 104.113 )
									ret := 0.094136
							if( ema2 > 105.665 )
								if( ema13 <= -0.379098 )
									ret := 0.500000
								if( ema13 > -0.379098 )
									ret := -0.333333
						if( ema3 > 107.075 )
							if( ema13 <= 0.085406 )
								if( ema12 <= -0.136629 )
									ret := 0.222222
								if( ema12 > -0.136629 )
									ret := 0.833333 // buy
							if( ema13 > 0.085406 )
								if( d_k <= 0.32244 )
									ret := -0.307692
								if( d_k > 0.32244 )
									ret := 0.733333 // buy
				if( ema13 > 0.166863 )
					if( ema3 <= 104.069 )
						if( smoothD_d <= 78.4937 )
							if( ema12 <= 0.207836 )
								ret := 0.272727
							if( ema12 > 0.207836 )
								ret := -0.533333
						if( smoothD_d > 78.4937 )
							if( d <= 87.1155 )
								if( smoothK_k <= 80.9177 )
									ret := 1.000000 // buy
								if( smoothK_k > 80.9177 )
									ret := 0.909091 // buy
							if( d > 87.1155 )
								if( ema1 <= 102.991 )
									ret := 0.588235
								if( ema1 > 102.991 )
									ret := -0.181818
					if( ema3 > 104.069 )
						if( smoothD_d <= 40.6456 )
							if( tema <= 107.361 )
								ret := 0.923077 // buy
							if( tema > 107.361 )
								if( smoothD_d <= 38.7705 )
									ret := -0.777778 // sell
								if( smoothD_d > 38.7705 )
									ret := 0.400000
						if( smoothD_d > 40.6456 )
							if( ema12 <= 0.110422 )
								if( k <= 86.8922 )
									ret := -0.375000
								if( k > 86.8922 )
									ret := 0.454545
							if( ema12 > 0.110422 )
								if( d_k <= 11.3673 )
									ret := -0.711982 // sell
								if( d_k > 11.3673 )
									ret := -0.142857
			if( ema3 > 108.871 )
				if( smoothK_k <= 35.2047 )
					if( rsi1 <= 51.1074 )
						if( tema <= 124.15 )
							if( smoothD_d <= 39.5501 )
								if( smoothD_d <= 30.8817 )
									ret := -0.187500
								if( smoothD_d > 30.8817 )
									ret := 0.675676
							if( smoothD_d > 39.5501 )
								if( ema12 <= -0.022405 )
									ret := -1.000000 // sell
								if( ema12 > -0.022405 )
									ret := 0.000000
						if( tema > 124.15 )
							if( ema1 <= 126.867 )
								if( ema3 <= 126.246 )
									ret := -0.277778
								if( ema3 > 126.246 )
									ret := -0.882353 // sell
							if( ema1 > 126.867 )
								if( rsi1 <= 49.2416 )
									ret := 0.172414
								if( rsi1 > 49.2416 )
									ret := -0.800000 // sell
					if( rsi1 > 51.1074 )
						if( ema3 <= 114.388 )
							if( tema <= 111.111 )
								ret := -0.833333 // sell
							if( tema > 111.111 )
								ret := 0.266667
						if( ema3 > 114.388 )
							if( rsi1 <= 62.9672 )
								if( rsi1 <= 52.6694 )
									ret := -0.883721 // sell
								if( rsi1 > 52.6694 )
									ret := -0.425926
							if( rsi1 > 62.9672 )
								if( rsi1 <= 67.4819 )
									ret := -1.000000 // sell
								if( rsi1 > 67.4819 )
									ret := -0.833333 // sell
				if( smoothK_k > 35.2047 )
					if( ema13 <= -0.764509 )
						if( ema12 <= -0.401357 )
							if( k <= 92.8654 )
								if( smoothD_d <= 86.5313 )
									ret := -0.357143
								if( smoothD_d > 86.5313 )
									ret := -1.000000 // sell
							if( k > 92.8654 )
								ret := 0.250000
						if( ema12 > -0.401357 )
							if( k <= 86.8652 )
								ret := -0.769231 // sell
							if( k > 86.8652 )
								ret := -1.000000 // sell
					if( ema13 > -0.764509 )
						if( ema1 <= 110.949 )
							if( ema12 <= 0.200605 )
								if( ema12 <= 0.044666 )
									ret := 0.313333
								if( ema12 > 0.044666 )
									ret := 0.629412
							if( ema12 > 0.200605 )
								if( ema3 <= 109.992 )
									ret := -0.777778 // sell
								if( ema3 > 109.992 )
									ret := 0.000000
						if( ema1 > 110.949 )
							if( k <= 76.9383 )
								if( d <= 81.1536 )
									ret := 0.077251
								if( d > 81.1536 )
									ret := 0.459854
							if( k > 76.9383 )
								if( smoothD_d <= 95.376 )
									ret := 0.001051
								if( smoothD_d > 95.376 )
									ret := -0.224439
	if( ema3 > 128.684 )
		if( ema2 <= 187.12 )
			if( rsi1 <= 89.0306 )
				if( tema <= 131.402 )
					if( k <= 26.5671 )
						if( tema <= 129.395 )
							if( d <= 25.6621 )
								if( k <= 1.201 )
									ret := 0.294521
								if( k > 1.201 )
									ret := -0.187750
							if( d > 25.6621 )
								if( rsi1 <= 41.6505 )
									ret := 0.709677 // buy
								if( rsi1 > 41.6505 )
									ret := 0.156863
						if( tema > 129.395 )
							if( smoothD_d <= 34.7184 )
								if( d_k <= 15.1359 )
									ret := -0.317764
								if( d_k > 15.1359 )
									ret := 0.216981
							if( smoothD_d > 34.7184 )
								if( ema1 <= 130.638 )
									ret := 0.733333 // buy
								if( ema1 > 130.638 )
									ret := -0.266667
					if( k > 26.5671 )
						if( k <= 99.5429 )
							if( d_k <= -15.4949 )
								if( k <= 73.2366 )
									ret := -0.348361
								if( k > 73.2366 )
									ret := -0.055249
							if( d_k > -15.4949 )
								if( ema13 <= 0.657698 )
									ret := 0.064348
								if( ema13 > 0.657698 )
									ret := -0.731343 // sell
						if( k > 99.5429 )
							if( rsi1 <= 75.0321 )
								if( d_k <= -12.3998 )
									ret := 0.086957
								if( d_k > -12.3998 )
									ret := -0.800000 // sell
							if( rsi1 > 75.0321 )
								if( ema1 <= 129.713 )
									ret := 0.320000
								if( ema1 > 129.713 )
									ret := -0.500000
				if( tema > 131.402 )
					if( rsi1 <= 24.1522 )
						if( d <= 2.2773 )
							if( smoothK_k <= 1.45281 )
								if( tema <= 174.966 )
									ret := 0.018707
								if( tema > 174.966 )
									ret := -0.238845
							if( smoothK_k > 1.45281 )
								if( d_k <= -3.37272 )
									ret := 0.875000 // buy
								if( d_k > -3.37272 )
									ret := 0.333333
						if( d > 2.2773 )
							if( d_k <= -6.00402 )
								if( tema <= 174.093 )
									ret := -0.360902
								if( tema > 174.093 )
									ret := 0.196581
							if( d_k > -6.00402 )
								if( ema1 <= 182.082 )
									ret := 0.253240
								if( ema1 > 182.082 )
									ret := 0.016000
					if( rsi1 > 24.1522 )
						if( ema3 <= 130.65 )
							if( smoothK_k <= 81.1648 )
								if( ema13 <= 0.705059 )
									ret := -0.714286 // sell
								if( ema13 > 0.705059 )
									ret := -1.000000 // sell
							if( smoothK_k > 81.1648 )
								ret := 0.272727
						if( ema3 > 130.65 )
							if( smoothD_d <= 93.0256 )
								if( rsi1 <= 85.2982 )
									ret := -0.009741
								if( rsi1 > 85.2982 )
									ret := 0.328829
							if( smoothD_d > 93.0256 )
								if( ema13 <= 0.123945 )
									ret := -0.003674
								if( ema13 > 0.123945 )
									ret := 0.150488
			if( rsi1 > 89.0306 )
				if( ema2 <= 181.745 )
					if( ema2 <= 167.723 )
						if( rsi1 <= 91.2978 )
							if( ema2 <= 141.49 )
								if( d <= 98.4213 )
									ret := -0.555556
								if( d > 98.4213 )
									ret := -0.250000
							if( ema2 > 141.49 )
								if( k <= 98.1539 )
									ret := -0.466667
								if( k > 98.1539 )
									ret := -0.937500 // sell
						if( rsi1 > 91.2978 )
							if( ema13 <= 0.321588 )
								ret := -0.416667
							if( ema13 > 0.321588 )
								if( ema1 <= 148.801 )
									ret := -0.975000 // sell
								if( ema1 > 148.801 )
									ret := -0.687500
					if( ema2 > 167.723 )
						if( k <= 95.1908 )
							if( ema2 <= 175.83 )
								ret := -1.000000 // sell
							if( ema2 > 175.83 )
								if( rsi1 <= 89.961 )
									ret := -1.000000 // sell
								if( rsi1 > 89.961 )
									ret := -0.181818
						if( k > 95.1908 )
							if( k <= 99.3984 )
								if( tema <= 181.506 )
									ret := 0.405405
								if( tema > 181.506 )
									ret := -0.555556
							if( k > 99.3984 )
								if( tema <= 174.982 )
									ret := 0.300000
								if( tema > 174.982 )
									ret := -0.611111
				if( ema2 > 181.745 )
					if( ema12 <= 0.640566 )
						if( ema1 <= 183.528 )
							ret := 0.833333 // buy
						if( ema1 > 183.528 )
							if( smoothK_k <= 95.8189 )
								ret := 0.444444
							if( smoothK_k > 95.8189 )
								ret := 0.176471
					if( ema12 > 0.640566 )
						ret := -0.230769
		if( ema2 > 187.12 )
			if( ema12 <= -0.487845 )
				if( smoothK_k <= 64.0399 )
					if( d_k <= 2.79439 )
						if( d <= 0.721792 )
							ret := 0.250000
						if( d > 0.721792 )
							if( ema13 <= -1.07198 )
								if( ema12 <= -0.86416 )
									ret := -0.666667
								if( ema12 > -0.86416 )
									ret := -0.912791 // sell
							if( ema13 > -1.07198 )
								if( d <= 4.77439 )
									ret := 0.045455
								if( d > 4.77439 )
									ret := -0.593220
					if( d_k > 2.79439 )
						if( ema12 <= -0.62965 )
							ret := 1.000000 // buy
						if( ema12 > -0.62965 )
							if( ema3 <= 192.1 )
								ret := -0.100000
							if( ema3 > 192.1 )
								ret := -0.769231 // sell
				if( smoothK_k > 64.0399 )
					ret := 0.791667 // buy
			if( ema12 > -0.487845 )
				if( k <= 11.3068 )
					if( ema13 <= -0.361416 )
						if( ema3 <= 194.813 )
							if( smoothK_k <= 6.21751 )
								if( ema1 <= 193.478 )
									ret := 0.440559
								if( ema1 > 193.478 )
									ret := 0.870968 // buy
							if( smoothK_k > 6.21751 )
								ret := -0.166667
						if( ema3 > 194.813 )
							if( d <= 3.0276 )
								if( tema <= 194.11 )
									ret := -1.000000 // sell
								if( tema > 194.11 )
									ret := -0.727273 // sell
							if( d > 3.0276 )
								if( smoothD_d <= 8.71132 )
									ret := 0.235294
								if( smoothD_d > 8.71132 )
									ret := -0.900000 // sell
					if( ema13 > -0.361416 )
						if( smoothK_k <= 2.72655 )
							if( d_k <= 12.5004 )
								if( ema1 <= 187.647 )
									ret := -0.486486
								if( ema1 > 187.647 )
									ret := -0.036072
							if( d_k > 12.5004 )
								if( d <= 16.7359 )
									ret := -0.868421 // sell
								if( d > 16.7359 )
									ret := -0.417722
						if( smoothK_k > 2.72655 )
							if( ema1 <= 189.048 )
								if( ema1 <= 188.408 )
									ret := -0.527027
								if( ema1 > 188.408 )
									ret := -0.942308 // sell
							if( ema1 > 189.048 )
								if( d <= 28.5776 )
									ret := -0.472789
								if( d > 28.5776 )
									ret := 0.631579
				if( k > 11.3068 )
					if( smoothK_k <= 64.3842 )
						if( ema3 <= 187.752 )
							if( ema13 <= 0.494914 )
								if( rsi1 <= 71.4049 )
									ret := -0.158996
								if( rsi1 > 71.4049 )
									ret := 0.777778 // buy
							if( ema13 > 0.494914 )
								if( rsi1 <= 69.5777 )
									ret := -0.931034 // sell
								if( rsi1 > 69.5777 )
									ret := -0.100000
						if( ema3 > 187.752 )
							if( ema3 <= 194.492 )
								if( ema12 <= 0.431396 )
									ret := 0.104089
								if( ema12 > 0.431396 )
									ret := 1.000000 // buy
							if( ema3 > 194.492 )
								if( ema12 <= 0.046651 )
									ret := -0.100000
								if( ema12 > 0.046651 )
									ret := 0.103679
					if( smoothK_k > 64.3842 )
						if( ema1 <= 198.325 )
							if( d_k <= 4.57746 )
								if( ema12 <= -0.389786 )
									ret := 0.960000 // buy
								if( ema12 > -0.389786 )
									ret := -0.033935
							if( d_k > 4.57746 )
								if( ema2 <= 191.522 )
									ret := -0.487252
								if( ema2 > 191.522 )
									ret := 0.148438
						if( ema1 > 198.325 )
							if( ema13 <= -0.005098 )
								if( smoothD_d <= 71.279 )
									ret := -0.153846
								if( smoothD_d > 71.279 )
									ret := -0.783133 // sell
							if( ema13 > -0.005098 )
								if( d_k <= 7.86785 )
									ret := -0.315985
								if( d_k > 7.86785 )
									ret := 0.409091
	
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
float op_operation = decision_tree_0_AMZN_5Min_05de806f(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


