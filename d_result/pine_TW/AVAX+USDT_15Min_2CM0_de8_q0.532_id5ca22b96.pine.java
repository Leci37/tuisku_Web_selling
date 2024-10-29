//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AVAXUSDT_15Min_2CM0_5ca22b96 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_2CM0_5ca22b96", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_5ca22b96(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 6.87503e+06 )
		if( Raw_Money_Flow <= 1.9059e+06 )
			if( Typical_Price <= 25.8652 )
				if( ad <= -2605.91 )
					if( MFI_High <= -63.2187 )
						if( Negative_Money_Flow_Sum <= 5.8327e+06 )
							if( Money_Flow_Ratio <= 0.193309 )
								if( ad <= -33948.4 )
									ret := 0.791667 // buy
								if( ad > -33948.4 )
									ret := 0.031696
							if( Money_Flow_Ratio > 0.193309 )
								if( mf <= -0.032288 )
									ret := 0.800000 // buy
								if( mf > -0.032288 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 5.8327e+06 )
							if( Raw_Money_Flow <= 282038 )
								if( Typical_Price <= 17.2683 )
									ret := 0.266667
								if( Typical_Price > 17.2683 )
									ret := -0.464286
							if( Raw_Money_Flow > 282038 )
								if( Positive_Money_Flow_Sum <= 1.45897e+06 )
									ret := 0.684028
								if( Positive_Money_Flow_Sum > 1.45897e+06 )
									ret := 0.243697
					if( MFI_High > -63.2187 )
						if( Raw_Money_Flow <= 214955 )
							if( mf <= -0.158139 )
								if( ad_mf <= -12977.4 )
									ret := 0.314286
								if( ad_mf > -12977.4 )
									ret := -0.089202
							if( mf > -0.158139 )
								if( Positive_Money_Flow_Sum <= 667690 )
									ret := -0.074495
								if( Positive_Money_Flow_Sum > 667690 )
									ret := 0.077121
						if( Raw_Money_Flow > 214955 )
							if( Negative_Money_Flow <= 1.7626e+06 )
								if( Negative_Money_Flow_Sum <= 629855 )
									ret := -0.144068
								if( Negative_Money_Flow_Sum > 629855 )
									ret := 0.116285
							if( Negative_Money_Flow > 1.7626e+06 )
								if( ad_mf <= -47353.8 )
									ret := -0.733333 // sell
								if( ad_mf > -47353.8 )
									ret := -0.203704
				if( ad > -2605.91 )
					if( MFI <= 49.441 )
						if( Negative_Money_Flow <= 1.67136e+06 )
							if( MFI_High <= -76.0212 )
								if( mf <= -0.224997 )
									ret := -0.500000
								if( mf > -0.224997 )
									ret := 0.760870 // buy
							if( MFI_High > -76.0212 )
								if( Raw_Money_Flow <= 832629 )
									ret := -0.031226
								if( Raw_Money_Flow > 832629 )
									ret := -0.169240
						if( Negative_Money_Flow > 1.67136e+06 )
							if( mf <= -0.049564 )
								if( Typical_Price <= 22.9636 )
									ret := 1.000000 // buy
								if( Typical_Price > 22.9636 )
									ret := 0.400000
							if( mf > -0.049564 )
								ret := -0.117647
					if( MFI > 49.441 )
						if( MFI_Low <= 75.7913 )
							if( Raw_Money_Flow <= 87020.5 )
								if( MFI_High <= -9.45533 )
									ret := -0.052213
								if( MFI_High > -9.45533 )
									ret := 0.057546
							if( Raw_Money_Flow > 87020.5 )
								if( Negative_Money_Flow_Sum <= 3.64642e+06 )
									ret := 0.027880
								if( Negative_Money_Flow_Sum > 3.64642e+06 )
									ret := 0.231814
						if( MFI_Low > 75.7913 )
							if( MFI <= 96.4775 )
								ret := -1.000000 // sell
							if( MFI > 96.4775 )
								ret := -0.571429
			if( Typical_Price > 25.8652 )
				if( ad <= -10444.7 )
					if( Money_Flow_Ratio <= 0.74069 )
						if( mf <= -0.294466 )
							if( MFI <= 24.2113 )
								if( Negative_Money_Flow_Sum <= 2.1765e+07 )
									ret := -0.511628
								if( Negative_Money_Flow_Sum > 2.1765e+07 )
									ret := 0.333333
							if( MFI > 24.2113 )
								if( Negative_Money_Flow <= 626600 )
									ret := 0.531250
								if( Negative_Money_Flow > 626600 )
									ret := -0.270270
						if( mf > -0.294466 )
							if( Positive_Money_Flow <= 543643 )
								if( MFI_High <= -64.2778 )
									ret := 0.588571
								if( MFI_High > -64.2778 )
									ret := 0.143894
							if( Positive_Money_Flow > 543643 )
								if( mf <= -0.113644 )
									ret := -0.400000
								if( mf > -0.113644 )
									ret := 0.419753
					if( Money_Flow_Ratio > 0.74069 )
						if( MFI_High <= -36.517 )
							if( Raw_Money_Flow <= 975939 )
								if( MFI <= 42.698 )
									ret := -0.652174
								if( MFI > 42.698 )
									ret := -0.181818
							if( Raw_Money_Flow > 975939 )
								if( MFI <= 42.8609 )
									ret := -1.000000 // sell
								if( MFI > 42.8609 )
									ret := -0.615385
						if( MFI_High > -36.517 )
							if( Positive_Money_Flow_Sum <= 4.73436e+06 )
								if( mf <= -0.202225 )
									ret := -0.333333
								if( mf > -0.202225 )
									ret := 0.132376
							if( Positive_Money_Flow_Sum > 4.73436e+06 )
								if( Positive_Money_Flow_Sum <= 6.25375e+06 )
									ret := -0.226601
								if( Positive_Money_Flow_Sum > 6.25375e+06 )
									ret := 0.152941
				if( ad > -10444.7 )
					if( Raw_Money_Flow <= 177102 )
						if( Negative_Money_Flow_Sum <= 1.20691e+06 )
							if( Positive_Money_Flow <= 23427.3 )
								if( Negative_Money_Flow_Sum <= 775919 )
									ret := -0.115385
								if( Negative_Money_Flow_Sum > 775919 )
									ret := 0.238095
							if( Positive_Money_Flow > 23427.3 )
								if( Negative_Money_Flow_Sum <= 574525 )
									ret := -0.315789
								if( Negative_Money_Flow_Sum > 574525 )
									ret := 0.008772
						if( Negative_Money_Flow_Sum > 1.20691e+06 )
							if( Typical_Price <= 26.9079 )
								if( MFI_High <= -51.6627 )
									ret := 0.117647
								if( MFI_High > -51.6627 )
									ret := -0.445714
							if( Typical_Price > 26.9079 )
								if( MFI <= 58.2854 )
									ret := -0.135569
								if( MFI > 58.2854 )
									ret := -0.374101
					if( Raw_Money_Flow > 177102 )
						if( Positive_Money_Flow_Sum <= 926239 )
							if( Positive_Money_Flow <= 263596 )
								if( Typical_Price <= 33.5418 )
									ret := -0.478528
								if( Typical_Price > 33.5418 )
									ret := 0.000000
							if( Positive_Money_Flow > 263596 )
								ret := 0.230769
						if( Positive_Money_Flow_Sum > 926239 )
							if( MFI_High <= -67.5054 )
								if( mf <= -0.208316 )
									ret := -0.066667
								if( mf > -0.208316 )
									ret := 0.622951
							if( MFI_High > -67.5054 )
								if( mf <= -0.039124 )
									ret := 0.008164
								if( mf > -0.039124 )
									ret := -0.073122
		if( Raw_Money_Flow > 1.9059e+06 )
			if( Positive_Money_Flow_Sum <= 5.3917e+06 )
				if( Raw_Money_Flow <= 2.01493e+06 )
					if( MFI <= 65.0226 )
						if( MFI <= 33.8492 )
							if( mf <= -0.222676 )
								if( ad <= -12740.1 )
									ret := -0.125000
								if( ad > -12740.1 )
									ret := 0.600000
							if( mf > -0.222676 )
								if( MFI <= 28.5242 )
									ret := 0.687500
								if( MFI > 28.5242 )
									ret := -0.384615
						if( MFI > 33.8492 )
							if( ad <= -47899.3 )
								ret := 1.000000 // buy
							if( ad > -47899.3 )
								if( Raw_Money_Flow <= 1.92882e+06 )
									ret := 0.066667
								if( Raw_Money_Flow > 1.92882e+06 )
									ret := 0.875000 // buy
					if( MFI > 65.0226 )
						ret := -0.166667
				if( Raw_Money_Flow > 2.01493e+06 )
					if( Money_Flow_Ratio <= 0.723788 )
						if( ad_mf <= -125889 )
							if( Money_Flow_Ratio <= 0.489169 )
								if( mf <= -0.16271 )
									ret := 0.714286 // buy
								if( mf > -0.16271 )
									ret := -0.333333
							if( Money_Flow_Ratio > 0.489169 )
								ret := -0.769231 // sell
						if( ad_mf > -125889 )
							if( Money_Flow_Ratio <= 0.543804 )
								if( ad_mf <= -77197.9 )
									ret := -0.105263
								if( ad_mf > -77197.9 )
									ret := 0.188254
							if( Money_Flow_Ratio > 0.543804 )
								if( mf <= -0.127195 )
									ret := 0.734375 // buy
								if( mf > -0.127195 )
									ret := 0.380952
					if( Money_Flow_Ratio > 0.723788 )
						if( ad <= 85876.9 )
							if( mf <= -0.001752 )
								if( Negative_Money_Flow <= 2.36585e+06 )
									ret := 0.333333
								if( Negative_Money_Flow > 2.36585e+06 )
									ret := -0.636364
							if( mf > -0.001752 )
								if( Positive_Money_Flow <= 2.04089e+06 )
									ret := 0.333333
								if( Positive_Money_Flow > 2.04089e+06 )
									ret := -0.676471
						if( ad > 85876.9 )
							if( MFI_Low <= 43.612 )
								ret := 0.105263
							if( MFI_Low > 43.612 )
								if( Positive_Money_Flow <= 2.6248e+06 )
									ret := 0.600000
								if( Positive_Money_Flow > 2.6248e+06 )
									ret := 0.866667 // buy
			if( Positive_Money_Flow_Sum > 5.3917e+06 )
				if( Raw_Money_Flow <= 4.66496e+06 )
					if( MFI_High <= -55.1635 )
						if( Typical_Price <= 26.5817 )
							if( Negative_Money_Flow_Sum <= 2.48191e+07 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 2.48191e+07 )
								if( MFI <= 16.7883 )
									ret := -0.428571
								if( MFI > 16.7883 )
									ret := -0.933333 // sell
						if( Typical_Price > 26.5817 )
							if( Positive_Money_Flow_Sum <= 5.63669e+06 )
								if( ad_mf <= -34883.4 )
									ret := 0.083333
								if( ad_mf > -34883.4 )
									ret := -0.555556
							if( Positive_Money_Flow_Sum > 5.63669e+06 )
								if( Positive_Money_Flow_Sum <= 6.03067e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 6.03067e+06 )
									ret := 0.620000
					if( MFI_High > -55.1635 )
						if( MFI_Low <= 9.27905 )
							if( ad_mf <= -32796.5 )
								ret := -0.300000
							if( ad_mf > -32796.5 )
								if( Money_Flow_Ratio <= 0.371347 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.371347 )
									ret := -0.708333 // sell
						if( MFI_Low > 9.27905 )
							if( Positive_Money_Flow_Sum <= 6.17417e+06 )
								if( Raw_Money_Flow <= 2.65324e+06 )
									ret := -0.074830
								if( Raw_Money_Flow > 2.65324e+06 )
									ret := -0.642105
							if( Positive_Money_Flow_Sum > 6.17417e+06 )
								if( MFI_Low <= 11.7501 )
									ret := -0.636364
								if( MFI_Low > 11.7501 )
									ret := 0.326797
				if( Raw_Money_Flow > 4.66496e+06 )
					if( Typical_Price <= 35.5213 )
						if( Negative_Money_Flow <= 7.22197e+06 )
							if( MFI <= 25.5193 )
								ret := 1.000000 // buy
							if( MFI > 25.5193 )
								ret := 0.800000 // buy
						if( Negative_Money_Flow > 7.22197e+06 )
							ret := -0.142857
					if( Typical_Price > 35.5213 )
						if( Raw_Money_Flow <= 6.08775e+06 )
							ret := 0.846154 // buy
						if( Raw_Money_Flow > 6.08775e+06 )
							if( Typical_Price <= 51.5317 )
								ret := -0.928571 // sell
							if( Typical_Price > 51.5317 )
								ret := 0.000000
	if( Positive_Money_Flow_Sum > 6.87503e+06 )
		if( Negative_Money_Flow <= 933351 )
			if( MFI_High <= -9.89632 )
				if( MFI_Low <= 39.0482 )
					if( Positive_Money_Flow_Sum <= 6.57228e+07 )
						if( ad <= 73456.7 )
							if( Positive_Money_Flow_Sum <= 4.0161e+07 )
								if( Negative_Money_Flow <= 572441 )
									ret := -0.086339
								if( Negative_Money_Flow > 572441 )
									ret := -0.233624
							if( Positive_Money_Flow_Sum > 4.0161e+07 )
								if( Raw_Money_Flow <= 4.06844e+06 )
									ret := 0.923077 // buy
								if( Raw_Money_Flow > 4.06844e+06 )
									ret := 0.033708
						if( ad > 73456.7 )
							if( Negative_Money_Flow_Sum <= 6.94821e+07 )
								if( MFI <= 39.6149 )
									ret := 0.624000
								if( MFI > 39.6149 )
									ret := 0.150485
							if( Negative_Money_Flow_Sum > 6.94821e+07 )
								if( ad_mf <= 115657 )
									ret := 0.809524 // buy
								if( ad_mf > 115657 )
									ret := -0.914894 // sell
					if( Positive_Money_Flow_Sum > 6.57228e+07 )
						ret := -1.000000 // sell
				if( MFI_Low > 39.0482 )
					if( Money_Flow_Ratio <= 1.96234 )
						if( Money_Flow_Ratio <= 1.83886 )
							if( ad_mf <= -7721.77 )
								if( mf <= -0.18255 )
									ret := -0.857143 // sell
								if( mf > -0.18255 )
									ret := 0.228169
							if( ad_mf > -7721.77 )
								if( MFI_Low <= 43.7648 )
									ret := 0.001190
								if( MFI_Low > 43.7648 )
									ret := -0.220159
						if( Money_Flow_Ratio > 1.83886 )
							if( Raw_Money_Flow <= 1.85997e+06 )
								if( ad_mf <= -14587 )
									ret := -0.350515
								if( ad_mf > -14587 )
									ret := 0.130252
							if( Raw_Money_Flow > 1.85997e+06 )
								if( ad_mf <= 110296 )
									ret := 0.506494
								if( ad_mf > 110296 )
									ret := 1.000000 // buy
					if( Money_Flow_Ratio > 1.96234 )
						if( ad <= -23196.2 )
							if( Raw_Money_Flow <= 580404 )
								ret := 0.944444 // buy
							if( Raw_Money_Flow > 580404 )
								if( mf <= 0.125562 )
									ret := 0.033784
								if( mf > 0.125562 )
									ret := 0.553571
						if( ad > -23196.2 )
							if( mf <= 0.180126 )
								if( Negative_Money_Flow_Sum <= 4.35795e+06 )
									ret := 0.009843
								if( Negative_Money_Flow_Sum > 4.35795e+06 )
									ret := -0.244253
							if( mf > 0.180126 )
								if( MFI_Low <= 49.4899 )
									ret := 0.081818
								if( MFI_Low > 49.4899 )
									ret := 0.727273 // buy
			if( MFI_High > -9.89632 )
				if( Positive_Money_Flow_Sum <= 3.98281e+07 )
					if( Money_Flow_Ratio <= 13.3063 )
						if( Raw_Money_Flow <= 2.09725e+06 )
							if( Positive_Money_Flow_Sum <= 3.45177e+07 )
								if( Negative_Money_Flow_Sum <= 6.62766e+06 )
									ret := -0.198900
								if( Negative_Money_Flow_Sum > 6.62766e+06 )
									ret := 0.128028
							if( Positive_Money_Flow_Sum > 3.45177e+07 )
								if( ad_mf <= 13543.2 )
									ret := 0.967742 // buy
								if( ad_mf > 13543.2 )
									ret := 0.533333
						if( Raw_Money_Flow > 2.09725e+06 )
							if( Negative_Money_Flow_Sum <= 2.19321e+06 )
								if( ad <= -15660.4 )
									ret := -0.275862
								if( ad > -15660.4 )
									ret := 0.417476
							if( Negative_Money_Flow_Sum > 2.19321e+06 )
								if( Positive_Money_Flow <= 2.64145e+06 )
									ret := 0.187215
								if( Positive_Money_Flow > 2.64145e+06 )
									ret := -0.136525
					if( Money_Flow_Ratio > 13.3063 )
						if( Typical_Price <= 16.9348 )
							if( MFI <= 93.5987 )
								ret := -1.000000 // sell
							if( MFI > 93.5987 )
								if( Positive_Money_Flow <= 2.43597e+06 )
									ret := -0.375000
								if( Positive_Money_Flow > 2.43597e+06 )
									ret := 0.090909
						if( Typical_Price > 16.9348 )
							if( mf <= 0.235312 )
								if( Positive_Money_Flow_Sum <= 9.39737e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 9.39737e+06 )
									ret := 0.714286 // buy
							if( mf > 0.235312 )
								if( MFI_High <= 13.8152 )
									ret := 0.638889
								if( MFI_High > 13.8152 )
									ret := -0.056911
				if( Positive_Money_Flow_Sum > 3.98281e+07 )
					if( Typical_Price <= 16.1247 )
						if( Money_Flow_Ratio <= 3.18296 )
							ret := 0.928571 // buy
						if( Money_Flow_Ratio > 3.18296 )
							ret := 0.750000 // buy
					if( Typical_Price > 16.1247 )
						if( MFI_Low <= 56.2653 )
							if( Positive_Money_Flow_Sum <= 6.65236e+07 )
								if( MFI <= 71.2826 )
									ret := -1.000000 // sell
								if( MFI > 71.2826 )
									ret := 0.085714
							if( Positive_Money_Flow_Sum > 6.65236e+07 )
								if( Positive_Money_Flow_Sum <= 8.05873e+07 )
									ret := 0.944444 // buy
								if( Positive_Money_Flow_Sum > 8.05873e+07 )
									ret := 0.571429
						if( MFI_Low > 56.2653 )
							if( Typical_Price <= 44.8218 )
								if( Negative_Money_Flow_Sum <= 1.00046e+07 )
									ret := 0.054054
								if( Negative_Money_Flow_Sum > 1.00046e+07 )
									ret := -0.764706 // sell
							if( Typical_Price > 44.8218 )
								if( MFI <= 87.675 )
									ret := -0.815476 // sell
								if( MFI > 87.675 )
									ret := 0.166667
		if( Negative_Money_Flow > 933351 )
			if( ad_mf <= -94864.1 )
				if( Typical_Price <= 51.4488 )
					if( mf <= -0.435661 )
						ret := -1.000000 // sell
					if( mf > -0.435661 )
						if( Negative_Money_Flow <= 1.91302e+06 )
							ret := -0.733333 // sell
						if( Negative_Money_Flow > 1.91302e+06 )
							if( Negative_Money_Flow <= 8.49024e+06 )
								if( mf <= 0.113212 )
									ret := 0.190141
								if( mf > 0.113212 )
									ret := 0.558824
							if( Negative_Money_Flow > 8.49024e+06 )
								if( MFI_Low <= 14.3069 )
									ret := 0.960784 // buy
								if( MFI_Low > 14.3069 )
									ret := 0.363636
				if( Typical_Price > 51.4488 )
					if( Negative_Money_Flow <= 6.77244e+06 )
						ret := 0.818182 // buy
					if( Negative_Money_Flow > 6.77244e+06 )
						if( Positive_Money_Flow_Sum <= 6.61076e+07 )
							if( MFI_High <= -33.7503 )
								if( Positive_Money_Flow_Sum <= 1.78888e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.78888e+07 )
									ret := -0.476190
							if( MFI_High > -33.7503 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 6.61076e+07 )
							ret := -0.090909
			if( ad_mf > -94864.1 )
				if( Negative_Money_Flow_Sum <= 5.81193e+07 )
					if( MFI_High <= 1.6685 )
						if( Raw_Money_Flow <= 4.75564e+06 )
							if( Typical_Price <= 58.687 )
								if( Positive_Money_Flow_Sum <= 2.94983e+07 )
									ret := 0.034554
								if( Positive_Money_Flow_Sum > 2.94983e+07 )
									ret := -0.159346
							if( Typical_Price > 58.687 )
								if( Raw_Money_Flow <= 985831 )
									ret := 0.307692
								if( Raw_Money_Flow > 985831 )
									ret := -0.529412
						if( Raw_Money_Flow > 4.75564e+06 )
							if( Money_Flow_Ratio <= 0.702334 )
								if( MFI <= 25.4101 )
									ret := -0.756410 // sell
								if( MFI > 25.4101 )
									ret := 0.165138
							if( Money_Flow_Ratio > 0.702334 )
								if( Negative_Money_Flow_Sum <= 5.70041e+07 )
									ret := -0.511521
								if( Negative_Money_Flow_Sum > 5.70041e+07 )
									ret := 1.000000 // buy
					if( MFI_High > 1.6685 )
						if( mf <= 0.222141 )
							if( ad_mf <= -5556.11 )
								if( MFI_Low <= 65.4376 )
									ret := 0.744681 // buy
								if( MFI_Low > 65.4376 )
									ret := 0.312500
							if( ad_mf > -5556.11 )
								ret := -0.076923
						if( mf > 0.222141 )
							if( Typical_Price <= 40.1152 )
								if( ad <= -38725.6 )
									ret := -0.823529 // sell
								if( ad > -38725.6 )
									ret := 0.460526
							if( Typical_Price > 40.1152 )
								if( ad_mf <= -3999.85 )
									ret := 0.000000
								if( ad_mf > -3999.85 )
									ret := -0.785714 // sell
				if( Negative_Money_Flow_Sum > 5.81193e+07 )
					if( MFI_High <= -55.4867 )
						if( mf <= -0.147056 )
							if( Typical_Price <= 57.4208 )
								if( MFI_Low <= -4.0035 )
									ret := 1.000000 // buy
								if( MFI_Low > -4.0035 )
									ret := -0.576923
							if( Typical_Price > 57.4208 )
								ret := -1.000000 // sell
						if( mf > -0.147056 )
							if( Typical_Price <= 53.2529 )
								if( Negative_Money_Flow <= 4.28426e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 4.28426e+06 )
									ret := 0.615385
							if( Typical_Price > 53.2529 )
								if( ad <= -38963.8 )
									ret := -0.250000
								if( ad > -38963.8 )
									ret := 0.153846
					if( MFI_High > -55.4867 )
						if( Positive_Money_Flow <= 2.43726e+06 )
							if( ad <= 101695 )
								if( Typical_Price <= 55.4489 )
									ret := 0.784530 // buy
								if( Typical_Price > 55.4489 )
									ret := 0.418182
							if( ad > 101695 )
								ret := 0.047619
						if( Positive_Money_Flow > 2.43726e+06 )
							ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_5ca22b96(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


