//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: ETHUSDT_5Min_1BOL_1d1d4292 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_1BOL_1d1d4292", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_1d1d4292(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBupper <= -65.5479 )
		if( dif_source_BBlower <= -15.5237 )
			if( BBupper <= 2261.84 )
				if( BBlower <= 1768.98 )
					if( vrsi <= 28.3573 )
						if( vrsi <= 21.2792 )
							if( dif_source_BBlower <= -18.7576 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -18.7576 )
								ret := 0.666667
						if( vrsi > 21.2792 )
							ret := 0.333333
					if( vrsi > 28.3573 )
						ret := 1.000000 // buy
				if( BBlower > 1768.98 )
					if( BBupper <= 1905.88 )
						ret := -0.800000 // sell
					if( BBupper > 1905.88 )
						if( dif_source_BBupper <= -75.4489 )
							if( dif_source_BBupper <= -113.454 )
								if( BBupper <= 2089.34 )
									ret := -0.111111
								if( BBupper > 2089.34 )
									ret := 0.857143 // buy
							if( dif_source_BBupper > -113.454 )
								if( dif_source_BBlower <= -16.5941 )
									ret := 0.916667 // buy
								if( dif_source_BBlower > -16.5941 )
									ret := 0.400000
						if( dif_source_BBupper > -75.4489 )
							if( dif_source_BBupper <= -72.0087 )
								if( vrsi <= 22.5027 )
									ret := -1.000000 // sell
								if( vrsi > 22.5027 )
									ret := 0.125000
							if( dif_source_BBupper > -72.0087 )
								ret := 1.000000 // buy
			if( BBupper > 2261.84 )
				if( BBupper <= 3583.68 )
					if( vrsi <= 23.2965 )
						if( BBlower <= 2196.16 )
							if( vrsi <= 9.93441 )
								ret := -1.000000 // sell
							if( vrsi > 9.93441 )
								ret := 0.000000
						if( BBlower > 2196.16 )
							if( BBlower <= 2488.55 )
								if( BBupper <= 2388.53 )
									ret := 0.138462
								if( BBupper > 2388.53 )
									ret := 0.716495 // buy
							if( BBlower > 2488.55 )
								if( BBlower <= 3012.62 )
									ret := 0.050420
								if( BBlower > 3012.62 )
									ret := 0.338530
					if( vrsi > 23.2965 )
						if( BBupper <= 3525.3 )
							if( BBlower <= 3072.78 )
								if( BBupper <= 3060.7 )
									ret := 0.100515
								if( BBupper > 3060.7 )
									ret := -0.210117
							if( BBlower > 3072.78 )
								if( dif_source_BBupper <= -145.084 )
									ret := 0.163793
								if( dif_source_BBupper > -145.084 )
									ret := 0.692308
						if( BBupper > 3525.3 )
							if( BBlower <= 3267.22 )
								if( dif_source_BBupper <= -369.563 )
									ret := 0.333333
								if( dif_source_BBupper > -369.563 )
									ret := -0.972222 // sell
							if( BBlower > 3267.22 )
								if( BBlower <= 3481.86 )
									ret := -0.243094
								if( BBlower > 3481.86 )
									ret := 0.615385
				if( BBupper > 3583.68 )
					if( BBupper <= 3693.39 )
						if( dif_source_BBupper <= -246.061 )
							if( dif_source_BBupper <= -292.915 )
								if( vrsi <= 63.0864 )
									ret := 0.738462 // buy
								if( vrsi > 63.0864 )
									ret := -0.375000
							if( dif_source_BBupper > -292.915 )
								if( BBlower <= 3421.31 )
									ret := -0.305556
								if( BBlower > 3421.31 )
									ret := 1.000000 // buy
						if( dif_source_BBupper > -246.061 )
							if( vrsi <= 7.40002 )
								if( dif_source_BBlower <= -37.7076 )
									ret := 0.866667 // buy
								if( dif_source_BBlower > -37.7076 )
									ret := -0.476190
							if( vrsi > 7.40002 )
								if( dif_source_BBupper <= -96.5213 )
									ret := 0.791444 // buy
								if( dif_source_BBupper > -96.5213 )
									ret := -0.200000
					if( BBupper > 3693.39 )
						if( dif_source_BBlower <= -26.1544 )
							if( dif_source_BBupper <= -86.7356 )
								if( vrsi <= 34.3411 )
									ret := 0.508897
								if( vrsi > 34.3411 )
									ret := 0.163462
							if( dif_source_BBupper > -86.7356 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > -26.1544 )
							if( BBlower <= 3984.26 )
								if( vrsi <= 13.3346 )
									ret := 0.564103
								if( vrsi > 13.3346 )
									ret := -0.293750
							if( BBlower > 3984.26 )
								if( vrsi <= 27.4216 )
									ret := 1.000000 // buy
								if( vrsi > 27.4216 )
									ret := 0.700000 // buy
		if( dif_source_BBlower > -15.5237 )
			if( BBlower <= 3105.35 )
				if( vrsi <= 37.9189 )
					if( dif_source_BBlower <= 208.816 )
						if( dif_source_BBlower <= 118.427 )
							if( dif_source_BBupper <= -320.95 )
								if( dif_source_BBlower <= 79.6466 )
									ret := 0.101266
								if( dif_source_BBlower > 79.6466 )
									ret := -0.769231 // sell
							if( dif_source_BBupper > -320.95 )
								if( BBlower <= 2562.86 )
									ret := 0.139392
								if( BBlower > 2562.86 )
									ret := 0.270215
						if( dif_source_BBlower > 118.427 )
							if( BBlower <= 2857.28 )
								if( BBupper <= 2757.15 )
									ret := 0.450000
								if( BBupper > 2757.15 )
									ret := 0.743243 // buy
							if( BBlower > 2857.28 )
								if( vrsi <= 22.1114 )
									ret := -0.181818
								if( vrsi > 22.1114 )
									ret := 0.607143
					if( dif_source_BBlower > 208.816 )
						if( dif_source_BBupper <= -91.6962 )
							if( dif_source_BBlower <= 830.519 )
								if( dif_source_BBupper <= -97.6806 )
									ret := -0.400000
								if( dif_source_BBupper > -97.6806 )
									ret := 0.370370
							if( dif_source_BBlower > 830.519 )
								if( dif_source_BBlower <= 850.547 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 850.547 )
									ret := 0.750000 // buy
						if( dif_source_BBupper > -91.6962 )
							if( dif_source_BBlower <= 271.731 )
								if( dif_source_BBupper <= -85.8003 )
									ret := -0.400000
								if( dif_source_BBupper > -85.8003 )
									ret := -0.765957 // sell
							if( dif_source_BBlower > 271.731 )
								if( dif_source_BBlower <= 285.146 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 285.146 )
									ret := -0.250000
				if( vrsi > 37.9189 )
					if( BBlower <= 3083.6 )
						if( BBlower <= 3075.03 )
							if( dif_source_BBlower <= 86.1828 )
								if( BBupper <= 3219.85 )
									ret := 0.062283
								if( BBupper > 3219.85 )
									ret := -0.231959
							if( dif_source_BBlower > 86.1828 )
								if( dif_source_BBlower <= 182.664 )
									ret := 0.257836
								if( dif_source_BBlower > 182.664 )
									ret := 0.003317
						if( BBlower > 3075.03 )
							if( dif_source_BBlower <= 58.8645 )
								if( dif_source_BBlower <= 33.6376 )
									ret := -0.168831
								if( dif_source_BBlower > 33.6376 )
									ret := 0.416667
							if( dif_source_BBlower > 58.8645 )
								if( dif_source_BBupper <= -299.235 )
									ret := 0.692308
								if( dif_source_BBupper > -299.235 )
									ret := -0.431953
					if( BBlower > 3083.6 )
						if( BBupper <= 3264.56 )
							if( dif_source_BBupper <= -70.4115 )
								if( dif_source_BBupper <= -85.9546 )
									ret := 0.622642
								if( dif_source_BBupper > -85.9546 )
									ret := 0.869565 // buy
							if( dif_source_BBupper > -70.4115 )
								if( BBlower <= 3095.31 )
									ret := -0.294118
								if( BBlower > 3095.31 )
									ret := 0.764706 // buy
						if( BBupper > 3264.56 )
							if( dif_source_BBupper <= -137.256 )
								if( BBupper <= 3326.23 )
									ret := 0.730000 // buy
								if( BBupper > 3326.23 )
									ret := 0.446541
							if( dif_source_BBupper > -137.256 )
								if( dif_source_BBlower <= 186.215 )
									ret := -0.493333
								if( dif_source_BBlower > 186.215 )
									ret := 0.962963 // buy
			if( BBlower > 3105.35 )
				if( BBlower <= 3216.67 )
					if( BBupper <= 3361.7 )
						if( dif_source_BBupper <= -183.426 )
							if( BBupper <= 3338.31 )
								if( vrsi <= 21.8541 )
									ret := 1.000000 // buy
								if( vrsi > 21.8541 )
									ret := -0.428571
							if( BBupper > 3338.31 )
								if( vrsi <= 31.5672 )
									ret := 0.333333
								if( vrsi > 31.5672 )
									ret := 0.906250 // buy
						if( dif_source_BBupper > -183.426 )
							if( dif_source_BBupper <= -112.785 )
								if( vrsi <= 82.4831 )
									ret := -0.581761
								if( vrsi > 82.4831 )
									ret := 0.137931
							if( dif_source_BBupper > -112.785 )
								if( BBupper <= 3241.39 )
									ret := -0.426230
								if( BBupper > 3241.39 )
									ret := 0.050228
					if( BBupper > 3361.7 )
						if( vrsi <= 26.8731 )
							if( dif_source_BBlower <= 2.41322 )
								if( BBupper <= 3376.2 )
									ret := 0.909091 // buy
								if( BBupper > 3376.2 )
									ret := 0.250000
							if( dif_source_BBlower > 2.41322 )
								if( dif_source_BBlower <= 40.3318 )
									ret := -0.629630
								if( dif_source_BBlower > 40.3318 )
									ret := 0.514851
						if( vrsi > 26.8731 )
							if( dif_source_BBupper <= -118.908 )
								if( BBlower <= 3181.61 )
									ret := 0.125731
								if( BBlower > 3181.61 )
									ret := -0.202703
							if( dif_source_BBupper > -118.908 )
								if( BBupper <= 3413.66 )
									ret := -0.323529
								if( BBupper > 3413.66 )
									ret := -0.906977 // sell
				if( BBlower > 3216.67 )
					if( dif_source_BBupper <= -95.2511 )
						if( dif_source_BBlower <= 158.945 )
							if( BBlower <= 3668.47 )
								if( BBupper <= 3418.28 )
									ret := 0.291200
								if( BBupper > 3418.28 )
									ret := 0.026032
							if( BBlower > 3668.47 )
								if( vrsi <= 3.09173 )
									ret := -0.653061
								if( vrsi > 3.09173 )
									ret := 0.293027
						if( dif_source_BBlower > 158.945 )
							if( dif_source_BBlower <= 434.297 )
								if( BBupper <= 3622.58 )
									ret := -0.450000
								if( BBupper > 3622.58 )
									ret := 0.613583
							if( dif_source_BBlower > 434.297 )
								if( dif_source_BBupper <= -144.027 )
									ret := 0.687500
								if( dif_source_BBupper > -144.027 )
									ret := -0.851852 // sell
					if( dif_source_BBupper > -95.2511 )
						if( dif_source_BBlower <= 49.0967 )
							if( dif_source_BBlower <= 21.7829 )
								if( BBlower <= 3712.99 )
									ret := -0.200221
								if( BBlower > 3712.99 )
									ret := 0.169065
							if( dif_source_BBlower > 21.7829 )
								if( BBlower <= 3814.03 )
									ret := 0.201787
								if( BBlower > 3814.03 )
									ret := -0.089286
						if( dif_source_BBlower > 49.0967 )
							if( vrsi <= 81.5317 )
								if( dif_source_BBlower <= 299.451 )
									ret := -0.102234
								if( dif_source_BBlower > 299.451 )
									ret := 0.432432
							if( vrsi > 81.5317 )
								if( dif_source_BBlower <= 321.574 )
									ret := -0.319502
								if( dif_source_BBlower > 321.574 )
									ret := 0.526316
	if( dif_source_BBupper > -65.5479 )
		if( BBlower <= 3395.74 )
			if( BBupper <= 3251.24 )
				if( vrsi <= 64.6064 )
					if( BBupper <= 3188.9 )
						if( dif_source_BBlower <= 32.4602 )
							if( BBlower <= 1534.33 )
								if( BBupper <= 1572.52 )
									ret := 0.213675
								if( BBupper > 1572.52 )
									ret := 0.709677 // buy
							if( BBlower > 1534.33 )
								if( BBlower <= 3053.65 )
									ret := 0.031733
								if( BBlower > 3053.65 )
									ret := 0.171763
						if( dif_source_BBlower > 32.4602 )
							if( dif_source_BBlower <= 276.105 )
								if( dif_source_BBlower <= 64.8832 )
									ret := 0.096377
								if( dif_source_BBlower > 64.8832 )
									ret := 0.048268
							if( dif_source_BBlower > 276.105 )
								if( BBupper <= 2693.16 )
									ret := -0.811594 // sell
								if( BBupper > 2693.16 )
									ret := 0.526316
					if( BBupper > 3188.9 )
						if( vrsi <= 34.752 )
							if( BBupper <= 3221.48 )
								if( BBlower <= 3101.93 )
									ret := 0.230769
								if( BBlower > 3101.93 )
									ret := -0.211454
							if( BBupper > 3221.48 )
								if( BBlower <= 3061.79 )
									ret := 0.937500 // buy
								if( BBlower > 3061.79 )
									ret := 0.250000
						if( vrsi > 34.752 )
							if( BBupper <= 3192.95 )
								if( dif_source_BBupper <= -47.0455 )
									ret := 0.769231 // buy
								if( dif_source_BBupper > -47.0455 )
									ret := -0.660377
							if( BBupper > 3192.95 )
								if( BBupper <= 3228.9 )
									ret := -0.054511
								if( BBupper > 3228.9 )
									ret := -0.370044
				if( vrsi > 64.6064 )
					if( dif_source_BBlower <= 23.6597 )
						if( BBlower <= 3095.24 )
							if( dif_source_BBupper <= -32.6346 )
								if( vrsi <= 98.5317 )
									ret := -0.073343
								if( vrsi > 98.5317 )
									ret := 0.198113
							if( dif_source_BBupper > -32.6346 )
								if( BBupper <= 2263.84 )
									ret := 0.028637
								if( BBupper > 2263.84 )
									ret := 0.110926
						if( BBlower > 3095.24 )
							if( dif_source_BBlower <= 3.63381 )
								if( BBlower <= 3131.54 )
									ret := -0.764706 // sell
								if( BBlower > 3131.54 )
									ret := -0.250000
							if( dif_source_BBlower > 3.63381 )
								if( BBupper <= 3159.75 )
									ret := -0.076923
								if( BBupper > 3159.75 )
									ret := 0.508876
					if( dif_source_BBlower > 23.6597 )
						if( BBlower <= 2023.31 )
							if( BBupper <= 1623.87 )
								if( dif_source_BBupper <= 15.368 )
									ret := 0.147903
								if( dif_source_BBupper > 15.368 )
									ret := -0.850000 // sell
							if( BBupper > 1623.87 )
								if( dif_source_BBupper <= 0.916755 )
									ret := -0.059229
								if( dif_source_BBupper > 0.916755 )
									ret := -0.234297
						if( BBlower > 2023.31 )
							if( BBupper <= 2238.95 )
								if( BBlower <= 2131.33 )
									ret := 0.039474
								if( BBlower > 2131.33 )
									ret := 0.454545
							if( BBupper > 2238.95 )
								if( BBupper <= 2277.72 )
									ret := -0.169875
								if( BBupper > 2277.72 )
									ret := -0.005955
			if( BBupper > 3251.24 )
				if( BBlower <= 2809.83 )
					ret := -1.000000 // sell
				if( BBlower > 2809.83 )
					if( dif_source_BBupper <= -11.9565 )
						if( BBupper <= 3471.79 )
							if( BBlower <= 3301.18 )
								if( dif_source_BBlower <= 11.0371 )
									ret := -0.402299
								if( dif_source_BBlower > 11.0371 )
									ret := 0.169353
							if( BBlower > 3301.18 )
								if( vrsi <= 79.0715 )
									ret := 0.248731
								if( vrsi > 79.0715 )
									ret := 0.558511
						if( BBupper > 3471.79 )
							if( BBlower <= 3379.38 )
								if( dif_source_BBlower <= 95.8959 )
									ret := 0.384956
								if( dif_source_BBlower > 95.8959 )
									ret := -0.009009
							if( BBlower > 3379.38 )
								if( dif_source_BBlower <= 75.425 )
									ret := -0.423313
								if( dif_source_BBlower > 75.425 )
									ret := -0.044643
					if( dif_source_BBupper > -11.9565 )
						if( dif_source_BBupper <= 134.21 )
							if( BBupper <= 3456.79 )
								if( BBupper <= 3404.09 )
									ret := 0.022180
								if( BBupper > 3404.09 )
									ret := -0.163290
							if( BBupper > 3456.79 )
								if( BBupper <= 3469.68 )
									ret := 0.647482
								if( BBupper > 3469.68 )
									ret := 0.068047
						if( dif_source_BBupper > 134.21 )
							if( dif_source_BBlower <= 761.029 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 761.029 )
								ret := -0.800000 // sell
		if( BBlower > 3395.74 )
			if( BBupper <= 3483.52 )
				if( BBupper <= 3432.56 )
					if( vrsi <= 37.5979 )
						if( BBlower <= 3400.15 )
							ret := 1.000000 // buy
						if( BBlower > 3400.15 )
							ret := 0.250000
					if( vrsi > 37.5979 )
						if( BBlower <= 3400.29 )
							if( BBupper <= 3431.72 )
								ret := 0.000000
							if( BBupper > 3431.72 )
								ret := -0.250000
						if( BBlower > 3400.29 )
							ret := 0.750000 // buy
				if( BBupper > 3432.56 )
					if( dif_source_BBupper <= -36.8012 )
						if( BBupper <= 3474.72 )
							if( BBlower <= 3399.52 )
								if( BBlower <= 3397.16 )
									ret := 1.000000 // buy
								if( BBlower > 3397.16 )
									ret := 0.440000
							if( BBlower > 3399.52 )
								if( dif_source_BBupper <= -48.8184 )
									ret := 0.181818
								if( dif_source_BBupper > -48.8184 )
									ret := -0.347368
						if( BBupper > 3474.72 )
							if( BBlower <= 3416.39 )
								ret := -1.000000 // sell
							if( BBlower > 3416.39 )
								if( BBlower <= 3423.72 )
									ret := 0.045455
								if( BBlower > 3423.72 )
									ret := -0.937500 // sell
					if( dif_source_BBupper > -36.8012 )
						if( dif_source_BBlower <= 23.7698 )
							if( dif_source_BBlower <= 13.2872 )
								if( BBlower <= 3400.96 )
									ret := 0.000000
								if( BBlower > 3400.96 )
									ret := -0.649351
							if( dif_source_BBlower > 13.2872 )
								if( vrsi <= 34.5297 )
									ret := 0.166667
								if( vrsi > 34.5297 )
									ret := -0.196429
						if( dif_source_BBlower > 23.7698 )
							if( BBupper <= 3482.7 )
								if( BBupper <= 3456.64 )
									ret := -0.417722
								if( BBupper > 3456.64 )
									ret := -0.729508 // sell
							if( BBupper > 3482.7 )
								ret := 0.428571
			if( BBupper > 3483.52 )
				if( BBlower <= 3955.24 )
					if( dif_source_BBupper <= 0.871561 )
						if( dif_source_BBlower <= 283.094 )
							if( dif_source_BBlower <= 219.087 )
								if( BBlower <= 3409.42 )
									ret := -0.381250
								if( BBlower > 3409.42 )
									ret := -0.001014
							if( dif_source_BBlower > 219.087 )
								if( BBlower <= 3500.91 )
									ret := 0.052632
								if( BBlower > 3500.91 )
									ret := 0.627451
						if( dif_source_BBlower > 283.094 )
							if( vrsi <= 73.4286 )
								if( BBlower <= 3748.61 )
									ret := -0.920000 // sell
								if( BBlower > 3748.61 )
									ret := -0.600000
							if( vrsi > 73.4286 )
								ret := -0.333333
					if( dif_source_BBupper > 0.871561 )
						if( BBupper <= 3507.25 )
							if( BBlower <= 3443.63 )
								if( dif_source_BBlower <= 93.7679 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 93.7679 )
									ret := 0.791667 // buy
							if( BBlower > 3443.63 )
								ret := 0.000000
						if( BBupper > 3507.25 )
							if( dif_source_BBlower <= 74.6013 )
								if( BBlower <= 3478.33 )
									ret := -0.309091
								if( BBlower > 3478.33 )
									ret := 0.154135
							if( dif_source_BBlower > 74.6013 )
								if( BBupper <= 3820.51 )
									ret := -0.377888
								if( BBupper > 3820.51 )
									ret := 0.037249
				if( BBlower > 3955.24 )
					if( dif_source_BBlower <= 22.3282 )
						if( BBupper <= 4079.21 )
							if( vrsi <= 54.3765 )
								if( dif_source_BBupper <= -60.9098 )
									ret := 0.000000
								if( dif_source_BBupper > -60.9098 )
									ret := -0.605263
							if( vrsi > 54.3765 )
								if( vrsi <= 63.1851 )
									ret := 0.750000 // buy
								if( vrsi > 63.1851 )
									ret := 0.000000
						if( BBupper > 4079.21 )
							if( BBupper <= 4079.88 )
								ret := 1.000000 // buy
							if( BBupper > 4079.88 )
								if( dif_source_BBupper <= -52.4016 )
									ret := 0.000000
								if( dif_source_BBupper > -52.4016 )
									ret := -0.800000 // sell
					if( dif_source_BBlower > 22.3282 )
						if( BBupper <= 4088.03 )
							if( vrsi <= 17.9508 )
								if( BBlower <= 4011.44 )
									ret := 0.500000
								if( BBlower > 4011.44 )
									ret := 0.000000
							if( vrsi > 17.9508 )
								if( dif_source_BBupper <= -3.71093 )
									ret := -0.617647
								if( dif_source_BBupper > -3.71093 )
									ret := -1.000000 // sell
						if( BBupper > 4088.03 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ETHUSDT_5Min_1d1d4292(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


