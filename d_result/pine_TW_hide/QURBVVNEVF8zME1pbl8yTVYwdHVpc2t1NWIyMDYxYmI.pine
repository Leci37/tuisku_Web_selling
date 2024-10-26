//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: ADAUSDT_30Min_2MV0_5b2061bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2MV0_5b2061bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_5b2061bb(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 7.40458e+06 )
		if( Positive_Money_Flow_Sum <= 2.4695e+07 )
			if( Negative_Money_Flow_Sum <= 1.77486e+07 )
				if( Positive_Money_Flow_Sum <= 1.83327e+06 )
					if( Positive_Money_Flow_Sum <= 1.82698e+06 )
						if( Negative_Money_Flow_Sum <= 7.68717e+06 )
							if( Raw_Money_Flow <= 624225 )
								if( MFI <= 40.0962 )
									ret := -0.045272
								if( MFI > 40.0962 )
									ret := 0.016939
							if( Raw_Money_Flow > 624225 )
								if( Typical_Price <= 0.103152 )
									ret := -0.515152
								if( Typical_Price > 0.103152 )
									ret := -0.174825
						if( Negative_Money_Flow_Sum > 7.68717e+06 )
							if( Typical_Price <= 0.359408 )
								if( VIP_VIM <= -0.510884 )
									ret := 0.407643
								if( VIP_VIM > -0.510884 )
									ret := 0.000000
							if( Typical_Price > 0.359408 )
								if( Raw_Money_Flow <= 744638 )
									ret := 0.184211
								if( Raw_Money_Flow > 744638 )
									ret := -0.336957
					if( Positive_Money_Flow_Sum > 1.82698e+06 )
						if( Raw_Money_Flow <= 243553 )
							if( VIP <= 1.00012 )
								ret := 0.250000
							if( VIP > 1.00012 )
								ret := 0.000000
						if( Raw_Money_Flow > 243553 )
							if( Negative_Money_Flow <= 891353 )
								if( Positive_Money_Flow <= 257303 )
									ret := -0.947368 // sell
								if( Positive_Money_Flow > 257303 )
									ret := -0.571429
							if( Negative_Money_Flow > 891353 )
								ret := -0.333333
				if( Positive_Money_Flow_Sum > 1.83327e+06 )
					if( Typical_Price <= 0.384508 )
						if( Raw_Money_Flow <= 448738 )
							if( Money_Flow_Ratio <= 0.492827 )
								if( Negative_Money_Flow_Sum <= 7.50633e+06 )
									ret := -0.198198
								if( Negative_Money_Flow_Sum > 7.50633e+06 )
									ret := 0.089796
							if( Money_Flow_Ratio > 0.492827 )
								if( Typical_Price <= 0.243291 )
									ret := 0.122411
								if( Typical_Price > 0.243291 )
									ret := 0.026578
						if( Raw_Money_Flow > 448738 )
							if( MFI <= 34.1917 )
								if( Negative_Money_Flow_Sum <= 1.34101e+07 )
									ret := 0.230991
								if( Negative_Money_Flow_Sum > 1.34101e+07 )
									ret := -0.005848
							if( MFI > 34.1917 )
								if( Negative_Money_Flow <= 4.69762e+06 )
									ret := 0.074311
								if( Negative_Money_Flow > 4.69762e+06 )
									ret := 0.609756
					if( Typical_Price > 0.384508 )
						if( MFI <= 17.2779 )
							if( Positive_Money_Flow_Sum <= 2.55746e+06 )
								if( Negative_Money_Flow <= 1.54056e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.54056e+06 )
									ret := -0.363636
							if( Positive_Money_Flow_Sum > 2.55746e+06 )
								if( Negative_Money_Flow_Sum <= 1.47381e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.47381e+07 )
									ret := 0.674419
						if( MFI > 17.2779 )
							if( Negative_Money_Flow_Sum <= 3.29508e+06 )
								if( Positive_Money_Flow <= 561528 )
									ret := 0.018560
								if( Positive_Money_Flow > 561528 )
									ret := 0.222595
							if( Negative_Money_Flow_Sum > 3.29508e+06 )
								if( Negative_Money_Flow_Sum <= 5.94086e+06 )
									ret := -0.050633
								if( Negative_Money_Flow_Sum > 5.94086e+06 )
									ret := 0.018264
			if( Negative_Money_Flow_Sum > 1.77486e+07 )
				if( Typical_Price <= 0.486552 )
					if( VIP <= 0.912815 )
						if( Positive_Money_Flow <= 49034.9 )
							if( Positive_Money_Flow_Sum <= 1.80139e+07 )
								if( VIM <= 1.34093 )
									ret := 0.349515
								if( VIM > 1.34093 )
									ret := -0.029412
							if( Positive_Money_Flow_Sum > 1.80139e+07 )
								if( Negative_Money_Flow_Sum <= 4.71444e+07 )
									ret := -0.130435
								if( Negative_Money_Flow_Sum > 4.71444e+07 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow > 49034.9 )
							if( Positive_Money_Flow_Sum <= 5.82276e+06 )
								if( Typical_Price <= 0.3416 )
									ret := -0.745763 // sell
								if( Typical_Price > 0.3416 )
									ret := 0.014286
							if( Positive_Money_Flow_Sum > 5.82276e+06 )
								if( MFI <= 19.8408 )
									ret := 0.426829
								if( MFI > 19.8408 )
									ret := 0.054264
					if( VIP > 0.912815 )
						if( VIP_VIM <= 0.164623 )
							if( Typical_Price <= 0.308342 )
								if( Positive_Money_Flow <= 1.6812e+06 )
									ret := 0.719178 // buy
								if( Positive_Money_Flow > 1.6812e+06 )
									ret := 0.413043
							if( Typical_Price > 0.308342 )
								if( Positive_Money_Flow_Sum <= 1.74824e+07 )
									ret := 0.457792
								if( Positive_Money_Flow_Sum > 1.74824e+07 )
									ret := 0.190283
						if( VIP_VIM > 0.164623 )
							if( Positive_Money_Flow <= 2.1029e+06 )
								if( Positive_Money_Flow <= 1.52572e+06 )
									ret := -0.176471
								if( Positive_Money_Flow > 1.52572e+06 )
									ret := -0.923077 // sell
							if( Positive_Money_Flow > 2.1029e+06 )
								if( Positive_Money_Flow_Sum <= 2.06632e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.06632e+07 )
									ret := 0.000000
				if( Typical_Price > 0.486552 )
					if( Typical_Price <= 1.24638 )
						if( Negative_Money_Flow_Sum <= 2.61024e+07 )
							if( VIP <= 1.04537 )
								if( Positive_Money_Flow <= 1.92007e+06 )
									ret := 0.040773
								if( Positive_Money_Flow > 1.92007e+06 )
									ret := -0.129310
							if( VIP > 1.04537 )
								if( Positive_Money_Flow <= 1.56155e+06 )
									ret := 0.440252
								if( Positive_Money_Flow > 1.56155e+06 )
									ret := 0.011765
						if( Negative_Money_Flow_Sum > 2.61024e+07 )
							if( VIM <= 1.30212 )
								if( Positive_Money_Flow <= 205270 )
									ret := 0.276923
								if( Positive_Money_Flow > 205270 )
									ret := 0.121818
							if( VIM > 1.30212 )
								if( Negative_Money_Flow <= 1.49748e+06 )
									ret := -0.325581
								if( Negative_Money_Flow > 1.49748e+06 )
									ret := 0.007246
					if( Typical_Price > 1.24638 )
						if( Negative_Money_Flow <= 6.18832e+06 )
							if( Money_Flow_Ratio <= 0.620399 )
								if( Negative_Money_Flow_Sum <= 3.6339e+07 )
									ret := -0.288256
								if( Negative_Money_Flow_Sum > 3.6339e+07 )
									ret := -0.021201
							if( Money_Flow_Ratio > 0.620399 )
								if( MFI_Low <= 33.8001 )
									ret := 0.113095
								if( MFI_Low > 33.8001 )
									ret := -0.545455
						if( Negative_Money_Flow > 6.18832e+06 )
							if( Negative_Money_Flow <= 7.19318e+06 )
								if( Typical_Price <= 1.30702 )
									ret := -0.400000
								if( Typical_Price > 1.30702 )
									ret := 0.454545
							if( Negative_Money_Flow > 7.19318e+06 )
								ret := -0.571429
		if( Positive_Money_Flow_Sum > 2.4695e+07 )
			if( MFI <= 83.4067 )
				if( Typical_Price <= 1.33169 )
					if( MFI_Low <= 7.6189 )
						if( Typical_Price <= 0.600295 )
							if( Positive_Money_Flow_Sum <= 3.17362e+07 )
								if( VIP_VIM <= -0.268489 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.268489 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 3.17362e+07 )
								if( MFI_Low <= 5.79813 )
									ret := -0.750000 // sell
								if( MFI_Low > 5.79813 )
									ret := -0.250000
						if( Typical_Price > 0.600295 )
							if( VIP <= 0.809167 )
								if( VIM <= 1.31295 )
									ret := -0.625000
								if( VIM > 1.31295 )
									ret := 0.166667
							if( VIP > 0.809167 )
								if( Money_Flow_Ratio <= 0.372374 )
									ret := -0.026316
								if( Money_Flow_Ratio > 0.372374 )
									ret := -0.857143 // sell
					if( MFI_Low > 7.6189 )
						if( Negative_Money_Flow_Sum <= 2.74662e+08 )
							if( Negative_Money_Flow_Sum <= 2.48757e+08 )
								if( Raw_Money_Flow <= 1.4715e+06 )
									ret := -0.201987
								if( Raw_Money_Flow > 1.4715e+06 )
									ret := 0.044274
							if( Negative_Money_Flow_Sum > 2.48757e+08 )
								if( Money_Flow_Ratio <= 1.08113 )
									ret := -0.458333
								if( Money_Flow_Ratio > 1.08113 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.74662e+08 )
							if( VIP <= 0.916772 )
								if( MFI <= 31.765 )
									ret := 0.736842 // buy
								if( MFI > 31.765 )
									ret := -0.285714
							if( VIP > 0.916772 )
								if( VIP_VIM <= 0.084992 )
									ret := 0.840000 // buy
								if( VIP_VIM > 0.084992 )
									ret := 0.100000
				if( Typical_Price > 1.33169 )
					if( Raw_Money_Flow <= 7.90179e+06 )
						if( MFI <= 18.587 )
							ret := -1.000000 // sell
						if( MFI > 18.587 )
							if( Negative_Money_Flow_Sum <= 3.77e+07 )
								if( Positive_Money_Flow_Sum <= 6.72142e+07 )
									ret := -0.012195
								if( Positive_Money_Flow_Sum > 6.72142e+07 )
									ret := -0.408163
							if( Negative_Money_Flow_Sum > 3.77e+07 )
								if( Negative_Money_Flow_Sum <= 6.88798e+07 )
									ret := -0.230083
								if( Negative_Money_Flow_Sum > 6.88798e+07 )
									ret := -0.026814
					if( Raw_Money_Flow > 7.90179e+06 )
						if( Positive_Money_Flow_Sum <= 1.23896e+08 )
							if( Negative_Money_Flow_Sum <= 1.99965e+08 )
								if( Negative_Money_Flow_Sum <= 4.29817e+07 )
									ret := -0.214286
								if( Negative_Money_Flow_Sum > 4.29817e+07 )
									ret := 0.037094
							if( Negative_Money_Flow_Sum > 1.99965e+08 )
								if( Positive_Money_Flow <= 6.9704e+06 )
									ret := 0.833333 // buy
								if( Positive_Money_Flow > 6.9704e+06 )
									ret := -0.626984
						if( Positive_Money_Flow_Sum > 1.23896e+08 )
							if( Raw_Money_Flow <= 2.02422e+07 )
								if( MFI <= 42.0074 )
									ret := -0.563636
								if( MFI > 42.0074 )
									ret := 0.303430
							if( Raw_Money_Flow > 2.02422e+07 )
								if( Money_Flow_Ratio <= 0.459832 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.459832 )
									ret := -0.009992
			if( MFI > 83.4067 )
				if( Money_Flow_Ratio <= 17.6602 )
					if( Negative_Money_Flow <= 1.19272e+06 )
						if( VIM <= 0.739922 )
							if( VIP_VIM <= 0.715271 )
								if( Typical_Price <= 0.491494 )
									ret := 0.284091
								if( Typical_Price > 0.491494 )
									ret := -0.210938
							if( VIP_VIM > 0.715271 )
								if( Negative_Money_Flow_Sum <= 6.95848e+06 )
									ret := -0.236842
								if( Negative_Money_Flow_Sum > 6.95848e+06 )
									ret := -0.570093
						if( VIM > 0.739922 )
							if( VIM <= 0.854839 )
								if( VIP_VIM <= 0.510363 )
									ret := -0.635514
								if( VIP_VIM > 0.510363 )
									ret := -0.200000
							if( VIM > 0.854839 )
								if( VIP <= 1.21447 )
									ret := -0.375000
								if( VIP > 1.21447 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow > 1.19272e+06 )
						if( Positive_Money_Flow_Sum <= 2.90383e+07 )
							if( Typical_Price <= 0.34493 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.34493 )
								if( VIM <= 0.689499 )
									ret := 0.000000
								if( VIM > 0.689499 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 2.90383e+07 )
							if( Positive_Money_Flow_Sum <= 9.50139e+07 )
								if( VIM <= 0.814356 )
									ret := 0.431034
								if( VIM > 0.814356 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 9.50139e+07 )
								if( Positive_Money_Flow_Sum <= 1.25356e+08 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 1.25356e+08 )
									ret := 0.142857
				if( Money_Flow_Ratio > 17.6602 )
					if( Raw_Money_Flow <= 2.1128e+07 )
						if( Positive_Money_Flow_Sum <= 1.19336e+08 )
							if( Positive_Money_Flow_Sum <= 5.25579e+07 )
								if( Positive_Money_Flow_Sum <= 3.27484e+07 )
									ret := 0.357143
								if( Positive_Money_Flow_Sum > 3.27484e+07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.25579e+07 )
								if( VIM <= 0.541674 )
									ret := -0.750000 // sell
								if( VIM > 0.541674 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.19336e+08 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 2.1128e+07 )
						if( Typical_Price <= 1.6955 )
							if( VIP <= 1.3604 )
								ret := -0.750000 // sell
							if( VIP > 1.3604 )
								ret := -1.000000 // sell
						if( Typical_Price > 1.6955 )
							if( Positive_Money_Flow <= 1.07144e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.07144e+08 )
								ret := -0.500000
	if( Negative_Money_Flow > 7.40458e+06 )
		if( Money_Flow_Ratio <= 0.477801 )
			if( Raw_Money_Flow <= 1.53261e+07 )
				if( Typical_Price <= 0.454367 )
					if( VIP_VIM <= -0.731047 )
						ret := -0.571429
					if( VIP_VIM > -0.731047 )
						if( VIM <= 1.0662 )
							if( Negative_Money_Flow_Sum <= 1.96519e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.96519e+07 )
								ret := 0.400000
						if( VIM > 1.0662 )
							if( Raw_Money_Flow <= 7.61582e+06 )
								ret := 0.000000
							if( Raw_Money_Flow > 7.61582e+06 )
								if( VIM <= 1.14184 )
									ret := 0.954545 // buy
								if( VIM > 1.14184 )
									ret := 0.777778 // buy
				if( Typical_Price > 0.454367 )
					if( VIM <= 1.29245 )
						if( MFI <= 25.9098 )
							if( MFI_Low <= -6.28965 )
								if( VIP_VIM <= -0.58307 )
									ret := -0.125000
								if( VIP_VIM > -0.58307 )
									ret := 0.580645
							if( MFI_Low > -6.28965 )
								if( Positive_Money_Flow_Sum <= 1.72777e+07 )
									ret := -0.382550
								if( Positive_Money_Flow_Sum > 1.72777e+07 )
									ret := 0.034483
						if( MFI > 25.9098 )
							if( Typical_Price <= 1.81048 )
								if( VIM <= 1.08379 )
									ret := -0.511628
								if( VIM > 1.08379 )
									ret := 0.172297
							if( Typical_Price > 1.81048 )
								if( VIP <= 0.949344 )
									ret := 0.489583
								if( VIP > 0.949344 )
									ret := -0.100000
					if( VIM > 1.29245 )
						if( Negative_Money_Flow_Sum <= 5.45551e+07 )
							if( MFI <= 13.5607 )
								if( MFI <= 11.2126 )
									ret := 0.000000
								if( MFI > 11.2126 )
									ret := -1.000000 // sell
							if( MFI > 13.5607 )
								ret := 0.333333
						if( Negative_Money_Flow_Sum > 5.45551e+07 )
							if( VIP <= 0.672432 )
								if( VIP <= 0.546376 )
									ret := -0.250000
								if( VIP > 0.546376 )
									ret := 0.807018 // buy
							if( VIP > 0.672432 )
								if( Raw_Money_Flow <= 9.44953e+06 )
									ret := 0.611111
								if( Raw_Money_Flow > 9.44953e+06 )
									ret := -0.142857
			if( Raw_Money_Flow > 1.53261e+07 )
				if( VIP <= 0.909342 )
					if( Negative_Money_Flow_Sum <= 3.77932e+08 )
						if( Positive_Money_Flow_Sum <= 2.13007e+07 )
							if( Typical_Price <= 1.10706 )
								if( Negative_Money_Flow_Sum <= 4.49713e+07 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 4.49713e+07 )
									ret := 0.680000
							if( Typical_Price > 1.10706 )
								if( MFI_High <= -64.6002 )
									ret := 0.285714
								if( MFI_High > -64.6002 )
									ret := -0.650000
						if( Positive_Money_Flow_Sum > 2.13007e+07 )
							if( VIM <= 1.05346 )
								if( Negative_Money_Flow <= 3.36455e+07 )
									ret := 0.500000
								if( Negative_Money_Flow > 3.36455e+07 )
									ret := -0.875000 // sell
							if( VIM > 1.05346 )
								if( VIM <= 1.3375 )
									ret := 0.557284
								if( VIM > 1.3375 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.77932e+08 )
						if( Raw_Money_Flow <= 4.83984e+07 )
							if( VIP <= 0.795613 )
								if( Negative_Money_Flow_Sum <= 4.02723e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.02723e+08 )
									ret := -0.950000 // sell
							if( VIP > 0.795613 )
								if( MFI_High <= -51.1551 )
									ret := 0.466667
								if( MFI_High > -51.1551 )
									ret := -0.833333 // sell
						if( Raw_Money_Flow > 4.83984e+07 )
							if( Negative_Money_Flow_Sum <= 4.46387e+08 )
								if( Positive_Money_Flow_Sum <= 1.25289e+08 )
									ret := 0.285714
								if( Positive_Money_Flow_Sum > 1.25289e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.46387e+08 )
								if( Typical_Price <= 2.08631 )
									ret := 0.814815 // buy
								if( Typical_Price > 2.08631 )
									ret := 0.000000
				if( VIP > 0.909342 )
					if( VIM <= 1.09317 )
						if( Negative_Money_Flow_Sum <= 2.04927e+08 )
							ret := -0.400000
						if( Negative_Money_Flow_Sum > 2.04927e+08 )
							ret := 0.800000 // buy
					if( VIM > 1.09317 )
						if( VIP <= 0.931334 )
							if( VIP <= 0.91584 )
								ret := -0.833333 // sell
							if( VIP > 0.91584 )
								ret := -0.250000
						if( VIP > 0.931334 )
							ret := -1.000000 // sell
		if( Money_Flow_Ratio > 0.477801 )
			if( VIP_VIM <= 0.012047 )
				if( Typical_Price <= 1.12815 )
					if( MFI <= 50.9708 )
						if( Negative_Money_Flow_Sum <= 2.88322e+08 )
							if( Positive_Money_Flow_Sum <= 2.85239e+07 )
								if( Negative_Money_Flow_Sum <= 4.35261e+07 )
									ret := 0.232558
								if( Negative_Money_Flow_Sum > 4.35261e+07 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 2.85239e+07 )
								if( Positive_Money_Flow_Sum <= 1.50084e+08 )
									ret := 0.410314
								if( Positive_Money_Flow_Sum > 1.50084e+08 )
									ret := -0.296296
						if( Negative_Money_Flow_Sum > 2.88322e+08 )
							if( Money_Flow_Ratio <= 0.882523 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.882523 )
								ret := 0.500000
					if( MFI > 50.9708 )
						if( Negative_Money_Flow_Sum <= 5.94544e+07 )
							if( MFI_Low <= 35.8559 )
								if( Positive_Money_Flow_Sum <= 5.34211e+07 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 5.34211e+07 )
									ret := -0.772727 // sell
							if( MFI_Low > 35.8559 )
								ret := 0.200000
						if( Negative_Money_Flow_Sum > 5.94544e+07 )
							if( Positive_Money_Flow_Sum <= 9.66588e+07 )
								if( VIP_VIM <= -0.021989 )
									ret := 0.888889 // buy
								if( VIP_VIM > -0.021989 )
									ret := 0.200000
							if( Positive_Money_Flow_Sum > 9.66588e+07 )
								if( VIP <= 0.959883 )
									ret := 0.600000
								if( VIP > 0.959883 )
									ret := -0.571429
				if( Typical_Price > 1.12815 )
					if( Negative_Money_Flow_Sum <= 3.09506e+08 )
						if( Negative_Money_Flow_Sum <= 2.25712e+08 )
							if( Positive_Money_Flow_Sum <= 8.39353e+07 )
								if( MFI_Low <= 27.8565 )
									ret := 0.122310
								if( MFI_Low > 27.8565 )
									ret := -0.243902
							if( Positive_Money_Flow_Sum > 8.39353e+07 )
								if( Positive_Money_Flow_Sum <= 1.27996e+08 )
									ret := -0.201942
								if( Positive_Money_Flow_Sum > 1.27996e+08 )
									ret := 0.158470
						if( Negative_Money_Flow_Sum > 2.25712e+08 )
							if( VIM <= 1.0935 )
								if( MFI_Low <= 17.2819 )
									ret := -0.652174
								if( MFI_Low > 17.2819 )
									ret := 0.263158
							if( VIM > 1.0935 )
								if( MFI_High <= -46.2706 )
									ret := 0.142857
								if( MFI_High > -46.2706 )
									ret := 0.804878 // buy
					if( Negative_Money_Flow_Sum > 3.09506e+08 )
						if( Typical_Price <= 1.27412 )
							if( Positive_Money_Flow <= 30296.7 )
								if( Typical_Price <= 1.16083 )
									ret := 1.000000 // buy
								if( Typical_Price > 1.16083 )
									ret := -0.066667
							if( Positive_Money_Flow > 30296.7 )
								ret := 1.000000 // buy
						if( Typical_Price > 1.27412 )
							if( Money_Flow_Ratio <= 0.940141 )
								if( Negative_Money_Flow_Sum <= 7.52915e+08 )
									ret := -0.686667
								if( Negative_Money_Flow_Sum > 7.52915e+08 )
									ret := 0.800000 // buy
							if( Money_Flow_Ratio > 0.940141 )
								if( Negative_Money_Flow <= 2.89659e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.89659e+07 )
									ret := 0.941176 // buy
			if( VIP_VIM > 0.012047 )
				if( Negative_Money_Flow_Sum <= 5.38221e+08 )
					if( Typical_Price <= 1.12939 )
						if( Positive_Money_Flow_Sum <= 1.56699e+08 )
							if( Positive_Money_Flow_Sum <= 1.13958e+08 )
								if( MFI <= 51.9841 )
									ret := 0.661765
								if( MFI > 51.9841 )
									ret := 0.226866
							if( Positive_Money_Flow_Sum > 1.13958e+08 )
								if( Raw_Money_Flow <= 9.54264e+06 )
									ret := 0.270270
								if( Raw_Money_Flow > 9.54264e+06 )
									ret := 0.810345 // buy
						if( Positive_Money_Flow_Sum > 1.56699e+08 )
							if( VIP_VIM <= 0.524224 )
								if( Negative_Money_Flow_Sum <= 9.82883e+07 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 9.82883e+07 )
									ret := 0.291339
							if( VIP_VIM > 0.524224 )
								if( Positive_Money_Flow_Sum <= 2.35919e+08 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow_Sum > 2.35919e+08 )
									ret := -0.400000
					if( Typical_Price > 1.12939 )
						if( Negative_Money_Flow_Sum <= 3.64445e+08 )
							if( Money_Flow_Ratio <= 0.70522 )
								if( Negative_Money_Flow_Sum <= 1.89259e+08 )
									ret := 0.739130 // buy
								if( Negative_Money_Flow_Sum > 1.89259e+08 )
									ret := -0.083333
							if( Money_Flow_Ratio > 0.70522 )
								if( VIM <= 0.582993 )
									ret := -0.687500
								if( VIM > 0.582993 )
									ret := 0.122898
						if( Negative_Money_Flow_Sum > 3.64445e+08 )
							if( Money_Flow_Ratio <= 1.33709 )
								if( Negative_Money_Flow_Sum <= 4.61012e+08 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 4.61012e+08 )
									ret := -0.500000
							if( Money_Flow_Ratio > 1.33709 )
								if( Positive_Money_Flow <= 1.59637e+07 )
									ret := 0.969697 // buy
								if( Positive_Money_Flow > 1.59637e+07 )
									ret := 0.142857
				if( Negative_Money_Flow_Sum > 5.38221e+08 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ADAUSDT_30Min_5b2061bb(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


