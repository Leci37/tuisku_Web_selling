//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: SOLUSDT_15Min_2CM0_b81c4651 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2CM0_b81c4651", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_b81c4651(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow <= 1.00309e+07 )
		if( Negative_Money_Flow <= 2.322e+07 )
			if( Positive_Money_Flow_Sum <= 1.15789e+07 )
				if( Negative_Money_Flow <= 1.56475e+06 )
					if( ad_mf <= -3136.55 )
						if( MFI <= 58.4346 )
							if( Positive_Money_Flow_Sum <= 2.62948e+06 )
								if( mf <= -0.011629 )
									ret := -0.096228
								if( mf > -0.011629 )
									ret := 0.015303
							if( Positive_Money_Flow_Sum > 2.62948e+06 )
								if( Positive_Money_Flow_Sum <= 4.53596e+06 )
									ret := 0.118768
								if( Positive_Money_Flow_Sum > 4.53596e+06 )
									ret := 0.042197
						if( MFI > 58.4346 )
							if( Negative_Money_Flow <= 694273 )
								if( Typical_Price <= 45.8897 )
									ret := 0.066992
								if( Typical_Price > 45.8897 )
									ret := 0.565217
							if( Negative_Money_Flow > 694273 )
								if( MFI_High <= -11.4191 )
									ret := 0.176776
								if( MFI_High > -11.4191 )
									ret := 0.461224
					if( ad_mf > -3136.55 )
						if( MFI_Low <= 46.2074 )
							if( ad <= 27867.8 )
								if( Negative_Money_Flow_Sum <= 1.74371e+06 )
									ret := 0.059869
								if( Negative_Money_Flow_Sum > 1.74371e+06 )
									ret := -0.050250
							if( ad > 27867.8 )
								if( mf <= 0.11051 )
									ret := 0.093677
								if( mf > 0.11051 )
									ret := -0.097015
						if( MFI_Low > 46.2074 )
							if( Negative_Money_Flow_Sum <= 3.23594e+06 )
								if( Positive_Money_Flow <= 1.16471e+06 )
									ret := 0.049324
								if( Positive_Money_Flow > 1.16471e+06 )
									ret := 0.258865
							if( Negative_Money_Flow_Sum > 3.23594e+06 )
								if( ad_mf <= 49895.9 )
									ret := -0.039074
								if( ad_mf > 49895.9 )
									ret := -0.643836
				if( Negative_Money_Flow > 1.56475e+06 )
					if( Typical_Price <= 38.5849 )
						if( Negative_Money_Flow <= 5.83142e+06 )
							if( Negative_Money_Flow_Sum <= 3.51575e+07 )
								if( ad <= 63570.2 )
									ret := 0.184329
								if( ad > 63570.2 )
									ret := -0.262032
							if( Negative_Money_Flow_Sum > 3.51575e+07 )
								if( MFI_High <= -62.8056 )
									ret := 0.603960
								if( MFI_High > -62.8056 )
									ret := 0.854545 // buy
						if( Negative_Money_Flow > 5.83142e+06 )
							if( Negative_Money_Flow_Sum <= 2.72859e+07 )
								if( ad <= -171308 )
									ret := 0.188406
								if( ad > -171308 )
									ret := 0.722892 // buy
							if( Negative_Money_Flow_Sum > 2.72859e+07 )
								if( Negative_Money_Flow_Sum <= 2.82182e+07 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 2.82182e+07 )
									ret := 0.417582
					if( Typical_Price > 38.5849 )
						if( Negative_Money_Flow_Sum <= 1.80858e+07 )
							if( ad_mf <= 9220.11 )
								if( Money_Flow_Ratio <= 0.579687 )
									ret := -0.235741
								if( Money_Flow_Ratio > 0.579687 )
									ret := -0.024876
							if( ad_mf > 9220.11 )
								if( MFI_Low <= -5.12591 )
									ret := -1.000000 // sell
								if( MFI_Low > -5.12591 )
									ret := -0.432258
						if( Negative_Money_Flow_Sum > 1.80858e+07 )
							if( Positive_Money_Flow_Sum <= 5.3245e+06 )
								if( Typical_Price <= 43.4662 )
									ret := -0.504132
								if( Typical_Price > 43.4662 )
									ret := 0.008584
							if( Positive_Money_Flow_Sum > 5.3245e+06 )
								if( MFI_High <= -64.8806 )
									ret := 0.485232
								if( MFI_High > -64.8806 )
									ret := 0.084227
			if( Positive_Money_Flow_Sum > 1.15789e+07 )
				if( MFI_Low <= 4.86379 )
					if( Money_Flow_Ratio <= 0.120921 )
						if( Typical_Price <= 169.591 )
							if( mf <= -0.114797 )
								ret := -0.076923
							if( mf > -0.114797 )
								ret := -0.818182 // sell
						if( Typical_Price > 169.591 )
							ret := -0.925926 // sell
					if( Money_Flow_Ratio > 0.120921 )
						if( Negative_Money_Flow <= 9.78742e+06 )
							if( Negative_Money_Flow_Sum <= 8.72428e+07 )
								if( MFI <= 16.5757 )
									ret := -0.747475 // sell
								if( MFI > 16.5757 )
									ret := -0.061184
							if( Negative_Money_Flow_Sum > 8.72428e+07 )
								if( Negative_Money_Flow_Sum <= 1.26529e+08 )
									ret := 0.294444
								if( Negative_Money_Flow_Sum > 1.26529e+08 )
									ret := -0.075758
						if( Negative_Money_Flow > 9.78742e+06 )
							if( MFI_Low <= -5.12636 )
								if( MFI_High <= -65.6114 )
									ret := 0.757009 // buy
								if( MFI_High > -65.6114 )
									ret := 1.000000 // buy
							if( MFI_Low > -5.12636 )
								if( ad <= -91190.4 )
									ret := 0.766990 // buy
								if( ad > -91190.4 )
									ret := 0.244080
				if( MFI_Low > 4.86379 )
					if( Raw_Money_Flow <= 2.04905e+06 )
						if( MFI_High <= -4.38834 )
							if( Positive_Money_Flow_Sum <= 4.534e+07 )
								if( Raw_Money_Flow <= 1.0789e+06 )
									ret := 0.009362
								if( Raw_Money_Flow > 1.0789e+06 )
									ret := -0.105658
							if( Positive_Money_Flow_Sum > 4.534e+07 )
								if( Positive_Money_Flow <= 394671 )
									ret := 0.140000
								if( Positive_Money_Flow > 394671 )
									ret := 0.448718
						if( MFI_High > -4.38834 )
							if( Raw_Money_Flow <= 1.79168e+06 )
								if( Positive_Money_Flow <= 696616 )
									ret := 0.155637
								if( Positive_Money_Flow > 696616 )
									ret := -0.129291
							if( Raw_Money_Flow > 1.79168e+06 )
								if( Negative_Money_Flow_Sum <= 4.35863e+06 )
									ret := 0.572650
								if( Negative_Money_Flow_Sum > 4.35863e+06 )
									ret := 0.175532
					if( Raw_Money_Flow > 2.04905e+06 )
						if( Positive_Money_Flow_Sum <= 1.50892e+07 )
							if( Money_Flow_Ratio <= 0.364728 )
								if( MFI <= 25.5213 )
									ret := -0.162162
								if( MFI > 25.5213 )
									ret := -0.588785
							if( Money_Flow_Ratio > 0.364728 )
								if( Typical_Price <= 83.4815 )
									ret := -0.166175
								if( Typical_Price > 83.4815 )
									ret := 0.077658
						if( Positive_Money_Flow_Sum > 1.50892e+07 )
							if( mf <= 0.068528 )
								if( Negative_Money_Flow <= 1.35745e+07 )
									ret := 0.041611
								if( Negative_Money_Flow > 1.35745e+07 )
									ret := -0.160352
							if( mf > 0.068528 )
								if( ad <= 57941.2 )
									ret := -0.024517
								if( ad > 57941.2 )
									ret := -0.159926
		if( Negative_Money_Flow > 2.322e+07 )
			if( Positive_Money_Flow_Sum <= 1.7331e+08 )
				if( Typical_Price <= 184.307 )
					if( Positive_Money_Flow_Sum <= 9.52663e+07 )
						if( MFI_High <= -68.9376 )
							if( Negative_Money_Flow <= 4.3812e+07 )
								if( ad <= -11741.1 )
									ret := 0.941176 // buy
								if( ad > -11741.1 )
									ret := 0.600000
							if( Negative_Money_Flow > 4.3812e+07 )
								ret := 1.000000 // buy
						if( MFI_High > -68.9376 )
							if( mf <= 0.101473 )
								if( MFI_Low <= 11.4788 )
									ret := 0.319307
								if( MFI_Low > 11.4788 )
									ret := -0.107784
							if( mf > 0.101473 )
								if( Raw_Money_Flow <= 2.73234e+07 )
									ret := 0.700000 // buy
								if( Raw_Money_Flow > 2.73234e+07 )
									ret := 0.960000 // buy
					if( Positive_Money_Flow_Sum > 9.52663e+07 )
						if( Negative_Money_Flow <= 2.71623e+07 )
							if( Positive_Money_Flow_Sum <= 1.50478e+08 )
								if( Money_Flow_Ratio <= 0.669962 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.669962 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 1.50478e+08 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 2.71623e+07 )
							if( ad_mf <= 4038.28 )
								if( mf <= -0.143032 )
									ret := 0.230769
								if( mf > -0.143032 )
									ret := 0.824324 // buy
							if( ad_mf > 4038.28 )
								if( Raw_Money_Flow <= 3.75862e+07 )
									ret := -0.266667
								if( Raw_Money_Flow > 3.75862e+07 )
									ret := 0.600000
				if( Typical_Price > 184.307 )
					if( ad_mf <= -113072 )
						ret := 0.000000
					if( ad_mf > -113072 )
						if( ad <= 36964.5 )
							if( Raw_Money_Flow <= 2.95873e+07 )
								ret := -0.466667
							if( Raw_Money_Flow > 2.95873e+07 )
								ret := -1.000000 // sell
						if( ad > 36964.5 )
							ret := -0.083333
			if( Positive_Money_Flow_Sum > 1.7331e+08 )
				if( MFI <= 48.7007 )
					if( Positive_Money_Flow_Sum <= 2.33406e+08 )
						if( MFI_Low <= 13.8105 )
							ret := 1.000000 // buy
						if( MFI_Low > 13.8105 )
							if( MFI_High <= -33.3106 )
								if( Typical_Price <= 180.396 )
									ret := -0.836735 // sell
								if( Typical_Price > 180.396 )
									ret := 0.916667 // buy
							if( MFI_High > -33.3106 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.33406e+08 )
						ret := 1.000000 // buy
				if( MFI > 48.7007 )
					if( mf <= -0.076628 )
						ret := 0.777778 // buy
					if( mf > -0.076628 )
						if( Positive_Money_Flow_Sum <= 2.21695e+08 )
							if( ad <= -96649.2 )
								if( ad_mf <= -127494 )
									ret := -0.833333 // sell
								if( ad_mf > -127494 )
									ret := -0.444444
							if( ad > -96649.2 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.21695e+08 )
							if( Negative_Money_Flow <= 4.74481e+07 )
								if( Negative_Money_Flow <= 2.6022e+07 )
									ret := -0.789474 // sell
								if( Negative_Money_Flow > 2.6022e+07 )
									ret := 0.064516
							if( Negative_Money_Flow > 4.74481e+07 )
								ret := -0.916667 // sell
	if( Positive_Money_Flow > 1.00309e+07 )
		if( Typical_Price <= 145.243 )
			if( MFI <= 71.2631 )
				if( Positive_Money_Flow_Sum <= 9.9722e+07 )
					if( Positive_Money_Flow <= 1.03915e+07 )
						if( MFI <= 41.8103 )
							if( Positive_Money_Flow_Sum <= 4.89585e+07 )
								if( Negative_Money_Flow_Sum <= 8.70408e+07 )
									ret := 0.230769
								if( Negative_Money_Flow_Sum > 8.70408e+07 )
									ret := -0.550000
							if( Positive_Money_Flow_Sum > 4.89585e+07 )
								ret := 0.555556
						if( MFI > 41.8103 )
							if( MFI_High <= -28.891 )
								if( mf <= 0.011844 )
									ret := -1.000000 // sell
								if( mf > 0.011844 )
									ret := -0.888889 // sell
							if( MFI_High > -28.891 )
								if( Positive_Money_Flow <= 1.02549e+07 )
									ret := -0.470588
								if( Positive_Money_Flow > 1.02549e+07 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 1.03915e+07 )
						if( Typical_Price <= 51.1026 )
							if( Positive_Money_Flow <= 1.11516e+07 )
								if( Positive_Money_Flow_Sum <= 2.49575e+07 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 2.49575e+07 )
									ret := -0.666667
							if( Positive_Money_Flow > 1.11516e+07 )
								if( Raw_Money_Flow <= 1.97219e+07 )
									ret := -0.928571 // sell
								if( Raw_Money_Flow > 1.97219e+07 )
									ret := -0.300000
						if( Typical_Price > 51.1026 )
							if( Raw_Money_Flow <= 4.18447e+07 )
								if( MFI_High <= -12.3928 )
									ret := 0.003799
								if( MFI_High > -12.3928 )
									ret := 0.341463
							if( Raw_Money_Flow > 4.18447e+07 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 9.9722e+07 )
					if( Positive_Money_Flow_Sum <= 2.13035e+08 )
						if( Negative_Money_Flow_Sum <= 8.1102e+07 )
							if( mf <= 0.019838 )
								if( Positive_Money_Flow <= 1.73195e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.73195e+07 )
									ret := 0.900000 // buy
							if( mf > 0.019838 )
								if( Negative_Money_Flow_Sum <= 7.00846e+07 )
									ret := 0.109890
								if( Negative_Money_Flow_Sum > 7.00846e+07 )
									ret := 0.723684 // buy
						if( Negative_Money_Flow_Sum > 8.1102e+07 )
							if( Negative_Money_Flow_Sum <= 1.1384e+08 )
								if( MFI <= 57.2077 )
									ret := 0.204082
								if( MFI > 57.2077 )
									ret := -0.582090
							if( Negative_Money_Flow_Sum > 1.1384e+08 )
								if( Raw_Money_Flow <= 4.51815e+07 )
									ret := 0.457547
								if( Raw_Money_Flow > 4.51815e+07 )
									ret := -0.600000
					if( Positive_Money_Flow_Sum > 2.13035e+08 )
						if( Raw_Money_Flow <= 5.64946e+07 )
							if( ad_mf <= 192315 )
								if( Positive_Money_Flow_Sum <= 2.61696e+08 )
									ret := -0.488372
								if( Positive_Money_Flow_Sum > 2.61696e+08 )
									ret := -0.057143
							if( ad_mf > 192315 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 5.64946e+07 )
							ret := 0.866667 // buy
			if( MFI > 71.2631 )
				if( Typical_Price <= 37.6843 )
					if( Typical_Price <= 36.6824 )
						if( Negative_Money_Flow_Sum <= 1.40619e+07 )
							if( MFI <= 90.2802 )
								if( ad_mf <= 135546 )
									ret := 0.214286
								if( ad_mf > 135546 )
									ret := 0.750000 // buy
							if( MFI > 90.2802 )
								if( Raw_Money_Flow <= 1.37575e+07 )
									ret := 0.454545
								if( Raw_Money_Flow > 1.37575e+07 )
									ret := -0.478261
						if( Negative_Money_Flow_Sum > 1.40619e+07 )
							if( MFI_Low <= 54.682 )
								ret := -0.538462
							if( MFI_Low > 54.682 )
								ret := -1.000000 // sell
					if( Typical_Price > 36.6824 )
						ret := 0.923077 // buy
				if( Typical_Price > 37.6843 )
					if( Positive_Money_Flow_Sum <= 5.11702e+07 )
						if( mf <= 0.135331 )
							if( Positive_Money_Flow_Sum <= 5.04073e+07 )
								if( MFI_High <= -3.63619 )
									ret := -0.125000
								if( MFI_High > -3.63619 )
									ret := -0.850000 // sell
							if( Positive_Money_Flow_Sum > 5.04073e+07 )
								ret := 0.600000
						if( mf > 0.135331 )
							if( ad <= 170805 )
								if( Positive_Money_Flow_Sum <= 3.82188e+07 )
									ret := 0.692308
								if( Positive_Money_Flow_Sum > 3.82188e+07 )
									ret := 0.400000
							if( ad > 170805 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.11702e+07 )
						if( Negative_Money_Flow_Sum <= 6.4832e+07 )
							if( Raw_Money_Flow <= 2.17941e+07 )
								if( ad_mf <= 151171 )
									ret := -0.306519
								if( ad_mf > 151171 )
									ret := -0.851852 // sell
							if( Raw_Money_Flow > 2.17941e+07 )
								if( MFI_High <= 16.616 )
									ret := 0.210526
								if( MFI_High > 16.616 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 6.4832e+07 )
							if( Typical_Price <= 103.698 )
								ret := -0.571429
							if( Typical_Price > 103.698 )
								if( Positive_Money_Flow <= 2.90662e+07 )
									ret := 0.879310 // buy
								if( Positive_Money_Flow > 2.90662e+07 )
									ret := -0.066667
		if( Typical_Price > 145.243 )
			if( MFI_Low <= 39.2534 )
				if( Money_Flow_Ratio <= 1.25413 )
					if( Positive_Money_Flow_Sum <= 1.10953e+08 )
						if( ad <= 16342.1 )
							if( Raw_Money_Flow <= 2.44707e+07 )
								if( Money_Flow_Ratio <= 1.15158 )
									ret := -0.674699
								if( Money_Flow_Ratio > 1.15158 )
									ret := 0.090909
							if( Raw_Money_Flow > 2.44707e+07 )
								ret := 0.636364
						if( ad > 16342.1 )
							if( Raw_Money_Flow <= 3.65881e+07 )
								if( Negative_Money_Flow_Sum <= 1.02141e+08 )
									ret := -0.058252
								if( Negative_Money_Flow_Sum > 1.02141e+08 )
									ret := -0.361582
							if( Raw_Money_Flow > 3.65881e+07 )
								ret := 0.777778 // buy
					if( Positive_Money_Flow_Sum > 1.10953e+08 )
						if( Negative_Money_Flow_Sum <= 2.14451e+08 )
							if( MFI_High <= -25.8869 )
								if( MFI_Low <= 19.5993 )
									ret := 0.880000 // buy
								if( MFI_Low > 19.5993 )
									ret := 0.239264
							if( MFI_High > -25.8869 )
								if( MFI_High <= -25.5237 )
									ret := -1.000000 // sell
								if( MFI_High > -25.5237 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 2.14451e+08 )
							if( MFI_High <= -46.7216 )
								ret := 0.708333 // buy
							if( MFI_High > -46.7216 )
								if( Money_Flow_Ratio <= 0.616206 )
									ret := -0.057143
								if( Money_Flow_Ratio > 0.616206 )
									ret := -0.642857
				if( Money_Flow_Ratio > 1.25413 )
					if( ad <= 9647.99 )
						if( Positive_Money_Flow <= 1.92738e+07 )
							if( MFI <= 57.6177 )
								ret := 0.384615
							if( MFI > 57.6177 )
								if( MFI <= 58.5853 )
									ret := 1.000000 // buy
								if( MFI > 58.5853 )
									ret := 0.666667
						if( Positive_Money_Flow > 1.92738e+07 )
							if( MFI_Low <= 36.2139 )
								ret := 0.800000 // buy
							if( MFI_Low > 36.2139 )
								ret := 1.000000 // buy
					if( ad > 9647.99 )
						if( Raw_Money_Flow <= 3.39289e+07 )
							if( Negative_Money_Flow_Sum <= 9.99397e+07 )
								if( ad <= 30451.1 )
									ret := -0.562500
								if( ad > 30451.1 )
									ret := 0.163636
							if( Negative_Money_Flow_Sum > 9.99397e+07 )
								if( ad_mf <= 81590.4 )
									ret := -0.500000
								if( ad_mf > 81590.4 )
									ret := -0.842105 // sell
						if( Raw_Money_Flow > 3.39289e+07 )
							ret := 0.764706 // buy
			if( MFI_Low > 39.2534 )
				if( MFI_High <= -10.8428 )
					if( mf <= 0.122717 )
						if( Positive_Money_Flow <= 1.56136e+07 )
							if( ad <= 49594.8 )
								if( Positive_Money_Flow <= 1.19572e+07 )
									ret := 0.333333
								if( Positive_Money_Flow > 1.19572e+07 )
									ret := -0.500000
							if( ad > 49594.8 )
								ret := 0.941176 // buy
						if( Positive_Money_Flow > 1.56136e+07 )
							if( Negative_Money_Flow_Sum <= 4.03205e+07 )
								ret := 0.333333
							if( Negative_Money_Flow_Sum > 4.03205e+07 )
								if( mf <= 0.064018 )
									ret := -0.840426 // sell
								if( mf > 0.064018 )
									ret := -0.147059
					if( mf > 0.122717 )
						if( Positive_Money_Flow <= 2.84353e+07 )
							if( MFI_Low <= 43.0437 )
								if( mf <= 0.214305 )
									ret := -0.942857 // sell
								if( mf > 0.214305 )
									ret := -0.708333 // sell
							if( MFI_Low > 43.0437 )
								if( ad <= 44668.1 )
									ret := -0.346939
								if( ad > 44668.1 )
									ret := -0.700000 // sell
						if( Positive_Money_Flow > 2.84353e+07 )
							if( ad <= 126340 )
								ret := -0.777778 // sell
							if( ad > 126340 )
								ret := -1.000000 // sell
				if( MFI_High > -10.8428 )
					if( MFI_High <= 16.1242 )
						if( Positive_Money_Flow_Sum <= 7.22118e+07 )
							if( Raw_Money_Flow <= 1.40459e+07 )
								if( Typical_Price <= 175.22 )
									ret := -0.055556
								if( Typical_Price > 175.22 )
									ret := -0.500000
							if( Raw_Money_Flow > 1.40459e+07 )
								if( Positive_Money_Flow <= 1.928e+07 )
									ret := 0.634146
								if( Positive_Money_Flow > 1.928e+07 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 7.22118e+07 )
							if( Positive_Money_Flow <= 3.28926e+07 )
								if( Negative_Money_Flow_Sum <= 3.25961e+07 )
									ret := -0.359649
								if( Negative_Money_Flow_Sum > 3.25961e+07 )
									ret := 0.079167
							if( Positive_Money_Flow > 3.28926e+07 )
								if( Typical_Price <= 150.124 )
									ret := 0.071429
								if( Typical_Price > 150.124 )
									ret := -0.703704 // sell
					if( MFI_High > 16.1242 )
						if( Raw_Money_Flow <= 2.65978e+07 )
							ret := 0.000000
						if( Raw_Money_Flow > 2.65978e+07 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_b81c4651(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


