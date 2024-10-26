//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: CRWD_15Min_1C00_964da688 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1C00_964da688", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_964da688(mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= 590.271 )
		if( ad_mf <= -6731.57 )
			if( ad_mf <= -112316 )
				if( ad_mf <= -208195 )
					if( ad <= -246999 )
						if( ad <= -264638 )
							if( ad <= -273583 )
								if( ad_mf <= -1.4551e+06 )
									ret := -0.454545
								if( ad_mf > -1.4551e+06 )
									ret := 0.078871
							if( ad > -273583 )
								if( ad <= -270595 )
									ret := -0.650000
								if( ad > -270595 )
									ret := -0.096774
						if( ad > -264638 )
							if( ad <= -249742 )
								if( ad <= -252350 )
									ret := 0.326241
								if( ad > -252350 )
									ret := 0.657143
							if( ad > -249742 )
								if( mf <= -0.377714 )
									ret := -0.687500
								if( mf > -0.377714 )
									ret := 0.319149
					if( ad > -246999 )
						if( ad <= -241968 )
							if( mf <= -0.179865 )
								if( ad <= -246366 )
									ret := 0.600000
								if( ad > -246366 )
									ret := -0.142857
							if( mf > -0.179865 )
								if( mf <= 0.071287 )
									ret := -0.625000
								if( mf > 0.071287 )
									ret := -1.000000 // sell
						if( ad > -241968 )
							if( ad <= -238717 )
								if( ad <= -241523 )
									ret := -0.250000
								if( ad > -241523 )
									ret := 0.432432
							if( ad > -238717 )
								if( ad <= -235830 )
									ret := -0.690476
								if( ad > -235830 )
									ret := -0.062016
				if( ad_mf > -208195 )
					if( ad_mf <= -207886 )
						if( ad <= -208035 )
							ret := 1.000000 // buy
						if( ad > -208035 )
							ret := 0.800000 // buy
					if( ad_mf > -207886 )
						if( mf <= -0.41761 )
							if( ad_mf <= -179301 )
								if( ad <= -181553 )
									ret := 0.380952
								if( ad > -181553 )
									ret := 0.970588 // buy
							if( ad_mf > -179301 )
								if( ad_mf <= -134650 )
									ret := 0.101695
								if( ad_mf > -134650 )
									ret := 0.427273
						if( mf > -0.41761 )
							if( ad <= -172349 )
								if( ad_mf <= -173927 )
									ret := 0.077922
								if( ad_mf > -173927 )
									ret := -0.489362
							if( ad > -172349 )
								if( ad <= -135832 )
									ret := 0.239386
								if( ad > -135832 )
									ret := 0.087432
			if( ad_mf > -112316 )
				if( ad <= -7459.98 )
					if( ad_mf <= -111237 )
						if( ad <= -112079 )
							if( mf <= -0.04381 )
								if( ad <= -112274 )
									ret := -0.750000 // sell
								if( ad > -112274 )
									ret := -1.000000 // sell
							if( mf > -0.04381 )
								if( ad_mf <= -112278 )
									ret := 0.000000
								if( ad_mf > -112278 )
									ret := -0.400000
						if( ad > -112079 )
							if( mf <= -0.283264 )
								ret := 0.750000 // buy
							if( mf > -0.283264 )
								if( ad <= -111728 )
									ret := -0.066667
								if( ad > -111728 )
									ret := -0.500000
					if( ad_mf > -111237 )
						if( ad_mf <= -7476.75 )
							if( mf <= -0.244979 )
								if( ad_mf <= -12673.8 )
									ret := -0.085637
								if( ad_mf > -12673.8 )
									ret := 0.133891
							if( mf > -0.244979 )
								if( ad_mf <= -90034.4 )
									ret := 0.096189
								if( ad_mf > -90034.4 )
									ret := 0.028097
						if( ad_mf > -7476.75 )
							if( mf <= 0.041311 )
								if( ad <= -7468.45 )
									ret := 0.625000
								if( ad > -7468.45 )
									ret := 1.000000 // buy
							if( mf > 0.041311 )
								ret := 0.200000
				if( ad > -7459.98 )
					if( mf <= 0.032473 )
						if( ad_mf <= -6958.12 )
							if( ad_mf <= -7162.14 )
								if( ad_mf <= -7316.21 )
									ret := -0.434783
								if( ad_mf > -7316.21 )
									ret := -0.657895
							if( ad_mf > -7162.14 )
								if( ad <= -7012.32 )
									ret := 0.072727
								if( ad > -7012.32 )
									ret := -0.358974
						if( ad_mf > -6958.12 )
							if( ad <= -6883.33 )
								if( mf <= -0.369703 )
									ret := -1.000000 // sell
								if( mf > -0.369703 )
									ret := -0.714286 // sell
							if( ad > -6883.33 )
								if( ad_mf <= -6839.95 )
									ret := -0.142857
								if( ad_mf > -6839.95 )
									ret := -0.760000 // sell
					if( mf > 0.032473 )
						if( ad <= -7336.46 )
							if( ad_mf <= -7378.98 )
								if( ad <= -7399.97 )
									ret := -0.555556
								if( ad > -7399.97 )
									ret := 0.250000
							if( ad_mf > -7378.98 )
								if( ad_mf <= -7358.54 )
									ret := -0.923077 // sell
								if( ad_mf > -7358.54 )
									ret := -0.714286 // sell
						if( ad > -7336.46 )
							if( ad_mf <= -6765.97 )
								if( mf <= 0.254574 )
									ret := 0.139535
								if( mf > 0.254574 )
									ret := 0.652174
							if( ad_mf > -6765.97 )
								if( ad_mf <= -6753.89 )
									ret := -1.000000 // sell
								if( ad_mf > -6753.89 )
									ret := 0.400000
		if( ad_mf > -6731.57 )
			if( ad <= -231.972 )
				if( ad <= -4989.27 )
					if( ad_mf <= -5063.9 )
						if( ad_mf <= -6644.44 )
							if( ad <= -6683.4 )
								if( mf <= -0.402501 )
									ret := -0.500000
								if( mf > -0.402501 )
									ret := 0.703704 // buy
							if( ad > -6683.4 )
								if( ad_mf <= -6660.64 )
									ret := 0.750000 // buy
								if( ad_mf > -6660.64 )
									ret := 1.000000 // buy
						if( ad_mf > -6644.44 )
							if( mf <= 0.331597 )
								if( mf <= 0.274353 )
									ret := 0.241427
								if( mf > 0.274353 )
									ret := -0.305556
							if( mf > 0.331597 )
								if( ad <= -6383.51 )
									ret := -0.571429
								if( ad > -6383.51 )
									ret := 0.677966
					if( ad_mf > -5063.9 )
						if( ad_mf <= -5006.89 )
							if( ad <= -5053.92 )
								ret := 1.000000 // buy
							if( ad > -5053.92 )
								if( mf <= 0.041698 )
									ret := 0.916667 // buy
								if( mf > 0.041698 )
									ret := 0.600000
						if( ad_mf > -5006.89 )
							ret := 0.333333
				if( ad > -4989.27 )
					if( mf <= -0.104866 )
						if( ad <= -475.5 )
							if( ad_mf <= -519.505 )
								if( mf <= -0.568728 )
									ret := 0.054348
								if( mf > -0.568728 )
									ret := 0.237182
							if( ad_mf > -519.505 )
								if( ad_mf <= -499.595 )
									ret := 0.642857
								if( ad_mf > -499.595 )
									ret := 0.250000
						if( ad > -475.5 )
							if( mf <= -0.221593 )
								if( ad_mf <= -368.085 )
									ret := -0.277778
								if( ad_mf > -368.085 )
									ret := 0.070423
							if( mf > -0.221593 )
								if( ad_mf <= -421.591 )
									ret := -0.026316
								if( ad_mf > -421.591 )
									ret := 0.294964
					if( mf > -0.104866 )
						if( ad_mf <= -303.935 )
							if( ad_mf <= -4806.43 )
								if( ad <= -4810.23 )
									ret := -0.326087
								if( ad > -4810.23 )
									ret := -0.875000 // sell
							if( ad_mf > -4806.43 )
								if( ad_mf <= -322.118 )
									ret := 0.110839
								if( ad_mf > -322.118 )
									ret := -0.279070
						if( ad_mf > -303.935 )
							if( ad_mf <= -256.555 )
								if( ad_mf <= -300.881 )
									ret := 0.833333 // buy
								if( ad_mf > -300.881 )
									ret := 0.262136
							if( ad_mf > -256.555 )
								if( mf <= 0.20002 )
									ret := 0.773585 // buy
								if( mf > 0.20002 )
									ret := 0.142857
			if( ad > -231.972 )
				if( ad_mf <= -0.190391 )
					if( mf <= 0.239186 )
						if( mf <= 0.237025 )
							if( ad_mf <= -0.203392 )
								if( mf <= -0.317154 )
									ret := -0.509434
								if( mf > -0.317154 )
									ret := -0.014901
							if( ad_mf > -0.203392 )
								if( ad_mf <= -0.19776 )
									ret := -0.428571
								if( ad_mf > -0.19776 )
									ret := -0.050633
						if( mf > 0.237025 )
							if( mf <= 0.238142 )
								if( ad_mf <= -0.237728 )
									ret := -0.928571 // sell
								if( ad_mf > -0.237728 )
									ret := -0.578947
							if( mf > 0.238142 )
								if( mf <= 0.238568 )
									ret := -0.250000
								if( mf > 0.238568 )
									ret := -0.500000
					if( mf > 0.239186 )
						if( ad_mf <= -0.253456 )
							if( ad_mf <= -0.300669 )
								if( ad_mf <= -0.329427 )
									ret := 0.012251
								if( ad_mf > -0.329427 )
									ret := 0.289855
							if( ad_mf > -0.300669 )
								if( ad_mf <= -0.268453 )
									ret := -0.204778
								if( ad_mf > -0.268453 )
									ret := 0.119205
						if( ad_mf > -0.253456 )
							if( ad_mf <= -0.252732 )
								if( mf <= 0.253265 )
									ret := 1.000000 // buy
								if( mf > 0.253265 )
									ret := 0.250000
							if( ad_mf > -0.252732 )
								if( mf <= 0.252546 )
									ret := 0.328125
								if( mf > 0.252546 )
									ret := -0.250000
				if( ad_mf > -0.190391 )
					if( ad_mf <= 583.796 )
						if( mf <= -0.233509 )
							if( ad_mf <= 0.260017 )
								if( ad_mf <= 0.257581 )
									ret := 0.269388
								if( ad_mf > 0.257581 )
									ret := 0.800000 // buy
							if( ad_mf > 0.260017 )
								if( ad_mf <= 0.430022 )
									ret := 0.147874
								if( ad_mf > 0.430022 )
									ret := 0.038057
						if( mf > -0.233509 )
							if( mf <= 0.007651 )
								if( mf <= -0.231168 )
									ret := -0.421053
								if( mf > -0.231168 )
									ret := 0.012417
							if( mf > 0.007651 )
								if( mf <= 0.008818 )
									ret := 0.666667
								if( mf > 0.008818 )
									ret := 0.087204
					if( ad_mf > 583.796 )
						if( mf <= 0.562693 )
							if( ad <= 584.855 )
								ret := 0.833333 // buy
							if( ad > 584.855 )
								if( ad <= 588.865 )
									ret := 0.157895
								if( ad > 588.865 )
									ret := 0.625000
						if( mf > 0.562693 )
							ret := 1.000000 // buy
	if( ad > 590.271 )
		if( ad_mf <= 3560.32 )
			if( ad_mf <= 3099.24 )
				if( ad_mf <= 2747.5 )
					if( mf <= -0.208504 )
						if( ad_mf <= 857.935 )
							if( ad_mf <= 633.143 )
								if( ad <= 608.179 )
									ret := 0.176471
								if( ad > 608.179 )
									ret := -0.640000
							if( ad_mf > 633.143 )
								if( ad <= 795.5 )
									ret := 0.188312
								if( ad > 795.5 )
									ret := 0.415385
						if( ad_mf > 857.935 )
							if( ad_mf <= 965.122 )
								if( mf <= -0.235171 )
									ret := -0.478873
								if( mf > -0.235171 )
									ret := 0.333333
							if( ad_mf > 965.122 )
								if( ad_mf <= 996.957 )
									ret := 0.730769 // buy
								if( ad_mf > 996.957 )
									ret := 0.017926
					if( mf > -0.208504 )
						if( ad <= 752.48 )
							if( ad <= 721.079 )
								if( ad <= 711.087 )
									ret := -0.153017
								if( ad > 711.087 )
									ret := 0.285714
							if( ad > 721.079 )
								if( ad_mf <= 722.831 )
									ret := -0.888889 // sell
								if( ad_mf > 722.831 )
									ret := -0.333333
						if( ad > 752.48 )
							if( ad_mf <= 833.239 )
								if( ad_mf <= 816.281 )
									ret := 0.091703
								if( ad_mf > 816.281 )
									ret := 0.528302
							if( ad_mf > 833.239 )
								if( ad <= 841.734 )
									ret := -0.571429
								if( ad > 841.734 )
									ret := -0.048068
				if( ad_mf > 2747.5 )
					if( ad_mf <= 2890.84 )
						if( mf <= 0.649002 )
							if( ad <= 2864.35 )
								if( ad_mf <= 2777.76 )
									ret := 0.625000
								if( ad_mf > 2777.76 )
									ret := 0.260274
							if( ad > 2864.35 )
								if( ad_mf <= 2881.55 )
									ret := 0.843750 // buy
								if( ad_mf > 2881.55 )
									ret := 0.272727
						if( mf > 0.649002 )
							ret := -0.500000
					if( ad_mf > 2890.84 )
						if( mf <= 0.200993 )
							if( mf <= -0.250866 )
								if( ad <= 2927.55 )
									ret := 0.000000
								if( ad > 2927.55 )
									ret := -0.541667
							if( mf > -0.250866 )
								if( ad <= 2962.94 )
									ret := -0.186047
								if( ad > 2962.94 )
									ret := 0.461538
						if( mf > 0.200993 )
							if( ad <= 3008.05 )
								if( ad <= 2959.61 )
									ret := -0.705882 // sell
								if( ad > 2959.61 )
									ret := 0.076923
							if( ad > 3008.05 )
								if( ad_mf <= 3056.63 )
									ret := -1.000000 // sell
								if( ad_mf > 3056.63 )
									ret := -0.500000
			if( ad_mf > 3099.24 )
				if( mf <= 0.274322 )
					if( ad_mf <= 3125.9 )
						if( mf <= 0.082045 )
							if( mf <= -0.337488 )
								ret := -1.000000 // sell
							if( mf > -0.337488 )
								if( mf <= 0.013016 )
									ret := -0.500000
								if( mf > 0.013016 )
									ret := -1.000000 // sell
						if( mf > 0.082045 )
							ret := 0.000000
					if( ad_mf > 3125.9 )
						if( ad <= 3515.74 )
							if( ad <= 3403.91 )
								if( ad <= 3189.02 )
									ret := 0.000000
								if( ad > 3189.02 )
									ret := -0.209877
							if( ad > 3403.91 )
								if( ad <= 3437.78 )
									ret := 0.615385
								if( ad > 3437.78 )
									ret := -0.042553
						if( ad > 3515.74 )
							if( ad <= 3544 )
								if( mf <= -0.000442 )
									ret := -0.846154 // sell
								if( mf > -0.000442 )
									ret := -0.333333
							if( ad > 3544 )
								ret := 0.000000
				if( mf > 0.274322 )
					if( ad <= 3273.61 )
						if( ad_mf <= 3174.73 )
							ret := 0.000000
						if( ad_mf > 3174.73 )
							if( ad_mf <= 3220.35 )
								ret := -1.000000 // sell
							if( ad_mf > 3220.35 )
								if( ad_mf <= 3265.84 )
									ret := -0.333333
								if( ad_mf > 3265.84 )
									ret := -0.875000 // sell
					if( ad > 3273.61 )
						if( ad_mf <= 3550.42 )
							if( ad_mf <= 3504.84 )
								if( ad <= 3457.56 )
									ret := -0.200000
								if( ad > 3457.56 )
									ret := -0.750000 // sell
							if( ad_mf > 3504.84 )
								if( ad <= 3517.78 )
									ret := 0.250000
								if( ad > 3517.78 )
									ret := 0.000000
						if( ad_mf > 3550.42 )
							ret := -1.000000 // sell
		if( ad_mf > 3560.32 )
			if( ad_mf <= 4605.81 )
				if( mf <= 0.369134 )
					if( mf <= -0.224336 )
						if( ad_mf <= 4192.7 )
							if( ad_mf <= 4052.2 )
								if( ad_mf <= 3630.08 )
									ret := -0.538462
								if( ad_mf > 3630.08 )
									ret := 0.170213
							if( ad_mf > 4052.2 )
								if( ad <= 4141.46 )
									ret := 0.842105 // buy
								if( ad > 4141.46 )
									ret := 0.428571
						if( ad_mf > 4192.7 )
							if( ad_mf <= 4375.31 )
								if( mf <= -0.238417 )
									ret := -0.736842 // sell
								if( mf > -0.238417 )
									ret := -0.250000
							if( ad_mf > 4375.31 )
								if( ad <= 4497.81 )
									ret := 0.333333
								if( ad > 4497.81 )
									ret := -0.666667
					if( mf > -0.224336 )
						if( ad_mf <= 4485.41 )
							if( mf <= 0.205531 )
								if( ad <= 4474.84 )
									ret := 0.291237
								if( ad > 4474.84 )
									ret := -1.000000 // sell
							if( mf > 0.205531 )
								if( ad_mf <= 3624.39 )
									ret := 0.500000
								if( ad_mf > 3624.39 )
									ret := -0.065217
						if( ad_mf > 4485.41 )
							if( ad <= 4507.2 )
								if( ad <= 4489.39 )
									ret := 0.750000 // buy
								if( ad > 4489.39 )
									ret := 1.000000 // buy
							if( ad > 4507.2 )
								if( mf <= 0.208531 )
									ret := 0.675676
								if( mf > 0.208531 )
									ret := 0.000000
				if( mf > 0.369134 )
					if( ad_mf <= 3663.92 )
						if( ad_mf <= 3619.99 )
							ret := -0.800000 // sell
						if( ad_mf > 3619.99 )
							ret := -1.000000 // sell
					if( ad_mf > 3663.92 )
						if( ad_mf <= 3907.01 )
							if( ad_mf <= 3728.37 )
								ret := 0.250000
							if( ad_mf > 3728.37 )
								ret := 0.000000
						if( ad_mf > 3907.01 )
							if( ad <= 3996.48 )
								ret := -1.000000 // sell
							if( ad > 3996.48 )
								if( ad <= 4137.67 )
									ret := -0.222222
								if( ad > 4137.67 )
									ret := -0.625000
			if( ad_mf > 4605.81 )
				if( ad_mf <= 4709.23 )
					if( ad <= 4648.56 )
						if( ad <= 4621.06 )
							ret := -0.500000
						if( ad > 4621.06 )
							ret := -1.000000 // sell
					if( ad > 4648.56 )
						if( ad <= 4702.58 )
							if( ad_mf <= 4695.2 )
								if( mf <= -0.112855 )
									ret := 0.000000
								if( mf > -0.112855 )
									ret := -0.571429
							if( ad_mf > 4695.2 )
								ret := 0.500000
						if( ad > 4702.58 )
							ret := -0.857143 // sell
				if( ad_mf > 4709.23 )
					if( ad_mf <= 1.09842e+06 )
						if( ad_mf <= 297858 )
							if( ad_mf <= 115872 )
								if( ad <= 114061 )
									ret := 0.016880
								if( ad > 114061 )
									ret := -0.178218
							if( ad_mf > 115872 )
								if( mf <= 0.308893 )
									ret := 0.054251
								if( mf > 0.308893 )
									ret := 0.185035
						if( ad_mf > 297858 )
							if( mf <= 0.168293 )
								if( ad_mf <= 487859 )
									ret := 0.148876
								if( ad_mf > 487859 )
									ret := -0.171171
							if( mf > 0.168293 )
								if( ad <= 449708 )
									ret := -0.314480
								if( ad > 449708 )
									ret := 0.039024
					if( ad_mf > 1.09842e+06 )
						if( ad <= 1.20379e+06 )
							if( mf <= 0.575311 )
								if( ad <= 1.15159e+06 )
									ret := 0.769231 // buy
								if( ad > 1.15159e+06 )
									ret := 1.000000 // buy
							if( mf > 0.575311 )
								ret := 0.250000
						if( ad > 1.20379e+06 )
							if( ad_mf <= 2.01475e+06 )
								if( ad_mf <= 1.34856e+06 )
									ret := 0.208333
								if( ad_mf > 1.34856e+06 )
									ret := -0.368421
							if( ad_mf > 2.01475e+06 )
								if( ad <= 5.88865e+06 )
									ret := 0.705882 // buy
								if( ad > 5.88865e+06 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_CRWD_15Min_964da688(mf, ad_mf, ad)

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


