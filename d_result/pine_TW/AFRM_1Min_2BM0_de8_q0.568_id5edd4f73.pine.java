//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: AFRM_1Min_2BM0_5edd4f73 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2BM0_5edd4f73", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_5edd4f73(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.031067 )
		if( bbm <= 0.009693 )
			if( Positive_Money_Flow_Sum <= 54240.2 )
				if( Positive_Money_Flow <= 8512.84 )
					if( Typical_Price <= 32.82 )
						if( bearPower <= -0.049815 )
							if( Negative_Money_Flow_Sum <= 313545 )
								if( Positive_Money_Flow_Sum <= 15213.3 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 15213.3 )
									ret := 0.751553 // buy
							if( Negative_Money_Flow_Sum > 313545 )
								if( Positive_Money_Flow_Sum <= 53169.1 )
									ret := 0.983051 // buy
								if( Positive_Money_Flow_Sum > 53169.1 )
									ret := 0.500000
						if( bearPower > -0.049815 )
							if( Raw_Money_Flow <= 28652.6 )
								if( Typical_Price <= 29.6638 )
									ret := 0.320000
								if( Typical_Price > 29.6638 )
									ret := 0.777778 // buy
							if( Raw_Money_Flow > 28652.6 )
								ret := -0.333333
					if( Typical_Price > 32.82 )
						if( MFI_Low <= 16.1213 )
							if( MFI_High <= -61.2205 )
								if( Raw_Money_Flow <= 17063.5 )
									ret := 0.054054
								if( Raw_Money_Flow > 17063.5 )
									ret := 0.608696
							if( MFI_High > -61.2205 )
								if( Typical_Price <= 34.1218 )
									ret := 0.200000
								if( Typical_Price > 34.1218 )
									ret := 0.862069 // buy
						if( MFI_Low > 16.1213 )
							ret := -0.600000
				if( Positive_Money_Flow > 8512.84 )
					if( Money_Flow_Ratio <= 0.250411 )
						if( Positive_Money_Flow <= 11474.3 )
							ret := -0.166667
						if( Positive_Money_Flow > 11474.3 )
							ret := -0.714286 // sell
					if( Money_Flow_Ratio > 0.250411 )
						ret := 0.750000 // buy
			if( Positive_Money_Flow_Sum > 54240.2 )
				if( Raw_Money_Flow <= 7164.66 )
					if( Negative_Money_Flow <= 7.46609 )
						if( Negative_Money_Flow_Sum <= 89491.2 )
							if( Positive_Money_Flow <= 3016.18 )
								if( bullPower <= -0.095431 )
									ret := -0.750000 // sell
								if( bullPower > -0.095431 )
									ret := 0.615385
							if( Positive_Money_Flow > 3016.18 )
								if( Negative_Money_Flow_Sum <= 70194.4 )
									ret := -0.222222
								if( Negative_Money_Flow_Sum > 70194.4 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 89491.2 )
							if( Raw_Money_Flow <= 4049.22 )
								if( Negative_Money_Flow_Sum <= 135319 )
									ret := 0.125000
								if( Negative_Money_Flow_Sum > 135319 )
									ret := 0.764706 // buy
							if( Raw_Money_Flow > 4049.22 )
								if( Negative_Money_Flow_Sum <= 192683 )
									ret := 0.615385
								if( Negative_Money_Flow_Sum > 192683 )
									ret := 0.000000
					if( Negative_Money_Flow > 7.46609 )
						if( Typical_Price <= 26.1184 )
							if( Raw_Money_Flow <= 5526.25 )
								if( Raw_Money_Flow <= 2778.31 )
									ret := -0.500000
								if( Raw_Money_Flow > 2778.31 )
									ret := 0.777778 // buy
							if( Raw_Money_Flow > 5526.25 )
								if( Typical_Price <= 24.5704 )
									ret := -0.750000 // sell
								if( Typical_Price > 24.5704 )
									ret := -0.111111
						if( Typical_Price > 26.1184 )
							if( bullPower <= -0.066061 )
								if( Negative_Money_Flow_Sum <= 56193.2 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 56193.2 )
									ret := 0.699588
							if( bullPower > -0.066061 )
								if( Typical_Price <= 31.3142 )
									ret := 0.669565
								if( Typical_Price > 31.3142 )
									ret := 0.285714
				if( Raw_Money_Flow > 7164.66 )
					if( Negative_Money_Flow_Sum <= 61285.7 )
						if( bullPower <= -0.09916 )
							if( Positive_Money_Flow_Sum <= 124427 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 124427 )
								if( Typical_Price <= 32.1352 )
									ret := -1.000000 // sell
								if( Typical_Price > 32.1352 )
									ret := -0.800000 // sell
						if( bullPower > -0.09916 )
							if( Negative_Money_Flow <= 12002.6 )
								if( Typical_Price <= 32.11 )
									ret := 0.611111
								if( Typical_Price > 32.11 )
									ret := -0.058824
							if( Negative_Money_Flow > 12002.6 )
								if( Raw_Money_Flow <= 13133.6 )
									ret := -0.250000
								if( Raw_Money_Flow > 13133.6 )
									ret := -0.666667
					if( Negative_Money_Flow_Sum > 61285.7 )
						if( MFI_High <= -44.9304 )
							if( Negative_Money_Flow_Sum <= 760591 )
								if( Negative_Money_Flow_Sum <= 140919 )
									ret := -0.812500 // sell
								if( Negative_Money_Flow_Sum > 140919 )
									ret := 0.104839
							if( Negative_Money_Flow_Sum > 760591 )
								if( bbp <= -0.306013 )
									ret := 0.827586 // buy
								if( bbp > -0.306013 )
									ret := 0.368159
						if( MFI_High > -44.9304 )
							if( bullPower <= -0.111026 )
								if( MFI <= 53.6256 )
									ret := 0.620253
								if( MFI > 53.6256 )
									ret := 0.300813
							if( bullPower > -0.111026 )
								if( Positive_Money_Flow_Sum <= 424827 )
									ret := 0.366577
								if( Positive_Money_Flow_Sum > 424827 )
									ret := 0.119718
		if( bbm > 0.009693 )
			if( Positive_Money_Flow_Sum <= 261149 )
				if( Negative_Money_Flow_Sum <= 5.6312e+07 )
					if( Money_Flow_Ratio <= 0.445176 )
						if( bearPower <= -0.160391 )
							if( bbm <= 0.132229 )
								if( MFI <= 2.50834 )
									ret := -0.250000
								if( MFI > 2.50834 )
									ret := 0.500000
							if( bbm > 0.132229 )
								if( Typical_Price <= 31.795 )
									ret := -0.236842
								if( Typical_Price > 31.795 )
									ret := 0.428571
						if( bearPower > -0.160391 )
							if( Positive_Money_Flow_Sum <= 38502.7 )
								if( Typical_Price <= 37.0233 )
									ret := 0.615385
								if( Typical_Price > 37.0233 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 38502.7 )
								if( Positive_Money_Flow_Sum <= 150159 )
									ret := -0.153310
								if( Positive_Money_Flow_Sum > 150159 )
									ret := 0.228188
					if( Money_Flow_Ratio > 0.445176 )
						if( Negative_Money_Flow_Sum <= 381597 )
							if( Typical_Price <= 40.0318 )
								if( Raw_Money_Flow <= 76855.5 )
									ret := 0.466851
								if( Raw_Money_Flow > 76855.5 )
									ret := 0.028571
							if( Typical_Price > 40.0318 )
								if( Negative_Money_Flow_Sum <= 345394 )
									ret := 0.133333
								if( Negative_Money_Flow_Sum > 345394 )
									ret := -0.888889 // sell
						if( Negative_Money_Flow_Sum > 381597 )
							if( bbp <= -0.117676 )
								if( Negative_Money_Flow_Sum <= 505917 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 505917 )
									ret := 0.800000 // buy
							if( bbp > -0.117676 )
								ret := 0.333333
				if( Negative_Money_Flow_Sum > 5.6312e+07 )
					ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 261149 )
				if( Positive_Money_Flow_Sum <= 1.16438e+07 )
					if( Typical_Price <= 32.76 )
						if( Negative_Money_Flow_Sum <= 5.74579e+06 )
							if( Typical_Price <= 28.0249 )
								if( Typical_Price <= 24.0568 )
									ret := 0.641026
								if( Typical_Price > 24.0568 )
									ret := -0.071303
							if( Typical_Price > 28.0249 )
								if( bbm <= 0.044956 )
									ret := -0.015813
								if( bbm > 0.044956 )
									ret := 0.144378
						if( Negative_Money_Flow_Sum > 5.74579e+06 )
							if( Negative_Money_Flow_Sum <= 2.25532e+07 )
								if( Negative_Money_Flow_Sum <= 6.40309e+06 )
									ret := 0.411960
								if( Negative_Money_Flow_Sum > 6.40309e+06 )
									ret := 0.197794
							if( Negative_Money_Flow_Sum > 2.25532e+07 )
								if( Raw_Money_Flow <= 485251 )
									ret := 0.400000
								if( Raw_Money_Flow > 485251 )
									ret := 0.950000 // buy
					if( Typical_Price > 32.76 )
						if( bearPower <= -0.859865 )
							if( Positive_Money_Flow_Sum <= 2.00963e+06 )
								if( Raw_Money_Flow <= 345765 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 345765 )
									ret := -0.428571
							if( Positive_Money_Flow_Sum > 2.00963e+06 )
								if( Positive_Money_Flow_Sum <= 4.98394e+06 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 4.98394e+06 )
									ret := -1.000000 // sell
						if( bearPower > -0.859865 )
							if( Negative_Money_Flow_Sum <= 2.83817e+07 )
								if( MFI_Low <= -5.21604 )
									ret := -0.181197
								if( MFI_Low > -5.21604 )
									ret := 0.039654
							if( Negative_Money_Flow_Sum > 2.83817e+07 )
								if( Money_Flow_Ratio <= 0.268378 )
									ret := 0.145251
								if( Money_Flow_Ratio > 0.268378 )
									ret := 0.721311 // buy
				if( Positive_Money_Flow_Sum > 1.16438e+07 )
					if( Raw_Money_Flow <= 2.4974e+06 )
						if( Negative_Money_Flow_Sum <= 1.64752e+07 )
							if( MFI_Low <= 35.2527 )
								if( bearPower <= -0.312824 )
									ret := 1.000000 // buy
								if( bearPower > -0.312824 )
									ret := -0.240741
							if( MFI_Low > 35.2527 )
								if( Positive_Money_Flow_Sum <= 1.78956e+07 )
									ret := 0.707071 // buy
								if( Positive_Money_Flow_Sum > 1.78956e+07 )
									ret := -0.161290
						if( Negative_Money_Flow_Sum > 1.64752e+07 )
							if( bearPower <= -0.221869 )
								if( MFI_Low <= 7.17018 )
									ret := 0.222222
								if( MFI_Low > 7.17018 )
									ret := 0.846154 // buy
							if( bearPower > -0.221869 )
								if( Negative_Money_Flow <= 879205 )
									ret := 0.787234 // buy
								if( Negative_Money_Flow > 879205 )
									ret := 0.057143
					if( Raw_Money_Flow > 2.4974e+06 )
						if( MFI <= 45.4386 )
							if( Typical_Price <= 44.805 )
								if( Typical_Price <= 43.9265 )
									ret := 0.155039
								if( Typical_Price > 43.9265 )
									ret := 0.722222 // buy
							if( Typical_Price > 44.805 )
								if( Positive_Money_Flow <= 142261 )
									ret := 0.000000
								if( Positive_Money_Flow > 142261 )
									ret := -0.900000 // sell
						if( MFI > 45.4386 )
							if( Negative_Money_Flow <= 5.81746e+06 )
								if( Negative_Money_Flow_Sum <= 2.73846e+07 )
									ret := -0.106383
								if( Negative_Money_Flow_Sum > 2.73846e+07 )
									ret := -0.828571 // sell
							if( Negative_Money_Flow > 5.81746e+06 )
								if( bearPower <= -0.333488 )
									ret := 0.750000 // buy
								if( bearPower > -0.333488 )
									ret := 1.000000 // buy
	if( bullPower > -0.031067 )
		if( bearPower <= 0.026074 )
			if( Positive_Money_Flow_Sum <= 1.18115e+07 )
				if( Negative_Money_Flow_Sum <= 165284 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 0.082935 )
							if( bbp <= -1.5e-05 )
								if( Raw_Money_Flow <= 32365.7 )
									ret := 0.244080
								if( Raw_Money_Flow > 32365.7 )
									ret := 0.009524
							if( bbp > -1.5e-05 )
								if( Negative_Money_Flow_Sum <= 48482.6 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 48482.6 )
									ret := 0.551867
						if( bullPower > 0.082935 )
							if( Positive_Money_Flow <= 13598.7 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 13598.7 )
								if( Negative_Money_Flow_Sum <= 156251 )
									ret := -0.888889 // sell
								if( Negative_Money_Flow_Sum > 156251 )
									ret := -0.200000
					if( BBPower_Color > 0.5 )
						if( Typical_Price <= 29.2424 )
							if( Negative_Money_Flow_Sum <= 134596 )
								if( Typical_Price <= 24.8612 )
									ret := -0.466667
								if( Typical_Price > 24.8612 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 134596 )
								if( MFI_High <= -5.00943 )
									ret := 0.673469
								if( MFI_High > -5.00943 )
									ret := -0.142857
						if( Typical_Price > 29.2424 )
							if( Money_Flow_Ratio <= 6.4364 )
								if( bearPower <= -0.097878 )
									ret := -0.600000
								if( bearPower > -0.097878 )
									ret := 0.037838
							if( Money_Flow_Ratio > 6.4364 )
								if( bbp <= 0.259536 )
									ret := -0.206897
								if( bbp > 0.259536 )
									ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 165284 )
					if( Raw_Money_Flow <= 1.54426e+06 )
						if( Negative_Money_Flow <= 402310 )
							if( MFI_Low <= -3.48654 )
								if( Raw_Money_Flow <= 243329 )
									ret := -0.020772
								if( Raw_Money_Flow > 243329 )
									ret := -0.401235
							if( MFI_Low > -3.48654 )
								if( MFI <= 21.7787 )
									ret := 0.160735
								if( MFI > 21.7787 )
									ret := 0.030901
						if( Negative_Money_Flow > 402310 )
							if( bbm <= 0.170431 )
								if( Positive_Money_Flow_Sum <= 5.90347e+06 )
									ret := -0.049292
								if( Positive_Money_Flow_Sum > 5.90347e+06 )
									ret := 0.066298
							if( bbm > 0.170431 )
								if( Negative_Money_Flow_Sum <= 1.52232e+06 )
									ret := 0.184615
								if( Negative_Money_Flow_Sum > 1.52232e+06 )
									ret := -0.271429
					if( Raw_Money_Flow > 1.54426e+06 )
						if( Negative_Money_Flow_Sum <= 2.76915e+07 )
							if( Negative_Money_Flow_Sum <= 1.71701e+07 )
								if( Typical_Price <= 31.2965 )
									ret := 0.300275
								if( Typical_Price > 31.2965 )
									ret := 0.088889
							if( Negative_Money_Flow_Sum > 1.71701e+07 )
								if( Typical_Price <= 41.5935 )
									ret := 0.040816
								if( Typical_Price > 41.5935 )
									ret := -0.607843
						if( Negative_Money_Flow_Sum > 2.76915e+07 )
							if( Typical_Price <= 47.6784 )
								if( Positive_Money_Flow <= 2.70177e+06 )
									ret := 0.780000 // buy
								if( Positive_Money_Flow > 2.70177e+06 )
									ret := 0.214286
							if( Typical_Price > 47.6784 )
								ret := -0.750000 // sell
			if( Positive_Money_Flow_Sum > 1.18115e+07 )
				if( bearPower <= -0.027829 )
					if( bearPower <= -0.116514 )
						if( MFI_Low <= 60.9626 )
							if( Negative_Money_Flow <= 2.60397e+06 )
								if( Positive_Money_Flow_Sum <= 1.64615e+07 )
									ret := 0.295000
								if( Positive_Money_Flow_Sum > 1.64615e+07 )
									ret := -0.112108
							if( Negative_Money_Flow > 2.60397e+06 )
								if( Negative_Money_Flow_Sum <= 8.01509e+07 )
									ret := 0.436842
								if( Negative_Money_Flow_Sum > 8.01509e+07 )
									ret := -1.000000 // sell
						if( MFI_Low > 60.9626 )
							if( bbm <= 0.579225 )
								if( Negative_Money_Flow_Sum <= 5.30919e+06 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 5.30919e+06 )
									ret := -1.000000 // sell
							if( bbm > 0.579225 )
								ret := 0.250000
					if( bearPower > -0.116514 )
						if( Negative_Money_Flow_Sum <= 2.98523e+07 )
							if( bearPower <= -0.045884 )
								if( Money_Flow_Ratio <= 0.945123 )
									ret := 0.747475 // buy
								if( Money_Flow_Ratio > 0.945123 )
									ret := 0.376254
							if( bearPower > -0.045884 )
								if( bbm <= 0.250168 )
									ret := 0.232365
								if( bbm > 0.250168 )
									ret := -0.318182
						if( Negative_Money_Flow_Sum > 2.98523e+07 )
							if( bullPower <= 0.180787 )
								if( bullPower <= 0.01094 )
									ret := 0.200000
								if( bullPower > 0.01094 )
									ret := -0.471698
							if( bullPower > 0.180787 )
								if( Positive_Money_Flow_Sum <= 8.23663e+07 )
									ret := 0.814815 // buy
								if( Positive_Money_Flow_Sum > 8.23663e+07 )
									ret := -0.142857
				if( bearPower > -0.027829 )
					if( Positive_Money_Flow_Sum <= 2.05446e+07 )
						if( Negative_Money_Flow_Sum <= 9.98691e+06 )
							if( MFI <= 73.7315 )
								if( bearPower <= 0.006309 )
									ret := 0.367089
								if( bearPower > 0.006309 )
									ret := 0.061224
							if( MFI > 73.7315 )
								if( Money_Flow_Ratio <= 4.79092 )
									ret := -0.221311
								if( Money_Flow_Ratio > 4.79092 )
									ret := 0.170732
						if( Negative_Money_Flow_Sum > 9.98691e+06 )
							if( bbp <= 0.04644 )
								if( Typical_Price <= 32.6313 )
									ret := -0.190476
								if( Typical_Price > 32.6313 )
									ret := 0.297297
							if( bbp > 0.04644 )
								if( Raw_Money_Flow <= 3.15099e+06 )
									ret := -0.447154
								if( Raw_Money_Flow > 3.15099e+06 )
									ret := 0.133333
					if( Positive_Money_Flow_Sum > 2.05446e+07 )
						if( Typical_Price <= 39.8075 )
							if( Positive_Money_Flow_Sum <= 4.56558e+07 )
								if( Positive_Money_Flow <= 434056 )
									ret := -0.025316
								if( Positive_Money_Flow > 434056 )
									ret := -0.444444
							if( Positive_Money_Flow_Sum > 4.56558e+07 )
								if( Positive_Money_Flow_Sum <= 7.81331e+07 )
									ret := 0.814815 // buy
								if( Positive_Money_Flow_Sum > 7.81331e+07 )
									ret := 0.142857
						if( Typical_Price > 39.8075 )
							if( Positive_Money_Flow_Sum <= 6.53195e+07 )
								if( bbm <= 0.129276 )
									ret := 0.155844
								if( bbm > 0.129276 )
									ret := 0.533333
							if( Positive_Money_Flow_Sum > 6.53195e+07 )
								if( Money_Flow_Ratio <= 3.91798 )
									ret := -0.687500
								if( Money_Flow_Ratio > 3.91798 )
									ret := -0.125000
		if( bearPower > 0.026074 )
			if( Raw_Money_Flow <= 38926.3 )
				if( bearPower <= 0.059051 )
					if( Negative_Money_Flow_Sum <= 92741.8 )
						if( Negative_Money_Flow_Sum <= 88417.6 )
							if( MFI_Low <= 31.1912 )
								if( Positive_Money_Flow_Sum <= 41714.1 )
									ret := 0.222222
								if( Positive_Money_Flow_Sum > 41714.1 )
									ret := -0.591837
							if( MFI_Low > 31.1912 )
								if( Typical_Price <= 28.2809 )
									ret := 0.447368
								if( Typical_Price > 28.2809 )
									ret := -0.086379
						if( Negative_Money_Flow_Sum > 88417.6 )
							if( MFI_Low <= 42.2591 )
								if( Negative_Money_Flow_Sum <= 88686.2 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 88686.2 )
									ret := -0.090909
							if( MFI_Low > 42.2591 )
								if( MFI <= 79.7316 )
									ret := 1.000000 // buy
								if( MFI > 79.7316 )
									ret := 0.250000
					if( Negative_Money_Flow_Sum > 92741.8 )
						if( Positive_Money_Flow <= 18167.7 )
							if( Positive_Money_Flow_Sum <= 99559.2 )
								if( Raw_Money_Flow <= 32581.1 )
									ret := -0.041096
								if( Raw_Money_Flow > 32581.1 )
									ret := 0.833333 // buy
							if( Positive_Money_Flow_Sum > 99559.2 )
								if( Positive_Money_Flow_Sum <= 174093 )
									ret := -0.364583
								if( Positive_Money_Flow_Sum > 174093 )
									ret := -0.130872
						if( Positive_Money_Flow > 18167.7 )
							if( Positive_Money_Flow <= 18803.8 )
								if( Negative_Money_Flow_Sum <= 233492 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 233492 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 18803.8 )
								if( Negative_Money_Flow_Sum <= 122196 )
									ret := -0.473684
								if( Negative_Money_Flow_Sum > 122196 )
									ret := 0.070093
				if( bearPower > 0.059051 )
					if( Negative_Money_Flow <= 4981.74 )
						if( bullPower <= 0.345126 )
							if( Typical_Price <= 36.6017 )
								if( Positive_Money_Flow <= 9345.03 )
									ret := -0.522496
								if( Positive_Money_Flow > 9345.03 )
									ret := -0.323823
							if( Typical_Price > 36.6017 )
								if( Typical_Price <= 37.0365 )
									ret := 0.700000 // buy
								if( Typical_Price > 37.0365 )
									ret := -0.199234
						if( bullPower > 0.345126 )
							if( Typical_Price <= 27.377 )
								if( bearPower <= 0.410621 )
									ret := 1.000000 // buy
								if( bearPower > 0.410621 )
									ret := 0.714286 // buy
							if( Typical_Price > 27.377 )
								if( MFI_Low <= 33.6723 )
									ret := -0.833333 // sell
								if( MFI_Low > 33.6723 )
									ret := 0.186047
					if( Negative_Money_Flow > 4981.74 )
						if( Money_Flow_Ratio <= 3.46521 )
							if( bullPower <= 0.161206 )
								if( Positive_Money_Flow_Sum <= 157987 )
									ret := 0.126316
								if( Positive_Money_Flow_Sum > 157987 )
									ret := -0.434066
							if( bullPower > 0.161206 )
								if( MFI_Low <= 11.844 )
									ret := -0.666667
								if( MFI_Low > 11.844 )
									ret := 0.298507
						if( Money_Flow_Ratio > 3.46521 )
							if( Typical_Price <= 29.4519 )
								if( Negative_Money_Flow_Sum <= 999455 )
									ret := 0.928571 // buy
								if( Negative_Money_Flow_Sum > 999455 )
									ret := -0.800000 // sell
							if( Typical_Price > 29.4519 )
								if( Negative_Money_Flow <= 31038.9 )
									ret := 0.147368
								if( Negative_Money_Flow > 31038.9 )
									ret := -0.714286 // sell
			if( Raw_Money_Flow > 38926.3 )
				if( Positive_Money_Flow_Sum <= 6.61721e+06 )
					if( bbm <= 0.113799 )
						if( Positive_Money_Flow_Sum <= 5.71439e+06 )
							if( MFI_Low <= 68.2959 )
								if( Negative_Money_Flow_Sum <= 1.11433e+06 )
									ret := -0.051896
								if( Negative_Money_Flow_Sum > 1.11433e+06 )
									ret := 0.046615
							if( MFI_Low > 68.2959 )
								if( Typical_Price <= 42.0953 )
									ret := 0.288952
								if( Typical_Price > 42.0953 )
									ret := -0.424242
						if( Positive_Money_Flow_Sum > 5.71439e+06 )
							if( bullPower <= 0.18357 )
								if( Typical_Price <= 30.9405 )
									ret := 0.166667
								if( Typical_Price > 30.9405 )
									ret := -0.220930
							if( bullPower > 0.18357 )
								if( MFI_High <= 9.32173 )
									ret := -0.652174
								if( MFI_High > 9.32173 )
									ret := 0.125000
					if( bbm > 0.113799 )
						if( Raw_Money_Flow <= 148424 )
							if( Positive_Money_Flow_Sum <= 176850 )
								if( Typical_Price <= 33.2107 )
									ret := 1.000000 // buy
								if( Typical_Price > 33.2107 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 176850 )
								if( Typical_Price <= 39.8284 )
									ret := -0.651007
								if( Typical_Price > 39.8284 )
									ret := 0.181818
						if( Raw_Money_Flow > 148424 )
							if( Raw_Money_Flow <= 1.05679e+06 )
								if( bullPower <= 0.467829 )
									ret := -0.168297
								if( bullPower > 0.467829 )
									ret := 0.215190
							if( Raw_Money_Flow > 1.05679e+06 )
								if( Typical_Price <= 32.6904 )
									ret := -0.224719
								if( Typical_Price > 32.6904 )
									ret := -0.632184
				if( Positive_Money_Flow_Sum > 6.61721e+06 )
					if( Positive_Money_Flow <= 1.04621e+07 )
						if( Positive_Money_Flow <= 5.34059e+06 )
							if( bullPower <= 0.540813 )
								if( bbm <= 0.029753 )
									ret := -0.258065
								if( bbm > 0.029753 )
									ret := 0.110915
							if( bullPower > 0.540813 )
								if( Negative_Money_Flow_Sum <= 246628 )
									ret := 0.916667 // buy
								if( Negative_Money_Flow_Sum > 246628 )
									ret := -0.412214
						if( Positive_Money_Flow > 5.34059e+06 )
							if( MFI_High <= -22.8 )
								if( Negative_Money_Flow_Sum <= 3.07806e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 3.07806e+07 )
									ret := 1.000000 // buy
							if( MFI_High > -22.8 )
								if( bbm <= 0.570724 )
									ret := -0.393365
								if( bbm > 0.570724 )
									ret := 0.500000
					if( Positive_Money_Flow > 1.04621e+07 )
						if( Negative_Money_Flow_Sum <= 3.39946e+07 )
							if( bbm <= 0.158367 )
								if( Raw_Money_Flow <= 1.41515e+07 )
									ret := -0.400000
								if( Raw_Money_Flow > 1.41515e+07 )
									ret := 0.400000
							if( bbm > 0.158367 )
								if( bearPower <= 0.085461 )
									ret := 0.250000
								if( bearPower > 0.085461 )
									ret := 0.940299 // buy
						if( Negative_Money_Flow_Sum > 3.39946e+07 )
							if( Money_Flow_Ratio <= 1.33811 )
								ret := 0.600000
							if( Money_Flow_Ratio > 1.33811 )
								if( MFI_High <= -9.5304 )
									ret := -1.000000 // sell
								if( MFI_High > -9.5304 )
									ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_AFRM_1Min_5edd4f73(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


