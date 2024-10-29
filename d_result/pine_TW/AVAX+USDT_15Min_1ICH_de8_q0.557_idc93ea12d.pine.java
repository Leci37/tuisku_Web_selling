//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AVAXUSDT_15Min_1ICH_c93ea12d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_1ICH_c93ea12d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_c93ea12d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b <= 56.4422 )
		if( chinkou_span <= 55.11 )
			if( basis_max <= 0.035001 )
				if( senkou_span_a <= 53.7659 )
					if( senkou_span_b <= 34.3888 )
						if( chinkou_span <= 35.2801 )
							if( basis_minus <= -1.074 )
								if( chinkou_span <= 29.855 )
									ret := -0.685393
								if( chinkou_span > 29.855 )
									ret := 0.600000
							if( basis_minus > -1.074 )
								if( senkou_span_b_displaced <= 34.5075 )
									ret := 0.043655
								if( senkou_span_b_displaced > 34.5075 )
									ret := -0.368000
						if( chinkou_span > 35.2801 )
							if( senkou_span_b_displaced <= 34.725 )
								if( basis_minus <= 0.46952 )
									ret := 0.743682 // buy
								if( basis_minus > 0.46952 )
									ret := 0.311475
							if( senkou_span_b_displaced > 34.725 )
								if( basis_minus <= -0.911369 )
									ret := -0.888889 // sell
								if( basis_minus > -0.911369 )
									ret := 0.000000
					if( senkou_span_b > 34.3888 )
						if( chinkou_span <= 35.4999 )
							if( kinjun_sen <= 34.8925 )
								if( senkou_span_b_displaced <= 34.42 )
									ret := -0.484615
								if( senkou_span_b_displaced > 34.42 )
									ret := 0.007937
							if( kinjun_sen > 34.8925 )
								if( senkou_span_a <= 35.9762 )
									ret := -0.456175
								if( senkou_span_a > 35.9762 )
									ret := -0.759857 // sell
						if( chinkou_span > 35.4999 )
							if( tenkan_sen <= 35.8663 )
								if( chinkou_span <= 35.6261 )
									ret := 0.074766
								if( chinkou_span > 35.6261 )
									ret := 0.474672
							if( tenkan_sen > 35.8663 )
								if( basis_max <= -0.813485 )
									ret := 0.558442
								if( basis_max > -0.813485 )
									ret := -0.005824
				if( senkou_span_a > 53.7659 )
					if( basis_minus <= 0.830698 )
						if( senkou_span_b_displaced <= 54.1678 )
							if( chinkou_span <= 53.1574 )
								if( senkou_span_a_displaced <= 53.9487 )
									ret := -0.928571 // sell
								if( senkou_span_a_displaced > 53.9487 )
									ret := -0.400000
							if( chinkou_span > 53.1574 )
								if( basis_max <= -0.013642 )
									ret := -0.084211
								if( basis_max > -0.013642 )
									ret := 0.379310
						if( senkou_span_b_displaced > 54.1678 )
							if( senkou_span_a_displaced <= 53.8995 )
								if( basis_max <= -0.61 )
									ret := 0.000000
								if( basis_max > -0.61 )
									ret := -0.802817 // sell
							if( senkou_span_a_displaced > 53.8995 )
								if( kinjun_sen <= 54.793 )
									ret := -0.186047
								if( kinjun_sen > 54.793 )
									ret := -0.574074
					if( basis_minus > 0.830698 )
						if( tenkan_sen <= 57.1525 )
							if( senkou_span_a <= 56.8075 )
								if( basis_minus <= 2.64914 )
									ret := -0.853333 // sell
								if( basis_minus > 2.64914 )
									ret := -0.250000
							if( senkou_span_a > 56.8075 )
								ret := -0.250000
						if( tenkan_sen > 57.1525 )
							ret := 0.250000
			if( basis_max > 0.035001 )
				if( chinkou_span <= 35.6936 )
					if( senkou_span_b <= 35.3655 )
						if( chinkou_span <= 34.6652 )
							if( tenkan_sen <= 34.513 )
								if( chinkou_span <= 33.3927 )
									ret := 0.070059
								if( chinkou_span > 33.3927 )
									ret := 0.331373
							if( tenkan_sen > 34.513 )
								if( kinjun_sen <= 34.9997 )
									ret := -0.626016
								if( kinjun_sen > 34.9997 )
									ret := -0.088889
						if( chinkou_span > 34.6652 )
							if( basis_minus <= -1.23934 )
								if( basis_minus <= -1.46787 )
									ret := -0.400000
								if( basis_minus > -1.46787 )
									ret := -1.000000 // sell
							if( basis_minus > -1.23934 )
								if( senkou_span_a <= 36.0046 )
									ret := 0.534091
								if( senkou_span_a > 36.0046 )
									ret := -1.000000 // sell
					if( senkou_span_b > 35.3655 )
						if( basis_max <= 1.00277 )
							if( senkou_span_a <= 36.0763 )
								if( tenkan_sen <= 35.5589 )
									ret := -0.287671
								if( tenkan_sen > 35.5589 )
									ret := 0.063636
							if( senkou_span_a > 36.0763 )
								if( basis_max <= 0.734427 )
									ret := -0.593886
								if( basis_max > 0.734427 )
									ret := 1.000000 // buy
						if( basis_max > 1.00277 )
							ret := 1.000000 // buy
				if( chinkou_span > 35.6936 )
					if( kinjun_sen <= 36.0496 )
						if( senkou_span_a_displaced <= 37.1191 )
							if( basis_max <= 0.122854 )
								if( chinkou_span <= 37.76 )
									ret := 0.430070
								if( chinkou_span > 37.76 )
									ret := 0.975000 // buy
							if( basis_max > 0.122854 )
								if( kinjun_sen <= 35.9863 )
									ret := 0.879195 // buy
								if( kinjun_sen > 35.9863 )
									ret := 0.625000
						if( senkou_span_a_displaced > 37.1191 )
							if( kinjun_sen <= 35.8445 )
								ret := -1.000000 // sell
							if( kinjun_sen > 35.8445 )
								ret := 1.000000 // buy
					if( kinjun_sen > 36.0496 )
						if( senkou_span_b <= 42.4074 )
							if( chinkou_span <= 40.0026 )
								if( basis_minus <= -0.855467 )
									ret := 0.445652
								if( basis_minus > -0.855467 )
									ret := 0.044730
							if( chinkou_span > 40.0026 )
								if( senkou_span_a <= 39.9108 )
									ret := 0.889299 // buy
								if( senkou_span_a > 39.9108 )
									ret := 0.416318
						if( senkou_span_b > 42.4074 )
							if( chinkou_span <= 45.8476 )
								if( senkou_span_b <= 46.8378 )
									ret := -0.082965
								if( senkou_span_b > 46.8378 )
									ret := -0.751678 // sell
							if( chinkou_span > 45.8476 )
								if( senkou_span_b <= 46.7542 )
									ret := 0.641256
								if( senkou_span_b > 46.7542 )
									ret := 0.099585
		if( chinkou_span > 55.11 )
			if( kinjun_sen <= 52.7246 )
				if( senkou_span_a_displaced <= 53.5471 )
					if( basis_max <= -0.485882 )
						if( senkou_span_a_displaced <= 47.6565 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 47.6565 )
							ret := 0.200000
					if( basis_max > -0.485882 )
						ret := 1.000000 // buy
				if( senkou_span_a_displaced > 53.5471 )
					if( chinkou_span <= 56.215 )
						ret := -0.500000
					if( chinkou_span > 56.215 )
						ret := 1.000000 // buy
			if( kinjun_sen > 52.7246 )
				if( senkou_span_b_displaced <= 53.6488 )
					if( tenkan_sen <= 56.562 )
						if( basis_minus <= 1.42999 )
							if( senkou_span_a_displaced <= 52.7784 )
								if( chinkou_span <= 56.6983 )
									ret := -0.500000
								if( chinkou_span > 56.6983 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 52.7784 )
								if( kinjun_sen <= 53.3831 )
									ret := 0.914894 // buy
								if( kinjun_sen > 53.3831 )
									ret := 0.614458
						if( basis_minus > 1.42999 )
							if( tenkan_sen <= 56.0657 )
								if( kinjun_sen <= 53.2254 )
									ret := 0.600000
								if( kinjun_sen > 53.2254 )
									ret := 0.947368 // buy
							if( tenkan_sen > 56.0657 )
								if( tenkan_sen <= 56.3375 )
									ret := 0.250000
								if( tenkan_sen > 56.3375 )
									ret := 1.000000 // buy
					if( tenkan_sen > 56.562 )
						if( basis_minus <= 0.849777 )
							if( kinjun_sen <= 56.8755 )
								if( senkou_span_a <= 56.8919 )
									ret := 0.700000 // buy
								if( senkou_span_a > 56.8919 )
									ret := -0.666667
							if( kinjun_sen > 56.8755 )
								ret := 1.000000 // buy
						if( basis_minus > 0.849777 )
							if( senkou_span_a <= 56.7263 )
								if( chinkou_span <= 56.4521 )
									ret := 0.000000
								if( chinkou_span > 56.4521 )
									ret := -0.809524 // sell
							if( senkou_span_a > 56.7263 )
								if( kinjun_sen <= 56.8064 )
									ret := 0.210526
								if( kinjun_sen > 56.8064 )
									ret := -1.000000 // sell
				if( senkou_span_b_displaced > 53.6488 )
					if( senkou_span_a_displaced <= 54.0789 )
						if( kinjun_sen <= 53.2124 )
							if( chinkou_span <= 55.7852 )
								if( chinkou_span <= 55.2925 )
									ret := -0.250000
								if( chinkou_span > 55.2925 )
									ret := 0.846154 // buy
							if( chinkou_span > 55.7852 )
								if( senkou_span_a_displaced <= 52.0697 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 52.0697 )
									ret := -0.250000
						if( kinjun_sen > 53.2124 )
							if( senkou_span_b_displaced <= 53.8825 )
								if( kinjun_sen <= 53.6372 )
									ret := 0.600000
								if( kinjun_sen > 53.6372 )
									ret := -0.714286 // sell
							if( senkou_span_b_displaced > 53.8825 )
								if( tenkan_sen <= 53.2851 )
									ret := -0.960000 // sell
								if( tenkan_sen > 53.2851 )
									ret := -0.600000
					if( senkou_span_a_displaced > 54.0789 )
						if( basis_max <= -0.072103 )
							if( tenkan_sen <= 56.848 )
								if( senkou_span_a <= 56.55 )
									ret := 0.023810
								if( senkou_span_a > 56.55 )
									ret := 0.750000 // buy
							if( tenkan_sen > 56.848 )
								if( chinkou_span <= 56.2336 )
									ret := -0.200000
								if( chinkou_span > 56.2336 )
									ret := -0.875000 // sell
						if( basis_max > -0.072103 )
							if( senkou_span_b <= 53.7993 )
								ret := -1.000000 // sell
							if( senkou_span_b > 53.7993 )
								if( senkou_span_b_displaced <= 56.6619 )
									ret := 0.685039
								if( senkou_span_b_displaced > 56.6619 )
									ret := -0.105263
	if( senkou_span_b > 56.4422 )
		if( tenkan_sen <= 59.2079 )
			if( senkou_span_b_displaced <= 58.6654 )
				if( chinkou_span <= 57.8863 )
					if( senkou_span_b <= 57.273 )
						if( chinkou_span <= 53.4643 )
							if( senkou_span_b_displaced <= 57.2551 )
								if( senkou_span_a_displaced <= 56.8912 )
									ret := -0.950000 // sell
								if( senkou_span_a_displaced > 56.8912 )
									ret := -0.600000
							if( senkou_span_b_displaced > 57.2551 )
								if( chinkou_span <= 52.72 )
									ret := 0.571429
								if( chinkou_span > 52.72 )
									ret := -0.621622
						if( chinkou_span > 53.4643 )
							if( senkou_span_b_displaced <= 58.185 )
								if( kinjun_sen <= 56.0179 )
									ret := 0.600000
								if( kinjun_sen > 56.0179 )
									ret := -0.361446
							if( senkou_span_b_displaced > 58.185 )
								if( senkou_span_b_displaced <= 58.4774 )
									ret := 0.833333 // buy
								if( senkou_span_b_displaced > 58.4774 )
									ret := -0.500000
					if( senkou_span_b > 57.273 )
						if( senkou_span_a_displaced <= 58.3949 )
							if( basis_minus <= 0.345275 )
								if( tenkan_sen <= 57.0564 )
									ret := -0.555556
								if( tenkan_sen > 57.0564 )
									ret := -0.125000
							if( basis_minus > 0.345275 )
								if( chinkou_span <= 57.7808 )
									ret := -0.863636 // sell
								if( chinkou_span > 57.7808 )
									ret := 0.000000
						if( senkou_span_a_displaced > 58.3949 )
							if( senkou_span_b_displaced <= 58.3502 )
								if( senkou_span_b_displaced <= 57.9256 )
									ret := -0.625000
								if( senkou_span_b_displaced > 57.9256 )
									ret := -0.971014 // sell
							if( senkou_span_b_displaced > 58.3502 )
								if( basis_max <= 0.068101 )
									ret := 0.200000
								if( basis_max > 0.068101 )
									ret := -0.757576 // sell
				if( chinkou_span > 57.8863 )
					if( basis_max <= -0.047881 )
						if( chinkou_span <= 58.3878 )
							if( basis_minus <= 0.647076 )
								if( basis_max <= -0.085 )
									ret := 0.090909
								if( basis_max > -0.085 )
									ret := -0.750000 // sell
							if( basis_minus > 0.647076 )
								if( basis_max <= -0.19875 )
									ret := 0.333333
								if( basis_max > -0.19875 )
									ret := 1.000000 // buy
						if( chinkou_span > 58.3878 )
							if( basis_max <= -0.094995 )
								if( chinkou_span <= 60.3769 )
									ret := -1.000000 // sell
								if( chinkou_span > 60.3769 )
									ret := -0.500000
							if( basis_max > -0.094995 )
								ret := 0.000000
					if( basis_max > -0.047881 )
						if( basis_minus <= 0.412827 )
							if( basis_max <= 0.055902 )
								if( tenkan_sen <= 58.039 )
									ret := 0.678571
								if( tenkan_sen > 58.039 )
									ret := -0.250000
							if( basis_max > 0.055902 )
								if( basis_max <= 0.321797 )
									ret := 1.000000 // buy
								if( basis_max > 0.321797 )
									ret := 0.400000
						if( basis_minus > 0.412827 )
							if( senkou_span_a_displaced <= 57.7552 )
								if( basis_minus <= 0.62625 )
									ret := 0.363636
								if( basis_minus > 0.62625 )
									ret := 0.700000 // buy
							if( senkou_span_a_displaced > 57.7552 )
								if( senkou_span_b_displaced <= 57.6715 )
									ret := -0.857143 // sell
								if( senkou_span_b_displaced > 57.6715 )
									ret := 0.200000
			if( senkou_span_b_displaced > 58.6654 )
				if( senkou_span_b_displaced <= 61.3825 )
					if( chinkou_span <= 60.9535 )
						if( kinjun_sen <= 58.1784 )
							if( kinjun_sen <= 57.74 )
								if( senkou_span_a_displaced <= 58.9005 )
									ret := -0.333333
								if( senkou_span_a_displaced > 58.9005 )
									ret := 0.729730 // buy
							if( kinjun_sen > 57.74 )
								if( senkou_span_a <= 57.9311 )
									ret := -1.000000 // sell
								if( senkou_span_a > 57.9311 )
									ret := 0.166667
						if( kinjun_sen > 58.1784 )
							if( tenkan_sen <= 58.9333 )
								if( senkou_span_a_displaced <= 59.0977 )
									ret := 0.692308
								if( senkou_span_a_displaced > 59.0977 )
									ret := 0.925373 // buy
							if( tenkan_sen > 58.9333 )
								if( tenkan_sen <= 59.053 )
									ret := 0.000000
								if( tenkan_sen > 59.053 )
									ret := 0.500000
					if( chinkou_span > 60.9535 )
						if( tenkan_sen <= 57.3839 )
							ret := 1.000000 // buy
						if( tenkan_sen > 57.3839 )
							ret := -1.000000 // sell
				if( senkou_span_b_displaced > 61.3825 )
					if( tenkan_sen <= 58.26 )
						if( basis_minus <= -2.20071 )
							ret := 1.000000 // buy
						if( basis_minus > -2.20071 )
							if( senkou_span_b <= 59.1509 )
								if( senkou_span_b_displaced <= 61.4198 )
									ret := -0.400000
								if( senkou_span_b_displaced > 61.4198 )
									ret := 0.794118 // buy
							if( senkou_span_b > 59.1509 )
								if( senkou_span_a <= 57.4812 )
									ret := -0.200000
								if( senkou_span_a > 57.4812 )
									ret := -0.827586 // sell
					if( tenkan_sen > 58.26 )
						if( senkou_span_b_displaced <= 63.8363 )
							if( senkou_span_b <= 61.2005 )
								if( senkou_span_b_displaced <= 62.6366 )
									ret := -0.833333 // sell
								if( senkou_span_b_displaced > 62.6366 )
									ret := 0.142857
							if( senkou_span_b > 61.2005 )
								if( senkou_span_b <= 61.425 )
									ret := 0.333333
								if( senkou_span_b > 61.425 )
									ret := -0.250000
						if( senkou_span_b_displaced > 63.8363 )
							ret := -1.000000 // sell
		if( tenkan_sen > 59.2079 )
			if( chinkou_span <= 60.7311 )
				if( chinkou_span <= 56.99 )
					if( senkou_span_a <= 59.2557 )
						if( chinkou_span <= 54.7 )
							ret := -0.833333 // sell
						if( chinkou_span > 54.7 )
							ret := -0.400000
					if( senkou_span_a > 59.2557 )
						if( tenkan_sen <= 59.761 )
							ret := -0.714286 // sell
						if( tenkan_sen > 59.761 )
							ret := -1.000000 // sell
				if( chinkou_span > 56.99 )
					if( tenkan_sen <= 63.0187 )
						if( senkou_span_b_displaced <= 67.5141 )
							if( senkou_span_b_displaced <= 58.955 )
								if( senkou_span_b_displaced <= 57.1131 )
									ret := 0.375000
								if( senkou_span_b_displaced > 57.1131 )
									ret := -0.868421 // sell
							if( senkou_span_b_displaced > 58.955 )
								if( basis_max <= 0.155196 )
									ret := -0.057851
								if( basis_max > 0.155196 )
									ret := -0.684211
						if( senkou_span_b_displaced > 67.5141 )
							if( senkou_span_a <= 61.4517 )
								ret := 1.000000 // buy
							if( senkou_span_a > 61.4517 )
								ret := 0.500000
					if( tenkan_sen > 63.0187 )
						if( basis_max <= 0.433106 )
							if( senkou_span_a_displaced <= 68.0514 )
								if( chinkou_span <= 59.9102 )
									ret := -1.000000 // sell
								if( chinkou_span > 59.9102 )
									ret := -0.500000
							if( senkou_span_a_displaced > 68.0514 )
								ret := -0.500000
						if( basis_max > 0.433106 )
							if( senkou_span_a <= 66.5725 )
								ret := 0.000000
							if( senkou_span_a > 66.5725 )
								ret := -0.250000
			if( chinkou_span > 60.7311 )
				if( tenkan_sen <= 62.355 )
					if( kinjun_sen <= 59.9699 )
						if( kinjun_sen <= 58.664 )
							if( kinjun_sen <= 58.4921 )
								ret := 0.714286 // buy
							if( kinjun_sen > 58.4921 )
								ret := 1.000000 // buy
						if( kinjun_sen > 58.664 )
							if( basis_max <= -0.457116 )
								if( senkou_span_a <= 60.0376 )
									ret := -1.000000 // sell
								if( senkou_span_a > 60.0376 )
									ret := -0.714286 // sell
							if( basis_max > -0.457116 )
								if( basis_max <= -0.084759 )
									ret := -0.166667
								if( basis_max > -0.084759 )
									ret := -1.000000 // sell
					if( kinjun_sen > 59.9699 )
						if( senkou_span_b_displaced <= 59.0659 )
							if( senkou_span_b_displaced <= 57.5918 )
								ret := 0.500000
							if( senkou_span_b_displaced > 57.5918 )
								if( senkou_span_a <= 61.9071 )
									ret := 0.975610 // buy
								if( senkou_span_a > 61.9071 )
									ret := 0.750000 // buy
						if( senkou_span_b_displaced > 59.0659 )
							if( senkou_span_b_displaced <= 59.536 )
								if( senkou_span_a_displaced <= 60.3415 )
									ret := -0.685714
								if( senkou_span_a_displaced > 60.3415 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 59.536 )
								if( senkou_span_b_displaced <= 59.6895 )
									ret := 0.300000
								if( senkou_span_b_displaced > 59.6895 )
									ret := 0.792453 // buy
				if( tenkan_sen > 62.355 )
					if( chinkou_span <= 65.6613 )
						if( basis_max <= -0.27 )
							ret := -1.000000 // sell
						if( basis_max > -0.27 )
							if( senkou_span_a <= 63.8909 )
								if( basis_minus <= 0.348118 )
									ret := -0.037037
								if( basis_minus > 0.348118 )
									ret := 1.000000 // buy
							if( senkou_span_a > 63.8909 )
								if( senkou_span_b_displaced <= 68.1869 )
									ret := -0.623762
								if( senkou_span_b_displaced > 68.1869 )
									ret := 0.750000 // buy
					if( chinkou_span > 65.6613 )
						if( tenkan_sen <= 69.7954 )
							if( basis_minus <= -0.913986 )
								if( tenkan_sen <= 67.3875 )
									ret := 0.000000
								if( tenkan_sen > 67.3875 )
									ret := -0.888889 // sell
							if( basis_minus > -0.913986 )
								if( tenkan_sen <= 68.4685 )
									ret := 0.084615
								if( tenkan_sen > 68.4685 )
									ret := 0.525641
						if( tenkan_sen > 69.7954 )
							if( tenkan_sen <= 70.1125 )
								if( senkou_span_a_displaced <= 69.8533 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 69.8533 )
									ret := -0.615385
							if( tenkan_sen > 70.1125 )
								ret := 0.000000
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_c93ea12d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


