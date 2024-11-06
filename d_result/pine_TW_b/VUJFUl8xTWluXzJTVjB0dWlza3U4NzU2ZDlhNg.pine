//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: UBER_1Min_2SV0_8756d9a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2SV0_8756d9a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_8756d9a6(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 52.3769 )
		if( VIP <= 1.13371 )
			if( VIM <= 1.18934 )
				if( smoothD_d <= 10.8201 )
					if( rsi1 <= 13.1768 )
						ret := 1.000000 // buy
					if( rsi1 > 13.1768 )
						if( d_k <= -14.6721 )
							if( k <= 29.7516 )
								if( smoothD_d <= 9.93121 )
									ret := -0.771429 // sell
								if( smoothD_d > 9.93121 )
									ret := -0.363636
							if( k > 29.7516 )
								if( d_k <= -18.8291 )
									ret := -0.600000
								if( d_k > -18.8291 )
									ret := 1.000000 // buy
						if( d_k > -14.6721 )
							if( d_k <= -6.81531 )
								if( VIM <= 1.16976 )
									ret := 0.212264
								if( VIM > 1.16976 )
									ret := -0.245614
							if( d_k > -6.81531 )
								if( smoothD_d <= 9.29792 )
									ret := -0.027377
								if( smoothD_d > 9.29792 )
									ret := -0.255556
				if( smoothD_d > 10.8201 )
					if( smoothK_k <= 32.8448 )
						if( d_k <= -4.03952 )
							if( d <= 16.2991 )
								if( VIP_VIM <= -0.264392 )
									ret := 0.280488
								if( VIP_VIM > -0.264392 )
									ret := -0.174699
							if( d > 16.2991 )
								if( smoothK_k <= 24.2135 )
									ret := 0.370213
								if( smoothK_k > 24.2135 )
									ret := 0.172638
						if( d_k > -4.03952 )
							if( VIP <= 0.813106 )
								if( k <= 25.2535 )
									ret := 0.395238
								if( k > 25.2535 )
									ret := -0.202899
							if( VIP > 0.813106 )
								if( VIM <= 1.08847 )
									ret := 0.100559
								if( VIM > 1.08847 )
									ret := -0.004184
					if( smoothK_k > 32.8448 )
						if( VIM <= 0.972666 )
							if( d_k <= 22.1414 )
								if( VIP <= 0.952424 )
									ret := 0.574074
								if( VIP > 0.952424 )
									ret := 0.136519
							if( d_k > 22.1414 )
								if( d_k <= 24.599 )
									ret := -0.615385
								if( d_k > 24.599 )
									ret := 0.000000
						if( VIM > 0.972666 )
							if( d <= 89.9622 )
								if( d <= 87.5795 )
									ret := -0.004467
								if( d > 87.5795 )
									ret := 0.255952
							if( d > 89.9622 )
								if( VIP <= 0.99868 )
									ret := -0.221725
								if( VIP > 0.99868 )
									ret := 0.141643
			if( VIM > 1.18934 )
				if( VIP <= 0.89357 )
					if( d_k <= 12.8701 )
						if( rsi1 <= 5.70297 )
							if( d_k <= -0.260679 )
								if( d <= 1.54391 )
									ret := 0.538462
								if( d > 1.54391 )
									ret := -0.117647
							if( d_k > -0.260679 )
								if( rsi1 <= 2.94623 )
									ret := -0.037037
								if( rsi1 > 2.94623 )
									ret := -0.604938
						if( rsi1 > 5.70297 )
							if( VIP_VIM <= -1.01568 )
								if( d_k <= 4.84721 )
									ret := 0.420382
								if( d_k > 4.84721 )
									ret := -1.000000 // sell
							if( VIP_VIM > -1.01568 )
								if( rsi1 <= 15.0247 )
									ret := -0.040788
								if( rsi1 > 15.0247 )
									ret := 0.084818
					if( d_k > 12.8701 )
						if( VIM <= 1.35472 )
							if( smoothD_d <= 78.0069 )
								if( smoothD_d <= 56.9845 )
									ret := -0.045929
								if( smoothD_d > 56.9845 )
									ret := 0.356322
							if( smoothD_d > 78.0069 )
								if( d <= 81.7051 )
									ret := -1.000000 // sell
								if( d > 81.7051 )
									ret := -0.600000
						if( VIM > 1.35472 )
							if( d <= 29.5909 )
								if( VIM <= 1.72312 )
									ret := -0.795455 // sell
								if( VIM > 1.72312 )
									ret := -0.250000
							if( d > 29.5909 )
								if( rsi1 <= 28.1832 )
									ret := 0.410256
								if( rsi1 > 28.1832 )
									ret := -0.545455
				if( VIP > 0.89357 )
					if( rsi1 <= 17.5926 )
						if( VIP_VIM <= -1.00929 )
							ret := 0.666667
						if( VIP_VIM > -1.00929 )
							if( VIM <= 1.54669 )
								ret := 0.750000 // buy
							if( VIM > 1.54669 )
								if( smoothD_d <= -0.357088 )
									ret := -0.200000
								if( smoothD_d > -0.357088 )
									ret := -0.916667 // sell
					if( rsi1 > 17.5926 )
						if( k <= 17.9252 )
							if( rsi1 <= 29.2096 )
								if( VIP <= 1.1067 )
									ret := 0.038168
								if( VIP > 1.1067 )
									ret := 0.692308
							if( rsi1 > 29.2096 )
								if( VIM <= 1.19915 )
									ret := -0.057143
								if( VIM > 1.19915 )
									ret := 0.498795
						if( k > 17.9252 )
							if( VIP_VIM <= -0.100187 )
								if( smoothK_k <= 18.0293 )
									ret := -0.282051
								if( smoothK_k > 18.0293 )
									ret := 0.195596
							if( VIP_VIM > -0.100187 )
								if( smoothD_d <= 37.5964 )
									ret := -1.000000 // sell
								if( smoothD_d > 37.5964 )
									ret := -0.400000
		if( VIP > 1.13371 )
			if( d_k <= -5.71304 )
				if( rsi1 <= 36.933 )
					if( d <= 17.8299 )
						if( d_k <= -10.186 )
							if( VIP_VIM <= -0.816794 )
								ret := 0.750000 // buy
							if( VIP_VIM > -0.816794 )
								if( rsi1 <= 33.8706 )
									ret := -0.923077 // sell
								if( rsi1 > 33.8706 )
									ret := -0.250000
						if( d_k > -10.186 )
							if( VIP_VIM <= -1.2031 )
								if( d_k <= -7.13259 )
									ret := -1.000000 // sell
								if( d_k > -7.13259 )
									ret := -0.500000
							if( VIP_VIM > -1.2031 )
								if( VIM <= 2.00082 )
									ret := 0.000000
								if( VIM > 2.00082 )
									ret := 0.476190
					if( d > 17.8299 )
						if( smoothD_d <= 32.0753 )
							if( VIP_VIM <= 0.020689 )
								if( VIP_VIM <= -1.72025 )
									ret := 0.250000
								if( VIP_VIM > -1.72025 )
									ret := 0.819149 // buy
							if( VIP_VIM > 0.020689 )
								ret := -0.166667
						if( smoothD_d > 32.0753 )
							if( VIP_VIM <= -1.01254 )
								if( d_k <= -14.5246 )
									ret := -0.800000 // sell
								if( d_k > -14.5246 )
									ret := -0.200000
							if( VIP_VIM > -1.01254 )
								if( rsi1 <= 34.3992 )
									ret := 0.714286 // buy
								if( rsi1 > 34.3992 )
									ret := -0.111111
				if( rsi1 > 36.933 )
					if( d <= 36.6734 )
						if( smoothK_k <= 42.1105 )
							if( VIP <= 7.52815 )
								if( k <= 44.025 )
									ret := -0.140351
								if( k > 44.025 )
									ret := 0.823529 // buy
							if( VIP > 7.52815 )
								if( VIM <= 23.7755 )
									ret := 0.460674
								if( VIM > 23.7755 )
									ret := -0.265306
						if( smoothK_k > 42.1105 )
							if( VIP_VIM <= -0.648291 )
								if( VIP <= 13.3646 )
									ret := 0.400000
								if( VIP > 13.3646 )
									ret := -0.400000
							if( VIP_VIM > -0.648291 )
								if( rsi1 <= 40.0679 )
									ret := 0.000000
								if( rsi1 > 40.0679 )
									ret := -0.632184
					if( d > 36.6734 )
						if( VIP_VIM <= -1.67979 )
							if( d_k <= -13.456 )
								if( rsi1 <= 48.8809 )
									ret := -0.909091 // sell
								if( rsi1 > 48.8809 )
									ret := -0.500000
							if( d_k > -13.456 )
								if( VIP_VIM <= -1.75043 )
									ret := -0.142857
								if( VIP_VIM > -1.75043 )
									ret := -1.000000 // sell
						if( VIP_VIM > -1.67979 )
							if( VIM <= 7.43296 )
								if( VIP <= 2.42138 )
									ret := 0.157895
								if( VIP > 2.42138 )
									ret := -0.131274
							if( VIM > 7.43296 )
								if( rsi1 <= 49.9745 )
									ret := 0.571429
								if( rsi1 > 49.9745 )
									ret := 0.000000
			if( d_k > -5.71304 )
				if( rsi1 <= 49.2457 )
					if( rsi1 <= 31.9438 )
						if( VIM <= 9.57671 )
							if( VIM <= 1.37113 )
								if( rsi1 <= 31.0979 )
									ret := 1.000000 // buy
								if( rsi1 > 31.0979 )
									ret := 0.750000 // buy
							if( VIM > 1.37113 )
								if( d <= 19.707 )
									ret := 0.237410
								if( d > 19.707 )
									ret := 0.471810
						if( VIM > 9.57671 )
							if( rsi1 <= 15.9309 )
								if( VIP_VIM <= -1.07538 )
									ret := -0.266667
								if( VIP_VIM > -1.07538 )
									ret := 0.857143 // buy
							if( rsi1 > 15.9309 )
								if( smoothD_d <= 62.8592 )
									ret := 0.751131 // buy
								if( smoothD_d > 62.8592 )
									ret := -0.250000
					if( rsi1 > 31.9438 )
						if( VIP_VIM <= -0.439874 )
							if( smoothD_d <= 8.59686 )
								if( d_k <= -3.08257 )
									ret := 0.128205
								if( d_k > -3.08257 )
									ret := 0.536842
							if( smoothD_d > 8.59686 )
								if( VIM <= 5.64464 )
									ret := 0.030471
								if( VIM > 5.64464 )
									ret := 0.266033
						if( VIP_VIM > -0.439874 )
							if( d <= 40.0013 )
								if( k <= 17.7756 )
									ret := 0.347518
								if( k > 17.7756 )
									ret := 0.130000
							if( d > 40.0013 )
								if( VIM <= 76.2375 )
									ret := 0.416564
								if( VIM > 76.2375 )
									ret := -0.258065
				if( rsi1 > 49.2457 )
					if( smoothD_d <= 87.5327 )
						if( smoothD_d <= 4.24002 )
							if( smoothD_d <= 2.57806 )
								if( smoothD_d <= -1.42218 )
									ret := -0.666667
								if( smoothD_d > -1.42218 )
									ret := 0.090909
							if( smoothD_d > 2.57806 )
								if( smoothK_k <= 3.93824 )
									ret := -0.928571 // sell
								if( smoothK_k > 3.93824 )
									ret := 0.000000
						if( smoothD_d > 4.24002 )
							if( smoothK_k <= 80.7319 )
								if( d <= 9.06003 )
									ret := 0.750000 // buy
								if( d > 9.06003 )
									ret := 0.156098
							if( smoothK_k > 80.7319 )
								if( rsi1 <= 49.7136 )
									ret := -1.000000 // sell
								if( rsi1 > 49.7136 )
									ret := -0.083333
					if( smoothD_d > 87.5327 )
						if( k <= 98.8216 )
							if( VIP_VIM <= -0.525939 )
								if( d <= 97.2787 )
									ret := -0.333333
								if( d > 97.2787 )
									ret := 0.500000
							if( VIP_VIM > -0.525939 )
								if( smoothD_d <= 92.5856 )
									ret := 0.596491
								if( smoothD_d > 92.5856 )
									ret := 0.944444 // buy
						if( k > 98.8216 )
							if( VIP <= 1.55237 )
								ret := -1.000000 // sell
							if( VIP > 1.55237 )
								if( d_k <= -0.910496 )
									ret := -0.500000
								if( d_k > -0.910496 )
									ret := 0.000000
	if( rsi1 > 52.3769 )
		if( VIM <= 1.23788 )
			if( rsi1 <= 84.146 )
				if( d <= 99.9052 )
					if( rsi1 <= 60.8439 )
						if( d_k <= 14.3143 )
							if( VIM <= 1.01225 )
								if( d_k <= 2.61988 )
									ret := 0.086026
								if( d_k > 2.61988 )
									ret := 0.000000
							if( VIM > 1.01225 )
								if( rsi1 <= 54.1284 )
									ret := 0.074597
								if( rsi1 > 54.1284 )
									ret := -0.119177
						if( d_k > 14.3143 )
							if( VIP <= 1.2549 )
								if( k <= 64.601 )
									ret := 0.087137
								if( k > 64.601 )
									ret := 0.575342
							if( VIP > 1.2549 )
								if( smoothD_d <= 65.91 )
									ret := 0.391304
								if( smoothD_d > 65.91 )
									ret := 0.903226 // buy
					if( rsi1 > 60.8439 )
						if( k <= 6.05627 )
							if( VIP_VIM <= 0.367276 )
								if( d_k <= 27.3545 )
									ret := -0.564356
								if( d_k > 27.3545 )
									ret := 0.666667
							if( VIP_VIM > 0.367276 )
								if( VIM <= 0.812261 )
									ret := 0.234043
								if( VIM > 0.812261 )
									ret := -0.333333
						if( k > 6.05627 )
							if( d_k <= -20.4919 )
								if( VIM <= 0.751857 )
									ret := 0.253012
								if( VIM > 0.751857 )
									ret := -0.172241
							if( d_k > -20.4919 )
								if( d_k <= -12.8002 )
									ret := 0.145161
								if( d_k > -12.8002 )
									ret := -0.002369
				if( d > 99.9052 )
					if( rsi1 <= 80.8055 )
						if( rsi1 <= 60.15 )
							if( d <= 99.9911 )
								ret := -1.000000 // sell
							if( d > 99.9911 )
								if( VIP_VIM <= 0.226891 )
									ret := -0.292683
								if( VIP_VIM > 0.226891 )
									ret := 0.600000
						if( rsi1 > 60.15 )
							if( VIP_VIM <= 0.448921 )
								if( VIM <= 0.786448 )
									ret := 0.857143 // buy
								if( VIM > 0.786448 )
									ret := 0.312057
							if( VIP_VIM > 0.448921 )
								if( d_k <= -0.067741 )
									ret := 0.750000 // buy
								if( d_k > -0.067741 )
									ret := -0.089109
					if( rsi1 > 80.8055 )
						if( rsi1 <= 82.9767 )
							if( VIM <= 0.657631 )
								if( d <= 99.9864 )
									ret := 0.750000 // buy
								if( d > 99.9864 )
									ret := 0.000000
							if( VIM > 0.657631 )
								if( VIP <= 1.28481 )
									ret := 0.687500
								if( VIP > 1.28481 )
									ret := 0.953488 // buy
						if( rsi1 > 82.9767 )
							if( VIP <= 1.34997 )
								ret := -0.500000
							if( VIP > 1.34997 )
								ret := 0.000000
			if( rsi1 > 84.146 )
				if( VIP_VIM <= 0.996268 )
					if( smoothK_k <= 96.999 )
						if( d <= 78.6364 )
							if( VIP <= 1.37684 )
								if( VIM <= 0.694511 )
									ret := 0.645161
								if( VIM > 0.694511 )
									ret := -0.066667
							if( VIP > 1.37684 )
								if( smoothD_d <= 65.9741 )
									ret := -0.708333 // sell
								if( smoothD_d > 65.9741 )
									ret := 0.368421
						if( d > 78.6364 )
							if( smoothD_d <= 95.3101 )
								if( d_k <= -11.3446 )
									ret := 0.666667
								if( d_k > -11.3446 )
									ret := -0.418014
							if( smoothD_d > 95.3101 )
								if( k <= 99.4246 )
									ret := 0.166667
								if( k > 99.4246 )
									ret := -0.475728
					if( smoothK_k > 96.999 )
						if( VIP <= 1.25052 )
							if( VIM <= 0.6027 )
								ret := 1.000000 // buy
							if( VIM > 0.6027 )
								if( d <= 95.5215 )
									ret := 0.750000 // buy
								if( d > 95.5215 )
									ret := 0.500000
						if( VIP > 1.25052 )
							if( VIM <= 0.682868 )
								if( d <= 96.1634 )
									ret := 0.333333
								if( d > 96.1634 )
									ret := -0.053191
							if( VIM > 0.682868 )
								if( d <= 99.2053 )
									ret := -0.529412
								if( d > 99.2053 )
									ret := -0.071429
				if( VIP_VIM > 0.996268 )
					if( d <= 99.5358 )
						if( smoothK_k <= 93.9217 )
							if( d_k <= 1.01643 )
								if( d_k <= -21.3955 )
									ret := -0.600000
								if( d_k > -21.3955 )
									ret := 0.680851
							if( d_k > 1.01643 )
								if( k <= 80.7671 )
									ret := 0.714286 // buy
								if( k > 80.7671 )
									ret := -0.230769
						if( smoothK_k > 93.9217 )
							if( smoothD_d <= 88.1736 )
								ret := -1.000000 // sell
							if( smoothD_d > 88.1736 )
								if( VIP <= 1.54771 )
									ret := -0.480000
								if( VIP > 1.54771 )
									ret := 0.230769
					if( d > 99.5358 )
						if( VIM <= 0.50912 )
							if( smoothK_k <= 96.9204 )
								if( VIP <= 1.58174 )
									ret := -1.000000 // sell
								if( VIP > 1.58174 )
									ret := 0.000000
							if( smoothK_k > 96.9204 )
								if( rsi1 <= 94.7638 )
									ret := -0.142857
								if( rsi1 > 94.7638 )
									ret := 0.777778 // buy
						if( VIM > 0.50912 )
							ret := 1.000000 // buy
		if( VIM > 1.23788 )
			if( VIP <= 1.52849 )
				if( d_k <= 11.1787 )
					if( smoothD_d <= 1.2231 )
						ret := 0.800000 // buy
					if( smoothD_d > 1.2231 )
						if( smoothD_d <= 21.0683 )
							if( VIM <= 1.49694 )
								if( d <= 11.7047 )
									ret := -0.923077 // sell
								if( d > 11.7047 )
									ret := -0.448276
							if( VIM > 1.49694 )
								if( rsi1 <= 54.3872 )
									ret := -0.750000 // sell
								if( rsi1 > 54.3872 )
									ret := -1.000000 // sell
						if( smoothD_d > 21.0683 )
							if( d <= 33.6724 )
								if( VIM <= 1.30299 )
									ret := -0.235294
								if( VIM > 1.30299 )
									ret := 0.692308
							if( d > 33.6724 )
								if( k <= 77.7909 )
									ret := -0.497561
								if( k > 77.7909 )
									ret := -0.247126
				if( d_k > 11.1787 )
					if( smoothD_d <= 75.5501 )
						if( rsi1 <= 54.8303 )
							if( d_k <= 12.4959 )
								ret := 1.000000 // buy
							if( d_k > 12.4959 )
								if( smoothK_k <= 27.6824 )
									ret := 0.000000
								if( smoothK_k > 27.6824 )
									ret := 0.750000 // buy
						if( rsi1 > 54.8303 )
							if( VIM <= 1.40346 )
								if( d_k <= 13.1979 )
									ret := -0.500000
								if( d_k > 13.1979 )
									ret := 0.333333
							if( VIM > 1.40346 )
								ret := -1.000000 // sell
					if( smoothD_d > 75.5501 )
						if( VIP <= 1.22501 )
							ret := 0.500000
						if( VIP > 1.22501 )
							ret := 1.000000 // buy
			if( VIP > 1.52849 )
				if( d_k <= 1.06005 )
					if( rsi1 <= 76.1682 )
						if( smoothD_d <= 23.4509 )
							if( rsi1 <= 57.1095 )
								if( d <= 20.134 )
									ret := -0.603659
								if( d > 20.134 )
									ret := -0.242857
							if( rsi1 > 57.1095 )
								if( d <= 15.0114 )
									ret := 0.230769
								if( d > 15.0114 )
									ret := -0.295455
						if( smoothD_d > 23.4509 )
							if( d <= 96.7236 )
								if( k <= 39.5255 )
									ret := 0.248447
								if( k > 39.5255 )
									ret := -0.062521
							if( d > 96.7236 )
								if( VIP <= 2.48486 )
									ret := -0.820513 // sell
								if( VIP > 2.48486 )
									ret := -0.266667
					if( rsi1 > 76.1682 )
						if( d <= 99.9633 )
							if( VIM <= 9.85487 )
								if( k <= 99.8918 )
									ret := -0.558011
								if( k > 99.8918 )
									ret := -0.176471
							if( VIM > 9.85487 )
								if( smoothK_k <= 92.1581 )
									ret := 0.233333
								if( smoothK_k > 92.1581 )
									ret := -0.473684
						if( d > 99.9633 )
							if( VIP_VIM <= 0.822576 )
								ret := -0.428571
							if( VIP_VIM > 0.822576 )
								if( VIP <= 4.32759 )
									ret := 0.250000
								if( VIP > 4.32759 )
									ret := 0.833333 // buy
				if( d_k > 1.06005 )
					if( VIP <= 14.3436 )
						if( k <= 78.1329 )
							if( d_k <= 21.957 )
								if( rsi1 <= 56.8727 )
									ret := 0.051242
								if( rsi1 > 56.8727 )
									ret := -0.154882
							if( d_k > 21.957 )
								if( d_k <= 23.6242 )
									ret := 0.705882 // buy
								if( d_k > 23.6242 )
									ret := 0.132075
						if( k > 78.1329 )
							if( rsi1 <= 85.3571 )
								if( VIP <= 11.3897 )
									ret := 0.299550
								if( VIP > 11.3897 )
									ret := -0.500000
							if( rsi1 > 85.3571 )
								ret := -1.000000 // sell
					if( VIP > 14.3436 )
						if( VIP_VIM <= -0.460775 )
							if( rsi1 <= 55.2829 )
								if( VIP <= 117.882 )
									ret := 0.277778
								if( VIP > 117.882 )
									ret := 0.857143 // buy
							if( rsi1 > 55.2829 )
								if( smoothK_k <= 82.0545 )
									ret := -0.120000
								if( smoothK_k > 82.0545 )
									ret := -0.800000 // sell
						if( VIP_VIM > -0.460775 )
							if( rsi1 <= 57.7727 )
								if( d_k <= 3.16606 )
									ret := 0.909091 // buy
								if( d_k > 3.16606 )
									ret := 0.541667
							if( rsi1 > 57.7727 )
								if( VIM <= 12.3308 )
									ret := 1.000000 // buy
								if( VIM > 12.3308 )
									ret := 0.186916
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_8756d9a6(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


