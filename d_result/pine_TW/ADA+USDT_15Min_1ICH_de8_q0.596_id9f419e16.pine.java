//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ADAUSDT_15Min_1ICH_9f419e16 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1ICH_9f419e16", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_9f419e16(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.0006 )
		if( senkou_span_a_displaced <= 0.586816 )
			if( chinkou_span <= 0.591107 )
				if( senkou_span_b <= 0.513469 )
					if( tenkan_sen <= 0.518752 )
						if( chinkou_span <= 0.500109 )
							if( kinjun_sen <= 0.471493 )
								if( chinkou_span <= 0.473618 )
									ret := 0.025542
								if( chinkou_span > 0.473618 )
									ret := 0.521542
							if( kinjun_sen > 0.471493 )
								if( tenkan_sen <= 0.502994 )
									ret := -0.121141
								if( tenkan_sen > 0.502994 )
									ret := -0.603030
						if( chinkou_span > 0.500109 )
							if( tenkan_sen <= 0.500178 )
								if( basis_max <= -0.004588 )
									ret := -0.239130
								if( basis_max > -0.004588 )
									ret := 0.631523
							if( tenkan_sen > 0.500178 )
								if( chinkou_span <= 0.515709 )
									ret := -0.044740
								if( chinkou_span > 0.515709 )
									ret := 0.418567
					if( tenkan_sen > 0.518752 )
						if( basis_minus <= 0.023725 )
							if( chinkou_span <= 0.515 )
								if( basis_max <= -0.01177 )
									ret := 0.166667
								if( basis_max > -0.01177 )
									ret := -0.950000 // sell
							if( chinkou_span > 0.515 )
								if( chinkou_span <= 0.535134 )
									ret := 0.521212
								if( chinkou_span > 0.535134 )
									ret := 0.925000 // buy
						if( basis_minus > 0.023725 )
							if( basis_max <= -0.004225 )
								ret := -1.000000 // sell
							if( basis_max > -0.004225 )
								if( senkou_span_a <= 0.530009 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.530009 )
									ret := -0.600000
				if( senkou_span_b > 0.513469 )
					if( chinkou_span <= 0.518127 )
						if( chinkou_span <= 0.505589 )
							if( tenkan_sen <= 0.514918 )
								if( chinkou_span <= 0.50305 )
									ret := -0.866667 // sell
								if( chinkou_span > 0.50305 )
									ret := -0.133333
							if( tenkan_sen > 0.514918 )
								if( tenkan_sen <= 0.519397 )
									ret := -0.923077 // sell
								if( tenkan_sen > 0.519397 )
									ret := -0.745455 // sell
						if( chinkou_span > 0.505589 )
							if( tenkan_sen <= 0.520811 )
								if( basis_max <= 0.000314 )
									ret := -0.400000
								if( basis_max > 0.000314 )
									ret := 0.116883
							if( tenkan_sen > 0.520811 )
								if( chinkou_span <= 0.50647 )
									ret := 0.222222
								if( chinkou_span > 0.50647 )
									ret := -0.640569
					if( chinkou_span > 0.518127 )
						if( senkou_span_b_displaced <= 0.545294 )
							if( senkou_span_b_displaced <= 0.53855 )
								if( tenkan_sen <= 0.532016 )
									ret := 0.207082
								if( tenkan_sen > 0.532016 )
									ret := -0.090164
							if( senkou_span_b_displaced > 0.53855 )
								if( senkou_span_b <= 0.53547 )
									ret := 0.017857
								if( senkou_span_b > 0.53547 )
									ret := 0.462470
						if( senkou_span_b_displaced > 0.545294 )
							if( chinkou_span <= 0.54125 )
								if( senkou_span_b_displaced <= 0.569368 )
									ret := -0.623711
								if( senkou_span_b_displaced > 0.569368 )
									ret := 0.333333
							if( chinkou_span > 0.54125 )
								if( kinjun_sen <= 0.588216 )
									ret := -0.027297
								if( kinjun_sen > 0.588216 )
									ret := -0.526316
			if( chinkou_span > 0.591107 )
				if( basis_minus <= 0.031952 )
					if( chinkou_span <= 0.61582 )
						if( senkou_span_a <= 0.571579 )
							if( senkou_span_a_displaced <= 0.565175 )
								if( senkou_span_b_displaced <= 0.5197 )
									ret := 0.125000
								if( senkou_span_b_displaced > 0.5197 )
									ret := 0.841667 // buy
							if( senkou_span_a_displaced > 0.565175 )
								ret := -0.200000
						if( senkou_span_a > 0.571579 )
							if( basis_minus <= 0.001816 )
								if( tenkan_sen <= 0.575855 )
									ret := 0.000000
								if( tenkan_sen > 0.575855 )
									ret := 0.848101 // buy
							if( basis_minus > 0.001816 )
								if( senkou_span_b_displaced <= 0.589473 )
									ret := 0.321101
								if( senkou_span_b_displaced > 0.589473 )
									ret := -0.812500 // sell
					if( chinkou_span > 0.61582 )
						if( senkou_span_b_displaced <= 0.595975 )
							if( senkou_span_b_displaced <= 0.56475 )
								if( senkou_span_b_displaced <= 0.560245 )
									ret := 0.734513 // buy
								if( senkou_span_b_displaced > 0.560245 )
									ret := -0.103448
							if( senkou_span_b_displaced > 0.56475 )
								if( senkou_span_a <= 0.61605 )
									ret := 0.865079 // buy
								if( senkou_span_a > 0.61605 )
									ret := -0.375000
						if( senkou_span_b_displaced > 0.595975 )
							ret := -0.600000
				if( basis_minus > 0.031952 )
					if( basis_minus <= 0.034982 )
						ret := -0.500000
					if( basis_minus > 0.034982 )
						ret := -1.000000 // sell
		if( senkou_span_a_displaced > 0.586816 )
			if( chinkou_span <= 0.606721 )
				if( tenkan_sen <= 0.610375 )
					if( basis_max <= -0.001318 )
						if( senkou_span_a_displaced <= 0.589909 )
							if( basis_minus <= 0.002581 )
								if( senkou_span_a_displaced <= 0.587803 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 0.587803 )
									ret := -0.333333
							if( basis_minus > 0.002581 )
								if( chinkou_span <= 0.602297 )
									ret := -0.724638 // sell
								if( chinkou_span > 0.602297 )
									ret := 0.500000
						if( senkou_span_a_displaced > 0.589909 )
							if( kinjun_sen <= 0.581039 )
								if( basis_minus <= -0.005688 )
									ret := -1.000000 // sell
								if( basis_minus > -0.005688 )
									ret := -0.750000 // sell
							if( kinjun_sen > 0.581039 )
								if( senkou_span_a_displaced <= 0.598065 )
									ret := 0.551020
								if( senkou_span_a_displaced > 0.598065 )
									ret := -0.057554
					if( basis_max > -0.001318 )
						if( chinkou_span <= 0.589292 )
							if( senkou_span_a_displaced <= 0.616035 )
								if( senkou_span_a_displaced <= 0.593046 )
									ret := -0.218905
								if( senkou_span_a_displaced > 0.593046 )
									ret := -0.612360
							if( senkou_span_a_displaced > 0.616035 )
								if( chinkou_span <= 0.582861 )
									ret := 0.750000 // buy
								if( chinkou_span > 0.582861 )
									ret := 1.000000 // buy
						if( chinkou_span > 0.589292 )
							if( senkou_span_b_displaced <= 0.581752 )
								if( senkou_span_b_displaced <= 0.581044 )
									ret := 0.000000
								if( senkou_span_b_displaced > 0.581044 )
									ret := 0.750000 // buy
							if( senkou_span_b_displaced > 0.581752 )
								if( basis_minus <= 0.003653 )
									ret := -0.073964
								if( basis_minus > 0.003653 )
									ret := -0.632653
				if( tenkan_sen > 0.610375 )
					if( senkou_span_b_displaced <= 0.615575 )
						if( basis_max <= 7e-05 )
							if( senkou_span_b <= 0.614442 )
								if( chinkou_span <= 0.605371 )
									ret := -0.907895 // sell
								if( chinkou_span > 0.605371 )
									ret := 0.000000
							if( senkou_span_b > 0.614442 )
								if( basis_minus <= 0.001321 )
									ret := 0.000000
								if( basis_minus > 0.001321 )
									ret := -0.800000 // sell
						if( basis_max > 7e-05 )
							if( basis_max <= 0.000481 )
								if( senkou_span_b <= 0.613893 )
									ret := 0.153846
								if( senkou_span_b > 0.613893 )
									ret := -0.500000
							if( basis_max > 0.000481 )
								if( senkou_span_a_displaced <= 0.611352 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.611352 )
									ret := -0.500000
					if( senkou_span_b_displaced > 0.615575 )
						if( senkou_span_b_displaced <= 0.617891 )
							if( senkou_span_b <= 0.612157 )
								if( senkou_span_a_displaced <= 0.60875 )
									ret := -0.428571
								if( senkou_span_a_displaced > 0.60875 )
									ret := 0.821429 // buy
							if( senkou_span_b > 0.612157 )
								ret := -0.500000
						if( senkou_span_b_displaced > 0.617891 )
							if( senkou_span_a <= 0.617475 )
								if( senkou_span_a_displaced <= 0.617125 )
									ret := -0.488372
								if( senkou_span_a_displaced > 0.617125 )
									ret := 0.645161
							if( senkou_span_a > 0.617475 )
								if( senkou_span_a_displaced <= 0.610951 )
									ret := 0.285714
								if( senkou_span_a_displaced > 0.610951 )
									ret := -0.729885 // sell
			if( chinkou_span > 0.606721 )
				if( senkou_span_a <= 0.628668 )
					if( senkou_span_a_displaced <= 0.596463 )
						if( senkou_span_a_displaced <= 0.589985 )
							if( senkou_span_b_displaced <= 0.585075 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.585075 )
								if( tenkan_sen <= 0.584625 )
									ret := 0.888889 // buy
								if( tenkan_sen > 0.584625 )
									ret := 0.200000
						if( senkou_span_a_displaced > 0.589985 )
							if( senkou_span_b_displaced <= 0.592643 )
								if( chinkou_span <= 0.611313 )
									ret := 0.875000 // buy
								if( chinkou_span > 0.611313 )
									ret := -0.161290
							if( senkou_span_b_displaced > 0.592643 )
								if( basis_max <= 6e-06 )
									ret := -0.727273 // sell
								if( basis_max > 6e-06 )
									ret := -0.111111
					if( senkou_span_a_displaced > 0.596463 )
						if( senkou_span_b_displaced <= 0.601675 )
							if( senkou_span_b <= 0.605832 )
								if( basis_minus <= 0.004575 )
									ret := 0.943662 // buy
								if( basis_minus > 0.004575 )
									ret := 0.622222
							if( senkou_span_b > 0.605832 )
								if( chinkou_span <= 0.622924 )
									ret := -0.216216
								if( chinkou_span > 0.622924 )
									ret := 0.545455
						if( senkou_span_b_displaced > 0.601675 )
							if( chinkou_span <= 0.627674 )
								if( senkou_span_b_displaced <= 0.63335 )
									ret := 0.107018
								if( senkou_span_b_displaced > 0.63335 )
									ret := -0.505747
							if( chinkou_span > 0.627674 )
								if( senkou_span_a_displaced <= 0.621613 )
									ret := 0.317647
								if( senkou_span_a_displaced > 0.621613 )
									ret := 0.734266 // buy
				if( senkou_span_a > 0.628668 )
					if( kinjun_sen <= 0.656666 )
						if( senkou_span_a <= 0.649325 )
							if( chinkou_span <= 0.634374 )
								if( basis_max <= -0.00205 )
									ret := -0.721649 // sell
								if( basis_max > -0.00205 )
									ret := -0.260870
							if( chinkou_span > 0.634374 )
								if( basis_max <= -0.001512 )
									ret := 0.344978
								if( basis_max > -0.001512 )
									ret := 0.008721
						if( senkou_span_a > 0.649325 )
							if( senkou_span_b <= 0.65691 )
								if( chinkou_span <= 0.655485 )
									ret := -0.512821
								if( chinkou_span > 0.655485 )
									ret := -0.013514
							if( senkou_span_b > 0.65691 )
								if( kinjun_sen <= 0.6522 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.6522 )
									ret := -0.545455
					if( kinjun_sen > 0.656666 )
						if( chinkou_span <= 0.87115 )
							if( senkou_span_a <= 0.720148 )
								if( chinkou_span <= 0.720717 )
									ret := -0.034188
								if( chinkou_span > 0.720717 )
									ret := 0.586387
							if( senkou_span_a > 0.720148 )
								if( basis_minus <= 0.017031 )
									ret := -0.037453
								if( basis_minus > 0.017031 )
									ret := -0.561404
						if( chinkou_span > 0.87115 )
							if( senkou_span_a_displaced <= 0.801426 )
								if( senkou_span_b <= 0.806901 )
									ret := 0.818182 // buy
								if( senkou_span_b > 0.806901 )
									ret := -0.200000
							if( senkou_span_a_displaced > 0.801426 )
								if( senkou_span_a <= 0.874896 )
									ret := 0.900000 // buy
								if( senkou_span_a > 0.874896 )
									ret := 0.250000
	if( basis_max > 0.0006 )
		if( kinjun_sen <= 0.74185 )
			if( tenkan_sen <= 0.724854 )
				if( senkou_span_b <= 0.719625 )
					if( chinkou_span <= 0.607468 )
						if( kinjun_sen <= 0.575816 )
							if( tenkan_sen <= 0.565194 )
								if( chinkou_span <= 0.544197 )
									ret := 0.092534
								if( chinkou_span > 0.544197 )
									ret := 0.391765
							if( tenkan_sen > 0.565194 )
								if( senkou_span_b_displaced <= 0.578805 )
									ret := 0.142857
								if( senkou_span_b_displaced > 0.578805 )
									ret := 0.627451
						if( kinjun_sen > 0.575816 )
							if( basis_minus <= 0.002863 )
								if( senkou_span_b <= 0.581738 )
									ret := 0.518519
								if( senkou_span_b > 0.581738 )
									ret := -0.075128
							if( basis_minus > 0.002863 )
								if( senkou_span_a_displaced <= 0.581201 )
									ret := -0.200000
								if( senkou_span_a_displaced > 0.581201 )
									ret := -0.727941 // sell
					if( chinkou_span > 0.607468 )
						if( senkou_span_b <= 0.62093 )
							if( basis_max <= 0.000876 )
								if( tenkan_sen <= 0.603 )
									ret := 0.666667
								if( tenkan_sen > 0.603 )
									ret := -0.024390
							if( basis_max > 0.000876 )
								if( tenkan_sen <= 0.60574 )
									ret := 0.811808 // buy
								if( tenkan_sen > 0.60574 )
									ret := 0.477273
						if( senkou_span_b > 0.62093 )
							if( senkou_span_a <= 0.710838 )
								if( kinjun_sen <= 0.682914 )
									ret := 0.202344
								if( kinjun_sen > 0.682914 )
									ret := -0.361111
							if( senkou_span_a > 0.710838 )
								if( kinjun_sen <= 0.728911 )
									ret := 0.800000 // buy
								if( kinjun_sen > 0.728911 )
									ret := 0.000000
				if( senkou_span_b > 0.719625 )
					if( kinjun_sen <= 0.730375 )
						if( chinkou_span <= 0.710662 )
							if( basis_max <= 0.010213 )
								if( basis_max <= 0.001001 )
									ret := -0.500000
								if( basis_max > 0.001001 )
									ret := -0.945455 // sell
							if( basis_max > 0.010213 )
								ret := -0.500000
						if( chinkou_span > 0.710662 )
							if( kinjun_sen <= 0.726268 )
								if( senkou_span_a_displaced <= 0.732907 )
									ret := -0.428571
								if( senkou_span_a_displaced > 0.732907 )
									ret := 0.800000 // buy
							if( kinjun_sen > 0.726268 )
								ret := -1.000000 // sell
					if( kinjun_sen > 0.730375 )
						if( senkou_span_b_displaced <= 0.758398 )
							if( senkou_span_a <= 0.72441 )
								ret := -1.000000 // sell
							if( senkou_span_a > 0.72441 )
								ret := 0.000000
						if( senkou_span_b_displaced > 0.758398 )
							if( senkou_span_b_displaced <= 0.761678 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.761678 )
								if( basis_minus <= -0.007413 )
									ret := 0.000000
								if( basis_minus > -0.007413 )
									ret := 1.000000 // buy
			if( tenkan_sen > 0.724854 )
				if( senkou_span_b <= 0.735175 )
					if( chinkou_span <= 0.725826 )
						if( senkou_span_a_displaced <= 0.736221 )
							ret := -0.500000
						if( senkou_span_a_displaced > 0.736221 )
							if( chinkou_span <= 0.693629 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.693629 )
								ret := 0.750000 // buy
					if( chinkou_span > 0.725826 )
						if( tenkan_sen <= 0.734904 )
							if( senkou_span_b_displaced <= 0.7195 )
								if( kinjun_sen <= 0.730613 )
									ret := 0.923077 // buy
								if( kinjun_sen > 0.730613 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.7195 )
								if( basis_minus <= -0.001086 )
									ret := 0.800000 // buy
								if( basis_minus > -0.001086 )
									ret := 0.250000
						if( tenkan_sen > 0.734904 )
							if( senkou_span_b <= 0.727225 )
								ret := 0.714286 // buy
							if( senkou_span_b > 0.727225 )
								ret := -0.200000
				if( senkou_span_b > 0.735175 )
					if( senkou_span_b_displaced <= 0.747706 )
						if( senkou_span_b_displaced <= 0.74275 )
							if( basis_max <= 0.001975 )
								if( basis_max <= 0.0012 )
									ret := -0.222222
								if( basis_max > 0.0012 )
									ret := 0.040000
							if( basis_max > 0.001975 )
								if( chinkou_span <= 0.735033 )
									ret := 0.000000
								if( chinkou_span > 0.735033 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.74275 )
							ret := -0.833333 // sell
					if( senkou_span_b_displaced > 0.747706 )
						if( basis_minus <= -0.001406 )
							ret := 1.000000 // buy
						if( basis_minus > -0.001406 )
							ret := 0.250000
		if( kinjun_sen > 0.74185 )
			if( senkou_span_a_displaced <= 0.753571 )
				if( senkou_span_b_displaced <= 0.717375 )
					ret := 0.428571
				if( senkou_span_b_displaced > 0.717375 )
					if( senkou_span_b_displaced <= 0.74845 )
						if( senkou_span_b <= 0.743 )
							if( senkou_span_a_displaced <= 0.73825 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.73825 )
								if( senkou_span_b_displaced <= 0.7374 )
									ret := 0.666667
								if( senkou_span_b_displaced > 0.7374 )
									ret := 0.000000
						if( senkou_span_b > 0.743 )
							if( basis_max <= 0.002188 )
								ret := -1.000000 // sell
							if( basis_max > 0.002188 )
								ret := -0.666667
					if( senkou_span_b_displaced > 0.74845 )
						if( basis_minus <= -0.00398 )
							ret := -0.833333 // sell
						if( basis_minus > -0.00398 )
							ret := 0.571429
			if( senkou_span_a_displaced > 0.753571 )
				if( senkou_span_b <= 0.864903 )
					if( chinkou_span <= 0.77815 )
						if( senkou_span_a <= 0.753876 )
							if( senkou_span_b <= 0.748168 )
								if( basis_max <= 0.003289 )
									ret := -0.500000
								if( basis_max > 0.003289 )
									ret := -1.000000 // sell
							if( senkou_span_b > 0.748168 )
								if( basis_max <= 0.001868 )
									ret := -0.222222
								if( basis_max > 0.001868 )
									ret := 0.500000
						if( senkou_span_a > 0.753876 )
							if( basis_minus <= 0.010146 )
								if( chinkou_span <= 0.746119 )
									ret := -0.758621 // sell
								if( chinkou_span > 0.746119 )
									ret := -0.289683
							if( basis_minus > 0.010146 )
								if( basis_max <= 0.0038 )
									ret := 0.523810
								if( basis_max > 0.0038 )
									ret := -1.000000 // sell
					if( chinkou_span > 0.77815 )
						if( senkou_span_b_displaced <= 0.883186 )
							if( basis_max <= 0.004825 )
								if( basis_minus <= 0.002344 )
									ret := 0.265873
								if( basis_minus > 0.002344 )
									ret := -0.480000
							if( basis_max > 0.004825 )
								if( kinjun_sen <= 0.814843 )
									ret := 0.555556
								if( kinjun_sen > 0.814843 )
									ret := 0.966667 // buy
						if( senkou_span_b_displaced > 0.883186 )
							if( kinjun_sen <= 0.827856 )
								if( tenkan_sen <= 0.813618 )
									ret := -0.647059
								if( tenkan_sen > 0.813618 )
									ret := 0.750000 // buy
							if( kinjun_sen > 0.827856 )
								ret := -1.000000 // sell
				if( senkou_span_b > 0.864903 )
					if( senkou_span_b_displaced <= 0.862412 )
						if( kinjun_sen <= 0.878 )
							ret := -0.250000
						if( kinjun_sen > 0.878 )
							ret := 0.000000
					if( senkou_span_b_displaced > 0.862412 )
						if( chinkou_span <= 0.787187 )
							ret := -0.750000 // sell
						if( chinkou_span > 0.787187 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADAUSDT_15Min_9f419e16(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


