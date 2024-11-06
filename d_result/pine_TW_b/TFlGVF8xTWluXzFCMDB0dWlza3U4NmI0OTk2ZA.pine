//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: LYFT_1Min_1B00_86b4996d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1B00_86b4996d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_86b4996d(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= 0.012516 )
		if( bullPower <= -0.006791 )
			if( bearPower <= -0.020758 )
				if( bbm <= 0.00075 )
					if( bearPower <= -0.057716 )
						if( bullPower <= -0.23455 )
							ret := -0.250000
						if( bullPower > -0.23455 )
							if( bbm <= 9.4e-05 )
								if( bearPower <= -0.100793 )
									ret := 0.924528 // buy
								if( bearPower > -0.100793 )
									ret := 0.771739 // buy
							if( bbm > 9.4e-05 )
								if( bearPower <= -0.070018 )
									ret := 0.000000
								if( bearPower > -0.070018 )
									ret := 1.000000 // buy
					if( bearPower > -0.057716 )
						if( bbp <= -0.112903 )
							if( bullPower <= -0.057244 )
								ret := -0.250000
							if( bullPower > -0.057244 )
								if( bearPower <= -0.056803 )
									ret := -1.000000 // sell
								if( bearPower > -0.056803 )
									ret := -0.250000
						if( bbp > -0.112903 )
							if( bearPower <= -0.027535 )
								if( bullPower <= -0.050076 )
									ret := 0.339130
								if( bullPower > -0.050076 )
									ret := 0.619303
							if( bearPower > -0.027535 )
								if( bullPower <= -0.027168 )
									ret := -0.160000
								if( bullPower > -0.027168 )
									ret := 0.456075
				if( bbm > 0.00075 )
					if( bullPower <= -0.295621 )
						if( bbp <= -0.864773 )
							ret := 1.000000 // buy
						if( bbp > -0.864773 )
							ret := -0.500000
					if( bullPower > -0.295621 )
						if( bearPower <= -0.021476 )
							if( bearPower <= -0.139144 )
								if( bbp <= -0.503169 )
									ret := 0.526316
								if( bbp > -0.503169 )
									ret := -0.084127
							if( bearPower > -0.139144 )
								if( bullPower <= -0.058324 )
									ret := 0.293040
								if( bullPower > -0.058324 )
									ret := 0.086325
						if( bearPower > -0.021476 )
							if( bearPower <= -0.021302 )
								if( bbp <= -0.032911 )
									ret := -0.166667
								if( bbp > -0.032911 )
									ret := -0.800000 // sell
							if( bearPower > -0.021302 )
								if( bearPower <= -0.021002 )
									ret := 0.120000
								if( bearPower > -0.021002 )
									ret := -0.301587
			if( bearPower > -0.020758 )
				if( bbp <= -0.033688 )
					if( bullPower <= -0.015579 )
						if( bullPower <= -0.020254 )
							if( bbp <= -0.041291 )
								if( bbp <= -0.04146 )
									ret := 0.750000 // buy
								if( bbp > -0.04146 )
									ret := 1.000000 // buy
							if( bbp > -0.041291 )
								if( bullPower <= -0.02063 )
									ret := -0.600000
								if( bullPower > -0.02063 )
									ret := 0.000000
						if( bullPower > -0.020254 )
							if( bbp <= -0.03736 )
								if( bearPower <= -0.018875 )
									ret := 0.623377
								if( bearPower > -0.018875 )
									ret := 0.882353 // buy
							if( bbp > -0.03736 )
								if( bbp <= -0.034237 )
									ret := 0.435000
								if( bbp > -0.034237 )
									ret := 0.785714 // buy
					if( bullPower > -0.015579 )
						if( bbm <= 0.005004 )
							if( bbp <= -0.03401 )
								if( bbp <= -0.034486 )
									ret := -0.200000
								if( bbp > -0.034486 )
									ret := 0.333333
							if( bbp > -0.03401 )
								ret := -0.500000
						if( bbm > 0.005004 )
							if( bearPower <= -0.020308 )
								ret := 0.400000
							if( bearPower > -0.020308 )
								ret := 1.000000 // buy
				if( bbp > -0.033688 )
					if( bearPower <= -0.016682 )
						if( bearPower <= -0.017176 )
							if( bullPower <= -0.007753 )
								if( bbp <= -0.025937 )
									ret := 0.133333
								if( bbp > -0.025937 )
									ret := -0.358491
							if( bullPower > -0.007753 )
								if( bbp <= -0.025141 )
									ret := 0.717391 // buy
								if( bbp > -0.025141 )
									ret := 0.153846
						if( bearPower > -0.017176 )
							if( bbp <= -0.023826 )
								if( bullPower <= -0.007099 )
									ret := -0.278481
								if( bullPower > -0.007099 )
									ret := 0.000000
							if( bbp > -0.023826 )
								if( bearPower <= -0.016869 )
									ret := 0.181818
								if( bearPower > -0.016869 )
									ret := 0.583333
					if( bearPower > -0.016682 )
						if( bbm <= 2.4e-05 )
							if( bearPower <= -0.015912 )
								if( bullPower <= -0.016513 )
									ret := 0.363636
								if( bullPower > -0.016513 )
									ret := 0.612500
							if( bearPower > -0.015912 )
								if( bbp <= -0.013914 )
									ret := 0.375184
								if( bbp > -0.013914 )
									ret := 0.102564
						if( bbm > 2.4e-05 )
							if( bullPower <= -0.015817 )
								if( bearPower <= -0.016191 )
									ret := -0.142857
								if( bearPower > -0.016191 )
									ret := -1.000000 // sell
							if( bullPower > -0.015817 )
								if( bbp <= -0.031136 )
									ret := 1.000000 // buy
								if( bbp > -0.031136 )
									ret := 0.169591
		if( bullPower > -0.006791 )
			if( bbp <= -0.033175 )
				if( bullPower <= 0.006071 )
					if( bbm <= 0.05005 )
						if( bbp <= -0.054375 )
							if( bbp <= -0.05746 )
								if( bearPower <= -0.055613 )
									ret := -0.800000 // sell
								if( bearPower > -0.055613 )
									ret := 0.200000
							if( bbp > -0.05746 )
								if( bearPower <= -0.050113 )
									ret := -0.521739
								if( bearPower > -0.050113 )
									ret := -1.000000 // sell
						if( bbp > -0.054375 )
							if( bearPower <= -0.049612 )
								if( bearPower <= -0.051725 )
									ret := 0.000000
								if( bearPower > -0.051725 )
									ret := 0.724138 // buy
							if( bearPower > -0.049612 )
								if( bullPower <= -0.004458 )
									ret := 0.100604
								if( bullPower > -0.004458 )
									ret := 0.211098
					if( bbm > 0.05005 )
						if( bbp <= -0.065469 )
							if( bbp <= -0.072542 )
								if( bbm <= 0.070718 )
									ret := -0.657143
								if( bbm > 0.070718 )
									ret := -0.024390
							if( bbp > -0.072542 )
								if( bullPower <= -0.005741 )
									ret := -0.500000
								if( bullPower > -0.005741 )
									ret := 0.581818
						if( bbp > -0.065469 )
							if( bearPower <= -0.06731 )
								ret := -1.000000 // sell
							if( bearPower > -0.06731 )
								if( bearPower <= -0.05336 )
									ret := -0.338983
								if( bearPower > -0.05336 )
									ret := 0.148148
				if( bullPower > 0.006071 )
					if( bbp <= -0.065373 )
						if( bearPower <= -0.105571 )
							if( bearPower <= -0.122681 )
								if( bbm <= 0.182028 )
									ret := 0.823529 // buy
								if( bbm > 0.182028 )
									ret := 0.240000
							if( bearPower > -0.122681 )
								if( bbp <= -0.095711 )
									ret := 0.250000
								if( bbp > -0.095711 )
									ret := -0.800000 // sell
						if( bearPower > -0.105571 )
							if( bbp <= -0.075747 )
								if( bearPower <= -0.094651 )
									ret := 0.666667
								if( bearPower > -0.094651 )
									ret := 0.000000
							if( bbp > -0.075747 )
								if( bearPower <= -0.092108 )
									ret := 1.000000 // buy
								if( bearPower > -0.092108 )
									ret := 0.842105 // buy
					if( bbp > -0.065373 )
						if( bullPower <= 0.010639 )
							if( bbp <= -0.060449 )
								if( bullPower <= 0.00767 )
									ret := -0.750000 // sell
								if( bullPower > 0.00767 )
									ret := 0.142857
							if( bbp > -0.060449 )
								if( bbm <= 0.060127 )
									ret := 0.300000
								if( bbm > 0.060127 )
									ret := 0.586207
						if( bullPower > 0.010639 )
							if( bbm <= 0.05999 )
								if( bbp <= -0.035626 )
									ret := 0.571429
								if( bbp > -0.035626 )
									ret := 1.000000 // buy
							if( bbm > 0.05999 )
								if( bullPower <= 0.011961 )
									ret := -0.540541
								if( bullPower > 0.011961 )
									ret := 0.029268
			if( bbp > -0.033175 )
				if( bbp <= -0.027585 )
					if( bearPower <= -0.024373 )
						if( bullPower <= 0.043526 )
							if( bbm <= 0.019897 )
								if( bbp <= -0.031872 )
									ret := 0.000000
								if( bbp > -0.031872 )
									ret := -0.842105 // sell
							if( bbm > 0.019897 )
								if( bullPower <= -0.003569 )
									ret := 0.143731
								if( bullPower > -0.003569 )
									ret := -0.075446
						if( bullPower > 0.043526 )
							ret := -1.000000 // sell
					if( bearPower > -0.024373 )
						if( bbp <= -0.027957 )
							if( bullPower <= -0.004003 )
								if( bbm <= 0.014888 )
									ret := 0.714286 // buy
								if( bbm > 0.014888 )
									ret := -0.316832
							if( bullPower > -0.004003 )
								if( bbp <= -0.027995 )
									ret := 0.500000
								if( bbp > -0.027995 )
									ret := 0.400000
						if( bbp > -0.027957 )
							if( bullPower <= -0.003944 )
								if( bearPower <= -0.023465 )
									ret := -1.000000 // sell
								if( bearPower > -0.023465 )
									ret := -0.625000
							if( bullPower > -0.003944 )
								if( bullPower <= -0.003853 )
									ret := -0.066667
								if( bullPower > -0.003853 )
									ret := -0.833333 // sell
				if( bbp > -0.027585 )
					if( bullPower <= -0.000589 )
						if( bearPower <= -0.026078 )
							if( bbp <= -0.027263 )
								ret := 1.000000 // buy
							if( bbp > -0.027263 )
								if( bbp <= -0.027183 )
									ret := 0.500000
								if( bbp > -0.027183 )
									ret := 1.000000 // buy
						if( bearPower > -0.026078 )
							if( bbm <= 0.000132 )
								if( bullPower <= -0.006421 )
									ret := -0.152542
								if( bullPower > -0.006421 )
									ret := 0.196470
							if( bbm > 0.000132 )
								if( bbm <= 0.009447 )
									ret := -0.044444
								if( bbm > 0.009447 )
									ret := 0.114295
					if( bullPower > -0.000589 )
						if( bullPower <= 0.000181 )
							if( bullPower <= 0.000142 )
								if( bullPower <= -3.2e-05 )
									ret := -0.131238
								if( bullPower > -3.2e-05 )
									ret := 0.085714
							if( bullPower > 0.000142 )
								if( bearPower <= 0.000172 )
									ret := -0.500000
								if( bearPower > 0.000172 )
									ret := -1.000000 // sell
						if( bullPower > 0.000181 )
							if( bearPower <= -0.055439 )
								if( bullPower <= 0.058153 )
									ret := -0.678571
								if( bullPower > 0.058153 )
									ret := 0.019608
							if( bearPower > -0.055439 )
								if( bearPower <= -0.044899 )
									ret := 0.513514
								if( bearPower > -0.044899 )
									ret := 0.050480
	if( bbp > 0.012516 )
		if( bbm <= 0.004993 )
			if( bearPower <= 0.018063 )
				if( bbp <= 0.034751 )
					if( bbp <= 0.03412 )
						if( bullPower <= 0.017072 )
							if( bullPower <= 0.006441 )
								if( bbp <= 0.01273 )
									ret := -0.333333
								if( bbp > 0.01273 )
									ret := -0.647059
							if( bullPower > 0.006441 )
								if( bbp <= 0.0186 )
									ret := 0.008013
								if( bbp > 0.0186 )
									ret := -0.114217
						if( bullPower > 0.017072 )
							if( bullPower <= 0.017841 )
								ret := 1.000000 // buy
							if( bullPower > 0.017841 )
								ret := 0.142857
					if( bbp > 0.03412 )
						if( bearPower <= 0.017066 )
							ret := 0.250000
						if( bearPower > 0.017066 )
							if( bbp <= 0.034256 )
								if( bbp <= 0.034163 )
									ret := -0.750000 // sell
								if( bbp > 0.034163 )
									ret := -0.857143 // sell
							if( bbp > 0.034256 )
								if( bullPower <= 0.017287 )
									ret := -0.058824
								if( bullPower > 0.017287 )
									ret := -0.583333
				if( bbp > 0.034751 )
					if( bearPower <= 0.017542 )
						if( bbp <= 0.034982 )
							if( bearPower <= 0.017437 )
								if( bearPower <= 0.017401 )
									ret := 0.250000
								if( bearPower > 0.017401 )
									ret := 0.000000
							if( bearPower > 0.017437 )
								ret := 0.428571
						if( bbp > 0.034982 )
							ret := 1.000000 // buy
					if( bearPower > 0.017542 )
						if( bullPower <= 0.017594 )
							ret := -0.400000
						if( bullPower > 0.017594 )
							if( bearPower <= 0.017917 )
								if( bbm <= 1.2e-05 )
									ret := 0.187500
								if( bbm > 1.2e-05 )
									ret := 0.666667
							if( bearPower > 0.017917 )
								if( bearPower <= 0.017977 )
									ret := -0.428571
								if( bearPower > 0.017977 )
									ret := 0.222222
			if( bearPower > 0.018063 )
				if( bbm <= 1e-06 )
					if( bbp <= 0.081175 )
						if( bbp <= 0.078265 )
							if( bbp <= 0.075068 )
								if( bullPower <= 0.030986 )
									ret := -0.332996
								if( bullPower > 0.030986 )
									ret := -0.176152
							if( bbp > 0.075068 )
								if( bbp <= 0.075777 )
									ret := -0.933333 // sell
								if( bbp > 0.075777 )
									ret := -0.680000
						if( bbp > 0.078265 )
							if( bearPower <= 0.039211 )
								ret := 1.000000 // buy
							if( bearPower > 0.039211 )
								if( bbp <= 0.08051 )
									ret := 0.322581
								if( bbp > 0.08051 )
									ret := -0.200000
					if( bbp > 0.081175 )
						if( bearPower <= 0.045678 )
							if( bullPower <= 0.042288 )
								if( bbp <= 0.083141 )
									ret := -0.652174
								if( bbp > 0.083141 )
									ret := -0.187500
							if( bullPower > 0.042288 )
								if( bearPower <= 0.045461 )
									ret := -0.695652
								if( bearPower > 0.045461 )
									ret := -1.000000 // sell
						if( bearPower > 0.045678 )
							if( bullPower <= 0.046361 )
								if( bearPower <= 0.04627 )
									ret := 0.800000 // buy
								if( bearPower > 0.04627 )
									ret := 0.250000
							if( bullPower > 0.046361 )
								if( bbp <= 0.298596 )
									ret := -0.416667
								if( bbp > 0.298596 )
									ret := 0.166667
				if( bbm > 1e-06 )
					if( bullPower <= 0.066238 )
						if( bullPower <= 0.021128 )
							if( bullPower <= 0.020189 )
								if( bbp <= 0.037499 )
									ret := -1.000000 // sell
								if( bbp > 0.037499 )
									ret := -0.500000
							if( bullPower > 0.020189 )
								ret := -1.000000 // sell
						if( bullPower > 0.021128 )
							if( bearPower <= 0.021132 )
								ret := 0.000000
							if( bearPower > 0.021132 )
								if( bbm <= 9.1e-05 )
									ret := -1.000000 // sell
								if( bbm > 9.1e-05 )
									ret := -0.683544
					if( bullPower > 0.066238 )
						if( bearPower <= 0.10327 )
							if( bullPower <= 0.091007 )
								ret := 0.666667
							if( bullPower > 0.091007 )
								ret := 0.200000
						if( bearPower > 0.10327 )
							if( bullPower <= 0.118104 )
								ret := -1.000000 // sell
							if( bullPower > 0.118104 )
								ret := 0.000000
		if( bbm > 0.004993 )
			if( bullPower <= 0.165927 )
				if( bbp <= 0.050239 )
					if( bullPower <= 0.042378 )
						if( bullPower <= 0.041643 )
							if( bearPower <= 0.002876 )
								if( bbp <= 0.039989 )
									ret := -0.027821
								if( bbp > 0.039989 )
									ret := -0.460000
							if( bearPower > 0.002876 )
								if( bbm <= 0.024999 )
									ret := 0.011021
								if( bbm > 0.024999 )
									ret := 0.132984
						if( bullPower > 0.041643 )
							if( bearPower <= 0.007034 )
								if( bearPower <= -0.01809 )
									ret := -0.200000
								if( bearPower > -0.01809 )
									ret := -0.653846
							if( bearPower > 0.007034 )
								if( bearPower <= 0.007246 )
									ret := 0.000000
								if( bearPower > 0.007246 )
									ret := 0.250000
					if( bullPower > 0.042378 )
						if( bullPower <= 0.045199 )
							if( bbp <= 0.0242 )
								if( bbp <= 0.016017 )
									ret := 0.800000 // buy
								if( bbp > 0.016017 )
									ret := -0.421053
							if( bbp > 0.0242 )
								if( bearPower <= -0.01239 )
									ret := 0.837838 // buy
								if( bearPower > -0.01239 )
									ret := 0.405882
						if( bullPower > 0.045199 )
							if( bearPower <= -0.010677 )
								if( bullPower <= 0.055952 )
									ret := 0.350877
								if( bullPower > 0.055952 )
									ret := 0.014354
							if( bearPower > -0.010677 )
								if( bullPower <= 0.058069 )
									ret := -0.108911
								if( bullPower > 0.058069 )
									ret := -0.666667
				if( bbp > 0.050239 )
					if( bearPower <= -0.032835 )
						if( bbm <= 0.211289 )
							if( bbp <= 0.09341 )
								if( bearPower <= -0.052362 )
									ret := -0.142857
								if( bearPower > -0.052362 )
									ret := -0.918919 // sell
							if( bbp > 0.09341 )
								ret := 0.333333
						if( bbm > 0.211289 )
							ret := 0.571429
					if( bearPower > -0.032835 )
						if( bullPower <= 0.158847 )
							if( bbp <= 0.262812 )
								if( bbm <= 0.01 )
									ret := -0.274590
								if( bbm > 0.01 )
									ret := -0.026260
							if( bbp > 0.262812 )
								if( bearPower <= 0.116511 )
									ret := -0.916667 // sell
								if( bearPower > 0.116511 )
									ret := -0.444444
						if( bullPower > 0.158847 )
							if( bbp <= 0.222962 )
								ret := 0.400000
							if( bbp > 0.222962 )
								if( bbm <= 0.04311 )
									ret := 0.500000
								if( bbm > 0.04311 )
									ret := 1.000000 // buy
			if( bullPower > 0.165927 )
				if( bullPower <= 0.183377 )
					if( bbm <= 0.085915 )
						if( bearPower <= 0.093987 )
							ret := 1.000000 // buy
						if( bearPower > 0.093987 )
							if( bearPower <= 0.103347 )
								ret := -0.857143 // sell
							if( bearPower > 0.103347 )
								ret := -0.142857
					if( bbm > 0.085915 )
						if( bbm <= 0.199034 )
							if( bullPower <= 0.169071 )
								ret := -0.500000
							if( bullPower > 0.169071 )
								if( bbp <= 0.208423 )
									ret := -0.875000 // sell
								if( bbp > 0.208423 )
									ret := -1.000000 // sell
						if( bbm > 0.199034 )
							ret := -0.500000
				if( bullPower > 0.183377 )
					if( bbp <= 0.17102 )
						if( bearPower <= -0.033912 )
							if( bbm <= 0.259794 )
								ret := 0.750000 // buy
							if( bbm > 0.259794 )
								ret := 0.800000 // buy
						if( bearPower > -0.033912 )
							ret := 1.000000 // buy
					if( bbp > 0.17102 )
						if( bearPower <= 0.001309 )
							if( bbp <= 0.290371 )
								if( bullPower <= 0.218942 )
									ret := -0.555556
								if( bullPower > 0.218942 )
									ret := -0.875000 // sell
							if( bbp > 0.290371 )
								if( bbp <= 0.356499 )
									ret := 0.600000
								if( bbp > 0.356499 )
									ret := -0.687500
						if( bearPower > 0.001309 )
							if( bbp <= 0.265711 )
								if( bbm <= 0.149445 )
									ret := 0.923077 // buy
								if( bbm > 0.149445 )
									ret := 0.230769
							if( bbp > 0.265711 )
								if( bullPower <= 0.317079 )
									ret := -0.356481
								if( bullPower > 0.317079 )
									ret := 0.026786
	
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
float op_operation = decision_tree_0_LYFT_1Min_86b4996d(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


