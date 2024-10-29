//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: XRPUSDT_1Min_1ICH_70faf77e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_1Min_1ICH_70faf77e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_1Min_70faf77e(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.000525 )
		if( chinkou_span <= 0.600525 )
			if( kinjun_sen <= 0.599599 )
				if( kinjun_sen <= 0.570351 )
					if( chinkou_span <= 0.570018 )
						if( senkou_span_b <= 0.568357 )
							if( chinkou_span <= 0.567804 )
								if( tenkan_sen <= 0.566746 )
									ret := 0.045726
								if( tenkan_sen > 0.566746 )
									ret := -0.235043
							if( chinkou_span > 0.567804 )
								if( tenkan_sen <= 0.568149 )
									ret := 0.505571
								if( tenkan_sen > 0.568149 )
									ret := 0.015528
						if( senkou_span_b > 0.568357 )
							if( senkou_span_a_displaced <= 0.574691 )
								if( senkou_span_a_displaced <= 0.570232 )
									ret := -0.101619
								if( senkou_span_a_displaced > 0.570232 )
									ret := -0.328378
							if( senkou_span_a_displaced > 0.574691 )
								if( senkou_span_b_displaced <= 0.579731 )
									ret := 0.966667 // buy
								if( senkou_span_b_displaced > 0.579731 )
									ret := -0.571429
					if( chinkou_span > 0.570018 )
						if( senkou_span_a <= 0.568474 )
							if( senkou_span_a_displaced <= 0.563678 )
								if( basis_max <= -0.002525 )
									ret := -0.285714
								if( basis_max > -0.002525 )
									ret := 0.525606
							if( senkou_span_a_displaced > 0.563678 )
								if( senkou_span_b_displaced <= 0.566683 )
									ret := 0.850220 // buy
								if( senkou_span_b_displaced > 0.566683 )
									ret := 0.641243
						if( senkou_span_a > 0.568474 )
							if( senkou_span_a_displaced <= 0.568851 )
								if( chinkou_span <= 0.573509 )
									ret := 0.058182
								if( chinkou_span > 0.573509 )
									ret := 0.649351
							if( senkou_span_a_displaced > 0.568851 )
								if( basis_minus <= 0.001088 )
									ret := 0.446339
								if( basis_minus > 0.001088 )
									ret := -0.225806
				if( kinjun_sen > 0.570351 )
					if( chinkou_span <= 0.572799 )
						if( tenkan_sen <= 0.575775 )
							if( chinkou_span <= 0.569493 )
								if( senkou_span_a <= 0.575374 )
									ret := -0.498308
								if( senkou_span_a > 0.575374 )
									ret := 0.411765
							if( chinkou_span > 0.569493 )
								if( tenkan_sen <= 0.571849 )
									ret := 0.052200
								if( tenkan_sen > 0.571849 )
									ret := -0.265625
						if( tenkan_sen > 0.575775 )
							if( basis_minus <= -0.001738 )
								if( kinjun_sen <= 0.581916 )
									ret := -0.357143
								if( kinjun_sen > 0.581916 )
									ret := 1.000000 // buy
							if( basis_minus > -0.001738 )
								if( senkou_span_b_displaced <= 0.570983 )
									ret := 0.230769
								if( senkou_span_b_displaced > 0.570983 )
									ret := -0.852814 // sell
					if( chinkou_span > 0.572799 )
						if( tenkan_sen <= 0.575385 )
							if( basis_max <= -0.0002 )
								if( chinkou_span <= 0.574795 )
									ret := -0.153846
								if( chinkou_span > 0.574795 )
									ret := 0.348515
							if( basis_max > -0.0002 )
								if( senkou_span_b <= 0.577182 )
									ret := 0.358259
								if( senkou_span_b > 0.577182 )
									ret := -0.333333
						if( tenkan_sen > 0.575385 )
							if( basis_max <= -0.000513 )
								if( chinkou_span <= 0.583099 )
									ret := -0.314790
								if( chinkou_span > 0.583099 )
									ret := -0.018277
							if( basis_max > -0.000513 )
								if( senkou_span_a <= 0.597807 )
									ret := 0.029052
								if( senkou_span_a > 0.597807 )
									ret := -0.117628
			if( kinjun_sen > 0.599599 )
				if( kinjun_sen <= 0.601101 )
					if( chinkou_span <= 0.595193 )
						if( kinjun_sen <= 0.600161 )
							if( chinkou_span <= 0.593587 )
								if( basis_max <= 0.00038 )
									ret := -0.375000
								if( basis_max > 0.00038 )
									ret := -1.000000 // sell
							if( chinkou_span > 0.593587 )
								ret := 0.250000
						if( kinjun_sen > 0.600161 )
							if( senkou_span_a_displaced <= 0.6027 )
								if( chinkou_span <= 0.594763 )
									ret := -0.956522 // sell
								if( chinkou_span > 0.594763 )
									ret := -0.571429
							if( senkou_span_a_displaced > 0.6027 )
								if( basis_max <= -0.000237 )
									ret := -1.000000 // sell
								if( basis_max > -0.000237 )
									ret := -0.200000
					if( chinkou_span > 0.595193 )
						if( chinkou_span <= 0.600099 )
							if( senkou_span_a_displaced <= 0.597975 )
								if( senkou_span_b <= 0.596207 )
									ret := 0.300000
								if( senkou_span_b > 0.596207 )
									ret := -0.703226 // sell
							if( senkou_span_a_displaced > 0.597975 )
								if( senkou_span_b_displaced <= 0.599745 )
									ret := -0.026810
								if( senkou_span_b_displaced > 0.599745 )
									ret := -0.335979
						if( chinkou_span > 0.600099 )
							if( kinjun_sen <= 0.600423 )
								if( kinjun_sen <= 0.600213 )
									ret := -0.136364
								if( kinjun_sen > 0.600213 )
									ret := -0.590909
							if( kinjun_sen > 0.600423 )
								if( senkou_span_b <= 0.599577 )
									ret := -0.545455
								if( senkou_span_b > 0.599577 )
									ret := 0.460317
				if( kinjun_sen > 0.601101 )
					if( chinkou_span <= 0.599151 )
						if( basis_max <= 0.0004 )
							if( senkou_span_b_displaced <= 0.608135 )
								if( senkou_span_a <= 0.601553 )
									ret := -0.837349 // sell
								if( senkou_span_a > 0.601553 )
									ret := -0.655385
							if( senkou_span_b_displaced > 0.608135 )
								if( senkou_span_a_displaced <= 0.613038 )
									ret := -0.988764 // sell
								if( senkou_span_a_displaced > 0.613038 )
									ret := -0.684211
						if( basis_max > 0.0004 )
							if( senkou_span_a_displaced <= 0.606516 )
								if( senkou_span_b <= 0.6035 )
									ret := -0.756098 // sell
								if( senkou_span_b > 0.6035 )
									ret := -0.250000
							if( senkou_span_a_displaced > 0.606516 )
								if( senkou_span_b <= 0.606671 )
									ret := 0.625000
								if( senkou_span_b > 0.606671 )
									ret := -0.470588
					if( chinkou_span > 0.599151 )
						if( senkou_span_b <= 0.602107 )
							if( basis_minus <= -0.001004 )
								if( senkou_span_a_displaced <= 0.601851 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.601851 )
									ret := -0.750000 // sell
							if( basis_minus > -0.001004 )
								if( senkou_span_b <= 0.600825 )
									ret := 0.181818
								if( senkou_span_b > 0.600825 )
									ret := -0.298643
						if( senkou_span_b > 0.602107 )
							if( kinjun_sen <= 0.603802 )
								if( senkou_span_a <= 0.602498 )
									ret := -0.691275
								if( senkou_span_a > 0.602498 )
									ret := -0.397129
							if( kinjun_sen > 0.603802 )
								if( senkou_span_a_displaced <= 0.619696 )
									ret := -0.793478 // sell
								if( senkou_span_a_displaced > 0.619696 )
									ret := -0.166667
		if( chinkou_span > 0.600525 )
			if( kinjun_sen <= 0.601247 )
				if( tenkan_sen <= 0.596099 )
					if( tenkan_sen <= 0.522224 )
						ret := -1.000000 // sell
					if( tenkan_sen > 0.522224 )
						if( basis_max <= -0.000948 )
							if( senkou_span_b_displaced <= 0.585007 )
								if( chinkou_span <= 0.617124 )
									ret := 0.987500 // buy
								if( chinkou_span > 0.617124 )
									ret := 0.250000
							if( senkou_span_b_displaced > 0.585007 )
								if( senkou_span_a_displaced <= 0.588087 )
									ret := -0.388889
								if( senkou_span_a_displaced > 0.588087 )
									ret := 0.754098 // buy
						if( basis_max > -0.000948 )
							if( basis_max <= -0.000126 )
								if( senkou_span_a_displaced <= 0.593169 )
									ret := 0.977376 // buy
								if( senkou_span_a_displaced > 0.593169 )
									ret := 0.880952 // buy
							if( basis_max > -0.000126 )
								if( chinkou_span <= 0.60415 )
									ret := 0.800000 // buy
								if( chinkou_span > 0.60415 )
									ret := 0.400000
				if( tenkan_sen > 0.596099 )
					if( basis_minus <= 0.0003 )
						if( senkou_span_a_displaced <= 0.6062 )
							if( chinkou_span <= 0.602507 )
								if( senkou_span_b <= 0.602277 )
									ret := 0.461690
								if( senkou_span_b > 0.602277 )
									ret := -0.136364
							if( chinkou_span > 0.602507 )
								if( senkou_span_b <= 0.600487 )
									ret := 0.388889
								if( senkou_span_b > 0.600487 )
									ret := 0.758355 // buy
						if( senkou_span_a_displaced > 0.6062 )
							if( chinkou_span <= 0.605776 )
								if( senkou_span_a <= 0.601008 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.601008 )
									ret := -0.750000 // sell
							if( chinkou_span > 0.605776 )
								if( senkou_span_b_displaced <= 0.610359 )
									ret := 0.000000
								if( senkou_span_b_displaced > 0.610359 )
									ret := 0.894737 // buy
					if( basis_minus > 0.0003 )
						if( tenkan_sen <= 0.599077 )
							if( basis_max <= -0.000213 )
								if( basis_minus <= 0.004554 )
									ret := 0.739336 // buy
								if( basis_minus > 0.004554 )
									ret := 0.256410
							if( basis_max > -0.000213 )
								if( senkou_span_b_displaced <= 0.5957 )
									ret := -0.181818
								if( senkou_span_b_displaced > 0.5957 )
									ret := 0.427184
						if( tenkan_sen > 0.599077 )
							if( senkou_span_b_displaced <= 0.603173 )
								if( chinkou_span <= 0.603314 )
									ret := 0.154113
								if( chinkou_span > 0.603314 )
									ret := 0.421053
							if( senkou_span_b_displaced > 0.603173 )
								if( basis_minus <= 0.001654 )
									ret := -0.944444 // sell
								if( basis_minus > 0.001654 )
									ret := 0.000000
			if( kinjun_sen > 0.601247 )
				if( chinkou_span <= 0.603289 )
					if( tenkan_sen <= 0.603593 )
						if( senkou_span_a <= 0.60184 )
							if( chinkou_span <= 0.60193 )
								if( senkou_span_b <= 0.602459 )
									ret := -0.074324
								if( senkou_span_b > 0.602459 )
									ret := 0.600000
							if( chinkou_span > 0.60193 )
								if( basis_max <= 0.000173 )
									ret := 0.529412
								if( basis_max > 0.000173 )
									ret := 0.017241
						if( senkou_span_a > 0.60184 )
							if( basis_minus <= 0.000333 )
								if( chinkou_span <= 0.60083 )
									ret := -0.471429
								if( chinkou_span > 0.60083 )
									ret := -0.029060
							if( basis_minus > 0.000333 )
								if( senkou_span_a <= 0.602785 )
									ret := -0.222222
								if( senkou_span_a > 0.602785 )
									ret := -0.496815
					if( tenkan_sen > 0.603593 )
						if( senkou_span_a_displaced <= 0.604037 )
							if( senkou_span_a <= 0.603587 )
								if( senkou_span_b_displaced <= 0.597475 )
									ret := 0.200000
								if( senkou_span_b_displaced > 0.597475 )
									ret := -0.652482
							if( senkou_span_a > 0.603587 )
								if( senkou_span_b_displaced <= 0.59965 )
									ret := -0.641026
								if( senkou_span_b_displaced > 0.59965 )
									ret := -0.121212
						if( senkou_span_a_displaced > 0.604037 )
							if( senkou_span_a <= 0.604306 )
								if( senkou_span_a_displaced <= 0.606312 )
									ret := -0.052632
								if( senkou_span_a_displaced > 0.606312 )
									ret := 0.800000 // buy
							if( senkou_span_a > 0.604306 )
								if( basis_max <= -0.000246 )
									ret := -0.326531
								if( basis_max > -0.000246 )
									ret := -0.706044 // sell
				if( chinkou_span > 0.603289 )
					if( tenkan_sen <= 0.606648 )
						if( chinkou_span <= 0.605601 )
							if( senkou_span_a <= 0.603392 )
								if( senkou_span_b <= 0.603978 )
									ret := 0.322931
								if( senkou_span_b > 0.603978 )
									ret := 0.773810 // buy
							if( senkou_span_a > 0.603392 )
								if( basis_minus <= -0.001784 )
									ret := 0.800000 // buy
								if( basis_minus > -0.001784 )
									ret := -0.095122
						if( chinkou_span > 0.605601 )
							if( tenkan_sen <= 0.605203 )
								if( basis_minus <= -0.001493 )
									ret := 0.726115 // buy
								if( basis_minus > -0.001493 )
									ret := 0.258344
							if( tenkan_sen > 0.605203 )
								if( tenkan_sen <= 0.605698 )
									ret := 0.787402 // buy
								if( tenkan_sen > 0.605698 )
									ret := 0.477358
					if( tenkan_sen > 0.606648 )
						if( chinkou_span <= 0.609678 )
							if( senkou_span_a_displaced <= 0.609024 )
								if( senkou_span_b <= 0.601325 )
									ret := -0.916667 // sell
								if( senkou_span_b > 0.601325 )
									ret := -0.050251
							if( senkou_span_a_displaced > 0.609024 )
								if( tenkan_sen <= 0.625592 )
									ret := -0.356771
								if( tenkan_sen > 0.625592 )
									ret := 0.696970
						if( chinkou_span > 0.609678 )
							if( tenkan_sen <= 0.610349 )
								if( senkou_span_b_displaced <= 0.612211 )
									ret := 0.409589
								if( senkou_span_b_displaced > 0.612211 )
									ret := 0.050000
							if( tenkan_sen > 0.610349 )
								if( chinkou_span <= 0.615345 )
									ret := -0.175646
								if( chinkou_span > 0.615345 )
									ret := 0.080555
	if( basis_max > 0.000525 )
		if( chinkou_span <= 0.567652 )
			if( senkou_span_b <= 0.565154 )
				if( chinkou_span <= 0.558617 )
					if( tenkan_sen <= 0.555636 )
						if( basis_minus <= 0.003876 )
							if( chinkou_span <= 0.555215 )
								if( kinjun_sen <= 0.551446 )
									ret := 0.159282
								if( kinjun_sen > 0.551446 )
									ret := -0.124172
							if( chinkou_span > 0.555215 )
								if( senkou_span_b <= 0.560823 )
									ret := 0.784314 // buy
								if( senkou_span_b > 0.560823 )
									ret := -0.571429
						if( basis_minus > 0.003876 )
							if( senkou_span_a_displaced <= 0.528999 )
								if( senkou_span_a <= 0.470129 )
									ret := -0.937500 // sell
								if( senkou_span_a > 0.470129 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.528999 )
								ret := -0.500000
					if( tenkan_sen > 0.555636 )
						if( chinkou_span <= 0.556774 )
							if( senkou_span_b <= 0.564107 )
								if( basis_max <= 0.001829 )
									ret := -0.726190 // sell
								if( basis_max > 0.001829 )
									ret := 1.000000 // buy
							if( senkou_span_b > 0.564107 )
								if( tenkan_sen <= 0.559977 )
									ret := -1.000000 // sell
								if( tenkan_sen > 0.559977 )
									ret := 1.000000 // buy
						if( chinkou_span > 0.556774 )
							if( senkou_span_a_displaced <= 0.561942 )
								if( kinjun_sen <= 0.558562 )
									ret := -0.354839
								if( kinjun_sen > 0.558562 )
									ret := 0.694915
							if( senkou_span_a_displaced > 0.561942 )
								if( chinkou_span <= 0.558302 )
									ret := -0.266667
								if( chinkou_span > 0.558302 )
									ret := -0.833333 // sell
				if( chinkou_span > 0.558617 )
					if( basis_minus <= -0.000259 )
						if( senkou_span_b_displaced <= 0.571073 )
							if( senkou_span_b <= 0.562396 )
								if( kinjun_sen <= 0.561335 )
									ret := 0.875776 // buy
								if( kinjun_sen > 0.561335 )
									ret := 0.542857
							if( senkou_span_b > 0.562396 )
								if( senkou_span_a <= 0.559848 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.559848 )
									ret := 0.500000
						if( senkou_span_b_displaced > 0.571073 )
							if( tenkan_sen <= 0.552844 )
								ret := -1.000000 // sell
							if( tenkan_sen > 0.552844 )
								ret := -0.500000
					if( basis_minus > -0.000259 )
						if( senkou_span_b_displaced <= 0.5539 )
							if( chinkou_span <= 0.560696 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.560696 )
								ret := 0.166667
						if( senkou_span_b_displaced > 0.5539 )
							if( basis_max <= 0.000579 )
								if( senkou_span_a_displaced <= 0.56125 )
									ret := 0.250000
								if( senkou_span_a_displaced > 0.56125 )
									ret := 0.000000
							if( basis_max > 0.000579 )
								if( basis_max <= 0.001088 )
									ret := -0.714286 // sell
								if( basis_max > 0.001088 )
									ret := 0.000000
			if( senkou_span_b > 0.565154 )
				if( senkou_span_a <= 0.573303 )
					if( chinkou_span <= 0.566201 )
						if( chinkou_span <= 0.560252 )
							if( chinkou_span <= 0.5486 )
								ret := 0.500000
							if( chinkou_span > 0.5486 )
								if( senkou_span_a <= 0.5729 )
									ret := -0.886179 // sell
								if( senkou_span_a > 0.5729 )
									ret := 0.000000
						if( chinkou_span > 0.560252 )
							if( basis_minus <= -0.000475 )
								if( senkou_span_a_displaced <= 0.569862 )
									ret := -0.427729
								if( senkou_span_a_displaced > 0.569862 )
									ret := -0.103261
							if( basis_minus > -0.000475 )
								ret := -1.000000 // sell
					if( chinkou_span > 0.566201 )
						if( senkou_span_a_displaced <= 0.570944 )
							if( senkou_span_b_displaced <= 0.56751 )
								ret := -0.666667
							if( senkou_span_b_displaced > 0.56751 )
								if( chinkou_span <= 0.566504 )
									ret := 0.230769
								if( chinkou_span > 0.566504 )
									ret := 0.731707 // buy
						if( senkou_span_a_displaced > 0.570944 )
							if( senkou_span_a_displaced <= 0.571123 )
								if( senkou_span_b <= 0.570884 )
									ret := -0.750000 // sell
								if( senkou_span_b > 0.570884 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.571123 )
								if( tenkan_sen <= 0.571 )
									ret := -0.040816
								if( tenkan_sen > 0.571 )
									ret := -1.000000 // sell
				if( senkou_span_a > 0.573303 )
					if( senkou_span_b_displaced <= 0.578436 )
						if( chinkou_span <= 0.565566 )
							ret := 1.000000 // buy
						if( chinkou_span > 0.565566 )
							if( senkou_span_b <= 0.575506 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.575506 )
								ret := 0.333333
					if( senkou_span_b_displaced > 0.578436 )
						if( basis_max <= 0.001137 )
							if( basis_minus <= -0.002088 )
								if( senkou_span_a_displaced <= 0.578304 )
									ret := 0.666667
								if( senkou_span_a_displaced > 0.578304 )
									ret := -1.000000 // sell
							if( basis_minus > -0.002088 )
								if( senkou_span_a <= 0.574888 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.574888 )
									ret := -0.750000 // sell
						if( basis_max > 0.001137 )
							if( chinkou_span <= 0.561165 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.561165 )
								ret := 0.500000
		if( chinkou_span > 0.567652 )
			if( tenkan_sen <= 0.582738 )
				if( chinkou_span <= 0.582061 )
					if( senkou_span_b_displaced <= 0.573496 )
						if( kinjun_sen <= 0.571375 )
							if( chinkou_span <= 0.569504 )
								if( tenkan_sen <= 0.565299 )
									ret := 0.835443 // buy
								if( tenkan_sen > 0.565299 )
									ret := 0.359551
							if( chinkou_span > 0.569504 )
								if( basis_minus <= -0.002005 )
									ret := 0.989247 // buy
								if( basis_minus > -0.002005 )
									ret := 0.803738 // buy
						if( kinjun_sen > 0.571375 )
							if( kinjun_sen <= 0.572378 )
								if( senkou_span_a_displaced <= 0.573312 )
									ret := 0.098039
								if( senkou_span_a_displaced > 0.573312 )
									ret := -0.631579
							if( kinjun_sen > 0.572378 )
								if( senkou_span_a_displaced <= 0.571775 )
									ret := -0.045455
								if( senkou_span_a_displaced > 0.571775 )
									ret := 0.626263
					if( senkou_span_b_displaced > 0.573496 )
						if( chinkou_span <= 0.569784 )
							if( senkou_span_a_displaced <= 0.5776 )
								if( senkou_span_a <= 0.568939 )
									ret := -0.407895
								if( senkou_span_a > 0.568939 )
									ret := 0.285714
							if( senkou_span_a_displaced > 0.5776 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.569784 )
							if( kinjun_sen <= 0.574724 )
								if( chinkou_span <= 0.57182 )
									ret := 0.427586
								if( chinkou_span > 0.57182 )
									ret := 0.775701 // buy
							if( kinjun_sen > 0.574724 )
								if( chinkou_span <= 0.574183 )
									ret := -0.240437
								if( chinkou_span > 0.574183 )
									ret := 0.332947
				if( chinkou_span > 0.582061 )
					if( senkou_span_b <= 0.590194 )
						if( senkou_span_a_displaced <= 0.577012 )
							if( basis_minus <= 0.00092 )
								ret := -1.000000 // sell
							if( basis_minus > 0.00092 )
								ret := -0.750000 // sell
						if( senkou_span_a_displaced > 0.577012 )
							if( senkou_span_a_displaced <= 0.588956 )
								if( basis_minus <= -0.000896 )
									ret := 0.811321 // buy
								if( basis_minus > -0.000896 )
									ret := 0.511111
							if( senkou_span_a_displaced > 0.588956 )
								if( senkou_span_b_displaced <= 0.590461 )
									ret := 0.056604
								if( senkou_span_b_displaced > 0.590461 )
									ret := 0.846154 // buy
					if( senkou_span_b > 0.590194 )
						ret := -1.000000 // sell
			if( tenkan_sen > 0.582738 )
				if( senkou_span_a <= 0.586834 )
					if( chinkou_span <= 0.585582 )
						if( senkou_span_a <= 0.584267 )
							if( senkou_span_a_displaced <= 0.58343 )
								if( senkou_span_b_displaced <= 0.583866 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.583866 )
									ret := 0.285714
							if( senkou_span_a_displaced > 0.58343 )
								if( senkou_span_b_displaced <= 0.586395 )
									ret := -0.442308
								if( senkou_span_b_displaced > 0.586395 )
									ret := 0.162162
						if( senkou_span_a > 0.584267 )
							if( senkou_span_b_displaced <= 0.591998 )
								if( senkou_span_b_displaced <= 0.586375 )
									ret := -0.796053 // sell
								if( senkou_span_b_displaced > 0.586375 )
									ret := -0.458333
							if( senkou_span_b_displaced > 0.591998 )
								ret := 0.833333 // buy
					if( chinkou_span > 0.585582 )
						if( basis_max <= 0.001213 )
							if( basis_minus <= 0.001425 )
								if( chinkou_span <= 0.586605 )
									ret := 0.280702
								if( chinkou_span > 0.586605 )
									ret := 0.706422 // buy
							if( basis_minus > 0.001425 )
								if( senkou_span_a_displaced <= 0.583707 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.583707 )
									ret := -0.750000 // sell
						if( basis_max > 0.001213 )
							if( senkou_span_b_displaced <= 0.597375 )
								ret := -0.400000
							if( senkou_span_b_displaced > 0.597375 )
								ret := -1.000000 // sell
				if( senkou_span_a > 0.586834 )
					if( chinkou_span <= 0.589598 )
						if( tenkan_sen <= 0.587058 )
							if( chinkou_span <= 0.584119 )
								if( basis_minus <= 0.001113 )
									ret := -0.492537
								if( basis_minus > 0.001113 )
									ret := 1.000000 // buy
							if( chinkou_span > 0.584119 )
								if( basis_minus <= -0.007702 )
									ret := -0.900000 // sell
								if( basis_minus > -0.007702 )
									ret := 0.706767 // buy
						if( tenkan_sen > 0.587058 )
							if( tenkan_sen <= 0.60035 )
								if( tenkan_sen <= 0.593463 )
									ret := -0.117271
								if( tenkan_sen > 0.593463 )
									ret := -0.786207 // sell
							if( tenkan_sen > 0.60035 )
								if( senkou_span_a <= 0.604908 )
									ret := 0.818182 // buy
								if( senkou_span_a > 0.604908 )
									ret := -0.470588
					if( chinkou_span > 0.589598 )
						if( senkou_span_a <= 0.591417 )
							if( kinjun_sen <= 0.5899 )
								if( senkou_span_a_displaced <= 0.596187 )
									ret := 0.851429 // buy
								if( senkou_span_a_displaced > 0.596187 )
									ret := 0.000000
							if( kinjun_sen > 0.5899 )
								if( senkou_span_a_displaced <= 0.592397 )
									ret := -0.087719
								if( senkou_span_a_displaced > 0.592397 )
									ret := 0.588015
						if( senkou_span_a > 0.591417 )
							if( chinkou_span <= 0.604915 )
								if( senkou_span_a <= 0.602048 )
									ret := 0.209024
								if( senkou_span_a > 0.602048 )
									ret := -0.314889
							if( chinkou_span > 0.604915 )
								if( tenkan_sen <= 0.608379 )
									ret := 0.475207
								if( tenkan_sen > 0.608379 )
									ret := 0.154109
	
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
float op_operation = decision_tree_0_XRPUSDT_1Min_70faf77e(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


