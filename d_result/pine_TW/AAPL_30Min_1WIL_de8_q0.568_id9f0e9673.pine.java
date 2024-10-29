//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: AAPL_30Min_1WIL_9f0e9673 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_1WIL_9f0e9673", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_9f0e9673(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 1.86894 )
		if( lowerBand <= -0.766345 )
			if( wvf <= 0.61707 )
				if( Color_con1 <= -3.76349 )
					if( Color_con2 <= -3.76242 )
						if( sDev <= 4.20165 )
							if( sDev <= 2.65839 )
								ret := 0.571429
							if( sDev > 2.65839 )
								if( lowerBand <= -1.34462 )
									ret := -0.867925 // sell
								if( lowerBand > -1.34462 )
									ret := -0.659574
						if( sDev > 4.20165 )
							if( Color_con2 <= -6.99837 )
								if( wvf <= 0.33626 )
									ret := 0.500000
								if( wvf > 0.33626 )
									ret := -0.666667
							if( Color_con2 > -6.99837 )
								if( Color_con2 <= -5.44863 )
									ret := 1.000000 // buy
								if( Color_con2 > -5.44863 )
									ret := 0.625000
					if( Color_con2 > -3.76242 )
						if( midLine <= 1.90923 )
							if( Color_con1 <= -4.11591 )
								if( Color_con2 <= -1.01247 )
									ret := -0.250000
								if( Color_con2 > -1.01247 )
									ret := 1.000000 // buy
							if( Color_con1 > -4.11591 )
								if( upperBand <= 4.07216 )
									ret := 0.100000
								if( upperBand > 4.07216 )
									ret := -0.634146
						if( midLine > 1.90923 )
							if( lowerBand <= -1.33068 )
								ret := 1.000000 // buy
							if( lowerBand > -1.33068 )
								if( lowerBand <= -1.16657 )
									ret := -0.571429
								if( lowerBand > -1.16657 )
									ret := 0.333333
				if( Color_con1 > -3.76349 )
					if( lowerBand <= -1.00675 )
						if( sDev <= 2.6928 )
							if( lowerBand <= -1.13708 )
								if( Color_con2 <= -3.33293 )
									ret := -0.333333
								if( Color_con2 > -3.33293 )
									ret := 0.257426
							if( lowerBand > -1.13708 )
								if( Color_con1 <= -2.60931 )
									ret := 0.406250
								if( Color_con1 > -2.60931 )
									ret := 0.833333 // buy
						if( sDev > 2.6928 )
							if( sDev <= 2.8152 )
								if( Color_con1 <= -3.372 )
									ret := 0.916667 // buy
								if( Color_con1 > -3.372 )
									ret := 1.000000 // buy
							if( sDev > 2.8152 )
								ret := 0.250000
					if( lowerBand > -1.00675 )
						if( Color_con2 <= -2.61003 )
							if( midLine <= 1.39225 )
								if( wvf <= 0.137526 )
									ret := 0.166667
								if( wvf > 0.137526 )
									ret := 0.646341
							if( midLine > 1.39225 )
								if( upperBand <= 3.65003 )
									ret := -0.833333 // sell
								if( upperBand > 3.65003 )
									ret := 0.352941
						if( Color_con2 > -2.61003 )
							if( upperBand <= 2.46025 )
								if( Color_con2 <= -0.910692 )
									ret := -0.166667
								if( Color_con2 > -0.910692 )
									ret := 0.958333 // buy
							if( upperBand > 2.46025 )
								if( Color_con2 <= -0.98705 )
									ret := -0.164557
								if( Color_con2 > -0.98705 )
									ret := -0.972973 // sell
			if( wvf > 0.61707 )
				if( Color_con2 <= -0.160204 )
					if( Color_con2 <= -5.04389 )
						if( sDev <= 4.68219 )
							if( lowerBand <= -1.11966 )
								if( wvf <= 1.12648 )
									ret := -1.000000 // sell
								if( wvf > 1.12648 )
									ret := -0.250000
							if( lowerBand > -1.11966 )
								ret := -0.285714
						if( sDev > 4.68219 )
							if( sDev <= 40.0828 )
								if( upperBand <= 9.21959 )
									ret := 0.909091 // buy
								if( upperBand > 9.21959 )
									ret := -0.388889
							if( sDev > 40.0828 )
								if( Color_con1 <= -117.015 )
									ret := 0.500000
								if( Color_con1 > -117.015 )
									ret := 1.000000 // buy
					if( Color_con2 > -5.04389 )
						if( sDev <= 3.8004 )
							if( upperBand <= 5.58981 )
								if( wvf <= 1.40766 )
									ret := 0.612360
								if( wvf > 1.40766 )
									ret := 0.088889
							if( upperBand > 5.58981 )
								if( Color_con1 <= -5.33406 )
									ret := -0.875000 // sell
								if( Color_con1 > -5.33406 )
									ret := 0.111111
						if( sDev > 3.8004 )
							if( upperBand <= 7.47354 )
								if( Color_con2 <= -4.49428 )
									ret := 0.500000
								if( Color_con2 > -4.49428 )
									ret := 0.961538 // buy
							if( upperBand > 7.47354 )
								ret := 0.250000
				if( Color_con2 > -0.160204 )
					if( Color_con1 <= -0.942859 )
						if( midLine <= 0.670222 )
							ret := 1.000000 // buy
						if( midLine > 0.670222 )
							if( sDev <= 2.46594 )
								if( upperBand <= 2.68404 )
									ret := 0.000000
								if( upperBand > 2.68404 )
									ret := -0.900000 // sell
							if( sDev > 2.46594 )
								if( lowerBand <= -1.58341 )
									ret := 0.250000
								if( lowerBand > -1.58341 )
									ret := 0.000000
					if( Color_con1 > -0.942859 )
						if( Color_con2 <= 0.983629 )
							if( midLine <= 0.815555 )
								if( midLine <= 0.577508 )
									ret := 0.714286 // buy
								if( midLine > 0.577508 )
									ret := 1.000000 // buy
							if( midLine > 0.815555 )
								ret := 0.500000
						if( Color_con2 > 0.983629 )
							ret := -0.400000
		if( lowerBand > -0.766345 )
			if( Color_con2 <= -3.93244 )
				if( Color_con2 <= -10.5975 )
					if( sDev <= 1.27361 )
						if( upperBand <= 2.09546 )
							if( Color_con2 <= -74.0027 )
								ret := -0.250000
							if( Color_con2 > -74.0027 )
								if( wvf <= 0.746269 )
									ret := 1.000000 // buy
								if( wvf > 0.746269 )
									ret := 0.600000
						if( upperBand > 2.09546 )
							ret := 1.000000 // buy
					if( sDev > 1.27361 )
						if( Color_con2 <= -18.3263 )
							if( wvf <= 1.33321 )
								ret := -1.000000 // sell
							if( wvf > 1.33321 )
								ret := 0.750000 // buy
						if( Color_con2 > -18.3263 )
							ret := 1.000000 // buy
				if( Color_con2 > -10.5975 )
					if( sDev <= 2.20099 )
						if( sDev <= 0.98729 )
							if( Color_con2 <= -4.68065 )
								if( lowerBand <= 0.171657 )
									ret := -0.434783
								if( lowerBand > 0.171657 )
									ret := -0.800000 // sell
							if( Color_con2 > -4.68065 )
								if( wvf <= 0.434104 )
									ret := 0.312500
								if( wvf > 0.434104 )
									ret := -0.458824
						if( sDev > 0.98729 )
							if( Color_con2 <= -6.26563 )
								if( Color_con1 <= -2.51053 )
									ret := -0.571429
								if( Color_con1 > -2.51053 )
									ret := 0.978261 // buy
							if( Color_con2 > -6.26563 )
								if( wvf <= 1.22331 )
									ret := -0.165254
								if( wvf > 1.22331 )
									ret := 0.604651
					if( sDev > 2.20099 )
						if( sDev <= 5.40216 )
							if( Color_con2 <= -6.3853 )
								if( Color_con2 <= -9.78749 )
									ret := -0.333333
								if( Color_con2 > -9.78749 )
									ret := -0.983051 // sell
							if( Color_con2 > -6.3853 )
								if( midLine <= 4.45987 )
									ret := -0.168724
								if( midLine > 4.45987 )
									ret := -0.837209 // sell
						if( sDev > 5.40216 )
							if( upperBand <= 12.3798 )
								ret := 1.000000 // buy
							if( upperBand > 12.3798 )
								if( midLine <= 7.30482 )
									ret := -0.250000
								if( midLine > 7.30482 )
									ret := -1.000000 // sell
			if( Color_con2 > -3.93244 )
				if( Color_con1 <= -0.145291 )
					if( upperBand <= 3.87711 )
						if( lowerBand <= 1.47458 )
							if( sDev <= 1.862 )
								if( lowerBand <= 1.35801 )
									ret := 0.047921
								if( lowerBand > 1.35801 )
									ret := -0.310078
							if( sDev > 1.862 )
								if( wvf <= 1.00213 )
									ret := -0.040000
								if( wvf > 1.00213 )
									ret := -0.370629
						if( lowerBand > 1.47458 )
							if( Color_con1 <= -1.53064 )
								if( Color_con2 <= -1.82858 )
									ret := 0.857143 // buy
								if( Color_con2 > -1.82858 )
									ret := -0.407407
							if( Color_con1 > -1.53064 )
								if( upperBand <= 2.73593 )
									ret := 0.820896 // buy
								if( upperBand > 2.73593 )
									ret := 0.397260
					if( upperBand > 3.87711 )
						if( Color_con2 <= -2.97992 )
							if( sDev <= 3.20314 )
								if( Color_con1 <= -3.53093 )
									ret := -0.273731
								if( Color_con1 > -3.53093 )
									ret := 0.285714
							if( sDev > 3.20314 )
								if( upperBand <= 7.77827 )
									ret := 0.682353
								if( upperBand > 7.77827 )
									ret := -0.750000 // sell
						if( Color_con2 > -2.97992 )
							if( Color_con1 <= -2.58849 )
								if( Color_con2 <= -0.540631 )
									ret := 0.286558
								if( Color_con2 > -0.540631 )
									ret := -0.909091 // sell
							if( Color_con1 > -2.58849 )
								if( Color_con1 <= -2.5239 )
									ret := -0.468085
								if( Color_con1 > -2.5239 )
									ret := -0.007463
				if( Color_con1 > -0.145291 )
					if( sDev <= 0.148991 )
						if( Color_con2 <= -0.117708 )
							if( Color_con2 <= -0.293188 )
								if( Color_con2 <= -0.36533 )
									ret := -0.028169
								if( Color_con2 > -0.36533 )
									ret := -0.675000
							if( Color_con2 > -0.293188 )
								if( sDev <= 0.137816 )
									ret := -0.037736
								if( sDev > 0.137816 )
									ret := 0.250000
						if( Color_con2 > -0.117708 )
							if( midLine <= 0.292254 )
								if( wvf <= 0.240093 )
									ret := -0.851852 // sell
								if( wvf > 0.240093 )
									ret := -0.425000
							if( midLine > 0.292254 )
								if( sDev <= 0.142286 )
									ret := 0.071429
								if( sDev > 0.142286 )
									ret := -0.500000
					if( sDev > 0.148991 )
						if( upperBand <= 0.406643 )
							if( sDev <= 0.230342 )
								if( sDev <= 0.158175 )
									ret := -0.060000
								if( sDev > 0.158175 )
									ret := 0.347426
							if( sDev > 0.230342 )
								if( Color_con2 <= -0.772879 )
									ret := -0.769231 // sell
								if( Color_con2 > -0.772879 )
									ret := 0.081967
						if( upperBand > 0.406643 )
							if( lowerBand <= 0.097752 )
								if( wvf <= 1.72094 )
									ret := 0.077315
								if( wvf > 1.72094 )
									ret := 0.340081
							if( lowerBand > 0.097752 )
								if( Color_con1 <= 0.120211 )
									ret := 0.237277
								if( Color_con1 > 0.120211 )
									ret := -0.107843
	if( wvf > 1.86894 )
		if( lowerBand <= 0.526224 )
			if( lowerBand <= -1.28682 )
				if( upperBand <= 11.1634 )
					if( sDev <= 4.8657 )
						if( sDev <= 3.84785 )
							if( upperBand <= 3.77531 )
								if( midLine <= 0.940749 )
									ret := 0.333333
								if( midLine > 0.940749 )
									ret := 0.918919 // buy
							if( upperBand > 3.77531 )
								if( midLine <= 1.39893 )
									ret := -0.047619
								if( midLine > 1.39893 )
									ret := 0.357542
						if( sDev > 3.84785 )
							if( Color_con2 <= -0.553455 )
								if( wvf <= 2.21176 )
									ret := 1.000000 // buy
								if( wvf > 2.21176 )
									ret := 0.500000
							if( Color_con2 > -0.553455 )
								if( Color_con1 <= -0.58652 )
									ret := -0.764706 // sell
								if( Color_con1 > -0.58652 )
									ret := 0.000000
					if( sDev > 4.8657 )
						if( Color_con2 <= 5.28663 )
							if( lowerBand <= -2.9815 )
								ret := -0.428571
							if( lowerBand > -2.9815 )
								if( wvf <= 6.97443 )
									ret := 0.371429
								if( wvf > 6.97443 )
									ret := 0.956522 // buy
						if( Color_con2 > 5.28663 )
							if( Color_con1 <= 0.347419 )
								ret := 1.000000 // buy
							if( Color_con1 > 0.347419 )
								ret := 0.333333
				if( upperBand > 11.1634 )
					if( midLine <= 6.3886 )
						if( Color_con2 <= 5.75967 )
							if( Color_con1 <= -9.01373 )
								ret := -0.333333
							if( Color_con1 > -9.01373 )
								if( midLine <= 5.76212 )
									ret := -0.962963 // sell
								if( midLine > 5.76212 )
									ret := -0.500000
						if( Color_con2 > 5.75967 )
							ret := 0.200000
					if( midLine > 6.3886 )
						if( Color_con2 <= 53.102 )
							if( midLine <= 6.87434 )
								ret := 0.000000
							if( midLine > 6.87434 )
								if( Color_con1 <= -4.15933 )
									ret := 0.958333 // buy
								if( Color_con1 > -4.15933 )
									ret := 0.500000
						if( Color_con2 > 53.102 )
							if( upperBand <= 69.4461 )
								ret := -1.000000 // sell
							if( upperBand > 69.4461 )
								ret := 0.000000
			if( lowerBand > -1.28682 )
				if( sDev <= 1.36666 )
					if( Color_con2 <= -1.71698 )
						if( lowerBand <= 0.069962 )
							if( Color_con2 <= -2.94714 )
								if( Color_con1 <= -0.216809 )
									ret := -0.200000
								if( Color_con1 > -0.216809 )
									ret := 0.727273 // buy
							if( Color_con2 > -2.94714 )
								if( midLine <= 0.92758 )
									ret := 0.363636
								if( midLine > 0.92758 )
									ret := -1.000000 // sell
						if( lowerBand > 0.069962 )
							if( wvf <= 2.36293 )
								if( lowerBand <= 0.445524 )
									ret := 0.893617 // buy
								if( lowerBand > 0.445524 )
									ret := 0.142857
							if( wvf > 2.36293 )
								ret := -0.666667
					if( Color_con2 > -1.71698 )
						if( Color_con1 <= -0.161465 )
							if( midLine <= 1.23847 )
								if( midLine <= 1.02995 )
									ret := -0.104167
								if( midLine > 1.02995 )
									ret := -0.707792 // sell
							if( midLine > 1.23847 )
								if( Color_con2 <= 0.334278 )
									ret := -0.336770
								if( Color_con2 > 0.334278 )
									ret := -0.031847
						if( Color_con1 > -0.161465 )
							if( lowerBand <= 0.089609 )
								if( lowerBand <= -0.340855 )
									ret := -0.223776
								if( lowerBand > -0.340855 )
									ret := 0.122494
							if( lowerBand > 0.089609 )
								if( Color_con1 <= 0.322947 )
									ret := -0.240909
								if( Color_con1 > 0.322947 )
									ret := -0.583333
				if( sDev > 1.36666 )
					if( midLine <= 7.07451 )
						if( wvf <= 4.98261 )
							if( wvf <= 3.62257 )
								if( Color_con2 <= 1.4003 )
									ret := -0.035361
								if( Color_con2 > 1.4003 )
									ret := -0.293689
							if( wvf > 3.62257 )
								if( wvf <= 4.18299 )
									ret := 0.240351
								if( wvf > 4.18299 )
									ret := -0.121655
						if( wvf > 4.98261 )
							if( wvf <= 8.32481 )
								if( lowerBand <= -0.534735 )
									ret := -0.112782
								if( lowerBand > -0.534735 )
									ret := -0.500000
							if( wvf > 8.32481 )
								if( sDev <= 5.89424 )
									ret := -1.000000 // sell
								if( sDev > 5.89424 )
									ret := 0.681818
					if( midLine > 7.07451 )
						if( wvf <= 5.29156 )
							ret := 0.750000 // buy
						if( wvf > 5.29156 )
							ret := 1.000000 // buy
		if( lowerBand > 0.526224 )
			if( Color_con1 <= -2.56421 )
				if( upperBand <= 6.57011 )
					if( Color_con2 <= -1.50338 )
						if( sDev <= 2.19736 )
							if( upperBand <= 5.78816 )
								if( sDev <= 1.22017 )
									ret := -0.800000 // sell
								if( sDev > 1.22017 )
									ret := 0.589474
							if( upperBand > 5.78816 )
								if( sDev <= 1.88047 )
									ret := 0.200000
								if( sDev > 1.88047 )
									ret := -0.621951
						if( sDev > 2.19736 )
							if( wvf <= 3.11767 )
								if( lowerBand <= 0.747894 )
									ret := 0.500000
								if( lowerBand > 0.747894 )
									ret := 0.942857 // buy
							if( wvf > 3.11767 )
								if( wvf <= 3.42365 )
									ret := -0.666667
								if( wvf > 3.42365 )
									ret := 1.000000 // buy
					if( Color_con2 > -1.50338 )
						if( midLine <= 3.53516 )
							if( midLine <= 3.17691 )
								if( lowerBand <= 0.915006 )
									ret := -0.727273 // sell
								if( lowerBand > 0.915006 )
									ret := 0.714286 // buy
							if( midLine > 3.17691 )
								if( upperBand <= 5.93253 )
									ret := -0.885714 // sell
								if( upperBand > 5.93253 )
									ret := 0.000000
						if( midLine > 3.53516 )
							if( wvf <= 3.56345 )
								if( midLine <= 4.22615 )
									ret := 0.100000
								if( midLine > 4.22615 )
									ret := 0.866667 // buy
							if( wvf > 3.56345 )
								ret := -0.666667
				if( upperBand > 6.57011 )
					if( upperBand <= 11.5128 )
						if( Color_con1 <= -5.93546 )
							if( Color_con1 <= -6.54566 )
								ret := -1.000000 // sell
							if( Color_con1 > -6.54566 )
								if( Color_con1 <= -6.40042 )
									ret := 0.250000
								if( Color_con1 > -6.40042 )
									ret := -0.878788 // sell
						if( Color_con1 > -5.93546 )
							if( Color_con2 <= -2.95258 )
								if( Color_con2 <= -8.62739 )
									ret := -1.000000 // sell
								if( Color_con2 > -8.62739 )
									ret := 0.350000
							if( Color_con2 > -2.95258 )
								if( wvf <= 3.01274 )
									ret := -0.721519 // sell
								if( wvf > 3.01274 )
									ret := -0.254902
					if( upperBand > 11.5128 )
						if( Color_con1 <= -10.5498 )
							if( Color_con2 <= -5.89333 )
								ret := -1.000000 // sell
							if( Color_con2 > -5.89333 )
								ret := 0.500000
						if( Color_con1 > -10.5498 )
							if( midLine <= 9.34674 )
								if( Color_con1 <= -2.6623 )
									ret := 0.896104 // buy
								if( Color_con1 > -2.6623 )
									ret := 0.000000
							if( midLine > 9.34674 )
								if( Color_con2 <= -4.17431 )
									ret := 0.000000
								if( Color_con2 > -4.17431 )
									ret := -1.000000 // sell
			if( Color_con1 > -2.56421 )
				if( Color_con2 <= 0.160816 )
					if( upperBand <= 3.85744 )
						if( wvf <= 2.70988 )
							if( upperBand <= 2.97659 )
								if( midLine <= 2.2474 )
									ret := 0.206522
								if( midLine > 2.2474 )
									ret := -0.477273
							if( upperBand > 2.97659 )
								if( Color_con2 <= -0.224062 )
									ret := -0.003623
								if( Color_con2 > -0.224062 )
									ret := -0.350000
						if( wvf > 2.70988 )
							if( midLine <= 1.94606 )
								if( wvf <= 2.87647 )
									ret := 0.000000
								if( wvf > 2.87647 )
									ret := 1.000000 // buy
							if( midLine > 1.94606 )
								if( sDev <= 1.35245 )
									ret := -0.732673 // sell
								if( sDev > 1.35245 )
									ret := -0.038462
					if( upperBand > 3.85744 )
						if( sDev <= 0.937333 )
							if( wvf <= 2.05086 )
								ret := -0.500000
							if( wvf > 2.05086 )
								if( upperBand <= 4.58554 )
									ret := 0.719512 // buy
								if( upperBand > 4.58554 )
									ret := -0.153846
						if( sDev > 0.937333 )
							if( Color_con2 <= -1.2354 )
								if( midLine <= 2.43655 )
									ret := -0.416667
								if( midLine > 2.43655 )
									ret := 0.360996
							if( Color_con2 > -1.2354 )
								if( wvf <= 2.21496 )
									ret := -0.489796
								if( wvf > 2.21496 )
									ret := 0.072792
				if( Color_con2 > 0.160816 )
					if( midLine <= 2.45197 )
						if( Color_con2 <= 0.844149 )
							if( midLine <= 2.23294 )
								if( lowerBand <= 1.41864 )
									ret := 0.170259
								if( lowerBand > 1.41864 )
									ret := 0.875000 // buy
							if( midLine > 2.23294 )
								if( wvf <= 3.17159 )
									ret := -0.707317 // sell
								if( wvf > 3.17159 )
									ret := 0.155172
						if( Color_con2 > 0.844149 )
							if( sDev <= 1.3357 )
								if( lowerBand <= 1.1701 )
									ret := -0.540984
								if( lowerBand > 1.1701 )
									ret := 0.375000
							if( sDev > 1.3357 )
								if( wvf <= 4.14473 )
									ret := 0.241379
								if( wvf > 4.14473 )
									ret := 1.000000 // buy
					if( midLine > 2.45197 )
						if( sDev <= 1.23338 )
							if( sDev <= 0.793263 )
								if( sDev <= 0.733726 )
									ret := 0.000000
								if( sDev > 0.733726 )
									ret := 1.000000 // buy
							if( sDev > 0.793263 )
								if( lowerBand <= 1.40486 )
									ret := 1.000000 // buy
								if( lowerBand > 1.40486 )
									ret := -0.354839
						if( sDev > 1.23338 )
							if( upperBand <= 4.98533 )
								if( upperBand <= 4.37962 )
									ret := 0.397436
								if( upperBand > 4.37962 )
									ret := 0.738889 // buy
							if( upperBand > 4.98533 )
								if( lowerBand <= 2.15469 )
									ret := 0.124542
								if( lowerBand > 2.15469 )
									ret := 0.559322
	
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
float op_operation = decision_tree_0_AAPL_30Min_9f0e9673(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


