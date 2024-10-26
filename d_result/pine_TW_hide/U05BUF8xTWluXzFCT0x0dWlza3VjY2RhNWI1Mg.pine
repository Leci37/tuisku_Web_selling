//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: SNAP_1Min_1BOL_ccda5b52 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1BOL_ccda5b52", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_ccda5b52(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 47.8208 )
		if( BBlower <= 15.0562 )
			if( BBupper <= 8.74974 )
				if( dif_source_BBupper <= -0.13586 )
					if( vrsi <= 13.7089 )
						if( dif_source_BBupper <= -0.139624 )
							if( dif_source_BBlower <= -0.013513 )
								if( BBupper <= 8.59965 )
									ret := 0.000000
								if( BBupper > 8.59965 )
									ret := 0.650000
							if( dif_source_BBlower > -0.013513 )
								if( BBupper <= 8.59638 )
									ret := 0.888889 // buy
								if( BBupper > 8.59638 )
									ret := 0.562500
						if( dif_source_BBupper > -0.139624 )
							ret := -0.500000
					if( vrsi > 13.7089 )
						if( BBlower <= 8.25584 )
							if( BBlower <= 8.23454 )
								ret := 0.250000
							if( BBlower > 8.23454 )
								if( dif_source_BBupper <= -0.203702 )
									ret := 0.333333
								if( dif_source_BBupper > -0.203702 )
									ret := 1.000000 // buy
						if( BBlower > 8.25584 )
							if( vrsi <= 28.0488 )
								if( dif_source_BBupper <= -0.232502 )
									ret := 0.619048
								if( dif_source_BBupper > -0.232502 )
									ret := 0.053191
							if( vrsi > 28.0488 )
								if( vrsi <= 47.1765 )
									ret := -0.219697
								if( vrsi > 47.1765 )
									ret := 0.750000 // buy
				if( dif_source_BBupper > -0.13586 )
					if( vrsi <= 33.1573 )
						if( BBlower <= 8.41944 )
							if( BBlower <= 8.33587 )
								if( dif_source_BBupper <= -0.0735 )
									ret := 0.227273
								if( dif_source_BBupper > -0.0735 )
									ret := 0.619048
							if( BBlower > 8.33587 )
								if( BBupper <= 8.70831 )
									ret := 1.000000 // buy
								if( BBupper > 8.70831 )
									ret := 0.750000 // buy
						if( BBlower > 8.41944 )
							if( BBlower <= 8.54419 )
								if( vrsi <= 20.0494 )
									ret := 0.131579
								if( vrsi > 20.0494 )
									ret := -0.125000
							if( BBlower > 8.54419 )
								if( vrsi <= 17.8201 )
									ret := 0.827586 // buy
								if( vrsi > 17.8201 )
									ret := 0.055556
					if( vrsi > 33.1573 )
						if( vrsi <= 41.5154 )
							if( dif_source_BBupper <= -0.00694 )
								if( dif_source_BBlower <= 0.143341 )
									ret := 0.597884
								if( dif_source_BBlower > 0.143341 )
									ret := 0.779412 // buy
							if( dif_source_BBupper > -0.00694 )
								if( BBlower <= 8.23382 )
									ret := -0.750000 // sell
								if( BBlower > 8.23382 )
									ret := 0.000000
						if( vrsi > 41.5154 )
							if( BBupper <= 8.62547 )
								if( dif_source_BBlower <= 0.184035 )
									ret := 0.812500 // buy
								if( dif_source_BBlower > 0.184035 )
									ret := 0.058824
							if( BBupper > 8.62547 )
								if( vrsi <= 44.4073 )
									ret := -0.450000
								if( vrsi > 44.4073 )
									ret := 0.411765
			if( BBupper > 8.74974 )
				if( dif_source_BBlower <= 0.504927 )
					if( BBupper <= 15.5221 )
						if( BBlower <= 14.8614 )
							if( vrsi <= 20.1332 )
								if( BBlower <= 13.7371 )
									ret := 0.141014
								if( BBlower > 13.7371 )
									ret := 0.319350
							if( vrsi > 20.1332 )
								if( BBupper <= 10.7406 )
									ret := 0.143926
								if( BBupper > 10.7406 )
									ret := 0.047242
						if( BBlower > 14.8614 )
							if( dif_source_BBlower <= 0.03794 )
								if( dif_source_BBupper <= -0.210254 )
									ret := 0.619565
								if( dif_source_BBupper > -0.210254 )
									ret := 0.151515
							if( dif_source_BBlower > 0.03794 )
								if( dif_source_BBupper <= -0.432206 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -0.432206 )
									ret := 0.224886
					if( BBupper > 15.5221 )
						if( dif_source_BBupper <= -0.737466 )
							if( vrsi <= 25.1927 )
								if( BBupper <= 15.9242 )
									ret := 0.875000 // buy
								if( BBupper > 15.9242 )
									ret := 0.166667
							if( vrsi > 25.1927 )
								ret := 0.000000
						if( dif_source_BBupper > -0.737466 )
							if( BBlower <= 14.8178 )
								if( dif_source_BBupper <= -0.709469 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > -0.709469 )
									ret := -1.000000 // sell
							if( BBlower > 14.8178 )
								if( BBlower <= 14.9797 )
									ret := -0.523810
								if( BBlower > 14.9797 )
									ret := -0.294118
				if( dif_source_BBlower > 0.504927 )
					if( BBlower <= 10.2897 )
						if( vrsi <= 36.1211 )
							if( BBupper <= 14.2906 )
								if( dif_source_BBupper <= -2.45359 )
									ret := -0.320000
								if( dif_source_BBupper > -2.45359 )
									ret := 0.387097
							if( BBupper > 14.2906 )
								if( vrsi <= 17.9324 )
									ret := -0.250000
								if( vrsi > 17.9324 )
									ret := 0.965517 // buy
						if( vrsi > 36.1211 )
							if( dif_source_BBlower <= 3.90248 )
								if( BBupper <= 9.53987 )
									ret := 0.636364
								if( BBupper > 9.53987 )
									ret := -0.142857
							if( dif_source_BBlower > 3.90248 )
								if( BBlower <= 9.77121 )
									ret := 0.000000
								if( BBlower > 9.77121 )
									ret := -0.964286 // sell
					if( BBlower > 10.2897 )
						if( BBupper <= 15.9166 )
							if( dif_source_BBupper <= -0.039337 )
								if( BBupper <= 14.1781 )
									ret := 0.180488
								if( BBupper > 14.1781 )
									ret := 0.403614
							if( dif_source_BBupper > -0.039337 )
								if( vrsi <= 28.7347 )
									ret := 0.825397 // buy
								if( vrsi > 28.7347 )
									ret := 0.403509
						if( BBupper > 15.9166 )
							if( vrsi <= 35.0224 )
								if( BBlower <= 12.8445 )
									ret := 1.000000 // buy
								if( BBlower > 12.8445 )
									ret := 0.285714
							if( vrsi > 35.0224 )
								if( BBupper <= 15.9509 )
									ret := -0.944444 // sell
								if( BBupper > 15.9509 )
									ret := -0.111111
		if( BBlower > 15.0562 )
			if( dif_source_BBlower <= -0.04889 )
				if( dif_source_BBupper <= -0.458284 )
					if( BBlower <= 16.109 )
						if( BBlower <= 15.4999 )
							if( vrsi <= 31.1765 )
								if( dif_source_BBlower <= -0.055022 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.055022 )
									ret := 0.500000
							if( vrsi > 31.1765 )
								ret := 0.500000
						if( BBlower > 15.4999 )
							if( dif_source_BBlower <= -0.054501 )
								if( BBlower <= 15.6038 )
									ret := 0.466667
								if( BBlower > 15.6038 )
									ret := 0.778689 // buy
							if( dif_source_BBlower > -0.054501 )
								if( BBupper <= 16.3826 )
									ret := 0.142857
								if( BBupper > 16.3826 )
									ret := -0.250000
					if( BBlower > 16.109 )
						if( BBlower <= 16.4432 )
							if( vrsi <= 1.73297 )
								if( dif_source_BBlower <= -0.175626 )
									ret := 0.800000 // buy
								if( dif_source_BBlower > -0.175626 )
									ret := 1.000000 // buy
							if( vrsi > 1.73297 )
								if( BBupper <= 16.8507 )
									ret := -0.212121
								if( BBupper > 16.8507 )
									ret := 0.382353
						if( BBlower > 16.4432 )
							if( vrsi <= 3.65162 )
								ret := -1.000000 // sell
							if( vrsi > 3.65162 )
								if( vrsi <= 10.6087 )
									ret := 0.500000
								if( vrsi > 10.6087 )
									ret := 0.923077 // buy
				if( dif_source_BBupper > -0.458284 )
					if( BBlower <= 16.2264 )
						if( BBupper <= 16.4867 )
							if( BBupper <= 16.4096 )
								if( BBlower <= 15.6675 )
									ret := 0.386792
								if( BBlower > 15.6675 )
									ret := 0.054945
							if( BBupper > 16.4096 )
								ret := -1.000000 // sell
						if( BBupper > 16.4867 )
							ret := 1.000000 // buy
					if( BBlower > 16.2264 )
						if( BBupper <= 16.7819 )
							if( dif_source_BBlower <= -0.074585 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > -0.074585 )
								ret := -0.600000
						if( BBupper > 16.7819 )
							if( vrsi <= 1.34701 )
								ret := 0.666667
							if( vrsi > 1.34701 )
								if( BBupper <= 16.861 )
									ret := -0.722222 // sell
								if( BBupper > 16.861 )
									ret := -0.100000
			if( dif_source_BBlower > -0.04889 )
				if( BBlower <= 15.5159 )
					if( BBupper <= 15.4247 )
						if( dif_source_BBupper <= -0.120918 )
							if( BBupper <= 15.3687 )
								if( BBlower <= 15.0612 )
									ret := -0.600000
								if( BBlower > 15.0612 )
									ret := -0.019499
							if( BBupper > 15.3687 )
								if( dif_source_BBlower <= 0.048814 )
									ret := 0.362069
								if( dif_source_BBlower > 0.048814 )
									ret := 0.031915
						if( dif_source_BBupper > -0.120918 )
							if( BBlower <= 15.1049 )
								if( BBupper <= 15.39 )
									ret := -0.050000
								if( BBupper > 15.39 )
									ret := 0.875000 // buy
							if( BBlower > 15.1049 )
								if( dif_source_BBlower <= 0.184448 )
									ret := 0.284615
								if( dif_source_BBlower > 0.184448 )
									ret := 0.793103 // buy
					if( BBupper > 15.4247 )
						if( dif_source_BBupper <= -0.063566 )
							if( BBlower <= 15.2208 )
								if( dif_source_BBupper <= -0.33361 )
									ret := 0.234783
								if( dif_source_BBupper > -0.33361 )
									ret := -0.041850
							if( BBlower > 15.2208 )
								if( vrsi <= 9.98368 )
									ret := -0.254613
								if( vrsi > 9.98368 )
									ret := -0.100153
						if( dif_source_BBupper > -0.063566 )
							if( BBupper <= 15.7971 )
								if( BBlower <= 15.2525 )
									ret := -0.282051
								if( BBlower > 15.2525 )
									ret := 0.243523
							if( BBupper > 15.7971 )
								if( BBlower <= 15.4206 )
									ret := 0.230769
								if( BBlower > 15.4206 )
									ret := -0.750000 // sell
				if( BBlower > 15.5159 )
					if( BBupper <= 16.9592 )
						if( vrsi <= 37.4998 )
							if( dif_source_BBlower <= 0.294985 )
								if( BBupper <= 16.1824 )
									ret := 0.236174
								if( BBupper > 16.1824 )
									ret := 0.123471
							if( dif_source_BBlower > 0.294985 )
								if( vrsi <= 12.9887 )
									ret := -0.337662
								if( vrsi > 12.9887 )
									ret := 0.120792
						if( vrsi > 37.4998 )
							if( BBlower <= 16.4787 )
								if( BBlower <= 16.1965 )
									ret := 0.014226
								if( BBlower > 16.1965 )
									ret := 0.205357
							if( BBlower > 16.4787 )
								if( vrsi <= 47.2067 )
									ret := -0.251256
								if( vrsi > 47.2067 )
									ret := 0.700000 // buy
					if( BBupper > 16.9592 )
						if( vrsi <= 35.1409 )
							if( BBlower <= 16.3006 )
								if( BBlower <= 15.7254 )
									ret := -0.666667
								if( BBlower > 15.7254 )
									ret := 0.612903
							if( BBlower > 16.3006 )
								if( dif_source_BBupper <= -0.175515 )
									ret := 0.008876
								if( dif_source_BBupper > -0.175515 )
									ret := -0.238095
						if( vrsi > 35.1409 )
							if( vrsi <= 45.4966 )
								if( BBlower <= 16.4223 )
									ret := -0.455556
								if( BBlower > 16.4223 )
									ret := -0.032558
							if( vrsi > 45.4966 )
								if( dif_source_BBlower <= 0.537746 )
									ret := -0.660000
								if( dif_source_BBlower > 0.537746 )
									ret := 0.454545
	if( vrsi > 47.8208 )
		if( dif_source_BBlower <= 0.060076 )
			if( BBupper <= 10.6671 )
				if( vrsi <= 62.5634 )
					if( BBupper <= 8.62407 )
						if( dif_source_BBlower <= 0.048663 )
							if( BBupper <= 8.53468 )
								if( BBlower <= 8.31151 )
									ret := -0.093750
								if( BBlower > 8.31151 )
									ret := 0.750000 // buy
							if( BBupper > 8.53468 )
								if( dif_source_BBupper <= -0.154183 )
									ret := -0.700000 // sell
								if( dif_source_BBupper > -0.154183 )
									ret := -0.100000
						if( dif_source_BBlower > 0.048663 )
							if( dif_source_BBlower <= 0.05535 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 0.05535 )
								ret := 0.000000
					if( BBupper > 8.62407 )
						if( BBlower <= 8.94122 )
							if( dif_source_BBlower <= 0.028061 )
								if( vrsi <= 53.9797 )
									ret := 0.164948
								if( vrsi > 53.9797 )
									ret := 0.545455
							if( dif_source_BBlower > 0.028061 )
								if( dif_source_BBupper <= -0.055973 )
									ret := -0.078838
								if( dif_source_BBupper > -0.055973 )
									ret := 0.343750
						if( BBlower > 8.94122 )
							if( dif_source_BBupper <= -0.251626 )
								if( dif_source_BBupper <= -0.378979 )
									ret := 0.136364
								if( dif_source_BBupper > -0.378979 )
									ret := -0.320755
							if( dif_source_BBupper > -0.251626 )
								if( BBlower <= 9.26852 )
									ret := -0.059490
								if( BBlower > 9.26852 )
									ret := 0.118537
				if( vrsi > 62.5634 )
					if( dif_source_BBupper <= -0.540717 )
						if( BBupper <= 9.75982 )
							if( dif_source_BBlower <= -0.013145 )
								if( dif_source_BBlower <= -0.075334 )
									ret := 0.857143 // buy
								if( dif_source_BBlower > -0.075334 )
									ret := 0.400000
							if( dif_source_BBlower > -0.013145 )
								if( BBupper <= 9.29354 )
									ret := 1.000000 // buy
								if( BBupper > 9.29354 )
									ret := 0.750000 // buy
						if( BBupper > 9.75982 )
							if( vrsi <= 75.5026 )
								ret := 0.250000
							if( vrsi > 75.5026 )
								ret := -0.250000
					if( dif_source_BBupper > -0.540717 )
						if( BBlower <= 8.75657 )
							if( dif_source_BBupper <= -0.097258 )
								if( vrsi <= 66.4891 )
									ret := 0.352941
								if( vrsi > 66.4891 )
									ret := -0.119205
							if( dif_source_BBupper > -0.097258 )
								if( dif_source_BBlower <= 0.04601 )
									ret := 0.911765 // buy
								if( dif_source_BBlower > 0.04601 )
									ret := 0.270270
						if( BBlower > 8.75657 )
							if( vrsi <= 62.7389 )
								if( BBupper <= 9.41419 )
									ret := -0.933333 // sell
								if( BBupper > 9.41419 )
									ret := 0.000000
							if( vrsi > 62.7389 )
								if( BBlower <= 8.91711 )
									ret := -0.397849
								if( BBlower > 8.91711 )
									ret := -0.068852
			if( BBupper > 10.6671 )
				if( dif_source_BBlower <= -0.094326 )
					if( BBupper <= 13.3276 )
						ret := -0.142857
					if( BBupper > 13.3276 )
						if( BBlower <= 15.0886 )
							if( vrsi <= 89.9915 )
								if( BBupper <= 13.9024 )
									ret := 0.800000 // buy
								if( BBupper > 13.9024 )
									ret := 1.000000 // buy
							if( vrsi > 89.9915 )
								ret := 0.500000
						if( BBlower > 15.0886 )
							if( BBupper <= 16.8397 )
								if( vrsi <= 61.4678 )
									ret := -0.333333
								if( vrsi > 61.4678 )
									ret := 0.750000 // buy
							if( BBupper > 16.8397 )
								if( dif_source_BBupper <= -0.749338 )
									ret := 0.375000
								if( dif_source_BBupper > -0.749338 )
									ret := 1.000000 // buy
				if( dif_source_BBlower > -0.094326 )
					if( dif_source_BBupper <= -0.432348 )
						if( dif_source_BBlower <= 0.026817 )
							if( BBupper <= 17.007 )
								if( BBupper <= 15.4683 )
									ret := 0.219780
								if( BBupper > 15.4683 )
									ret := -0.106952
							if( BBupper > 17.007 )
								if( BBupper <= 17.235 )
									ret := 0.933333 // buy
								if( BBupper > 17.235 )
									ret := 0.500000
						if( dif_source_BBlower > 0.026817 )
							if( BBupper <= 16.9795 )
								if( BBlower <= 10.1624 )
									ret := -0.800000 // sell
								if( BBlower > 10.1624 )
									ret := -0.135021
							if( BBupper > 16.9795 )
								if( BBlower <= 16.6191 )
									ret := 1.000000 // buy
								if( BBlower > 16.6191 )
									ret := -0.090909
					if( dif_source_BBupper > -0.432348 )
						if( BBlower <= 10.5458 )
							if( dif_source_BBlower <= -0.005019 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -0.005019 )
								if( BBlower <= 10.5155 )
									ret := 0.417910
								if( BBlower > 10.5155 )
									ret := 0.782609 // buy
						if( BBlower > 10.5458 )
							if( dif_source_BBlower <= -0.00158 )
								if( BBupper <= 10.9239 )
									ret := -0.578947
								if( BBupper > 10.9239 )
									ret := 0.361868
							if( dif_source_BBlower > -0.00158 )
								if( BBupper <= 16.4328 )
									ret := 0.123260
								if( BBupper > 16.4328 )
									ret := 0.247678
		if( dif_source_BBlower > 0.060076 )
			if( dif_source_BBupper <= -0.034966 )
				if( BBlower <= 15.6587 )
					if( BBlower <= 15.1585 )
						if( vrsi <= 69.2731 )
							if( BBlower <= 13.2039 )
								if( dif_source_BBlower <= 0.350411 )
									ret := 0.049765
								if( dif_source_BBlower > 0.350411 )
									ret := 0.195480
							if( BBlower > 13.2039 )
								if( BBlower <= 14.2354 )
									ret := -0.161606
								if( BBlower > 14.2354 )
									ret := -0.005056
						if( vrsi > 69.2731 )
							if( dif_source_BBlower <= 0.351874 )
								if( BBupper <= 9.05615 )
									ret := 0.046077
								if( BBupper > 9.05615 )
									ret := -0.087451
							if( dif_source_BBlower > 0.351874 )
								if( vrsi <= 72.6361 )
									ret := -0.130682
								if( vrsi > 72.6361 )
									ret := 0.101464
					if( BBlower > 15.1585 )
						if( BBupper <= 16.0448 )
							if( BBupper <= 15.6834 )
								if( vrsi <= 77.4758 )
									ret := -0.060932
								if( vrsi > 77.4758 )
									ret := 0.166667
							if( BBupper > 15.6834 )
								if( dif_source_BBlower <= 0.095447 )
									ret := -0.100000
								if( dif_source_BBlower > 0.095447 )
									ret := 0.269024
						if( BBupper > 16.0448 )
							if( dif_source_BBupper <= -0.367809 )
								if( BBlower <= 15.6336 )
									ret := -0.276382
								if( BBlower > 15.6336 )
									ret := 0.073171
							if( dif_source_BBupper > -0.367809 )
								if( dif_source_BBlower <= 0.686326 )
									ret := 0.127586
								if( dif_source_BBlower > 0.686326 )
									ret := -0.600000
				if( BBlower > 15.6587 )
					if( BBupper <= 17.2775 )
						if( vrsi <= 80.0419 )
							if( vrsi <= 77.7808 )
								if( vrsi <= 74.9664 )
									ret := -0.079143
								if( vrsi > 74.9664 )
									ret := 0.119186
							if( vrsi > 77.7808 )
								if( vrsi <= 78.2514 )
									ret := -0.717949 // sell
								if( vrsi > 78.2514 )
									ret := -0.226994
						if( vrsi > 80.0419 )
							if( vrsi <= 96.1492 )
								if( BBupper <= 16.9383 )
									ret := 0.029024
								if( BBupper > 16.9383 )
									ret := 0.304348
							if( vrsi > 96.1492 )
								if( BBupper <= 16.3304 )
									ret := 0.241379
								if( BBupper > 16.3304 )
									ret := -0.251012
					if( BBupper > 17.2775 )
						if( dif_source_BBlower <= 0.144748 )
							if( BBupper <= 17.2829 )
								ret := -1.000000 // sell
							if( BBupper > 17.2829 )
								if( dif_source_BBlower <= 0.121189 )
									ret := 0.545455
								if( dif_source_BBlower > 0.121189 )
									ret := -0.058824
						if( dif_source_BBlower > 0.144748 )
							if( BBupper <= 17.3503 )
								if( dif_source_BBupper <= -0.221733 )
									ret := -0.092593
								if( dif_source_BBupper > -0.221733 )
									ret := -0.666667
							if( BBupper > 17.3503 )
								if( dif_source_BBupper <= -0.980576 )
									ret := -0.200000
								if( dif_source_BBupper > -0.980576 )
									ret := -0.818182 // sell
			if( dif_source_BBupper > -0.034966 )
				if( BBupper <= 16.0647 )
					if( dif_source_BBupper <= 0.042111 )
						if( BBupper <= 8.57029 )
							if( vrsi <= 80.0602 )
								if( dif_source_BBupper <= 0.018621 )
									ret := 0.418182
								if( dif_source_BBupper > 0.018621 )
									ret := -0.066667
							if( vrsi > 80.0602 )
								if( vrsi <= 86.6071 )
									ret := -0.466667
								if( vrsi > 86.6071 )
									ret := 0.000000
						if( BBupper > 8.57029 )
							if( BBlower <= 8.88905 )
								if( BBupper <= 8.8918 )
									ret := -0.020635
								if( BBupper > 8.8918 )
									ret := -0.337920
							if( BBlower > 8.88905 )
								if( BBlower <= 9.1905 )
									ret := 0.084652
								if( BBlower > 9.1905 )
									ret := -0.099154
					if( dif_source_BBupper > 0.042111 )
						if( BBupper <= 9.10649 )
							if( vrsi <= 94.4947 )
								if( vrsi <= 92.5824 )
									ret := -0.469136
								if( vrsi > 92.5824 )
									ret := 0.800000 // buy
							if( vrsi > 94.4947 )
								if( dif_source_BBlower <= 0.211005 )
									ret := -0.750000 // sell
								if( dif_source_BBlower > 0.211005 )
									ret := -0.956522 // sell
						if( BBupper > 9.10649 )
							if( BBlower <= 11.1312 )
								if( dif_source_BBlower <= 0.27638 )
									ret := -0.193548
								if( dif_source_BBlower > 0.27638 )
									ret := 0.068127
							if( BBlower > 11.1312 )
								if( BBlower <= 13.1667 )
									ret := -0.824176 // sell
								if( BBlower > 13.1667 )
									ret := -0.178019
				if( BBupper > 16.0647 )
					if( BBlower <= 16.0758 )
						if( BBlower <= 15.7867 )
							if( dif_source_BBupper <= 0.044965 )
								if( vrsi <= 77.114 )
									ret := -0.202899
								if( vrsi > 77.114 )
									ret := 0.355556
							if( dif_source_BBupper > 0.044965 )
								if( vrsi <= 53.6234 )
									ret := 0.250000
								if( vrsi > 53.6234 )
									ret := -0.451613
						if( BBlower > 15.7867 )
							if( vrsi <= 96.3599 )
								if( dif_source_BBlower <= 0.513806 )
									ret := 0.088889
								if( dif_source_BBlower > 0.513806 )
									ret := 0.425287
							if( vrsi > 96.3599 )
								if( BBupper <= 16.1588 )
									ret := 0.947368 // buy
								if( BBupper > 16.1588 )
									ret := 0.421053
					if( BBlower > 16.0758 )
						if( dif_source_BBlower <= 0.66656 )
							if( dif_source_BBupper <= 0.04999 )
								if( vrsi <= 48.8119 )
									ret := -0.928571 // sell
								if( vrsi > 48.8119 )
									ret := 0.013106
							if( dif_source_BBupper > 0.04999 )
								if( BBlower <= 16.1526 )
									ret := -0.806452 // sell
								if( BBlower > 16.1526 )
									ret := -0.271028
						if( dif_source_BBlower > 0.66656 )
							if( dif_source_BBlower <= 0.703925 )
								if( dif_source_BBupper <= 0.008321 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > 0.008321 )
									ret := -1.000000 // sell
							if( dif_source_BBlower > 0.703925 )
								if( vrsi <= 69.7826 )
									ret := 0.285714
								if( vrsi > 69.7826 )
									ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_ccda5b52(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)

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


