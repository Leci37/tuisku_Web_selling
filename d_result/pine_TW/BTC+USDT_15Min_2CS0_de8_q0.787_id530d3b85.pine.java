//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: BTCUSDT_15Min_2CS0_530d3b85 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_2CS0_530d3b85", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_530d3b85(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 62.5796 )
		if( smoothK_k <= 12.0163 )
			if( ad <= -523.829 )
				if( d <= 6.73066 )
					if( ad_mf <= -1829.21 )
						if( d_k <= 2.90285 )
							if( ad_mf <= -2399.51 )
								if( mf <= -0.16567 )
									ret := -0.371681
								if( mf > -0.16567 )
									ret := 0.132530
							if( ad_mf > -2399.51 )
								if( mf <= 0.07972 )
									ret := 0.489051
								if( mf > 0.07972 )
									ret := -0.588235
						if( d_k > 2.90285 )
							if( d <= 5.89763 )
								if( d_k <= 3.25252 )
									ret := 1.000000 // buy
								if( d_k > 3.25252 )
									ret := 0.690909
							if( d > 5.89763 )
								ret := 0.384615
					if( ad_mf > -1829.21 )
						if( ad_mf <= -530.861 )
							if( d_k <= 1.09521 )
								if( smoothD_d <= -2.48382 )
									ret := -0.587719
								if( smoothD_d > -2.48382 )
									ret := -0.345667
							if( d_k > 1.09521 )
								if( rsi1 <= 14.9965 )
									ret := -0.642857
								if( rsi1 > 14.9965 )
									ret := -0.024229
						if( ad_mf > -530.861 )
							ret := 0.722222 // buy
				if( d > 6.73066 )
					if( ad_mf <= -6504.76 )
						if( k <= 10.5247 )
							if( k <= 5.40799 )
								if( ad <= -8163.58 )
									ret := 1.000000 // buy
								if( ad > -8163.58 )
									ret := 0.846154 // buy
							if( k > 5.40799 )
								if( mf <= -0.162505 )
									ret := 1.000000 // buy
								if( mf > -0.162505 )
									ret := 0.555556
						if( k > 10.5247 )
							ret := 0.000000
					if( ad_mf > -6504.76 )
						if( rsi1 <= 38.2391 )
							if( d_k <= -4.42854 )
								if( smoothD_d <= 4.19087 )
									ret := -1.000000 // sell
								if( smoothD_d > 4.19087 )
									ret := -0.239130
							if( d_k > -4.42854 )
								if( rsi1 <= 18.6267 )
									ret := -0.171053
								if( rsi1 > 18.6267 )
									ret := 0.185358
						if( rsi1 > 38.2391 )
							if( mf <= -0.003924 )
								if( ad_mf <= -2937.4 )
									ret := -0.675000
								if( ad_mf > -2937.4 )
									ret := 0.102326
							if( mf > -0.003924 )
								if( ad_mf <= -630.443 )
									ret := -0.174699
								if( ad_mf > -630.443 )
									ret := -0.500000
			if( ad > -523.829 )
				if( rsi1 <= 31.6822 )
					if( smoothK_k <= -0.484977 )
						if( ad_mf <= 896.641 )
							if( smoothD_d <= -1.2115 )
								if( ad_mf <= -485.14 )
									ret := -1.000000 // sell
								if( ad_mf > -485.14 )
									ret := -0.796631 // sell
							if( smoothD_d > -1.2115 )
								if( mf <= -0.05323 )
									ret := -0.514286
								if( mf > -0.05323 )
									ret := -0.717849 // sell
						if( ad_mf > 896.641 )
							if( ad_mf <= 1093.51 )
								if( smoothK_k <= -1.54396 )
									ret := 0.807692 // buy
								if( smoothK_k > -1.54396 )
									ret := -0.500000
							if( ad_mf > 1093.51 )
								if( mf <= -0.143963 )
									ret := -0.500000
								if( mf > -0.143963 )
									ret := -0.008621
					if( smoothK_k > -0.484977 )
						if( d <= 4.20549 )
							if( ad <= 1263.36 )
								if( rsi1 <= 10.5194 )
									ret := -0.083333
								if( rsi1 > 10.5194 )
									ret := -0.676279
							if( ad > 1263.36 )
								if( mf <= 0.047228 )
									ret := 0.233766
								if( mf > 0.047228 )
									ret := -0.391304
						if( d > 4.20549 )
							if( k <= 11.7964 )
								if( mf <= -0.128331 )
									ret := 0.043716
								if( mf > -0.128331 )
									ret := -0.489760
							if( k > 11.7964 )
								if( mf <= -0.07534 )
									ret := -0.399340
								if( mf > -0.07534 )
									ret := -0.655577
				if( rsi1 > 31.6822 )
					if( mf <= -0.046655 )
						if( ad <= 867.833 )
							if( smoothD_d <= 23.9859 )
								if( rsi1 <= 43.2423 )
									ret := -0.202801
								if( rsi1 > 43.2423 )
									ret := -0.033283
							if( smoothD_d > 23.9859 )
								if( rsi1 <= 48.5824 )
									ret := -0.567164
								if( rsi1 > 48.5824 )
									ret := 0.148148
						if( ad > 867.833 )
							if( smoothD_d <= 1.13756 )
								if( smoothK_k <= 1.0809 )
									ret := -0.882353 // sell
								if( smoothK_k > 1.0809 )
									ret := -0.250000
							if( smoothD_d > 1.13756 )
								if( ad_mf <= 966.904 )
									ret := 0.578947
								if( ad_mf > 966.904 )
									ret := 0.060897
					if( mf > -0.046655 )
						if( ad_mf <= -95.3079 )
							if( d <= 6.64069 )
								if( rsi1 <= 53.6842 )
									ret := -0.459750
								if( rsi1 > 53.6842 )
									ret := 0.128713
							if( d > 6.64069 )
								if( ad <= -511.965 )
									ret := -0.862069 // sell
								if( ad > -511.965 )
									ret := -0.122969
						if( ad_mf > -95.3079 )
							if( rsi1 <= 40.5023 )
								if( ad_mf <= 1021.07 )
									ret := -0.564988
								if( ad_mf > 1021.07 )
									ret := -0.030879
							if( rsi1 > 40.5023 )
								if( rsi1 <= 61.8785 )
									ret := -0.320565
								if( rsi1 > 61.8785 )
									ret := -0.005063
		if( smoothK_k > 12.0163 )
			if( ad <= -3.4596 )
				if( smoothD_d <= 11.0443 )
					if( rsi1 <= 37.9348 )
						if( ad <= -828.305 )
							if( mf <= -0.020449 )
								if( ad_mf <= -3392.44 )
									ret := 0.235294
								if( ad_mf > -3392.44 )
									ret := -0.420455
							if( mf > -0.020449 )
								ret := 0.736842 // buy
						if( ad > -828.305 )
							if( d_k <= -6.57983 )
								if( d <= 8.23256 )
									ret := -0.590164
								if( d > 8.23256 )
									ret := -0.781759 // sell
							if( d_k > -6.57983 )
								if( rsi1 <= 33.1196 )
									ret := -0.639344
								if( rsi1 > 33.1196 )
									ret := -0.151515
					if( rsi1 > 37.9348 )
						if( ad <= -2909.39 )
							ret := 0.764706 // buy
						if( ad > -2909.39 )
							if( smoothK_k <= 12.3578 )
								if( d_k <= -5.92563 )
									ret := 0.076923
								if( d_k > -5.92563 )
									ret := 0.789474 // buy
							if( smoothK_k > 12.3578 )
								if( smoothD_d <= 5.82104 )
									ret := -0.439560
								if( smoothD_d > 5.82104 )
									ret := -0.103741
				if( smoothD_d > 11.0443 )
					if( k <= 44.2973 )
						if( rsi1 <= 52.8219 )
							if( ad <= -493.255 )
								if( smoothK_k <= 26.1755 )
									ret := 0.196078
								if( smoothK_k > 26.1755 )
									ret := -0.019253
							if( ad > -493.255 )
								if( smoothD_d <= 36.5097 )
									ret := -0.166294
								if( smoothD_d > 36.5097 )
									ret := -0.324264
						if( rsi1 > 52.8219 )
							if( smoothD_d <= 27.5265 )
								if( rsi1 <= 57.1243 )
									ret := 0.097345
								if( rsi1 > 57.1243 )
									ret := 0.425150
							if( smoothD_d > 27.5265 )
								if( smoothK_k <= 23.9174 )
									ret := -0.169444
								if( smoothK_k > 23.9174 )
									ret := 0.123774
					if( k > 44.2973 )
						if( rsi1 <= 49.2103 )
							if( smoothD_d <= 26.5117 )
								if( rsi1 <= 39.2923 )
									ret := -0.705882 // sell
								if( rsi1 > 39.2923 )
									ret := -0.220339
							if( smoothD_d > 26.5117 )
								if( ad_mf <= -88.4181 )
									ret := 0.025355
								if( ad_mf > -88.4181 )
									ret := -0.211314
						if( rsi1 > 49.2103 )
							if( d <= 48.5344 )
								if( ad <= -308.494 )
									ret := 0.275463
								if( ad > -308.494 )
									ret := 0.438144
							if( d > 48.5344 )
								if( ad <= -697.727 )
									ret := -0.160494
								if( ad > -697.727 )
									ret := 0.181441
			if( ad > -3.4596 )
				if( smoothK_k <= 24.2846 )
					if( rsi1 <= 55.3827 )
						if( ad <= 883.381 )
							if( rsi1 <= 38.7605 )
								if( mf <= -0.044835 )
									ret := -0.281207
								if( mf > -0.044835 )
									ret := -0.598077
							if( rsi1 > 38.7605 )
								if( ad <= 75.8974 )
									ret := -0.239264
								if( ad > 75.8974 )
									ret := -0.362027
						if( ad > 883.381 )
							if( rsi1 <= 40.7121 )
								if( d_k <= 10.332 )
									ret := 0.140078
								if( d_k > 10.332 )
									ret := -0.403226
							if( rsi1 > 40.7121 )
								if( mf <= 0.196199 )
									ret := -0.238690
								if( mf > 0.196199 )
									ret := -0.875000 // sell
					if( rsi1 > 55.3827 )
						if( smoothD_d <= 4.22677 )
							ret := -0.909091 // sell
						if( smoothD_d > 4.22677 )
							if( d <= 51.5234 )
								if( mf <= 0.048271 )
									ret := 0.253425
								if( mf > 0.048271 )
									ret := -0.046814
							if( d > 51.5234 )
								if( ad <= 643.812 )
									ret := 0.500000
								if( ad > 643.812 )
									ret := 1.000000 // buy
				if( smoothK_k > 24.2846 )
					if( d_k <= 3.00965 )
						if( ad <= 7491.05 )
							if( rsi1 <= 53.2607 )
								if( d_k <= -11.2803 )
									ret := -0.237246
								if( d_k > -11.2803 )
									ret := -0.062132
							if( rsi1 > 53.2607 )
								if( ad_mf <= 411.775 )
									ret := 0.178696
								if( ad_mf > 411.775 )
									ret := -0.069187
						if( ad > 7491.05 )
							if( d_k <= -7.66361 )
								if( k <= 52.7629 )
									ret := 1.000000 // buy
								if( k > 52.7629 )
									ret := 0.764706 // buy
							if( d_k > -7.66361 )
								if( ad <= 9071.29 )
									ret := 0.647059
								if( ad > 9071.29 )
									ret := -1.000000 // sell
					if( d_k > 3.00965 )
						if( rsi1 <= 50.1261 )
							if( ad <= 292.186 )
								if( ad <= 42.0394 )
									ret := -0.281768
								if( ad > 42.0394 )
									ret := -0.485161
							if( ad > 292.186 )
								if( ad_mf <= 487.389 )
									ret := -0.106599
								if( ad_mf > 487.389 )
									ret := -0.316993
						if( rsi1 > 50.1261 )
							if( d <= 72.5003 )
								if( d_k <= 18.4144 )
									ret := -0.119588
								if( d_k > 18.4144 )
									ret := 0.153061
							if( d > 72.5003 )
								if( rsi1 <= 65.3307 )
									ret := 0.223022
								if( rsi1 > 65.3307 )
									ret := 0.669903
	if( k > 62.5796 )
		if( rsi1 <= 67.8924 )
			if( rsi1 <= 47.4492 )
				if( mf <= -0.110443 )
					if( ad <= -323.682 )
						if( rsi1 <= 29.1592 )
							if( d <= 68.3819 )
								if( ad <= -689.228 )
									ret := 0.555556
								if( ad > -689.228 )
									ret := -0.100000
							if( d > 68.3819 )
								if( ad_mf <= -1390.85 )
									ret := -0.166667
								if( ad_mf > -1390.85 )
									ret := -0.566667
						if( rsi1 > 29.1592 )
							if( rsi1 <= 45.2786 )
								if( d_k <= -0.05297 )
									ret := 0.632653
								if( d_k > -0.05297 )
									ret := 0.288732
							if( rsi1 > 45.2786 )
								if( smoothD_d <= 77.7863 )
									ret := -0.051724
								if( smoothD_d > 77.7863 )
									ret := 0.282609
					if( ad > -323.682 )
						if( ad_mf <= 1503.92 )
							if( smoothK_k <= 88.9025 )
								if( rsi1 <= 34.4447 )
									ret := -0.427948
								if( rsi1 > 34.4447 )
									ret := 0.029613
							if( smoothK_k > 88.9025 )
								if( d_k <= -10.2448 )
									ret := 0.532468
								if( d_k > -10.2448 )
									ret := -0.116935
						if( ad_mf > 1503.92 )
							if( smoothK_k <= 66.7282 )
								ret := -0.384615
							if( smoothK_k > 66.7282 )
								if( smoothK_k <= 95.9439 )
									ret := 0.885714 // buy
								if( smoothK_k > 95.9439 )
									ret := 0.125000
				if( mf > -0.110443 )
					if( rsi1 <= 33.664 )
						if( rsi1 <= 20.9569 )
							ret := 0.666667
						if( rsi1 > 20.9569 )
							if( ad <= -555.743 )
								if( d_k <= 4.21658 )
									ret := -0.047619
								if( d_k > 4.21658 )
									ret := 0.571429
							if( ad > -555.743 )
								if( ad_mf <= 887.327 )
									ret := -0.496914
								if( ad_mf > 887.327 )
									ret := 0.000000
					if( rsi1 > 33.664 )
						if( smoothD_d <= 86.4066 )
							if( ad_mf <= -240.867 )
								if( ad <= -2285.46 )
									ret := -0.148515
								if( ad > -2285.46 )
									ret := 0.234940
							if( ad_mf > -240.867 )
								if( k <= 71.3354 )
									ret := -0.205036
								if( k > 71.3354 )
									ret := 0.064123
						if( smoothD_d > 86.4066 )
							if( rsi1 <= 41.3034 )
								if( mf <= -0.044615 )
									ret := -0.618644
								if( mf > -0.044615 )
									ret := -0.109375
							if( rsi1 > 41.3034 )
								if( mf <= -0.031487 )
									ret := 0.067114
								if( mf > -0.031487 )
									ret := -0.192878
			if( rsi1 > 47.4492 )
				if( d_k <= -12.8903 )
					if( rsi1 <= 54.8935 )
						if( k <= 70.4001 )
							if( k <= 69.6638 )
								if( rsi1 <= 54.1879 )
									ret := 0.424658
								if( rsi1 > 54.1879 )
									ret := -0.261905
							if( k > 69.6638 )
								if( ad_mf <= 113.12 )
									ret := 0.611111
								if( ad_mf > 113.12 )
									ret := 0.931034 // buy
						if( k > 70.4001 )
							if( k <= 73.9723 )
								if( smoothD_d <= 55.1482 )
									ret := -0.129944
								if( smoothD_d > 55.1482 )
									ret := 0.642857
							if( k > 73.9723 )
								if( mf <= -0.030466 )
									ret := 0.307143
								if( mf > -0.030466 )
									ret := 0.097847
					if( rsi1 > 54.8935 )
						if( ad <= 541.341 )
							if( ad <= -637.75 )
								if( smoothD_d <= 62.704 )
									ret := 0.319444
								if( smoothD_d > 62.704 )
									ret := -0.325301
							if( ad > -637.75 )
								if( ad_mf <= -93.0503 )
									ret := 0.669342
								if( ad_mf > -93.0503 )
									ret := 0.393477
						if( ad > 541.341 )
							if( smoothK_k <= 94.2997 )
								if( ad_mf <= 1166.34 )
									ret := -0.392857
								if( ad_mf > 1166.34 )
									ret := 0.058511
							if( smoothK_k > 94.2997 )
								if( ad_mf <= 728.207 )
									ret := 0.928571 // buy
								if( ad_mf > 728.207 )
									ret := 0.129032
				if( d_k > -12.8903 )
					if( ad <= 485.409 )
						if( d <= 78.7513 )
							if( ad <= -55.7241 )
								if( d <= 54.9828 )
									ret := 0.666667
								if( d > 54.9828 )
									ret := 0.158998
							if( ad > -55.7241 )
								if( rsi1 <= 55.9947 )
									ret := -0.086207
								if( rsi1 > 55.9947 )
									ret := 0.092748
						if( d > 78.7513 )
							if( ad_mf <= -663.723 )
								if( smoothD_d <= 81.5338 )
									ret := 0.158470
								if( smoothD_d > 81.5338 )
									ret := -0.097518
							if( ad_mf > -663.723 )
								if( ad_mf <= 48.0346 )
									ret := 0.391693
								if( ad_mf > 48.0346 )
									ret := 0.269404
					if( ad > 485.409 )
						if( ad <= 4014.94 )
							if( d_k <= 5.05401 )
								if( d_k <= 2.47071 )
									ret := -0.063254
								if( d_k > 2.47071 )
									ret := -0.269327
							if( d_k > 5.05401 )
								if( rsi1 <= 65.1241 )
									ret := 0.053381
								if( rsi1 > 65.1241 )
									ret := 0.380000
						if( ad > 4014.94 )
							if( d <= 78.3359 )
								if( k <= 75.4313 )
									ret := -0.128205
								if( k > 75.4313 )
									ret := 0.608696
							if( d > 78.3359 )
								if( rsi1 <= 58.1949 )
									ret := -0.480000
								if( rsi1 > 58.1949 )
									ret := -0.900000 // sell
		if( rsi1 > 67.8924 )
			if( ad_mf <= 646.913 )
				if( ad_mf <= -872.747 )
					if( d <= 92.43 )
						if( mf <= 0.145265 )
							if( mf <= 0.133959 )
								if( rsi1 <= 80.3276 )
									ret := 0.253927
								if( rsi1 > 80.3276 )
									ret := 0.625000
							if( mf > 0.133959 )
								ret := -0.538462
						if( mf > 0.145265 )
							if( ad <= -3135.52 )
								ret := -0.166667
							if( ad > -3135.52 )
								if( rsi1 <= 73.3213 )
									ret := 0.133333
								if( rsi1 > 73.3213 )
									ret := 0.696629
					if( d > 92.43 )
						if( rsi1 <= 84.5349 )
							if( mf <= -0.068351 )
								if( ad <= -2120.02 )
									ret := 0.520000
								if( ad > -2120.02 )
									ret := 0.076923
							if( mf > -0.068351 )
								if( rsi1 <= 76.4255 )
									ret := -0.299145
								if( rsi1 > 76.4255 )
									ret := 0.057692
						if( rsi1 > 84.5349 )
							if( k <= 99.9835 )
								if( mf <= 0.132295 )
									ret := 0.920000 // buy
								if( mf > 0.132295 )
									ret := 0.277778
							if( k > 99.9835 )
								ret := -0.266667
				if( ad_mf > -872.747 )
					if( rsi1 <= 77.5926 )
						if( mf <= 0.125502 )
							if( ad <= 397.83 )
								if( smoothK_k <= 94.8865 )
									ret := 0.615036
								if( smoothK_k > 94.8865 )
									ret := 0.686942
							if( ad > 397.83 )
								if( ad <= 420.864 )
									ret := -0.268293
								if( ad > 420.864 )
									ret := 0.487179
						if( mf > 0.125502 )
							if( rsi1 <= 71.0678 )
								if( ad_mf <= 584.702 )
									ret := 0.336765
								if( ad_mf > 584.702 )
									ret := -0.391304
							if( rsi1 > 71.0678 )
								if( smoothD_d <= 79.0034 )
									ret := 0.373362
								if( smoothD_d > 79.0034 )
									ret := 0.550143
					if( rsi1 > 77.5926 )
						if( ad_mf <= -410.921 )
							if( ad <= -449.231 )
								if( smoothD_d <= 94.5609 )
									ret := 0.761905 // buy
								if( smoothD_d > 94.5609 )
									ret := 0.170732
							if( ad > -449.231 )
								if( d_k <= 0.217412 )
									ret := 0.055556
								if( d_k > 0.217412 )
									ret := -1.000000 // sell
						if( ad_mf > -410.921 )
							if( rsi1 <= 83.0128 )
								if( smoothD_d <= 96.9999 )
									ret := 0.701668 // buy
								if( smoothD_d > 96.9999 )
									ret := 0.173913
							if( rsi1 > 83.0128 )
								if( k <= 80.8151 )
									ret := 0.437500
								if( k > 80.8151 )
									ret := 0.835159 // buy
			if( ad_mf > 646.913 )
				if( mf <= 0.23492 )
					if( rsi1 <= 81.0582 )
						if( smoothK_k <= 95.2687 )
							if( ad_mf <= 1652.36 )
								if( smoothK_k <= 89.672 )
									ret := 0.258944
								if( smoothK_k > 89.672 )
									ret := -0.034375
							if( ad_mf > 1652.36 )
								if( mf <= -0.009028 )
									ret := -0.688889
								if( mf > -0.009028 )
									ret := -0.040064
						if( smoothK_k > 95.2687 )
							if( k <= 98.6074 )
								if( d_k <= -2.89472 )
									ret := -0.655172
								if( d_k > -2.89472 )
									ret := -0.842105 // sell
							if( k > 98.6074 )
								if( d <= 83.5061 )
									ret := -0.800000 // sell
								if( d > 83.5061 )
									ret := -0.182131
					if( rsi1 > 81.0582 )
						if( k <= 83.1694 )
							if( mf <= 0.136594 )
								if( rsi1 <= 82.6921 )
									ret := -0.235294
								if( rsi1 > 82.6921 )
									ret := -0.666667
							if( mf > 0.136594 )
								if( ad <= 1901.58 )
									ret := 0.375000
								if( ad > 1901.58 )
									ret := -0.166667
						if( k > 83.1694 )
							if( ad <= 5774.42 )
								if( ad_mf <= 3014.17 )
									ret := 0.319620
								if( ad_mf > 3014.17 )
									ret := 0.766355 // buy
							if( ad > 5774.42 )
								if( k <= 98.8575 )
									ret := -0.482759
								if( k > 98.8575 )
									ret := 0.466667
				if( mf > 0.23492 )
					if( ad <= 6125.85 )
						if( k <= 79.1842 )
							if( d <= 77.6548 )
								if( ad <= 858.727 )
									ret := -0.952381 // sell
								if( ad > 858.727 )
									ret := -0.395833
							if( d > 77.6548 )
								if( k <= 76.2834 )
									ret := 0.500000
								if( k > 76.2834 )
									ret := -0.538462
						if( k > 79.1842 )
							if( ad_mf <= 2819.58 )
								if( mf <= 0.27706 )
									ret := 0.390625
								if( mf > 0.27706 )
									ret := 0.700000 // buy
							if( ad_mf > 2819.58 )
								if( d <= 85.834 )
									ret := 0.750000 // buy
								if( d > 85.834 )
									ret := -0.044944
					if( ad > 6125.85 )
						if( mf <= 0.311821 )
							if( ad <= 9380.05 )
								ret := 0.076923
							if( ad > 9380.05 )
								ret := -0.833333 // sell
						if( mf > 0.311821 )
							if( d_k <= -4.89589 )
								ret := -0.916667 // sell
							if( d_k > -4.89589 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_BTCUSDT_15Min_530d3b85(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


