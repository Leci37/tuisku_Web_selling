//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BABA_5Min_1ICH_0e38747d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_5Min_1ICH_0e38747d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_5Min_0e38747d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_b <= 84.2052 )
		if( chinkou_span <= 83.5105 )
			if( senkou_span_a <= 83.3041 )
				if( senkou_span_a_displaced <= 67.4804 )
					if( kinjun_sen <= 67.2772 )
						if( basis_minus <= 0.00618 )
							if( chinkou_span <= 67.5402 )
								ret := 0.000000
							if( chinkou_span > 67.5402 )
								if( chinkou_span <= 67.7716 )
									ret := -1.000000 // sell
								if( chinkou_span > 67.7716 )
									ret := -0.800000 // sell
						if( basis_minus > 0.00618 )
							ret := 0.727273 // buy
					if( kinjun_sen > 67.2772 )
						if( chinkou_span <= 68.268 )
							if( basis_max <= -0.102783 )
								ret := -0.090909
							if( basis_max > -0.102783 )
								ret := 0.533333
						if( chinkou_span > 68.268 )
							if( tenkan_sen <= 67.6126 )
								if( basis_minus <= 0.076111 )
									ret := 0.932203 // buy
								if( basis_minus > 0.076111 )
									ret := 0.727273 // buy
							if( tenkan_sen > 67.6126 )
								if( tenkan_sen <= 67.7694 )
									ret := -0.416667
								if( tenkan_sen > 67.7694 )
									ret := 0.807018 // buy
				if( senkou_span_a_displaced > 67.4804 )
					if( senkou_span_b_displaced <= 83.9903 )
						if( basis_max <= 0.07752 )
							if( senkou_span_b <= 77.1511 )
								if( chinkou_span <= 76.1661 )
									ret := -0.055325
								if( chinkou_span > 76.1661 )
									ret := 0.172975
							if( senkou_span_b > 77.1511 )
								if( senkou_span_a <= 79.0424 )
									ret := 0.095790
								if( senkou_span_a > 79.0424 )
									ret := 0.010511
						if( basis_max > 0.07752 )
							if( chinkou_span <= 74.6675 )
								if( senkou_span_b_displaced <= 73.856 )
									ret := 0.067114
								if( senkou_span_b_displaced > 73.856 )
									ret := -0.184583
							if( chinkou_span > 74.6675 )
								if( tenkan_sen <= 74.9439 )
									ret := 0.591281
								if( tenkan_sen > 74.9439 )
									ret := 0.127117
					if( senkou_span_b_displaced > 83.9903 )
						if( senkou_span_a_displaced <= 83.3312 )
							if( tenkan_sen <= 82.4125 )
								ret := -0.857143 // sell
							if( tenkan_sen > 82.4125 )
								if( senkou_span_a <= 82.9463 )
									ret := 0.757576 // buy
								if( senkou_span_a > 82.9463 )
									ret := 0.000000
						if( senkou_span_a_displaced > 83.3312 )
							if( tenkan_sen <= 81.3507 )
								if( basis_max <= 0.876908 )
									ret := 0.666667
								if( basis_max > 0.876908 )
									ret := -0.500000
							if( tenkan_sen > 81.3507 )
								if( senkou_span_b <= 82.5619 )
									ret := 0.065217
								if( senkou_span_b > 82.5619 )
									ret := -0.748227 // sell
			if( senkou_span_a > 83.3041 )
				if( senkou_span_b_displaced <= 81.8607 )
					if( tenkan_sen <= 83.2561 )
						if( basis_max <= 0.547611 )
							ret := 0.800000 // buy
						if( basis_max > 0.547611 )
							ret := 1.000000 // buy
					if( tenkan_sen > 83.2561 )
						if( basis_minus <= 1.37258 )
							if( senkou_span_a_displaced <= 82.05 )
								if( senkou_span_b <= 83.3271 )
									ret := -0.764706 // sell
								if( senkou_span_b > 83.3271 )
									ret := 0.454545
							if( senkou_span_a_displaced > 82.05 )
								if( senkou_span_a_displaced <= 83.2134 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 83.2134 )
									ret := -0.333333
						if( basis_minus > 1.37258 )
							ret := 0.500000
				if( senkou_span_b_displaced > 81.8607 )
					if( senkou_span_b <= 83.6293 )
						if( chinkou_span <= 82.8515 )
							if( senkou_span_a_displaced <= 83.5706 )
								if( basis_max <= 0.008973 )
									ret := -0.782609 // sell
								if( basis_max > 0.008973 )
									ret := -0.986842 // sell
							if( senkou_span_a_displaced > 83.5706 )
								if( senkou_span_b_displaced <= 83.485 )
									ret := -0.928571 // sell
								if( senkou_span_b_displaced > 83.485 )
									ret := -0.523810
						if( chinkou_span > 82.8515 )
							if( basis_minus <= 0.511813 )
								if( basis_max <= -0.002792 )
									ret := -0.470833
								if( basis_max > -0.002792 )
									ret := 0.179577
							if( basis_minus > 0.511813 )
								if( chinkou_span <= 83.0431 )
									ret := -0.903226 // sell
								if( chinkou_span > 83.0431 )
									ret := -0.300000
					if( senkou_span_b > 83.6293 )
						if( senkou_span_b_displaced <= 84.2357 )
							if( senkou_span_b_displaced <= 83.675 )
								if( kinjun_sen <= 83.8935 )
									ret := -0.866667 // sell
								if( kinjun_sen > 83.8935 )
									ret := -0.531915
							if( senkou_span_b_displaced > 83.675 )
								if( senkou_span_a <= 84.0601 )
									ret := -0.572917
								if( senkou_span_a > 84.0601 )
									ret := 0.500000
						if( senkou_span_b_displaced > 84.2357 )
							if( basis_max <= 0.142975 )
								if( basis_minus <= 0.058125 )
									ret := 0.035294
								if( basis_minus > 0.058125 )
									ret := 0.941176 // buy
							if( basis_max > 0.142975 )
								if( kinjun_sen <= 84.1445 )
									ret := -0.861111 // sell
								if( kinjun_sen > 84.1445 )
									ret := -0.272727
		if( chinkou_span > 83.5105 )
			if( chinkou_span <= 84.4256 )
				if( senkou_span_a <= 83.3432 )
					if( basis_minus <= -0.0575 )
						if( tenkan_sen <= 83.2639 )
							if( kinjun_sen <= 83.0184 )
								if( kinjun_sen <= 82.6307 )
									ret := 0.750000 // buy
								if( kinjun_sen > 82.6307 )
									ret := 0.953125 // buy
							if( kinjun_sen > 83.0184 )
								if( tenkan_sen <= 83.1555 )
									ret := 0.500000
								if( tenkan_sen > 83.1555 )
									ret := 0.911111 // buy
						if( tenkan_sen > 83.2639 )
							if( chinkou_span <= 84.009 )
								ret := -0.461538
							if( chinkou_span > 84.009 )
								ret := 1.000000 // buy
					if( basis_minus > -0.0575 )
						if( senkou_span_a_displaced <= 83.5613 )
							if( tenkan_sen <= 82.5831 )
								if( kinjun_sen <= 81.0213 )
									ret := 0.000000
								if( kinjun_sen > 81.0213 )
									ret := 0.886792 // buy
							if( tenkan_sen > 82.5831 )
								if( senkou_span_b_displaced <= 82.6771 )
									ret := 0.372449
								if( senkou_span_b_displaced > 82.6771 )
									ret := 0.605911
						if( senkou_span_a_displaced > 83.5613 )
							ret := -0.777778 // sell
				if( senkou_span_a > 83.3432 )
					if( tenkan_sen <= 84.0026 )
						if( chinkou_span <= 83.943 )
							if( senkou_span_a <= 83.5505 )
								if( senkou_span_b <= 83.145 )
									ret := -0.777778 // sell
								if( senkou_span_b > 83.145 )
									ret := 0.486486
							if( senkou_span_a > 83.5505 )
								if( senkou_span_a_displaced <= 84.0497 )
									ret := -0.210000
								if( senkou_span_a_displaced > 84.0497 )
									ret := 0.207692
						if( chinkou_span > 83.943 )
							if( senkou_span_b_displaced <= 82.085 )
								ret := -0.857143 // sell
							if( senkou_span_b_displaced > 82.085 )
								if( senkou_span_a_displaced <= 83.1769 )
									ret := 0.024390
								if( senkou_span_a_displaced > 83.1769 )
									ret := 0.492754
					if( tenkan_sen > 84.0026 )
						if( senkou_span_b_displaced <= 84.4225 )
							if( senkou_span_a <= 83.8773 )
								ret := -0.904762 // sell
							if( senkou_span_a > 83.8773 )
								if( kinjun_sen <= 83.7863 )
									ret := 0.411765
								if( kinjun_sen > 83.7863 )
									ret := -0.271462
						if( senkou_span_b_displaced > 84.4225 )
							if( basis_max <= -0.007746 )
								ret := -0.166667
							if( basis_max > -0.007746 )
								if( tenkan_sen <= 84.0838 )
									ret := 0.909091 // buy
								if( tenkan_sen > 84.0838 )
									ret := 0.346154
			if( chinkou_span > 84.4256 )
				if( basis_minus <= 0.43549 )
					if( senkou_span_a <= 83.9704 )
						if( senkou_span_a_displaced <= 84.5217 )
							if( tenkan_sen <= 83.9805 )
								if( tenkan_sen <= 83.876 )
									ret := 0.677800
								if( tenkan_sen > 83.876 )
									ret := 0.924138 // buy
							if( tenkan_sen > 83.9805 )
								if( basis_minus <= 0.327956 )
									ret := -0.242424
								if( basis_minus > 0.327956 )
									ret := 0.428571
						if( senkou_span_a_displaced > 84.5217 )
							if( basis_minus <= -0.160708 )
								ret := -0.850000 // sell
							if( basis_minus > -0.160708 )
								ret := 0.368421
					if( senkou_span_a > 83.9704 )
						if( senkou_span_a <= 83.997 )
							if( basis_minus <= 0.034966 )
								if( basis_max <= -0.007378 )
									ret := -0.500000
								if( basis_max > -0.007378 )
									ret := -0.750000 // sell
							if( basis_minus > 0.034966 )
								ret := 0.083333
						if( senkou_span_a > 83.997 )
							if( senkou_span_b <= 84.1263 )
								if( tenkan_sen <= 84.345 )
									ret := 0.436975
								if( tenkan_sen > 84.345 )
									ret := 0.768750 // buy
							if( senkou_span_b > 84.1263 )
								if( basis_minus <= -0.060675 )
									ret := -0.464286
								if( basis_minus > -0.060675 )
									ret := 0.261044
				if( basis_minus > 0.43549 )
					if( senkou_span_a_displaced <= 81.0995 )
						ret := 0.923077 // buy
					if( senkou_span_a_displaced > 81.0995 )
						if( basis_minus <= 1.31421 )
							if( senkou_span_b_displaced <= 83.2234 )
								if( basis_minus <= 0.811375 )
									ret := -0.187500
								if( basis_minus > 0.811375 )
									ret := -0.957447 // sell
							if( senkou_span_b_displaced > 83.2234 )
								if( senkou_span_b_displaced <= 83.445 )
									ret := 0.677419
								if( senkou_span_b_displaced > 83.445 )
									ret := -0.034783
						if( basis_minus > 1.31421 )
							if( basis_minus <= 1.56025 )
								if( senkou_span_b <= 82.9011 )
									ret := 0.266667
								if( senkou_span_b > 82.9011 )
									ret := 1.000000 // buy
							if( basis_minus > 1.56025 )
								ret := -0.500000
	if( senkou_span_b > 84.2052 )
		if( basis_max <= 0.070626 )
			if( senkou_span_b <= 116.425 )
				if( senkou_span_a_displaced <= 84.3694 )
					if( senkou_span_a_displaced <= 84.2564 )
						if( kinjun_sen <= 84.4891 )
							if( senkou_span_b <= 84.2508 )
								if( senkou_span_a <= 84.2372 )
									ret := -0.530303
								if( senkou_span_a > 84.2372 )
									ret := -0.034483
							if( senkou_span_b > 84.2508 )
								if( senkou_span_a <= 84.0394 )
									ret := 0.928571 // buy
								if( senkou_span_a > 84.0394 )
									ret := 0.334884
						if( kinjun_sen > 84.4891 )
							if( senkou_span_a <= 84.8324 )
								if( basis_max <= 0.024516 )
									ret := -0.814159 // sell
								if( basis_max > 0.024516 )
									ret := -0.166667
							if( senkou_span_a > 84.8324 )
								if( basis_minus <= 0.23621 )
									ret := -0.711111 // sell
								if( basis_minus > 0.23621 )
									ret := -0.035533
					if( senkou_span_a_displaced > 84.2564 )
						if( basis_minus <= 0.255755 )
							if( senkou_span_b <= 84.2821 )
								if( basis_minus <= -0.01 )
									ret := -0.100000
								if( basis_minus > -0.01 )
									ret := 0.384615
							if( senkou_span_b > 84.2821 )
								if( basis_minus <= -0.24925 )
									ret := -0.200000
								if( basis_minus > -0.24925 )
									ret := -0.784672 // sell
						if( basis_minus > 0.255755 )
							if( senkou_span_a_displaced <= 84.3242 )
								if( tenkan_sen <= 85.0901 )
									ret := -0.869565 // sell
								if( tenkan_sen > 85.0901 )
									ret := -0.312500
							if( senkou_span_a_displaced > 84.3242 )
								if( kinjun_sen <= 84.6868 )
									ret := 0.636364
								if( kinjun_sen > 84.6868 )
									ret := -0.142857
				if( senkou_span_a_displaced > 84.3694 )
					if( chinkou_span <= 86.3704 )
						if( senkou_span_b <= 86.0113 )
							if( senkou_span_a_displaced <= 85.9708 )
								if( senkou_span_a <= 85.9557 )
									ret := -0.089019
								if( senkou_span_a > 85.9557 )
									ret := -0.420000
							if( senkou_span_a_displaced > 85.9708 )
								if( senkou_span_b_displaced <= 86.2734 )
									ret := 0.251309
								if( senkou_span_b_displaced > 86.2734 )
									ret := -0.512821
						if( senkou_span_b > 86.0113 )
							if( senkou_span_b_displaced <= 86.0728 )
								if( senkou_span_a_displaced <= 86.6333 )
									ret := -0.586207
								if( senkou_span_a_displaced > 86.6333 )
									ret := -0.962264 // sell
							if( senkou_span_b_displaced > 86.0728 )
								if( senkou_span_b <= 88.3823 )
									ret := -0.341376
								if( senkou_span_b > 88.3823 )
									ret := 0.227848
					if( chinkou_span > 86.3704 )
						if( kinjun_sen <= 86.211 )
							if( basis_max <= -0.145 )
								if( tenkan_sen <= 86.9133 )
									ret := 0.772201 // buy
								if( tenkan_sen > 86.9133 )
									ret := 0.100000
							if( basis_max > -0.145 )
								if( senkou_span_a_displaced <= 85.8023 )
									ret := 0.579946
								if( senkou_span_a_displaced > 85.8023 )
									ret := 0.203390
						if( kinjun_sen > 86.211 )
							if( senkou_span_b_displaced <= 84.3515 )
								if( tenkan_sen <= 87.021 )
									ret := 0.816327 // buy
								if( tenkan_sen > 87.021 )
									ret := -0.166667
							if( senkou_span_b_displaced > 84.3515 )
								if( senkou_span_b <= 115.097 )
									ret := -0.040984
								if( senkou_span_b > 115.097 )
									ret := 0.248945
			if( senkou_span_b > 116.425 )
				if( senkou_span_a_displaced <= 116.622 )
					if( senkou_span_a <= 117.65 )
						ret := 0.000000
					if( senkou_span_a > 117.65 )
						ret := 0.625000
				if( senkou_span_a_displaced > 116.622 )
					if( tenkan_sen <= 117.887 )
						if( senkou_span_b <= 116.737 )
							if( senkou_span_a_displaced <= 117.659 )
								if( senkou_span_a_displaced <= 116.937 )
									ret := -0.666667
								if( senkou_span_a_displaced > 116.937 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 117.659 )
								ret := -0.500000
						if( senkou_span_b > 116.737 )
							ret := 0.200000
					if( tenkan_sen > 117.887 )
						if( senkou_span_b_displaced <= 116.711 )
							ret := -0.454545
						if( senkou_span_b_displaced > 116.711 )
							ret := -1.000000 // sell
		if( basis_max > 0.070626 )
			if( chinkou_span <= 84.7856 )
				if( senkou_span_a <= 85.3752 )
					if( basis_max <= 0.388195 )
						if( basis_minus <= -0.282283 )
							if( senkou_span_b_displaced <= 85.8578 )
								if( chinkou_span <= 83.2507 )
									ret := -0.836364 // sell
								if( chinkou_span > 83.2507 )
									ret := -0.075000
							if( senkou_span_b_displaced > 85.8578 )
								if( basis_max <= 0.169881 )
									ret := -0.938144 // sell
								if( basis_max > 0.169881 )
									ret := -0.640777
						if( basis_minus > -0.282283 )
							if( kinjun_sen <= 85.2523 )
								if( senkou_span_a <= 84.3471 )
									ret := 0.358779
								if( senkou_span_a > 84.3471 )
									ret := -0.352740
							if( kinjun_sen > 85.2523 )
								if( tenkan_sen <= 85.1008 )
									ret := 1.000000 // buy
								if( tenkan_sen > 85.1008 )
									ret := 0.600000
					if( basis_max > 0.388195 )
						if( senkou_span_b <= 84.9525 )
							ret := 1.000000 // buy
						if( senkou_span_b > 84.9525 )
							if( basis_minus <= -0.976881 )
								ret := -0.363636
							if( basis_minus > -0.976881 )
								if( senkou_span_a_displaced <= 86.0834 )
									ret := 0.807692 // buy
								if( senkou_span_a_displaced > 86.0834 )
									ret := 0.144444
				if( senkou_span_a > 85.3752 )
					if( basis_minus <= -0.105179 )
						if( senkou_span_b <= 86.1158 )
							ret := -1.000000 // sell
						if( senkou_span_b > 86.1158 )
							if( senkou_span_b <= 86.406 )
								ret := -0.555556
							if( senkou_span_b > 86.406 )
								if( basis_minus <= -1.05462 )
									ret := -1.000000 // sell
								if( basis_minus > -1.05462 )
									ret := -0.684211
					if( basis_minus > -0.105179 )
						ret := -0.230769
			if( chinkou_span > 84.7856 )
				if( kinjun_sen <= 95.5253 )
					if( tenkan_sen <= 94.8175 )
						if( senkou_span_b_displaced <= 95.1987 )
							if( chinkou_span <= 88.0695 )
								if( senkou_span_a_displaced <= 87.1688 )
									ret := 0.202030
								if( senkou_span_a_displaced > 87.1688 )
									ret := -0.053750
							if( chinkou_span > 88.0695 )
								if( senkou_span_a <= 88.9635 )
									ret := 0.612836
								if( senkou_span_a > 88.9635 )
									ret := 0.147622
						if( senkou_span_b_displaced > 95.1987 )
							if( senkou_span_b_displaced <= 95.5845 )
								if( tenkan_sen <= 94.2481 )
									ret := -0.916667 // sell
								if( tenkan_sen > 94.2481 )
									ret := -0.500000
							if( senkou_span_b_displaced > 95.5845 )
								if( chinkou_span <= 95.1929 )
									ret := -0.076923
								if( chinkou_span > 95.1929 )
									ret := 0.750000 // buy
					if( tenkan_sen > 94.8175 )
						if( kinjun_sen <= 95.4216 )
							if( senkou_span_b <= 95.1787 )
								if( basis_max <= 0.079485 )
									ret := 0.529412
								if( basis_max > 0.079485 )
									ret := 0.921569 // buy
							if( senkou_span_b > 95.1787 )
								if( chinkou_span <= 94.9767 )
									ret := -0.500000
								if( chinkou_span > 94.9767 )
									ret := 0.466667
						if( kinjun_sen > 95.4216 )
							if( senkou_span_a_displaced <= 95.6502 )
								if( senkou_span_a <= 95.1983 )
									ret := 0.774194 // buy
								if( senkou_span_a > 95.1983 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 95.6502 )
								if( senkou_span_a_displaced <= 96.8558 )
									ret := 0.235294
								if( senkou_span_a_displaced > 96.8558 )
									ret := 1.000000 // buy
				if( kinjun_sen > 95.5253 )
					if( senkou_span_a <= 115.259 )
						if( senkou_span_a <= 97.0281 )
							if( tenkan_sen <= 94.8893 )
								if( senkou_span_a_displaced <= 97.084 )
									ret := 0.285714
								if( senkou_span_a_displaced > 97.084 )
									ret := 1.000000 // buy
							if( tenkan_sen > 94.8893 )
								if( senkou_span_a_displaced <= 94.7835 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 94.7835 )
									ret := -0.399050
						if( senkou_span_a > 97.0281 )
							if( senkou_span_a_displaced <= 116.484 )
								if( chinkou_span <= 109.625 )
									ret := -0.138475
								if( chinkou_span > 109.625 )
									ret := 0.245413
							if( senkou_span_a_displaced > 116.484 )
								if( senkou_span_a <= 113.966 )
									ret := 0.739726 // buy
								if( senkou_span_a > 113.966 )
									ret := 0.047619
					if( senkou_span_a > 115.259 )
						if( basis_max <= 0.125 )
							if( chinkou_span <= 114.773 )
								ret := -0.750000 // sell
							if( chinkou_span > 114.773 )
								ret := 0.363636
						if( basis_max > 0.125 )
							if( kinjun_sen <= 117.574 )
								if( senkou_span_a_displaced <= 116.725 )
									ret := -0.833333 // sell
								if( senkou_span_a_displaced > 116.725 )
									ret := 0.181818
							if( kinjun_sen > 117.574 )
								if( kinjun_sen <= 118.263 )
									ret := -0.814815 // sell
								if( kinjun_sen > 118.263 )
									ret := -0.966667 // sell
	
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
float op_operation = decision_tree_0_BABA_5Min_0e38747d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


