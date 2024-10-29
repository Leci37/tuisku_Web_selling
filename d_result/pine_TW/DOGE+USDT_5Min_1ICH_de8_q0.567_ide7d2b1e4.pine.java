//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: DOGEUSDT_5Min_1ICH_e7d2b1e4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_5Min_1ICH_e7d2b1e4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_5Min_e7d2b1e4(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.000216 )
		if( basis_minus <= -0.000285 )
			if( basis_max <= -0.000701 )
				if( senkou_span_a <= 0.175172 )
					if( chinkou_span <= 0.14252 )
						if( basis_minus <= -0.000674 )
							if( basis_max <= -0.000955 )
								if( basis_max <= -0.001401 )
									ret := -0.714286 // sell
								if( basis_max > -0.001401 )
									ret := -0.959184 // sell
							if( basis_max > -0.000955 )
								if( tenkan_sen <= 0.121351 )
									ret := -0.142857
								if( tenkan_sen > 0.121351 )
									ret := -0.826087 // sell
						if( basis_minus > -0.000674 )
							if( chinkou_span <= 0.10056 )
								if( senkou_span_a_displaced <= 0.077622 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 0.077622 )
									ret := -1.000000 // sell
							if( chinkou_span > 0.10056 )
								if( senkou_span_a <= 0.120721 )
									ret := 0.800000 // buy
								if( senkou_span_a > 0.120721 )
									ret := -0.500000
					if( chinkou_span > 0.14252 )
						if( basis_max <= -0.00195 )
							if( senkou_span_a_displaced <= 0.143485 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.143485 )
								if( tenkan_sen <= 0.146429 )
									ret := 0.000000
								if( tenkan_sen > 0.146429 )
									ret := -0.875000 // sell
						if( basis_max > -0.00195 )
							if( tenkan_sen <= 0.154818 )
								if( basis_max <= -0.00075 )
									ret := 0.873016 // buy
								if( basis_max > -0.00075 )
									ret := -0.111111
							if( tenkan_sen > 0.154818 )
								if( chinkou_span <= 0.163143 )
									ret := -0.833333 // sell
								if( chinkou_span > 0.163143 )
									ret := 0.507463
				if( senkou_span_a > 0.175172 )
					if( basis_minus <= -0.000567 )
						if( basis_minus <= -0.003108 )
							if( senkou_span_a_displaced <= 0.190953 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.190953 )
								if( senkou_span_b <= 0.196435 )
									ret := 0.500000
								if( senkou_span_b > 0.196435 )
									ret := 0.000000
						if( basis_minus > -0.003108 )
							if( senkou_span_b_displaced <= 0.179978 )
								ret := 0.000000
							if( senkou_span_b_displaced > 0.179978 )
								if( tenkan_sen <= 0.200605 )
									ret := -0.788732 // sell
								if( tenkan_sen > 0.200605 )
									ret := -1.000000 // sell
					if( basis_minus > -0.000567 )
						if( chinkou_span <= 0.19034 )
							ret := 0.000000
						if( chinkou_span > 0.19034 )
							ret := 0.833333 // buy
			if( basis_max > -0.000701 )
				if( senkou_span_b <= 0.168038 )
					if( chinkou_span <= 0.165515 )
						if( tenkan_sen <= 0.16356 )
							if( senkou_span_b_displaced <= 0.167455 )
								if( basis_minus <= -0.002719 )
									ret := 0.375394
								if( basis_minus > -0.002719 )
									ret := 0.080843
							if( senkou_span_b_displaced > 0.167455 )
								if( basis_max <= -0.000614 )
									ret := -0.500000
								if( basis_max > -0.000614 )
									ret := -1.000000 // sell
						if( tenkan_sen > 0.16356 )
							if( senkou_span_b <= 0.164355 )
								if( senkou_span_b_displaced <= 0.163721 )
									ret := -0.250000
								if( senkou_span_b_displaced > 0.163721 )
									ret := -0.825000 // sell
							if( senkou_span_b > 0.164355 )
								if( kinjun_sen <= 0.165195 )
									ret := -0.039474
								if( kinjun_sen > 0.165195 )
									ret := -0.904762 // sell
					if( chinkou_span > 0.165515 )
						if( senkou_span_a_displaced <= 0.16691 )
							if( basis_max <= -0.000474 )
								if( kinjun_sen <= 0.162903 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.162903 )
									ret := 0.700000 // buy
							if( basis_max > -0.000474 )
								if( senkou_span_a_displaced <= 0.166696 )
									ret := 0.859649 // buy
								if( senkou_span_a_displaced > 0.166696 )
									ret := 0.567568
						if( senkou_span_a_displaced > 0.16691 )
							if( tenkan_sen <= 0.165552 )
								if( tenkan_sen <= 0.163903 )
									ret := 0.500000
								if( tenkan_sen > 0.163903 )
									ret := 0.902439 // buy
							if( tenkan_sen > 0.165552 )
								if( chinkou_span <= 0.169119 )
									ret := 0.264706
								if( chinkou_span > 0.169119 )
									ret := -0.576923
				if( senkou_span_b > 0.168038 )
					if( chinkou_span <= 0.177086 )
						if( kinjun_sen <= 0.173367 )
							if( chinkou_span <= 0.169306 )
								if( basis_max <= 0.000126 )
									ret := -0.519108
								if( basis_max > 0.000126 )
									ret := 0.403846
							if( chinkou_span > 0.169306 )
								if( tenkan_sen <= 0.173797 )
									ret := 0.375000
								if( tenkan_sen > 0.173797 )
									ret := -0.866667 // sell
						if( kinjun_sen > 0.173367 )
							if( basis_minus <= -0.000931 )
								if( senkou_span_b <= 0.194135 )
									ret := -0.754386 // sell
								if( senkou_span_b > 0.194135 )
									ret := 1.000000 // buy
							if( basis_minus > -0.000931 )
								if( senkou_span_b_displaced <= 0.175253 )
									ret := 0.393939
								if( senkou_span_b_displaced > 0.175253 )
									ret := -0.597826
					if( chinkou_span > 0.177086 )
						if( senkou_span_a <= 0.183108 )
							if( senkou_span_a_displaced <= 0.178232 )
								if( basis_minus <= -0.001662 )
									ret := 0.250000
								if( basis_minus > -0.001662 )
									ret := 0.843750 // buy
							if( senkou_span_a_displaced > 0.178232 )
								if( senkou_span_a_displaced <= 0.181669 )
									ret := 0.107692
								if( senkou_span_a_displaced > 0.181669 )
									ret := 0.568627
						if( senkou_span_a > 0.183108 )
							if( senkou_span_a <= 0.212653 )
								if( chinkou_span <= 0.207724 )
									ret := 0.106518
								if( chinkou_span > 0.207724 )
									ret := 0.641791
							if( senkou_span_a > 0.212653 )
								if( chinkou_span <= 0.21243 )
									ret := -0.638889
								if( chinkou_span > 0.21243 )
									ret := 0.129870
		if( basis_minus > -0.000285 )
			if( chinkou_span <= 0.081224 )
				if( kinjun_sen <= 0.080768 )
					if( senkou_span_b_displaced <= 0.078999 )
						if( chinkou_span <= 0.078541 )
							if( kinjun_sen <= 0.07746 )
								if( chinkou_span <= 0.075036 )
									ret := 0.006293
								if( chinkou_span > 0.075036 )
									ret := 0.168846
							if( kinjun_sen > 0.07746 )
								if( chinkou_span <= 0.077089 )
									ret := -0.640867
								if( chinkou_span > 0.077089 )
									ret := -0.070647
						if( chinkou_span > 0.078541 )
							if( senkou_span_a <= 0.078055 )
								if( basis_max <= -3.7e-05 )
									ret := 0.459459
								if( basis_max > -3.7e-05 )
									ret := 0.728571 // buy
							if( senkou_span_a > 0.078055 )
								if( tenkan_sen <= 0.080609 )
									ret := 0.178322
								if( tenkan_sen > 0.080609 )
									ret := -0.470000
					if( senkou_span_b_displaced > 0.078999 )
						if( chinkou_span <= 0.08018 )
							if( tenkan_sen <= 0.07794 )
								if( senkou_span_b_displaced <= 0.079446 )
									ret := 0.952381 // buy
								if( senkou_span_b_displaced > 0.079446 )
									ret := 0.307692
							if( tenkan_sen > 0.07794 )
								if( chinkou_span <= 0.078902 )
									ret := -0.419708
								if( chinkou_span > 0.078902 )
									ret := -0.113535
						if( chinkou_span > 0.08018 )
							if( basis_max <= -2.2e-05 )
								if( senkou_span_b <= 0.07882 )
									ret := 0.942857 // buy
								if( senkou_span_b > 0.07882 )
									ret := -0.095170
							if( basis_max > -2.2e-05 )
								if( senkou_span_a <= 0.080442 )
									ret := 0.449519
								if( senkou_span_a > 0.080442 )
									ret := 0.218487
				if( kinjun_sen > 0.080768 )
					if( chinkou_span <= 0.08006 )
						if( senkou_span_a <= 0.081589 )
							if( senkou_span_a <= 0.08147 )
								if( kinjun_sen <= 0.081361 )
									ret := -0.645963
								if( kinjun_sen > 0.081361 )
									ret := -1.000000 // sell
							if( senkou_span_a > 0.08147 )
								if( senkou_span_b <= 0.080902 )
									ret := -0.750000 // sell
								if( senkou_span_b > 0.080902 )
									ret := 0.166667
						if( senkou_span_a > 0.081589 )
							if( basis_max <= -5e-05 )
								if( basis_max <= -8e-05 )
									ret := -0.888889 // sell
								if( basis_max > -8e-05 )
									ret := -0.285714
							if( basis_max > -5e-05 )
								ret := -1.000000 // sell
					if( chinkou_span > 0.08006 )
						if( basis_minus <= 0.000761 )
							if( kinjun_sen <= 0.081116 )
								if( chinkou_span <= 0.080997 )
									ret := -0.160600
								if( chinkou_span > 0.080997 )
									ret := 0.132353
							if( kinjun_sen > 0.081116 )
								if( tenkan_sen <= 0.08167 )
									ret := -0.233677
								if( tenkan_sen > 0.08167 )
									ret := -0.506912
						if( basis_minus > 0.000761 )
							if( senkou_span_a <= 0.08422 )
								if( kinjun_sen <= 0.081205 )
									ret := 0.571429
								if( kinjun_sen > 0.081205 )
									ret := 0.000000
							if( senkou_span_a > 0.08422 )
								ret := 1.000000 // buy
			if( chinkou_span > 0.081224 )
				if( tenkan_sen <= 0.081314 )
					if( senkou_span_b_displaced <= 0.080804 )
						if( basis_minus <= 0.001113 )
							if( chinkou_span <= 0.081788 )
								if( basis_minus <= 0.000189 )
									ret := 0.638554
								if( basis_minus > 0.000189 )
									ret := 0.205882
							if( chinkou_span > 0.081788 )
								if( basis_max <= -0.000284 )
									ret := 1.000000 // buy
								if( basis_max > -0.000284 )
									ret := 0.693694
						if( basis_minus > 0.001113 )
							if( kinjun_sen <= 0.080631 )
								if( tenkan_sen <= 0.081031 )
									ret := -0.500000
								if( tenkan_sen > 0.081031 )
									ret := -1.000000 // sell
							if( kinjun_sen > 0.080631 )
								if( senkou_span_a_displaced <= 0.079221 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.079221 )
									ret := 0.571429
					if( senkou_span_b_displaced > 0.080804 )
						if( senkou_span_a <= 0.080279 )
							if( basis_max <= 0.000141 )
								ret := 1.000000 // buy
							if( basis_max > 0.000141 )
								ret := 0.250000
						if( senkou_span_a > 0.080279 )
							if( senkou_span_a <= 0.080584 )
								if( chinkou_span <= 0.081459 )
									ret := -0.111111
								if( chinkou_span > 0.081459 )
									ret := -0.888889 // sell
							if( senkou_span_a > 0.080584 )
								if( tenkan_sen <= 0.080592 )
									ret := 0.705882 // buy
								if( tenkan_sen > 0.080592 )
									ret := 0.142322
				if( tenkan_sen > 0.081314 )
					if( tenkan_sen <= 0.10012 )
						if( chinkou_span <= 0.100275 )
							if( basis_minus <= 0.000658 )
								if( chinkou_span <= 0.095343 )
									ret := 0.038858
								if( chinkou_span > 0.095343 )
									ret := 0.188511
							if( basis_minus > 0.000658 )
								if( senkou_span_a_displaced <= 0.097121 )
									ret := -0.040094
								if( senkou_span_a_displaced > 0.097121 )
									ret := -0.461988
						if( chinkou_span > 0.100275 )
							if( kinjun_sen <= 0.098909 )
								if( senkou_span_a_displaced <= 0.094913 )
									ret := -0.600000
								if( senkou_span_a_displaced > 0.094913 )
									ret := 0.794118 // buy
							if( kinjun_sen > 0.098909 )
								if( tenkan_sen <= 0.099608 )
									ret := 0.018519
								if( tenkan_sen > 0.099608 )
									ret := 0.565371
					if( tenkan_sen > 0.10012 )
						if( chinkou_span <= 0.100945 )
							if( senkou_span_b_displaced <= 0.102184 )
								if( senkou_span_a <= 0.100314 )
									ret := -0.458904
								if( senkou_span_a > 0.100314 )
									ret := -0.219636
							if( senkou_span_b_displaced > 0.102184 )
								if( basis_max <= 6.3e-05 )
									ret := -0.614458
								if( basis_max > 6.3e-05 )
									ret := -0.845361 // sell
						if( chinkou_span > 0.100945 )
							if( senkou_span_a <= 0.101453 )
								if( chinkou_span <= 0.101862 )
									ret := 0.240059
								if( chinkou_span > 0.101862 )
									ret := 0.584615
							if( senkou_span_a > 0.101453 )
								if( chinkou_span <= 0.103702 )
									ret := -0.144316
								if( chinkou_span > 0.103702 )
									ret := 0.036357
	if( basis_max > 0.000216 )
		if( tenkan_sen <= 0.100729 )
			if( chinkou_span <= 0.099096 )
				if( tenkan_sen <= 0.099216 )
					if( chinkou_span <= 0.09684 )
						if( senkou_span_b <= 0.094665 )
							if( kinjun_sen <= 0.067155 )
								if( senkou_span_a_displaced <= 0.062068 )
									ret := 0.000000
								if( senkou_span_a_displaced > 0.062068 )
									ret := 0.702703 // buy
							if( kinjun_sen > 0.067155 )
								if( basis_minus <= -0.000898 )
									ret := 0.445585
								if( basis_minus > -0.000898 )
									ret := 0.168936
						if( senkou_span_b > 0.094665 )
							if( senkou_span_b_displaced <= 0.09995 )
								if( senkou_span_a <= 0.096283 )
									ret := -0.061927
								if( senkou_span_a > 0.096283 )
									ret := -0.475410
							if( senkou_span_b_displaced > 0.09995 )
								if( senkou_span_a_displaced <= 0.104585 )
									ret := 0.515464
								if( senkou_span_a_displaced > 0.104585 )
									ret := -0.809524 // sell
					if( chinkou_span > 0.09684 )
						if( senkou_span_b_displaced <= 0.104255 )
							if( basis_minus <= 0.000618 )
								if( kinjun_sen <= 0.097117 )
									ret := 0.843373 // buy
								if( kinjun_sen > 0.097117 )
									ret := 0.481356
							if( basis_minus > 0.000618 )
								if( senkou_span_a_displaced <= 0.096521 )
									ret := -0.666667
								if( senkou_span_a_displaced > 0.096521 )
									ret := 0.421053
						if( senkou_span_b_displaced > 0.104255 )
							if( tenkan_sen <= 0.095905 )
								ret := -1.000000 // sell
							if( tenkan_sen > 0.095905 )
								ret := 0.200000
				if( tenkan_sen > 0.099216 )
					if( chinkou_span <= 0.097795 )
						if( senkou_span_b_displaced <= 0.100104 )
							if( senkou_span_a_displaced <= 0.100806 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.100806 )
								ret := 0.750000 // buy
						if( senkou_span_b_displaced > 0.100104 )
							if( tenkan_sen <= 0.100065 )
								if( senkou_span_a <= 0.100101 )
									ret := -0.666667
								if( senkou_span_a > 0.100101 )
									ret := 0.250000
							if( tenkan_sen > 0.100065 )
								ret := -1.000000 // sell
					if( chinkou_span > 0.097795 )
						if( senkou_span_a <= 0.101194 )
							if( basis_max <= 0.000341 )
								if( senkou_span_b <= 0.100086 )
									ret := 0.285714
								if( senkou_span_b > 0.100086 )
									ret := -0.708333 // sell
							if( basis_max > 0.000341 )
								if( senkou_span_b <= 0.100337 )
									ret := -1.000000 // sell
								if( senkou_span_b > 0.100337 )
									ret := -0.750000 // sell
						if( senkou_span_a > 0.101194 )
							ret := 0.750000 // buy
			if( chinkou_span > 0.099096 )
				if( tenkan_sen <= 0.098505 )
					if( basis_minus <= -0.00048 )
						if( basis_minus <= -0.001118 )
							if( senkou_span_a <= 0.098225 )
								if( senkou_span_a_displaced <= 0.100045 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.100045 )
									ret := 0.250000
							if( senkou_span_a > 0.098225 )
								ret := 1.000000 // buy
						if( basis_minus > -0.001118 )
							if( senkou_span_a_displaced <= 0.101865 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.101865 )
								ret := 0.750000 // buy
					if( basis_minus > -0.00048 )
						if( senkou_span_b <= 0.099163 )
							if( senkou_span_a <= 0.098687 )
								if( kinjun_sen <= 0.097812 )
									ret := 1.000000 // buy
								if( kinjun_sen > 0.097812 )
									ret := 0.687500
							if( senkou_span_a > 0.098687 )
								ret := 1.000000 // buy
						if( senkou_span_b > 0.099163 )
							ret := 0.500000
				if( tenkan_sen > 0.098505 )
					if( kinjun_sen <= 0.101105 )
						if( kinjun_sen <= 0.100559 )
							if( chinkou_span <= 0.099475 )
								if( senkou_span_b_displaced <= 0.09944 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 0.09944 )
									ret := 0.325000
							if( chinkou_span > 0.099475 )
								if( basis_minus <= -0.000488 )
									ret := 0.741935 // buy
								if( basis_minus > -0.000488 )
									ret := 0.426230
						if( kinjun_sen > 0.100559 )
							if( senkou_span_b <= 0.101573 )
								if( chinkou_span <= 0.100395 )
									ret := -0.600000
								if( chinkou_span > 0.100395 )
									ret := 0.250000
							if( senkou_span_b > 0.101573 )
								if( senkou_span_a <= 0.100794 )
									ret := 1.000000 // buy
								if( senkou_span_a > 0.100794 )
									ret := 0.000000
					if( kinjun_sen > 0.101105 )
						if( kinjun_sen <= 0.102011 )
							if( senkou_span_a_displaced <= 0.100041 )
								ret := 0.500000
							if( senkou_span_a_displaced > 0.100041 )
								if( senkou_span_b <= 0.103213 )
									ret := 0.975410 // buy
								if( senkou_span_b > 0.103213 )
									ret := 0.222222
						if( kinjun_sen > 0.102011 )
							ret := -0.600000
		if( tenkan_sen > 0.100729 )
			if( chinkou_span <= 0.10152 )
				if( senkou_span_b_displaced <= 0.107931 )
					if( basis_minus <= -0.000319 )
						if( senkou_span_b <= 0.103478 )
							if( senkou_span_b_displaced <= 0.104402 )
								if( chinkou_span <= 0.101355 )
									ret := -0.824561 // sell
								if( chinkou_span > 0.101355 )
									ret := -0.200000
							if( senkou_span_b_displaced > 0.104402 )
								if( chinkou_span <= 0.100549 )
									ret := 1.000000 // buy
								if( chinkou_span > 0.100549 )
									ret := 0.400000
						if( senkou_span_b > 0.103478 )
							if( chinkou_span <= 0.100737 )
								if( basis_max <= 0.000524 )
									ret := -1.000000 // sell
								if( basis_max > 0.000524 )
									ret := -0.666667
							if( chinkou_span > 0.100737 )
								if( senkou_span_a_displaced <= 0.107557 )
									ret := -0.720000 // sell
								if( senkou_span_a_displaced > 0.107557 )
									ret := 0.000000
					if( basis_minus > -0.000319 )
						if( basis_minus <= 0.001322 )
							if( chinkou_span <= 0.099572 )
								if( tenkan_sen <= 0.101143 )
									ret := -1.000000 // sell
								if( tenkan_sen > 0.101143 )
									ret := -0.500000
							if( chinkou_span > 0.099572 )
								if( senkou_span_b_displaced <= 0.101185 )
									ret := -0.444444
								if( senkou_span_b_displaced > 0.101185 )
									ret := 0.187500
						if( basis_minus > 0.001322 )
							if( senkou_span_a <= 0.103093 )
								ret := 0.428571
							if( senkou_span_a > 0.103093 )
								ret := 1.000000 // buy
				if( senkou_span_b_displaced > 0.107931 )
					if( senkou_span_a <= 0.10598 )
						if( basis_max <= 0.00091 )
							if( senkou_span_b <= 0.105978 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.105978 )
								ret := 0.333333
						if( basis_max > 0.00091 )
							if( basis_minus <= -0.001921 )
								ret := -1.000000 // sell
							if( basis_minus > -0.001921 )
								if( kinjun_sen <= 0.105088 )
									ret := 0.571429
								if( kinjun_sen > 0.105088 )
									ret := -1.000000 // sell
					if( senkou_span_a > 0.10598 )
						ret := -1.000000 // sell
			if( chinkou_span > 0.10152 )
				if( chinkou_span <= 0.177403 )
					if( senkou_span_a <= 0.177215 )
						if( chinkou_span <= 0.156068 )
							if( senkou_span_a <= 0.154187 )
								if( senkou_span_a_displaced <= 0.100498 )
									ret := -0.852941 // sell
								if( senkou_span_a_displaced > 0.100498 )
									ret := 0.080522
							if( senkou_span_a > 0.154187 )
								if( chinkou_span <= 0.154316 )
									ret := -0.571667
								if( chinkou_span > 0.154316 )
									ret := -0.122449
						if( chinkou_span > 0.156068 )
							if( tenkan_sen <= 0.15829 )
								if( basis_minus <= -0.000436 )
									ret := 0.652878
								if( basis_minus > -0.000436 )
									ret := 0.179245
							if( tenkan_sen > 0.15829 )
								if( chinkou_span <= 0.160336 )
									ret := -0.211094
								if( chinkou_span > 0.160336 )
									ret := 0.126743
					if( senkou_span_a > 0.177215 )
						if( chinkou_span <= 0.173805 )
							if( kinjun_sen <= 0.177822 )
								ret := -0.200000
							if( kinjun_sen > 0.177822 )
								if( senkou_span_b_displaced <= 0.179603 )
									ret := -0.869565 // sell
								if( senkou_span_b_displaced > 0.179603 )
									ret := -1.000000 // sell
						if( chinkou_span > 0.173805 )
							if( senkou_span_a <= 0.178194 )
								if( basis_minus <= -0.001089 )
									ret := 0.163636
								if( basis_minus > -0.001089 )
									ret := -0.677419
							if( senkou_span_a > 0.178194 )
								if( tenkan_sen <= 0.180362 )
									ret := -0.686567
								if( tenkan_sen > 0.180362 )
									ret := -0.111111
				if( chinkou_span > 0.177403 )
					if( kinjun_sen <= 0.180656 )
						if( senkou_span_b_displaced <= 0.179022 )
							if( senkou_span_a <= 0.178454 )
								if( chinkou_span <= 0.1794 )
									ret := 0.807692 // buy
								if( chinkou_span > 0.1794 )
									ret := 0.980952 // buy
							if( senkou_span_a > 0.178454 )
								ret := 0.000000
						if( senkou_span_b_displaced > 0.179022 )
							if( kinjun_sen <= 0.177792 )
								if( senkou_span_b_displaced <= 0.181125 )
									ret := 0.071429
								if( senkou_span_b_displaced > 0.181125 )
									ret := -1.000000 // sell
							if( kinjun_sen > 0.177792 )
								if( senkou_span_b <= 0.180083 )
									ret := 0.565217
								if( senkou_span_b > 0.180083 )
									ret := 0.909091 // buy
					if( kinjun_sen > 0.180656 )
						if( senkou_span_a_displaced <= 0.220236 )
							if( senkou_span_b_displaced <= 0.21959 )
								if( tenkan_sen <= 0.183089 )
									ret := 0.342404
								if( tenkan_sen > 0.183089 )
									ret := 0.081347
							if( senkou_span_b_displaced > 0.21959 )
								if( tenkan_sen <= 0.217475 )
									ret := -0.470588
								if( tenkan_sen > 0.217475 )
									ret := -1.000000 // sell
						if( senkou_span_a_displaced > 0.220236 )
							if( chinkou_span <= 0.223492 )
								if( kinjun_sen <= 0.217495 )
									ret := 0.937500 // buy
								if( kinjun_sen > 0.217495 )
									ret := 0.571429
							if( chinkou_span > 0.223492 )
								ret := -0.250000
	
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
float op_operation = decision_tree_0_DOGEUSDT_5Min_e7d2b1e4(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


