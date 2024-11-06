//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AAVEUSDT_15Min_1ICH_bc7425b2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_1ICH_bc7425b2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_bc7425b2(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b <= 91.6332 )
		if( chinkou_span <= 90.1116 )
			if( tenkan_sen <= 87.5269 )
				if( chinkou_span <= 85.1 )
					if( tenkan_sen <= 84.1963 )
						if( chinkou_span <= 83.1097 )
							if( kinjun_sen <= 78.5473 )
								if( chinkou_span <= 79.0037 )
									ret := 0.050696
								if( chinkou_span > 79.0037 )
									ret := 0.565359
							if( kinjun_sen > 78.5473 )
								if( tenkan_sen <= 81.7292 )
									ret := 0.010838
								if( tenkan_sen > 81.7292 )
									ret := -0.171552
						if( chinkou_span > 83.1097 )
							if( tenkan_sen <= 82.4967 )
								if( senkou_span_b_displaced <= 81.3917 )
									ret := 0.275410
								if( senkou_span_b_displaced > 81.3917 )
									ret := 0.674274
							if( tenkan_sen > 82.4967 )
								if( kinjun_sen <= 85.3695 )
									ret := 0.146237
								if( kinjun_sen > 85.3695 )
									ret := 0.958333 // buy
					if( tenkan_sen > 84.1963 )
						if( senkou_span_b_displaced <= 84.4278 )
							if( basis_max <= -0.52875 )
								if( kinjun_sen <= 83.4433 )
									ret := 0.263158
								if( kinjun_sen > 83.4433 )
									ret := -0.853659 // sell
							if( basis_max > -0.52875 )
								if( basis_minus <= 0.308452 )
									ret := 0.309645
								if( basis_minus > 0.308452 )
									ret := -0.132692
						if( senkou_span_b_displaced > 84.4278 )
							if( senkou_span_a <= 84.5988 )
								if( basis_minus <= -0.526813 )
									ret := -0.707602 // sell
								if( basis_minus > -0.526813 )
									ret := -0.455128
							if( senkou_span_a > 84.5988 )
								if( senkou_span_a <= 85.0208 )
									ret := -0.127451
								if( senkou_span_a > 85.0208 )
									ret := -0.381295
				if( chinkou_span > 85.1 )
					if( kinjun_sen <= 83.756 )
						if( senkou_span_b_displaced <= 86.5898 )
							if( senkou_span_b <= 80.4703 )
								if( senkou_span_a_displaced <= 79.562 )
									ret := 0.929688 // buy
								if( senkou_span_a_displaced > 79.562 )
									ret := 0.600000
							if( senkou_span_b > 80.4703 )
								if( basis_max <= 0.105822 )
									ret := 0.500000
								if( basis_max > 0.105822 )
									ret := 0.774390 // buy
						if( senkou_span_b_displaced > 86.5898 )
							if( senkou_span_b <= 88.4375 )
								if( basis_max <= 0.202983 )
									ret := -0.180328
								if( basis_max > 0.202983 )
									ret := 0.545455
							if( senkou_span_b > 88.4375 )
								ret := -1.000000 // sell
					if( kinjun_sen > 83.756 )
						if( chinkou_span <= 88.2228 )
							if( tenkan_sen <= 85.3007 )
								if( senkou_span_b <= 84.9691 )
									ret := 0.210611
								if( senkou_span_b > 84.9691 )
									ret := 0.474383
							if( tenkan_sen > 85.3007 )
								if( chinkou_span <= 86.8936 )
									ret := -0.035039
								if( chinkou_span > 86.8936 )
									ret := 0.230769
						if( chinkou_span > 88.2228 )
							if( senkou_span_a_displaced <= 88.8375 )
								if( basis_max <= -0.753044 )
									ret := -0.178571
								if( basis_max > -0.753044 )
									ret := 0.613383
							if( senkou_span_a_displaced > 88.8375 )
								if( tenkan_sen <= 86.5906 )
									ret := 0.827586 // buy
								if( tenkan_sen > 86.5906 )
									ret := -0.439024
			if( tenkan_sen > 87.5269 )
				if( basis_max <= -0.128473 )
					if( tenkan_sen <= 88.8005 )
						if( chinkou_span <= 88.1996 )
							if( tenkan_sen <= 88.5442 )
								if( basis_minus <= 1.70573 )
									ret := -0.373887
								if( basis_minus > 1.70573 )
									ret := -0.811321 // sell
							if( tenkan_sen > 88.5442 )
								if( senkou_span_a_displaced <= 86.5875 )
									ret := 0.377778
								if( senkou_span_a_displaced > 86.5875 )
									ret := -0.233333
						if( chinkou_span > 88.1996 )
							if( tenkan_sen <= 87.6985 )
								if( basis_minus <= 0.939978 )
									ret := 0.300000
								if( basis_minus > 0.939978 )
									ret := 0.937500 // buy
							if( tenkan_sen > 87.6985 )
								if( senkou_span_a_displaced <= 84.1237 )
									ret := -0.294118
								if( senkou_span_a_displaced > 84.1237 )
									ret := 0.213675
					if( tenkan_sen > 88.8005 )
						if( chinkou_span <= 89.0601 )
							if( kinjun_sen <= 91.3483 )
								if( senkou_span_b_displaced <= 82.6618 )
									ret := 0.333333
								if( senkou_span_b_displaced > 82.6618 )
									ret := -0.628510
							if( kinjun_sen > 91.3483 )
								if( chinkou_span <= 88.5381 )
									ret := 0.500000
								if( chinkou_span > 88.5381 )
									ret := -0.666667
						if( chinkou_span > 89.0601 )
							if( senkou_span_b_displaced <= 86.0284 )
								if( basis_minus <= 2.1875 )
									ret := 0.781250 // buy
								if( basis_minus > 2.1875 )
									ret := 0.000000
							if( senkou_span_b_displaced > 86.0284 )
								if( kinjun_sen <= 90.3175 )
									ret := -0.117318
								if( kinjun_sen > 90.3175 )
									ret := -0.608108
				if( basis_max > -0.128473 )
					if( basis_minus <= -1.68492 )
						if( chinkou_span <= 86.1311 )
							if( senkou_span_a_displaced <= 91.8747 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 91.8747 )
								ret := -1.000000 // sell
						if( chinkou_span > 86.1311 )
							if( senkou_span_a_displaced <= 93.8263 )
								if( senkou_span_a <= 88.6969 )
									ret := 0.333333
								if( senkou_span_a > 88.6969 )
									ret := 0.956522 // buy
							if( senkou_span_a_displaced > 93.8263 )
								ret := 0.000000
					if( basis_minus > -1.68492 )
						if( senkou_span_b_displaced <= 86.1945 )
							if( senkou_span_b_displaced <= 82.3073 )
								if( kinjun_sen <= 88.6732 )
									ret := 0.500000
								if( kinjun_sen > 88.6732 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 82.3073 )
								if( senkou_span_b <= 87.6455 )
									ret := -0.709677 // sell
								if( senkou_span_b > 87.6455 )
									ret := 0.000000
						if( senkou_span_b_displaced > 86.1945 )
							if( senkou_span_b <= 87.0285 )
								if( senkou_span_a_displaced <= 86.5013 )
									ret := 0.000000
								if( senkou_span_a_displaced > 86.5013 )
									ret := 0.866667 // buy
							if( senkou_span_b > 87.0285 )
								if( chinkou_span <= 88.2795 )
									ret := -0.248233
								if( chinkou_span > 88.2795 )
									ret := 0.082192
		if( chinkou_span > 90.1116 )
			if( tenkan_sen <= 90.1878 )
				if( senkou_span_b_displaced <= 94.875 )
					if( tenkan_sen <= 89.1799 )
						if( basis_max <= 0.383944 )
							if( senkou_span_a_displaced <= 78.7021 )
								if( chinkou_span <= 92.4547 )
									ret := 0.166667
								if( chinkou_span > 92.4547 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 78.7021 )
								if( kinjun_sen <= 88.8225 )
									ret := 0.634002
								if( kinjun_sen > 88.8225 )
									ret := 0.867647 // buy
						if( basis_max > 0.383944 )
							if( senkou_span_a <= 88.0375 )
								if( senkou_span_a <= 87.3513 )
									ret := 0.700000 // buy
								if( senkou_span_a > 87.3513 )
									ret := -1.000000 // sell
							if( senkou_span_a > 88.0375 )
								if( senkou_span_a_displaced <= 89.9919 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 89.9919 )
									ret := 0.295455
					if( tenkan_sen > 89.1799 )
						if( kinjun_sen <= 89.24 )
							if( chinkou_span <= 91.3662 )
								if( basis_minus <= 0.365 )
									ret := 0.375000
								if( basis_minus > 0.365 )
									ret := -0.471698
							if( chinkou_span > 91.3662 )
								if( chinkou_span <= 93.34 )
									ret := 0.543478
								if( chinkou_span > 93.34 )
									ret := -0.162162
						if( kinjun_sen > 89.24 )
							if( kinjun_sen <= 89.9469 )
								if( senkou_span_b <= 90.0419 )
									ret := 0.519573
								if( senkou_span_b > 90.0419 )
									ret := 0.010989
							if( kinjun_sen > 89.9469 )
								if( kinjun_sen <= 90.437 )
									ret := 0.703448 // buy
								if( kinjun_sen > 90.437 )
									ret := 0.490566
				if( senkou_span_b_displaced > 94.875 )
					if( kinjun_sen <= 81.7541 )
						ret := -1.000000 // sell
					if( kinjun_sen > 81.7541 )
						ret := -0.250000
			if( tenkan_sen > 90.1878 )
				if( chinkou_span <= 93.1505 )
					if( senkou_span_a <= 91.2491 )
						if( senkou_span_a <= 89.7994 )
							if( kinjun_sen <= 87.875 )
								ret := -0.142857
							if( kinjun_sen > 87.875 )
								if( basis_minus <= 2.41198 )
									ret := -0.900000 // sell
								if( basis_minus > 2.41198 )
									ret := -0.600000
						if( senkou_span_a > 89.7994 )
							if( senkou_span_b_displaced <= 89.3375 )
								if( senkou_span_a <= 90.9366 )
									ret := 0.217822
								if( senkou_span_a > 90.9366 )
									ret := -0.285714
							if( senkou_span_b_displaced > 89.3375 )
								if( senkou_span_b_displaced <= 92.2025 )
									ret := 0.348341
								if( senkou_span_b_displaced > 92.2025 )
									ret := -0.214286
					if( senkou_span_a > 91.2491 )
						if( tenkan_sen <= 92.3486 )
							if( senkou_span_b <= 91.1077 )
								if( basis_minus <= 0.4975 )
									ret := -0.535714
								if( basis_minus > 0.4975 )
									ret := -0.069565
							if( senkou_span_b > 91.1077 )
								if( basis_max <= -0.276265 )
									ret := 0.568182
								if( basis_max > -0.276265 )
									ret := 0.020161
						if( tenkan_sen > 92.3486 )
							if( senkou_span_b <= 90.9875 )
								if( senkou_span_b_displaced <= 85.105 )
									ret := -0.541667
								if( senkou_span_b_displaced > 85.105 )
									ret := 0.344262
							if( senkou_span_b > 90.9875 )
								if( senkou_span_a_displaced <= 90.9489 )
									ret := -0.890625 // sell
								if( senkou_span_a_displaced > 90.9489 )
									ret := -0.185185
				if( chinkou_span > 93.1505 )
					if( senkou_span_a_displaced <= 88.591 )
						if( chinkou_span <= 97.7678 )
							if( kinjun_sen <= 92.625 )
								if( senkou_span_b <= 90.095 )
									ret := 0.085106
								if( senkou_span_b > 90.095 )
									ret := -0.805556 // sell
							if( kinjun_sen > 92.625 )
								ret := 1.000000 // buy
						if( chinkou_span > 97.7678 )
							if( basis_max <= -2.70277 )
								if( senkou_span_a_displaced <= 81.1634 )
									ret := -0.500000
								if( senkou_span_a_displaced > 81.1634 )
									ret := -1.000000 // sell
							if( basis_max > -2.70277 )
								if( tenkan_sen <= 91.0766 )
									ret := -0.363636
								if( tenkan_sen > 91.0766 )
									ret := 0.850746 // buy
					if( senkou_span_a_displaced > 88.591 )
						if( senkou_span_b <= 90.1358 )
							if( kinjun_sen <= 91.725 )
								if( senkou_span_b_displaced <= 88.425 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 88.425 )
									ret := 0.982759 // buy
							if( kinjun_sen > 91.725 )
								if( senkou_span_a <= 94.7709 )
									ret := 0.000000
								if( senkou_span_a > 94.7709 )
									ret := 0.750000 // buy
						if( senkou_span_b > 90.1358 )
							if( senkou_span_b_displaced <= 86.7228 )
								if( kinjun_sen <= 91.99 )
									ret := -0.875000 // sell
								if( kinjun_sen > 91.99 )
									ret := 0.333333
							if( senkou_span_b_displaced > 86.7228 )
								if( basis_minus <= 2.5214 )
									ret := 0.551980
								if( basis_minus > 2.5214 )
									ret := -0.421053
	if( senkou_span_b > 91.6332 )
		if( basis_max <= 0.000232 )
			if( senkou_span_a_displaced <= 171.639 )
				if( chinkou_span <= 92.8895 )
					if( kinjun_sen <= 93.7278 )
						if( senkou_span_b <= 94.4699 )
							if( chinkou_span <= 90.9499 )
								if( basis_minus <= 1.21583 )
									ret := -0.547486
								if( basis_minus > 1.21583 )
									ret := 0.833333 // buy
							if( chinkou_span > 90.9499 )
								if( basis_max <= -0.068231 )
									ret := -0.289773
								if( basis_max > -0.068231 )
									ret := 0.090000
						if( senkou_span_b > 94.4699 )
							if( basis_max <= -0.171123 )
								if( senkou_span_b_displaced <= 99.4646 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 99.4646 )
									ret := 0.750000 // buy
							if( basis_max > -0.171123 )
								ret := 0.000000
					if( kinjun_sen > 93.7278 )
						if( chinkou_span <= 91.3692 )
							if( tenkan_sen <= 94.9652 )
								if( basis_max <= -0.22125 )
									ret := -0.166667
								if( basis_max > -0.22125 )
									ret := -0.833333 // sell
							if( tenkan_sen > 94.9652 )
								if( basis_minus <= -0.9375 )
									ret := -0.400000
								if( basis_minus > -0.9375 )
									ret := -0.945783 // sell
						if( chinkou_span > 91.3692 )
							if( senkou_span_b_displaced <= 96.0007 )
								if( senkou_span_a <= 96.6059 )
									ret := -0.654930
								if( senkou_span_a > 96.6059 )
									ret := 0.000000
							if( senkou_span_b_displaced > 96.0007 )
								if( tenkan_sen <= 95.7041 )
									ret := 0.500000
								if( tenkan_sen > 95.7041 )
									ret := -0.333333
				if( chinkou_span > 92.8895 )
					if( senkou_span_a <= 96.8449 )
						if( kinjun_sen <= 92.8549 )
							if( chinkou_span <= 93.3447 )
								if( senkou_span_a <= 92.8082 )
									ret := 0.370370
								if( senkou_span_a > 92.8082 )
									ret := -0.458333
							if( chinkou_span > 93.3447 )
								if( tenkan_sen <= 94.573 )
									ret := 0.498305
								if( tenkan_sen > 94.573 )
									ret := 0.951220 // buy
						if( kinjun_sen > 92.8549 )
							if( chinkou_span <= 94.6515 )
								if( basis_minus <= 0.409703 )
									ret := -0.048780
								if( basis_minus > 0.409703 )
									ret := -0.492147
							if( chinkou_span > 94.6515 )
								if( chinkou_span <= 97.1021 )
									ret := 0.146953
								if( chinkou_span > 97.1021 )
									ret := 0.433618
					if( senkou_span_a > 96.8449 )
						if( chinkou_span <= 99.6 )
							if( tenkan_sen <= 98.0318 )
								if( chinkou_span <= 98.5373 )
									ret := -0.200935
								if( chinkou_span > 98.5373 )
									ret := 0.382979
							if( tenkan_sen > 98.0318 )
								if( senkou_span_a <= 100.774 )
									ret := -0.373555
								if( senkou_span_a > 100.774 )
									ret := -0.655087
						if( chinkou_span > 99.6 )
							if( kinjun_sen <= 100.556 )
								if( chinkou_span <= 100.782 )
									ret := 0.212181
								if( chinkou_span > 100.782 )
									ret := 0.593794
							if( kinjun_sen > 100.556 )
								if( basis_minus <= 2.58638 )
									ret := -0.013378
								if( basis_minus > 2.58638 )
									ret := 0.099023
			if( senkou_span_a_displaced > 171.639 )
				if( senkou_span_b_displaced <= 173.083 )
					if( basis_max <= -0.31 )
						ret := -1.000000 // sell
					if( basis_max > -0.31 )
						if( basis_minus <= 1.2425 )
							ret := -0.600000
						if( basis_minus > 1.2425 )
							ret := -1.000000 // sell
				if( senkou_span_b_displaced > 173.083 )
					ret := 0.000000
		if( basis_max > 0.000232 )
			if( chinkou_span <= 91.4022 )
				if( tenkan_sen <= 82.8665 )
					if( chinkou_span <= 74.0532 )
						if( basis_minus <= -10.4023 )
							ret := 0.750000 // buy
						if( basis_minus > -10.4023 )
							ret := 1.000000 // buy
					if( chinkou_span > 74.0532 )
						if( kinjun_sen <= 85.6746 )
							ret := 0.000000
						if( kinjun_sen > 85.6746 )
							ret := 1.000000 // buy
				if( tenkan_sen > 82.8665 )
					if( chinkou_span <= 88.6164 )
						if( tenkan_sen <= 100.53 )
							if( senkou_span_b <= 95.9925 )
								if( senkou_span_b_displaced <= 105.525 )
									ret := -0.616867
								if( senkou_span_b_displaced > 105.525 )
									ret := 1.000000 // buy
							if( senkou_span_b > 95.9925 )
								if( senkou_span_a_displaced <= 97.7302 )
									ret := -0.500000
								if( senkou_span_a_displaced > 97.7302 )
									ret := -0.963415 // sell
						if( tenkan_sen > 100.53 )
							if( basis_max <= 0.98625 )
								ret := -0.500000
							if( basis_max > 0.98625 )
								ret := 0.833333 // buy
					if( chinkou_span > 88.6164 )
						if( kinjun_sen <= 93.8629 )
							if( senkou_span_a <= 90.1564 )
								if( chinkou_span <= 90.9007 )
									ret := 0.250000
								if( chinkou_span > 90.9007 )
									ret := 0.937500 // buy
							if( senkou_span_a > 90.1564 )
								if( basis_max <= 0.421635 )
									ret := -0.213307
								if( basis_max > 0.421635 )
									ret := 0.121495
						if( kinjun_sen > 93.8629 )
							if( senkou_span_b_displaced <= 99.6275 )
								if( basis_max <= 0.198252 )
									ret := -0.825581 // sell
								if( basis_max > 0.198252 )
									ret := -0.430556
							if( senkou_span_b_displaced > 99.6275 )
								if( tenkan_sen <= 101.761 )
									ret := 0.800000 // buy
								if( tenkan_sen > 101.761 )
									ret := -0.750000 // sell
			if( chinkou_span > 91.4022 )
				if( senkou_span_a <= 105.402 )
					if( tenkan_sen <= 91.2498 )
						if( senkou_span_b_displaced <= 92.4517 )
							if( basis_minus <= -0.808103 )
								if( senkou_span_b <= 92.055 )
									ret := 0.275862
								if( senkou_span_b > 92.055 )
									ret := -0.500000
							if( basis_minus > -0.808103 )
								if( senkou_span_a <= 91.5664 )
									ret := 0.833333 // buy
								if( senkou_span_a > 91.5664 )
									ret := 0.375000
						if( senkou_span_b_displaced > 92.4517 )
							if( tenkan_sen <= 89.575 )
								ret := 0.000000
							if( tenkan_sen > 89.575 )
								if( kinjun_sen <= 92.8151 )
									ret := 0.710280 // buy
								if( kinjun_sen > 92.8151 )
									ret := 0.967742 // buy
					if( tenkan_sen > 91.2498 )
						if( chinkou_span <= 102.001 )
							if( senkou_span_a <= 101.536 )
								if( basis_minus <= -0.453378 )
									ret := 0.224277
								if( basis_minus > -0.453378 )
									ret := 0.005181
							if( senkou_span_a > 101.536 )
								if( senkou_span_b <= 107.093 )
									ret := -0.297700
								if( senkou_span_b > 107.093 )
									ret := 0.740741 // buy
						if( chinkou_span > 102.001 )
							if( tenkan_sen <= 102.619 )
								if( basis_minus <= 3.2581 )
									ret := 0.510514
								if( basis_minus > 3.2581 )
									ret := -0.857143 // sell
							if( tenkan_sen > 102.619 )
								if( senkou_span_a_displaced <= 105.352 )
									ret := 0.130000
								if( senkou_span_a_displaced > 105.352 )
									ret := 0.500000
				if( senkou_span_a > 105.402 )
					if( chinkou_span <= 108.65 )
						if( senkou_span_b <= 112.356 )
							if( senkou_span_a <= 106.424 )
								if( chinkou_span <= 103.678 )
									ret := -0.722222 // sell
								if( chinkou_span > 103.678 )
									ret := 0.225000
							if( senkou_span_a > 106.424 )
								if( kinjun_sen <= 111.859 )
									ret := -0.409348
								if( kinjun_sen > 111.859 )
									ret := 0.230769
						if( senkou_span_b > 112.356 )
							if( senkou_span_b <= 121.622 )
								if( basis_max <= 0.676589 )
									ret := -0.846154 // sell
								if( basis_max > 0.676589 )
									ret := -0.965986 // sell
							if( senkou_span_b > 121.622 )
								if( tenkan_sen <= 117.105 )
									ret := 0.250000
								if( tenkan_sen > 117.105 )
									ret := -0.684211
					if( chinkou_span > 108.65 )
						if( kinjun_sen <= 113.04 )
							if( senkou_span_b <= 111.341 )
								if( kinjun_sen <= 108.912 )
									ret := 0.363636
								if( kinjun_sen > 108.912 )
									ret := 0.730650 // buy
							if( senkou_span_b > 111.341 )
								if( senkou_span_b_displaced <= 111.922 )
									ret := -0.186441
								if( senkou_span_b_displaced > 111.922 )
									ret := 0.447721
						if( kinjun_sen > 113.04 )
							if( senkou_span_a_displaced <= 126.864 )
								if( chinkou_span <= 114.467 )
									ret := -0.351044
								if( chinkou_span > 114.467 )
									ret := 0.315972
							if( senkou_span_a_displaced > 126.864 )
								if( chinkou_span <= 121.196 )
									ret := -0.560669
								if( chinkou_span > 121.196 )
									ret := 0.013502
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_bc7425b2(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


