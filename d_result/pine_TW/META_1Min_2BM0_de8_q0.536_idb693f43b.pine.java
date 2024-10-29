//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: META_1Min_2BM0_b693f43b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_2BM0_b693f43b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_b693f43b(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.991169 )
		if( Negative_Money_Flow_Sum <= 1.72869e+07 )
			if( Negative_Money_Flow <= 7.10386e+06 )
				if( Negative_Money_Flow_Sum <= 1.09081e+06 )
					if( bullPower <= -0.755794 )
						if( Negative_Money_Flow <= 12001.2 )
							ret := -0.400000
						if( Negative_Money_Flow > 12001.2 )
							if( Negative_Money_Flow <= 213990 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 213990 )
								ret := -0.666667
					if( bullPower > -0.755794 )
						if( Negative_Money_Flow <= 277370 )
							if( Negative_Money_Flow <= 74902.2 )
								ret := -0.200000
							if( Negative_Money_Flow > 74902.2 )
								if( Negative_Money_Flow_Sum <= 894100 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 894100 )
									ret := 0.600000
						if( Negative_Money_Flow > 277370 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 1.09081e+06 )
					if( Positive_Money_Flow_Sum <= 1.10013e+06 )
						if( Negative_Money_Flow_Sum <= 5.17333e+06 )
							if( bbm <= 0.039203 )
								if( Negative_Money_Flow_Sum <= 1.26985e+06 )
									ret := 0.772727 // buy
								if( Negative_Money_Flow_Sum > 1.26985e+06 )
									ret := -0.006431
							if( bbm > 0.039203 )
								if( Positive_Money_Flow_Sum <= 623953 )
									ret := 0.769231 // buy
								if( Positive_Money_Flow_Sum > 623953 )
									ret := 0.295455
						if( Negative_Money_Flow_Sum > 5.17333e+06 )
							if( bearPower <= -1.56954 )
								if( Positive_Money_Flow_Sum <= 1.02283e+06 )
									ret := 0.681818
								if( Positive_Money_Flow_Sum > 1.02283e+06 )
									ret := 0.000000
							if( bearPower > -1.56954 )
								if( bbm <= 0.000502 )
									ret := 0.177778
								if( bbm > 0.000502 )
									ret := -0.530120
					if( Positive_Money_Flow_Sum > 1.10013e+06 )
						if( Positive_Money_Flow_Sum <= 3.36936e+06 )
							if( Typical_Price <= 503.874 )
								if( Raw_Money_Flow <= 3.1713e+06 )
									ret := 0.467105
								if( Raw_Money_Flow > 3.1713e+06 )
									ret := -0.176471
							if( Typical_Price > 503.874 )
								if( MFI_High <= -24.9806 )
									ret := 0.262295
								if( MFI_High > -24.9806 )
									ret := -0.366667
						if( Positive_Money_Flow_Sum > 3.36936e+06 )
							if( Negative_Money_Flow_Sum <= 3.00393e+06 )
								if( bearPower <= -1.34483 )
									ret := -0.846154 // sell
								if( bearPower > -1.34483 )
									ret := -0.037037
							if( Negative_Money_Flow_Sum > 3.00393e+06 )
								if( Typical_Price <= 455.89 )
									ret := 0.585586
								if( Typical_Price > 455.89 )
									ret := 0.190733
			if( Negative_Money_Flow > 7.10386e+06 )
				if( bbm <= 2.46963 )
					ret := 0.500000
				if( bbm > 2.46963 )
					if( bbp <= -2.60346 )
						if( MFI_High <= -61.3927 )
							ret := -0.750000 // sell
						if( MFI_High > -61.3927 )
							ret := 0.000000
					if( bbp > -2.60346 )
						ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 1.72869e+07 )
			if( Typical_Price <= 433.756 )
				if( Raw_Money_Flow <= 2.78924e+07 )
					if( Money_Flow_Ratio <= 0.307658 )
						if( bbp <= -2.91852 )
							ret := 1.000000 // buy
						if( bbp > -2.91852 )
							if( Negative_Money_Flow_Sum <= 1.83601e+08 )
								if( bearPower <= -0.766913 )
									ret := -0.695652
								if( bearPower > -0.766913 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 1.83601e+08 )
								if( bullPower <= -0.292024 )
									ret := 0.062500
								if( bullPower > -0.292024 )
									ret := -0.750000 // sell
					if( Money_Flow_Ratio > 0.307658 )
						if( Negative_Money_Flow_Sum <= 3.63212e+07 )
							if( Positive_Money_Flow_Sum <= 1.25864e+07 )
								if( Positive_Money_Flow_Sum <= 8.94128e+06 )
									ret := -0.285714
								if( Positive_Money_Flow_Sum > 8.94128e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.25864e+07 )
								if( Negative_Money_Flow <= 2.73054e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.73054e+06 )
									ret := -0.285714
						if( Negative_Money_Flow_Sum > 3.63212e+07 )
							if( Positive_Money_Flow_Sum <= 7.37517e+07 )
								if( Typical_Price <= 430.026 )
									ret := 0.813559 // buy
								if( Typical_Price > 430.026 )
									ret := 0.176471
							if( Positive_Money_Flow_Sum > 7.37517e+07 )
								if( Negative_Money_Flow <= 1.23011e+07 )
									ret := 0.608696
								if( Negative_Money_Flow > 1.23011e+07 )
									ret := -0.523810
				if( Raw_Money_Flow > 2.78924e+07 )
					if( bullPower <= 0.636761 )
						if( Positive_Money_Flow_Sum <= 1.29902e+08 )
							if( Typical_Price <= 429.675 )
								if( Typical_Price <= 419.971 )
									ret := 1.000000 // buy
								if( Typical_Price > 419.971 )
									ret := 0.500000
							if( Typical_Price > 429.675 )
								if( Typical_Price <= 431.555 )
									ret := -0.444444
								if( Typical_Price > 431.555 )
									ret := 0.428571
						if( Positive_Money_Flow_Sum > 1.29902e+08 )
							if( MFI_Low <= 25.2278 )
								if( MFI_Low <= 23.8411 )
									ret := 0.952756 // buy
								if( MFI_Low > 23.8411 )
									ret := 0.600000
							if( MFI_Low > 25.2278 )
								if( MFI_Low <= 38.2445 )
									ret := -0.272727
								if( MFI_Low > 38.2445 )
									ret := 1.000000 // buy
					if( bullPower > 0.636761 )
						ret := -1.000000 // sell
			if( Typical_Price > 433.756 )
				if( Positive_Money_Flow_Sum <= 1.00941e+08 )
					if( Positive_Money_Flow_Sum <= 8.34319e+07 )
						if( bearPower <= -1.43244 )
							if( Positive_Money_Flow_Sum <= 3.27822e+06 )
								if( Raw_Money_Flow <= 7.68965e+06 )
									ret := 0.341463
								if( Raw_Money_Flow > 7.68965e+06 )
									ret := -0.548387
							if( Positive_Money_Flow_Sum > 3.27822e+06 )
								if( Typical_Price <= 483.348 )
									ret := 0.022298
								if( Typical_Price > 483.348 )
									ret := 0.246324
						if( bearPower > -1.43244 )
							if( MFI_High <= -60.2107 )
								if( bbm <= 0.43024 )
									ret := 0.083160
								if( bbm > 0.43024 )
									ret := -0.176651
							if( MFI_High > -60.2107 )
								if( Negative_Money_Flow_Sum <= 2.62662e+08 )
									ret := 0.067118
								if( Negative_Money_Flow_Sum > 2.62662e+08 )
									ret := -0.900000 // sell
					if( Positive_Money_Flow_Sum > 8.34319e+07 )
						if( bearPower <= -0.797797 )
							if( bearPower <= -4.61529 )
								if( Positive_Money_Flow_Sum <= 8.62347e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 8.62347e+07 )
									ret := -1.000000 // sell
							if( bearPower > -4.61529 )
								if( MFI <= 59.9597 )
									ret := -0.144819
								if( MFI > 59.9597 )
									ret := 0.727273 // buy
						if( bearPower > -0.797797 )
							if( Typical_Price <= 495.11 )
								if( bbp <= -1.14822 )
									ret := 0.250000
								if( bbp > -1.14822 )
									ret := 0.760000 // buy
							if( Typical_Price > 495.11 )
								if( bbp <= -1.14603 )
									ret := 1.000000 // buy
								if( bbp > -1.14603 )
									ret := -0.142857
				if( Positive_Money_Flow_Sum > 1.00941e+08 )
					if( MFI <= 14.9022 )
						if( Negative_Money_Flow <= 358976 )
							ret := 0.000000
						if( Negative_Money_Flow > 358976 )
							if( Negative_Money_Flow <= 2.24507e+08 )
								if( bbp <= -1.23115 )
									ret := 1.000000 // buy
								if( bbp > -1.23115 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow > 2.24507e+08 )
								ret := 0.250000
					if( MFI > 14.9022 )
						if( Positive_Money_Flow_Sum <= 2.75444e+08 )
							if( Positive_Money_Flow_Sum <= 1.82479e+08 )
								if( Negative_Money_Flow_Sum <= 9.08603e+08 )
									ret := 0.146114
								if( Negative_Money_Flow_Sum > 9.08603e+08 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.82479e+08 )
								if( Negative_Money_Flow <= 2.26636e+07 )
									ret := 0.180392
								if( Negative_Money_Flow > 2.26636e+07 )
									ret := 0.513216
						if( Positive_Money_Flow_Sum > 2.75444e+08 )
							if( Negative_Money_Flow_Sum <= 1.7144e+08 )
								if( Raw_Money_Flow <= 3.40512e+07 )
									ret := -0.796610 // sell
								if( Raw_Money_Flow > 3.40512e+07 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.7144e+08 )
								if( Negative_Money_Flow_Sum <= 2.37134e+08 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 2.37134e+08 )
									ret := -0.070033
	if( bbp > -0.991169 )
		if( bullPower <= 1.00223 )
			if( Money_Flow_Ratio <= 1.10927 )
				if( Typical_Price <= 464.212 )
					if( Positive_Money_Flow_Sum <= 4.6451e+07 )
						if( bullPower <= -0.008938 )
							if( Raw_Money_Flow <= 243098 )
								if( bearPower <= -0.303887 )
									ret := 0.642857
								if( bearPower > -0.303887 )
									ret := 0.162651
							if( Raw_Money_Flow > 243098 )
								if( Raw_Money_Flow <= 2.07533e+06 )
									ret := -0.065116
								if( Raw_Money_Flow > 2.07533e+06 )
									ret := 0.225962
						if( bullPower > -0.008938 )
							if( Money_Flow_Ratio <= 0.972338 )
								if( MFI <= 23.632 )
									ret := 0.177570
								if( MFI > 23.632 )
									ret := -0.069348
							if( Money_Flow_Ratio > 0.972338 )
								if( Raw_Money_Flow <= 267892 )
									ret := 0.315789
								if( Raw_Money_Flow > 267892 )
									ret := -0.435644
					if( Positive_Money_Flow_Sum > 4.6451e+07 )
						if( bullPower <= 0.312447 )
							if( Typical_Price <= 463.839 )
								if( bearPower <= -0.156581 )
									ret := 0.312357
								if( bearPower > -0.156581 )
									ret := 0.082569
							if( Typical_Price > 463.839 )
								if( bullPower <= 0.066126 )
									ret := -1.000000 // sell
								if( bullPower > 0.066126 )
									ret := 0.000000
						if( bullPower > 0.312447 )
							if( Positive_Money_Flow <= 1.0948e+06 )
								if( Positive_Money_Flow_Sum <= 6.48446e+07 )
									ret := 0.602564
								if( Positive_Money_Flow_Sum > 6.48446e+07 )
									ret := 0.086022
							if( Positive_Money_Flow > 1.0948e+06 )
								if( Positive_Money_Flow <= 3.20153e+07 )
									ret := -0.103343
								if( Positive_Money_Flow > 3.20153e+07 )
									ret := 0.393939
				if( Typical_Price > 464.212 )
					if( Positive_Money_Flow <= 2.76012e+07 )
						if( Positive_Money_Flow <= 1.82401e+07 )
							if( bearPower <= 0.413558 )
								if( Negative_Money_Flow <= 6.22762e+08 )
									ret := 0.013051
								if( Negative_Money_Flow > 6.22762e+08 )
									ret := 0.650000
							if( bearPower > 0.413558 )
								if( Positive_Money_Flow_Sum <= 1.67091e+06 )
									ret := -0.387850
								if( Positive_Money_Flow_Sum > 1.67091e+06 )
									ret := -0.043165
						if( Positive_Money_Flow > 1.82401e+07 )
							if( Positive_Money_Flow_Sum <= 1.9137e+08 )
								if( Negative_Money_Flow_Sum <= 2.22718e+08 )
									ret := 0.238197
								if( Negative_Money_Flow_Sum > 2.22718e+08 )
									ret := -0.255952
							if( Positive_Money_Flow_Sum > 1.9137e+08 )
								if( Money_Flow_Ratio <= 0.532802 )
									ret := -0.583333
								if( Money_Flow_Ratio > 0.532802 )
									ret := 0.578125
					if( Positive_Money_Flow > 2.76012e+07 )
						if( Money_Flow_Ratio <= 0.995918 )
							if( bbm <= 1.69056 )
								if( bbm <= 1.66078 )
									ret := -0.280405
								if( bbm > 1.66078 )
									ret := 1.000000 // buy
							if( bbm > 1.69056 )
								if( Positive_Money_Flow_Sum <= 6.68357e+07 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 6.68357e+07 )
									ret := -0.755556 // sell
						if( Money_Flow_Ratio > 0.995918 )
							if( bullPower <= 0.871208 )
								if( Positive_Money_Flow_Sum <= 1.13368e+08 )
									ret := 0.842105 // buy
								if( Positive_Money_Flow_Sum > 1.13368e+08 )
									ret := 0.304348
							if( bullPower > 0.871208 )
								if( bullPower <= 0.935158 )
									ret := -0.923077 // sell
								if( bullPower > 0.935158 )
									ret := 0.166667
			if( Money_Flow_Ratio > 1.10927 )
				if( Positive_Money_Flow_Sum <= 2.80538e+08 )
					if( Negative_Money_Flow_Sum <= 9.70461e+07 )
						if( Negative_Money_Flow_Sum <= 9.06133e+07 )
							if( Negative_Money_Flow_Sum <= 474924 )
								if( Positive_Money_Flow_Sum <= 2.42794e+06 )
									ret := 0.722772 // buy
								if( Positive_Money_Flow_Sum > 2.42794e+06 )
									ret := -0.095238
							if( Negative_Money_Flow_Sum > 474924 )
								if( Typical_Price <= 509.349 )
									ret := 0.084964
								if( Typical_Price > 509.349 )
									ret := 0.022281
						if( Negative_Money_Flow_Sum > 9.06133e+07 )
							if( Positive_Money_Flow_Sum <= 1.1627e+08 )
								if( Positive_Money_Flow <= 9.08853e+06 )
									ret := 0.396552
								if( Positive_Money_Flow > 9.08853e+06 )
									ret := -0.592593
							if( Positive_Money_Flow_Sum > 1.1627e+08 )
								if( Typical_Price <= 493.679 )
									ret := -0.462500
								if( Typical_Price > 493.679 )
									ret := -0.165680
					if( Negative_Money_Flow_Sum > 9.70461e+07 )
						if( Negative_Money_Flow_Sum <= 1.30132e+08 )
							if( bbm <= 0.48525 )
								if( Positive_Money_Flow_Sum <= 1.37282e+08 )
									ret := -0.305556
								if( Positive_Money_Flow_Sum > 1.37282e+08 )
									ret := 0.140271
							if( bbm > 0.48525 )
								if( Typical_Price <= 518.272 )
									ret := 0.379006
								if( Typical_Price > 518.272 )
									ret := 0.073333
						if( Negative_Money_Flow_Sum > 1.30132e+08 )
							if( Positive_Money_Flow_Sum <= 2.33885e+08 )
								if( Typical_Price <= 498.874 )
									ret := -0.206107
								if( Typical_Price > 498.874 )
									ret := 0.192488
							if( Positive_Money_Flow_Sum > 2.33885e+08 )
								if( Money_Flow_Ratio <= 1.17874 )
									ret := 0.754717 // buy
								if( Money_Flow_Ratio > 1.17874 )
									ret := 0.219626
				if( Positive_Money_Flow_Sum > 2.80538e+08 )
					if( MFI_High <= -22.9321 )
						if( Raw_Money_Flow <= 3.65556e+07 )
							if( Negative_Money_Flow_Sum <= 2.67317e+08 )
								if( Positive_Money_Flow_Sum <= 3.22224e+08 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 3.22224e+08 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.67317e+08 )
								if( Typical_Price <= 505.409 )
									ret := -0.272727
								if( Typical_Price > 505.409 )
									ret := -0.933333 // sell
						if( Raw_Money_Flow > 3.65556e+07 )
							if( bbm <= 1.41177 )
								if( Typical_Price <= 494.458 )
									ret := 0.970588 // buy
								if( Typical_Price > 494.458 )
									ret := 0.166667
							if( bbm > 1.41177 )
								if( MFI <= 55.2785 )
									ret := -0.200000
								if( MFI > 55.2785 )
									ret := 0.750000 // buy
					if( MFI_High > -22.9321 )
						if( bbm <= 0.787874 )
							if( bullPower <= 0.988572 )
								if( Money_Flow_Ratio <= 2.2181 )
									ret := -0.250000
								if( Money_Flow_Ratio > 2.2181 )
									ret := 0.018821
							if( bullPower > 0.988572 )
								ret := 1.000000 // buy
						if( bbm > 0.787874 )
							if( bullPower <= 0.609398 )
								if( Positive_Money_Flow_Sum <= 1.23376e+09 )
									ret := -0.482051
								if( Positive_Money_Flow_Sum > 1.23376e+09 )
									ret := 0.888889 // buy
							if( bullPower > 0.609398 )
								if( Positive_Money_Flow_Sum <= 4.06484e+08 )
									ret := 0.089655
								if( Positive_Money_Flow_Sum > 4.06484e+08 )
									ret := -0.398374
		if( bullPower > 1.00223 )
			if( MFI_Low <= 76.324 )
				if( bbp <= 9.0041 )
					if( bbp <= 6.15885 )
						if( Negative_Money_Flow_Sum <= 1.2082e+09 )
							if( Negative_Money_Flow_Sum <= 8.41012e+08 )
								if( Money_Flow_Ratio <= 2.03755 )
									ret := 0.023488
								if( Money_Flow_Ratio > 2.03755 )
									ret := -0.077439
							if( Negative_Money_Flow_Sum > 8.41012e+08 )
								if( MFI_Low <= 8.54615 )
									ret := -0.902439 // sell
								if( MFI_Low > 8.54615 )
									ret := -0.419355
						if( Negative_Money_Flow_Sum > 1.2082e+09 )
							if( Positive_Money_Flow_Sum <= 6.15484e+08 )
								ret := 0.250000
							if( Positive_Money_Flow_Sum > 6.15484e+08 )
								ret := 1.000000 // buy
					if( bbp > 6.15885 )
						if( bullPower <= 3.92401 )
							if( MFI_High <= -12.0918 )
								if( Typical_Price <= 485.866 )
									ret := -0.600000
								if( Typical_Price > 485.866 )
									ret := 0.428571
							if( MFI_High > -12.0918 )
								if( MFI_Low <= 53.5984 )
									ret := 0.500000
								if( MFI_Low > 53.5984 )
									ret := 0.948718 // buy
						if( bullPower > 3.92401 )
							if( Typical_Price <= 504.513 )
								if( Positive_Money_Flow <= 8.52696e+07 )
									ret := 0.583333
								if( Positive_Money_Flow > 8.52696e+07 )
									ret := -0.088235
							if( Typical_Price > 504.513 )
								if( bbm <= 2.0846 )
									ret := 0.137931
								if( bbm > 2.0846 )
									ret := -1.000000 // sell
				if( bbp > 9.0041 )
					if( Negative_Money_Flow_Sum <= 1.85397e+08 )
						if( bbm <= 22.471 )
							if( Positive_Money_Flow_Sum <= 3.97265e+06 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 3.97265e+06 )
								if( bearPower <= 3.90749 )
									ret := -0.166667
								if( bearPower > 3.90749 )
									ret := 0.500000
						if( bbm > 22.471 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.85397e+08 )
						if( bbm <= 2.375 )
							ret := 0.000000
						if( bbm > 2.375 )
							if( Negative_Money_Flow_Sum <= 1.99027e+08 )
								ret := -0.571429
							if( Negative_Money_Flow_Sum > 1.99027e+08 )
								ret := -1.000000 // sell
			if( MFI_Low > 76.324 )
				if( bbm <= 0.743988 )
					if( Negative_Money_Flow_Sum <= 6.02096e+06 )
						if( bbp <= 2.12366 )
							ret := -0.285714
						if( bbp > 2.12366 )
							if( MFI <= 98.3466 )
								ret := -1.000000 // sell
							if( MFI > 98.3466 )
								ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 6.02096e+06 )
						if( bullPower <= 1.50023 )
							if( bearPower <= 0.911519 )
								ret := 0.000000
							if( bearPower > 0.911519 )
								ret := -0.250000
						if( bullPower > 1.50023 )
							ret := 0.857143 // buy
				if( bbm > 0.743988 )
					if( bbm <= 3.12205 )
						if( Positive_Money_Flow_Sum <= 5.60991e+08 )
							if( Raw_Money_Flow <= 1.51692e+08 )
								if( Typical_Price <= 519.655 )
									ret := 0.769231 // buy
								if( Typical_Price > 519.655 )
									ret := 0.185185
							if( Raw_Money_Flow > 1.51692e+08 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 5.60991e+08 )
							ret := -0.833333 // sell
					if( bbm > 3.12205 )
						if( bbp <= 4.66221 )
							if( bbp <= 3.82437 )
								ret := -1.000000 // sell
							if( bbp > 3.82437 )
								ret := -0.500000
						if( bbp > 4.66221 )
							ret := 0.600000
	
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
float op_operation = decision_tree_0_META_1Min_b693f43b(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


