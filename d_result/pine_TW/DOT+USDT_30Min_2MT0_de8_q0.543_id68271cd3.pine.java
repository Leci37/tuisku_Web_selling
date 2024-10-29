//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: DOTUSDT_30Min_2MT0_68271cd3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2MT0_68271cd3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_68271cd3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.035033 )
		if( Negative_Money_Flow <= 713205 )
			if( ema2 <= 6.89298 )
				if( ema13 <= -0.075521 )
					if( MFI_High <= -64.5967 )
						if( ema12 <= -0.072779 )
							if( ema13 <= -0.250052 )
								ret := -1.000000 // sell
							if( ema13 > -0.250052 )
								if( Raw_Money_Flow <= 744816 )
									ret := 0.000000
								if( Raw_Money_Flow > 744816 )
									ret := -0.666667
						if( ema12 > -0.072779 )
							if( ema12 <= -0.046428 )
								if( Raw_Money_Flow <= 976987 )
									ret := 0.166667
								if( Raw_Money_Flow > 976987 )
									ret := -0.428571
							if( ema12 > -0.046428 )
								if( MFI_Low <= -7.87245 )
									ret := 0.000000
								if( MFI_Low > -7.87245 )
									ret := -0.571429
					if( MFI_High > -64.5967 )
						if( MFI_High <= -32.6367 )
							if( ema13 <= -0.192966 )
								if( Negative_Money_Flow_Sum <= 3.09978e+07 )
									ret := -0.260870
								if( Negative_Money_Flow_Sum > 3.09978e+07 )
									ret := 0.481481
							if( ema13 > -0.192966 )
								if( Negative_Money_Flow_Sum <= 1.07387e+07 )
									ret := 0.170588
								if( Negative_Money_Flow_Sum > 1.07387e+07 )
									ret := 0.404018
						if( MFI_High > -32.6367 )
							if( ema3 <= 5.72694 )
								if( ema12 <= -0.058481 )
									ret := -0.600000
								if( ema12 > -0.058481 )
									ret := -1.000000 // sell
							if( ema3 > 5.72694 )
								if( MFI_Low <= 28.4571 )
									ret := 0.571429
								if( MFI_Low > 28.4571 )
									ret := -0.277778
				if( ema13 > -0.075521 )
					if( Positive_Money_Flow_Sum <= 9.0755e+06 )
						if( Negative_Money_Flow <= 670222 )
							if( Negative_Money_Flow_Sum <= 8.26722e+06 )
								if( Positive_Money_Flow_Sum <= 2.39192e+06 )
									ret := 0.108374
								if( Positive_Money_Flow_Sum > 2.39192e+06 )
									ret := -0.216000
							if( Negative_Money_Flow_Sum > 8.26722e+06 )
								if( Negative_Money_Flow_Sum <= 1.03968e+07 )
									ret := 0.419355
								if( Negative_Money_Flow_Sum > 1.03968e+07 )
									ret := 0.020000
						if( Negative_Money_Flow > 670222 )
							if( ema1 <= 6.52216 )
								if( ema12 <= -0.041449 )
									ret := -0.285714
								if( ema12 > -0.041449 )
									ret := -0.900000 // sell
							if( ema1 > 6.52216 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 9.0755e+06 )
						if( ema3 <= 5.81389 )
							ret := -1.000000 // sell
						if( ema3 > 5.81389 )
							ret := -0.166667
			if( ema2 > 6.89298 )
				if( MFI_High <= -41.6985 )
					if( Negative_Money_Flow_Sum <= 1.55248e+08 )
						if( ema2 <= 25.2349 )
							if( Raw_Money_Flow <= 1.5405e+07 )
								if( MFI_Low <= 16.8426 )
									ret := -0.058513
								if( MFI_Low > 16.8426 )
									ret := -0.321429
							if( Raw_Money_Flow > 1.5405e+07 )
								if( ema3 <= 24.7593 )
									ret := 0.758621 // buy
								if( ema3 > 24.7593 )
									ret := -0.333333
						if( ema2 > 25.2349 )
							if( Positive_Money_Flow_Sum <= 2.63449e+07 )
								if( Negative_Money_Flow_Sum <= 9.73486e+07 )
									ret := 0.344743
								if( Negative_Money_Flow_Sum > 9.73486e+07 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 2.63449e+07 )
								if( Positive_Money_Flow <= 5.04766e+06 )
									ret := -0.364162
								if( Positive_Money_Flow > 5.04766e+06 )
									ret := 0.061417
					if( Negative_Money_Flow_Sum > 1.55248e+08 )
						if( Raw_Money_Flow <= 1.00748e+07 )
							if( ema2 <= 42.9033 )
								if( ema3 <= 26.5547 )
									ret := -0.250000
								if( ema3 > 26.5547 )
									ret := -0.916667 // sell
							if( ema2 > 42.9033 )
								if( ema1 <= 43.8433 )
									ret := 0.000000
								if( ema1 > 43.8433 )
									ret := -0.750000 // sell
						if( Raw_Money_Flow > 1.00748e+07 )
							if( Negative_Money_Flow_Sum <= 3.93471e+08 )
								if( tema <= 37.1536 )
									ret := -0.340782
								if( tema > 37.1536 )
									ret := 0.147541
							if( Negative_Money_Flow_Sum > 3.93471e+08 )
								if( Raw_Money_Flow <= 3.242e+07 )
									ret := 0.600000
								if( Raw_Money_Flow > 3.242e+07 )
									ret := 1.000000 // buy
				if( MFI_High > -41.6985 )
					if( Positive_Money_Flow_Sum <= 7.78076e+07 )
						if( Positive_Money_Flow_Sum <= 5.62559e+07 )
							if( Positive_Money_Flow_Sum <= 4.06155e+07 )
								if( ema12 <= -0.103147 )
									ret := -0.154004
								if( ema12 > -0.103147 )
									ret := 0.088674
							if( Positive_Money_Flow_Sum > 4.06155e+07 )
								if( Positive_Money_Flow_Sum <= 4.62903e+07 )
									ret := 0.371841
								if( Positive_Money_Flow_Sum > 4.62903e+07 )
									ret := 0.076655
						if( Positive_Money_Flow_Sum > 5.62559e+07 )
							if( Negative_Money_Flow_Sum <= 1.02897e+08 )
								if( ema2 <= 41.9898 )
									ret := -0.102823
								if( ema2 > 41.9898 )
									ret := -0.686275
							if( Negative_Money_Flow_Sum > 1.02897e+08 )
								if( Positive_Money_Flow <= 1.2111e+07 )
									ret := 0.717949 // buy
								if( Positive_Money_Flow > 1.2111e+07 )
									ret := -0.250000
					if( Positive_Money_Flow_Sum > 7.78076e+07 )
						if( tema <= 27.2327 )
							if( tema <= 19.4831 )
								if( MFI_Low <= 22.8391 )
									ret := 0.785714 // buy
								if( MFI_Low > 22.8391 )
									ret := -0.580645
							if( tema > 19.4831 )
								if( ema13 <= -0.391039 )
									ret := 0.731183 // buy
								if( ema13 > -0.391039 )
									ret := 0.311475
						if( tema > 27.2327 )
							if( MFI_High <= -25.3103 )
								if( tema <= 28.0603 )
									ret := -0.823529 // sell
								if( tema > 28.0603 )
									ret := 0.055777
							if( MFI_High > -25.3103 )
								if( ema1 <= 43.8869 )
									ret := 0.647887
								if( ema1 > 43.8869 )
									ret := -0.142857
		if( Negative_Money_Flow > 713205 )
			if( ema12 <= -0.668775 )
				if( Positive_Money_Flow_Sum <= 3.20129e+07 )
					if( tema <= 18.5774 )
						ret := 1.000000 // buy
					if( tema > 18.5774 )
						if( ema12 <= -1.02555 )
							if( Money_Flow_Ratio <= 0.078385 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.078385 )
								ret := 0.333333
						if( ema12 > -1.02555 )
							if( Negative_Money_Flow <= 1.2616e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.2616e+07 )
								if( Negative_Money_Flow_Sum <= 1.41411e+08 )
									ret := -0.812500 // sell
								if( Negative_Money_Flow_Sum > 1.41411e+08 )
									ret := 0.062500
				if( Positive_Money_Flow_Sum > 3.20129e+07 )
					if( ema13 <= -2.21093 )
						if( ema12 <= -1.39278 )
							if( MFI <= 15.9382 )
								ret := 0.750000 // buy
							if( MFI > 15.9382 )
								ret := 1.000000 // buy
						if( ema12 > -1.39278 )
							if( Money_Flow_Ratio <= 0.295736 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.295736 )
								if( Negative_Money_Flow <= 2.1994e+07 )
									ret := -0.842105 // sell
								if( Negative_Money_Flow > 2.1994e+07 )
									ret := -0.333333
					if( ema13 > -2.21093 )
						if( ema1 <= 19.7011 )
							if( Typical_Price <= 17.261 )
								ret := 1.000000 // buy
							if( Typical_Price > 17.261 )
								ret := -1.000000 // sell
						if( ema1 > 19.7011 )
							if( MFI_High <= -41.8974 )
								if( Negative_Money_Flow_Sum <= 2.86621e+08 )
									ret := 0.703947 // buy
								if( Negative_Money_Flow_Sum > 2.86621e+08 )
									ret := 0.926230 // buy
							if( MFI_High > -41.8974 )
								if( Negative_Money_Flow_Sum <= 2.63051e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.63051e+08 )
									ret := -0.250000
			if( ema12 > -0.668775 )
				if( tema <= 40.0045 )
					if( Raw_Money_Flow <= 7.45687e+06 )
						if( tema <= 17.6211 )
							if( Negative_Money_Flow_Sum <= 7.11875e+07 )
								if( Negative_Money_Flow_Sum <= 3.58075e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.58075e+06 )
									ret := 0.218803
							if( Negative_Money_Flow_Sum > 7.11875e+07 )
								if( Negative_Money_Flow_Sum <= 1.0642e+08 )
									ret := -0.472527
								if( Negative_Money_Flow_Sum > 1.0642e+08 )
									ret := 0.833333 // buy
						if( tema > 17.6211 )
							if( MFI_Low <= -11.2516 )
								if( tema <= 23.2166 )
									ret := -0.600000
								if( tema > 23.2166 )
									ret := -1.000000 // sell
							if( MFI_Low > -11.2516 )
								if( Negative_Money_Flow_Sum <= 1.31971e+08 )
									ret := 0.052931
								if( Negative_Money_Flow_Sum > 1.31971e+08 )
									ret := -0.618182
					if( Raw_Money_Flow > 7.45687e+06 )
						if( Raw_Money_Flow <= 3.49443e+07 )
							if( Positive_Money_Flow_Sum <= 5.41232e+06 )
								if( Raw_Money_Flow <= 1.8703e+07 )
									ret := -0.456522
								if( Raw_Money_Flow > 1.8703e+07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.41232e+06 )
								if( ema13 <= -0.639038 )
									ret := 0.144000
								if( ema13 > -0.639038 )
									ret := 0.323415
						if( Raw_Money_Flow > 3.49443e+07 )
							if( ema13 <= -0.193782 )
								if( ema2 <= 29.9946 )
									ret := 0.300000
								if( ema2 > 29.9946 )
									ret := -0.644444
							if( ema13 > -0.193782 )
								if( Typical_Price <= 32.3197 )
									ret := -0.333333
								if( Typical_Price > 32.3197 )
									ret := 0.923077 // buy
				if( tema > 40.0045 )
					if( MFI_Low <= 20.8325 )
						if( Positive_Money_Flow_Sum <= 2.77776e+07 )
							if( ema3 <= 40.9173 )
								if( Raw_Money_Flow <= 5.84031e+06 )
									ret := 0.166667
								if( Raw_Money_Flow > 5.84031e+06 )
									ret := -1.000000 // sell
							if( ema3 > 40.9173 )
								if( Positive_Money_Flow_Sum <= 2.32661e+07 )
									ret := 0.162162
								if( Positive_Money_Flow_Sum > 2.32661e+07 )
									ret := 0.625000
						if( Positive_Money_Flow_Sum > 2.77776e+07 )
							if( Positive_Money_Flow_Sum <= 3.87284e+07 )
								if( Positive_Money_Flow_Sum <= 3.12297e+07 )
									ret := -0.033333
								if( Positive_Money_Flow_Sum > 3.12297e+07 )
									ret := -0.546875
							if( Positive_Money_Flow_Sum > 3.87284e+07 )
								if( MFI_Low <= 7.4731 )
									ret := -0.461538
								if( MFI_Low > 7.4731 )
									ret := 0.140909
					if( MFI_Low > 20.8325 )
						if( ema12 <= -0.362736 )
							if( Negative_Money_Flow_Sum <= 2.18691e+08 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.18691e+08 )
								ret := 1.000000 // buy
						if( ema12 > -0.362736 )
							if( Negative_Money_Flow_Sum <= 1.24806e+08 )
								if( MFI_Low <= 37.9589 )
									ret := -0.277778
								if( MFI_Low > 37.9589 )
									ret := 0.357143
							if( Negative_Money_Flow_Sum > 1.24806e+08 )
								if( Typical_Price <= 47.1863 )
									ret := -0.862069 // sell
								if( Typical_Price > 47.1863 )
									ret := 0.250000
	if( ema12 > -0.035033 )
		if( Negative_Money_Flow <= 3.91219e+06 )
			if( Negative_Money_Flow_Sum <= 1.17586e+08 )
				if( ema12 <= 0.268441 )
					if( Positive_Money_Flow <= 8.1926e+06 )
						if( Negative_Money_Flow <= 3.14995e+06 )
							if( Positive_Money_Flow_Sum <= 2.74807e+06 )
								if( ema3 <= 6.29577 )
									ret := 0.009218
								if( ema3 > 6.29577 )
									ret := -0.070953
							if( Positive_Money_Flow_Sum > 2.74807e+06 )
								if( Positive_Money_Flow_Sum <= 4.69659e+06 )
									ret := 0.072308
								if( Positive_Money_Flow_Sum > 4.69659e+06 )
									ret := 0.019603
						if( Negative_Money_Flow > 3.14995e+06 )
							if( ema13 <= -0.036356 )
								if( MFI_High <= -41.6214 )
									ret := -0.066667
								if( MFI_High > -41.6214 )
									ret := -0.703704 // sell
							if( ema13 > -0.036356 )
								if( Positive_Money_Flow_Sum <= 1.80894e+07 )
									ret := -0.300613
								if( Positive_Money_Flow_Sum > 1.80894e+07 )
									ret := 0.002597
					if( Positive_Money_Flow > 8.1926e+06 )
						if( MFI <= 67.1392 )
							if( Positive_Money_Flow_Sum <= 3.55528e+07 )
								if( ema2 <= 28.8022 )
									ret := 0.684211
								if( ema2 > 28.8022 )
									ret := -0.100000
							if( Positive_Money_Flow_Sum > 3.55528e+07 )
								if( MFI_Low <= 36.1673 )
									ret := 0.161232
								if( MFI_Low > 36.1673 )
									ret := 0.004673
						if( MFI > 67.1392 )
							if( ema1 <= 26.5887 )
								if( ema12 <= 0.248791 )
									ret := 0.276316
								if( ema12 > 0.248791 )
									ret := -0.448276
							if( ema1 > 26.5887 )
								if( Negative_Money_Flow_Sum <= 2.84135e+07 )
									ret := 0.128205
								if( Negative_Money_Flow_Sum > 2.84135e+07 )
									ret := 0.714286 // buy
				if( ema12 > 0.268441 )
					if( Negative_Money_Flow_Sum <= 5.31746e+07 )
						if( Positive_Money_Flow <= 2.89691e+07 )
							if( Typical_Price <= 11.3571 )
								if( MFI_High <= 5.39462 )
									ret := 0.780488 // buy
								if( MFI_High > 5.39462 )
									ret := -0.642857
							if( Typical_Price > 11.3571 )
								if( ema13 <= 0.934045 )
									ret := -0.035549
								if( ema13 > 0.934045 )
									ret := -0.252941
						if( Positive_Money_Flow > 2.89691e+07 )
							if( ema2 <= 28.814 )
								if( ema12 <= 0.565754 )
									ret := 0.162162
								if( ema12 > 0.565754 )
									ret := -0.791667 // sell
							if( ema2 > 28.814 )
								if( Positive_Money_Flow_Sum <= 8.77672e+07 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 8.77672e+07 )
									ret := 0.590476
					if( Negative_Money_Flow_Sum > 5.31746e+07 )
						if( Negative_Money_Flow_Sum <= 8.60324e+07 )
							if( MFI_Low <= 50.226 )
								if( ema13 <= 1.50971 )
									ret := -0.350806
								if( ema13 > 1.50971 )
									ret := 1.000000 // buy
							if( MFI_Low > 50.226 )
								if( Positive_Money_Flow <= 6.27568e+06 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow > 6.27568e+06 )
									ret := -0.677966
						if( Negative_Money_Flow_Sum > 8.60324e+07 )
							if( ema2 <= 30.7361 )
								if( MFI_High <= -14.2592 )
									ret := 0.803279 // buy
								if( MFI_High > -14.2592 )
									ret := 0.055556
							if( ema2 > 30.7361 )
								if( Positive_Money_Flow <= 1.73561e+07 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow > 1.73561e+07 )
									ret := -0.222222
			if( Negative_Money_Flow_Sum > 1.17586e+08 )
				if( Positive_Money_Flow_Sum <= 3.16033e+08 )
					if( Typical_Price <= 39.2668 )
						if( MFI_High <= -16.418 )
							if( Positive_Money_Flow <= 3.30996e+07 )
								if( Raw_Money_Flow <= 1.25306e+07 )
									ret := -0.412500
								if( Raw_Money_Flow > 1.25306e+07 )
									ret := 0.121495
							if( Positive_Money_Flow > 3.30996e+07 )
								if( Negative_Money_Flow_Sum <= 1.30135e+08 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 1.30135e+08 )
									ret := -1.000000 // sell
						if( MFI_High > -16.418 )
							if( Positive_Money_Flow_Sum <= 2.38605e+08 )
								ret := -0.200000
							if( Positive_Money_Flow_Sum > 2.38605e+08 )
								ret := -1.000000 // sell
					if( Typical_Price > 39.2668 )
						if( Typical_Price <= 51.5593 )
							if( Negative_Money_Flow_Sum <= 1.24316e+08 )
								if( Typical_Price <= 41.3976 )
									ret := -0.625000
								if( Typical_Price > 41.3976 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 1.24316e+08 )
								if( Positive_Money_Flow_Sum <= 1.81664e+08 )
									ret := -0.775000 // sell
								if( Positive_Money_Flow_Sum > 1.81664e+08 )
									ret := -0.950000 // sell
						if( Typical_Price > 51.5593 )
							if( MFI_Low <= 32.6094 )
								ret := -0.250000
							if( MFI_Low > 32.6094 )
								ret := 0.200000
				if( Positive_Money_Flow_Sum > 3.16033e+08 )
					if( ema3 <= 39.0416 )
						if( MFI <= 62.6983 )
							if( Positive_Money_Flow_Sum <= 3.33316e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.33316e+08 )
								ret := -0.666667
						if( MFI > 62.6983 )
							if( Negative_Money_Flow_Sum <= 1.71726e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.71726e+08 )
								ret := -0.500000
					if( ema3 > 39.0416 )
						if( ema2 <= 49.3987 )
							if( Raw_Money_Flow <= 2.71436e+07 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.71436e+07 )
								ret := 0.500000
						if( ema2 > 49.3987 )
							ret := 0.000000
		if( Negative_Money_Flow > 3.91219e+06 )
			if( ema2 <= 43.6542 )
				if( ema3 <= 16.5855 )
					if( MFI_High <= -14.492 )
						if( MFI <= 46.7656 )
							if( Negative_Money_Flow <= 5.24511e+06 )
								if( Negative_Money_Flow <= 4.09877e+06 )
									ret := 0.437500
								if( Negative_Money_Flow > 4.09877e+06 )
									ret := -0.354839
							if( Negative_Money_Flow > 5.24511e+06 )
								if( ema2 <= 9.61971 )
									ret := 0.100000
								if( ema2 > 9.61971 )
									ret := 0.532258
						if( MFI > 46.7656 )
							if( Negative_Money_Flow_Sum <= 1.53604e+07 )
								if( Typical_Price <= 10.4667 )
									ret := 0.391304
								if( Typical_Price > 10.4667 )
									ret := -0.785714 // sell
							if( Negative_Money_Flow_Sum > 1.53604e+07 )
								if( ema13 <= -0.030458 )
									ret := -0.263158
								if( ema13 > -0.030458 )
									ret := 0.505076
					if( MFI_High > -14.492 )
						if( ema12 <= 0.314676 )
							if( Typical_Price <= 8.37119 )
								if( tema <= 8.05849 )
									ret := 0.157895
								if( tema > 8.05849 )
									ret := 0.785714 // buy
							if( Typical_Price > 8.37119 )
								if( Positive_Money_Flow_Sum <= 1.17751e+08 )
									ret := -0.073826
								if( Positive_Money_Flow_Sum > 1.17751e+08 )
									ret := -0.909091 // sell
						if( ema12 > 0.314676 )
							if( MFI_High <= 1.23731 )
								if( MFI_High <= -7.51134 )
									ret := 0.000000
								if( MFI_High > -7.51134 )
									ret := 0.857143 // buy
							if( MFI_High > 1.23731 )
								ret := -0.200000
				if( ema3 > 16.5855 )
					if( MFI <= 79.1821 )
						if( ema12 <= 0.340275 )
							if( Negative_Money_Flow <= 5.44312e+06 )
								if( Positive_Money_Flow_Sum <= 4.06057e+07 )
									ret := 0.194444
								if( Positive_Money_Flow_Sum > 4.06057e+07 )
									ret := -0.127660
							if( Negative_Money_Flow > 5.44312e+06 )
								if( Typical_Price <= 34.45 )
									ret := 0.222698
								if( Typical_Price > 34.45 )
									ret := 0.064560
						if( ema12 > 0.340275 )
							if( Money_Flow_Ratio <= 1.74646 )
								if( ema2 <= 22.8574 )
									ret := 0.450000
								if( ema2 > 22.8574 )
									ret := -0.342541
							if( Money_Flow_Ratio > 1.74646 )
								if( Money_Flow_Ratio <= 2.67756 )
									ret := 0.175214
								if( Money_Flow_Ratio > 2.67756 )
									ret := -0.129630
					if( MFI > 79.1821 )
						if( Money_Flow_Ratio <= 5.83037 )
							if( ema2 <= 22.9678 )
								if( Negative_Money_Flow <= 5.17369e+06 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow > 5.17369e+06 )
									ret := -0.529412
							if( ema2 > 22.9678 )
								if( Raw_Money_Flow <= 5.41676e+06 )
									ret := 0.230769
								if( Raw_Money_Flow > 5.41676e+06 )
									ret := 0.767241 // buy
						if( Money_Flow_Ratio > 5.83037 )
							if( ema12 <= 0.27115 )
								ret := 1.000000 // buy
							if( ema12 > 0.27115 )
								if( ema12 <= 1.59534 )
									ret := -0.369565
								if( ema12 > 1.59534 )
									ret := 1.000000 // buy
			if( ema2 > 43.6542 )
				if( Positive_Money_Flow_Sum <= 3.50853e+08 )
					if( MFI <= 67.0044 )
						if( ema1 <= 49.5666 )
							if( Raw_Money_Flow <= 9.18176e+06 )
								if( ema12 <= 0.000467 )
									ret := -0.714286 // sell
								if( ema12 > 0.000467 )
									ret := 0.019231
							if( Raw_Money_Flow > 9.18176e+06 )
								if( Negative_Money_Flow <= 1.22046e+07 )
									ret := -0.909091 // sell
								if( Negative_Money_Flow > 1.22046e+07 )
									ret := -0.352941
						if( ema1 > 49.5666 )
							if( ema3 <= 50.9863 )
								if( Raw_Money_Flow <= 1.87806e+07 )
									ret := 0.625000
								if( Raw_Money_Flow > 1.87806e+07 )
									ret := 1.000000 // buy
							if( ema3 > 50.9863 )
								if( Positive_Money_Flow_Sum <= 4.89972e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 4.89972e+07 )
									ret := -0.176471
					if( MFI > 67.0044 )
						if( MFI <= 71.8622 )
							if( Negative_Money_Flow_Sum <= 2.6315e+07 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 2.6315e+07 )
								if( tema <= 45.4436 )
									ret := -0.500000
								if( tema > 45.4436 )
									ret := -0.971429 // sell
						if( MFI > 71.8622 )
							if( ema13 <= 1.42464 )
								if( Positive_Money_Flow_Sum <= 1.23594e+08 )
									ret := -0.428571
								if( Positive_Money_Flow_Sum > 1.23594e+08 )
									ret := 0.090909
							if( ema13 > 1.42464 )
								ret := -0.750000 // sell
				if( Positive_Money_Flow_Sum > 3.50853e+08 )
					if( Negative_Money_Flow_Sum <= 1.2366e+08 )
						ret := 0.500000
					if( Negative_Money_Flow_Sum > 1.2366e+08 )
						ret := 1.000000 // buy
	
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_DOTUSDT_30Min_68271cd3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


