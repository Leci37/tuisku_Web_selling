//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: FFIV_15Min_1ICH_13e886ac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1ICH_13e886ac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_13e886ac(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a <= 143.018 )
		if( basis_max <= -1.39253 )
			if( senkou_span_a <= 110.423 )
				if( senkou_span_b_displaced <= 88.0906 )
					if( senkou_span_b_displaced <= 87.6746 )
						if( kinjun_sen <= 93.9406 )
							ret := 0.000000
						if( kinjun_sen > 93.9406 )
							ret := 1.000000 // buy
					if( senkou_span_b_displaced > 87.6746 )
						ret := -0.400000
				if( senkou_span_b_displaced > 88.0906 )
					ret := 1.000000 // buy
			if( senkou_span_a > 110.423 )
				if( senkou_span_a_displaced <= 124.219 )
					ret := -1.000000 // sell
				if( senkou_span_a_displaced > 124.219 )
					if( senkou_span_a <= 142.444 )
						if( basis_minus <= 1.47687 )
							if( senkou_span_b_displaced <= 134.057 )
								ret := 0.500000
							if( senkou_span_b_displaced > 134.057 )
								if( basis_max <= -1.51188 )
									ret := -0.250000
								if( basis_max > -1.51188 )
									ret := 0.000000
						if( basis_minus > 1.47687 )
							if( chinkou_span <= 135.895 )
								ret := 0.000000
							if( chinkou_span > 135.895 )
								if( senkou_span_b <= 138.713 )
									ret := 0.848485 // buy
								if( senkou_span_b > 138.713 )
									ret := 0.555556
					if( senkou_span_a > 142.444 )
						ret := -0.750000 // sell
		if( basis_max > -1.39253 )
			if( chinkou_span <= 141.94 )
				if( tenkan_sen <= 139.662 )
					if( chinkou_span <= 139.339 )
						if( tenkan_sen <= 138.339 )
							if( chinkou_span <= 135.471 )
								if( tenkan_sen <= 133.073 )
									ret := 0.065973
								if( tenkan_sen > 133.073 )
									ret := -0.272569
							if( chinkou_span > 135.471 )
								if( tenkan_sen <= 136.024 )
									ret := 0.494241
								if( tenkan_sen > 136.024 )
									ret := 0.171365
						if( tenkan_sen > 138.339 )
							if( senkou_span_a_displaced <= 148.811 )
								if( chinkou_span <= 138.16 )
									ret := -0.458774
								if( chinkou_span > 138.16 )
									ret := -0.117512
							if( senkou_span_a_displaced > 148.811 )
								ret := 1.000000 // buy
					if( chinkou_span > 139.339 )
						if( senkou_span_b_displaced <= 147.501 )
							if( basis_minus <= -0.32076 )
								if( basis_minus <= -2.87565 )
									ret := 0.031250
								if( basis_minus > -2.87565 )
									ret := 0.636525
							if( basis_minus > -0.32076 )
								if( chinkou_span <= 140.777 )
									ret := 0.292308
								if( chinkou_span > 140.777 )
									ret := 0.576577
						if( senkou_span_b_displaced > 147.501 )
							if( basis_max <= 1.71022 )
								ret := -0.666667
							if( basis_max > 1.71022 )
								ret := -1.000000 // sell
				if( tenkan_sen > 139.662 )
					if( basis_minus <= 2.15 )
						if( senkou_span_a_displaced <= 139.021 )
							if( tenkan_sen <= 140.01 )
								if( chinkou_span <= 141.036 )
									ret := -0.851485 // sell
								if( chinkou_span > 141.036 )
									ret := 0.047619
							if( tenkan_sen > 140.01 )
								if( senkou_span_b <= 139.288 )
									ret := -0.067961
								if( senkou_span_b > 139.288 )
									ret := -0.589744
						if( senkou_span_a_displaced > 139.021 )
							if( kinjun_sen <= 139.145 )
								if( senkou_span_b <= 139.49 )
									ret := 1.000000 // buy
								if( senkou_span_b > 139.49 )
									ret := 0.700000 // buy
							if( kinjun_sen > 139.145 )
								if( chinkou_span <= 139.67 )
									ret := -0.353073
								if( chinkou_span > 139.67 )
									ret := -0.047252
					if( basis_minus > 2.15 )
						if( basis_max <= -0.16375 )
							if( chinkou_span <= 141.384 )
								if( senkou_span_b_displaced <= 138.6 )
									ret := -0.500000
								if( senkou_span_b_displaced > 138.6 )
									ret := 0.411765
							if( chinkou_span > 141.384 )
								if( senkou_span_b_displaced <= 136.081 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 136.081 )
									ret := -0.400000
						if( basis_max > -0.16375 )
							if( senkou_span_a_displaced <= 138.489 )
								if( chinkou_span <= 140.112 )
									ret := 0.750000 // buy
								if( chinkou_span > 140.112 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 138.489 )
								ret := 0.250000
			if( chinkou_span > 141.94 )
				if( senkou_span_a <= 141.457 )
					if( senkou_span_b <= 137.214 )
						if( senkou_span_b <= 127.868 )
							if( kinjun_sen <= 128.3 )
								ret := 0.750000 // buy
							if( kinjun_sen > 128.3 )
								ret := 0.000000
						if( senkou_span_b > 127.868 )
							if( tenkan_sen <= 139.682 )
								if( senkou_span_a <= 135.182 )
									ret := 1.000000 // buy
								if( senkou_span_a > 135.182 )
									ret := 0.879121 // buy
							if( tenkan_sen > 139.682 )
								ret := 0.250000
					if( senkou_span_b > 137.214 )
						if( senkou_span_a_displaced <= 138.085 )
							if( kinjun_sen <= 136.535 )
								if( kinjun_sen <= 136.02 )
									ret := -0.500000
								if( kinjun_sen > 136.02 )
									ret := -0.857143 // sell
							if( kinjun_sen > 136.535 )
								if( senkou_span_a <= 138.933 )
									ret := 0.568627
								if( senkou_span_a > 138.933 )
									ret := 0.065217
						if( senkou_span_a_displaced > 138.085 )
							if( tenkan_sen <= 135.993 )
								if( basis_max <= 0.574913 )
									ret := -0.750000 // sell
								if( basis_max > 0.574913 )
									ret := 0.000000
							if( tenkan_sen > 135.993 )
								if( basis_max <= -0.666875 )
									ret := -0.076923
								if( basis_max > -0.666875 )
									ret := 0.641582
				if( senkou_span_a > 141.457 )
					if( chinkou_span <= 143.321 )
						if( kinjun_sen <= 142.562 )
							if( basis_max <= 0.182988 )
								if( tenkan_sen <= 142.451 )
									ret := -0.023585
								if( tenkan_sen > 142.451 )
									ret := 0.358108
							if( basis_max > 0.182988 )
								if( basis_minus <= -0.199375 )
									ret := 0.850000 // buy
								if( basis_minus > -0.199375 )
									ret := 0.333333
						if( kinjun_sen > 142.562 )
							if( kinjun_sen <= 143.118 )
								if( basis_max <= -0.01944 )
									ret := 0.309524
								if( basis_max > -0.01944 )
									ret := -0.445205
							if( kinjun_sen > 143.118 )
								if( chinkou_span <= 143.202 )
									ret := 0.297297
								if( chinkou_span > 143.202 )
									ret := 1.000000 // buy
					if( chinkou_span > 143.321 )
						if( chinkou_span <= 146.7 )
							if( basis_max <= 0.001559 )
								if( senkou_span_b_displaced <= 143.437 )
									ret := 0.400932
								if( senkou_span_b_displaced > 143.437 )
									ret := -0.320000
							if( basis_max > 0.001559 )
								if( senkou_span_a <= 142.193 )
									ret := 0.728261 // buy
								if( senkou_span_a > 142.193 )
									ret := 0.363636
						if( chinkou_span > 146.7 )
							if( kinjun_sen <= 142.6 )
								if( kinjun_sen <= 142.558 )
									ret := 0.804348 // buy
								if( kinjun_sen > 142.558 )
									ret := 0.000000
							if( kinjun_sen > 142.6 )
								if( senkou_span_a <= 142.927 )
									ret := 1.000000 // buy
								if( senkou_span_a > 142.927 )
									ret := 0.750000 // buy
	if( senkou_span_a > 143.018 )
		if( chinkou_span <= 143.139 )
			if( tenkan_sen <= 144.483 )
				if( chinkou_span <= 140.897 )
					if( senkou_span_b_displaced <= 142.242 )
						if( kinjun_sen <= 143.733 )
							ret := -1.000000 // sell
						if( kinjun_sen > 143.733 )
							if( senkou_span_a <= 143.992 )
								ret := -0.250000
							if( senkou_span_a > 143.992 )
								if( senkou_span_b <= 143.386 )
									ret := 1.000000 // buy
								if( senkou_span_b > 143.386 )
									ret := 0.555556
					if( senkou_span_b_displaced > 142.242 )
						if( senkou_span_b <= 144.455 )
							if( senkou_span_a <= 144.08 )
								if( senkou_span_b_displaced <= 143.115 )
									ret := -0.941176 // sell
								if( senkou_span_b_displaced > 143.115 )
									ret := -0.690476
							if( senkou_span_a > 144.08 )
								if( tenkan_sen <= 144.107 )
									ret := 0.400000
								if( tenkan_sen > 144.107 )
									ret := -0.411765
						if( senkou_span_b > 144.455 )
							if( chinkou_span <= 139.375 )
								ret := -1.000000 // sell
							if( chinkou_span > 139.375 )
								if( tenkan_sen <= 143.829 )
									ret := -0.400000
								if( tenkan_sen > 143.829 )
									ret := -1.000000 // sell
				if( chinkou_span > 140.897 )
					if( basis_max <= 0.631875 )
						if( basis_max <= -0.12625 )
							if( basis_minus <= 0.842571 )
								if( senkou_span_b_displaced <= 145.213 )
									ret := -0.763636 // sell
								if( senkou_span_b_displaced > 145.213 )
									ret := 0.333333
							if( basis_minus > 0.842571 )
								if( senkou_span_b <= 141.733 )
									ret := -0.629630
								if( senkou_span_b > 141.733 )
									ret := -0.018868
						if( basis_max > -0.12625 )
							if( basis_minus <= -0.164917 )
								if( senkou_span_a_displaced <= 146.098 )
									ret := 0.138728
								if( senkou_span_a_displaced > 146.098 )
									ret := -0.525000
							if( basis_minus > -0.164917 )
								if( senkou_span_b_displaced <= 143.798 )
									ret := -0.114286
								if( senkou_span_b_displaced > 143.798 )
									ret := -0.745455 // sell
					if( basis_max > 0.631875 )
						if( basis_minus <= -1.2369 )
							if( senkou_span_a_displaced <= 148.476 )
								if( senkou_span_b_displaced <= 147.238 )
									ret := 0.000000
								if( senkou_span_b_displaced > 147.238 )
									ret := 0.250000
							if( senkou_span_a_displaced > 148.476 )
								ret := -0.500000
						if( basis_minus > -1.2369 )
							if( senkou_span_a_displaced <= 145.4 )
								if( senkou_span_a_displaced <= 141.604 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 141.604 )
									ret := 0.125000
							if( senkou_span_a_displaced > 145.4 )
								if( senkou_span_a_displaced <= 147.931 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 147.931 )
									ret := 0.500000
			if( tenkan_sen > 144.483 )
				if( kinjun_sen <= 145.404 )
					if( senkou_span_a_displaced <= 143.114 )
						if( senkou_span_b <= 143.308 )
							if( senkou_span_a_displaced <= 130.633 )
								ret := -0.200000
							if( senkou_span_a_displaced > 130.633 )
								if( tenkan_sen <= 144.512 )
									ret := -0.250000
								if( tenkan_sen > 144.512 )
									ret := -0.875000 // sell
						if( senkou_span_b > 143.308 )
							if( tenkan_sen <= 144.975 )
								if( senkou_span_a_displaced <= 142.796 )
									ret := 0.000000
								if( senkou_span_a_displaced > 142.796 )
									ret := 0.500000
							if( tenkan_sen > 144.975 )
								if( tenkan_sen <= 145.478 )
									ret := -0.500000
								if( tenkan_sen > 145.478 )
									ret := 0.000000
					if( senkou_span_a_displaced > 143.114 )
						if( chinkou_span <= 140.031 )
							if( basis_minus <= 0.126927 )
								if( basis_minus <= -0.05625 )
									ret := -1.000000 // sell
								if( basis_minus > -0.05625 )
									ret := 0.000000
							if( basis_minus > 0.126927 )
								ret := -1.000000 // sell
						if( chinkou_span > 140.031 )
							if( tenkan_sen <= 144.865 )
								if( senkou_span_a_displaced <= 144.003 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 144.003 )
									ret := -0.186047
							if( tenkan_sen > 144.865 )
								if( chinkou_span <= 141.085 )
									ret := -0.142857
								if( chinkou_span > 141.085 )
									ret := -0.858696 // sell
				if( kinjun_sen > 145.404 )
					if( kinjun_sen <= 146.262 )
						if( senkou_span_a_displaced <= 147.244 )
							if( senkou_span_b_displaced <= 143.429 )
								if( basis_max <= -1.66 )
									ret := -0.500000
								if( basis_max > -1.66 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 143.429 )
								if( kinjun_sen <= 146.15 )
									ret := -0.449275
								if( kinjun_sen > 146.15 )
									ret := 0.400000
						if( senkou_span_a_displaced > 147.244 )
							if( senkou_span_a_displaced <= 147.852 )
								if( chinkou_span <= 143.115 )
									ret := 0.807692 // buy
								if( chinkou_span > 143.115 )
									ret := -0.250000
							if( senkou_span_a_displaced > 147.852 )
								if( basis_max <= 0.365012 )
									ret := -0.166667
								if( basis_max > 0.365012 )
									ret := -0.500000
					if( kinjun_sen > 146.262 )
						if( tenkan_sen <= 149.93 )
							if( senkou_span_b_displaced <= 152.578 )
								if( senkou_span_a <= 148.124 )
									ret := -0.633962
								if( senkou_span_a > 148.124 )
									ret := -0.936508 // sell
							if( senkou_span_b_displaced > 152.578 )
								if( senkou_span_b <= 150.869 )
									ret := 0.045455
								if( senkou_span_b > 150.869 )
									ret := -0.769231 // sell
						if( tenkan_sen > 149.93 )
							if( senkou_span_b <= 149.206 )
								if( tenkan_sen <= 151.024 )
									ret := 0.888889 // buy
								if( tenkan_sen > 151.024 )
									ret := 0.000000
							if( senkou_span_b > 149.206 )
								if( kinjun_sen <= 151.122 )
									ret := -0.500000
								if( kinjun_sen > 151.122 )
									ret := -1.000000 // sell
		if( chinkou_span > 143.139 )
			if( tenkan_sen <= 146.03 )
				if( chinkou_span <= 146.28 )
					if( kinjun_sen <= 143.862 )
						if( chinkou_span <= 144.607 )
							if( senkou_span_b_displaced <= 145.894 )
								if( senkou_span_b_displaced <= 141.656 )
									ret := 0.424658
								if( senkou_span_b_displaced > 141.656 )
									ret := -0.200000
							if( senkou_span_b_displaced > 145.894 )
								if( chinkou_span <= 144.18 )
									ret := 0.863636 // buy
								if( chinkou_span > 144.18 )
									ret := 0.444444
						if( chinkou_span > 144.607 )
							if( senkou_span_b_displaced <= 145.436 )
								if( tenkan_sen <= 144.833 )
									ret := 0.486405
								if( tenkan_sen > 144.833 )
									ret := -0.181818
							if( senkou_span_b_displaced > 145.436 )
								if( senkou_span_b <= 144.424 )
									ret := -0.521739
								if( senkou_span_b > 144.424 )
									ret := 0.500000
					if( kinjun_sen > 143.862 )
						if( basis_minus <= -0.2325 )
							if( kinjun_sen <= 144.426 )
								if( senkou_span_b_displaced <= 145.702 )
									ret := 0.597701
								if( senkou_span_b_displaced > 145.702 )
									ret := 0.208333
							if( kinjun_sen > 144.426 )
								if( senkou_span_a <= 145.897 )
									ret := 0.021359
								if( senkou_span_a > 145.897 )
									ret := 0.532468
						if( basis_minus > -0.2325 )
							if( senkou_span_b <= 145.997 )
								if( basis_minus <= 1.76338 )
									ret := -0.060389
								if( basis_minus > 1.76338 )
									ret := -0.666667
							if( senkou_span_b > 145.997 )
								if( basis_max <= 0.356875 )
									ret := -0.637681
								if( basis_max > 0.356875 )
									ret := 0.363636
				if( chinkou_span > 146.28 )
					if( chinkou_span <= 147.821 )
						if( senkou_span_a_displaced <= 143.239 )
							if( senkou_span_a <= 145.219 )
								if( senkou_span_a_displaced <= 142.889 )
									ret := 0.309524
								if( senkou_span_a_displaced > 142.889 )
									ret := -0.333333
							if( senkou_span_a > 145.219 )
								if( senkou_span_b <= 144.669 )
									ret := 0.863636 // buy
								if( senkou_span_b > 144.669 )
									ret := 0.000000
						if( senkou_span_a_displaced > 143.239 )
							if( senkou_span_a_displaced <= 143.663 )
								if( tenkan_sen <= 145.777 )
									ret := 0.806452 // buy
								if( tenkan_sen > 145.777 )
									ret := 0.090909
							if( senkou_span_a_displaced > 143.663 )
								if( basis_max <= 0.28625 )
									ret := 0.309524
								if( basis_max > 0.28625 )
									ret := 0.677686
					if( chinkou_span > 147.821 )
						if( basis_max <= 1.14375 )
							if( kinjun_sen <= 147.092 )
								if( senkou_span_a_displaced <= 146.578 )
									ret := 0.661376
								if( senkou_span_a_displaced > 146.578 )
									ret := 0.865248 // buy
							if( kinjun_sen > 147.092 )
								ret := -0.250000
						if( basis_max > 1.14375 )
							ret := -0.833333 // sell
			if( tenkan_sen > 146.03 )
				if( chinkou_span <= 150.899 )
					if( tenkan_sen <= 147.77 )
						if( chinkou_span <= 147.791 )
							if( senkou_span_b_displaced <= 150.738 )
								if( chinkou_span <= 144.983 )
									ret := -0.346801
								if( chinkou_span > 144.983 )
									ret := -0.061762
							if( senkou_span_b_displaced > 150.738 )
								if( senkou_span_b <= 150.194 )
									ret := 0.489655
								if( senkou_span_b > 150.194 )
									ret := -0.366667
						if( chinkou_span > 147.791 )
							if( tenkan_sen <= 146.82 )
								if( senkou_span_a <= 146.747 )
									ret := 0.380282
								if( senkou_span_a > 146.747 )
									ret := 0.767123 // buy
							if( tenkan_sen > 146.82 )
								if( senkou_span_b_displaced <= 143.85 )
									ret := 0.607143
								if( senkou_span_b_displaced > 143.85 )
									ret := 0.120996
					if( tenkan_sen > 147.77 )
						if( senkou_span_b_displaced <= 149.869 )
							if( kinjun_sen <= 147.925 )
								if( senkou_span_b <= 147.384 )
									ret := -0.311741
								if( senkou_span_b > 147.384 )
									ret := -0.689873
							if( kinjun_sen > 147.925 )
								if( basis_max <= -0.078748 )
									ret := -0.204188
								if( basis_max > -0.078748 )
									ret := 0.068182
						if( senkou_span_b_displaced > 149.869 )
							if( kinjun_sen <= 149.965 )
								if( senkou_span_a_displaced <= 150.882 )
									ret := -0.531034
								if( senkou_span_a_displaced > 150.882 )
									ret := 0.000000
							if( kinjun_sen > 149.965 )
								if( senkou_span_a_displaced <= 149.727 )
									ret := 0.428571
								if( senkou_span_a_displaced > 149.727 )
									ret := -0.584964
				if( chinkou_span > 150.899 )
					if( senkou_span_a <= 151.529 )
						if( chinkou_span <= 151.67 )
							if( basis_minus <= -0.667063 )
								if( basis_minus <= -1.93359 )
									ret := 0.666667
								if( basis_minus > -1.93359 )
									ret := -0.617647
							if( basis_minus > -0.667063 )
								if( tenkan_sen <= 148.157 )
									ret := 0.836735 // buy
								if( tenkan_sen > 148.157 )
									ret := 0.275676
						if( chinkou_span > 151.67 )
							if( basis_minus <= 5.94937 )
								if( senkou_span_b_displaced <= 158.104 )
									ret := 0.646279
								if( senkou_span_b_displaced > 158.104 )
									ret := -0.285714
							if( basis_minus > 5.94937 )
								if( senkou_span_b <= 141.924 )
									ret := 0.000000
								if( senkou_span_b > 141.924 )
									ret := -0.714286 // sell
					if( senkou_span_a > 151.529 )
						if( basis_max <= -1.5597 )
							if( chinkou_span <= 202.103 )
								if( tenkan_sen <= 202.023 )
									ret := -0.370000
								if( tenkan_sen > 202.023 )
									ret := -0.905882 // sell
							if( chinkou_span > 202.103 )
								if( tenkan_sen <= 205.673 )
									ret := 0.687500
								if( tenkan_sen > 205.673 )
									ret := -0.180851
						if( basis_max > -1.5597 )
							if( basis_minus <= -6.21821 )
								if( senkou_span_b <= 185.006 )
									ret := 0.920635 // buy
								if( senkou_span_b > 185.006 )
									ret := 0.414634
							if( basis_minus > -6.21821 )
								if( kinjun_sen <= 154.189 )
									ret := 0.215054
								if( kinjun_sen > 154.189 )
									ret := 0.029300
	
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
float op_operation = decision_tree_0_FFIV_15Min_13e886ac(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


