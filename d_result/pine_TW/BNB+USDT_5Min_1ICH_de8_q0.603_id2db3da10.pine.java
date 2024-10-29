//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BNBUSDT_5Min_1ICH_2db3da10 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_5Min_1ICH_2db3da10", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_5Min_2db3da10(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_b <= 583.515 )
		if( chinkou_span <= 581.856 )
			if( senkou_span_a <= 577.402 )
				if( senkou_span_a_displaced <= 577.36 )
					if( basis_minus <= -1.22078 )
						if( senkou_span_a_displaced <= 411.5 )
							if( chinkou_span <= 314.002 )
								if( senkou_span_b <= 315.297 )
									ret := 0.164671
								if( senkou_span_b > 315.297 )
									ret := -0.865079 // sell
							if( chinkou_span > 314.002 )
								if( kinjun_sen <= 315.947 )
									ret := 0.643478
								if( kinjun_sen > 315.947 )
									ret := 0.264485
						if( senkou_span_a_displaced > 411.5 )
							if( senkou_span_a_displaced <= 556.654 )
								if( senkou_span_a_displaced <= 556.274 )
									ret := -0.001279
								if( senkou_span_a_displaced > 556.274 )
									ret := -0.608333
							if( senkou_span_a_displaced > 556.654 )
								if( senkou_span_a <= 550.823 )
									ret := 0.741117 // buy
								if( senkou_span_a > 550.823 )
									ret := 0.091329
					if( basis_minus > -1.22078 )
						if( chinkou_span <= 574.404 )
							if( kinjun_sen <= 571.438 )
								if( basis_max <= -0.825829 )
									ret := -0.085487
								if( basis_max > -0.825829 )
									ret := 0.004695
							if( kinjun_sen > 571.438 )
								if( senkou_span_a_displaced <= 573.896 )
									ret := -0.325781
								if( senkou_span_a_displaced > 573.896 )
									ret := -0.114467
						if( chinkou_span > 574.404 )
							if( tenkan_sen <= 572.943 )
								if( chinkou_span <= 575.707 )
									ret := 0.559896
								if( chinkou_span > 575.707 )
									ret := 0.724256 // buy
							if( tenkan_sen > 572.943 )
								if( senkou_span_a <= 569.488 )
									ret := -1.000000 // sell
								if( senkou_span_a > 569.488 )
									ret := 0.247737
				if( senkou_span_a_displaced > 577.36 )
					if( chinkou_span <= 574.719 )
						if( tenkan_sen <= 566.37 )
							if( senkou_span_a_displaced <= 579.812 )
								if( senkou_span_b_displaced <= 578.386 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 578.386 )
									ret := 0.204545
							if( senkou_span_a_displaced > 579.812 )
								if( senkou_span_a_displaced <= 580.286 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 580.286 )
									ret := -0.512821
						if( tenkan_sen > 566.37 )
							if( tenkan_sen <= 568.371 )
								if( senkou_span_a_displaced <= 582.228 )
									ret := -0.963303 // sell
								if( senkou_span_a_displaced > 582.228 )
									ret := -0.105263
							if( tenkan_sen > 568.371 )
								if( senkou_span_a_displaced <= 577.83 )
									ret := -0.716049 // sell
								if( senkou_span_a_displaced > 577.83 )
									ret := -0.331186
					if( chinkou_span > 574.719 )
						if( basis_max <= 1.18842 )
							if( basis_minus <= -6.21215 )
								if( senkou_span_b_displaced <= 583.049 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 583.049 )
									ret := 0.636364
							if( basis_minus > -6.21215 )
								if( senkou_span_b <= 576.016 )
									ret := -0.486486
								if( senkou_span_b > 576.016 )
									ret := 0.135321
						if( basis_max > 1.18842 )
							if( basis_minus <= -2.7125 )
								if( senkou_span_a_displaced <= 582.749 )
									ret := 0.985294 // buy
								if( senkou_span_a_displaced > 582.749 )
									ret := 0.666667
							if( basis_minus > -2.7125 )
								if( senkou_span_a <= 576.485 )
									ret := 0.350000
								if( senkou_span_a > 576.485 )
									ret := 0.916667 // buy
			if( senkou_span_a > 577.402 )
				if( chinkou_span <= 575.47 )
					if( basis_max <= 0.747189 )
						if( senkou_span_a <= 578.959 )
							if( chinkou_span <= 573.885 )
								if( senkou_span_a_displaced <= 578.376 )
									ret := -0.787234 // sell
								if( senkou_span_a_displaced > 578.376 )
									ret := -0.519084
							if( chinkou_span > 573.885 )
								if( senkou_span_b <= 577.1 )
									ret := 0.100000
								if( senkou_span_b > 577.1 )
									ret := -0.385965
						if( senkou_span_a > 578.959 )
							if( tenkan_sen <= 579.249 )
								if( basis_minus <= -0.756646 )
									ret := -0.730769 // sell
								if( basis_minus > -0.756646 )
									ret := -0.947826 // sell
							if( tenkan_sen > 579.249 )
								if( senkou_span_a_displaced <= 576.836 )
									ret := -0.948052 // sell
								if( senkou_span_a_displaced > 576.836 )
									ret := -0.714286 // sell
					if( basis_max > 0.747189 )
						if( senkou_span_b_displaced <= 586.688 )
							if( senkou_span_b <= 578.907 )
								if( kinjun_sen <= 579.315 )
									ret := -0.818182 // sell
								if( kinjun_sen > 579.315 )
									ret := -1.000000 // sell
							if( senkou_span_b > 578.907 )
								if( chinkou_span <= 562.618 )
									ret := -0.974359 // sell
								if( chinkou_span > 562.618 )
									ret := 0.545455
						if( senkou_span_b_displaced > 586.688 )
							if( basis_minus <= -4.65299 )
								ret := -1.000000 // sell
							if( basis_minus > -4.65299 )
								ret := -0.647059
				if( chinkou_span > 575.47 )
					if( tenkan_sen <= 579.795 )
						if( chinkou_span <= 578.513 )
							if( senkou_span_a <= 578.625 )
								if( senkou_span_a_displaced <= 580.862 )
									ret := -0.416076
								if( senkou_span_a_displaced > 580.862 )
									ret := 0.179245
							if( senkou_span_a > 578.625 )
								if( basis_minus <= -0.521579 )
									ret := 0.335484
								if( basis_minus > -0.521579 )
									ret := -0.251462
						if( chinkou_span > 578.513 )
							if( senkou_span_a <= 580.322 )
								if( chinkou_span <= 580.717 )
									ret := 0.143654
								if( chinkou_span > 580.717 )
									ret := 0.465455
							if( senkou_span_a > 580.322 )
								ret := -0.909091 // sell
					if( tenkan_sen > 579.795 )
						if( senkou_span_b_displaced <= 584.075 )
							if( basis_minus <= 1.77315 )
								if( senkou_span_a <= 581.381 )
									ret := -0.288660
								if( senkou_span_a > 581.381 )
									ret := -0.507143
							if( basis_minus > 1.77315 )
								if( tenkan_sen <= 585.044 )
									ret := -0.021645
								if( tenkan_sen > 585.044 )
									ret := -0.536145
						if( senkou_span_b_displaced > 584.075 )
							if( senkou_span_a <= 582.401 )
								if( senkou_span_a_displaced <= 575.775 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 575.775 )
									ret := 0.256944
							if( senkou_span_a > 582.401 )
								if( basis_minus <= -0.389149 )
									ret := -0.210526
								if( basis_minus > -0.389149 )
									ret := -0.916667 // sell
		if( chinkou_span > 581.856 )
			if( kinjun_sen <= 581.407 )
				if( basis_max <= 0.100503 )
					if( senkou_span_b_displaced <= 582.275 )
						if( senkou_span_b_displaced <= 568.536 )
							if( senkou_span_b_displaced <= 558.825 )
								if( senkou_span_b_displaced <= 556.635 )
									ret := 0.910448 // buy
								if( senkou_span_b_displaced > 556.635 )
									ret := 0.692308
							if( senkou_span_b_displaced > 558.825 )
								if( kinjun_sen <= 580.837 )
									ret := -0.192893
								if( kinjun_sen > 580.837 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 568.536 )
							if( basis_max <= -1.01182 )
								if( tenkan_sen <= 584.103 )
									ret := 0.732510 // buy
								if( tenkan_sen > 584.103 )
									ret := -0.526316
							if( basis_max > -1.01182 )
								if( senkou_span_a <= 579.394 )
									ret := 0.450758
								if( senkou_span_a > 579.394 )
									ret := 0.244123
					if( senkou_span_b_displaced > 582.275 )
						if( basis_minus <= 0.022806 )
							if( chinkou_span <= 582.109 )
								ret := 0.200000
							if( chinkou_span > 582.109 )
								if( kinjun_sen <= 576.73 )
									ret := 0.973333 // buy
								if( kinjun_sen > 576.73 )
									ret := 0.773256 // buy
						if( basis_minus > 0.022806 )
							if( senkou_span_b <= 579.825 )
								if( senkou_span_a_displaced <= 583.712 )
									ret := -0.222222
								if( senkou_span_a_displaced > 583.712 )
									ret := -1.000000 // sell
							if( senkou_span_b > 579.825 )
								if( chinkou_span <= 589.02 )
									ret := 0.437500
								if( chinkou_span > 589.02 )
									ret := 0.914286 // buy
				if( basis_max > 0.100503 )
					if( senkou_span_b <= 572.387 )
						if( chinkou_span <= 583.394 )
							if( senkou_span_b <= 566.875 )
								ret := 1.000000 // buy
							if( senkou_span_b > 566.875 )
								ret := 0.875000 // buy
						if( chinkou_span > 583.394 )
							ret := 1.000000 // buy
					if( senkou_span_b > 572.387 )
						if( senkou_span_b <= 578.351 )
							if( basis_max <= 0.408271 )
								if( senkou_span_a <= 576.13 )
									ret := 1.000000 // buy
								if( senkou_span_a > 576.13 )
									ret := 0.102564
							if( basis_max > 0.408271 )
								if( senkou_span_b_displaced <= 576.45 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 576.45 )
									ret := 0.666667
						if( senkou_span_b > 578.351 )
							if( tenkan_sen <= 580.575 )
								if( kinjun_sen <= 581.237 )
									ret := 0.777778 // buy
								if( kinjun_sen > 581.237 )
									ret := 0.333333
							if( tenkan_sen > 580.575 )
								ret := 0.117647
			if( kinjun_sen > 581.407 )
				if( senkou_span_b <= 582.436 )
					if( chinkou_span <= 597.55 )
						if( senkou_span_b <= 581.8 )
							if( tenkan_sen <= 582.332 )
								if( basis_max <= -0.021512 )
									ret := 0.645833
								if( basis_max > -0.021512 )
									ret := 0.221374
							if( tenkan_sen > 582.332 )
								if( basis_max <= -0.963873 )
									ret := -0.516340
								if( basis_max > -0.963873 )
									ret := 0.107383
						if( senkou_span_b > 581.8 )
							if( senkou_span_a_displaced <= 582.555 )
								if( senkou_span_a_displaced <= 582.058 )
									ret := -0.243478
								if( senkou_span_a_displaced > 582.058 )
									ret := -0.769231 // sell
							if( senkou_span_a_displaced > 582.555 )
								if( basis_max <= 1.62201 )
									ret := 0.173333
								if( basis_max > 1.62201 )
									ret := 1.000000 // buy
					if( chinkou_span > 597.55 )
						if( basis_minus <= 3.06984 )
							if( chinkou_span <= 599.43 )
								ret := 1.000000 // buy
							if( chinkou_span > 599.43 )
								ret := 0.857143 // buy
						if( basis_minus > 3.06984 )
							ret := 0.230769
				if( senkou_span_b > 582.436 )
					if( chinkou_span <= 585.815 )
						if( senkou_span_a <= 582.674 )
							if( basis_minus <= -1.66192 )
								if( senkou_span_a <= 581.137 )
									ret := -0.833333 // sell
								if( senkou_span_a > 581.137 )
									ret := -0.200000
							if( basis_minus > -1.66192 )
								if( senkou_span_a <= 582.253 )
									ret := 0.606061
								if( senkou_span_a > 582.253 )
									ret := 0.795455 // buy
						if( senkou_span_a > 582.674 )
							if( basis_max <= 0.818653 )
								if( senkou_span_b_displaced <= 582.175 )
									ret := 0.445455
								if( senkou_span_b_displaced > 582.175 )
									ret := -0.146453
							if( basis_max > 0.818653 )
								ret := 0.764706 // buy
					if( chinkou_span > 585.815 )
						if( senkou_span_a <= 589.205 )
							if( senkou_span_a <= 587.926 )
								if( basis_max <= 0.605718 )
									ret := 0.422993
								if( basis_max > 0.605718 )
									ret := 0.921569 // buy
							if( senkou_span_a > 587.926 )
								ret := -0.578947
						if( senkou_span_a > 589.205 )
							ret := 1.000000 // buy
	if( senkou_span_b > 583.515 )
		if( chinkou_span <= 591.613 )
			if( senkou_span_b <= 593.238 )
				if( tenkan_sen <= 587.817 )
					if( senkou_span_b <= 589.103 )
						if( basis_max <= -0.804275 )
							if( chinkou_span <= 585.901 )
								if( senkou_span_a <= 584.913 )
									ret := -0.671429
								if( senkou_span_a > 584.913 )
									ret := -0.894737 // sell
							if( chinkou_span > 585.901 )
								if( basis_minus <= 1.26526 )
									ret := 0.423077
								if( basis_minus > 1.26526 )
									ret := -0.625000
						if( basis_max > -0.804275 )
							if( senkou_span_b <= 589.001 )
								if( kinjun_sen <= 588.445 )
									ret := -0.090071
								if( kinjun_sen > 588.445 )
									ret := -0.814815 // sell
							if( senkou_span_b > 589.001 )
								if( senkou_span_a <= 584.679 )
									ret := 0.724138 // buy
								if( senkou_span_a > 584.679 )
									ret := 1.000000 // buy
					if( senkou_span_b > 589.103 )
						if( senkou_span_b_displaced <= 594.513 )
							if( chinkou_span <= 587.016 )
								if( chinkou_span <= 581.25 )
									ret := -0.982759 // sell
								if( chinkou_span > 581.25 )
									ret := -0.662500
							if( chinkou_span > 587.016 )
								if( kinjun_sen <= 588.083 )
									ret := -0.500000
								if( kinjun_sen > 588.083 )
									ret := 0.766667 // buy
						if( senkou_span_b_displaced > 594.513 )
							if( basis_minus <= -4.02317 )
								if( kinjun_sen <= 584.878 )
									ret := -1.000000 // sell
								if( kinjun_sen > 584.878 )
									ret := -0.464286
							if( basis_minus > -4.02317 )
								if( chinkou_span <= 589.045 )
									ret := 0.449153
								if( chinkou_span > 589.045 )
									ret := -1.000000 // sell
				if( tenkan_sen > 587.817 )
					if( basis_minus <= -0.297412 )
						if( kinjun_sen <= 589.71 )
							if( tenkan_sen <= 590.008 )
								if( senkou_span_a <= 588.388 )
									ret := -0.409836
								if( senkou_span_a > 588.388 )
									ret := 0.327068
							if( tenkan_sen > 590.008 )
								if( senkou_span_a <= 589.775 )
									ret := -0.844828 // sell
								if( senkou_span_a > 589.775 )
									ret := 0.166667
						if( kinjun_sen > 589.71 )
							if( senkou_span_b <= 590.392 )
								ret := 0.545455
							if( senkou_span_b > 590.392 )
								if( chinkou_span <= 585.912 )
									ret := -0.777070 // sell
								if( chinkou_span > 585.912 )
									ret := -0.203704
					if( basis_minus > -0.297412 )
						if( chinkou_span <= 589.051 )
							if( kinjun_sen <= 586.727 )
								if( tenkan_sen <= 588.275 )
									ret := 0.000000
								if( tenkan_sen > 588.275 )
									ret := -0.083333
							if( kinjun_sen > 586.727 )
								if( senkou_span_b <= 587.95 )
									ret := -0.809291 // sell
								if( senkou_span_b > 587.95 )
									ret := -0.552962
						if( chinkou_span > 589.051 )
							if( basis_max <= -0.82568 )
								if( basis_minus <= 1.69953 )
									ret := -0.411765
								if( basis_minus > 1.69953 )
									ret := -0.911392 // sell
							if( basis_max > -0.82568 )
								if( kinjun_sen <= 588.2 )
									ret := -0.555556
								if( kinjun_sen > 588.2 )
									ret := -0.143478
			if( senkou_span_b > 593.238 )
				if( tenkan_sen <= 593.889 )
					if( senkou_span_b <= 599.583 )
						if( basis_minus <= -1.95 )
							if( senkou_span_b <= 594.04 )
								if( basis_max <= 0.758222 )
									ret := -1.000000 // sell
								if( basis_max > 0.758222 )
									ret := -0.538462
							if( senkou_span_b > 594.04 )
								if( basis_minus <= -2.78313 )
									ret := -0.898551 // sell
								if( basis_minus > -2.78313 )
									ret := -0.593750
						if( basis_minus > -1.95 )
							if( senkou_span_a_displaced <= 597.463 )
								if( chinkou_span <= 584.523 )
									ret := 0.352113
								if( chinkou_span > 584.523 )
									ret := -0.512048
							if( senkou_span_a_displaced > 597.463 )
								if( chinkou_span <= 587.003 )
									ret := 0.181818
								if( chinkou_span > 587.003 )
									ret := 0.764706 // buy
					if( senkou_span_b > 599.583 )
						ret := 0.846154 // buy
				if( tenkan_sen > 593.889 )
					if( senkou_span_a_displaced <= 604.038 )
						if( basis_minus <= -3.3125 )
							if( chinkou_span <= 587.273 )
								if( chinkou_span <= 586.288 )
									ret := 0.500000
								if( chinkou_span > 586.288 )
									ret := -0.666667
							if( chinkou_span > 587.273 )
								if( senkou_span_b <= 600.245 )
									ret := 0.300000
								if( senkou_span_b > 600.245 )
									ret := 1.000000 // buy
						if( basis_minus > -3.3125 )
							if( senkou_span_b <= 597.13 )
								if( tenkan_sen <= 598.45 )
									ret := -0.723214 // sell
								if( tenkan_sen > 598.45 )
									ret := 0.134328
							if( senkou_span_b > 597.13 )
								if( tenkan_sen <= 596.001 )
									ret := -1.000000 // sell
								if( tenkan_sen > 596.001 )
									ret := -0.832579 // sell
					if( senkou_span_a_displaced > 604.038 )
						if( senkou_span_b <= 614.533 )
							if( senkou_span_a <= 599.775 )
								ret := -0.500000
							if( senkou_span_a > 599.775 )
								if( basis_minus <= -1.06096 )
									ret := -0.780488 // sell
								if( basis_minus > -1.06096 )
									ret := -1.000000 // sell
						if( senkou_span_b > 614.533 )
							ret := 0.142857
		if( chinkou_span > 591.613 )
			if( senkou_span_a_displaced <= 600.424 )
				if( senkou_span_b <= 589.836 )
					if( kinjun_sen <= 593.772 )
						if( senkou_span_b <= 586.075 )
							if( chinkou_span <= 594.55 )
								if( chinkou_span <= 594.015 )
									ret := -0.106796
								if( chinkou_span > 594.015 )
									ret := -0.850000 // sell
							if( chinkou_span > 594.55 )
								if( senkou_span_b <= 585.724 )
									ret := 0.631387
								if( senkou_span_b > 585.724 )
									ret := -0.377778
						if( senkou_span_b > 586.075 )
							if( chinkou_span <= 595.208 )
								if( tenkan_sen <= 591.912 )
									ret := 0.585263
								if( tenkan_sen > 591.912 )
									ret := -0.115385
							if( chinkou_span > 595.208 )
								if( kinjun_sen <= 589.768 )
									ret := 0.686364
								if( kinjun_sen > 589.768 )
									ret := 0.920904 // buy
					if( kinjun_sen > 593.772 )
						if( senkou_span_b_displaced <= 579.091 )
							if( tenkan_sen <= 594.818 )
								ret := -0.909091 // sell
							if( tenkan_sen > 594.818 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 579.091 )
							if( chinkou_span <= 601.7 )
								if( senkou_span_a_displaced <= 586.488 )
									ret := 0.538462
								if( senkou_span_a_displaced > 586.488 )
									ret := -0.387097
							if( chinkou_span > 601.7 )
								if( tenkan_sen <= 604.311 )
									ret := 0.642857
								if( tenkan_sen > 604.311 )
									ret := 1.000000 // buy
				if( senkou_span_b > 589.836 )
					if( chinkou_span <= 598.02 )
						if( senkou_span_b <= 595.25 )
							if( basis_minus <= 2.18181 )
								if( basis_max <= 0.027415 )
									ret := 0.108538
								if( basis_max > 0.027415 )
									ret := 0.298862
							if( basis_minus > 2.18181 )
								if( tenkan_sen <= 597.558 )
									ret := -0.356223
								if( tenkan_sen > 597.558 )
									ret := 0.689655
						if( senkou_span_b > 595.25 )
							if( kinjun_sen <= 599.435 )
								if( basis_minus <= -1.95692 )
									ret := 0.337176
								if( basis_minus > -1.95692 )
									ret := -0.243972
							if( kinjun_sen > 599.435 )
								if( senkou_span_a_displaced <= 598.225 )
									ret := -0.894180 // sell
								if( senkou_span_a_displaced > 598.225 )
									ret := -0.304348
					if( chinkou_span > 598.02 )
						if( kinjun_sen <= 611.293 )
							if( chinkou_span <= 611.426 )
								if( senkou_span_a_displaced <= 586.525 )
									ret := -0.377551
								if( senkou_span_a_displaced > 586.525 )
									ret := 0.240336
							if( chinkou_span > 611.426 )
								if( senkou_span_a <= 598.862 )
									ret := 0.734177 // buy
								if( senkou_span_a > 598.862 )
									ret := 0.933884 // buy
						if( kinjun_sen > 611.293 )
							if( senkou_span_a_displaced <= 589.686 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 589.686 )
								if( tenkan_sen <= 627.803 )
									ret := -0.927536 // sell
								if( tenkan_sen > 627.803 )
									ret := -0.631579
			if( senkou_span_a_displaced > 600.424 )
				if( kinjun_sen <= 708.218 )
					if( chinkou_span <= 602.047 )
						if( senkou_span_a_displaced <= 606.275 )
							if( senkou_span_a <= 594.441 )
								if( basis_max <= 1.9048 )
									ret := 0.555556
								if( basis_max > 1.9048 )
									ret := 0.948276 // buy
							if( senkou_span_a > 594.441 )
								if( basis_minus <= -2.34978 )
									ret := 0.155235
								if( basis_minus > -2.34978 )
									ret := -0.283983
						if( senkou_span_a_displaced > 606.275 )
							if( senkou_span_a <= 600.698 )
								if( basis_max <= 2.10332 )
									ret := 0.330189
								if( basis_max > 2.10332 )
									ret := -0.615385
							if( senkou_span_a > 600.698 )
								if( senkou_span_a_displaced <= 612.586 )
									ret := -0.716495 // sell
								if( senkou_span_a_displaced > 612.586 )
									ret := -0.339806
					if( chinkou_span > 602.047 )
						if( senkou_span_a <= 605.911 )
							if( chinkou_span <= 606.009 )
								if( basis_minus <= 0.340813 )
									ret := 0.208176
								if( basis_minus > 0.340813 )
									ret := -0.138783
							if( chinkou_span > 606.009 )
								if( senkou_span_a <= 601.887 )
									ret := 0.874126 // buy
								if( senkou_span_a > 601.887 )
									ret := 0.426106
						if( senkou_span_a > 605.911 )
							if( senkou_span_a_displaced <= 706.41 )
								if( senkou_span_b_displaced <= 622.858 )
									ret := -0.133298
								if( senkou_span_b_displaced > 622.858 )
									ret := -0.000556
							if( senkou_span_a_displaced > 706.41 )
								if( senkou_span_a_displaced <= 708.419 )
									ret := 0.726562 // buy
								if( senkou_span_a_displaced > 708.419 )
									ret := 0.250000
				if( kinjun_sen > 708.218 )
					if( kinjun_sen <= 712.03 )
						if( senkou_span_a <= 708.677 )
							if( chinkou_span <= 702.26 )
								ret := -1.000000 // sell
							if( chinkou_span > 702.26 )
								if( basis_minus <= -2.60958 )
									ret := -1.000000 // sell
								if( basis_minus > -2.60958 )
									ret := -0.750000 // sell
						if( senkou_span_a > 708.677 )
							if( chinkou_span <= 704.2 )
								if( tenkan_sen <= 709.178 )
									ret := 0.000000
								if( tenkan_sen > 709.178 )
									ret := -0.684211
							if( chinkou_span > 704.2 )
								ret := 0.000000
					if( kinjun_sen > 712.03 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_5Min_2db3da10(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


