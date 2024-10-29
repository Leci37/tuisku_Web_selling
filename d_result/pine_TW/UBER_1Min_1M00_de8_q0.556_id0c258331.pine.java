//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: UBER_1Min_1M00_0c258331 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1M00_0c258331", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_0c258331(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow <= 957.645 )
		if( Money_Flow_Ratio <= 0.158003 )
			if( Negative_Money_Flow_Sum <= 4.88488e+06 )
				if( Negative_Money_Flow_Sum <= 1.97166e+06 )
					if( MFI_Low <= -12.0022 )
						if( Typical_Price <= 70.77 )
							if( MFI_High <= -73.2583 )
								ret := 0.739130 // buy
							if( MFI_High > -73.2583 )
								ret := -0.055556
						if( Typical_Price > 70.77 )
							if( MFI_Low <= -14.0461 )
								ret := 0.000000
							if( MFI_Low > -14.0461 )
								ret := -0.461538
					if( MFI_Low > -12.0022 )
						if( Raw_Money_Flow <= 282428 )
							if( Positive_Money_Flow_Sum <= 186438 )
								if( Typical_Price <= 62.865 )
									ret := 0.000000
								if( Typical_Price > 62.865 )
									ret := 0.649789
							if( Positive_Money_Flow_Sum > 186438 )
								if( MFI_Low <= -8.83594 )
									ret := -0.285714
								if( MFI_Low > -8.83594 )
									ret := 0.166667
						if( Raw_Money_Flow > 282428 )
							if( Negative_Money_Flow <= 596867 )
								ret := -0.700000 // sell
							if( Negative_Money_Flow > 596867 )
								ret := 0.600000
				if( Negative_Money_Flow_Sum > 1.97166e+06 )
					if( MFI <= 12.4003 )
						if( MFI_High <= -78.786 )
							ret := 0.333333
						if( MFI_High > -78.786 )
							if( Typical_Price <= 72.6446 )
								if( Typical_Price <= 68.6616 )
									ret := 0.842520 // buy
								if( Typical_Price > 68.6616 )
									ret := 0.697368
							if( Typical_Price > 72.6446 )
								if( MFI_Low <= -14.7221 )
									ret := 0.750000 // buy
								if( MFI_Low > -14.7221 )
									ret := 0.307692
					if( MFI > 12.4003 )
						ret := -0.117647
			if( Negative_Money_Flow_Sum > 4.88488e+06 )
				if( Negative_Money_Flow <= 4.08778e+06 )
					if( Raw_Money_Flow <= 1.85171e+06 )
						if( MFI_High <= -77.6656 )
							if( Negative_Money_Flow_Sum <= 9.86026e+06 )
								if( Money_Flow_Ratio <= 0.015939 )
									ret := -0.037037
								if( Money_Flow_Ratio > 0.015939 )
									ret := 0.307692
							if( Negative_Money_Flow_Sum > 9.86026e+06 )
								if( Money_Flow_Ratio <= 0.006069 )
									ret := 0.333333
								if( Money_Flow_Ratio > 0.006069 )
									ret := 0.750000 // buy
						if( MFI_High > -77.6656 )
							if( MFI_Low <= -15.4538 )
								if( Raw_Money_Flow <= 171624 )
									ret := -0.628571
								if( Raw_Money_Flow > 171624 )
									ret := -0.243902
							if( MFI_Low > -15.4538 )
								if( Raw_Money_Flow <= 1.64797e+06 )
									ret := 0.157658
								if( Raw_Money_Flow > 1.64797e+06 )
									ret := -0.192771
					if( Raw_Money_Flow > 1.85171e+06 )
						if( Negative_Money_Flow_Sum <= 5.3719e+07 )
							if( Typical_Price <= 69.3316 )
								if( MFI <= 8.85831 )
									ret := 0.438776
								if( MFI > 8.85831 )
									ret := 0.820000 // buy
							if( Typical_Price > 69.3316 )
								if( Negative_Money_Flow_Sum <= 3.50714e+07 )
									ret := 0.484848
								if( Negative_Money_Flow_Sum > 3.50714e+07 )
									ret := -0.055556
						if( Negative_Money_Flow_Sum > 5.3719e+07 )
							if( Positive_Money_Flow_Sum <= 8.51746e+06 )
								if( MFI_Low <= -12.8016 )
									ret := 0.551724
								if( MFI_Low > -12.8016 )
									ret := -0.866667 // sell
							if( Positive_Money_Flow_Sum > 8.51746e+06 )
								if( Negative_Money_Flow_Sum <= 1.16979e+08 )
									ret := 0.625000
								if( Negative_Money_Flow_Sum > 1.16979e+08 )
									ret := 0.846154 // buy
				if( Negative_Money_Flow > 4.08778e+06 )
					if( Raw_Money_Flow <= 2.06918e+07 )
						if( Positive_Money_Flow_Sum <= 8.04557e+06 )
							if( Typical_Price <= 64.5357 )
								if( MFI_High <= -72.3678 )
									ret := 0.826087 // buy
								if( MFI_High > -72.3678 )
									ret := 0.100000
							if( Typical_Price > 64.5357 )
								if( Positive_Money_Flow_Sum <= 7.45412e+06 )
									ret := -0.204651
								if( Positive_Money_Flow_Sum > 7.45412e+06 )
									ret := -0.833333 // sell
						if( Positive_Money_Flow_Sum > 8.04557e+06 )
							if( MFI_High <= -68.8674 )
								ret := 1.000000 // buy
							if( MFI_High > -68.8674 )
								if( Positive_Money_Flow_Sum <= 8.87031e+06 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 8.87031e+06 )
									ret := 0.578947
					if( Raw_Money_Flow > 2.06918e+07 )
						if( MFI_Low <= -13.911 )
							if( MFI_Low <= -18.837 )
								ret := 0.454545
							if( MFI_Low > -18.837 )
								if( Negative_Money_Flow <= 4.2475e+07 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow > 4.2475e+07 )
									ret := 1.000000 // buy
						if( MFI_Low > -13.911 )
							if( Raw_Money_Flow <= 4.32262e+07 )
								ret := -0.294118
							if( Raw_Money_Flow > 4.32262e+07 )
								ret := 0.500000
		if( Money_Flow_Ratio > 0.158003 )
			if( Negative_Money_Flow <= 266061 )
				if( MFI <= 75.6577 )
					if( MFI_High <= -62.0666 )
						if( Negative_Money_Flow_Sum <= 465833 )
							if( Raw_Money_Flow <= 89824.9 )
								if( Money_Flow_Ratio <= 0.166382 )
									ret := 0.625000
								if( Money_Flow_Ratio > 0.166382 )
									ret := 0.000000
							if( Raw_Money_Flow > 89824.9 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 465833 )
							if( Positive_Money_Flow <= 9.68522 )
								if( Positive_Money_Flow_Sum <= 107711 )
									ret := -0.526316
								if( Positive_Money_Flow_Sum > 107711 )
									ret := 0.137615
							if( Positive_Money_Flow > 9.68522 )
								ret := -0.714286 // sell
					if( MFI_High > -62.0666 )
						if( Raw_Money_Flow <= 23972 )
							if( Negative_Money_Flow <= 7406.19 )
								if( Negative_Money_Flow_Sum <= 426711 )
									ret := 0.259259
								if( Negative_Money_Flow_Sum > 426711 )
									ret := -0.046243
							if( Negative_Money_Flow > 7406.19 )
								if( MFI <= 44.5446 )
									ret := 0.589059
								if( MFI > 44.5446 )
									ret := 0.317021
						if( Raw_Money_Flow > 23972 )
							if( MFI_Low <= 13.7616 )
								if( Negative_Money_Flow_Sum <= 663277 )
									ret := 0.242123
								if( Negative_Money_Flow_Sum > 663277 )
									ret := -0.082942
							if( MFI_Low > 13.7616 )
								if( Negative_Money_Flow_Sum <= 98508 )
									ret := -0.473684
								if( Negative_Money_Flow_Sum > 98508 )
									ret := 0.172016
				if( MFI > 75.6577 )
					if( Typical_Price <= 64.24 )
						if( Negative_Money_Flow <= 43278.6 )
							if( Typical_Price <= 62.3965 )
								ret := 0.363636
							if( Typical_Price > 62.3965 )
								if( MFI_High <= 8.28639 )
									ret := -0.312500
								if( MFI_High > 8.28639 )
									ret := 0.000000
						if( Negative_Money_Flow > 43278.6 )
							if( Positive_Money_Flow_Sum <= 1.11103e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.11103e+06 )
								ret := -0.142857
					if( Typical_Price > 64.24 )
						if( Negative_Money_Flow_Sum <= 186474 )
							if( MFI_Low <= 71.5982 )
								if( Raw_Money_Flow <= 14451 )
									ret := 0.342857
								if( Raw_Money_Flow > 14451 )
									ret := -0.308725
							if( MFI_Low > 71.5982 )
								if( MFI_Low <= 78.5826 )
									ret := 0.617647
								if( MFI_Low > 78.5826 )
									ret := -0.071429
						if( Negative_Money_Flow_Sum > 186474 )
							if( Typical_Price <= 81.01 )
								if( Negative_Money_Flow_Sum <= 228476 )
									ret := 0.486301
								if( Negative_Money_Flow_Sum > 228476 )
									ret := 0.197415
							if( Typical_Price > 81.01 )
								if( MFI_Low <= 65.0203 )
									ret := -0.566667
								if( MFI_Low > 65.0203 )
									ret := 0.100000
			if( Negative_Money_Flow > 266061 )
				if( Typical_Price <= 58.8945 )
					if( MFI_High <= -3.07576 )
						if( Typical_Price <= 56.645 )
							ret := 1.000000 // buy
						if( Typical_Price > 56.645 )
							if( Raw_Money_Flow <= 2.41003e+06 )
								if( Positive_Money_Flow_Sum <= 7.95460e+06 )
									ret := 0.153846
								if( Positive_Money_Flow_Sum > 7.95460e+06 )
									ret := 0.656863
							if( Raw_Money_Flow > 2.41003e+06 )
								if( MFI_High <= -44.7715 )
									ret := 0.674419
								if( MFI_High > -44.7715 )
									ret := 0.131148
					if( MFI_High > -3.07576 )
						ret := 0.937500 // buy
				if( Typical_Price > 58.8945 )
					if( Negative_Money_Flow <= 3.85708e+06 )
						if( Negative_Money_Flow_Sum <= 894856 )
							if( MFI <= 25.6686 )
								if( Typical_Price <= 72.6063 )
									ret := 0.272727
								if( Typical_Price > 72.6063 )
									ret := -0.666667
							if( MFI > 25.6686 )
								if( MFI_Low <= 42.4234 )
									ret := 0.629630
								if( MFI_Low > 42.4234 )
									ret := -0.062500
						if( Negative_Money_Flow_Sum > 894856 )
							if( MFI_Low <= 51.7298 )
								if( MFI_Low <= 10.1381 )
									ret := 0.044057
								if( MFI_Low > 10.1381 )
									ret := -0.044702
							if( MFI_Low > 51.7298 )
								if( Raw_Money_Flow <= 938851 )
									ret := -0.111111
								if( Raw_Money_Flow > 938851 )
									ret := 0.129310
					if( Negative_Money_Flow > 3.85708e+06 )
						if( MFI <= 33.3805 )
							if( MFI_High <= -47.3645 )
								if( Negative_Money_Flow_Sum <= 6.75051e+07 )
									ret := -0.066528
								if( Negative_Money_Flow_Sum > 6.75051e+07 )
									ret := 0.180233
							if( MFI_High > -47.3645 )
								if( MFI <= 33.2452 )
									ret := -0.611111
								if( MFI > 33.2452 )
									ret := -0.041667
						if( MFI > 33.3805 )
							if( MFI_High <= -35.4866 )
								if( Typical_Price <= 63.7961 )
									ret := 0.807692 // buy
								if( Typical_Price > 63.7961 )
									ret := 0.176421
							if( MFI_High > -35.4866 )
								if( Negative_Money_Flow_Sum <= 1.14803e+08 )
									ret := 0.048444
								if( Negative_Money_Flow_Sum > 1.14803e+08 )
									ret := 0.915663 // buy
	if( Positive_Money_Flow > 957.645 )
		if( MFI <= 7.02576 )
			if( MFI <= 2.30133 )
				if( Money_Flow_Ratio <= 0.011891 )
					if( MFI_Low <= -19.1987 )
						if( Typical_Price <= 70.6416 )
							if( Typical_Price <= 66.2542 )
								ret := -0.071429
							if( Typical_Price > 66.2542 )
								ret := 0.500000
						if( Typical_Price > 70.6416 )
							ret := -0.600000
					if( MFI_Low > -19.1987 )
						if( Typical_Price <= 71.4716 )
							ret := -0.454545
						if( Typical_Price > 71.4716 )
							ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.011891 )
					if( MFI_Low <= -18.272 )
						if( MFI <= 1.39848 )
							ret := 0.050000
						if( MFI > 1.39848 )
							ret := 0.800000 // buy
					if( MFI_Low > -18.272 )
						if( MFI_High <= -78.1305 )
							ret := -0.545455
						if( MFI_High > -78.1305 )
							if( Money_Flow_Ratio <= 0.020931 )
								ret := 0.444444
							if( Money_Flow_Ratio > 0.020931 )
								ret := 0.166667
			if( MFI > 2.30133 )
				if( Positive_Money_Flow_Sum <= 361071 )
					if( Typical_Price <= 65.514 )
						ret := -1.000000 // sell
					if( Typical_Price > 65.514 )
						if( MFI_Low <= -16.4845 )
							if( Negative_Money_Flow_Sum <= 5.22816e+06 )
								ret := -0.947368 // sell
							if( Negative_Money_Flow_Sum > 5.22816e+06 )
								ret := -0.400000
						if( MFI_Low > -16.4845 )
							if( Negative_Money_Flow <= 2060.65 )
								if( Positive_Money_Flow <= 12677.1 )
									ret := 0.222222
								if( Positive_Money_Flow > 12677.1 )
									ret := -0.347826
							if( Negative_Money_Flow > 2060.65 )
								ret := 0.500000
				if( Positive_Money_Flow_Sum > 361071 )
					if( Typical_Price <= 67.1465 )
						if( MFI_Low <= -16.4298 )
							ret := -0.666667
						if( MFI_Low > -16.4298 )
							if( Raw_Money_Flow <= 167741 )
								ret := 0.812500 // buy
							if( Raw_Money_Flow > 167741 )
								ret := 0.055556
					if( Typical_Price > 67.1465 )
						if( Positive_Money_Flow_Sum <= 1.36186e+06 )
							if( Negative_Money_Flow_Sum <= 1.12951e+07 )
								ret := -0.555556
							if( Negative_Money_Flow_Sum > 1.12951e+07 )
								if( Money_Flow_Ratio <= 0.042882 )
									ret := 0.444444
								if( Money_Flow_Ratio > 0.042882 )
									ret := -0.090909
						if( Positive_Money_Flow_Sum > 1.36186e+06 )
							if( MFI_Low <= -14.971 )
								if( Raw_Money_Flow <= 50382.1 )
									ret := 0.083333
								if( Raw_Money_Flow > 50382.1 )
									ret := -0.714286 // sell
							if( MFI_Low > -14.971 )
								if( MFI_High <= -73.2229 )
									ret := -0.880952 // sell
								if( MFI_High > -73.2229 )
									ret := -0.583333
		if( MFI > 7.02576 )
			if( Positive_Money_Flow <= 4.10683e+06 )
				if( MFI <= 14.2714 )
					if( Positive_Money_Flow <= 10947.2 )
						if( Typical_Price <= 73.5537 )
							if( MFI_Low <= -6.14135 )
								if( Money_Flow_Ratio <= 0.102538 )
									ret := 0.205882
								if( Money_Flow_Ratio > 0.102538 )
									ret := 0.670213
							if( MFI_Low > -6.14135 )
								ret := -0.307692
						if( Typical_Price > 73.5537 )
							ret := -0.500000
					if( Positive_Money_Flow > 10947.2 )
						if( Raw_Money_Flow <= 3.75378e+06 )
							if( MFI_High <= -66.9047 )
								if( Typical_Price <= 81.1878 )
									ret := -0.145418
								if( Typical_Price > 81.1878 )
									ret := 0.647059
							if( MFI_High > -66.9047 )
								if( Positive_Money_Flow <= 129317 )
									ret := 0.011111
								if( Positive_Money_Flow > 129317 )
									ret := 0.489796
						if( Raw_Money_Flow > 3.75378e+06 )
							if( Negative_Money_Flow <= 327582 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 327582 )
								ret := 0.750000 // buy
				if( MFI > 14.2714 )
					if( Positive_Money_Flow <= 31688 )
						if( Negative_Money_Flow <= 612.477 )
							if( Positive_Money_Flow_Sum <= 479912 )
								if( Money_Flow_Ratio <= 0.391198 )
									ret := -0.459924
								if( Money_Flow_Ratio > 0.391198 )
									ret := -0.069580
							if( Positive_Money_Flow_Sum > 479912 )
								if( MFI_High <= -8.28891 )
									ret := -0.453782
								if( MFI_High > -8.28891 )
									ret := -0.159712
						if( Negative_Money_Flow > 612.477 )
							if( Typical_Price <= 70.1696 )
								if( Money_Flow_Ratio <= 2.07056 )
									ret := 0.050336
								if( Money_Flow_Ratio > 2.07056 )
									ret := 0.456869
							if( Typical_Price > 70.1696 )
								if( MFI_High <= 4.95233 )
									ret := -0.011029
								if( MFI_High > 4.95233 )
									ret := -0.548387
					if( Positive_Money_Flow > 31688 )
						if( Positive_Money_Flow <= 34169 )
							if( Typical_Price <= 63.0567 )
								ret := 0.800000 // buy
							if( Typical_Price > 63.0567 )
								if( MFI <= 23.516 )
									ret := 0.760000 // buy
								if( MFI > 23.516 )
									ret := 0.098266
						if( Positive_Money_Flow > 34169 )
							if( Raw_Money_Flow <= 2.23489e+06 )
								if( MFI_Low <= 37.9486 )
									ret := -0.019769
								if( MFI_Low > 37.9486 )
									ret := -0.075039
							if( Raw_Money_Flow > 2.23489e+06 )
								if( Positive_Money_Flow_Sum <= 1.3629e+07 )
									ret := -0.028198
								if( Positive_Money_Flow_Sum > 1.3629e+07 )
									ret := -0.119359
			if( Positive_Money_Flow > 4.10683e+06 )
				if( Positive_Money_Flow <= 1.69786e+07 )
					if( Negative_Money_Flow_Sum <= 2.32097e+07 )
						if( Positive_Money_Flow_Sum <= 1.51542e+07 )
							if( Typical_Price <= 69.0869 )
								if( Positive_Money_Flow_Sum <= 9.24065e+06 )
									ret := -0.043478
								if( Positive_Money_Flow_Sum > 9.24065e+06 )
									ret := -0.642202
							if( Typical_Price > 69.0869 )
								if( MFI_Low <= 67.1167 )
									ret := -0.058394
								if( MFI_Low > 67.1167 )
									ret := -0.756757 // sell
						if( Positive_Money_Flow_Sum > 1.51542e+07 )
							if( Negative_Money_Flow_Sum <= 9.6333e+06 )
								if( MFI_Low <= 69.0088 )
									ret := 0.329524
								if( MFI_Low > 69.0088 )
									ret := -0.003401
							if( Negative_Money_Flow_Sum > 9.6333e+06 )
								if( Positive_Money_Flow <= 9.77696e+06 )
									ret := 0.009077
								if( Positive_Money_Flow > 9.77696e+06 )
									ret := -0.302905
					if( Negative_Money_Flow_Sum > 2.32097e+07 )
						if( Negative_Money_Flow_Sum <= 2.63048e+07 )
							if( MFI_High <= -44.4228 )
								if( Typical_Price <= 69.6185 )
									ret := -0.600000
								if( Typical_Price > 69.6185 )
									ret := 0.142857
							if( MFI_High > -44.4228 )
								if( Positive_Money_Flow_Sum <= 6.46352e+07 )
									ret := 0.561772
								if( Positive_Money_Flow_Sum > 6.46352e+07 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 2.63048e+07 )
							if( MFI <= 24.212 )
								if( Typical_Price <= 67.6155 )
									ret := 0.413793
								if( Typical_Price > 67.6155 )
									ret := -0.679104
							if( MFI > 24.212 )
								if( Positive_Money_Flow <= 1.25972e+07 )
									ret := 0.054639
								if( Positive_Money_Flow > 1.25972e+07 )
									ret := 0.484733
				if( Positive_Money_Flow > 1.69786e+07 )
					if( Negative_Money_Flow_Sum <= 1.02463e+08 )
						if( Money_Flow_Ratio <= 30.6226 )
							if( MFI_High <= -27.8456 )
								if( Money_Flow_Ratio <= 0.715487 )
									ret := -0.111111
								if( Money_Flow_Ratio > 0.715487 )
									ret := -0.888889 // sell
							if( MFI_High > -27.8456 )
								if( Money_Flow_Ratio <= 1.637 )
									ret := 0.000000
								if( Money_Flow_Ratio > 1.637 )
									ret := -0.434874
						if( Money_Flow_Ratio > 30.6226 )
							if( Positive_Money_Flow <= 2.50319e+07 )
								if( Positive_Money_Flow <= 2.18176e+07 )
									ret := -0.906250 // sell
								if( Positive_Money_Flow > 2.18176e+07 )
									ret := -0.478261
							if( Positive_Money_Flow > 2.50319e+07 )
								if( Raw_Money_Flow <= 5.36807e+07 )
									ret := 0.869565 // buy
								if( Raw_Money_Flow > 5.36807e+07 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.02463e+08 )
						if( Typical_Price <= 75.0393 )
							if( MFI_High <= -21.7906 )
								ret := -0.315789
							if( MFI_High > -21.7906 )
								ret := -1.000000 // sell
						if( Typical_Price > 75.0393 )
							if( Positive_Money_Flow_Sum <= 2.04609e+08 )
								ret := 0.545455
							if( Positive_Money_Flow_Sum > 2.04609e+08 )
								if( Raw_Money_Flow <= 2.44155e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.44155e+07 )
									ret := 0.900000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_0c258331(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


