//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: ADAUSDT_30Min_1M00_12ee2fcd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1M00_12ee2fcd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_12ee2fcd(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 9.01955e+06 )
		if( Typical_Price <= 1.33317 )
			if( Negative_Money_Flow <= 413017 )
				if( MFI_Low <= 61.8944 )
					if( Positive_Money_Flow_Sum <= 1.83071e+06 )
						if( Typical_Price <= 0.088813 )
							if( Negative_Money_Flow_Sum <= 3.28915e+06 )
								if( MFI <= 36.6637 )
									ret := -1.000000 // sell
								if( MFI > 36.6637 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 3.28915e+06 )
								if( Raw_Money_Flow <= 252590 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 252590 )
									ret := -0.200000
						if( Typical_Price > 0.088813 )
							if( MFI_High <= -62.9708 )
								if( Negative_Money_Flow_Sum <= 5.41227e+06 )
									ret := -0.066116
								if( Negative_Money_Flow_Sum > 5.41227e+06 )
									ret := 0.213873
							if( MFI_High > -62.9708 )
								if( Negative_Money_Flow_Sum <= 2.1647e+06 )
									ret := 0.003521
								if( Negative_Money_Flow_Sum > 2.1647e+06 )
									ret := -0.086638
					if( Positive_Money_Flow_Sum > 1.83071e+06 )
						if( Typical_Price <= 0.378215 )
							if( Negative_Money_Flow_Sum <= 2.95819e+07 )
								if( Positive_Money_Flow <= 1.97525e+06 )
									ret := 0.062613
								if( Positive_Money_Flow > 1.97525e+06 )
									ret := 0.166391
							if( Negative_Money_Flow_Sum > 2.95819e+07 )
								if( Raw_Money_Flow <= 3.91354e+06 )
									ret := 0.412500
								if( Raw_Money_Flow > 3.91354e+06 )
									ret := 0.096591
						if( Typical_Price > 0.378215 )
							if( Raw_Money_Flow <= 845230 )
								if( MFI_Low <= 36.4652 )
									ret := -0.074256
								if( MFI_Low > 36.4652 )
									ret := 0.023073
							if( Raw_Money_Flow > 845230 )
								if( Typical_Price <= 0.485405 )
									ret := 0.093319
								if( Typical_Price > 0.485405 )
									ret := 0.018524
				if( MFI_Low > 61.8944 )
					if( MFI <= 90.2672 )
						if( Typical_Price <= 0.650056 )
							if( Negative_Money_Flow_Sum <= 1.92323e+07 )
								if( Negative_Money_Flow_Sum <= 9.30141e+06 )
									ret := -0.090992
								if( Negative_Money_Flow_Sum > 9.30141e+06 )
									ret := 0.302083
							if( Negative_Money_Flow_Sum > 1.92323e+07 )
								if( Positive_Money_Flow_Sum <= 1.41028e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.41028e+08 )
									ret := -1.000000 // sell
						if( Typical_Price > 0.650056 )
							if( MFI_High <= 2.57738 )
								if( Negative_Money_Flow_Sum <= 1.79197e+07 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 1.79197e+07 )
									ret := 0.500000
							if( MFI_High > 2.57738 )
								if( Negative_Money_Flow_Sum <= 4.4562e+06 )
									ret := -0.731343 // sell
								if( Negative_Money_Flow_Sum > 4.4562e+06 )
									ret := -0.497976
					if( MFI > 90.2672 )
						if( Money_Flow_Ratio <= 26.8103 )
							if( Typical_Price <= 0.47 )
								if( Typical_Price <= 0.464557 )
									ret := 0.091371
								if( Typical_Price > 0.464557 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.47 )
								if( Negative_Money_Flow_Sum <= 2.12235e+06 )
									ret := 0.545455
								if( Negative_Money_Flow_Sum > 2.12235e+06 )
									ret := 0.017241
						if( Money_Flow_Ratio > 26.8103 )
							if( Typical_Price <= 0.376883 )
								if( Typical_Price <= 0.339317 )
									ret := 0.363636
								if( Typical_Price > 0.339317 )
									ret := -0.400000
							if( Typical_Price > 0.376883 )
								if( Negative_Money_Flow_Sum <= 704581 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 704581 )
									ret := 1.000000 // buy
			if( Negative_Money_Flow > 413017 )
				if( Typical_Price <= 0.333362 )
					if( Positive_Money_Flow_Sum <= 2.01926e+06 )
						if( Negative_Money_Flow_Sum <= 9.71882e+06 )
							if( Negative_Money_Flow <= 618390 )
								if( Negative_Money_Flow_Sum <= 3.68537e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.68537e+06 )
									ret := 0.233333
							if( Negative_Money_Flow > 618390 )
								if( Money_Flow_Ratio <= 0.282912 )
									ret := -0.066667
								if( Money_Flow_Ratio > 0.282912 )
									ret := -0.355263
						if( Negative_Money_Flow_Sum > 9.71882e+06 )
							if( Typical_Price <= 0.095004 )
								if( Money_Flow_Ratio <= 0.119774 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.119774 )
									ret := -0.250000
							if( Typical_Price > 0.095004 )
								if( MFI_Low <= -5.87887 )
									ret := 0.655172
								if( MFI_Low > -5.87887 )
									ret := -0.200000
					if( Positive_Money_Flow_Sum > 2.01926e+06 )
						if( MFI_High <= -26.3143 )
							if( Positive_Money_Flow_Sum <= 4.46734e+07 )
								if( Negative_Money_Flow_Sum <= 1.40551e+07 )
									ret := 0.186536
								if( Negative_Money_Flow_Sum > 1.40551e+07 )
									ret := 0.328125
							if( Positive_Money_Flow_Sum > 4.46734e+07 )
								if( Typical_Price <= 0.31128 )
									ret := -0.666667
								if( Typical_Price > 0.31128 )
									ret := 0.750000 // buy
						if( MFI_High > -26.3143 )
							if( Negative_Money_Flow <= 990003 )
								if( Raw_Money_Flow <= 627407 )
									ret := 0.057769
								if( Raw_Money_Flow > 627407 )
									ret := 0.258517
							if( Negative_Money_Flow > 990003 )
								if( Positive_Money_Flow_Sum <= 1.44726e+07 )
									ret := -0.176471
								if( Positive_Money_Flow_Sum > 1.44726e+07 )
									ret := 0.102752
				if( Typical_Price > 0.333362 )
					if( Negative_Money_Flow_Sum <= 2.4525e+07 )
						if( MFI_High <= 7.13861 )
							if( Negative_Money_Flow <= 3.22853e+06 )
								if( Negative_Money_Flow_Sum <= 1.52107e+07 )
									ret := 0.031742
								if( Negative_Money_Flow_Sum > 1.52107e+07 )
									ret := 0.113554
							if( Negative_Money_Flow > 3.22853e+06 )
								if( Negative_Money_Flow_Sum <= 1.35714e+07 )
									ret := 0.144550
								if( Negative_Money_Flow_Sum > 1.35714e+07 )
									ret := -0.112540
						if( MFI_High > 7.13861 )
							if( Typical_Price <= 0.917167 )
								if( Positive_Money_Flow_Sum <= 1.59809e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.59809e+07 )
									ret := 0.849057 // buy
							if( Typical_Price > 0.917167 )
								if( Positive_Money_Flow_Sum <= 7.95431e+07 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 7.95431e+07 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 2.4525e+07 )
						if( Positive_Money_Flow_Sum <= 3.24989e+07 )
							if( MFI_High <= -29.2792 )
								if( Negative_Money_Flow_Sum <= 5.79446e+07 )
									ret := 0.185236
								if( Negative_Money_Flow_Sum > 5.79446e+07 )
									ret := -0.057500
							if( MFI_High > -29.2792 )
								if( Raw_Money_Flow <= 6.00683e+06 )
									ret := 0.675926
								if( Raw_Money_Flow > 6.00683e+06 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 3.24989e+07 )
							if( Positive_Money_Flow_Sum <= 6.16605e+07 )
								if( MFI <= 61.1739 )
									ret := 0.011620
								if( MFI > 61.1739 )
									ret := -0.338129
							if( Positive_Money_Flow_Sum > 6.16605e+07 )
								if( Positive_Money_Flow_Sum <= 6.44656e+07 )
									ret := 0.626374
								if( Positive_Money_Flow_Sum > 6.44656e+07 )
									ret := 0.109620
		if( Typical_Price > 1.33317 )
			if( Positive_Money_Flow_Sum <= 1.52223e+08 )
				if( Negative_Money_Flow_Sum <= 1.0755e+08 )
					if( Negative_Money_Flow_Sum <= 6.5707e+07 )
						if( Negative_Money_Flow_Sum <= 3.12513e+07 )
							if( Money_Flow_Ratio <= 1.79769 )
								if( Typical_Price <= 1.39167 )
									ret := -0.083799
								if( Typical_Price > 1.39167 )
									ret := 0.104848
							if( Money_Flow_Ratio > 1.79769 )
								if( Money_Flow_Ratio <= 11.1922 )
									ret := -0.096634
								if( Money_Flow_Ratio > 11.1922 )
									ret := 0.785714 // buy
						if( Negative_Money_Flow_Sum > 3.12513e+07 )
							if( Positive_Money_Flow <= 9.52176e+06 )
								if( MFI_High <= -31.9287 )
									ret := -0.071125
								if( MFI_High > -31.9287 )
									ret := -0.216798
							if( Positive_Money_Flow > 9.52176e+06 )
								if( Negative_Money_Flow_Sum <= 4.37463e+07 )
									ret := -0.162602
								if( Negative_Money_Flow_Sum > 4.37463e+07 )
									ret := 0.203390
					if( Negative_Money_Flow_Sum > 6.5707e+07 )
						if( Negative_Money_Flow <= 7.2443e+06 )
							if( MFI_High <= -35.2213 )
								if( MFI_Low <= 20.4965 )
									ret := -0.009980
								if( MFI_Low > 20.4965 )
									ret := -0.325758
							if( MFI_High > -35.2213 )
								if( Positive_Money_Flow_Sum <= 1.09582e+08 )
									ret := 0.248485
								if( Positive_Money_Flow_Sum > 1.09582e+08 )
									ret := -0.117284
						if( Negative_Money_Flow > 7.2443e+06 )
							if( MFI_Low <= 29.1398 )
								if( MFI_High <= -55.1866 )
									ret := -0.062500
								if( MFI_High > -55.1866 )
									ret := 0.504202
							if( MFI_Low > 29.1398 )
								if( MFI_Low <= 39.4372 )
									ret := -0.375000
								if( MFI_Low > 39.4372 )
									ret := 0.500000
				if( Negative_Money_Flow_Sum > 1.0755e+08 )
					if( Typical_Price <= 1.6654 )
						if( Positive_Money_Flow_Sum <= 4.69155e+07 )
							if( Money_Flow_Ratio <= 0.208848 )
								if( Negative_Money_Flow_Sum <= 1.48014e+08 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.48014e+08 )
									ret := -0.833333 // sell
							if( Money_Flow_Ratio > 0.208848 )
								if( Negative_Money_Flow_Sum <= 1.10926e+08 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 1.10926e+08 )
									ret := 0.896552 // buy
						if( Positive_Money_Flow_Sum > 4.69155e+07 )
							if( Positive_Money_Flow_Sum <= 7.39426e+07 )
								if( Money_Flow_Ratio <= 0.276433 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.276433 )
									ret := -0.697248
							if( Positive_Money_Flow_Sum > 7.39426e+07 )
								if( Raw_Money_Flow <= 7.17238e+06 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 7.17238e+06 )
									ret := 0.014134
					if( Typical_Price > 1.6654 )
						if( Positive_Money_Flow_Sum <= 3.08383e+07 )
							if( Positive_Money_Flow_Sum <= 2.14683e+07 )
								if( Typical_Price <= 1.73952 )
									ret := -1.000000 // sell
								if( Typical_Price > 1.73952 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 2.14683e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.08383e+07 )
							if( Negative_Money_Flow_Sum <= 1.52848e+08 )
								if( MFI_High <= -37.0352 )
									ret := 0.091398
								if( MFI_High > -37.0352 )
									ret := -0.323077
							if( Negative_Money_Flow_Sum > 1.52848e+08 )
								if( MFI_Low <= 4.17886 )
									ret := 0.112903
								if( MFI_Low > 4.17886 )
									ret := -0.500000
			if( Positive_Money_Flow_Sum > 1.52223e+08 )
				if( MFI <= 82.1827 )
					if( Negative_Money_Flow_Sum <= 6.58645e+07 )
						if( Positive_Money_Flow_Sum <= 2.4991e+08 )
							if( Typical_Price <= 1.35411 )
								ret := -0.250000
							if( Typical_Price > 1.35411 )
								if( Positive_Money_Flow_Sum <= 2.1372e+08 )
									ret := 0.531250
								if( Positive_Money_Flow_Sum > 2.1372e+08 )
									ret := 0.971429 // buy
						if( Positive_Money_Flow_Sum > 2.4991e+08 )
							if( Raw_Money_Flow <= 3.36468e+07 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 3.36468e+07 )
								ret := 0.800000 // buy
					if( Negative_Money_Flow_Sum > 6.58645e+07 )
						if( Positive_Money_Flow <= 8.88236e+07 )
							if( Positive_Money_Flow <= 2.42715e+07 )
								if( MFI_High <= -3.87719 )
									ret := 0.115152
								if( MFI_High > -3.87719 )
									ret := 0.729730 // buy
							if( Positive_Money_Flow > 2.42715e+07 )
								if( MFI_High <= -47.4324 )
									ret := 0.517241
								if( MFI_High > -47.4324 )
									ret := -0.101138
						if( Positive_Money_Flow > 8.88236e+07 )
							if( Positive_Money_Flow_Sum <= 9.51819e+08 )
								if( Positive_Money_Flow_Sum <= 3.6634e+08 )
									ret := -0.066667
								if( Positive_Money_Flow_Sum > 3.6634e+08 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 9.51819e+08 )
								ret := -1.000000 // sell
				if( MFI > 82.1827 )
					if( Typical_Price <= 2.23596 )
						if( Negative_Money_Flow_Sum <= 2.45064e+07 )
							if( MFI <= 87.5947 )
								ret := 1.000000 // buy
							if( MFI > 87.5947 )
								if( Money_Flow_Ratio <= 15.0436 )
									ret := -0.583333
								if( Money_Flow_Ratio > 15.0436 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.45064e+07 )
							if( Negative_Money_Flow_Sum <= 5.2631e+07 )
								if( Negative_Money_Flow_Sum <= 2.69382e+07 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 2.69382e+07 )
									ret := -0.876923 // sell
							if( Negative_Money_Flow_Sum > 5.2631e+07 )
								if( Raw_Money_Flow <= 3.99194e+07 )
									ret := 0.041667
								if( Raw_Money_Flow > 3.99194e+07 )
									ret := -0.642857
					if( Typical_Price > 2.23596 )
						if( Positive_Money_Flow <= 4.61543e+07 )
							if( Typical_Price <= 2.717 )
								if( Typical_Price <= 2.52217 )
									ret := -0.300000
								if( Typical_Price > 2.52217 )
									ret := -0.928571 // sell
							if( Typical_Price > 2.717 )
								ret := 0.166667
						if( Positive_Money_Flow > 4.61543e+07 )
							if( Raw_Money_Flow <= 1.15206e+08 )
								if( MFI_High <= 12.7649 )
									ret := 0.800000 // buy
								if( MFI_High > 12.7649 )
									ret := 0.000000
							if( Raw_Money_Flow > 1.15206e+08 )
								ret := -1.000000 // sell
	if( Negative_Money_Flow > 9.01955e+06 )
		if( MFI_High <= -45.8291 )
			if( Negative_Money_Flow <= 1.43189e+07 )
				if( Typical_Price <= 0.454825 )
					if( Negative_Money_Flow_Sum <= 2.18028e+07 )
						ret := -0.200000
					if( Negative_Money_Flow_Sum > 2.18028e+07 )
						if( MFI_Low <= 12.0103 )
							if( Positive_Money_Flow_Sum <= 1.73888e+07 )
								if( Raw_Money_Flow <= 1.00592e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 1.00592e+07 )
									ret := 0.866667 // buy
							if( Positive_Money_Flow_Sum > 1.73888e+07 )
								if( Negative_Money_Flow <= 1.13317e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1.13317e+07 )
									ret := 0.600000
						if( MFI_Low > 12.0103 )
							ret := -0.250000
				if( Typical_Price > 0.454825 )
					if( MFI_Low <= 12.267 )
						if( Money_Flow_Ratio <= 0.45428 )
							if( Negative_Money_Flow <= 1.34917e+07 )
								if( Positive_Money_Flow_Sum <= 6.29339e+07 )
									ret := 0.195349
								if( Positive_Money_Flow_Sum > 6.29339e+07 )
									ret := -0.113636
							if( Negative_Money_Flow > 1.34917e+07 )
								if( Raw_Money_Flow <= 1.38299e+07 )
									ret := -0.571429
								if( Raw_Money_Flow > 1.38299e+07 )
									ret := -0.100000
						if( Money_Flow_Ratio > 0.45428 )
							if( Negative_Money_Flow_Sum <= 4.91394e+07 )
								if( Negative_Money_Flow_Sum <= 4.04018e+07 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 4.04018e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.91394e+07 )
								if( Negative_Money_Flow_Sum <= 9.22898e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 9.22898e+07 )
									ret := -0.428571
					if( MFI_Low > 12.267 )
						if( Positive_Money_Flow_Sum <= 4.73887e+07 )
							if( Money_Flow_Ratio <= 0.497914 )
								if( Negative_Money_Flow_Sum <= 6.19211e+07 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 6.19211e+07 )
									ret := 0.142857
							if( Money_Flow_Ratio > 0.497914 )
								if( Positive_Money_Flow_Sum <= 3.90992e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.90992e+07 )
									ret := -0.600000
						if( Positive_Money_Flow_Sum > 4.73887e+07 )
							if( Negative_Money_Flow_Sum <= 1.95527e+08 )
								if( Negative_Money_Flow <= 1.04434e+07 )
									ret := 0.230769
								if( Negative_Money_Flow > 1.04434e+07 )
									ret := 0.850000 // buy
							if( Negative_Money_Flow_Sum > 1.95527e+08 )
								ret := -0.500000
			if( Negative_Money_Flow > 1.43189e+07 )
				if( Positive_Money_Flow_Sum <= 2.18911e+07 )
					if( Money_Flow_Ratio <= 0.185629 )
						if( Positive_Money_Flow_Sum <= 2.00671e+07 )
							if( Negative_Money_Flow_Sum <= 7.67213e+07 )
								if( Raw_Money_Flow <= 1.91403e+07 )
									ret := 0.608696
								if( Raw_Money_Flow > 1.91403e+07 )
									ret := -0.533333
							if( Negative_Money_Flow_Sum > 7.67213e+07 )
								if( Money_Flow_Ratio <= 0.131841 )
									ret := 0.875000 // buy
								if( Money_Flow_Ratio > 0.131841 )
									ret := 0.300000
						if( Positive_Money_Flow_Sum > 2.00671e+07 )
							if( MFI_High <= -68.3366 )
								ret := -0.571429
							if( MFI_High > -68.3366 )
								ret := 0.500000
					if( Money_Flow_Ratio > 0.185629 )
						if( MFI_Low <= 3.85138 )
							if( Positive_Money_Flow_Sum <= 1.33901e+07 )
								if( Negative_Money_Flow_Sum <= 4.59495e+07 )
									ret := -0.857143 // sell
								if( Negative_Money_Flow_Sum > 4.59495e+07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.33901e+07 )
								if( MFI_Low <= -3.73305 )
									ret := -0.750000 // sell
								if( MFI_Low > -3.73305 )
									ret := -1.000000 // sell
						if( MFI_Low > 3.85138 )
							if( Typical_Price <= 1.04132 )
								if( Money_Flow_Ratio <= 0.418758 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.418758 )
									ret := 0.500000
							if( Typical_Price > 1.04132 )
								ret := -0.166667
				if( Positive_Money_Flow_Sum > 2.18911e+07 )
					if( Typical_Price <= 1.2187 )
						if( MFI_High <= -54.5959 )
							if( MFI_Low <= 3.8395 )
								if( Raw_Money_Flow <= 4.41173e+07 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 4.41173e+07 )
									ret := 0.166667
							if( MFI_Low > 3.8395 )
								if( Typical_Price <= 0.901983 )
									ret := 0.909091 // buy
								if( Typical_Price > 0.901983 )
									ret := -0.222222
						if( MFI_High > -54.5959 )
							if( Money_Flow_Ratio <= 0.512288 )
								if( Positive_Money_Flow_Sum <= 1.20838e+08 )
									ret := 0.906250 // buy
								if( Positive_Money_Flow_Sum > 1.20838e+08 )
									ret := 0.550000
							if( Money_Flow_Ratio > 0.512288 )
								if( Positive_Money_Flow_Sum <= 1.12693e+08 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 1.12693e+08 )
									ret := 1.000000 // buy
					if( Typical_Price > 1.2187 )
						if( MFI_High <= -47.1501 )
							if( Typical_Price <= 1.26896 )
								if( Positive_Money_Flow_Sum <= 1.13919e+08 )
									ret := 0.297297
								if( Positive_Money_Flow_Sum > 1.13919e+08 )
									ret := -0.588235
							if( Typical_Price > 1.26896 )
								if( Typical_Price <= 2.02214 )
									ret := 0.482402
								if( Typical_Price > 2.02214 )
									ret := 0.265700
						if( MFI_High > -47.1501 )
							if( Positive_Money_Flow_Sum <= 8.16102e+07 )
								if( Positive_Money_Flow_Sum <= 6.33171e+07 )
									ret := 0.080000
								if( Positive_Money_Flow_Sum > 6.33171e+07 )
									ret := 0.888889 // buy
							if( Positive_Money_Flow_Sum > 8.16102e+07 )
								if( Positive_Money_Flow_Sum <= 1.04869e+08 )
									ret := -0.695652
								if( Positive_Money_Flow_Sum > 1.04869e+08 )
									ret := 0.272727
		if( MFI_High > -45.8291 )
			if( Positive_Money_Flow_Sum <= 3.38127e+07 )
				if( Negative_Money_Flow_Sum <= 2.09499e+07 )
					if( Typical_Price <= 0.805247 )
						ret := 1.000000 // buy
					if( Typical_Price > 0.805247 )
						ret := 0.250000
				if( Negative_Money_Flow_Sum > 2.09499e+07 )
					if( Negative_Money_Flow <= 1.89755e+07 )
						if( Negative_Money_Flow_Sum <= 4.88953e+07 )
							if( Positive_Money_Flow_Sum <= 1.96319e+07 )
								if( Positive_Money_Flow_Sum <= 1.50398e+07 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 1.50398e+07 )
									ret := -0.705882 // sell
							if( Positive_Money_Flow_Sum > 1.96319e+07 )
								if( Positive_Money_Flow_Sum <= 2.30878e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 2.30878e+07 )
									ret := -0.275000
						if( Negative_Money_Flow_Sum > 4.88953e+07 )
							if( Money_Flow_Ratio <= 0.540771 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.540771 )
								if( Typical_Price <= 1.24808 )
									ret := -1.000000 // sell
								if( Typical_Price > 1.24808 )
									ret := -0.583333
					if( Negative_Money_Flow > 1.89755e+07 )
						ret := 0.800000 // buy
			if( Positive_Money_Flow_Sum > 3.38127e+07 )
				if( Typical_Price <= 2.10516 )
					if( Typical_Price <= 1.15879 )
						if( MFI <= 48.2528 )
							if( Positive_Money_Flow_Sum <= 4.37466e+07 )
								if( MFI <= 41.9667 )
									ret := 0.600000
								if( MFI > 41.9667 )
									ret := 0.891892 // buy
							if( Positive_Money_Flow_Sum > 4.37466e+07 )
								if( Positive_Money_Flow_Sum <= 4.65515e+07 )
									ret := -0.342105
								if( Positive_Money_Flow_Sum > 4.65515e+07 )
									ret := 0.422297
						if( MFI > 48.2528 )
							if( Negative_Money_Flow_Sum <= 1.51204e+08 )
								if( Positive_Money_Flow_Sum <= 1.04655e+08 )
									ret := 0.130268
								if( Positive_Money_Flow_Sum > 1.04655e+08 )
									ret := 0.357143
							if( Negative_Money_Flow_Sum > 1.51204e+08 )
								if( Negative_Money_Flow <= 2.65314e+07 )
									ret := -0.488372
								if( Negative_Money_Flow > 2.65314e+07 )
									ret := 0.291667
					if( Typical_Price > 1.15879 )
						if( Positive_Money_Flow_Sum <= 1.38167e+08 )
							if( MFI_High <= -41.1231 )
								if( Negative_Money_Flow_Sum <= 1.90628e+08 )
									ret := 0.356589
								if( Negative_Money_Flow_Sum > 1.90628e+08 )
									ret := -0.263158
							if( MFI_High > -41.1231 )
								if( Money_Flow_Ratio <= 0.777691 )
									ret := -0.189922
								if( Money_Flow_Ratio > 0.777691 )
									ret := 0.089330
						if( Positive_Money_Flow_Sum > 1.38167e+08 )
							if( Negative_Money_Flow_Sum <= 3.58421e+07 )
								if( MFI_High <= 6.34127 )
									ret := -0.750000 // sell
								if( MFI_High > 6.34127 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.58421e+07 )
								if( MFI <= 35.6737 )
									ret := -0.500000
								if( MFI > 35.6737 )
									ret := 0.259051
				if( Typical_Price > 2.10516 )
					if( MFI_Low <= 39.2596 )
						if( Positive_Money_Flow_Sum <= 7.05256e+07 )
							if( Negative_Money_Flow_Sum <= 8.283e+07 )
								if( Typical_Price <= 2.18833 )
									ret := 0.411765
								if( Typical_Price > 2.18833 )
									ret := -0.192982
							if( Negative_Money_Flow_Sum > 8.283e+07 )
								if( Raw_Money_Flow <= 2.23652e+07 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 2.23652e+07 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 7.05256e+07 )
							if( Negative_Money_Flow <= 7.23419e+07 )
								if( MFI_High <= -21.5779 )
									ret := -0.194969
								if( MFI_High > -21.5779 )
									ret := -0.904762 // sell
							if( Negative_Money_Flow > 7.23419e+07 )
								if( Raw_Money_Flow <= 7.76329e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 7.76329e+07 )
									ret := 0.750000 // buy
					if( MFI_Low > 39.2596 )
						if( Positive_Money_Flow_Sum <= 2.52392e+08 )
							if( Positive_Money_Flow_Sum <= 1.40465e+08 )
								if( Positive_Money_Flow_Sum <= 1.18214e+08 )
									ret := -0.100000
								if( Positive_Money_Flow_Sum > 1.18214e+08 )
									ret := 0.533333
							if( Positive_Money_Flow_Sum > 1.40465e+08 )
								if( Typical_Price <= 2.25626 )
									ret := -0.590909
								if( Typical_Price > 2.25626 )
									ret := 0.023810
						if( Positive_Money_Flow_Sum > 2.52392e+08 )
							if( Positive_Money_Flow_Sum <= 3.595e+08 )
								if( Typical_Price <= 2.12833 )
									ret := -0.750000 // sell
								if( Typical_Price > 2.12833 )
									ret := 0.680556
							if( Positive_Money_Flow_Sum > 3.595e+08 )
								if( MFI_Low <= 40.9617 )
									ret := -0.888889 // sell
								if( MFI_Low > 40.9617 )
									ret := 0.200000
	
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
float op_operation = decision_tree_0_ADAUSDT_30Min_12ee2fcd(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


