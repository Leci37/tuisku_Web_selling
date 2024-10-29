//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BTCUSDT_5Min_1ICH_69e4a938 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_5Min_1ICH_69e4a938", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_5Min_69e4a938(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -35.7861 )
		if( senkou_span_a <= 69169.6 )
			if( chinkou_span <= 68822.5 )
				if( tenkan_sen <= 68458.2 )
					if( chinkou_span <= 68307 )
						if( chinkou_span <= 64554 )
							if( tenkan_sen <= 63923 )
								if( chinkou_span <= 63670.7 )
									ret := 0.001441
								if( chinkou_span > 63670.7 )
									ret := 0.235944
							if( tenkan_sen > 63923 )
								if( chinkou_span <= 63928.7 )
									ret := -0.669708
								if( chinkou_span > 63928.7 )
									ret := -0.247469
						if( chinkou_span > 64554 )
							if( senkou_span_b <= 65878.9 )
								if( senkou_span_a_displaced <= 63617.6 )
									ret := 0.583607
								if( senkou_span_a_displaced > 63617.6 )
									ret := 0.188710
							if( senkou_span_b > 65878.9 )
								if( chinkou_span <= 66209 )
									ret := -0.557971
								if( chinkou_span > 66209 )
									ret := -0.017740
					if( chinkou_span > 68307 )
						if( senkou_span_a_displaced <= 68294.9 )
							if( kinjun_sen <= 68155.2 )
								if( basis_max <= -187.365 )
									ret := -0.200000
								if( basis_max > -187.365 )
									ret := 0.624204
							if( kinjun_sen > 68155.2 )
								if( senkou_span_b_displaced <= 67631.7 )
									ret := -0.526316
								if( senkou_span_b_displaced > 67631.7 )
									ret := 0.600000
						if( senkou_span_a_displaced > 68294.9 )
							if( tenkan_sen <= 68077.1 )
								if( senkou_span_a <= 67861 )
									ret := -1.000000 // sell
								if( senkou_span_a > 67861 )
									ret := -0.500000
							if( tenkan_sen > 68077.1 )
								if( basis_minus <= 118.233 )
									ret := 0.071429
								if( basis_minus > 118.233 )
									ret := -0.800000 // sell
				if( tenkan_sen > 68458.2 )
					if( senkou_span_b_displaced <= 68852 )
						if( chinkou_span <= 68711.5 )
							if( senkou_span_a_displaced <= 68364.3 )
								if( senkou_span_b_displaced <= 67401.2 )
									ret := -0.120000
								if( senkou_span_b_displaced > 67401.2 )
									ret := -0.752212 // sell
							if( senkou_span_a_displaced > 68364.3 )
								if( chinkou_span <= 68432 )
									ret := -0.657895
								if( chinkou_span > 68432 )
									ret := -0.234043
						if( chinkou_span > 68711.5 )
							if( senkou_span_b <= 68610.3 )
								if( senkou_span_b_displaced <= 68368.6 )
									ret := 0.740741 // buy
								if( senkou_span_b_displaced > 68368.6 )
									ret := -0.230769
							if( senkou_span_b > 68610.3 )
								if( senkou_span_b_displaced <= 68357.4 )
									ret := -0.904762 // sell
								if( senkou_span_b_displaced > 68357.4 )
									ret := -0.272727
					if( senkou_span_b_displaced > 68852 )
						if( basis_max <= -50.87 )
							if( senkou_span_b_displaced <= 69369.7 )
								if( senkou_span_b <= 68984.6 )
									ret := -1.000000 // sell
								if( senkou_span_b > 68984.6 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 69369.7 )
								if( chinkou_span <= 68627.8 )
									ret := -0.500000
								if( chinkou_span > 68627.8 )
									ret := -1.000000 // sell
						if( basis_max > -50.87 )
							ret := -0.571429
			if( chinkou_span > 68822.5 )
				if( senkou_span_b <= 67697.8 )
					if( senkou_span_b_displaced <= 66926.9 )
						if( tenkan_sen <= 67618.4 )
							ret := 0.400000
						if( tenkan_sen > 67618.4 )
							ret := 1.000000 // buy
					if( senkou_span_b_displaced > 66926.9 )
						if( tenkan_sen <= 67936.9 )
							if( chinkou_span <= 69274.6 )
								ret := -0.600000
							if( chinkou_span > 69274.6 )
								if( senkou_span_a <= 67814 )
									ret := 0.000000
								if( senkou_span_a > 67814 )
									ret := -0.333333
						if( tenkan_sen > 67936.9 )
							if( kinjun_sen <= 67690.2 )
								ret := -0.750000 // sell
							if( kinjun_sen > 67690.2 )
								ret := -1.000000 // sell
				if( senkou_span_b > 67697.8 )
					if( kinjun_sen <= 68828.1 )
						if( tenkan_sen <= 69515.4 )
							if( senkou_span_b_displaced <= 67602.8 )
								if( senkou_span_a <= 68877.3 )
									ret := 0.858491 // buy
								if( senkou_span_a > 68877.3 )
									ret := 0.000000
							if( senkou_span_b_displaced > 67602.8 )
								if( senkou_span_b_displaced <= 68063.7 )
									ret := 0.311927
								if( senkou_span_b_displaced > 68063.7 )
									ret := 0.605678
						if( tenkan_sen > 69515.4 )
							ret := -1.000000 // sell
					if( kinjun_sen > 68828.1 )
						if( senkou_span_a_displaced <= 68401.4 )
							if( senkou_span_b <= 68706.6 )
								if( basis_minus <= 448.646 )
									ret := -0.428571
								if( basis_minus > 448.646 )
									ret := 0.714286 // buy
							if( senkou_span_b > 68706.6 )
								if( senkou_span_b_displaced <= 68312.1 )
									ret := -0.956522 // sell
								if( senkou_span_b_displaced > 68312.1 )
									ret := 0.250000
						if( senkou_span_a_displaced > 68401.4 )
							if( chinkou_span <= 69435.5 )
								if( basis_max <= -88.4958 )
									ret := -0.324324
								if( basis_max > -88.4958 )
									ret := 0.369231
							if( chinkou_span > 69435.5 )
								if( kinjun_sen <= 68929.2 )
									ret := 0.500000
								if( kinjun_sen > 68929.2 )
									ret := 0.956522 // buy
		if( senkou_span_a > 69169.6 )
			if( chinkou_span <= 69985 )
				if( chinkou_span <= 68594.2 )
					if( senkou_span_b <= 69787.4 )
						if( tenkan_sen <= 69437.2 )
							if( senkou_span_b <= 68915.8 )
								ret := -1.000000 // sell
							if( senkou_span_b > 68915.8 )
								ret := -0.333333
						if( tenkan_sen > 69437.2 )
							if( basis_max <= -43.4631 )
								if( chinkou_span <= 68470 )
									ret := -1.000000 // sell
								if( chinkou_span > 68470 )
									ret := -0.833333 // sell
							if( basis_max > -43.4631 )
								ret := -0.750000 // sell
					if( senkou_span_b > 69787.4 )
						if( senkou_span_a_displaced <= 69708.9 )
							ret := -1.000000 // sell
						if( senkou_span_a_displaced > 69708.9 )
							if( senkou_span_a <= 69889 )
								ret := 0.000000
							if( senkou_span_a > 69889 )
								ret := -0.500000
				if( chinkou_span > 68594.2 )
					if( tenkan_sen <= 69700.8 )
						if( basis_max <= -49.9721 )
							if( senkou_span_a <= 69359.9 )
								if( senkou_span_a <= 69204.1 )
									ret := -0.083333
								if( senkou_span_a > 69204.1 )
									ret := -0.589286
							if( senkou_span_a > 69359.9 )
								if( chinkou_span <= 69790.1 )
									ret := -0.292683
								if( chinkou_span > 69790.1 )
									ret := 0.545455
						if( basis_max > -49.9721 )
							if( basis_minus <= 218.638 )
								if( senkou_span_b_displaced <= 69359.9 )
									ret := -0.424242
								if( senkou_span_b_displaced > 69359.9 )
									ret := 0.000000
							if( basis_minus > 218.638 )
								if( chinkou_span <= 69399.9 )
									ret := -0.200000
								if( chinkou_span > 69399.9 )
									ret := 0.718750 // buy
					if( tenkan_sen > 69700.8 )
						if( chinkou_span <= 68979.1 )
							if( kinjun_sen <= 69690.5 )
								if( senkou_span_a_displaced <= 69499.4 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 69499.4 )
									ret := 0.800000 // buy
							if( kinjun_sen > 69690.5 )
								if( basis_max <= -59.8271 )
									ret := 0.200000
								if( basis_max > -59.8271 )
									ret := -1.000000 // sell
						if( chinkou_span > 68979.1 )
							if( basis_max <= -154.861 )
								if( senkou_span_a <= 69633 )
									ret := -0.962963 // sell
								if( senkou_span_a > 69633 )
									ret := -0.763158 // sell
							if( basis_max > -154.861 )
								if( kinjun_sen <= 70919.8 )
									ret := -0.506329
								if( kinjun_sen > 70919.8 )
									ret := 0.500000
			if( chinkou_span > 69985 )
				if( senkou_span_b <= 70130.6 )
					if( senkou_span_b_displaced <= 68264.4 )
						if( senkou_span_a_displaced <= 67724.1 )
							ret := 0.500000
						if( senkou_span_a_displaced > 67724.1 )
							if( senkou_span_a <= 69976.9 )
								if( basis_max <= -157.611 )
									ret := 0.875000 // buy
								if( basis_max > -157.611 )
									ret := 1.000000 // buy
							if( senkou_span_a > 69976.9 )
								if( basis_max <= -279.893 )
									ret := 0.923077 // buy
								if( basis_max > -279.893 )
									ret := 0.200000
					if( senkou_span_b_displaced > 68264.4 )
						if( kinjun_sen <= 69936.7 )
							if( senkou_span_b <= 69421.1 )
								if( chinkou_span <= 70571.5 )
									ret := 0.621622
								if( chinkou_span > 70571.5 )
									ret := -0.542857
							if( senkou_span_b > 69421.1 )
								if( chinkou_span <= 70103.7 )
									ret := -0.134615
								if( chinkou_span > 70103.7 )
									ret := 0.695652
						if( kinjun_sen > 69936.7 )
							if( senkou_span_a <= 70642.7 )
								if( senkou_span_a <= 70421.5 )
									ret := 0.161290
								if( senkou_span_a > 70421.5 )
									ret := -0.360656
							if( senkou_span_a > 70642.7 )
								if( chinkou_span <= 72015.3 )
									ret := 0.736842 // buy
								if( chinkou_span > 72015.3 )
									ret := -0.600000
				if( senkou_span_b > 70130.6 )
					if( senkou_span_b_displaced <= 70686.6 )
						if( chinkou_span <= 71318.6 )
							if( chinkou_span <= 71150.7 )
								if( senkou_span_b <= 70372.2 )
									ret := -0.282051
								if( senkou_span_b > 70372.2 )
									ret := 0.149758
							if( chinkou_span > 71150.7 )
								if( basis_minus <= 721.232 )
									ret := -0.964286 // sell
								if( basis_minus > 721.232 )
									ret := -0.333333
						if( chinkou_span > 71318.6 )
							if( tenkan_sen <= 72085 )
								if( basis_minus <= 1354.08 )
									ret := 0.593220
								if( basis_minus > 1354.08 )
									ret := -0.250000
							if( tenkan_sen > 72085 )
								if( basis_minus <= 790.775 )
									ret := -1.000000 // sell
								if( basis_minus > 790.775 )
									ret := -0.250000
					if( senkou_span_b_displaced > 70686.6 )
						if( senkou_span_a <= 71265.1 )
							if( tenkan_sen <= 71187.1 )
								if( chinkou_span <= 70778.9 )
									ret := -0.589744
								if( chinkou_span > 70778.9 )
									ret := -0.161290
							if( tenkan_sen > 71187.1 )
								if( chinkou_span <= 71056 )
									ret := -0.840909 // sell
								if( chinkou_span > 71056 )
									ret := -0.264706
						if( senkou_span_a > 71265.1 )
							if( basis_max <= -60.487 )
								if( chinkou_span <= 71984.9 )
									ret := -0.496933
								if( chinkou_span > 71984.9 )
									ret := -0.108527
							if( basis_max > -60.487 )
								if( chinkou_span <= 71000.6 )
									ret := -0.714286 // sell
								if( chinkou_span > 71000.6 )
									ret := 0.230769
	if( basis_max > -35.7861 )
		if( chinkou_span <= 29548 )
			if( tenkan_sen <= 29554.9 )
				if( senkou_span_a_displaced <= 25641.5 )
					if( basis_minus <= 6.06046 )
						if( basis_max <= -16.7224 )
							if( senkou_span_a_displaced <= 25166.3 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 25166.3 )
								if( senkou_span_a <= 25164.6 )
									ret := -0.800000 // sell
								if( senkou_span_a > 25164.6 )
									ret := -0.333333
						if( basis_max > -16.7224 )
							if( senkou_span_a <= 25039.8 )
								ret := 0.000000
							if( senkou_span_a > 25039.8 )
								if( basis_minus <= -113.991 )
									ret := 0.645161
								if( basis_minus > -113.991 )
									ret := 0.923077 // buy
					if( basis_minus > 6.06046 )
						if( kinjun_sen <= 25161.6 )
							if( basis_minus <= 10.2875 )
								if( basis_max <= -22.3263 )
									ret := 1.000000 // buy
								if( basis_max > -22.3263 )
									ret := 0.250000
							if( basis_minus > 10.2875 )
								if( senkou_span_b_displaced <= 25081.7 )
									ret := -0.066667
								if( senkou_span_b_displaced > 25081.7 )
									ret := -0.777778 // sell
						if( kinjun_sen > 25161.6 )
							if( senkou_span_b <= 25638.5 )
								if( chinkou_span <= 25772.6 )
									ret := 0.863636 // buy
								if( chinkou_span > 25772.6 )
									ret := 0.314286
							if( senkou_span_b > 25638.5 )
								if( kinjun_sen <= 25707.2 )
									ret := -1.000000 // sell
								if( kinjun_sen > 25707.2 )
									ret := 0.000000
				if( senkou_span_a_displaced > 25641.5 )
					if( basis_minus <= -705.932 )
						if( chinkou_span <= 28371.9 )
							ret := 0.000000
						if( chinkou_span > 28371.9 )
							if( basis_max <= -10.4309 )
								ret := 1.000000 // buy
							if( basis_max > -10.4309 )
								if( chinkou_span <= 28515.9 )
									ret := 1.000000 // buy
								if( chinkou_span > 28515.9 )
									ret := 0.375000
					if( basis_minus > -705.932 )
						if( basis_minus <= -344.578 )
							if( basis_minus <= -624.134 )
								ret := 0.000000
							if( basis_minus > -624.134 )
								if( kinjun_sen <= 26175.5 )
									ret := -0.600000
								if( kinjun_sen > 26175.5 )
									ret := -0.952381 // sell
						if( basis_minus > -344.578 )
							if( chinkou_span <= 27113.1 )
								if( tenkan_sen <= 27055.9 )
									ret := -0.004886
								if( tenkan_sen > 27055.9 )
									ret := -0.396414
							if( chinkou_span > 27113.1 )
								if( senkou_span_a <= 27151.8 )
									ret := 0.568588
								if( senkou_span_a > 27151.8 )
									ret := 0.015121
			if( tenkan_sen > 29554.9 )
				if( chinkou_span <= 29462.6 )
					if( senkou_span_a <= 29788 )
						if( basis_minus <= -53.865 )
							if( senkou_span_a_displaced <= 29676.1 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 29676.1 )
								ret := 0.000000
						if( basis_minus > -53.865 )
							if( kinjun_sen <= 29561.4 )
								if( tenkan_sen <= 29561.1 )
									ret := -0.625000
								if( tenkan_sen > 29561.1 )
									ret := 0.000000
							if( kinjun_sen > 29561.4 )
								if( senkou_span_b_displaced <= 29466.5 )
									ret := -0.666667
								if( senkou_span_b_displaced > 29466.5 )
									ret := -0.983333 // sell
					if( senkou_span_a > 29788 )
						if( tenkan_sen <= 29827.1 )
							ret := 0.000000
						if( tenkan_sen > 29827.1 )
							ret := -0.600000
				if( chinkou_span > 29462.6 )
					if( kinjun_sen <= 29946.6 )
						if( senkou_span_b_displaced <= 29707.2 )
							if( senkou_span_b <= 29705.2 )
								if( senkou_span_b <= 29570.7 )
									ret := 0.352941
								if( senkou_span_b > 29570.7 )
									ret := -0.217391
							if( senkou_span_b > 29705.2 )
								ret := 1.000000 // buy
						if( senkou_span_b_displaced > 29707.2 )
							if( basis_minus <= -71.506 )
								if( basis_max <= 20.3925 )
									ret := 0.142857
								if( basis_max > 20.3925 )
									ret := -0.607143
							if( basis_minus > -71.506 )
								ret := -1.000000 // sell
					if( kinjun_sen > 29946.6 )
						ret := -1.000000 // sell
		if( chinkou_span > 29548 )
			if( kinjun_sen <= 63164.4 )
				if( chinkou_span <= 63263.7 )
					if( chinkou_span <= 62301.2 )
						if( tenkan_sen <= 62570 )
							if( senkou_span_a_displaced <= 58646.6 )
								if( chinkou_span <= 58242.3 )
									ret := 0.086650
								if( chinkou_span > 58242.3 )
									ret := 0.439705
							if( senkou_span_a_displaced > 58646.6 )
								if( chinkou_span <= 58819 )
									ret := -0.411674
								if( chinkou_span > 58819 )
									ret := 0.066512
						if( tenkan_sen > 62570 )
							if( chinkou_span <= 61994.8 )
								if( senkou_span_a <= 62650.8 )
									ret := -0.533333
								if( senkou_span_a > 62650.8 )
									ret := -0.885135 // sell
							if( chinkou_span > 61994.8 )
								if( tenkan_sen <= 62858.5 )
									ret := -0.610526
								if( tenkan_sen > 62858.5 )
									ret := 0.000000
					if( chinkou_span > 62301.2 )
						if( tenkan_sen <= 62289.4 )
							if( senkou_span_a_displaced <= 63990.3 )
								if( kinjun_sen <= 61980.8 )
									ret := 0.866359 // buy
								if( kinjun_sen > 61980.8 )
									ret := 0.593909
							if( senkou_span_a_displaced > 63990.3 )
								if( kinjun_sen <= 62303.3 )
									ret := -1.000000 // sell
								if( kinjun_sen > 62303.3 )
									ret := -0.428571
						if( tenkan_sen > 62289.4 )
							if( kinjun_sen <= 62721.1 )
								if( senkou_span_b <= 62683.2 )
									ret := 0.222807
								if( senkou_span_b > 62683.2 )
									ret := 0.539548
							if( kinjun_sen > 62721.1 )
								if( basis_minus <= -207.952 )
									ret := 0.319588
								if( basis_minus > -207.952 )
									ret := 0.003944
				if( chinkou_span > 63263.7 )
					if( basis_max <= 2.20898 )
						if( senkou_span_b_displaced <= 63729 )
							if( basis_minus <= 23.0351 )
								if( kinjun_sen <= 63013.9 )
									ret := 0.093750
								if( kinjun_sen > 63013.9 )
									ret := 0.641509
							if( basis_minus > 23.0351 )
								if( senkou_span_a_displaced <= 62871.3 )
									ret := 0.793548 // buy
								if( senkou_span_a_displaced > 62871.3 )
									ret := 0.342105
						if( senkou_span_b_displaced > 63729 )
							if( tenkan_sen <= 62814.7 )
								ret := -0.400000
							if( tenkan_sen > 62814.7 )
								ret := -1.000000 // sell
					if( basis_max > 2.20898 )
						if( tenkan_sen <= 62927 )
							if( kinjun_sen <= 62709.3 )
								if( senkou_span_a <= 62639.8 )
									ret := 0.821429 // buy
								if( senkou_span_a > 62639.8 )
									ret := 0.000000
							if( kinjun_sen > 62709.3 )
								if( basis_max <= 35.9138 )
									ret := 0.813953 // buy
								if( basis_max > 35.9138 )
									ret := 0.945455 // buy
						if( tenkan_sen > 62927 )
							if( tenkan_sen <= 63001.2 )
								if( tenkan_sen <= 62997.4 )
									ret := 0.333333
								if( tenkan_sen > 62997.4 )
									ret := -0.666667
							if( tenkan_sen > 63001.2 )
								if( chinkou_span <= 63334 )
									ret := 0.125000
								if( chinkou_span > 63334 )
									ret := 0.721739 // buy
			if( kinjun_sen > 63164.4 )
				if( senkou_span_b_displaced <= 63979 )
					if( chinkou_span <= 63139.2 )
						if( tenkan_sen <= 63149.9 )
							if( basis_max <= 85.1841 )
								if( senkou_span_a <= 63191.8 )
									ret := -0.071429
								if( senkou_span_a > 63191.8 )
									ret := 0.928571 // buy
							if( basis_max > 85.1841 )
								if( senkou_span_a <= 63138.1 )
									ret := -0.153846
								if( senkou_span_a > 63138.1 )
									ret := -0.750000 // sell
						if( tenkan_sen > 63149.9 )
							if( senkou_span_a <= 63929.4 )
								if( senkou_span_a <= 63197.4 )
									ret := -0.819149 // sell
								if( senkou_span_a > 63197.4 )
									ret := -0.498681
							if( senkou_span_a > 63929.4 )
								ret := 1.000000 // buy
					if( chinkou_span > 63139.2 )
						if( kinjun_sen <= 63512.2 )
							if( chinkou_span <= 63414.5 )
								if( tenkan_sen <= 63421.6 )
									ret := 0.238636
								if( tenkan_sen > 63421.6 )
									ret := -0.619048
							if( chinkou_span > 63414.5 )
								if( basis_minus <= 241.897 )
									ret := 0.546332
								if( basis_minus > 241.897 )
									ret := -0.326087
						if( kinjun_sen > 63512.2 )
							if( chinkou_span <= 63780.8 )
								if( chinkou_span <= 63384.2 )
									ret := -0.521277
								if( chinkou_span > 63384.2 )
									ret := -0.217920
							if( chinkou_span > 63780.8 )
								if( senkou_span_a <= 63918.8 )
									ret := 0.384211
								if( senkou_span_a > 63918.8 )
									ret := 0.038718
				if( senkou_span_b_displaced > 63979 )
					if( senkou_span_a_displaced <= 73068.2 )
						if( chinkou_span <= 65721.7 )
							if( kinjun_sen <= 65686.1 )
								if( kinjun_sen <= 64145 )
									ret := 0.203661
								if( kinjun_sen > 64145 )
									ret := -0.022828
							if( kinjun_sen > 65686.1 )
								if( senkou_span_a <= 65589.2 )
									ret := 0.600000
								if( senkou_span_a > 65589.2 )
									ret := -0.450964
						if( chinkou_span > 65721.7 )
							if( kinjun_sen <= 66128.7 )
								if( senkou_span_a <= 65243.3 )
									ret := 0.822222 // buy
								if( senkou_span_a > 65243.3 )
									ret := 0.317139
							if( kinjun_sen > 66128.7 )
								if( chinkou_span <= 69831.6 )
									ret := 0.038519
								if( chinkou_span > 69831.6 )
									ret := 0.184872
					if( senkou_span_a_displaced > 73068.2 )
						if( basis_minus <= -162.463 )
							if( senkou_span_b_displaced <= 73231 )
								if( basis_max <= 59.8811 )
									ret := -1.000000 // sell
								if( basis_max > 59.8811 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 73231 )
								if( basis_max <= 30.2105 )
									ret := 0.250000
								if( basis_max > 30.2105 )
									ret := -0.593750
						if( basis_minus > -162.463 )
							if( basis_max <= 47.0923 )
								if( tenkan_sen <= 73048.2 )
									ret := -0.142857
								if( tenkan_sen > 73048.2 )
									ret := -0.645833
							if( basis_max > 47.0923 )
								if( basis_minus <= -158.074 )
									ret := 0.692308
								if( basis_minus > -158.074 )
									ret := 0.090909
	
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
float op_operation = decision_tree_0_BTCUSDT_5Min_69e4a938(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


