//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: DOGEUSDT_1Min_1ICH_2308efbf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_1Min_1ICH_2308efbf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_1Min_2308efbf(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 0.167779 )
		if( kinjun_sen <= 0.167227 )
			if( basis_minus <= -0.000553 )
				if( chinkou_span <= 0.100438 )
					if( kinjun_sen <= 0.099435 )
						if( senkou_span_a_displaced <= 0.101306 )
							if( basis_max <= 0.000355 )
								if( chinkou_span <= 0.084466 )
									ret := -0.725926 // sell
								if( chinkou_span > 0.084466 )
									ret := 0.089385
							if( basis_max > 0.000355 )
								if( tenkan_sen <= 0.084308 )
									ret := 1.000000 // buy
								if( tenkan_sen > 0.084308 )
									ret := 0.426087
						if( senkou_span_a_displaced > 0.101306 )
							ret := -1.000000 // sell
					if( kinjun_sen > 0.099435 )
						if( senkou_span_a_displaced <= 0.102855 )
							if( senkou_span_b <= 0.100933 )
								if( senkou_span_b <= 0.099787 )
									ret := 0.727273 // buy
								if( senkou_span_b > 0.099787 )
									ret := -0.600823
							if( senkou_span_b > 0.100933 )
								if( kinjun_sen <= 0.100684 )
									ret := 0.208000
								if( kinjun_sen > 0.100684 )
									ret := -0.258621
						if( senkou_span_a_displaced > 0.102855 )
							if( senkou_span_b_displaced <= 0.103959 )
								if( basis_max <= 0.000211 )
									ret := 0.000000
								if( basis_max > 0.000211 )
									ret := -0.950617 // sell
							if( senkou_span_b_displaced > 0.103959 )
								ret := 0.200000
				if( chinkou_span > 0.100438 )
					if( senkou_span_b_displaced <= 0.103908 )
						if( basis_minus <= -0.000983 )
							if( senkou_span_a_displaced <= 0.101312 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.101312 )
								ret := 1.000000 // buy
						if( basis_minus > -0.000983 )
							if( tenkan_sen <= 0.101047 )
								if( senkou_span_a <= 0.099609 )
									ret := 0.763636 // buy
								if( senkou_span_a > 0.099609 )
									ret := 0.983333 // buy
							if( tenkan_sen > 0.101047 )
								if( senkou_span_b_displaced <= 0.102213 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 0.102213 )
									ret := 0.592105
					if( senkou_span_b_displaced > 0.103908 )
						if( chinkou_span <= 0.103582 )
							if( tenkan_sen <= 0.102098 )
								if( basis_minus <= -0.000754 )
									ret := 0.910714 // buy
								if( basis_minus > -0.000754 )
									ret := -0.500000
							if( tenkan_sen > 0.102098 )
								if( basis_max <= 0.000121 )
									ret := -0.670807
								if( basis_max > 0.000121 )
									ret := -0.057377
						if( chinkou_span > 0.103582 )
							if( kinjun_sen <= 0.106311 )
								if( basis_minus <= -0.000622 )
									ret := 0.640535
								if( basis_minus > -0.000622 )
									ret := 0.145946
							if( kinjun_sen > 0.106311 )
								if( senkou_span_b <= 0.164348 )
									ret := 0.206493
								if( senkou_span_b > 0.164348 )
									ret := -0.027062
			if( basis_minus > -0.000553 )
				if( senkou_span_a <= 0.10068 )
					if( basis_max <= -0.000786 )
						if( senkou_span_b <= 0.086065 )
							if( senkou_span_a_displaced <= 0.083032 )
								ret := 0.571429
							if( senkou_span_a_displaced > 0.083032 )
								if( senkou_span_b <= 0.085756 )
									ret := 1.000000 // buy
								if( senkou_span_b > 0.085756 )
									ret := 0.909091 // buy
						if( senkou_span_b > 0.086065 )
							if( senkou_span_a_displaced <= 0.094509 )
								ret := -0.166667
							if( senkou_span_a_displaced > 0.094509 )
								if( kinjun_sen <= 0.096272 )
									ret := 1.000000 // buy
								if( kinjun_sen > 0.096272 )
									ret := 0.750000 // buy
					if( basis_max > -0.000786 )
						if( basis_max <= -0.00026 )
							if( basis_minus <= 0.000964 )
								if( chinkou_span <= 0.095767 )
									ret := -0.365462
								if( chinkou_span > 0.095767 )
									ret := 0.269474
							if( basis_minus > 0.000964 )
								if( senkou_span_b <= 0.087043 )
									ret := 0.028571
								if( senkou_span_b > 0.087043 )
									ret := -0.569672
						if( basis_max > -0.00026 )
							if( chinkou_span <= 0.100861 )
								if( chinkou_span <= 0.098252 )
									ret := -0.001864
								if( chinkou_span > 0.098252 )
									ret := 0.131196
							if( chinkou_span > 0.100861 )
								if( senkou_span_a_displaced <= 0.098054 )
									ret := -0.461538
								if( senkou_span_a_displaced > 0.098054 )
									ret := 0.611807
				if( senkou_span_a > 0.10068 )
					if( basis_minus <= -3.6e-05 )
						if( senkou_span_b_displaced <= 0.167691 )
							if( basis_max <= -0.000178 )
								if( chinkou_span <= 0.158771 )
									ret := 0.183486
								if( chinkou_span > 0.158771 )
									ret := 0.569231
							if( basis_max > -0.000178 )
								if( chinkou_span <= 0.100876 )
									ret := -0.267990
								if( chinkou_span > 0.100876 )
									ret := 0.055563
						if( senkou_span_b_displaced > 0.167691 )
							if( chinkou_span <= 0.1671 )
								if( basis_max <= 0.00026 )
									ret := -0.711268 // sell
								if( basis_max > 0.00026 )
									ret := 0.600000
							if( chinkou_span > 0.1671 )
								if( basis_max <= 2.3e-05 )
									ret := 0.142857
								if( basis_max > 2.3e-05 )
									ret := 0.727273 // buy
					if( basis_minus > -3.6e-05 )
						if( chinkou_span <= 0.10111 )
							if( tenkan_sen <= 0.101155 )
								if( chinkou_span <= 0.099885 )
									ret := -0.728324 // sell
								if( chinkou_span > 0.099885 )
									ret := -0.094635
							if( tenkan_sen > 0.101155 )
								if( basis_max <= -7.3e-05 )
									ret := -0.826087 // sell
								if( basis_max > -7.3e-05 )
									ret := -0.429688
						if( chinkou_span > 0.10111 )
							if( kinjun_sen <= 0.101349 )
								if( chinkou_span <= 0.101583 )
									ret := 0.159968
								if( chinkou_span > 0.101583 )
									ret := 0.533141
							if( kinjun_sen > 0.101349 )
								if( chinkou_span <= 0.103081 )
									ret := -0.088970
								if( chinkou_span > 0.103081 )
									ret := 0.031882
		if( kinjun_sen > 0.167227 )
			if( tenkan_sen <= 0.168757 )
				if( chinkou_span <= 0.166535 )
					if( basis_minus <= 0.000415 )
						if( senkou_span_a_displaced <= 0.169979 )
							if( senkou_span_b_displaced <= 0.167215 )
								if( basis_max <= 7.2e-05 )
									ret := -1.000000 // sell
								if( basis_max > 7.2e-05 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 0.167215 )
								if( basis_max <= 0.000329 )
									ret := -0.556701
								if( basis_max > 0.000329 )
									ret := -0.820513 // sell
						if( senkou_span_a_displaced > 0.169979 )
							if( senkou_span_b_displaced <= 0.168885 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.168885 )
								ret := -0.400000
					if( basis_minus > 0.000415 )
						if( senkou_span_a_displaced <= 0.167586 )
							if( basis_minus <= 0.00052 )
								ret := -0.750000 // sell
							if( basis_minus > 0.00052 )
								if( senkou_span_a <= 0.167561 )
									ret := 0.600000
								if( senkou_span_a > 0.167561 )
									ret := -0.200000
						if( senkou_span_a_displaced > 0.167586 )
							if( senkou_span_b <= 0.168193 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.168193 )
								ret := 0.750000 // buy
				if( chinkou_span > 0.166535 )
					if( tenkan_sen <= 0.167435 )
						if( basis_max <= 9.6e-05 )
							if( chinkou_span <= 0.167358 )
								if( senkou_span_a <= 0.167274 )
									ret := 0.071429
								if( senkou_span_a > 0.167274 )
									ret := -0.558824
							if( chinkou_span > 0.167358 )
								if( senkou_span_a_displaced <= 0.167605 )
									ret := 0.600000
								if( senkou_span_a_displaced > 0.167605 )
									ret := -0.500000
						if( basis_max > 9.6e-05 )
							if( chinkou_span <= 0.167607 )
								if( basis_minus <= -0.001195 )
									ret := -0.600000
								if( basis_minus > -0.001195 )
									ret := 0.647727
							if( chinkou_span > 0.167607 )
								if( senkou_span_b_displaced <= 0.17031 )
									ret := 0.222222
								if( senkou_span_b_displaced > 0.17031 )
									ret := -0.833333 // sell
					if( tenkan_sen > 0.167435 )
						if( basis_minus <= -0.001063 )
							if( basis_minus <= -0.001472 )
								ret := 1.000000 // buy
							if( basis_minus > -0.001472 )
								ret := 0.750000 // buy
						if( basis_minus > -0.001063 )
							if( senkou_span_b <= 0.169221 )
								if( senkou_span_a <= 0.168692 )
									ret := -0.193548
								if( senkou_span_a > 0.168692 )
									ret := 0.560976
							if( senkou_span_b > 0.169221 )
								if( chinkou_span <= 0.16672 )
									ret := -0.250000
								if( chinkou_span > 0.16672 )
									ret := -1.000000 // sell
			if( tenkan_sen > 0.168757 )
				if( senkou_span_b_displaced <= 0.165622 )
					if( basis_max <= -0.000475 )
						if( senkou_span_a <= 0.169715 )
							ret := 0.000000
						if( senkou_span_a > 0.169715 )
							if( senkou_span_b_displaced <= 0.164087 )
								ret := -0.250000
							if( senkou_span_b_displaced > 0.164087 )
								ret := -1.000000 // sell
					if( basis_max > -0.000475 )
						if( tenkan_sen <= 0.169548 )
							ret := 0.142857
						if( tenkan_sen > 0.169548 )
							ret := 0.800000 // buy
				if( senkou_span_b_displaced > 0.165622 )
					if( kinjun_sen <= 0.16879 )
						if( kinjun_sen <= 0.168093 )
							ret := -0.500000
						if( kinjun_sen > 0.168093 )
							if( senkou_span_a_displaced <= 0.167245 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.167245 )
								if( basis_max <= -0.000128 )
									ret := -0.500000
								if( basis_max > -0.000128 )
									ret := -0.962963 // sell
					if( kinjun_sen > 0.16879 )
						if( chinkou_span <= 0.167595 )
							if( senkou_span_b_displaced <= 0.167194 )
								ret := 0.500000
							if( senkou_span_b_displaced > 0.167194 )
								if( basis_minus <= -0.000325 )
									ret := -0.847222 // sell
								if( basis_minus > -0.000325 )
									ret := -0.564103
						if( chinkou_span > 0.167595 )
							if( senkou_span_b_displaced <= 0.169915 )
								if( tenkan_sen <= 0.169275 )
									ret := -1.000000 // sell
								if( tenkan_sen > 0.169275 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 0.169915 )
								ret := -0.571429
	if( chinkou_span > 0.167779 )
		if( tenkan_sen <= 0.168371 )
			if( tenkan_sen <= 0.167065 )
				if( cross_up_tenkan_kinjunInt <= 0.5 )
					if( senkou_span_a_displaced <= 0.163561 )
						if( chinkou_span <= 0.1689 )
							ret := -1.000000 // sell
						if( chinkou_span > 0.1689 )
							ret := 0.000000
					if( senkou_span_a_displaced > 0.163561 )
						if( senkou_span_a_displaced <= 0.169064 )
							if( basis_max <= -0.00012 )
								if( senkou_span_a <= 0.165349 )
									ret := 0.250000
								if( senkou_span_a > 0.165349 )
									ret := 0.935484 // buy
							if( basis_max > -0.00012 )
								if( senkou_span_a_displaced <= 0.168324 )
									ret := 0.623288
								if( senkou_span_a_displaced > 0.168324 )
									ret := 0.958904 // buy
						if( senkou_span_a_displaced > 0.169064 )
							ret := -0.500000
				if( cross_up_tenkan_kinjunInt > 0.5 )
					if( senkou_span_b_displaced <= 0.165863 )
						ret := 0.000000
					if( senkou_span_b_displaced > 0.165863 )
						ret := -0.833333 // sell
			if( tenkan_sen > 0.167065 )
				if( senkou_span_a <= 0.167504 )
					if( senkou_span_a_displaced <= 0.16503 )
						if( senkou_span_b_displaced <= 0.164797 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.164797 )
							if( senkou_span_b_displaced <= 0.164865 )
								ret := 0.000000
							if( senkou_span_b_displaced > 0.164865 )
								ret := -1.000000 // sell
					if( senkou_span_a_displaced > 0.16503 )
						if( senkou_span_b_displaced <= 0.169588 )
							if( senkou_span_b_displaced <= 0.165897 )
								if( kinjun_sen <= 0.166891 )
									ret := 0.870968 // buy
								if( kinjun_sen > 0.166891 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.165897 )
								if( senkou_span_b <= 0.166887 )
									ret := -0.150000
								if( senkou_span_b > 0.166887 )
									ret := 0.682171
						if( senkou_span_b_displaced > 0.169588 )
							if( senkou_span_b <= 0.16836 )
								if( kinjun_sen <= 0.167345 )
									ret := -0.500000
								if( kinjun_sen > 0.167345 )
									ret := 0.000000
							if( senkou_span_b > 0.16836 )
								ret := 0.750000 // buy
				if( senkou_span_a > 0.167504 )
					if( basis_max <= 0.000181 )
						if( chinkou_span <= 0.169209 )
							if( basis_max <= 4e-06 )
								if( senkou_span_b <= 0.168403 )
									ret := 0.133144
								if( senkou_span_b > 0.168403 )
									ret := -0.733333 // sell
							if( basis_max > 4e-06 )
								if( chinkou_span <= 0.168243 )
									ret := 0.209524
								if( chinkou_span > 0.168243 )
									ret := 0.619883
						if( chinkou_span > 0.169209 )
							if( basis_max <= 0.000101 )
								if( senkou_span_a <= 0.167735 )
									ret := 0.142857
								if( senkou_span_a > 0.167735 )
									ret := 0.843972 // buy
							if( basis_max > 0.000101 )
								if( senkou_span_a <= 0.168352 )
									ret := 0.307692
								if( senkou_span_a > 0.168352 )
									ret := -0.900000 // sell
					if( basis_max > 0.000181 )
						if( senkou_span_a <= 0.168542 )
							if( senkou_span_a_displaced <= 0.169569 )
								if( senkou_span_a <= 0.167516 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.167516 )
									ret := -0.467742
							if( senkou_span_a_displaced > 0.169569 )
								if( senkou_span_a <= 0.167566 )
									ret := 0.857143 // buy
								if( senkou_span_a > 0.167566 )
									ret := 0.000000
						if( senkou_span_a > 0.168542 )
							if( senkou_span_b_displaced <= 0.168656 )
								if( senkou_span_a_displaced <= 0.168506 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 0.168506 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.168656 )
								ret := -1.000000 // sell
		if( tenkan_sen > 0.168371 )
			if( chinkou_span <= 0.171868 )
				if( basis_minus <= 0.000455 )
					if( tenkan_sen <= 0.171362 )
						if( chinkou_span <= 0.170012 )
							if( chinkou_span <= 0.168421 )
								if( senkou_span_b <= 0.168643 )
									ret := 0.720000 // buy
								if( senkou_span_b > 0.168643 )
									ret := -0.553299
							if( chinkou_span > 0.168421 )
								if( tenkan_sen <= 0.169324 )
									ret := 0.270270
								if( tenkan_sen > 0.169324 )
									ret := -0.119237
						if( chinkou_span > 0.170012 )
							if( senkou_span_b <= 0.170141 )
								if( senkou_span_a_displaced <= 0.169019 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.169019 )
									ret := 0.501946
							if( senkou_span_b > 0.170141 )
								if( senkou_span_a_displaced <= 0.172129 )
									ret := 0.379310
								if( senkou_span_a_displaced > 0.172129 )
									ret := -0.215686
					if( tenkan_sen > 0.171362 )
						if( senkou_span_a_displaced <= 0.171117 )
							if( kinjun_sen <= 0.171234 )
								ret := 0.250000
							if( kinjun_sen > 0.171234 )
								if( tenkan_sen <= 0.172048 )
									ret := 1.000000 // buy
								if( tenkan_sen > 0.172048 )
									ret := 0.750000 // buy
						if( senkou_span_a_displaced > 0.171117 )
							if( chinkou_span <= 0.171524 )
								if( senkou_span_b_displaced <= 0.171729 )
									ret := -0.785714 // sell
								if( senkou_span_b_displaced > 0.171729 )
									ret := -0.302326
							if( chinkou_span > 0.171524 )
								if( kinjun_sen <= 0.171843 )
									ret := 0.375000
								if( kinjun_sen > 0.171843 )
									ret := -0.283951
				if( basis_minus > 0.000455 )
					if( senkou_span_b_displaced <= 0.16829 )
						if( senkou_span_a_displaced <= 0.168345 )
							if( senkou_span_a_displaced <= 0.165801 )
								if( basis_max <= -0.00036 )
									ret := -1.000000 // sell
								if( basis_max > -0.00036 )
									ret := -0.750000 // sell
							if( senkou_span_a_displaced > 0.165801 )
								if( basis_minus <= 0.001059 )
									ret := -0.290909
								if( basis_minus > 0.001059 )
									ret := 0.500000
						if( senkou_span_a_displaced > 0.168345 )
							if( chinkou_span <= 0.169449 )
								if( tenkan_sen <= 0.169267 )
									ret := 0.800000 // buy
								if( tenkan_sen > 0.169267 )
									ret := -0.150000
							if( chinkou_span > 0.169449 )
								if( senkou_span_a_displaced <= 0.169029 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.169029 )
									ret := 0.833333 // buy
					if( senkou_span_b_displaced > 0.16829 )
						if( chinkou_span <= 0.168143 )
							if( tenkan_sen <= 0.169189 )
								ret := 0.750000 // buy
							if( tenkan_sen > 0.169189 )
								ret := 0.800000 // buy
						if( chinkou_span > 0.168143 )
							if( kinjun_sen <= 0.170068 )
								if( senkou_span_a_displaced <= 0.168051 )
									ret := -0.400000
								if( senkou_span_a_displaced > 0.168051 )
									ret := -0.868132 // sell
							if( kinjun_sen > 0.170068 )
								if( basis_minus <= 0.00085 )
									ret := -0.230337
								if( basis_minus > 0.00085 )
									ret := -0.901961 // sell
			if( chinkou_span > 0.171868 )
				if( senkou_span_a <= 0.171803 )
					if( chinkou_span <= 0.172888 )
						if( basis_minus <= 0.000736 )
							if( tenkan_sen <= 0.171547 )
								if( chinkou_span <= 0.17274 )
									ret := 0.757895 // buy
								if( chinkou_span > 0.17274 )
									ret := 0.153846
							if( tenkan_sen > 0.171547 )
								if( senkou_span_b <= 0.171317 )
									ret := -0.666667
								if( senkou_span_b > 0.171317 )
									ret := 0.289474
						if( basis_minus > 0.000736 )
							ret := -0.833333 // sell
					if( chinkou_span > 0.172888 )
						if( senkou_span_b <= 0.16989 )
							if( kinjun_sen <= 0.170428 )
								ret := 0.000000
							if( kinjun_sen > 0.170428 )
								ret := 0.500000
						if( senkou_span_b > 0.16989 )
							if( tenkan_sen <= 0.171694 )
								if( tenkan_sen <= 0.170492 )
									ret := 0.814815 // buy
								if( tenkan_sen > 0.170492 )
									ret := 0.958904 // buy
							if( tenkan_sen > 0.171694 )
								ret := 0.666667
				if( senkou_span_a > 0.171803 )
					if( senkou_span_a <= 0.172664 )
						if( tenkan_sen <= 0.172075 )
							if( tenkan_sen <= 0.17194 )
								if( senkou_span_b <= 0.171564 )
									ret := -0.894737 // sell
								if( senkou_span_b > 0.171564 )
									ret := 0.228070
							if( tenkan_sen > 0.17194 )
								if( basis_minus <= 0.000283 )
									ret := -0.740000 // sell
								if( basis_minus > 0.000283 )
									ret := -0.105263
						if( tenkan_sen > 0.172075 )
							if( senkou_span_b_displaced <= 0.169409 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.169409 )
								if( chinkou_span <= 0.172815 )
									ret := 0.717241 // buy
								if( chinkou_span > 0.172815 )
									ret := -0.416667
					if( senkou_span_a > 0.172664 )
						if( chinkou_span <= 0.172062 )
							if( senkou_span_a <= 0.172729 )
								ret := -0.750000 // sell
							if( senkou_span_a > 0.172729 )
								if( chinkou_span <= 0.172045 )
									ret := 0.181818
								if( chinkou_span > 0.172045 )
									ret := 1.000000 // buy
						if( chinkou_span > 0.172062 )
							if( senkou_span_b <= 0.17228 )
								ret := 0.166667
							if( senkou_span_b > 0.17228 )
								if( basis_max <= 0.000321 )
									ret := -0.825000 // sell
								if( basis_max > 0.000321 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_DOGEUSDT_1Min_2308efbf(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


