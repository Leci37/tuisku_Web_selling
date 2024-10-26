//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TRXUSDT_30Min_1ICH_9fe98696 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1ICH_9fe98696", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_9fe98696(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( kinjun_sen <= 0.060529 )
		if( chinkou_span <= 0.06117 )
			if( basis_max <= 0.000136 )
				if( chinkou_span <= 0.02797 )
					if( tenkan_sen <= 0.026995 )
						if( chinkou_span <= 0.026663 )
							if( kinjun_sen <= 0.026069 )
								if( basis_max <= -3e-05 )
									ret := -0.063830
								if( basis_max > -3e-05 )
									ret := 0.192737
							if( kinjun_sen > 0.026069 )
								if( basis_minus <= 0.000522 )
									ret := -0.253030
								if( basis_minus > 0.000522 )
									ret := -1.000000 // sell
						if( chinkou_span > 0.026663 )
							if( senkou_span_a <= 0.026017 )
								if( senkou_span_b_displaced <= 0.026009 )
									ret := 0.828125 // buy
								if( senkou_span_b_displaced > 0.026009 )
									ret := 0.960000 // buy
							if( senkou_span_a > 0.026017 )
								if( senkou_span_a_displaced <= 0.026509 )
									ret := -0.326241
								if( senkou_span_a_displaced > 0.026509 )
									ret := 0.350980
					if( tenkan_sen > 0.026995 )
						if( senkou_span_b_displaced <= 0.02532 )
							if( senkou_span_a_displaced <= 0.02548 )
								ret := -0.714286 // sell
							if( senkou_span_a_displaced > 0.02548 )
								ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.02532 )
							if( basis_minus <= -0.001109 )
								if( senkou_span_b_displaced <= 0.028487 )
									ret := -0.500000
								if( senkou_span_b_displaced > 0.028487 )
									ret := 1.000000 // buy
							if( basis_minus > -0.001109 )
								if( basis_max <= -9e-05 )
									ret := -0.725714 // sell
								if( basis_max > -9e-05 )
									ret := -0.465969
				if( chinkou_span > 0.02797 )
					if( senkou_span_a <= 0.028807 )
						if( senkou_span_a <= 0.027767 )
							if( basis_minus <= 0.001133 )
								if( basis_max <= 0.000117 )
									ret := 0.795213 // buy
								if( basis_max > 0.000117 )
									ret := 0.142857
							if( basis_minus > 0.001133 )
								if( chinkou_span <= 0.028582 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.028582 )
									ret := -0.250000
						if( senkou_span_a > 0.027767 )
							if( chinkou_span <= 0.028483 )
								if( kinjun_sen <= 0.028218 )
									ret := 0.076923
								if( kinjun_sen > 0.028218 )
									ret := -0.602564
							if( chinkou_span > 0.028483 )
								if( kinjun_sen <= 0.028301 )
									ret := 0.357143
								if( kinjun_sen > 0.028301 )
									ret := 0.685294
					if( senkou_span_a > 0.028807 )
						if( senkou_span_a <= 0.060842 )
							if( chinkou_span <= 0.03006 )
								if( senkou_span_b <= 0.031172 )
									ret := -0.185111
								if( senkou_span_b > 0.031172 )
									ret := -0.820755 // sell
							if( chinkou_span > 0.03006 )
								if( tenkan_sen <= 0.030162 )
									ret := 0.514085
								if( tenkan_sen > 0.030162 )
									ret := 0.080057
						if( senkou_span_a > 0.060842 )
							if( basis_max <= -0.000533 )
								if( senkou_span_b_displaced <= 0.053653 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 0.053653 )
									ret := -0.972222 // sell
							if( basis_max > -0.000533 )
								ret := -0.428571
			if( basis_max > 0.000136 )
				if( tenkan_sen <= 0.058903 )
					if( tenkan_sen <= 0.025714 )
						if( chinkou_span <= 0.023963 )
							if( chinkou_span <= 0.0236 )
								if( tenkan_sen <= 0.024602 )
									ret := 0.250000
								if( tenkan_sen > 0.024602 )
									ret := 0.000000
							if( chinkou_span > 0.0236 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.023963 )
							if( chinkou_span <= 0.02569 )
								if( senkou_span_b_displaced <= 0.025619 )
									ret := 0.862069 // buy
								if( senkou_span_b_displaced > 0.025619 )
									ret := 0.519608
							if( chinkou_span > 0.02569 )
								if( senkou_span_a_displaced <= 0.025498 )
									ret := 0.200000
								if( senkou_span_a_displaced > 0.025498 )
									ret := 0.918919 // buy
					if( tenkan_sen > 0.025714 )
						if( chinkou_span <= 0.057455 )
							if( tenkan_sen <= 0.057722 )
								if( chinkou_span <= 0.029333 )
									ret := -0.001093
								if( chinkou_span > 0.029333 )
									ret := 0.243298
							if( tenkan_sen > 0.057722 )
								if( kinjun_sen <= 0.058238 )
									ret := 0.000000
								if( kinjun_sen > 0.058238 )
									ret := -0.833333 // sell
						if( chinkou_span > 0.057455 )
							if( basis_minus <= -0.000585 )
								if( tenkan_sen <= 0.053413 )
									ret := -0.125000
								if( tenkan_sen > 0.053413 )
									ret := 0.764368 // buy
							if( basis_minus > -0.000585 )
								if( senkou_span_a_displaced <= 0.059695 )
									ret := 0.714286 // buy
								if( senkou_span_a_displaced > 0.059695 )
									ret := -0.043478
				if( tenkan_sen > 0.058903 )
					if( senkou_span_b <= 0.060193 )
						if( tenkan_sen <= 0.059742 )
							if( chinkou_span <= 0.059429 )
								if( senkou_span_b_displaced <= 0.0595 )
									ret := -0.407407
								if( senkou_span_b_displaced > 0.0595 )
									ret := -0.805195 // sell
							if( chinkou_span > 0.059429 )
								if( senkou_span_a_displaced <= 0.059263 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.059263 )
									ret := -0.193548
						if( tenkan_sen > 0.059742 )
							if( senkou_span_b <= 0.059523 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.059523 )
								ret := 0.250000
					if( senkou_span_b > 0.060193 )
						if( kinjun_sen <= 0.060056 )
							if( kinjun_sen <= 0.059958 )
								if( senkou_span_a_displaced <= 0.064031 )
									ret := 0.785714 // buy
								if( senkou_span_a_displaced > 0.064031 )
									ret := -1.000000 // sell
							if( kinjun_sen > 0.059958 )
								if( senkou_span_a_displaced <= 0.061618 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.061618 )
									ret := 0.600000
						if( kinjun_sen > 0.060056 )
							if( senkou_span_b_displaced <= 0.059864 )
								if( basis_max <= 0.000262 )
									ret := 0.000000
								if( basis_max > 0.000262 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.059864 )
								if( senkou_span_b_displaced <= 0.060527 )
									ret := 0.384615
								if( senkou_span_b_displaced > 0.060527 )
									ret := -0.277778
		if( chinkou_span > 0.06117 )
			if( senkou_span_a_displaced <= 0.05311 )
				if( basis_max <= -0.000184 )
					ret := -1.000000 // sell
				if( basis_max > -0.000184 )
					ret := -0.500000
			if( senkou_span_a_displaced > 0.05311 )
				if( tenkan_sen <= 0.060104 )
					if( basis_minus <= 0.001561 )
						if( basis_minus <= 0.001083 )
							if( tenkan_sen <= 0.057031 )
								if( senkou_span_b <= 0.053918 )
									ret := 0.769231 // buy
								if( senkou_span_b > 0.053918 )
									ret := 0.950495 // buy
							if( tenkan_sen > 0.057031 )
								if( kinjun_sen <= 0.057115 )
									ret := -0.833333 // sell
								if( kinjun_sen > 0.057115 )
									ret := 0.808664 // buy
						if( basis_minus > 0.001083 )
							if( basis_minus <= 0.001263 )
								ret := -0.500000
							if( basis_minus > 0.001263 )
								if( basis_minus <= 0.001478 )
									ret := 0.521739
								if( basis_minus > 0.001478 )
									ret := 0.857143 // buy
					if( basis_minus > 0.001561 )
						if( basis_max <= -0.000106 )
							if( senkou_span_a_displaced <= 0.054044 )
								if( senkou_span_b <= 0.055774 )
									ret := 1.000000 // buy
								if( senkou_span_b > 0.055774 )
									ret := 0.750000 // buy
							if( senkou_span_a_displaced > 0.054044 )
								ret := 1.000000 // buy
						if( basis_max > -0.000106 )
							ret := 0.750000 // buy
				if( tenkan_sen > 0.060104 )
					if( senkou_span_b <= 0.059591 )
						if( kinjun_sen <= 0.059507 )
							if( senkou_span_a_displaced <= 0.058219 )
								if( chinkou_span <= 0.061934 )
									ret := 1.000000 // buy
								if( chinkou_span > 0.061934 )
									ret := 0.750000 // buy
							if( senkou_span_a_displaced > 0.058219 )
								ret := 0.250000
						if( kinjun_sen > 0.059507 )
							if( senkou_span_a <= 0.061224 )
								if( senkou_span_a <= 0.060487 )
									ret := 0.135135
								if( senkou_span_a > 0.060487 )
									ret := -1.000000 // sell
							if( senkou_span_a > 0.061224 )
								ret := 1.000000 // buy
					if( senkou_span_b > 0.059591 )
						if( basis_minus <= -0.000686 )
							if( basis_max <= -0.000167 )
								ret := 1.000000 // buy
							if( basis_max > -0.000167 )
								if( tenkan_sen <= 0.060385 )
									ret := 0.916667 // buy
								if( tenkan_sen > 0.060385 )
									ret := 0.571429
						if( basis_minus > -0.000686 )
							if( tenkan_sen <= 0.060194 )
								if( basis_max <= 6.1e-05 )
									ret := 1.000000 // buy
								if( basis_max > 6.1e-05 )
									ret := 0.818182 // buy
							if( tenkan_sen > 0.060194 )
								if( chinkou_span <= 0.062601 )
									ret := 0.437500
								if( chinkou_span > 0.062601 )
									ret := 0.835821 // buy
	if( kinjun_sen > 0.060529 )
		if( basis_minus <= -0.001834 )
			if( senkou_span_b_displaced <= 0.069635 )
				if( kinjun_sen <= 0.060976 )
					if( basis_max <= 0.000406 )
						if( senkou_span_b_displaced <= 0.069001 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.069001 )
							ret := 0.750000 // buy
					if( basis_max > 0.000406 )
						ret := 0.250000
				if( kinjun_sen > 0.060976 )
					if( senkou_span_b <= 0.064266 )
						if( basis_minus <= -0.002802 )
							ret := 0.200000
						if( basis_minus > -0.002802 )
							if( senkou_span_b <= 0.063472 )
								if( chinkou_span <= 0.05513 )
									ret := 0.400000
								if( chinkou_span > 0.05513 )
									ret := -0.793103 // sell
							if( senkou_span_b > 0.063472 )
								if( senkou_span_b_displaced <= 0.064387 )
									ret := -0.500000
								if( senkou_span_b_displaced > 0.064387 )
									ret := -1.000000 // sell
					if( senkou_span_b > 0.064266 )
						if( senkou_span_a_displaced <= 0.06377 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.06377 )
							if( chinkou_span <= 0.063714 )
								if( senkou_span_b_displaced <= 0.066257 )
									ret := 0.142857
								if( senkou_span_b_displaced > 0.066257 )
									ret := -0.589286
							if( chinkou_span > 0.063714 )
								if( basis_max <= -5.5e-05 )
									ret := -1.000000 // sell
								if( basis_max > -5.5e-05 )
									ret := 0.375000
			if( senkou_span_b_displaced > 0.069635 )
				if( senkou_span_b_displaced <= 0.096993 )
					if( chinkou_span <= 0.07972 )
						if( senkou_span_a_displaced <= 0.083963 )
							if( basis_max <= -0.000146 )
								if( chinkou_span <= 0.075778 )
									ret := -0.442623
								if( chinkou_span > 0.075778 )
									ret := 0.666667
							if( basis_max > -0.000146 )
								if( basis_minus <= -0.004489 )
									ret := 0.964286 // buy
								if( basis_minus > -0.004489 )
									ret := 0.395038
						if( senkou_span_a_displaced > 0.083963 )
							if( kinjun_sen <= 0.080625 )
								if( senkou_span_b_displaced <= 0.082157 )
									ret := 0.500000
								if( senkou_span_b_displaced > 0.082157 )
									ret := -0.906977 // sell
							if( kinjun_sen > 0.080625 )
								if( senkou_span_b <= 0.084581 )
									ret := 0.523810
								if( senkou_span_b > 0.084581 )
									ret := -1.000000 // sell
					if( chinkou_span > 0.07972 )
						if( kinjun_sen <= 0.083378 )
							if( chinkou_span <= 0.08135 )
								if( senkou_span_b <= 0.08197 )
									ret := 0.706897 // buy
								if( senkou_span_b > 0.08197 )
									ret := -0.153846
							if( chinkou_span > 0.08135 )
								if( basis_max <= 0.001911 )
									ret := 0.950820 // buy
								if( basis_max > 0.001911 )
									ret := 0.000000
						if( kinjun_sen > 0.083378 )
							if( chinkou_span <= 0.08539 )
								if( senkou_span_a <= 0.083388 )
									ret := 0.727273 // buy
								if( senkou_span_a > 0.083388 )
									ret := -0.109091
							if( chinkou_span > 0.08539 )
								if( basis_minus <= -0.004114 )
									ret := -1.000000 // sell
								if( basis_minus > -0.004114 )
									ret := 0.633962
				if( senkou_span_b_displaced > 0.096993 )
					if( basis_minus <= -0.005329 )
						if( senkou_span_a <= 0.138306 )
							if( senkou_span_b <= 0.090405 )
								if( tenkan_sen <= 0.082257 )
									ret := 0.148148
								if( tenkan_sen > 0.082257 )
									ret := -0.931034 // sell
							if( senkou_span_b > 0.090405 )
								if( chinkou_span <= 0.11659 )
									ret := 0.365591
								if( chinkou_span > 0.11659 )
									ret := 0.681159
						if( senkou_span_a > 0.138306 )
							if( tenkan_sen <= 0.137729 )
								if( senkou_span_a_displaced <= 0.161492 )
									ret := -0.939394 // sell
								if( senkou_span_a_displaced > 0.161492 )
									ret := 0.500000
							if( tenkan_sen > 0.137729 )
								if( senkou_span_a_displaced <= 0.162582 )
									ret := 0.485294
								if( senkou_span_a_displaced > 0.162582 )
									ret := -0.432432
					if( basis_minus > -0.005329 )
						if( chinkou_span <= 0.134868 )
							if( basis_max <= 0.002226 )
								if( senkou_span_a_displaced <= 0.142944 )
									ret := -0.010383
								if( senkou_span_a_displaced > 0.142944 )
									ret := -0.833333 // sell
							if( basis_max > 0.002226 )
								if( kinjun_sen <= 0.090065 )
									ret := 0.666667
								if( kinjun_sen > 0.090065 )
									ret := -0.679104
						if( chinkou_span > 0.134868 )
							if( kinjun_sen <= 0.155675 )
								if( tenkan_sen <= 0.150395 )
									ret := 0.327044
								if( tenkan_sen > 0.150395 )
									ret := 0.953488 // buy
							if( kinjun_sen > 0.155675 )
								if( senkou_span_b_displaced <= 0.1574 )
									ret := -0.913043 // sell
								if( senkou_span_b_displaced > 0.1574 )
									ret := 0.170732
		if( basis_minus > -0.001834 )
			if( chinkou_span <= 0.061075 )
				if( kinjun_sen <= 0.063085 )
					if( senkou_span_b <= 0.061887 )
						if( senkou_span_b <= 0.05984 )
							if( senkou_span_a_displaced <= 0.056849 )
								ret := -0.857143 // sell
							if( senkou_span_a_displaced > 0.056849 )
								if( senkou_span_b_displaced <= 0.059245 )
									ret := 0.857143 // buy
								if( senkou_span_b_displaced > 0.059245 )
									ret := 0.000000
						if( senkou_span_b > 0.05984 )
							if( senkou_span_b_displaced <= 0.060472 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := -0.569892
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := 0.454545
							if( senkou_span_b_displaced > 0.060472 )
								if( senkou_span_a_displaced <= 0.060963 )
									ret := 0.242236
								if( senkou_span_a_displaced > 0.060963 )
									ret := -0.172249
					if( senkou_span_b > 0.061887 )
						if( senkou_span_a_displaced <= 0.065198 )
							if( basis_max <= -6.6e-05 )
								if( basis_minus <= 0.000652 )
									ret := -0.955882 // sell
								if( basis_minus > 0.000652 )
									ret := 0.000000
							if( basis_max > -6.6e-05 )
								if( senkou_span_a <= 0.062275 )
									ret := -0.604255
								if( senkou_span_a > 0.062275 )
									ret := -0.285714
						if( senkou_span_a_displaced > 0.065198 )
							if( kinjun_sen <= 0.062755 )
								if( senkou_span_b_displaced <= 0.066121 )
									ret := 0.000000
								if( senkou_span_b_displaced > 0.066121 )
									ret := 1.000000 // buy
							if( kinjun_sen > 0.062755 )
								if( basis_max <= 0.000599 )
									ret := -0.750000 // sell
								if( basis_max > 0.000599 )
									ret := 0.166667
				if( kinjun_sen > 0.063085 )
					if( basis_max <= -6.7e-05 )
						if( basis_max <= -0.000213 )
							if( senkou_span_b_displaced <= 0.068363 )
								if( tenkan_sen <= 0.064501 )
									ret := -0.833333 // sell
								if( tenkan_sen > 0.064501 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.068363 )
								ret := -0.250000
						if( basis_max > -0.000213 )
							if( senkou_span_a_displaced <= 0.065434 )
								if( senkou_span_b <= 0.063265 )
									ret := -0.111111
								if( senkou_span_b > 0.063265 )
									ret := -0.750000 // sell
							if( senkou_span_a_displaced > 0.065434 )
								if( kinjun_sen <= 0.06713 )
									ret := 0.350000
								if( kinjun_sen > 0.06713 )
									ret := -1.000000 // sell
					if( basis_max > -6.7e-05 )
						if( senkou_span_a <= 0.062793 )
							ret := 0.000000
						if( senkou_span_a > 0.062793 )
							if( basis_minus <= -0.001512 )
								ret := -0.400000
							if( basis_minus > -0.001512 )
								if( senkou_span_b_displaced <= 0.080345 )
									ret := -0.904412 // sell
								if( senkou_span_b_displaced > 0.080345 )
									ret := -0.500000
			if( chinkou_span > 0.061075 )
				if( senkou_span_a <= 0.065236 )
					if( senkou_span_a_displaced <= 0.066216 )
						if( chinkou_span <= 0.064762 )
							if( kinjun_sen <= 0.064248 )
								if( chinkou_span <= 0.062588 )
									ret := -0.037814
								if( chinkou_span > 0.062588 )
									ret := 0.154609
							if( kinjun_sen > 0.064248 )
								if( chinkou_span <= 0.063485 )
									ret := -0.582555
								if( chinkou_span > 0.063485 )
									ret := -0.154426
						if( chinkou_span > 0.064762 )
							if( senkou_span_b <= 0.065731 )
								if( senkou_span_a_displaced <= 0.056569 )
									ret := -0.652174
								if( senkou_span_a_displaced > 0.056569 )
									ret := 0.455272
							if( senkou_span_b > 0.065731 )
								if( tenkan_sen <= 0.064667 )
									ret := 0.750000 // buy
								if( tenkan_sen > 0.064667 )
									ret := -0.791667 // sell
					if( senkou_span_a_displaced > 0.066216 )
						if( kinjun_sen <= 0.062187 )
							if( basis_minus <= -0.000977 )
								ret := -1.000000 // sell
							if( basis_minus > -0.000977 )
								ret := -0.250000
						if( kinjun_sen > 0.062187 )
							if( senkou_span_b_displaced <= 0.068279 )
								if( basis_minus <= -0.001221 )
									ret := 0.923913 // buy
								if( basis_minus > -0.001221 )
									ret := 0.511111
							if( senkou_span_b_displaced > 0.068279 )
								if( chinkou_span <= 0.064185 )
									ret := 0.473684
								if( chinkou_span > 0.064185 )
									ret := -0.562500
				if( senkou_span_a > 0.065236 )
					if( chinkou_span <= 0.065088 )
						if( basis_minus <= -0.000901 )
							if( senkou_span_a <= 0.065881 )
								if( senkou_span_a_displaced <= 0.067549 )
									ret := -0.307692
								if( senkou_span_a_displaced > 0.067549 )
									ret := 0.690476
							if( senkou_span_a > 0.065881 )
								if( chinkou_span <= 0.064347 )
									ret := -0.627737
								if( chinkou_span > 0.064347 )
									ret := 0.333333
						if( basis_minus > -0.000901 )
							if( chinkou_span <= 0.06471 )
								if( senkou_span_a <= 0.077145 )
									ret := -0.684751
								if( senkou_span_a > 0.077145 )
									ret := 0.500000
							if( chinkou_span > 0.06471 )
								if( tenkan_sen <= 0.065346 )
									ret := 0.214286
								if( tenkan_sen > 0.065346 )
									ret := -0.504065
					if( chinkou_span > 0.065088 )
						if( chinkou_span <= 0.068858 )
							if( kinjun_sen <= 0.069763 )
								if( senkou_span_a <= 0.068006 )
									ret := 0.051632
								if( senkou_span_a > 0.068006 )
									ret := -0.196455
							if( kinjun_sen > 0.069763 )
								if( chinkou_span <= 0.06747 )
									ret := -0.827586 // sell
								if( chinkou_span > 0.06747 )
									ret := -0.540187
						if( chinkou_span > 0.068858 )
							if( tenkan_sen <= 0.068761 )
								if( senkou_span_b_displaced <= 0.063615 )
									ret := -0.250000
								if( senkou_span_b_displaced > 0.063615 )
									ret := 0.591160
							if( tenkan_sen > 0.068761 )
								if( tenkan_sen <= 0.081231 )
									ret := 0.075497
								if( tenkan_sen > 0.081231 )
									ret := -0.003220
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_9fe98696(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


