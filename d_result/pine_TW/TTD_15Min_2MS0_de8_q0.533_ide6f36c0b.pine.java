//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: TTD_15Min_2MS0_e6f36c0b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2MS0_e6f36c0b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_e6f36c0b(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 53.4269 )
		if( Raw_Money_Flow <= 3.83757e+06 )
			if( rsi1 <= 34.8072 )
				if( Typical_Price <= 424.248 )
					if( MFI_Low <= -19.4553 )
						if( Raw_Money_Flow <= 161173 )
							if( d_k <= 0.342201 )
								if( d_k <= -19.1944 )
									ret := 0.142857
								if( d_k > -19.1944 )
									ret := 0.807692 // buy
							if( d_k > 0.342201 )
								if( k <= 26.9725 )
									ret := 0.227273
								if( k > 26.9725 )
									ret := 0.724138 // buy
						if( Raw_Money_Flow > 161173 )
							if( MFI <= 0.398794 )
								if( k <= 16.0696 )
									ret := 0.100000
								if( k > 16.0696 )
									ret := -0.777778 // sell
							if( MFI > 0.398794 )
								if( rsi1 <= 24.7153 )
									ret := 0.400000
								if( rsi1 > 24.7153 )
									ret := 1.000000 // buy
					if( MFI_Low > -19.4553 )
						if( Typical_Price <= 94.0074 )
							if( Money_Flow_Ratio <= 0.469998 )
								if( Typical_Price <= 36.0105 )
									ret := 0.641711
								if( Typical_Price > 36.0105 )
									ret := 0.193561
							if( Money_Flow_Ratio > 0.469998 )
								if( d <= 15.3959 )
									ret := -0.026889
								if( d > 15.3959 )
									ret := 0.203947
						if( Typical_Price > 94.0074 )
							if( Raw_Money_Flow <= 2.87254e+06 )
								if( MFI_High <= 17.9193 )
									ret := 0.322489
								if( MFI_High > 17.9193 )
									ret := -0.391304
							if( Raw_Money_Flow > 2.87254e+06 )
								if( Positive_Money_Flow_Sum <= 1.16014e+07 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 1.16014e+07 )
									ret := -0.017143
				if( Typical_Price > 424.248 )
					if( Positive_Money_Flow_Sum <= 8.92627e+07 )
						if( Typical_Price <= 748.502 )
							if( smoothK_k <= 1.06717 )
								if( Typical_Price <= 629.379 )
									ret := 0.230769
								if( Typical_Price > 629.379 )
									ret := 1.000000 // buy
							if( smoothK_k > 1.06717 )
								if( Raw_Money_Flow <= 115306 )
									ret := 0.312500
								if( Raw_Money_Flow > 115306 )
									ret := -0.371795
						if( Typical_Price > 748.502 )
							if( rsi1 <= 25.3831 )
								if( Negative_Money_Flow_Sum <= 1.43948e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.43948e+08 )
									ret := -0.977273 // sell
							if( rsi1 > 25.3831 )
								if( k <= 3.14317 )
									ret := 0.500000
								if( k > 3.14317 )
									ret := -0.416667
					if( Positive_Money_Flow_Sum > 8.92627e+07 )
						if( d <= 88.6152 )
							if( Raw_Money_Flow <= 540774 )
								if( Raw_Money_Flow <= 111949 )
									ret := -0.100000
								if( Raw_Money_Flow > 111949 )
									ret := 0.642857
							if( Raw_Money_Flow > 540774 )
								if( Positive_Money_Flow_Sum <= 1.27668e+08 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 1.27668e+08 )
									ret := 0.333333
						if( d > 88.6152 )
							ret := 1.000000 // buy
			if( rsi1 > 34.8072 )
				if( d_k <= -3.1138 )
					if( Money_Flow_Ratio <= 0.991773 )
						if( Positive_Money_Flow_Sum <= 5.11086e+07 )
							if( Positive_Money_Flow_Sum <= 1.727e+07 )
								if( Positive_Money_Flow <= 165.899 )
									ret := 0.060501
								if( Positive_Money_Flow > 165.899 )
									ret := -0.098416
							if( Positive_Money_Flow_Sum > 1.727e+07 )
								if( Typical_Price <= 91.1136 )
									ret := 0.024217
								if( Typical_Price > 91.1136 )
									ret := 0.211172
						if( Positive_Money_Flow_Sum > 5.11086e+07 )
							if( Negative_Money_Flow <= 266995 )
								if( d <= 37.7906 )
									ret := -0.416667
								if( d > 37.7906 )
									ret := -0.160784
							if( Negative_Money_Flow > 266995 )
								if( Typical_Price <= 224.554 )
									ret := -0.208333
								if( Typical_Price > 224.554 )
									ret := 0.648649
					if( Money_Flow_Ratio > 0.991773 )
						if( smoothD_d <= 39.8165 )
							if( Positive_Money_Flow_Sum <= 711129 )
								if( Negative_Money_Flow_Sum <= 338928 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 338928 )
									ret := -0.688889
							if( Positive_Money_Flow_Sum > 711129 )
								if( Positive_Money_Flow_Sum <= 1.26939e+08 )
									ret := 0.062261
								if( Positive_Money_Flow_Sum > 1.26939e+08 )
									ret := 0.445946
						if( smoothD_d > 39.8165 )
							if( Negative_Money_Flow_Sum <= 1.50108e+06 )
								if( Raw_Money_Flow <= 37448.4 )
									ret := 0.088235
								if( Raw_Money_Flow > 37448.4 )
									ret := 0.535433
							if( Negative_Money_Flow_Sum > 1.50108e+06 )
								if( Typical_Price <= 50.4307 )
									ret := -0.161765
								if( Typical_Price > 50.4307 )
									ret := 0.214925
				if( d_k > -3.1138 )
					if( Negative_Money_Flow <= 1092.79 )
						if( Negative_Money_Flow_Sum <= 2.34834e+08 )
							if( Raw_Money_Flow <= 29777 )
								if( k <= 16.1218 )
									ret := 0.157205
								if( k > 16.1218 )
									ret := -0.108511
							if( Raw_Money_Flow > 29777 )
								if( Negative_Money_Flow_Sum <= 2.13725e+08 )
									ret := 0.087759
								if( Negative_Money_Flow_Sum > 2.13725e+08 )
									ret := 0.850000 // buy
						if( Negative_Money_Flow_Sum > 2.34834e+08 )
							if( MFI <= 12.8932 )
								if( d_k <= 5.77026 )
									ret := -0.250000
								if( d_k > 5.77026 )
									ret := -0.928571 // sell
							if( MFI > 12.8932 )
								if( Negative_Money_Flow_Sum <= 4.42165e+08 )
									ret := -0.277778
								if( Negative_Money_Flow_Sum > 4.42165e+08 )
									ret := 0.571429
					if( Negative_Money_Flow > 1092.79 )
						if( d_k <= 2.89602 )
							if( Positive_Money_Flow_Sum <= 270304 )
								if( Typical_Price <= 86.2993 )
									ret := -0.423077
								if( Typical_Price > 86.2993 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 270304 )
								if( MFI <= 87.8208 )
									ret := 0.125088
								if( MFI > 87.8208 )
									ret := -0.213592
						if( d_k > 2.89602 )
							if( Positive_Money_Flow_Sum <= 1.50421e+08 )
								if( MFI <= 1.30665 )
									ret := 0.494949
								if( MFI > 1.30665 )
									ret := 0.174264
							if( Positive_Money_Flow_Sum > 1.50421e+08 )
								if( smoothK_k <= 52.9969 )
									ret := 0.634409
								if( smoothK_k > 52.9969 )
									ret := 0.068966
		if( Raw_Money_Flow > 3.83757e+06 )
			if( Negative_Money_Flow_Sum <= 1.34836e+09 )
				if( Typical_Price <= 43.791 )
					if( Positive_Money_Flow_Sum <= 1.53288e+07 )
						if( Negative_Money_Flow_Sum <= 7.3691e+06 )
							ret := -0.333333
						if( Negative_Money_Flow_Sum > 7.3691e+06 )
							if( Typical_Price <= 43.28 )
								if( Negative_Money_Flow_Sum <= 1.82805e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 1.82805e+07 )
									ret := 0.937500 // buy
							if( Typical_Price > 43.28 )
								if( Negative_Money_Flow_Sum <= 4.01718e+07 )
									ret := 0.687500
								if( Negative_Money_Flow_Sum > 4.01718e+07 )
									ret := 0.083333
					if( Positive_Money_Flow_Sum > 1.53288e+07 )
						if( Negative_Money_Flow_Sum <= 2.96254e+08 )
							if( Typical_Price <= 41.6775 )
								if( smoothD_d <= 17.3046 )
									ret := 0.892857 // buy
								if( smoothD_d > 17.3046 )
									ret := 0.304348
							if( Typical_Price > 41.6775 )
								if( MFI <= 20.5564 )
									ret := -0.500000
								if( MFI > 20.5564 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 2.96254e+08 )
							if( d <= 5.38144 )
								ret := -1.000000 // sell
							if( d > 5.38144 )
								ret := -0.500000
				if( Typical_Price > 43.791 )
					if( Positive_Money_Flow_Sum <= 4.06838e+08 )
						if( Raw_Money_Flow <= 8.91791e+06 )
							if( d_k <= 16.0138 )
								if( Positive_Money_Flow_Sum <= 4.3034e+06 )
									ret := 0.279476
								if( Positive_Money_Flow_Sum > 4.3034e+06 )
									ret := -0.012064
							if( d_k > 16.0138 )
								if( Negative_Money_Flow_Sum <= 8.16395e+07 )
									ret := -0.110119
								if( Negative_Money_Flow_Sum > 8.16395e+07 )
									ret := -0.447059
						if( Raw_Money_Flow > 8.91791e+06 )
							if( d_k <= -9.51639 )
								if( Negative_Money_Flow <= 8.96009e+06 )
									ret := -0.133086
								if( Negative_Money_Flow > 8.96009e+06 )
									ret := 0.054945
							if( d_k > -9.51639 )
								if( Positive_Money_Flow_Sum <= 3.38588e+07 )
									ret := -0.002837
								if( Positive_Money_Flow_Sum > 3.38588e+07 )
									ret := 0.089149
					if( Positive_Money_Flow_Sum > 4.06838e+08 )
						if( MFI_Low <= 58.8545 )
							if( Negative_Money_Flow_Sum <= 6.84681e+08 )
								if( smoothD_d <= -2.11011 )
									ret := -0.200000
								if( smoothD_d > -2.11011 )
									ret := 0.840426 // buy
							if( Negative_Money_Flow_Sum > 6.84681e+08 )
								if( Negative_Money_Flow <= 5.20179e+07 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow > 5.20179e+07 )
									ret := 0.250000
						if( MFI_Low > 58.8545 )
							if( smoothK_k <= 32.0025 )
								ret := 0.000000
							if( smoothK_k > 32.0025 )
								ret := -0.500000
			if( Negative_Money_Flow_Sum > 1.34836e+09 )
				if( d_k <= 0.772085 )
					ret := -1.000000 // sell
				if( d_k > 0.772085 )
					ret := 0.000000
	if( rsi1 > 53.4269 )
		if( Raw_Money_Flow <= 143247 )
			if( d_k <= -2.1805 )
				if( MFI_Low <= 72.5991 )
					if( Money_Flow_Ratio <= 6.33633 )
						if( Typical_Price <= 208.981 )
							if( Positive_Money_Flow <= 358.269 )
								if( rsi1 <= 75.2511 )
									ret := -0.025875
								if( rsi1 > 75.2511 )
									ret := 0.333333
							if( Positive_Money_Flow > 358.269 )
								if( MFI_High <= 2.2479 )
									ret := -0.188804
								if( MFI_High > 2.2479 )
									ret := -0.507812
						if( Typical_Price > 208.981 )
							if( Positive_Money_Flow <= 35230.8 )
								if( Positive_Money_Flow_Sum <= 8.59327e+07 )
									ret := 0.084746
								if( Positive_Money_Flow_Sum > 8.59327e+07 )
									ret := -0.432836
							if( Positive_Money_Flow > 35230.8 )
								if( Negative_Money_Flow_Sum <= 1.37873e+06 )
									ret := 0.916667 // buy
								if( Negative_Money_Flow_Sum > 1.37873e+06 )
									ret := 0.126697
					if( Money_Flow_Ratio > 6.33633 )
						if( Positive_Money_Flow_Sum <= 1.58647e+08 )
							if( smoothD_d <= 60.9582 )
								if( MFI <= 87.8308 )
									ret := 0.454545
								if( MFI > 87.8308 )
									ret := -0.209302
							if( smoothD_d > 60.9582 )
								if( Negative_Money_Flow_Sum <= 1.4075e+07 )
									ret := 0.487179
								if( Negative_Money_Flow_Sum > 1.4075e+07 )
									ret := -0.428571
						if( Positive_Money_Flow_Sum > 1.58647e+08 )
							if( Negative_Money_Flow_Sum <= 2.27117e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.27117e+07 )
								if( rsi1 <= 67.5105 )
									ret := -0.400000
								if( rsi1 > 67.5105 )
									ret := 0.750000 // buy
				if( MFI_Low > 72.5991 )
					if( k <= 41.7307 )
						if( Positive_Money_Flow <= 21732.2 )
							if( Positive_Money_Flow_Sum <= 1.10391e+08 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.10391e+08 )
								ret := 0.000000
						if( Positive_Money_Flow > 21732.2 )
							if( Negative_Money_Flow_Sum <= 2.62235e+06 )
								if( Typical_Price <= 66.89 )
									ret := 0.750000 // buy
								if( Typical_Price > 66.89 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.62235e+06 )
								ret := 1.000000 // buy
					if( k > 41.7307 )
						if( MFI <= 99.2809 )
							if( rsi1 <= 82.4135 )
								if( d_k <= -2.73543 )
									ret := -0.692913
								if( d_k > -2.73543 )
									ret := 0.000000
							if( rsi1 > 82.4135 )
								if( Negative_Money_Flow <= 11305.4 )
									ret := -0.125000
								if( Negative_Money_Flow > 11305.4 )
									ret := 0.500000
						if( MFI > 99.2809 )
							if( MFI <= 99.3718 )
								if( smoothK_k <= 78.3172 )
									ret := 0.000000
								if( smoothK_k > 78.3172 )
									ret := 1.000000 // buy
							if( MFI > 99.3718 )
								if( Negative_Money_Flow <= 13772.9 )
									ret := -0.454545
								if( Negative_Money_Flow > 13772.9 )
									ret := 0.041667
			if( d_k > -2.1805 )
				if( Negative_Money_Flow_Sum <= 6.88337e+06 )
					if( Positive_Money_Flow <= 311.417 )
						if( MFI <= 57.9235 )
							if( MFI <= 53.9838 )
								if( smoothD_d <= 75.1475 )
									ret := -0.178082
								if( smoothD_d > 75.1475 )
									ret := 0.224138
							if( MFI > 53.9838 )
								if( Negative_Money_Flow_Sum <= 485479 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 485479 )
									ret := 0.638298
						if( MFI > 57.9235 )
							if( rsi1 <= 60.0896 )
								if( Negative_Money_Flow <= 17672.6 )
									ret := 0.395833
								if( Negative_Money_Flow > 17672.6 )
									ret := -0.030120
							if( rsi1 > 60.0896 )
								if( Money_Flow_Ratio <= 1.52055 )
									ret := -0.875000 // sell
								if( Money_Flow_Ratio > 1.52055 )
									ret := -0.148997
					if( Positive_Money_Flow > 311.417 )
						if( Positive_Money_Flow_Sum <= 8.34951e+07 )
							if( Positive_Money_Flow <= 1908.22 )
								if( rsi1 <= 55.9664 )
									ret := -0.428571
								if( rsi1 > 55.9664 )
									ret := -0.913043 // sell
							if( Positive_Money_Flow > 1908.22 )
								if( Money_Flow_Ratio <= 960.457 )
									ret := -0.209515
								if( Money_Flow_Ratio > 960.457 )
									ret := 0.875000 // buy
						if( Positive_Money_Flow_Sum > 8.34951e+07 )
							if( Positive_Money_Flow_Sum <= 1.42765e+08 )
								if( d_k <= 2.65367 )
									ret := -0.052632
								if( d_k > 2.65367 )
									ret := 0.700000 // buy
							if( Positive_Money_Flow_Sum > 1.42765e+08 )
								if( smoothD_d <= 62.4714 )
									ret := -0.625000
								if( smoothD_d > 62.4714 )
									ret := -0.200000
				if( Negative_Money_Flow_Sum > 6.88337e+06 )
					if( Typical_Price <= 128.025 )
						if( Negative_Money_Flow_Sum <= 7.40334e+06 )
							if( MFI_Low <= 62.2561 )
								if( Raw_Money_Flow <= 14673.9 )
									ret := 0.500000
								if( Raw_Money_Flow > 14673.9 )
									ret := 1.000000 // buy
							if( MFI_Low > 62.2561 )
								if( smoothD_d <= 51.6936 )
									ret := 0.428571
								if( smoothD_d > 51.6936 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 7.40334e+06 )
							if( Negative_Money_Flow_Sum <= 8.69097e+06 )
								if( MFI_Low <= 65.8751 )
									ret := -0.764706 // sell
								if( MFI_Low > 65.8751 )
									ret := -0.190476
							if( Negative_Money_Flow_Sum > 8.69097e+06 )
								if( Positive_Money_Flow_Sum <= 4.06027e+07 )
									ret := -0.123188
								if( Positive_Money_Flow_Sum > 4.06027e+07 )
									ret := 0.051447
					if( Typical_Price > 128.025 )
						if( Positive_Money_Flow_Sum <= 1.07285e+08 )
							if( Positive_Money_Flow <= 124775 )
								if( smoothD_d <= 92.5282 )
									ret := 0.300955
								if( smoothD_d > 92.5282 )
									ret := -0.015748
							if( Positive_Money_Flow > 124775 )
								if( d <= 82.8323 )
									ret := -0.833333 // sell
								if( d > 82.8323 )
									ret := 0.166667
						if( Positive_Money_Flow_Sum > 1.07285e+08 )
							if( MFI_Low <= 41.3925 )
								if( MFI_High <= -23.5734 )
									ret := -0.120000
								if( MFI_High > -23.5734 )
									ret := -0.761905 // sell
							if( MFI_Low > 41.3925 )
								if( Negative_Money_Flow_Sum <= 6.3132e+07 )
									ret := -0.076389
								if( Negative_Money_Flow_Sum > 6.3132e+07 )
									ret := 0.458333
		if( Raw_Money_Flow > 143247 )
			if( Money_Flow_Ratio <= 322.861 )
				if( Negative_Money_Flow_Sum <= 1.69068e+07 )
					if( Positive_Money_Flow_Sum <= 1.27301e+08 )
						if( Negative_Money_Flow_Sum <= 419128 )
							if( MFI_Low <= 47.0057 )
								if( Positive_Money_Flow <= 262605 )
									ret := -0.703704 // sell
								if( Positive_Money_Flow > 262605 )
									ret := 0.250000
							if( MFI_Low > 47.0057 )
								if( rsi1 <= 76.5479 )
									ret := -0.105398
								if( rsi1 > 76.5479 )
									ret := 0.261538
						if( Negative_Money_Flow_Sum > 419128 )
							if( Money_Flow_Ratio <= 175.099 )
								if( Positive_Money_Flow_Sum <= 1.83285e+06 )
									ret := 0.158763
								if( Positive_Money_Flow_Sum > 1.83285e+06 )
									ret := 0.067628
							if( Money_Flow_Ratio > 175.099 )
								if( Positive_Money_Flow_Sum <= 5.36357e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 5.36357e+07 )
									ret := -0.449275
					if( Positive_Money_Flow_Sum > 1.27301e+08 )
						if( Positive_Money_Flow_Sum <= 1.68912e+08 )
							if( Money_Flow_Ratio <= 205.624 )
								if( Positive_Money_Flow <= 5.75062e+07 )
									ret := 0.611321
								if( Positive_Money_Flow > 5.75062e+07 )
									ret := 0.097561
							if( Money_Flow_Ratio > 205.624 )
								if( d_k <= 0.91806 )
									ret := -0.571429
								if( d_k > 0.91806 )
									ret := 0.555556
						if( Positive_Money_Flow_Sum > 1.68912e+08 )
							if( Raw_Money_Flow <= 9.89576e+07 )
								if( smoothD_d <= 55.2923 )
									ret := -0.584906
								if( smoothD_d > 55.2923 )
									ret := 0.079235
							if( Raw_Money_Flow > 9.89576e+07 )
								if( Typical_Price <= 813.928 )
									ret := 0.764706 // buy
								if( Typical_Price > 813.928 )
									ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 1.69068e+07 )
					if( Positive_Money_Flow_Sum <= 9.61865e+06 )
						if( Positive_Money_Flow_Sum <= 3.28583e+06 )
							if( Negative_Money_Flow_Sum <= 2.40887e+07 )
								if( Raw_Money_Flow <= 290460 )
									ret := -0.352941
								if( Raw_Money_Flow > 290460 )
									ret := 0.702128 // buy
							if( Negative_Money_Flow_Sum > 2.40887e+07 )
								if( d_k <= -2.7787 )
									ret := -0.540000
								if( d_k > -2.7787 )
									ret := 0.071429
						if( Positive_Money_Flow_Sum > 3.28583e+06 )
							if( Typical_Price <= 137.966 )
								if( Raw_Money_Flow <= 8.15932e+06 )
									ret := -0.373626
								if( Raw_Money_Flow > 8.15932e+06 )
									ret := 0.533333
							if( Typical_Price > 137.966 )
								if( d_k <= 12.2297 )
									ret := -0.863636 // sell
								if( d_k > 12.2297 )
									ret := 0.333333
					if( Positive_Money_Flow_Sum > 9.61865e+06 )
						if( Negative_Money_Flow <= 3.55401e+07 )
							if( rsi1 <= 87.293 )
								if( Money_Flow_Ratio <= 4.46008 )
									ret := 0.022064
								if( Money_Flow_Ratio > 4.46008 )
									ret := -0.096424
							if( rsi1 > 87.293 )
								if( Positive_Money_Flow_Sum <= 8.8927e+08 )
									ret := 0.269795
								if( Positive_Money_Flow_Sum > 8.8927e+08 )
									ret := -0.875000 // sell
						if( Negative_Money_Flow > 3.55401e+07 )
							if( Money_Flow_Ratio <= 10.0126 )
								if( MFI <= 37.8717 )
									ret := -0.175000
								if( MFI > 37.8717 )
									ret := 0.291566
							if( Money_Flow_Ratio > 10.0126 )
								if( d_k <= 5.25301 )
									ret := -1.000000 // sell
								if( d_k > 5.25301 )
									ret := -0.750000 // sell
			if( Money_Flow_Ratio > 322.861 )
				if( Raw_Money_Flow <= 2.79569e+07 )
					if( k <= 87.7238 )
						if( smoothD_d <= 74.2978 )
							if( Positive_Money_Flow_Sum <= 1.136e+08 )
								if( smoothD_d <= 67.1749 )
									ret := 0.000000
								if( smoothD_d > 67.1749 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 1.136e+08 )
								if( d_k <= -1.06092 )
									ret := -0.937500 // sell
								if( d_k > -1.06092 )
									ret := -0.111111
						if( smoothD_d > 74.2978 )
							if( MFI <= 99.8847 )
								ret := -1.000000 // sell
							if( MFI > 99.8847 )
								ret := -0.250000
					if( k > 87.7238 )
						if( MFI_Low <= 79.6736 )
							if( Negative_Money_Flow_Sum <= 2.32132e+06 )
								if( smoothD_d <= 86.7787 )
									ret := 0.428571
								if( smoothD_d > 86.7787 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.32132e+06 )
								ret := -0.500000
						if( MFI_Low > 79.6736 )
							if( Raw_Money_Flow <= 1.78481e+07 )
								if( Negative_Money_Flow_Sum <= 94924.8 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 94924.8 )
									ret := -0.302326
							if( Raw_Money_Flow > 1.78481e+07 )
								if( smoothD_d <= 92.7645 )
									ret := 0.875000 // buy
								if( smoothD_d > 92.7645 )
									ret := 0.111111
				if( Raw_Money_Flow > 2.79569e+07 )
					if( d_k <= 3.60765 )
						if( smoothD_d <= 96.9511 )
							if( Positive_Money_Flow <= 1.13419e+08 )
								if( Positive_Money_Flow_Sum <= 4.5765e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 4.5765e+07 )
									ret := -0.788235 // sell
							if( Positive_Money_Flow > 1.13419e+08 )
								if( Negative_Money_Flow_Sum <= 3.5834e+06 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 3.5834e+06 )
									ret := -1.000000 // sell
						if( smoothD_d > 96.9511 )
							if( rsi1 <= 82.7796 )
								ret := 0.750000 // buy
							if( rsi1 > 82.7796 )
								if( Positive_Money_Flow_Sum <= 2.76625e+08 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 2.76625e+08 )
									ret := 0.250000
					if( d_k > 3.60765 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_TTD_15Min_e6f36c0b(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


