//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: QCOM_1Min_2MM0_1048614d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2MM0_1048614d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_1048614d(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow <= 15987.4 )
		if( Raw_Money_Flow <= 120574 )
			if( Money_Flow_Ratio <= 0.205288 )
				if( Typical_Price <= 159.862 )
					if( Short_Long_Diff <= -0.343915 )
						ret := 0.500000
					if( Short_Long_Diff > -0.343915 )
						if( Short_Long_Diff <= -0.000695 )
							if( Negative_Money_Flow_Sum <= 3.28056e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.28056e+07 )
								ret := 0.750000 // buy
						if( Short_Long_Diff > -0.000695 )
							if( Positive_Money_Flow_Sum <= 734268 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 734268 )
								ret := 1.000000 // buy
				if( Typical_Price > 159.862 )
					if( Long_MA <= 167.692 )
						if( MFI_High <= -64.2574 )
							if( Positive_Money_Flow_Sum <= 315325 )
								if( Typical_Price <= 162.818 )
									ret := 0.166667
								if( Typical_Price > 162.818 )
									ret := -0.739130 // sell
							if( Positive_Money_Flow_Sum > 315325 )
								if( Negative_Money_Flow_Sum <= 1.34879e+07 )
									ret := 0.434783
								if( Negative_Money_Flow_Sum > 1.34879e+07 )
									ret := -0.100000
						if( MFI_High > -64.2574 )
							if( MFI <= 16.5825 )
								ret := 0.500000
							if( MFI > 16.5825 )
								ret := 1.000000 // buy
					if( Long_MA > 167.692 )
						if( Positive_Money_Flow_Sum <= 170647 )
							if( Positive_Money_Flow <= 8646.34 )
								if( Negative_Money_Flow <= 77021.7 )
									ret := -0.386364
								if( Negative_Money_Flow > 77021.7 )
									ret := 0.642857
							if( Positive_Money_Flow > 8646.34 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 170647 )
							if( Long_MA <= 180.741 )
								if( Short_Long_Diff <= -0.656136 )
									ret := -1.000000 // sell
								if( Short_Long_Diff > -0.656136 )
									ret := 0.471338
							if( Long_MA > 180.741 )
								if( Negative_Money_Flow_Sum <= 4.15686e+08 )
									ret := 0.644172
								if( Negative_Money_Flow_Sum > 4.15686e+08 )
									ret := -0.400000
			if( Money_Flow_Ratio > 0.205288 )
				if( Negative_Money_Flow_Sum <= 235888 )
					if( Raw_Money_Flow <= 46909.2 )
						if( Short_MA <= 173.349 )
							if( Short_Long_Diff <= 0.123981 )
								if( MFI <= 78.1072 )
									ret := 0.900000 // buy
								if( MFI > 78.1072 )
									ret := -0.066667
							if( Short_Long_Diff > 0.123981 )
								if( Negative_Money_Flow_Sum <= 140053 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 140053 )
									ret := -0.680000
						if( Short_MA > 173.349 )
							if( Negative_Money_Flow <= 26386.3 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 26386.3 )
								if( Short_Long_Diff <= 0.147968 )
									ret := -0.125000
								if( Short_Long_Diff > 0.147968 )
									ret := -0.875000 // sell
					if( Raw_Money_Flow > 46909.2 )
						if( Positive_Money_Flow_Sum <= 1.59538e+07 )
							if( Negative_Money_Flow_Sum <= 224125 )
								if( Long_MA <= 165.698 )
									ret := 0.000000
								if( Long_MA > 165.698 )
									ret := 0.645161
							if( Negative_Money_Flow_Sum > 224125 )
								if( Money_Flow_Ratio <= 2.32742 )
									ret := -0.600000
								if( Money_Flow_Ratio > 2.32742 )
									ret := 0.333333
						if( Positive_Money_Flow_Sum > 1.59538e+07 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 235888 )
					if( Negative_Money_Flow <= 833.735 )
						if( Short_MA <= 176.952 )
							if( Long_MA <= 171.691 )
								if( MFI <= 94.2248 )
									ret := -0.038278
								if( MFI > 94.2248 )
									ret := 0.700000 // buy
							if( Long_MA > 171.691 )
								if( MFI_High <= -42.173 )
									ret := 0.214286
								if( MFI_High > -42.173 )
									ret := -0.657895
						if( Short_MA > 176.952 )
							if( Positive_Money_Flow_Sum <= 470583 )
								if( Long_MA <= 186.757 )
									ret := 0.950000 // buy
								if( Long_MA > 186.757 )
									ret := 0.463415
							if( Positive_Money_Flow_Sum > 470583 )
								if( Negative_Money_Flow_Sum <= 324730 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 324730 )
									ret := -0.030488
					if( Negative_Money_Flow > 833.735 )
						if( Typical_Price <= 208.582 )
							if( Short_Long_Diff <= 0.264883 )
								if( Positive_Money_Flow <= 3123.51 )
									ret := 0.293470
								if( Positive_Money_Flow > 3123.51 )
									ret := 0.030769
							if( Short_Long_Diff > 0.264883 )
								if( MFI <= 66.8118 )
									ret := -0.035885
								if( MFI > 66.8118 )
									ret := 0.378049
						if( Typical_Price > 208.582 )
							if( Money_Flow_Ratio <= 0.484379 )
								if( Negative_Money_Flow_Sum <= 3.21172e+06 )
									ret := -0.480000
								if( Negative_Money_Flow_Sum > 3.21172e+06 )
									ret := 0.833333 // buy
							if( Money_Flow_Ratio > 0.484379 )
								if( Short_Long_Diff <= 0.462509 )
									ret := 0.200820
								if( Short_Long_Diff > 0.462509 )
									ret := -0.545455
		if( Raw_Money_Flow > 120574 )
			if( Positive_Money_Flow_Sum <= 7.71572e+07 )
				if( Positive_Money_Flow_Sum <= 1.01405e+06 )
					if( Money_Flow_Ratio <= 0.264615 )
						if( Long_MA <= 161.025 )
							if( Positive_Money_Flow_Sum <= 355318 )
								if( Money_Flow_Ratio <= 0.140086 )
									ret := 0.571429
								if( Money_Flow_Ratio > 0.140086 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 355318 )
								if( Negative_Money_Flow <= 1.08642e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1.08642e+06 )
									ret := 0.777778 // buy
						if( Long_MA > 161.025 )
							if( Short_Long_Diff <= -0.007389 )
								if( Negative_Money_Flow <= 2.95291e+07 )
									ret := 0.248380
								if( Negative_Money_Flow > 2.95291e+07 )
									ret := -0.733333 // sell
							if( Short_Long_Diff > -0.007389 )
								if( Negative_Money_Flow <= 441774 )
									ret := 0.419355
								if( Negative_Money_Flow > 441774 )
									ret := 0.857143 // buy
					if( Money_Flow_Ratio > 0.264615 )
						if( Typical_Price <= 168.738 )
							if( Raw_Money_Flow <= 841052 )
								if( Negative_Money_Flow_Sum <= 401429 )
									ret := -0.739130 // sell
								if( Negative_Money_Flow_Sum > 401429 )
									ret := -0.110749
							if( Raw_Money_Flow > 841052 )
								if( Positive_Money_Flow_Sum <= 672698 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 672698 )
									ret := 1.000000 // buy
						if( Typical_Price > 168.738 )
							if( Negative_Money_Flow <= 1.09482e+06 )
								if( MFI <= 56.841 )
									ret := 0.212711
								if( MFI > 56.841 )
									ret := -0.203125
							if( Negative_Money_Flow > 1.09482e+06 )
								if( Positive_Money_Flow_Sum <= 952194 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 952194 )
									ret := -0.750000 // sell
				if( Positive_Money_Flow_Sum > 1.01405e+06 )
					if( Short_MA <= 167.367 )
						if( Positive_Money_Flow_Sum <= 5.82925e+06 )
							if( Money_Flow_Ratio <= 1.55075 )
								if( Negative_Money_Flow_Sum <= 1.59567e+06 )
									ret := -0.475000
								if( Negative_Money_Flow_Sum > 1.59567e+06 )
									ret := 0.191120
							if( Money_Flow_Ratio > 1.55075 )
								if( Typical_Price <= 164.997 )
									ret := 0.718750 // buy
								if( Typical_Price > 164.997 )
									ret := 0.035714
						if( Positive_Money_Flow_Sum > 5.82925e+06 )
							if( MFI_Low <= 3.04417 )
								if( Raw_Money_Flow <= 7.94846e+06 )
									ret := 0.356846
								if( Raw_Money_Flow > 7.94846e+06 )
									ret := -0.268293
							if( MFI_Low > 3.04417 )
								if( Positive_Money_Flow_Sum <= 1.12229e+07 )
									ret := 0.024023
								if( Positive_Money_Flow_Sum > 1.12229e+07 )
									ret := 0.122337
					if( Short_MA > 167.367 )
						if( MFI <= 4.40646 )
							if( Negative_Money_Flow <= 1.09489e+07 )
								if( Positive_Money_Flow_Sum <= 1.32663e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.32663e+06 )
									ret := 0.598214
							if( Negative_Money_Flow > 1.09489e+07 )
								if( Raw_Money_Flow <= 1.79873e+07 )
									ret := -0.400000
								if( Raw_Money_Flow > 1.79873e+07 )
									ret := 0.279070
						if( MFI > 4.40646 )
							if( Negative_Money_Flow_Sum <= 982634 )
								if( MFI_High <= -14.5956 )
									ret := -0.516854
								if( MFI_High > -14.5956 )
									ret := -0.068750
							if( Negative_Money_Flow_Sum > 982634 )
								if( Negative_Money_Flow_Sum <= 3.86383e+07 )
									ret := 0.015339
								if( Negative_Money_Flow_Sum > 3.86383e+07 )
									ret := -0.051181
			if( Positive_Money_Flow_Sum > 7.71572e+07 )
				if( Negative_Money_Flow_Sum <= 6.56788e+07 )
					if( Short_MA <= 201.913 )
						if( Short_Long_Diff <= 0.44704 )
							if( Short_MA <= 192.566 )
								if( Negative_Money_Flow_Sum <= 2.02307e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.02307e+07 )
									ret := 0.369748
							if( Short_MA > 192.566 )
								if( MFI <= 65.1584 )
									ret := 0.000000
								if( MFI > 65.1584 )
									ret := 0.829268 // buy
						if( Short_Long_Diff > 0.44704 )
							if( Positive_Money_Flow_Sum <= 1.05065e+08 )
								if( Short_Long_Diff <= 0.58563 )
									ret := 0.863636 // buy
								if( Short_Long_Diff > 0.58563 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.05065e+08 )
								if( Typical_Price <= 192.061 )
									ret := 0.892157 // buy
								if( Typical_Price > 192.061 )
									ret := 0.461538
					if( Short_MA > 201.913 )
						if( Short_MA <= 218.495 )
							if( Short_Long_Diff <= 0.517887 )
								if( Positive_Money_Flow <= 1216.27 )
									ret := 0.481203
								if( Positive_Money_Flow > 1216.27 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > 0.517887 )
								if( Typical_Price <= 208.046 )
									ret := -0.473684
								if( Typical_Price > 208.046 )
									ret := 0.033333
						if( Short_MA > 218.495 )
							if( MFI <= 83.0293 )
								if( Short_Long_Diff <= 0.451727 )
									ret := 0.352941
								if( Short_Long_Diff > 0.451727 )
									ret := -1.000000 // sell
							if( MFI > 83.0293 )
								if( Raw_Money_Flow <= 1.42101e+07 )
									ret := -0.894737 // sell
								if( Raw_Money_Flow > 1.42101e+07 )
									ret := 0.250000
				if( Negative_Money_Flow_Sum > 6.56788e+07 )
					if( MFI <= 83.2875 )
						if( MFI_Low <= 26.6717 )
							if( Positive_Money_Flow_Sum <= 1.07882e+08 )
								if( Raw_Money_Flow <= 1.79879e+07 )
									ret := 0.655172
								if( Raw_Money_Flow > 1.79879e+07 )
									ret := 0.133333
							if( Positive_Money_Flow_Sum > 1.07882e+08 )
								if( Negative_Money_Flow <= 3.27281e+06 )
									ret := -0.240000
								if( Negative_Money_Flow > 3.27281e+06 )
									ret := 0.370968
						if( MFI_Low > 26.6717 )
							if( Negative_Money_Flow <= 1.89917e+07 )
								if( Short_MA <= 210.229 )
									ret := -0.368098
								if( Short_MA > 210.229 )
									ret := 0.263158
							if( Negative_Money_Flow > 1.89917e+07 )
								if( Money_Flow_Ratio <= 3.30876 )
									ret := 0.043478
								if( Money_Flow_Ratio > 3.30876 )
									ret := 0.777778 // buy
					if( MFI > 83.2875 )
						if( Raw_Money_Flow <= 280389 )
							ret := 0.000000
						if( Raw_Money_Flow > 280389 )
							if( Raw_Money_Flow <= 5.75172e+06 )
								if( Short_MA <= 169.425 )
									ret := 0.750000 // buy
								if( Short_MA > 169.425 )
									ret := 0.960000 // buy
							if( Raw_Money_Flow > 5.75172e+06 )
								if( Short_Long_Diff <= 5.2515 )
									ret := 0.111111
								if( Short_Long_Diff > 5.2515 )
									ret := 1.000000 // buy
	if( Positive_Money_Flow > 15987.4 )
		if( Negative_Money_Flow <= 2955.23 )
			if( Raw_Money_Flow <= 70746.3 )
				if( Negative_Money_Flow_Sum <= 1.4417e+07 )
					if( Short_Long_Diff <= -0.256023 )
						if( Positive_Money_Flow_Sum <= 812102 )
							if( Negative_Money_Flow_Sum <= 1.02719e+06 )
								if( Typical_Price <= 178.281 )
									ret := -0.382022
								if( Typical_Price > 178.281 )
									ret := 0.214286
							if( Negative_Money_Flow_Sum > 1.02719e+06 )
								if( Short_Long_Diff <= -0.305899 )
									ret := 0.301205
								if( Short_Long_Diff > -0.305899 )
									ret := -0.466667
						if( Positive_Money_Flow_Sum > 812102 )
							if( Raw_Money_Flow <= 68529.9 )
								if( Raw_Money_Flow <= 43118.9 )
									ret := 0.688889
								if( Raw_Money_Flow > 43118.9 )
									ret := 0.325581
							if( Raw_Money_Flow > 68529.9 )
								ret := -0.500000
					if( Short_Long_Diff > -0.256023 )
						if( MFI <= 28.634 )
							if( MFI <= 20.684 )
								if( MFI_High <= -73.7832 )
									ret := -0.526316
								if( MFI_High > -73.7832 )
									ret := 0.081395
							if( MFI > 20.684 )
								if( Typical_Price <= 191.271 )
									ret := -0.642276
								if( Typical_Price > 191.271 )
									ret := -0.137931
						if( MFI > 28.634 )
							if( Positive_Money_Flow <= 33310.2 )
								if( Short_Long_Diff <= 0.236324 )
									ret := -0.143959
								if( Short_Long_Diff > 0.236324 )
									ret := -0.495652
							if( Positive_Money_Flow > 33310.2 )
								if( Negative_Money_Flow_Sum <= 1.01329e+06 )
									ret := 0.055831
								if( Negative_Money_Flow_Sum > 1.01329e+06 )
									ret := -0.207547
				if( Negative_Money_Flow_Sum > 1.4417e+07 )
					if( Negative_Money_Flow_Sum <= 3.10462e+07 )
						if( Typical_Price <= 156.893 )
							ret := 0.000000
						if( Typical_Price > 156.893 )
							if( Typical_Price <= 209.179 )
								if( MFI_Low <= -14.3798 )
									ret := -0.892857 // sell
								if( MFI_Low > -14.3798 )
									ret := -0.625000
							if( Typical_Price > 209.179 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.10462e+07 )
						if( Long_MA <= 157.669 )
							ret := 0.857143 // buy
						if( Long_MA > 157.669 )
							if( Short_Long_Diff <= 0.10451 )
								if( Money_Flow_Ratio <= 0.086842 )
									ret := 0.076923
								if( Money_Flow_Ratio > 0.086842 )
									ret := -0.294872
							if( Short_Long_Diff > 0.10451 )
								if( Positive_Money_Flow_Sum <= 8.99362e+07 )
									ret := -0.720930 // sell
								if( Positive_Money_Flow_Sum > 8.99362e+07 )
									ret := 0.055556
			if( Raw_Money_Flow > 70746.3 )
				if( Negative_Money_Flow_Sum <= 1.53032e+08 )
					if( Negative_Money_Flow_Sum <= 1.07216e+08 )
						if( MFI_Low <= 73.0366 )
							if( Short_Long_Diff <= -0.081381 )
								if( Raw_Money_Flow <= 1.09617e+07 )
									ret := -0.008310
								if( Raw_Money_Flow > 1.09617e+07 )
									ret := 0.225564
							if( Short_Long_Diff > -0.081381 )
								if( Negative_Money_Flow_Sum <= 4.5856e+07 )
									ret := 0.055648
								if( Negative_Money_Flow_Sum > 4.5856e+07 )
									ret := -0.129412
						if( MFI_Low > 73.0366 )
							if( Short_MA <= 190.91 )
								if( Raw_Money_Flow <= 9.75624e+07 )
									ret := -0.346939
								if( Raw_Money_Flow > 9.75624e+07 )
									ret := 0.352941
							if( Short_MA > 190.91 )
								if( Positive_Money_Flow <= 1.26078e+07 )
									ret := -0.022857
								if( Positive_Money_Flow > 1.26078e+07 )
									ret := 0.383333
					if( Negative_Money_Flow_Sum > 1.07216e+08 )
						if( Raw_Money_Flow <= 3.51717e+06 )
							if( Negative_Money_Flow_Sum <= 1.49697e+08 )
								if( Positive_Money_Flow <= 2.74978e+06 )
									ret := -0.181818
								if( Positive_Money_Flow > 2.74978e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.49697e+08 )
								if( Money_Flow_Ratio <= 3.20037 )
									ret := 0.400000
								if( Money_Flow_Ratio > 3.20037 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 3.51717e+06 )
							if( Typical_Price <= 205.62 )
								if( Positive_Money_Flow <= 6.2158e+07 )
									ret := 0.633588
								if( Positive_Money_Flow > 6.2158e+07 )
									ret := -0.375000
							if( Typical_Price > 205.62 )
								if( Typical_Price <= 228.443 )
									ret := -0.178571
								if( Typical_Price > 228.443 )
									ret := 0.833333 // buy
				if( Negative_Money_Flow_Sum > 1.53032e+08 )
					if( Negative_Money_Flow_Sum <= 2.51714e+08 )
						if( Positive_Money_Flow_Sum <= 8.02834e+06 )
							if( MFI_High <= -76.9622 )
								ret := 0.750000 // buy
							if( MFI_High > -76.9622 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 8.02834e+06 )
							if( Short_MA <= 212.355 )
								if( Positive_Money_Flow_Sum <= 1.02436e+08 )
									ret := -0.811765 // sell
								if( Positive_Money_Flow_Sum > 1.02436e+08 )
									ret := -0.272727
							if( Short_MA > 212.355 )
								if( MFI_Low <= -6.23668 )
									ret := 0.600000
								if( MFI_Low > -6.23668 )
									ret := -0.578947
					if( Negative_Money_Flow_Sum > 2.51714e+08 )
						if( Short_MA <= 165.658 )
							if( MFI_High <= -50.4915 )
								if( Negative_Money_Flow_Sum <= 3.21372e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.21372e+08 )
									ret := 0.000000
							if( MFI_High > -50.4915 )
								ret := 1.000000 // buy
						if( Short_MA > 165.658 )
							if( Positive_Money_Flow <= 810522 )
								if( MFI_Low <= -19.3586 )
									ret := -0.714286 // sell
								if( MFI_Low > -19.3586 )
									ret := 0.177778
							if( Positive_Money_Flow > 810522 )
								if( MFI_Low <= -7.80252 )
									ret := -0.692308
								if( MFI_Low > -7.80252 )
									ret := -0.114754
		if( Negative_Money_Flow > 2955.23 )
			if( Positive_Money_Flow <= 31166.9 )
				if( Raw_Money_Flow <= 65549.7 )
					if( Raw_Money_Flow <= 55835.6 )
						if( Positive_Money_Flow_Sum <= 5.17051e+07 )
							if( Short_MA <= 170.773 )
								if( Negative_Money_Flow_Sum <= 2.34717e+07 )
									ret := -0.304348
								if( Negative_Money_Flow_Sum > 2.34717e+07 )
									ret := 1.000000 // buy
							if( Short_MA > 170.773 )
								if( Raw_Money_Flow <= 54029.1 )
									ret := 0.359223
								if( Raw_Money_Flow > 54029.1 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 5.17051e+07 )
							if( Negative_Money_Flow <= 21701 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 21701 )
								ret := -0.500000
					if( Raw_Money_Flow > 55835.6 )
						if( Positive_Money_Flow <= 26335.5 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow > 26335.5 )
							if( Positive_Money_Flow <= 29102.9 )
								ret := -0.500000
							if( Positive_Money_Flow > 29102.9 )
								ret := 0.500000
				if( Raw_Money_Flow > 65549.7 )
					if( Negative_Money_Flow <= 4.54067e+06 )
						if( Negative_Money_Flow_Sum <= 345403 )
							ret := 0.666667
						if( Negative_Money_Flow_Sum > 345403 )
							if( Short_MA <= 190.819 )
								if( Raw_Money_Flow <= 1.20329e+06 )
									ret := -0.050847
								if( Raw_Money_Flow > 1.20329e+06 )
									ret := -0.800000 // sell
							if( Short_MA > 190.819 )
								if( Long_MA <= 207.815 )
									ret := -0.720930 // sell
								if( Long_MA > 207.815 )
									ret := -0.058824
					if( Negative_Money_Flow > 4.54067e+06 )
						ret := 1.000000 // buy
			if( Positive_Money_Flow > 31166.9 )
				if( MFI_Low <= 75.9267 )
					if( Negative_Money_Flow_Sum <= 3.24298e+08 )
						if( Negative_Money_Flow_Sum <= 1.25804e+08 )
							if( Negative_Money_Flow_Sum <= 1.18003e+08 )
								if( Short_Long_Diff <= -0.51284 )
									ret := 0.445378
								if( Short_Long_Diff > -0.51284 )
									ret := 0.130827
							if( Negative_Money_Flow_Sum > 1.18003e+08 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.25804e+08 )
							if( Long_MA <= 194.877 )
								if( Negative_Money_Flow_Sum <= 3.10027e+08 )
									ret := 0.170732
								if( Negative_Money_Flow_Sum > 3.10027e+08 )
									ret := 0.916667 // buy
							if( Long_MA > 194.877 )
								if( Positive_Money_Flow <= 6.40901e+06 )
									ret := 0.953488 // buy
								if( Positive_Money_Flow > 6.40901e+06 )
									ret := 0.333333
					if( Negative_Money_Flow_Sum > 3.24298e+08 )
						if( Negative_Money_Flow_Sum <= 5.13438e+08 )
							if( Short_Long_Diff <= -0.13156 )
								if( Negative_Money_Flow <= 79493.2 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow > 79493.2 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > -0.13156 )
								if( Negative_Money_Flow_Sum <= 3.80656e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 3.80656e+08 )
									ret := -0.818182 // sell
						if( Negative_Money_Flow_Sum > 5.13438e+08 )
							if( MFI <= 25.7804 )
								if( Short_MA <= 169.725 )
									ret := 0.000000
								if( Short_MA > 169.725 )
									ret := 1.000000 // buy
							if( MFI > 25.7804 )
								ret := 0.000000
				if( MFI_Low > 75.9267 )
					if( Negative_Money_Flow_Sum <= 409454 )
						if( Short_Long_Diff <= 0.244561 )
							ret := 0.000000
						if( Short_Long_Diff > 0.244561 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 409454 )
						if( Positive_Money_Flow_Sum <= 4.71349e+08 )
							if( Short_Long_Diff <= 0.095467 )
								if( Negative_Money_Flow_Sum <= 5.28339e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 5.28339e+06 )
									ret := 0.500000
							if( Short_Long_Diff > 0.095467 )
								if( MFI_Low <= 77.5299 )
									ret := 1.000000 // buy
								if( MFI_Low > 77.5299 )
									ret := 0.230769
						if( Positive_Money_Flow_Sum > 4.71349e+08 )
							ret := -0.200000
	
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
float op_operation = decision_tree_0_QCOM_1Min_1048614d(Short_Long_Diff, MA_Cross, Short_MA, Long_MA, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


