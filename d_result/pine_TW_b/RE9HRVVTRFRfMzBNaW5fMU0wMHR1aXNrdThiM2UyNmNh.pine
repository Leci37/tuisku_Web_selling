//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: DOGEUSDT_30Min_1M00_8b3e26ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1M00_8b3e26ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_8b3e26ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 4.00492e+06 )
		if( MFI <= 82.2437 )
			if( Typical_Price <= 0.123913 )
				if( Typical_Price <= 0.057398 )
					if( Negative_Money_Flow <= 7585.85 )
						if( Positive_Money_Flow_Sum <= 5.97822e+06 )
							if( Negative_Money_Flow_Sum <= 1.89372e+06 )
								if( Positive_Money_Flow_Sum <= 2.21907e+06 )
									ret := 0.001294
								if( Positive_Money_Flow_Sum > 2.21907e+06 )
									ret := 0.366906
							if( Negative_Money_Flow_Sum > 1.89372e+06 )
								if( Negative_Money_Flow_Sum <= 2.57473e+06 )
									ret := -0.507937
								if( Negative_Money_Flow_Sum > 2.57473e+06 )
									ret := -0.028369
						if( Positive_Money_Flow_Sum > 5.97822e+06 )
							if( Positive_Money_Flow <= 1.07831e+06 )
								if( Positive_Money_Flow_Sum <= 1.65959e+07 )
									ret := 0.356913
								if( Positive_Money_Flow_Sum > 1.65959e+07 )
									ret := -0.421053
							if( Positive_Money_Flow > 1.07831e+06 )
								if( Typical_Price <= 0.046614 )
									ret := 0.272727
								if( Typical_Price > 0.046614 )
									ret := 0.045743
					if( Negative_Money_Flow > 7585.85 )
						if( Positive_Money_Flow_Sum <= 9.77014e+06 )
							if( Positive_Money_Flow_Sum <= 6.80583e+06 )
								if( Negative_Money_Flow_Sum <= 3.73966e+06 )
									ret := 0.166569
								if( Negative_Money_Flow_Sum > 3.73966e+06 )
									ret := 0.001812
							if( Positive_Money_Flow_Sum > 6.80583e+06 )
								if( Negative_Money_Flow <= 3.3587e+06 )
									ret := 0.531835
								if( Negative_Money_Flow > 3.3587e+06 )
									ret := -0.363636
						if( Positive_Money_Flow_Sum > 9.77014e+06 )
							if( Negative_Money_Flow <= 778460 )
								if( Negative_Money_Flow_Sum <= 4.38644e+06 )
									ret := -0.117647
								if( Negative_Money_Flow_Sum > 4.38644e+06 )
									ret := 0.609375
							if( Negative_Money_Flow > 778460 )
								if( Positive_Money_Flow_Sum <= 1.50177e+07 )
									ret := -0.192913
								if( Positive_Money_Flow_Sum > 1.50177e+07 )
									ret := 0.114035
				if( Typical_Price > 0.057398 )
					if( Positive_Money_Flow_Sum <= 3.16836e+06 )
						if( Negative_Money_Flow_Sum <= 1.47001e+07 )
							if( Negative_Money_Flow_Sum <= 1.2252e+07 )
								if( MFI_Low <= -1.54002 )
									ret := -0.192453
								if( MFI_Low > -1.54002 )
									ret := -0.020137
							if( Negative_Money_Flow_Sum > 1.2252e+07 )
								if( Negative_Money_Flow <= 974902 )
									ret := 0.085714
								if( Negative_Money_Flow > 974902 )
									ret := 0.632653
						if( Negative_Money_Flow_Sum > 1.47001e+07 )
							if( Raw_Money_Flow <= 2.1662e+06 )
								if( Positive_Money_Flow_Sum <= 2.56542e+06 )
									ret := -0.117647
								if( Positive_Money_Flow_Sum > 2.56542e+06 )
									ret := -0.538462
							if( Raw_Money_Flow > 2.1662e+06 )
								if( Negative_Money_Flow_Sum <= 1.5691e+07 )
									ret := -0.888889 // sell
								if( Negative_Money_Flow_Sum > 1.5691e+07 )
									ret := 0.309524
					if( Positive_Money_Flow_Sum > 3.16836e+06 )
						if( Raw_Money_Flow <= 4.39407e+07 )
							if( Money_Flow_Ratio <= 1.927 )
								if( Positive_Money_Flow_Sum <= 7.6133e+07 )
									ret := 0.039210
								if( Positive_Money_Flow_Sum > 7.6133e+07 )
									ret := -0.198630
							if( Money_Flow_Ratio > 1.927 )
								if( MFI_Low <= 50.2996 )
									ret := 0.156958
								if( MFI_Low > 50.2996 )
									ret := 0.044912
						if( Raw_Money_Flow > 4.39407e+07 )
							if( MFI_Low <= 50.0242 )
								if( MFI_High <= -33.8029 )
									ret := 0.846154 // buy
								if( MFI_High > -33.8029 )
									ret := -0.333333
							if( MFI_Low > 50.0242 )
								if( Negative_Money_Flow_Sum <= 4.85526e+07 )
									ret := 0.285714
								if( Negative_Money_Flow_Sum > 4.85526e+07 )
									ret := 0.857143 // buy
			if( Typical_Price > 0.123913 )
				if( Negative_Money_Flow_Sum <= 2.49463e+09 )
					if( Raw_Money_Flow <= 1.91274e+07 )
						if( Positive_Money_Flow_Sum <= 2.19973e+08 )
							if( Negative_Money_Flow_Sum <= 6.08469e+07 )
								if( MFI_High <= -34.5913 )
									ret := -0.060589
								if( MFI_High > -34.5913 )
									ret := -0.003878
							if( Negative_Money_Flow_Sum > 6.08469e+07 )
								if( Typical_Price <= 0.33064 )
									ret := 0.074233
								if( Typical_Price > 0.33064 )
									ret := -0.291667
						if( Positive_Money_Flow_Sum > 2.19973e+08 )
							if( MFI_Low <= 54.1105 )
								if( Positive_Money_Flow_Sum <= 4.2871e+08 )
									ret := 0.545455
								if( Positive_Money_Flow_Sum > 4.2871e+08 )
									ret := -1.000000 // sell
							if( MFI_Low > 54.1105 )
								if( Raw_Money_Flow <= 1.50434e+07 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 1.50434e+07 )
									ret := 0.375000
					if( Raw_Money_Flow > 1.91274e+07 )
						if( Negative_Money_Flow_Sum <= 3.17063e+08 )
							if( Negative_Money_Flow_Sum <= 6.85239e+07 )
								if( Negative_Money_Flow_Sum <= 4.76763e+07 )
									ret := -0.212454
								if( Negative_Money_Flow_Sum > 4.76763e+07 )
									ret := 0.341317
							if( Negative_Money_Flow_Sum > 6.85239e+07 )
								if( Negative_Money_Flow_Sum <= 8.17047e+07 )
									ret := -0.634921
								if( Negative_Money_Flow_Sum > 8.17047e+07 )
									ret := -0.187500
						if( Negative_Money_Flow_Sum > 3.17063e+08 )
							if( Typical_Price <= 0.500027 )
								if( Positive_Money_Flow <= 3.28017e+07 )
									ret := -0.186441
								if( Positive_Money_Flow > 3.28017e+07 )
									ret := 0.232117
							if( Typical_Price > 0.500027 )
								if( MFI_Low <= 60.5105 )
									ret := -0.261468
								if( MFI_Low > 60.5105 )
									ret := 0.866667 // buy
				if( Negative_Money_Flow_Sum > 2.49463e+09 )
					if( Positive_Money_Flow_Sum <= 2.78554e+09 )
						if( Money_Flow_Ratio <= 0.367399 )
							ret := 0.500000
						if( Money_Flow_Ratio > 0.367399 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.78554e+09 )
						ret := 0.000000
		if( MFI > 82.2437 )
			if( Money_Flow_Ratio <= 40.7422 )
				if( Negative_Money_Flow_Sum <= 4.05093e+08 )
					if( Positive_Money_Flow_Sum <= 5.82116e+08 )
						if( Positive_Money_Flow <= 7.5869e+07 )
							if( Negative_Money_Flow <= 2.40256e+06 )
								if( Positive_Money_Flow_Sum <= 2.42936e+08 )
									ret := -0.128391
								if( Positive_Money_Flow_Sum > 2.42936e+08 )
									ret := 0.201923
							if( Negative_Money_Flow > 2.40256e+06 )
								if( Positive_Money_Flow_Sum <= 3.86766e+07 )
									ret := -0.272727
								if( Positive_Money_Flow_Sum > 3.86766e+07 )
									ret := 0.625000
						if( Positive_Money_Flow > 7.5869e+07 )
							if( Positive_Money_Flow_Sum <= 5.20844e+08 )
								if( Positive_Money_Flow_Sum <= 1.94507e+08 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 1.94507e+08 )
									ret := -0.865385 // sell
							if( Positive_Money_Flow_Sum > 5.20844e+08 )
								ret := 0.333333
					if( Positive_Money_Flow_Sum > 5.82116e+08 )
						if( Negative_Money_Flow_Sum <= 1.79646e+08 )
							if( Money_Flow_Ratio <= 11.6883 )
								if( Positive_Money_Flow_Sum <= 7.83729e+08 )
									ret := 0.647059
								if( Positive_Money_Flow_Sum > 7.83729e+08 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 11.6883 )
								if( Typical_Price <= 0.209953 )
									ret := -0.750000 // sell
								if( Typical_Price > 0.209953 )
									ret := 0.428571
						if( Negative_Money_Flow_Sum > 1.79646e+08 )
							if( Positive_Money_Flow <= 1.77948e+08 )
								ret := 0.666667
							if( Positive_Money_Flow > 1.77948e+08 )
								if( Typical_Price <= 0.493312 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.493312 )
									ret := 0.500000
				if( Negative_Money_Flow_Sum > 4.05093e+08 )
					if( Money_Flow_Ratio <= 5.28856 )
						ret := -0.800000 // sell
					if( Money_Flow_Ratio > 5.28856 )
						ret := -1.000000 // sell
			if( Money_Flow_Ratio > 40.7422 )
				if( Raw_Money_Flow <= 4.73144e+06 )
					ret := -0.400000
				if( Raw_Money_Flow > 4.73144e+06 )
					ret := -1.000000 // sell
	if( Negative_Money_Flow > 4.00492e+06 )
		if( MFI_High <= -40.8399 )
			if( Negative_Money_Flow_Sum <= 8.13415e+07 )
				if( Positive_Money_Flow_Sum <= 2.44618e+07 )
					if( Positive_Money_Flow_Sum <= 1.52256e+07 )
						if( Typical_Price <= 0.245867 )
							if( Typical_Price <= 0.077172 )
								if( MFI <= 17.8594 )
									ret := 0.000000
								if( MFI > 17.8594 )
									ret := 0.492611
							if( Typical_Price > 0.077172 )
								if( Money_Flow_Ratio <= 0.266853 )
									ret := 0.239919
								if( Money_Flow_Ratio > 0.266853 )
									ret := -0.016043
						if( Typical_Price > 0.245867 )
							if( MFI_High <= -61.0391 )
								if( Positive_Money_Flow_Sum <= 1.25637e+07 )
									ret := -0.625000
								if( Positive_Money_Flow_Sum > 1.25637e+07 )
									ret := -1.000000 // sell
							if( MFI_High > -61.0391 )
								if( Negative_Money_Flow_Sum <= 3.86938e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 3.86938e+07 )
									ret := 0.500000
					if( Positive_Money_Flow_Sum > 1.52256e+07 )
						if( Negative_Money_Flow_Sum <= 4.05415e+07 )
							if( Positive_Money_Flow_Sum <= 1.83535e+07 )
								if( Positive_Money_Flow_Sum <= 1.78405e+07 )
									ret := 0.647541
								if( Positive_Money_Flow_Sum > 1.78405e+07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.83535e+07 )
								if( Negative_Money_Flow_Sum <= 3.83235e+07 )
									ret := 0.201754
								if( Negative_Money_Flow_Sum > 3.83235e+07 )
									ret := 0.717949 // buy
						if( Negative_Money_Flow_Sum > 4.05415e+07 )
							if( Raw_Money_Flow <= 6.38001e+06 )
								if( Positive_Money_Flow_Sum <= 1.61779e+07 )
									ret := 0.562500
								if( Positive_Money_Flow_Sum > 1.61779e+07 )
									ret := -0.111940
							if( Raw_Money_Flow > 6.38001e+06 )
								if( Raw_Money_Flow <= 3.17872e+07 )
									ret := 0.319149
								if( Raw_Money_Flow > 3.17872e+07 )
									ret := -0.714286 // sell
				if( Positive_Money_Flow_Sum > 2.44618e+07 )
					if( Typical_Price <= 0.158563 )
						if( MFI_Low <= 16.7251 )
							if( Positive_Money_Flow_Sum <= 2.66623e+07 )
								if( Raw_Money_Flow <= 1.28459e+07 )
									ret := -0.868421 // sell
								if( Raw_Money_Flow > 1.28459e+07 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.66623e+07 )
								if( Typical_Price <= 0.084805 )
									ret := 0.241379
								if( Typical_Price > 0.084805 )
									ret := -0.382812
						if( MFI_Low > 16.7251 )
							if( Typical_Price <= 0.148954 )
								if( Negative_Money_Flow <= 5.15682e+06 )
									ret := 0.062500
								if( Negative_Money_Flow > 5.15682e+06 )
									ret := 0.627119
							if( Typical_Price > 0.148954 )
								if( Positive_Money_Flow_Sum <= 2.83903e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.83903e+07 )
									ret := -0.230769
					if( Typical_Price > 0.158563 )
						if( MFI_Low <= 5.51067 )
							if( Negative_Money_Flow_Sum <= 7.86538e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 7.86538e+07 )
								ret := 0.500000
						if( MFI_Low > 5.51067 )
							if( Negative_Money_Flow_Sum <= 5.86208e+07 )
								if( MFI_High <= -43.8 )
									ret := -0.369565
								if( MFI_High > -43.8 )
									ret := 0.091954
							if( Negative_Money_Flow_Sum > 5.86208e+07 )
								if( Negative_Money_Flow_Sum <= 6.19564e+07 )
									ret := 0.636364
								if( Negative_Money_Flow_Sum > 6.19564e+07 )
									ret := 0.122699
			if( Negative_Money_Flow_Sum > 8.13415e+07 )
				if( Typical_Price <= 0.309763 )
					if( Negative_Money_Flow_Sum <= 1.40725e+08 )
						if( MFI <= 31.1246 )
							if( Positive_Money_Flow_Sum <= 1.32382e+07 )
								if( Typical_Price <= 0.094462 )
									ret := 0.250000
								if( Typical_Price > 0.094462 )
									ret := 0.895833 // buy
							if( Positive_Money_Flow_Sum > 1.32382e+07 )
								if( Money_Flow_Ratio <= 0.424199 )
									ret := 0.372000
								if( Money_Flow_Ratio > 0.424199 )
									ret := -0.055556
						if( MFI > 31.1246 )
							if( Negative_Money_Flow <= 4.72063e+06 )
								if( Negative_Money_Flow_Sum <= 1.03468e+08 )
									ret := -0.466667
								if( Negative_Money_Flow_Sum > 1.03468e+08 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow > 4.72063e+06 )
								if( Positive_Money_Flow_Sum <= 4.48899e+07 )
									ret := 0.204545
								if( Positive_Money_Flow_Sum > 4.48899e+07 )
									ret := 0.634021
					if( Negative_Money_Flow_Sum > 1.40725e+08 )
						if( Negative_Money_Flow <= 1.3548e+07 )
							if( MFI <= 32.4913 )
								if( Typical_Price <= 0.271616 )
									ret := 0.216749
								if( Typical_Price > 0.271616 )
									ret := -0.333333
							if( MFI > 32.4913 )
								if( Positive_Money_Flow_Sum <= 8.61204e+07 )
									ret := -0.743590 // sell
								if( Positive_Money_Flow_Sum > 8.61204e+07 )
									ret := -0.018182
						if( Negative_Money_Flow > 1.3548e+07 )
							if( Positive_Money_Flow_Sum <= 6.64589e+08 )
								if( MFI_Low <= 13.6939 )
									ret := 0.439469
								if( MFI_Low > 13.6939 )
									ret := 0.160550
							if( Positive_Money_Flow_Sum > 6.64589e+08 )
								if( Typical_Price <= 0.306913 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.306913 )
									ret := 0.500000
				if( Typical_Price > 0.309763 )
					if( Positive_Money_Flow <= 8.1517e+07 )
						if( Positive_Money_Flow_Sum <= 5.89097e+08 )
							if( MFI_Low <= 14.4801 )
								if( Raw_Money_Flow <= 2.84403e+08 )
									ret := -0.014006
								if( Raw_Money_Flow > 2.84403e+08 )
									ret := 1.000000 // buy
							if( MFI_Low > 14.4801 )
								if( Typical_Price <= 0.469912 )
									ret := 0.221374
								if( Typical_Price > 0.469912 )
									ret := 0.818182 // buy
						if( Positive_Money_Flow_Sum > 5.89097e+08 )
							if( Negative_Money_Flow_Sum <= 1.87671e+09 )
								if( MFI <= 38.2858 )
									ret := -1.000000 // sell
								if( MFI > 38.2858 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.87671e+09 )
								if( Negative_Money_Flow_Sum <= 3.1279e+09 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 3.1279e+09 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 8.1517e+07 )
						ret := 1.000000 // buy
		if( MFI_High > -40.8399 )
			if( Negative_Money_Flow <= 9.14438e+07 )
				if( Negative_Money_Flow <= 4.65595e+07 )
					if( Positive_Money_Flow_Sum <= 1.50391e+08 )
						if( Positive_Money_Flow_Sum <= 9.74229e+07 )
							if( Positive_Money_Flow_Sum <= 4.17554e+07 )
								if( Money_Flow_Ratio <= 4.47118 )
									ret := 0.044832
								if( Money_Flow_Ratio > 4.47118 )
									ret := -0.818182 // sell
							if( Positive_Money_Flow_Sum > 4.17554e+07 )
								if( Typical_Price <= 0.243219 )
									ret := 0.195010
								if( Typical_Price > 0.243219 )
									ret := 0.016035
						if( Positive_Money_Flow_Sum > 9.74229e+07 )
							if( Typical_Price <= 0.355047 )
								if( Negative_Money_Flow_Sum <= 8.7923e+07 )
									ret := -0.135447
								if( Negative_Money_Flow_Sum > 8.7923e+07 )
									ret := 0.097378
							if( Typical_Price > 0.355047 )
								if( Negative_Money_Flow <= 1.53492e+07 )
									ret := -0.600000
								if( Negative_Money_Flow > 1.53492e+07 )
									ret := -0.933333 // sell
					if( Positive_Money_Flow_Sum > 1.50391e+08 )
						if( Typical_Price <= 0.270915 )
							if( Negative_Money_Flow_Sum <= 4.24249e+08 )
								if( Positive_Money_Flow_Sum <= 2.83521e+08 )
									ret := 0.350856
								if( Positive_Money_Flow_Sum > 2.83521e+08 )
									ret := 0.120968
							if( Negative_Money_Flow_Sum > 4.24249e+08 )
								if( Typical_Price <= 0.121221 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.121221 )
									ret := 0.166667
						if( Typical_Price > 0.270915 )
							if( Negative_Money_Flow_Sum <= 4.95969e+07 )
								if( Typical_Price <= 0.296481 )
									ret := -0.750000 // sell
								if( Typical_Price > 0.296481 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.95969e+07 )
								if( Typical_Price <= 0.363657 )
									ret := 0.007752
								if( Typical_Price > 0.363657 )
									ret := 0.232727
				if( Negative_Money_Flow > 4.65595e+07 )
					if( Negative_Money_Flow_Sum <= 6.71829e+08 )
						if( Negative_Money_Flow <= 5.75473e+07 )
							if( Positive_Money_Flow_Sum <= 3.39334e+08 )
								if( Negative_Money_Flow_Sum <= 1.24303e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.24303e+08 )
									ret := -0.642857
							if( Positive_Money_Flow_Sum > 3.39334e+08 )
								if( Positive_Money_Flow_Sum <= 3.8385e+08 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 3.8385e+08 )
									ret := 0.028846
						if( Negative_Money_Flow > 5.75473e+07 )
							if( Positive_Money_Flow_Sum <= 3.51714e+08 )
								if( Negative_Money_Flow <= 7.93489e+07 )
									ret := -0.206897
								if( Negative_Money_Flow > 7.93489e+07 )
									ret := 0.541667
							if( Positive_Money_Flow_Sum > 3.51714e+08 )
								if( Negative_Money_Flow_Sum <= 1.69509e+08 )
									ret := -0.882353 // sell
								if( Negative_Money_Flow_Sum > 1.69509e+08 )
									ret := -0.354839
					if( Negative_Money_Flow_Sum > 6.71829e+08 )
						if( MFI_Low <= 28.9363 )
							if( Typical_Price <= 0.313814 )
								if( MFI <= 46.0905 )
									ret := 0.761905 // buy
								if( MFI > 46.0905 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.313814 )
								if( MFI_Low <= 27.4099 )
									ret := -0.580000
								if( MFI_Low > 27.4099 )
									ret := 0.142857
						if( MFI_Low > 28.9363 )
							if( Negative_Money_Flow_Sum <= 8.37802e+08 )
								if( Money_Flow_Ratio <= 1.74027 )
									ret := 0.911111 // buy
								if( Money_Flow_Ratio > 1.74027 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 8.37802e+08 )
								if( Typical_Price <= 0.319034 )
									ret := 0.666667
								if( Typical_Price > 0.319034 )
									ret := -0.166667
			if( Negative_Money_Flow > 9.14438e+07 )
				if( MFI <= 46.6752 )
					if( Money_Flow_Ratio <= 0.700278 )
						if( MFI_High <= -39.703 )
							ret := -0.333333
						if( MFI_High > -39.703 )
							if( Negative_Money_Flow_Sum <= 7.72673e+08 )
								ret := 0.600000
							if( Negative_Money_Flow_Sum > 7.72673e+08 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.700278 )
						if( Negative_Money_Flow <= 2.53282e+08 )
							if( Positive_Money_Flow_Sum <= 1.05039e+09 )
								if( Positive_Money_Flow_Sum <= 5.45312e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 5.45312e+08 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.05039e+09 )
								if( MFI <= 43.8213 )
									ret := 1.000000 // buy
								if( MFI > 43.8213 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow > 2.53282e+08 )
							ret := 1.000000 // buy
				if( MFI > 46.6752 )
					if( Positive_Money_Flow_Sum <= 3.10343e+09 )
						if( Positive_Money_Flow_Sum <= 1.15172e+09 )
							if( Money_Flow_Ratio <= 2.69575 )
								if( MFI_Low <= 35.0483 )
									ret := 0.510204
								if( MFI_Low > 35.0483 )
									ret := 0.834711 // buy
							if( Money_Flow_Ratio > 2.69575 )
								if( Typical_Price <= 0.26437 )
									ret := 0.833333 // buy
								if( Typical_Price > 0.26437 )
									ret := -0.875000 // sell
						if( Positive_Money_Flow_Sum > 1.15172e+09 )
							if( Typical_Price <= 0.424155 )
								if( Negative_Money_Flow_Sum <= 1.74388e+09 )
									ret := -0.208955
								if( Negative_Money_Flow_Sum > 1.74388e+09 )
									ret := 1.000000 // buy
							if( Typical_Price > 0.424155 )
								if( Positive_Money_Flow_Sum <= 2.57222e+09 )
									ret := 0.557377
								if( Positive_Money_Flow_Sum > 2.57222e+09 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.10343e+09 )
						if( Raw_Money_Flow <= 2.18847e+08 )
							if( Negative_Money_Flow_Sum <= 1.55377e+09 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.55377e+09 )
								ret := 0.750000 // buy
						if( Raw_Money_Flow > 2.18847e+08 )
							if( Negative_Money_Flow <= 5.18897e+08 )
								if( Positive_Money_Flow <= 1.46055e+08 )
									ret := -0.928571 // sell
								if( Positive_Money_Flow > 1.46055e+08 )
									ret := 0.000000
							if( Negative_Money_Flow > 5.18897e+08 )
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_8b3e26ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


