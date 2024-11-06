//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: TTD_15Min_2CM0_2c0ea930 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2CM0_2c0ea930", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_2c0ea930(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow <= 179.925 )
		if( Raw_Money_Flow <= 2.91315e+06 )
			if( Negative_Money_Flow_Sum <= 8.38554e+07 )
				if( ad_mf <= 53.4463 )
					if( Negative_Money_Flow_Sum <= 4.00713e+06 )
						if( mf <= 0.569237 )
							if( Negative_Money_Flow_Sum <= 3.06949e+06 )
								if( ad_mf <= -1735.84 )
									ret := 0.235762
								if( ad_mf > -1735.84 )
									ret := 0.114853
							if( Negative_Money_Flow_Sum > 3.06949e+06 )
								if( mf <= 0.059185 )
									ret := 0.672840
								if( mf > 0.059185 )
									ret := 0.254464
						if( mf > 0.569237 )
							if( MFI_Low <= 27.9944 )
								if( MFI_High <= -46.7609 )
									ret := -0.224490
								if( MFI_High > -46.7609 )
									ret := 0.657895
							if( MFI_Low > 27.9944 )
								if( Positive_Money_Flow_Sum <= 497002 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 497002 )
									ret := -0.329114
					if( Negative_Money_Flow_Sum > 4.00713e+06 )
						if( Money_Flow_Ratio <= 0.006668 )
							if( mf <= 0.063147 )
								if( ad_mf <= -0.003484 )
									ret := 0.802469 // buy
								if( ad_mf > -0.003484 )
									ret := 0.100000
							if( mf > 0.063147 )
								if( MFI <= 0.435208 )
									ret := -0.166667
								if( MFI > 0.435208 )
									ret := 0.250000
						if( Money_Flow_Ratio > 0.006668 )
							if( Typical_Price <= 67.305 )
								if( ad <= -4997.97 )
									ret := -0.017249
								if( ad > -4997.97 )
									ret := 0.085220
							if( Typical_Price > 67.305 )
								if( MFI <= 94.1891 )
									ret := 0.159578
								if( MFI > 94.1891 )
									ret := -0.431373
				if( ad_mf > 53.4463 )
					if( mf <= 0.642157 )
						if( MFI <= 22.2747 )
							if( MFI_Low <= -19.3609 )
								if( Positive_Money_Flow_Sum <= 173678 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow_Sum > 173678 )
									ret := 0.208333
							if( MFI_Low > -19.3609 )
								if( Positive_Money_Flow_Sum <= 149714 )
									ret := -0.698113
								if( Positive_Money_Flow_Sum > 149714 )
									ret := -0.153199
						if( MFI > 22.2747 )
							if( Negative_Money_Flow_Sum <= 7.16945e+07 )
								if( Negative_Money_Flow_Sum <= 4.63832e+07 )
									ret := 0.024881
								if( Negative_Money_Flow_Sum > 4.63832e+07 )
									ret := 0.241983
							if( Negative_Money_Flow_Sum > 7.16945e+07 )
								if( Negative_Money_Flow <= 433585 )
									ret := -0.396226
								if( Negative_Money_Flow > 433585 )
									ret := 0.416667
					if( mf > 0.642157 )
						if( Money_Flow_Ratio <= 0.516155 )
							if( MFI_Low <= 3.46666 )
								ret := -0.727273 // sell
							if( MFI_Low > 3.46666 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.516155 )
							if( Positive_Money_Flow_Sum <= 1.82637e+07 )
								if( ad <= 1005.5 )
									ret := -0.333333
								if( ad > 1005.5 )
									ret := 0.076923
							if( Positive_Money_Flow_Sum > 1.82637e+07 )
								ret := -0.727273 // sell
			if( Negative_Money_Flow_Sum > 8.38554e+07 )
				if( MFI <= 26.8639 )
					if( Negative_Money_Flow <= 1.21404e+06 )
						if( MFI_Low <= -19.4018 )
							if( Negative_Money_Flow <= 155463 )
								if( MFI_High <= -79.5534 )
									ret := 0.302632
								if( MFI_High > -79.5534 )
									ret := -0.636364
							if( Negative_Money_Flow > 155463 )
								if( Negative_Money_Flow <= 201216 )
									ret := -0.600000
								if( Negative_Money_Flow > 201216 )
									ret := -0.200000
						if( MFI_Low > -19.4018 )
							if( MFI <= 22.8354 )
								if( Typical_Price <= 765.833 )
									ret := 0.306431
								if( Typical_Price > 765.833 )
									ret := -0.714286 // sell
							if( MFI > 22.8354 )
								if( Negative_Money_Flow_Sum <= 1.29963e+08 )
									ret := 0.593548
								if( Negative_Money_Flow_Sum > 1.29963e+08 )
									ret := 0.111111
					if( Negative_Money_Flow > 1.21404e+06 )
						if( Typical_Price <= 588.564 )
							if( MFI_Low <= -3.97765 )
								ret := -0.133333
							if( MFI_Low > -3.97765 )
								if( ad_mf <= -464.002 )
									ret := 0.500000
								if( ad_mf > -464.002 )
									ret := 0.200000
						if( Typical_Price > 588.564 )
							ret := -0.850000 // sell
				if( MFI > 26.8639 )
					if( Money_Flow_Ratio <= 2.10898 )
						if( Typical_Price <= 398.48 )
							if( ad <= 146.795 )
								if( Raw_Money_Flow <= 103366 )
									ret := 0.027356
								if( Raw_Money_Flow > 103366 )
									ret := 0.145594
							if( ad > 146.795 )
								if( Typical_Price <= 106.42 )
									ret := -0.056000
								if( Typical_Price > 106.42 )
									ret := -0.557692
						if( Typical_Price > 398.48 )
							if( MFI_High <= -25.8984 )
								if( MFI_Low <= 8.14595 )
									ret := -0.173913
								if( MFI_Low > 8.14595 )
									ret := 0.338182
							if( MFI_High > -25.8984 )
								if( MFI_High <= -16.9209 )
									ret := -0.034483
								if( MFI_High > -16.9209 )
									ret := -0.379310
					if( Money_Flow_Ratio > 2.10898 )
						if( ad_mf <= -18.8359 )
							if( ad <= -3627.32 )
								ret := 0.692308
							if( ad > -3627.32 )
								ret := 1.000000 // buy
						if( ad_mf > -18.8359 )
							ret := 0.187500
		if( Raw_Money_Flow > 2.91315e+06 )
			if( Money_Flow_Ratio <= 1.30289 )
				if( Negative_Money_Flow_Sum <= 6.69877e+08 )
					if( ad_mf <= -189050 )
						if( MFI_Low <= 8.7993 )
							if( Raw_Money_Flow <= 1.28718e+07 )
								if( Typical_Price <= 51.6283 )
									ret := 0.727273 // buy
								if( Typical_Price > 51.6283 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.28718e+07 )
								if( ad_mf <= -192970 )
									ret := -0.114213
								if( ad_mf > -192970 )
									ret := 0.461538
						if( MFI_Low > 8.7993 )
							if( MFI_Low <= 24.5512 )
								if( mf <= 0.006613 )
									ret := 0.574830
								if( mf > 0.006613 )
									ret := 0.086957
							if( MFI_Low > 24.5512 )
								if( Raw_Money_Flow <= 3.65117e+07 )
									ret := -0.132867
								if( Raw_Money_Flow > 3.65117e+07 )
									ret := 0.647059
					if( ad_mf > -189050 )
						if( Typical_Price <= 350.142 )
							if( Typical_Price <= 44.6326 )
								if( Raw_Money_Flow <= 4.01663e+06 )
									ret := -0.317460
								if( Raw_Money_Flow > 4.01663e+06 )
									ret := 0.375566
							if( Typical_Price > 44.6326 )
								if( MFI <= 51.9365 )
									ret := -0.067710
								if( MFI > 51.9365 )
									ret := -0.187461
						if( Typical_Price > 350.142 )
							if( Positive_Money_Flow_Sum <= 7.77711e+07 )
								if( Negative_Money_Flow <= 2.09662e+07 )
									ret := 0.173023
								if( Negative_Money_Flow > 2.09662e+07 )
									ret := 0.017931
							if( Positive_Money_Flow_Sum > 7.77711e+07 )
								if( ad_mf <= -26192.9 )
									ret := 0.195604
								if( ad_mf > -26192.9 )
									ret := -0.160267
				if( Negative_Money_Flow_Sum > 6.69877e+08 )
					if( Negative_Money_Flow <= 7.67556e+07 )
						ret := -0.357143
					if( Negative_Money_Flow > 7.67556e+07 )
						if( ad_mf <= -207060 )
							ret := -0.500000
						if( ad_mf > -207060 )
							if( Money_Flow_Ratio <= 0.073317 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.073317 )
								ret := -0.769231 // sell
			if( Money_Flow_Ratio > 1.30289 )
				if( Typical_Price <= 232.825 )
					if( Negative_Money_Flow <= 7.80049e+07 )
						if( Typical_Price <= 42.5181 )
							ret := 0.791667 // buy
						if( Typical_Price > 42.5181 )
							if( Typical_Price <= 43.9174 )
								if( MFI <= 82.8128 )
									ret := 0.153846
								if( MFI > 82.8128 )
									ret := -1.000000 // sell
							if( Typical_Price > 43.9174 )
								if( mf <= 0.192453 )
									ret := 0.026093
								if( mf > 0.192453 )
									ret := -0.058185
					if( Negative_Money_Flow > 7.80049e+07 )
						if( Typical_Price <= 75.0807 )
							ret := 0.764706 // buy
						if( Typical_Price > 75.0807 )
							ret := 1.000000 // buy
				if( Typical_Price > 232.825 )
					if( Positive_Money_Flow_Sum <= 4.09231e+08 )
						if( ad_mf <= -15602.2 )
							if( Raw_Money_Flow <= 6.31817e+07 )
								if( Positive_Money_Flow_Sum <= 2.48024e+08 )
									ret := 0.199461
								if( Positive_Money_Flow_Sum > 2.48024e+08 )
									ret := 0.453488
							if( Raw_Money_Flow > 6.31817e+07 )
								if( Raw_Money_Flow <= 7.15528e+07 )
									ret := -0.833333 // sell
								if( Raw_Money_Flow > 7.15528e+07 )
									ret := 0.100000
						if( ad_mf > -15602.2 )
							if( ad <= 76850.5 )
								if( Positive_Money_Flow_Sum <= 2.91979e+08 )
									ret := 0.064599
								if( Positive_Money_Flow_Sum > 2.91979e+08 )
									ret := -0.379032
							if( ad > 76850.5 )
								if( MFI <= 67.6647 )
									ret := -0.133333
								if( MFI > 67.6647 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 4.09231e+08 )
						if( mf <= 0.121039 )
							if( MFI <= 63.9694 )
								ret := -0.600000
							if( MFI > 63.9694 )
								if( mf <= -0.023906 )
									ret := 0.357143
								if( mf > -0.023906 )
									ret := 0.789474 // buy
						if( mf > 0.121039 )
							if( Typical_Price <= 331.767 )
								ret := 1.000000 // buy
							if( Typical_Price > 331.767 )
								if( ad <= 1346.3 )
									ret := 0.837838 // buy
								if( ad > 1346.3 )
									ret := -0.062500
	if( Positive_Money_Flow > 179.925 )
		if( ad <= -17.513 )
			if( MFI <= 53.6722 )
				if( MFI_Low <= 16.7295 )
					if( Negative_Money_Flow_Sum <= 5.2802e+08 )
						if( Negative_Money_Flow_Sum <= 4.31854e+08 )
							if( Negative_Money_Flow <= 121.377 )
								if( ad <= -3123.67 )
									ret := 0.068501
								if( ad > -3123.67 )
									ret := -0.114058
							if( Negative_Money_Flow > 121.377 )
								if( MFI_Low <= -3.98952 )
									ret := 0.358779
								if( MFI_Low > -3.98952 )
									ret := 0.018617
						if( Negative_Money_Flow_Sum > 4.31854e+08 )
							if( Negative_Money_Flow_Sum <= 4.78999e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.78999e+08 )
								ret := 0.500000
					if( Negative_Money_Flow_Sum > 5.2802e+08 )
						if( Raw_Money_Flow <= 2.08953e+07 )
							ret := -0.714286 // sell
						if( Raw_Money_Flow > 2.08953e+07 )
							if( Positive_Money_Flow_Sum <= 1.1855e+08 )
								ret := -0.923077 // sell
							if( Positive_Money_Flow_Sum > 1.1855e+08 )
								ret := -1.000000 // sell
				if( MFI_Low > 16.7295 )
					if( MFI_High <= -39.8293 )
						if( Positive_Money_Flow <= 6530.24 )
							if( Negative_Money_Flow_Sum <= 4.56759e+07 )
								if( ad_mf <= -1460.4 )
									ret := -0.250000
								if( ad_mf > -1460.4 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.56759e+07 )
								ret := 0.818182 // buy
						if( Positive_Money_Flow > 6530.24 )
							if( Raw_Money_Flow <= 4.15774e+06 )
								if( mf <= -0.208208 )
									ret := 0.774648 // buy
								if( mf > -0.208208 )
									ret := 0.346705
							if( Raw_Money_Flow > 4.15774e+06 )
								if( Typical_Price <= 64.9039 )
									ret := 0.782609 // buy
								if( Typical_Price > 64.9039 )
									ret := 0.076596
					if( MFI_High > -39.8293 )
						if( Raw_Money_Flow <= 109275 )
							if( Money_Flow_Ratio <= 0.683661 )
								ret := -0.312500
							if( Money_Flow_Ratio > 0.683661 )
								if( Negative_Money_Flow <= 35934.5 )
									ret := 0.389972
								if( Negative_Money_Flow > 35934.5 )
									ret := 0.868852 // buy
						if( Raw_Money_Flow > 109275 )
							if( Typical_Price <= 57.577 )
								if( Positive_Money_Flow_Sum <= 2.15926e+07 )
									ret := -0.185268
								if( Positive_Money_Flow_Sum > 2.15926e+07 )
									ret := 0.134078
							if( Typical_Price > 57.577 )
								if( Positive_Money_Flow_Sum <= 7.44023e+06 )
									ret := 0.487013
								if( Positive_Money_Flow_Sum > 7.44023e+06 )
									ret := 0.048106
			if( MFI > 53.6722 )
				if( MFI <= 60.8286 )
					if( mf <= 0.493181 )
						if( Positive_Money_Flow_Sum <= 3.09503e+08 )
							if( Negative_Money_Flow <= 98364.1 )
								if( ad_mf <= -25323 )
									ret := -0.201905
								if( ad_mf > -25323 )
									ret := -0.011067
							if( Negative_Money_Flow > 98364.1 )
								if( MFI <= 59.7179 )
									ret := -0.317073
								if( MFI > 59.7179 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.09503e+08 )
							ret := 0.875000 // buy
					if( mf > 0.493181 )
						if( MFI <= 57.6672 )
							ret := -0.800000 // sell
						if( MFI > 57.6672 )
							ret := -1.000000 // sell
				if( MFI > 60.8286 )
					if( Money_Flow_Ratio <= 1.57477 )
						if( Typical_Price <= 185.338 )
							if( Money_Flow_Ratio <= 1.56688 )
								if( mf <= 0.088603 )
									ret := -0.285714
								if( mf > 0.088603 )
									ret := 0.000000
							if( Money_Flow_Ratio > 1.56688 )
								if( ad_mf <= -6232.38 )
									ret := 0.428571
								if( ad_mf > -6232.38 )
									ret := 0.923077 // buy
						if( Typical_Price > 185.338 )
							ret := 0.800000 // buy
					if( Money_Flow_Ratio > 1.57477 )
						if( Negative_Money_Flow_Sum <= 499574 )
							if( Money_Flow_Ratio <= 2.43474 )
								if( MFI <= 62.0602 )
									ret := -1.000000 // sell
								if( MFI > 62.0602 )
									ret := -0.523810
							if( Money_Flow_Ratio > 2.43474 )
								if( Positive_Money_Flow_Sum <= 486545 )
									ret := 0.851852 // buy
								if( Positive_Money_Flow_Sum > 486545 )
									ret := -0.101266
						if( Negative_Money_Flow_Sum > 499574 )
							if( Negative_Money_Flow_Sum <= 3.21708e+08 )
								if( Typical_Price <= 48.5814 )
									ret := 0.221805
								if( Typical_Price > 48.5814 )
									ret := 0.005896
							if( Negative_Money_Flow_Sum > 3.21708e+08 )
								if( Raw_Money_Flow <= 5.5864e+07 )
									ret := 0.285714
								if( Raw_Money_Flow > 5.5864e+07 )
									ret := 0.947368 // buy
		if( ad > -17.513 )
			if( Positive_Money_Flow <= 247889 )
				if( MFI_Low <= -19.4899 )
					if( MFI_High <= -79.5581 )
						if( Money_Flow_Ratio <= 0.003344 )
							if( Raw_Money_Flow <= 28769 )
								if( Negative_Money_Flow_Sum <= 1.04508e+08 )
									ret := -0.071429
								if( Negative_Money_Flow_Sum > 1.04508e+08 )
									ret := 0.354839
							if( Raw_Money_Flow > 28769 )
								if( MFI_Low <= -19.7793 )
									ret := 0.863636 // buy
								if( MFI_Low > -19.7793 )
									ret := 0.440000
						if( Money_Flow_Ratio > 0.003344 )
							if( Negative_Money_Flow <= 4819.74 )
								if( MFI_Low <= -19.6462 )
									ret := -0.600000
								if( MFI_Low > -19.6462 )
									ret := 0.315789
							if( Negative_Money_Flow > 4819.74 )
								ret := -0.500000
					if( MFI_High > -79.5581 )
						if( Negative_Money_Flow_Sum <= 7.91673e+07 )
							if( Raw_Money_Flow <= 63825.1 )
								ret := 0.909091 // buy
							if( Raw_Money_Flow > 63825.1 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 7.91673e+07 )
							ret := 0.666667
				if( MFI_Low > -19.4899 )
					if( Typical_Price <= 235.475 )
						if( MFI_Low <= -17.7906 )
							if( MFI <= 1.46486 )
								if( Positive_Money_Flow <= 105256 )
									ret := -0.267123
								if( Positive_Money_Flow > 105256 )
									ret := -0.711111 // sell
							if( MFI > 1.46486 )
								if( MFI_High <= -77.9188 )
									ret := -0.802632 // sell
								if( MFI_High > -77.9188 )
									ret := -0.454545
						if( MFI_Low > -17.7906 )
							if( Positive_Money_Flow_Sum <= 511998 )
								if( Money_Flow_Ratio <= 2.22291 )
									ret := -0.396270
								if( Money_Flow_Ratio > 2.22291 )
									ret := 0.224490
							if( Positive_Money_Flow_Sum > 511998 )
								if( MFI_High <= -26.553 )
									ret := -0.083733
								if( MFI_High > -26.553 )
									ret := -0.185854
					if( Typical_Price > 235.475 )
						if( Positive_Money_Flow <= 59558.4 )
							if( Raw_Money_Flow <= 250039 )
								if( Typical_Price <= 413.64 )
									ret := 0.115942
								if( Typical_Price > 413.64 )
									ret := 0.413127
							if( Raw_Money_Flow > 250039 )
								if( mf <= 0.019152 )
									ret := -0.800000 // sell
								if( mf > 0.019152 )
									ret := 0.400000
						if( Positive_Money_Flow > 59558.4 )
							if( Raw_Money_Flow <= 407237 )
								if( Money_Flow_Ratio <= 17.7421 )
									ret := -0.047909
								if( Money_Flow_Ratio > 17.7421 )
									ret := 0.641026
							if( Raw_Money_Flow > 407237 )
								if( mf <= 0.017482 )
									ret := -0.904762 // sell
								if( mf > 0.017482 )
									ret := -0.166667
			if( Positive_Money_Flow > 247889 )
				if( Money_Flow_Ratio <= 49.1054 )
					if( ad_mf <= 9960.98 )
						if( MFI_Low <= -7.16539 )
							if( Positive_Money_Flow_Sum <= 1.953e+06 )
								if( mf <= -0.152326 )
									ret := -0.409091
								if( mf > -0.152326 )
									ret := 0.583333
							if( Positive_Money_Flow_Sum > 1.953e+06 )
								if( Raw_Money_Flow <= 299499 )
									ret := 0.083333
								if( Raw_Money_Flow > 299499 )
									ret := -0.577236
						if( MFI_Low > -7.16539 )
							if( MFI_Low <= -5.65972 )
								if( ad_mf <= 1775.71 )
									ret := 0.909091 // buy
								if( ad_mf > 1775.71 )
									ret := 0.615385
							if( MFI_Low > -5.65972 )
								if( Positive_Money_Flow <= 6.21157e+06 )
									ret := 0.037223
								if( Positive_Money_Flow > 6.21157e+06 )
									ret := -0.066704
					if( ad_mf > 9960.98 )
						if( Raw_Money_Flow <= 8.88783e+07 )
							if( Positive_Money_Flow_Sum <= 1.39787e+08 )
								if( MFI_High <= -63.465 )
									ret := 0.194070
								if( MFI_High > -63.465 )
									ret := -0.042177
							if( Positive_Money_Flow_Sum > 1.39787e+08 )
								if( Negative_Money_Flow_Sum <= 4.6097e+08 )
									ret := -0.152890
								if( Negative_Money_Flow_Sum > 4.6097e+08 )
									ret := 0.647059
						if( Raw_Money_Flow > 8.88783e+07 )
							if( ad_mf <= 177206 )
								if( Typical_Price <= 637.862 )
									ret := 0.794872 // buy
								if( Typical_Price > 637.862 )
									ret := -0.529412
							if( ad_mf > 177206 )
								if( Typical_Price <= 193.737 )
									ret := 0.351064
								if( Typical_Price > 193.737 )
									ret := -0.384615
				if( Money_Flow_Ratio > 49.1054 )
					if( Money_Flow_Ratio <= 236.866 )
						if( ad_mf <= 978741 )
							if( Positive_Money_Flow <= 6.83371e+07 )
								if( Typical_Price <= 343.778 )
									ret := 0.106681
								if( Typical_Price > 343.778 )
									ret := 0.698276
							if( Positive_Money_Flow > 6.83371e+07 )
								if( mf <= 0.486493 )
									ret := -0.602564
								if( mf > 0.486493 )
									ret := 0.200000
						if( ad_mf > 978741 )
							if( Raw_Money_Flow <= 1.88416e+08 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.88416e+08 )
								ret := 0.777778 // buy
					if( Money_Flow_Ratio > 236.866 )
						if( Positive_Money_Flow_Sum <= 4.26007e+07 )
							ret := 0.700000 // buy
						if( Positive_Money_Flow_Sum > 4.26007e+07 )
							if( ad <= 487436 )
								if( Money_Flow_Ratio <= 311.876 )
									ret := -0.086420
								if( Money_Flow_Ratio > 311.876 )
									ret := -0.330935
							if( ad > 487436 )
								ret := -0.782609 // sell
	
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
float op_operation = decision_tree_0_TTD_15Min_2c0ea930(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


