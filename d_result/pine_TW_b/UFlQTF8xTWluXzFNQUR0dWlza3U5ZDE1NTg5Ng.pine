//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: PYPL_1Min_1MAD_9d155896 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1MAD_9d155896", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_9d155896(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma30_colorInt <= 3.5 )
		if( ma25_colorInt <= 1.5 )
			if( ma65 <= 58.3501 )
				if( ma35 <= 57.6861 )
					if( ma75 <= 57.4997 )
						ret := -0.500000
					if( ma75 > 57.4997 )
						if( ma60 <= 57.6469 )
							if( ma15 <= 57.6975 )
								if( ma40 <= 57.5293 )
									ret := 0.750000 // buy
								if( ma40 > 57.5293 )
									ret := 0.046512
							if( ma15 > 57.6975 )
								if( ma70 <= 57.5792 )
									ret := 0.090909
								if( ma70 > 57.5792 )
									ret := 0.666667
						if( ma60 > 57.6469 )
							ret := 1.000000 // buy
				if( ma35 > 57.6861 )
					if( ma100 <= 57.7418 )
						if( ma10 <= 57.8793 )
							if( ma15 <= 57.8115 )
								if( ma85 <= 57.6358 )
									ret := -0.222222
								if( ma85 > 57.6358 )
									ret := -0.821429 // sell
							if( ma15 > 57.8115 )
								if( ma30 <= 57.7879 )
									ret := 0.300000
								if( ma30 > 57.7879 )
									ret := -0.250000
						if( ma10 > 57.8793 )
							ret := -1.000000 // sell
					if( ma100 > 57.7418 )
						if( ma90 <= 58.1552 )
							if( ma25 <= 58.1904 )
								if( ma85 <= 58.0662 )
									ret := -0.034810
								if( ma85 > 58.0662 )
									ret := -0.394904
							if( ma25 > 58.1904 )
								if( ma45 <= 58.16 )
									ret := 0.923077 // buy
								if( ma45 > 58.16 )
									ret := 0.063291
						if( ma90 > 58.1552 )
							if( ma30 <= 58.4371 )
								if( ma50 <= 58.3099 )
									ret := -0.452991
								if( ma50 > 58.3099 )
									ret := 0.098765
							if( ma30 > 58.4371 )
								ret := -1.000000 // sell
			if( ma65 > 58.3501 )
				if( ma80 <= 70.5983 )
					if( ma05_colorInt <= 1.5 )
						if( ma90 <= 68.7423 )
							if( ma80 <= 68.4357 )
								if( ma35 <= 58.3807 )
									ret := 0.850000 // buy
								if( ma35 > 58.3807 )
									ret := -0.079147
							if( ma80 > 68.4357 )
								if( ma85 <= 68.5379 )
									ret := 0.652632
								if( ma85 > 68.5379 )
									ret := -0.046512
						if( ma90 > 68.7423 )
							if( ma60 <= 68.967 )
								if( ma80 <= 68.911 )
									ret := -0.909910 // sell
								if( ma80 > 68.911 )
									ret := 0.000000
							if( ma60 > 68.967 )
								if( ma90_colorInt <= 3.5 )
									ret := -0.029229
								if( ma90_colorInt > 3.5 )
									ret := -0.707547 // sell
					if( ma05_colorInt > 1.5 )
						if( ma85 <= 67.1448 )
							if( ma65 <= 65.5829 )
								if( ma85 <= 65.4887 )
									ret := 0.050025
								if( ma85 > 65.4887 )
									ret := -0.684211
							if( ma65 > 65.5829 )
								if( ma55 <= 65.868 )
									ret := 0.641509
								if( ma55 > 65.868 )
									ret := 0.119128
						if( ma85 > 67.1448 )
							if( ma55 <= 70.5214 )
								if( ma60 <= 69.7546 )
									ret := -0.243772
								if( ma60 > 69.7546 )
									ret := 0.059908
							if( ma55 > 70.5214 )
								if( ma70 <= 70.581 )
									ret := -1.000000 // sell
								if( ma70 > 70.581 )
									ret := -0.555556
				if( ma80 > 70.5983 )
					if( ma15 <= 71.6366 )
						if( ma50 <= 71.5388 )
							if( ma55 <= 71.343 )
								if( ma40 <= 71.2868 )
									ret := 0.187279
								if( ma40 > 71.2868 )
									ret := 0.872340 // buy
							if( ma55 > 71.343 )
								if( ma75 <= 71.3491 )
									ret := -0.787879 // sell
								if( ma75 > 71.3491 )
									ret := 0.229167
						if( ma50 > 71.5388 )
							if( ma50 <= 71.6209 )
								if( ma70 <= 71.5961 )
									ret := 0.652174
								if( ma70 > 71.5961 )
									ret := -0.058824
							if( ma50 > 71.6209 )
								ret := 1.000000 // buy
					if( ma15 > 71.6366 )
						if( ma05 <= 71.7614 )
							if( ma40 <= 71.6174 )
								if( ma10 <= 71.6621 )
									ret := 0.846154 // buy
								if( ma10 > 71.6621 )
									ret := -0.421053
							if( ma40 > 71.6174 )
								if( ma100 <= 71.6223 )
									ret := -0.742188 // sell
								if( ma100 > 71.6223 )
									ret := 0.384615
						if( ma05 > 71.7614 )
							if( ma60 <= 71.3718 )
								if( ma80 <= 71.0434 )
									ret := -0.925926 // sell
								if( ma80 > 71.0434 )
									ret := -1.000000 // sell
							if( ma60 > 71.3718 )
								if( ma60 <= 71.7455 )
									ret := 0.347368
								if( ma60 > 71.7455 )
									ret := -0.021916
		if( ma25_colorInt > 1.5 )
			if( ma05 <= 58.7524 )
				if( ma60 <= 58.8034 )
					if( ma35 <= 58.2613 )
						if( ma60 <= 57.4973 )
							if( ma30 <= 57.3038 )
								ret := 1.000000 // buy
							if( ma30 > 57.3038 )
								if( ma15 <= 57.2968 )
									ret := 0.285714
								if( ma15 > 57.2968 )
									ret := 0.789474 // buy
						if( ma60 > 57.4973 )
							if( ma100 <= 57.9613 )
								if( ma80_colorInt <= 2.5 )
									ret := 0.376426
								if( ma80_colorInt > 2.5 )
									ret := -0.432161
							if( ma100 > 57.9613 )
								if( ma40 <= 58.2293 )
									ret := 0.261341
								if( ma40 > 58.2293 )
									ret := 0.570423
					if( ma35 > 58.2613 )
						if( ma15 <= 58.7596 )
							if( ma85 <= 58.8351 )
								if( ma85 <= 58.2245 )
									ret := 0.947368 // buy
								if( ma85 > 58.2245 )
									ret := 0.048818
							if( ma85 > 58.8351 )
								if( ma55 <= 58.7852 )
									ret := -0.821429 // sell
								if( ma55 > 58.7852 )
									ret := -0.142857
						if( ma15 > 58.7596 )
							ret := -0.714286 // sell
				if( ma60 > 58.8034 )
					if( ma85 <= 58.8859 )
						if( ma05_colorInt <= 3.5 )
							if( ma60 <= 58.8084 )
								ret := 0.625000
							if( ma60 > 58.8084 )
								if( ma05 <= 58.7138 )
									ret := 0.983607 // buy
								if( ma05 > 58.7138 )
									ret := 0.758621 // buy
						if( ma05_colorInt > 3.5 )
							if( ma05 <= 58.7201 )
								ret := 0.136364
							if( ma05 > 58.7201 )
								ret := 0.928571 // buy
					if( ma85 > 58.8859 )
						if( ma20 <= 58.8566 )
							if( ma20 <= 58.7077 )
								if( ma10 <= 58.6689 )
									ret := 0.878049 // buy
								if( ma10 > 58.6689 )
									ret := 0.000000
							if( ma20 > 58.7077 )
								if( ma50 <= 58.8357 )
									ret := -0.190476
								if( ma50 > 58.8357 )
									ret := 0.250000
						if( ma20 > 58.8566 )
							if( ma65 <= 59.4547 )
								if( ma35 <= 59.0167 )
									ret := 0.875000 // buy
								if( ma35 > 59.0167 )
									ret := 0.545455
							if( ma65 > 59.4547 )
								ret := 1.000000 // buy
			if( ma05 > 58.7524 )
				if( ma20 <= 58.862 )
					if( ma70_colorInt <= 2.5 )
						if( ma30_colorInt <= 2.5 )
							if( ma90_colorInt <= 1.5 )
								if( ma70_colorInt <= 1.5 )
									ret := -0.162162
								if( ma70_colorInt > 1.5 )
									ret := -0.833333 // sell
							if( ma90_colorInt > 1.5 )
								if( ma05 <= 58.7806 )
									ret := 0.647059
								if( ma05 > 58.7806 )
									ret := -0.147059
						if( ma30_colorInt > 2.5 )
							if( ma45 <= 58.859 )
								ret := 0.950000 // buy
							if( ma45 > 58.859 )
								ret := -0.266667
					if( ma70_colorInt > 2.5 )
						if( ma100 <= 58.8983 )
							if( ma05 <= 58.7581 )
								ret := -0.928571 // sell
							if( ma05 > 58.7581 )
								if( ma90 <= 58.8748 )
									ret := -0.276923
								if( ma90 > 58.8748 )
									ret := 0.400000
						if( ma100 > 58.8983 )
							if( ma40 <= 58.9531 )
								if( ma05_colorInt <= 3.5 )
									ret := -0.460000
								if( ma05_colorInt > 3.5 )
									ret := -0.926829 // sell
							if( ma40 > 58.9531 )
								ret := 0.000000
				if( ma20 > 58.862 )
					if( ma85 <= 73.0951 )
						if( ma90 <= 72.4747 )
							if( ma20 <= 72.3659 )
								if( ma85 <= 72.3834 )
									ret := 0.043373
								if( ma85 > 72.3834 )
									ret := -0.590164
							if( ma20 > 72.3659 )
								if( ma85_colorInt <= 1.5 )
									ret := 0.102190
								if( ma85_colorInt > 1.5 )
									ret := 0.590164
						if( ma90 > 72.4747 )
							if( ma55 <= 72.6424 )
								if( ma80 <= 72.4813 )
									ret := 0.235294
								if( ma80 > 72.4813 )
									ret := -0.629921
							if( ma55 > 72.6424 )
								if( ma45 <= 72.6351 )
									ret := 0.700000 // buy
								if( ma45 > 72.6351 )
									ret := -0.163934
					if( ma85 > 73.0951 )
						if( ma30 <= 73.2371 )
							if( ma85 <= 73.2828 )
								if( ma30 <= 72.9925 )
									ret := 0.787879 // buy
								if( ma30 > 72.9925 )
									ret := 0.988636 // buy
							if( ma85 > 73.2828 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.576923
								if( ma05_colorInt > 3.5 )
									ret := -0.200000
						if( ma30 > 73.2371 )
							if( ma10 <= 79.2306 )
								if( ma70 <= 79.3963 )
									ret := 0.127544
								if( ma70 > 79.3963 )
									ret := 0.765957 // buy
							if( ma10 > 79.2306 )
								if( ma20 <= 79.7064 )
									ret := -0.299505
								if( ma20 > 79.7064 )
									ret := 0.032755
	if( ma30_colorInt > 3.5 )
		if( ma100 <= 67.0614 )
			if( ma85 <= 60.8753 )
				if( ma100 <= 60.6263 )
					if( ma40 <= 60.5974 )
						if( ma45 <= 60.5155 )
							if( ma40 <= 59.296 )
								if( ma35 <= 59.0665 )
									ret := -0.066667
								if( ma35 > 59.0665 )
									ret := 0.442688
							if( ma40 > 59.296 )
								if( ma20 <= 59.8965 )
									ret := -0.235127
								if( ma20 > 59.8965 )
									ret := 0.001815
						if( ma45 > 60.5155 )
							if( ma10 <= 60.518 )
								if( ma80 <= 60.5644 )
									ret := 0.777778 // buy
								if( ma80 > 60.5644 )
									ret := 0.900000 // buy
							if( ma10 > 60.518 )
								if( ma80 <= 60.5663 )
									ret := -0.235294
								if( ma80 > 60.5663 )
									ret := 0.459459
					if( ma40 > 60.5974 )
						if( ma10 <= 60.5929 )
							ret := -0.875000 // sell
						if( ma10 > 60.5929 )
							ret := -1.000000 // sell
				if( ma100 > 60.6263 )
					if( ma75_colorInt <= 2.5 )
						if( ma10_colorInt <= 2.5 )
							ret := -1.000000 // sell
						if( ma10_colorInt > 2.5 )
							ret := -0.166667
					if( ma75_colorInt > 2.5 )
						if( ma50 <= 60.6128 )
							if( ma75 <= 60.6373 )
								if( ma35 <= 60.5263 )
									ret := 0.950000 // buy
								if( ma35 > 60.5263 )
									ret := 1.000000 // buy
							if( ma75 > 60.6373 )
								ret := 0.850000 // buy
						if( ma50 > 60.6128 )
							if( ma60 <= 60.6837 )
								if( ma45 <= 60.6394 )
									ret := 0.433333
								if( ma45 > 60.6394 )
									ret := -0.272727
							if( ma60 > 60.6837 )
								if( ma35 <= 60.7067 )
									ret := 1.000000 // buy
								if( ma35 > 60.7067 )
									ret := 0.227273
			if( ma85 > 60.8753 )
				if( ma35 <= 61.5521 )
					if( ma45 <= 61.1231 )
						if( ma85 <= 61.1486 )
							if( ma60 <= 60.8702 )
								if( ma15 <= 60.8617 )
									ret := -0.800000 // sell
								if( ma15 > 60.8617 )
									ret := -1.000000 // sell
							if( ma60 > 60.8702 )
								if( ma10_colorInt <= 2 )
									ret := 0.450000
								if( ma10_colorInt > 2 )
									ret := -0.262712
						if( ma85 > 61.1486 )
							if( ma30 <= 61.053 )
								ret := 0.800000 // buy
							if( ma30 > 61.053 )
								ret := 1.000000 // buy
					if( ma45 > 61.1231 )
						if( ma30 <= 61.1886 )
							if( ma50 <= 61.1955 )
								if( ma80_colorInt <= 3.5 )
									ret := -1.000000 // sell
								if( ma80_colorInt > 3.5 )
									ret := -0.875000 // sell
							if( ma50 > 61.1955 )
								ret := -0.769231 // sell
						if( ma30 > 61.1886 )
							if( ma100 <= 61.5838 )
								if( ma15 <= 61.4566 )
									ret := -0.565217
								if( ma15 > 61.4566 )
									ret := 0.156250
							if( ma100 > 61.5838 )
								if( ma55 <= 61.4532 )
									ret := 0.920000 // buy
								if( ma55 > 61.4532 )
									ret := -0.506173
				if( ma35 > 61.5521 )
					if( ma80 <= 67.0188 )
						if( ma15 <= 66.3252 )
							if( ma70 <= 66.0548 )
								if( ma85 <= 61.6167 )
									ret := 0.540541
								if( ma85 > 61.6167 )
									ret := -0.156851
							if( ma70 > 66.0548 )
								if( ma35 <= 66.065 )
									ret := -0.746032 // sell
								if( ma35 > 66.065 )
									ret := -0.338983
						if( ma15 > 66.3252 )
							if( ma45 <= 66.3263 )
								if( ma90 <= 66.3884 )
									ret := 0.478261
								if( ma90 > 66.3884 )
									ret := 1.000000 // buy
							if( ma45 > 66.3263 )
								if( ma40_colorInt <= 3.5 )
									ret := 0.818182 // buy
								if( ma40_colorInt > 3.5 )
									ret := -0.112360
					if( ma80 > 67.0188 )
						if( ma25 <= 66.9644 )
							ret := -1.000000 // sell
						if( ma25 > 66.9644 )
							ret := -0.666667
		if( ma100 > 67.0614 )
			if( ma20 <= 71.3527 )
				if( ma90 <= 70.195 )
					if( ma10 <= 69.3685 )
						if( ma75 <= 69.1511 )
							if( ma75_colorInt <= 1.5 )
								if( ma90 <= 67.6398 )
									ret := -0.468750
								if( ma90 > 67.6398 )
									ret := -0.857143 // sell
							if( ma75_colorInt > 1.5 )
								if( ma30 <= 67.2022 )
									ret := 0.424051
								if( ma30 > 67.2022 )
									ret := 0.017264
						if( ma75 > 69.1511 )
							if( ma100 <= 69.3436 )
								if( ma75 <= 69.2031 )
									ret := 0.750000 // buy
								if( ma75 > 69.2031 )
									ret := -0.545455
							if( ma100 > 69.3436 )
								if( ma05 <= 69.3651 )
									ret := 0.961538 // buy
								if( ma05 > 69.3651 )
									ret := 0.692308
					if( ma10 > 69.3685 )
						if( ma35 <= 69.345 )
							ret := -1.000000 // sell
						if( ma35 > 69.345 )
							if( ma10 <= 69.4256 )
								ret := 0.900000 // buy
							if( ma10 > 69.4256 )
								if( ma90 <= 69.7161 )
									ret := -0.069767
								if( ma90 > 69.7161 )
									ret := -0.406250
				if( ma90 > 70.195 )
					if( ma100 <= 70.5039 )
						if( ma70 <= 70.3418 )
							if( ma55 <= 70.2826 )
								if( ma90 <= 70.2576 )
									ret := 0.325000
								if( ma90 > 70.2576 )
									ret := 0.843137 // buy
							if( ma55 > 70.2826 )
								ret := -0.176471
						if( ma70 > 70.3418 )
							if( ma30 <= 70.3561 )
								if( ma60 <= 70.3588 )
									ret := 1.000000 // buy
								if( ma60 > 70.3588 )
									ret := 0.526316
							if( ma30 > 70.3561 )
								ret := 1.000000 // buy
					if( ma100 > 70.5039 )
						if( ma45 <= 71.2347 )
							if( ma20_colorInt <= 2.5 )
								ret := 0.588235
							if( ma20_colorInt > 2.5 )
								if( ma100 <= 71.1212 )
									ret := 0.000000
								if( ma100 > 71.1212 )
									ret := -0.347826
						if( ma45 > 71.2347 )
							if( ma75 <= 71.4043 )
								if( ma30 <= 71.3218 )
									ret := 0.842857 // buy
								if( ma30 > 71.3218 )
									ret := 0.333333
							if( ma75 > 71.4043 )
								if( ma10 <= 71.2636 )
									ret := 0.400000
								if( ma10 > 71.2636 )
									ret := 0.052632
			if( ma20 > 71.3527 )
				if( ma50 <= 71.5818 )
					if( ma60_colorInt <= 3.5 )
						if( ma40 <= 71.5361 )
							if( ma80 <= 71.5353 )
								ret := 0.400000
							if( ma80 > 71.5353 )
								ret := 0.166667
						if( ma40 > 71.5361 )
							ret := -0.333333
					if( ma60_colorInt > 3.5 )
						if( ma15_colorInt <= 2.5 )
							if( ma65 <= 71.5324 )
								if( ma70 <= 71.4708 )
									ret := 0.185185
								if( ma70 > 71.4708 )
									ret := -0.615385
							if( ma65 > 71.5324 )
								ret := 0.500000
						if( ma15_colorInt > 2.5 )
							if( ma45 <= 71.3866 )
								if( ma85_colorInt <= 3.5 )
									ret := 0.000000
								if( ma85_colorInt > 3.5 )
									ret := -0.371429
							if( ma45 > 71.3866 )
								if( ma35 <= 71.42 )
									ret := -1.000000 // sell
								if( ma35 > 71.42 )
									ret := -0.541667
				if( ma50 > 71.5818 )
					if( ma05 <= 71.8095 )
						if( ma90 <= 72.0015 )
							if( ma50 <= 71.7241 )
								if( ma10 <= 71.5769 )
									ret := 0.711111 // buy
								if( ma10 > 71.5769 )
									ret := 0.086957
							if( ma50 > 71.7241 )
								if( ma55 <= 71.7817 )
									ret := 0.864865 // buy
								if( ma55 > 71.7817 )
									ret := 1.000000 // buy
						if( ma90 > 72.0015 )
							ret := -0.937500 // sell
					if( ma05 > 71.8095 )
						if( ma45 <= 75.9148 )
							if( ma15 <= 73.3134 )
								if( ma10 <= 72.9861 )
									ret := -0.261538
								if( ma10 > 72.9861 )
									ret := 0.289474
							if( ma15 > 73.3134 )
								if( ma45 <= 73.4258 )
									ret := -1.000000 // sell
								if( ma45 > 73.4258 )
									ret := -0.416667
						if( ma45 > 75.9148 )
							if( ma70 <= 76.9244 )
								if( ma100 <= 76.8422 )
									ret := 0.069959
								if( ma100 > 76.8422 )
									ret := 0.794118 // buy
							if( ma70 > 76.9244 )
								if( ma70 <= 77.8346 )
									ret := -0.304455
								if( ma70 > 77.8346 )
									ret := -0.001099
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_PYPL_1Min_9d155896(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


