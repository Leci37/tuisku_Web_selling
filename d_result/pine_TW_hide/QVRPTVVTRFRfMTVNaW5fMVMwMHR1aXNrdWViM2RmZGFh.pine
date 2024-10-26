//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ATOMUSDT_15Min_1S00_eb3dfdaa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1S00_eb3dfdaa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_eb3dfdaa(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 53.4977 )
		if( k <= 26.2347 )
			if( rsi1 <= 34.8907 )
				if( smoothD_d <= 3.30335 )
					if( rsi1 <= 6.47218 )
						if( d <= 0.044924 )
							if( smoothD_d <= -2.99766 )
								ret := 0.000000
							if( smoothD_d > -2.99766 )
								ret := -1.000000 // sell
						if( d > 0.044924 )
							if( smoothD_d <= -2.89528 )
								ret := 0.750000 // buy
							if( smoothD_d > -2.89528 )
								if( rsi1 <= 6.0747 )
									ret := 0.075000
								if( rsi1 > 6.0747 )
									ret := -0.705882 // sell
					if( rsi1 > 6.47218 )
						if( d_k <= 1.97272 )
							if( smoothD_d <= 2.42607 )
								if( k <= 2.31355 )
									ret := -0.550887
								if( k > 2.31355 )
									ret := -0.461255
							if( smoothD_d > 2.42607 )
								if( rsi1 <= 20.8894 )
									ret := -0.464286
								if( rsi1 > 20.8894 )
									ret := -0.697425
						if( d_k > 1.97272 )
							if( rsi1 <= 12.8629 )
								if( smoothD_d <= 1.44851 )
									ret := -0.788462 // sell
								if( smoothD_d > 1.44851 )
									ret := -1.000000 // sell
							if( rsi1 > 12.8629 )
								if( smoothD_d <= 2.57679 )
									ret := -0.248785
								if( smoothD_d > 2.57679 )
									ret := -0.530303
				if( smoothD_d > 3.30335 )
					if( rsi1 <= 7.18326 )
						if( d <= 8.55855 )
							ret := 0.800000 // buy
						if( d > 8.55855 )
							ret := 1.000000 // buy
					if( rsi1 > 7.18326 )
						if( k <= 22.0482 )
							if( d_k <= 16.1884 )
								if( d <= 10.155 )
									ret := -0.385308
								if( d > 10.155 )
									ret := -0.297447
							if( d_k > 16.1884 )
								if( d_k <= 19.1918 )
									ret := -0.715177 // sell
								if( d_k > 19.1918 )
									ret := -0.418567
						if( k > 22.0482 )
							if( smoothK_k <= 22.3718 )
								if( smoothD_d <= 10.809 )
									ret := -0.537037
								if( smoothD_d > 10.809 )
									ret := -0.058542
							if( smoothK_k > 22.3718 )
								if( rsi1 <= 27.0714 )
									ret := -0.736111 // sell
								if( rsi1 > 27.0714 )
									ret := -0.402439
			if( rsi1 > 34.8907 )
				if( k <= 7.87028 )
					if( k <= 1.06259 )
						if( rsi1 <= 52.0335 )
							if( smoothD_d <= 2.34767 )
								if( smoothK_k <= -1.99566 )
									ret := -0.275105
								if( smoothK_k > -1.99566 )
									ret := -0.850000 // sell
							if( smoothD_d > 2.34767 )
								if( d_k <= 7.46617 )
									ret := -0.630631
								if( d_k > 7.46617 )
									ret := -0.420891
						if( rsi1 > 52.0335 )
							if( d_k <= 10.8532 )
								if( smoothD_d <= 2.69634 )
									ret := 0.000000
								if( smoothD_d > 2.69634 )
									ret := -0.400000
							if( d_k > 10.8532 )
								if( d_k <= 19.3092 )
									ret := 0.866667 // buy
								if( d_k > 19.3092 )
									ret := 0.181818
					if( k > 1.06259 )
						if( rsi1 <= 42.6093 )
							if( smoothD_d <= 13.4786 )
								if( d_k <= -1.79674 )
									ret := -0.571429
								if( d_k > -1.79674 )
									ret := -0.257557
							if( smoothD_d > 13.4786 )
								if( rsi1 <= 38.9416 )
									ret := 0.183333
								if( rsi1 > 38.9416 )
									ret := -0.406542
						if( rsi1 > 42.6093 )
							if( smoothK_k <= 0.308253 )
								if( rsi1 <= 45.4975 )
									ret := 0.246231
								if( rsi1 > 45.4975 )
									ret := -0.261538
							if( smoothK_k > 0.308253 )
								if( smoothK_k <= 0.49523 )
									ret := -0.754098 // sell
								if( smoothK_k > 0.49523 )
									ret := -0.239922
				if( k > 7.87028 )
					if( rsi1 <= 41.3984 )
						if( smoothK_k <= 5.05669 )
							if( smoothD_d <= 10.3731 )
								if( d_k <= -2.65615 )
									ret := 0.692308
								if( d_k > -2.65615 )
									ret := -0.263158
							if( smoothD_d > 10.3731 )
								if( smoothD_d <= 22.486 )
									ret := 0.619048
								if( smoothD_d > 22.486 )
									ret := 0.307692
						if( smoothK_k > 5.05669 )
							if( d <= 7.57802 )
								if( rsi1 <= 38.0469 )
									ret := -0.367742
								if( rsi1 > 38.0469 )
									ret := -0.610345
							if( d > 7.57802 )
								if( d <= 39.3516 )
									ret := -0.204325
								if( d > 39.3516 )
									ret := -0.442308
					if( rsi1 > 41.3984 )
						if( k <= 25.7388 )
							if( d <= 16.0565 )
								if( smoothD_d <= 0.392796 )
									ret := 0.256410
								if( smoothD_d > 0.392796 )
									ret := -0.207940
							if( d > 16.0565 )
								if( rsi1 <= 51.7713 )
									ret := -0.071517
								if( rsi1 > 51.7713 )
									ret := -0.278729
						if( k > 25.7388 )
							if( smoothD_d <= 34.0346 )
								if( smoothD_d <= 29.2645 )
									ret := 0.154639
								if( smoothD_d > 29.2645 )
									ret := 0.846154 // buy
							if( smoothD_d > 34.0346 )
								if( smoothD_d <= 39.4282 )
									ret := -0.785714 // sell
								if( smoothD_d > 39.4282 )
									ret := -0.153846
		if( k > 26.2347 )
			if( k <= 67.3438 )
				if( d <= 39.1709 )
					if( rsi1 <= 36.9001 )
						if( rsi1 <= 31.6808 )
							if( k <= 30.4725 )
								if( smoothK_k <= 25.443 )
									ret := -0.271255
								if( smoothK_k > 25.443 )
									ret := 0.210227
							if( k > 30.4725 )
								if( d <= 37.7385 )
									ret := -0.320038
								if( d > 37.7385 )
									ret := 0.303571
						if( rsi1 > 31.6808 )
							if( d_k <= 5.84266 )
								if( smoothD_d <= 32.0946 )
									ret := -0.113602
								if( smoothD_d > 32.0946 )
									ret := 0.135021
							if( d_k > 5.84266 )
								if( d_k <= 7.52383 )
									ret := -0.977778 // sell
								if( d_k > 7.52383 )
									ret := -0.363636
					if( rsi1 > 36.9001 )
						if( smoothK_k <= 30.1875 )
							if( d_k <= -6.76653 )
								if( k <= 27.0271 )
									ret := 0.049020
								if( k > 27.0271 )
									ret := -0.222930
							if( d_k > -6.76653 )
								if( smoothK_k <= 24.0646 )
									ret := 0.239437
								if( smoothK_k > 24.0646 )
									ret := 0.040566
						if( smoothK_k > 30.1875 )
							if( smoothD_d <= 29.7444 )
								if( d_k <= -13.0595 )
									ret := -0.059984
								if( d_k > -13.0595 )
									ret := 0.103870
							if( smoothD_d > 29.7444 )
								if( k <= 55.9829 )
									ret := 0.216655
								if( k > 55.9829 )
									ret := -0.126394
				if( d > 39.1709 )
					if( rsi1 <= 39.6073 )
						if( k <= 40.6919 )
							if( d_k <= 3.70916 )
								if( smoothD_d <= 36.8443 )
									ret := 0.277778
								if( smoothD_d > 36.8443 )
									ret := -0.042553
							if( d_k > 3.70916 )
								if( smoothK_k <= 23.6248 )
									ret := 0.285714
								if( smoothK_k > 23.6248 )
									ret := -0.395671
						if( k > 40.6919 )
							if( k <= 41.0985 )
								if( rsi1 <= 35.7929 )
									ret := -0.125000
								if( rsi1 > 35.7929 )
									ret := 0.588235
							if( k > 41.0985 )
								if( smoothD_d <= 51.7385 )
									ret := -0.052340
								if( smoothD_d > 51.7385 )
									ret := -0.242581
					if( rsi1 > 39.6073 )
						if( d_k <= -1.77805 )
							if( rsi1 <= 50.0868 )
								if( smoothD_d <= 43.1843 )
									ret := -0.032366
								if( smoothD_d > 43.1843 )
									ret := 0.242479
							if( rsi1 > 50.0868 )
								if( k <= 59.5524 )
									ret := -0.371747
								if( k > 59.5524 )
									ret := 0.010204
						if( d_k > -1.77805 )
							if( k <= 28.9263 )
								if( smoothD_d <= 47.7229 )
									ret := -0.531792
								if( smoothD_d > 47.7229 )
									ret := 0.000000
							if( k > 28.9263 )
								if( smoothK_k <= 61.7245 )
									ret := -0.068767
								if( smoothK_k > 61.7245 )
									ret := -0.234450
			if( k > 67.3438 )
				if( smoothD_d <= 85.8238 )
					if( d_k <= -5.9404 )
						if( smoothK_k <= 66.6584 )
							if( d_k <= -16.6528 )
								if( k <= 68.5177 )
									ret := 0.041667
								if( k > 68.5177 )
									ret := 0.394161
							if( d_k > -16.6528 )
								if( rsi1 <= 31.663 )
									ret := -0.153846
								if( rsi1 > 31.663 )
									ret := 0.772021 // buy
						if( smoothK_k > 66.6584 )
							if( smoothD_d <= 42.6984 )
								if( smoothK_k <= 68.8299 )
									ret := -0.428571
								if( smoothK_k > 68.8299 )
									ret := -0.068966
							if( smoothD_d > 42.6984 )
								if( rsi1 <= 48.4174 )
									ret := 0.079506
								if( rsi1 > 48.4174 )
									ret := 0.272565
					if( d_k > -5.9404 )
						if( d <= 83.6755 )
							if( d <= 78.659 )
								if( rsi1 <= 26.0727 )
									ret := 0.820513 // buy
								if( rsi1 > 26.0727 )
									ret := -0.060510
							if( d > 78.659 )
								if( smoothD_d <= 77.0904 )
									ret := -0.305263
								if( smoothD_d > 77.0904 )
									ret := -0.139267
						if( d > 83.6755 )
							if( smoothD_d <= 81.949 )
								if( k <= 85.8031 )
									ret := 0.063197
								if( k > 85.8031 )
									ret := 0.576471
							if( smoothD_d > 81.949 )
								if( k <= 85.4886 )
									ret := 0.011249
								if( k > 85.4886 )
									ret := -0.223881
				if( smoothD_d > 85.8238 )
					if( d <= 95.4758 )
						if( smoothD_d <= 90.8407 )
							if( k <= 97.1492 )
								if( rsi1 <= 37.4893 )
									ret := -0.306122
								if( rsi1 > 37.4893 )
									ret := 0.211765
							if( k > 97.1492 )
								if( d_k <= -10.5476 )
									ret := 0.928571 // buy
								if( d_k > -10.5476 )
									ret := 0.393617
						if( smoothD_d > 90.8407 )
							if( rsi1 <= 35.7578 )
								if( smoothK_k <= 88.8952 )
									ret := -1.000000 // sell
								if( smoothK_k > 88.8952 )
									ret := -0.125000
							if( rsi1 > 35.7578 )
								if( smoothD_d <= 91.2486 )
									ret := -0.216216
								if( smoothD_d > 91.2486 )
									ret := 0.136778
					if( d > 95.4758 )
						if( d <= 99.3316 )
							if( k <= 89.9438 )
								if( smoothK_k <= 86.738 )
									ret := -0.133333
								if( smoothK_k > 86.738 )
									ret := -0.733333 // sell
							if( k > 89.9438 )
								if( smoothD_d <= 96.2718 )
									ret := 0.337793
								if( smoothD_d > 96.2718 )
									ret := 0.937500 // buy
						if( d > 99.3316 )
							if( d <= 99.3876 )
								if( d_k <= -0.62302 )
									ret := -0.733333 // sell
								if( d_k > -0.62302 )
									ret := -1.000000 // sell
							if( d > 99.3876 )
								if( smoothK_k <= 95.9626 )
									ret := 0.769231 // buy
								if( smoothK_k > 95.9626 )
									ret := 0.273585
	if( rsi1 > 53.4977 )
		if( rsi1 <= 67.3372 )
			if( smoothK_k <= 70.0448 )
				if( smoothD_d <= 9.45614 )
					if( d_k <= 8.81749 )
						if( d <= 5.87997 )
							if( rsi1 <= 54.3175 )
								if( smoothK_k <= 4.16748 )
									ret := 0.550000
								if( smoothK_k > 4.16748 )
									ret := 0.000000
							if( rsi1 > 54.3175 )
								if( d_k <= -0.662005 )
									ret := -0.533613
								if( d_k > -0.662005 )
									ret := -0.116935
						if( d > 5.87997 )
							if( smoothD_d <= 3.35635 )
								if( rsi1 <= 57.7685 )
									ret := -0.250000
								if( rsi1 > 57.7685 )
									ret := 0.631579
							if( smoothD_d > 3.35635 )
								if( k <= 8.57968 )
									ret := 0.051095
								if( k > 8.57968 )
									ret := -0.181982
					if( d_k > 8.81749 )
						if( d <= 11.8161 )
							if( d <= 11.042 )
								if( smoothD_d <= 7.48613 )
									ret := -0.700000 // sell
								if( smoothD_d > 7.48613 )
									ret := -1.000000 // sell
							if( d > 11.042 )
								ret := -0.312500
						if( d > 11.8161 )
							if( smoothK_k <= -0.409424 )
								ret := -1.000000 // sell
							if( smoothK_k > -0.409424 )
								ret := -0.866667 // sell
				if( smoothD_d > 9.45614 )
					if( smoothD_d <= 78.6295 )
						if( smoothD_d <= 21.531 )
							if( rsi1 <= 58.3958 )
								if( k <= 43.1139 )
									ret := -0.116028
								if( k > 43.1139 )
									ret := -0.655172
							if( rsi1 > 58.3958 )
								if( d_k <= 14.4256 )
									ret := 0.119403
								if( d_k > 14.4256 )
									ret := -0.481481
						if( smoothD_d > 21.531 )
							if( smoothK_k <= 12.1524 )
								if( smoothK_k <= 11.7313 )
									ret := -0.018088
								if( smoothK_k > 11.7313 )
									ret := -0.638889
							if( smoothK_k > 12.1524 )
								if( k <= 18.7997 )
									ret := 0.240000
								if( k > 18.7997 )
									ret := 0.057121
					if( smoothD_d > 78.6295 )
						if( d_k <= 11.5945 )
							if( k <= 71.8562 )
								ret := -0.368421
							if( k > 71.8562 )
								if( d_k <= 9.75799 )
									ret := -0.100000
								if( d_k > 9.75799 )
									ret := 0.200000
						if( d_k > 11.5945 )
							if( d_k <= 12.4937 )
								if( smoothK_k <= 68.0862 )
									ret := 0.583333
								if( smoothK_k > 68.0862 )
									ret := 0.933333 // buy
							if( d_k > 12.4937 )
								if( d <= 82.44 )
									ret := 0.674419
								if( d > 82.44 )
									ret := 0.162437
			if( smoothK_k > 70.0448 )
				if( d_k <= -3.2077 )
					if( smoothK_k <= 87.869 )
						if( d <= 75.9117 )
							if( smoothK_k <= 71.4938 )
								if( k <= 74.0087 )
									ret := 0.375000
								if( k > 74.0087 )
									ret := 0.726027 // buy
							if( smoothK_k > 71.4938 )
								if( k <= 89.4718 )
									ret := 0.281765
								if( k > 89.4718 )
									ret := -0.052632
						if( d > 75.9117 )
							if( smoothD_d <= 74.0806 )
								if( d_k <= -13.1423 )
									ret := -0.772727 // sell
								if( d_k > -13.1423 )
									ret := -0.318182
							if( smoothD_d > 74.0806 )
								if( rsi1 <= 55.4854 )
									ret := -0.180851
								if( rsi1 > 55.4854 )
									ret := 0.214748
					if( smoothK_k > 87.869 )
						if( d_k <= -5.03995 )
							if( smoothK_k <= 93.9828 )
								if( k <= 95.5705 )
									ret := 0.344538
								if( k > 95.5705 )
									ret := 0.003155
							if( smoothK_k > 93.9828 )
								if( smoothD_d <= 91.0802 )
									ret := 0.456838
								if( smoothD_d > 91.0802 )
									ret := -0.093333
						if( d_k > -5.03995 )
							if( smoothD_d <= 84.2294 )
								if( smoothD_d <= 83.8021 )
									ret := 0.181818
								if( smoothD_d > 83.8021 )
									ret := -0.615385
							if( smoothD_d > 84.2294 )
								if( smoothD_d <= 86.6364 )
									ret := 0.781457 // buy
								if( smoothD_d > 86.6364 )
									ret := 0.478921
				if( d_k > -3.2077 )
					if( smoothD_d <= 80.8816 )
						if( d <= 78.7776 )
							if( rsi1 <= 58.7349 )
								if( d_k <= 0.407324 )
									ret := 0.043478
								if( d_k > 0.407324 )
									ret := -0.377049
							if( rsi1 > 58.7349 )
								if( d_k <= -0.835139 )
									ret := -0.019417
								if( d_k > -0.835139 )
									ret := 0.431373
						if( d > 78.7776 )
							if( rsi1 <= 65.0476 )
								if( k <= 74.9403 )
									ret := 0.172185
								if( k > 74.9403 )
									ret := -0.223388
							if( rsi1 > 65.0476 )
								if( rsi1 <= 66.827 )
									ret := 0.367188
								if( rsi1 > 66.827 )
									ret := -0.333333
					if( smoothD_d > 80.8816 )
						if( d_k <= -2.89979 )
							if( smoothD_d <= 90.9193 )
								if( k <= 94.9055 )
									ret := 0.121212
								if( k > 94.9055 )
									ret := 0.484848
							if( smoothD_d > 90.9193 )
								if( k <= 98.2483 )
									ret := -0.666667
								if( k > 98.2483 )
									ret := -0.043478
						if( d_k > -2.89979 )
							if( k <= 95.9631 )
								if( d_k <= 2.08564 )
									ret := 0.143813
								if( d_k > 2.08564 )
									ret := 0.273245
							if( k > 95.9631 )
								if( k <= 96.4493 )
									ret := 0.580645
								if( k > 96.4493 )
									ret := 0.271668
		if( rsi1 > 67.3372 )
			if( d <= 92.2297 )
				if( k <= 86.4009 )
					if( d <= 82.0229 )
						if( rsi1 <= 71.3451 )
							if( k <= 14.6087 )
								if( k <= 12.4609 )
									ret := -0.039216
								if( k > 12.4609 )
									ret := -0.827586 // sell
							if( k > 14.6087 )
								if( d_k <= -1.11766 )
									ret := 0.291271
								if( d_k > -1.11766 )
									ret := 0.113122
						if( rsi1 > 71.3451 )
							if( d <= 53.5934 )
								if( smoothK_k <= 12.4763 )
									ret := 0.752941 // buy
								if( smoothK_k > 12.4763 )
									ret := 0.425906
							if( d > 53.5934 )
								if( d_k <= -17.8931 )
									ret := -0.207317
								if( d_k > -17.8931 )
									ret := 0.269190
					if( d > 82.0229 )
						if( smoothK_k <= 73.3435 )
							if( smoothK_k <= 61.818 )
								ret := -0.230769
							if( smoothK_k > 61.818 )
								if( d_k <= 13.5273 )
									ret := 0.572052
								if( d_k > 13.5273 )
									ret := 0.881720 // buy
						if( smoothK_k > 73.3435 )
							if( k <= 77.2672 )
								if( smoothD_d <= 84.2345 )
									ret := -0.040000
								if( smoothD_d > 84.2345 )
									ret := -0.666667
							if( k > 77.2672 )
								if( rsi1 <= 85.0042 )
									ret := 0.346258
								if( rsi1 > 85.0042 )
									ret := -0.102564
				if( k > 86.4009 )
					if( rsi1 <= 75.2972 )
						if( smoothD_d <= 85.3016 )
							if( rsi1 <= 68.6411 )
								if( d <= 75.6854 )
									ret := -0.060606
								if( d > 75.6854 )
									ret := 0.363184
							if( rsi1 > 68.6411 )
								if( smoothD_d <= 63.3091 )
									ret := 0.812500 // buy
								if( smoothD_d > 63.3091 )
									ret := 0.426230
						if( smoothD_d > 85.3016 )
							if( k <= 90.6877 )
								if( smoothD_d <= 86.5404 )
									ret := -0.302326
								if( smoothD_d > 86.5404 )
									ret := 0.497854
							if( k > 90.6877 )
								if( k <= 92.0531 )
									ret := -0.345133
								if( k > 92.0531 )
									ret := 0.289593
					if( rsi1 > 75.2972 )
						if( d <= 90.6998 )
							if( d <= 76.3862 )
								if( k <= 99.8674 )
									ret := 0.838710 // buy
								if( k > 99.8674 )
									ret := 0.000000
							if( d > 76.3862 )
								if( d_k <= -1.89617 )
									ret := 0.610132
								if( d_k > -1.89617 )
									ret := 0.291457
						if( d > 90.6998 )
							if( smoothK_k <= 96.5022 )
								if( smoothK_k <= 87.7786 )
									ret := -0.185185
								if( smoothK_k > 87.7786 )
									ret := 0.163842
							if( smoothK_k > 96.5022 )
								if( d_k <= -8.50554 )
									ret := 0.800000 // buy
								if( d_k > -8.50554 )
									ret := 0.478261
			if( d > 92.2297 )
				if( k <= 99.986 )
					if( d_k <= 6.3373 )
						if( d <= 98.8749 )
							if( smoothD_d <= 95.8159 )
								if( k <= 86.8553 )
									ret := -0.214286
								if( k > 86.8553 )
									ret := 0.426767
							if( smoothD_d > 95.8159 )
								if( smoothD_d <= 95.8598 )
									ret := 0.100000
								if( smoothD_d > 95.8598 )
									ret := -0.400000
						if( d > 98.8749 )
							if( rsi1 <= 77.0842 )
								if( smoothK_k <= 95.9131 )
									ret := 0.197080
								if( smoothK_k > 95.9131 )
									ret := 0.506494
							if( rsi1 > 77.0842 )
								if( k <= 99.9775 )
									ret := 0.674033
								if( k > 99.9775 )
									ret := -0.666667
					if( d_k > 6.3373 )
						if( k <= 88.2469 )
							if( k <= 87.1513 )
								if( rsi1 <= 73.0603 )
									ret := 0.800000 // buy
								if( rsi1 > 73.0603 )
									ret := 0.510000
							if( k > 87.1513 )
								if( smoothK_k <= 84.5207 )
									ret := -0.416667
								if( smoothK_k > 84.5207 )
									ret := 0.416667
						if( k > 88.2469 )
							if( d_k <= 6.44041 )
								ret := 0.600000
							if( d_k > 6.44041 )
								if( d_k <= 7.32651 )
									ret := 1.000000 // buy
								if( d_k > 7.32651 )
									ret := 0.933333 // buy
				if( k > 99.986 )
					if( rsi1 <= 85.0339 )
						if( rsi1 <= 83.3338 )
							if( d <= 95.0372 )
								if( smoothD_d <= 90.661 )
									ret := 0.521277
								if( smoothD_d > 90.661 )
									ret := 0.062500
							if( d > 95.0372 )
								if( smoothD_d <= 96.6456 )
									ret := 0.620448
								if( smoothD_d > 96.6456 )
									ret := 0.460967
						if( rsi1 > 83.3338 )
							if( smoothD_d <= 95.382 )
								if( smoothD_d <= 92.2418 )
									ret := 1.000000 // buy
								if( smoothD_d > 92.2418 )
									ret := 0.739130 // buy
							if( smoothD_d > 95.382 )
								if( d_k <= -0.003704 )
									ret := -0.692308
								if( d_k > -0.003704 )
									ret := -0.369565
					if( rsi1 > 85.0339 )
						if( smoothK_k <= 96.9998 )
							ret := 0.000000
						if( smoothK_k > 96.9998 )
							if( rsi1 <= 94.6834 )
								if( smoothD_d <= 93.6732 )
									ret := 0.500000
								if( smoothD_d > 93.6732 )
									ret := 0.746835 // buy
							if( rsi1 > 94.6834 )
								if( d <= 97.5427 )
									ret := 0.692308
								if( d > 97.5427 )
									ret := 0.978022 // buy
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_eb3dfdaa(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


