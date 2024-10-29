//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: SNOW_1Min_2BT0_105e8618 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BT0_105e8618", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_105e8618(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.018723 )
		if( bbm <= 0.02985 )
			if( tema <= 113.542 )
				if( ema1 <= 113.435 )
					if( ema13 <= 0.03879 )
						if( ema13 <= -0.209947 )
							if( ema13 <= -0.598666 )
								if( bullPower <= -0.862849 )
									ret := 0.777778 // buy
								if( bullPower > -0.862849 )
									ret := -0.533333
							if( ema13 > -0.598666 )
								if( bearPower <= -0.341397 )
									ret := 0.527778
								if( bearPower > -0.341397 )
									ret := 0.806452 // buy
						if( ema13 > -0.209947 )
							if( ema2 <= 109.781 )
								if( ema1 <= 109.477 )
									ret := 0.267606
								if( ema1 > 109.477 )
									ret := 0.770270 // buy
							if( ema2 > 109.781 )
								if( ema3 <= 112.065 )
									ret := 0.064024
								if( ema3 > 112.065 )
									ret := 0.397260
					if( ema13 > 0.03879 )
						if( ema12 <= -0.025074 )
							ret := -1.000000 // sell
						if( ema12 > -0.025074 )
							if( ema13 <= 0.111588 )
								if( ema1 <= 110.306 )
									ret := 0.100000
								if( ema1 > 110.306 )
									ret := 0.804878 // buy
							if( ema13 > 0.111588 )
								if( ema3 <= 113.046 )
									ret := 0.589744
								if( ema3 > 113.046 )
									ret := -0.400000
				if( ema1 > 113.435 )
					if( bbp <= -0.171545 )
						if( bullPower <= -0.246348 )
							if( bbp <= -0.731477 )
								ret := 1.000000 // buy
							if( bbp > -0.731477 )
								if( tema <= 113.439 )
									ret := 1.000000 // buy
								if( tema > 113.439 )
									ret := 0.750000 // buy
						if( bullPower > -0.246348 )
							if( ema1 <= 113.597 )
								if( ema12 <= -0.132316 )
									ret := 0.200000
								if( ema12 > -0.132316 )
									ret := 0.910714 // buy
							if( ema1 > 113.597 )
								ret := -0.250000
					if( bbp > -0.171545 )
						if( tema <= 113.506 )
							if( ema12 <= -0.046105 )
								ret := 0.250000
							if( ema12 > -0.046105 )
								ret := -0.142857
						if( tema > 113.506 )
							ret := 0.714286 // buy
			if( tema > 113.542 )
				if( ema2 <= 123.887 )
					if( ema12 <= -1.01583 )
						ret := -1.000000 // sell
					if( ema12 > -1.01583 )
						if( bearPower <= -0.784835 )
							if( ema1 <= 121.822 )
								ret := 1.000000 // buy
							if( ema1 > 121.822 )
								ret := 0.250000
						if( bearPower > -0.784835 )
							if( ema12 <= -0.180689 )
								if( ema1 <= 121.979 )
									ret := -0.096774
								if( ema1 > 121.979 )
									ret := -0.818182 // sell
							if( ema12 > -0.180689 )
								if( bbp <= -0.26642 )
									ret := 0.284916
								if( bbp > -0.26642 )
									ret := -0.049065
				if( ema2 > 123.887 )
					if( ema12 <= -0.072182 )
						if( bbp <= -0.227308 )
							if( ema2 <= 169.96 )
								if( ema1 <= 158.879 )
									ret := 0.211039
								if( ema1 > 158.879 )
									ret := 0.518797
							if( ema2 > 169.96 )
								ret := -1.000000 // sell
						if( bbp > -0.227308 )
							if( tema <= 169.4 )
								if( ema3 <= 164.597 )
									ret := -0.101604
								if( ema3 > 164.597 )
									ret := -0.714286 // sell
							if( tema > 169.4 )
								ret := 1.000000 // buy
					if( ema12 > -0.072182 )
						if( bbp <= -0.448821 )
							if( ema12 <= -0.050939 )
								if( ema12 <= -0.055183 )
									ret := 0.625000
								if( ema12 > -0.055183 )
									ret := 0.000000
							if( ema12 > -0.050939 )
								if( ema12 <= 0.03156 )
									ret := 0.716216 // buy
								if( ema12 > 0.03156 )
									ret := 1.000000 // buy
						if( bbp > -0.448821 )
							if( ema2 <= 157.676 )
								if( bbp <= -0.097503 )
									ret := 0.388047
								if( bbp > -0.097503 )
									ret := 0.254032
							if( ema2 > 157.676 )
								if( ema1 <= 158 )
									ret := -0.642857
								if( ema1 > 158 )
									ret := 0.060914
		if( bbm > 0.02985 )
			if( tema <= 126.668 )
				if( ema12 <= -0.349377 )
					if( ema2 <= 111.819 )
						if( ema3 <= 109.916 )
							ret := 0.750000 // buy
						if( ema3 > 109.916 )
							if( ema2 <= 111.595 )
								ret := 1.000000 // buy
							if( ema2 > 111.595 )
								if( bearPower <= -1.04666 )
									ret := 1.000000 // buy
								if( bearPower > -1.04666 )
									ret := 0.750000 // buy
					if( ema2 > 111.819 )
						if( tema <= 111.468 )
							if( ema2 <= 112.188 )
								ret := -0.250000
							if( ema2 > 112.188 )
								ret := -1.000000 // sell
						if( tema > 111.468 )
							if( ema1 <= 126.697 )
								if( ema1 <= 116.39 )
									ret := 0.164384
								if( ema1 > 116.39 )
									ret := 0.619247
							if( ema1 > 126.697 )
								if( bullPower <= -0.970016 )
									ret := 0.785714 // buy
								if( bullPower > -0.970016 )
									ret := -0.441176
				if( ema12 > -0.349377 )
					if( ema1 <= 125.902 )
						if( bullPower <= -0.513068 )
							if( bbm <= 0.405885 )
								if( ema1 <= 109.598 )
									ret := -0.250000
								if( ema1 > 109.598 )
									ret := 0.872340 // buy
							if( bbm > 0.405885 )
								if( bbm <= 0.49199 )
									ret := -0.600000
								if( bbm > 0.49199 )
									ret := 0.000000
						if( bullPower > -0.513068 )
							if( tema <= 114.294 )
								if( ema1 <= 114.06 )
									ret := 0.075712
								if( ema1 > 114.06 )
									ret := 0.336516
							if( tema > 114.294 )
								if( ema3 <= 117.699 )
									ret := -0.145292
								if( ema3 > 117.699 )
									ret := 0.084821
					if( ema1 > 125.902 )
						if( ema13 <= 0.041411 )
							if( tema <= 125.963 )
								if( bearPower <= -0.429994 )
									ret := 0.951220 // buy
								if( bearPower > -0.429994 )
									ret := 0.447619
							if( tema > 125.963 )
								if( bbm <= 0.084826 )
									ret := -0.055046
								if( bbm > 0.084826 )
									ret := 0.372727
						if( ema13 > 0.041411 )
							if( bbm <= 0.150898 )
								if( bbm <= 0.07102 )
									ret := -0.750000 // sell
								if( bbm > 0.07102 )
									ret := -1.000000 // sell
							if( bbm > 0.150898 )
								ret := 0.500000
			if( tema > 126.668 )
				if( tema <= 146.424 )
					if( ema3 <= 135.006 )
						if( ema13 <= -1.05063 )
							if( bbp <= -2.70582 )
								if( bbp <= -2.78761 )
									ret := -0.416667
								if( bbp > -2.78761 )
									ret := 1.000000 // buy
							if( bbp > -2.70582 )
								if( ema3 <= 129.983 )
									ret := -0.200000
								if( ema3 > 129.983 )
									ret := -0.815385 // sell
						if( ema13 > -1.05063 )
							if( bearPower <= -0.455896 )
								if( ema3 <= 133.89 )
									ret := 0.127186
								if( ema3 > 133.89 )
									ret := 0.597403
							if( bearPower > -0.455896 )
								if( ema13 <= -0.448501 )
									ret := -0.500000
								if( ema13 > -0.448501 )
									ret := 0.002324
					if( ema3 > 135.006 )
						if( ema12 <= -0.026214 )
							if( ema1 <= 135.001 )
								if( bbm <= 0.060721 )
									ret := 0.416667
								if( bbm > 0.060721 )
									ret := -0.620438
							if( ema1 > 135.001 )
								if( tema <= 140.763 )
									ret := -0.135246
								if( tema > 140.763 )
									ret := -0.001085
						if( ema12 > -0.026214 )
							if( bbp <= -0.25808 )
								if( ema3 <= 143.385 )
									ret := 0.711538 // buy
								if( ema3 > 143.385 )
									ret := -0.200000
							if( bbp > -0.25808 )
								if( ema2 <= 135.851 )
									ret := -0.600000
								if( ema2 > 135.851 )
									ret := 0.091954
				if( tema > 146.424 )
					if( ema2 <= 155.937 )
						if( bullPower <= -0.230873 )
							if( ema3 <= 156.136 )
								if( ema2 <= 155.748 )
									ret := 0.474490
								if( ema2 > 155.748 )
									ret := 0.933333 // buy
							if( ema3 > 156.136 )
								if( ema12 <= -0.467253 )
									ret := 0.750000 // buy
								if( ema12 > -0.467253 )
									ret := -1.000000 // sell
						if( bullPower > -0.230873 )
							if( ema1 <= 154.556 )
								if( ema2 <= 153.452 )
									ret := 0.167458
								if( ema2 > 153.452 )
									ret := -0.220472
							if( ema1 > 154.556 )
								if( ema2 <= 155.645 )
									ret := 0.767857 // buy
								if( ema2 > 155.645 )
									ret := 0.191489
					if( ema2 > 155.937 )
						if( tema <= 166.878 )
							if( ema3 <= 157.249 )
								if( ema12 <= -0.055889 )
									ret := -0.269006
								if( ema12 > -0.055889 )
									ret := 0.108527
							if( ema3 > 157.249 )
								if( ema3 <= 157.537 )
									ret := 0.509677
								if( ema3 > 157.537 )
									ret := 0.003100
						if( tema > 166.878 )
							if( ema13 <= -1.34484 )
								if( tema <= 167.822 )
									ret := 0.714286 // buy
								if( tema > 167.822 )
									ret := 0.967742 // buy
							if( ema13 > -1.34484 )
								if( ema3 <= 169.87 )
									ret := 0.822222 // buy
								if( ema3 > 169.87 )
									ret := -0.032609
	if( bullPower > -0.018723 )
		if( bbm <= 0.0147 )
			if( bullPower <= 0.145189 )
				if( ema12 <= 0.086827 )
					if( bbp <= 0.119856 )
						if( ema3 <= 164.745 )
							if( bearPower <= -0.024409 )
								if( bbm <= 0.012015 )
									ret := -0.416667
								if( bbm > 0.012015 )
									ret := -1.000000 // sell
							if( bearPower > -0.024409 )
								if( bearPower <= -0.01524 )
									ret := 0.191667
								if( bearPower > -0.01524 )
									ret := -0.024826
						if( ema3 > 164.745 )
							if( ema1 <= 169.89 )
								if( ema3 <= 164.923 )
									ret := -1.000000 // sell
								if( ema3 > 164.923 )
									ret := -0.666667
							if( ema1 > 169.89 )
								ret := -0.142857
					if( bbp > 0.119856 )
						if( ema12 <= 0.031268 )
							if( ema3 <= 157.853 )
								if( ema3 <= 157.084 )
									ret := -0.294737
								if( ema3 > 157.084 )
									ret := -1.000000 // sell
							if( ema3 > 157.853 )
								if( ema2 <= 157.994 )
									ret := 0.833333 // buy
								if( ema2 > 157.994 )
									ret := -0.051282
						if( ema12 > 0.031268 )
							if( ema3 <= 109.519 )
								ret := 1.000000 // buy
							if( ema3 > 109.519 )
								if( ema3 <= 110.478 )
									ret := -0.577778
								if( ema3 > 110.478 )
									ret := -0.082456
				if( ema12 > 0.086827 )
					if( bearPower <= 0.036243 )
						if( ema13 <= 0.185202 )
							if( bearPower <= -0.001066 )
								ret := 1.000000 // buy
							if( bearPower > -0.001066 )
								ret := 0.250000
						if( ema13 > 0.185202 )
							if( bbp <= 0.031583 )
								if( ema2 <= 115.819 )
									ret := 0.500000
								if( ema2 > 115.819 )
									ret := -0.266667
							if( bbp > 0.031583 )
								if( tema <= 137.657 )
									ret := -0.857143 // sell
								if( tema > 137.657 )
									ret := 0.000000
					if( bearPower > 0.036243 )
						if( ema13 <= 0.279472 )
							if( ema3 <= 125.003 )
								if( ema2 <= 123.044 )
									ret := 0.297297
								if( ema2 > 123.044 )
									ret := 0.825000 // buy
							if( ema3 > 125.003 )
								if( ema13 <= 0.132287 )
									ret := -0.500000
								if( ema13 > 0.132287 )
									ret := 0.185567
						if( ema13 > 0.279472 )
							if( ema2 <= 115.481 )
								if( ema1 <= 111.939 )
									ret := 0.250000
								if( ema1 > 111.939 )
									ret := -0.538462
							if( ema2 > 115.481 )
								if( ema3 <= 123.284 )
									ret := 0.727273 // buy
								if( ema3 > 123.284 )
									ret := 0.047059
			if( bullPower > 0.145189 )
				if( ema3 <= 125.648 )
					if( ema13 <= 0.762309 )
						if( bbp <= 1.2856 )
							if( bullPower <= 0.28125 )
								if( ema2 <= 109.829 )
									ret := 0.238095
								if( ema2 > 109.829 )
									ret := -0.210526
							if( bullPower > 0.28125 )
								if( ema1 <= 124.198 )
									ret := -0.494505
								if( ema1 > 124.198 )
									ret := 0.080000
						if( bbp > 1.2856 )
							if( ema2 <= 113.865 )
								if( tema <= 112.096 )
									ret := 0.000000
								if( tema > 112.096 )
									ret := 1.000000 // buy
							if( ema2 > 113.865 )
								if( ema13 <= 0.153945 )
									ret := 0.500000
								if( ema13 > 0.153945 )
									ret := -0.727273 // sell
					if( ema13 > 0.762309 )
						if( bearPower <= 0.336238 )
							ret := 1.000000 // buy
						if( bearPower > 0.336238 )
							if( ema12 <= 0.8756 )
								if( ema3 <= 111.723 )
									ret := 0.269231
								if( ema3 > 111.723 )
									ret := -0.551724
							if( ema12 > 0.8756 )
								if( ema3 <= 114.77 )
									ret := 1.000000 // buy
								if( ema3 > 114.77 )
									ret := -0.250000
				if( ema3 > 125.648 )
					if( ema13 <= 0.98998 )
						if( ema12 <= 0.098017 )
							if( ema1 <= 134.206 )
								if( bearPower <= 0.200388 )
									ret := -0.460674
								if( bearPower > 0.200388 )
									ret := -0.765152 // sell
							if( ema1 > 134.206 )
								if( ema1 <= 137.344 )
									ret := 0.200000
								if( ema1 > 137.344 )
									ret := -0.384615
						if( ema12 > 0.098017 )
							if( bullPower <= 0.33889 )
								if( ema12 <= 0.166234 )
									ret := -0.260870
								if( ema12 > 0.166234 )
									ret := 0.016129
							if( bullPower > 0.33889 )
								if( ema2 <= 129.161 )
									ret := -0.842105 // sell
								if( ema2 > 129.161 )
									ret := -0.326019
					if( ema13 > 0.98998 )
						if( bbp <= 1.29673 )
							if( ema13 <= 1.09864 )
								ret := 0.750000 // buy
							if( ema13 > 1.09864 )
								ret := 1.000000 // buy
						if( bbp > 1.29673 )
							if( ema13 <= 1.17164 )
								ret := 0.250000
							if( ema13 > 1.17164 )
								ret := -0.250000
		if( bbm > 0.0147 )
			if( ema3 <= 170.386 )
				if( ema13 <= 0.863449 )
					if( bullPower <= 0.19337 )
						if( tema <= 109.889 )
							if( ema1 <= 108.792 )
								if( ema3 <= 107.777 )
									ret := 0.357143
								if( ema3 > 107.777 )
									ret := -0.181818
							if( ema1 > 108.792 )
								if( ema3 <= 109.126 )
									ret := 0.577586
								if( ema3 > 109.126 )
									ret := 0.164336
						if( tema > 109.889 )
							if( tema <= 120.491 )
								if( ema2 <= 113.38 )
									ret := 0.054287
								if( ema2 > 113.38 )
									ret := -0.100182
							if( tema > 120.491 )
								if( ema1 <= 121.395 )
									ret := 0.520468
								if( ema1 > 121.395 )
									ret := 0.043979
					if( bullPower > 0.19337 )
						if( ema3 <= 130.407 )
							if( bbm <= 1.31506 )
								if( bullPower <= 0.586053 )
									ret := 0.118930
								if( bullPower > 0.586053 )
									ret := 0.279921
							if( bbm > 1.31506 )
								if( ema13 <= -0.440968 )
									ret := 0.428571
								if( ema13 > -0.440968 )
									ret := -0.738095 // sell
						if( ema3 > 130.407 )
							if( ema1 <= 170.593 )
								if( bbp <= 1.74072 )
									ret := 0.036947
								if( bbp > 1.74072 )
									ret := -0.392523
							if( ema1 > 170.593 )
								ret := 1.000000 // buy
				if( ema13 > 0.863449 )
					if( bearPower <= 0.765715 )
						if( bearPower <= 0.409386 )
							if( ema2 <= 132.372 )
								if( ema1 <= 112.224 )
									ret := 0.500000
								if( ema1 > 112.224 )
									ret := -0.846154 // sell
							if( ema2 > 132.372 )
								if( ema2 <= 156.963 )
									ret := 0.400000
								if( ema2 > 156.963 )
									ret := -0.600000
						if( bearPower > 0.409386 )
							if( bullPower <= 1.86211 )
								if( bbm <= 0.39495 )
									ret := -0.591549
								if( bbm > 0.39495 )
									ret := -0.895522 // sell
							if( bullPower > 1.86211 )
								ret := 0.750000 // buy
					if( bearPower > 0.765715 )
						if( bullPower <= 1.46101 )
							if( ema13 <= 1.70008 )
								if( tema <= 116.873 )
									ret := -0.217391
								if( tema > 116.873 )
									ret := 0.585366
							if( ema13 > 1.70008 )
								ret := -1.000000 // sell
						if( bullPower > 1.46101 )
							if( ema3 <= 125.679 )
								if( ema1 <= 111.598 )
									ret := -1.000000 // sell
								if( ema1 > 111.598 )
									ret := 0.315789
							if( ema3 > 125.679 )
								if( bbm <= 4.95811 )
									ret := -0.622951
								if( bbm > 4.95811 )
									ret := 0.500000
			if( ema3 > 170.386 )
				if( bullPower <= 0.350214 )
					if( ema2 <= 171.174 )
						if( ema3 <= 170.925 )
							if( bearPower <= -0.034583 )
								ret := -0.750000 // sell
							if( bearPower > -0.034583 )
								ret := -1.000000 // sell
						if( ema3 > 170.925 )
							if( ema2 <= 171.129 )
								ret := 0.000000
							if( ema2 > 171.129 )
								if( ema3 <= 171.105 )
									ret := -0.500000
								if( ema3 > 171.105 )
									ret := -1.000000 // sell
					if( ema2 > 171.174 )
						if( bearPower <= 0.018316 )
							if( tema <= 173.52 )
								if( ema3 <= 172.084 )
									ret := 0.500000
								if( ema3 > 172.084 )
									ret := 1.000000 // buy
							if( tema > 173.52 )
								ret := 0.000000
						if( bearPower > 0.018316 )
							ret := -1.000000 // sell
				if( bullPower > 0.350214 )
					if( ema3 <= 172.331 )
						if( bbp <= 1.24284 )
							if( ema1 <= 172.49 )
								if( bearPower <= 0.158005 )
									ret := -1.000000 // sell
								if( bearPower > 0.158005 )
									ret := -0.727273 // sell
							if( ema1 > 172.49 )
								ret := -0.200000
						if( bbp > 1.24284 )
							ret := -1.000000 // sell
					if( ema3 > 172.331 )
						if( ema12 <= 0.47104 )
							ret := -1.000000 // sell
						if( ema12 > 0.47104 )
							ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_SNOW_1Min_105e8618(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


