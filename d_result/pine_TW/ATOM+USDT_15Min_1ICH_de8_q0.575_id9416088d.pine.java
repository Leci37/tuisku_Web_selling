//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ATOMUSDT_15Min_1ICH_9416088d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1ICH_9416088d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_9416088d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a_displaced <= 14.635 )
		if( chinkou_span <= 11.2431 )
			if( tenkan_sen <= 11.2226 )
				if( chinkou_span <= 11.002 )
					if( tenkan_sen <= 10.7844 )
						if( chinkou_span <= 10.7088 )
							if( kinjun_sen <= 10.352 )
								if( chinkou_span <= 10.2401 )
									ret := 0.033525
								if( chinkou_span > 10.2401 )
									ret := 0.349822
							if( kinjun_sen > 10.352 )
								if( tenkan_sen <= 10.6698 )
									ret := -0.037061
								if( tenkan_sen > 10.6698 )
									ret := -0.402000
						if( chinkou_span > 10.7088 )
							if( basis_minus <= 0.313 )
								if( kinjun_sen <= 10.3323 )
									ret := 0.723077 // buy
								if( kinjun_sen > 10.3323 )
									ret := 0.411376
							if( basis_minus > 0.313 )
								if( senkou_span_b_displaced <= 9.69032 )
									ret := 0.500000
								if( senkou_span_b_displaced > 9.69032 )
									ret := -0.900000 // sell
					if( tenkan_sen > 10.7844 )
						if( chinkou_span <= 10.7639 )
							if( senkou_span_b_displaced <= 10.4839 )
								if( basis_minus <= 0.238061 )
									ret := -0.240000
								if( basis_minus > 0.238061 )
									ret := 0.848485 // buy
							if( senkou_span_b_displaced > 10.4839 )
								if( chinkou_span <= 10.5373 )
									ret := -0.682584
								if( chinkou_span > 10.5373 )
									ret := -0.413889
						if( chinkou_span > 10.7639 )
							if( senkou_span_a <= 11.0046 )
								if( senkou_span_a_displaced <= 11.1925 )
									ret := -0.030442
								if( senkou_span_a_displaced > 11.1925 )
									ret := 0.388060
							if( senkou_span_a > 11.0046 )
								if( senkou_span_b <= 11.1113 )
									ret := -0.440347
								if( senkou_span_b > 11.1113 )
									ret := -0.125326
				if( chinkou_span > 11.002 )
					if( senkou_span_b <= 11.1073 )
						if( senkou_span_a <= 10.9759 )
							if( senkou_span_a_displaced <= 9.75282 )
								if( kinjun_sen <= 10.1285 )
									ret := 0.285714
								if( kinjun_sen > 10.1285 )
									ret := -0.933333 // sell
							if( senkou_span_a_displaced > 9.75282 )
								if( tenkan_sen <= 10.7765 )
									ret := 0.659472
								if( tenkan_sen > 10.7765 )
									ret := 0.325581
						if( senkou_span_a > 10.9759 )
							if( senkou_span_b <= 11.0858 )
								if( basis_max <= -0.124149 )
									ret := -0.900000 // sell
								if( basis_max > -0.124149 )
									ret := 0.144986
							if( senkou_span_b > 11.0858 )
								if( basis_minus <= -0.016 )
									ret := 0.780000 // buy
								if( basis_minus > -0.016 )
									ret := 0.153846
					if( senkou_span_b > 11.1073 )
						if( senkou_span_b <= 11.3125 )
							if( senkou_span_b_displaced <= 11.0124 )
								if( senkou_span_a <= 11.2527 )
									ret := 0.948718 // buy
								if( senkou_span_a > 11.2527 )
									ret := 0.200000
							if( senkou_span_b_displaced > 11.0124 )
								if( senkou_span_a <= 11.0191 )
									ret := 0.350000
								if( senkou_span_a > 11.0191 )
									ret := -0.190476
						if( senkou_span_b > 11.3125 )
							if( senkou_span_a_displaced <= 11.8475 )
								if( basis_max <= -0.02275 )
									ret := -0.312500
								if( basis_max > -0.02275 )
									ret := 0.691892
							if( senkou_span_a_displaced > 11.8475 )
								if( senkou_span_a <= 11.16 )
									ret := -0.800000 // sell
								if( senkou_span_a > 11.16 )
									ret := 0.000000
			if( tenkan_sen > 11.2226 )
				if( chinkou_span <= 11.0505 )
					if( senkou_span_b <= 11.8504 )
						if( senkou_span_a <= 11.4859 )
							if( chinkou_span <= 10.8928 )
								if( tenkan_sen <= 11.2923 )
									ret := -0.681034
								if( tenkan_sen > 11.2923 )
									ret := -0.894737 // sell
							if( chinkou_span > 10.8928 )
								if( senkou_span_a <= 11.3062 )
									ret := -0.252252
								if( senkou_span_a > 11.3062 )
									ret := -0.668712
						if( senkou_span_a > 11.4859 )
							if( basis_max <= 0.049466 )
								if( senkou_span_b <= 11.4231 )
									ret := 0.440000
								if( senkou_span_b > 11.4231 )
									ret := -0.671053
							if( basis_max > 0.049466 )
								if( senkou_span_a <= 11.8402 )
									ret := 1.000000 // buy
								if( senkou_span_a > 11.8402 )
									ret := -1.000000 // sell
					if( senkou_span_b > 11.8504 )
						if( kinjun_sen <= 11.5656 )
							ret := -0.250000
						if( kinjun_sen > 11.5656 )
							if( tenkan_sen <= 11.5247 )
								if( senkou_span_a <= 11.4589 )
									ret := -1.000000 // sell
								if( senkou_span_a > 11.4589 )
									ret := -0.250000
							if( tenkan_sen > 11.5247 )
								if( tenkan_sen <= 11.8963 )
									ret := -0.941176 // sell
								if( tenkan_sen > 11.8963 )
									ret := -1.000000 // sell
				if( chinkou_span > 11.0505 )
					if( senkou_span_b <= 11.0858 )
						if( kinjun_sen <= 11.3186 )
							if( senkou_span_a_displaced <= 10.8072 )
								ret := -0.666667
							if( senkou_span_a_displaced > 10.8072 )
								if( senkou_span_a_displaced <= 10.9507 )
									ret := 0.687500
								if( senkou_span_a_displaced > 10.9507 )
									ret := -0.055556
						if( kinjun_sen > 11.3186 )
							ret := 1.000000 // buy
					if( senkou_span_b > 11.0858 )
						if( basis_minus <= -0.128782 )
							if( senkou_span_b_displaced <= 11.8375 )
								if( senkou_span_a_displaced <= 12.1268 )
									ret := 0.384615
								if( senkou_span_a_displaced > 12.1268 )
									ret := -0.833333 // sell
							if( senkou_span_b_displaced > 11.8375 )
								if( kinjun_sen <= 11.729 )
									ret := -0.680851
								if( kinjun_sen > 11.729 )
									ret := 0.137255
						if( basis_minus > -0.128782 )
							if( senkou_span_a <= 11.3171 )
								if( basis_minus <= -0.0505 )
									ret := 0.464286
								if( basis_minus > -0.0505 )
									ret := -0.266254
							if( senkou_span_a > 11.3171 )
								if( senkou_span_a_displaced <= 12.0731 )
									ret := -0.500832
								if( senkou_span_a_displaced > 12.0731 )
									ret := 1.000000 // buy
		if( chinkou_span > 11.2431 )
			if( tenkan_sen <= 11.4408 )
				if( senkou_span_a <= 11.2843 )
					if( chinkou_span <= 11.3642 )
						if( senkou_span_a <= 11.067 )
							if( senkou_span_b <= 11.163 )
								if( senkou_span_a_displaced <= 10.606 )
									ret := 0.389831
								if( senkou_span_a_displaced > 10.606 )
									ret := 0.676349
							if( senkou_span_b > 11.163 )
								if( senkou_span_b <= 11.2317 )
									ret := -0.650000
								if( senkou_span_b > 11.2317 )
									ret := 0.400000
						if( senkou_span_a > 11.067 )
							if( senkou_span_b_displaced <= 10.8682 )
								if( chinkou_span <= 11.2545 )
									ret := 0.750000 // buy
								if( chinkou_span > 11.2545 )
									ret := -0.424242
							if( senkou_span_b_displaced > 10.8682 )
								if( senkou_span_b <= 11.2973 )
									ret := 0.311065
								if( senkou_span_b > 11.2973 )
									ret := -0.007353
					if( chinkou_span > 11.3642 )
						if( senkou_span_a_displaced <= 10.4982 )
							if( basis_max <= -0.081885 )
								if( senkou_span_b_displaced <= 10.401 )
									ret := 0.295455
								if( senkou_span_b_displaced > 10.401 )
									ret := -0.553191
							if( basis_max > -0.081885 )
								if( senkou_span_a_displaced <= 10.3713 )
									ret := 0.833333 // buy
								if( senkou_span_a_displaced > 10.3713 )
									ret := -0.833333 // sell
						if( senkou_span_a_displaced > 10.4982 )
							if( tenkan_sen <= 11.01 )
								if( senkou_span_b_displaced <= 11.5758 )
									ret := 0.869919 // buy
								if( senkou_span_b_displaced > 11.5758 )
									ret := 0.400000
							if( tenkan_sen > 11.01 )
								if( senkou_span_b <= 11.4762 )
									ret := 0.533769
								if( senkou_span_b > 11.4762 )
									ret := -0.315789
				if( senkou_span_a > 11.2843 )
					if( chinkou_span <= 11.4671 )
						if( chinkou_span <= 11.3117 )
							if( senkou_span_a_displaced <= 12.0213 )
								if( senkou_span_b_displaced <= 11.8806 )
									ret := -0.220339
								if( senkou_span_b_displaced > 11.8806 )
									ret := -0.812500 // sell
							if( senkou_span_a_displaced > 12.0213 )
								if( tenkan_sen <= 11.3477 )
									ret := 1.000000 // buy
								if( tenkan_sen > 11.3477 )
									ret := 0.750000 // buy
						if( chinkou_span > 11.3117 )
							if( senkou_span_b <= 11.3387 )
								if( basis_max <= -0.060487 )
									ret := 0.409091
								if( basis_max > -0.060487 )
									ret := -0.142132
							if( senkou_span_b > 11.3387 )
								if( senkou_span_b_displaced <= 11.3986 )
									ret := 0.514286
								if( senkou_span_b_displaced > 11.3986 )
									ret := 0.155405
					if( chinkou_span > 11.4671 )
						if( senkou_span_b <= 11.1071 )
							if( senkou_span_a <= 11.3482 )
								if( chinkou_span <= 12.15 )
									ret := 0.214286
								if( chinkou_span > 12.15 )
									ret := 1.000000 // buy
							if( senkou_span_a > 11.3482 )
								if( chinkou_span <= 11.608 )
									ret := 0.166667
								if( chinkou_span > 11.608 )
									ret := -1.000000 // sell
						if( senkou_span_b > 11.1071 )
							if( senkou_span_b <= 11.29 )
								if( chinkou_span <= 11.7915 )
									ret := 0.600000
								if( chinkou_span > 11.7915 )
									ret := 0.925000 // buy
							if( senkou_span_b > 11.29 )
								if( chinkou_span <= 11.5618 )
									ret := 0.221591
								if( chinkou_span > 11.5618 )
									ret := 0.590258
			if( tenkan_sen > 11.4408 )
				if( chinkou_span <= 11.8093 )
					if( tenkan_sen <= 11.7387 )
						if( senkou_span_a_displaced <= 11.9358 )
							if( senkou_span_b_displaced <= 11.3413 )
								if( senkou_span_b <= 11.2413 )
									ret := -0.263158
								if( senkou_span_b > 11.2413 )
									ret := 0.236364
							if( senkou_span_b_displaced > 11.3413 )
								if( chinkou_span <= 11.5939 )
									ret := -0.230140
								if( chinkou_span > 11.5939 )
									ret := 0.123145
						if( senkou_span_a_displaced > 11.9358 )
							if( basis_max <= 0.013867 )
								if( chinkou_span <= 11.4406 )
									ret := 0.312500
								if( chinkou_span > 11.4406 )
									ret := -0.782609 // sell
							if( basis_max > 0.013867 )
								if( basis_minus <= -0.12905 )
									ret := 0.156716
								if( basis_minus > -0.12905 )
									ret := 0.621118
					if( tenkan_sen > 11.7387 )
						if( basis_max <= 0.05856 )
							if( tenkan_sen <= 12.0847 )
								if( chinkou_span <= 11.7109 )
									ret := -0.424939
								if( chinkou_span > 11.7109 )
									ret := -0.087379
							if( tenkan_sen > 12.0847 )
								if( basis_max <= 0.052824 )
									ret := -0.697842
								if( basis_max > 0.052824 )
									ret := 0.400000
						if( basis_max > 0.05856 )
							if( basis_minus <= -0.075625 )
								if( senkou_span_b <= 11.971 )
									ret := -0.678571
								if( senkou_span_b > 11.971 )
									ret := 0.083333
							if( basis_minus > -0.075625 )
								if( senkou_span_a_displaced <= 12.2117 )
									ret := 0.561404
								if( senkou_span_a_displaced > 12.2117 )
									ret := -0.833333 // sell
				if( chinkou_span > 11.8093 )
					if( tenkan_sen <= 11.9929 )
						if( senkou_span_a <= 11.7756 )
							if( chinkou_span <= 12.1452 )
								if( senkou_span_b <= 11.6036 )
									ret := 0.576233
								if( senkou_span_b > 11.6036 )
									ret := 0.370813
							if( chinkou_span > 12.1452 )
								if( tenkan_sen <= 11.8632 )
									ret := 0.795455 // buy
								if( tenkan_sen > 11.8632 )
									ret := -1.000000 // sell
						if( senkou_span_a > 11.7756 )
							if( chinkou_span <= 11.9155 )
								if( senkou_span_b_displaced <= 11.1584 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 11.1584 )
									ret := -0.106918
							if( chinkou_span > 11.9155 )
								if( kinjun_sen <= 11.7938 )
									ret := 0.065990
								if( kinjun_sen > 11.7938 )
									ret := 0.443839
					if( tenkan_sen > 11.9929 )
						if( chinkou_span <= 12.6953 )
							if( senkou_span_a <= 12.7402 )
								if( chinkou_span <= 12.133 )
									ret := -0.228365
								if( chinkou_span > 12.133 )
									ret := 0.053709
							if( senkou_span_a > 12.7402 )
								if( basis_minus <= -0.138125 )
									ret := 0.044025
								if( basis_minus > -0.138125 )
									ret := -0.592742
						if( chinkou_span > 12.6953 )
							if( tenkan_sen <= 12.8886 )
								if( chinkou_span <= 12.8793 )
									ret := 0.257426
								if( chinkou_span > 12.8793 )
									ret := 0.553727
							if( tenkan_sen > 12.8886 )
								if( chinkou_span <= 13.667 )
									ret := -0.013629
								if( chinkou_span > 13.667 )
									ret := 0.219753
	if( senkou_span_a_displaced > 14.635 )
		if( chinkou_span <= 14.5467 )
			if( basis_minus <= -0.412625 )
				if( chinkou_span <= 13.8953 )
					if( basis_minus <= -0.501375 )
						ret := -0.250000
					if( basis_minus > -0.501375 )
						if( senkou_span_a_displaced <= 15.1792 )
							ret := 0.500000
						if( senkou_span_a_displaced > 15.1792 )
							ret := 1.000000 // buy
				if( chinkou_span > 13.8953 )
					if( senkou_span_a <= 14.133 )
						if( senkou_span_a <= 13.9857 )
							ret := -0.500000
						if( senkou_span_a > 13.9857 )
							if( kinjun_sen <= 14.148 )
								if( basis_max <= 0.007 )
									ret := 0.500000
								if( basis_max > 0.007 )
									ret := 0.800000 // buy
							if( kinjun_sen > 14.148 )
								ret := 0.000000
					if( senkou_span_a > 14.133 )
						if( senkou_span_b_displaced <= 15.2617 )
							if( kinjun_sen <= 14.3103 )
								if( tenkan_sen <= 14.1892 )
									ret := -1.000000 // sell
								if( tenkan_sen > 14.1892 )
									ret := -0.800000 // sell
							if( kinjun_sen > 14.3103 )
								ret := -0.600000
						if( senkou_span_b_displaced > 15.2617 )
							if( senkou_span_b_displaced <= 15.6564 )
								if( tenkan_sen <= 14.5484 )
									ret := 1.000000 // buy
								if( tenkan_sen > 14.5484 )
									ret := 0.500000
							if( senkou_span_b_displaced > 15.6564 )
								if( basis_minus <= -0.452568 )
									ret := -0.909091 // sell
								if( basis_minus > -0.452568 )
									ret := -0.166667
			if( basis_minus > -0.412625 )
				if( tenkan_sen <= 14.8247 )
					if( basis_minus <= -0.048346 )
						if( basis_max <= 0.050453 )
							if( kinjun_sen <= 14.5807 )
								if( chinkou_span <= 14.4692 )
									ret := -0.906667 // sell
								if( chinkou_span > 14.4692 )
									ret := -0.250000
							if( kinjun_sen > 14.5807 )
								if( senkou_span_a <= 14.6382 )
									ret := -0.157895
								if( senkou_span_a > 14.6382 )
									ret := -0.824561 // sell
						if( basis_max > 0.050453 )
							if( chinkou_span <= 14.3219 )
								if( senkou_span_b <= 14.3856 )
									ret := -0.973684 // sell
								if( senkou_span_b > 14.3856 )
									ret := -0.392593
							if( chinkou_span > 14.3219 )
								if( kinjun_sen <= 14.41 )
									ret := 0.000000
								if( kinjun_sen > 14.41 )
									ret := 0.666667
					if( basis_minus > -0.048346 )
						if( basis_max <= 0.002378 )
							if( senkou_span_a <= 14.8115 )
								if( basis_max <= -0.008327 )
									ret := -1.000000 // sell
								if( basis_max > -0.008327 )
									ret := -0.333333
							if( senkou_span_a > 14.8115 )
								ret := 0.400000
						if( basis_max > 0.002378 )
							if( kinjun_sen <= 14.7413 )
								ret := -0.200000
							if( kinjun_sen > 14.7413 )
								if( basis_minus <= 0.034436 )
									ret := 1.000000 // buy
								if( basis_minus > 0.034436 )
									ret := 0.500000
				if( tenkan_sen > 14.8247 )
					if( senkou_span_b_displaced <= 15.7183 )
						if( tenkan_sen <= 15.8689 )
							if( chinkou_span <= 14.334 )
								if( chinkou_span <= 14.1035 )
									ret := -0.920000 // sell
								if( chinkou_span > 14.1035 )
									ret := -0.981481 // sell
							if( chinkou_span > 14.334 )
								if( tenkan_sen <= 15.177 )
									ret := -0.933333 // sell
								if( tenkan_sen > 15.177 )
									ret := -0.416667
						if( tenkan_sen > 15.8689 )
							ret := -0.200000
					if( senkou_span_b_displaced > 15.7183 )
						ret := -0.166667
		if( chinkou_span > 14.5467 )
			if( basis_max <= 0.063588 )
				if( kinjun_sen <= 18.1566 )
					if( chinkou_span <= 18.4165 )
						if( basis_max <= -0.009584 )
							if( senkou_span_b_displaced <= 15.0546 )
								if( tenkan_sen <= 15.1461 )
									ret := -0.216981
								if( tenkan_sen > 15.1461 )
									ret := -0.800000 // sell
							if( senkou_span_b_displaced > 15.0546 )
								if( tenkan_sen <= 16.063 )
									ret := 0.129568
								if( tenkan_sen > 16.063 )
									ret := -0.387909
						if( basis_max > -0.009584 )
							if( basis_minus <= 0.286359 )
								if( chinkou_span <= 15.3396 )
									ret := -0.134737
								if( chinkou_span > 15.3396 )
									ret := 0.149148
							if( basis_minus > 0.286359 )
								if( chinkou_span <= 15.9086 )
									ret := 0.250000
								if( chinkou_span > 15.9086 )
									ret := 0.967742 // buy
					if( chinkou_span > 18.4165 )
						if( kinjun_sen <= 17.6675 )
							if( senkou_span_a_displaced <= 17.7755 )
								ret := -0.250000
							if( senkou_span_a_displaced > 17.7755 )
								ret := -1.000000 // sell
						if( kinjun_sen > 17.6675 )
							if( tenkan_sen <= 18.16 )
								if( senkou_span_a <= 18.0711 )
									ret := 0.886364 // buy
								if( senkou_span_a > 18.0711 )
									ret := 1.000000 // buy
							if( tenkan_sen > 18.16 )
								if( senkou_span_b_displaced <= 17.8439 )
									ret := 0.928571 // buy
								if( senkou_span_b_displaced > 17.8439 )
									ret := 0.000000
				if( kinjun_sen > 18.1566 )
					if( chinkou_span <= 19.5583 )
						if( cross_dn_tenkan_kinjunInt <= 0.5 )
							if( senkou_span_b_displaced <= 18.0661 )
								if( senkou_span_a_displaced <= 18.0213 )
									ret := -0.500000
								if( senkou_span_a_displaced > 18.0213 )
									ret := -0.921348 // sell
							if( senkou_span_b_displaced > 18.0661 )
								if( basis_minus <= 0.163967 )
									ret := -0.693750
								if( basis_minus > 0.163967 )
									ret := -0.058824
						if( cross_dn_tenkan_kinjunInt > 0.5 )
							ret := 0.500000
					if( chinkou_span > 19.5583 )
						if( tenkan_sen <= 20.1372 )
							if( senkou_span_b_displaced <= 17.8414 )
								if( basis_minus <= 0.114784 )
									ret := 0.000000
								if( basis_minus > 0.114784 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 17.8414 )
								if( basis_minus <= 0.145614 )
									ret := 0.875000 // buy
								if( basis_minus > 0.145614 )
									ret := 0.279070
						if( tenkan_sen > 20.1372 )
							if( basis_max <= -0.022283 )
								if( senkou_span_a <= 20.0839 )
									ret := 0.111111
								if( senkou_span_a > 20.0839 )
									ret := -0.795181 // sell
							if( basis_max > -0.022283 )
								if( basis_minus <= -0.086527 )
									ret := 0.113636
								if( basis_minus > -0.086527 )
									ret := -0.464789
			if( basis_max > 0.063588 )
				if( senkou_span_a_displaced <= 15.5584 )
					if( basis_max <= 0.081375 )
						if( senkou_span_a_displaced <= 14.9846 )
							if( chinkou_span <= 15.0465 )
								if( senkou_span_a_displaced <= 14.814 )
									ret := 0.500000
								if( senkou_span_a_displaced > 14.814 )
									ret := 0.000000
							if( chinkou_span > 15.0465 )
								ret := -0.750000 // sell
						if( senkou_span_a_displaced > 14.9846 )
							if( chinkou_span <= 14.7114 )
								ret := 0.857143 // buy
							if( chinkou_span > 14.7114 )
								if( senkou_span_b <= 15.3338 )
									ret := 0.100000
								if( senkou_span_b > 15.3338 )
									ret := 0.750000 // buy
					if( basis_max > 0.081375 )
						if( senkou_span_a_displaced <= 15.5405 )
							if( senkou_span_a_displaced <= 15.1237 )
								if( senkou_span_a_displaced <= 14.9429 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 14.9429 )
									ret := 0.250000
							if( senkou_span_a_displaced > 15.1237 )
								if( chinkou_span <= 15.4341 )
									ret := 0.833333 // buy
								if( chinkou_span > 15.4341 )
									ret := 1.000000 // buy
						if( senkou_span_a_displaced > 15.5405 )
							if( basis_max <= 0.120198 )
								ret := 0.000000
							if( basis_max > 0.120198 )
								if( chinkou_span <= 16.13 )
									ret := 0.833333 // buy
								if( chinkou_span > 16.13 )
									ret := 0.500000
				if( senkou_span_a_displaced > 15.5584 )
					if( chinkou_span <= 14.6769 )
						if( senkou_span_a <= 15.4052 )
							if( basis_minus <= -0.319565 )
								ret := 0.250000
							if( basis_minus > -0.319565 )
								ret := 0.750000 // buy
						if( senkou_span_a > 15.4052 )
							ret := -1.000000 // sell
					if( chinkou_span > 14.6769 )
						if( kinjun_sen <= 19.8297 )
							if( tenkan_sen <= 17.9856 )
								if( senkou_span_a_displaced <= 18.0269 )
									ret := 0.175258
								if( senkou_span_a_displaced > 18.0269 )
									ret := 0.588235
							if( tenkan_sen > 17.9856 )
								if( basis_max <= 0.110837 )
									ret := -0.112676
								if( basis_max > 0.110837 )
									ret := -0.833333 // sell
						if( kinjun_sen > 19.8297 )
							if( basis_max <= 0.093979 )
								if( basis_minus <= -0.102637 )
									ret := 0.800000 // buy
								if( basis_minus > -0.102637 )
									ret := 0.500000
							if( basis_max > 0.093979 )
								if( tenkan_sen <= 20.119 )
									ret := 0.800000 // buy
								if( tenkan_sen > 20.119 )
									ret := -0.076923
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_9416088d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


