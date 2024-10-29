//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: APPS_15Min_1BOL_f125b95f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_1BOL_f125b95f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_f125b95f(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 44.7247 )
		if( BBlower <= 0.97049 )
			if( dif_source_BBupper <= -0.021713 )
				if( dif_source_BBlower <= 0.060863 )
					if( vrsi <= 41.6602 )
						if( vrsi <= 33.3955 )
							if( dif_source_BBlower <= 0.011558 )
								if( BBlower <= 0.86446 )
									ret := 0.578947
								if( BBlower > 0.86446 )
									ret := -0.120000
							if( dif_source_BBlower > 0.011558 )
								if( vrsi <= 0.09957 )
									ret := 0.288889
								if( vrsi > 0.09957 )
									ret := 0.613208
						if( vrsi > 33.3955 )
							if( dif_source_BBupper <= -0.042984 )
								if( dif_source_BBupper <= -0.082019 )
									ret := 0.583333
								if( dif_source_BBupper > -0.082019 )
									ret := 0.832117 // buy
							if( dif_source_BBupper > -0.042984 )
								if( dif_source_BBlower <= 0.017607 )
									ret := 0.235294
								if( dif_source_BBlower > 0.017607 )
									ret := 0.689655
					if( vrsi > 41.6602 )
						if( vrsi <= 44.1225 )
							if( vrsi <= 43.805 )
								if( BBlower <= 0.664885 )
									ret := 0.625000
								if( BBlower > 0.664885 )
									ret := -0.166667
							if( vrsi > 43.805 )
								ret := -0.857143 // sell
						if( vrsi > 44.1225 )
							if( vrsi <= 44.2775 )
								ret := 1.000000 // buy
							if( vrsi > 44.2775 )
								ret := 0.250000
				if( dif_source_BBlower > 0.060863 )
					if( BBupper <= 0.850282 )
						if( BBlower <= 0.581074 )
							if( BBupper <= 0.758799 )
								if( dif_source_BBupper <= -0.028612 )
									ret := 0.833333 // buy
								if( dif_source_BBupper > -0.028612 )
									ret := -0.250000
							if( BBupper > 0.758799 )
								if( BBupper <= 0.770037 )
									ret := 0.000000
								if( BBupper > 0.770037 )
									ret := 0.500000
						if( BBlower > 0.581074 )
							if( dif_source_BBlower <= 0.089124 )
								if( dif_source_BBlower <= 0.084056 )
									ret := 0.789474 // buy
								if( dif_source_BBlower > 0.084056 )
									ret := 0.111111
							if( dif_source_BBlower > 0.089124 )
								if( BBlower <= 0.605869 )
									ret := 0.500000
								if( BBlower > 0.605869 )
									ret := 0.958333 // buy
					if( BBupper > 0.850282 )
						if( dif_source_BBupper <= -0.16219 )
							if( vrsi <= 23.6268 )
								ret := -1.000000 // sell
							if( vrsi > 23.6268 )
								ret := -0.250000
						if( dif_source_BBupper > -0.16219 )
							if( BBupper <= 1.06933 )
								if( BBupper <= 0.989806 )
									ret := 0.310127
								if( BBupper > 0.989806 )
									ret := -0.340000
							if( BBupper > 1.06933 )
								if( vrsi <= 44.4415 )
									ret := 0.619048
								if( vrsi > 44.4415 )
									ret := -0.400000
			if( dif_source_BBupper > -0.021713 )
				if( dif_source_BBlower <= 0.132928 )
					if( vrsi <= 41.3307 )
						if( vrsi <= 30.5686 )
							if( dif_source_BBlower <= 0.040579 )
								if( vrsi <= 20.7621 )
									ret := 0.312500
								if( vrsi > 20.7621 )
									ret := 0.000000
							if( dif_source_BBlower > 0.040579 )
								if( BBupper <= 0.994334 )
									ret := -0.205128
								if( BBupper > 0.994334 )
									ret := -1.000000 // sell
						if( vrsi > 30.5686 )
							if( BBupper <= 1.02017 )
								if( dif_source_BBlower <= 0.031934 )
									ret := 0.000000
								if( dif_source_BBlower > 0.031934 )
									ret := 0.281250
							if( BBupper > 1.02017 )
								ret := 1.000000 // buy
					if( vrsi > 41.3307 )
						if( BBlower <= 0.658928 )
							ret := 0.333333
						if( BBlower > 0.658928 )
							if( vrsi <= 44.3927 )
								if( dif_source_BBlower <= 0.030696 )
									ret := -0.250000
								if( dif_source_BBlower > 0.030696 )
									ret := -0.769231 // sell
							if( vrsi > 44.3927 )
								ret := 0.000000
				if( dif_source_BBlower > 0.132928 )
					if( BBupper <= 1.08632 )
						if( BBupper <= 0.897535 )
							if( dif_source_BBlower <= 0.1703 )
								if( BBlower <= 0.650846 )
									ret := 0.777778 // buy
								if( BBlower > 0.650846 )
									ret := 0.133333
							if( dif_source_BBlower > 0.1703 )
								if( dif_source_BBlower <= 0.178788 )
									ret := -0.750000 // sell
								if( dif_source_BBlower > 0.178788 )
									ret := -0.250000
						if( BBupper > 0.897535 )
							ret := 1.000000 // buy
					if( BBupper > 1.08632 )
						ret := -0.400000
		if( BBlower > 0.97049 )
			if( BBupper <= 89.7418 )
				if( dif_source_BBupper <= -4.22747 )
					if( dif_source_BBlower <= -1.80818 )
						if( BBupper <= 18.6934 )
							ret := -1.000000 // sell
						if( BBupper > 18.6934 )
							if( BBlower <= 72.9473 )
								if( BBlower <= 29.3331 )
									ret := 0.900000 // buy
								if( BBlower > 29.3331 )
									ret := 0.650602
							if( BBlower > 72.9473 )
								if( vrsi <= 1.58664 )
									ret := 0.880000 // buy
								if( vrsi > 1.58664 )
									ret := -0.954545 // sell
					if( dif_source_BBlower > -1.80818 )
						if( vrsi <= 23.2926 )
							if( dif_source_BBupper <= -9.2955 )
								if( vrsi <= 11.2643 )
									ret := 0.276596
								if( vrsi > 11.2643 )
									ret := 0.449612
							if( dif_source_BBupper > -9.2955 )
								if( dif_source_BBlower <= 10.8327 )
									ret := 0.033487
								if( dif_source_BBlower > 10.8327 )
									ret := 0.655172
						if( vrsi > 23.2926 )
							if( BBlower <= 32.0278 )
								if( BBupper <= 38.5799 )
									ret := 0.044402
								if( BBupper > 38.5799 )
									ret := 0.692308
							if( BBlower > 32.0278 )
								if( BBupper <= 41.4214 )
									ret := -0.416000
								if( BBupper > 41.4214 )
									ret := -0.026060
				if( dif_source_BBupper > -4.22747 )
					if( vrsi <= 18.9114 )
						if( dif_source_BBlower <= -1.08705 )
							if( dif_source_BBupper <= -4.09685 )
								ret := -0.750000 // sell
							if( dif_source_BBupper > -4.09685 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > -1.08705 )
							if( BBlower <= 12.2708 )
								if( BBupper <= 14.7659 )
									ret := 0.207215
								if( BBupper > 14.7659 )
									ret := 0.777778 // buy
							if( BBlower > 12.2708 )
								if( dif_source_BBlower <= 0.671084 )
									ret := -0.038168
								if( dif_source_BBlower > 0.671084 )
									ret := 0.224777
					if( vrsi > 18.9114 )
						if( BBlower <= 1.59359 )
							if( BBupper <= 1.73195 )
								if( vrsi <= 28.5739 )
									ret := 0.289933
								if( vrsi > 28.5739 )
									ret := 0.096324
							if( BBupper > 1.73195 )
								if( BBlower <= 1.54746 )
									ret := 0.254425
								if( BBlower > 1.54746 )
									ret := 0.465000
						if( BBlower > 1.59359 )
							if( dif_source_BBlower <= 0.030224 )
								if( vrsi <= 44.4942 )
									ret := 0.020288
								if( vrsi > 44.4942 )
									ret := 0.769231 // buy
							if( dif_source_BBlower > 0.030224 )
								if( dif_source_BBupper <= -4.12209 )
									ret := 0.447917
								if( dif_source_BBupper > -4.12209 )
									ret := 0.106630
			if( BBupper > 89.7418 )
				if( dif_source_BBupper <= -4.01433 )
					if( vrsi <= 33.8586 )
						if( BBlower <= 65.0826 )
							if( dif_source_BBupper <= -25.1676 )
								if( BBlower <= 63.1868 )
									ret := -0.333333
								if( BBlower > 63.1868 )
									ret := -0.978723 // sell
							if( dif_source_BBupper > -25.1676 )
								if( dif_source_BBlower <= 12.6242 )
									ret := 0.000000
								if( dif_source_BBlower > 12.6242 )
									ret := 0.736842 // buy
						if( BBlower > 65.0826 )
							if( BBupper <= 101.315 )
								if( BBupper <= 94.6962 )
									ret := -0.044674
								if( BBupper > 94.6962 )
									ret := 0.464706
							if( BBupper > 101.315 )
								if( dif_source_BBlower <= -2.24898 )
									ret := 0.000000
								if( dif_source_BBlower > -2.24898 )
									ret := -0.615385
					if( vrsi > 33.8586 )
						if( BBlower <= 79.6094 )
							if( BBlower <= 77.8405 )
								if( BBlower <= 70.4285 )
									ret := -0.088889
								if( BBlower > 70.4285 )
									ret := -0.420455
							if( BBlower > 77.8405 )
								if( BBupper <= 91.4122 )
									ret := 0.846154 // buy
								if( BBupper > 91.4122 )
									ret := -0.571429
						if( BBlower > 79.6094 )
							if( vrsi <= 39.2759 )
								if( BBupper <= 90.1231 )
									ret := -0.250000
								if( BBupper > 90.1231 )
									ret := -0.886792 // sell
							if( vrsi > 39.2759 )
								if( BBlower <= 83.4014 )
									ret := -0.575000
								if( BBlower > 83.4014 )
									ret := 0.000000
				if( dif_source_BBupper > -4.01433 )
					if( vrsi <= 20.5979 )
						if( dif_source_BBlower <= 8.31641 )
							if( BBupper <= 90.3038 )
								ret := 0.750000 // buy
							if( BBupper > 90.3038 )
								ret := 0.500000
						if( dif_source_BBlower > 8.31641 )
							ret := 0.000000
					if( vrsi > 20.5979 )
						if( dif_source_BBlower <= 2.56019 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 2.56019 )
							if( vrsi <= 41.4071 )
								if( dif_source_BBlower <= 3.02998 )
									ret := -0.090909
								if( dif_source_BBlower > 3.02998 )
									ret := -0.619048
							if( vrsi > 41.4071 )
								if( dif_source_BBupper <= -2.35875 )
									ret := -0.250000
								if( dif_source_BBupper > -2.35875 )
									ret := 0.000000
	if( vrsi > 44.7247 )
		if( vrsi <= 61.4424 )
			if( BBupper <= 65.2403 )
				if( dif_source_BBlower <= 2.59064 )
					if( BBupper <= 17.3761 )
						if( BBlower <= 14.268 )
							if( dif_source_BBlower <= 0.035604 )
								if( BBlower <= 1.12831 )
									ret := 0.315385
								if( BBlower > 1.12831 )
									ret := 0.056604
							if( dif_source_BBlower > 0.035604 )
								if( BBlower <= 0.647709 )
									ret := 0.282723
								if( BBlower > 0.647709 )
									ret := 0.022468
						if( BBlower > 14.268 )
							if( BBlower <= 15.7339 )
								if( dif_source_BBlower <= 1.81631 )
									ret := 0.466667
								if( dif_source_BBlower > 1.81631 )
									ret := 0.016949
							if( BBlower > 15.7339 )
								if( dif_source_BBlower <= 0.987608 )
									ret := -0.619048
								if( dif_source_BBlower > 0.987608 )
									ret := 0.181818
					if( BBupper > 17.3761 )
						if( BBlower <= 14.6289 )
							if( dif_source_BBupper <= -5.28641 )
								if( dif_source_BBupper <= -5.88287 )
									ret := 0.069767
								if( dif_source_BBupper > -5.88287 )
									ret := -0.666667
							if( dif_source_BBupper > -5.28641 )
								if( BBupper <= 19.3357 )
									ret := 0.214286
								if( BBupper > 19.3357 )
									ret := 0.700000 // buy
						if( BBlower > 14.6289 )
							if( BBlower <= 18.1986 )
								if( BBlower <= 16.1623 )
									ret := -0.028926
								if( BBlower > 16.1623 )
									ret := -0.345515
							if( BBlower > 18.1986 )
								if( BBlower <= 21.9987 )
									ret := 0.159664
								if( BBlower > 21.9987 )
									ret := -0.070240
				if( dif_source_BBlower > 2.59064 )
					if( dif_source_BBupper <= 0.98078 )
						if( vrsi <= 45.0836 )
							if( dif_source_BBupper <= -2.94894 )
								if( vrsi <= 44.9975 )
									ret := 0.944444 // buy
								if( vrsi > 44.9975 )
									ret := 0.500000
							if( dif_source_BBupper > -2.94894 )
								if( BBupper <= 42.311 )
									ret := 0.571429
								if( BBupper > 42.311 )
									ret := 0.210526
						if( vrsi > 45.0836 )
							if( dif_source_BBlower <= 11.0634 )
								if( dif_source_BBupper <= -3.11901 )
									ret := 0.042882
								if( dif_source_BBupper > -3.11901 )
									ret := 0.210859
							if( dif_source_BBlower > 11.0634 )
								if( BBlower <= 27.2568 )
									ret := 0.500000
								if( BBlower > 27.2568 )
									ret := -0.339450
					if( dif_source_BBupper > 0.98078 )
						if( dif_source_BBlower <= 10.3682 )
							if( BBlower <= 12.2355 )
								ret := -0.250000
							if( BBlower > 12.2355 )
								if( dif_source_BBupper <= 1.4941 )
									ret := -0.058824
								if( dif_source_BBupper > 1.4941 )
									ret := 0.285714
						if( dif_source_BBlower > 10.3682 )
							if( BBlower <= 48.4466 )
								ret := -1.000000 // sell
							if( BBlower > 48.4466 )
								if( dif_source_BBupper <= 1.99685 )
									ret := -0.250000
								if( dif_source_BBupper > 1.99685 )
									ret := -1.000000 // sell
			if( BBupper > 65.2403 )
				if( dif_source_BBlower <= 1.29947 )
					if( vrsi <= 49.985 )
						if( BBlower <= 74.0425 )
							if( dif_source_BBlower <= 0.226884 )
								if( dif_source_BBupper <= -7.64629 )
									ret := 0.785714 // buy
								if( dif_source_BBupper > -7.64629 )
									ret := 0.000000
							if( dif_source_BBlower > 0.226884 )
								if( dif_source_BBlower <= 1.20449 )
									ret := -0.176471
								if( dif_source_BBlower > 1.20449 )
									ret := 0.285714
						if( BBlower > 74.0425 )
							if( dif_source_BBupper <= -9.12343 )
								if( vrsi <= 49.3941 )
									ret := -0.764706 // sell
								if( vrsi > 49.3941 )
									ret := -0.200000
							if( dif_source_BBupper > -9.12343 )
								ret := 0.000000
					if( vrsi > 49.985 )
						if( dif_source_BBupper <= -6.2803 )
							if( dif_source_BBupper <= -10.2273 )
								if( dif_source_BBlower <= 0.762162 )
									ret := 0.322034
								if( dif_source_BBlower > 0.762162 )
									ret := -0.347826
							if( dif_source_BBupper > -10.2273 )
								if( BBlower <= 81.058 )
									ret := 0.449153
								if( BBlower > 81.058 )
									ret := 0.857143 // buy
						if( dif_source_BBupper > -6.2803 )
							if( BBlower <= 67.5962 )
								if( vrsi <= 60.069 )
									ret := -0.333333
								if( vrsi > 60.069 )
									ret := 0.400000
							if( BBlower > 67.5962 )
								if( vrsi <= 51.8444 )
									ret := 0.700000 // buy
								if( vrsi > 51.8444 )
									ret := 0.102564
				if( dif_source_BBlower > 1.29947 )
					if( dif_source_BBupper <= -28.0169 )
						if( dif_source_BBupper <= -29.059 )
							if( dif_source_BBupper <= -30.9687 )
								ret := 0.750000 // buy
							if( dif_source_BBupper > -30.9687 )
								ret := 1.000000 // buy
						if( dif_source_BBupper > -29.059 )
							ret := 0.600000
					if( dif_source_BBupper > -28.0169 )
						if( dif_source_BBlower <= 17.6429 )
							if( BBupper <= 90 )
								if( dif_source_BBupper <= -4.41751 )
									ret := -0.254545
								if( dif_source_BBupper > -4.41751 )
									ret := -0.043890
							if( BBupper > 90 )
								if( vrsi <= 47.8065 )
									ret := 0.075472
								if( vrsi > 47.8065 )
									ret := -0.437008
						if( dif_source_BBlower > 17.6429 )
							if( dif_source_BBupper <= -2.78395 )
								if( BBupper <= 90.228 )
									ret := 0.863636 // buy
								if( BBupper > 90.228 )
									ret := -0.115385
							if( dif_source_BBupper > -2.78395 )
								if( dif_source_BBlower <= 30.3765 )
									ret := 0.745455 // buy
								if( dif_source_BBlower > 30.3765 )
									ret := 0.045455
		if( vrsi > 61.4424 )
			if( BBlower <= 21.7452 )
				if( dif_source_BBupper <= -0.011813 )
					if( BBlower <= 13.9907 )
						if( dif_source_BBlower <= 5.25033 )
							if( dif_source_BBupper <= -4.89979 )
								if( BBlower <= 6.01712 )
									ret := 0.346154
								if( BBlower > 6.01712 )
									ret := -0.629630
							if( dif_source_BBupper > -4.89979 )
								if( BBupper <= 15.4629 )
									ret := -0.043023
								if( BBupper > 15.4629 )
									ret := 0.127119
						if( dif_source_BBlower > 5.25033 )
							if( BBupper <= 24.9735 )
								if( BBlower <= 8.75483 )
									ret := -0.200000
								if( BBlower > 8.75483 )
									ret := 0.639640
							if( BBupper > 24.9735 )
								if( BBupper <= 25.2131 )
									ret := -0.250000
								if( BBupper > 25.2131 )
									ret := -1.000000 // sell
					if( BBlower > 13.9907 )
						if( dif_source_BBlower <= 5.49394 )
							if( dif_source_BBupper <= -4.61534 )
								if( BBlower <= 18.0482 )
									ret := -0.375000
								if( BBlower > 18.0482 )
									ret := 0.532710
							if( dif_source_BBupper > -4.61534 )
								if( BBlower <= 17.9436 )
									ret := -0.220808
								if( BBlower > 17.9436 )
									ret := -0.047101
						if( dif_source_BBlower > 5.49394 )
							if( vrsi <= 77.5805 )
								if( BBlower <= 21.5317 )
									ret := -0.911111 // sell
								if( BBlower > 21.5317 )
									ret := -0.666667
							if( vrsi > 77.5805 )
								if( dif_source_BBlower <= 5.94777 )
									ret := 0.000000
								if( dif_source_BBlower > 5.94777 )
									ret := -0.666667
				if( dif_source_BBupper > -0.011813 )
					if( BBupper <= 0.956327 )
						if( vrsi <= 98.1507 )
							if( dif_source_BBlower <= 0.066319 )
								if( dif_source_BBlower <= 0.038617 )
									ret := 0.350000
								if( dif_source_BBlower > 0.038617 )
									ret := -0.250000
							if( dif_source_BBlower > 0.066319 )
								if( vrsi <= 66.9789 )
									ret := -0.280000
								if( vrsi > 66.9789 )
									ret := -0.777778 // sell
						if( vrsi > 98.1507 )
							if( dif_source_BBupper <= 0.000748 )
								if( dif_source_BBupper <= -0.000853 )
									ret := -0.863636 // sell
								if( dif_source_BBupper > -0.000853 )
									ret := -0.500000
							if( dif_source_BBupper > 0.000748 )
								ret := -1.000000 // sell
					if( BBupper > 0.956327 )
						if( vrsi <= 79.4567 )
							if( dif_source_BBlower <= 8.43665 )
								if( dif_source_BBupper <= 1.04346 )
									ret := -0.007659
								if( dif_source_BBupper > 1.04346 )
									ret := 0.629630
							if( dif_source_BBlower > 8.43665 )
								if( vrsi <= 71.3806 )
									ret := -0.750000 // sell
								if( vrsi > 71.3806 )
									ret := -1.000000 // sell
						if( vrsi > 79.4567 )
							if( BBupper <= 22.1115 )
								if( BBlower <= 16.217 )
									ret := -0.202838
								if( BBlower > 16.217 )
									ret := 0.354167
							if( BBupper > 22.1115 )
								if( vrsi <= 82.5513 )
									ret := -0.375000
								if( vrsi > 82.5513 )
									ret := -0.857143 // sell
			if( BBlower > 21.7452 )
				if( BBlower <= 76.2692 )
					if( BBupper <= 104.231 )
						if( vrsi <= 87.7671 )
							if( dif_source_BBlower <= 9.37789 )
								if( dif_source_BBupper <= -23.7202 )
									ret := 0.462963
								if( dif_source_BBupper > -23.7202 )
									ret := 0.021155
							if( dif_source_BBlower > 9.37789 )
								if( dif_source_BBlower <= 15.1022 )
									ret := 0.294197
								if( dif_source_BBlower > 15.1022 )
									ret := -0.103734
						if( vrsi > 87.7671 )
							if( BBupper <= 93.6742 )
								if( dif_source_BBlower <= 5.25097 )
									ret := 0.044211
								if( dif_source_BBlower > 5.25097 )
									ret := -0.141236
							if( BBupper > 93.6742 )
								if( dif_source_BBupper <= -19.9302 )
									ret := -0.333333
								if( dif_source_BBupper > -19.9302 )
									ret := -0.853659 // sell
					if( BBupper > 104.231 )
						if( BBupper <= 104.541 )
							ret := -0.500000
						if( BBupper > 104.541 )
							if( vrsi <= 67.6536 )
								ret := -0.750000 // sell
							if( vrsi > 67.6536 )
								ret := -1.000000 // sell
				if( BBlower > 76.2692 )
					if( BBupper <= 90.3705 )
						if( BBlower <= 79.6422 )
							if( dif_source_BBupper <= -6.33224 )
								if( dif_source_BBlower <= 4.26971 )
									ret := -0.142857
								if( dif_source_BBlower > 4.26971 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -6.33224 )
								if( dif_source_BBlower <= 9.25849 )
									ret := -0.253333
								if( dif_source_BBlower > 9.25849 )
									ret := -0.947368 // sell
						if( BBlower > 79.6422 )
							if( dif_source_BBlower <= 2.6927 )
								if( vrsi <= 81.4972 )
									ret := 0.638889
								if( vrsi > 81.4972 )
									ret := 0.166667
							if( dif_source_BBlower > 2.6927 )
								if( BBupper <= 88.7228 )
									ret := 0.287671
								if( BBupper > 88.7228 )
									ret := -0.250000
					if( BBupper > 90.3705 )
						if( dif_source_BBlower <= 2.21508 )
							if( dif_source_BBlower <= -2.09433 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > -2.09433 )
								if( BBupper <= 94.7307 )
									ret := -0.055556
								if( BBupper > 94.7307 )
									ret := 0.500000
						if( dif_source_BBlower > 2.21508 )
							if( dif_source_BBlower <= 9.19718 )
								if( BBlower <= 83.6007 )
									ret := -0.883333 // sell
								if( BBlower > 83.6007 )
									ret := -0.541667
							if( dif_source_BBlower > 9.19718 )
								if( BBupper <= 91.518 )
									ret := -0.500000
								if( BBupper > 91.518 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_APPS_15Min_f125b95f(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


