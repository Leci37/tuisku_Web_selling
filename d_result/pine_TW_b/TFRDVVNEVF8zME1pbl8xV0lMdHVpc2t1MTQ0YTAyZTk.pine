//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: LTCUSDT_30Min_1WIL_144a02e9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1WIL_144a02e9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_144a02e9(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 1.73983 )
		if( Color_con2 <= -9.25731 )
			if( lowerBand <= -0.758793 )
				if( midLine <= 11.0579 )
					if( wvf <= 0.859857 )
						if( wvf <= 0.845763 )
							if( Color_con2 <= -11.0346 )
								if( sDev <= 4.42422 )
									ret := 0.000000
								if( sDev > 4.42422 )
									ret := -0.568182
							if( Color_con2 > -11.0346 )
								if( midLine <= 5.07551 )
									ret := -0.083333
								if( midLine > 5.07551 )
									ret := 0.500000
						if( wvf > 0.845763 )
							ret := 0.600000
					if( wvf > 0.859857 )
						if( sDev <= 9.84009 )
							if( Color_con2 <= -9.55464 )
								if( lowerBand <= -3.7042 )
									ret := -0.380952
								if( lowerBand > -3.7042 )
									ret := -0.781250 // sell
							if( Color_con2 > -9.55464 )
								if( lowerBand <= -1.84136 )
									ret := -0.857143 // sell
								if( lowerBand > -1.84136 )
									ret := 0.500000
						if( sDev > 9.84009 )
							if( Color_con2 <= -12.7116 )
								if( sDev <= 11.1009 )
									ret := -1.000000 // sell
								if( sDev > 11.1009 )
									ret := -0.538462
							if( Color_con2 > -12.7116 )
								if( Color_con1 <= -16.9725 )
									ret := -0.727273 // sell
								if( Color_con1 > -16.9725 )
									ret := 0.028571
				if( midLine > 11.0579 )
					ret := 1.000000 // buy
			if( lowerBand > -0.758793 )
				if( sDev <= 3.16987 )
					if( Color_con1 <= -4.54744 )
						if( upperBand <= 5.53355 )
							ret := -0.500000
						if( upperBand > 5.53355 )
							ret := -1.000000 // sell
					if( Color_con1 > -4.54744 )
						if( Color_con1 <= -0.357985 )
							if( midLine <= 1.70295 )
								if( Color_con1 <= -1.76425 )
									ret := -0.868421 // sell
								if( Color_con1 > -1.76425 )
									ret := -0.200000
							if( midLine > 1.70295 )
								if( wvf <= 1.16171 )
									ret := 0.239437
								if( wvf > 1.16171 )
									ret := -0.283333
						if( Color_con1 > -0.357985 )
							if( wvf <= 1.54852 )
								ret := 1.000000 // buy
							if( wvf > 1.54852 )
								ret := 0.500000
				if( sDev > 3.16987 )
					if( sDev <= 5.54872 )
						if( lowerBand <= 0.521901 )
							if( lowerBand <= 0.371372 )
								if( Color_con2 <= -10.7593 )
									ret := 0.846154 // buy
								if( Color_con2 > -10.7593 )
									ret := 0.400000
							if( lowerBand > 0.371372 )
								ret := -0.500000
						if( lowerBand > 0.521901 )
							ret := 1.000000 // buy
					if( sDev > 5.54872 )
						if( wvf <= 0.555904 )
							if( Color_con2 <= -9.94912 )
								ret := -0.750000 // sell
							if( Color_con2 > -9.94912 )
								ret := -1.000000 // sell
						if( wvf > 0.555904 )
							if( Color_con2 <= -11.0182 )
								if( Color_con1 <= -17.6362 )
									ret := 0.000000
								if( Color_con1 > -17.6362 )
									ret := -0.600000
							if( Color_con2 > -11.0182 )
								if( Color_con2 <= -10.4808 )
									ret := 0.800000 // buy
								if( Color_con2 > -10.4808 )
									ret := -0.090909
		if( Color_con2 > -9.25731 )
			if( lowerBand <= 0.302623 )
				if( Color_con2 <= -1.00875 )
					if( upperBand <= 3.7065 )
						if( wvf <= 0.711758 )
							if( Color_con2 <= -2.8196 )
								if( upperBand <= 2.7873 )
									ret := -0.040070
								if( upperBand > 2.7873 )
									ret := -0.192661
							if( Color_con2 > -2.8196 )
								if( upperBand <= 1.53579 )
									ret := -0.056965
								if( upperBand > 1.53579 )
									ret := 0.037136
						if( wvf > 0.711758 )
							if( Color_con2 <= -1.72327 )
								if( Color_con2 <= -2.57575 )
									ret := -0.081900
								if( Color_con2 > -2.57575 )
									ret := -0.177792
							if( Color_con2 > -1.72327 )
								if( midLine <= 0.568793 )
									ret := -0.359223
								if( midLine > 0.568793 )
									ret := -0.015419
					if( upperBand > 3.7065 )
						if( midLine <= 1.47038 )
							if( lowerBand <= -1.54583 )
								if( Color_con2 <= -4.13744 )
									ret := 0.222222
								if( Color_con2 > -4.13744 )
									ret := -0.750000 // sell
							if( lowerBand > -1.54583 )
								if( Color_con2 <= -3.36639 )
									ret := 0.019608
								if( Color_con2 > -3.36639 )
									ret := 0.637363
						if( midLine > 1.47038 )
							if( lowerBand <= -1.79101 )
								if( sDev <= 6.43616 )
									ret := -0.032787
								if( sDev > 6.43616 )
									ret := -0.719298 // sell
							if( lowerBand > -1.79101 )
								if( Color_con1 <= -8.52007 )
									ret := 0.325301
								if( Color_con1 > -8.52007 )
									ret := 0.008629
				if( Color_con2 > -1.00875 )
					if( lowerBand <= 0.117694 )
						if( Color_con1 <= -3.89173 )
							if( midLine <= 2.27946 )
								ret := -0.750000 // sell
							if( midLine > 2.27946 )
								ret := -1.000000 // sell
						if( Color_con1 > -3.89173 )
							if( Color_con2 <= 0.681237 )
								if( Color_con1 <= -0.408554 )
									ret := 0.075196
								if( Color_con1 > -0.408554 )
									ret := -0.000734
							if( Color_con2 > 0.681237 )
								if( sDev <= 0.899592 )
									ret := 0.571429
								if( sDev > 0.899592 )
									ret := 0.000000
					if( lowerBand > 0.117694 )
						if( wvf <= 1.00051 )
							if( upperBand <= 1.11816 )
								if( sDev <= 0.305925 )
									ret := 0.051948
								if( sDev > 0.305925 )
									ret := -0.118644
							if( upperBand > 1.11816 )
								if( wvf <= 0.275216 )
									ret := 0.470588
								if( wvf > 0.275216 )
									ret := 0.083205
						if( wvf > 1.00051 )
							if( Color_con1 <= 0.040043 )
								if( Color_con1 <= 0.019142 )
									ret := -0.133934
								if( Color_con1 > 0.019142 )
									ret := -0.764706 // sell
							if( Color_con1 > 0.040043 )
								if( Color_con1 <= 0.05838 )
									ret := 0.466667
								if( Color_con1 > 0.05838 )
									ret := 0.109091
			if( lowerBand > 0.302623 )
				if( upperBand <= 1.17688 )
					if( sDev <= 0.336489 )
						if( lowerBand <= 0.330438 )
							if( lowerBand <= 0.31155 )
								ret := 0.000000
							if( lowerBand > 0.31155 )
								ret := 0.285714
						if( lowerBand > 0.330438 )
							if( upperBand <= 1.00505 )
								ret := 0.000000
							if( upperBand > 1.00505 )
								if( sDev <= 0.302565 )
									ret := -0.500000
								if( sDev > 0.302565 )
									ret := 0.000000
					if( sDev > 0.336489 )
						if( upperBand <= 1.07412 )
							if( lowerBand <= 0.33935 )
								if( lowerBand <= 0.31124 )
									ret := -0.250000
								if( lowerBand > 0.31124 )
									ret := -0.846154 // sell
							if( lowerBand > 0.33935 )
								if( Color_con1 <= -0.343982 )
									ret := -0.153846
								if( Color_con1 > -0.343982 )
									ret := -0.875000 // sell
						if( upperBand > 1.07412 )
							if( Color_con1 <= -0.531922 )
								if( wvf <= 0.524508 )
									ret := -0.153846
								if( wvf > 0.524508 )
									ret := -0.800000 // sell
							if( Color_con1 > -0.531922 )
								if( lowerBand <= 0.326595 )
									ret := -0.176471
								if( lowerBand > 0.326595 )
									ret := 0.026316
				if( upperBand > 1.17688 )
					if( upperBand <= 1.99057 )
						if( sDev <= 0.681231 )
							if( Color_con1 <= -0.966787 )
								if( upperBand <= 1.78606 )
									ret := -0.195531
								if( upperBand > 1.78606 )
									ret := 0.078125
							if( Color_con1 > -0.966787 )
								if( Color_con2 <= -1.87671 )
									ret := -0.130435
								if( Color_con2 > -1.87671 )
									ret := 0.124539
						if( sDev > 0.681231 )
							if( Color_con2 <= -1.57126 )
								if( Color_con2 <= -2.71833 )
									ret := 0.184211
								if( Color_con2 > -2.71833 )
									ret := 0.660550
							if( Color_con2 > -1.57126 )
								if( Color_con1 <= -1.44043 )
									ret := -0.387097
								if( Color_con1 > -1.44043 )
									ret := 0.207407
					if( upperBand > 1.99057 )
						if( sDev <= 0.720303 )
							if( midLine <= 1.57961 )
								if( lowerBand <= 0.850782 )
									ret := -0.189873
								if( lowerBand > 0.850782 )
									ret := 0.230769
							if( midLine > 1.57961 )
								if( upperBand <= 2.30165 )
									ret := -0.743902 // sell
								if( upperBand > 2.30165 )
									ret := -0.303922
						if( sDev > 0.720303 )
							if( wvf <= 1.66478 )
								if( Color_con1 <= -0.62516 )
									ret := 0.043688
								if( Color_con1 > -0.62516 )
									ret := 0.424242
							if( wvf > 1.66478 )
								if( Color_con1 <= -8.49015 )
									ret := -1.000000 // sell
								if( Color_con1 > -8.49015 )
									ret := -0.091852
	if( wvf > 1.73983 )
		if( Color_con2 <= 2.50839 )
			if( Color_con2 <= -2.75653 )
				if( upperBand <= 15.3033 )
					if( midLine <= 6.32259 )
						if( Color_con2 <= -9.0964 )
							if( Color_con1 <= -1.04211 )
								if( midLine <= 4.23893 )
									ret := -0.285714
								if( midLine > 4.23893 )
									ret := 0.066327
							if( Color_con1 > -1.04211 )
								if( Color_con2 <= -10.408 )
									ret := 0.500000
								if( Color_con2 > -10.408 )
									ret := -0.222222
						if( Color_con2 > -9.0964 )
							if( upperBand <= 8.37907 )
								if( midLine <= 3.20535 )
									ret := 0.209407
								if( midLine > 3.20535 )
									ret := 0.051437
							if( upperBand > 8.37907 )
								if( Color_con1 <= -6.4291 )
									ret := 0.226562
								if( Color_con1 > -6.4291 )
									ret := 0.458167
					if( midLine > 6.32259 )
						if( wvf <= 5.94253 )
							if( Color_con2 <= -7.4389 )
								if( Color_con2 <= -12.0997 )
									ret := 0.687500
								if( Color_con2 > -12.0997 )
									ret := -0.650000
							if( Color_con2 > -7.4389 )
								if( sDev <= 6.33408 )
									ret := -0.174873
								if( sDev > 6.33408 )
									ret := 0.510638
						if( wvf > 5.94253 )
							if( upperBand <= 12.5058 )
								if( Color_con2 <= -5.3737 )
									ret := -0.937500 // sell
								if( Color_con2 > -5.3737 )
									ret := -0.125000
							if( upperBand > 12.5058 )
								if( midLine <= 10.2384 )
									ret := 0.831325 // buy
								if( midLine > 10.2384 )
									ret := -0.153846
				if( upperBand > 15.3033 )
					if( upperBand <= 20.8358 )
						if( Color_con1 <= -13.2683 )
							if( Color_con2 <= -10.0807 )
								if( midLine <= 11.5445 )
									ret := 0.728261 // buy
								if( midLine > 11.5445 )
									ret := -0.800000 // sell
							if( Color_con2 > -10.0807 )
								if( sDev <= 7.58689 )
									ret := 0.470588
								if( sDev > 7.58689 )
									ret := -0.436364
						if( Color_con1 > -13.2683 )
							if( upperBand <= 16.6006 )
								if( lowerBand <= 3.60053 )
									ret := 0.649485
								if( lowerBand > 3.60053 )
									ret := 0.081967
							if( upperBand > 16.6006 )
								if( midLine <= 13.3064 )
									ret := 0.807292 // buy
								if( midLine > 13.3064 )
									ret := -0.285714
					if( upperBand > 20.8358 )
						if( upperBand <= 27.8944 )
							if( sDev <= 5.92089 )
								if( Color_con2 <= -6.47849 )
									ret := -0.750000 // sell
								if( Color_con2 > -6.47849 )
									ret := -1.000000 // sell
							if( sDev > 5.92089 )
								if( sDev <= 6.98585 )
									ret := 0.820000 // buy
								if( sDev > 6.98585 )
									ret := -0.085185
						if( upperBand > 27.8944 )
							if( midLine <= 22.2984 )
								if( sDev <= 10.7313 )
									ret := 0.972973 // buy
								if( sDev > 10.7313 )
									ret := 0.641509
							if( midLine > 22.2984 )
								ret := -1.000000 // sell
			if( Color_con2 > -2.75653 )
				if( sDev <= 4.24435 )
					if( upperBand <= 7.31169 )
						if( sDev <= 3.23727 )
							if( wvf <= 5.21468 )
								if( lowerBand <= 2.14056 )
									ret := 0.081154
								if( lowerBand > 2.14056 )
									ret := -0.075716
							if( wvf > 5.21468 )
								if( midLine <= 5.00191 )
									ret := 0.284624
								if( midLine > 5.00191 )
									ret := -0.454545
						if( sDev > 3.23727 )
							if( wvf <= 2.59197 )
								if( Color_con2 <= -1.29243 )
									ret := 0.521127
								if( Color_con2 > -1.29243 )
									ret := -0.833333 // sell
							if( wvf > 2.59197 )
								if( sDev <= 4.04577 )
									ret := -0.129271
								if( sDev > 4.04577 )
									ret := 0.311475
					if( upperBand > 7.31169 )
						if( upperBand <= 8.3355 )
							if( wvf <= 7.55435 )
								if( sDev <= 3.65057 )
									ret := 0.215834
								if( sDev > 3.65057 )
									ret := 0.400000
							if( wvf > 7.55435 )
								if( Color_con2 <= -0.713544 )
									ret := 1.000000 // buy
								if( Color_con2 > -0.713544 )
									ret := -0.652174
						if( upperBand > 8.3355 )
							if( wvf <= 5.10919 )
								if( lowerBand <= 0.207707 )
									ret := 0.923077 // buy
								if( lowerBand > 0.207707 )
									ret := -0.221374
							if( wvf > 5.10919 )
								if( wvf <= 5.96201 )
									ret := 0.400000
								if( wvf > 5.96201 )
									ret := 0.102623
				if( sDev > 4.24435 )
					if( sDev <= 4.55126 )
						if( lowerBand <= -1.8416 )
							if( Color_con1 <= -1.78146 )
								ret := 1.000000 // buy
							if( Color_con1 > -1.78146 )
								ret := 0.333333
						if( lowerBand > -1.8416 )
							if( wvf <= 7.88419 )
								if( midLine <= 5.7177 )
									ret := -0.254795
								if( midLine > 5.7177 )
									ret := -0.735849 // sell
							if( wvf > 7.88419 )
								if( wvf <= 9.40614 )
									ret := 0.435897
								if( wvf > 9.40614 )
									ret := -0.250000
					if( sDev > 4.55126 )
						if( Color_con1 <= -3.50226 )
							if( upperBand <= 43.6366 )
								if( wvf <= 17.2055 )
									ret := -0.101749
								if( wvf > 17.2055 )
									ret := 0.546875
							if( upperBand > 43.6366 )
								ret := -1.000000 // sell
						if( Color_con1 > -3.50226 )
							if( lowerBand <= -0.019068 )
								if( midLine <= 3.20807 )
									ret := -0.301205
								if( midLine > 3.20807 )
									ret := 0.067762
							if( lowerBand > -0.019068 )
								if( midLine <= 6.21902 )
									ret := 0.703704 // buy
								if( midLine > 6.21902 )
									ret := 0.268519
		if( Color_con2 > 2.50839 )
			if( Color_con1 <= -2.82704 )
				if( sDev <= 13.778 )
					if( midLine <= 5.1085 )
						if( lowerBand <= -3.67394 )
							if( midLine <= 4.59996 )
								ret := 1.000000 // buy
							if( midLine > 4.59996 )
								ret := 0.833333 // buy
						if( lowerBand > -3.67394 )
							if( wvf <= 7.04641 )
								if( Color_con2 <= 3.39338 )
									ret := 1.000000 // buy
								if( Color_con2 > 3.39338 )
									ret := 0.250000
							if( wvf > 7.04641 )
								ret := 0.000000
					if( midLine > 5.1085 )
						if( sDev <= 11.3274 )
							if( lowerBand <= 0.858795 )
								if( Color_con1 <= -4.51808 )
									ret := 0.500000
								if( Color_con1 > -4.51808 )
									ret := -0.617647
							if( lowerBand > 0.858795 )
								if( upperBand <= 23.5389 )
									ret := 0.000000
								if( upperBand > 23.5389 )
									ret := 0.750000 // buy
						if( sDev > 11.3274 )
							if( midLine <= 8.23938 )
								if( sDev <= 13.0435 )
									ret := 0.500000
								if( sDev > 13.0435 )
									ret := -0.400000
							if( midLine > 8.23938 )
								if( Color_con2 <= 11.0855 )
									ret := -1.000000 // sell
								if( Color_con2 > 11.0855 )
									ret := -0.800000 // sell
				if( sDev > 13.778 )
					if( upperBand <= 23.2931 )
						if( upperBand <= 21.2742 )
							ret := 0.750000 // buy
						if( upperBand > 21.2742 )
							if( Color_con2 <= 7.90679 )
								ret := -0.750000 // sell
							if( Color_con2 > 7.90679 )
								ret := -1.000000 // sell
					if( upperBand > 23.2931 )
						if( lowerBand <= -2.52047 )
							if( lowerBand <= -5.6158 )
								ret := 0.750000 // buy
							if( lowerBand > -5.6158 )
								ret := 1.000000 // buy
						if( lowerBand > -2.52047 )
							if( Color_con2 <= 9.41934 )
								if( Color_con2 <= 7.43148 )
									ret := 0.500000
								if( Color_con2 > 7.43148 )
									ret := 1.000000 // buy
							if( Color_con2 > 9.41934 )
								ret := -0.500000
			if( Color_con1 > -2.82704 )
				if( upperBand <= 13.8094 )
					if( midLine <= 3.94201 )
						if( wvf <= 6.02496 )
							if( upperBand <= 7.47889 )
								if( lowerBand <= -1.11705 )
									ret := -0.203252
								if( lowerBand > -1.11705 )
									ret := 0.234463
							if( upperBand > 7.47889 )
								if( midLine <= 2.97945 )
									ret := 0.700000 // buy
								if( midLine > 2.97945 )
									ret := 1.000000 // buy
						if( wvf > 6.02496 )
							if( midLine <= 1.98337 )
								if( sDev <= 3.43697 )
									ret := -0.750000 // sell
								if( sDev > 3.43697 )
									ret := 0.029412
							if( midLine > 1.98337 )
								if( sDev <= 3.2553 )
									ret := 0.680000
								if( sDev > 3.2553 )
									ret := 0.351735
					if( midLine > 3.94201 )
						if( Color_con2 <= 3.1764 )
							if( wvf <= 7.9307 )
								if( Color_con1 <= -0.351419 )
									ret := 0.285714
								if( Color_con1 > -0.351419 )
									ret := -0.843750 // sell
							if( wvf > 7.9307 )
								if( midLine <= 6.89698 )
									ret := 0.639706
								if( midLine > 6.89698 )
									ret := -0.272727
						if( Color_con2 > 3.1764 )
							if( Color_con2 <= 3.42613 )
								if( midLine <= 5.55491 )
									ret := -0.129032
								if( midLine > 5.55491 )
									ret := -0.842105 // sell
							if( Color_con2 > 3.42613 )
								if( wvf <= 10.3866 )
									ret := 0.205128
								if( wvf > 10.3866 )
									ret := -0.168724
				if( upperBand > 13.8094 )
					if( Color_con2 <= 5.61748 )
						if( wvf <= 13.0389 )
							if( Color_con1 <= -2.12829 )
								if( Color_con1 <= -2.67063 )
									ret := 0.000000
								if( Color_con1 > -2.67063 )
									ret := 0.944444 // buy
							if( Color_con1 > -2.12829 )
								ret := -0.571429
						if( wvf > 13.0389 )
							if( Color_con1 <= -1.99035 )
								if( Color_con1 <= -2.56377 )
									ret := 1.000000 // buy
								if( Color_con1 > -2.56377 )
									ret := 0.500000
							if( Color_con1 > -1.99035 )
								if( Color_con2 <= 5.37574 )
									ret := 1.000000 // buy
								if( Color_con2 > 5.37574 )
									ret := 0.888889 // buy
					if( Color_con2 > 5.61748 )
						if( wvf <= 14.2052 )
							if( Color_con1 <= -1.87189 )
								ret := 0.714286 // buy
							if( Color_con1 > -1.87189 )
								if( lowerBand <= -1.17189 )
									ret := -0.937500 // sell
								if( lowerBand > -1.17189 )
									ret := 0.500000
						if( wvf > 14.2052 )
							if( upperBand <= 19.2707 )
								if( Color_con1 <= 4.53261 )
									ret := 0.735632 // buy
								if( Color_con1 > 4.53261 )
									ret := -0.500000
							if( upperBand > 19.2707 )
								if( upperBand <= 21.4527 )
									ret := -0.611111
								if( upperBand > 21.4527 )
									ret := 0.833333 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_LTCUSDT_30Min_144a02e9(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


