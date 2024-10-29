//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: NVDA_1Min_1ICH_e0a7cab9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_1Min_1ICH_e0a7cab9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_1Min_e0a7cab9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 119.114 )
		if( tenkan_sen <= 118.083 )
			if( chinkou_span <= 117.897 )
				if( senkou_span_a <= 116.905 )
					if( chinkou_span <= 116.983 )
						if( tenkan_sen <= 105.605 )
							if( senkou_span_b <= 95.6068 )
								if( senkou_span_b_displaced <= 92.7652 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 92.7652 )
									ret := 0.740458 // buy
							if( senkou_span_b > 95.6068 )
								if( chinkou_span <= 104.853 )
									ret := 0.010905
								if( chinkou_span > 104.853 )
									ret := 0.308976
						if( tenkan_sen > 105.605 )
							if( basis_minus <= -1.62931 )
								if( chinkou_span <= 112.648 )
									ret := 0.625000
								if( chinkou_span > 112.648 )
									ret := 0.966667 // buy
							if( basis_minus > -1.62931 )
								if( chinkou_span <= 105.938 )
									ret := -0.403780
								if( chinkou_span > 105.938 )
									ret := 0.045496
					if( chinkou_span > 116.983 )
						if( senkou_span_b <= 115.884 )
							if( chinkou_span <= 117.65 )
								if( chinkou_span <= 116.998 )
									ret := 0.500000
								if( chinkou_span > 116.998 )
									ret := 0.933824 // buy
							if( chinkou_span > 117.65 )
								if( senkou_span_b <= 115.85 )
									ret := 0.657143
								if( senkou_span_b > 115.85 )
									ret := -0.400000
						if( senkou_span_b > 115.884 )
							if( chinkou_span <= 117.668 )
								if( senkou_span_b <= 116.928 )
									ret := 0.341463
								if( senkou_span_b > 116.928 )
									ret := 0.640000
							if( chinkou_span > 117.668 )
								if( senkou_span_b <= 116.629 )
									ret := 0.222222
								if( senkou_span_b > 116.629 )
									ret := -0.807692 // sell
				if( senkou_span_a > 116.905 )
					if( chinkou_span <= 117.412 )
						if( tenkan_sen <= 117.491 )
							if( chinkou_span <= 116.243 )
								if( senkou_span_a_displaced <= 121.336 )
									ret := -0.722513 // sell
								if( senkou_span_a_displaced > 121.336 )
									ret := 1.000000 // buy
							if( chinkou_span > 116.243 )
								if( kinjun_sen <= 118.104 )
									ret := -0.126181
								if( kinjun_sen > 118.104 )
									ret := 0.791667 // buy
						if( tenkan_sen > 117.491 )
							if( senkou_span_a <= 117.963 )
								if( senkou_span_b_displaced <= 118.7 )
									ret := -0.492723
								if( senkou_span_b_displaced > 118.7 )
									ret := 0.090909
							if( senkou_span_a > 117.963 )
								if( tenkan_sen <= 117.681 )
									ret := -0.250000
								if( tenkan_sen > 117.681 )
									ret := -0.880000 // sell
					if( chinkou_span > 117.412 )
						if( senkou_span_b <= 117.339 )
							if( senkou_span_b_displaced <= 115.68 )
								if( tenkan_sen <= 117.328 )
									ret := -1.000000 // sell
								if( tenkan_sen > 117.328 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 115.68 )
								if( tenkan_sen <= 117.437 )
									ret := 0.625592
								if( tenkan_sen > 117.437 )
									ret := 0.184211
						if( senkou_span_b > 117.339 )
							if( senkou_span_a_displaced <= 119.528 )
								if( kinjun_sen <= 117.155 )
									ret := -0.869565 // sell
								if( kinjun_sen > 117.155 )
									ret := -0.064447
							if( senkou_span_a_displaced > 119.528 )
								if( kinjun_sen <= 118.141 )
									ret := 0.250000
								if( kinjun_sen > 118.141 )
									ret := 0.952381 // buy
			if( chinkou_span > 117.897 )
				if( senkou_span_b <= 116.643 )
					if( senkou_span_b <= 115.85 )
						if( senkou_span_a <= 115.718 )
							if( senkou_span_a_displaced <= 117.013 )
								ret := 0.600000
							if( senkou_span_a_displaced > 117.013 )
								ret := 1.000000 // buy
						if( senkou_span_a > 115.718 )
							ret := -1.000000 // sell
					if( senkou_span_b > 115.85 )
						if( basis_max <= -0.166081 )
							if( basis_minus <= 0.269678 )
								ret := 0.000000
							if( basis_minus > 0.269678 )
								if( senkou_span_b_displaced <= 116.87 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 116.87 )
									ret := 0.600000
						if( basis_max > -0.166081 )
							if( senkou_span_b <= 116.522 )
								if( senkou_span_b_displaced <= 115.875 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 115.875 )
									ret := 0.978495 // buy
							if( senkou_span_b > 116.522 )
								if( senkou_span_a_displaced <= 116.847 )
									ret := 0.250000
								if( senkou_span_a_displaced > 116.847 )
									ret := 0.833333 // buy
				if( senkou_span_b > 116.643 )
					if( basis_max <= -0.200225 )
						if( basis_max <= -0.375 )
							if( basis_minus <= 0.659595 )
								if( senkou_span_b_displaced <= 117.592 )
									ret := -0.083333
								if( senkou_span_b_displaced > 117.592 )
									ret := 0.750000 // buy
							if( basis_minus > 0.659595 )
								ret := 1.000000 // buy
						if( basis_max > -0.375 )
							if( tenkan_sen <= 118.055 )
								if( senkou_span_b_displaced <= 117.233 )
									ret := -0.058824
								if( senkou_span_b_displaced > 117.233 )
									ret := -0.687500
							if( tenkan_sen > 118.055 )
								ret := 0.400000
					if( basis_max > -0.200225 )
						if( senkou_span_a <= 117.926 )
							if( senkou_span_a <= 116.877 )
								if( senkou_span_b <= 117.015 )
									ret := -1.000000 // sell
								if( senkou_span_b > 117.015 )
									ret := 0.000000
							if( senkou_span_a > 116.877 )
								if( senkou_span_a <= 117.356 )
									ret := 0.692661
								if( senkou_span_a > 117.356 )
									ret := 0.413669
						if( senkou_span_a > 117.926 )
							if( chinkou_span <= 118.477 )
								if( senkou_span_a_displaced <= 118.271 )
									ret := 0.014134
								if( senkou_span_a_displaced > 118.271 )
									ret := 0.329114
							if( chinkou_span > 118.477 )
								if( tenkan_sen <= 117.804 )
									ret := -0.750000 // sell
								if( tenkan_sen > 117.804 )
									ret := 0.663793
		if( tenkan_sen > 118.083 )
			if( tenkan_sen <= 119.05 )
				if( senkou_span_b_displaced <= 117.634 )
					if( chinkou_span <= 118.97 )
						if( kinjun_sen <= 118.08 )
							if( basis_max <= -0.185714 )
								if( senkou_span_b <= 117.882 )
									ret := -0.108696
								if( senkou_span_b > 117.882 )
									ret := -1.000000 // sell
							if( basis_max > -0.185714 )
								if( senkou_span_b_displaced <= 116.792 )
									ret := -0.500000
								if( senkou_span_b_displaced > 116.792 )
									ret := -0.866667 // sell
						if( kinjun_sen > 118.08 )
							if( kinjun_sen <= 118.305 )
								if( senkou_span_b_displaced <= 116.638 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 116.638 )
									ret := 0.181818
							if( kinjun_sen > 118.305 )
								if( chinkou_span <= 118.345 )
									ret := -0.795455 // sell
								if( chinkou_span > 118.345 )
									ret := 0.000000
					if( chinkou_span > 118.97 )
						if( senkou_span_b_displaced <= 117.062 )
							if( tenkan_sen <= 118.388 )
								ret := 1.000000 // buy
							if( tenkan_sen > 118.388 )
								ret := 0.250000
						if( senkou_span_b_displaced > 117.062 )
							ret := -1.000000 // sell
				if( senkou_span_b_displaced > 117.634 )
					if( chinkou_span <= 118.423 )
						if( senkou_span_a_displaced <= 120.706 )
							if( senkou_span_a <= 118.482 )
								if( chinkou_span <= 116.716 )
									ret := 0.794872 // buy
								if( chinkou_span > 116.716 )
									ret := -0.188202
							if( senkou_span_a > 118.482 )
								if( basis_max <= 0.069995 )
									ret := -0.730994 // sell
								if( basis_max > 0.069995 )
									ret := -0.280142
						if( senkou_span_a_displaced > 120.706 )
							if( tenkan_sen <= 118.524 )
								if( senkou_span_b_displaced <= 120.572 )
									ret := 0.875000 // buy
								if( senkou_span_b_displaced > 120.572 )
									ret := 1.000000 // buy
							if( tenkan_sen > 118.524 )
								if( basis_max <= 0.377135 )
									ret := 0.571429
								if( basis_max > 0.377135 )
									ret := -0.722222 // sell
					if( chinkou_span > 118.423 )
						if( basis_minus <= -0.102538 )
							if( tenkan_sen <= 119.02 )
								if( tenkan_sen <= 118.542 )
									ret := 0.020202
								if( tenkan_sen > 118.542 )
									ret := 0.380952
							if( tenkan_sen > 119.02 )
								if( basis_minus <= -0.135039 )
									ret := -0.636364
								if( basis_minus > -0.135039 )
									ret := 0.500000
						if( basis_minus > -0.102538 )
							if( senkou_span_a_displaced <= 118.296 )
								if( kinjun_sen <= 117.958 )
									ret := -0.735294 // sell
								if( kinjun_sen > 117.958 )
									ret := 0.351351
							if( senkou_span_a_displaced > 118.296 )
								if( senkou_span_b <= 118.543 )
									ret := -0.492537
								if( senkou_span_b > 118.543 )
									ret := -0.084584
			if( tenkan_sen > 119.05 )
				if( senkou_span_a_displaced <= 119.283 )
					if( senkou_span_a <= 119.592 )
						if( basis_minus <= 0.174961 )
							if( chinkou_span <= 118.617 )
								if( basis_max <= -0.053531 )
									ret := -0.888889 // sell
								if( basis_max > -0.053531 )
									ret := -0.278481
							if( chinkou_span > 118.617 )
								if( basis_minus <= 0.140971 )
									ret := -0.053763
								if( basis_minus > 0.140971 )
									ret := 0.380952
						if( basis_minus > 0.174961 )
							if( senkou_span_b <= 118.124 )
								if( senkou_span_a_displaced <= 117.751 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 117.751 )
									ret := -1.000000 // sell
							if( senkou_span_b > 118.124 )
								if( senkou_span_b_displaced <= 118.015 )
									ret := -0.083333
								if( senkou_span_b_displaced > 118.015 )
									ret := -0.631579
					if( senkou_span_a > 119.592 )
						if( kinjun_sen <= 119.987 )
							if( senkou_span_a_displaced <= 119.274 )
								if( senkou_span_a_displaced <= 118.138 )
									ret := 0.200000
								if( senkou_span_a_displaced > 118.138 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 119.274 )
								ret := 0.000000
						if( kinjun_sen > 119.987 )
							ret := -0.400000
				if( senkou_span_a_displaced > 119.283 )
					if( chinkou_span <= 118.093 )
						if( tenkan_sen <= 121.228 )
							if( senkou_span_b <= 119.725 )
								if( senkou_span_b <= 119.528 )
									ret := -0.833333 // sell
								if( senkou_span_b > 119.528 )
									ret := -0.076923
							if( senkou_span_b > 119.725 )
								if( basis_max <= 0.004062 )
									ret := -0.750000 // sell
								if( basis_max > 0.004062 )
									ret := -0.931034 // sell
						if( tenkan_sen > 121.228 )
							if( senkou_span_a_displaced <= 123.696 )
								ret := 0.000000
							if( senkou_span_a_displaced > 123.696 )
								ret := -0.500000
					if( chinkou_span > 118.093 )
						if( tenkan_sen <= 119.149 )
							if( basis_minus <= -0.128671 )
								if( kinjun_sen <= 119.569 )
									ret := -0.977778 // sell
								if( kinjun_sen > 119.569 )
									ret := -0.750000 // sell
							if( basis_minus > -0.128671 )
								if( senkou_span_b <= 119.225 )
									ret := -0.888889 // sell
								if( senkou_span_b > 119.225 )
									ret := -0.416667
						if( tenkan_sen > 119.149 )
							if( chinkou_span <= 118.602 )
								if( kinjun_sen <= 119.621 )
									ret := -0.517857
								if( kinjun_sen > 119.621 )
									ret := 0.023256
							if( chinkou_span > 118.602 )
								if( kinjun_sen <= 119.378 )
									ret := -0.044444
								if( kinjun_sen > 119.378 )
									ret := -0.566298
	if( chinkou_span > 119.114 )
		if( kinjun_sen <= 120.11 )
			if( chinkou_span <= 119.92 )
				if( senkou_span_a <= 118.892 )
					if( senkou_span_b <= 116.889 )
						if( senkou_span_b_displaced <= 117.273 )
							if( senkou_span_a_displaced <= 115.795 )
								ret := 0.750000 // buy
							if( senkou_span_a_displaced > 115.795 )
								if( basis_minus <= 0.44 )
									ret := 0.990000 // buy
								if( basis_minus > 0.44 )
									ret := 0.750000 // buy
						if( senkou_span_b_displaced > 117.273 )
							ret := 0.500000
					if( senkou_span_b > 116.889 )
						if( senkou_span_b <= 117.148 )
							if( senkou_span_b <= 117.092 )
								if( tenkan_sen <= 117.091 )
									ret := -1.000000 // sell
								if( tenkan_sen > 117.091 )
									ret := 0.750000 // buy
							if( senkou_span_b > 117.092 )
								ret := -1.000000 // sell
						if( senkou_span_b > 117.148 )
							if( basis_max <= -0.0525 )
								if( basis_minus <= 0.792777 )
									ret := 0.074074
								if( basis_minus > 0.792777 )
									ret := 0.848485 // buy
							if( basis_max > -0.0525 )
								if( senkou_span_a <= 118.398 )
									ret := 0.421053
								if( senkou_span_a > 118.398 )
									ret := 0.657895
				if( senkou_span_a > 118.892 )
					if( tenkan_sen <= 119.763 )
						if( senkou_span_b <= 119.505 )
							if( kinjun_sen <= 118.923 )
								if( senkou_span_a_displaced <= 119.043 )
									ret := 0.482353
								if( senkou_span_a_displaced > 119.043 )
									ret := -0.600000
							if( kinjun_sen > 118.923 )
								if( senkou_span_a_displaced <= 119.622 )
									ret := 0.018428
								if( senkou_span_a_displaced > 119.622 )
									ret := -0.513514
						if( senkou_span_b > 119.505 )
							if( senkou_span_b <= 120.09 )
								if( senkou_span_a <= 119.402 )
									ret := 0.660377
								if( senkou_span_a > 119.402 )
									ret := 0.253012
							if( senkou_span_b > 120.09 )
								if( senkou_span_b_displaced <= 120.451 )
									ret := 0.368421
								if( senkou_span_b_displaced > 120.451 )
									ret := -0.386667
					if( tenkan_sen > 119.763 )
						if( tenkan_sen <= 120.007 )
							if( senkou_span_b_displaced <= 119.664 )
								if( senkou_span_a <= 119.793 )
									ret := 1.000000 // buy
								if( senkou_span_a > 119.793 )
									ret := 0.200000
							if( senkou_span_b_displaced > 119.664 )
								if( basis_max <= -0.09125 )
									ret := -0.891304 // sell
								if( basis_max > -0.09125 )
									ret := -0.477273
						if( tenkan_sen > 120.007 )
							if( basis_max <= -0.488724 )
								if( senkou_span_a <= 119.451 )
									ret := 0.500000
								if( senkou_span_a > 119.451 )
									ret := -0.884615 // sell
							if( basis_max > -0.488724 )
								if( basis_max <= -0.238261 )
									ret := 0.906250 // buy
								if( basis_max > -0.238261 )
									ret := 0.000000
			if( chinkou_span > 119.92 )
				if( senkou_span_b <= 118.913 )
					if( chinkou_span <= 120.384 )
						if( senkou_span_b_displaced <= 119.51 )
							if( senkou_span_a_displaced <= 118.126 )
								if( chinkou_span <= 120.074 )
									ret := 0.650000
								if( chinkou_span > 120.074 )
									ret := -0.385965
							if( senkou_span_a_displaced > 118.126 )
								if( chinkou_span <= 119.951 )
									ret := -0.285714
								if( chinkou_span > 119.951 )
									ret := 0.747126 // buy
						if( senkou_span_b_displaced > 119.51 )
							if( senkou_span_b <= 118.561 )
								if( senkou_span_b_displaced <= 119.542 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 119.542 )
									ret := -0.500000
							if( senkou_span_b > 118.561 )
								ret := -0.428571
					if( chinkou_span > 120.384 )
						if( tenkan_sen <= 120.891 )
							if( basis_max <= -1.0885 )
								ret := 0.000000
							if( basis_max > -1.0885 )
								if( senkou_span_b <= 118.567 )
									ret := 0.774892 // buy
								if( senkou_span_b > 118.567 )
									ret := 0.922619 // buy
						if( tenkan_sen > 120.891 )
							ret := 0.000000
				if( senkou_span_b > 118.913 )
					if( basis_max <= -0.228468 )
						if( basis_minus <= 0.67875 )
							if( senkou_span_b_displaced <= 119.74 )
								if( senkou_span_b <= 119.637 )
									ret := 0.717391 // buy
								if( senkou_span_b > 119.637 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 119.74 )
								if( basis_minus <= -0.470025 )
									ret := -0.714286 // sell
								if( basis_minus > -0.470025 )
									ret := 0.040000
						if( basis_minus > 0.67875 )
							if( senkou_span_a_displaced <= 118.33 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 118.33 )
								if( kinjun_sen <= 119.679 )
									ret := -0.303030
								if( kinjun_sen > 119.679 )
									ret := 0.476190
					if( basis_max > -0.228468 )
						if( senkou_span_a_displaced <= 118.717 )
							if( chinkou_span <= 120.433 )
								ret := 0.857143 // buy
							if( chinkou_span > 120.433 )
								if( senkou_span_a <= 119.134 )
									ret := 0.750000 // buy
								if( senkou_span_a > 119.134 )
									ret := -0.781250 // sell
						if( senkou_span_a_displaced > 118.717 )
							if( senkou_span_a_displaced <= 119.069 )
								if( basis_minus <= 0.884979 )
									ret := 0.805405 // buy
								if( basis_minus > 0.884979 )
									ret := -0.454545
							if( senkou_span_a_displaced > 119.069 )
								if( basis_minus <= 0.366276 )
									ret := 0.440476
								if( basis_minus > 0.366276 )
									ret := -0.263158
		if( kinjun_sen > 120.11 )
			if( chinkou_span <= 120.551 )
				if( senkou_span_a <= 120.714 )
					if( chinkou_span <= 120.134 )
						if( tenkan_sen <= 120.019 )
							if( senkou_span_b <= 119.88 )
								if( senkou_span_a <= 120.026 )
									ret := -0.500000
								if( senkou_span_a > 120.026 )
									ret := -1.000000 // sell
							if( senkou_span_b > 119.88 )
								if( basis_minus <= -0.23125 )
									ret := -0.074074
								if( basis_minus > -0.23125 )
									ret := 0.709677 // buy
						if( tenkan_sen > 120.019 )
							if( basis_max <= 0.079937 )
								if( senkou_span_b_displaced <= 120.329 )
									ret := -0.606061
								if( senkou_span_b_displaced > 120.329 )
									ret := -0.278008
							if( basis_max > 0.079937 )
								if( kinjun_sen <= 120.303 )
									ret := 1.000000 // buy
								if( kinjun_sen > 120.303 )
									ret := -0.192982
					if( chinkou_span > 120.134 )
						if( tenkan_sen <= 120.483 )
							if( senkou_span_b <= 120.368 )
								if( basis_max <= 0.065 )
									ret := 0.120275
								if( basis_max > 0.065 )
									ret := 0.680851
							if( senkou_span_b > 120.368 )
								if( tenkan_sen <= 120.443 )
									ret := -0.135802
								if( tenkan_sen > 120.443 )
									ret := 0.475000
						if( tenkan_sen > 120.483 )
							if( basis_max <= 0.121811 )
								if( basis_minus <= 0.35375 )
									ret := -0.135849
								if( basis_minus > 0.35375 )
									ret := -0.500000
							if( basis_max > 0.121811 )
								if( tenkan_sen <= 120.539 )
									ret := 0.000000
								if( tenkan_sen > 120.539 )
									ret := 1.000000 // buy
				if( senkou_span_a > 120.714 )
					if( basis_max <= 0.450312 )
						if( kinjun_sen <= 120.733 )
							if( chinkou_span <= 120.088 )
								if( basis_max <= -0.03406 )
									ret := -1.000000 // sell
								if( basis_max > -0.03406 )
									ret := -0.750000 // sell
							if( chinkou_span > 120.088 )
								if( basis_max <= -0.180584 )
									ret := -0.928571 // sell
								if( basis_max > -0.180584 )
									ret := -0.666667
						if( kinjun_sen > 120.733 )
							if( senkou_span_b <= 120.726 )
								if( senkou_span_a_displaced <= 120.862 )
									ret := 0.142857
								if( senkou_span_a_displaced > 120.862 )
									ret := -1.000000 // sell
							if( senkou_span_b > 120.726 )
								if( senkou_span_b <= 121.82 )
									ret := -0.402036
								if( senkou_span_b > 121.82 )
									ret := -0.655303
					if( basis_max > 0.450312 )
						if( tenkan_sen <= 152.384 )
							if( chinkou_span <= 119.945 )
								ret := -0.500000
							if( chinkou_span > 119.945 )
								if( basis_max <= 272.119 )
									ret := 0.818182 // buy
								if( basis_max > 272.119 )
									ret := 0.000000
						if( tenkan_sen > 152.384 )
							if( senkou_span_b <= 664.282 )
								ret := 1.000000 // buy
							if( senkou_span_b > 664.282 )
								ret := -1.000000 // sell
			if( chinkou_span > 120.551 )
				if( kinjun_sen <= 120.694 )
					if( chinkou_span <= 121.661 )
						if( basis_minus <= 0.238387 )
							if( tenkan_sen <= 120.494 )
								if( tenkan_sen <= 120.278 )
									ret := 0.292208
								if( tenkan_sen > 120.278 )
									ret := 0.604230
							if( tenkan_sen > 120.494 )
								if( chinkou_span <= 120.714 )
									ret := -0.054054
								if( chinkou_span > 120.714 )
									ret := 0.383117
						if( basis_minus > 0.238387 )
							if( senkou_span_b <= 119 )
								ret := 1.000000 // buy
							if( senkou_span_b > 119 )
								if( senkou_span_b_displaced <= 117.656 )
									ret := -0.851852 // sell
								if( senkou_span_b_displaced > 117.656 )
									ret := -0.200855
					if( chinkou_span > 121.661 )
						if( basis_max <= -0.27875 )
							if( senkou_span_a_displaced <= 121.647 )
								ret := 0.000000
							if( senkou_span_a_displaced > 121.647 )
								ret := -1.000000 // sell
						if( basis_max > -0.27875 )
							if( tenkan_sen <= 120.529 )
								if( basis_minus <= 0.245 )
									ret := 0.986486 // buy
								if( basis_minus > 0.245 )
									ret := 0.812500 // buy
							if( tenkan_sen > 120.529 )
								if( tenkan_sen <= 120.822 )
									ret := 0.209302
								if( tenkan_sen > 120.822 )
									ret := 0.898990 // buy
				if( kinjun_sen > 120.694 )
					if( chinkou_span <= 121.432 )
						if( tenkan_sen <= 121.433 )
							if( basis_minus <= -0.535814 )
								if( senkou_span_b_displaced <= 122.118 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 122.118 )
									ret := 0.295082
							if( basis_minus > -0.535814 )
								if( chinkou_span <= 121.084 )
									ret := -0.130866
								if( chinkou_span > 121.084 )
									ret := 0.083333
						if( tenkan_sen > 121.433 )
							if( senkou_span_a <= 122.436 )
								if( basis_max <= 0.014628 )
									ret := -0.431034
								if( basis_max > 0.014628 )
									ret := -0.154412
							if( senkou_span_a > 122.436 )
								if( senkou_span_a <= 123.114 )
									ret := -0.846154 // sell
								if( senkou_span_a > 123.114 )
									ret := -0.394737
					if( chinkou_span > 121.432 )
						if( senkou_span_a <= 122.004 )
							if( chinkou_span <= 122.413 )
								if( senkou_span_b <= 120.971 )
									ret := 0.503417
								if( senkou_span_b > 120.971 )
									ret := 0.120047
							if( chinkou_span > 122.413 )
								if( senkou_span_b <= 121.215 )
									ret := 0.409836
								if( senkou_span_b > 121.215 )
									ret := 0.676744
						if( senkou_span_a > 122.004 )
							if( basis_minus <= 17.6632 )
								if( chinkou_span <= 122.762 )
									ret := -0.162354
								if( chinkou_span > 122.762 )
									ret := 0.058534
							if( basis_minus > 17.6632 )
								if( senkou_span_a <= 1005.23 )
									ret := 0.822917 // buy
								if( senkou_span_a > 1005.23 )
									ret := -0.375000
	
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
float op_operation = decision_tree_0_NVDA_1Min_e0a7cab9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


