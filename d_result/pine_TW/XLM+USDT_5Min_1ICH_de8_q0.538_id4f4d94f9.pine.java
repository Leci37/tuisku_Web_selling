//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: XLMUSDT_5Min_1ICH_4f4d94f9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_5Min_1ICH_4f4d94f9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_5Min_4f4d94f9(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_minus <= -0.000278 )
		if( senkou_span_b_displaced <= 0.135341 )
			if( chinkou_span <= 0.130301 )
				if( kinjun_sen <= 0.130759 )
					if( senkou_span_b <= 0.079593 )
						if( basis_max <= 0.000419 )
							if( senkou_span_a <= 0.078384 )
								if( senkou_span_a_displaced <= 0.080267 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.080267 )
									ret := 0.857143 // buy
							if( senkou_span_a > 0.078384 )
								if( chinkou_span <= 0.078485 )
									ret := 0.900000 // buy
								if( chinkou_span > 0.078485 )
									ret := 0.250000
						if( basis_max > 0.000419 )
							if( basis_minus <= -0.001642 )
								ret := 1.000000 // buy
							if( basis_minus > -0.001642 )
								ret := -0.500000
					if( senkou_span_b > 0.079593 )
						if( basis_max <= 7.7e-05 )
							if( senkou_span_b <= 0.082875 )
								if( basis_max <= -0.000238 )
									ret := -0.909091 // sell
								if( basis_max > -0.000238 )
									ret := -0.333333
							if( senkou_span_b > 0.082875 )
								if( tenkan_sen <= 0.08224 )
									ret := 0.909091 // buy
								if( tenkan_sen > 0.08224 )
									ret := 0.066773
						if( basis_max > 7.7e-05 )
							if( chinkou_span <= 0.083133 )
								if( senkou_span_b <= 0.082447 )
									ret := 0.464789
								if( senkou_span_b > 0.082447 )
									ret := -0.522843
							if( chinkou_span > 0.083133 )
								if( basis_minus <= -0.000851 )
									ret := 0.282650
								if( basis_minus > -0.000851 )
									ret := 0.145718
				if( kinjun_sen > 0.130759 )
					if( senkou_span_a <= 0.130108 )
						if( chinkou_span <= 0.127083 )
							ret := 1.000000 // buy
						if( chinkou_span > 0.127083 )
							ret := 0.500000
					if( senkou_span_a > 0.130108 )
						if( kinjun_sen <= 0.133675 )
							if( senkou_span_a <= 0.131805 )
								if( basis_max <= 6.8e-05 )
									ret := 0.666667
								if( basis_max > 6.8e-05 )
									ret := -0.573427
							if( senkou_span_a > 0.131805 )
								if( tenkan_sen <= 0.1327 )
									ret := -0.933333 // sell
								if( tenkan_sen > 0.1327 )
									ret := -0.571429
						if( kinjun_sen > 0.133675 )
							ret := 0.500000
			if( chinkou_span > 0.130301 )
				if( kinjun_sen <= 0.130843 )
					if( basis_minus <= -0.000635 )
						if( tenkan_sen <= 0.130684 )
							if( senkou_span_a_displaced <= 0.131875 )
								if( senkou_span_b <= 0.130164 )
									ret := 0.571429
								if( senkou_span_b > 0.130164 )
									ret := 0.920530 // buy
							if( senkou_span_a_displaced > 0.131875 )
								if( senkou_span_a_displaced <= 0.132115 )
									ret := 0.384615
								if( senkou_span_a_displaced > 0.132115 )
									ret := 0.800000 // buy
						if( tenkan_sen > 0.130684 )
							if( senkou_span_a <= 0.130775 )
								ret := 0.000000
							if( senkou_span_a > 0.130775 )
								ret := 0.600000
					if( basis_minus > -0.000635 )
						if( senkou_span_a_displaced <= 0.130913 )
							if( basis_max <= -5.1e-05 )
								if( chinkou_span <= 0.130562 )
									ret := 0.500000
								if( chinkou_span > 0.130562 )
									ret := 0.928571 // buy
							if( basis_max > -5.1e-05 )
								if( basis_minus <= -0.000359 )
									ret := 0.638889
								if( basis_minus > -0.000359 )
									ret := 0.047619
						if( senkou_span_a_displaced > 0.130913 )
							if( chinkou_span <= 0.131815 )
								if( senkou_span_b_displaced <= 0.130825 )
									ret := -0.833333 // sell
								if( senkou_span_b_displaced > 0.130825 )
									ret := 0.105263
							if( chinkou_span > 0.131815 )
								if( chinkou_span <= 0.134323 )
									ret := 0.750000 // buy
								if( chinkou_span > 0.134323 )
									ret := 1.000000 // buy
				if( kinjun_sen > 0.130843 )
					if( chinkou_span <= 0.135905 )
						if( basis_max <= -0.000257 )
							if( senkou_span_b <= 0.133601 )
								if( senkou_span_b <= 0.13285 )
									ret := 0.000000
								if( senkou_span_b > 0.13285 )
									ret := 1.000000 // buy
							if( senkou_span_b > 0.133601 )
								if( senkou_span_b_displaced <= 0.135195 )
									ret := -0.962963 // sell
								if( senkou_span_b_displaced > 0.135195 )
									ret := -0.333333
						if( basis_max > -0.000257 )
							if( tenkan_sen <= 0.130752 )
								if( basis_max <= 0.000775 )
									ret := -0.125000
								if( basis_max > 0.000775 )
									ret := 0.772727 // buy
							if( tenkan_sen > 0.130752 )
								if( tenkan_sen <= 0.131271 )
									ret := 0.678756
								if( tenkan_sen > 0.131271 )
									ret := 0.260960
					if( chinkou_span > 0.135905 )
						if( tenkan_sen <= 0.134825 )
							if( senkou_span_a_displaced <= 0.134949 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.134949 )
								if( senkou_span_a_displaced <= 0.135451 )
									ret := 0.692308
								if( senkou_span_a_displaced > 0.135451 )
									ret := 1.000000 // buy
						if( tenkan_sen > 0.134825 )
							ret := 0.500000
		if( senkou_span_b_displaced > 0.135341 )
			if( tenkan_sen <= 0.159578 )
				if( basis_max <= 0.000353 )
					if( chinkou_span <= 0.156209 )
						if( tenkan_sen <= 0.155561 )
							if( chinkou_span <= 0.135597 )
								if( senkou_span_a <= 0.135382 )
									ret := -0.017730
								if( senkou_span_a > 0.135382 )
									ret := -0.766082 // sell
							if( chinkou_span > 0.135597 )
								if( kinjun_sen <= 0.139863 )
									ret := 0.201452
								if( kinjun_sen > 0.139863 )
									ret := -0.094034
						if( tenkan_sen > 0.155561 )
							if( basis_minus <= -0.001529 )
								if( senkou_span_b_displaced <= 0.158291 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.158291 )
									ret := 0.000000
							if( basis_minus > -0.001529 )
								if( basis_minus <= -0.000425 )
									ret := -0.500000
								if( basis_minus > -0.000425 )
									ret := -0.972222 // sell
					if( chinkou_span > 0.156209 )
						if( senkou_span_a_displaced <= 0.156017 )
							if( basis_max <= -0.000141 )
								if( senkou_span_b_displaced <= 0.154857 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 0.154857 )
									ret := -0.250000
							if( basis_max > -0.000141 )
								if( senkou_span_b <= 0.155151 )
									ret := 0.869565 // buy
								if( senkou_span_b > 0.155151 )
									ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.156017 )
							if( senkou_span_a_displaced <= 0.160433 )
								if( senkou_span_b <= 0.159343 )
									ret := 0.312030
								if( senkou_span_b > 0.159343 )
									ret := -0.121387
							if( senkou_span_a_displaced > 0.160433 )
								if( senkou_span_a_displaced <= 0.161725 )
									ret := 0.714286 // buy
								if( senkou_span_a_displaced > 0.161725 )
									ret := -0.500000
				if( basis_max > 0.000353 )
					if( senkou_span_a_displaced <= 0.140274 )
						if( senkou_span_b <= 0.137807 )
							if( chinkou_span <= 0.13028 )
								if( senkou_span_b_displaced <= 0.136275 )
									ret := 0.200000
								if( senkou_span_b_displaced > 0.136275 )
									ret := -1.000000 // sell
							if( chinkou_span > 0.13028 )
								if( tenkan_sen <= 0.132375 )
									ret := 0.947368 // buy
								if( tenkan_sen > 0.132375 )
									ret := -0.041026
						if( senkou_span_b > 0.137807 )
							if( tenkan_sen <= 0.139009 )
								if( kinjun_sen <= 0.137797 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.137797 )
									ret := -0.666667
							if( tenkan_sen > 0.139009 )
								ret := 0.250000
					if( senkou_span_a_displaced > 0.140274 )
						if( senkou_span_a <= 0.14041 )
							if( chinkou_span <= 0.1372 )
								if( basis_max <= 0.0008 )
									ret := -0.259259
								if( basis_max > 0.0008 )
									ret := 0.826087 // buy
							if( chinkou_span > 0.1372 )
								if( basis_minus <= -0.000788 )
									ret := 0.420290
								if( basis_minus > -0.000788 )
									ret := 0.845070 // buy
						if( senkou_span_a > 0.14041 )
							if( chinkou_span <= 0.140348 )
								if( senkou_span_b_displaced <= 0.142928 )
									ret := -0.518519
								if( senkou_span_b_displaced > 0.142928 )
									ret := -0.950000 // sell
							if( chinkou_span > 0.140348 )
								if( senkou_span_b_displaced <= 0.142328 )
									ret := -0.303030
								if( senkou_span_b_displaced > 0.142328 )
									ret := 0.286316
			if( tenkan_sen > 0.159578 )
				if( chinkou_span <= 0.159594 )
					if( basis_minus <= -0.002259 )
						if( basis_max <= 0.000563 )
							if( senkou_span_b <= 0.164291 )
								ret := -1.000000 // sell
							if( senkou_span_b > 0.164291 )
								if( tenkan_sen <= 0.161264 )
									ret := -0.230769
								if( tenkan_sen > 0.161264 )
									ret := -0.857143 // sell
						if( basis_max > 0.000563 )
							if( basis_minus <= -0.003544 )
								ret := 0.750000 // buy
							if( basis_minus > -0.003544 )
								if( senkou_span_a <= 0.16225 )
									ret := -0.750000 // sell
								if( senkou_span_a > 0.16225 )
									ret := 0.200000
					if( basis_minus > -0.002259 )
						if( senkou_span_b <= 0.160484 )
							ret := 0.250000
						if( senkou_span_b > 0.160484 )
							if( basis_minus <= -0.000818 )
								if( senkou_span_b_displaced <= 0.165025 )
									ret := -0.484848
								if( senkou_span_b_displaced > 0.165025 )
									ret := -0.882353 // sell
							if( basis_minus > -0.000818 )
								if( kinjun_sen <= 0.159955 )
									ret := -0.714286 // sell
								if( kinjun_sen > 0.159955 )
									ret := -0.978723 // sell
				if( chinkou_span > 0.159594 )
					if( basis_max <= 2.7e-05 )
						if( senkou_span_a_displaced <= 0.161751 )
							if( basis_max <= -7.2e-05 )
								ret := 0.500000
							if( basis_max > -7.2e-05 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.161751 )
							if( senkou_span_b <= 0.165475 )
								if( senkou_span_b_displaced <= 0.163755 )
									ret := -0.891892 // sell
								if( senkou_span_b_displaced > 0.163755 )
									ret := -0.250000
							if( senkou_span_b > 0.165475 )
								ret := -0.166667
					if( basis_max > 2.7e-05 )
						if( chinkou_span <= 0.1616 )
							if( basis_max <= 0.000337 )
								if( chinkou_span <= 0.160674 )
									ret := 0.705882 // buy
								if( chinkou_span > 0.160674 )
									ret := -0.571429
							if( basis_max > 0.000337 )
								if( senkou_span_a_displaced <= 0.161983 )
									ret := -0.742857 // sell
								if( senkou_span_a_displaced > 0.161983 )
									ret := 0.000000
						if( chinkou_span > 0.1616 )
							if( senkou_span_b_displaced <= 0.164219 )
								if( basis_minus <= -0.000575 )
									ret := 0.518519
								if( basis_minus > -0.000575 )
									ret := 0.952381 // buy
							if( senkou_span_b_displaced > 0.164219 )
								if( kinjun_sen <= 0.165972 )
									ret := 0.103448
								if( kinjun_sen > 0.165972 )
									ret := -1.000000 // sell
	if( basis_minus > -0.000278 )
		if( basis_max <= -0.000118 )
			if( senkou_span_a_displaced <= 0.142862 )
				if( senkou_span_b_displaced <= 0.081375 )
					if( senkou_span_a_displaced <= 0.078367 )
						if( senkou_span_b_displaced <= 0.078754 )
							ret := 0.500000
						if( senkou_span_b_displaced > 0.078754 )
							if( senkou_span_a_displaced <= 0.077316 )
								ret := 0.500000
							if( senkou_span_a_displaced > 0.077316 )
								if( senkou_span_b_displaced <= 0.079298 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.079298 )
									ret := 0.923077 // buy
					if( senkou_span_a_displaced > 0.078367 )
						if( chinkou_span <= 0.0861 )
							if( basis_max <= -0.000537 )
								if( senkou_span_a <= 0.081625 )
									ret := -0.500000
								if( senkou_span_a > 0.081625 )
									ret := -0.500000
							if( basis_max > -0.000537 )
								if( tenkan_sen <= 0.082844 )
									ret := 0.448276
								if( tenkan_sen > 0.082844 )
									ret := 0.866667 // buy
						if( chinkou_span > 0.0861 )
							if( basis_max <= -0.00074 )
								ret := -0.250000
							if( basis_max > -0.00074 )
								ret := -1.000000 // sell
				if( senkou_span_b_displaced > 0.081375 )
					if( chinkou_span <= 0.142601 )
						if( tenkan_sen <= 0.141202 )
							if( basis_max <= -0.001033 )
								if( senkou_span_b_displaced <= 0.124538 )
									ret := -0.393258
								if( senkou_span_b_displaced > 0.124538 )
									ret := -0.897436 // sell
							if( basis_max > -0.001033 )
								if( basis_minus <= 0.00185 )
									ret := -0.007983
								if( basis_minus > 0.00185 )
									ret := 0.216312
						if( tenkan_sen > 0.141202 )
							if( chinkou_span <= 0.140693 )
								if( basis_max <= -0.000203 )
									ret := -0.857143 // sell
								if( basis_max > -0.000203 )
									ret := -0.372093
							if( chinkou_span > 0.140693 )
								if( tenkan_sen <= 0.142613 )
									ret := -0.025210
								if( tenkan_sen > 0.142613 )
									ret := -0.587302
					if( chinkou_span > 0.142601 )
						if( senkou_span_b <= 0.141534 )
							if( senkou_span_a_displaced <= 0.141938 )
								if( senkou_span_a_displaced <= 0.141443 )
									ret := 0.592857
								if( senkou_span_a_displaced > 0.141443 )
									ret := -0.100000
							if( senkou_span_a_displaced > 0.141938 )
								ret := 1.000000 // buy
						if( senkou_span_b > 0.141534 )
							if( chinkou_span <= 0.145221 )
								if( senkou_span_a_displaced <= 0.141877 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 0.141877 )
									ret := -0.014706
							if( chinkou_span > 0.145221 )
								if( tenkan_sen <= 0.145625 )
									ret := 0.661417
								if( tenkan_sen > 0.145625 )
									ret := 0.000000
			if( senkou_span_a_displaced > 0.142862 )
				if( chinkou_span <= 0.147395 )
					if( basis_minus <= -0.000249 )
						if( tenkan_sen <= 0.146275 )
							ret := 0.750000 // buy
						if( tenkan_sen > 0.146275 )
							ret := 0.000000
					if( basis_minus > -0.000249 )
						if( senkou_span_a <= 0.145812 )
							if( senkou_span_b_displaced <= 0.14515 )
								if( basis_minus <= 0.000274 )
									ret := -0.852632 // sell
								if( basis_minus > 0.000274 )
									ret := -0.509804
							if( senkou_span_b_displaced > 0.14515 )
								if( tenkan_sen <= 0.145687 )
									ret := 0.333333
								if( tenkan_sen > 0.145687 )
									ret := -0.525000
						if( senkou_span_a > 0.145812 )
							if( senkou_span_b_displaced <= 0.146731 )
								if( senkou_span_b_displaced <= 0.144356 )
									ret := -0.818182 // sell
								if( senkou_span_b_displaced > 0.144356 )
									ret := -0.966102 // sell
							if( senkou_span_b_displaced > 0.146731 )
								if( tenkan_sen <= 0.148959 )
									ret := -0.157895
								if( tenkan_sen > 0.148959 )
									ret := -0.903226 // sell
				if( chinkou_span > 0.147395 )
					if( senkou_span_a <= 0.147508 )
						if( senkou_span_a_displaced <= 0.146387 )
							if( senkou_span_b_displaced <= 0.1461 )
								if( chinkou_span <= 0.154723 )
									ret := 0.714286 // buy
								if( chinkou_span > 0.154723 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.1461 )
								ret := 0.500000
						if( senkou_span_a_displaced > 0.146387 )
							if( senkou_span_b_displaced <= 0.147026 )
								if( senkou_span_a_displaced <= 0.146468 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.146468 )
									ret := -0.250000
							if( senkou_span_b_displaced > 0.147026 )
								if( senkou_span_a <= 0.147087 )
									ret := 0.809524 // buy
								if( senkou_span_a > 0.147087 )
									ret := 0.153846
					if( senkou_span_a > 0.147508 )
						if( tenkan_sen <= 0.158787 )
							if( chinkou_span <= 0.156132 )
								if( basis_max <= -0.000229 )
									ret := -0.431122
								if( basis_max > -0.000229 )
									ret := -0.015000
							if( chinkou_span > 0.156132 )
								if( basis_minus <= 4.9e-05 )
									ret := -0.222222
								if( basis_minus > 4.9e-05 )
									ret := 0.548718
						if( tenkan_sen > 0.158787 )
							if( senkou_span_b <= 0.158283 )
								if( kinjun_sen <= 0.157875 )
									ret := -0.083333
								if( kinjun_sen > 0.157875 )
									ret := -0.727273 // sell
							if( senkou_span_b > 0.158283 )
								if( senkou_span_a_displaced <= 0.158963 )
									ret := 0.130208
								if( senkou_span_a_displaced > 0.158963 )
									ret := -0.542735
		if( basis_max > -0.000118 )
			if( senkou_span_b <= 0.081725 )
				if( senkou_span_b_displaced <= 0.083675 )
					if( senkou_span_a_displaced <= 0.078756 )
						ret := 0.800000 // buy
					if( senkou_span_a_displaced > 0.078756 )
						if( chinkou_span <= 0.077994 )
							if( senkou_span_a_displaced <= 0.079891 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 0.079891 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.077994 )
							if( basis_max <= 6.3e-05 )
								if( basis_max <= -4.3e-05 )
									ret := -0.692308
								if( basis_max > -4.3e-05 )
									ret := -1.000000 // sell
							if( basis_max > 6.3e-05 )
								if( senkou_span_a_displaced <= 0.080814 )
									ret := -0.769231 // sell
								if( senkou_span_a_displaced > 0.080814 )
									ret := 0.181818
				if( senkou_span_b_displaced > 0.083675 )
					ret := 0.750000 // buy
			if( senkou_span_b > 0.081725 )
				if( senkou_span_a_displaced <= 0.087497 )
					if( chinkou_span <= 0.088424 )
						if( tenkan_sen <= 0.08776 )
							if( basis_minus <= 0.000324 )
								if( basis_minus <= -0.000123 )
									ret := 0.297297
								if( basis_minus > -0.000123 )
									ret := 0.608824
							if( basis_minus > 0.000324 )
								if( senkou_span_b_displaced <= 0.085951 )
									ret := -0.284211
								if( senkou_span_b_displaced > 0.085951 )
									ret := 0.419355
						if( tenkan_sen > 0.08776 )
							if( senkou_span_b <= 0.087565 )
								if( senkou_span_a_displaced <= 0.087294 )
									ret := -0.100000
								if( senkou_span_a_displaced > 0.087294 )
									ret := -0.600000
							if( senkou_span_b > 0.087565 )
								if( chinkou_span <= 0.088001 )
									ret := -0.894737 // sell
								if( chinkou_span > 0.088001 )
									ret := -0.250000
					if( chinkou_span > 0.088424 )
						if( tenkan_sen <= 0.08755 )
							if( senkou_span_a_displaced <= 0.087249 )
								if( senkou_span_b_displaced <= 0.087249 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.087249 )
									ret := 0.875000 // buy
							if( senkou_span_a_displaced > 0.087249 )
								if( senkou_span_a <= 0.087387 )
									ret := -0.250000
								if( senkou_span_a > 0.087387 )
									ret := 0.647059
						if( tenkan_sen > 0.08755 )
							ret := 1.000000 // buy
				if( senkou_span_a_displaced > 0.087497 )
					if( chinkou_span <= 0.130004 )
						if( senkou_span_a <= 0.129444 )
							if( chinkou_span <= 0.127601 )
								if( senkou_span_b <= 0.125647 )
									ret := 0.036345
								if( senkou_span_b > 0.125647 )
									ret := -0.276978
							if( chinkou_span > 0.127601 )
								if( kinjun_sen <= 0.127596 )
									ret := 0.707447 // buy
								if( kinjun_sen > 0.127596 )
									ret := 0.141709
						if( senkou_span_a > 0.129444 )
							if( chinkou_span <= 0.128998 )
								if( senkou_span_a_displaced <= 0.129877 )
									ret := -0.830986 // sell
								if( senkou_span_a_displaced > 0.129877 )
									ret := -0.440154
							if( chinkou_span > 0.128998 )
								if( tenkan_sen <= 0.131554 )
									ret := -0.157233
								if( tenkan_sen > 0.131554 )
									ret := -0.663265
					if( chinkou_span > 0.130004 )
						if( senkou_span_a <= 0.129571 )
							if( senkou_span_a <= 0.129277 )
								if( chinkou_span <= 0.13041 )
									ret := 0.703390 // buy
								if( chinkou_span > 0.13041 )
									ret := 0.861842 // buy
							if( senkou_span_a > 0.129277 )
								if( tenkan_sen <= 0.129441 )
									ret := 0.735849 // buy
								if( tenkan_sen > 0.129441 )
									ret := -0.136364
						if( senkou_span_a > 0.129571 )
							if( tenkan_sen <= 0.139349 )
								if( chinkou_span <= 0.135636 )
									ret := 0.089827
								if( chinkou_span > 0.135636 )
									ret := 0.360472
							if( tenkan_sen > 0.139349 )
								if( senkou_span_a <= 0.165243 )
									ret := 0.061201
								if( senkou_span_a > 0.165243 )
									ret := -0.862069 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_5Min_4f4d94f9(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


