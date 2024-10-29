//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ETSY_15Min_1ICH_0925c7fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_1ICH_0925c7fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_0925c7fd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a <= 220.203 )
		if( tenkan_sen <= 42.4963 )
			if( chinkou_span <= 41.7314 )
				if( senkou_span_a <= 41.5652 )
					if( basis_max <= 0.532073 )
						if( tenkan_sen <= 41.2337 )
							if( tenkan_sen <= 9.58323 )
								if( tenkan_sen <= 9.529 )
									ret := 0.750000 // buy
								if( tenkan_sen > 9.529 )
									ret := 1.000000 // buy
							if( tenkan_sen > 9.58323 )
								if( chinkou_span <= 40.7741 )
									ret := 0.081188
								if( chinkou_span > 40.7741 )
									ret := 0.407407
						if( tenkan_sen > 41.2337 )
							if( senkou_span_a_displaced <= 42.6472 )
								if( basis_minus <= -0.27299 )
									ret := -0.923077 // sell
								if( basis_minus > -0.27299 )
									ret := -0.298077
							if( senkou_span_a_displaced > 42.6472 )
								if( chinkou_span <= 39.5307 )
									ret := 0.809524 // buy
								if( chinkou_span > 39.5307 )
									ret := -0.533333
					if( basis_max > 0.532073 )
						if( basis_minus <= -1.92722 )
							ret := 1.000000 // buy
						if( basis_minus > -1.92722 )
							if( tenkan_sen <= 31.3867 )
								if( senkou_span_a_displaced <= 34.0151 )
									ret := 0.000000
								if( senkou_span_a_displaced > 34.0151 )
									ret := 0.800000 // buy
							if( tenkan_sen > 31.3867 )
								if( kinjun_sen <= 39.7315 )
									ret := -0.509091
								if( kinjun_sen > 39.7315 )
									ret := -0.892857 // sell
				if( senkou_span_a > 41.5652 )
					if( basis_minus <= -0.440775 )
						if( chinkou_span <= 41.4514 )
							if( kinjun_sen <= 42.2005 )
								if( basis_max <= 0.08125 )
									ret := 0.400000
								if( basis_max > 0.08125 )
									ret := -1.000000 // sell
							if( kinjun_sen > 42.2005 )
								if( basis_max <= 0.242025 )
									ret := -0.200000
								if( basis_max > 0.242025 )
									ret := 0.846154 // buy
						if( chinkou_span > 41.4514 )
							ret := -1.000000 // sell
					if( basis_minus > -0.440775 )
						if( senkou_span_b <= 42.535 )
							if( senkou_span_b_displaced <= 42.194 )
								if( senkou_span_b <= 42.2008 )
									ret := -0.661017
								if( senkou_span_b > 42.2008 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 42.194 )
								if( senkou_span_a_displaced <= 42.291 )
									ret := -0.354430
								if( senkou_span_a_displaced > 42.291 )
									ret := 0.160000
						if( senkou_span_b > 42.535 )
							if( chinkou_span <= 41.0701 )
								if( kinjun_sen <= 42.5785 )
									ret := -1.000000 // sell
								if( kinjun_sen > 42.5785 )
									ret := -0.357143
							if( chinkou_span > 41.0701 )
								if( kinjun_sen <= 42.8383 )
									ret := -0.978261 // sell
								if( kinjun_sen > 42.8383 )
									ret := -0.500000
			if( chinkou_span > 41.7314 )
				if( kinjun_sen <= 42.6106 )
					if( chinkou_span <= 46.0027 )
						if( senkou_span_b <= 42.3606 )
							if( senkou_span_b_displaced <= 42.4236 )
								if( kinjun_sen <= 42.3508 )
									ret := 0.386364
								if( kinjun_sen > 42.3508 )
									ret := -0.140000
							if( senkou_span_b_displaced > 42.4236 )
								if( senkou_span_b_displaced <= 42.469 )
									ret := -0.818182 // sell
								if( senkou_span_b_displaced > 42.469 )
									ret := 0.318182
						if( senkou_span_b > 42.3606 )
							if( senkou_span_b_displaced <= 43.2349 )
								if( tenkan_sen <= 42.225 )
									ret := 0.528000
								if( tenkan_sen > 42.225 )
									ret := 0.843284 // buy
							if( senkou_span_b_displaced > 43.2349 )
								if( basis_max <= 0.23372 )
									ret := -0.250000
								if( basis_max > 0.23372 )
									ret := -0.750000 // sell
					if( chinkou_span > 46.0027 )
						if( basis_minus <= 0.1725 )
							ret := 0.000000
						if( basis_minus > 0.1725 )
							if( basis_minus <= 3.2133 )
								ret := 1.000000 // buy
							if( basis_minus > 3.2133 )
								ret := 0.833333 // buy
				if( kinjun_sen > 42.6106 )
					if( senkou_span_b <= 43.065 )
						if( chinkou_span <= 43.845 )
							if( senkou_span_b <= 42.5443 )
								ret := 0.000000
							if( senkou_span_b > 42.5443 )
								if( basis_minus <= -0.216789 )
									ret := -0.296296
								if( basis_minus > -0.216789 )
									ret := -0.850000 // sell
						if( chinkou_span > 43.845 )
							ret := 0.800000 // buy
					if( senkou_span_b > 43.065 )
						if( senkou_span_a_displaced <= 46.095 )
							if( kinjun_sen <= 42.6663 )
								if( senkou_span_a_displaced <= 43.5295 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 43.5295 )
									ret := 0.000000
							if( kinjun_sen > 42.6663 )
								if( senkou_span_a_displaced <= 43.7282 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 43.7282 )
									ret := 0.700000 // buy
						if( senkou_span_a_displaced > 46.095 )
							ret := -0.500000
		if( tenkan_sen > 42.4963 )
			if( chinkou_span <= 214.32 )
				if( kinjun_sen <= 208.185 )
					if( kinjun_sen <= 42.2025 )
						if( chinkou_span <= 44.9518 )
							if( senkou_span_b_displaced <= 41.135 )
								if( basis_max <= -2.31176 )
									ret := -0.625000
								if( basis_max > -2.31176 )
									ret := -0.887640 // sell
							if( senkou_span_b_displaced > 41.135 )
								ret := 0.000000
						if( chinkou_span > 44.9518 )
							if( basis_max <= -1.02463 )
								if( senkou_span_a_displaced <= 37.3608 )
									ret := -0.500000
								if( senkou_span_a_displaced > 37.3608 )
									ret := 0.714286 // buy
							if( basis_max > -1.02463 )
								ret := 1.000000 // buy
					if( kinjun_sen > 42.2025 )
						if( senkou_span_b_displaced <= 193.837 )
							if( chinkou_span <= 45.1037 )
								if( senkou_span_a <= 44.6092 )
									ret := -0.018836
								if( senkou_span_a > 44.6092 )
									ret := -0.431849
							if( chinkou_span > 45.1037 )
								if( senkou_span_b <= 46.5049 )
									ret := 0.339146
								if( senkou_span_b > 46.5049 )
									ret := 0.038335
						if( senkou_span_b_displaced > 193.837 )
							if( senkou_span_b <= 192.822 )
								if( chinkou_span <= 190.995 )
									ret := -0.034188
								if( chinkou_span > 190.995 )
									ret := 0.783133 // buy
							if( senkou_span_b > 192.822 )
								if( chinkou_span <= 202.815 )
									ret := -0.089888
								if( chinkou_span > 202.815 )
									ret := 0.391659
				if( kinjun_sen > 208.185 )
					if( tenkan_sen <= 214.295 )
						if( kinjun_sen <= 209.415 )
							if( senkou_span_a_displaced <= 207.719 )
								if( chinkou_span <= 208.638 )
									ret := -0.491803
								if( chinkou_span > 208.638 )
									ret := 0.243902
							if( senkou_span_a_displaced > 207.719 )
								if( basis_max <= 0.79375 )
									ret := -0.794393 // sell
								if( basis_max > 0.79375 )
									ret := -0.130435
						if( kinjun_sen > 209.415 )
							if( chinkou_span <= 209.133 )
								if( basis_minus <= -6.13563 )
									ret := 0.205882
								if( basis_minus > -6.13563 )
									ret := -0.349835
							if( chinkou_span > 209.133 )
								if( senkou_span_b_displaced <= 211.54 )
									ret := -0.040541
								if( senkou_span_b_displaced > 211.54 )
									ret := 0.529915
					if( tenkan_sen > 214.295 )
						if( senkou_span_b <= 224.341 )
							if( senkou_span_a <= 215.299 )
								if( chinkou_span <= 210.68 )
									ret := -0.526316
								if( chinkou_span > 210.68 )
									ret := -0.904762 // sell
							if( senkou_span_a > 215.299 )
								if( tenkan_sen <= 215.808 )
									ret := 0.088235
								if( tenkan_sen > 215.808 )
									ret := -0.514085
						if( senkou_span_b > 224.341 )
							ret := 0.750000 // buy
			if( chinkou_span > 214.32 )
				if( kinjun_sen <= 213.342 )
					if( basis_max <= -0.0401 )
						if( chinkou_span <= 217 )
							if( tenkan_sen <= 212.605 )
								if( senkou_span_b_displaced <= 200.122 )
									ret := 0.000000
								if( senkou_span_b_displaced > 200.122 )
									ret := 0.705882 // buy
							if( tenkan_sen > 212.605 )
								if( senkou_span_a_displaced <= 212.481 )
									ret := 0.000000
								if( senkou_span_a_displaced > 212.481 )
									ret := -0.666667
						if( chinkou_span > 217 )
							if( senkou_span_b_displaced <= 212.175 )
								if( senkou_span_b_displaced <= 200.308 )
									ret := 0.375000
								if( senkou_span_b_displaced > 200.308 )
									ret := 0.801980 // buy
							if( senkou_span_b_displaced > 212.175 )
								if( senkou_span_a <= 214.756 )
									ret := 0.000000
								if( senkou_span_a > 214.756 )
									ret := 0.777778 // buy
					if( basis_max > -0.0401 )
						if( basis_max <= 0.374281 )
							if( senkou_span_a <= 208.893 )
								if( senkou_span_b_displaced <= 208.609 )
									ret := -0.791667 // sell
								if( senkou_span_b_displaced > 208.609 )
									ret := 0.600000
							if( senkou_span_a > 208.893 )
								if( senkou_span_a_displaced <= 215.122 )
									ret := 0.500000
								if( senkou_span_a_displaced > 215.122 )
									ret := -0.347826
						if( basis_max > 0.374281 )
							if( senkou_span_a <= 210.874 )
								if( tenkan_sen <= 201.886 )
									ret := -0.500000
								if( tenkan_sen > 201.886 )
									ret := 0.806452 // buy
							if( senkou_span_a > 210.874 )
								if( senkou_span_a_displaced <= 219.88 )
									ret := 0.080000
								if( senkou_span_a_displaced > 219.88 )
									ret := 0.833333 // buy
				if( kinjun_sen > 213.342 )
					if( basis_max <= -0.537762 )
						if( chinkou_span <= 224.012 )
							if( senkou_span_a_displaced <= 214.01 )
								if( senkou_span_b_displaced <= 213.267 )
									ret := -0.188889
								if( senkou_span_b_displaced > 213.267 )
									ret := -0.717391 // sell
							if( senkou_span_a_displaced > 214.01 )
								if( kinjun_sen <= 218.893 )
									ret := 0.096491
								if( kinjun_sen > 218.893 )
									ret := -0.500000
						if( chinkou_span > 224.012 )
							if( basis_minus <= 0.450124 )
								if( kinjun_sen <= 218.299 )
									ret := 1.000000 // buy
								if( kinjun_sen > 218.299 )
									ret := 0.750000 // buy
							if( basis_minus > 0.450124 )
								if( tenkan_sen <= 219.069 )
									ret := 1.000000 // buy
								if( tenkan_sen > 219.069 )
									ret := 0.074074
					if( basis_max > -0.537762 )
						if( senkou_span_b <= 223.624 )
							if( chinkou_span <= 223.184 )
								if( kinjun_sen <= 214.879 )
									ret := 0.451613
								if( kinjun_sen > 214.879 )
									ret := 0.211570
							if( chinkou_span > 223.184 )
								if( tenkan_sen <= 215.967 )
									ret := -0.416667
								if( tenkan_sen > 215.967 )
									ret := 0.656805
						if( senkou_span_b > 223.624 )
							if( kinjun_sen <= 216.097 )
								ret := 1.000000 // buy
							if( kinjun_sen > 216.097 )
								if( senkou_span_b_displaced <= 225.407 )
									ret := 0.071429
								if( senkou_span_b_displaced > 225.407 )
									ret := 1.000000 // buy
	if( senkou_span_a > 220.203 )
		if( chinkou_span <= 222.932 )
			if( chinkou_span <= 216.167 )
				if( senkou_span_a_displaced <= 243.193 )
					if( basis_minus <= -1.42668 )
						if( tenkan_sen <= 226.817 )
							if( senkou_span_a <= 226.409 )
								if( senkou_span_b_displaced <= 224.364 )
									ret := -0.244898
								if( senkou_span_b_displaced > 224.364 )
									ret := -0.851852 // sell
							if( senkou_span_a > 226.409 )
								ret := 0.714286 // buy
						if( tenkan_sen > 226.817 )
							if( senkou_span_b_displaced <= 244.378 )
								ret := -0.714286 // sell
							if( senkou_span_b_displaced > 244.378 )
								if( senkou_span_a_displaced <= 242.031 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 242.031 )
									ret := -0.750000 // sell
					if( basis_minus > -1.42668 )
						if( basis_minus <= 5.48 )
							if( senkou_span_b_displaced <= 221.343 )
								if( chinkou_span <= 215.999 )
									ret := -0.900000 // sell
								if( chinkou_span > 215.999 )
									ret := -0.250000
							if( senkou_span_b_displaced > 221.343 )
								if( basis_minus <= -0.585046 )
									ret := -1.000000 // sell
								if( basis_minus > -0.585046 )
									ret := -0.300000
						if( basis_minus > 5.48 )
							ret := 0.000000
				if( senkou_span_a_displaced > 243.193 )
					ret := 0.428571
			if( chinkou_span > 216.167 )
				if( senkou_span_b <= 222.435 )
					if( senkou_span_b <= 218.789 )
						if( basis_minus <= 7.56291 )
							if( basis_minus <= 1.93215 )
								ret := 0.333333
							if( basis_minus > 1.93215 )
								if( senkou_span_a_displaced <= 218.114 )
									ret := -0.780000 // sell
								if( senkou_span_a_displaced > 218.114 )
									ret := 0.000000
						if( basis_minus > 7.56291 )
							ret := 0.571429
					if( senkou_span_b > 218.789 )
						if( senkou_span_b_displaced <= 219.64 )
							if( chinkou_span <= 220.059 )
								if( basis_minus <= 1.5797 )
									ret := 0.300000
								if( basis_minus > 1.5797 )
									ret := 0.931034 // buy
							if( chinkou_span > 220.059 )
								if( chinkou_span <= 222.291 )
									ret := -0.115385
								if( chinkou_span > 222.291 )
									ret := 0.333333
						if( senkou_span_b_displaced > 219.64 )
							if( senkou_span_a_displaced <= 219.611 )
								if( kinjun_sen <= 220.16 )
									ret := 1.000000 // buy
								if( kinjun_sen > 220.16 )
									ret := 0.142857
							if( senkou_span_a_displaced > 219.611 )
								if( kinjun_sen <= 223.406 )
									ret := -0.107143
								if( kinjun_sen > 223.406 )
									ret := -0.640000
				if( senkou_span_b > 222.435 )
					if( basis_max <= 1.23243 )
						if( basis_max <= -0.063471 )
							if( chinkou_span <= 220.725 )
								if( senkou_span_b <= 223.214 )
									ret := -0.750000 // sell
								if( senkou_span_b > 223.214 )
									ret := -0.947368 // sell
							if( chinkou_span > 220.725 )
								if( basis_minus <= 2.59958 )
									ret := -0.750000 // sell
								if( basis_minus > 2.59958 )
									ret := 0.250000
						if( basis_max > -0.063471 )
							if( senkou_span_b_displaced <= 220.824 )
								if( senkou_span_a_displaced <= 220.18 )
									ret := -0.714286 // sell
								if( senkou_span_a_displaced > 220.18 )
									ret := 0.266667
							if( senkou_span_b_displaced > 220.824 )
								if( senkou_span_a <= 221.295 )
									ret := 0.400000
								if( senkou_span_a > 221.295 )
									ret := -0.643312
					if( basis_max > 1.23243 )
						if( senkou_span_b <= 228.75 )
							if( chinkou_span <= 221.912 )
								ret := 0.000000
							if( chinkou_span > 221.912 )
								ret := -0.250000
						if( senkou_span_b > 228.75 )
							if( kinjun_sen <= 230.371 )
								if( chinkou_span <= 217.799 )
									ret := 1.000000 // buy
								if( chinkou_span > 217.799 )
									ret := 0.750000 // buy
							if( kinjun_sen > 230.371 )
								if( senkou_span_a <= 229.652 )
									ret := -0.333333
								if( senkou_span_a > 229.652 )
									ret := 0.090909
		if( chinkou_span > 222.932 )
			if( senkou_span_b <= 240.408 )
				if( chinkou_span <= 243.807 )
					if( basis_max <= -0.420284 )
						if( senkou_span_b_displaced <= 228.363 )
							if( senkou_span_a_displaced <= 217.435 )
								if( basis_minus <= 2.065 )
									ret := 0.000000
								if( basis_minus > 2.065 )
									ret := -0.744681 // sell
							if( senkou_span_a_displaced > 217.435 )
								if( kinjun_sen <= 234.135 )
									ret := 0.191176
								if( kinjun_sen > 234.135 )
									ret := -0.395833
						if( senkou_span_b_displaced > 228.363 )
							if( chinkou_span <= 231.845 )
								if( senkou_span_a_displaced <= 230.725 )
									ret := -0.923077 // sell
								if( senkou_span_a_displaced > 230.725 )
									ret := -0.538462
							if( chinkou_span > 231.845 )
								if( senkou_span_b_displaced <= 229.467 )
									ret := -0.354839
								if( senkou_span_b_displaced > 229.467 )
									ret := 0.416667
					if( basis_max > -0.420284 )
						if( senkou_span_b <= 228.648 )
							if( basis_minus <= 2.54122 )
								if( senkou_span_b_displaced <= 218.709 )
									ret := 0.826923 // buy
								if( senkou_span_b_displaced > 218.709 )
									ret := 0.482072
							if( basis_minus > 2.54122 )
								if( senkou_span_b_displaced <= 217.722 )
									ret := 0.482759
								if( senkou_span_b_displaced > 217.722 )
									ret := -0.120000
						if( senkou_span_b > 228.648 )
							if( chinkou_span <= 225.995 )
								if( basis_max <= 1.06481 )
									ret := -0.711111 // sell
								if( basis_max > 1.06481 )
									ret := 0.117647
							if( chinkou_span > 225.995 )
								if( basis_max <= 0.05875 )
									ret := -0.177083
								if( basis_max > 0.05875 )
									ret := 0.480000
				if( chinkou_span > 243.807 )
					if( senkou_span_a_displaced <= 241.597 )
						if( basis_max <= -1.14125 )
							if( senkou_span_b <= 233.143 )
								ret := -0.500000
							if( senkou_span_b > 233.143 )
								if( senkou_span_b <= 238.148 )
									ret := 0.000000
								if( senkou_span_b > 238.148 )
									ret := 0.250000
						if( basis_max > -1.14125 )
							if( basis_minus <= 2.85749 )
								if( kinjun_sen <= 241.55 )
									ret := 0.882883 // buy
								if( kinjun_sen > 241.55 )
									ret := 0.250000
							if( basis_minus > 2.85749 )
								if( basis_max <= 0.147582 )
									ret := 0.688889
								if( basis_max > 0.147582 )
									ret := -0.153846
					if( senkou_span_a_displaced > 241.597 )
						if( kinjun_sen <= 238.567 )
							ret := 0.333333
						if( kinjun_sen > 238.567 )
							ret := -1.000000 // sell
			if( senkou_span_b > 240.408 )
				if( chinkou_span <= 286.643 )
					if( basis_max <= 0.731789 )
						if( chinkou_span <= 259.88 )
							if( senkou_span_a <= 240.204 )
								if( chinkou_span <= 237.833 )
									ret := -0.125000
								if( chinkou_span > 237.833 )
									ret := 0.600000
							if( senkou_span_a > 240.204 )
								if( basis_max <= -0.993636 )
									ret := -0.151899
								if( basis_max > -0.993636 )
									ret := -0.652830
						if( chinkou_span > 259.88 )
							if( senkou_span_a <= 263.035 )
								if( kinjun_sen <= 252.408 )
									ret := 0.100000
								if( kinjun_sen > 252.408 )
									ret := 0.783333 // buy
							if( senkou_span_a > 263.035 )
								if( basis_minus <= -4.55455 )
									ret := 0.291667
								if( basis_minus > -4.55455 )
									ret := -0.488263
					if( basis_max > 0.731789 )
						if( basis_minus <= -0.664588 )
							if( basis_max <= 1.50839 )
								if( basis_minus <= -4.38155 )
									ret := 0.693878
								if( basis_minus > -4.38155 )
									ret := 0.254237
							if( basis_max > 1.50839 )
								if( basis_minus <= -5.68328 )
									ret := -0.678571
								if( basis_minus > -5.68328 )
									ret := -0.081081
						if( basis_minus > -0.664588 )
							if( kinjun_sen <= 242.238 )
								ret := -1.000000 // sell
							if( kinjun_sen > 242.238 )
								if( basis_minus <= 0.384108 )
									ret := -0.157895
								if( basis_minus > 0.384108 )
									ret := -0.656250
				if( chinkou_span > 286.643 )
					if( basis_max <= -0.854465 )
						if( basis_minus <= 5.50538 )
							if( senkou_span_b <= 290.894 )
								if( basis_max <= -0.916853 )
									ret := 0.000000
								if( basis_max > -0.916853 )
									ret := 0.600000
							if( senkou_span_b > 290.894 )
								ret := -0.833333 // sell
						if( basis_minus > 5.50538 )
							if( senkou_span_b <= 291.838 )
								if( senkou_span_b <= 287.482 )
									ret := -0.600000
								if( senkou_span_b > 287.482 )
									ret := -0.952381 // sell
							if( senkou_span_b > 291.838 )
								ret := -0.400000
					if( basis_max > -0.854465 )
						if( basis_max <= 1.24 )
							if( senkou_span_a_displaced <= 274.786 )
								ret := 0.000000
							if( senkou_span_a_displaced > 274.786 )
								if( basis_max <= -0.27 )
									ret := 0.441860
								if( basis_max > -0.27 )
									ret := 0.904255 // buy
						if( basis_max > 1.24 )
							if( tenkan_sen <= 280.606 )
								ret := -0.285714
							if( tenkan_sen > 280.606 )
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
float op_operation = decision_tree_0_ETSY_15Min_0925c7fd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


