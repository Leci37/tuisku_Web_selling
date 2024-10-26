//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: TWLO_15Min_2BM0_25fe8bf9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2BM0_25fe8bf9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_25fe8bf9(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( Raw_Money_Flow <= 468136 )
			if( Positive_Money_Flow <= 30380.6 )
				if( bbp <= -0.385005 )
					if( Negative_Money_Flow_Sum <= 8.09505e+07 )
						if( Positive_Money_Flow_Sum <= 4.48562e+07 )
							if( Negative_Money_Flow_Sum <= 1.87608e+07 )
								if( Raw_Money_Flow <= 75629.4 )
									ret := 0.358604
								if( Raw_Money_Flow > 75629.4 )
									ret := 0.210685
							if( Negative_Money_Flow_Sum > 1.87608e+07 )
								if( bearPower <= -0.295653 )
									ret := 0.448899
								if( bearPower > -0.295653 )
									ret := 0.205357
						if( Positive_Money_Flow_Sum > 4.48562e+07 )
							if( bearPower <= -2.75493 )
								if( Positive_Money_Flow_Sum <= 1.56162e+08 )
									ret := -0.440000
								if( Positive_Money_Flow_Sum > 1.56162e+08 )
									ret := 0.500000
							if( bearPower > -2.75493 )
								if( Typical_Price <= 119.752 )
									ret := 0.156250
								if( Typical_Price > 119.752 )
									ret := 0.356481
					if( Negative_Money_Flow_Sum > 8.09505e+07 )
						if( bbm <= 0.001554 )
							if( Typical_Price <= 375.3 )
								if( bullPower <= -1.75432 )
									ret := 0.339623
								if( bullPower > -1.75432 )
									ret := 0.088855
							if( Typical_Price > 375.3 )
								if( Positive_Money_Flow_Sum <= 6.77931e+07 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 6.77931e+07 )
									ret := -0.071429
						if( bbm > 0.001554 )
							if( MFI <= 2.19724 )
								if( Positive_Money_Flow <= 6013.81 )
									ret := -0.277778
								if( Positive_Money_Flow > 6013.81 )
									ret := 0.666667
							if( MFI > 2.19724 )
								if( Typical_Price <= 292.695 )
									ret := 0.253482
								if( Typical_Price > 292.695 )
									ret := 0.540984
				if( bbp > -0.385005 )
					if( bullPower <= 0.553171 )
						if( Positive_Money_Flow_Sum <= 632310 )
							if( Negative_Money_Flow_Sum <= 3.24522e+07 )
								if( Negative_Money_Flow_Sum <= 987304 )
									ret := -0.007177
								if( Negative_Money_Flow_Sum > 987304 )
									ret := -0.401274
							if( Negative_Money_Flow_Sum > 3.24522e+07 )
								if( Positive_Money_Flow_Sum <= 212199 )
									ret := 0.717391 // buy
								if( Positive_Money_Flow_Sum > 212199 )
									ret := 0.157143
						if( Positive_Money_Flow_Sum > 632310 )
							if( MFI <= 5.26246 )
								if( bbm <= 0.394764 )
									ret := 0.716049 // buy
								if( bbm > 0.394764 )
									ret := 0.062500
							if( MFI > 5.26246 )
								if( MFI <= 37.7643 )
									ret := 0.079605
								if( MFI > 37.7643 )
									ret := 0.208990
					if( bullPower > 0.553171 )
						if( bbp <= -0.137761 )
							if( MFI_Low <= 25.506 )
								if( Negative_Money_Flow_Sum <= 8.51082e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 8.51082e+07 )
									ret := -1.000000 // sell
							if( MFI_Low > 25.506 )
								ret := 0.750000 // buy
						if( bbp > -0.137761 )
							if( MFI_High <= 14.7041 )
								if( bearPower <= 2.57127 )
									ret := 0.548276
								if( bearPower > 2.57127 )
									ret := -0.333333
							if( MFI_High > 14.7041 )
								if( Positive_Money_Flow_Sum <= 1.9745e+08 )
									ret := 0.454545
								if( Positive_Money_Flow_Sum > 1.9745e+08 )
									ret := -1.000000 // sell
			if( Positive_Money_Flow > 30380.6 )
				if( Negative_Money_Flow <= 17.1298 )
					if( bbm <= 1.05631 )
						if( Positive_Money_Flow_Sum <= 2.07601e+08 )
							if( Positive_Money_Flow_Sum <= 1.37908e+08 )
								if( Typical_Price <= 40.0062 )
									ret := 0.219424
								if( Typical_Price > 40.0062 )
									ret := -0.004874
							if( Positive_Money_Flow_Sum > 1.37908e+08 )
								if( Typical_Price <= 167.28 )
									ret := 0.028571
								if( Typical_Price > 167.28 )
									ret := 0.500000
						if( Positive_Money_Flow_Sum > 2.07601e+08 )
							if( Typical_Price <= 194.199 )
								if( Money_Flow_Ratio <= 5.39987 )
									ret := 0.000000
								if( Money_Flow_Ratio > 5.39987 )
									ret := 0.750000 // buy
							if( Typical_Price > 194.199 )
								if( bearPower <= -0.718729 )
									ret := -0.194444
								if( bearPower > -0.718729 )
									ret := -0.742857 // sell
					if( bbm > 1.05631 )
						if( MFI_High <= -14.7581 )
							if( Negative_Money_Flow_Sum <= 1.88376e+08 )
								if( Positive_Money_Flow_Sum <= 618805 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 618805 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.88376e+08 )
								if( MFI <= 16.3026 )
									ret := -0.500000
								if( MFI > 16.3026 )
									ret := 0.200000
						if( MFI_High > -14.7581 )
							if( MFI_High <= -9.83447 )
								ret := 1.000000 // buy
							if( MFI_High > -9.83447 )
								if( bullPower <= -0.053741 )
									ret := 0.500000
								if( bullPower > -0.053741 )
									ret := -0.437500
				if( Negative_Money_Flow > 17.1298 )
					if( MFI_High <= -18.9703 )
						if( Negative_Money_Flow_Sum <= 2.44376e+07 )
							if( Negative_Money_Flow <= 16682.3 )
								if( bbp <= -0.789945 )
									ret := 0.785714 // buy
								if( bbp > -0.789945 )
									ret := -0.027027
							if( Negative_Money_Flow > 16682.3 )
								if( Negative_Money_Flow_Sum <= 1.78422e+06 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.78422e+06 )
									ret := -0.396552
						if( Negative_Money_Flow_Sum > 2.44376e+07 )
							if( Typical_Price <= 209.609 )
								if( Money_Flow_Ratio <= 0.392477 )
									ret := 0.395522
								if( Money_Flow_Ratio > 0.392477 )
									ret := 0.154185
							if( Typical_Price > 209.609 )
								if( MFI <= 47.4576 )
									ret := -0.141509
								if( MFI > 47.4576 )
									ret := 0.491525
					if( MFI_High > -18.9703 )
						if( bearPower <= 0.170658 )
							if( MFI_Low <= 44.2375 )
								ret := 1.000000 // buy
							if( MFI_Low > 44.2375 )
								if( Money_Flow_Ratio <= 1.84754 )
									ret := -0.600000
								if( Money_Flow_Ratio > 1.84754 )
									ret := 0.398876
						if( bearPower > 0.170658 )
							if( Money_Flow_Ratio <= 4.02759 )
								if( Negative_Money_Flow_Sum <= 7.69537e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 7.69537e+07 )
									ret := -0.714286 // sell
							if( Money_Flow_Ratio > 4.02759 )
								if( bbp <= 2.9012 )
									ret := -0.062500
								if( bbp > 2.9012 )
									ret := -1.000000 // sell
		if( Raw_Money_Flow > 468136 )
			if( Negative_Money_Flow_Sum <= 1.13298e+07 )
				if( Typical_Price <= 225.999 )
					if( MFI_High <= -21.6704 )
						if( bbp <= -0.765156 )
							if( Positive_Money_Flow_Sum <= 9.9575e+06 )
								if( bbm <= 1.69109 )
									ret := 0.400000
								if( bbm > 1.69109 )
									ret := -0.166667
							if( Positive_Money_Flow_Sum > 9.9575e+06 )
								if( Typical_Price <= 75.0549 )
									ret := -0.400000
								if( Typical_Price > 75.0549 )
									ret := -1.000000 // sell
						if( bbp > -0.765156 )
							if( Positive_Money_Flow <= 2.88159e+06 )
								if( Money_Flow_Ratio <= 1.13969 )
									ret := 0.067343
								if( Money_Flow_Ratio > 1.13969 )
									ret := -0.154440
							if( Positive_Money_Flow > 2.88159e+06 )
								if( Typical_Price <= 72.2142 )
									ret := 0.550000
								if( Typical_Price > 72.2142 )
									ret := -0.666667
					if( MFI_High > -21.6704 )
						if( Typical_Price <= 40.9267 )
							if( Negative_Money_Flow <= 1.75193e+06 )
								if( Raw_Money_Flow <= 6.76117e+06 )
									ret := 0.361419
								if( Raw_Money_Flow > 6.76117e+06 )
									ret := -0.190476
							if( Negative_Money_Flow > 1.75193e+06 )
								if( bbm <= 0.576055 )
									ret := 0.808000 // buy
								if( bbm > 0.576055 )
									ret := -0.166667
						if( Typical_Price > 40.9267 )
							if( Positive_Money_Flow_Sum <= 1.75498e+07 )
								if( Positive_Money_Flow_Sum <= 1.16097e+07 )
									ret := 0.035242
								if( Positive_Money_Flow_Sum > 1.16097e+07 )
									ret := -0.377483
							if( Positive_Money_Flow_Sum > 1.75498e+07 )
								if( MFI <= 89.4488 )
									ret := 0.134503
								if( MFI > 89.4488 )
									ret := 0.394737
				if( Typical_Price > 225.999 )
					if( Positive_Money_Flow_Sum <= 1.30941e+06 )
						if( Typical_Price <= 256.831 )
							ret := -0.166667
						if( Typical_Price > 256.831 )
							if( Typical_Price <= 284.577 )
								ret := 1.000000 // buy
							if( Typical_Price > 284.577 )
								ret := 0.200000
					if( Positive_Money_Flow_Sum > 1.30941e+06 )
						if( Typical_Price <= 344.821 )
							if( MFI <= 29.9329 )
								if( Raw_Money_Flow <= 690703 )
									ret := 0.200000
								if( Raw_Money_Flow > 690703 )
									ret := -0.961538 // sell
							if( MFI > 29.9329 )
								if( Positive_Money_Flow_Sum <= 1.57415e+08 )
									ret := -0.006536
								if( Positive_Money_Flow_Sum > 1.57415e+08 )
									ret := -0.620690
						if( Typical_Price > 344.821 )
							if( bullPower <= -1.7455 )
								if( Money_Flow_Ratio <= 0.922331 )
									ret := -0.714286 // sell
								if( Money_Flow_Ratio > 0.922331 )
									ret := 0.000000
							if( bullPower > -1.7455 )
								if( Positive_Money_Flow_Sum <= 3.49785e+07 )
									ret := -0.954545 // sell
								if( Positive_Money_Flow_Sum > 3.49785e+07 )
									ret := -0.545455
			if( Negative_Money_Flow_Sum > 1.13298e+07 )
				if( Negative_Money_Flow_Sum <= 3.99347e+08 )
					if( Raw_Money_Flow <= 1.85447e+07 )
						if( bbm <= 0.512221 )
							if( bearPower <= -1.42976 )
								if( Money_Flow_Ratio <= 0.259162 )
									ret := -0.427536
								if( Money_Flow_Ratio > 0.259162 )
									ret := -0.007812
							if( bearPower > -1.42976 )
								if( MFI <= 11.101 )
									ret := 0.228516
								if( MFI > 11.101 )
									ret := 0.013467
						if( bbm > 0.512221 )
							if( Positive_Money_Flow_Sum <= 4.26976e+07 )
								if( Raw_Money_Flow <= 1.12339e+06 )
									ret := 0.436842
								if( Raw_Money_Flow > 1.12339e+06 )
									ret := 0.123510
							if( Positive_Money_Flow_Sum > 4.26976e+07 )
								if( bbp <= -2.27153 )
									ret := 0.102591
								if( bbp > -2.27153 )
									ret := 0.003638
					if( Raw_Money_Flow > 1.85447e+07 )
						if( Negative_Money_Flow_Sum <= 3.14666e+08 )
							if( bearPower <= -7.91115 )
								if( bbm <= 6.42895 )
									ret := 0.024691
								if( bbm > 6.42895 )
									ret := 0.570312
							if( bearPower > -7.91115 )
								if( Positive_Money_Flow_Sum <= 2.59128e+06 )
									ret := -0.152778
								if( Positive_Money_Flow_Sum > 2.59128e+06 )
									ret := -0.005670
						if( Negative_Money_Flow_Sum > 3.14666e+08 )
							if( MFI <= 0.228249 )
								if( bbm <= 2.79565 )
									ret := 0.000000
								if( bbm > 2.79565 )
									ret := 0.888889 // buy
							if( MFI > 0.228249 )
								if( Negative_Money_Flow <= 2.331e+08 )
									ret := -0.259414
								if( Negative_Money_Flow > 2.331e+08 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 3.99347e+08 )
					if( Negative_Money_Flow_Sum <= 6.67826e+08 )
						if( MFI <= 32.5239 )
							if( Negative_Money_Flow_Sum <= 5.39616e+08 )
								if( Negative_Money_Flow_Sum <= 4.38697e+08 )
									ret := 0.629870
								if( Negative_Money_Flow_Sum > 4.38697e+08 )
									ret := 0.162562
							if( Negative_Money_Flow_Sum > 5.39616e+08 )
								if( Raw_Money_Flow <= 1.88157e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.88157e+07 )
									ret := 0.740741 // buy
						if( MFI > 32.5239 )
							if( Typical_Price <= 184.517 )
								if( Positive_Money_Flow_Sum <= 2.56758e+08 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 2.56758e+08 )
									ret := 0.815789 // buy
							if( Typical_Price > 184.517 )
								if( Money_Flow_Ratio <= 0.956652 )
									ret := -0.288660
								if( Money_Flow_Ratio > 0.956652 )
									ret := 0.345455
					if( Negative_Money_Flow_Sum > 6.67826e+08 )
						if( MFI_Low <= 5.5313 )
							if( Negative_Money_Flow_Sum <= 6.96144e+08 )
								if( bearPower <= -4.57266 )
									ret := 0.500000
								if( bearPower > -4.57266 )
									ret := -0.842105 // sell
							if( Negative_Money_Flow_Sum > 6.96144e+08 )
								if( Positive_Money_Flow <= 9.32339e+07 )
									ret := 0.571429
								if( Positive_Money_Flow > 9.32339e+07 )
									ret := -0.500000
						if( MFI_Low > 5.5313 )
							if( Raw_Money_Flow <= 2.99918e+07 )
								if( Negative_Money_Flow <= 1.55067e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.55067e+06 )
									ret := 0.833333 // buy
							if( Raw_Money_Flow > 2.99918e+07 )
								if( Negative_Money_Flow_Sum <= 8.30438e+08 )
									ret := -0.420000
								if( Negative_Money_Flow_Sum > 8.30438e+08 )
									ret := -0.939394 // sell
	if( BBPower_Color > 0.5 )
		if( MFI_High <= -19.7347 )
			if( Positive_Money_Flow <= 164912 )
				if( Raw_Money_Flow <= 63894.7 )
					if( bbp <= 0.407061 )
						if( Negative_Money_Flow_Sum <= 427860 )
							if( Typical_Price <= 60 )
								if( Typical_Price <= 38.1836 )
									ret := 0.153846
								if( Typical_Price > 38.1836 )
									ret := 0.807692 // buy
							if( Typical_Price > 60 )
								if( Negative_Money_Flow_Sum <= 180057 )
									ret := -0.714286 // sell
								if( Negative_Money_Flow_Sum > 180057 )
									ret := 0.105263
						if( Negative_Money_Flow_Sum > 427860 )
							if( Typical_Price <= 126.64 )
								if( MFI <= 58.5339 )
									ret := -0.117785
								if( MFI > 58.5339 )
									ret := 0.213115
							if( Typical_Price > 126.64 )
								if( bearPower <= 0.009617 )
									ret := -0.272727
								if( bearPower > 0.009617 )
									ret := 0.217391
					if( bbp > 0.407061 )
						if( Positive_Money_Flow_Sum <= 3.00521e+07 )
							if( MFI_Low <= 28.8539 )
								if( Negative_Money_Flow_Sum <= 436504 )
									ret := -0.731707 // sell
								if( Negative_Money_Flow_Sum > 436504 )
									ret := -0.223214
							if( MFI_Low > 28.8539 )
								if( MFI <= 54.9499 )
									ret := -0.774510 // sell
								if( MFI > 54.9499 )
									ret := -0.290323
						if( Positive_Money_Flow_Sum > 3.00521e+07 )
							if( Positive_Money_Flow_Sum <= 3.34872e+07 )
								if( bbm <= 0.131176 )
									ret := 0.032258
								if( bbm > 0.131176 )
									ret := 0.636364
							if( Positive_Money_Flow_Sum > 3.34872e+07 )
								if( Typical_Price <= 90.8716 )
									ret := -0.296774
								if( Typical_Price > 90.8716 )
									ret := -0.079882
				if( Raw_Money_Flow > 63894.7 )
					if( Money_Flow_Ratio <= 0.008912 )
						if( bearPower <= 1.56783 )
							if( bbp <= 0.901819 )
								if( Positive_Money_Flow_Sum <= 79803.7 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 79803.7 )
									ret := 0.101695
							if( bbp > 0.901819 )
								if( Raw_Money_Flow <= 90178.4 )
									ret := 0.000000
								if( Raw_Money_Flow > 90178.4 )
									ret := 0.727273 // buy
						if( bearPower > 1.56783 )
							if( Raw_Money_Flow <= 136180 )
								ret := -0.714286 // sell
							if( Raw_Money_Flow > 136180 )
								ret := 0.000000
					if( Money_Flow_Ratio > 0.008912 )
						if( Negative_Money_Flow_Sum <= 1.34328e+06 )
							if( Negative_Money_Flow_Sum <= 951226 )
								if( Negative_Money_Flow_Sum <= 920323 )
									ret := -0.172185
								if( Negative_Money_Flow_Sum > 920323 )
									ret := 0.619048
							if( Negative_Money_Flow_Sum > 951226 )
								if( bearPower <= 0.264654 )
									ret := -0.461538
								if( bearPower > 0.264654 )
									ret := -0.795918 // sell
						if( Negative_Money_Flow_Sum > 1.34328e+06 )
							if( Negative_Money_Flow_Sum <= 3.48239e+08 )
								if( Negative_Money_Flow_Sum <= 1.63861e+08 )
									ret := -0.023235
								if( Negative_Money_Flow_Sum > 1.63861e+08 )
									ret := -0.218284
							if( Negative_Money_Flow_Sum > 3.48239e+08 )
								if( MFI <= 29.6649 )
									ret := 0.405405
								if( MFI > 29.6649 )
									ret := -0.108108
			if( Positive_Money_Flow > 164912 )
				if( bbm <= 6.76895 )
					if( Money_Flow_Ratio <= 0.263846 )
						if( bullPower <= 0.412129 )
							if( Typical_Price <= 108.827 )
								if( bbm <= 0.334604 )
									ret := 0.080000
								if( bbm > 0.334604 )
									ret := 0.562500
							if( Typical_Price > 108.827 )
								if( Negative_Money_Flow_Sum <= 1.50404e+08 )
									ret := -0.538462
								if( Negative_Money_Flow_Sum > 1.50404e+08 )
									ret := 0.083333
						if( bullPower > 0.412129 )
							if( Negative_Money_Flow_Sum <= 3.11351e+07 )
								if( Positive_Money_Flow_Sum <= 1.45547e+06 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 1.45547e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.11351e+07 )
								if( Negative_Money_Flow_Sum <= 2.33e+08 )
									ret := -0.056122
								if( Negative_Money_Flow_Sum > 2.33e+08 )
									ret := -0.446809
					if( Money_Flow_Ratio > 0.263846 )
						if( MFI_High <= -20.8476 )
							if( Negative_Money_Flow_Sum <= 1.67524e+08 )
								if( Negative_Money_Flow_Sum <= 1.63722e+08 )
									ret := 0.017896
								if( Negative_Money_Flow_Sum > 1.63722e+08 )
									ret := -0.463415
							if( Negative_Money_Flow_Sum > 1.67524e+08 )
								if( Money_Flow_Ratio <= 0.98801 )
									ret := 0.258667
								if( Money_Flow_Ratio > 0.98801 )
									ret := -0.058252
						if( MFI_High > -20.8476 )
							if( bearPower <= -0.017533 )
								if( bullPower <= 2.6687 )
									ret := -0.288136
								if( bullPower > 2.6687 )
									ret := -1.000000 // sell
							if( bearPower > -0.017533 )
								if( bbm <= 1.73429 )
									ret := -0.071672
								if( bbm > 1.73429 )
									ret := 0.300000
				if( bbm > 6.76895 )
					if( MFI_High <= -41.7138 )
						if( bullPower <= 6.49197 )
							ret := 0.000000
						if( bullPower > 6.49197 )
							ret := -0.250000
					if( MFI_High > -41.7138 )
						if( Positive_Money_Flow <= 2.67152e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 2.67152e+07 )
							if( bbp <= 5.58585 )
								if( bearPower <= -2.09298 )
									ret := -0.500000
								if( bearPower > -2.09298 )
									ret := -1.000000 // sell
							if( bbp > 5.58585 )
								ret := 0.000000
		if( MFI_High > -19.7347 )
			if( Positive_Money_Flow_Sum <= 2.10953e+08 )
				if( Positive_Money_Flow_Sum <= 1.02491e+08 )
					if( Positive_Money_Flow <= 3.68394e+07 )
						if( bullPower <= 2.70197 )
							if( Negative_Money_Flow_Sum <= 1.17388e+06 )
								if( Positive_Money_Flow <= 721536 )
									ret := 0.031609
								if( Positive_Money_Flow > 721536 )
									ret := 0.255297
							if( Negative_Money_Flow_Sum > 1.17388e+06 )
								if( bullPower <= 1.41898 )
									ret := 0.020996
								if( bullPower > 1.41898 )
									ret := -0.158798
						if( bullPower > 2.70197 )
							if( bbm <= 4.33528 )
								if( Raw_Money_Flow <= 2.416e+07 )
									ret := -0.204748
								if( Raw_Money_Flow > 2.416e+07 )
									ret := -0.589041
							if( bbm > 4.33528 )
								if( Positive_Money_Flow <= 2.89505e+07 )
									ret := 0.560000
								if( Positive_Money_Flow > 2.89505e+07 )
									ret := -0.370370
					if( Positive_Money_Flow > 3.68394e+07 )
						if( Positive_Money_Flow <= 7.66133e+07 )
							if( bullPower <= 6.41895 )
								if( bbm <= 4.4827 )
									ret := 0.297872
								if( bbm > 4.4827 )
									ret := 0.723077 // buy
							if( bullPower > 6.41895 )
								if( Negative_Money_Flow_Sum <= 1.97608e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.97608e+06 )
									ret := 0.000000
						if( Positive_Money_Flow > 7.66133e+07 )
							if( Positive_Money_Flow_Sum <= 9.07007e+07 )
								if( bbm <= 3.09577 )
									ret := 0.000000
								if( bbm > 3.09577 )
									ret := -0.833333 // sell
							if( Positive_Money_Flow_Sum > 9.07007e+07 )
								if( bbp <= 2.84572 )
									ret := -0.500000
								if( bbp > 2.84572 )
									ret := 0.857143 // buy
				if( Positive_Money_Flow_Sum > 1.02491e+08 )
					if( Typical_Price <= 62.4488 )
						if( bbm <= 0.587644 )
							if( Raw_Money_Flow <= 8.67102e+06 )
								if( bbm <= 0.37305 )
									ret := 0.198198
								if( bbm > 0.37305 )
									ret := 0.600000
							if( Raw_Money_Flow > 8.67102e+06 )
								if( Money_Flow_Ratio <= 3.48989 )
									ret := 0.183673
								if( Money_Flow_Ratio > 3.48989 )
									ret := -0.346154
						if( bbm > 0.587644 )
							if( Positive_Money_Flow <= 1.81284e+07 )
								if( bbp <= 1.01946 )
									ret := 0.142857
								if( bbp > 1.01946 )
									ret := 0.784810 // buy
							if( Positive_Money_Flow > 1.81284e+07 )
								if( Raw_Money_Flow <= 3.52038e+07 )
									ret := -0.235294
								if( Raw_Money_Flow > 3.52038e+07 )
									ret := 0.583333
					if( Typical_Price > 62.4488 )
						if( bbm <= 3.73603 )
							if( Negative_Money_Flow <= 2.84098e+07 )
								if( Negative_Money_Flow_Sum <= 1.28277e+06 )
									ret := -0.097179
								if( Negative_Money_Flow_Sum > 1.28277e+06 )
									ret := 0.088027
							if( Negative_Money_Flow > 2.84098e+07 )
								if( Positive_Money_Flow_Sum <= 1.32026e+08 )
									ret := 0.315789
								if( Positive_Money_Flow_Sum > 1.32026e+08 )
									ret := -0.426829
						if( bbm > 3.73603 )
							if( Typical_Price <= 354.524 )
								if( Positive_Money_Flow <= 7.24118e+07 )
									ret := 0.500000
								if( Positive_Money_Flow > 7.24118e+07 )
									ret := 0.085106
							if( Typical_Price > 354.524 )
								if( Typical_Price <= 360.961 )
									ret := -0.750000 // sell
								if( Typical_Price > 360.961 )
									ret := 0.032258
			if( Positive_Money_Flow_Sum > 2.10953e+08 )
				if( Typical_Price <= 130.001 )
					if( Typical_Price <= 38.26 )
						if( Positive_Money_Flow_Sum <= 2.63893e+08 )
							if( bbm <= 0.38495 )
								ret := -1.000000 // sell
							if( bbm > 0.38495 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 2.63893e+08 )
							ret := -0.166667
					if( Typical_Price > 38.26 )
						if( bullPower <= 4.69902 )
							if( Negative_Money_Flow_Sum <= 3.66813e+07 )
								if( Typical_Price <= 73.7601 )
									ret := -0.535714
								if( Typical_Price > 73.7601 )
									ret := -0.039683
							if( Negative_Money_Flow_Sum > 3.66813e+07 )
								if( Typical_Price <= 58.7951 )
									ret := 0.561644
								if( Typical_Price > 58.7951 )
									ret := 0.132316
						if( bullPower > 4.69902 )
							if( Negative_Money_Flow_Sum <= 1.45324e+07 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.45324e+07 )
								if( bbp <= 10.6279 )
									ret := 0.961538 // buy
								if( bbp > 10.6279 )
									ret := 0.000000
				if( Typical_Price > 130.001 )
					if( MFI_Low <= 53.327 )
						if( Positive_Money_Flow_Sum <= 7.27217e+08 )
							if( bbp <= 11.8359 )
								if( bearPower <= 0.935384 )
									ret := -0.069588
								if( bearPower > 0.935384 )
									ret := -0.331343
							if( bbp > 11.8359 )
								if( MFI <= 72.0076 )
									ret := 0.782609 // buy
								if( MFI > 72.0076 )
									ret := -0.600000
						if( Positive_Money_Flow_Sum > 7.27217e+08 )
							if( Positive_Money_Flow <= 302474 )
								if( bbm <= 1.87 )
									ret := -0.750000 // sell
								if( bbm > 1.87 )
									ret := 0.000000
							if( Positive_Money_Flow > 302474 )
								ret := -1.000000 // sell
					if( MFI_Low > 53.327 )
						if( Negative_Money_Flow_Sum <= 6.35414e+07 )
							if( bullPower <= 14.7584 )
								if( Raw_Money_Flow <= 5.5096e+07 )
									ret := -0.168878
								if( Raw_Money_Flow > 5.5096e+07 )
									ret := 0.111842
							if( bullPower > 14.7584 )
								if( bbp <= 32.9223 )
									ret := -1.000000 // sell
								if( bbp > 32.9223 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 6.35414e+07 )
							if( Negative_Money_Flow <= 3.78945e+07 )
								if( Raw_Money_Flow <= 3.53709e+07 )
									ret := 0.096000
								if( Raw_Money_Flow > 3.53709e+07 )
									ret := -0.161905
							if( Negative_Money_Flow > 3.78945e+07 )
								if( Typical_Price <= 336.163 )
									ret := 0.678571
								if( Typical_Price > 336.163 )
									ret := -0.125000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_TWLO_15Min_25fe8bf9(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


