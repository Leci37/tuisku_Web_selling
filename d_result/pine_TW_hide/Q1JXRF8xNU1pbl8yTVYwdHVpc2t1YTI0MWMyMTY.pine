//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: CRWD_15Min_2MV0_a241c216 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2MV0_a241c216", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_a241c216(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( Typical_Price <= 146.312 )
		if( Negative_Money_Flow_Sum <= 7.22922e+07 )
			if( Negative_Money_Flow_Sum <= 5.52908e+07 )
				if( Positive_Money_Flow_Sum <= 3.55454e+06 )
					if( VIP_VIM <= -0.194788 )
						if( Typical_Price <= 48.7385 )
							if( VIM <= 1.4389 )
								if( Raw_Money_Flow <= 282319 )
									ret := 0.000000
								if( Raw_Money_Flow > 282319 )
									ret := 0.727273 // buy
							if( VIM > 1.4389 )
								if( Money_Flow_Ratio <= 0.016855 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.016855 )
									ret := 0.980769 // buy
						if( Typical_Price > 48.7385 )
							if( VIM <= 1.26959 )
								if( Raw_Money_Flow <= 1.39623e+06 )
									ret := 0.703704 // buy
								if( Raw_Money_Flow > 1.39623e+06 )
									ret := 0.166667
							if( VIM > 1.26959 )
								if( VIP <= 0.848888 )
									ret := -0.396985
								if( VIP > 0.848888 )
									ret := 0.091033
					if( VIP_VIM > -0.194788 )
						if( Raw_Money_Flow <= 33919.9 )
							if( VIP <= 3.6926 )
								if( MFI <= 16.8491 )
									ret := 0.108108
								if( MFI > 16.8491 )
									ret := -0.522124
							if( VIP > 3.6926 )
								if( VIM <= 3.92716 )
									ret := 0.666667
								if( VIM > 3.92716 )
									ret := -0.470588
						if( Raw_Money_Flow > 33919.9 )
							if( Money_Flow_Ratio <= 1.53387 )
								if( VIP <= 1.20203 )
									ret := -0.192308
								if( VIP > 1.20203 )
									ret := 0.071707
							if( Money_Flow_Ratio > 1.53387 )
								if( Positive_Money_Flow_Sum <= 1.22413e+06 )
									ret := -0.359375
								if( Positive_Money_Flow_Sum > 1.22413e+06 )
									ret := -0.083004
				if( Positive_Money_Flow_Sum > 3.55454e+06 )
					if( VIM <= 1.18098 )
						if( Raw_Money_Flow <= 74384.4 )
							if( Raw_Money_Flow <= 17826.8 )
								if( Positive_Money_Flow_Sum <= 3.75668e+07 )
									ret := 0.204969
								if( Positive_Money_Flow_Sum > 3.75668e+07 )
									ret := -0.051724
							if( Raw_Money_Flow > 17826.8 )
								if( Positive_Money_Flow_Sum <= 8.86872e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 8.86872e+06 )
									ret := -0.193992
						if( Raw_Money_Flow > 74384.4 )
							if( MFI <= 57.0204 )
								if( Typical_Price <= 38.4744 )
									ret := 0.741935 // buy
								if( Typical_Price > 38.4744 )
									ret := -0.021995
							if( MFI > 57.0204 )
								if( Raw_Money_Flow <= 1.00447e+06 )
									ret := 0.300839
								if( Raw_Money_Flow > 1.00447e+06 )
									ret := 0.077103
					if( VIM > 1.18098 )
						if( Positive_Money_Flow_Sum <= 4.00729e+07 )
							if( Negative_Money_Flow_Sum <= 6.83592e+06 )
								if( Positive_Money_Flow <= 376951 )
									ret := 0.229730
								if( Positive_Money_Flow > 376951 )
									ret := 0.818182 // buy
							if( Negative_Money_Flow_Sum > 6.83592e+06 )
								if( VIP_VIM <= 0.03699 )
									ret := 0.216388
								if( VIP_VIM > 0.03699 )
									ret := -0.087248
						if( Positive_Money_Flow_Sum > 4.00729e+07 )
							if( VIP_VIM <= -0.294931 )
								if( MFI_High <= -5.84834 )
									ret := 0.035714
								if( MFI_High > -5.84834 )
									ret := -0.611111
							if( VIP_VIM > -0.294931 )
								if( VIP <= 1.259 )
									ret := 0.445205
								if( VIP > 1.259 )
									ret := 0.039648
			if( Negative_Money_Flow_Sum > 5.52908e+07 )
				if( Positive_Money_Flow_Sum <= 4.90892e+07 )
					if( VIP_VIM <= 0.20252 )
						if( MFI <= 43.0559 )
							if( VIP <= 0.993386 )
								if( Negative_Money_Flow <= 7.63346e+06 )
									ret := -0.123203
								if( Negative_Money_Flow > 7.63346e+06 )
									ret := 0.159817
							if( VIP > 0.993386 )
								if( Negative_Money_Flow_Sum <= 6.78528e+07 )
									ret := -0.214724
								if( Negative_Money_Flow_Sum > 6.78528e+07 )
									ret := -0.709677 // sell
						if( MFI > 43.0559 )
							if( VIM <= 1.10667 )
								if( VIP <= 1.04523 )
									ret := 0.083333
								if( VIP > 1.04523 )
									ret := -0.875000 // sell
							if( VIM > 1.10667 )
								if( VIM <= 1.19957 )
									ret := -0.961538 // sell
								if( VIM > 1.19957 )
									ret := -0.705882 // sell
					if( VIP_VIM > 0.20252 )
						if( Raw_Money_Flow <= 279798 )
							if( VIM <= 1.3996 )
								if( Typical_Price <= 91.8701 )
									ret := 0.900000 // buy
								if( Typical_Price > 91.8701 )
									ret := 1.000000 // buy
							if( VIM > 1.3996 )
								ret := 0.600000
						if( Raw_Money_Flow > 279798 )
							ret := 0.500000
				if( Positive_Money_Flow_Sum > 4.90892e+07 )
					if( Money_Flow_Ratio <= 3.00547 )
						if( Money_Flow_Ratio <= 2.08203 )
							if( Raw_Money_Flow <= 1.29183e+07 )
								if( VIP_VIM <= -0.267993 )
									ret := 0.516667
								if( VIP_VIM > -0.267993 )
									ret := 0.083721
							if( Raw_Money_Flow > 1.29183e+07 )
								if( Raw_Money_Flow <= 3.40961e+07 )
									ret := -0.339623
								if( Raw_Money_Flow > 3.40961e+07 )
									ret := 0.326087
						if( Money_Flow_Ratio > 2.08203 )
							if( Negative_Money_Flow <= 2.64214e+07 )
								if( Positive_Money_Flow <= 2.68994e+07 )
									ret := 0.314721
								if( Positive_Money_Flow > 2.68994e+07 )
									ret := -0.222222
							if( Negative_Money_Flow > 2.64214e+07 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 3.00547 )
						if( MFI_Low <= 58.1967 )
							if( Positive_Money_Flow <= 1.75486e+06 )
								if( Negative_Money_Flow <= 1.67943e+07 )
									ret := -0.228571
								if( Negative_Money_Flow > 1.67943e+07 )
									ret := -0.812500 // sell
							if( Positive_Money_Flow > 1.75486e+06 )
								if( VIM <= 0.883748 )
									ret := -0.914894 // sell
								if( VIM > 0.883748 )
									ret := -0.500000
						if( MFI_Low > 58.1967 )
							if( VIP_VIM <= 0.129573 )
								ret := 0.842105 // buy
							if( VIP_VIM > 0.129573 )
								if( Typical_Price <= 127.844 )
									ret := -0.343284
								if( Typical_Price > 127.844 )
									ret := 0.220000
		if( Negative_Money_Flow_Sum > 7.22922e+07 )
			if( VIP_VIM <= 0.208658 )
				if( VIP_VIM <= -0.820427 )
					if( Raw_Money_Flow <= 961760 )
						if( VIP <= 0.83782 )
							ret := 0.210526
						if( VIP > 0.83782 )
							ret := 0.722222 // buy
					if( Raw_Money_Flow > 961760 )
						if( Raw_Money_Flow <= 6.80053e+07 )
							if( Raw_Money_Flow <= 2.50247e+07 )
								if( VIP <= 0.530211 )
									ret := -0.052632
								if( VIP > 0.530211 )
									ret := -0.616279
							if( Raw_Money_Flow > 2.50247e+07 )
								if( VIM <= 1.4808 )
									ret := 0.194444
								if( VIM > 1.4808 )
									ret := -0.509804
						if( Raw_Money_Flow > 6.80053e+07 )
							ret := 0.583333
				if( VIP_VIM > -0.820427 )
					if( MFI_Low <= 1.12924 )
						if( VIP <= 0.699158 )
							if( Negative_Money_Flow_Sum <= 2.75663e+08 )
								if( Negative_Money_Flow <= 1.28543e+07 )
									ret := 0.360360
								if( Negative_Money_Flow > 1.28543e+07 )
									ret := 0.783626 // buy
							if( Negative_Money_Flow_Sum > 2.75663e+08 )
								if( Negative_Money_Flow_Sum <= 3.7709e+08 )
									ret := -0.291667
								if( Negative_Money_Flow_Sum > 3.7709e+08 )
									ret := 0.368421
						if( VIP > 0.699158 )
							if( Typical_Price <= 104.54 )
								if( Negative_Money_Flow_Sum <= 8.26149e+07 )
									ret := -0.082569
								if( Negative_Money_Flow_Sum > 8.26149e+07 )
									ret := 0.510246
							if( Typical_Price > 104.54 )
								if( Typical_Price <= 146.061 )
									ret := 0.115422
								if( Typical_Price > 146.061 )
									ret := 1.000000 // buy
					if( MFI_Low > 1.12924 )
						if( Positive_Money_Flow <= 2.28288e+07 )
							if( Positive_Money_Flow <= 2.18196e+07 )
								if( VIM <= 1.7252 )
									ret := 0.126832
								if( VIM > 1.7252 )
									ret := -0.560976
							if( Positive_Money_Flow > 2.18196e+07 )
								if( MFI <= 32.2521 )
									ret := 0.111111
								if( MFI > 32.2521 )
									ret := -0.638889
						if( Positive_Money_Flow > 2.28288e+07 )
							if( Negative_Money_Flow_Sum <= 1.09387e+09 )
								if( Raw_Money_Flow <= 2.47251e+07 )
									ret := 0.653333
								if( Raw_Money_Flow > 2.47251e+07 )
									ret := 0.256461
							if( Negative_Money_Flow_Sum > 1.09387e+09 )
								if( Typical_Price <= 138 )
									ret := 0.800000 // buy
								if( Typical_Price > 138 )
									ret := 1.000000 // buy
			if( VIP_VIM > 0.208658 )
				if( Positive_Money_Flow_Sum <= 4.38532e+08 )
					if( VIM <= 1.09798 )
						if( Negative_Money_Flow_Sum <= 8.11095e+07 )
							if( Positive_Money_Flow <= 1.75984e+07 )
								if( Positive_Money_Flow_Sum <= 1.38583e+08 )
									ret := 0.076271
								if( Positive_Money_Flow_Sum > 1.38583e+08 )
									ret := 0.467290
							if( Positive_Money_Flow > 1.75984e+07 )
								if( MFI_Low <= 42.032 )
									ret := -0.631579
								if( MFI_Low > 42.032 )
									ret := 0.021277
						if( Negative_Money_Flow_Sum > 8.11095e+07 )
							if( Raw_Money_Flow <= 257387 )
								if( Positive_Money_Flow_Sum <= 1.79856e+08 )
									ret := 0.008696
								if( Positive_Money_Flow_Sum > 1.79856e+08 )
									ret := 0.384615
							if( Raw_Money_Flow > 257387 )
								if( Raw_Money_Flow <= 1.64033e+07 )
									ret := -0.244318
								if( Raw_Money_Flow > 1.64033e+07 )
									ret := -0.010499
					if( VIM > 1.09798 )
						if( Positive_Money_Flow <= 219288 )
							if( VIP <= 1.66301 )
								if( Negative_Money_Flow_Sum <= 1.01692e+08 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 1.01692e+08 )
									ret := 0.545455
							if( VIP > 1.66301 )
								if( Typical_Price <= 127.773 )
									ret := -0.900000 // sell
								if( Typical_Price > 127.773 )
									ret := -0.100000
						if( Positive_Money_Flow > 219288 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 4.38532e+08 )
					if( VIP_VIM <= 0.6517 )
						if( Negative_Money_Flow <= 6.75756e+07 )
							if( MFI <= 62.9985 )
								ret := 0.944444 // buy
							if( MFI > 62.9985 )
								if( Money_Flow_Ratio <= 2.06832 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 2.06832 )
									ret := 0.621951
						if( Negative_Money_Flow > 6.75756e+07 )
							ret := -0.266667
					if( VIP_VIM > 0.6517 )
						ret := -0.583333
	if( Typical_Price > 146.312 )
		if( Positive_Money_Flow_Sum <= 1.11215e+06 )
			if( Negative_Money_Flow_Sum <= 8.67604e+07 )
				if( VIP_VIM <= -1.27922 )
					if( Typical_Price <= 177.335 )
						ret := -0.142857
					if( Typical_Price > 177.335 )
						ret := -0.894737 // sell
				if( VIP_VIM > -1.27922 )
					if( Positive_Money_Flow <= 366840 )
						if( Typical_Price <= 146.876 )
							if( Money_Flow_Ratio <= 0.196791 )
								ret := -0.846154 // sell
							if( Money_Flow_Ratio > 0.196791 )
								if( Raw_Money_Flow <= 137006 )
									ret := 0.000000
								if( Raw_Money_Flow > 137006 )
									ret := 0.125000
						if( Typical_Price > 146.876 )
							if( Negative_Money_Flow_Sum <= 368762 )
								ret := -0.470588
							if( Negative_Money_Flow_Sum > 368762 )
								if( Raw_Money_Flow <= 22657 )
									ret := -0.240741
								if( Raw_Money_Flow > 22657 )
									ret := 0.288413
					if( Positive_Money_Flow > 366840 )
						if( MFI_Low <= 0.106522 )
							ret := -0.846154 // sell
						if( MFI_Low > 0.106522 )
							if( Negative_Money_Flow_Sum <= 1.72048e+06 )
								if( Typical_Price <= 186.68 )
									ret := -0.727273 // sell
								if( Typical_Price > 186.68 )
									ret := -0.125000
							if( Negative_Money_Flow_Sum > 1.72048e+06 )
								ret := 0.400000
			if( Negative_Money_Flow_Sum > 8.67604e+07 )
				if( Typical_Price <= 250.479 )
					if( VIM <= 1.42372 )
						if( VIP_VIM <= -0.222737 )
							if( Negative_Money_Flow_Sum <= 1.24495e+08 )
								ret := 0.117647
							if( Negative_Money_Flow_Sum > 1.24495e+08 )
								if( Negative_Money_Flow_Sum <= 3.88844e+08 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 3.88844e+08 )
									ret := -0.062500
						if( VIP_VIM > -0.222737 )
							ret := -0.950000 // sell
					if( VIM > 1.42372 )
						if( Positive_Money_Flow_Sum <= 1.09349e+06 )
							if( Negative_Money_Flow_Sum <= 1.02563e+08 )
								if( Positive_Money_Flow <= 46082.2 )
									ret := -0.829268 // sell
								if( Positive_Money_Flow > 46082.2 )
									ret := 0.538462
							if( Negative_Money_Flow_Sum > 1.02563e+08 )
								if( Money_Flow_Ratio <= 0.004128 )
									ret := -0.059880
								if( Money_Flow_Ratio > 0.004128 )
									ret := 0.240602
						if( Positive_Money_Flow_Sum > 1.09349e+06 )
							ret := 1.000000 // buy
				if( Typical_Price > 250.479 )
					if( Typical_Price <= 289.929 )
						if( Money_Flow_Ratio <= 0.004952 )
							if( VIP_VIM <= -0.486705 )
								if( Negative_Money_Flow_Sum <= 2.29573e+08 )
									ret := 0.142857
								if( Negative_Money_Flow_Sum > 2.29573e+08 )
									ret := 0.928571 // buy
							if( VIP_VIM > -0.486705 )
								ret := -0.125000
						if( Money_Flow_Ratio > 0.004952 )
							ret := 0.777778 // buy
					if( Typical_Price > 289.929 )
						if( Negative_Money_Flow <= 34565.2 )
							ret := -0.454545
						if( Negative_Money_Flow > 34565.2 )
							if( MFI <= 0.19672 )
								ret := 0.071429
							if( MFI > 0.19672 )
								ret := 0.210526
		if( Positive_Money_Flow_Sum > 1.11215e+06 )
			if( Negative_Money_Flow_Sum <= 2.22803e+06 )
				if( Positive_Money_Flow <= 8.95173e+07 )
					if( Positive_Money_Flow_Sum <= 3.79649e+06 )
						if( Typical_Price <= 159.17 )
							if( Typical_Price <= 153.307 )
								if( Positive_Money_Flow <= 64002.2 )
									ret := -0.465909
								if( Positive_Money_Flow > 64002.2 )
									ret := 0.063830
							if( Typical_Price > 153.307 )
								if( VIP <= 1.84591 )
									ret := -0.795699 // sell
								if( VIP > 1.84591 )
									ret := -0.252747
						if( Typical_Price > 159.17 )
							if( Positive_Money_Flow_Sum <= 1.55641e+06 )
								if( Positive_Money_Flow_Sum <= 1.31394e+06 )
									ret := -0.099099
								if( Positive_Money_Flow_Sum > 1.31394e+06 )
									ret := 0.419608
							if( Positive_Money_Flow_Sum > 1.55641e+06 )
								if( VIP <= 1.29512 )
									ret := 0.240000
								if( VIP > 1.29512 )
									ret := -0.202030
					if( Positive_Money_Flow_Sum > 3.79649e+06 )
						if( VIM <= 0.540191 )
							if( MFI_Low <= 79.6994 )
								if( VIM <= 0.494683 )
									ret := 1.000000 // buy
								if( VIM > 0.494683 )
									ret := 0.888889 // buy
							if( MFI_Low > 79.6994 )
								ret := -0.083333
						if( VIM > 0.540191 )
							if( Positive_Money_Flow <= 7526.53 )
								if( Negative_Money_Flow_Sum <= 843874 )
									ret := 0.396450
								if( Negative_Money_Flow_Sum > 843874 )
									ret := 0.062257
							if( Positive_Money_Flow > 7526.53 )
								if( Money_Flow_Ratio <= 41.8009 )
									ret := 0.058943
								if( Money_Flow_Ratio > 41.8009 )
									ret := -0.116101
				if( Positive_Money_Flow > 8.95173e+07 )
					if( VIP <= 1.34058 )
						if( Typical_Price <= 188.076 )
							ret := 0.800000 // buy
						if( Typical_Price > 188.076 )
							if( Positive_Money_Flow_Sum <= 1.32865e+08 )
								if( Money_Flow_Ratio <= 62.4845 )
									ret := -0.200000
								if( Money_Flow_Ratio > 62.4845 )
									ret := -0.880000 // sell
							if( Positive_Money_Flow_Sum > 1.32865e+08 )
								ret := 0.428571
					if( VIP > 1.34058 )
						if( Raw_Money_Flow <= 9.76992e+07 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 9.76992e+07 )
							if( VIP <= 1.44758 )
								ret := -0.923077 // sell
							if( VIP > 1.44758 )
								ret := -0.250000
			if( Negative_Money_Flow_Sum > 2.22803e+06 )
				if( VIP_VIM <= -0.436563 )
					if( Positive_Money_Flow_Sum <= 1.26184e+09 )
						if( Positive_Money_Flow_Sum <= 4.54575e+08 )
							if( Negative_Money_Flow <= 9.49165e+07 )
								if( Raw_Money_Flow <= 1.14114e+06 )
									ret := 0.203566
								if( Raw_Money_Flow > 1.14114e+06 )
									ret := 0.060853
							if( Negative_Money_Flow > 9.49165e+07 )
								if( Positive_Money_Flow_Sum <= 3.21882e+08 )
									ret := -0.384615
								if( Positive_Money_Flow_Sum > 3.21882e+08 )
									ret := 0.700000 // buy
						if( Positive_Money_Flow_Sum > 4.54575e+08 )
							if( Typical_Price <= 332.988 )
								if( MFI_Low <= -4.88441 )
									ret := 0.500000
								if( MFI_Low > -4.88441 )
									ret := 0.921569 // buy
							if( Typical_Price > 332.988 )
								ret := -0.500000
					if( Positive_Money_Flow_Sum > 1.26184e+09 )
						if( Typical_Price <= 329.882 )
							ret := -0.750000 // sell
						if( Typical_Price > 329.882 )
							ret := -1.000000 // sell
				if( VIP_VIM > -0.436563 )
					if( Raw_Money_Flow <= 398015 )
						if( Negative_Money_Flow <= 2577.02 )
							if( MFI_Low <= -15.3595 )
								if( MFI <= 1.90661 )
									ret := 0.116883
								if( MFI > 1.90661 )
									ret := 0.551020
							if( MFI_Low > -15.3595 )
								if( Typical_Price <= 160.092 )
									ret := 0.128713
								if( Typical_Price > 160.092 )
									ret := -0.067183
						if( Negative_Money_Flow > 2577.02 )
							if( Positive_Money_Flow <= 13987.8 )
								if( Negative_Money_Flow_Sum <= 3.24047e+06 )
									ret := 0.413793
								if( Negative_Money_Flow_Sum > 3.24047e+06 )
									ret := 0.100917
							if( Positive_Money_Flow > 13987.8 )
								if( Raw_Money_Flow <= 83450.1 )
									ret := 0.532338
								if( Raw_Money_Flow > 83450.1 )
									ret := 0.236486
					if( Raw_Money_Flow > 398015 )
						if( MFI <= 21.5502 )
							if( Raw_Money_Flow <= 1.41483e+08 )
								if( VIM <= 1.17898 )
									ret := -0.293553
								if( VIM > 1.17898 )
									ret := -0.028807
							if( Raw_Money_Flow > 1.41483e+08 )
								if( Negative_Money_Flow_Sum <= 1.6945e+08 )
									ret := 0.880000 // buy
								if( Negative_Money_Flow_Sum > 1.6945e+08 )
									ret := 0.105882
						if( MFI > 21.5502 )
							if( VIM <= 1.37495 )
								if( Positive_Money_Flow_Sum <= 4.05408e+09 )
									ret := 0.012201
								if( Positive_Money_Flow_Sum > 4.05408e+09 )
									ret := -0.650000
							if( VIM > 1.37495 )
								if( Money_Flow_Ratio <= 0.292819 )
									ret := 0.823529 // buy
								if( Money_Flow_Ratio > 0.292819 )
									ret := -0.174966
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_CRWD_15Min_a241c216(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


