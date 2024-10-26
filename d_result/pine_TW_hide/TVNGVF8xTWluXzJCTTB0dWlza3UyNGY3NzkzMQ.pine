//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MSFT_1Min_2BM0_24f77931 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BM0_24f77931", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_24f77931(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.51855 )
		if( Negative_Money_Flow_Sum <= 3.34069e+07 )
			if( bullPower <= -0.443357 )
				if( MFI <= 19.5052 )
					if( Positive_Money_Flow <= 711991 )
						if( Negative_Money_Flow_Sum <= 2.71005e+07 )
							if( Negative_Money_Flow_Sum <= 1.1822e+07 )
								if( Negative_Money_Flow_Sum <= 1.0404e+07 )
									ret := 0.605469
								if( Negative_Money_Flow_Sum > 1.0404e+07 )
									ret := 0.052632
							if( Negative_Money_Flow_Sum > 1.1822e+07 )
								if( Negative_Money_Flow_Sum <= 1.78886e+07 )
									ret := 0.903846 // buy
								if( Negative_Money_Flow_Sum > 1.78886e+07 )
									ret := 0.586207
						if( Negative_Money_Flow_Sum > 2.71005e+07 )
							if( MFI_Low <= -4.23274 )
								if( Money_Flow_Ratio <= 0.126882 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.126882 )
									ret := -1.000000 // sell
							if( MFI_Low > -4.23274 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 711991 )
						if( Raw_Money_Flow <= 1.00946e+06 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.00946e+06 )
							ret := 0.000000
				if( MFI > 19.5052 )
					if( Positive_Money_Flow_Sum <= 1.46362e+06 )
						if( Negative_Money_Flow <= 653009 )
							if( MFI_Low <= 5.5272 )
								if( Positive_Money_Flow <= 247832 )
									ret := 0.627907
								if( Positive_Money_Flow > 247832 )
									ret := -0.600000
							if( MFI_Low > 5.5272 )
								if( Negative_Money_Flow <= 477551 )
									ret := -0.153333
								if( Negative_Money_Flow > 477551 )
									ret := 0.866667 // buy
						if( Negative_Money_Flow > 653009 )
							if( bullPower <= -0.483834 )
								if( Typical_Price <= 426.034 )
									ret := -0.850000 // sell
								if( Typical_Price > 426.034 )
									ret := -1.000000 // sell
							if( bullPower > -0.483834 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.46362e+06 )
						if( Negative_Money_Flow_Sum <= 2.78568e+07 )
							if( Negative_Money_Flow_Sum <= 1.63434e+07 )
								if( bullPower <= -0.795799 )
									ret := 0.533784
								if( bullPower > -0.795799 )
									ret := 0.356852
							if( Negative_Money_Flow_Sum > 1.63434e+07 )
								if( bearPower <= -1.57314 )
									ret := 0.652174
								if( bearPower > -1.57314 )
									ret := -0.246914
						if( Negative_Money_Flow_Sum > 2.78568e+07 )
							if( Money_Flow_Ratio <= 0.289487 )
								ret := 0.250000
							if( Money_Flow_Ratio > 0.289487 )
								if( MFI_High <= -34.0436 )
									ret := 1.000000 // buy
								if( MFI_High > -34.0436 )
									ret := 0.750000 // buy
			if( bullPower > -0.443357 )
				if( MFI <= 14.8505 )
					if( bbp <= -0.792289 )
						if( bearPower <= -2.35658 )
							if( Raw_Money_Flow <= 6.66703e+06 )
								ret := -0.800000 // sell
							if( Raw_Money_Flow > 6.66703e+06 )
								ret := 0.750000 // buy
						if( bearPower > -2.35658 )
							if( bbp <= -0.879032 )
								if( Typical_Price <= 444.605 )
									ret := 0.876543 // buy
								if( Typical_Price > 444.605 )
									ret := 0.142857
							if( bbp > -0.879032 )
								if( bullPower <= -0.147559 )
									ret := 0.604651
								if( bullPower > -0.147559 )
									ret := -0.400000
					if( bbp > -0.792289 )
						if( bearPower <= -0.582212 )
							if( bbm <= 1.42795 )
								ret := -1.000000 // sell
							if( bbm > 1.42795 )
								ret := -0.500000
						if( bearPower > -0.582212 )
							if( Negative_Money_Flow_Sum <= 3.53285e+06 )
								if( Negative_Money_Flow <= 230930 )
									ret := 0.000000
								if( Negative_Money_Flow > 230930 )
									ret := -0.818182 // sell
							if( Negative_Money_Flow_Sum > 3.53285e+06 )
								if( Negative_Money_Flow <= 344593 )
									ret := 0.256757
								if( Negative_Money_Flow > 344593 )
									ret := 0.651515
				if( MFI > 14.8505 )
					if( Positive_Money_Flow_Sum <= 958336 )
						if( bullPower <= -0.269128 )
							if( MFI_Low <= 15.6905 )
								if( MFI_Low <= -0.178711 )
									ret := -0.540000
								if( MFI_Low > -0.178711 )
									ret := -0.067416
							if( MFI_Low > 15.6905 )
								if( Money_Flow_Ratio <= 0.718988 )
									ret := -0.947368 // sell
								if( Money_Flow_Ratio > 0.718988 )
									ret := -0.285714
						if( bullPower > -0.269128 )
							if( MFI <= 16.5021 )
								ret := -0.500000
							if( MFI > 16.5021 )
								if( Positive_Money_Flow_Sum <= 903013 )
									ret := 0.480000
								if( Positive_Money_Flow_Sum > 903013 )
									ret := -0.285714
					if( Positive_Money_Flow_Sum > 958336 )
						if( Money_Flow_Ratio <= 0.408794 )
							if( Raw_Money_Flow <= 2.68647e+06 )
								if( Negative_Money_Flow <= 210624 )
									ret := -0.049774
								if( Negative_Money_Flow > 210624 )
									ret := 0.226804
							if( Raw_Money_Flow > 2.68647e+06 )
								if( Negative_Money_Flow <= 5.95792e+06 )
									ret := -0.500000
								if( Negative_Money_Flow > 5.95792e+06 )
									ret := 0.147059
						if( Money_Flow_Ratio > 0.408794 )
							if( Negative_Money_Flow_Sum <= 7.64976e+06 )
								if( bbp <= -0.627658 )
									ret := 0.382888
								if( bbp > -0.627658 )
									ret := 0.219885
							if( Negative_Money_Flow_Sum > 7.64976e+06 )
								if( Negative_Money_Flow_Sum <= 2.14366e+07 )
									ret := 0.048140
								if( Negative_Money_Flow_Sum > 2.14366e+07 )
									ret := 0.408163
		if( Negative_Money_Flow_Sum > 3.34069e+07 )
			if( bbm <= 0.730478 )
				if( MFI <= 25.4904 )
					if( bullPower <= -0.918485 )
						if( Typical_Price <= 422.225 )
							if( Typical_Price <= 401.581 )
								if( bullPower <= -0.92725 )
									ret := 0.363636
								if( bullPower > -0.92725 )
									ret := -1.000000 // sell
							if( Typical_Price > 401.581 )
								if( Negative_Money_Flow_Sum <= 5.12485e+08 )
									ret := -0.466667
								if( Negative_Money_Flow_Sum > 5.12485e+08 )
									ret := -0.870370 // sell
						if( Typical_Price > 422.225 )
							if( Raw_Money_Flow <= 2.23852e+07 )
								if( MFI_Low <= -1.42534 )
									ret := 0.571429
								if( MFI_Low > -1.42534 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.23852e+07 )
								if( MFI_Low <= -10.5612 )
									ret := 0.058824
								if( MFI_Low > -10.5612 )
									ret := -0.666667
					if( bullPower > -0.918485 )
						if( Typical_Price <= 404.614 )
							if( Negative_Money_Flow_Sum <= 2.07571e+08 )
								if( MFI_High <= -70.8063 )
									ret := 0.230769
								if( MFI_High > -70.8063 )
									ret := -0.460581
							if( Negative_Money_Flow_Sum > 2.07571e+08 )
								if( Money_Flow_Ratio <= 0.235742 )
									ret := -0.055556
								if( Money_Flow_Ratio > 0.235742 )
									ret := 0.420000
						if( Typical_Price > 404.614 )
							if( Raw_Money_Flow <= 1.72736e+07 )
								if( Raw_Money_Flow <= 1.03576e+06 )
									ret := 0.442308
								if( Raw_Money_Flow > 1.03576e+06 )
									ret := 0.077948
							if( Raw_Money_Flow > 1.72736e+07 )
								if( MFI <= 24.8182 )
									ret := -0.051622
								if( MFI > 24.8182 )
									ret := -0.522388
				if( MFI > 25.4904 )
					if( Negative_Money_Flow_Sum <= 7.62414e+07 )
						if( Negative_Money_Flow <= 1.52769e+07 )
							if( Negative_Money_Flow_Sum <= 7.15516e+07 )
								if( bullPower <= -0.349832 )
									ret := -0.405405
								if( bullPower > -0.349832 )
									ret := 0.023199
							if( Negative_Money_Flow_Sum > 7.15516e+07 )
								if( Raw_Money_Flow <= 6.38963e+06 )
									ret := 0.100000
								if( Raw_Money_Flow > 6.38963e+06 )
									ret := -0.423358
						if( Negative_Money_Flow > 1.52769e+07 )
							if( Negative_Money_Flow <= 1.64999e+07 )
								if( Typical_Price <= 421.688 )
									ret := 1.000000 // buy
								if( Typical_Price > 421.688 )
									ret := 0.000000
							if( Negative_Money_Flow > 1.64999e+07 )
								if( bullPower <= -0.351954 )
									ret := 1.000000 // buy
								if( bullPower > -0.351954 )
									ret := 0.241379
					if( Negative_Money_Flow_Sum > 7.62414e+07 )
						if( Negative_Money_Flow_Sum <= 3.25995e+08 )
							if( Negative_Money_Flow_Sum <= 7.93427e+07 )
								if( Typical_Price <= 408.022 )
									ret := -0.428571
								if( Typical_Price > 408.022 )
									ret := 0.595041
							if( Negative_Money_Flow_Sum > 7.93427e+07 )
								if( Money_Flow_Ratio <= 1.19499 )
									ret := 0.121735
								if( Money_Flow_Ratio > 1.19499 )
									ret := -0.083095
						if( Negative_Money_Flow_Sum > 3.25995e+08 )
							if( Negative_Money_Flow <= 3.28372e+07 )
								if( Typical_Price <= 452.38 )
									ret := 0.523529
								if( Typical_Price > 452.38 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow > 3.28372e+07 )
								if( Positive_Money_Flow_Sum <= 1.85764e+08 )
									ret := -0.461538
								if( Positive_Money_Flow_Sum > 1.85764e+08 )
									ret := 0.285714
			if( bbm > 0.730478 )
				if( Raw_Money_Flow <= 1.10584e+08 )
					if( Typical_Price <= 438.132 )
						if( Money_Flow_Ratio <= 0.46081 )
							if( Positive_Money_Flow <= 9.79886e+07 )
								if( MFI_Low <= 8.59145 )
									ret := 0.311888
								if( MFI_Low > 8.59145 )
									ret := 0.700935 // buy
							if( Positive_Money_Flow > 9.79886e+07 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.46081 )
							if( bullPower <= 0.67646 )
								if( MFI <= 34.9025 )
									ret := -0.136842
								if( MFI > 34.9025 )
									ret := 0.204301
							if( bullPower > 0.67646 )
								if( MFI_Low <= 35.1595 )
									ret := -1.000000 // sell
								if( MFI_Low > 35.1595 )
									ret := -0.750000 // sell
					if( Typical_Price > 438.132 )
						if( Positive_Money_Flow_Sum <= 6.37369e+07 )
							if( bbm <= 0.880533 )
								if( Positive_Money_Flow <= 5.11157e+06 )
									ret := 0.148148
								if( Positive_Money_Flow > 5.11157e+06 )
									ret := -0.900000 // sell
							if( bbm > 0.880533 )
								if( Typical_Price <= 442.209 )
									ret := 0.000000
								if( Typical_Price > 442.209 )
									ret := -0.833333 // sell
						if( Positive_Money_Flow_Sum > 6.37369e+07 )
							if( MFI <= 36.1157 )
								if( Typical_Price <= 441.62 )
									ret := -0.052632
								if( Typical_Price > 441.62 )
									ret := 0.587302
							if( MFI > 36.1157 )
								if( MFI <= 75.2747 )
									ret := -0.250000
								if( MFI > 75.2747 )
									ret := 0.750000 // buy
				if( Raw_Money_Flow > 1.10584e+08 )
					if( Negative_Money_Flow <= 3.2766e+08 )
						if( bbm <= 1.05427 )
							if( MFI <= 23.521 )
								if( Money_Flow_Ratio <= 0.048787 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 0.048787 )
									ret := -0.625000
							if( MFI > 23.521 )
								ret := 1.000000 // buy
						if( bbm > 1.05427 )
							if( Negative_Money_Flow_Sum <= 2.33217e+09 )
								if( Negative_Money_Flow <= 1.1794e+08 )
									ret := -0.962963 // sell
								if( Negative_Money_Flow > 1.1794e+08 )
									ret := -0.363636
							if( Negative_Money_Flow_Sum > 2.33217e+09 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow > 3.2766e+08 )
						if( Negative_Money_Flow <= 1.47117e+09 )
							if( Typical_Price <= 409.858 )
								ret := 1.000000 // buy
							if( Typical_Price > 409.858 )
								if( MFI <= 4.67765 )
									ret := 0.909091 // buy
								if( MFI > 4.67765 )
									ret := -0.285714
						if( Negative_Money_Flow > 1.47117e+09 )
							ret := -0.333333
	if( bbp > -0.51855 )
		if( bearPower <= 0.26578 )
			if( Positive_Money_Flow_Sum <= 1.65766e+06 )
				if( MFI_Low <= 6.66818 )
					if( Typical_Price <= 435.354 )
						if( bearPower <= -0.595011 )
							if( Typical_Price <= 422.2 )
								ret := 1.000000 // buy
							if( Typical_Price > 422.2 )
								ret := 0.200000
						if( bearPower > -0.595011 )
							if( Typical_Price <= 417.806 )
								if( Positive_Money_Flow <= 122309 )
									ret := 0.118881
								if( Positive_Money_Flow > 122309 )
									ret := -0.196721
							if( Typical_Price > 417.806 )
								if( MFI_Low <= -3.49787 )
									ret := -0.288288
								if( MFI_Low > -3.49787 )
									ret := -0.015152
					if( Typical_Price > 435.354 )
						if( Negative_Money_Flow_Sum <= 4.18243e+06 )
							if( bbm <= 0.080794 )
								if( MFI_High <= -54.4678 )
									ret := 0.343137
								if( MFI_High > -54.4678 )
									ret := -0.181818
							if( bbm > 0.080794 )
								if( Negative_Money_Flow_Sum <= 3.69864e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 3.69864e+06 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 4.18243e+06 )
							if( MFI_High <= -59.3406 )
								if( Negative_Money_Flow_Sum <= 8.22893e+06 )
									ret := 0.287356
								if( Negative_Money_Flow_Sum > 8.22893e+06 )
									ret := 0.014706
							if( MFI_High > -59.3406 )
								if( bbp <= -0.078321 )
									ret := -0.789474 // sell
								if( bbp > -0.078321 )
									ret := 0.230769
				if( MFI_Low > 6.66818 )
					if( Typical_Price <= 446.445 )
						if( Negative_Money_Flow_Sum <= 3.00157e+06 )
							if( Negative_Money_Flow_Sum <= 2.70732e+06 )
								if( BBPower_Color <= 0.5 )
									ret := 0.249249
								if( BBPower_Color > 0.5 )
									ret := 0.126706
							if( Negative_Money_Flow_Sum > 2.70732e+06 )
								if( bbm <= 0.020673 )
									ret := -0.263736
								if( bbm > 0.020673 )
									ret := 0.285714
						if( Negative_Money_Flow_Sum > 3.00157e+06 )
							if( Raw_Money_Flow <= 2.16669e+06 )
								if( Raw_Money_Flow <= 176845 )
									ret := 0.194444
								if( Raw_Money_Flow > 176845 )
									ret := 0.570470
							if( Raw_Money_Flow > 2.16669e+06 )
								ret := -1.000000 // sell
					if( Typical_Price > 446.445 )
						if( Negative_Money_Flow_Sum <= 2.19738e+06 )
							if( Negative_Money_Flow_Sum <= 1.72081e+06 )
								if( Negative_Money_Flow <= 607383 )
									ret := 0.020619
								if( Negative_Money_Flow > 607383 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.72081e+06 )
								if( bbp <= -0.149526 )
									ret := 0.633333
								if( bbp > -0.149526 )
									ret := 0.266667
						if( Negative_Money_Flow_Sum > 2.19738e+06 )
							if( bearPower <= -0.134154 )
								if( Typical_Price <= 457.725 )
									ret := -0.620690
								if( Typical_Price > 457.725 )
									ret := 0.250000
							if( bearPower > -0.134154 )
								if( bearPower <= 0.156076 )
									ret := -0.025974
								if( bearPower > 0.156076 )
									ret := -0.583333
			if( Positive_Money_Flow_Sum > 1.65766e+06 )
				if( Positive_Money_Flow <= 1.51124e+07 )
					if( Negative_Money_Flow_Sum <= 586976 )
						if( Negative_Money_Flow <= 665.709 )
							if( Typical_Price <= 413.73 )
								if( Positive_Money_Flow_Sum <= 2.71266e+06 )
									ret := 0.696970
								if( Positive_Money_Flow_Sum > 2.71266e+06 )
									ret := 0.090909
							if( Typical_Price > 413.73 )
								if( bbp <= 0.549231 )
									ret := -0.040000
								if( bbp > 0.549231 )
									ret := 0.833333 // buy
						if( Negative_Money_Flow > 665.709 )
							if( Raw_Money_Flow <= 156760 )
								if( Positive_Money_Flow_Sum <= 2.29884e+06 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 2.29884e+06 )
									ret := 0.816901 // buy
							if( Raw_Money_Flow > 156760 )
								if( Positive_Money_Flow <= 50826.2 )
									ret := 0.157895
								if( Positive_Money_Flow > 50826.2 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 586976 )
						if( Positive_Money_Flow_Sum <= 3.48572e+07 )
							if( BBPower_Color <= 0.5 )
								if( Positive_Money_Flow_Sum <= 9.5952e+06 )
									ret := 0.099237
								if( Positive_Money_Flow_Sum > 9.5952e+06 )
									ret := -0.038775
							if( BBPower_Color > 0.5 )
								if( bbm <= 0.709536 )
									ret := -0.075907
								if( bbm > 0.709536 )
									ret := -0.288095
						if( Positive_Money_Flow_Sum > 3.48572e+07 )
							if( Positive_Money_Flow_Sum <= 2.00191e+08 )
								if( Typical_Price <= 428.568 )
									ret := 0.059719
								if( Typical_Price > 428.568 )
									ret := 0.002774
							if( Positive_Money_Flow_Sum > 2.00191e+08 )
								if( Positive_Money_Flow_Sum <= 3.24091e+08 )
									ret := -0.149506
								if( Positive_Money_Flow_Sum > 3.24091e+08 )
									ret := 0.066358
				if( Positive_Money_Flow > 1.51124e+07 )
					if( Positive_Money_Flow_Sum <= 2.29621e+08 )
						if( Positive_Money_Flow_Sum <= 1.1112e+08 )
							if( bbm <= 0.634625 )
								if( bearPower <= -0.532595 )
									ret := -0.857143 // sell
								if( bearPower > -0.532595 )
									ret := 0.139283
							if( bbm > 0.634625 )
								if( MFI_High <= -72.6027 )
									ret := -1.000000 // sell
								if( MFI_High > -72.6027 )
									ret := -0.131086
						if( Positive_Money_Flow_Sum > 1.1112e+08 )
							if( bbp <= 0.482599 )
								if( MFI_Low <= -7.19796 )
									ret := -0.692308
								if( MFI_Low > -7.19796 )
									ret := 0.292941
							if( bbp > 0.482599 )
								if( Negative_Money_Flow_Sum <= 1.08468e+08 )
									ret := 0.211460
								if( Negative_Money_Flow_Sum > 1.08468e+08 )
									ret := -0.034404
					if( Positive_Money_Flow_Sum > 2.29621e+08 )
						if( Positive_Money_Flow_Sum <= 3.03466e+09 )
							if( Negative_Money_Flow_Sum <= 1.2081e+08 )
								if( Positive_Money_Flow <= 1.79266e+07 )
									ret := -0.705882 // sell
								if( Positive_Money_Flow > 1.79266e+07 )
									ret := -0.084388
							if( Negative_Money_Flow_Sum > 1.2081e+08 )
								if( Positive_Money_Flow_Sum <= 3.56844e+08 )
									ret := 0.182278
								if( Positive_Money_Flow_Sum > 3.56844e+08 )
									ret := -0.086124
						if( Positive_Money_Flow_Sum > 3.03466e+09 )
							if( Typical_Price <= 429.052 )
								if( Raw_Money_Flow <= 4.80873e+07 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 4.80873e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 429.052 )
								ret := 0.142857
		if( bearPower > 0.26578 )
			if( Positive_Money_Flow_Sum <= 3.01064e+07 )
				if( Money_Flow_Ratio <= 4.17793 )
					if( Positive_Money_Flow_Sum <= 4.72868e+06 )
						if( bbp <= 1.15557 )
							if( Positive_Money_Flow_Sum <= 4.65355e+06 )
								if( bbm <= 0.008074 )
									ret := -0.169553
								if( bbm > 0.008074 )
									ret := 0.012170
							if( Positive_Money_Flow_Sum > 4.65355e+06 )
								if( Negative_Money_Flow <= 82042.7 )
									ret := 0.826087 // buy
								if( Negative_Money_Flow > 82042.7 )
									ret := 0.000000
						if( bbp > 1.15557 )
							if( Typical_Price <= 415.902 )
								if( Raw_Money_Flow <= 98676.2 )
									ret := -0.500000
								if( Raw_Money_Flow > 98676.2 )
									ret := 0.428125
							if( Typical_Price > 415.902 )
								if( Typical_Price <= 444.018 )
									ret := 0.081181
								if( Typical_Price > 444.018 )
									ret := -0.328125
					if( Positive_Money_Flow_Sum > 4.72868e+06 )
						if( Raw_Money_Flow <= 326949 )
							if( Negative_Money_Flow_Sum <= 2.49448e+06 )
								if( Negative_Money_Flow_Sum <= 1.49459e+06 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 1.49459e+06 )
									ret := -0.763889 // sell
							if( Negative_Money_Flow_Sum > 2.49448e+06 )
								if( Positive_Money_Flow <= 298918 )
									ret := -0.302521
								if( Positive_Money_Flow > 298918 )
									ret := -0.812500 // sell
						if( Raw_Money_Flow > 326949 )
							if( Raw_Money_Flow <= 2.29811e+06 )
								if( Typical_Price <= 411.206 )
									ret := 0.075099
								if( Typical_Price > 411.206 )
									ret := -0.214700
							if( Raw_Money_Flow > 2.29811e+06 )
								if( Typical_Price <= 429.909 )
									ret := -0.325000
								if( Typical_Price > 429.909 )
									ret := -0.760000 // sell
				if( Money_Flow_Ratio > 4.17793 )
					if( bbp <= 2.30655 )
						if( Negative_Money_Flow_Sum <= 601911 )
							if( Money_Flow_Ratio <= 5.11378 )
								if( Raw_Money_Flow <= 209242 )
									ret := -0.133333
								if( Raw_Money_Flow > 209242 )
									ret := 0.666667
							if( Money_Flow_Ratio > 5.11378 )
								if( bbm <= 0.313576 )
									ret := -0.313514
								if( bbm > 0.313576 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 601911 )
							if( Typical_Price <= 396.062 )
								if( bbm <= 0.45 )
									ret := -0.222222
								if( bbm > 0.45 )
									ret := 0.600000
							if( Typical_Price > 396.062 )
								if( bearPower <= 0.319767 )
									ret := -0.292683
								if( bearPower > 0.319767 )
									ret := -0.614796
					if( bbp > 2.30655 )
						if( Positive_Money_Flow_Sum <= 1.15281e+07 )
							if( Positive_Money_Flow <= 1.53782e+06 )
								if( bullPower <= 1.32241 )
									ret := -0.250000
								if( bullPower > 1.32241 )
									ret := 0.622642
							if( Positive_Money_Flow > 1.53782e+06 )
								ret := -0.428571
						if( Positive_Money_Flow_Sum > 1.15281e+07 )
							if( MFI_Low <= 63.4508 )
								ret := -1.000000 // sell
							if( MFI_Low > 63.4508 )
								if( Positive_Money_Flow <= 1.16425e+06 )
									ret := 0.166667
								if( Positive_Money_Flow > 1.16425e+06 )
									ret := -0.900000 // sell
			if( Positive_Money_Flow_Sum > 3.01064e+07 )
				if( MFI_Low <= 29.0963 )
					if( Positive_Money_Flow <= 7.00196e+07 )
						if( Raw_Money_Flow <= 2.65208e+07 )
							if( Typical_Price <= 459.433 )
								if( Positive_Money_Flow_Sum <= 1.75636e+08 )
									ret := 0.086667
								if( Positive_Money_Flow_Sum > 1.75636e+08 )
									ret := -0.477477
							if( Typical_Price > 459.433 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 2.65208e+07 )
							if( MFI_High <= -44.5684 )
								if( MFI_Low <= 2.8697 )
									ret := -0.823529 // sell
								if( MFI_Low > 2.8697 )
									ret := 0.100000
							if( MFI_High > -44.5684 )
								if( MFI_High <= -34.9496 )
									ret := -0.810526 // sell
								if( MFI_High > -34.9496 )
									ret := -0.312500
					if( Positive_Money_Flow > 7.00196e+07 )
						if( Positive_Money_Flow_Sum <= 6.0424e+08 )
							if( bbp <= 1.74901 )
								ret := -0.500000
							if( bbp > 1.74901 )
								if( bullPower <= 2.05265 )
									ret := 0.750000 // buy
								if( bullPower > 2.05265 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.0424e+08 )
							ret := -0.571429
				if( MFI_Low > 29.0963 )
					if( bearPower <= 1.25301 )
						if( bullPower <= 1.18535 )
							if( bullPower <= 0.670281 )
								if( MFI <= 84.3487 )
									ret := 0.154351
								if( MFI > 84.3487 )
									ret := -0.018100
							if( bullPower > 0.670281 )
								if( MFI_High <= -3.63033 )
									ret := 0.050320
								if( MFI_High > -3.63033 )
									ret := -0.160398
						if( bullPower > 1.18535 )
							if( Positive_Money_Flow_Sum <= 2.62343e+08 )
								if( Raw_Money_Flow <= 5.29314e+07 )
									ret := 0.067925
								if( Raw_Money_Flow > 5.29314e+07 )
									ret := -0.548387
							if( Positive_Money_Flow_Sum > 2.62343e+08 )
								if( Raw_Money_Flow <= 3.28895e+07 )
									ret := 0.528205
								if( Raw_Money_Flow > 3.28895e+07 )
									ret := 0.112903
					if( bearPower > 1.25301 )
						if( BBPower_Color <= 0.5 )
							if( Negative_Money_Flow_Sum <= 1.68884e+08 )
								ret := -0.600000
							if( Negative_Money_Flow_Sum > 1.68884e+08 )
								if( Positive_Money_Flow_Sum <= 2.42405e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.42405e+09 )
									ret := 0.000000
						if( BBPower_Color > 0.5 )
							if( Positive_Money_Flow <= 7.29165e+07 )
								if( MFI_Low <= 45.0004 )
									ret := 0.428571
								if( MFI_Low > 45.0004 )
									ret := -0.495868
							if( Positive_Money_Flow > 7.29165e+07 )
								if( Money_Flow_Ratio <= 7.91913 )
									ret := -0.400000
								if( Money_Flow_Ratio > 7.91913 )
									ret := 0.636364
	
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
float op_operation = decision_tree_0_MSFT_1Min_24f77931(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


