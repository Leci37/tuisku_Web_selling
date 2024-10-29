//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: SHIBUSDT_30Min_1M00_8854190c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_1M00_8854190c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_8854190c(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( MFI_High <= -52.2356 )
		if( Negative_Money_Flow_Sum <= 1.38171e+07 )
			if( Raw_Money_Flow <= 424731 )
				if( Positive_Money_Flow_Sum <= 2.69328e+06 )
					if( Negative_Money_Flow <= 299076 )
						if( Negative_Money_Flow_Sum <= 1.34534e+07 )
							if( Positive_Money_Flow <= 139590 )
								if( Raw_Money_Flow <= 205824 )
									ret := -0.018127
								if( Raw_Money_Flow > 205824 )
									ret := -0.197309
							if( Positive_Money_Flow > 139590 )
								if( Negative_Money_Flow <= 21869.8 )
									ret := 0.049587
								if( Negative_Money_Flow > 21869.8 )
									ret := 0.636364
						if( Negative_Money_Flow_Sum > 1.34534e+07 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 299076 )
						if( Money_Flow_Ratio <= 0.135922 )
							ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.135922 )
							if( Typical_Price <= 1.1e-05 )
								if( Negative_Money_Flow_Sum <= 5.17598e+06 )
									ret := 0.040650
								if( Negative_Money_Flow_Sum > 5.17598e+06 )
									ret := 0.202703
							if( Typical_Price > 1.1e-05 )
								if( Negative_Money_Flow <= 343507 )
									ret := 0.588235
								if( Negative_Money_Flow > 343507 )
									ret := 0.105263
				if( Positive_Money_Flow_Sum > 2.69328e+06 )
					if( MFI <= 25.9271 )
						if( Positive_Money_Flow_Sum <= 2.90822e+06 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 2.90822e+06 )
							if( Raw_Money_Flow <= 306854 )
								ret := 0.000000
							if( Raw_Money_Flow > 306854 )
								if( Positive_Money_Flow_Sum <= 3.02293e+06 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 3.02293e+06 )
									ret := -0.277778
					if( MFI > 25.9271 )
						if( Raw_Money_Flow <= 367695 )
							ret := -0.333333
						if( Raw_Money_Flow > 367695 )
							if( Raw_Money_Flow <= 416534 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 416534 )
								ret := -0.500000
			if( Raw_Money_Flow > 424731 )
				if( Negative_Money_Flow <= 224966 )
					if( Negative_Money_Flow_Sum <= 1.21542e+07 )
						if( MFI_High <= -56.2919 )
							if( Raw_Money_Flow <= 989003 )
								if( Typical_Price <= 1.8e-05 )
									ret := 0.171779
								if( Typical_Price > 1.8e-05 )
									ret := 0.857143 // buy
							if( Raw_Money_Flow > 989003 )
								if( MFI_High <= -56.8942 )
									ret := -0.545455
								if( MFI_High > -56.8942 )
									ret := 0.500000
						if( MFI_High > -56.2919 )
							if( Positive_Money_Flow <= 591047 )
								if( Positive_Money_Flow_Sum <= 2.69515e+06 )
									ret := -0.090909
								if( Positive_Money_Flow_Sum > 2.69515e+06 )
									ret := -0.595238
							if( Positive_Money_Flow > 591047 )
								if( Typical_Price <= 9e-06 )
									ret := 0.263158
								if( Typical_Price > 9e-06 )
									ret := -0.081967
					if( Negative_Money_Flow_Sum > 1.21542e+07 )
						if( Positive_Money_Flow_Sum <= 2.36122e+06 )
							if( Raw_Money_Flow <= 879799 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 879799 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 2.36122e+06 )
							if( Negative_Money_Flow_Sum <= 1.26919e+07 )
								if( Negative_Money_Flow_Sum <= 1.24037e+07 )
									ret := -0.458333
								if( Negative_Money_Flow_Sum > 1.24037e+07 )
									ret := -0.850000 // sell
							if( Negative_Money_Flow_Sum > 1.26919e+07 )
								if( Typical_Price <= 9e-06 )
									ret := 0.090909
								if( Typical_Price > 9e-06 )
									ret := -0.351351
				if( Negative_Money_Flow > 224966 )
					if( Negative_Money_Flow_Sum <= 7.51749e+06 )
						if( Negative_Money_Flow_Sum <= 5.29569e+06 )
							if( Raw_Money_Flow <= 519877 )
								if( MFI_Low <= 5.28888 )
									ret := -0.119403
								if( MFI_Low > 5.28888 )
									ret := 0.352941
							if( Raw_Money_Flow > 519877 )
								if( Negative_Money_Flow_Sum <= 4.45353e+06 )
									ret := 0.222222
								if( Negative_Money_Flow_Sum > 4.45353e+06 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 5.29569e+06 )
							if( Typical_Price <= 1e-05 )
								if( MFI_High <= -58.7108 )
									ret := 0.284404
								if( MFI_High > -58.7108 )
									ret := 0.645455
							if( Typical_Price > 1e-05 )
								if( Negative_Money_Flow <= 740566 )
									ret := 0.606557
								if( Negative_Money_Flow > 740566 )
									ret := 0.032258
					if( Negative_Money_Flow_Sum > 7.51749e+06 )
						if( MFI <= 19.6802 )
							if( MFI <= 15.0728 )
								if( Typical_Price <= 1.4e-05 )
									ret := 0.132812
								if( Typical_Price > 1.4e-05 )
									ret := -0.678571
							if( MFI > 15.0728 )
								if( Negative_Money_Flow_Sum <= 1.1468e+07 )
									ret := 0.365672
								if( Negative_Money_Flow_Sum > 1.1468e+07 )
									ret := 0.666667
						if( MFI > 19.6802 )
							if( Negative_Money_Flow_Sum <= 8.21001e+06 )
								if( Raw_Money_Flow <= 2.19864e+06 )
									ret := -0.320755
								if( Raw_Money_Flow > 2.19864e+06 )
									ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 8.21001e+06 )
								if( Negative_Money_Flow_Sum <= 1.01523e+07 )
									ret := 0.232323
								if( Negative_Money_Flow_Sum > 1.01523e+07 )
									ret := -0.061162
		if( Negative_Money_Flow_Sum > 1.38171e+07 )
			if( Positive_Money_Flow <= 3.2678e+06 )
				if( Typical_Price <= 3e-05 )
					if( Negative_Money_Flow_Sum <= 7.16973e+07 )
						if( MFI_High <= -72.4077 )
							if( Typical_Price <= 1.4e-05 )
								if( Negative_Money_Flow_Sum <= 1.65946e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.65946e+07 )
									ret := 0.969697 // buy
							if( Typical_Price > 1.4e-05 )
								if( MFI_High <= -75.3806 )
									ret := 0.800000 // buy
								if( MFI_High > -75.3806 )
									ret := -0.200000
						if( MFI_High > -72.4077 )
							if( Positive_Money_Flow_Sum <= 6.57148e+06 )
								if( Typical_Price <= 2.6e-05 )
									ret := 0.200907
								if( Typical_Price > 2.6e-05 )
									ret := -0.846154 // sell
							if( Positive_Money_Flow_Sum > 6.57148e+06 )
								if( Typical_Price <= 1.9e-05 )
									ret := 0.396875
								if( Typical_Price > 1.9e-05 )
									ret := 0.211140
					if( Negative_Money_Flow_Sum > 7.16973e+07 )
						if( Positive_Money_Flow_Sum <= 3.76119e+07 )
							if( Negative_Money_Flow <= 1.54327e+07 )
								if( Negative_Money_Flow_Sum <= 1.22706e+08 )
									ret := 0.600660
								if( Negative_Money_Flow_Sum > 1.22706e+08 )
									ret := -0.388889
							if( Negative_Money_Flow > 1.54327e+07 )
								if( Negative_Money_Flow <= 2.95337e+07 )
									ret := 0.000000
								if( Negative_Money_Flow > 2.95337e+07 )
									ret := 0.730769 // buy
						if( Positive_Money_Flow_Sum > 3.76119e+07 )
							if( Negative_Money_Flow <= 3.91547e+06 )
								ret := -0.500000
							if( Negative_Money_Flow > 3.91547e+06 )
								if( Negative_Money_Flow <= 2.01512e+07 )
									ret := 0.933333 // buy
								if( Negative_Money_Flow > 2.01512e+07 )
									ret := 0.642857
				if( Typical_Price > 3e-05 )
					if( Negative_Money_Flow_Sum <= 2.55786e+08 )
						if( Raw_Money_Flow <= 1.6807e+06 )
							if( Negative_Money_Flow <= 1.49294e+06 )
								ret := -0.500000
							if( Negative_Money_Flow > 1.49294e+06 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.6807e+06 )
							if( Typical_Price <= 3.5e-05 )
								if( Raw_Money_Flow <= 2.5208e+07 )
									ret := 0.016667
								if( Raw_Money_Flow > 2.5208e+07 )
									ret := 0.722222 // buy
							if( Typical_Price > 3.5e-05 )
								if( Money_Flow_Ratio <= 0.158131 )
									ret := 0.470588
								if( Money_Flow_Ratio > 0.158131 )
									ret := -0.284615
					if( Negative_Money_Flow_Sum > 2.55786e+08 )
						if( Raw_Money_Flow <= 7.81435e+07 )
							if( Positive_Money_Flow_Sum <= 7.22406e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 7.22406e+07 )
								if( Positive_Money_Flow_Sum <= 8.65565e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 8.65565e+07 )
									ret := 0.741935 // buy
						if( Raw_Money_Flow > 7.81435e+07 )
							if( Typical_Price <= 4.8e-05 )
								if( Typical_Price <= 3.7e-05 )
									ret := 0.500000
								if( Typical_Price > 3.7e-05 )
									ret := 1.000000 // buy
							if( Typical_Price > 4.8e-05 )
								if( Raw_Money_Flow <= 1.32649e+08 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.32649e+08 )
									ret := -0.833333 // sell
			if( Positive_Money_Flow > 3.2678e+06 )
				if( Positive_Money_Flow <= 6.70916e+06 )
					if( MFI <= 27.3426 )
						if( Money_Flow_Ratio <= 0.108989 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.108989 )
							if( MFI <= 19.7502 )
								if( Typical_Price <= 1.9e-05 )
									ret := -0.870968 // sell
								if( Typical_Price > 1.9e-05 )
									ret := -0.447368
							if( MFI > 19.7502 )
								if( Typical_Price <= 1.2e-05 )
									ret := 0.142857
								if( Typical_Price > 1.2e-05 )
									ret := -0.382114
					if( MFI > 27.3426 )
						if( Positive_Money_Flow <= 5.5434e+06 )
							if( Positive_Money_Flow <= 4.54533e+06 )
								ret := 0.200000
							if( Positive_Money_Flow > 4.54533e+06 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 5.5434e+06 )
							ret := -0.250000
				if( Positive_Money_Flow > 6.70916e+06 )
					if( Money_Flow_Ratio <= 0.257964 )
						if( Positive_Money_Flow_Sum <= 4.027e+07 )
							if( Negative_Money_Flow_Sum <= 1.06459e+08 )
								if( Typical_Price <= 2.5e-05 )
									ret := -0.500000
								if( Typical_Price > 2.5e-05 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.06459e+08 )
								if( Raw_Money_Flow <= 9.80886e+06 )
									ret := -0.600000
								if( Raw_Money_Flow > 9.80886e+06 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.027e+07 )
							ret := 0.750000 // buy
					if( Money_Flow_Ratio > 0.257964 )
						if( Positive_Money_Flow_Sum <= 1.71217e+07 )
							ret := -0.833333 // sell
						if( Positive_Money_Flow_Sum > 1.71217e+07 )
							if( MFI <= 27.3984 )
								if( Positive_Money_Flow_Sum <= 9.21661e+07 )
									ret := 0.705882 // buy
								if( Positive_Money_Flow_Sum > 9.21661e+07 )
									ret := 0.043478
							if( MFI > 27.3984 )
								if( MFI_Low <= 7.57473 )
									ret := -1.000000 // sell
								if( MFI_Low > 7.57473 )
									ret := 0.125000
	if( MFI_High > -52.2356 )
		if( MFI <= 82.8368 )
			if( Positive_Money_Flow_Sum <= 3.2492e+08 )
				if( Typical_Price <= 5e-05 )
					if( Negative_Money_Flow_Sum <= 2.23511e+08 )
						if( Positive_Money_Flow_Sum <= 4.62558e+07 )
							if( MFI_High <= -17.5053 )
								if( Positive_Money_Flow_Sum <= 2.75362e+07 )
									ret := 0.020353
								if( Positive_Money_Flow_Sum > 2.75362e+07 )
									ret := 0.117426
							if( MFI_High > -17.5053 )
								if( Negative_Money_Flow <= 1.97766e+06 )
									ret := 0.079695
								if( Negative_Money_Flow > 1.97766e+06 )
									ret := 0.220755
						if( Positive_Money_Flow_Sum > 4.62558e+07 )
							if( Negative_Money_Flow_Sum <= 1.47174e+08 )
								if( MFI_High <= -33.0759 )
									ret := -0.148148
								if( MFI_High > -33.0759 )
									ret := -0.027451
							if( Negative_Money_Flow_Sum > 1.47174e+08 )
								if( Money_Flow_Ratio <= 0.752709 )
									ret := -0.092500
								if( Money_Flow_Ratio > 0.752709 )
									ret := 0.313953
					if( Negative_Money_Flow_Sum > 2.23511e+08 )
						if( Negative_Money_Flow_Sum <= 4.07323e+08 )
							if( Raw_Money_Flow <= 2.72217e+07 )
								if( MFI_High <= -31.8578 )
									ret := 0.346491
								if( MFI_High > -31.8578 )
									ret := -0.434783
							if( Raw_Money_Flow > 2.72217e+07 )
								if( Money_Flow_Ratio <= 0.943299 )
									ret := 0.415789
								if( Money_Flow_Ratio > 0.943299 )
									ret := 0.847826 // buy
						if( Negative_Money_Flow_Sum > 4.07323e+08 )
							if( MFI_Low <= 16.9615 )
								if( Positive_Money_Flow_Sum <= 2.34691e+08 )
									ret := -0.900000 // sell
								if( Positive_Money_Flow_Sum > 2.34691e+08 )
									ret := 0.487805
							if( MFI_Low > 16.9615 )
								if( Negative_Money_Flow <= 4.67478e+07 )
									ret := -0.710526 // sell
								if( Negative_Money_Flow > 4.67478e+07 )
									ret := 0.000000
				if( Typical_Price > 5e-05 )
					if( Positive_Money_Flow_Sum <= 1.58283e+08 )
						if( Negative_Money_Flow_Sum <= 2.42054e+08 )
							if( MFI_High <= -44.1243 )
								if( Positive_Money_Flow <= 1.50315e+07 )
									ret := -0.272727
								if( Positive_Money_Flow > 1.50315e+07 )
									ret := -0.952381 // sell
							if( MFI_High > -44.1243 )
								if( Positive_Money_Flow_Sum <= 4.82349e+07 )
									ret := 0.733333 // buy
								if( Positive_Money_Flow_Sum > 4.82349e+07 )
									ret := -0.083004
						if( Negative_Money_Flow_Sum > 2.42054e+08 )
							if( Typical_Price <= 5.5e-05 )
								if( Typical_Price <= 5.4e-05 )
									ret := 0.642857
								if( Typical_Price > 5.4e-05 )
									ret := -0.200000
							if( Typical_Price > 5.5e-05 )
								if( Typical_Price <= 6.6e-05 )
									ret := 0.954545 // buy
								if( Typical_Price > 6.6e-05 )
									ret := 0.571429
					if( Positive_Money_Flow_Sum > 1.58283e+08 )
						if( MFI_Low <= 10.999 )
							if( MFI <= 29.1073 )
								ret := 0.000000
							if( MFI > 29.1073 )
								if( Positive_Money_Flow_Sum <= 2.25237e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.25237e+08 )
									ret := 0.500000
						if( MFI_Low > 10.999 )
							if( Positive_Money_Flow_Sum <= 2.86351e+08 )
								if( MFI_High <= -38.9943 )
									ret := -0.298507
								if( MFI_High > -38.9943 )
									ret := -0.609091
							if( Positive_Money_Flow_Sum > 2.86351e+08 )
								if( Negative_Money_Flow <= 3.86378e+07 )
									ret := -0.300000
								if( Negative_Money_Flow > 3.86378e+07 )
									ret := 0.777778 // buy
			if( Positive_Money_Flow_Sum > 3.2492e+08 )
				if( Negative_Money_Flow_Sum <= 1.16557e+08 )
					if( Raw_Money_Flow <= 8.34582e+07 )
						if( MFI <= 76.1186 )
							ret := -0.500000
						if( MFI > 76.1186 )
							if( Typical_Price <= 2.1e-05 )
								ret := -0.750000 // sell
							if( Typical_Price > 2.1e-05 )
								ret := -1.000000 // sell
					if( Raw_Money_Flow > 8.34582e+07 )
						ret := 0.166667
				if( Negative_Money_Flow_Sum > 1.16557e+08 )
					if( Raw_Money_Flow <= 3.05352e+07 )
						if( Typical_Price <= 3.9e-05 )
							if( MFI_Low <= 55.3392 )
								if( Positive_Money_Flow_Sum <= 3.59237e+08 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 3.59237e+08 )
									ret := 0.899160 // buy
							if( MFI_Low > 55.3392 )
								ret := -1.000000 // sell
						if( Typical_Price > 3.9e-05 )
							if( Positive_Money_Flow_Sum <= 4.86055e+08 )
								if( Negative_Money_Flow_Sum <= 2.64295e+08 )
									ret := 0.207547
								if( Negative_Money_Flow_Sum > 2.64295e+08 )
									ret := 0.722222 // buy
							if( Positive_Money_Flow_Sum > 4.86055e+08 )
								if( Positive_Money_Flow <= 6.70787e+06 )
									ret := 0.428571
								if( Positive_Money_Flow > 6.70787e+06 )
									ret := -0.823529 // sell
					if( Raw_Money_Flow > 3.05352e+07 )
						if( Typical_Price <= 7.4e-05 )
							if( Typical_Price <= 3e-05 )
								if( Positive_Money_Flow_Sum <= 1.27482e+09 )
									ret := 0.458746
								if( Positive_Money_Flow_Sum > 1.27482e+09 )
									ret := -0.421053
							if( Typical_Price > 3e-05 )
								if( Positive_Money_Flow_Sum <= 9.841e+08 )
									ret := 0.010283
								if( Positive_Money_Flow_Sum > 9.841e+08 )
									ret := 0.508772
						if( Typical_Price > 7.4e-05 )
							if( Positive_Money_Flow_Sum <= 2.06214e+09 )
								if( MFI_Low <= 19.7735 )
									ret := 0.000000
								if( MFI_Low > 19.7735 )
									ret := -0.950000 // sell
							if( Positive_Money_Flow_Sum > 2.06214e+09 )
								if( Positive_Money_Flow_Sum <= 2.54234e+09 )
									ret := 0.812500 // buy
								if( Positive_Money_Flow_Sum > 2.54234e+09 )
									ret := -1.000000 // sell
		if( MFI > 82.8368 )
			if( Positive_Money_Flow <= 2.33219e+06 )
				if( Positive_Money_Flow_Sum <= 3.27927e+07 )
					if( Positive_Money_Flow_Sum <= 1.51522e+07 )
						if( Money_Flow_Ratio <= 9.96451 )
							if( MFI_High <= 8.12568 )
								if( Typical_Price <= 1.4e-05 )
									ret := 0.082192
								if( Typical_Price > 1.4e-05 )
									ret := -0.343750
							if( MFI_High > 8.12568 )
								if( Positive_Money_Flow_Sum <= 3.78141e+06 )
									ret := -0.043478
								if( Positive_Money_Flow_Sum > 3.78141e+06 )
									ret := 0.385714
						if( Money_Flow_Ratio > 9.96451 )
							if( MFI <= 90.9342 )
								ret := -1.000000 // sell
							if( MFI > 90.9342 )
								if( MFI_Low <= 75.0112 )
									ret := -0.035714
								if( MFI_Low > 75.0112 )
									ret := -0.571429
					if( Positive_Money_Flow_Sum > 1.51522e+07 )
						if( Positive_Money_Flow_Sum <= 1.59284e+07 )
							if( Positive_Money_Flow <= 532142 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 532142 )
								ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.59284e+07 )
							if( Negative_Money_Flow <= 2.34889e+06 )
								if( Raw_Money_Flow <= 1.57621e+06 )
									ret := -0.030303
								if( Raw_Money_Flow > 1.57621e+06 )
									ret := -0.480000
							if( Negative_Money_Flow > 2.34889e+06 )
								ret := 0.800000 // buy
				if( Positive_Money_Flow_Sum > 3.27927e+07 )
					if( Positive_Money_Flow_Sum <= 4.22727e+07 )
						if( Negative_Money_Flow_Sum <= 4.60726e+06 )
							ret := -0.200000
						if( Negative_Money_Flow_Sum > 4.60726e+06 )
							if( MFI_High <= 3.71705 )
								ret := -0.250000
							if( MFI_High > 3.71705 )
								if( Negative_Money_Flow <= 2.41401e+06 )
									ret := 0.892857 // buy
								if( Negative_Money_Flow > 2.41401e+06 )
									ret := 0.500000
					if( Positive_Money_Flow_Sum > 4.22727e+07 )
						if( Raw_Money_Flow <= 2.89347e+06 )
							if( Raw_Money_Flow <= 2.14014e+06 )
								ret := 0.000000
							if( Raw_Money_Flow > 2.14014e+06 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.89347e+06 )
							if( Typical_Price <= 3e-05 )
								if( MFI_Low <= 64.076 )
									ret := -0.142857
								if( MFI_Low > 64.076 )
									ret := 0.540541
							if( Typical_Price > 3e-05 )
								if( Positive_Money_Flow_Sum <= 7.60574e+08 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 7.60574e+08 )
									ret := 0.500000
			if( Positive_Money_Flow > 2.33219e+06 )
				if( Positive_Money_Flow_Sum <= 3.47963e+07 )
					if( Negative_Money_Flow_Sum <= 820007 )
						if( Positive_Money_Flow <= 2.7192e+06 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow > 2.7192e+06 )
							if( Raw_Money_Flow <= 4.35915e+06 )
								if( MFI_Low <= 75.2907 )
									ret := 1.000000 // buy
								if( MFI_Low > 75.2907 )
									ret := 0.500000
							if( Raw_Money_Flow > 4.35915e+06 )
								ret := -0.285714
					if( Negative_Money_Flow_Sum > 820007 )
						if( MFI_Low <= 69.1599 )
							if( Positive_Money_Flow <= 1.03678e+07 )
								if( Positive_Money_Flow_Sum <= 2.69687e+07 )
									ret := -0.296552
								if( Positive_Money_Flow_Sum > 2.69687e+07 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow > 1.03678e+07 )
								if( Negative_Money_Flow_Sum <= 5.32029e+06 )
									ret := -0.066667
								if( Negative_Money_Flow_Sum > 5.32029e+06 )
									ret := 1.000000 // buy
						if( MFI_Low > 69.1599 )
							if( Raw_Money_Flow <= 4.49391e+06 )
								if( Negative_Money_Flow_Sum <= 1.39527e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.39527e+06 )
									ret := -0.227273
							if( Raw_Money_Flow > 4.49391e+06 )
								if( Typical_Price <= 1.7e-05 )
									ret := -0.886792 // sell
								if( Typical_Price > 1.7e-05 )
									ret := -0.400000
				if( Positive_Money_Flow_Sum > 3.47963e+07 )
					if( Positive_Money_Flow_Sum <= 4.19893e+07 )
						if( Negative_Money_Flow_Sum <= 7.26963e+06 )
							if( Money_Flow_Ratio <= 7.70236 )
								if( Positive_Money_Flow_Sum <= 3.9907e+07 )
									ret := 0.695652
								if( Positive_Money_Flow_Sum > 3.9907e+07 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 7.70236 )
								if( Typical_Price <= 1.2e-05 )
									ret := -0.833333 // sell
								if( Typical_Price > 1.2e-05 )
									ret := 0.714286 // buy
						if( Negative_Money_Flow_Sum > 7.26963e+06 )
							if( Typical_Price <= 2.4e-05 )
								ret := 0.000000
							if( Typical_Price > 2.4e-05 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 4.19893e+07 )
						if( Raw_Money_Flow <= 6.67517e+06 )
							if( Typical_Price <= 3.1e-05 )
								if( MFI_Low <= 70.7767 )
									ret := -0.821429 // sell
								if( MFI_Low > 70.7767 )
									ret := -0.333333
							if( Typical_Price > 3.1e-05 )
								ret := 0.142857
						if( Raw_Money_Flow > 6.67517e+06 )
							if( Typical_Price <= 2.5e-05 )
								if( Negative_Money_Flow_Sum <= 2.43626e+07 )
									ret := -0.136364
								if( Negative_Money_Flow_Sum > 2.43626e+07 )
									ret := 0.508772
							if( Typical_Price > 2.5e-05 )
								if( MFI_High <= 5.61255 )
									ret := -0.138462
								if( MFI_High > 5.61255 )
									ret := -0.653543
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_8854190c(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


