//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: MATICUSDT_30Min_2MM0_f3a9056a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2MM0_f3a9056a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_f3a9056a(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 2.60612e+06 )
		if( Long_MA <= 0.807666 )
			if( Typical_Price <= 0.017772 )
				if( Negative_Money_Flow_Sum <= 979831 )
					if( MFI <= 24.9774 )
						if( Negative_Money_Flow <= 126863 )
							if( Positive_Money_Flow <= 66762.7 )
								if( Short_Long_Diff <= -0.000271 )
									ret := -0.529412
								if( Short_Long_Diff > -0.000271 )
									ret := -0.120000
							if( Positive_Money_Flow > 66762.7 )
								ret := 0.714286 // buy
						if( Negative_Money_Flow > 126863 )
							if( Negative_Money_Flow_Sum <= 735232 )
								if( Negative_Money_Flow <= 160314 )
									ret := 0.952381 // buy
								if( Negative_Money_Flow > 160314 )
									ret := 0.384615
							if( Negative_Money_Flow_Sum > 735232 )
								if( MFI_Low <= -2.29601 )
									ret := -0.714286 // sell
								if( MFI_Low > -2.29601 )
									ret := 0.250000
					if( MFI > 24.9774 )
						if( Typical_Price <= 0.014416 )
							if( Positive_Money_Flow_Sum <= 480627 )
								if( MFI_High <= -44.6225 )
									ret := 0.310811
								if( MFI_High > -44.6225 )
									ret := -0.300000
							if( Positive_Money_Flow_Sum > 480627 )
								if( Long_MA <= 0.012886 )
									ret := -0.227273
								if( Long_MA > 0.012886 )
									ret := 0.555556
						if( Typical_Price > 0.014416 )
							if( Negative_Money_Flow_Sum <= 722000 )
								if( Long_MA <= 0.015743 )
									ret := 0.463504
								if( Long_MA > 0.015743 )
									ret := 0.176335
							if( Negative_Money_Flow_Sum > 722000 )
								if( Negative_Money_Flow_Sum <= 901717 )
									ret := -0.287129
								if( Negative_Money_Flow_Sum > 901717 )
									ret := 0.333333
				if( Negative_Money_Flow_Sum > 979831 )
					if( Short_Long_Diff <= -0.000684 )
						if( Negative_Money_Flow_Sum <= 2.58729e+06 )
							if( MFI_Low <= 4.17654 )
								if( Money_Flow_Ratio <= 0.252204 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.252204 )
									ret := -1.000000 // sell
							if( MFI_Low > 4.17654 )
								ret := -0.428571
						if( Negative_Money_Flow_Sum > 2.58729e+06 )
							if( Long_MA <= 0.017405 )
								ret := 0.250000
							if( Long_MA > 0.017405 )
								ret := 0.750000 // buy
					if( Short_Long_Diff > -0.000684 )
						if( Negative_Money_Flow_Sum <= 1.70619e+06 )
							if( Positive_Money_Flow <= 227481 )
								if( MFI_High <= -66.2602 )
									ret := 0.222222
								if( MFI_High > -66.2602 )
									ret := 0.781690 // buy
							if( Positive_Money_Flow > 227481 )
								ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 1.70619e+06 )
							if( Raw_Money_Flow <= 154323 )
								ret := 0.000000
							if( Raw_Money_Flow > 154323 )
								if( Raw_Money_Flow <= 241336 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 241336 )
									ret := 0.000000
			if( Typical_Price > 0.017772 )
				if( Money_Flow_Ratio <= 0.142288 )
					if( Negative_Money_Flow_Sum <= 1.29739e+07 )
						if( Typical_Price <= 0.018795 )
							if( Positive_Money_Flow_Sum <= 61296 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 61296 )
								if( Short_Long_Diff <= -0.000426 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > -0.000426 )
									ret := 0.250000
						if( Typical_Price > 0.018795 )
							if( Short_MA <= 0.510056 )
								if( Positive_Money_Flow_Sum <= 653450 )
									ret := -0.518519
								if( Positive_Money_Flow_Sum > 653450 )
									ret := -0.884615 // sell
							if( Short_MA > 0.510056 )
								if( Negative_Money_Flow_Sum <= 1.15246e+07 )
									ret := -0.216216
								if( Negative_Money_Flow_Sum > 1.15246e+07 )
									ret := -0.592593
					if( Negative_Money_Flow_Sum > 1.29739e+07 )
						if( Positive_Money_Flow_Sum <= 2.86609e+06 )
							if( Negative_Money_Flow <= 2.2668e+06 )
								if( Long_MA <= 0.778498 )
									ret := 0.073529
								if( Long_MA > 0.778498 )
									ret := 0.777778 // buy
							if( Negative_Money_Flow > 2.2668e+06 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.86609e+06 )
							if( Long_MA <= 0.708346 )
								if( Negative_Money_Flow_Sum <= 4.05148e+07 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 4.05148e+07 )
									ret := -0.933333 // sell
							if( Long_MA > 0.708346 )
								ret := 0.666667
				if( Money_Flow_Ratio > 0.142288 )
					if( Negative_Money_Flow_Sum <= 324114 )
						if( Short_Long_Diff <= 5.8e-05 )
							if( Positive_Money_Flow_Sum <= 234336 )
								if( Negative_Money_Flow_Sum <= 300652 )
									ret := -0.052219
								if( Negative_Money_Flow_Sum > 300652 )
									ret := -0.543478
							if( Positive_Money_Flow_Sum > 234336 )
								if( Long_MA <= 0.01938 )
									ret := 0.288321
								if( Long_MA > 0.01938 )
									ret := -0.118644
						if( Short_Long_Diff > 5.8e-05 )
							if( Positive_Money_Flow_Sum <= 362544 )
								if( Short_Long_Diff <= 9.8e-05 )
									ret := -0.215385
								if( Short_Long_Diff > 9.8e-05 )
									ret := 0.160714
							if( Positive_Money_Flow_Sum > 362544 )
								if( Positive_Money_Flow_Sum <= 693109 )
									ret := -0.458333
								if( Positive_Money_Flow_Sum > 693109 )
									ret := 0.043165
					if( Negative_Money_Flow_Sum > 324114 )
						if( Typical_Price <= 0.369188 )
							if( Positive_Money_Flow <= 258758 )
								if( Typical_Price <= 0.022781 )
									ret := 0.073668
								if( Typical_Price > 0.022781 )
									ret := 0.194988
							if( Positive_Money_Flow > 258758 )
								if( Negative_Money_Flow_Sum <= 1.11686e+06 )
									ret := -0.390728
								if( Negative_Money_Flow_Sum > 1.11686e+06 )
									ret := 0.037643
						if( Typical_Price > 0.369188 )
							if( Positive_Money_Flow_Sum <= 7.06434e+06 )
								if( Money_Flow_Ratio <= 1.15103 )
									ret := 0.000000
								if( Money_Flow_Ratio > 1.15103 )
									ret := 0.078534
							if( Positive_Money_Flow_Sum > 7.06434e+06 )
								if( MFI_High <= -21.4412 )
									ret := 0.142681
								if( MFI_High > -21.4412 )
									ret := 0.043907
		if( Long_MA > 0.807666 )
			if( Typical_Price <= 1.80379 )
				if( Short_Long_Diff <= -0.034986 )
					if( Raw_Money_Flow <= 4.44609e+06 )
						if( Negative_Money_Flow <= 2.41331e+06 )
							if( Negative_Money_Flow_Sum <= 4.79292e+07 )
								if( Raw_Money_Flow <= 2.35019e+06 )
									ret := -0.200000
								if( Raw_Money_Flow > 2.35019e+06 )
									ret := 0.666667
							if( Negative_Money_Flow_Sum > 4.79292e+07 )
								if( Money_Flow_Ratio <= 0.420012 )
									ret := 0.148148
								if( Money_Flow_Ratio > 0.420012 )
									ret := -0.538462
						if( Negative_Money_Flow > 2.41331e+06 )
							ret := -1.000000 // sell
					if( Raw_Money_Flow > 4.44609e+06 )
						if( MFI <= 54.2891 )
							if( Short_MA <= 1.71165 )
								if( Positive_Money_Flow <= 3.19593e+07 )
									ret := 0.450331
								if( Positive_Money_Flow > 3.19593e+07 )
									ret := 0.833333 // buy
							if( Short_MA > 1.71165 )
								if( Negative_Money_Flow_Sum <= 8.49182e+07 )
									ret := -0.583333
								if( Negative_Money_Flow_Sum > 8.49182e+07 )
									ret := 0.178571
						if( MFI > 54.2891 )
							ret := -1.000000 // sell
				if( Short_Long_Diff > -0.034986 )
					if( Negative_Money_Flow_Sum <= 3.94247e+07 )
						if( Positive_Money_Flow_Sum <= 1.07234e+07 )
							if( Short_MA <= 1.1648 )
								if( Typical_Price <= 0.794827 )
									ret := 0.512195
								if( Typical_Price > 0.794827 )
									ret := -0.011894
							if( Short_MA > 1.1648 )
								if( Money_Flow_Ratio <= 0.177004 )
									ret := 0.285714
								if( Money_Flow_Ratio > 0.177004 )
									ret := -0.101794
						if( Positive_Money_Flow_Sum > 1.07234e+07 )
							if( MFI_High <= -45.8355 )
								if( Raw_Money_Flow <= 1.26321e+06 )
									ret := 0.508929
								if( Raw_Money_Flow > 1.26321e+06 )
									ret := 0.165079
							if( MFI_High > -45.8355 )
								if( Positive_Money_Flow_Sum <= 4.75504e+07 )
									ret := 0.051719
								if( Positive_Money_Flow_Sum > 4.75504e+07 )
									ret := -0.062193
					if( Negative_Money_Flow_Sum > 3.94247e+07 )
						if( Short_Long_Diff <= -0.007782 )
							if( Long_MA <= 1.08285 )
								if( Positive_Money_Flow_Sum <= 1.04403e+07 )
									ret := 0.562500
								if( Positive_Money_Flow_Sum > 1.04403e+07 )
									ret := -0.075426
							if( Long_MA > 1.08285 )
								if( Raw_Money_Flow <= 2.50258e+07 )
									ret := -0.268219
								if( Raw_Money_Flow > 2.50258e+07 )
									ret := 0.229167
						if( Short_Long_Diff > -0.007782 )
							if( Positive_Money_Flow_Sum <= 4.70663e+08 )
								if( Raw_Money_Flow <= 2.11912e+07 )
									ret := 0.079698
								if( Raw_Money_Flow > 2.11912e+07 )
									ret := -0.295833
							if( Positive_Money_Flow_Sum > 4.70663e+08 )
								if( Typical_Price <= 1.50752 )
									ret := 1.000000 // buy
								if( Typical_Price > 1.50752 )
									ret := 0.620690
			if( Typical_Price > 1.80379 )
				if( Negative_Money_Flow_Sum <= 1.1755e+08 )
					if( MFI_Low <= 38.2734 )
						if( Positive_Money_Flow_Sum <= 5.66857e+07 )
							if( Negative_Money_Flow_Sum <= 3.58302e+07 )
								if( Negative_Money_Flow_Sum <= 3.54374e+07 )
									ret := 0.075601
								if( Negative_Money_Flow_Sum > 3.54374e+07 )
									ret := 0.846154 // buy
							if( Negative_Money_Flow_Sum > 3.58302e+07 )
								if( Raw_Money_Flow <= 3.24166e+06 )
									ret := -0.398773
								if( Raw_Money_Flow > 3.24166e+06 )
									ret := -0.031785
						if( Positive_Money_Flow_Sum > 5.66857e+07 )
							if( Money_Flow_Ratio <= 1.07629 )
								if( Money_Flow_Ratio <= 0.945591 )
									ret := 0.355556
								if( Money_Flow_Ratio > 0.945591 )
									ret := 0.954545 // buy
							if( Money_Flow_Ratio > 1.07629 )
								if( Positive_Money_Flow <= 1.14034e+07 )
									ret := -0.083333
								if( Positive_Money_Flow > 1.14034e+07 )
									ret := 0.560000
					if( MFI_Low > 38.2734 )
						if( Negative_Money_Flow_Sum <= 9.31329e+07 )
							if( Short_Long_Diff <= 0.078941 )
								if( Negative_Money_Flow_Sum <= 1.93411e+07 )
									ret := -0.024324
								if( Negative_Money_Flow_Sum > 1.93411e+07 )
									ret := -0.261698
							if( Short_Long_Diff > 0.078941 )
								if( Long_MA <= 2.00569 )
									ret := 0.950000 // buy
								if( Long_MA > 2.00569 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 9.31329e+07 )
							if( MFI_High <= -8.63951 )
								ret := -1.000000 // sell
							if( MFI_High > -8.63951 )
								ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 1.1755e+08 )
					if( Negative_Money_Flow_Sum <= 1.62126e+08 )
						if( Short_Long_Diff <= 0.016108 )
							if( Short_Long_Diff <= -0.01528 )
								if( Long_MA <= 1.875 )
									ret := 0.142857
								if( Long_MA > 1.875 )
									ret := -0.719298 // sell
							if( Short_Long_Diff > -0.01528 )
								if( Short_Long_Diff <= 0.002846 )
									ret := -1.000000 // sell
								if( Short_Long_Diff > 0.002846 )
									ret := -0.818182 // sell
						if( Short_Long_Diff > 0.016108 )
							if( MFI_High <= -25.2864 )
								ret := 1.000000 // buy
							if( MFI_High > -25.2864 )
								if( MFI <= 66.44 )
									ret := -0.133333
								if( MFI > 66.44 )
									ret := -0.733333 // sell
					if( Negative_Money_Flow_Sum > 1.62126e+08 )
						if( Negative_Money_Flow_Sum <= 2.55153e+08 )
							if( Short_Long_Diff <= 0.000326 )
								if( Long_MA <= 1.89174 )
									ret := -0.512821
								if( Long_MA > 1.89174 )
									ret := 0.042553
							if( Short_Long_Diff > 0.000326 )
								if( MFI_Low <= 36.8773 )
									ret := 0.882353 // buy
								if( MFI_Low > 36.8773 )
									ret := 0.045455
						if( Negative_Money_Flow_Sum > 2.55153e+08 )
							if( MFI_Low <= 10.6818 )
								ret := 0.857143 // buy
							if( MFI_Low > 10.6818 )
								if( Raw_Money_Flow <= 1.24738e+08 )
									ret := -0.604651
								if( Raw_Money_Flow > 1.24738e+08 )
									ret := 0.375000
	if( Negative_Money_Flow > 2.60612e+06 )
		if( Short_Long_Diff <= -0.033951 )
			if( MFI <= 19.8051 )
				if( Typical_Price <= 1.96269 )
					if( Negative_Money_Flow_Sum <= 7.7767e+07 )
						if( Negative_Money_Flow <= 9.3844e+06 )
							if( MFI_High <= -63.4801 )
								if( Short_Long_Diff <= -0.050754 )
									ret := 0.700000 // buy
								if( Short_Long_Diff > -0.050754 )
									ret := 1.000000 // buy
							if( MFI_High > -63.4801 )
								if( Short_MA <= 1.07718 )
									ret := 1.000000 // buy
								if( Short_MA > 1.07718 )
									ret := -0.375000
						if( Negative_Money_Flow > 9.3844e+06 )
							if( Negative_Money_Flow_Sum <= 7.24169e+07 )
								if( MFI_Low <= -3.04426 )
									ret := 0.250000
								if( MFI_Low > -3.04426 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 7.24169e+07 )
								if( Positive_Money_Flow_Sum <= 1.13857e+07 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 1.13857e+07 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 7.7767e+07 )
						if( Short_Long_Diff <= -0.058726 )
							if( Positive_Money_Flow_Sum <= 4.67062e+07 )
								if( Negative_Money_Flow <= 4.30495e+07 )
									ret := 0.470588
								if( Negative_Money_Flow > 4.30495e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.67062e+07 )
								ret := 1.000000 // buy
						if( Short_Long_Diff > -0.058726 )
							if( Negative_Money_Flow <= 2.18442e+07 )
								if( MFI <= 17.7377 )
									ret := 0.985294 // buy
								if( MFI > 17.7377 )
									ret := 0.615385
							if( Negative_Money_Flow > 2.18442e+07 )
								if( Positive_Money_Flow_Sum <= 1.65135e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.65135e+07 )
									ret := 1.000000 // buy
				if( Typical_Price > 1.96269 )
					if( Typical_Price <= 2.3022 )
						if( Negative_Money_Flow <= 2.72068e+07 )
							if( Long_MA <= 2.33512 )
								if( Money_Flow_Ratio <= 0.178804 )
									ret := 0.300000
								if( Money_Flow_Ratio > 0.178804 )
									ret := -0.352941
							if( Long_MA > 2.33512 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 2.72068e+07 )
							ret := 1.000000 // buy
					if( Typical_Price > 2.3022 )
						if( Negative_Money_Flow <= 9.98206e+06 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 9.98206e+06 )
							ret := 0.500000
			if( MFI > 19.8051 )
				if( Long_MA <= 1.07538 )
					if( Positive_Money_Flow_Sum <= 5.05994e+07 )
						if( Negative_Money_Flow_Sum <= 7.80045e+07 )
							if( Long_MA <= 0.879359 )
								ret := -0.142857
							if( Long_MA > 0.879359 )
								if( Negative_Money_Flow_Sum <= 5.31305e+07 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 5.31305e+07 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 7.80045e+07 )
							if( Negative_Money_Flow_Sum <= 9.50088e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 9.50088e+07 )
								ret := 0.250000
					if( Positive_Money_Flow_Sum > 5.05994e+07 )
						if( Negative_Money_Flow <= 1.64752e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.64752e+07 )
							ret := 0.000000
				if( Long_MA > 1.07538 )
					if( Negative_Money_Flow_Sum <= 5.21603e+07 )
						if( Positive_Money_Flow_Sum <= 1.44131e+07 )
							ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.44131e+07 )
							if( Negative_Money_Flow_Sum <= 3.99053e+07 )
								if( Short_MA <= 1.5755 )
									ret := -0.250000
								if( Short_MA > 1.5755 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 3.99053e+07 )
								if( Short_MA <= 1.77201 )
									ret := -0.952381 // sell
								if( Short_MA > 1.77201 )
									ret := -0.583333
					if( Negative_Money_Flow_Sum > 5.21603e+07 )
						if( MFI <= 20.6125 )
							if( Long_MA <= 1.67249 )
								ret := -0.142857
							if( Long_MA > 1.67249 )
								if( Raw_Money_Flow <= 7.04603e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 7.04603e+06 )
									ret := -0.923077 // sell
						if( MFI > 20.6125 )
							if( Money_Flow_Ratio <= 0.391312 )
								if( Raw_Money_Flow <= 1.21056e+07 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 1.21056e+07 )
									ret := 0.394737
							if( Money_Flow_Ratio > 0.391312 )
								if( Negative_Money_Flow_Sum <= 3.78892e+08 )
									ret := 0.169312
								if( Negative_Money_Flow_Sum > 3.78892e+08 )
									ret := 0.777778 // buy
		if( Short_Long_Diff > -0.033951 )
			if( Long_MA <= 1.31799 )
				if( Short_Long_Diff <= 0.039643 )
					if( Raw_Money_Flow <= 2.96718e+07 )
						if( Typical_Price <= 0.733489 )
							if( Positive_Money_Flow_Sum <= 2.57246e+07 )
								if( MFI <= 62.1877 )
									ret := 0.329954
								if( MFI > 62.1877 )
									ret := -0.404762
							if( Positive_Money_Flow_Sum > 2.57246e+07 )
								if( Positive_Money_Flow_Sum <= 3.60941e+07 )
									ret := -0.163265
								if( Positive_Money_Flow_Sum > 3.60941e+07 )
									ret := 0.118902
						if( Typical_Price > 0.733489 )
							if( Negative_Money_Flow_Sum <= 2.85638e+07 )
								if( MFI_High <= -10.7646 )
									ret := 0.003914
								if( MFI_High > -10.7646 )
									ret := 0.231818
							if( Negative_Money_Flow_Sum > 2.85638e+07 )
								if( Negative_Money_Flow_Sum <= 5.66203e+07 )
									ret := 0.241758
								if( Negative_Money_Flow_Sum > 5.66203e+07 )
									ret := 0.037166
					if( Raw_Money_Flow > 2.96718e+07 )
						if( Money_Flow_Ratio <= 1.15349 )
							if( MFI_Low <= 26.1845 )
								ret := -0.800000 // sell
							if( MFI_Low > 26.1845 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 1.15349 )
							if( MFI_Low <= 49.8648 )
								ret := -1.000000 // sell
							if( MFI_Low > 49.8648 )
								ret := -0.800000 // sell
				if( Short_Long_Diff > 0.039643 )
					if( Money_Flow_Ratio <= 1.94315 )
						if( Short_Long_Diff <= 0.049751 )
							if( Typical_Price <= 0.960353 )
								if( MFI_Low <= 43.7063 )
									ret := 1.000000 // buy
								if( MFI_Low > 43.7063 )
									ret := 0.250000
							if( Typical_Price > 0.960353 )
								if( MFI <= 60.7483 )
									ret := -0.333333
								if( MFI > 60.7483 )
									ret := 0.600000
						if( Short_Long_Diff > 0.049751 )
							if( MFI_Low <= 42.2345 )
								if( Money_Flow_Ratio <= 1.42574 )
									ret := -0.333333
								if( Money_Flow_Ratio > 1.42574 )
									ret := -0.833333 // sell
							if( MFI_Low > 42.2345 )
								ret := 0.000000
					if( Money_Flow_Ratio > 1.94315 )
						if( Raw_Money_Flow <= 7.84661e+06 )
							if( Typical_Price <= 1.09838 )
								if( Negative_Money_Flow_Sum <= 2.7946e+07 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 2.7946e+07 )
									ret := 0.000000
							if( Typical_Price > 1.09838 )
								if( Negative_Money_Flow_Sum <= 2.02526e+07 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 2.02526e+07 )
									ret := -0.750000 // sell
						if( Raw_Money_Flow > 7.84661e+06 )
							if( Raw_Money_Flow <= 4.78898e+07 )
								if( Negative_Money_Flow_Sum <= 5.53746e+07 )
									ret := 0.725000 // buy
								if( Negative_Money_Flow_Sum > 5.53746e+07 )
									ret := 0.937500 // buy
							if( Raw_Money_Flow > 4.78898e+07 )
								if( MFI_Low <= 56.6202 )
									ret := 0.500000
								if( MFI_Low > 56.6202 )
									ret := -0.200000
			if( Long_MA > 1.31799 )
				if( Positive_Money_Flow_Sum <= 1.33056e+08 )
					if( Positive_Money_Flow_Sum <= 1.25371e+08 )
						if( Negative_Money_Flow_Sum <= 6.85914e+07 )
							if( Positive_Money_Flow_Sum <= 3.82247e+07 )
								if( Short_MA <= 1.92743 )
									ret := 0.112069
								if( Short_MA > 1.92743 )
									ret := -0.144304
							if( Positive_Money_Flow_Sum > 3.82247e+07 )
								if( Positive_Money_Flow_Sum <= 4.78397e+07 )
									ret := -0.271429
								if( Positive_Money_Flow_Sum > 4.78397e+07 )
									ret := -0.007605
						if( Negative_Money_Flow_Sum > 6.85914e+07 )
							if( Typical_Price <= 1.98378 )
								if( MFI_High <= -25.409 )
									ret := 0.261206
								if( MFI_High > -25.409 )
									ret := -0.269231
							if( Typical_Price > 1.98378 )
								if( Short_Long_Diff <= 0.00635 )
									ret := -0.301724
								if( Short_Long_Diff > 0.00635 )
									ret := 0.404255
					if( Positive_Money_Flow_Sum > 1.25371e+08 )
						if( Negative_Money_Flow <= 1.05399e+07 )
							if( Money_Flow_Ratio <= 1.98072 )
								if( Short_MA <= 2.03456 )
									ret := 0.750000 // buy
								if( Short_MA > 2.03456 )
									ret := 0.000000
							if( Money_Flow_Ratio > 1.98072 )
								ret := -0.428571
						if( Negative_Money_Flow > 1.05399e+07 )
							if( MFI_High <= -34.6751 )
								ret := 1.000000 // buy
							if( MFI_High > -34.6751 )
								if( MFI <= 52.4444 )
									ret := -0.250000
								if( MFI > 52.4444 )
									ret := 0.818182 // buy
				if( Positive_Money_Flow_Sum > 1.33056e+08 )
					if( Short_Long_Diff <= 0.09704 )
						if( Raw_Money_Flow <= 4.61488e+07 )
							if( Money_Flow_Ratio <= 1.1851 )
								if( Negative_Money_Flow_Sum <= 1.35032e+08 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 1.35032e+08 )
									ret := -0.545064
							if( Money_Flow_Ratio > 1.1851 )
								if( Negative_Money_Flow_Sum <= 7.48366e+07 )
									ret := -0.445652
								if( Negative_Money_Flow_Sum > 7.48366e+07 )
									ret := 0.014870
						if( Raw_Money_Flow > 4.61488e+07 )
							if( Short_MA <= 2.27105 )
								if( MFI_High <= -39.1587 )
									ret := 0.925926 // buy
								if( MFI_High > -39.1587 )
									ret := 0.081967
							if( Short_MA > 2.27105 )
								if( Negative_Money_Flow_Sum <= 5.70441e+08 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 5.70441e+08 )
									ret := -1.000000 // sell
					if( Short_Long_Diff > 0.09704 )
						if( Raw_Money_Flow <= 9.09616e+07 )
							if( Negative_Money_Flow_Sum <= 1.67048e+08 )
								if( Typical_Price <= 2.12786 )
									ret := 1.000000 // buy
								if( Typical_Price > 2.12786 )
									ret := 0.400000
							if( Negative_Money_Flow_Sum > 1.67048e+08 )
								if( Positive_Money_Flow_Sum <= 4.54449e+08 )
									ret := -0.809524 // sell
								if( Positive_Money_Flow_Sum > 4.54449e+08 )
									ret := 0.587302
						if( Raw_Money_Flow > 9.09616e+07 )
							if( Short_MA <= 2.05292 )
								ret := -1.000000 // sell
							if( Short_MA > 2.05292 )
								ret := -0.500000
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_f3a9056a(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


