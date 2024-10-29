//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: BABA_30Min_2MT0_5f69c48a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_2MT0_5f69c48a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_5f69c48a(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 8.16341e+08 )
		if( ema1 <= 190.499 )
			if( Negative_Money_Flow <= 2.10526e+08 )
				if( Positive_Money_Flow_Sum <= 1.15006e+07 )
					if( ema3 <= 66.7145 )
						if( Raw_Money_Flow <= 289765 )
							if( Raw_Money_Flow <= 102473 )
								ret := 0.000000
							if( Raw_Money_Flow > 102473 )
								ret := -0.800000 // sell
						if( Raw_Money_Flow > 289765 )
							if( Positive_Money_Flow_Sum <= 5.13657e+06 )
								if( ema12 <= 0.078334 )
									ret := 0.902439 // buy
								if( ema12 > 0.078334 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 5.13657e+06 )
								ret := 0.000000
					if( ema3 > 66.7145 )
						if( ema12 <= -0.685494 )
							if( MFI <= 0.297061 )
								ret := -1.000000 // sell
							if( MFI > 0.297061 )
								if( ema3 <= 93.7292 )
									ret := 0.627451
								if( ema3 > 93.7292 )
									ret := 0.198864
						if( ema12 > -0.685494 )
							if( Negative_Money_Flow_Sum <= 6.62901e+06 )
								if( ema13 <= -0.24275 )
									ret := -0.198198
								if( ema13 > -0.24275 )
									ret := 0.131346
							if( Negative_Money_Flow_Sum > 6.62901e+06 )
								if( MFI_Low <= -15.147 )
									ret := 0.028678
								if( MFI_Low > -15.147 )
									ret := -0.109534
				if( Positive_Money_Flow_Sum > 1.15006e+07 )
					if( Raw_Money_Flow <= 2.14698e+07 )
						if( Negative_Money_Flow <= 107.067 )
							if( Positive_Money_Flow_Sum <= 5.73487e+07 )
								if( ema13 <= 0.427128 )
									ret := 0.066024
								if( ema13 > 0.427128 )
									ret := 0.205479
							if( Positive_Money_Flow_Sum > 5.73487e+07 )
								if( Negative_Money_Flow_Sum <= 3.38246e+08 )
									ret := -0.015401
								if( Negative_Money_Flow_Sum > 3.38246e+08 )
									ret := 0.065486
						if( Negative_Money_Flow > 107.067 )
							if( MFI_High <= 7.88897 )
								if( Negative_Money_Flow_Sum <= 1.72305e+08 )
									ret := 0.186082
								if( Negative_Money_Flow_Sum > 1.72305e+08 )
									ret := 0.097612
							if( MFI_High > 7.88897 )
								if( Positive_Money_Flow_Sum <= 2.77158e+09 )
									ret := 0.004648
								if( Positive_Money_Flow_Sum > 2.77158e+09 )
									ret := -0.619048
					if( Raw_Money_Flow > 2.14698e+07 )
						if( MFI <= 96.6903 )
							if( MFI <= 4.54685 )
								if( Negative_Money_Flow_Sum <= 5.59729e+08 )
									ret := -0.621359
								if( Negative_Money_Flow_Sum > 5.59729e+08 )
									ret := 0.058824
							if( MFI > 4.54685 )
								if( ema12 <= -1.11676 )
									ret := -0.384058
								if( ema12 > -1.11676 )
									ret := 0.022273
						if( MFI > 96.6903 )
							if( Raw_Money_Flow <= 1.17966e+09 )
								if( Positive_Money_Flow_Sum <= 9.63363e+08 )
									ret := 0.080799
								if( Positive_Money_Flow_Sum > 9.63363e+08 )
									ret := 0.268839
							if( Raw_Money_Flow > 1.17966e+09 )
								if( ema3 <= 151.813 )
									ret := 0.000000
								if( ema3 > 151.813 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow > 2.10526e+08 )
				if( Raw_Money_Flow <= 5.25699e+08 )
					if( MFI <= 10.4658 )
						if( Negative_Money_Flow <= 4.23188e+08 )
							if( Negative_Money_Flow <= 3.48129e+08 )
								if( Negative_Money_Flow_Sum <= 6.30085e+08 )
									ret := -0.208092
								if( Negative_Money_Flow_Sum > 6.30085e+08 )
									ret := -0.471545
							if( Negative_Money_Flow > 3.48129e+08 )
								if( ema13 <= -0.696725 )
									ret := 1.000000 // buy
								if( ema13 > -0.696725 )
									ret := -0.040323
						if( Negative_Money_Flow > 4.23188e+08 )
							if( Negative_Money_Flow <= 4.68991e+08 )
								if( MFI_High <= -79.1041 )
									ret := -0.200000
								if( MFI_High > -79.1041 )
									ret := -0.837838 // sell
							if( Negative_Money_Flow > 4.68991e+08 )
								if( Negative_Money_Flow <= 4.79741e+08 )
									ret := 0.625000
								if( Negative_Money_Flow > 4.79741e+08 )
									ret := -0.608696
					if( MFI > 10.4658 )
						if( ema12 <= 0.541907 )
							if( MFI <= 80.3636 )
								if( Raw_Money_Flow <= 3.04872e+08 )
									ret := 0.074890
								if( Raw_Money_Flow > 3.04872e+08 )
									ret := 0.325203
							if( MFI > 80.3636 )
								if( ema1 <= 160.537 )
									ret := -1.000000 // sell
								if( ema1 > 160.537 )
									ret := -0.200000
						if( ema12 > 0.541907 )
							if( MFI <= 67.527 )
								if( Negative_Money_Flow_Sum <= 4.61742e+08 )
									ret := -0.942857 // sell
								if( Negative_Money_Flow_Sum > 4.61742e+08 )
									ret := -0.227273
							if( MFI > 67.527 )
								if( ema13 <= 0.9425 )
									ret := -0.714286 // sell
								if( ema13 > 0.9425 )
									ret := -0.039370
				if( Raw_Money_Flow > 5.25699e+08 )
					if( Negative_Money_Flow_Sum <= 5.83146e+08 )
						if( ema2 <= 178.013 )
							if( Negative_Money_Flow <= 5.34019e+08 )
								if( Raw_Money_Flow <= 5.30674e+08 )
									ret := 0.888889 // buy
								if( Raw_Money_Flow > 5.30674e+08 )
									ret := 0.200000
							if( Negative_Money_Flow > 5.34019e+08 )
								if( Negative_Money_Flow_Sum <= 5.60997e+08 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 5.60997e+08 )
									ret := 1.000000 // buy
						if( ema2 > 178.013 )
							if( Negative_Money_Flow_Sum <= 5.60224e+08 )
								ret := -0.142857
							if( Negative_Money_Flow_Sum > 5.60224e+08 )
								ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 5.83146e+08 )
						if( Raw_Money_Flow <= 6.5709e+08 )
							if( Raw_Money_Flow <= 5.97961e+08 )
								if( Positive_Money_Flow_Sum <= 3.55326e+07 )
									ret := -0.514286
								if( Positive_Money_Flow_Sum > 3.55326e+07 )
									ret := 0.068966
							if( Raw_Money_Flow > 5.97961e+08 )
								if( ema12 <= 0.051452 )
									ret := 0.708333 // buy
								if( ema12 > 0.051452 )
									ret := -0.642857
						if( Raw_Money_Flow > 6.5709e+08 )
							if( Negative_Money_Flow <= 7.39317e+08 )
								if( MFI_High <= -67.9847 )
									ret := -0.571429
								if( MFI_High > -67.9847 )
									ret := 0.400000
							if( Negative_Money_Flow > 7.39317e+08 )
								if( ema12 <= -0.121563 )
									ret := -0.272727
								if( ema12 > -0.121563 )
									ret := 0.916667 // buy
		if( ema1 > 190.499 )
			if( Raw_Money_Flow <= 663605 )
				if( ema12 <= 0.002194 )
					if( Money_Flow_Ratio <= 15.6496 )
						if( ema13 <= -1.09011 )
							if( ema12 <= -0.686326 )
								if( ema12 <= -0.825064 )
									ret := -0.642857
								if( ema12 > -0.825064 )
									ret := 0.000000
							if( ema12 > -0.686326 )
								if( ema13 <= -1.1985 )
									ret := -1.000000 // sell
								if( ema13 > -1.1985 )
									ret := -0.750000 // sell
						if( ema13 > -1.09011 )
							if( ema12 <= -0.015909 )
								if( Negative_Money_Flow_Sum <= 7.03331e+08 )
									ret := 0.036585
								if( Negative_Money_Flow_Sum > 7.03331e+08 )
									ret := -0.304348
							if( ema12 > -0.015909 )
								if( MFI_High <= -12.3558 )
									ret := -0.769231 // sell
								if( MFI_High > -12.3558 )
									ret := -0.111111
					if( Money_Flow_Ratio > 15.6496 )
						if( Negative_Money_Flow <= 41022.6 )
							if( ema13 <= -0.449853 )
								if( ema1 <= 215.159 )
									ret := 0.250000
								if( ema1 > 215.159 )
									ret := 0.000000
							if( ema13 > -0.449853 )
								if( ema12 <= -0.103335 )
									ret := -0.750000 // sell
								if( ema12 > -0.103335 )
									ret := 0.000000
						if( Negative_Money_Flow > 41022.6 )
							if( Negative_Money_Flow <= 271885 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 271885 )
								if( Money_Flow_Ratio <= 61.5386 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 61.5386 )
									ret := 0.100000
				if( ema12 > 0.002194 )
					if( Negative_Money_Flow_Sum <= 5.49813e+08 )
						if( Typical_Price <= 197.464 )
							if( MFI <= 79.2865 )
								if( ema2 <= 196.199 )
									ret := 0.036364
								if( ema2 > 196.199 )
									ret := 0.625000
							if( MFI > 79.2865 )
								if( MFI_Low <= 60.6714 )
									ret := 1.000000 // buy
								if( MFI_Low > 60.6714 )
									ret := 0.405405
						if( Typical_Price > 197.464 )
							if( ema13 <= -0.075179 )
								if( ema12 <= 0.032421 )
									ret := 0.000000
								if( ema12 > 0.032421 )
									ret := -0.750000 // sell
							if( ema13 > -0.075179 )
								if( Money_Flow_Ratio <= 12.0496 )
									ret := 0.043771
								if( Money_Flow_Ratio > 12.0496 )
									ret := -0.196970
					if( Negative_Money_Flow_Sum > 5.49813e+08 )
						if( ema13 <= 1.02372 )
							if( Positive_Money_Flow_Sum <= 2.48854e+09 )
								if( Positive_Money_Flow <= 120006 )
									ret := -0.013333
								if( Positive_Money_Flow > 120006 )
									ret := 0.287671
							if( Positive_Money_Flow_Sum > 2.48854e+09 )
								ret := 1.000000 // buy
						if( ema13 > 1.02372 )
							if( Money_Flow_Ratio <= 0.666341 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.666341 )
								if( Positive_Money_Flow_Sum <= 1.11244e+09 )
									ret := 0.843750 // buy
								if( Positive_Money_Flow_Sum > 1.11244e+09 )
									ret := 0.333333
			if( Raw_Money_Flow > 663605 )
				if( Negative_Money_Flow_Sum <= 6.36778e+08 )
					if( Raw_Money_Flow <= 2.86963e+08 )
						if( ema3 <= 228.21 )
							if( Money_Flow_Ratio <= 4.9161 )
								if( ema13 <= -0.90002 )
									ret := -0.195599
								if( ema13 > -0.90002 )
									ret := 0.018029
							if( Money_Flow_Ratio > 4.9161 )
								if( tema <= 189.985 )
									ret := 1.000000 // buy
								if( tema > 189.985 )
									ret := -0.174151
						if( ema3 > 228.21 )
							if( ema13 <= 4.1311 )
								if( Positive_Money_Flow <= 1.87304e+07 )
									ret := -0.134328
								if( Positive_Money_Flow > 1.87304e+07 )
									ret := -0.293814
							if( ema13 > 4.1311 )
								if( Raw_Money_Flow <= 9.69865e+07 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 9.69865e+07 )
									ret := -0.111111
					if( Raw_Money_Flow > 2.86963e+08 )
						if( Typical_Price <= 219.5 )
							if( Raw_Money_Flow <= 2.9166e+08 )
								if( Money_Flow_Ratio <= 2.98246 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 2.98246 )
									ret := 0.500000
							if( Raw_Money_Flow > 2.9166e+08 )
								if( Negative_Money_Flow_Sum <= 5.06507e+06 )
									ret := 0.521739
								if( Negative_Money_Flow_Sum > 5.06507e+06 )
									ret := -0.179104
						if( Typical_Price > 219.5 )
							if( ema12 <= 0.88298 )
								if( ema2 <= 308.581 )
									ret := 0.073359
								if( ema2 > 308.581 )
									ret := -0.857143 // sell
							if( ema12 > 0.88298 )
								if( ema13 <= 1.30691 )
									ret := -0.750000 // sell
								if( ema13 > 1.30691 )
									ret := 0.513043
				if( Negative_Money_Flow_Sum > 6.36778e+08 )
					if( Positive_Money_Flow_Sum <= 2.33266e+09 )
						if( Positive_Money_Flow_Sum <= 7.87822e+06 )
							if( MFI <= 0.345016 )
								ret := 0.250000
							if( MFI > 0.345016 )
								if( ema13 <= -1.22097 )
									ret := -1.000000 // sell
								if( ema13 > -1.22097 )
									ret := -0.500000
						if( Positive_Money_Flow_Sum > 7.87822e+06 )
							if( Positive_Money_Flow_Sum <= 1.36074e+07 )
								if( tema <= 203.241 )
									ret := 0.125000
								if( tema > 203.241 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 1.36074e+07 )
								if( Typical_Price <= 222.933 )
									ret := -0.008143
								if( Typical_Price > 222.933 )
									ret := 0.152672
					if( Positive_Money_Flow_Sum > 2.33266e+09 )
						if( Negative_Money_Flow_Sum <= 7.05201e+08 )
							if( Negative_Money_Flow_Sum <= 6.45741e+08 )
								ret := 0.600000
							if( Negative_Money_Flow_Sum > 6.45741e+08 )
								if( Typical_Price <= 216.867 )
									ret := -0.444444
								if( Typical_Price > 216.867 )
									ret := 0.142857
						if( Negative_Money_Flow_Sum > 7.05201e+08 )
							if( tema <= 254.456 )
								if( Money_Flow_Ratio <= 4.23897 )
									ret := -0.920000 // sell
								if( Money_Flow_Ratio > 4.23897 )
									ret := -0.666667
							if( tema > 254.456 )
								ret := -0.285714
	if( Negative_Money_Flow_Sum > 8.16341e+08 )
		if( ema12 <= -1.87345 )
			if( MFI_High <= -52.0926 )
				if( ema13 <= -2.71144 )
					if( Negative_Money_Flow_Sum <= 4.15671e+09 )
						if( Positive_Money_Flow <= 2.0438e+08 )
							if( Typical_Price <= 176.205 )
								if( ema12 <= -1.94273 )
									ret := 0.689189
								if( ema12 > -1.94273 )
									ret := 0.200000
							if( Typical_Price > 176.205 )
								if( Raw_Money_Flow <= 3.90619e+08 )
									ret := 0.313559
								if( Raw_Money_Flow > 3.90619e+08 )
									ret := -0.275000
						if( Positive_Money_Flow > 2.0438e+08 )
							if( Positive_Money_Flow_Sum <= 8.71702e+08 )
								if( Positive_Money_Flow_Sum <= 7.60872e+08 )
									ret := -0.206897
								if( Positive_Money_Flow_Sum > 7.60872e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.71702e+08 )
								if( Raw_Money_Flow <= 5.1582e+08 )
									ret := -0.444444
								if( Raw_Money_Flow > 5.1582e+08 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 4.15671e+09 )
						if( MFI <= 22.6287 )
							if( Money_Flow_Ratio <= 0.011264 )
								ret := 0.500000
							if( Money_Flow_Ratio > 0.011264 )
								if( Negative_Money_Flow_Sum <= 6.3724e+09 )
									ret := 0.880952 // buy
								if( Negative_Money_Flow_Sum > 6.3724e+09 )
									ret := 1.000000 // buy
						if( MFI > 22.6287 )
							if( Positive_Money_Flow <= 3.92243e+08 )
								if( ema3 <= 179.932 )
									ret := 0.571429
								if( ema3 > 179.932 )
									ret := 0.000000
							if( Positive_Money_Flow > 3.92243e+08 )
								if( ema13 <= -4.39061 )
									ret := 0.750000 // buy
								if( ema13 > -4.39061 )
									ret := 1.000000 // buy
				if( ema13 > -2.71144 )
					if( Typical_Price <= 257.96 )
						ret := 1.000000 // buy
					if( Typical_Price > 257.96 )
						ret := 0.750000 // buy
			if( MFI_High > -52.0926 )
				if( ema13 <= -5.17332 )
					if( MFI <= 40.5091 )
						if( Raw_Money_Flow <= 3.80152e+08 )
							if( tema <= 221.998 )
								ret := -1.000000 // sell
							if( tema > 221.998 )
								ret := -0.750000 // sell
						if( Raw_Money_Flow > 3.80152e+08 )
							if( Negative_Money_Flow_Sum <= 7.76988e+09 )
								if( MFI_High <= -48.6441 )
									ret := -0.500000
								if( MFI_High > -48.6441 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.76988e+09 )
								ret := 0.000000
					if( MFI > 40.5091 )
						if( ema13 <= -5.60993 )
							ret := 0.400000
						if( ema13 > -5.60993 )
							ret := -0.750000 // sell
				if( ema13 > -5.17332 )
					if( MFI_High <= -45.5238 )
						if( Positive_Money_Flow <= 3.63872e+08 )
							if( ema13 <= -3.33939 )
								if( Raw_Money_Flow <= 3.19908e+08 )
									ret := -0.636364
								if( Raw_Money_Flow > 3.19908e+08 )
									ret := 0.000000
							if( ema13 > -3.33939 )
								ret := 0.000000
						if( Positive_Money_Flow > 3.63872e+08 )
							ret := 0.571429
					if( MFI_High > -45.5238 )
						if( Positive_Money_Flow_Sum <= 1.12205e+09 )
							if( ema13 <= -3.03539 )
								ret := 1.000000 // buy
							if( ema13 > -3.03539 )
								ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.12205e+09 )
							if( ema1 <= 239.596 )
								if( Positive_Money_Flow_Sum <= 3.12845e+09 )
									ret := -0.294118
								if( Positive_Money_Flow_Sum > 3.12845e+09 )
									ret := 0.400000
							if( ema1 > 239.596 )
								if( Money_Flow_Ratio <= 0.930343 )
									ret := 0.428571
								if( Money_Flow_Ratio > 0.930343 )
									ret := 1.000000 // buy
		if( ema12 > -1.87345 )
			if( Raw_Money_Flow <= 1.9411e+08 )
				if( MFI <= 59.4681 )
					if( tema <= 68.3298 )
						if( ema3 <= 69.716 )
							if( ema12 <= -0.411487 )
								if( Negative_Money_Flow <= 1.08222e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.08222e+06 )
									ret := 0.500000
							if( ema12 > -0.411487 )
								if( ema13 <= -0.108852 )
									ret := -0.285714
								if( ema13 > -0.108852 )
									ret := -0.812500 // sell
						if( ema3 > 69.716 )
							ret := -1.000000 // sell
					if( tema > 68.3298 )
						if( ema12 <= 0.905511 )
							if( ema1 <= 192.375 )
								if( ema12 <= -0.706205 )
									ret := 0.145524
								if( ema12 > -0.706205 )
									ret := 0.061952
							if( ema1 > 192.375 )
								if( ema13 <= -3.45374 )
									ret := -0.733333 // sell
								if( ema13 > -3.45374 )
									ret := 0.157822
						if( ema12 > 0.905511 )
							if( MFI_Low <= 34.2359 )
								if( Positive_Money_Flow_Sum <= 1.39888e+09 )
									ret := -0.175258
								if( Positive_Money_Flow_Sum > 1.39888e+09 )
									ret := -0.666667
							if( MFI_Low > 34.2359 )
								if( Negative_Money_Flow_Sum <= 1.65028e+09 )
									ret := -0.343750
								if( Negative_Money_Flow_Sum > 1.65028e+09 )
									ret := 0.875000 // buy
				if( MFI > 59.4681 )
					if( Positive_Money_Flow_Sum <= 4.35704e+09 )
						if( Typical_Price <= 213.208 )
							if( Money_Flow_Ratio <= 3.09571 )
								if( MFI <= 64.6625 )
									ret := 0.247140
								if( MFI > 64.6625 )
									ret := 0.448203
							if( Money_Flow_Ratio > 3.09571 )
								if( ema12 <= 1.05581 )
									ret := -0.465116
								if( ema12 > 1.05581 )
									ret := 0.625000
						if( Typical_Price > 213.208 )
							if( Negative_Money_Flow_Sum <= 1.15143e+09 )
								if( MFI <= 61.917 )
									ret := 0.342857
								if( MFI > 61.917 )
									ret := -0.210526
							if( Negative_Money_Flow_Sum > 1.15143e+09 )
								if( Positive_Money_Flow <= 222157 )
									ret := 0.666667
								if( Positive_Money_Flow > 222157 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 4.35704e+09 )
						if( Typical_Price <= 141.57 )
							if( ema13 <= 2.98892 )
								if( Positive_Money_Flow <= 6.06412e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 6.06412e+07 )
									ret := 1.000000 // buy
							if( ema13 > 2.98892 )
								if( ema2 <= 114.071 )
									ret := -0.900000 // sell
								if( ema2 > 114.071 )
									ret := -0.250000
						if( Typical_Price > 141.57 )
							if( ema13 <= 0.648197 )
								if( Positive_Money_Flow_Sum <= 7.42271e+09 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 7.42271e+09 )
									ret := 1.000000 // buy
							if( ema13 > 0.648197 )
								if( Positive_Money_Flow <= 1.11225e+08 )
									ret := 0.941176 // buy
								if( Positive_Money_Flow > 1.11225e+08 )
									ret := 0.333333
			if( Raw_Money_Flow > 1.9411e+08 )
				if( Positive_Money_Flow <= 6.4691e+08 )
					if( Negative_Money_Flow <= 4.36743e+08 )
						if( Negative_Money_Flow_Sum <= 2.21341e+09 )
							if( Negative_Money_Flow_Sum <= 1.78897e+09 )
								if( ema13 <= -2.52974 )
									ret := -0.434211
								if( ema13 > -2.52974 )
									ret := -0.004892
							if( Negative_Money_Flow_Sum > 1.78897e+09 )
								if( MFI_Low <= 39.6717 )
									ret := 0.222527
								if( MFI_Low > 39.6717 )
									ret := -0.462687
						if( Negative_Money_Flow_Sum > 2.21341e+09 )
							if( Money_Flow_Ratio <= 0.807872 )
								if( Positive_Money_Flow_Sum <= 2.62514e+09 )
									ret := -0.082969
								if( Positive_Money_Flow_Sum > 2.62514e+09 )
									ret := 0.562500
							if( Money_Flow_Ratio > 0.807872 )
								if( Positive_Money_Flow_Sum <= 5.03833e+09 )
									ret := -0.496454
								if( Positive_Money_Flow_Sum > 5.03833e+09 )
									ret := 0.208333
					if( Negative_Money_Flow > 4.36743e+08 )
						if( Negative_Money_Flow_Sum <= 1.29569e+09 )
							if( MFI <= 13.8659 )
								if( ema1 <= 210.035 )
									ret := 0.643617
								if( ema1 > 210.035 )
									ret := 0.175824
							if( MFI > 13.8659 )
								if( ema13 <= 1.0069 )
									ret := 0.215686
								if( ema13 > 1.0069 )
									ret := -0.263158
						if( Negative_Money_Flow_Sum > 1.29569e+09 )
							if( ema12 <= -1.33872 )
								if( MFI <= 1.15401 )
									ret := -0.235294
								if( MFI > 1.15401 )
									ret := 0.398058
							if( ema12 > -1.33872 )
								if( Negative_Money_Flow_Sum <= 1.60056e+09 )
									ret := -0.310606
								if( Negative_Money_Flow_Sum > 1.60056e+09 )
									ret := 0.062370
				if( Positive_Money_Flow > 6.4691e+08 )
					if( Raw_Money_Flow <= 1.08029e+09 )
						if( ema12 <= 0.325548 )
							if( MFI <= 34.6294 )
								if( Typical_Price <= 251.883 )
									ret := 0.807692 // buy
								if( Typical_Price > 251.883 )
									ret := 0.000000
							if( MFI > 34.6294 )
								if( Positive_Money_Flow <= 8.31121e+08 )
									ret := -0.122449
								if( Positive_Money_Flow > 8.31121e+08 )
									ret := 0.526316
						if( ema12 > 0.325548 )
							if( ema3 <= 111.581 )
								if( ema13 <= 4.01969 )
									ret := 0.800000 // buy
								if( ema13 > 4.01969 )
									ret := 1.000000 // buy
							if( ema3 > 111.581 )
								if( Positive_Money_Flow_Sum <= 2.16465e+09 )
									ret := 0.928571 // buy
								if( Positive_Money_Flow_Sum > 2.16465e+09 )
									ret := 0.309091
					if( Raw_Money_Flow > 1.08029e+09 )
						if( tema <= 125.779 )
							ret := -0.750000 // sell
						if( tema > 125.779 )
							if( ema13 <= -1.37604 )
								ret := -0.571429
							if( ema13 > -1.37604 )
								if( Positive_Money_Flow <= 1.10991e+09 )
									ret := -0.500000
								if( Positive_Money_Flow > 1.10991e+09 )
									ret := 0.166667
	
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
float op_operation = decision_tree_0_BABA_30Min_5f69c48a(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


