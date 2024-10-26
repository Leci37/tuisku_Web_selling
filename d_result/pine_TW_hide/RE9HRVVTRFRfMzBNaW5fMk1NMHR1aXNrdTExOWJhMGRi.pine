//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: DOGEUSDT_30Min_2MM0_119ba0db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2MM0_119ba0db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_119ba0db(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 4.7372e+06 )
		if( Typical_Price <= 0.167771 )
			if( Money_Flow_Ratio <= 4.07712 )
				if( Short_Long_Diff <= -0.002038 )
					if( Positive_Money_Flow_Sum <= 1.26112e+07 )
						if( Typical_Price <= 0.062153 )
							ret := -1.000000 // sell
						if( Typical_Price > 0.062153 )
							if( Raw_Money_Flow <= 1.42562e+06 )
								if( Long_MA <= 0.111502 )
									ret := 0.606061
								if( Long_MA > 0.111502 )
									ret := -0.333333
							if( Raw_Money_Flow > 1.42562e+06 )
								if( Negative_Money_Flow_Sum <= 5.86431e+07 )
									ret := 0.732673 // buy
								if( Negative_Money_Flow_Sum > 5.86431e+07 )
									ret := 0.175000
					if( Positive_Money_Flow_Sum > 1.26112e+07 )
						if( Typical_Price <= 0.106216 )
							if( Negative_Money_Flow_Sum <= 1.4136e+08 )
								if( Negative_Money_Flow_Sum <= 5.91606e+07 )
									ret := 0.133333
								if( Negative_Money_Flow_Sum > 5.91606e+07 )
									ret := 0.502415
							if( Negative_Money_Flow_Sum > 1.4136e+08 )
								if( Positive_Money_Flow <= 1.62798e+07 )
									ret := -0.689655
								if( Positive_Money_Flow > 1.62798e+07 )
									ret := 0.083333
						if( Typical_Price > 0.106216 )
							if( Raw_Money_Flow <= 2.13232e+06 )
								if( Short_Long_Diff <= -0.002321 )
									ret := -0.575000
								if( Short_Long_Diff > -0.002321 )
									ret := 0.179487
							if( Raw_Money_Flow > 2.13232e+06 )
								if( MFI <= 25.51 )
									ret := -0.215909
								if( MFI > 25.51 )
									ret := 0.161616
				if( Short_Long_Diff > -0.002038 )
					if( Short_MA <= 0.054768 )
						if( Negative_Money_Flow <= 5196.96 )
							if( Negative_Money_Flow_Sum <= 1.74702e+07 )
								if( Positive_Money_Flow <= 1.44887e+06 )
									ret := 0.056500
								if( Positive_Money_Flow > 1.44887e+06 )
									ret := -0.141762
							if( Negative_Money_Flow_Sum > 1.74702e+07 )
								if( MFI <= 61.7822 )
									ret := 0.309896
								if( MFI > 61.7822 )
									ret := -0.150794
						if( Negative_Money_Flow > 5196.96 )
							if( Positive_Money_Flow_Sum <= 9.69427e+06 )
								if( Positive_Money_Flow_Sum <= 6.71513e+06 )
									ret := 0.153885
								if( Positive_Money_Flow_Sum > 6.71513e+06 )
									ret := 0.508403
							if( Positive_Money_Flow_Sum > 9.69427e+06 )
								if( Negative_Money_Flow <= 3.67447e+06 )
									ret := -0.082380
								if( Negative_Money_Flow > 3.67447e+06 )
									ret := 0.574074
					if( Short_MA > 0.054768 )
						if( Positive_Money_Flow_Sum <= 3.20131e+06 )
							if( Positive_Money_Flow_Sum <= 2.54043e+06 )
								if( Negative_Money_Flow_Sum <= 1.7936e+07 )
									ret := 0.014163
								if( Negative_Money_Flow_Sum > 1.7936e+07 )
									ret := -0.405405
							if( Positive_Money_Flow_Sum > 2.54043e+06 )
								if( Long_MA <= 0.06315 )
									ret := 0.029466
								if( Long_MA > 0.06315 )
									ret := -0.109327
						if( Positive_Money_Flow_Sum > 3.20131e+06 )
							if( Short_MA <= 0.075206 )
								if( MFI_Low <= 14.1165 )
									ret := 0.163755
								if( MFI_Low > 14.1165 )
									ret := 0.062977
							if( Short_MA > 0.075206 )
								if( Short_Long_Diff <= -2.2e-05 )
									ret := -0.000149
								if( Short_Long_Diff > -2.2e-05 )
									ret := 0.052917
			if( Money_Flow_Ratio > 4.07712 )
				if( Typical_Price <= 0.139552 )
					if( Money_Flow_Ratio <= 7.55617 )
						if( Short_Long_Diff <= 0.005106 )
							if( Positive_Money_Flow <= 3.15024e+06 )
								if( Negative_Money_Flow <= 3.90708e+06 )
									ret := -0.016882
								if( Negative_Money_Flow > 3.90708e+06 )
									ret := -0.652174
							if( Positive_Money_Flow > 3.15024e+06 )
								if( Positive_Money_Flow_Sum <= 6.81151e+08 )
									ret := -0.235081
								if( Positive_Money_Flow_Sum > 6.81151e+08 )
									ret := 1.000000 // buy
						if( Short_Long_Diff > 0.005106 )
							if( Short_Long_Diff <= 0.011567 )
								if( Positive_Money_Flow <= 6.59469e+07 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow > 6.59469e+07 )
									ret := 1.000000 // buy
							if( Short_Long_Diff > 0.011567 )
								ret := -0.833333 // sell
					if( Money_Flow_Ratio > 7.55617 )
						if( Positive_Money_Flow_Sum <= 1.75484e+08 )
							if( Short_MA <= 0.086493 )
								if( Long_MA <= 0.079181 )
									ret := -0.266010
								if( Long_MA > 0.079181 )
									ret := 0.166667
							if( Short_MA > 0.086493 )
								if( Negative_Money_Flow_Sum <= 1.23187e+07 )
									ret := -0.509091
								if( Negative_Money_Flow_Sum > 1.23187e+07 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.75484e+08 )
							if( Short_Long_Diff <= 0.002114 )
								ret := -0.500000
							if( Short_Long_Diff > 0.002114 )
								ret := -1.000000 // sell
				if( Typical_Price > 0.139552 )
					if( Typical_Price <= 0.164931 )
						if( Short_Long_Diff <= 0.001002 )
							if( Positive_Money_Flow <= 6.51124e+06 )
								if( Short_MA <= 0.139498 )
									ret := 1.000000 // buy
								if( Short_MA > 0.139498 )
									ret := 0.194444
							if( Positive_Money_Flow > 6.51124e+06 )
								if( Typical_Price <= 0.144135 )
									ret := 0.500000
								if( Typical_Price > 0.144135 )
									ret := 0.944444 // buy
						if( Short_Long_Diff > 0.001002 )
							if( Long_MA <= 0.15144 )
								if( Negative_Money_Flow_Sum <= 4.62411e+07 )
									ret := -0.147287
								if( Negative_Money_Flow_Sum > 4.62411e+07 )
									ret := 0.410256
							if( Long_MA > 0.15144 )
								if( Money_Flow_Ratio <= 5.75072 )
									ret := 0.000000
								if( Money_Flow_Ratio > 5.75072 )
									ret := 0.724138 // buy
					if( Typical_Price > 0.164931 )
						if( Long_MA <= 0.163121 )
							if( Typical_Price <= 0.165645 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.165645 )
								ret := -0.500000
						if( Long_MA > 0.163121 )
							ret := 0.500000
		if( Typical_Price > 0.167771 )
			if( Short_Long_Diff <= 0.004569 )
				if( Short_MA <= 0.496877 )
					if( Positive_Money_Flow_Sum <= 5.37111e+08 )
						if( Positive_Money_Flow <= 1.45243e+08 )
							if( Raw_Money_Flow <= 7.60142e+07 )
								if( Negative_Money_Flow_Sum <= 6.05714e+07 )
									ret := -0.059230
								if( Negative_Money_Flow_Sum > 6.05714e+07 )
									ret := 0.033071
							if( Raw_Money_Flow > 7.60142e+07 )
								if( Positive_Money_Flow <= 1.15825e+08 )
									ret := -0.760563 // sell
								if( Positive_Money_Flow > 1.15825e+08 )
									ret := -0.133333
						if( Positive_Money_Flow > 1.45243e+08 )
							if( Raw_Money_Flow <= 1.77351e+08 )
								if( Short_Long_Diff <= 0.001192 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > 0.001192 )
									ret := 0.250000
							if( Raw_Money_Flow > 1.77351e+08 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.37111e+08 )
						if( Positive_Money_Flow_Sum <= 6.68206e+08 )
							if( Typical_Price <= 0.235932 )
								ret := -0.428571
							if( Typical_Price > 0.235932 )
								if( Raw_Money_Flow <= 4.4258e+07 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 4.4258e+07 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 6.68206e+08 )
							if( Negative_Money_Flow_Sum <= 1.96838e+09 )
								if( Negative_Money_Flow_Sum <= 1.2733e+09 )
									ret := 0.273684
								if( Negative_Money_Flow_Sum > 1.2733e+09 )
									ret := -0.551724
							if( Negative_Money_Flow_Sum > 1.96838e+09 )
								if( Short_MA <= 0.349075 )
									ret := 0.625000
								if( Short_MA > 0.349075 )
									ret := 1.000000 // buy
				if( Short_MA > 0.496877 )
					if( Positive_Money_Flow <= 1.67645e+08 )
						if( MFI_High <= -45.8538 )
							if( Positive_Money_Flow_Sum <= 5.61624e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.61624e+08 )
								ret := 0.250000
						if( MFI_High > -45.8538 )
							if( Positive_Money_Flow_Sum <= 1.31882e+09 )
								if( Negative_Money_Flow_Sum <= 5.94886e+08 )
									ret := -0.239130
								if( Negative_Money_Flow_Sum > 5.94886e+08 )
									ret := -0.707547 // sell
							if( Positive_Money_Flow_Sum > 1.31882e+09 )
								ret := 0.666667
					if( Positive_Money_Flow > 1.67645e+08 )
						if( Short_Long_Diff <= -0.020689 )
							ret := -1.000000 // sell
						if( Short_Long_Diff > -0.020689 )
							if( Short_MA <= 0.597964 )
								if( Long_MA <= 0.557895 )
									ret := 1.000000 // buy
								if( Long_MA > 0.557895 )
									ret := 0.000000
							if( Short_MA > 0.597964 )
								ret := 1.000000 // buy
			if( Short_Long_Diff > 0.004569 )
				if( Positive_Money_Flow_Sum <= 1.55678e+09 )
					if( MFI_Low <= 54.0709 )
						if( Raw_Money_Flow <= 1.70424e+07 )
							if( Negative_Money_Flow_Sum <= 4.77169e+07 )
								if( Long_MA <= 0.214135 )
									ret := -0.250000
								if( Long_MA > 0.214135 )
									ret := -0.937500 // sell
							if( Negative_Money_Flow_Sum > 4.77169e+07 )
								if( Short_Long_Diff <= 0.007798 )
									ret := 0.403846
								if( Short_Long_Diff > 0.007798 )
									ret := -0.833333 // sell
						if( Raw_Money_Flow > 1.70424e+07 )
							if( Positive_Money_Flow <= 1.50548e+08 )
								if( Typical_Price <= 0.290766 )
									ret := -0.462585
								if( Typical_Price > 0.290766 )
									ret := -0.160976
							if( Positive_Money_Flow > 1.50548e+08 )
								if( Positive_Money_Flow_Sum <= 1.4333e+09 )
									ret := 0.814815 // buy
								if( Positive_Money_Flow_Sum > 1.4333e+09 )
									ret := -1.000000 // sell
					if( MFI_Low > 54.0709 )
						if( Negative_Money_Flow_Sum <= 2.36201e+08 )
							if( Positive_Money_Flow_Sum <= 5.73625e+08 )
								if( Negative_Money_Flow_Sum <= 5.71906e+07 )
									ret := -0.223077
								if( Negative_Money_Flow_Sum > 5.71906e+07 )
									ret := -0.713235 // sell
							if( Positive_Money_Flow_Sum > 5.73625e+08 )
								if( Raw_Money_Flow <= 4.94165e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 4.94165e+07 )
									ret := -0.082192
						if( Negative_Money_Flow_Sum > 2.36201e+08 )
							if( Long_MA <= 0.251997 )
								ret := 0.600000
							if( Long_MA > 0.251997 )
								if( Raw_Money_Flow <= 6.94316e+07 )
									ret := -0.200000
								if( Raw_Money_Flow > 6.94316e+07 )
									ret := -0.925926 // sell
				if( Positive_Money_Flow_Sum > 1.55678e+09 )
					if( Raw_Money_Flow <= 1.53877e+08 )
						if( MFI_Low <= 46.8175 )
							if( Short_Long_Diff <= 0.020611 )
								if( Typical_Price <= 0.301371 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.301371 )
									ret := 0.000000
							if( Short_Long_Diff > 0.020611 )
								ret := -0.333333
						if( MFI_Low > 46.8175 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.53877e+08 )
						if( Short_Long_Diff <= 0.02691 )
							if( MFI_High <= 0.791788 )
								if( Raw_Money_Flow <= 2.47358e+08 )
									ret := 0.000000
								if( Raw_Money_Flow > 2.47358e+08 )
									ret := 0.846154 // buy
							if( MFI_High > 0.791788 )
								ret := -1.000000 // sell
						if( Short_Long_Diff > 0.02691 )
							if( Positive_Money_Flow_Sum <= 2.7785e+09 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.7785e+09 )
								if( Typical_Price <= 0.661752 )
									ret := -0.962963 // sell
								if( Typical_Price > 0.661752 )
									ret := -0.500000
	if( Negative_Money_Flow > 4.7372e+06 )
		if( Money_Flow_Ratio <= 0.662609 )
			if( Short_Long_Diff <= -0.03715 )
				if( Positive_Money_Flow_Sum <= 1.19766e+09 )
					ret := 0.250000
				if( Positive_Money_Flow_Sum > 1.19766e+09 )
					ret := -1.000000 // sell
			if( Short_Long_Diff > -0.03715 )
				if( Typical_Price <= 0.244439 )
					if( Negative_Money_Flow <= 8.46456e+06 )
						if( Positive_Money_Flow_Sum <= 2.05154e+07 )
							if( Negative_Money_Flow_Sum <= 2.65879e+07 )
								if( Money_Flow_Ratio <= 0.3326 )
									ret := -0.102190
								if( Money_Flow_Ratio > 0.3326 )
									ret := 0.296089
							if( Negative_Money_Flow_Sum > 2.65879e+07 )
								if( Negative_Money_Flow <= 7.80867e+06 )
									ret := 0.302419
								if( Negative_Money_Flow > 7.80867e+06 )
									ret := 0.657143
						if( Positive_Money_Flow_Sum > 2.05154e+07 )
							if( MA_Cross <= 0.005037 )
								if( MFI_Low <= 16.1826 )
									ret := 0.001934
								if( MFI_Low > 16.1826 )
									ret := 0.300493
							if( MA_Cross > 0.005037 )
								if( MA_Cross <= 0.08017 )
									ret := -1.000000 // sell
								if( MA_Cross > 0.08017 )
									ret := -0.571429
					if( Negative_Money_Flow > 8.46456e+06 )
						if( Negative_Money_Flow_Sum <= 6.24689e+07 )
							if( Negative_Money_Flow_Sum <= 5.47963e+07 )
								if( Negative_Money_Flow <= 1.12626e+07 )
									ret := 0.112500
								if( Negative_Money_Flow > 1.12626e+07 )
									ret := 0.464912
							if( Negative_Money_Flow_Sum > 5.47963e+07 )
								if( Raw_Money_Flow <= 1.26289e+07 )
									ret := 0.113208
								if( Raw_Money_Flow > 1.26289e+07 )
									ret := -0.520000
						if( Negative_Money_Flow_Sum > 6.24689e+07 )
							if( Short_Long_Diff <= -0.00694 )
								if( Negative_Money_Flow <= 2.95382e+07 )
									ret := -0.459459
								if( Negative_Money_Flow > 2.95382e+07 )
									ret := 0.613333
							if( Short_Long_Diff > -0.00694 )
								if( Positive_Money_Flow_Sum <= 1.70617e+07 )
									ret := 0.734848 // buy
								if( Positive_Money_Flow_Sum > 1.70617e+07 )
									ret := 0.392691
				if( Typical_Price > 0.244439 )
					if( MFI_High <= -64.8176 )
						if( Negative_Money_Flow <= 5.34852e+07 )
							if( MFI <= 12.0036 )
								if( Raw_Money_Flow <= 1.16613e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 1.16613e+07 )
									ret := -0.545455
							if( MFI > 12.0036 )
								if( Short_MA <= 0.262407 )
									ret := -0.300000
								if( Short_MA > 0.262407 )
									ret := -0.914286 // sell
						if( Negative_Money_Flow > 5.34852e+07 )
							ret := 1.000000 // buy
					if( MFI_High > -64.8176 )
						if( Negative_Money_Flow_Sum <= 8.20875e+07 )
							if( Negative_Money_Flow_Sum <= 6.1261e+07 )
								if( Positive_Money_Flow_Sum <= 3.4364e+07 )
									ret := 0.038462
								if( Positive_Money_Flow_Sum > 3.4364e+07 )
									ret := 0.900000 // buy
							if( Negative_Money_Flow_Sum > 6.1261e+07 )
								if( Raw_Money_Flow <= 6.12915e+06 )
									ret := 0.428571
								if( Raw_Money_Flow > 6.12915e+06 )
									ret := -0.483871
						if( Negative_Money_Flow_Sum > 8.20875e+07 )
							if( Raw_Money_Flow <= 1.91616e+08 )
								if( Short_Long_Diff <= -0.022249 )
									ret := -0.405405
								if( Short_Long_Diff > -0.022249 )
									ret := 0.216085
							if( Raw_Money_Flow > 1.91616e+08 )
								if( Negative_Money_Flow_Sum <= 8.3547e+08 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 8.3547e+08 )
									ret := 0.788462 // buy
		if( Money_Flow_Ratio > 0.662609 )
			if( MFI_High <= -37.1874 )
				if( Short_Long_Diff <= -0.007313 )
					if( Negative_Money_Flow_Sum <= 1.1168e+09 )
						if( Long_MA <= 0.528208 )
							if( Short_Long_Diff <= -0.008833 )
								if( Positive_Money_Flow_Sum <= 2.13816e+08 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 2.13816e+08 )
									ret := 1.000000 // buy
							if( Short_Long_Diff > -0.008833 )
								if( Negative_Money_Flow_Sum <= 4.37308e+08 )
									ret := 0.909091 // buy
								if( Negative_Money_Flow_Sum > 4.37308e+08 )
									ret := -0.250000
						if( Long_MA > 0.528208 )
							ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.1168e+09 )
						ret := -1.000000 // sell
				if( Short_Long_Diff > -0.007313 )
					if( Negative_Money_Flow_Sum <= 5.53785e+08 )
						if( Negative_Money_Flow_Sum <= 6.73636e+07 )
							if( Negative_Money_Flow_Sum <= 4.81725e+07 )
								if( Typical_Price <= 0.152637 )
									ret := -0.357143
								if( Typical_Price > 0.152637 )
									ret := 0.164384
							if( Negative_Money_Flow_Sum > 4.81725e+07 )
								if( Raw_Money_Flow <= 5.41304e+06 )
									ret := -0.222222
								if( Raw_Money_Flow > 5.41304e+06 )
									ret := -0.710145 // sell
						if( Negative_Money_Flow_Sum > 6.73636e+07 )
							if( Typical_Price <= 0.283046 )
								if( Typical_Price <= 0.156708 )
									ret := -0.042857
								if( Typical_Price > 0.156708 )
									ret := 0.393103
							if( Typical_Price > 0.283046 )
								if( Positive_Money_Flow_Sum <= 3.30731e+08 )
									ret := -0.395349
								if( Positive_Money_Flow_Sum > 3.30731e+08 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 5.53785e+08 )
						if( Raw_Money_Flow <= 1.08148e+08 )
							if( Raw_Money_Flow <= 5.24137e+07 )
								if( Positive_Money_Flow_Sum <= 5.57309e+08 )
									ret := -0.928571 // sell
								if( Positive_Money_Flow_Sum > 5.57309e+08 )
									ret := -0.600000
							if( Raw_Money_Flow > 5.24137e+07 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.08148e+08 )
							if( Short_Long_Diff <= -0.002003 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.002003 )
								ret := -0.166667
			if( MFI_High > -37.1874 )
				if( Negative_Money_Flow <= 3.65314e+07 )
					if( Negative_Money_Flow_Sum <= 9.74481e+07 )
						if( Positive_Money_Flow_Sum <= 9.33223e+07 )
							if( Positive_Money_Flow_Sum <= 4.20493e+07 )
								if( Positive_Money_Flow_Sum <= 3.52916e+07 )
									ret := 0.128253
								if( Positive_Money_Flow_Sum > 3.52916e+07 )
									ret := -0.216463
							if( Positive_Money_Flow_Sum > 4.20493e+07 )
								if( Typical_Price <= 0.01857 )
									ret := -0.500000
								if( Typical_Price > 0.01857 )
									ret := 0.210875
						if( Positive_Money_Flow_Sum > 9.33223e+07 )
							if( Positive_Money_Flow_Sum <= 1.76944e+08 )
								if( MA_Cross <= 0.00815 )
									ret := -0.125494
								if( MA_Cross > 0.00815 )
									ret := -0.853659 // sell
							if( Positive_Money_Flow_Sum > 1.76944e+08 )
								if( Short_MA <= 0.227106 )
									ret := 0.584906
								if( Short_MA > 0.227106 )
									ret := -0.370370
					if( Negative_Money_Flow_Sum > 9.74481e+07 )
						if( Short_MA <= 0.272171 )
							if( Positive_Money_Flow_Sum <= 1.53694e+08 )
								if( MFI_High <= -33.505 )
									ret := 0.489655
								if( MFI_High > -33.505 )
									ret := -0.097436
							if( Positive_Money_Flow_Sum > 1.53694e+08 )
								if( Positive_Money_Flow_Sum <= 5.55971e+08 )
									ret := 0.405797
								if( Positive_Money_Flow_Sum > 5.55971e+08 )
									ret := -0.333333
						if( Short_MA > 0.272171 )
							if( Short_Long_Diff <= -0.003047 )
								if( Positive_Money_Flow_Sum <= 3.27746e+08 )
									ret := 0.212121
								if( Positive_Money_Flow_Sum > 3.27746e+08 )
									ret := 0.851852 // buy
							if( Short_Long_Diff > -0.003047 )
								if( Short_Long_Diff <= -0.000843 )
									ret := -0.393258
								if( Short_Long_Diff > -0.000843 )
									ret := 0.081081
				if( Negative_Money_Flow > 3.65314e+07 )
					if( Positive_Money_Flow_Sum <= 5.87267e+08 )
						if( Negative_Money_Flow <= 5.51968e+07 )
							if( Positive_Money_Flow_Sum <= 1.17909e+08 )
								if( Short_Long_Diff <= -0.000114 )
									ret := -0.500000
								if( Short_Long_Diff > -0.000114 )
									ret := -0.947368 // sell
							if( Positive_Money_Flow_Sum > 1.17909e+08 )
								if( Positive_Money_Flow_Sum <= 5.35017e+08 )
									ret := -0.131004
								if( Positive_Money_Flow_Sum > 5.35017e+08 )
									ret := 0.600000
						if( Negative_Money_Flow > 5.51968e+07 )
							if( Long_MA <= 0.031703 )
								ret := 1.000000 // buy
							if( Long_MA > 0.031703 )
								if( Negative_Money_Flow_Sum <= 2.64652e+08 )
									ret := -0.765306 // sell
								if( Negative_Money_Flow_Sum > 2.64652e+08 )
									ret := -0.333333
					if( Positive_Money_Flow_Sum > 5.87267e+08 )
						if( Money_Flow_Ratio <= 0.880995 )
							if( Raw_Money_Flow <= 6.93126e+07 )
								if( Negative_Money_Flow <= 6.44994e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 6.44994e+07 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 6.93126e+07 )
								if( Money_Flow_Ratio <= 0.80445 )
									ret := -0.454545
								if( Money_Flow_Ratio > 0.80445 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.880995 )
							if( Raw_Money_Flow <= 8.63252e+07 )
								if( Positive_Money_Flow_Sum <= 6.74828e+08 )
									ret := 0.785714 // buy
								if( Positive_Money_Flow_Sum > 6.74828e+08 )
									ret := -0.172222
							if( Raw_Money_Flow > 8.63252e+07 )
								if( Raw_Money_Flow <= 1.59292e+08 )
									ret := 0.527523
								if( Raw_Money_Flow > 1.59292e+08 )
									ret := 0.125000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_DOGEUSDT_30Min_119ba0db(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


