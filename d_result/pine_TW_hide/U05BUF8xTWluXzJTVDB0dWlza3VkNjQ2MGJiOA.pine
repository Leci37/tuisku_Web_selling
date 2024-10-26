//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: SNAP_1Min_2ST0_d6460bb8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2ST0_d6460bb8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_d6460bb8(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_k <= 0.000213 )
		if( d <= 78.0102 )
			if( ema1 <= 9.62664 )
				if( ema3 <= 9.45091 )
					if( rsi1 <= 50.0921 )
						if( k <= 5.91849 )
							if( smoothD_d <= -0.46318 )
								if( smoothK_k <= 0.502396 )
									ret := 0.044944
								if( smoothK_k > 0.502396 )
									ret := -0.537037
							if( smoothD_d > -0.46318 )
								if( ema12 <= -0.015201 )
									ret := -0.828947 // sell
								if( ema12 > -0.015201 )
									ret := -0.272109
						if( k > 5.91849 )
							if( d_k <= -14.167 )
								if( k <= 32.2006 )
									ret := -0.658537
								if( k > 32.2006 )
									ret := 0.277556
							if( d_k > -14.167 )
								if( smoothD_d <= 0.06066 )
									ret := 0.666667
								if( smoothD_d > 0.06066 )
									ret := 0.038251
					if( rsi1 > 50.0921 )
						if( k <= 86.9267 )
							if( rsi1 <= 58.0859 )
								if( smoothD_d <= 61.4043 )
									ret := -0.038005
								if( smoothD_d > 61.4043 )
									ret := -0.435897
							if( rsi1 > 58.0859 )
								if( d <= 1.23591 )
									ret := 1.000000 // buy
								if( d > 1.23591 )
									ret := -0.318900
						if( k > 86.9267 )
							if( d <= 72.4295 )
								if( ema12 <= 0.000647 )
									ret := -0.692308
								if( ema12 > 0.000647 )
									ret := 0.433566
							if( d > 72.4295 )
								if( k <= 98.4006 )
									ret := -0.119266
								if( k > 98.4006 )
									ret := -0.703704 // sell
				if( ema3 > 9.45091 )
					if( ema13 <= 0.002413 )
						if( d <= 67.1765 )
							if( ema1 <= 9.43413 )
								if( rsi1 <= 27.4397 )
									ret := -0.857143 // sell
								if( rsi1 > 27.4397 )
									ret := -0.400000
							if( ema1 > 9.43413 )
								if( d_k <= -19.2218 )
									ret := -0.434343
								if( d_k > -19.2218 )
									ret := -0.024638
						if( d > 67.1765 )
							if( tema <= 9.46784 )
								ret := -0.700000 // sell
							if( tema > 9.46784 )
								if( ema12 <= -0.004709 )
									ret := -0.066667
								if( ema12 > -0.004709 )
									ret := 0.636364
					if( ema13 > 0.002413 )
						if( d <= 4.19349 )
							if( ema12 <= 0.006042 )
								ret := -0.111111
							if( ema12 > 0.006042 )
								ret := 0.500000
						if( d > 4.19349 )
							if( rsi1 <= 47.1718 )
								ret := -0.833333 // sell
							if( rsi1 > 47.1718 )
								if( ema13 <= 0.004488 )
									ret := -0.568627
								if( ema13 > 0.004488 )
									ret := -0.248634
			if( ema1 > 9.62664 )
				if( rsi1 <= 44.4453 )
					if( tema <= 13.1567 )
						if( smoothK_k <= 5.93199 )
							if( d <= 0.29305 )
								if( tema <= 10.0415 )
									ret := 0.750000 // buy
								if( tema > 10.0415 )
									ret := 0.125000
							if( d > 0.29305 )
								if( smoothD_d <= 3.0803 )
									ret := -0.251564
								if( smoothD_d > 3.0803 )
									ret := 0.185185
						if( smoothK_k > 5.93199 )
							if( ema13 <= -0.022384 )
								if( ema3 <= 12.353 )
									ret := -0.129234
								if( ema3 > 12.353 )
									ret := 0.340741
							if( ema13 > -0.022384 )
								if( ema12 <= -0.010585 )
									ret := 0.486486
								if( ema12 > -0.010585 )
									ret := 0.087808
					if( tema > 13.1567 )
						if( ema13 <= -0.180812 )
							if( ema1 <= 16.3383 )
								ret := 1.000000 // buy
							if( ema1 > 16.3383 )
								ret := 0.928571 // buy
						if( ema13 > -0.180812 )
							if( d <= 63.0171 )
								if( ema3 <= 15.2326 )
									ret := 0.169448
								if( ema3 > 15.2326 )
									ret := 0.006960
							if( d > 63.0171 )
								if( d_k <= -9.22806 )
									ret := 0.145833
								if( d_k > -9.22806 )
									ret := 0.563265
				if( rsi1 > 44.4453 )
					if( smoothK_k <= 45.5535 )
						if( d_k <= -19.9752 )
							if( ema3 <= 10.3975 )
								ret := 0.176471
							if( ema3 > 10.3975 )
								if( rsi1 <= 61.99 )
									ret := -0.676259
								if( rsi1 > 61.99 )
									ret := -0.294118
						if( d_k > -19.9752 )
							if( d <= 38.314 )
								if( ema13 <= 0.031844 )
									ret := -0.036076
								if( ema13 > 0.031844 )
									ret := -0.380583
							if( d > 38.314 )
								if( rsi1 <= 63.1061 )
									ret := -0.386091
								if( rsi1 > 63.1061 )
									ret := 0.058824
					if( smoothK_k > 45.5535 )
						if( d <= 35.125 )
							if( ema1 <= 10.3118 )
								if( ema3 <= 10.0858 )
									ret := 0.645161
								if( ema3 > 10.0858 )
									ret := 1.000000 // buy
							if( ema1 > 10.3118 )
								if( ema12 <= -0.011514 )
									ret := -0.541667
								if( ema12 > -0.011514 )
									ret := 0.227500
						if( d > 35.125 )
							if( ema1 <= 13.4275 )
								if( rsi1 <= 69.3201 )
									ret := 0.034960
								if( rsi1 > 69.3201 )
									ret := 0.269504
							if( ema1 > 13.4275 )
								if( tema <= 15.0672 )
									ret := -0.118844
								if( tema > 15.0672 )
									ret := 0.015211
		if( d > 78.0102 )
			if( ema13 <= 0.036101 )
				if( k <= 86.0748 )
					if( ema12 <= 0.002887 )
						if( ema13 <= -0.00779 )
							if( ema2 <= 16.3634 )
								if( ema13 <= -0.040456 )
									ret := 0.411765
								if( ema13 > -0.040456 )
									ret := -0.289655
							if( ema2 > 16.3634 )
								ret := 0.692308
						if( ema13 > -0.00779 )
							if( d <= 81.1786 )
								if( ema1 <= 15.7044 )
									ret := 0.526882
								if( ema1 > 15.7044 )
									ret := -0.111111
							if( d > 81.1786 )
								if( ema13 <= 0.004755 )
									ret := 0.051282
								if( ema13 > 0.004755 )
									ret := -0.818182 // sell
					if( ema12 > 0.002887 )
						if( d_k <= -0.218065 )
							if( ema13 <= 0.024815 )
								if( ema12 <= 0.005533 )
									ret := -0.352113
								if( ema12 > 0.005533 )
									ret := -0.698997
							if( ema13 > 0.024815 )
								if( ema2 <= 11.2697 )
									ret := 0.481481
								if( ema2 > 11.2697 )
									ret := -0.250000
						if( d_k > -0.218065 )
							if( rsi1 <= 67.0095 )
								ret := -0.120000
							if( rsi1 > 67.0095 )
								ret := 0.461538
				if( k > 86.0748 )
					if( tema <= 9.31897 )
						if( ema13 <= -0.012664 )
							if( smoothK_k <= 90.4699 )
								if( smoothD_d <= 81.1261 )
									ret := 0.166667
								if( smoothD_d > 81.1261 )
									ret := -0.800000 // sell
							if( smoothK_k > 90.4699 )
								if( ema3 <= 9.10726 )
									ret := 0.535714
								if( ema3 > 9.10726 )
									ret := 0.232558
						if( ema13 > -0.012664 )
							if( ema2 <= 8.6202 )
								if( k <= 99.9243 )
									ret := 0.260504
								if( k > 99.9243 )
									ret := -0.136364
							if( ema2 > 8.6202 )
								if( rsi1 <= 88.3037 )
									ret := -0.245587
								if( rsi1 > 88.3037 )
									ret := -0.837838 // sell
					if( tema > 9.31897 )
						if( d <= 81.2603 )
							if( smoothK_k <= 85.8567 )
								if( k <= 86.2313 )
									ret := 0.600000
								if( k > 86.2313 )
									ret := 0.043243
							if( smoothK_k > 85.8567 )
								if( smoothK_k <= 94.8939 )
									ret := -0.421538
								if( smoothK_k > 94.8939 )
									ret := -0.058252
						if( d > 81.2603 )
							if( k <= 87.742 )
								if( ema2 <= 14.3087 )
									ret := 0.634615
								if( ema2 > 14.3087 )
									ret := -0.084112
							if( k > 87.742 )
								if( d <= 88.4336 )
									ret := -0.099282
								if( d > 88.4336 )
									ret := 0.014147
			if( ema13 > 0.036101 )
				if( smoothD_d <= 96.7849 )
					if( rsi1 <= 84.488 )
						if( k <= 89.4484 )
							if( smoothK_k <= 83.8255 )
								if( d_k <= -0.4989 )
									ret := -0.374101
								if( d_k > -0.4989 )
									ret := -0.916667 // sell
							if( smoothK_k > 83.8255 )
								if( ema3 <= 10.2839 )
									ret := -0.807692 // sell
								if( ema3 > 10.2839 )
									ret := -0.962500 // sell
						if( k > 89.4484 )
							if( d_k <= -11.2367 )
								if( ema3 <= 15.9404 )
									ret := 0.065217
								if( ema3 > 15.9404 )
									ret := 0.769231 // buy
							if( d_k > -11.2367 )
								if( ema2 <= 15.6419 )
									ret := -0.271186
								if( ema2 > 15.6419 )
									ret := -0.557841
					if( rsi1 > 84.488 )
						if( k <= 97.0465 )
							if( rsi1 <= 90.3517 )
								if( ema3 <= 15.085 )
									ret := -0.150000
								if( ema3 > 15.085 )
									ret := 0.750000 // buy
							if( rsi1 > 90.3517 )
								if( smoothD_d <= 84.6685 )
									ret := -0.846154 // sell
								if( smoothD_d > 84.6685 )
									ret := 0.307692
						if( k > 97.0465 )
							if( d_k <= -0.1578 )
								if( tema <= 14.7794 )
									ret := -0.091429
								if( tema > 14.7794 )
									ret := -0.427778
							if( d_k > -0.1578 )
								if( ema1 <= 14.2166 )
									ret := 0.823529 // buy
								if( ema1 > 14.2166 )
									ret := 0.347826
				if( smoothD_d > 96.7849 )
					if( ema1 <= 9.39217 )
						if( ema3 <= 9.02396 )
							ret := -0.625000
						if( ema3 > 9.02396 )
							ret := -1.000000 // sell
					if( ema1 > 9.39217 )
						if( ema13 <= 0.054243 )
							if( rsi1 <= 79.6761 )
								ret := -0.700000 // sell
							if( rsi1 > 79.6761 )
								if( ema12 <= 0.031632 )
									ret := -0.310345
								if( ema12 > 0.031632 )
									ret := 0.272727
						if( ema13 > 0.054243 )
							if( ema12 <= 0.059471 )
								if( ema2 <= 15.3495 )
									ret := -0.416667
								if( ema2 > 15.3495 )
									ret := -0.809524 // sell
							if( ema12 > 0.059471 )
								ret := -1.000000 // sell
	if( d_k > 0.000213 )
		if( ema12 <= 0.006379 )
			if( smoothD_d <= -1.93609 )
				if( ema3 <= 9.09403 )
					if( ema12 <= -0.012302 )
						ret := 0.888889 // buy
					if( ema12 > -0.012302 )
						if( ema12 <= -0.006654 )
							ret := -0.777778 // sell
						if( ema12 > -0.006654 )
							ret := -0.210526
				if( ema3 > 9.09403 )
					if( ema1 <= 10.7004 )
						if( ema13 <= -0.014091 )
							if( ema12 <= -0.02314 )
								ret := 1.000000 // buy
							if( ema12 > -0.02314 )
								if( ema12 <= -0.014696 )
									ret := 0.500000
								if( ema12 > -0.014696 )
									ret := 0.823529 // buy
						if( ema13 > -0.014091 )
							if( rsi1 <= 34.3574 )
								ret := -0.454545
							if( rsi1 > 34.3574 )
								if( ema3 <= 9.75428 )
									ret := 0.880000 // buy
								if( ema3 > 9.75428 )
									ret := 0.466667
					if( ema1 > 10.7004 )
						if( rsi1 <= 31.2713 )
							if( rsi1 <= 27.8268 )
								if( ema13 <= -0.100695 )
									ret := 0.882353 // buy
								if( ema13 > -0.100695 )
									ret := 0.100000
							if( rsi1 > 27.8268 )
								if( ema1 <= 15.7876 )
									ret := -0.823529 // sell
								if( ema1 > 15.7876 )
									ret := -0.125000
						if( rsi1 > 31.2713 )
							if( smoothD_d <= -2.32753 )
								if( tema <= 15.3365 )
									ret := 0.521739
								if( tema > 15.3365 )
									ret := 0.965517 // buy
							if( smoothD_d > -2.32753 )
								if( tema <= 14.7391 )
									ret := -0.250000
								if( tema > 14.7391 )
									ret := 0.653846
			if( smoothD_d > -1.93609 )
				if( ema12 <= -0.01629 )
					if( smoothK_k <= 53.7169 )
						if( tema <= 13.7813 )
							if( ema2 <= 8.79492 )
								if( k <= 32.7979 )
									ret := 0.441667
								if( k > 32.7979 )
									ret := -0.333333
							if( ema2 > 8.79492 )
								if( d <= 65.0675 )
									ret := -0.143787
								if( d > 65.0675 )
									ret := 0.474576
						if( tema > 13.7813 )
							if( smoothD_d <= 63.0215 )
								if( ema3 <= 15.9774 )
									ret := 0.154749
								if( ema3 > 15.9774 )
									ret := -0.030422
							if( smoothD_d > 63.0215 )
								if( smoothK_k <= 49.7077 )
									ret := 0.727273 // buy
								if( smoothK_k > 49.7077 )
									ret := 0.947368 // buy
					if( smoothK_k > 53.7169 )
						if( ema3 <= 10.6992 )
							if( ema12 <= -0.017626 )
								if( smoothK_k <= 78.7582 )
									ret := -0.789474 // sell
								if( smoothK_k > 78.7582 )
									ret := -0.133333
							if( ema12 > -0.017626 )
								ret := 0.266667
						if( ema3 > 10.6992 )
							if( ema1 <= 15.9363 )
								if( smoothD_d <= 65.0192 )
									ret := -0.743590 // sell
								if( smoothD_d > 65.0192 )
									ret := 0.055556
							if( ema1 > 15.9363 )
								if( rsi1 <= 41.5234 )
									ret := -0.767442 // sell
								if( rsi1 > 41.5234 )
									ret := -0.350000
				if( ema12 > -0.01629 )
					if( k <= 14.2057 )
						if( k <= 12.5056 )
							if( ema13 <= 0.004933 )
								if( ema3 <= 8.54735 )
									ret := 0.515789
								if( ema3 > 8.54735 )
									ret := 0.085289
							if( ema13 > 0.004933 )
								if( ema12 <= 0.005103 )
									ret := -0.153285
								if( ema12 > 0.005103 )
									ret := 0.117117
						if( k > 12.5056 )
							if( ema12 <= -0.002004 )
								if( d <= 29.3782 )
									ret := -0.029520
								if( d > 29.3782 )
									ret := 0.347826
							if( ema12 > -0.002004 )
								if( d <= 24.6946 )
									ret := -0.611111
								if( d > 24.6946 )
									ret := -0.088235
					if( k > 14.2057 )
						if( tema <= 10.9063 )
							if( d_k <= 1.01545 )
								if( smoothK_k <= 13.7 )
									ret := -0.647059
								if( smoothK_k > 13.7 )
									ret := 0.019441
							if( d_k > 1.01545 )
								if( rsi1 <= 54.3079 )
									ret := 0.201990
								if( rsi1 > 54.3079 )
									ret := 0.098171
						if( tema > 10.9063 )
							if( ema2 <= 17.0318 )
								if( d <= 23.4907 )
									ret := 0.322738
								if( d > 23.4907 )
									ret := 0.064742
							if( ema2 > 17.0318 )
								if( ema3 <= 17.1214 )
									ret := -0.310345
								if( ema3 > 17.1214 )
									ret := -0.809524 // sell
		if( ema12 > 0.006379 )
			if( rsi1 <= 52.6125 )
				if( d <= 5.9664 )
					if( ema1 <= 16.0565 )
						if( smoothD_d <= 0.916928 )
							if( d_k <= 1.03277 )
								ret := 0.846154 // buy
							if( d_k > 1.03277 )
								ret := -0.272727
						if( smoothD_d > 0.916928 )
							if( ema1 <= 12.7348 )
								ret := 0.818182 // buy
							if( ema1 > 12.7348 )
								ret := 1.000000 // buy
					if( ema1 > 16.0565 )
						ret := 0.142857
				if( d > 5.9664 )
					if( k <= 22.3754 )
						if( smoothK_k <= 13.3156 )
							if( d_k <= 10.7261 )
								if( ema1 <= 15.219 )
									ret := -0.513514
								if( ema1 > 15.219 )
									ret := 0.075000
							if( d_k > 10.7261 )
								if( smoothK_k <= 11.1027 )
									ret := 0.211538
								if( smoothK_k > 11.1027 )
									ret := 0.833333 // buy
						if( smoothK_k > 13.3156 )
							if( ema13 <= 0.015656 )
								if( smoothD_d <= 28.7032 )
									ret := -0.600000
								if( smoothD_d > 28.7032 )
									ret := 0.571429
							if( ema13 > 0.015656 )
								if( d <= 27.7489 )
									ret := -0.406250
								if( d > 27.7489 )
									ret := -0.872340 // sell
					if( k > 22.3754 )
						if( k <= 49.7183 )
							if( rsi1 <= 50.5721 )
								if( ema13 <= 0.008808 )
									ret := -0.928571 // sell
								if( ema13 > 0.008808 )
									ret := 0.379085
							if( rsi1 > 50.5721 )
								if( smoothD_d <= 47.8786 )
									ret := 0.804878 // buy
								if( smoothD_d > 47.8786 )
									ret := 0.097561
						if( k > 49.7183 )
							if( ema13 <= 0.034268 )
								if( ema13 <= 0.030792 )
									ret := 0.085427
								if( ema13 > 0.030792 )
									ret := 0.857143 // buy
							if( ema13 > 0.034268 )
								if( d_k <= 14.3683 )
									ret := -1.000000 // sell
								if( d_k > 14.3683 )
									ret := 0.300000
			if( rsi1 > 52.6125 )
				if( ema13 <= -0.002408 )
					if( ema13 <= -0.005853 )
						ret := 1.000000 // buy
					if( ema13 > -0.005853 )
						ret := 0.666667
				if( ema13 > -0.002408 )
					if( ema3 <= 13.0091 )
						if( k <= 98.7734 )
							if( k <= 0.634945 )
								if( rsi1 <= 58.7934 )
									ret := 0.210526
								if( rsi1 > 58.7934 )
									ret := 0.780488 // buy
							if( k > 0.634945 )
								if( ema12 <= 0.026355 )
									ret := -0.016716
								if( ema12 > 0.026355 )
									ret := -0.189580
						if( k > 98.7734 )
							if( ema2 <= 10.5864 )
								if( smoothK_k <= 96.8778 )
									ret := 0.304348
								if( smoothK_k > 96.8778 )
									ret := -0.727273 // sell
							if( ema2 > 10.5864 )
								if( ema12 <= 0.027633 )
									ret := 0.548387
								if( ema12 > 0.027633 )
									ret := 1.000000 // buy
					if( ema3 > 13.0091 )
						if( ema13 <= 0.134139 )
							if( ema2 <= 13.0796 )
								ret := -0.958333 // sell
							if( ema2 > 13.0796 )
								if( k <= 96.155 )
									ret := -0.139018
								if( k > 96.155 )
									ret := 0.048137
						if( ema13 > 0.134139 )
							if( d <= 16.9919 )
								ret := -0.200000
							if( d > 16.9919 )
								if( d <= 80.5155 )
									ret := 0.875000 // buy
								if( d > 80.5155 )
									ret := 0.354167
	
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
float op_operation = decision_tree_0_SNAP_1Min_d6460bb8(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


