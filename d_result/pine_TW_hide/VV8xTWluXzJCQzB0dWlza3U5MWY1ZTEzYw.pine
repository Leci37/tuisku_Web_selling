//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: U_1Min_2BC0_91f5e13c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BC0_91f5e13c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_91f5e13c(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( ad_mf <= 87.7978 )
			if( bbm <= 7e-06 )
				if( bullPower <= -0.02048 )
					if( bbp <= -0.12317 )
						if( ad_mf <= 0.456132 )
							if( mf <= -0.170376 )
								if( bbp <= -0.124786 )
									ret := 0.635135
								if( bbp > -0.124786 )
									ret := -0.750000 // sell
							if( mf > -0.170376 )
								if( bullPower <= -0.068431 )
									ret := 0.255591
								if( bullPower > -0.068431 )
									ret := 0.074468
						if( ad_mf > 0.456132 )
							if( mf <= -0.649878 )
								if( mf <= -0.711868 )
									ret := 0.777778 // buy
								if( mf > -0.711868 )
									ret := 0.250000
							if( mf > -0.649878 )
								if( mf <= -0.484342 )
									ret := -0.680851
								if( mf > -0.484342 )
									ret := -0.052632
					if( bbp > -0.12317 )
						if( ad_mf <= 0.268084 )
							if( bbp <= -0.071362 )
								if( mf <= 0.515654 )
									ret := 0.480534
								if( mf > 0.515654 )
									ret := -0.257143
							if( bbp > -0.071362 )
								if( mf <= -0.057427 )
									ret := 0.164589
								if( mf > -0.057427 )
									ret := 0.367015
						if( ad_mf > 0.268084 )
							if( bearPower <= -0.05693 )
								if( mf <= -0.388155 )
									ret := -0.190476
								if( mf > -0.388155 )
									ret := 0.777778 // buy
							if( bearPower > -0.05693 )
								if( bbp <= -0.067152 )
									ret := 0.634483
								if( bbp > -0.067152 )
									ret := 0.485030
				if( bullPower > -0.02048 )
					if( mf <= -0.065706 )
						if( ad_mf <= 0.105511 )
							if( mf <= -0.086054 )
								if( ad_mf <= 0.093154 )
									ret := 0.688525
								if( ad_mf > 0.093154 )
									ret := 0.412698
							if( mf > -0.086054 )
								if( mf <= -0.071755 )
									ret := 0.000000
								if( mf > -0.071755 )
									ret := 0.475000
						if( ad_mf > 0.105511 )
							if( ad_mf <= 0.683955 )
								if( ad_mf <= 0.122936 )
									ret := -0.010417
								if( ad_mf > 0.122936 )
									ret := 0.213584
							if( ad_mf > 0.683955 )
								if( ad_mf <= 0.852523 )
									ret := 0.676471
								if( ad_mf > 0.852523 )
									ret := 0.000000
					if( mf > -0.065706 )
						if( ad_mf <= -0.463153 )
							if( mf <= 0.667318 )
								if( ad_mf <= -0.510225 )
									ret := 0.554348
								if( ad_mf > -0.510225 )
									ret := 0.272727
							if( mf > 0.667318 )
								if( bearPower <= -0.008452 )
									ret := -0.333333
								if( bearPower > -0.008452 )
									ret := 0.071429
						if( ad_mf > -0.463153 )
							if( bullPower <= -0.010711 )
								if( mf <= -0.026206 )
									ret := -0.200000
								if( mf > -0.026206 )
									ret := 0.192308
							if( bullPower > -0.010711 )
								if( mf <= -0.029829 )
									ret := 0.261194
								if( mf > -0.029829 )
									ret := -0.042328
			if( bbm > 7e-06 )
				if( bullPower <= 0.030761 )
					if( ad_mf <= -150678 )
						if( ad_mf <= -263093 )
							if( bearPower <= -0.046907 )
								if( mf <= -0.511725 )
									ret := -0.250000
								if( mf > -0.511725 )
									ret := 0.955556 // buy
							if( bearPower > -0.046907 )
								if( ad <= -514910 )
									ret := 0.500000
								if( ad > -514910 )
									ret := 0.250000
						if( ad_mf > -263093 )
							if( bullPower <= -0.10916 )
								if( bbm <= 0.274639 )
									ret := -1.000000 // sell
								if( bbm > 0.274639 )
									ret := 0.000000
							if( bullPower > -0.10916 )
								if( bbm <= 0.039251 )
									ret := -0.750000 // sell
								if( bbm > 0.039251 )
									ret := 0.564706
					if( ad_mf > -150678 )
						if( bbm <= 0.030108 )
							if( bullPower <= -0.129143 )
								if( mf <= -0.107562 )
									ret := 0.827586 // buy
								if( mf > -0.107562 )
									ret := 0.200000
							if( bullPower > -0.129143 )
								if( mf <= 0.189889 )
									ret := 0.029553
								if( mf > 0.189889 )
									ret := 0.158365
						if( bbm > 0.030108 )
							if( ad <= -3873.8 )
								if( ad_mf <= -3943.38 )
									ret := 0.095841
								if( ad_mf > -3943.38 )
									ret := -0.764706 // sell
							if( ad > -3873.8 )
								if( ad_mf <= -226.56 )
									ret := 0.410936
								if( ad_mf > -226.56 )
									ret := 0.105740
				if( bullPower > 0.030761 )
					if( ad_mf <= -2166.78 )
						if( bbp <= 0.051685 )
							if( ad <= -23704.6 )
								if( mf <= -0.620844 )
									ret := -0.923077 // sell
								if( mf > -0.620844 )
									ret := 0.166287
							if( ad > -23704.6 )
								if( bullPower <= 0.03646 )
									ret := 0.118577
								if( bullPower > 0.03646 )
									ret := 0.506173
						if( bbp > 0.051685 )
							if( ad <= -3139.08 )
								if( ad <= -3339.54 )
									ret := 0.138889
								if( ad > -3339.54 )
									ret := 1.000000 // buy
							if( ad > -3139.08 )
								if( bearPower <= 0.006198 )
									ret := 0.777778 // buy
								if( bearPower > 0.006198 )
									ret := -0.516129
					if( ad_mf > -2166.78 )
						if( ad_mf <= -1736.47 )
							if( ad_mf <= -1927.8 )
								if( bearPower <= 0.030088 )
									ret := 0.724138 // buy
								if( bearPower > 0.030088 )
									ret := -0.200000
							if( ad_mf > -1927.8 )
								if( bbp <= 0.027479 )
									ret := 0.750000 // buy
								if( bbp > 0.027479 )
									ret := 1.000000 // buy
						if( ad_mf > -1736.47 )
							if( ad <= -1640.47 )
								if( bearPower <= 0.016742 )
									ret := -0.900000 // sell
								if( bearPower > 0.016742 )
									ret := 0.600000
							if( ad > -1640.47 )
								if( bearPower <= -0.003366 )
									ret := 0.741935 // buy
								if( bearPower > -0.003366 )
									ret := 0.333333
		if( ad_mf > 87.7978 )
			if( bbp <= -0.119962 )
				if( ad <= 8607.33 )
					if( ad_mf <= 4006.07 )
						if( mf <= 0.054263 )
							if( mf <= -0.302688 )
								if( bearPower <= -0.212469 )
									ret := -1.000000 // sell
								if( bearPower > -0.212469 )
									ret := -0.226415
							if( mf > -0.302688 )
								if( bullPower <= -0.01556 )
									ret := 0.135266
								if( bullPower > -0.01556 )
									ret := -0.866667 // sell
						if( mf > 0.054263 )
							if( bullPower <= -0.042457 )
								if( bullPower <= -0.047965 )
									ret := 0.428571
								if( bullPower > -0.047965 )
									ret := -0.571429
							if( bullPower > -0.042457 )
								if( bbm <= 0.078081 )
									ret := 0.500000
								if( bbm > 0.078081 )
									ret := 0.923077 // buy
					if( ad_mf > 4006.07 )
						if( bbm <= 0.565 )
							if( bearPower <= -0.201022 )
								if( ad_mf <= 5986.72 )
									ret := 0.615385
								if( ad_mf > 5986.72 )
									ret := 1.000000 // buy
							if( bearPower > -0.201022 )
								if( mf <= 0.106897 )
									ret := 0.556818
								if( mf > 0.106897 )
									ret := 0.222222
						if( bbm > 0.565 )
							ret := -0.500000
				if( ad > 8607.33 )
					if( ad <= 9081.31 )
						if( mf <= -0.133625 )
							if( mf <= -0.173763 )
								if( bbm <= 0.0275 )
									ret := -0.750000 // sell
								if( bbm > 0.0275 )
									ret := 0.000000
							if( mf > -0.173763 )
								ret := 0.714286 // buy
						if( mf > -0.133625 )
							if( bbp <= -0.132664 )
								ret := -1.000000 // sell
							if( bbp > -0.132664 )
								ret := -0.500000
					if( ad > 9081.31 )
						if( mf <= -0.466337 )
							if( ad_mf <= 14800 )
								ret := 1.000000 // buy
							if( ad_mf > 14800 )
								if( ad <= 25466.5 )
									ret := 0.400000
								if( ad > 25466.5 )
									ret := 0.846154 // buy
						if( mf > -0.466337 )
							if( ad_mf <= 10337.4 )
								if( mf <= 0.059182 )
									ret := 0.600000
								if( mf > 0.059182 )
									ret := 0.066667
							if( ad_mf > 10337.4 )
								if( ad <= 13183.3 )
									ret := -0.315789
								if( ad > 13183.3 )
									ret := 0.098765
			if( bbp > -0.119962 )
				if( ad <= 250327 )
					if( ad <= 54606.5 )
						if( bbm <= 0.080461 )
							if( ad_mf <= 26601.3 )
								if( ad <= 23137.8 )
									ret := 0.013295
								if( ad > 23137.8 )
									ret := 0.246719
							if( ad_mf > 26601.3 )
								if( bullPower <= 0.066286 )
									ret := -0.128157
								if( bullPower > 0.066286 )
									ret := 0.219048
						if( bbm > 0.080461 )
							if( ad_mf <= 3178.81 )
								if( ad_mf <= 2437.98 )
									ret := -0.500000
								if( ad_mf > 2437.98 )
									ret := -0.904762 // sell
							if( ad_mf > 3178.81 )
								if( ad_mf <= 46680.8 )
									ret := -0.124352
								if( ad_mf > 46680.8 )
									ret := 0.360000
					if( ad > 54606.5 )
						if( ad_mf <= 57855.4 )
							if( bbm <= 0.060084 )
								if( bbp <= -0.01708 )
									ret := 0.200000
								if( bbp > -0.01708 )
									ret := 0.857143 // buy
							if( bbm > 0.060084 )
								if( ad <= 55324.3 )
									ret := 0.777778 // buy
								if( ad > 55324.3 )
									ret := 1.000000 // buy
						if( ad_mf > 57855.4 )
							if( bbm <= 0.173046 )
								if( mf <= 0.190814 )
									ret := 0.166197
								if( mf > 0.190814 )
									ret := -0.127820
							if( bbm > 0.173046 )
								if( ad <= 84556.1 )
									ret := -0.444444
								if( ad > 84556.1 )
									ret := 0.692308
				if( ad > 250327 )
					if( bbp <= -0.072075 )
						ret := -0.250000
					if( bbp > -0.072075 )
						if( bbm <= 0.040489 )
							if( ad <= 496056 )
								ret := -0.250000
							if( ad > 496056 )
								ret := -1.000000 // sell
						if( bbm > 0.040489 )
							if( bearPower <= -0.066948 )
								ret := -0.833333 // sell
							if( bearPower > -0.066948 )
								ret := -1.000000 // sell
	if( BBPower_Color > 0.5 )
		if( bbm <= 1.3e-05 )
			if( bearPower <= 0.015888 )
				if( ad_mf <= -0.172628 )
					if( ad_mf <= -0.175922 )
						if( bbp <= 0.025963 )
							if( mf <= 0.265625 )
								if( mf <= 0.184352 )
									ret := 0.481481
								if( mf > 0.184352 )
									ret := 0.173333
							if( mf > 0.265625 )
								if( ad_mf <= -0.305403 )
									ret := 0.081159
								if( ad_mf > -0.305403 )
									ret := -0.254237
						if( bbp > 0.025963 )
							if( bearPower <= 0.013136 )
								ret := -1.000000 // sell
							if( bearPower > 0.013136 )
								if( bullPower <= 0.01498 )
									ret := -0.213333
								if( bullPower > 0.01498 )
									ret := 0.090909
					if( ad_mf > -0.175922 )
						if( ad_mf <= -0.17434 )
							ret := 1.000000 // buy
						if( ad_mf > -0.17434 )
							ret := 0.571429
				if( ad_mf > -0.172628 )
					if( ad_mf <= -0.032889 )
						if( mf <= 0.131299 )
							if( mf <= 0.108497 )
								if( mf <= 0.044945 )
									ret := -0.452055
								if( mf > 0.044945 )
									ret := -0.106667
							if( mf > 0.108497 )
								if( bearPower <= 0.004614 )
									ret := -0.795918 // sell
								if( bearPower > 0.004614 )
									ret := -0.296296
						if( mf > 0.131299 )
							if( ad_mf <= -0.162425 )
								if( bbp <= 0.008 )
									ret := 0.166667
								if( bbp > 0.008 )
									ret := -0.645833
							if( ad_mf > -0.162425 )
								if( bearPower <= 0.007999 )
									ret := 0.292308
								if( bearPower > 0.007999 )
									ret := 0.015152
					if( ad_mf > -0.032889 )
						if( bullPower <= 0.011046 )
							if( ad_mf <= -0.021689 )
								if( mf <= 0.025951 )
									ret := 0.555556
								if( mf > 0.025951 )
									ret := 0.166667
							if( ad_mf > -0.021689 )
								if( mf <= -0.592085 )
									ret := 0.285714
								if( mf > -0.592085 )
									ret := -0.008026
						if( bullPower > 0.011046 )
							if( mf <= -0.035683 )
								if( ad_mf <= 0.294172 )
									ret := 0.115044
								if( ad_mf > 0.294172 )
									ret := -0.200000
							if( mf > -0.035683 )
								if( mf <= -0.023595 )
									ret := -0.681818
								if( mf > -0.023595 )
									ret := -0.253012
			if( bearPower > 0.015888 )
				if( bullPower <= 0.041161 )
					if( bullPower <= 0.025654 )
						if( ad_mf <= 0.002714 )
							if( bullPower <= 0.017583 )
								if( mf <= 0.015648 )
									ret := -0.590909
								if( mf > 0.015648 )
									ret := -0.128205
							if( bullPower > 0.017583 )
								if( ad_mf <= -0.238545 )
									ret := -0.230337
								if( ad_mf > -0.238545 )
									ret := -0.439024
						if( ad_mf > 0.002714 )
							if( mf <= -0.658474 )
								if( bullPower <= 0.01965 )
									ret := -0.285714
								if( bullPower > 0.01965 )
									ret := -0.785714 // sell
							if( mf > -0.658474 )
								if( mf <= -0.429716 )
									ret := 0.277108
								if( mf > -0.429716 )
									ret := -0.144876
					if( bullPower > 0.025654 )
						if( mf <= -0.224626 )
							if( mf <= -0.256764 )
								if( ad_mf <= 0.400997 )
									ret := -0.225000
								if( ad_mf > 0.400997 )
									ret := 0.200000
							if( mf > -0.256764 )
								if( bearPower <= 0.037598 )
									ret := 0.382979
								if( bearPower > 0.037598 )
									ret := -0.285714
						if( mf > -0.224626 )
							if( bullPower <= 0.031925 )
								if( ad_mf <= -0.144256 )
									ret := -0.234940
								if( ad_mf > -0.144256 )
									ret := -0.020080
							if( bullPower > 0.031925 )
								if( ad_mf <= -0.253111 )
									ret := -0.066116
								if( ad_mf > -0.253111 )
									ret := -0.388140
				if( bullPower > 0.041161 )
					if( mf <= 0.440391 )
						if( mf <= -0.069057 )
							if( bbp <= 0.134046 )
								if( bullPower <= 0.057087 )
									ret := -0.255814
								if( bullPower > 0.057087 )
									ret := 0.056180
							if( bbp > 0.134046 )
								if( ad_mf <= 0.087161 )
									ret := 0.500000
								if( ad_mf > 0.087161 )
									ret := -0.502008
						if( mf > -0.069057 )
							if( ad_mf <= -0.111862 )
								if( bullPower <= 0.09639 )
									ret := -0.424069
								if( bullPower > 0.09639 )
									ret := 0.042553
							if( ad_mf > -0.111862 )
								if( mf <= 0.044348 )
									ret := -0.523207
								if( mf > 0.044348 )
									ret := -0.776786 // sell
					if( mf > 0.440391 )
						if( ad_mf <= -0.546356 )
							if( bearPower <= 0.124444 )
								if( bbp <= 0.179713 )
									ret := -0.510204
								if( bbp > 0.179713 )
									ret := 0.307692
							if( bearPower > 0.124444 )
								ret := -1.000000 // sell
						if( ad_mf > -0.546356 )
							if( bbp <= 0.307482 )
								if( bbp <= 0.098921 )
									ret := 0.136364
								if( bbp > 0.098921 )
									ret := 0.652174
							if( bbp > 0.307482 )
								ret := -0.800000 // sell
		if( bbm > 1.3e-05 )
			if( bbp <= 0.100145 )
				if( ad_mf <= 0.254202 )
					if( bbm <= 0.035511 )
						if( ad_mf <= 0.168661 )
							if( bbm <= 0.01497 )
								if( mf <= -0.178308 )
									ret := 0.201439
								if( mf > -0.178308 )
									ret := 0.028202
							if( bbm > 0.01497 )
								if( ad <= -9586.17 )
									ret := 0.042595
								if( ad > -9586.17 )
									ret := -0.033405
						if( ad_mf > 0.168661 )
							if( bearPower <= 0.005536 )
								if( bullPower <= 0.008588 )
									ret := 0.842105 // buy
								if( bullPower > 0.008588 )
									ret := 0.387097
							if( bearPower > 0.005536 )
								if( bullPower <= 0.027556 )
									ret := -0.260870
								if( bullPower > 0.027556 )
									ret := 0.476190
					if( bbm > 0.035511 )
						if( mf <= -0.254804 )
							if( ad <= -319.5 )
								if( ad_mf <= -34665.9 )
									ret := 0.029412
								if( ad_mf > -34665.9 )
									ret := 0.496894
							if( ad > -319.5 )
								ret := -0.857143 // sell
						if( mf > -0.254804 )
							if( ad <= -10860.5 )
								if( bbm <= 0.03911 )
									ret := 0.410256
								if( bbm > 0.03911 )
									ret := 0.011927
							if( ad > -10860.5 )
								if( mf <= 0.122716 )
									ret := 0.098107
								if( mf > 0.122716 )
									ret := 0.327273
				if( ad_mf > 0.254202 )
					if( ad_mf <= 650.512 )
						if( ad_mf <= 359.925 )
							if( mf <= -0.065601 )
								if( bbp <= 0.067225 )
									ret := -0.285714
								if( bbp > 0.067225 )
									ret := -0.645161
							if( mf > -0.065601 )
								if( mf <= 0.282667 )
									ret := -0.050000
								if( mf > 0.282667 )
									ret := 0.325000
						if( ad_mf > 359.925 )
							if( bbp <= 0.030446 )
								if( ad_mf <= 400.292 )
									ret := -0.478261
								if( ad_mf > 400.292 )
									ret := -0.117117
							if( bbp > 0.030446 )
								if( ad <= 632.032 )
									ret := -0.500000
								if( ad > 632.032 )
									ret := -0.903226 // sell
					if( ad_mf > 650.512 )
						if( bbm <= 0.054117 )
							if( ad <= 40933.3 )
								if( bearPower <= 0.040951 )
									ret := 0.002207
								if( bearPower > 0.040951 )
									ret := -0.348837
							if( ad > 40933.3 )
								if( ad_mf <= 41477.6 )
									ret := -1.000000 // sell
								if( ad_mf > 41477.6 )
									ret := -0.174672
						if( bbm > 0.054117 )
							if( ad_mf <= 3702.5 )
								if( bullPower <= 0.03457 )
									ret := 0.444444
								if( bullPower > 0.03457 )
									ret := -0.625850
							if( ad_mf > 3702.5 )
								if( bbm <= 0.05488 )
									ret := -0.736842 // sell
								if( bbm > 0.05488 )
									ret := -0.103226
			if( bbp > 0.100145 )
				if( mf <= 0.320472 )
					if( bearPower <= 0.114429 )
						if( mf <= -0.044205 )
							if( ad_mf <= 28356.8 )
								if( ad_mf <= 0.147082 )
									ret := 0.026442
								if( ad_mf > 0.147082 )
									ret := -0.261029
							if( ad_mf > 28356.8 )
								if( bullPower <= 0.10392 )
									ret := -0.307692
								if( bullPower > 0.10392 )
									ret := 0.523810
						if( mf > -0.044205 )
							if( bbm <= 0.008048 )
								if( mf <= 0.13792 )
									ret := 1.000000 // buy
								if( mf > 0.13792 )
									ret := 0.461538
							if( bbm > 0.008048 )
								if( ad <= 189656 )
									ret := 0.089483
								if( ad > 189656 )
									ret := -0.888889 // sell
					if( bearPower > 0.114429 )
						if( bbm <= 0.206851 )
							if( bbp <= 0.516599 )
								if( mf <= -0.115728 )
									ret := -0.542857
								if( mf > -0.115728 )
									ret := -0.100478
							if( bbp > 0.516599 )
								if( bbm <= 0.056923 )
									ret := 0.400000
								if( bbm > 0.056923 )
									ret := -0.725000 // sell
						if( bbm > 0.206851 )
							if( mf <= 0.186371 )
								if( bbp <= 0.742204 )
									ret := 1.000000 // buy
								if( bbp > 0.742204 )
									ret := 0.333333
							if( mf > 0.186371 )
								if( bearPower <= 0.276192 )
									ret := -0.875000 // sell
								if( bearPower > 0.276192 )
									ret := 0.750000 // buy
				if( mf > 0.320472 )
					if( ad <= 77714 )
						if( ad_mf <= 24460.7 )
							if( bbp <= 0.142267 )
								if( mf <= 0.349541 )
									ret := 0.538462
								if( mf > 0.349541 )
									ret := 0.172566
							if( bbp > 0.142267 )
								if( ad <= -26695.2 )
									ret := 0.473684
								if( ad > -26695.2 )
									ret := 0.047836
						if( ad_mf > 24460.7 )
							if( bbp <= 0.733172 )
								if( bbp <= 0.106407 )
									ret := -0.384615
								if( bbp > 0.106407 )
									ret := 0.486395
							if( bbp > 0.733172 )
								if( bearPower <= 0.34339 )
									ret := -0.750000 // sell
								if( bearPower > 0.34339 )
									ret := -1.000000 // sell
					if( ad > 77714 )
						if( mf <= 0.652515 )
							if( bbm <= 0.217997 )
								if( ad <= 592914 )
									ret := -0.395349
								if( ad > 592914 )
									ret := 0.600000
							if( bbm > 0.217997 )
								if( bbp <= 0.959473 )
									ret := 0.000000
								if( bbp > 0.959473 )
									ret := 1.000000 // buy
						if( mf > 0.652515 )
							if( bullPower <= 0.16087 )
								ret := 0.750000 // buy
							if( bullPower > 0.16087 )
								ret := 1.000000 // buy
	
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_U_1Min_91f5e13c(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)

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


