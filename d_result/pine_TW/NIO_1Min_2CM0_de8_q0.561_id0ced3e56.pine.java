//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: NIO_1Min_2CM0_0ced3e56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_2CM0_0ced3e56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_0ced3e56(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 0.87986 )
		if( Raw_Money_Flow <= 5468.87 )
			if( Positive_Money_Flow <= 1.44018 )
				if( Negative_Money_Flow_Sum <= 23377.2 )
					if( ad <= -42.5755 )
						ret := 0.647059
					if( ad > -42.5755 )
						if( ad_mf <= 0.14509 )
							if( MFI_High <= -10.7446 )
								if( MFI <= 27.7187 )
									ret := 0.123596
								if( MFI > 27.7187 )
									ret := -0.303448
							if( MFI_High > -10.7446 )
								if( mf <= 0.161797 )
									ret := 0.113475
								if( mf > 0.161797 )
									ret := -0.163180
						if( ad_mf > 0.14509 )
							if( ad_mf <= 0.249847 )
								if( Negative_Money_Flow_Sum <= 15805.7 )
									ret := -0.253731
								if( Negative_Money_Flow_Sum > 15805.7 )
									ret := -0.837209 // sell
							if( ad_mf > 0.249847 )
								if( ad_mf <= 125.512 )
									ret := -0.155039
								if( ad_mf > 125.512 )
									ret := -0.550000
				if( Negative_Money_Flow_Sum > 23377.2 )
					if( ad_mf <= -4.79316 )
						if( mf <= 0.158087 )
							if( MFI_High <= -17.3089 )
								if( mf <= -0.067508 )
									ret := 0.580645
								if( mf > -0.067508 )
									ret := 0.862069 // buy
							if( MFI_High > -17.3089 )
								ret := 0.333333
						if( mf > 0.158087 )
							if( ad <= -502.543 )
								ret := -0.050000
							if( ad > -502.543 )
								ret := 0.388889
					if( ad_mf > -4.79316 )
						if( Positive_Money_Flow_Sum <= 18206 )
							if( MFI_High <= -73.6285 )
								if( Positive_Money_Flow_Sum <= 1086.13 )
									ret := 0.368421
								if( Positive_Money_Flow_Sum > 1086.13 )
									ret := -0.043321
							if( MFI_High > -73.6285 )
								if( Negative_Money_Flow_Sum <= 170539 )
									ret := -0.250460
								if( Negative_Money_Flow_Sum > 170539 )
									ret := 0.545455
						if( Positive_Money_Flow_Sum > 18206 )
							if( ad_mf <= 3.20664 )
								if( ad_mf <= 0.204867 )
									ret := -0.010178
								if( ad_mf > 0.204867 )
									ret := 0.114865
							if( ad_mf > 3.20664 )
								if( Negative_Money_Flow_Sum <= 78051.2 )
									ret := 0.093750
								if( Negative_Money_Flow_Sum > 78051.2 )
									ret := -0.488372
			if( Positive_Money_Flow > 1.44018 )
				if( ad_mf <= -0.873061 )
					if( MFI <= 37.9513 )
						if( Money_Flow_Ratio <= 0.505158 )
							if( Typical_Price <= 4.79824 )
								if( Raw_Money_Flow <= 1248.29 )
									ret := -0.117647
								if( Raw_Money_Flow > 1248.29 )
									ret := 0.524691
							if( Typical_Price > 4.79824 )
								if( MFI <= 31.6605 )
									ret := 0.169014
								if( MFI > 31.6605 )
									ret := -0.600000
						if( Money_Flow_Ratio > 0.505158 )
							if( Positive_Money_Flow <= 2146.62 )
								ret := 0.875000 // buy
							if( Positive_Money_Flow > 2146.62 )
								if( mf <= -0.040733 )
									ret := 0.363636
								if( mf > -0.040733 )
									ret := 0.750000 // buy
					if( MFI > 37.9513 )
						if( Typical_Price <= 4.48512 )
							if( MFI_Low <= 22.1412 )
								ret := -0.562500
							if( MFI_Low > 22.1412 )
								if( Money_Flow_Ratio <= 12.9502 )
									ret := 0.484277
								if( Money_Flow_Ratio > 12.9502 )
									ret := -0.166667
						if( Typical_Price > 4.48512 )
							if( MFI_High <= 14.9997 )
								if( Positive_Money_Flow <= 2097.84 )
									ret := -0.316456
								if( Positive_Money_Flow > 2097.84 )
									ret := -0.010989
							if( MFI_High > 14.9997 )
								if( MFI <= 97.1559 )
									ret := 0.466667
								if( MFI > 97.1559 )
									ret := 0.142857
				if( ad_mf > -0.873061 )
					if( Negative_Money_Flow_Sum <= 27111.4 )
						if( Positive_Money_Flow_Sum <= 185056 )
							if( Positive_Money_Flow <= 372.176 )
								if( Positive_Money_Flow_Sum <= 49384.4 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 49384.4 )
									ret := -0.450000
							if( Positive_Money_Flow > 372.176 )
								if( MFI_Low <= 78.1187 )
									ret := -0.538204
								if( MFI_Low > 78.1187 )
									ret := 0.058824
						if( Positive_Money_Flow_Sum > 185056 )
							if( Money_Flow_Ratio <= 11.3544 )
								if( ad_mf <= 0.102403 )
									ret := -0.357143
								if( ad_mf > 0.102403 )
									ret := -0.800000 // sell
							if( Money_Flow_Ratio > 11.3544 )
								if( ad_mf <= -0.291274 )
									ret := -0.487179
								if( ad_mf > -0.291274 )
									ret := 0.271429
					if( Negative_Money_Flow_Sum > 27111.4 )
						if( Positive_Money_Flow <= 337.801 )
							if( MFI_High <= -66.8475 )
								if( MFI <= 1.95168 )
									ret := -0.466667
								if( MFI > 1.95168 )
									ret := -1.000000 // sell
							if( MFI_High > -66.8475 )
								if( Money_Flow_Ratio <= 0.181272 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.181272 )
									ret := -0.625498
						if( Positive_Money_Flow > 337.801 )
							if( MFI_Low <= -1.96958 )
								if( Negative_Money_Flow_Sum <= 60658 )
									ret := -0.669951
								if( Negative_Money_Flow_Sum > 60658 )
									ret := -0.438766
							if( MFI_Low > -1.96958 )
								if( ad_mf <= 6.63999 )
									ret := -0.281287
								if( ad_mf > 6.63999 )
									ret := -0.532228
		if( Raw_Money_Flow > 5468.87 )
			if( Raw_Money_Flow <= 83880.3 )
				if( Positive_Money_Flow_Sum <= 374689 )
					if( Positive_Money_Flow <= 56.9247 )
						if( Typical_Price <= 3.78017 )
							if( ad <= -831.222 )
								ret := 0.777778 // buy
							if( ad > -831.222 )
								if( Raw_Money_Flow <= 23084.8 )
									ret := -0.469880
								if( Raw_Money_Flow > 23084.8 )
									ret := -0.120000
						if( Typical_Price > 3.78017 )
							if( ad_mf <= -0.762745 )
								if( Negative_Money_Flow_Sum <= 141694 )
									ret := 0.578275
								if( Negative_Money_Flow_Sum > 141694 )
									ret := 0.108247
							if( ad_mf > -0.762745 )
								if( Positive_Money_Flow_Sum <= 10695.3 )
									ret := 0.192389
								if( Positive_Money_Flow_Sum > 10695.3 )
									ret := -0.086570
					if( Positive_Money_Flow > 56.9247 )
						if( Negative_Money_Flow_Sum <= 803460 )
							if( ad <= -0.545092 )
								if( Typical_Price <= 4.20595 )
									ret := 0.051597
								if( Typical_Price > 4.20595 )
									ret := 0.286835
							if( ad > -0.545092 )
								if( ad_mf <= 52.6411 )
									ret := -0.089700
								if( ad_mf > 52.6411 )
									ret := -0.331674
						if( Negative_Money_Flow_Sum > 803460 )
							if( Money_Flow_Ratio <= 0.174727 )
								if( MFI <= 14.0279 )
									ret := -0.046099
								if( MFI > 14.0279 )
									ret := -0.892857 // sell
							if( Money_Flow_Ratio > 0.174727 )
								if( MFI_Low <= -3.44776 )
									ret := 0.589474
								if( MFI_Low > -3.44776 )
									ret := 0.055375
				if( Positive_Money_Flow_Sum > 374689 )
					if( ad <= 89.0518 )
						if( ad_mf <= -0.555123 )
							if( MFI <= 73.2014 )
								if( MFI_Low <= 9.64948 )
									ret := -0.056122
								if( MFI_Low > 9.64948 )
									ret := 0.229294
							if( MFI > 73.2014 )
								if( MFI_High <= -3.46372 )
									ret := -0.266055
								if( MFI_High > -3.46372 )
									ret := 0.030948
						if( ad_mf > -0.555123 )
							if( MFI_Low <= 19.4637 )
								if( MFI <= 38.1191 )
									ret := 0.050676
								if( MFI > 38.1191 )
									ret := 0.466667
							if( MFI_Low > 19.4637 )
								if( Typical_Price <= 5.87023 )
									ret := -0.095923
								if( Typical_Price > 5.87023 )
									ret := -0.320261
					if( ad > 89.0518 )
						if( MFI_High <= 12.3564 )
							if( ad_mf <= 2667.81 )
								if( mf <= -0.260539 )
									ret := -0.220472
								if( mf > -0.260539 )
									ret := -0.489415
							if( ad_mf > 2667.81 )
								if( Positive_Money_Flow_Sum <= 849940 )
									ret := -0.248485
								if( Positive_Money_Flow_Sum > 849940 )
									ret := -0.366190
						if( MFI_High > 12.3564 )
							if( Typical_Price <= 5.51173 )
								if( mf <= 0.749555 )
									ret := -0.754386 // sell
								if( mf > 0.749555 )
									ret := -0.111111
							if( Typical_Price > 5.51173 )
								if( Positive_Money_Flow <= 43172 )
									ret := 0.115385
								if( Positive_Money_Flow > 43172 )
									ret := -0.444444
			if( Raw_Money_Flow > 83880.3 )
				if( mf <= -0.069264 )
					if( ad_mf <= 14470.3 )
						if( Positive_Money_Flow <= 816274 )
							if( ad_mf <= -106.928 )
								if( Money_Flow_Ratio <= 4.18348 )
									ret := 0.159726
								if( Money_Flow_Ratio > 4.18348 )
									ret := 0.460094
							if( ad_mf > -106.928 )
								if( Positive_Money_Flow <= 395445 )
									ret := -0.010041
								if( Positive_Money_Flow > 395445 )
									ret := 0.374251
						if( Positive_Money_Flow > 816274 )
							if( Raw_Money_Flow <= 3.50718e+06 )
								if( ad <= -438.669 )
									ret := -0.150466
								if( ad > -438.669 )
									ret := 0.077778
							if( Raw_Money_Flow > 3.50718e+06 )
								if( mf <= -0.252213 )
									ret := 0.734694 // buy
								if( mf > -0.252213 )
									ret := 0.039474
					if( ad_mf > 14470.3 )
						if( MFI_Low <= -6.76739 )
							if( MFI_High <= -74.5781 )
								ret := -0.100000
							if( MFI_High > -74.5781 )
								if( Negative_Money_Flow_Sum <= 1.97341e+07 )
									ret := -0.554140
								if( Negative_Money_Flow_Sum > 1.97341e+07 )
									ret := -0.847826 // sell
						if( MFI_Low > -6.76739 )
							if( Raw_Money_Flow <= 170260 )
								if( Positive_Money_Flow_Sum <= 560535 )
									ret := 0.050000
								if( Positive_Money_Flow_Sum > 560535 )
									ret := -0.426716
							if( Raw_Money_Flow > 170260 )
								if( mf <= -0.113831 )
									ret := 0.050223
								if( mf > -0.113831 )
									ret := -0.135514
				if( mf > -0.069264 )
					if( Positive_Money_Flow_Sum <= 1.16914e+07 )
						if( mf <= 0.475126 )
							if( Raw_Money_Flow <= 2.90844e+06 )
								if( MFI_Low <= 46.7476 )
									ret := -0.054304
								if( MFI_Low > 46.7476 )
									ret := -0.093778
							if( Raw_Money_Flow > 2.90844e+06 )
								if( MFI <= 63.2199 )
									ret := -0.587302
								if( MFI > 63.2199 )
									ret := -0.243655
						if( mf > 0.475126 )
							if( MFI <= 96.3017 )
								if( ad_mf <= 47856.4 )
									ret := -0.269551
								if( ad_mf > 47856.4 )
									ret := -0.002404
							if( MFI > 96.3017 )
								if( Typical_Price <= 4.36707 )
									ret := 0.227273
								if( Typical_Price > 4.36707 )
									ret := -0.747899 // sell
					if( Positive_Money_Flow_Sum > 1.16914e+07 )
						if( Positive_Money_Flow_Sum <= 2.6186e+07 )
							if( mf <= 0.320973 )
								if( Negative_Money_Flow_Sum <= 2.60385e+07 )
									ret := 0.003450
								if( Negative_Money_Flow_Sum > 2.60385e+07 )
									ret := 0.537190
							if( mf > 0.320973 )
								if( Negative_Money_Flow_Sum <= 2.64482e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.64482e+06 )
									ret := 0.630556
						if( Positive_Money_Flow_Sum > 2.6186e+07 )
							if( Money_Flow_Ratio <= 8.64682 )
								if( MFI_Low <= 62.7205 )
									ret := -0.229965
								if( MFI_Low > 62.7205 )
									ret := -0.692308
							if( Money_Flow_Ratio > 8.64682 )
								if( ad <= -5241.86 )
									ret := 0.918919 // buy
								if( ad > -5241.86 )
									ret := -0.076336
	if( Negative_Money_Flow > 0.87986 )
		if( ad <= 7.29579 )
			if( Raw_Money_Flow <= 61412.3 )
				if( Negative_Money_Flow <= 6095.79 )
					if( ad <= -2.30955 )
						if( MFI <= 70.324 )
							if( MFI <= 67.1475 )
								if( Positive_Money_Flow <= 6535.54 )
									ret := 0.606491
								if( Positive_Money_Flow > 6535.54 )
									ret := 0.283582
							if( MFI > 67.1475 )
								if( Typical_Price <= 5.65031 )
									ret := 0.897959 // buy
								if( Typical_Price > 5.65031 )
									ret := 0.400000
						if( MFI > 70.324 )
							if( Negative_Money_Flow_Sum <= 95852.9 )
								if( MFI <= 80.9266 )
									ret := 0.257143
								if( MFI > 80.9266 )
									ret := 0.637500
							if( Negative_Money_Flow_Sum > 95852.9 )
								if( MFI_Low <= 66.7673 )
									ret := -0.070707
								if( MFI_Low > 66.7673 )
									ret := 0.450000
					if( ad > -2.30955 )
						if( Negative_Money_Flow <= 2066.34 )
							if( MFI_Low <= -8.12388 )
								if( MFI_High <= -70.6074 )
									ret := 0.368957
								if( MFI_High > -70.6074 )
									ret := -0.114754
							if( MFI_Low > -8.12388 )
								if( Typical_Price <= 6.02201 )
									ret := 0.467917
								if( Typical_Price > 6.02201 )
									ret := -0.191489
						if( Negative_Money_Flow > 2066.34 )
							if( Positive_Money_Flow <= 4.70948 )
								if( ad_mf <= 0.081997 )
									ret := 0.401544
								if( ad_mf > 0.081997 )
									ret := 0.201389
							if( Positive_Money_Flow > 4.70948 )
								if( Positive_Money_Flow <= 1568.7 )
									ret := -0.447619
								if( Positive_Money_Flow > 1568.7 )
									ret := 0.020408
				if( Negative_Money_Flow > 6095.79 )
					if( ad <= -2.28726 )
						if( Positive_Money_Flow_Sum <= 195438 )
							if( Typical_Price <= 4.77258 )
								if( Money_Flow_Ratio <= 0.019469 )
									ret := -0.740741 // sell
								if( Money_Flow_Ratio > 0.019469 )
									ret := 0.588951
							if( Typical_Price > 4.77258 )
								if( MFI_Low <= -16.0398 )
									ret := -0.043478
								if( MFI_Low > -16.0398 )
									ret := 0.408998
						if( Positive_Money_Flow_Sum > 195438 )
							if( MFI <= 51.9974 )
								if( MFI <= 43.9369 )
									ret := 0.342065
								if( MFI > 43.9369 )
									ret := 0.512821
							if( MFI > 51.9974 )
								if( MFI_Low <= 34.8216 )
									ret := -0.045714
								if( MFI_Low > 34.8216 )
									ret := 0.263801
					if( ad > -2.28726 )
						if( Positive_Money_Flow_Sum <= 8.03446e+06 )
							if( MFI_Low <= 13.3976 )
								if( Money_Flow_Ratio <= 0.374183 )
									ret := 0.112867
								if( Money_Flow_Ratio > 0.374183 )
									ret := -0.137778
							if( MFI_Low > 13.3976 )
								if( Negative_Money_Flow_Sum <= 72161.4 )
									ret := 0.288490
								if( Negative_Money_Flow_Sum > 72161.4 )
									ret := 0.100437
						if( Positive_Money_Flow_Sum > 8.03446e+06 )
							if( Negative_Money_Flow_Sum <= 1.54808e+07 )
								if( ad_mf <= -0.219241 )
									ret := 0.000000
								if( ad_mf > -0.219241 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.54808e+07 )
								ret := -1.000000 // sell
			if( Raw_Money_Flow > 61412.3 )
				if( mf <= -0.557403 )
					if( ad_mf <= -412442 )
						if( Positive_Money_Flow_Sum <= 163561 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 163561 )
							if( Typical_Price <= 4.6406 )
								if( MFI <= 13.2484 )
									ret := 0.920000 // buy
								if( MFI > 13.2484 )
									ret := -0.300000
							if( Typical_Price > 4.6406 )
								if( MFI <= 4.47675 )
									ret := -0.545455
								if( MFI > 4.47675 )
									ret := -0.853659 // sell
					if( ad_mf > -412442 )
						if( Positive_Money_Flow_Sum <= 20141.8 )
							if( MFI_Low <= -17.5408 )
								if( Raw_Money_Flow <= 299960 )
									ret := -0.375000
								if( Raw_Money_Flow > 299960 )
									ret := 0.222222
							if( MFI_Low > -17.5408 )
								if( Negative_Money_Flow_Sum <= 215348 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 215348 )
									ret := -0.642857
						if( Positive_Money_Flow_Sum > 20141.8 )
							if( Money_Flow_Ratio <= 0.077729 )
								if( Positive_Money_Flow_Sum <= 227584 )
									ret := 0.428571
								if( Positive_Money_Flow_Sum > 227584 )
									ret := -0.400000
							if( Money_Flow_Ratio > 0.077729 )
								if( Positive_Money_Flow_Sum <= 332198 )
									ret := 0.165680
								if( Positive_Money_Flow_Sum > 332198 )
									ret := -0.230263
				if( mf > -0.557403 )
					if( Raw_Money_Flow <= 1.29906e+06 )
						if( MFI_Low <= -16.5914 )
							if( Typical_Price <= 3.96534 )
								if( Negative_Money_Flow <= 108987 )
									ret := -0.214286
								if( Negative_Money_Flow > 108987 )
									ret := 0.434783
							if( Typical_Price > 3.96534 )
								if( ad <= -168.18 )
									ret := 0.765625 // buy
								if( ad > -168.18 )
									ret := 0.222222
						if( MFI_Low > -16.5914 )
							if( Negative_Money_Flow_Sum <= 7.79682e+06 )
								if( Negative_Money_Flow <= 1.01242e+06 )
									ret := 0.190755
								if( Negative_Money_Flow > 1.01242e+06 )
									ret := 0.017699
							if( Negative_Money_Flow_Sum > 7.79682e+06 )
								if( ad_mf <= -153770 )
									ret := 0.386997
								if( ad_mf > -153770 )
									ret := -0.003756
					if( Raw_Money_Flow > 1.29906e+06 )
						if( Positive_Money_Flow_Sum <= 2.04665e+07 )
							if( ad_mf <= -100059 )
								if( Positive_Money_Flow_Sum <= 808309 )
									ret := -0.378049
								if( Positive_Money_Flow_Sum > 808309 )
									ret := 0.029238
							if( ad_mf > -100059 )
								if( Typical_Price <= 5.1816 )
									ret := -0.028754
								if( Typical_Price > 5.1816 )
									ret := -0.265203
						if( Positive_Money_Flow_Sum > 2.04665e+07 )
							if( ad <= -485004 )
								if( mf <= -0.152565 )
									ret := 0.708333 // buy
								if( mf > -0.152565 )
									ret := 0.044304
							if( ad > -485004 )
								if( Money_Flow_Ratio <= 0.85593 )
									ret := 0.111111
								if( Money_Flow_Ratio > 0.85593 )
									ret := -0.464062
		if( ad > 7.29579 )
			if( Negative_Money_Flow_Sum <= 2.05157e+07 )
				if( Negative_Money_Flow_Sum <= 18983.5 )
					if( ad <= 196.708 )
						ret := -1.000000 // sell
					if( ad > 196.708 )
						if( MFI_Low <= 76.5409 )
							if( ad_mf <= 811.566 )
								if( Positive_Money_Flow_Sum <= 173059 )
									ret := -0.573171
								if( Positive_Money_Flow_Sum > 173059 )
									ret := -0.071429
							if( ad_mf > 811.566 )
								if( Raw_Money_Flow <= 5786.88 )
									ret := -0.940000 // sell
								if( Raw_Money_Flow > 5786.88 )
									ret := -0.531250
						if( MFI_Low > 76.5409 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 18983.5 )
					if( MFI_High <= 12.5186 )
						if( ad_mf <= 4959.07 )
							if( Positive_Money_Flow_Sum <= 2104.18 )
								ret := 0.923077 // buy
							if( Positive_Money_Flow_Sum > 2104.18 )
								if( Typical_Price <= 5.53669 )
									ret := -0.138610
								if( Typical_Price > 5.53669 )
									ret := -0.298329
						if( ad_mf > 4959.07 )
							if( Positive_Money_Flow_Sum <= 8.20139e+06 )
								if( MFI_Low <= -1.87517 )
									ret := -0.152022
								if( MFI_Low > -1.87517 )
									ret := -0.284923
							if( Positive_Money_Flow_Sum > 8.20139e+06 )
								if( MFI_High <= -43.0864 )
									ret := -0.803571 // sell
								if( MFI_High > -43.0864 )
									ret := -0.010397
					if( MFI_High > 12.5186 )
						if( MFI_Low <= 76.4738 )
							if( Positive_Money_Flow <= 36.2026 )
								if( Typical_Price <= 4.5071 )
									ret := -0.333333
								if( Typical_Price > 4.5071 )
									ret := -0.666667
							if( Positive_Money_Flow > 36.2026 )
								if( Raw_Money_Flow <= 238592 )
									ret := -0.929825 // sell
								if( Raw_Money_Flow > 238592 )
									ret := -0.555556
						if( MFI_Low > 76.4738 )
							if( ad <= 1534.84 )
								ret := 0.428571
							if( ad > 1534.84 )
								if( Money_Flow_Ratio <= 50.0773 )
									ret := 0.000000
								if( Money_Flow_Ratio > 50.0773 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 2.05157e+07 )
				if( Typical_Price <= 7.34597 )
					if( Typical_Price <= 6.12738 )
						if( MFI <= 39.3824 )
							if( ad_mf <= 646354 )
								if( Typical_Price <= 5.49863 )
									ret := -0.064103
								if( Typical_Price > 5.49863 )
									ret := 0.473684
							if( ad_mf > 646354 )
								if( MFI <= 14.9369 )
									ret := 0.947368 // buy
								if( MFI > 14.9369 )
									ret := 0.333333
						if( MFI > 39.3824 )
							if( Negative_Money_Flow_Sum <= 2.93914e+07 )
								if( MFI_Low <= 38.1447 )
									ret := 0.000000
								if( MFI_Low > 38.1447 )
									ret := -0.916667 // sell
							if( Negative_Money_Flow_Sum > 2.93914e+07 )
								ret := -1.000000 // sell
					if( Typical_Price > 6.12738 )
						if( Negative_Money_Flow_Sum <= 6.76174e+07 )
							if( Raw_Money_Flow <= 4.42776e+06 )
								if( Money_Flow_Ratio <= 0.479759 )
									ret := 0.809524 // buy
								if( Money_Flow_Ratio > 0.479759 )
									ret := 0.160377
							if( Raw_Money_Flow > 4.42776e+06 )
								if( Money_Flow_Ratio <= 0.815221 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.815221 )
									ret := -0.600000
						if( Negative_Money_Flow_Sum > 6.76174e+07 )
							if( Positive_Money_Flow <= 4.50888e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 4.50888e+06 )
								ret := 0.555556
				if( Typical_Price > 7.34597 )
					ret := -0.666667
	
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
float op_operation = decision_tree_0_NIO_1Min_0ced3e56(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


