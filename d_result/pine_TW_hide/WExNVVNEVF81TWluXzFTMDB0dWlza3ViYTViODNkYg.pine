//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: XLMUSDT_5Min_1S00_ba5b83db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_5Min_1S00_ba5b83db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_5Min_ba5b83db(smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 13.3777 )
		if( smoothK_k <= 0.208435 )
			if( smoothK_k <= -2.96057 )
				if( smoothD_d <= 0.101458 )
					if( smoothD_d <= -0.30941 )
						if( rsi1 <= 29.9924 )
							if( smoothD_d <= -2.83625 )
								if( rsi1 <= 8.40188 )
									ret := -0.858696 // sell
								if( rsi1 > 8.40188 )
									ret := -0.646093
							if( smoothD_d > -2.83625 )
								if( smoothD_d <= -2.11795 )
									ret := -0.355263
								if( smoothD_d > -2.11795 )
									ret := -0.649165
						if( rsi1 > 29.9924 )
							if( rsi1 <= 36.7544 )
								if( rsi1 <= 34.5841 )
									ret := -0.386824
								if( rsi1 > 34.5841 )
									ret := -0.633333
							if( rsi1 > 36.7544 )
								if( smoothD_d <= -0.885004 )
									ret := -0.372385
								if( smoothD_d > -0.885004 )
									ret := -0.074074
					if( smoothD_d > -0.30941 )
						if( d <= 2.75085 )
							if( d <= 2.71059 )
								ret := -0.666667
							if( d > 2.71059 )
								ret := -1.000000 // sell
						if( d > 2.75085 )
							if( smoothD_d <= -0.220478 )
								if( d_k <= 2.77639 )
									ret := -0.578947
								if( d_k > 2.77639 )
									ret := -0.153846
							if( smoothD_d > -0.220478 )
								if( d <= 3.07266 )
									ret := -0.718876 // sell
								if( d > 3.07266 )
									ret := -0.939394 // sell
				if( smoothD_d > 0.101458 )
					if( d <= 5.9699 )
						if( d <= 5.38526 )
							if( d_k <= 4.40686 )
								if( smoothD_d <= 1.39827 )
									ret := -0.368495
								if( smoothD_d > 1.39827 )
									ret := 0.466667
							if( d_k > 4.40686 )
								if( rsi1 <= 32.6842 )
									ret := -0.708333 // sell
								if( rsi1 > 32.6842 )
									ret := -0.348178
						if( d > 5.38526 )
							if( d_k <= 5.43299 )
								ret := 0.300000
							if( d_k > 5.43299 )
								if( d_k <= 5.94986 )
									ret := -0.326531
								if( d_k > 5.94986 )
									ret := 0.055556
					if( d > 5.9699 )
						if( k <= 0.0011 )
							if( smoothD_d <= 11.6593 )
								if( rsi1 <= 47.0568 )
									ret := -0.621315
								if( rsi1 > 47.0568 )
									ret := -0.160279
							if( smoothD_d > 11.6593 )
								if( d_k <= 19.1538 )
									ret := -0.324138
								if( d_k > 19.1538 )
									ret := -0.563953
						if( k > 0.0011 )
							ret := -1.000000 // sell
			if( smoothK_k > -2.96057 )
				if( smoothD_d <= -2.72896 )
					if( rsi1 <= 12.2609 )
						if( d_k <= -0.166576 )
							ret := -0.083333
						if( d_k > -0.166576 )
							if( smoothK_k <= -2.85934 )
								ret := -1.000000 // sell
							if( smoothK_k > -2.85934 )
								ret := -0.750000 // sell
					if( rsi1 > 12.2609 )
						if( k <= 0.248057 )
							if( d <= 0.043124 )
								ret := 0.538462
							if( d > 0.043124 )
								ret := 1.000000 // buy
						if( k > 0.248057 )
							if( rsi1 <= 23.3282 )
								if( d_k <= -0.454658 )
									ret := -0.875000 // sell
								if( d_k > -0.454658 )
									ret := 0.060606
							if( rsi1 > 23.3282 )
								if( rsi1 <= 36.6071 )
									ret := 1.000000 // buy
								if( rsi1 > 36.6071 )
									ret := 0.111111
				if( smoothD_d > -2.72896 )
					if( d_k <= -1.34595 )
						if( d <= 0.781153 )
							if( smoothD_d <= -2.23799 )
								if( k <= 2.22368 )
									ret := -0.263158
								if( k > 2.22368 )
									ret := -0.083333
							if( smoothD_d > -2.23799 )
								ret := 0.526316
						if( d > 0.781153 )
							if( smoothD_d <= -2.12054 )
								if( k <= 2.48601 )
									ret := -0.162162
								if( k > 2.48601 )
									ret := -0.800000 // sell
							if( smoothD_d > -2.12054 )
								if( d_k <= -1.93906 )
									ret := -0.435484
								if( d_k > -1.93906 )
									ret := -0.052632
					if( d_k > -1.34595 )
						if( d <= 20.1441 )
							if( d <= 14.397 )
								if( d <= 0.552248 )
									ret := -0.266393
								if( d > 0.552248 )
									ret := -0.462231
							if( d > 14.397 )
								if( d_k <= 12.959 )
									ret := -0.285714
								if( d_k > 12.959 )
									ret := -0.677143
						if( d > 20.1441 )
							if( d_k <= 27.5086 )
								if( smoothD_d <= 19.2238 )
									ret := 0.285714
								if( smoothD_d > 19.2238 )
									ret := -0.342857
							if( d_k > 27.5086 )
								if( smoothD_d <= 30.4765 )
									ret := -0.878788 // sell
								if( smoothD_d > 30.4765 )
									ret := -0.666667
		if( smoothK_k > 0.208435 )
			if( d_k <= -1.44413 )
				if( d <= 2.28997 )
					if( rsi1 <= 45.8766 )
						if( d_k <= -2.71851 )
							if( d_k <= -2.74485 )
								if( d <= 1.40468 )
									ret := 0.047619
								if( d > 1.40468 )
									ret := -0.465875
							if( d_k > -2.74485 )
								ret := -1.000000 // sell
						if( d_k > -2.71851 )
							if( smoothD_d <= -0.780807 )
								if( smoothK_k <= 1.05234 )
									ret := -0.274194
								if( smoothK_k > 1.05234 )
									ret := 0.333333
							if( smoothD_d > -0.780807 )
								ret := -1.000000 // sell
					if( rsi1 > 45.8766 )
						if( smoothD_d <= -1.64682 )
							if( smoothD_d <= -1.76352 )
								ret := 0.250000
							if( smoothD_d > -1.76352 )
								ret := -0.450000
						if( smoothD_d > -1.64682 )
							if( k <= 4.07989 )
								ret := 1.000000 // buy
							if( k > 4.07989 )
								if( k <= 5.31987 )
									ret := -0.272727
								if( k > 5.31987 )
									ret := 0.419355
				if( d > 2.28997 )
					if( d_k <= -6.71841 )
						if( d <= 4.41796 )
							if( d <= 4.05914 )
								if( d_k <= -7.93096 )
									ret := 0.766667 // buy
								if( d_k > -7.93096 )
									ret := 0.000000
							if( d > 4.05914 )
								if( k <= 12.2461 )
									ret := -0.750000 // sell
								if( k > 12.2461 )
									ret := -0.114286
						if( d > 4.41796 )
							if( rsi1 <= 31.3685 )
								if( smoothD_d <= 4.74425 )
									ret := -0.114537
								if( smoothD_d > 4.74425 )
									ret := 0.457627
							if( rsi1 > 31.3685 )
								if( k <= 14.1142 )
									ret := 0.505051
								if( k > 14.1142 )
									ret := 0.369658
					if( d_k > -6.71841 )
						if( d <= 11.9867 )
							if( rsi1 <= 34.6603 )
								if( smoothK_k <= 12.0254 )
									ret := -0.194465
								if( smoothK_k > 12.0254 )
									ret := 0.262295
							if( rsi1 > 34.6603 )
								if( d <= 3.89517 )
									ret := -0.022378
								if( d > 3.89517 )
									ret := 0.200540
						if( d > 11.9867 )
							if( rsi1 <= 29.8148 )
								if( smoothD_d <= 10.1 )
									ret := -0.932692 // sell
								if( smoothD_d > 10.1 )
									ret := -0.666667
							if( rsi1 > 29.8148 )
								if( rsi1 <= 46.3251 )
									ret := -0.236994
								if( rsi1 > 46.3251 )
									ret := 0.316547
			if( d_k > -1.44413 )
				if( smoothK_k <= 8.59011 )
					if( d_k <= 6.10668 )
						if( smoothK_k <= 5.77115 )
							if( d_k <= -0.182529 )
								if( rsi1 <= 42.0963 )
									ret := -0.339423
								if( rsi1 > 42.0963 )
									ret := 0.114967
							if( d_k > -0.182529 )
								if( k <= 4.63879 )
									ret := -0.302674
								if( k > 4.63879 )
									ret := -0.391032
						if( smoothK_k > 5.77115 )
							if( smoothK_k <= 6.2136 )
								if( smoothD_d <= 10.7901 )
									ret := -0.213415
								if( smoothD_d > 10.7901 )
									ret := 0.634615
							if( smoothK_k > 6.2136 )
								if( d <= 11.5169 )
									ret := -0.353268
								if( d > 11.5169 )
									ret := -0.218310
					if( d_k > 6.10668 )
						if( smoothD_d <= 27.8439 )
							if( rsi1 <= 47.6769 )
								if( k <= 5.66045 )
									ret := -0.445144
								if( k > 5.66045 )
									ret := -0.542910
							if( rsi1 > 47.6769 )
								if( d <= 28.1185 )
									ret := -0.137734
								if( d > 28.1185 )
									ret := 0.250000
						if( smoothD_d > 27.8439 )
							if( smoothK_k <= 5.21692 )
								if( k <= 5.48456 )
									ret := -0.620253
								if( k > 5.48456 )
									ret := -0.293103
							if( smoothK_k > 5.21692 )
								if( k <= 11.2426 )
									ret := -0.628655
								if( k > 11.2426 )
									ret := -0.890909 // sell
				if( smoothK_k > 8.59011 )
					if( d_k <= 8.52087 )
						if( d <= 21.8812 )
							if( rsi1 <= 36.8436 )
								if( d <= 15.3522 )
									ret := -0.247357
								if( d > 15.3522 )
									ret := -0.548387
							if( rsi1 > 36.8436 )
								if( d_k <= 0.660868 )
									ret := 0.130252
								if( d_k > 0.660868 )
									ret := -0.103194
						if( d > 21.8812 )
							if( d <= 23.6729 )
								if( k <= 14.3884 )
									ret := 0.575758
								if( k > 14.3884 )
									ret := 0.123894
							if( d > 23.6729 )
								if( d <= 24.181 )
									ret := -0.761905 // sell
								if( d > 24.181 )
									ret := 0.000000
					if( d_k > 8.52087 )
						if( d_k <= 15.6368 )
							if( smoothK_k <= 8.60315 )
								ret := 0.846154 // buy
							if( smoothK_k > 8.60315 )
								if( rsi1 <= 53.6637 )
									ret := -0.451163
								if( rsi1 > 53.6637 )
									ret := 0.076923
						if( d_k > 15.6368 )
							if( rsi1 <= 58.5079 )
								if( k <= 11.8036 )
									ret := -0.062500
								if( k > 11.8036 )
									ret := -0.580032
							if( rsi1 > 58.5079 )
								if( d <= 29.695 )
									ret := -0.384615
								if( d > 29.695 )
									ret := 0.329897
	if( smoothK_k > 13.3777 )
		if( smoothK_k <= 84.0391 )
			if( d_k <= -2.2213 )
				if( rsi1 <= 40.9649 )
					if( rsi1 <= 26.6632 )
						if( smoothD_d <= 9.90504 )
							if( k <= 20.6053 )
								if( rsi1 <= 19.2024 )
									ret := -0.634615
								if( rsi1 > 19.2024 )
									ret := 0.025974
							if( k > 20.6053 )
								if( rsi1 <= 20.235 )
									ret := 0.818182 // buy
								if( rsi1 > 20.235 )
									ret := 0.355556
						if( smoothD_d > 9.90504 )
							if( rsi1 <= 21.4249 )
								if( d_k <= -16.6136 )
									ret := 0.043478
								if( d_k > -16.6136 )
									ret := -0.642857
							if( rsi1 > 21.4249 )
								if( smoothD_d <= 30.23 )
									ret := -0.161648
								if( smoothD_d > 30.23 )
									ret := -0.492754
					if( rsi1 > 26.6632 )
						if( d_k <= -6.31332 )
							if( d <= 16.6274 )
								if( d <= 7.18898 )
									ret := -0.133333
								if( d > 7.18898 )
									ret := 0.379600
							if( d > 16.6274 )
								if( d_k <= -20.3565 )
									ret := 0.395806
								if( d_k > -20.3565 )
									ret := 0.064978
						if( d_k > -6.31332 )
							if( rsi1 <= 32.1577 )
								if( smoothK_k <= 27.6766 )
									ret := -0.163435
								if( smoothK_k > 27.6766 )
									ret := -0.459610
							if( rsi1 > 32.1577 )
								if( d <= 40.1505 )
									ret := 0.007143
								if( d > 40.1505 )
									ret := -0.214529
				if( rsi1 > 40.9649 )
					if( d_k <= -10.8746 )
						if( rsi1 <= 55.5618 )
							if( d <= 67.216 )
								if( smoothK_k <= 49.8161 )
									ret := 0.441226
								if( smoothK_k > 49.8161 )
									ret := 0.356748
							if( d > 67.216 )
								if( d <= 69.5317 )
									ret := -0.135135
								if( d > 69.5317 )
									ret := 0.163636
						if( rsi1 > 55.5618 )
							if( rsi1 <= 75.0155 )
								if( d <= 36.9675 )
									ret := 0.630461
								if( d > 36.9675 )
									ret := 0.507253
							if( rsi1 > 75.0155 )
								if( d_k <= -23.8045 )
									ret := 0.585034
								if( d_k > -23.8045 )
									ret := 0.809195 // buy
					if( d_k > -10.8746 )
						if( smoothK_k <= 80.8532 )
							if( d_k <= -5.1354 )
								if( smoothD_d <= 32.6287 )
									ret := 0.363258
								if( smoothD_d > 32.6287 )
									ret := 0.287799
							if( d_k > -5.1354 )
								if( k <= 82.1891 )
									ret := 0.220762
								if( k > 82.1891 )
									ret := -0.037736
						if( smoothK_k > 80.8532 )
							if( d_k <= -6.57293 )
								if( smoothK_k <= 82.5582 )
									ret := 0.466368
								if( smoothK_k > 82.5582 )
									ret := 0.635965
							if( d_k > -6.57293 )
								if( smoothD_d <= 81.0546 )
									ret := 0.357407
								if( smoothD_d > 81.0546 )
									ret := -0.555556
			if( d_k > -2.2213 )
				if( rsi1 <= 55.4508 )
					if( rsi1 <= 39.9989 )
						if( d_k <= 4.91704 )
							if( smoothD_d <= 16.5335 )
								if( rsi1 <= 26.2462 )
									ret := -0.536232
								if( rsi1 > 26.2462 )
									ret := 0.169935
							if( smoothD_d > 16.5335 )
								if( k <= 18.7705 )
									ret := -0.104575
								if( k > 18.7705 )
									ret := -0.336589
						if( d_k > 4.91704 )
							if( smoothD_d <= 32.2087 )
								if( smoothD_d <= 31.6028 )
									ret := -0.431983
								if( smoothD_d > 31.6028 )
									ret := 0.000000
							if( smoothD_d > 32.2087 )
								if( smoothK_k <= 82.7088 )
									ret := -0.585187
								if( smoothK_k > 82.7088 )
									ret := 0.360000
					if( rsi1 > 39.9989 )
						if( smoothD_d <= 44.6767 )
							if( rsi1 <= 51.1763 )
								if( k <= 31.9386 )
									ret := -0.252387
								if( k > 31.9386 )
									ret := -0.091515
							if( rsi1 > 51.1763 )
								if( smoothD_d <= 42.7973 )
									ret := -0.026258
								if( smoothD_d > 42.7973 )
									ret := 0.343434
						if( smoothD_d > 44.6767 )
							if( d_k <= 6.88176 )
								if( smoothK_k <= 41.2719 )
									ret := -0.726562 // sell
								if( smoothK_k > 41.2719 )
									ret := -0.088900
							if( d_k > 6.88176 )
								if( d_k <= 24.5678 )
									ret := -0.382448
								if( d_k > 24.5678 )
									ret := -0.617537
				if( rsi1 > 55.4508 )
					if( smoothD_d <= 84.8999 )
						if( d_k <= 8.55325 )
							if( rsi1 <= 74.2048 )
								if( k <= 32.5138 )
									ret := 0.328714
								if( k > 32.5138 )
									ret := 0.104954
							if( rsi1 > 74.2048 )
								if( d_k <= 4.93035 )
									ret := 0.537513
								if( d_k > 4.93035 )
									ret := 0.343164
						if( d_k > 8.55325 )
							if( d_k <= 15.2593 )
								if( smoothD_d <= 78.5245 )
									ret := -0.036246
								if( smoothD_d > 78.5245 )
									ret := -0.212066
							if( d_k > 15.2593 )
								if( d <= 78.8961 )
									ret := -0.229175
								if( d > 78.8961 )
									ret := -0.632258
					if( smoothD_d > 84.8999 )
						if( smoothK_k <= 76.044 )
							if( smoothK_k <= 71.7735 )
								if( d <= 90.2723 )
									ret := -0.283784
								if( d > 90.2723 )
									ret := 0.571429
							if( smoothK_k > 71.7735 )
								if( smoothK_k <= 74.6243 )
									ret := -0.668367
								if( smoothK_k > 74.6243 )
									ret := -0.378698
						if( smoothK_k > 76.044 )
							if( d_k <= 6.18671 )
								if( smoothK_k <= 82.3813 )
									ret := -0.132678
								if( smoothK_k > 82.3813 )
									ret := 0.143396
							if( d_k > 6.18671 )
								if( rsi1 <= 60.2616 )
									ret := -0.121076
								if( rsi1 > 60.2616 )
									ret := -0.311506
		if( smoothK_k > 84.0391 )
			if( k <= 98.2799 )
				if( d <= 80.4825 )
					if( k <= 93.5091 )
						if( d_k <= -26.1322 )
							if( smoothK_k <= 88.4685 )
								if( d_k <= -26.8224 )
									ret := 0.338129
								if( d_k > -26.8224 )
									ret := -0.600000
							if( smoothK_k > 88.4685 )
								if( d <= 64.0907 )
									ret := 0.921875 // buy
								if( d > 64.0907 )
									ret := 0.230769
						if( d_k > -26.1322 )
							if( smoothD_d <= 68.7617 )
								if( d <= 62.8705 )
									ret := 0.076923
								if( d > 62.8705 )
									ret := 0.652688
							if( smoothD_d > 68.7617 )
								if( smoothD_d <= 75.4736 )
									ret := 0.425402
								if( smoothD_d > 75.4736 )
									ret := 0.555085
					if( k > 93.5091 )
						if( d_k <= -30.8691 )
							if( d_k <= -32.6082 )
								ret := 1.000000 // buy
							if( d_k > -32.6082 )
								if( k <= 95.4626 )
									ret := 0.956522 // buy
								if( k > 95.4626 )
									ret := 0.214286
						if( d_k > -30.8691 )
							if( smoothD_d <= 64.7128 )
								if( smoothD_d <= 62.9177 )
									ret := 0.052632
								if( smoothD_d > 62.9177 )
									ret := -0.857143 // sell
							if( smoothD_d > 64.7128 )
								if( rsi1 <= 54.4244 )
									ret := -0.114478
								if( rsi1 > 54.4244 )
									ret := 0.540925
				if( d > 80.4825 )
					if( d_k <= 1.77085 )
						if( d_k <= 0.362067 )
							if( rsi1 <= 77.9052 )
								if( smoothK_k <= 93.221 )
									ret := 0.204759
								if( smoothK_k > 93.221 )
									ret := 0.311248
							if( rsi1 > 77.9052 )
								if( rsi1 <= 80.019 )
									ret := 0.431635
								if( rsi1 > 80.019 )
									ret := 0.650664
						if( d_k > 0.362067 )
							if( k <= 93.2572 )
								if( rsi1 <= 58.9765 )
									ret := -0.170732
								if( rsi1 > 58.9765 )
									ret := 0.254215
							if( k > 93.2572 )
								if( d <= 93.9715 )
									ret := -0.666667
								if( d > 93.9715 )
									ret := 0.267682
					if( d_k > 1.77085 )
						if( d <= 98.0069 )
							if( smoothK_k <= 84.2653 )
								if( rsi1 <= 55.0505 )
									ret := 0.641509
								if( rsi1 > 55.0505 )
									ret := 0.106667
							if( smoothK_k > 84.2653 )
								if( d_k <= 6.7232 )
									ret := -0.007967
								if( d_k > 6.7232 )
									ret := -0.401993
						if( d > 98.0069 )
							if( smoothD_d <= 95.9461 )
								if( d <= 98.312 )
									ret := 0.492537
								if( d > 98.312 )
									ret := 0.320346
							if( smoothD_d > 95.9461 )
								if( rsi1 <= 71.9798 )
									ret := -0.122807
								if( rsi1 > 71.9798 )
									ret := 0.258065
			if( k > 98.2799 )
				if( d_k <= -1.68758 )
					if( rsi1 <= 71.4355 )
						if( k <= 99.497 )
							if( d <= 69.8879 )
								ret := 0.950000 // buy
							if( d > 69.8879 )
								if( smoothD_d <= 78.7818 )
									ret := -0.366667
								if( smoothD_d > 78.7818 )
									ret := 0.285106
						if( k > 99.497 )
							if( smoothD_d <= 73.1222 )
								if( d_k <= -29.8562 )
									ret := 0.647059
								if( d_k > -29.8562 )
									ret := -0.215190
							if( smoothD_d > 73.1222 )
								if( smoothK_k <= 96.5686 )
									ret := 0.833333 // buy
								if( smoothK_k > 96.5686 )
									ret := 0.465604
					if( rsi1 > 71.4355 )
						if( smoothD_d <= 87.9918 )
							if( d_k <= -14.0358 )
								if( rsi1 <= 73.406 )
									ret := 0.000000
								if( rsi1 > 73.406 )
									ret := 0.691542
							if( d_k > -14.0358 )
								if( smoothD_d <= 86.3279 )
									ret := 0.813397 // buy
								if( smoothD_d > 86.3279 )
									ret := 0.913907 // buy
						if( smoothD_d > 87.9918 )
							if( smoothD_d <= 88.3039 )
								if( smoothD_d <= 88.0648 )
									ret := 0.625000
								if( smoothD_d > 88.0648 )
									ret := 0.090909
							if( smoothD_d > 88.3039 )
								if( smoothK_k <= 95.7198 )
									ret := 0.389381
								if( smoothK_k > 95.7198 )
									ret := 0.665269
				if( d_k > -1.68758 )
					if( d <= 99.9997 )
						if( d <= 99.9102 )
							if( d_k <= -0.231145 )
								if( rsi1 <= 55.6642 )
									ret := -0.211207
								if( rsi1 > 55.6642 )
									ret := 0.397239
							if( d_k > -0.231145 )
								if( rsi1 <= 80.6004 )
									ret := 0.354839
								if( rsi1 > 80.6004 )
									ret := 0.656716
						if( d > 99.9102 )
							if( rsi1 <= 94.3177 )
								if( d <= 99.9664 )
									ret := -0.425287
								if( d > 99.9664 )
									ret := 0.162162
							if( rsi1 > 94.3177 )
								ret := 1.000000 // buy
					if( d > 99.9997 )
						ret := 0.493399
	
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
float op_operation = decision_tree_0_XLMUSDT_5Min_ba5b83db(smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


