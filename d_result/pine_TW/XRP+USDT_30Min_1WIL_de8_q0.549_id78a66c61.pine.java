//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: XRPUSDT_30Min_1WIL_78a66c61 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1WIL_78a66c61", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_78a66c61(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 3.10843 )
		if( Color_con2 <= -3.89607 )
			if( wvf <= 1.56332 )
				if( lowerBand <= -0.008739 )
					if( Color_con2 <= -5.45041 )
						if( midLine <= 7.13453 )
							if( upperBand <= 10.2125 )
								if( lowerBand <= -0.584034 )
									ret := -0.171846
								if( lowerBand > -0.584034 )
									ret := 0.071759
							if( upperBand > 10.2125 )
								if( Color_con1 <= -9.70594 )
									ret := 0.084337
								if( Color_con1 > -9.70594 )
									ret := 0.580000
						if( midLine > 7.13453 )
							if( Color_con1 <= -22.3453 )
								ret := 1.000000 // buy
							if( Color_con1 > -22.3453 )
								if( Color_con2 <= -9.85693 )
									ret := -0.893617 // sell
								if( Color_con2 > -9.85693 )
									ret := 0.000000
					if( Color_con2 > -5.45041 )
						if( Color_con1 <= -5.74871 )
							if( upperBand <= 7.94528 )
								if( wvf <= 0.969318 )
									ret := -0.018405
								if( wvf > 0.969318 )
									ret := -0.586207
							if( upperBand > 7.94528 )
								if( Color_con1 <= -7.10467 )
									ret := 0.080000
								if( Color_con1 > -7.10467 )
									ret := 0.781250 // buy
						if( Color_con1 > -5.74871 )
							if( sDev <= 3.10105 )
								if( upperBand <= 5.39112 )
									ret := 0.214377
								if( upperBand > 5.39112 )
									ret := -0.260000
							if( sDev > 3.10105 )
								if( sDev <= 3.46844 )
									ret := 0.603448
								if( sDev > 3.46844 )
									ret := 0.302326
				if( lowerBand > -0.008739 )
					if( upperBand <= 5.95756 )
						if( wvf <= 0.472888 )
							if( upperBand <= 3.24551 )
								if( Color_con2 <= -5.71519 )
									ret := 0.157895
								if( Color_con2 > -5.71519 )
									ret := -0.300000
							if( upperBand > 3.24551 )
								if( lowerBand <= 0.037825 )
									ret := -1.000000 // sell
								if( lowerBand > 0.037825 )
									ret := -0.550000
						if( wvf > 0.472888 )
							if( Color_con2 <= -9.94954 )
								if( lowerBand <= 0.734203 )
									ret := -0.800000 // sell
								if( lowerBand > 0.734203 )
									ret := -0.125000
							if( Color_con2 > -9.94954 )
								if( midLine <= 1.53784 )
									ret := -0.155039
								if( midLine > 1.53784 )
									ret := 0.012465
					if( upperBand > 5.95756 )
						if( Color_con1 <= -6.05392 )
							if( Color_con1 <= -13.119 )
								if( midLine <= 8.44574 )
									ret := 0.878788 // buy
								if( midLine > 8.44574 )
									ret := 0.000000
							if( Color_con1 > -13.119 )
								if( lowerBand <= 1.01384 )
									ret := -0.202046
								if( lowerBand > 1.01384 )
									ret := 0.278788
						if( Color_con1 > -6.05392 )
							if( sDev <= 3.23381 )
								if( wvf <= 1.26534 )
									ret := 0.463415
								if( wvf > 1.26534 )
									ret := -0.310345
							if( sDev > 3.23381 )
								if( Color_con2 <= -12.2224 )
									ret := -0.750000 // sell
								if( Color_con2 > -12.2224 )
									ret := 0.734694 // buy
			if( wvf > 1.56332 )
				if( sDev <= 2.31115 )
					if( Color_con2 <= -4.89107 )
						if( lowerBand <= 0.050058 )
							if( upperBand <= 3.55469 )
								if( wvf <= 1.68041 )
									ret := -0.071429
								if( wvf > 1.68041 )
									ret := -0.673913
							if( upperBand > 3.55469 )
								if( Color_con2 <= -8.78868 )
									ret := -0.281250
								if( Color_con2 > -8.78868 )
									ret := 0.481481
						if( lowerBand > 0.050058 )
							if( Color_con1 <= -3.48309 )
								if( Color_con2 <= -5.57818 )
									ret := -0.571429
								if( Color_con2 > -5.57818 )
									ret := -1.000000 // sell
							if( Color_con1 > -3.48309 )
								if( midLine <= 2.71627 )
									ret := 0.117808
								if( midLine > 2.71627 )
									ret := 0.580645
					if( Color_con2 > -4.89107 )
						if( midLine <= 1.63382 )
							if( Color_con2 <= -4.70818 )
								if( upperBand <= 2.21345 )
									ret := 0.250000
								if( upperBand > 2.21345 )
									ret := -0.769231 // sell
							if( Color_con2 > -4.70818 )
								if( sDev <= 1.51764 )
									ret := 0.500000
								if( sDev > 1.51764 )
									ret := -0.051282
						if( midLine > 1.63382 )
							if( lowerBand <= 0.521457 )
								if( Color_con2 <= -3.9743 )
									ret := 0.810345 // buy
								if( Color_con2 > -3.9743 )
									ret := 0.440000
							if( lowerBand > 0.521457 )
								if( sDev <= 1.32363 )
									ret := 0.800000 // buy
								if( sDev > 1.32363 )
									ret := 0.223301
				if( sDev > 2.31115 )
					if( lowerBand <= -2.03975 )
						if( lowerBand <= -2.63417 )
							if( Color_con1 <= -20.0277 )
								if( lowerBand <= -4.67911 )
									ret := -1.000000 // sell
								if( lowerBand > -4.67911 )
									ret := -0.250000
							if( Color_con1 > -20.0277 )
								if( Color_con2 <= -17.1779 )
									ret := 0.894737 // buy
								if( Color_con2 > -17.1779 )
									ret := -0.136364
						if( lowerBand > -2.63417 )
							if( wvf <= 1.85205 )
								if( Color_con2 <= -7.98818 )
									ret := 0.545455
								if( Color_con2 > -7.98818 )
									ret := 0.952381 // buy
							if( wvf > 1.85205 )
								if( Color_con2 <= -7.07836 )
									ret := 0.083333
								if( Color_con2 > -7.07836 )
									ret := 0.896552 // buy
					if( lowerBand > -2.03975 )
						if( sDev <= 8.97012 )
							if( lowerBand <= -0.422981 )
								if( Color_con2 <= -10.3467 )
									ret := 0.468085
								if( Color_con2 > -10.3467 )
									ret := -0.123047
							if( lowerBand > -0.422981 )
								if( lowerBand <= 3.77233 )
									ret := 0.079553
								if( lowerBand > 3.77233 )
									ret := 0.680000
						if( sDev > 8.97012 )
							if( upperBand <= 17.5592 )
								if( Color_con1 <= -15.3236 )
									ret := 1.000000 // buy
								if( Color_con1 > -15.3236 )
									ret := -0.600000
							if( upperBand > 17.5592 )
								if( Color_con1 <= -17.703 )
									ret := -0.312500
								if( Color_con1 > -17.703 )
									ret := -0.885714 // sell
		if( Color_con2 > -3.89607 )
			if( midLine <= 4.05624 )
				if( lowerBand <= -0.297505 )
					if( sDev <= 1.5733 )
						if( Color_con1 <= -1.70607 )
							if( wvf <= 0.222416 )
								if( Color_con2 <= -2.1374 )
									ret := -0.636364
								if( Color_con2 > -2.1374 )
									ret := -0.022222
							if( wvf > 0.222416 )
								if( sDev <= 1.29352 )
									ret := -0.181818
								if( sDev > 1.29352 )
									ret := 0.325806
						if( Color_con1 > -1.70607 )
							if( sDev <= 1.44013 )
								if( Color_con1 <= 0.27193 )
									ret := 0.067376
								if( Color_con1 > 0.27193 )
									ret := -0.280992
							if( sDev > 1.44013 )
								if( Color_con1 <= 0.156932 )
									ret := -0.306859
								if( Color_con1 > 0.156932 )
									ret := 0.448980
					if( sDev > 1.5733 )
						if( Color_con2 <= 0.67136 )
							if( sDev <= 1.82138 )
								if( upperBand <= 3.17266 )
									ret := -0.189706
								if( upperBand > 3.17266 )
									ret := -0.737705 // sell
							if( sDev > 1.82138 )
								if( Color_con2 <= -2.13656 )
									ret := -0.000593
								if( Color_con2 > -2.13656 )
									ret := -0.120000
						if( Color_con2 > 0.67136 )
							if( wvf <= 2.45956 )
								if( upperBand <= 3.16121 )
									ret := -0.360000
								if( upperBand > 3.16121 )
									ret := -1.000000 // sell
							if( wvf > 2.45956 )
								if( Color_con2 <= 1.59332 )
									ret := 0.401198
								if( Color_con2 > 1.59332 )
									ret := -0.166667
				if( lowerBand > -0.297505 )
					if( midLine <= 1.92054 )
						if( midLine <= 1.22911 )
							if( upperBand <= 1.95068 )
								if( midLine <= 1.05226 )
									ret := 0.012681
								if( midLine > 1.05226 )
									ret := -0.135975
							if( upperBand > 1.95068 )
								if( upperBand <= 2.18611 )
									ret := 0.127510
								if( upperBand > 2.18611 )
									ret := 0.022616
						if( midLine > 1.22911 )
							if( midLine <= 1.46898 )
								if( wvf <= 1.13482 )
									ret := 0.029745
								if( wvf > 1.13482 )
									ret := -0.104654
							if( midLine > 1.46898 )
								if( lowerBand <= 0.745733 )
									ret := 0.036882
								if( lowerBand > 0.745733 )
									ret := -0.112583
					if( midLine > 1.92054 )
						if( upperBand <= 4.46236 )
							if( lowerBand <= 0.658187 )
								if( sDev <= 2.06188 )
									ret := -0.029661
								if( sDev > 2.06188 )
									ret := 0.234899
							if( lowerBand > 0.658187 )
								if( Color_con2 <= -0.7949 )
									ret := 0.183718
								if( Color_con2 > -0.7949 )
									ret := 0.066498
						if( upperBand > 4.46236 )
							if( midLine <= 3.1276 )
								if( Color_con2 <= -2.68797 )
									ret := -0.060395
								if( Color_con2 > -2.68797 )
									ret := 0.076819
							if( midLine > 3.1276 )
								if( upperBand <= 6.09833 )
									ret := -0.132488
								if( upperBand > 6.09833 )
									ret := 0.076803
			if( midLine > 4.05624 )
				if( lowerBand <= 0.853306 )
					if( midLine <= 4.06985 )
						ret := -0.166667
					if( midLine > 4.06985 )
						if( Color_con2 <= -2.71643 )
							if( Color_con1 <= -6.02967 )
								if( lowerBand <= 0.288325 )
									ret := -0.852941 // sell
								if( lowerBand > 0.288325 )
									ret := -0.965517 // sell
							if( Color_con1 > -6.02967 )
								if( midLine <= 4.51894 )
									ret := -0.724138 // sell
								if( midLine > 4.51894 )
									ret := 0.000000
						if( Color_con2 > -2.71643 )
							if( sDev <= 4.57361 )
								if( midLine <= 4.12313 )
									ret := -0.500000
								if( midLine > 4.12313 )
									ret := 0.000000
							if( sDev > 4.57361 )
								ret := -1.000000 // sell
				if( lowerBand > 0.853306 )
					if( sDev <= 3.78425 )
						if( midLine <= 5.33143 )
							if( Color_con1 <= -5.75502 )
								if( wvf <= 2.17689 )
									ret := -0.742424 // sell
								if( wvf > 2.17689 )
									ret := 0.250000
							if( Color_con1 > -5.75502 )
								if( Color_con2 <= -2.75658 )
									ret := 0.003817
								if( Color_con2 > -2.75658 )
									ret := -0.305556
						if( midLine > 5.33143 )
							if( wvf <= 2.66599 )
								if( Color_con2 <= -3.28642 )
									ret := -0.750000 // sell
								if( Color_con2 > -3.28642 )
									ret := 0.250000
							if( wvf > 2.66599 )
								if( Color_con2 <= -2.86833 )
									ret := 0.621622
								if( Color_con2 > -2.86833 )
									ret := -0.363636
					if( sDev > 3.78425 )
						if( Color_con2 <= -3.74295 )
							ret := 0.250000
						if( Color_con2 > -3.74295 )
							if( wvf <= 2.98275 )
								ret := 1.000000 // buy
							if( wvf > 2.98275 )
								ret := 0.750000 // buy
	if( wvf > 3.10843 )
		if( Color_con2 <= 2.42958 )
			if( Color_con1 <= -5.09931 )
				if( Color_con2 <= -16.2423 )
					if( sDev <= 28.3636 )
						if( wvf <= 6.20552 )
							if( upperBand <= 22.9841 )
								if( wvf <= 5.2268 )
									ret := 0.757143 // buy
								if( wvf > 5.2268 )
									ret := 0.068966
							if( upperBand > 22.9841 )
								if( wvf <= 3.60128 )
									ret := 0.125000
								if( wvf > 3.60128 )
									ret := -0.606061
						if( wvf > 6.20552 )
							if( Color_con1 <= -16.2599 )
								if( Color_con1 <= -45.2327 )
									ret := 0.375000
								if( Color_con1 > -45.2327 )
									ret := 0.955556 // buy
							if( Color_con1 > -16.2599 )
								if( lowerBand <= 1.75879 )
									ret := 0.533333
								if( lowerBand > 1.75879 )
									ret := -1.000000 // sell
					if( sDev > 28.3636 )
						ret := -1.000000 // sell
				if( Color_con2 > -16.2423 )
					if( sDev <= 15.628 )
						if( lowerBand <= 4.28482 )
							if( midLine <= 6.49015 )
								if( lowerBand <= -0.337834 )
									ret := -0.155689
								if( lowerBand > -0.337834 )
									ret := 0.277358
							if( midLine > 6.49015 )
								if( upperBand <= 12.6402 )
									ret := -0.409091
								if( upperBand > 12.6402 )
									ret := -0.012134
						if( lowerBand > 4.28482 )
							if( upperBand <= 24.5847 )
								if( Color_con2 <= -1.24524 )
									ret := 0.326797
								if( Color_con2 > -1.24524 )
									ret := -0.421053
							if( upperBand > 24.5847 )
								if( sDev <= 11.7154 )
									ret := -0.286260
								if( sDev > 11.7154 )
									ret := 0.416667
					if( sDev > 15.628 )
						if( lowerBand <= 6.51746 )
							if( wvf <= 21.4446 )
								if( Color_con2 <= -9.38146 )
									ret := 0.666667
								if( Color_con2 > -9.38146 )
									ret := -0.827586 // sell
							if( wvf > 21.4446 )
								if( Color_con2 <= 0.700847 )
									ret := 1.000000 // buy
								if( Color_con2 > 0.700847 )
									ret := 0.250000
						if( lowerBand > 6.51746 )
							ret := -1.000000 // sell
			if( Color_con1 > -5.09931 )
				if( Color_con2 <= -1.67686 )
					if( midLine <= 7.43739 )
						if( midLine <= 5.60575 )
							if( lowerBand <= 1.64959 )
								if( lowerBand <= 0.655496 )
									ret := 0.288799
								if( lowerBand > 0.655496 )
									ret := 0.017488
							if( lowerBand > 1.64959 )
								if( Color_con2 <= -5.25988 )
									ret := -0.553191
								if( Color_con2 > -5.25988 )
									ret := 0.504931
						if( midLine > 5.60575 )
							if( lowerBand <= 3.07254 )
								if( Color_con2 <= -3.31118 )
									ret := 0.019481
								if( Color_con2 > -3.31118 )
									ret := 0.530435
							if( lowerBand > 3.07254 )
								if( midLine <= 7.07018 )
									ret := -0.350254
								if( midLine > 7.07018 )
									ret := 0.500000
					if( midLine > 7.43739 )
						if( lowerBand <= 2.95013 )
							if( wvf <= 12.3823 )
								if( wvf <= 10.2823 )
									ret := -0.450000
								if( wvf > 10.2823 )
									ret := 0.846154 // buy
							if( wvf > 12.3823 )
								if( Color_con2 <= -2.72832 )
									ret := -0.750000 // sell
								if( Color_con2 > -2.72832 )
									ret := -1.000000 // sell
						if( lowerBand > 2.95013 )
							if( Color_con1 <= -2.70588 )
								if( Color_con1 <= -4.83934 )
									ret := 0.210526
								if( Color_con1 > -4.83934 )
									ret := 0.893805 // buy
							if( Color_con1 > -2.70588 )
								ret := -0.750000 // sell
				if( Color_con2 > -1.67686 )
					if( sDev <= 7.43152 )
						if( wvf <= 6.44763 )
							if( sDev <= 2.77805 )
								if( midLine <= 5.44611 )
									ret := 0.157569
								if( midLine > 5.44611 )
									ret := -0.192727
							if( sDev > 2.77805 )
								if( lowerBand <= -2.0137 )
									ret := 0.608108
								if( lowerBand > -2.0137 )
									ret := -0.023914
						if( wvf > 6.44763 )
							if( midLine <= 5.80349 )
								if( Color_con1 <= -3.48171 )
									ret := 0.801724 // buy
								if( Color_con1 > -3.48171 )
									ret := 0.221053
							if( midLine > 5.80349 )
								if( lowerBand <= 2.14251 )
									ret := -0.155340
								if( lowerBand > 2.14251 )
									ret := 0.228000
					if( sDev > 7.43152 )
						if( wvf <= 14.6597 )
							if( lowerBand <= 0.697376 )
								if( lowerBand <= -2.99296 )
									ret := -0.200000
								if( lowerBand > -2.99296 )
									ret := -0.850746 // sell
							if( lowerBand > 0.697376 )
								if( wvf <= 12.7607 )
									ret := 0.714286 // buy
								if( wvf > 12.7607 )
									ret := -1.000000 // sell
						if( wvf > 14.6597 )
							if( upperBand <= 21.467 )
								if( upperBand <= 19.1897 )
									ret := 1.000000 // buy
								if( upperBand > 19.1897 )
									ret := -0.666667
							if( upperBand > 21.467 )
								ret := 1.000000 // buy
		if( Color_con2 > 2.42958 )
			if( upperBand <= 6.38593 )
				if( sDev <= 2.01931 )
					if( Color_con2 <= 3.22669 )
						if( upperBand <= 3.65398 )
							if( Color_con1 <= 1.0344 )
								if( midLine <= 1.44784 )
									ret := -0.625000
								if( midLine > 1.44784 )
									ret := -1.000000 // sell
							if( Color_con1 > 1.0344 )
								if( wvf <= 4.64105 )
									ret := -0.117647
								if( wvf > 4.64105 )
									ret := -1.000000 // sell
						if( upperBand > 3.65398 )
							if( sDev <= 1.7585 )
								ret := -0.750000 // sell
							if( sDev > 1.7585 )
								if( upperBand <= 3.91551 )
									ret := 0.250000
								if( upperBand > 3.91551 )
									ret := 0.000000
					if( Color_con2 > 3.22669 )
						ret := 0.800000 // buy
				if( sDev > 2.01931 )
					if( Color_con2 <= 2.61153 )
						if( upperBand <= 3.58014 )
							ret := -0.750000 // sell
						if( upperBand > 3.58014 )
							if( Color_con1 <= 1.46706 )
								if( midLine <= 2.69117 )
									ret := 0.652174
								if( midLine > 2.69117 )
									ret := 0.173913
							if( Color_con1 > 1.46706 )
								ret := -0.500000
					if( Color_con2 > 2.61153 )
						if( lowerBand <= -1.4924 )
							if( sDev <= 3.02806 )
								if( midLine <= 1.32559 )
									ret := 0.000000
								if( midLine > 1.32559 )
									ret := -1.000000 // sell
							if( sDev > 3.02806 )
								if( sDev <= 3.59942 )
									ret := 0.813953 // buy
								if( sDev > 3.59942 )
									ret := 0.333333
						if( lowerBand > -1.4924 )
							if( Color_con1 <= 0.073457 )
								if( lowerBand <= -1.37012 )
									ret := 0.800000 // buy
								if( lowerBand > -1.37012 )
									ret := -0.558824
							if( Color_con1 > 0.073457 )
								if( wvf <= 7.95839 )
									ret := 0.182022
								if( wvf > 7.95839 )
									ret := -0.586957
			if( upperBand > 6.38593 )
				if( upperBand <= 21.341 )
					if( wvf <= 13.1748 )
						if( midLine <= 5.92556 )
							if( Color_con2 <= 3.5689 )
								if( lowerBand <= 2.06715 )
									ret := 0.559934
								if( lowerBand > 2.06715 )
									ret := -0.800000 // sell
							if( Color_con2 > 3.5689 )
								if( sDev <= 3.50179 )
									ret := -0.666667
								if( sDev > 3.50179 )
									ret := 0.287066
						if( midLine > 5.92556 )
							if( lowerBand <= 1.04568 )
								if( lowerBand <= -2.05126 )
									ret := 0.400000
								if( lowerBand > -2.05126 )
									ret := -0.432990
							if( lowerBand > 1.04568 )
								if( lowerBand <= 1.57239 )
									ret := 0.673077
								if( lowerBand > 1.57239 )
									ret := 0.020408
					if( wvf > 13.1748 )
						if( wvf <= 17.5001 )
							if( sDev <= 7.56248 )
								if( wvf <= 16.2212 )
									ret := 0.413043
								if( wvf > 16.2212 )
									ret := 0.863636 // buy
							if( sDev > 7.56248 )
								if( sDev <= 10.7978 )
									ret := 0.966667 // buy
								if( sDev > 10.7978 )
									ret := 0.482759
						if( wvf > 17.5001 )
							if( Color_con1 <= -0.448109 )
								if( midLine <= 11.021 )
									ret := -1.000000 // sell
								if( midLine > 11.021 )
									ret := -0.250000
							if( Color_con1 > -0.448109 )
								if( Color_con2 <= 11.0413 )
									ret := 0.906977 // buy
								if( Color_con2 > 11.0413 )
									ret := 0.311475
				if( upperBand > 21.341 )
					if( midLine <= 19.4455 )
						if( sDev <= 20.9208 )
							if( sDev <= 15.7393 )
								if( Color_con2 <= 10.7191 )
									ret := -0.258065
								if( Color_con2 > 10.7191 )
									ret := 0.375000
							if( sDev > 15.7393 )
								if( lowerBand <= 0.947566 )
									ret := 0.720000 // buy
								if( lowerBand > 0.947566 )
									ret := -1.000000 // sell
						if( sDev > 20.9208 )
							ret := -1.000000 // sell
					if( midLine > 19.4455 )
						if( Color_con2 <= 16.517 )
							if( wvf <= 27.1102 )
								ret := 0.500000
							if( wvf > 27.1102 )
								ret := 1.000000 // buy
						if( Color_con2 > 16.517 )
							ret := 0.500000
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_78a66c61(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)

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


