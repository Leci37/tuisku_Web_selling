//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: TSLA_30Min_2MM0_72db821d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2MM0_72db821d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_72db821d(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Short_Long_Diff <= -2.88241 )
		if( Raw_Money_Flow <= 7.89452e+08 )
			if( Long_MA <= 452.995 )
				if( Positive_Money_Flow <= 3.91919e+07 )
					if( Positive_Money_Flow_Sum <= 1.07703e+10 )
						if( Typical_Price <= 146.23 )
							if( Raw_Money_Flow <= 5.17448e+07 )
								ret := 0.166667
							if( Raw_Money_Flow > 5.17448e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 146.23 )
							if( Positive_Money_Flow_Sum <= 7.37445e+07 )
								if( Negative_Money_Flow_Sum <= 3.12e+07 )
									ret := 0.680851
								if( Negative_Money_Flow_Sum > 3.12e+07 )
									ret := 0.055072
							if( Positive_Money_Flow_Sum > 7.37445e+07 )
								if( Negative_Money_Flow_Sum <= 3.43817e+09 )
									ret := -0.061470
								if( Negative_Money_Flow_Sum > 3.43817e+09 )
									ret := 0.095380
					if( Positive_Money_Flow_Sum > 1.07703e+10 )
						if( Negative_Money_Flow_Sum <= 1.45997e+10 )
							ret := -0.428571
						if( Negative_Money_Flow_Sum > 1.45997e+10 )
							if( Negative_Money_Flow_Sum <= 2.39932e+10 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.39932e+10 )
								ret := -0.750000 // sell
				if( Positive_Money_Flow > 3.91919e+07 )
					if( Negative_Money_Flow_Sum <= 4.07162e+09 )
						if( Long_MA <= 209.256 )
							if( Positive_Money_Flow_Sum <= 3.97155e+08 )
								if( Positive_Money_Flow_Sum <= 1.06172e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.06172e+08 )
									ret := 0.589744
							if( Positive_Money_Flow_Sum > 3.97155e+08 )
								if( Short_MA <= 132.849 )
									ret := 1.000000 // buy
								if( Short_MA > 132.849 )
									ret := -0.200000
						if( Long_MA > 209.256 )
							if( Negative_Money_Flow_Sum <= 3.59914e+09 )
								if( Short_Long_Diff <= -6.29461 )
									ret := -0.612245
								if( Short_Long_Diff > -6.29461 )
									ret := -0.235067
							if( Negative_Money_Flow_Sum > 3.59914e+09 )
								if( MFI <= 40.7922 )
									ret := -1.000000 // sell
								if( MFI > 40.7922 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 4.07162e+09 )
						if( Positive_Money_Flow_Sum <= 9.71642e+08 )
							if( Positive_Money_Flow <= 6.28549e+07 )
								ret := -0.250000
							if( Positive_Money_Flow > 6.28549e+07 )
								if( Negative_Money_Flow_Sum <= 4.54203e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.54203e+09 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 9.71642e+08 )
							if( Short_Long_Diff <= -3.02415 )
								if( Positive_Money_Flow_Sum <= 1.19945e+10 )
									ret := 0.094737
								if( Positive_Money_Flow_Sum > 1.19945e+10 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > -3.02415 )
								if( Typical_Price <= 331.598 )
									ret := -0.250000
								if( Typical_Price > 331.598 )
									ret := -1.000000 // sell
			if( Long_MA > 452.995 )
				if( Money_Flow_Ratio <= 0.697233 )
					if( Negative_Money_Flow_Sum <= 7.57201e+09 )
						if( Raw_Money_Flow <= 1.75987e+07 )
							if( Negative_Money_Flow_Sum <= 6.93621e+08 )
								if( Raw_Money_Flow <= 1.54272e+07 )
									ret := -0.696970
								if( Raw_Money_Flow > 1.54272e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 6.93621e+08 )
								if( Short_Long_Diff <= -12.5458 )
									ret := 0.642857
								if( Short_Long_Diff > -12.5458 )
									ret := 0.092414
						if( Raw_Money_Flow > 1.75987e+07 )
							if( Short_MA <= 372.892 )
								ret := -1.000000 // sell
							if( Short_MA > 372.892 )
								if( MFI <= 7.17748 )
									ret := 0.552239
								if( MFI > 7.17748 )
									ret := 0.262705
					if( Negative_Money_Flow_Sum > 7.57201e+09 )
						if( Positive_Money_Flow_Sum <= 4.15109e+09 )
							if( Short_MA <= 835.818 )
								if( Negative_Money_Flow_Sum <= 1.87387e+10 )
									ret := 0.040968
								if( Negative_Money_Flow_Sum > 1.87387e+10 )
									ret := 0.833333 // buy
							if( Short_MA > 835.818 )
								if( Negative_Money_Flow_Sum <= 1.82303e+10 )
									ret := -0.315068
								if( Negative_Money_Flow_Sum > 1.82303e+10 )
									ret := 0.470588
						if( Positive_Money_Flow_Sum > 4.15109e+09 )
							if( Positive_Money_Flow_Sum <= 1.09665e+10 )
								if( Negative_Money_Flow <= 3.30961e+07 )
									ret := 0.083333
								if( Negative_Money_Flow > 3.30961e+07 )
									ret := 0.502857
							if( Positive_Money_Flow_Sum > 1.09665e+10 )
								if( Negative_Money_Flow_Sum <= 2.63061e+10 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow_Sum > 2.63061e+10 )
									ret := -0.285714
				if( Money_Flow_Ratio > 0.697233 )
					if( Negative_Money_Flow_Sum <= 5.73241e+09 )
						if( Long_MA <= 745.045 )
							if( Positive_Money_Flow_Sum <= 4.87699e+09 )
								if( MFI <= 60.8938 )
									ret := -0.002506
								if( MFI > 60.8938 )
									ret := -0.446009
							if( Positive_Money_Flow_Sum > 4.87699e+09 )
								if( MFI_High <= 1.34944 )
									ret := 0.175000
								if( MFI_High > 1.34944 )
									ret := 0.950000 // buy
						if( Long_MA > 745.045 )
							if( Short_Long_Diff <= -4.61064 )
								if( Short_Long_Diff <= -28.9439 )
									ret := 0.894737 // buy
								if( Short_Long_Diff > -28.9439 )
									ret := 0.030960
							if( Short_Long_Diff > -4.61064 )
								if( Positive_Money_Flow_Sum <= 2.79529e+09 )
									ret := 0.550459
								if( Positive_Money_Flow_Sum > 2.79529e+09 )
									ret := 0.190909
					if( Negative_Money_Flow_Sum > 5.73241e+09 )
						if( Raw_Money_Flow <= 7.37002e+08 )
							if( Short_Long_Diff <= -3.85541 )
								if( Negative_Money_Flow <= 9.50431e+06 )
									ret := -0.170370
								if( Negative_Money_Flow > 9.50431e+06 )
									ret := -0.555556
							if( Short_Long_Diff > -3.85541 )
								if( MFI_High <= -36.8541 )
									ret := -0.600000
								if( MFI_High > -36.8541 )
									ret := 0.333333
						if( Raw_Money_Flow > 7.37002e+08 )
							if( Negative_Money_Flow_Sum <= 9.62422e+09 )
								if( Short_Long_Diff <= -15.1771 )
									ret := -0.500000
								if( Short_Long_Diff > -15.1771 )
									ret := 0.727273 // buy
							if( Negative_Money_Flow_Sum > 9.62422e+09 )
								ret := -0.500000
		if( Raw_Money_Flow > 7.89452e+08 )
			if( MFI_High <= -21.9035 )
				if( Money_Flow_Ratio <= 0.109978 )
					if( Long_MA <= 1079.92 )
						if( Short_Long_Diff <= -72.6077 )
							ret := -1.000000 // sell
						if( Short_Long_Diff > -72.6077 )
							if( Negative_Money_Flow_Sum <= 1.90698e+10 )
								if( Negative_Money_Flow <= 2.26115e+09 )
									ret := -0.020619
								if( Negative_Money_Flow > 2.26115e+09 )
									ret := -0.353293
							if( Negative_Money_Flow_Sum > 1.90698e+10 )
								if( Long_MA <= 351.839 )
									ret := 0.241379
								if( Long_MA > 351.839 )
									ret := 0.780000 // buy
					if( Long_MA > 1079.92 )
						if( Short_Long_Diff <= -3.82946 )
							if( Short_Long_Diff <= -15.4279 )
								ret := 1.000000 // buy
							if( Short_Long_Diff > -15.4279 )
								if( Negative_Money_Flow_Sum <= 5.88338e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 5.88338e+09 )
									ret := 0.333333
						if( Short_Long_Diff > -3.82946 )
							ret := -0.200000
				if( Money_Flow_Ratio > 0.109978 )
					if( MFI <= 14.72 )
						if( Short_MA <= 1164.24 )
							if( Negative_Money_Flow <= 7.29277e+09 )
								if( Positive_Money_Flow_Sum <= 3.94655e+09 )
									ret := -0.543750
								if( Positive_Money_Flow_Sum > 3.94655e+09 )
									ret := -0.058824
							if( Negative_Money_Flow > 7.29277e+09 )
								ret := 0.500000
						if( Short_MA > 1164.24 )
							if( Positive_Money_Flow <= 4.58247e+08 )
								ret := -0.285714
							if( Positive_Money_Flow > 4.58247e+08 )
								ret := 1.000000 // buy
					if( MFI > 14.72 )
						if( Positive_Money_Flow_Sum <= 9.67665e+09 )
							if( Negative_Money_Flow_Sum <= 9.48138e+09 )
								if( MFI_High <= -25.0072 )
									ret := -0.294379
								if( MFI_High > -25.0072 )
									ret := 0.290323
							if( Negative_Money_Flow_Sum > 9.48138e+09 )
								if( Positive_Money_Flow_Sum <= 3.12361e+09 )
									ret := 0.176471
								if( Positive_Money_Flow_Sum > 3.12361e+09 )
									ret := -0.125908
						if( Positive_Money_Flow_Sum > 9.67665e+09 )
							if( Short_MA <= 605.139 )
								if( MFI_Low <= 27.8578 )
									ret := -0.752212 // sell
								if( MFI_Low > 27.8578 )
									ret := -0.357143
							if( Short_MA > 605.139 )
								if( Positive_Money_Flow <= 2.06958e+09 )
									ret := 0.020408
								if( Positive_Money_Flow > 2.06958e+09 )
									ret := -0.777778 // sell
			if( MFI_High > -21.9035 )
				if( Negative_Money_Flow_Sum <= 2.93907e+09 )
					if( Typical_Price <= 390.276 )
						if( MFI_Low <= 71.1183 )
							if( Short_MA <= 265.78 )
								if( Money_Flow_Ratio <= 6.45162 )
									ret := 0.000000
								if( Money_Flow_Ratio > 6.45162 )
									ret := 0.800000 // buy
							if( Short_MA > 265.78 )
								ret := 1.000000 // buy
						if( MFI_Low > 71.1183 )
							ret := 0.000000
					if( Typical_Price > 390.276 )
						if( Negative_Money_Flow_Sum <= 2.925e+08 )
							if( Negative_Money_Flow_Sum <= 1.69133e+08 )
								if( Positive_Money_Flow_Sum <= 1.60134e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.60134e+09 )
									ret := -0.900000 // sell
							if( Negative_Money_Flow_Sum > 1.69133e+08 )
								if( Positive_Money_Flow_Sum <= 3.96319e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.96319e+09 )
									ret := -0.142857
						if( Negative_Money_Flow_Sum > 2.925e+08 )
							if( Raw_Money_Flow <= 3.48305e+09 )
								if( Positive_Money_Flow_Sum <= 2.65074e+09 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 2.65074e+09 )
									ret := -0.405594
							if( Raw_Money_Flow > 3.48305e+09 )
								if( Long_MA <= 503.282 )
									ret := -0.636364
								if( Long_MA > 503.282 )
									ret := 0.258621
				if( Negative_Money_Flow_Sum > 2.93907e+09 )
					if( Typical_Price <= 427.521 )
						if( Raw_Money_Flow <= 1.533e+09 )
							if( Negative_Money_Flow_Sum <= 5.86746e+09 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 5.86746e+09 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.533e+09 )
							if( Long_MA <= 393.694 )
								ret := 0.500000
							if( Long_MA > 393.694 )
								ret := -0.250000
					if( Typical_Price > 427.521 )
						if( Short_MA <= 613.241 )
							if( Short_Long_Diff <= -3.70397 )
								if( Money_Flow_Ratio <= 1.502 )
									ret := 0.250000
								if( Money_Flow_Ratio > 1.502 )
									ret := 0.971429 // buy
							if( Short_Long_Diff > -3.70397 )
								ret := 0.000000
						if( Short_MA > 613.241 )
							if( Positive_Money_Flow_Sum <= 1.17575e+10 )
								if( Negative_Money_Flow_Sum <= 4.21216e+09 )
									ret := 0.190476
								if( Negative_Money_Flow_Sum > 4.21216e+09 )
									ret := 0.724138 // buy
							if( Positive_Money_Flow_Sum > 1.17575e+10 )
								if( Short_Long_Diff <= -20.871 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > -20.871 )
									ret := -0.409091
	if( Short_Long_Diff > -2.88241 )
		if( Money_Flow_Ratio <= 0.733257 )
			if( Negative_Money_Flow <= 5.87922e+06 )
				if( Long_MA <= 1650.04 )
					if( Raw_Money_Flow <= 2.00358e+09 )
						if( MA_Cross <= 58.4008 )
							if( Negative_Money_Flow_Sum <= 8.24294e+06 )
								if( Short_Long_Diff <= 0.326498 )
									ret := 0.500000
								if( Short_Long_Diff > 0.326498 )
									ret := -0.281250
							if( Negative_Money_Flow_Sum > 8.24294e+06 )
								if( Positive_Money_Flow_Sum <= 5.15415e+07 )
									ret := 0.004312
								if( Positive_Money_Flow_Sum > 5.15415e+07 )
									ret := 0.076272
						if( MA_Cross > 58.4008 )
							if( Short_Long_Diff <= 0.236382 )
								if( Negative_Money_Flow_Sum <= 5.86739e+09 )
									ret := -0.144928
								if( Negative_Money_Flow_Sum > 5.86739e+09 )
									ret := -0.850000 // sell
							if( Short_Long_Diff > 0.236382 )
								if( Money_Flow_Ratio <= 0.68008 )
									ret := 0.087719
								if( Money_Flow_Ratio > 0.68008 )
									ret := 0.705882 // buy
					if( Raw_Money_Flow > 2.00358e+09 )
						if( Negative_Money_Flow_Sum <= 4.4274e+09 )
							if( Long_MA <= 314.281 )
								if( Raw_Money_Flow <= 2.30791e+09 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 2.30791e+09 )
									ret := -0.500000
							if( Long_MA > 314.281 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 4.4274e+09 )
							if( Long_MA <= 242.386 )
								if( MFI_Low <= 20.8095 )
									ret := 0.760563 // buy
								if( MFI_Low > 20.8095 )
									ret := -0.166667
							if( Long_MA > 242.386 )
								if( Negative_Money_Flow_Sum <= 5.71941e+09 )
									ret := 0.718750 // buy
								if( Negative_Money_Flow_Sum > 5.71941e+09 )
									ret := -0.009434
				if( Long_MA > 1650.04 )
					if( Money_Flow_Ratio <= 0.525363 )
						if( Positive_Money_Flow_Sum <= 1.87566e+09 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.87566e+09 )
							if( Positive_Money_Flow <= 1.26945e+09 )
								ret := 0.000000
							if( Positive_Money_Flow > 1.26945e+09 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.525363 )
						ret := 0.000000
			if( Negative_Money_Flow > 5.87922e+06 )
				if( Negative_Money_Flow <= 3.22933e+09 )
					if( Raw_Money_Flow <= 2.48765e+09 )
						if( Money_Flow_Ratio <= 0.170493 )
							if( Short_Long_Diff <= 8.3864 )
								if( Negative_Money_Flow <= 2.07584e+09 )
									ret := 0.023263
								if( Negative_Money_Flow > 2.07584e+09 )
									ret := 0.309417
							if( Short_Long_Diff > 8.3864 )
								if( Positive_Money_Flow_Sum <= 3.6565e+08 )
									ret := -0.775000 // sell
								if( Positive_Money_Flow_Sum > 3.6565e+08 )
									ret := 0.428571
						if( Money_Flow_Ratio > 0.170493 )
							if( Positive_Money_Flow_Sum <= 3.70905e+09 )
								if( MFI_Low <= 16.7477 )
									ret := -0.091600
								if( MFI_Low > 16.7477 )
									ret := -0.008942
							if( Positive_Money_Flow_Sum > 3.70905e+09 )
								if( MA_Cross <= 38.0022 )
									ret := 0.094358
								if( MA_Cross > 38.0022 )
									ret := -0.680000
					if( Raw_Money_Flow > 2.48765e+09 )
						if( Negative_Money_Flow_Sum <= 1.65662e+10 )
							if( Short_Long_Diff <= 5.43346 )
								if( Negative_Money_Flow_Sum <= 3.13879e+09 )
									ret := 0.012500
								if( Negative_Money_Flow_Sum > 3.13879e+09 )
									ret := -0.408922
							if( Short_Long_Diff > 5.43346 )
								if( Positive_Money_Flow_Sum <= 5.04399e+08 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 5.04399e+08 )
									ret := 0.846154 // buy
						if( Negative_Money_Flow_Sum > 1.65662e+10 )
							if( Long_MA <= 206.408 )
								ret := -0.400000
							if( Long_MA > 206.408 )
								if( MFI_Low <= -8.60262 )
									ret := 1.000000 // buy
								if( MFI_Low > -8.60262 )
									ret := 0.400000
				if( Negative_Money_Flow > 3.22933e+09 )
					if( Positive_Money_Flow_Sum <= 4.06848e+08 )
						if( Negative_Money_Flow_Sum <= 4.57093e+09 )
							if( Negative_Money_Flow_Sum <= 4.00657e+09 )
								if( Negative_Money_Flow_Sum <= 3.5759e+09 )
									ret := -0.259259
								if( Negative_Money_Flow_Sum > 3.5759e+09 )
									ret := 0.704918 // buy
							if( Negative_Money_Flow_Sum > 4.00657e+09 )
								if( Short_Long_Diff <= 0.076562 )
									ret := -0.766667 // sell
								if( Short_Long_Diff > 0.076562 )
									ret := 0.076923
						if( Negative_Money_Flow_Sum > 4.57093e+09 )
							if( Negative_Money_Flow_Sum <= 4.89295e+09 )
								if( MFI_Low <= -16.236 )
									ret := 0.500000
								if( MFI_Low > -16.236 )
									ret := 0.952381 // buy
							if( Negative_Money_Flow_Sum > 4.89295e+09 )
								if( Short_Long_Diff <= -1.25982 )
									ret := 0.789474 // buy
								if( Short_Long_Diff > -1.25982 )
									ret := 0.243243
					if( Positive_Money_Flow_Sum > 4.06848e+08 )
						if( Long_MA <= 241.581 )
							if( Positive_Money_Flow_Sum <= 9.72825e+08 )
								if( Short_MA <= 165.545 )
									ret := -0.100000
								if( Short_MA > 165.545 )
									ret := -0.772727 // sell
							if( Positive_Money_Flow_Sum > 9.72825e+08 )
								if( Money_Flow_Ratio <= 0.16998 )
									ret := -0.400000
								if( Money_Flow_Ratio > 0.16998 )
									ret := 0.461538
						if( Long_MA > 241.581 )
							if( Negative_Money_Flow_Sum <= 8.69823e+09 )
								if( Negative_Money_Flow <= 6.61821e+09 )
									ret := 0.054264
								if( Negative_Money_Flow > 6.61821e+09 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 8.69823e+09 )
								if( Negative_Money_Flow_Sum <= 2.01978e+10 )
									ret := 0.622222
								if( Negative_Money_Flow_Sum > 2.01978e+10 )
									ret := -0.333333
		if( Money_Flow_Ratio > 0.733257 )
			if( Positive_Money_Flow_Sum <= 3.36174e+08 )
				if( Typical_Price <= 794.147 )
					if( Short_Long_Diff <= 0.369255 )
						if( MA_Cross <= 128.325 )
							if( Positive_Money_Flow_Sum <= 2.95975e+08 )
								if( Short_MA <= 142.31 )
									ret := -0.666667
								if( Short_MA > 142.31 )
									ret := 0.114121
							if( Positive_Money_Flow_Sum > 2.95975e+08 )
								if( Negative_Money_Flow_Sum <= 2.54444e+08 )
									ret := 0.097015
								if( Negative_Money_Flow_Sum > 2.54444e+08 )
									ret := -0.310881
						if( MA_Cross > 128.325 )
							if( Positive_Money_Flow <= 141463 )
								if( Typical_Price <= 220.56 )
									ret := 0.151515
								if( Typical_Price > 220.56 )
									ret := -0.594937
							if( Positive_Money_Flow > 141463 )
								if( Long_MA <= 237.1 )
									ret := -0.250000
								if( Long_MA > 237.1 )
									ret := 0.182796
					if( Short_Long_Diff > 0.369255 )
						if( Positive_Money_Flow_Sum <= 1.57473e+07 )
							if( Negative_Money_Flow_Sum <= 3.35582e+06 )
								if( Negative_Money_Flow <= 1.02236e+06 )
									ret := -0.731707 // sell
								if( Negative_Money_Flow > 1.02236e+06 )
									ret := 0.111111
							if( Negative_Money_Flow_Sum > 3.35582e+06 )
								if( Typical_Price <= 252.263 )
									ret := 0.245902
								if( Typical_Price > 252.263 )
									ret := -0.413793
						if( Positive_Money_Flow_Sum > 1.57473e+07 )
							if( MA_Cross <= 2.47808 )
								if( Raw_Money_Flow <= 8.42112e+07 )
									ret := -0.040184
								if( Raw_Money_Flow > 8.42112e+07 )
									ret := 0.166124
							if( MA_Cross > 2.47808 )
								if( Short_Long_Diff <= 1.48674 )
									ret := -0.600000
								if( Short_Long_Diff > 1.48674 )
									ret := 0.285714
				if( Typical_Price > 794.147 )
					if( Raw_Money_Flow <= 1.67017e+08 )
						if( Raw_Money_Flow <= 1.00731e+08 )
							if( Short_MA <= 1541.26 )
								if( Positive_Money_Flow <= 7.82485e+07 )
									ret := -0.270096
								if( Positive_Money_Flow > 7.82485e+07 )
									ret := 0.176471
							if( Short_MA > 1541.26 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.00731e+08 )
							if( Positive_Money_Flow <= 1.29916e+08 )
								if( Negative_Money_Flow_Sum <= 3.12442e+08 )
									ret := -0.776316 // sell
								if( Negative_Money_Flow_Sum > 3.12442e+08 )
									ret := 0.000000
							if( Positive_Money_Flow > 1.29916e+08 )
								if( Positive_Money_Flow_Sum <= 3.07928e+08 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 3.07928e+08 )
									ret := 0.700000 // buy
					if( Raw_Money_Flow > 1.67017e+08 )
						if( Negative_Money_Flow_Sum <= 3.25346e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.25346e+08 )
							ret := 0.400000
			if( Positive_Money_Flow_Sum > 3.36174e+08 )
				if( Long_MA <= 265.201 )
					if( Typical_Price <= 271 )
						if( Short_MA <= 173.427 )
							if( Raw_Money_Flow <= 6.1217e+08 )
								if( Short_Long_Diff <= 0.679141 )
									ret := -0.045977
								if( Short_Long_Diff > 0.679141 )
									ret := 0.240000
							if( Raw_Money_Flow > 6.1217e+08 )
								if( Positive_Money_Flow <= 3.42117e+09 )
									ret := 0.318519
								if( Positive_Money_Flow > 3.42117e+09 )
									ret := -0.320000
						if( Short_MA > 173.427 )
							if( MFI <= 80.9874 )
								if( Raw_Money_Flow <= 3.66591e+09 )
									ret := 0.059050
								if( Raw_Money_Flow > 3.66591e+09 )
									ret := 0.474576
							if( MFI > 80.9874 )
								if( Positive_Money_Flow <= 5.56284e+08 )
									ret := 0.036638
								if( Positive_Money_Flow > 5.56284e+08 )
									ret := -0.108889
					if( Typical_Price > 271 )
						if( Positive_Money_Flow_Sum <= 3.36449e+09 )
							if( Short_Long_Diff <= 7.32143 )
								if( Positive_Money_Flow_Sum <= 1.18001e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.18001e+09 )
									ret := 1.000000 // buy
							if( Short_Long_Diff > 7.32143 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 3.36449e+09 )
							if( Long_MA <= 263.969 )
								ret := -0.500000
							if( Long_MA > 263.969 )
								ret := 0.714286 // buy
				if( Long_MA > 265.201 )
					if( Negative_Money_Flow_Sum <= 1.76705e+09 )
						if( Short_Long_Diff <= 48.1378 )
							if( Long_MA <= 904.014 )
								if( MFI <= 67.5236 )
									ret := 0.052512
								if( MFI > 67.5236 )
									ret := 0.132782
							if( Long_MA > 904.014 )
								if( Raw_Money_Flow <= 7.06998e+09 )
									ret := -0.080043
								if( Raw_Money_Flow > 7.06998e+09 )
									ret := 0.888889 // buy
						if( Short_Long_Diff > 48.1378 )
							if( Long_MA <= 1593.2 )
								if( Short_Long_Diff <= 68.9909 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > 68.9909 )
									ret := 0.600000
							if( Long_MA > 1593.2 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.76705e+09 )
						if( Negative_Money_Flow <= 7.35374e+08 )
							if( Money_Flow_Ratio <= 9.04929 )
								if( MA_Cross <= 106.467 )
									ret := 0.200027
								if( MA_Cross > 106.467 )
									ret := -0.059278
							if( Money_Flow_Ratio > 9.04929 )
								if( Short_Long_Diff <= 4.23978 )
									ret := -0.500000
								if( Short_Long_Diff > 4.23978 )
									ret := 0.790698 // buy
						if( Negative_Money_Flow > 7.35374e+08 )
							if( Short_MA <= 579.903 )
								if( Long_MA <= 459.555 )
									ret := 0.110870
								if( Long_MA > 459.555 )
									ret := 0.378788
							if( Short_MA > 579.903 )
								if( MFI <= 55.0322 )
									ret := -0.200441
								if( MFI > 55.0322 )
									ret := 0.032136
	
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
float op_operation = decision_tree_0_TSLA_30Min_72db821d(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


