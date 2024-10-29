//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: DOTUSDT_15Min_2BS0_3b01c574 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2BS0_3b01c574", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_3b01c574(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 45.0616 )
		if( rsi1 <= 49.9334 )
			if( bearPower <= -0.052718 )
				if( d <= 29.522 )
					if( bbp <= -0.139051 )
						if( rsi1 <= 33.3349 )
							if( d_k <= -1.77262 )
								if( smoothD_d <= 21.7078 )
									ret := -0.224299
								if( smoothD_d > 21.7078 )
									ret := 0.188119
							if( d_k > -1.77262 )
								if( rsi1 <= 20.584 )
									ret := -0.032338
								if( rsi1 > 20.584 )
									ret := 0.199222
						if( rsi1 > 33.3349 )
							if( d_k <= -12.0988 )
								if( d <= 19.0484 )
									ret := -0.725000 // sell
								if( d > 19.0484 )
									ret := 0.408163
							if( d_k > -12.0988 )
								if( smoothK_k <= 24.5686 )
									ret := 0.285509
								if( smoothK_k > 24.5686 )
									ret := 0.676190
					if( bbp > -0.139051 )
						if( rsi1 <= 28.4371 )
							if( rsi1 <= 16.5709 )
								if( bullPower <= -0.021777 )
									ret := -0.720930 // sell
								if( bullPower > -0.021777 )
									ret := -0.952830 // sell
							if( rsi1 > 16.5709 )
								if( d_k <= -9.29302 )
									ret := -0.795082 // sell
								if( d_k > -9.29302 )
									ret := -0.364698
						if( rsi1 > 28.4371 )
							if( rsi1 <= 33.7324 )
								if( bullPower <= -0.033938 )
									ret := 0.072340
								if( bullPower > -0.033938 )
									ret := -0.236275
							if( rsi1 > 33.7324 )
								if( d_k <= -10.94 )
									ret := -0.302778
								if( d_k > -10.94 )
									ret := 0.087603
				if( d > 29.522 )
					if( smoothK_k <= 30.8665 )
						if( rsi1 <= 32.3262 )
							if( bearPower <= -0.124424 )
								if( smoothD_d <= 38.6374 )
									ret := 0.357724
								if( smoothD_d > 38.6374 )
									ret := -0.196429
							if( bearPower > -0.124424 )
								if( d_k <= 12.9397 )
									ret := -0.088496
								if( d_k > 12.9397 )
									ret := -0.544715
						if( rsi1 > 32.3262 )
							if( rsi1 <= 37.9968 )
								if( d_k <= 22.983 )
									ret := 0.484848
								if( d_k > 22.983 )
									ret := -0.018868
							if( rsi1 > 37.9968 )
								if( bbp <= -0.180749 )
									ret := -0.523077
								if( bbp > -0.180749 )
									ret := 0.043257
					if( smoothK_k > 30.8665 )
						if( smoothD_d <= 34.4626 )
							if( smoothD_d <= 28.3085 )
								if( smoothK_k <= 41.2319 )
									ret := 0.131313
								if( smoothK_k > 41.2319 )
									ret := 1.000000 // buy
							if( smoothD_d > 28.3085 )
								if( bearPower <= -0.088803 )
									ret := 0.726744 // buy
								if( bearPower > -0.088803 )
									ret := 0.409524
						if( smoothD_d > 34.4626 )
							if( bbm <= 0.142554 )
								if( rsi1 <= 26.2689 )
									ret := -0.185714
								if( rsi1 > 26.2689 )
									ret := 0.322034
							if( bbm > 0.142554 )
								if( rsi1 <= 32.4174 )
									ret := 0.412698
								if( rsi1 > 32.4174 )
									ret := -0.327273
			if( bearPower > -0.052718 )
				if( bearPower <= 0.000743 )
					if( rsi1 <= 36.3271 )
						if( bbp <= 0.002063 )
							if( rsi1 <= 28.5656 )
								if( bbm <= 0.011 )
									ret := -0.281520
								if( bbm > 0.011 )
									ret := -0.628553
							if( rsi1 > 28.5656 )
								if( bullPower <= 0.003472 )
									ret := -0.256559
								if( bullPower > 0.003472 )
									ret := -0.527523
						if( bbp > 0.002063 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 35.9497 )
									ret := -1.000000 // sell
								if( rsi1 > 35.9497 )
									ret := -0.666667
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.010321 )
									ret := -0.515581
								if( bbp > 0.010321 )
									ret := -0.809412 // sell
					if( rsi1 > 36.3271 )
						if( bbp <= 0.003936 )
							if( rsi1 <= 42.566 )
								if( bbp <= -0.028507 )
									ret := -0.041173
								if( bbp > -0.028507 )
									ret := -0.224372
							if( rsi1 > 42.566 )
								if( bbp <= -0.028688 )
									ret := 0.198682
								if( bbp > -0.028688 )
									ret := -0.025725
						if( bbp > 0.003936 )
							if( rsi1 <= 42.1044 )
								if( bullPower <= 0.01237 )
									ret := -0.320574
								if( bullPower > 0.01237 )
									ret := -0.606322
							if( rsi1 > 42.1044 )
								if( bullPower <= 0.015419 )
									ret := -0.082222
								if( bullPower > 0.015419 )
									ret := -0.378070
				if( bearPower > 0.000743 )
					if( bbm <= 0.013 )
						if( bullPower <= 0.014915 )
							if( BBPower_Color <= 0.5 )
								ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								if( d_k <= 16.67 )
									ret := -0.274131
								if( d_k > 16.67 )
									ret := -0.061538
						if( bullPower > 0.014915 )
							if( rsi1 <= 39.1405 )
								if( bbp <= 0.027483 )
									ret := -0.709677 // sell
								if( bbp > 0.027483 )
									ret := -1.000000 // sell
							if( rsi1 > 39.1405 )
								if( rsi1 <= 44.9026 )
									ret := -0.470588
								if( rsi1 > 44.9026 )
									ret := -0.189873
					if( bbm > 0.013 )
						if( rsi1 <= 38.9969 )
							if( d_k <= -5.44299 )
								ret := 0.000000
							if( d_k > -5.44299 )
								if( smoothD_d <= 30.5623 )
									ret := -0.908277 // sell
								if( smoothD_d > 30.5623 )
									ret := -0.755319 // sell
						if( rsi1 > 38.9969 )
							if( bullPower <= 0.217829 )
								if( bullPower <= 0.038975 )
									ret := -0.532258
								if( bullPower > 0.038975 )
									ret := -0.737006 // sell
							if( bullPower > 0.217829 )
								if( rsi1 <= 47.4891 )
									ret := -0.500000
								if( rsi1 > 47.4891 )
									ret := 1.000000 // buy
		if( rsi1 > 49.9334 )
			if( BBPower_Color <= 0.5 )
				if( rsi1 <= 56.3927 )
					if( bullPower <= -0.003328 )
						if( bearPower <= -0.042672 )
							if( rsi1 <= 56.106 )
								if( smoothK_k <= 44.1569 )
									ret := 0.739130 // buy
								if( smoothK_k > 44.1569 )
									ret := -0.600000
							if( rsi1 > 56.106 )
								ret := -0.400000
						if( bearPower > -0.042672 )
							if( smoothD_d <= 29.6661 )
								if( d_k <= 5.34854 )
									ret := 0.235849
								if( d_k > 5.34854 )
									ret := -0.294118
							if( smoothD_d > 29.6661 )
								if( d <= 57.5817 )
									ret := 0.688312
								if( d > 57.5817 )
									ret := -0.250000
					if( bullPower > -0.003328 )
						if( bbp <= 0.032037 )
							if( d_k <= -6.83312 )
								if( bbp <= -0.036274 )
									ret := 0.359551
								if( bbp > -0.036274 )
									ret := -0.042929
							if( d_k > -6.83312 )
								if( rsi1 <= 50.0094 )
									ret := 0.020576
								if( rsi1 > 50.0094 )
									ret := 0.302205
						if( bbp > 0.032037 )
							if( bearPower <= 0.004588 )
								if( smoothK_k <= 40.4764 )
									ret := -0.222222
								if( smoothK_k > 40.4764 )
									ret := 1.000000 // buy
							if( bearPower > 0.004588 )
								if( smoothK_k <= -2.52835 )
									ret := 0.428571
								if( smoothK_k > -2.52835 )
									ret := -0.720930 // sell
				if( rsi1 > 56.3927 )
					if( bearPower <= -0.141587 )
						if( smoothK_k <= 30.558 )
							ret := -1.000000 // sell
						if( smoothK_k > 30.558 )
							ret := -0.500000
					if( bearPower > -0.141587 )
						if( smoothD_d <= 35.3173 )
							if( bbp <= 0.000309 )
								if( bearPower <= -0.020087 )
									ret := 0.630435
								if( bearPower > -0.020087 )
									ret := 0.314286
							if( bbp > 0.000309 )
								if( d_k <= 16.2843 )
									ret := 0.792000 // buy
								if( d_k > 16.2843 )
									ret := -0.666667
						if( smoothD_d > 35.3173 )
							if( bbm <= 0.042514 )
								if( d_k <= 2.08808 )
									ret := 0.750000 // buy
								if( d_k > 2.08808 )
									ret := 0.320611
							if( bbm > 0.042514 )
								if( smoothK_k <= 43.4381 )
									ret := -0.122951
								if( smoothK_k > 43.4381 )
									ret := 0.941176 // buy
			if( BBPower_Color > 0.5 )
				if( bearPower <= 0.012691 )
					if( rsi1 <= 56.4142 )
						if( bearPower <= 0.004518 )
							if( bbp <= 0.037101 )
								if( k <= 3.32739 )
									ret := 0.326087
								if( k > 3.32739 )
									ret := -0.042354
							if( bbp > 0.037101 )
								if( smoothD_d <= 15.7424 )
									ret := -0.113333
								if( smoothD_d > 15.7424 )
									ret := -0.400585
						if( bearPower > 0.004518 )
							if( bbm <= 0.020138 )
								if( rsi1 <= 50.6028 )
									ret := -0.369565
								if( rsi1 > 50.6028 )
									ret := -0.104000
							if( bbm > 0.020138 )
								if( rsi1 <= 54.5421 )
									ret := -0.524164
								if( rsi1 > 54.5421 )
									ret := -0.190000
					if( rsi1 > 56.4142 )
						if( bbm <= 0.103729 )
							if( smoothD_d <= 16.6286 )
								if( smoothD_d <= 5.15466 )
									ret := 0.046512
								if( smoothD_d > 5.15466 )
									ret := 0.291101
							if( smoothD_d > 16.6286 )
								if( smoothD_d <= 46.5286 )
									ret := 0.066450
								if( smoothD_d > 46.5286 )
									ret := 0.273869
						if( bbm > 0.103729 )
							if( smoothD_d <= 9.59484 )
								if( smoothK_k <= -0.363801 )
									ret := -0.400000
								if( smoothK_k > -0.363801 )
									ret := 0.607143
							if( smoothD_d > 9.59484 )
								if( d_k <= 19.303 )
									ret := -0.469388
								if( d_k > 19.303 )
									ret := 0.583333
				if( bearPower > 0.012691 )
					if( rsi1 <= 65.75 )
						if( rsi1 <= 56.5813 )
							if( bearPower <= 0.022942 )
								if( d_k <= 19.2264 )
									ret := -0.507508
								if( d_k > 19.2264 )
									ret := -0.181818
							if( bearPower > 0.022942 )
								if( rsi1 <= 54.2545 )
									ret := -0.759717 // sell
								if( rsi1 > 54.2545 )
									ret := -0.591398
						if( rsi1 > 56.5813 )
							if( bullPower <= 0.076593 )
								if( smoothD_d <= 6.75486 )
									ret := -0.536000
								if( smoothD_d > 6.75486 )
									ret := -0.105932
							if( bullPower > 0.076593 )
								if( bbm <= 0.049701 )
									ret := -0.672727
								if( bbm > 0.049701 )
									ret := -0.319502
					if( rsi1 > 65.75 )
						if( smoothD_d <= 28.9872 )
							if( bearPower <= 0.104892 )
								if( d_k <= 15.1802 )
									ret := 0.096618
								if( d_k > 15.1802 )
									ret := -0.372881
							if( bearPower > 0.104892 )
								if( bbm <= 0.0557 )
									ret := 0.500000
								if( bbm > 0.0557 )
									ret := -0.931818 // sell
						if( smoothD_d > 28.9872 )
							if( rsi1 <= 74.6489 )
								if( bearPower <= 0.060702 )
									ret := 0.302013
								if( bearPower > 0.060702 )
									ret := -0.225806
							if( rsi1 > 74.6489 )
								if( bbm <= 0.030033 )
									ret := 0.333333
								if( bbm > 0.030033 )
									ret := 0.784483 // buy
	if( smoothK_k > 45.0616 )
		if( k <= 86.0377 )
			if( rsi1 <= 63.897 )
				if( bbp <= -0.011746 )
					if( bbp <= -0.055929 )
						if( d_k <= -5.49694 )
							if( rsi1 <= 40.0013 )
								if( bullPower <= -0.031149 )
									ret := 0.340278
								if( bullPower > -0.031149 )
									ret := -0.008989
							if( rsi1 > 40.0013 )
								if( rsi1 <= 48.9549 )
									ret := 0.525874
								if( rsi1 > 48.9549 )
									ret := 0.833729 // buy
						if( d_k > -5.49694 )
							if( bbm <= 0.099226 )
								if( rsi1 <= 37.6944 )
									ret := 0.007890
								if( rsi1 > 37.6944 )
									ret := 0.405751
							if( bbm > 0.099226 )
								if( d <= 88.393 )
									ret := 0.061261
								if( d > 88.393 )
									ret := -0.488889
					if( bbp > -0.055929 )
						if( smoothK_k <= 72.0993 )
							if( smoothD_d <= 26.5546 )
								if( rsi1 <= 45.7907 )
									ret := -0.651163
								if( rsi1 > 45.7907 )
									ret := 0.310345
							if( smoothD_d > 26.5546 )
								if( bbm <= 0.020865 )
									ret := 0.069355
								if( bbm > 0.020865 )
									ret := 0.167021
						if( smoothK_k > 72.0993 )
							if( rsi1 <= 47.7782 )
								if( rsi1 <= 39.1658 )
									ret := -0.148571
								if( rsi1 > 39.1658 )
									ret := 0.169261
							if( rsi1 > 47.7782 )
								if( bbm <= 0.015329 )
									ret := 0.150000
								if( bbm > 0.015329 )
									ret := 0.451724
				if( bbp > -0.011746 )
					if( rsi1 <= 45.1833 )
						if( bbm <= 0.128308 )
							if( d_k <= -7.00939 )
								if( smoothK_k <= 48.763 )
									ret := 0.333333
								if( smoothK_k > 48.763 )
									ret := -0.145278
							if( d_k > -7.00939 )
								if( bullPower <= 0.010053 )
									ret := -0.168803
								if( bullPower > 0.010053 )
									ret := -0.488636
						if( bbm > 0.128308 )
							if( d_k <= -5.97839 )
								if( d_k <= -8.63484 )
									ret := 0.400000
								if( d_k > -8.63484 )
									ret := -0.888889 // sell
							if( d_k > -5.97839 )
								if( bbm <= 0.140599 )
									ret := 0.625000
								if( bbm > 0.140599 )
									ret := 1.000000 // buy
					if( rsi1 > 45.1833 )
						if( bearPower <= 0.002368 )
							if( smoothD_d <= 52.758 )
								if( BBPower_Color <= 0.5 )
									ret := 0.115979
								if( BBPower_Color > 0.5 )
									ret := -0.137615
							if( smoothD_d > 52.758 )
								if( bearPower <= -0.00835 )
									ret := 0.218562
								if( bearPower > -0.00835 )
									ret := 0.070888
						if( bearPower > 0.002368 )
							if( bbp <= 0.087953 )
								if( rsi1 <= 55.5013 )
									ret := -0.197309
								if( rsi1 > 55.5013 )
									ret := -0.003935
							if( bbp > 0.087953 )
								if( d <= 84.0155 )
									ret := -0.344565
								if( d > 84.0155 )
									ret := 0.013793
			if( rsi1 > 63.897 )
				if( BBPower_Color <= 0.5 )
					if( bbm <= 0.009005 )
						if( bbp <= -0.011692 )
							if( smoothK_k <= 72.2784 )
								ret := 1.000000 // buy
							if( smoothK_k > 72.2784 )
								ret := 0.750000 // buy
						if( bbp > -0.011692 )
							if( bbp <= -0.000657 )
								if( smoothK_k <= 73.7947 )
									ret := 0.235294
								if( smoothK_k > 73.7947 )
									ret := 0.000000
							if( bbp > -0.000657 )
								ret := 0.750000 // buy
					if( bbm > 0.009005 )
						if( d <= 68.3271 )
							if( bbp <= -9e-06 )
								if( k <= 71.239 )
									ret := 0.629630
								if( k > 71.239 )
									ret := 0.845679 // buy
							if( bbp > -9e-06 )
								if( rsi1 <= 64.98 )
									ret := 0.684211
								if( rsi1 > 64.98 )
									ret := 0.975610 // buy
						if( d > 68.3271 )
							if( k <= 57.8312 )
								if( smoothK_k <= 52.4279 )
									ret := -0.250000
								if( smoothK_k > 52.4279 )
									ret := -1.000000 // sell
							if( k > 57.8312 )
								if( smoothD_d <= 82.0533 )
									ret := 0.514286
								if( smoothD_d > 82.0533 )
									ret := 0.893204 // buy
				if( BBPower_Color > 0.5 )
					if( rsi1 <= 70.2707 )
						if( bearPower <= 0.017752 )
							if( smoothD_d <= 69.7475 )
								if( bearPower <= -0.00429 )
									ret := 0.386831
								if( bearPower > -0.00429 )
									ret := 0.075812
							if( smoothD_d > 69.7475 )
								if( bbm <= 0.012063 )
									ret := 0.100559
								if( bbm > 0.012063 )
									ret := 0.350706
						if( bearPower > 0.017752 )
							if( d <= 85.1542 )
								if( bbp <= 0.119043 )
									ret := 0.032990
								if( bbp > 0.119043 )
									ret := -0.236504
							if( d > 85.1542 )
								if( d_k <= 6.66278 )
									ret := -0.087500
								if( d_k > 6.66278 )
									ret := 0.552239
					if( rsi1 > 70.2707 )
						if( bbp <= 0.106865 )
							if( rsi1 <= 73.5556 )
								if( d_k <= 5.37218 )
									ret := 0.254113
								if( d_k > 5.37218 )
									ret := 0.505952
							if( rsi1 > 73.5556 )
								if( bbm <= 0.020018 )
									ret := 0.320988
								if( bbm > 0.020018 )
									ret := 0.581117
						if( bbp > 0.106865 )
							if( d_k <= 8.89087 )
								if( bullPower <= 0.290159 )
									ret := 0.045012
								if( bullPower > 0.290159 )
									ret := 0.607843
							if( d_k > 8.89087 )
								if( smoothK_k <= 57.9778 )
									ret := 0.259259
								if( smoothK_k > 57.9778 )
									ret := 0.658120
		if( k > 86.0377 )
			if( BBPower_Color <= 0.5 )
				if( rsi1 <= 55.6006 )
					if( bbp <= -0.05606 )
						if( rsi1 <= 35.3007 )
							if( bullPower <= -0.054086 )
								if( rsi1 <= 31.1477 )
									ret := 0.096774
								if( rsi1 > 31.1477 )
									ret := 0.758621 // buy
							if( bullPower > -0.054086 )
								if( k <= 87.8353 )
									ret := 0.458333
								if( k > 87.8353 )
									ret := -0.273684
						if( rsi1 > 35.3007 )
							if( rsi1 <= 45.633 )
								if( bullPower <= -0.006615 )
									ret := 0.589085
								if( bullPower > -0.006615 )
									ret := -0.031746
							if( rsi1 > 45.633 )
								if( bullPower <= 0.001612 )
									ret := 0.795620 // buy
								if( bullPower > 0.001612 )
									ret := 0.475248
					if( bbp > -0.05606 )
						if( rsi1 <= 50.0013 )
							if( d_k <= -1.81777 )
								if( bullPower <= 0.001922 )
									ret := 0.087420
								if( bullPower > 0.001922 )
									ret := -0.199161
							if( d_k > -1.81777 )
								if( bbp <= -0.033414 )
									ret := 0.427711
								if( bbp > -0.033414 )
									ret := 0.102828
						if( rsi1 > 50.0013 )
							if( bbm <= 0.015062 )
								if( bbm <= 0.010166 )
									ret := 0.021277
								if( bbm > 0.010166 )
									ret := 0.206612
							if( bbm > 0.015062 )
								if( bbp <= -0.004393 )
									ret := 0.481994
								if( bbp > -0.004393 )
									ret := 0.096447
				if( rsi1 > 55.6006 )
					if( rsi1 <= 65.4339 )
						if( bbp <= -0.020217 )
							if( bbp <= -0.402447 )
								ret := -1.000000 // sell
							if( bbp > -0.402447 )
								if( bbm <= 0.016069 )
									ret := 0.493151
								if( bbm > 0.016069 )
									ret := 0.781457 // buy
						if( bbp > -0.020217 )
							if( bullPower <= 0.005199 )
								if( bbm <= 0.016026 )
									ret := 0.181818
								if( bbm > 0.016026 )
									ret := 0.647059
							if( bullPower > 0.005199 )
								if( bbp <= 0.029939 )
									ret := 0.574920
								if( bbp > 0.029939 )
									ret := 0.353535
					if( rsi1 > 65.4339 )
						if( bbm <= 0.013 )
							if( rsi1 <= 68.5839 )
								if( bullPower <= 0.005438 )
									ret := 0.196429
								if( bullPower > 0.005438 )
									ret := 1.000000 // buy
							if( rsi1 > 68.5839 )
								if( rsi1 <= 76.2509 )
									ret := 0.571429
								if( rsi1 > 76.2509 )
									ret := 0.847458 // buy
						if( bbm > 0.013 )
							if( rsi1 <= 74.8165 )
								if( bbm <= 0.058553 )
									ret := 0.885519 // buy
								if( bbm > 0.058553 )
									ret := 0.738462 // buy
							if( rsi1 > 74.8165 )
								if( d_k <= 3.45147 )
									ret := 0.972644 // buy
								if( d_k > 3.45147 )
									ret := 0.666667
			if( BBPower_Color > 0.5 )
				if( d <= 91.6487 )
					if( rsi1 <= 70.0982 )
						if( bullPower <= 0.055197 )
							if( rsi1 <= 64.2754 )
								if( smoothK_k <= 93.3165 )
									ret := -0.075990
								if( smoothK_k > 93.3165 )
									ret := 0.142202
							if( rsi1 > 64.2754 )
								if( bbm <= 0.020637 )
									ret := 0.122034
								if( bbm > 0.020637 )
									ret := 0.336000
						if( bullPower > 0.055197 )
							if( d <= 77.5871 )
								if( bearPower <= -1.4e-05 )
									ret := -0.068966
								if( bearPower > -1.4e-05 )
									ret := -0.573964
							if( d > 77.5871 )
								if( d <= 87.7445 )
									ret := -0.081395
								if( d > 87.7445 )
									ret := -0.299663
					if( rsi1 > 70.0982 )
						if( bullPower <= 0.092441 )
							if( rsi1 <= 77.0027 )
								if( d_k <= 0.207252 )
									ret := 0.297101
								if( d_k > 0.207252 )
									ret := 0.615942
							if( rsi1 > 77.0027 )
								if( d_k <= -2.98918 )
									ret := 0.714628 // buy
								if( d_k > -2.98918 )
									ret := 0.443114
						if( bullPower > 0.092441 )
							if( rsi1 <= 77.7895 )
								if( d <= 84.1644 )
									ret := 0.386667
								if( d > 84.1644 )
									ret := -0.217822
							if( rsi1 > 77.7895 )
								if( d <= 88.3925 )
									ret := 0.534483
								if( d > 88.3925 )
									ret := 0.211765
				if( d > 91.6487 )
					if( bbm <= 0.059999 )
						if( rsi1 <= 70.1981 )
							if( bbp <= 0.061513 )
								if( rsi1 <= 61.2108 )
									ret := -0.023681
								if( rsi1 > 61.2108 )
									ret := 0.293639
							if( bbp > 0.061513 )
								if( rsi1 <= 62.1683 )
									ret := -0.333333
								if( rsi1 > 62.1683 )
									ret := 0.036932
						if( rsi1 > 70.1981 )
							if( bbm <= 0.011047 )
								if( rsi1 <= 81.2149 )
									ret := 0.146875
								if( rsi1 > 81.2149 )
									ret := 0.508333
							if( bbm > 0.011047 )
								if( bearPower <= 0.040447 )
									ret := 0.655668
								if( bearPower > 0.040447 )
									ret := 0.447059
					if( bbm > 0.059999 )
						if( smoothD_d <= 96.5838 )
							if( k <= 95.4749 )
								if( k <= 93.6398 )
									ret := 0.161959
								if( k > 93.6398 )
									ret := 0.477273
							if( k > 95.4749 )
								if( rsi1 <= 66.5594 )
									ret := -0.305994
								if( rsi1 > 66.5594 )
									ret := 0.167160
						if( smoothD_d > 96.5838 )
							if( bearPower <= 0.015285 )
								if( rsi1 <= 61.4056 )
									ret := -0.285714
								if( rsi1 > 61.4056 )
									ret := 0.983051 // buy
							if( bearPower > 0.015285 )
								if( rsi1 <= 62.5105 )
									ret := -1.000000 // sell
								if( rsi1 > 62.5105 )
									ret := 0.435556
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_DOTUSDT_15Min_3b01c574(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


