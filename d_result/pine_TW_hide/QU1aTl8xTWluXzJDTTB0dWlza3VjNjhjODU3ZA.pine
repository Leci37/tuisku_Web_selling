//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AMZN_1Min_2CM0_c68c857d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Min_2CM0_c68c857d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Min_c68c857d(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -2.13443 )
		if( Positive_Money_Flow_Sum <= 8.98812e+06 )
			if( Negative_Money_Flow_Sum <= 3.76833e+06 )
				if( Positive_Money_Flow_Sum <= 2.2997e+06 )
					if( Money_Flow_Ratio <= 0.663364 )
						if( Typical_Price <= 182.372 )
							if( Positive_Money_Flow <= 455849 )
								if( Negative_Money_Flow <= 4787.38 )
									ret := -0.066390
								if( Negative_Money_Flow > 4787.38 )
									ret := 0.237103
							if( Positive_Money_Flow > 455849 )
								if( Money_Flow_Ratio <= 0.464285 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.464285 )
									ret := 0.400000
						if( Typical_Price > 182.372 )
							if( ad <= -8470.19 )
								if( mf <= -0.33897 )
									ret := 0.941176 // buy
								if( mf > -0.33897 )
									ret := 0.250000
							if( ad > -8470.19 )
								if( Positive_Money_Flow_Sum <= 210766 )
									ret := -0.523810
								if( Positive_Money_Flow_Sum > 210766 )
									ret := 0.061625
					if( Money_Flow_Ratio > 0.663364 )
						if( ad <= -1092.35 )
							if( MFI <= 42.7762 )
								if( Negative_Money_Flow_Sum <= 1.13086e+06 )
									ret := -0.133333
								if( Negative_Money_Flow_Sum > 1.13086e+06 )
									ret := 0.419580
							if( MFI > 42.7762 )
								if( Negative_Money_Flow_Sum <= 1.0111e+06 )
									ret := -0.035354
								if( Negative_Money_Flow_Sum > 1.0111e+06 )
									ret := 0.165746
						if( ad > -1092.35 )
							if( Positive_Money_Flow_Sum <= 2.12735e+06 )
								if( ad <= -217.581 )
									ret := 0.241875
								if( ad > -217.581 )
									ret := 0.436214
							if( Positive_Money_Flow_Sum > 2.12735e+06 )
								if( Negative_Money_Flow <= 6455.93 )
									ret := 0.244444
								if( Negative_Money_Flow > 6455.93 )
									ret := 0.644444
				if( Positive_Money_Flow_Sum > 2.2997e+06 )
					if( Typical_Price <= 181.27 )
						if( mf <= -0.314967 )
							if( Negative_Money_Flow_Sum <= 3.22784e+06 )
								if( Typical_Price <= 171.573 )
									ret := -0.777778 // sell
								if( Typical_Price > 171.573 )
									ret := -0.230769
							if( Negative_Money_Flow_Sum > 3.22784e+06 )
								if( Negative_Money_Flow <= 944984 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow > 944984 )
									ret := 0.000000
						if( mf > -0.314967 )
							if( Negative_Money_Flow_Sum <= 846371 )
								if( Positive_Money_Flow <= 1.998e+06 )
									ret := 0.570093
								if( Positive_Money_Flow > 1.998e+06 )
									ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 846371 )
								if( ad_mf <= -1802.76 )
									ret := 0.298795
								if( ad_mf > -1802.76 )
									ret := 0.080702
					if( Typical_Price > 181.27 )
						if( MFI_High <= -8.00852 )
							if( Raw_Money_Flow <= 452902 )
								if( mf <= 0.100898 )
									ret := 0.114094
								if( mf > 0.100898 )
									ret := -0.182927
							if( Raw_Money_Flow > 452902 )
								if( ad_mf <= -9476.49 )
									ret := 0.458333
								if( ad_mf > -9476.49 )
									ret := -0.271523
						if( MFI_High > -8.00852 )
							if( Negative_Money_Flow_Sum <= 2.33048e+06 )
								if( Money_Flow_Ratio <= 2.88743 )
									ret := -0.432432
								if( Money_Flow_Ratio > 2.88743 )
									ret := 0.086854
							if( Negative_Money_Flow_Sum > 2.33048e+06 )
								if( Money_Flow_Ratio <= 3.10739 )
									ret := 0.604167
								if( Money_Flow_Ratio > 3.10739 )
									ret := -0.214286
			if( Negative_Money_Flow_Sum > 3.76833e+06 )
				if( MFI_Low <= -13.7226 )
					if( ad_mf <= -77236.1 )
						if( Typical_Price <= 189.461 )
							if( mf <= -0.238766 )
								if( Negative_Money_Flow <= 2.28861e+07 )
									ret := -0.250000
								if( Negative_Money_Flow > 2.28861e+07 )
									ret := 0.780488 // buy
							if( mf > -0.238766 )
								if( Negative_Money_Flow_Sum <= 1.11921e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.11921e+08 )
									ret := -0.454545
						if( Typical_Price > 189.461 )
							if( MFI <= 1.85237 )
								if( Positive_Money_Flow_Sum <= 3.68454e+06 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 3.68454e+06 )
									ret := 1.000000 // buy
							if( MFI > 1.85237 )
								if( Negative_Money_Flow_Sum <= 1.81586e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.81586e+08 )
									ret := -0.750000 // sell
					if( ad_mf > -77236.1 )
						if( Positive_Money_Flow_Sum <= 4.33294e+06 )
							if( Positive_Money_Flow_Sum <= 1.06984e+06 )
								if( mf <= -0.562941 )
									ret := 0.400000
								if( mf > -0.562941 )
									ret := -0.291667
							if( Positive_Money_Flow_Sum > 1.06984e+06 )
								if( Typical_Price <= 187.3 )
									ret := 0.387097
								if( Typical_Price > 187.3 )
									ret := -0.147059
						if( Positive_Money_Flow_Sum > 4.33294e+06 )
							if( Typical_Price <= 191.711 )
								if( mf <= -0.334159 )
									ret := -0.763158 // sell
								if( mf > -0.334159 )
									ret := -0.222222
							if( Typical_Price > 191.711 )
								ret := 0.666667
				if( MFI_Low > -13.7226 )
					if( MFI <= 17.3514 )
						if( mf <= 0.229641 )
							if( Negative_Money_Flow_Sum <= 1.23054e+07 )
								if( Positive_Money_Flow_Sum <= 437084 )
									ret := 0.909091 // buy
								if( Positive_Money_Flow_Sum > 437084 )
									ret := 0.379679
							if( Negative_Money_Flow_Sum > 1.23054e+07 )
								if( mf <= -0.661037 )
									ret := 0.181818
								if( mf > -0.661037 )
									ret := 0.667925
						if( mf > 0.229641 )
							if( MFI <= 11.1122 )
								if( Negative_Money_Flow_Sum <= 3.02917e+07 )
									ret := 0.280000
								if( Negative_Money_Flow_Sum > 3.02917e+07 )
									ret := 0.923077 // buy
							if( MFI > 11.1122 )
								if( Negative_Money_Flow_Sum <= 4.97352e+07 )
									ret := -0.032787
								if( Negative_Money_Flow_Sum > 4.97352e+07 )
									ret := -1.000000 // sell
					if( MFI > 17.3514 )
						if( Negative_Money_Flow_Sum <= 2.34282e+07 )
							if( Positive_Money_Flow_Sum <= 5.0167e+06 )
								if( MFI <= 24.6425 )
									ret := 0.279230
								if( MFI > 24.6425 )
									ret := 0.119949
							if( Positive_Money_Flow_Sum > 5.0167e+06 )
								if( ad_mf <= -3434.77 )
									ret := 0.497817
								if( ad_mf > -3434.77 )
									ret := 0.242593
						if( Negative_Money_Flow_Sum > 2.34282e+07 )
							if( Negative_Money_Flow_Sum <= 2.75967e+07 )
								if( Positive_Money_Flow_Sum <= 5.77171e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 5.77171e+06 )
									ret := -0.914286 // sell
							if( Negative_Money_Flow_Sum > 2.75967e+07 )
								if( Negative_Money_Flow_Sum <= 3.00773e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 3.00773e+07 )
									ret := -0.285714
		if( Positive_Money_Flow_Sum > 8.98812e+06 )
			if( Negative_Money_Flow_Sum <= 2.24861e+08 )
				if( Typical_Price <= 186.752 )
					if( MFI_High <= -60.357 )
						if( Negative_Money_Flow_Sum <= 7.43331e+07 )
							if( Negative_Money_Flow_Sum <= 5.08422e+07 )
								if( MFI_High <= -62.2101 )
									ret := 1.000000 // buy
								if( MFI_High > -62.2101 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 5.08422e+07 )
								if( MFI_High <= -60.8207 )
									ret := -0.693333
								if( MFI_High > -60.8207 )
									ret := 0.300000
						if( Negative_Money_Flow_Sum > 7.43331e+07 )
							if( mf <= -0.126259 )
								if( Negative_Money_Flow_Sum <= 1.29127e+08 )
									ret := 0.165714
								if( Negative_Money_Flow_Sum > 1.29127e+08 )
									ret := -0.060510
							if( mf > -0.126259 )
								if( mf <= 0.098758 )
									ret := -0.238739
								if( mf > 0.098758 )
									ret := -0.885714 // sell
					if( MFI_High > -60.357 )
						if( Negative_Money_Flow <= 6.76142e+06 )
							if( MFI_Low <= 59.459 )
								if( Positive_Money_Flow <= 5.59562e+07 )
									ret := 0.009081
								if( Positive_Money_Flow > 5.59562e+07 )
									ret := 0.607143
							if( MFI_Low > 59.459 )
								if( Positive_Money_Flow_Sum <= 1.05171e+07 )
									ret := 0.690141
								if( Positive_Money_Flow_Sum > 1.05171e+07 )
									ret := 0.118384
						if( Negative_Money_Flow > 6.76142e+06 )
							if( Positive_Money_Flow_Sum <= 1.19274e+08 )
								if( Typical_Price <= 174.042 )
									ret := 0.264594
								if( Typical_Price > 174.042 )
									ret := 0.078169
							if( Positive_Money_Flow_Sum > 1.19274e+08 )
								if( ad <= -52588.2 )
									ret := 0.081081
								if( ad > -52588.2 )
									ret := -0.043319
				if( Typical_Price > 186.752 )
					if( Positive_Money_Flow <= 5.76716e+07 )
						if( Positive_Money_Flow <= 2.92563e+07 )
							if( Negative_Money_Flow <= 1.38227e+07 )
								if( Raw_Money_Flow <= 1.00923e+07 )
									ret := -0.066258
								if( Raw_Money_Flow > 1.00923e+07 )
									ret := 0.037400
							if( Negative_Money_Flow > 1.38227e+07 )
								if( Negative_Money_Flow_Sum <= 1.95289e+08 )
									ret := -0.150463
								if( Negative_Money_Flow_Sum > 1.95289e+08 )
									ret := 0.125000
						if( Positive_Money_Flow > 2.92563e+07 )
							if( Negative_Money_Flow_Sum <= 1.113e+08 )
								if( mf <= 0.01695 )
									ret := 0.200000
								if( mf > 0.01695 )
									ret := 0.640625
							if( Negative_Money_Flow_Sum > 1.113e+08 )
								if( Negative_Money_Flow_Sum <= 1.24708e+08 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow_Sum > 1.24708e+08 )
									ret := 0.230769
					if( Positive_Money_Flow > 5.76716e+07 )
						if( ad_mf <= -204965 )
							if( Positive_Money_Flow_Sum <= 5.5284e+08 )
								if( Raw_Money_Flow <= 6.99719e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 6.99719e+07 )
									ret := -0.181818
							if( Positive_Money_Flow_Sum > 5.5284e+08 )
								if( MFI <= 83.0422 )
									ret := -1.000000 // sell
								if( MFI > 83.0422 )
									ret := -0.500000
						if( ad_mf > -204965 )
							if( Positive_Money_Flow <= 9.9808e+07 )
								if( MFI_Low <= 62.8749 )
									ret := -1.000000 // sell
								if( MFI_Low > 62.8749 )
									ret := -0.428571
							if( Positive_Money_Flow > 9.9808e+07 )
								ret := 0.000000
			if( Negative_Money_Flow_Sum > 2.24861e+08 )
				if( Money_Flow_Ratio <= 1.12817 )
					if( Positive_Money_Flow_Sum <= 5.25317e+08 )
						if( Negative_Money_Flow_Sum <= 1.30008e+09 )
							if( mf <= 0.249123 )
								if( Negative_Money_Flow <= 2.40518e+06 )
									ret := -0.013235
								if( Negative_Money_Flow > 2.40518e+06 )
									ret := 0.164186
							if( mf > 0.249123 )
								if( Positive_Money_Flow_Sum <= 1.71847e+08 )
									ret := -0.504587
								if( Positive_Money_Flow_Sum > 1.71847e+08 )
									ret := 0.148148
						if( Negative_Money_Flow_Sum > 1.30008e+09 )
							if( ad_mf <= -12691.6 )
								if( Typical_Price <= 187.396 )
									ret := 0.873874 // buy
								if( Typical_Price > 187.396 )
									ret := 0.172414
							if( ad_mf > -12691.6 )
								if( MFI_Low <= -8.77986 )
									ret := -0.050000
								if( MFI_Low > -8.77986 )
									ret := 0.409091
					if( Positive_Money_Flow_Sum > 5.25317e+08 )
						if( Typical_Price <= 161.89 )
							ret := 1.000000 // buy
						if( Typical_Price > 161.89 )
							if( mf <= 0.086645 )
								if( Typical_Price <= 184.075 )
									ret := -0.942308 // sell
								if( Typical_Price > 184.075 )
									ret := -0.166667
							if( mf > 0.086645 )
								if( Positive_Money_Flow_Sum <= 8.62243e+08 )
									ret := 0.315789
								if( Positive_Money_Flow_Sum > 8.62243e+08 )
									ret := -0.857143 // sell
				if( Money_Flow_Ratio > 1.12817 )
					if( Typical_Price <= 181.997 )
						if( Negative_Money_Flow <= 2.59868e+07 )
							if( Positive_Money_Flow <= 9.63592e+07 )
								if( Negative_Money_Flow_Sum <= 4.25669e+08 )
									ret := 0.476744
								if( Negative_Money_Flow_Sum > 4.25669e+08 )
									ret := -0.266667
							if( Positive_Money_Flow > 9.63592e+07 )
								ret := -0.714286 // sell
						if( Negative_Money_Flow > 2.59868e+07 )
							if( Positive_Money_Flow_Sum <= 1.60114e+09 )
								if( ad_mf <= -84143.5 )
									ret := 0.904000 // buy
								if( ad_mf > -84143.5 )
									ret := 0.458333
							if( Positive_Money_Flow_Sum > 1.60114e+09 )
								ret := -0.333333
					if( Typical_Price > 181.997 )
						if( Negative_Money_Flow <= 7.83975e+07 )
							if( mf <= 0.206414 )
								if( Negative_Money_Flow_Sum <= 4.5421e+08 )
									ret := -0.023669
								if( Negative_Money_Flow_Sum > 4.5421e+08 )
									ret := 0.580645
							if( mf > 0.206414 )
								if( MFI_High <= -20.347 )
									ret := -0.250000
								if( MFI_High > -20.347 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow > 7.83975e+07 )
							if( Raw_Money_Flow <= 9.17299e+07 )
								if( MFI_High <= -12.658 )
									ret := -1.000000 // sell
								if( MFI_High > -12.658 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 9.17299e+07 )
								if( Negative_Money_Flow <= 1.48536e+08 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.48536e+08 )
									ret := -0.750000 // sell
	if( ad > -2.13443 )
		if( Money_Flow_Ratio <= 10.489 )
			if( Positive_Money_Flow_Sum <= 4.66984e+07 )
				if( Raw_Money_Flow <= 173137 )
					if( MFI_Low <= 10.1287 )
						if( Positive_Money_Flow_Sum <= 296887 )
							if( Money_Flow_Ratio <= 0.375738 )
								if( Positive_Money_Flow <= 1045.05 )
									ret := 0.033333
								if( Positive_Money_Flow > 1045.05 )
									ret := -0.361905
							if( Money_Flow_Ratio > 0.375738 )
								if( Negative_Money_Flow_Sum <= 678314 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 678314 )
									ret := 0.200000
						if( Positive_Money_Flow_Sum > 296887 )
							if( ad <= 425.926 )
								if( MFI_High <= -72.7768 )
									ret := -0.064677
								if( MFI_High > -72.7768 )
									ret := 0.191930
							if( ad > 425.926 )
								if( Typical_Price <= 165.754 )
									ret := -0.600000
								if( Typical_Price > 165.754 )
									ret := -0.017192
					if( MFI_Low > 10.1287 )
						if( Typical_Price <= 160.631 )
							if( Raw_Money_Flow <= 112687 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 112687 )
								if( mf <= 0.273571 )
									ret := 0.250000
								if( mf > 0.273571 )
									ret := 1.000000 // buy
						if( Typical_Price > 160.631 )
							if( Positive_Money_Flow <= 26034.2 )
								if( MFI <= 40.2313 )
									ret := -0.031746
								if( MFI > 40.2313 )
									ret := 0.084298
							if( Positive_Money_Flow > 26034.2 )
								if( Negative_Money_Flow_Sum <= 2.12195e+06 )
									ret := 0.025889
								if( Negative_Money_Flow_Sum > 2.12195e+06 )
									ret := -0.111948
				if( Raw_Money_Flow > 173137 )
					if( ad <= 352068 )
						if( Money_Flow_Ratio <= 0.263492 )
							if( mf <= -0.189742 )
								if( Negative_Money_Flow <= 2.99431e+07 )
									ret := 0.183697
								if( Negative_Money_Flow > 2.99431e+07 )
									ret := 0.777778 // buy
							if( mf > -0.189742 )
								if( MFI <= 20.4929 )
									ret := -0.050388
								if( MFI > 20.4929 )
									ret := 0.350000
						if( Money_Flow_Ratio > 0.263492 )
							if( Positive_Money_Flow_Sum <= 2.54052e+07 )
								if( Negative_Money_Flow_Sum <= 1.03941e+07 )
									ret := -0.038263
								if( Negative_Money_Flow_Sum > 1.03941e+07 )
									ret := -0.165305
							if( Positive_Money_Flow_Sum > 2.54052e+07 )
								if( mf <= 0.320564 )
									ret := 0.022126
								if( mf > 0.320564 )
									ret := -0.528302
					if( ad > 352068 )
						if( ad <= 1.60504e+06 )
							if( Typical_Price <= 184.666 )
								ret := -1.000000 // sell
							if( Typical_Price > 184.666 )
								ret := -0.750000 // sell
						if( ad > 1.60504e+06 )
							ret := -0.250000
			if( Positive_Money_Flow_Sum > 4.66984e+07 )
				if( Positive_Money_Flow_Sum <= 3.02988e+08 )
					if( MFI <= 28.5349 )
						if( mf <= -0.459521 )
							if( MFI_Low <= -10.1114 )
								if( Negative_Money_Flow <= 2.13295e+06 )
									ret := -0.050000
								if( Negative_Money_Flow > 2.13295e+06 )
									ret := 0.750000 // buy
							if( MFI_Low > -10.1114 )
								if( Typical_Price <= 184.687 )
									ret := -0.628205
								if( Typical_Price > 184.687 )
									ret := 0.000000
						if( mf > -0.459521 )
							if( Positive_Money_Flow_Sum <= 2.41838e+08 )
								if( mf <= -0.058897 )
									ret := 0.239609
								if( mf > -0.058897 )
									ret := 0.024351
							if( Positive_Money_Flow_Sum > 2.41838e+08 )
								if( Negative_Money_Flow <= 1896.47 )
									ret := 0.381818
								if( Negative_Money_Flow > 1896.47 )
									ret := 0.810345 // buy
					if( MFI > 28.5349 )
						if( Negative_Money_Flow_Sum <= 3.74249e+08 )
							if( Negative_Money_Flow <= 8.0838e+06 )
								if( MFI_Low <= 60.0765 )
									ret := 0.062008
								if( MFI_Low > 60.0765 )
									ret := 0.166235
							if( Negative_Money_Flow > 8.0838e+06 )
								if( Typical_Price <= 163.639 )
									ret := 0.415730
								if( Typical_Price > 163.639 )
									ret := -0.018470
						if( Negative_Money_Flow_Sum > 3.74249e+08 )
							if( Typical_Price <= 182.916 )
								if( MFI_High <= -44.8582 )
									ret := 0.194444
								if( MFI_High > -44.8582 )
									ret := -0.722222 // sell
							if( Typical_Price > 182.916 )
								if( Raw_Money_Flow <= 2.51975e+07 )
									ret := 0.879310 // buy
								if( Raw_Money_Flow > 2.51975e+07 )
									ret := 0.287234
				if( Positive_Money_Flow_Sum > 3.02988e+08 )
					if( Negative_Money_Flow_Sum <= 1.74574e+08 )
						if( Raw_Money_Flow <= 6.35535e+06 )
							if( Positive_Money_Flow_Sum <= 1.14869e+09 )
								if( Typical_Price <= 173.837 )
									ret := 0.461538
								if( Typical_Price > 173.837 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.14869e+09 )
								if( Typical_Price <= 175.639 )
									ret := 1.000000 // buy
								if( Typical_Price > 175.639 )
									ret := 0.235294
						if( Raw_Money_Flow > 6.35535e+06 )
							if( Positive_Money_Flow_Sum <= 3.54094e+08 )
								if( Raw_Money_Flow <= 3.18456e+07 )
									ret := -0.666667
								if( Raw_Money_Flow > 3.18456e+07 )
									ret := -0.237705
							if( Positive_Money_Flow_Sum > 3.54094e+08 )
								if( Negative_Money_Flow_Sum <= 8.77175e+07 )
									ret := -0.490385
								if( Negative_Money_Flow_Sum > 8.77175e+07 )
									ret := -0.066667
					if( Negative_Money_Flow_Sum > 1.74574e+08 )
						if( Positive_Money_Flow_Sum <= 1.56414e+09 )
							if( Positive_Money_Flow_Sum <= 3.7387e+08 )
								if( Typical_Price <= 186.095 )
									ret := 0.309322
								if( Typical_Price > 186.095 )
									ret := -0.084034
							if( Positive_Money_Flow_Sum > 3.7387e+08 )
								if( Positive_Money_Flow_Sum <= 3.95127e+08 )
									ret := -0.569444
								if( Positive_Money_Flow_Sum > 3.95127e+08 )
									ret := -0.020633
						if( Positive_Money_Flow_Sum > 1.56414e+09 )
							if( mf <= 0.251051 )
								if( Raw_Money_Flow <= 711806 )
									ret := -0.250000
								if( Raw_Money_Flow > 711806 )
									ret := 0.000000
							if( mf > 0.251051 )
								if( ad <= 71026.2 )
									ret := 1.000000 // buy
								if( ad > 71026.2 )
									ret := 0.750000 // buy
		if( Money_Flow_Ratio > 10.489 )
			if( Raw_Money_Flow <= 2.0779e+06 )
				if( Typical_Price <= 161.327 )
					if( MFI <= 95.5809 )
						ret := 0.500000
					if( MFI > 95.5809 )
						ret := 1.000000 // buy
				if( Typical_Price > 161.327 )
					if( mf <= -0.305366 )
						if( Typical_Price <= 185.407 )
							if( Negative_Money_Flow_Sum <= 3.09881e+06 )
								if( Negative_Money_Flow_Sum <= 1.86059e+06 )
									ret := 0.112903
								if( Negative_Money_Flow_Sum > 1.86059e+06 )
									ret := 0.680000
							if( Negative_Money_Flow_Sum > 3.09881e+06 )
								if( Positive_Money_Flow <= 218981 )
									ret := 0.181818
								if( Positive_Money_Flow > 218981 )
									ret := -0.411765
						if( Typical_Price > 185.407 )
							if( Positive_Money_Flow <= 362193 )
								if( ad_mf <= 0.560427 )
									ret := -0.285714
								if( ad_mf > 0.560427 )
									ret := -0.012987
							if( Positive_Money_Flow > 362193 )
								if( ad <= 2539.5 )
									ret := -0.750000 // sell
								if( ad > 2539.5 )
									ret := 0.000000
					if( mf > -0.305366 )
						if( Positive_Money_Flow_Sum <= 5.22114e+06 )
							if( ad_mf <= 1892.23 )
								if( Positive_Money_Flow_Sum <= 2.02139e+06 )
									ret := -0.107143
								if( Positive_Money_Flow_Sum > 2.02139e+06 )
									ret := -0.652632
							if( ad_mf > 1892.23 )
								if( mf <= 0.2554 )
									ret := 0.909091 // buy
								if( mf > 0.2554 )
									ret := 0.133333
						if( Positive_Money_Flow_Sum > 5.22114e+06 )
							if( Positive_Money_Flow_Sum <= 6.23691e+06 )
								if( Raw_Money_Flow <= 80535 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 80535 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 6.23691e+06 )
								if( Raw_Money_Flow <= 342027 )
									ret := 0.007075
								if( Raw_Money_Flow > 342027 )
									ret := -0.197970
			if( Raw_Money_Flow > 2.0779e+06 )
				if( Typical_Price <= 177.888 )
					if( Negative_Money_Flow_Sum <= 2.55877e+06 )
						if( Money_Flow_Ratio <= 12.8036 )
							ret := 0.250000
						if( Money_Flow_Ratio > 12.8036 )
							if( Negative_Money_Flow_Sum <= 1.11303e+06 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.11303e+06 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.55877e+06 )
						if( MFI <= 91.7078 )
							if( Typical_Price <= 169.503 )
								ret := -1.000000 // sell
							if( Typical_Price > 169.503 )
								if( MFI_Low <= 70.751 )
									ret := 0.500000
								if( MFI_Low > 70.751 )
									ret := 0.000000
						if( MFI > 91.7078 )
							if( MFI <= 96.7903 )
								if( Typical_Price <= 176.715 )
									ret := 0.333333
								if( Typical_Price > 176.715 )
									ret := 0.857143 // buy
							if( MFI > 96.7903 )
								ret := -0.333333
				if( Typical_Price > 177.888 )
					if( Positive_Money_Flow_Sum <= 2.04793e+08 )
						if( Negative_Money_Flow <= 727690 )
							if( ad_mf <= 480757 )
								if( Positive_Money_Flow <= 1.43406e+08 )
									ret := -0.522222
								if( Positive_Money_Flow > 1.43406e+08 )
									ret := 0.700000 // buy
							if( ad_mf > 480757 )
								if( Money_Flow_Ratio <= 32.8163 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 32.8163 )
									ret := -0.500000
						if( Negative_Money_Flow > 727690 )
							ret := 0.750000 // buy
					if( Positive_Money_Flow_Sum > 2.04793e+08 )
						if( Negative_Money_Flow_Sum <= 3.05015e+07 )
							if( Positive_Money_Flow <= 3.56145e+07 )
								if( mf <= 0.120192 )
									ret := -0.357143
								if( mf > 0.120192 )
									ret := 0.464789
							if( Positive_Money_Flow > 3.56145e+07 )
								if( mf <= 0.797538 )
									ret := -0.340909
								if( mf > 0.797538 )
									ret := 0.700000 // buy
						if( Negative_Money_Flow_Sum > 3.05015e+07 )
							if( Positive_Money_Flow <= 1.95729e+08 )
								if( Positive_Money_Flow <= 144724 )
									ret := 0.083333
								if( Positive_Money_Flow > 144724 )
									ret := -0.671429
							if( Positive_Money_Flow > 1.95729e+08 )
								if( Negative_Money_Flow_Sum <= 9.05048e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 9.05048e+07 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AMZN_1Min_c68c857d(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


