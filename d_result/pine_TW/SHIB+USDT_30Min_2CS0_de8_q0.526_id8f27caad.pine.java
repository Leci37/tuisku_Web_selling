//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: SHIBUSDT_30Min_2CS0_8f27caad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_2CS0_8f27caad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_8f27caad(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 36.9866 )
		if( ad_mf <= -7.10502e+10 )
			if( ad <= -7.21969e+10 )
				if( d_k <= -3.73447 )
					if( ad_mf <= -2.1187e+11 )
						if( rsi1 <= 24.5535 )
							if( rsi1 <= 22.595 )
								ret := 0.000000
							if( rsi1 > 22.595 )
								ret := -0.714286 // sell
						if( rsi1 > 24.5535 )
							if( ad <= -2.79562e+11 )
								if( ad <= -4.36692e+11 )
									ret := 0.486486
								if( ad > -4.36692e+11 )
									ret := 0.095745
							if( ad > -2.79562e+11 )
								if( smoothD_d <= 5.50457 )
									ret := 0.285714
								if( smoothD_d > 5.50457 )
									ret := 0.835052 // buy
					if( ad_mf > -2.1187e+11 )
						if( ad <= -2.04043e+11 )
							if( ad_mf <= -2.06407e+11 )
								ret := -0.500000
							if( ad_mf > -2.06407e+11 )
								ret := -0.857143 // sell
						if( ad > -2.04043e+11 )
							if( rsi1 <= 31.7821 )
								if( k <= 34.0212 )
									ret := -0.085526
								if( k > 34.0212 )
									ret := -0.846154 // sell
							if( rsi1 > 31.7821 )
								if( rsi1 <= 34.4632 )
									ret := 0.736842 // buy
								if( rsi1 > 34.4632 )
									ret := 0.155718
				if( d_k > -3.73447 )
					if( ad_mf <= -1.41785e+11 )
						if( smoothD_d <= 12.651 )
							if( k <= 16.8823 )
								if( mf <= -0.022025 )
									ret := 0.218079
								if( mf > -0.022025 )
									ret := 0.009381
							if( k > 16.8823 )
								ret := -0.360000
						if( smoothD_d > 12.651 )
							if( ad <= -1.47117e+11 )
								if( ad_mf <= -1.49786e+11 )
									ret := -0.056456
								if( ad_mf > -1.49786e+11 )
									ret := -0.677419
							if( ad > -1.47117e+11 )
								if( k <= 20.8346 )
									ret := 0.789474 // buy
								if( k > 20.8346 )
									ret := 0.068182
					if( ad_mf > -1.41785e+11 )
						if( rsi1 <= 41.5309 )
							if( d_k <= -0.165325 )
								if( ad <= -1.23868e+11 )
									ret := -0.328571
								if( ad > -1.23868e+11 )
									ret := 0.129032
							if( d_k > -0.165325 )
								if( ad_mf <= -7.53059e+10 )
									ret := -0.279925
								if( ad_mf > -7.53059e+10 )
									ret := 0.285714
						if( rsi1 > 41.5309 )
							if( ad_mf <= -1.21156e+11 )
								if( d_k <= 1.29955 )
									ret := -0.341463
								if( d_k > 1.29955 )
									ret := 0.524590
							if( ad_mf > -1.21156e+11 )
								if( d <= 37.9452 )
									ret := 0.055184
								if( d > 37.9452 )
									ret := -0.228395
			if( ad > -7.21969e+10 )
				if( rsi1 <= 52.8868 )
					if( d <= 19.8652 )
						if( ad_mf <= -7.17373e+10 )
							ret := -0.312500
						if( ad_mf > -7.17373e+10 )
							if( mf <= -0.030996 )
								ret := 0.200000
							if( mf > -0.030996 )
								if( ad_mf <= -7.11832e+10 )
									ret := 1.000000 // buy
								if( ad_mf > -7.11832e+10 )
									ret := 0.818182 // buy
					if( d > 19.8652 )
						if( d <= 26.5703 )
							ret := 1.000000 // buy
						if( d > 26.5703 )
							if( rsi1 <= 37.2937 )
								if( smoothK_k <= 20.4801 )
									ret := 0.000000
								if( smoothK_k > 20.4801 )
									ret := 0.666667
							if( rsi1 > 37.2937 )
								if( d <= 44.465 )
									ret := 0.555556
								if( d > 44.465 )
									ret := 1.000000 // buy
				if( rsi1 > 52.8868 )
					ret := -0.500000
		if( ad_mf > -7.10502e+10 )
			if( d_k <= 0.463883 )
				if( d_k <= -3.55477 )
					if( k <= 27.4134 )
						if( ad <= -5.71891e+10 )
							if( rsi1 <= 34.1574 )
								if( d <= 15.5644 )
									ret := -0.290323
								if( d > 15.5644 )
									ret := 0.454545
							if( rsi1 > 34.1574 )
								if( mf <= -0.052411 )
									ret := 0.750000 // buy
								if( mf > -0.052411 )
									ret := 0.400000
						if( ad > -5.71891e+10 )
							if( ad_mf <= 1.43911e+12 )
								if( ad_mf <= 2.39907e+11 )
									ret := -0.012422
								if( ad_mf > 2.39907e+11 )
									ret := -0.243169
							if( ad_mf > 1.43911e+12 )
								if( smoothD_d <= 7.69743 )
									ret := 0.375000
								if( smoothD_d > 7.69743 )
									ret := 0.875000 // buy
					if( k > 27.4134 )
						if( rsi1 <= 54.6607 )
							if( smoothK_k <= 24.4879 )
								ret := 0.850000 // buy
							if( smoothK_k > 24.4879 )
								if( ad_mf <= 1.14113e+12 )
									ret := 0.090346
								if( ad_mf > 1.14113e+12 )
									ret := 0.900000 // buy
						if( rsi1 > 54.6607 )
							if( mf <= 0.22085 )
								if( d_k <= -17.5121 )
									ret := -0.208333
								if( d_k > -17.5121 )
									ret := 0.432624
							if( mf > 0.22085 )
								ret := -0.263158
				if( d_k > -3.55477 )
					if( mf <= -0.090767 )
						if( rsi1 <= 31.847 )
							if( rsi1 <= 27.592 )
								if( k <= 29.54 )
									ret := 0.024540
								if( k > 29.54 )
									ret := -0.538462
							if( rsi1 > 27.592 )
								if( d_k <= -0.041002 )
									ret := -0.368132
								if( d_k > -0.041002 )
									ret := 0.333333
						if( rsi1 > 31.847 )
							if( k <= 35.2167 )
								if( ad_mf <= 1.17924e+11 )
									ret := 0.037175
								if( ad_mf > 1.17924e+11 )
									ret := 0.575758
							if( k > 35.2167 )
								if( d <= 34.8269 )
									ret := -0.333333
								if( d > 34.8269 )
									ret := -0.642857
					if( mf > -0.090767 )
						if( rsi1 <= 48.245 )
							if( ad <= -6.41265e+10 )
								if( mf <= -0.015778 )
									ret := 0.000000
								if( mf > -0.015778 )
									ret := -0.772727 // sell
							if( ad > -6.41265e+10 )
								if( rsi1 <= 22.768 )
									ret := -0.438806
								if( rsi1 > 22.768 )
									ret := -0.171964
						if( rsi1 > 48.245 )
							if( d <= 14.8444 )
								if( ad <= -5.15829e+10 )
									ret := 0.692308
								if( ad > -5.15829e+10 )
									ret := -0.082160
							if( d > 14.8444 )
								if( ad <= -2.28866e+10 )
									ret := 0.461538
								if( ad > -2.28866e+10 )
									ret := 0.074144
			if( d_k > 0.463883 )
				if( rsi1 <= 45.2555 )
					if( rsi1 <= 23.929 )
						if( d <= 38.0857 )
							if( mf <= -0.248946 )
								if( d_k <= 3.31126 )
									ret := 0.769231 // buy
								if( d_k > 3.31126 )
									ret := -0.235294
							if( mf > -0.248946 )
								if( mf <= -0.042921 )
									ret := -0.469526
								if( mf > -0.042921 )
									ret := -0.625000
						if( d > 38.0857 )
							if( d_k <= 25.4635 )
								if( smoothK_k <= 24.8914 )
									ret := -0.791667 // sell
								if( smoothK_k > 24.8914 )
									ret := -1.000000 // sell
							if( d_k > 25.4635 )
								ret := 0.000000
					if( rsi1 > 23.929 )
						if( d <= 24.939 )
							if( k <= 20.3791 )
								if( d_k <= 3.40023 )
									ret := -0.246777
								if( d_k > 3.40023 )
									ret := -0.321244
							if( k > 20.3791 )
								if( rsi1 <= 33.224 )
									ret := -0.317073
								if( rsi1 > 33.224 )
									ret := 0.179487
						if( d > 24.939 )
							if( smoothK_k <= 16.606 )
								if( ad_mf <= 2.28149e+11 )
									ret := -0.547131
								if( ad_mf > 2.28149e+11 )
									ret := 0.000000
							if( smoothK_k > 16.606 )
								if( rsi1 <= 38.6638 )
									ret := -0.417178
								if( rsi1 > 38.6638 )
									ret := -0.223423
				if( rsi1 > 45.2555 )
					if( smoothD_d <= 38.4661 )
						if( smoothK_k <= 25.2505 )
							if( mf <= 0.26213 )
								if( ad <= 4.46402e+10 )
									ret := -0.076753
								if( ad > 4.46402e+10 )
									ret := -0.233422
							if( mf > 0.26213 )
								if( d_k <= 3.76483 )
									ret := 0.111111
								if( d_k > 3.76483 )
									ret := -0.556818
						if( smoothK_k > 25.2505 )
							if( k <= 32.0202 )
								if( smoothD_d <= 27.7595 )
									ret := -0.692308
								if( smoothD_d > 27.7595 )
									ret := 0.241758
							if( k > 32.0202 )
								if( ad <= 1.80777e+09 )
									ret := 0.064815
								if( ad > 1.80777e+09 )
									ret := -0.233533
					if( smoothD_d > 38.4661 )
						if( mf <= 0.070001 )
							if( mf <= 0.03295 )
								if( rsi1 <= 57.5526 )
									ret := -0.341538
								if( rsi1 > 57.5526 )
									ret := 0.081967
							if( mf > 0.03295 )
								if( ad <= 2.10082e+09 )
									ret := 0.451613
								if( ad > 2.10082e+09 )
									ret := -0.204301
						if( mf > 0.070001 )
							if( smoothK_k <= 12.3007 )
								ret := -0.933333 // sell
							if( smoothK_k > 12.3007 )
								if( k <= 33.5829 )
									ret := -0.297082
								if( k > 33.5829 )
									ret := -0.432161
	if( k > 36.9866 )
		if( ad <= 1.35086e+11 )
			if( smoothD_d <= 41.9718 )
				if( rsi1 <= 53.3362 )
					if( k <= 49.6472 )
						if( ad_mf <= -2.69575e+10 )
							if( rsi1 <= 38.0385 )
								if( ad_mf <= -9.50911e+10 )
									ret := -0.047847
								if( ad_mf > -9.50911e+10 )
									ret := 0.196532
							if( rsi1 > 38.0385 )
								if( smoothK_k <= 35.9491 )
									ret := 0.538095
								if( smoothK_k > 35.9491 )
									ret := 0.284539
						if( ad_mf > -2.69575e+10 )
							if( ad_mf <= 6.56325e+10 )
								if( d_k <= -5.98612 )
									ret := 0.180239
								if( d_k > -5.98612 )
									ret := -0.028612
							if( ad_mf > 6.56325e+10 )
								if( d_k <= 0.741077 )
									ret := -0.055710
								if( d_k > 0.741077 )
									ret := -0.545455
					if( k > 49.6472 )
						if( mf <= -0.107264 )
							if( mf <= -0.134491 )
								if( ad_mf <= -3.77594e+10 )
									ret := 0.472527
								if( ad_mf > -3.77594e+10 )
									ret := 0.194444
							if( mf > -0.134491 )
								if( ad_mf <= 4.10702e+10 )
									ret := 0.682243
								if( ad_mf > 4.10702e+10 )
									ret := 0.071429
						if( mf > -0.107264 )
							if( smoothK_k <= 48.2486 )
								if( ad_mf <= -3.85125e+10 )
									ret := 0.692308
								if( ad_mf > -3.85125e+10 )
									ret := 0.259843
							if( smoothK_k > 48.2486 )
								if( smoothK_k <= 48.4992 )
									ret := -0.250000
								if( smoothK_k > 48.4992 )
									ret := 0.199721
				if( rsi1 > 53.3362 )
					if( d_k <= 0.745896 )
						if( ad <= 8.02684e+10 )
							if( mf <= -0.12413 )
								if( ad <= -3.05132e+10 )
									ret := 0.354839
								if( ad > -3.05132e+10 )
									ret := -0.087719
							if( mf > -0.12413 )
								if( mf <= 0.144326 )
									ret := 0.450923
								if( mf > 0.144326 )
									ret := 0.269531
						if( ad > 8.02684e+10 )
							if( k <= 47.97 )
								if( ad_mf <= 1.09884e+11 )
									ret := -0.117647
								if( ad_mf > 1.09884e+11 )
									ret := -0.580645
							if( k > 47.97 )
								if( ad_mf <= 8.72885e+10 )
									ret := -0.583333
								if( ad_mf > 8.72885e+10 )
									ret := 0.270833
					if( d_k > 0.745896 )
						if( rsi1 <= 62.9753 )
							if( smoothK_k <= 35.6743 )
								if( k <= 37.4477 )
									ret := 0.230769
								if( k > 37.4477 )
									ret := -0.565217
							if( smoothK_k > 35.6743 )
								if( mf <= 0.105246 )
									ret := 0.234043
								if( mf > 0.105246 )
									ret := -0.300000
						if( rsi1 > 62.9753 )
							if( d_k <= 2.93965 )
								if( k <= 39.265 )
									ret := 0.900000 // buy
								if( k > 39.265 )
									ret := 0.384615
							if( d_k > 2.93965 )
								ret := 0.055556
			if( smoothD_d > 41.9718 )
				if( rsi1 <= 53.3505 )
					if( mf <= -0.175563 )
						if( ad_mf <= -4.99003e+10 )
							if( k <= 52.024 )
								if( d_k <= 1.58106 )
									ret := -0.916667 // sell
								if( d_k > 1.58106 )
									ret := 0.181818
							if( k > 52.024 )
								if( d_k <= -12.7465 )
									ret := 0.696203
								if( d_k > -12.7465 )
									ret := 0.353448
						if( ad_mf > -4.99003e+10 )
							if( k <= 41.0937 )
								ret := 0.523810
							if( k > 41.0937 )
								if( d_k <= 4.10565 )
									ret := 0.064426
								if( d_k > 4.10565 )
									ret := -0.157025
					if( mf > -0.175563 )
						if( d_k <= -1.29603 )
							if( ad <= -0.003362 )
								if( k <= 59.6579 )
									ret := -0.027778
								if( k > 59.6579 )
									ret := 0.192610
							if( ad > -0.003362 )
								if( d_k <= -6.33315 )
									ret := 0.090596
								if( d_k > -6.33315 )
									ret := -0.040854
						if( d_k > -1.29603 )
							if( ad <= -2.21151e+10 )
								if( rsi1 <= 44.0394 )
									ret := -0.174238
								if( rsi1 > 44.0394 )
									ret := -0.050472
							if( ad > -2.21151e+10 )
								if( smoothK_k <= 82.4988 )
									ret := -0.297502
								if( smoothK_k > 82.4988 )
									ret := 0.007952
				if( rsi1 > 53.3505 )
					if( d_k <= -0.141729 )
						if( rsi1 <= 69.2367 )
							if( smoothD_d <= 75.8278 )
								if( d_k <= -4.67095 )
									ret := 0.362680
								if( d_k > -4.67095 )
									ret := 0.204235
							if( smoothD_d > 75.8278 )
								if( ad <= -6.87763e+11 )
									ret := -0.818182 // sell
								if( ad > -6.87763e+11 )
									ret := 0.225400
						if( rsi1 > 69.2367 )
							if( smoothD_d <= 59.3206 )
								if( smoothK_k <= 54.1292 )
									ret := 0.788462 // buy
								if( smoothK_k > 54.1292 )
									ret := 0.597173
							if( smoothD_d > 59.3206 )
								if( ad <= -1.45383e+11 )
									ret := -0.156716
								if( ad > -1.45383e+11 )
									ret := 0.488312
					if( d_k > -0.141729 )
						if( rsi1 <= 71.6691 )
							if( mf <= -0.052504 )
								if( smoothK_k <= 91.2586 )
									ret := 0.173045
								if( smoothK_k > 91.2586 )
									ret := -0.038961
							if( mf > -0.052504 )
								if( k <= 82.7979 )
									ret := -0.040734
								if( k > 82.7979 )
									ret := 0.071220
						if( rsi1 > 71.6691 )
							if( smoothK_k <= 40.9621 )
								if( ad_mf <= 2.64598e+10 )
									ret := -0.062500
								if( ad_mf > 2.64598e+10 )
									ret := -0.714286 // sell
							if( smoothK_k > 40.9621 )
								if( ad_mf <= -8.71845e+10 )
									ret := -0.101928
								if( ad_mf > -8.71845e+10 )
									ret := 0.260462
		if( ad > 1.35086e+11 )
			if( d_k <= -2.57362 )
				if( ad <= 2.74627e+11 )
					if( mf <= -0.171611 )
						if( d_k <= -14.0929 )
							ret := 0.521739
						if( d_k > -14.0929 )
							ret := 0.920000 // buy
					if( mf > -0.171611 )
						if( d_k <= -3.38542 )
							if( d_k <= -14.0075 )
								if( smoothK_k <= 58.3447 )
									ret := 0.424837
								if( smoothK_k > 58.3447 )
									ret := 0.161905
							if( d_k > -14.0075 )
								if( ad_mf <= 2.11191e+11 )
									ret := -0.033973
								if( ad_mf > 2.11191e+11 )
									ret := 0.206704
						if( d_k > -3.38542 )
							if( smoothK_k <= 83.8041 )
								if( smoothD_d <= 35.0774 )
									ret := 0.900000 // buy
								if( smoothD_d > 35.0774 )
									ret := 0.525641
							if( smoothK_k > 83.8041 )
								if( d <= 92.2208 )
									ret := -0.368421
								if( d > 92.2208 )
									ret := 0.458333
				if( ad > 2.74627e+11 )
					if( ad <= 8.49087e+11 )
						if( ad_mf <= 6.42497e+11 )
							if( k <= 88.8599 )
								if( d_k <= -24.0607 )
									ret := -0.806452 // sell
								if( d_k > -24.0607 )
									ret := -0.008245
							if( k > 88.8599 )
								if( ad_mf <= 2.91661e+11 )
									ret := 0.526316
								if( ad_mf > 2.91661e+11 )
									ret := -0.407767
						if( ad_mf > 6.42497e+11 )
							if( ad_mf <= 6.52834e+11 )
								ret := -1.000000 // sell
							if( ad_mf > 6.52834e+11 )
								if( ad_mf <= 8.04128e+11 )
									ret := -0.227273
								if( ad_mf > 8.04128e+11 )
									ret := -0.883721 // sell
					if( ad > 8.49087e+11 )
						if( smoothD_d <= 71.4421 )
							if( ad <= 9.47666e+11 )
								if( d_k <= -12.7619 )
									ret := -0.928571 // sell
								if( d_k > -12.7619 )
									ret := 0.325581
							if( ad > 9.47666e+11 )
								if( mf <= 0.024017 )
									ret := 0.912281 // buy
								if( mf > 0.024017 )
									ret := 0.409302
						if( smoothD_d > 71.4421 )
							if( smoothD_d <= 87.9308 )
								if( ad_mf <= 9.60677e+11 )
									ret := 1.000000 // buy
								if( ad_mf > 9.60677e+11 )
									ret := -0.105691
							if( smoothD_d > 87.9308 )
								if( rsi1 <= 68.7735 )
									ret := 0.166667
								if( rsi1 > 68.7735 )
									ret := -0.800000 // sell
			if( d_k > -2.57362 )
				if( rsi1 <= 69.0012 )
					if( ad_mf <= 1.4634e+11 )
						if( k <= 92.3557 )
							if( ad <= 1.42946e+11 )
								if( k <= 52.8318 )
									ret := -0.541667
								if( k > 52.8318 )
									ret := -0.887640 // sell
							if( ad > 1.42946e+11 )
								if( ad <= 1.44114e+11 )
									ret := 0.153846
								if( ad > 1.44114e+11 )
									ret := -0.806452 // sell
						if( k > 92.3557 )
							ret := -0.200000
					if( ad_mf > 1.4634e+11 )
						if( mf <= 0.277127 )
							if( d <= 88.5848 )
								if( mf <= -0.13683 )
									ret := 0.411765
								if( mf > -0.13683 )
									ret := -0.168937
							if( d > 88.5848 )
								if( d_k <= -1.18724 )
									ret := 0.049180
								if( d_k > -1.18724 )
									ret := -0.547619
						if( mf > 0.277127 )
							if( ad_mf <= 3.83637e+11 )
								if( ad <= 2.5588e+11 )
									ret := -0.827586 // sell
								if( ad > 2.5588e+11 )
									ret := -0.250000
							if( ad_mf > 3.83637e+11 )
								if( ad_mf <= 5.47257e+11 )
									ret := -0.888889 // sell
								if( ad_mf > 5.47257e+11 )
									ret := -1.000000 // sell
				if( rsi1 > 69.0012 )
					if( mf <= -0.132542 )
						ret := 1.000000 // buy
					if( mf > -0.132542 )
						if( ad_mf <= 1.92696e+11 )
							if( smoothD_d <= 69.8845 )
								if( d_k <= 9.44203 )
									ret := 0.030303
								if( d_k > 9.44203 )
									ret := -0.866667 // sell
							if( smoothD_d > 69.8845 )
								if( d_k <= 5.77556 )
									ret := 0.412214
								if( d_k > 5.77556 )
									ret := -0.111111
						if( ad_mf > 1.92696e+11 )
							if( d_k <= -0.428944 )
								if( ad <= 4.51029e+11 )
									ret := -0.537037
								if( ad > 4.51029e+11 )
									ret := -0.097561
							if( d_k > -0.428944 )
								if( d_k <= 7.2181 )
									ret := 0.067729
								if( d_k > 7.2181 )
									ret := -0.366667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_8f27caad(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


