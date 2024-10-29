//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: PYPL_1Min_1ICH_dea06416 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1ICH_dea06416", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_dea06416(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 66.4407 )
		if( tenkan_sen <= 66.2206 )
			if( chinkou_span <= 65.3016 )
				if( senkou_span_a <= 65.0733 )
					if( chinkou_span <= 64.8002 )
						if( senkou_span_a <= 64.702 )
							if( basis_max <= 0.091613 )
								if( chinkou_span <= 64.2001 )
									ret := 0.013767
								if( chinkou_span > 64.2001 )
									ret := 0.150365
							if( basis_max > 0.091613 )
								if( chinkou_span <= 59.3669 )
									ret := -0.099526
								if( chinkou_span > 59.3669 )
									ret := 0.299184
						if( senkou_span_a > 64.702 )
							if( kinjun_sen <= 65.1202 )
								if( senkou_span_a_displaced <= 65.148 )
									ret := -0.279851
								if( senkou_span_a_displaced > 65.148 )
									ret := -0.865672 // sell
							if( kinjun_sen > 65.1202 )
								if( senkou_span_b <= 65.1944 )
									ret := 1.000000 // buy
								if( senkou_span_b > 65.1944 )
									ret := 0.000000
					if( chinkou_span > 64.8002 )
						if( basis_minus <= -0.077926 )
							if( kinjun_sen <= 64.3492 )
								ret := 1.000000 // buy
							if( kinjun_sen > 64.3492 )
								if( senkou_span_a <= 64.5387 )
									ret := -0.384615
								if( senkou_span_a > 64.5387 )
									ret := 0.574163
						if( basis_minus > -0.077926 )
							if( basis_max <= 0.058522 )
								if( senkou_span_b_displaced <= 64.2946 )
									ret := 0.521127
								if( senkou_span_b_displaced > 64.2946 )
									ret := 0.208820
							if( basis_max > 0.058522 )
								if( chinkou_span <= 64.8698 )
									ret := 0.200000
								if( chinkou_span > 64.8698 )
									ret := -1.000000 // sell
				if( senkou_span_a > 65.0733 )
					if( tenkan_sen <= 65.1953 )
						if( senkou_span_b <= 65.113 )
							if( chinkou_span <= 64.8093 )
								if( tenkan_sen <= 65.1712 )
									ret := 0.437500
								if( tenkan_sen > 65.1712 )
									ret := -0.750000 // sell
							if( chinkou_span > 64.8093 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := -0.620690
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := 0.500000
						if( senkou_span_b > 65.113 )
							if( basis_minus <= -0.025176 )
								if( kinjun_sen <= 65.2004 )
									ret := 0.173333
								if( kinjun_sen > 65.2004 )
									ret := -0.389313
							if( basis_minus > -0.025176 )
								if( chinkou_span <= 65.0886 )
									ret := -0.500000
								if( chinkou_span > 65.0886 )
									ret := 0.925926 // buy
					if( tenkan_sen > 65.1953 )
						if( senkou_span_b_displaced <= 64.515 )
							if( tenkan_sen <= 65.2414 )
								if( senkou_span_a_displaced <= 64.8304 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 64.8304 )
									ret := 1.000000 // buy
							if( tenkan_sen > 65.2414 )
								if( senkou_span_b <= 64.6516 )
									ret := -1.000000 // sell
								if( senkou_span_b > 64.6516 )
									ret := -0.222222
						if( senkou_span_b_displaced > 64.515 )
							if( chinkou_span <= 65.2399 )
								if( senkou_span_a_displaced <= 66.88 )
									ret := -0.607034
								if( senkou_span_a_displaced > 66.88 )
									ret := 0.500000
							if( chinkou_span > 65.2399 )
								if( senkou_span_a <= 65.4816 )
									ret := 0.098039
								if( senkou_span_a > 65.4816 )
									ret := -0.255319
			if( chinkou_span > 65.3016 )
				if( tenkan_sen <= 65.3348 )
					if( chinkou_span <= 66.1348 )
						if( senkou_span_b <= 64.2848 )
							if( chinkou_span <= 65.3893 )
								ret := 0.500000
							if( chinkou_span > 65.3893 )
								ret := 1.000000 // buy
						if( senkou_span_b > 64.2848 )
							if( chinkou_span <= 65.3709 )
								if( kinjun_sen <= 65.4675 )
									ret := 0.234234
								if( kinjun_sen > 65.4675 )
									ret := 1.000000 // buy
							if( chinkou_span > 65.3709 )
								if( basis_max <= -0.022393 )
									ret := 0.403315
								if( basis_max > -0.022393 )
									ret := 0.660714
					if( chinkou_span > 66.1348 )
						if( senkou_span_a_displaced <= 64.9125 )
							ret := -1.000000 // sell
						if( senkou_span_a_displaced > 64.9125 )
							ret := -0.750000 // sell
				if( tenkan_sen > 65.3348 )
					if( basis_max <= 0.072428 )
						if( chinkou_span <= 66.0827 )
							if( senkou_span_a <= 65.9704 )
								if( senkou_span_b_displaced <= 64.29 )
									ret := 0.829268 // buy
								if( senkou_span_b_displaced > 64.29 )
									ret := 0.049014
							if( senkou_span_a > 65.9704 )
								if( basis_max <= -0.021524 )
									ret := -0.719298 // sell
								if( basis_max > -0.021524 )
									ret := -0.213256
						if( chinkou_span > 66.0827 )
							if( tenkan_sen <= 66.1783 )
								if( senkou_span_b <= 65.8416 )
									ret := 0.633333
								if( senkou_span_b > 65.8416 )
									ret := 0.267227
							if( tenkan_sen > 66.1783 )
								if( senkou_span_a <= 66.1972 )
									ret := -0.391304
								if( senkou_span_a > 66.1972 )
									ret := 0.013158
					if( basis_max > 0.072428 )
						if( kinjun_sen <= 66.219 )
							if( senkou_span_b_displaced <= 66.9031 )
								if( tenkan_sen <= 65.3944 )
									ret := -0.800000 // sell
								if( tenkan_sen > 65.3944 )
									ret := 0.854545 // buy
							if( senkou_span_b_displaced > 66.9031 )
								ret := -0.666667
						if( kinjun_sen > 66.219 )
							if( basis_max <= 0.094881 )
								if( kinjun_sen <= 66.3674 )
									ret := 0.000000
								if( kinjun_sen > 66.3674 )
									ret := 0.833333 // buy
							if( basis_max > 0.094881 )
								if( chinkou_span <= 66.0175 )
									ret := -0.676471
								if( chinkou_span > 66.0175 )
									ret := 0.307692
		if( tenkan_sen > 66.2206 )
			if( senkou_span_b <= 66.114 )
				if( chinkou_span <= 66.0657 )
					if( senkou_span_b <= 66.0269 )
						if( basis_max <= 0.013886 )
							if( basis_minus <= 0.313509 )
								ret := -0.428571
							if( basis_minus > 0.313509 )
								if( kinjun_sen <= 66.1462 )
									ret := -0.625000
								if( kinjun_sen > 66.1462 )
									ret := -1.000000 // sell
						if( basis_max > 0.013886 )
							ret := 0.750000 // buy
					if( senkou_span_b > 66.0269 )
						ret := -1.000000 // sell
				if( chinkou_span > 66.0657 )
					if( senkou_span_a_displaced <= 65.8585 )
						if( kinjun_sen <= 66.48 )
							if( basis_minus <= 0.154691 )
								ret := 0.000000
							if( basis_minus > 0.154691 )
								if( basis_max <= -0.067534 )
									ret := -0.894737 // sell
								if( basis_max > -0.067534 )
									ret := -0.250000
						if( kinjun_sen > 66.48 )
							ret := 1.000000 // buy
					if( senkou_span_a_displaced > 65.8585 )
						if( senkou_span_b_displaced <= 65.8733 )
							if( senkou_span_a <= 66.1817 )
								ret := 0.750000 // buy
							if( senkou_span_a > 66.1817 )
								if( basis_max <= -0.03971 )
									ret := -0.571429
								if( basis_max > -0.03971 )
									ret := 0.166667
						if( senkou_span_b_displaced > 65.8733 )
							if( senkou_span_b_displaced <= 65.9242 )
								if( basis_max <= -0.013775 )
									ret := 1.000000 // buy
								if( basis_max > -0.013775 )
									ret := 0.400000
							if( senkou_span_b_displaced > 65.9242 )
								if( basis_max <= 0.019738 )
									ret := 0.258065
								if( basis_max > 0.019738 )
									ret := 1.000000 // buy
			if( senkou_span_b > 66.114 )
				if( senkou_span_a_displaced <= 66.8155 )
					if( kinjun_sen <= 66.7333 )
						if( basis_minus <= 0.110333 )
							if( basis_minus <= -0.125036 )
								if( senkou_span_b_displaced <= 66.4267 )
									ret := 0.733333 // buy
								if( senkou_span_b_displaced > 66.4267 )
									ret := -0.254545
							if( basis_minus > -0.125036 )
								if( kinjun_sen <= 66.2475 )
									ret := -0.151163
								if( kinjun_sen > 66.2475 )
									ret := -0.517949
						if( basis_minus > 0.110333 )
							if( senkou_span_a_displaced <= 66.1644 )
								if( basis_max <= -0.02622 )
									ret := -0.550000
								if( basis_max > -0.02622 )
									ret := 0.111111
							if( senkou_span_a_displaced > 66.1644 )
								if( senkou_span_b_displaced <= 66.1377 )
									ret := -0.935484 // sell
								if( senkou_span_b_displaced > 66.1377 )
									ret := -0.428571
					if( kinjun_sen > 66.7333 )
						if( senkou_span_a <= 66.8924 )
							if( chinkou_span <= 66.2633 )
								ret := 0.750000 // buy
							if( chinkou_span > 66.2633 )
								ret := 1.000000 // buy
						if( senkou_span_a > 66.8924 )
							if( kinjun_sen <= 66.9557 )
								if( senkou_span_b_displaced <= 66.3851 )
									ret := -0.250000
								if( senkou_span_b_displaced > 66.3851 )
									ret := -0.250000
							if( kinjun_sen > 66.9557 )
								ret := 1.000000 // buy
				if( senkou_span_a_displaced > 66.8155 )
					if( senkou_span_b_displaced <= 67.5492 )
						if( senkou_span_b_displaced <= 66.705 )
							if( kinjun_sen <= 66.8443 )
								if( senkou_span_a_displaced <= 67.0182 )
									ret := 0.363636
								if( senkou_span_a_displaced > 67.0182 )
									ret := 0.833333 // buy
							if( kinjun_sen > 66.8443 )
								if( kinjun_sen <= 66.9459 )
									ret := -1.000000 // sell
								if( kinjun_sen > 66.9459 )
									ret := -0.750000 // sell
						if( senkou_span_b_displaced > 66.705 )
							if( senkou_span_b_displaced <= 67.0169 )
								if( chinkou_span <= 66.1671 )
									ret := -0.918182 // sell
								if( chinkou_span > 66.1671 )
									ret := -0.703704 // sell
							if( senkou_span_b_displaced > 67.0169 )
								if( senkou_span_b_displaced <= 67.0296 )
									ret := 0.500000
								if( senkou_span_b_displaced > 67.0296 )
									ret := -0.625000
					if( senkou_span_b_displaced > 67.5492 )
						if( basis_max <= 0.09375 )
							ret := 1.000000 // buy
						if( basis_max > 0.09375 )
							if( basis_max <= 0.195298 )
								ret := -1.000000 // sell
							if( basis_max > 0.195298 )
								if( basis_minus <= -0.277259 )
									ret := -0.500000
								if( basis_minus > -0.277259 )
									ret := 1.000000 // buy
	if( chinkou_span > 66.4407 )
		if( kinjun_sen <= 66.9643 )
			if( senkou_span_a <= 66.1272 )
				if( basis_max <= 0.00115 )
					if( senkou_span_b_displaced <= 65.0196 )
						if( tenkan_sen <= 65.2555 )
							if( basis_max <= -0.145169 )
								ret := 0.750000 // buy
							if( basis_max > -0.145169 )
								ret := 1.000000 // buy
						if( tenkan_sen > 65.2555 )
							ret := 1.000000 // buy
					if( senkou_span_b_displaced > 65.0196 )
						if( basis_minus <= 0.041313 )
							if( tenkan_sen <= 65.8297 )
								ret := 0.500000
							if( tenkan_sen > 65.8297 )
								if( basis_minus <= -0.131763 )
									ret := 0.600000
								if( basis_minus > -0.131763 )
									ret := 0.984127 // buy
						if( basis_minus > 0.041313 )
							if( senkou_span_a_displaced <= 65.7693 )
								if( kinjun_sen <= 65.9383 )
									ret := 0.650000
								if( kinjun_sen > 65.9383 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 65.7693 )
								ret := 0.000000
				if( basis_max > 0.00115 )
					if( basis_minus <= -0.003771 )
						if( chinkou_span <= 66.519 )
							ret := 1.000000 // buy
						if( chinkou_span > 66.519 )
							if( tenkan_sen <= 66.0517 )
								if( senkou_span_a_displaced <= 65.7684 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 65.7684 )
									ret := 1.000000 // buy
							if( tenkan_sen > 66.0517 )
								ret := 0.000000
					if( basis_minus > -0.003771 )
						if( basis_max <= 0.036746 )
							ret := -0.166667
						if( basis_max > 0.036746 )
							ret := -0.500000
			if( senkou_span_a > 66.1272 )
				if( chinkou_span <= 67.4302 )
					if( tenkan_sen <= 66.8888 )
						if( senkou_span_b_displaced <= 66.43 )
							if( senkou_span_b <= 66.3343 )
								if( senkou_span_a <= 66.3231 )
									ret := 0.170455
								if( senkou_span_a > 66.3231 )
									ret := 0.664384
							if( senkou_span_b > 66.3343 )
								if( basis_max <= 0.003206 )
									ret := 0.100503
								if( basis_max > 0.003206 )
									ret := 0.894737 // buy
						if( senkou_span_b_displaced > 66.43 )
							if( chinkou_span <= 66.8206 )
								if( senkou_span_b <= 66.655 )
									ret := 0.614458
								if( senkou_span_b > 66.655 )
									ret := -0.023256
							if( chinkou_span > 66.8206 )
								if( senkou_span_b <= 66.3099 )
									ret := 0.000000
								if( senkou_span_b > 66.3099 )
									ret := 0.695513
					if( tenkan_sen > 66.8888 )
						if( senkou_span_a <= 66.9484 )
							if( basis_minus <= -0.158739 )
								if( kinjun_sen <= 66.9458 )
									ret := 0.750000 // buy
								if( kinjun_sen > 66.9458 )
									ret := 0.000000
							if( basis_minus > -0.158739 )
								if( senkou_span_b_displaced <= 67.0025 )
									ret := 0.041667
								if( senkou_span_b_displaced > 67.0025 )
									ret := -0.421053
						if( senkou_span_a > 66.9484 )
							if( senkou_span_b <= 66.662 )
								if( senkou_span_a_displaced <= 66.3154 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 66.3154 )
									ret := -0.333333
							if( senkou_span_b > 66.662 )
								if( basis_minus <= 0.360543 )
									ret := 0.592308
								if( basis_minus > 0.360543 )
									ret := -0.333333
				if( chinkou_span > 67.4302 )
					if( basis_max <= 0.007777 )
						if( basis_max <= -0.024978 )
							if( basis_max <= -0.133777 )
								if( senkou_span_b <= 66.5465 )
									ret := 1.000000 // buy
								if( senkou_span_b > 66.5465 )
									ret := 0.666667
							if( basis_max > -0.133777 )
								if( tenkan_sen <= 66.9917 )
									ret := 0.222222
								if( tenkan_sen > 66.9917 )
									ret := 0.777778 // buy
						if( basis_max > -0.024978 )
							if( basis_minus <= -0.002962 )
								ret := 0.600000
							if( basis_minus > -0.002962 )
								if( senkou_span_a <= 66.2613 )
									ret := 0.750000 // buy
								if( senkou_span_a > 66.2613 )
									ret := 1.000000 // buy
					if( basis_max > 0.007777 )
						if( basis_max <= 0.031669 )
							ret := 0.500000
						if( basis_max > 0.031669 )
							ret := 0.200000
		if( kinjun_sen > 66.9643 )
			if( chinkou_span <= 67.0839 )
				if( tenkan_sen <= 66.9877 )
					if( senkou_span_a_displaced <= 66.9266 )
						if( tenkan_sen <= 66.9419 )
							if( senkou_span_b <= 66.848 )
								ret := 0.166667
							if( senkou_span_b > 66.848 )
								ret := -0.800000 // sell
						if( tenkan_sen > 66.9419 )
							ret := -1.000000 // sell
					if( senkou_span_a_displaced > 66.9266 )
						if( chinkou_span <= 66.9252 )
							if( tenkan_sen <= 66.7326 )
								if( senkou_span_a_displaced <= 67.035 )
									ret := -0.250000
								if( senkou_span_a_displaced > 67.035 )
									ret := 0.000000
							if( tenkan_sen > 66.7326 )
								if( senkou_span_a <= 66.9874 )
									ret := 0.869565 // buy
								if( senkou_span_a > 66.9874 )
									ret := 0.548387
						if( chinkou_span > 66.9252 )
							if( senkou_span_a <= 67.0018 )
								if( senkou_span_b <= 67.13 )
									ret := 0.043478
								if( senkou_span_b > 67.13 )
									ret := 0.750000 // buy
							if( senkou_span_a > 67.0018 )
								if( chinkou_span <= 67.0554 )
									ret := 0.000000
								if( chinkou_span > 67.0554 )
									ret := -0.800000 // sell
				if( tenkan_sen > 66.9877 )
					if( senkou_span_a_displaced <= 66.5813 )
						ret := 1.000000 // buy
					if( senkou_span_a_displaced > 66.5813 )
						if( kinjun_sen <= 67.0812 )
							if( senkou_span_b <= 67.0298 )
								if( kinjun_sen <= 67.041 )
									ret := -0.557143
								if( kinjun_sen > 67.041 )
									ret := 0.000000
							if( senkou_span_b > 67.0298 )
								if( senkou_span_a_displaced <= 66.9116 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 66.9116 )
									ret := 0.134146
						if( kinjun_sen > 67.0812 )
							if( kinjun_sen <= 67.5804 )
								if( senkou_span_a_displaced <= 66.8731 )
									ret := 0.666667
								if( senkou_span_a_displaced > 66.8731 )
									ret := -0.486339
							if( kinjun_sen > 67.5804 )
								if( chinkou_span <= 66.6975 )
									ret := -0.250000
								if( chinkou_span > 66.6975 )
									ret := 1.000000 // buy
			if( chinkou_span > 67.0839 )
				if( tenkan_sen <= 67.4799 )
					if( chinkou_span <= 67.4311 )
						if( senkou_span_a_displaced <= 67.0839 )
							if( senkou_span_b_displaced <= 66.883 )
								if( kinjun_sen <= 67.0757 )
									ret := -0.500000
								if( kinjun_sen > 67.0757 )
									ret := 0.171429
							if( senkou_span_b_displaced > 66.883 )
								if( senkou_span_b <= 67.2403 )
									ret := 0.445378
								if( senkou_span_b > 67.2403 )
									ret := -0.375000
						if( senkou_span_a_displaced > 67.0839 )
							if( basis_minus <= -0.14875 )
								if( basis_max <= 0.043029 )
									ret := -0.105263
								if( basis_max > 0.043029 )
									ret := 0.826087 // buy
							if( basis_minus > -0.14875 )
								if( chinkou_span <= 67.333 )
									ret := -0.349206
								if( chinkou_span > 67.333 )
									ret := 0.254902
					if( chinkou_span > 67.4311 )
						if( senkou_span_a_displaced <= 67.0838 )
							if( tenkan_sen <= 67.22 )
								if( senkou_span_a_displaced <= 66.75 )
									ret := 0.000000
								if( senkou_span_a_displaced > 66.75 )
									ret := 0.759259 // buy
							if( tenkan_sen > 67.22 )
								if( chinkou_span <= 67.5562 )
									ret := -0.625000
								if( chinkou_span > 67.5562 )
									ret := 0.333333
						if( senkou_span_a_displaced > 67.0838 )
							if( kinjun_sen <= 67.645 )
								if( senkou_span_a_displaced <= 67.134 )
									ret := 0.953488 // buy
								if( senkou_span_a_displaced > 67.134 )
									ret := 0.714829 // buy
							if( kinjun_sen > 67.645 )
								ret := 0.000000
				if( tenkan_sen > 67.4799 )
					if( chinkou_span <= 67.9414 )
						if( kinjun_sen <= 67.8078 )
							if( chinkou_span <= 67.3721 )
								if( senkou_span_b <= 67.5438 )
									ret := -0.862069 // sell
								if( senkou_span_b > 67.5438 )
									ret := -0.333333
							if( chinkou_span > 67.3721 )
								if( tenkan_sen <= 67.6459 )
									ret := 0.287037
								if( tenkan_sen > 67.6459 )
									ret := -0.183463
						if( kinjun_sen > 67.8078 )
							if( senkou_span_a <= 68.2396 )
								if( kinjun_sen <= 68.3463 )
									ret := -0.339114
								if( kinjun_sen > 68.3463 )
									ret := 0.933333 // buy
							if( senkou_span_a > 68.2396 )
								if( senkou_span_b <= 69.067 )
									ret := -0.677419
								if( senkou_span_b > 69.067 )
									ret := -1.000000 // sell
					if( chinkou_span > 67.9414 )
						if( senkou_span_b <= 67.9337 )
							if( chinkou_span <= 72.09 )
								if( senkou_span_a <= 67.4746 )
									ret := -0.900000 // sell
								if( senkou_span_a > 67.4746 )
									ret := 0.547826
							if( chinkou_span > 72.09 )
								ret := -1.000000 // sell
						if( senkou_span_b > 67.9337 )
							if( basis_max <= -0.30125 )
								if( basis_minus <= 0.177701 )
									ret := -0.250000
								if( basis_minus > 0.177701 )
									ret := -0.898734 // sell
							if( basis_max > -0.30125 )
								if( chinkou_span <= 68.2899 )
									ret := -0.243108
								if( chinkou_span > 68.2899 )
									ret := 0.076532
	
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
float op_operation = decision_tree_0_PYPL_1Min_dea06416(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


