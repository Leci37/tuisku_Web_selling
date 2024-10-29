//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: GOOG_15Min_2MM0_bb41217b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_15Min_2MM0_bb41217b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_15Min_bb41217b(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 49.4627 )
		if( Money_Flow_Ratio <= 23.8028 )
			if( Raw_Money_Flow <= 9.20604e+06 )
				if( MFI_Low <= 55.9195 )
					if( Negative_Money_Flow_Sum <= 655311 )
						if( Positive_Money_Flow_Sum <= 1.0328e+06 )
							if( Raw_Money_Flow <= 79015 )
								ret := 0.000000
							if( Raw_Money_Flow > 79015 )
								ret := 0.333333
						if( Positive_Money_Flow_Sum > 1.0328e+06 )
							if( Long_MA <= 132.29 )
								if( Typical_Price <= 120.927 )
									ret := 0.684211
								if( Typical_Price > 120.927 )
									ret := 1.000000 // buy
							if( Long_MA > 132.29 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 655311 )
						if( Positive_Money_Flow_Sum <= 4.63489e+08 )
							if( Negative_Money_Flow_Sum <= 1.51027e+06 )
								if( Negative_Money_Flow_Sum <= 788085 )
									ret := 0.191489
								if( Negative_Money_Flow_Sum > 788085 )
									ret := -0.138587
							if( Negative_Money_Flow_Sum > 1.51027e+06 )
								if( MFI <= 34.8637 )
									ret := -0.008788
								if( MFI > 34.8637 )
									ret := 0.089722
						if( Positive_Money_Flow_Sum > 4.63489e+08 )
							if( Short_Long_Diff <= -0.366967 )
								if( Short_Long_Diff <= -8.62503 )
									ret := 0.091954
								if( Short_Long_Diff > -8.62503 )
									ret := -0.224283
							if( Short_Long_Diff > -0.366967 )
								if( Typical_Price <= 2474.75 )
									ret := -0.050139
								if( Typical_Price > 2474.75 )
									ret := 0.238710
				if( MFI_Low > 55.9195 )
					if( Raw_Money_Flow <= 2.64922e+06 )
						if( Short_MA <= 97.0411 )
							if( Positive_Money_Flow <= 319750 )
								if( Positive_Money_Flow_Sum <= 3.14547e+06 )
									ret := -0.357143
								if( Positive_Money_Flow_Sum > 3.14547e+06 )
									ret := 0.041667
							if( Positive_Money_Flow > 319750 )
								if( Positive_Money_Flow_Sum <= 1.69453e+07 )
									ret := 0.560000
								if( Positive_Money_Flow_Sum > 1.69453e+07 )
									ret := 0.000000
						if( Short_MA > 97.0411 )
							if( Negative_Money_Flow_Sum <= 2.45197e+08 )
								if( Negative_Money_Flow_Sum <= 1.74482e+08 )
									ret := -0.077562
								if( Negative_Money_Flow_Sum > 1.74482e+08 )
									ret := 0.138810
							if( Negative_Money_Flow_Sum > 2.45197e+08 )
								if( Typical_Price <= 2860.06 )
									ret := -0.292063
								if( Typical_Price > 2860.06 )
									ret := 0.409091
					if( Raw_Money_Flow > 2.64922e+06 )
						if( Positive_Money_Flow_Sum <= 4.25979e+06 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.25979e+06 )
							if( Negative_Money_Flow_Sum <= 804441 )
								if( Money_Flow_Ratio <= 16.6506 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 16.6506 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 804441 )
								if( Typical_Price <= 100.08 )
									ret := 0.250000
								if( Typical_Price > 100.08 )
									ret := -0.288210
			if( Raw_Money_Flow > 9.20604e+06 )
				if( Positive_Money_Flow_Sum <= 9.98768e+07 )
					if( MFI <= 85.6654 )
						if( MFI_High <= -57.1208 )
							if( Raw_Money_Flow <= 6.83564e+07 )
								if( Negative_Money_Flow_Sum <= 1.09029e+09 )
									ret := 0.238806
								if( Negative_Money_Flow_Sum > 1.09029e+09 )
									ret := -0.666667
							if( Raw_Money_Flow > 6.83564e+07 )
								if( Short_MA <= 1043.33 )
									ret := -0.488372
								if( Short_MA > 1043.33 )
									ret := 0.032258
						if( MFI_High > -57.1208 )
							if( Short_Long_Diff <= 0.275749 )
								if( Raw_Money_Flow <= 4.73093e+07 )
									ret := 0.175325
								if( Raw_Money_Flow > 4.73093e+07 )
									ret := 0.800000 // buy
							if( Short_Long_Diff > 0.275749 )
								if( Typical_Price <= 1777.27 )
									ret := 0.684615
								if( Typical_Price > 1777.27 )
									ret := -0.600000
					if( MFI > 85.6654 )
						if( Money_Flow_Ratio <= 12.081 )
							if( Positive_Money_Flow <= 1.11948e+07 )
								ret := 0.333333
							if( Positive_Money_Flow > 1.11948e+07 )
								if( MFI_High <= 6.78398 )
									ret := -0.500000
								if( MFI_High > 6.78398 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 12.081 )
							if( Negative_Money_Flow_Sum <= 3.08009e+06 )
								if( Short_MA <= 900.217 )
									ret := 0.750000 // buy
								if( Short_MA > 900.217 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.08009e+06 )
								ret := 0.000000
				if( Positive_Money_Flow_Sum > 9.98768e+07 )
					if( MFI_Low <= 13.4949 )
						if( Positive_Money_Flow_Sum <= 2.95891e+08 )
							if( Raw_Money_Flow <= 1.37264e+08 )
								if( Negative_Money_Flow_Sum <= 1.26153e+09 )
									ret := 0.010020
								if( Negative_Money_Flow_Sum > 1.26153e+09 )
									ret := -0.281481
							if( Raw_Money_Flow > 1.37264e+08 )
								if( Money_Flow_Ratio <= 0.365434 )
									ret := 0.066176
								if( Money_Flow_Ratio > 0.365434 )
									ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 2.95891e+08 )
							if( Short_Long_Diff <= -32.5008 )
								if( Money_Flow_Ratio <= 0.326149 )
									ret := 0.777778 // buy
								if( Money_Flow_Ratio > 0.326149 )
									ret := 0.000000
							if( Short_Long_Diff > -32.5008 )
								if( Positive_Money_Flow_Sum <= 5.48463e+08 )
									ret := -0.083693
								if( Positive_Money_Flow_Sum > 5.48463e+08 )
									ret := -0.333333
					if( MFI_Low > 13.4949 )
						if( Money_Flow_Ratio <= 0.514595 )
							if( Positive_Money_Flow_Sum <= 2.2238e+08 )
								if( Raw_Money_Flow <= 2.2009e+07 )
									ret := -0.142857
								if( Raw_Money_Flow > 2.2009e+07 )
									ret := 0.582278
							if( Positive_Money_Flow_Sum > 2.2238e+08 )
								if( Typical_Price <= 2443.62 )
									ret := -0.040541
								if( Typical_Price > 2443.62 )
									ret := 0.636364
						if( Money_Flow_Ratio > 0.514595 )
							if( Short_Long_Diff <= -2.13189 )
								if( Positive_Money_Flow <= 6.63745e+08 )
									ret := -0.044897
								if( Positive_Money_Flow > 6.63745e+08 )
									ret := 0.515625
							if( Short_Long_Diff > -2.13189 )
								if( Positive_Money_Flow <= 2.62484e+08 )
									ret := 0.051054
								if( Positive_Money_Flow > 2.62484e+08 )
									ret := -0.055556
		if( Money_Flow_Ratio > 23.8028 )
			if( Positive_Money_Flow_Sum <= 6.82123e+08 )
				if( Money_Flow_Ratio <= 113.194 )
					if( Long_MA <= 92.9122 )
						if( Money_Flow_Ratio <= 26.2307 )
							ret := 0.000000
						if( Money_Flow_Ratio > 26.2307 )
							if( Positive_Money_Flow_Sum <= 3.8901e+08 )
								if( Negative_Money_Flow_Sum <= 4.26086e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.26086e+06 )
									ret := 0.857143 // buy
							if( Positive_Money_Flow_Sum > 3.8901e+08 )
								ret := 0.500000
					if( Long_MA > 92.9122 )
						if( Negative_Money_Flow_Sum <= 8.22939e+06 )
							if( Typical_Price <= 425.116 )
								if( Raw_Money_Flow <= 1.75494e+08 )
									ret := -0.050847
								if( Raw_Money_Flow > 1.75494e+08 )
									ret := 0.230088
							if( Typical_Price > 425.116 )
								if( Positive_Money_Flow_Sum <= 2.23451e+08 )
									ret := 0.639640
								if( Positive_Money_Flow_Sum > 2.23451e+08 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 8.22939e+06 )
							if( Short_Long_Diff <= -0.93803 )
								if( Raw_Money_Flow <= 1.05643e+08 )
									ret := 0.466667
								if( Raw_Money_Flow > 1.05643e+08 )
									ret := -0.376344
							if( Short_Long_Diff > -0.93803 )
								if( MA_Cross <= 99.6844 )
									ret := 0.141748
								if( MA_Cross > 99.6844 )
									ret := -0.407407
				if( Money_Flow_Ratio > 113.194 )
					if( Negative_Money_Flow_Sum <= 1.74989e+06 )
						if( Positive_Money_Flow_Sum <= 1.98296e+07 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.98296e+07 )
							if( Raw_Money_Flow <= 9.45654e+07 )
								if( Short_Long_Diff <= -0.065802 )
									ret := 0.500000
								if( Short_Long_Diff > -0.065802 )
									ret := -0.070588
							if( Raw_Money_Flow > 9.45654e+07 )
								if( Negative_Money_Flow_Sum <= 1.51859e+06 )
									ret := 0.636364
								if( Negative_Money_Flow_Sum > 1.51859e+06 )
									ret := 0.200000
					if( Negative_Money_Flow_Sum > 1.74989e+06 )
						if( Short_MA <= 126.328 )
							if( Short_Long_Diff <= 0.532783 )
								if( Short_Long_Diff <= 0.28646 )
									ret := -0.210526
								if( Short_Long_Diff > 0.28646 )
									ret := 0.750000 // buy
							if( Short_Long_Diff > 0.532783 )
								ret := -1.000000 // sell
						if( Short_MA > 126.328 )
							if( Long_MA <= 1206.55 )
								if( MFI_High <= 19.134 )
									ret := 0.854545 // buy
								if( MFI_High > 19.134 )
									ret := 0.547945
							if( Long_MA > 1206.55 )
								if( Short_Long_Diff <= 5.75101 )
									ret := -0.120000
								if( Short_Long_Diff > 5.75101 )
									ret := 0.800000 // buy
			if( Positive_Money_Flow_Sum > 6.82123e+08 )
				if( Short_Long_Diff <= 5.451 )
					if( Money_Flow_Ratio <= 57.7036 )
						if( Positive_Money_Flow <= 2.27153e+08 )
							if( Money_Flow_Ratio <= 48.1179 )
								if( Money_Flow_Ratio <= 24.1158 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 24.1158 )
									ret := 0.048544
							if( Money_Flow_Ratio > 48.1179 )
								if( Positive_Money_Flow <= 8.19712e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 8.19712e+07 )
									ret := 0.809524 // buy
						if( Positive_Money_Flow > 2.27153e+08 )
							if( Long_MA <= 2447.4 )
								if( MFI_High <= 15.0309 )
									ret := 0.500000
								if( MFI_High > 15.0309 )
									ret := -0.634146
							if( Long_MA > 2447.4 )
								ret := 0.666667
					if( Money_Flow_Ratio > 57.7036 )
						if( MA_Cross <= 1402.08 )
							if( Negative_Money_Flow_Sum <= 2.86649e+06 )
								if( Raw_Money_Flow <= 7.68183e+07 )
									ret := 0.014286
								if( Raw_Money_Flow > 7.68183e+07 )
									ret := -0.407407
							if( Negative_Money_Flow_Sum > 2.86649e+06 )
								if( Raw_Money_Flow <= 3.18367e+08 )
									ret := -0.381988
								if( Raw_Money_Flow > 3.18367e+08 )
									ret := 0.185185
						if( MA_Cross > 1402.08 )
							ret := 1.000000 // buy
				if( Short_Long_Diff > 5.451 )
					if( Positive_Money_Flow <= 1.23212e+08 )
						if( Short_Long_Diff <= 38.8819 )
							if( Raw_Money_Flow <= 1.15734e+08 )
								if( Raw_Money_Flow <= 5.31331e+07 )
									ret := -0.095588
								if( Raw_Money_Flow > 5.31331e+07 )
									ret := 0.303030
							if( Raw_Money_Flow > 1.15734e+08 )
								if( Positive_Money_Flow_Sum <= 1.13335e+09 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.13335e+09 )
									ret := -1.000000 // sell
						if( Short_Long_Diff > 38.8819 )
							if( Negative_Money_Flow_Sum <= 6.1736e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 6.1736e+07 )
								ret := 0.500000
					if( Positive_Money_Flow > 1.23212e+08 )
						if( Typical_Price <= 2434.65 )
							if( Short_MA <= 1164.52 )
								if( Long_MA <= 929.197 )
									ret := 1.000000 // buy
								if( Long_MA > 929.197 )
									ret := -0.187500
							if( Short_MA > 1164.52 )
								if( Money_Flow_Ratio <= 62.8674 )
									ret := 0.083333
								if( Money_Flow_Ratio > 62.8674 )
									ret := 0.761905 // buy
						if( Typical_Price > 2434.65 )
							if( Money_Flow_Ratio <= 142.546 )
								if( Positive_Money_Flow_Sum <= 1.40557e+09 )
									ret := -0.941176 // sell
								if( Positive_Money_Flow_Sum > 1.40557e+09 )
									ret := 0.000000
							if( Money_Flow_Ratio > 142.546 )
								if( Negative_Money_Flow_Sum <= 3.02788e+06 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 3.02788e+06 )
									ret := 0.604651
	if( Negative_Money_Flow > 49.4627 )
		if( Negative_Money_Flow <= 8.30372e+06 )
			if( Positive_Money_Flow_Sum <= 1.29693e+09 )
				if( Short_MA <= 148.002 )
					if( Negative_Money_Flow_Sum <= 1.12168e+06 )
						if( MFI <= 41.7634 )
							if( Long_MA <= 119.033 )
								if( Raw_Money_Flow <= 46023.2 )
									ret := 0.500000
								if( Raw_Money_Flow > 46023.2 )
									ret := 0.934783 // buy
							if( Long_MA > 119.033 )
								if( Raw_Money_Flow <= 159021 )
									ret := -0.125000
								if( Raw_Money_Flow > 159021 )
									ret := 0.800000 // buy
						if( MFI > 41.7634 )
							if( Raw_Money_Flow <= 66096.1 )
								if( Positive_Money_Flow <= 2150.09 )
									ret := 0.267442
								if( Positive_Money_Flow > 2150.09 )
									ret := 0.875000 // buy
							if( Raw_Money_Flow > 66096.1 )
								if( Positive_Money_Flow_Sum <= 964875 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 964875 )
									ret := 0.132296
					if( Negative_Money_Flow_Sum > 1.12168e+06 )
						if( Negative_Money_Flow <= 5.89368e+06 )
							if( Negative_Money_Flow_Sum <= 1.19235e+06 )
								if( Positive_Money_Flow_Sum <= 1.69773e+06 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 1.69773e+06 )
									ret := -0.562500
							if( Negative_Money_Flow_Sum > 1.19235e+06 )
								if( Negative_Money_Flow_Sum <= 1.21415e+06 )
									ret := 0.566667
								if( Negative_Money_Flow_Sum > 1.21415e+06 )
									ret := 0.060950
						if( Negative_Money_Flow > 5.89368e+06 )
							if( Positive_Money_Flow_Sum <= 9.3073e+06 )
								if( Negative_Money_Flow_Sum <= 1.29248e+07 )
									ret := 0.325000
								if( Negative_Money_Flow_Sum > 1.29248e+07 )
									ret := 0.739130 // buy
							if( Positive_Money_Flow_Sum > 9.3073e+06 )
								if( MFI <= 51.9605 )
									ret := -0.282051
								if( MFI > 51.9605 )
									ret := 0.529412
				if( Short_MA > 148.002 )
					if( Money_Flow_Ratio <= 0.895462 )
						if( Negative_Money_Flow_Sum <= 9.2316e+06 )
							if( Positive_Money_Flow_Sum <= 3.56651e+06 )
								if( Negative_Money_Flow <= 17586.1 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 17586.1 )
									ret := 0.241852
							if( Positive_Money_Flow_Sum > 3.56651e+06 )
								if( MFI <= 42.9149 )
									ret := 0.673684
								if( MFI > 42.9149 )
									ret := 0.296296
						if( Negative_Money_Flow_Sum > 9.2316e+06 )
							if( Short_MA <= 2064.13 )
								if( Long_MA <= 287.674 )
									ret := 0.056338
								if( Long_MA > 287.674 )
									ret := 0.240146
							if( Short_MA > 2064.13 )
								if( Money_Flow_Ratio <= 0.171521 )
									ret := 0.226640
								if( Money_Flow_Ratio > 0.171521 )
									ret := -0.036932
					if( Money_Flow_Ratio > 0.895462 )
						if( Typical_Price <= 1530.86 )
							if( MA_Cross <= 19.8654 )
								if( Positive_Money_Flow_Sum <= 9.65054e+08 )
									ret := 0.113819
								if( Positive_Money_Flow_Sum > 9.65054e+08 )
									ret := 0.451796
							if( MA_Cross > 19.8654 )
								if( Positive_Money_Flow_Sum <= 1.00277e+09 )
									ret := -0.272222
								if( Positive_Money_Flow_Sum > 1.00277e+09 )
									ret := 0.772727 // buy
						if( Typical_Price > 1530.86 )
							if( MFI_Low <= 40.1538 )
								if( Raw_Money_Flow <= 617690 )
									ret := -0.111111
								if( Raw_Money_Flow > 617690 )
									ret := 0.333333
							if( MFI_Low > 40.1538 )
								if( Positive_Money_Flow_Sum <= 1.92494e+08 )
									ret := -0.476636
								if( Positive_Money_Flow_Sum > 1.92494e+08 )
									ret := -0.006329
			if( Positive_Money_Flow_Sum > 1.29693e+09 )
				if( Short_Long_Diff <= 23.1036 )
					if( MFI <= 81.5762 )
						if( Positive_Money_Flow_Sum <= 2.13462e+09 )
							if( Short_MA <= 1392.65 )
								if( Long_MA <= 1097.86 )
									ret := 0.222222
								if( Long_MA > 1097.86 )
									ret := -0.511111
							if( Short_MA > 1392.65 )
								if( Positive_Money_Flow_Sum <= 1.35399e+09 )
									ret := -0.516129
								if( Positive_Money_Flow_Sum > 1.35399e+09 )
									ret := 0.417989
						if( Positive_Money_Flow_Sum > 2.13462e+09 )
							if( Negative_Money_Flow <= 1.46523e+06 )
								if( Long_MA <= 1640.42 )
									ret := -0.750000 // sell
								if( Long_MA > 1640.42 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.46523e+06 )
								if( Short_Long_Diff <= -1.66526 )
									ret := -0.750000 // sell
								if( Short_Long_Diff > -1.66526 )
									ret := 0.250000
					if( MFI > 81.5762 )
						if( Negative_Money_Flow_Sum <= 2.30909e+08 )
							if( Short_MA <= 2825.75 )
								if( Short_Long_Diff <= 4.53848 )
									ret := 0.263158
								if( Short_Long_Diff > 4.53848 )
									ret := -0.028926
							if( Short_MA > 2825.75 )
								if( Positive_Money_Flow_Sum <= 1.61389e+09 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.61389e+09 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.30909e+08 )
							if( Short_Long_Diff <= 3.97909 )
								if( Negative_Money_Flow_Sum <= 4.34454e+08 )
									ret := -0.037037
								if( Negative_Money_Flow_Sum > 4.34454e+08 )
									ret := -0.565217
							if( Short_Long_Diff > 3.97909 )
								if( Long_MA <= 1871.62 )
									ret := -0.906977 // sell
								if( Long_MA > 1871.62 )
									ret := -0.366667
				if( Short_Long_Diff > 23.1036 )
					if( Typical_Price <= 2603.54 )
						if( Negative_Money_Flow <= 285354 )
							ret := -0.500000
						if( Negative_Money_Flow > 285354 )
							if( Positive_Money_Flow_Sum <= 1.56513e+09 )
								ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 1.56513e+09 )
								ret := -1.000000 // sell
					if( Typical_Price > 2603.54 )
						if( Raw_Money_Flow <= 6.00678e+06 )
							if( MFI <= 85.3548 )
								ret := -0.250000
							if( MFI > 85.3548 )
								ret := 0.000000
						if( Raw_Money_Flow > 6.00678e+06 )
							ret := 0.500000
		if( Negative_Money_Flow > 8.30372e+06 )
			if( Positive_Money_Flow_Sum <= 2.67421e+07 )
				if( Long_MA <= 974.503 )
					if( Positive_Money_Flow_Sum <= 4.50495e+06 )
						if( Short_Long_Diff <= -0.183816 )
							if( Raw_Money_Flow <= 1.20521e+08 )
								if( Negative_Money_Flow_Sum <= 6.28675e+08 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 6.28675e+08 )
									ret := 0.500000
							if( Raw_Money_Flow > 1.20521e+08 )
								if( Long_MA <= 435.127 )
									ret := -0.315789
								if( Long_MA > 435.127 )
									ret := 0.875000 // buy
						if( Short_Long_Diff > -0.183816 )
							if( Negative_Money_Flow <= 1.76309e+08 )
								if( Negative_Money_Flow <= 9.83455e+06 )
									ret := -0.520000
								if( Negative_Money_Flow > 9.83455e+06 )
									ret := 0.161905
							if( Negative_Money_Flow > 1.76309e+08 )
								if( Raw_Money_Flow <= 2.23458e+08 )
									ret := -0.952381 // sell
								if( Raw_Money_Flow > 2.23458e+08 )
									ret := -0.166667
					if( Positive_Money_Flow_Sum > 4.50495e+06 )
						if( Negative_Money_Flow_Sum <= 2.35047e+08 )
							if( MFI_Low <= -12.7724 )
								if( Positive_Money_Flow_Sum <= 1.05312e+07 )
									ret := 0.418182
								if( Positive_Money_Flow_Sum > 1.05312e+07 )
									ret := 0.820513 // buy
							if( MFI_Low > -12.7724 )
								if( Negative_Money_Flow <= 1.43179e+07 )
									ret := 0.225941
								if( Negative_Money_Flow > 1.43179e+07 )
									ret := -0.146341
						if( Negative_Money_Flow_Sum > 2.35047e+08 )
							if( Negative_Money_Flow_Sum <= 6.97617e+08 )
								if( Typical_Price <= 137.395 )
									ret := -0.233503
								if( Typical_Price > 137.395 )
									ret := 0.028409
							if( Negative_Money_Flow_Sum > 6.97617e+08 )
								if( Typical_Price <= 94.4374 )
									ret := -0.500000
								if( Typical_Price > 94.4374 )
									ret := 0.367925
				if( Long_MA > 974.503 )
					if( Long_MA <= 2665.11 )
						if( Money_Flow_Ratio <= 0.020482 )
							if( MFI <= 0.299097 )
								if( Raw_Money_Flow <= 3.00785e+08 )
									ret := -0.219512
								if( Raw_Money_Flow > 3.00785e+08 )
									ret := 1.000000 // buy
							if( MFI > 0.299097 )
								if( Short_Long_Diff <= -2.3291 )
									ret := 0.378261
								if( Short_Long_Diff > -2.3291 )
									ret := 0.586207
						if( Money_Flow_Ratio > 0.020482 )
							if( Raw_Money_Flow <= 1.80943e+08 )
								if( Positive_Money_Flow_Sum <= 3.74035e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 3.74035e+06 )
									ret := 0.366834
							if( Raw_Money_Flow > 1.80943e+08 )
								if( Money_Flow_Ratio <= 0.027402 )
									ret := -0.600000
								if( Money_Flow_Ratio > 0.027402 )
									ret := 0.175258
					if( Long_MA > 2665.11 )
						if( Negative_Money_Flow_Sum <= 3.62294e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.62294e+08 )
							if( Raw_Money_Flow <= 3.59343e+08 )
								if( Negative_Money_Flow <= 3.10985e+08 )
									ret := -0.277778
								if( Negative_Money_Flow > 3.10985e+08 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 3.59343e+08 )
								if( MFI_Low <= -18.9026 )
									ret := -0.500000
								if( MFI_Low > -18.9026 )
									ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 2.67421e+07 )
				if( Negative_Money_Flow_Sum <= 4.46136e+08 )
					if( Negative_Money_Flow_Sum <= 3.30852e+08 )
						if( Negative_Money_Flow <= 4.0011e+07 )
							if( MFI_High <= 13.1838 )
								if( Negative_Money_Flow_Sum <= 5.13517e+07 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 5.13517e+07 )
									ret := -0.029234
							if( MFI_High > 13.1838 )
								if( Typical_Price <= 1668.42 )
									ret := 0.285714
								if( Typical_Price > 1668.42 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 4.0011e+07 )
							if( Negative_Money_Flow_Sum <= 6.64996e+07 )
								if( Positive_Money_Flow_Sum <= 3.29725e+08 )
									ret := 0.745455 // buy
								if( Positive_Money_Flow_Sum > 3.29725e+08 )
									ret := 0.189189
							if( Negative_Money_Flow_Sum > 6.64996e+07 )
								if( Positive_Money_Flow_Sum <= 1.83079e+08 )
									ret := 0.215886
								if( Positive_Money_Flow_Sum > 1.83079e+08 )
									ret := 0.031441
					if( Negative_Money_Flow_Sum > 3.30852e+08 )
						if( MA_Cross <= 208.445 )
							if( Negative_Money_Flow <= 1.12089e+08 )
								if( MFI_High <= -15.3606 )
									ret := 0.097065
								if( MFI_High > -15.3606 )
									ret := -0.073477
							if( Negative_Money_Flow > 1.12089e+08 )
								if( Negative_Money_Flow_Sum <= 3.53633e+08 )
									ret := -0.038462
								if( Negative_Money_Flow_Sum > 3.53633e+08 )
									ret := 0.284211
						if( MA_Cross > 208.445 )
							if( Negative_Money_Flow_Sum <= 3.83743e+08 )
								if( Raw_Money_Flow <= 3.3176e+07 )
									ret := 0.615385
								if( Raw_Money_Flow > 3.3176e+07 )
									ret := 0.090909
							if( Negative_Money_Flow_Sum > 3.83743e+08 )
								if( Positive_Money_Flow_Sum <= 3.38452e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.38452e+08 )
									ret := 0.932203 // buy
				if( Negative_Money_Flow_Sum > 4.46136e+08 )
					if( Short_Long_Diff <= -35.023 )
						if( Short_Long_Diff <= -39.6731 )
							if( MFI <= 29.132 )
								ret := 1.000000 // buy
							if( MFI > 29.132 )
								ret := 0.600000
						if( Short_Long_Diff > -39.6731 )
							if( Positive_Money_Flow_Sum <= 2.80947e+08 )
								if( MFI <= 9.4895 )
									ret := 0.750000 // buy
								if( MFI > 9.4895 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.80947e+08 )
								if( Raw_Money_Flow <= 9.49444e+07 )
									ret := 0.600000
								if( Raw_Money_Flow > 9.49444e+07 )
									ret := 0.000000
					if( Short_Long_Diff > -35.023 )
						if( MA_Cross <= 2.54219 )
							if( MFI <= 74.0851 )
								if( Positive_Money_Flow_Sum <= 4.09864e+08 )
									ret := -0.029161
								if( Positive_Money_Flow_Sum > 4.09864e+08 )
									ret := 0.036124
							if( MFI > 74.0851 )
								if( Short_Long_Diff <= 3.59661 )
									ret := 0.073529
								if( Short_Long_Diff > 3.59661 )
									ret := -0.571429
						if( MA_Cross > 2.54219 )
							if( MA_Cross <= 68.7058 )
								ret := -1.000000 // sell
							if( MA_Cross > 68.7058 )
								if( Negative_Money_Flow <= 5.92293e+07 )
									ret := 0.154762
								if( Negative_Money_Flow > 5.92293e+07 )
									ret := -0.320930
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GOOG_15Min_bb41217b(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


