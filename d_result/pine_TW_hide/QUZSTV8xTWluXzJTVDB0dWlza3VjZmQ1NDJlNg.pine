//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AFRM_1Min_2ST0_cfd542e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2ST0_cfd542e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_cfd542e6(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 57.1256 )
		if( ema3 <= 28.9067 )
			if( k <= 72.2914 )
				if( ema12 <= -0.078931 )
					if( d_k <= 5.72703 )
						if( k <= 20.2602 )
							if( d <= 4.61175 )
								if( rsi1 <= 12.7525 )
									ret := 0.695652
								if( rsi1 > 12.7525 )
									ret := -0.044444
							if( d > 4.61175 )
								if( rsi1 <= 37.496 )
									ret := 0.603933
								if( rsi1 > 37.496 )
									ret := -0.500000
						if( k > 20.2602 )
							if( d <= 14.8724 )
								if( k <= 25.2491 )
									ret := 0.692308
								if( k > 25.2491 )
									ret := 0.916667 // buy
							if( d > 14.8724 )
								if( rsi1 <= 29.3385 )
									ret := 0.102041
								if( rsi1 > 29.3385 )
									ret := -0.328767
					if( d_k > 5.72703 )
						if( ema12 <= -0.203867 )
							if( ema2 <= 24.1477 )
								ret := -0.272727
							if( ema2 > 24.1477 )
								ret := 1.000000 // buy
						if( ema12 > -0.203867 )
							if( d <= 60.9327 )
								if( smoothK_k <= 11.3818 )
									ret := 0.026316
								if( smoothK_k > 11.3818 )
									ret := -0.535714
							if( d > 60.9327 )
								ret := 0.571429
				if( ema12 > -0.078931 )
					if( d <= 0.098192 )
						if( rsi1 <= 25.893 )
							if( ema12 <= -0.067732 )
								if( ema1 <= 27.9201 )
									ret := -0.916667 // sell
								if( ema1 > 27.9201 )
									ret := -1.000000 // sell
							if( ema12 > -0.067732 )
								ret := -0.545455
						if( rsi1 > 25.893 )
							if( ema3 <= 25.0132 )
								ret := -0.777778 // sell
							if( ema3 > 25.0132 )
								if( ema13 <= -0.001596 )
									ret := 0.529412
								if( ema13 > -0.001596 )
									ret := -0.454545
					if( d > 0.098192 )
						if( d_k <= -25.8295 )
							if( smoothD_d <= 31.0301 )
								ret := 1.000000 // buy
							if( smoothD_d > 31.0301 )
								if( ema3 <= 27.8065 )
									ret := 0.153846
								if( ema3 > 27.8065 )
									ret := 0.800000 // buy
						if( d_k > -25.8295 )
							if( ema2 <= 28.9102 )
								if( smoothK_k <= 27.3145 )
									ret := 0.083011
								if( smoothK_k > 27.3145 )
									ret := -0.028037
							if( ema2 > 28.9102 )
								ret := -0.909091 // sell
			if( k > 72.2914 )
				if( smoothK_k <= 75.5434 )
					if( d <= 56.7541 )
						if( ema1 <= 27.7485 )
							if( ema13 <= -0.081609 )
								if( d <= 49.9762 )
									ret := 1.000000 // buy
								if( d > 49.9762 )
									ret := 0.400000
							if( ema13 > -0.081609 )
								if( smoothD_d <= 47.5097 )
									ret := -0.466667
								if( smoothD_d > 47.5097 )
									ret := 0.076923
						if( ema1 > 27.7485 )
							if( tema <= 28.313 )
								ret := -0.888889 // sell
							if( tema > 28.313 )
								ret := -0.727273 // sell
					if( d > 56.7541 )
						if( ema2 <= 24.8201 )
							if( d <= 71.1907 )
								ret := -0.368421
							if( d > 71.1907 )
								if( d <= 75.6796 )
									ret := 0.076923
								if( d > 75.6796 )
									ret := 0.458333
						if( ema2 > 24.8201 )
							if( ema13 <= -0.096378 )
								ret := -0.153846
							if( ema13 > -0.096378 )
								if( ema2 <= 28.8144 )
									ret := 0.551829
								if( ema2 > 28.8144 )
									ret := -0.166667
				if( smoothK_k > 75.5434 )
					if( d_k <= 6.89752 )
						if( smoothD_d <= 96.0874 )
							if( ema13 <= 0.045793 )
								if( ema3 <= 26.6167 )
									ret := 0.210235
								if( ema3 > 26.6167 )
									ret := 0.053488
							if( ema13 > 0.045793 )
								if( tema <= 26.8965 )
									ret := 0.931034 // buy
								if( tema > 26.8965 )
									ret := 0.444444
						if( smoothD_d > 96.0874 )
							if( ema13 <= -0.02107 )
								if( rsi1 <= 45.8438 )
									ret := 0.545455
								if( rsi1 > 45.8438 )
									ret := 0.928571 // buy
							if( ema13 > -0.02107 )
								ret := 0.307692
					if( d_k > 6.89752 )
						if( ema13 <= -0.054583 )
							ret := -1.000000 // sell
						if( ema13 > -0.054583 )
							if( rsi1 <= 49.6964 )
								if( rsi1 <= 46.9102 )
									ret := 0.125000
								if( rsi1 > 46.9102 )
									ret := 0.700000 // buy
							if( rsi1 > 49.6964 )
								if( ema1 <= 24.9861 )
									ret := -1.000000 // sell
								if( ema1 > 24.9861 )
									ret := -0.184211
		if( ema3 > 28.9067 )
			if( ema2 <= 46.8022 )
				if( smoothK_k <= 15.8454 )
					if( smoothD_d <= -0.095151 )
						if( ema1 <= 35.6512 )
							if( ema2 <= 35.2404 )
								if( ema12 <= 0.025084 )
									ret := -0.009731
								if( ema12 > 0.025084 )
									ret := 0.672131
							if( ema2 > 35.2404 )
								if( ema12 <= -0.06112 )
									ret := -1.000000 // sell
								if( ema12 > -0.06112 )
									ret := -0.181818
						if( ema1 > 35.6512 )
							if( tema <= 38.0055 )
								if( ema13 <= -0.249512 )
									ret := -0.133333
								if( ema13 > -0.249512 )
									ret := 0.759398 // buy
							if( tema > 38.0055 )
								if( k <= 6.10555 )
									ret := 0.118956
								if( k > 6.10555 )
									ret := -0.425926
					if( smoothD_d > -0.095151 )
						if( ema13 <= -0.611805 )
							if( ema1 <= 35.4207 )
								if( ema12 <= -0.39834 )
									ret := -1.000000 // sell
								if( ema12 > -0.39834 )
									ret := -0.666667
							if( ema1 > 35.4207 )
								ret := -0.500000
						if( ema13 > -0.611805 )
							if( ema12 <= -0.11587 )
								if( k <= 0.942244 )
									ret := -0.401709
								if( k > 0.942244 )
									ret := 0.140224
							if( ema12 > -0.11587 )
								if( ema3 <= 40.256 )
									ret := -0.029199
								if( ema3 > 40.256 )
									ret := -0.160924
				if( smoothK_k > 15.8454 )
					if( ema12 <= -0.036087 )
						if( smoothD_d <= 19.4332 )
							if( rsi1 <= 47.0999 )
								if( ema2 <= 33.5047 )
									ret := 0.174691
								if( ema2 > 33.5047 )
									ret := -0.102305
							if( rsi1 > 47.0999 )
								if( ema12 <= -0.040644 )
									ret := -0.851852 // sell
								if( ema12 > -0.040644 )
									ret := -0.090909
						if( smoothD_d > 19.4332 )
							if( d <= 98.4191 )
								if( tema <= 30.6942 )
									ret := 0.241528
								if( tema > 30.6942 )
									ret := 0.141197
							if( d > 98.4191 )
								if( d <= 99.0992 )
									ret := -0.826087 // sell
								if( d > 99.0992 )
									ret := 0.000000
					if( ema12 > -0.036087 )
						if( rsi1 <= 46.0964 )
							if( tema <= 30.9393 )
								if( ema13 <= -0.047821 )
									ret := 0.023838
								if( ema13 > -0.047821 )
									ret := 0.195416
							if( tema > 30.9393 )
								if( tema <= 40.8037 )
									ret := -0.042987
								if( tema > 40.8037 )
									ret := 0.130682
						if( rsi1 > 46.0964 )
							if( tema <= 30.5099 )
								if( ema3 <= 30.2853 )
									ret := -0.079607
								if( ema3 > 30.2853 )
									ret := -0.258189
							if( tema > 30.5099 )
								if( smoothK_k <= 85.599 )
									ret := 0.033926
								if( smoothK_k > 85.599 )
									ret := -0.097305
			if( ema2 > 46.8022 )
				if( smoothD_d <= 92.8019 )
					if( tema <= 46.7653 )
						if( ema12 <= -0.155493 )
							if( ema1 <= 46.8754 )
								ret := 1.000000 // buy
							if( ema1 > 46.8754 )
								ret := 0.636364
						if( ema12 > -0.155493 )
							if( ema12 <= -0.093332 )
								ret := -0.111111
							if( ema12 > -0.093332 )
								ret := 0.222222
					if( tema > 46.7653 )
						if( d <= 37.5142 )
							if( ema3 <= 48.9079 )
								if( rsi1 <= 31.9328 )
									ret := -0.600000
								if( rsi1 > 31.9328 )
									ret := -0.337748
							if( ema3 > 48.9079 )
								if( smoothD_d <= 1.32216 )
									ret := -0.714286 // sell
								if( smoothD_d > 1.32216 )
									ret := 0.250000
						if( d > 37.5142 )
							if( smoothD_d <= 35.3479 )
								ret := 0.750000 // buy
							if( smoothD_d > 35.3479 )
								if( ema2 <= 48.8602 )
									ret := -0.191388
								if( ema2 > 48.8602 )
									ret := 0.290909
				if( smoothD_d > 92.8019 )
					if( ema3 <= 46.99 )
						ret := -1.000000 // sell
					if( ema3 > 46.99 )
						ret := -0.500000
	if( rsi1 > 57.1256 )
		if( d_k <= 2.48057 )
			if( ema13 <= 0.285243 )
				if( rsi1 <= 71.7326 )
					if( ema1 <= 36.5716 )
						if( d_k <= -24.4641 )
							if( k <= 96.401 )
								if( k <= 91.0096 )
									ret := -0.342105
								if( k > 91.0096 )
									ret := -0.770833 // sell
							if( k > 96.401 )
								if( rsi1 <= 62.7402 )
									ret := 0.521739
								if( rsi1 > 62.7402 )
									ret := -0.727273 // sell
						if( d_k > -24.4641 )
							if( ema12 <= 0.034247 )
								if( ema1 <= 24.0483 )
									ret := -1.000000 // sell
								if( ema1 > 24.0483 )
									ret := -0.039521
							if( ema12 > 0.034247 )
								if( ema3 <= 24.0717 )
									ret := 0.704918 // buy
								if( ema3 > 24.0717 )
									ret := -0.163438
					if( ema1 > 36.5716 )
						if( d <= 19.8112 )
							if( ema1 <= 38.9725 )
								if( d <= 8.99256 )
									ret := 0.685714
								if( d > 8.99256 )
									ret := -0.312500
							if( ema1 > 38.9725 )
								if( rsi1 <= 57.8296 )
									ret := -0.062500
								if( rsi1 > 57.8296 )
									ret := -0.586466
						if( d > 19.8112 )
							if( ema2 <= 40.4974 )
								if( k <= 99.9781 )
									ret := 0.197959
								if( k > 99.9781 )
									ret := -0.208791
							if( ema2 > 40.4974 )
								if( ema2 <= 44.9337 )
									ret := -0.014021
								if( ema2 > 44.9337 )
									ret := 0.224771
				if( rsi1 > 71.7326 )
					if( d <= 69.8098 )
						if( k <= 7.66879 )
							ret := -0.937500 // sell
						if( k > 7.66879 )
							if( rsi1 <= 76.9006 )
								if( smoothD_d <= 51.0952 )
									ret := -0.109966
								if( smoothD_d > 51.0952 )
									ret := 0.267241
							if( rsi1 > 76.9006 )
								if( d <= 56.5076 )
									ret := 0.020725
								if( d > 56.5076 )
									ret := -0.407895
					if( d > 69.8098 )
						if( ema1 <= 24.5321 )
							if( tema <= 24.5041 )
								if( d_k <= -3.18613 )
									ret := -0.285714
								if( d_k > -3.18613 )
									ret := 0.176471
							if( tema > 24.5041 )
								if( k <= 98.9477 )
									ret := 0.000000
								if( k > 98.9477 )
									ret := 0.846154 // buy
						if( ema1 > 24.5321 )
							if( ema13 <= 0.108454 )
								if( tema <= 24.624 )
									ret := -1.000000 // sell
								if( tema > 24.624 )
									ret := -0.129262
							if( ema13 > 0.108454 )
								if( smoothK_k <= 77.3965 )
									ret := 0.091954
								if( smoothK_k > 77.3965 )
									ret := -0.304016
			if( ema13 > 0.285243 )
				if( ema1 <= 33.2698 )
					if( rsi1 <= 63.9365 )
						if( k <= 5.05885 )
							ret := -1.000000 // sell
						if( k > 5.05885 )
							ret := 0.000000
					if( rsi1 > 63.9365 )
						if( tema <= 31.5804 )
							if( smoothD_d <= 94.833 )
								if( d_k <= -1.84299 )
									ret := -0.459459
								if( d_k > -1.84299 )
									ret := 0.517857
							if( smoothD_d > 94.833 )
								if( smoothD_d <= 96.9126 )
									ret := 0.447368
								if( smoothD_d > 96.9126 )
									ret := 1.000000 // buy
						if( tema > 31.5804 )
							if( tema <= 32.7687 )
								if( ema12 <= 0.340203 )
									ret := 0.906250 // buy
								if( ema12 > 0.340203 )
									ret := 0.200000
							if( tema > 32.7687 )
								if( k <= 94.9201 )
									ret := 0.226190
								if( k > 94.9201 )
									ret := 0.973684 // buy
				if( ema1 > 33.2698 )
					if( ema3 <= 35.9716 )
						if( d <= 83.6341 )
							if( ema2 <= 34.7818 )
								if( smoothD_d <= 47.9037 )
									ret := -0.200000
								if( smoothD_d > 47.9037 )
									ret := 0.806452 // buy
							if( ema2 > 34.7818 )
								if( smoothD_d <= 57.8523 )
									ret := -1.000000 // sell
								if( smoothD_d > 57.8523 )
									ret := -0.350000
						if( d > 83.6341 )
							if( d_k <= -6.56959 )
								ret := 0.300000
							if( d_k > -6.56959 )
								if( smoothD_d <= 86.9994 )
									ret := -0.611111
								if( smoothD_d > 86.9994 )
									ret := -0.926316 // sell
					if( ema3 > 35.9716 )
						if( ema3 <= 36.414 )
							if( ema2 <= 36.4738 )
								ret := 0.750000 // buy
							if( ema2 > 36.4738 )
								ret := 1.000000 // buy
						if( ema3 > 36.414 )
							if( d <= 99.1121 )
								if( rsi1 <= 83.3845 )
									ret := -0.149682
								if( rsi1 > 83.3845 )
									ret := 0.406250
							if( d > 99.1121 )
								if( d <= 99.7204 )
									ret := -0.515152
								if( d > 99.7204 )
									ret := -0.923077 // sell
		if( d_k > 2.48057 )
			if( ema3 <= 28.0548 )
				if( k <= 84.7705 )
					if( ema2 <= 25.5888 )
						if( ema12 <= 0.068507 )
							if( k <= 21.5685 )
								if( smoothK_k <= 5.34678 )
									ret := 0.133333
								if( smoothK_k > 5.34678 )
									ret := -0.368421
							if( k > 21.5685 )
								if( d <= 48.9378 )
									ret := 0.745098 // buy
								if( d > 48.9378 )
									ret := 0.324675
						if( ema12 > 0.068507 )
							if( ema2 <= 24.3372 )
								if( d <= 58.3146 )
									ret := -0.833333 // sell
								if( d > 58.3146 )
									ret := 0.500000
							if( ema2 > 24.3372 )
								if( ema3 <= 25.0546 )
									ret := -0.509091
								if( ema3 > 25.0546 )
									ret := -1.000000 // sell
					if( ema2 > 25.5888 )
						if( ema12 <= 0.130624 )
							if( smoothK_k <= 70.7245 )
								if( d_k <= 5.27465 )
									ret := 0.000000
								if( d_k > 5.27465 )
									ret := -0.385675
							if( smoothK_k > 70.7245 )
								if( ema13 <= 0.161074 )
									ret := -0.110236
								if( ema13 > 0.161074 )
									ret := 0.764706 // buy
						if( ema12 > 0.130624 )
							if( smoothK_k <= 77.1097 )
								ret := -0.312500
							if( smoothK_k > 77.1097 )
								ret := 0.941176 // buy
				if( k > 84.7705 )
					if( ema12 <= 0.020873 )
						if( d <= 93.0079 )
							ret := -0.411765
						if( d > 93.0079 )
							if( rsi1 <= 63.7668 )
								if( ema3 <= 24.7492 )
									ret := -1.000000 // sell
								if( ema3 > 24.7492 )
									ret := -0.935484 // sell
							if( rsi1 > 63.7668 )
								ret := -0.533333
					if( ema12 > 0.020873 )
						if( rsi1 <= 61.2502 )
							if( d <= 94.303 )
								ret := -0.909091 // sell
							if( d > 94.303 )
								ret := -1.000000 // sell
						if( rsi1 > 61.2502 )
							if( rsi1 <= 74.8041 )
								if( ema13 <= 0.045606 )
									ret := 0.947368 // buy
								if( ema13 > 0.045606 )
									ret := 0.074468
							if( rsi1 > 74.8041 )
								if( smoothD_d <= 90.8496 )
									ret := -0.767442 // sell
								if( smoothD_d > 90.8496 )
									ret := -0.437500
			if( ema3 > 28.0548 )
				if( ema13 <= 0.128896 )
					if( tema <= 28.2983 )
						if( smoothD_d <= 70.091 )
							ret := 0.000000
						if( smoothD_d > 70.091 )
							if( smoothK_k <= 63.4159 )
								ret := 1.000000 // buy
							if( smoothK_k > 63.4159 )
								if( d_k <= 4.76812 )
									ret := 0.750000 // buy
								if( d_k > 4.76812 )
									ret := 0.250000
					if( tema > 28.2983 )
						if( k <= 7.24791 )
							if( d <= 11.2865 )
								if( smoothK_k <= -1.05482 )
									ret := -0.228571
								if( smoothK_k > -1.05482 )
									ret := 0.600000
							if( d > 11.2865 )
								if( ema1 <= 30.3077 )
									ret := 0.000000
								if( ema1 > 30.3077 )
									ret := -0.463918
						if( k > 7.24791 )
							if( rsi1 <= 58.0475 )
								if( ema1 <= 31.4676 )
									ret := -0.414894
								if( ema1 > 31.4676 )
									ret := -0.044776
							if( rsi1 > 58.0475 )
								if( ema2 <= 45.1693 )
									ret := -0.011377
								if( ema2 > 45.1693 )
									ret := 0.201754
				if( ema13 > 0.128896 )
					if( tema <= 33.8268 )
						if( k <= 17.4325 )
							if( rsi1 <= 63.2298 )
								if( d_k <= 9.04813 )
									ret := -0.285714
								if( d_k > 9.04813 )
									ret := -0.872340 // sell
							if( rsi1 > 63.2298 )
								if( ema12 <= 0.124942 )
									ret := -0.195122
								if( ema12 > 0.124942 )
									ret := 0.772727 // buy
						if( k > 17.4325 )
							if( tema <= 32.565 )
								if( smoothD_d <= 46.7419 )
									ret := 0.676923
								if( smoothD_d > 46.7419 )
									ret := 0.090090
							if( tema > 32.565 )
								if( ema3 <= 33.0933 )
									ret := 0.639130
								if( ema3 > 33.0933 )
									ret := 0.169231
					if( tema > 33.8268 )
						if( ema12 <= 0.176063 )
							if( ema2 <= 45.4552 )
								if( ema2 <= 44.3196 )
									ret := 0.075117
								if( ema2 > 44.3196 )
									ret := -0.312821
							if( ema2 > 45.4552 )
								if( smoothD_d <= 85.2875 )
									ret := 0.515957
								if( smoothD_d > 85.2875 )
									ret := -0.343750
						if( ema12 > 0.176063 )
							if( d_k <= 6.96506 )
								if( rsi1 <= 73.8869 )
									ret := -0.514286
								if( rsi1 > 73.8869 )
									ret := 0.333333
							if( d_k > 6.96506 )
								if( ema3 <= 45.0638 )
									ret := -0.851064 // sell
								if( ema3 > 45.0638 )
									ret := 0.076923
	
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
float op_operation = decision_tree_0_AFRM_1Min_cfd542e6(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


