//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: AAPL_30Min_1M00_fb8718e7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_1M00_fb8718e7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_fb8718e7(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI_Low <= 46.7935 )
		if( Raw_Money_Flow <= 3.14848e+08 )
			if( Typical_Price <= 221.296 )
				if( Typical_Price <= 143.226 )
					if( Money_Flow_Ratio <= 0.014872 )
						if( Raw_Money_Flow <= 4.79562e+06 )
							if( Negative_Money_Flow_Sum <= 3.54155e+08 )
								if( Typical_Price <= 99.8528 )
									ret := 0.705882 // buy
								if( Typical_Price > 99.8528 )
									ret := 0.956522 // buy
							if( Negative_Money_Flow_Sum > 3.54155e+08 )
								if( Positive_Money_Flow <= 328437 )
									ret := 0.170000
								if( Positive_Money_Flow > 328437 )
									ret := -0.122137
						if( Raw_Money_Flow > 4.79562e+06 )
							if( Money_Flow_Ratio <= 0.003385 )
								if( Negative_Money_Flow <= 2.03021e+08 )
									ret := -0.217391
								if( Negative_Money_Flow > 2.03021e+08 )
									ret := 0.666667
							if( Money_Flow_Ratio > 0.003385 )
								if( Positive_Money_Flow <= 111630 )
									ret := 0.330357
								if( Positive_Money_Flow > 111630 )
									ret := 0.760563 // buy
					if( Money_Flow_Ratio > 0.014872 )
						if( MFI <= 25.2399 )
							if( MFI_Low <= -6.88571 )
								if( MFI_High <= -74.6472 )
									ret := -0.108153
								if( MFI_High > -74.6472 )
									ret := 0.170096
							if( MFI_Low > -6.88571 )
								if( Positive_Money_Flow_Sum <= 4.85879e+08 )
									ret := -0.272981
								if( Positive_Money_Flow_Sum > 4.85879e+08 )
									ret := -0.019152
						if( MFI > 25.2399 )
							if( Negative_Money_Flow_Sum <= 1.51996e+07 )
								if( Positive_Money_Flow_Sum <= 7.4645e+06 )
									ret := 0.028571
								if( Positive_Money_Flow_Sum > 7.4645e+06 )
									ret := -0.526502
							if( Negative_Money_Flow_Sum > 1.51996e+07 )
								if( Typical_Price <= 94.6786 )
									ret := 0.380597
								if( Typical_Price > 94.6786 )
									ret := 0.074595
				if( Typical_Price > 143.226 )
					if( Negative_Money_Flow_Sum <= 1.23351e+09 )
						if( Positive_Money_Flow <= 459082 )
							if( Positive_Money_Flow_Sum <= 4.97248e+06 )
								if( Typical_Price <= 195.641 )
									ret := -0.141975
								if( Typical_Price > 195.641 )
									ret := -0.633333
							if( Positive_Money_Flow_Sum > 4.97248e+06 )
								if( Negative_Money_Flow_Sum <= 4.06373e+08 )
									ret := 0.030766
								if( Negative_Money_Flow_Sum > 4.06373e+08 )
									ret := 0.146910
						if( Positive_Money_Flow > 459082 )
							if( Negative_Money_Flow_Sum <= 4.19476e+07 )
								if( Negative_Money_Flow_Sum <= 2.75184e+07 )
									ret := -0.082497
								if( Negative_Money_Flow_Sum > 2.75184e+07 )
									ret := 0.320442
							if( Negative_Money_Flow_Sum > 4.19476e+07 )
								if( Raw_Money_Flow <= 4.62912e+07 )
									ret := -0.178899
								if( Raw_Money_Flow > 4.62912e+07 )
									ret := 0.010417
					if( Negative_Money_Flow_Sum > 1.23351e+09 )
						if( Positive_Money_Flow_Sum <= 4.13866e+09 )
							if( Negative_Money_Flow_Sum <= 1.86279e+09 )
								if( MFI_Low <= 44.0709 )
									ret := -0.099835
								if( MFI_Low > 44.0709 )
									ret := -0.397516
							if( Negative_Money_Flow_Sum > 1.86279e+09 )
								if( Negative_Money_Flow_Sum <= 1.9525e+09 )
									ret := 0.199262
								if( Negative_Money_Flow_Sum > 1.9525e+09 )
									ret := -0.035293
						if( Positive_Money_Flow_Sum > 4.13866e+09 )
							if( Typical_Price <= 145.946 )
								if( Positive_Money_Flow_Sum <= 6.07935e+09 )
									ret := -0.138889
								if( Positive_Money_Flow_Sum > 6.07935e+09 )
									ret := 0.625000
							if( Typical_Price > 145.946 )
								if( Positive_Money_Flow <= 2.31662e+07 )
									ret := -0.288121
								if( Positive_Money_Flow > 2.31662e+07 )
									ret := 0.057895
			if( Typical_Price > 221.296 )
				if( Money_Flow_Ratio <= 0.499958 )
					if( Negative_Money_Flow_Sum <= 1.78108e+08 )
						if( Positive_Money_Flow_Sum <= 6.28594e+07 )
							if( Positive_Money_Flow <= 1.93908e+07 )
								if( Negative_Money_Flow <= 1.75728e+07 )
									ret := 0.197183
								if( Negative_Money_Flow > 1.75728e+07 )
									ret := -0.296460
							if( Positive_Money_Flow > 1.93908e+07 )
								if( Money_Flow_Ratio <= 0.411715 )
									ret := 0.454545
								if( Money_Flow_Ratio > 0.411715 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.28594e+07 )
							ret := -0.941176 // sell
					if( Negative_Money_Flow_Sum > 1.78108e+08 )
						if( Negative_Money_Flow <= 17578.2 )
							if( Money_Flow_Ratio <= 0.079356 )
								if( Positive_Money_Flow_Sum <= 1.26083e+07 )
									ret := -0.437500
								if( Positive_Money_Flow_Sum > 1.26083e+07 )
									ret := 0.297297
							if( Money_Flow_Ratio > 0.079356 )
								if( MFI <= 24.414 )
									ret := -0.174419
								if( MFI > 24.414 )
									ret := 0.256158
						if( Negative_Money_Flow > 17578.2 )
							if( Negative_Money_Flow_Sum <= 1.60068e+10 )
								if( MFI <= 1.11609 )
									ret := -0.066667
								if( MFI > 1.11609 )
									ret := 0.403905
							if( Negative_Money_Flow_Sum > 1.60068e+10 )
								if( MFI_Low <= 2.12635 )
									ret := 0.200000
								if( MFI_Low > 2.12635 )
									ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.499958 )
					if( MFI_High <= -44.7395 )
						if( Negative_Money_Flow_Sum <= 6.22665e+07 )
							ret := 0.800000 // buy
						if( Negative_Money_Flow_Sum > 6.22665e+07 )
							if( Positive_Money_Flow_Sum <= 3.28791e+09 )
								if( Negative_Money_Flow <= 4.22307e+06 )
									ret := -0.130435
								if( Negative_Money_Flow > 4.22307e+06 )
									ret := -0.612245
							if( Positive_Money_Flow_Sum > 3.28791e+09 )
								ret := 0.500000
					if( MFI_High > -44.7395 )
						if( MFI <= 37.0886 )
							if( Positive_Money_Flow_Sum <= 2.72656e+09 )
								if( Raw_Money_Flow <= 1.24037e+08 )
									ret := 0.460674
								if( Raw_Money_Flow > 1.24037e+08 )
									ret := -0.296296
							if( Positive_Money_Flow_Sum > 2.72656e+09 )
								if( Negative_Money_Flow_Sum <= 5.64252e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 5.64252e+09 )
									ret := 0.285714
						if( MFI > 37.0886 )
							if( Negative_Money_Flow_Sum <= 3.98083e+09 )
								if( Negative_Money_Flow_Sum <= 2.76964e+09 )
									ret := 0.065606
								if( Negative_Money_Flow_Sum > 2.76964e+09 )
									ret := 0.257606
							if( Negative_Money_Flow_Sum > 3.98083e+09 )
								if( MFI_High <= -38.4915 )
									ret := 0.100000
								if( MFI_High > -38.4915 )
									ret := -0.356968
		if( Raw_Money_Flow > 3.14848e+08 )
			if( Negative_Money_Flow_Sum <= 4.17465e+09 )
				if( Positive_Money_Flow <= 4.28231e+08 )
					if( Negative_Money_Flow <= 4.39794e+08 )
						if( Positive_Money_Flow_Sum <= 3.55514e+09 )
							if( Positive_Money_Flow_Sum <= 2.01425e+09 )
								if( Positive_Money_Flow <= 3.62474e+08 )
									ret := -0.076126
								if( Positive_Money_Flow > 3.62474e+08 )
									ret := 0.154867
							if( Positive_Money_Flow_Sum > 2.01425e+09 )
								if( Negative_Money_Flow <= 3.60314e+08 )
									ret := -0.240039
								if( Negative_Money_Flow > 3.60314e+08 )
									ret := -0.012072
						if( Positive_Money_Flow_Sum > 3.55514e+09 )
							if( Negative_Money_Flow_Sum <= 2.09286e+09 )
								if( Money_Flow_Ratio <= 1.94321 )
									ret := 0.066667
								if( Money_Flow_Ratio > 1.94321 )
									ret := 0.652174
							if( Negative_Money_Flow_Sum > 2.09286e+09 )
								if( Money_Flow_Ratio <= 1.32123 )
									ret := -0.698413
								if( Money_Flow_Ratio > 1.32123 )
									ret := -0.431818
					if( Negative_Money_Flow > 4.39794e+08 )
						if( Raw_Money_Flow <= 2.31569e+09 )
							if( Positive_Money_Flow_Sum <= 2.02912e+09 )
								if( Negative_Money_Flow <= 6.96961e+08 )
									ret := 0.078682
								if( Negative_Money_Flow > 6.96961e+08 )
									ret := -0.082043
							if( Positive_Money_Flow_Sum > 2.02912e+09 )
								if( MFI_Low <= 19.6884 )
									ret := 0.664062
								if( MFI_Low > 19.6884 )
									ret := 0.077220
						if( Raw_Money_Flow > 2.31569e+09 )
							if( Positive_Money_Flow_Sum <= 1.16621e+08 )
								if( MFI <= 2.76905 )
									ret := -0.343750
								if( MFI > 2.76905 )
									ret := -0.744681 // sell
							if( Positive_Money_Flow_Sum > 1.16621e+08 )
								if( MFI_Low <= -15.6999 )
									ret := 0.500000
								if( MFI_Low > -15.6999 )
									ret := -0.402235
				if( Positive_Money_Flow > 4.28231e+08 )
					if( Positive_Money_Flow_Sum <= 1.03244e+09 )
						if( MFI_High <= -63.1381 )
							if( MFI_Low <= -6.92577 )
								ret := 0.777778 // buy
							if( MFI_Low > -6.92577 )
								if( Typical_Price <= 128.973 )
									ret := 0.642857
								if( Typical_Price > 128.973 )
									ret := -0.426667
						if( MFI_High > -63.1381 )
							if( Typical_Price <= 153.346 )
								if( Positive_Money_Flow_Sum <= 8.40944e+08 )
									ret := 0.654206
								if( Positive_Money_Flow_Sum > 8.40944e+08 )
									ret := 0.320513
							if( Typical_Price > 153.346 )
								if( Raw_Money_Flow <= 5.14335e+08 )
									ret := 0.596154
								if( Raw_Money_Flow > 5.14335e+08 )
									ret := 0.175000
					if( Positive_Money_Flow_Sum > 1.03244e+09 )
						if( MFI <= 52.0678 )
							if( Raw_Money_Flow <= 4.76091e+08 )
								if( MFI <= 31.2216 )
									ret := -0.400000
								if( MFI > 31.2216 )
									ret := 0.220994
							if( Raw_Money_Flow > 4.76091e+08 )
								if( Money_Flow_Ratio <= 0.987895 )
									ret := -0.145144
								if( Money_Flow_Ratio > 0.987895 )
									ret := -0.418182
						if( MFI > 52.0678 )
							if( Negative_Money_Flow_Sum <= 2.29637e+09 )
								if( Positive_Money_Flow_Sum <= 3.54174e+09 )
									ret := 0.138648
								if( Positive_Money_Flow_Sum > 3.54174e+09 )
									ret := 0.613333
							if( Negative_Money_Flow_Sum > 2.29637e+09 )
								if( Positive_Money_Flow_Sum <= 4.5325e+09 )
									ret := -0.161148
								if( Positive_Money_Flow_Sum > 4.5325e+09 )
									ret := 0.103226
			if( Negative_Money_Flow_Sum > 4.17465e+09 )
				if( MFI <= 1.39153 )
					if( Typical_Price <= 176.382 )
						if( Negative_Money_Flow <= 7.94987e+08 )
							if( Negative_Money_Flow_Sum <= 5.01148e+09 )
								ret := 0.142857
							if( Negative_Money_Flow_Sum > 5.01148e+09 )
								if( Negative_Money_Flow <= 6.7541e+08 )
									ret := -0.814815 // sell
								if( Negative_Money_Flow > 6.7541e+08 )
									ret := -0.285714
						if( Negative_Money_Flow > 7.94987e+08 )
							if( Typical_Price <= 160.252 )
								if( MFI_High <= -79.5203 )
									ret := -0.700000 // sell
								if( MFI_High > -79.5203 )
									ret := -0.943662 // sell
							if( Typical_Price > 160.252 )
								ret := -0.650000
					if( Typical_Price > 176.382 )
						if( Negative_Money_Flow_Sum <= 5.09194e+09 )
							ret := 0.250000
						if( Negative_Money_Flow_Sum > 5.09194e+09 )
							if( Typical_Price <= 200.935 )
								ret := -0.100000
							if( Typical_Price > 200.935 )
								if( MFI_Low <= -19.1241 )
									ret := -0.583333
								if( MFI_Low > -19.1241 )
									ret := -0.833333 // sell
				if( MFI > 1.39153 )
					if( MFI_Low <= 35.4987 )
						if( MFI_Low <= 17.2434 )
							if( Negative_Money_Flow_Sum <= 1.09932e+10 )
								if( Negative_Money_Flow_Sum <= 7.08725e+09 )
									ret := -0.136412
								if( Negative_Money_Flow_Sum > 7.08725e+09 )
									ret := -0.365512
							if( Negative_Money_Flow_Sum > 1.09932e+10 )
								if( MFI_High <= -54.8092 )
									ret := 0.254181
								if( MFI_High > -54.8092 )
									ret := -0.101942
						if( MFI_Low > 17.2434 )
							if( MFI_High <= -26.8062 )
								if( Typical_Price <= 299.17 )
									ret := -0.065239
								if( Typical_Price > 299.17 )
									ret := 0.277372
							if( MFI_High > -26.8062 )
								if( Negative_Money_Flow_Sum <= 7.14045e+09 )
									ret := 0.398104
								if( Negative_Money_Flow_Sum > 7.14045e+09 )
									ret := -0.363636
					if( MFI_Low > 35.4987 )
						if( Negative_Money_Flow_Sum <= 1.0978e+10 )
							if( Raw_Money_Flow <= 1.23606e+09 )
								if( Positive_Money_Flow_Sum <= 6.74523e+09 )
									ret := -0.240741
								if( Positive_Money_Flow_Sum > 6.74523e+09 )
									ret := -0.610224
							if( Raw_Money_Flow > 1.23606e+09 )
								if( Negative_Money_Flow_Sum <= 9.56751e+09 )
									ret := -0.115854
								if( Negative_Money_Flow_Sum > 9.56751e+09 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.0978e+10 )
							ret := 0.500000
	if( MFI_Low > 46.7935 )
		if( MFI_Low <= 78.2642 )
			if( MFI_Low <= 56.264 )
				if( Negative_Money_Flow_Sum <= 3.23122e+09 )
					if( Positive_Money_Flow_Sum <= 1.43813e+08 )
						if( Negative_Money_Flow_Sum <= 2.84582e+07 )
							if( MFI_Low <= 50.7398 )
								if( Positive_Money_Flow <= 1.83377e+07 )
									ret := -0.116766
								if( Positive_Money_Flow > 1.83377e+07 )
									ret := 0.363636
							if( MFI_Low > 50.7398 )
								if( Negative_Money_Flow_Sum <= 1.05796e+07 )
									ret := 0.422222
								if( Negative_Money_Flow_Sum > 1.05796e+07 )
									ret := 0.117143
						if( Negative_Money_Flow_Sum > 2.84582e+07 )
							if( Positive_Money_Flow_Sum <= 7.66155e+07 )
								if( MFI_High <= -10.3761 )
									ret := 0.682353
								if( MFI_High > -10.3761 )
									ret := 0.290323
							if( Positive_Money_Flow_Sum > 7.66155e+07 )
								if( MFI <= 71.5741 )
									ret := 0.141479
								if( MFI > 71.5741 )
									ret := 0.461538
					if( Positive_Money_Flow_Sum > 1.43813e+08 )
						if( Negative_Money_Flow <= 1.28209e+09 )
							if( Positive_Money_Flow <= 7.50704e+08 )
								if( Positive_Money_Flow <= 7.44008e+08 )
									ret := 0.048389
								if( Positive_Money_Flow > 7.44008e+08 )
									ret := -0.894737 // sell
							if( Positive_Money_Flow > 7.50704e+08 )
								if( Positive_Money_Flow <= 7.93769e+08 )
									ret := 0.701493 // buy
								if( Positive_Money_Flow > 7.93769e+08 )
									ret := 0.253918
						if( Negative_Money_Flow > 1.28209e+09 )
							if( Negative_Money_Flow_Sum <= 2.63466e+09 )
								if( Positive_Money_Flow_Sum <= 4.28229e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.28229e+09 )
									ret := 0.814815 // buy
							if( Negative_Money_Flow_Sum > 2.63466e+09 )
								ret := -0.200000
				if( Negative_Money_Flow_Sum > 3.23122e+09 )
					if( Positive_Money_Flow_Sum <= 1.82691e+10 )
						if( Raw_Money_Flow <= 9.09369e+07 )
							if( Typical_Price <= 130.782 )
								if( Raw_Money_Flow <= 3.47475e+07 )
									ret := 0.941176 // buy
								if( Raw_Money_Flow > 3.47475e+07 )
									ret := 0.416667
							if( Typical_Price > 130.782 )
								if( Positive_Money_Flow <= 3.71836e+06 )
									ret := -0.351648
								if( Positive_Money_Flow > 3.71836e+06 )
									ret := 0.215909
						if( Raw_Money_Flow > 9.09369e+07 )
							if( Positive_Money_Flow_Sum <= 9.57675e+09 )
								if( Negative_Money_Flow_Sum <= 3.53341e+09 )
									ret := -0.467532
								if( Negative_Money_Flow_Sum > 3.53341e+09 )
									ret := 0.438202
							if( Positive_Money_Flow_Sum > 9.57675e+09 )
								if( Typical_Price <= 173.856 )
									ret := -0.175000
								if( Typical_Price > 173.856 )
									ret := -0.793651 // sell
					if( Positive_Money_Flow_Sum > 1.82691e+10 )
						if( Money_Flow_Ratio <= 2.88037 )
							ret := 0.363636
						if( Money_Flow_Ratio > 2.88037 )
							ret := 0.777778 // buy
			if( MFI_Low > 56.264 )
				if( Positive_Money_Flow <= 1.01071e+09 )
					if( Positive_Money_Flow_Sum <= 7.37817e+09 )
						if( Positive_Money_Flow_Sum <= 1.98445e+09 )
							if( Negative_Money_Flow_Sum <= 4.76247e+08 )
								if( Positive_Money_Flow <= 5.07976e+07 )
									ret := 0.094212
								if( Positive_Money_Flow > 5.07976e+07 )
									ret := -0.070304
							if( Negative_Money_Flow_Sum > 4.76247e+08 )
								if( Positive_Money_Flow_Sum <= 1.95242e+09 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 1.95242e+09 )
									ret := -0.133333
						if( Positive_Money_Flow_Sum > 1.98445e+09 )
							if( MFI <= 87.9531 )
								if( MFI_Low <= 57.1791 )
									ret := -0.227743
								if( MFI_Low > 57.1791 )
									ret := -0.008770
							if( MFI > 87.9531 )
								if( Positive_Money_Flow <= 487917 )
									ret := 0.004673
								if( Positive_Money_Flow > 487917 )
									ret := -0.196412
					if( Positive_Money_Flow_Sum > 7.37817e+09 )
						if( Money_Flow_Ratio <= 62.7999 )
							if( Raw_Money_Flow <= 9.24667e+06 )
								if( MFI <= 89.3482 )
									ret := -0.202335
								if( MFI > 89.3482 )
									ret := 0.194175
							if( Raw_Money_Flow > 9.24667e+06 )
								if( MFI <= 77.7154 )
									ret := -0.131783
								if( MFI > 77.7154 )
									ret := 0.246291
						if( Money_Flow_Ratio > 62.7999 )
							if( Negative_Money_Flow_Sum <= 4.65108e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.65108e+08 )
								ret := 0.800000 // buy
				if( Positive_Money_Flow > 1.01071e+09 )
					if( Negative_Money_Flow_Sum <= 3.86578e+07 )
						if( Positive_Money_Flow_Sum <= 1.32765e+09 )
							if( MFI_High <= 18.1021 )
								if( Positive_Money_Flow <= 1.12224e+09 )
									ret := 0.622222
								if( Positive_Money_Flow > 1.12224e+09 )
									ret := 0.848485 // buy
							if( MFI_High > 18.1021 )
								ret := -0.250000
						if( Positive_Money_Flow_Sum > 1.32765e+09 )
							if( Positive_Money_Flow <= 1.48268e+09 )
								ret := -0.650000
							if( Positive_Money_Flow > 1.48268e+09 )
								if( MFI_Low <= 78.1591 )
									ret := 0.814815 // buy
								if( MFI_Low > 78.1591 )
									ret := 0.200000
					if( Negative_Money_Flow_Sum > 3.86578e+07 )
						if( Positive_Money_Flow_Sum <= 1.08949e+09 )
							if( MFI_Low <= 73.9269 )
								ret := 1.000000 // buy
							if( MFI_Low > 73.9269 )
								ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 1.08949e+09 )
							if( MFI_High <= -1.21209 )
								if( Raw_Money_Flow <= 1.2864e+09 )
									ret := 0.214286
								if( Raw_Money_Flow > 1.2864e+09 )
									ret := 0.548387
							if( MFI_High > -1.21209 )
								if( Positive_Money_Flow_Sum <= 5.56095e+09 )
									ret := -0.029762
								if( Positive_Money_Flow_Sum > 5.56095e+09 )
									ret := 0.140458
		if( MFI_Low > 78.2642 )
			if( Positive_Money_Flow_Sum <= 2.63445e+09 )
				if( Negative_Money_Flow_Sum <= 2.88098e+07 )
					if( Negative_Money_Flow <= 4.06707e+06 )
						if( Money_Flow_Ratio <= 83.4423 )
							if( Positive_Money_Flow <= 1.57063e+09 )
								if( Money_Flow_Ratio <= 79.0239 )
									ret := 0.167647
								if( Money_Flow_Ratio > 79.0239 )
									ret := 0.525641
							if( Positive_Money_Flow > 1.57063e+09 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 83.4423 )
							if( Positive_Money_Flow_Sum <= 7.36752e+08 )
								if( Typical_Price <= 104.819 )
									ret := -0.392157
								if( Typical_Price > 104.819 )
									ret := 0.368182
							if( Positive_Money_Flow_Sum > 7.36752e+08 )
								if( Typical_Price <= 135.392 )
									ret := -0.231023
								if( Typical_Price > 135.392 )
									ret := 0.076280
					if( Negative_Money_Flow > 4.06707e+06 )
						if( MFI_High <= 18.8061 )
							if( MFI_High <= 18.445 )
								ret := 0.500000
							if( MFI_High > 18.445 )
								if( Positive_Money_Flow_Sum <= 1.12031e+09 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 1.12031e+09 )
									ret := 0.928571 // buy
						if( MFI_High > 18.8061 )
							if( Positive_Money_Flow_Sum <= 1.40999e+09 )
								ret := 0.823529 // buy
							if( Positive_Money_Flow_Sum > 1.40999e+09 )
								ret := -0.285714
				if( Negative_Money_Flow_Sum > 2.88098e+07 )
					if( Negative_Money_Flow_Sum <= 3.73596e+07 )
						if( Positive_Money_Flow <= 3.55983e+08 )
							if( Raw_Money_Flow <= 3.06627e+06 )
								if( Typical_Price <= 165.861 )
									ret := 0.600000
								if( Typical_Price > 165.861 )
									ret := 0.125000
							if( Raw_Money_Flow > 3.06627e+06 )
								if( Negative_Money_Flow <= 1.04993e+06 )
									ret := 0.285714
								if( Negative_Money_Flow > 1.04993e+06 )
									ret := -0.826087 // sell
						if( Positive_Money_Flow > 3.55983e+08 )
							if( Positive_Money_Flow_Sum <= 2.13443e+09 )
								if( Positive_Money_Flow <= 4.27448e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 4.27448e+08 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.13443e+09 )
								if( Negative_Money_Flow_Sum <= 3.36152e+07 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 3.36152e+07 )
									ret := -0.307692
					if( Negative_Money_Flow_Sum > 3.73596e+07 )
						if( Raw_Money_Flow <= 8.82009e+08 )
							ret := -0.076923
						if( Raw_Money_Flow > 8.82009e+08 )
							ret := 0.833333 // buy
			if( Positive_Money_Flow_Sum > 2.63445e+09 )
				if( Negative_Money_Flow <= 40118.4 )
					if( Raw_Money_Flow <= 7.80804e+06 )
						if( MFI_High <= 19.7266 )
							if( Negative_Money_Flow_Sum <= 1.37083e+07 )
								if( MFI_Low <= 79.6525 )
									ret := -0.666667
								if( MFI_Low > 79.6525 )
									ret := -0.416667
							if( Negative_Money_Flow_Sum > 1.37083e+07 )
								if( Negative_Money_Flow_Sum <= 1.55031e+07 )
									ret := 0.615385
								if( Negative_Money_Flow_Sum > 1.55031e+07 )
									ret := -0.004219
						if( MFI_High > 19.7266 )
							if( MFI_High <= 19.7852 )
								ret := -0.692308
							if( MFI_High > 19.7852 )
								if( Positive_Money_Flow <= 2.04493e+06 )
									ret := 0.055556
								if( Positive_Money_Flow > 2.04493e+06 )
									ret := -0.214286
					if( Raw_Money_Flow > 7.80804e+06 )
						if( Typical_Price <= 172.832 )
							if( Raw_Money_Flow <= 2.69825e+09 )
								if( Money_Flow_Ratio <= 67.9625 )
									ret := 0.703125 // buy
								if( Money_Flow_Ratio > 67.9625 )
									ret := 0.337461
							if( Raw_Money_Flow > 2.69825e+09 )
								ret := -0.750000 // sell
						if( Typical_Price > 172.832 )
							if( MFI_Low <= 78.721 )
								if( Raw_Money_Flow <= 7.7305e+08 )
									ret := -0.058824
								if( Raw_Money_Flow > 7.7305e+08 )
									ret := 0.649123
							if( MFI_Low > 78.721 )
								if( Negative_Money_Flow_Sum <= 1.75454e+07 )
									ret := 0.181818
								if( Negative_Money_Flow_Sum > 1.75454e+07 )
									ret := -0.128834
				if( Negative_Money_Flow > 40118.4 )
					if( MFI_High <= 18.8418 )
						if( Negative_Money_Flow_Sum <= 4.59148e+07 )
							if( Typical_Price <= 169.607 )
								if( Money_Flow_Ratio <= 83.7702 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 83.7702 )
									ret := 0.454545
							if( Typical_Price > 169.607 )
								ret := -0.400000
						if( Negative_Money_Flow_Sum > 4.59148e+07 )
							if( Negative_Money_Flow_Sum <= 1.09895e+08 )
								if( Raw_Money_Flow <= 1.1635e+07 )
									ret := 0.031250
								if( Raw_Money_Flow > 1.1635e+07 )
									ret := -0.357143
							if( Negative_Money_Flow_Sum > 1.09895e+08 )
								ret := 0.375000
					if( MFI_High > 18.8418 )
						if( Typical_Price <= 194.845 )
							if( Negative_Money_Flow_Sum <= 2.6964e+07 )
								if( Negative_Money_Flow_Sum <= 2.57233e+07 )
									ret := 0.158333
								if( Negative_Money_Flow_Sum > 2.57233e+07 )
									ret := -0.625000
							if( Negative_Money_Flow_Sum > 2.6964e+07 )
								if( Positive_Money_Flow <= 34654.9 )
									ret := 0.357143
								if( Positive_Money_Flow > 34654.9 )
									ret := 0.775000 // buy
						if( Typical_Price > 194.845 )
							if( Raw_Money_Flow <= 5.66539e+06 )
								if( Money_Flow_Ratio <= 209.458 )
									ret := 0.615385
								if( Money_Flow_Ratio > 209.458 )
									ret := 0.975000 // buy
							if( Raw_Money_Flow > 5.66539e+06 )
								if( Positive_Money_Flow_Sum <= 4.6248e+09 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 4.6248e+09 )
									ret := 0.222222
	
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
float op_operation = decision_tree_0_AAPL_30Min_fb8718e7(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


