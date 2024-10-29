//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: MSFT_5Min_2MM0_4e9d3b55 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2MM0_4e9d3b55", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_4e9d3b55(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 90.1175 )
		if( MFI_Low <= 32.5546 )
			if( Negative_Money_Flow_Sum <= 5.79022e+08 )
				if( Short_Long_Diff <= -0.118249 )
					if( Positive_Money_Flow_Sum <= 2.315e+08 )
						if( Short_Long_Diff <= -0.45936 )
							if( Raw_Money_Flow <= 2.88019e+06 )
								if( Positive_Money_Flow_Sum <= 5.47879e+06 )
									ret := 0.205426
								if( Positive_Money_Flow_Sum > 5.47879e+06 )
									ret := -0.038278
							if( Raw_Money_Flow > 2.88019e+06 )
								if( Typical_Price <= 404.417 )
									ret := 0.465296
								if( Typical_Price > 404.417 )
									ret := 0.143678
						if( Short_Long_Diff > -0.45936 )
							if( Negative_Money_Flow_Sum <= 5.04046e+08 )
								if( Negative_Money_Flow_Sum <= 1.79086e+07 )
									ret := 0.149243
								if( Negative_Money_Flow_Sum > 1.79086e+07 )
									ret := 0.017515
							if( Negative_Money_Flow_Sum > 5.04046e+08 )
								if( Short_MA <= 395.304 )
									ret := 0.634615
								if( Short_MA > 395.304 )
									ret := -0.111111
					if( Positive_Money_Flow_Sum > 2.315e+08 )
						if( Positive_Money_Flow_Sum <= 2.36594e+08 )
							if( Positive_Money_Flow <= 6.60385e+07 )
								if( Long_MA <= 406.36 )
									ret := -0.724138 // sell
								if( Long_MA > 406.36 )
									ret := -0.360000
							if( Positive_Money_Flow > 6.60385e+07 )
								ret := 0.200000
						if( Positive_Money_Flow_Sum > 2.36594e+08 )
							if( Positive_Money_Flow_Sum <= 5.82255e+08 )
								if( Negative_Money_Flow_Sum <= 5.00531e+08 )
									ret := 0.100587
								if( Negative_Money_Flow_Sum > 5.00531e+08 )
									ret := -0.102804
							if( Positive_Money_Flow_Sum > 5.82255e+08 )
								if( Positive_Money_Flow <= 6.52791e+07 )
									ret := 0.250000
								if( Positive_Money_Flow > 6.52791e+07 )
									ret := 0.909091 // buy
				if( Short_Long_Diff > -0.118249 )
					if( Negative_Money_Flow_Sum <= 5.50876e+08 )
						if( MFI <= 50.4603 )
							if( MFI_Low <= 27.9306 )
								if( Money_Flow_Ratio <= 0.920326 )
									ret := 0.020094
								if( Money_Flow_Ratio > 0.920326 )
									ret := 0.750000 // buy
							if( MFI_Low > 27.9306 )
								if( Short_MA <= 422.57 )
									ret := -0.055172
								if( Short_MA > 422.57 )
									ret := -0.348101
						if( MFI > 50.4603 )
							if( MFI_Low <= 30.9231 )
								if( Negative_Money_Flow_Sum <= 3.66335e+08 )
									ret := 0.359712
								if( Negative_Money_Flow_Sum > 3.66335e+08 )
									ret := -0.115385
							if( MFI_Low > 30.9231 )
								if( Short_Long_Diff <= 0.449873 )
									ret := 0.083857
								if( Short_Long_Diff > 0.449873 )
									ret := -0.260000
					if( Negative_Money_Flow_Sum > 5.50876e+08 )
						if( Short_Long_Diff <= 0.120492 )
							if( Typical_Price <= 352.961 )
								if( Negative_Money_Flow_Sum <= 5.74991e+08 )
									ret := 0.111111
								if( Negative_Money_Flow_Sum > 5.74991e+08 )
									ret := -1.000000 // sell
							if( Typical_Price > 352.961 )
								if( Short_Long_Diff <= 0.096687 )
									ret := 0.653846
								if( Short_Long_Diff > 0.096687 )
									ret := -0.200000
						if( Short_Long_Diff > 0.120492 )
							if( Negative_Money_Flow_Sum <= 5.61943e+08 )
								if( Raw_Money_Flow <= 7.27385e+07 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 7.27385e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 5.61943e+08 )
								if( Short_Long_Diff <= 0.22469 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > 0.22469 )
									ret := 0.222222
			if( Negative_Money_Flow_Sum > 5.79022e+08 )
				if( Negative_Money_Flow_Sum <= 6.37314e+08 )
					if( Money_Flow_Ratio <= 0.461735 )
						if( Positive_Money_Flow <= 1.06952e+08 )
							if( Positive_Money_Flow <= 5.09519e+07 )
								if( Typical_Price <= 342.447 )
									ret := 0.300000
								if( Typical_Price > 342.447 )
									ret := -0.450000
							if( Positive_Money_Flow > 5.09519e+07 )
								if( Short_Long_Diff <= -1.01595 )
									ret := -0.300000
								if( Short_Long_Diff > -1.01595 )
									ret := 0.746032 // buy
						if( Positive_Money_Flow > 1.06952e+08 )
							if( Raw_Money_Flow <= 1.34105e+08 )
								if( Short_MA <= 420.491 )
									ret := -0.944444 // sell
								if( Short_MA > 420.491 )
									ret := -0.500000
							if( Raw_Money_Flow > 1.34105e+08 )
								ret := 0.000000
					if( Money_Flow_Ratio > 0.461735 )
						if( Short_Long_Diff <= -0.583301 )
							if( Typical_Price <= 420.004 )
								if( Short_MA <= 326.233 )
									ret := -0.538462
								if( Short_MA > 326.233 )
									ret := -0.880000 // sell
							if( Typical_Price > 420.004 )
								if( Positive_Money_Flow_Sum <= 4.27559e+08 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 4.27559e+08 )
									ret := -0.636364
						if( Short_Long_Diff > -0.583301 )
							if( Positive_Money_Flow <= 6.91995e+07 )
								if( Positive_Money_Flow_Sum <= 4.50215e+08 )
									ret := -0.477273
								if( Positive_Money_Flow_Sum > 4.50215e+08 )
									ret := 0.041667
							if( Positive_Money_Flow > 6.91995e+07 )
								if( Short_Long_Diff <= -0.535806 )
									ret := 0.000000
								if( Short_Long_Diff > -0.535806 )
									ret := -0.560000
				if( Negative_Money_Flow_Sum > 6.37314e+08 )
					if( Short_Long_Diff <= -0.310648 )
						if( MFI_Low <= 16.3194 )
							if( Short_Long_Diff <= -3.93901 )
								if( Positive_Money_Flow_Sum <= 5.44609e+08 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 5.44609e+08 )
									ret := 0.884615 // buy
							if( Short_Long_Diff > -3.93901 )
								if( MFI_High <= -44.9754 )
									ret := -0.031194
								if( MFI_High > -44.9754 )
									ret := 0.309091
						if( MFI_Low > 16.3194 )
							if( MFI_High <= -40.9713 )
								if( Positive_Money_Flow_Sum <= 9.7131e+08 )
									ret := -0.565217
								if( Positive_Money_Flow_Sum > 9.7131e+08 )
									ret := 0.428571
							if( MFI_High > -40.9713 )
								if( Short_Long_Diff <= -1.52739 )
									ret := -0.631579
								if( Short_Long_Diff > -1.52739 )
									ret := 0.016103
					if( Short_Long_Diff > -0.310648 )
						if( Negative_Money_Flow_Sum <= 1.01837e+09 )
							if( Raw_Money_Flow <= 4.77783e+07 )
								if( Negative_Money_Flow_Sum <= 7.07497e+08 )
									ret := -0.392857
								if( Negative_Money_Flow_Sum > 7.07497e+08 )
									ret := 0.096774
							if( Raw_Money_Flow > 4.77783e+07 )
								if( Positive_Money_Flow_Sum <= 3.82468e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.82468e+08 )
									ret := 0.393836
						if( Negative_Money_Flow_Sum > 1.01837e+09 )
							if( Positive_Money_Flow <= 2.06523e+08 )
								if( Raw_Money_Flow <= 1.07983e+08 )
									ret := -0.061807
								if( Raw_Money_Flow > 1.07983e+08 )
									ret := 0.333333
							if( Positive_Money_Flow > 2.06523e+08 )
								if( Long_MA <= 423.544 )
									ret := -0.833333 // sell
								if( Long_MA > 423.544 )
									ret := 0.000000
		if( MFI_Low > 32.5546 )
			if( Negative_Money_Flow_Sum <= 1.28242e+08 )
				if( Raw_Money_Flow <= 1.5216e+06 )
					if( Short_MA <= 342.469 )
						if( Money_Flow_Ratio <= 1.83598 )
							if( Negative_Money_Flow_Sum <= 1.08045e+06 )
								if( Typical_Price <= 327.932 )
									ret := 0.666667
								if( Typical_Price > 327.932 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.08045e+06 )
								if( Positive_Money_Flow_Sum <= 2.07438e+06 )
									ret := -0.350000
								if( Positive_Money_Flow_Sum > 2.07438e+06 )
									ret := 0.051429
						if( Money_Flow_Ratio > 1.83598 )
							if( Positive_Money_Flow <= 1.38858e+06 )
								if( Positive_Money_Flow_Sum <= 1.11568e+07 )
									ret := -0.239490
								if( Positive_Money_Flow_Sum > 1.11568e+07 )
									ret := -0.044944
							if( Positive_Money_Flow > 1.38858e+06 )
								if( Typical_Price <= 333.919 )
									ret := 0.434783
								if( Typical_Price > 333.919 )
									ret := -0.200000
					if( Short_MA > 342.469 )
						if( Positive_Money_Flow_Sum <= 1.92452e+06 )
							if( Positive_Money_Flow_Sum <= 1.6895e+06 )
								if( Raw_Money_Flow <= 412030 )
									ret := -0.064516
								if( Raw_Money_Flow > 412030 )
									ret := 0.454545
							if( Positive_Money_Flow_Sum > 1.6895e+06 )
								if( Raw_Money_Flow <= 164208 )
									ret := 0.117647
								if( Raw_Money_Flow > 164208 )
									ret := 0.745098 // buy
						if( Positive_Money_Flow_Sum > 1.92452e+06 )
							if( Positive_Money_Flow <= 541120 )
								if( Negative_Money_Flow_Sum <= 345403 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 345403 )
									ret := -0.012808
							if( Positive_Money_Flow > 541120 )
								if( Short_MA <= 347.646 )
									ret := 0.385714
								if( Short_MA > 347.646 )
									ret := 0.087358
				if( Raw_Money_Flow > 1.5216e+06 )
					if( Positive_Money_Flow_Sum <= 6.21351e+07 )
						if( Short_MA <= 409.804 )
							if( Negative_Money_Flow_Sum <= 3.25519e+07 )
								if( Negative_Money_Flow_Sum <= 2.4757e+07 )
									ret := -0.142655
								if( Negative_Money_Flow_Sum > 2.4757e+07 )
									ret := 0.368421
							if( Negative_Money_Flow_Sum > 3.25519e+07 )
								if( Raw_Money_Flow <= 8.52899e+06 )
									ret := -0.833333 // sell
								if( Raw_Money_Flow > 8.52899e+06 )
									ret := -0.055556
						if( Short_MA > 409.804 )
							if( Positive_Money_Flow <= 1.04464e+07 )
								if( Short_Long_Diff <= 0.220809 )
									ret := -0.194946
								if( Short_Long_Diff > 0.220809 )
									ret := -0.502203
							if( Positive_Money_Flow > 1.04464e+07 )
								if( Negative_Money_Flow_Sum <= 2.84114e+07 )
									ret := -0.785714 // sell
								if( Negative_Money_Flow_Sum > 2.84114e+07 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 6.21351e+07 )
						if( Positive_Money_Flow_Sum <= 9.5022e+08 )
							if( MFI_Low <= 76.1425 )
								if( Short_MA <= 296.52 )
									ret := 0.888889 // buy
								if( Short_MA > 296.52 )
									ret := -0.056452
							if( MFI_Low > 76.1425 )
								if( Negative_Money_Flow_Sum <= 1.71365e+07 )
									ret := 0.129771
								if( Negative_Money_Flow_Sum > 1.71365e+07 )
									ret := 0.612903
						if( Positive_Money_Flow_Sum > 9.5022e+08 )
							if( Short_Long_Diff <= 0.563644 )
								if( MFI_High <= 11.6661 )
									ret := 0.800000 // buy
								if( MFI_High > 11.6661 )
									ret := -0.195652
							if( Short_Long_Diff > 0.563644 )
								if( Positive_Money_Flow_Sum <= 1.18358e+09 )
									ret := -0.807229 // sell
								if( Positive_Money_Flow_Sum > 1.18358e+09 )
									ret := -0.205128
			if( Negative_Money_Flow_Sum > 1.28242e+08 )
				if( Negative_Money_Flow_Sum <= 3.5042e+08 )
					if( Short_MA <= 324.539 )
						if( Positive_Money_Flow_Sum <= 5.28152e+08 )
							if( Positive_Money_Flow <= 2.95498e+07 )
								if( Positive_Money_Flow <= 2.72151e+07 )
									ret := -0.153846
								if( Positive_Money_Flow > 2.72151e+07 )
									ret := -0.727273 // sell
							if( Positive_Money_Flow > 2.95498e+07 )
								if( MA_Cross <= 91.9786 )
									ret := 0.150327
								if( MA_Cross > 91.9786 )
									ret := -0.393939
						if( Positive_Money_Flow_Sum > 5.28152e+08 )
							if( Money_Flow_Ratio <= 4.33547 )
								if( Negative_Money_Flow_Sum <= 2.88881e+08 )
									ret := -0.135593
								if( Negative_Money_Flow_Sum > 2.88881e+08 )
									ret := -0.545455
							if( Money_Flow_Ratio > 4.33547 )
								if( Short_Long_Diff <= 1.3697 )
									ret := 0.055556
								if( Short_Long_Diff > 1.3697 )
									ret := 0.769231 // buy
					if( Short_MA > 324.539 )
						if( Positive_Money_Flow_Sum <= 2.84336e+08 )
							if( Negative_Money_Flow_Sum <= 2.05867e+08 )
								if( Positive_Money_Flow_Sum <= 2.44801e+08 )
									ret := -0.180451
								if( Positive_Money_Flow_Sum > 2.44801e+08 )
									ret := 0.103825
							if( Negative_Money_Flow_Sum > 2.05867e+08 )
								if( Money_Flow_Ratio <= 1.2022 )
									ret := -0.127273
								if( Money_Flow_Ratio > 1.2022 )
									ret := -0.590909
						if( Positive_Money_Flow_Sum > 2.84336e+08 )
							if( Positive_Money_Flow_Sum <= 4.28405e+08 )
								if( Money_Flow_Ratio <= 1.12755 )
									ret := -0.368421
								if( Money_Flow_Ratio > 1.12755 )
									ret := 0.182620
							if( Positive_Money_Flow_Sum > 4.28405e+08 )
								if( Long_MA <= 330.711 )
									ret := 0.245552
								if( Long_MA > 330.711 )
									ret := 0.039721
				if( Negative_Money_Flow_Sum > 3.5042e+08 )
					if( Short_MA <= 340.197 )
						if( MFI_Low <= 52.8186 )
							if( Short_Long_Diff <= 0.102258 )
								if( Positive_Money_Flow_Sum <= 1.09875e+09 )
									ret := -0.069069
								if( Positive_Money_Flow_Sum > 1.09875e+09 )
									ret := 0.205882
							if( Short_Long_Diff > 0.102258 )
								if( MA_Cross <= 16.2799 )
									ret := 0.205285
								if( MA_Cross > 16.2799 )
									ret := 0.708333 // buy
						if( MFI_Low > 52.8186 )
							if( Short_Long_Diff <= 2.14379 )
								if( Long_MA <= 295.339 )
									ret := -0.900000 // sell
								if( Long_MA > 295.339 )
									ret := -0.133971
							if( Short_Long_Diff > 2.14379 )
								ret := -1.000000 // sell
					if( Short_MA > 340.197 )
						if( Negative_Money_Flow_Sum <= 6.83721e+08 )
							if( Raw_Money_Flow <= 9.5061e+07 )
								if( Money_Flow_Ratio <= 1.69577 )
									ret := -0.237307
								if( Money_Flow_Ratio > 1.69577 )
									ret := -0.039182
							if( Raw_Money_Flow > 9.5061e+07 )
								if( Positive_Money_Flow <= 1.37501e+08 )
									ret := 0.174129
								if( Positive_Money_Flow > 1.37501e+08 )
									ret := -0.155367
						if( Negative_Money_Flow_Sum > 6.83721e+08 )
							if( Positive_Money_Flow_Sum <= 1.46117e+09 )
								if( Raw_Money_Flow <= 4.28262e+08 )
									ret := -0.501961
								if( Raw_Money_Flow > 4.28262e+08 )
									ret := 0.736842 // buy
							if( Positive_Money_Flow_Sum > 1.46117e+09 )
								if( Short_MA <= 372.542 )
									ret := 0.110000
								if( Short_MA > 372.542 )
									ret := -0.176471
	if( Negative_Money_Flow > 90.1175 )
		if( Money_Flow_Ratio <= 0.441965 )
			if( Negative_Money_Flow_Sum <= 5.69579e+08 )
				if( Negative_Money_Flow_Sum <= 3.08091e+06 )
					if( Positive_Money_Flow_Sum <= 727652 )
						if( Short_MA <= 330.107 )
							if( Negative_Money_Flow_Sum <= 2.30865e+06 )
								if( Money_Flow_Ratio <= 0.18831 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.18831 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 2.30865e+06 )
								if( Typical_Price <= 321.748 )
									ret := 0.000000
								if( Typical_Price > 321.748 )
									ret := -0.642857
						if( Short_MA > 330.107 )
							if( Typical_Price <= 408.712 )
								if( Money_Flow_Ratio <= 0.136866 )
									ret := 0.333333
								if( Money_Flow_Ratio > 0.136866 )
									ret := -0.750000 // sell
							if( Typical_Price > 408.712 )
								if( Negative_Money_Flow <= 177181 )
									ret := 0.428571
								if( Negative_Money_Flow > 177181 )
									ret := -0.125000
					if( Positive_Money_Flow_Sum > 727652 )
						if( Raw_Money_Flow <= 141225 )
							if( Raw_Money_Flow <= 89619.8 )
								if( Short_Long_Diff <= -0.194254 )
									ret := 0.600000
								if( Short_Long_Diff > -0.194254 )
									ret := -0.250000
							if( Raw_Money_Flow > 89619.8 )
								if( Negative_Money_Flow_Sum <= 2.82448e+06 )
									ret := -0.222222
								if( Negative_Money_Flow_Sum > 2.82448e+06 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 141225 )
							if( MFI_High <= -51.993 )
								if( Negative_Money_Flow_Sum <= 2.97169e+06 )
									ret := 0.555556
								if( Negative_Money_Flow_Sum > 2.97169e+06 )
									ret := 0.100000
							if( MFI_High > -51.993 )
								if( Long_MA <= 327.093 )
									ret := -0.500000
								if( Long_MA > 327.093 )
									ret := 0.222222
				if( Negative_Money_Flow_Sum > 3.08091e+06 )
					if( Negative_Money_Flow_Sum <= 3.01589e+07 )
						if( Short_Long_Diff <= -0.35148 )
							if( MFI_Low <= 8.64304 )
								if( Positive_Money_Flow_Sum <= 1.11592e+06 )
									ret := 0.614525
								if( Positive_Money_Flow_Sum > 1.11592e+06 )
									ret := 0.403877
							if( MFI_Low > 8.64304 )
								if( Negative_Money_Flow <= 2.97685e+06 )
									ret := 0.153846
								if( Negative_Money_Flow > 2.97685e+06 )
									ret := -0.833333 // sell
						if( Short_Long_Diff > -0.35148 )
							if( Negative_Money_Flow <= 3.93969e+06 )
								if( MFI <= 10.9688 )
									ret := 0.458015
								if( MFI > 10.9688 )
									ret := 0.161710
							if( Negative_Money_Flow > 3.93969e+06 )
								if( Positive_Money_Flow_Sum <= 8.99252e+06 )
									ret := 0.446640
								if( Positive_Money_Flow_Sum > 8.99252e+06 )
									ret := 0.925926 // buy
					if( Negative_Money_Flow_Sum > 3.01589e+07 )
						if( Short_Long_Diff <= -1.43584 )
							if( Short_Long_Diff <= -2.69881 )
								ret := 0.250000
							if( Short_Long_Diff > -2.69881 )
								if( Raw_Money_Flow <= 3.84868e+07 )
									ret := 0.947368 // buy
								if( Raw_Money_Flow > 3.84868e+07 )
									ret := 0.500000
						if( Short_Long_Diff > -1.43584 )
							if( Negative_Money_Flow <= 3.97168e+07 )
								if( Positive_Money_Flow <= 6559.82 )
									ret := 0.025061
								if( Positive_Money_Flow > 6559.82 )
									ret := 0.366516
							if( Negative_Money_Flow > 3.97168e+07 )
								if( Raw_Money_Flow <= 6.28938e+07 )
									ret := 0.432558
								if( Raw_Money_Flow > 6.28938e+07 )
									ret := 0.145205
			if( Negative_Money_Flow_Sum > 5.69579e+08 )
				if( Negative_Money_Flow <= 6.60749e+07 )
					if( MFI <= 19.9898 )
						if( Negative_Money_Flow_Sum <= 1.47797e+09 )
							if( Short_Long_Diff <= -0.588253 )
								if( MFI_High <= -63.6052 )
									ret := 0.234694
								if( MFI_High > -63.6052 )
									ret := 0.630952
							if( Short_Long_Diff > -0.588253 )
								if( Raw_Money_Flow <= 5.19809e+07 )
									ret := 0.112676
								if( Raw_Money_Flow > 5.19809e+07 )
									ret := -0.545455
						if( Negative_Money_Flow_Sum > 1.47797e+09 )
							if( Negative_Money_Flow_Sum <= 3.42208e+09 )
								if( Positive_Money_Flow <= 91600.2 )
									ret := 0.002353
								if( Positive_Money_Flow > 91600.2 )
									ret := -0.481481
							if( Negative_Money_Flow_Sum > 3.42208e+09 )
								if( Positive_Money_Flow <= 907650 )
									ret := 0.076923
								if( Positive_Money_Flow > 907650 )
									ret := 1.000000 // buy
					if( MFI > 19.9898 )
						if( MFI_Low <= 8.23072 )
							if( Short_Long_Diff <= -0.234742 )
								if( Positive_Money_Flow_Sum <= 2.14285e+08 )
									ret := 0.038462
								if( Positive_Money_Flow_Sum > 2.14285e+08 )
									ret := -0.453020
							if( Short_Long_Diff > -0.234742 )
								if( Negative_Money_Flow_Sum <= 6.719e+08 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow_Sum > 6.719e+08 )
									ret := -0.026667
						if( MFI_Low > 8.23072 )
							if( Long_MA <= 328.961 )
								if( Short_Long_Diff <= -0.081988 )
									ret := -0.750000 // sell
								if( Short_Long_Diff > -0.081988 )
									ret := 0.333333
							if( Long_MA > 328.961 )
								if( Raw_Money_Flow <= 6.56682e+07 )
									ret := 0.313043
								if( Raw_Money_Flow > 6.56682e+07 )
									ret := -0.750000 // sell
				if( Negative_Money_Flow > 6.60749e+07 )
					if( Positive_Money_Flow_Sum <= 2.48491e+08 )
						if( Negative_Money_Flow <= 6.03852e+08 )
							if( Negative_Money_Flow_Sum <= 1.60151e+09 )
								if( Short_Long_Diff <= -0.193266 )
									ret := -0.030902
								if( Short_Long_Diff > -0.193266 )
									ret := 0.322835
							if( Negative_Money_Flow_Sum > 1.60151e+09 )
								if( Short_MA <= 361.893 )
									ret := 0.187500
								if( Short_MA > 361.893 )
									ret := 0.777778 // buy
						if( Negative_Money_Flow > 6.03852e+08 )
							if( Positive_Money_Flow_Sum <= 4.15642e+07 )
								if( Negative_Money_Flow_Sum <= 1.32772e+09 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 1.32772e+09 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 4.15642e+07 )
								if( Positive_Money_Flow_Sum <= 1.18355e+08 )
									ret := -0.900000 // sell
								if( Positive_Money_Flow_Sum > 1.18355e+08 )
									ret := -0.312500
					if( Positive_Money_Flow_Sum > 2.48491e+08 )
						if( Positive_Money_Flow_Sum <= 3.09845e+08 )
							if( Negative_Money_Flow_Sum <= 1.19369e+09 )
								if( Short_Long_Diff <= -1.06807 )
									ret := -0.266667
								if( Short_Long_Diff > -1.06807 )
									ret := 0.407547
							if( Negative_Money_Flow_Sum > 1.19369e+09 )
								if( Negative_Money_Flow <= 1.35374e+08 )
									ret := 0.808219 // buy
								if( Negative_Money_Flow > 1.35374e+08 )
									ret := 0.300000
						if( Positive_Money_Flow_Sum > 3.09845e+08 )
							if( Short_Long_Diff <= -1.08633 )
								if( Money_Flow_Ratio <= 0.211705 )
									ret := 0.743243 // buy
								if( Money_Flow_Ratio > 0.211705 )
									ret := 0.149871
							if( Short_Long_Diff > -1.08633 )
								if( Negative_Money_Flow_Sum <= 7.90826e+08 )
									ret := 0.761905 // buy
								if( Negative_Money_Flow_Sum > 7.90826e+08 )
									ret := 0.002128
		if( Money_Flow_Ratio > 0.441965 )
			if( Positive_Money_Flow_Sum <= 3.26845e+09 )
				if( Negative_Money_Flow <= 2.54336e+08 )
					if( Negative_Money_Flow <= 8982.02 )
						if( Long_MA <= 403.42 )
							if( Negative_Money_Flow <= 7396.62 )
								if( MFI <= 53.9484 )
									ret := -0.125000
								if( MFI > 53.9484 )
									ret := 0.538462
							if( Negative_Money_Flow > 7396.62 )
								if( MFI <= 51.3384 )
									ret := 1.000000 // buy
								if( MFI > 51.3384 )
									ret := 0.500000
						if( Long_MA > 403.42 )
							if( Negative_Money_Flow <= 7024.22 )
								if( Short_Long_Diff <= 0.708994 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > 0.708994 )
									ret := 0.600000
							if( Negative_Money_Flow > 7024.22 )
								ret := 0.333333
					if( Negative_Money_Flow > 8982.02 )
						if( Negative_Money_Flow_Sum <= 2.19126e+09 )
							if( Negative_Money_Flow_Sum <= 1.19122e+09 )
								if( Positive_Money_Flow_Sum <= 3.7432e+08 )
									ret := 0.078053
								if( Positive_Money_Flow_Sum > 3.7432e+08 )
									ret := 0.023546
							if( Negative_Money_Flow_Sum > 1.19122e+09 )
								if( Money_Flow_Ratio <= 2.09196 )
									ret := 0.301020
								if( Money_Flow_Ratio > 2.09196 )
									ret := -0.722222 // sell
						if( Negative_Money_Flow_Sum > 2.19126e+09 )
							if( Positive_Money_Flow_Sum <= 1.91607e+09 )
								if( Short_MA <= 416.076 )
									ret := -0.844444 // sell
								if( Short_MA > 416.076 )
									ret := 0.333333
							if( Positive_Money_Flow_Sum > 1.91607e+09 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow > 2.54336e+08 )
					if( Negative_Money_Flow_Sum <= 4.25332e+08 )
						if( Short_MA <= 404.411 )
							ret := 1.000000 // buy
						if( Short_MA > 404.411 )
							ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 4.25332e+08 )
						if( MFI_Low <= 51.7471 )
							if( MFI_Low <= 34.2875 )
								if( Short_Long_Diff <= 0.466026 )
									ret := -0.228426
								if( Short_Long_Diff > 0.466026 )
									ret := 0.291667
							if( MFI_Low > 34.2875 )
								if( Negative_Money_Flow_Sum <= 7.82604e+08 )
									ret := -0.187500
								if( Negative_Money_Flow_Sum > 7.82604e+08 )
									ret := -0.857143 // sell
						if( MFI_Low > 51.7471 )
							if( Short_Long_Diff <= 1.3456 )
								ret := -0.285714
							if( Short_Long_Diff > 1.3456 )
								ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 3.26845e+09 )
				if( Money_Flow_Ratio <= 8.19723 )
					if( Negative_Money_Flow_Sum <= 1.46797e+09 )
						if( Negative_Money_Flow <= 2.53547e+08 )
							if( Negative_Money_Flow <= 2.56191e+06 )
								if( Positive_Money_Flow_Sum <= 3.33499e+09 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 3.33499e+09 )
									ret := 0.428571
							if( Negative_Money_Flow > 2.56191e+06 )
								if( Raw_Money_Flow <= 1.21005e+07 )
									ret := 0.470588
								if( Raw_Money_Flow > 1.21005e+07 )
									ret := 0.921053 // buy
						if( Negative_Money_Flow > 2.53547e+08 )
							ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 1.46797e+09 )
						if( Long_MA <= 320.428 )
							ret := -1.000000 // sell
						if( Long_MA > 320.428 )
							if( Positive_Money_Flow_Sum <= 4.84798e+09 )
								if( Short_Long_Diff <= 0.080826 )
									ret := -0.307692
								if( Short_Long_Diff > 0.080826 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 4.84798e+09 )
								if( Positive_Money_Flow <= 295028 )
									ret := 0.333333
								if( Positive_Money_Flow > 295028 )
									ret := 1.000000 // buy
				if( Money_Flow_Ratio > 8.19723 )
					if( Typical_Price <= 332.523 )
						ret := 1.000000 // buy
					if( Typical_Price > 332.523 )
						if( Negative_Money_Flow_Sum <= 4.01746e+08 )
							if( Raw_Money_Flow <= 1.5806e+08 )
								if( Positive_Money_Flow_Sum <= 6.21152e+09 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 6.21152e+09 )
									ret := -0.285714
							if( Raw_Money_Flow > 1.5806e+08 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 4.01746e+08 )
							if( Positive_Money_Flow_Sum <= 8.82432e+09 )
								ret := -0.833333 // sell
							if( Positive_Money_Flow_Sum > 8.82432e+09 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_4e9d3b55(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


