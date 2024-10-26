//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AAPL_1Min_2CM0_9565e5be Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_2CM0_9565e5be", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_9565e5be(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 2.81364e+06 )
		if( Negative_Money_Flow_Sum <= 2.16669e+06 )
			if( MFI_High <= -5.34928 )
				if( ad <= 2277.13 )
					if( Typical_Price <= 224.91 )
						if( Negative_Money_Flow_Sum <= 864817 )
							if( Typical_Price <= 173.407 )
								if( Positive_Money_Flow_Sum <= 1.2982e+06 )
									ret := -0.484848
								if( Positive_Money_Flow_Sum > 1.2982e+06 )
									ret := 0.064516
							if( Typical_Price > 173.407 )
								if( MFI_High <= -20.5935 )
									ret := -0.095781
								if( MFI_High > -20.5935 )
									ret := 0.059072
						if( Negative_Money_Flow_Sum > 864817 )
							if( MFI_High <= -11.4814 )
								if( MFI_Low <= 46.0937 )
									ret := 0.087722
								if( MFI_Low > 46.0937 )
									ret := -0.307692
							if( MFI_High > -11.4814 )
								if( Positive_Money_Flow_Sum <= 2.00628e+06 )
									ret := 0.882353 // buy
								if( Positive_Money_Flow_Sum > 2.00628e+06 )
									ret := 0.227119
					if( Typical_Price > 224.91 )
						if( MFI <= 16.746 )
							if( mf <= -0.072781 )
								if( Positive_Money_Flow <= 1132.93 )
									ret := -0.619048
								if( Positive_Money_Flow > 1132.93 )
									ret := -0.906250 // sell
							if( mf > -0.072781 )
								ret := 0.000000
						if( MFI > 16.746 )
							if( ad <= 2.56315 )
								if( Raw_Money_Flow <= 41810.5 )
									ret := -0.138996
								if( Raw_Money_Flow > 41810.5 )
									ret := 0.006833
							if( ad > 2.56315 )
								if( Negative_Money_Flow_Sum <= 1.55606e+06 )
									ret := -0.035011
								if( Negative_Money_Flow_Sum > 1.55606e+06 )
									ret := -0.381395
				if( ad > 2277.13 )
					if( ad_mf <= 2798.62 )
						if( MFI <= 64.5465 )
							if( Negative_Money_Flow_Sum <= 2.01033e+06 )
								if( mf <= 0.144902 )
									ret := 0.562500
								if( mf > 0.144902 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.01033e+06 )
								ret := -0.375000
						if( MFI > 64.5465 )
							if( MFI_Low <= 46.7316 )
								if( MFI_Low <= 45.9319 )
									ret := 0.933333 // buy
								if( MFI_Low > 45.9319 )
									ret := 0.444444
							if( MFI_Low > 46.7316 )
								if( Typical_Price <= 226.756 )
									ret := 0.985075 // buy
								if( Typical_Price > 226.756 )
									ret := 0.600000
					if( ad_mf > 2798.62 )
						if( Positive_Money_Flow_Sum <= 2.10388e+06 )
							if( Money_Flow_Ratio <= 2.33326 )
								if( Negative_Money_Flow_Sum <= 1.54237e+06 )
									ret := 0.107527
								if( Negative_Money_Flow_Sum > 1.54237e+06 )
									ret := -0.270270
							if( Money_Flow_Ratio > 2.33326 )
								ret := 0.692308
						if( Positive_Money_Flow_Sum > 2.10388e+06 )
							if( ad_mf <= 5807.56 )
								if( Positive_Money_Flow_Sum <= 2.75265e+06 )
									ret := 0.625000
								if( Positive_Money_Flow_Sum > 2.75265e+06 )
									ret := -0.222222
							if( ad_mf > 5807.56 )
								if( MFI <= 63.3444 )
									ret := 0.142857
								if( MFI > 63.3444 )
									ret := -0.600000
			if( MFI_High > -5.34928 )
				if( Positive_Money_Flow <= 559406 )
					if( Negative_Money_Flow_Sum <= 765409 )
						if( mf <= 0.461995 )
							if( MFI <= 92.6035 )
								if( Positive_Money_Flow <= 142724 )
									ret := -0.092308
								if( Positive_Money_Flow > 142724 )
									ret := 0.075419
							if( MFI > 92.6035 )
								if( MFI_Low <= 74.5347 )
									ret := -0.750000 // sell
								if( MFI_Low > 74.5347 )
									ret := -0.230769
						if( mf > 0.461995 )
							if( ad <= 41.451 )
								if( ad_mf <= -0.481218 )
									ret := -0.064103
								if( ad_mf > -0.481218 )
									ret := -0.500000
							if( ad > 41.451 )
								if( Typical_Price <= 195.217 )
									ret := 0.000000
								if( Typical_Price > 195.217 )
									ret := -0.600000
					if( Negative_Money_Flow_Sum > 765409 )
						if( Positive_Money_Flow_Sum <= 2.66734e+06 )
							if( Typical_Price <= 223.36 )
								if( Money_Flow_Ratio <= 3.20466 )
									ret := -0.562500
								if( Money_Flow_Ratio > 3.20466 )
									ret := -0.851852 // sell
							if( Typical_Price > 223.36 )
								ret := 0.111111
						if( Positive_Money_Flow_Sum > 2.66734e+06 )
							if( MFI <= 75.5 )
								ret := -0.769231 // sell
							if( MFI > 75.5 )
								if( MFI_High <= -2.38145 )
									ret := 0.363636
								if( MFI_High > -2.38145 )
									ret := -0.222222
				if( Positive_Money_Flow > 559406 )
					if( Money_Flow_Ratio <= 5.58548 )
						if( MFI <= 77.8203 )
							if( Positive_Money_Flow <= 677667 )
								ret := 0.666667
							if( Positive_Money_Flow > 677667 )
								ret := -0.133333
						if( MFI > 77.8203 )
							if( Negative_Money_Flow_Sum <= 424701 )
								ret := 0.933333 // buy
							if( Negative_Money_Flow_Sum > 424701 )
								if( Positive_Money_Flow_Sum <= 2.34617e+06 )
									ret := 0.272727
								if( Positive_Money_Flow_Sum > 2.34617e+06 )
									ret := 0.615385
					if( Money_Flow_Ratio > 5.58548 )
						ret := -0.142857
		if( Negative_Money_Flow_Sum > 2.16669e+06 )
			if( Positive_Money_Flow <= 3260.69 )
				if( Negative_Money_Flow_Sum <= 3.11695e+06 )
					if( Raw_Money_Flow <= 883934 )
						if( Positive_Money_Flow_Sum <= 2.0462e+06 )
							if( mf <= -0.375748 )
								if( Negative_Money_Flow <= 496372 )
									ret := -0.011673
								if( Negative_Money_Flow > 496372 )
									ret := 0.348485
							if( mf > -0.375748 )
								if( MFI_Low <= -10.4894 )
									ret := 0.686275
								if( MFI_Low > -10.4894 )
									ret := 0.255618
						if( Positive_Money_Flow_Sum > 2.0462e+06 )
							if( ad_mf <= 0.001151 )
								if( Money_Flow_Ratio <= 1.17754 )
									ret := 0.624573
								if( Money_Flow_Ratio > 1.17754 )
									ret := 0.000000
							if( ad_mf > 0.001151 )
								if( Positive_Money_Flow_Sum <= 2.21319e+06 )
									ret := 0.690909
								if( Positive_Money_Flow_Sum > 2.21319e+06 )
									ret := -0.020619
					if( Raw_Money_Flow > 883934 )
						if( MFI_High <= -36.5735 )
							if( Negative_Money_Flow <= 1.05652e+06 )
								if( MFI_High <= -45.3604 )
									ret := -0.388889
								if( MFI_High > -45.3604 )
									ret := 0.250000
							if( Negative_Money_Flow > 1.05652e+06 )
								if( mf <= -0.236453 )
									ret := 0.148148
								if( mf > -0.236453 )
									ret := 0.703704 // buy
						if( MFI_High > -36.5735 )
							if( mf <= 0.275754 )
								if( Raw_Money_Flow <= 1.24991e+06 )
									ret := -0.583333
								if( Raw_Money_Flow > 1.24991e+06 )
									ret := -1.000000 // sell
							if( mf > 0.275754 )
								ret := -0.400000
				if( Negative_Money_Flow_Sum > 3.11695e+06 )
					if( ad <= -5037.88 )
						if( ad_mf <= -6911.95 )
							if( Negative_Money_Flow_Sum <= 3.90199e+06 )
								if( MFI_Low <= 10.3854 )
									ret := -0.727273 // sell
								if( MFI_Low > 10.3854 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 3.90199e+06 )
								if( Raw_Money_Flow <= 3.8291e+06 )
									ret := 0.246305
								if( Raw_Money_Flow > 3.8291e+06 )
									ret := 0.625000
						if( ad_mf > -6911.95 )
							if( Money_Flow_Ratio <= 0.219063 )
								if( Money_Flow_Ratio <= 0.167849 )
									ret := 0.568966
								if( Money_Flow_Ratio > 0.167849 )
									ret := -0.100000
							if( Money_Flow_Ratio > 0.219063 )
								if( Positive_Money_Flow_Sum <= 2.35528e+06 )
									ret := 0.783784 // buy
								if( Positive_Money_Flow_Sum > 2.35528e+06 )
									ret := 0.291667
					if( ad > -5037.88 )
						if( ad <= 8021.12 )
							if( Money_Flow_Ratio <= 0.32449 )
								if( MFI <= 13.1442 )
									ret := 0.180915
								if( MFI > 13.1442 )
									ret := 0.011445
							if( Money_Flow_Ratio > 0.32449 )
								if( MFI <= 29.0158 )
									ret := 0.353535
								if( MFI > 29.0158 )
									ret := 0.129220
						if( ad > 8021.12 )
							if( Negative_Money_Flow <= 1.65727e+07 )
								if( MFI <= 11.9948 )
									ret := -0.636364
								if( MFI > 11.9948 )
									ret := -0.229508
							if( Negative_Money_Flow > 1.65727e+07 )
								if( Typical_Price <= 201.256 )
									ret := 0.692308
								if( Typical_Price > 201.256 )
									ret := 0.000000
			if( Positive_Money_Flow > 3260.69 )
				if( MFI_Low <= 23.1294 )
					if( Money_Flow_Ratio <= 0.244905 )
						if( MFI <= 15.0226 )
							if( Positive_Money_Flow <= 198562 )
								if( Negative_Money_Flow_Sum <= 2.46682e+06 )
									ret := -0.916667 // sell
								if( Negative_Money_Flow_Sum > 2.46682e+06 )
									ret := 0.109620
							if( Positive_Money_Flow > 198562 )
								if( Positive_Money_Flow_Sum <= 481579 )
									ret := -0.866667 // sell
								if( Positive_Money_Flow_Sum > 481579 )
									ret := -0.068493
						if( MFI > 15.0226 )
							if( ad_mf <= 346.377 )
								if( MFI_Low <= -3.49863 )
									ret := 0.440476
								if( MFI_Low > -3.49863 )
									ret := 0.050633
							if( ad_mf > 346.377 )
								if( Money_Flow_Ratio <= 0.208493 )
									ret := 0.139241
								if( Money_Flow_Ratio > 0.208493 )
									ret := 0.618321
					if( Money_Flow_Ratio > 0.244905 )
						if( MFI_High <= -58.585 )
							if( Typical_Price <= 214.77 )
								if( Positive_Money_Flow <= 442019 )
									ret := -0.054545
								if( Positive_Money_Flow > 442019 )
									ret := 0.727273 // buy
							if( Typical_Price > 214.77 )
								if( Negative_Money_Flow_Sum <= 7.94296e+06 )
									ret := -0.593220
								if( Negative_Money_Flow_Sum > 7.94296e+06 )
									ret := 0.555556
						if( MFI_High > -58.585 )
							if( ad_mf <= -119.976 )
								if( mf <= -0.058558 )
									ret := 0.239645
								if( mf > -0.058558 )
									ret := -0.057143
							if( ad_mf > -119.976 )
								if( MFI_Low <= 5.99979 )
									ret := 0.100000
								if( MFI_Low > 5.99979 )
									ret := -0.072761
				if( MFI_Low > 23.1294 )
					if( Positive_Money_Flow_Sum <= 2.03905e+06 )
						if( Positive_Money_Flow <= 120097 )
							if( MFI <= 45.5157 )
								if( Money_Flow_Ratio <= 0.80297 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.80297 )
									ret := 1.000000 // buy
							if( MFI > 45.5157 )
								ret := 0.454545
						if( Positive_Money_Flow > 120097 )
							if( ad_mf <= -0.414166 )
								if( MFI_High <= -33.9574 )
									ret := 0.500000
								if( MFI_High > -33.9574 )
									ret := 0.894737 // buy
							if( ad_mf > -0.414166 )
								if( Money_Flow_Ratio <= 0.882028 )
									ret := -0.055556
								if( Money_Flow_Ratio > 0.882028 )
									ret := 0.769231 // buy
					if( Positive_Money_Flow_Sum > 2.03905e+06 )
						if( MFI_Low <= 28.4109 )
							if( ad_mf <= 3711.43 )
								if( mf <= 0.00586 )
									ret := -0.251701
								if( mf > 0.00586 )
									ret := 0.400000
							if( ad_mf > 3711.43 )
								ret := -0.857143 // sell
						if( MFI_Low > 28.4109 )
							if( Negative_Money_Flow <= 20185.6 )
								if( Raw_Money_Flow <= 106942 )
									ret := -0.315789
								if( Raw_Money_Flow > 106942 )
									ret := 0.471429
							if( Negative_Money_Flow > 20185.6 )
								ret := -0.500000
	if( Positive_Money_Flow_Sum > 2.81364e+06 )
		if( ad_mf <= -0.873552 )
			if( MFI_Low <= -10.2179 )
				if( ad_mf <= -48645.1 )
					if( Money_Flow_Ratio <= 0.016751 )
						ret := 0.233333
					if( Money_Flow_Ratio > 0.016751 )
						if( Negative_Money_Flow_Sum <= 1.52742e+09 )
							if( Negative_Money_Flow_Sum <= 1.77816e+08 )
								if( ad <= -158105 )
									ret := -0.555556
								if( ad > -158105 )
									ret := 0.583333
							if( Negative_Money_Flow_Sum > 1.77816e+08 )
								if( ad_mf <= -70928.7 )
									ret := 0.688356
								if( ad_mf > -70928.7 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 1.52742e+09 )
							if( MFI_Low <= -12.1185 )
								ret := 0.300000
							if( MFI_Low > -12.1185 )
								ret := -0.666667
				if( ad_mf > -48645.1 )
					if( Negative_Money_Flow <= 981724 )
						if( Money_Flow_Ratio <= 0.010302 )
							if( Money_Flow_Ratio <= 0.008209 )
								if( Positive_Money_Flow_Sum <= 3.81092e+06 )
									ret := -0.416667
								if( Positive_Money_Flow_Sum > 3.81092e+06 )
									ret := -0.100000
							if( Money_Flow_Ratio > 0.008209 )
								ret := -0.846154 // sell
						if( Money_Flow_Ratio > 0.010302 )
							if( Negative_Money_Flow <= 5801.04 )
								if( Money_Flow_Ratio <= 0.085378 )
									ret := -0.230769
								if( Money_Flow_Ratio > 0.085378 )
									ret := 0.500000
							if( Negative_Money_Flow > 5801.04 )
								if( MFI_High <= -74.9226 )
									ret := 0.455696
								if( MFI_High > -74.9226 )
									ret := -0.031746
					if( Negative_Money_Flow > 981724 )
						if( Raw_Money_Flow <= 1.68444e+07 )
							if( MFI_Low <= -18.2267 )
								ret := -0.200000
							if( MFI_Low > -18.2267 )
								if( Negative_Money_Flow <= 7.24864e+06 )
									ret := 0.775281 // buy
								if( Negative_Money_Flow > 7.24864e+06 )
									ret := 0.441860
						if( Raw_Money_Flow > 1.68444e+07 )
							if( Positive_Money_Flow_Sum <= 1.86786e+07 )
								if( mf <= -0.275758 )
									ret := -1.000000 // sell
								if( mf > -0.275758 )
									ret := -0.133333
							if( Positive_Money_Flow_Sum > 1.86786e+07 )
								if( mf <= -0.174134 )
									ret := 0.615385
								if( mf > -0.174134 )
									ret := -0.142857
			if( MFI_Low > -10.2179 )
				if( Negative_Money_Flow_Sum <= 2.53474e+07 )
					if( MFI_Low <= 68.5645 )
						if( ad_mf <= -4862.38 )
							if( MFI_Low <= 23.9741 )
								if( MFI <= 22.5426 )
									ret := 0.076190
								if( MFI > 22.5426 )
									ret := 0.446092
							if( MFI_Low > 23.9741 )
								if( Typical_Price <= 216.968 )
									ret := 0.291248
								if( Typical_Price > 216.968 )
									ret := 0.014235
						if( ad_mf > -4862.38 )
							if( Raw_Money_Flow <= 201492 )
								if( ad_mf <= -933.709 )
									ret := -0.170213
								if( ad_mf > -933.709 )
									ret := 0.255869
							if( Raw_Money_Flow > 201492 )
								if( MFI_High <= -56.3204 )
									ret := 0.297753
								if( MFI_High > -56.3204 )
									ret := 0.044533
					if( MFI_Low > 68.5645 )
						if( Typical_Price <= 214.351 )
							if( MFI_High <= 8.96466 )
								ret := -0.812500 // sell
							if( MFI_High > 8.96466 )
								if( mf <= 0.929864 )
									ret := -0.239474
								if( mf > 0.929864 )
									ret := 0.488372
						if( Typical_Price > 214.351 )
							if( Negative_Money_Flow_Sum <= 2.18728e+06 )
								if( MFI <= 90.0795 )
									ret := -0.580000
								if( MFI > 90.0795 )
									ret := -0.026596
							if( Negative_Money_Flow_Sum > 2.18728e+06 )
								if( MFI <= 99.1456 )
									ret := 0.112540
								if( MFI > 99.1456 )
									ret := 0.840000 // buy
				if( Negative_Money_Flow_Sum > 2.53474e+07 )
					if( MFI_Low <= 11.0969 )
						if( MFI_Low <= -10.112 )
							ret := -0.928571 // sell
						if( MFI_Low > -10.112 )
							if( Typical_Price <= 183.945 )
								if( Positive_Money_Flow_Sum <= 3.14028e+07 )
									ret := 0.700787 // buy
								if( Positive_Money_Flow_Sum > 3.14028e+07 )
									ret := 0.083810
							if( Typical_Price > 183.945 )
								if( Positive_Money_Flow <= 7.49507e+07 )
									ret := 0.040658
								if( Positive_Money_Flow > 7.49507e+07 )
									ret := -0.553571
					if( MFI_Low > 11.0969 )
						if( Raw_Money_Flow <= 1.09762e+08 )
							if( Money_Flow_Ratio <= 0.499693 )
								if( Negative_Money_Flow <= 9.9082e+06 )
									ret := -0.373832
								if( Negative_Money_Flow > 9.9082e+06 )
									ret := -0.096400
							if( Money_Flow_Ratio > 0.499693 )
								if( ad <= -238493 )
									ret := -0.278226
								if( ad > -238493 )
									ret := -0.013588
						if( Raw_Money_Flow > 1.09762e+08 )
							if( Money_Flow_Ratio <= 0.831844 )
								if( Raw_Money_Flow <= 1.54097e+08 )
									ret := -0.529412
								if( Raw_Money_Flow > 1.54097e+08 )
									ret := 0.283951
							if( Money_Flow_Ratio > 0.831844 )
								if( mf <= 0.460456 )
									ret := 0.520885
								if( mf > 0.460456 )
									ret := -0.600000
		if( ad_mf > -0.873552 )
			if( ad <= 8736.78 )
				if( Positive_Money_Flow <= 1201.58 )
					if( MFI_High <= -19.5005 )
						if( Negative_Money_Flow_Sum <= 3.18738e+06 )
							if( ad_mf <= 1289.99 )
								if( Positive_Money_Flow_Sum <= 3.69876e+06 )
									ret := 0.405128
								if( Positive_Money_Flow_Sum > 3.69876e+06 )
									ret := 0.023256
							if( ad_mf > 1289.99 )
								if( ad <= 3073.01 )
									ret := -0.148936
								if( ad > 3073.01 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 3.18738e+06 )
							if( ad_mf <= 7588.28 )
								if( Negative_Money_Flow <= 3.30003e+07 )
									ret := 0.028951
								if( Negative_Money_Flow > 3.30003e+07 )
									ret := 0.418605
							if( ad_mf > 7588.28 )
								if( Positive_Money_Flow_Sum <= 1.45934e+08 )
									ret := -0.323077
								if( Positive_Money_Flow_Sum > 1.45934e+08 )
									ret := 0.520000
					if( MFI_High > -19.5005 )
						if( Negative_Money_Flow <= 176567 )
							if( mf <= 0.386703 )
								if( mf <= -0.099101 )
									ret := -0.056034
								if( mf > -0.099101 )
									ret := 0.193878
							if( mf > 0.386703 )
								if( ad <= 1850.5 )
									ret := -0.098246
								if( ad > 1850.5 )
									ret := 0.777778 // buy
						if( Negative_Money_Flow > 176567 )
							if( Negative_Money_Flow_Sum <= 1.22726e+07 )
								if( Raw_Money_Flow <= 1.83336e+06 )
									ret := -0.205083
								if( Raw_Money_Flow > 1.83336e+06 )
									ret := -0.615385
							if( Negative_Money_Flow_Sum > 1.22726e+07 )
								if( MFI_High <= -16.551 )
									ret := -0.241667
								if( MFI_High > -16.551 )
									ret := 0.033074
				if( Positive_Money_Flow > 1201.58 )
					if( mf <= -0.018523 )
						if( MFI_Low <= 58.7446 )
							if( MFI_Low <= 22.9481 )
								if( Money_Flow_Ratio <= 0.335114 )
									ret := -0.153518
								if( Money_Flow_Ratio > 0.335114 )
									ret := 0.116387
							if( MFI_Low > 22.9481 )
								if( MFI_High <= -27.3519 )
									ret := -0.197689
								if( MFI_High > -27.3519 )
									ret := 0.003817
						if( MFI_Low > 58.7446 )
							if( Positive_Money_Flow <= 147431 )
								if( MFI_Low <= 77.1453 )
									ret := -0.010638
								if( MFI_Low > 77.1453 )
									ret := 0.411765
							if( Positive_Money_Flow > 147431 )
								if( Raw_Money_Flow <= 9.58594e+06 )
									ret := -0.384279
								if( Raw_Money_Flow > 9.58594e+06 )
									ret := 0.466667
					if( mf > -0.018523 )
						if( Raw_Money_Flow <= 4.25742e+06 )
							if( mf <= 0.41431 )
								if( Negative_Money_Flow_Sum <= 6.23524e+06 )
									ret := -0.289300
								if( Negative_Money_Flow_Sum > 6.23524e+06 )
									ret := -0.104895
							if( mf > 0.41431 )
								if( MFI_High <= -52.3162 )
									ret := -0.375758
								if( MFI_High > -52.3162 )
									ret := -0.058606
						if( Raw_Money_Flow > 4.25742e+06 )
							if( ad <= 8565.13 )
								if( ad_mf <= 8039.75 )
									ret := -0.035256
								if( ad_mf > 8039.75 )
									ret := 0.273438
							if( ad > 8565.13 )
								if( Raw_Money_Flow <= 1.00783e+07 )
									ret := -0.300000
								if( Raw_Money_Flow > 1.00783e+07 )
									ret := -0.857143 // sell
			if( ad > 8736.78 )
				if( mf <= 0.719529 )
					if( mf <= 0.132332 )
						if( Typical_Price <= 213.762 )
							if( MFI_Low <= 13.9542 )
								if( Positive_Money_Flow <= 1.59997e+08 )
									ret := -0.047069
								if( Positive_Money_Flow > 1.59997e+08 )
									ret := -0.863636 // sell
							if( MFI_Low > 13.9542 )
								if( mf <= 0.009059 )
									ret := 0.131975
								if( mf > 0.009059 )
									ret := 0.016144
						if( Typical_Price > 213.762 )
							if( Raw_Money_Flow <= 8.79036e+07 )
								if( Raw_Money_Flow <= 2.47506e+07 )
									ret := -0.005701
								if( Raw_Money_Flow > 2.47506e+07 )
									ret := -0.098319
							if( Raw_Money_Flow > 8.79036e+07 )
								if( Money_Flow_Ratio <= 1.36355 )
									ret := -0.606299
								if( Money_Flow_Ratio > 1.36355 )
									ret := 0.220930
					if( mf > 0.132332 )
						if( Money_Flow_Ratio <= 2.66609 )
							if( Raw_Money_Flow <= 2.69163e+07 )
								if( MFI_High <= -12.7438 )
									ret := -0.029888
								if( MFI_High > -12.7438 )
									ret := -0.197292
							if( Raw_Money_Flow > 2.69163e+07 )
								if( MFI <= 64.5579 )
									ret := -0.015276
								if( MFI > 64.5579 )
									ret := 0.182990
						if( Money_Flow_Ratio > 2.66609 )
							if( Negative_Money_Flow_Sum <= 3.20541e+07 )
								if( Negative_Money_Flow_Sum <= 1.64268e+06 )
									ret := -0.368000
								if( Negative_Money_Flow_Sum > 1.64268e+06 )
									ret := 0.016229
							if( Negative_Money_Flow_Sum > 3.20541e+07 )
								if( Negative_Money_Flow_Sum <= 1.91434e+09 )
									ret := -0.210494
								if( Negative_Money_Flow_Sum > 1.91434e+09 )
									ret := -1.000000 // sell
				if( mf > 0.719529 )
					if( ad <= 38764 )
						if( Typical_Price <= 191.27 )
							ret := 0.695652
						if( Typical_Price > 191.27 )
							if( MFI_High <= 3.35192 )
								ret := -0.789474 // sell
							if( MFI_High > 3.35192 )
								ret := -0.105263
					if( ad > 38764 )
						if( ad_mf <= 1.5968e+06 )
							if( Positive_Money_Flow_Sum <= 3.82488e+08 )
								if( Positive_Money_Flow_Sum <= 2.76691e+08 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 2.76691e+08 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.82488e+08 )
								ret := -0.181818
						if( ad_mf > 1.5968e+06 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_AAPL_1Min_9565e5be(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


