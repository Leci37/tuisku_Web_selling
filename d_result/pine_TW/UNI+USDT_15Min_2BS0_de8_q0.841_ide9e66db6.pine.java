//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: UNIUSDT_15Min_2BS0_e9e66db6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2BS0_e9e66db6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_e9e66db6(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d <= 47.7563 )
		if( smoothD_d <= 8.38401 )
			if( rsi1 <= 38.0942 )
				if( bullPower <= -0.01742 )
					if( bullPower <= -0.078963 )
						if( k <= 6.44406 )
							if( d <= 0.330637 )
								if( k <= 0.611486 )
									ret := 0.409938
								if( k > 0.611486 )
									ret := 0.823529 // buy
							if( d > 0.330637 )
								if( bullPower <= -0.11119 )
									ret := -0.071672
								if( bullPower > -0.11119 )
									ret := 0.158416
						if( k > 6.44406 )
							if( bearPower <= -0.208239 )
								if( d_k <= 0.120049 )
									ret := -0.504065
								if( d_k > 0.120049 )
									ret := -0.935484 // sell
							if( bearPower > -0.208239 )
								if( bullPower <= -0.096546 )
									ret := 0.160000
								if( bullPower > -0.096546 )
									ret := -0.518519
					if( bullPower > -0.078963 )
						if( rsi1 <= 23.9947 )
							if( rsi1 <= 16.1889 )
								if( bbm <= 0.044936 )
									ret := -0.500000
								if( bbm > 0.044936 )
									ret := -0.728311 // sell
							if( rsi1 > 16.1889 )
								if( bullPower <= -0.032851 )
									ret := -0.279650
								if( bullPower > -0.032851 )
									ret := -0.619366
						if( rsi1 > 23.9947 )
							if( k <= 12.6532 )
								if( smoothD_d <= -1.54893 )
									ret := -0.341026
								if( smoothD_d > -1.54893 )
									ret := 0.004060
							if( k > 12.6532 )
								if( bbm <= 0.092328 )
									ret := -0.522184
								if( bbm > 0.092328 )
									ret := -0.071429
				if( bullPower > -0.01742 )
					if( bbp <= 0.006053 )
						if( smoothD_d <= 5.91375 )
							if( rsi1 <= 26.877 )
								if( d <= 1.70333 )
									ret := -0.798423 // sell
								if( d > 1.70333 )
									ret := -0.674620
							if( rsi1 > 26.877 )
								if( bullPower <= -0.000547 )
									ret := -0.362162
								if( bullPower > -0.000547 )
									ret := -0.596041
						if( smoothD_d > 5.91375 )
							if( bbp <= -0.190925 )
								ret := 0.772727 // buy
							if( bbp > -0.190925 )
								if( d_k <= 4.34481 )
									ret := -0.329715
								if( d_k > 4.34481 )
									ret := -0.587879
					if( bbp > 0.006053 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.13975 )
								if( k <= 12.4451 )
									ret := -0.975510 // sell
								if( k > 12.4451 )
									ret := -0.666667
							if( bbm > 0.13975 )
								ret := -0.666667
						if( BBPower_Color > 0.5 )
							if( bullPower <= 0.018146 )
								if( rsi1 <= 23.5166 )
									ret := -1.000000 // sell
								if( rsi1 > 23.5166 )
									ret := -0.401361
							if( bullPower > 0.018146 )
								if( bearPower <= -0.006525 )
									ret := -0.764151 // sell
								if( bearPower > -0.006525 )
									ret := -0.913636 // sell
			if( rsi1 > 38.0942 )
				if( bbp <= 0.007264 )
					if( bullPower <= 0.006393 )
						if( rsi1 <= 42.4067 )
							if( smoothK_k <= 4.47334 )
								if( bullPower <= -0.049921 )
									ret := -0.782609 // sell
								if( bullPower > -0.049921 )
									ret := 0.172632
							if( smoothK_k > 4.47334 )
								if( d <= 5.07349 )
									ret := -0.526882
								if( d > 5.07349 )
									ret := -0.138728
						if( rsi1 > 42.4067 )
							if( bbp <= -0.030029 )
								if( bbp <= -0.09109 )
									ret := 0.579545
								if( bbp > -0.09109 )
									ret := 0.321063
							if( bbp > -0.030029 )
								if( bearPower <= -0.026128 )
									ret := -0.395349
								if( bearPower > -0.026128 )
									ret := 0.044164
					if( bullPower > 0.006393 )
						if( rsi1 <= 44.769 )
							if( BBPower_Color <= 0.5 )
								if( smoothK_k <= 3.12954 )
									ret := -0.052846
								if( smoothK_k > 3.12954 )
									ret := -0.631829
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.002447 )
									ret := -0.021277
								if( bbp > 0.002447 )
									ret := -0.346939
						if( rsi1 > 44.769 )
							if( bbm <= 0.060196 )
								if( k <= 2.70713 )
									ret := 0.288136
								if( k > 2.70713 )
									ret := 0.000000
							if( bbm > 0.060196 )
								if( smoothD_d <= 5.95665 )
									ret := -0.037234
								if( smoothD_d > 5.95665 )
									ret := -0.459016
				if( bbp > 0.007264 )
					if( rsi1 <= 55.4927 )
						if( bullPower <= 0.050039 )
							if( bbp <= 0.039922 )
								if( rsi1 <= 48.861 )
									ret := -0.451983
								if( rsi1 > 48.861 )
									ret := -0.073232
							if( bbp > 0.039922 )
								if( smoothK_k <= -1.46826 )
									ret := -0.718310 // sell
								if( smoothK_k > -1.46826 )
									ret := -0.410448
						if( bullPower > 0.050039 )
							if( d_k <= 5.97475 )
								if( bbp <= 0.137036 )
									ret := -0.702994 // sell
								if( bbp > 0.137036 )
									ret := -0.885000 // sell
							if( d_k > 5.97475 )
								if( d <= 7.17718 )
									ret := 0.083333
								if( d > 7.17718 )
									ret := -0.755814 // sell
					if( rsi1 > 55.4927 )
						if( smoothD_d <= 5.49728 )
							if( rsi1 <= 67.4947 )
								if( bullPower <= 0.041976 )
									ret := -0.012048
								if( bullPower > 0.041976 )
									ret := -0.366071
							if( rsi1 > 67.4947 )
								if( d_k <= -3.92381 )
									ret := 0.755102 // buy
								if( d_k > -3.92381 )
									ret := -0.008772
						if( smoothD_d > 5.49728 )
							if( k <= 17.8539 )
								if( smoothK_k <= -0.837833 )
									ret := -0.063830
								if( smoothK_k > -0.837833 )
									ret := 0.487288
							if( k > 17.8539 )
								if( rsi1 <= 57.7782 )
									ret := 0.562500
								if( rsi1 > 57.7782 )
									ret := -0.360000
		if( smoothD_d > 8.38401 )
			if( bbp <= -0.041151 )
				if( bbm <= 0.039754 )
					if( rsi1 <= 34.9603 )
						if( k <= 22.5772 )
							if( bbp <= -0.071185 )
								if( bbm <= 0.038047 )
									ret := -0.232346
								if( bbm > 0.038047 )
									ret := -0.820000 // sell
							if( bbp > -0.071185 )
								if( rsi1 <= 27.9403 )
									ret := -0.649194
								if( rsi1 > 27.9403 )
									ret := -0.364807
						if( k > 22.5772 )
							if( d_k <= 16.2187 )
								if( bullPower <= -0.030247 )
									ret := 0.142384
								if( bullPower > -0.030247 )
									ret := -0.193651
							if( d_k > 16.2187 )
								ret := -0.884615 // sell
					if( rsi1 > 34.9603 )
						if( d <= 45.1194 )
							if( bearPower <= -0.045649 )
								if( d_k <= 13.6698 )
									ret := 0.291429
								if( d_k > 13.6698 )
									ret := -0.200000
							if( bearPower > -0.045649 )
								if( d <= 23.1477 )
									ret := -0.072973
								if( d > 23.1477 )
									ret := 0.166667
						if( d > 45.1194 )
							if( bullPower <= -0.014306 )
								if( rsi1 <= 46.3706 )
									ret := 0.920635 // buy
								if( rsi1 > 46.3706 )
									ret := 0.608696
							if( bullPower > -0.014306 )
								if( smoothK_k <= 60.8811 )
									ret := -0.095238
								if( smoothK_k > 60.8811 )
									ret := 0.800000 // buy
				if( bbm > 0.039754 )
					if( smoothK_k <= 23.3074 )
						if( d_k <= -6.3051 )
							if( smoothK_k <= 16.863 )
								if( bbp <= -0.140425 )
									ret := -1.000000 // sell
								if( bbp > -0.140425 )
									ret := -0.615385
							if( smoothK_k > 16.863 )
								if( d <= 16.4825 )
									ret := -0.105572
								if( d > 16.4825 )
									ret := -0.669811
						if( d_k > -6.3051 )
							if( bbp <= -0.532375 )
								if( bullPower <= -0.256359 )
									ret := 1.000000 // buy
								if( bullPower > -0.256359 )
									ret := 0.846154 // buy
							if( bbp > -0.532375 )
								if( rsi1 <= 34.1502 )
									ret := -0.199296
								if( rsi1 > 34.1502 )
									ret := 0.200869
					if( smoothK_k > 23.3074 )
						if( rsi1 <= 44.2265 )
							if( rsi1 <= 30.8616 )
								if( bbm <= 0.060135 )
									ret := 0.026966
								if( bbm > 0.060135 )
									ret := -0.264407
							if( rsi1 > 30.8616 )
								if( bullPower <= -0.010399 )
									ret := 0.259232
								if( bullPower > -0.010399 )
									ret := -0.084123
						if( rsi1 > 44.2265 )
							if( d_k <= 5.11438 )
								if( d_k <= 1.41769 )
									ret := 0.665787
								if( d_k > 1.41769 )
									ret := 0.346154
							if( d_k > 5.11438 )
								if( smoothK_k <= 28.113 )
									ret := 0.684211
								if( smoothK_k > 28.113 )
									ret := -0.642857
			if( bbp > -0.041151 )
				if( rsi1 <= 49.9993 )
					if( bbp <= 0.035091 )
						if( bullPower <= 0.006638 )
							if( rsi1 <= 39.653 )
								if( bearPower <= -0.019412 )
									ret := -0.330134
								if( bearPower > -0.019412 )
									ret := -0.212187
							if( rsi1 > 39.653 )
								if( bullPower <= 0.006187 )
									ret := -0.026950
								if( bullPower > 0.006187 )
									ret := 0.250000
						if( bullPower > 0.006638 )
							if( bbp <= 0.015988 )
								if( rsi1 <= 41.6182 )
									ret := -0.477985
								if( rsi1 > 41.6182 )
									ret := -0.204089
							if( bbp > 0.015988 )
								if( rsi1 <= 38.6351 )
									ret := -0.746835 // sell
								if( rsi1 > 38.6351 )
									ret := -0.400357
					if( bbp > 0.035091 )
						if( d_k <= -7.02685 )
							if( smoothK_k <= 44.8623 )
								if( smoothK_k <= 22.804 )
									ret := 0.090909
								if( smoothK_k > 22.804 )
									ret := -0.690909
							if( smoothK_k > 44.8623 )
								if( smoothK_k <= 49.5649 )
									ret := 0.411765
								if( smoothK_k > 49.5649 )
									ret := -0.281250
						if( d_k > -7.02685 )
							if( bbm <= 0.017385 )
								if( smoothK_k <= 16.4232 )
									ret := -0.228571
								if( smoothK_k > 16.4232 )
									ret := -0.600000
							if( bbm > 0.017385 )
								if( bullPower <= 0.053862 )
									ret := -0.736377 // sell
								if( bullPower > 0.053862 )
									ret := -0.857744 // sell
				if( rsi1 > 49.9993 )
					if( BBPower_Color <= 0.5 )
						if( smoothK_k <= 39.704 )
							if( d_k <= 12.1794 )
								if( bearPower <= 0.020144 )
									ret := 0.246308
								if( bearPower > 0.020144 )
									ret := -0.488372
							if( d_k > 12.1794 )
								if( rsi1 <= 58.0909 )
									ret := -0.318560
								if( rsi1 > 58.0909 )
									ret := 0.276786
						if( smoothK_k > 39.704 )
							if( bullPower <= 0.020494 )
								if( rsi1 <= 58.5951 )
									ret := 0.235867
								if( rsi1 > 58.5951 )
									ret := 0.604878
							if( bullPower > 0.020494 )
								if( bbm <= 0.046336 )
									ret := 0.860465 // buy
								if( bbm > 0.046336 )
									ret := 0.608856
					if( BBPower_Color > 0.5 )
						if( bbm <= 0.023563 )
							if( rsi1 <= 53.6885 )
								if( bearPower <= 0.0191 )
									ret := -0.072864
								if( bearPower > 0.0191 )
									ret := -0.562500
							if( rsi1 > 53.6885 )
								if( bullPower <= 0.03784 )
									ret := 0.116135
								if( bullPower > 0.03784 )
									ret := -0.105769
						if( bbm > 0.023563 )
							if( bullPower <= 0.03969 )
								if( d_k <= 16.821 )
									ret := 0.078300
								if( d_k > 16.821 )
									ret := 0.407080
							if( bullPower > 0.03969 )
								if( d_k <= 7.63722 )
									ret := -0.121448
								if( d_k > 7.63722 )
									ret := -0.309859
	if( d > 47.7563 )
		if( smoothK_k <= 71.9231 )
			if( bullPower <= -0.02607 )
				if( d_k <= 0.315675 )
					if( bbp <= -0.102271 )
						if( rsi1 <= 34.1375 )
							if( bearPower <= -0.11181 )
								if( bearPower <= -0.202808 )
									ret := 0.250000
								if( bearPower > -0.202808 )
									ret := 0.637363
							if( bearPower > -0.11181 )
								if( smoothD_d <= 49.514 )
									ret := 0.758621 // buy
								if( smoothD_d > 49.514 )
									ret := -0.188679
						if( rsi1 > 34.1375 )
							if( smoothD_d <= 51.3764 )
								if( d_k <= -13.0149 )
									ret := 0.446809
								if( d_k > -13.0149 )
									ret := 0.808219 // buy
							if( smoothD_d > 51.3764 )
								if( k <= 70.7511 )
									ret := 0.929825 // buy
								if( k > 70.7511 )
									ret := 0.763636 // buy
					if( bbp > -0.102271 )
						if( d <= 53.859 )
							if( k <= 65.9702 )
								ret := -0.600000
							if( k > 65.9702 )
								ret := 0.375000
						if( d > 53.859 )
							if( rsi1 <= 37.9962 )
								if( rsi1 <= 35.6734 )
									ret := -0.100000
								if( rsi1 > 35.6734 )
									ret := 0.400000
							if( rsi1 > 37.9962 )
								if( bearPower <= -0.056961 )
									ret := 0.928571 // buy
								if( bearPower > -0.056961 )
									ret := 0.750000 // buy
				if( d_k > 0.315675 )
					if( bbp <= -0.159027 )
						if( smoothK_k <= 29.9299 )
							if( bearPower <= -0.178941 )
								if( k <= 29.5254 )
									ret := 0.750000 // buy
								if( k > 29.5254 )
									ret := 1.000000 // buy
							if( bearPower > -0.178941 )
								if( bbp <= -0.188132 )
									ret := 0.200000
								if( bbp > -0.188132 )
									ret := 0.714286 // buy
						if( smoothK_k > 29.9299 )
							if( d <= 79.4814 )
								if( bullPower <= -0.07414 )
									ret := -0.182927
								if( bullPower > -0.07414 )
									ret := 0.162679
							if( d > 79.4814 )
								if( rsi1 <= 23.8998 )
									ret := -0.454545
								if( rsi1 > 23.8998 )
									ret := -0.875000 // sell
					if( bbp > -0.159027 )
						if( d_k <= 3.06119 )
							if( k <= 55.7318 )
								ret := 0.315789
							if( k > 55.7318 )
								if( d <= 59.9503 )
									ret := -0.923077 // sell
								if( d > 59.9503 )
									ret := -0.176471
						if( d_k > 3.06119 )
							if( d_k <= 4.13764 )
								if( bearPower <= -0.072142 )
									ret := 1.000000 // buy
								if( bearPower > -0.072142 )
									ret := 0.555556
							if( d_k > 4.13764 )
								if( rsi1 <= 28.9583 )
									ret := 0.067797
								if( rsi1 > 28.9583 )
									ret := 0.476027
			if( bullPower > -0.02607 )
				if( bbp <= 0.073401 )
					if( bearPower <= -0.073846 )
						if( rsi1 <= 46.6813 )
							if( rsi1 <= 36.7765 )
								if( smoothK_k <= 48.035 )
									ret := -0.400000
								if( smoothK_k > 48.035 )
									ret := -0.037634
							if( rsi1 > 36.7765 )
								if( d_k <= 4.51436 )
									ret := 0.486911
								if( d_k > 4.51436 )
									ret := 0.009146
						if( rsi1 > 46.6813 )
							if( d <= 83.0929 )
								if( d <= 60.5041 )
									ret := 0.789030 // buy
								if( d > 60.5041 )
									ret := 0.450450
							if( d > 83.0929 )
								ret := -0.727273 // sell
					if( bearPower > -0.073846 )
						if( smoothK_k <= 58.3469 )
							if( rsi1 <= 44.9341 )
								if( rsi1 <= 40.1723 )
									ret := -0.354918
								if( rsi1 > 40.1723 )
									ret := -0.189884
							if( rsi1 > 44.9341 )
								if( bearPower <= -0.012054 )
									ret := 0.134809
								if( bearPower > -0.012054 )
									ret := -0.064796
						if( smoothK_k > 58.3469 )
							if( rsi1 <= 58.0705 )
								if( rsi1 <= 41.2585 )
									ret := -0.329887
								if( rsi1 > 41.2585 )
									ret := 0.061459
							if( rsi1 > 58.0705 )
								if( BBPower_Color <= 0.5 )
									ret := 0.632148
								if( BBPower_Color > 0.5 )
									ret := 0.299613
				if( bbp > 0.073401 )
					if( smoothK_k <= 51.5757 )
						if( rsi1 <= 65.4791 )
							if( rsi1 <= 52.5815 )
								if( k <= 44.7689 )
									ret := -0.918919 // sell
								if( k > 44.7689 )
									ret := -0.756098 // sell
							if( rsi1 > 52.5815 )
								if( bearPower <= -0.022553 )
									ret := 1.000000 // buy
								if( bearPower > -0.022553 )
									ret := -0.470423
						if( rsi1 > 65.4791 )
							if( bearPower <= 0.045295 )
								if( smoothK_k <= 50.1042 )
									ret := 0.326531
								if( smoothK_k > 50.1042 )
									ret := 0.888889 // buy
							if( bearPower > 0.045295 )
								if( d_k <= 20.0683 )
									ret := 0.226415
								if( d_k > 20.0683 )
									ret := -0.196262
					if( smoothK_k > 51.5757 )
						if( bullPower <= 0.097475 )
							if( d_k <= 13.5913 )
								if( rsi1 <= 59.3946 )
									ret := -0.605341
								if( rsi1 > 59.3946 )
									ret := 0.077249
							if( d_k > 13.5913 )
								if( bbm <= 0.024181 )
									ret := -0.214286
								if( bbm > 0.024181 )
									ret := 0.468571
						if( bullPower > 0.097475 )
							if( d <= 80.7885 )
								if( k <= 69.0338 )
									ret := -0.204476
								if( k > 69.0338 )
									ret := -0.561254
							if( d > 80.7885 )
								if( rsi1 <= 78.9761 )
									ret := 0.159794
								if( rsi1 > 78.9761 )
									ret := 0.833333 // buy
		if( smoothK_k > 71.9231 )
			if( rsi1 <= 66.9237 )
				if( BBPower_Color <= 0.5 )
					if( bullPower <= -0.02123 )
						if( bbm <= 0.041043 )
							if( d_k <= -13.2322 )
								if( d <= 60.3138 )
									ret := 0.192308
								if( d > 60.3138 )
									ret := 0.598870
							if( d_k > -13.2322 )
								if( rsi1 <= 42.259 )
									ret := -0.060914
								if( rsi1 > 42.259 )
									ret := 0.580071
						if( bbm > 0.041043 )
							if( bbm <= 0.086107 )
								if( bbm <= 0.057801 )
									ret := 0.731373 // buy
								if( bbm > 0.057801 )
									ret := 0.520392
							if( bbm > 0.086107 )
								if( d <= 94.9729 )
									ret := 0.664193
								if( d > 94.9729 )
									ret := 0.958580 // buy
					if( bullPower > -0.02123 )
						if( smoothK_k <= 86.7434 )
							if( rsi1 <= 49.2741 )
								if( d <= 94.0091 )
									ret := -0.060204
								if( d > 94.0091 )
									ret := 0.404494
							if( rsi1 > 49.2741 )
								if( bbp <= -0.027146 )
									ret := 0.607917
								if( bbp > -0.027146 )
									ret := 0.300771
						if( smoothK_k > 86.7434 )
							if( rsi1 <= 50.205 )
								if( rsi1 <= 43.5448 )
									ret := -0.193709
								if( rsi1 > 43.5448 )
									ret := 0.049057
							if( rsi1 > 50.205 )
								if( bbp <= -0.028388 )
									ret := 0.701087 // buy
								if( bbp > -0.028388 )
									ret := 0.416120
				if( BBPower_Color > 0.5 )
					if( bbp <= 0.106822 )
						if( bullPower <= 0.048726 )
							if( d <= 85.9647 )
								if( smoothK_k <= 74.2628 )
									ret := 0.163866
								if( smoothK_k > 74.2628 )
									ret := -0.062800
							if( d > 85.9647 )
								if( bbm <= 0.021731 )
									ret := 0.055162
								if( bbm > 0.021731 )
									ret := 0.184413
						if( bullPower > 0.048726 )
							if( smoothK_k <= 94.1931 )
								if( d_k <= -7.33115 )
									ret := -0.145729
								if( d_k > -7.33115 )
									ret := 0.047180
							if( smoothK_k > 94.1931 )
								if( bbm <= 0.105182 )
									ret := -0.370647
								if( bbm > 0.105182 )
									ret := 0.583333
					if( bbp > 0.106822 )
						if( d <= 97.5707 )
							if( smoothD_d <= 56.5946 )
								if( bbp <= 0.125071 )
									ret := 0.076923
								if( bbp > 0.125071 )
									ret := 1.000000 // buy
							if( smoothD_d > 56.5946 )
								if( rsi1 <= 57.4673 )
									ret := -0.586957
								if( rsi1 > 57.4673 )
									ret := -0.203077
						if( d > 97.5707 )
							if( bbp <= 0.136288 )
								if( bbm <= 0.046188 )
									ret := 0.444444
								if( bbm > 0.046188 )
									ret := -0.291667
							if( bbp > 0.136288 )
								if( d_k <= 1.19161 )
									ret := 0.108696
								if( d_k > 1.19161 )
									ret := 0.960000 // buy
			if( rsi1 > 66.9237 )
				if( bbp <= 0.085572 )
					if( BBPower_Color <= 0.5 )
						if( k <= 98.2197 )
							if( smoothD_d <= 94.0225 )
								if( bbp <= -0.000386 )
									ret := 0.789116 // buy
								if( bbp > -0.000386 )
									ret := 0.973822 // buy
							if( smoothD_d > 94.0225 )
								if( d_k <= -0.009982 )
									ret := 0.103448
								if( d_k > -0.009982 )
									ret := 0.834711 // buy
						if( k > 98.2197 )
							if( bbm <= 0.011189 )
								if( d_k <= -2.85386 )
									ret := 0.914286 // buy
								if( d_k > -2.85386 )
									ret := 0.500000
							if( bbm > 0.011189 )
								if( bbp <= -0.000219 )
									ret := 0.932660 // buy
								if( bbp > -0.000219 )
									ret := 1.000000 // buy
					if( BBPower_Color > 0.5 )
						if( d <= 97.5299 )
							if( smoothD_d <= 91.2763 )
								if( rsi1 <= 76.3938 )
									ret := 0.349581
								if( rsi1 > 76.3938 )
									ret := 0.583243
							if( smoothD_d > 91.2763 )
								if( k <= 96.4572 )
									ret := 0.582390
								if( k > 96.4572 )
									ret := 0.410385
						if( d > 97.5299 )
							if( bullPower <= 0.012409 )
								if( rsi1 <= 74.9419 )
									ret := 0.065217
								if( rsi1 > 74.9419 )
									ret := 0.440000
							if( bullPower > 0.012409 )
								if( rsi1 <= 71.5152 )
									ret := 0.307692
								if( rsi1 > 71.5152 )
									ret := 0.783133 // buy
				if( bbp > 0.085572 )
					if( smoothD_d <= 87.305 )
						if( smoothK_k <= 76.8622 )
							if( d <= 89.2911 )
								if( smoothK_k <= 72.3918 )
									ret := -0.042553
								if( smoothK_k > 72.3918 )
									ret := 0.386463
							if( d > 89.2911 )
								ret := 1.000000 // buy
						if( smoothK_k > 76.8622 )
							if( bbm <= 0.138494 )
								if( d_k <= 3.98772 )
									ret := 0.098929
								if( d_k > 3.98772 )
									ret := 0.465517
							if( bbm > 0.138494 )
								if( bullPower <= 0.180571 )
									ret := 0.545455
								if( bullPower > 0.180571 )
									ret := -0.267442
					if( smoothD_d > 87.305 )
						if( k <= 94.5715 )
							if( d <= 96.5789 )
								if( smoothK_k <= 85.4955 )
									ret := 0.565728
								if( smoothK_k > 85.4955 )
									ret := 0.328000
							if( d > 96.5789 )
								if( bbm <= 0.035066 )
									ret := 0.470588
								if( bbm > 0.035066 )
									ret := 0.861111 // buy
						if( k > 94.5715 )
							if( bullPower <= 0.095031 )
								if( smoothD_d <= 96.2785 )
									ret := 0.355307
								if( smoothD_d > 96.2785 )
									ret := 0.622222
							if( bullPower > 0.095031 )
								if( bbp <= 0.162901 )
									ret := 0.388385
								if( bbp > 0.162901 )
									ret := 0.120160
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_e9e66db6(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


