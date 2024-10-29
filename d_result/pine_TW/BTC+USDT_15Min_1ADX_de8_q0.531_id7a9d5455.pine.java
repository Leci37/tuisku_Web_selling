//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: BTCUSDT_15Min_1ADX_7a9d5455 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_1ADX_7a9d5455", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_7a9d5455(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( dx <= 53.8573 )
		if( smoothedTrueRange <= 373.917 )
			if( diMinus <= 10.8021 )
				if( adx <= 20.0766 )
					if( diMinus <= 6.73335 )
						ret := 0.904762 // buy
					if( diMinus > 6.73335 )
						if( smoothedDirectionalMovementMinus <= 24.3492 )
							if( diPlus <= 27.5419 )
								if( adx <= 19.861 )
									ret := -0.030973
								if( adx > 19.861 )
									ret := 0.727273 // buy
							if( diPlus > 27.5419 )
								if( directionalMovementPlus <= 21.0798 )
									ret := 0.555556
								if( directionalMovementPlus > 21.0798 )
									ret := 0.062500
						if( smoothedDirectionalMovementMinus > 24.3492 )
							ret := 0.720000 // buy
				if( adx > 20.0766 )
					if( adx <= 71.242 )
						if( smoothedDirectionalMovementMinus <= 4.185 )
							if( smoothedDirectionalMovementPlus <= 7.02214 )
								if( adx <= 39.9949 )
									ret := -0.131455
								if( adx > 39.9949 )
									ret := 0.189189
							if( smoothedDirectionalMovementPlus > 7.02214 )
								if( adx <= 60.9223 )
									ret := 0.212963
								if( adx > 60.9223 )
									ret := -0.800000 // sell
						if( smoothedDirectionalMovementMinus > 4.185 )
							if( smoothedDirectionalMovementPlus <= 83.4529 )
								if( trueRange <= 458.006 )
									ret := -0.160434
								if( trueRange > 458.006 )
									ret := 0.812500 // buy
							if( smoothedDirectionalMovementPlus > 83.4529 )
								if( diPlus <= 33.1492 )
									ret := -0.594828
								if( diPlus > 33.1492 )
									ret := 0.090909
					if( adx > 71.242 )
						if( diMinus <= 9.01792 )
							if( dx <= 46.7037 )
								ret := -0.117647
							if( dx > 46.7037 )
								ret := 0.400000
						if( diMinus > 9.01792 )
							if( diPlus <= 22.0322 )
								ret := 0.875000 // buy
							if( diPlus > 22.0322 )
								if( adx <= 81.2214 )
									ret := 0.220000
								if( adx > 81.2214 )
									ret := 0.750000 // buy
			if( diMinus > 10.8021 )
				if( adx <= 9.63866 )
					if( smoothedDirectionalMovementPlus <= 29.8264 )
						if( smoothedDirectionalMovementMinus <= 8.99788 )
							if( diPlus <= 23.9918 )
								if( smoothedTrueRange <= 42.0839 )
									ret := -0.071429
								if( smoothedTrueRange > 42.0839 )
									ret := 0.357143
							if( diPlus > 23.9918 )
								ret := -0.380952
						if( smoothedDirectionalMovementMinus > 8.99788 )
							if( directionalMovementPlus <= 36.425 )
								if( dx <= 10.5124 )
									ret := 0.620253
								if( dx > 10.5124 )
									ret := 0.180000
							if( directionalMovementPlus > 36.425 )
								if( diPlus <= 22.3847 )
									ret := -0.235294
								if( diPlus > 22.3847 )
									ret := 0.368421
					if( smoothedDirectionalMovementPlus > 29.8264 )
						if( diMinus <= 20.8397 )
							if( diPlus <= 19.2446 )
								ret := -0.600000
							if( diPlus > 19.2446 )
								ret := -1.000000 // sell
						if( diMinus > 20.8397 )
							ret := 0.315789
				if( adx > 9.63866 )
					if( directionalMovementMinus <= 89.9438 )
						if( trueRange <= 270.47 )
							if( smoothedDirectionalMovementPlus <= 96.9678 )
								if( diPlus <= 25.6411 )
									ret := -0.023283
								if( diPlus > 25.6411 )
									ret := 0.019466
							if( smoothedDirectionalMovementPlus > 96.9678 )
								if( diPlus <= 32.3442 )
									ret := -0.616438
								if( diPlus > 32.3442 )
									ret := -0.250000
						if( trueRange > 270.47 )
							if( smoothedTrueRange <= 213.278 )
								if( dx <= 48.2199 )
									ret := -0.292809
								if( dx > 48.2199 )
									ret := 0.325926
							if( smoothedTrueRange > 213.278 )
								if( adx <= 37.7341 )
									ret := 0.014385
								if( adx > 37.7341 )
									ret := -0.284153
					if( directionalMovementMinus > 89.9438 )
						if( smoothedDirectionalMovementPlus <= 26.3597 )
							if( adx <= 55.1289 )
								if( dx <= 39.229 )
									ret := 0.084842
								if( dx > 39.229 )
									ret := 0.246589
							if( adx > 55.1289 )
								if( trueRange <= 230.734 )
									ret := -0.098361
								if( trueRange > 230.734 )
									ret := -0.755556 // sell
						if( smoothedDirectionalMovementPlus > 26.3597 )
							if( adx <= 17.4412 )
								if( directionalMovementMinus <= 108.44 )
									ret := 0.200000
								if( directionalMovementMinus > 108.44 )
									ret := -0.370968
							if( adx > 17.4412 )
								if( trueRange <= 246.827 )
									ret := -0.047549
								if( trueRange > 246.827 )
									ret := 0.058043
		if( smoothedTrueRange > 373.917 )
			if( smoothedTrueRange <= 422.574 )
				if( trueRange <= 495.19 )
					if( diPlus <= 8.90935 )
						ret := -0.937500 // sell
					if( diPlus > 8.90935 )
						if( adx <= 44.5626 )
							if( smoothedDirectionalMovementMinus <= 106.679 )
								if( smoothedDirectionalMovementPlus <= 45.4282 )
									ret := 0.944444 // buy
								if( smoothedDirectionalMovementPlus > 45.4282 )
									ret := 0.107692
							if( smoothedDirectionalMovementMinus > 106.679 )
								if( diMinus <= 35.6023 )
									ret := 0.581132
								if( diMinus > 35.6023 )
									ret := -0.277778
						if( adx > 44.5626 )
							if( directionalMovementMinus <= 309.566 )
								if( diPlus <= 10.7193 )
									ret := 0.862069 // buy
								if( diPlus > 10.7193 )
									ret := -0.165605
							if( directionalMovementMinus > 309.566 )
								if( diPlus <= 23.8278 )
									ret := 1.000000 // buy
								if( diPlus > 23.8278 )
									ret := 0.666667
				if( trueRange > 495.19 )
					if( diPlus <= 20.4173 )
						if( smoothedTrueRange <= 378.633 )
							ret := -0.214286
						if( smoothedTrueRange > 378.633 )
							if( directionalMovementPlus <= 337.66 )
								if( trueRange <= 514.662 )
									ret := 0.000000
								if( trueRange > 514.662 )
									ret := 0.764045 // buy
							if( directionalMovementPlus > 337.66 )
								if( trueRange <= 541.071 )
									ret := 1.000000 // buy
								if( trueRange > 541.071 )
									ret := 0.933333 // buy
					if( diPlus > 20.4173 )
						if( dx <= 36.6162 )
							if( diPlus <= 29.6294 )
								if( diPlus <= 28.1567 )
									ret := 0.451220
								if( diPlus > 28.1567 )
									ret := -0.500000
							if( diPlus > 29.6294 )
								ret := 1.000000 // buy
						if( dx > 36.6162 )
							if( smoothedDirectionalMovementPlus <= 130.682 )
								ret := -0.562500
							if( smoothedDirectionalMovementPlus > 130.682 )
								ret := 0.615385
			if( smoothedTrueRange > 422.574 )
				if( smoothedTrueRange <= 572.89 )
					if( dx <= 47.3404 )
						if( diMinus <= 25.8062 )
							if( diPlus <= 16.5725 )
								if( dx <= 10.811 )
									ret := 0.866667 // buy
								if( dx > 10.811 )
									ret := 0.412587
							if( diPlus > 16.5725 )
								if( directionalMovementPlus <= 134.898 )
									ret := 0.077210
								if( directionalMovementPlus > 134.898 )
									ret := -0.182857
						if( diMinus > 25.8062 )
							if( diPlus <= 11.8431 )
								if( smoothedDirectionalMovementPlus <= 48.8643 )
									ret := -0.529412
								if( smoothedDirectionalMovementPlus > 48.8643 )
									ret := 0.882353 // buy
							if( diPlus > 11.8431 )
								if( smoothedDirectionalMovementMinus <= 190.568 )
									ret := -0.302799
								if( smoothedDirectionalMovementMinus > 190.568 )
									ret := 0.866667 // buy
					if( dx > 47.3404 )
						if( diPlus <= 10.3006 )
							if( adx <= 31.2871 )
								ret := 0.857143 // buy
							if( adx > 31.2871 )
								if( adx <= 48.1497 )
									ret := -0.625000
								if( adx > 48.1497 )
									ret := 0.285714
						if( diPlus > 10.3006 )
							if( trueRange <= 327.056 )
								if( trueRange <= 222.509 )
									ret := -0.352941
								if( trueRange > 222.509 )
									ret := -0.944444 // sell
							if( trueRange > 327.056 )
								if( diPlus <= 11.9069 )
									ret := -0.659091
								if( diPlus > 11.9069 )
									ret := -0.070423
				if( smoothedTrueRange > 572.89 )
					if( diPlus <= 16.1011 )
						if( smoothedDirectionalMovementMinus <= 215.453 )
							if( adx <= 62.2762 )
								if( adx <= 37.4963 )
									ret := 0.945205 // buy
								if( adx > 37.4963 )
									ret := 0.507937
							if( adx > 62.2762 )
								if( directionalMovementMinus <= 253.251 )
									ret := 0.000000
								if( directionalMovementMinus > 253.251 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementMinus > 215.453 )
							if( directionalMovementPlus <= 189.166 )
								if( trueRange <= 561.095 )
									ret := -0.470588
								if( trueRange > 561.095 )
									ret := 0.627119
							if( directionalMovementPlus > 189.166 )
								if( diMinus <= 34.9488 )
									ret := -0.111111
								if( diMinus > 34.9488 )
									ret := -0.833333 // sell
					if( diPlus > 16.1011 )
						if( smoothedTrueRange <= 612.796 )
							if( adx <= 43.1992 )
								if( diPlus <= 19.4358 )
									ret := 0.931818 // buy
								if( diPlus > 19.4358 )
									ret := 0.535714
							if( adx > 43.1992 )
								if( trueRange <= 474.588 )
									ret := -0.538462
								if( trueRange > 474.588 )
									ret := 0.181818
						if( smoothedTrueRange > 612.796 )
							if( smoothedDirectionalMovementPlus <= 164.066 )
								if( diMinus <= 27.6428 )
									ret := -0.278146
								if( diMinus > 27.6428 )
									ret := 0.354839
							if( smoothedDirectionalMovementPlus > 164.066 )
								if( diMinus <= 10.306 )
									ret := 0.636364
								if( diMinus > 10.306 )
									ret := -0.370558
	if( dx > 53.8573 )
		if( smoothedTrueRange <= 230.949 )
			if( directionalMovementPlus <= 274.315 )
				if( smoothedTrueRange <= 168.518 )
					if( trueRange <= 345.87 )
						if( directionalMovementPlus <= 75.9998 )
							if( directionalMovementPlus <= 60.2094 )
								if( adx <= 76.5744 )
									ret := 0.056065
								if( adx > 76.5744 )
									ret := -0.115145
							if( directionalMovementPlus > 60.2094 )
								if( adx <= 26.0436 )
									ret := -0.552632
								if( adx > 26.0436 )
									ret := 0.300199
						if( directionalMovementPlus > 75.9998 )
							if( smoothedTrueRange <= 119.022 )
								if( adx <= 41.9852 )
									ret := -0.115993
								if( adx > 41.9852 )
									ret := 0.192810
							if( smoothedTrueRange > 119.022 )
								if( diPlus <= 45.3151 )
									ret := -0.253012
								if( diPlus > 45.3151 )
									ret := 0.049383
					if( trueRange > 345.87 )
						if( smoothedTrueRange <= 165.175 )
							if( dx <= 60.1876 )
								if( diPlus <= 11.3547 )
									ret := 0.230769
								if( diPlus > 11.3547 )
									ret := 0.880000 // buy
							if( dx > 60.1876 )
								if( smoothedDirectionalMovementMinus <= 75.1094 )
									ret := -0.387387
								if( smoothedDirectionalMovementMinus > 75.1094 )
									ret := -0.883721 // sell
						if( smoothedTrueRange > 165.175 )
							if( trueRange <= 411.898 )
								ret := 0.000000
							if( trueRange > 411.898 )
								ret := 0.937500 // buy
				if( smoothedTrueRange > 168.518 )
					if( directionalMovementMinus <= 16.4908 )
						if( smoothedDirectionalMovementPlus <= 6.97108 )
							if( smoothedDirectionalMovementPlus <= 6.37684 )
								if( adx <= 79.7787 )
									ret := 0.168831
								if( adx > 79.7787 )
									ret := 0.972222 // buy
							if( smoothedDirectionalMovementPlus > 6.37684 )
								ret := 1.000000 // buy
						if( smoothedDirectionalMovementPlus > 6.97108 )
							if( adx <= 48.3429 )
								if( dx <= 79.9584 )
									ret := -0.066108
								if( dx > 79.9584 )
									ret := -0.369369
							if( adx > 48.3429 )
								if( directionalMovementPlus <= 8.46841 )
									ret := 0.037931
								if( directionalMovementPlus > 8.46841 )
									ret := 0.215576
					if( directionalMovementMinus > 16.4908 )
						if( smoothedDirectionalMovementPlus <= 58.5603 )
							if( diMinus <= 41.9927 )
								if( dx <= 81.5686 )
									ret := 0.225426
								if( dx > 81.5686 )
									ret := 0.680412
							if( diMinus > 41.9927 )
								if( smoothedDirectionalMovementPlus <= 23.5983 )
									ret := 0.092754
								if( smoothedDirectionalMovementPlus > 23.5983 )
									ret := -0.846154 // sell
						if( smoothedDirectionalMovementPlus > 58.5603 )
							if( dx <= 70.6033 )
								if( trueRange <= 104.215 )
									ret := -0.615385
								if( trueRange > 104.215 )
									ret := 0.710884 // buy
							if( dx > 70.6033 )
								if( directionalMovementMinus <= 43.9496 )
									ret := 0.546667
								if( directionalMovementMinus > 43.9496 )
									ret := 0.042857
			if( directionalMovementPlus > 274.315 )
				if( trueRange <= 1039.17 )
					if( directionalMovementPlus <= 667.503 )
						if( smoothedTrueRange <= 104.268 )
							if( dx <= 90.2264 )
								if( diPlus <= 59.376 )
									ret := -0.048780
								if( diPlus > 59.376 )
									ret := 0.800000 // buy
							if( dx > 90.2264 )
								ret := -1.000000 // sell
						if( smoothedTrueRange > 104.268 )
							if( dx <= 70.2178 )
								if( diPlus <= 49.2084 )
									ret := 0.211180
								if( diPlus > 49.2084 )
									ret := -0.458333
							if( dx > 70.2178 )
								if( trueRange <= 537.886 )
									ret := 0.631868
								if( trueRange > 537.886 )
									ret := -0.024390
					if( directionalMovementPlus > 667.503 )
						if( trueRange <= 810.568 )
							ret := 1.000000 // buy
						if( trueRange > 810.568 )
							ret := 0.818182 // buy
				if( trueRange > 1039.17 )
					ret := -0.833333 // sell
		if( smoothedTrueRange > 230.949 )
			if( smoothedTrueRange <= 504.08 )
				if( diMinus <= 32.4014 )
					if( adx <= 70.503 )
						if( smoothedDirectionalMovementMinus <= 125.236 )
							if( adx <= 28.88 )
								if( smoothedDirectionalMovementPlus <= 90.3185 )
									ret := -0.188034
								if( smoothedDirectionalMovementPlus > 90.3185 )
									ret := 0.362832
							if( adx > 28.88 )
								if( directionalMovementPlus <= 842.498 )
									ret := -0.219856
								if( directionalMovementPlus > 842.498 )
									ret := 0.527778
						if( smoothedDirectionalMovementMinus > 125.236 )
							if( dx <= 62.5618 )
								if( smoothedDirectionalMovementMinus <= 132.195 )
									ret := -0.250000
								if( smoothedDirectionalMovementMinus > 132.195 )
									ret := -0.727273 // sell
							if( dx > 62.5618 )
								if( smoothedDirectionalMovementMinus <= 144.256 )
									ret := -0.985294 // sell
								if( smoothedDirectionalMovementMinus > 144.256 )
									ret := -0.750000 // sell
					if( adx > 70.503 )
						if( smoothedDirectionalMovementMinus <= 12.1276 )
							if( diPlus <= 32.1288 )
								if( diMinus <= 2.86579 )
									ret := 0.733333 // buy
								if( diMinus > 2.86579 )
									ret := 0.461538
							if( diPlus > 32.1288 )
								if( diMinus <= 2.66234 )
									ret := 0.059524
								if( diMinus > 2.66234 )
									ret := -0.569231
						if( smoothedDirectionalMovementMinus > 12.1276 )
							if( smoothedDirectionalMovementPlus <= 18.82 )
								if( diMinus <= 29.71 )
									ret := -0.606061
								if( diMinus > 29.71 )
									ret := 0.266667
							if( smoothedDirectionalMovementPlus > 18.82 )
								if( directionalMovementPlus <= 94.7792 )
									ret := 0.479087
								if( directionalMovementPlus > 94.7792 )
									ret := -0.155844
				if( diMinus > 32.4014 )
					if( directionalMovementPlus <= 0.158776 )
						if( dx <= 77.2302 )
							if( trueRange <= 879.446 )
								if( trueRange <= 647.658 )
									ret := -0.018961
								if( trueRange > 647.658 )
									ret := 0.520710
							if( trueRange > 879.446 )
								if( directionalMovementMinus <= 993.385 )
									ret := -0.857143 // sell
								if( directionalMovementMinus > 993.385 )
									ret := 0.222222
						if( dx > 77.2302 )
							if( smoothedTrueRange <= 324.132 )
								if( directionalMovementMinus <= 535.009 )
									ret := 0.030769
								if( directionalMovementMinus > 535.009 )
									ret := 0.840000 // buy
							if( smoothedTrueRange > 324.132 )
								if( smoothedDirectionalMovementMinus <= 132.744 )
									ret := 0.773585 // buy
								if( smoothedDirectionalMovementMinus > 132.744 )
									ret := 0.239521
					if( directionalMovementPlus > 0.158776 )
						if( adx <= 33.4384 )
							if( directionalMovementPlus <= 16.98 )
								ret := -0.111111
							if( directionalMovementPlus > 16.98 )
								if( smoothedDirectionalMovementPlus <= 35.2328 )
									ret := 0.416667
								if( smoothedDirectionalMovementPlus > 35.2328 )
									ret := 1.000000 // buy
						if( adx > 33.4384 )
							if( diMinus <= 34.7345 )
								if( trueRange <= 211.257 )
									ret := -0.500000
								if( trueRange > 211.257 )
									ret := 0.612903
							if( diMinus > 34.7345 )
								if( smoothedDirectionalMovementMinus <= 86.0761 )
									ret := 0.800000 // buy
								if( smoothedDirectionalMovementMinus > 86.0761 )
									ret := -0.200949
			if( smoothedTrueRange > 504.08 )
				if( adx <= 65.5809 )
					if( directionalMovementMinus <= 0.11045 )
						if( directionalMovementPlus <= 260.528 )
							if( smoothedDirectionalMovementPlus <= 160.173 )
								if( smoothedDirectionalMovementPlus <= 29.9461 )
									ret := 0.795918 // buy
								if( smoothedDirectionalMovementPlus > 29.9461 )
									ret := -0.290476
							if( smoothedDirectionalMovementPlus > 160.173 )
								if( dx <= 79.5762 )
									ret := 0.794521 // buy
								if( dx > 79.5762 )
									ret := -0.400000
						if( directionalMovementPlus > 260.528 )
							if( diMinus <= 7.81205 )
								ret := -0.210526
							if( diMinus > 7.81205 )
								if( smoothedTrueRange <= 611.286 )
									ret := -0.977273 // sell
								if( smoothedTrueRange > 611.286 )
									ret := -0.500000
					if( directionalMovementMinus > 0.11045 )
						if( adx <= 43.1191 )
							if( smoothedDirectionalMovementPlus <= 49.9032 )
								if( diMinus <= 39.6825 )
									ret := -0.157895
								if( diMinus > 39.6825 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 49.9032 )
								if( smoothedDirectionalMovementMinus <= 45.7313 )
									ret := 0.176471
								if( smoothedDirectionalMovementMinus > 45.7313 )
									ret := 0.791209 // buy
						if( adx > 43.1191 )
							if( directionalMovementMinus <= 86.8011 )
								if( diPlus <= 9.36611 )
									ret := 0.346154
								if( diPlus > 9.36611 )
									ret := 1.000000 // buy
							if( directionalMovementMinus > 86.8011 )
								if( diPlus <= 6.67119 )
									ret := 0.484211
								if( diPlus > 6.67119 )
									ret := -0.250000
				if( adx > 65.5809 )
					if( smoothedTrueRange <= 1051.15 )
						if( diPlus <= 6.90987 )
							if( dx <= 76.4196 )
								if( adx <= 71.9592 )
									ret := 0.642857
								if( adx > 71.9592 )
									ret := 0.300000
							if( dx > 76.4196 )
								if( smoothedDirectionalMovementPlus <= 28.4957 )
									ret := 0.833333 // buy
								if( smoothedDirectionalMovementPlus > 28.4957 )
									ret := 1.000000 // buy
						if( diPlus > 6.90987 )
							if( diMinus <= 39.5476 )
								if( adx <= 70.043 )
									ret := 0.869565 // buy
								if( adx > 70.043 )
									ret := 0.391304
							if( diMinus > 39.5476 )
								if( smoothedTrueRange <= 575.432 )
									ret := 0.000000
								if( smoothedTrueRange > 575.432 )
									ret := -0.300000
					if( smoothedTrueRange > 1051.15 )
						if( diPlus <= 5.87934 )
							if( trueRange <= 654.06 )
								ret := -0.833333 // sell
							if( trueRange > 654.06 )
								ret := -0.400000
						if( diPlus > 5.87934 )
							ret := 0.687500
	
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
float op_operation = decision_tree_0_BTCUSDT_15Min_7a9d5455(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


