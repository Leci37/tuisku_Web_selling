//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: U_1Min_2MM0_0d363464 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2MM0_0d363464", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_0d363464(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow <= 1484.26 )
		if( Negative_Money_Flow_Sum <= 343952 )
			if( Negative_Money_Flow <= 20.225 )
				if( Long_MA <= 17.8119 )
					if( Positive_Money_Flow_Sum <= 42024.7 )
						if( Short_Long_Diff <= 0.029101 )
							if( Negative_Money_Flow_Sum <= 192400 )
								if( Negative_Money_Flow_Sum <= 49534 )
									ret := -0.067797
								if( Negative_Money_Flow_Sum > 49534 )
									ret := 0.234450
							if( Negative_Money_Flow_Sum > 192400 )
								if( Raw_Money_Flow <= 2461.06 )
									ret := 0.625000
								if( Raw_Money_Flow > 2461.06 )
									ret := -0.472222
						if( Short_Long_Diff > 0.029101 )
							if( Raw_Money_Flow <= 3753.76 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 3753.76 )
								ret := 0.250000
					if( Positive_Money_Flow_Sum > 42024.7 )
						if( MFI <= 74.0331 )
							if( Short_MA <= 17.6893 )
								if( Raw_Money_Flow <= 1483.5 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1483.5 )
									ret := -0.150424
							if( Short_MA > 17.6893 )
								if( Short_MA <= 17.7351 )
									ret := -1.000000 // sell
								if( Short_MA > 17.7351 )
									ret := -0.750000 // sell
						if( MFI > 74.0331 )
							if( Short_Long_Diff <= 0.001508 )
								if( MFI_Low <= 59.3398 )
									ret := 0.851852 // buy
								if( MFI_Low > 59.3398 )
									ret := 0.230769
							if( Short_Long_Diff > 0.001508 )
								if( MFI_Low <= 68.152 )
									ret := 0.028571
								if( MFI_Low > 68.152 )
									ret := -0.408163
				if( Long_MA > 17.8119 )
					if( Positive_Money_Flow_Sum <= 40186.7 )
						if( Positive_Money_Flow <= 778.25 )
							if( Raw_Money_Flow <= 13730.9 )
								if( Long_MA <= 20.2422 )
									ret := 0.464286
								if( Long_MA > 20.2422 )
									ret := 0.159420
							if( Raw_Money_Flow > 13730.9 )
								if( Negative_Money_Flow_Sum <= 63424.5 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 63424.5 )
									ret := -0.142857
						if( Positive_Money_Flow > 778.25 )
							if( Positive_Money_Flow <= 1255.98 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1255.98 )
								ret := 0.500000
					if( Positive_Money_Flow_Sum > 40186.7 )
						if( Positive_Money_Flow <= 1339.96 )
							if( Short_MA <= 17.8628 )
								ret := 0.800000 // buy
							if( Short_MA > 17.8628 )
								if( Typical_Price <= 19.1098 )
									ret := -0.091954
								if( Typical_Price > 19.1098 )
									ret := 0.061254
						if( Positive_Money_Flow > 1339.96 )
							if( Short_MA <= 21.2341 )
								ret := 1.000000 // buy
							if( Short_MA > 21.2341 )
								ret := 0.500000
			if( Negative_Money_Flow > 20.225 )
				if( MFI_High <= -63.6605 )
					if( Raw_Money_Flow <= 17192.1 )
						if( Positive_Money_Flow_Sum <= 24267.4 )
							if( Short_Long_Diff <= 0.007254 )
								if( MFI_High <= -67.0312 )
									ret := 0.646259
								if( MFI_High > -67.0312 )
									ret := 0.939394 // buy
							if( Short_Long_Diff > 0.007254 )
								if( Positive_Money_Flow_Sum <= 16226.2 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 16226.2 )
									ret := 0.600000
						if( Positive_Money_Flow_Sum > 24267.4 )
							if( Short_MA <= 17.7742 )
								if( Long_MA <= 16.0734 )
									ret := 0.552632
								if( Long_MA > 16.0734 )
									ret := 0.046512
							if( Short_MA > 17.7742 )
								if( MFI_Low <= -5.05139 )
									ret := 0.837838 // buy
								if( MFI_Low > -5.05139 )
									ret := 0.464286
					if( Raw_Money_Flow > 17192.1 )
						if( Short_MA <= 23.98 )
							if( Short_Long_Diff <= 0.001524 )
								if( Negative_Money_Flow <= 128128 )
									ret := 0.299363
								if( Negative_Money_Flow > 128128 )
									ret := -0.153846
							if( Short_Long_Diff > 0.001524 )
								if( Money_Flow_Ratio <= 0.095178 )
									ret := -0.142857
								if( Money_Flow_Ratio > 0.095178 )
									ret := 0.750000 // buy
						if( Short_MA > 23.98 )
							ret := -1.000000 // sell
				if( MFI_High > -63.6605 )
					if( Positive_Money_Flow <= 120.427 )
						if( Positive_Money_Flow_Sum <= 323936 )
							if( MA_Cross <= 15.6948 )
								if( Positive_Money_Flow_Sum <= 204311 )
									ret := 0.235811
								if( Positive_Money_Flow_Sum > 204311 )
									ret := 0.382812
							if( MA_Cross > 15.6948 )
								if( Negative_Money_Flow_Sum <= 158050 )
									ret := -0.139535
								if( Negative_Money_Flow_Sum > 158050 )
									ret := 0.500000
						if( Positive_Money_Flow_Sum > 323936 )
							if( Negative_Money_Flow <= 4429.83 )
								if( Long_MA <= 15.5195 )
									ret := -0.272727
								if( Long_MA > 15.5195 )
									ret := 0.459459
							if( Negative_Money_Flow > 4429.83 )
								if( Short_Long_Diff <= 0.106064 )
									ret := 0.042350
								if( Short_Long_Diff > 0.106064 )
									ret := 0.687500
					if( Positive_Money_Flow > 120.427 )
						if( MFI_Low <= 57.5521 )
							if( Positive_Money_Flow_Sum <= 422682 )
								if( Negative_Money_Flow_Sum <= 28071.9 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow_Sum > 28071.9 )
									ret := -0.020243
							if( Positive_Money_Flow_Sum > 422682 )
								ret := -1.000000 // sell
						if( MFI_Low > 57.5521 )
							if( Positive_Money_Flow_Sum <= 335224 )
								if( Typical_Price <= 18.6703 )
									ret := 1.000000 // buy
								if( Typical_Price > 18.6703 )
									ret := 0.400000
							if( Positive_Money_Flow_Sum > 335224 )
								if( Negative_Money_Flow <= 10586.5 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 10586.5 )
									ret := 0.666667
		if( Negative_Money_Flow_Sum > 343952 )
			if( Negative_Money_Flow_Sum <= 8.0458e+06 )
				if( Positive_Money_Flow_Sum <= 1.68216e+07 )
					if( Raw_Money_Flow <= 10515.2 )
						if( Negative_Money_Flow_Sum <= 363889 )
							if( Long_MA <= 18.286 )
								if( Raw_Money_Flow <= 1689.38 )
									ret := -0.250000
								if( Raw_Money_Flow > 1689.38 )
									ret := -0.833333 // sell
							if( Long_MA > 18.286 )
								if( Negative_Money_Flow_Sum <= 354416 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 354416 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 363889 )
							if( Positive_Money_Flow_Sum <= 73887.4 )
								if( Negative_Money_Flow_Sum <= 1.49206e+06 )
									ret := 0.682692
								if( Negative_Money_Flow_Sum > 1.49206e+06 )
									ret := -0.125000
							if( Positive_Money_Flow_Sum > 73887.4 )
								if( Negative_Money_Flow_Sum <= 486273 )
									ret := 0.443038
								if( Negative_Money_Flow_Sum > 486273 )
									ret := 0.129252
					if( Raw_Money_Flow > 10515.2 )
						if( Negative_Money_Flow <= 277193 )
							if( Short_MA <= 17.2747 )
								if( Positive_Money_Flow_Sum <= 114534 )
									ret := 0.363636
								if( Positive_Money_Flow_Sum > 114534 )
									ret := -0.030707
							if( Short_MA > 17.2747 )
								if( Positive_Money_Flow_Sum <= 79019.5 )
									ret := 0.362205
								if( Positive_Money_Flow_Sum > 79019.5 )
									ret := 0.026027
						if( Negative_Money_Flow > 277193 )
							if( MFI_High <= -27.2085 )
								if( Positive_Money_Flow_Sum <= 4.89717e+06 )
									ret := 0.039161
								if( Positive_Money_Flow_Sum > 4.89717e+06 )
									ret := -0.199422
							if( MFI_High > -27.2085 )
								if( Long_MA <= 22.8727 )
									ret := 0.138725
								if( Long_MA > 22.8727 )
									ret := -0.107407
				if( Positive_Money_Flow_Sum > 1.68216e+07 )
					if( Negative_Money_Flow <= 24660.7 )
						if( Raw_Money_Flow <= 3090.2 )
							if( Negative_Money_Flow_Sum <= 1.77752e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.77752e+06 )
								if( Short_Long_Diff <= 0.015748 )
									ret := 0.666667
								if( Short_Long_Diff > 0.015748 )
									ret := 0.000000
						if( Raw_Money_Flow > 3090.2 )
							if( Negative_Money_Flow_Sum <= 3.06804e+06 )
								if( Negative_Money_Flow_Sum <= 2.51079e+06 )
									ret := 0.142857
								if( Negative_Money_Flow_Sum > 2.51079e+06 )
									ret := -0.571429
							if( Negative_Money_Flow_Sum > 3.06804e+06 )
								if( Short_Long_Diff <= 0.005791 )
									ret := 0.444444
								if( Short_Long_Diff > 0.005791 )
									ret := 0.178571
					if( Negative_Money_Flow > 24660.7 )
						if( Typical_Price <= 22.4883 )
							if( MFI_Low <= 57.3403 )
								if( Positive_Money_Flow_Sum <= 2.00981e+07 )
									ret := 0.692308
								if( Positive_Money_Flow_Sum > 2.00981e+07 )
									ret := -0.500000
							if( MFI_Low > 57.3403 )
								if( MFI_High <= 9.26914 )
									ret := 0.641975
								if( MFI_High > 9.26914 )
									ret := 0.923077 // buy
						if( Typical_Price > 22.4883 )
							if( Money_Flow_Ratio <= 3.1154 )
								ret := 0.600000
							if( Money_Flow_Ratio > 3.1154 )
								if( Typical_Price <= 23.029 )
									ret := -0.666667
								if( Typical_Price > 23.029 )
									ret := 0.250000
			if( Negative_Money_Flow_Sum > 8.0458e+06 )
				if( Long_MA <= 22.1194 )
					if( Negative_Money_Flow <= 8.40495e+06 )
						if( Short_Long_Diff <= -0.072375 )
							if( MFI_Low <= -8.98747 )
								if( Positive_Money_Flow_Sum <= 80914.1 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 80914.1 )
									ret := 0.699187
							if( MFI_Low > -8.98747 )
								if( MFI_Low <= -7.38208 )
									ret := -0.380952
								if( MFI_Low > -7.38208 )
									ret := 0.334197
						if( Short_Long_Diff > -0.072375 )
							if( Negative_Money_Flow_Sum <= 1.45063e+07 )
								if( Positive_Money_Flow_Sum <= 4.53548e+06 )
									ret := 0.055556
								if( Positive_Money_Flow_Sum > 4.53548e+06 )
									ret := 0.336195
							if( Negative_Money_Flow_Sum > 1.45063e+07 )
								if( MFI <= 23.105 )
									ret := 0.178010
								if( MFI > 23.105 )
									ret := -0.119741
					if( Negative_Money_Flow > 8.40495e+06 )
						if( Negative_Money_Flow_Sum <= 1.31624e+07 )
							if( Negative_Money_Flow_Sum <= 1.10197e+07 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.10197e+07 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.31624e+07 )
							if( Short_Long_Diff <= 0.012626 )
								if( Short_MA <= 20.8927 )
									ret := 0.924528 // buy
								if( Short_MA > 20.8927 )
									ret := 0.285714
							if( Short_Long_Diff > 0.012626 )
								if( Positive_Money_Flow_Sum <= 6.45379e+06 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 6.45379e+06 )
									ret := 0.222222
				if( Long_MA > 22.1194 )
					if( Positive_Money_Flow_Sum <= 3.37388e+07 )
						if( Negative_Money_Flow_Sum <= 1.20274e+07 )
							if( Typical_Price <= 22.1118 )
								if( Typical_Price <= 22.0372 )
									ret := -0.333333
								if( Typical_Price > 22.0372 )
									ret := -1.000000 // sell
							if( Typical_Price > 22.1118 )
								if( Negative_Money_Flow <= 1.60779e+06 )
									ret := 0.288136
								if( Negative_Money_Flow > 1.60779e+06 )
									ret := -0.072464
						if( Negative_Money_Flow_Sum > 1.20274e+07 )
							if( Short_Long_Diff <= 0.01373 )
								if( Negative_Money_Flow <= 2.15256e+06 )
									ret := -0.267442
								if( Negative_Money_Flow > 2.15256e+06 )
									ret := 0.176471
							if( Short_Long_Diff > 0.01373 )
								if( Negative_Money_Flow_Sum <= 1.29935e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.29935e+07 )
									ret := -0.777778 // sell
					if( Positive_Money_Flow_Sum > 3.37388e+07 )
						if( Positive_Money_Flow_Sum <= 4.03211e+07 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.03211e+07 )
							ret := 0.333333
	if( Positive_Money_Flow > 1484.26 )
		if( Negative_Money_Flow_Sum <= 234276 )
			if( Negative_Money_Flow <= 182.651 )
				if( MA_Cross <= 0.029753 )
					if( Short_Long_Diff <= -0.035406 )
						if( Raw_Money_Flow <= 11397.4 )
							if( Negative_Money_Flow_Sum <= 159724 )
								if( Negative_Money_Flow_Sum <= 148252 )
									ret := 0.308219
								if( Negative_Money_Flow_Sum > 148252 )
									ret := 0.913043 // buy
							if( Negative_Money_Flow_Sum > 159724 )
								if( Money_Flow_Ratio <= 0.122405 )
									ret := 0.833333 // buy
								if( Money_Flow_Ratio > 0.122405 )
									ret := -0.163934
						if( Raw_Money_Flow > 11397.4 )
							if( Raw_Money_Flow <= 96479.3 )
								if( Positive_Money_Flow_Sum <= 188202 )
									ret := 0.014925
								if( Positive_Money_Flow_Sum > 188202 )
									ret := -0.666667
							if( Raw_Money_Flow > 96479.3 )
								if( Positive_Money_Flow_Sum <= 242964 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 242964 )
									ret := 0.210526
					if( Short_Long_Diff > -0.035406 )
						if( Positive_Money_Flow_Sum <= 49854.5 )
							if( Short_MA <= 16.555 )
								if( Short_Long_Diff <= 0.019284 )
									ret := -0.126214
								if( Short_Long_Diff > 0.019284 )
									ret := -0.592593
							if( Short_MA > 16.555 )
								if( Negative_Money_Flow_Sum <= 218386 )
									ret := 0.102521
								if( Negative_Money_Flow_Sum > 218386 )
									ret := -0.933333 // sell
						if( Positive_Money_Flow_Sum > 49854.5 )
							if( Positive_Money_Flow <= 29801.3 )
								if( MFI_High <= -54.8718 )
									ret := 0.176471
								if( MFI_High > -54.8718 )
									ret := -0.254897
							if( Positive_Money_Flow > 29801.3 )
								if( Positive_Money_Flow <= 2.50593e+06 )
									ret := -0.096970
								if( Positive_Money_Flow > 2.50593e+06 )
									ret := -0.666667
				if( MA_Cross > 0.029753 )
					if( Positive_Money_Flow_Sum <= 847741 )
						if( Negative_Money_Flow_Sum <= 85697.9 )
							if( Raw_Money_Flow <= 271465 )
								if( Raw_Money_Flow <= 71992.5 )
									ret := -0.179825
								if( Raw_Money_Flow > 71992.5 )
									ret := -0.864865 // sell
							if( Raw_Money_Flow > 271465 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 85697.9 )
							if( MFI_High <= -15.0238 )
								if( Positive_Money_Flow_Sum <= 41829.8 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 41829.8 )
									ret := -0.770492 // sell
							if( MFI_High > -15.0238 )
								if( MFI <= 71.6134 )
									ret := 0.727273 // buy
								if( MFI > 71.6134 )
									ret := -0.586207
					if( Positive_Money_Flow_Sum > 847741 )
						if( Raw_Money_Flow <= 2.66265e+06 )
							if( Raw_Money_Flow <= 352406 )
								if( Short_MA <= 23.2783 )
									ret := 0.000000
								if( Short_MA > 23.2783 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 352406 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 2.66265e+06 )
							if( Typical_Price <= 21.736 )
								ret := -0.750000 // sell
							if( Typical_Price > 21.736 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 182.651 )
				if( MFI_Low <= 75.9464 )
					if( Raw_Money_Flow <= 56984.1 )
						if( Positive_Money_Flow <= 4160.24 )
							if( Positive_Money_Flow <= 3150.7 )
								if( Negative_Money_Flow_Sum <= 104502 )
									ret := 0.298507
								if( Negative_Money_Flow_Sum > 104502 )
									ret := -0.196078
							if( Positive_Money_Flow > 3150.7 )
								if( Short_Long_Diff <= -0.035523 )
									ret := 0.555556
								if( Short_Long_Diff > -0.035523 )
									ret := -0.447368
						if( Positive_Money_Flow > 4160.24 )
							if( MA_Cross <= 13.6423 )
								if( Short_Long_Diff <= 0.011847 )
									ret := 0.513043
								if( Short_Long_Diff > 0.011847 )
									ret := 0.089109
							if( MA_Cross > 13.6423 )
								ret := -1.000000 // sell
					if( Raw_Money_Flow > 56984.1 )
						ret := -1.000000 // sell
				if( MFI_Low > 75.9464 )
					if( Positive_Money_Flow_Sum <= 1.93954e+06 )
						ret := 0.500000
					if( Positive_Money_Flow_Sum > 1.93954e+06 )
						ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 234276 )
			if( Short_Long_Diff <= 0.013103 )
				if( Positive_Money_Flow_Sum <= 4.38167e+06 )
					if( Negative_Money_Flow_Sum <= 2.56414e+06 )
						if( Short_MA <= 17.2047 )
							if( Short_Long_Diff <= -0.05986 )
								if( Negative_Money_Flow_Sum <= 519342 )
									ret := -0.382353
								if( Negative_Money_Flow_Sum > 519342 )
									ret := 0.648649
							if( Short_Long_Diff > -0.05986 )
								if( Negative_Money_Flow_Sum <= 2.001e+06 )
									ret := 0.074880
								if( Negative_Money_Flow_Sum > 2.001e+06 )
									ret := -0.043571
						if( Short_MA > 17.2047 )
							if( Short_Long_Diff <= -0.017769 )
								if( Raw_Money_Flow <= 1.0397e+06 )
									ret := 0.081830
								if( Raw_Money_Flow > 1.0397e+06 )
									ret := -0.695652
							if( Short_Long_Diff > -0.017769 )
								if( Negative_Money_Flow_Sum <= 2.3505e+06 )
									ret := -0.049904
								if( Negative_Money_Flow_Sum > 2.3505e+06 )
									ret := 0.264317
					if( Negative_Money_Flow_Sum > 2.56414e+06 )
						if( Negative_Money_Flow_Sum <= 2.88157e+06 )
							if( Raw_Money_Flow <= 387708 )
								if( MFI_High <= -27.9786 )
									ret := -0.287478
								if( MFI_High > -27.9786 )
									ret := -0.635294
							if( Raw_Money_Flow > 387708 )
								if( Typical_Price <= 23.0628 )
									ret := 0.009174
								if( Typical_Price > 23.0628 )
									ret := 0.708333 // buy
						if( Negative_Money_Flow_Sum > 2.88157e+06 )
							if( Positive_Money_Flow_Sum <= 2.13714e+06 )
								if( Negative_Money_Flow_Sum <= 7.83903e+06 )
									ret := 0.026225
								if( Negative_Money_Flow_Sum > 7.83903e+06 )
									ret := 0.290780
							if( Positive_Money_Flow_Sum > 2.13714e+06 )
								if( Positive_Money_Flow <= 634016 )
									ret := -0.119334
								if( Positive_Money_Flow > 634016 )
									ret := 0.071918
				if( Positive_Money_Flow_Sum > 4.38167e+06 )
					if( Raw_Money_Flow <= 4.98264e+06 )
						if( Long_MA <= 20.5158 )
							if( Raw_Money_Flow <= 2.61058e+06 )
								if( Short_Long_Diff <= 0.000267 )
									ret := 0.241021
								if( Short_Long_Diff > 0.000267 )
									ret := -0.007335
							if( Raw_Money_Flow > 2.61058e+06 )
								if( Positive_Money_Flow_Sum <= 5.70845e+06 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 5.70845e+06 )
									ret := 0.654206
						if( Long_MA > 20.5158 )
							if( Short_Long_Diff <= -0.135844 )
								if( MFI_Low <= 4.4108 )
									ret := -0.100000
								if( MFI_Low > 4.4108 )
									ret := -0.666667
							if( Short_Long_Diff > -0.135844 )
								if( Money_Flow_Ratio <= 1.833 )
									ret := 0.093656
								if( Money_Flow_Ratio > 1.833 )
									ret := -0.129032
					if( Raw_Money_Flow > 4.98264e+06 )
						if( Short_MA <= 19.2483 )
							if( Raw_Money_Flow <= 1.34099e+07 )
								if( Raw_Money_Flow <= 9.57936e+06 )
									ret := -0.725000 // sell
								if( Raw_Money_Flow > 9.57936e+06 )
									ret := 0.272727
							if( Raw_Money_Flow > 1.34099e+07 )
								if( Long_MA <= 16.7652 )
									ret := -0.500000
								if( Long_MA > 16.7652 )
									ret := -1.000000 // sell
						if( Short_MA > 19.2483 )
							if( Short_Long_Diff <= -0.266818 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.266818 )
								if( Typical_Price <= 22.9717 )
									ret := 0.366667
								if( Typical_Price > 22.9717 )
									ret := -0.571429
			if( Short_Long_Diff > 0.013103 )
				if( MFI <= 96.6008 )
					if( Negative_Money_Flow_Sum <= 1.02545e+07 )
						if( Positive_Money_Flow_Sum <= 96062.7 )
							if( MFI <= 13.2268 )
								ret := -0.400000
							if( MFI > 13.2268 )
								if( Negative_Money_Flow_Sum <= 260937 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 260937 )
									ret := 0.971429 // buy
						if( Positive_Money_Flow_Sum > 96062.7 )
							if( Positive_Money_Flow <= 1.0289e+07 )
								if( Positive_Money_Flow_Sum <= 1.8632e+07 )
									ret := 0.084899
								if( Positive_Money_Flow_Sum > 1.8632e+07 )
									ret := 0.373057
							if( Positive_Money_Flow > 1.0289e+07 )
								if( Long_MA <= 19.0925 )
									ret := 0.000000
								if( Long_MA > 19.0925 )
									ret := -0.956522 // sell
					if( Negative_Money_Flow_Sum > 1.02545e+07 )
						if( Short_Long_Diff <= 0.154599 )
							if( Short_MA <= 23.5263 )
								if( Negative_Money_Flow_Sum <= 2.29384e+07 )
									ret := -0.153439
								if( Negative_Money_Flow_Sum > 2.29384e+07 )
									ret := 0.403509
							if( Short_MA > 23.5263 )
								if( Positive_Money_Flow_Sum <= 2.17106e+07 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 2.17106e+07 )
									ret := -1.000000 // sell
						if( Short_Long_Diff > 0.154599 )
							if( Long_MA <= 20.1523 )
								if( Positive_Money_Flow_Sum <= 5.11742e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.11742e+07 )
									ret := -0.777778 // sell
							if( Long_MA > 20.1523 )
								ret := -0.250000
				if( MFI > 96.6008 )
					if( Money_Flow_Ratio <= 57.8019 )
						if( Long_MA <= 19.6855 )
							if( Short_MA <= 16.3206 )
								if( Typical_Price <= 16.3192 )
									ret := 1.000000 // buy
								if( Typical_Price > 16.3192 )
									ret := 0.000000
							if( Short_MA > 16.3206 )
								if( Negative_Money_Flow_Sum <= 569869 )
									ret := 0.857143 // buy
								if( Negative_Money_Flow_Sum > 569869 )
									ret := 1.000000 // buy
						if( Long_MA > 19.6855 )
							ret := 0.000000
					if( Money_Flow_Ratio > 57.8019 )
						if( Money_Flow_Ratio <= 73.3278 )
							ret := -0.750000 // sell
						if( Money_Flow_Ratio > 73.3278 )
							ret := 0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_0d363464(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


