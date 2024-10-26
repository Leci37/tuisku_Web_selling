//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: AVAXUSDT_30Min_1ADX_479ad222 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_1ADX_479ad222", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_479ad222(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( directionalMovementMinus <= 0.352558 )
		if( smoothedTrueRange <= 0.896377 )
			if( adx <= 57.4642 )
				if( dx <= 78.018 )
					if( dx <= 11.6335 )
						if( smoothedDirectionalMovementMinus <= 0.025927 )
							if( directionalMovementMinus <= 0.058732 )
								if( adx <= 14.9456 )
									ret := 0.224138
								if( adx > 14.9456 )
									ret := 0.014029
							if( directionalMovementMinus > 0.058732 )
								if( directionalMovementPlus <= 7.2e-05 )
									ret := -0.122605
								if( directionalMovementPlus > 7.2e-05 )
									ret := -0.629630
						if( smoothedDirectionalMovementMinus > 0.025927 )
							if( diMinus <= 13.5492 )
								if( diPlus <= 16.2481 )
									ret := -0.317881
								if( diPlus > 16.2481 )
									ret := -0.875000 // sell
							if( diMinus > 13.5492 )
								if( smoothedDirectionalMovementPlus <= 0.191646 )
									ret := -0.051558
								if( smoothedDirectionalMovementPlus > 0.191646 )
									ret := -0.364964
					if( dx > 11.6335 )
						if( adx <= 10.8714 )
							if( adx <= 8.2804 )
								if( smoothedTrueRange <= 0.481793 )
									ret := 0.209302
								if( smoothedTrueRange > 0.481793 )
									ret := 1.000000 // buy
							if( adx > 8.2804 )
								if( smoothedDirectionalMovementMinus <= 0.161039 )
									ret := -0.388889
								if( smoothedDirectionalMovementMinus > 0.161039 )
									ret := 0.742857 // buy
						if( adx > 10.8714 )
							if( smoothedDirectionalMovementMinus <= 0.286025 )
								if( diMinus <= 7.82222 )
									ret := -0.050205
								if( diMinus > 7.82222 )
									ret := 0.023139
							if( smoothedDirectionalMovementMinus > 0.286025 )
								if( adx <= 46.2493 )
									ret := 0.184615
								if( adx > 46.2493 )
									ret := 0.586667
				if( dx > 78.018 )
					if( diPlus <= 55.5198 )
						if( smoothedDirectionalMovementPlus <= 0.267017 )
							if( trueRange <= 0.113668 )
								if( diPlus <= 51.2048 )
									ret := 0.050179
								if( diPlus > 51.2048 )
									ret := -0.619048
							if( trueRange > 0.113668 )
								if( smoothedDirectionalMovementMinus <= 0.004992 )
									ret := 0.412308
								if( smoothedDirectionalMovementMinus > 0.004992 )
									ret := 0.174190
						if( smoothedDirectionalMovementPlus > 0.267017 )
							if( diPlus <= 41.8655 )
								if( diMinus <= 2.45586 )
									ret := -0.652174
								if( diMinus > 2.45586 )
									ret := 0.781250 // buy
							if( diPlus > 41.8655 )
								if( smoothedTrueRange <= 0.826376 )
									ret := -0.915493 // sell
								if( smoothedTrueRange > 0.826376 )
									ret := -0.703704 // sell
					if( diPlus > 55.5198 )
						if( smoothedDirectionalMovementMinus <= 0.00628 )
							ret := -0.100000
						if( smoothedDirectionalMovementMinus > 0.00628 )
							if( diPlus <= 59.3394 )
								if( diMinus <= 4.68664 )
									ret := 0.962963 // buy
								if( diMinus > 4.68664 )
									ret := 0.777778 // buy
							if( diPlus > 59.3394 )
								ret := -0.125000
			if( adx > 57.4642 )
				if( diPlus <= 38.8422 )
					if( adx <= 75.4719 )
						if( diPlus <= 15.3829 )
							if( smoothedDirectionalMovementPlus <= 0.055897 )
								if( diPlus <= 12.0643 )
									ret := -0.130499
								if( diPlus > 12.0643 )
									ret := 0.133721
							if( smoothedDirectionalMovementPlus > 0.055897 )
								if( adx <= 71.6873 )
									ret := -0.482353
								if( adx > 71.6873 )
									ret := 0.170732
						if( diPlus > 15.3829 )
							if( trueRange <= 0.277913 )
								if( smoothedDirectionalMovementPlus <= 0.043097 )
									ret := 0.042604
								if( smoothedDirectionalMovementPlus > 0.043097 )
									ret := -0.179167
							if( trueRange > 0.277913 )
								if( trueRange <= 0.660255 )
									ret := 0.141700
								if( trueRange > 0.660255 )
									ret := -0.205645
					if( adx > 75.4719 )
						if( smoothedDirectionalMovementMinus <= 0.033349 )
							if( smoothedDirectionalMovementPlus <= 0.056036 )
								if( smoothedDirectionalMovementMinus <= 0.018929 )
									ret := 0.051471
								if( smoothedDirectionalMovementMinus > 0.018929 )
									ret := 0.413793
							if( smoothedDirectionalMovementPlus > 0.056036 )
								if( smoothedDirectionalMovementPlus <= 0.098491 )
									ret := -0.503597
								if( smoothedDirectionalMovementPlus > 0.098491 )
									ret := 0.082090
						if( smoothedDirectionalMovementMinus > 0.033349 )
							if( dx <= 83.7618 )
								if( diMinus <= 45.7435 )
									ret := 0.447917
								if( diMinus > 45.7435 )
									ret := -0.064103
							if( dx > 83.7618 )
								if( dx <= 92.2449 )
									ret := -0.336364
								if( dx > 92.2449 )
									ret := 0.250000
				if( diPlus > 38.8422 )
					if( directionalMovementPlus <= 5e-05 )
						if( smoothedTrueRange <= 0.310496 )
							if( diPlus <= 41.9178 )
								if( diPlus <= 39.2056 )
									ret := -0.461538
								if( diPlus > 39.2056 )
									ret := 0.026316
							if( diPlus > 41.9178 )
								if( trueRange <= 0.104005 )
									ret := -0.148148
								if( trueRange > 0.104005 )
									ret := -0.416667
						if( smoothedTrueRange > 0.310496 )
							if( dx <= 68.44 )
								if( trueRange <= 0.35901 )
									ret := 0.000000
								if( trueRange > 0.35901 )
									ret := -0.733333 // sell
							if( dx > 68.44 )
								if( diPlus <= 44.285 )
									ret := -0.014493
								if( diPlus > 44.285 )
									ret := 0.524590
					if( directionalMovementPlus > 5e-05 )
						if( diPlus <= 58.5019 )
							if( directionalMovementPlus <= 0.674814 )
								if( diMinus <= 1.78745 )
									ret := -0.075758
								if( diMinus > 1.78745 )
									ret := -0.405295
							if( directionalMovementPlus > 0.674814 )
								if( smoothedTrueRange <= 0.629962 )
									ret := -0.647059
								if( smoothedTrueRange > 0.629962 )
									ret := -0.833333 // sell
						if( diPlus > 58.5019 )
							if( trueRange <= 0.3115 )
								ret := 0.882353 // buy
							if( trueRange > 0.3115 )
								ret := 0.200000
		if( smoothedTrueRange > 0.896377 )
			if( adx <= 25.2939 )
				if( directionalMovementPlus <= 0.330301 )
					if( dx <= 0.77313 )
						if( diMinus <= 18.8358 )
							ret := 1.000000 // buy
						if( diMinus > 18.8358 )
							ret := 0.133333
					if( dx > 0.77313 )
						if( smoothedTrueRange <= 2.0683 )
							if( trueRange <= 1.95463 )
								if( adx <= 24.8987 )
									ret := -0.109808
								if( adx > 24.8987 )
									ret := 0.250000
							if( trueRange > 1.95463 )
								if( smoothedTrueRange <= 1.66021 )
									ret := -0.400000
								if( smoothedTrueRange > 1.66021 )
									ret := -1.000000 // sell
						if( smoothedTrueRange > 2.0683 )
							if( adx <= 20.2319 )
								if( dx <= 21.5769 )
									ret := 0.760870 // buy
								if( dx > 21.5769 )
									ret := -0.043478
							if( adx > 20.2319 )
								if( diMinus <= 23.1556 )
									ret := -0.254237
								if( diMinus > 23.1556 )
									ret := 0.444444
				if( directionalMovementPlus > 0.330301 )
					if( smoothedTrueRange <= 1.48045 )
						if( adx <= 23.6538 )
							if( smoothedTrueRange <= 0.966036 )
								if( trueRange <= 1.05877 )
									ret := 0.153846
								if( trueRange > 1.05877 )
									ret := -0.450980
							if( smoothedTrueRange > 0.966036 )
								if( smoothedDirectionalMovementPlus <= 0.296677 )
									ret := 0.431250
								if( smoothedDirectionalMovementPlus > 0.296677 )
									ret := -0.020408
						if( adx > 23.6538 )
							if( diPlus <= 19.2566 )
								ret := -0.250000
							if( diPlus > 19.2566 )
								if( diMinus <= 20.9872 )
									ret := 0.745283 // buy
								if( diMinus > 20.9872 )
									ret := 0.125000
					if( smoothedTrueRange > 1.48045 )
						if( dx <= 8.76973 )
							if( diMinus <= 21.6394 )
								if( smoothedDirectionalMovementMinus <= 0.30594 )
									ret := -0.571429
								if( smoothedDirectionalMovementMinus > 0.30594 )
									ret := -0.980000 // sell
							if( diMinus > 21.6394 )
								if( adx <= 22.8478 )
									ret := -0.350000
								if( adx > 22.8478 )
									ret := 0.600000
						if( dx > 8.76973 )
							if( smoothedDirectionalMovementMinus <= 0.54058 )
								if( diPlus <= 33.702 )
									ret := 0.140152
								if( diPlus > 33.702 )
									ret := -0.931818 // sell
							if( smoothedDirectionalMovementMinus > 0.54058 )
								if( smoothedDirectionalMovementPlus <= 0.484096 )
									ret := 0.883721 // buy
								if( smoothedDirectionalMovementPlus > 0.484096 )
									ret := 0.111111
			if( adx > 25.2939 )
				if( diMinus <= 5.06745 )
					if( smoothedDirectionalMovementMinus <= 0.056939 )
						if( directionalMovementPlus <= 0.568846 )
							if( adx <= 75.6013 )
								if( diMinus <= 4.72614 )
									ret := 0.342697
								if( diMinus > 4.72614 )
									ret := -0.290323
							if( adx > 75.6013 )
								if( diPlus <= 44.0841 )
									ret := -0.904762 // sell
								if( diPlus > 44.0841 )
									ret := 0.818182 // buy
						if( directionalMovementPlus > 0.568846 )
							if( smoothedDirectionalMovementPlus <= 0.400145 )
								if( smoothedDirectionalMovementPlus <= 0.328929 )
									ret := 0.636364
								if( smoothedDirectionalMovementPlus > 0.328929 )
									ret := 0.181818
							if( smoothedDirectionalMovementPlus > 0.400145 )
								if( trueRange <= 2.38757 )
									ret := -0.724638 // sell
								if( trueRange > 2.38757 )
									ret := -0.058824
					if( smoothedDirectionalMovementMinus > 0.056939 )
						if( diMinus <= 4.81168 )
							if( smoothedTrueRange <= 1.5117 )
								if( trueRange <= 1.25787 )
									ret := -0.800000 // sell
								if( trueRange > 1.25787 )
									ret := 0.363636
							if( smoothedTrueRange > 1.5117 )
								if( smoothedTrueRange <= 2.45311 )
									ret := 0.611111
								if( smoothedTrueRange > 2.45311 )
									ret := 1.000000 // buy
						if( diMinus > 4.81168 )
							if( smoothedDirectionalMovementPlus <= 0.584945 )
								if( smoothedTrueRange <= 1.19706 )
									ret := 0.888889 // buy
								if( smoothedTrueRange > 1.19706 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 0.584945 )
								if( smoothedDirectionalMovementPlus <= 0.767873 )
									ret := 0.181818
								if( smoothedDirectionalMovementPlus > 0.767873 )
									ret := 1.000000 // buy
				if( diMinus > 5.06745 )
					if( directionalMovementPlus <= 0.213149 )
						if( diPlus <= 6.16223 )
							if( diPlus <= 1.44439 )
								if( dx <= 96.4107 )
									ret := -0.846154 // sell
								if( dx > 96.4107 )
									ret := -0.296296
							if( diPlus > 1.44439 )
								if( diMinus <= 53.0436 )
									ret := -0.202109
								if( diMinus > 53.0436 )
									ret := 0.733333 // buy
						if( diPlus > 6.16223 )
							if( trueRange <= 2.98937 )
								if( dx <= 71.8269 )
									ret := -0.019756
								if( dx > 71.8269 )
									ret := -0.567308
							if( trueRange > 2.98937 )
								ret := 0.857143 // buy
					if( directionalMovementPlus > 0.213149 )
						if( adx <= 76.3647 )
							if( dx <= 6.1584 )
								if( smoothedDirectionalMovementMinus <= 0.486771 )
									ret := 0.098712
								if( smoothedDirectionalMovementMinus > 0.486771 )
									ret := -0.781250 // sell
							if( dx > 6.1584 )
								if( smoothedTrueRange <= 1.51821 )
									ret := -0.294728
								if( smoothedTrueRange > 1.51821 )
									ret := -0.174339
						if( adx > 76.3647 )
							if( diMinus <= 36.6967 )
								if( diMinus <= 22.0887 )
									ret := 0.230769
								if( diMinus > 22.0887 )
									ret := 0.800000 // buy
							if( diMinus > 36.6967 )
								if( diPlus <= 7.40335 )
									ret := 0.166667
								if( diPlus > 7.40335 )
									ret := -0.900000 // sell
	if( directionalMovementMinus > 0.352558 )
		if( smoothedDirectionalMovementMinus <= 0.397708 )
			if( diPlus <= 31.5408 )
				if( diMinus <= 35.3905 )
					if( directionalMovementPlus <= 0.005222 )
						if( dx <= 5.80438 )
							if( adx <= 26.3671 )
								if( dx <= 3.1515 )
									ret := -0.610294
								if( dx > 3.1515 )
									ret := -0.151163
							if( adx > 26.3671 )
								if( directionalMovementMinus <= 0.403545 )
									ret := 0.535714
								if( directionalMovementMinus > 0.403545 )
									ret := -0.102362
						if( dx > 5.80438 )
							if( smoothedDirectionalMovementPlus <= 0.103753 )
								if( diMinus <= 28.5533 )
									ret := 0.235905
								if( diMinus > 28.5533 )
									ret := 0.042476
							if( smoothedDirectionalMovementPlus > 0.103753 )
								if( diMinus <= 13.997 )
									ret := 0.174877
								if( diMinus > 13.997 )
									ret := -0.011510
					if( directionalMovementPlus > 0.005222 )
						if( adx <= 12.0568 )
							ret := -1.000000 // sell
						if( adx > 12.0568 )
							if( dx <= 3.84314 )
								if( dx <= 2.26879 )
									ret := -0.357143
								if( dx > 2.26879 )
									ret := 0.750000 // buy
							if( dx > 3.84314 )
								if( smoothedTrueRange <= 0.39157 )
									ret := -0.833333 // sell
								if( smoothedTrueRange > 0.39157 )
									ret := -0.138614
				if( diMinus > 35.3905 )
					if( smoothedDirectionalMovementPlus <= 0.020406 )
						if( smoothedDirectionalMovementPlus <= 0.015663 )
							if( smoothedTrueRange <= 0.462576 )
								if( diPlus <= 2.3111 )
									ret := 0.478261
								if( diPlus > 2.3111 )
									ret := -0.220588
							if( smoothedTrueRange > 0.462576 )
								if( trueRange <= 0.67877 )
									ret := 0.000000
								if( trueRange > 0.67877 )
									ret := 0.583333
						if( smoothedDirectionalMovementPlus > 0.015663 )
							if( dx <= 72.7232 )
								if( diPlus <= 9.21648 )
									ret := 0.083333
								if( diPlus > 9.21648 )
									ret := 0.733333 // buy
							if( dx > 72.7232 )
								if( dx <= 77 )
									ret := -1.000000 // sell
								if( dx > 77 )
									ret := -0.318182
					if( smoothedDirectionalMovementPlus > 0.020406 )
						if( adx <= 16.0062 )
							if( trueRange <= 1.14814 )
								ret := -1.000000 // sell
							if( trueRange > 1.14814 )
								ret := -0.700000 // sell
						if( adx > 16.0062 )
							if( directionalMovementMinus <= 0.401151 )
								if( directionalMovementMinus <= 0.377601 )
									ret := 0.450000
								if( directionalMovementMinus > 0.377601 )
									ret := -0.186813
							if( directionalMovementMinus > 0.401151 )
								if( smoothedDirectionalMovementMinus <= 0.182862 )
									ret := 0.148325
								if( smoothedDirectionalMovementMinus > 0.182862 )
									ret := 0.376258
			if( diPlus > 31.5408 )
				if( diMinus <= 8.59834 )
					if( adx <= 37.6959 )
						if( smoothedDirectionalMovementMinus <= 0.093881 )
							ret := -0.666667
						if( smoothedDirectionalMovementMinus > 0.093881 )
							ret := -0.916667 // sell
					if( adx > 37.6959 )
						if( smoothedTrueRange <= 0.660987 )
							ret := -1.000000 // sell
						if( smoothedTrueRange > 0.660987 )
							if( diPlus <= 44.0067 )
								if( trueRange <= 1.88413 )
									ret := 0.189655
								if( trueRange > 1.88413 )
									ret := 0.857143 // buy
							if( diPlus > 44.0067 )
								ret := -0.631579
				if( diMinus > 8.59834 )
					if( adx <= 39.2209 )
						if( directionalMovementMinus <= 0.489527 )
							if( dx <= 33.2864 )
								ret := -0.526316
							if( dx > 33.2864 )
								if( trueRange <= 1.345 )
									ret := 0.636364
								if( trueRange > 1.345 )
									ret := -0.200000
						if( directionalMovementMinus > 0.489527 )
							if( smoothedDirectionalMovementMinus <= 0.303021 )
								if( directionalMovementMinus <= 0.713407 )
									ret := 0.738462 // buy
								if( directionalMovementMinus > 0.713407 )
									ret := 0.925373 // buy
							if( smoothedDirectionalMovementMinus > 0.303021 )
								ret := -0.692308
					if( adx > 39.2209 )
						if( diMinus <= 9.27165 )
							if( diMinus <= 9.06152 )
								if( dx <= 59.1782 )
									ret := 0.833333 // buy
								if( dx > 59.1782 )
									ret := 0.333333
							if( diMinus > 9.06152 )
								ret := 1.000000 // buy
						if( diMinus > 9.27165 )
							if( adx <= 46.8571 )
								if( smoothedDirectionalMovementPlus <= 0.209845 )
									ret := 0.583333
								if( smoothedDirectionalMovementPlus > 0.209845 )
									ret := -0.576923
							if( adx > 46.8571 )
								if( directionalMovementPlus <= 3.3e-05 )
									ret := 0.189349
								if( directionalMovementPlus > 3.3e-05 )
									ret := 0.600000
		if( smoothedDirectionalMovementMinus > 0.397708 )
			if( diMinus <= 46.4246 )
				if( trueRange <= 1.75133 )
					if( smoothedTrueRange <= 1.30416 )
						if( trueRange <= 1.19837 )
							if( adx <= 29.6486 )
								ret := -1.000000 // sell
							if( adx > 29.6486 )
								if( trueRange <= 0.952607 )
									ret := 0.657143
								if( trueRange > 0.952607 )
									ret := 0.145833
						if( trueRange > 1.19837 )
							if( smoothedDirectionalMovementPlus <= 0.106738 )
								if( dx <= 66.5635 )
									ret := -0.111111
								if( dx > 66.5635 )
									ret := 0.597015
							if( smoothedDirectionalMovementPlus > 0.106738 )
								if( smoothedDirectionalMovementMinus <= 0.41181 )
									ret := 0.222222
								if( smoothedDirectionalMovementMinus > 0.41181 )
									ret := 0.896552 // buy
					if( smoothedTrueRange > 1.30416 )
						if( diMinus <= 28.6178 )
							if( smoothedDirectionalMovementMinus <= 0.457924 )
								if( trueRange <= 1.46673 )
									ret := 0.562500
								if( trueRange > 1.46673 )
									ret := -0.333333
							if( smoothedDirectionalMovementMinus > 0.457924 )
								if( directionalMovementPlus <= 0.010906 )
									ret := 0.637681
								if( directionalMovementPlus > 0.010906 )
									ret := -0.400000
						if( diMinus > 28.6178 )
							if( diPlus <= 6.8702 )
								if( trueRange <= 1.35379 )
									ret := -0.269231
								if( trueRange > 1.35379 )
									ret := 0.457143
							if( diPlus > 6.8702 )
								if( diPlus <= 7.34481 )
									ret := -1.000000 // sell
								if( diPlus > 7.34481 )
									ret := -0.251232
				if( trueRange > 1.75133 )
					if( dx <= 17.2424 )
						if( adx <= 29.955 )
							if( smoothedTrueRange <= 1.82726 )
								ret := 0.350000
							if( smoothedTrueRange > 1.82726 )
								if( smoothedDirectionalMovementPlus <= 0.541071 )
									ret := 0.884615 // buy
								if( smoothedDirectionalMovementPlus > 0.541071 )
									ret := 0.653846
						if( adx > 29.955 )
							if( smoothedTrueRange <= 2.5327 )
								ret := -0.055556
							if( smoothedTrueRange > 2.5327 )
								ret := 0.769231 // buy
					if( dx > 17.2424 )
						if( dx <= 41.2479 )
							if( smoothedDirectionalMovementMinus <= 0.442766 )
								if( diPlus <= 19.3824 )
									ret := 0.684211
								if( diPlus > 19.3824 )
									ret := -0.200000
							if( smoothedDirectionalMovementMinus > 0.442766 )
								if( directionalMovementMinus <= 1.54393 )
									ret := -0.588235
								if( directionalMovementMinus > 1.54393 )
									ret := 0.045455
						if( dx > 41.2479 )
							if( smoothedDirectionalMovementMinus <= 0.453742 )
								if( diMinus <= 39.8017 )
									ret := 0.200000
								if( diMinus > 39.8017 )
									ret := -0.647059
							if( smoothedDirectionalMovementMinus > 0.453742 )
								if( directionalMovementMinus <= 2.11636 )
									ret := 0.617318
								if( directionalMovementMinus > 2.11636 )
									ret := 0.212766
			if( diMinus > 46.4246 )
				if( smoothedTrueRange <= 1.06893 )
					if( directionalMovementMinus <= 0.549303 )
						ret := -0.222222
					if( directionalMovementMinus > 0.549303 )
						if( trueRange <= 2.27385 )
							ret := 1.000000 // buy
						if( trueRange > 2.27385 )
							if( trueRange <= 3.62412 )
								ret := -0.625000
							if( trueRange > 3.62412 )
								ret := 0.650000
				if( smoothedTrueRange > 1.06893 )
					if( smoothedDirectionalMovementMinus <= 0.715869 )
						if( trueRange <= 1.25103 )
							ret := 0.363636
						if( trueRange > 1.25103 )
							if( smoothedDirectionalMovementMinus <= 0.627504 )
								ret := 1.000000 // buy
							if( smoothedDirectionalMovementMinus > 0.627504 )
								ret := 0.777778 // buy
					if( smoothedDirectionalMovementMinus > 0.715869 )
						if( directionalMovementMinus <= 4.52551 )
							ret := 1.000000 // buy
						if( directionalMovementMinus > 4.52551 )
							ret := 0.900000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_479ad222(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


