//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: DOGEUSDT_15Min_2MV0_aeefbf64 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_2MV0_aeefbf64", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_aeefbf64(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Money_Flow_Ratio <= 0.684017 )
		if( Negative_Money_Flow_Sum <= 8.1714e+06 )
			if( Typical_Price <= 0.080786 )
				if( Positive_Money_Flow_Sum <= 2.56845e+06 )
					if( MFI_Low <= -5.6961 )
						if( VIM <= 1.13897 )
							if( Typical_Price <= 0.063068 )
								ret := -0.222222
							if( Typical_Price > 0.063068 )
								ret := -0.727273 // sell
						if( VIM > 1.13897 )
							if( MFI_High <= -69.5648 )
								if( Raw_Money_Flow <= 1.0269e+06 )
									ret := -0.012195
								if( Raw_Money_Flow > 1.0269e+06 )
									ret := -0.421053
							if( MFI_High > -69.5648 )
								if( VIP_VIM <= -0.431848 )
									ret := 0.507614
								if( VIP_VIM > -0.431848 )
									ret := 0.046154
					if( MFI_Low > -5.6961 )
						if( VIP_VIM <= -0.152004 )
							if( VIP <= 0.66392 )
								if( MFI <= 21.134 )
									ret := 0.127273
								if( MFI > 21.134 )
									ret := 0.557377
							if( VIP > 0.66392 )
								if( Negative_Money_Flow_Sum <= 4.27504e+06 )
									ret := -0.025551
								if( Negative_Money_Flow_Sum > 4.27504e+06 )
									ret := -0.127434
						if( VIP_VIM > -0.152004 )
							if( Negative_Money_Flow <= 101483 )
								if( Positive_Money_Flow_Sum <= 1.9025e+06 )
									ret := 0.037694
								if( Positive_Money_Flow_Sum > 1.9025e+06 )
									ret := -0.175097
							if( Negative_Money_Flow > 101483 )
								if( VIP <= 0.932044 )
									ret := -0.063670
								if( VIP > 0.932044 )
									ret := 0.186459
				if( Positive_Money_Flow_Sum > 2.56845e+06 )
					if( VIM <= 0.93521 )
						if( MFI_Low <= 17.7578 )
							if( Money_Flow_Ratio <= 0.564068 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.564068 )
								ret := 0.916667 // buy
						if( MFI_Low > 17.7578 )
							if( Positive_Money_Flow_Sum <= 3.93542e+06 )
								ret := -0.090909
							if( Positive_Money_Flow_Sum > 3.93542e+06 )
								ret := 0.454545
					if( VIM > 0.93521 )
						if( Raw_Money_Flow <= 1.94717e+06 )
							if( Raw_Money_Flow <= 1.57075e+06 )
								if( VIP <= 0.830845 )
									ret := 0.356383
								if( VIP > 0.830845 )
									ret := 0.098772
							if( Raw_Money_Flow > 1.57075e+06 )
								if( Typical_Price <= 0.076297 )
									ret := -0.625000
								if( Typical_Price > 0.076297 )
									ret := 0.352941
						if( Raw_Money_Flow > 1.94717e+06 )
							if( Raw_Money_Flow <= 2.945e+06 )
								if( Negative_Money_Flow_Sum <= 7.72719e+06 )
									ret := 0.590909
								if( Negative_Money_Flow_Sum > 7.72719e+06 )
									ret := 0.942857 // buy
							if( Raw_Money_Flow > 2.945e+06 )
								ret := 0.133333
			if( Typical_Price > 0.080786 )
				if( MFI <= 17.9759 )
					if( MFI_Low <= -8.22493 )
						if( VIP <= 0.67528 )
							if( VIP_VIM <= -0.672182 )
								if( Positive_Money_Flow_Sum <= 851209 )
									ret := -0.111111
								if( Positive_Money_Flow_Sum > 851209 )
									ret := -0.428571
							if( VIP_VIM > -0.672182 )
								ret := -0.857143 // sell
						if( VIP > 0.67528 )
							if( Negative_Money_Flow <= 364312 )
								ret := -0.523810
							if( Negative_Money_Flow > 364312 )
								ret := 0.370370
					if( MFI_Low > -8.22493 )
						if( Negative_Money_Flow_Sum <= 7.51226e+06 )
							if( Negative_Money_Flow_Sum <= 4.88718e+06 )
								if( MFI_High <= -67.6841 )
									ret := 0.923077 // buy
								if( MFI_High > -67.6841 )
									ret := 0.454545
							if( Negative_Money_Flow_Sum > 4.88718e+06 )
								if( VIP <= 0.670312 )
									ret := 0.764706 // buy
								if( VIP > 0.670312 )
									ret := 0.116279
						if( Negative_Money_Flow_Sum > 7.51226e+06 )
							if( Positive_Money_Flow_Sum <= 1.36053e+06 )
								if( MFI_Low <= -5.98513 )
									ret := 0.800000 // buy
								if( MFI_Low > -5.98513 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.36053e+06 )
								if( Raw_Money_Flow <= 741265 )
									ret := 0.000000
								if( Raw_Money_Flow > 741265 )
									ret := 0.666667
				if( MFI > 17.9759 )
					if( VIP <= 1.02232 )
						if( Typical_Price <= 0.102476 )
							if( Negative_Money_Flow_Sum <= 7.89883e+06 )
								if( MFI_Low <= 10.6767 )
									ret := -0.159937
								if( MFI_Low > 10.6767 )
									ret := -0.045733
							if( Negative_Money_Flow_Sum > 7.89883e+06 )
								if( Raw_Money_Flow <= 1.46173e+06 )
									ret := -0.561224
								if( Raw_Money_Flow > 1.46173e+06 )
									ret := 0.333333
						if( Typical_Price > 0.102476 )
							if( Negative_Money_Flow_Sum <= 4.36658e+06 )
								if( VIP <= 0.963999 )
									ret := 0.111111
								if( VIP > 0.963999 )
									ret := 0.372093
							if( Negative_Money_Flow_Sum > 4.36658e+06 )
								if( VIP_VIM <= -0.139908 )
									ret := -0.025217
								if( VIP_VIM > -0.139908 )
									ret := -0.291339
					if( VIP > 1.02232 )
						if( Positive_Money_Flow <= 752281 )
							if( MFI <= 36.7873 )
								if( MFI_High <= -43.8644 )
									ret := 0.194175
								if( MFI_High > -43.8644 )
									ret := 0.714286 // buy
							if( MFI > 36.7873 )
								if( Negative_Money_Flow_Sum <= 6.22202e+06 )
									ret := -0.097345
								if( Negative_Money_Flow_Sum > 6.22202e+06 )
									ret := 0.433333
						if( Positive_Money_Flow > 752281 )
							ret := -0.600000
		if( Negative_Money_Flow_Sum > 8.1714e+06 )
			if( Typical_Price <= 0.074665 )
				if( MFI_Low <= -15.3501 )
					if( MFI_High <= -78.7041 )
						ret := 0.777778 // buy
					if( MFI_High > -78.7041 )
						if( Negative_Money_Flow_Sum <= 1.2307e+07 )
							ret := -0.230769
						if( Negative_Money_Flow_Sum > 1.2307e+07 )
							if( MFI <= 3.24232 )
								ret := -0.956522 // sell
							if( MFI > 3.24232 )
								ret := -0.555556
				if( MFI_Low > -15.3501 )
					if( VIM <= 1.24111 )
						if( VIP_VIM <= -0.486553 )
							if( Raw_Money_Flow <= 3.32674e+06 )
								if( VIP_VIM <= -0.550858 )
									ret := -0.333333
								if( VIP_VIM > -0.550858 )
									ret := 0.651163
							if( Raw_Money_Flow > 3.32674e+06 )
								if( VIM <= 1.23097 )
									ret := 0.900000 // buy
								if( VIM > 1.23097 )
									ret := 0.363636
						if( VIP_VIM > -0.486553 )
							if( VIP_VIM <= -0.462522 )
								if( Negative_Money_Flow <= 124387 )
									ret := -0.326087
								if( Negative_Money_Flow > 124387 )
									ret := 0.237288
							if( VIP_VIM > -0.462522 )
								if( MFI <= 40.2877 )
									ret := 0.357102
								if( MFI > 40.2877 )
									ret := -0.434783
					if( VIM > 1.24111 )
						if( Raw_Money_Flow <= 1.40721e+06 )
							if( Positive_Money_Flow_Sum <= 4.20851e+06 )
								if( VIM <= 1.31466 )
									ret := 0.273312
								if( VIM > 1.31466 )
									ret := -0.006803
							if( Positive_Money_Flow_Sum > 4.20851e+06 )
								if( Positive_Money_Flow_Sum <= 5.69664e+06 )
									ret := -0.518182
								if( Positive_Money_Flow_Sum > 5.69664e+06 )
									ret := 0.242424
						if( Raw_Money_Flow > 1.40721e+06 )
							if( Negative_Money_Flow <= 1.95556e+06 )
								if( VIP_VIM <= -0.744527 )
									ret := 0.052632
								if( VIP_VIM > -0.744527 )
									ret := 0.666667
							if( Negative_Money_Flow > 1.95556e+06 )
								if( MFI_Low <= -6.60303 )
									ret := 0.319149
								if( MFI_Low > -6.60303 )
									ret := -0.037736
			if( Typical_Price > 0.074665 )
				if( Negative_Money_Flow_Sum <= 7.02479e+07 )
					if( Negative_Money_Flow <= 1.84576e+06 )
						if( VIP_VIM <= 0.074828 )
							if( MFI_Low <= 19.9637 )
								if( Raw_Money_Flow <= 3.17881e+06 )
									ret := 0.001549
								if( Raw_Money_Flow > 3.17881e+06 )
									ret := 0.130224
							if( MFI_Low > 19.9637 )
								if( Positive_Money_Flow <= 845699 )
									ret := 0.404110
								if( Positive_Money_Flow > 845699 )
									ret := 0.162963
						if( VIP_VIM > 0.074828 )
							if( Raw_Money_Flow <= 551993 )
								if( VIP_VIM <= 0.144167 )
									ret := -0.187500
								if( VIP_VIM > 0.144167 )
									ret := 0.421053
							if( Raw_Money_Flow > 551993 )
								if( Negative_Money_Flow <= 1.15115e+06 )
									ret := -0.701923 // sell
								if( Negative_Money_Flow > 1.15115e+06 )
									ret := 0.050000
					if( Negative_Money_Flow > 1.84576e+06 )
						if( Typical_Price <= 0.152235 )
							if( MFI_Low <= 9.63663 )
								if( Positive_Money_Flow_Sum <= 1.22664e+07 )
									ret := 0.073255
								if( Positive_Money_Flow_Sum > 1.22664e+07 )
									ret := 0.342432
							if( MFI_Low > 9.63663 )
								if( MFI <= 33.1133 )
									ret := 0.435593
								if( MFI > 33.1133 )
									ret := 0.237288
						if( Typical_Price > 0.152235 )
							if( Raw_Money_Flow <= 2.81835e+06 )
								if( MFI_Low <= 6.07197 )
									ret := 0.795918 // buy
								if( MFI_Low > 6.07197 )
									ret := 0.116751
							if( Raw_Money_Flow > 2.81835e+06 )
								if( Negative_Money_Flow <= 5.56963e+06 )
									ret := -0.356481
								if( Negative_Money_Flow > 5.56963e+06 )
									ret := -0.013405
				if( Negative_Money_Flow_Sum > 7.02479e+07 )
					if( VIP <= 0.76509 )
						if( Positive_Money_Flow <= 1.2045e+07 )
							if( VIP_VIM <= -0.664501 )
								if( Negative_Money_Flow_Sum <= 9.10349e+07 )
									ret := 0.965517 // buy
								if( Negative_Money_Flow_Sum > 9.10349e+07 )
									ret := 0.739130 // buy
							if( VIP_VIM > -0.664501 )
								if( Negative_Money_Flow <= 535078 )
									ret := 0.267442
								if( Negative_Money_Flow > 535078 )
									ret := 0.637306
						if( Positive_Money_Flow > 1.2045e+07 )
							if( Positive_Money_Flow <= 2.11087e+07 )
								if( MFI_High <= -45.647 )
									ret := -1.000000 // sell
								if( MFI_High > -45.647 )
									ret := -0.500000
							if( Positive_Money_Flow > 2.11087e+07 )
								ret := 0.076923
					if( VIP > 0.76509 )
						if( VIP_VIM <= -0.174621 )
							if( Negative_Money_Flow_Sum <= 2.56308e+08 )
								if( MFI_Low <= -2.29987 )
									ret := -0.666667
								if( MFI_Low > -2.29987 )
									ret := 0.296258
							if( Negative_Money_Flow_Sum > 2.56308e+08 )
								if( Positive_Money_Flow <= 567751 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 567751 )
									ret := -0.875000 // sell
						if( VIP_VIM > -0.174621 )
							if( Typical_Price <= 0.200805 )
								if( Money_Flow_Ratio <= 0.65304 )
									ret := -0.430622
								if( Money_Flow_Ratio > 0.65304 )
									ret := 0.341463
							if( Typical_Price > 0.200805 )
								ret := 0.500000
	if( Money_Flow_Ratio > 0.684017 )
		if( VIM <= 0.674131 )
			if( MFI <= 82.4329 )
				if( Raw_Money_Flow <= 2.71416e+07 )
					if( Negative_Money_Flow <= 6.0917e+06 )
						if( VIP <= 1.00578 )
							ret := 0.727273 // buy
						if( VIP > 1.00578 )
							if( Positive_Money_Flow_Sum <= 2.3044e+07 )
								if( Positive_Money_Flow_Sum <= 1.83385e+07 )
									ret := -0.065882
								if( Positive_Money_Flow_Sum > 1.83385e+07 )
									ret := -0.491525
							if( Positive_Money_Flow_Sum > 2.3044e+07 )
								if( Raw_Money_Flow <= 1.86355e+07 )
									ret := 0.464088
								if( Raw_Money_Flow > 1.86355e+07 )
									ret := -0.923077 // sell
					if( Negative_Money_Flow > 6.0917e+06 )
						if( Money_Flow_Ratio <= 2.58184 )
							ret := -0.090909
						if( Money_Flow_Ratio > 2.58184 )
							if( Negative_Money_Flow_Sum <= 2.13062e+07 )
								if( MFI <= 80.3011 )
									ret := -1.000000 // sell
								if( MFI > 80.3011 )
									ret := -0.714286 // sell
							if( Negative_Money_Flow_Sum > 2.13062e+07 )
								ret := -0.750000 // sell
				if( Raw_Money_Flow > 2.71416e+07 )
					if( Negative_Money_Flow_Sum <= 6.96618e+07 )
						if( Positive_Money_Flow <= 3.74188e+07 )
							if( Positive_Money_Flow <= 3.07459e+07 )
								ret := 0.714286 // buy
							if( Positive_Money_Flow > 3.07459e+07 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 3.74188e+07 )
							ret := 0.555556
					if( Negative_Money_Flow_Sum > 6.96618e+07 )
						ret := -0.388889
			if( MFI > 82.4329 )
				if( Negative_Money_Flow_Sum <= 1.70044e+07 )
					if( Raw_Money_Flow <= 1.34208e+07 )
						if( Negative_Money_Flow_Sum <= 1.0757e+07 )
							if( Raw_Money_Flow <= 1.01544e+07 )
								if( VIM <= 0.558589 )
									ret := -0.673203
								if( VIM > 0.558589 )
									ret := -0.244151
							if( Raw_Money_Flow > 1.01544e+07 )
								if( MFI_Low <= 65.3191 )
									ret := -0.428571
								if( MFI_Low > 65.3191 )
									ret := 0.571429
						if( Negative_Money_Flow_Sum > 1.0757e+07 )
							if( Positive_Money_Flow_Sum <= 8.88688e+07 )
								if( Money_Flow_Ratio <= 5.12812 )
									ret := -0.583333
								if( Money_Flow_Ratio > 5.12812 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8.88688e+07 )
								ret := -0.400000
					if( Raw_Money_Flow > 1.34208e+07 )
						if( Raw_Money_Flow <= 2.28525e+07 )
							if( Raw_Money_Flow <= 1.59622e+07 )
								if( Negative_Money_Flow_Sum <= 5.51268e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 5.51268e+06 )
									ret := -0.958333 // sell
							if( Raw_Money_Flow > 1.59622e+07 )
								if( Negative_Money_Flow_Sum <= 4.73893e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.73893e+06 )
									ret := -0.513514
						if( Raw_Money_Flow > 2.28525e+07 )
							if( Money_Flow_Ratio <= 11.8836 )
								if( Positive_Money_Flow_Sum <= 7.38382e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 7.38382e+07 )
									ret := 0.636364
							if( Money_Flow_Ratio > 11.8836 )
								ret := -0.600000
				if( Negative_Money_Flow_Sum > 1.70044e+07 )
					if( Positive_Money_Flow <= 4.35072e+07 )
						if( VIM <= 0.664571 )
							if( Positive_Money_Flow <= 1.39642e+07 )
								ret := -0.555556
							if( Positive_Money_Flow > 1.39642e+07 )
								if( Negative_Money_Flow_Sum <= 2.32315e+07 )
									ret := 0.964286 // buy
								if( Negative_Money_Flow_Sum > 2.32315e+07 )
									ret := 0.333333
						if( VIM > 0.664571 )
							ret := -0.300000
					if( Positive_Money_Flow > 4.35072e+07 )
						if( Typical_Price <= 0.165191 )
							ret := -0.083333
						if( Typical_Price > 0.165191 )
							ret := -0.923077 // sell
		if( VIM > 0.674131 )
			if( Positive_Money_Flow_Sum <= 4.54837e+07 )
				if( Money_Flow_Ratio <= 0.694008 )
					if( Typical_Price <= 0.118172 )
						if( Raw_Money_Flow <= 1.62806e+06 )
							if( Raw_Money_Flow <= 411206 )
								if( Raw_Money_Flow <= 276524 )
									ret := -0.192593
								if( Raw_Money_Flow > 276524 )
									ret := 0.216867
							if( Raw_Money_Flow > 411206 )
								if( Typical_Price <= 0.069338 )
									ret := -0.559322
								if( Typical_Price > 0.069338 )
									ret := -0.197628
						if( Raw_Money_Flow > 1.62806e+06 )
							if( MFI_High <= -39.2718 )
								if( VIM <= 1.09107 )
									ret := 0.882353 // buy
								if( VIM > 1.09107 )
									ret := 0.318182
							if( MFI_High > -39.2718 )
								if( VIM <= 1.09398 )
									ret := -0.307692
								if( VIM > 1.09398 )
									ret := 0.357143
					if( Typical_Price > 0.118172 )
						if( Negative_Money_Flow_Sum <= 3.77974e+07 )
							if( VIP_VIM <= -0.060977 )
								if( Negative_Money_Flow_Sum <= 1.2828e+07 )
									ret := -0.475000
								if( Negative_Money_Flow_Sum > 1.2828e+07 )
									ret := -0.863636 // sell
							if( VIP_VIM > -0.060977 )
								if( VIP_VIM <= 0.039583 )
									ret := 0.230769
								if( VIP_VIM > 0.039583 )
									ret := -0.714286 // sell
						if( Negative_Money_Flow_Sum > 3.77974e+07 )
							if( Typical_Price <= 0.163837 )
								ret := 0.312500
							if( Typical_Price > 0.163837 )
								ret := -0.421053
				if( Money_Flow_Ratio > 0.694008 )
					if( Positive_Money_Flow_Sum <= 3.37818e+07 )
						if( Negative_Money_Flow <= 2.75524e+06 )
							if( Raw_Money_Flow <= 2.79032e+06 )
								if( Typical_Price <= 0.078757 )
									ret := 0.019936
								if( Typical_Price > 0.078757 )
									ret := -0.027323
							if( Raw_Money_Flow > 2.79032e+06 )
								if( VIP_VIM <= -0.181344 )
									ret := -0.408397
								if( VIP_VIM > -0.181344 )
									ret := -0.107486
						if( Negative_Money_Flow > 2.75524e+06 )
							if( Negative_Money_Flow <= 1.02252e+07 )
								if( MFI_Low <= 56.4937 )
									ret := -0.159820
								if( MFI_Low > 56.4937 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.02252e+07 )
								if( MFI <= 53.4764 )
									ret := 0.541667
								if( MFI > 53.4764 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.37818e+07 )
						if( VIM <= 0.992577 )
							if( Negative_Money_Flow <= 4.81131e+06 )
								if( MFI <= 73.8424 )
									ret := 0.078520
								if( MFI > 73.8424 )
									ret := -0.130841
							if( Negative_Money_Flow > 4.81131e+06 )
								if( VIP <= 1.03652 )
									ret := -0.261905
								if( VIP > 1.03652 )
									ret := 0.604520
						if( VIM > 0.992577 )
							if( VIP_VIM <= -0.145452 )
								if( MFI_High <= -26.1842 )
									ret := 0.764957 // buy
								if( MFI_High > -26.1842 )
									ret := -0.562500
							if( VIP_VIM > -0.145452 )
								if( Positive_Money_Flow_Sum <= 3.42327e+07 )
									ret := 0.843137 // buy
								if( Positive_Money_Flow_Sum > 3.42327e+07 )
									ret := 0.240705
			if( Positive_Money_Flow_Sum > 4.54837e+07 )
				if( MFI <= 76.8466 )
					if( Typical_Price <= 0.165491 )
						if( VIP_VIM <= 0.3415 )
							if( VIP <= 1.17265 )
								if( Positive_Money_Flow <= 6.39681e+06 )
									ret := -0.097892
								if( Positive_Money_Flow > 6.39681e+06 )
									ret := 0.100699
							if( VIP > 1.17265 )
								if( MFI <= 74.4839 )
									ret := -0.719101 // sell
								if( MFI > 74.4839 )
									ret := 0.700000 // buy
						if( VIP_VIM > 0.3415 )
							if( MFI_High <= -15.7833 )
								if( MFI <= 63.2907 )
									ret := 0.835294 // buy
								if( MFI > 63.2907 )
									ret := 0.444444
							if( MFI_High > -15.7833 )
								if( MFI_Low <= 45.8788 )
									ret := -0.457627
								if( MFI_Low > 45.8788 )
									ret := 0.068641
					if( Typical_Price > 0.165491 )
						if( Money_Flow_Ratio <= 1.38354 )
							if( Positive_Money_Flow <= 8.91345e+06 )
								if( Positive_Money_Flow_Sum <= 4.8772e+07 )
									ret := -0.692308
								if( Positive_Money_Flow_Sum > 4.8772e+07 )
									ret := -0.002494
							if( Positive_Money_Flow > 8.91345e+06 )
								if( Raw_Money_Flow <= 1.58194e+07 )
									ret := 0.847222 // buy
								if( Raw_Money_Flow > 1.58194e+07 )
									ret := 0.214286
						if( Money_Flow_Ratio > 1.38354 )
							if( MFI_High <= -19.8836 )
								if( MFI_Low <= 39.2591 )
									ret := -0.605263
								if( MFI_Low > 39.2591 )
									ret := -0.944444 // sell
							if( MFI_High > -19.8836 )
								if( Positive_Money_Flow_Sum <= 4.68372e+07 )
									ret := -0.941176 // sell
								if( Positive_Money_Flow_Sum > 4.68372e+07 )
									ret := -0.199752
				if( MFI > 76.8466 )
					if( Money_Flow_Ratio <= 4.07085 )
						if( VIP_VIM <= 0.418851 )
							if( Raw_Money_Flow <= 1.27964e+07 )
								if( MFI_Low <= 58.196 )
									ret := -0.708333 // sell
								if( MFI_Low > 58.196 )
									ret := -0.887097 // sell
							if( Raw_Money_Flow > 1.27964e+07 )
								ret := -0.277778
						if( VIP_VIM > 0.418851 )
							if( Raw_Money_Flow <= 4.32937e+06 )
								if( MFI <= 79.3885 )
									ret := 0.040000
								if( MFI > 79.3885 )
									ret := 0.700000 // buy
							if( Raw_Money_Flow > 4.32937e+06 )
								if( Typical_Price <= 0.193782 )
									ret := -0.444444
								if( Typical_Price > 0.193782 )
									ret := 0.384615
					if( Money_Flow_Ratio > 4.07085 )
						if( MFI <= 80.8923 )
							if( Positive_Money_Flow <= 7.9452e+06 )
								if( VIP_VIM <= 0.550999 )
									ret := -0.916667 // sell
								if( VIP_VIM > 0.550999 )
									ret := 0.625000
							if( Positive_Money_Flow > 7.9452e+06 )
								if( Raw_Money_Flow <= 1.9501e+07 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 1.9501e+07 )
									ret := 0.428571
						if( MFI > 80.8923 )
							if( Raw_Money_Flow <= 3.88789e+06 )
								if( MFI_High <= 2.59888 )
									ret := -0.812500 // sell
								if( MFI_High > 2.59888 )
									ret := 0.271028
							if( Raw_Money_Flow > 3.88789e+06 )
								if( Negative_Money_Flow_Sum <= 2.54006e+07 )
									ret := -0.549407
								if( Negative_Money_Flow_Sum > 2.54006e+07 )
									ret := -0.014493
	
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_aeefbf64(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


