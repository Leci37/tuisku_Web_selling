//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: AAPL_30Min_2MV0_7925a8b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_2MV0_7925a8b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_7925a8b7(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.5659e+08 )
		if( VIP <= 1.00334 )
			if( Raw_Money_Flow <= 2.09986e+09 )
				if( VIP <= 0.944865 )
					if( Positive_Money_Flow_Sum <= 1.57071e+08 )
						if( Positive_Money_Flow_Sum <= 1.29562e+08 )
							if( VIP <= 0.773723 )
								if( Negative_Money_Flow <= 7.51847e+07 )
									ret := -0.027505
								if( Negative_Money_Flow > 7.51847e+07 )
									ret := 1.000000 // buy
							if( VIP > 0.773723 )
								if( Typical_Price <= 245.312 )
									ret := 0.173284
								if( Typical_Price > 245.312 )
									ret := 0.491935
						if( Positive_Money_Flow_Sum > 1.29562e+08 )
							if( Typical_Price <= 162.395 )
								if( Typical_Price <= 148.255 )
									ret := 0.666667
								if( Typical_Price > 148.255 )
									ret := -0.333333
							if( Typical_Price > 162.395 )
								if( Raw_Money_Flow <= 4.588e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 4.588e+07 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.57071e+08 )
						if( Positive_Money_Flow <= 2.01307e+09 )
							if( Positive_Money_Flow_Sum <= 3.51115e+08 )
								if( Raw_Money_Flow <= 8.23496e+07 )
									ret := -0.159574
								if( Raw_Money_Flow > 8.23496e+07 )
									ret := -0.787234 // sell
							if( Positive_Money_Flow_Sum > 3.51115e+08 )
								if( Positive_Money_Flow_Sum <= 4.47871e+08 )
									ret := 0.588235
								if( Positive_Money_Flow_Sum > 4.47871e+08 )
									ret := -0.099458
						if( Positive_Money_Flow > 2.01307e+09 )
							if( VIM <= 0.996431 )
								ret := 1.000000 // buy
							if( VIM > 0.996431 )
								ret := 0.000000
				if( VIP > 0.944865 )
					if( Positive_Money_Flow_Sum <= 2.07944e+07 )
						if( Negative_Money_Flow <= 1.65185e+07 )
							if( Positive_Money_Flow_Sum <= 1.65232e+07 )
								if( VIP_VIM <= -0.33429 )
									ret := -0.214286
								if( VIP_VIM > -0.33429 )
									ret := 0.260417
							if( Positive_Money_Flow_Sum > 1.65232e+07 )
								if( Raw_Money_Flow <= 8.00065e+06 )
									ret := -0.700000 // sell
								if( Raw_Money_Flow > 8.00065e+06 )
									ret := 0.526316
						if( Negative_Money_Flow > 1.65185e+07 )
							if( Negative_Money_Flow <= 3.13706e+07 )
								if( Negative_Money_Flow_Sum <= 4.34941e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.34941e+07 )
									ret := -0.564103
							if( Negative_Money_Flow > 3.13706e+07 )
								if( Negative_Money_Flow_Sum <= 9.95314e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 9.95314e+07 )
									ret := -0.200000
					if( Positive_Money_Flow_Sum > 2.07944e+07 )
						if( Money_Flow_Ratio <= 0.584723 )
							if( Raw_Money_Flow <= 7.27271e+06 )
								if( MFI <= 30.5629 )
									ret := 0.400000
								if( MFI > 30.5629 )
									ret := -0.666667
							if( Raw_Money_Flow > 7.27271e+06 )
								if( VIP <= 0.99825 )
									ret := 0.610390
								if( VIP > 0.99825 )
									ret := 0.052632
						if( Money_Flow_Ratio > 0.584723 )
							if( Positive_Money_Flow_Sum <= 1.02017e+08 )
								if( VIP <= 0.991254 )
									ret := 0.117391
								if( VIP > 0.991254 )
									ret := 0.425000
							if( Positive_Money_Flow_Sum > 1.02017e+08 )
								if( Typical_Price <= 179.246 )
									ret := 0.385417
								if( Typical_Price > 179.246 )
									ret := 0.153226
			if( Raw_Money_Flow > 2.09986e+09 )
				if( Typical_Price <= 284.51 )
					if( VIP <= 0.993589 )
						if( Money_Flow_Ratio <= 34.8969 )
							if( Raw_Money_Flow <= 2.28668e+09 )
								if( Raw_Money_Flow <= 2.20761e+09 )
									ret := -0.666667
								if( Raw_Money_Flow > 2.20761e+09 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.28668e+09 )
								if( Positive_Money_Flow <= 2.98917e+09 )
									ret := 0.000000
								if( Positive_Money_Flow > 2.98917e+09 )
									ret := -0.750000 // sell
						if( Money_Flow_Ratio > 34.8969 )
							ret := -1.000000 // sell
					if( VIP > 0.993589 )
						ret := 0.400000
				if( Typical_Price > 284.51 )
					ret := 0.500000
		if( VIP > 1.00334 )
			if( Typical_Price <= 141.918 )
				if( VIM <= 0.755601 )
					if( Raw_Money_Flow <= 2.13539e+09 )
						if( MFI_Low <= 34.5666 )
							if( MFI_Low <= 30.6988 )
								if( Money_Flow_Ratio <= 0.568071 )
									ret := -0.666667
								if( Money_Flow_Ratio > 0.568071 )
									ret := 0.300000
							if( MFI_Low > 30.6988 )
								if( Raw_Money_Flow <= 2.08206e+07 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 2.08206e+07 )
									ret := -1.000000 // sell
						if( MFI_Low > 34.5666 )
							if( Money_Flow_Ratio <= 103.78 )
								if( Negative_Money_Flow_Sum <= 5.1534e+07 )
									ret := 0.492308
								if( Negative_Money_Flow_Sum > 5.1534e+07 )
									ret := 0.148936
							if( Money_Flow_Ratio > 103.78 )
								if( Positive_Money_Flow_Sum <= 6.2909e+09 )
									ret := 0.108108
								if( Positive_Money_Flow_Sum > 6.2909e+09 )
									ret := -0.800000 // sell
					if( Raw_Money_Flow > 2.13539e+09 )
						if( VIP <= 1.0844 )
							ret := -1.000000 // sell
						if( VIP > 1.0844 )
							ret := -0.200000
				if( VIM > 0.755601 )
					if( Money_Flow_Ratio <= 0.105503 )
						if( Raw_Money_Flow <= 4.17515e+06 )
							if( Negative_Money_Flow_Sum <= 8.88823e+07 )
								if( Positive_Money_Flow <= 715762 )
									ret := 0.964286 // buy
								if( Positive_Money_Flow > 715762 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 8.88823e+07 )
								ret := 0.000000
						if( Raw_Money_Flow > 4.17515e+06 )
							if( MFI_Low <= -14.1207 )
								ret := 0.428571
							if( MFI_Low > -14.1207 )
								ret := -0.750000 // sell
					if( Money_Flow_Ratio > 0.105503 )
						if( Negative_Money_Flow <= 4.58656e+07 )
							if( Negative_Money_Flow <= 3.24226e+07 )
								if( Money_Flow_Ratio <= 221.004 )
									ret := -0.031008
								if( Money_Flow_Ratio > 221.004 )
									ret := -0.259494
							if( Negative_Money_Flow > 3.24226e+07 )
								if( Negative_Money_Flow_Sum <= 1.22478e+08 )
									ret := 0.452381
								if( Negative_Money_Flow_Sum > 1.22478e+08 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 4.58656e+07 )
							if( MFI_Low <= 6.56541 )
								ret := 0.833333 // buy
							if( MFI_Low > 6.56541 )
								if( Positive_Money_Flow_Sum <= 1.82493e+08 )
									ret := -0.823529 // sell
								if( Positive_Money_Flow_Sum > 1.82493e+08 )
									ret := -0.241379
			if( Typical_Price > 141.918 )
				if( Money_Flow_Ratio <= 64.3972 )
					if( MFI_High <= -56.3279 )
						if( Raw_Money_Flow <= 8.1096e+06 )
							if( Raw_Money_Flow <= 4.20991e+06 )
								if( VIP <= 1.22179 )
									ret := 0.046512
								if( VIP > 1.22179 )
									ret := -0.650000
							if( Raw_Money_Flow > 4.20991e+06 )
								if( MFI_High <= -63.8154 )
									ret := 0.684211
								if( MFI_High > -63.8154 )
									ret := 0.142857
						if( Raw_Money_Flow > 8.1096e+06 )
							if( Positive_Money_Flow_Sum <= 3.00409e+07 )
								if( VIP <= 1.40555 )
									ret := -0.460526
								if( VIP > 1.40555 )
									ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 3.00409e+07 )
								if( Negative_Money_Flow_Sum <= 1.20552e+08 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 1.20552e+08 )
									ret := 0.631579
					if( MFI_High > -56.3279 )
						if( Positive_Money_Flow <= 2.44554e+09 )
							if( Positive_Money_Flow_Sum <= 1.42031e+09 )
								if( Positive_Money_Flow <= 4.05013e+08 )
									ret := 0.088529
								if( Positive_Money_Flow > 4.05013e+08 )
									ret := 0.283379
							if( Positive_Money_Flow_Sum > 1.42031e+09 )
								if( Typical_Price <= 166.126 )
									ret := 0.172414
								if( Typical_Price > 166.126 )
									ret := -0.046187
						if( Positive_Money_Flow > 2.44554e+09 )
							if( Positive_Money_Flow_Sum <= 3.04489e+09 )
								if( Positive_Money_Flow <= 2.77771e+09 )
									ret := 0.896552 // buy
								if( Positive_Money_Flow > 2.77771e+09 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 3.04489e+09 )
								if( VIP <= 1.0663 )
									ret := 0.545455
								if( VIP > 1.0663 )
									ret := -0.727273 // sell
				if( Money_Flow_Ratio > 64.3972 )
					if( Positive_Money_Flow_Sum <= 1.21476e+09 )
						if( Positive_Money_Flow_Sum <= 3.27196e+08 )
							if( Raw_Money_Flow <= 3.83713e+07 )
								if( Negative_Money_Flow_Sum <= 804863 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 804863 )
									ret := -0.250000
							if( Raw_Money_Flow > 3.83713e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.27196e+08 )
							if( Positive_Money_Flow <= 7.06785e+08 )
								if( Positive_Money_Flow <= 3.56917e+08 )
									ret := 0.375839
								if( Positive_Money_Flow > 3.56917e+08 )
									ret := 0.097561
							if( Positive_Money_Flow > 7.06785e+08 )
								if( VIP_VIM <= 0.569642 )
									ret := 0.783333 // buy
								if( VIP_VIM > 0.569642 )
									ret := -0.142857
					if( Positive_Money_Flow_Sum > 1.21476e+09 )
						if( Positive_Money_Flow_Sum <= 2.39591e+09 )
							if( Positive_Money_Flow <= 1.56437e+09 )
								if( VIP <= 1.21199 )
									ret := -0.230047
								if( VIP > 1.21199 )
									ret := 0.130536
							if( Positive_Money_Flow > 1.56437e+09 )
								if( Positive_Money_Flow_Sum <= 2.02245e+09 )
									ret := 0.964286 // buy
								if( Positive_Money_Flow_Sum > 2.02245e+09 )
									ret := -0.875000 // sell
						if( Positive_Money_Flow_Sum > 2.39591e+09 )
							if( Raw_Money_Flow <= 1.28326e+09 )
								if( Negative_Money_Flow <= 1.76663e+07 )
									ret := 0.253177
								if( Negative_Money_Flow > 1.76663e+07 )
									ret := 0.875000 // buy
							if( Raw_Money_Flow > 1.28326e+09 )
								if( Money_Flow_Ratio <= 80.8947 )
									ret := 0.625000
								if( Money_Flow_Ratio > 80.8947 )
									ret := -0.354839
	if( Negative_Money_Flow_Sum > 1.5659e+08 )
		if( Typical_Price <= 233.531 )
			if( Negative_Money_Flow <= 484.359 )
				if( VIM <= 3.73274 )
					if( Negative_Money_Flow_Sum <= 3.15914e+09 )
						if( Positive_Money_Flow <= 3.64068e+08 )
							if( Money_Flow_Ratio <= 9.00546 )
								if( Raw_Money_Flow <= 1.1023e+07 )
									ret := 0.022212
								if( Raw_Money_Flow > 1.1023e+07 )
									ret := -0.037237
							if( Money_Flow_Ratio > 9.00546 )
								if( VIP <= 1.22694 )
									ret := 0.047059
								if( VIP > 1.22694 )
									ret := -0.286275
						if( Positive_Money_Flow > 3.64068e+08 )
							if( MFI <= 17.7516 )
								if( MFI <= 14.7486 )
									ret := 0.333333
								if( MFI > 14.7486 )
									ret := -0.743590 // sell
							if( MFI > 17.7516 )
								if( Money_Flow_Ratio <= 0.54454 )
									ret := 0.282828
								if( Money_Flow_Ratio > 0.54454 )
									ret := 0.079175
					if( Negative_Money_Flow_Sum > 3.15914e+09 )
						if( Negative_Money_Flow_Sum <= 3.69413e+09 )
							if( Positive_Money_Flow <= 9.67686e+06 )
								if( Typical_Price <= 126.085 )
									ret := -0.362069
								if( Typical_Price > 126.085 )
									ret := -0.030488
							if( Positive_Money_Flow > 9.67686e+06 )
								if( Positive_Money_Flow_Sum <= 1.11353e+08 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 1.11353e+08 )
									ret := -0.178095
						if( Negative_Money_Flow_Sum > 3.69413e+09 )
							if( Positive_Money_Flow <= 6.59742e+08 )
								if( Typical_Price <= 158.619 )
									ret := 0.121302
								if( Typical_Price > 158.619 )
									ret := -0.024460
							if( Positive_Money_Flow > 6.59742e+08 )
								if( Money_Flow_Ratio <= 0.493701 )
									ret := -0.275510
								if( Money_Flow_Ratio > 0.493701 )
									ret := -0.034110
				if( VIM > 3.73274 )
					ret := 1.000000 // buy
			if( Negative_Money_Flow > 484.359 )
				if( Negative_Money_Flow <= 7.82146e+07 )
					if( Negative_Money_Flow <= 5.62754e+07 )
						if( Positive_Money_Flow_Sum <= 2.29331e+10 )
							if( VIP <= 1.15581 )
								if( Positive_Money_Flow <= 1.29599e+06 )
									ret := 0.066481
								if( Positive_Money_Flow > 1.29599e+06 )
									ret := 0.189095
							if( VIP > 1.15581 )
								if( Negative_Money_Flow_Sum <= 1.21807e+09 )
									ret := 0.065751
								if( Negative_Money_Flow_Sum > 1.21807e+09 )
									ret := -0.059591
						if( Positive_Money_Flow_Sum > 2.29331e+10 )
							if( VIM <= 1.08153 )
								ret := -1.000000 // sell
							if( VIM > 1.08153 )
								ret := -0.750000 // sell
					if( Negative_Money_Flow > 5.62754e+07 )
						if( Money_Flow_Ratio <= 0.367085 )
							if( VIP_VIM <= -0.544646 )
								if( Typical_Price <= 161.298 )
									ret := 0.000000
								if( Typical_Price > 161.298 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.544646 )
								if( Typical_Price <= 132.073 )
									ret := 0.666667
								if( Typical_Price > 132.073 )
									ret := 0.025974
						if( Money_Flow_Ratio > 0.367085 )
							if( Negative_Money_Flow_Sum <= 3.19853e+08 )
								if( Negative_Money_Flow <= 7.22075e+07 )
									ret := 0.862069 // buy
								if( Negative_Money_Flow > 7.22075e+07 )
									ret := 0.285714
							if( Negative_Money_Flow_Sum > 3.19853e+08 )
								if( VIP_VIM <= -0.405871 )
									ret := 0.807692 // buy
								if( VIP_VIM > -0.405871 )
									ret := 0.171717
				if( Negative_Money_Flow > 7.82146e+07 )
					if( Positive_Money_Flow_Sum <= 9.23919e+08 )
						if( Negative_Money_Flow <= 9.8723e+07 )
							if( MFI_High <= -38.219 )
								if( Positive_Money_Flow_Sum <= 4.91086e+07 )
									ret := 0.416667
								if( Positive_Money_Flow_Sum > 4.91086e+07 )
									ret := -0.450820
							if( MFI_High > -38.219 )
								if( VIP_VIM <= -0.148612 )
									ret := -0.650000
								if( VIP_VIM > -0.148612 )
									ret := 0.350877
						if( Negative_Money_Flow > 9.8723e+07 )
							if( Money_Flow_Ratio <= 0.040869 )
								if( Negative_Money_Flow <= 1.52753e+09 )
									ret := 0.045619
								if( Negative_Money_Flow > 1.52753e+09 )
									ret := -0.258865
							if( Money_Flow_Ratio > 0.040869 )
								if( Raw_Money_Flow <= 2.12776e+08 )
									ret := 0.019737
								if( Raw_Money_Flow > 2.12776e+08 )
									ret := 0.180536
					if( Positive_Money_Flow_Sum > 9.23919e+08 )
						if( VIP <= 0.837761 )
							if( MFI_High <= -53.8279 )
								if( Negative_Money_Flow_Sum <= 9.64022e+09 )
									ret := -0.076046
								if( Negative_Money_Flow_Sum > 9.64022e+09 )
									ret := 0.203125
							if( MFI_High > -53.8279 )
								if( MFI_Low <= 27.229 )
									ret := -0.235772
								if( MFI_Low > 27.229 )
									ret := 0.107595
						if( VIP > 0.837761 )
							if( Negative_Money_Flow_Sum <= 1.21716e+09 )
								if( VIP <= 0.965931 )
									ret := -0.373333
								if( VIP > 0.965931 )
									ret := -0.041521
							if( Negative_Money_Flow_Sum > 1.21716e+09 )
								if( Negative_Money_Flow_Sum <= 7.45835e+09 )
									ret := 0.049288
								if( Negative_Money_Flow_Sum > 7.45835e+09 )
									ret := -0.130802
		if( Typical_Price > 233.531 )
			if( Negative_Money_Flow_Sum <= 4.02321e+09 )
				if( VIP_VIM <= -0.196407 )
					if( Raw_Money_Flow <= 5.77364e+08 )
						if( Positive_Money_Flow_Sum <= 5.13296e+09 )
							if( Negative_Money_Flow_Sum <= 1.60995e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.60995e+08 )
								if( Typical_Price <= 466.764 )
									ret := 0.417840
								if( Typical_Price > 466.764 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 5.13296e+09 )
							if( MFI_High <= -8.0176 )
								if( Typical_Price <= 262.047 )
									ret := -1.000000 // sell
								if( Typical_Price > 262.047 )
									ret := -0.750000 // sell
							if( MFI_High > -8.0176 )
								if( VIM <= 1.18292 )
									ret := 0.000000
								if( VIM > 1.18292 )
									ret := 0.250000
					if( Raw_Money_Flow > 5.77364e+08 )
						if( VIM <= 1.16043 )
							if( Raw_Money_Flow <= 6.74996e+08 )
								if( Typical_Price <= 293.556 )
									ret := -0.900000 // sell
								if( Typical_Price > 293.556 )
									ret := 0.333333
							if( Raw_Money_Flow > 6.74996e+08 )
								if( Raw_Money_Flow <= 1.77636e+09 )
									ret := 0.626866
								if( Raw_Money_Flow > 1.77636e+09 )
									ret := 0.000000
						if( VIM > 1.16043 )
							if( Typical_Price <= 289.55 )
								if( VIP <= 0.705412 )
									ret := 0.500000
								if( VIP > 0.705412 )
									ret := -0.277778
							if( Typical_Price > 289.55 )
								if( VIM <= 1.18436 )
									ret := 0.666667
								if( VIM > 1.18436 )
									ret := -0.833333 // sell
				if( VIP_VIM > -0.196407 )
					if( Positive_Money_Flow_Sum <= 5.00934e+09 )
						if( VIM <= 1.46105 )
							if( Negative_Money_Flow_Sum <= 3.8688e+09 )
								if( MFI <= 93.9918 )
									ret := 0.066688
								if( MFI > 93.9918 )
									ret := 0.522388
							if( Negative_Money_Flow_Sum > 3.8688e+09 )
								if( Negative_Money_Flow_Sum <= 3.97332e+09 )
									ret := -0.821429 // sell
								if( Negative_Money_Flow_Sum > 3.97332e+09 )
									ret := -0.217391
						if( VIM > 1.46105 )
							if( VIP <= 1.49158 )
								ret := 0.250000
							if( VIP > 1.49158 )
								if( MFI_High <= -13.7457 )
									ret := 0.750000 // buy
								if( MFI_High > -13.7457 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.00934e+09 )
						if( Raw_Money_Flow <= 6.31457e+08 )
							if( Typical_Price <= 327.324 )
								if( Positive_Money_Flow <= 7.10345e+06 )
									ret := 0.060606
								if( Positive_Money_Flow > 7.10345e+06 )
									ret := 0.431925
							if( Typical_Price > 327.324 )
								if( MFI_High <= -3.78797 )
									ret := 0.418919
								if( MFI_High > -3.78797 )
									ret := 0.779817 // buy
						if( Raw_Money_Flow > 6.31457e+08 )
							if( MFI_Low <= 53.4087 )
								if( VIP_VIM <= 0.209747 )
									ret := 0.610390
								if( VIP_VIM > 0.209747 )
									ret := 0.164384
							if( MFI_Low > 53.4087 )
								if( VIP <= 1.18514 )
									ret := -0.383648
								if( VIP > 1.18514 )
									ret := 0.125683
			if( Negative_Money_Flow_Sum > 4.02321e+09 )
				if( Money_Flow_Ratio <= 3.17552 )
					if( MFI_Low <= 30.2588 )
						if( Raw_Money_Flow <= 5.28534e+07 )
							if( VIP <= 1.21338 )
								if( Positive_Money_Flow <= 1.8857e+07 )
									ret := 0.154876
								if( Positive_Money_Flow > 1.8857e+07 )
									ret := 0.652174
							if( VIP > 1.21338 )
								if( Typical_Price <= 287.992 )
									ret := -1.000000 // sell
								if( Typical_Price > 287.992 )
									ret := -0.333333
						if( Raw_Money_Flow > 5.28534e+07 )
							if( Positive_Money_Flow_Sum <= 4.18214e+09 )
								if( Positive_Money_Flow_Sum <= 9.08744e+08 )
									ret := 0.165289
								if( Positive_Money_Flow_Sum > 9.08744e+08 )
									ret := -0.335329
							if( Positive_Money_Flow_Sum > 4.18214e+09 )
								if( Raw_Money_Flow <= 3.20719e+09 )
									ret := 0.264438
								if( Raw_Money_Flow > 3.20719e+09 )
									ret := -0.916667 // sell
					if( MFI_Low > 30.2588 )
						if( Negative_Money_Flow_Sum <= 6.19987e+09 )
							if( Raw_Money_Flow <= 1.46826e+09 )
								if( Negative_Money_Flow_Sum <= 4.25578e+09 )
									ret := -0.092593
								if( Negative_Money_Flow_Sum > 4.25578e+09 )
									ret := -0.601286
							if( Raw_Money_Flow > 1.46826e+09 )
								if( VIP <= 0.963747 )
									ret := 0.684211
								if( VIP > 0.963747 )
									ret := -0.371429
						if( Negative_Money_Flow_Sum > 6.19987e+09 )
							if( VIP_VIM <= -0.042307 )
								if( Positive_Money_Flow_Sum <= 8.48494e+09 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow_Sum > 8.48494e+09 )
									ret := 0.125000
							if( VIP_VIM > -0.042307 )
								if( Positive_Money_Flow <= 1.27513e+09 )
									ret := 0.460784
								if( Positive_Money_Flow > 1.27513e+09 )
									ret := -0.156250
				if( Money_Flow_Ratio > 3.17552 )
					if( Money_Flow_Ratio <= 3.30432 )
						if( MFI_High <= -3.54564 )
							ret := 1.000000 // buy
						if( MFI_High > -3.54564 )
							ret := 0.200000
					if( Money_Flow_Ratio > 3.30432 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AAPL_30Min_7925a8b7(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


