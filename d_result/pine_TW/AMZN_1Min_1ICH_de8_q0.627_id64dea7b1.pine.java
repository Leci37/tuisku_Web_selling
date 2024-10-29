//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AMZN_1Min_1ICH_64dea7b1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Min_1ICH_64dea7b1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Min_64dea7b1(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( senkou_span_b_displaced <= 176.898 )
		if( chinkou_span <= 175.081 )
			if( kinjun_sen <= 174.566 )
				if( senkou_span_a <= 160.804 )
					if( senkou_span_b <= 160.254 )
						if( senkou_span_a_displaced <= 155.122 )
							if( senkou_span_b_displaced <= 154.136 )
								if( senkou_span_a_displaced <= 154.997 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 154.997 )
									ret := 0.789474 // buy
							if( senkou_span_b_displaced > 154.136 )
								if( chinkou_span <= 159.359 )
									ret := 0.640000
								if( chinkou_span > 159.359 )
									ret := -1.000000 // sell
						if( senkou_span_a_displaced > 155.122 )
							if( kinjun_sen <= 159.001 )
								if( kinjun_sen <= 153.409 )
									ret := 0.411765
								if( kinjun_sen > 153.409 )
									ret := -0.603015
							if( kinjun_sen > 159.001 )
								if( senkou_span_b_displaced <= 161 )
									ret := 0.295775
								if( senkou_span_b_displaced > 161 )
									ret := -0.894737 // sell
					if( senkou_span_b > 160.254 )
						if( senkou_span_b_displaced <= 162.853 )
							if( chinkou_span <= 159.607 )
								if( tenkan_sen <= 160.268 )
									ret := 0.581395
								if( tenkan_sen > 160.268 )
									ret := -1.000000 // sell
							if( chinkou_span > 159.607 )
								if( senkou_span_a_displaced <= 160.866 )
									ret := 0.437908
								if( senkou_span_a_displaced > 160.866 )
									ret := 0.882883 // buy
						if( senkou_span_b_displaced > 162.853 )
							ret := -0.437500
				if( senkou_span_a > 160.804 )
					if( chinkou_span <= 161.053 )
						if( senkou_span_a_displaced <= 163.273 )
							if( senkou_span_a_displaced <= 160.568 )
								if( basis_minus <= 0.257574 )
									ret := 0.833333 // buy
								if( basis_minus > 0.257574 )
									ret := 0.600000
							if( senkou_span_a_displaced > 160.568 )
								if( basis_minus <= -0.239064 )
									ret := -0.085714
								if( basis_minus > -0.239064 )
									ret := -0.536408
						if( senkou_span_a_displaced > 163.273 )
							if( senkou_span_a_displaced <= 163.381 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 163.381 )
								ret := 0.583333
					if( chinkou_span > 161.053 )
						if( basis_minus <= 1.17647 )
							if( chinkou_span <= 174.553 )
								if( kinjun_sen <= 173.171 )
									ret := 0.090524
								if( kinjun_sen > 173.171 )
									ret := -0.156081
							if( chinkou_span > 174.553 )
								if( tenkan_sen <= 174.796 )
									ret := 0.459906
								if( tenkan_sen > 174.796 )
									ret := -0.580645
						if( basis_minus > 1.17647 )
							if( basis_minus <= 1.40148 )
								if( senkou_span_b_displaced <= 171.28 )
									ret := 0.842105 // buy
								if( senkou_span_b_displaced > 171.28 )
									ret := 0.142857
							if( basis_minus > 1.40148 )
								if( chinkou_span <= 167.877 )
									ret := 0.186667
								if( chinkou_span > 167.877 )
									ret := 0.586667
			if( kinjun_sen > 174.566 )
				if( senkou_span_a_displaced <= 175.26 )
					if( basis_max <= -0.040164 )
						if( senkou_span_a_displaced <= 174.788 )
							if( senkou_span_b <= 174.871 )
								if( chinkou_span <= 174.371 )
									ret := -0.826087 // sell
								if( chinkou_span > 174.371 )
									ret := -0.123711
							if( senkou_span_b > 174.871 )
								ret := -0.708333 // sell
						if( senkou_span_a_displaced > 174.788 )
							if( chinkou_span <= 174.974 )
								if( basis_max <= -0.051401 )
									ret := -1.000000 // sell
								if( basis_max > -0.051401 )
									ret := -0.904762 // sell
							if( chinkou_span > 174.974 )
								ret := -0.625000
					if( basis_max > -0.040164 )
						if( senkou_span_a <= 174.747 )
							if( chinkou_span <= 172.665 )
								if( senkou_span_b_displaced <= 175.218 )
									ret := 0.000000
								if( senkou_span_b_displaced > 175.218 )
									ret := 0.888889 // buy
							if( chinkou_span > 172.665 )
								if( chinkou_span <= 174.006 )
									ret := -0.808511 // sell
								if( chinkou_span > 174.006 )
									ret := -0.294964
						if( senkou_span_a > 174.747 )
							if( chinkou_span <= 174.625 )
								if( senkou_span_b_displaced <= 174.339 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 174.339 )
									ret := -0.464286
							if( chinkou_span > 174.625 )
								if( senkou_span_a <= 174.868 )
									ret := 0.695122
								if( senkou_span_a > 174.868 )
									ret := 0.232323
				if( senkou_span_a_displaced > 175.26 )
					if( senkou_span_b <= 176.803 )
						if( basis_minus <= -0.234846 )
							if( senkou_span_a_displaced <= 176.676 )
								if( basis_max <= -0.01792 )
									ret := -1.000000 // sell
								if( basis_max > -0.01792 )
									ret := -0.665072
							if( senkou_span_a_displaced > 176.676 )
								if( basis_minus <= -0.31167 )
									ret := -0.526316
								if( basis_minus > -0.31167 )
									ret := 0.454545
						if( basis_minus > -0.234846 )
							if( basis_max <= 0.112594 )
								if( basis_minus <= 0.0314 )
									ret := -0.509804
								if( basis_minus > 0.0314 )
									ret := 0.029412
							if( basis_max > 0.112594 )
								if( chinkou_span <= 174.601 )
									ret := 0.708333 // buy
								if( chinkou_span > 174.601 )
									ret := 0.000000
					if( senkou_span_b > 176.803 )
						if( chinkou_span <= 173.438 )
							ret := -0.888889 // sell
						if( chinkou_span > 173.438 )
							ret := -1.000000 // sell
		if( chinkou_span > 175.081 )
			if( tenkan_sen <= 175.34 )
				if( basis_minus <= 0.456463 )
					if( chinkou_span <= 176.203 )
						if( senkou_span_a_displaced <= 173.847 )
							if( kinjun_sen <= 174.341 )
								ret := 1.000000 // buy
							if( kinjun_sen > 174.341 )
								ret := 0.500000
						if( senkou_span_a_displaced > 173.847 )
							if( basis_minus <= 0.125337 )
								if( basis_minus <= 0.04411 )
									ret := 0.505828
								if( basis_minus > 0.04411 )
									ret := 0.025641
							if( basis_minus > 0.125337 )
								if( basis_minus <= 0.31375 )
									ret := 0.781991 // buy
								if( basis_minus > 0.31375 )
									ret := 0.317460
					if( chinkou_span > 176.203 )
						if( senkou_span_a_displaced <= 173.627 )
							ret := 0.545455
						if( senkou_span_a_displaced > 173.627 )
							ret := 1.000000 // buy
				if( basis_minus > 0.456463 )
					if( senkou_span_a <= 175.302 )
						if( basis_max <= -0.122349 )
							if( tenkan_sen <= 175.262 )
								ret := 0.937500 // buy
							if( tenkan_sen > 175.262 )
								ret := 0.076923
						if( basis_max > -0.122349 )
							if( chinkou_span <= 175.14 )
								ret := 0.055556
							if( chinkou_span > 175.14 )
								if( senkou_span_b <= 174.126 )
									ret := -0.883333 // sell
								if( senkou_span_b > 174.126 )
									ret := -0.083333
					if( senkou_span_a > 175.302 )
						ret := 1.000000 // buy
			if( tenkan_sen > 175.34 )
				if( chinkou_span <= 176.611 )
					if( senkou_span_a <= 176.608 )
						if( basis_minus <= -0.187484 )
							if( senkou_span_a_displaced <= 176.519 )
								if( chinkou_span <= 175.81 )
									ret := 0.000000
								if( chinkou_span > 175.81 )
									ret := 0.742331 // buy
							if( senkou_span_a_displaced > 176.519 )
								if( chinkou_span <= 175.477 )
									ret := -0.952381 // sell
								if( chinkou_span > 175.477 )
									ret := 0.048077
						if( basis_minus > -0.187484 )
							if( tenkan_sen <= 175.878 )
								if( chinkou_span <= 175.987 )
									ret := -0.040964
								if( chinkou_span > 175.987 )
									ret := 0.546875
							if( tenkan_sen > 175.878 )
								if( senkou_span_a <= 175.902 )
									ret := -0.569767
								if( senkou_span_a > 175.902 )
									ret := -0.009646
					if( senkou_span_a > 176.608 )
						if( kinjun_sen <= 176.918 )
							if( senkou_span_b_displaced <= 176.155 )
								if( senkou_span_a_displaced <= 176.423 )
									ret := -0.294118
								if( senkou_span_a_displaced > 176.423 )
									ret := 0.461538
							if( senkou_span_b_displaced > 176.155 )
								if( tenkan_sen <= 176.661 )
									ret := -0.849057 // sell
								if( tenkan_sen > 176.661 )
									ret := -0.472222
						if( kinjun_sen > 176.918 )
							if( chinkou_span <= 176.243 )
								ret := 0.533333
							if( chinkou_span > 176.243 )
								if( senkou_span_a_displaced <= 176.73 )
									ret := -0.250000
								if( senkou_span_a_displaced > 176.73 )
									ret := -0.083333
				if( chinkou_span > 176.611 )
					if( tenkan_sen <= 176.75 )
						if( chinkou_span <= 177.571 )
							if( senkou_span_a <= 176.593 )
								if( senkou_span_a_displaced <= 176.499 )
									ret := 0.423313
								if( senkou_span_a_displaced > 176.499 )
									ret := 0.773109 // buy
							if( senkou_span_a > 176.593 )
								if( senkou_span_a_displaced <= 176.578 )
									ret := -0.155172
								if( senkou_span_a_displaced > 176.578 )
									ret := 0.487805
						if( chinkou_span > 177.571 )
							if( basis_minus <= 0.123863 )
								if( chinkou_span <= 177.92 )
									ret := 0.784810 // buy
								if( chinkou_span > 177.92 )
									ret := 0.970588 // buy
							if( basis_minus > 0.123863 )
								if( tenkan_sen <= 176.608 )
									ret := 0.769231 // buy
								if( tenkan_sen > 176.608 )
									ret := 0.450000
					if( tenkan_sen > 176.75 )
						if( chinkou_span <= 177.252 )
							if( basis_max <= -0.098612 )
								if( senkou_span_b_displaced <= 176.438 )
									ret := -0.014286
								if( senkou_span_b_displaced > 176.438 )
									ret := -0.704918 // sell
							if( basis_max > -0.098612 )
								if( senkou_span_a_displaced <= 176.17 )
									ret := -0.777778 // sell
								if( senkou_span_a_displaced > 176.17 )
									ret := 0.127753
						if( chinkou_span > 177.252 )
							if( senkou_span_b_displaced <= 173.63 )
								if( senkou_span_a <= 177.406 )
									ret := 0.142857
								if( senkou_span_a > 177.406 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 173.63 )
								if( basis_max <= -0.727576 )
									ret := -0.823529 // sell
								if( basis_max > -0.727576 )
									ret := 0.354689
	if( senkou_span_b_displaced > 176.898 )
		if( chinkou_span <= 176.99 )
			if( senkou_span_b <= 177.137 )
				if( chinkou_span <= 176.249 )
					if( senkou_span_b_displaced <= 177.648 )
						if( tenkan_sen <= 176.9 )
							if( basis_max <= 0.234375 )
								if( senkou_span_b_displaced <= 177.126 )
									ret := -0.504000
								if( senkou_span_b_displaced > 177.126 )
									ret := -0.771277 // sell
							if( basis_max > 0.234375 )
								if( senkou_span_a <= 175.661 )
									ret := 0.722222 // buy
								if( senkou_span_a > 175.661 )
									ret := -0.596154
						if( tenkan_sen > 176.9 )
							if( tenkan_sen <= 177.024 )
								if( basis_max <= 0.001868 )
									ret := 0.142857
								if( basis_max > 0.001868 )
									ret := 1.000000 // buy
							if( tenkan_sen > 177.024 )
								ret := -0.631579
					if( senkou_span_b_displaced > 177.648 )
						if( tenkan_sen <= 175.524 )
							if( senkou_span_a <= 171.432 )
								ret := 0.181818
							if( senkou_span_a > 171.432 )
								ret := -0.428571
						if( tenkan_sen > 175.524 )
							ret := 1.000000 // buy
				if( chinkou_span > 176.249 )
					if( tenkan_sen <= 176.379 )
						if( basis_minus <= -0.15625 )
							if( basis_max <= 0.20488 )
								if( basis_minus <= -0.39382 )
									ret := 0.680000
								if( basis_minus > -0.39382 )
									ret := 0.870370 // buy
							if( basis_max > 0.20488 )
								ret := 1.000000 // buy
						if( basis_minus > -0.15625 )
							if( basis_minus <= -0.12115 )
								ret := -0.466667
							if( basis_minus > -0.12115 )
								ret := 0.687500
					if( tenkan_sen > 176.379 )
						if( basis_minus <= 0.102716 )
							if( senkou_span_a_displaced <= 177.121 )
								if( senkou_span_b <= 177.018 )
									ret := 0.043750
								if( senkou_span_b > 177.018 )
									ret := -0.567568
							if( senkou_span_a_displaced > 177.121 )
								if( kinjun_sen <= 176.835 )
									ret := 0.781250 // buy
								if( kinjun_sen > 176.835 )
									ret := 0.255102
						if( basis_minus > 0.102716 )
							if( basis_max <= -0.10125 )
								ret := 0.636364
							if( basis_max > -0.10125 )
								if( basis_minus <= 0.158888 )
									ret := -1.000000 // sell
								if( basis_minus > 0.158888 )
									ret := -0.689655
			if( senkou_span_b > 177.137 )
				if( senkou_span_a_displaced <= 178.807 )
					if( senkou_span_b_displaced <= 178.429 )
						if( basis_minus <= -1.06731 )
							if( tenkan_sen <= 175.488 )
								if( basis_minus <= -2.56602 )
									ret := 0.066667
								if( basis_minus > -2.56602 )
									ret := 0.962264 // buy
							if( tenkan_sen > 175.488 )
								if( basis_minus <= -1.25251 )
									ret := -0.650000
								if( basis_minus > -1.25251 )
									ret := 0.750000 // buy
						if( basis_minus > -1.06731 )
							if( kinjun_sen <= 177.682 )
								if( chinkou_span <= 175.543 )
									ret := -0.714286 // sell
								if( chinkou_span > 175.543 )
									ret := -0.212481
							if( kinjun_sen > 177.682 )
								if( tenkan_sen <= 177.87 )
									ret := -0.803279 // sell
								if( tenkan_sen > 177.87 )
									ret := -0.274336
					if( senkou_span_b_displaced > 178.429 )
						if( basis_minus <= 0.282783 )
							if( kinjun_sen <= 174.636 )
								if( senkou_span_a <= 172.137 )
									ret := -1.000000 // sell
								if( senkou_span_a > 172.137 )
									ret := 1.000000 // buy
							if( kinjun_sen > 174.636 )
								if( senkou_span_b <= 178.903 )
									ret := -0.893536 // sell
								if( senkou_span_b > 178.903 )
									ret := -0.259259
						if( basis_minus > 0.282783 )
							ret := 0.150000
				if( senkou_span_a_displaced > 178.807 )
					if( tenkan_sen <= 174.37 )
						ret := 1.000000 // buy
					if( tenkan_sen > 174.37 )
						if( basis_minus <= -2.41243 )
							ret := -1.000000 // sell
						if( basis_minus > -2.41243 )
							if( basis_minus <= 0.129823 )
								if( basis_minus <= -0.052146 )
									ret := -0.039370
								if( basis_minus > -0.052146 )
									ret := 0.862069 // buy
							if( basis_minus > 0.129823 )
								if( basis_minus <= 0.727226 )
									ret := -0.979167 // sell
								if( basis_minus > 0.727226 )
									ret := 0.866667 // buy
		if( chinkou_span > 176.99 )
			if( senkou_span_a <= 177.679 )
				if( chinkou_span <= 178.062 )
					if( basis_minus <= -0.741365 )
						if( kinjun_sen <= 177.743 )
							if( tenkan_sen <= 177.222 )
								if( chinkou_span <= 177.047 )
									ret := 0.846154 // buy
								if( chinkou_span > 177.047 )
									ret := 0.978947 // buy
							if( tenkan_sen > 177.222 )
								ret := 0.750000 // buy
						if( kinjun_sen > 177.743 )
							ret := 0.500000
					if( basis_minus > -0.741365 )
						if( senkou_span_a <= 176.839 )
							if( senkou_span_a_displaced <= 176.513 )
								if( senkou_span_a <= 176.529 )
									ret := -0.928571 // sell
								if( senkou_span_a > 176.529 )
									ret := -0.083333
							if( senkou_span_a_displaced > 176.513 )
								if( senkou_span_b_displaced <= 177.656 )
									ret := 0.644628
								if( senkou_span_b_displaced > 177.656 )
									ret := -0.250000
						if( senkou_span_a > 176.839 )
							if( kinjun_sen <= 177.136 )
								if( basis_minus <= 0.013125 )
									ret := -0.073260
								if( basis_minus > 0.013125 )
									ret := -0.654762
							if( kinjun_sen > 177.136 )
								if( senkou_span_a_displaced <= 176.823 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 176.823 )
									ret := 0.148686
				if( chinkou_span > 178.062 )
					if( senkou_span_b_displaced <= 179.423 )
						if( senkou_span_a_displaced <= 176.481 )
							if( basis_max <= 1.18938 )
								ret := -1.000000 // sell
							if( basis_max > 1.18938 )
								ret := 0.538462
						if( senkou_span_a_displaced > 176.481 )
							if( kinjun_sen <= 177.786 )
								if( senkou_span_b <= 177.973 )
									ret := 0.757951 // buy
								if( senkou_span_b > 177.973 )
									ret := 0.138889
							if( kinjun_sen > 177.786 )
								ret := -0.600000
					if( senkou_span_b_displaced > 179.423 )
						if( chinkou_span <= 179.686 )
							ret := -1.000000 // sell
						if( chinkou_span > 179.686 )
							ret := -0.111111
			if( senkou_span_a > 177.679 )
				if( chinkou_span <= 178.3 )
					if( tenkan_sen <= 177.987 )
						if( senkou_span_a_displaced <= 179.464 )
							if( chinkou_span <= 177.765 )
								if( senkou_span_b_displaced <= 177.603 )
									ret := 0.217143
								if( senkou_span_b_displaced > 177.603 )
									ret := -0.448819
							if( chinkou_span > 177.765 )
								if( basis_minus <= 0.370826 )
									ret := 0.271375
								if( basis_minus > 0.370826 )
									ret := -0.467742
						if( senkou_span_a_displaced > 179.464 )
							if( tenkan_sen <= 177.889 )
								if( tenkan_sen <= 177.848 )
									ret := 1.000000 // buy
								if( tenkan_sen > 177.848 )
									ret := 0.833333 // buy
							if( tenkan_sen > 177.889 )
								ret := -0.153846
					if( tenkan_sen > 177.987 )
						if( senkou_span_b_displaced <= 179.353 )
							if( chinkou_span <= 177.729 )
								if( senkou_span_b_displaced <= 179.165 )
									ret := -0.517621
								if( senkou_span_b_displaced > 179.165 )
									ret := -1.000000 // sell
							if( chinkou_span > 177.729 )
								if( senkou_span_a_displaced <= 179.372 )
									ret := -0.264493
								if( senkou_span_a_displaced > 179.372 )
									ret := 0.714286 // buy
						if( senkou_span_b_displaced > 179.353 )
							if( basis_max <= 0.344062 )
								if( senkou_span_a <= 178.304 )
									ret := -0.105263
								if( senkou_span_a > 178.304 )
									ret := -0.881533 // sell
							if( basis_max > 0.344062 )
								if( basis_max <= 0.357608 )
									ret := 0.600000
								if( basis_max > 0.357608 )
									ret := -0.166667
				if( chinkou_span > 178.3 )
					if( tenkan_sen <= 178.59 )
						if( senkou_span_a <= 178.13 )
							if( senkou_span_b_displaced <= 178.352 )
								if( senkou_span_a_displaced <= 179.329 )
									ret := 0.502577
								if( senkou_span_a_displaced > 179.329 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 178.352 )
								if( senkou_span_a_displaced <= 179.222 )
									ret := 0.891892 // buy
								if( senkou_span_a_displaced > 179.222 )
									ret := 1.000000 // buy
						if( senkou_span_a > 178.13 )
							if( chinkou_span <= 178.621 )
								if( senkou_span_a_displaced <= 177.763 )
									ret := -0.395062
								if( senkou_span_a_displaced > 177.763 )
									ret := 0.120635
							if( chinkou_span > 178.621 )
								if( senkou_span_a_displaced <= 178.14 )
									ret := 0.160428
								if( senkou_span_a_displaced > 178.14 )
									ret := 0.701195 // buy
					if( tenkan_sen > 178.59 )
						if( chinkou_span <= 179.736 )
							if( tenkan_sen <= 179.45 )
								if( basis_minus <= -0.042501 )
									ret := 0.164246
								if( basis_minus > -0.042501 )
									ret := -0.169894
							if( tenkan_sen > 179.45 )
								if( senkou_span_b <= 180.684 )
									ret := -0.290108
								if( senkou_span_b > 180.684 )
									ret := -0.771117 // sell
						if( chinkou_span > 179.736 )
							if( tenkan_sen <= 180.18 )
								if( senkou_span_b_displaced <= 179.274 )
									ret := 0.519817
								if( senkou_span_b_displaced > 179.274 )
									ret := 0.212293
							if( tenkan_sen > 180.18 )
								if( chinkou_span <= 181.122 )
									ret := -0.199558
								if( chinkou_span > 181.122 )
									ret := 0.056655
	
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
float op_operation = decision_tree_0_AMZN_1Min_64dea7b1(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


