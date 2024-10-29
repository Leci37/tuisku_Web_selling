//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: SOLUSDT_30Min_2ST0_9c6b8948 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2ST0_9c6b8948", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_9c6b8948(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_k <= 0.025426 )
		if( d <= 13.3482 )
			if( smoothD_d <= 1.99108 )
				if( ema2 <= 3.32844 )
					if( rsi1 <= 24.5489 )
						if( k <= 7.93281 )
							if( smoothD_d <= 0.00163 )
								if( ema13 <= -0.020603 )
									ret := 0.713043 // buy
								if( ema13 > -0.020603 )
									ret := -0.250000
							if( smoothD_d > 0.00163 )
								if( rsi1 <= 18.8331 )
									ret := -0.600000
								if( rsi1 > 18.8331 )
									ret := 0.500000
						if( k > 7.93281 )
							ret := -0.636364
					if( rsi1 > 24.5489 )
						if( d_k <= -2.90512 )
							if( ema13 <= 0.004155 )
								if( ema2 <= 1.71152 )
									ret := 0.920000 // buy
								if( ema2 > 1.71152 )
									ret := 0.538462
							if( ema13 > 0.004155 )
								ret := -0.583333
						if( d_k > -2.90512 )
							if( k <= 4.41055 )
								if( ema3 <= 2.11927 )
									ret := 0.513514
								if( ema3 > 2.11927 )
									ret := -0.527473
							if( k > 4.41055 )
								if( ema2 <= 2.77535 )
									ret := -0.769231 // sell
								if( ema2 > 2.77535 )
									ret := -0.384615
				if( ema2 > 3.32844 )
					if( d <= 1.10018 )
						if( d_k <= 0.017757 )
							if( ema12 <= -0.065841 )
								if( rsi1 <= 24.6545 )
									ret := -0.891616 // sell
								if( rsi1 > 24.6545 )
									ret := -0.548872
							if( ema12 > -0.065841 )
								if( ema13 <= 0.432542 )
									ret := -0.668367
								if( ema13 > 0.432542 )
									ret := -0.454955
						if( d_k > 0.017757 )
							ret := -0.090909
					if( d > 1.10018 )
						if( ema1 <= 53.5943 )
							if( ema1 <= 48.0682 )
								if( rsi1 <= 41.6536 )
									ret := -0.540791
								if( rsi1 > 41.6536 )
									ret := -0.037037
							if( ema1 > 48.0682 )
								if( d_k <= -1.71144 )
									ret := -0.166667
								if( d_k > -1.71144 )
									ret := 0.750000 // buy
						if( ema1 > 53.5943 )
							if( tema <= 175.774 )
								if( ema12 <= -0.115655 )
									ret := -0.666667
								if( ema12 > -0.115655 )
									ret := -0.490300
							if( tema > 175.774 )
								if( tema <= 183.788 )
									ret := 0.102041
								if( tema > 183.788 )
									ret := -0.428571
			if( smoothD_d > 1.99108 )
				if( ema12 <= 0.124976 )
					if( rsi1 <= 31.7958 )
						if( ema13 <= -0.440196 )
							if( rsi1 <= 16.1403 )
								if( d_k <= -3.89013 )
									ret := -0.500000
								if( d_k > -3.89013 )
									ret := -0.866667 // sell
							if( rsi1 > 16.1403 )
								if( d_k <= -8.41524 )
									ret := -0.141593
								if( d_k > -8.41524 )
									ret := -0.432304
						if( ema13 > -0.440196 )
							if( tema <= 16.2217 )
								if( ema12 <= -0.018521 )
									ret := 0.100000
								if( ema12 > -0.018521 )
									ret := -0.684211
							if( tema > 16.2217 )
								if( smoothD_d <= 9.25969 )
									ret := -0.567677
								if( smoothD_d > 9.25969 )
									ret := -0.025641
					if( rsi1 > 31.7958 )
						if( ema12 <= -0.030639 )
							if( ema3 <= 53.5753 )
								if( k <= 14.1814 )
									ret := 0.132212
								if( k > 14.1814 )
									ret := 0.516605
							if( ema3 > 53.5753 )
								if( rsi1 <= 37.914 )
									ret := -0.291581
								if( rsi1 > 37.914 )
									ret := 0.272349
						if( ema12 > -0.030639 )
							if( ema13 <= 0.13283 )
								if( ema2 <= 2.25113 )
									ret := 0.263158
								if( ema2 > 2.25113 )
									ret := -0.244338
							if( ema13 > 0.13283 )
								if( ema3 <= 104.76 )
									ret := 0.329759
								if( ema3 > 104.76 )
									ret := -0.360465
				if( ema12 > 0.124976 )
					if( tema <= 65.2035 )
						if( smoothK_k <= 10.4708 )
							if( tema <= 49.9481 )
								if( ema3 <= 19.7859 )
									ret := -0.909091 // sell
								if( ema3 > 19.7859 )
									ret := -0.214286
							if( tema > 49.9481 )
								if( ema13 <= 1.34027 )
									ret := -0.200000
								if( ema13 > 1.34027 )
									ret := 0.812500 // buy
						if( smoothK_k > 10.4708 )
							if( d <= 10.8211 )
								if( rsi1 <= 54.5438 )
									ret := -0.769231 // sell
								if( rsi1 > 54.5438 )
									ret := 0.744186 // buy
							if( d > 10.8211 )
								if( rsi1 <= 61.2857 )
									ret := -0.459459
								if( rsi1 > 61.2857 )
									ret := 0.478261
					if( tema > 65.2035 )
						if( d <= 8.37929 )
							if( ema13 <= 1.15722 )
								if( smoothD_d <= 4.06522 )
									ret := -0.530864
								if( smoothD_d > 4.06522 )
									ret := -0.809524 // sell
							if( ema13 > 1.15722 )
								if( ema3 <= 178.568 )
									ret := -0.267327
								if( ema3 > 178.568 )
									ret := -0.604651
						if( d > 8.37929 )
							if( ema1 <= 203.431 )
								if( rsi1 <= 52.4966 )
									ret := -0.605263
								if( rsi1 > 52.4966 )
									ret := 0.266667
							if( ema1 > 203.431 )
								ret := 0.500000
		if( d > 13.3482 )
			if( rsi1 <= 56.0335 )
				if( ema13 <= -0.041163 )
					if( k <= 55.2542 )
						if( ema12 <= -0.150951 )
							if( d_k <= -7.22877 )
								if( ema2 <= 53.8801 )
									ret := 0.491970
								if( ema2 > 53.8801 )
									ret := 0.197592
							if( d_k > -7.22877 )
								if( ema13 <= -0.920769 )
									ret := -0.142857
								if( ema13 > -0.920769 )
									ret := 0.121841
						if( ema12 > -0.150951 )
							if( ema3 <= 15.2668 )
								if( d <= 13.7418 )
									ret := -0.323529
								if( d > 13.7418 )
									ret := 0.191932
							if( ema3 > 15.2668 )
								if( rsi1 <= 43.9378 )
									ret := -0.377445
								if( rsi1 > 43.9378 )
									ret := 0.321951
					if( k > 55.2542 )
						if( rsi1 <= 39.5656 )
							if( d_k <= -16.4681 )
								if( ema1 <= 135.256 )
									ret := 0.470588
								if( ema1 > 135.256 )
									ret := -0.007752
							if( d_k > -16.4681 )
								if( rsi1 <= 34.3651 )
									ret := -0.388664
								if( rsi1 > 34.3651 )
									ret := -0.039894
						if( rsi1 > 39.5656 )
							if( rsi1 <= 45.6037 )
								if( d <= 38.9647 )
									ret := 0.654762
								if( d > 38.9647 )
									ret := 0.224077
							if( rsi1 > 45.6037 )
								if( ema13 <= -0.215741 )
									ret := 0.515925
								if( ema13 > -0.215741 )
									ret := 0.157618
				if( ema13 > -0.041163 )
					if( ema13 <= 0.142355 )
						if( smoothD_d <= 40.8222 )
							if( ema3 <= 2.3943 )
								if( smoothD_d <= 12.7662 )
									ret := 0.422222
								if( smoothD_d > 12.7662 )
									ret := -0.202532
							if( ema3 > 2.3943 )
								if( k <= 21.6465 )
									ret := -0.169014
								if( k > 21.6465 )
									ret := 0.138000
						if( smoothD_d > 40.8222 )
							if( ema3 <= 22.4093 )
								if( d <= 76.8006 )
									ret := -0.184685
								if( d > 76.8006 )
									ret := 0.164147
							if( ema3 > 22.4093 )
								if( d_k <= -7.73377 )
									ret := -0.072072
								if( d_k > -7.73377 )
									ret := -0.502024
					if( ema13 > 0.142355 )
						if( k <= 43.3402 )
							if( ema2 <= 97.8475 )
								if( k <= 16.1206 )
									ret := 0.857143 // buy
								if( k > 16.1206 )
									ret := -0.003390
							if( ema2 > 97.8475 )
								if( rsi1 <= 48.1247 )
									ret := -0.627907
								if( rsi1 > 48.1247 )
									ret := -0.086420
						if( k > 43.3402 )
							if( d <= 35.5228 )
								if( ema1 <= 35.2555 )
									ret := 0.769231 // buy
								if( ema1 > 35.2555 )
									ret := 0.000000
							if( d > 35.5228 )
								if( rsi1 <= 53.4245 )
									ret := -0.714286 // sell
								if( rsi1 > 53.4245 )
									ret := -0.357955
			if( rsi1 > 56.0335 )
				if( ema1 <= 3.91692 )
					if( tema <= 3.19811 )
						if( ema12 <= 0.010827 )
							if( ema3 <= 1.73546 )
								if( d_k <= -15.0354 )
									ret := 0.709677 // buy
								if( d_k > -15.0354 )
									ret := -0.430464
							if( ema3 > 1.73546 )
								if( smoothD_d <= 20.2929 )
									ret := -0.869565 // sell
								if( smoothD_d > 20.2929 )
									ret := 0.290520
						if( ema12 > 0.010827 )
							if( smoothK_k <= 80.6461 )
								if( ema13 <= 0.01849 )
									ret := 0.285714
								if( ema13 > 0.01849 )
									ret := -0.496552
							if( smoothK_k > 80.6461 )
								if( rsi1 <= 63.2016 )
									ret := 0.495495
								if( rsi1 > 63.2016 )
									ret := -0.037293
					if( tema > 3.19811 )
						if( ema12 <= 0.047758 )
							if( k <= 97.7772 )
								if( ema2 <= 3.48845 )
									ret := -0.448000
								if( ema2 > 3.48845 )
									ret := -0.031250
							if( k > 97.7772 )
								if( tema <= 3.58162 )
									ret := 0.655172
								if( tema > 3.58162 )
									ret := -0.100000
						if( ema12 > 0.047758 )
							if( smoothK_k <= 93.1141 )
								if( k <= 87.3612 )
									ret := -0.627907
								if( k > 87.3612 )
									ret := -1.000000 // sell
							if( smoothK_k > 93.1141 )
								if( smoothD_d <= 91.0768 )
									ret := 0.400000
								if( smoothD_d > 91.0768 )
									ret := -0.909091 // sell
				if( ema1 > 3.91692 )
					if( rsi1 <= 61.9656 )
						if( ema12 <= -0.026705 )
							if( ema12 <= -0.444315 )
								if( d <= 94.4425 )
									ret := 0.888199 // buy
								if( d > 94.4425 )
									ret := 0.761905 // buy
							if( ema12 > -0.444315 )
								if( d <= 95.5834 )
									ret := 0.685160
								if( d > 95.5834 )
									ret := 0.246269
						if( ema12 > -0.026705 )
							if( ema12 <= 0.155361 )
								if( d_k <= -1.60328 )
									ret := 0.442509
								if( d_k > -1.60328 )
									ret := 0.119617
							if( ema12 > 0.155361 )
								if( ema3 <= 34.772 )
									ret := -0.349693
								if( ema3 > 34.772 )
									ret := 0.159015
					if( rsi1 > 61.9656 )
						if( ema12 <= 0.958109 )
							if( smoothK_k <= 95.4481 )
								if( ema1 <= 26.8816 )
									ret := 0.544170
								if( ema1 > 26.8816 )
									ret := 0.707143 // buy
							if( smoothK_k > 95.4481 )
								if( ema13 <= 0.841323 )
									ret := 0.768095 // buy
								if( ema13 > 0.841323 )
									ret := 0.917582 // buy
						if( ema12 > 0.958109 )
							if( k <= 97.1322 )
								if( rsi1 <= 71.7189 )
									ret := 0.099196
								if( rsi1 > 71.7189 )
									ret := 0.634783
							if( k > 97.1322 )
								if( rsi1 <= 77.0192 )
									ret := 0.405405
								if( rsi1 > 77.0192 )
									ret := 0.836237 // buy
	if( d_k > 0.025426 )
		if( d_k <= 8.82678 )
			if( rsi1 <= 53.6942 )
				if( rsi1 <= 38.7777 )
					if( ema3 <= 8.23693 )
						if( ema1 <= 2.0265 )
							if( k <= 1.28184 )
								if( d <= 7.24783 )
									ret := 0.706667 // buy
								if( d > 7.24783 )
									ret := 0.272727
							if( k > 1.28184 )
								if( ema12 <= -0.024773 )
									ret := 0.425000
								if( ema12 > -0.024773 )
									ret := -0.088785
						if( ema1 > 2.0265 )
							if( ema12 <= -0.023065 )
								if( rsi1 <= 10.7864 )
									ret := 0.914286 // buy
								if( rsi1 > 10.7864 )
									ret := 0.149321
							if( ema12 > -0.023065 )
								if( smoothK_k <= -2.87709 )
									ret := 0.625000
								if( smoothK_k > -2.87709 )
									ret := -0.442748
					if( ema3 > 8.23693 )
						if( ema13 <= -7.6031 )
							ret := 0.384615
						if( ema13 > -7.6031 )
							if( k <= 5.92562 )
								if( d <= 1.26695 )
									ret := -0.868085 // sell
								if( d > 1.26695 )
									ret := -0.697338
							if( k > 5.92562 )
								if( ema3 <= 40.2921 )
									ret := -0.507345
								if( ema3 > 40.2921 )
									ret := -0.621341
				if( rsi1 > 38.7777 )
					if( ema12 <= 0.03717 )
						if( ema1 <= 3.02639 )
							if( rsi1 <= 48.6663 )
								if( smoothK_k <= 69.4398 )
									ret := 0.234192
								if( smoothK_k > 69.4398 )
									ret := 0.657609
							if( rsi1 > 48.6663 )
								if( smoothK_k <= 68.6112 )
									ret := -0.483516
								if( smoothK_k > 68.6112 )
									ret := 0.157303
						if( ema1 > 3.02639 )
							if( d_k <= 5.295 )
								if( smoothD_d <= 40.186 )
									ret := 0.089640
								if( smoothD_d > 40.186 )
									ret := -0.144590
							if( d_k > 5.295 )
								if( rsi1 <= 46.5692 )
									ret := -0.353733
								if( rsi1 > 46.5692 )
									ret := 0.034072
					if( ema12 > 0.03717 )
						if( ema1 <= 3.4803 )
							ret := 0.818182 // buy
						if( ema1 > 3.4803 )
							if( smoothD_d <= 79.0541 )
								if( ema13 <= 0.368576 )
									ret := -0.406066
								if( ema13 > 0.368576 )
									ret := -0.572177
							if( smoothD_d > 79.0541 )
								if( ema2 <= 68.9344 )
									ret := -0.840183 // sell
								if( ema2 > 68.9344 )
									ret := -0.610000
			if( rsi1 > 53.6942 )
				if( ema12 <= -0.007569 )
					if( ema2 <= 192.608 )
						if( ema3 <= 44.6296 )
							if( tema <= 34.2199 )
								if( ema3 <= 25.0183 )
									ret := 0.594521
								if( ema3 > 25.0183 )
									ret := 0.798450 // buy
							if( tema > 34.2199 )
								if( d_k <= 0.73902 )
									ret := -0.181818
								if( d_k > 0.73902 )
									ret := 0.548387
						if( ema3 > 44.6296 )
							if( ema13 <= -0.834457 )
								if( ema1 <= 189.674 )
									ret := 0.795455 // buy
								if( ema1 > 189.674 )
									ret := 0.333333
							if( ema13 > -0.834457 )
								if( tema <= 96.9827 )
									ret := 0.812183 // buy
								if( tema > 96.9827 )
									ret := 0.583569
					if( ema2 > 192.608 )
						ret := -0.466667
				if( ema12 > -0.007569 )
					if( d <= 94.945 )
						if( rsi1 <= 67.4709 )
							if( rsi1 <= 59.5058 )
								if( smoothK_k <= 86.565 )
									ret := -0.141137
								if( smoothK_k > 86.565 )
									ret := -0.603550
							if( rsi1 > 59.5058 )
								if( ema12 <= 0.294077 )
									ret := 0.187329
								if( ema12 > 0.294077 )
									ret := -0.062771
						if( rsi1 > 67.4709 )
							if( ema3 <= 13.5021 )
								if( ema2 <= 1.90088 )
									ret := 0.359477
								if( ema2 > 1.90088 )
									ret := 0.012195
							if( ema3 > 13.5021 )
								if( tema <= 198.538 )
									ret := 0.498611
								if( tema > 198.538 )
									ret := -0.266667
					if( d > 94.945 )
						if( ema12 <= 0.103013 )
							if( ema3 <= 8.88965 )
								if( d_k <= 4.69904 )
									ret := -0.161369
								if( d_k > 4.69904 )
									ret := 0.422535
							if( ema3 > 8.88965 )
								if( d <= 99.4742 )
									ret := 0.461818
								if( d > 99.4742 )
									ret := 0.916667 // buy
						if( ema12 > 0.103013 )
							if( ema13 <= -0.474689 )
								ret := -0.600000
							if( ema13 > -0.474689 )
								if( ema3 <= 47.5041 )
									ret := 0.464017
								if( ema3 > 47.5041 )
									ret := 0.634731
		if( d_k > 8.82678 )
			if( rsi1 <= 47.9558 )
				if( tema <= 8.22883 )
					if( k <= 0.034863 )
						if( rsi1 <= 42.2312 )
							if( d_k <= 20.0604 )
								if( tema <= 3.22886 )
									ret := 0.870968 // buy
								if( tema > 3.22886 )
									ret := 0.454545
							if( d_k > 20.0604 )
								ret := 0.545455
						if( rsi1 > 42.2312 )
							ret := -0.375000
					if( k > 0.034863 )
						if( ema12 <= -0.022758 )
							if( smoothD_d <= 59.4969 )
								if( rsi1 <= 16.7604 )
									ret := -0.250000
								if( rsi1 > 16.7604 )
									ret := 0.605536
							if( smoothD_d > 59.4969 )
								if( smoothD_d <= 65.5969 )
									ret := -1.000000 // sell
								if( smoothD_d > 65.5969 )
									ret := 0.200000
						if( ema12 > -0.022758 )
							if( d_k <= 13.4014 )
								if( ema3 <= 1.99981 )
									ret := -0.141791
								if( ema3 > 1.99981 )
									ret := -0.568075
							if( d_k > 13.4014 )
								if( k <= 3.08915 )
									ret := -0.794872 // sell
								if( k > 3.08915 )
									ret := 0.026490
				if( tema > 8.22883 )
					if( ema12 <= 0.04209 )
						if( k <= 57.4997 )
							if( tema <= 15.3257 )
								if( ema13 <= -0.350034 )
									ret := 0.454545
								if( ema13 > -0.350034 )
									ret := -0.777953 // sell
							if( tema > 15.3257 )
								if( ema1 <= 23.3099 )
									ret := -0.345052
								if( ema1 > 23.3099 )
									ret := -0.643009
						if( k > 57.4997 )
							if( ema13 <= -1.25321 )
								if( ema2 <= 98.3347 )
									ret := 0.645161
								if( ema2 > 98.3347 )
									ret := -0.104762
							if( ema13 > -1.25321 )
								if( ema2 <= 119.234 )
									ret := -0.542683
								if( ema2 > 119.234 )
									ret := -0.083333
					if( ema12 > 0.04209 )
						if( ema3 <= 56.7166 )
							if( ema1 <= 28.4822 )
								if( d <= 10.332 )
									ret := 0.250000
								if( d > 10.332 )
									ret := -0.715447 // sell
							if( ema1 > 28.4822 )
								if( smoothK_k <= -2.99806 )
									ret := -0.657895
								if( smoothK_k > -2.99806 )
									ret := -0.898760 // sell
						if( ema3 > 56.7166 )
							if( ema13 <= 0.574598 )
								if( tema <= 66.1159 )
									ret := -0.031250
								if( tema > 66.1159 )
									ret := -0.620370
							if( ema13 > 0.574598 )
								if( ema1 <= 160.523 )
									ret := -0.639344
								if( ema1 > 160.523 )
									ret := -0.802326 // sell
			if( rsi1 > 47.9558 )
				if( rsi1 <= 66.249 )
					if( ema1 <= 198.847 )
						if( ema1 <= 4.46813 )
							if( ema3 <= 1.33318 )
								ret := 0.937500 // buy
							if( ema3 > 1.33318 )
								if( smoothK_k <= 24.4111 )
									ret := 0.134111
								if( smoothK_k > 24.4111 )
									ret := -0.152429
						if( ema1 > 4.46813 )
							if( ema12 <= 0.111859 )
								if( ema12 <= -0.003875 )
									ret := 0.429395
								if( ema12 > -0.003875 )
									ret := -0.003837
							if( ema12 > 0.111859 )
								if( ema2 <= 57.2728 )
									ret := -0.534620
								if( ema2 > 57.2728 )
									ret := -0.232283
					if( ema1 > 198.847 )
						if( ema3 <= 242.614 )
							if( smoothD_d <= 37.7569 )
								if( smoothK_k <= 10.3336 )
									ret := -0.076923
								if( smoothK_k > 10.3336 )
									ret := -0.714286 // sell
							if( smoothD_d > 37.7569 )
								if( rsi1 <= 58.407 )
									ret := -0.948276 // sell
								if( rsi1 > 58.407 )
									ret := -0.736842 // sell
						if( ema3 > 242.614 )
							if( tema <= 252.563 )
								ret := -0.153846
							if( tema > 252.563 )
								ret := -0.266667
				if( rsi1 > 66.249 )
					if( ema12 <= 1.03047 )
						if( ema1 <= 19.2573 )
							if( rsi1 <= 66.5436 )
								ret := 0.769231 // buy
							if( rsi1 > 66.5436 )
								if( ema3 <= 2.15039 )
									ret := 0.365854
								if( ema3 > 2.15039 )
									ret := -0.390029
						if( ema1 > 19.2573 )
							if( ema1 <= 46.5828 )
								if( tema <= 30.1979 )
									ret := 0.398119
								if( tema > 30.1979 )
									ret := 0.038835
							if( ema1 > 46.5828 )
								if( smoothK_k <= 44.0071 )
									ret := 0.218750
								if( smoothK_k > 44.0071 )
									ret := 0.677083
					if( ema12 > 1.03047 )
						if( tema <= 129.83 )
							if( smoothD_d <= 82.1088 )
								if( rsi1 <= 72.4011 )
									ret := -0.783582 // sell
								if( rsi1 > 72.4011 )
									ret := 0.088889
							if( smoothD_d > 82.1088 )
								ret := 0.142857
						if( tema > 129.83 )
							if( smoothD_d <= 44.7453 )
								if( ema2 <= 179.283 )
									ret := 0.355556
								if( ema2 > 179.283 )
									ret := 0.807692 // buy
							if( smoothD_d > 44.7453 )
								if( ema1 <= 133.748 )
									ret := 0.850000 // buy
								if( ema1 > 133.748 )
									ret := -0.292994
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_9c6b8948(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


