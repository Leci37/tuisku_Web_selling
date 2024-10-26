//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: META_1Min_1ICH_a35a60ab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_1ICH_a35a60ab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_a35a60ab(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b <= 501.408 )
		if( basis_max <= 0.25453 )
			if( chinkou_span <= 500.462 )
				if( senkou_span_a <= 497.381 )
					if( chinkou_span <= 497.395 )
						if( tenkan_sen <= 494.334 )
							if( senkou_span_b <= 419.48 )
								if( chinkou_span <= 416.722 )
									ret := -0.250000
								if( chinkou_span > 416.722 )
									ret := 0.713542 // buy
							if( senkou_span_b > 419.48 )
								if( chinkou_span <= 492.429 )
									ret := 0.030102
								if( chinkou_span > 492.429 )
									ret := 0.337600
						if( tenkan_sen > 494.334 )
							if( senkou_span_b <= 492.444 )
								if( basis_minus <= 2.32878 )
									ret := -0.971831 // sell
								if( basis_minus > 2.32878 )
									ret := -0.181818
							if( senkou_span_b > 492.444 )
								if( chinkou_span <= 494.201 )
									ret := -0.402834
								if( chinkou_span > 494.201 )
									ret := -0.039539
					if( chinkou_span > 497.395 )
						if( senkou_span_b <= 488.749 )
							if( senkou_span_a_displaced <= 473.535 )
								ret := 0.250000
							if( senkou_span_a_displaced > 473.535 )
								if( kinjun_sen <= 473.438 )
									ret := 0.571429
								if( kinjun_sen > 473.438 )
									ret := 1.000000 // buy
						if( senkou_span_b > 488.749 )
							if( kinjun_sen <= 486.345 )
								ret := -1.000000 // sell
							if( kinjun_sen > 486.345 )
								if( basis_minus <= -0.041195 )
									ret := 0.642612
								if( basis_minus > -0.041195 )
									ret := 0.344902
				if( senkou_span_a > 497.381 )
					if( chinkou_span <= 496.935 )
						if( basis_minus <= -0.277949 )
							if( senkou_span_b_displaced <= 499.723 )
								if( basis_minus <= -0.390013 )
									ret := -0.357143
								if( basis_minus > -0.390013 )
									ret := -0.800000 // sell
							if( senkou_span_b_displaced > 499.723 )
								if( basis_max <= -0.359387 )
									ret := 0.000000
								if( basis_max > -0.359387 )
									ret := -0.916667 // sell
						if( basis_minus > -0.277949 )
							if( senkou_span_b <= 497.86 )
								if( chinkou_span <= 496.669 )
									ret := -0.788991 // sell
								if( chinkou_span > 496.669 )
									ret := -0.100000
							if( senkou_span_b > 497.86 )
								if( senkou_span_a <= 500.914 )
									ret := -0.052083
								if( senkou_span_a > 500.914 )
									ret := -0.780488 // sell
					if( chinkou_span > 496.935 )
						if( tenkan_sen <= 499.848 )
							if( senkou_span_b <= 493.616 )
								if( tenkan_sen <= 497.651 )
									ret := 1.000000 // buy
								if( tenkan_sen > 497.651 )
									ret := 0.000000
							if( senkou_span_b > 493.616 )
								if( basis_minus <= 2.22995 )
									ret := 0.002562
								if( basis_minus > 2.22995 )
									ret := -1.000000 // sell
						if( tenkan_sen > 499.848 )
							if( senkou_span_b_displaced <= 501.472 )
								if( senkou_span_a_displaced <= 500.984 )
									ret := -0.406130
								if( senkou_span_a_displaced > 500.984 )
									ret := -0.768421 // sell
							if( senkou_span_b_displaced > 501.472 )
								if( senkou_span_b_displaced <= 502.825 )
									ret := 0.224138
								if( senkou_span_b_displaced > 502.825 )
									ret := -1.000000 // sell
			if( chinkou_span > 500.462 )
				if( senkou_span_a <= 500.798 )
					if( senkou_span_a_displaced <= 490.123 )
						if( tenkan_sen <= 499.535 )
							if( senkou_span_a_displaced <= 486.67 )
								if( chinkou_span <= 502.555 )
									ret := 1.000000 // buy
								if( chinkou_span > 502.555 )
									ret := 0.583333
							if( senkou_span_a_displaced > 486.67 )
								if( basis_minus <= 4.6004 )
									ret := -0.600000
								if( basis_minus > 4.6004 )
									ret := 0.600000
						if( tenkan_sen > 499.535 )
							if( senkou_span_b_displaced <= 493.947 )
								if( senkou_span_a <= 494.591 )
									ret := -0.750000 // sell
								if( senkou_span_a > 494.591 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 493.947 )
								ret := -0.250000
					if( senkou_span_a_displaced > 490.123 )
						if( kinjun_sen <= 496.814 )
							if( kinjun_sen <= 488.732 )
								ret := 0.000000
							if( kinjun_sen > 488.732 )
								if( senkou_span_a_displaced <= 491.376 )
									ret := 0.235294
								if( senkou_span_a_displaced > 491.376 )
									ret := 0.891026 // buy
						if( kinjun_sen > 496.814 )
							if( kinjun_sen <= 500.425 )
								if( basis_max <= 0.13625 )
									ret := 0.517609
								if( basis_max > 0.13625 )
									ret := 0.033333
							if( kinjun_sen > 500.425 )
								if( senkou_span_a_displaced <= 497.649 )
									ret := -0.500000
								if( senkou_span_a_displaced > 497.649 )
									ret := 0.786517 // buy
				if( senkou_span_a > 500.798 )
					if( kinjun_sen <= 500.637 )
						if( senkou_span_b <= 499.303 )
							if( chinkou_span <= 503.585 )
								ret := -0.200000
							if( chinkou_span > 503.585 )
								ret := -1.000000 // sell
						if( senkou_span_b > 499.303 )
							if( basis_minus <= 1.51287 )
								if( senkou_span_b_displaced <= 500.444 )
									ret := 0.160000
								if( senkou_span_b_displaced > 500.444 )
									ret := -0.457143
							if( basis_minus > 1.51287 )
								if( senkou_span_a_displaced <= 498.292 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 498.292 )
									ret := 0.571429
					if( kinjun_sen > 500.637 )
						if( senkou_span_a <= 501.75 )
							if( chinkou_span <= 502.164 )
								if( kinjun_sen <= 501.565 )
									ret := 0.019355
								if( kinjun_sen > 501.565 )
									ret := 0.709677 // buy
							if( chinkou_span > 502.164 )
								if( senkou_span_a_displaced <= 502.539 )
									ret := 0.710843 // buy
								if( senkou_span_a_displaced > 502.539 )
									ret := 0.000000
						if( senkou_span_a > 501.75 )
							if( chinkou_span <= 502.605 )
								if( senkou_span_b_displaced <= 498.95 )
									ret := 0.687500
								if( senkou_span_b_displaced > 498.95 )
									ret := -0.410072
							if( chinkou_span > 502.605 )
								if( senkou_span_b <= 499.807 )
									ret := -0.072917
								if( senkou_span_b > 499.807 )
									ret := 0.621429
		if( basis_max > 0.25453 )
			if( chinkou_span <= 499.237 )
				if( senkou_span_b <= 500.094 )
					if( basis_minus <= -1.20756 )
						if( chinkou_span <= 460.291 )
							if( senkou_span_a <= 457.685 )
								if( senkou_span_b <= 464.929 )
									ret := 0.202323
								if( senkou_span_b > 464.929 )
									ret := -1.000000 // sell
							if( senkou_span_a > 457.685 )
								if( basis_minus <= -1.7044 )
									ret := -0.760684 // sell
								if( basis_minus > -1.7044 )
									ret := -0.194444
						if( chinkou_span > 460.291 )
							if( senkou_span_b_displaced <= 476.034 )
								if( tenkan_sen <= 482.498 )
									ret := 0.670996
								if( tenkan_sen > 482.498 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 476.034 )
								if( chinkou_span <= 477.054 )
									ret := -0.129129
								if( chinkou_span > 477.054 )
									ret := 0.312764
					if( basis_minus > -1.20756 )
						if( basis_max <= 1.28564 )
							if( chinkou_span <= 428.923 )
								if( chinkou_span <= 418.616 )
									ret := 0.281250
								if( chinkou_span > 418.616 )
									ret := -0.579439
							if( chinkou_span > 428.923 )
								if( senkou_span_b <= 430.305 )
									ret := 0.800000 // buy
								if( senkou_span_b > 430.305 )
									ret := 0.119517
						if( basis_max > 1.28564 )
							if( senkou_span_a_displaced <= 434.095 )
								ret := 0.500000
							if( senkou_span_a_displaced > 434.095 )
								if( chinkou_span <= 478.835 )
									ret := -0.607143
								if( chinkou_span > 478.835 )
									ret := -0.933333 // sell
				if( senkou_span_b > 500.094 )
					if( basis_max <= 1.6882 )
						if( kinjun_sen <= 497.599 )
							ret := 0.800000 // buy
						if( kinjun_sen > 497.599 )
							if( senkou_span_b_displaced <= 505.906 )
								if( senkou_span_a <= 500.785 )
									ret := -0.795031 // sell
								if( senkou_span_a > 500.785 )
									ret := -0.200000
							if( senkou_span_b_displaced > 505.906 )
								if( tenkan_sen <= 498.955 )
									ret := 1.000000 // buy
								if( tenkan_sen > 498.955 )
									ret := -0.555556
					if( basis_max > 1.6882 )
						if( kinjun_sen <= 499.964 )
							if( senkou_span_b_displaced <= 505.343 )
								ret := 0.750000 // buy
							if( senkou_span_b_displaced > 505.343 )
								ret := 0.800000 // buy
						if( kinjun_sen > 499.964 )
							ret := 1.000000 // buy
			if( chinkou_span > 499.237 )
				if( senkou_span_b_displaced <= 504.804 )
					if( basis_max <= 0.466758 )
						if( kinjun_sen <= 499.088 )
							if( senkou_span_b <= 492.15 )
								if( senkou_span_a <= 490.981 )
									ret := 0.500000
								if( senkou_span_a > 490.981 )
									ret := -0.250000
							if( senkou_span_b > 492.15 )
								if( chinkou_span <= 499.509 )
									ret := 1.000000 // buy
								if( chinkou_span > 499.509 )
									ret := 0.739130 // buy
						if( kinjun_sen > 499.088 )
							if( kinjun_sen <= 501.173 )
								if( chinkou_span <= 503.053 )
									ret := 0.202703
								if( chinkou_span > 503.053 )
									ret := 0.884615 // buy
							if( kinjun_sen > 501.173 )
								if( senkou_span_a_displaced <= 502.413 )
									ret := 0.062500
								if( senkou_span_a_displaced > 502.413 )
									ret := -0.400000
					if( basis_max > 0.466758 )
						if( basis_minus <= -3.2828 )
							ret := -0.250000
						if( basis_minus > -3.2828 )
							if( tenkan_sen <= 499.991 )
								if( chinkou_span <= 499.273 )
									ret := 0.500000
								if( chinkou_span > 499.273 )
									ret := 0.941176 // buy
							if( tenkan_sen > 499.991 )
								ret := 0.000000
				if( senkou_span_b_displaced > 504.804 )
					if( senkou_span_a_displaced <= 502.06 )
						ret := -0.250000
					if( senkou_span_a_displaced > 502.06 )
						ret := -1.000000 // sell
	if( senkou_span_b > 501.408 )
		if( chinkou_span <= 501.487 )
			if( senkou_span_a <= 502.782 )
				if( basis_max <= 0.5488 )
					if( chinkou_span <= 497.545 )
						if( senkou_span_a <= 502.284 )
							if( senkou_span_b_displaced <= 504.681 )
								if( senkou_span_b <= 501.853 )
									ret := -0.705882 // sell
								if( senkou_span_b > 501.853 )
									ret := -0.962963 // sell
							if( senkou_span_b_displaced > 504.681 )
								if( senkou_span_a_displaced <= 503.723 )
									ret := -0.062500
								if( senkou_span_a_displaced > 503.723 )
									ret := -0.828571 // sell
						if( senkou_span_a > 502.284 )
							if( chinkou_span <= 497.158 )
								ret := 0.000000
							if( chinkou_span > 497.158 )
								ret := -0.500000
					if( chinkou_span > 497.545 )
						if( basis_minus <= 0.04632 )
							if( basis_max <= 0.052452 )
								if( basis_max <= -0.099875 )
									ret := -0.227273
								if( basis_max > -0.099875 )
									ret := -0.753731 // sell
							if( basis_max > 0.052452 )
								if( senkou_span_b_displaced <= 503.675 )
									ret := -0.405622
								if( senkou_span_b_displaced > 503.675 )
									ret := -0.051429
						if( basis_minus > 0.04632 )
							if( senkou_span_a <= 501.772 )
								if( basis_max <= 0.055763 )
									ret := 0.791667 // buy
								if( basis_max > 0.055763 )
									ret := 0.166667
							if( senkou_span_a > 501.772 )
								if( senkou_span_b <= 502.108 )
									ret := -0.184466
								if( senkou_span_b > 502.108 )
									ret := -0.733333 // sell
				if( basis_max > 0.5488 )
					if( senkou_span_b_displaced <= 505.857 )
						if( basis_max <= 0.891434 )
							if( chinkou_span <= 496.858 )
								if( basis_max <= 0.560403 )
									ret := -0.200000
								if( basis_max > 0.560403 )
									ret := -0.958333 // sell
							if( chinkou_span > 496.858 )
								if( senkou_span_b_displaced <= 503.605 )
									ret := -0.219512
								if( senkou_span_b_displaced > 503.605 )
									ret := 0.521127
						if( basis_max > 0.891434 )
							if( chinkou_span <= 496.191 )
								if( chinkou_span <= 495.906 )
									ret := -0.166667
								if( chinkou_span > 495.906 )
									ret := 0.500000
							if( chinkou_span > 496.191 )
								if( basis_minus <= -1.10803 )
									ret := -0.750000 // sell
								if( basis_minus > -1.10803 )
									ret := -0.200000
					if( senkou_span_b_displaced > 505.857 )
						ret := 1.000000 // buy
			if( senkou_span_a > 502.782 )
				if( basis_minus <= 0.516464 )
					if( chinkou_span <= 499.826 )
						if( tenkan_sen <= 502.126 )
							ret := 0.666667
						if( tenkan_sen > 502.126 )
							if( basis_max <= 0.913738 )
								if( kinjun_sen <= 503.319 )
									ret := -0.428571
								if( kinjun_sen > 503.319 )
									ret := -0.879121 // sell
							if( basis_max > 0.913738 )
								ret := 0.250000
					if( chinkou_span > 499.826 )
						if( senkou_span_a <= 504.981 )
							if( chinkou_span <= 500.778 )
								if( basis_minus <= 0.258009 )
									ret := -0.807229 // sell
								if( basis_minus > 0.258009 )
									ret := 0.000000
							if( chinkou_span > 500.778 )
								if( senkou_span_a <= 503.759 )
									ret := -0.025000
								if( senkou_span_a > 503.759 )
									ret := -0.718750 // sell
						if( senkou_span_a > 504.981 )
							if( tenkan_sen <= 505.322 )
								if( kinjun_sen <= 505.721 )
									ret := 0.666667
								if( kinjun_sen > 505.721 )
									ret := 1.000000 // buy
							if( tenkan_sen > 505.322 )
								if( senkou_span_b <= 507.052 )
									ret := -0.153846
								if( senkou_span_b > 507.052 )
									ret := -0.842105 // sell
				if( basis_minus > 0.516464 )
					if( senkou_span_b <= 504.04 )
						if( basis_max <= -0.171486 )
							if( basis_max <= -0.258958 )
								if( senkou_span_a <= 505.583 )
									ret := -0.454545
								if( senkou_span_a > 505.583 )
									ret := -1.000000 // sell
							if( basis_max > -0.258958 )
								if( tenkan_sen <= 503.332 )
									ret := -1.000000 // sell
								if( tenkan_sen > 503.332 )
									ret := -0.833333 // sell
						if( basis_max > -0.171486 )
							if( basis_max <= 0.279561 )
								if( senkou_span_b_displaced <= 503.317 )
									ret := -0.677419
								if( senkou_span_b_displaced > 503.317 )
									ret := 0.300000
							if( basis_max > 0.279561 )
								ret := -1.000000 // sell
					if( senkou_span_b > 504.04 )
						if( senkou_span_b_displaced <= 504.821 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 504.821 )
							ret := -0.750000 // sell
		if( chinkou_span > 501.487 )
			if( senkou_span_a <= 506.862 )
				if( chinkou_span <= 506.153 )
					if( senkou_span_a <= 505.106 )
						if( tenkan_sen <= 504.16 )
							if( senkou_span_b_displaced <= 502.41 )
								if( senkou_span_b_displaced <= 501.579 )
									ret := 0.211494
								if( senkou_span_b_displaced > 501.579 )
									ret := -0.078775
							if( senkou_span_b_displaced > 502.41 )
								if( chinkou_span <= 502.904 )
									ret := -0.044041
								if( chinkou_span > 502.904 )
									ret := 0.332308
						if( tenkan_sen > 504.16 )
							if( senkou_span_b_displaced <= 499.039 )
								if( basis_minus <= 2.05472 )
									ret := -0.862069 // sell
								if( basis_minus > 2.05472 )
									ret := 0.000000
							if( senkou_span_b_displaced > 499.039 )
								if( senkou_span_a_displaced <= 501.68 )
									ret := 0.563636
								if( senkou_span_a_displaced > 501.68 )
									ret := -0.032787
					if( senkou_span_a > 505.106 )
						if( chinkou_span <= 505.346 )
							if( senkou_span_a_displaced <= 510.884 )
								if( basis_max <= -1.18967 )
									ret := -0.965517 // sell
								if( basis_max > -1.18967 )
									ret := -0.379786
							if( senkou_span_a_displaced > 510.884 )
								if( chinkou_span <= 502.161 )
									ret := -0.500000
								if( chinkou_span > 502.161 )
									ret := 0.645161
						if( chinkou_span > 505.346 )
							if( tenkan_sen <= 506.484 )
								if( senkou_span_b_displaced <= 505.091 )
									ret := 0.329670
								if( senkou_span_b_displaced > 505.091 )
									ret := -0.075949
							if( tenkan_sen > 506.484 )
								if( kinjun_sen <= 506.618 )
									ret := -0.457143
								if( kinjun_sen > 506.618 )
									ret := 0.090909
				if( chinkou_span > 506.153 )
					if( senkou_span_b_displaced <= 500.19 )
						if( senkou_span_a_displaced <= 500.547 )
							if( basis_max <= -0.77013 )
								ret := -1.000000 // sell
							if( basis_max > -0.77013 )
								ret := -0.428571
						if( senkou_span_a_displaced > 500.547 )
							if( senkou_span_a <= 505.699 )
								if( senkou_span_b <= 501.675 )
									ret := 0.000000
								if( senkou_span_b > 501.675 )
									ret := -0.250000
							if( senkou_span_a > 505.699 )
								ret := -0.400000
					if( senkou_span_b_displaced > 500.19 )
						if( tenkan_sen <= 504.8 )
							if( basis_minus <= 1.2325 )
								if( basis_minus <= 0.724577 )
									ret := 0.634921
								if( basis_minus > 0.724577 )
									ret := 0.862745 // buy
							if( basis_minus > 1.2325 )
								ret := 0.000000
						if( tenkan_sen > 504.8 )
							if( senkou_span_a_displaced <= 504.544 )
								if( senkou_span_b_displaced <= 501.69 )
									ret := 0.626667
								if( senkou_span_b_displaced > 501.69 )
									ret := -0.148148
							if( senkou_span_a_displaced > 504.544 )
								if( chinkou_span <= 508.907 )
									ret := 0.454678
								if( chinkou_span > 508.907 )
									ret := 0.834395 // buy
			if( senkou_span_a > 506.862 )
				if( basis_max <= 0.751296 )
					if( chinkou_span <= 507.003 )
						if( tenkan_sen <= 508.762 )
							if( senkou_span_b <= 509.355 )
								if( basis_minus <= -0.51495 )
									ret := -0.698347
								if( basis_minus > -0.51495 )
									ret := -0.398082
							if( senkou_span_b > 509.355 )
								if( senkou_span_b_displaced <= 511.727 )
									ret := 0.477612
								if( senkou_span_b_displaced > 511.727 )
									ret := -0.700000 // sell
						if( tenkan_sen > 508.762 )
							if( senkou_span_a_displaced <= 512.865 )
								if( basis_max <= 0.054974 )
									ret := -0.852273 // sell
								if( basis_max > 0.054974 )
									ret := -0.662722
							if( senkou_span_a_displaced > 512.865 )
								if( senkou_span_b <= 512.27 )
									ret := 0.357143
								if( senkou_span_b > 512.27 )
									ret := -0.550000
					if( chinkou_span > 507.003 )
						if( tenkan_sen <= 508.184 )
							if( senkou_span_b_displaced <= 508.47 )
								if( senkou_span_a_displaced <= 505.717 )
									ret := 0.524752
								if( senkou_span_a_displaced > 505.717 )
									ret := 0.157447
							if( senkou_span_b_displaced > 508.47 )
								if( senkou_span_a <= 508.251 )
									ret := 0.769737 // buy
								if( senkou_span_a > 508.251 )
									ret := 0.136364
						if( tenkan_sen > 508.184 )
							if( senkou_span_b <= 598.357 )
								if( chinkou_span <= 510.086 )
									ret := -0.231973
								if( chinkou_span > 510.086 )
									ret := 0.052173
							if( senkou_span_b > 598.357 )
								if( basis_minus <= -2.3409 )
									ret := 0.250000
								if( basis_minus > -2.3409 )
									ret := -0.859649 // sell
				if( basis_max > 0.751296 )
					if( kinjun_sen <= 532.177 )
						if( senkou_span_b <= 527.796 )
							if( senkou_span_a_displaced <= 528.557 )
								if( chinkou_span <= 515.113 )
									ret := -0.582902
								if( chinkou_span > 515.113 )
									ret := 0.082474
							if( senkou_span_a_displaced > 528.557 )
								if( senkou_span_a <= 523.402 )
									ret := -0.500000
								if( senkou_span_a > 523.402 )
									ret := 0.657895
						if( senkou_span_b > 527.796 )
							if( chinkou_span <= 529.888 )
								if( senkou_span_b_displaced <= 532.225 )
									ret := -0.739130 // sell
								if( senkou_span_b_displaced > 532.225 )
									ret := -0.969231 // sell
							if( chinkou_span > 529.888 )
								ret := 0.250000
					if( kinjun_sen > 532.177 )
						if( senkou_span_a_displaced <= 540.036 )
							if( kinjun_sen <= 534.726 )
								if( senkou_span_a_displaced <= 535.769 )
									ret := 0.956522 // buy
								if( senkou_span_a_displaced > 535.769 )
									ret := 0.666667
							if( kinjun_sen > 534.726 )
								if( senkou_span_b_displaced <= 536.196 )
									ret := -0.156250
								if( senkou_span_b_displaced > 536.196 )
									ret := 0.888889 // buy
						if( senkou_span_a_displaced > 540.036 )
							if( senkou_span_a_displaced <= 573.252 )
								if( basis_max <= 1.46038 )
									ret := -0.075949
								if( basis_max > 1.46038 )
									ret := -0.468085
							if( senkou_span_a_displaced > 573.252 )
								if( basis_minus <= -0.768997 )
									ret := 0.406504
								if( basis_minus > -0.768997 )
									ret := -0.571429
	
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
float op_operation = decision_tree_0_META_1Min_a35a60ab(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


