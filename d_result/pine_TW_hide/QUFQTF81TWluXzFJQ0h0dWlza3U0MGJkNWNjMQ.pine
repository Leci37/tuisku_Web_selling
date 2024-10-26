//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AAPL_5Min_1ICH_40bd5cc1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1ICH_40bd5cc1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_40bd5cc1(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 171.367 )
		if( tenkan_sen <= 171.042 )
			if( chinkou_span <= 170.065 )
				if( senkou_span_a <= 169.095 )
					if( basis_max <= 0.717981 )
						if( chinkou_span <= 169.032 )
							if( basis_minus <= -1.43594 )
								if( senkou_span_b <= 168.649 )
									ret := 0.898551 // buy
								if( senkou_span_b > 168.649 )
									ret := -0.187500
							if( basis_minus > -1.43594 )
								if( basis_minus <= 0.368329 )
									ret := 0.073930
								if( basis_minus > 0.368329 )
									ret := -0.168932
						if( chinkou_span > 169.032 )
							if( tenkan_sen <= 168.875 )
								if( kinjun_sen <= 168.614 )
									ret := 0.453125
								if( kinjun_sen > 168.614 )
									ret := 0.740000 // buy
							if( tenkan_sen > 168.875 )
								if( senkou_span_b <= 170.505 )
									ret := 0.234043
								if( senkou_span_b > 170.505 )
									ret := 1.000000 // buy
					if( basis_max > 0.717981 )
						if( chinkou_span <= 165.34 )
							ret := -1.000000 // sell
						if( chinkou_span > 165.34 )
							if( senkou_span_a_displaced <= 170.17 )
								ret := 0.000000
							if( senkou_span_a_displaced > 170.17 )
								ret := -1.000000 // sell
				if( senkou_span_a > 169.095 )
					if( chinkou_span <= 168.996 )
						if( tenkan_sen <= 169.987 )
							if( tenkan_sen <= 169.947 )
								if( senkou_span_a_displaced <= 169.669 )
									ret := -0.368984
								if( senkou_span_a_displaced > 169.669 )
									ret := -0.703297 // sell
							if( tenkan_sen > 169.947 )
								if( basis_minus <= 0.055333 )
									ret := 0.714286 // buy
								if( basis_minus > 0.055333 )
									ret := -0.500000
						if( tenkan_sen > 169.987 )
							if( senkou_span_b_displaced <= 170.816 )
								if( senkou_span_b <= 169.665 )
									ret := -0.181818
								if( senkou_span_b > 169.665 )
									ret := -0.760563 // sell
							if( senkou_span_b_displaced > 170.816 )
								ret := 0.250000
					if( chinkou_span > 168.996 )
						if( senkou_span_b_displaced <= 170.856 )
							if( basis_minus <= 0.266404 )
								if( tenkan_sen <= 170.526 )
									ret := 0.047009
								if( tenkan_sen > 170.526 )
									ret := 0.577465
							if( basis_minus > 0.266404 )
								if( tenkan_sen <= 169.835 )
									ret := -0.222222
								if( tenkan_sen > 169.835 )
									ret := -0.511111
						if( senkou_span_b_displaced > 170.856 )
							if( tenkan_sen <= 169.161 )
								if( kinjun_sen <= 170.514 )
									ret := -0.500000
								if( kinjun_sen > 170.514 )
									ret := 0.954545 // buy
							if( tenkan_sen > 169.161 )
								if( kinjun_sen <= 170.746 )
									ret := -0.290816
								if( kinjun_sen > 170.746 )
									ret := -0.796610 // sell
			if( chinkou_span > 170.065 )
				if( basis_minus <= -0.00178 )
					if( senkou_span_b_displaced <= 169.948 )
						if( senkou_span_b_displaced <= 168.911 )
							if( senkou_span_a <= 169.215 )
								ret := 0.000000
							if( senkou_span_a > 169.215 )
								ret := -0.800000 // sell
						if( senkou_span_b_displaced > 168.911 )
							if( basis_max <= 0.064534 )
								if( senkou_span_a_displaced <= 169.537 )
									ret := 0.795455 // buy
								if( senkou_span_a_displaced > 169.537 )
									ret := 0.386667
							if( basis_max > 0.064534 )
								if( basis_max <= 0.114262 )
									ret := 1.000000 // buy
								if( basis_max > 0.114262 )
									ret := 0.736842 // buy
					if( senkou_span_b_displaced > 169.948 )
						if( senkou_span_a_displaced <= 170.023 )
							if( senkou_span_b_displaced <= 170.19 )
								if( senkou_span_b <= 169.486 )
									ret := 0.250000
								if( senkou_span_b > 169.486 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 170.19 )
								if( basis_minus <= -0.0943 )
									ret := 0.000000
								if( basis_minus > -0.0943 )
									ret := 0.750000 // buy
						if( senkou_span_a_displaced > 170.023 )
							if( tenkan_sen <= 170.414 )
								if( chinkou_span <= 170.492 )
									ret := 0.212500
								if( chinkou_span > 170.492 )
									ret := 0.569507
							if( tenkan_sen > 170.414 )
								if( basis_max <= 0.297488 )
									ret := -0.012739
								if( basis_max > 0.297488 )
									ret := 0.454545
				if( basis_minus > -0.00178 )
					if( senkou_span_b <= 168.915 )
						if( basis_max <= 0.005319 )
							if( senkou_span_a <= 168.808 )
								if( chinkou_span <= 170.207 )
									ret := -0.250000
								if( chinkou_span > 170.207 )
									ret := 0.000000
							if( senkou_span_a > 168.808 )
								if( tenkan_sen <= 169.199 )
									ret := -0.888889 // sell
								if( tenkan_sen > 169.199 )
									ret := -0.571429
						if( basis_max > 0.005319 )
							if( basis_max <= 0.02625 )
								ret := 0.750000 // buy
							if( basis_max > 0.02625 )
								ret := 0.000000
					if( senkou_span_b > 168.915 )
						if( kinjun_sen <= 169.626 )
							if( senkou_span_a <= 169.278 )
								if( senkou_span_a_displaced <= 168.825 )
									ret := -0.666667
								if( senkou_span_a_displaced > 168.825 )
									ret := 0.348837
							if( senkou_span_a > 169.278 )
								if( senkou_span_b_displaced <= 169.963 )
									ret := 0.660550
								if( senkou_span_b_displaced > 169.963 )
									ret := -0.500000
						if( kinjun_sen > 169.626 )
							if( tenkan_sen <= 170.025 )
								if( senkou_span_b_displaced <= 170.005 )
									ret := -0.365854
								if( senkou_span_b_displaced > 170.005 )
									ret := 0.333333
							if( tenkan_sen > 170.025 )
								if( senkou_span_b <= 170.068 )
									ret := 0.227979
								if( senkou_span_b > 170.068 )
									ret := -0.072650
		if( tenkan_sen > 171.042 )
			if( chinkou_span <= 171.013 )
				if( tenkan_sen <= 171.636 )
					if( senkou_span_a_displaced <= 171.962 )
						if( chinkou_span <= 170.849 )
							if( chinkou_span <= 169.877 )
								if( tenkan_sen <= 171.111 )
									ret := 0.000000
								if( tenkan_sen > 171.111 )
									ret := -0.896104 // sell
							if( chinkou_span > 169.877 )
								if( senkou_span_a <= 171.044 )
									ret := -0.933333 // sell
								if( senkou_span_a > 171.044 )
									ret := -0.391304
						if( chinkou_span > 170.849 )
							if( senkou_span_b_displaced <= 170.852 )
								if( tenkan_sen <= 171.472 )
									ret := -0.080000
								if( tenkan_sen > 171.472 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 170.852 )
								if( tenkan_sen <= 171.577 )
									ret := 0.222222
								if( tenkan_sen > 171.577 )
									ret := -0.500000
					if( senkou_span_a_displaced > 171.962 )
						if( kinjun_sen <= 171.574 )
							if( basis_minus <= -0.510677 )
								ret := 0.000000
							if( basis_minus > -0.510677 )
								if( senkou_span_b_displaced <= 172.146 )
									ret := 0.769231 // buy
								if( senkou_span_b_displaced > 172.146 )
									ret := 0.333333
						if( kinjun_sen > 171.574 )
							if( chinkou_span <= 169.828 )
								ret := -1.000000 // sell
							if( chinkou_span > 169.828 )
								if( senkou_span_a <= 171.865 )
									ret := -0.066667
								if( senkou_span_a > 171.865 )
									ret := -1.000000 // sell
				if( tenkan_sen > 171.636 )
					if( chinkou_span <= 168.951 )
						ret := 1.000000 // buy
					if( chinkou_span > 168.951 )
						if( tenkan_sen <= 173.622 )
							if( senkou_span_b <= 172.241 )
								if( senkou_span_b_displaced <= 172.211 )
									ret := -0.707143 // sell
								if( senkou_span_b_displaced > 172.211 )
									ret := 0.066667
							if( senkou_span_b > 172.241 )
								if( tenkan_sen <= 172.547 )
									ret := -0.897727 // sell
								if( tenkan_sen > 172.547 )
									ret := -0.750000 // sell
						if( tenkan_sen > 173.622 )
							if( senkou_span_a_displaced <= 173.865 )
								ret := 0.250000
							if( senkou_span_a_displaced > 173.865 )
								ret := 0.000000
			if( chinkou_span > 171.013 )
				if( basis_max <= -0.20339 )
					if( tenkan_sen <= 171.357 )
						ret := 0.000000
					if( tenkan_sen > 171.357 )
						if( tenkan_sen <= 171.745 )
							ret := -0.750000 // sell
						if( tenkan_sen > 171.745 )
							ret := -1.000000 // sell
				if( basis_max > -0.20339 )
					if( senkou_span_a <= 171.079 )
						if( tenkan_sen <= 171.086 )
							if( kinjun_sen <= 170.869 )
								ret := 0.000000
							if( kinjun_sen > 170.869 )
								ret := -0.285714
						if( tenkan_sen > 171.086 )
							if( chinkou_span <= 171.28 )
								if( chinkou_span <= 171.209 )
									ret := 1.000000 // buy
								if( chinkou_span > 171.209 )
									ret := 0.750000 // buy
							if( chinkou_span > 171.28 )
								ret := 0.000000
					if( senkou_span_a > 171.079 )
						if( basis_minus <= 0.813849 )
							if( basis_minus <= 0.29375 )
								if( basis_minus <= -0.482411 )
									ret := -0.440367
								if( basis_minus > -0.482411 )
									ret := -0.022059
							if( basis_minus > 0.29375 )
								if( senkou_span_a <= 171.855 )
									ret := -0.682540
								if( senkou_span_a > 171.855 )
									ret := -0.214286
						if( basis_minus > 0.813849 )
							if( basis_minus <= 1.13014 )
								ret := 1.000000 // buy
							if( basis_minus > 1.13014 )
								ret := -0.250000
	if( chinkou_span > 171.367 )
		if( senkou_span_a <= 171.798 )
			if( chinkou_span <= 172.077 )
				if( basis_max <= -2.4e-05 )
					if( kinjun_sen <= 170.728 )
						if( tenkan_sen <= 170.384 )
							if( senkou_span_b_displaced <= 169.61 )
								if( senkou_span_a_displaced <= 169.798 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 169.798 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 169.61 )
								if( kinjun_sen <= 169.2 )
									ret := 0.857143 // buy
								if( kinjun_sen > 169.2 )
									ret := 0.050000
						if( tenkan_sen > 170.384 )
							if( basis_minus <= 0.2249 )
								if( tenkan_sen <= 170.628 )
									ret := 0.763158 // buy
								if( tenkan_sen > 170.628 )
									ret := 0.230769
							if( basis_minus > 0.2249 )
								if( chinkou_span <= 171.44 )
									ret := 0.500000
								if( chinkou_span > 171.44 )
									ret := 0.925000 // buy
					if( kinjun_sen > 170.728 )
						if( senkou_span_b_displaced <= 171.845 )
							if( tenkan_sen <= 171.84 )
								if( chinkou_span <= 172.037 )
									ret := -0.400000
								if( chinkou_span > 172.037 )
									ret := 0.238095
							if( tenkan_sen > 171.84 )
								if( kinjun_sen <= 171.679 )
									ret := 0.739130 // buy
								if( kinjun_sen > 171.679 )
									ret := -1.000000 // sell
						if( senkou_span_b_displaced > 171.845 )
							if( senkou_span_b_displaced <= 171.965 )
								if( senkou_span_b <= 171.504 )
									ret := 0.931034 // buy
								if( senkou_span_b > 171.504 )
									ret := -0.181818
							if( senkou_span_b_displaced > 171.965 )
								if( senkou_span_a_displaced <= 171.54 )
									ret := -0.260870
								if( senkou_span_a_displaced > 171.54 )
									ret := 0.486486
				if( basis_max > -2.4e-05 )
					if( senkou_span_a <= 169.405 )
						if( senkou_span_a_displaced <= 169.994 )
							ret := 0.000000
						if( senkou_span_a_displaced > 169.994 )
							if( basis_max <= 0.122117 )
								ret := -0.750000 // sell
							if( basis_max > 0.122117 )
								ret := -1.000000 // sell
					if( senkou_span_a > 169.405 )
						if( senkou_span_b <= 170.107 )
							if( basis_minus <= -0.098683 )
								ret := 0.000000
							if( basis_minus > -0.098683 )
								if( basis_max <= 0.011101 )
									ret := 0.875000 // buy
								if( basis_max > 0.011101 )
									ret := 1.000000 // buy
						if( senkou_span_b > 170.107 )
							if( senkou_span_a_displaced <= 170.823 )
								if( basis_max <= 0.008485 )
									ret := 0.000000
								if( basis_max > 0.008485 )
									ret := -0.875000 // sell
							if( senkou_span_a_displaced > 170.823 )
								if( senkou_span_a <= 171.628 )
									ret := 0.342593
								if( senkou_span_a > 171.628 )
									ret := 0.745455 // buy
			if( chinkou_span > 172.077 )
				if( basis_max <= -0.065442 )
					if( tenkan_sen <= 171.361 )
						if( basis_max <= -0.175179 )
							if( basis_max <= -0.266227 )
								ret := 0.750000 // buy
							if( basis_max > -0.266227 )
								if( senkou_span_b <= 168.651 )
									ret := 0.916667 // buy
								if( senkou_span_b > 168.651 )
									ret := 1.000000 // buy
						if( basis_max > -0.175179 )
							if( tenkan_sen <= 170.608 )
								if( kinjun_sen <= 169.055 )
									ret := 1.000000 // buy
								if( kinjun_sen > 169.055 )
									ret := 0.333333
							if( tenkan_sen > 170.608 )
								if( senkou_span_a_displaced <= 171.219 )
									ret := 0.957447 // buy
								if( senkou_span_a_displaced > 171.219 )
									ret := 0.833333 // buy
					if( tenkan_sen > 171.361 )
						if( basis_max <= -0.418876 )
							if( senkou_span_b <= 170.697 )
								if( basis_max <= -0.483427 )
									ret := 0.500000
								if( basis_max > -0.483427 )
									ret := 1.000000 // buy
							if( senkou_span_b > 170.697 )
								if( senkou_span_b <= 170.802 )
									ret := -0.714286 // sell
								if( senkou_span_b > 170.802 )
									ret := 0.266667
						if( basis_max > -0.418876 )
							if( senkou_span_b <= 171.562 )
								if( senkou_span_a_displaced <= 169.907 )
									ret := 0.942857 // buy
								if( senkou_span_a_displaced > 169.907 )
									ret := 0.595890
							if( senkou_span_b > 171.562 )
								if( chinkou_span <= 172.67 )
									ret := 1.000000 // buy
								if( chinkou_span > 172.67 )
									ret := 0.750000 // buy
				if( basis_max > -0.065442 )
					if( chinkou_span <= 172.66 )
						if( basis_minus <= 0.153125 )
							if( kinjun_sen <= 171.36 )
								if( basis_minus <= -0.310013 )
									ret := 0.461538
								if( basis_minus > -0.310013 )
									ret := 0.802139 // buy
							if( kinjun_sen > 171.36 )
								if( senkou_span_b <= 171.341 )
									ret := -0.642857
								if( senkou_span_b > 171.341 )
									ret := 0.504202
						if( basis_minus > 0.153125 )
							if( senkou_span_a_displaced <= 169.777 )
								ret := -0.800000 // sell
							if( senkou_span_a_displaced > 169.777 )
								if( kinjun_sen <= 170.879 )
									ret := 0.250000
								if( kinjun_sen > 170.879 )
									ret := 0.000000
					if( chinkou_span > 172.66 )
						if( senkou_span_b_displaced <= 169.383 )
							if( chinkou_span <= 173.11 )
								ret := -0.600000
							if( chinkou_span > 173.11 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 169.383 )
							if( senkou_span_a_displaced <= 171.802 )
								if( tenkan_sen <= 171.44 )
									ret := 0.291667
								if( tenkan_sen > 171.44 )
									ret := 0.789474 // buy
							if( senkou_span_a_displaced > 171.802 )
								if( senkou_span_a <= 171.734 )
									ret := -0.062500
								if( senkou_span_a > 171.734 )
									ret := -1.000000 // sell
		if( senkou_span_a > 171.798 )
			if( senkou_span_b <= 172.51 )
				if( senkou_span_a_displaced <= 172.175 )
					if( chinkou_span <= 172.659 )
						if( senkou_span_a <= 172.073 )
							if( senkou_span_a <= 171.835 )
								if( basis_minus <= -0.092065 )
									ret := 0.166667
								if( basis_minus > -0.092065 )
									ret := -0.625000
							if( senkou_span_a > 171.835 )
								if( chinkou_span <= 172.397 )
									ret := 0.218579
								if( chinkou_span > 172.397 )
									ret := -0.333333
						if( senkou_span_a > 172.073 )
							if( tenkan_sen <= 172.366 )
								if( senkou_span_a <= 172.157 )
									ret := -0.404255
								if( senkou_span_a > 172.157 )
									ret := 0.055556
							if( tenkan_sen > 172.366 )
								if( senkou_span_b_displaced <= 172.191 )
									ret := -0.410526
								if( senkou_span_b_displaced > 172.191 )
									ret := -0.952381 // sell
					if( chinkou_span > 172.659 )
						if( chinkou_span <= 175.601 )
							if( kinjun_sen <= 173.129 )
								if( chinkou_span <= 173.958 )
									ret := 0.281046
								if( chinkou_span > 173.958 )
									ret := 0.669643
							if( kinjun_sen > 173.129 )
								if( senkou_span_a_displaced <= 171.605 )
									ret := 0.200000
								if( senkou_span_a_displaced > 171.605 )
									ret := -0.857143 // sell
						if( chinkou_span > 175.601 )
							if( chinkou_span <= 184.506 )
								if( kinjun_sen <= 172.645 )
									ret := -0.600000
								if( kinjun_sen > 172.645 )
									ret := -1.000000 // sell
							if( chinkou_span > 184.506 )
								ret := 0.000000
				if( senkou_span_a_displaced > 172.175 )
					if( chinkou_span <= 171.892 )
						if( basis_max <= 0.194969 )
							if( basis_max <= 0.053036 )
								if( senkou_span_b_displaced <= 172.702 )
									ret := -0.300000
								if( senkou_span_b_displaced > 172.702 )
									ret := 0.555556
							if( basis_max > 0.053036 )
								if( chinkou_span <= 171.75 )
									ret := -0.848485 // sell
								if( chinkou_span > 171.75 )
									ret := -0.142857
						if( basis_max > 0.194969 )
							if( tenkan_sen <= 171.606 )
								ret := 1.000000 // buy
							if( tenkan_sen > 171.606 )
								ret := 0.750000 // buy
					if( chinkou_span > 171.892 )
						if( senkou_span_b_displaced <= 172.335 )
							if( kinjun_sen <= 172.582 )
								if( chinkou_span <= 172.162 )
									ret := 0.120000
								if( chinkou_span > 172.162 )
									ret := 0.670330
							if( kinjun_sen > 172.582 )
								if( basis_max <= 0.041875 )
									ret := 0.049505
								if( basis_max > 0.041875 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 172.335 )
							if( senkou_span_a <= 172.097 )
								if( senkou_span_a_displaced <= 172.719 )
									ret := 0.604167
								if( senkou_span_a_displaced > 172.719 )
									ret := -0.090909
							if( senkou_span_a > 172.097 )
								if( senkou_span_b <= 172.227 )
									ret := 0.541667
								if( senkou_span_b > 172.227 )
									ret := 0.896552 // buy
			if( senkou_span_b > 172.51 )
				if( basis_minus <= 0.475126 )
					if( kinjun_sen <= 229.208 )
						if( chinkou_span <= 173.032 )
							if( basis_max <= 0.016497 )
								if( senkou_span_b_displaced <= 173.666 )
									ret := -0.300448
								if( senkou_span_b_displaced > 173.666 )
									ret := -0.656085
							if( basis_max > 0.016497 )
								if( tenkan_sen <= 174.305 )
									ret := -0.037987
								if( tenkan_sen > 174.305 )
									ret := -0.744681 // sell
						if( chinkou_span > 173.032 )
							if( chinkou_span <= 224.822 )
								if( senkou_span_a_displaced <= 223.718 )
									ret := 0.059521
								if( senkou_span_a_displaced > 223.718 )
									ret := -0.241206
							if( chinkou_span > 224.822 )
								if( senkou_span_b <= 225.1 )
									ret := 0.537713
								if( senkou_span_b > 225.1 )
									ret := 0.138915
					if( kinjun_sen > 229.208 )
						if( basis_max <= 0.380597 )
							if( chinkou_span <= 230.836 )
								if( tenkan_sen <= 230.594 )
									ret := -0.083333
								if( tenkan_sen > 230.594 )
									ret := -0.627737
							if( chinkou_span > 230.836 )
								if( senkou_span_b <= 234.565 )
									ret := 0.315663
								if( senkou_span_b > 234.565 )
									ret := -0.153439
						if( basis_max > 0.380597 )
							if( senkou_span_a_displaced <= 234.619 )
								if( chinkou_span <= 226.066 )
									ret := -0.969697 // sell
								if( chinkou_span > 226.066 )
									ret := -0.552941
							if( senkou_span_a_displaced > 234.619 )
								if( basis_minus <= -0.820225 )
									ret := 0.500000
								if( basis_minus > -0.820225 )
									ret := 0.000000
				if( basis_minus > 0.475126 )
					if( chinkou_span <= 178.518 )
						if( senkou_span_a_displaced <= 174.805 )
							if( chinkou_span <= 176.222 )
								if( chinkou_span <= 174.19 )
									ret := -0.360324
								if( chinkou_span > 174.19 )
									ret := 0.109641
							if( chinkou_span > 176.222 )
								if( senkou_span_a <= 176.273 )
									ret := 0.851064 // buy
								if( senkou_span_a > 176.273 )
									ret := 0.333333
						if( senkou_span_a_displaced > 174.805 )
							if( senkou_span_a <= 178.117 )
								if( kinjun_sen <= 176.842 )
									ret := -0.437500
								if( kinjun_sen > 176.842 )
									ret := -0.018868
							if( senkou_span_a > 178.117 )
								if( senkou_span_a <= 178.451 )
									ret := -0.873563 // sell
								if( senkou_span_a > 178.451 )
									ret := -0.524194
					if( chinkou_span > 178.518 )
						if( senkou_span_a <= 178.314 )
							if( basis_minus <= 0.602479 )
								if( chinkou_span <= 178.64 )
									ret := -0.111111
								if( chinkou_span > 178.64 )
									ret := 0.739130 // buy
							if( basis_minus > 0.602479 )
								if( senkou_span_a <= 178.19 )
									ret := 0.944444 // buy
								if( senkou_span_a > 178.19 )
									ret := 0.333333
						if( senkou_span_a > 178.314 )
							if( chinkou_span <= 234.991 )
								if( tenkan_sen <= 231.829 )
									ret := 0.008196
								if( tenkan_sen > 231.829 )
									ret := -0.367816
							if( chinkou_span > 234.991 )
								if( senkou_span_b <= 234.118 )
									ret := 0.652174
								if( senkou_span_b > 234.118 )
									ret := -0.133333
	
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
float op_operation = decision_tree_0_AAPL_5Min_40bd5cc1(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


