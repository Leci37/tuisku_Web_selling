//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AAPL_30Min_2MT0_59287a7d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_2MT0_59287a7d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_59287a7d(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 5.88903e+07 )
		if( Negative_Money_Flow_Sum <= 2.72665e+07 )
			if( ema3 <= 128.597 )
				if( MFI_Low <= -7.14546 )
					if( Negative_Money_Flow_Sum <= 1.28662e+07 )
						if( Raw_Money_Flow <= 2.71459e+06 )
							ret := 0.750000 // buy
						if( Raw_Money_Flow > 2.71459e+06 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.28662e+07 )
						if( ema12 <= -0.257917 )
							ret := 0.750000 // buy
						if( ema12 > -0.257917 )
							if( ema2 <= 99.2676 )
								ret := 0.250000
							if( ema2 > 99.2676 )
								ret := -0.142857
				if( MFI_Low > -7.14546 )
					if( Money_Flow_Ratio <= 413.947 )
						if( Negative_Money_Flow_Sum <= 1.52032e+07 )
							if( Negative_Money_Flow_Sum <= 1.09997e+07 )
								if( ema2 <= 93.5175 )
									ret := -0.687500
								if( ema2 > 93.5175 )
									ret := 0.013889
							if( Negative_Money_Flow_Sum > 1.09997e+07 )
								if( Negative_Money_Flow <= 9.38584e+06 )
									ret := -0.261062
								if( Negative_Money_Flow > 9.38584e+06 )
									ret := -0.928571 // sell
						if( Negative_Money_Flow_Sum > 1.52032e+07 )
							if( Positive_Money_Flow <= 7.2579e+06 )
								if( Positive_Money_Flow <= 5.83746e+06 )
									ret := 0.303030
								if( Positive_Money_Flow > 5.83746e+06 )
									ret := 0.947368 // buy
							if( Positive_Money_Flow > 7.2579e+06 )
								if( Positive_Money_Flow_Sum <= 3.55479e+07 )
									ret := -0.640000
								if( Positive_Money_Flow_Sum > 3.55479e+07 )
									ret := 0.071006
					if( Money_Flow_Ratio > 413.947 )
						if( Negative_Money_Flow_Sum <= 4.71372e+06 )
							if( ema13 <= 0.335304 )
								if( Raw_Money_Flow <= 1.31241e+06 )
									ret := -0.193548
								if( Raw_Money_Flow > 1.31241e+06 )
									ret := -0.772727 // sell
							if( ema13 > 0.335304 )
								if( Positive_Money_Flow_Sum <= 6.96918e+08 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 6.96918e+08 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 4.71372e+06 )
							ret := -1.000000 // sell
			if( ema3 > 128.597 )
				if( ema12 <= -0.065002 )
					if( MFI_High <= -36.6959 )
						if( ema1 <= 177.472 )
							if( Positive_Money_Flow_Sum <= 1.03831e+07 )
								if( Negative_Money_Flow <= 234113 )
									ret := 0.571429
								if( Negative_Money_Flow > 234113 )
									ret := -0.245283
							if( Positive_Money_Flow_Sum > 1.03831e+07 )
								if( Negative_Money_Flow_Sum <= 2.26642e+07 )
									ret := -0.130435
								if( Negative_Money_Flow_Sum > 2.26642e+07 )
									ret := -0.766667 // sell
						if( ema1 > 177.472 )
							if( Positive_Money_Flow_Sum <= 1.55405e+07 )
								if( Negative_Money_Flow <= 1.04483e+07 )
									ret := 0.517241
								if( Negative_Money_Flow > 1.04483e+07 )
									ret := -0.222222
							if( Positive_Money_Flow_Sum > 1.55405e+07 )
								if( MFI <= 41.9716 )
									ret := -0.750000 // sell
								if( MFI > 41.9716 )
									ret := -1.000000 // sell
					if( MFI_High > -36.6959 )
						if( Raw_Money_Flow <= 5.1048e+07 )
							if( ema3 <= 193.274 )
								if( MFI <= 99.0868 )
									ret := 0.322761
								if( MFI > 99.0868 )
									ret := 0.013514
							if( ema3 > 193.274 )
								if( MFI <= 99.105 )
									ret := 0.397260
								if( MFI > 99.105 )
									ret := 0.789474 // buy
						if( Raw_Money_Flow > 5.1048e+07 )
							if( Positive_Money_Flow_Sum <= 7.50558e+08 )
								if( ema3 <= 196.248 )
									ret := -0.272727
								if( ema3 > 196.248 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 7.50558e+08 )
								if( MFI_Low <= 77.6058 )
									ret := 1.000000 // buy
								if( MFI_Low > 77.6058 )
									ret := -0.125000
				if( ema12 > -0.065002 )
					if( ema13 <= 0.634081 )
						if( Money_Flow_Ratio <= 1.48149 )
							if( Positive_Money_Flow <= 2.65933e+06 )
								if( Positive_Money_Flow_Sum <= 2.32319e+07 )
									ret := -0.008351
								if( Positive_Money_Flow_Sum > 2.32319e+07 )
									ret := 0.595745
							if( Positive_Money_Flow > 2.65933e+06 )
								if( ema13 <= 0.002459 )
									ret := 0.111111
								if( ema13 > 0.002459 )
									ret := -0.482456
						if( Money_Flow_Ratio > 1.48149 )
							if( Negative_Money_Flow_Sum <= 8.36674e+06 )
								if( ema1 <= 153.892 )
									ret := 0.324427
								if( ema1 > 153.892 )
									ret := 0.116490
							if( Negative_Money_Flow_Sum > 8.36674e+06 )
								if( Typical_Price <= 248.796 )
									ret := -0.007576
								if( Typical_Price > 248.796 )
									ret := 0.351064
					if( ema13 > 0.634081 )
						if( ema12 <= 1.18732 )
							if( tema <= 186.53 )
								if( Negative_Money_Flow_Sum <= 1.24774e+07 )
									ret := 0.510823
								if( Negative_Money_Flow_Sum > 1.24774e+07 )
									ret := 0.169173
							if( tema > 186.53 )
								if( Negative_Money_Flow_Sum <= 5.04258e+06 )
									ret := -0.236111
								if( Negative_Money_Flow_Sum > 5.04258e+06 )
									ret := 0.169300
						if( ema12 > 1.18732 )
							if( ema13 <= 2.7426 )
								if( Positive_Money_Flow_Sum <= 2.70702e+09 )
									ret := -0.812500 // sell
								if( Positive_Money_Flow_Sum > 2.70702e+09 )
									ret := -0.409091
							if( ema13 > 2.7426 )
								if( Positive_Money_Flow_Sum <= 7.50134e+09 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 7.50134e+09 )
									ret := 0.750000 // buy
		if( Negative_Money_Flow_Sum > 2.72665e+07 )
			if( Positive_Money_Flow <= 6.18733e+07 )
				if( Positive_Money_Flow <= 4.36389e+07 )
					if( tema <= 114.268 )
						if( Negative_Money_Flow <= 2.5885e+07 )
							if( Raw_Money_Flow <= 2.01068e+07 )
								if( ema3 <= 98.6391 )
									ret := 0.058824
								if( ema3 > 98.6391 )
									ret := 0.583333
							if( Raw_Money_Flow > 2.01068e+07 )
								if( ema2 <= 98.6895 )
									ret := 0.750000 // buy
								if( ema2 > 98.6895 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 2.5885e+07 )
							if( Positive_Money_Flow_Sum <= 2.32417e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 2.32417e+07 )
								ret := -1.000000 // sell
					if( tema > 114.268 )
						if( MFI_High <= -52.0448 )
							if( Raw_Money_Flow <= 3.04853e+07 )
								if( Positive_Money_Flow_Sum <= 1.03402e+07 )
									ret := 0.219251
								if( Positive_Money_Flow_Sum > 1.03402e+07 )
									ret := -0.186235
							if( Raw_Money_Flow > 3.04853e+07 )
								if( MFI_Low <= -5.87103 )
									ret := 0.400000
								if( MFI_Low > -5.87103 )
									ret := 0.904762 // buy
						if( MFI_High > -52.0448 )
							if( MFI_High <= -44.5264 )
								if( Negative_Money_Flow_Sum <= 4.09064e+07 )
									ret := 0.597315
								if( Negative_Money_Flow_Sum > 4.09064e+07 )
									ret := 0.273810
							if( MFI_High > -44.5264 )
								if( MFI_High <= -38.4458 )
									ret := -0.052778
								if( MFI_High > -38.4458 )
									ret := 0.219326
				if( Positive_Money_Flow > 4.36389e+07 )
					if( Positive_Money_Flow_Sum <= 5.60484e+08 )
						if( Negative_Money_Flow_Sum <= 5.55509e+07 )
							if( Money_Flow_Ratio <= 2.05902 )
								if( Positive_Money_Flow <= 5.00513e+07 )
									ret := 0.625000
								if( Positive_Money_Flow > 5.00513e+07 )
									ret := -0.416667
							if( Money_Flow_Ratio > 2.05902 )
								if( ema13 <= -0.706055 )
									ret := -0.400000
								if( ema13 > -0.706055 )
									ret := 0.663265
						if( Negative_Money_Flow_Sum > 5.55509e+07 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.60484e+08 )
						if( MFI_High <= 16.5607 )
							ret := -1.000000 // sell
						if( MFI_High > 16.5607 )
							ret := 0.000000
			if( Positive_Money_Flow > 6.18733e+07 )
				if( Negative_Money_Flow_Sum <= 5.10625e+07 )
					if( Raw_Money_Flow <= 7.84023e+07 )
						if( Positive_Money_Flow_Sum <= 1.32335e+08 )
							if( Positive_Money_Flow_Sum <= 1.03886e+08 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.03886e+08 )
								if( MFI_Low <= 54.2257 )
									ret := 1.000000 // buy
								if( MFI_Low > 54.2257 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.32335e+08 )
							if( Positive_Money_Flow_Sum <= 1.83419e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.83419e+08 )
								if( ema12 <= 0.214356 )
									ret := 0.666667
								if( ema12 > 0.214356 )
									ret := -0.800000 // sell
					if( Raw_Money_Flow > 7.84023e+07 )
						if( Positive_Money_Flow_Sum <= 1.3271e+09 )
							if( ema12 <= -0.174537 )
								if( Raw_Money_Flow <= 9.59801e+08 )
									ret := -0.695652
								if( Raw_Money_Flow > 9.59801e+08 )
									ret := 0.600000
							if( ema12 > -0.174537 )
								if( Raw_Money_Flow <= 3.09754e+08 )
									ret := -0.062500
								if( Raw_Money_Flow > 3.09754e+08 )
									ret := 0.359504
						if( Positive_Money_Flow_Sum > 1.3271e+09 )
							if( Positive_Money_Flow_Sum <= 2.70823e+09 )
								if( Raw_Money_Flow <= 2.12834e+08 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 2.12834e+08 )
									ret := -0.055556
							if( Positive_Money_Flow_Sum > 2.70823e+09 )
								if( ema12 <= 0.915427 )
									ret := 0.381818
								if( ema12 > 0.915427 )
									ret := -0.114754
				if( Negative_Money_Flow_Sum > 5.10625e+07 )
					if( ema3 <= 175.749 )
						if( ema3 <= 113.223 )
							if( Negative_Money_Flow_Sum <= 5.35425e+07 )
								ret := -0.666667
							if( Negative_Money_Flow_Sum > 5.35425e+07 )
								ret := 0.166667
						if( ema3 > 113.223 )
							if( MFI <= 96.7206 )
								if( ema13 <= -0.495026 )
									ret := -0.111111
								if( ema13 > -0.495026 )
									ret := 0.750000 // buy
							if( MFI > 96.7206 )
								if( Positive_Money_Flow_Sum <= 2.64803e+09 )
									ret := 0.023810
								if( Positive_Money_Flow_Sum > 2.64803e+09 )
									ret := 0.565217
					if( ema3 > 175.749 )
						if( Positive_Money_Flow <= 6.9604e+07 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow > 6.9604e+07 )
							if( Negative_Money_Flow_Sum <= 5.22696e+07 )
								if( Positive_Money_Flow <= 4.892e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 4.892e+08 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 5.22696e+07 )
								if( Positive_Money_Flow <= 3.87976e+08 )
									ret := -0.722222 // sell
								if( Positive_Money_Flow > 3.87976e+08 )
									ret := -0.016949
	if( Negative_Money_Flow_Sum > 5.88903e+07 )
		if( ema3 <= 233.037 )
			if( ema2 <= 149.563 )
				if( Negative_Money_Flow_Sum <= 1.12799e+10 )
					if( ema12 <= 0.455309 )
						if( Positive_Money_Flow <= 5.76193e+08 )
							if( ema13 <= 0.229398 )
								if( Negative_Money_Flow_Sum <= 1.06141e+08 )
									ret := -0.111111
								if( Negative_Money_Flow_Sum > 1.06141e+08 )
									ret := 0.075940
							if( ema13 > 0.229398 )
								if( Positive_Money_Flow_Sum <= 6.85718e+07 )
									ret := -0.237548
								if( Positive_Money_Flow_Sum > 6.85718e+07 )
									ret := 0.004051
						if( Positive_Money_Flow > 5.76193e+08 )
							if( Positive_Money_Flow_Sum <= 9.68525e+08 )
								if( ema13 <= 0.191143 )
									ret := 0.519231
								if( ema13 > 0.191143 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 9.68525e+08 )
								if( MFI_Low <= 30.478 )
									ret := -0.246499
								if( MFI_Low > 30.478 )
									ret := 0.032258
					if( ema12 > 0.455309 )
						if( MFI_Low <= 49.8573 )
							if( Negative_Money_Flow_Sum <= 1.68588e+08 )
								if( ema1 <= 147.446 )
									ret := 0.756098 // buy
								if( ema1 > 147.446 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.68588e+08 )
								if( ema13 <= 1.84418 )
									ret := -0.111307
								if( ema13 > 1.84418 )
									ret := -0.750000 // sell
						if( MFI_Low > 49.8573 )
							if( Negative_Money_Flow_Sum <= 2.36283e+09 )
								if( ema3 <= 141.999 )
									ret := 0.247312
								if( ema3 > 141.999 )
									ret := 0.089021
							if( Negative_Money_Flow_Sum > 2.36283e+09 )
								if( Negative_Money_Flow_Sum <= 2.68388e+09 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow_Sum > 2.68388e+09 )
									ret := 0.427273
				if( Negative_Money_Flow_Sum > 1.12799e+10 )
					if( Positive_Money_Flow_Sum <= 7.45749e+09 )
						if( tema <= 135.207 )
							if( Negative_Money_Flow_Sum <= 2.33085e+10 )
								if( Positive_Money_Flow_Sum <= 7.70117e+07 )
									ret := -0.571429
								if( Positive_Money_Flow_Sum > 7.70117e+07 )
									ret := 0.634454
							if( Negative_Money_Flow_Sum > 2.33085e+10 )
								ret := -1.000000 // sell
						if( tema > 135.207 )
							if( Positive_Money_Flow_Sum <= 2.34829e+09 )
								if( ema13 <= -0.226598 )
									ret := 0.764706 // buy
								if( ema13 > -0.226598 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.34829e+09 )
								if( MFI_High <= -51.9499 )
									ret := -0.538462
								if( MFI_High > -51.9499 )
									ret := 0.266667
					if( Positive_Money_Flow_Sum > 7.45749e+09 )
						if( ema13 <= -1.0295 )
							if( Positive_Money_Flow_Sum <= 8.63126e+09 )
								if( ema13 <= -3.23121 )
									ret := -0.750000 // sell
								if( ema13 > -3.23121 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8.63126e+09 )
								if( Raw_Money_Flow <= 1.87118e+09 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 1.87118e+09 )
									ret := -0.500000
						if( ema13 > -1.0295 )
							if( ema12 <= 0.574706 )
								if( tema <= 118.514 )
									ret := -0.250000
								if( tema > 118.514 )
									ret := 0.947368 // buy
							if( ema12 > 0.574706 )
								ret := -1.000000 // sell
			if( ema2 > 149.563 )
				if( Money_Flow_Ratio <= 46.0814 )
					if( Negative_Money_Flow_Sum <= 4.54038e+09 )
						if( Positive_Money_Flow_Sum <= 1.6929e+10 )
							if( ema12 <= 0.254552 )
								if( Positive_Money_Flow_Sum <= 7.50925e+09 )
									ret := 0.028041
								if( Positive_Money_Flow_Sum > 7.50925e+09 )
									ret := 0.329670
							if( ema12 > 0.254552 )
								if( Negative_Money_Flow_Sum <= 3.32638e+09 )
									ret := -0.011137
								if( Negative_Money_Flow_Sum > 3.32638e+09 )
									ret := -0.243284
						if( Positive_Money_Flow_Sum > 1.6929e+10 )
							if( Positive_Money_Flow_Sum <= 2.21929e+10 )
								if( tema <= 165.451 )
									ret := 0.166667
								if( tema > 165.451 )
									ret := 0.886364 // buy
							if( Positive_Money_Flow_Sum > 2.21929e+10 )
								ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 4.54038e+09 )
						if( MFI_High <= -24.1478 )
							if( Raw_Money_Flow <= 3.30567e+07 )
								if( Negative_Money_Flow_Sum <= 4.806e+09 )
									ret := -0.260684
								if( Negative_Money_Flow_Sum > 4.806e+09 )
									ret := 0.062860
							if( Raw_Money_Flow > 3.30567e+07 )
								if( Positive_Money_Flow_Sum <= 4.4732e+09 )
									ret := -0.139430
								if( Positive_Money_Flow_Sum > 4.4732e+09 )
									ret := 0.071633
						if( MFI_High > -24.1478 )
							if( Raw_Money_Flow <= 1.22499e+09 )
								if( ema13 <= -0.147888 )
									ret := -0.120690
								if( ema13 > -0.147888 )
									ret := -0.474419
							if( Raw_Money_Flow > 1.22499e+09 )
								if( Positive_Money_Flow_Sum <= 1.00041e+10 )
									ret := -0.350649
								if( Positive_Money_Flow_Sum > 1.00041e+10 )
									ret := 0.160000
				if( Money_Flow_Ratio > 46.0814 )
					if( Typical_Price <= 173.764 )
						if( Raw_Money_Flow <= 3.38791e+09 )
							if( ema13 <= 0.233004 )
								if( Negative_Money_Flow <= 8.798e+06 )
									ret := -0.114286
								if( Negative_Money_Flow > 8.798e+06 )
									ret := 1.000000 // buy
							if( ema13 > 0.233004 )
								if( Positive_Money_Flow_Sum <= 2.47229e+09 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 2.47229e+09 )
									ret := 0.626761
						if( Raw_Money_Flow > 3.38791e+09 )
							ret := -0.600000
					if( Typical_Price > 173.764 )
						if( ema13 <= 0.932873 )
							if( Negative_Money_Flow <= 1.31341e+07 )
								if( Negative_Money_Flow_Sum <= 6.12448e+07 )
									ret := 0.444444
								if( Negative_Money_Flow_Sum > 6.12448e+07 )
									ret := -0.458333
							if( Negative_Money_Flow > 1.31341e+07 )
								ret := 0.800000 // buy
						if( ema13 > 0.932873 )
							if( Positive_Money_Flow_Sum <= 1.63034e+10 )
								if( Money_Flow_Ratio <= 57.9481 )
									ret := -0.062500
								if( Money_Flow_Ratio > 57.9481 )
									ret := 0.413793
							if( Positive_Money_Flow_Sum > 1.63034e+10 )
								ret := -0.800000 // sell
		if( ema3 > 233.037 )
			if( Raw_Money_Flow <= 5.74737e+08 )
				if( Negative_Money_Flow_Sum <= 3.47954e+09 )
					if( Raw_Money_Flow <= 3.55115e+08 )
						if( ema12 <= 0.317606 )
							if( Positive_Money_Flow_Sum <= 3.41595e+09 )
								if( Positive_Money_Flow <= 1.11564e+08 )
									ret := 0.311155
								if( Positive_Money_Flow > 1.11564e+08 )
									ret := -0.019868
							if( Positive_Money_Flow_Sum > 3.41595e+09 )
								if( ema12 <= -1.20571 )
									ret := -0.521127
								if( ema12 > -1.20571 )
									ret := 0.134021
						if( ema12 > 0.317606 )
							if( Positive_Money_Flow_Sum <= 4.19086e+09 )
								if( MFI_Low <= 73.1692 )
									ret := -0.103199
								if( MFI_Low > 73.1692 )
									ret := 0.380952
							if( Positive_Money_Flow_Sum > 4.19086e+09 )
								if( MFI_Low <= 73.7423 )
									ret := 0.208845
								if( MFI_Low > 73.7423 )
									ret := 0.761905 // buy
					if( Raw_Money_Flow > 3.55115e+08 )
						if( ema13 <= 1.84081 )
							if( Positive_Money_Flow_Sum <= 3.14146e+09 )
								if( Positive_Money_Flow_Sum <= 4.18269e+08 )
									ret := -0.181818
								if( Positive_Money_Flow_Sum > 4.18269e+08 )
									ret := 0.510040
							if( Positive_Money_Flow_Sum > 3.14146e+09 )
								if( Negative_Money_Flow <= 5.39534e+08 )
									ret := 0.204724
								if( Negative_Money_Flow > 5.39534e+08 )
									ret := -0.764706 // sell
						if( ema13 > 1.84081 )
							if( Positive_Money_Flow_Sum <= 2.72354e+09 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.72354e+09 )
								if( Typical_Price <= 393.281 )
									ret := 0.673203
								if( Typical_Price > 393.281 )
									ret := -0.250000
				if( Negative_Money_Flow_Sum > 3.47954e+09 )
					if( MFI_High <= -38.255 )
						if( ema13 <= 0.82337 )
							if( Raw_Money_Flow <= 8.91568e+07 )
								if( ema13 <= -1.29996 )
									ret := 0.441441
								if( ema13 > -1.29996 )
									ret := 0.155629
							if( Raw_Money_Flow > 8.91568e+07 )
								if( Negative_Money_Flow <= 4.28279e+08 )
									ret := -0.179487
								if( Negative_Money_Flow > 4.28279e+08 )
									ret := 0.595745
						if( ema13 > 0.82337 )
							if( Negative_Money_Flow_Sum <= 5.56201e+09 )
								if( Raw_Money_Flow <= 2.3393e+08 )
									ret := -0.878788 // sell
								if( Raw_Money_Flow > 2.3393e+08 )
									ret := -0.200000
							if( Negative_Money_Flow_Sum > 5.56201e+09 )
								ret := 0.000000
					if( MFI_High > -38.255 )
						if( tema <= 372.302 )
							if( MFI_Low <= 47.8069 )
								if( Positive_Money_Flow <= 1.41735e+06 )
									ret := -0.559242
								if( Positive_Money_Flow > 1.41735e+06 )
									ret := -0.191176
							if( MFI_Low > 47.8069 )
								if( ema12 <= 3.95834 )
									ret := 0.483871
								if( ema12 > 3.95834 )
									ret := -0.750000 // sell
						if( tema > 372.302 )
							if( ema12 <= 3.56191 )
								if( ema13 <= 5.1674 )
									ret := 0.135593
								if( ema13 > 5.1674 )
									ret := -0.500000
							if( ema12 > 3.56191 )
								if( ema3 <= 488.8 )
									ret := 1.000000 // buy
								if( ema3 > 488.8 )
									ret := 0.750000 // buy
			if( Raw_Money_Flow > 5.74737e+08 )
				if( Positive_Money_Flow_Sum <= 1.97814e+10 )
					if( ema12 <= 0.295919 )
						if( Raw_Money_Flow <= 1.26625e+09 )
							if( Money_Flow_Ratio <= 3.87707 )
								if( ema13 <= -2.1162 )
									ret := -0.347826
								if( ema13 > -2.1162 )
									ret := -0.023910
							if( Money_Flow_Ratio > 3.87707 )
								if( ema12 <= -0.230293 )
									ret := -0.615385
								if( ema12 > -0.230293 )
									ret := -0.942308 // sell
						if( Raw_Money_Flow > 1.26625e+09 )
							if( Positive_Money_Flow_Sum <= 1.20408e+08 )
								if( tema <= 316.303 )
									ret := 0.891304 // buy
								if( tema > 316.303 )
									ret := -0.096774
							if( Positive_Money_Flow_Sum > 1.20408e+08 )
								if( Negative_Money_Flow <= 1.83819e+09 )
									ret := 0.115903
								if( Negative_Money_Flow > 1.83819e+09 )
									ret := -0.269663
					if( ema12 > 0.295919 )
						if( ema12 <= 1.95233 )
							if( Typical_Price <= 334.111 )
								if( Positive_Money_Flow_Sum <= 9.16462e+09 )
									ret := 0.118780
								if( Positive_Money_Flow_Sum > 9.16462e+09 )
									ret := -0.500000
							if( Typical_Price > 334.111 )
								if( MFI_High <= -52.8298 )
									ret := -0.400000
								if( MFI_High > -52.8298 )
									ret := 0.361702
						if( ema12 > 1.95233 )
							if( MFI <= 87.8013 )
								if( Positive_Money_Flow_Sum <= 1.03616e+10 )
									ret := 0.285714
								if( Positive_Money_Flow_Sum > 1.03616e+10 )
									ret := -0.382979
							if( MFI > 87.8013 )
								if( Typical_Price <= 440.544 )
									ret := -0.822222 // sell
								if( Typical_Price > 440.544 )
									ret := 0.125000
				if( Positive_Money_Flow_Sum > 1.97814e+10 )
					if( MFI <= 73.1804 )
						ret := 0.750000 // buy
					if( MFI > 73.1804 )
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AAPL_30Min_59287a7d(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


