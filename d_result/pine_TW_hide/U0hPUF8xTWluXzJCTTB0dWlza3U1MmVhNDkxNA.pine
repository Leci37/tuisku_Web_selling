//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: SHOP_1Min_2BM0_52ea4914 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_2BM0_52ea4914", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_52ea4914(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.10321 )
		if( Raw_Money_Flow <= 70803.1 )
			if( bullPower <= -0.083943 )
				if( Negative_Money_Flow <= 32651 )
					if( Typical_Price <= 81.51 )
						if( Typical_Price <= 51.6562 )
							if( bearPower <= -0.364801 )
								ret := 1.000000 // buy
							if( bearPower > -0.364801 )
								if( Negative_Money_Flow_Sum <= 188860 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 188860 )
									ret := 0.000000
						if( Typical_Price > 51.6562 )
							if( Negative_Money_Flow <= 1669.26 )
								if( MFI_Low <= -2.98611 )
									ret := 0.038961
								if( MFI_Low > -2.98611 )
									ret := 0.560606
							if( Negative_Money_Flow > 1669.26 )
								if( Typical_Price <= 74.3864 )
									ret := 0.646007
								if( Typical_Price > 74.3864 )
									ret := 0.380282
					if( Typical_Price > 81.51 )
						if( Negative_Money_Flow_Sum <= 509197 )
							if( Money_Flow_Ratio <= 1.21886 )
								if( Money_Flow_Ratio <= 0.736376 )
									ret := -0.250000
								if( Money_Flow_Ratio > 0.736376 )
									ret := -0.200000
							if( Money_Flow_Ratio > 1.21886 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 509197 )
							if( Negative_Money_Flow <= 13753.6 )
								if( Negative_Money_Flow_Sum <= 3.76136e+07 )
									ret := -0.125000
								if( Negative_Money_Flow_Sum > 3.76136e+07 )
									ret := 0.250000
							if( Negative_Money_Flow > 13753.6 )
								if( Negative_Money_Flow <= 25111 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 25111 )
									ret := 0.625000
				if( Negative_Money_Flow > 32651 )
					if( Money_Flow_Ratio <= 1.32147 )
						if( MFI <= 20.1807 )
							if( Negative_Money_Flow_Sum <= 603845 )
								if( bearPower <= -0.276659 )
									ret := 0.375000
								if( bearPower > -0.276659 )
									ret := 0.918919 // buy
							if( Negative_Money_Flow_Sum > 603845 )
								if( Negative_Money_Flow <= 57749.4 )
									ret := 0.142857
								if( Negative_Money_Flow > 57749.4 )
									ret := 0.687500
						if( MFI > 20.1807 )
							if( MFI <= 28.1394 )
								if( bbp <= -0.403972 )
									ret := -0.766667 // sell
								if( bbp > -0.403972 )
									ret := -0.131579
							if( MFI > 28.1394 )
								if( Typical_Price <= 53.35 )
									ret := -0.647059
								if( Typical_Price > 53.35 )
									ret := 0.324503
					if( Money_Flow_Ratio > 1.32147 )
						if( bearPower <= -0.157453 )
							if( Positive_Money_Flow_Sum <= 3.126e+07 )
								if( bbm <= 0.000101 )
									ret := 0.875000 // buy
								if( bbm > 0.000101 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.126e+07 )
								ret := 0.250000
						if( bearPower > -0.157453 )
							if( Positive_Money_Flow_Sum <= 988474 )
								if( bbp <= -0.270288 )
									ret := 0.000000
								if( bbp > -0.270288 )
									ret := 0.700000 // buy
							if( Positive_Money_Flow_Sum > 988474 )
								if( bearPower <= -0.115368 )
									ret := -0.500000
								if( bearPower > -0.115368 )
									ret := 0.428571
			if( bullPower > -0.083943 )
				if( bbm <= 0.025794 )
					if( Positive_Money_Flow_Sum <= 133788 )
						if( bullPower <= -0.081242 )
							if( Negative_Money_Flow <= 12678 )
								ret := 0.333333
							if( Negative_Money_Flow > 12678 )
								ret := -0.333333
						if( bullPower > -0.081242 )
							if( bbp <= -0.121712 )
								if( Negative_Money_Flow_Sum <= 835518 )
									ret := 0.672566
								if( Negative_Money_Flow_Sum > 835518 )
									ret := 0.111111
							if( bbp > -0.121712 )
								if( Negative_Money_Flow_Sum <= 178088 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 178088 )
									ret := 0.280000
					if( Positive_Money_Flow_Sum > 133788 )
						if( Positive_Money_Flow_Sum <= 138096 )
							if( Negative_Money_Flow <= 8758.19 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 8758.19 )
								ret := -0.250000
						if( Positive_Money_Flow_Sum > 138096 )
							if( Positive_Money_Flow_Sum <= 5.24443e+06 )
								if( Positive_Money_Flow_Sum <= 1.33313e+06 )
									ret := 0.276042
								if( Positive_Money_Flow_Sum > 1.33313e+06 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 5.24443e+06 )
								if( Negative_Money_Flow_Sum <= 245917 )
									ret := -0.714286 // sell
								if( Negative_Money_Flow_Sum > 245917 )
									ret := 0.078947
				if( bbm > 0.025794 )
					if( bbp <= -0.33296 )
						ret := 1.000000 // buy
					if( bbp > -0.33296 )
						if( bearPower <= -0.262543 )
							if( Positive_Money_Flow_Sum <= 488403 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 488403 )
								ret := -0.500000
						if( bearPower > -0.262543 )
							if( bearPower <= -0.171008 )
								if( Positive_Money_Flow <= 7983.08 )
									ret := 0.620690
								if( Positive_Money_Flow > 7983.08 )
									ret := -0.166667
							if( bearPower > -0.171008 )
								if( bbm <= 0.028732 )
									ret := -0.888889 // sell
								if( bbm > 0.028732 )
									ret := -0.050000
		if( Raw_Money_Flow > 70803.1 )
			if( bbp <= -0.365635 )
				if( Negative_Money_Flow_Sum <= 9.29565e+07 )
					if( Negative_Money_Flow_Sum <= 4.47658e+07 )
						if( Typical_Price <= 63.7348 )
							if( Positive_Money_Flow_Sum <= 6.5968e+07 )
								if( Negative_Money_Flow_Sum <= 1.60164e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.60164e+06 )
									ret := 0.408788
							if( Positive_Money_Flow_Sum > 6.5968e+07 )
								ret := -1.000000 // sell
						if( Typical_Price > 63.7348 )
							if( Negative_Money_Flow_Sum <= 993732 )
								if( bearPower <= -0.274135 )
									ret := 0.700000 // buy
								if( bearPower > -0.274135 )
									ret := 0.129032
							if( Negative_Money_Flow_Sum > 993732 )
								if( Negative_Money_Flow_Sum <= 2.12807e+07 )
									ret := 0.050562
								if( Negative_Money_Flow_Sum > 2.12807e+07 )
									ret := 0.280443
					if( Negative_Money_Flow_Sum > 4.47658e+07 )
						if( bearPower <= -0.374749 )
							if( bearPower <= -0.762026 )
								if( Money_Flow_Ratio <= 0.0997 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.0997 )
									ret := 0.923077 // buy
							if( bearPower > -0.762026 )
								if( bbm <= 0.129072 )
									ret := 0.562500
								if( bbm > 0.129072 )
									ret := -0.435583
						if( bearPower > -0.374749 )
							if( Money_Flow_Ratio <= 0.365366 )
								if( Typical_Price <= 68.8591 )
									ret := -0.461538
								if( Typical_Price > 68.8591 )
									ret := 0.571429
							if( Money_Flow_Ratio > 0.365366 )
								if( MFI_High <= -46.5847 )
									ret := 0.836735 // buy
								if( MFI_High > -46.5847 )
									ret := -0.350000
				if( Negative_Money_Flow_Sum > 9.29565e+07 )
					if( Raw_Money_Flow <= 2.99829e+07 )
						if( bbp <= -1.04234 )
							if( Negative_Money_Flow <= 9.4911e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 9.4911e+06 )
								ret := 0.500000
						if( bbp > -1.04234 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 2.99829e+07 )
						ret := 0.571429
			if( bbp > -0.365635 )
				if( Negative_Money_Flow_Sum <= 4.61858e+07 )
					if( Negative_Money_Flow_Sum <= 4.06724e+07 )
						if( bullPower <= 0.163372 )
							if( Positive_Money_Flow <= 5.51116e+06 )
								if( Negative_Money_Flow_Sum <= 2.8788e+07 )
									ret := 0.065567
								if( Negative_Money_Flow_Sum > 2.8788e+07 )
									ret := 0.240708
							if( Positive_Money_Flow > 5.51116e+06 )
								if( Positive_Money_Flow_Sum <= 9.99084e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 9.99084e+06 )
									ret := -0.526316
						if( bullPower > 0.163372 )
							if( Negative_Money_Flow <= 5.71743e+06 )
								if( Money_Flow_Ratio <= 2.19548 )
									ret := 0.931034 // buy
								if( Money_Flow_Ratio > 2.19548 )
									ret := 0.000000
							if( Negative_Money_Flow > 5.71743e+06 )
								ret := -0.500000
					if( Negative_Money_Flow_Sum > 4.06724e+07 )
						if( Positive_Money_Flow_Sum <= 2.16128e+07 )
							if( bbm <= 0.164419 )
								if( Money_Flow_Ratio <= 0.452521 )
									ret := 0.068182
								if( Money_Flow_Ratio > 0.452521 )
									ret := 0.866667 // buy
							if( bbm > 0.164419 )
								if( Raw_Money_Flow <= 6.50023e+06 )
									ret := -0.700000 // sell
								if( Raw_Money_Flow > 6.50023e+06 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.16128e+07 )
							if( Raw_Money_Flow <= 7.89462e+06 )
								if( bearPower <= -0.141808 )
									ret := -0.883333 // sell
								if( bearPower > -0.141808 )
									ret := -0.250000
							if( Raw_Money_Flow > 7.89462e+06 )
								if( bearPower <= -0.203535 )
									ret := -0.200000
								if( bearPower > -0.203535 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 4.61858e+07 )
					if( Positive_Money_Flow <= 1.08258e+07 )
						if( Negative_Money_Flow <= 2.05575e+07 )
							if( Raw_Money_Flow <= 4.0671e+06 )
								if( Money_Flow_Ratio <= 1.13436 )
									ret := 0.066667
								if( Money_Flow_Ratio > 1.13436 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 4.0671e+06 )
								if( bullPower <= -0.140967 )
									ret := -0.750000 // sell
								if( bullPower > -0.140967 )
									ret := 0.580189
						if( Negative_Money_Flow > 2.05575e+07 )
							if( Money_Flow_Ratio <= 0.251217 )
								ret := 0.428571
							if( Money_Flow_Ratio > 0.251217 )
								if( MFI_Low <= 2.81567 )
									ret := -1.000000 // sell
								if( MFI_Low > 2.81567 )
									ret := -0.421053
					if( Positive_Money_Flow > 1.08258e+07 )
						if( MFI_High <= -33.4597 )
							ret := -1.000000 // sell
						if( MFI_High > -33.4597 )
							ret := -0.250000
	if( bbp > -0.10321 )
		if( bearPower <= 0.078236 )
			if( Negative_Money_Flow <= 23.5481 )
				if( Negative_Money_Flow_Sum <= 3.67834e+07 )
					if( bearPower <= -0.197002 )
						if( bearPower <= -0.722335 )
							ret := 0.800000 // buy
						if( bearPower > -0.722335 )
							if( Typical_Price <= 58.6562 )
								ret := 0.600000
							if( Typical_Price > 58.6562 )
								if( Negative_Money_Flow_Sum <= 354709 )
									ret := -0.083333
								if( Negative_Money_Flow_Sum > 354709 )
									ret := -0.730159 // sell
					if( bearPower > -0.197002 )
						if( Positive_Money_Flow_Sum <= 2.42334e+06 )
							if( Positive_Money_Flow_Sum <= 326577 )
								if( bbm <= 0.121422 )
									ret := 0.033506
								if( bbm > 0.121422 )
									ret := -0.487179
							if( Positive_Money_Flow_Sum > 326577 )
								if( Raw_Money_Flow <= 635880 )
									ret := -0.140906
								if( Raw_Money_Flow > 635880 )
									ret := 0.246667
						if( Positive_Money_Flow_Sum > 2.42334e+06 )
							if( Positive_Money_Flow_Sum <= 4.10456e+07 )
								if( bbp <= 0.056515 )
									ret := 0.006013
								if( bbp > 0.056515 )
									ret := 0.065769
							if( Positive_Money_Flow_Sum > 4.10456e+07 )
								if( Money_Flow_Ratio <= 1.87357 )
									ret := 0.155172
								if( Money_Flow_Ratio > 1.87357 )
									ret := -0.367965
				if( Negative_Money_Flow_Sum > 3.67834e+07 )
					if( bbp <= -0.095582 )
						if( Typical_Price <= 61.8919 )
							if( Money_Flow_Ratio <= 1.05553 )
								ret := 0.857143 // buy
							if( Money_Flow_Ratio > 1.05553 )
								ret := 0.250000
						if( Typical_Price > 61.8919 )
							if( bullPower <= -0.03099 )
								ret := 0.250000
							if( bullPower > -0.03099 )
								ret := 0.000000
					if( bbp > -0.095582 )
						if( Positive_Money_Flow_Sum <= 3.46047e+07 )
							if( Positive_Money_Flow_Sum <= 3.17833e+07 )
								if( bullPower <= 0.119989 )
									ret := -0.166667
								if( bullPower > 0.119989 )
									ret := -0.840000 // sell
							if( Positive_Money_Flow_Sum > 3.17833e+07 )
								if( Negative_Money_Flow_Sum <= 5.22333e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 5.22333e+07 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 3.46047e+07 )
							if( Typical_Price <= 66.5836 )
								if( Negative_Money_Flow_Sum <= 4.22214e+07 )
									ret := 0.045455
								if( Negative_Money_Flow_Sum > 4.22214e+07 )
									ret := -0.647887
							if( Typical_Price > 66.5836 )
								if( Money_Flow_Ratio <= 1.96943 )
									ret := 0.095238
								if( Money_Flow_Ratio > 1.96943 )
									ret := -0.857143 // sell
			if( Negative_Money_Flow > 23.5481 )
				if( Positive_Money_Flow_Sum <= 396029 )
					if( bearPower <= 0.063826 )
						if( Negative_Money_Flow_Sum <= 147870 )
							if( Typical_Price <= 63.3468 )
								if( bbp <= 0.041404 )
									ret := 0.307692
								if( bbp > 0.041404 )
									ret := -0.210526
							if( Typical_Price > 63.3468 )
								if( Raw_Money_Flow <= 13636 )
									ret := 0.632653
								if( Raw_Money_Flow > 13636 )
									ret := 0.385714
						if( Negative_Money_Flow_Sum > 147870 )
							if( bullPower <= -0.027415 )
								if( Negative_Money_Flow <= 20058 )
									ret := 0.457447
								if( Negative_Money_Flow > 20058 )
									ret := 0.192708
							if( bullPower > -0.027415 )
								if( MFI_High <= -16.306 )
									ret := 0.082905
								if( MFI_High > -16.306 )
									ret := 0.617021
					if( bearPower > 0.063826 )
						if( Positive_Money_Flow <= 10415.1 )
							if( BBPower_Color <= 0.5 )
								if( Positive_Money_Flow_Sum <= 195098 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 195098 )
									ret := 0.500000
							if( BBPower_Color > 0.5 )
								if( Positive_Money_Flow_Sum <= 219690 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 219690 )
									ret := -0.555556
						if( Positive_Money_Flow > 10415.1 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 396029 )
					if( MFI <= 23.8123 )
						if( bullPower <= 0.129082 )
							if( bullPower <= -0.006691 )
								if( Positive_Money_Flow <= 3595.51 )
									ret := 0.056410
								if( Positive_Money_Flow > 3595.51 )
									ret := 0.733333 // buy
							if( bullPower > -0.006691 )
								if( bullPower <= 0.120487 )
									ret := -0.137845
								if( bullPower > 0.120487 )
									ret := 1.000000 // buy
						if( bullPower > 0.129082 )
							if( bearPower <= -0.239374 )
								ret := 0.000000
							if( bearPower > -0.239374 )
								if( bearPower <= 0.000442 )
									ret := -0.956522 // sell
								if( bearPower > 0.000442 )
									ret := -0.444444
					if( MFI > 23.8123 )
						if( bbm <= 0.189253 )
							if( Positive_Money_Flow_Sum <= 3.80251e+07 )
								if( Positive_Money_Flow <= 51940.5 )
									ret := 0.051868
								if( Positive_Money_Flow > 51940.5 )
									ret := 0.223301
							if( Positive_Money_Flow_Sum > 3.80251e+07 )
								if( Typical_Price <= 57.1946 )
									ret := 0.733333 // buy
								if( Typical_Price > 57.1946 )
									ret := -0.270195
						if( bbm > 0.189253 )
							if( Positive_Money_Flow_Sum <= 1.27772e+08 )
								if( Positive_Money_Flow_Sum <= 8.12411e+07 )
									ret := 0.178295
								if( Positive_Money_Flow_Sum > 8.12411e+07 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 1.27772e+08 )
								if( Typical_Price <= 62.2502 )
									ret := 1.000000 // buy
								if( Typical_Price > 62.2502 )
									ret := -0.666667
		if( bearPower > 0.078236 )
			if( Typical_Price <= 64.3155 )
				if( bullPower <= 0.243803 )
					if( Raw_Money_Flow <= 29454.8 )
						if( Positive_Money_Flow_Sum <= 150846 )
							if( MFI_Low <= -6.16705 )
								if( MFI <= 8.73061 )
									ret := -0.750000 // sell
								if( MFI > 8.73061 )
									ret := -1.000000 // sell
							if( MFI_Low > -6.16705 )
								if( Negative_Money_Flow_Sum <= 238555 )
									ret := -0.269231
								if( Negative_Money_Flow_Sum > 238555 )
									ret := 0.607843
						if( Positive_Money_Flow_Sum > 150846 )
							if( Money_Flow_Ratio <= 7.29169 )
								if( Positive_Money_Flow <= 133.799 )
									ret := -0.197368
								if( Positive_Money_Flow > 133.799 )
									ret := -0.636364
							if( Money_Flow_Ratio > 7.29169 )
								if( Money_Flow_Ratio <= 22.3619 )
									ret := 0.352941
								if( Money_Flow_Ratio > 22.3619 )
									ret := -0.428571
					if( Raw_Money_Flow > 29454.8 )
						if( Positive_Money_Flow_Sum <= 456689 )
							if( MFI_Low <= 39.0454 )
								if( Money_Flow_Ratio <= 0.150344 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.150344 )
									ret := 0.316176
							if( MFI_Low > 39.0454 )
								if( bbp <= 0.380312 )
									ret := -0.289474
								if( bbp > 0.380312 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 456689 )
							if( MFI_Low <= 73.3125 )
								if( MFI <= 31.3055 )
									ret := -0.909091 // sell
								if( MFI > 31.3055 )
									ret := -0.102233
							if( MFI_Low > 73.3125 )
								if( MFI_High <= 18.3388 )
									ret := -0.756757 // sell
								if( MFI_High > 18.3388 )
									ret := 0.142857
				if( bullPower > 0.243803 )
					if( bearPower <= 0.820128 )
						if( Raw_Money_Flow <= 16881.7 )
							if( Positive_Money_Flow_Sum <= 80702.4 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 80702.4 )
								if( bbp <= 0.502383 )
									ret := 0.000000
								if( bbp > 0.502383 )
									ret := -0.890909 // sell
						if( Raw_Money_Flow > 16881.7 )
							if( Positive_Money_Flow_Sum <= 1.05098e+08 )
								if( bbm <= 0.135614 )
									ret := -0.451128
								if( bbm > 0.135614 )
									ret := -0.195266
							if( Positive_Money_Flow_Sum > 1.05098e+08 )
								if( Typical_Price <= 62.1757 )
									ret := -1.000000 // sell
								if( Typical_Price > 62.1757 )
									ret := -0.800000 // sell
					if( bearPower > 0.820128 )
						if( Raw_Money_Flow <= 1.53624e+06 )
							if( bbm <= 0.215 )
								ret := 0.500000
							if( bbm > 0.215 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.53624e+06 )
							ret := -0.500000
			if( Typical_Price > 64.3155 )
				if( Positive_Money_Flow_Sum <= 4.4889e+07 )
					if( Positive_Money_Flow_Sum <= 2.92837e+07 )
						if( Positive_Money_Flow_Sum <= 683530 )
							if( MFI <= 17.6151 )
								if( bearPower <= 0.126271 )
									ret := -0.105263
								if( bearPower > 0.126271 )
									ret := 0.906250 // buy
							if( MFI > 17.6151 )
								if( Raw_Money_Flow <= 267342 )
									ret := -0.223022
								if( Raw_Money_Flow > 267342 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 683530 )
							if( Positive_Money_Flow <= 1.62534e+06 )
								if( bbp <= 1.21289 )
									ret := 0.011590
								if( bbp > 1.21289 )
									ret := 0.641509
							if( Positive_Money_Flow > 1.62534e+06 )
								if( Positive_Money_Flow <= 9.22119e+06 )
									ret := -0.195596
								if( Positive_Money_Flow > 9.22119e+06 )
									ret := 0.750000 // buy
					if( Positive_Money_Flow_Sum > 2.92837e+07 )
						if( Negative_Money_Flow_Sum <= 1.14569e+07 )
							if( Positive_Money_Flow_Sum <= 4.15319e+07 )
								if( Positive_Money_Flow <= 3.57968e+06 )
									ret := -0.015748
								if( Positive_Money_Flow > 3.57968e+06 )
									ret := 0.579710
							if( Positive_Money_Flow_Sum > 4.15319e+07 )
								if( Money_Flow_Ratio <= 18.7351 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 18.7351 )
									ret := 0.200000
						if( Negative_Money_Flow_Sum > 1.14569e+07 )
							if( bbp <= 0.475837 )
								if( Negative_Money_Flow_Sum <= 3.65534e+07 )
									ret := 0.239130
								if( Negative_Money_Flow_Sum > 3.65534e+07 )
									ret := -0.750000 // sell
							if( bbp > 0.475837 )
								if( Money_Flow_Ratio <= 2.44564 )
									ret := 0.227273
								if( Money_Flow_Ratio > 2.44564 )
									ret := 0.923077 // buy
				if( Positive_Money_Flow_Sum > 4.4889e+07 )
					if( Positive_Money_Flow_Sum <= 8.13987e+07 )
						if( Positive_Money_Flow <= 1.06511e+07 )
							if( Negative_Money_Flow_Sum <= 1.93006e+07 )
								if( Positive_Money_Flow_Sum <= 5.19808e+07 )
									ret := -0.328125
								if( Positive_Money_Flow_Sum > 5.19808e+07 )
									ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 1.93006e+07 )
								if( Raw_Money_Flow <= 13011.5 )
									ret := -0.888889 // sell
								if( Raw_Money_Flow > 13011.5 )
									ret := -0.016393
						if( Positive_Money_Flow > 1.06511e+07 )
							if( bearPower <= 0.170279 )
								ret := 0.000000
							if( bearPower > 0.170279 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 8.13987e+07 )
						if( Negative_Money_Flow_Sum <= 1.65467e+08 )
							if( Typical_Price <= 68.3184 )
								if( Positive_Money_Flow_Sum <= 8.7614e+07 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 8.7614e+07 )
									ret := -0.976190 // sell
							if( Typical_Price > 68.3184 )
								if( Positive_Money_Flow_Sum <= 9.98878e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 9.98878e+07 )
									ret := -0.800000 // sell
						if( Negative_Money_Flow_Sum > 1.65467e+08 )
							ret := 0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SHOP_1Min_52ea4914(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


