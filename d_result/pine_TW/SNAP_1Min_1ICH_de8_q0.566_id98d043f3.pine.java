//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SNAP_1Min_1ICH_98d043f3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1ICH_98d043f3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_98d043f3(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -0.01126 )
		if( senkou_span_b <= 16.4717 )
			if( chinkou_span <= 16.45 )
				if( senkou_span_a <= 15.9583 )
					if( chinkou_span <= 15.8565 )
						if( tenkan_sen <= 15.4978 )
							if( chinkou_span <= 15.4449 )
								if( tenkan_sen <= 15.2587 )
									ret := 0.015511
								if( tenkan_sen > 15.2587 )
									ret := -0.174442
							if( chinkou_span > 15.4449 )
								if( basis_max <= -0.016812 )
									ret := 0.610656
								if( basis_max > -0.016812 )
									ret := 0.012987
						if( tenkan_sen > 15.4978 )
							if( chinkou_span <= 15.5597 )
								if( kinjun_sen <= 15.4463 )
									ret := 0.200000
								if( kinjun_sen > 15.4463 )
									ret := -0.635071
							if( chinkou_span > 15.5597 )
								if( senkou_span_a_displaced <= 15.6587 )
									ret := 0.088643
								if( senkou_span_a_displaced > 15.6587 )
									ret := -0.288515
					if( chinkou_span > 15.8565 )
						if( basis_minus <= 0.067513 )
							if( kinjun_sen <= 15.8717 )
								if( basis_minus <= -0.00375 )
									ret := -0.025000
								if( basis_minus > -0.00375 )
									ret := 0.492958
							if( kinjun_sen > 15.8717 )
								if( senkou_span_a_displaced <= 15.9201 )
									ret := -0.010870
								if( senkou_span_a_displaced > 15.9201 )
									ret := 0.941176 // buy
						if( basis_minus > 0.067513 )
							if( senkou_span_b <= 15.7295 )
								if( kinjun_sen <= 15.7515 )
									ret := -0.400000
								if( kinjun_sen > 15.7515 )
									ret := 0.461538
							if( senkou_span_b > 15.7295 )
								if( kinjun_sen <= 15.875 )
									ret := -0.682927
								if( kinjun_sen > 15.875 )
									ret := 0.260870
				if( senkou_span_a > 15.9583 )
					if( chinkou_span <= 15.9295 )
						if( basis_minus <= 0.030835 )
							if( tenkan_sen <= 16.1304 )
								ret := 0.000000
							if( tenkan_sen > 16.1304 )
								ret := -0.500000
						if( basis_minus > 0.030835 )
							if( tenkan_sen <= 15.99 )
								ret := -0.285714
							if( tenkan_sen > 15.99 )
								if( senkou_span_a <= 16.0126 )
									ret := -0.921739 // sell
								if( senkou_span_a > 16.0126 )
									ret := -0.611111
					if( chinkou_span > 15.9295 )
						if( kinjun_sen <= 16.3773 )
							if( senkou_span_b <= 15.8912 )
								if( senkou_span_b <= 15.8629 )
									ret := -0.142857
								if( senkou_span_b > 15.8629 )
									ret := -0.969697 // sell
							if( senkou_span_b > 15.8912 )
								if( chinkou_span <= 16.0745 )
									ret := -0.304147
								if( chinkou_span > 16.0745 )
									ret := 0.043812
						if( kinjun_sen > 16.3773 )
							if( senkou_span_a <= 16.4675 )
								if( senkou_span_a <= 16.4225 )
									ret := -0.125000
								if( senkou_span_a > 16.4225 )
									ret := -0.733333 // sell
							if( senkou_span_a > 16.4675 )
								if( kinjun_sen <= 16.4849 )
									ret := 0.358974
								if( kinjun_sen > 16.4849 )
									ret := -0.656250
			if( chinkou_span > 16.45 )
				if( basis_minus <= 0.063225 )
					if( kinjun_sen <= 16.3399 )
						if( basis_minus <= 0.049477 )
							if( basis_minus <= -0.093715 )
								ret := 0.000000
							if( basis_minus > -0.093715 )
								if( senkou_span_b <= 16.0528 )
									ret := 0.600000
								if( senkou_span_b > 16.0528 )
									ret := 0.952381 // buy
						if( basis_minus > 0.049477 )
							if( basis_max <= -0.015223 )
								if( senkou_span_b_displaced <= 16.1587 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 16.1587 )
									ret := 0.500000
							if( basis_max > -0.015223 )
								ret := -0.285714
					if( kinjun_sen > 16.3399 )
						if( senkou_span_b_displaced <= 16.2984 )
							if( kinjun_sen <= 16.44 )
								if( basis_minus <= 0.036316 )
									ret := -0.571429
								if( basis_minus > 0.036316 )
									ret := -1.000000 // sell
							if( kinjun_sen > 16.44 )
								ret := 0.000000
						if( senkou_span_b_displaced > 16.2984 )
							if( kinjun_sen <= 16.4807 )
								if( basis_max <= -0.017487 )
									ret := -0.028571
								if( basis_max > -0.017487 )
									ret := 0.728814 // buy
							if( kinjun_sen > 16.4807 )
								if( senkou_span_b_displaced <= 16.3821 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 16.3821 )
									ret := -0.400000
				if( basis_minus > 0.063225 )
					if( basis_max <= -0.020078 )
						if( senkou_span_a <= 16.3957 )
							if( senkou_span_a <= 16.3421 )
								if( tenkan_sen <= 16.3499 )
									ret := 1.000000 // buy
								if( tenkan_sen > 16.3499 )
									ret := 0.571429
							if( senkou_span_a > 16.3421 )
								ret := 0.000000
						if( senkou_span_a > 16.3957 )
							if( senkou_span_a_displaced <= 16.3677 )
								if( senkou_span_b <= 16.3941 )
									ret := 0.976190 // buy
								if( senkou_span_b > 16.3941 )
									ret := 0.805556 // buy
							if( senkou_span_a_displaced > 16.3677 )
								if( basis_minus <= 0.094125 )
									ret := 0.250000
								if( basis_minus > 0.094125 )
									ret := 0.750000 // buy
					if( basis_max > -0.020078 )
						if( basis_max <= -0.014453 )
							if( senkou_span_a <= 16.3962 )
								ret := 0.250000
							if( senkou_span_a > 16.3962 )
								ret := 0.000000
						if( basis_max > -0.014453 )
							if( basis_minus <= 0.066223 )
								ret := 1.000000 // buy
							if( basis_minus > 0.066223 )
								ret := 0.571429
		if( senkou_span_b > 16.4717 )
			if( chinkou_span <= 16.6091 )
				if( senkou_span_a_displaced <= 16.588 )
					if( tenkan_sen <= 16.525 )
						if( kinjun_sen <= 16.4288 )
							if( senkou_span_a_displaced <= 16.5229 )
								ret := 0.142857
							if( senkou_span_a_displaced > 16.5229 )
								ret := -0.500000
						if( kinjun_sen > 16.4288 )
							if( chinkou_span <= 16.4867 )
								if( kinjun_sen <= 16.43 )
									ret := -0.857143 // sell
								if( kinjun_sen > 16.43 )
									ret := -1.000000 // sell
							if( chinkou_span > 16.4867 )
								ret := -0.666667
					if( tenkan_sen > 16.525 )
						if( senkou_span_a_displaced <= 16.508 )
							if( chinkou_span <= 16.4894 )
								if( tenkan_sen <= 16.53 )
									ret := 0.375000
								if( tenkan_sen > 16.53 )
									ret := -0.800000 // sell
							if( chinkou_span > 16.4894 )
								if( senkou_span_b_displaced <= 16.4906 )
									ret := 0.526316
								if( senkou_span_b_displaced > 16.4906 )
									ret := -0.266667
						if( senkou_span_a_displaced > 16.508 )
							if( senkou_span_b <= 16.6267 )
								if( senkou_span_a <= 16.5313 )
									ret := 0.000000
								if( senkou_span_a > 16.5313 )
									ret := -0.573770
							if( senkou_span_b > 16.6267 )
								if( senkou_span_a <= 16.7065 )
									ret := 0.857143 // buy
								if( senkou_span_a > 16.7065 )
									ret := -0.666667
				if( senkou_span_a_displaced > 16.588 )
					if( senkou_span_a <= 16.6997 )
						if( senkou_span_a_displaced <= 16.6555 )
							if( chinkou_span <= 16.4 )
								ret := -1.000000 // sell
							if( chinkou_span > 16.4 )
								if( cross_up_tenkan_kinjunInt <= 0.5 )
									ret := -0.642857
								if( cross_up_tenkan_kinjunInt > 0.5 )
									ret := -1.000000 // sell
						if( senkou_span_a_displaced > 16.6555 )
							ret := -1.000000 // sell
					if( senkou_span_a > 16.6997 )
						if( senkou_span_a <= 16.7366 )
							ret := 0.166667
						if( senkou_span_a > 16.7366 )
							if( kinjun_sen <= 16.7053 )
								ret := -0.428571
							if( kinjun_sen > 16.7053 )
								if( basis_minus <= -0.084031 )
									ret := -0.750000 // sell
								if( basis_minus > -0.084031 )
									ret := -1.000000 // sell
			if( chinkou_span > 16.6091 )
				if( kinjun_sen <= 17.2079 )
					if( basis_minus <= 0.065045 )
						if( senkou_span_a <= 16.6058 )
							if( senkou_span_a_displaced <= 16.5264 )
								if( tenkan_sen <= 16.576 )
									ret := -0.090909
								if( tenkan_sen > 16.576 )
									ret := -0.710526 // sell
							if( senkou_span_a_displaced > 16.5264 )
								if( senkou_span_a_displaced <= 16.5718 )
									ret := 0.000000
								if( senkou_span_a_displaced > 16.5718 )
									ret := 0.666667
						if( senkou_span_a > 16.6058 )
							if( basis_max <= -0.01294 )
								if( chinkou_span <= 17.205 )
									ret := 0.125468
								if( chinkou_span > 17.205 )
									ret := 0.772727 // buy
							if( basis_max > -0.01294 )
								if( senkou_span_b <= 16.7676 )
									ret := 0.030303
								if( senkou_span_b > 16.7676 )
									ret := -0.444444
					if( basis_minus > 0.065045 )
						if( senkou_span_b_displaced <= 16.983 )
							if( tenkan_sen <= 16.865 )
								if( basis_minus <= 0.083636 )
									ret := 0.560000
								if( basis_minus > 0.083636 )
									ret := -0.153846
							if( tenkan_sen > 16.865 )
								if( chinkou_span <= 16.955 )
									ret := -0.900000 // sell
								if( chinkou_span > 16.955 )
									ret := -0.295082
						if( senkou_span_b_displaced > 16.983 )
							if( kinjun_sen <= 17.1797 )
								if( chinkou_span <= 17.1707 )
									ret := 0.500000
								if( chinkou_span > 17.1707 )
									ret := 1.000000 // buy
							if( kinjun_sen > 17.1797 )
								if( senkou_span_a <= 17.2175 )
									ret := -0.600000
								if( senkou_span_a > 17.2175 )
									ret := 0.500000
				if( kinjun_sen > 17.2079 )
					if( senkou_span_b_displaced <= 17.0554 )
						ret := -0.833333 // sell
					if( senkou_span_b_displaced > 17.0554 )
						ret := -1.000000 // sell
	if( basis_max > -0.01126 )
		if( chinkou_span <= 15.8852 )
			if( tenkan_sen <= 15.8241 )
				if( chinkou_span <= 15.4754 )
					if( kinjun_sen <= 15.4039 )
						if( basis_minus <= 0.738125 )
							if( basis_minus <= -1.04738 )
								if( basis_max <= 0.049395 )
									ret := 0.942857 // buy
								if( basis_max > 0.049395 )
									ret := 0.529412
							if( basis_minus > -1.04738 )
								if( basis_minus <= -0.699248 )
									ret := -0.681818
								if( basis_minus > -0.699248 )
									ret := 0.057008
						if( basis_minus > 0.738125 )
							ret := 1.000000 // buy
					if( kinjun_sen > 15.4039 )
						if( senkou_span_b <= 15.5759 )
							if( senkou_span_b_displaced <= 15.6203 )
								if( senkou_span_a_displaced <= 15.4312 )
									ret := -0.533613
								if( senkou_span_a_displaced > 15.4312 )
									ret := -0.214850
							if( senkou_span_b_displaced > 15.6203 )
								if( senkou_span_a <= 15.5306 )
									ret := 0.777778 // buy
								if( senkou_span_a > 15.5306 )
									ret := -0.500000
						if( senkou_span_b > 15.5759 )
							if( senkou_span_a_displaced <= 15.6172 )
								if( kinjun_sen <= 15.6037 )
									ret := -0.959184 // sell
								if( kinjun_sen > 15.6037 )
									ret := -0.375000
							if( senkou_span_a_displaced > 15.6172 )
								if( basis_minus <= -0.096693 )
									ret := -0.272727
								if( basis_minus > -0.096693 )
									ret := -0.569231
				if( chinkou_span > 15.4754 )
					if( kinjun_sen <= 15.5398 )
						if( basis_max <= -0.009349 )
							if( senkou_span_a <= 15.4403 )
								if( senkou_span_a_displaced <= 15.3563 )
									ret := 0.857143 // buy
								if( senkou_span_a_displaced > 15.3563 )
									ret := 0.000000
							if( senkou_span_a > 15.4403 )
								if( senkou_span_a <= 15.5126 )
									ret := -0.400000
								if( senkou_span_a > 15.5126 )
									ret := 0.214286
						if( basis_max > -0.009349 )
							if( chinkou_span <= 15.6113 )
								if( senkou_span_b_displaced <= 15.2538 )
									ret := -0.636364
								if( senkou_span_b_displaced > 15.2538 )
									ret := 0.492248
							if( chinkou_span > 15.6113 )
								if( senkou_span_a <= 15.4887 )
									ret := 0.582278
								if( senkou_span_a > 15.4887 )
									ret := 0.884058 // buy
					if( kinjun_sen > 15.5398 )
						if( chinkou_span <= 15.5801 )
							if( senkou_span_a <= 15.6564 )
								if( senkou_span_b_displaced <= 15.8451 )
									ret := -0.200000
								if( senkou_span_b_displaced > 15.8451 )
									ret := 0.714286 // buy
							if( senkou_span_a > 15.6564 )
								if( basis_minus <= -0.018824 )
									ret := -0.843373 // sell
								if( basis_minus > -0.018824 )
									ret := 0.238095
						if( chinkou_span > 15.5801 )
							if( tenkan_sen <= 15.6491 )
								if( kinjun_sen <= 15.6301 )
									ret := 0.251732
								if( kinjun_sen > 15.6301 )
									ret := 0.522449
							if( tenkan_sen > 15.6491 )
								if( senkou_span_a_displaced <= 15.7404 )
									ret := -0.095571
								if( senkou_span_a_displaced > 15.7404 )
									ret := 0.163688
			if( tenkan_sen > 15.8241 )
				if( senkou_span_a <= 15.9381 )
					if( senkou_span_a_displaced <= 15.7981 )
						if( basis_minus <= 0.0631 )
							if( senkou_span_a_displaced <= 15.7929 )
								if( tenkan_sen <= 15.8356 )
									ret := -0.166667
								if( tenkan_sen > 15.8356 )
									ret := 0.725490 // buy
							if( senkou_span_a_displaced > 15.7929 )
								if( kinjun_sen <= 15.845 )
									ret := 0.428571
								if( kinjun_sen > 15.845 )
									ret := -0.666667
						if( basis_minus > 0.0631 )
							if( kinjun_sen <= 15.8313 )
								ret := 0.600000
							if( kinjun_sen > 15.8313 )
								if( basis_minus <= 0.128502 )
									ret := -0.894737 // sell
								if( basis_minus > 0.128502 )
									ret := -0.222222
					if( senkou_span_a_displaced > 15.7981 )
						if( chinkou_span <= 15.7093 )
							if( basis_max <= -0.008263 )
								ret := 0.750000 // buy
							if( basis_max > -0.008263 )
								if( basis_minus <= -0.01581 )
									ret := -0.266667
								if( basis_minus > -0.01581 )
									ret := -0.850000 // sell
						if( chinkou_span > 15.7093 )
							if( senkou_span_a <= 15.9375 )
								if( basis_max <= 5e-06 )
									ret := -0.351852
								if( basis_max > 5e-06 )
									ret := -0.117754
							if( senkou_span_a > 15.9375 )
								if( senkou_span_a_displaced <= 15.9875 )
									ret := 0.000000
								if( senkou_span_a_displaced > 15.9875 )
									ret := 1.000000 // buy
				if( senkou_span_a > 15.9381 )
					if( chinkou_span <= 15.7681 )
						if( basis_max <= 0.007445 )
							if( senkou_span_a <= 15.9537 )
								ret := -1.000000 // sell
							if( senkou_span_a > 15.9537 )
								if( senkou_span_b_displaced <= 16.0992 )
									ret := 0.000000
								if( senkou_span_b_displaced > 16.0992 )
									ret := -1.000000 // sell
						if( basis_max > 0.007445 )
							if( tenkan_sen <= 15.9925 )
								if( kinjun_sen <= 15.9898 )
									ret := 0.500000
								if( kinjun_sen > 15.9898 )
									ret := 1.000000 // buy
							if( tenkan_sen > 15.9925 )
								ret := -0.750000 // sell
					if( chinkou_span > 15.7681 )
						if( kinjun_sen <= 15.9722 )
							if( basis_minus <= 0.01125 )
								if( basis_max <= 0.009526 )
									ret := -0.844444 // sell
								if( basis_max > 0.009526 )
									ret := -0.454545
							if( basis_minus > 0.01125 )
								if( basis_max <= 0.004253 )
									ret := 0.000000
								if( basis_max > 0.004253 )
									ret := -0.857143 // sell
						if( kinjun_sen > 15.9722 )
							if( senkou_span_b_displaced <= 16.047 )
								if( basis_minus <= -0.00125 )
									ret := -0.800000 // sell
								if( basis_minus > -0.00125 )
									ret := -0.960526 // sell
							if( senkou_span_b_displaced > 16.047 )
								if( senkou_span_a_displaced <= 16.0738 )
									ret := -0.320000
								if( senkou_span_a_displaced > 16.0738 )
									ret := -0.748148 // sell
		if( chinkou_span > 15.8852 )
			if( senkou_span_a <= 15.8659 )
				if( tenkan_sen <= 15.8665 )
					if( kinjun_sen <= 15.8197 )
						if( senkou_span_a <= 15.7738 )
							if( senkou_span_b <= 15.7433 )
								if( senkou_span_a <= 15.7737 )
									ret := 0.948276 // buy
								if( senkou_span_a > 15.7737 )
									ret := 0.500000
							if( senkou_span_b > 15.7433 )
								if( senkou_span_a_displaced <= 15.7486 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 15.7486 )
									ret := 0.303030
						if( senkou_span_a > 15.7738 )
							if( senkou_span_b_displaced <= 15.6316 )
								ret := 0.200000
							if( senkou_span_b_displaced > 15.6316 )
								if( chinkou_span <= 15.9002 )
									ret := 0.600000
								if( chinkou_span > 15.9002 )
									ret := 0.900000 // buy
					if( kinjun_sen > 15.8197 )
						if( senkou_span_a_displaced <= 15.7368 )
							if( cross_up_tenkan_kinjunInt <= 0.5 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := 0.428571
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := -0.500000
							if( cross_up_tenkan_kinjunInt > 0.5 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 15.7368 )
							if( senkou_span_b_displaced <= 15.9657 )
								if( senkou_span_b <= 15.9192 )
									ret := 0.567568
								if( senkou_span_b > 15.9192 )
									ret := 0.000000
							if( senkou_span_b_displaced > 15.9657 )
								if( chinkou_span <= 15.9858 )
									ret := 0.717949 // buy
								if( chinkou_span > 15.9858 )
									ret := 0.968750 // buy
				if( tenkan_sen > 15.8665 )
					if( chinkou_span <= 15.9436 )
						ret := -0.800000 // sell
					if( chinkou_span > 15.9436 )
						ret := 0.250000
			if( senkou_span_a > 15.8659 )
				if( kinjun_sen <= 16.1994 )
					if( chinkou_span <= 16.1129 )
						if( tenkan_sen <= 16.0611 )
							if( senkou_span_a_displaced <= 16.1954 )
								if( chinkou_span <= 15.9555 )
									ret := -0.046713
								if( chinkou_span > 15.9555 )
									ret := 0.228896
							if( senkou_span_a_displaced > 16.1954 )
								if( basis_max <= 0.027705 )
									ret := 0.027778
								if( basis_max > 0.027705 )
									ret := 0.714286 // buy
						if( tenkan_sen > 16.0611 )
							if( senkou_span_b <= 16.0675 )
								if( senkou_span_b_displaced <= 16.0437 )
									ret := 0.245902
								if( senkou_span_b_displaced > 16.0437 )
									ret := 0.000000
							if( senkou_span_b > 16.0675 )
								if( basis_max <= -0.004417 )
									ret := 0.066667
								if( basis_max > -0.004417 )
									ret := -0.327273
					if( chinkou_span > 16.1129 )
						if( basis_max <= 0.006333 )
							if( senkou_span_a_displaced <= 16.212 )
								if( kinjun_sen <= 16.1799 )
									ret := 0.387500
								if( kinjun_sen > 16.1799 )
									ret := 0.038168
							if( senkou_span_a_displaced > 16.212 )
								if( chinkou_span <= 16.2475 )
									ret := 0.534884
								if( chinkou_span > 16.2475 )
									ret := 1.000000 // buy
						if( basis_max > 0.006333 )
							if( basis_minus <= -0.12914 )
								if( tenkan_sen <= 16.1545 )
									ret := -1.000000 // sell
								if( tenkan_sen > 16.1545 )
									ret := 0.750000 // buy
							if( basis_minus > -0.12914 )
								if( tenkan_sen <= 16.0449 )
									ret := 0.307692
								if( tenkan_sen > 16.0449 )
									ret := 0.733945 // buy
				if( kinjun_sen > 16.1994 )
					if( senkou_span_b <= 17.0433 )
						if( kinjun_sen <= 16.9659 )
							if( chinkou_span <= 16.2975 )
								if( tenkan_sen <= 16.3383 )
									ret := -0.108371
								if( tenkan_sen > 16.3383 )
									ret := -0.508728
							if( chinkou_span > 16.2975 )
								if( senkou_span_a <= 16.6299 )
									ret := 0.226214
								if( senkou_span_a > 16.6299 )
									ret := 0.018143
						if( kinjun_sen > 16.9659 )
							if( chinkou_span <= 16.765 )
								ret := -1.000000 // sell
							if( chinkou_span > 16.765 )
								if( senkou_span_a <= 17.0308 )
									ret := 0.691729
								if( senkou_span_a > 17.0308 )
									ret := 0.000000
					if( senkou_span_b > 17.0433 )
						if( tenkan_sen <= 17.0535 )
							if( senkou_span_b_displaced <= 16.937 )
								ret := 0.500000
							if( senkou_span_b_displaced > 16.937 )
								if( chinkou_span <= 16.9933 )
									ret := -0.833333 // sell
								if( chinkou_span > 16.9933 )
									ret := -0.250000
						if( tenkan_sen > 17.0535 )
							if( kinjun_sen <= 17.1013 )
								if( senkou_span_a <= 17.0772 )
									ret := 0.652174
								if( senkou_span_a > 17.0772 )
									ret := 0.106061
							if( kinjun_sen > 17.1013 )
								if( chinkou_span <= 16.998 )
									ret := -0.632353
								if( chinkou_span > 16.998 )
									ret := -0.007042
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_98d043f3(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


