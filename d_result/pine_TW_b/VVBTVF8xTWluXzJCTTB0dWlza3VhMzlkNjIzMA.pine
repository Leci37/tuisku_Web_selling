//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: UPST_1Min_2BM0_a39d6230 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2BM0_a39d6230", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_a39d6230(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( Raw_Money_Flow <= 43246 )
			if( bearPower <= -0.042999 )
				if( Typical_Price <= 37.2985 )
					if( Raw_Money_Flow <= 8985.66 )
						if( Raw_Money_Flow <= 4118.49 )
							if( Money_Flow_Ratio <= 0.257907 )
								if( Raw_Money_Flow <= 3488.18 )
									ret := 0.954545 // buy
								if( Raw_Money_Flow > 3488.18 )
									ret := 0.500000
							if( Money_Flow_Ratio > 0.257907 )
								if( Positive_Money_Flow_Sum <= 141984 )
									ret := -0.097087
								if( Positive_Money_Flow_Sum > 141984 )
									ret := 0.621622
						if( Raw_Money_Flow > 4118.49 )
							if( Positive_Money_Flow <= 5952.76 )
								if( Typical_Price <= 23.0613 )
									ret := 0.195652
								if( Typical_Price > 23.0613 )
									ret := 0.711155 // buy
							if( Positive_Money_Flow > 5952.76 )
								if( Typical_Price <= 27.5918 )
									ret := -0.128205
								if( Typical_Price > 27.5918 )
									ret := 0.592593
					if( Raw_Money_Flow > 8985.66 )
						if( MFI_Low <= 3.02126 )
							if( bbm <= 0.020331 )
								if( bullPower <= -0.260428 )
									ret := 0.923077 // buy
								if( bullPower > -0.260428 )
									ret := 0.321839
							if( bbm > 0.020331 )
								if( Negative_Money_Flow <= 822.332 )
									ret := 0.344828
								if( Negative_Money_Flow > 822.332 )
									ret := 0.770701 // buy
						if( MFI_Low > 3.02126 )
							if( bullPower <= -0.197297 )
								if( Typical_Price <= 24.3703 )
									ret := -0.888889 // sell
								if( Typical_Price > 24.3703 )
									ret := 0.106383
							if( bullPower > -0.197297 )
								if( Money_Flow_Ratio <= 0.431755 )
									ret := -0.009146
								if( Money_Flow_Ratio > 0.431755 )
									ret := 0.344045
				if( Typical_Price > 37.2985 )
					if( Negative_Money_Flow_Sum <= 247792 )
						if( Negative_Money_Flow_Sum <= 116340 )
							if( bbp <= -0.126871 )
								if( Negative_Money_Flow_Sum <= 98229.8 )
									ret := -0.178571
								if( Negative_Money_Flow_Sum > 98229.8 )
									ret := 0.400000
							if( bbp > -0.126871 )
								if( Raw_Money_Flow <= 20096.6 )
									ret := 0.666667
								if( Raw_Money_Flow > 20096.6 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 116340 )
							if( bearPower <= -0.118616 )
								if( Negative_Money_Flow <= 7027.97 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow > 7027.97 )
									ret := -0.322581
							if( bearPower > -0.118616 )
								if( Negative_Money_Flow_Sum <= 126187 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 126187 )
									ret := -0.049724
					if( Negative_Money_Flow_Sum > 247792 )
						if( bullPower <= -0.105246 )
							if( Raw_Money_Flow <= 6415.26 )
								if( Typical_Price <= 40.045 )
									ret := 1.000000 // buy
								if( Typical_Price > 40.045 )
									ret := 0.818182 // buy
							if( Raw_Money_Flow > 6415.26 )
								if( Negative_Money_Flow_Sum <= 298370 )
									ret := -0.150000
								if( Negative_Money_Flow_Sum > 298370 )
									ret := 0.549451
						if( bullPower > -0.105246 )
							if( bbp <= -0.207153 )
								ret := -0.705882 // sell
							if( bbp > -0.207153 )
								if( bbp <= -0.080805 )
									ret := 0.149798
								if( bbp > -0.080805 )
									ret := -0.312500
			if( bearPower > -0.042999 )
				if( Negative_Money_Flow <= 143.789 )
					if( bearPower <= 0.014464 )
						if( bbp <= 0.102929 )
							if( bbm <= 0.066302 )
								if( Raw_Money_Flow <= 11640.3 )
									ret := -0.034483
								if( Raw_Money_Flow > 11640.3 )
									ret := 0.112319
							if( bbm > 0.066302 )
								if( Positive_Money_Flow_Sum <= 402439 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow_Sum > 402439 )
									ret := -0.444444
						if( bbp > 0.102929 )
							ret := 0.875000 // buy
					if( bearPower > 0.014464 )
						if( Negative_Money_Flow_Sum <= 46236 )
							if( MFI_High <= 0.01145 )
								ret := 0.333333
							if( MFI_High > 0.01145 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 46236 )
							if( Positive_Money_Flow_Sum <= 155708 )
								if( bullPower <= 0.031087 )
									ret := -0.375000
								if( bullPower > 0.031087 )
									ret := -0.797753 // sell
							if( Positive_Money_Flow_Sum > 155708 )
								if( Typical_Price <= 33.0244 )
									ret := -0.339450
								if( Typical_Price > 33.0244 )
									ret := 0.407407
				if( Negative_Money_Flow > 143.789 )
					if( bearPower <= 0.042017 )
						if( Negative_Money_Flow_Sum <= 308641 )
							if( Money_Flow_Ratio <= 0.105174 )
								ret := -0.857143 // sell
							if( Money_Flow_Ratio > 0.105174 )
								if( Positive_Money_Flow <= 6423.52 )
									ret := 0.247803
								if( Positive_Money_Flow > 6423.52 )
									ret := 0.777778 // buy
						if( Negative_Money_Flow_Sum > 308641 )
							if( bearPower <= 0.034401 )
								if( bbp <= 0.060307 )
									ret := 0.097696
								if( bbp > 0.060307 )
									ret := 0.826087 // buy
							if( bearPower > 0.034401 )
								ret := -0.857143 // sell
					if( bearPower > 0.042017 )
						if( Money_Flow_Ratio <= 0.465159 )
							if( Raw_Money_Flow <= 14575.3 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 14575.3 )
								ret := -0.600000
						if( Money_Flow_Ratio > 0.465159 )
							if( Negative_Money_Flow_Sum <= 215954 )
								if( Positive_Money_Flow_Sum <= 195834 )
									ret := 0.035714
								if( Positive_Money_Flow_Sum > 195834 )
									ret := 0.611111
							if( Negative_Money_Flow_Sum > 215954 )
								if( Positive_Money_Flow_Sum <= 490848 )
									ret := -0.655172
								if( Positive_Money_Flow_Sum > 490848 )
									ret := 0.294118
		if( Raw_Money_Flow > 43246 )
			if( bbm <= 0.293564 )
				if( Negative_Money_Flow_Sum <= 2.98971e+07 )
					if( Negative_Money_Flow <= 3.24121e+06 )
						if( Negative_Money_Flow_Sum <= 1.36306e+07 )
							if( Positive_Money_Flow_Sum <= 4.96581e+06 )
								if( Raw_Money_Flow <= 455286 )
									ret := 0.047003
								if( Raw_Money_Flow > 455286 )
									ret := -0.056873
							if( Positive_Money_Flow_Sum > 4.96581e+06 )
								if( Positive_Money_Flow_Sum <= 1.97645e+07 )
									ret := 0.182168
								if( Positive_Money_Flow_Sum > 1.97645e+07 )
									ret := -0.660714
						if( Negative_Money_Flow_Sum > 1.36306e+07 )
							if( bbp <= -0.744818 )
								if( Negative_Money_Flow_Sum <= 1.40708e+07 )
									ret := -0.428571
								if( Negative_Money_Flow_Sum > 1.40708e+07 )
									ret := 0.701031 // buy
							if( bbp > -0.744818 )
								if( Raw_Money_Flow <= 313858 )
									ret := 0.320513
								if( Raw_Money_Flow > 313858 )
									ret := -0.237217
					if( Negative_Money_Flow > 3.24121e+06 )
						if( Money_Flow_Ratio <= 0.180615 )
							if( Negative_Money_Flow_Sum <= 9.01819e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 9.01819e+06 )
								ret := -0.541667
						if( Money_Flow_Ratio > 0.180615 )
							if( Money_Flow_Ratio <= 0.525878 )
								if( bearPower <= -0.127207 )
									ret := 0.921053 // buy
								if( bearPower > -0.127207 )
									ret := 0.615385
							if( Money_Flow_Ratio > 0.525878 )
								if( bullPower <= 0.038173 )
									ret := 0.066667
								if( bullPower > 0.038173 )
									ret := 0.928571 // buy
				if( Negative_Money_Flow_Sum > 2.98971e+07 )
					if( Money_Flow_Ratio <= 1.00244 )
						if( Negative_Money_Flow <= 2.40205e+06 )
							if( Positive_Money_Flow_Sum <= 2.48184e+07 )
								if( bullPower <= 0.018787 )
									ret := 0.510638
								if( bullPower > 0.018787 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.48184e+07 )
								if( MFI <= 41.7652 )
									ret := -1.000000 // sell
								if( MFI > 41.7652 )
									ret := 0.066667
						if( Negative_Money_Flow > 2.40205e+06 )
							if( bbp <= -0.663445 )
								ret := 0.473684
							if( bbp > -0.663445 )
								if( bearPower <= -0.226019 )
									ret := 0.986301 // buy
								if( bearPower > -0.226019 )
									ret := 0.666667
					if( Money_Flow_Ratio > 1.00244 )
						if( Negative_Money_Flow_Sum <= 3.75146e+07 )
							ret := -0.333333
						if( Negative_Money_Flow_Sum > 3.75146e+07 )
							ret := -1.000000 // sell
			if( bbm > 0.293564 )
				if( bearPower <= -0.020786 )
					if( Typical_Price <= 33.2223 )
						if( bbm <= 0.453255 )
							if( bbm <= 0.42772 )
								if( Money_Flow_Ratio <= 0.08295 )
									ret := -0.400000
								if( Money_Flow_Ratio > 0.08295 )
									ret := 0.524444
							if( bbm > 0.42772 )
								ret := -0.318182
						if( bbm > 0.453255 )
							if( Positive_Money_Flow_Sum <= 427043 )
								if( MFI_High <= -43.9342 )
									ret := 0.659091
								if( MFI_High > -43.9342 )
									ret := -0.230769
							if( Positive_Money_Flow_Sum > 427043 )
								if( Raw_Money_Flow <= 2.14063e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.14063e+06 )
									ret := 0.861111 // buy
					if( Typical_Price > 33.2223 )
						if( Positive_Money_Flow <= 3.33788e+06 )
							if( MFI_High <= -71.2698 )
								if( bearPower <= -0.622349 )
									ret := 0.166667
								if( bearPower > -0.622349 )
									ret := -0.576923
							if( MFI_High > -71.2698 )
								if( Typical_Price <= 52.6916 )
									ret := 0.347349
								if( Typical_Price > 52.6916 )
									ret := -0.388889
						if( Positive_Money_Flow > 3.33788e+06 )
							if( Raw_Money_Flow <= 3.8334e+06 )
								ret := -0.904762 // sell
							if( Raw_Money_Flow > 3.8334e+06 )
								ret := 0.416667
				if( bearPower > -0.020786 )
					if( Raw_Money_Flow <= 3.05098e+06 )
						if( Raw_Money_Flow <= 1.22518e+06 )
							ret := -0.466667
						if( Raw_Money_Flow > 1.22518e+06 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 3.05098e+06 )
						ret := -1.000000 // sell
	if( BBPower_Color > 0.5 )
		if( Negative_Money_Flow_Sum <= 334771 )
			if( bullPower <= 0.089858 )
				if( bbp <= 0.107108 )
					if( Negative_Money_Flow_Sum <= 25122.8 )
						if( Positive_Money_Flow_Sum <= 111046 )
							if( Positive_Money_Flow <= 6284.04 )
								if( Typical_Price <= 23.04 )
									ret := 0.214286
								if( Typical_Price > 23.04 )
									ret := 0.000000
							if( Positive_Money_Flow > 6284.04 )
								ret := 0.962963 // buy
						if( Positive_Money_Flow_Sum > 111046 )
							if( Typical_Price <= 26.9967 )
								if( bbp <= 0.066891 )
									ret := 0.000000
								if( bbp > 0.066891 )
									ret := -0.250000
							if( Typical_Price > 26.9967 )
								ret := 0.333333
					if( Negative_Money_Flow_Sum > 25122.8 )
						if( Raw_Money_Flow <= 4207.18 )
							if( Negative_Money_Flow_Sum <= 96241.3 )
								if( Positive_Money_Flow_Sum <= 188712 )
									ret := 0.055556
								if( Positive_Money_Flow_Sum > 188712 )
									ret := -0.296875
							if( Negative_Money_Flow_Sum > 96241.3 )
								if( Typical_Price <= 34.1595 )
									ret := -0.404494
								if( Typical_Price > 34.1595 )
									ret := 0.071429
						if( Raw_Money_Flow > 4207.18 )
							if( bbm <= 0.134629 )
								if( Negative_Money_Flow <= 9161.06 )
									ret := -0.035521
								if( Negative_Money_Flow > 9161.06 )
									ret := 0.057001
							if( bbm > 0.134629 )
								ret := 0.800000 // buy
				if( bbp > 0.107108 )
					if( Money_Flow_Ratio <= 1.20293 )
						if( Positive_Money_Flow_Sum <= 37661.8 )
							ret := 0.666667
						if( Positive_Money_Flow_Sum > 37661.8 )
							if( Positive_Money_Flow_Sum <= 286368 )
								if( Positive_Money_Flow_Sum <= 175216 )
									ret := -0.435484
								if( Positive_Money_Flow_Sum > 175216 )
									ret := 0.037736
							if( Positive_Money_Flow_Sum > 286368 )
								ret := -0.900000 // sell
					if( Money_Flow_Ratio > 1.20293 )
						if( Positive_Money_Flow_Sum <= 158249 )
							if( Positive_Money_Flow_Sum <= 110099 )
								if( Positive_Money_Flow <= 10684.3 )
									ret := -0.545455
								if( Positive_Money_Flow > 10684.3 )
									ret := 0.238095
							if( Positive_Money_Flow_Sum > 110099 )
								if( Raw_Money_Flow <= 10759.4 )
									ret := 0.683333
								if( Raw_Money_Flow > 10759.4 )
									ret := 0.125000
						if( Positive_Money_Flow_Sum > 158249 )
							if( bbm <= 0.007052 )
								if( Typical_Price <= 37.9308 )
									ret := -0.381679
								if( Typical_Price > 37.9308 )
									ret := 0.183099
							if( bbm > 0.007052 )
								if( Money_Flow_Ratio <= 1.42387 )
									ret := 0.785714 // buy
								if( Money_Flow_Ratio > 1.42387 )
									ret := -0.079422
			if( bullPower > 0.089858 )
				if( Positive_Money_Flow_Sum <= 767903 )
					if( Positive_Money_Flow <= 95.1974 )
						if( bearPower <= -0.066155 )
							ret := 0.928571 // buy
						if( bearPower > -0.066155 )
							if( Positive_Money_Flow_Sum <= 426705 )
								if( Negative_Money_Flow_Sum <= 274288 )
									ret := -0.117647
								if( Negative_Money_Flow_Sum > 274288 )
									ret := -0.791667 // sell
							if( Positive_Money_Flow_Sum > 426705 )
								if( Positive_Money_Flow_Sum <= 481863 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 481863 )
									ret := -0.375000
					if( Positive_Money_Flow > 95.1974 )
						if( Raw_Money_Flow <= 19637.4 )
							if( Negative_Money_Flow_Sum <= 24561.7 )
								if( Negative_Money_Flow_Sum <= 18974.1 )
									ret := -0.071429
								if( Negative_Money_Flow_Sum > 18974.1 )
									ret := 0.818182 // buy
							if( Negative_Money_Flow_Sum > 24561.7 )
								if( Positive_Money_Flow_Sum <= 283382 )
									ret := -0.520788
								if( Positive_Money_Flow_Sum > 283382 )
									ret := -0.850746 // sell
						if( Raw_Money_Flow > 19637.4 )
							if( MFI_High <= -15.5926 )
								if( Negative_Money_Flow_Sum <= 106521 )
									ret := 0.404255
								if( Negative_Money_Flow_Sum > 106521 )
									ret := -0.325342
							if( MFI_High > -15.5926 )
								if( Typical_Price <= 36.9467 )
									ret := -0.549296
								if( Typical_Price > 36.9467 )
									ret := -0.156863
				if( Positive_Money_Flow_Sum > 767903 )
					if( bullPower <= 0.331883 )
						if( Positive_Money_Flow_Sum <= 1.54132e+06 )
							if( bearPower <= -0.016434 )
								ret := 0.761905 // buy
							if( bearPower > -0.016434 )
								if( bbm <= 0.115926 )
									ret := 0.139241
								if( bbm > 0.115926 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.54132e+06 )
							if( bearPower <= 0.055121 )
								if( Typical_Price <= 37.6531 )
									ret := -0.640000
								if( Typical_Price > 37.6531 )
									ret := 0.200000
							if( bearPower > 0.055121 )
								if( bullPower <= 0.210312 )
									ret := 0.052632
								if( bullPower > 0.210312 )
									ret := -0.476190
					if( bullPower > 0.331883 )
						if( Typical_Price <= 25.8763 )
							if( bbm <= 0.243437 )
								ret := 0.777778 // buy
							if( bbm > 0.243437 )
								ret := 1.000000 // buy
						if( Typical_Price > 25.8763 )
							if( Raw_Money_Flow <= 1.6129e+06 )
								if( MFI <= 95.8714 )
									ret := 0.108696
								if( MFI > 95.8714 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.6129e+06 )
								ret := 0.866667 // buy
		if( Negative_Money_Flow_Sum > 334771 )
			if( Positive_Money_Flow_Sum <= 3.1939e+07 )
				if( bearPower <= 0.273327 )
					if( bullPower <= 0.170124 )
						if( bearPower <= 0.101932 )
							if( bbm <= 0.030029 )
								if( MFI_Low <= -2.23843 )
									ret := -0.228814
								if( MFI_Low > -2.23843 )
									ret := -0.010335
							if( bbm > 0.030029 )
								if( Negative_Money_Flow_Sum <= 9.86258e+06 )
									ret := 0.054889
								if( Negative_Money_Flow_Sum > 9.86258e+06 )
									ret := -0.223776
						if( bearPower > 0.101932 )
							if( Raw_Money_Flow <= 8927.47 )
								if( Positive_Money_Flow_Sum <= 523421 )
									ret := -0.781250 // sell
								if( Positive_Money_Flow_Sum > 523421 )
									ret := -0.333333
							if( Raw_Money_Flow > 8927.47 )
								if( Money_Flow_Ratio <= 3.56009 )
									ret := -0.066667
								if( Money_Flow_Ratio > 3.56009 )
									ret := -0.401639
					if( bullPower > 0.170124 )
						if( Raw_Money_Flow <= 2.61643e+06 )
							if( Raw_Money_Flow <= 2.01565e+06 )
								if( Positive_Money_Flow_Sum <= 2.21087e+07 )
									ret := 0.132281
								if( Positive_Money_Flow_Sum > 2.21087e+07 )
									ret := -0.369369
							if( Raw_Money_Flow > 2.01565e+06 )
								if( bbm <= 0.250226 )
									ret := 0.201717
								if( bbm > 0.250226 )
									ret := 0.607692
						if( Raw_Money_Flow > 2.61643e+06 )
							if( Positive_Money_Flow_Sum <= 2.30887e+07 )
								if( Money_Flow_Ratio <= 13.4868 )
									ret := -0.365188
								if( Money_Flow_Ratio > 13.4868 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 2.30887e+07 )
								if( bullPower <= 0.398707 )
									ret := 0.280000
								if( bullPower > 0.398707 )
									ret := 0.837838 // buy
				if( bearPower > 0.273327 )
					if( Negative_Money_Flow_Sum <= 6.60721e+06 )
						if( Typical_Price <= 44.1883 )
							if( Raw_Money_Flow <= 5.05244e+06 )
								if( Positive_Money_Flow_Sum <= 2.38132e+07 )
									ret := -0.254808
								if( Positive_Money_Flow_Sum > 2.38132e+07 )
									ret := 0.448276
							if( Raw_Money_Flow > 5.05244e+06 )
								ret := -1.000000 // sell
						if( Typical_Price > 44.1883 )
							if( Money_Flow_Ratio <= 4.55191 )
								ret := 0.625000
							if( Money_Flow_Ratio > 4.55191 )
								ret := 0.909091 // buy
					if( Negative_Money_Flow_Sum > 6.60721e+06 )
						if( MFI <= 67.6546 )
							if( MFI_Low <= 40.4388 )
								if( Money_Flow_Ratio <= 1.12821 )
									ret := -0.058824
								if( Money_Flow_Ratio > 1.12821 )
									ret := -0.722222 // sell
							if( MFI_Low > 40.4388 )
								ret := 0.388889
						if( MFI > 67.6546 )
							if( bbm <= 0.361 )
								ret := -1.000000 // sell
							if( bbm > 0.361 )
								ret := -0.875000 // sell
			if( Positive_Money_Flow_Sum > 3.1939e+07 )
				if( Money_Flow_Ratio <= 1.87272 )
					if( Negative_Money_Flow <= 3.48782e+06 )
						if( Typical_Price <= 36.235 )
							if( Positive_Money_Flow <= 1.34915e+06 )
								ret := 0.166667
							if( Positive_Money_Flow > 1.34915e+06 )
								ret := -0.400000
						if( Typical_Price > 36.235 )
							if( bearPower <= 0.186909 )
								ret := -1.000000 // sell
							if( bearPower > 0.186909 )
								ret := -0.444444
					if( Negative_Money_Flow > 3.48782e+06 )
						if( MFI_High <= -19.3668 )
							ret := 0.000000
						if( MFI_High > -19.3668 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 1.87272 )
					if( Money_Flow_Ratio <= 3.44122 )
						if( bbp <= 1.06515 )
							if( Negative_Money_Flow_Sum <= 1.59575e+07 )
								if( Raw_Money_Flow <= 5.6063e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 5.6063e+06 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.59575e+07 )
								if( Typical_Price <= 35.2043 )
									ret := 0.877551 // buy
								if( Typical_Price > 35.2043 )
									ret := 0.447368
						if( bbp > 1.06515 )
							ret := -0.411765
					if( Money_Flow_Ratio > 3.44122 )
						if( Typical_Price <= 34.9982 )
							if( bullPower <= 0.506086 )
								if( Raw_Money_Flow <= 6.48339e+06 )
									ret := 0.982456 // buy
								if( Raw_Money_Flow > 6.48339e+06 )
									ret := 0.727273 // buy
							if( bullPower > 0.506086 )
								ret := -0.250000
						if( Typical_Price > 34.9982 )
							if( Raw_Money_Flow <= 2.72424e+06 )
								if( Raw_Money_Flow <= 1.95379e+06 )
									ret := -0.928571 // sell
								if( Raw_Money_Flow > 1.95379e+06 )
									ret := -0.454545
							if( Raw_Money_Flow > 2.72424e+06 )
								if( Negative_Money_Flow <= 3.02556e+06 )
									ret := 0.219512
								if( Negative_Money_Flow > 3.02556e+06 )
									ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_UPST_1Min_a39d6230(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


