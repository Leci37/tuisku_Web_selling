//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: AMZN_1Min_2MM0_7a2423c0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Min_2MM0_7a2423c0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Min_7a2423c0(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 186.561 )
		if( Negative_Money_Flow <= 1091.84 )
			if( Positive_Money_Flow <= 1.52365e+07 )
				if( Raw_Money_Flow <= 5.28085e+06 )
					if( Positive_Money_Flow_Sum <= 2.48604e+06 )
						if( Short_Long_Diff <= -0.106309 )
							if( Negative_Money_Flow_Sum <= 1.18818e+06 )
								if( Raw_Money_Flow <= 149872 )
									ret := 0.139241
								if( Raw_Money_Flow > 149872 )
									ret := -0.415094
							if( Negative_Money_Flow_Sum > 1.18818e+06 )
								if( Short_Long_Diff <= -0.480094 )
									ret := -0.315789
								if( Short_Long_Diff > -0.480094 )
									ret := 0.206862
						if( Short_Long_Diff > -0.106309 )
							if( Typical_Price <= 181.202 )
								if( Negative_Money_Flow_Sum <= 286681 )
									ret := 0.296512
								if( Negative_Money_Flow_Sum > 286681 )
									ret := 0.036856
							if( Typical_Price > 181.202 )
								if( Raw_Money_Flow <= 164163 )
									ret := 0.027491
								if( Raw_Money_Flow > 164163 )
									ret := -0.071480
					if( Positive_Money_Flow_Sum > 2.48604e+06 )
						if( MA_Cross <= 16.4704 )
							if( Short_Long_Diff <= -0.395942 )
								if( Positive_Money_Flow_Sum <= 4.52013e+06 )
									ret := 0.847826 // buy
								if( Positive_Money_Flow_Sum > 4.52013e+06 )
									ret := 0.059701
							if( Short_Long_Diff > -0.395942 )
								if( Long_MA <= 164.504 )
									ret := -0.185090
								if( Long_MA > 164.504 )
									ret := -0.011405
						if( MA_Cross > 16.4704 )
							if( Short_Long_Diff <= 0.073451 )
								if( Raw_Money_Flow <= 1.11265e+06 )
									ret := -0.277778
								if( Raw_Money_Flow > 1.11265e+06 )
									ret := 0.034483
							if( Short_Long_Diff > 0.073451 )
								if( Typical_Price <= 185.602 )
									ret := -0.854545 // sell
								if( Typical_Price > 185.602 )
									ret := 0.600000
				if( Raw_Money_Flow > 5.28085e+06 )
					if( Negative_Money_Flow_Sum <= 8.90559e+07 )
						if( Negative_Money_Flow_Sum <= 9.33193e+06 )
							if( Long_MA <= 176.291 )
								if( Positive_Money_Flow_Sum <= 5.56189e+07 )
									ret := -0.870968 // sell
								if( Positive_Money_Flow_Sum > 5.56189e+07 )
									ret := -0.307692
							if( Long_MA > 176.291 )
								if( MFI <= 91.6231 )
									ret := 0.083333
								if( MFI > 91.6231 )
									ret := -0.451613
						if( Negative_Money_Flow_Sum > 9.33193e+06 )
							if( Negative_Money_Flow_Sum <= 2.17107e+07 )
								if( Positive_Money_Flow_Sum <= 1.22285e+08 )
									ret := 0.322091
								if( Positive_Money_Flow_Sum > 1.22285e+08 )
									ret := -0.069565
							if( Negative_Money_Flow_Sum > 2.17107e+07 )
								if( MFI_Low <= 63.2281 )
									ret := 0.072517
								if( MFI_Low > 63.2281 )
									ret := -0.167630
					if( Negative_Money_Flow_Sum > 8.90559e+07 )
						if( Short_Long_Diff <= -0.511971 )
							if( Negative_Money_Flow_Sum <= 1.78742e+08 )
								if( Negative_Money_Flow_Sum <= 1.68926e+08 )
									ret := 0.055556
								if( Negative_Money_Flow_Sum > 1.68926e+08 )
									ret := -0.900000 // sell
							if( Negative_Money_Flow_Sum > 1.78742e+08 )
								if( Raw_Money_Flow <= 1.46438e+07 )
									ret := 0.814815 // buy
								if( Raw_Money_Flow > 1.46438e+07 )
									ret := -0.333333
						if( Short_Long_Diff > -0.511971 )
							if( MFI_High <= -55.1497 )
								if( Short_MA <= 180.396 )
									ret := -0.339768
								if( Short_MA > 180.396 )
									ret := -0.026923
							if( MFI_High > -55.1497 )
								if( Positive_Money_Flow_Sum <= 3.13856e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.13856e+07 )
									ret := -0.044147
			if( Positive_Money_Flow > 1.52365e+07 )
				if( Short_Long_Diff <= 0.257054 )
					if( Negative_Money_Flow_Sum <= 6.02239e+06 )
						if( MFI_Low <= 78.1301 )
							if( Short_Long_Diff <= -0.089433 )
								ret := 0.000000
							if( Short_Long_Diff > -0.089433 )
								if( Short_Long_Diff <= 0.149932 )
									ret := -0.703704 // sell
								if( Short_Long_Diff > 0.149932 )
									ret := 0.000000
						if( MFI_Low > 78.1301 )
							if( Short_Long_Diff <= 0.072243 )
								if( Short_MA <= 182.164 )
									ret := 0.000000
								if( Short_MA > 182.164 )
									ret := -0.250000
							if( Short_Long_Diff > 0.072243 )
								if( Long_MA <= 182.578 )
									ret := 0.750000 // buy
								if( Long_MA > 182.578 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 6.02239e+06 )
						if( MFI_High <= -0.626441 )
							if( Positive_Money_Flow_Sum <= 6.22758e+08 )
								if( MFI <= 67.3885 )
									ret := 0.126089
								if( MFI > 67.3885 )
									ret := -0.001083
							if( Positive_Money_Flow_Sum > 6.22758e+08 )
								if( MFI_Low <= 24.1523 )
									ret := 0.187500
								if( MFI_Low > 24.1523 )
									ret := -0.673077
						if( MFI_High > -0.626441 )
							if( Short_MA <= 175.82 )
								if( Negative_Money_Flow_Sum <= 8.96458e+07 )
									ret := 0.772727 // buy
								if( Negative_Money_Flow_Sum > 8.96458e+07 )
									ret := 0.090909
							if( Short_MA > 175.82 )
								if( Long_MA <= 178.928 )
									ret := -0.073171
								if( Long_MA > 178.928 )
									ret := 0.296482
				if( Short_Long_Diff > 0.257054 )
					if( Negative_Money_Flow_Sum <= 1.78562e+08 )
						if( MFI_Low <= 51.6345 )
							if( MFI_Low <= 32.0809 )
								if( Long_MA <= 180.019 )
									ret := 1.000000 // buy
								if( Long_MA > 180.019 )
									ret := 0.333333
							if( MFI_Low > 32.0809 )
								if( Long_MA <= 166.426 )
									ret := 0.151515
								if( Long_MA > 166.426 )
									ret := -0.387931
						if( MFI_Low > 51.6345 )
							if( MFI_High <= 9.95408 )
								if( Positive_Money_Flow_Sum <= 2.50573e+08 )
									ret := 0.205674
								if( Positive_Money_Flow_Sum > 2.50573e+08 )
									ret := -0.166667
							if( MFI_High > 9.95408 )
								if( Negative_Money_Flow_Sum <= 1.35188e+07 )
									ret := 0.210526
								if( Negative_Money_Flow_Sum > 1.35188e+07 )
									ret := -0.638889
					if( Negative_Money_Flow_Sum > 1.78562e+08 )
						if( Long_MA <= 183.267 )
							if( Short_Long_Diff <= 1.17839 )
								if( Short_Long_Diff <= 0.576572 )
									ret := -0.086331
								if( Short_Long_Diff > 0.576572 )
									ret := 0.414141
							if( Short_Long_Diff > 1.17839 )
								if( Long_MA <= 156.891 )
									ret := 0.000000
								if( Long_MA > 156.891 )
									ret := -1.000000 // sell
						if( Long_MA > 183.267 )
							if( MFI_Low <= 50.0009 )
								if( Raw_Money_Flow <= 2.89176e+07 )
									ret := 0.333333
								if( Raw_Money_Flow > 2.89176e+07 )
									ret := 0.891304 // buy
							if( MFI_Low > 50.0009 )
								if( Raw_Money_Flow <= 3.44113e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 3.44113e+07 )
									ret := -0.714286 // sell
		if( Negative_Money_Flow > 1091.84 )
			if( Positive_Money_Flow_Sum <= 2.32038e+06 )
				if( MFI <= 31.6225 )
					if( Short_Long_Diff <= 0.002666 )
						if( Negative_Money_Flow <= 1.14906e+08 )
							if( Positive_Money_Flow_Sum <= 316374 )
								if( Negative_Money_Flow <= 17997 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow > 17997 )
									ret := 0.059055
							if( Positive_Money_Flow_Sum > 316374 )
								if( MFI <= 5.90898 )
									ret := 0.058480
								if( MFI > 5.90898 )
									ret := 0.292793
						if( Negative_Money_Flow > 1.14906e+08 )
							if( Long_MA <= 179.878 )
								ret := -0.750000 // sell
							if( Long_MA > 179.878 )
								ret := -1.000000 // sell
					if( Short_Long_Diff > 0.002666 )
						if( Negative_Money_Flow <= 3.48358e+06 )
							if( Negative_Money_Flow <= 2.02241e+06 )
								if( Negative_Money_Flow <= 821045 )
									ret := 0.072581
								if( Negative_Money_Flow > 821045 )
									ret := -0.240506
							if( Negative_Money_Flow > 2.02241e+06 )
								if( Raw_Money_Flow <= 2.63338e+06 )
									ret := 0.916667 // buy
								if( Raw_Money_Flow > 2.63338e+06 )
									ret := 0.250000
						if( Negative_Money_Flow > 3.48358e+06 )
							if( Short_Long_Diff <= 0.136619 )
								if( Short_Long_Diff <= 0.058019 )
									ret := -0.136364
								if( Short_Long_Diff > 0.058019 )
									ret := -0.750000 // sell
							if( Short_Long_Diff > 0.136619 )
								ret := 1.000000 // buy
				if( MFI > 31.6225 )
					if( Money_Flow_Ratio <= 0.66621 )
						if( Long_MA <= 162.075 )
							if( Short_MA <= 161.397 )
								if( Typical_Price <= 160.836 )
									ret := 0.888889 // buy
								if( Typical_Price > 160.836 )
									ret := -0.090909
							if( Short_MA > 161.397 )
								if( Negative_Money_Flow_Sum <= 2.66981e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.66981e+06 )
									ret := 0.750000 // buy
						if( Long_MA > 162.075 )
							if( Short_Long_Diff <= 0.013463 )
								if( Negative_Money_Flow <= 1.29331e+06 )
									ret := 0.021000
								if( Negative_Money_Flow > 1.29331e+06 )
									ret := 0.695652
							if( Short_Long_Diff > 0.013463 )
								if( Negative_Money_Flow_Sum <= 1.29925e+06 )
									ret := -0.432099
								if( Negative_Money_Flow_Sum > 1.29925e+06 )
									ret := -0.083636
					if( Money_Flow_Ratio > 0.66621 )
						if( Negative_Money_Flow_Sum <= 1.1089e+06 )
							if( Raw_Money_Flow <= 241785 )
								if( Money_Flow_Ratio <= 3.60956 )
									ret := 0.117805
								if( Money_Flow_Ratio > 3.60956 )
									ret := -0.105727
							if( Raw_Money_Flow > 241785 )
								if( Typical_Price <= 173.61 )
									ret := -0.525424
								if( Typical_Price > 173.61 )
									ret := -0.040404
						if( Negative_Money_Flow_Sum > 1.1089e+06 )
							if( MFI_Low <= 41.5844 )
								if( Short_Long_Diff <= 0.061368 )
									ret := 0.222488
								if( Short_Long_Diff > 0.061368 )
									ret := -0.011338
							if( MFI_Low > 41.5844 )
								if( Short_Long_Diff <= 0.28562 )
									ret := 0.722222 // buy
								if( Short_Long_Diff > 0.28562 )
									ret := -0.250000
			if( Positive_Money_Flow_Sum > 2.32038e+06 )
				if( Negative_Money_Flow_Sum <= 2.17771e+08 )
					if( Positive_Money_Flow_Sum <= 5.22452e+07 )
						if( Raw_Money_Flow <= 4.32561e+06 )
							if( Short_MA <= 162.786 )
								if( Short_Long_Diff <= -0.665964 )
									ret := 0.722222 // buy
								if( Short_Long_Diff > -0.665964 )
									ret := -0.254054
							if( Short_MA > 162.786 )
								if( Negative_Money_Flow_Sum <= 7.58223e+07 )
									ret := 0.092294
								if( Negative_Money_Flow_Sum > 7.58223e+07 )
									ret := -0.293651
						if( Raw_Money_Flow > 4.32561e+06 )
							if( Raw_Money_Flow <= 7.2109e+06 )
								if( Positive_Money_Flow_Sum <= 1.556e+07 )
									ret := -0.368889
								if( Positive_Money_Flow_Sum > 1.556e+07 )
									ret := -0.072276
							if( Raw_Money_Flow > 7.2109e+06 )
								if( Short_Long_Diff <= -0.513776 )
									ret := 0.673913
								if( Short_Long_Diff > -0.513776 )
									ret := 0.017911
					if( Positive_Money_Flow_Sum > 5.22452e+07 )
						if( Typical_Price <= 184.186 )
							if( Positive_Money_Flow_Sum <= 5.69723e+07 )
								if( Raw_Money_Flow <= 2.13075e+07 )
									ret := 0.274673
								if( Raw_Money_Flow > 2.13075e+07 )
									ret := -0.243902
							if( Positive_Money_Flow_Sum > 5.69723e+07 )
								if( Negative_Money_Flow_Sum <= 5.97656e+07 )
									ret := 0.162442
								if( Negative_Money_Flow_Sum > 5.97656e+07 )
									ret := 0.079385
						if( Typical_Price > 184.186 )
							if( Raw_Money_Flow <= 4.3722e+07 )
								if( Positive_Money_Flow_Sum <= 5.44e+07 )
									ret := 0.303571
								if( Positive_Money_Flow_Sum > 5.44e+07 )
									ret := 0.021324
							if( Raw_Money_Flow > 4.3722e+07 )
								if( Raw_Money_Flow <= 5.72686e+07 )
									ret := -0.621622
								if( Raw_Money_Flow > 5.72686e+07 )
									ret := 0.444444
				if( Negative_Money_Flow_Sum > 2.17771e+08 )
					if( Short_MA <= 160.366 )
						if( Long_MA <= 159.58 )
							ret := 1.000000 // buy
						if( Long_MA > 159.58 )
							if( MFI_Low <= 17.9905 )
								if( Money_Flow_Ratio <= 0.332886 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.332886 )
									ret := 1.000000 // buy
							if( MFI_Low > 17.9905 )
								ret := 0.142857
					if( Short_MA > 160.366 )
						if( Negative_Money_Flow_Sum <= 3.81083e+08 )
							if( Negative_Money_Flow <= 1.90507e+07 )
								if( Typical_Price <= 180.093 )
									ret := -0.243523
								if( Typical_Price > 180.093 )
									ret := 0.160000
							if( Negative_Money_Flow > 1.90507e+07 )
								if( Money_Flow_Ratio <= 0.033257 )
									ret := 0.842105 // buy
								if( Money_Flow_Ratio > 0.033257 )
									ret := 0.291495
						if( Negative_Money_Flow_Sum > 3.81083e+08 )
							if( Short_Long_Diff <= -0.847121 )
								if( MFI_High <= -52.1787 )
									ret := 0.960526 // buy
								if( MFI_High > -52.1787 )
									ret := -0.138889
							if( Short_Long_Diff > -0.847121 )
								if( Short_Long_Diff <= -0.622818 )
									ret := -0.325581
								if( Short_Long_Diff > -0.622818 )
									ret := 0.052736
	if( Typical_Price > 186.561 )
		if( Short_Long_Diff <= 0.240222 )
			if( Negative_Money_Flow_Sum <= 3.20873e+08 )
				if( Money_Flow_Ratio <= 0.229566 )
					if( Positive_Money_Flow <= 9.37941e+06 )
						if( Negative_Money_Flow <= 821263 )
							if( Raw_Money_Flow <= 1.04843e+06 )
								if( Short_MA <= 186.562 )
									ret := 0.909091 // buy
								if( Short_MA > 186.562 )
									ret := 0.034819
							if( Raw_Money_Flow > 1.04843e+06 )
								if( Negative_Money_Flow_Sum <= 7.88456e+07 )
									ret := 0.764706 // buy
								if( Negative_Money_Flow_Sum > 7.88456e+07 )
									ret := 0.095238
						if( Negative_Money_Flow > 821263 )
							if( Positive_Money_Flow_Sum <= 7.31341e+06 )
								if( Negative_Money_Flow_Sum <= 2.5058e+08 )
									ret := 0.540856
								if( Negative_Money_Flow_Sum > 2.5058e+08 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 7.31341e+06 )
								if( Positive_Money_Flow_Sum <= 4.59654e+07 )
									ret := 0.095238
								if( Positive_Money_Flow_Sum > 4.59654e+07 )
									ret := 0.567568
					if( Positive_Money_Flow > 9.37941e+06 )
						if( Positive_Money_Flow_Sum <= 4.74594e+07 )
							if( Negative_Money_Flow_Sum <= 1.35061e+08 )
								ret := 0.333333
							if( Negative_Money_Flow_Sum > 1.35061e+08 )
								if( Positive_Money_Flow <= 1.756e+07 )
									ret := -0.580645
								if( Positive_Money_Flow > 1.756e+07 )
									ret := -0.863636 // sell
						if( Positive_Money_Flow_Sum > 4.74594e+07 )
							if( Raw_Money_Flow <= 2.02064e+07 )
								if( Short_Long_Diff <= -0.424343 )
									ret := 0.500000
								if( Short_Long_Diff > -0.424343 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.02064e+07 )
								if( Short_MA <= 188.866 )
									ret := 0.000000
								if( Short_MA > 188.866 )
									ret := -0.777778 // sell
				if( Money_Flow_Ratio > 0.229566 )
					if( Positive_Money_Flow_Sum <= 5.5893e+06 )
						if( Negative_Money_Flow <= 15260.8 )
							if( Negative_Money_Flow_Sum <= 4.07889e+06 )
								if( Money_Flow_Ratio <= 8.6138 )
									ret := -0.019785
								if( Money_Flow_Ratio > 8.6138 )
									ret := -0.474576
							if( Negative_Money_Flow_Sum > 4.07889e+06 )
								if( Positive_Money_Flow <= 1.42003e+06 )
									ret := 0.137405
								if( Positive_Money_Flow > 1.42003e+06 )
									ret := 0.596154
						if( Negative_Money_Flow > 15260.8 )
							if( Short_Long_Diff <= -0.502317 )
								if( MFI <= 29.3108 )
									ret := -0.200000
								if( MFI > 29.3108 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > -0.502317 )
								if( Negative_Money_Flow <= 482562 )
									ret := 0.119288
								if( Negative_Money_Flow > 482562 )
									ret := -0.001595
					if( Positive_Money_Flow_Sum > 5.5893e+06 )
						if( Positive_Money_Flow <= 7.07795e+06 )
							if( Positive_Money_Flow_Sum <= 3.64011e+08 )
								if( Raw_Money_Flow <= 1.37682e+07 )
									ret := -0.027945
								if( Raw_Money_Flow > 1.37682e+07 )
									ret := -0.102564
							if( Positive_Money_Flow_Sum > 3.64011e+08 )
								if( Negative_Money_Flow_Sum <= 1.62813e+08 )
									ret := -0.125000
								if( Negative_Money_Flow_Sum > 1.62813e+08 )
									ret := 0.375000
						if( Positive_Money_Flow > 7.07795e+06 )
							if( Positive_Money_Flow_Sum <= 1.81916e+08 )
								if( Money_Flow_Ratio <= 11.0316 )
									ret := 0.080633
								if( Money_Flow_Ratio > 11.0316 )
									ret := -0.675676
							if( Positive_Money_Flow_Sum > 1.81916e+08 )
								if( MFI_High <= -26.7985 )
									ret := -0.552326
								if( MFI_High > -26.7985 )
									ret := 0.036424
			if( Negative_Money_Flow_Sum > 3.20873e+08 )
				if( Positive_Money_Flow_Sum <= 9.29021e+07 )
					if( Negative_Money_Flow_Sum <= 3.32326e+08 )
						if( Short_MA <= 188.819 )
							if( MFI_High <= -58.9205 )
								ret := 1.000000 // buy
							if( MFI_High > -58.9205 )
								ret := 0.500000
						if( Short_MA > 188.819 )
							if( MFI_Low <= -2.97035 )
								if( Typical_Price <= 191.084 )
									ret := 0.250000
								if( Typical_Price > 191.084 )
									ret := 1.000000 // buy
							if( MFI_Low > -2.97035 )
								if( Short_MA <= 190.026 )
									ret := -0.666667
								if( Short_MA > 190.026 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.32326e+08 )
						if( Raw_Money_Flow <= 4.2902e+07 )
							if( Typical_Price <= 192.184 )
								if( Short_Long_Diff <= -0.800977 )
									ret := 0.352941
								if( Short_Long_Diff > -0.800977 )
									ret := -0.467153
							if( Typical_Price > 192.184 )
								if( Money_Flow_Ratio <= 0.164866 )
									ret := 0.424242
								if( Money_Flow_Ratio > 0.164866 )
									ret := -0.476190
						if( Raw_Money_Flow > 4.2902e+07 )
							if( MFI_High <= -64.5291 )
								if( MFI <= 4.94145 )
									ret := 0.000000
								if( MFI > 4.94145 )
									ret := 0.484848
							if( MFI_High > -64.5291 )
								if( MFI <= 18.5333 )
									ret := -0.250000
								if( MFI > 18.5333 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 9.29021e+07 )
					if( Raw_Money_Flow <= 9.887e+06 )
						if( Short_Long_Diff <= 0.176905 )
							if( Typical_Price <= 186.712 )
								ret := 0.500000
							if( Typical_Price > 186.712 )
								if( Negative_Money_Flow_Sum <= 7.42583e+08 )
									ret := 0.260870
								if( Negative_Money_Flow_Sum > 7.42583e+08 )
									ret := -0.076923
						if( Short_Long_Diff > 0.176905 )
							if( Positive_Money_Flow <= 944.785 )
								ret := 0.000000
							if( Positive_Money_Flow > 944.785 )
								if( MFI_Low <= 4.33459 )
									ret := -0.909091 // sell
								if( MFI_Low > 4.33459 )
									ret := -0.500000
					if( Raw_Money_Flow > 9.887e+06 )
						if( MFI_Low <= 12.7024 )
							if( MFI_High <= -68.0746 )
								if( Negative_Money_Flow_Sum <= 1.8218e+09 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 1.8218e+09 )
									ret := 0.000000
							if( MFI_High > -68.0746 )
								if( Short_MA <= 198.125 )
									ret := 0.655786
								if( Short_MA > 198.125 )
									ret := -0.033333
						if( MFI_Low > 12.7024 )
							if( Positive_Money_Flow <= 3.19275e+07 )
								if( Raw_Money_Flow <= 2.11669e+07 )
									ret := 0.702128 // buy
								if( Raw_Money_Flow > 2.11669e+07 )
									ret := 0.038168
							if( Positive_Money_Flow > 3.19275e+07 )
								if( Short_MA <= 192.819 )
									ret := -0.666667
								if( Short_MA > 192.819 )
									ret := -0.130435
		if( Short_Long_Diff > 0.240222 )
			if( MFI_Low <= 65.6187 )
				if( MFI_Low <= 45.6562 )
					if( Raw_Money_Flow <= 1.14691e+07 )
						if( MFI_High <= -26.0002 )
							if( Typical_Price <= 186.884 )
								ret := 1.000000 // buy
							if( Typical_Price > 186.884 )
								if( Short_Long_Diff <= 0.530086 )
									ret := -0.095745
								if( Short_Long_Diff > 0.530086 )
									ret := 0.583333
						if( MFI_High > -26.0002 )
							if( Short_Long_Diff <= 0.261079 )
								if( Money_Flow_Ratio <= 1.35657 )
									ret := 0.833333 // buy
								if( Money_Flow_Ratio > 1.35657 )
									ret := -0.192308
							if( Short_Long_Diff > 0.261079 )
								if( Positive_Money_Flow_Sum <= 6.71088e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 6.71088e+06 )
									ret := 0.677419
					if( Raw_Money_Flow > 1.14691e+07 )
						if( Negative_Money_Flow <= 1.61001e+07 )
							if( Money_Flow_Ratio <= 1.35154 )
								if( MFI_High <= -42.0397 )
									ret := -0.047619
								if( MFI_High > -42.0397 )
									ret := -0.753846 // sell
							if( Money_Flow_Ratio > 1.35154 )
								if( Negative_Money_Flow_Sum <= 1.72027e+08 )
									ret := -0.361702
								if( Negative_Money_Flow_Sum > 1.72027e+08 )
									ret := 0.363636
						if( Negative_Money_Flow > 1.61001e+07 )
							if( MFI_High <= -27.2083 )
								if( MFI <= 42.9158 )
									ret := -0.090909
								if( MFI > 42.9158 )
									ret := -0.750000 // sell
							if( MFI_High > -27.2083 )
								if( Negative_Money_Flow <= 7.66225e+07 )
									ret := 0.258065
								if( Negative_Money_Flow > 7.66225e+07 )
									ret := -1.000000 // sell
				if( MFI_Low > 45.6562 )
					if( Positive_Money_Flow <= 4.21003e+07 )
						if( Negative_Money_Flow_Sum <= 1.00843e+08 )
							if( Positive_Money_Flow_Sum <= 2.52441e+08 )
								if( Positive_Money_Flow_Sum <= 1.91446e+08 )
									ret := -0.321138
								if( Positive_Money_Flow_Sum > 1.91446e+08 )
									ret := 0.036765
							if( Positive_Money_Flow_Sum > 2.52441e+08 )
								if( Short_Long_Diff <= 0.34308 )
									ret := -0.172414
								if( Short_Long_Diff > 0.34308 )
									ret := -0.810811 // sell
						if( Negative_Money_Flow_Sum > 1.00843e+08 )
							if( Positive_Money_Flow_Sum <= 3.76171e+08 )
								if( Negative_Money_Flow <= 2.32857e+07 )
									ret := -0.200000
								if( Negative_Money_Flow > 2.32857e+07 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 3.76171e+08 )
								if( MFI <= 67.1658 )
									ret := -0.812500 // sell
								if( MFI > 67.1658 )
									ret := 0.296296
					if( Positive_Money_Flow > 4.21003e+07 )
						if( Money_Flow_Ratio <= 5.73135 )
							if( MFI <= 69.7537 )
								if( Typical_Price <= 191.931 )
									ret := 1.000000 // buy
								if( Typical_Price > 191.931 )
									ret := -0.750000 // sell
							if( MFI > 69.7537 )
								if( Raw_Money_Flow <= 9.89413e+07 )
									ret := -0.846154 // sell
								if( Raw_Money_Flow > 9.89413e+07 )
									ret := -0.230769
						if( Money_Flow_Ratio > 5.73135 )
							ret := 1.000000 // buy
			if( MFI_Low > 65.6187 )
				if( Typical_Price <= 193.476 )
					if( Positive_Money_Flow_Sum <= 4.90782e+08 )
						if( Negative_Money_Flow_Sum <= 2.34604e+07 )
							if( Negative_Money_Flow <= 1.85111e+06 )
								if( Short_Long_Diff <= 0.390671 )
									ret := -0.226667
								if( Short_Long_Diff > 0.390671 )
									ret := -0.685714
							if( Negative_Money_Flow > 1.85111e+06 )
								if( Money_Flow_Ratio <= 22.0947 )
									ret := 0.000000
								if( Money_Flow_Ratio > 22.0947 )
									ret := 0.857143 // buy
						if( Negative_Money_Flow_Sum > 2.34604e+07 )
							if( Typical_Price <= 190.235 )
								if( Short_MA <= 187.361 )
									ret := 0.153846
								if( Short_MA > 187.361 )
									ret := 0.735294 // buy
							if( Typical_Price > 190.235 )
								if( Positive_Money_Flow_Sum <= 3.16499e+08 )
									ret := 0.529412
								if( Positive_Money_Flow_Sum > 3.16499e+08 )
									ret := -0.642857
					if( Positive_Money_Flow_Sum > 4.90782e+08 )
						if( MFI_Low <= 69.571 )
							ret := -0.166667
						if( MFI_Low > 69.571 )
							if( Negative_Money_Flow_Sum <= 3.18431e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 3.18431e+07 )
								ret := -1.000000 // sell
				if( Typical_Price > 193.476 )
					if( Positive_Money_Flow_Sum <= 1.02943e+09 )
						if( Long_MA <= 198.785 )
							if( Raw_Money_Flow <= 1.40546e+07 )
								ret := -0.166667
							if( Raw_Money_Flow > 1.40546e+07 )
								if( Negative_Money_Flow_Sum <= 3.44562e+07 )
									ret := 0.850000 // buy
								if( Negative_Money_Flow_Sum > 3.44562e+07 )
									ret := 0.291667
						if( Long_MA > 198.785 )
							if( MFI <= 94.7596 )
								ret := -0.250000
							if( MFI > 94.7596 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.02943e+09 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_AMZN_1Min_7a2423c0(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


