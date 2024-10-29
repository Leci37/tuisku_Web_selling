//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: DOTUSDT_5Min_2BS0_4538c988 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_5Min_2BS0_4538c988", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_5Min_4538c988(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.072897 )
		if( bbm <= 0.079019 )
			if( rsi1 <= 16.8407 )
				if( d_k <= -3.43938 )
					if( smoothD_d <= 6.2991 )
						if( k <= 10.1497 )
							if( d_k <= -4.12083 )
								if( bearPower <= -0.069032 )
									ret := 0.250000
								if( bearPower > -0.069032 )
									ret := -0.500000
							if( d_k > -4.12083 )
								if( smoothD_d <= -0.830384 )
									ret := -0.750000 // sell
								if( smoothD_d > -0.830384 )
									ret := -1.000000 // sell
						if( k > 10.1497 )
							if( bbm <= 0.024602 )
								ret := -0.500000
							if( bbm > 0.024602 )
								ret := -1.000000 // sell
					if( smoothD_d > 6.2991 )
						if( smoothK_k <= 17.5087 )
							ret := 1.000000 // buy
						if( smoothK_k > 17.5087 )
							if( smoothK_k <= 41.4742 )
								if( d <= 18.4401 )
									ret := -0.642857
								if( d > 18.4401 )
									ret := 0.500000
							if( smoothK_k > 41.4742 )
								if( rsi1 <= 15.1419 )
									ret := -0.333333
								if( rsi1 > 15.1419 )
									ret := -1.000000 // sell
				if( d_k > -3.43938 )
					if( smoothD_d <= 1.85108 )
						if( rsi1 <= 2.43404 )
							if( d <= 0.036458 )
								ret := 0.500000
							if( d > 0.036458 )
								if( bullPower <= -0.030254 )
									ret := -0.947368 // sell
								if( bullPower > -0.030254 )
									ret := -0.333333
						if( rsi1 > 2.43404 )
							if( smoothD_d <= 0.709277 )
								if( bearPower <= -0.047352 )
									ret := 0.355263
								if( bearPower > -0.047352 )
									ret := -0.470588
							if( smoothD_d > 0.709277 )
								if( bbm <= 0.024104 )
									ret := 0.692308
								if( bbm > 0.024104 )
									ret := -0.319149
					if( smoothD_d > 1.85108 )
						if( k <= 44.4604 )
							if( d_k <= 3.295 )
								if( smoothK_k <= 7.86106 )
									ret := 0.541667
								if( smoothK_k > 7.86106 )
									ret := 0.923077 // buy
							if( d_k > 3.295 )
								if( k <= 0.273526 )
									ret := 0.726027 // buy
								if( k > 0.273526 )
									ret := 0.112000
						if( k > 44.4604 )
							ret := -0.833333 // sell
			if( rsi1 > 16.8407 )
				if( d <= 63.6363 )
					if( bbp <= -0.248523 )
						if( d_k <= 3.89056 )
							if( smoothK_k <= 42.0698 )
								if( smoothD_d <= -1.10934 )
									ret := -1.000000 // sell
								if( smoothD_d > -1.10934 )
									ret := -0.666667
							if( smoothK_k > 42.0698 )
								ret := 0.400000
						if( d_k > 3.89056 )
							if( k <= 17.774 )
								ret := 0.250000
							if( k > 17.774 )
								ret := 1.000000 // buy
					if( bbp > -0.248523 )
						if( rsi1 <= 45.5243 )
							if( d <= 3.95102 )
								if( d <= 1.06078 )
									ret := 0.137387
								if( d > 1.06078 )
									ret := -0.056983
							if( d > 3.95102 )
								if( smoothD_d <= 1.24886 )
									ret := 0.642857
								if( smoothD_d > 1.24886 )
									ret := 0.132055
						if( rsi1 > 45.5243 )
							if( smoothK_k <= 46.6717 )
								if( d <= 60.9616 )
									ret := -0.278689
								if( d > 60.9616 )
									ret := -1.000000 // sell
							if( smoothK_k > 46.6717 )
								if( d <= 51.9053 )
									ret := 1.000000 // buy
								if( d > 51.9053 )
									ret := 0.222222
				if( d > 63.6363 )
					if( smoothK_k <= 87.5019 )
						if( rsi1 <= 34.5279 )
							if( bbm <= 0.023167 )
								if( bbp <= -0.081633 )
									ret := -0.500000
								if( bbp > -0.081633 )
									ret := 0.666667
							if( bbm > 0.023167 )
								if( bullPower <= -0.01186 )
									ret := 0.606897
								if( bullPower > -0.01186 )
									ret := 0.000000
						if( rsi1 > 34.5279 )
							if( bbm <= 0.046097 )
								if( d_k <= 20.2316 )
									ret := 0.522293
								if( d_k > 20.2316 )
									ret := -0.500000
							if( bbm > 0.046097 )
								if( d_k <= -8.02308 )
									ret := -0.687500
								if( d_k > -8.02308 )
									ret := 0.093750
					if( smoothK_k > 87.5019 )
						if( k <= 98.622 )
							if( bbp <= -0.08981 )
								if( k <= 97.0124 )
									ret := 0.272727
								if( k > 97.0124 )
									ret := -0.636364
							if( bbp > -0.08981 )
								if( bullPower <= -0.029337 )
									ret := 0.333333
								if( bullPower > -0.029337 )
									ret := -0.538462
						if( k > 98.622 )
							if( smoothD_d <= 88.7811 )
								if( bearPower <= -0.064831 )
									ret := 1.000000 // buy
								if( bearPower > -0.064831 )
									ret := 0.571429
							if( smoothD_d > 88.7811 )
								if( bearPower <= -0.078621 )
									ret := 0.700000 // buy
								if( bearPower > -0.078621 )
									ret := -0.250000
		if( bbm > 0.079019 )
			if( smoothK_k <= -1.36204 )
				if( rsi1 <= 13.1234 )
					if( rsi1 <= 11.4835 )
						if( rsi1 <= 1.8111 )
							ret := 1.000000 // buy
						if( rsi1 > 1.8111 )
							if( bearPower <= -0.586327 )
								ret := 1.000000 // buy
							if( bearPower > -0.586327 )
								if( d_k <= 1.71947 )
									ret := 0.315789
								if( d_k > 1.71947 )
									ret := -0.444444
					if( rsi1 > 11.4835 )
						if( rsi1 <= 12.4825 )
							ret := -1.000000 // sell
						if( rsi1 > 12.4825 )
							ret := -0.250000
				if( rsi1 > 13.1234 )
					if( rsi1 <= 52.0396 )
						if( bullPower <= 0.010031 )
							if( d_k <= 0.805002 )
								if( d_k <= 0.237571 )
									ret := 0.782609 // buy
								if( d_k > 0.237571 )
									ret := -0.400000
							if( d_k > 0.805002 )
								if( rsi1 <= 23.6311 )
									ret := 0.920000 // buy
								if( rsi1 > 23.6311 )
									ret := 0.763636 // buy
						if( bullPower > 0.010031 )
							ret := 0.200000
					if( rsi1 > 52.0396 )
						ret := -0.500000
			if( smoothK_k > -1.36204 )
				if( d <= 6.28973 )
					if( rsi1 <= 31.7953 )
						if( bbm <= 0.124 )
							if( bearPower <= -0.23631 )
								ret := 1.000000 // buy
							if( bearPower > -0.23631 )
								if( d <= 1.37048 )
									ret := 1.000000 // buy
								if( d > 1.37048 )
									ret := -0.402597
						if( bbm > 0.124 )
							if( d <= 2.01029 )
								ret := -0.750000 // sell
							if( d > 2.01029 )
								ret := -1.000000 // sell
					if( rsi1 > 31.7953 )
						if( d_k <= -2.95809 )
							if( smoothD_d <= 0.036502 )
								ret := -0.333333
							if( smoothD_d > 0.036502 )
								if( d <= 5.70596 )
									ret := 0.647059
								if( d > 5.70596 )
									ret := -0.250000
						if( d_k > -2.95809 )
							if( k <= 2.17529 )
								ret := 0.400000
							if( k > 2.17529 )
								if( d <= 2.10211 )
									ret := 0.750000 // buy
								if( d > 2.10211 )
									ret := 1.000000 // buy
				if( d > 6.28973 )
					if( smoothK_k <= 9.9278 )
						if( smoothK_k <= 1.22824 )
							if( bearPower <= -0.231879 )
								ret := -1.000000 // sell
							if( bearPower > -0.231879 )
								if( smoothK_k <= 0.484686 )
									ret := 0.538462
								if( smoothK_k > 0.484686 )
									ret := -0.500000
						if( smoothK_k > 1.22824 )
							if( bullPower <= -0.122792 )
								ret := -0.500000
							if( bullPower > -0.122792 )
								if( bullPower <= -0.006658 )
									ret := 0.784173 // buy
								if( bullPower > -0.006658 )
									ret := 0.419355
					if( smoothK_k > 9.9278 )
						if( d <= 19.9654 )
							if( rsi1 <= 18.7174 )
								if( d <= 16.8068 )
									ret := 1.000000 // buy
								if( d > 16.8068 )
									ret := -0.250000
							if( rsi1 > 18.7174 )
								if( k <= 15.9317 )
									ret := -0.648148
								if( k > 15.9317 )
									ret := 0.197802
						if( d > 19.9654 )
							if( k <= 33.355 )
								if( rsi1 <= 38.4181 )
									ret := 0.608696
								if( rsi1 > 38.4181 )
									ret := -0.074074
							if( k > 33.355 )
								if( d_k <= 12.075 )
									ret := 0.175258
								if( d_k > 12.075 )
									ret := 0.687500
	if( bbp > -0.072897 )
		if( BBPower_Color <= 0.5 )
			if( bullPower <= 0.016797 )
				if( smoothK_k <= 88.4059 )
					if( bbm <= 0.010021 )
						if( smoothD_d <= 22.944 )
							if( rsi1 <= 50.4275 )
								if( bbp <= 0.007997 )
									ret := 0.026839
								if( bbp > 0.007997 )
									ret := 0.555556
							if( rsi1 > 50.4275 )
								if( d_k <= -18.4404 )
									ret := -0.476190
								if( d_k > -18.4404 )
									ret := 0.169034
						if( smoothD_d > 22.944 )
							if( d_k <= -24.0971 )
								if( rsi1 <= 63.4554 )
									ret := 0.268750
								if( rsi1 > 63.4554 )
									ret := -0.444444
							if( d_k > -24.0971 )
								if( rsi1 <= 45.3127 )
									ret := -0.035218
								if( rsi1 > 45.3127 )
									ret := 0.020504
					if( bbm > 0.010021 )
						if( smoothK_k <= 86.6999 )
							if( smoothK_k <= -1.42892 )
								if( smoothD_d <= 23.5045 )
									ret := 0.141862
								if( smoothD_d > 23.5045 )
									ret := -0.508197
							if( smoothK_k > -1.42892 )
								if( rsi1 <= 11.416 )
									ret := 0.404762
								if( rsi1 > 11.416 )
									ret := 0.064360
						if( smoothK_k > 86.6999 )
							if( rsi1 <= 54.1053 )
								if( bbm <= 0.03815 )
									ret := 0.151007
								if( bbm > 0.03815 )
									ret := 0.755556 // buy
							if( rsi1 > 54.1053 )
								if( bullPower <= 0.000797 )
									ret := -0.052632
								if( bullPower > 0.000797 )
									ret := 0.735043 // buy
				if( smoothK_k > 88.4059 )
					if( rsi1 <= 32.5393 )
						if( bearPower <= -0.030733 )
							if( k <= 95.8038 )
								if( bbp <= -0.056568 )
									ret := -1.000000 // sell
								if( bbp > -0.056568 )
									ret := -0.777778 // sell
							if( k > 95.8038 )
								if( d_k <= -1.20303 )
									ret := -0.636364
								if( d_k > -1.20303 )
									ret := 0.500000
						if( bearPower > -0.030733 )
							if( d_k <= -7.59375 )
								if( rsi1 <= 29.5953 )
									ret := -0.500000
								if( rsi1 > 29.5953 )
									ret := 0.631579
							if( d_k > -7.59375 )
								if( d_k <= -2.51072 )
									ret := -0.739130 // sell
								if( d_k > -2.51072 )
									ret := 0.153846
					if( rsi1 > 32.5393 )
						if( smoothD_d <= 91.1057 )
							if( smoothK_k <= 91.6362 )
								if( rsi1 <= 57.5388 )
									ret := -0.146732
								if( rsi1 > 57.5388 )
									ret := 0.350254
							if( smoothK_k > 91.6362 )
								if( bearPower <= -0.019594 )
									ret := 0.346570
								if( bearPower > -0.019594 )
									ret := 0.039903
						if( smoothD_d > 91.1057 )
							if( d_k <= -4.25956 )
								if( bullPower <= 0.01189 )
									ret := -0.533333
								if( bullPower > 0.01189 )
									ret := 0.222222
							if( d_k > -4.25956 )
								if( k <= 99.7171 )
									ret := -0.108502
								if( k > 99.7171 )
									ret := 0.206009
			if( bullPower > 0.016797 )
				if( k <= 69.6297 )
					if( bbm <= 0.036657 )
						if( d_k <= -23.648 )
							ret := 1.000000 // buy
						if( d_k > -23.648 )
							if( smoothK_k <= 65.8263 )
								if( d <= 70.5531 )
									ret := 0.130346
								if( d > 70.5531 )
									ret := 0.546667
							if( smoothK_k > 65.8263 )
								if( bullPower <= 0.022462 )
									ret := -0.142857
								if( bullPower > 0.022462 )
									ret := -1.000000 // sell
					if( bbm > 0.036657 )
						if( smoothK_k <= 3.28268 )
							if( smoothK_k <= -1.61829 )
								if( d <= 1.14224 )
									ret := -0.500000
								if( d > 1.14224 )
									ret := 0.239437
							if( smoothK_k > -1.61829 )
								if( d_k <= -2.51094 )
									ret := 0.500000
								if( d_k > -2.51094 )
									ret := -0.733333 // sell
						if( smoothK_k > 3.28268 )
							if( smoothD_d <= 48.6552 )
								if( smoothD_d <= 46.6529 )
									ret := 0.040305
								if( smoothD_d > 46.6529 )
									ret := 0.750000 // buy
							if( smoothD_d > 48.6552 )
								if( rsi1 <= 64.8384 )
									ret := -0.203966
								if( rsi1 > 64.8384 )
									ret := 0.461538
				if( k > 69.6297 )
					if( k <= 99.9065 )
						if( bbp <= -0.056413 )
							if( bullPower <= 0.022166 )
								ret := -1.000000 // sell
							if( bullPower > 0.022166 )
								ret := 0.000000
						if( bbp > -0.056413 )
							if( d_k <= -1.52012 )
								if( bullPower <= 0.043736 )
									ret := 0.160267
								if( bullPower > 0.043736 )
									ret := 0.541667
							if( d_k > -1.52012 )
								if( rsi1 <= 49.8956 )
									ret := 0.170000
								if( rsi1 > 49.8956 )
									ret := 0.451664
					if( k > 99.9065 )
						if( bbp <= -0.011562 )
							ret := 0.666667
						if( bbp > -0.011562 )
							if( d_k <= -0.289684 )
								if( rsi1 <= 50.5301 )
									ret := 0.100000
								if( rsi1 > 50.5301 )
									ret := -0.684211
							if( d_k > -0.289684 )
								if( d_k <= -0.033574 )
									ret := 0.857143 // buy
								if( d_k > -0.033574 )
									ret := -0.500000
		if( BBPower_Color > 0.5 )
			if( bbm <= 0.015578 )
				if( rsi1 <= 81.0436 )
					if( bullPower <= 0.039186 )
						if( d <= 75.2436 )
							if( bearPower <= 0.006889 )
								if( bearPower <= -0.007397 )
									ret := 0.625000
								if( bearPower > -0.007397 )
									ret := 0.001719
							if( bearPower > 0.006889 )
								if( rsi1 <= 63.6149 )
									ret := 0.118236
								if( rsi1 > 63.6149 )
									ret := -0.007328
						if( d > 75.2436 )
							if( bbm <= 0.015276 )
								if( smoothK_k <= 60.7014 )
									ret := 0.136585
								if( smoothK_k > 60.7014 )
									ret := -0.018561
							if( bbm > 0.015276 )
								if( d_k <= -17.4509 )
									ret := 1.000000 // buy
								if( d_k > -17.4509 )
									ret := -0.267176
					if( bullPower > 0.039186 )
						if( d_k <= -0.509221 )
							if( d_k <= -3.40291 )
								if( rsi1 <= 80.4568 )
									ret := -0.270492
								if( rsi1 > 80.4568 )
									ret := 0.625000
							if( d_k > -3.40291 )
								if( d_k <= -2.72531 )
									ret := 0.727273 // buy
								if( d_k > -2.72531 )
									ret := 0.281250
						if( d_k > -0.509221 )
							if( d_k <= 2.76734 )
								if( rsi1 <= 77.1037 )
									ret := -0.457627
								if( rsi1 > 77.1037 )
									ret := -0.884615 // sell
							if( d_k > 2.76734 )
								if( rsi1 <= 79.1352 )
									ret := 0.189189
								if( rsi1 > 79.1352 )
									ret := -0.800000 // sell
				if( rsi1 > 81.0436 )
					if( d <= 64.4463 )
						if( d <= 51.8562 )
							if( bullPower <= 0.027975 )
								if( bbm <= 0.009 )
									ret := 0.000000
								if( bbm > 0.009 )
									ret := 0.250000
							if( bullPower > 0.027975 )
								ret := -0.250000
						if( d > 51.8562 )
							if( bbp <= 0.0196 )
								ret := 0.000000
							if( bbp > 0.0196 )
								if( bullPower <= 0.038266 )
									ret := 0.909091 // buy
								if( bullPower > 0.038266 )
									ret := 0.500000
					if( d > 64.4463 )
						if( smoothK_k <= 75.5123 )
							if( smoothD_d <= 65.2552 )
								if( bearPower <= 0.020402 )
									ret := -0.571429
								if( bearPower > 0.020402 )
									ret := -0.833333 // sell
							if( smoothD_d > 65.2552 )
								if( d <= 77.8994 )
									ret := 0.206897
								if( d > 77.8994 )
									ret := 0.805556 // buy
						if( smoothK_k > 75.5123 )
							if( smoothD_d <= 79.1217 )
								if( bullPower <= 0.028477 )
									ret := 0.040000
								if( bullPower > 0.028477 )
									ret := 0.692308
							if( smoothD_d > 79.1217 )
								if( d <= 94.0156 )
									ret := -0.078873
								if( d > 94.0156 )
									ret := 0.086712
			if( bbm > 0.015578 )
				if( bbm <= 0.071674 )
					if( k <= 34.5335 )
						if( rsi1 <= 75.4841 )
							if( bullPower <= 0.062414 )
								if( smoothD_d <= 15.2151 )
									ret := 0.054497
								if( smoothD_d > 15.2151 )
									ret := -0.035883
							if( bullPower > 0.062414 )
								if( k <= 32.3454 )
									ret := -0.307420
								if( k > 32.3454 )
									ret := 0.263158
						if( rsi1 > 75.4841 )
							if( bbm <= 0.025457 )
								if( bullPower <= 0.030906 )
									ret := 0.500000
								if( bullPower > 0.030906 )
									ret := -0.333333
							if( bbm > 0.025457 )
								if( bullPower <= 0.115774 )
									ret := 0.679487
								if( bullPower > 0.115774 )
									ret := -0.500000
					if( k > 34.5335 )
						if( rsi1 <= 63.4838 )
							if( bbp <= 0.016313 )
								if( rsi1 <= 44.4764 )
									ret := 0.183601
								if( rsi1 > 44.4764 )
									ret := 0.006991
							if( bbp > 0.016313 )
								if( d_k <= -20.0363 )
									ret := -0.101010
								if( d_k > -20.0363 )
									ret := 0.130529
						if( rsi1 > 63.4838 )
							if( d_k <= 8.00925 )
								if( bbp <= 0.095328 )
									ret := -0.004805
								if( bbp > 0.095328 )
									ret := 0.088731
							if( d_k > 8.00925 )
								if( d_k <= 8.77888 )
									ret := 0.412000
								if( d_k > 8.77888 )
									ret := 0.103792
				if( bbm > 0.071674 )
					if( d_k <= -26.1059 )
						if( bbp <= 0.159831 )
							if( bullPower <= 0.058574 )
								ret := -0.750000 // sell
							if( bullPower > 0.058574 )
								if( k <= 77.0129 )
									ret := -0.750000 // sell
								if( k > 77.0129 )
									ret := -1.000000 // sell
						if( bbp > 0.159831 )
							if( bbm <= 0.079223 )
								ret := 0.000000
							if( bbm > 0.079223 )
								ret := -1.000000 // sell
					if( d_k > -26.1059 )
						if( smoothD_d <= 96.9238 )
							if( d <= 98.0797 )
								if( rsi1 <= 84.5576 )
									ret := -0.021891
								if( rsi1 > 84.5576 )
									ret := -0.445652
							if( d > 98.0797 )
								if( bbm <= 0.082977 )
									ret := -0.045455
								if( bbm > 0.082977 )
									ret := 0.476190
						if( smoothD_d > 96.9238 )
							if( bbm <= 0.077001 )
								if( bbp <= 0.222047 )
									ret := 0.500000
								if( bbp > 0.222047 )
									ret := -0.500000
							if( bbm > 0.077001 )
								if( bbm <= 0.1025 )
									ret := -1.000000 // sell
								if( bbm > 0.1025 )
									ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_DOTUSDT_5Min_4538c988(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


