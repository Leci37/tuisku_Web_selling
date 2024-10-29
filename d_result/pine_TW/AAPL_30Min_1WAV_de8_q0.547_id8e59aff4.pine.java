//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AAPL_30Min_1WAV_8e59aff4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_1WAV_8e59aff4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_8e59aff4(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( esa <= 145.967 )
		if( ci <= -66.8199 )
			if( wt2 <= -27.056 )
				if( ap <= 135.987 )
					if( esa <= 113.205 )
						if( d_tci <= 69.2815 )
							if( ci <= -70.9698 )
								if( ci <= -80.1807 )
									ret := 0.182990
								if( ci > -80.1807 )
									ret := -0.184397
							if( ci > -70.9698 )
								if( tci <= -62.4815 )
									ret := -0.470588
								if( tci > -62.4815 )
									ret := 0.612500
						if( d_tci > 69.2815 )
							if( ap <= 111.572 )
								if( ap <= 99.2398 )
									ret := 0.217391
								if( ap > 99.2398 )
									ret := 0.734694 // buy
							if( ap > 111.572 )
								ret := -0.750000 // sell
					if( esa > 113.205 )
						if( esa <= 121.558 )
							if( d <= 1.31744 )
								if( wt2 <= -35.2971 )
									ret := 0.565217
								if( wt2 > -35.2971 )
									ret := 0.263158
							if( d > 1.31744 )
								if( wt2 <= -30.2439 )
									ret := 1.000000 // buy
								if( wt2 > -30.2439 )
									ret := 0.750000 // buy
						if( esa > 121.558 )
							if( ci <= -185.384 )
								if( esa <= 130.354 )
									ret := -0.500000
								if( esa > 130.354 )
									ret := -1.000000 // sell
							if( ci > -185.384 )
								if( esa <= 132.679 )
									ret := 0.143820
								if( esa > 132.679 )
									ret := 0.474286
				if( ap > 135.987 )
					if( d <= 0.822937 )
						if( ci_wt2 <= -42.5197 )
							if( wt2 <= -27.6132 )
								if( ci <= -135.293 )
									ret := -0.409091
								if( ci > -135.293 )
									ret := 0.089888
							if( wt2 > -27.6132 )
								if( d_tci <= 35.747 )
									ret := 0.500000
								if( d_tci > 35.747 )
									ret := 1.000000 // buy
						if( ci_wt2 > -42.5197 )
							if( ap <= 144.836 )
								if( ap <= 137.413 )
									ret := 0.000000
								if( ap > 137.413 )
									ret := 0.680272
							if( ap > 144.836 )
								if( d <= 0.323551 )
									ret := 0.000000
								if( d > 0.323551 )
									ret := -0.750000 // sell
					if( d > 0.822937 )
						if( wt2 <= -35.1155 )
							if( tci <= -51.2832 )
								if( ci <= -126.287 )
									ret := -0.937500 // sell
								if( ci > -126.287 )
									ret := -0.155172
							if( tci > -51.2832 )
								if( tci <= -43.4225 )
									ret := -1.000000 // sell
								if( tci > -43.4225 )
									ret := -0.750000 // sell
						if( wt2 > -35.1155 )
							if( ci <= -86.8428 )
								ret := 0.250000
							if( ci > -86.8428 )
								ret := 1.000000 // buy
			if( wt2 > -27.056 )
				if( ci <= -186.115 )
					if( esa <= 144.393 )
						if( ci_wt2 <= -248.732 )
							if( ci_wt2 <= -291.26 )
								ret := -1.000000 // sell
							if( ci_wt2 > -291.26 )
								if( ap <= 98.6874 )
									ret := -0.750000 // sell
								if( ap > 98.6874 )
									ret := 0.550000
						if( ci_wt2 > -248.732 )
							if( ci <= -208.306 )
								if( ci_wt2 <= -228.811 )
									ret := -0.769231 // sell
								if( ci_wt2 > -228.811 )
									ret := 0.133333
							if( ci > -208.306 )
								if( d <= 0.220431 )
									ret := -0.333333
								if( d > 0.220431 )
									ret := -0.870968 // sell
					if( esa > 144.393 )
						ret := 1.000000 // buy
				if( ci > -186.115 )
					if( wt2 <= 15.8199 )
						if( ci <= -177.308 )
							if( ci <= -184.047 )
								if( ci_wt2 <= -170.971 )
									ret := 1.000000 // buy
								if( ci_wt2 > -170.971 )
									ret := 0.750000 // buy
							if( ci > -184.047 )
								if( ci <= -178.657 )
									ret := 0.238095
								if( ci > -178.657 )
									ret := 1.000000 // buy
						if( ci > -177.308 )
							if( wt2 <= 7.67429 )
								if( d_tci <= 37.4293 )
									ret := 0.087940
								if( d_tci > 37.4293 )
									ret := -0.259740
							if( wt2 > 7.67429 )
								if( d <= 1.39328 )
									ret := -0.177258
								if( d > 1.39328 )
									ret := 1.000000 // buy
					if( wt2 > 15.8199 )
						if( d <= 0.480689 )
							if( d_tci <= -33.0287 )
								if( ci_wt2 <= -127.757 )
									ret := -0.500000
								if( ci_wt2 > -127.757 )
									ret := 0.444444
							if( d_tci > -33.0287 )
								if( ci_wt2 <= -208.21 )
									ret := 0.909091 // buy
								if( ci_wt2 > -208.21 )
									ret := 0.217469
						if( d > 0.480689 )
							if( ci <= -131.68 )
								if( wt2 <= 19.7645 )
									ret := -1.000000 // sell
								if( wt2 > 19.7645 )
									ret := 0.045455
							if( ci > -131.68 )
								if( ci <= -117.503 )
									ret := 0.967742 // buy
								if( ci > -117.503 )
									ret := 0.442857
		if( ci > -66.8199 )
			if( esa <= 130.53 )
				if( d_tci <= -44.5814 )
					if( d <= 0.656116 )
						if( wt2 <= 51.0881 )
							if( ci <= 56.0965 )
								if( ci <= 29.8376 )
									ret := -0.180000
								if( ci > 29.8376 )
									ret := 0.584270
							if( ci > 56.0965 )
								if( esa <= 126.143 )
									ret := 0.194215
								if( esa > 126.143 )
									ret := -0.350000
						if( wt2 > 51.0881 )
							if( ap <= 97.9152 )
								if( ci_wt2 <= -92.2935 )
									ret := 0.714286 // buy
								if( ci_wt2 > -92.2935 )
									ret := -0.231481
							if( ap > 97.9152 )
								if( ci <= 41.6183 )
									ret := 0.196305
								if( ci > 41.6183 )
									ret := -0.035573
					if( d > 0.656116 )
						if( ci_wt2 <= 84.4021 )
							if( d_tci <= -62.9052 )
								if( ap <= 125.314 )
									ret := 0.274510
								if( ap > 125.314 )
									ret := -0.315789
							if( d_tci > -62.9052 )
								if( esa <= 124.012 )
									ret := 0.337963
								if( esa > 124.012 )
									ret := 0.708791 // buy
						if( ci_wt2 > 84.4021 )
							if( d <= 0.793706 )
								ret := -0.666667
							if( d > 0.793706 )
								ret := -1.000000 // sell
				if( d_tci > -44.5814 )
					if( ap <= 114.427 )
						if( ap <= 93.9543 )
							if( tci <= -3.36908 )
								if( ci_wt2 <= 71.2708 )
									ret := 0.542105
								if( ci_wt2 > 71.2708 )
									ret := -0.250000
							if( tci > -3.36908 )
								if( esa <= 93.6865 )
									ret := -0.097561
								if( esa > 93.6865 )
									ret := 0.451613
						if( ap > 93.9543 )
							if( ci_wt2 <= 213.008 )
								if( ci <= -45.8204 )
									ret := -0.050314
								if( ci > -45.8204 )
									ret := 0.071965
							if( ci_wt2 > 213.008 )
								if( wt2 <= -26.0072 )
									ret := 0.166667
								if( wt2 > -26.0072 )
									ret := -0.875000 // sell
					if( ap > 114.427 )
						if( tci <= -62.0224 )
							if( ci <= -38.482 )
								if( d_tci <= 77.0665 )
									ret := -0.691057
								if( d_tci > 77.0665 )
									ret := 0.250000
							if( ci > -38.482 )
								if( ci <= -24.6691 )
									ret := 0.250000
								if( ci > -24.6691 )
									ret := 0.888889 // buy
						if( tci > -62.0224 )
							if( d_tci <= 38.318 )
								if( esa <= 121.939 )
									ret := -0.123225
								if( esa > 121.939 )
									ret := 0.010326
							if( d_tci > 38.318 )
								if( d <= 0.451655 )
									ret := 0.334225
								if( d > 0.451655 )
									ret := 0.003205
			if( esa > 130.53 )
				if( ci_wt2 <= 82.7703 )
					if( ci <= 96.095 )
						if( ci <= 86.2616 )
							if( d_tci <= 63.6448 )
								if( esa <= 143.488 )
									ret := 0.112542
								if( esa > 143.488 )
									ret := 0.009299
							if( d_tci > 63.6448 )
								if( ap <= 143.023 )
									ret := 0.626087
								if( ap > 143.023 )
									ret := -0.555556
						if( ci > 86.2616 )
							if( tci <= 23.7652 )
								if( tci <= 16.4266 )
									ret := 1.000000 // buy
								if( tci > 16.4266 )
									ret := -0.642857
							if( tci > 23.7652 )
								if( wt2 <= 52.802 )
									ret := 0.588235
								if( wt2 > 52.802 )
									ret := 0.195122
					if( ci > 96.095 )
						if( tci <= 55.0379 )
							if( esa <= 138.554 )
								if( tci <= 36.6386 )
									ret := 0.142857
								if( tci > 36.6386 )
									ret := -0.692308
							if( esa > 138.554 )
								if( tci <= 29.824 )
									ret := -0.857143 // sell
								if( tci > 29.824 )
									ret := 0.068966
						if( tci > 55.0379 )
							if( ci <= 114.996 )
								if( wt2 <= 48.9001 )
									ret := 0.928571 // buy
								if( wt2 > 48.9001 )
									ret := 0.144928
							if( ci > 114.996 )
								if( ci <= 119.814 )
									ret := -0.684211
								if( ci > 119.814 )
									ret := -0.135135
				if( ci_wt2 > 82.7703 )
					if( ci_wt2 <= 94.2671 )
						if( d_tci <= -41.9096 )
							if( ci_wt2 <= 91.451 )
								if( d <= 0.601772 )
									ret := 0.000000
								if( d > 0.601772 )
									ret := -0.750000 // sell
							if( ci_wt2 > 91.451 )
								ret := 0.500000
						if( d_tci > -41.9096 )
							if( d <= 0.321745 )
								if( ci_wt2 <= 88.3598 )
									ret := 0.060000
								if( ci_wt2 > 88.3598 )
									ret := 0.508772
							if( d > 0.321745 )
								if( wt2 <= -35.4913 )
									ret := 0.045455
								if( wt2 > -35.4913 )
									ret := 0.706897 // buy
					if( ci_wt2 > 94.2671 )
						if( d_tci <= -26.9841 )
							if( wt2 <= 40.6884 )
								if( ci_wt2 <= 105.324 )
									ret := 0.065217
								if( ci_wt2 > 105.324 )
									ret := 0.666667
							if( wt2 > 40.6884 )
								if( ci_wt2 <= 155.074 )
									ret := 0.480000
								if( ci_wt2 > 155.074 )
									ret := -1.000000 // sell
						if( d_tci > -26.9841 )
							if( ci <= 81.8837 )
								if( d_tci <= 41.5071 )
									ret := 0.401408
								if( d_tci > 41.5071 )
									ret := -0.466667
							if( ci > 81.8837 )
								if( ci <= 115.679 )
									ret := -0.167331
								if( ci > 115.679 )
									ret := 0.177358
	if( esa > 145.967 )
		if( ap <= 233.535 )
			if( wt2 <= -46.2 )
				if( wt2 <= -57.569 )
					if( esa <= 217.977 )
						if( d_tci <= 116.581 )
							if( ap <= 147.311 )
								if( ap <= 145.332 )
									ret := 0.384615
								if( ap > 145.332 )
									ret := -0.414286
							if( ap > 147.311 )
								if( ci_wt2 <= 117.956 )
									ret := 0.078374
								if( ci_wt2 > 117.956 )
									ret := -0.560000
						if( d_tci > 116.581 )
							ret := 1.000000 // buy
					if( esa > 217.977 )
						if( esa <= 225.307 )
							if( tci <= -71.807 )
								if( ci <= -69.6748 )
									ret := -0.294118
								if( ci > -69.6748 )
									ret := 1.000000 // buy
							if( tci > -71.807 )
								if( tci <= -63.5085 )
									ret := -0.728395 // sell
								if( tci > -63.5085 )
									ret := -0.230769
						if( esa > 225.307 )
							if( ci <= -76.08 )
								if( d_tci <= 70.0406 )
									ret := 0.750000 // buy
								if( d_tci > 70.0406 )
									ret := -0.750000 // sell
							if( ci > -76.08 )
								if( d <= 7.49939 )
									ret := 0.620690
								if( d > 7.49939 )
									ret := -0.250000
				if( wt2 > -57.569 )
					if( ci_wt2 <= -44.324 )
						if( d_tci <= 54.6413 )
							if( d_tci <= 53.8965 )
								if( tci <= -53.2284 )
									ret := 1.000000 // buy
								if( tci > -53.2284 )
									ret := -0.409091
							if( d_tci > 53.8965 )
								if( esa <= 179.309 )
									ret := -0.812500 // sell
								if( esa > 179.309 )
									ret := -0.333333
						if( d_tci > 54.6413 )
							if( ci <= -105.518 )
								if( esa <= 153.13 )
									ret := 0.444444
								if( esa > 153.13 )
									ret := -0.089431
							if( ci > -105.518 )
								if( esa <= 185.742 )
									ret := 0.644737
								if( esa > 185.742 )
									ret := -0.157895
					if( ci_wt2 > -44.324 )
						if( esa <= 202.308 )
							if( ap <= 157.874 )
								if( wt2 <= -52.4004 )
									ret := -0.437107
								if( wt2 > -52.4004 )
									ret := -0.150794
							if( ap > 157.874 )
								if( esa <= 160.014 )
									ret := 0.440476
								if( esa > 160.014 )
									ret := -0.170802
						if( esa > 202.308 )
							if( esa <= 219.995 )
								if( d <= 1.32812 )
									ret := 0.193069
								if( d > 1.32812 )
									ret := 0.717391 // buy
							if( esa > 219.995 )
								if( wt2 <= -54.577 )
									ret := 0.235294
								if( wt2 > -54.577 )
									ret := -0.510000
			if( wt2 > -46.2 )
				if( d <= 1.16892 )
					if( d_tci <= -77.6984 )
						if( esa <= 164.491 )
							if( esa <= 158.68 )
								if( tci <= 86.8095 )
									ret := 0.382353
								if( tci > 86.8095 )
									ret := 1.000000 // buy
							if( esa > 158.68 )
								if( ap <= 161.328 )
									ret := 1.000000 // buy
								if( ap > 161.328 )
									ret := 0.722222 // buy
						if( esa > 164.491 )
							if( ci_wt2 <= 72.9429 )
								if( ci <= 117.043 )
									ret := 0.055556
								if( ci > 117.043 )
									ret := -0.500000
							if( ci_wt2 > 72.9429 )
								if( ap <= 180.451 )
									ret := 0.750000 // buy
								if( ap > 180.451 )
									ret := 1.000000 // buy
					if( d_tci > -77.6984 )
						if( ci <= 236.744 )
							if( tci <= 22.4852 )
								if( ci <= -205.73 )
									ret := 0.368056
								if( ci > -205.73 )
									ret := 0.048689
							if( tci > 22.4852 )
								if( ci_wt2 <= 212.599 )
									ret := 0.001886
								if( ci_wt2 > 212.599 )
									ret := -0.888889 // sell
						if( ci > 236.744 )
							if( esa <= 193.599 )
								if( d <= 0.361065 )
									ret := 0.666667
								if( d > 0.361065 )
									ret := 0.967742 // buy
							if( esa > 193.599 )
								if( tci <= 44.3373 )
									ret := 0.166667
								if( tci > 44.3373 )
									ret := 0.800000 // buy
				if( d > 1.16892 )
					if( tci <= -33.977 )
						if( ci_wt2 <= -78.0042 )
							if( esa <= 231.757 )
								if( ap <= 163.01 )
									ret := -0.200000
								if( ap > 163.01 )
									ret := 0.500000
							if( esa > 231.757 )
								if( tci <= -57.6538 )
									ret := -0.750000 // sell
								if( tci > -57.6538 )
									ret := -1.000000 // sell
						if( ci_wt2 > -78.0042 )
							if( ap <= 215.512 )
								if( d <= 1.35953 )
									ret := 0.000000
								if( d > 1.35953 )
									ret := -0.738095 // sell
							if( ap > 215.512 )
								if( tci <= -47.7168 )
									ret := -0.857143 // sell
								if( tci > -47.7168 )
									ret := 0.044444
					if( tci > -33.977 )
						if( ci_wt2 <= -25.7203 )
							if( esa <= 172.227 )
								if( tci <= -20.3228 )
									ret := 0.555556
								if( tci > -20.3228 )
									ret := -0.304348
							if( esa > 172.227 )
								if( ci <= -154.724 )
									ret := -0.300000
								if( ci > -154.724 )
									ret := 0.463035
						if( ci_wt2 > -25.7203 )
							if( ci_wt2 <= -16.8201 )
								if( wt2 <= 53.1494 )
									ret := -0.804348 // sell
								if( wt2 > 53.1494 )
									ret := -0.350000
							if( ci_wt2 > -16.8201 )
								if( ci_wt2 <= -14.0563 )
									ret := 0.500000
								if( ci_wt2 > -14.0563 )
									ret := -0.071795
		if( ap > 233.535 )
			if( wt2 <= -70.8172 )
				if( ci_wt2 <= 16.5492 )
					if( esa <= 306.424 )
						if( wt2 <= -73.9565 )
							ret := 1.000000 // buy
						if( wt2 > -73.9565 )
							ret := 0.400000
					if( esa > 306.424 )
						ret := -0.166667
				if( ci_wt2 > 16.5492 )
					if( esa <= 268.821 )
						ret := 0.000000
					if( esa > 268.821 )
						if( ci_wt2 <= 26.5608 )
							if( esa <= 273.627 )
								ret := -1.000000 // sell
							if( esa > 273.627 )
								ret := 0.000000
						if( ci_wt2 > 26.5608 )
							ret := -1.000000 // sell
			if( wt2 > -70.8172 )
				if( ci_wt2 <= -39.59 )
					if( d <= 1.67848 )
						if( tci <= -64.0721 )
							if( ap <= 314.886 )
								if( tci <= -70.5166 )
									ret := 0.500000
								if( tci > -70.5166 )
									ret := 1.000000 // buy
							if( ap > 314.886 )
								ret := 0.250000
						if( tci > -64.0721 )
							if( ci_wt2 <= -170.33 )
								if( ci <= -175.419 )
									ret := -0.281250
								if( ci > -175.419 )
									ret := 0.603175
							if( ci_wt2 > -170.33 )
								if( wt2 <= 3.06307 )
									ret := 0.045144
								if( wt2 > 3.06307 )
									ret := -0.104356
					if( d > 1.67848 )
						if( d_tci <= 41.4483 )
							if( d_tci <= -55.6601 )
								if( d <= 2.29418 )
									ret := 0.000000
								if( d > 2.29418 )
									ret := -0.769231 // sell
							if( d_tci > -55.6601 )
								if( ap <= 245.945 )
									ret := 0.892857 // buy
								if( ap > 245.945 )
									ret := 0.215278
						if( d_tci > 41.4483 )
							if( ap <= 255.23 )
								if( wt2 <= -47.9318 )
									ret := 0.250000
								if( wt2 > -47.9318 )
									ret := -0.961538 // sell
							if( ap > 255.23 )
								if( ap <= 270.905 )
									ret := 0.708333 // buy
								if( ap > 270.905 )
									ret := -0.084507
				if( ci_wt2 > -39.59 )
					if( ci <= -30.8074 )
						if( tci <= -46.7398 )
							if( ci <= -74.5058 )
								if( esa <= 314.678 )
									ret := 0.170455
								if( esa > 314.678 )
									ret := -0.666667
							if( ci > -74.5058 )
								if( tci <= -61.9833 )
									ret := 0.573171
								if( tci > -61.9833 )
									ret := 0.180000
						if( tci > -46.7398 )
							if( wt2 <= -7.21714 )
								if( ci <= -64.2458 )
									ret := 0.085714
								if( ci > -64.2458 )
									ret := 0.525751
							if( wt2 > -7.21714 )
								if( ci_wt2 <= -37.2971 )
									ret := 0.350000
								if( ci_wt2 > -37.2971 )
									ret := -0.214286
					if( ci > -30.8074 )
						if( ci <= -4.66708 )
							if( d <= 1.57409 )
								if( ap <= 266.279 )
									ret := 0.264957
								if( ap > 266.279 )
									ret := -0.152047
							if( d > 1.57409 )
								if( tci <= -59.9353 )
									ret := 0.538462
								if( tci > -59.9353 )
									ret := -0.525547
						if( ci > -4.66708 )
							if( ap <= 500.577 )
								if( wt2 <= -4.23099 )
									ret := 0.022181
								if( wt2 > -4.23099 )
									ret := 0.163772
							if( ap > 500.577 )
								if( d_tci <= -65.6621 )
									ret := 0.666667
								if( d_tci > -65.6621 )
									ret := -0.521127
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_AAPL_30Min_8e59aff4(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


