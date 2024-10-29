//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: UBER_1Min_1ADX_911c63f0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1ADX_911c63f0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_911c63f0(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 0.075128 )
		if( diMinus <= 58.0496 )
			if( directionalMovementPlus <= 0.178874 )
				if( smoothedTrueRange <= 0.064623 )
					if( diPlus <= 65.274 )
						if( diMinus <= 1.92478 )
							if( diPlus <= 36.7515 )
								if( dx <= 91.0101 )
									ret := 0.166667
								if( dx > 91.0101 )
									ret := 0.930233 // buy
							if( diPlus > 36.7515 )
								if( smoothedDirectionalMovementMinus <= 0.000731 )
									ret := 0.129412
								if( smoothedDirectionalMovementMinus > 0.000731 )
									ret := 0.800000 // buy
						if( diMinus > 1.92478 )
							if( diPlus <= 13.2035 )
								if( dx <= 43.2896 )
									ret := -0.160976
								if( dx > 43.2896 )
									ret := -0.017082
							if( diPlus > 13.2035 )
								if( directionalMovementPlus <= 0.071598 )
									ret := 0.022971
								if( directionalMovementPlus > 0.071598 )
									ret := -0.119020
					if( diPlus > 65.274 )
						if( trueRange <= 0.170552 )
							if( smoothedTrueRange <= 0.052228 )
								if( adx <= 15.232 )
									ret := 0.360000
								if( adx > 15.232 )
									ret := -0.281437
							if( smoothedTrueRange > 0.052228 )
								if( diPlus <= 71.8504 )
									ret := -0.679012
								if( diPlus > 71.8504 )
									ret := -0.349206
						if( trueRange > 0.170552 )
							ret := 1.000000 // buy
				if( smoothedTrueRange > 0.064623 )
					if( diPlus <= 46.077 )
						if( diMinus <= 12.345 )
							if( smoothedDirectionalMovementMinus <= 0.008985 )
								if( smoothedDirectionalMovementMinus <= 0.00065 )
									ret := -0.545455
								if( smoothedDirectionalMovementMinus > 0.00065 )
									ret := 0.076923
							if( smoothedDirectionalMovementMinus > 0.008985 )
								if( diPlus <= 44.1722 )
									ret := -0.126413
								if( diPlus > 44.1722 )
									ret := 0.296000
						if( diMinus > 12.345 )
							if( adx <= 83.2602 )
								if( smoothedTrueRange <= 0.308354 )
									ret := 0.064831
								if( smoothedTrueRange > 0.308354 )
									ret := 0.350000
							if( adx > 83.2602 )
								if( diPlus <= 17.8226 )
									ret := -0.523256
								if( diPlus > 17.8226 )
									ret := 1.000000 // buy
					if( diPlus > 46.077 )
						if( dx <= 12.2825 )
							if( directionalMovementMinus <= 0.002295 )
								if( dx <= 2.29887 )
									ret := -0.421053
								if( dx > 2.29887 )
									ret := 0.153639
							if( directionalMovementMinus > 0.002295 )
								if( diPlus <= 47.1592 )
									ret := -0.170732
								if( diPlus > 47.1592 )
									ret := 0.502092
						if( dx > 12.2825 )
							if( smoothedDirectionalMovementMinus <= 0.00062 )
								if( smoothedTrueRange <= 0.081825 )
									ret := 0.133333
								if( smoothedTrueRange > 0.081825 )
									ret := 0.826087 // buy
							if( smoothedDirectionalMovementMinus > 0.00062 )
								if( smoothedDirectionalMovementMinus <= 0.047745 )
									ret := -0.135392
								if( smoothedDirectionalMovementMinus > 0.047745 )
									ret := 0.311111
			if( directionalMovementPlus > 0.178874 )
				if( diMinus <= 32.3483 )
					if( dx <= 85.208 )
						if( dx <= 65.728 )
							if( diPlus <= 63.2523 )
								if( dx <= 58.1841 )
									ret := 0.008183
								if( dx > 58.1841 )
									ret := -0.610169
							if( diPlus > 63.2523 )
								if( diMinus <= 16.3138 )
									ret := 0.125000
								if( diMinus > 16.3138 )
									ret := -0.769231 // sell
						if( dx > 65.728 )
							if( smoothedDirectionalMovementPlus <= 0.066652 )
								if( dx <= 66.612 )
									ret := 0.900000 // buy
								if( dx > 66.612 )
									ret := -0.462963
							if( smoothedDirectionalMovementPlus > 0.066652 )
								if( smoothedTrueRange <= 0.146006 )
									ret := 0.775510 // buy
								if( smoothedTrueRange > 0.146006 )
									ret := 0.284211
					if( dx > 85.208 )
						if( dx <= 93.742 )
							if( diPlus <= 50.4232 )
								ret := -0.250000
							if( diPlus > 50.4232 )
								if( diPlus <= 63.361 )
									ret := -0.833333 // sell
								if( diPlus > 63.361 )
									ret := -1.000000 // sell
						if( dx > 93.742 )
							ret := 0.571429
				if( diMinus > 32.3483 )
					if( adx <= 21.4153 )
						if( diPlus <= 46.402 )
							if( diMinus <= 57.5692 )
								if( diMinus <= 45.9137 )
									ret := -0.113208
								if( diMinus > 45.9137 )
									ret := -0.827586 // sell
							if( diMinus > 57.5692 )
								ret := 1.000000 // buy
						if( diPlus > 46.402 )
							if( smoothedDirectionalMovementMinus <= 0.024891 )
								ret := 0.166667
							if( smoothedDirectionalMovementMinus > 0.024891 )
								if( adx <= 7.30204 )
									ret := -0.333333
								if( adx > 7.30204 )
									ret := -0.839161 // sell
					if( adx > 21.4153 )
						if( directionalMovementMinus <= 0.017043 )
							if( dx <= 0.565353 )
								if( smoothedDirectionalMovementPlus <= 0.046692 )
									ret := 0.000000
								if( smoothedDirectionalMovementPlus > 0.046692 )
									ret := 1.000000 // buy
							if( dx > 0.565353 )
								if( adx <= 65.0617 )
									ret := -0.391061
								if( adx > 65.0617 )
									ret := 0.636364
						if( directionalMovementMinus > 0.017043 )
							if( smoothedDirectionalMovementMinus <= 0.063936 )
								if( smoothedTrueRange <= 0.091909 )
									ret := 0.500000
								if( smoothedTrueRange > 0.091909 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementMinus > 0.063936 )
								if( dx <= 38.4056 )
									ret := -1.000000 // sell
								if( dx > 38.4056 )
									ret := 0.000000
		if( diMinus > 58.0496 )
			if( adx <= 21.3598 )
				if( smoothedDirectionalMovementMinus <= 0.023956 )
					if( diMinus <= 60.8148 )
						if( dx <= 21.6539 )
							if( smoothedDirectionalMovementPlus <= 0.014568 )
								ret := 0.000000
							if( smoothedDirectionalMovementPlus > 0.014568 )
								ret := 0.600000
						if( dx > 21.6539 )
							if( trueRange <= 0.02688 )
								if( adx <= 13.8934 )
									ret := 0.500000
								if( adx > 13.8934 )
									ret := 0.937500 // buy
							if( trueRange > 0.02688 )
								if( smoothedDirectionalMovementMinus <= 0.015695 )
									ret := 0.250000
								if( smoothedDirectionalMovementMinus > 0.015695 )
									ret := 0.750000 // buy
					if( diMinus > 60.8148 )
						if( dx <= 32.4793 )
							if( diPlus <= 33.3707 )
								if( adx <= 16.5142 )
									ret := -0.750000 // sell
								if( adx > 16.5142 )
									ret := -1.000000 // sell
							if( diPlus > 33.3707 )
								if( adx <= 16.7759 )
									ret := -0.272727
								if( adx > 16.7759 )
									ret := 0.461538
						if( dx > 32.4793 )
							if( dx <= 33.4747 )
								if( directionalMovementMinus <= 0.007594 )
									ret := 0.750000 // buy
								if( directionalMovementMinus > 0.007594 )
									ret := 1.000000 // buy
							if( dx > 33.4747 )
								if( adx <= 18.2407 )
									ret := 0.000000
								if( adx > 18.2407 )
									ret := 0.428571
				if( smoothedDirectionalMovementMinus > 0.023956 )
					if( trueRange <= 0.089808 )
						if( adx <= 12.8043 )
							if( dx <= 25.1337 )
								if( smoothedTrueRange <= 0.068557 )
									ret := 0.800000 // buy
								if( smoothedTrueRange > 0.068557 )
									ret := 0.333333
							if( dx > 25.1337 )
								if( diPlus <= 23.7219 )
									ret := 0.750000 // buy
								if( diPlus > 23.7219 )
									ret := -0.363636
						if( adx > 12.8043 )
							if( diMinus <= 59.0594 )
								if( directionalMovementMinus <= 0.049179 )
									ret := 0.980000 // buy
								if( directionalMovementMinus > 0.049179 )
									ret := 0.700000 // buy
							if( diMinus > 59.0594 )
								if( dx <= 21.7557 )
									ret := 0.157895
								if( dx > 21.7557 )
									ret := 0.750000 // buy
					if( trueRange > 0.089808 )
						if( directionalMovementMinus <= 0.037021 )
							if( directionalMovementPlus <= 0.089895 )
								if( smoothedTrueRange <= 0.104898 )
									ret := 0.750000 // buy
								if( smoothedTrueRange > 0.104898 )
									ret := 1.000000 // buy
							if( directionalMovementPlus > 0.089895 )
								if( directionalMovementPlus <= 0.105 )
									ret := -0.500000
								if( directionalMovementPlus > 0.105 )
									ret := 0.400000
						if( directionalMovementMinus > 0.037021 )
							if( adx <= 17.1908 )
								ret := 0.000000
							if( adx > 17.1908 )
								ret := -1.000000 // sell
			if( adx > 21.3598 )
				if( smoothedDirectionalMovementMinus <= 0.174895 )
					if( smoothedTrueRange <= 0.156558 )
						if( diMinus <= 61.0925 )
							if( smoothedDirectionalMovementMinus <= 0.036402 )
								if( dx <= 17.9964 )
									ret := -0.750000 // sell
								if( dx > 17.9964 )
									ret := 0.201550
							if( smoothedDirectionalMovementMinus > 0.036402 )
								if( smoothedTrueRange <= 0.122443 )
									ret := -0.356436
								if( smoothedTrueRange > 0.122443 )
									ret := 0.600000
						if( diMinus > 61.0925 )
							if( diMinus <= 77.3153 )
								if( dx <= 95.8901 )
									ret := 0.431667
								if( dx > 95.8901 )
									ret := -0.625000
							if( diMinus > 77.3153 )
								if( trueRange <= 0.016579 )
									ret := -0.518519
								if( trueRange > 0.016579 )
									ret := 0.370370
					if( smoothedTrueRange > 0.156558 )
						if( adx <= 46.6516 )
							if( dx <= 71.5782 )
								if( smoothedDirectionalMovementPlus <= 0.031134 )
									ret := -0.200000
								if( smoothedDirectionalMovementPlus > 0.031134 )
									ret := 0.555556
							if( dx > 71.5782 )
								ret := 1.000000 // buy
						if( adx > 46.6516 )
							if( adx <= 59.1898 )
								if( diPlus <= 13.1646 )
									ret := -1.000000 // sell
								if( diPlus > 13.1646 )
									ret := -0.500000
							if( adx > 59.1898 )
								if( diMinus <= 70.612 )
									ret := 0.217391
								if( diMinus > 70.612 )
									ret := -0.909091 // sell
				if( smoothedDirectionalMovementMinus > 0.174895 )
					if( adx <= 49.9393 )
						if( smoothedDirectionalMovementMinus <= 0.216525 )
							if( smoothedTrueRange <= 0.293541 )
								ret := 1.000000 // buy
							if( smoothedTrueRange > 0.293541 )
								ret := 0.500000
						if( smoothedDirectionalMovementMinus > 0.216525 )
							ret := 1.000000 // buy
					if( adx > 49.9393 )
						if( diPlus <= 5.30352 )
							ret := 1.000000 // buy
						if( diPlus > 5.30352 )
							if( directionalMovementPlus <= 0.029812 )
								ret := 0.000000
							if( directionalMovementPlus > 0.029812 )
								ret := -0.666667
	if( directionalMovementMinus > 0.075128 )
		if( diPlus <= 30.2857 )
			if( directionalMovementMinus <= 0.343115 )
				if( diMinus <= 68.1152 )
					if( dx <= 90.1299 )
						if( dx <= 3.77659 )
							if( adx <= 52.6787 )
								if( diPlus <= 24.5314 )
									ret := -0.455285
								if( diPlus > 24.5314 )
									ret := 0.010989
							if( adx > 52.6787 )
								if( diPlus <= 21.01 )
									ret := 1.000000 // buy
								if( diPlus > 21.01 )
									ret := 0.166667
						if( dx > 3.77659 )
							if( diPlus <= 2.52156 )
								if( trueRange <= 0.154291 )
									ret := 0.777778 // buy
								if( trueRange > 0.154291 )
									ret := 1.000000 // buy
							if( diPlus > 2.52156 )
								if( smoothedTrueRange <= 0.112304 )
									ret := 0.149205
								if( smoothedTrueRange > 0.112304 )
									ret := 0.043630
					if( dx > 90.1299 )
						if( smoothedDirectionalMovementPlus <= 0.002393 )
							if( smoothedTrueRange <= 0.13733 )
								if( trueRange <= 0.095429 )
									ret := 0.625000
								if( trueRange > 0.095429 )
									ret := -0.413043
							if( smoothedTrueRange > 0.13733 )
								if( diMinus <= 44.5893 )
									ret := 0.400000
								if( diMinus > 44.5893 )
									ret := 0.916667 // buy
						if( smoothedDirectionalMovementPlus > 0.002393 )
							if( smoothedDirectionalMovementMinus <= 0.139643 )
								if( smoothedDirectionalMovementMinus <= 0.074274 )
									ret := -0.466667
								if( smoothedDirectionalMovementMinus > 0.074274 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 0.139643 )
								ret := 0.250000
				if( diMinus > 68.1152 )
					if( trueRange <= 0.233372 )
						if( adx <= 35.549 )
							if( diPlus <= 15.6418 )
								if( adx <= 24.7682 )
									ret := -0.285714
								if( adx > 24.7682 )
									ret := 0.833333 // buy
							if( diPlus > 15.6418 )
								if( adx <= 32.0661 )
									ret := 0.927536 // buy
								if( adx > 32.0661 )
									ret := 0.642857
						if( adx > 35.549 )
							if( trueRange <= 0.08643 )
								ret := -0.600000
							if( trueRange > 0.08643 )
								if( smoothedTrueRange <= 0.151129 )
									ret := 0.425000
								if( smoothedTrueRange > 0.151129 )
									ret := 1.000000 // buy
					if( trueRange > 0.233372 )
						if( directionalMovementMinus <= 0.240474 )
							if( adx <= 60.5024 )
								if( smoothedDirectionalMovementPlus <= 0.012209 )
									ret := -1.000000 // sell
								if( smoothedDirectionalMovementPlus > 0.012209 )
									ret := -0.600000
							if( adx > 60.5024 )
								ret := 1.000000 // buy
						if( directionalMovementMinus > 0.240474 )
							if( smoothedDirectionalMovementMinus <= 0.055926 )
								if( smoothedDirectionalMovementMinus <= 0.032691 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.032691 )
									ret := 0.933333 // buy
							if( smoothedDirectionalMovementMinus > 0.055926 )
								if( dx <= 61.9227 )
									ret := 0.750000 // buy
								if( dx > 61.9227 )
									ret := -0.250000
			if( directionalMovementMinus > 0.343115 )
				if( adx <= 22.9633 )
					if( adx <= 13.7615 )
						ret := 1.000000 // buy
					if( adx > 13.7615 )
						if( dx <= 53.5963 )
							if( smoothedTrueRange <= 0.133208 )
								if( diMinus <= 56.2971 )
									ret := 0.250000
								if( diMinus > 56.2971 )
									ret := -0.500000
							if( smoothedTrueRange > 0.133208 )
								ret := -1.000000 // sell
						if( dx > 53.5963 )
							if( diMinus <= 82.6315 )
								if( smoothedTrueRange <= 0.137741 )
									ret := 0.250000
								if( smoothedTrueRange > 0.137741 )
									ret := 1.000000 // buy
							if( diMinus > 82.6315 )
								ret := -1.000000 // sell
				if( adx > 22.9633 )
					if( diPlus <= 13.4177 )
						if( dx <= 60.6003 )
							ret := -0.857143 // sell
						if( dx > 60.6003 )
							if( dx <= 84.0064 )
								if( diPlus <= 9.26905 )
									ret := 0.058824
								if( diPlus > 9.26905 )
									ret := 0.615385
							if( dx > 84.0064 )
								if( diPlus <= 5.35542 )
									ret := 1.000000 // buy
								if( diPlus > 5.35542 )
									ret := 0.750000 // buy
					if( diPlus > 13.4177 )
						if( diMinus <= 69.4608 )
							if( dx <= 28.3911 )
								if( dx <= 20.6186 )
									ret := 0.850000 // buy
								if( dx > 20.6186 )
									ret := -0.600000
							if( dx > 28.3911 )
								if( smoothedTrueRange <= 0.326465 )
									ret := 0.982456 // buy
								if( smoothedTrueRange > 0.326465 )
									ret := 0.750000 // buy
						if( diMinus > 69.4608 )
							if( diPlus <= 15.6348 )
								if( adx <= 25.0311 )
									ret := 0.000000
								if( adx > 25.0311 )
									ret := 1.000000 // buy
							if( diPlus > 15.6348 )
								ret := -0.833333 // sell
		if( diPlus > 30.2857 )
			if( diMinus <= 36.7148 )
				if( trueRange <= 0.290185 )
					if( smoothedTrueRange <= 0.063636 )
						if( adx <= 28.5071 )
							if( directionalMovementPlus <= 0.000765 )
								if( dx <= 8.73864 )
									ret := 0.142857
								if( dx > 8.73864 )
									ret := -0.447368
							if( directionalMovementPlus > 0.000765 )
								ret := -1.000000 // sell
						if( adx > 28.5071 )
							if( diPlus <= 35.7305 )
								if( diMinus <= 26.89 )
									ret := 0.666667
								if( diMinus > 26.89 )
									ret := 0.000000
							if( diPlus > 35.7305 )
								if( trueRange <= 0.094017 )
									ret := 0.333333
								if( trueRange > 0.094017 )
									ret := -0.214286
					if( smoothedTrueRange > 0.063636 )
						if( diPlus <= 52.3666 )
							if( dx <= 0.224059 )
								ret := -1.000000 // sell
							if( dx > 0.224059 )
								if( diPlus <= 49.4162 )
									ret := 0.347826
								if( diPlus > 49.4162 )
									ret := -0.555556
						if( diPlus > 52.3666 )
							if( adx <= 17.9117 )
								if( adx <= 17.1639 )
									ret := -0.200000
								if( adx > 17.1639 )
									ret := -1.000000 // sell
							if( adx > 17.9117 )
								if( smoothedDirectionalMovementPlus <= 0.057445 )
									ret := 0.440678
								if( smoothedDirectionalMovementPlus > 0.057445 )
									ret := 0.695238
				if( trueRange > 0.290185 )
					if( adx <= 52.9863 )
						if( dx <= 26.9536 )
							if( dx <= 3.94161 )
								ret := -0.571429
							if( dx > 3.94161 )
								if( smoothedDirectionalMovementMinus <= 0.034085 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.034085 )
									ret := 0.702128 // buy
						if( dx > 26.9536 )
							if( dx <= 44.1052 )
								if( adx <= 48.1963 )
									ret := -0.566667
								if( adx > 48.1963 )
									ret := 0.666667
							if( dx > 44.1052 )
								if( smoothedDirectionalMovementMinus <= 0.087954 )
									ret := 0.718750 // buy
								if( smoothedDirectionalMovementMinus > 0.087954 )
									ret := -1.000000 // sell
					if( adx > 52.9863 )
						if( diMinus <= 19.7977 )
							if( directionalMovementMinus <= 0.157929 )
								ret := -0.400000
							if( directionalMovementMinus > 0.157929 )
								ret := -1.000000 // sell
						if( diMinus > 19.7977 )
							ret := 0.500000
			if( diMinus > 36.7148 )
				if( diPlus <= 50.9255 )
					if( diPlus <= 41.711 )
						if( diPlus <= 34.5864 )
							if( directionalMovementMinus <= 0.462573 )
								if( smoothedTrueRange <= 0.113854 )
									ret := 0.666667
								if( smoothedTrueRange > 0.113854 )
									ret := 0.300000
							if( directionalMovementMinus > 0.462573 )
								ret := 1.000000 // buy
						if( diPlus > 34.5864 )
							if( dx <= 21.8945 )
								if( smoothedDirectionalMovementPlus <= 0.039367 )
									ret := 0.286885
								if( smoothedDirectionalMovementPlus > 0.039367 )
									ret := -0.106061
							if( dx > 21.8945 )
								if( smoothedDirectionalMovementMinus <= 0.04602 )
									ret := 0.333333
								if( smoothedDirectionalMovementMinus > 0.04602 )
									ret := 0.741379 // buy
					if( diPlus > 41.711 )
						if( diMinus <= 54.0434 )
							if( dx <= 8.77474 )
								if( directionalMovementMinus <= 0.110021 )
									ret := 0.487805
								if( directionalMovementMinus > 0.110021 )
									ret := 0.757447 // buy
							if( dx > 8.77474 )
								if( diPlus <= 42.7684 )
									ret := 0.500000
								if( diPlus > 42.7684 )
									ret := 0.944444 // buy
						if( diMinus > 54.0434 )
							if( adx <= 14.1871 )
								if( smoothedDirectionalMovementMinus <= 0.04347 )
									ret := -0.833333 // sell
								if( smoothedDirectionalMovementMinus > 0.04347 )
									ret := 0.409091
							if( adx > 14.1871 )
								if( diMinus <= 55.4589 )
									ret := 0.428571
								if( diMinus > 55.4589 )
									ret := 0.885714 // buy
				if( diPlus > 50.9255 )
					if( directionalMovementPlus <= 0.025212 )
						if( smoothedDirectionalMovementMinus <= 0.066425 )
							if( directionalMovementMinus <= 0.121836 )
								if( adx <= 14.454 )
									ret := -0.500000
								if( adx > 14.454 )
									ret := 0.192308
							if( directionalMovementMinus > 0.121836 )
								if( diPlus <= 52.8877 )
									ret := 0.764706 // buy
								if( diPlus > 52.8877 )
									ret := 0.369565
						if( smoothedDirectionalMovementMinus > 0.066425 )
							if( diMinus <= 42.9417 )
								ret := 0.000000
							if( diMinus > 42.9417 )
								ret := -1.000000 // sell
					if( directionalMovementPlus > 0.025212 )
						if( trueRange <= 0.165114 )
							ret := -0.500000
						if( trueRange > 0.165114 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_UBER_1Min_911c63f0(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)

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


