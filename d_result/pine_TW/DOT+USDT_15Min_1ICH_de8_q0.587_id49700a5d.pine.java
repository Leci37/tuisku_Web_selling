//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: DOTUSDT_15Min_1ICH_49700a5d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_1ICH_49700a5d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_49700a5d(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.022501 )
		if( kinjun_sen <= 10.412 )
			if( chinkou_span <= 10.4017 )
				if( chinkou_span <= 7.12634 )
					if( senkou_span_a <= 7.02378 )
						if( kinjun_sen <= 6.80389 )
							if( basis_max <= -0.098625 )
								if( chinkou_span <= 6.50504 )
									ret := -0.892857 // sell
								if( chinkou_span > 6.50504 )
									ret := -0.428571
							if( basis_max > -0.098625 )
								if( chinkou_span <= 6.67217 )
									ret := 0.025166
								if( chinkou_span > 6.67217 )
									ret := 0.277070
						if( kinjun_sen > 6.80389 )
							if( senkou_span_a <= 6.98848 )
								if( senkou_span_b <= 6.93174 )
									ret := -0.055329
								if( senkou_span_b > 6.93174 )
									ret := -0.255843
							if( senkou_span_a > 6.98848 )
								if( senkou_span_a_displaced <= 7.09266 )
									ret := 0.007737
								if( senkou_span_a_displaced > 7.09266 )
									ret := 0.500000
					if( senkou_span_a > 7.02378 )
						if( senkou_span_b <= 7.17661 )
							if( chinkou_span <= 6.84298 )
								if( basis_max <= 0.00511 )
									ret := -0.739884 // sell
								if( basis_max > 0.00511 )
									ret := -0.232143
							if( chinkou_span > 6.84298 )
								if( chinkou_span <= 7.03631 )
									ret := -0.278571
								if( chinkou_span > 7.03631 )
									ret := -0.054917
						if( senkou_span_b > 7.17661 )
							if( kinjun_sen <= 7.0812 )
								if( chinkou_span <= 6.99231 )
									ret := -0.800000 // sell
								if( chinkou_span > 6.99231 )
									ret := 0.888889 // buy
							if( kinjun_sen > 7.0812 )
								if( senkou_span_a <= 7.44262 )
									ret := -0.509413
								if( senkou_span_a > 7.44262 )
									ret := -0.763636 // sell
				if( chinkou_span > 7.12634 )
					if( senkou_span_a <= 7.18191 )
						if( senkou_span_a_displaced <= 7.32325 )
							if( chinkou_span <= 7.31125 )
								if( tenkan_sen <= 7.00953 )
									ret := 0.644068
								if( tenkan_sen > 7.00953 )
									ret := 0.320941
							if( chinkou_span > 7.31125 )
								if( chinkou_span <= 7.50042 )
									ret := 0.665000
								if( chinkou_span > 7.50042 )
									ret := 0.885057 // buy
						if( senkou_span_a_displaced > 7.32325 )
							if( senkou_span_b_displaced <= 7.33638 )
								if( chinkou_span <= 7.22 )
									ret := 1.000000 // buy
								if( chinkou_span > 7.22 )
									ret := 0.000000
							if( senkou_span_b_displaced > 7.33638 )
								if( kinjun_sen <= 7.11068 )
									ret := -0.823529 // sell
								if( kinjun_sen > 7.11068 )
									ret := -0.354839
					if( senkou_span_a > 7.18191 )
						if( senkou_span_a_displaced <= 9.86736 )
							if( basis_minus <= 0.41175 )
								if( basis_minus <= -0.459425 )
									ret := 0.896552 // buy
								if( basis_minus > -0.459425 )
									ret := 0.063035
							if( basis_minus > 0.41175 )
								if( senkou_span_a_displaced <= 7.36538 )
									ret := -0.555556
								if( senkou_span_a_displaced > 7.36538 )
									ret := -0.882353 // sell
						if( senkou_span_a_displaced > 9.86736 )
							if( senkou_span_a_displaced <= 9.96314 )
								if( senkou_span_b <= 9.83325 )
									ret := 0.217391
								if( senkou_span_b > 9.83325 )
									ret := -0.589286
							if( senkou_span_a_displaced > 9.96314 )
								if( senkou_span_b <= 9.90489 )
									ret := -0.741379 // sell
								if( senkou_span_b > 9.90489 )
									ret := 0.014354
			if( chinkou_span > 10.4017 )
				if( basis_minus <= -0.031199 )
					if( basis_max <= -0.022417 )
						if( senkou_span_a_displaced <= 10.3113 )
							ret := 0.833333 // buy
						if( senkou_span_a_displaced > 10.3113 )
							if( senkou_span_a <= 10.3931 )
								if( senkou_span_b <= 10.348 )
									ret := -0.625000
								if( senkou_span_b > 10.348 )
									ret := -0.083333
							if( senkou_span_a > 10.3931 )
								if( senkou_span_a <= 10.4078 )
									ret := -1.000000 // sell
								if( senkou_span_a > 10.4078 )
									ret := -0.500000
					if( basis_max > -0.022417 )
						if( chinkou_span <= 10.5176 )
							if( tenkan_sen <= 10.2395 )
								if( senkou_span_a <= 10.2246 )
									ret := 0.000000
								if( senkou_span_a > 10.2246 )
									ret := -1.000000 // sell
							if( tenkan_sen > 10.2395 )
								if( kinjun_sen <= 10.3924 )
									ret := 0.136364
								if( kinjun_sen > 10.3924 )
									ret := 0.888889 // buy
						if( chinkou_span > 10.5176 )
							if( senkou_span_a <= 10.3872 )
								if( basis_max <= 0.008135 )
									ret := 1.000000 // buy
								if( basis_max > 0.008135 )
									ret := 0.800000 // buy
							if( senkou_span_a > 10.3872 )
								ret := 0.250000
				if( basis_minus > -0.031199 )
					if( senkou_span_b_displaced <= 10.2565 )
						if( senkou_span_a_displaced <= 8.62766 )
							if( senkou_span_a <= 9.6928 )
								ret := 0.000000
							if( senkou_span_a > 9.6928 )
								ret := 0.500000
						if( senkou_span_a_displaced > 8.62766 )
							if( chinkou_span <= 10.6845 )
								if( basis_minus <= 0.000783 )
									ret := -0.500000
								if( basis_minus > 0.000783 )
									ret := 0.751678 // buy
							if( chinkou_span > 10.6845 )
								if( basis_max <= -0.086614 )
									ret := 0.979167 // buy
								if( basis_max > -0.086614 )
									ret := 0.812500 // buy
					if( senkou_span_b_displaced > 10.2565 )
						if( senkou_span_a_displaced <= 10.2139 )
							if( senkou_span_a <= 10.2293 )
								ret := -1.000000 // sell
							if( senkou_span_a > 10.2293 )
								ret := -0.250000
						if( senkou_span_a_displaced > 10.2139 )
							if( senkou_span_b_displaced <= 10.286 )
								ret := -0.750000 // sell
							if( senkou_span_b_displaced > 10.286 )
								if( basis_minus <= 0.095717 )
									ret := 0.681818
								if( basis_minus > 0.095717 )
									ret := -0.111111
		if( kinjun_sen > 10.412 )
			if( chinkou_span <= 10.4939 )
				if( basis_max <= 0.00424 )
					if( senkou_span_b_displaced <= 10.0727 )
						if( senkou_span_b <= 10.21 )
							ret := 0.200000
						if( senkou_span_b > 10.21 )
							if( kinjun_sen <= 10.504 )
								ret := 1.000000 // buy
							if( kinjun_sen > 10.504 )
								ret := 0.500000
					if( senkou_span_b_displaced > 10.0727 )
						if( basis_max <= -0.000532 )
							if( kinjun_sen <= 10.4153 )
								ret := -0.333333
							if( kinjun_sen > 10.4153 )
								if( chinkou_span <= 10.4235 )
									ret := -0.940541 // sell
								if( chinkou_span > 10.4235 )
									ret := -0.740000 // sell
						if( basis_max > -0.000532 )
							if( chinkou_span <= 10.2875 )
								if( senkou_span_b_displaced <= 10.606 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 10.606 )
									ret := -0.375000
							if( chinkou_span > 10.2875 )
								if( chinkou_span <= 10.3695 )
									ret := 0.230769
								if( chinkou_span > 10.3695 )
									ret := -0.555556
				if( basis_max > 0.00424 )
					if( senkou_span_b_displaced <= 10.6982 )
						if( kinjun_sen <= 10.6948 )
							if( chinkou_span <= 10.1355 )
								ret := -0.750000 // sell
							if( chinkou_span > 10.1355 )
								if( basis_max <= 0.009971 )
									ret := 0.882353 // buy
								if( basis_max > 0.009971 )
									ret := 0.000000
						if( kinjun_sen > 10.6948 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 10.6982 )
						if( chinkou_span <= 10.4002 )
							if( basis_max <= 0.013758 )
								if( kinjun_sen <= 10.6042 )
									ret := -0.500000
								if( kinjun_sen > 10.6042 )
									ret := -1.000000 // sell
							if( basis_max > 0.013758 )
								ret := -1.000000 // sell
						if( chinkou_span > 10.4002 )
							ret := 0.500000
			if( chinkou_span > 10.4939 )
				if( kinjun_sen <= 10.934 )
					if( senkou_span_a <= 10.6384 )
						if( senkou_span_a_displaced <= 10.4139 )
							if( senkou_span_a <= 10.6326 )
								if( senkou_span_a_displaced <= 10.3774 )
									ret := 0.076923
								if( senkou_span_a_displaced > 10.3774 )
									ret := 0.666667
							if( senkou_span_a > 10.6326 )
								if( basis_max <= -0.030329 )
									ret := -1.000000 // sell
								if( basis_max > -0.030329 )
									ret := -0.500000
						if( senkou_span_a_displaced > 10.4139 )
							if( chinkou_span <= 10.5604 )
								ret := 0.000000
							if( chinkou_span > 10.5604 )
								if( senkou_span_b <= 10.7805 )
									ret := -0.969697 // sell
								if( senkou_span_b > 10.7805 )
									ret := -0.777778 // sell
					if( senkou_span_a > 10.6384 )
						if( chinkou_span <= 10.6824 )
							if( tenkan_sen <= 10.7488 )
								if( tenkan_sen <= 10.6854 )
									ret := -0.190476
								if( tenkan_sen > 10.6854 )
									ret := 0.703704 // buy
							if( tenkan_sen > 10.7488 )
								if( basis_minus <= 0.033261 )
									ret := 0.000000
								if( basis_minus > 0.033261 )
									ret := -0.926829 // sell
						if( chinkou_span > 10.6824 )
							if( basis_minus <= -0.1625 )
								if( basis_max <= -0.0175 )
									ret := 0.000000
								if( basis_max > -0.0175 )
									ret := -0.937500 // sell
							if( basis_minus > -0.1625 )
								if( tenkan_sen <= 11.3368 )
									ret := 0.572289
								if( tenkan_sen > 11.3368 )
									ret := -1.000000 // sell
				if( kinjun_sen > 10.934 )
					if( senkou_span_b <= 14.1836 )
						if( senkou_span_b <= 10.748 )
							if( senkou_span_a_displaced <= 10.0434 )
								ret := -0.333333
							if( senkou_span_a_displaced > 10.0434 )
								if( kinjun_sen <= 11.1625 )
									ret := -0.973684 // sell
								if( kinjun_sen > 11.1625 )
									ret := -0.833333 // sell
						if( senkou_span_b > 10.748 )
							if( senkou_span_b <= 11.4246 )
								if( chinkou_span <= 10.5928 )
									ret := 0.941176 // buy
								if( chinkou_span > 10.5928 )
									ret := -0.225962
							if( senkou_span_b > 11.4246 )
								if( tenkan_sen <= 12.6179 )
									ret := -0.747573 // sell
								if( tenkan_sen > 12.6179 )
									ret := -0.309278
					if( senkou_span_b > 14.1836 )
						if( senkou_span_b_displaced <= 15.216 )
							if( basis_max <= -0.035241 )
								if( senkou_span_a <= 15.3739 )
									ret := -0.163121
								if( senkou_span_a > 15.3739 )
									ret := 0.611111
							if( basis_max > -0.035241 )
								if( senkou_span_b_displaced <= 14.9427 )
									ret := 0.071942
								if( senkou_span_b_displaced > 14.9427 )
									ret := 0.619565
						if( senkou_span_b_displaced > 15.216 )
							if( senkou_span_b_displaced <= 17.1175 )
								if( senkou_span_b_displaced <= 17.0023 )
									ret := -0.264591
								if( senkou_span_b_displaced > 17.0023 )
									ret := -0.807018 // sell
							if( senkou_span_b_displaced > 17.1175 )
								if( chinkou_span <= 16.9838 )
									ret := 0.954545 // buy
								if( chinkou_span > 16.9838 )
									ret := 0.000000
	if( basis_max > 0.022501 )
		if( senkou_span_a_displaced <= 11.8472 )
			if( tenkan_sen <= 6.70982 )
				if( chinkou_span <= 6.64569 )
					if( kinjun_sen <= 5.836 )
						if( chinkou_span <= 5.45128 )
							if( senkou_span_a <= 5.45038 )
								if( senkou_span_b_displaced <= 5.32481 )
									ret := 0.153928
								if( senkou_span_b_displaced > 5.32481 )
									ret := 0.498607
							if( senkou_span_a > 5.45038 )
								if( basis_max <= 0.054175 )
									ret := -0.190000
								if( basis_max > 0.054175 )
									ret := -1.000000 // sell
						if( chinkou_span > 5.45128 )
							if( senkou_span_b <= 5.48803 )
								if( senkou_span_b_displaced <= 5.37291 )
									ret := -0.200000
								if( senkou_span_b_displaced > 5.37291 )
									ret := 0.920000 // buy
							if( senkou_span_b > 5.48803 )
								if( chinkou_span <= 5.78497 )
									ret := 0.336449
								if( chinkou_span > 5.78497 )
									ret := 0.698529
					if( kinjun_sen > 5.836 )
						if( senkou_span_a_displaced <= 5.977 )
							if( chinkou_span <= 5.74693 )
								if( kinjun_sen <= 5.89931 )
									ret := -1.000000 // sell
								if( kinjun_sen > 5.89931 )
									ret := -0.741935 // sell
							if( chinkou_span > 5.74693 )
								if( senkou_span_b <= 5.8875 )
									ret := 0.733333 // buy
								if( senkou_span_b > 5.8875 )
									ret := -0.178571
						if( senkou_span_a_displaced > 5.977 )
							if( chinkou_span <= 5.8933 )
								if( tenkan_sen <= 5.94399 )
									ret := 0.068493
								if( tenkan_sen > 5.94399 )
									ret := -0.813333 // sell
							if( chinkou_span > 5.8933 )
								if( senkou_span_b <= 6.56016 )
									ret := 0.255814
								if( senkou_span_b > 6.56016 )
									ret := -0.080460
				if( chinkou_span > 6.64569 )
					if( senkou_span_a <= 6.29158 )
						ret := -1.000000 // sell
					if( senkou_span_a > 6.29158 )
						if( senkou_span_b_displaced <= 7.4779 )
							if( senkou_span_a_displaced <= 6.58475 )
								if( kinjun_sen <= 6.64575 )
									ret := 0.181818
								if( kinjun_sen > 6.64575 )
									ret := -0.625000
							if( senkou_span_a_displaced > 6.58475 )
								if( chinkou_span <= 6.86031 )
									ret := 0.604361
								if( chinkou_span > 6.86031 )
									ret := 0.837607 // buy
						if( senkou_span_b_displaced > 7.4779 )
							if( basis_max <= 0.108458 )
								ret := 0.142857
							if( basis_max > 0.108458 )
								ret := -0.857143 // sell
			if( tenkan_sen > 6.70982 )
				if( basis_minus <= 0.182884 )
					if( chinkou_span <= 6.81922 )
						if( basis_max <= 0.10311 )
							if( senkou_span_b <= 7.11796 )
								if( senkou_span_a_displaced <= 7.01987 )
									ret := -0.446809
								if( senkou_span_a_displaced > 7.01987 )
									ret := 0.057143
							if( senkou_span_b > 7.11796 )
								if( kinjun_sen <= 7.43051 )
									ret := -0.913043 // sell
								if( kinjun_sen > 7.43051 )
									ret := 0.625000
						if( basis_max > 0.10311 )
							if( chinkou_span <= 6.75421 )
								ret := 1.000000 // buy
							if( chinkou_span > 6.75421 )
								ret := -0.250000
					if( chinkou_span > 6.81922 )
						if( kinjun_sen <= 7.51352 )
							if( senkou_span_b_displaced <= 7.54923 )
								if( tenkan_sen <= 7.15464 )
									ret := 0.262165
								if( tenkan_sen > 7.15464 )
									ret := 0.080068
							if( senkou_span_b_displaced > 7.54923 )
								if( senkou_span_b <= 7.635 )
									ret := 0.559880
								if( senkou_span_b > 7.635 )
									ret := -0.642857
						if( kinjun_sen > 7.51352 )
							if( kinjun_sen <= 7.55284 )
								if( senkou_span_b_displaced <= 7.55718 )
									ret := 0.127660
								if( senkou_span_b_displaced > 7.55718 )
									ret := -0.696000
							if( kinjun_sen > 7.55284 )
								if( chinkou_span <= 7.47881 )
									ret := -0.512563
								if( chinkou_span > 7.47881 )
									ret := 0.167128
				if( basis_minus > 0.182884 )
					if( chinkou_span <= 11 )
						if( tenkan_sen <= 7.3935 )
							ret := 0.833333 // buy
						if( tenkan_sen > 7.3935 )
							if( chinkou_span <= 10.0748 )
								if( chinkou_span <= 9.1431 )
									ret := -0.573529
								if( chinkou_span > 9.1431 )
									ret := -0.961538 // sell
							if( chinkou_span > 10.0748 )
								if( senkou_span_b_displaced <= 9.303 )
									ret := 0.625000
								if( senkou_span_b_displaced > 9.303 )
									ret := -0.566667
					if( chinkou_span > 11 )
						if( senkou_span_b_displaced <= 10.5571 )
							ret := 0.833333 // buy
						if( senkou_span_b_displaced > 10.5571 )
							ret := 1.000000 // buy
		if( senkou_span_a_displaced > 11.8472 )
			if( chinkou_span <= 14.8898 )
				if( basis_max <= 0.285 )
					if( senkou_span_b_displaced <= 12.5989 )
						ret := -1.000000 // sell
					if( senkou_span_b_displaced > 12.5989 )
						if( kinjun_sen <= 11.5312 )
							if( senkou_span_b_displaced <= 12.6324 )
								if( senkou_span_a_displaced <= 12.1105 )
									ret := 0.500000
								if( senkou_span_a_displaced > 12.1105 )
									ret := -0.600000
							if( senkou_span_b_displaced > 12.6324 )
								if( senkou_span_a <= 11.3002 )
									ret := 0.750000 // buy
								if( senkou_span_a > 11.3002 )
									ret := 1.000000 // buy
						if( kinjun_sen > 11.5312 )
							if( tenkan_sen <= 13.075 )
								if( basis_max <= 0.167298 )
									ret := -0.769912 // sell
								if( basis_max > 0.167298 )
									ret := 0.000000
							if( tenkan_sen > 13.075 )
								if( kinjun_sen <= 14.3125 )
									ret := 0.209877
								if( kinjun_sen > 14.3125 )
									ret := -0.601190
				if( basis_max > 0.285 )
					if( senkou_span_b <= 15.235 )
						if( chinkou_span <= 14.4442 )
							ret := 0.750000 // buy
						if( chinkou_span > 14.4442 )
							ret := 1.000000 // buy
					if( senkou_span_b > 15.235 )
						ret := -0.750000 // sell
			if( chinkou_span > 14.8898 )
				if( tenkan_sen <= 15.1589 )
					if( basis_minus <= -0.272927 )
						ret := -0.400000
					if( basis_minus > -0.272927 )
						if( basis_minus <= -0.24125 )
							ret := 1.000000 // buy
						if( basis_minus > -0.24125 )
							if( senkou_span_b_displaced <= 15.0448 )
								if( basis_minus <= -0.029115 )
									ret := 0.705882 // buy
								if( basis_minus > -0.029115 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 15.0448 )
								if( basis_max <= 0.063708 )
									ret := -0.052632
								if( basis_max > 0.063708 )
									ret := 0.666667
				if( tenkan_sen > 15.1589 )
					if( senkou_span_a_displaced <= 16.3461 )
						if( senkou_span_a_displaced <= 16.2924 )
							if( senkou_span_b <= 15.9897 )
								if( basis_minus <= 0.004228 )
									ret := -0.700000 // sell
								if( basis_minus > 0.004228 )
									ret := -1.000000 // sell
							if( senkou_span_b > 15.9897 )
								if( kinjun_sen <= 16.1689 )
									ret := 0.777778 // buy
								if( kinjun_sen > 16.1689 )
									ret := -0.250000
						if( senkou_span_a_displaced > 16.2924 )
							ret := -1.000000 // sell
					if( senkou_span_a_displaced > 16.3461 )
						if( senkou_span_a_displaced <= 16.985 )
							if( senkou_span_a_displaced <= 16.8985 )
								if( senkou_span_a <= 16.5237 )
									ret := 0.560000
								if( senkou_span_a > 16.5237 )
									ret := -0.100000
							if( senkou_span_a_displaced > 16.8985 )
								if( senkou_span_a_displaced <= 16.9387 )
									ret := 0.958333 // buy
								if( senkou_span_a_displaced > 16.9387 )
									ret := 0.600000
						if( senkou_span_a_displaced > 16.985 )
							if( kinjun_sen <= 17.0416 )
								if( senkou_span_a <= 16.99 )
									ret := 0.000000
								if( senkou_span_a > 16.99 )
									ret := 0.857143 // buy
							if( kinjun_sen > 17.0416 )
								if( senkou_span_a_displaced <= 17.0781 )
									ret := -0.222222
								if( senkou_span_a_displaced > 17.0781 )
									ret := -0.937500 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_DOTUSDT_15Min_49700a5d(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


