//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: ADAUSDT_30Min_1SUP_abc54beb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1SUP_abc54beb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_abc54beb(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up <= 1.30436 )
		if( atr <= 0.005053 )
			if( dn1 <= 0.395339 )
				if( atr2 <= 0.002397 )
					if( dn1 <= 0.097406 )
						if( atr2 <= 0.000602 )
							if( dn1 <= 0.091001 )
								if( atr2 <= 0.000565 )
									ret := -0.656716
								if( atr2 > 0.000565 )
									ret := 0.250000
							if( dn1 > 0.091001 )
								if( dn <= 0.097139 )
									ret := -0.098361
								if( dn > 0.097139 )
									ret := 0.818182 // buy
						if( atr2 > 0.000602 )
							if( atr2 <= 0.001817 )
								if( up <= 0.093127 )
									ret := 0.262689
								if( up > 0.093127 )
									ret := 0.896552 // buy
							if( atr2 > 0.001817 )
								if( dn <= 0.095749 )
									ret := -0.357143
								if( dn > 0.095749 )
									ret := -1.000000 // sell
					if( dn1 > 0.097406 )
						if( dn1 <= 0.104434 )
							if( up <= 0.098794 )
								if( up1 <= 0.089671 )
									ret := 0.313953
								if( up1 > 0.089671 )
									ret := -0.070769
							if( up > 0.098794 )
								if( atr2 <= 0.000572 )
									ret := 0.000000
								if( atr2 > 0.000572 )
									ret := -0.839286 // sell
						if( dn1 > 0.104434 )
							if( up1 <= 0.102917 )
								if( atr <= 0.001729 )
									ret := 0.293967
								if( atr > 0.001729 )
									ret := -0.288889
							if( up1 > 0.102917 )
								if( up <= 0.109426 )
									ret := -0.089335
								if( up > 0.109426 )
									ret := 0.028411
				if( atr2 > 0.002397 )
					if( dn1 <= 0.281012 )
						if( up <= 0.18028 )
							if( atr2 <= 0.003632 )
								if( up <= 0.172161 )
									ret := 0.334802
								if( up > 0.172161 )
									ret := -0.469388
							if( atr2 > 0.003632 )
								if( atr <= 0.003623 )
									ret := -0.730159 // sell
								if( atr > 0.003623 )
									ret := -0.042683
						if( up > 0.18028 )
							if( up <= 0.249956 )
								if( dn <= 0.226276 )
									ret := 1.000000 // buy
								if( dn > 0.226276 )
									ret := 0.576923
							if( up > 0.249956 )
								if( up <= 0.26368 )
									ret := 0.387500
								if( up > 0.26368 )
									ret := -0.068966
					if( dn1 > 0.281012 )
						if( atr <= 0.004769 )
							if( up <= 0.26631 )
								if( dn1 <= 0.291669 )
									ret := -0.245614
								if( dn1 > 0.291669 )
									ret := -1.000000 // sell
							if( up > 0.26631 )
								if( atr2 <= 0.003465 )
									ret := 0.141865
								if( atr2 > 0.003465 )
									ret := 0.038961
						if( atr > 0.004769 )
							if( atr <= 0.004886 )
								if( atr2 <= 0.004892 )
									ret := -0.126214
								if( atr2 > 0.004892 )
									ret := -0.526316
							if( atr > 0.004886 )
								if( dn1 <= 0.382398 )
									ret := -0.095238
								if( dn1 > 0.382398 )
									ret := 0.441176
			if( dn1 > 0.395339 )
				if( dn <= 0.428144 )
					if( dn1 <= 0.417712 )
						if( dn <= 0.406739 )
							if( up1 <= 0.377934 )
								if( dn1 <= 0.396778 )
									ret := -0.185841
								if( dn1 > 0.396778 )
									ret := 0.298165
							if( up1 > 0.377934 )
								if( up1 <= 0.396007 )
									ret := -0.129595
								if( up1 > 0.396007 )
									ret := 0.324324
						if( dn > 0.406739 )
							if( up <= 0.387803 )
								if( dn <= 0.408147 )
									ret := -0.142857
								if( dn > 0.408147 )
									ret := 0.578947
							if( up > 0.387803 )
								if( atr <= 0.004046 )
									ret := 0.065778
								if( atr > 0.004046 )
									ret := -0.348485
					if( dn1 > 0.417712 )
						if( dn1 <= 0.428529 )
							if( atr <= 0.002323 )
								if( up <= 0.406291 )
									ret := 0.642857
								if( up > 0.406291 )
									ret := -0.137500
							if( atr > 0.002323 )
								if( up1 <= 0.398614 )
									ret := -0.071795
								if( up1 > 0.398614 )
									ret := -0.446860
						if( dn1 > 0.428529 )
							if( up1 <= 0.408028 )
								if( atr <= 0.004126 )
									ret := -0.600000
								if( atr > 0.004126 )
									ret := 0.000000
							if( up1 > 0.408028 )
								if( dn <= 0.427454 )
									ret := 1.000000 // buy
								if( dn > 0.427454 )
									ret := 0.333333
				if( dn > 0.428144 )
					if( dn <= 0.482716 )
						if( dn <= 0.479099 )
							if( dn <= 0.459585 )
								if( up <= 0.438364 )
									ret := 0.056461
								if( up > 0.438364 )
									ret := 0.240088
							if( dn > 0.459585 )
								if( atr <= 0.004966 )
									ret := -0.027126
								if( atr > 0.004966 )
									ret := 0.395349
						if( dn > 0.479099 )
							if( atr2 <= 0.00317 )
								if( up <= 0.470025 )
									ret := 0.000000
								if( up > 0.470025 )
									ret := 0.555556
							if( atr2 > 0.00317 )
								if( up1 <= 0.458771 )
									ret := 0.333333
								if( up1 > 0.458771 )
									ret := 0.607143
					if( dn > 0.482716 )
						if( up <= 0.466191 )
							if( atr <= 0.004064 )
								if( up <= 0.464358 )
									ret := -0.235294
								if( up > 0.464358 )
									ret := -0.750000 // sell
							if( atr > 0.004064 )
								if( up1 <= 0.460321 )
									ret := -0.355769
								if( up1 > 0.460321 )
									ret := 0.029126
						if( up > 0.466191 )
							if( up <= 0.470702 )
								if( dn <= 0.490232 )
									ret := -0.086957
								if( dn > 0.490232 )
									ret := 0.525424
							if( up > 0.470702 )
								if( atr <= 0.00498 )
									ret := -0.031823
								if( atr > 0.00498 )
									ret := -0.252577
		if( atr > 0.005053 )
			if( dn <= 0.544049 )
				if( atr <= 0.011611 )
					if( dn <= 0.323616 )
						if( atr2 <= 0.007764 )
							if( dn <= 0.316015 )
								if( atr2 <= 0.005834 )
									ret := 0.168950
								if( atr2 > 0.005834 )
									ret := 0.463415
							if( dn > 0.316015 )
								if( dn <= 0.320988 )
									ret := 0.981132 // buy
								if( dn > 0.320988 )
									ret := 0.696970
						if( atr2 > 0.007764 )
							if( atr <= 0.009486 )
								if( up1 <= 0.139891 )
									ret := -0.777778 // sell
								if( up1 > 0.139891 )
									ret := -0.035928
							if( atr > 0.009486 )
								if( dn <= 0.292521 )
									ret := -0.205882
								if( dn > 0.292521 )
									ret := 0.548077
					if( dn > 0.323616 )
						if( up1 <= 0.281838 )
							if( atr <= 0.010108 )
								if( atr2 <= 0.009104 )
									ret := -0.775510 // sell
								if( atr2 > 0.009104 )
									ret := -0.953125 // sell
							if( atr > 0.010108 )
								if( atr2 <= 0.010566 )
									ret := 0.791667 // buy
								if( atr2 > 0.010566 )
									ret := -0.750000 // sell
						if( up1 > 0.281838 )
							if( dn <= 0.329031 )
								if( atr <= 0.006857 )
									ret := 0.750000 // buy
								if( atr > 0.006857 )
									ret := 0.000000
							if( dn > 0.329031 )
								if( dn <= 0.432364 )
									ret := 0.067168
								if( dn > 0.432364 )
									ret := 0.169877
				if( atr > 0.011611 )
					if( dn1 <= 0.491505 )
						if( atr <= 0.01645 )
							if( atr2 <= 0.011069 )
								if( dn1 <= 0.344972 )
									ret := 1.000000 // buy
								if( dn1 > 0.344972 )
									ret := 0.714286 // buy
							if( atr2 > 0.011069 )
								if( up1 <= 0.259519 )
									ret := 0.452055
								if( up1 > 0.259519 )
									ret := 0.103226
						if( atr > 0.01645 )
							if( up <= 0.359546 )
								if( atr <= 0.017081 )
									ret := -0.750000 // sell
								if( atr > 0.017081 )
									ret := 0.375000
							if( up > 0.359546 )
								ret := -1.000000 // sell
					if( dn1 > 0.491505 )
						if( dn1 <= 0.543054 )
							if( dn <= 0.530824 )
								if( dn <= 0.522088 )
									ret := 0.494845
								if( dn > 0.522088 )
									ret := 0.833333 // buy
							if( dn > 0.530824 )
								if( atr <= 0.02169 )
									ret := 0.220000
								if( atr > 0.02169 )
									ret := -0.875000 // sell
						if( dn1 > 0.543054 )
							if( up <= 0.458778 )
								if( atr <= 0.016844 )
									ret := 0.500000
								if( atr > 0.016844 )
									ret := 1.000000 // buy
							if( up > 0.458778 )
								ret := 1.000000 // buy
			if( dn > 0.544049 )
				if( dn <= 0.559557 )
					if( atr <= 0.008588 )
						if( up <= 0.506359 )
							if( atr <= 0.008106 )
								if( up <= 0.504515 )
									ret := -0.826087 // sell
								if( up > 0.504515 )
									ret := -1.000000 // sell
							if( atr > 0.008106 )
								if( up <= 0.501375 )
									ret := -1.000000 // sell
								if( up > 0.501375 )
									ret := -0.250000
						if( up > 0.506359 )
							if( dn1 <= 0.556801 )
								if( dn <= 0.548366 )
									ret := 0.159091
								if( dn > 0.548366 )
									ret := -0.227941
							if( dn1 > 0.556801 )
								if( dn <= 0.557126 )
									ret := -0.800000 // sell
								if( dn > 0.557126 )
									ret := -0.473684
					if( atr > 0.008588 )
						if( dn <= 0.553705 )
							if( atr <= 0.015211 )
								if( atr2 <= 0.008874 )
									ret := 0.800000 // buy
								if( atr2 > 0.008874 )
									ret := 0.029412
							if( atr > 0.015211 )
								if( atr <= 0.020976 )
									ret := 0.800000 // buy
								if( atr > 0.020976 )
									ret := 1.000000 // buy
						if( dn > 0.553705 )
							if( atr2 <= 0.011398 )
								if( dn <= 0.557003 )
									ret := -0.187500
								if( dn > 0.557003 )
									ret := 0.550000
							if( atr2 > 0.011398 )
								if( atr <= 0.020581 )
									ret := -1.000000 // sell
								if( atr > 0.020581 )
									ret := 0.500000
				if( dn > 0.559557 )
					if( dn <= 1.44919 )
						if( up <= 0.583757 )
							if( up1 <= 0.510449 )
								if( dn1 <= 0.600493 )
									ret := 0.004367
								if( dn1 > 0.600493 )
									ret := -0.740000 // sell
							if( up1 > 0.510449 )
								if( dn <= 0.643864 )
									ret := 0.165862
								if( dn > 0.643864 )
									ret := 0.359223
						if( up > 0.583757 )
							if( dn <= 0.729496 )
								if( atr <= 0.01848 )
									ret := -0.102515
								if( atr > 0.01848 )
									ret := -0.925926 // sell
							if( dn > 0.729496 )
								if( dn1 <= 1.42252 )
									ret := 0.079243
								if( dn1 > 1.42252 )
									ret := -0.500000
					if( dn > 1.44919 )
						if( up1 <= 1.28297 )
							if( atr2 <= 0.04859 )
								if( dn <= 1.51873 )
									ret := 0.902985 // buy
								if( dn > 1.51873 )
									ret := 0.000000
							if( atr2 > 0.04859 )
								if( dn <= 1.46479 )
									ret := -0.769231 // sell
								if( dn > 1.46479 )
									ret := 0.292308
						if( up1 > 1.28297 )
							if( atr <= 0.029794 )
								ret := 1.000000 // buy
							if( atr > 0.029794 )
								if( dn <= 1.50903 )
									ret := -0.920000 // sell
								if( dn > 1.50903 )
									ret := 0.187500
	if( up > 1.30436 )
		if( atr2 <= 0.021505 )
			if( up1 <= 2.13533 )
				if( dn <= 1.41416 )
					if( dn1 <= 1.36895 )
						if( atr2 <= 0.006793 )
							if( dn1 <= 1.35407 )
								if( atr2 <= 0.005707 )
									ret := 1.000000 // buy
								if( atr2 > 0.005707 )
									ret := 0.500000
							if( dn1 > 1.35407 )
								if( up <= 1.32523 )
									ret := 0.666667
								if( up > 1.32523 )
									ret := 0.000000
						if( atr2 > 0.006793 )
							if( atr <= 0.008203 )
								if( dn <= 1.35471 )
									ret := -0.750000 // sell
								if( dn > 1.35471 )
									ret := -0.200000
							if( atr > 0.008203 )
								if( atr2 <= 0.01105 )
									ret := 0.324675
								if( atr2 > 0.01105 )
									ret := -0.800000 // sell
					if( dn1 > 1.36895 )
						if( up1 <= 1.29808 )
							if( up1 <= 1.29101 )
								ret := -0.500000
							if( up1 > 1.29101 )
								if( dn <= 1.40295 )
									ret := 0.750000 // buy
								if( dn > 1.40295 )
									ret := -0.250000
						if( up1 > 1.29808 )
							if( atr2 <= 0.013037 )
								if( up <= 1.31001 )
									ret := -0.777778 // sell
								if( up > 1.31001 )
									ret := -0.268657
							if( atr2 > 0.013037 )
								if( dn1 <= 1.38908 )
									ret := 0.500000
								if( dn1 > 1.38908 )
									ret := -0.256604
				if( dn > 1.41416 )
					if( up <= 1.99585 )
						if( atr2 <= 0.01165 )
							if( up <= 1.92115 )
								if( dn <= 1.50997 )
									ret := 0.208955
								if( dn > 1.50997 )
									ret := -0.242553
							if( up > 1.92115 )
								if( up <= 1.94575 )
									ret := 0.691176
								if( up > 1.94575 )
									ret := 0.013158
						if( atr2 > 0.01165 )
							if( dn1 <= 1.41873 )
								if( dn1 <= 1.41525 )
									ret := 0.000000
								if( dn1 > 1.41525 )
									ret := 0.850000 // buy
							if( dn1 > 1.41873 )
								if( atr <= 0.017401 )
									ret := -0.131450
								if( atr > 0.017401 )
									ret := 0.022367
					if( up > 1.99585 )
						if( atr2 <= 0.019879 )
							if( up1 <= 2.00737 )
								if( atr <= 0.009797 )
									ret := 0.000000
								if( atr > 0.009797 )
									ret := 0.589041
							if( up1 > 2.00737 )
								if( dn1 <= 2.12352 )
									ret := -0.185567
								if( dn1 > 2.12352 )
									ret := 0.171790
						if( atr2 > 0.019879 )
							if( up1 <= 2.13252 )
								if( atr <= 0.024003 )
									ret := -0.354167
								if( atr > 0.024003 )
									ret := 0.545455
							if( up1 > 2.13252 )
								ret := 0.500000
			if( up1 > 2.13533 )
				if( dn1 <= 2.47646 )
					if( up <= 2.34984 )
						if( atr2 <= 0.020259 )
							if( dn <= 2.19886 )
								ret := 0.750000 // buy
							if( dn > 2.19886 )
								if( up <= 2.22768 )
									ret := -0.234192
								if( up > 2.22768 )
									ret := -0.385093
						if( atr2 > 0.020259 )
							if( up <= 2.26692 )
								if( dn1 <= 2.30692 )
									ret := 0.166667
								if( dn1 > 2.30692 )
									ret := -0.272727
							if( up > 2.26692 )
								if( up <= 2.31613 )
									ret := 0.800000 // buy
								if( up > 2.31613 )
									ret := -0.400000
					if( up > 2.34984 )
						if( atr2 <= 0.0184 )
							ret := 0.000000
						if( atr2 > 0.0184 )
							if( atr <= 0.021085 )
								ret := -1.000000 // sell
							if( atr > 0.021085 )
								ret := -0.750000 // sell
				if( dn1 > 2.47646 )
					if( dn <= 2.93884 )
						if( atr2 <= 0.020467 )
							if( up <= 2.54718 )
								ret := 0.000000
							if( up > 2.54718 )
								if( dn <= 2.86505 )
									ret := 1.000000 // buy
								if( dn > 2.86505 )
									ret := 0.357143
						if( atr2 > 0.020467 )
							if( dn <= 2.86213 )
								if( up <= 2.56932 )
									ret := 0.000000
								if( up > 2.56932 )
									ret := 0.750000 // buy
							if( dn > 2.86213 )
								if( atr2 <= 0.021149 )
									ret := -1.000000 // sell
								if( atr2 > 0.021149 )
									ret := -0.250000
					if( dn > 2.93884 )
						if( up1 <= 2.87534 )
							if( up1 <= 2.85156 )
								if( up <= 2.82338 )
									ret := -0.750000 // sell
								if( up > 2.82338 )
									ret := -0.066667
							if( up1 > 2.85156 )
								if( dn1 <= 2.96235 )
									ret := -1.000000 // sell
								if( dn1 > 2.96235 )
									ret := -0.461538
						if( up1 > 2.87534 )
							if( dn1 <= 3.03003 )
								ret := 0.000000
							if( dn1 > 3.03003 )
								ret := -0.250000
		if( atr2 > 0.021505 )
			if( up1 <= 1.97996 )
				if( dn <= 2.06453 )
					if( up1 <= 1.40507 )
						if( atr <= 0.0252 )
							if( up <= 1.39975 )
								if( dn <= 1.50513 )
									ret := -0.081081
								if( dn > 1.50513 )
									ret := -0.545455
							if( up > 1.39975 )
								if( dn <= 1.52534 )
									ret := 1.000000 // buy
								if( dn > 1.52534 )
									ret := 0.636364
						if( atr > 0.0252 )
							if( atr2 <= 0.050435 )
								if( dn <= 1.55982 )
									ret := 0.137072
								if( dn > 1.55982 )
									ret := 0.537500
							if( atr2 > 0.050435 )
								if( up <= 1.38579 )
									ret := -0.434211
								if( up > 1.38579 )
									ret := 0.687500
					if( up1 > 1.40507 )
						if( dn <= 1.60117 )
							if( dn1 <= 1.57534 )
								if( atr <= 0.025334 )
									ret := 0.666667
								if( atr > 0.025334 )
									ret := -0.583333
							if( dn1 > 1.57534 )
								if( atr2 <= 0.030355 )
									ret := -0.844156 // sell
								if( atr2 > 0.030355 )
									ret := -0.142857
						if( dn > 1.60117 )
							if( dn <= 1.6274 )
								if( up <= 1.44608 )
									ret := 0.541176
								if( up > 1.44608 )
									ret := 0.175824
							if( dn > 1.6274 )
								if( up <= 1.44795 )
									ret := -0.524272
								if( up > 1.44795 )
									ret := 0.014660
				if( dn > 2.06453 )
					if( up <= 1.66404 )
						ret := -1.000000 // sell
					if( up > 1.66404 )
						if( up <= 1.86746 )
							if( dn <= 2.15823 )
								if( dn <= 2.11184 )
									ret := 0.819444 // buy
								if( dn > 2.11184 )
									ret := 0.222222
							if( dn > 2.15823 )
								ret := 1.000000 // buy
						if( up > 1.86746 )
							if( up1 <= 1.91455 )
								if( atr <= 0.031652 )
									ret := 1.000000 // buy
								if( atr > 0.031652 )
									ret := -0.030303
							if( up1 > 1.91455 )
								if( dn1 <= 2.34387 )
									ret := 0.448387
								if( dn1 > 2.34387 )
									ret := -0.257143
			if( up1 > 1.97996 )
				if( atr2 <= 0.03651 )
					if( dn <= 2.43975 )
						if( dn <= 2.29973 )
							if( dn <= 2.26831 )
								if( atr2 <= 0.031055 )
									ret := 0.134259
								if( atr2 > 0.031055 )
									ret := -0.484848
							if( dn > 2.26831 )
								if( up1 <= 2.10178 )
									ret := 0.133333
								if( up1 > 2.10178 )
									ret := 0.600000
						if( dn > 2.29973 )
							if( atr <= 0.034915 )
								if( dn1 <= 2.37118 )
									ret := -0.259615
								if( dn1 > 2.37118 )
									ret := -0.568627
							if( atr > 0.034915 )
								if( atr2 <= 0.032353 )
									ret := 0.733333 // buy
								if( atr2 > 0.032353 )
									ret := -0.152174
					if( dn > 2.43975 )
						if( dn1 <= 2.93658 )
							if( atr <= 0.025489 )
								if( up1 <= 2.77692 )
									ret := -0.178082
								if( up1 > 2.77692 )
									ret := 0.750000 // buy
							if( atr > 0.025489 )
								if( dn <= 2.48076 )
									ret := 0.553846
								if( dn > 2.48076 )
									ret := 0.227113
						if( dn1 > 2.93658 )
							if( up <= 2.82539 )
								if( atr2 <= 0.034231 )
									ret := -0.416667
								if( atr2 > 0.034231 )
									ret := 0.285714
							if( up > 2.82539 )
								if( dn <= 3.02422 )
									ret := 0.380952
								if( dn > 3.02422 )
									ret := -0.340909
				if( atr2 > 0.03651 )
					if( up1 <= 2.07726 )
						if( up <= 2.00449 )
							if( dn1 <= 2.28559 )
								if( up1 <= 1.98223 )
									ret := -0.250000
								if( up1 > 1.98223 )
									ret := -0.937500 // sell
							if( dn1 > 2.28559 )
								if( atr <= 0.052759 )
									ret := 1.000000 // buy
								if( atr > 0.052759 )
									ret := 0.000000
						if( up > 2.00449 )
							if( up <= 2.03926 )
								if( dn <= 2.21568 )
									ret := -0.125000
								if( dn > 2.21568 )
									ret := -0.887640 // sell
							if( up > 2.03926 )
								if( atr <= 0.046055 )
									ret := -0.653846
								if( atr > 0.046055 )
									ret := -0.086957
					if( up1 > 2.07726 )
						if( atr <= 0.066904 )
							if( up <= 2.5001 )
								if( dn1 <= 2.67749 )
									ret := -0.089286
								if( dn1 > 2.67749 )
									ret := -0.441379
							if( up > 2.5001 )
								if( up <= 2.60675 )
									ret := 0.508772
								if( up > 2.60675 )
									ret := -0.202614
						if( atr > 0.066904 )
							if( atr2 <= 0.066128 )
								if( up1 <= 2.26 )
									ret := 0.142857
								if( up1 > 2.26 )
									ret := 0.666667
							if( atr2 > 0.066128 )
								if( dn1 <= 2.70143 )
									ret := 1.000000 // buy
								if( dn1 > 2.70143 )
									ret := 0.736842 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_ADAUSDT_30Min_abc54beb(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)

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


