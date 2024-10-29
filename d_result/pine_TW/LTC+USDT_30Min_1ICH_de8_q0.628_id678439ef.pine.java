//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: LTCUSDT_30Min_1ICH_678439ef Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1ICH_678439ef", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_678439ef(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 179.455 )
		if( kinjun_sen <= 174.952 )
			if( senkou_span_a <= 62.7696 )
				if( senkou_span_b_displaced <= 63.37 )
					if( kinjun_sen <= 61.9206 )
						if( tenkan_sen <= 42.9841 )
							if( chinkou_span <= 44.9438 )
								if( senkou_span_b <= 45.7075 )
									ret := 0.500000
								if( senkou_span_b > 45.7075 )
									ret := 0.900000 // buy
							if( chinkou_span > 44.9438 )
								ret := 1.000000 // buy
						if( tenkan_sen > 42.9841 )
							if( chinkou_span <= 59.3225 )
								if( tenkan_sen <= 57.9329 )
									ret := 0.020091
								if( tenkan_sen > 57.9329 )
									ret := -0.387164
							if( chinkou_span > 59.3225 )
								if( tenkan_sen <= 60.2881 )
									ret := 0.469945
								if( tenkan_sen > 60.2881 )
									ret := 0.074775
					if( kinjun_sen > 61.9206 )
						if( senkou_span_a_displaced <= 62.9189 )
							if( chinkou_span <= 61.9906 )
								if( senkou_span_a <= 61.7925 )
									ret := 0.408163
								if( senkou_span_a > 61.7925 )
									ret := -0.198675
							if( chinkou_span > 61.9906 )
								if( senkou_span_a <= 62.374 )
									ret := 0.770992 // buy
								if( senkou_span_a > 62.374 )
									ret := 0.238462
						if( senkou_span_a_displaced > 62.9189 )
							if( senkou_span_a_displaced <= 63.0475 )
								if( basis_max <= 0.14802 )
									ret := -0.906250 // sell
								if( basis_max > 0.14802 )
									ret := -0.484848
							if( senkou_span_a_displaced > 63.0475 )
								if( chinkou_span <= 63.4914 )
									ret := -0.260000
								if( chinkou_span > 63.4914 )
									ret := 0.703704 // buy
				if( senkou_span_b_displaced > 63.37 )
					if( senkou_span_a <= 59.3567 )
						if( tenkan_sen <= 58.4309 )
							ret := -0.888889 // sell
						if( tenkan_sen > 58.4309 )
							ret := -1.000000 // sell
					if( senkou_span_a > 59.3567 )
						if( senkou_span_a_displaced <= 68.0287 )
							if( senkou_span_b_displaced <= 70.1575 )
								if( chinkou_span <= 54.1203 )
									ret := -0.647059
								if( chinkou_span > 54.1203 )
									ret := 0.435374
							if( senkou_span_b_displaced > 70.1575 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 68.0287 )
							if( basis_minus <= -2.72125 )
								if( senkou_span_a_displaced <= 74.7504 )
									ret := 0.860759 // buy
								if( senkou_span_a_displaced > 74.7504 )
									ret := -0.272727
							if( basis_minus > -2.72125 )
								ret := 0.000000
			if( senkou_span_a > 62.7696 )
				if( basis_minus <= -9.46869 )
					if( chinkou_span <= 176.457 )
						if( kinjun_sen <= 171.257 )
							if( kinjun_sen <= 162.178 )
								if( senkou_span_a_displaced <= 167.528 )
									ret := 0.810345 // buy
								if( senkou_span_a_displaced > 167.528 )
									ret := 0.315217
							if( kinjun_sen > 162.178 )
								if( senkou_span_b_displaced <= 196.027 )
									ret := 0.987500 // buy
								if( senkou_span_b_displaced > 196.027 )
									ret := 0.800000 // buy
						if( kinjun_sen > 171.257 )
							if( tenkan_sen <= 173.592 )
								ret := 0.941176 // buy
							if( tenkan_sen > 173.592 )
								ret := -1.000000 // sell
					if( chinkou_span > 176.457 )
						ret := -0.565217
				if( basis_minus > -9.46869 )
					if( chinkou_span <= 65.2317 )
						if( senkou_span_a <= 65.9142 )
							if( chinkou_span <= 61.2443 )
								if( basis_minus <= -0.31875 )
									ret := -0.125000
								if( basis_minus > -0.31875 )
									ret := -0.880952 // sell
							if( chinkou_span > 61.2443 )
								if( chinkou_span <= 63.1257 )
									ret := -0.299531
								if( chinkou_span > 63.1257 )
									ret := -0.087924
						if( senkou_span_a > 65.9142 )
							if( senkou_span_b <= 65.8913 )
								if( senkou_span_a <= 66.1324 )
									ret := -0.529412
								if( senkou_span_a > 66.1324 )
									ret := 0.000000
							if( senkou_span_b > 65.8913 )
								if( tenkan_sen <= 66.6525 )
									ret := -0.848649 // sell
								if( tenkan_sen > 66.6525 )
									ret := -0.666667
					if( chinkou_span > 65.2317 )
						if( chinkou_span <= 168.308 )
							if( senkou_span_b_displaced <= 168.09 )
								if( senkou_span_a <= 69.0913 )
									ret := 0.155457
								if( senkou_span_a > 69.0913 )
									ret := -0.016301
							if( senkou_span_b_displaced > 168.09 )
								if( senkou_span_b <= 167.316 )
									ret := -0.261745
								if( senkou_span_b > 167.316 )
									ret := -0.575851
						if( chinkou_span > 168.308 )
							if( kinjun_sen <= 165.509 )
								if( senkou_span_a <= 163.842 )
									ret := 0.860082 // buy
								if( senkou_span_a > 163.842 )
									ret := 0.480916
							if( kinjun_sen > 165.509 )
								if( senkou_span_a_displaced <= 167.051 )
									ret := -0.142518
								if( senkou_span_a_displaced > 167.051 )
									ret := 0.270865
		if( kinjun_sen > 174.952 )
			if( senkou_span_a <= 180.006 )
				if( chinkou_span <= 175.223 )
					if( basis_minus <= -4.94087 )
						if( basis_max <= 3.95821 )
							if( senkou_span_b <= 184.041 )
								if( basis_minus <= -6.54774 )
									ret := 0.062500
								if( basis_minus > -6.54774 )
									ret := 0.823529 // buy
							if( senkou_span_b > 184.041 )
								ret := -0.888889 // sell
						if( basis_max > 3.95821 )
							if( basis_minus <= -7.4878 )
								ret := 1.000000 // buy
							if( basis_minus > -7.4878 )
								ret := 0.818182 // buy
					if( basis_minus > -4.94087 )
						if( senkou_span_a <= 178.341 )
							if( basis_max <= 2.86875 )
								if( chinkou_span <= 158.85 )
									ret := -0.820144 // sell
								if( chinkou_span > 158.85 )
									ret := -0.558824
							if( basis_max > 2.86875 )
								ret := -1.000000 // sell
						if( senkou_span_a > 178.341 )
							if( kinjun_sen <= 177.198 )
								ret := 1.000000 // buy
							if( kinjun_sen > 177.198 )
								if( kinjun_sen <= 178.765 )
									ret := 0.000000
								if( kinjun_sen > 178.765 )
									ret := -0.716216 // sell
				if( chinkou_span > 175.223 )
					if( senkou_span_a_displaced <= 174.105 )
						if( chinkou_span <= 177.8 )
							if( senkou_span_a_displaced <= 173.35 )
								ret := -0.368421
							if( senkou_span_a_displaced > 173.35 )
								ret := 0.444444
						if( chinkou_span > 177.8 )
							if( kinjun_sen <= 177.825 )
								if( basis_minus <= 3.15625 )
									ret := -1.000000 // sell
								if( basis_minus > 3.15625 )
									ret := -0.692308
							if( kinjun_sen > 177.825 )
								ret := 0.444444
					if( senkou_span_a_displaced > 174.105 )
						if( basis_minus <= -0.977172 )
							if( tenkan_sen <= 170.825 )
								if( basis_minus <= -11.1464 )
									ret := 1.000000 // buy
								if( basis_minus > -11.1464 )
									ret := 0.750000 // buy
							if( tenkan_sen > 170.825 )
								if( senkou_span_a_displaced <= 187.037 )
									ret := -0.025157
								if( senkou_span_a_displaced > 187.037 )
									ret := -0.800000 // sell
						if( basis_minus > -0.977172 )
							if( senkou_span_b <= 177.132 )
								if( senkou_span_a_displaced <= 175.797 )
									ret := 0.738095 // buy
								if( senkou_span_a_displaced > 175.797 )
									ret := 1.000000 // buy
							if( senkou_span_b > 177.132 )
								if( basis_max <= -0.386321 )
									ret := 0.849057 // buy
								if( basis_max > -0.386321 )
									ret := -0.121951
			if( senkou_span_a > 180.006 )
				if( senkou_span_b <= 205.105 )
					if( senkou_span_b <= 195.94 )
						if( tenkan_sen <= 180.959 )
							if( senkou_span_b_displaced <= 180.384 )
								if( basis_max <= -0.235533 )
									ret := 0.619048
								if( basis_max > -0.235533 )
									ret := -0.361702
							if( senkou_span_b_displaced > 180.384 )
								if( chinkou_span <= 178.897 )
									ret := -0.635036
								if( chinkou_span > 178.897 )
									ret := 0.153846
						if( tenkan_sen > 180.959 )
							if( chinkou_span <= 176.876 )
								if( basis_max <= -0.00445 )
									ret := -0.847953 // sell
								if( basis_max > -0.00445 )
									ret := -0.593625
							if( chinkou_span > 176.876 )
								if( chinkou_span <= 178.814 )
									ret := -0.392344
								if( chinkou_span > 178.814 )
									ret := -0.614458
					if( senkou_span_b > 195.94 )
						if( chinkou_span <= 177.336 )
							if( basis_minus <= -0.4288 )
								ret := -1.000000 // sell
							if( basis_minus > -0.4288 )
								ret := -0.800000 // sell
						if( chinkou_span > 177.336 )
							ret := -0.833333 // sell
				if( senkou_span_b > 205.105 )
					if( senkou_span_a <= 207.107 )
						if( basis_minus <= -8.68155 )
							ret := -0.615385
						if( basis_minus > -8.68155 )
							if( senkou_span_b_displaced <= 195.757 )
								ret := -0.111111
							if( senkou_span_b_displaced > 195.757 )
								if( senkou_span_a <= 204.858 )
									ret := 0.777778 // buy
								if( senkou_span_a > 204.858 )
									ret := 1.000000 // buy
					if( senkou_span_a > 207.107 )
						if( basis_max <= 0.542652 )
							ret := -0.700000 // sell
						if( basis_max > 0.542652 )
							ret := -1.000000 // sell
	if( chinkou_span > 179.455 )
		if( senkou_span_b <= 194.224 )
			if( senkou_span_a <= 180.334 )
				if( chinkou_span <= 200.495 )
					if( kinjun_sen <= 171.493 )
						if( senkou_span_a <= 169.927 )
							if( senkou_span_b_displaced <= 172.43 )
								if( senkou_span_b_displaced <= 158.569 )
									ret := 0.812500 // buy
								if( senkou_span_b_displaced > 158.569 )
									ret := 0.971429 // buy
							if( senkou_span_b_displaced > 172.43 )
								ret := 0.111111
						if( senkou_span_a > 169.927 )
							if( kinjun_sen <= 169.925 )
								ret := -0.214286
							if( kinjun_sen > 169.925 )
								if( senkou_span_b_displaced <= 169.772 )
									ret := 0.428571
								if( senkou_span_b_displaced > 169.772 )
									ret := 1.000000 // buy
					if( kinjun_sen > 171.493 )
						if( basis_max <= -1.91341 )
							if( tenkan_sen <= 179.959 )
								if( senkou_span_b <= 174.505 )
									ret := 0.636364
								if( senkou_span_b > 174.505 )
									ret := -0.076923
							if( tenkan_sen > 179.959 )
								if( senkou_span_b_displaced <= 171.217 )
									ret := -0.937500 // sell
								if( senkou_span_b_displaced > 171.217 )
									ret := -0.517241
						if( basis_max > -1.91341 )
							if( senkou_span_b <= 171.526 )
								if( senkou_span_b <= 171.051 )
									ret := 0.000000
								if( senkou_span_b > 171.051 )
									ret := -0.767442 // sell
							if( senkou_span_b > 171.526 )
								if( tenkan_sen <= 170.342 )
									ret := -0.857143 // sell
								if( tenkan_sen > 170.342 )
									ret := 0.568297
				if( chinkou_span > 200.495 )
					if( senkou_span_b_displaced <= 174.686 )
						ret := -0.937500 // sell
					if( senkou_span_b_displaced > 174.686 )
						ret := -0.181818
			if( senkou_span_a > 180.334 )
				if( chinkou_span <= 187.628 )
					if( basis_minus <= 2.83451 )
						if( tenkan_sen <= 182.445 )
							if( basis_minus <= 1.23158 )
								if( basis_minus <= -10.4689 )
									ret := -0.545455
								if( basis_minus > -10.4689 )
									ret := 0.420195
							if( basis_minus > 1.23158 )
								if( kinjun_sen <= 180.858 )
									ret := 0.666667
								if( kinjun_sen > 180.858 )
									ret := -0.534884
						if( tenkan_sen > 182.445 )
							if( chinkou_span <= 181.765 )
								if( basis_max <= -0.075 )
									ret := -0.572727
								if( basis_max > -0.075 )
									ret := 0.090909
							if( chinkou_span > 181.765 )
								if( basis_max <= -0.438271 )
									ret := 0.163265
								if( basis_max > -0.438271 )
									ret := -0.185811
					if( basis_minus > 2.83451 )
						if( senkou_span_a <= 182.058 )
							if( senkou_span_a_displaced <= 171.248 )
								ret := 0.818182 // buy
							if( senkou_span_a_displaced > 171.248 )
								if( basis_minus <= 6.73024 )
									ret := -0.791667 // sell
								if( basis_minus > 6.73024 )
									ret := -1.000000 // sell
						if( senkou_span_a > 182.058 )
							if( senkou_span_a <= 183.95 )
								if( senkou_span_a <= 182.749 )
									ret := -0.307692
								if( senkou_span_a > 182.749 )
									ret := 0.848485 // buy
							if( senkou_span_a > 183.95 )
								if( senkou_span_a_displaced <= 179.894 )
									ret := -0.722222 // sell
								if( senkou_span_a_displaced > 179.894 )
									ret := -0.276923
				if( chinkou_span > 187.628 )
					if( senkou_span_b_displaced <= 181.319 )
						if( tenkan_sen <= 182.14 )
							if( senkou_span_a <= 181.123 )
								ret := -0.500000
							if( senkou_span_a > 181.123 )
								if( basis_max <= -0.116759 )
									ret := -1.000000 // sell
								if( basis_max > -0.116759 )
									ret := -0.800000 // sell
						if( tenkan_sen > 182.14 )
							if( basis_max <= -0.48875 )
								if( kinjun_sen <= 181.221 )
									ret := 0.904762 // buy
								if( kinjun_sen > 181.221 )
									ret := -0.630000
							if( basis_max > -0.48875 )
								if( basis_max <= -0.234433 )
									ret := 0.850000 // buy
								if( basis_max > -0.234433 )
									ret := 0.129032
					if( senkou_span_b_displaced > 181.319 )
						if( senkou_span_b_displaced <= 188.831 )
							if( basis_minus <= 3.01083 )
								if( senkou_span_b <= 185.775 )
									ret := 0.557522
								if( senkou_span_b > 185.775 )
									ret := 0.764851 // buy
							if( basis_minus > 3.01083 )
								if( tenkan_sen <= 202.575 )
									ret := 0.200000
								if( tenkan_sen > 202.575 )
									ret := -0.952381 // sell
						if( senkou_span_b_displaced > 188.831 )
							if( kinjun_sen <= 185.122 )
								if( senkou_span_a <= 184.858 )
									ret := 0.947368 // buy
								if( senkou_span_a > 184.858 )
									ret := 0.461538
							if( kinjun_sen > 185.122 )
								if( kinjun_sen <= 186.022 )
									ret := -0.750000 // sell
								if( kinjun_sen > 186.022 )
									ret := 0.209677
		if( senkou_span_b > 194.224 )
			if( chinkou_span <= 221.74 )
				if( tenkan_sen <= 213.517 )
					if( senkou_span_a <= 210.296 )
						if( tenkan_sen <= 201.383 )
							if( senkou_span_b <= 198.694 )
								if( senkou_span_b <= 197.605 )
									ret := -0.024229
								if( senkou_span_b > 197.605 )
									ret := -0.530973
							if( senkou_span_b > 198.694 )
								if( senkou_span_b_displaced <= 199.582 )
									ret := 0.647727
								if( senkou_span_b_displaced > 199.582 )
									ret := 0.189706
						if( tenkan_sen > 201.383 )
							if( basis_max <= -2.10052 )
								if( tenkan_sen <= 203.232 )
									ret := -0.857143 // sell
								if( tenkan_sen > 203.232 )
									ret := 0.666667
							if( basis_max > -2.10052 )
								if( chinkou_span <= 213.064 )
									ret := -0.397410
								if( chinkou_span > 213.064 )
									ret := 0.221843
					if( senkou_span_a > 210.296 )
						if( tenkan_sen <= 211.467 )
							if( tenkan_sen <= 211.319 )
								if( kinjun_sen <= 210.427 )
									ret := -0.400000
								if( kinjun_sen > 210.427 )
									ret := 0.459459
							if( tenkan_sen > 211.319 )
								if( chinkou_span <= 187.162 )
									ret := -1.000000 // sell
								if( chinkou_span > 187.162 )
									ret := -0.700000 // sell
						if( tenkan_sen > 211.467 )
							if( senkou_span_b <= 211.943 )
								if( basis_max <= -1.58875 )
									ret := 0.214286
								if( basis_max > -1.58875 )
									ret := 0.822034 // buy
							if( senkou_span_b > 211.943 )
								if( basis_max <= 1.08965 )
									ret := -0.333333
								if( basis_max > 1.08965 )
									ret := 0.615385
				if( tenkan_sen > 213.517 )
					if( senkou_span_b_displaced <= 202.215 )
						if( senkou_span_b <= 210.78 )
							if( kinjun_sen <= 216.142 )
								if( senkou_span_b <= 209.783 )
									ret := 0.478261
								if( senkou_span_b > 209.783 )
									ret := -0.925926 // sell
							if( kinjun_sen > 216.142 )
								if( senkou_span_b <= 208.811 )
									ret := 0.466667
								if( senkou_span_b > 208.811 )
									ret := 1.000000 // buy
						if( senkou_span_b > 210.78 )
							if( senkou_span_a_displaced <= 211.552 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 211.552 )
								ret := -0.181818
					if( senkou_span_b_displaced > 202.215 )
						if( kinjun_sen <= 228.785 )
							if( kinjun_sen <= 217.786 )
								if( basis_minus <= -3.59875 )
									ret := -0.366667
								if( basis_minus > -3.59875 )
									ret := -0.835878 // sell
							if( kinjun_sen > 217.786 )
								if( basis_max <= 1.94069 )
									ret := -0.478537
								if( basis_max > 1.94069 )
									ret := 0.378378
						if( kinjun_sen > 228.785 )
							if( tenkan_sen <= 267.685 )
								if( tenkan_sen <= 235.728 )
									ret := -0.911765 // sell
								if( tenkan_sen > 235.728 )
									ret := -1.000000 // sell
							if( tenkan_sen > 267.685 )
								if( tenkan_sen <= 284.447 )
									ret := 0.076923
								if( tenkan_sen > 284.447 )
									ret := -1.000000 // sell
			if( chinkou_span > 221.74 )
				if( kinjun_sen <= 226.3 )
					if( tenkan_sen <= 215.318 )
						if( senkou_span_a <= 206.795 )
							if( basis_minus <= 2.0625 )
								if( chinkou_span <= 223.721 )
									ret := 0.111111
								if( chinkou_span > 223.721 )
									ret := 0.875000 // buy
							if( basis_minus > 2.0625 )
								ret := -0.125000
						if( senkou_span_a > 206.795 )
							if( basis_max <= -1.0788 )
								if( senkou_span_a_displaced <= 209.416 )
									ret := 0.942857 // buy
								if( senkou_span_a_displaced > 209.416 )
									ret := 0.000000
							if( basis_max > -1.0788 )
								if( kinjun_sen <= 211.31 )
									ret := 0.919540 // buy
								if( kinjun_sen > 211.31 )
									ret := 1.000000 // buy
					if( tenkan_sen > 215.318 )
						if( basis_max <= -0.073734 )
							if( chinkou_span <= 226.723 )
								if( basis_minus <= -5.834 )
									ret := 0.720000 // buy
								if( basis_minus > -5.834 )
									ret := -0.011111
							if( chinkou_span > 226.723 )
								if( chinkou_span <= 233.955 )
									ret := 0.523256
								if( chinkou_span > 233.955 )
									ret := 0.917526 // buy
						if( basis_max > -0.073734 )
							if( chinkou_span <= 232.431 )
								if( senkou_span_b_displaced <= 226.893 )
									ret := 0.451613
								if( senkou_span_b_displaced > 226.893 )
									ret := 0.961538 // buy
							if( chinkou_span > 232.431 )
								if( chinkou_span <= 238.9 )
									ret := 1.000000 // buy
								if( chinkou_span > 238.9 )
									ret := 0.933333 // buy
				if( kinjun_sen > 226.3 )
					if( senkou_span_b <= 368.702 )
						if( chinkou_span <= 254.496 )
							if( senkou_span_a <= 259.619 )
								if( senkou_span_a <= 256.98 )
									ret := -0.154804
								if( senkou_span_a > 256.98 )
									ret := 0.648649
							if( senkou_span_a > 259.619 )
								if( tenkan_sen <= 277.951 )
									ret := -0.691542
								if( tenkan_sen > 277.951 )
									ret := 0.423077
						if( chinkou_span > 254.496 )
							if( senkou_span_a <= 254.751 )
								if( senkou_span_a_displaced <= 264.576 )
									ret := 0.746177 // buy
								if( senkou_span_a_displaced > 264.576 )
									ret := -1.000000 // sell
							if( senkou_span_a > 254.751 )
								if( senkou_span_b <= 255.264 )
									ret := -0.264045
								if( senkou_span_b > 255.264 )
									ret := 0.130806
					if( senkou_span_b > 368.702 )
						if( basis_minus <= -11.9675 )
							if( kinjun_sen <= 360.917 )
								ret := 0.000000
							if( kinjun_sen > 360.917 )
								ret := 1.000000 // buy
						if( basis_minus > -11.9675 )
							if( chinkou_span <= 378.445 )
								if( basis_max <= 4.0628 )
									ret := -0.704142 // sell
								if( basis_max > 4.0628 )
									ret := 0.583333
							if( chinkou_span > 378.445 )
								ret := 0.230769
	
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
float op_operation = decision_tree_0_LTCUSDT_30Min_678439ef(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


