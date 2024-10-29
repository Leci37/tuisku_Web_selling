//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: QCOM_15Min_2MS0_79a5580a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_15Min_2MS0_79a5580a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_15Min_79a5580a(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 645884 )
		if( rsi1 <= 50.9701 )
			if( smoothK_k <= 19.7054 )
				if( rsi1 <= 34.9741 )
					if( d <= 7.6551 )
						if( Typical_Price <= 82.0595 )
							if( Money_Flow_Ratio <= 0.00038 )
								if( Negative_Money_Flow_Sum <= 2.23596e+08 )
									ret := -0.153846
								if( Negative_Money_Flow_Sum > 2.23596e+08 )
									ret := -0.638889
							if( Money_Flow_Ratio > 0.00038 )
								if( Negative_Money_Flow <= 1.95792e+06 )
									ret := -0.024194
								if( Negative_Money_Flow > 1.95792e+06 )
									ret := -0.413043
						if( Typical_Price > 82.0595 )
							if( Money_Flow_Ratio <= 0.001437 )
								if( rsi1 <= 26.0887 )
									ret := 0.800000 // buy
								if( rsi1 > 26.0887 )
									ret := 0.142857
							if( Money_Flow_Ratio > 0.001437 )
								if( Negative_Money_Flow <= 3.70157e+07 )
									ret := 0.202381
								if( Negative_Money_Flow > 3.70157e+07 )
									ret := -0.369565
					if( d > 7.6551 )
						if( k <= 7.40161 )
							if( MFI_High <= -63.8691 )
								if( d_k <= 10.8684 )
									ret := 0.581395
								if( d_k > 10.8684 )
									ret := 0.033333
							if( MFI_High > -63.8691 )
								if( rsi1 <= 28.1348 )
									ret := 0.727273 // buy
								if( rsi1 > 28.1348 )
									ret := 0.973684 // buy
						if( k > 7.40161 )
							if( Money_Flow_Ratio <= 0.541078 )
								if( MFI <= 25.3518 )
									ret := 0.185984
								if( MFI > 25.3518 )
									ret := 0.616438
							if( Money_Flow_Ratio > 0.541078 )
								if( MFI_High <= -26.7857 )
									ret := -0.500000
								if( MFI_High > -26.7857 )
									ret := 0.666667
				if( rsi1 > 34.9741 )
					if( Positive_Money_Flow_Sum <= 171908 )
						if( Typical_Price <= 56.7233 )
							ret := -0.142857
						if( Typical_Price > 56.7233 )
							if( MFI_Low <= -9.29933 )
								ret := 0.333333
							if( MFI_Low > -9.29933 )
								ret := 0.952381 // buy
					if( Positive_Money_Flow_Sum > 171908 )
						if( Positive_Money_Flow_Sum <= 494686 )
							if( d_k <= 14.8077 )
								if( smoothD_d <= -0.685451 )
									ret := 0.500000
								if( smoothD_d > -0.685451 )
									ret := -0.264045
							if( d_k > 14.8077 )
								if( MFI_Low <= 5.42771 )
									ret := 0.361111
								if( MFI_Low > 5.42771 )
									ret := -0.333333
						if( Positive_Money_Flow_Sum > 494686 )
							if( Typical_Price <= 119.363 )
								if( Negative_Money_Flow_Sum <= 1.15663e+08 )
									ret := 0.251572
								if( Negative_Money_Flow_Sum > 1.15663e+08 )
									ret := -0.500000
							if( Typical_Price > 119.363 )
								if( k <= 20.092 )
									ret := -0.263736
								if( k > 20.092 )
									ret := 0.555556
			if( smoothK_k > 19.7054 )
				if( rsi1 <= 20.0136 )
					if( d_k <= -3.47204 )
						ret := -1.000000 // sell
					if( d_k > -3.47204 )
						ret := -0.428571
				if( rsi1 > 20.0136 )
					if( smoothD_d <= 29.2378 )
						if( Positive_Money_Flow <= 167107 )
							if( k <= 41.2565 )
								if( rsi1 <= 35.9793 )
									ret := 0.608696
								if( rsi1 > 35.9793 )
									ret := 0.216102
							if( k > 41.2565 )
								if( Negative_Money_Flow <= 70983.6 )
									ret := 0.700000 // buy
								if( Negative_Money_Flow > 70983.6 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow > 167107 )
							if( smoothD_d <= 18.9402 )
								ret := -0.066667
							if( smoothD_d > 18.9402 )
								ret := -0.352941
					if( smoothD_d > 29.2378 )
						if( Typical_Price <= 81.923 )
							if( Negative_Money_Flow_Sum <= 3.63247e+07 )
								if( Typical_Price <= 68.6051 )
									ret := 0.357143
								if( Typical_Price > 68.6051 )
									ret := 0.619792
							if( Negative_Money_Flow_Sum > 3.63247e+07 )
								if( Negative_Money_Flow_Sum <= 3.03311e+08 )
									ret := 0.038462
								if( Negative_Money_Flow_Sum > 3.03311e+08 )
									ret := 0.920000 // buy
						if( Typical_Price > 81.923 )
							if( MFI <= 60.7545 )
								if( Negative_Money_Flow_Sum <= 894128 )
									ret := -0.223464
								if( Negative_Money_Flow_Sum > 894128 )
									ret := 0.152833
							if( MFI > 60.7545 )
								ret := 0.937500 // buy
		if( rsi1 > 50.9701 )
			if( Positive_Money_Flow_Sum <= 493372 )
				if( d_k <= 4.54902 )
					if( k <= 27.7263 )
						if( Raw_Money_Flow <= 39390.6 )
							ret := -0.727273 // sell
						if( Raw_Money_Flow > 39390.6 )
							if( MFI_High <= -53.4629 )
								ret := 0.142857
							if( MFI_High > -53.4629 )
								if( MFI_High <= -45.7851 )
									ret := 0.666667
								if( MFI_High > -45.7851 )
									ret := 0.875000 // buy
					if( k > 27.7263 )
						if( MFI_High <= -36.7783 )
							if( MFI_High <= -70.0697 )
								if( Money_Flow_Ratio <= 0.053744 )
									ret := -0.227723
								if( Money_Flow_Ratio > 0.053744 )
									ret := 0.235294
							if( MFI_High > -70.0697 )
								if( Typical_Price <= 66.5356 )
									ret := -0.575221
								if( Typical_Price > 66.5356 )
									ret := -0.355828
						if( MFI_High > -36.7783 )
							if( Typical_Price <= 83.1445 )
								if( MFI_Low <= 52.8614 )
									ret := 0.476636
								if( MFI_Low > 52.8614 )
									ret := -0.666667
							if( Typical_Price > 83.1445 )
								if( k <= 86.0314 )
									ret := -0.562500
								if( k > 86.0314 )
									ret := 0.181818
				if( d_k > 4.54902 )
					if( Negative_Money_Flow <= 284754 )
						if( rsi1 <= 63.0343 )
							if( Typical_Price <= 58.6143 )
								if( rsi1 <= 58.5879 )
									ret := 0.718750 // buy
								if( rsi1 > 58.5879 )
									ret := -0.133333
							if( Typical_Price > 58.6143 )
								if( MFI <= 65.1303 )
									ret := -0.308081
								if( MFI > 65.1303 )
									ret := 0.785714 // buy
						if( rsi1 > 63.0343 )
							if( MFI_Low <= 22.6025 )
								if( Raw_Money_Flow <= 61736.4 )
									ret := 0.522727
								if( Raw_Money_Flow > 61736.4 )
									ret := -0.333333
							if( MFI_Low > 22.6025 )
								ret := 0.750000 // buy
					if( Negative_Money_Flow > 284754 )
						if( MFI_High <= -67.8124 )
							if( Typical_Price <= 86.0073 )
								if( d <= 68.7733 )
									ret := 0.545455
								if( d > 68.7733 )
									ret := 0.944444 // buy
							if( Typical_Price > 86.0073 )
								if( smoothD_d <= 69.0012 )
									ret := 0.636364
								if( smoothD_d > 69.0012 )
									ret := 0.090909
						if( MFI_High > -67.8124 )
							if( Negative_Money_Flow <= 365154 )
								ret := 0.363636
							if( Negative_Money_Flow > 365154 )
								ret := -0.083333
			if( Positive_Money_Flow_Sum > 493372 )
				if( k <= 38.8122 )
					if( smoothK_k <= 13.992 )
						if( d <= 11.3118 )
							ret := 0.090909
						if( d > 11.3118 )
							ret := 0.437500
					if( smoothK_k > 13.992 )
						if( Typical_Price <= 88.6897 )
							if( d_k <= -0.715884 )
								ret := -0.950000 // sell
							if( d_k > -0.715884 )
								ret := -0.652174
						if( Typical_Price > 88.6897 )
							if( Raw_Money_Flow <= 138961 )
								if( Typical_Price <= 116.915 )
									ret := 0.636364
								if( Typical_Price > 116.915 )
									ret := -0.105263
							if( Raw_Money_Flow > 138961 )
								if( smoothK_k <= 25.6921 )
									ret := -0.333333
								if( smoothK_k > 25.6921 )
									ret := -0.666667
				if( k > 38.8122 )
					if( Raw_Money_Flow <= 19215.8 )
						if( MFI_High <= -38.4182 )
							if( Negative_Money_Flow_Sum <= 7.71039e+06 )
								ret := 0.400000
							if( Negative_Money_Flow_Sum > 7.71039e+06 )
								ret := -0.363636
						if( MFI_High > -38.4182 )
							if( d_k <= -0.505069 )
								ret := -0.222222
							if( d_k > -0.505069 )
								if( Positive_Money_Flow <= 6748.8 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 6748.8 )
									ret := -0.750000 // sell
					if( Raw_Money_Flow > 19215.8 )
						if( Negative_Money_Flow <= 590819 )
							if( d_k <= -1.26289 )
								if( rsi1 <= 60.7299 )
									ret := 0.705357 // buy
								if( rsi1 > 60.7299 )
									ret := 0.299363
							if( d_k > -1.26289 )
								if( Raw_Money_Flow <= 213193 )
									ret := 0.041045
								if( Raw_Money_Flow > 213193 )
									ret := 0.483333
						if( Negative_Money_Flow > 590819 )
							if( MFI <= 0.4242 )
								ret := 0.692308
							if( MFI > 0.4242 )
								if( Money_Flow_Ratio <= 0.158568 )
									ret := -0.318182
								if( Money_Flow_Ratio > 0.158568 )
									ret := -0.760000 // sell
	if( Positive_Money_Flow_Sum > 645884 )
		if( MFI_Low <= 4.11122 )
			if( Negative_Money_Flow_Sum <= 4.8511e+06 )
				if( k <= 56.0704 )
					if( Typical_Price <= 168.09 )
						if( Typical_Price <= 102.534 )
							if( MFI <= 21.6658 )
								if( MFI <= 20.259 )
									ret := -0.750000 // sell
								if( MFI > 20.259 )
									ret := 0.400000
							if( MFI > 21.6658 )
								if( MFI <= 23.0747 )
									ret := -0.968750 // sell
								if( MFI > 23.0747 )
									ret := -0.588235
						if( Typical_Price > 102.534 )
							if( Positive_Money_Flow <= 147137 )
								if( Negative_Money_Flow <= 1.85424e+06 )
									ret := -0.305825
								if( Negative_Money_Flow > 1.85424e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 147137 )
								if( Typical_Price <= 135.936 )
									ret := 0.933333 // buy
								if( Typical_Price > 135.936 )
									ret := 0.100000
					if( Typical_Price > 168.09 )
						if( Raw_Money_Flow <= 895273 )
							if( Money_Flow_Ratio <= 0.271662 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.271662 )
								if( Typical_Price <= 181.97 )
									ret := -0.684211
								if( Typical_Price > 181.97 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 895273 )
							ret := -0.555556
				if( k > 56.0704 )
					if( Negative_Money_Flow_Sum <= 3.59363e+06 )
						if( MFI <= 22.5282 )
							if( smoothK_k <= 77.4946 )
								if( d_k <= 4.47538 )
									ret := 1.000000 // buy
								if( d_k > 4.47538 )
									ret := 0.857143 // buy
							if( smoothK_k > 77.4946 )
								ret := 0.600000
						if( MFI > 22.5282 )
							if( k <= 78.2494 )
								ret := -0.461538
							if( k > 78.2494 )
								ret := 0.833333 // buy
					if( Negative_Money_Flow_Sum > 3.59363e+06 )
						if( Raw_Money_Flow <= 321313 )
							if( Negative_Money_Flow <= 12190.5 )
								ret := -0.076923
							if( Negative_Money_Flow > 12190.5 )
								ret := -0.500000
						if( Raw_Money_Flow > 321313 )
							ret := 0.562500
			if( Negative_Money_Flow_Sum > 4.8511e+06 )
				if( d <= 5.47643 )
					if( Negative_Money_Flow_Sum <= 7.82073e+06 )
						if( smoothK_k <= -0.348996 )
							ret := -0.444444
						if( smoothK_k > -0.348996 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 7.82073e+06 )
						if( Negative_Money_Flow_Sum <= 7.55897e+07 )
							if( Typical_Price <= 180.27 )
								if( rsi1 <= 11.4395 )
									ret := -0.166667
								if( rsi1 > 11.4395 )
									ret := 0.559140
							if( Typical_Price > 180.27 )
								ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 7.55897e+07 )
							if( Positive_Money_Flow_Sum <= 1.17536e+08 )
								if( Negative_Money_Flow_Sum <= 5.74645e+08 )
									ret := -0.058710
								if( Negative_Money_Flow_Sum > 5.74645e+08 )
									ret := -0.280742
							if( Positive_Money_Flow_Sum > 1.17536e+08 )
								if( Negative_Money_Flow_Sum <= 1.43431e+09 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 1.43431e+09 )
									ret := -0.548387
				if( d > 5.47643 )
					if( Positive_Money_Flow_Sum <= 9.15294e+07 )
						if( MFI_High <= -76.7001 )
							if( Negative_Money_Flow <= 7.16014e+07 )
								if( Positive_Money_Flow <= 107792 )
									ret := 0.105557
								if( Positive_Money_Flow > 107792 )
									ret := -0.111765
							if( Negative_Money_Flow > 7.16014e+07 )
								if( Typical_Price <= 144.067 )
									ret := -0.063670
								if( Typical_Price > 144.067 )
									ret := -0.370909
						if( MFI_High > -76.7001 )
							if( Positive_Money_Flow <= 4.58349e+07 )
								if( Typical_Price <= 60.3358 )
									ret := -0.042173
								if( Typical_Price > 60.3358 )
									ret := 0.141096
							if( Positive_Money_Flow > 4.58349e+07 )
								if( rsi1 <= 28.5217 )
									ret := 0.533333
								if( rsi1 > 28.5217 )
									ret := -0.397163
					if( Positive_Money_Flow_Sum > 9.15294e+07 )
						if( rsi1 <= 63.7763 )
							if( Negative_Money_Flow <= 10628.4 )
								if( Typical_Price <= 127.221 )
									ret := 0.014286
								if( Typical_Price > 127.221 )
									ret := -0.278333
							if( Negative_Money_Flow > 10628.4 )
								if( Positive_Money_Flow_Sum <= 1.75812e+08 )
									ret := -0.010138
								if( Positive_Money_Flow_Sum > 1.75812e+08 )
									ret := 0.273273
						if( rsi1 > 63.7763 )
							if( Money_Flow_Ratio <= 0.239354 )
								if( smoothK_k <= 81.8559 )
									ret := -0.915254 // sell
								if( smoothK_k > 81.8559 )
									ret := -0.400000
							if( Money_Flow_Ratio > 0.239354 )
								if( Money_Flow_Ratio <= 0.273249 )
									ret := 0.260870
								if( Money_Flow_Ratio > 0.273249 )
									ret := -0.491228
		if( MFI_Low > 4.11122 )
			if( Negative_Money_Flow_Sum <= 7.72363e+08 )
				if( Negative_Money_Flow_Sum <= 4.66918e+08 )
					if( Positive_Money_Flow_Sum <= 2.14477e+09 )
						if( Negative_Money_Flow_Sum <= 1.92366e+06 )
							if( Money_Flow_Ratio <= 3547.05 )
								if( d_k <= 9.88926 )
									ret := -0.082272
								if( d_k > 9.88926 )
									ret := 0.098611
							if( Money_Flow_Ratio > 3547.05 )
								if( MFI_Low <= 79.9726 )
									ret := 0.918367 // buy
								if( MFI_Low > 79.9726 )
									ret := 0.179487
						if( Negative_Money_Flow_Sum > 1.92366e+06 )
							if( Positive_Money_Flow <= 9898.56 )
								if( Raw_Money_Flow <= 1.36341e+06 )
									ret := 0.118263
								if( Raw_Money_Flow > 1.36341e+06 )
									ret := 0.002789
							if( Positive_Money_Flow > 9898.56 )
								if( MFI_Low <= 70.4383 )
									ret := -0.030766
								if( MFI_Low > 70.4383 )
									ret := -0.117338
					if( Positive_Money_Flow_Sum > 2.14477e+09 )
						if( Raw_Money_Flow <= 75786.9 )
							ret := 0.266667
						if( Raw_Money_Flow > 75786.9 )
							if( Money_Flow_Ratio <= 42.8375 )
								if( MFI_High <= 10.8014 )
									ret := 0.894737 // buy
								if( MFI_High > 10.8014 )
									ret := 0.250000
							if( Money_Flow_Ratio > 42.8375 )
								if( Positive_Money_Flow <= 1.87853e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow > 1.87853e+07 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 4.66918e+08 )
					if( Negative_Money_Flow <= 97.8717 )
						if( Typical_Price <= 143.165 )
							if( d_k <= -21.4836 )
								if( Raw_Money_Flow <= 6.24697e+07 )
									ret := 0.550000
								if( Raw_Money_Flow > 6.24697e+07 )
									ret := -0.625000
							if( d_k > -21.4836 )
								if( Positive_Money_Flow <= 1.23402e+07 )
									ret := -0.038462
								if( Positive_Money_Flow > 1.23402e+07 )
									ret := -0.555556
						if( Typical_Price > 143.165 )
							if( Raw_Money_Flow <= 1.29835e+08 )
								if( Positive_Money_Flow_Sum <= 2.01557e+08 )
									ret := 0.571429
								if( Positive_Money_Flow_Sum > 2.01557e+08 )
									ret := -0.134737
							if( Raw_Money_Flow > 1.29835e+08 )
								if( rsi1 <= 41.1816 )
									ret := 0.000000
								if( rsi1 > 41.1816 )
									ret := 0.757576 // buy
					if( Negative_Money_Flow > 97.8717 )
						if( Negative_Money_Flow <= 6.477e+06 )
							if( Raw_Money_Flow <= 83872 )
								if( Typical_Price <= 164.021 )
									ret := 0.621053
								if( Typical_Price > 164.021 )
									ret := -0.200000
							if( Raw_Money_Flow > 83872 )
								if( MFI <= 30.4348 )
									ret := -0.146067
								if( MFI > 30.4348 )
									ret := 0.295699
						if( Negative_Money_Flow > 6.477e+06 )
							if( d_k <= -8.96727 )
								if( k <= 98.3768 )
									ret := 0.348148
								if( k > 98.3768 )
									ret := -0.875000 // sell
							if( d_k > -8.96727 )
								if( Negative_Money_Flow <= 7.87363e+07 )
									ret := -0.346999
								if( Negative_Money_Flow > 7.87363e+07 )
									ret := 0.037594
			if( Negative_Money_Flow_Sum > 7.72363e+08 )
				if( Positive_Money_Flow <= 8.57073e+06 )
					if( Negative_Money_Flow_Sum <= 1.0254e+09 )
						if( rsi1 <= 19.4288 )
							ret := -0.500000
						if( rsi1 > 19.4288 )
							if( Negative_Money_Flow <= 7.13227e+07 )
								if( d_k <= 7.42348 )
									ret := -0.150538
								if( d_k > 7.42348 )
									ret := 0.514286
							if( Negative_Money_Flow > 7.13227e+07 )
								if( Positive_Money_Flow_Sum <= 1.76876e+09 )
									ret := 0.451327
								if( Positive_Money_Flow_Sum > 1.76876e+09 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.0254e+09 )
						if( Typical_Price <= 183.223 )
							if( MFI <= 54.9155 )
								if( Positive_Money_Flow_Sum <= 4.9902e+08 )
									ret := 0.384615
								if( Positive_Money_Flow_Sum > 4.9902e+08 )
									ret := 0.892086 // buy
							if( MFI > 54.9155 )
								if( Positive_Money_Flow_Sum <= 2.73541e+09 )
									ret := 0.656250
								if( Positive_Money_Flow_Sum > 2.73541e+09 )
									ret := -0.777778 // sell
						if( Typical_Price > 183.223 )
							ret := -0.562500
				if( Positive_Money_Flow > 8.57073e+06 )
					if( smoothK_k <= 13.9021 )
						if( Money_Flow_Ratio <= 1.04282 )
							if( d_k <= -4.5552 )
								ret := -1.000000 // sell
							if( d_k > -4.5552 )
								if( MFI_High <= -44.8746 )
									ret := -0.266667
								if( MFI_High > -44.8746 )
									ret := 0.551724
						if( Money_Flow_Ratio > 1.04282 )
							if( smoothD_d <= 2.92948 )
								ret := 0.000000
							if( smoothD_d > 2.92948 )
								if( Positive_Money_Flow_Sum <= 1.532e+09 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.532e+09 )
									ret := -0.666667
					if( smoothK_k > 13.9021 )
						if( Positive_Money_Flow_Sum <= 1.61512e+09 )
							if( Negative_Money_Flow_Sum <= 8.25238e+08 )
								if( MFI <= 40.2939 )
									ret := 0.000000
								if( MFI > 40.2939 )
									ret := 0.904762 // buy
							if( Negative_Money_Flow_Sum > 8.25238e+08 )
								if( Typical_Price <= 146.404 )
									ret := 0.424242
								if( Typical_Price > 146.404 )
									ret := -0.054545
						if( Positive_Money_Flow_Sum > 1.61512e+09 )
							if( smoothK_k <= 69.2836 )
								if( Typical_Price <= 117.704 )
									ret := 0.400000
								if( Typical_Price > 117.704 )
									ret := -0.500000
							if( smoothK_k > 69.2836 )
								if( Negative_Money_Flow_Sum <= 1.79795e+09 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow_Sum > 1.79795e+09 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_QCOM_15Min_79a5580a(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


