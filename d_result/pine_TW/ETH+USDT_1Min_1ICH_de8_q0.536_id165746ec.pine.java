//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ETHUSDT_1Min_1ICH_165746ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Min_1ICH_165746ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Min_165746ec(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 1.35003 )
		if( basis_minus <= 33.805 )
			if( basis_minus <= -5.41984 )
				if( chinkou_span <= 2572.93 )
					if( senkou_span_a_displaced <= 2588.42 )
						if( kinjun_sen <= 2218.02 )
							if( senkou_span_a_displaced <= 2215.71 )
								ret := 0.000000
							if( senkou_span_a_displaced > 2215.71 )
								if( senkou_span_b_displaced <= 2294.81 )
									ret := -0.954545 // sell
								if( senkou_span_b_displaced > 2294.81 )
									ret := -0.500000
						if( kinjun_sen > 2218.02 )
							if( tenkan_sen <= 2455.29 )
								if( chinkou_span <= 2426.08 )
									ret := 0.014851
								if( chinkou_span > 2426.08 )
									ret := 0.308642
							if( tenkan_sen > 2455.29 )
								if( senkou_span_a <= 2488.37 )
									ret := -0.322222
								if( senkou_span_a > 2488.37 )
									ret := 0.039267
					if( senkou_span_a_displaced > 2588.42 )
						if( senkou_span_a_displaced <= 2614.81 )
							if( senkou_span_a_displaced <= 2596.12 )
								if( kinjun_sen <= 2576.49 )
									ret := -1.000000 // sell
								if( kinjun_sen > 2576.49 )
									ret := -0.500000
							if( senkou_span_a_displaced > 2596.12 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 2614.81 )
							ret := -0.500000
				if( chinkou_span > 2572.93 )
					if( kinjun_sen <= 2650.48 )
						if( chinkou_span <= 2656.32 )
							if( senkou_span_b_displaced <= 2590.29 )
								if( senkou_span_a <= 2581.43 )
									ret := 0.715232 // buy
								if( senkou_span_a > 2581.43 )
									ret := -0.400000
							if( senkou_span_b_displaced > 2590.29 )
								if( chinkou_span <= 2605.54 )
									ret := 0.091216
								if( chinkou_span > 2605.54 )
									ret := 0.369697
						if( chinkou_span > 2656.32 )
							if( senkou_span_a_displaced <= 2653.91 )
								if( basis_minus <= -6.17484 )
									ret := 0.846154 // buy
								if( basis_minus > -6.17484 )
									ret := 0.000000
							if( senkou_span_a_displaced > 2653.91 )
								if( senkou_span_b_displaced <= 2682.61 )
									ret := 0.978723 // buy
								if( senkou_span_b_displaced > 2682.61 )
									ret := 0.500000
					if( kinjun_sen > 2650.48 )
						if( chinkou_span <= 2663.35 )
							if( basis_max <= 0.35904 )
								if( basis_max <= 0.054062 )
									ret := -0.927536 // sell
								if( basis_max > 0.054062 )
									ret := -0.621622
							if( basis_max > 0.35904 )
								if( senkou_span_b <= 2684.77 )
									ret := -0.028302
								if( senkou_span_b > 2684.77 )
									ret := -0.916667 // sell
						if( chinkou_span > 2663.35 )
							if( senkou_span_a <= 3105.07 )
								if( chinkou_span <= 3079.1 )
									ret := 0.133144
								if( chinkou_span > 3079.1 )
									ret := 0.610909
							if( senkou_span_a > 3105.07 )
								if( tenkan_sen <= 3137.23 )
									ret := -0.206294
								if( tenkan_sen > 3137.23 )
									ret := 0.078029
			if( basis_minus > -5.41984 )
				if( tenkan_sen <= 3937.62 )
					if( kinjun_sen <= 2214.95 )
						if( senkou_span_b_displaced <= 2182.35 )
							if( basis_max <= -1.935 )
								if( tenkan_sen <= 2211.22 )
									ret := 0.000000
								if( tenkan_sen > 2211.22 )
									ret := -0.666667
							if( basis_max > -1.935 )
								ret := 0.800000 // buy
						if( senkou_span_b_displaced > 2182.35 )
							if( senkou_span_a_displaced <= 2176.47 )
								ret := 0.000000
							if( senkou_span_a_displaced > 2176.47 )
								if( senkou_span_a_displaced <= 2218.62 )
									ret := 0.744681 // buy
								if( senkou_span_a_displaced > 2218.62 )
									ret := 0.142857
					if( kinjun_sen > 2214.95 )
						if( chinkou_span <= 2227.16 )
							if( senkou_span_a <= 2228.3 )
								if( senkou_span_b_displaced <= 2226.56 )
									ret := -0.435897
								if( senkou_span_b_displaced > 2226.56 )
									ret := 0.384615
							if( senkou_span_a > 2228.3 )
								if( senkou_span_a <= 2229.73 )
									ret := -0.714286 // sell
								if( senkou_span_a > 2229.73 )
									ret := -0.932432 // sell
						if( chinkou_span > 2227.16 )
							if( senkou_span_a_displaced <= 2234.37 )
								if( senkou_span_b_displaced <= 2237.22 )
									ret := 0.345528
								if( senkou_span_b_displaced > 2237.22 )
									ret := 0.882353 // buy
							if( senkou_span_a_displaced > 2234.37 )
								if( basis_max <= -1.14872 )
									ret := 0.013383
								if( basis_max > -1.14872 )
									ret := 0.038166
				if( tenkan_sen > 3937.62 )
					if( basis_minus <= 10.42 )
						if( senkou_span_a_displaced <= 3939.23 )
							if( basis_minus <= 9.59253 )
								if( basis_minus <= 6.94803 )
									ret := -0.424242
								if( basis_minus > 6.94803 )
									ret := -0.750000 // sell
							if( basis_minus > 9.59253 )
								if( senkou_span_b_displaced <= 3924.18 )
									ret := -0.400000
								if( senkou_span_b_displaced > 3924.18 )
									ret := 0.200000
						if( senkou_span_a_displaced > 3939.23 )
							if( senkou_span_a_displaced <= 3942.68 )
								if( basis_max <= -0.140142 )
									ret := 0.700000 // buy
								if( basis_max > -0.140142 )
									ret := 0.142857
							if( senkou_span_a_displaced > 3942.68 )
								if( chinkou_span <= 3965.91 )
									ret := -0.086957
								if( chinkou_span > 3965.91 )
									ret := -0.600000
					if( basis_minus > 10.42 )
						if( basis_max <= -0.041597 )
							if( basis_minus <= 10.9038 )
								if( basis_minus <= 10.6995 )
									ret := -1.000000 // sell
								if( basis_minus > 10.6995 )
									ret := -0.250000
							if( basis_minus > 10.9038 )
								if( chinkou_span <= 3958.07 )
									ret := -1.000000 // sell
								if( chinkou_span > 3958.07 )
									ret := -0.750000 // sell
						if( basis_max > -0.041597 )
							ret := 0.000000
		if( basis_minus > 33.805 )
			if( basis_minus <= 44.7575 )
				if( senkou_span_a_displaced <= 2221.87 )
					ret := 1.000000 // buy
				if( senkou_span_a_displaced > 2221.87 )
					if( basis_max <= -13.9738 )
						if( chinkou_span <= 2538.53 )
							ret := -1.000000 // sell
						if( chinkou_span > 2538.53 )
							ret := 0.000000
					if( basis_max > -13.9738 )
						if( senkou_span_b_displaced <= 2231.59 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 2231.59 )
							if( chinkou_span <= 2345.05 )
								ret := -1.000000 // sell
							if( chinkou_span > 2345.05 )
								if( senkou_span_b_displaced <= 2966.96 )
									ret := 0.727273 // buy
								if( senkou_span_b_displaced > 2966.96 )
									ret := 0.376068
			if( basis_minus > 44.7575 )
				if( senkou_span_b <= 3299.85 )
					if( senkou_span_a_displaced <= 3146.36 )
						if( senkou_span_a_displaced <= 2293.37 )
							if( chinkou_span <= 2357.68 )
								if( senkou_span_a_displaced <= 2241.36 )
									ret := 0.454545
								if( senkou_span_a_displaced > 2241.36 )
									ret := 1.000000 // buy
							if( chinkou_span > 2357.68 )
								if( basis_max <= -10.2008 )
									ret := -0.023810
								if( basis_max > -10.2008 )
									ret := 1.000000 // buy
						if( senkou_span_a_displaced > 2293.37 )
							if( senkou_span_b <= 2402.11 )
								if( basis_minus <= 46.3929 )
									ret := -0.500000
								if( basis_minus > 46.3929 )
									ret := -0.960000 // sell
							if( senkou_span_b > 2402.11 )
								if( chinkou_span <= 3438.41 )
									ret := 0.588235
								if( chinkou_span > 3438.41 )
									ret := -1.000000 // sell
					if( senkou_span_a_displaced > 3146.36 )
						if( basis_max <= -58.3758 )
							if( senkou_span_a_displaced <= 3146.38 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 3146.38 )
								ret := 0.000000
						if( basis_max > -58.3758 )
							if( tenkan_sen <= 3428.17 )
								if( chinkou_span <= 3427.2 )
									ret := 0.818182 // buy
								if( chinkou_span > 3427.2 )
									ret := 1.000000 // buy
							if( tenkan_sen > 3428.17 )
								if( senkou_span_a_displaced <= 3315.55 )
									ret := 0.250000
								if( senkou_span_a_displaced > 3315.55 )
									ret := 1.000000 // buy
				if( senkou_span_b > 3299.85 )
					if( senkou_span_a_displaced <= 3665.43 )
						if( tenkan_sen <= 3441.75 )
							if( senkou_span_b_displaced <= 3289.87 )
								if( senkou_span_a <= 3428.22 )
									ret := -0.500000
								if( senkou_span_a > 3428.22 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 3289.87 )
								if( senkou_span_b <= 3345.25 )
									ret := 0.625000
								if( senkou_span_b > 3345.25 )
									ret := -0.857143 // sell
						if( tenkan_sen > 3441.75 )
							if( senkou_span_b <= 3654.62 )
								if( chinkou_span <= 3808.53 )
									ret := -0.974359 // sell
								if( chinkou_span > 3808.53 )
									ret := -0.500000
							if( senkou_span_b > 3654.62 )
								if( basis_max <= -14.1385 )
									ret := -0.750000 // sell
								if( basis_max > -14.1385 )
									ret := 0.600000
					if( senkou_span_a_displaced > 3665.43 )
						if( chinkou_span <= 3814.72 )
							ret := 0.000000
						if( chinkou_span > 3814.72 )
							ret := 1.000000 // buy
	if( basis_max > 1.35003 )
		if( senkou_span_b <= 2450.07 )
			if( chinkou_span <= 2348.25 )
				if( senkou_span_a <= 2347.31 )
					if( senkou_span_b <= 2284.29 )
						if( senkou_span_b <= 2238.85 )
							if( senkou_span_a_displaced <= 2238.61 )
								if( senkou_span_b_displaced <= 2223.82 )
									ret := 0.811321 // buy
								if( senkou_span_b_displaced > 2223.82 )
									ret := 0.067961
							if( senkou_span_a_displaced > 2238.61 )
								if( chinkou_span <= 2232.55 )
									ret := 0.000000
								if( chinkou_span > 2232.55 )
									ret := -0.898305 // sell
						if( senkou_span_b > 2238.85 )
							if( kinjun_sen <= 2264.13 )
								if( senkou_span_b_displaced <= 2316.62 )
									ret := 0.810811 // buy
								if( senkou_span_b_displaced > 2316.62 )
									ret := -0.285714
							if( kinjun_sen > 2264.13 )
								if( chinkou_span <= 2270.58 )
									ret := -0.078740
								if( chinkou_span > 2270.58 )
									ret := 0.589372
					if( senkou_span_b > 2284.29 )
						if( senkou_span_a_displaced <= 2343.31 )
							if( chinkou_span <= 2301.01 )
								if( kinjun_sen <= 2303.48 )
									ret := -0.105735
								if( kinjun_sen > 2303.48 )
									ret := -0.670103
							if( chinkou_span > 2301.01 )
								if( senkou_span_b <= 2337.84 )
									ret := 0.327089
								if( senkou_span_b > 2337.84 )
									ret := -0.507812
						if( senkou_span_a_displaced > 2343.31 )
							if( senkou_span_b <= 2342.9 )
								if( senkou_span_b_displaced <= 2354 )
									ret := 0.693122
								if( senkou_span_b_displaced > 2354 )
									ret := -1.000000 // sell
							if( senkou_span_b > 2342.9 )
								if( basis_max <= 1.67882 )
									ret := 0.453125
								if( basis_max > 1.67882 )
									ret := 0.038961
				if( senkou_span_a > 2347.31 )
					if( senkou_span_b_displaced <= 2382.3 )
						if( senkou_span_b <= 2371.97 )
							if( senkou_span_a_displaced <= 2378.06 )
								if( basis_max <= 5.2575 )
									ret := -0.623431
								if( basis_max > 5.2575 )
									ret := 0.150000
							if( senkou_span_a_displaced > 2378.06 )
								ret := 1.000000 // buy
						if( senkou_span_b > 2371.97 )
							if( basis_minus <= -5.35368 )
								ret := 0.500000
							if( basis_minus > -5.35368 )
								ret := 1.000000 // buy
					if( senkou_span_b_displaced > 2382.3 )
						if( tenkan_sen <= 2364.09 )
							ret := -1.000000 // sell
						if( tenkan_sen > 2364.09 )
							if( tenkan_sen <= 2367.24 )
								if( tenkan_sen <= 2366.26 )
									ret := -0.533333
								if( tenkan_sen > 2366.26 )
									ret := 0.400000
							if( tenkan_sen > 2367.24 )
								if( kinjun_sen <= 2439.33 )
									ret := -0.960000 // sell
								if( kinjun_sen > 2439.33 )
									ret := -0.250000
			if( chinkou_span > 2348.25 )
				if( tenkan_sen <= 2340.35 )
					if( chinkou_span <= 2354.17 )
						if( tenkan_sen <= 2331.7 )
							if( basis_max <= 35.4681 )
								if( basis_minus <= -4.9897 )
									ret := 0.854839 // buy
								if( basis_minus > -4.9897 )
									ret := 0.230769
							if( basis_max > 35.4681 )
								ret := -0.250000
						if( tenkan_sen > 2331.7 )
							if( senkou_span_a <= 2337.3 )
								if( senkou_span_b <= 2341.89 )
									ret := -0.750000 // sell
								if( senkou_span_b > 2341.89 )
									ret := -1.000000 // sell
							if( senkou_span_a > 2337.3 )
								if( basis_minus <= -14.2885 )
									ret := 1.000000 // buy
								if( basis_minus > -14.2885 )
									ret := 0.047619
					if( chinkou_span > 2354.17 )
						if( senkou_span_a <= 2352.64 )
							if( senkou_span_b_displaced <= 2349.6 )
								if( basis_minus <= -6.7038 )
									ret := -0.500000
								if( basis_minus > -6.7038 )
									ret := 0.902778 // buy
							if( senkou_span_b_displaced > 2349.6 )
								if( kinjun_sen <= 2372 )
									ret := 1.000000 // buy
								if( kinjun_sen > 2372 )
									ret := 0.750000 // buy
						if( senkou_span_a > 2352.64 )
							if( senkou_span_a <= 2353.68 )
								ret := 0.250000
							if( senkou_span_a > 2353.68 )
								ret := 0.750000 // buy
				if( tenkan_sen > 2340.35 )
					if( chinkou_span <= 2447.48 )
						if( senkou_span_a <= 2438.6 )
							if( chinkou_span <= 2435.84 )
								if( senkou_span_b <= 2424.65 )
									ret := 0.276630
								if( senkou_span_b > 2424.65 )
									ret := -0.049123
							if( chinkou_span > 2435.84 )
								if( senkou_span_b <= 2435.38 )
									ret := 0.866667 // buy
								if( senkou_span_b > 2435.38 )
									ret := 0.620482
						if( senkou_span_a > 2438.6 )
							if( senkou_span_a_displaced <= 2459.03 )
								if( basis_minus <= 6.50431 )
									ret := -0.252747
								if( basis_minus > 6.50431 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 2459.03 )
								if( senkou_span_b_displaced <= 2462.59 )
									ret := 0.642857
								if( senkou_span_b_displaced > 2462.59 )
									ret := -0.750000 // sell
					if( chinkou_span > 2447.48 )
						if( basis_max <= 1.39631 )
							if( senkou_span_a <= 2449.17 )
								if( basis_max <= 1.3825 )
									ret := 1.000000 // buy
								if( basis_max > 1.3825 )
									ret := -0.600000
							if( senkou_span_a > 2449.17 )
								ret := -0.800000 // sell
						if( basis_max > 1.39631 )
							if( basis_minus <= -13.2144 )
								if( basis_max <= 3.15165 )
									ret := -0.888889 // sell
								if( basis_max > 3.15165 )
									ret := 0.781250 // buy
							if( basis_minus > -13.2144 )
								if( basis_minus <= -1.08958 )
									ret := 0.888889 // buy
								if( basis_minus > -1.08958 )
									ret := 0.704545 // buy
		if( senkou_span_b > 2450.07 )
			if( chinkou_span <= 2494.79 )
				if( senkou_span_b <= 2496.17 )
					if( chinkou_span <= 2443.59 )
						if( senkou_span_a <= 2472.2 )
							if( basis_max <= 5.56 )
								if( senkou_span_b <= 2478.36 )
									ret := -0.522727
								if( senkou_span_b > 2478.36 )
									ret := 0.533333
							if( basis_max > 5.56 )
								if( senkou_span_b_displaced <= 2468.6 )
									ret := 0.777778 // buy
								if( senkou_span_b_displaced > 2468.6 )
									ret := -0.617647
						if( senkou_span_a > 2472.2 )
							if( kinjun_sen <= 2485.79 )
								if( kinjun_sen <= 2477.01 )
									ret := -0.750000 // sell
								if( kinjun_sen > 2477.01 )
									ret := -1.000000 // sell
							if( kinjun_sen > 2485.79 )
								if( basis_max <= 4.01215 )
									ret := -0.500000
								if( basis_max > 4.01215 )
									ret := -1.000000 // sell
					if( chinkou_span > 2443.59 )
						if( senkou_span_a <= 2459.08 )
							if( chinkou_span <= 2452.12 )
								if( kinjun_sen <= 2460.66 )
									ret := -0.144981
								if( kinjun_sen > 2460.66 )
									ret := 0.935484 // buy
							if( chinkou_span > 2452.12 )
								if( kinjun_sen <= 2462.71 )
									ret := 0.421652
								if( kinjun_sen > 2462.71 )
									ret := -1.000000 // sell
						if( senkou_span_a > 2459.08 )
							if( chinkou_span <= 2475.41 )
								if( tenkan_sen <= 2470.83 )
									ret := -0.128492
								if( tenkan_sen > 2470.83 )
									ret := -0.601423
							if( chinkou_span > 2475.41 )
								if( basis_minus <= -4.39124 )
									ret := 0.697987
								if( basis_minus > -4.39124 )
									ret := -0.090226
				if( senkou_span_b > 2496.17 )
					if( tenkan_sen <= 2493.85 )
						if( chinkou_span <= 2485.22 )
							if( senkou_span_b_displaced <= 2564.4 )
								if( senkou_span_a <= 2495.85 )
									ret := -0.768116 // sell
								if( senkou_span_a > 2495.85 )
									ret := 0.000000
							if( senkou_span_b_displaced > 2564.4 )
								if( basis_minus <= -17.6013 )
									ret := -0.714286 // sell
								if( basis_minus > -17.6013 )
									ret := 0.956522 // buy
						if( chinkou_span > 2485.22 )
							if( senkou_span_b_displaced <= 2508.36 )
								if( senkou_span_b <= 2503.92 )
									ret := -0.240000
								if( senkou_span_b > 2503.92 )
									ret := 0.888889 // buy
							if( senkou_span_b_displaced > 2508.36 )
								if( senkou_span_a <= 2493.74 )
									ret := 1.000000 // buy
								if( senkou_span_a > 2493.74 )
									ret := 0.636364
					if( tenkan_sen > 2493.85 )
						if( tenkan_sen <= 2624.3 )
							if( chinkou_span <= 2479.98 )
								if( tenkan_sen <= 2553.48 )
									ret := -0.931677 // sell
								if( tenkan_sen > 2553.48 )
									ret := -0.705882 // sell
							if( chinkou_span > 2479.98 )
								if( basis_max <= 5.5576 )
									ret := -0.623967
								if( basis_max > 5.5576 )
									ret := 0.400000
						if( tenkan_sen > 2624.3 )
							ret := 0.750000 // buy
			if( chinkou_span > 2494.79 )
				if( kinjun_sen <= 2508.48 )
					if( senkou_span_b_displaced <= 2483.29 )
						if( basis_max <= 1.7675 )
							if( senkou_span_b_displaced <= 2454.15 )
								ret := -0.250000
							if( senkou_span_b_displaced > 2454.15 )
								if( chinkou_span <= 2499.39 )
									ret := 1.000000 // buy
								if( chinkou_span > 2499.39 )
									ret := 0.500000
						if( basis_max > 1.7675 )
							if( basis_max <= 4.54589 )
								ret := -1.000000 // sell
							if( basis_max > 4.54589 )
								if( tenkan_sen <= 2486.05 )
									ret := 0.500000
								if( tenkan_sen > 2486.05 )
									ret := -0.571429
					if( senkou_span_b_displaced > 2483.29 )
						if( chinkou_span <= 2505.16 )
							if( tenkan_sen <= 2500.32 )
								if( chinkou_span <= 2501.1 )
									ret := 0.627907
								if( chinkou_span > 2501.1 )
									ret := 0.114286
							if( tenkan_sen > 2500.32 )
								ret := -0.833333 // sell
						if( chinkou_span > 2505.16 )
							if( tenkan_sen <= 2504.77 )
								if( basis_max <= 1.94177 )
									ret := 0.685714
								if( basis_max > 1.94177 )
									ret := 0.917808 // buy
							if( tenkan_sen > 2504.77 )
								ret := 0.000000
				if( kinjun_sen > 2508.48 )
					if( chinkou_span <= 2525.82 )
						if( kinjun_sen <= 2530.91 )
							if( senkou_span_a <= 2512.43 )
								if( basis_max <= 2.13125 )
									ret := 0.013333
								if( basis_max > 2.13125 )
									ret := -0.485714
							if( senkou_span_a > 2512.43 )
								if( tenkan_sen <= 2511.51 )
									ret := 0.684211
								if( tenkan_sen > 2511.51 )
									ret := 0.029197
						if( kinjun_sen > 2530.91 )
							if( basis_minus <= -10.9112 )
								if( senkou_span_a_displaced <= 2554.07 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 2554.07 )
									ret := -1.000000 // sell
							if( basis_minus > -10.9112 )
								if( kinjun_sen <= 2540.27 )
									ret := -0.618056
								if( kinjun_sen > 2540.27 )
									ret := -0.175824
					if( chinkou_span > 2525.82 )
						if( senkou_span_a <= 2566.4 )
							if( basis_max <= 2.68377 )
								if( chinkou_span <= 2547.03 )
									ret := 0.061364
								if( chinkou_span > 2547.03 )
									ret := 0.522659
							if( basis_max > 2.68377 )
								if( basis_minus <= -15.6457 )
									ret := 0.113208
								if( basis_minus > -15.6457 )
									ret := 0.667396
						if( senkou_span_a > 2566.4 )
							if( kinjun_sen <= 2660.04 )
								if( senkou_span_b <= 2644.05 )
									ret := 0.100821
								if( senkou_span_b > 2644.05 )
									ret := 0.380208
							if( kinjun_sen > 2660.04 )
								if( basis_max <= 20.7125 )
									ret := 0.078504
								if( basis_max > 20.7125 )
									ret := 0.816667 // buy
	
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
float op_operation = decision_tree_0_ETHUSDT_1Min_165746ec(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


