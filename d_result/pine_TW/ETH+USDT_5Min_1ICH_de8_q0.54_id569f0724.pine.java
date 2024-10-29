//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ETHUSDT_5Min_1ICH_569f0724 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_1ICH_569f0724", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_569f0724(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( chinkou_span <= 3460.85 )
		if( kinjun_sen <= 3428.76 )
			if( basis_max <= 2.1843 )
				if( basis_minus <= 10.0628 )
					if( basis_minus <= -96.7848 )
						ret := 1.000000 // buy
					if( basis_minus > -96.7848 )
						if( senkou_span_b <= 3417.89 )
							if( senkou_span_b_displaced <= 2221.36 )
								if( chinkou_span <= 2191.99 )
									ret := -0.001411
								if( chinkou_span > 2191.99 )
									ret := 0.395328
							if( senkou_span_b_displaced > 2221.36 )
								if( kinjun_sen <= 2207.92 )
									ret := -0.559846
								if( kinjun_sen > 2207.92 )
									ret := -0.015655
						if( senkou_span_b > 3417.89 )
							if( senkou_span_a_displaced <= 3422.31 )
								if( senkou_span_a <= 3410.27 )
									ret := 0.260870
								if( senkou_span_a > 3410.27 )
									ret := -0.575000
							if( senkou_span_a_displaced > 3422.31 )
								if( basis_max <= -2.56086 )
									ret := -0.518072
								if( basis_max > -2.56086 )
									ret := -0.027650
				if( basis_minus > 10.0628 )
					if( senkou_span_b_displaced <= 2183.48 )
						if( senkou_span_a_displaced <= 2000.9 )
							if( senkou_span_a <= 1662.52 )
								if( kinjun_sen <= 1658.82 )
									ret := -0.288462
								if( kinjun_sen > 1658.82 )
									ret := -1.000000 // sell
							if( senkou_span_a > 1662.52 )
								if( basis_minus <= 33.9653 )
									ret := -0.131833
								if( basis_minus > 33.9653 )
									ret := 0.500000
						if( senkou_span_a_displaced > 2000.9 )
							if( senkou_span_a_displaced <= 2010.38 )
								if( kinjun_sen <= 2025.77 )
									ret := -0.621622
								if( kinjun_sen > 2025.77 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 2010.38 )
								if( tenkan_sen <= 2042.38 )
									ret := -0.847059 // sell
								if( tenkan_sen > 2042.38 )
									ret := -0.318182
					if( senkou_span_b_displaced > 2183.48 )
						if( basis_max <= -0.158705 )
							if( senkou_span_b <= 2198.43 )
								if( chinkou_span <= 2226.9 )
									ret := 0.644737
								if( chinkou_span > 2226.9 )
									ret := 0.102941
							if( senkou_span_b > 2198.43 )
								if( senkou_span_a <= 2220.82 )
									ret := -0.576000
								if( senkou_span_a > 2220.82 )
									ret := -0.092947
						if( basis_max > -0.158705 )
							if( basis_minus <= 11.1371 )
								if( senkou_span_a_displaced <= 2224.6 )
									ret := -0.846154 // sell
								if( senkou_span_a_displaced > 2224.6 )
									ret := -0.040650
							if( basis_minus > 11.1371 )
								if( senkou_span_a_displaced <= 3387.7 )
									ret := 0.133403
								if( senkou_span_a_displaced > 3387.7 )
									ret := 0.763636 // buy
			if( basis_max > 2.1843 )
				if( chinkou_span <= 3158.18 )
					if( senkou_span_b_displaced <= 3180.9 )
						if( basis_max <= 7.12259 )
							if( tenkan_sen <= 3090.34 )
								if( senkou_span_a <= 3077.61 )
									ret := 0.037384
								if( senkou_span_a > 3077.61 )
									ret := 0.431487
							if( tenkan_sen > 3090.34 )
								if( tenkan_sen <= 3099.52 )
									ret := -0.376866
								if( tenkan_sen > 3099.52 )
									ret := -0.114316
						if( basis_max > 7.12259 )
							if( chinkou_span <= 3025.17 )
								if( senkou_span_b_displaced <= 3094.91 )
									ret := 0.173671
								if( senkou_span_b_displaced > 3094.91 )
									ret := -0.546875
							if( chinkou_span > 3025.17 )
								if( tenkan_sen <= 3107.07 )
									ret := 0.790646 // buy
								if( tenkan_sen > 3107.07 )
									ret := 0.193548
					if( senkou_span_b_displaced > 3180.9 )
						if( senkou_span_a_displaced <= 3192.22 )
							if( chinkou_span <= 3116.2 )
								if( senkou_span_b_displaced <= 3189.09 )
									ret := -0.148148
								if( senkou_span_b_displaced > 3189.09 )
									ret := -0.888889 // sell
							if( chinkou_span > 3116.2 )
								if( senkou_span_b_displaced <= 3208.25 )
									ret := 0.595238
								if( senkou_span_b_displaced > 3208.25 )
									ret := -0.151515
						if( senkou_span_a_displaced > 3192.22 )
							if( tenkan_sen <= 2915.7 )
								ret := 0.538462
							if( tenkan_sen > 2915.7 )
								if( basis_minus <= -23.3714 )
									ret := -0.325758
								if( basis_minus > -23.3714 )
									ret := -0.748858 // sell
				if( chinkou_span > 3158.18 )
					if( senkou_span_a <= 3173.42 )
						if( tenkan_sen <= 3149.97 )
							if( senkou_span_b <= 3170.41 )
								if( senkou_span_a_displaced <= 3158.07 )
									ret := 0.500000
								if( senkou_span_a_displaced > 3158.07 )
									ret := 1.000000 // buy
							if( senkou_span_b > 3170.41 )
								ret := -1.000000 // sell
						if( tenkan_sen > 3149.97 )
							if( tenkan_sen <= 3156.84 )
								if( chinkou_span <= 3162.18 )
									ret := 0.928571 // buy
								if( chinkou_span > 3162.18 )
									ret := 1.000000 // buy
							if( tenkan_sen > 3156.84 )
								if( tenkan_sen <= 3160.51 )
									ret := 0.157895
								if( tenkan_sen > 3160.51 )
									ret := 0.833333 // buy
					if( senkou_span_a > 3173.42 )
						if( senkou_span_b_displaced <= 3468.43 )
							if( senkou_span_a <= 3194.91 )
								if( kinjun_sen <= 3188.99 )
									ret := -0.010204
								if( kinjun_sen > 3188.99 )
									ret := 0.500000
							if( senkou_span_a > 3194.91 )
								if( chinkou_span <= 3203.29 )
									ret := -0.407104
								if( chinkou_span > 3203.29 )
									ret := 0.151577
						if( senkou_span_b_displaced > 3468.43 )
							if( senkou_span_a <= 3399.67 )
								if( basis_max <= 10.775 )
									ret := -0.838710 // sell
								if( basis_max > 10.775 )
									ret := -0.171429
							if( senkou_span_a > 3399.67 )
								if( tenkan_sen <= 3397.79 )
									ret := 0.900000 // buy
								if( tenkan_sen > 3397.79 )
									ret := -0.163934
		if( kinjun_sen > 3428.76 )
			if( chinkou_span <= 3421.68 )
				if( tenkan_sen <= 3415.06 )
					if( chinkou_span <= 3411.32 )
						if( tenkan_sen <= 3397.46 )
							ret := -1.000000 // sell
						if( tenkan_sen > 3397.46 )
							if( basis_max <= 8.85442 )
								ret := 0.700000 // buy
							if( basis_max > 8.85442 )
								if( senkou_span_a <= 3425.76 )
									ret := -0.333333
								if( senkou_span_a > 3425.76 )
									ret := -0.300000
					if( chinkou_span > 3411.32 )
						ret := 1.000000 // buy
				if( tenkan_sen > 3415.06 )
					if( basis_minus <= -2.30775 )
						if( basis_minus <= -11.3148 )
							if( kinjun_sen <= 3653.25 )
								if( senkou_span_b <= 3457.96 )
									ret := -0.987342 // sell
								if( senkou_span_b > 3457.96 )
									ret := -0.691176
							if( kinjun_sen > 3653.25 )
								ret := -0.272727
						if( basis_minus > -11.3148 )
							if( tenkan_sen <= 3435.44 )
								if( kinjun_sen <= 3432.2 )
									ret := -0.868421 // sell
								if( kinjun_sen > 3432.2 )
									ret := 0.256410
							if( tenkan_sen > 3435.44 )
								if( tenkan_sen <= 3487.42 )
									ret := -0.598039
								if( tenkan_sen > 3487.42 )
									ret := 0.103448
					if( basis_minus > -2.30775 )
						if( senkou_span_b_displaced <= 3489.92 )
							if( basis_max <= 2.28 )
								if( senkou_span_b_displaced <= 3457.05 )
									ret := -0.862876 // sell
								if( senkou_span_b_displaced > 3457.05 )
									ret := -0.641791
							if( basis_max > 2.28 )
								if( basis_max <= 2.94625 )
									ret := 0.700000 // buy
								if( basis_max > 2.94625 )
									ret := -0.512195
						if( senkou_span_b_displaced > 3489.92 )
							ret := -1.000000 // sell
			if( chinkou_span > 3421.68 )
				if( kinjun_sen <= 3472.72 )
					if( basis_minus <= -15.4751 )
						if( senkou_span_a <= 3450.35 )
							if( chinkou_span <= 3438.69 )
								if( basis_max <= 3.68359 )
									ret := 1.000000 // buy
								if( basis_max > 3.68359 )
									ret := 0.000000
							if( chinkou_span > 3438.69 )
								ret := 1.000000 // buy
						if( senkou_span_a > 3450.35 )
							if( senkou_span_b_displaced <= 3471.59 )
								ret := -0.083333
							if( senkou_span_b_displaced > 3471.59 )
								ret := 0.727273 // buy
					if( basis_minus > -15.4751 )
						if( chinkou_span <= 3438.92 )
							if( tenkan_sen <= 3435.46 )
								if( senkou_span_a <= 3433.73 )
									ret := -0.612903
								if( senkou_span_a > 3433.73 )
									ret := 0.482759
							if( tenkan_sen > 3435.46 )
								if( basis_max <= -0.05375 )
									ret := -0.733696 // sell
								if( basis_max > -0.05375 )
									ret := -0.289941
						if( chinkou_span > 3438.92 )
							if( senkou_span_a <= 3447.19 )
								if( kinjun_sen <= 3437.58 )
									ret := -0.246377
								if( kinjun_sen > 3437.58 )
									ret := 0.323636
							if( senkou_span_a > 3447.19 )
								if( senkou_span_a_displaced <= 3479.85 )
									ret := -0.340471
								if( senkou_span_a_displaced > 3479.85 )
									ret := 0.500000
				if( kinjun_sen > 3472.72 )
					if( senkou_span_b <= 3527.8 )
						if( senkou_span_b <= 3522.16 )
							if( senkou_span_b <= 3506.52 )
								if( senkou_span_a <= 3513.57 )
									ret := -0.475822
								if( senkou_span_a > 3513.57 )
									ret := 1.000000 // buy
							if( senkou_span_b > 3506.52 )
								if( chinkou_span <= 3440.28 )
									ret := -0.577465
								if( chinkou_span > 3440.28 )
									ret := -0.903846 // sell
						if( senkou_span_b > 3522.16 )
							if( senkou_span_a_displaced <= 3523.84 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 3523.84 )
								if( basis_minus <= -15.5673 )
									ret := 0.960000 // buy
								if( basis_minus > -15.5673 )
									ret := 0.393939
					if( senkou_span_b > 3527.8 )
						if( senkou_span_a_displaced <= 3785.11 )
							if( senkou_span_b <= 3544.2 )
								if( chinkou_span <= 3454.87 )
									ret := -1.000000 // sell
								if( chinkou_span > 3454.87 )
									ret := -0.750000 // sell
							if( senkou_span_b > 3544.2 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 3785.11 )
							ret := -0.375000
	if( chinkou_span > 3460.85 )
		if( kinjun_sen <= 3492.17 )
			if( senkou_span_b <= 3431.92 )
				if( senkou_span_b_displaced <= 3413.97 )
					if( senkou_span_b <= 3306.14 )
						if( tenkan_sen <= 3355.57 )
							if( senkou_span_b <= 3272.09 )
								if( senkou_span_a <= 3143.91 )
									ret := 0.500000
								if( senkou_span_a > 3143.91 )
									ret := 1.000000 // buy
							if( senkou_span_b > 3272.09 )
								if( senkou_span_a <= 3326.42 )
									ret := 0.272727
								if( senkou_span_a > 3326.42 )
									ret := -0.833333 // sell
						if( tenkan_sen > 3355.57 )
							if( chinkou_span <= 3492.59 )
								ret := 0.875000 // buy
							if( chinkou_span > 3492.59 )
								ret := 1.000000 // buy
					if( senkou_span_b > 3306.14 )
						if( senkou_span_a <= 3427.81 )
							if( senkou_span_a_displaced <= 3398.44 )
								if( basis_max <= -2.29822 )
									ret := -0.714286 // sell
								if( basis_max > -2.29822 )
									ret := 0.542857
							if( senkou_span_a_displaced > 3398.44 )
								if( senkou_span_a_displaced <= 3410.96 )
									ret := 0.823529 // buy
								if( senkou_span_a_displaced > 3410.96 )
									ret := 0.305085
						if( senkou_span_a > 3427.81 )
							if( chinkou_span <= 3610.43 )
								if( basis_max <= -24.6083 )
									ret := 0.416667
								if( basis_max > -24.6083 )
									ret := 0.847826 // buy
							if( chinkou_span > 3610.43 )
								ret := 1.000000 // buy
				if( senkou_span_b_displaced > 3413.97 )
					if( tenkan_sen <= 3427.84 )
						if( basis_max <= -1.30728 )
							if( tenkan_sen <= 3424.02 )
								if( basis_minus <= 13.975 )
									ret := 0.555556
								if( basis_minus > 13.975 )
									ret := 1.000000 // buy
							if( tenkan_sen > 3424.02 )
								ret := 0.421053
						if( basis_max > -1.30728 )
							if( chinkou_span <= 3467.11 )
								ret := 0.727273 // buy
							if( chinkou_span > 3467.11 )
								ret := 1.000000 // buy
					if( tenkan_sen > 3427.84 )
						ret := 1.000000 // buy
			if( senkou_span_b > 3431.92 )
				if( senkou_span_a <= 3470.83 )
					if( senkou_span_a_displaced <= 3428.11 )
						if( kinjun_sen <= 3451.22 )
							if( senkou_span_b <= 3434.93 )
								if( senkou_span_b <= 3434.76 )
									ret := -0.275862
								if( senkou_span_b > 3434.76 )
									ret := 0.666667
							if( senkou_span_b > 3434.93 )
								if( basis_minus <= 8.00632 )
									ret := 0.200000
								if( basis_minus > 8.00632 )
									ret := -0.689189
						if( kinjun_sen > 3451.22 )
							if( tenkan_sen <= 3459.99 )
								ret := -0.636364
							if( tenkan_sen > 3459.99 )
								if( senkou_span_b <= 3438.43 )
									ret := 0.812500 // buy
								if( senkou_span_b > 3438.43 )
									ret := 0.146667
					if( senkou_span_a_displaced > 3428.11 )
						if( senkou_span_b <= 3495.54 )
							if( senkou_span_a_displaced <= 3437.22 )
								if( senkou_span_b_displaced <= 3434.22 )
									ret := 0.500000
								if( senkou_span_b_displaced > 3434.22 )
									ret := 0.929032 // buy
							if( senkou_span_a_displaced > 3437.22 )
								if( basis_max <= -24.3691 )
									ret := -0.800000 // sell
								if( basis_max > -24.3691 )
									ret := 0.572539
						if( senkou_span_b > 3495.54 )
							if( basis_minus <= -87.7361 )
								ret := -1.000000 // sell
							if( basis_minus > -87.7361 )
								ret := -0.777778 // sell
				if( senkou_span_a > 3470.83 )
					if( senkou_span_b <= 3483.26 )
						if( tenkan_sen <= 3488.82 )
							if( senkou_span_a_displaced <= 3469.87 )
								if( basis_minus <= 25.243 )
									ret := 0.417910
								if( basis_minus > 25.243 )
									ret := -0.391304
							if( senkou_span_a_displaced > 3469.87 )
								if( basis_max <= 0.195787 )
									ret := -0.318182
								if( basis_max > 0.195787 )
									ret := 0.176871
						if( tenkan_sen > 3488.82 )
							if( basis_minus <= 20.4438 )
								if( chinkou_span <= 3485.59 )
									ret := -0.973684 // sell
								if( chinkou_span > 3485.59 )
									ret := -0.324324
							if( basis_minus > 20.4438 )
								if( kinjun_sen <= 3479.51 )
									ret := -0.692308
								if( kinjun_sen > 3479.51 )
									ret := 0.079365
					if( senkou_span_b > 3483.26 )
						if( chinkou_span <= 3494.07 )
							if( senkou_span_a <= 3472.43 )
								if( basis_max <= 10.1188 )
									ret := -0.750000 // sell
								if( basis_max > 10.1188 )
									ret := -1.000000 // sell
							if( senkou_span_a > 3472.43 )
								if( kinjun_sen <= 3478.75 )
									ret := 0.763158 // buy
								if( kinjun_sen > 3478.75 )
									ret := -0.009288
						if( chinkou_span > 3494.07 )
							if( senkou_span_b <= 3487.27 )
								if( senkou_span_b_displaced <= 3475.67 )
									ret := 0.142857
								if( senkou_span_b_displaced > 3475.67 )
									ret := 0.905512 // buy
							if( senkou_span_b > 3487.27 )
								if( basis_minus <= 3.29596 )
									ret := 0.535147
								if( basis_minus > 3.29596 )
									ret := -0.350000
		if( kinjun_sen > 3492.17 )
			if( tenkan_sen <= 3502.13 )
				if( kinjun_sen <= 3498.04 )
					if( senkou_span_b <= 3497.58 )
						if( senkou_span_a_displaced <= 3497.82 )
							if( senkou_span_b <= 3495.13 )
								if( basis_minus <= -2.195 )
									ret := 0.793103 // buy
								if( basis_minus > -2.195 )
									ret := 0.038835
							if( senkou_span_b > 3495.13 )
								if( senkou_span_b_displaced <= 3471.64 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 3471.64 )
									ret := -0.370370
						if( senkou_span_a_displaced > 3497.82 )
							if( basis_minus <= -3.60375 )
								if( kinjun_sen <= 3493.33 )
									ret := -0.500000
								if( kinjun_sen > 3493.33 )
									ret := -1.000000 // sell
							if( basis_minus > -3.60375 )
								if( senkou_span_b_displaced <= 3488.78 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 3488.78 )
									ret := -0.228070
					if( senkou_span_b > 3497.58 )
						if( senkou_span_b_displaced <= 3505.71 )
							if( basis_minus <= -2.0175 )
								ret := 0.000000
							if( basis_minus > -2.0175 )
								ret := -0.375000
						if( senkou_span_b_displaced > 3505.71 )
							if( chinkou_span <= 3500.51 )
								if( senkou_span_b_displaced <= 3512.15 )
									ret := 0.285714
								if( senkou_span_b_displaced > 3512.15 )
									ret := -0.166667
							if( chinkou_span > 3500.51 )
								if( basis_max <= 5.375 )
									ret := 0.576923
								if( basis_max > 5.375 )
									ret := 0.909091 // buy
				if( kinjun_sen > 3498.04 )
					if( tenkan_sen <= 3494.05 )
						if( basis_minus <= -10.4537 )
							if( basis_max <= 12.8529 )
								if( basis_minus <= -17.065 )
									ret := 0.473684
								if( basis_minus > -17.065 )
									ret := -0.764706 // sell
							if( basis_max > 12.8529 )
								ret := 1.000000 // buy
						if( basis_minus > -10.4537 )
							if( basis_minus <= -0.725 )
								if( senkou_span_a_displaced <= 3512.2 )
									ret := 0.938272 // buy
								if( senkou_span_a_displaced > 3512.2 )
									ret := 0.333333
							if( basis_minus > -0.725 )
								ret := 0.500000
					if( tenkan_sen > 3494.05 )
						if( senkou_span_b_displaced <= 3499.08 )
							if( chinkou_span <= 3502.79 )
								if( senkou_span_b_displaced <= 3491.54 )
									ret := -0.181818
								if( senkou_span_b_displaced > 3491.54 )
									ret := 0.600000
							if( chinkou_span > 3502.79 )
								if( senkou_span_b_displaced <= 3494.97 )
									ret := 0.825688 // buy
								if( senkou_span_b_displaced > 3494.97 )
									ret := 0.291667
						if( senkou_span_b_displaced > 3499.08 )
							if( basis_max <= 7.53821 )
								if( basis_minus <= -7.35275 )
									ret := 0.466102
								if( basis_minus > -7.35275 )
									ret := -0.235000
							if( basis_max > 7.53821 )
								if( senkou_span_b_displaced <= 3547.55 )
									ret := -0.166667
								if( senkou_span_b_displaced > 3547.55 )
									ret := 0.916667 // buy
			if( tenkan_sen > 3502.13 )
				if( basis_max <= -22.295 )
					if( senkou_span_b_displaced <= 3338.58 )
						if( tenkan_sen <= 3622.71 )
							ret := -0.727273 // sell
						if( tenkan_sen > 3622.71 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 3338.58 )
						if( senkou_span_a <= 3694.74 )
							if( senkou_span_a <= 3592.25 )
								if( kinjun_sen <= 3508.82 )
									ret := 0.977778 // buy
								if( kinjun_sen > 3508.82 )
									ret := 0.400000
							if( senkou_span_a > 3592.25 )
								if( senkou_span_a <= 3611.95 )
									ret := 0.900000 // buy
								if( senkou_span_a > 3611.95 )
									ret := 1.000000 // buy
						if( senkou_span_a > 3694.74 )
							if( senkou_span_b_displaced <= 3762.26 )
								if( chinkou_span <= 3813.81 )
									ret := -1.000000 // sell
								if( chinkou_span > 3813.81 )
									ret := 0.631579
							if( senkou_span_b_displaced > 3762.26 )
								if( basis_max <= -24.1907 )
									ret := 0.674699
								if( basis_max > -24.1907 )
									ret := -0.058824
				if( basis_max > -22.295 )
					if( senkou_span_b <= 3634.23 )
						if( senkou_span_a_displaced <= 3601.3 )
							if( chinkou_span <= 3525.65 )
								if( basis_max <= -0.76548 )
									ret := -0.495215
								if( basis_max > -0.76548 )
									ret := -0.192005
							if( chinkou_span > 3525.65 )
								if( senkou_span_b_displaced <= 3555.93 )
									ret := 0.209294
								if( senkou_span_b_displaced > 3555.93 )
									ret := 0.024674
						if( senkou_span_a_displaced > 3601.3 )
							if( senkou_span_a_displaced <= 3666.57 )
								if( senkou_span_b <= 3560.89 )
									ret := 0.690476
								if( senkou_span_b > 3560.89 )
									ret := -0.315653
							if( senkou_span_a_displaced > 3666.57 )
								if( basis_max <= 10.4127 )
									ret := 0.769231 // buy
								if( basis_max > 10.4127 )
									ret := 0.960000 // buy
					if( senkou_span_b > 3634.23 )
						if( senkou_span_a <= 3683.45 )
							if( chinkou_span <= 3636.94 )
								if( tenkan_sen <= 3637.72 )
									ret := 0.230769
								if( tenkan_sen > 3637.72 )
									ret := -0.500000
							if( chinkou_span > 3636.94 )
								if( senkou_span_a <= 3655.15 )
									ret := 0.667897
								if( senkou_span_a > 3655.15 )
									ret := 0.277657
						if( senkou_span_a > 3683.45 )
							if( basis_minus <= 4.58293 )
								if( senkou_span_b <= 3762.78 )
									ret := 0.154098
								if( senkou_span_b > 3762.78 )
									ret := -0.016770
							if( basis_minus > 4.58293 )
								if( chinkou_span <= 3770.88 )
									ret := -0.371179
								if( chinkou_span > 3770.88 )
									ret := -0.014651
	
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
float op_operation = decision_tree_0_ETHUSDT_5Min_569f0724(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


