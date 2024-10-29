//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: GOOG_15Min_2CM0_22462a82 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_15Min_2CM0_22462a82", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_15Min_22462a82(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= 405.381 )
		if( Raw_Money_Flow <= 1.33772e+07 )
			if( Typical_Price <= 2062.45 )
				if( Negative_Money_Flow <= 189038 )
					if( MFI_High <= -26.3869 )
						if( Typical_Price <= 423.125 )
							if( Positive_Money_Flow <= 9.59489e+06 )
								if( Positive_Money_Flow_Sum <= 486842 )
									ret := -0.208000
								if( Positive_Money_Flow_Sum > 486842 )
									ret := 0.064008
							if( Positive_Money_Flow > 9.59489e+06 )
								if( Negative_Money_Flow_Sum <= 3.54012e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.54012e+08 )
									ret := 0.000000
						if( Typical_Price > 423.125 )
							if( Typical_Price <= 1110.02 )
								if( Positive_Money_Flow_Sum <= 4.5868e+08 )
									ret := 0.262587
								if( Positive_Money_Flow_Sum > 4.5868e+08 )
									ret := -0.188119
							if( Typical_Price > 1110.02 )
								if( MFI <= 52.2866 )
									ret := 0.103240
								if( MFI > 52.2866 )
									ret := 0.535714
					if( MFI_High > -26.3869 )
						if( MFI_Low <= 75.5238 )
							if( Typical_Price <= 929.917 )
								if( Positive_Money_Flow <= 1.99266e+06 )
									ret := 0.036517
								if( Positive_Money_Flow > 1.99266e+06 )
									ret := 0.208238
							if( Typical_Price > 929.917 )
								if( Positive_Money_Flow_Sum <= 1.34494e+09 )
									ret := -0.036324
								if( Positive_Money_Flow_Sum > 1.34494e+09 )
									ret := -0.407821
						if( MFI_Low > 75.5238 )
							if( Positive_Money_Flow <= 5.73678e+06 )
								if( Positive_Money_Flow <= 3.26713e+06 )
									ret := 0.201320
								if( Positive_Money_Flow > 3.26713e+06 )
									ret := 0.809524 // buy
							if( Positive_Money_Flow > 5.73678e+06 )
								if( Money_Flow_Ratio <= 38.6912 )
									ret := 0.000000
								if( Money_Flow_Ratio > 38.6912 )
									ret := -0.777778 // sell
				if( Negative_Money_Flow > 189038 )
					if( Typical_Price <= 201.852 )
						if( ad <= -14752.6 )
							if( Positive_Money_Flow_Sum <= 9.82355e+06 )
								if( MFI_Low <= 1.12586 )
									ret := 0.139394
								if( MFI_Low > 1.12586 )
									ret := 0.609428
							if( Positive_Money_Flow_Sum > 9.82355e+06 )
								if( Raw_Money_Flow <= 1.18741e+07 )
									ret := 0.070470
								if( Raw_Money_Flow > 1.18741e+07 )
									ret := 0.583333
						if( ad > -14752.6 )
							if( mf <= -0.026922 )
								if( Positive_Money_Flow_Sum <= 1.34079e+06 )
									ret := -0.033951
								if( Positive_Money_Flow_Sum > 1.34079e+06 )
									ret := 0.185102
							if( mf > -0.026922 )
								if( ad <= -13048.1 )
									ret := -0.342857
								if( ad > -13048.1 )
									ret := 0.032986
					if( Typical_Price > 201.852 )
						if( ad_mf <= -474.007 )
							if( Positive_Money_Flow_Sum <= 1.74811e+09 )
								if( Raw_Money_Flow <= 3.57549e+06 )
									ret := 0.327939
								if( Raw_Money_Flow > 3.57549e+06 )
									ret := 0.177602
							if( Positive_Money_Flow_Sum > 1.74811e+09 )
								if( Raw_Money_Flow <= 1.16966e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 1.16966e+06 )
									ret := -0.423077
						if( ad_mf > -474.007 )
							if( Positive_Money_Flow_Sum <= 1.22983e+09 )
								if( Negative_Money_Flow_Sum <= 1.91297e+09 )
									ret := 0.184750
								if( Negative_Money_Flow_Sum > 1.91297e+09 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.22983e+09 )
								if( mf <= 0.091292 )
									ret := -0.360465
								if( mf > 0.091292 )
									ret := 0.103448
			if( Typical_Price > 2062.45 )
				if( MFI_High <= -20.3535 )
					if( MFI <= 22.5564 )
						if( MFI <= 15.7018 )
							if( Negative_Money_Flow_Sum <= 1.49232e+09 )
								if( MFI <= 6.74626 )
									ret := -0.395604
								if( MFI > 6.74626 )
									ret := 0.133531
							if( Negative_Money_Flow_Sum > 1.49232e+09 )
								if( Positive_Money_Flow_Sum <= 1.36269e+08 )
									ret := 0.645161
								if( Positive_Money_Flow_Sum > 1.36269e+08 )
									ret := 0.219895
						if( MFI > 15.7018 )
							if( mf <= 0.287948 )
								if( Positive_Money_Flow_Sum <= 2.81589e+08 )
									ret := -0.220588
								if( Positive_Money_Flow_Sum > 2.81589e+08 )
									ret := -0.602804
							if( mf > 0.287948 )
								if( Negative_Money_Flow <= 1.49576e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 1.49576e+06 )
									ret := -0.750000 // sell
					if( MFI > 22.5564 )
						if( mf <= -0.329567 )
							if( Positive_Money_Flow_Sum <= 8.56296e+08 )
								if( Negative_Money_Flow_Sum <= 4.62715e+08 )
									ret := 0.176471
								if( Negative_Money_Flow_Sum > 4.62715e+08 )
									ret := -0.487179
							if( Positive_Money_Flow_Sum > 8.56296e+08 )
								if( Positive_Money_Flow <= 369678 )
									ret := 0.769231 // buy
								if( Positive_Money_Flow > 369678 )
									ret := -0.166667
						if( mf > -0.329567 )
							if( ad_mf <= -0.267271 )
								if( Positive_Money_Flow_Sum <= 5.63429e+08 )
									ret := 0.580488
								if( Positive_Money_Flow_Sum > 5.63429e+08 )
									ret := 0.193277
							if( ad_mf > -0.267271 )
								if( Negative_Money_Flow_Sum <= 1.01502e+09 )
									ret := -0.004310
								if( Negative_Money_Flow_Sum > 1.01502e+09 )
									ret := 0.400000
				if( MFI_High > -20.3535 )
					if( MFI_Low <= 47.4095 )
						if( Negative_Money_Flow_Sum <= 7.92573e+08 )
							if( mf <= -0.445402 )
								if( MFI_High <= -15.5181 )
									ret := 0.600000
								if( MFI_High > -15.5181 )
									ret := -0.200000
							if( mf > -0.445402 )
								if( mf <= -0.190139 )
									ret := -0.868421 // sell
								if( mf > -0.190139 )
									ret := -0.490196
						if( Negative_Money_Flow_Sum > 7.92573e+08 )
							if( Positive_Money_Flow <= 132909 )
								if( Negative_Money_Flow_Sum <= 9.4821e+08 )
									ret := 0.812500 // buy
								if( Negative_Money_Flow_Sum > 9.4821e+08 )
									ret := 0.000000
							if( Positive_Money_Flow > 132909 )
								if( Positive_Money_Flow <= 535721 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 535721 )
									ret := 0.111111
					if( MFI_Low > 47.4095 )
						if( Negative_Money_Flow_Sum <= 3.86524e+08 )
							if( mf <= 0.010568 )
								if( MFI_High <= 4.54964 )
									ret := -0.168831
								if( MFI_High > 4.54964 )
									ret := 0.242105
							if( mf > 0.010568 )
								if( Raw_Money_Flow <= 1.34152e+06 )
									ret := -0.078370
								if( Raw_Money_Flow > 1.34152e+06 )
									ret := -0.429348
						if( Negative_Money_Flow_Sum > 3.86524e+08 )
							if( Typical_Price <= 2719.7 )
								if( mf <= 0.350903 )
									ret := 0.103659
								if( mf > 0.350903 )
									ret := -0.384615
							if( Typical_Price > 2719.7 )
								if( mf <= 0.429503 )
									ret := 0.643678
								if( mf > 0.429503 )
									ret := -1.000000 // sell
		if( Raw_Money_Flow > 1.33772e+07 )
			if( Negative_Money_Flow_Sum <= 4.48037e+08 )
				if( Positive_Money_Flow <= 1.85187e+08 )
					if( ad_mf <= -2.12113e+06 )
						if( Positive_Money_Flow_Sum <= 2.15748e+07 )
							if( Raw_Money_Flow <= 3.57348e+08 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 3.57348e+08 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 2.15748e+07 )
							if( Raw_Money_Flow <= 3.05853e+08 )
								ret := -0.750000 // sell
							if( Raw_Money_Flow > 3.05853e+08 )
								ret := 0.833333 // buy
					if( ad_mf > -2.12113e+06 )
						if( Negative_Money_Flow_Sum <= 2.43993e+08 )
							if( Positive_Money_Flow <= 1.42108e+08 )
								if( Negative_Money_Flow_Sum <= 1.3434e+08 )
									ret := 0.101715
								if( Negative_Money_Flow_Sum > 1.3434e+08 )
									ret := -0.017920
							if( Positive_Money_Flow > 1.42108e+08 )
								if( mf <= 0.51411 )
									ret := -0.272358
								if( mf > 0.51411 )
									ret := 0.733333 // buy
						if( Negative_Money_Flow_Sum > 2.43993e+08 )
							if( Typical_Price <= 219.486 )
								if( Money_Flow_Ratio <= 0.014904 )
									ret := -0.555556
								if( Money_Flow_Ratio > 0.014904 )
									ret := 0.033703
							if( Typical_Price > 219.486 )
								if( ad <= -108106 )
									ret := 0.227876
								if( ad > -108106 )
									ret := 0.089060
				if( Positive_Money_Flow > 1.85187e+08 )
					if( Positive_Money_Flow_Sum <= 2.65567e+08 )
						if( ad_mf <= -376226 )
							if( ad <= -1.22126e+06 )
								ret := 0.250000
							if( ad > -1.22126e+06 )
								if( ad_mf <= -876920 )
									ret := 1.000000 // buy
								if( ad_mf > -876920 )
									ret := 0.760000 // buy
						if( ad_mf > -376226 )
							if( MFI_Low <= 72.5608 )
								ret := -0.200000
							if( MFI_Low > 72.5608 )
								if( Positive_Money_Flow_Sum <= 2.28853e+08 )
									ret := 0.263158
								if( Positive_Money_Flow_Sum > 2.28853e+08 )
									ret := 0.850000 // buy
					if( Positive_Money_Flow_Sum > 2.65567e+08 )
						if( MFI_High <= 19.3237 )
							if( MFI_Low <= 78.0726 )
								if( Positive_Money_Flow_Sum <= 1.22419e+09 )
									ret := 0.188586
								if( Positive_Money_Flow_Sum > 1.22419e+09 )
									ret := -0.073770
							if( MFI_Low > 78.0726 )
								if( Typical_Price <= 1721.36 )
									ret := -0.789474 // sell
								if( Typical_Price > 1721.36 )
									ret := 0.235294
						if( MFI_High > 19.3237 )
							if( Positive_Money_Flow_Sum <= 9.95556e+08 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 9.95556e+08 )
								if( MFI_Low <= 79.8326 )
									ret := 1.000000 // buy
								if( MFI_Low > 79.8326 )
									ret := 0.250000
			if( Negative_Money_Flow_Sum > 4.48037e+08 )
				if( Positive_Money_Flow <= 4.58188e+07 )
					if( Negative_Money_Flow_Sum <= 1.90169e+09 )
						if( Negative_Money_Flow_Sum <= 1.05723e+09 )
							if( Positive_Money_Flow_Sum <= 1.72507e+09 )
								if( MFI_Low <= -18.6435 )
									ret := 0.226721
								if( MFI_Low > -18.6435 )
									ret := 0.004912
							if( Positive_Money_Flow_Sum > 1.72507e+09 )
								if( mf <= 0.2247 )
									ret := 0.553191
								if( mf > 0.2247 )
									ret := -0.170213
						if( Negative_Money_Flow_Sum > 1.05723e+09 )
							if( mf <= 0.12153 )
								if( MFI_High <= -40.0167 )
									ret := 0.196996
								if( MFI_High > -40.0167 )
									ret := -0.082474
							if( mf > 0.12153 )
								if( MFI <= 2.87447 )
									ret := 1.000000 // buy
								if( MFI > 2.87447 )
									ret := -0.375000
					if( Negative_Money_Flow_Sum > 1.90169e+09 )
						if( Negative_Money_Flow_Sum <= 2.61363e+09 )
							if( MFI <= 12.8385 )
								if( Raw_Money_Flow <= 1.09764e+09 )
									ret := -0.507246
								if( Raw_Money_Flow > 1.09764e+09 )
									ret := 0.750000 // buy
							if( MFI > 12.8385 )
								if( Negative_Money_Flow_Sum <= 2.31872e+09 )
									ret := -0.262295
								if( Negative_Money_Flow_Sum > 2.31872e+09 )
									ret := 0.477273
						if( Negative_Money_Flow_Sum > 2.61363e+09 )
							if( Negative_Money_Flow <= 2.06382e+08 )
								if( mf <= -0.592515 )
									ret := -0.666667
								if( mf > -0.592515 )
									ret := 0.571429
							if( Negative_Money_Flow > 2.06382e+08 )
								if( ad_mf <= -232429 )
									ret := -0.038462
								if( ad_mf > -232429 )
									ret := -0.608696
				if( Positive_Money_Flow > 4.58188e+07 )
					if( Positive_Money_Flow_Sum <= 1.05763e+09 )
						if( mf <= -0.109605 )
							if( MFI <= 42.5952 )
								if( Positive_Money_Flow_Sum <= 4.36952e+08 )
									ret := 0.003650
								if( Positive_Money_Flow_Sum > 4.36952e+08 )
									ret := -0.316940
							if( MFI > 42.5952 )
								if( MFI_Low <= 24.4181 )
									ret := 0.625000
								if( MFI_Low > 24.4181 )
									ret := 0.086643
						if( mf > -0.109605 )
							if( mf <= -0.041003 )
								if( ad <= -131274 )
									ret := -0.556818
								if( ad > -131274 )
									ret := -0.253012
							if( mf > -0.041003 )
								if( mf <= 0.291167 )
									ret := -0.090433
								if( mf > 0.291167 )
									ret := -0.447761
					if( Positive_Money_Flow_Sum > 1.05763e+09 )
						if( Positive_Money_Flow_Sum <= 2.76626e+09 )
							if( Raw_Money_Flow <= 1.64381e+08 )
								if( Negative_Money_Flow_Sum <= 1.00554e+09 )
									ret := 0.555556
								if( Negative_Money_Flow_Sum > 1.00554e+09 )
									ret := -0.179487
							if( Raw_Money_Flow > 1.64381e+08 )
								if( mf <= 0.217764 )
									ret := 0.103175
								if( mf > 0.217764 )
									ret := -0.705882 // sell
						if( Positive_Money_Flow_Sum > 2.76626e+09 )
							if( Positive_Money_Flow_Sum <= 3.41507e+09 )
								if( Positive_Money_Flow_Sum <= 2.86666e+09 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 2.86666e+09 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.41507e+09 )
								if( Typical_Price <= 2533.64 )
									ret := -0.111111
								if( Typical_Price > 2533.64 )
									ret := 0.500000
	if( ad_mf > 405.381 )
		if( ad <= 704085 )
			if( ad_mf <= 42338.6 )
				if( Negative_Money_Flow_Sum <= 636137 )
					if( MFI_High <= -6.03211 )
						if( MFI <= 67.5134 )
							ret := 0.000000
						if( MFI > 67.5134 )
							if( MFI <= 72.6024 )
								if( MFI_Low <= 51.2457 )
									ret := 0.800000 // buy
								if( MFI_Low > 51.2457 )
									ret := 0.000000
							if( MFI > 72.6024 )
								ret := 1.000000 // buy
					if( MFI_High > -6.03211 )
						if( Money_Flow_Ratio <= 5.20497 )
							if( Money_Flow_Ratio <= 3.11149 )
								ret := 0.500000
							if( Money_Flow_Ratio > 3.11149 )
								if( mf <= -0.336146 )
									ret := 0.285714
								if( mf > -0.336146 )
									ret := -0.312500
						if( Money_Flow_Ratio > 5.20497 )
							if( Typical_Price <= 98.8607 )
								if( MFI <= 90.9117 )
									ret := 0.937500 // buy
								if( MFI > 90.9117 )
									ret := 0.500000
							if( Typical_Price > 98.8607 )
								if( mf <= 0.547457 )
									ret := 0.306452
								if( mf > 0.547457 )
									ret := -0.090909
				if( Negative_Money_Flow_Sum > 636137 )
					if( Positive_Money_Flow <= 1.1746e+08 )
						if( Money_Flow_Ratio <= 0.937062 )
							if( Negative_Money_Flow_Sum <= 4.14258e+08 )
								if( Negative_Money_Flow <= 3.46688e+06 )
									ret := 0.025654
								if( Negative_Money_Flow > 3.46688e+06 )
									ret := 0.173745
							if( Negative_Money_Flow_Sum > 4.14258e+08 )
								if( Positive_Money_Flow_Sum <= 1.69432e+08 )
									ret := 0.099160
								if( Positive_Money_Flow_Sum > 1.69432e+08 )
									ret := -0.036799
						if( Money_Flow_Ratio > 0.937062 )
							if( Negative_Money_Flow_Sum <= 1.01413e+09 )
								if( Raw_Money_Flow <= 8.82822e+06 )
									ret := -0.063840
								if( Raw_Money_Flow > 8.82822e+06 )
									ret := 0.010652
							if( Negative_Money_Flow_Sum > 1.01413e+09 )
								if( Raw_Money_Flow <= 9.19466e+07 )
									ret := -0.696970
								if( Raw_Money_Flow > 9.19466e+07 )
									ret := -0.117647
					if( Positive_Money_Flow > 1.1746e+08 )
						if( Negative_Money_Flow_Sum <= 8.36455e+08 )
							if( MFI_Low <= 25.4728 )
								if( Positive_Money_Flow_Sum <= 1.83075e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.83075e+08 )
									ret := 0.661157
							if( MFI_Low > 25.4728 )
								if( Negative_Money_Flow_Sum <= 4.78785e+08 )
									ret := 0.197034
								if( Negative_Money_Flow_Sum > 4.78785e+08 )
									ret := -0.088889
						if( Negative_Money_Flow_Sum > 8.36455e+08 )
							if( Positive_Money_Flow_Sum <= 6.19954e+08 )
								if( MFI_High <= -61.1834 )
									ret := 0.000000
								if( MFI_High > -61.1834 )
									ret := -0.481013
							if( Positive_Money_Flow_Sum > 6.19954e+08 )
								if( Positive_Money_Flow_Sum <= 2.28186e+09 )
									ret := 0.129630
								if( Positive_Money_Flow_Sum > 2.28186e+09 )
									ret := -0.875000 // sell
			if( ad_mf > 42338.6 )
				if( Negative_Money_Flow_Sum <= 2.59165e+08 )
					if( Positive_Money_Flow_Sum <= 6.61639e+08 )
						if( Negative_Money_Flow_Sum <= 4.70366e+06 )
							if( Typical_Price <= 102.461 )
								if( ad <= 474832 )
									ret := 0.960000 // buy
								if( ad > 474832 )
									ret := 0.500000
							if( Typical_Price > 102.461 )
								if( Raw_Money_Flow <= 9.39942e+07 )
									ret := 0.049383
								if( Raw_Money_Flow > 9.39942e+07 )
									ret := 0.554455
						if( Negative_Money_Flow_Sum > 4.70366e+06 )
							if( Raw_Money_Flow <= 1.00852e+07 )
								if( Negative_Money_Flow_Sum <= 7.47751e+06 )
									ret := 0.268293
								if( Negative_Money_Flow_Sum > 7.47751e+06 )
									ret := -0.308511
							if( Raw_Money_Flow > 1.00852e+07 )
								if( MFI_Low <= 13.8959 )
									ret := 0.402116
								if( MFI_Low > 13.8959 )
									ret := 0.135427
					if( Positive_Money_Flow_Sum > 6.61639e+08 )
						if( Positive_Money_Flow_Sum <= 7.91187e+08 )
							if( Negative_Money_Flow <= 1.04426e+08 )
								if( ad <= 130378 )
									ret := 0.052023
								if( ad > 130378 )
									ret := -0.323529
							if( Negative_Money_Flow > 1.04426e+08 )
								if( Negative_Money_Flow <= 1.20333e+08 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 1.20333e+08 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 7.91187e+08 )
							if( Positive_Money_Flow_Sum <= 1.93127e+09 )
								if( mf <= 0.312033 )
									ret := 0.230769
								if( mf > 0.312033 )
									ret := 0.032738
							if( Positive_Money_Flow_Sum > 1.93127e+09 )
								if( Typical_Price <= 2747.54 )
									ret := -0.567568
								if( Typical_Price > 2747.54 )
									ret := 0.777778 // buy
				if( Negative_Money_Flow_Sum > 2.59165e+08 )
					if( Positive_Money_Flow_Sum <= 1.2642e+09 )
						if( MFI_Low <= 23.0672 )
							if( Money_Flow_Ratio <= 0.734225 )
								if( Negative_Money_Flow_Sum <= 3.2794e+08 )
									ret := 0.229508
								if( Negative_Money_Flow_Sum > 3.2794e+08 )
									ret := -0.010788
							if( Money_Flow_Ratio > 0.734225 )
								if( Raw_Money_Flow <= 8.57038e+07 )
									ret := -0.088608
								if( Raw_Money_Flow > 8.57038e+07 )
									ret := -0.482143
						if( MFI_Low > 23.0672 )
							if( Positive_Money_Flow_Sum <= 6.29088e+08 )
								if( mf <= 0.056697 )
									ret := 0.059593
								if( mf > 0.056697 )
									ret := 0.175394
							if( Positive_Money_Flow_Sum > 6.29088e+08 )
								if( Positive_Money_Flow_Sum <= 7.17532e+08 )
									ret := -0.104305
								if( Positive_Money_Flow_Sum > 7.17532e+08 )
									ret := 0.060992
					if( Positive_Money_Flow_Sum > 1.2642e+09 )
						if( Negative_Money_Flow <= 1.20658e+08 )
							if( MFI <= 44.6165 )
								if( Money_Flow_Ratio <= 0.263704 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.263704 )
									ret := -0.920000 // sell
							if( MFI > 44.6165 )
								if( MFI_High <= -32.8955 )
									ret := 0.666667
								if( MFI_High > -32.8955 )
									ret := -0.309589
						if( Negative_Money_Flow > 1.20658e+08 )
							if( MFI <= 74.1153 )
								if( mf <= -0.036303 )
									ret := 1.000000 // buy
								if( mf > -0.036303 )
									ret := -0.437500
							if( MFI > 74.1153 )
								if( Negative_Money_Flow_Sum <= 3.53824e+08 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 3.53824e+08 )
									ret := 0.833333 // buy
		if( ad > 704085 )
			if( Positive_Money_Flow_Sum <= 1.22875e+07 )
				if( Typical_Price <= 158.065 )
					if( Money_Flow_Ratio <= 0.00956 )
						ret := 0.000000
					if( Money_Flow_Ratio > 0.00956 )
						if( Money_Flow_Ratio <= 0.031222 )
							if( Positive_Money_Flow_Sum <= 6.84892e+06 )
								if( Negative_Money_Flow <= 1.90903e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 1.90903e+08 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 6.84892e+06 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.031222 )
							ret := -0.285714
				if( Typical_Price > 158.065 )
					ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 1.22875e+07 )
				if( MFI <= 13.9022 )
					if( ad <= 729904 )
						ret := -1.000000 // sell
					if( ad > 729904 )
						if( Negative_Money_Flow <= 2.58123e+08 )
							if( MFI_Low <= -16.9493 )
								ret := -0.250000
							if( MFI_Low > -16.9493 )
								if( Raw_Money_Flow <= 1.08428e+08 )
									ret := 0.250000
								if( Raw_Money_Flow > 1.08428e+08 )
									ret := 0.885714 // buy
						if( Negative_Money_Flow > 2.58123e+08 )
							if( Negative_Money_Flow <= 5.33817e+08 )
								if( Typical_Price <= 132.922 )
									ret := 0.000000
								if( Typical_Price > 132.922 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 5.33817e+08 )
								if( Raw_Money_Flow <= 7.54867e+08 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 7.54867e+08 )
									ret := 0.461538
				if( MFI > 13.9022 )
					if( Raw_Money_Flow <= 1.25195e+08 )
						if( MFI_High <= -47.931 )
							if( Negative_Money_Flow_Sum <= 4.59257e+08 )
								if( Typical_Price <= 103.626 )
									ret := -0.900000 // sell
								if( Typical_Price > 103.626 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 4.59257e+08 )
								if( Raw_Money_Flow <= 1.01855e+08 )
									ret := 0.222222
								if( Raw_Money_Flow > 1.01855e+08 )
									ret := -0.500000
						if( MFI_High > -47.931 )
							if( Money_Flow_Ratio <= 8.96401 )
								if( Positive_Money_Flow_Sum <= 3.45887e+08 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 3.45887e+08 )
									ret := 0.136126
							if( Money_Flow_Ratio > 8.96401 )
								if( Negative_Money_Flow_Sum <= 3.93825e+06 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 3.93825e+06 )
									ret := -0.652174
					if( Raw_Money_Flow > 1.25195e+08 )
						if( Positive_Money_Flow_Sum <= 4.32373e+08 )
							if( Positive_Money_Flow_Sum <= 2.51125e+08 )
								if( Positive_Money_Flow_Sum <= 2.43756e+08 )
									ret := -0.197452
								if( Positive_Money_Flow_Sum > 2.43756e+08 )
									ret := -0.947368 // sell
							if( Positive_Money_Flow_Sum > 2.51125e+08 )
								if( Negative_Money_Flow_Sum <= 3.76905e+07 )
									ret := 0.236842
								if( Negative_Money_Flow_Sum > 3.76905e+07 )
									ret := -0.059322
						if( Positive_Money_Flow_Sum > 4.32373e+08 )
							if( MFI_Low <= 23.7243 )
								if( Raw_Money_Flow <= 1.48258e+08 )
									ret := -0.920000 // sell
								if( Raw_Money_Flow > 1.48258e+08 )
									ret := -0.428571
							if( MFI_Low > 23.7243 )
								if( Positive_Money_Flow_Sum <= 1.73295e+09 )
									ret := -0.151460
								if( Positive_Money_Flow_Sum > 1.73295e+09 )
									ret := -0.583333
	
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
float op_operation = decision_tree_0_GOOG_15Min_22462a82(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


