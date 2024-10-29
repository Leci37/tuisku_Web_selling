//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: GOOG_1Min_2MS0_beb67a3b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2MS0_beb67a3b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_beb67a3b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 43.0886 )
		if( Negative_Money_Flow_Sum <= 1.16298e+07 )
			if( Raw_Money_Flow <= 1.09803e+06 )
				if( d_k <= -6.59397 )
					if( rsi1 <= 34.833 )
						if( Positive_Money_Flow_Sum <= 107894 )
							if( k <= 28.8941 )
								ret := -1.000000 // sell
							if( k > 28.8941 )
								ret := -0.400000
						if( Positive_Money_Flow_Sum > 107894 )
							if( smoothD_d <= 8.1559 )
								if( Money_Flow_Ratio <= 0.338627 )
									ret := -0.527778
								if( Money_Flow_Ratio > 0.338627 )
									ret := 0.235294
							if( smoothD_d > 8.1559 )
								if( Negative_Money_Flow_Sum <= 3.48456e+06 )
									ret := 0.404255
								if( Negative_Money_Flow_Sum > 3.48456e+06 )
									ret := 0.051020
					if( rsi1 > 34.833 )
						if( Negative_Money_Flow_Sum <= 9.93521e+06 )
							if( MFI_High <= -67.799 )
								if( Money_Flow_Ratio <= 0.108202 )
									ret := -0.857143 // sell
								if( Money_Flow_Ratio > 0.108202 )
									ret := -0.428571
							if( MFI_High > -67.799 )
								if( Negative_Money_Flow_Sum <= 3.73203e+06 )
									ret := 0.020498
								if( Negative_Money_Flow_Sum > 3.73203e+06 )
									ret := -0.385714
						if( Negative_Money_Flow_Sum > 9.93521e+06 )
							if( d_k <= -15.0753 )
								ret := 1.000000 // buy
							if( d_k > -15.0753 )
								if( d_k <= -12.2659 )
									ret := 0.250000
								if( d_k > -12.2659 )
									ret := 0.750000 // buy
				if( d_k > -6.59397 )
					if( d <= 11.5133 )
						if( Raw_Money_Flow <= 187135 )
							if( Positive_Money_Flow_Sum <= 289328 )
								if( Negative_Money_Flow_Sum <= 2.40397e+06 )
									ret := -0.107296
								if( Negative_Money_Flow_Sum > 2.40397e+06 )
									ret := -0.818182 // sell
							if( Positive_Money_Flow_Sum > 289328 )
								if( rsi1 <= 34.4382 )
									ret := 0.233969
								if( rsi1 > 34.4382 )
									ret := -0.019048
						if( Raw_Money_Flow > 187135 )
							if( Negative_Money_Flow_Sum <= 5.17518e+06 )
								if( rsi1 <= 40.0733 )
									ret := 0.231733
								if( rsi1 > 40.0733 )
									ret := -0.218182
							if( Negative_Money_Flow_Sum > 5.17518e+06 )
								if( Negative_Money_Flow <= 850564 )
									ret := 0.688172
								if( Negative_Money_Flow > 850564 )
									ret := -0.333333
					if( d > 11.5133 )
						if( Negative_Money_Flow_Sum <= 1.83749e+06 )
							if( Negative_Money_Flow_Sum <= 826265 )
								if( Typical_Price <= 170.272 )
									ret := 0.271264
								if( Typical_Price > 170.272 )
									ret := -0.005195
							if( Negative_Money_Flow_Sum > 826265 )
								if( rsi1 <= 39.2144 )
									ret := 0.402271
								if( rsi1 > 39.2144 )
									ret := 0.215094
						if( Negative_Money_Flow_Sum > 1.83749e+06 )
							if( rsi1 <= 20.3223 )
								if( Typical_Price <= 168.389 )
									ret := 0.400000
								if( Typical_Price > 168.389 )
									ret := 0.871795 // buy
							if( rsi1 > 20.3223 )
								if( Typical_Price <= 158.175 )
									ret := 0.410628
								if( Typical_Price > 158.175 )
									ret := 0.098887
			if( Raw_Money_Flow > 1.09803e+06 )
				if( smoothD_d <= 73.0625 )
					if( MFI_High <= -52.2293 )
						if( Positive_Money_Flow_Sum <= 370260 )
							if( Money_Flow_Ratio <= 0.055317 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.055317 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 370260 )
							if( Negative_Money_Flow_Sum <= 7.67116e+06 )
								if( d_k <= 1.01711 )
									ret := 0.228571
								if( d_k > 1.01711 )
									ret := 0.772059 // buy
							if( Negative_Money_Flow_Sum > 7.67116e+06 )
								if( d <= 65.2235 )
									ret := 0.952381 // buy
								if( d > 65.2235 )
									ret := 0.000000
					if( MFI_High > -52.2293 )
						if( d <= 41.1932 )
							if( Negative_Money_Flow <= 1.1359e+06 )
								if( Negative_Money_Flow_Sum <= 1.12268e+07 )
									ret := 0.732283 // buy
								if( Negative_Money_Flow_Sum > 1.12268e+07 )
									ret := -0.300000
							if( Negative_Money_Flow > 1.1359e+06 )
								if( Raw_Money_Flow <= 1.34299e+06 )
									ret := -0.411765
								if( Raw_Money_Flow > 1.34299e+06 )
									ret := 0.434783
						if( d > 41.1932 )
							if( d_k <= 13.2403 )
								if( d_k <= -0.095858 )
									ret := -0.222222
								if( d_k > -0.095858 )
									ret := 0.724138 // buy
							if( d_k > 13.2403 )
								if( Money_Flow_Ratio <= 0.626658 )
									ret := 0.375000
								if( Money_Flow_Ratio > 0.626658 )
									ret := -0.481481
				if( smoothD_d > 73.0625 )
					if( Raw_Money_Flow <= 1.28245e+06 )
						if( Negative_Money_Flow <= 1.14509e+06 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.14509e+06 )
							ret := -0.750000 // sell
					if( Raw_Money_Flow > 1.28245e+06 )
						if( Raw_Money_Flow <= 2.63016e+06 )
							if( d_k <= 13.881 )
								if( rsi1 <= 33.5775 )
									ret := 0.500000
								if( rsi1 > 33.5775 )
									ret := 1.000000 // buy
							if( d_k > 13.881 )
								ret := -0.200000
						if( Raw_Money_Flow > 2.63016e+06 )
							ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 1.16298e+07 )
			if( Typical_Price <= 152.75 )
				if( Negative_Money_Flow_Sum <= 3.04072e+07 )
					if( Negative_Money_Flow_Sum <= 3.02968e+07 )
						if( rsi1 <= 40.8684 )
							if( Positive_Money_Flow <= 2.9055e+06 )
								if( Money_Flow_Ratio <= 0.455406 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.455406 )
									ret := 0.000000
							if( Positive_Money_Flow > 2.9055e+06 )
								ret := 0.428571
						if( rsi1 > 40.8684 )
							if( Typical_Price <= 150.652 )
								ret := 0.750000 // buy
							if( Typical_Price > 150.652 )
								ret := 0.500000
					if( Negative_Money_Flow_Sum > 3.02968e+07 )
						ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 3.04072e+07 )
					if( Positive_Money_Flow_Sum <= 6.41227e+06 )
						if( Raw_Money_Flow <= 4.0642e+06 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 4.0642e+06 )
							ret := -0.428571
					if( Positive_Money_Flow_Sum > 6.41227e+06 )
						if( Positive_Money_Flow_Sum <= 1.80796e+07 )
							if( Positive_Money_Flow_Sum <= 1.43719e+07 )
								if( d_k <= -1.47788 )
									ret := 0.866667 // buy
								if( d_k > -1.47788 )
									ret := 0.153846
							if( Positive_Money_Flow_Sum > 1.43719e+07 )
								if( Negative_Money_Flow_Sum <= 5.58911e+07 )
									ret := -0.083333
								if( Negative_Money_Flow_Sum > 5.58911e+07 )
									ret := 0.375000
						if( Positive_Money_Flow_Sum > 1.80796e+07 )
							if( Money_Flow_Ratio <= 0.291453 )
								if( d_k <= 16.2025 )
									ret := -0.750000 // sell
								if( d_k > 16.2025 )
									ret := 0.333333
							if( Money_Flow_Ratio > 0.291453 )
								if( MFI <= 22.9039 )
									ret := 1.000000 // buy
								if( MFI > 22.9039 )
									ret := -0.246269
			if( Typical_Price > 152.75 )
				if( Negative_Money_Flow <= 2.09628e+06 )
					if( Money_Flow_Ratio <= 0.022162 )
						if( smoothK_k <= 23.0916 )
							if( Raw_Money_Flow <= 231408 )
								if( smoothD_d <= 35.0156 )
									ret := -0.111111
								if( smoothD_d > 35.0156 )
									ret := 0.500000
							if( Raw_Money_Flow > 231408 )
								if( d_k <= 3.02236 )
									ret := 0.666667
								if( d_k > 3.02236 )
									ret := 0.000000
						if( smoothK_k > 23.0916 )
							if( d <= 64.7701 )
								if( rsi1 <= 41.4854 )
									ret := 0.871795 // buy
								if( rsi1 > 41.4854 )
									ret := 0.000000
							if( d > 64.7701 )
								ret := 0.142857
					if( Money_Flow_Ratio > 0.022162 )
						if( MFI_Low <= -7.5723 )
							if( Raw_Money_Flow <= 573557 )
								if( Positive_Money_Flow_Sum <= 566882 )
									ret := -0.615385
								if( Positive_Money_Flow_Sum > 566882 )
									ret := 0.247863
							if( Raw_Money_Flow > 573557 )
								if( rsi1 <= 23.9109 )
									ret := -0.136364
								if( rsi1 > 23.9109 )
									ret := -0.592308
						if( MFI_Low > -7.5723 )
							if( Positive_Money_Flow_Sum <= 3.09705e+08 )
								if( Positive_Money_Flow_Sum <= 5.84835e+07 )
									ret := 0.007850
								if( Positive_Money_Flow_Sum > 5.84835e+07 )
									ret := 0.178388
							if( Positive_Money_Flow_Sum > 3.09705e+08 )
								if( d_k <= -14.7249 )
									ret := -0.615385
								if( d_k > -14.7249 )
									ret := -0.144828
				if( Negative_Money_Flow > 2.09628e+06 )
					if( Negative_Money_Flow_Sum <= 9.09527e+07 )
						if( Positive_Money_Flow_Sum <= 1.55048e+06 )
							if( d_k <= 0.002673 )
								if( MFI_High <= -78.7511 )
									ret := 0.428571
								if( MFI_High > -78.7511 )
									ret := 1.000000 // buy
							if( d_k > 0.002673 )
								if( Negative_Money_Flow_Sum <= 2.06667e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 2.06667e+07 )
									ret := 0.315789
						if( Positive_Money_Flow_Sum > 1.55048e+06 )
							if( smoothK_k <= -2.39736 )
								if( rsi1 <= 23.6754 )
									ret := -0.134663
								if( rsi1 > 23.6754 )
									ret := 0.073874
							if( smoothK_k > -2.39736 )
								if( Money_Flow_Ratio <= 0.264993 )
									ret := 0.209817
								if( Money_Flow_Ratio > 0.264993 )
									ret := 0.090114
					if( Negative_Money_Flow_Sum > 9.09527e+07 )
						if( Negative_Money_Flow_Sum <= 4.14156e+08 )
							if( smoothD_d <= 36.363 )
								if( Positive_Money_Flow_Sum <= 1.38806e+07 )
									ret := -0.219409
								if( Positive_Money_Flow_Sum > 1.38806e+07 )
									ret := 0.078447
							if( smoothD_d > 36.363 )
								if( rsi1 <= 40.3274 )
									ret := -0.267123
								if( rsi1 > 40.3274 )
									ret := 0.353659
						if( Negative_Money_Flow_Sum > 4.14156e+08 )
							if( MFI_Low <= 9.21634 )
								if( Raw_Money_Flow <= 6.82505e+06 )
									ret := -0.142857
								if( Raw_Money_Flow > 6.82505e+06 )
									ret := 0.674157
							if( MFI_Low > 9.21634 )
								if( Money_Flow_Ratio <= 0.677431 )
									ret := -0.923077 // sell
								if( Money_Flow_Ratio > 0.677431 )
									ret := 0.625000
	if( rsi1 > 43.0886 )
		if( Raw_Money_Flow <= 9.29892e+06 )
			if( Negative_Money_Flow <= 40.7814 )
				if( MFI <= 53.7227 )
					if( Money_Flow_Ratio <= 0.913316 )
						if( Negative_Money_Flow_Sum <= 1.16777e+06 )
							if( Negative_Money_Flow_Sum <= 597415 )
								if( smoothK_k <= 68.9475 )
									ret := -0.374150
								if( smoothK_k > 68.9475 )
									ret := 0.183333
							if( Negative_Money_Flow_Sum > 597415 )
								if( Negative_Money_Flow_Sum <= 714974 )
									ret := 0.427481
								if( Negative_Money_Flow_Sum > 714974 )
									ret := 0.123010
						if( Negative_Money_Flow_Sum > 1.16777e+06 )
							if( Money_Flow_Ratio <= 0.539453 )
								if( d_k <= 5.49108 )
									ret := -0.129838
								if( d_k > 5.49108 )
									ret := 0.027523
							if( Money_Flow_Ratio > 0.539453 )
								if( d_k <= -1.77641 )
									ret := -0.068640
								if( d_k > -1.77641 )
									ret := 0.058204
					if( Money_Flow_Ratio > 0.913316 )
						if( rsi1 <= 65.0694 )
							if( d_k <= -2.83094 )
								if( Negative_Money_Flow_Sum <= 3.4273e+07 )
									ret := -0.184709
								if( Negative_Money_Flow_Sum > 3.4273e+07 )
									ret := 0.010811
							if( d_k > -2.83094 )
								if( Typical_Price <= 173.646 )
									ret := 0.026385
								if( Typical_Price > 173.646 )
									ret := -0.134426
						if( rsi1 > 65.0694 )
							if( Positive_Money_Flow_Sum <= 7.04862e+06 )
								if( smoothK_k <= 25.7354 )
									ret := 0.400000
								if( smoothK_k > 25.7354 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 7.04862e+06 )
								if( Negative_Money_Flow_Sum <= 3.04469e+07 )
									ret := 0.069307
								if( Negative_Money_Flow_Sum > 3.04469e+07 )
									ret := -0.403509
				if( MFI > 53.7227 )
					if( Positive_Money_Flow <= 1.42728e+06 )
						if( smoothK_k <= 89.6815 )
							if( d_k <= -11.6061 )
								if( MFI_Low <= 39.9693 )
									ret := 0.088889
								if( MFI_Low > 39.9693 )
									ret := -0.209836
							if( d_k > -11.6061 )
								if( k <= 17.1475 )
									ret := -0.196602
								if( k > 17.1475 )
									ret := 0.033281
						if( smoothK_k > 89.6815 )
							if( Money_Flow_Ratio <= 9.77823 )
								if( Positive_Money_Flow_Sum <= 899306 )
									ret := 0.062992
								if( Positive_Money_Flow_Sum > 899306 )
									ret := -0.176546
							if( Money_Flow_Ratio > 9.77823 )
								if( Positive_Money_Flow <= 63057.3 )
									ret := 0.307692
								if( Positive_Money_Flow > 63057.3 )
									ret := -0.538462
					if( Positive_Money_Flow > 1.42728e+06 )
						if( Typical_Price <= 165.39 )
							if( rsi1 <= 71.5178 )
								if( Money_Flow_Ratio <= 2.51658 )
									ret := 0.110699
								if( Money_Flow_Ratio > 2.51658 )
									ret := -0.156627
							if( rsi1 > 71.5178 )
								if( Positive_Money_Flow_Sum <= 2.73771e+07 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 2.73771e+07 )
									ret := 0.298246
						if( Typical_Price > 165.39 )
							if( Money_Flow_Ratio <= 1.25504 )
								if( Positive_Money_Flow <= 2.01027e+06 )
									ret := -0.322581
								if( Positive_Money_Flow > 2.01027e+06 )
									ret := 0.236181
							if( Money_Flow_Ratio > 1.25504 )
								if( d_k <= 1.38673 )
									ret := -0.020466
								if( d_k > 1.38673 )
									ret := 0.084236
			if( Negative_Money_Flow > 40.7814 )
				if( smoothD_d <= 19.1421 )
					if( Positive_Money_Flow_Sum <= 2.83964e+06 )
						if( MFI_High <= -4.62409 )
							if( Positive_Money_Flow_Sum <= 1.4765e+06 )
								if( Positive_Money_Flow_Sum <= 549632 )
									ret := -0.265152
								if( Positive_Money_Flow_Sum > 549632 )
									ret := 0.062963
							if( Positive_Money_Flow_Sum > 1.4765e+06 )
								if( d_k <= -5.71231 )
									ret := 0.148148
								if( d_k > -5.71231 )
									ret := -0.419118
						if( MFI_High > -4.62409 )
							if( Typical_Price <= 175.141 )
								if( rsi1 <= 47.7046 )
									ret := 0.142857
								if( rsi1 > 47.7046 )
									ret := -0.818182 // sell
							if( Typical_Price > 175.141 )
								ret := 0.800000 // buy
					if( Positive_Money_Flow_Sum > 2.83964e+06 )
						if( Raw_Money_Flow <= 2.95607e+06 )
							if( Money_Flow_Ratio <= 4.81494 )
								if( Positive_Money_Flow <= 31326.7 )
									ret := 0.117155
								if( Positive_Money_Flow > 31326.7 )
									ret := 0.677419
							if( Money_Flow_Ratio > 4.81494 )
								if( Positive_Money_Flow <= 66532.9 )
									ret := -0.163934
								if( Positive_Money_Flow > 66532.9 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.95607e+06 )
							if( Typical_Price <= 157.688 )
								if( MFI <= 39.3312 )
									ret := -1.000000 // sell
								if( MFI > 39.3312 )
									ret := 0.338462
							if( Typical_Price > 157.688 )
								if( Negative_Money_Flow <= 7.75985e+06 )
									ret := -0.161412
								if( Negative_Money_Flow > 7.75985e+06 )
									ret := 0.141304
				if( smoothD_d > 19.1421 )
					if( Positive_Money_Flow_Sum <= 1.15171e+06 )
						if( Negative_Money_Flow_Sum <= 228299 )
							if( Negative_Money_Flow_Sum <= 128800 )
								if( Positive_Money_Flow_Sum <= 748400 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 748400 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 128800 )
								if( Money_Flow_Ratio <= 5.20823 )
									ret := -0.296703
								if( Money_Flow_Ratio > 5.20823 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 228299 )
							if( Positive_Money_Flow_Sum <= 327877 )
								if( Positive_Money_Flow_Sum <= 262556 )
									ret := 0.213333
								if( Positive_Money_Flow_Sum > 262556 )
									ret := -0.362205
							if( Positive_Money_Flow_Sum > 327877 )
								if( MFI_Low <= 54.4911 )
									ret := 0.183536
								if( MFI_Low > 54.4911 )
									ret := 0.521008
					if( Positive_Money_Flow_Sum > 1.15171e+06 )
						if( Negative_Money_Flow_Sum <= 7.13416e+07 )
							if( Negative_Money_Flow_Sum <= 6.5246e+07 )
								if( rsi1 <= 58.5787 )
									ret := 0.064726
								if( rsi1 > 58.5787 )
									ret := 0.008109
							if( Negative_Money_Flow_Sum > 6.5246e+07 )
								if( Negative_Money_Flow <= 6.02611e+06 )
									ret := -0.090909
								if( Negative_Money_Flow > 6.02611e+06 )
									ret := 0.626168
						if( Negative_Money_Flow_Sum > 7.13416e+07 )
							if( Positive_Money_Flow_Sum <= 6.14747e+08 )
								if( Positive_Money_Flow <= 31000.3 )
									ret := -0.104991
								if( Positive_Money_Flow > 31000.3 )
									ret := -0.394495
							if( Positive_Money_Flow_Sum > 6.14747e+08 )
								if( smoothD_d <= 91.0334 )
									ret := 0.653061
								if( smoothD_d > 91.0334 )
									ret := -0.384615
		if( Raw_Money_Flow > 9.29892e+06 )
			if( MFI_Low <= 49.2851 )
				if( Positive_Money_Flow_Sum <= 4.32459e+07 )
					if( Typical_Price <= 169.468 )
						if( Typical_Price <= 157.392 )
							if( Typical_Price <= 151.061 )
								ret := -0.142857
							if( Typical_Price > 151.061 )
								if( rsi1 <= 52.1446 )
									ret := -0.650000
								if( rsi1 > 52.1446 )
									ret := -1.000000 // sell
						if( Typical_Price > 157.392 )
							if( smoothD_d <= 66.2056 )
								if( Typical_Price <= 162.666 )
									ret := 0.205882
								if( Typical_Price > 162.666 )
									ret := -0.216216
							if( smoothD_d > 66.2056 )
								if( smoothK_k <= 80.8042 )
									ret := -0.703704 // sell
								if( smoothK_k > 80.8042 )
									ret := -0.360000
					if( Typical_Price > 169.468 )
						if( Positive_Money_Flow_Sum <= 3.07297e+07 )
							if( Typical_Price <= 184.587 )
								if( Typical_Price <= 170.117 )
									ret := -0.500000
								if( Typical_Price > 170.117 )
									ret := 0.592593
							if( Typical_Price > 184.587 )
								if( Money_Flow_Ratio <= 0.3342 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.3342 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 3.07297e+07 )
							if( MFI_Low <= 36.6274 )
								if( smoothD_d <= 45.9904 )
									ret := 0.250000
								if( smoothD_d > 45.9904 )
									ret := -0.357143
							if( MFI_Low > 36.6274 )
								if( Money_Flow_Ratio <= 2.03702 )
									ret := 0.526316
								if( Money_Flow_Ratio > 2.03702 )
									ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 4.32459e+07 )
					if( d <= 46.9475 )
						if( rsi1 <= 49.197 )
							if( Positive_Money_Flow_Sum <= 1.79914e+08 )
								if( Raw_Money_Flow <= 1.07378e+07 )
									ret := 0.607843
								if( Raw_Money_Flow > 1.07378e+07 )
									ret := 0.237500
							if( Positive_Money_Flow_Sum > 1.79914e+08 )
								if( MFI_Low <= 36.9151 )
									ret := -0.454545
								if( MFI_Low > 36.9151 )
									ret := -0.923077 // sell
						if( rsi1 > 49.197 )
							if( Negative_Money_Flow_Sum <= 3.69811e+07 )
								if( Negative_Money_Flow_Sum <= 3.5293e+07 )
									ret := 0.275862
								if( Negative_Money_Flow_Sum > 3.5293e+07 )
									ret := 0.842105 // buy
							if( Negative_Money_Flow_Sum > 3.69811e+07 )
								if( MFI_Low <= 46.8918 )
									ret := -0.074194
								if( MFI_Low > 46.8918 )
									ret := 0.322034
					if( d > 46.9475 )
						if( Negative_Money_Flow <= 1.39324e+07 )
							if( Typical_Price <= 181.705 )
								if( MFI <= 31.7787 )
									ret := 0.760000 // buy
								if( MFI > 31.7787 )
									ret := 0.334022
							if( Typical_Price > 181.705 )
								if( Negative_Money_Flow_Sum <= 3.76072e+07 )
									ret := 0.437500
								if( Negative_Money_Flow_Sum > 3.76072e+07 )
									ret := -0.333333
						if( Negative_Money_Flow > 1.39324e+07 )
							if( Positive_Money_Flow_Sum <= 4.21648e+08 )
								if( Positive_Money_Flow <= 7.98696e+06 )
									ret := 0.034682
								if( Positive_Money_Flow > 7.98696e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.21648e+08 )
								if( k <= 75.9848 )
									ret := 0.333333
								if( k > 75.9848 )
									ret := 0.928571 // buy
			if( MFI_Low > 49.2851 )
				if( Positive_Money_Flow_Sum <= 6.09028e+08 )
					if( rsi1 <= 68.0111 )
						if( Negative_Money_Flow_Sum <= 4.44654e+07 )
							if( Raw_Money_Flow <= 1.5446e+07 )
								if( Positive_Money_Flow_Sum <= 1.29962e+08 )
									ret := -0.052817
								if( Positive_Money_Flow_Sum > 1.29962e+08 )
									ret := 0.367816
							if( Raw_Money_Flow > 1.5446e+07 )
								if( Negative_Money_Flow_Sum <= 7.60674e+06 )
									ret := -0.220000
								if( Negative_Money_Flow_Sum > 7.60674e+06 )
									ret := 0.528926
						if( Negative_Money_Flow_Sum > 4.44654e+07 )
							if( Positive_Money_Flow_Sum <= 1.45965e+08 )
								if( Positive_Money_Flow <= 1.48661e+07 )
									ret := -0.812500 // sell
								if( Positive_Money_Flow > 1.48661e+07 )
									ret := 0.285714
							if( Positive_Money_Flow_Sum > 1.45965e+08 )
								if( Negative_Money_Flow_Sum <= 1.56038e+08 )
									ret := 0.026549
								if( Negative_Money_Flow_Sum > 1.56038e+08 )
									ret := -0.862069 // sell
					if( rsi1 > 68.0111 )
						if( Positive_Money_Flow_Sum <= 1.58878e+08 )
							if( Raw_Money_Flow <= 1.13215e+07 )
								if( d_k <= 3.19568 )
									ret := 0.024691
								if( d_k > 3.19568 )
									ret := 0.579545
							if( Raw_Money_Flow > 1.13215e+07 )
								if( Positive_Money_Flow <= 1.50181e+07 )
									ret := -0.221311
								if( Positive_Money_Flow > 1.50181e+07 )
									ret := 0.101754
						if( Positive_Money_Flow_Sum > 1.58878e+08 )
							if( Negative_Money_Flow_Sum <= 8.65464e+07 )
								if( Positive_Money_Flow_Sum <= 3.05545e+08 )
									ret := -0.584507
								if( Positive_Money_Flow_Sum > 3.05545e+08 )
									ret := 0.095238
							if( Negative_Money_Flow_Sum > 8.65464e+07 )
								if( Typical_Price <= 161.124 )
									ret := -0.714286 // sell
								if( Typical_Price > 161.124 )
									ret := 0.703704 // buy
				if( Positive_Money_Flow_Sum > 6.09028e+08 )
					if( Raw_Money_Flow <= 7.04979e+08 )
						if( Negative_Money_Flow <= 9511.18 )
							if( rsi1 <= 82.2158 )
								if( smoothD_d <= 76.258 )
									ret := 0.368421
								if( smoothD_d > 76.258 )
									ret := -0.187500
							if( rsi1 > 82.2158 )
								if( MFI_Low <= 70.4086 )
									ret := 0.750000 // buy
								if( MFI_Low > 70.4086 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 9511.18 )
							if( Money_Flow_Ratio <= 4.29651 )
								ret := 0.000000
							if( Money_Flow_Ratio > 4.29651 )
								if( Negative_Money_Flow <= 1.65014e+07 )
									ret := 0.941176 // buy
								if( Negative_Money_Flow > 1.65014e+07 )
									ret := 0.705882 // buy
					if( Raw_Money_Flow > 7.04979e+08 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_GOOG_1Min_beb67a3b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


