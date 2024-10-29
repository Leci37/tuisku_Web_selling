//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: CRWD_15Min_2MS0_afd56b49 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2MS0_afd56b49", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_afd56b49(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 55.0332 )
		if( Typical_Price <= 176.795 )
			if( Raw_Money_Flow <= 184004 )
				if( smoothK_k <= 28.6573 )
					if( Positive_Money_Flow <= 19402.9 )
						if( Positive_Money_Flow_Sum <= 1.17e+06 )
							if( smoothD_d <= 11.0625 )
								if( MFI_High <= -29.2325 )
									ret := 0.351351
								if( MFI_High > -29.2325 )
									ret := 0.820513 // buy
							if( smoothD_d > 11.0625 )
								if( Typical_Price <= 106.527 )
									ret := 0.141509
								if( Typical_Price > 106.527 )
									ret := -0.242647
						if( Positive_Money_Flow_Sum > 1.17e+06 )
							if( Positive_Money_Flow_Sum <= 9.55982e+06 )
								if( d <= 2.80652 )
									ret := -0.212121
								if( d > 2.80652 )
									ret := 0.563584
							if( Positive_Money_Flow_Sum > 9.55982e+06 )
								if( MFI_Low <= 79.5739 )
									ret := 0.316907
								if( MFI_Low > 79.5739 )
									ret := -0.466667
					if( Positive_Money_Flow > 19402.9 )
						if( MFI_High <= -79.3236 )
							if( d <= 15.4762 )
								if( Positive_Money_Flow_Sum <= 562892 )
									ret := -0.307692
								if( Positive_Money_Flow_Sum > 562892 )
									ret := 0.454545
							if( d > 15.4762 )
								ret := -0.814815 // sell
						if( MFI_High > -79.3236 )
							if( d <= 33.0944 )
								if( Negative_Money_Flow_Sum <= 2.15429e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.15429e+07 )
									ret := 0.187569
							if( d > 33.0944 )
								if( rsi1 <= 35.023 )
									ret := 0.714286 // buy
								if( rsi1 > 35.023 )
									ret := -0.252809
				if( smoothK_k > 28.6573 )
					if( Positive_Money_Flow <= 1748.86 )
						if( MFI <= 70.3504 )
							if( Positive_Money_Flow_Sum <= 2.57967e+07 )
								if( Typical_Price <= 174.175 )
									ret := 0.019646
								if( Typical_Price > 174.175 )
									ret := 0.882353 // buy
							if( Positive_Money_Flow_Sum > 2.57967e+07 )
								if( d <= 66.7989 )
									ret := 0.272171
								if( d > 66.7989 )
									ret := -0.692308
						if( MFI > 70.3504 )
							if( smoothD_d <= 55.1427 )
								if( d <= 34.111 )
									ret := -0.045455
								if( d > 34.111 )
									ret := 0.594771
							if( smoothD_d > 55.1427 )
								if( Money_Flow_Ratio <= 34.0881 )
									ret := 0.333333
								if( Money_Flow_Ratio > 34.0881 )
									ret := -0.588235
					if( Positive_Money_Flow > 1748.86 )
						if( Positive_Money_Flow_Sum <= 452226 )
							if( MFI_Low <= 4.6181 )
								if( Typical_Price <= 141.118 )
									ret := -0.311475
								if( Typical_Price > 141.118 )
									ret := 0.500000
							if( MFI_Low > 4.6181 )
								if( Money_Flow_Ratio <= 1.36214 )
									ret := -0.647059
								if( Money_Flow_Ratio > 1.36214 )
									ret := 0.125000
						if( Positive_Money_Flow_Sum > 452226 )
							if( MFI_Low <= -18.7299 )
								if( Negative_Money_Flow_Sum <= 8.37548e+07 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 8.37548e+07 )
									ret := -0.666667
							if( MFI_Low > -18.7299 )
								if( MFI <= 20.995 )
									ret := 0.336788
								if( MFI > 20.995 )
									ret := -0.039463
			if( Raw_Money_Flow > 184004 )
				if( Positive_Money_Flow <= 2.95167e+07 )
					if( Negative_Money_Flow_Sum <= 3.8179e+08 )
						if( rsi1 <= 34.3491 )
							if( d_k <= 14.4918 )
								if( Typical_Price <= 111.324 )
									ret := 0.225311
								if( Typical_Price > 111.324 )
									ret := 0.005848
							if( d_k > 14.4918 )
								if( smoothD_d <= 58.214 )
									ret := -0.171334
								if( smoothD_d > 58.214 )
									ret := 0.222222
						if( rsi1 > 34.3491 )
							if( Positive_Money_Flow_Sum <= 3.93606e+07 )
								if( d_k <= 0.769264 )
									ret := -0.150428
								if( d_k > 0.769264 )
									ret := 0.000341
							if( Positive_Money_Flow_Sum > 3.93606e+07 )
								if( Typical_Price <= 58.7249 )
									ret := 0.231969
								if( Typical_Price > 58.7249 )
									ret := 0.018438
					if( Negative_Money_Flow_Sum > 3.8179e+08 )
						if( Raw_Money_Flow <= 1.0248e+08 )
							if( MFI_High <= -12.4262 )
								if( MFI_High <= -40.3862 )
									ret := 0.382911
								if( MFI_High > -40.3862 )
									ret := 0.896104 // buy
							if( MFI_High > -12.4262 )
								ret := -0.750000 // sell
						if( Raw_Money_Flow > 1.0248e+08 )
							if( MFI_High <= -45.5334 )
								ret := -0.136364
							if( MFI_High > -45.5334 )
								ret := -0.722222 // sell
				if( Positive_Money_Flow > 2.95167e+07 )
					if( Positive_Money_Flow <= 3.93273e+07 )
						if( d_k <= -11.4965 )
							if( k <= 45.4835 )
								if( Raw_Money_Flow <= 3.66569e+07 )
									ret := 0.837838 // buy
								if( Raw_Money_Flow > 3.66569e+07 )
									ret := 0.615385
							if( k > 45.4835 )
								ret := 1.000000 // buy
						if( d_k > -11.4965 )
							if( Negative_Money_Flow_Sum <= 1.70318e+08 )
								if( Negative_Money_Flow_Sum <= 8.67553e+07 )
									ret := 0.273504
								if( Negative_Money_Flow_Sum > 8.67553e+07 )
									ret := 0.682353
							if( Negative_Money_Flow_Sum > 1.70318e+08 )
								if( Positive_Money_Flow_Sum <= 4.38595e+08 )
									ret := 0.051282
								if( Positive_Money_Flow_Sum > 4.38595e+08 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow > 3.93273e+07 )
						if( Positive_Money_Flow_Sum <= 4.31217e+07 )
							if( d_k <= -9.54133 )
								ret := -1.000000 // sell
							if( d_k > -9.54133 )
								ret := -0.250000
						if( Positive_Money_Flow_Sum > 4.31217e+07 )
							if( Negative_Money_Flow_Sum <= 4.39514e+08 )
								if( Negative_Money_Flow_Sum <= 2.90512e+08 )
									ret := 0.126126
								if( Negative_Money_Flow_Sum > 2.90512e+08 )
									ret := -0.535211
							if( Negative_Money_Flow_Sum > 4.39514e+08 )
								if( d <= 29.1746 )
									ret := 0.739130 // buy
								if( d > 29.1746 )
									ret := -0.090909
		if( Typical_Price > 176.795 )
			if( Positive_Money_Flow_Sum <= 1.51731e+06 )
				if( Negative_Money_Flow <= 2.82181e+07 )
					if( Money_Flow_Ratio <= 0.004478 )
						if( d_k <= -7.60708 )
							if( MFI <= 0.28558 )
								ret := -0.250000
							if( MFI > 0.28558 )
								ret := 0.687500
						if( d_k > -7.60708 )
							if( Negative_Money_Flow_Sum <= 2.74791e+08 )
								if( Positive_Money_Flow_Sum <= 456121 )
									ret := 0.483871
								if( Positive_Money_Flow_Sum > 456121 )
									ret := -0.270270
							if( Negative_Money_Flow_Sum > 2.74791e+08 )
								if( Positive_Money_Flow_Sum <= 723414 )
									ret := -0.810811 // sell
								if( Positive_Money_Flow_Sum > 723414 )
									ret := -0.269231
					if( Money_Flow_Ratio > 0.004478 )
						if( k <= 16.5055 )
							if( rsi1 <= 50.2388 )
								if( smoothK_k <= 1.65721 )
									ret := 0.358333
								if( smoothK_k > 1.65721 )
									ret := 0.685512
							if( rsi1 > 50.2388 )
								if( Money_Flow_Ratio <= 0.413333 )
									ret := -0.571429
								if( Money_Flow_Ratio > 0.413333 )
									ret := 0.444444
						if( k > 16.5055 )
							if( d_k <= 20.6612 )
								if( smoothD_d <= 51.6102 )
									ret := 0.303175
								if( smoothD_d > 51.6102 )
									ret := -0.150685
							if( d_k > 20.6612 )
								if( k <= 22.5461 )
									ret := -1.000000 // sell
								if( k > 22.5461 )
									ret := -0.050000
				if( Negative_Money_Flow > 2.82181e+07 )
					if( Typical_Price <= 262.311 )
						if( Positive_Money_Flow_Sum <= 322018 )
							ret := 0.526316
						if( Positive_Money_Flow_Sum > 322018 )
							if( Negative_Money_Flow_Sum <= 2.56024e+08 )
								if( Typical_Price <= 223.973 )
									ret := -0.432432
								if( Typical_Price > 223.973 )
									ret := 0.187500
							if( Negative_Money_Flow_Sum > 2.56024e+08 )
								if( Positive_Money_Flow_Sum <= 1.3282e+06 )
									ret := -0.972222 // sell
								if( Positive_Money_Flow_Sum > 1.3282e+06 )
									ret := -0.600000
					if( Typical_Price > 262.311 )
						if( d <= 16.8876 )
							if( Raw_Money_Flow <= 4.25947e+07 )
								ret := -0.571429
							if( Raw_Money_Flow > 4.25947e+07 )
								ret := 0.333333
						if( d > 16.8876 )
							if( smoothD_d <= 38.0888 )
								ret := 0.916667 // buy
							if( smoothD_d > 38.0888 )
								ret := 0.666667
			if( Positive_Money_Flow_Sum > 1.51731e+06 )
				if( Raw_Money_Flow <= 1.04568e+06 )
					if( rsi1 <= 46.6812 )
						if( MFI <= 6.52924 )
							if( Typical_Price <= 213.906 )
								if( d_k <= -1.15934 )
									ret := -0.729730 // sell
								if( d_k > -1.15934 )
									ret := -0.235294
							if( Typical_Price > 213.906 )
								if( Negative_Money_Flow_Sum <= 4.80913e+08 )
									ret := -0.015152
								if( Negative_Money_Flow_Sum > 4.80913e+08 )
									ret := 0.823529 // buy
						if( MFI > 6.52924 )
							if( MFI_Low <= -1.95463 )
								if( d <= 23.1896 )
									ret := 0.475783
								if( d > 23.1896 )
									ret := 0.100000
							if( MFI_Low > -1.95463 )
								if( Negative_Money_Flow <= 22.1369 )
									ret := -0.026036
								if( Negative_Money_Flow > 22.1369 )
									ret := 0.195362
					if( rsi1 > 46.6812 )
						if( Positive_Money_Flow_Sum <= 2.87257e+06 )
							if( MFI <= 3.6191 )
								if( MFI_High <= -78.1465 )
									ret := -0.375000
								if( MFI_High > -78.1465 )
									ret := 0.714286 // buy
							if( MFI > 3.6191 )
								if( rsi1 <= 55.12 )
									ret := -0.147651
								if( rsi1 > 55.12 )
									ret := -0.534483
						if( Positive_Money_Flow_Sum > 2.87257e+06 )
							if( MFI_High <= 7.03273 )
								if( MFI <= 83.706 )
									ret := 0.021206
								if( MFI > 83.706 )
									ret := 0.442857
							if( MFI_High > 7.03273 )
								if( Positive_Money_Flow_Sum <= 1.84825e+08 )
									ret := -0.415020
								if( Positive_Money_Flow_Sum > 1.84825e+08 )
									ret := 0.058394
				if( Raw_Money_Flow > 1.04568e+06 )
					if( MFI_Low <= -15.2104 )
						if( Positive_Money_Flow_Sum <= 4.1057e+06 )
							if( Raw_Money_Flow <= 9.47789e+07 )
								if( Negative_Money_Flow_Sum <= 2.90675e+08 )
									ret := -0.039514
								if( Negative_Money_Flow_Sum > 2.90675e+08 )
									ret := 0.458333
							if( Raw_Money_Flow > 9.47789e+07 )
								if( MFI <= 1.78226 )
									ret := -0.300000
								if( MFI > 1.78226 )
									ret := -0.852941 // sell
						if( Positive_Money_Flow_Sum > 4.1057e+06 )
							if( smoothK_k <= 36.115 )
								if( d <= 23.2982 )
									ret := -0.626437
								if( d > 23.2982 )
									ret := -0.121495
							if( smoothK_k > 36.115 )
								if( d_k <= 12.2108 )
									ret := -0.666667
								if( d_k > 12.2108 )
									ret := -0.950000 // sell
					if( MFI_Low > -15.2104 )
						if( Negative_Money_Flow <= 1.45856e+08 )
							if( MFI_High <= -66.1967 )
								if( Positive_Money_Flow <= 6.95021e+07 )
									ret := 0.288719
								if( Positive_Money_Flow > 6.95021e+07 )
									ret := -0.777778 // sell
							if( MFI_High > -66.1967 )
								if( Negative_Money_Flow_Sum <= 9.96085e+07 )
									ret := -0.120616
								if( Negative_Money_Flow_Sum > 9.96085e+07 )
									ret := -0.029271
						if( Negative_Money_Flow > 1.45856e+08 )
							if( d <= 15.3427 )
								if( d_k <= -0.368551 )
									ret := 0.000000
								if( d_k > -0.368551 )
									ret := 0.788462 // buy
							if( d > 15.3427 )
								if( d <= 58.5134 )
									ret := 0.020000
								if( d > 58.5134 )
									ret := -0.571429
	if( k > 55.0332 )
		if( Positive_Money_Flow_Sum <= 2.00135e+06 )
			if( MFI_High <= -1.19328 )
				if( MFI <= 73.6549 )
					if( Positive_Money_Flow <= 930283 )
						if( Positive_Money_Flow_Sum <= 1.09152e+06 )
							if( MFI_Low <= 6.08972 )
								if( Positive_Money_Flow <= 219842 )
									ret := -0.165434
								if( Positive_Money_Flow > 219842 )
									ret := -0.532468
							if( MFI_Low > 6.08972 )
								if( MFI <= 47.2471 )
									ret := 0.088283
								if( MFI > 47.2471 )
									ret := -0.156250
						if( Positive_Money_Flow_Sum > 1.09152e+06 )
							if( Typical_Price <= 142.446 )
								if( MFI_Low <= 49.5411 )
									ret := -0.421756
								if( MFI_Low > 49.5411 )
									ret := 0.016949
							if( Typical_Price > 142.446 )
								if( Negative_Money_Flow_Sum <= 1.09709e+06 )
									ret := -0.465035
								if( Negative_Money_Flow_Sum > 1.09709e+06 )
									ret := -0.026932
					if( Positive_Money_Flow > 930283 )
						if( MFI_Low <= 11.4283 )
							ret := -0.956522 // sell
						if( MFI_Low > 11.4283 )
							ret := -0.153846
				if( MFI > 73.6549 )
					if( Positive_Money_Flow <= 342508 )
						if( smoothK_k <= 69.0561 )
							if( Negative_Money_Flow_Sum <= 427980 )
								ret := 0.400000
							if( Negative_Money_Flow_Sum > 427980 )
								if( MFI_Low <= 54.7436 )
									ret := 0.600000
								if( MFI_Low > 54.7436 )
									ret := 1.000000 // buy
						if( smoothK_k > 69.0561 )
							if( k <= 81.0848 )
								ret := -0.615385
							if( k > 81.0848 )
								if( Money_Flow_Ratio <= 3.06731 )
									ret := 0.846154 // buy
								if( Money_Flow_Ratio > 3.06731 )
									ret := 0.347826
					if( Positive_Money_Flow > 342508 )
						if( Positive_Money_Flow <= 534849 )
							if( k <= 75.7947 )
								ret := -0.800000 // sell
							if( k > 75.7947 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 534849 )
							ret := 0.555556
			if( MFI_High > -1.19328 )
				if( d <= 67.6358 )
					if( Positive_Money_Flow <= 248921 )
						if( Positive_Money_Flow <= 5004.75 )
							ret := -0.083333
						if( Positive_Money_Flow > 5004.75 )
							if( Money_Flow_Ratio <= 5.45992 )
								ret := 0.933333 // buy
							if( Money_Flow_Ratio > 5.45992 )
								ret := 0.384615
					if( Positive_Money_Flow > 248921 )
						ret := -0.941176 // sell
				if( d > 67.6358 )
					if( smoothD_d <= 94.0083 )
						if( rsi1 <= 64.4219 )
							if( smoothK_k <= 73.2224 )
								ret := -0.750000 // sell
							if( smoothK_k > 73.2224 )
								ret := -1.000000 // sell
						if( rsi1 > 64.4219 )
							if( Positive_Money_Flow <= 14512.3 )
								ret := 0.428571
							if( Positive_Money_Flow > 14512.3 )
								if( k <= 74.9768 )
									ret := -0.950000 // sell
								if( k > 74.9768 )
									ret := -0.573770
					if( smoothD_d > 94.0083 )
						ret := 0.000000
		if( Positive_Money_Flow_Sum > 2.00135e+06 )
			if( smoothK_k <= 83.3155 )
				if( Money_Flow_Ratio <= 1.38181 )
					if( rsi1 <= 76.5884 )
						if( d_k <= 2.33068 )
							if( MFI_Low <= 37.8281 )
								if( Negative_Money_Flow <= 1.74811e+06 )
									ret := -0.044153
								if( Negative_Money_Flow > 1.74811e+06 )
									ret := -0.143846
							if( MFI_Low > 37.8281 )
								if( Negative_Money_Flow_Sum <= 1.13312e+08 )
									ret := -0.896552 // sell
								if( Negative_Money_Flow_Sum > 1.13312e+08 )
									ret := 0.000000
						if( d_k > 2.33068 )
							if( Money_Flow_Ratio <= 1.36262 )
								if( Negative_Money_Flow <= 1.14528e+08 )
									ret := 0.034493
								if( Negative_Money_Flow > 1.14528e+08 )
									ret := -0.358491
							if( Money_Flow_Ratio > 1.36262 )
								if( Typical_Price <= 92.518 )
									ret := 0.863636 // buy
								if( Typical_Price > 92.518 )
									ret := 0.157895
					if( rsi1 > 76.5884 )
						if( d <= 81.813 )
							if( d_k <= -1.07039 )
								if( MFI_Low <= 35.1664 )
									ret := -0.750000 // sell
								if( MFI_Low > 35.1664 )
									ret := -0.285714
							if( d_k > -1.07039 )
								if( MFI_Low <= 34.7072 )
									ret := 0.142857
								if( MFI_Low > 34.7072 )
									ret := -0.600000
						if( d > 81.813 )
							if( MFI_Low <= 25.8635 )
								if( MFI_Low <= 23.7736 )
									ret := -0.842105 // sell
								if( MFI_Low > 23.7736 )
									ret := -1.000000 // sell
							if( MFI_Low > 25.8635 )
								ret := -0.611111
				if( Money_Flow_Ratio > 1.38181 )
					if( MFI_High <= 17.1198 )
						if( Negative_Money_Flow_Sum <= 1.26364e+07 )
							if( Positive_Money_Flow <= 9.41008e+07 )
								if( Typical_Price <= 67.5246 )
									ret := 0.363043
								if( Typical_Price > 67.5246 )
									ret := 0.110497
							if( Positive_Money_Flow > 9.41008e+07 )
								if( MFI_Low <= 76.2734 )
									ret := -0.133333
								if( MFI_Low > 76.2734 )
									ret := -0.945946 // sell
						if( Negative_Money_Flow_Sum > 1.26364e+07 )
							if( Positive_Money_Flow <= 2.75861e+08 )
								if( smoothD_d <= 64.8631 )
									ret := -0.015843
								if( smoothD_d > 64.8631 )
									ret := 0.055681
							if( Positive_Money_Flow > 2.75861e+08 )
								if( MFI <= 95.5989 )
									ret := 0.814815 // buy
								if( MFI > 95.5989 )
									ret := 0.000000
					if( MFI_High > 17.1198 )
						if( MFI_High <= 17.2417 )
							if( MFI <= 97.2001 )
								ret := -0.200000
							if( MFI > 97.2001 )
								ret := -1.000000 // sell
						if( MFI_High > 17.2417 )
							if( Raw_Money_Flow <= 116923 )
								if( Negative_Money_Flow <= 87884.3 )
									ret := 0.164444
								if( Negative_Money_Flow > 87884.3 )
									ret := 0.863636 // buy
							if( Raw_Money_Flow > 116923 )
								if( Negative_Money_Flow_Sum <= 1.37204e+06 )
									ret := -0.224359
								if( Negative_Money_Flow_Sum > 1.37204e+06 )
									ret := 0.055010
			if( smoothK_k > 83.3155 )
				if( Positive_Money_Flow_Sum <= 6.86503e+06 )
					if( Raw_Money_Flow <= 6.64051e+07 )
						if( rsi1 <= 59.5741 )
							if( Typical_Price <= 320.117 )
								if( MFI <= 22.7583 )
									ret := 0.111111
								if( MFI > 22.7583 )
									ret := 0.592857
							if( Typical_Price > 320.117 )
								ret := -0.642857
						if( rsi1 > 59.5741 )
							if( smoothD_d <= 80.7352 )
								if( smoothK_k <= 88.052 )
									ret := -0.526316
								if( smoothK_k > 88.052 )
									ret := -0.068182
							if( smoothD_d > 80.7352 )
								if( Typical_Price <= 131.762 )
									ret := -0.179487
								if( Typical_Price > 131.762 )
									ret := 0.196190
					if( Raw_Money_Flow > 6.64051e+07 )
						if( k <= 91.0529 )
							ret := -0.947368 // sell
						if( k > 91.0529 )
							ret := -0.800000 // sell
				if( Positive_Money_Flow_Sum > 6.86503e+06 )
					if( smoothD_d <= 96.7196 )
						if( Typical_Price <= 57.0891 )
							if( rsi1 <= 82.4235 )
								if( MFI_Low <= 53.7583 )
									ret := -0.295711
								if( MFI_Low > 53.7583 )
									ret := -0.619048
							if( rsi1 > 82.4235 )
								if( d_k <= -1.61709 )
									ret := 0.894737 // buy
								if( d_k > -1.61709 )
									ret := 0.057143
						if( Typical_Price > 57.0891 )
							if( rsi1 <= 60.1523 )
								if( Positive_Money_Flow_Sum <= 2.41983e+08 )
									ret := -0.027353
								if( Positive_Money_Flow_Sum > 2.41983e+08 )
									ret := 0.217391
							if( rsi1 > 60.1523 )
								if( MFI <= 34.6901 )
									ret := -0.436000
								if( MFI > 34.6901 )
									ret := -0.102120
					if( smoothD_d > 96.7196 )
						if( MFI <= 99.6703 )
							if( smoothD_d <= 96.9213 )
								if( Money_Flow_Ratio <= 4.8486 )
									ret := 0.106061
								if( Money_Flow_Ratio > 4.8486 )
									ret := 0.550000
							if( smoothD_d > 96.9213 )
								if( MFI <= 90.331 )
									ret := 0.107438
								if( MFI > 90.331 )
									ret := -0.188406
						if( MFI > 99.6703 )
							if( k <= 99.9968 )
								ret := -0.714286 // sell
							if( k > 99.9968 )
								ret := -0.166667
	
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
float op_operation = decision_tree_0_CRWD_15Min_afd56b49(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


