//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: HUBS_15Min_2MM0_5d5d9fb7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2MM0_5d5d9fb7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_5d5d9fb7(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI_High <= -30.3037 )
		if( Positive_Money_Flow <= 1.28821e+06 )
			if( Raw_Money_Flow <= 2.30009e+07 )
				if( Long_MA <= 177.109 )
					if( Positive_Money_Flow_Sum <= 8.57651e+06 )
						if( Raw_Money_Flow <= 4.39122e+06 )
							if( Negative_Money_Flow <= 403924 )
								if( Negative_Money_Flow_Sum <= 5.20873e+07 )
									ret := 0.061954
								if( Negative_Money_Flow_Sum > 5.20873e+07 )
									ret := -0.700000 // sell
							if( Negative_Money_Flow > 403924 )
								if( Positive_Money_Flow_Sum <= 4.68019e+06 )
									ret := 0.020970
								if( Positive_Money_Flow_Sum > 4.68019e+06 )
									ret := -0.200286
						if( Raw_Money_Flow > 4.39122e+06 )
							if( Raw_Money_Flow <= 7.82984e+06 )
								if( Positive_Money_Flow_Sum <= 8.20486e+06 )
									ret := 0.581081
								if( Positive_Money_Flow_Sum > 8.20486e+06 )
									ret := -0.105263
							if( Raw_Money_Flow > 7.82984e+06 )
								if( Short_Long_Diff <= -0.307518 )
									ret := -0.093750
								if( Short_Long_Diff > -0.307518 )
									ret := 0.618182
					if( Positive_Money_Flow_Sum > 8.57651e+06 )
						if( Positive_Money_Flow_Sum <= 1.05792e+07 )
							if( Negative_Money_Flow <= 2.65877e+06 )
								if( MFI_Low <= 27.8882 )
									ret := 0.260398
								if( MFI_Low > 27.8882 )
									ret := 0.859375 // buy
							if( Negative_Money_Flow > 2.65877e+06 )
								if( Negative_Money_Flow_Sum <= 4.20272e+07 )
									ret := 0.625514
								if( Negative_Money_Flow_Sum > 4.20272e+07 )
									ret := 0.155556
						if( Positive_Money_Flow_Sum > 1.05792e+07 )
							if( MFI <= 42.5115 )
								if( MFI <= 10.2298 )
									ret := 0.833333 // buy
								if( MFI > 10.2298 )
									ret := 0.002911
							if( MFI > 42.5115 )
								if( Negative_Money_Flow_Sum <= 1.38714e+07 )
									ret := -0.251613
								if( Negative_Money_Flow_Sum > 1.38714e+07 )
									ret := 0.245267
				if( Long_MA > 177.109 )
					if( Raw_Money_Flow <= 1.9452e+07 )
						if( MFI_High <= -42.3637 )
							if( Long_MA <= 191.686 )
								if( Positive_Money_Flow_Sum <= 1.92911e+07 )
									ret := -0.183471
								if( Positive_Money_Flow_Sum > 1.92911e+07 )
									ret := 0.298969
							if( Long_MA > 191.686 )
								if( Positive_Money_Flow_Sum <= 8.49773e+06 )
									ret := 0.229927
								if( Positive_Money_Flow_Sum > 8.49773e+06 )
									ret := 0.037135
						if( MFI_High > -42.3637 )
							if( Long_MA <= 540.419 )
								if( Short_Long_Diff <= 3.07544 )
									ret := -0.086228
								if( Short_Long_Diff > 3.07544 )
									ret := 0.194757
							if( Long_MA > 540.419 )
								if( MFI_High <= -34.8192 )
									ret := 0.011236
								if( MFI_High > -34.8192 )
									ret := 0.310448
					if( Raw_Money_Flow > 1.9452e+07 )
						if( Money_Flow_Ratio <= 0.909042 )
							if( Positive_Money_Flow_Sum <= 1.39749e+08 )
								if( Negative_Money_Flow_Sum <= 2.98518e+08 )
									ret := -0.243038
								if( Negative_Money_Flow_Sum > 2.98518e+08 )
									ret := 0.730769 // buy
							if( Positive_Money_Flow_Sum > 1.39749e+08 )
								if( MFI <= 35.4061 )
									ret := -0.785714 // sell
								if( MFI > 35.4061 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.909042 )
							if( Typical_Price <= 409.51 )
								ret := 1.000000 // buy
							if( Typical_Price > 409.51 )
								ret := 0.375000
			if( Raw_Money_Flow > 2.30009e+07 )
				if( Raw_Money_Flow <= 3.64317e+07 )
					if( Positive_Money_Flow_Sum <= 1.18223e+08 )
						if( Short_Long_Diff <= 3.87282 )
							if( MFI_High <= -44.4817 )
								if( Raw_Money_Flow <= 2.58091e+07 )
									ret := 0.433735
								if( Raw_Money_Flow > 2.58091e+07 )
									ret := 0.203501
							if( MFI_High > -44.4817 )
								if( Short_MA <= 291.204 )
									ret := 0.095238
								if( Short_MA > 291.204 )
									ret := 0.653061
						if( Short_Long_Diff > 3.87282 )
							ret := -0.523810
					if( Positive_Money_Flow_Sum > 1.18223e+08 )
						if( MFI_Low <= 18.5439 )
							if( Negative_Money_Flow_Sum <= 2.68026e+08 )
								ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 2.68026e+08 )
								ret := -0.100000
						if( MFI_Low > 18.5439 )
							if( Long_MA <= 670.407 )
								if( Money_Flow_Ratio <= 0.779795 )
									ret := -0.777778 // sell
								if( Money_Flow_Ratio > 0.779795 )
									ret := 0.285714
							if( Long_MA > 670.407 )
								ret := -0.846154 // sell
				if( Raw_Money_Flow > 3.64317e+07 )
					if( Typical_Price <= 639.16 )
						if( Positive_Money_Flow_Sum <= 6.13726e+07 )
							if( Negative_Money_Flow_Sum <= 8.14218e+07 )
								if( Money_Flow_Ratio <= 0.279879 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.279879 )
									ret := 0.033333
							if( Negative_Money_Flow_Sum > 8.14218e+07 )
								if( MFI_Low <= 11.3069 )
									ret := -0.155756
								if( MFI_Low > 11.3069 )
									ret := -0.653846
						if( Positive_Money_Flow_Sum > 6.13726e+07 )
							if( Negative_Money_Flow_Sum <= 9.22644e+07 )
								if( MFI_Low <= 26.5257 )
									ret := -0.900000 // sell
								if( MFI_Low > 26.5257 )
									ret := -0.550000
							if( Negative_Money_Flow_Sum > 9.22644e+07 )
								if( MFI <= 39.6421 )
									ret := 0.425532
								if( MFI > 39.6421 )
									ret := 0.058252
					if( Typical_Price > 639.16 )
						if( Long_MA <= 684.361 )
							if( MFI <= 30.9776 )
								ret := 0.294118
							if( MFI > 30.9776 )
								if( MFI_Low <= 19.899 )
									ret := 1.000000 // buy
								if( MFI_Low > 19.899 )
									ret := 0.562500
						if( Long_MA > 684.361 )
							if( MFI_Low <= 21.2959 )
								if( Negative_Money_Flow_Sum <= 1.62982e+08 )
									ret := 0.578947
								if( Negative_Money_Flow_Sum > 1.62982e+08 )
									ret := -0.266667
							if( MFI_Low > 21.2959 )
								ret := -0.416667
		if( Positive_Money_Flow > 1.28821e+06 )
			if( Money_Flow_Ratio <= 0.89827 )
				if( Short_MA <= 745.928 )
					if( Positive_Money_Flow <= 1.51599e+07 )
						if( Negative_Money_Flow_Sum <= 2.2095e+08 )
							if( Short_MA <= 133.687 )
								if( MFI <= 40.9854 )
									ret := 0.023944
								if( MFI > 40.9854 )
									ret := 0.210366
							if( Short_MA > 133.687 )
								if( Money_Flow_Ratio <= 0.441428 )
									ret := 0.015110
								if( Money_Flow_Ratio > 0.441428 )
									ret := -0.063588
						if( Negative_Money_Flow_Sum > 2.2095e+08 )
							if( Negative_Money_Flow_Sum <= 3.38899e+08 )
								if( Long_MA <= 550.773 )
									ret := -0.880435 // sell
								if( Long_MA > 550.773 )
									ret := -0.449275
							if( Negative_Money_Flow_Sum > 3.38899e+08 )
								if( Typical_Price <= 585.432 )
									ret := -0.222222
								if( Typical_Price > 585.432 )
									ret := 0.592593
					if( Positive_Money_Flow > 1.51599e+07 )
						if( Short_Long_Diff <= -0.253955 )
							if( MFI_Low <= 22.846 )
								if( Typical_Price <= 358.684 )
									ret := 0.681159
								if( Typical_Price > 358.684 )
									ret := 0.246599
							if( MFI_Low > 22.846 )
								if( Raw_Money_Flow <= 2.97446e+07 )
									ret := 0.129032
								if( Raw_Money_Flow > 2.97446e+07 )
									ret := -0.845070 // sell
						if( Short_Long_Diff > -0.253955 )
							if( MFI <= 42.1951 )
								if( Positive_Money_Flow <= 1.69517e+07 )
									ret := -0.277778
								if( Positive_Money_Flow > 1.69517e+07 )
									ret := -0.793103 // sell
							if( MFI > 42.1951 )
								if( Money_Flow_Ratio <= 0.781937 )
									ret := 0.640000
								if( Money_Flow_Ratio > 0.781937 )
									ret := -0.177778
				if( Short_MA > 745.928 )
					if( Positive_Money_Flow_Sum <= 1.06369e+08 )
						if( Raw_Money_Flow <= 8.60702e+06 )
							if( MFI_Low <= 14.4751 )
								ret := 0.176471
							if( MFI_Low > 14.4751 )
								ret := -0.333333
						if( Raw_Money_Flow > 8.60702e+06 )
							if( Money_Flow_Ratio <= 0.274384 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.274384 )
								if( Negative_Money_Flow_Sum <= 8.35861e+07 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 8.35861e+07 )
									ret := -0.586667
					if( Positive_Money_Flow_Sum > 1.06369e+08 )
						if( Negative_Money_Flow_Sum <= 1.90596e+08 )
							ret := 0.440000
						if( Negative_Money_Flow_Sum > 1.90596e+08 )
							ret := -0.375000
			if( Money_Flow_Ratio > 0.89827 )
				if( MFI_Low <= 28.8402 )
					if( Positive_Money_Flow_Sum <= 4.59649e+07 )
						if( Short_MA <= 67.2605 )
							ret := -0.833333 // sell
						if( Short_MA > 67.2605 )
							if( Raw_Money_Flow <= 1.21379e+07 )
								if( MFI <= 47.4658 )
									ret := 0.538462
								if( MFI > 47.4658 )
									ret := 0.107872
							if( Raw_Money_Flow > 1.21379e+07 )
								ret := -0.600000
					if( Positive_Money_Flow_Sum > 4.59649e+07 )
						if( Positive_Money_Flow <= 2.0296e+07 )
							if( Negative_Money_Flow_Sum <= 9.54059e+07 )
								if( Negative_Money_Flow_Sum <= 6.0636e+07 )
									ret := 0.577778
								if( Negative_Money_Flow_Sum > 6.0636e+07 )
									ret := 0.206061
							if( Negative_Money_Flow_Sum > 9.54059e+07 )
								if( Raw_Money_Flow <= 6.52241e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 6.52241e+06 )
									ret := 0.730769 // buy
						if( Positive_Money_Flow > 2.0296e+07 )
							if( Positive_Money_Flow <= 2.55299e+07 )
								if( Positive_Money_Flow_Sum <= 1.19817e+08 )
									ret := -0.235294
								if( Positive_Money_Flow_Sum > 1.19817e+08 )
									ret := -0.818182 // sell
							if( Positive_Money_Flow > 2.55299e+07 )
								if( Positive_Money_Flow_Sum <= 1.36141e+08 )
									ret := 0.631579
								if( Positive_Money_Flow_Sum > 1.36141e+08 )
									ret := -0.750000 // sell
				if( MFI_Low > 28.8402 )
					if( Negative_Money_Flow_Sum <= 8.63248e+07 )
						if( Negative_Money_Flow_Sum <= 6.03145e+07 )
							if( Long_MA <= 152.342 )
								if( Positive_Money_Flow <= 3.66529e+06 )
									ret := -0.081633
								if( Positive_Money_Flow > 3.66529e+06 )
									ret := -0.620690
							if( Long_MA > 152.342 )
								if( Positive_Money_Flow <= 4.96793e+06 )
									ret := -0.176056
								if( Positive_Money_Flow > 4.96793e+06 )
									ret := 0.292929
						if( Negative_Money_Flow_Sum > 6.03145e+07 )
							if( MFI_Low <= 29.5736 )
								if( Positive_Money_Flow_Sum <= 8.23829e+07 )
									ret := -0.419355
								if( Positive_Money_Flow_Sum > 8.23829e+07 )
									ret := -1.000000 // sell
							if( MFI_Low > 29.5736 )
								ret := 0.111111
					if( Negative_Money_Flow_Sum > 8.63248e+07 )
						if( MFI_High <= -31.0322 )
							ret := -0.454545
						if( MFI_High > -31.0322 )
							if( Positive_Money_Flow <= 4.10373e+06 )
								ret := 0.928571 // buy
							if( Positive_Money_Flow > 4.10373e+06 )
								if( Raw_Money_Flow <= 9.83151e+06 )
									ret := -0.333333
								if( Raw_Money_Flow > 9.83151e+06 )
									ret := 0.333333
	if( MFI_High > -30.3037 )
		if( Raw_Money_Flow <= 1.67239e+06 )
			if( Typical_Price <= 370.392 )
				if( Short_Long_Diff <= -2.16401 )
					if( Short_MA <= 306.24 )
						if( Money_Flow_Ratio <= 2.35668 )
							if( Negative_Money_Flow_Sum <= 2.76612e+07 )
								ret := 0.076923
							if( Negative_Money_Flow_Sum > 2.76612e+07 )
								if( Raw_Money_Flow <= 794490 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 794490 )
									ret := -0.705882 // sell
						if( Money_Flow_Ratio > 2.35668 )
							ret := -1.000000 // sell
					if( Short_MA > 306.24 )
						if( Typical_Price <= 340.027 )
							ret := -0.083333
						if( Typical_Price > 340.027 )
							ret := 0.642857
				if( Short_Long_Diff > -2.16401 )
					if( MFI <= 62.8607 )
						if( Typical_Price <= 225.441 )
							if( Negative_Money_Flow <= 1.4963e+06 )
								if( MFI <= 52.3541 )
									ret := -0.068862
								if( MFI > 52.3541 )
									ret := 0.043260
							if( Negative_Money_Flow > 1.4963e+06 )
								if( MFI_Low <= 34.0285 )
									ret := 0.700000 // buy
								if( MFI_Low > 34.0285 )
									ret := 0.183673
						if( Typical_Price > 225.441 )
							if( Negative_Money_Flow_Sum <= 4.21945e+07 )
								if( Long_MA <= 288.405 )
									ret := -0.065217
								if( Long_MA > 288.405 )
									ret := -0.467105
							if( Negative_Money_Flow_Sum > 4.21945e+07 )
								if( Short_Long_Diff <= -0.767901 )
									ret := -0.866667 // sell
								if( Short_Long_Diff > -0.767901 )
									ret := 0.288889
					if( MFI > 62.8607 )
						if( Short_MA <= 78.0125 )
							if( Money_Flow_Ratio <= 4.36867 )
								if( Negative_Money_Flow_Sum <= 5.56909e+06 )
									ret := 0.056291
								if( Negative_Money_Flow_Sum > 5.56909e+06 )
									ret := 0.321101
							if( Money_Flow_Ratio > 4.36867 )
								if( MFI_High <= 6.74142 )
									ret := -0.319588
								if( MFI_High > 6.74142 )
									ret := 0.047393
						if( Short_MA > 78.0125 )
							if( Short_Long_Diff <= -0.450833 )
								if( Negative_Money_Flow <= 55937.1 )
									ret := -0.309783
								if( Negative_Money_Flow > 55937.1 )
									ret := 0.150442
							if( Short_Long_Diff > -0.450833 )
								if( Long_MA <= 143.367 )
									ret := 0.216862
								if( Long_MA > 143.367 )
									ret := 0.109612
			if( Typical_Price > 370.392 )
				if( MFI_Low <= 77.3834 )
					if( Short_Long_Diff <= -3.94436 )
						if( Raw_Money_Flow <= 256177 )
							if( Negative_Money_Flow <= 152067 )
								if( Short_MA <= 561.857 )
									ret := 0.521739
								if( Short_MA > 561.857 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 152067 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 256177 )
							if( Short_MA <= 564.122 )
								ret := 0.444444
							if( Short_MA > 564.122 )
								ret := 0.111111
					if( Short_Long_Diff > -3.94436 )
						if( Negative_Money_Flow_Sum <= 5.86902e+07 )
							if( Money_Flow_Ratio <= 2.54776 )
								if( Long_MA <= 507.601 )
									ret := -0.052147
								if( Long_MA > 507.601 )
									ret := 0.334842
							if( Money_Flow_Ratio > 2.54776 )
								if( Negative_Money_Flow_Sum <= 2.17148e+07 )
									ret := 0.135135
								if( Negative_Money_Flow_Sum > 2.17148e+07 )
									ret := -0.359673
						if( Negative_Money_Flow_Sum > 5.86902e+07 )
							if( MFI_High <= -29.2981 )
								ret := 0.608696
							if( MFI_High > -29.2981 )
								if( MA_Cross <= 19.2967 )
									ret := -0.270341
								if( MA_Cross > 19.2967 )
									ret := -1.000000 // sell
				if( MFI_Low > 77.3834 )
					ret := 1.000000 // buy
		if( Raw_Money_Flow > 1.67239e+06 )
			if( Raw_Money_Flow <= 1.86096e+08 )
				if( Negative_Money_Flow_Sum <= 2.99151e+07 )
					if( Positive_Money_Flow_Sum <= 5.34897e+06 )
						if( Typical_Price <= 62.4494 )
							if( Positive_Money_Flow_Sum <= 4.57402e+06 )
								if( Negative_Money_Flow_Sum <= 2.86264e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.86264e+06 )
									ret := -0.785714 // sell
							if( Positive_Money_Flow_Sum > 4.57402e+06 )
								ret := -0.642857
						if( Typical_Price > 62.4494 )
							if( MFI_Low <= 32.2557 )
								ret := 0.111111
							if( MFI_Low > 32.2557 )
								if( MFI <= 59.9722 )
									ret := -0.833333 // sell
								if( MFI > 59.9722 )
									ret := 0.100000
					if( Positive_Money_Flow_Sum > 5.34897e+06 )
						if( MFI <= 79.5243 )
							if( Positive_Money_Flow_Sum <= 4.36665e+07 )
								if( Long_MA <= 127.849 )
									ret := 0.046900
								if( Long_MA > 127.849 )
									ret := -0.057544
							if( Positive_Money_Flow_Sum > 4.36665e+07 )
								if( Raw_Money_Flow <= 2.86319e+07 )
									ret := 0.051812
								if( Raw_Money_Flow > 2.86319e+07 )
									ret := 0.483607
						if( MFI > 79.5243 )
							if( Raw_Money_Flow <= 3.50878e+06 )
								if( MA_Cross <= 24.4754 )
									ret := -0.208839
								if( MA_Cross > 24.4754 )
									ret := 0.638889
							if( Raw_Money_Flow > 3.50878e+06 )
								if( Negative_Money_Flow <= 1.31202e+07 )
									ret := -0.048900
								if( Negative_Money_Flow > 1.31202e+07 )
									ret := 0.576923
				if( Negative_Money_Flow_Sum > 2.99151e+07 )
					if( MFI <= 53.6779 )
						if( Raw_Money_Flow <= 5.23867e+06 )
							if( MFI_High <= -29.2581 )
								if( Positive_Money_Flow_Sum <= 5.55302e+07 )
									ret := 0.015267
								if( Positive_Money_Flow_Sum > 5.55302e+07 )
									ret := 0.461538
							if( MFI_High > -29.2581 )
								if( MFI_Low <= 33.2193 )
									ret := -0.268102
								if( MFI_Low > 33.2193 )
									ret := 0.285714
						if( Raw_Money_Flow > 5.23867e+06 )
							if( Raw_Money_Flow <= 1.05605e+07 )
								if( Short_Long_Diff <= -0.309767 )
									ret := 0.257985
								if( Short_Long_Diff > -0.309767 )
									ret := 0.033333
							if( Raw_Money_Flow > 1.05605e+07 )
								if( Negative_Money_Flow_Sum <= 7.2886e+07 )
									ret := -0.233983
								if( Negative_Money_Flow_Sum > 7.2886e+07 )
									ret := 0.053131
					if( MFI > 53.6779 )
						if( Negative_Money_Flow_Sum <= 4.11084e+07 )
							if( Negative_Money_Flow <= 7.64186e+06 )
								if( MFI_Low <= 69.5898 )
									ret := -0.229160
								if( MFI_Low > 69.5898 )
									ret := -0.967742 // sell
							if( Negative_Money_Flow > 7.64186e+06 )
								if( MFI <= 69.9754 )
									ret := 0.196375
								if( MFI > 69.9754 )
									ret := -0.151220
						if( Negative_Money_Flow_Sum > 4.11084e+07 )
							if( Positive_Money_Flow <= 9.38446e+07 )
								if( Positive_Money_Flow_Sum <= 5.44941e+07 )
									ret := 0.545455
								if( Positive_Money_Flow_Sum > 5.44941e+07 )
									ret := -0.093049
							if( Positive_Money_Flow > 9.38446e+07 )
								if( Raw_Money_Flow <= 1.13654e+08 )
									ret := 0.684211
								if( Raw_Money_Flow > 1.13654e+08 )
									ret := 0.055556
			if( Raw_Money_Flow > 1.86096e+08 )
				if( Raw_Money_Flow <= 3.82931e+08 )
					if( MFI <= 70.3505 )
						ret := -0.666667
					if( MFI > 70.3505 )
						ret := -1.000000 // sell
				if( Raw_Money_Flow > 3.82931e+08 )
					ret := -0.375000
	
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
float op_operation = decision_tree_0_HUBS_15Min_5d5d9fb7(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


