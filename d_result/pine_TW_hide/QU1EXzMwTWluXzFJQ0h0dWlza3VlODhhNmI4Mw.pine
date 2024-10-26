//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AMD_30Min_1ICH_e88a6b83 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1ICH_e88a6b83", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_e88a6b83(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a_displaced <= 12.7395 )
		if( chinkou_span <= 12.4903 )
			if( senkou_span_b <= 11.9379 )
				if( chinkou_span <= 11.4821 )
					if( tenkan_sen <= 11.0363 )
						if( chinkou_span <= 11.0002 )
							if( kinjun_sen <= 9.87908 )
								if( chinkou_span <= 9.95889 )
									ret := 0.107126
								if( chinkou_span > 9.95889 )
									ret := 0.707965 // buy
							if( kinjun_sen > 9.87908 )
								if( senkou_span_b <= 9.90623 )
									ret := -0.462185
								if( senkou_span_b > 9.90623 )
									ret := -0.043762
						if( chinkou_span > 11.0002 )
							if( tenkan_sen <= 10.7591 )
								if( kinjun_sen <= 10.2269 )
									ret := 0.111111
								if( kinjun_sen > 10.2269 )
									ret := 0.845588 // buy
							if( tenkan_sen > 10.7591 )
								if( senkou_span_b_displaced <= 10.9277 )
									ret := 0.114943
								if( senkou_span_b_displaced > 10.9277 )
									ret := 0.550000
					if( tenkan_sen > 11.0363 )
						if( chinkou_span <= 11.2793 )
							if( senkou_span_b_displaced <= 12.5297 )
								if( kinjun_sen <= 11.5206 )
									ret := -0.312187
								if( kinjun_sen > 11.5206 )
									ret := -0.745098 // sell
							if( senkou_span_b_displaced > 12.5297 )
								if( senkou_span_a_displaced <= 12.1744 )
									ret := 0.428571
								if( senkou_span_a_displaced > 12.1744 )
									ret := 0.800000 // buy
						if( chinkou_span > 11.2793 )
							if( senkou_span_a <= 11.4591 )
								if( senkou_span_b_displaced <= 11.0116 )
									ret := 0.588235
								if( senkou_span_b_displaced > 11.0116 )
									ret := 0.171642
							if( senkou_span_a > 11.4591 )
								if( senkou_span_b_displaced <= 11.4025 )
									ret := -0.155556
								if( senkou_span_b_displaced > 11.4025 )
									ret := -0.430556
				if( chinkou_span > 11.4821 )
					if( senkou_span_b_displaced <= 11.5558 )
						if( basis_minus <= 0.3449 )
							if( chinkou_span <= 11.6865 )
								if( senkou_span_a <= 11.4645 )
									ret := 0.528139
								if( senkou_span_a > 11.4645 )
									ret := 0.106796
							if( chinkou_span > 11.6865 )
								if( senkou_span_a_displaced <= 11.5272 )
									ret := 0.702632 // buy
								if( senkou_span_a_displaced > 11.5272 )
									ret := 0.442478
						if( basis_minus > 0.3449 )
							if( senkou_span_a <= 11.6613 )
								if( basis_minus <= 0.645 )
									ret := -0.604651
								if( basis_minus > 0.645 )
									ret := 0.400000
							if( senkou_span_a > 11.6613 )
								if( chinkou_span <= 12.205 )
									ret := -0.057971
								if( chinkou_span > 12.205 )
									ret := 0.696429
					if( senkou_span_b_displaced > 11.5558 )
						if( kinjun_sen <= 12.0425 )
							if( senkou_span_a_displaced <= 11.5617 )
								if( basis_minus <= -0.151501 )
									ret := 0.588235
								if( basis_minus > -0.151501 )
									ret := -0.418919
							if( senkou_span_a_displaced > 11.5617 )
								if( senkou_span_b <= 11.915 )
									ret := 0.200846
								if( senkou_span_b > 11.915 )
									ret := 0.594595
						if( kinjun_sen > 12.0425 )
							if( chinkou_span <= 12.1 )
								if( basis_minus <= 0.158875 )
									ret := -0.500000
								if( basis_minus > 0.158875 )
									ret := -0.965517 // sell
							if( chinkou_span > 12.1 )
								ret := 0.500000
			if( senkou_span_b > 11.9379 )
				if( senkou_span_b_displaced <= 12.1747 )
					if( chinkou_span <= 11.7695 )
						if( tenkan_sen <= 12.0004 )
							if( basis_minus <= -0.064183 )
								if( chinkou_span <= 11.3646 )
									ret := -0.838710 // sell
								if( chinkou_span > 11.3646 )
									ret := -0.520000
							if( basis_minus > -0.064183 )
								if( basis_max <= 0.02442 )
									ret := 0.416667
								if( basis_max > 0.02442 )
									ret := -0.250000
						if( tenkan_sen > 12.0004 )
							if( senkou_span_a_displaced <= 11.499 )
								if( tenkan_sen <= 12.5 )
									ret := 0.250000
								if( tenkan_sen > 12.5 )
									ret := -0.750000 // sell
							if( senkou_span_a_displaced > 11.499 )
								if( senkou_span_b <= 12.2847 )
									ret := -0.902439 // sell
								if( senkou_span_b > 12.2847 )
									ret := -0.500000
					if( chinkou_span > 11.7695 )
						if( senkou_span_a_displaced <= 11.8385 )
							if( basis_max <= -0.10875 )
								ret := 0.000000
							if( basis_max > -0.10875 )
								if( senkou_span_a_displaced <= 11.685 )
									ret := 0.400000
								if( senkou_span_a_displaced > 11.685 )
									ret := 0.950000 // buy
						if( senkou_span_a_displaced > 11.8385 )
							if( senkou_span_b_displaced <= 12.1163 )
								if( senkou_span_b_displaced <= 11.6445 )
									ret := 0.350000
								if( senkou_span_b_displaced > 11.6445 )
									ret := -0.241071
							if( senkou_span_b_displaced > 12.1163 )
								if( tenkan_sen <= 11.986 )
									ret := -0.076923
								if( tenkan_sen > 11.986 )
									ret := -0.840000 // sell
				if( senkou_span_b_displaced > 12.1747 )
					if( basis_max <= 0.003869 )
						if( chinkou_span <= 11.7548 )
							if( chinkou_span <= 11.7177 )
								if( senkou_span_a <= 12.1115 )
									ret := -1.000000 // sell
								if( senkou_span_a > 12.1115 )
									ret := -0.750000 // sell
							if( chinkou_span > 11.7177 )
								ret := -0.600000
						if( chinkou_span > 11.7548 )
							if( basis_minus <= 0.224379 )
								if( tenkan_sen <= 12.4025 )
									ret := 0.080460
								if( tenkan_sen > 12.4025 )
									ret := -0.350427
							if( basis_minus > 0.224379 )
								if( senkou_span_b_displaced <= 12.2416 )
									ret := -0.500000
								if( senkou_span_b_displaced > 12.2416 )
									ret := -1.000000 // sell
					if( basis_max > 0.003869 )
						if( tenkan_sen <= 11.3587 )
							if( senkou_span_b_displaced <= 12.8585 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 12.8585 )
								ret := -0.500000
						if( tenkan_sen > 11.3587 )
							if( senkou_span_b <= 12.29 )
								if( senkou_span_b <= 12.0263 )
									ret := -0.243243
								if( senkou_span_b > 12.0263 )
									ret := 0.585714
							if( senkou_span_b > 12.29 )
								if( kinjun_sen <= 12.226 )
									ret := -0.941176 // sell
								if( kinjun_sen > 12.226 )
									ret := -0.035294
		if( chinkou_span > 12.4903 )
			if( senkou_span_a <= 12.39 )
				if( senkou_span_a <= 12.08 )
					if( basis_max <= 0.04 )
						if( tenkan_sen <= 11.955 )
							if( senkou_span_a <= 11.505 )
								ret := 0.000000
							if( senkou_span_a > 11.505 )
								if( senkou_span_a <= 11.8513 )
									ret := 0.653846
								if( senkou_span_a > 11.8513 )
									ret := 1.000000 // buy
						if( tenkan_sen > 11.955 )
							if( senkou_span_a_displaced <= 11.5587 )
								ret := -0.500000
							if( senkou_span_a_displaced > 11.5587 )
								if( basis_minus <= 0.155117 )
									ret := 0.000000
								if( basis_minus > 0.155117 )
									ret := 0.500000
					if( basis_max > 0.04 )
						ret := 1.000000 // buy
				if( senkou_span_a > 12.08 )
					if( chinkou_span <= 12.5299 )
						if( senkou_span_b <= 12.222 )
							if( senkou_span_a_displaced <= 12.0644 )
								ret := 0.333333
							if( senkou_span_a_displaced > 12.0644 )
								ret := 1.000000 // buy
						if( senkou_span_b > 12.222 )
							if( basis_max <= 0.016375 )
								if( basis_max <= -0.115159 )
									ret := 0.200000
								if( basis_max > -0.115159 )
									ret := -0.111111
							if( basis_max > 0.016375 )
								ret := 0.500000
					if( chinkou_span > 12.5299 )
						if( senkou_span_b <= 12.12 )
							if( kinjun_sen <= 12.1211 )
								if( senkou_span_b <= 12.0684 )
									ret := 0.950000 // buy
								if( senkou_span_b > 12.0684 )
									ret := 0.200000
							if( kinjun_sen > 12.1211 )
								if( chinkou_span <= 13.3988 )
									ret := 0.966667 // buy
								if( chinkou_span > 13.3988 )
									ret := 0.750000 // buy
						if( senkou_span_b > 12.12 )
							if( senkou_span_a_displaced <= 12.0927 )
								if( senkou_span_a_displaced <= 12.0173 )
									ret := 0.666667
								if( senkou_span_a_displaced > 12.0173 )
									ret := 0.000000
							if( senkou_span_a_displaced > 12.0927 )
								if( senkou_span_b_displaced <= 11.5555 )
									ret := 0.375000
								if( senkou_span_b_displaced > 11.5555 )
									ret := 0.767606 // buy
			if( senkou_span_a > 12.39 )
				if( chinkou_span <= 13.2109 )
					if( tenkan_sen <= 13.1186 )
						if( senkou_span_b_displaced <= 12.6975 )
							if( senkou_span_a_displaced <= 12.1463 )
								if( senkou_span_b_displaced <= 12.0029 )
									ret := -0.382353
								if( senkou_span_b_displaced > 12.0029 )
									ret := 0.074074
							if( senkou_span_a_displaced > 12.1463 )
								if( kinjun_sen <= 12.6385 )
									ret := 0.676923
								if( kinjun_sen > 12.6385 )
									ret := 0.193833
						if( senkou_span_b_displaced > 12.6975 )
							if( senkou_span_b_displaced <= 12.898 )
								if( senkou_span_b <= 12.4664 )
									ret := 0.750000 // buy
								if( senkou_span_b > 12.4664 )
									ret := -0.345455
							if( senkou_span_b_displaced > 12.898 )
								if( chinkou_span <= 12.6577 )
									ret := 1.000000 // buy
								if( chinkou_span > 12.6577 )
									ret := 0.666667
					if( tenkan_sen > 13.1186 )
						if( senkou_span_a_displaced <= 12.4726 )
							if( senkou_span_a <= 13.1598 )
								if( tenkan_sen <= 13.2117 )
									ret := -0.750000 // sell
								if( tenkan_sen > 13.2117 )
									ret := -1.000000 // sell
							if( senkou_span_a > 13.1598 )
								ret := -0.500000
						if( senkou_span_a_displaced > 12.4726 )
							if( senkou_span_b_displaced <= 12.5749 )
								ret := 0.000000
							if( senkou_span_b_displaced > 12.5749 )
								ret := -0.750000 // sell
				if( chinkou_span > 13.2109 )
					if( basis_max <= -0.052597 )
						if( senkou_span_b <= 13.0986 )
							if( tenkan_sen <= 12.7625 )
								if( chinkou_span <= 13.9175 )
									ret := 0.000000
								if( chinkou_span > 13.9175 )
									ret := 0.400000
							if( tenkan_sen > 12.7625 )
								if( senkou_span_b_displaced <= 12.6835 )
									ret := 0.867133 // buy
								if( senkou_span_b_displaced > 12.6835 )
									ret := 0.421053
						if( senkou_span_b > 13.0986 )
							ret := 0.000000
					if( basis_max > -0.052597 )
						if( senkou_span_b <= 12.8341 )
							if( senkou_span_b <= 12.775 )
								if( chinkou_span <= 13.2255 )
									ret := 0.750000 // buy
								if( chinkou_span > 13.2255 )
									ret := -0.045455
							if( senkou_span_b > 12.775 )
								ret := 1.000000 // buy
						if( senkou_span_b > 12.8341 )
							ret := -0.833333 // sell
	if( senkou_span_a_displaced > 12.7395 )
		if( chinkou_span <= 13.4782 )
			if( tenkan_sen <= 13.7321 )
				if( chinkou_span <= 12.8698 )
					if( chinkou_span <= 11.7741 )
						if( basis_minus <= -0.027689 )
							if( senkou_span_b_displaced <= 13.5064 )
								if( senkou_span_b <= 13.3933 )
									ret := -0.908333 // sell
								if( senkou_span_b > 13.3933 )
									ret := -0.400000
							if( senkou_span_b_displaced > 13.5064 )
								ret := 0.750000 // buy
						if( basis_minus > -0.027689 )
							ret := -0.333333
					if( chinkou_span > 11.7741 )
						if( tenkan_sen <= 11.9078 )
							if( tenkan_sen <= 11.8343 )
								ret := 1.000000 // buy
							if( tenkan_sen > 11.8343 )
								ret := 0.750000 // buy
						if( tenkan_sen > 11.9078 )
							if( senkou_span_a <= 13.6775 )
								if( senkou_span_a <= 12.9445 )
									ret := -0.231263
								if( senkou_span_a > 12.9445 )
									ret := -0.505587
							if( senkou_span_a > 13.6775 )
								if( senkou_span_a_displaced <= 14.3238 )
									ret := 0.888889 // buy
								if( senkou_span_a_displaced > 14.3238 )
									ret := 0.200000
				if( chinkou_span > 12.8698 )
					if( tenkan_sen <= 12.9388 )
						if( basis_minus <= -0.21125 )
							if( senkou_span_a_displaced <= 13.2006 )
								ret := 0.750000 // buy
							if( senkou_span_a_displaced > 13.2006 )
								ret := 1.000000 // buy
						if( basis_minus > -0.21125 )
							if( senkou_span_a_displaced <= 12.8124 )
								if( chinkou_span <= 12.8925 )
									ret := 1.000000 // buy
								if( chinkou_span > 12.8925 )
									ret := 0.125000
							if( senkou_span_a_displaced > 12.8124 )
								if( kinjun_sen <= 13.0004 )
									ret := 0.696629
								if( kinjun_sen > 13.0004 )
									ret := 0.000000
					if( tenkan_sen > 12.9388 )
						if( senkou_span_a_displaced <= 13.1644 )
							if( kinjun_sen <= 13.0449 )
								if( senkou_span_a_displaced <= 13.0669 )
									ret := -0.298701
								if( senkou_span_a_displaced > 13.0669 )
									ret := 0.625000
							if( kinjun_sen > 13.0449 )
								if( kinjun_sen <= 13.1163 )
									ret := 0.284615
								if( kinjun_sen > 13.1163 )
									ret := -0.123288
						if( senkou_span_a_displaced > 13.1644 )
							if( chinkou_span <= 13.2395 )
								if( senkou_span_a <= 13.4828 )
									ret := -0.329060
								if( senkou_span_a > 13.4828 )
									ret := -0.779661 // sell
							if( chinkou_span > 13.2395 )
								if( senkou_span_b <= 13.9615 )
									ret := -0.066667
								if( senkou_span_b > 13.9615 )
									ret := -1.000000 // sell
			if( tenkan_sen > 13.7321 )
				if( basis_max <= -0.14875 )
					ret := 1.000000 // buy
				if( basis_max > -0.14875 )
					if( senkou_span_b_displaced <= 14.3043 )
						if( senkou_span_b_displaced <= 13.8595 )
							if( basis_minus <= 0.070431 )
								if( tenkan_sen <= 13.8224 )
									ret := 0.200000
								if( tenkan_sen > 13.8224 )
									ret := -0.875000 // sell
							if( basis_minus > 0.070431 )
								if( senkou_span_a <= 13.6875 )
									ret := -0.500000
								if( senkou_span_a > 13.6875 )
									ret := -0.968085 // sell
						if( senkou_span_b_displaced > 13.8595 )
							if( senkou_span_a_displaced <= 14.02 )
								if( senkou_span_a_displaced <= 13.7192 )
									ret := -0.545455
								if( senkou_span_a_displaced > 13.7192 )
									ret := 0.235294
							if( senkou_span_a_displaced > 14.02 )
								if( senkou_span_a_displaced <= 14.1894 )
									ret := -0.774194 // sell
								if( senkou_span_a_displaced > 14.1894 )
									ret := -0.250000
					if( senkou_span_b_displaced > 14.3043 )
						if( senkou_span_a_displaced <= 14.8441 )
							if( senkou_span_a_displaced <= 14.3111 )
								if( basis_max <= -0.01625 )
									ret := -1.000000 // sell
								if( basis_max > -0.01625 )
									ret := -0.500000
							if( senkou_span_a_displaced > 14.3111 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 14.8441 )
							if( basis_minus <= -0.237593 )
								ret := -1.000000 // sell
							if( basis_minus > -0.237593 )
								ret := -0.250000
		if( chinkou_span > 13.4782 )
			if( senkou_span_a <= 13.9651 )
				if( chinkou_span <= 14.1319 )
					if( tenkan_sen <= 13.4227 )
						if( basis_max <= 0.027344 )
							if( tenkan_sen <= 12.8173 )
								if( chinkou_span <= 13.7127 )
									ret := 0.969697 // buy
								if( chinkou_span > 13.7127 )
									ret := 0.400000
							if( tenkan_sen > 12.8173 )
								if( tenkan_sen <= 13.1225 )
									ret := 0.191489
								if( tenkan_sen > 13.1225 )
									ret := 0.562500
						if( basis_max > 0.027344 )
							if( senkou_span_b_displaced <= 13.4509 )
								if( kinjun_sen <= 13.0288 )
									ret := 1.000000 // buy
								if( kinjun_sen > 13.0288 )
									ret := -0.217391
							if( senkou_span_b_displaced > 13.4509 )
								if( chinkou_span <= 13.635 )
									ret := 0.190476
								if( chinkou_span > 13.635 )
									ret := 0.793103 // buy
					if( tenkan_sen > 13.4227 )
						if( basis_minus <= 0.162389 )
							if( tenkan_sen <= 13.4793 )
								if( kinjun_sen <= 13.4625 )
									ret := 0.233333
								if( kinjun_sen > 13.4625 )
									ret := 0.843750 // buy
							if( tenkan_sen > 13.4793 )
								if( chinkou_span <= 13.77 )
									ret := 0.028169
								if( chinkou_span > 13.77 )
									ret := 0.300000
						if( basis_minus > 0.162389 )
							if( chinkou_span <= 13.635 )
								if( chinkou_span <= 13.505 )
									ret := -0.500000
								if( chinkou_span > 13.505 )
									ret := -1.000000 // sell
							if( chinkou_span > 13.635 )
								if( senkou_span_a_displaced <= 13.078 )
									ret := 0.285714
								if( senkou_span_a_displaced > 13.078 )
									ret := -0.145455
				if( chinkou_span > 14.1319 )
					if( senkou_span_b <= 13.6075 )
						if( chinkou_span <= 14.4448 )
							if( tenkan_sen <= 14.0199 )
								if( senkou_span_a_displaced <= 13.1106 )
									ret := 0.771429 // buy
								if( senkou_span_a_displaced > 13.1106 )
									ret := 0.950000 // buy
							if( tenkan_sen > 14.0199 )
								ret := 0.333333
						if( chinkou_span > 14.4448 )
							if( kinjun_sen <= 13.4825 )
								ret := 0.000000
							if( kinjun_sen > 13.4825 )
								ret := 0.500000
					if( senkou_span_b > 13.6075 )
						if( senkou_span_b_displaced <= 13.6181 )
							if( senkou_span_a_displaced <= 13.6 )
								ret := 0.500000
							if( senkou_span_a_displaced > 13.6 )
								if( chinkou_span <= 14.1775 )
									ret := -0.500000
								if( chinkou_span > 14.1775 )
									ret := 0.066667
						if( senkou_span_b_displaced > 13.6181 )
							if( senkou_span_a_displaced <= 13.63 )
								ret := -0.600000
							if( senkou_span_a_displaced > 13.63 )
								if( basis_minus <= -0.125513 )
									ret := 0.227273
								if( basis_minus > -0.125513 )
									ret := 0.686441
			if( senkou_span_a > 13.9651 )
				if( senkou_span_b <= 80.8775 )
					if( chinkou_span <= 78.1905 )
						if( senkou_span_a <= 74.8578 )
							if( basis_minus <= -0.448238 )
								if( chinkou_span <= 75.1974 )
									ret := 0.108854
								if( chinkou_span > 75.1974 )
									ret := 0.751381 // buy
							if( basis_minus > -0.448238 )
								if( chinkou_span <= 13.9834 )
									ret := -0.435331
								if( chinkou_span > 13.9834 )
									ret := 0.048993
						if( senkou_span_a > 74.8578 )
							if( basis_minus <= -0.110675 )
								if( senkou_span_b_displaced <= 75.9994 )
									ret := -0.649123
								if( senkou_span_b_displaced > 75.9994 )
									ret := 0.075397
							if( basis_minus > -0.110675 )
								if( chinkou_span <= 74.4965 )
									ret := -0.641921
								if( chinkou_span > 74.4965 )
									ret := -0.230329
					if( chinkou_span > 78.1905 )
						if( tenkan_sen <= 77.5388 )
							if( basis_max <= -0.626998 )
								if( senkou_span_a <= 74.1238 )
									ret := 0.166667
								if( senkou_span_a > 74.1238 )
									ret := -0.650000
							if( basis_max > -0.626998 )
								if( senkou_span_a <= 74.7765 )
									ret := 0.953846 // buy
								if( senkou_span_a > 74.7765 )
									ret := 0.601626
						if( tenkan_sen > 77.5388 )
							if( chinkou_span <= 82.0316 )
								if( tenkan_sen <= 81.4844 )
									ret := 0.133052
								if( tenkan_sen > 81.4844 )
									ret := -0.353293
							if( chinkou_span > 82.0316 )
								if( kinjun_sen <= 80.1975 )
									ret := 0.693182
								if( kinjun_sen > 80.1975 )
									ret := 0.393617
				if( senkou_span_b > 80.8775 )
					if( chinkou_span <= 82.4385 )
						if( senkou_span_a <= 83.6232 )
							if( basis_max <= -0.00252 )
								if( chinkou_span <= 79.9953 )
									ret := -0.786765 // sell
								if( chinkou_span > 79.9953 )
									ret := -0.252212
							if( basis_max > -0.00252 )
								if( senkou_span_b_displaced <= 87.3939 )
									ret := -0.203801
								if( senkou_span_b_displaced > 87.3939 )
									ret := 0.255319
						if( senkou_span_a > 83.6232 )
							if( basis_minus <= -0.542964 )
								if( chinkou_span <= 81.56 )
									ret := -0.840764 // sell
								if( chinkou_span > 81.56 )
									ret := -0.537037
							if( basis_minus > -0.542964 )
								if( basis_max <= 0.126707 )
									ret := -0.696133
								if( basis_max > 0.126707 )
									ret := -0.260417
					if( chinkou_span > 82.4385 )
						if( tenkan_sen <= 82.6901 )
							if( senkou_span_a_displaced <= 81.9221 )
								if( senkou_span_b_displaced <= 80.0529 )
									ret := -0.200000
								if( senkou_span_b_displaced > 80.0529 )
									ret := 0.315436
							if( senkou_span_a_displaced > 81.9221 )
								if( senkou_span_b <= 85.4159 )
									ret := 0.674300
								if( senkou_span_b > 85.4159 )
									ret := 0.037037
						if( tenkan_sen > 82.6901 )
							if( chinkou_span <= 83.7001 )
								if( senkou_span_b <= 85.2642 )
									ret := -0.120000
								if( senkou_span_b > 85.2642 )
									ret := -0.587912
							if( chinkou_span > 83.7001 )
								if( tenkan_sen <= 86.377 )
									ret := 0.267606
								if( tenkan_sen > 86.377 )
									ret := 0.021666
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_e88a6b83(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


