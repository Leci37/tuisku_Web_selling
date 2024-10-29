//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: VETUSDT_30Min_2CM0_050d094f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2CM0_050d094f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_050d094f(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -8.80394e+06 )
		if( MFI <= 23.9617 )
			if( ad_mf <= -5.27875e+07 )
				if( Negative_Money_Flow <= 1.06966e+06 )
					ret := -0.400000
				if( Negative_Money_Flow > 1.06966e+06 )
					if( Negative_Money_Flow_Sum <= 5.02167e+06 )
						ret := 0.200000
					if( Negative_Money_Flow_Sum > 5.02167e+06 )
						if( mf <= -0.432153 )
							ret := 0.166667
						if( mf > -0.432153 )
							if( ad_mf <= -8.55025e+07 )
								if( Money_Flow_Ratio <= 0.172393 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.172393 )
									ret := 0.982759 // buy
							if( ad_mf > -8.55025e+07 )
								if( ad_mf <= -6.08514e+07 )
									ret := 0.633333
								if( ad_mf > -6.08514e+07 )
									ret := 0.900000 // buy
			if( ad_mf > -5.27875e+07 )
				if( ad_mf <= -1.2451e+07 )
					if( MFI_Low <= -6.66715 )
						if( Typical_Price <= 0.039335 )
							if( Positive_Money_Flow_Sum <= 465931 )
								if( mf <= -0.274141 )
									ret := 0.266667
								if( mf > -0.274141 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 465931 )
								if( ad_mf <= -2.04611e+07 )
									ret := 0.972973 // buy
								if( ad_mf > -2.04611e+07 )
									ret := 0.700000 // buy
						if( Typical_Price > 0.039335 )
							if( Money_Flow_Ratio <= 0.092097 )
								if( MFI_Low <= -12.7418 )
									ret := -0.250000
								if( MFI_Low > -12.7418 )
									ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.092097 )
								if( MFI_Low <= -9.99566 )
									ret := 0.888889 // buy
								if( MFI_Low > -9.99566 )
									ret := 0.208333
					if( MFI_Low > -6.66715 )
						if( Typical_Price <= 0.011358 )
							if( Typical_Price <= 0.010458 )
								if( Negative_Money_Flow <= 324358 )
									ret := 0.000000
								if( Negative_Money_Flow > 324358 )
									ret := -0.909091 // sell
							if( Typical_Price > 0.010458 )
								if( mf <= -0.049913 )
									ret := 0.038462
								if( mf > -0.049913 )
									ret := -1.000000 // sell
						if( Typical_Price > 0.011358 )
							if( ad <= -4.51856e+07 )
								if( MFI_High <= -59.4007 )
									ret := -0.363636
								if( MFI_High > -59.4007 )
									ret := 0.500000
							if( ad > -4.51856e+07 )
								if( ad_mf <= -3.05756e+07 )
									ret := 0.538462
								if( ad_mf > -3.05756e+07 )
									ret := 0.261510
				if( ad_mf > -1.2451e+07 )
					if( Typical_Price <= 0.091093 )
						if( Negative_Money_Flow <= 1.3103e+06 )
							if( MFI_High <= -56.4017 )
								if( Typical_Price <= 0.045603 )
									ret := 0.119048
								if( Typical_Price > 0.045603 )
									ret := -0.315789
							if( MFI_High > -56.4017 )
								if( ad <= -1.16145e+07 )
									ret := 0.000000
								if( ad > -1.16145e+07 )
									ret := 0.769231 // buy
						if( Negative_Money_Flow > 1.3103e+06 )
							if( MFI_High <= -58.8625 )
								if( ad_mf <= -1.17625e+07 )
									ret := 0.916667 // buy
								if( ad_mf > -1.17625e+07 )
									ret := 0.650000
							if( MFI_High > -58.8625 )
								ret := -0.285714
					if( Typical_Price > 0.091093 )
						if( ad_mf <= -1.04346e+07 )
							if( Raw_Money_Flow <= 1.61086e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.61086e+06 )
								if( Negative_Money_Flow <= 2.19178e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 2.19178e+06 )
									ret := -0.733333 // sell
						if( ad_mf > -1.04346e+07 )
							if( mf <= -0.175755 )
								ret := 0.857143 // buy
							if( mf > -0.175755 )
								if( Negative_Money_Flow <= 2.76463e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow > 2.76463e+06 )
									ret := 0.000000
		if( MFI > 23.9617 )
			if( Negative_Money_Flow_Sum <= 3.72234e+07 )
				if( Money_Flow_Ratio <= 3.54578 )
					if( Raw_Money_Flow <= 1.17501e+07 )
						if( Negative_Money_Flow <= 5.59733e+06 )
							if( ad_mf <= -9.10569e+07 )
								if( Positive_Money_Flow_Sum <= 2.80677e+07 )
									ret := 0.620000
								if( Positive_Money_Flow_Sum > 2.80677e+07 )
									ret := -0.800000 // sell
							if( ad_mf > -9.10569e+07 )
								if( Typical_Price <= 0.187355 )
									ret := 0.143943
								if( Typical_Price > 0.187355 )
									ret := -0.483871
						if( Negative_Money_Flow > 5.59733e+06 )
							if( Positive_Money_Flow_Sum <= 6.27674e+07 )
								if( ad <= -1.7722e+08 )
									ret := -0.444444
								if( ad > -1.7722e+08 )
									ret := 0.487889
							if( Positive_Money_Flow_Sum > 6.27674e+07 )
								if( Positive_Money_Flow_Sum <= 7.96211e+07 )
									ret := -0.541667
								if( Positive_Money_Flow_Sum > 7.96211e+07 )
									ret := 0.500000
					if( Raw_Money_Flow > 1.17501e+07 )
						if( Negative_Money_Flow <= 1.22019e+07 )
							if( Negative_Money_Flow_Sum <= 3.16572e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.16572e+07 )
								ret := -0.750000 // sell
						if( Negative_Money_Flow > 1.22019e+07 )
							if( Typical_Price <= 0.089133 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.089133 )
								ret := -0.166667
				if( Money_Flow_Ratio > 3.54578 )
					if( Negative_Money_Flow_Sum <= 2.07496e+07 )
						if( Typical_Price <= 0.074954 )
							if( Typical_Price <= 0.025557 )
								if( ad_mf <= -1.04641e+07 )
									ret := 0.043478
								if( ad_mf > -1.04641e+07 )
									ret := 0.642857
							if( Typical_Price > 0.025557 )
								if( Money_Flow_Ratio <= 8.27789 )
									ret := -0.200000
								if( Money_Flow_Ratio > 8.27789 )
									ret := -0.777778 // sell
						if( Typical_Price > 0.074954 )
							if( Positive_Money_Flow_Sum <= 5.64305e+07 )
								if( ad_mf <= -3.04765e+07 )
									ret := 0.818182 // buy
								if( ad_mf > -3.04765e+07 )
									ret := 0.235849
							if( Positive_Money_Flow_Sum > 5.64305e+07 )
								if( Raw_Money_Flow <= 7.49543e+06 )
									ret := -0.707317 // sell
								if( Raw_Money_Flow > 7.49543e+06 )
									ret := 0.294118
					if( Negative_Money_Flow_Sum > 2.07496e+07 )
						if( ad <= -5.3397e+07 )
							ret := -0.250000
						if( ad > -5.3397e+07 )
							if( Typical_Price <= 0.143226 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.143226 )
								ret := -0.571429
			if( Negative_Money_Flow_Sum > 3.72234e+07 )
				if( Raw_Money_Flow <= 2.7211e+06 )
					if( Negative_Money_Flow_Sum <= 4.85402e+07 )
						if( Typical_Price <= 0.119257 )
							if( Positive_Money_Flow_Sum <= 4.8045e+07 )
								if( MFI_Low <= 10.8983 )
									ret := -0.692308
								if( MFI_Low > 10.8983 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.8045e+07 )
								ret := -0.500000
						if( Typical_Price > 0.119257 )
							ret := 0.166667
					if( Negative_Money_Flow_Sum > 4.85402e+07 )
						if( MFI_Low <= 12.5682 )
							ret := -0.250000
						if( MFI_Low > 12.5682 )
							ret := 0.500000
				if( Raw_Money_Flow > 2.7211e+06 )
					if( ad <= -8.6076e+07 )
						if( Raw_Money_Flow <= 3.0482e+07 )
							if( Money_Flow_Ratio <= 2.90027 )
								if( Negative_Money_Flow_Sum <= 1.79232e+08 )
									ret := 0.589928
								if( Negative_Money_Flow_Sum > 1.79232e+08 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 2.90027 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 3.0482e+07 )
							if( Typical_Price <= 0.193183 )
								if( mf <= 0.047274 )
									ret := 0.000000
								if( mf > 0.047274 )
									ret := -0.923077 // sell
							if( Typical_Price > 0.193183 )
								if( Typical_Price <= 0.234515 )
									ret := 0.750000 // buy
								if( Typical_Price > 0.234515 )
									ret := -0.529412
					if( ad > -8.6076e+07 )
						if( mf <= 0.215843 )
							if( Negative_Money_Flow <= 2.28746e+07 )
								if( Typical_Price <= 0.21656 )
									ret := 0.042802
								if( Typical_Price > 0.21656 )
									ret := -0.341176
							if( Negative_Money_Flow > 2.28746e+07 )
								if( Typical_Price <= 0.152364 )
									ret := -0.625000
								if( Typical_Price > 0.152364 )
									ret := 0.852941 // buy
						if( mf > 0.215843 )
							if( Negative_Money_Flow <= 1.09892e+07 )
								if( Typical_Price <= 0.084065 )
									ret := 0.250000
								if( Typical_Price > 0.084065 )
									ret := -0.825000 // sell
							if( Negative_Money_Flow > 1.09892e+07 )
								if( MFI_Low <= 40.7057 )
									ret := 1.000000 // buy
								if( MFI_Low > 40.7057 )
									ret := -0.200000
	if( ad_mf > -8.80394e+06 )
		if( Negative_Money_Flow <= 143683 )
			if( Positive_Money_Flow <= 3.7803e+06 )
				if( MFI_Low <= 6.64231 )
					if( Typical_Price <= 0.015206 )
						if( MFI_High <= -55.9337 )
							if( Negative_Money_Flow_Sum <= 1.24297e+06 )
								if( Negative_Money_Flow_Sum <= 1.07816e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.07816e+06 )
									ret := 0.875000 // buy
							if( Negative_Money_Flow_Sum > 1.24297e+06 )
								if( Positive_Money_Flow_Sum <= 418888 )
									ret := -0.466667
								if( Positive_Money_Flow_Sum > 418888 )
									ret := 0.013158
						if( MFI_High > -55.9337 )
							if( Positive_Money_Flow_Sum <= 1.72358e+06 )
								if( ad_mf <= -6.33162e+06 )
									ret := 0.750000 // buy
								if( ad_mf > -6.33162e+06 )
									ret := -0.340426
							if( Positive_Money_Flow_Sum > 1.72358e+06 )
								if( ad <= 2.60981e+07 )
									ret := -0.571429
								if( ad > 2.60981e+07 )
									ret := -1.000000 // sell
					if( Typical_Price > 0.015206 )
						if( Money_Flow_Ratio <= 0.363328 )
							if( ad <= 2.60743e+07 )
								if( ad <= 1.49671e+07 )
									ret := 0.072985
								if( ad > 1.49671e+07 )
									ret := 0.351145
							if( ad > 2.60743e+07 )
								if( Negative_Money_Flow_Sum <= 3.34585e+07 )
									ret := -0.490196
								if( Negative_Money_Flow_Sum > 3.34585e+07 )
									ret := 0.818182 // buy
						if( Money_Flow_Ratio > 0.363328 )
							if( Positive_Money_Flow_Sum <= 1.05156e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.05156e+06 )
								ret := 0.200000
				if( MFI_Low > 6.64231 )
					if( Typical_Price <= 0.022628 )
						if( Negative_Money_Flow_Sum <= 4.19554e+06 )
							if( Positive_Money_Flow_Sum <= 1.57442e+06 )
								if( Negative_Money_Flow_Sum <= 2.24016e+06 )
									ret := 0.024676
								if( Negative_Money_Flow_Sum > 2.24016e+06 )
									ret := -0.252874
							if( Positive_Money_Flow_Sum > 1.57442e+06 )
								if( mf <= 0.04738 )
									ret := 0.189490
								if( mf > 0.04738 )
									ret := 0.041373
						if( Negative_Money_Flow_Sum > 4.19554e+06 )
							if( Negative_Money_Flow_Sum <= 1.1299e+07 )
								if( Positive_Money_Flow_Sum <= 9.04039e+06 )
									ret := -0.152466
								if( Positive_Money_Flow_Sum > 9.04039e+06 )
									ret := -0.491935
							if( Negative_Money_Flow_Sum > 1.1299e+07 )
								if( Positive_Money_Flow_Sum <= 1.79383e+07 )
									ret := 0.493151
								if( Positive_Money_Flow_Sum > 1.79383e+07 )
									ret := -0.800000 // sell
					if( Typical_Price > 0.022628 )
						if( ad <= 1.42743e+07 )
							if( Raw_Money_Flow <= 134826 )
								if( Money_Flow_Ratio <= 1.60072 )
									ret := -0.081274
								if( Money_Flow_Ratio > 1.60072 )
									ret := 0.044111
							if( Raw_Money_Flow > 134826 )
								if( Typical_Price <= 0.048454 )
									ret := 0.019034
								if( Typical_Price > 0.048454 )
									ret := -0.042277
						if( ad > 1.42743e+07 )
							if( Positive_Money_Flow_Sum <= 1.36956e+07 )
								if( ad <= 2.91316e+07 )
									ret := 0.051466
								if( ad > 2.91316e+07 )
									ret := -0.171186
							if( Positive_Money_Flow_Sum > 1.36956e+07 )
								if( ad <= 3.77923e+07 )
									ret := 0.068314
								if( ad > 3.77923e+07 )
									ret := 0.437700
			if( Positive_Money_Flow > 3.7803e+06 )
				if( Negative_Money_Flow_Sum <= 8.75772e+07 )
					if( Negative_Money_Flow_Sum <= 2.4809e+07 )
						if( Typical_Price <= 0.046828 )
							if( MFI_High <= -15.6121 )
								if( mf <= 0.228497 )
									ret := -0.179487
								if( mf > 0.228497 )
									ret := 0.538462
							if( MFI_High > -15.6121 )
								if( ad_mf <= 3.3618e+07 )
									ret := 0.444444
								if( ad_mf > 3.3618e+07 )
									ret := -0.623529
						if( Typical_Price > 0.046828 )
							if( MFI <= 51.9077 )
								if( Raw_Money_Flow <= 4.61272e+06 )
									ret := 0.696970
								if( Raw_Money_Flow > 4.61272e+06 )
									ret := 0.153846
							if( MFI > 51.9077 )
								if( ad <= 1.51817e+08 )
									ret := 0.007743
								if( ad > 1.51817e+08 )
									ret := 0.545455
					if( Negative_Money_Flow_Sum > 2.4809e+07 )
						if( Positive_Money_Flow_Sum <= 1.34337e+08 )
							if( Positive_Money_Flow_Sum <= 8.10048e+07 )
								if( Typical_Price <= 0.03368 )
									ret := 0.823529 // buy
								if( Typical_Price > 0.03368 )
									ret := -0.212211
							if( Positive_Money_Flow_Sum > 8.10048e+07 )
								if( Raw_Money_Flow <= 9.32314e+06 )
									ret := 0.255319
								if( Raw_Money_Flow > 9.32314e+06 )
									ret := -0.300885
						if( Positive_Money_Flow_Sum > 1.34337e+08 )
							if( Positive_Money_Flow <= 3.92382e+07 )
								if( MFI_Low <= 55.8202 )
									ret := -0.926471 // sell
								if( MFI_Low > 55.8202 )
									ret := -0.181818
							if( Positive_Money_Flow > 3.92382e+07 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 8.75772e+07 )
					if( Typical_Price <= 0.181292 )
						if( MFI_High <= -21.5072 )
							if( ad_mf <= 1.8352e+08 )
								if( MFI_High <= -41.1633 )
									ret := 0.275229
								if( MFI_High > -41.1633 )
									ret := 0.642857
							if( ad_mf > 1.8352e+08 )
								ret := -1.000000 // sell
						if( MFI_High > -21.5072 )
							if( Positive_Money_Flow_Sum <= 1.64224e+08 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.64224e+08 )
								ret := -1.000000 // sell
					if( Typical_Price > 0.181292 )
						if( MFI_Low <= 8.90896 )
							if( ad_mf <= 4.6353e+07 )
								if( mf <= -0.053868 )
									ret := 0.250000
								if( mf > -0.053868 )
									ret := 1.000000 // buy
							if( ad_mf > 4.6353e+07 )
								if( mf <= 0.027081 )
									ret := 1.000000 // buy
								if( mf > 0.027081 )
									ret := -0.600000
						if( MFI_Low > 8.90896 )
							if( MFI_Low <= 16.3313 )
								if( ad_mf <= 9.34072e+07 )
									ret := -0.745098 // sell
								if( ad_mf > 9.34072e+07 )
									ret := 0.000000
							if( MFI_Low > 16.3313 )
								if( Negative_Money_Flow_Sum <= 1.00315e+08 )
									ret := -0.758621 // sell
								if( Negative_Money_Flow_Sum > 1.00315e+08 )
									ret := 0.164286
		if( Negative_Money_Flow > 143683 )
			if( Negative_Money_Flow_Sum <= 8.68169e+06 )
				if( Negative_Money_Flow_Sum <= 5.05115e+06 )
					if( ad <= 1.35143e+07 )
						if( Typical_Price <= 0.039162 )
							if( Raw_Money_Flow <= 471420 )
								if( ad_mf <= 0.138037 )
									ret := 0.107696
								if( ad_mf > 0.138037 )
									ret := 0.031436
							if( Raw_Money_Flow > 471420 )
								if( ad <= -4.57208e+06 )
									ret := -0.034483
								if( ad > -4.57208e+06 )
									ret := 0.326568
						if( Typical_Price > 0.039162 )
							if( Negative_Money_Flow_Sum <= 4.18804e+06 )
								if( ad <= -6.09882e+06 )
									ret := -0.337884
								if( ad > -6.09882e+06 )
									ret := 0.008913
							if( Negative_Money_Flow_Sum > 4.18804e+06 )
								if( ad_mf <= -8.31332e+06 )
									ret := -0.541667
								if( ad_mf > -8.31332e+06 )
									ret := 0.241135
					if( ad > 1.35143e+07 )
						if( Raw_Money_Flow <= 363478 )
							if( mf <= -0.162153 )
								if( Negative_Money_Flow <= 273115 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 273115 )
									ret := 0.750000 // buy
							if( mf > -0.162153 )
								if( Typical_Price <= 0.011355 )
									ret := -0.636364
								if( Typical_Price > 0.011355 )
									ret := -0.150000
						if( Raw_Money_Flow > 363478 )
							if( ad <= 2.03998e+07 )
								if( MFI_High <= -61.8333 )
									ret := -0.428571
								if( MFI_High > -61.8333 )
									ret := 0.662698
							if( ad > 2.03998e+07 )
								if( Positive_Money_Flow <= 47003.5 )
									ret := -0.014706
								if( Positive_Money_Flow > 47003.5 )
									ret := 0.362832
				if( Negative_Money_Flow_Sum > 5.05115e+06 )
					if( Negative_Money_Flow_Sum <= 6.58331e+06 )
						if( Money_Flow_Ratio <= 2.11438 )
							if( Positive_Money_Flow <= 749144 )
								if( ad_mf <= 3.2586e+06 )
									ret := -0.038752
								if( ad_mf > 3.2586e+06 )
									ret := -0.274000
							if( Positive_Money_Flow > 749144 )
								if( Typical_Price <= 0.023442 )
									ret := 0.500000
								if( Typical_Price > 0.023442 )
									ret := 1.000000 // buy
						if( Money_Flow_Ratio > 2.11438 )
							if( Positive_Money_Flow_Sum <= 1.52361e+07 )
								if( Typical_Price <= 0.067507 )
									ret := 0.790698 // buy
								if( Typical_Price > 0.067507 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.52361e+07 )
								if( mf <= 0.142005 )
									ret := -0.666667
								if( mf > 0.142005 )
									ret := 0.250000
					if( Negative_Money_Flow_Sum > 6.58331e+06 )
						if( Positive_Money_Flow_Sum <= 2.30631e+07 )
							if( mf <= 0.12615 )
								if( Negative_Money_Flow_Sum <= 7.81518e+06 )
									ret := 0.200511
								if( Negative_Money_Flow_Sum > 7.81518e+06 )
									ret := -0.006250
							if( mf > 0.12615 )
								if( ad <= 1.31402e+06 )
									ret := -0.308824
								if( ad > 1.31402e+06 )
									ret := 0.142857
						if( Positive_Money_Flow_Sum > 2.30631e+07 )
							if( ad <= -4.37213e+06 )
								ret := 0.166667
							if( ad > -4.37213e+06 )
								if( Negative_Money_Flow_Sum <= 8.37686e+06 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 8.37686e+06 )
									ret := -0.285714
			if( Negative_Money_Flow_Sum > 8.68169e+06 )
				if( Typical_Price <= 0.217922 )
					if( Negative_Money_Flow_Sum <= 1.34502e+08 )
						if( ad_mf <= 665258 )
							if( ad <= -8.57139e+06 )
								if( Negative_Money_Flow_Sum <= 9.82017e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 9.82017e+06 )
									ret := -0.045455
							if( ad > -8.57139e+06 )
								if( mf <= 0.243746 )
									ret := 0.202390
								if( mf > 0.243746 )
									ret := 0.702703 // buy
						if( ad_mf > 665258 )
							if( Typical_Price <= 0.078405 )
								if( ad <= 3.13708e+06 )
									ret := -0.263158
								if( ad > 3.13708e+06 )
									ret := 0.234154
							if( Typical_Price > 0.078405 )
								if( MFI <= 40.4754 )
									ret := -0.144944
								if( MFI > 40.4754 )
									ret := 0.121676
					if( Negative_Money_Flow_Sum > 1.34502e+08 )
						if( Negative_Money_Flow_Sum <= 2.57051e+08 )
							if( ad_mf <= 6.92183e+07 )
								if( Typical_Price <= 0.140106 )
									ret := 0.200000
								if( Typical_Price > 0.140106 )
									ret := 0.903226 // buy
							if( ad_mf > 6.92183e+07 )
								if( Typical_Price <= 0.15191 )
									ret := 0.722222 // buy
								if( Typical_Price > 0.15191 )
									ret := -0.307692
						if( Negative_Money_Flow_Sum > 2.57051e+08 )
							if( Positive_Money_Flow_Sum <= 2.3838e+08 )
								ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 2.3838e+08 )
								ret := -1.000000 // sell
				if( Typical_Price > 0.217922 )
					if( Positive_Money_Flow_Sum <= 2.61301e+08 )
						if( ad <= 2.79833e+06 )
							if( Negative_Money_Flow_Sum <= 1.04785e+08 )
								if( Raw_Money_Flow <= 7.47926e+06 )
									ret := -0.142857
								if( Raw_Money_Flow > 7.47926e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.04785e+08 )
								if( Negative_Money_Flow_Sum <= 1.76877e+08 )
									ret := 0.653846
								if( Negative_Money_Flow_Sum > 1.76877e+08 )
									ret := -0.833333 // sell
						if( ad > 2.79833e+06 )
							if( Negative_Money_Flow_Sum <= 1.49905e+08 )
								if( Raw_Money_Flow <= 1.28142e+07 )
									ret := -0.685714
								if( Raw_Money_Flow > 1.28142e+07 )
									ret := -0.055556
							if( Negative_Money_Flow_Sum > 1.49905e+08 )
								if( MFI_High <= -46.5193 )
									ret := -0.250000
								if( MFI_High > -46.5193 )
									ret := -0.969697 // sell
					if( Positive_Money_Flow_Sum > 2.61301e+08 )
						if( Typical_Price <= 0.245073 )
							if( Negative_Money_Flow <= 2.6304e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 2.6304e+07 )
								ret := 0.250000
						if( Typical_Price > 0.245073 )
							ret := -0.250000
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_050d094f(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


