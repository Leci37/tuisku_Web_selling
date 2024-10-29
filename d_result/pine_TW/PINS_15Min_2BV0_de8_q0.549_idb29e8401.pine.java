//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: PINS_15Min_2BV0_b29e8401 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2BV0_b29e8401", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_b29e8401(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.043356 )
		if( bbm <= 0.039815 )
			if( bbp <= -0.410037 )
				if( VIP <= 1.05809 )
					if( bullPower <= -0.204714 )
						if( bearPower <= -0.230184 )
							if( VIP_VIM <= -1.09674 )
								if( bbp <= -1.0908 )
									ret := 0.933333 // buy
								if( bbp > -1.0908 )
									ret := 0.400000
							if( VIP_VIM > -1.09674 )
								if( VIM <= 1.80359 )
									ret := 0.236967
								if( VIM > 1.80359 )
									ret := -0.578947
						if( bearPower > -0.230184 )
							if( bullPower <= -0.220741 )
								if( VIM <= 1.4619 )
									ret := -0.333333
								if( VIM > 1.4619 )
									ret := -1.000000 // sell
							if( bullPower > -0.220741 )
								if( bbm <= 0.001397 )
									ret := -0.136364
								if( bbm > 0.001397 )
									ret := 0.400000
					if( bullPower > -0.204714 )
						if( VIP <= 0.849741 )
							ret := 0.250000
						if( VIP > 0.849741 )
							ret := 1.000000 // buy
				if( VIP > 1.05809 )
					if( bullPower <= -0.528993 )
						if( VIP_VIM <= -0.270019 )
							if( bullPower <= -0.564928 )
								if( VIP <= 1.60613 )
									ret := 0.697674
								if( VIP > 1.60613 )
									ret := 0.485714
							if( bullPower > -0.564928 )
								if( bearPower <= -0.540651 )
									ret := -0.750000 // sell
								if( bearPower > -0.540651 )
									ret := 0.600000
						if( VIP_VIM > -0.270019 )
							if( bullPower <= -1.11658 )
								ret := 0.428571
							if( bullPower > -1.11658 )
								if( VIP_VIM <= 0.315013 )
									ret := -0.166667
								if( VIP_VIM > 0.315013 )
									ret := -0.750000 // sell
					if( bullPower > -0.528993 )
						if( VIM <= 1.29387 )
							if( bearPower <= -0.223829 )
								if( VIP <= 1.08425 )
									ret := 1.000000 // buy
								if( VIP > 1.08425 )
									ret := 0.025641
							if( bearPower > -0.223829 )
								if( bbp <= -0.428168 )
									ret := 1.000000 // buy
								if( bbp > -0.428168 )
									ret := 0.750000 // buy
						if( VIM > 1.29387 )
							if( VIP_VIM <= 0.407051 )
								if( VIM <= 3.22291 )
									ret := 0.596803
								if( VIM > 3.22291 )
									ret := 0.180000
							if( VIP_VIM > 0.407051 )
								if( bbm <= 0.028821 )
									ret := 0.929577 // buy
								if( bbm > 0.028821 )
									ret := 0.500000
			if( bbp > -0.410037 )
				if( VIP <= 0.977615 )
					if( bbp <= -0.371135 )
						if( bullPower <= -0.183229 )
							if( VIM <= 1.36841 )
								if( VIM <= 1.24152 )
									ret := 0.545455
								if( VIM > 1.24152 )
									ret := 0.000000
							if( VIM > 1.36841 )
								if( VIM <= 1.48288 )
									ret := -1.000000 // sell
								if( VIM > 1.48288 )
									ret := 0.000000
						if( bullPower > -0.183229 )
							if( VIP <= 0.757584 )
								ret := -0.250000
							if( VIP > 0.757584 )
								ret := -1.000000 // sell
					if( bbp > -0.371135 )
						if( VIP_VIM <= -0.699612 )
							if( bullPower <= -0.154773 )
								if( VIM <= 1.78351 )
									ret := -0.083333
								if( VIM > 1.78351 )
									ret := -0.500000
							if( bullPower > -0.154773 )
								if( VIP <= 0.699065 )
									ret := -0.080000
								if( VIP > 0.699065 )
									ret := 0.530303
						if( VIP_VIM > -0.699612 )
							if( VIP_VIM <= -0.673123 )
								if( VIM <= 1.43308 )
									ret := 1.000000 // buy
								if( VIM > 1.43308 )
									ret := -0.464286
							if( VIP_VIM > -0.673123 )
								if( VIM <= 1.59951 )
									ret := 0.081707
								if( VIM > 1.59951 )
									ret := 1.000000 // buy
				if( VIP > 0.977615 )
					if( bullPower <= -0.093391 )
						if( VIM <= 1.37704 )
							if( bbp <= -0.36906 )
								if( VIP_VIM <= 0.503906 )
									ret := -0.086957
								if( VIP_VIM > 0.503906 )
									ret := 0.500000
							if( bbp > -0.36906 )
								if( VIP_VIM <= -0.13046 )
									ret := 0.364583
								if( VIP_VIM > -0.13046 )
									ret := 0.548287
						if( VIM > 1.37704 )
							if( bullPower <= -0.10632 )
								if( bearPower <= -0.179697 )
									ret := 0.461538
								if( bearPower > -0.179697 )
									ret := 0.190871
							if( bullPower > -0.10632 )
								if( bbm <= 0.011049 )
									ret := 0.425926
								if( bbm > 0.011049 )
									ret := 0.857143 // buy
					if( bullPower > -0.093391 )
						if( VIM <= 2.75606 )
							if( VIP <= 2.78236 )
								if( VIP_VIM <= -0.194521 )
									ret := 0.349882
								if( VIP_VIM > -0.194521 )
									ret := 0.122249
							if( VIP > 2.78236 )
								if( VIP_VIM <= 0.449384 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.449384 )
									ret := -0.750000 // sell
						if( VIM > 2.75606 )
							if( VIP_VIM <= -0.792278 )
								if( VIP_VIM <= -1.01817 )
									ret := 0.333333
								if( VIP_VIM > -1.01817 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.792278 )
								if( VIP_VIM <= 0.673311 )
									ret := 0.598214
								if( VIP_VIM > 0.673311 )
									ret := -0.222222
		if( bbm > 0.039815 )
			if( bearPower <= -0.338759 )
				if( VIP_VIM <= -0.83018 )
					if( bullPower <= -0.659991 )
						if( bullPower <= -1.29064 )
							if( bearPower <= -4.79457 )
								if( VIP <= 0.462152 )
									ret := 0.250000
								if( VIP > 0.462152 )
									ret := -0.500000
							if( bearPower > -4.79457 )
								if( bbm <= 0.2325 )
									ret := -0.200000
								if( bbm > 0.2325 )
									ret := 0.916667 // buy
						if( bullPower > -1.29064 )
							if( VIM <= 1.43616 )
								if( bearPower <= -1.24131 )
									ret := -0.125000
								if( bearPower > -1.24131 )
									ret := 0.800000 // buy
							if( VIM > 1.43616 )
								if( bbm <= 0.5775 )
									ret := -0.114286
								if( bbm > 0.5775 )
									ret := 0.282051
					if( bullPower > -0.659991 )
						if( bbp <= -1.27316 )
							if( bbm <= 0.85 )
								if( VIP_VIM <= -0.871469 )
									ret := 0.868421 // buy
								if( VIP_VIM > -0.871469 )
									ret := 0.575758
							if( bbm > 0.85 )
								if( bearPower <= -1.49524 )
									ret := 0.250000
								if( bearPower > -1.49524 )
									ret := -0.750000 // sell
						if( bbp > -1.27316 )
							if( bearPower <= -0.705012 )
								if( VIP <= 0.580838 )
									ret := 0.750000 // buy
								if( VIP > 0.580838 )
									ret := -0.333333
							if( bearPower > -0.705012 )
								if( bearPower <= -0.462878 )
									ret := 0.602564
								if( bearPower > -0.462878 )
									ret := 0.242105
				if( VIP_VIM > -0.83018 )
					if( bbp <= -3.68801 )
						if( VIP <= 0.804731 )
							if( bbp <= -8.26866 )
								ret := -1.000000 // sell
							if( bbp > -8.26866 )
								if( bullPower <= -1.96847 )
									ret := 0.451613
								if( bullPower > -1.96847 )
									ret := 0.858974 // buy
						if( VIP > 0.804731 )
							if( VIM <= 1.36597 )
								ret := -1.000000 // sell
							if( VIM > 1.36597 )
								if( bearPower <= -2.49517 )
									ret := 0.250000
								if( bearPower > -2.49517 )
									ret := 1.000000 // buy
					if( bbp > -3.68801 )
						if( bbp <= -3.21525 )
							if( bbp <= -3.44518 )
								if( bbm <= 1.10024 )
									ret := 0.285714
								if( bbm > 1.10024 )
									ret := -1.000000 // sell
							if( bbp > -3.44518 )
								if( VIP_VIM <= -0.451248 )
									ret := -0.769231 // sell
								if( VIP_VIM > -0.451248 )
									ret := -0.166667
						if( bbp > -3.21525 )
							if( bbm <= 0.374235 )
								if( bbm <= 0.305002 )
									ret := 0.144301
								if( bbm > 0.305002 )
									ret := 0.297297
							if( bbm > 0.374235 )
								if( bbm <= 1.29796 )
									ret := 0.031227
								if( bbm > 1.29796 )
									ret := 0.563636
			if( bearPower > -0.338759 )
				if( VIM <= 0.911207 )
					if( VIM <= 0.896327 )
						if( bbm <= 0.1449 )
							if( bearPower <= -0.161682 )
								if( bbp <= -0.344969 )
									ret := -0.750000 // sell
								if( bbp > -0.344969 )
									ret := -0.200000
							if( bearPower > -0.161682 )
								ret := -1.000000 // sell
						if( bbm > 0.1449 )
							ret := 0.000000
					if( VIM > 0.896327 )
						if( bbp <= -0.289985 )
							ret := -1.000000 // sell
						if( bbp > -0.289985 )
							ret := -0.714286 // sell
				if( VIM > 0.911207 )
					if( VIP <= 1.40631 )
						if( bbm <= 0.227283 )
							if( VIP <= 1.33647 )
								if( VIP <= 0.78117 )
									ret := -0.087973
								if( VIP > 0.78117 )
									ret := 0.031243
							if( VIP > 1.33647 )
								if( bbm <= 0.088007 )
									ret := 0.066667
								if( bbm > 0.088007 )
									ret := -0.581081
						if( bbm > 0.227283 )
							if( bbm <= 0.268169 )
								if( VIM <= 1.29716 )
									ret := 0.296651
								if( VIM > 1.29716 )
									ret := 0.629032
							if( bbm > 0.268169 )
								if( VIM <= 1.16676 )
									ret := -0.600000
								if( VIM > 1.16676 )
									ret := 0.210526
					if( VIP > 1.40631 )
						if( VIP_VIM <= -0.228347 )
							if( VIM <= 2.64607 )
								if( bbm <= 0.089203 )
									ret := 0.685185
								if( bbm > 0.089203 )
									ret := 0.315789
							if( VIM > 2.64607 )
								if( VIP <= 2.36257 )
									ret := -0.215686
								if( VIP > 2.36257 )
									ret := 0.444444
						if( VIP_VIM > -0.228347 )
							if( VIP <= 1.91408 )
								if( VIM <= 1.48466 )
									ret := 0.487500
								if( VIM > 1.48466 )
									ret := 0.081967
							if( VIP > 1.91408 )
								if( VIP_VIM <= 0.076064 )
									ret := 0.039216
								if( VIP_VIM > 0.076064 )
									ret := -0.377049
	if( bullPower > -0.043356 )
		if( VIP <= 1.71849 )
			if( bullPower <= 0.460526 )
				if( bbm <= 0.324495 )
					if( VIM <= 0.988224 )
						if( bullPower <= 0.362333 )
							if( bullPower <= 0.231977 )
								if( VIP_VIM <= -0.00991 )
									ret := 0.468354
								if( VIP_VIM > -0.00991 )
									ret := 0.066464
							if( bullPower > 0.231977 )
								if( VIP_VIM <= 0.069681 )
									ret := -0.323529
								if( VIP_VIM > 0.069681 )
									ret := -0.011940
						if( bullPower > 0.362333 )
							if( bbp <= 0.728895 )
								if( bbm <= 0.1696 )
									ret := 0.444444
								if( bbm > 0.1696 )
									ret := 0.128205
							if( bbp > 0.728895 )
								if( VIP_VIM <= 0.461962 )
									ret := 0.178571
								if( VIP_VIM > 0.461962 )
									ret := -0.242991
					if( VIM > 0.988224 )
						if( bearPower <= 0.185155 )
							if( bullPower <= 0.380301 )
								if( bbp <= 0.175154 )
									ret := 0.033910
								if( bbp > 0.175154 )
									ret := -0.076374
							if( bullPower > 0.380301 )
								if( VIM <= 1.2114 )
									ret := 0.715789 // buy
								if( VIM > 1.2114 )
									ret := -0.083333
						if( bearPower > 0.185155 )
							if( bbm <= 0.148665 )
								if( VIP <= 1.6368 )
									ret := -0.402746
								if( VIP > 1.6368 )
									ret := 0.017544
							if( bbm > 0.148665 )
								if( VIM <= 1.31055 )
									ret := 0.182927
								if( VIM > 1.31055 )
									ret := -0.944444 // sell
				if( bbm > 0.324495 )
					if( VIP <= 1.28546 )
						if( bullPower <= 0.297654 )
							if( VIP_VIM <= -0.273821 )
								if( bullPower <= 0.140121 )
									ret := -0.012586
								if( bullPower > 0.140121 )
									ret := 0.221865
							if( VIP_VIM > -0.273821 )
								if( bearPower <= -0.719779 )
									ret := 0.502674
								if( bearPower > -0.719779 )
									ret := 0.164194
						if( bullPower > 0.297654 )
							if( VIP_VIM <= 0.184516 )
								if( VIP_VIM <= 0.111388 )
									ret := 0.025257
								if( VIP_VIM > 0.111388 )
									ret := -0.205021
							if( VIP_VIM > 0.184516 )
								if( bearPower <= -0.131911 )
									ret := -0.109756
								if( bearPower > -0.131911 )
									ret := 0.227273
					if( VIP > 1.28546 )
						if( VIP <= 1.29186 )
							if( bearPower <= -0.363983 )
								ret := -1.000000 // sell
							if( bearPower > -0.363983 )
								if( VIM <= 1.24506 )
									ret := -0.750000 // sell
								if( VIM > 1.24506 )
									ret := 0.250000
						if( VIP > 1.29186 )
							if( bbm <= 0.577035 )
								if( bbm <= 0.484459 )
									ret := -0.023707
								if( bbm > 0.484459 )
									ret := -0.378947
							if( bbm > 0.577035 )
								if( VIP <= 1.5795 )
									ret := 0.125000
								if( VIP > 1.5795 )
									ret := 0.769231 // buy
			if( bullPower > 0.460526 )
				if( bbm <= 2.3352 )
					if( VIP_VIM <= 0.863041 )
						if( bbp <= 1.99176 )
							if( bbp <= -0.144059 )
								if( VIM <= 1.03516 )
									ret := -0.115385
								if( VIM > 1.03516 )
									ret := 0.877551 // buy
							if( bbp > -0.144059 )
								if( VIM <= 0.955126 )
									ret := -0.014502
								if( VIM > 0.955126 )
									ret := -0.143658
						if( bbp > 1.99176 )
							if( bbp <= 2.27585 )
								if( VIM <= 0.593033 )
									ret := 0.500000
								if( VIM > 0.593033 )
									ret := -0.705882 // sell
							if( bbp > 2.27585 )
								if( VIP_VIM <= 0.569428 )
									ret := -0.045685
								if( VIP_VIM > 0.569428 )
									ret := -0.411392
					if( VIP_VIM > 0.863041 )
						if( bearPower <= 0.492378 )
							if( VIP_VIM <= 0.873203 )
								if( bbm <= 0.216346 )
									ret := -0.250000
								if( bbm > 0.216346 )
									ret := 1.000000 // buy
							if( VIP_VIM > 0.873203 )
								if( VIP <= 1.44433 )
									ret := 0.280000
								if( VIP > 1.44433 )
									ret := -0.349398
						if( bearPower > 0.492378 )
							if( VIP_VIM <= 1.08327 )
								if( bullPower <= 1.6091 )
									ret := 0.388489
								if( bullPower > 1.6091 )
									ret := -0.014925
							if( VIP_VIM > 1.08327 )
								if( bullPower <= 1.80976 )
									ret := 0.250000
								if( bullPower > 1.80976 )
									ret := 1.000000 // buy
				if( bbm > 2.3352 )
					if( VIM <= 0.93519 )
						if( bearPower <= 0.752567 )
							if( VIM <= 0.679347 )
								if( VIP_VIM <= 0.305478 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.305478 )
									ret := -0.714286 // sell
							if( VIM > 0.679347 )
								if( VIP_VIM <= -0.287871 )
									ret := -0.500000
								if( VIP_VIM > -0.287871 )
									ret := -0.901639 // sell
						if( bearPower > 0.752567 )
							if( VIM <= 0.595324 )
								ret := -0.800000 // sell
							if( VIM > 0.595324 )
								if( bearPower <= 2.3836 )
									ret := 1.000000 // buy
								if( bearPower > 2.3836 )
									ret := 0.250000
					if( VIM > 0.93519 )
						if( bearPower <= -1.66688 )
							if( bullPower <= 0.703447 )
								if( bearPower <= -2.38176 )
									ret := 0.500000
								if( bearPower > -2.38176 )
									ret := -0.500000
							if( bullPower > 0.703447 )
								if( bullPower <= 0.992976 )
									ret := -1.000000 // sell
								if( bullPower > 0.992976 )
									ret := -0.375000
						if( bearPower > -1.66688 )
							if( VIP_VIM <= -0.138263 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.138263 )
								ret := 0.000000
		if( VIP > 1.71849 )
			if( bearPower <= 0.068327 )
				if( bearPower <= -0.175184 )
					if( VIP <= 2.14221 )
						if( bullPower <= 0.127911 )
							if( VIP_VIM <= 0.08188 )
								if( bullPower <= 0.082005 )
									ret := -0.553846
								if( bullPower > 0.082005 )
									ret := -0.187500
							if( VIP_VIM > 0.08188 )
								if( VIP_VIM <= 0.301177 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.301177 )
									ret := -0.500000
						if( bullPower > 0.127911 )
							if( VIM <= 1.99954 )
								if( bbm <= 0.60845 )
									ret := -0.416667
								if( bbm > 0.60845 )
									ret := 0.000000
							if( VIM > 1.99954 )
								if( bearPower <= -0.273799 )
									ret := 0.250000
								if( bearPower > -0.273799 )
									ret := 0.714286 // buy
					if( VIP > 2.14221 )
						if( VIP <= 2.33018 )
							if( bullPower <= 0.004646 )
								ret := 0.250000
							if( bullPower > 0.004646 )
								if( VIP_VIM <= 0.044151 )
									ret := 0.444444
								if( VIP_VIM > 0.044151 )
									ret := 0.900000 // buy
						if( VIP > 2.33018 )
							if( VIP <= 2.52393 )
								if( bearPower <= -0.220029 )
									ret := 0.142857
								if( bearPower > -0.220029 )
									ret := -0.846154 // sell
							if( VIP > 2.52393 )
								if( bbm <= 0.208741 )
									ret := 0.555556
								if( bbm > 0.208741 )
									ret := -0.238095
				if( bearPower > -0.175184 )
					if( bbp <= -0.047369 )
						if( VIM <= 3.18762 )
							if( VIM <= 2.77731 )
								if( VIP <= 1.79172 )
									ret := -0.145833
								if( VIP > 1.79172 )
									ret := 0.196481
							if( VIM > 2.77731 )
								if( VIP_VIM <= -0.078376 )
									ret := 0.810811 // buy
								if( VIP_VIM > -0.078376 )
									ret := 0.000000
						if( VIM > 3.18762 )
							if( bbm <= 0.009145 )
								if( VIP <= 4.02363 )
									ret := -0.333333
								if( VIP > 4.02363 )
									ret := 0.764706 // buy
							if( bbm > 0.009145 )
								if( bullPower <= 0.003766 )
									ret := -0.161765
								if( bullPower > 0.003766 )
									ret := -0.700000 // sell
					if( bbp > -0.047369 )
						if( bullPower <= 0.154224 )
							if( bbm <= 0.105391 )
								if( VIP <= 1.93637 )
									ret := -0.137778
								if( VIP > 1.93637 )
									ret := 0.020814
							if( bbm > 0.105391 )
								if( VIP_VIM <= -0.479695 )
									ret := 0.777778 // buy
								if( VIP_VIM > -0.479695 )
									ret := 0.128571
						if( bullPower > 0.154224 )
							if( VIP_VIM <= 0.116762 )
								if( bullPower <= 0.373489 )
									ret := -0.518868
								if( bullPower > 0.373489 )
									ret := 0.222222
							if( VIP_VIM > 0.116762 )
								if( VIP_VIM <= 0.816847 )
									ret := -0.091803
								if( VIP_VIM > 0.816847 )
									ret := 0.333333
			if( bearPower > 0.068327 )
				if( VIM <= 1.06101 )
					if( bullPower <= 0.904852 )
						if( bbp <= 1.08326 )
							if( bearPower <= 0.13326 )
								if( bullPower <= 0.097221 )
									ret := -0.750000 // sell
								if( bullPower > 0.097221 )
									ret := -0.153846
							if( bearPower > 0.13326 )
								if( VIP_VIM <= 0.835777 )
									ret := 0.740741 // buy
								if( VIP_VIM > 0.835777 )
									ret := 0.198473
						if( bbp > 1.08326 )
							if( VIP_VIM <= 1.12718 )
								if( VIP_VIM <= 0.886825 )
									ret := -0.333333
								if( VIP_VIM > 0.886825 )
									ret := -1.000000 // sell
							if( VIP_VIM > 1.12718 )
								if( VIP <= 1.89935 )
									ret := 0.750000 // buy
								if( VIP > 1.89935 )
									ret := -0.250000
					if( bullPower > 0.904852 )
						if( VIP_VIM <= 0.865428 )
							ret := -0.285714
						if( VIP_VIM > 0.865428 )
							if( VIP <= 1.82626 )
								if( bbm <= 0.194029 )
									ret := 0.750000 // buy
								if( bbm > 0.194029 )
									ret := 1.000000 // buy
							if( VIP > 1.82626 )
								if( bearPower <= 1.96084 )
									ret := 0.400000
								if( bearPower > 1.96084 )
									ret := 0.750000 // buy
				if( VIM > 1.06101 )
					if( bbp <= 0.789525 )
						if( VIP_VIM <= 0.515924 )
							if( VIP <= 3.65926 )
								if( VIP <= 3.08974 )
									ret := -0.316038
								if( VIP > 3.08974 )
									ret := 0.101010
							if( VIP > 3.65926 )
								if( VIP <= 3.75966 )
									ret := -0.818182 // sell
								if( VIP > 3.75966 )
									ret := -0.542056
						if( VIP_VIM > 0.515924 )
							if( bbp <= 0.450124 )
								if( VIP <= 2.05249 )
									ret := -0.286765
								if( VIP > 2.05249 )
									ret := 0.111413
							if( bbp > 0.450124 )
								if( bearPower <= 0.091698 )
									ret := 0.600000
								if( bearPower > 0.091698 )
									ret := -0.292035
					if( bbp > 0.789525 )
						if( VIP <= 2.07965 )
							if( VIP_VIM <= 0.175312 )
								if( bbm <= 0.01065 )
									ret := -0.187500
								if( bbm > 0.01065 )
									ret := 0.529412
							if( VIP_VIM > 0.175312 )
								if( bbm <= 0.558467 )
									ret := -0.388235
								if( bbm > 0.558467 )
									ret := -0.900000 // sell
						if( VIP > 2.07965 )
							if( bearPower <= 0.237747 )
								if( VIP_VIM <= 0.865994 )
									ret := -0.400000
								if( VIP_VIM > 0.865994 )
									ret := 0.750000 // buy
							if( bearPower > 0.237747 )
								if( VIM <= 4.90651 )
									ret := -0.718615 // sell
								if( VIM > 4.90651 )
									ret := 0.000000
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_PINS_15Min_b29e8401(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


