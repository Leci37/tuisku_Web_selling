//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: BNBUSDT_30Min_2MS0_b411ddf0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2MS0_b411ddf0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_b411ddf0(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 48.1341 )
		if( d_k <= -2.47168 )
			if( rsi1 <= 37.3719 )
				if( MFI_Low <= 3.22971 )
					if( rsi1 <= 26.3326 )
						if( d_k <= -9.6553 )
							if( Raw_Money_Flow <= 1.44266e+07 )
								if( Typical_Price <= 268.173 )
									ret := 0.173913
								if( Typical_Price > 268.173 )
									ret := -0.364583
							if( Raw_Money_Flow > 1.44266e+07 )
								if( Money_Flow_Ratio <= 0.277455 )
									ret := 0.825000 // buy
								if( Money_Flow_Ratio > 0.277455 )
									ret := -1.000000 // sell
						if( d_k > -9.6553 )
							if( Typical_Price <= 137.258 )
								if( d <= 6.33275 )
									ret := -0.062500
								if( d > 6.33275 )
									ret := 0.702703 // buy
							if( Typical_Price > 137.258 )
								if( rsi1 <= 21.1421 )
									ret := -0.625468
								if( rsi1 > 21.1421 )
									ret := -0.277228
					if( rsi1 > 26.3326 )
						if( Negative_Money_Flow <= 6.02762e+06 )
							if( Raw_Money_Flow <= 2.27991e+06 )
								if( Negative_Money_Flow_Sum <= 4.23995e+07 )
									ret := 0.013699
								if( Negative_Money_Flow_Sum > 4.23995e+07 )
									ret := -0.454545
							if( Raw_Money_Flow > 2.27991e+06 )
								if( Positive_Money_Flow_Sum <= 2.02798e+08 )
									ret := 0.193878
								if( Positive_Money_Flow_Sum > 2.02798e+08 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 6.02762e+06 )
							if( Typical_Price <= 548.465 )
								if( d <= 7.67736 )
									ret := -0.181818
								if( d > 7.67736 )
									ret := 0.658716
							if( Typical_Price > 548.465 )
								if( Raw_Money_Flow <= 2.78943e+07 )
									ret := -0.107143
								if( Raw_Money_Flow > 2.78943e+07 )
									ret := 0.703704 // buy
				if( MFI_Low > 3.22971 )
					if( Negative_Money_Flow <= 5.75954e+07 )
						if( rsi1 <= 30.5553 )
							if( Typical_Price <= 73.5936 )
								if( Raw_Money_Flow <= 4.43535e+06 )
									ret := -0.064516
								if( Raw_Money_Flow > 4.43535e+06 )
									ret := 0.777778 // buy
							if( Typical_Price > 73.5936 )
								if( Typical_Price <= 330.768 )
									ret := -0.462094
								if( Typical_Price > 330.768 )
									ret := -0.674497
						if( rsi1 > 30.5553 )
							if( Money_Flow_Ratio <= 0.555058 )
								if( k <= 52.4385 )
									ret := 0.002119
								if( k > 52.4385 )
									ret := -0.261261
							if( Money_Flow_Ratio > 0.555058 )
								if( Typical_Price <= 87.8316 )
									ret := 0.198413
								if( Typical_Price > 87.8316 )
									ret := -0.401099
					if( Negative_Money_Flow > 5.75954e+07 )
						if( MFI <= 36.7953 )
							if( MFI <= 27.6846 )
								if( d <= 41.2179 )
									ret := 1.000000 // buy
								if( d > 41.2179 )
									ret := 0.833333 // buy
							if( MFI > 27.6846 )
								if( Positive_Money_Flow_Sum <= 2.674e+08 )
									ret := 0.291667
								if( Positive_Money_Flow_Sum > 2.674e+08 )
									ret := 0.950000 // buy
						if( MFI > 36.7953 )
							if( rsi1 <= 35.4959 )
								ret := -0.500000
							if( rsi1 > 35.4959 )
								ret := -1.000000 // sell
			if( rsi1 > 37.3719 )
				if( MFI_Low <= 22.4201 )
					if( Negative_Money_Flow <= 1.17178e+07 )
						if( MFI <= 32.2312 )
							if( Raw_Money_Flow <= 1.48299e+06 )
								if( Positive_Money_Flow_Sum <= 1.40654e+07 )
									ret := 0.114014
								if( Positive_Money_Flow_Sum > 1.40654e+07 )
									ret := -0.448276
							if( Raw_Money_Flow > 1.48299e+06 )
								if( rsi1 <= 39.8917 )
									ret := 0.243354
								if( rsi1 > 39.8917 )
									ret := 0.457951
						if( MFI > 32.2312 )
							if( rsi1 <= 43.3827 )
								if( Positive_Money_Flow <= 4.98644e+07 )
									ret := 0.015666
								if( Positive_Money_Flow > 4.98644e+07 )
									ret := 0.666667
							if( rsi1 > 43.3827 )
								if( Raw_Money_Flow <= 4.97031e+06 )
									ret := 0.165689
								if( Raw_Money_Flow > 4.97031e+06 )
									ret := 0.415816
					if( Negative_Money_Flow > 1.17178e+07 )
						if( d_k <= -3.62369 )
							if( d <= 8.96226 )
								if( Typical_Price <= 418.833 )
									ret := 0.470588
								if( Typical_Price > 418.833 )
									ret := -0.363636
							if( d > 8.96226 )
								if( Negative_Money_Flow <= 3.84361e+07 )
									ret := 0.686217
								if( Negative_Money_Flow > 3.84361e+07 )
									ret := 0.888412 // buy
						if( d_k > -3.62369 )
							if( rsi1 <= 41.4433 )
								if( d_k <= -2.97837 )
									ret := 0.062500
								if( d_k > -2.97837 )
									ret := -0.714286 // sell
							if( rsi1 > 41.4433 )
								if( MFI_Low <= 14.5316 )
									ret := 0.000000
								if( MFI_Low > 14.5316 )
									ret := 0.882353 // buy
				if( MFI_Low > 22.4201 )
					if( Money_Flow_Ratio <= 0.977183 )
						if( Raw_Money_Flow <= 2.63714e+07 )
							if( rsi1 <= 44.8566 )
								if( Positive_Money_Flow_Sum <= 1.09315e+08 )
									ret := -0.033546
								if( Positive_Money_Flow_Sum > 1.09315e+08 )
									ret := -0.442308
							if( rsi1 > 44.8566 )
								if( Typical_Price <= 481.4 )
									ret := 0.245179
								if( Typical_Price > 481.4 )
									ret := -0.080460
						if( Raw_Money_Flow > 2.63714e+07 )
							if( MFI_High <= -35.1689 )
								if( Typical_Price <= 341.113 )
									ret := 0.818182 // buy
								if( Typical_Price > 341.113 )
									ret := -0.260870
							if( MFI_High > -35.1689 )
								if( d_k <= -13.569 )
									ret := -1.000000 // sell
								if( d_k > -13.569 )
									ret := 0.863636 // buy
					if( Money_Flow_Ratio > 0.977183 )
						if( Negative_Money_Flow_Sum <= 2.08825e+08 )
							if( Negative_Money_Flow_Sum <= 5.78283e+07 )
								if( Typical_Price <= 39.0235 )
									ret := 0.061947
								if( Typical_Price > 39.0235 )
									ret := -0.339806
							if( Negative_Money_Flow_Sum > 5.78283e+07 )
								if( MFI_Low <= 41.6714 )
									ret := 0.025157
								if( MFI_Low > 41.6714 )
									ret := -0.733333 // sell
						if( Negative_Money_Flow_Sum > 2.08825e+08 )
							if( smoothD_d <= 40.2033 )
								if( Typical_Price <= 508.727 )
									ret := 1.000000 // buy
								if( Typical_Price > 508.727 )
									ret := 0.750000 // buy
							if( smoothD_d > 40.2033 )
								ret := -0.714286 // sell
		if( d_k > -2.47168 )
			if( Positive_Money_Flow_Sum <= 1.50485e+07 )
				if( Typical_Price <= 86.3818 )
					if( Positive_Money_Flow_Sum <= 3.98664e+06 )
						if( k <= 35.9883 )
							if( Negative_Money_Flow_Sum <= 4.23631e+07 )
								if( Raw_Money_Flow <= 1.12617e+06 )
									ret := -0.026667
								if( Raw_Money_Flow > 1.12617e+06 )
									ret := -0.517241
							if( Negative_Money_Flow_Sum > 4.23631e+07 )
								if( smoothD_d <= -1.08255 )
									ret := 1.000000 // buy
								if( smoothD_d > -1.08255 )
									ret := 0.750000 // buy
						if( k > 35.9883 )
							if( d_k <= 12.5254 )
								if( smoothD_d <= 65.7519 )
									ret := 0.647059
								if( smoothD_d > 65.7519 )
									ret := 0.142857
							if( d_k > 12.5254 )
								if( Raw_Money_Flow <= 463776 )
									ret := -0.833333 // sell
								if( Raw_Money_Flow > 463776 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 3.98664e+06 )
						if( Negative_Money_Flow <= 6.02851e+06 )
							if( d_k <= 11.4572 )
								if( Typical_Price <= 41.7453 )
									ret := 0.165109
								if( Typical_Price > 41.7453 )
									ret := 0.449367
							if( d_k > 11.4572 )
								if( Negative_Money_Flow_Sum <= 2.6279e+07 )
									ret := 0.075397
								if( Negative_Money_Flow_Sum > 2.6279e+07 )
									ret := -0.827586 // sell
						if( Negative_Money_Flow > 6.02851e+06 )
							if( rsi1 <= 37.7557 )
								if( d_k <= -0.309279 )
									ret := 0.750000 // buy
								if( d_k > -0.309279 )
									ret := 1.000000 // buy
							if( rsi1 > 37.7557 )
								ret := 0.500000
				if( Typical_Price > 86.3818 )
					if( rsi1 <= 33.9882 )
						if( rsi1 <= 23.7909 )
							if( Negative_Money_Flow_Sum <= 6.07941e+06 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 6.07941e+06 )
								if( Raw_Money_Flow <= 663084 )
									ret := 0.000000
								if( Raw_Money_Flow > 663084 )
									ret := -0.680729
						if( rsi1 > 23.7909 )
							if( Negative_Money_Flow <= 1.86827e+07 )
								if( Positive_Money_Flow_Sum <= 1.12442e+07 )
									ret := -0.332203
								if( Positive_Money_Flow_Sum > 1.12442e+07 )
									ret := -0.517857
							if( Negative_Money_Flow > 1.86827e+07 )
								if( d <= 29.001 )
									ret := 0.571429
								if( d > 29.001 )
									ret := 1.000000 // buy
					if( rsi1 > 33.9882 )
						if( MFI_Low <= 15.2039 )
							if( Typical_Price <= 165.437 )
								if( k <= 16.5367 )
									ret := -0.333333
								if( k > 16.5367 )
									ret := 0.950000 // buy
							if( Typical_Price > 165.437 )
								if( Negative_Money_Flow <= 4.20258e+06 )
									ret := 0.020649
								if( Negative_Money_Flow > 4.20258e+06 )
									ret := 0.536585
						if( MFI_Low > 15.2039 )
							if( Typical_Price <= 199.87 )
								if( Negative_Money_Flow <= 2.51392e+06 )
									ret := -0.710526 // sell
								if( Negative_Money_Flow > 2.51392e+06 )
									ret := 0.130435
							if( Typical_Price > 199.87 )
								if( Positive_Money_Flow_Sum <= 1.05573e+07 )
									ret := -0.098842
								if( Positive_Money_Flow_Sum > 1.05573e+07 )
									ret := -0.264479
			if( Positive_Money_Flow_Sum > 1.50485e+07 )
				if( rsi1 <= 35.3233 )
					if( Typical_Price <= 93.6087 )
						if( Negative_Money_Flow <= 4.88937e+06 )
							if( Negative_Money_Flow_Sum <= 3.85134e+07 )
								if( Negative_Money_Flow_Sum <= 2.63005e+07 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 2.63005e+07 )
									ret := 0.073171
							if( Negative_Money_Flow_Sum > 3.85134e+07 )
								if( Raw_Money_Flow <= 6.12512e+06 )
									ret := -0.733333 // sell
								if( Raw_Money_Flow > 6.12512e+06 )
									ret := 0.400000
						if( Negative_Money_Flow > 4.88937e+06 )
							if( d_k <= 0.762462 )
								ret := -0.250000
							if( d_k > 0.762462 )
								if( Negative_Money_Flow_Sum <= 4.31883e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.31883e+07 )
									ret := 0.818182 // buy
					if( Typical_Price > 93.6087 )
						if( d_k <= 1.61271 )
							if( rsi1 <= 25.3943 )
								if( Negative_Money_Flow <= 1.38391e+08 )
									ret := -0.749000 // sell
								if( Negative_Money_Flow > 1.38391e+08 )
									ret := 0.400000
							if( rsi1 > 25.3943 )
								if( Positive_Money_Flow_Sum <= 3.3864e+08 )
									ret := -0.511335
								if( Positive_Money_Flow_Sum > 3.3864e+08 )
									ret := -0.068966
						if( d_k > 1.61271 )
							if( Raw_Money_Flow <= 4.15932e+06 )
								if( k <= 0.002835 )
									ret := -0.408451
								if( k > 0.002835 )
									ret := -0.682184
							if( Raw_Money_Flow > 4.15932e+06 )
								if( rsi1 <= 27.4027 )
									ret := -0.869604 // sell
								if( rsi1 > 27.4027 )
									ret := -0.752796 // sell
				if( rsi1 > 35.3233 )
					if( Money_Flow_Ratio <= 1.0288 )
						if( rsi1 <= 40.5382 )
							if( MFI_Low <= 20.9346 )
								if( Positive_Money_Flow_Sum <= 2.12618e+07 )
									ret := 0.004000
								if( Positive_Money_Flow_Sum > 2.12618e+07 )
									ret := -0.320805
							if( MFI_Low > 20.9346 )
								if( Positive_Money_Flow_Sum <= 1.00318e+08 )
									ret := -0.424058
								if( Positive_Money_Flow_Sum > 1.00318e+08 )
									ret := -0.709220 // sell
						if( rsi1 > 40.5382 )
							if( Negative_Money_Flow <= 2.11812e+06 )
								if( d <= 87.6869 )
									ret := -0.335821
								if( d > 87.6869 )
									ret := 0.032710
							if( Negative_Money_Flow > 2.11812e+06 )
								if( Positive_Money_Flow_Sum <= 9.81159e+07 )
									ret := 0.074745
								if( Positive_Money_Flow_Sum > 9.81159e+07 )
									ret := -0.217228
					if( Money_Flow_Ratio > 1.0288 )
						if( Raw_Money_Flow <= 3.24302e+06 )
							if( Negative_Money_Flow_Sum <= 2.99669e+07 )
								if( rsi1 <= 38.8401 )
									ret := -0.543046
								if( rsi1 > 38.8401 )
									ret := -0.349180
							if( Negative_Money_Flow_Sum > 2.99669e+07 )
								if( MFI <= 56.7016 )
									ret := -0.270833
								if( MFI > 56.7016 )
									ret := 0.462687
						if( Raw_Money_Flow > 3.24302e+06 )
							if( d_k <= -0.117071 )
								if( MFI <= 69.705 )
									ret := -0.212698
								if( MFI > 69.705 )
									ret := -0.815789 // sell
							if( d_k > -0.117071 )
								if( Money_Flow_Ratio <= 1.52406 )
									ret := -0.554321
								if( Money_Flow_Ratio > 1.52406 )
									ret := -0.715262 // sell
	if( rsi1 > 48.1341 )
		if( rsi1 <= 63.1749 )
			if( d_k <= 0.596697 )
				if( MFI_Low <= 41.5525 )
					if( Raw_Money_Flow <= 3.89876e+06 )
						if( Raw_Money_Flow <= 1.14475e+06 )
							if( Typical_Price <= 204.761 )
								if( Money_Flow_Ratio <= 0.675469 )
									ret := 0.578125
								if( Money_Flow_Ratio > 0.675469 )
									ret := 0.192000
							if( Typical_Price > 204.761 )
								if( MFI_Low <= 9.31339 )
									ret := 0.248780
								if( MFI_Low > 9.31339 )
									ret := 0.070035
						if( Raw_Money_Flow > 1.14475e+06 )
							if( smoothD_d <= 85.4896 )
								if( d <= 29.4356 )
									ret := 0.218816
								if( d > 29.4356 )
									ret := 0.451804
							if( smoothD_d > 85.4896 )
								if( Raw_Money_Flow <= 3.69836e+06 )
									ret := 0.160360
								if( Raw_Money_Flow > 3.69836e+06 )
									ret := -0.352941
					if( Raw_Money_Flow > 3.89876e+06 )
						if( MFI_High <= -37.6856 )
							if( Typical_Price <= 575.75 )
								if( d_k <= -2.65443 )
									ret := 0.760528 // buy
								if( d_k > -2.65443 )
									ret := 0.518519
							if( Typical_Price > 575.75 )
								if( rsi1 <= 52.399 )
									ret := 0.039474
								if( rsi1 > 52.399 )
									ret := 0.508197
						if( MFI_High > -37.6856 )
							if( rsi1 <= 53.4729 )
								if( Negative_Money_Flow_Sum <= 6.08557e+07 )
									ret := 0.131915
								if( Negative_Money_Flow_Sum > 6.08557e+07 )
									ret := 0.375592
							if( rsi1 > 53.4729 )
								if( d_k <= -0.852711 )
									ret := 0.607097
								if( d_k > -0.852711 )
									ret := 0.316294
				if( MFI_Low > 41.5525 )
					if( Money_Flow_Ratio <= 2.08021 )
						if( Negative_Money_Flow <= 3.89867e+06 )
							if( d_k <= -0.086435 )
								if( Negative_Money_Flow_Sum <= 7.49091e+07 )
									ret := 0.061224
								if( Negative_Money_Flow_Sum > 7.49091e+07 )
									ret := 0.421053
							if( d_k > -0.086435 )
								if( Positive_Money_Flow_Sum <= 2.85608e+07 )
									ret := -0.108696
								if( Positive_Money_Flow_Sum > 2.85608e+07 )
									ret := -0.487805
						if( Negative_Money_Flow > 3.89867e+06 )
							if( smoothD_d <= 48.9569 )
								if( smoothD_d <= 11.3853 )
									ret := 0.272727
								if( smoothD_d > 11.3853 )
									ret := 0.774194 // buy
							if( smoothD_d > 48.9569 )
								if( rsi1 <= 56.1357 )
									ret := -0.900000 // sell
								if( rsi1 > 56.1357 )
									ret := 0.140351
					if( Money_Flow_Ratio > 2.08021 )
						if( smoothK_k <= 84.4292 )
							if( Raw_Money_Flow <= 4.39073e+06 )
								if( Positive_Money_Flow_Sum <= 4.48847e+07 )
									ret := -0.093677
								if( Positive_Money_Flow_Sum > 4.48847e+07 )
									ret := 0.348485
							if( Raw_Money_Flow > 4.39073e+06 )
								if( MFI_Low <= 50.8904 )
									ret := 0.024194
								if( MFI_Low > 50.8904 )
									ret := -0.418919
						if( smoothK_k > 84.4292 )
							if( MFI <= 75.5904 )
								if( smoothD_d <= 77.9585 )
									ret := 0.888889 // buy
								if( smoothD_d > 77.9585 )
									ret := 0.416667
							if( MFI > 75.5904 )
								ret := -0.200000
			if( d_k > 0.596697 )
				if( MFI <= 64.3257 )
					if( rsi1 <= 55.2063 )
						if( Positive_Money_Flow_Sum <= 6.14432e+07 )
							if( Money_Flow_Ratio <= 0.991344 )
								if( Typical_Price <= 22.8723 )
									ret := 1.000000 // buy
								if( Typical_Price > 22.8723 )
									ret := 0.132645
							if( Money_Flow_Ratio > 0.991344 )
								if( Positive_Money_Flow <= 8.06293e+06 )
									ret := -0.072790
								if( Positive_Money_Flow > 8.06293e+06 )
									ret := -0.600000
						if( Positive_Money_Flow_Sum > 6.14432e+07 )
							if( Money_Flow_Ratio <= 1.10707 )
								if( Negative_Money_Flow_Sum <= 6.95176e+07 )
									ret := -0.625000
								if( Negative_Money_Flow_Sum > 6.95176e+07 )
									ret := -0.036313
							if( Money_Flow_Ratio > 1.10707 )
								if( d_k <= 5.27728 )
									ret := -0.129252
								if( d_k > 5.27728 )
									ret := -0.515654
					if( rsi1 > 55.2063 )
						if( Negative_Money_Flow <= 1.83609e+06 )
							if( MFI_High <= -25.7161 )
								if( Typical_Price <= 72.7427 )
									ret := -0.135135
								if( Typical_Price > 72.7427 )
									ret := 0.221065
							if( MFI_High > -25.7161 )
								if( k <= 90.3296 )
									ret := -0.011905
								if( k > 90.3296 )
									ret := 0.323944
						if( Negative_Money_Flow > 1.83609e+06 )
							if( d_k <= 5.63751 )
								if( rsi1 <= 56.6021 )
									ret := 0.201550
								if( rsi1 > 56.6021 )
									ret := 0.454545
							if( d_k > 5.63751 )
								if( Raw_Money_Flow <= 1.75551e+07 )
									ret := 0.251572
								if( Raw_Money_Flow > 1.75551e+07 )
									ret := -0.232558
				if( MFI > 64.3257 )
					if( Positive_Money_Flow <= 3.47758e+06 )
						if( Raw_Money_Flow <= 1.7866e+07 )
							if( rsi1 <= 54.5099 )
								if( Positive_Money_Flow_Sum <= 1.96842e+07 )
									ret := -0.107246
								if( Positive_Money_Flow_Sum > 1.96842e+07 )
									ret := -0.380403
							if( rsi1 > 54.5099 )
								if( Negative_Money_Flow_Sum <= 5.51035e+07 )
									ret := -0.085546
								if( Negative_Money_Flow_Sum > 5.51035e+07 )
									ret := 0.395349
						if( Raw_Money_Flow > 1.7866e+07 )
							if( rsi1 <= 60.8413 )
								if( Typical_Price <= 369.289 )
									ret := -0.341772
								if( Typical_Price > 369.289 )
									ret := -0.731250 // sell
							if( rsi1 > 60.8413 )
								if( Money_Flow_Ratio <= 2.86879 )
									ret := 0.342105
								if( Money_Flow_Ratio > 2.86879 )
									ret := -0.888889 // sell
					if( Positive_Money_Flow > 3.47758e+06 )
						if( rsi1 <= 57.7647 )
							if( k <= 63.6639 )
								if( d_k <= 9.82737 )
									ret := -0.583106
								if( d_k > 9.82737 )
									ret := -0.780860 // sell
							if( k > 63.6639 )
								if( Positive_Money_Flow <= 2.60009e+07 )
									ret := -0.237762
								if( Positive_Money_Flow > 2.60009e+07 )
									ret := -0.920000 // sell
						if( rsi1 > 57.7647 )
							if( Money_Flow_Ratio <= 3.48353 )
								if( Raw_Money_Flow <= 3.18777e+07 )
									ret := -0.211215
								if( Raw_Money_Flow > 3.18777e+07 )
									ret := -0.648936
							if( Money_Flow_Ratio > 3.48353 )
								if( Raw_Money_Flow <= 1.38419e+07 )
									ret := -0.532468
								if( Raw_Money_Flow > 1.38419e+07 )
									ret := -0.907216 // sell
		if( rsi1 > 63.1749 )
			if( Typical_Price <= 52.9232 )
				if( Positive_Money_Flow <= 2.95094e+06 )
					if( smoothD_d <= 87.1112 )
						if( Positive_Money_Flow_Sum <= 5.5945e+07 )
							if( Positive_Money_Flow_Sum <= 4.17178e+07 )
								if( Typical_Price <= 34.8408 )
									ret := 0.129542
								if( Typical_Price > 34.8408 )
									ret := 0.395556
							if( Positive_Money_Flow_Sum > 4.17178e+07 )
								if( d_k <= -2.86215 )
									ret := -0.923077 // sell
								if( d_k > -2.86215 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 5.5945e+07 )
							if( MFI_Low <= 57.367 )
								if( Negative_Money_Flow <= 7.46601e+06 )
									ret := 0.952381 // buy
								if( Negative_Money_Flow > 7.46601e+06 )
									ret := 0.500000
							if( MFI_Low > 57.367 )
								ret := 0.333333
					if( smoothD_d > 87.1112 )
						if( Negative_Money_Flow_Sum <= 1.21087e+07 )
							if( d <= 98.9697 )
								if( Typical_Price <= 25.0214 )
									ret := 0.608696
								if( Typical_Price > 25.0214 )
									ret := 0.054608
							if( d > 98.9697 )
								if( Positive_Money_Flow_Sum <= 9.89674e+06 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 9.89674e+06 )
									ret := -0.652174
						if( Negative_Money_Flow_Sum > 1.21087e+07 )
							if( Negative_Money_Flow <= 4.21911e+06 )
								if( d_k <= -1.73547 )
									ret := 0.066667
								if( d_k > -1.73547 )
									ret := -0.578947
							if( Negative_Money_Flow > 4.21911e+06 )
								if( Positive_Money_Flow_Sum <= 4.80711e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow_Sum > 4.80711e+07 )
									ret := -0.500000
				if( Positive_Money_Flow > 2.95094e+06 )
					if( d_k <= -24.3493 )
						if( MFI <= 63.3398 )
							ret := 0.333333
						if( MFI > 63.3398 )
							ret := 1.000000 // buy
					if( d_k > -24.3493 )
						if( d_k <= 17.8275 )
							if( d <= 8.73629 )
								ret := -1.000000 // sell
							if( d > 8.73629 )
								if( Money_Flow_Ratio <= 2.90954 )
									ret := -0.103261
								if( Money_Flow_Ratio > 2.90954 )
									ret := -0.345946
						if( d_k > 17.8275 )
							if( rsi1 <= 70.1551 )
								ret := 1.000000 // buy
							if( rsi1 > 70.1551 )
								ret := 0.250000
			if( Typical_Price > 52.9232 )
				if( Money_Flow_Ratio <= 2.24328 )
					if( Negative_Money_Flow_Sum <= 5.08002e+07 )
						if( Typical_Price <= 572.3 )
							if( Raw_Money_Flow <= 1.3704e+06 )
								if( Typical_Price <= 204.89 )
									ret := 0.885246 // buy
								if( Typical_Price > 204.89 )
									ret := 0.364583
							if( Raw_Money_Flow > 1.3704e+06 )
								if( rsi1 <= 70.8438 )
									ret := 0.530388
								if( rsi1 > 70.8438 )
									ret := 0.681662
						if( Typical_Price > 572.3 )
							if( rsi1 <= 74.3541 )
								if( d_k <= 3.41839 )
									ret := 0.137124
								if( d_k > 3.41839 )
									ret := 0.309091
							if( rsi1 > 74.3541 )
								if( Negative_Money_Flow_Sum <= 1.03389e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.03389e+07 )
									ret := 0.491379
					if( Negative_Money_Flow_Sum > 5.08002e+07 )
						if( d_k <= -0.002116 )
							if( Raw_Money_Flow <= 4.14866e+06 )
								if( Negative_Money_Flow_Sum <= 5.233e+07 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 5.233e+07 )
									ret := 0.466667
							if( Raw_Money_Flow > 4.14866e+06 )
								if( Typical_Price <= 73.83 )
									ret := -0.500000
								if( Typical_Price > 73.83 )
									ret := 0.795347 // buy
						if( d_k > -0.002116 )
							if( Negative_Money_Flow <= 8.98137e+06 )
								if( MFI_High <= -12.1849 )
									ret := 0.499287
								if( MFI_High > -12.1849 )
									ret := -0.075472
							if( Negative_Money_Flow > 8.98137e+06 )
								if( Negative_Money_Flow_Sum <= 1.01478e+08 )
									ret := 0.811688 // buy
								if( Negative_Money_Flow_Sum > 1.01478e+08 )
									ret := 0.539683
				if( Money_Flow_Ratio > 2.24328 )
					if( rsi1 <= 73.3065 )
						if( d_k <= 2.99519 )
							if( Negative_Money_Flow_Sum <= 4.90329e+07 )
								if( Positive_Money_Flow <= 3.52155e+06 )
									ret := 0.374462
								if( Positive_Money_Flow > 3.52155e+06 )
									ret := 0.117647
							if( Negative_Money_Flow_Sum > 4.90329e+07 )
								if( d <= 9.34992 )
									ret := -0.294118
								if( d > 9.34992 )
									ret := 0.628571
						if( d_k > 2.99519 )
							if( Positive_Money_Flow <= 5.88627e+06 )
								if( rsi1 <= 69.0138 )
									ret := 0.057252
								if( rsi1 > 69.0138 )
									ret := 0.255411
							if( Positive_Money_Flow > 5.88627e+06 )
								if( MFI_High <= -5.09165 )
									ret := 0.003367
								if( MFI_High > -5.09165 )
									ret := -0.424342
					if( rsi1 > 73.3065 )
						if( d_k <= 3.00455 )
							if( Typical_Price <= 564.815 )
								if( Positive_Money_Flow_Sum <= 2.29656e+08 )
									ret := 0.660055
								if( Positive_Money_Flow_Sum > 2.29656e+08 )
									ret := 0.854890 // buy
							if( Typical_Price > 564.815 )
								if( Positive_Money_Flow_Sum <= 3.32584e+07 )
									ret := 0.146341
								if( Positive_Money_Flow_Sum > 3.32584e+07 )
									ret := 0.511236
						if( d_k > 3.00455 )
							if( rsi1 <= 81.2865 )
								if( MFI_Low <= 63.0126 )
									ret := 0.468635
								if( MFI_Low > 63.0126 )
									ret := 0.016706
							if( rsi1 > 81.2865 )
								if( Raw_Money_Flow <= 4.9271e+06 )
									ret := 0.338710
								if( Raw_Money_Flow > 4.9271e+06 )
									ret := 0.748000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BNBUSDT_30Min_b411ddf0(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


