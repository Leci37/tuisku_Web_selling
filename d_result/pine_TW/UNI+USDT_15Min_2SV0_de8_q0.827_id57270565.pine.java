//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: UNIUSDT_15Min_2SV0_57270565 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2SV0_57270565", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_57270565(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 51.9137 )
		if( k <= 19.9818 )
			if( rsi1 <= 38.0942 )
				if( VIP_VIM <= -0.204691 )
					if( VIP <= 0.843649 )
						if( VIM <= 1.29403 )
							if( VIP_VIM <= -0.586318 )
								if( smoothK_k <= 14.5786 )
									ret := -0.486667
								if( smoothK_k > 14.5786 )
									ret := 0.380952
							if( VIP_VIM > -0.586318 )
								if( d <= 11.5521 )
									ret := -0.247973
								if( d > 11.5521 )
									ret := -0.038769
						if( VIM > 1.29403 )
							if( k <= 4.06184 )
								if( VIP_VIM <= -0.916424 )
									ret := 0.837838 // buy
								if( VIP_VIM > -0.916424 )
									ret := 0.159772
							if( k > 4.06184 )
								if( VIP <= 0.655252 )
									ret := -0.288401
								if( VIP > 0.655252 )
									ret := -0.026786
					if( VIP > 0.843649 )
						if( d_k <= 0.826949 )
							if( VIM <= 1.17133 )
								if( smoothD_d <= 6.35616 )
									ret := -0.659068
								if( smoothD_d > 6.35616 )
									ret := -0.293515
							if( VIM > 1.17133 )
								if( d_k <= -8.67815 )
									ret := 0.666667
								if( d_k > -8.67815 )
									ret := -0.309524
						if( d_k > 0.826949 )
							if( d <= 1.47501 )
								if( d_k <= 1.08255 )
									ret := -0.272727
								if( d_k > 1.08255 )
									ret := -1.000000 // sell
							if( d > 1.47501 )
								if( rsi1 <= 27.1919 )
									ret := -0.676724
								if( rsi1 > 27.1919 )
									ret := 0.010025
				if( VIP_VIM > -0.204691 )
					if( d <= 3.1498 )
						if( d_k <= 1.38461 )
							if( VIP <= 0.881583 )
								if( d <= 0.694632 )
									ret := 0.705882 // buy
								if( d > 0.694632 )
									ret := -0.846154 // sell
							if( VIP > 0.881583 )
								if( smoothD_d <= -2.62253 )
									ret := -0.848881 // sell
								if( smoothD_d > -2.62253 )
									ret := -0.798851 // sell
						if( d_k > 1.38461 )
							if( d <= 1.46767 )
								ret := -0.083333
							if( d > 1.46767 )
								if( rsi1 <= 17.6713 )
									ret := -0.931034 // sell
								if( rsi1 > 17.6713 )
									ret := -0.666667
					if( d > 3.1498 )
						if( rsi1 <= 34.0733 )
							if( k <= 1.84238 )
								if( VIM <= 1.01407 )
									ret := -0.840764 // sell
								if( VIM > 1.01407 )
									ret := -0.697452
							if( k > 1.84238 )
								if( smoothK_k <= -0.924343 )
									ret := -0.440000
								if( smoothK_k > -0.924343 )
									ret := -0.721704 // sell
						if( rsi1 > 34.0733 )
							if( VIM <= 1.0169 )
								if( k <= 1.84892 )
									ret := -0.513761
								if( k > 1.84892 )
									ret := -0.662231
							if( VIM > 1.0169 )
								if( k <= 8.54628 )
									ret := -0.202673
								if( k > 8.54628 )
									ret := -0.500855
			if( rsi1 > 38.0942 )
				if( VIM <= 0.955098 )
					if( VIP_VIM <= 0.812884 )
						if( smoothK_k <= -2.64545 )
							if( VIP_VIM <= 0.681114 )
								if( d_k <= 0.227268 )
									ret := -0.745455 // sell
								if( d_k > 0.227268 )
									ret := -0.470667
							if( VIP_VIM > 0.681114 )
								if( smoothD_d <= -2.13396 )
									ret := 0.875000 // buy
								if( smoothD_d > -2.13396 )
									ret := -0.444444
						if( smoothK_k > -2.64545 )
							if( d <= 42.4938 )
								if( VIM <= 0.888233 )
									ret := -0.358716
								if( VIM > 0.888233 )
									ret := -0.270293
							if( d > 42.4938 )
								if( d <= 43.2253 )
									ret := 0.431818
								if( d > 43.2253 )
									ret := -0.255319
					if( VIP_VIM > 0.812884 )
						if( d <= 31.8131 )
							if( d_k <= 19.3082 )
								if( smoothD_d <= 3.00063 )
									ret := -1.000000 // sell
								if( smoothD_d > 3.00063 )
									ret := -0.906250 // sell
							if( d_k > 19.3082 )
								ret := -0.727273 // sell
						if( d > 31.8131 )
							ret := -0.666667
				if( VIM > 0.955098 )
					if( VIP <= 0.981907 )
						if( k <= 3.03093 )
							if( VIP_VIM <= -0.083053 )
								if( VIM <= 1.10227 )
									ret := 0.555215
								if( VIM > 1.10227 )
									ret := 0.042254
							if( VIP_VIM > -0.083053 )
								if( d_k <= 0.337992 )
									ret := 0.600000
								if( d_k > 0.337992 )
									ret := 0.059322
						if( k > 3.03093 )
							if( rsi1 <= 48.9597 )
								if( d <= 19.428 )
									ret := -0.091930
								if( d > 19.428 )
									ret := 0.217877
							if( rsi1 > 48.9597 )
								if( rsi1 <= 50.7401 )
									ret := 0.653333
								if( rsi1 > 50.7401 )
									ret := 0.196262
					if( VIP > 0.981907 )
						if( rsi1 <= 45.4427 )
							if( VIM <= 1.01308 )
								if( smoothK_k <= 2.52364 )
									ret := -0.344262
								if( smoothK_k > 2.52364 )
									ret := -0.578947
							if( VIM > 1.01308 )
								if( k <= 4.97337 )
									ret := 0.296000
								if( k > 4.97337 )
									ret := -0.278646
						if( rsi1 > 45.4427 )
							if( smoothD_d <= -2.65296 )
								if( rsi1 <= 51.2019 )
									ret := 0.409091
								if( rsi1 > 51.2019 )
									ret := 1.000000 // buy
							if( smoothD_d > -2.65296 )
								if( smoothK_k <= 14.0673 )
									ret := 0.014004
								if( smoothK_k > 14.0673 )
									ret := -0.179775
		if( k > 19.9818 )
			if( d_k <= 4.85863 )
				if( rsi1 <= 51.2351 )
					if( VIP <= 0.921578 )
						if( rsi1 <= 41.1138 )
							if( smoothD_d <= 15.8192 )
								if( VIP_VIM <= -0.561013 )
									ret := -0.533019
								if( VIP_VIM > -0.561013 )
									ret := -0.229310
							if( smoothD_d > 15.8192 )
								if( k <= 45.4077 )
									ret := 0.001012
								if( k > 45.4077 )
									ret := -0.175989
						if( rsi1 > 41.1138 )
							if( d <= 25.4085 )
								if( smoothK_k <= 35.9763 )
									ret := 0.170895
								if( smoothK_k > 35.9763 )
									ret := -0.348624
							if( d > 25.4085 )
								if( k <= 37.1442 )
									ret := 0.554878
								if( k > 37.1442 )
									ret := 0.320375
					if( VIP > 0.921578 )
						if( VIM <= 0.999166 )
							if( rsi1 <= 48.6233 )
								if( smoothD_d <= 11.2251 )
									ret := -0.098361
								if( smoothD_d > 11.2251 )
									ret := -0.604096
							if( rsi1 > 48.6233 )
								if( VIP <= 0.991478 )
									ret := 0.296296
								if( VIP > 0.991478 )
									ret := -0.302966
						if( VIM > 0.999166 )
							if( rsi1 <= 43.368 )
								if( rsi1 <= 38.8805 )
									ret := -0.636559
								if( rsi1 > 38.8805 )
									ret := -0.312950
							if( rsi1 > 43.368 )
								if( d_k <= 1.37658 )
									ret := -0.132293
								if( d_k > 1.37658 )
									ret := 0.231317
				if( rsi1 > 51.2351 )
					if( VIP <= 1.05881 )
						if( d_k <= -13.4265 )
							if( VIM <= 0.989393 )
								if( VIM <= 0.92313 )
									ret := 0.391304
								if( VIM > 0.92313 )
									ret := -0.262295
							if( VIM > 0.989393 )
								if( smoothD_d <= 12.8364 )
									ret := -0.351351
								if( smoothD_d > 12.8364 )
									ret := 0.235294
						if( d_k > -13.4265 )
							if( VIM <= 1.00036 )
								if( VIP <= 0.9193 )
									ret := 0.944444 // buy
								if( VIP > 0.9193 )
									ret := 0.264567
							if( VIM > 1.00036 )
								if( rsi1 <= 61.9903 )
									ret := 0.470160
								if( rsi1 > 61.9903 )
									ret := 0.930233 // buy
					if( VIP > 1.05881 )
						if( rsi1 <= 61.633 )
							if( d <= 37.7826 )
								if( VIP_VIM <= 0.140037 )
									ret := 0.092251
								if( VIP_VIM > 0.140037 )
									ret := -0.134511
							if( d > 37.7826 )
								if( VIM <= 0.888332 )
									ret := -0.696356
								if( VIM > 0.888332 )
									ret := 0.031250
						if( rsi1 > 61.633 )
							if( d_k <= -15.4017 )
								if( rsi1 <= 65.0085 )
									ret := 0.117647
								if( rsi1 > 65.0085 )
									ret := 0.624161
							if( d_k > -15.4017 )
								if( d_k <= -4.78396 )
									ret := 0.016484
								if( d_k > -4.78396 )
									ret := 0.311765
			if( d_k > 4.85863 )
				if( rsi1 <= 57.9052 )
					if( VIM <= 0.950478 )
						if( VIM <= 0.798512 )
							if( d_k <= 25.8329 )
								if( VIP <= 1.21998 )
									ret := -0.766871 // sell
								if( VIP > 1.21998 )
									ret := -0.535000
							if( d_k > 25.8329 )
								if( d <= 52.4851 )
									ret := -0.583333
								if( d > 52.4851 )
									ret := -0.050000
						if( VIM > 0.798512 )
							if( rsi1 <= 48.5701 )
								if( smoothK_k <= 29.5727 )
									ret := -0.648760
								if( smoothK_k > 29.5727 )
									ret := -0.463035
							if( rsi1 > 48.5701 )
								if( d_k <= 13.7346 )
									ret := -0.031509
								if( d_k > 13.7346 )
									ret := -0.253205
					if( VIM > 0.950478 )
						if( VIM <= 1.10188 )
							if( d_k <= 29.3187 )
								if( smoothK_k <= 25.4722 )
									ret := -0.093002
								if( smoothK_k > 25.4722 )
									ret := -0.212001
							if( d_k > 29.3187 )
								if( smoothK_k <= 24.3912 )
									ret := -0.333333
								if( smoothK_k > 24.3912 )
									ret := 0.611940
						if( VIM > 1.10188 )
							if( rsi1 <= 31.302 )
								if( d <= 67.5093 )
									ret := -0.229097
								if( d > 67.5093 )
									ret := 0.636364
							if( rsi1 > 31.302 )
								if( smoothD_d <= 37.6559 )
									ret := -0.054299
								if( smoothD_d > 37.6559 )
									ret := 0.231343
				if( rsi1 > 57.9052 )
					if( VIM <= 0.751321 )
						if( rsi1 <= 66.9444 )
							if( VIP_VIM <= 0.459762 )
								ret := 0.153846
							if( VIP_VIM > 0.459762 )
								if( d <= 69.5674 )
									ret := -0.542857
								if( d > 69.5674 )
									ret := 0.416667
						if( rsi1 > 66.9444 )
							if( VIM <= 0.629779 )
								if( d <= 54.4826 )
									ret := -0.409091
								if( d > 54.4826 )
									ret := 0.013889
							if( VIM > 0.629779 )
								if( smoothK_k <= 20.9604 )
									ret := -0.119048
								if( smoothK_k > 20.9604 )
									ret := 0.392857
					if( VIM > 0.751321 )
						if( smoothK_k <= 40.8286 )
							if( d_k <= 24.2934 )
								if( rsi1 <= 75.3399 )
									ret := 0.322280
								if( rsi1 > 75.3399 )
									ret := -0.750000 // sell
							if( d_k > 24.2934 )
								if( d <= 62.2283 )
									ret := -0.576923
								if( d > 62.2283 )
									ret := 0.307692
						if( smoothK_k > 40.8286 )
							if( rsi1 <= 67.8281 )
								if( VIM <= 0.871469 )
									ret := -0.319066
								if( VIM > 0.871469 )
									ret := 0.048276
							if( rsi1 > 67.8281 )
								if( rsi1 <= 70.6238 )
									ret := 0.403846
								if( rsi1 > 70.6238 )
									ret := 0.821429 // buy
	if( k > 51.9137 )
		if( k <= 84.853 )
			if( VIM <= 1.05443 )
				if( smoothD_d <= 77.7045 )
					if( d_k <= -4.86422 )
						if( rsi1 <= 57.4723 )
							if( d <= 47.5714 )
								if( VIP <= 1.00008 )
									ret := 0.007752
								if( VIP > 1.00008 )
									ret := -0.492114
							if( d > 47.5714 )
								if( VIP <= 0.990783 )
									ret := 0.120930
								if( VIP > 0.990783 )
									ret := -0.166861
						if( rsi1 > 57.4723 )
							if( rsi1 <= 66.7784 )
								if( VIP_VIM <= 0.114688 )
									ret := 0.462366
								if( VIP_VIM > 0.114688 )
									ret := -0.063538
							if( rsi1 > 66.7784 )
								if( VIP <= 1.16846 )
									ret := 0.542112
								if( VIP > 1.16846 )
									ret := 0.169708
					if( d_k > -4.86422 )
						if( rsi1 <= 59.1625 )
							if( rsi1 <= 51.996 )
								if( d_k <= 17.2934 )
									ret := -0.328953
								if( d_k > 17.2934 )
									ret := 0.257576
							if( rsi1 > 51.996 )
								if( VIP <= 1.02677 )
									ret := 0.303082
								if( VIP > 1.02677 )
									ret := -0.201904
						if( rsi1 > 59.1625 )
							if( VIP_VIM <= 0.222572 )
								if( smoothK_k <= 74.8882 )
									ret := 0.432494
								if( smoothK_k > 74.8882 )
									ret := 0.035714
							if( VIP_VIM > 0.222572 )
								if( rsi1 <= 65.7092 )
									ret := -0.181607
								if( rsi1 > 65.7092 )
									ret := 0.165670
				if( smoothD_d > 77.7045 )
					if( rsi1 <= 58.8102 )
						if( VIP_VIM <= -0.045096 )
							if( VIM <= 1.01351 )
								if( smoothK_k <= 72.949 )
									ret := 0.259259
								if( smoothK_k > 72.949 )
									ret := 0.781250 // buy
							if( VIM > 1.01351 )
								if( d_k <= 2.70447 )
									ret := -0.145833
								if( d_k > 2.70447 )
									ret := 0.363344
						if( VIP_VIM > -0.045096 )
							if( VIP <= 1.07095 )
								if( VIP <= 0.984477 )
									ret := 0.305882
								if( VIP > 0.984477 )
									ret := 0.026860
							if( VIP > 1.07095 )
								if( VIM <= 0.959407 )
									ret := -0.095915
								if( VIM > 0.959407 )
									ret := -0.387931
					if( rsi1 > 58.8102 )
						if( k <= 72.163 )
							if( smoothD_d <= 80.051 )
								if( VIP <= 1.15748 )
									ret := 0.826087 // buy
								if( VIP > 1.15748 )
									ret := 0.593548
							if( smoothD_d > 80.051 )
								if( smoothD_d <= 81.6411 )
									ret := 0.210526
								if( smoothD_d > 81.6411 )
									ret := 0.644737
						if( k > 72.163 )
							if( VIP <= 1.08837 )
								if( d <= 83.6508 )
									ret := 0.373494
								if( d > 83.6508 )
									ret := 0.684964
							if( VIP > 1.08837 )
								if( rsi1 <= 70.0158 )
									ret := 0.106137
								if( rsi1 > 70.0158 )
									ret := 0.322351
			if( VIM > 1.05443 )
				if( d_k <= 19.4829 )
					if( d_k <= 4.1457 )
						if( d <= 37.5943 )
							if( k <= 55.0163 )
								if( rsi1 <= 47.0972 )
									ret := -0.190476
								if( rsi1 > 47.0972 )
									ret := 0.550000
							if( k > 55.0163 )
								if( VIM <= 1.21099 )
									ret := -0.212435
								if( VIM > 1.21099 )
									ret := -0.660377
						if( d > 37.5943 )
							if( rsi1 <= 46.7221 )
								if( VIP_VIM <= -0.321711 )
									ret := 0.293613
								if( VIP_VIM > -0.321711 )
									ret := -0.068779
							if( rsi1 > 46.7221 )
								if( VIM <= 1.09863 )
									ret := 0.448372
								if( VIM > 1.09863 )
									ret := 0.567344
					if( d_k > 4.1457 )
						if( rsi1 <= 40.974 )
							if( VIP_VIM <= -0.219389 )
								if( VIM <= 1.13902 )
									ret := 0.212560
								if( VIM > 1.13902 )
									ret := -0.178926
							if( VIP_VIM > -0.219389 )
								if( rsi1 <= 36.5753 )
									ret := -0.677966
								if( rsi1 > 36.5753 )
									ret := -0.203125
						if( rsi1 > 40.974 )
							if( rsi1 <= 47.0143 )
								if( smoothK_k <= 67.9189 )
									ret := 0.390947
								if( smoothK_k > 67.9189 )
									ret := -0.064356
							if( rsi1 > 47.0143 )
								if( smoothD_d <= 66.3004 )
									ret := -0.151515
								if( smoothD_d > 66.3004 )
									ret := 0.560784
				if( d_k > 19.4829 )
					if( k <= 54.2717 )
						ret := 0.200000
					if( k > 54.2717 )
						if( smoothK_k <= 56.1113 )
							if( smoothD_d <= 75.8556 )
								ret := -0.833333 // sell
							if( smoothD_d > 75.8556 )
								ret := -0.222222
						if( smoothK_k > 56.1113 )
							if( d_k <= 20.1134 )
								ret := -1.000000 // sell
							if( d_k > 20.1134 )
								ret := -0.857143 // sell
		if( k > 84.853 )
			if( rsi1 <= 66.0761 )
				if( VIP_VIM <= -0.057084 )
					if( smoothK_k <= 89.8867 )
						if( d <= 58.7308 )
							if( d_k <= -30.3788 )
								ret := -0.833333 // sell
							if( d_k > -30.3788 )
								ret := -0.416667
						if( d > 58.7308 )
							if( rsi1 <= 51.8406 )
								if( VIP_VIM <= -0.392109 )
									ret := 0.434188
								if( VIP_VIM > -0.392109 )
									ret := -0.021277
							if( rsi1 > 51.8406 )
								if( smoothK_k <= 86.6525 )
									ret := 0.467033
								if( smoothK_k > 86.6525 )
									ret := 0.657051
					if( smoothK_k > 89.8867 )
						if( VIM <= 1.06321 )
							if( rsi1 <= 54.2673 )
								if( VIP_VIM <= -0.140636 )
									ret := 0.600000
								if( VIP_VIM > -0.140636 )
									ret := -0.112179
							if( rsi1 > 54.2673 )
								if( VIP <= 0.844297 )
									ret := 0.933333 // buy
								if( VIP > 0.844297 )
									ret := 0.515971
						if( VIM > 1.06321 )
							if( d <= 99.367 )
								if( VIP <= 0.915696 )
									ret := 0.489818
								if( VIP > 0.915696 )
									ret := 0.354722
							if( d > 99.367 )
								if( smoothK_k <= 96.406 )
									ret := 0.363636
								if( smoothK_k > 96.406 )
									ret := 0.702929 // buy
				if( VIP_VIM > -0.057084 )
					if( rsi1 <= 58.5836 )
						if( d <= 96.7332 )
							if( VIM <= 0.990961 )
								if( smoothD_d <= 84.7936 )
									ret := -0.036624
								if( smoothD_d > 84.7936 )
									ret := -0.217883
							if( VIM > 0.990961 )
								if( k <= 88.0573 )
									ret := -0.269360
								if( k > 88.0573 )
									ret := 0.060606
						if( d > 96.7332 )
							if( VIM <= 0.962278 )
								if( k <= 97.033 )
									ret := 0.306667
								if( k > 97.033 )
									ret := -0.447761
							if( VIM > 0.962278 )
								if( VIP_VIM <= -0.048487 )
									ret := -0.454545
								if( VIP_VIM > -0.048487 )
									ret := 0.350649
					if( rsi1 > 58.5836 )
						if( VIP <= 1.06127 )
							if( smoothK_k <= 91.3862 )
								if( VIP <= 1.04898 )
									ret := 0.590210
								if( VIP > 1.04898 )
									ret := 0.312139
							if( smoothK_k > 91.3862 )
								if( VIM <= 0.953986 )
									ret := -0.107383
								if( VIM > 0.953986 )
									ret := 0.387446
						if( VIP > 1.06127 )
							if( smoothD_d <= 74.8363 )
								if( d <= 72.8776 )
									ret := 0.040000
								if( d > 72.8776 )
									ret := -0.464912
							if( smoothD_d > 74.8363 )
								if( VIP_VIM <= 0.123861 )
									ret := 0.306306
								if( VIP_VIM > 0.123861 )
									ret := -0.001328
			if( rsi1 > 66.0761 )
				if( VIM <= 0.869597 )
					if( VIP <= 1.15541 )
						if( rsi1 <= 73.1438 )
							if( smoothK_k <= 92.7141 )
								if( smoothD_d <= 87.8571 )
									ret := 0.124088
								if( smoothD_d > 87.8571 )
									ret := 0.599010
							if( smoothK_k > 92.7141 )
								if( smoothK_k <= 94.3764 )
									ret := -0.447059
								if( smoothK_k > 94.3764 )
									ret := -0.005682
						if( rsi1 > 73.1438 )
							if( d <= 66.6227 )
								ret := -0.500000
							if( d > 66.6227 )
								if( VIM <= 0.765121 )
									ret := 0.573913
								if( VIM > 0.765121 )
									ret := 0.811667 // buy
					if( VIP > 1.15541 )
						if( rsi1 <= 79.2011 )
							if( k <= 96.2561 )
								if( d_k <= -0.49281 )
									ret := 0.007772
								if( d_k > -0.49281 )
									ret := 0.263016
							if( k > 96.2561 )
								if( d_k <= -0.421398 )
									ret := -0.022500
								if( d_k > -0.421398 )
									ret := -0.247563
						if( rsi1 > 79.2011 )
							if( VIP_VIM <= 0.562674 )
								if( VIM <= 0.775752 )
									ret := 0.507979
								if( VIM > 0.775752 )
									ret := 0.836331 // buy
							if( VIP_VIM > 0.562674 )
								if( rsi1 <= 94.9053 )
									ret := 0.089195
								if( rsi1 > 94.9053 )
									ret := 0.604651
				if( VIM > 0.869597 )
					if( VIP <= 1.11291 )
						if( smoothD_d <= 95.8858 )
							if( rsi1 <= 73.6589 )
								if( VIM <= 1.21304 )
									ret := 0.717628 // buy
								if( VIM > 1.21304 )
									ret := 0.310345
							if( rsi1 > 73.6589 )
								if( smoothK_k <= 95.2367 )
									ret := 0.784131 // buy
								if( smoothK_k > 95.2367 )
									ret := 0.875569 // buy
						if( smoothD_d > 95.8858 )
							if( rsi1 <= 70.3837 )
								if( VIP_VIM <= -0.168352 )
									ret := 0.869048 // buy
								if( VIP_VIM > -0.168352 )
									ret := 0.595238
							if( rsi1 > 70.3837 )
								if( VIP_VIM <= 0.00715 )
									ret := 0.848837 // buy
								if( VIP_VIM > 0.00715 )
									ret := 0.927308 // buy
					if( VIP > 1.11291 )
						if( rsi1 <= 74.0759 )
							if( VIM <= 0.926174 )
								if( k <= 97.6663 )
									ret := 0.439276
								if( k > 97.6663 )
									ret := 0.213592
							if( VIM > 0.926174 )
								if( d_k <= -5.65343 )
									ret := -0.442308
								if( d_k > -5.65343 )
									ret := 0.206522
						if( rsi1 > 74.0759 )
							if( rsi1 <= 79.79 )
								if( d_k <= 1.95981 )
									ret := 0.544218
								if( d_k > 1.95981 )
									ret := 0.907692 // buy
							if( rsi1 > 79.79 )
								if( VIP_VIM <= 0.289542 )
									ret := 0.886598 // buy
								if( VIP_VIM > 0.289542 )
									ret := 0.740000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_UNIUSDT_15Min_57270565(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


