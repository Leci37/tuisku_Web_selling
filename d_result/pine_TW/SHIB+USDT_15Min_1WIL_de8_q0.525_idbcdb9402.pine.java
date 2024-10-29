//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: SHIBUSDT_15Min_1WIL_bcdb9402 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_1WIL_bcdb9402", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_bcdb9402(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 2.83881 )
		if( wvf <= 2.1571 )
			if( lowerBand <= -0.524187 )
				if( midLine <= 1.11717 )
					if( wvf <= 1.34481 )
						if( lowerBand <= -0.827549 )
							if( wvf <= 0.754356 )
								if( Color_con2 <= -5.34575 )
									ret := -0.933333 // sell
								if( Color_con2 > -5.34575 )
									ret := -0.285714
							if( wvf > 0.754356 )
								if( Color_con2 <= -3.09539 )
									ret := 0.600000
								if( Color_con2 > -3.09539 )
									ret := 0.000000
						if( lowerBand > -0.827549 )
							if( sDev <= 1.2928 )
								if( Color_con1 <= -1.33029 )
									ret := 0.000000
								if( Color_con1 > -1.33029 )
									ret := -0.576923
							if( sDev > 1.2928 )
								if( Color_con1 <= -1.2707 )
									ret := 0.076159
								if( Color_con1 > -1.2707 )
									ret := 0.583333
					if( wvf > 1.34481 )
						if( Color_con1 <= -0.363832 )
							if( Color_con2 <= -2.09914 )
								ret := 0.714286 // buy
							if( Color_con2 > -2.09914 )
								if( sDev <= 1.904 )
									ret := -0.398058
								if( sDev > 1.904 )
									ret := -0.909091 // sell
						if( Color_con1 > -0.363832 )
							if( colInt <= 0.5 )
								if( sDev <= 1.44852 )
									ret := 0.833333 // buy
								if( sDev > 1.44852 )
									ret := 0.500000
							if( colInt > 0.5 )
								if( lowerBand <= -0.713459 )
									ret := 0.428571
								if( lowerBand > -0.713459 )
									ret := -0.380952
				if( midLine > 1.11717 )
					if( lowerBand <= -0.679918 )
						if( upperBand <= 3.8279 )
							if( wvf <= 0.500046 )
								if( Color_con2 <= -3.40523 )
									ret := -0.696970
								if( Color_con2 > -3.40523 )
									ret := -0.072727
							if( wvf > 0.500046 )
								if( Color_con2 <= -2.12491 )
									ret := 0.178295
								if( Color_con2 > -2.12491 )
									ret := -0.353846
						if( upperBand > 3.8279 )
							if( upperBand <= 4.45094 )
								if( Color_con2 <= -3.00138 )
									ret := 0.115646
								if( Color_con2 > -3.00138 )
									ret := 0.550725
							if( upperBand > 4.45094 )
								if( sDev <= 3.63735 )
									ret := 0.172365
								if( sDev > 3.63735 )
									ret := 0.010076
					if( lowerBand > -0.679918 )
						if( midLine <= 3.39218 )
							if( wvf <= 1.25854 )
								if( Color_con2 <= -3.89425 )
									ret := -0.212121
								if( Color_con2 > -3.89425 )
									ret := 0.176972
							if( wvf > 1.25854 )
								if( lowerBand <= -0.570067 )
									ret := 0.593220
								if( lowerBand > -0.570067 )
									ret := 0.137255
						if( midLine > 3.39218 )
							if( wvf <= 0.381375 )
								ret := 0.250000
							if( wvf > 0.381375 )
								if( sDev <= 5.76243 )
									ret := 0.895833 // buy
								if( sDev > 5.76243 )
									ret := 0.250000
			if( lowerBand > -0.524187 )
				if( Color_con2 <= -3.40057 )
					if( upperBand <= 7.27894 )
						if( lowerBand <= 0.062258 )
							if( Color_con2 <= -17.6701 )
								ret := 1.000000 // buy
							if( Color_con2 > -17.6701 )
								if( wvf <= 1.70513 )
									ret := -0.292173
								if( wvf > 1.70513 )
									ret := 0.182927
						if( lowerBand > 0.062258 )
							if( Color_con1 <= -5.25792 )
								if( sDev <= 3.24188 )
									ret := -0.408696
								if( sDev > 3.24188 )
									ret := 0.163636
							if( Color_con1 > -5.25792 )
								if( Color_con2 <= -6.45959 )
									ret := 0.184524
								if( Color_con2 > -6.45959 )
									ret := -0.068218
					if( upperBand > 7.27894 )
						if( Color_con1 <= -10.6796 )
							if( upperBand <= 25.0883 )
								if( Color_con2 <= -10.0422 )
									ret := 0.583333
								if( Color_con2 > -10.0422 )
									ret := -0.771739 // sell
							if( upperBand > 25.0883 )
								ret := 1.000000 // buy
						if( Color_con1 > -10.6796 )
							if( Color_con2 <= -4.14242 )
								if( sDev <= 5.72481 )
									ret := 0.139037
								if( sDev > 5.72481 )
									ret := 1.000000 // buy
							if( Color_con2 > -4.14242 )
								if( wvf <= 1.64142 )
									ret := 0.727273 // buy
								if( wvf > 1.64142 )
									ret := 0.148936
				if( Color_con2 > -3.40057 )
					if( upperBand <= 7.16914 )
						if( wvf <= 0.388076 )
							if( Color_con2 <= -1.81804 )
								if( Color_con2 <= -3.03418 )
									ret := 0.277372
								if( Color_con2 > -3.03418 )
									ret := -0.112128
							if( Color_con2 > -1.81804 )
								if( Color_con1 <= -2.55803 )
									ret := 0.353448
								if( Color_con1 > -2.55803 )
									ret := 0.080436
						if( wvf > 0.388076 )
							if( Color_con1 <= -4.68368 )
								if( Color_con1 <= -5.1681 )
									ret := -0.211538
								if( Color_con1 > -5.1681 )
									ret := 0.369637
							if( Color_con1 > -4.68368 )
								if( lowerBand <= -0.157675 )
									ret := -0.044834
								if( lowerBand > -0.157675 )
									ret := 0.010266
					if( upperBand > 7.16914 )
						if( upperBand <= 8.07887 )
							if( lowerBand <= 1.30917 )
								if( wvf <= 1.57899 )
									ret := -0.250000
								if( wvf > 1.57899 )
									ret := -0.970588 // sell
							if( lowerBand > 1.30917 )
								ret := -0.250000
						if( upperBand > 8.07887 )
							ret := 0.750000 // buy
		if( wvf > 2.1571 )
			if( sDev <= 0.778811 )
				if( Color_con2 <= -0.843336 )
					if( midLine <= 1.8206 )
						if( Color_con2 <= -1.12925 )
							ret := -1.000000 // sell
						if( Color_con2 > -1.12925 )
							ret := -0.750000 // sell
					if( midLine > 1.8206 )
						ret := 0.428571
				if( Color_con2 > -0.843336 )
					if( upperBand <= 3.225 )
						if( upperBand <= 2.88726 )
							if( sDev <= 0.626787 )
								if( Color_con2 <= -0.060009 )
									ret := 0.250000
								if( Color_con2 > -0.060009 )
									ret := 0.774194 // buy
							if( sDev > 0.626787 )
								if( wvf <= 2.75778 )
									ret := 0.317308
								if( wvf > 2.75778 )
									ret := 1.000000 // buy
						if( upperBand > 2.88726 )
							if( Color_con1 <= -0.369789 )
								if( upperBand <= 3.19158 )
									ret := 0.886792 // buy
								if( upperBand > 3.19158 )
									ret := 0.250000
							if( Color_con1 > -0.369789 )
								ret := 0.250000
					if( upperBand > 3.225 )
						if( midLine <= 2.55174 )
							ret := -1.000000 // sell
						if( midLine > 2.55174 )
							if( midLine <= 2.62389 )
								ret := 0.500000
							if( midLine > 2.62389 )
								if( sDev <= 0.661311 )
									ret := 0.000000
								if( sDev > 0.661311 )
									ret := -0.250000
			if( sDev > 0.778811 )
				if( lowerBand <= -0.198005 )
					if( sDev <= 1.85747 )
						if( Color_con2 <= -4.73252 )
							if( midLine <= 1.06363 )
								ret := 0.500000
							if( midLine > 1.06363 )
								if( lowerBand <= -0.30817 )
									ret := 1.000000 // buy
								if( lowerBand > -0.30817 )
									ret := 0.750000 // buy
						if( Color_con2 > -4.73252 )
							if( midLine <= 0.670583 )
								if( Color_con1 <= 0.56075 )
									ret := -0.750000 // sell
								if( Color_con1 > 0.56075 )
									ret := 0.735294 // buy
							if( midLine > 0.670583 )
								if( lowerBand <= -0.805115 )
									ret := 0.785714 // buy
								if( lowerBand > -0.805115 )
									ret := 0.003464
					if( sDev > 1.85747 )
						if( upperBand <= 3.70071 )
							if( sDev <= 2.07157 )
								if( Color_con2 <= 0.695036 )
									ret := -0.405941
								if( Color_con2 > 0.695036 )
									ret := 0.146341
							if( sDev > 2.07157 )
								if( sDev <= 2.30044 )
									ret := -0.767857 // sell
								if( sDev > 2.30044 )
									ret := 0.250000
						if( upperBand > 3.70071 )
							if( midLine <= 1.92102 )
								if( lowerBand <= -0.416648 )
									ret := 0.383648
								if( lowerBand > -0.416648 )
									ret := -0.245614
							if( midLine > 1.92102 )
								if( upperBand <= 4.68757 )
									ret := -0.565217
								if( upperBand > 4.68757 )
									ret := -0.142308
				if( lowerBand > -0.198005 )
					if( lowerBand <= 0.435891 )
						if( Color_con2 <= -0.60236 )
							if( sDev <= 2.521 )
								if( Color_con2 <= -2.21986 )
									ret := 0.029630
								if( Color_con2 > -2.21986 )
									ret := 0.429043
							if( sDev > 2.521 )
								if( Color_con1 <= -4.07973 )
									ret := 0.371429
								if( Color_con1 > -4.07973 )
									ret := -0.112903
						if( Color_con2 > -0.60236 )
							if( Color_con2 <= 0.905451 )
								if( lowerBand <= 0.337881 )
									ret := 0.022251
								if( lowerBand > 0.337881 )
									ret := 0.311787
							if( Color_con2 > 0.905451 )
								if( Color_con1 <= 0.279981 )
									ret := 0.404762
								if( Color_con1 > 0.279981 )
									ret := 0.098592
					if( lowerBand > 0.435891 )
						if( sDev <= 1.03466 )
							if( Color_con2 <= 0.670618 )
								if( lowerBand <= 0.833922 )
									ret := -0.296943
								if( lowerBand > 0.833922 )
									ret := -0.073604
							if( Color_con2 > 0.670618 )
								if( sDev <= 0.857622 )
									ret := 0.488372
								if( sDev > 0.857622 )
									ret := -0.105263
						if( sDev > 1.03466 )
							if( Color_con2 <= 0.690305 )
								if( Color_con1 <= -1.02867 )
									ret := 0.039143
								if( Color_con1 > -1.02867 )
									ret := 0.173913
							if( Color_con2 > 0.690305 )
								if( upperBand <= 2.82219 )
									ret := 0.400000
								if( upperBand > 2.82219 )
									ret := -0.769231 // sell
	if( wvf > 2.83881 )
		if( wvf <= 5.64245 )
			if( lowerBand <= -1.94428 )
				if( wvf <= 3.2175 )
					if( midLine <= 3.3486 )
						ret := 0.750000 // buy
					if( midLine > 3.3486 )
						if( Color_con2 <= -13.8149 )
							ret := 0.400000
						if( Color_con2 > -13.8149 )
							ret := -0.500000
				if( wvf > 3.2175 )
					if( lowerBand <= -2.74105 )
						ret := -1.000000 // sell
					if( lowerBand > -2.74105 )
						if( Color_con2 <= -1.70611 )
							if( Color_con1 <= -9.12287 )
								if( Color_con2 <= -13.1306 )
									ret := 0.000000
								if( Color_con2 > -13.1306 )
									ret := -1.000000 // sell
							if( Color_con1 > -9.12287 )
								ret := 0.666667
						if( Color_con2 > -1.70611 )
							if( wvf <= 4.90335 )
								if( sDev <= 4.25279 )
									ret := -1.000000 // sell
								if( sDev > 4.25279 )
									ret := 0.230769
							if( wvf > 4.90335 )
								if( wvf <= 5.5773 )
									ret := -0.906977 // sell
								if( wvf > 5.5773 )
									ret := -0.333333
			if( lowerBand > -1.94428 )
				if( midLine <= 6.13921 )
					if( lowerBand <= 1.33808 )
						if( Color_con2 <= 0.36128 )
							if( Color_con1 <= -2.12247 )
								if( wvf <= 5.2809 )
									ret := 0.016534
								if( wvf > 5.2809 )
									ret := -0.638889
							if( Color_con1 > -2.12247 )
								if( sDev <= 1.65246 )
									ret := -0.044226
								if( sDev > 1.65246 )
									ret := 0.174729
						if( Color_con2 > 0.36128 )
							if( midLine <= 1.96551 )
								if( Color_con2 <= 0.998328 )
									ret := 0.253049
								if( Color_con2 > 0.998328 )
									ret := 0.044734
							if( midLine > 1.96551 )
								if( Color_con1 <= 0.147679 )
									ret := 0.233247
								if( Color_con1 > 0.147679 )
									ret := 0.509934
					if( lowerBand > 1.33808 )
						if( wvf <= 4.8262 )
							if( lowerBand <= 2.74697 )
								if( lowerBand <= 1.9488 )
									ret := 0.371961
								if( lowerBand > 1.9488 )
									ret := 0.182638
							if( lowerBand > 2.74697 )
								if( upperBand <= 7.87972 )
									ret := 0.399399
								if( upperBand > 7.87972 )
									ret := 0.738462 // buy
						if( wvf > 4.8262 )
							if( midLine <= 5.31342 )
								if( Color_con1 <= -0.422648 )
									ret := 0.341912
								if( Color_con1 > -0.422648 )
									ret := -0.112676
							if( midLine > 5.31342 )
								if( upperBand <= 8.82126 )
									ret := -0.592233
								if( upperBand > 8.82126 )
									ret := 0.179487
				if( midLine > 6.13921 )
					if( wvf <= 4.12415 )
						if( lowerBand <= 1.31314 )
							if( Color_con2 <= -7.49211 )
								if( lowerBand <= 0.121643 )
									ret := 0.750000 // buy
								if( lowerBand > 0.121643 )
									ret := 1.000000 // buy
							if( Color_con2 > -7.49211 )
								if( upperBand <= 12.9742 )
									ret := 1.000000 // buy
								if( upperBand > 12.9742 )
									ret := 0.071429
						if( lowerBand > 1.31314 )
							if( upperBand <= 10.9142 )
								if( upperBand <= 9.86599 )
									ret := 0.040000
								if( upperBand > 9.86599 )
									ret := 0.833333 // buy
							if( upperBand > 10.9142 )
								if( Color_con2 <= -6.96045 )
									ret := 0.102041
								if( Color_con2 > -6.96045 )
									ret := -0.542169
					if( wvf > 4.12415 )
						if( sDev <= 7.01316 )
							if( sDev <= 2.30577 )
								if( upperBand <= 8.33582 )
									ret := -1.000000 // sell
								if( upperBand > 8.33582 )
									ret := 0.666667
							if( sDev > 2.30577 )
								if( lowerBand <= 0.671373 )
									ret := 0.900000 // buy
								if( lowerBand > 0.671373 )
									ret := -0.427778
						if( sDev > 7.01316 )
							if( wvf <= 5.55958 )
								if( midLine <= 14.6141 )
									ret := 0.793103 // buy
								if( midLine > 14.6141 )
									ret := 0.200000
							if( wvf > 5.55958 )
								ret := -0.500000
		if( wvf > 5.64245 )
			if( Color_con1 <= -0.855415 )
				if( midLine <= 4.93809 )
					if( sDev <= 5.27624 )
						if( lowerBand <= -0.113583 )
							if( sDev <= 4.5995 )
								if( Color_con2 <= 0.56178 )
									ret := 0.782609 // buy
								if( Color_con2 > 0.56178 )
									ret := -0.055172
							if( sDev > 4.5995 )
								if( wvf <= 7.33457 )
									ret := 0.773109 // buy
								if( wvf > 7.33457 )
									ret := 0.068966
						if( lowerBand > -0.113583 )
							if( Color_con2 <= 0.050996 )
								if( midLine <= 4.57101 )
									ret := -0.687500
								if( midLine > 4.57101 )
									ret := -0.054054
							if( Color_con2 > 0.050996 )
								if( wvf <= 7.07013 )
									ret := 0.323810
								if( wvf > 7.07013 )
									ret := -0.473684
					if( sDev > 5.27624 )
						if( Color_con2 <= 1.10375 )
							if( Color_con2 <= 0.285028 )
								if( midLine <= 4.27041 )
									ret := -0.600000
								if( midLine > 4.27041 )
									ret := -0.958333 // sell
							if( Color_con2 > 0.285028 )
								if( wvf <= 6.67099 )
									ret := -0.750000 // sell
								if( wvf > 6.67099 )
									ret := -0.210526
						if( Color_con2 > 1.10375 )
							if( midLine <= 4.44997 )
								if( midLine <= 3.36803 )
									ret := 0.274510
								if( midLine > 3.36803 )
									ret := -0.436782
							if( midLine > 4.44997 )
								if( Color_con1 <= -2.5728 )
									ret := 0.777778 // buy
								if( Color_con1 > -2.5728 )
									ret := -0.062500
				if( midLine > 4.93809 )
					if( sDev <= 3.61718 )
						if( upperBand <= 8.10034 )
							if( sDev <= 1.50214 )
								ret := -1.000000 // sell
							if( sDev > 1.50214 )
								if( sDev <= 2.38639 )
									ret := 0.714286 // buy
								if( sDev > 2.38639 )
									ret := 0.000000
						if( upperBand > 8.10034 )
							if( midLine <= 6.4565 )
								if( Color_con2 <= 0.406608 )
									ret := -0.521739
								if( Color_con2 > 0.406608 )
									ret := 0.368421
							if( midLine > 6.4565 )
								if( upperBand <= 9.5369 )
									ret := -0.692308
								if( upperBand > 9.5369 )
									ret := 0.183168
					if( sDev > 3.61718 )
						if( sDev <= 8.3279 )
							if( wvf <= 11.7046 )
								if( Color_con2 <= 2.84188 )
									ret := 0.372111
								if( Color_con2 > 2.84188 )
									ret := -0.487805
							if( wvf > 11.7046 )
								if( lowerBand <= 3.54962 )
									ret := 0.884211 // buy
								if( lowerBand > 3.54962 )
									ret := 0.633333
						if( sDev > 8.3279 )
							if( sDev <= 14.6675 )
								if( Color_con2 <= -0.218043 )
									ret := -0.494737
								if( Color_con2 > -0.218043 )
									ret := 0.116667
							if( sDev > 14.6675 )
								if( wvf <= 25.7624 )
									ret := 0.776119 // buy
								if( wvf > 25.7624 )
									ret := -0.440000
			if( Color_con1 > -0.855415 )
				if( lowerBand <= 0.417404 )
					if( Color_con2 <= 1.9708 )
						if( sDev <= 5.39315 )
							if( sDev <= 3.98571 )
								if( upperBand <= 6.79012 )
									ret := -0.032258
								if( upperBand > 6.79012 )
									ret := -0.676471
							if( sDev > 3.98571 )
								if( Color_con2 <= -4.21805 )
									ret := -1.000000 // sell
								if( Color_con2 > -4.21805 )
									ret := 0.634921
						if( sDev > 5.39315 )
							if( midLine <= 5.1254 )
								ret := -0.666667
							if( midLine > 5.1254 )
								ret := -1.000000 // sell
					if( Color_con2 > 1.9708 )
						if( Color_con2 <= 6.80175 )
							if( wvf <= 12.8105 )
								if( midLine <= 2.99539 )
									ret := 0.478469
								if( midLine > 2.99539 )
									ret := 0.151751
							if( wvf > 12.8105 )
								if( Color_con2 <= 5.79745 )
									ret := -1.000000 // sell
								if( Color_con2 > 5.79745 )
									ret := -0.750000 // sell
						if( Color_con2 > 6.80175 )
							if( midLine <= 9.4152 )
								if( sDev <= 5.20735 )
									ret := 0.466667
								if( sDev > 5.20735 )
									ret := 0.814815 // buy
							if( midLine > 9.4152 )
								ret := -0.500000
				if( lowerBand > 0.417404 )
					if( Color_con2 <= -3.46097 )
						ret := -1.000000 // sell
					if( Color_con2 > -3.46097 )
						if( sDev <= 2.69936 )
							if( Color_con2 <= 2.43575 )
								if( Color_con1 <= -0.098943 )
									ret := 0.521739
								if( Color_con1 > -0.098943 )
									ret := 0.116505
							if( Color_con2 > 2.43575 )
								if( midLine <= 3.31479 )
									ret := 0.428571
								if( midLine > 3.31479 )
									ret := 0.947368 // buy
						if( sDev > 2.69936 )
							if( lowerBand <= 3.27613 )
								if( sDev <= 4.62077 )
									ret := 0.671233
								if( sDev > 4.62077 )
									ret := 0.977273 // buy
							if( lowerBand > 3.27613 )
								if( lowerBand <= 3.57494 )
									ret := -1.000000 // sell
								if( lowerBand > 3.57494 )
									ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_SHIBUSDT_15Min_bcdb9402(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)

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


