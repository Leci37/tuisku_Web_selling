//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AVAXUSDT_5Min_1ICH_bc0ba8b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_5Min_1ICH_bc0ba8b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_5Min_bc0ba8b7(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_b <= 42.5907 )
		if( chinkou_span <= 41.0186 )
			if( senkou_span_a <= 40.0273 )
				if( senkou_span_a_displaced <= 41.0016 )
					if( basis_minus <= -0.167501 )
						if( senkou_span_a_displaced <= 10.9734 )
							if( senkou_span_a <= 10.2088 )
								if( chinkou_span <= 9.4 )
									ret := -0.200000
								if( chinkou_span > 9.4 )
									ret := -0.142857
							if( senkou_span_a > 10.2088 )
								if( senkou_span_b_displaced <= 10.8525 )
									ret := 0.969697 // buy
								if( senkou_span_b_displaced > 10.8525 )
									ret := 0.640000
						if( senkou_span_a_displaced > 10.9734 )
							if( chinkou_span <= 39.0252 )
								if( senkou_span_a_displaced <= 39.2311 )
									ret := 0.042365
								if( senkou_span_a_displaced > 39.2311 )
									ret := -0.441128
							if( chinkou_span > 39.0252 )
								if( senkou_span_a_displaced <= 39.446 )
									ret := 0.668675
								if( senkou_span_a_displaced > 39.446 )
									ret := 0.225337
					if( basis_minus > -0.167501 )
						if( basis_minus <= 0.495012 )
							if( chinkou_span <= 40.0132 )
								if( senkou_span_b_displaced <= 38.6319 )
									ret := 0.005991
								if( senkou_span_b_displaced > 38.6319 )
									ret := -0.136532
							if( chinkou_span > 40.0132 )
								if( senkou_span_a_displaced <= 39.8372 )
									ret := 0.604885
								if( senkou_span_a_displaced > 39.8372 )
									ret := 0.031621
						if( basis_minus > 0.495012 )
							if( senkou_span_b_displaced <= 36.5807 )
								if( senkou_span_a <= 37.0099 )
									ret := -0.109306
								if( senkou_span_a > 37.0099 )
									ret := -0.440000
							if( senkou_span_b_displaced > 36.5807 )
								if( kinjun_sen <= 38.6925 )
									ret := 0.482877
								if( kinjun_sen > 38.6925 )
									ret := -0.259366
				if( senkou_span_a_displaced > 41.0016 )
					if( basis_max <= 0.675947 )
						if( basis_minus <= -0.94097 )
							if( basis_minus <= -1.47014 )
								if( kinjun_sen <= 38.9237 )
									ret := 0.333333
								if( kinjun_sen > 38.9237 )
									ret := 1.000000 // buy
							if( basis_minus > -1.47014 )
								if( basis_max <= 0.415734 )
									ret := -0.400000
								if( basis_max > 0.415734 )
									ret := -1.000000 // sell
						if( basis_minus > -0.94097 )
							if( senkou_span_b <= 40.3855 )
								if( basis_max <= -0.051795 )
									ret := 0.090909
								if( basis_max > -0.051795 )
									ret := 0.921739 // buy
							if( senkou_span_b > 40.3855 )
								if( tenkan_sen <= 39.7659 )
									ret := 0.666667
								if( tenkan_sen > 39.7659 )
									ret := -0.642857
					if( basis_max > 0.675947 )
						ret := -0.789474 // sell
			if( senkou_span_a > 40.0273 )
				if( senkou_span_a_displaced <= 41.4763 )
					if( chinkou_span <= 40.1656 )
						if( basis_max <= 0.167322 )
							if( kinjun_sen <= 39.9587 )
								if( senkou_span_a <= 40.0762 )
									ret := 0.560000
								if( senkou_span_a > 40.0762 )
									ret := -0.055556
							if( kinjun_sen > 39.9587 )
								if( senkou_span_a <= 40.3072 )
									ret := -0.402548
								if( senkou_span_a > 40.3072 )
									ret := -0.644550
						if( basis_max > 0.167322 )
							if( basis_minus <= -0.492002 )
								ret := -0.866667 // sell
							if( basis_minus > -0.492002 )
								if( senkou_span_b_displaced <= 40.6444 )
									ret := -0.894737 // sell
								if( senkou_span_b_displaced > 40.6444 )
									ret := 0.500000
					if( chinkou_span > 40.1656 )
						if( basis_minus <= 0.098916 )
							if( kinjun_sen <= 41.1112 )
								if( basis_max <= 0.131653 )
									ret := 0.242084
								if( basis_max > 0.131653 )
									ret := -0.381818
							if( kinjun_sen > 41.1112 )
								if( senkou_span_b_displaced <= 40.58 )
									ret := -0.090909
								if( senkou_span_b_displaced > 40.58 )
									ret := -0.500000
						if( basis_minus > 0.098916 )
							if( senkou_span_b_displaced <= 39.1746 )
								if( basis_max <= -0.142088 )
									ret := 0.230769
								if( basis_max > -0.142088 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 39.1746 )
								if( tenkan_sen <= 40.3668 )
									ret := 0.344538
								if( tenkan_sen > 40.3668 )
									ret := -0.338731
				if( senkou_span_a_displaced > 41.4763 )
					if( basis_minus <= -0.605 )
						if( senkou_span_a_displaced <= 42.1753 )
							ret := 0.823529 // buy
						if( senkou_span_a_displaced > 42.1753 )
							ret := -0.400000
					if( basis_minus > -0.605 )
						if( tenkan_sen <= 41.6888 )
							if( senkou_span_a <= 41.3639 )
								if( senkou_span_b_displaced <= 41.62 )
									ret := -0.820896 // sell
								if( senkou_span_b_displaced > 41.62 )
									ret := -0.487500
							if( senkou_span_a > 41.3639 )
								if( basis_minus <= -0.231801 )
									ret := -0.823529 // sell
								if( basis_minus > -0.231801 )
									ret := -0.107143
						if( tenkan_sen > 41.6888 )
							if( senkou_span_b <= 42.528 )
								if( senkou_span_b_displaced <= 41.7981 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 41.7981 )
									ret := -0.925234 // sell
							if( senkou_span_b > 42.528 )
								ret := -0.384615
		if( chinkou_span > 41.0186 )
			if( chinkou_span <= 43.2804 )
				if( senkou_span_a <= 41.0399 )
					if( tenkan_sen <= 40.5344 )
						if( basis_max <= -0.375212 )
							ret := -1.000000 // sell
						if( basis_max > -0.375212 )
							if( basis_max <= -0.272848 )
								if( senkou_span_b <= 39.3125 )
									ret := 0.647059
								if( senkou_span_b > 39.3125 )
									ret := -0.200000
							if( basis_max > -0.272848 )
								if( senkou_span_b_displaced <= 41.1493 )
									ret := 0.823009 // buy
								if( senkou_span_b_displaced > 41.1493 )
									ret := 0.985915 // buy
					if( tenkan_sen > 40.5344 )
						if( chinkou_span <= 41.4006 )
							if( tenkan_sen <= 40.7671 )
								if( chinkou_span <= 41.3519 )
									ret := 0.305085
								if( chinkou_span > 41.3519 )
									ret := -0.913043 // sell
							if( tenkan_sen > 40.7671 )
								if( senkou_span_a <= 40.6725 )
									ret := 0.935484 // buy
								if( senkou_span_a > 40.6725 )
									ret := 0.490323
						if( chinkou_span > 41.4006 )
							if( basis_minus <= 0.653224 )
								if( senkou_span_a_displaced <= 41.2637 )
									ret := 0.574359
								if( senkou_span_a_displaced > 41.2637 )
									ret := 0.911765 // buy
							if( basis_minus > 0.653224 )
								if( basis_minus <= 0.914149 )
									ret := 0.946429 // buy
								if( basis_minus > 0.914149 )
									ret := 0.400000
				if( senkou_span_a > 41.0399 )
					if( chinkou_span <= 41.9196 )
						if( senkou_span_a_displaced <= 41.7162 )
							if( kinjun_sen <= 41.3026 )
								if( chinkou_span <= 41.4725 )
									ret := -0.413043
								if( chinkou_span > 41.4725 )
									ret := -0.093750
							if( kinjun_sen > 41.3026 )
								if( senkou_span_a_displaced <= 40.9763 )
									ret := -0.439024
								if( senkou_span_a_displaced > 40.9763 )
									ret := 0.194737
						if( senkou_span_a_displaced > 41.7162 )
							if( basis_max <= 0.097658 )
								if( senkou_span_a <= 41.5463 )
									ret := 0.533333
								if( senkou_span_a > 41.5463 )
									ret := -0.688017
							if( basis_max > 0.097658 )
								if( senkou_span_a_displaced <= 42.2425 )
									ret := 0.495726
								if( senkou_span_a_displaced > 42.2425 )
									ret := -0.271605
					if( chinkou_span > 41.9196 )
						if( basis_max <= 0.00259 )
							if( senkou_span_b <= 42.4778 )
								if( kinjun_sen <= 42.6166 )
									ret := 0.265375
								if( kinjun_sen > 42.6166 )
									ret := -0.593407
							if( senkou_span_b > 42.4778 )
								if( senkou_span_b_displaced <= 42.9125 )
									ret := -0.550459
								if( senkou_span_b_displaced > 42.9125 )
									ret := 0.862745 // buy
						if( basis_max > 0.00259 )
							if( senkou_span_a_displaced <= 43.6505 )
								if( tenkan_sen <= 41.5811 )
									ret := 0.850000 // buy
								if( tenkan_sen > 41.5811 )
									ret := 0.371025
							if( senkou_span_a_displaced > 43.6505 )
								if( tenkan_sen <= 41.6884 )
									ret := -1.000000 // sell
								if( tenkan_sen > 41.6884 )
									ret := -0.555556
			if( chinkou_span > 43.2804 )
				if( senkou_span_a_displaced <= 42.5062 )
					if( senkou_span_a <= 41.4929 )
						if( tenkan_sen <= 41.3303 )
							ret := 1.000000 // buy
						if( tenkan_sen > 41.3303 )
							ret := -0.090909
					if( senkou_span_a > 41.4929 )
						if( senkou_span_a <= 42.4743 )
							if( chinkou_span <= 44.9653 )
								if( senkou_span_b <= 42.3931 )
									ret := 0.975728 // buy
								if( senkou_span_b > 42.3931 )
									ret := 0.833333 // buy
							if( chinkou_span > 44.9653 )
								ret := 0.714286 // buy
						if( senkou_span_a > 42.4743 )
							if( senkou_span_a <= 42.4934 )
								ret := 0.333333
							if( senkou_span_a > 42.4934 )
								if( kinjun_sen <= 42.6137 )
									ret := 0.962264 // buy
								if( kinjun_sen > 42.6137 )
									ret := 0.071429
				if( senkou_span_a_displaced > 42.5062 )
					ret := -0.285714
	if( senkou_span_b > 42.5907 )
		if( tenkan_sen <= 57.0713 )
			if( basis_minus <= -0.39677 )
				if( chinkou_span <= 54.8931 )
					if( tenkan_sen <= 53.5462 )
						if( tenkan_sen <= 45.7531 )
							if( senkou_span_a <= 42.5869 )
								if( kinjun_sen <= 42.0043 )
									ret := -0.960000 // sell
								if( kinjun_sen > 42.0043 )
									ret := 0.496094
							if( senkou_span_a > 42.5869 )
								if( senkou_span_b <= 46.4896 )
									ret := -0.229018
								if( senkou_span_b > 46.4896 )
									ret := -0.978261 // sell
						if( tenkan_sen > 45.7531 )
							if( senkou_span_a <= 47.9432 )
								if( senkou_span_b_displaced <= 48.1412 )
									ret := 0.271676
								if( senkou_span_b_displaced > 48.1412 )
									ret := 0.794444 // buy
							if( senkou_span_a > 47.9432 )
								if( chinkou_span <= 53.3319 )
									ret := -0.062603
								if( chinkou_span > 53.3319 )
									ret := 0.424731
					if( tenkan_sen > 53.5462 )
						if( basis_max <= 0.04299 )
							if( basis_minus <= -0.652979 )
								if( chinkou_span <= 54.5609 )
									ret := -0.971429 // sell
								if( chinkou_span > 54.5609 )
									ret := 0.000000
							if( basis_minus > -0.652979 )
								if( basis_minus <= -0.4275 )
									ret := -0.120000
								if( basis_minus > -0.4275 )
									ret := -0.727273 // sell
						if( basis_max > 0.04299 )
							if( senkou_span_b_displaced <= 56.0593 )
								if( chinkou_span <= 54.1624 )
									ret := 0.000000
								if( chinkou_span > 54.1624 )
									ret := 0.882353 // buy
							if( senkou_span_b_displaced > 56.0593 )
								if( senkou_span_b_displaced <= 56.8918 )
									ret := -0.958333 // sell
								if( senkou_span_b_displaced > 56.8918 )
									ret := -0.310954
				if( chinkou_span > 54.8931 )
					if( senkou_span_b <= 57.13 )
						if( senkou_span_b_displaced <= 54.916 )
							if( senkou_span_b <= 55.594 )
								if( tenkan_sen <= 51.4925 )
									ret := 0.897436 // buy
								if( tenkan_sen > 51.4925 )
									ret := 0.250000
							if( senkou_span_b > 55.594 )
								ret := -0.692308
						if( senkou_span_b_displaced > 54.916 )
							if( tenkan_sen <= 55.9075 )
								if( kinjun_sen <= 55.9824 )
									ret := 0.801418 // buy
								if( kinjun_sen > 55.9824 )
									ret := 0.320000
							if( tenkan_sen > 55.9075 )
								ret := 1.000000 // buy
					if( senkou_span_b > 57.13 )
						if( senkou_span_b_displaced <= 57.9288 )
							if( senkou_span_a_displaced <= 57.4904 )
								if( senkou_span_b_displaced <= 57.7448 )
									ret := 0.434783
								if( senkou_span_b_displaced > 57.7448 )
									ret := -0.250000
							if( senkou_span_a_displaced > 57.4904 )
								if( tenkan_sen <= 56.16 )
									ret := 0.500000
								if( tenkan_sen > 56.16 )
									ret := -0.791667 // sell
						if( senkou_span_b_displaced > 57.9288 )
							if( senkou_span_b_displaced <= 58.2138 )
								ret := 0.500000
							if( senkou_span_b_displaced > 58.2138 )
								if( tenkan_sen <= 56.8054 )
									ret := 1.000000 // buy
								if( tenkan_sen > 56.8054 )
									ret := 0.727273 // buy
			if( basis_minus > -0.39677 )
				if( senkou_span_b_displaced <= 56.1823 )
					if( senkou_span_b_displaced <= 55.9953 )
						if( basis_minus <= 0.929645 )
							if( chinkou_span <= 42.9033 )
								if( kinjun_sen <= 42.9717 )
									ret := -0.201327
								if( kinjun_sen > 42.9717 )
									ret := -0.566279
							if( chinkou_span > 42.9033 )
								if( senkou_span_b_displaced <= 43.367 )
									ret := 0.114286
								if( senkou_span_b_displaced > 43.367 )
									ret := -0.061096
						if( basis_minus > 0.929645 )
							if( senkou_span_b <= 54.4483 )
								if( senkou_span_a_displaced <= 52.952 )
									ret := 0.209302
								if( senkou_span_a_displaced > 52.952 )
									ret := -0.238579
							if( senkou_span_b > 54.4483 )
								if( senkou_span_b_displaced <= 54.0698 )
									ret := 0.985294 // buy
								if( senkou_span_b_displaced > 54.0698 )
									ret := 0.266667
					if( senkou_span_b_displaced > 55.9953 )
						if( senkou_span_a_displaced <= 57.0538 )
							if( chinkou_span <= 55.8897 )
								if( senkou_span_b_displaced <= 56.0675 )
									ret := -0.792453 // sell
								if( senkou_span_b_displaced > 56.0675 )
									ret := -0.420000
							if( chinkou_span > 55.8897 )
								if( basis_minus <= -0.05428 )
									ret := 0.642857
								if( basis_minus > -0.05428 )
									ret := -0.357143
						if( senkou_span_a_displaced > 57.0538 )
							ret := -1.000000 // sell
				if( senkou_span_b_displaced > 56.1823 )
					if( chinkou_span <= 55.8278 )
						if( tenkan_sen <= 56.8681 )
							if( senkou_span_b_displaced <= 56.907 )
								if( senkou_span_a <= 56.955 )
									ret := 0.242424
								if( senkou_span_a > 56.955 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 56.907 )
								if( basis_minus <= -0.359221 )
									ret := -0.100000
								if( basis_minus > -0.359221 )
									ret := -0.813333 // sell
						if( tenkan_sen > 56.8681 )
							if( senkou_span_a_displaced <= 56.5344 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 56.5344 )
								if( basis_max <= 0.184559 )
									ret := -0.222222
								if( basis_max > 0.184559 )
									ret := 0.700000 // buy
					if( chinkou_span > 55.8278 )
						if( tenkan_sen <= 56.9231 )
							if( senkou_span_b <= 56.3805 )
								if( kinjun_sen <= 55.8445 )
									ret := 0.937500 // buy
								if( kinjun_sen > 55.8445 )
									ret := 0.291667
							if( senkou_span_b > 56.3805 )
								if( basis_minus <= -0.20098 )
									ret := 0.972727 // buy
								if( basis_minus > -0.20098 )
									ret := 0.700000 // buy
						if( tenkan_sen > 56.9231 )
							if( senkou_span_b <= 56.9979 )
								ret := 0.750000 // buy
							if( senkou_span_b > 56.9979 )
								ret := -0.076923
		if( tenkan_sen > 57.0713 )
			if( senkou_span_a <= 57.59 )
				if( senkou_span_a_displaced <= 54.6854 )
					ret := 1.000000 // buy
				if( senkou_span_a_displaced > 54.6854 )
					if( tenkan_sen <= 57.521 )
						if( senkou_span_b_displaced <= 58.4971 )
							if( chinkou_span <= 57.7043 )
								if( basis_max <= 0.117746 )
									ret := -0.625000
								if( basis_max > 0.117746 )
									ret := 0.625000
							if( chinkou_span > 57.7043 )
								if( senkou_span_b <= 57.11 )
									ret := 0.877551 // buy
								if( senkou_span_b > 57.11 )
									ret := -0.566667
						if( senkou_span_b_displaced > 58.4971 )
							if( senkou_span_b_displaced <= 59.7074 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 59.7074 )
								ret := -0.900000 // sell
					if( tenkan_sen > 57.521 )
						if( kinjun_sen <= 56.9702 )
							ret := -0.285714
						if( kinjun_sen > 56.9702 )
							if( chinkou_span <= 53.6606 )
								ret := -0.769231 // sell
							if( chinkou_span > 53.6606 )
								if( senkou_span_b_displaced <= 57.0012 )
									ret := -0.959459 // sell
								if( senkou_span_b_displaced > 57.0012 )
									ret := -0.777778 // sell
			if( senkou_span_a > 57.59 )
				if( basis_minus <= 0.683231 )
					if( chinkou_span <= 58.5195 )
						if( senkou_span_a <= 58.3249 )
							if( senkou_span_a_displaced <= 57.9217 )
								if( tenkan_sen <= 58.3176 )
									ret := 0.816901 // buy
								if( tenkan_sen > 58.3176 )
									ret := 0.500000
							if( senkou_span_a_displaced > 57.9217 )
								if( chinkou_span <= 56.9211 )
									ret := -0.880435 // sell
								if( chinkou_span > 56.9211 )
									ret := -0.027907
						if( senkou_span_a > 58.3249 )
							if( senkou_span_b <= 59.84 )
								if( basis_max <= 0.018748 )
									ret := -0.818182 // sell
								if( basis_max > 0.018748 )
									ret := -0.252427
							if( senkou_span_b > 59.84 )
								if( basis_minus <= -1.72717 )
									ret := 0.272727
								if( basis_minus > -1.72717 )
									ret := -0.892617 // sell
					if( chinkou_span > 58.5195 )
						if( tenkan_sen <= 62.9309 )
							if( senkou_span_a <= 62.9901 )
								if( senkou_span_a_displaced <= 61.174 )
									ret := 0.626374
								if( senkou_span_a_displaced > 61.174 )
									ret := 0.170124
							if( senkou_span_a > 62.9901 )
								if( chinkou_span <= 62.4155 )
									ret := 0.000000
								if( chinkou_span > 62.4155 )
									ret := -0.823529 // sell
						if( tenkan_sen > 62.9309 )
							if( basis_minus <= 0.402358 )
								if( senkou_span_b_displaced <= 62.4002 )
									ret := 0.090909
								if( senkou_span_b_displaced > 62.4002 )
									ret := -0.800000 // sell
							if( basis_minus > 0.402358 )
								ret := 0.578947
				if( basis_minus > 0.683231 )
					if( senkou_span_b_displaced <= 58.2522 )
						if( senkou_span_a_displaced <= 58.7687 )
							if( tenkan_sen <= 57.785 )
								if( senkou_span_b_displaced <= 55.9975 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 55.9975 )
									ret := 0.352941
							if( tenkan_sen > 57.785 )
								if( tenkan_sen <= 60.2525 )
									ret := -0.960000 // sell
								if( tenkan_sen > 60.2525 )
									ret := -0.189189
						if( senkou_span_a_displaced > 58.7687 )
							if( basis_max <= -0.001445 )
								ret := 0.100000
							if( basis_max > -0.001445 )
								if( senkou_span_b <= 58.3349 )
									ret := 0.875000 // buy
								if( senkou_span_b > 58.3349 )
									ret := 1.000000 // buy
					if( senkou_span_b_displaced > 58.2522 )
						if( senkou_span_a <= 60.361 )
							if( basis_minus <= 0.953676 )
								ret := -0.466667
							if( basis_minus > 0.953676 )
								ret := -0.187500
						if( senkou_span_a > 60.361 )
							if( kinjun_sen <= 62.8978 )
								if( senkou_span_b_displaced <= 58.5688 )
									ret := -0.886792 // sell
								if( senkou_span_b_displaced > 58.5688 )
									ret := -0.545455
							if( kinjun_sen > 62.8978 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AVAXUSDT_5Min_bc0ba8b7(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


