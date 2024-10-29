//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: PINS_15Min_1BOL_ad0c95c0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1BOL_ad0c95c0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_ad0c95c0(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( vrsi <= 52.8884 )
		if( BBlower <= 69.8079 )
			if( BBlower <= 60.0362 )
				if( BBlower <= 57.545 )
					if( BBlower <= 18.711 )
						if( BBlower <= 18.1927 )
							if( dif_source_BBupper <= -4.993 )
								if( dif_source_BBlower <= -0.551593 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.551593 )
									ret := 0.473988
							if( dif_source_BBupper > -4.993 )
								if( vrsi <= 0.03385 )
									ret := 0.506329
								if( vrsi > 0.03385 )
									ret := 0.047870
						if( BBlower > 18.1927 )
							ret := 0.266497
					if( BBlower > 18.711 )
						if( vrsi <= 10.9896 )
							if( BBupper <= 41.9117 )
								if( BBupper <= 27.6162 )
									ret := 0.253295
								if( BBupper > 27.6162 )
									ret := 0.089928
							if( BBupper > 41.9117 )
								if( BBupper <= 49.8447 )
									ret := 0.508197
								if( BBupper > 49.8447 )
									ret := 0.204188
						if( vrsi > 10.9896 )
							if( dif_source_BBlower <= -0.338806 )
								if( BBlower <= 27.5362 )
									ret := 0.368515
								if( BBlower > 27.5362 )
									ret := 0.077505
							if( dif_source_BBlower > -0.338806 )
								if( BBupper <= 21.8634 )
									ret := -0.134234
								if( BBupper > 21.8634 )
									ret := 0.035243
				if( BBlower > 57.545 )
					if( dif_source_BBlower <= -1.17376 )
						ret := 1.000000 // buy
					if( dif_source_BBlower > -1.17376 )
						if( dif_source_BBlower <= 1.55168 )
							if( BBupper <= 66.634 )
								if( dif_source_BBupper <= -6.1007 )
									ret := -0.694118
								if( dif_source_BBupper > -6.1007 )
									ret := -0.090226
							if( BBupper > 66.634 )
								ret := 0.555556
						if( dif_source_BBlower > 1.55168 )
							if( BBupper <= 63.5224 )
								ret := 0.235294
							if( BBupper > 63.5224 )
								if( vrsi <= 20.3933 )
									ret := -0.814433 // sell
								if( vrsi > 20.3933 )
									ret := -0.431193
			if( BBlower > 60.0362 )
				if( BBupper <= 71.2479 )
					if( dif_source_BBupper <= -0.848932 )
						if( dif_source_BBlower <= 0.485483 )
							if( BBlower <= 62.2829 )
								if( dif_source_BBlower <= -0.242714 )
									ret := 0.421053
								if( dif_source_BBlower > -0.242714 )
									ret := 0.894737 // buy
							if( BBlower > 62.2829 )
								if( BBlower <= 65.4 )
									ret := -0.343750
								if( BBlower > 65.4 )
									ret := 1.000000 // buy
						if( dif_source_BBlower > 0.485483 )
							if( vrsi <= 22.0731 )
								if( BBlower <= 63.3288 )
									ret := 0.452632
								if( BBlower > 63.3288 )
									ret := -0.019231
							if( vrsi > 22.0731 )
								if( dif_source_BBlower <= 2.78281 )
									ret := 0.453416
								if( dif_source_BBlower > 2.78281 )
									ret := 0.701149 // buy
					if( dif_source_BBupper > -0.848932 )
						if( dif_source_BBlower <= 3.22194 )
							if( dif_source_BBlower <= 2.75186 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 2.75186 )
								ret := 0.619048
						if( dif_source_BBlower > 3.22194 )
							if( BBlower <= 61.7635 )
								if( vrsi <= 37.2331 )
									ret := 0.652174
								if( vrsi > 37.2331 )
									ret := 0.189189
							if( BBlower > 61.7635 )
								if( dif_source_BBupper <= -0.567414 )
									ret := -0.605263
								if( dif_source_BBupper > -0.567414 )
									ret := 0.028571
				if( BBupper > 71.2479 )
					if( vrsi <= 49.999 )
						if( vrsi <= 44.1338 )
							if( dif_source_BBlower <= -0.774989 )
								if( BBupper <= 84.7833 )
									ret := 0.481481
								if( BBupper > 84.7833 )
									ret := 0.947368 // buy
							if( dif_source_BBlower > -0.774989 )
								if( BBlower <= 61.2768 )
									ret := -0.756098 // sell
								if( BBlower > 61.2768 )
									ret := 0.102886
						if( vrsi > 44.1338 )
							if( BBlower <= 65.696 )
								if( BBupper <= 81.2075 )
									ret := 0.708333 // buy
								if( BBupper > 81.2075 )
									ret := 0.000000
							if( BBlower > 65.696 )
								if( dif_source_BBlower <= 3.48655 )
									ret := 0.515789
								if( dif_source_BBlower > 3.48655 )
									ret := -0.159091
					if( vrsi > 49.999 )
						if( dif_source_BBlower <= 7.50437 )
							if( BBupper <= 72.096 )
								if( BBupper <= 71.6142 )
									ret := 0.125000
								if( BBupper > 71.6142 )
									ret := 0.900000 // buy
							if( BBupper > 72.096 )
								if( dif_source_BBupper <= -11.1142 )
									ret := 0.192308
								if( dif_source_BBupper > -11.1142 )
									ret := -0.345133
						if( dif_source_BBlower > 7.50437 )
							if( dif_source_BBlower <= 13.2447 )
								if( dif_source_BBlower <= 8.01697 )
									ret := 0.882353 // buy
								if( dif_source_BBlower > 8.01697 )
									ret := 0.433333
							if( dif_source_BBlower > 13.2447 )
								ret := -0.666667
		if( BBlower > 69.8079 )
			if( BBupper <= 89.6433 )
				if( dif_source_BBlower <= 2.17318 )
					if( dif_source_BBlower <= 0.3456 )
						if( dif_source_BBupper <= -13.649 )
							if( vrsi <= 2.41424 )
								if( vrsi <= 0.768067 )
									ret := -0.538462
								if( vrsi > 0.768067 )
									ret := -0.692308
							if( vrsi > 2.41424 )
								if( dif_source_BBlower <= -0.306093 )
									ret := 0.360000
								if( dif_source_BBlower > -0.306093 )
									ret := -1.000000 // sell
						if( dif_source_BBupper > -13.649 )
							if( BBupper <= 88.1005 )
								if( vrsi <= 15.5907 )
									ret := -0.213592
								if( vrsi > 15.5907 )
									ret := -0.473054
							if( BBupper > 88.1005 )
								if( BBlower <= 82.9782 )
									ret := -0.922078 // sell
								if( BBlower > 82.9782 )
									ret := -0.111111
					if( dif_source_BBlower > 0.3456 )
						if( BBupper <= 87.3831 )
							if( dif_source_BBupper <= -8.03356 )
								if( vrsi <= 38.2469 )
									ret := -0.900000 // sell
								if( vrsi > 38.2469 )
									ret := -1.000000 // sell
							if( dif_source_BBupper > -8.03356 )
								if( BBlower <= 71.2835 )
									ret := -0.385417
								if( BBlower > 71.2835 )
									ret := -0.090164
						if( BBupper > 87.3831 )
							if( vrsi <= 44.2638 )
								if( vrsi <= 31.7852 )
									ret := -0.125000
								if( vrsi > 31.7852 )
									ret := 0.826087 // buy
							if( vrsi > 44.2638 )
								ret := -0.450000
				if( dif_source_BBlower > 2.17318 )
					if( vrsi <= 19.7739 )
						if( vrsi <= 16.3144 )
							if( BBlower <= 76.8568 )
								if( dif_source_BBlower <= 4.85084 )
									ret := 0.086957
								if( dif_source_BBlower > 4.85084 )
									ret := 0.760000 // buy
							if( BBlower > 76.8568 )
								if( dif_source_BBupper <= -5.0494 )
									ret := -0.428571
								if( dif_source_BBupper > -5.0494 )
									ret := -0.600000
						if( vrsi > 16.3144 )
							if( dif_source_BBlower <= 5.77219 )
								if( BBlower <= 72.4907 )
									ret := -0.882353 // sell
								if( BBlower > 72.4907 )
									ret := -0.153846
							if( dif_source_BBlower > 5.77219 )
								if( BBlower <= 76.9367 )
									ret := -0.555556
								if( BBlower > 76.9367 )
									ret := -1.000000 // sell
					if( vrsi > 19.7739 )
						if( dif_source_BBlower <= 9.59713 )
							if( dif_source_BBupper <= -6.37014 )
								if( BBlower <= 73.8558 )
									ret := 0.142857
								if( BBlower > 73.8558 )
									ret := 0.608108
							if( dif_source_BBupper > -6.37014 )
								if( BBlower <= 81.5013 )
									ret := 0.126984
								if( BBlower > 81.5013 )
									ret := -0.342105
						if( dif_source_BBlower > 9.59713 )
							if( BBlower <= 76.08 )
								if( BBupper <= 86.383 )
									ret := 0.076923
								if( BBupper > 86.383 )
									ret := -0.857143 // sell
							if( BBlower > 76.08 )
								ret := -0.842105 // sell
			if( BBupper > 89.6433 )
				if( dif_source_BBupper <= -4.83274 )
					if( dif_source_BBupper <= -17.3501 )
						if( dif_source_BBlower <= 0.601711 )
							ret := -0.066667
						if( dif_source_BBlower > 0.601711 )
							ret := -0.500000
					if( dif_source_BBupper > -17.3501 )
						if( dif_source_BBlower <= 6.52381 )
							if( BBupper <= 89.7163 )
								ret := 0.600000
							if( BBupper > 89.7163 )
								if( vrsi <= 41.7639 )
									ret := 0.947368 // buy
								if( vrsi > 41.7639 )
									ret := 0.600000
						if( dif_source_BBlower > 6.52381 )
							ret := 0.333333
				if( dif_source_BBupper > -4.83274 )
					if( dif_source_BBupper <= -4.0702 )
						ret := -0.083333
					if( dif_source_BBupper > -4.0702 )
						if( dif_source_BBlower <= 7.71234 )
							if( BBupper <= 90.2157 )
								ret := -0.916667 // sell
							if( BBupper > 90.2157 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > 7.71234 )
							ret := -0.153846
	if( vrsi > 52.8884 )
		if( BBupper <= 25.8424 )
			if( BBupper <= 17.9766 )
				if( vrsi <= 81.7135 )
					if( dif_source_BBlower <= 0.968845 )
						if( BBupper <= 17.3219 )
							ret := -0.355140
						if( BBupper > 17.3219 )
							if( vrsi <= 67.5233 )
								if( vrsi <= 59.5114 )
									ret := 0.640000
								if( vrsi > 59.5114 )
									ret := -0.666667
							if( vrsi > 67.5233 )
								if( BBupper <= 17.856 )
									ret := 0.912500 // buy
								if( BBupper > 17.856 )
									ret := 0.692308
					if( dif_source_BBlower > 0.968845 )
						if( BBupper <= 15.7484 )
							if( dif_source_BBupper <= -1.49561 )
								if( vrsi <= 64.0439 )
									ret := 0.300000
								if( vrsi > 64.0439 )
									ret := -0.948718 // sell
							if( dif_source_BBupper > -1.49561 )
								if( dif_source_BBlower <= 2.48568 )
									ret := 0.402985
								if( dif_source_BBlower > 2.48568 )
									ret := -0.087719
						if( BBupper > 15.7484 )
							if( BBupper <= 15.9031 )
								if( BBlower <= 13.7704 )
									ret := -0.333333
								if( BBlower > 13.7704 )
									ret := 0.210526
							if( BBupper > 15.9031 )
								if( dif_source_BBlower <= 1.51229 )
									ret := -0.367347
								if( dif_source_BBlower > 1.51229 )
									ret := -0.615385
				if( vrsi > 81.7135 )
					if( vrsi <= 83.1232 )
						if( dif_source_BBupper <= -0.207309 )
							ret := -0.461538
						if( dif_source_BBupper > -0.207309 )
							ret := -1.000000 // sell
					if( vrsi > 83.1232 )
						if( BBlower <= 10.9877 )
							if( dif_source_BBlower <= 2.10183 )
								if( dif_source_BBupper <= -2.64734 )
									ret := 0.714286 // buy
								if( dif_source_BBupper > -2.64734 )
									ret := 0.333333
							if( dif_source_BBlower > 2.10183 )
								if( vrsi <= 86.4055 )
									ret := -1.000000 // sell
								if( vrsi > 86.4055 )
									ret := -0.416667
						if( BBlower > 10.9877 )
							if( dif_source_BBlower <= 1.15786 )
								if( dif_source_BBlower <= 1.00018 )
									ret := -0.153846
								if( dif_source_BBlower > 1.00018 )
									ret := 0.090909
							if( dif_source_BBlower > 1.15786 )
								if( dif_source_BBupper <= 0.206255 )
									ret := -0.727273 // sell
								if( dif_source_BBupper > 0.206255 )
									ret := -0.142857
			if( BBupper > 17.9766 )
				if( BBlower <= 17.4177 )
					if( dif_source_BBupper <= 0.252398 )
						if( dif_source_BBlower <= 4.19659 )
							if( dif_source_BBlower <= 1.78079 )
								if( dif_source_BBupper <= -3.03417 )
									ret := 0.059740
								if( dif_source_BBupper > -3.03417 )
									ret := 0.541033
							if( dif_source_BBlower > 1.78079 )
								if( BBlower <= 15.4094 )
									ret := -0.629032
								if( BBlower > 15.4094 )
									ret := 0.186508
						if( dif_source_BBlower > 4.19659 )
							if( dif_source_BBupper <= -2.22146 )
								if( BBlower <= 16.9637 )
									ret := -0.416667
								if( BBlower > 16.9637 )
									ret := -0.090909
							if( dif_source_BBupper > -2.22146 )
								if( BBupper <= 21.5394 )
									ret := -0.250000
								if( BBupper > 21.5394 )
									ret := -0.875000 // sell
					if( dif_source_BBupper > 0.252398 )
						if( BBlower <= 17.0622 )
							if( BBupper <= 20.4418 )
								if( dif_source_BBupper <= 0.428227 )
									ret := 0.277778
								if( dif_source_BBupper > 0.428227 )
									ret := -0.555556
							if( BBupper > 20.4418 )
								ret := -0.833333 // sell
						if( BBlower > 17.0622 )
							if( BBupper <= 20.584 )
								ret := -0.818182 // sell
							if( BBupper > 20.584 )
								ret := -0.187500
				if( BBlower > 17.4177 )
					if( BBlower <= 18.2105 )
						if( BBlower <= 17.6114 )
							if( BBupper <= 21.3514 )
								if( dif_source_BBlower <= 0.284715 )
									ret := -0.200000
								if( dif_source_BBlower > 0.284715 )
									ret := -0.587302
							if( BBupper > 21.3514 )
								if( dif_source_BBupper <= -1.59037 )
									ret := 0.062500
								if( dif_source_BBupper > -1.59037 )
									ret := -0.714286 // sell
						if( BBlower > 17.6114 )
							if( BBlower <= 17.9928 )
								if( BBupper <= 19.3549 )
									ret := 0.211538
								if( BBupper > 19.3549 )
									ret := -0.181518
							if( BBlower > 17.9928 )
								if( BBlower <= 18.1667 )
									ret := -0.284615
								if( BBlower > 18.1667 )
									ret := -0.553191
					if( BBlower > 18.2105 )
						if( dif_source_BBupper <= -1.43904 )
							if( vrsi <= 78.2138 )
								if( dif_source_BBlower <= 0.458048 )
									ret := -0.260238
								if( dif_source_BBlower > 0.458048 )
									ret := -0.004111
							if( vrsi > 78.2138 )
								ret := -0.368889
						if( dif_source_BBupper > -1.43904 )
							if( BBlower <= 19.1907 )
								if( BBupper <= 19.977 )
									ret := 0.226337
								if( BBupper > 19.977 )
									ret := -0.134694
							if( BBlower > 19.1907 )
								if( vrsi <= 99.9973 )
									ret := 0.052395
								if( vrsi > 99.9973 )
									ret := 0.385714
		if( BBupper > 25.8424 )
			if( BBupper <= 26.6035 )
				if( vrsi <= 91.6694 )
					if( BBlower <= 23.3745 )
						if( vrsi <= 89.2844 )
							if( vrsi <= 53.1757 )
								ret := 0.615385
							if( vrsi > 53.1757 )
								if( dif_source_BBupper <= -0.426212 )
									ret := -0.466830
								if( dif_source_BBupper > -0.426212 )
									ret := -0.152318
						if( vrsi > 89.2844 )
							ret := 0.642857
					if( BBlower > 23.3745 )
						if( dif_source_BBupper <= -0.394517 )
							if( dif_source_BBupper <= -1.20145 )
								if( BBlower <= 23.6486 )
									ret := 0.315068
								if( BBlower > 23.6486 )
									ret := -0.142361
							if( dif_source_BBupper > -1.20145 )
								if( BBupper <= 26.0843 )
									ret := -0.027027
								if( BBupper > 26.0843 )
									ret := -0.458484
						if( dif_source_BBupper > -0.394517 )
							if( vrsi <= 64.6702 )
								if( dif_source_BBupper <= 0.205374 )
									ret := 0.709677 // buy
								if( dif_source_BBupper > 0.205374 )
									ret := -0.625000
							if( vrsi > 64.6702 )
								if( BBlower <= 23.6268 )
									ret := -0.384615
								if( BBlower > 23.6268 )
									ret := 0.145299
				if( vrsi > 91.6694 )
					if( dif_source_BBlower <= 1.88394 )
						if( BBupper <= 26.4141 )
							if( BBupper <= 26.2505 )
								if( BBlower <= 24.245 )
									ret := -0.300000
								if( BBlower > 24.245 )
									ret := -1.000000 // sell
							if( BBupper > 26.2505 )
								ret := -0.952381 // sell
						if( BBupper > 26.4141 )
							if( vrsi <= 95.7778 )
								ret := -0.736842 // sell
							if( vrsi > 95.7778 )
								ret := -0.071429
					if( dif_source_BBlower > 1.88394 )
						if( BBupper <= 26.0646 )
							ret := -0.500000
						if( BBupper > 26.0646 )
							ret := 0.000000
			if( BBupper > 26.6035 )
				if( BBlower <= 69.005 )
					if( BBlower <= 55.8386 )
						if( BBupper <= 62.0436 )
							if( dif_source_BBupper <= 0.727262 )
								if( BBlower <= 21.9806 )
									ret := -0.365566
								if( BBlower > 21.9806 )
									ret := -0.090084
							if( dif_source_BBupper > 0.727262 )
								if( dif_source_BBupper <= 1.51877 )
									ret := 0.233696
								if( dif_source_BBupper > 1.51877 )
									ret := -0.075000
						if( BBupper > 62.0436 )
							if( vrsi <= 80.1928 )
								if( BBupper <= 84.6883 )
									ret := -0.534296
								if( BBupper > 84.6883 )
									ret := 0.142857
							if( vrsi > 80.1928 )
								if( dif_source_BBupper <= -9.19635 )
									ret := 0.216216
								if( dif_source_BBupper > -9.19635 )
									ret := -0.500000
					if( BBlower > 55.8386 )
						if( BBupper <= 65.6189 )
							if( vrsi <= 62.5543 )
								if( dif_source_BBlower <= 1.15728 )
									ret := -0.058824
								if( dif_source_BBlower > 1.15728 )
									ret := 0.551331
							if( vrsi > 62.5543 )
								if( BBlower <= 60.3963 )
									ret := -0.075314
								if( BBlower > 60.3963 )
									ret := 0.514851
						if( BBupper > 65.6189 )
							if( BBlower <= 60.9384 )
								if( dif_source_BBupper <= -26.587 )
									ret := 0.833333 // buy
								if( dif_source_BBupper > -26.587 )
									ret := -0.537931
							if( BBlower > 60.9384 )
								if( BBupper <= 67.8087 )
									ret := -0.389222
								if( BBupper > 67.8087 )
									ret := 0.016852
				if( BBlower > 69.005 )
					if( dif_source_BBupper <= -2.1919 )
						if( dif_source_BBupper <= -2.53035 )
							if( BBlower <= 69.2135 )
								if( BBupper <= 75.541 )
									ret := 0.645161
								if( BBupper > 75.541 )
									ret := -0.545455
							if( BBlower > 69.2135 )
								if( dif_source_BBupper <= -14.4964 )
									ret := -0.862069 // sell
								if( dif_source_BBupper > -14.4964 )
									ret := -0.146129
						if( dif_source_BBupper > -2.53035 )
							if( BBupper <= 86.4459 )
								if( dif_source_BBlower <= 4.32199 )
									ret := 0.603448
								if( dif_source_BBlower > 4.32199 )
									ret := 0.043478
							if( BBupper > 86.4459 )
								if( BBlower <= 78.4114 )
									ret := 0.500000
								if( BBlower > 78.4114 )
									ret := 0.000000
					if( dif_source_BBupper > -2.1919 )
						if( BBlower <= 75.9751 )
							if( dif_source_BBupper <= -0.5204 )
								if( vrsi <= 78.7098 )
									ret := -0.486154
								if( vrsi > 78.7098 )
									ret := -0.087719
							if( dif_source_BBupper > -0.5204 )
								if( BBupper <= 79.8138 )
									ret := -0.545455
								if( BBupper > 79.8138 )
									ret := -1.000000 // sell
						if( BBlower > 75.9751 )
							if( BBlower <= 81.1958 )
								if( BBupper <= 84.835 )
									ret := 0.245763
								if( BBupper > 84.835 )
									ret := -0.235294
							if( BBlower > 81.1958 )
								if( BBlower <= 82.539 )
									ret := -0.470588
								if( BBlower > 82.539 )
									ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_PINS_15Min_ad0c95c0(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


