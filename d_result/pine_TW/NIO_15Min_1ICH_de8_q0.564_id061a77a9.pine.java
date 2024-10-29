//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: NIO_15Min_1ICH_061a77a9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_15Min_1ICH_061a77a9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_15Min_061a77a9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -0.01204 )
		if( basis_minus <= 0.283728 )
			if( senkou_span_a <= 46.9679 )
				if( chinkou_span <= 44.9092 )
					if( senkou_span_a_displaced <= 42.6554 )
						if( chinkou_span <= 43.3114 )
							if( chinkou_span <= 7.79834 )
								if( senkou_span_b <= 7.56417 )
									ret := -0.021368
								if( senkou_span_b > 7.56417 )
									ret := -0.440422
							if( chinkou_span > 7.79834 )
								if( senkou_span_a_displaced <= 8.07091 )
									ret := 0.293185
								if( senkou_span_a_displaced > 8.07091 )
									ret := -0.010877
						if( chinkou_span > 43.3114 )
							if( chinkou_span <= 44.088 )
								if( senkou_span_b <= 41.6573 )
									ret := 0.967742 // buy
								if( senkou_span_b > 41.6573 )
									ret := 0.721311 // buy
							if( chinkou_span > 44.088 )
								if( tenkan_sen <= 42.602 )
									ret := -0.750000 // sell
								if( tenkan_sen > 42.602 )
									ret := -0.062500
					if( senkou_span_a_displaced > 42.6554 )
						if( basis_minus <= -1.27077 )
							if( chinkou_span <= 44.5841 )
								if( tenkan_sen <= 45.1619 )
									ret := 1.000000 // buy
								if( tenkan_sen > 45.1619 )
									ret := 0.545455
							if( chinkou_span > 44.5841 )
								ret := -0.400000
						if( basis_minus > -1.27077 )
							if( chinkou_span <= 44.4541 )
								if( kinjun_sen <= 43.5269 )
									ret := -0.277487
								if( kinjun_sen > 43.5269 )
									ret := -0.566038
							if( chinkou_span > 44.4541 )
								if( senkou_span_b_displaced <= 44.2705 )
									ret := 0.636364
								if( senkou_span_b_displaced > 44.2705 )
									ret := -0.190476
				if( chinkou_span > 44.9092 )
					if( senkou_span_a <= 43.4148 )
						if( basis_max <= -0.146533 )
							if( senkou_span_b_displaced <= 42.7158 )
								if( senkou_span_a_displaced <= 42.6612 )
									ret := 0.600000
								if( senkou_span_a_displaced > 42.6612 )
									ret := 0.000000
							if( senkou_span_b_displaced > 42.7158 )
								ret := 0.833333 // buy
						if( basis_max > -0.146533 )
							if( chinkou_span <= 45.875 )
								ret := 1.000000 // buy
							if( chinkou_span > 45.875 )
								ret := 0.750000 // buy
					if( senkou_span_a > 43.4148 )
						if( basis_minus <= -0.53448 )
							if( basis_max <= -0.1375 )
								if( senkou_span_a <= 44.3362 )
									ret := -1.000000 // sell
								if( senkou_span_a > 44.3362 )
									ret := -0.571429
							if( basis_max > -0.1375 )
								if( tenkan_sen <= 44.3304 )
									ret := -0.363636
								if( tenkan_sen > 44.3304 )
									ret := 0.066667
						if( basis_minus > -0.53448 )
							if( senkou_span_b_displaced <= 47.617 )
								if( tenkan_sen <= 45.5275 )
									ret := 0.410788
								if( tenkan_sen > 45.5275 )
									ret := 0.067114
							if( senkou_span_b_displaced > 47.617 )
								if( chinkou_span <= 45.901 )
									ret := 0.250000
								if( chinkou_span > 45.901 )
									ret := 0.942857 // buy
			if( senkou_span_a > 46.9679 )
				if( basis_minus <= -1.465 )
					if( basis_max <= -0.033143 )
						ret := -1.000000 // sell
					if( basis_max > -0.033143 )
						ret := -0.500000
				if( basis_minus > -1.465 )
					if( basis_minus <= 0.089624 )
						if( basis_max <= -0.162487 )
							if( senkou_span_a_displaced <= 54.1366 )
								if( chinkou_span <= 53.0955 )
									ret := -0.750000 // sell
								if( chinkou_span > 53.0955 )
									ret := 0.000000
							if( senkou_span_a_displaced > 54.1366 )
								if( basis_max <= -0.68875 )
									ret := -1.000000 // sell
								if( basis_max > -0.68875 )
									ret := -0.094118
						if( basis_max > -0.162487 )
							if( chinkou_span <= 61.8319 )
								if( senkou_span_b_displaced <= 51.8267 )
									ret := 0.197674
								if( senkou_span_b_displaced > 51.8267 )
									ret := -0.220339
							if( chinkou_span > 61.8319 )
								if( tenkan_sen <= 62.4349 )
									ret := 0.918919 // buy
								if( tenkan_sen > 62.4349 )
									ret := -0.400000
					if( basis_minus > 0.089624 )
						if( chinkou_span <= 53.145 )
							if( senkou_span_b <= 53.5042 )
								if( chinkou_span <= 48.44 )
									ret := -0.735294 // sell
								if( chinkou_span > 48.44 )
									ret := -0.391304
							if( senkou_span_b > 53.5042 )
								ret := -1.000000 // sell
						if( chinkou_span > 53.145 )
							if( tenkan_sen <= 58.3119 )
								if( chinkou_span <= 59.4067 )
									ret := 0.210526
								if( chinkou_span > 59.4067 )
									ret := 0.909091 // buy
							if( tenkan_sen > 58.3119 )
								if( chinkou_span <= 59.32 )
									ret := -0.804878 // sell
								if( chinkou_span > 59.32 )
									ret := -0.227273
		if( basis_minus > 0.283728 )
			if( senkou_span_a_displaced <= 20.8093 )
				if( senkou_span_a_displaced <= 6.23944 )
					if( tenkan_sen <= 4.11677 )
						ret := 0.833333 // buy
					if( tenkan_sen > 4.11677 )
						if( kinjun_sen <= 3.97466 )
							if( basis_max <= -0.240612 )
								ret := -0.750000 // sell
							if( basis_max > -0.240612 )
								ret := -1.000000 // sell
						if( kinjun_sen > 3.97466 )
							if( kinjun_sen <= 7.01852 )
								if( basis_minus <= 0.378417 )
									ret := -0.116279
								if( basis_minus > 0.378417 )
									ret := -0.727273 // sell
							if( kinjun_sen > 7.01852 )
								ret := -1.000000 // sell
				if( senkou_span_a_displaced > 6.23944 )
					if( senkou_span_b <= 10.0111 )
						if( chinkou_span <= 9.51052 )
							if( tenkan_sen <= 7.3775 )
								if( chinkou_span <= 6.8013 )
									ret := 0.911765 // buy
								if( chinkou_span > 6.8013 )
									ret := 0.363636
							if( tenkan_sen > 7.3775 )
								if( senkou_span_a <= 7.53261 )
									ret := -0.844444 // sell
								if( senkou_span_a > 7.53261 )
									ret := 0.236641
						if( chinkou_span > 9.51052 )
							if( basis_max <= -0.618407 )
								ret := -1.000000 // sell
							if( basis_max > -0.618407 )
								if( chinkou_span <= 11.4614 )
									ret := 0.691057
								if( chinkou_span > 11.4614 )
									ret := 0.931818 // buy
					if( senkou_span_b > 10.0111 )
						if( senkou_span_b_displaced <= 10.4783 )
							if( kinjun_sen <= 10.6375 )
								if( senkou_span_a_displaced <= 10.0762 )
									ret := -0.159091
								if( senkou_span_a_displaced > 10.0762 )
									ret := 0.615385
							if( kinjun_sen > 10.6375 )
								if( basis_max <= -0.172422 )
									ret := 0.000000
								if( basis_max > -0.172422 )
									ret := -0.676471
						if( senkou_span_b_displaced > 10.4783 )
							if( chinkou_span <= 20.8458 )
								if( senkou_span_a_displaced <= 11.4001 )
									ret := 0.550239
								if( senkou_span_a_displaced > 11.4001 )
									ret := 0.064516
							if( chinkou_span > 20.8458 )
								if( tenkan_sen <= 21.5704 )
									ret := 0.561514
								if( tenkan_sen > 21.5704 )
									ret := 0.080645
			if( senkou_span_a_displaced > 20.8093 )
				if( chinkou_span <= 23.6421 )
					if( chinkou_span <= 21.3414 )
						if( chinkou_span <= 20.7 )
							if( basis_max <= -0.04375 )
								ret := 0.000000
							if( basis_max > -0.04375 )
								ret := -0.500000
						if( chinkou_span > 20.7 )
							if( basis_max <= -0.14375 )
								if( basis_max <= -0.19625 )
									ret := -0.750000 // sell
								if( basis_max > -0.19625 )
									ret := 0.250000
							if( basis_max > -0.14375 )
								if( chinkou_span <= 20.9877 )
									ret := -1.000000 // sell
								if( chinkou_span > 20.9877 )
									ret := -0.708333 // sell
					if( chinkou_span > 21.3414 )
						if( senkou_span_b_displaced <= 21.0524 )
							if( chinkou_span <= 22.1742 )
								if( chinkou_span <= 22.1569 )
									ret := 0.047619
								if( chinkou_span > 22.1569 )
									ret := -1.000000 // sell
							if( chinkou_span > 22.1742 )
								if( senkou_span_a <= 22.3143 )
									ret := 0.695652
								if( senkou_span_a > 22.3143 )
									ret := 0.214286
						if( senkou_span_b_displaced > 21.0524 )
							if( basis_max <= -0.20125 )
								if( kinjun_sen <= 22.2751 )
									ret := -0.294118
								if( kinjun_sen > 22.2751 )
									ret := -0.944444 // sell
							if( basis_max > -0.20125 )
								if( senkou_span_b_displaced <= 21.6791 )
									ret := -0.500000
								if( senkou_span_b_displaced > 21.6791 )
									ret := -0.106061
				if( chinkou_span > 23.6421 )
					if( senkou_span_a <= 27.904 )
						if( senkou_span_a_displaced <= 21.5613 )
							if( chinkou_span <= 26.567 )
								if( kinjun_sen <= 22.6199 )
									ret := 1.000000 // buy
								if( kinjun_sen > 22.6199 )
									ret := 0.826087 // buy
							if( chinkou_span > 26.567 )
								ret := 0.500000
						if( senkou_span_a_displaced > 21.5613 )
							if( chinkou_span <= 26.0171 )
								if( senkou_span_b_displaced <= 22.7025 )
									ret := -0.380000
								if( senkou_span_b_displaced > 22.7025 )
									ret := 0.283582
							if( chinkou_span > 26.0171 )
								if( senkou_span_a <= 26.6868 )
									ret := 0.735632 // buy
								if( senkou_span_a > 26.6868 )
									ret := 0.270270
					if( senkou_span_a > 27.904 )
						if( chinkou_span <= 46.1833 )
							if( senkou_span_a <= 44.1251 )
								if( chinkou_span <= 41.9482 )
									ret := -0.031088
								if( chinkou_span > 41.9482 )
									ret := 0.270619
							if( senkou_span_a > 44.1251 )
								if( senkou_span_b <= 45.815 )
									ret := -0.240506
								if( senkou_span_b > 45.815 )
									ret := -0.733333 // sell
						if( chinkou_span > 46.1833 )
							if( tenkan_sen <= 45.7761 )
								if( senkou_span_a_displaced <= 42.5963 )
									ret := 0.125000
								if( senkou_span_a_displaced > 42.5963 )
									ret := 0.666667
							if( tenkan_sen > 45.7761 )
								if( senkou_span_b <= 62.1825 )
									ret := 0.103359
								if( senkou_span_b > 62.1825 )
									ret := -0.923077 // sell
	if( basis_max > -0.01204 )
		if( basis_minus <= 0.053459 )
			if( senkou_span_b_displaced <= 2.61442 )
				if( senkou_span_b_displaced <= 2.31101 )
					if( basis_max <= -0.005775 )
						if( senkou_span_a_displaced <= 2.07423 )
							if( senkou_span_a_displaced <= 1.55933 )
								if( senkou_span_a_displaced <= 1.45696 )
									ret := -0.060000
								if( senkou_span_a_displaced > 1.45696 )
									ret := 0.584337
							if( senkou_span_a_displaced > 1.55933 )
								if( chinkou_span <= 1.72762 )
									ret := -0.638889
								if( chinkou_span > 1.72762 )
									ret := 0.175000
						if( senkou_span_a_displaced > 2.07423 )
							if( tenkan_sen <= 2.20474 )
								if( senkou_span_b_displaced <= 2.27184 )
									ret := 0.940000 // buy
								if( senkou_span_b_displaced > 2.27184 )
									ret := 0.000000
							if( tenkan_sen > 2.20474 )
								if( senkou_span_b_displaced <= 2.197 )
									ret := 0.909091 // buy
								if( senkou_span_b_displaced > 2.197 )
									ret := 0.142857
					if( basis_max > -0.005775 )
						if( chinkou_span <= 1.5501 )
							if( basis_minus <= -0.045213 )
								if( senkou_span_a_displaced <= 1.44461 )
									ret := -0.882353 // sell
								if( senkou_span_a_displaced > 1.44461 )
									ret := 0.601626
							if( basis_minus > -0.045213 )
								if( senkou_span_a <= 1.53469 )
									ret := -0.018349
								if( senkou_span_a > 1.53469 )
									ret := -0.596026
						if( chinkou_span > 1.5501 )
							if( tenkan_sen <= 1.55192 )
								if( basis_minus <= 0.02432 )
									ret := 0.681992
								if( basis_minus > 0.02432 )
									ret := -0.375000
							if( tenkan_sen > 1.55192 )
								if( chinkou_span <= 1.8434 )
									ret := -0.100730
								if( chinkou_span > 1.8434 )
									ret := 0.149859
				if( senkou_span_b_displaced > 2.31101 )
					if( chinkou_span <= 2.77028 )
						if( senkou_span_b <= 2.5539 )
							if( chinkou_span <= 2.32319 )
								if( senkou_span_a <= 2.30603 )
									ret := 0.545455
								if( senkou_span_a > 2.30603 )
									ret := -0.166667
							if( chinkou_span > 2.32319 )
								if( senkou_span_a <= 2.40492 )
									ret := 0.626168
								if( senkou_span_a > 2.40492 )
									ret := 0.364621
						if( senkou_span_b > 2.5539 )
							if( senkou_span_a <= 2.53063 )
								if( tenkan_sen <= 2.47928 )
									ret := -0.142857
								if( tenkan_sen > 2.47928 )
									ret := -0.850000 // sell
							if( senkou_span_a > 2.53063 )
								if( basis_minus <= 0.015175 )
									ret := 0.259868
								if( basis_minus > 0.015175 )
									ret := -0.258427
					if( chinkou_span > 2.77028 )
						if( senkou_span_b_displaced <= 2.4865 )
							if( basis_max <= 0.00875 )
								ret := 1.000000 // buy
							if( basis_max > 0.00875 )
								ret := 0.000000
						if( senkou_span_b_displaced > 2.4865 )
							if( basis_minus <= 0.009579 )
								if( chinkou_span <= 3.4257 )
									ret := 1.000000 // buy
								if( chinkou_span > 3.4257 )
									ret := 0.933333 // buy
							if( basis_minus > 0.009579 )
								if( chinkou_span <= 2.79757 )
									ret := -0.250000
								if( chinkou_span > 2.79757 )
									ret := 0.920000 // buy
			if( senkou_span_b_displaced > 2.61442 )
				if( basis_minus <= -1.97697 )
					if( senkou_span_a <= 44.02 )
						ret := 1.000000 // buy
					if( senkou_span_a > 44.02 )
						if( kinjun_sen <= 48.08 )
							if( senkou_span_b <= 48.1825 )
								if( senkou_span_a <= 44.5161 )
									ret := -0.973684 // sell
								if( senkou_span_a > 44.5161 )
									ret := -0.328358
							if( senkou_span_b > 48.1825 )
								if( basis_minus <= -1.98676 )
									ret := -0.947368 // sell
								if( basis_minus > -1.98676 )
									ret := -0.500000
						if( kinjun_sen > 48.08 )
							if( basis_max <= 0.113631 )
								if( kinjun_sen <= 50.6908 )
									ret := 0.000000
								if( kinjun_sen > 50.6908 )
									ret := -0.555556
							if( basis_max > 0.113631 )
								if( senkou_span_b <= 51.092 )
									ret := 0.000000
								if( senkou_span_b > 51.092 )
									ret := 1.000000 // buy
				if( basis_minus > -1.97697 )
					if( basis_max <= 0.017504 )
						if( tenkan_sen <= 7.71336 )
							if( chinkou_span <= 7.4707 )
								if( kinjun_sen <= 7.50962 )
									ret := 0.025179
								if( kinjun_sen > 7.50962 )
									ret := -0.375758
							if( chinkou_span > 7.4707 )
								if( senkou_span_b <= 7.3125 )
									ret := 0.845455 // buy
								if( senkou_span_b > 7.3125 )
									ret := 0.399478
						if( tenkan_sen > 7.71336 )
							if( senkou_span_b <= 7.95471 )
								if( chinkou_span <= 7.64785 )
									ret := -0.625874
								if( chinkou_span > 7.64785 )
									ret := -0.002232
							if( senkou_span_b > 7.95471 )
								if( chinkou_span <= 8.29874 )
									ret := -0.282640
								if( chinkou_span > 8.29874 )
									ret := 0.011589
					if( basis_max > 0.017504 )
						if( senkou_span_b_displaced <= 6.15465 )
							if( chinkou_span <= 2.94894 )
								if( senkou_span_b_displaced <= 3.14619 )
									ret := -0.075993
								if( senkou_span_b_displaced > 3.14619 )
									ret := -0.811594 // sell
							if( chinkou_span > 2.94894 )
								if( senkou_span_a_displaced <= 3.53438 )
									ret := 0.433333
								if( senkou_span_a_displaced > 3.53438 )
									ret := 0.124089
						if( senkou_span_b_displaced > 6.15465 )
							if( basis_minus <= -1.69606 )
								if( senkou_span_a <= 46.1947 )
									ret := 0.831933 // buy
								if( senkou_span_a > 46.1947 )
									ret := 0.232143
							if( basis_minus > -1.69606 )
								if( senkou_span_b_displaced <= 6.17211 )
									ret := -0.643836
								if( senkou_span_b_displaced > 6.17211 )
									ret := 0.061526
		if( basis_minus > 0.053459 )
			if( senkou_span_b_displaced <= 2.59624 )
				if( senkou_span_a_displaced <= 2.375 )
					if( chinkou_span <= 1.705 )
						if( senkou_span_a_displaced <= 1.59796 )
							if( chinkou_span <= 1.617 )
								if( basis_minus <= 0.073432 )
									ret := 0.833333 // buy
								if( basis_minus > 0.073432 )
									ret := -0.400000
							if( chinkou_span > 1.617 )
								if( basis_minus <= 0.17721 )
									ret := -1.000000 // sell
								if( basis_minus > 0.17721 )
									ret := -0.800000 // sell
						if( senkou_span_a_displaced > 1.59796 )
							if( kinjun_sen <= 1.70955 )
								if( tenkan_sen <= 1.63428 )
									ret := -0.777778 // sell
								if( tenkan_sen > 1.63428 )
									ret := -1.000000 // sell
							if( kinjun_sen > 1.70955 )
								ret := -0.500000
					if( chinkou_span > 1.705 )
						if( cross_up_tenkan_kinjunInt <= 0.5 )
							if( basis_minus <= 0.073257 )
								if( senkou_span_a_displaced <= 2.28971 )
									ret := 0.359551
								if( senkou_span_a_displaced > 2.28971 )
									ret := -0.583333
							if( basis_minus > 0.073257 )
								if( chinkou_span <= 2.115 )
									ret := 0.500000
								if( chinkou_span > 2.115 )
									ret := 0.947368 // buy
						if( cross_up_tenkan_kinjunInt > 0.5 )
							ret := -0.666667
				if( senkou_span_a_displaced > 2.375 )
					if( basis_max <= -0.00932 )
						if( basis_minus <= 0.0625 )
							ret := 0.714286 // buy
						if( basis_minus > 0.0625 )
							ret := 0.000000
					if( basis_max > -0.00932 )
						if( chinkou_span <= 2.56323 )
							if( senkou_span_a <= 2.44041 )
								if( kinjun_sen <= 2.44182 )
									ret := -0.833333 // sell
								if( kinjun_sen > 2.44182 )
									ret := 0.200000
							if( senkou_span_a > 2.44041 )
								if( chinkou_span <= 2.43364 )
									ret := -1.000000 // sell
								if( chinkou_span > 2.43364 )
									ret := -0.642857
						if( chinkou_span > 2.56323 )
							if( senkou_span_a_displaced <= 2.6104 )
								if( basis_max <= -0.00172 )
									ret := 0.000000
								if( basis_max > -0.00172 )
									ret := 0.705882 // buy
							if( senkou_span_a_displaced > 2.6104 )
								if( chinkou_span <= 2.67014 )
									ret := -0.250000
								if( chinkou_span > 2.67014 )
									ret := -0.888889 // sell
			if( senkou_span_b_displaced > 2.59624 )
				if( senkou_span_b_displaced <= 10.0225 )
					if( chinkou_span <= 9.09843 )
						if( senkou_span_b_displaced <= 4.58408 )
							if( basis_minus <= 0.102811 )
								if( senkou_span_b_displaced <= 3.26594 )
									ret := 0.068571
								if( senkou_span_b_displaced > 3.26594 )
									ret := 0.325109
							if( basis_minus > 0.102811 )
								if( senkou_span_a_displaced <= 3.65971 )
									ret := 0.680851
								if( senkou_span_a_displaced > 3.65971 )
									ret := 0.413043
						if( senkou_span_b_displaced > 4.58408 )
							if( chinkou_span <= 4.92976 )
								if( chinkou_span <= 4.55466 )
									ret := -0.956522 // sell
								if( chinkou_span > 4.55466 )
									ret := -0.333333
							if( chinkou_span > 4.92976 )
								if( senkou_span_a_displaced <= 7.82596 )
									ret := 0.210674
								if( senkou_span_a_displaced > 7.82596 )
									ret := 0.014815
					if( chinkou_span > 9.09843 )
						if( kinjun_sen <= 12.01 )
							if( senkou_span_b_displaced <= 9.25473 )
								if( basis_minus <= 0.216117 )
									ret := 0.763006 // buy
								if( basis_minus > 0.216117 )
									ret := 0.430233
							if( senkou_span_b_displaced > 9.25473 )
								if( chinkou_span <= 9.70146 )
									ret := -0.360656
								if( chinkou_span > 9.70146 )
									ret := 0.583012
						if( kinjun_sen > 12.01 )
							ret := -1.000000 // sell
				if( senkou_span_b_displaced > 10.0225 )
					if( tenkan_sen <= 62.5133 )
						if( basis_minus <= 0.341907 )
							if( chinkou_span <= 10.5993 )
								if( senkou_span_b_displaced <= 10.5015 )
									ret := -0.201835
								if( senkou_span_b_displaced > 10.5015 )
									ret := -0.769231 // sell
							if( chinkou_span > 10.5993 )
								if( senkou_span_b_displaced <= 11.0475 )
									ret := 0.366337
								if( senkou_span_b_displaced > 11.0475 )
									ret := 0.070810
						if( basis_minus > 0.341907 )
							if( kinjun_sen <= 13.2124 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := 0.654412
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := -0.333333
							if( kinjun_sen > 13.2124 )
								if( senkou_span_b_displaced <= 42.3662 )
									ret := 0.118570
								if( senkou_span_b_displaced > 42.3662 )
									ret := 0.305720
					if( tenkan_sen > 62.5133 )
						if( senkou_span_a_displaced <= 62.6237 )
							if( senkou_span_a <= 64.1988 )
								if( tenkan_sen <= 62.6325 )
									ret := -0.333333
								if( tenkan_sen > 62.6325 )
									ret := -0.923077 // sell
							if( senkou_span_a > 64.1988 )
								ret := 0.500000
						if( senkou_span_a_displaced > 62.6237 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_NIO_15Min_061a77a9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


