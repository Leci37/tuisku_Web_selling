//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: AFRM_1Min_1BOL_ab038fc0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1BOL_ab038fc0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_ab038fc0(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 51.8697 )
		if( dif_source_BBlower <= 0.23303 )
			if( vrsi <= 12.9051 )
				if( BBlower <= 43.8727 )
					if( dif_source_BBupper <= -4.67059 )
						if( BBupper <= 37.9973 )
							ret := 1.000000 // buy
						if( BBupper > 37.9973 )
							ret := 0.250000
					if( dif_source_BBupper > -4.67059 )
						if( BBupper <= 31.5619 )
							if( dif_source_BBlower <= -0.132344 )
								if( BBlower <= 30.151 )
									ret := 0.412500
								if( BBlower > 30.151 )
									ret := -0.390244
							if( dif_source_BBlower > -0.132344 )
								if( BBlower <= 30.3021 )
									ret := -0.034240
								if( BBlower > 30.3021 )
									ret := -0.364198
						if( BBupper > 31.5619 )
							if( BBlower <= 31.5041 )
								if( dif_source_BBupper <= -1.5715 )
									ret := 0.070423
								if( dif_source_BBupper > -1.5715 )
									ret := 0.486486
							if( BBlower > 31.5041 )
								if( dif_source_BBupper <= -0.887722 )
									ret := -0.026049
								if( dif_source_BBupper > -0.887722 )
									ret := 0.263021
				if( BBlower > 43.8727 )
					if( dif_source_BBupper <= -2.17134 )
						ret := 0.800000 // buy
					if( dif_source_BBupper > -2.17134 )
						if( BBlower <= 44.4291 )
							if( BBupper <= 45.8081 )
								if( BBupper <= 45.172 )
									ret := -0.363636
								if( BBupper > 45.172 )
									ret := -0.904762 // sell
							if( BBupper > 45.8081 )
								ret := 0.600000
						if( BBlower > 44.4291 )
							if( dif_source_BBlower <= -0.177749 )
								if( vrsi <= 6.72795 )
									ret := -1.000000 // sell
								if( vrsi > 6.72795 )
									ret := -0.500000
							if( dif_source_BBlower > -0.177749 )
								if( vrsi <= 3.5334 )
									ret := 0.187500
								if( vrsi > 3.5334 )
									ret := -0.176471
			if( vrsi > 12.9051 )
				if( dif_source_BBupper <= -4.02602 )
					if( dif_source_BBlower <= -0.151636 )
						if( BBlower <= 33.4678 )
							if( BBupper <= 27.0003 )
								ret := -0.250000
							if( BBupper > 27.0003 )
								if( vrsi <= 44.9021 )
									ret := 1.000000 // buy
								if( vrsi > 44.9021 )
									ret := 0.000000
						if( BBlower > 33.4678 )
							if( dif_source_BBlower <= -0.647847 )
								ret := -0.500000
							if( dif_source_BBlower > -0.647847 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > -0.151636 )
						if( dif_source_BBupper <= -6.14386 )
							ret := 0.142857
						if( dif_source_BBupper > -6.14386 )
							if( dif_source_BBlower <= 0.108272 )
								if( dif_source_BBlower <= 0.036455 )
									ret := -0.909091 // sell
								if( dif_source_BBlower > 0.036455 )
									ret := -0.357143
							if( dif_source_BBlower > 0.108272 )
								if( dif_source_BBupper <= -5.7212 )
									ret := -0.833333 // sell
								if( dif_source_BBupper > -5.7212 )
									ret := -1.000000 // sell
				if( dif_source_BBupper > -4.02602 )
					if( dif_source_BBupper <= -2.62057 )
						if( BBlower <= 23.7496 )
							if( dif_source_BBupper <= -3.80225 )
								ret := -0.250000
							if( dif_source_BBupper > -3.80225 )
								ret := 0.000000
						if( BBlower > 23.7496 )
							if( dif_source_BBlower <= 0.191581 )
								if( vrsi <= 42.4576 )
									ret := 0.729508 // buy
								if( vrsi > 42.4576 )
									ret := 0.121212
							if( dif_source_BBlower > 0.191581 )
								ret := -0.500000
					if( dif_source_BBupper > -2.62057 )
						if( BBupper <= 32.2875 )
							if( BBupper <= 31.9352 )
								if( BBlower <= 24.1448 )
									ret := 0.556604
								if( BBlower > 24.1448 )
									ret := 0.153938
							if( BBupper > 31.9352 )
								if( vrsi <= 22.2207 )
									ret := 0.734043 // buy
								if( vrsi > 22.2207 )
									ret := 0.335821
						if( BBupper > 32.2875 )
							if( BBupper <= 32.738 )
								if( dif_source_BBlower <= -0.147892 )
									ret := -0.439252
								if( dif_source_BBlower > -0.147892 )
									ret := -0.077574
							if( BBupper > 32.738 )
								if( BBlower <= 31.0751 )
									ret := 0.591837
								if( BBlower > 31.0751 )
									ret := 0.120631
		if( dif_source_BBlower > 0.23303 )
			if( BBlower <= 24.0708 )
				if( BBupper <= 26.4439 )
					if( vrsi <= 50.0754 )
						if( BBupper <= 24.8174 )
							if( dif_source_BBupper <= -0.539107 )
								if( dif_source_BBlower <= 2.70611 )
									ret := 0.947368 // buy
								if( dif_source_BBlower > 2.70611 )
									ret := 0.166667
							if( dif_source_BBupper > -0.539107 )
								if( BBupper <= 24.7593 )
									ret := -0.894737 // sell
								if( BBupper > 24.7593 )
									ret := -0.500000
						if( BBupper > 24.8174 )
							if( vrsi <= 46.0822 )
								if( vrsi <= 45.2583 )
									ret := 0.321503
								if( vrsi > 45.2583 )
									ret := -0.764706 // sell
							if( vrsi > 46.0822 )
								if( vrsi <= 49.9878 )
									ret := 0.756757 // buy
								if( vrsi > 49.9878 )
									ret := 0.250000
					if( vrsi > 50.0754 )
						if( dif_source_BBupper <= -1.36976 )
							ret := -1.000000 // sell
						if( dif_source_BBupper > -1.36976 )
							if( BBupper <= 25.127 )
								ret := -1.000000 // sell
							if( BBupper > 25.127 )
								ret := 0.000000
				if( BBupper > 26.4439 )
					if( BBupper <= 26.5313 )
						if( vrsi <= 21.1233 )
							if( dif_source_BBlower <= 1.21999 )
								if( vrsi <= 8.9502 )
									ret := -0.666667
								if( vrsi > 8.9502 )
									ret := -1.000000 // sell
							if( dif_source_BBlower > 1.21999 )
								ret := -1.000000 // sell
						if( vrsi > 21.1233 )
							ret := -0.200000
					if( BBupper > 26.5313 )
						if( dif_source_BBlower <= 0.536985 )
							if( BBupper <= 27.0064 )
								if( vrsi <= 9.76308 )
									ret := -0.500000
								if( vrsi > 9.76308 )
									ret := 0.500000
							if( BBupper > 27.0064 )
								if( BBupper <= 27.2981 )
									ret := -1.000000 // sell
								if( BBupper > 27.2981 )
									ret := -0.666667
						if( dif_source_BBlower > 0.536985 )
							if( dif_source_BBlower <= 1.83876 )
								if( vrsi <= 15.0945 )
									ret := 1.000000 // buy
								if( vrsi > 15.0945 )
									ret := 0.609756
							if( dif_source_BBlower > 1.83876 )
								if( vrsi <= 42.8379 )
									ret := -1.000000 // sell
								if( vrsi > 42.8379 )
									ret := -0.750000 // sell
			if( BBlower > 24.0708 )
				if( dif_source_BBupper <= -3.43192 )
					if( dif_source_BBupper <= -3.9956 )
						if( BBupper <= 37.0705 )
							if( dif_source_BBlower <= 1.80213 )
								if( dif_source_BBlower <= 1.62081 )
									ret := 0.000000
								if( dif_source_BBlower > 1.62081 )
									ret := 0.454545
							if( dif_source_BBlower > 1.80213 )
								ret := -0.666667
						if( BBupper > 37.0705 )
							if( vrsi <= 34.2136 )
								if( dif_source_BBlower <= 0.423541 )
									ret := -0.200000
								if( dif_source_BBlower > 0.423541 )
									ret := -0.800000 // sell
							if( vrsi > 34.2136 )
								if( dif_source_BBupper <= -5.85849 )
									ret := 0.600000
								if( dif_source_BBupper > -5.85849 )
									ret := -0.714286 // sell
					if( dif_source_BBupper > -3.9956 )
						if( dif_source_BBlower <= 0.352722 )
							ret := -0.500000
						if( dif_source_BBlower > 0.352722 )
							if( BBlower <= 29.6521 )
								if( dif_source_BBlower <= 0.426732 )
									ret := -0.750000 // sell
								if( dif_source_BBlower > 0.426732 )
									ret := -1.000000 // sell
							if( BBlower > 29.6521 )
								ret := -0.500000
				if( dif_source_BBupper > -3.43192 )
					if( vrsi <= 34.4262 )
						if( dif_source_BBlower <= 1.74411 )
							if( dif_source_BBupper <= -0.505221 )
								if( dif_source_BBlower <= 1.62704 )
									ret := 0.030242
								if( dif_source_BBlower > 1.62704 )
									ret := 0.351351
							if( dif_source_BBupper > -0.505221 )
								if( BBupper <= 25.2895 )
									ret := -0.156757
								if( BBupper > 25.2895 )
									ret := 0.171371
						if( dif_source_BBlower > 1.74411 )
							if( dif_source_BBupper <= -0.817607 )
								if( BBlower <= 29.3157 )
									ret := 0.318966
								if( BBlower > 29.3157 )
									ret := -0.274648
							if( dif_source_BBupper > -0.817607 )
								if( BBupper <= 34.0287 )
									ret := -0.103976
								if( BBupper > 34.0287 )
									ret := 0.154013
					if( vrsi > 34.4262 )
						if( BBlower <= 24.7805 )
							if( dif_source_BBlower <= 0.261642 )
								if( BBlower <= 24.1686 )
									ret := 0.818182 // buy
								if( BBlower > 24.1686 )
									ret := 0.153846
							if( dif_source_BBlower > 0.261642 )
								if( vrsi <= 50.0445 )
									ret := -0.182573
								if( vrsi > 50.0445 )
									ret := -0.888889 // sell
						if( BBlower > 24.7805 )
							if( dif_source_BBlower <= 5.1734 )
								if( vrsi <= 47.5209 )
									ret := 0.009612
								if( vrsi > 47.5209 )
									ret := 0.094172
							if( dif_source_BBlower > 5.1734 )
								if( BBupper <= 37.9013 )
									ret := 0.181818
								if( BBupper > 37.9013 )
									ret := 0.613636
	if( vrsi > 51.8697 )
		if( BBupper <= 46.6878 )
			if( vrsi <= 86.6615 )
				if( BBlower <= 23.6879 )
					if( dif_source_BBupper <= -0.669145 )
						if( vrsi <= 84.5815 )
							if( dif_source_BBlower <= 0.570105 )
								if( dif_source_BBlower <= 0.128774 )
									ret := 0.818182 // buy
								if( dif_source_BBlower > 0.128774 )
									ret := -0.727273 // sell
							if( dif_source_BBlower > 0.570105 )
								if( BBupper <= 27.1165 )
									ret := 0.715328 // buy
								if( BBupper > 27.1165 )
									ret := -0.076923
						if( vrsi > 84.5815 )
							if( BBupper <= 25.9454 )
								ret := -1.000000 // sell
							if( BBupper > 25.9454 )
								ret := 0.500000
					if( dif_source_BBupper > -0.669145 )
						if( vrsi <= 65.871 )
							if( BBlower <= 23.6703 )
								if( vrsi <= 60.4852 )
									ret := 0.000000
								if( vrsi > 60.4852 )
									ret := -0.866667 // sell
							if( BBlower > 23.6703 )
								ret := 0.000000
						if( vrsi > 65.871 )
							if( dif_source_BBlower <= 2.95774 )
								if( BBlower <= 22.4985 )
									ret := 1.000000 // buy
								if( BBlower > 22.4985 )
									ret := 0.166667
							if( dif_source_BBlower > 2.95774 )
								if( BBupper <= 25.2104 )
									ret := -0.750000 // sell
								if( BBupper > 25.2104 )
									ret := -0.500000
				if( BBlower > 23.6879 )
					if( dif_source_BBlower <= 0.726779 )
						if( dif_source_BBupper <= -0.876451 )
							if( BBupper <= 27.3712 )
								if( dif_source_BBlower <= 0.214838 )
									ret := 0.190000
								if( dif_source_BBlower > 0.214838 )
									ret := -0.480769
							if( BBupper > 27.3712 )
								if( BBupper <= 28.4207 )
									ret := 0.475410
								if( BBupper > 28.4207 )
									ret := 0.053576
						if( dif_source_BBupper > -0.876451 )
							if( BBlower <= 29.6253 )
								if( dif_source_BBlower <= 0.308486 )
									ret := 0.098760
								if( dif_source_BBlower > 0.308486 )
									ret := -0.017371
							if( BBlower > 29.6253 )
								if( vrsi <= 85.1072 )
									ret := -0.052645
								if( vrsi > 85.1072 )
									ret := -0.331429
					if( dif_source_BBlower > 0.726779 )
						if( vrsi <= 66.0905 )
							if( vrsi <= 65.2481 )
								if( dif_source_BBlower <= 4.32184 )
									ret := 0.026198
								if( dif_source_BBlower > 4.32184 )
									ret := -0.505618
							if( vrsi > 65.2481 )
								if( BBupper <= 30.3882 )
									ret := -0.644737
								if( BBupper > 30.3882 )
									ret := -0.151786
						if( vrsi > 66.0905 )
							if( BBlower <= 29.1651 )
								if( vrsi <= 67.2522 )
									ret := -0.410000
								if( vrsi > 67.2522 )
									ret := 0.011295
							if( BBlower > 29.1651 )
								if( dif_source_BBupper <= -2.71068 )
									ret := 0.566038
								if( dif_source_BBupper > -2.71068 )
									ret := 0.122415
			if( vrsi > 86.6615 )
				if( BBupper <= 44.2326 )
					if( BBupper <= 36.7392 )
						if( BBlower <= 32.355 )
							if( BBlower <= 31.0975 )
								if( vrsi <= 88.5378 )
									ret := -0.234592
								if( vrsi > 88.5378 )
									ret := -0.064748
							if( BBlower > 31.0975 )
								if( dif_source_BBlower <= 0.417309 )
									ret := -0.067797
								if( dif_source_BBlower > 0.417309 )
									ret := 0.099010
						if( BBlower > 32.355 )
							if( dif_source_BBlower <= 3.05553 )
								if( dif_source_BBlower <= 0.372719 )
									ret := -0.007353
								if( dif_source_BBlower > 0.372719 )
									ret := -0.398977
							if( dif_source_BBlower > 3.05553 )
								if( dif_source_BBlower <= 4.03611 )
									ret := 0.692308
								if( dif_source_BBlower > 4.03611 )
									ret := -0.428571
					if( BBupper > 36.7392 )
						if( BBlower <= 42.7992 )
							if( dif_source_BBlower <= 2.19575 )
								if( dif_source_BBupper <= -0.840253 )
									ret := -0.077720
								if( dif_source_BBupper > -0.840253 )
									ret := 0.206349
							if( dif_source_BBlower > 2.19575 )
								if( vrsi <= 90.3678 )
									ret := 0.218750
								if( vrsi > 90.3678 )
									ret := -0.451220
						if( BBlower > 42.7992 )
							if( dif_source_BBupper <= -0.580446 )
								ret := 0.714286 // buy
							if( dif_source_BBupper > -0.580446 )
								if( dif_source_BBupper <= -0.079126 )
									ret := -0.196721
								if( dif_source_BBupper > -0.079126 )
									ret := -0.736842 // sell
				if( BBupper > 44.2326 )
					if( dif_source_BBlower <= 1.59436 )
						if( dif_source_BBupper <= 0.29253 )
							if( BBlower <= 41.8405 )
								if( BBlower <= 41.8075 )
									ret := -0.250000
								if( BBlower > 41.8075 )
									ret := 1.000000 // buy
							if( BBlower > 41.8405 )
								if( BBlower <= 42.8821 )
									ret := -0.702128 // sell
								if( BBlower > 42.8821 )
									ret := -0.323636
						if( dif_source_BBupper > 0.29253 )
							ret := -1.000000 // sell
					if( dif_source_BBlower > 1.59436 )
						if( vrsi <= 93.0446 )
							if( dif_source_BBupper <= -0.192887 )
								if( BBupper <= 44.4913 )
									ret := -0.600000
								if( BBupper > 44.4913 )
									ret := 0.352941
							if( dif_source_BBupper > -0.192887 )
								if( BBupper <= 46.1922 )
									ret := -0.785714 // sell
								if( BBupper > 46.1922 )
									ret := 0.000000
						if( vrsi > 93.0446 )
							if( BBlower <= 43.4611 )
								if( vrsi <= 94.4164 )
									ret := 0.600000
								if( vrsi > 94.4164 )
									ret := 0.000000
							if( BBlower > 43.4611 )
								if( dif_source_BBupper <= 0.392471 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > 0.392471 )
									ret := 0.750000 // buy
		if( BBupper > 46.6878 )
			if( BBupper <= 47.936 )
				if( BBlower <= 45.0075 )
					if( BBlower <= 44.6332 )
						if( dif_source_BBlower <= 2.61432 )
							if( vrsi <= 74.1539 )
								if( vrsi <= 66.8407 )
									ret := -0.294118
								if( vrsi > 66.8407 )
									ret := 0.750000 // buy
							if( vrsi > 74.1539 )
								if( BBlower <= 44.2082 )
									ret := -0.250000
								if( BBlower > 44.2082 )
									ret := -0.916667 // sell
						if( dif_source_BBlower > 2.61432 )
							if( dif_source_BBupper <= -0.034262 )
								if( dif_source_BBlower <= 3.58342 )
									ret := 0.652632
								if( dif_source_BBlower > 3.58342 )
									ret := -0.600000
							if( dif_source_BBupper > -0.034262 )
								if( BBlower <= 43.245 )
									ret := 0.500000
								if( BBlower > 43.245 )
									ret := -0.428571
					if( BBlower > 44.6332 )
						if( vrsi <= 77.3946 )
							if( BBupper <= 47.6051 )
								ret := 0.000000
							if( BBupper > 47.6051 )
								if( dif_source_BBupper <= -0.165422 )
									ret := 0.964286 // buy
								if( dif_source_BBupper > -0.165422 )
									ret := 0.500000
						if( vrsi > 77.3946 )
							if( dif_source_BBupper <= -0.966911 )
								if( BBlower <= 44.8397 )
									ret := 0.200000
								if( BBlower > 44.8397 )
									ret := 0.866667 // buy
							if( dif_source_BBupper > -0.966911 )
								if( dif_source_BBupper <= -0.901529 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -0.901529 )
									ret := 0.333333
				if( BBlower > 45.0075 )
					if( vrsi <= 56.7847 )
						if( dif_source_BBlower <= 1.2701 )
							ret := -0.428571
						if( dif_source_BBlower > 1.2701 )
							ret := -1.000000 // sell
					if( vrsi > 56.7847 )
						if( BBupper <= 47.9287 )
							if( vrsi <= 63.5534 )
								if( dif_source_BBlower <= 1.04611 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 1.04611 )
									ret := 0.444444
							if( vrsi > 63.5534 )
								if( BBlower <= 45.1046 )
									ret := -0.666667
								if( BBlower > 45.1046 )
									ret := 0.075000
						if( BBupper > 47.9287 )
							ret := 1.000000 // buy
			if( BBupper > 47.936 )
				if( dif_source_BBlower <= 2.66836 )
					if( BBupper <= 48.3859 )
						if( dif_source_BBupper <= -1.04187 )
							if( BBlower <= 44.878 )
								if( vrsi <= 73.9942 )
									ret := -0.083333
								if( vrsi > 73.9942 )
									ret := -0.500000
							if( BBlower > 44.878 )
								if( BBlower <= 46.7698 )
									ret := 0.645161
								if( BBlower > 46.7698 )
									ret := -0.250000
						if( dif_source_BBupper > -1.04187 )
							if( BBlower <= 46.6347 )
								if( dif_source_BBlower <= 1.50131 )
									ret := -0.054545
								if( dif_source_BBlower > 1.50131 )
									ret := -0.500000
							if( BBlower > 46.6347 )
								if( BBupper <= 48.2376 )
									ret := 0.000000
								if( BBupper > 48.2376 )
									ret := -0.800000 // sell
					if( BBupper > 48.3859 )
						if( vrsi <= 57.7588 )
							if( vrsi <= 56.3593 )
								if( BBupper <= 49.8032 )
									ret := 0.064516
								if( BBupper > 49.8032 )
									ret := 1.000000 // buy
							if( vrsi > 56.3593 )
								if( BBlower <= 47.239 )
									ret := -1.000000 // sell
								if( BBlower > 47.239 )
									ret := -0.750000 // sell
						if( vrsi > 57.7588 )
							if( BBlower <= 48.1897 )
								if( dif_source_BBlower <= 1.72947 )
									ret := 0.714286 // buy
								if( dif_source_BBlower > 1.72947 )
									ret := 0.185185
							if( BBlower > 48.1897 )
								if( dif_source_BBupper <= -0.579744 )
									ret := 0.333333
								if( dif_source_BBupper > -0.579744 )
									ret := 0.000000
				if( dif_source_BBlower > 2.66836 )
					if( BBlower <= 44.9535 )
						ret := 0.600000
					if( BBlower > 44.9535 )
						if( BBlower <= 46.181 )
							if( BBupper <= 48.2467 )
								if( vrsi <= 84.9525 )
									ret := 0.000000
								if( vrsi > 84.9525 )
									ret := -1.000000 // sell
							if( BBupper > 48.2467 )
								ret := -1.000000 // sell
						if( BBlower > 46.181 )
							if( BBlower <= 46.1999 )
								ret := 0.800000 // buy
							if( BBlower > 46.1999 )
								if( dif_source_BBupper <= -0.158535 )
									ret := -0.357143
								if( dif_source_BBupper > -0.158535 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_AFRM_1Min_ab038fc0(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


