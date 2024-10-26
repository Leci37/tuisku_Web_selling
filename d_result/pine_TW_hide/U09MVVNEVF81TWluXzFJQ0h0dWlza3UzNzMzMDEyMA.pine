//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SOLUSDT_5Min_1ICH_37330120 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_5Min_1ICH_37330120", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_5Min_37330120(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -0.314157 )
		if( senkou_span_b_displaced <= 186.723 )
			if( chinkou_span <= 182.976 )
				if( senkou_span_a <= 179.727 )
					if( chinkou_span <= 59.4489 )
						if( kinjun_sen <= 57.176 )
							if( chinkou_span <= 43.795 )
								if( senkou_span_b <= 42.2189 )
									ret := -0.561404
								if( senkou_span_b > 42.2189 )
									ret := -0.913043 // sell
							if( chinkou_span > 43.795 )
								if( chinkou_span <= 54.4625 )
									ret := -0.215054
								if( chinkou_span > 54.4625 )
									ret := 0.153846
						if( kinjun_sen > 57.176 )
							if( basis_minus <= 0.650202 )
								if( senkou_span_a_displaced <= 58.175 )
									ret := 0.388889
								if( senkou_span_a_displaced > 58.175 )
									ret := -0.862069 // sell
							if( basis_minus > 0.650202 )
								if( tenkan_sen <= 58.0343 )
									ret := -0.250000
								if( tenkan_sen > 58.0343 )
									ret := -0.896552 // sell
					if( chinkou_span > 59.4489 )
						if( chinkou_span <= 181.073 )
							if( tenkan_sen <= 174.785 )
								if( chinkou_span <= 174.12 )
									ret := -0.013231
								if( chinkou_span > 174.12 )
									ret := 0.495968
							if( tenkan_sen > 174.785 )
								if( chinkou_span <= 175.817 )
									ret := -0.567073
								if( chinkou_span > 175.817 )
									ret := -0.013514
						if( chinkou_span > 181.073 )
							if( senkou_span_b <= 174.386 )
								if( senkou_span_a <= 173.661 )
									ret := 1.000000 // buy
								if( senkou_span_a > 173.661 )
									ret := 0.800000 // buy
							if( senkou_span_b > 174.386 )
								if( senkou_span_a <= 178.127 )
									ret := -0.200000
								if( senkou_span_a > 178.127 )
									ret := 0.681818
				if( senkou_span_a > 179.727 )
					if( tenkan_sen <= 184.295 )
						if( chinkou_span <= 181.309 )
							if( tenkan_sen <= 182.709 )
								if( basis_max <= -0.44368 )
									ret := -0.789062 // sell
								if( basis_max > -0.44368 )
									ret := -0.316667
							if( tenkan_sen > 182.709 )
								if( senkou_span_a <= 181.36 )
									ret := 0.818182 // buy
								if( senkou_span_a > 181.36 )
									ret := -0.571429
						if( chinkou_span > 181.309 )
							if( senkou_span_b_displaced <= 175.985 )
								if( senkou_span_b_displaced <= 174.683 )
									ret := -0.666667
								if( senkou_span_b_displaced > 174.683 )
									ret := 0.882353 // buy
							if( senkou_span_b_displaced > 175.985 )
								if( senkou_span_a_displaced <= 179.228 )
									ret := -0.552239
								if( senkou_span_a_displaced > 179.228 )
									ret := 0.155172
					if( tenkan_sen > 184.295 )
						if( basis_minus <= 0.371308 )
							if( tenkan_sen <= 185.766 )
								ret := -0.666667
							if( tenkan_sen > 185.766 )
								ret := 1.000000 // buy
						if( basis_minus > 0.371308 )
							if( senkou_span_a_displaced <= 185.282 )
								if( basis_max <= -0.325181 )
									ret := -0.905172 // sell
								if( basis_max > -0.325181 )
									ret := -0.500000
							if( senkou_span_a_displaced > 185.282 )
								ret := -0.250000
			if( chinkou_span > 182.976 )
				if( senkou_span_a <= 181.937 )
					if( basis_max <= -0.51553 )
						if( tenkan_sen <= 179.354 )
							if( basis_minus <= 1.24072 )
								if( chinkou_span <= 184.582 )
									ret := 0.900000 // buy
								if( chinkou_span > 184.582 )
									ret := 0.250000
							if( basis_minus > 1.24072 )
								if( senkou_span_b <= 169.909 )
									ret := 0.857143 // buy
								if( senkou_span_b > 169.909 )
									ret := 1.000000 // buy
						if( tenkan_sen > 179.354 )
							if( tenkan_sen <= 180.656 )
								if( senkou_span_b_displaced <= 174.73 )
									ret := -0.400000
								if( senkou_span_b_displaced > 174.73 )
									ret := 0.800000 // buy
							if( tenkan_sen > 180.656 )
								if( senkou_span_a_displaced <= 175.099 )
									ret := 0.586957
								if( senkou_span_a_displaced > 175.099 )
									ret := 0.875000 // buy
					if( basis_max > -0.51553 )
						if( basis_max <= -0.51 )
							ret := -1.000000 // sell
						if( basis_max > -0.51 )
							if( basis_minus <= 1.63478 )
								if( chinkou_span <= 186.234 )
									ret := 0.700000 // buy
								if( chinkou_span > 186.234 )
									ret := 1.000000 // buy
							if( basis_minus > 1.63478 )
								if( senkou_span_b <= 177.319 )
									ret := 1.000000 // buy
								if( senkou_span_b > 177.319 )
									ret := -0.333333
				if( senkou_span_a > 181.937 )
					if( chinkou_span <= 192.319 )
						if( kinjun_sen <= 186.849 )
							if( chinkou_span <= 187.712 )
								if( senkou_span_a_displaced <= 180.99 )
									ret := -0.285714
								if( senkou_span_a_displaced > 180.99 )
									ret := 0.205556
							if( chinkou_span > 187.712 )
								if( kinjun_sen <= 185.44 )
									ret := 0.732673 // buy
								if( kinjun_sen > 185.44 )
									ret := 0.052632
						if( kinjun_sen > 186.849 )
							if( basis_minus <= 0.377182 )
								ret := 1.000000 // buy
							if( basis_minus > 0.377182 )
								if( kinjun_sen <= 187.758 )
									ret := -0.687500
								if( kinjun_sen > 187.758 )
									ret := -0.277778
					if( chinkou_span > 192.319 )
						if( senkou_span_a_displaced <= 185.361 )
							if( basis_max <= -0.71875 )
								if( kinjun_sen <= 188.869 )
									ret := 0.333333
								if( kinjun_sen > 188.869 )
									ret := 0.875000 // buy
							if( basis_max > -0.71875 )
								if( chinkou_span <= 192.905 )
									ret := 1.000000 // buy
								if( chinkou_span > 192.905 )
									ret := 0.750000 // buy
						if( senkou_span_a_displaced > 185.361 )
							if( senkou_span_a_displaced <= 187.072 )
								if( basis_max <= -0.972183 )
									ret := -0.875000 // sell
								if( basis_max > -0.972183 )
									ret := 0.285714
							if( senkou_span_a_displaced > 187.072 )
								if( tenkan_sen <= 192.357 )
									ret := 0.896552 // buy
								if( tenkan_sen > 192.357 )
									ret := 0.000000
		if( senkou_span_b_displaced > 186.723 )
			if( senkou_span_a_displaced <= 198.093 )
				if( tenkan_sen <= 202.58 )
					if( basis_max <= -0.345018 )
						if( basis_minus <= 0.094456 )
							if( basis_max <= -0.67125 )
								if( senkou_span_b_displaced <= 191.17 )
									ret := -0.882353 // sell
								if( senkou_span_b_displaced > 191.17 )
									ret := -0.133333
							if( basis_max > -0.67125 )
								if( chinkou_span <= 194.202 )
									ret := 0.171875
								if( chinkou_span > 194.202 )
									ret := -0.523810
						if( basis_minus > 0.094456 )
							if( chinkou_span <= 192.566 )
								if( senkou_span_b_displaced <= 189.71 )
									ret := -0.488372
								if( senkou_span_b_displaced > 189.71 )
									ret := -0.824324 // sell
							if( chinkou_span > 192.566 )
								if( senkou_span_b_displaced <= 188.155 )
									ret := -0.735294 // sell
								if( senkou_span_b_displaced > 188.155 )
									ret := -0.266010
					if( basis_max > -0.345018 )
						if( chinkou_span <= 190.735 )
							if( chinkou_span <= 189.745 )
								if( kinjun_sen <= 188.965 )
									ret := -1.000000 // sell
								if( kinjun_sen > 188.965 )
									ret := -0.666667
							if( chinkou_span > 189.745 )
								ret := -0.142857
						if( chinkou_span > 190.735 )
							if( senkou_span_a <= 189.456 )
								ret := 1.000000 // buy
							if( senkou_span_a > 189.456 )
								if( senkou_span_a_displaced <= 195.935 )
									ret := 0.206897
								if( senkou_span_a_displaced > 195.935 )
									ret := 1.000000 // buy
				if( tenkan_sen > 202.58 )
					if( basis_minus <= 2.90974 )
						if( senkou_span_a <= 201.752 )
							if( senkou_span_a_displaced <= 196.939 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 196.939 )
								ret := -1.000000 // sell
						if( senkou_span_a > 201.752 )
							ret := -0.400000
					if( basis_minus > 2.90974 )
						ret := -1.000000 // sell
			if( senkou_span_a_displaced > 198.093 )
				if( senkou_span_b <= 200.658 )
					if( chinkou_span <= 197.71 )
						if( chinkou_span <= 197.08 )
							ret := -1.000000 // sell
						if( chinkou_span > 197.08 )
							if( tenkan_sen <= 198.316 )
								ret := -0.250000
							if( tenkan_sen > 198.316 )
								ret := -0.500000
					if( chinkou_span > 197.71 )
						if( senkou_span_b <= 199.402 )
							ret := 0.000000
						if( senkou_span_b > 199.402 )
							if( tenkan_sen <= 201.14 )
								ret := 1.000000 // buy
							if( tenkan_sen > 201.14 )
								if( chinkou_span <= 202.392 )
									ret := 1.000000 // buy
								if( chinkou_span > 202.392 )
									ret := 0.375000
				if( senkou_span_b > 200.658 )
					if( basis_max <= -0.531468 )
						if( kinjun_sen <= 205.228 )
							if( senkou_span_b <= 204.034 )
								if( senkou_span_b_displaced <= 204.118 )
									ret := -0.869565 // sell
								if( senkou_span_b_displaced > 204.118 )
									ret := -1.000000 // sell
							if( senkou_span_b > 204.034 )
								if( tenkan_sen <= 208.032 )
									ret := -0.100000
								if( tenkan_sen > 208.032 )
									ret := -0.937500 // sell
						if( kinjun_sen > 205.228 )
							ret := 0.750000 // buy
					if( basis_max > -0.531468 )
						if( senkou_span_b_displaced <= 201.067 )
							if( senkou_span_a_displaced <= 199.336 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 199.336 )
								if( chinkou_span <= 202.127 )
									ret := -0.800000 // sell
								if( chinkou_span > 202.127 )
									ret := 0.000000
						if( senkou_span_b_displaced > 201.067 )
							if( chinkou_span <= 204.661 )
								ret := -0.285714
							if( chinkou_span > 204.661 )
								if( senkou_span_b_displaced <= 201.668 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 201.668 )
									ret := 1.000000 // buy
	if( basis_max > -0.314157 )
		if( senkou_span_a_displaced <= 145.313 )
			if( chinkou_span <= 143.501 )
				if( senkou_span_a <= 138.332 )
					if( chinkou_span <= 137.173 )
						if( senkou_span_a <= 135.033 )
							if( chinkou_span <= 133.347 )
								if( tenkan_sen <= 131.371 )
									ret := 0.071442
								if( tenkan_sen > 131.371 )
									ret := -0.247585
							if( chinkou_span > 133.347 )
								if( tenkan_sen <= 133.35 )
									ret := 0.535124
								if( tenkan_sen > 133.35 )
									ret := 0.210663
						if( senkou_span_a > 135.033 )
							if( chinkou_span <= 134.557 )
								if( senkou_span_b <= 137.051 )
									ret := -0.417657
								if( senkou_span_b > 137.051 )
									ret := -0.841379 // sell
							if( chinkou_span > 134.557 )
								if( tenkan_sen <= 137.61 )
									ret := 0.026857
								if( tenkan_sen > 137.61 )
									ret := -0.408784
					if( chinkou_span > 137.173 )
						if( chinkou_span <= 138.213 )
							if( kinjun_sen <= 134.897 )
								if( senkou_span_b <= 131.194 )
									ret := -0.238095
								if( senkou_span_b > 131.194 )
									ret := 0.816993 // buy
							if( kinjun_sen > 134.897 )
								if( senkou_span_a <= 135.623 )
									ret := -0.617647
								if( senkou_span_a > 135.623 )
									ret := 0.244413
						if( chinkou_span > 138.213 )
							if( senkou_span_a_displaced <= 141.57 )
								if( basis_minus <= 1.97153 )
									ret := 0.549924
								if( basis_minus > 1.97153 )
									ret := -0.428571
							if( senkou_span_a_displaced > 141.57 )
								if( basis_minus <= -2.37689 )
									ret := -1.000000 // sell
								if( basis_minus > -2.37689 )
									ret := -0.250000
				if( senkou_span_a > 138.332 )
					if( basis_minus <= -1.35628 )
						if( chinkou_span <= 140.007 )
							if( senkou_span_a <= 140.755 )
								if( chinkou_span <= 136.683 )
									ret := -0.777778 // sell
								if( chinkou_span > 136.683 )
									ret := 0.211679
							if( senkou_span_a > 140.755 )
								if( basis_max <= 0.591371 )
									ret := -0.945946 // sell
								if( basis_max > 0.591371 )
									ret := -0.307692
						if( chinkou_span > 140.007 )
							if( basis_minus <= -2.15814 )
								if( kinjun_sen <= 141.685 )
									ret := 0.325301
								if( kinjun_sen > 141.685 )
									ret := -0.923077 // sell
							if( basis_minus > -2.15814 )
								if( tenkan_sen <= 142.408 )
									ret := 0.701863 // buy
								if( tenkan_sen > 142.408 )
									ret := -0.125000
					if( basis_minus > -1.35628 )
						if( chinkou_span <= 138.678 )
							if( kinjun_sen <= 139.492 )
								if( senkou_span_a_displaced <= 139.996 )
									ret := -0.428571
								if( senkou_span_a_displaced > 139.996 )
									ret := 0.121212
							if( kinjun_sen > 139.492 )
								if( senkou_span_a_displaced <= 140.281 )
									ret := -0.256198
								if( senkou_span_a_displaced > 140.281 )
									ret := -0.666667
						if( chinkou_span > 138.678 )
							if( tenkan_sen <= 142.46 )
								if( tenkan_sen <= 139.327 )
									ret := 0.221192
								if( tenkan_sen > 139.327 )
									ret := 0.050526
							if( tenkan_sen > 142.46 )
								if( senkou_span_a <= 143.364 )
									ret := -0.078995
								if( senkou_span_a > 143.364 )
									ret := -0.285467
			if( chinkou_span > 143.501 )
				if( tenkan_sen <= 143.099 )
					if( senkou_span_a_displaced <= 139.823 )
						if( tenkan_sen <= 141.189 )
							if( senkou_span_b_displaced <= 139.783 )
								if( senkou_span_b <= 138.792 )
									ret := 0.818182 // buy
								if( senkou_span_b > 138.792 )
									ret := 0.121212
							if( senkou_span_b_displaced > 139.783 )
								if( basis_minus <= 0.175 )
									ret := 0.727273 // buy
								if( basis_minus > 0.175 )
									ret := -0.484848
						if( tenkan_sen > 141.189 )
							if( kinjun_sen <= 141.164 )
								ret := -0.428571
							if( kinjun_sen > 141.164 )
								if( basis_minus <= 3.7075 )
									ret := -0.750000 // sell
								if( basis_minus > 3.7075 )
									ret := -1.000000 // sell
					if( senkou_span_a_displaced > 139.823 )
						if( senkou_span_b_displaced <= 139.821 )
							if( senkou_span_a_displaced <= 140.08 )
								if( kinjun_sen <= 140.736 )
									ret := 1.000000 // buy
								if( kinjun_sen > 140.736 )
									ret := -0.416667
							if( senkou_span_a_displaced > 140.08 )
								if( basis_minus <= 1.48284 )
									ret := 0.818182 // buy
								if( basis_minus > 1.48284 )
									ret := 0.200000
						if( senkou_span_b_displaced > 139.821 )
							if( senkou_span_a_displaced <= 140.504 )
								if( chinkou_span <= 149.371 )
									ret := 0.972973 // buy
								if( chinkou_span > 149.371 )
									ret := 0.600000
							if( senkou_span_a_displaced > 140.504 )
								if( kinjun_sen <= 143.229 )
									ret := 0.584469
								if( kinjun_sen > 143.229 )
									ret := 0.273684
				if( tenkan_sen > 143.099 )
					if( chinkou_span <= 146.701 )
						if( chinkou_span <= 144.73 )
							if( kinjun_sen <= 144 )
								if( senkou_span_b_displaced <= 141.842 )
									ret := -0.316832
								if( senkou_span_b_displaced > 141.842 )
									ret := 0.262248
							if( kinjun_sen > 144 )
								if( basis_max <= -0.111295 )
									ret := -0.317073
								if( basis_max > -0.111295 )
									ret := -0.019520
						if( chinkou_span > 144.73 )
							if( basis_max <= -0.139932 )
								if( senkou_span_a <= 145.245 )
									ret := 0.149533
								if( senkou_span_a > 145.245 )
									ret := -0.206897
							if( basis_max > -0.139932 )
								if( basis_minus <= 0.01625 )
									ret := 0.444201
								if( basis_minus > 0.01625 )
									ret := 0.239264
					if( chinkou_span > 146.701 )
						if( senkou_span_a <= 144.436 )
							if( chinkou_span <= 146.795 )
								if( senkou_span_a <= 143.605 )
									ret := 1.000000 // buy
								if( senkou_span_a > 143.605 )
									ret := -0.375000
							if( chinkou_span > 146.795 )
								if( tenkan_sen <= 144.164 )
									ret := 0.930233 // buy
								if( tenkan_sen > 144.164 )
									ret := 0.642857
						if( senkou_span_a > 144.436 )
							if( chinkou_span <= 149.646 )
								if( tenkan_sen <= 146.903 )
									ret := 0.408108
								if( tenkan_sen > 146.903 )
									ret := -0.102941
							if( chinkou_span > 149.646 )
								if( senkou_span_a_displaced <= 144.275 )
									ret := 0.294118
								if( senkou_span_a_displaced > 144.275 )
									ret := 0.826087 // buy
		if( senkou_span_a_displaced > 145.313 )
			if( chinkou_span <= 146.148 )
				if( kinjun_sen <= 145.951 )
					if( chinkou_span <= 143.078 )
						if( kinjun_sen <= 144.341 )
							if( senkou_span_b_displaced <= 145.552 )
								if( senkou_span_b_displaced <= 144.998 )
									ret := 0.095238
								if( senkou_span_b_displaced > 144.998 )
									ret := 0.750000 // buy
							if( senkou_span_b_displaced > 145.552 )
								if( senkou_span_b_displaced <= 146.675 )
									ret := -0.375000
								if( senkou_span_b_displaced > 146.675 )
									ret := 0.095238
						if( kinjun_sen > 144.341 )
							if( senkou_span_a <= 144.895 )
								if( senkou_span_b_displaced <= 145.505 )
									ret := 0.000000
								if( senkou_span_b_displaced > 145.505 )
									ret := -0.837838 // sell
							if( senkou_span_a > 144.895 )
								if( senkou_span_b <= 145.57 )
									ret := 0.100000
								if( senkou_span_b > 145.57 )
									ret := -0.405063
					if( chinkou_span > 143.078 )
						if( basis_minus <= -1.70935 )
							if( senkou_span_a_displaced <= 146.42 )
								if( senkou_span_a <= 142.63 )
									ret := 0.000000
								if( senkou_span_a > 142.63 )
									ret := 0.925000 // buy
							if( senkou_span_a_displaced > 146.42 )
								if( senkou_span_b_displaced <= 149.252 )
									ret := 0.057143
								if( senkou_span_b_displaced > 149.252 )
									ret := 1.000000 // buy
						if( basis_minus > -1.70935 )
							if( senkou_span_b_displaced <= 145.194 )
								if( tenkan_sen <= 145.836 )
									ret := -0.154286
								if( tenkan_sen > 145.836 )
									ret := -0.666667
							if( senkou_span_b_displaced > 145.194 )
								if( senkou_span_b_displaced <= 147.252 )
									ret := 0.160740
								if( senkou_span_b_displaced > 147.252 )
									ret := -0.241379
				if( kinjun_sen > 145.951 )
					if( tenkan_sen <= 147.287 )
						if( senkou_span_a_displaced <= 146.263 )
							if( chinkou_span <= 143.83 )
								if( chinkou_span <= 139.65 )
									ret := -0.400000
								if( chinkou_span > 139.65 )
									ret := -0.866667 // sell
							if( chinkou_span > 143.83 )
								if( kinjun_sen <= 146.331 )
									ret := -0.173913
								if( kinjun_sen > 146.331 )
									ret := -0.690909
						if( senkou_span_a_displaced > 146.263 )
							if( chinkou_span <= 145.205 )
								if( basis_minus <= 0.052089 )
									ret := -0.509235
								if( basis_minus > 0.052089 )
									ret := 0.285714
							if( chinkou_span > 145.205 )
								if( tenkan_sen <= 147.029 )
									ret := 0.050971
								if( tenkan_sen > 147.029 )
									ret := -0.410256
					if( tenkan_sen > 147.287 )
						if( basis_max <= 0.449702 )
							if( chinkou_span <= 145.009 )
								if( senkou_span_a_displaced <= 151.635 )
									ret := -0.785714 // sell
								if( senkou_span_a_displaced > 151.635 )
									ret := -0.965116 // sell
							if( chinkou_span > 145.009 )
								if( kinjun_sen <= 147.336 )
									ret := -0.132075
								if( kinjun_sen > 147.336 )
									ret := -0.674757
						if( basis_max > 0.449702 )
							if( senkou_span_b <= 150.512 )
								if( senkou_span_b_displaced <= 151.63 )
									ret := 0.166667
								if( senkou_span_b_displaced > 151.63 )
									ret := -0.500000
							if( senkou_span_b > 150.512 )
								if( tenkan_sen <= 150.574 )
									ret := 0.913043 // buy
								if( tenkan_sen > 150.574 )
									ret := 0.250000
			if( chinkou_span > 146.148 )
				if( kinjun_sen <= 147.102 )
					if( basis_max <= 0.334197 )
						if( senkou_span_b <= 147.172 )
							if( senkou_span_b_displaced <= 142.042 )
								if( tenkan_sen <= 146.525 )
									ret := -1.000000 // sell
								if( tenkan_sen > 146.525 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 142.042 )
								if( chinkou_span <= 153.269 )
									ret := 0.330332
								if( chinkou_span > 153.269 )
									ret := -0.900000 // sell
						if( senkou_span_b > 147.172 )
							if( senkou_span_b <= 149.333 )
								if( basis_minus <= -0.712045 )
									ret := 0.164835
								if( basis_minus > -0.712045 )
									ret := -0.301205
							if( senkou_span_b > 149.333 )
								if( senkou_span_b_displaced <= 150.337 )
									ret := -0.100000
								if( senkou_span_b_displaced > 150.337 )
									ret := -0.933333 // sell
					if( basis_max > 0.334197 )
						if( senkou_span_a_displaced <= 148.408 )
							if( tenkan_sen <= 144.011 )
								if( basis_max <= 0.752538 )
									ret := 0.875000 // buy
								if( basis_max > 0.752538 )
									ret := 1.000000 // buy
							if( tenkan_sen > 144.011 )
								if( basis_minus <= -0.769131 )
									ret := 0.032258
								if( basis_minus > -0.769131 )
									ret := 0.651515
						if( senkou_span_a_displaced > 148.408 )
							if( senkou_span_b <= 146.746 )
								ret := 0.750000 // buy
							if( senkou_span_b > 146.746 )
								if( basis_max <= 0.360369 )
									ret := 0.750000 // buy
								if( basis_max > 0.360369 )
									ret := 1.000000 // buy
				if( kinjun_sen > 147.102 )
					if( tenkan_sen <= 147.34 )
						if( chinkou_span <= 147.419 )
							if( basis_max <= 0.360296 )
								if( senkou_span_a_displaced <= 148.997 )
									ret := -0.296512
								if( senkou_span_a_displaced > 148.997 )
									ret := 0.297297
							if( basis_max > 0.360296 )
								if( basis_max <= 0.453778 )
									ret := 0.576923
								if( basis_max > 0.453778 )
									ret := -0.016949
						if( chinkou_span > 147.419 )
							if( senkou_span_a <= 147.181 )
								if( kinjun_sen <= 147.325 )
									ret := 0.100000
								if( kinjun_sen > 147.325 )
									ret := 0.604167
							if( senkou_span_a > 147.181 )
								if( senkou_span_b_displaced <= 147.482 )
									ret := 0.813333 // buy
								if( senkou_span_b_displaced > 147.482 )
									ret := 0.595041
					if( tenkan_sen > 147.34 )
						if( chinkou_span <= 149.194 )
							if( senkou_span_a <= 150.424 )
								if( senkou_span_b <= 150.43 )
									ret := -0.235175
								if( senkou_span_b > 150.43 )
									ret := 0.125714
							if( senkou_span_a > 150.424 )
								if( basis_minus <= -2.25005 )
									ret := 0.875000 // buy
								if( basis_minus > -2.25005 )
									ret := -0.567460
						if( chinkou_span > 149.194 )
							if( kinjun_sen <= 150.928 )
								if( chinkou_span <= 151.743 )
									ret := 0.249417
								if( chinkou_span > 151.743 )
									ret := 0.721939 // buy
							if( kinjun_sen > 150.928 )
								if( chinkou_span <= 151.472 )
									ret := -0.337888
								if( chinkou_span > 151.472 )
									ret := 0.058623
	
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
float op_operation = decision_tree_0_SOLUSDT_5Min_37330120(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


