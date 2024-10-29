//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ADAUSDT_30Min_1ICH_43efea2d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1ICH_43efea2d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_43efea2d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b_displaced <= 0.23712 )
		if( chinkou_span <= 0.103933 )
			if( kinjun_sen <= 0.096743 )
				if( chinkou_span <= 0.091564 )
					if( tenkan_sen <= 0.081058 )
						if( chinkou_span <= 0.079665 )
							if( kinjun_sen <= 0.080935 )
								if( tenkan_sen <= 0.078699 )
									ret := 0.000000
								if( tenkan_sen > 0.078699 )
									ret := -1.000000 // sell
							if( kinjun_sen > 0.080935 )
								if( basis_max <= 0.00028 )
									ret := 0.833333 // buy
								if( basis_max > 0.00028 )
									ret := 0.000000
						if( chinkou_span > 0.079665 )
							if( senkou_span_b <= 0.078863 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.078863 )
								if( tenkan_sen <= 0.08069 )
									ret := 0.646154
								if( tenkan_sen > 0.08069 )
									ret := 0.260870
					if( tenkan_sen > 0.081058 )
						if( chinkou_span <= 0.081136 )
							if( senkou_span_a_displaced <= 0.081018 )
								ret := 0.000000
							if( senkou_span_a_displaced > 0.081018 )
								if( senkou_span_b_displaced <= 0.090093 )
									ret := -0.802817 // sell
								if( senkou_span_b_displaced > 0.090093 )
									ret := 0.000000
						if( chinkou_span > 0.081136 )
							if( kinjun_sen <= 0.092444 )
								if( basis_max <= -0.00053 )
									ret := 0.586957
								if( basis_max > -0.00053 )
									ret := -0.058824
							if( kinjun_sen > 0.092444 )
								if( basis_max <= 0.000209 )
									ret := -0.696203
								if( basis_max > 0.000209 )
									ret := -0.118421
				if( chinkou_span > 0.091564 )
					if( kinjun_sen <= 0.090462 )
						if( chinkou_span <= 0.094208 )
							if( chinkou_span <= 0.0931 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.0931 )
								if( senkou_span_b_displaced <= 0.092212 )
									ret := 0.727273 // buy
								if( senkou_span_b_displaced > 0.092212 )
									ret := 1.000000 // buy
						if( chinkou_span > 0.094208 )
							if( basis_minus <= 0.003222 )
								if( senkou_span_a <= 0.083445 )
									ret := 1.000000 // buy
								if( senkou_span_a > 0.083445 )
									ret := 0.384615
							if( basis_minus > 0.003222 )
								ret := 1.000000 // buy
					if( kinjun_sen > 0.090462 )
						if( senkou_span_b_displaced <= 0.097162 )
							if( senkou_span_b <= 0.094156 )
								if( basis_minus <= 0.000324 )
									ret := 0.325000
								if( basis_minus > 0.000324 )
									ret := 0.008523
							if( senkou_span_b > 0.094156 )
								if( senkou_span_b_displaced <= 0.096021 )
									ret := 0.563380
								if( senkou_span_b_displaced > 0.096021 )
									ret := 0.144654
						if( senkou_span_b_displaced > 0.097162 )
							if( tenkan_sen <= 0.093088 )
								if( tenkan_sen <= 0.090238 )
									ret := -0.555556
								if( tenkan_sen > 0.090238 )
									ret := 0.415094
							if( tenkan_sen > 0.093088 )
								if( senkou_span_a_displaced <= 0.096988 )
									ret := 0.142857
								if( senkou_span_a_displaced > 0.096988 )
									ret := -0.750000 // sell
			if( kinjun_sen > 0.096743 )
				if( chinkou_span <= 0.099317 )
					if( basis_minus <= -0.000156 )
						if( senkou_span_a_displaced <= 0.098596 )
							if( senkou_span_a_displaced <= 0.097142 )
								if( tenkan_sen <= 0.095936 )
									ret := -0.250000
								if( tenkan_sen > 0.095936 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.097142 )
								if( senkou_span_a_displaced <= 0.098112 )
									ret := 0.258065
								if( senkou_span_a_displaced > 0.098112 )
									ret := 0.875000 // buy
						if( senkou_span_a_displaced > 0.098596 )
							if( kinjun_sen <= 0.097373 )
								if( kinjun_sen <= 0.096979 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.096979 )
									ret := -0.809524 // sell
							if( kinjun_sen > 0.097373 )
								if( senkou_span_b_displaced <= 0.101345 )
									ret := 0.231884
								if( senkou_span_b_displaced > 0.101345 )
									ret := -0.617978
					if( basis_minus > -0.000156 )
						if( senkou_span_a_displaced <= 0.096373 )
							if( senkou_span_b <= 0.096222 )
								if( senkou_span_b <= 0.096061 )
									ret := -0.372549
								if( senkou_span_b > 0.096061 )
									ret := -1.000000 // sell
							if( senkou_span_b > 0.096222 )
								if( senkou_span_a <= 0.097447 )
									ret := 0.571429
								if( senkou_span_a > 0.097447 )
									ret := -0.230769
						if( senkou_span_a_displaced > 0.096373 )
							if( basis_max <= -0.000464 )
								if( chinkou_span <= 0.097575 )
									ret := 0.000000
								if( chinkou_span > 0.097575 )
									ret := 0.250000
							if( basis_max > -0.000464 )
								if( chinkou_span <= 0.09187 )
									ret := 0.000000
								if( chinkou_span > 0.09187 )
									ret := -0.798387 // sell
				if( chinkou_span > 0.099317 )
					if( kinjun_sen <= 0.102902 )
						if( senkou_span_b <= 0.10035 )
							if( senkou_span_b_displaced <= 0.095764 )
								ret := -0.500000
							if( senkou_span_b_displaced > 0.095764 )
								if( basis_max <= -0.0003 )
									ret := 0.468750
								if( basis_max > -0.0003 )
									ret := 0.820225 // buy
						if( senkou_span_b > 0.10035 )
							if( basis_max <= 0.000214 )
								if( kinjun_sen <= 0.10177 )
									ret := -0.633333
								if( kinjun_sen > 0.10177 )
									ret := 0.333333
							if( basis_max > 0.000214 )
								if( senkou_span_a <= 0.102387 )
									ret := 0.238095
								if( senkou_span_a > 0.102387 )
									ret := 1.000000 // buy
					if( kinjun_sen > 0.102902 )
						if( basis_minus <= -0.001128 )
							if( tenkan_sen <= 0.102915 )
								ret := 0.000000
							if( tenkan_sen > 0.102915 )
								if( tenkan_sen <= 0.10345 )
									ret := 0.857143 // buy
								if( tenkan_sen > 0.10345 )
									ret := 0.000000
						if( basis_minus > -0.001128 )
							if( senkou_span_b <= 0.108626 )
								if( basis_minus <= -0.000501 )
									ret := -0.610390
								if( basis_minus > -0.000501 )
									ret := -0.235294
							if( senkou_span_b > 0.108626 )
								ret := -1.000000 // sell
		if( chinkou_span > 0.103933 )
			if( senkou_span_a <= 0.1058 )
				if( senkou_span_b <= 0.098585 )
					if( senkou_span_a_displaced <= 0.096848 )
						if( chinkou_span <= 0.10855 )
							if( basis_minus <= 0.000526 )
								if( basis_minus <= 0.000467 )
									ret := 1.000000 // buy
								if( basis_minus > 0.000467 )
									ret := 0.200000
							if( basis_minus > 0.000526 )
								if( senkou_span_a_displaced <= 0.094285 )
									ret := 0.500000
								if( senkou_span_a_displaced > 0.094285 )
									ret := 0.946809 // buy
						if( chinkou_span > 0.10855 )
							ret := 0.285714
					if( senkou_span_a_displaced > 0.096848 )
						ret := 0.200000
				if( senkou_span_b > 0.098585 )
					if( chinkou_span <= 0.108699 )
						if( senkou_span_a_displaced <= 0.106477 )
							if( basis_max <= -0.00128 )
								ret := -0.666667
							if( basis_max > -0.00128 )
								if( chinkou_span <= 0.106616 )
									ret := 0.572464
								if( chinkou_span > 0.106616 )
									ret := 0.166667
						if( senkou_span_a_displaced > 0.106477 )
							if( basis_minus <= -0.00065 )
								if( senkou_span_b_displaced <= 0.108371 )
									ret := 0.316667
								if( senkou_span_b_displaced > 0.108371 )
									ret := -0.105263
							if( basis_minus > -0.00065 )
								if( chinkou_span <= 0.106278 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.106278 )
									ret := -0.750000 // sell
					if( chinkou_span > 0.108699 )
						if( basis_minus <= 0.003616 )
							if( chinkou_span <= 0.109851 )
								if( senkou_span_b_displaced <= 0.101815 )
									ret := 0.862069 // buy
								if( senkou_span_b_displaced > 0.101815 )
									ret := 0.200000
							if( chinkou_span > 0.109851 )
								if( senkou_span_b_displaced <= 0.101784 )
									ret := 0.888889 // buy
								if( senkou_span_b_displaced > 0.101784 )
									ret := 1.000000 // buy
						if( basis_minus > 0.003616 )
							ret := -0.285714
			if( senkou_span_a > 0.1058 )
				if( basis_minus <= -0.00363 )
					if( chinkou_span <= 0.146617 )
						if( chinkou_span <= 0.137954 )
							if( basis_max <= 0.004047 )
								if( tenkan_sen <= 0.133564 )
									ret := 0.826923 // buy
								if( tenkan_sen > 0.133564 )
									ret := 0.105263
							if( basis_max > 0.004047 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.137954 )
							if( cross_dn_tenkan_kinjunInt <= 0.5 )
								if( tenkan_sen <= 0.139923 )
									ret := -0.848485 // sell
								if( tenkan_sen > 0.139923 )
									ret := 0.250000
							if( cross_dn_tenkan_kinjunInt > 0.5 )
								ret := 1.000000 // buy
					if( chinkou_span > 0.146617 )
						if( senkou_span_a <= 0.153302 )
							if( senkou_span_b_displaced <= 0.150932 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.150932 )
								if( chinkou_span <= 0.157899 )
									ret := 0.500000
								if( chinkou_span > 0.157899 )
									ret := 0.950000 // buy
						if( senkou_span_a > 0.153302 )
							if( basis_minus <= -0.00375 )
								if( chinkou_span <= 0.157485 )
									ret := -0.142857
								if( chinkou_span > 0.157485 )
									ret := 0.727273 // buy
							if( basis_minus > -0.00375 )
								ret := -0.750000 // sell
				if( basis_minus > -0.00363 )
					if( chinkou_span <= 0.10764 )
						if( senkou_span_a <= 0.106726 )
							if( basis_minus <= 0.003525 )
								if( basis_max <= -0.000181 )
									ret := -0.240741
								if( basis_max > -0.000181 )
									ret := 0.150794
							if( basis_minus > 0.003525 )
								ret := 1.000000 // buy
						if( senkou_span_a > 0.106726 )
							if( senkou_span_a_displaced <= 0.105355 )
								if( senkou_span_a_displaced <= 0.103608 )
									ret := 0.100000
								if( senkou_span_a_displaced > 0.103608 )
									ret := -0.818182 // sell
							if( senkou_span_a_displaced > 0.105355 )
								if( senkou_span_b_displaced <= 0.106425 )
									ret := 0.089286
								if( senkou_span_b_displaced > 0.106425 )
									ret := -0.401235
					if( chinkou_span > 0.10764 )
						if( kinjun_sen <= 0.153157 )
							if( kinjun_sen <= 0.151057 )
								if( senkou_span_a_displaced <= 0.150967 )
									ret := 0.255093
								if( senkou_span_a_displaced > 0.150967 )
									ret := -0.360000
							if( kinjun_sen > 0.151057 )
								if( senkou_span_a <= 0.152414 )
									ret := 0.785714 // buy
								if( senkou_span_a > 0.152414 )
									ret := 0.228070
						if( kinjun_sen > 0.153157 )
							if( senkou_span_a_displaced <= 0.213374 )
								if( senkou_span_a_displaced <= 0.18096 )
									ret := 0.055740
								if( senkou_span_a_displaced > 0.18096 )
									ret := -0.336898
							if( senkou_span_a_displaced > 0.213374 )
								if( basis_minus <= 0.010588 )
									ret := 0.456140
								if( basis_minus > 0.010588 )
									ret := 0.881356 // buy
	if( senkou_span_b_displaced > 0.23712 )
		if( basis_minus <= -0.015004 )
			if( tenkan_sen <= 1.4723 )
				if( chinkou_span <= 1.4782 )
					if( tenkan_sen <= 0.465773 )
						if( basis_max <= 0.002439 )
							if( kinjun_sen <= 0.3736 )
								if( kinjun_sen <= 0.318797 )
									ret := 0.750000 // buy
								if( kinjun_sen > 0.318797 )
									ret := -0.552632
							if( kinjun_sen > 0.3736 )
								if( basis_minus <= -0.01855 )
									ret := 0.038462
								if( basis_minus > -0.01855 )
									ret := 0.702128 // buy
						if( basis_max > 0.002439 )
							if( senkou_span_b <= 0.271888 )
								if( chinkou_span <= 0.300095 )
									ret := 0.909091 // buy
								if( chinkou_span > 0.300095 )
									ret := -1.000000 // sell
							if( senkou_span_b > 0.271888 )
								if( basis_max <= 0.011162 )
									ret := 0.760000 // buy
								if( basis_max > 0.011162 )
									ret := 0.511628
					if( tenkan_sen > 0.465773 )
						if( chinkou_span <= 1.24477 )
							if( senkou_span_a_displaced <= 1.26451 )
								if( chinkou_span <= 1.12504 )
									ret := 0.078446
								if( chinkou_span > 1.12504 )
									ret := 0.312581
							if( senkou_span_a_displaced > 1.26451 )
								if( kinjun_sen <= 1.35434 )
									ret := -0.308943
								if( kinjun_sen > 1.35434 )
									ret := -0.930233 // sell
						if( chinkou_span > 1.24477 )
							if( tenkan_sen <= 1.40722 )
								if( senkou_span_a <= 1.22073 )
									ret := 0.700680 // buy
								if( senkou_span_a > 1.22073 )
									ret := 0.264555
							if( tenkan_sen > 1.40722 )
								if( senkou_span_a_displaced <= 1.52266 )
									ret := -0.195804
								if( senkou_span_a_displaced > 1.52266 )
									ret := 0.718310 // buy
				if( chinkou_span > 1.4782 )
					if( basis_max <= 0.015775 )
						if( senkou_span_a_displaced <= 1.61156 )
							if( senkou_span_b <= 1.44503 )
								if( basis_max <= 0.003375 )
									ret := 0.812500 // buy
								if( basis_max > 0.003375 )
									ret := 0.250000
							if( senkou_span_b > 1.44503 )
								if( basis_max <= -0.002688 )
									ret := 0.500000
								if( basis_max > -0.002688 )
									ret := 0.990099 // buy
						if( senkou_span_a_displaced > 1.61156 )
							ret := -0.500000
					if( basis_max > 0.015775 )
						if( basis_minus <= -0.043202 )
							if( basis_max <= 0.038816 )
								if( basis_minus <= -0.092961 )
									ret := -0.666667
								if( basis_minus > -0.092961 )
									ret := 0.789474 // buy
							if( basis_max > 0.038816 )
								if( senkou_span_a_displaced <= 1.74116 )
									ret := 0.916667 // buy
								if( senkou_span_a_displaced > 1.74116 )
									ret := 1.000000 // buy
						if( basis_minus > -0.043202 )
							if( chinkou_span <= 1.57833 )
								ret := -1.000000 // sell
							if( chinkou_span > 1.57833 )
								ret := -0.500000
			if( tenkan_sen > 1.4723 )
				if( senkou_span_a_displaced <= 1.54349 )
					if( chinkou_span <= 1.48153 )
						if( senkou_span_b_displaced <= 1.51618 )
							ret := 0.000000
						if( senkou_span_b_displaced > 1.51618 )
							if( senkou_span_b <= 1.56386 )
								if( senkou_span_b_displaced <= 1.52526 )
									ret := -0.700000 // sell
								if( senkou_span_b_displaced > 1.52526 )
									ret := -0.950820 // sell
							if( senkou_span_b > 1.56386 )
								ret := -0.142857
					if( chinkou_span > 1.48153 )
						if( kinjun_sen <= 1.50449 )
							if( senkou_span_a <= 1.4961 )
								ret := 1.000000 // buy
							if( senkou_span_a > 1.4961 )
								if( senkou_span_a_displaced <= 1.53304 )
									ret := -0.800000 // sell
								if( senkou_span_a_displaced > 1.53304 )
									ret := 0.555556
						if( kinjun_sen > 1.50449 )
							ret := -1.000000 // sell
				if( senkou_span_a_displaced > 1.54349 )
					if( chinkou_span <= 1.48326 )
						if( tenkan_sen <= 1.52096 )
							if( kinjun_sen <= 1.52625 )
								if( senkou_span_b_displaced <= 1.68551 )
									ret := 0.640000
								if( senkou_span_b_displaced > 1.68551 )
									ret := -0.750000 // sell
							if( kinjun_sen > 1.52625 )
								if( senkou_span_b_displaced <= 1.5769 )
									ret := 0.250000
								if( senkou_span_b_displaced > 1.5769 )
									ret := -0.750000 // sell
						if( tenkan_sen > 1.52096 )
							if( senkou_span_a <= 1.58236 )
								if( chinkou_span <= 1.42284 )
									ret := -0.793103 // sell
								if( chinkou_span > 1.42284 )
									ret := 0.375000
							if( senkou_span_a > 1.58236 )
								if( chinkou_span <= 1.36384 )
									ret := -0.333333
								if( chinkou_span > 1.36384 )
									ret := -0.958904 // sell
					if( chinkou_span > 1.48326 )
						if( senkou_span_b <= 2.15238 )
							if( chinkou_span <= 1.6198 )
								if( tenkan_sen <= 1.6178 )
									ret := 0.069536
								if( tenkan_sen > 1.6178 )
									ret := -0.834951 // sell
							if( chinkou_span > 1.6198 )
								if( senkou_span_a_displaced <= 1.76232 )
									ret := 0.473186
								if( senkou_span_a_displaced > 1.76232 )
									ret := 0.086154
						if( senkou_span_b > 2.15238 )
							if( chinkou_span <= 2.14464 )
								if( basis_minus <= -0.073813 )
									ret := 0.195122
								if( basis_minus > -0.073813 )
									ret := -0.698630
							if( chinkou_span > 2.14464 )
								if( senkou_span_a_displaced <= 2.827 )
									ret := 0.075377
								if( senkou_span_a_displaced > 2.827 )
									ret := -0.250883
		if( basis_minus > -0.015004 )
			if( senkou_span_a_displaced <= 0.493337 )
				if( chinkou_span <= 0.477957 )
					if( kinjun_sen <= 0.462489 )
						if( basis_max <= 0.002075 )
							if( chinkou_span <= 0.449203 )
								if( tenkan_sen <= 0.449425 )
									ret := 0.031806
								if( tenkan_sen > 0.449425 )
									ret := -0.351351
							if( chinkou_span > 0.449203 )
								if( tenkan_sen <= 0.453325 )
									ret := 0.409966
								if( tenkan_sen > 0.453325 )
									ret := 0.025078
						if( basis_max > 0.002075 )
							if( chinkou_span <= 0.276886 )
								if( senkou_span_b_displaced <= 0.303456 )
									ret := 0.083333
								if( senkou_span_b_displaced > 0.303456 )
									ret := -0.876289 // sell
							if( chinkou_span > 0.276886 )
								if( basis_minus <= 0.015375 )
									ret := 0.188710
								if( basis_minus > 0.015375 )
									ret := -0.729167 // sell
					if( kinjun_sen > 0.462489 )
						if( basis_max <= 0.004913 )
							if( kinjun_sen <= 0.472953 )
								if( senkou_span_a <= 0.466452 )
									ret := -0.361386
								if( senkou_span_a > 0.466452 )
									ret := -0.074653
							if( kinjun_sen > 0.472953 )
								if( basis_minus <= 0.004548 )
									ret := -0.340426
								if( basis_minus > 0.004548 )
									ret := -0.770115 // sell
						if( basis_max > 0.004913 )
							if( chinkou_span <= 0.448701 )
								ret := -0.600000
							if( chinkou_span > 0.448701 )
								if( basis_minus <= -0.006259 )
									ret := 0.880000 // buy
								if( basis_minus > -0.006259 )
									ret := 0.351351
				if( chinkou_span > 0.477957 )
					if( basis_max <= -0.002417 )
						if( basis_max <= -0.013257 )
							if( basis_max <= -0.019737 )
								if( basis_minus <= 0.03565 )
									ret := 0.750000 // buy
								if( basis_minus > 0.03565 )
									ret := 0.250000
							if( basis_max > -0.019737 )
								if( senkou_span_b <= 0.48496 )
									ret := -0.875000 // sell
								if( senkou_span_b > 0.48496 )
									ret := -0.611111
						if( basis_max > -0.013257 )
							if( chinkou_span <= 0.502246 )
								if( basis_minus <= 0.01325 )
									ret := -0.006803
								if( basis_minus > 0.01325 )
									ret := -0.714286 // sell
							if( chinkou_span > 0.502246 )
								if( basis_max <= -0.008492 )
									ret := -0.010101
								if( basis_max > -0.008492 )
									ret := 0.550000
					if( basis_max > -0.002417 )
						if( tenkan_sen <= 0.499136 )
							if( senkou_span_b_displaced <= 0.45403 )
								if( basis_minus <= 0.011012 )
									ret := 0.872146 // buy
								if( basis_minus > 0.011012 )
									ret := 0.250000
							if( senkou_span_b_displaced > 0.45403 )
								if( chinkou_span <= 0.51742 )
									ret := 0.391304
								if( chinkou_span > 0.51742 )
									ret := 0.796703 // buy
						if( tenkan_sen > 0.499136 )
							if( senkou_span_b_displaced <= 0.476234 )
								if( basis_minus <= 0.034312 )
									ret := 0.555556
								if( basis_minus > 0.034312 )
									ret := -0.250000
							if( senkou_span_b_displaced > 0.476234 )
								if( senkou_span_b <= 0.498644 )
									ret := -0.376623
								if( senkou_span_b > 0.498644 )
									ret := 0.705882 // buy
			if( senkou_span_a_displaced > 0.493337 )
				if( tenkan_sen <= 0.527328 )
					if( chinkou_span <= 0.504966 )
						if( basis_minus <= -0.00572 )
							if( senkou_span_b <= 0.486476 )
								if( kinjun_sen <= 0.457898 )
									ret := 1.000000 // buy
								if( kinjun_sen > 0.457898 )
									ret := 0.131579
							if( senkou_span_b > 0.486476 )
								if( chinkou_span <= 0.483525 )
									ret := -0.363636
								if( chinkou_span > 0.483525 )
									ret := 0.163121
						if( basis_minus > -0.00572 )
							if( tenkan_sen <= 0.487452 )
								if( tenkan_sen <= 0.485575 )
									ret := -0.288136
								if( tenkan_sen > 0.485575 )
									ret := 0.666667
							if( tenkan_sen > 0.487452 )
								if( chinkou_span <= 0.495155 )
									ret := -0.632727
								if( chinkou_span > 0.495155 )
									ret := -0.373656
					if( chinkou_span > 0.504966 )
						if( senkou_span_b <= 0.50501 )
							if( senkou_span_a <= 0.491664 )
								if( tenkan_sen <= 0.47845 )
									ret := 0.000000
								if( tenkan_sen > 0.47845 )
									ret := 0.844444 // buy
							if( senkou_span_a > 0.491664 )
								if( senkou_span_b <= 0.504558 )
									ret := 0.307393
								if( senkou_span_b > 0.504558 )
									ret := 0.882353 // buy
						if( senkou_span_b > 0.50501 )
							if( chinkou_span <= 0.521409 )
								if( tenkan_sen <= 0.504325 )
									ret := -0.771930 // sell
								if( tenkan_sen > 0.504325 )
									ret := -0.095070
							if( chinkou_span > 0.521409 )
								if( tenkan_sen <= 0.522731 )
									ret := 0.566210
								if( tenkan_sen > 0.522731 )
									ret := -0.029126
				if( tenkan_sen > 0.527328 )
					if( chinkou_span <= 0.51785 )
						if( senkou_span_a_displaced <= 0.558887 )
							if( basis_max <= 0.000998 )
								if( basis_minus <= 0.019562 )
									ret := -0.576000
								if( basis_minus > 0.019562 )
									ret := 0.200000
							if( basis_max > 0.000998 )
								if( tenkan_sen <= 0.52895 )
									ret := -1.000000 // sell
								if( tenkan_sen > 0.52895 )
									ret := 0.018868
						if( senkou_span_a_displaced > 0.558887 )
							if( basis_max <= 0.007597 )
								if( tenkan_sen <= 0.584627 )
									ret := -0.927711 // sell
								if( tenkan_sen > 0.584627 )
									ret := 0.000000
							if( basis_max > 0.007597 )
								if( tenkan_sen <= 0.55934 )
									ret := -0.571429
								if( tenkan_sen > 0.55934 )
									ret := 0.800000 // buy
					if( chinkou_span > 0.51785 )
						if( kinjun_sen <= 0.566143 )
							if( senkou_span_b_displaced <= 0.520441 )
								if( basis_max <= -0.00392 )
									ret := 0.746914 // buy
								if( basis_max > -0.00392 )
									ret := 0.371681
							if( senkou_span_b_displaced > 0.520441 )
								if( senkou_span_b <= 0.564725 )
									ret := 0.075806
								if( senkou_span_b > 0.564725 )
									ret := 0.433071
						if( kinjun_sen > 0.566143 )
							if( chinkou_span <= 0.582997 )
								if( tenkan_sen <= 0.594727 )
									ret := -0.265416
								if( tenkan_sen > 0.594727 )
									ret := -0.715210 // sell
							if( chinkou_span > 0.582997 )
								if( tenkan_sen <= 0.604951 )
									ret := 0.269619
								if( tenkan_sen > 0.604951 )
									ret := 0.025940
	
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
float op_operation = decision_tree_0_ADAUSDT_30Min_43efea2d(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


