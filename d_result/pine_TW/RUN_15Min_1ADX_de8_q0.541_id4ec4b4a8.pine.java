//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: RUN_15Min_1ADX_4ec4b4a8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_1ADX_4ec4b4a8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_4ec4b4a8(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( diMinus <= 34.8064 )
		if( diPlus <= 39.7213 )
			if( smoothedTrueRange <= 0.259258 )
				if( directionalMovementPlus <= 0.127417 )
					if( directionalMovementMinus <= 0.262094 )
						if( diPlus <= 2.61609 )
							if( smoothedDirectionalMovementPlus <= 0.003868 )
								if( adx <= 44.4029 )
									ret := 0.190476
								if( adx > 44.4029 )
									ret := -0.277778
							if( smoothedDirectionalMovementPlus > 0.003868 )
								if( directionalMovementMinus <= 0.01577 )
									ret := -0.750000 // sell
								if( directionalMovementMinus > 0.01577 )
									ret := -0.966667 // sell
						if( diPlus > 2.61609 )
							if( smoothedDirectionalMovementMinus <= 0.049956 )
								if( directionalMovementMinus <= 0.136572 )
									ret := 0.036143
								if( directionalMovementMinus > 0.136572 )
									ret := 0.161496
							if( smoothedDirectionalMovementMinus > 0.049956 )
								if( diMinus <= 33.1245 )
									ret := 0.001661
								if( diMinus > 33.1245 )
									ret := -0.155191
					if( directionalMovementMinus > 0.262094 )
						if( adx <= 56.2438 )
							if( directionalMovementPlus <= 0.021812 )
								if( diPlus <= 36.4256 )
									ret := 0.428941
								if( diPlus > 36.4256 )
									ret := -0.136364
							if( directionalMovementPlus > 0.021812 )
								ret := -0.625000
						if( adx > 56.2438 )
							if( smoothedDirectionalMovementPlus <= 0.053309 )
								if( dx <= 9.07568 )
									ret := 0.772727 // buy
								if( dx > 9.07568 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 0.053309 )
								ret := 0.523810
				if( directionalMovementPlus > 0.127417 )
					if( diPlus <= 34.1096 )
						if( smoothedTrueRange <= 0.127353 )
							if( diPlus <= 28.8613 )
								if( directionalMovementPlus <= 0.162093 )
									ret := -0.395604
								if( directionalMovementPlus > 0.162093 )
									ret := 0.130435
							if( diPlus > 28.8613 )
								if( dx <= 2.95617 )
									ret := -0.821429 // sell
								if( dx > 2.95617 )
									ret := -0.416667
						if( smoothedTrueRange > 0.127353 )
							if( directionalMovementPlus <= 0.246737 )
								if( dx <= 32.5455 )
									ret := 0.027842
								if( dx > 32.5455 )
									ret := 0.236842
							if( directionalMovementPlus > 0.246737 )
								if( diPlus <= 33.0434 )
									ret := -0.055172
								if( diPlus > 33.0434 )
									ret := -0.534884
					if( diPlus > 34.1096 )
						if( trueRange <= 0.401504 )
							if( smoothedDirectionalMovementMinus <= 0.059145 )
								if( smoothedDirectionalMovementPlus <= 0.073443 )
									ret := -0.326296
								if( smoothedDirectionalMovementPlus > 0.073443 )
									ret := -0.014815
							if( smoothedDirectionalMovementMinus > 0.059145 )
								if( trueRange <= 0.339462 )
									ret := -0.900000 // sell
								if( trueRange > 0.339462 )
									ret := -0.558824
						if( trueRange > 0.401504 )
							if( diMinus <= 19.197 )
								if( smoothedDirectionalMovementPlus <= 0.078921 )
									ret := -0.152174
								if( smoothedDirectionalMovementPlus > 0.078921 )
									ret := -0.674419
							if( diMinus > 19.197 )
								if( dx <= 4.11299 )
									ret := -1.000000 // sell
								if( dx > 4.11299 )
									ret := 0.213542
			if( smoothedTrueRange > 0.259258 )
				if( diPlus <= 8.15639 )
					if( adx <= 31.302 )
						if( diMinus <= 19.7621 )
							if( trueRange <= 0.332691 )
								ret := -0.363636
							if( trueRange > 0.332691 )
								ret := -0.888889 // sell
						if( diMinus > 19.7621 )
							if( diMinus <= 25.8733 )
								if( smoothedTrueRange <= 0.346081 )
									ret := 0.269231
								if( smoothedTrueRange > 0.346081 )
									ret := 0.675676
							if( diMinus > 25.8733 )
								if( dx <= 59.9445 )
									ret := -0.620690
								if( dx > 59.9445 )
									ret := 0.210526
					if( adx > 31.302 )
						if( dx <= 91.7869 )
							if( smoothedDirectionalMovementPlus <= 0.011399 )
								if( directionalMovementMinus <= 0.032691 )
									ret := -0.476190
								if( directionalMovementMinus > 0.032691 )
									ret := -0.900000 // sell
							if( smoothedDirectionalMovementPlus > 0.011399 )
								if( diPlus <= 4.98321 )
									ret := -0.027027
								if( diPlus > 4.98321 )
									ret := -0.423581
						if( dx > 91.7869 )
							if( adx <= 62.5463 )
								ret := 0.181818
							if( adx > 62.5463 )
								ret := 0.961538 // buy
				if( diPlus > 8.15639 )
					if( trueRange <= 0.288364 )
						if( adx <= 26.2872 )
							if( diPlus <= 13.5425 )
								if( diPlus <= 13.2374 )
									ret := -0.291908
								if( diPlus > 13.2374 )
									ret := -0.714286 // sell
							if( diPlus > 13.5425 )
								if( diMinus <= 25.8171 )
									ret := -0.044291
								if( diMinus > 25.8171 )
									ret := 0.072917
						if( adx > 26.2872 )
							if( diMinus <= 5.56044 )
								if( smoothedDirectionalMovementMinus <= 0.013175 )
									ret := -0.007937
								if( smoothedDirectionalMovementMinus > 0.013175 )
									ret := -0.513761
							if( diMinus > 5.56044 )
								if( smoothedDirectionalMovementMinus <= 0.098575 )
									ret := 0.068937
								if( smoothedDirectionalMovementMinus > 0.098575 )
									ret := 0.207430
					if( trueRange > 0.288364 )
						if( adx <= 78.0451 )
							if( diMinus <= 23.4685 )
								if( adx <= 54.6341 )
									ret := -0.001929
								if( adx > 54.6341 )
									ret := -0.169355
							if( diMinus > 23.4685 )
								if( diPlus <= 9.47692 )
									ret := 0.229508
								if( diPlus > 9.47692 )
									ret := -0.116767
						if( adx > 78.0451 )
							if( trueRange <= 0.362783 )
								if( directionalMovementPlus <= 0.058987 )
									ret := 0.545455
								if( directionalMovementPlus > 0.058987 )
									ret := -0.800000 // sell
							if( trueRange > 0.362783 )
								if( dx <= 78.1623 )
									ret := 0.927273 // buy
								if( dx > 78.1623 )
									ret := 0.565217
		if( diPlus > 39.7213 )
			if( directionalMovementPlus <= 0.224182 )
				if( diMinus <= 8.96155 )
					if( diPlus <= 48.7531 )
						if( smoothedDirectionalMovementPlus <= 0.307097 )
							if( directionalMovementPlus <= 0.005558 )
								if( smoothedDirectionalMovementMinus <= 0.001389 )
									ret := -0.397590
								if( smoothedDirectionalMovementMinus > 0.001389 )
									ret := -0.160279
							if( directionalMovementPlus > 0.005558 )
								if( smoothedDirectionalMovementPlus <= 0.226009 )
									ret := -0.044734
								if( smoothedDirectionalMovementPlus > 0.226009 )
									ret := 0.509091
						if( smoothedDirectionalMovementPlus > 0.307097 )
							if( directionalMovementMinus <= 0.000681 )
								if( smoothedTrueRange <= 0.766186 )
									ret := 0.375000
								if( smoothedTrueRange > 0.766186 )
									ret := 0.000000
							if( directionalMovementMinus > 0.000681 )
								if( diMinus <= 6.21958 )
									ret := 1.000000 // buy
								if( diMinus > 6.21958 )
									ret := 0.700000 // buy
					if( diPlus > 48.7531 )
						if( diPlus <= 55.0243 )
							if( dx <= 77.4439 )
								if( diMinus <= 8.04188 )
									ret := 0.635071
								if( diMinus > 8.04188 )
									ret := 0.100000
							if( dx > 77.4439 )
								if( smoothedTrueRange <= 0.091568 )
									ret := 0.404762
								if( smoothedTrueRange > 0.091568 )
									ret := 0.023873
						if( diPlus > 55.0243 )
							if( smoothedDirectionalMovementPlus <= 0.224147 )
								if( smoothedTrueRange <= 0.23901 )
									ret := -0.101695
								if( smoothedTrueRange > 0.23901 )
									ret := 0.232323
							if( smoothedDirectionalMovementPlus > 0.224147 )
								if( adx <= 42.6163 )
									ret := -0.454545
								if( adx > 42.6163 )
									ret := -0.895833 // sell
				if( diMinus > 8.96155 )
					if( adx <= 39.7477 )
						if( diPlus <= 71.0334 )
							if( dx <= 41.3801 )
								if( dx <= 32.7975 )
									ret := -0.192492
								if( dx > 32.7975 )
									ret := 0.039344
							if( dx > 41.3801 )
								if( dx <= 50.9863 )
									ret := -0.361654
								if( dx > 50.9863 )
									ret := -0.132749
						if( diPlus > 71.0334 )
							if( trueRange <= 0.155 )
								if( adx <= 34.1528 )
									ret := 0.000000
								if( adx > 34.1528 )
									ret := 0.333333
							if( trueRange > 0.155 )
								ret := 1.000000 // buy
					if( adx > 39.7477 )
						if( directionalMovementPlus <= 1e-06 )
							if( adx <= 41.7802 )
								if( dx <= 64.8835 )
									ret := 0.520468
								if( dx > 64.8835 )
									ret := -0.250000
							if( adx > 41.7802 )
								if( directionalMovementMinus <= 0.022335 )
									ret := -0.134615
								if( directionalMovementMinus > 0.022335 )
									ret := 0.182116
						if( directionalMovementPlus > 1e-06 )
							if( trueRange <= 0.3255 )
								if( dx <= 40.0349 )
									ret := -0.374286
								if( dx > 40.0349 )
									ret := -0.079252
							if( trueRange > 0.3255 )
								if( smoothedTrueRange <= 0.279494 )
									ret := 0.515152
								if( smoothedTrueRange > 0.279494 )
									ret := -0.081081
			if( directionalMovementPlus > 0.224182 )
				if( diPlus <= 43.84 )
					if( diMinus <= 6.01218 )
						if( smoothedDirectionalMovementPlus <= 0.117206 )
							ret := 0.857143 // buy
						if( smoothedDirectionalMovementPlus > 0.117206 )
							if( smoothedTrueRange <= 0.364435 )
								ret := -0.400000
							if( smoothedTrueRange > 0.364435 )
								if( smoothedTrueRange <= 0.604318 )
									ret := 0.687500
								if( smoothedTrueRange > 0.604318 )
									ret := -0.250000
					if( diMinus > 6.01218 )
						if( smoothedDirectionalMovementPlus <= 0.068317 )
							if( directionalMovementMinus <= 5.2e-05 )
								if( directionalMovementPlus <= 0.329108 )
									ret := 0.235294
								if( directionalMovementPlus > 0.329108 )
									ret := -0.650000
							if( directionalMovementMinus > 5.2e-05 )
								if( directionalMovementMinus <= 0.006626 )
									ret := -0.454545
								if( directionalMovementMinus > 0.006626 )
									ret := -0.900000 // sell
						if( smoothedDirectionalMovementPlus > 0.068317 )
							if( trueRange <= 1.45256 )
								if( smoothedDirectionalMovementMinus <= 0.024457 )
									ret := -0.238095
								if( smoothedDirectionalMovementMinus > 0.024457 )
									ret := -0.655046
							if( trueRange > 1.45256 )
								if( adx <= 24.8076 )
									ret := 0.600000
								if( adx > 24.8076 )
									ret := -0.333333
				if( diPlus > 43.84 )
					if( diPlus <= 53.1992 )
						if( diPlus <= 48.6848 )
							if( trueRange <= 0.337597 )
								if( diMinus <= 27.8071 )
									ret := -0.670213
								if( diMinus > 27.8071 )
									ret := -0.241379
							if( trueRange > 0.337597 )
								if( diPlus <= 46.3708 )
									ret := 0.120735
								if( diPlus > 46.3708 )
									ret := -0.359673
						if( diPlus > 48.6848 )
							if( directionalMovementPlus <= 0.318376 )
								if( diPlus <= 50.3619 )
									ret := -0.396825
								if( diPlus > 50.3619 )
									ret := -0.037500
							if( directionalMovementPlus > 0.318376 )
								if( dx <= 89.6609 )
									ret := 0.317618
								if( dx > 89.6609 )
									ret := -0.882353 // sell
					if( diPlus > 53.1992 )
						if( diMinus <= 5.22764 )
							if( diPlus <= 64.3458 )
								if( dx <= 83.5966 )
									ret := 1.000000 // buy
								if( dx > 83.5966 )
									ret := 0.460526
							if( diPlus > 64.3458 )
								if( smoothedTrueRange <= 0.200904 )
									ret := -0.843750 // sell
								if( smoothedTrueRange > 0.200904 )
									ret := -0.304348
						if( diMinus > 5.22764 )
							if( smoothedDirectionalMovementMinus <= 0.021409 )
								if( adx <= 29.1461 )
									ret := -0.752688 // sell
								if( adx > 29.1461 )
									ret := -0.368664
							if( smoothedDirectionalMovementMinus > 0.021409 )
								if( trueRange <= 1.68467 )
									ret := -0.149606
								if( trueRange > 1.68467 )
									ret := -0.698925
	if( diMinus > 34.8064 )
		if( dx <= 11.5893 )
			if( diMinus <= 41.1748 )
				if( adx <= 8.56941 )
					if( smoothedDirectionalMovementPlus <= 0.096428 )
						if( adx <= 7.10536 )
							ret := -0.923077 // sell
						if( adx > 7.10536 )
							ret := -1.000000 // sell
					if( smoothedDirectionalMovementPlus > 0.096428 )
						ret := -0.727273 // sell
				if( adx > 8.56941 )
					if( dx <= 8.31752 )
						if( dx <= 8.23715 )
							if( dx <= 3.29434 )
								if( dx <= 0.961153 )
									ret := 0.032558
								if( dx > 0.961153 )
									ret := -0.223529
							if( dx > 3.29434 )
								if( directionalMovementPlus <= 0.037138 )
									ret := 0.139423
								if( directionalMovementPlus > 0.037138 )
									ret := -0.080000
						if( dx > 8.23715 )
							ret := 0.781250 // buy
					if( dx > 8.31752 )
						if( directionalMovementPlus <= 0.110556 )
							if( directionalMovementMinus <= 0.797535 )
								if( directionalMovementMinus <= 0.145702 )
									ret := -0.137363
								if( directionalMovementMinus > 0.145702 )
									ret := -0.537975
							if( directionalMovementMinus > 0.797535 )
								ret := 0.538462
						if( directionalMovementPlus > 0.110556 )
							if( diMinus <= 39.2259 )
								if( smoothedDirectionalMovementPlus <= 0.046203 )
									ret := 0.100000
								if( smoothedDirectionalMovementPlus > 0.046203 )
									ret := -0.627907
							if( diMinus > 39.2259 )
								ret := 0.210526
			if( diMinus > 41.1748 )
				if( adx <= 15.5698 )
					if( smoothedDirectionalMovementPlus <= 0.068473 )
						if( diPlus <= 48.628 )
							if( diPlus <= 46.4197 )
								if( smoothedDirectionalMovementPlus <= 0.045933 )
									ret := -0.081633
								if( smoothedDirectionalMovementPlus > 0.045933 )
									ret := -0.772727 // sell
							if( diPlus > 46.4197 )
								ret := -0.916667 // sell
						if( diPlus > 48.628 )
							if( diPlus <= 49.1043 )
								ret := 1.000000 // buy
							if( diPlus > 49.1043 )
								ret := -0.200000
					if( smoothedDirectionalMovementPlus > 0.068473 )
						if( smoothedDirectionalMovementPlus <= 0.137961 )
							if( smoothedDirectionalMovementMinus <= 0.103929 )
								if( smoothedDirectionalMovementMinus <= 0.097679 )
									ret := 0.600000
								if( smoothedDirectionalMovementMinus > 0.097679 )
									ret := -0.375000
							if( smoothedDirectionalMovementMinus > 0.103929 )
								if( dx <= 5.03124 )
									ret := 0.580645
								if( dx > 5.03124 )
									ret := 0.941176 // buy
						if( smoothedDirectionalMovementPlus > 0.137961 )
							if( smoothedTrueRange <= 0.328479 )
								ret := -0.083333
							if( smoothedTrueRange > 0.328479 )
								ret := 0.285714
				if( adx > 15.5698 )
					if( dx <= 8.75257 )
						if( directionalMovementMinus <= 0.210816 )
							if( dx <= 4.7944 )
								if( diPlus <= 43.2415 )
									ret := -0.088889
								if( diPlus > 43.2415 )
									ret := -0.467890
							if( dx > 4.7944 )
								if( adx <= 20.3347 )
									ret := -0.274510
								if( adx > 20.3347 )
									ret := 0.412281
						if( directionalMovementMinus > 0.210816 )
							if( smoothedTrueRange <= 0.120696 )
								ret := -0.733333 // sell
							if( smoothedTrueRange > 0.120696 )
								if( adx <= 36.1739 )
									ret := 0.732673 // buy
								if( adx > 36.1739 )
									ret := 0.400000
					if( dx > 8.75257 )
						if( smoothedDirectionalMovementMinus <= 0.033389 )
							if( smoothedDirectionalMovementPlus <= 0.020338 )
								if( smoothedDirectionalMovementMinus <= 0.021307 )
									ret := 0.142857
								if( smoothedDirectionalMovementMinus > 0.021307 )
									ret := 0.166667
							if( smoothedDirectionalMovementPlus > 0.020338 )
								if( smoothedDirectionalMovementPlus <= 0.02204 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 0.02204 )
									ret := 0.421053
						if( smoothedDirectionalMovementMinus > 0.033389 )
							if( smoothedDirectionalMovementMinus <= 0.255778 )
								if( trueRange <= 0.332083 )
									ret := -0.419118
								if( trueRange > 0.332083 )
									ret := -0.016949
							if( smoothedDirectionalMovementMinus > 0.255778 )
								ret := -1.000000 // sell
		if( dx > 11.5893 )
			if( smoothedTrueRange <= 0.099597 )
				if( directionalMovementMinus <= 0.030731 )
					if( smoothedTrueRange <= 0.022146 )
						if( smoothedDirectionalMovementPlus <= 0.001107 )
							ret := 0.900000 // buy
						if( smoothedDirectionalMovementPlus > 0.001107 )
							if( smoothedDirectionalMovementMinus <= 0.0075 )
								ret := 0.000000
							if( smoothedDirectionalMovementMinus > 0.0075 )
								ret := 0.636364
					if( smoothedTrueRange > 0.022146 )
						if( adx <= 87.6488 )
							if( adx <= 35.4305 )
								if( smoothedDirectionalMovementPlus <= 0.023693 )
									ret := 0.012354
								if( smoothedDirectionalMovementPlus > 0.023693 )
									ret := -0.268966
							if( adx > 35.4305 )
								if( smoothedDirectionalMovementPlus <= 0.008575 )
									ret := 0.136824
								if( smoothedDirectionalMovementPlus > 0.008575 )
									ret := 0.250799
						if( adx > 87.6488 )
							if( smoothedDirectionalMovementPlus <= 0.001479 )
								ret := -0.666667
							if( smoothedDirectionalMovementPlus > 0.001479 )
								ret := -1.000000 // sell
				if( directionalMovementMinus > 0.030731 )
					if( diPlus <= 11.7305 )
						if( adx <= 52.3822 )
							if( trueRange <= 0.334322 )
								if( diMinus <= 39.8845 )
									ret := 0.042105
								if( diMinus > 39.8845 )
									ret := 0.335294
							if( trueRange > 0.334322 )
								if( diMinus <= 55.3944 )
									ret := -0.800000 // sell
								if( diMinus > 55.3944 )
									ret := 0.454545
						if( adx > 52.3822 )
							if( smoothedDirectionalMovementPlus <= 0.000725 )
								if( diMinus <= 51.9237 )
									ret := 0.000000
								if( diMinus > 51.9237 )
									ret := 0.727273 // buy
							if( smoothedDirectionalMovementPlus > 0.000725 )
								if( smoothedTrueRange <= 0.063372 )
									ret := 0.018182
								if( smoothedTrueRange > 0.063372 )
									ret := -0.428571
					if( diPlus > 11.7305 )
						if( smoothedTrueRange <= 0.031918 )
							if( adx <= 22.9498 )
								ret := 0.500000
							if( adx > 22.9498 )
								if( smoothedDirectionalMovementPlus <= 0.006105 )
									ret := -0.300000
								if( smoothedDirectionalMovementPlus > 0.006105 )
									ret := -0.700000 // sell
						if( smoothedTrueRange > 0.031918 )
							if( diMinus <= 58.3249 )
								if( smoothedDirectionalMovementMinus <= 0.035703 )
									ret := 0.378619
								if( smoothedDirectionalMovementMinus > 0.035703 )
									ret := 0.130719
							if( diMinus > 58.3249 )
								if( diMinus <= 65.3571 )
									ret := 0.795699 // buy
								if( diMinus > 65.3571 )
									ret := 0.333333
			if( smoothedTrueRange > 0.099597 )
				if( smoothedDirectionalMovementMinus <= 0.508541 )
					if( diPlus <= 3.9817 )
						if( directionalMovementPlus <= 0.001196 )
							if( smoothedDirectionalMovementPlus <= 0.00143 )
								if( smoothedTrueRange <= 0.228714 )
									ret := -0.511628
								if( smoothedTrueRange > 0.228714 )
									ret := 0.357143
							if( smoothedDirectionalMovementPlus > 0.00143 )
								if( diMinus <= 51.2324 )
									ret := 0.037367
								if( diMinus > 51.2324 )
									ret := 0.635945
						if( directionalMovementPlus > 0.001196 )
							if( dx <= 94.7542 )
								if( diMinus <= 43.7178 )
									ret := 0.071429
								if( diMinus > 43.7178 )
									ret := 0.797101 // buy
							if( dx > 94.7542 )
								if( directionalMovementPlus <= 0.012112 )
									ret := 0.600000
								if( directionalMovementPlus > 0.012112 )
									ret := -0.600000
					if( diPlus > 3.9817 )
						if( dx <= 81.6053 )
							if( smoothedDirectionalMovementPlus <= 0.078968 )
								if( dx <= 12.2226 )
									ret := 0.476190
								if( dx > 12.2226 )
									ret := 0.014492
							if( smoothedDirectionalMovementPlus > 0.078968 )
								if( trueRange <= 0.422908 )
									ret := 0.011752
								if( trueRange > 0.422908 )
									ret := 0.196195
						if( dx > 81.6053 )
							if( trueRange <= 0.197272 )
								if( trueRange <= 0.177272 )
									ret := -0.148760
								if( trueRange > 0.177272 )
									ret := 0.781250 // buy
							if( trueRange > 0.197272 )
								if( smoothedTrueRange <= 0.440861 )
									ret := -0.336323
								if( smoothedTrueRange > 0.440861 )
									ret := -0.788136 // sell
				if( smoothedDirectionalMovementMinus > 0.508541 )
					if( trueRange <= 0.469999 )
						ret := -0.714286 // sell
					if( trueRange > 0.469999 )
						if( dx <= 86.9024 )
							if( diPlus <= 20.4126 )
								if( adx <= 49.7953 )
									ret := 0.344828
								if( adx > 49.7953 )
									ret := 0.833333 // buy
							if( diPlus > 20.4126 )
								ret := 0.909091 // buy
						if( dx > 86.9024 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_RUN_15Min_4ec4b4a8(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)

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


