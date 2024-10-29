//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MSFT_30Min_2MS0_0712e3b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2MS0_0712e3b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_0712e3b7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 3.52037e+08 )
		if( Negative_Money_Flow <= 9.22959e+06 )
			if( Negative_Money_Flow <= 7.07879e+06 )
				if( d <= 94.9192 )
					if( Typical_Price <= 259.437 )
						if( Positive_Money_Flow_Sum <= 1.30735e+06 )
							if( d_k <= 17.0896 )
								if( Raw_Money_Flow <= 1.02176e+06 )
									ret := 0.217391
								if( Raw_Money_Flow > 1.02176e+06 )
									ret := 0.694915
							if( d_k > 17.0896 )
								if( Positive_Money_Flow_Sum <= 857709 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 857709 )
									ret := -0.250000
						if( Positive_Money_Flow_Sum > 1.30735e+06 )
							if( k <= 18.67 )
								if( Positive_Money_Flow <= 3.39145e+06 )
									ret := -0.145545
								if( Positive_Money_Flow > 3.39145e+06 )
									ret := 0.022876
							if( k > 18.67 )
								if( rsi1 <= 51.8797 )
									ret := 0.120500
								if( rsi1 > 51.8797 )
									ret := -0.005529
					if( Typical_Price > 259.437 )
						if( Positive_Money_Flow <= 79325.2 )
							if( d_k <= 16.6013 )
								if( Positive_Money_Flow_Sum <= 4.42779e+09 )
									ret := 0.141498
								if( Positive_Money_Flow_Sum > 4.42779e+09 )
									ret := -0.203390
							if( d_k > 16.6013 )
								if( Negative_Money_Flow_Sum <= 2.47966e+07 )
									ret := 0.046154
								if( Negative_Money_Flow_Sum > 2.47966e+07 )
									ret := -0.418182
						if( Positive_Money_Flow > 79325.2 )
							if( Positive_Money_Flow <= 6.92009e+08 )
								if( Positive_Money_Flow_Sum <= 8.12717e+06 )
									ret := 0.416667
								if( Positive_Money_Flow_Sum > 8.12717e+06 )
									ret := -0.131839
							if( Positive_Money_Flow > 6.92009e+08 )
								if( rsi1 <= 41.8291 )
									ret := -0.338983
								if( rsi1 > 41.8291 )
									ret := 0.141136
				if( d > 94.9192 )
					if( Positive_Money_Flow_Sum <= 6.7901e+07 )
						if( Typical_Price <= 127.625 )
							if( Negative_Money_Flow_Sum <= 8.35254e+06 )
								if( Money_Flow_Ratio <= 6.0686 )
									ret := 0.617647
								if( Money_Flow_Ratio > 6.0686 )
									ret := 0.962963 // buy
							if( Negative_Money_Flow_Sum > 8.35254e+06 )
								if( smoothK_k <= 94.5156 )
									ret := -0.200000
								if( smoothK_k > 94.5156 )
									ret := 0.333333
						if( Typical_Price > 127.625 )
							if( Negative_Money_Flow_Sum <= 1.86383e+07 )
								if( rsi1 <= 85.9236 )
									ret := -0.200000
								if( rsi1 > 85.9236 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.86383e+07 )
								if( MFI <= 69.0677 )
									ret := 0.236842
								if( MFI > 69.0677 )
									ret := 0.937500 // buy
					if( Positive_Money_Flow_Sum > 6.7901e+07 )
						if( Positive_Money_Flow_Sum <= 8.93866e+07 )
							if( rsi1 <= 70.0485 )
								ret := 0.428571
							if( rsi1 > 70.0485 )
								if( Typical_Price <= 321.428 )
									ret := -1.000000 // sell
								if( Typical_Price > 321.428 )
									ret := -0.714286 // sell
						if( Positive_Money_Flow_Sum > 8.93866e+07 )
							if( rsi1 <= 94.5545 )
								if( d_k <= 0.302658 )
									ret := 0.164847
								if( d_k > 0.302658 )
									ret := 0.019120
							if( rsi1 > 94.5545 )
								if( Negative_Money_Flow_Sum <= 4.63501e+06 )
									ret := -0.684211
								if( Negative_Money_Flow_Sum > 4.63501e+06 )
									ret := -0.315789
			if( Negative_Money_Flow > 7.07879e+06 )
				if( Positive_Money_Flow_Sum <= 4.39518e+07 )
					if( rsi1 <= 66.1747 )
						if( MFI <= 45.0288 )
							if( d <= 71.3163 )
								if( Positive_Money_Flow_Sum <= 9.03111e+06 )
									ret := -0.651685
								if( Positive_Money_Flow_Sum > 9.03111e+06 )
									ret := -0.105263
							if( d > 71.3163 )
								if( Positive_Money_Flow_Sum <= 7.26981e+06 )
									ret := 0.933333 // buy
								if( Positive_Money_Flow_Sum > 7.26981e+06 )
									ret := -0.156250
						if( MFI > 45.0288 )
							if( smoothD_d <= 76.4989 )
								if( Raw_Money_Flow <= 8.86743e+06 )
									ret := -0.658228
								if( Raw_Money_Flow > 8.86743e+06 )
									ret := -0.157895
							if( smoothD_d > 76.4989 )
								if( k <= 92.1019 )
									ret := -1.000000 // sell
								if( k > 92.1019 )
									ret := -0.750000 // sell
					if( rsi1 > 66.1747 )
						if( Positive_Money_Flow_Sum <= 1.23463e+07 )
							if( Negative_Money_Flow_Sum <= 2.20526e+07 )
								if( d_k <= 1.62815 )
									ret := 0.250000
								if( d_k > 1.62815 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 2.20526e+07 )
								if( rsi1 <= 72.3745 )
									ret := 1.000000 // buy
								if( rsi1 > 72.3745 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.23463e+07 )
							if( MFI_Low <= 10.434 )
								ret := -1.000000 // sell
							if( MFI_Low > 10.434 )
								if( MFI_High <= -22.9448 )
									ret := 0.400000
								if( MFI_High > -22.9448 )
									ret := -0.500000
				if( Positive_Money_Flow_Sum > 4.39518e+07 )
					if( Money_Flow_Ratio <= 6.17214 )
						if( k <= 20.726 )
							if( Negative_Money_Flow_Sum <= 4.96823e+07 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 4.96823e+07 )
								ret := -1.000000 // sell
						if( k > 20.726 )
							if( Negative_Money_Flow <= 7.21118e+06 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow > 7.21118e+06 )
								if( rsi1 <= 64.6954 )
									ret := 0.771429 // buy
								if( rsi1 > 64.6954 )
									ret := 0.000000
					if( Money_Flow_Ratio > 6.17214 )
						if( Raw_Money_Flow <= 8.10344e+06 )
							if( Positive_Money_Flow_Sum <= 1.53738e+09 )
								if( MFI <= 97.7327 )
									ret := -0.875000 // sell
								if( MFI > 97.7327 )
									ret := -0.142857
							if( Positive_Money_Flow_Sum > 1.53738e+09 )
								if( Raw_Money_Flow <= 7.70353e+06 )
									ret := 0.615385
								if( Raw_Money_Flow > 7.70353e+06 )
									ret := 0.181818
						if( Raw_Money_Flow > 8.10344e+06 )
							if( Negative_Money_Flow_Sum <= 4.90581e+07 )
								if( Positive_Money_Flow <= 1.0463e+06 )
									ret := -0.840000 // sell
								if( Positive_Money_Flow > 1.0463e+06 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 4.90581e+07 )
								if( rsi1 <= 43.5904 )
									ret := 0.833333 // buy
								if( rsi1 > 43.5904 )
									ret := -0.333333
		if( Negative_Money_Flow > 9.22959e+06 )
			if( Negative_Money_Flow_Sum <= 2.04988e+07 )
				if( smoothK_k <= 60.3479 )
					if( Positive_Money_Flow_Sum <= 1.74778e+07 )
						if( rsi1 <= 57.7792 )
							if( smoothD_d <= 27.1863 )
								if( Typical_Price <= 98.6133 )
									ret := 1.000000 // buy
								if( Typical_Price > 98.6133 )
									ret := -0.625000
							if( smoothD_d > 27.1863 )
								if( d <= 54.3129 )
									ret := 0.909091 // buy
								if( d > 54.3129 )
									ret := 0.000000
						if( rsi1 > 57.7792 )
							if( Money_Flow_Ratio <= 0.792644 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.792644 )
								ret := -0.500000
					if( Positive_Money_Flow_Sum > 1.74778e+07 )
						if( Negative_Money_Flow_Sum <= 1.64769e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.64769e+07 )
							if( k <= 42.3304 )
								if( Negative_Money_Flow <= 1.0339e+07 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow > 1.0339e+07 )
									ret := 0.000000
							if( k > 42.3304 )
								ret := 1.000000 // buy
				if( smoothK_k > 60.3479 )
					if( MFI_High <= -0.494594 )
						if( rsi1 <= 79.2309 )
							if( Typical_Price <= 417.976 )
								if( Positive_Money_Flow_Sum <= 7.92036e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 7.92036e+06 )
									ret := 1.000000 // buy
							if( Typical_Price > 417.976 )
								ret := 0.250000
						if( rsi1 > 79.2309 )
							if( MFI <= 62.693 )
								ret := 0.000000
							if( MFI > 62.693 )
								ret := 1.000000 // buy
					if( MFI_High > -0.494594 )
						if( k <= 90.8648 )
							ret := -0.600000
						if( k > 90.8648 )
							ret := 0.200000
			if( Negative_Money_Flow_Sum > 2.04988e+07 )
				if( Negative_Money_Flow_Sum <= 2.67429e+07 )
					if( k <= 73.8005 )
						if( Typical_Price <= 218.953 )
							if( Typical_Price <= 197.544 )
								ret := -1.000000 // sell
							if( Typical_Price > 197.544 )
								if( Negative_Money_Flow_Sum <= 2.42946e+07 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 2.42946e+07 )
									ret := -1.000000 // sell
						if( Typical_Price > 218.953 )
							if( d_k <= 2.95691 )
								if( k <= 47.1233 )
									ret := -0.750000 // sell
								if( k > 47.1233 )
									ret := -0.200000
							if( d_k > 2.95691 )
								if( MFI <= 26.7136 )
									ret := -0.600000
								if( MFI > 26.7136 )
									ret := 0.205128
					if( k > 73.8005 )
						if( d_k <= 0.354514 )
							if( Negative_Money_Flow_Sum <= 2.5283e+07 )
								if( Typical_Price <= 279.837 )
									ret := 0.941176 // buy
								if( Typical_Price > 279.837 )
									ret := 0.363636
							if( Negative_Money_Flow_Sum > 2.5283e+07 )
								if( d_k <= -8.98214 )
									ret := -1.000000 // sell
								if( d_k > -8.98214 )
									ret := 0.400000
						if( d_k > 0.354514 )
							if( Raw_Money_Flow <= 1.23381e+07 )
								if( Positive_Money_Flow_Sum <= 9.30626e+06 )
									ret := 0.833333 // buy
								if( Positive_Money_Flow_Sum > 9.30626e+06 )
									ret := -0.111111
							if( Raw_Money_Flow > 1.23381e+07 )
								if( MFI_Low <= 49.6526 )
									ret := -0.782609 // sell
								if( MFI_Low > 49.6526 )
									ret := 0.250000
				if( Negative_Money_Flow_Sum > 2.67429e+07 )
					if( Negative_Money_Flow_Sum <= 3.98455e+07 )
						if( Positive_Money_Flow_Sum <= 6.9119e+06 )
							if( d <= 7.60812 )
								if( Negative_Money_Flow_Sum <= 3.59106e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.59106e+07 )
									ret := 1.000000 // buy
							if( d > 7.60812 )
								if( Typical_Price <= 165.642 )
									ret := 0.571429
								if( Typical_Price > 165.642 )
									ret := 0.942857 // buy
						if( Positive_Money_Flow_Sum > 6.9119e+06 )
							if( smoothK_k <= 25.681 )
								if( Negative_Money_Flow <= 1.31749e+07 )
									ret := -0.333333
								if( Negative_Money_Flow > 1.31749e+07 )
									ret := 0.176471
							if( smoothK_k > 25.681 )
								if( Negative_Money_Flow <= 2.10251e+07 )
									ret := 0.442907
								if( Negative_Money_Flow > 2.10251e+07 )
									ret := 0.038961
					if( Negative_Money_Flow_Sum > 3.98455e+07 )
						if( Positive_Money_Flow_Sum <= 6.67387e+08 )
							if( Money_Flow_Ratio <= 0.898401 )
								if( d <= 91.5683 )
									ret := 0.069554
								if( d > 91.5683 )
									ret := 0.513889
							if( Money_Flow_Ratio > 0.898401 )
								if( Raw_Money_Flow <= 9.53166e+07 )
									ret := -0.155914
								if( Raw_Money_Flow > 9.53166e+07 )
									ret := 0.115591
						if( Positive_Money_Flow_Sum > 6.67387e+08 )
							if( rsi1 <= 40.3082 )
								if( MFI_Low <= 76.2451 )
									ret := 0.351351
								if( MFI_Low > 76.2451 )
									ret := 0.884615 // buy
							if( rsi1 > 40.3082 )
								if( MFI <= 83.7496 )
									ret := 0.306785
								if( MFI > 83.7496 )
									ret := 0.002591
	if( Negative_Money_Flow_Sum > 3.52037e+08 )
		if( Negative_Money_Flow <= 210.159 )
			if( Positive_Money_Flow <= 3.83315e+06 )
				if( rsi1 <= 48.2959 )
					if( Positive_Money_Flow_Sum <= 4.42002e+09 )
						if( Positive_Money_Flow_Sum <= 3.81477e+09 )
							if( Positive_Money_Flow_Sum <= 2.783e+09 )
								if( rsi1 <= 22.2669 )
									ret := 0.209091
								if( rsi1 > 22.2669 )
									ret := 0.057242
							if( Positive_Money_Flow_Sum > 2.783e+09 )
								if( Positive_Money_Flow_Sum <= 2.84612e+09 )
									ret := -0.727273 // sell
								if( Positive_Money_Flow_Sum > 2.84612e+09 )
									ret := -0.076471
						if( Positive_Money_Flow_Sum > 3.81477e+09 )
							if( Negative_Money_Flow_Sum <= 2.49197e+09 )
								if( rsi1 <= 42.5663 )
									ret := 0.666667
								if( rsi1 > 42.5663 )
									ret := 0.111111
							if( Negative_Money_Flow_Sum > 2.49197e+09 )
								if( Typical_Price <= 341.216 )
									ret := 0.000000
								if( Typical_Price > 341.216 )
									ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 4.42002e+09 )
						if( d_k <= -16.0796 )
							ret := 0.750000 // buy
						if( d_k > -16.0796 )
							if( Typical_Price <= 249.615 )
								if( Positive_Money_Flow_Sum <= 5.01155e+09 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.01155e+09 )
									ret := -0.555556
							if( Typical_Price > 249.615 )
								if( MFI <= 52.3283 )
									ret := -1.000000 // sell
								if( MFI > 52.3283 )
									ret := 0.031250
				if( rsi1 > 48.2959 )
					if( Positive_Money_Flow_Sum <= 3.9396e+08 )
						if( Negative_Money_Flow_Sum <= 3.87181e+08 )
							if( MFI <= 39.0461 )
								if( Raw_Money_Flow <= 858951 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 858951 )
									ret := 1.000000 // buy
							if( MFI > 39.0461 )
								if( MFI_Low <= 26.5996 )
									ret := 0.000000
								if( MFI_Low > 26.5996 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 3.87181e+08 )
							if( Negative_Money_Flow_Sum <= 1.62356e+09 )
								if( Typical_Price <= 99.4502 )
									ret := -0.326034
								if( Typical_Price > 99.4502 )
									ret := -0.140496
							if( Negative_Money_Flow_Sum > 1.62356e+09 )
								if( Negative_Money_Flow_Sum <= 2.59922e+09 )
									ret := 0.149701
								if( Negative_Money_Flow_Sum > 2.59922e+09 )
									ret := -0.255474
					if( Positive_Money_Flow_Sum > 3.9396e+08 )
						if( Raw_Money_Flow <= 164324 )
							if( Positive_Money_Flow_Sum <= 4.58534e+08 )
								if( Positive_Money_Flow_Sum <= 3.97868e+08 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 3.97868e+08 )
									ret := -0.279412
							if( Positive_Money_Flow_Sum > 4.58534e+08 )
								if( Negative_Money_Flow_Sum <= 1.59463e+09 )
									ret := 0.080000
								if( Negative_Money_Flow_Sum > 1.59463e+09 )
									ret := -0.134146
						if( Raw_Money_Flow > 164324 )
							if( d_k <= -0.421453 )
								if( smoothD_d <= 71.0373 )
									ret := -0.078450
								if( smoothD_d > 71.0373 )
									ret := -0.221780
							if( d_k > -0.421453 )
								if( Positive_Money_Flow_Sum <= 8.62943e+09 )
									ret := -0.007117
								if( Positive_Money_Flow_Sum > 8.62943e+09 )
									ret := -0.550000
			if( Positive_Money_Flow > 3.83315e+06 )
				if( Negative_Money_Flow_Sum <= 4.09866e+09 )
					if( Positive_Money_Flow_Sum <= 4.06572e+08 )
						if( Positive_Money_Flow <= 3.07903e+08 )
							if( Typical_Price <= 57.2931 )
								if( MFI_High <= -49.8423 )
									ret := 0.130435
								if( MFI_High > -49.8423 )
									ret := 0.388889
							if( Typical_Price > 57.2931 )
								if( Positive_Money_Flow_Sum <= 1.38873e+08 )
									ret := 0.110778
								if( Positive_Money_Flow_Sum > 1.38873e+08 )
									ret := -0.086922
						if( Positive_Money_Flow > 3.07903e+08 )
							if( smoothK_k <= 4.26824 )
								if( MFI_High <= -65.6633 )
									ret := 0.714286 // buy
								if( MFI_High > -65.6633 )
									ret := -0.083333
							if( smoothK_k > 4.26824 )
								if( MFI <= 23.8408 )
									ret := -0.245614
								if( MFI > 23.8408 )
									ret := -0.588235
					if( Positive_Money_Flow_Sum > 4.06572e+08 )
						if( Positive_Money_Flow_Sum <= 5.31074e+09 )
							if( Negative_Money_Flow_Sum <= 1.83418e+09 )
								if( Negative_Money_Flow_Sum <= 1.22038e+09 )
									ret := 0.103866
								if( Negative_Money_Flow_Sum > 1.22038e+09 )
									ret := 0.190276
							if( Negative_Money_Flow_Sum > 1.83418e+09 )
								if( Positive_Money_Flow_Sum <= 2.7876e+09 )
									ret := -0.012764
								if( Positive_Money_Flow_Sum > 2.7876e+09 )
									ret := 0.150476
						if( Positive_Money_Flow_Sum > 5.31074e+09 )
							if( d_k <= -6.75873 )
								if( Typical_Price <= 328.98 )
									ret := -0.396226
								if( Typical_Price > 328.98 )
									ret := 0.000000
							if( d_k > -6.75873 )
								if( Raw_Money_Flow <= 5.75503e+08 )
									ret := 0.098540
								if( Raw_Money_Flow > 5.75503e+08 )
									ret := -0.149425
				if( Negative_Money_Flow_Sum > 4.09866e+09 )
					if( Positive_Money_Flow <= 4.82583e+07 )
						if( k <= 99.265 )
							if( Positive_Money_Flow_Sum <= 3.17777e+09 )
								if( rsi1 <= 37.2375 )
									ret := 0.352564
								if( rsi1 > 37.2375 )
									ret := 0.042857
							if( Positive_Money_Flow_Sum > 3.17777e+09 )
								if( MFI_Low <= 34.0745 )
									ret := -0.230769
								if( MFI_Low > 34.0745 )
									ret := 0.379310
						if( k > 99.265 )
							if( Positive_Money_Flow_Sum <= 3.85287e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.85287e+08 )
								if( Negative_Money_Flow_Sum <= 5.24702e+09 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 5.24702e+09 )
									ret := 0.000000
					if( Positive_Money_Flow > 4.82583e+07 )
						if( Negative_Money_Flow_Sum <= 5.62287e+09 )
							if( Typical_Price <= 365.089 )
								if( Negative_Money_Flow_Sum <= 4.28819e+09 )
									ret := -0.051948
								if( Negative_Money_Flow_Sum > 4.28819e+09 )
									ret := -0.457421
							if( Typical_Price > 365.089 )
								if( Negative_Money_Flow_Sum <= 4.77248e+09 )
									ret := 0.185185
								if( Negative_Money_Flow_Sum > 4.77248e+09 )
									ret := -0.320000
						if( Negative_Money_Flow_Sum > 5.62287e+09 )
							if( Raw_Money_Flow <= 5.775e+08 )
								if( d <= 10.3026 )
									ret := 0.000000
								if( d > 10.3026 )
									ret := 0.461538
							if( Raw_Money_Flow > 5.775e+08 )
								if( d <= 6.16655 )
									ret := 0.428571
								if( d > 6.16655 )
									ret := -0.223776
		if( Negative_Money_Flow > 210.159 )
			if( Negative_Money_Flow <= 3.09473e+07 )
				if( smoothK_k <= 76.2989 )
					if( Negative_Money_Flow_Sum <= 8.22673e+09 )
						if( rsi1 <= 23.5244 )
							if( smoothD_d <= 13.3817 )
								if( Raw_Money_Flow <= 3.57357e+06 )
									ret := 0.312500
								if( Raw_Money_Flow > 3.57357e+06 )
									ret := 0.038961
							if( smoothD_d > 13.3817 )
								if( Typical_Price <= 226.142 )
									ret := 0.640000
								if( Typical_Price > 226.142 )
									ret := 0.405263
						if( rsi1 > 23.5244 )
							if( Positive_Money_Flow_Sum <= 7.68065e+09 )
								if( Positive_Money_Flow_Sum <= 4.52803e+09 )
									ret := 0.165100
								if( Positive_Money_Flow_Sum > 4.52803e+09 )
									ret := -0.037182
							if( Positive_Money_Flow_Sum > 7.68065e+09 )
								if( Typical_Price <= 363.936 )
									ret := 0.688679
								if( Typical_Price > 363.936 )
									ret := -0.142857
					if( Negative_Money_Flow_Sum > 8.22673e+09 )
						if( Positive_Money_Flow_Sum <= 1.48915e+09 )
							if( Positive_Money_Flow_Sum <= 8.00143e+08 )
								if( Positive_Money_Flow <= 322816 )
									ret := -0.130435
								if( Positive_Money_Flow > 322816 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8.00143e+08 )
								if( Typical_Price <= 290.925 )
									ret := -1.000000 // sell
								if( Typical_Price > 290.925 )
									ret := -0.724138 // sell
						if( Positive_Money_Flow_Sum > 1.48915e+09 )
							if( Typical_Price <= 238.566 )
								if( Negative_Money_Flow <= 1.64854e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 1.64854e+07 )
									ret := 0.500000
							if( Typical_Price > 238.566 )
								if( MFI_Low <= 0.537093 )
									ret := 0.954545 // buy
								if( MFI_Low > 0.537093 )
									ret := 0.142857
				if( smoothK_k > 76.2989 )
					if( Positive_Money_Flow_Sum <= 4.24012e+09 )
						if( rsi1 <= 62.2802 )
							if( Typical_Price <= 204.134 )
								if( Negative_Money_Flow <= 3.81074e+06 )
									ret := 0.161465
								if( Negative_Money_Flow > 3.81074e+06 )
									ret := 0.655172
							if( Typical_Price > 204.134 )
								if( Negative_Money_Flow_Sum <= 6.80703e+09 )
									ret := 0.067215
								if( Negative_Money_Flow_Sum > 6.80703e+09 )
									ret := -0.535714
						if( rsi1 > 62.2802 )
							if( MFI_Low <= 4.40474 )
								if( Positive_Money_Flow <= 2425.96 )
									ret := -0.142857
								if( Positive_Money_Flow > 2425.96 )
									ret := -0.609756
							if( MFI_Low > 4.40474 )
								if( Raw_Money_Flow <= 678699 )
									ret := -0.107143
								if( Raw_Money_Flow > 678699 )
									ret := 0.115120
					if( Positive_Money_Flow_Sum > 4.24012e+09 )
						if( Typical_Price <= 208.206 )
							if( rsi1 <= 67.7753 )
								if( rsi1 <= 46.3352 )
									ret := -0.250000
								if( rsi1 > 46.3352 )
									ret := -0.940000 // sell
							if( rsi1 > 67.7753 )
								if( Raw_Money_Flow <= 4.64945e+06 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 4.64945e+06 )
									ret := 1.000000 // buy
						if( Typical_Price > 208.206 )
							if( Positive_Money_Flow_Sum <= 1.22826e+10 )
								if( rsi1 <= 45.9217 )
									ret := -0.387755
								if( rsi1 > 45.9217 )
									ret := 0.034056
							if( Positive_Money_Flow_Sum > 1.22826e+10 )
								if( d_k <= -0.240392 )
									ret := 0.000000
								if( d_k > -0.240392 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow > 3.09473e+07 )
				if( Money_Flow_Ratio <= 0.157426 )
					if( d_k <= 5.46254 )
						if( smoothD_d <= 49.9814 )
							if( rsi1 <= 35.081 )
								if( MFI_Low <= -13.7537 )
									ret := 0.126204
								if( MFI_Low > -13.7537 )
									ret := -0.116319
							if( rsi1 > 35.081 )
								if( Negative_Money_Flow_Sum <= 1.72039e+09 )
									ret := -0.127604
								if( Negative_Money_Flow_Sum > 1.72039e+09 )
									ret := -0.419355
						if( smoothD_d > 49.9814 )
							if( rsi1 <= 43.3796 )
								if( Negative_Money_Flow <= 1.0581e+08 )
									ret := -0.600000
								if( Negative_Money_Flow > 1.0581e+08 )
									ret := 0.639535
							if( rsi1 > 43.3796 )
								if( Negative_Money_Flow <= 1.13199e+09 )
									ret := -0.071770
								if( Negative_Money_Flow > 1.13199e+09 )
									ret := 0.507937
					if( d_k > 5.46254 )
						if( Positive_Money_Flow_Sum <= 3.94157e+07 )
							if( Typical_Price <= 322.762 )
								if( Money_Flow_Ratio <= 0.01204 )
									ret := -0.029851
								if( Money_Flow_Ratio > 0.01204 )
									ret := -0.267578
							if( Typical_Price > 322.762 )
								if( Negative_Money_Flow <= 5.98092e+08 )
									ret := -0.281250
								if( Negative_Money_Flow > 5.98092e+08 )
									ret := -0.680412
						if( Positive_Money_Flow_Sum > 3.94157e+07 )
							if( Positive_Money_Flow_Sum <= 1.60299e+08 )
								if( Raw_Money_Flow <= 2.10102e+09 )
									ret := 0.148746
								if( Raw_Money_Flow > 2.10102e+09 )
									ret := -0.612903
							if( Positive_Money_Flow_Sum > 1.60299e+08 )
								if( rsi1 <= 16.8169 )
									ret := 1.000000 // buy
								if( rsi1 > 16.8169 )
									ret := -0.441860
				if( Money_Flow_Ratio > 0.157426 )
					if( Positive_Money_Flow_Sum <= 9.99742e+09 )
						if( Negative_Money_Flow_Sum <= 3.38058e+09 )
							if( MFI <= 81.9173 )
								if( Positive_Money_Flow_Sum <= 6.6025e+09 )
									ret := 0.096906
								if( Positive_Money_Flow_Sum > 6.6025e+09 )
									ret := 0.725806 // buy
							if( MFI > 81.9173 )
								if( Typical_Price <= 231.158 )
									ret := -0.311927
								if( Typical_Price > 231.158 )
									ret := 0.035556
						if( Negative_Money_Flow_Sum > 3.38058e+09 )
							if( Negative_Money_Flow <= 6.20921e+08 )
								if( Positive_Money_Flow_Sum <= 2.74589e+09 )
									ret := -0.025907
								if( Positive_Money_Flow_Sum > 2.74589e+09 )
									ret := -0.365625
							if( Negative_Money_Flow > 6.20921e+08 )
								if( Negative_Money_Flow_Sum <= 3.95433e+09 )
									ret := -0.126316
								if( Negative_Money_Flow_Sum > 3.95433e+09 )
									ret := 0.106412
					if( Positive_Money_Flow_Sum > 9.99742e+09 )
						if( Raw_Money_Flow <= 1.13738e+09 )
							if( MFI_High <= -2.28784 )
								ret := -0.250000
							if( MFI_High > -2.28784 )
								if( Negative_Money_Flow <= 3.23765e+08 )
									ret := -0.600000
								if( Negative_Money_Flow > 3.23765e+08 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.13738e+09 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_MSFT_30Min_0712e3b7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


