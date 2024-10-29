//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: BNBUSDT_30Min_2CM0_859c19d9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2CM0_859c19d9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_859c19d9(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -10857.8 )
		if( Money_Flow_Ratio <= 0.225177 )
			if( Positive_Money_Flow_Sum <= 2.99324e+06 )
				if( Negative_Money_Flow_Sum <= 1.32765e+07 )
					if( mf <= -0.15424 )
						ret := -0.750000 // sell
					if( mf > -0.15424 )
						if( Typical_Price <= 27.7514 )
							if( Negative_Money_Flow_Sum <= 1.11465e+07 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.11465e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 27.7514 )
							ret := 0.333333
				if( Negative_Money_Flow_Sum > 1.32765e+07 )
					if( Negative_Money_Flow_Sum <= 3.43757e+07 )
						if( Money_Flow_Ratio <= 0.136715 )
							if( Positive_Money_Flow_Sum <= 1.92659e+06 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.92659e+06 )
								if( Negative_Money_Flow <= 5.83148e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.83148e+06 )
									ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.136715 )
							if( ad <= -45501.8 )
								ret := -1.000000 // sell
							if( ad > -45501.8 )
								if( Money_Flow_Ratio <= 0.157663 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.157663 )
									ret := -0.200000
					if( Negative_Money_Flow_Sum > 3.43757e+07 )
						if( mf <= -0.349778 )
							ret := -0.750000 // sell
						if( mf > -0.349778 )
							ret := 0.500000
			if( Positive_Money_Flow_Sum > 2.99324e+06 )
				if( ad <= -33862.6 )
					if( MFI_High <= -74.5309 )
						ret := -0.400000
					if( MFI_High > -74.5309 )
						if( Negative_Money_Flow <= 997630 )
							ret := -0.250000
						if( Negative_Money_Flow > 997630 )
							if( Negative_Money_Flow_Sum <= 4.18766e+08 )
								if( mf <= -0.106014 )
									ret := 0.772222 // buy
								if( mf > -0.106014 )
									ret := 0.490196
							if( Negative_Money_Flow_Sum > 4.18766e+08 )
								if( Positive_Money_Flow_Sum <= 8.60804e+07 )
									ret := -0.083333
								if( Positive_Money_Flow_Sum > 8.60804e+07 )
									ret := 0.666667
				if( ad > -33862.6 )
					if( mf <= -0.215699 )
						if( Negative_Money_Flow_Sum <= 6.58664e+07 )
							if( Negative_Money_Flow <= 4.55995e+06 )
								if( MFI_High <= -63.2162 )
									ret := 0.333333
								if( MFI_High > -63.2162 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 4.55995e+06 )
								if( Raw_Money_Flow <= 7.87013e+06 )
									ret := -0.571429
								if( Raw_Money_Flow > 7.87013e+06 )
									ret := 0.264706
						if( Negative_Money_Flow_Sum > 6.58664e+07 )
							if( Typical_Price <= 296.863 )
								if( mf <= -0.255253 )
									ret := 1.000000 // buy
								if( mf > -0.255253 )
									ret := -0.714286 // sell
							if( Typical_Price > 296.863 )
								if( mf <= -0.227501 )
									ret := 0.698113
								if( mf > -0.227501 )
									ret := 0.966667 // buy
					if( mf > -0.215699 )
						if( Negative_Money_Flow <= 1.46339e+07 )
							if( Negative_Money_Flow <= 2.86844e+06 )
								if( ad <= -15923.7 )
									ret := 1.000000 // buy
								if( ad > -15923.7 )
									ret := 0.600000
							if( Negative_Money_Flow > 2.86844e+06 )
								if( ad <= -25185 )
									ret := -0.608696
								if( ad > -25185 )
									ret := -0.064748
						if( Negative_Money_Flow > 1.46339e+07 )
							if( mf <= -0.106824 )
								if( mf <= -0.181619 )
									ret := 0.900000 // buy
								if( mf > -0.181619 )
									ret := 0.545455
							if( mf > -0.106824 )
								if( mf <= -0.064796 )
									ret := -0.642857
								if( mf > -0.064796 )
									ret := 0.360000
		if( Money_Flow_Ratio > 0.225177 )
			if( Typical_Price <= 225.111 )
				if( Negative_Money_Flow_Sum <= 7.60211e+07 )
					if( MFI_High <= -30.6902 )
						if( Positive_Money_Flow_Sum <= 2.43655e+07 )
							if( ad_mf <= -41815 )
								if( Negative_Money_Flow_Sum <= 1.32406e+07 )
									ret := 0.057143
								if( Negative_Money_Flow_Sum > 1.32406e+07 )
									ret := 0.524590
							if( ad_mf > -41815 )
								if( mf <= 0.149419 )
									ret := 0.233798
								if( mf > 0.149419 )
									ret := -0.280000
						if( Positive_Money_Flow_Sum > 2.43655e+07 )
							if( ad_mf <= -44765.6 )
								if( Typical_Price <= 38.9551 )
									ret := 0.187500
								if( Typical_Price > 38.9551 )
									ret := -0.666667
							if( ad_mf > -44765.6 )
								if( Positive_Money_Flow_Sum <= 4.1596e+07 )
									ret := 0.051948
								if( Positive_Money_Flow_Sum > 4.1596e+07 )
									ret := 0.781250 // buy
					if( MFI_High > -30.6902 )
						if( Raw_Money_Flow <= 1.96497e+06 )
							if( ad_mf <= -18452.9 )
								if( Raw_Money_Flow <= 1.7108e+06 )
									ret := 0.002381
								if( Raw_Money_Flow > 1.7108e+06 )
									ret := 0.368421
							if( ad_mf > -18452.9 )
								if( Negative_Money_Flow_Sum <= 5.09065e+06 )
									ret := -0.037037
								if( Negative_Money_Flow_Sum > 5.09065e+06 )
									ret := 0.362595
						if( Raw_Money_Flow > 1.96497e+06 )
							if( MFI <= 54.0594 )
								if( Negative_Money_Flow <= 2.615e+06 )
									ret := -0.594059
								if( Negative_Money_Flow > 2.615e+06 )
									ret := 0.074380
							if( MFI > 54.0594 )
								if( ad_mf <= -77705.1 )
									ret := 0.237903
								if( ad_mf > -77705.1 )
									ret := 0.006826
				if( Negative_Money_Flow_Sum > 7.60211e+07 )
					if( MFI_Low <= 17.5794 )
						if( Raw_Money_Flow <= 4.57766e+06 )
							ret := -0.500000
						if( Raw_Money_Flow > 4.57766e+06 )
							if( Negative_Money_Flow_Sum <= 7.88403e+07 )
								ret := 0.200000
							if( Negative_Money_Flow_Sum > 7.88403e+07 )
								if( Raw_Money_Flow <= 2.50409e+07 )
									ret := 0.909091 // buy
								if( Raw_Money_Flow > 2.50409e+07 )
									ret := 0.650000
					if( MFI_Low > 17.5794 )
						if( mf <= 0.04347 )
							if( Negative_Money_Flow_Sum <= 1.55118e+08 )
								if( ad_mf <= -121804 )
									ret := 1.000000 // buy
								if( ad_mf > -121804 )
									ret := -0.150000
							if( Negative_Money_Flow_Sum > 1.55118e+08 )
								if( Typical_Price <= 162.921 )
									ret := -0.400000
								if( Typical_Price > 162.921 )
									ret := 0.870968 // buy
						if( mf > 0.04347 )
							if( Positive_Money_Flow_Sum <= 5.01856e+08 )
								if( ad <= -13960.5 )
									ret := 0.858824 // buy
								if( ad > -13960.5 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 5.01856e+08 )
								if( Raw_Money_Flow <= 4.10614e+07 )
									ret := 0.666667
								if( Raw_Money_Flow > 4.10614e+07 )
									ret := -0.625000
			if( Typical_Price > 225.111 )
				if( Negative_Money_Flow <= 1.17505e+08 )
					if( Negative_Money_Flow_Sum <= 3.89545e+08 )
						if( Raw_Money_Flow <= 7.42213e+06 )
							if( Negative_Money_Flow_Sum <= 5.39093e+07 )
								if( Positive_Money_Flow_Sum <= 6.62427e+07 )
									ret := 0.143642
								if( Positive_Money_Flow_Sum > 6.62427e+07 )
									ret := -0.115108
							if( Negative_Money_Flow_Sum > 5.39093e+07 )
								if( Negative_Money_Flow_Sum <= 1.38681e+08 )
									ret := 0.317136
								if( Negative_Money_Flow_Sum > 1.38681e+08 )
									ret := -0.294118
						if( Raw_Money_Flow > 7.42213e+06 )
							if( Positive_Money_Flow_Sum <= 2.73385e+07 )
								if( Typical_Price <= 245.148 )
									ret := 0.437500
								if( Typical_Price > 245.148 )
									ret := -0.205011
							if( Positive_Money_Flow_Sum > 2.73385e+07 )
								if( Positive_Money_Flow_Sum <= 4.08183e+07 )
									ret := 0.277467
								if( Positive_Money_Flow_Sum > 4.08183e+07 )
									ret := 0.056036
					if( Negative_Money_Flow_Sum > 3.89545e+08 )
						if( Positive_Money_Flow_Sum <= 1.28157e+08 )
							if( Negative_Money_Flow_Sum <= 4.0335e+08 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 4.0335e+08 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.28157e+08 )
							if( Negative_Money_Flow_Sum <= 5.62835e+08 )
								if( Positive_Money_Flow_Sum <= 5.9971e+08 )
									ret := -0.210256
								if( Positive_Money_Flow_Sum > 5.9971e+08 )
									ret := -0.846154 // sell
							if( Negative_Money_Flow_Sum > 5.62835e+08 )
								if( Negative_Money_Flow <= 4.66434e+07 )
									ret := -0.170886
								if( Negative_Money_Flow > 4.66434e+07 )
									ret := 0.509091
				if( Negative_Money_Flow > 1.17505e+08 )
					if( MFI_Low <= 44.4128 )
						if( Negative_Money_Flow_Sum <= 4.54375e+08 )
							if( ad <= -320876 )
								ret := 1.000000 // buy
							if( ad > -320876 )
								if( mf <= -0.118907 )
									ret := -1.000000 // sell
								if( mf > -0.118907 )
									ret := 0.400000
						if( Negative_Money_Flow_Sum > 4.54375e+08 )
							if( Negative_Money_Flow <= 1.4274e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 1.4274e+08 )
								if( Negative_Money_Flow_Sum <= 5.98621e+08 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 5.98621e+08 )
									ret := 0.882353 // buy
					if( MFI_Low > 44.4128 )
						if( mf <= 0.16462 )
							ret := -1.000000 // sell
						if( mf > 0.16462 )
							ret := 1.000000 // buy
	if( ad > -10857.8 )
		if( Typical_Price <= 582.798 )
			if( Raw_Money_Flow <= 1.79749e+07 )
				if( MFI_High <= -62.0089 )
					if( ad <= 20707.8 )
						if( Negative_Money_Flow <= 1.35087e+07 )
							if( Positive_Money_Flow_Sum <= 9.55575e+06 )
								if( Negative_Money_Flow <= 3.14435e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 3.14435e+06 )
									ret := -0.210692
							if( Positive_Money_Flow_Sum > 9.55575e+06 )
								if( Negative_Money_Flow <= 8.13202e+06 )
									ret := -0.356968
								if( Negative_Money_Flow > 8.13202e+06 )
									ret := -0.011494
						if( Negative_Money_Flow > 1.35087e+07 )
							if( Negative_Money_Flow_Sum <= 5.57264e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 5.57264e+07 )
								if( Negative_Money_Flow_Sum <= 1.83048e+08 )
									ret := 0.130435
								if( Negative_Money_Flow_Sum > 1.83048e+08 )
									ret := 0.875000 // buy
					if( ad > 20707.8 )
						if( Raw_Money_Flow <= 1.23986e+07 )
							if( mf <= 0.039515 )
								if( Positive_Money_Flow_Sum <= 9.6441e+06 )
									ret := 0.205479
								if( Positive_Money_Flow_Sum > 9.6441e+06 )
									ret := 0.829268 // buy
							if( mf > 0.039515 )
								if( Positive_Money_Flow <= 4.0122e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 4.0122e+06 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.23986e+07 )
							if( mf <= -0.060994 )
								if( Negative_Money_Flow <= 1.25469e+07 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow > 1.25469e+07 )
									ret := -0.250000
							if( mf > -0.060994 )
								ret := 0.285714
				if( MFI_High > -62.0089 )
					if( Positive_Money_Flow_Sum <= 3.30677e+08 )
						if( Negative_Money_Flow_Sum <= 7.72175e+06 )
							if( Money_Flow_Ratio <= 2.04982 )
								if( Negative_Money_Flow <= 1.96797e+06 )
									ret := 0.014010
								if( Negative_Money_Flow > 1.96797e+06 )
									ret := 0.292683
							if( Money_Flow_Ratio > 2.04982 )
								if( ad <= 32905.7 )
									ret := 0.184630
								if( ad > 32905.7 )
									ret := -0.087121
						if( Negative_Money_Flow_Sum > 7.72175e+06 )
							if( Positive_Money_Flow <= 4.70059e+06 )
								if( Typical_Price <= 268.218 )
									ret := 0.046446
								if( Typical_Price > 268.218 )
									ret := 0.001030
							if( Positive_Money_Flow > 4.70059e+06 )
								if( Money_Flow_Ratio <= 1.71962 )
									ret := 0.082379
								if( Money_Flow_Ratio > 1.71962 )
									ret := -0.003591
					if( Positive_Money_Flow_Sum > 3.30677e+08 )
						if( Typical_Price <= 347.634 )
							if( Positive_Money_Flow_Sum <= 3.76708e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.76708e+08 )
								ret := 0.500000
						if( Typical_Price > 347.634 )
							if( MFI <= 67.3245 )
								if( mf <= -0.009928 )
									ret := 1.000000 // buy
								if( mf > -0.009928 )
									ret := 0.000000
							if( MFI > 67.3245 )
								ret := -0.250000
			if( Raw_Money_Flow > 1.79749e+07 )
				if( mf <= 0.22834 )
					if( Money_Flow_Ratio <= 6.11549 )
						if( Negative_Money_Flow_Sum <= 1.34376e+08 )
							if( Negative_Money_Flow_Sum <= 1.12118e+08 )
								if( Negative_Money_Flow_Sum <= 9.60588e+07 )
									ret := 0.180294
								if( Negative_Money_Flow_Sum > 9.60588e+07 )
									ret := -0.099567
							if( Negative_Money_Flow_Sum > 1.12118e+08 )
								if( Positive_Money_Flow_Sum <= 3.18774e+08 )
									ret := 0.310448
								if( Positive_Money_Flow_Sum > 3.18774e+08 )
									ret := 0.648649
						if( Negative_Money_Flow_Sum > 1.34376e+08 )
							if( Negative_Money_Flow_Sum <= 6.45106e+08 )
								if( Positive_Money_Flow_Sum <= 7.54624e+08 )
									ret := 0.070076
								if( Positive_Money_Flow_Sum > 7.54624e+08 )
									ret := -0.675000
							if( Negative_Money_Flow_Sum > 6.45106e+08 )
								if( Positive_Money_Flow_Sum <= 1.98186e+08 )
									ret := 0.913043 // buy
								if( Positive_Money_Flow_Sum > 1.98186e+08 )
									ret := 0.240741
					if( Money_Flow_Ratio > 6.11549 )
						if( Positive_Money_Flow_Sum <= 6.98666e+07 )
							if( ad_mf <= 7401.41 )
								ret := 0.000000
							if( ad_mf > 7401.41 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.98666e+07 )
							if( Positive_Money_Flow <= 3.74096e+07 )
								if( Positive_Money_Flow <= 2.05967e+07 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 2.05967e+07 )
									ret := -0.960000 // sell
							if( Positive_Money_Flow > 3.74096e+07 )
								if( mf <= 0.157487 )
									ret := 0.800000 // buy
								if( mf > 0.157487 )
									ret := -0.666667
				if( mf > 0.22834 )
					if( MFI_Low <= 28.075 )
						if( Negative_Money_Flow_Sum <= 1.93888e+08 )
							if( Typical_Price <= 421.883 )
								ret := 0.750000 // buy
							if( Typical_Price > 421.883 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.93888e+08 )
							if( MFI_Low <= 18.1689 )
								ret := -0.250000
							if( MFI_Low > 18.1689 )
								if( Money_Flow_Ratio <= 0.874865 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.874865 )
									ret := -0.750000 // sell
					if( MFI_Low > 28.075 )
						if( Typical_Price <= 441.479 )
							if( Positive_Money_Flow_Sum <= 4.36856e+08 )
								if( Positive_Money_Flow_Sum <= 2.5353e+08 )
									ret := 0.123596
								if( Positive_Money_Flow_Sum > 2.5353e+08 )
									ret := 0.631579
							if( Positive_Money_Flow_Sum > 4.36856e+08 )
								if( Typical_Price <= 208.895 )
									ret := -1.000000 // sell
								if( Typical_Price > 208.895 )
									ret := -0.265625
						if( Typical_Price > 441.479 )
							if( Negative_Money_Flow_Sum <= 1.93452e+08 )
								if( MFI_Low <= 58.9489 )
									ret := 0.188679
								if( MFI_Low > 58.9489 )
									ret := 0.562500
							if( Negative_Money_Flow_Sum > 1.93452e+08 )
								if( Typical_Price <= 540.57 )
									ret := 0.315789
								if( Typical_Price > 540.57 )
									ret := 0.977778 // buy
		if( Typical_Price > 582.798 )
			if( Positive_Money_Flow_Sum <= 3.64305e+08 )
				if( Positive_Money_Flow_Sum <= 2.37769e+08 )
					if( ad_mf <= 17988.7 )
						if( Negative_Money_Flow_Sum <= 1.92895e+08 )
							if( Raw_Money_Flow <= 1.277e+07 )
								if( Positive_Money_Flow_Sum <= 1.52085e+08 )
									ret := -0.066290
								if( Positive_Money_Flow_Sum > 1.52085e+08 )
									ret := 0.264368
							if( Raw_Money_Flow > 1.277e+07 )
								if( mf <= 0.065041 )
									ret := 0.364407
								if( mf > 0.065041 )
									ret := -0.032727
						if( Negative_Money_Flow_Sum > 1.92895e+08 )
							if( MFI <= 17.1237 )
								if( ad_mf <= -5232.21 )
									ret := 1.000000 // buy
								if( ad_mf > -5232.21 )
									ret := 0.750000 // buy
							if( MFI > 17.1237 )
								if( mf <= 0.047319 )
									ret := -0.595745
								if( mf > 0.047319 )
									ret := -0.137931
					if( ad_mf > 17988.7 )
						if( Positive_Money_Flow_Sum <= 1.67155e+08 )
							if( ad_mf <= 32003.5 )
								if( ad_mf <= 30275.5 )
									ret := -0.164474
								if( ad_mf > 30275.5 )
									ret := -0.833333 // sell
							if( ad_mf > 32003.5 )
								if( Positive_Money_Flow <= 3.30546e+07 )
									ret := 0.344828
								if( Positive_Money_Flow > 3.30546e+07 )
									ret := -0.192308
						if( Positive_Money_Flow_Sum > 1.67155e+08 )
							if( Negative_Money_Flow_Sum <= 8.33815e+07 )
								if( Negative_Money_Flow_Sum <= 7.02489e+07 )
									ret := -0.384615
								if( Negative_Money_Flow_Sum > 7.02489e+07 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 8.33815e+07 )
								if( Positive_Money_Flow_Sum <= 2.07104e+08 )
									ret := -0.733333 // sell
								if( Positive_Money_Flow_Sum > 2.07104e+08 )
									ret := -0.360000
				if( Positive_Money_Flow_Sum > 2.37769e+08 )
					if( MFI_High <= -12.7082 )
						if( MFI_Low <= 37.3137 )
							if( MFI_Low <= 32.0772 )
								if( Negative_Money_Flow_Sum <= 4.92774e+08 )
									ret := 0.571429
								if( Negative_Money_Flow_Sum > 4.92774e+08 )
									ret := -1.000000 // sell
							if( MFI_Low > 32.0772 )
								if( Positive_Money_Flow_Sum <= 2.8847e+08 )
									ret := 0.222222
								if( Positive_Money_Flow_Sum > 2.8847e+08 )
									ret := -0.842105 // sell
						if( MFI_Low > 37.3137 )
							if( Positive_Money_Flow <= 9.05384e+07 )
								if( ad_mf <= 4032.05 )
									ret := 0.315789
								if( ad_mf > 4032.05 )
									ret := 0.857143 // buy
							if( Positive_Money_Flow > 9.05384e+07 )
								ret := -0.142857
					if( MFI_High > -12.7082 )
						if( Positive_Money_Flow <= 7.07427e+06 )
							if( Negative_Money_Flow <= 2.32771e+07 )
								if( Typical_Price <= 613.9 )
									ret := 1.000000 // buy
								if( Typical_Price > 613.9 )
									ret := 0.428571
							if( Negative_Money_Flow > 2.32771e+07 )
								ret := -0.400000
						if( Positive_Money_Flow > 7.07427e+06 )
							if( Money_Flow_Ratio <= 8.4717 )
								if( Positive_Money_Flow <= 4.2529e+07 )
									ret := -0.491228
								if( Positive_Money_Flow > 4.2529e+07 )
									ret := 0.250000
							if( Money_Flow_Ratio > 8.4717 )
								ret := 0.500000
			if( Positive_Money_Flow_Sum > 3.64305e+08 )
				if( Raw_Money_Flow <= 2.76881e+07 )
					if( Positive_Money_Flow <= 2.64685e+07 )
						if( Typical_Price <= 618.622 )
							ret := 0.833333 // buy
						if( Typical_Price > 618.622 )
							ret := -0.250000
					if( Positive_Money_Flow > 2.64685e+07 )
						ret := -0.750000 // sell
				if( Raw_Money_Flow > 2.76881e+07 )
					if( Money_Flow_Ratio <= 2.10698 )
						if( MFI_Low <= 17.2709 )
							ret := 0.000000
						if( MFI_Low > 17.2709 )
							if( Typical_Price <= 588.909 )
								if( MFI_Low <= 35.1715 )
									ret := -0.875000 // sell
								if( MFI_Low > 35.1715 )
									ret := 0.166667
							if( Typical_Price > 588.909 )
								if( Money_Flow_Ratio <= 0.91653 )
									ret := -0.428571
								if( Money_Flow_Ratio > 0.91653 )
									ret := -0.923077 // sell
					if( Money_Flow_Ratio > 2.10698 )
						if( MFI <= 80.7916 )
							if( ad <= 54216 )
								if( mf <= 0.055036 )
									ret := -0.750000 // sell
								if( mf > 0.055036 )
									ret := 0.185185
							if( ad > 54216 )
								if( Positive_Money_Flow <= 4.24541e+07 )
									ret := -0.250000
								if( Positive_Money_Flow > 4.24541e+07 )
									ret := -0.846154 // sell
						if( MFI > 80.7916 )
							if( Positive_Money_Flow_Sum <= 5.95952e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 5.95952e+08 )
								ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BNBUSDT_30Min_859c19d9(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


