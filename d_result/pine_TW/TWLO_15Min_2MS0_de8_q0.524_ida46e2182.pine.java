//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: TWLO_15Min_2MS0_a46e2182 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2MS0_a46e2182", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_a46e2182(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 7.83685 )
		if( Positive_Money_Flow <= 3.61044e+06 )
			if( rsi1 <= 45.0814 )
				if( MFI_High <= 14.3501 )
					if( Typical_Price <= 28.9541 )
						if( rsi1 <= 27.6823 )
							if( smoothD_d <= 41.8677 )
								if( smoothK_k <= 28.1251 )
									ret := -0.127273
								if( smoothK_k > 28.1251 )
									ret := 0.750000 // buy
							if( smoothD_d > 41.8677 )
								ret := -0.857143 // sell
						if( rsi1 > 27.6823 )
							if( d_k <= -2.96912 )
								if( MFI_High <= -72.5615 )
									ret := 1.000000 // buy
								if( MFI_High > -72.5615 )
									ret := 0.024510
							if( d_k > -2.96912 )
								if( Raw_Money_Flow <= 41951.8 )
									ret := 0.637931
								if( Raw_Money_Flow > 41951.8 )
									ret := 0.240664
					if( Typical_Price > 28.9541 )
						if( rsi1 <= 34.6663 )
							if( smoothD_d <= 4.53468 )
								if( Money_Flow_Ratio <= 0.752348 )
									ret := 0.034014
								if( Money_Flow_Ratio > 0.752348 )
									ret := -0.200000
							if( smoothD_d > 4.53468 )
								if( smoothD_d <= 31.175 )
									ret := 0.182653
								if( smoothD_d > 31.175 )
									ret := -0.027174
						if( rsi1 > 34.6663 )
							if( MFI_High <= -39.4971 )
								if( Negative_Money_Flow_Sum <= 453060 )
									ret := -0.913043 // sell
								if( Negative_Money_Flow_Sum > 453060 )
									ret := -0.041279
							if( MFI_High > -39.4971 )
								if( Positive_Money_Flow_Sum <= 514976 )
									ret := 0.525000
								if( Positive_Money_Flow_Sum > 514976 )
									ret := 0.037271
				if( MFI_High > 14.3501 )
					if( Raw_Money_Flow <= 220453 )
						if( d_k <= -0.666697 )
							if( Money_Flow_Ratio <= 279.43 )
								if( MFI_Low <= 77.8707 )
									ret := -0.200000
								if( MFI_Low > 77.8707 )
									ret := -0.800000 // sell
							if( Money_Flow_Ratio > 279.43 )
								ret := 1.000000 // buy
						if( d_k > -0.666697 )
							if( Positive_Money_Flow_Sum <= 1.24024e+07 )
								ret := -0.666667
							if( Positive_Money_Flow_Sum > 1.24024e+07 )
								if( Negative_Money_Flow_Sum <= 772641 )
									ret := 0.718750 // buy
								if( Negative_Money_Flow_Sum > 772641 )
									ret := 0.000000
					if( Raw_Money_Flow > 220453 )
						if( Typical_Price <= 333.335 )
							if( d_k <= -1.54513 )
								if( rsi1 <= 37.777 )
									ret := -0.250000
								if( rsi1 > 37.777 )
									ret := 0.900000 // buy
							if( d_k > -1.54513 )
								if( smoothD_d <= 17.7438 )
									ret := 1.000000 // buy
								if( smoothD_d > 17.7438 )
									ret := 0.700000 // buy
						if( Typical_Price > 333.335 )
							if( Money_Flow_Ratio <= 184.541 )
								ret := -0.750000 // sell
							if( Money_Flow_Ratio > 184.541 )
								ret := 0.250000
			if( rsi1 > 45.0814 )
				if( MFI <= 58.6611 )
					if( Positive_Money_Flow_Sum <= 266026 )
						if( Typical_Price <= 30.5033 )
							if( Typical_Price <= 24.4117 )
								ret := -0.500000
							if( Typical_Price > 24.4117 )
								if( Positive_Money_Flow <= 11716.7 )
									ret := -0.125000
								if( Positive_Money_Flow > 11716.7 )
									ret := 0.692308
						if( Typical_Price > 30.5033 )
							if( d_k <= 4.62659 )
								if( MFI <= 2.06445 )
									ret := -0.280000
								if( MFI > 2.06445 )
									ret := -0.758065 // sell
							if( d_k > 4.62659 )
								if( MFI_High <= -28.5321 )
									ret := 0.300000
								if( MFI_High > -28.5321 )
									ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 266026 )
						if( Negative_Money_Flow_Sum <= 430775 )
							if( Typical_Price <= 61.8167 )
								if( rsi1 <= 59.2932 )
									ret := 1.000000 // buy
								if( rsi1 > 59.2932 )
									ret := 0.000000
							if( Typical_Price > 61.8167 )
								if( MFI_High <= -28.8915 )
									ret := 0.687500
								if( MFI_High > -28.8915 )
									ret := -0.263158
						if( Negative_Money_Flow_Sum > 430775 )
							if( Positive_Money_Flow <= 212446 )
								if( MFI_High <= -29.6678 )
									ret := -0.110547
								if( MFI_High > -29.6678 )
									ret := -0.266312
							if( Positive_Money_Flow > 212446 )
								if( Raw_Money_Flow <= 346710 )
									ret := 0.142466
								if( Raw_Money_Flow > 346710 )
									ret := -0.064314
				if( MFI > 58.6611 )
					if( d_k <= 5.95529 )
						if( rsi1 <= 68.2204 )
							if( Typical_Price <= 67.7625 )
								if( Positive_Money_Flow_Sum <= 9.123e+06 )
									ret := 0.234828
								if( Positive_Money_Flow_Sum > 9.123e+06 )
									ret := 0.003774
							if( Typical_Price > 67.7625 )
								if( Positive_Money_Flow_Sum <= 8.28537e+07 )
									ret := -0.132200
								if( Positive_Money_Flow_Sum > 8.28537e+07 )
									ret := 0.061856
						if( rsi1 > 68.2204 )
							if( Money_Flow_Ratio <= 477.157 )
								if( Typical_Price <= 117.833 )
									ret := -0.073718
								if( Typical_Price > 117.833 )
									ret := -0.211438
							if( Money_Flow_Ratio > 477.157 )
								if( smoothD_d <= 83.0272 )
									ret := 0.441860
								if( smoothD_d > 83.0272 )
									ret := -0.111111
					if( d_k > 5.95529 )
						if( Typical_Price <= 87.2678 )
							if( Negative_Money_Flow_Sum <= 286007 )
								if( Money_Flow_Ratio <= 557.984 )
									ret := -0.384615
								if( Money_Flow_Ratio > 557.984 )
									ret := 0.125000
							if( Negative_Money_Flow_Sum > 286007 )
								if( Positive_Money_Flow_Sum <= 2.23116e+06 )
									ret := 0.420000
								if( Positive_Money_Flow_Sum > 2.23116e+06 )
									ret := 0.037921
						if( Typical_Price > 87.2678 )
							if( Money_Flow_Ratio <= 47.4566 )
								if( Positive_Money_Flow_Sum <= 3.09426e+08 )
									ret := 0.200980
								if( Positive_Money_Flow_Sum > 3.09426e+08 )
									ret := -0.387097
							if( Money_Flow_Ratio > 47.4566 )
								if( Raw_Money_Flow <= 58280.5 )
									ret := 0.052632
								if( Raw_Money_Flow > 58280.5 )
									ret := 0.750000 // buy
		if( Positive_Money_Flow > 3.61044e+06 )
			if( Typical_Price <= 126.84 )
				if( Money_Flow_Ratio <= 0.225183 )
					if( smoothD_d <= 37.5857 )
						if( MFI_High <= -63.9672 )
							if( rsi1 <= 55.4535 )
								if( rsi1 <= 21.9415 )
									ret := 0.054348
								if( rsi1 > 21.9415 )
									ret := 0.412587
							if( rsi1 > 55.4535 )
								if( rsi1 <= 60.1105 )
									ret := -0.750000 // sell
								if( rsi1 > 60.1105 )
									ret := -1.000000 // sell
						if( MFI_High > -63.9672 )
							if( smoothK_k <= -2.98282 )
								ret := -0.500000
							if( smoothK_k > -2.98282 )
								if( Negative_Money_Flow_Sum <= 4.23221e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.23221e+07 )
									ret := 0.647727
					if( smoothD_d > 37.5857 )
						if( Positive_Money_Flow_Sum <= 8.78225e+06 )
							if( d <= 55.5192 )
								if( Raw_Money_Flow <= 5.14793e+06 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 5.14793e+06 )
									ret := -1.000000 // sell
							if( d > 55.5192 )
								if( Positive_Money_Flow_Sum <= 6.7047e+06 )
									ret := -0.571429
								if( Positive_Money_Flow_Sum > 6.7047e+06 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 8.78225e+06 )
							if( Typical_Price <= 52.5165 )
								ret := -0.714286 // sell
							if( Typical_Price > 52.5165 )
								if( Positive_Money_Flow_Sum <= 2.43791e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow_Sum > 2.43791e+07 )
									ret := -0.600000
				if( Money_Flow_Ratio > 0.225183 )
					if( MFI_Low <= 2.63307 )
						if( smoothK_k <= 31.8448 )
							if( Negative_Money_Flow_Sum <= 4.54316e+07 )
								if( smoothK_k <= 1.78771 )
									ret := 0.000000
								if( smoothK_k > 1.78771 )
									ret := -0.872340 // sell
							if( Negative_Money_Flow_Sum > 4.54316e+07 )
								if( MFI <= 19.7775 )
									ret := 0.220000
								if( MFI > 19.7775 )
									ret := -0.285714
						if( smoothK_k > 31.8448 )
							if( rsi1 <= 27.265 )
								if( smoothD_d <= 55.5239 )
									ret := -0.333333
								if( smoothD_d > 55.5239 )
									ret := -1.000000 // sell
							if( rsi1 > 27.265 )
								if( Positive_Money_Flow_Sum <= 2.3641e+07 )
									ret := 0.571429
								if( Positive_Money_Flow_Sum > 2.3641e+07 )
									ret := 0.105263
					if( MFI_Low > 2.63307 )
						if( rsi1 <= 33.5493 )
							if( Positive_Money_Flow <= 7.07647e+06 )
								if( Negative_Money_Flow_Sum <= 1.7625e+07 )
									ret := 0.534884
								if( Negative_Money_Flow_Sum > 1.7625e+07 )
									ret := 0.025641
							if( Positive_Money_Flow > 7.07647e+06 )
								if( Money_Flow_Ratio <= 0.716016 )
									ret := 0.373096
								if( Money_Flow_Ratio > 0.716016 )
									ret := 0.082645
						if( rsi1 > 33.5493 )
							if( Positive_Money_Flow_Sum <= 1.8166e+08 )
								if( rsi1 <= 80.3159 )
									ret := 0.060234
								if( rsi1 > 80.3159 )
									ret := -0.135274
							if( Positive_Money_Flow_Sum > 1.8166e+08 )
								if( Typical_Price <= 94.0029 )
									ret := 0.353116
								if( Typical_Price > 94.0029 )
									ret := 0.033457
			if( Typical_Price > 126.84 )
				if( Positive_Money_Flow_Sum <= 6.80907e+08 )
					if( MFI_Low <= 7.70468 )
						if( Positive_Money_Flow <= 8.36261e+07 )
							if( d <= 10.045 )
								if( Negative_Money_Flow_Sum <= 5.36337e+08 )
									ret := -0.043956
								if( Negative_Money_Flow_Sum > 5.36337e+08 )
									ret := 0.666667
							if( d > 10.045 )
								if( Positive_Money_Flow <= 3.4796e+07 )
									ret := 0.163265
								if( Positive_Money_Flow > 3.4796e+07 )
									ret := 0.583333
						if( Positive_Money_Flow > 8.36261e+07 )
							if( smoothK_k <= 20.7922 )
								if( Positive_Money_Flow_Sum <= 4.52301e+08 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 4.52301e+08 )
									ret := -1.000000 // sell
							if( smoothK_k > 20.7922 )
								ret := -0.200000
					if( MFI_Low > 7.70468 )
						if( Raw_Money_Flow <= 5.04229e+07 )
							if( Negative_Money_Flow_Sum <= 3.94646e+08 )
								if( Raw_Money_Flow <= 2.5662e+07 )
									ret := -0.010496
								if( Raw_Money_Flow > 2.5662e+07 )
									ret := -0.118493
							if( Negative_Money_Flow_Sum > 3.94646e+08 )
								if( rsi1 <= 58.7603 )
									ret := 0.478873
								if( rsi1 > 58.7603 )
									ret := -0.833333 // sell
						if( Raw_Money_Flow > 5.04229e+07 )
							if( Negative_Money_Flow_Sum <= 6.69149e+08 )
								if( rsi1 <= 29.6367 )
									ret := 0.750000 // buy
								if( rsi1 > 29.6367 )
									ret := 0.086622
							if( Negative_Money_Flow_Sum > 6.69149e+08 )
								if( MFI <= 33.4363 )
									ret := -1.000000 // sell
								if( MFI > 33.4363 )
									ret := -0.333333
				if( Positive_Money_Flow_Sum > 6.80907e+08 )
					if( MFI <= 88.2746 )
						if( Raw_Money_Flow <= 1.89425e+08 )
							if( Typical_Price <= 179.325 )
								if( k <= 54.3613 )
									ret := -0.750000 // sell
								if( k > 54.3613 )
									ret := 0.500000
							if( Typical_Price > 179.325 )
								if( Positive_Money_Flow <= 6.58454e+07 )
									ret := -0.576923
								if( Positive_Money_Flow > 6.58454e+07 )
									ret := -0.971429 // sell
						if( Raw_Money_Flow > 1.89425e+08 )
							if( rsi1 <= 43.3288 )
								ret := 0.750000 // buy
							if( rsi1 > 43.3288 )
								ret := -0.166667
					if( MFI > 88.2746 )
						if( d <= 45.8442 )
							if( smoothD_d <= 24.2132 )
								ret := 0.750000 // buy
							if( smoothD_d > 24.2132 )
								ret := 1.000000 // buy
						if( d > 45.8442 )
							if( Positive_Money_Flow <= 2.5138e+08 )
								if( Typical_Price <= 180.046 )
									ret := 0.600000
								if( Typical_Price > 180.046 )
									ret := -0.250000
							if( Positive_Money_Flow > 2.5138e+08 )
								if( d_k <= -1.28974 )
									ret := -0.500000
								if( d_k > -1.28974 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 7.83685 )
		if( Raw_Money_Flow <= 467029 )
			if( rsi1 <= 42.4606 )
				if( Positive_Money_Flow_Sum <= 2.62986e+07 )
					if( rsi1 <= 36.7513 )
						if( Positive_Money_Flow_Sum <= 2.07678e+06 )
							if( smoothK_k <= 24.5719 )
								if( Positive_Money_Flow_Sum <= 1.58803e+06 )
									ret := 0.427273
								if( Positive_Money_Flow_Sum > 1.58803e+06 )
									ret := -0.078947
							if( smoothK_k > 24.5719 )
								if( Negative_Money_Flow_Sum <= 2.02937e+08 )
									ret := 0.210682
								if( Negative_Money_Flow_Sum > 2.02937e+08 )
									ret := -0.923077 // sell
						if( Positive_Money_Flow_Sum > 2.07678e+06 )
							if( MFI <= 30.9285 )
								if( MFI_High <= -53.4049 )
									ret := 0.475289
								if( MFI_High > -53.4049 )
									ret := 0.092593
							if( MFI > 30.9285 )
								if( Positive_Money_Flow_Sum <= 1.38586e+07 )
									ret := 0.768456 // buy
								if( Positive_Money_Flow_Sum > 1.38586e+07 )
									ret := 0.350575
					if( rsi1 > 36.7513 )
						if( Negative_Money_Flow_Sum <= 1.66403e+08 )
							if( k <= 7.47364 )
								if( Negative_Money_Flow_Sum <= 9.67763e+06 )
									ret := 0.304348
								if( Negative_Money_Flow_Sum > 9.67763e+06 )
									ret := -0.351852
							if( k > 7.47364 )
								if( Positive_Money_Flow_Sum <= 2.13625e+07 )
									ret := 0.264286
								if( Positive_Money_Flow_Sum > 2.13625e+07 )
									ret := 0.666667
						if( Negative_Money_Flow_Sum > 1.66403e+08 )
							if( Raw_Money_Flow <= 165175 )
								if( Negative_Money_Flow_Sum <= 1.8387e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.8387e+08 )
									ret := -0.533333
							if( Raw_Money_Flow > 165175 )
								if( Negative_Money_Flow <= 264369 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow > 264369 )
									ret := -0.750000 // sell
				if( Positive_Money_Flow_Sum > 2.62986e+07 )
					if( Positive_Money_Flow_Sum <= 1.26056e+08 )
						if( Positive_Money_Flow_Sum <= 9.91546e+07 )
							if( d_k <= 1.37722 )
								if( Negative_Money_Flow <= 153236 )
									ret := 0.166205
								if( Negative_Money_Flow > 153236 )
									ret := -0.180233
							if( d_k > 1.37722 )
								if( d_k <= 8.29431 )
									ret := 0.454158
								if( d_k > 8.29431 )
									ret := 0.177824
						if( Positive_Money_Flow_Sum > 9.91546e+07 )
							if( rsi1 <= 36.6591 )
								if( Money_Flow_Ratio <= 1.17361 )
									ret := -0.033333
								if( Money_Flow_Ratio > 1.17361 )
									ret := -0.704918 // sell
							if( rsi1 > 36.6591 )
								if( Typical_Price <= 136.224 )
									ret := -0.360000
								if( Typical_Price > 136.224 )
									ret := 0.250000
					if( Positive_Money_Flow_Sum > 1.26056e+08 )
						if( k <= 23.0325 )
							if( smoothD_d <= 2.13419 )
								if( Raw_Money_Flow <= 94848.7 )
									ret := -0.071429
								if( Raw_Money_Flow > 94848.7 )
									ret := 0.428571
							if( smoothD_d > 2.13419 )
								if( d <= 20.5191 )
									ret := 0.863636 // buy
								if( d > 20.5191 )
									ret := 0.534884
						if( k > 23.0325 )
							if( Positive_Money_Flow <= 2165.54 )
								if( Typical_Price <= 338.993 )
									ret := 0.040404
								if( Typical_Price > 338.993 )
									ret := 0.625000
							if( Positive_Money_Flow > 2165.54 )
								if( Negative_Money_Flow <= 13650.2 )
									ret := 0.000000
								if( Negative_Money_Flow > 13650.2 )
									ret := 0.913043 // buy
			if( rsi1 > 42.4606 )
				if( smoothK_k <= 79.8494 )
					if( Money_Flow_Ratio <= 0.617265 )
						if( Negative_Money_Flow_Sum <= 2.18719e+06 )
							if( Negative_Money_Flow <= 22376.7 )
								if( d <= 46.9231 )
									ret := -0.294118
								if( d > 46.9231 )
									ret := 0.550000
							if( Negative_Money_Flow > 22376.7 )
								if( Negative_Money_Flow_Sum <= 291789 )
									ret := 0.692308
								if( Negative_Money_Flow_Sum > 291789 )
									ret := -0.381579
						if( Negative_Money_Flow_Sum > 2.18719e+06 )
							if( MFI <= 15.9636 )
								if( Negative_Money_Flow_Sum <= 1.46547e+08 )
									ret := 0.022917
								if( Negative_Money_Flow_Sum > 1.46547e+08 )
									ret := -0.447154
							if( MFI > 15.9636 )
								if( Typical_Price <= 325.37 )
									ret := 0.123091
								if( Typical_Price > 325.37 )
									ret := -0.270588
					if( Money_Flow_Ratio > 0.617265 )
						if( d_k <= -1.69315 )
							if( MFI_High <= -33.0597 )
								if( k <= 45.7298 )
									ret := 0.609756
								if( k > 45.7298 )
									ret := 0.251534
							if( MFI_High > -33.0597 )
								if( MFI <= 53.3736 )
									ret := -0.213333
								if( MFI > 53.3736 )
									ret := 0.082090
						if( d_k > -1.69315 )
							if( MFI_Low <= 34.726 )
								if( Negative_Money_Flow <= 2737.67 )
									ret := 0.756757 // buy
								if( Negative_Money_Flow > 2737.67 )
									ret := 0.122705
							if( MFI_Low > 34.726 )
								if( Negative_Money_Flow_Sum <= 199581 )
									ret := -0.159292
								if( Negative_Money_Flow_Sum > 199581 )
									ret := 0.301866
				if( smoothK_k > 79.8494 )
					if( rsi1 <= 72.5255 )
						if( Negative_Money_Flow_Sum <= 1.67445e+07 )
							if( Negative_Money_Flow_Sum <= 1.12818e+07 )
								if( Positive_Money_Flow_Sum <= 1.30011e+07 )
									ret := -0.118081
								if( Positive_Money_Flow_Sum > 1.30011e+07 )
									ret := 0.164000
							if( Negative_Money_Flow_Sum > 1.12818e+07 )
								if( Positive_Money_Flow_Sum <= 2.63365e+07 )
									ret := -0.742424 // sell
								if( Positive_Money_Flow_Sum > 2.63365e+07 )
									ret := -0.181818
						if( Negative_Money_Flow_Sum > 1.67445e+07 )
							if( Negative_Money_Flow_Sum <= 1.14538e+08 )
								if( k <= 97.9973 )
									ret := 0.188634
								if( k > 97.9973 )
									ret := -0.147826
							if( Negative_Money_Flow_Sum > 1.14538e+08 )
								if( rsi1 <= 62.1001 )
									ret := -0.038462
								if( rsi1 > 62.1001 )
									ret := -0.600000
					if( rsi1 > 72.5255 )
						if( Negative_Money_Flow_Sum <= 1.72792e+07 )
							if( d_k <= 0.918701 )
								if( Positive_Money_Flow <= 352.434 )
									ret := -0.368852
								if( Positive_Money_Flow > 352.434 )
									ret := -0.785714 // sell
							if( d_k > 0.918701 )
								if( Typical_Price <= 122.103 )
									ret := 0.053333
								if( Typical_Price > 122.103 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 1.72792e+07 )
							if( rsi1 <= 82.5655 )
								if( Money_Flow_Ratio <= 0.624025 )
									ret := -0.454545
								if( Money_Flow_Ratio > 0.624025 )
									ret := 0.232000
							if( rsi1 > 82.5655 )
								if( MFI_High <= 2.24167 )
									ret := -0.103448
								if( MFI_High > 2.24167 )
									ret := -0.714286 // sell
		if( Raw_Money_Flow > 467029 )
			if( Negative_Money_Flow_Sum <= 3.86939e+08 )
				if( Raw_Money_Flow <= 2.47071e+07 )
					if( d_k <= 5.25241 )
						if( MFI_Low <= -2.94305 )
							if( Positive_Money_Flow_Sum <= 1.52129e+07 )
								if( Money_Flow_Ratio <= 0.012 )
									ret := 0.236025
								if( Money_Flow_Ratio > 0.012 )
									ret := 0.008613
							if( Positive_Money_Flow_Sum > 1.52129e+07 )
								if( k <= 46.3725 )
									ret := 0.387283
								if( k > 46.3725 )
									ret := -0.125000
						if( MFI_Low > -2.94305 )
							if( Negative_Money_Flow_Sum <= 3.42336e+08 )
								if( Positive_Money_Flow_Sum <= 2.89338e+08 )
									ret := 0.014654
								if( Positive_Money_Flow_Sum > 2.89338e+08 )
									ret := -0.257642
							if( Negative_Money_Flow_Sum > 3.42336e+08 )
								if( d <= 17.9708 )
									ret := -0.166667
								if( d > 17.9708 )
									ret := 0.704545 // buy
					if( d_k > 5.25241 )
						if( Money_Flow_Ratio <= 0.010629 )
							if( Negative_Money_Flow <= 1.40297e+07 )
								if( Positive_Money_Flow_Sum <= 140590 )
									ret := 0.224490
								if( Positive_Money_Flow_Sum > 140590 )
									ret := -0.216216
							if( Negative_Money_Flow > 1.40297e+07 )
								if( Negative_Money_Flow <= 1.54361e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 1.54361e+07 )
									ret := -0.341772
						if( Money_Flow_Ratio > 0.010629 )
							if( Positive_Money_Flow_Sum <= 1.11036e+06 )
								if( Raw_Money_Flow <= 1.82442e+07 )
									ret := 0.323077
								if( Raw_Money_Flow > 1.82442e+07 )
									ret := -0.152778
							if( Positive_Money_Flow_Sum > 1.11036e+06 )
								if( Positive_Money_Flow_Sum <= 6.31518e+06 )
									ret := -0.056250
								if( Positive_Money_Flow_Sum > 6.31518e+06 )
									ret := 0.096040
				if( Raw_Money_Flow > 2.47071e+07 )
					if( Negative_Money_Flow_Sum <= 2.72052e+08 )
						if( Positive_Money_Flow_Sum <= 3.06523e+08 )
							if( Raw_Money_Flow <= 1.07996e+08 )
								if( MFI <= 1.22501 )
									ret := 0.100000
								if( MFI > 1.22501 )
									ret := -0.061556
							if( Raw_Money_Flow > 1.07996e+08 )
								if( Negative_Money_Flow_Sum <= 2.23375e+08 )
									ret := 0.680556
								if( Negative_Money_Flow_Sum > 2.23375e+08 )
									ret := -0.351351
						if( Positive_Money_Flow_Sum > 3.06523e+08 )
							if( Typical_Price <= 290.718 )
								if( rsi1 <= 89.3855 )
									ret := 0.522581
								if( rsi1 > 89.3855 )
									ret := -0.666667
							if( Typical_Price > 290.718 )
								if( Money_Flow_Ratio <= 10.9023 )
									ret := 0.011494
								if( Money_Flow_Ratio > 10.9023 )
									ret := -0.769231 // sell
					if( Negative_Money_Flow_Sum > 2.72052e+08 )
						if( Negative_Money_Flow <= 2.45605e+08 )
							if( MFI <= 58.2855 )
								if( Negative_Money_Flow_Sum <= 3.07815e+08 )
									ret := -0.491935
								if( Negative_Money_Flow_Sum > 3.07815e+08 )
									ret := -0.135036
							if( MFI > 58.2855 )
								if( Positive_Money_Flow_Sum <= 4.41686e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.41686e+08 )
									ret := -0.275862
						if( Negative_Money_Flow > 2.45605e+08 )
							if( Raw_Money_Flow <= 2.84107e+08 )
								ret := 0.500000
							if( Raw_Money_Flow > 2.84107e+08 )
								ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 3.86939e+08 )
				if( Negative_Money_Flow_Sum <= 1.18149e+09 )
					if( Negative_Money_Flow_Sum <= 5.32882e+08 )
						if( Raw_Money_Flow <= 3.12263e+07 )
							if( Typical_Price <= 263.239 )
								if( rsi1 <= 53.3813 )
									ret := 0.808989 // buy
								if( rsi1 > 53.3813 )
									ret := -0.500000
							if( Typical_Price > 263.239 )
								if( Negative_Money_Flow_Sum <= 4.47547e+08 )
									ret := 0.647059
								if( Negative_Money_Flow_Sum > 4.47547e+08 )
									ret := -0.318182
						if( Raw_Money_Flow > 3.12263e+07 )
							if( smoothD_d <= 39.605 )
								if( MFI_Low <= -14.8887 )
									ret := 0.260870
								if( MFI_Low > -14.8887 )
									ret := -0.201342
							if( smoothD_d > 39.605 )
								if( k <= 90.1272 )
									ret := 0.405797
								if( k > 90.1272 )
									ret := -0.500000
					if( Negative_Money_Flow_Sum > 5.32882e+08 )
						if( Negative_Money_Flow_Sum <= 6.5497e+08 )
							if( Negative_Money_Flow <= 95875.4 )
								ret := -0.500000
							if( Negative_Money_Flow > 95875.4 )
								if( d <= 36.5023 )
									ret := 0.564885
								if( d > 36.5023 )
									ret := 0.875000 // buy
						if( Negative_Money_Flow_Sum > 6.5497e+08 )
							if( smoothK_k <= -2.51605 )
								if( d_k <= 1.64299 )
									ret := 1.000000 // buy
								if( d_k > 1.64299 )
									ret := 0.750000 // buy
							if( smoothK_k > -2.51605 )
								if( Raw_Money_Flow <= 7.37713e+07 )
									ret := -0.183333
								if( Raw_Money_Flow > 7.37713e+07 )
									ret := 0.341463
				if( Negative_Money_Flow_Sum > 1.18149e+09 )
					if( Money_Flow_Ratio <= 0.225639 )
						if( Positive_Money_Flow_Sum <= 3.25118e+08 )
							if( MFI <= 10.9898 )
								ret := 0.500000
							if( MFI > 10.9898 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 3.25118e+08 )
							ret := 0.250000
					if( Money_Flow_Ratio > 0.225639 )
						if( MFI_High <= -54.3844 )
							if( smoothK_k <= 26.9503 )
								ret := -1.000000 // sell
							if( smoothK_k > 26.9503 )
								ret := -0.500000
						if( MFI_High > -54.3844 )
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
float op_operation = decision_tree_0_TWLO_15Min_a46e2182(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


