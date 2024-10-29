//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: TRXUSDT_15Min_2CM0_51089ab9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2CM0_51089ab9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_51089ab9(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 0.065113 )
		if( MFI_High <= -23.1619 )
			if( Negative_Money_Flow_Sum <= 2.77097e+07 )
				if( ad_mf <= 1.09543e+07 )
					if( Raw_Money_Flow <= 2.95013e+06 )
						if( Negative_Money_Flow <= 172515 )
							if( Money_Flow_Ratio <= 0.562802 )
								if( mf <= 0.186541 )
									ret := 0.193084
								if( mf > 0.186541 )
									ret := -0.324324
							if( Money_Flow_Ratio > 0.562802 )
								if( Positive_Money_Flow_Sum <= 1.11322e+06 )
									ret := 0.001606
								if( Positive_Money_Flow_Sum > 1.11322e+06 )
									ret := 0.123319
						if( Negative_Money_Flow > 172515 )
							if( Money_Flow_Ratio <= 1.22145 )
								if( Negative_Money_Flow_Sum <= 5.14015e+06 )
									ret := 0.242742
								if( Negative_Money_Flow_Sum > 5.14015e+06 )
									ret := 0.133652
							if( Money_Flow_Ratio > 1.22145 )
								if( MFI_High <= -25.0511 )
									ret := -1.000000 // sell
								if( MFI_High > -25.0511 )
									ret := 0.000000
					if( Raw_Money_Flow > 2.95013e+06 )
						if( MFI_High <= -61.6865 )
							if( Negative_Money_Flow <= 3.96145e+06 )
								ret := -0.857143 // sell
							if( Negative_Money_Flow > 3.96145e+06 )
								if( Positive_Money_Flow_Sum <= 15364.7 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 15364.7 )
									ret := 0.913043 // buy
						if( MFI_High > -61.6865 )
							if( Positive_Money_Flow <= 96057 )
								if( Positive_Money_Flow_Sum <= 1.74517e+07 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 1.74517e+07 )
									ret := 0.250000
							if( Positive_Money_Flow > 96057 )
								if( Negative_Money_Flow <= 2.21471e+06 )
									ret := -0.312500
								if( Negative_Money_Flow > 2.21471e+06 )
									ret := 0.714286 // buy
				if( ad_mf > 1.09543e+07 )
					if( Positive_Money_Flow_Sum <= 1.72355e+06 )
						if( Positive_Money_Flow <= 163624 )
							if( MFI_High <= -47.0055 )
								if( Negative_Money_Flow_Sum <= 5.94071e+06 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 5.94071e+06 )
									ret := 0.100000
							if( MFI_High > -47.0055 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 163624 )
							if( Typical_Price <= 0.053531 )
								ret := -0.750000 // sell
							if( Typical_Price > 0.053531 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.72355e+06 )
						if( mf <= -0.133275 )
							if( Negative_Money_Flow_Sum <= 2.041e+07 )
								if( Money_Flow_Ratio <= 0.701794 )
									ret := 0.472222
								if( Money_Flow_Ratio > 0.701794 )
									ret := -0.363636
							if( Negative_Money_Flow_Sum > 2.041e+07 )
								if( mf <= -0.228665 )
									ret := -1.000000 // sell
								if( mf > -0.228665 )
									ret := 0.000000
						if( mf > -0.133275 )
							if( Negative_Money_Flow_Sum <= 5.3526e+06 )
								if( ad_mf <= 2.53088e+07 )
									ret := 0.295455
								if( ad_mf > 2.53088e+07 )
									ret := -0.857143 // sell
							if( Negative_Money_Flow_Sum > 5.3526e+06 )
								if( ad <= 4.17921e+07 )
									ret := -0.500000
								if( ad > 4.17921e+07 )
									ret := 0.600000
			if( Negative_Money_Flow_Sum > 2.77097e+07 )
				if( MFI_High <= -53.7852 )
					if( Negative_Money_Flow <= 8.79e+06 )
						if( Negative_Money_Flow_Sum <= 3.14959e+07 )
							if( mf <= -0.261453 )
								ret := 1.000000 // buy
							if( mf > -0.261453 )
								if( Positive_Money_Flow_Sum <= 8.51777e+06 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 8.51777e+06 )
									ret := 0.666667
						if( Negative_Money_Flow_Sum > 3.14959e+07 )
							if( Negative_Money_Flow_Sum <= 4.83167e+07 )
								if( ad <= -1.06013e+08 )
									ret := 0.250000
								if( ad > -1.06013e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.83167e+07 )
								if( Money_Flow_Ratio <= 0.165565 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.165565 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow > 8.79e+06 )
						ret := 1.000000 // buy
				if( MFI_High > -53.7852 )
					if( mf <= -0.355067 )
						if( Negative_Money_Flow <= 788366 )
							if( Positive_Money_Flow_Sum <= 4.21072e+07 )
								if( Positive_Money_Flow <= 5.1624e+06 )
									ret := 0.625000
								if( Positive_Money_Flow > 5.1624e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 4.21072e+07 )
								ret := 0.000000
						if( Negative_Money_Flow > 788366 )
							if( Negative_Money_Flow <= 4.83346e+06 )
								if( ad_mf <= -1.29547e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -1.29547e+07 )
									ret := 0.250000
							if( Negative_Money_Flow > 4.83346e+06 )
								ret := 1.000000 // buy
					if( mf > -0.355067 )
						if( Positive_Money_Flow_Sum <= 5.61443e+07 )
							if( mf <= -0.164874 )
								if( Typical_Price <= 0.06432 )
									ret := 0.987805 // buy
								if( Typical_Price > 0.06432 )
									ret := 0.500000
							if( mf > -0.164874 )
								if( Positive_Money_Flow <= 3.25821e+06 )
									ret := 0.781250 // buy
								if( Positive_Money_Flow > 3.25821e+06 )
									ret := 0.300000
						if( Positive_Money_Flow_Sum > 5.61443e+07 )
							ret := 0.000000
		if( MFI_High > -23.1619 )
			if( ad <= 912900 )
				if( Positive_Money_Flow_Sum <= 6.10782e+06 )
					if( Positive_Money_Flow_Sum <= 3.5407e+06 )
						if( Negative_Money_Flow_Sum <= 2.0526e+06 )
							if( ad_mf <= -5.17163e+06 )
								if( Negative_Money_Flow <= 583720 )
									ret := 0.512658
								if( Negative_Money_Flow > 583720 )
									ret := -0.444444
							if( ad_mf > -5.17163e+06 )
								if( Negative_Money_Flow_Sum <= 517520 )
									ret := -0.088632
								if( Negative_Money_Flow_Sum > 517520 )
									ret := 0.090077
						if( Negative_Money_Flow_Sum > 2.0526e+06 )
							if( MFI_High <= -20.7704 )
								if( Negative_Money_Flow_Sum <= 2.28902e+06 )
									ret := 0.263158
								if( Negative_Money_Flow_Sum > 2.28902e+06 )
									ret := -0.363636
							if( MFI_High > -20.7704 )
								if( MFI_High <= -19.3765 )
									ret := -0.950000 // sell
								if( MFI_High > -19.3765 )
									ret := -0.529412
					if( Positive_Money_Flow_Sum > 3.5407e+06 )
						if( Typical_Price <= 0.062665 )
							if( ad <= -3.95507e+06 )
								if( Raw_Money_Flow <= 1.19394e+06 )
									ret := 0.600962
								if( Raw_Money_Flow > 1.19394e+06 )
									ret := -0.750000 // sell
							if( ad > -3.95507e+06 )
								if( ad_mf <= -2.9535e+06 )
									ret := -0.173077
								if( ad_mf > -2.9535e+06 )
									ret := 0.312169
						if( Typical_Price > 0.062665 )
							if( MFI <= 59.8462 )
								if( MFI_Low <= 39.3464 )
									ret := 0.500000
								if( MFI_Low > 39.3464 )
									ret := 1.000000 // buy
							if( MFI > 59.8462 )
								if( mf <= 0.32278 )
									ret := 0.020690
								if( mf > 0.32278 )
									ret := 0.857143 // buy
				if( Positive_Money_Flow_Sum > 6.10782e+06 )
					if( mf <= 0.083229 )
						if( Typical_Price <= 0.064722 )
							if( Negative_Money_Flow <= 3.15058e+06 )
								if( ad_mf <= -1.31467e+06 )
									ret := 0.177596
								if( ad_mf > -1.31467e+06 )
									ret := -0.281690
							if( Negative_Money_Flow > 3.15058e+06 )
								ret := -1.000000 // sell
						if( Typical_Price > 0.064722 )
							if( Money_Flow_Ratio <= 3.17113 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 3.17113 )
								if( MFI_High <= -0.973451 )
									ret := 0.250000
								if( MFI_High > -0.973451 )
									ret := -0.833333 // sell
					if( mf > 0.083229 )
						if( Negative_Money_Flow <= 1.63644e+06 )
							if( Positive_Money_Flow_Sum <= 7.14825e+06 )
								if( MFI_High <= -6.13132 )
									ret := -0.942857 // sell
								if( MFI_High > -6.13132 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 7.14825e+06 )
								if( Positive_Money_Flow_Sum <= 8.86892e+06 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 8.86892e+06 )
									ret := -0.346535
						if( Negative_Money_Flow > 1.63644e+06 )
							if( MFI_Low <= 54.8729 )
								ret := -1.000000 // sell
							if( MFI_Low > 54.8729 )
								ret := -0.750000 // sell
			if( ad > 912900 )
				if( Typical_Price <= 0.062281 )
					if( Positive_Money_Flow_Sum <= 2.76073e+07 )
						if( Positive_Money_Flow <= 629787 )
							if( ad <= 9.05383e+06 )
								if( Raw_Money_Flow <= 615210 )
									ret := -0.004932
								if( Raw_Money_Flow > 615210 )
									ret := 0.535714
							if( ad > 9.05383e+06 )
								if( MFI <= 70.7757 )
									ret := 0.766667 // buy
								if( MFI > 70.7757 )
									ret := -0.285714
						if( Positive_Money_Flow > 629787 )
							if( Positive_Money_Flow_Sum <= 8.6946e+06 )
								if( ad <= 1.40891e+07 )
									ret := -0.195946
								if( ad > 1.40891e+07 )
									ret := 0.469388
							if( Positive_Money_Flow_Sum > 8.6946e+06 )
								if( mf <= -0.183089 )
									ret := 0.400000
								if( mf > -0.183089 )
									ret := -0.614458
					if( Positive_Money_Flow_Sum > 2.76073e+07 )
						if( MFI_Low <= 42.4927 )
							ret := 0.750000 // buy
						if( MFI_Low > 42.4927 )
							ret := 1.000000 // buy
				if( Typical_Price > 0.062281 )
					if( Positive_Money_Flow_Sum <= 4.35482e+06 )
						if( Positive_Money_Flow <= 247820 )
							if( Negative_Money_Flow_Sum <= 2.3732e+06 )
								if( Raw_Money_Flow <= 92768.2 )
									ret := -0.456522
								if( Raw_Money_Flow > 92768.2 )
									ret := -0.078902
							if( Negative_Money_Flow_Sum > 2.3732e+06 )
								if( Money_Flow_Ratio <= 1.42816 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.42816 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow > 247820 )
							if( Negative_Money_Flow_Sum <= 1.34719e+06 )
								if( ad_mf <= 3.00752e+06 )
									ret := -0.247619
								if( ad_mf > 3.00752e+06 )
									ret := -0.506173
							if( Negative_Money_Flow_Sum > 1.34719e+06 )
								if( Raw_Money_Flow <= 891170 )
									ret := 0.000000
								if( Raw_Money_Flow > 891170 )
									ret := -0.800000 // sell
					if( Positive_Money_Flow_Sum > 4.35482e+06 )
						if( Positive_Money_Flow_Sum <= 1.33634e+07 )
							if( Negative_Money_Flow_Sum <= 4.70641e+06 )
								if( mf <= 0.377163 )
									ret := -0.024194
								if( mf > 0.377163 )
									ret := 0.760000 // buy
							if( Negative_Money_Flow_Sum > 4.70641e+06 )
								if( Positive_Money_Flow_Sum <= 1.0704e+07 )
									ret := 0.909091 // buy
								if( Positive_Money_Flow_Sum > 1.0704e+07 )
									ret := 0.416667
						if( Positive_Money_Flow_Sum > 1.33634e+07 )
							if( Negative_Money_Flow_Sum <= 8.03834e+06 )
								if( mf <= 0.000963 )
									ret := -0.111111
								if( mf > 0.000963 )
									ret := -0.969697 // sell
							if( Negative_Money_Flow_Sum > 8.03834e+06 )
								if( mf <= -0.061777 )
									ret := 0.857143 // buy
								if( mf > -0.061777 )
									ret := -0.266667
	if( Typical_Price > 0.065113 )
		if( Negative_Money_Flow_Sum <= 1.29663e+07 )
			if( Positive_Money_Flow <= 3.87902e+06 )
				if( mf <= -0.39634 )
					if( Negative_Money_Flow <= 2.12216e+06 )
						if( ad <= -2.52727e+06 )
							if( MFI_High <= -74.6557 )
								if( Raw_Money_Flow <= 928760 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 928760 )
									ret := -0.416667
							if( MFI_High > -74.6557 )
								if( ad <= -1.84872e+07 )
									ret := 0.166667
								if( ad > -1.84872e+07 )
									ret := -0.505618
						if( ad > -2.52727e+06 )
							if( Typical_Price <= 0.087653 )
								if( Positive_Money_Flow_Sum <= 765882 )
									ret := 0.488372
								if( Positive_Money_Flow_Sum > 765882 )
									ret := 0.025641
							if( Typical_Price > 0.087653 )
								if( ad <= 4.23109e+06 )
									ret := -0.101504
								if( ad > 4.23109e+06 )
									ret := -0.888889 // sell
					if( Negative_Money_Flow > 2.12216e+06 )
						if( Negative_Money_Flow_Sum <= 6.82859e+06 )
							if( mf <= -0.435265 )
								ret := 0.714286 // buy
							if( mf > -0.435265 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 6.82859e+06 )
							if( Positive_Money_Flow_Sum <= 520551 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 520551 )
								ret := -0.285714
				if( mf > -0.39634 )
					if( Positive_Money_Flow_Sum <= 5.46041e+06 )
						if( mf <= -0.057795 )
							if( Raw_Money_Flow <= 244744 )
								if( MFI <= 54.4053 )
									ret := 0.065427
								if( MFI > 54.4053 )
									ret := -0.058824
							if( Raw_Money_Flow > 244744 )
								if( Typical_Price <= 0.075933 )
									ret := 0.077968
								if( Typical_Price > 0.075933 )
									ret := -0.084605
						if( mf > -0.057795 )
							if( ad_mf <= -15891.9 )
								if( ad <= -313827 )
									ret := 0.062258
								if( ad > -313827 )
									ret := 0.154731
							if( ad_mf > -15891.9 )
								if( Typical_Price <= 0.074388 )
									ret := -0.023661
								if( Typical_Price > 0.074388 )
									ret := 0.050364
					if( Positive_Money_Flow_Sum > 5.46041e+06 )
						if( mf <= -0.02726 )
							if( Typical_Price <= 0.079463 )
								if( Money_Flow_Ratio <= 1.74662 )
									ret := 0.479125
								if( Money_Flow_Ratio > 1.74662 )
									ret := 0.025126
							if( Typical_Price > 0.079463 )
								if( Negative_Money_Flow_Sum <= 5.14516e+06 )
									ret := 0.363636
								if( Negative_Money_Flow_Sum > 5.14516e+06 )
									ret := 0.018868
						if( mf > -0.02726 )
							if( Typical_Price <= 0.110274 )
								if( Positive_Money_Flow_Sum <= 1.80871e+07 )
									ret := 0.024720
								if( Positive_Money_Flow_Sum > 1.80871e+07 )
									ret := -0.313901
							if( Typical_Price > 0.110274 )
								if( Negative_Money_Flow_Sum <= 1.13721e+07 )
									ret := 0.173946
								if( Negative_Money_Flow_Sum > 1.13721e+07 )
									ret := -0.465116
			if( Positive_Money_Flow > 3.87902e+06 )
				if( mf <= 0.103731 )
					if( Typical_Price <= 0.13078 )
						if( MFI_Low <= 45.92 )
							if( MFI_High <= -17.6524 )
								ret := 1.000000 // buy
							if( MFI_High > -17.6524 )
								ret := 0.200000
						if( MFI_Low > 45.92 )
							if( ad_mf <= 5.07089e+07 )
								if( Positive_Money_Flow_Sum <= 8.54539e+06 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 8.54539e+06 )
									ret := -0.707317 // sell
							if( ad_mf > 5.07089e+07 )
								ret := 0.400000
					if( Typical_Price > 0.13078 )
						if( Raw_Money_Flow <= 5.83601e+06 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 5.83601e+06 )
							ret := 0.500000
				if( mf > 0.103731 )
					if( Positive_Money_Flow_Sum <= 1.85794e+07 )
						if( Positive_Money_Flow_Sum <= 1.28069e+07 )
							if( ad <= 2.79226e+07 )
								if( mf <= 0.180519 )
									ret := 0.600000
								if( mf > 0.180519 )
									ret := -0.800000 // sell
							if( ad > 2.79226e+07 )
								if( ad_mf <= 4.32317e+07 )
									ret := 0.571429
								if( ad_mf > 4.32317e+07 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.28069e+07 )
							if( Typical_Price <= 0.085602 )
								if( Money_Flow_Ratio <= 2.91469 )
									ret := -0.500000
								if( Money_Flow_Ratio > 2.91469 )
									ret := -0.900000 // sell
							if( Typical_Price > 0.085602 )
								ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 1.85794e+07 )
						if( Raw_Money_Flow <= 1.05783e+07 )
							if( Money_Flow_Ratio <= 5.67603 )
								if( ad_mf <= 3.58446e+07 )
									ret := 0.115385
								if( ad_mf > 3.58446e+07 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 5.67603 )
								if( mf <= 0.168048 )
									ret := 0.333333
								if( mf > 0.168048 )
									ret := 0.879032 // buy
						if( Raw_Money_Flow > 1.05783e+07 )
							ret := -0.500000
		if( Negative_Money_Flow_Sum > 1.29663e+07 )
			if( MFI <= 51.6086 )
				if( ad_mf <= 1.80196e+07 )
					if( Typical_Price <= 0.11886 )
						if( Positive_Money_Flow_Sum <= 6.50738e+06 )
							if( Typical_Price <= 0.071523 )
								if( Negative_Money_Flow_Sum <= 2.65459e+07 )
									ret := 0.636364
								if( Negative_Money_Flow_Sum > 2.65459e+07 )
									ret := -0.833333 // sell
							if( Typical_Price > 0.071523 )
								if( Positive_Money_Flow <= 1.76274e+06 )
									ret := 0.066116
								if( Positive_Money_Flow > 1.76274e+06 )
									ret := -0.857143 // sell
						if( Positive_Money_Flow_Sum > 6.50738e+06 )
							if( Raw_Money_Flow <= 2.01462e+06 )
								if( mf <= 0.115537 )
									ret := -0.258873
								if( mf > 0.115537 )
									ret := -0.920000 // sell
							if( Raw_Money_Flow > 2.01462e+06 )
								if( Money_Flow_Ratio <= 0.48593 )
									ret := -0.330645
								if( Money_Flow_Ratio > 0.48593 )
									ret := 0.132727
					if( Typical_Price > 0.11886 )
						if( Negative_Money_Flow_Sum <= 2.09967e+07 )
							if( MFI_Low <= -0.616202 )
								if( mf <= -0.550701 )
									ret := 0.000000
								if( mf > -0.550701 )
									ret := -0.729730 // sell
							if( MFI_Low > -0.616202 )
								if( MFI_Low <= 13.3634 )
									ret := 0.164179
								if( MFI_Low > 13.3634 )
									ret := -0.666667
						if( Negative_Money_Flow_Sum > 2.09967e+07 )
							if( mf <= -0.09116 )
								if( ad <= 6.94257e+06 )
									ret := -0.041667
								if( ad > 6.94257e+06 )
									ret := -0.900000 // sell
							if( mf > -0.09116 )
								if( Negative_Money_Flow <= 1.39663e+06 )
									ret := 0.708333 // buy
								if( Negative_Money_Flow > 1.39663e+06 )
									ret := -0.037037
				if( ad_mf > 1.80196e+07 )
					if( ad <= 9.74771e+07 )
						if( Typical_Price <= 0.083487 )
							if( ad <= 2.37752e+07 )
								if( Raw_Money_Flow <= 1.8862e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.8862e+06 )
									ret := 0.906977 // buy
							if( ad > 2.37752e+07 )
								if( ad_mf <= 4.64281e+07 )
									ret := 0.119760
								if( ad_mf > 4.64281e+07 )
									ret := 0.740741 // buy
						if( Typical_Price > 0.083487 )
							if( Positive_Money_Flow <= 3.91553e+06 )
								if( Raw_Money_Flow <= 2.8052e+06 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 2.8052e+06 )
									ret := 0.500000
							if( Positive_Money_Flow > 3.91553e+06 )
								if( Negative_Money_Flow_Sum <= 2.54371e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.54371e+07 )
									ret := -1.000000 // sell
					if( ad > 9.74771e+07 )
						if( MFI <= 34.5261 )
							ret := -1.000000 // sell
						if( MFI > 34.5261 )
							ret := -0.333333
			if( MFI > 51.6086 )
				if( Negative_Money_Flow_Sum <= 2.21892e+07 )
					if( Positive_Money_Flow <= 6.94940e+06 )
						if( Positive_Money_Flow_Sum <= 5.38743e+07 )
							if( Typical_Price <= 0.140554 )
								if( Typical_Price <= 0.082142 )
									ret := -0.171296
								if( Typical_Price > 0.082142 )
									ret := -0.431138
							if( Typical_Price > 0.140554 )
								if( ad <= 4.54816e+06 )
									ret := -0.157895
								if( ad > 4.54816e+06 )
									ret := 0.875000 // buy
						if( Positive_Money_Flow_Sum > 5.38743e+07 )
							if( Positive_Money_Flow_Sum <= 7.11589e+07 )
								if( ad_mf <= 1.95579e+07 )
									ret := 0.800000 // buy
								if( ad_mf > 1.95579e+07 )
									ret := -0.222222
							if( Positive_Money_Flow_Sum > 7.11589e+07 )
								if( Positive_Money_Flow_Sum <= 7.32839e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 7.32839e+07 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 6.94940e+06 )
						if( Positive_Money_Flow_Sum <= 6.29943e+07 )
							if( mf <= -0.036116 )
								ret := 0.400000
							if( mf > -0.036116 )
								if( MFI_Low <= 50.7334 )
									ret := 1.000000 // buy
								if( MFI_Low > 50.7334 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 6.29943e+07 )
							ret := -0.500000
				if( Negative_Money_Flow_Sum > 2.21892e+07 )
					if( MFI <= 53.8111 )
						if( Raw_Money_Flow <= 3.74264e+06 )
							if( Negative_Money_Flow_Sum <= 2.40241e+07 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.40241e+07 )
								if( MFI <= 52.7078 )
									ret := 1.000000 // buy
								if( MFI > 52.7078 )
									ret := 0.400000
						if( Raw_Money_Flow > 3.74264e+06 )
							if( Positive_Money_Flow <= 5.88143e+06 )
								if( MFI <= 53.5584 )
									ret := -0.851852 // sell
								if( MFI > 53.5584 )
									ret := 0.000000
							if( Positive_Money_Flow > 5.88143e+06 )
								if( MFI <= 53.0008 )
									ret := 0.000000
								if( MFI > 53.0008 )
									ret := 1.000000 // buy
					if( MFI > 53.8111 )
						if( Typical_Price <= 0.06764 )
							ret := 0.142857
						if( Typical_Price > 0.06764 )
							if( mf <= 0.16152 )
								if( MFI_Low <= 50.1953 )
									ret := -0.758364 // sell
								if( MFI_Low > 50.1953 )
									ret := -0.285714
							if( mf > 0.16152 )
								if( Negative_Money_Flow_Sum <= 2.63957e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.63957e+07 )
									ret := 0.800000 // buy
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_51089ab9(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


