//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BNBUSDT_30Min_1ICH_7064378f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1ICH_7064378f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_7064378f(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a_displaced <= 209.944 )
		if( chinkou_span <= 43.7921 )
			if( tenkan_sen <= 41.2395 )
				if( chinkou_span <= 40.3783 )
					if( senkou_span_b_displaced <= 30.0576 )
						if( chinkou_span <= 29.7429 )
							if( kinjun_sen <= 28.3941 )
								if( chinkou_span <= 28.2731 )
									ret := 0.071130
								if( chinkou_span > 28.2731 )
									ret := 0.385366
							if( kinjun_sen > 28.3941 )
								if( senkou_span_b_displaced <= 29.4893 )
									ret := -0.271298
								if( senkou_span_b_displaced > 29.4893 )
									ret := 0.090361
						if( chinkou_span > 29.7429 )
							if( basis_minus <= 0.289791 )
								if( basis_max <= -0.160834 )
									ret := 0.261905
								if( basis_max > -0.160834 )
									ret := 0.715762 // buy
							if( basis_minus > 0.289791 )
								if( kinjun_sen <= 29.9547 )
									ret := 0.597087
								if( kinjun_sen > 29.9547 )
									ret := -0.114068
					if( senkou_span_b_displaced > 30.0576 )
						if( chinkou_span <= 30.3534 )
							if( kinjun_sen <= 31.2463 )
								if( tenkan_sen <= 27.4176 )
									ret := 0.627907
								if( tenkan_sen > 27.4176 )
									ret := -0.193303
							if( kinjun_sen > 31.2463 )
								if( senkou_span_a_displaced <= 30.7884 )
									ret := 0.000000
								if( senkou_span_a_displaced > 30.7884 )
									ret := -0.884298 // sell
						if( chinkou_span > 30.3534 )
							if( tenkan_sen <= 33.1746 )
								if( chinkou_span <= 31.8835 )
									ret := 0.065878
								if( chinkou_span > 31.8835 )
									ret := 0.501171
							if( tenkan_sen > 33.1746 )
								if( senkou_span_a_displaced <= 32.8479 )
									ret := -0.728972 // sell
								if( senkou_span_a_displaced > 32.8479 )
									ret := -0.010587
				if( chinkou_span > 40.3783 )
					if( senkou_span_b_displaced <= 40.9087 )
						if( basis_minus <= 0.734375 )
							if( kinjun_sen <= 40.8055 )
								if( chinkou_span <= 41.1029 )
									ret := 0.779141 // buy
								if( chinkou_span > 41.1029 )
									ret := 0.475000
							if( kinjun_sen > 40.8055 )
								if( senkou_span_a <= 41.201 )
									ret := 0.935897 // buy
								if( senkou_span_a > 41.201 )
									ret := 0.142857
						if( basis_minus > 0.734375 )
							if( chinkou_span <= 41.265 )
								if( senkou_span_b_displaced <= 39.0673 )
									ret := 0.909091 // buy
								if( senkou_span_b_displaced > 39.0673 )
									ret := 0.411765
							if( chinkou_span > 41.265 )
								if( senkou_span_b <= 39.3671 )
									ret := -0.708333 // sell
								if( senkou_span_b > 39.3671 )
									ret := 0.400000
					if( senkou_span_b_displaced > 40.9087 )
						if( senkou_span_b_displaced <= 41.3359 )
							if( senkou_span_a <= 41.0366 )
								if( tenkan_sen <= 40.3897 )
									ret := -0.681818
								if( tenkan_sen > 40.3897 )
									ret := 0.350000
							if( senkou_span_a > 41.0366 )
								if( basis_max <= 0.070053 )
									ret := -0.750000 // sell
								if( basis_max > 0.070053 )
									ret := -1.000000 // sell
						if( senkou_span_b_displaced > 41.3359 )
							if( senkou_span_a <= 40.9921 )
								if( chinkou_span <= 40.7243 )
									ret := 0.250000
								if( chinkou_span > 40.7243 )
									ret := 0.820000 // buy
							if( senkou_span_a > 40.9921 )
								if( kinjun_sen <= 41.4103 )
									ret := -0.210526
								if( kinjun_sen > 41.4103 )
									ret := 0.800000 // buy
			if( tenkan_sen > 41.2395 )
				if( chinkou_span <= 41.5995 )
					if( basis_max <= -0.296288 )
						if( tenkan_sen <= 41.8768 )
							if( chinkou_span <= 40.3464 )
								ret := 1.000000 // buy
							if( chinkou_span > 40.3464 )
								ret := 0.000000
						if( tenkan_sen > 41.8768 )
							if( senkou_span_b <= 41.724 )
								ret := 0.000000
							if( senkou_span_b > 41.724 )
								ret := -0.857143 // sell
					if( basis_max > -0.296288 )
						if( senkou_span_b_displaced <= 39.8933 )
							if( senkou_span_a_displaced <= 40.0857 )
								ret := -0.166667
							if( senkou_span_a_displaced > 40.0857 )
								if( senkou_span_b <= 40.226 )
									ret := -0.750000 // sell
								if( senkou_span_b > 40.226 )
									ret := -0.980769 // sell
						if( senkou_span_b_displaced > 39.8933 )
							if( senkou_span_a_displaced <= 41.0694 )
								if( kinjun_sen <= 41.3839 )
									ret := -0.142857
								if( kinjun_sen > 41.3839 )
									ret := 0.625000
							if( senkou_span_a_displaced > 41.0694 )
								if( tenkan_sen <= 41.5139 )
									ret := -0.821918 // sell
								if( tenkan_sen > 41.5139 )
									ret := -0.470199
				if( chinkou_span > 41.5995 )
					if( senkou_span_b <= 40.8293 )
						if( senkou_span_a <= 41.0613 )
							ret := 0.000000
						if( senkou_span_a > 41.0613 )
							if( tenkan_sen <= 41.8586 )
								if( basis_minus <= 0.722452 )
									ret := -0.500000
								if( basis_minus > 0.722452 )
									ret := -1.000000 // sell
							if( tenkan_sen > 41.8586 )
								ret := -0.400000
					if( senkou_span_b > 40.8293 )
						if( basis_max <= 0.003987 )
							if( senkou_span_b_displaced <= 42.2854 )
								if( senkou_span_b_displaced <= 42.1358 )
									ret := 0.009615
								if( senkou_span_b_displaced > 42.1358 )
									ret := 0.653846
							if( senkou_span_b_displaced > 42.2854 )
								if( basis_minus <= -0.214902 )
									ret := 0.571429
								if( basis_minus > -0.214902 )
									ret := -0.611650
						if( basis_max > 0.003987 )
							if( senkou_span_b <= 42.869 )
								if( chinkou_span <= 42.5801 )
									ret := 0.851064 // buy
								if( chinkou_span > 42.5801 )
									ret := 0.388889
							if( senkou_span_b > 42.869 )
								if( basis_max <= 0.21008 )
									ret := -0.448276
								if( basis_max > 0.21008 )
									ret := 0.625000
		if( chinkou_span > 43.7921 )
			if( tenkan_sen <= 124.458 )
				if( chinkou_span <= 71.7097 )
					if( senkou_span_a_displaced <= 70.6588 )
						if( basis_max <= -0.98638 )
							if( basis_minus <= 4.25626 )
								if( senkou_span_b <= 67.2227 )
									ret := -0.666667
								if( senkou_span_b > 67.2227 )
									ret := -1.000000 // sell
							if( basis_minus > 4.25626 )
								ret := 0.200000
						if( basis_max > -0.98638 )
							if( basis_minus <= 0.704004 )
								if( tenkan_sen <= 44.4796 )
									ret := 0.719298 // buy
								if( tenkan_sen > 44.4796 )
									ret := 0.444444
							if( basis_minus > 0.704004 )
								if( kinjun_sen <= 55.1153 )
									ret := -0.069264
								if( kinjun_sen > 55.1153 )
									ret := 0.773196 // buy
					if( senkou_span_a_displaced > 70.6588 )
						if( senkou_span_b_displaced <= 68.4294 )
							if( senkou_span_a_displaced <= 71.6166 )
								if( senkou_span_a <= 71.5324 )
									ret := -0.500000
								if( senkou_span_a > 71.5324 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 71.6166 )
								if( chinkou_span <= 68.361 )
									ret := 1.000000 // buy
								if( chinkou_span > 68.361 )
									ret := -0.500000
						if( senkou_span_b_displaced > 68.4294 )
							if( senkou_span_a_displaced <= 71.9859 )
								if( basis_max <= -0.101019 )
									ret := -1.000000 // sell
								if( basis_max > -0.101019 )
									ret := -0.250000
							if( senkou_span_a_displaced > 71.9859 )
								ret := -1.000000 // sell
				if( chinkou_span > 71.7097 )
					if( senkou_span_a_displaced <= 58.2232 )
						if( basis_minus <= 2.26566 )
							ret := 1.000000 // buy
						if( basis_minus > 2.26566 )
							if( tenkan_sen <= 64.8633 )
								ret := -0.500000
							if( tenkan_sen > 64.8633 )
								ret := -1.000000 // sell
					if( senkou_span_a_displaced > 58.2232 )
						if( senkou_span_a <= 124.572 )
							if( senkou_span_a <= 105.674 )
								if( tenkan_sen <= 100.621 )
									ret := 0.775120 // buy
								if( tenkan_sen > 100.621 )
									ret := 0.250000
							if( senkou_span_a > 105.674 )
								if( senkou_span_a <= 124.011 )
									ret := 1.000000 // buy
								if( senkou_span_a > 124.011 )
									ret := 0.785714 // buy
						if( senkou_span_a > 124.572 )
							ret := -0.250000
			if( tenkan_sen > 124.458 )
				if( chinkou_span <= 133.106 )
					if( senkou_span_b <= 129.136 )
						if( tenkan_sen <= 130.769 )
							if( tenkan_sen <= 126.283 )
								if( senkou_span_a <= 125.15 )
									ret := 0.428571
								if( senkou_span_a > 125.15 )
									ret := -0.636364
							if( tenkan_sen > 126.283 )
								if( tenkan_sen <= 130.11 )
									ret := 0.777778 // buy
								if( tenkan_sen > 130.11 )
									ret := 0.375000
						if( tenkan_sen > 130.769 )
							if( basis_minus <= 2.56438 )
								if( chinkou_span <= 130.579 )
									ret := 0.000000
								if( chinkou_span > 130.579 )
									ret := 0.500000
							if( basis_minus > 2.56438 )
								if( senkou_span_a <= 130.181 )
									ret := -1.000000 // sell
								if( senkou_span_a > 130.181 )
									ret := -0.692308
					if( senkou_span_b > 129.136 )
						if( senkou_span_b <= 132.692 )
							if( senkou_span_a_displaced <= 125.464 )
								if( senkou_span_a <= 132.526 )
									ret := -1.000000 // sell
								if( senkou_span_a > 132.526 )
									ret := 0.666667
							if( senkou_span_a_displaced > 125.464 )
								if( senkou_span_a_displaced <= 134.867 )
									ret := -0.724409 // sell
								if( senkou_span_a_displaced > 134.867 )
									ret := 1.000000 // buy
						if( senkou_span_b > 132.692 )
							if( basis_max <= -0.462227 )
								ret := -1.000000 // sell
							if( basis_max > -0.462227 )
								if( basis_minus <= -2.99351 )
									ret := 0.000000
								if( basis_minus > -2.99351 )
									ret := 0.714286 // buy
				if( chinkou_span > 133.106 )
					if( senkou_span_b_displaced <= 131.959 )
						if( senkou_span_a_displaced <= 130.712 )
							if( senkou_span_a_displaced <= 124.43 )
								if( tenkan_sen <= 129.877 )
									ret := 1.000000 // buy
								if( tenkan_sen > 129.877 )
									ret := -0.727273 // sell
							if( senkou_span_a_displaced > 124.43 )
								if( kinjun_sen <= 152.984 )
									ret := 0.832168 // buy
								if( kinjun_sen > 152.984 )
									ret := -0.333333
						if( senkou_span_a_displaced > 130.712 )
							if( chinkou_span <= 137.271 )
								ret := 0.750000 // buy
							if( chinkou_span > 137.271 )
								if( senkou_span_b_displaced <= 130.765 )
									ret := -0.571429
								if( senkou_span_b_displaced > 130.765 )
									ret := -1.000000 // sell
					if( senkou_span_b_displaced > 131.959 )
						if( chinkou_span <= 210.301 )
							if( basis_minus <= 11.4812 )
								if( senkou_span_a_displaced <= 133.157 )
									ret := -0.821429 // sell
								if( senkou_span_a_displaced > 133.157 )
									ret := -0.029091
							if( basis_minus > 11.4812 )
								if( basis_minus <= 16.808 )
									ret := 1.000000 // buy
								if( basis_minus > 16.808 )
									ret := 0.750000 // buy
						if( chinkou_span > 210.301 )
							if( basis_minus <= -0.75 )
								if( senkou_span_a <= 206.8 )
									ret := 0.941176 // buy
								if( senkou_span_a > 206.8 )
									ret := 0.250000
							if( basis_minus > -0.75 )
								if( senkou_span_b <= 254.674 )
									ret := 0.363636
								if( senkou_span_b > 254.674 )
									ret := -1.000000 // sell
	if( senkou_span_a_displaced > 209.944 )
		if( senkou_span_a <= 587.669 )
			if( basis_max <= -0.208177 )
				if( chinkou_span <= 583.087 )
					if( senkou_span_a <= 567.371 )
						if( kinjun_sen <= 211.927 )
							if( chinkou_span <= 216.05 )
								if( basis_minus <= 0.459481 )
									ret := 0.000000
								if( basis_minus > 0.459481 )
									ret := 0.200000
							if( chinkou_span > 216.05 )
								if( basis_minus <= 1.56799 )
									ret := 0.876543 // buy
								if( basis_minus > 1.56799 )
									ret := -0.250000
						if( kinjun_sen > 211.927 )
							if( chinkou_span <= 245.113 )
								if( senkou_span_b_displaced <= 232.755 )
									ret := 0.024363
								if( senkou_span_b_displaced > 232.755 )
									ret := -0.266317
							if( chinkou_span > 245.113 )
								if( tenkan_sen <= 269.135 )
									ret := 0.266151
								if( tenkan_sen > 269.135 )
									ret := 0.065783
					if( senkou_span_a > 567.371 )
						if( senkou_span_b_displaced <= 592.468 )
							if( basis_minus <= 34.9208 )
								if( chinkou_span <= 566.942 )
									ret := -0.648876
								if( chinkou_span > 566.942 )
									ret := -0.076006
							if( basis_minus > 34.9208 )
								if( basis_max <= -11.1414 )
									ret := 0.750000 // buy
								if( basis_max > -11.1414 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 592.468 )
							if( senkou_span_a <= 576.663 )
								if( chinkou_span <= 576.5 )
									ret := 0.813953 // buy
								if( chinkou_span > 576.5 )
									ret := -0.750000 // sell
							if( senkou_span_a > 576.663 )
								ret := -1.000000 // sell
				if( chinkou_span > 583.087 )
					if( kinjun_sen <= 573.9 )
						if( senkou_span_a <= 561.233 )
							if( basis_max <= -10.9016 )
								ret := 0.000000
							if( basis_max > -10.9016 )
								if( senkou_span_a_displaced <= 532.388 )
									ret := 0.796610 // buy
								if( senkou_span_a_displaced > 532.388 )
									ret := 0.899281 // buy
						if( senkou_span_a > 561.233 )
							if( basis_minus <= 29.6088 )
								if( chinkou_span <= 614.891 )
									ret := 0.633333
								if( chinkou_span > 614.891 )
									ret := 0.136364
							if( basis_minus > 29.6088 )
								ret := -0.428571
					if( kinjun_sen > 573.9 )
						if( chinkou_span <= 607.063 )
							if( senkou_span_a_displaced <= 563.598 )
								if( senkou_span_a <= 581.602 )
									ret := -0.718750 // sell
								if( senkou_span_a > 581.602 )
									ret := 0.166667
							if( senkou_span_a_displaced > 563.598 )
								if( senkou_span_b_displaced <= 582.449 )
									ret := 0.076613
								if( senkou_span_b_displaced > 582.449 )
									ret := 0.355263
						if( chinkou_span > 607.063 )
							if( senkou_span_b_displaced <= 580.948 )
								if( senkou_span_b_displaced <= 575.909 )
									ret := 0.900000 // buy
								if( senkou_span_b_displaced > 575.909 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 580.948 )
								if( senkou_span_b_displaced <= 581.49 )
									ret := -0.333333
								if( senkou_span_b_displaced > 581.49 )
									ret := 0.677419
			if( basis_max > -0.208177 )
				if( chinkou_span <= 588.414 )
					if( basis_minus <= -6.15048 )
						if( kinjun_sen <= 264.653 )
							if( chinkou_span <= 247.079 )
								if( tenkan_sen <= 214.15 )
									ret := 0.826087 // buy
								if( tenkan_sen > 214.15 )
									ret := 0.178174
							if( chinkou_span > 247.079 )
								if( senkou_span_b_displaced <= 304.346 )
									ret := 0.776786 // buy
								if( senkou_span_b_displaced > 304.346 )
									ret := -0.086957
						if( kinjun_sen > 264.653 )
							if( senkou_span_b_displaced <= 328.407 )
								if( basis_max <= 1.06346 )
									ret := 0.242038
								if( basis_max > 1.06346 )
									ret := -0.190014
							if( senkou_span_b_displaced > 328.407 )
								if( senkou_span_a_displaced <= 387.746 )
									ret := 0.332592
								if( senkou_span_a_displaced > 387.746 )
									ret := 0.064998
					if( basis_minus > -6.15048 )
						if( senkou_span_a_displaced <= 564.6 )
							if( kinjun_sen <= 563.392 )
								if( chinkou_span <= 550.342 )
									ret := 0.001389
								if( chinkou_span > 550.342 )
									ret := 0.355556
							if( kinjun_sen > 563.392 )
								if( senkou_span_a_displaced <= 557.741 )
									ret := 0.803030 // buy
								if( senkou_span_a_displaced > 557.741 )
									ret := 0.305882
						if( senkou_span_a_displaced > 564.6 )
							if( senkou_span_b_displaced <= 573.788 )
								if( chinkou_span <= 547.36 )
									ret := -0.782609 // sell
								if( chinkou_span > 547.36 )
									ret := -0.172662
							if( senkou_span_b_displaced > 573.788 )
								if( kinjun_sen <= 571.538 )
									ret := 0.226131
								if( kinjun_sen > 571.538 )
									ret := -0.151136
				if( chinkou_span > 588.414 )
					if( basis_max <= -0.193976 )
						ret := -0.800000 // sell
					if( basis_max > -0.193976 )
						if( chinkou_span <= 604.256 )
							if( senkou_span_b <= 593.465 )
								if( kinjun_sen <= 586.966 )
									ret := 0.462406
								if( kinjun_sen > 586.966 )
									ret := -0.263158
							if( senkou_span_b > 593.465 )
								if( senkou_span_a <= 587.226 )
									ret := 1.000000 // buy
								if( senkou_span_a > 587.226 )
									ret := 0.750000 // buy
						if( chinkou_span > 604.256 )
							if( basis_minus <= 2.6675 )
								if( chinkou_span <= 607.761 )
									ret := 0.634146
								if( chinkou_span > 607.761 )
									ret := 0.848837 // buy
							if( basis_minus > 2.6675 )
								if( senkou_span_b_displaced <= 569.378 )
									ret := 0.500000
								if( senkou_span_b_displaced > 569.378 )
									ret := 0.000000
		if( senkou_span_a > 587.669 )
			if( chinkou_span <= 592.264 )
				if( tenkan_sen <= 583.949 )
					if( kinjun_sen <= 594.166 )
						ret := -0.500000
					if( kinjun_sen > 594.166 )
						if( chinkou_span <= 588.628 )
							if( senkou_span_a <= 589.661 )
								ret := 0.750000 // buy
							if( senkou_span_a > 589.661 )
								ret := 1.000000 // buy
						if( chinkou_span > 588.628 )
							ret := 0.250000
				if( tenkan_sen > 583.949 )
					if( basis_minus <= -9.98472 )
						if( senkou_span_b <= 611.945 )
							if( senkou_span_a_displaced <= 635.931 )
								if( basis_minus <= -15.1451 )
									ret := 0.458333
								if( basis_minus > -15.1451 )
									ret := -0.305556
							if( senkou_span_a_displaced > 635.931 )
								if( senkou_span_a <= 601.279 )
									ret := 0.954545 // buy
								if( senkou_span_a > 601.279 )
									ret := 0.000000
						if( senkou_span_b > 611.945 )
							if( basis_minus <= -11.5907 )
								if( basis_max <= 3.57096 )
									ret := 0.000000
								if( basis_max > 3.57096 )
									ret := -0.853659 // sell
							if( basis_minus > -11.5907 )
								if( basis_minus <= -11.2625 )
									ret := 1.000000 // buy
								if( basis_minus > -11.2625 )
									ret := 0.000000
					if( basis_minus > -9.98472 )
						if( senkou_span_a_displaced <= 616.55 )
							if( senkou_span_a <= 624.158 )
								if( chinkou_span <= 578.891 )
									ret := -0.663529
								if( chinkou_span > 578.891 )
									ret := -0.371393
							if( senkou_span_a > 624.158 )
								if( senkou_span_b <= 613.441 )
									ret := 0.000000
								if( senkou_span_b > 613.441 )
									ret := 0.894737 // buy
						if( senkou_span_a_displaced > 616.55 )
							if( basis_max <= 6.53195 )
								if( kinjun_sen <= 596.298 )
									ret := 0.142857
								if( kinjun_sen > 596.298 )
									ret := -0.812903 // sell
							if( basis_max > 6.53195 )
								if( tenkan_sen <= 595.173 )
									ret := 1.000000 // buy
								if( tenkan_sen > 595.173 )
									ret := -0.250000
			if( chinkou_span > 592.264 )
				if( chinkou_span <= 654.792 )
					if( tenkan_sen <= 645.472 )
						if( chinkou_span <= 609.145 )
							if( tenkan_sen <= 606.925 )
								if( chinkou_span <= 599.507 )
									ret := -0.088068
								if( chinkou_span > 599.507 )
									ret := 0.194631
							if( tenkan_sen > 606.925 )
								if( chinkou_span <= 600.25 )
									ret := -0.102190
								if( chinkou_span > 600.25 )
									ret := -0.402899
						if( chinkou_span > 609.145 )
							if( senkou_span_a <= 617.286 )
								if( tenkan_sen <= 614.79 )
									ret := 0.467818
								if( tenkan_sen > 614.79 )
									ret := -0.051724
							if( senkou_span_a > 617.286 )
								if( chinkou_span <= 635.534 )
									ret := -0.093354
								if( chinkou_span > 635.534 )
									ret := 0.308725
					if( tenkan_sen > 645.472 )
						if( kinjun_sen <= 654.544 )
							if( kinjun_sen <= 652.342 )
								if( senkou_span_a_displaced <= 661.34 )
									ret := -0.338095
								if( senkou_span_a_displaced > 661.34 )
									ret := -1.000000 // sell
							if( kinjun_sen > 652.342 )
								if( chinkou_span <= 624.973 )
									ret := 0.785714 // buy
								if( chinkou_span > 624.973 )
									ret := -0.466667
						if( kinjun_sen > 654.544 )
							if( chinkou_span <= 632.151 )
								if( basis_minus <= -3.81875 )
									ret := 0.214286
								if( basis_minus > -3.81875 )
									ret := -0.500000
							if( chinkou_span > 632.151 )
								if( senkou_span_b_displaced <= 680.956 )
									ret := -0.875912 // sell
								if( senkou_span_b_displaced > 680.956 )
									ret := 0.000000
				if( chinkou_span > 654.792 )
					if( tenkan_sen <= 648.928 )
						if( senkou_span_b_displaced <= 616.548 )
							if( senkou_span_b_displaced <= 611.398 )
								if( chinkou_span <= 664.65 )
									ret := 0.981818 // buy
								if( chinkou_span > 664.65 )
									ret := 0.750000 // buy
							if( senkou_span_b_displaced > 611.398 )
								if( basis_minus <= 10.023 )
									ret := 0.615385
								if( basis_minus > 10.023 )
									ret := 0.920000 // buy
						if( senkou_span_b_displaced > 616.548 )
							if( basis_minus <= 4.42 )
								if( senkou_span_a_displaced <= 676.736 )
									ret := 0.827586 // buy
								if( senkou_span_a_displaced > 676.736 )
									ret := -0.250000
							if( basis_minus > 4.42 )
								if( senkou_span_b_displaced <= 628.948 )
									ret := 0.000000
								if( senkou_span_b_displaced > 628.948 )
									ret := 0.800000 // buy
					if( tenkan_sen > 648.928 )
						if( kinjun_sen <= 701.05 )
							if( senkou_span_a <= 649.049 )
								if( senkou_span_b <= 630.488 )
									ret := 0.000000
								if( senkou_span_b > 630.488 )
									ret := -0.636364
							if( senkou_span_a > 649.049 )
								if( senkou_span_b_displaced <= 635.727 )
									ret := 0.723077 // buy
								if( senkou_span_b_displaced > 635.727 )
									ret := 0.143498
						if( kinjun_sen > 701.05 )
							if( basis_max <= 0.879065 )
								if( tenkan_sen <= 703.25 )
									ret := -0.800000 // sell
								if( tenkan_sen > 703.25 )
									ret := -0.270270
							if( basis_max > 0.879065 )
								if( chinkou_span <= 705.967 )
									ret := 0.318182
								if( chinkou_span > 705.967 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_7064378f(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


