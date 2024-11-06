//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: LTCUSDT_30Min_1BOL_30c610e4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1BOL_30c610e4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_30c610e4(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 39.4426 )
		if( dif_source_BBupper <= -10.5675 )
			if( BBlower <= 38.7886 )
				if( vrsi <= 36.7862 )
					ret := -0.500000
				if( vrsi > 36.7862 )
					ret := -1.000000 // sell
			if( BBlower > 38.7886 )
				if( dif_source_BBlower <= 6.78302 )
					if( dif_source_BBlower <= -6.56692 )
						if( vrsi <= 17.8883 )
							if( dif_source_BBupper <= -60.1083 )
								if( dif_source_BBlower <= -18.6226 )
									ret := 0.600000
								if( dif_source_BBlower > -18.6226 )
									ret := 0.976190 // buy
							if( dif_source_BBupper > -60.1083 )
								if( BBupper <= 229.782 )
									ret := 0.670000
								if( BBupper > 229.782 )
									ret := -0.272727
						if( vrsi > 17.8883 )
							if( BBlower <= 144.499 )
								if( vrsi <= 19.5824 )
									ret := 0.000000
								if( vrsi > 19.5824 )
									ret := 0.744186 // buy
							if( BBlower > 144.499 )
								if( dif_source_BBlower <= -10.6651 )
									ret := 0.261905
								if( dif_source_BBlower > -10.6651 )
									ret := -0.115385
					if( dif_source_BBlower > -6.56692 )
						if( BBlower <= 288.747 )
							if( dif_source_BBlower <= -2.11273 )
								if( BBlower <= 57.5961 )
									ret := 0.727273 // buy
								if( BBlower > 57.5961 )
									ret := -0.043260
							if( dif_source_BBlower > -2.11273 )
								if( dif_source_BBupper <= -23.5331 )
									ret := 0.324357
								if( dif_source_BBupper > -23.5331 )
									ret := 0.126238
						if( BBlower > 288.747 )
							if( BBupper <= 412.821 )
								if( vrsi <= 30.7978 )
									ret := -1.000000 // sell
								if( vrsi > 30.7978 )
									ret := -0.583333
							if( BBupper > 412.821 )
								ret := 0.500000
				if( dif_source_BBlower > 6.78302 )
					if( BBupper <= 203.105 )
						if( dif_source_BBlower <= 21.8164 )
							if( BBlower <= 135.159 )
								if( BBlower <= 69.2498 )
									ret := 0.450495
								if( BBlower > 69.2498 )
									ret := 0.025263
							if( BBlower > 135.159 )
								if( BBlower <= 167.734 )
									ret := 0.492441
								if( BBlower > 167.734 )
									ret := 0.246575
						if( dif_source_BBlower > 21.8164 )
							if( BBupper <= 123.092 )
								if( BBupper <= 122.52 )
									ret := 0.375000
								if( BBupper > 122.52 )
									ret := -0.777778 // sell
							if( BBupper > 123.092 )
								if( dif_source_BBupper <= -14.0115 )
									ret := 0.820359 // buy
								if( dif_source_BBupper > -14.0115 )
									ret := 0.542056
					if( BBupper > 203.105 )
						if( dif_source_BBlower <= 95.6111 )
							if( BBupper <= 205.136 )
								if( dif_source_BBupper <= -36.8558 )
									ret := 0.600000
								if( dif_source_BBupper > -36.8558 )
									ret := -0.909091 // sell
							if( BBupper > 205.136 )
								if( dif_source_BBlower <= 8.27093 )
									ret := 0.484127
								if( dif_source_BBlower > 8.27093 )
									ret := 0.175199
						if( dif_source_BBlower > 95.6111 )
							if( BBupper <= 325.864 )
								ret := -1.000000 // sell
							if( BBupper > 325.864 )
								if( dif_source_BBlower <= 98.5171 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > 98.5171 )
									ret := -0.250000
		if( dif_source_BBupper > -10.5675 )
			if( BBlower <= 71.8363 )
				if( dif_source_BBlower <= 8.86487 )
					if( BBupper <= 76.2269 )
						if( vrsi <= 15.3297 )
							if( BBupper <= 54.7279 )
								if( dif_source_BBlower <= 1.05218 )
									ret := -0.276316
								if( dif_source_BBlower > 1.05218 )
									ret := 0.220588
							if( BBupper > 54.7279 )
								if( BBlower <= 60.5272 )
									ret := 0.314869
								if( BBlower > 60.5272 )
									ret := 0.084337
						if( vrsi > 15.3297 )
							if( BBlower <= 53.4894 )
								if( dif_source_BBupper <= -10.198 )
									ret := -0.578947
								if( dif_source_BBupper > -10.198 )
									ret := 0.132353
							if( BBlower > 53.4894 )
								if( BBlower <= 58.7824 )
									ret := -0.096251
								if( BBlower > 58.7824 )
									ret := 0.056804
					if( BBupper > 76.2269 )
						if( dif_source_BBupper <= -10.3905 )
							if( dif_source_BBupper <= -10.5065 )
								ret := -0.333333
							if( dif_source_BBupper > -10.5065 )
								ret := -0.833333 // sell
						if( dif_source_BBupper > -10.3905 )
							if( dif_source_BBlower <= 5.84541 )
								if( vrsi <= 28.9482 )
									ret := 0.453704
								if( vrsi > 28.9482 )
									ret := 0.248588
							if( dif_source_BBlower > 5.84541 )
								if( dif_source_BBupper <= -0.587617 )
									ret := 0.000000
								if( dif_source_BBupper > -0.587617 )
									ret := 0.857143 // buy
				if( dif_source_BBlower > 8.86487 )
					if( BBupper <= 52.8768 )
						ret := -1.000000 // sell
					if( BBupper > 52.8768 )
						if( dif_source_BBupper <= 2.50448 )
							if( vrsi <= 8.73357 )
								if( BBlower <= 67.7605 )
									ret := 0.957447 // buy
								if( BBlower > 67.7605 )
									ret := 0.428571
							if( vrsi > 8.73357 )
								if( vrsi <= 34.8372 )
									ret := 0.382736
								if( vrsi > 34.8372 )
									ret := 0.122995
						if( dif_source_BBupper > 2.50448 )
							if( dif_source_BBlower <= 24.8378 )
								ret := 0.000000
							if( dif_source_BBlower > 24.8378 )
								ret := -1.000000 // sell
			if( BBlower > 71.8363 )
				if( dif_source_BBlower <= 2.63723 )
					if( dif_source_BBupper <= -2.83999 )
						if( BBupper <= 76.3584 )
							if( vrsi <= 21.2947 )
								if( BBlower <= 72.4239 )
									ret := -1.000000 // sell
								if( BBlower > 72.4239 )
									ret := 0.000000
							if( vrsi > 21.2947 )
								ret := -1.000000 // sell
						if( BBupper > 76.3584 )
							if( BBlower <= 105.512 )
								if( BBupper <= 103.836 )
									ret := -0.019378
								if( BBupper > 103.836 )
									ret := 0.299242
							if( BBlower > 105.512 )
								if( BBupper <= 117.081 )
									ret := -0.647059
								if( BBupper > 117.081 )
									ret := -0.049057
					if( dif_source_BBupper > -2.83999 )
						if( BBupper <= 75.9494 )
							if( dif_source_BBlower <= 0.665942 )
								if( BBupper <= 75.2508 )
									ret := -0.750000 // sell
								if( BBupper > 75.2508 )
									ret := -1.000000 // sell
							if( dif_source_BBlower > 0.665942 )
								if( BBlower <= 71.991 )
									ret := -1.000000 // sell
								if( BBlower > 71.991 )
									ret := -0.136364
						if( BBupper > 75.9494 )
							if( dif_source_BBlower <= 0.89056 )
								if( dif_source_BBlower <= 0.664268 )
									ret := -0.081250
								if( dif_source_BBlower > 0.664268 )
									ret := 0.120000
							if( dif_source_BBlower > 0.89056 )
								if( BBupper <= 85.0473 )
									ret := -0.056856
								if( BBupper > 85.0473 )
									ret := -0.269231
				if( dif_source_BBlower > 2.63723 )
					if( dif_source_BBupper <= -3.29897 )
						if( BBupper <= 298.446 )
							if( BBlower <= 162.958 )
								if( dif_source_BBlower <= 36.1984 )
									ret := 0.086897
								if( dif_source_BBlower > 36.1984 )
									ret := -0.614035
							if( BBlower > 162.958 )
								if( BBupper <= 179.493 )
									ret := 0.826087 // buy
								if( BBupper > 179.493 )
									ret := 0.183223
						if( BBupper > 298.446 )
							if( dif_source_BBlower <= 65.4947 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 65.4947 )
								ret := 0.750000 // buy
					if( dif_source_BBupper > -3.29897 )
						if( BBupper <= 375.716 )
							if( BBupper <= 81.3913 )
								if( dif_source_BBlower <= 3.62906 )
									ret := -0.514286
								if( dif_source_BBlower > 3.62906 )
									ret := -0.212121
							if( BBupper > 81.3913 )
								if( BBlower <= 79.809 )
									ret := 0.195853
								if( BBlower > 79.809 )
									ret := -0.021815
						if( BBupper > 375.716 )
							if( vrsi <= 34.9551 )
								ret := -1.000000 // sell
							if( vrsi > 34.9551 )
								ret := -0.750000 // sell
	if( vrsi > 39.4426 )
		if( dif_source_BBlower <= 36.125 )
			if( BBupper <= 106.463 )
				if( dif_source_BBlower <= 17.505 )
					if( BBupper <= 101.301 )
						if( dif_source_BBlower <= -0.027523 )
							if( BBlower <= 43.2896 )
								ret := 1.000000 // buy
							if( BBlower > 43.2896 )
								if( BBupper <= 95.3273 )
									ret := -0.168372
								if( BBupper > 95.3273 )
									ret := 0.246667
						if( dif_source_BBlower > -0.027523 )
							if( BBupper <= 50.3602 )
								if( dif_source_BBupper <= -3.14528 )
									ret := 0.530303
								if( dif_source_BBupper > -3.14528 )
									ret := 0.078000
							if( BBupper > 50.3602 )
								if( BBupper <= 52.1335 )
									ret := -0.136808
								if( BBupper > 52.1335 )
									ret := 0.030322
					if( BBupper > 101.301 )
						if( dif_source_BBupper <= -2.72416 )
							if( dif_source_BBupper <= -27.5149 )
								if( dif_source_BBlower <= -1.89275 )
									ret := -0.600000
								if( dif_source_BBlower > -1.89275 )
									ret := 0.695652
							if( dif_source_BBupper > -27.5149 )
								if( BBlower <= 80.7825 )
									ret := -0.528302
								if( BBlower > 80.7825 )
									ret := -0.056471
						if( dif_source_BBupper > -2.72416 )
							if( BBlower <= 95.971 )
								if( vrsi <= 40.8448 )
									ret := -1.000000 // sell
								if( vrsi > 40.8448 )
									ret := -0.435233
							if( BBlower > 95.971 )
								if( vrsi <= 90.2607 )
									ret := -0.247059
								if( vrsi > 90.2607 )
									ret := 0.692308
				if( dif_source_BBlower > 17.505 )
					if( vrsi <= 47.9778 )
						if( BBupper <= 93.1373 )
							if( BBlower <= 52.9225 )
								if( BBlower <= 52.6849 )
									ret := 0.000000
								if( BBlower > 52.6849 )
									ret := 0.857143 // buy
							if( BBlower > 52.9225 )
								if( dif_source_BBlower <= 19.9502 )
									ret := -0.692308
								if( dif_source_BBlower > 19.9502 )
									ret := -0.178571
						if( BBupper > 93.1373 )
							if( BBlower <= 74.882 )
								if( dif_source_BBlower <= 18.505 )
									ret := 0.000000
								if( dif_source_BBlower > 18.505 )
									ret := 0.925926 // buy
							if( BBlower > 74.882 )
								if( vrsi <= 45.5015 )
									ret := -0.625000
								if( vrsi > 45.5015 )
									ret := 0.615385
					if( vrsi > 47.9778 )
						if( BBlower <= 58.244 )
							if( vrsi <= 51.0556 )
								ret := 1.000000 // buy
							if( vrsi > 51.0556 )
								if( dif_source_BBlower <= 24.0624 )
									ret := -0.855072 // sell
								if( dif_source_BBlower > 24.0624 )
									ret := -0.461538
						if( BBlower > 58.244 )
							if( dif_source_BBlower <= 20.5996 )
								if( dif_source_BBupper <= 1.89621 )
									ret := -0.167883
								if( dif_source_BBupper > 1.89621 )
									ret := 0.370968
							if( dif_source_BBlower > 20.5996 )
								if( BBupper <= 86.0795 )
									ret := 0.608696
								if( BBupper > 86.0795 )
									ret := -0.488688
			if( BBupper > 106.463 )
				if( vrsi <= 99.582 )
					if( dif_source_BBupper <= -76.6298 )
						if( dif_source_BBlower <= -15.8919 )
							if( BBupper <= 340.98 )
								if( BBlower <= 179.866 )
									ret := 0.000000
								if( BBlower > 179.866 )
									ret := 1.000000 // buy
							if( BBupper > 340.98 )
								if( BBupper <= 347.054 )
									ret := -0.700000 // sell
								if( BBupper > 347.054 )
									ret := -1.000000 // sell
						if( dif_source_BBlower > -15.8919 )
							if( dif_source_BBlower <= 33.8275 )
								if( BBupper <= 417.527 )
									ret := 0.483384
								if( BBupper > 417.527 )
									ret := -0.875000 // sell
							if( dif_source_BBlower > 33.8275 )
								if( dif_source_BBupper <= -131.453 )
									ret := 0.333333
								if( dif_source_BBupper > -131.453 )
									ret := -0.736842 // sell
					if( dif_source_BBupper > -76.6298 )
						if( BBlower <= 78.0078 )
							if( BBupper <= 106.782 )
								if( dif_source_BBupper <= -27.4678 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -27.4678 )
									ret := -0.375000
							if( BBupper > 106.782 )
								if( BBupper <= 119.243 )
									ret := 0.760870 // buy
								if( BBupper > 119.243 )
									ret := 0.181818
						if( BBlower > 78.0078 )
							if( dif_source_BBupper <= -73.1054 )
								if( dif_source_BBlower <= 16.004 )
									ret := -0.575000
								if( dif_source_BBlower > 16.004 )
									ret := 0.071429
							if( dif_source_BBupper > -73.1054 )
								if( BBlower <= 89.2224 )
									ret := -0.632653
								if( BBlower > 89.2224 )
									ret := 0.037308
				if( vrsi > 99.582 )
					if( BBlower <= 142.308 )
						if( BBupper <= 132.541 )
							if( BBupper <= 112.278 )
								if( dif_source_BBupper <= -5.28993 )
									ret := 0.166667
								if( dif_source_BBupper > -5.28993 )
									ret := 0.909091 // buy
							if( BBupper > 112.278 )
								if( dif_source_BBlower <= 6.53202 )
									ret := 0.200000
								if( dif_source_BBlower > 6.53202 )
									ret := -0.083333
						if( BBupper > 132.541 )
							if( dif_source_BBupper <= -6.6606 )
								if( BBupper <= 161.583 )
									ret := 0.166667
								if( BBupper > 161.583 )
									ret := -0.200000
							if( dif_source_BBupper > -6.6606 )
								if( BBlower <= 130.153 )
									ret := 0.857143 // buy
								if( BBlower > 130.153 )
									ret := 0.444444
					if( BBlower > 142.308 )
						if( dif_source_BBlower <= 3.44015 )
							if( BBupper <= 192.399 )
								if( BBlower <= 163.152 )
									ret := -0.833333 // sell
								if( BBlower > 163.152 )
									ret := -0.571429
							if( BBupper > 192.399 )
								ret := 0.000000
						if( dif_source_BBlower > 3.44015 )
							if( dif_source_BBupper <= 6.44382 )
								if( dif_source_BBupper <= -8.0265 )
									ret := 0.392157
								if( dif_source_BBupper > -8.0265 )
									ret := -0.211268
							if( dif_source_BBupper > 6.44382 )
								ret := 1.000000 // buy
		if( dif_source_BBlower > 36.125 )
			if( BBlower <= 138.293 )
				if( dif_source_BBupper <= -13.7728 )
					if( dif_source_BBupper <= -24.1335 )
						if( BBupper <= 215.464 )
							if( vrsi <= 70.0706 )
								if( BBlower <= 130.164 )
									ret := -1.000000 // sell
								if( BBlower > 130.164 )
									ret := 0.192308
							if( vrsi > 70.0706 )
								ret := -1.000000 // sell
						if( BBupper > 215.464 )
							if( BBlower <= 133.422 )
								if( dif_source_BBlower <= 51.8312 )
									ret := 0.911111 // buy
								if( dif_source_BBlower > 51.8312 )
									ret := 0.250000
							if( BBlower > 133.422 )
								if( dif_source_BBupper <= -132.342 )
									ret := 0.958333 // buy
								if( dif_source_BBupper > -132.342 )
									ret := -0.782609 // sell
					if( dif_source_BBupper > -24.1335 )
						if( vrsi <= 89.93 )
							if( BBlower <= 133.871 )
								if( BBlower <= 132.655 )
									ret := 0.650000
								if( BBlower > 132.655 )
									ret := 0.923077 // buy
							if( BBlower > 133.871 )
								if( BBlower <= 135.83 )
									ret := -1.000000 // sell
								if( BBlower > 135.83 )
									ret := 0.838710 // buy
						if( vrsi > 89.93 )
							ret := -0.500000
				if( dif_source_BBupper > -13.7728 )
					if( BBlower <= 134.293 )
						if( BBlower <= 115.336 )
							if( vrsi <= 60.3589 )
								if( dif_source_BBupper <= 2.88398 )
									ret := -0.043956
								if( dif_source_BBupper > 2.88398 )
									ret := 0.862069 // buy
							if( vrsi > 60.3589 )
								if( BBlower <= 75.3728 )
									ret := 0.086420
								if( BBlower > 75.3728 )
									ret := -0.482456
						if( BBlower > 115.336 )
							if( dif_source_BBlower <= 37.68 )
								if( BBupper <= 169.473 )
									ret := -0.785714 // sell
								if( BBupper > 169.473 )
									ret := 0.166667
							if( dif_source_BBlower > 37.68 )
								if( vrsi <= 55.0946 )
									ret := 0.000000
								if( vrsi > 55.0946 )
									ret := -0.906250 // sell
					if( BBlower > 134.293 )
						if( BBupper <= 193.554 )
							if( dif_source_BBupper <= -10.3442 )
								ret := 0.000000
							if( dif_source_BBupper > -10.3442 )
								ret := -1.000000 // sell
						if( BBupper > 193.554 )
							if( dif_source_BBupper <= -4.21453 )
								if( vrsi <= 74.6527 )
									ret := 1.000000 // buy
								if( vrsi > 74.6527 )
									ret := 0.833333 // buy
							if( dif_source_BBupper > -4.21453 )
								ret := 0.000000
			if( BBlower > 138.293 )
				if( dif_source_BBupper <= -55.5719 )
					if( dif_source_BBlower <= 38.4498 )
						if( dif_source_BBupper <= -128.778 )
							if( BBupper <= 332.921 )
								ret := 0.000000
							if( BBupper > 332.921 )
								ret := 0.000000
						if( dif_source_BBupper > -128.778 )
							if( vrsi <= 66.3093 )
								ret := -1.000000 // sell
							if( vrsi > 66.3093 )
								if( dif_source_BBupper <= -64.6315 )
									ret := -0.500000
								if( dif_source_BBupper > -64.6315 )
									ret := -1.000000 // sell
					if( dif_source_BBlower > 38.4498 )
						if( BBupper <= 341.219 )
							if( BBupper <= 336.307 )
								ret := -1.000000 // sell
							if( BBupper > 336.307 )
								if( BBupper <= 337.518 )
									ret := -0.600000
								if( BBupper > 337.518 )
									ret := -1.000000 // sell
						if( BBupper > 341.219 )
							ret := -0.714286 // sell
				if( dif_source_BBupper > -55.5719 )
					if( vrsi <= 99.9615 )
						if( vrsi <= 69.5688 )
							if( BBlower <= 156.791 )
								if( dif_source_BBlower <= 37.6455 )
									ret := 0.142857
								if( dif_source_BBlower > 37.6455 )
									ret := -0.673077
							if( BBlower > 156.791 )
								if( BBlower <= 271.697 )
									ret := 0.046823
								if( BBlower > 271.697 )
									ret := -0.403509
						if( vrsi > 69.5688 )
							if( dif_source_BBupper <= 8.68008 )
								if( BBupper <= 213.401 )
									ret := -0.051948
								if( BBupper > 213.401 )
									ret := -0.554187
							if( dif_source_BBupper > 8.68008 )
								if( BBlower <= 187.827 )
									ret := 0.346667
								if( BBlower > 187.827 )
									ret := -0.333333
					if( vrsi > 99.9615 )
						if( BBlower <= 285.741 )
							if( dif_source_BBlower <= 51.1094 )
								ret := 0.500000
							if( dif_source_BBlower > 51.1094 )
								ret := -0.285714
						if( BBlower > 285.741 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_LTCUSDT_30Min_30c610e4(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


