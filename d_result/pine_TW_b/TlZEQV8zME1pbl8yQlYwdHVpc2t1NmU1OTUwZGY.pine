//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: NVDA_30Min_2BV0_6e5950df Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2BV0_6e5950df", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_6e5950df(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( VIP_VIM <= 0.478642 )
		if( bbp <= -9.75387 )
			if( bbm <= 3.39072 )
				if( VIP <= 1.03334 )
					if( VIM <= 1.46918 )
						if( bbp <= -10.6148 )
							if( bearPower <= -12.8691 )
								if( bbp <= -29.734 )
									ret := 0.538462
								if( bbp > -29.734 )
									ret := 0.850000 // buy
							if( bearPower > -12.8691 )
								if( VIP_VIM <= -0.664634 )
									ret := 0.010101
								if( VIP_VIM > -0.664634 )
									ret := 0.264205
						if( bbp > -10.6148 )
							if( VIP <= 0.717676 )
								if( bearPower <= -5.97379 )
									ret := 0.047619
								if( bearPower > -5.97379 )
									ret := 0.550000
							if( VIP > 0.717676 )
								if( bbm <= 1.53117 )
									ret := 0.380952
								if( bbm > 1.53117 )
									ret := 0.712766 // buy
					if( VIM > 1.46918 )
						if( VIP_VIM <= -0.944584 )
							if( bearPower <= -6.5918 )
								if( bullPower <= -4.99897 )
									ret := 0.866667 // buy
								if( bullPower > -4.99897 )
									ret := 0.000000
							if( bearPower > -6.5918 )
								if( bbp <= -11.3158 )
									ret := -1.000000 // sell
								if( bbp > -11.3158 )
									ret := 0.000000
						if( VIP_VIM > -0.944584 )
							if( bearPower <= -8.15898 )
								if( VIP <= 0.879173 )
									ret := 0.953488 // buy
								if( VIP > 0.879173 )
									ret := 0.625000
							if( bearPower > -8.15898 )
								if( bullPower <= -5.941 )
									ret := -0.250000
								if( bullPower > -5.941 )
									ret := 0.756098 // buy
				if( VIP > 1.03334 )
					if( bbm <= 2.07333 )
						if( bullPower <= -4.82127 )
							if( bearPower <= -7.03489 )
								if( VIP <= 1.33332 )
									ret := -0.235294
								if( VIP > 1.33332 )
									ret := 0.043478
							if( bearPower > -7.03489 )
								if( bbm <= 0.141679 )
									ret := -0.200000
								if( bbm > 0.141679 )
									ret := -0.900000 // sell
						if( bullPower > -4.82127 )
							if( VIP_VIM <= -0.227311 )
								ret := 0.714286 // buy
							if( VIP_VIM > -0.227311 )
								ret := -0.166667
					if( bbm > 2.07333 )
						if( VIM <= 1.56496 )
							if( bbp <= -18.0931 )
								ret := -0.500000
							if( bbp > -18.0931 )
								ret := 0.000000
						if( VIM > 1.56496 )
							if( bbp <= -113.457 )
								if( bbp <= -271.88 )
									ret := 0.857143 // buy
								if( bbp > -271.88 )
									ret := -0.750000 // sell
							if( bbp > -113.457 )
								if( bbm <= 2.37134 )
									ret := 0.750000 // buy
								if( bbm > 2.37134 )
									ret := 1.000000 // buy
			if( bbm > 3.39072 )
				if( bullPower <= -5.64766 )
					if( VIM <= 1.28254 )
						if( bearPower <= -10.0702 )
							if( bullPower <= -9.48802 )
								if( VIP <= 0.741091 )
									ret := -0.600000
								if( VIP > 0.741091 )
									ret := -0.139535
							if( bullPower > -9.48802 )
								if( bearPower <= -14.6519 )
									ret := 0.379310
								if( bearPower > -14.6519 )
									ret := -0.157895
						if( bearPower > -10.0702 )
							if( VIM <= 1.20141 )
								ret := 0.500000
							if( VIM > 1.20141 )
								if( bearPower <= -9.66198 )
									ret := 0.823529 // buy
								if( bearPower > -9.66198 )
									ret := 1.000000 // buy
					if( VIM > 1.28254 )
						if( bearPower <= -32.0459 )
							if( VIP_VIM <= -0.472948 )
								if( bullPower <= -101.055 )
									ret := -1.000000 // sell
								if( bullPower > -101.055 )
									ret := -0.666667
							if( VIP_VIM > -0.472948 )
								ret := -0.250000
						if( bearPower > -32.0459 )
							if( bbm <= 3.48 )
								if( VIP_VIM <= -0.630619 )
									ret := -0.500000
								if( VIP_VIM > -0.630619 )
									ret := 0.000000
							if( bbm > 3.48 )
								if( VIP <= 0.982859 )
									ret := 0.621094
								if( VIP > 0.982859 )
									ret := -0.333333
				if( bullPower > -5.64766 )
					if( bbm <= 4.2471 )
						if( VIM <= 1.15165 )
							if( bearPower <= -7.09192 )
								if( VIP_VIM <= -0.234864 )
									ret := -0.666667
								if( VIP_VIM > -0.234864 )
									ret := -0.960000 // sell
							if( bearPower > -7.09192 )
								ret := 0.000000
						if( VIM > 1.15165 )
							if( VIP <= 0.793381 )
								if( bearPower <= -7.67517 )
									ret := -0.602151
								if( bearPower > -7.67517 )
									ret := -0.158537
							if( VIP > 0.793381 )
								if( bearPower <= -8.03627 )
									ret := -0.120000
								if( bearPower > -8.03627 )
									ret := 0.588235
					if( bbm > 4.2471 )
						if( VIP <= 0.872543 )
							if( bbm <= 32.3229 )
								if( bullPower <= -4.11091 )
									ret := -0.196970
								if( bullPower > -4.11091 )
									ret := 0.120401
							if( bbm > 32.3229 )
								ret := -1.000000 // sell
						if( VIP > 0.872543 )
							if( bbp <= -15.0041 )
								if( bbp <= -17.1399 )
									ret := 0.875000 // buy
								if( bbp > -17.1399 )
									ret := 0.529412
							if( bbp > -15.0041 )
								if( bbp <= -10.5884 )
									ret := 0.008621
								if( bbp > -10.5884 )
									ret := 0.678571
		if( bbp > -9.75387 )
			if( VIP <= 0.892749 )
				if( bbm <= 0.550478 )
					if( bbm <= 0.316151 )
						if( bbp <= -4.06635 )
							if( bearPower <= -2.16352 )
								if( VIP_VIM <= -0.969531 )
									ret := -0.500000
								if( VIP_VIM > -0.969531 )
									ret := 0.172414
							if( bearPower > -2.16352 )
								if( bearPower <= -2.16008 )
									ret := 0.750000 // buy
								if( bearPower > -2.16008 )
									ret := 1.000000 // buy
						if( bbp > -4.06635 )
							if( bbp <= -2.84664 )
								if( VIP <= 0.67572 )
									ret := 0.052632
								if( VIP > 0.67572 )
									ret := -0.307692
							if( bbp > -2.84664 )
								if( bullPower <= -1.21231 )
									ret := 0.385965
								if( bullPower > -1.21231 )
									ret := 0.007389
					if( bbm > 0.316151 )
						if( bullPower <= -0.484178 )
							if( bbm <= 0.329879 )
								if( bullPower <= -1.36959 )
									ret := 0.000000
								if( bullPower > -1.36959 )
									ret := 0.589744
							if( bbm > 0.329879 )
								if( VIP <= 0.593527 )
									ret := -0.500000
								if( VIP > 0.593527 )
									ret := 0.058055
						if( bullPower > -0.484178 )
							if( bullPower <= 0.095071 )
								if( VIP <= 0.713686 )
									ret := -0.261905
								if( VIP > 0.713686 )
									ret := 0.382979
							if( bullPower > 0.095071 )
								if( VIM <= 1.22224 )
									ret := 0.140845
								if( VIM > 1.22224 )
									ret := -0.500000
				if( bbm > 0.550478 )
					if( bullPower <= -2.55886 )
						if( VIP <= 0.757203 )
							if( bearPower <= -3.63678 )
								if( bbp <= -7.75791 )
									ret := -0.366093
								if( bbp > -7.75791 )
									ret := -0.123153
							if( bearPower > -3.63678 )
								if( VIP <= 0.673078 )
									ret := -0.444444
								if( VIP > 0.673078 )
									ret := 0.631579
						if( VIP > 0.757203 )
							if( bearPower <= -5.60867 )
								if( VIP <= 0.783732 )
									ret := 0.128205
								if( VIP > 0.783732 )
									ret := -0.453488
							if( bearPower > -5.60867 )
								if( bullPower <= -2.76473 )
									ret := 0.334906
								if( bullPower > -2.76473 )
									ret := -0.232877
					if( bullPower > -2.55886 )
						if( VIM <= 1.31205 )
							if( bbm <= 1.85219 )
								if( bbm <= 1.23211 )
									ret := -0.003934
								if( bbm > 1.23211 )
									ret := -0.172308
							if( bbm > 1.85219 )
								if( bullPower <= -2.33206 )
									ret := 0.432749
								if( bullPower > -2.33206 )
									ret := 0.000394
						if( VIM > 1.31205 )
							if( bbm <= 0.733273 )
								if( bearPower <= -1.80949 )
									ret := 0.245098
								if( bearPower > -1.80949 )
									ret := -0.307229
							if( bbm > 0.733273 )
								if( bullPower <= -0.637419 )
									ret := 0.109865
								if( bullPower > -0.637419 )
									ret := 0.327189
			if( VIP > 0.892749 )
				if( bullPower <= 0.893919 )
					if( VIM <= 1.07076 )
						if( bbp <= -3.87731 )
							if( bbm <= 2.005 )
								if( bbp <= -4.64831 )
									ret := 0.314815
								if( bbp > -4.64831 )
									ret := -0.241379
							if( bbm > 2.005 )
								if( bbm <= 4.40038 )
									ret := -0.273846
								if( bbm > 4.40038 )
									ret := -0.056701
						if( bbp > -3.87731 )
							if( bbp <= -3.56466 )
								if( VIM <= 1.05404 )
									ret := 0.506667
								if( VIM > 1.05404 )
									ret := 0.000000
							if( bbp > -3.56466 )
								if( bearPower <= 0.637153 )
									ret := 0.044868
								if( bearPower > 0.637153 )
									ret := 0.283465
					if( VIM > 1.07076 )
						if( VIM <= 1.17114 )
							if( bearPower <= -0.577932 )
								if( VIP <= 1.13441 )
									ret := 0.159390
								if( VIP > 1.13441 )
									ret := 0.399103
							if( bearPower > -0.577932 )
								if( bbm <= 0.462261 )
									ret := 0.121431
								if( bbm > 0.462261 )
									ret := -0.056667
						if( VIM > 1.17114 )
							if( VIP <= 1.30095 )
								if( bbm <= 0.48995 )
									ret := 0.051742
								if( bbm > 0.48995 )
									ret := -0.017590
							if( VIP > 1.30095 )
								if( bbm <= 0.798843 )
									ret := 0.201893
								if( bbm > 0.798843 )
									ret := -0.096386
				if( bullPower > 0.893919 )
					if( bbp <= -2.05951 )
						if( bullPower <= 1.1704 )
							if( bbm <= 5.8346 )
								if( bbp <= -3.20552 )
									ret := 0.692308
								if( bbp > -3.20552 )
									ret := 0.051724
							if( bbm > 5.8346 )
								if( bullPower <= 1.07112 )
									ret := -1.000000 // sell
								if( bullPower > 1.07112 )
									ret := -0.545455
						if( bullPower > 1.1704 )
							if( bbp <= -5.81329 )
								if( VIM <= 0.934008 )
									ret := 0.230769
								if( VIM > 0.934008 )
									ret := 0.847826 // buy
							if( bbp > -5.81329 )
								if( bbm <= 5.08964 )
									ret := 0.812500 // buy
								if( bbm > 5.08964 )
									ret := 0.194888
					if( bbp > -2.05951 )
						if( bullPower <= 25.436 )
							if( bullPower <= 9.47555 )
								if( VIM <= 0.988843 )
									ret := 0.031495
								if( VIM > 0.988843 )
									ret := -0.018119
							if( bullPower > 9.47555 )
								if( bbp <= 8.55278 )
									ret := -0.469697
								if( bbp > 8.55278 )
									ret := -0.039620
						if( bullPower > 25.436 )
							if( bbp <= 33.1919 )
								ret := 1.000000 // buy
							if( bbp > 33.1919 )
								if( bbm <= 20.671 )
									ret := 0.900000 // buy
								if( bbm > 20.671 )
									ret := 0.250000
	if( VIP_VIM > 0.478642 )
		if( bbp <= 10.8781 )
			if( VIM <= 0.604107 )
				if( VIP_VIM <= 1.12729 )
					if( bbp <= 1.53408 )
						if( bbp <= 0.885523 )
							ret := 0.000000
						if( bbp > 0.885523 )
							if( VIP <= 1.45963 )
								if( VIM <= 0.574462 )
									ret := 0.000000
								if( VIM > 0.574462 )
									ret := 0.750000 // buy
							if( VIP > 1.45963 )
								if( VIP_VIM <= 0.960781 )
									ret := 0.571429
								if( VIP_VIM > 0.960781 )
									ret := 0.892857 // buy
					if( bbp > 1.53408 )
						if( bbm <= 6.19208 )
							if( bbm <= 5.7075 )
								if( VIP <= 1.10627 )
									ret := -0.666667
								if( VIP > 1.10627 )
									ret := 0.233333
							if( bbm > 5.7075 )
								ret := -0.833333 // sell
						if( bbm > 6.19208 )
							if( bbm <= 10.2598 )
								if( VIP <= 1.20138 )
									ret := 0.750000 // buy
								if( VIP > 1.20138 )
									ret := 1.000000 // buy
							if( bbm > 10.2598 )
								ret := 0.250000
				if( VIP_VIM > 1.12729 )
					if( bbm <= 0.67 )
						if( VIM <= 0.49645 )
							if( bullPower <= 2.66657 )
								ret := -0.750000 // sell
							if( bullPower > 2.66657 )
								ret := -1.000000 // sell
						if( VIM > 0.49645 )
							ret := 0.000000
					if( bbm > 0.67 )
						if( VIM <= 0.476921 )
							if( bullPower <= 5.07535 )
								ret := 0.000000
							if( bullPower > 5.07535 )
								ret := -0.250000
						if( VIM > 0.476921 )
							ret := 0.500000
			if( VIM > 0.604107 )
				if( bearPower <= 2.88716 )
					if( bbp <= 5.42731 )
						if( VIP <= 1.28334 )
							if( bearPower <= 1.16642 )
								if( bbp <= 3.17474 )
									ret := 0.179104
								if( bbp > 3.17474 )
									ret := -0.126168
							if( bearPower > 1.16642 )
								if( VIP <= 1.25879 )
									ret := 0.588235
								if( VIP > 1.25879 )
									ret := 0.253425
						if( VIP > 1.28334 )
							if( VIM <= 1.23946 )
								if( bullPower <= -0.051313 )
									ret := 0.445652
								if( bullPower > -0.051313 )
									ret := 0.055236
							if( VIM > 1.23946 )
								if( bearPower <= 0.6249 )
									ret := -0.416667
								if( bearPower > 0.6249 )
									ret := 0.111111
					if( bbp > 5.42731 )
						if( VIM <= 0.669498 )
							if( bbp <= 6.75879 )
								if( bbm <= 2.16084 )
									ret := 0.654971
								if( bbm > 2.16084 )
									ret := 0.348837
							if( bbp > 6.75879 )
								if( bullPower <= 5.25667 )
									ret := -0.387097
								if( bullPower > 5.25667 )
									ret := 0.263158
						if( VIM > 0.669498 )
							if( bbm <= 5.01865 )
								if( bullPower <= 6.99994 )
									ret := 0.162367
								if( bullPower > 6.99994 )
									ret := 0.909091 // buy
							if( bbm > 5.01865 )
								if( bearPower <= 0.723329 )
									ret := 0.083333
								if( bearPower > 0.723329 )
									ret := -0.600000
				if( bearPower > 2.88716 )
					if( VIP_VIM <= 0.560286 )
						if( bbm <= 1.60254 )
							if( bbp <= 8.85568 )
								if( VIP_VIM <= 0.521287 )
									ret := 0.486486
								if( VIP_VIM > 0.521287 )
									ret := -0.125000
							if( bbp > 8.85568 )
								if( bearPower <= 4.6976 )
									ret := -0.818182 // sell
								if( bearPower > 4.6976 )
									ret := 0.000000
						if( bbm > 1.60254 )
							if( bullPower <= 6.26138 )
								if( VIP <= 1.26739 )
									ret := -0.775000 // sell
								if( VIP > 1.26739 )
									ret := -0.404762
							if( bullPower > 6.26138 )
								if( bullPower <= 6.61444 )
									ret := 0.411765
								if( bullPower > 6.61444 )
									ret := -0.640000
					if( VIP_VIM > 0.560286 )
						if( bbp <= 8.90562 )
							if( bearPower <= 2.91825 )
								if( bearPower <= 2.90459 )
									ret := -0.400000
								if( bearPower > 2.90459 )
									ret := -0.923077 // sell
							if( bearPower > 2.91825 )
								if( VIP <= 1.52492 )
									ret := -0.121457
								if( VIP > 1.52492 )
									ret := 0.333333
						if( bbp > 8.90562 )
							if( bearPower <= 4.19976 )
								if( bbm <= 2.63049 )
									ret := 0.572816
								if( bbm > 2.63049 )
									ret := 0.015385
							if( bearPower > 4.19976 )
								if( VIP_VIM <= 0.794785 )
									ret := -0.350000
								if( VIP_VIM > 0.794785 )
									ret := 0.500000
		if( bbp > 10.8781 )
			if( bullPower <= 19.5309 )
				if( VIM <= 0.76419 )
					if( bearPower <= 11.0848 )
						if( bbp <= 26.3333 )
							if( bearPower <= 10.9684 )
								if( bullPower <= 6.99915 )
									ret := 0.579439
								if( bullPower > 6.99915 )
									ret := 0.287912
							if( bearPower > 10.9684 )
								ret := -1.000000 // sell
						if( bbp > 26.3333 )
							if( bullPower <= 16.9948 )
								if( VIP <= 1.44367 )
									ret := -1.000000 // sell
								if( VIP > 1.44367 )
									ret := -0.750000 // sell
							if( bullPower > 16.9948 )
								if( bbp <= 28.0705 )
									ret := 0.428571
								if( bbp > 28.0705 )
									ret := -0.727273 // sell
					if( bearPower > 11.0848 )
						if( VIP_VIM <= 1.06355 )
							if( bbm <= 3.64925 )
								if( bearPower <= 11.7779 )
									ret := 0.500000
								if( bearPower > 11.7779 )
									ret := 0.000000
							if( bbm > 3.64925 )
								if( VIP <= 1.35035 )
									ret := 0.722222 // buy
								if( VIP > 1.35035 )
									ret := 0.962963 // buy
						if( VIP_VIM > 1.06355 )
							ret := 0.200000
				if( VIM > 0.76419 )
					if( bearPower <= 6.79533 )
						if( bbp <= 14.5143 )
							if( bbm <= 1.21687 )
								if( VIM <= 0.842356 )
									ret := 0.812500 // buy
								if( VIM > 0.842356 )
									ret := 0.000000
							if( bbm > 1.21687 )
								if( bearPower <= 3.88222 )
									ret := 0.521739
								if( bearPower > 3.88222 )
									ret := -0.329114
						if( bbp > 14.5143 )
							if( VIM <= 0.843755 )
								if( bbp <= 18.0033 )
									ret := 0.150000
								if( bbp > 18.0033 )
									ret := 1.000000 // buy
							if( VIM > 0.843755 )
								ret := 1.000000 // buy
					if( bearPower > 6.79533 )
						if( bbm <= 0.734627 )
							if( bbm <= 0.260298 )
								ret := -0.600000
							if( bbm > 0.260298 )
								ret := -1.000000 // sell
						if( bbm > 0.734627 )
							if( VIP_VIM <= 0.487105 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.487105 )
								if( VIP_VIM <= 0.586102 )
									ret := 0.150000
								if( VIP_VIM > 0.586102 )
									ret := -0.333333
			if( bullPower > 19.5309 )
				if( bbp <= 33.912 )
					if( VIM <= 0.727732 )
						if( VIP_VIM <= 0.703533 )
							if( bullPower <= 20.773 )
								if( VIP <= 1.16748 )
									ret := -0.857143 // sell
								if( VIP > 1.16748 )
									ret := -0.500000
							if( bullPower > 20.773 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.703533 )
							if( bbm <= 13.325 )
								if( bbp <= 32.6404 )
									ret := -1.000000 // sell
								if( bbp > 32.6404 )
									ret := -0.250000
							if( bbm > 13.325 )
								ret := 0.333333
					if( VIM > 0.727732 )
						ret := 1.000000 // buy
				if( bbp > 33.912 )
					if( bbp <= 44.6896 )
						if( bbp <= 37.8748 )
							if( VIM <= 0.618834 )
								ret := 0.428571
							if( VIM > 0.618834 )
								if( VIM <= 0.703544 )
									ret := -1.000000 // sell
								if( VIM > 0.703544 )
									ret := 0.142857
						if( bbp > 37.8748 )
							if( bbm <= 6.045 )
								ret := 1.000000 // buy
							if( bbm > 6.045 )
								if( bbm <= 8.20252 )
									ret := 0.000000
								if( bbm > 8.20252 )
									ret := 0.666667
					if( bbp > 44.6896 )
						if( bbm <= 15.1703 )
							if( bearPower <= 18.3516 )
								ret := -1.000000 // sell
							if( bearPower > 18.3516 )
								if( VIP_VIM <= 0.709815 )
									ret := 0.400000
								if( VIP_VIM > 0.709815 )
									ret := -0.611111
						if( bbm > 15.1703 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_6e5950df(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


