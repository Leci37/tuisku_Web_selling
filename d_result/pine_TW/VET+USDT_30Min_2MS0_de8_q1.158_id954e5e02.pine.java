//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: VETUSDT_30Min_2MS0_954e5e02 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2MS0_954e5e02", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_954e5e02(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 49.6342 )
		if( rsi1 <= 37.5626 )
			if( MFI_Low <= 7.67627 )
				if( d_k <= -6.42089 )
					if( Raw_Money_Flow <= 720894 )
						if( rsi1 <= 32.7523 )
							if( MFI_High <= -59.3453 )
								if( Typical_Price <= 0.025596 )
									ret := -0.017021
								if( Typical_Price > 0.025596 )
									ret := -0.385417
							if( MFI_High > -59.3453 )
								if( Negative_Money_Flow_Sum <= 2.50872e+06 )
									ret := -0.515873
								if( Negative_Money_Flow_Sum > 2.50872e+06 )
									ret := -0.247191
						if( rsi1 > 32.7523 )
							if( Positive_Money_Flow_Sum <= 3.83293e+06 )
								if( Negative_Money_Flow <= 623105 )
									ret := 0.038889
								if( Negative_Money_Flow > 623105 )
									ret := 0.647059
							if( Positive_Money_Flow_Sum > 3.83293e+06 )
								if( d_k <= -8.93768 )
									ret := 1.000000 // buy
								if( d_k > -8.93768 )
									ret := 0.500000
					if( Raw_Money_Flow > 720894 )
						if( d_k <= -10.5809 )
							if( Negative_Money_Flow <= 1.80116e+06 )
								if( Positive_Money_Flow_Sum <= 4.51808e+07 )
									ret := 0.277778
								if( Positive_Money_Flow_Sum > 4.51808e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.80116e+06 )
								if( Typical_Price <= 0.099875 )
									ret := 0.825806 // buy
								if( Typical_Price > 0.099875 )
									ret := 0.589744
						if( d_k > -10.5809 )
							if( Typical_Price <= 0.084804 )
								if( Raw_Money_Flow <= 1.27829e+06 )
									ret := 0.082192
								if( Raw_Money_Flow > 1.27829e+06 )
									ret := 0.503448
							if( Typical_Price > 0.084804 )
								if( Negative_Money_Flow <= 1.97259e+07 )
									ret := -0.195652
								if( Negative_Money_Flow > 1.97259e+07 )
									ret := 1.000000 // buy
				if( d_k > -6.42089 )
					if( Typical_Price <= 0.044575 )
						if( rsi1 <= 24.388 )
							if( Typical_Price <= 0.016794 )
								if( Positive_Money_Flow_Sum <= 703054 )
									ret := 0.348993
								if( Positive_Money_Flow_Sum > 703054 )
									ret := -0.046154
							if( Typical_Price > 0.016794 )
								if( Negative_Money_Flow_Sum <= 2.30737e+07 )
									ret := -0.528395
								if( Negative_Money_Flow_Sum > 2.30737e+07 )
									ret := 0.793103 // buy
						if( rsi1 > 24.388 )
							if( Negative_Money_Flow <= 435406 )
								if( Money_Flow_Ratio <= 0.18588 )
									ret := 0.111111
								if( Money_Flow_Ratio > 0.18588 )
									ret := -0.157336
							if( Negative_Money_Flow > 435406 )
								if( smoothK_k <= 16.3394 )
									ret := 0.151111
								if( smoothK_k > 16.3394 )
									ret := 0.471111
					if( Typical_Price > 0.044575 )
						if( rsi1 <= 33.2041 )
							if( rsi1 <= 21.4854 )
								if( d_k <= -1.10958 )
									ret := -0.593220
								if( d_k > -1.10958 )
									ret := -0.850000 // sell
							if( rsi1 > 21.4854 )
								if( d_k <= -1.67551 )
									ret := -0.364912
								if( d_k > -1.67551 )
									ret := -0.680328
						if( rsi1 > 33.2041 )
							if( Positive_Money_Flow <= 1.12799e+06 )
								if( d_k <= -0.652006 )
									ret := 0.274510
								if( d_k > -0.652006 )
									ret := -0.297872
							if( Positive_Money_Flow > 1.12799e+06 )
								if( smoothD_d <= 30.4826 )
									ret := 0.166667
								if( smoothD_d > 30.4826 )
									ret := -0.866667 // sell
			if( MFI_Low > 7.67627 )
				if( Typical_Price <= 0.01955 )
					if( Negative_Money_Flow_Sum <= 3.21773e+06 )
						if( Positive_Money_Flow_Sum <= 209037 )
							if( Raw_Money_Flow <= 100511 )
								if( Negative_Money_Flow_Sum <= 459692 )
									ret := -0.016854
								if( Negative_Money_Flow_Sum > 459692 )
									ret := -0.500000
							if( Raw_Money_Flow > 100511 )
								if( Typical_Price <= 0.017021 )
									ret := -0.333333
								if( Typical_Price > 0.017021 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 209037 )
							if( rsi1 <= 28.7611 )
								if( Typical_Price <= 0.01142 )
									ret := 0.000000
								if( Typical_Price > 0.01142 )
									ret := -0.549270
							if( rsi1 > 28.7611 )
								if( Negative_Money_Flow_Sum <= 2.0327e+06 )
									ret := -0.288076
								if( Negative_Money_Flow_Sum > 2.0327e+06 )
									ret := -0.095833
					if( Negative_Money_Flow_Sum > 3.21773e+06 )
						if( d_k <= 18.8834 )
							if( rsi1 <= 31.1554 )
								if( smoothD_d <= 3.14471 )
									ret := 0.058824
								if( smoothD_d > 3.14471 )
									ret := -0.333333
							if( rsi1 > 31.1554 )
								if( Positive_Money_Flow_Sum <= 7.24163e+06 )
									ret := 0.196226
								if( Positive_Money_Flow_Sum > 7.24163e+06 )
									ret := -0.583333
						if( d_k > 18.8834 )
							if( Raw_Money_Flow <= 448813 )
								ret := 0.000000
							if( Raw_Money_Flow > 448813 )
								if( Negative_Money_Flow <= 772736 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 772736 )
									ret := 1.000000 // buy
				if( Typical_Price > 0.01955 )
					if( d_k <= -1.56104 )
						if( Negative_Money_Flow_Sum <= 8.46613e+06 )
							if( rsi1 <= 33.3321 )
								if( smoothK_k <= 74.0446 )
									ret := -0.676600
								if( smoothK_k > 74.0446 )
									ret := 0.181818
							if( rsi1 > 33.3321 )
								if( MFI <= 49.7257 )
									ret := -0.345351
								if( MFI > 49.7257 )
									ret := -0.596026
						if( Negative_Money_Flow_Sum > 8.46613e+06 )
							if( rsi1 <= 27.7737 )
								if( Typical_Price <= 0.031558 )
									ret := 0.500000
								if( Typical_Price > 0.031558 )
									ret := -0.624000
							if( rsi1 > 27.7737 )
								if( Negative_Money_Flow <= 550211 )
									ret := -0.220207
								if( Negative_Money_Flow > 550211 )
									ret := 0.098291
					if( d_k > -1.56104 )
						if( Positive_Money_Flow_Sum <= 1.51797e+06 )
							if( rsi1 <= 31.0245 )
								if( Positive_Money_Flow_Sum <= 273320 )
									ret := -0.243243
								if( Positive_Money_Flow_Sum > 273320 )
									ret := -0.629430
							if( rsi1 > 31.0245 )
								if( MFI <= 59.3632 )
									ret := -0.361765
								if( MFI > 59.3632 )
									ret := -0.619469
						if( Positive_Money_Flow_Sum > 1.51797e+06 )
							if( d_k <= 1.71108 )
								if( rsi1 <= 33.525 )
									ret := -0.638136
								if( rsi1 > 33.525 )
									ret := -0.362173
							if( d_k > 1.71108 )
								if( Negative_Money_Flow_Sum <= 2.81269e+07 )
									ret := -0.725959 // sell
								if( Negative_Money_Flow_Sum > 2.81269e+07 )
									ret := -0.893918 // sell
		if( rsi1 > 37.5626 )
			if( MFI_Low <= 24.6341 )
				if( d_k <= -4.25218 )
					if( Negative_Money_Flow <= 533352 )
						if( Negative_Money_Flow_Sum <= 7.53269e+06 )
							if( Negative_Money_Flow <= 120068 )
								if( rsi1 <= 43.3786 )
									ret := -0.091091
								if( rsi1 > 43.3786 )
									ret := 0.114921
							if( Negative_Money_Flow > 120068 )
								if( MFI <= 31.8489 )
									ret := 0.419593
								if( MFI > 31.8489 )
									ret := 0.189796
						if( Negative_Money_Flow_Sum > 7.53269e+06 )
							if( rsi1 <= 45.5464 )
								if( Money_Flow_Ratio <= 0.352 )
									ret := 0.602151
								if( Money_Flow_Ratio > 0.352 )
									ret := 0.256711
							if( rsi1 > 45.5464 )
								if( MFI_Low <= 23.914 )
									ret := 0.603248
								if( MFI_Low > 23.914 )
									ret := -0.294118
					if( Negative_Money_Flow > 533352 )
						if( k <= 19.8107 )
							if( Raw_Money_Flow <= 3.39657e+06 )
								if( Positive_Money_Flow_Sum <= 7.47386e+06 )
									ret := 0.094340
								if( Positive_Money_Flow_Sum > 7.47386e+06 )
									ret := -0.440000
							if( Raw_Money_Flow > 3.39657e+06 )
								if( d_k <= -8.8699 )
									ret := -0.200000
								if( d_k > -8.8699 )
									ret := 0.788462 // buy
						if( k > 19.8107 )
							if( MFI_High <= -47.3246 )
								if( rsi1 <= 41.8152 )
									ret := 0.639013
								if( rsi1 > 41.8152 )
									ret := 0.807571 // buy
							if( MFI_High > -47.3246 )
								if( Negative_Money_Flow_Sum <= 3.39003e+08 )
									ret := 0.531884
								if( Negative_Money_Flow_Sum > 3.39003e+08 )
									ret := -1.000000 // sell
				if( d_k > -4.25218 )
					if( Typical_Price <= 0.045105 )
						if( MFI_Low <= 4.26473 )
							if( Negative_Money_Flow <= 306092 )
								if( Raw_Money_Flow <= 71657.5 )
									ret := 0.087500
								if( Raw_Money_Flow > 71657.5 )
									ret := 0.355932
							if( Negative_Money_Flow > 306092 )
								if( rsi1 <= 37.802 )
									ret := -0.250000
								if( rsi1 > 37.802 )
									ret := 0.771429 // buy
						if( MFI_Low > 4.26473 )
							if( Negative_Money_Flow <= 287133 )
								if( Typical_Price <= 0.022413 )
									ret := 0.021926
								if( Typical_Price > 0.022413 )
									ret := -0.090164
							if( Negative_Money_Flow > 287133 )
								if( MFI_High <= -41.7074 )
									ret := 0.352227
								if( MFI_High > -41.7074 )
									ret := 0.045213
					if( Typical_Price > 0.045105 )
						if( d_k <= -1.55975 )
							if( Typical_Price <= 0.16868 )
								if( Negative_Money_Flow <= 5.10368e+06 )
									ret := 0.002257
								if( Negative_Money_Flow > 5.10368e+06 )
									ret := 0.609756
							if( Typical_Price > 0.16868 )
								if( smoothD_d <= 27.1341 )
									ret := 0.142857
								if( smoothD_d > 27.1341 )
									ret := -0.724138 // sell
						if( d_k > -1.55975 )
							if( Positive_Money_Flow <= 1.69059e+06 )
								if( rsi1 <= 43.9088 )
									ret := -0.370915
								if( rsi1 > 43.9088 )
									ret := -0.033639
							if( Positive_Money_Flow > 1.69059e+06 )
								if( smoothD_d <= 81.2578 )
									ret := -0.659574
								if( smoothD_d > 81.2578 )
									ret := -0.222222
			if( MFI_Low > 24.6341 )
				if( d_k <= 1.68422 )
					if( Positive_Money_Flow <= 777.143 )
						if( rsi1 <= 42.7161 )
							if( Money_Flow_Ratio <= 1.24346 )
								if( Positive_Money_Flow_Sum <= 4.43489e+07 )
									ret := -0.132388
								if( Positive_Money_Flow_Sum > 4.43489e+07 )
									ret := -0.628571
							if( Money_Flow_Ratio > 1.24346 )
								if( Positive_Money_Flow_Sum <= 5.48665e+06 )
									ret := -0.284091
								if( Positive_Money_Flow_Sum > 5.48665e+06 )
									ret := -0.597222
						if( rsi1 > 42.7161 )
							if( Typical_Price <= 0.053252 )
								if( Positive_Money_Flow_Sum <= 1.01389e+07 )
									ret := -0.009719
								if( Positive_Money_Flow_Sum > 1.01389e+07 )
									ret := -0.464789
							if( Typical_Price > 0.053252 )
								if( d_k <= -1.11335 )
									ret := 0.469055
								if( d_k > -1.11335 )
									ret := 0.100000
					if( Positive_Money_Flow > 777.143 )
						if( Positive_Money_Flow <= 1.02768e+07 )
							if( rsi1 <= 41.8435 )
								if( Typical_Price <= 0.017102 )
									ret := 0.000000
								if( Typical_Price > 0.017102 )
									ret := -0.524008
							if( rsi1 > 41.8435 )
								if( Typical_Price <= 0.017574 )
									ret := 0.097015
								if( Typical_Price > 0.017574 )
									ret := -0.256140
						if( Positive_Money_Flow > 1.02768e+07 )
							if( Raw_Money_Flow <= 1.6294e+07 )
								if( d_k <= -7.76894 )
									ret := 1.000000 // buy
								if( d_k > -7.76894 )
									ret := -0.062500
							if( Raw_Money_Flow > 1.6294e+07 )
								ret := 1.000000 // buy
				if( d_k > 1.68422 )
					if( Positive_Money_Flow_Sum <= 1.38741e+06 )
						if( Positive_Money_Flow_Sum <= 473015 )
							if( Positive_Money_Flow <= 70360.6 )
								if( Money_Flow_Ratio <= 3.79952 )
									ret := -0.032345
								if( Money_Flow_Ratio > 3.79952 )
									ret := -0.400000
							if( Positive_Money_Flow > 70360.6 )
								if( smoothD_d <= 40.9856 )
									ret := -0.450000
								if( smoothD_d > 40.9856 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 473015 )
							if( Positive_Money_Flow <= 669.867 )
								if( Negative_Money_Flow <= 165635 )
									ret := -0.197464
								if( Negative_Money_Flow > 165635 )
									ret := -0.018692
							if( Positive_Money_Flow > 669.867 )
								if( d_k <= 15.754 )
									ret := -0.371316
								if( d_k > 15.754 )
									ret := -0.183246
					if( Positive_Money_Flow_Sum > 1.38741e+06 )
						if( Positive_Money_Flow <= 520824 )
							if( rsi1 <= 42.9873 )
								if( k <= 67.0291 )
									ret := -0.602362
								if( k > 67.0291 )
									ret := -0.162791
							if( rsi1 > 42.9873 )
								if( Money_Flow_Ratio <= 1.17208 )
									ret := -0.223338
								if( Money_Flow_Ratio > 1.17208 )
									ret := -0.478325
						if( Positive_Money_Flow > 520824 )
							if( Money_Flow_Ratio <= 1.48053 )
								if( rsi1 <= 46.9452 )
									ret := -0.671642
								if( rsi1 > 46.9452 )
									ret := -0.412500
							if( Money_Flow_Ratio > 1.48053 )
								if( Positive_Money_Flow <= 6.31299e+06 )
									ret := -0.726829 // sell
								if( Positive_Money_Flow > 6.31299e+06 )
									ret := -0.956140 // sell
	if( rsi1 > 49.6342 )
		if( d_k <= 3.24234 )
			if( Typical_Price <= 0.037413 )
				if( rsi1 <= 61.3902 )
					if( MFI_Low <= 27.6145 )
						if( Negative_Money_Flow <= 119203 )
							if( Negative_Money_Flow_Sum <= 533264 )
								if( Negative_Money_Flow <= 67229.4 )
									ret := 0.017632
								if( Negative_Money_Flow > 67229.4 )
									ret := 0.321429
							if( Negative_Money_Flow_Sum > 533264 )
								if( smoothK_k <= 33.9255 )
									ret := -0.030488
								if( smoothK_k > 33.9255 )
									ret := 0.342442
						if( Negative_Money_Flow > 119203 )
							if( k <= 35.8204 )
								if( Positive_Money_Flow_Sum <= 4.80526e+06 )
									ret := 0.305344
								if( Positive_Money_Flow_Sum > 4.80526e+06 )
									ret := 0.880000 // buy
							if( k > 35.8204 )
								if( d <= 73.3823 )
									ret := 0.732224 // buy
								if( d > 73.3823 )
									ret := 0.547619
					if( MFI_Low > 27.6145 )
						if( Money_Flow_Ratio <= 2.13636 )
							if( rsi1 <= 54.0871 )
								if( Negative_Money_Flow_Sum <= 7.39467e+06 )
									ret := 0.018676
								if( Negative_Money_Flow_Sum > 7.39467e+06 )
									ret := -0.333333
							if( rsi1 > 54.0871 )
								if( Positive_Money_Flow <= 790174 )
									ret := 0.214884
								if( Positive_Money_Flow > 790174 )
									ret := -0.144796
						if( Money_Flow_Ratio > 2.13636 )
							if( Typical_Price <= 0.014706 )
								if( Positive_Money_Flow <= 200764 )
									ret := -0.111111
								if( Positive_Money_Flow > 200764 )
									ret := 0.666667
							if( Typical_Price > 0.014706 )
								if( rsi1 <= 58.5952 )
									ret := -0.270130
								if( rsi1 > 58.5952 )
									ret := 0.027778
				if( rsi1 > 61.3902 )
					if( Typical_Price <= 0.017212 )
						if( Negative_Money_Flow_Sum <= 1.42735e+06 )
							if( Negative_Money_Flow_Sum <= 274878 )
								if( Typical_Price <= 0.011279 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.011279 )
									ret := 0.040909
							if( Negative_Money_Flow_Sum > 274878 )
								if( Raw_Money_Flow <= 724010 )
									ret := 0.331823
								if( Raw_Money_Flow > 724010 )
									ret := -0.254237
						if( Negative_Money_Flow_Sum > 1.42735e+06 )
							if( Positive_Money_Flow_Sum <= 3.03619e+06 )
								if( Positive_Money_Flow_Sum <= 2.38836e+06 )
									ret := 0.244444
								if( Positive_Money_Flow_Sum > 2.38836e+06 )
									ret := -0.534884
							if( Positive_Money_Flow_Sum > 3.03619e+06 )
								if( Positive_Money_Flow_Sum <= 4.15074e+06 )
									ret := 0.380597
								if( Positive_Money_Flow_Sum > 4.15074e+06 )
									ret := -0.021127
					if( Typical_Price > 0.017212 )
						if( Positive_Money_Flow_Sum <= 9.95536e+06 )
							if( Negative_Money_Flow_Sum <= 470034 )
								if( rsi1 <= 73.3375 )
									ret := 0.192857
								if( rsi1 > 73.3375 )
									ret := 0.530259
							if( Negative_Money_Flow_Sum > 470034 )
								if( rsi1 <= 73.8646 )
									ret := 0.530813
								if( rsi1 > 73.8646 )
									ret := 0.676454
						if( Positive_Money_Flow_Sum > 9.95536e+06 )
							if( Typical_Price <= 0.026683 )
								if( smoothD_d <= 42.4925 )
									ret := -0.782609 // sell
								if( smoothD_d > 42.4925 )
									ret := -0.275862
							if( Typical_Price > 0.026683 )
								if( Raw_Money_Flow <= 2.82116e+06 )
									ret := 0.332155
								if( Raw_Money_Flow > 2.82116e+06 )
									ret := -0.464789
			if( Typical_Price > 0.037413 )
				if( d_k <= -0.000874 )
					if( rsi1 <= 60.9508 )
						if( d_k <= -4.76008 )
							if( Negative_Money_Flow_Sum <= 3.62190e+06 )
								if( MFI_High <= -20.4647 )
									ret := 0.282486
								if( MFI_High > -20.4647 )
									ret := -0.292683
							if( Negative_Money_Flow_Sum > 3.62190e+06 )
								if( MFI <= 65.441 )
									ret := 0.674024
								if( MFI > 65.441 )
									ret := 0.000000
						if( d_k > -4.76008 )
							if( Negative_Money_Flow <= 861656 )
								if( rsi1 <= 54.2886 )
									ret := 0.095122
								if( rsi1 > 54.2886 )
									ret := 0.375626
							if( Negative_Money_Flow > 861656 )
								if( rsi1 <= 51.7694 )
									ret := 0.253731
								if( rsi1 > 51.7694 )
									ret := 0.623377
					if( rsi1 > 60.9508 )
						if( Raw_Money_Flow <= 528028 )
							if( Negative_Money_Flow_Sum <= 1.2422e+06 )
								if( d <= 85.9706 )
									ret := 0.063830
								if( d > 85.9706 )
									ret := 0.480000
							if( Negative_Money_Flow_Sum > 1.2422e+06 )
								if( Negative_Money_Flow <= 197826 )
									ret := 0.596200
								if( Negative_Money_Flow > 197826 )
									ret := 0.738994 // buy
						if( Raw_Money_Flow > 528028 )
							if( rsi1 <= 70.8717 )
								if( MFI <= 58.5399 )
									ret := 0.810386 // buy
								if( MFI > 58.5399 )
									ret := 0.611823
							if( rsi1 > 70.8717 )
								if( smoothK_k <= 96.9974 )
									ret := 0.858096 // buy
								if( smoothK_k > 96.9974 )
									ret := 0.698718
				if( d_k > -0.000874 )
					if( rsi1 <= 55.2284 )
						if( MFI_High <= -33.2539 )
							if( Typical_Price <= 0.047194 )
								if( rsi1 <= 54.6818 )
									ret := 0.882353 // buy
								if( rsi1 > 54.6818 )
									ret := 0.333333
							if( Typical_Price > 0.047194 )
								if( k <= 90.3676 )
									ret := 0.320513
								if( k > 90.3676 )
									ret := -0.194444
						if( MFI_High > -33.2539 )
							if( d_k <= 2.7953 )
								if( Negative_Money_Flow <= 390916 )
									ret := -0.162162
								if( Negative_Money_Flow > 390916 )
									ret := 0.227723
							if( d_k > 2.7953 )
								if( d_k <= 3.19428 )
									ret := -0.540000
								if( d_k > 3.19428 )
									ret := 0.285714
					if( rsi1 > 55.2284 )
						if( d <= 20.6058 )
							if( Positive_Money_Flow <= 1.93985e+06 )
								if( Money_Flow_Ratio <= 2.97729 )
									ret := 0.122807
								if( Money_Flow_Ratio > 2.97729 )
									ret := -0.500000
							if( Positive_Money_Flow > 1.93985e+06 )
								if( Money_Flow_Ratio <= 2.14762 )
									ret := -0.250000
								if( Money_Flow_Ratio > 2.14762 )
									ret := -0.928571 // sell
						if( d > 20.6058 )
							if( Negative_Money_Flow <= 251812 )
								if( k <= 91.4258 )
									ret := 0.313665
								if( k > 91.4258 )
									ret := 0.531852
							if( Negative_Money_Flow > 251812 )
								if( rsi1 <= 67.5092 )
									ret := 0.539503
								if( rsi1 > 67.5092 )
									ret := 0.724036 // buy
		if( d_k > 3.24234 )
			if( Positive_Money_Flow <= 540709 )
				if( smoothK_k <= 66.3399 )
					if( MFI_Low <= 36.1906 )
						if( rsi1 <= 55.7328 )
							if( Negative_Money_Flow <= 1.00598e+07 )
								if( Raw_Money_Flow <= 5.36419e+06 )
									ret := 0.025414
								if( Raw_Money_Flow > 5.36419e+06 )
									ret := 0.681818
							if( Negative_Money_Flow > 1.00598e+07 )
								ret := -1.000000 // sell
						if( rsi1 > 55.7328 )
							if( Negative_Money_Flow <= 1.8206e+07 )
								if( Positive_Money_Flow_Sum <= 2.24194e+06 )
									ret := 0.197232
								if( Positive_Money_Flow_Sum > 2.24194e+06 )
									ret := 0.452471
							if( Negative_Money_Flow > 1.8206e+07 )
								ret := -1.000000 // sell
					if( MFI_Low > 36.1906 )
						if( rsi1 <= 62.0855 )
							if( rsi1 <= 55.4048 )
								if( Raw_Money_Flow <= 154388 )
									ret := -0.121649
								if( Raw_Money_Flow > 154388 )
									ret := -0.372071
							if( rsi1 > 55.4048 )
								if( MFI_High <= -6.91098 )
									ret := 0.029694
								if( MFI_High > -6.91098 )
									ret := -0.254425
						if( rsi1 > 62.0855 )
							if( Money_Flow_Ratio <= 3.27178 )
								if( rsi1 <= 69.9067 )
									ret := 0.204398
								if( rsi1 > 69.9067 )
									ret := 0.579710
							if( Money_Flow_Ratio > 3.27178 )
								if( Positive_Money_Flow_Sum <= 8.32895e+07 )
									ret := 0.094033
								if( Positive_Money_Flow_Sum > 8.32895e+07 )
									ret := -0.678571
				if( smoothK_k > 66.3399 )
					if( smoothK_k <= 76.2623 )
						if( rsi1 <= 64.6558 )
							if( MFI <= 52.5474 )
								if( Negative_Money_Flow <= 29276.6 )
									ret := 0.192857
								if( Negative_Money_Flow > 29276.6 )
									ret := 0.406061
							if( MFI > 52.5474 )
								if( Positive_Money_Flow_Sum <= 1.5434e+06 )
									ret := 0.147059
								if( Positive_Money_Flow_Sum > 1.5434e+06 )
									ret := -0.112637
						if( rsi1 > 64.6558 )
							if( Negative_Money_Flow_Sum <= 288296 )
								if( d_k <= 11.8425 )
									ret := 0.000000
								if( d_k > 11.8425 )
									ret := 0.384615
							if( Negative_Money_Flow_Sum > 288296 )
								if( rsi1 <= 73.9044 )
									ret := 0.381720
								if( rsi1 > 73.9044 )
									ret := 0.695312
					if( smoothK_k > 76.2623 )
						if( rsi1 <= 65.6408 )
							if( MFI <= 46.2177 )
								if( Raw_Money_Flow <= 71580.2 )
									ret := 0.176471
								if( Raw_Money_Flow > 71580.2 )
									ret := 0.498168
							if( MFI > 46.2177 )
								if( MFI_Low <= 45.2578 )
									ret := 0.205479
								if( MFI_Low > 45.2578 )
									ret := 0.005025
						if( rsi1 > 65.6408 )
							if( MFI_Low <= 41.6984 )
								if( Raw_Money_Flow <= 30202.6 )
									ret := 0.000000
								if( Raw_Money_Flow > 30202.6 )
									ret := 0.684375
							if( MFI_Low > 41.6984 )
								if( rsi1 <= 75.9312 )
									ret := 0.297650
								if( rsi1 > 75.9312 )
									ret := 0.621849
			if( Positive_Money_Flow > 540709 )
				if( smoothK_k <= 73.1475 )
					if( d_k <= 8.71096 )
						if( rsi1 <= 65.6337 )
							if( MFI <= 52.5944 )
								if( Positive_Money_Flow_Sum <= 9.43764e+06 )
									ret := 0.481481
								if( Positive_Money_Flow_Sum > 9.43764e+06 )
									ret := -0.267606
							if( MFI > 52.5944 )
								if( rsi1 <= 56.1734 )
									ret := -0.623239
								if( rsi1 > 56.1734 )
									ret := -0.291793
						if( rsi1 > 65.6337 )
							if( Positive_Money_Flow <= 1.6877e+07 )
								if( MFI <= 81.6182 )
									ret := 0.271429
								if( MFI > 81.6182 )
									ret := -0.220588
							if( Positive_Money_Flow > 1.6877e+07 )
								if( Positive_Money_Flow_Sum <= 6.73463e+07 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 6.73463e+07 )
									ret := -1.000000 // sell
					if( d_k > 8.71096 )
						if( rsi1 <= 67.5696 )
							if( Money_Flow_Ratio <= 2.76863 )
								if( smoothD_d <= 41.1021 )
									ret := -0.280303
								if( smoothD_d > 41.1021 )
									ret := -0.586301
							if( Money_Flow_Ratio > 2.76863 )
								if( rsi1 <= 64.7447 )
									ret := -0.818841 // sell
								if( rsi1 > 64.7447 )
									ret := -0.549550
						if( rsi1 > 67.5696 )
							if( Positive_Money_Flow_Sum <= 1.48922e+07 )
								if( Negative_Money_Flow_Sum <= 1.06687e+06 )
									ret := 0.645161
								if( Negative_Money_Flow_Sum > 1.06687e+06 )
									ret := 0.193548
							if( Positive_Money_Flow_Sum > 1.48922e+07 )
								if( Positive_Money_Flow_Sum <= 3.97876e+08 )
									ret := -0.436842
								if( Positive_Money_Flow_Sum > 3.97876e+08 )
									ret := 1.000000 // buy
				if( smoothK_k > 73.1475 )
					if( smoothD_d <= 88.4098 )
						if( Positive_Money_Flow_Sum <= 2.55234e+07 )
							if( rsi1 <= 51.992 )
								if( Positive_Money_Flow <= 1.26371e+06 )
									ret := -0.333333
								if( Positive_Money_Flow > 1.26371e+06 )
									ret := -0.937500 // sell
							if( rsi1 > 51.992 )
								if( rsi1 <= 70.9379 )
									ret := -0.056818
								if( rsi1 > 70.9379 )
									ret := 0.295455
						if( Positive_Money_Flow_Sum > 2.55234e+07 )
							if( Positive_Money_Flow_Sum <= 3.08088e+07 )
								if( Typical_Price <= 0.134947 )
									ret := -0.954545 // sell
								if( Typical_Price > 0.134947 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 3.08088e+07 )
								if( rsi1 <= 59.231 )
									ret := -0.679245
								if( rsi1 > 59.231 )
									ret := -0.047244
					if( smoothD_d > 88.4098 )
						if( rsi1 <= 70.2065 )
							if( Positive_Money_Flow_Sum <= 5.47811e+06 )
								if( Positive_Money_Flow <= 969463 )
									ret := 0.241379
								if( Positive_Money_Flow > 969463 )
									ret := 0.857143 // buy
							if( Positive_Money_Flow_Sum > 5.47811e+06 )
								if( Negative_Money_Flow_Sum <= 7.95661e+06 )
									ret := -0.315789
								if( Negative_Money_Flow_Sum > 7.95661e+06 )
									ret := 0.049587
						if( rsi1 > 70.2065 )
							if( Negative_Money_Flow_Sum <= 5.85033e+06 )
								if( Positive_Money_Flow_Sum <= 6.83277e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 6.83277e+06 )
									ret := 0.186667
							if( Negative_Money_Flow_Sum > 5.85033e+06 )
								if( Negative_Money_Flow_Sum <= 5.75144e+07 )
									ret := 0.719626 // buy
								if( Negative_Money_Flow_Sum > 5.75144e+07 )
									ret := -0.250000
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_954e5e02(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


