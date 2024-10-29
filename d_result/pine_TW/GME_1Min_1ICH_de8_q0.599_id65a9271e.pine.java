//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: GME_1Min_1ICH_65a9271e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1ICH_65a9271e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_65a9271e(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b <= 15.8654 )
		if( basis_minus <= 0.051034 )
			if( chinkou_span <= 15.6072 )
				if( basis_minus <= -0.059276 )
					if( basis_max <= 0.136262 )
						if( kinjun_sen <= 15.1699 )
							if( kinjun_sen <= 15.1124 )
								if( tenkan_sen <= 13.965 )
									ret := -0.103862
								if( tenkan_sen > 13.965 )
									ret := -0.600000
							if( kinjun_sen > 15.1124 )
								if( basis_minus <= -0.18375 )
									ret := 0.904762 // buy
								if( basis_minus > -0.18375 )
									ret := -0.200000
						if( kinjun_sen > 15.1699 )
							if( chinkou_span <= 15.57 )
								if( basis_minus <= -0.110157 )
									ret := -0.773109 // sell
								if( basis_minus > -0.110157 )
									ret := -0.344828
							if( chinkou_span > 15.57 )
								if( kinjun_sen <= 15.3925 )
									ret := 1.000000 // buy
								if( kinjun_sen > 15.3925 )
									ret := 0.000000
					if( basis_max > 0.136262 )
						if( basis_minus <= -0.445194 )
							ret := 0.000000
						if( basis_minus > -0.445194 )
							if( senkou_span_b_displaced <= 14.9658 )
								ret := 0.333333
							if( senkou_span_b_displaced > 14.9658 )
								if( tenkan_sen <= 15.1377 )
									ret := 1.000000 // buy
								if( tenkan_sen > 15.1377 )
									ret := 0.375000
				if( basis_minus > -0.059276 )
					if( chinkou_span <= 10.1951 )
						if( senkou_span_b <= 10.1852 )
							if( senkou_span_b_displaced <= 10.0543 )
								if( senkou_span_a_displaced <= 10.0188 )
									ret := -0.333333
								if( senkou_span_a_displaced > 10.0188 )
									ret := -0.923077 // sell
							if( senkou_span_b_displaced > 10.0543 )
								if( senkou_span_a <= 10.1674 )
									ret := 0.151420
								if( senkou_span_a > 10.1674 )
									ret := -0.235294
						if( senkou_span_b > 10.1852 )
							if( senkou_span_a_displaced <= 10.1862 )
								if( kinjun_sen <= 10.1905 )
									ret := -0.166667
								if( kinjun_sen > 10.1905 )
									ret := -0.809524 // sell
							if( senkou_span_a_displaced > 10.1862 )
								if( tenkan_sen <= 10.2131 )
									ret := -0.114943
								if( tenkan_sen > 10.2131 )
									ret := -0.500000
					if( chinkou_span > 10.1951 )
						if( kinjun_sen <= 10.3948 )
							if( chinkou_span <= 10.338 )
								if( kinjun_sen <= 10.0736 )
									ret := -0.833333 // sell
								if( kinjun_sen > 10.0736 )
									ret := 0.203209
							if( chinkou_span > 10.338 )
								if( kinjun_sen <= 10.3288 )
									ret := 0.795181 // buy
								if( kinjun_sen > 10.3288 )
									ret := 0.311966
						if( kinjun_sen > 10.3948 )
							if( chinkou_span <= 10.7015 )
								if( senkou_span_b <= 10.594 )
									ret := -0.061990
								if( senkou_span_b > 10.594 )
									ret := -0.753623 // sell
							if( chinkou_span > 10.7015 )
								if( senkou_span_b <= 10.79 )
									ret := 0.595745
								if( senkou_span_b > 10.79 )
									ret := 0.123876
			if( chinkou_span > 15.6072 )
				if( senkou_span_a <= 15.7719 )
					if( tenkan_sen <= 15.1908 )
						if( tenkan_sen <= 14.868 )
							if( tenkan_sen <= 14.8091 )
								ret := 1.000000 // buy
							if( tenkan_sen > 14.8091 )
								if( senkou_span_a_displaced <= 15.2711 )
									ret := 0.875000 // buy
								if( senkou_span_a_displaced > 15.2711 )
									ret := 0.250000
						if( tenkan_sen > 14.868 )
							ret := 1.000000 // buy
					if( tenkan_sen > 15.1908 )
						if( kinjun_sen <= 15.626 )
							if( basis_max <= 0.08125 )
								if( senkou_span_a_displaced <= 15.8467 )
									ret := 0.787879 // buy
								if( senkou_span_a_displaced > 15.8467 )
									ret := 0.384615
							if( basis_max > 0.08125 )
								if( chinkou_span <= 15.677 )
									ret := 1.000000 // buy
								if( chinkou_span > 15.677 )
									ret := -0.818182 // sell
						if( kinjun_sen > 15.626 )
							if( kinjun_sen <= 15.7786 )
								if( tenkan_sen <= 15.7394 )
									ret := 0.979798 // buy
								if( tenkan_sen > 15.7394 )
									ret := 0.866667 // buy
							if( kinjun_sen > 15.7786 )
								if( senkou_span_a <= 15.5949 )
									ret := 1.000000 // buy
								if( senkou_span_a > 15.5949 )
									ret := 0.214286
				if( senkou_span_a > 15.7719 )
					if( senkou_span_b_displaced <= 15.9045 )
						if( senkou_span_b_displaced <= 15.8521 )
							if( kinjun_sen <= 15.835 )
								if( basis_minus <= -0.0571 )
									ret := -0.600000
								if( basis_minus > -0.0571 )
									ret := 0.000000
							if( kinjun_sen > 15.835 )
								if( basis_minus <= 0.036303 )
									ret := -1.000000 // sell
								if( basis_minus > 0.036303 )
									ret := -0.285714
						if( senkou_span_b_displaced > 15.8521 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 15.9045 )
						if( senkou_span_a_displaced <= 15.9491 )
							if( senkou_span_a_displaced <= 15.9195 )
								ret := 0.750000 // buy
							if( senkou_span_a_displaced > 15.9195 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 15.9491 )
							if( senkou_span_a <= 15.8453 )
								ret := -0.200000
							if( senkou_span_a > 15.8453 )
								if( senkou_span_a_displaced <= 15.9642 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 15.9642 )
									ret := -1.000000 // sell
		if( basis_minus > 0.051034 )
			if( kinjun_sen <= 11.335 )
				if( senkou_span_a_displaced <= 10.7612 )
					if( senkou_span_b <= 10.534 )
						if( senkou_span_a_displaced <= 10.1881 )
							if( senkou_span_a_displaced <= 10.1604 )
								if( kinjun_sen <= 10.1725 )
									ret := -0.250000
								if( kinjun_sen > 10.1725 )
									ret := 0.000000
							if( senkou_span_a_displaced > 10.1604 )
								if( senkou_span_b_displaced <= 10.1375 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 10.1375 )
									ret := -0.384615
						if( senkou_span_a_displaced > 10.1881 )
							if( kinjun_sen <= 10.5675 )
								if( chinkou_span <= 10.4442 )
									ret := 0.533333
								if( chinkou_span > 10.4442 )
									ret := 0.021739
							if( kinjun_sen > 10.5675 )
								if( senkou_span_b <= 10.5276 )
									ret := -0.333333
								if( senkou_span_b > 10.5276 )
									ret := -1.000000 // sell
					if( senkou_span_b > 10.534 )
						if( tenkan_sen <= 10.8564 )
							if( kinjun_sen <= 10.5554 )
								ret := 0.000000
							if( kinjun_sen > 10.5554 )
								if( senkou_span_b_displaced <= 10.5682 )
									ret := 0.759259 // buy
								if( senkou_span_b_displaced > 10.5682 )
									ret := 0.955882 // buy
						if( tenkan_sen > 10.8564 )
							if( senkou_span_b_displaced <= 10.6709 )
								if( kinjun_sen <= 10.8675 )
									ret := 0.000000
								if( kinjun_sen > 10.8675 )
									ret := -0.250000
							if( senkou_span_b_displaced > 10.6709 )
								ret := 0.714286 // buy
				if( senkou_span_a_displaced > 10.7612 )
					if( senkou_span_b_displaced <= 10.7513 )
						if( senkou_span_a_displaced <= 10.7696 )
							ret := -0.750000 // sell
						if( senkou_span_a_displaced > 10.7696 )
							if( chinkou_span <= 10.8192 )
								ret := -1.000000 // sell
							if( chinkou_span > 10.8192 )
								ret := -0.800000 // sell
					if( senkou_span_b_displaced > 10.7513 )
						if( basis_minus <= 0.082761 )
							if( senkou_span_b_displaced <= 10.9405 )
								if( senkou_span_a_displaced <= 10.887 )
									ret := 0.000000
								if( senkou_span_a_displaced > 10.887 )
									ret := 0.857143 // buy
							if( senkou_span_b_displaced > 10.9405 )
								if( basis_max <= -0.009268 )
									ret := -0.380000
								if( basis_max > -0.009268 )
									ret := 0.222222
						if( basis_minus > 0.082761 )
							if( kinjun_sen <= 11.2616 )
								if( chinkou_span <= 11.0825 )
									ret := -0.666667
								if( chinkou_span > 11.0825 )
									ret := -1.000000 // sell
							if( kinjun_sen > 11.2616 )
								ret := -0.250000
			if( kinjun_sen > 11.335 )
				if( chinkou_span <= 15.9502 )
					if( senkou_span_b <= 15.4644 )
						if( senkou_span_a_displaced <= 13.8401 )
							if( basis_minus <= 0.102463 )
								if( senkou_span_a_displaced <= 13.5502 )
									ret := 0.598837
								if( senkou_span_a_displaced > 13.5502 )
									ret := 0.064516
							if( basis_minus > 0.102463 )
								if( chinkou_span <= 11.8823 )
									ret := -0.642857
								if( chinkou_span > 11.8823 )
									ret := 0.228070
						if( senkou_span_a_displaced > 13.8401 )
							if( senkou_span_a <= 14.5724 )
								if( chinkou_span <= 15.0068 )
									ret := 0.980952 // buy
								if( chinkou_span > 15.0068 )
									ret := 0.454545
							if( senkou_span_a > 14.5724 )
								if( chinkou_span <= 14.7786 )
									ret := -0.777778 // sell
								if( chinkou_span > 14.7786 )
									ret := 0.580838
					if( senkou_span_b > 15.4644 )
						if( tenkan_sen <= 15.9791 )
							if( basis_max <= 0.001875 )
								if( senkou_span_b <= 15.4859 )
									ret := 0.000000
								if( senkou_span_b > 15.4859 )
									ret := -0.597938
							if( basis_max > 0.001875 )
								if( kinjun_sen <= 15.925 )
									ret := 0.446809
								if( kinjun_sen > 15.925 )
									ret := -0.928571 // sell
						if( tenkan_sen > 15.9791 )
							if( basis_max <= -0.088992 )
								if( senkou_span_b_displaced <= 14.7816 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 14.7816 )
									ret := 0.912281 // buy
							if( basis_max > -0.088992 )
								if( basis_minus <= 0.27105 )
									ret := 0.400000
								if( basis_minus > 0.27105 )
									ret := -0.882353 // sell
				if( chinkou_span > 15.9502 )
					if( senkou_span_b_displaced <= 15.7945 )
						if( kinjun_sen <= 16.0175 )
							if( senkou_span_a_displaced <= 14.9471 )
								if( chinkou_span <= 16.8583 )
									ret := 0.990566 // buy
								if( chinkou_span > 16.8583 )
									ret := 0.777778 // buy
							if( senkou_span_a_displaced > 14.9471 )
								if( kinjun_sen <= 15.6453 )
									ret := 0.250000
								if( kinjun_sen > 15.6453 )
									ret := 0.900000 // buy
						if( kinjun_sen > 16.0175 )
							ret := -0.600000
					if( senkou_span_b_displaced > 15.7945 )
						if( basis_max <= -0.00125 )
							if( basis_max <= -0.0874 )
								if( basis_max <= -0.116727 )
									ret := 1.000000 // buy
								if( basis_max > -0.116727 )
									ret := 0.500000
							if( basis_max > -0.0874 )
								if( basis_minus <= 0.075124 )
									ret := 0.000000
								if( basis_minus > 0.075124 )
									ret := -0.904762 // sell
						if( basis_max > -0.00125 )
							if( kinjun_sen <= 15.8668 )
								ret := 1.000000 // buy
							if( kinjun_sen > 15.8668 )
								ret := 0.714286 // buy
	if( senkou_span_b > 15.8654 )
		if( basis_minus <= -0.093153 )
			if( kinjun_sen <= 17.7945 )
				if( tenkan_sen <= 17.4675 )
					if( chinkou_span <= 16.507 )
						if( kinjun_sen <= 16.2075 )
							if( senkou_span_b_displaced <= 16.6814 )
								if( chinkou_span <= 15.8288 )
									ret := -0.402516
								if( chinkou_span > 15.8288 )
									ret := 0.247191
							if( senkou_span_b_displaced > 16.6814 )
								ret := 1.000000 // buy
						if( kinjun_sen > 16.2075 )
							if( basis_max <= 0.079186 )
								if( senkou_span_a <= 16.74 )
									ret := -0.733333 // sell
								if( senkou_span_a > 16.74 )
									ret := -1.000000 // sell
							if( basis_max > 0.079186 )
								if( chinkou_span <= 16.1996 )
									ret := -0.563380
								if( chinkou_span > 16.1996 )
									ret := 0.708333 // buy
					if( chinkou_span > 16.507 )
						if( basis_minus <= -0.130514 )
							if( basis_max <= -0.079935 )
								if( senkou_span_a_displaced <= 16.558 )
									ret := 0.500000
								if( senkou_span_a_displaced > 16.558 )
									ret := -0.857143 // sell
							if( basis_max > -0.079935 )
								if( basis_max <= 0.022796 )
									ret := 0.796296 // buy
								if( basis_max > 0.022796 )
									ret := 0.500000
						if( basis_minus > -0.130514 )
							if( senkou_span_b <= 16.5291 )
								if( senkou_span_a_displaced <= 16.2678 )
									ret := 0.000000
								if( senkou_span_a_displaced > 16.2678 )
									ret := 0.875000 // buy
							if( senkou_span_b > 16.5291 )
								if( basis_max <= -0.014027 )
									ret := -1.000000 // sell
								if( basis_max > -0.014027 )
									ret := 0.000000
				if( tenkan_sen > 17.4675 )
					if( senkou_span_a <= 17.8337 )
						if( chinkou_span <= 17.0927 )
							ret := 0.000000
						if( chinkou_span > 17.0927 )
							if( basis_max <= 0.079299 )
								if( basis_minus <= -0.104884 )
									ret := -0.934426 // sell
								if( basis_minus > -0.104884 )
									ret := -0.250000
							if( basis_max > 0.079299 )
								ret := -0.250000
					if( senkou_span_a > 17.8337 )
						if( chinkou_span <= 17.6619 )
							ret := -0.500000
						if( chinkou_span > 17.6619 )
							ret := 0.250000
			if( kinjun_sen > 17.7945 )
				if( senkou_span_a <= 28.8111 )
					if( chinkou_span <= 29.0475 )
						if( tenkan_sen <= 28.2348 )
							if( chinkou_span <= 25.4983 )
								if( tenkan_sen <= 25.4915 )
									ret := 0.106153
								if( tenkan_sen > 25.4915 )
									ret := -0.776042 // sell
							if( chinkou_span > 25.4983 )
								if( kinjun_sen <= 26.5298 )
									ret := 0.488083
								if( kinjun_sen > 26.5298 )
									ret := 0.140032
						if( tenkan_sen > 28.2348 )
							if( chinkou_span <= 28.3672 )
								if( senkou_span_a_displaced <= 29.9509 )
									ret := -0.748571 // sell
								if( senkou_span_a_displaced > 29.9509 )
									ret := 0.588235
							if( chinkou_span > 28.3672 )
								if( senkou_span_b <= 29.16 )
									ret := 0.231618
								if( senkou_span_b > 29.16 )
									ret := -0.695652
					if( chinkou_span > 29.0475 )
						if( senkou_span_a <= 28.5828 )
							if( senkou_span_a_displaced <= 30.0333 )
								if( chinkou_span <= 30.05 )
									ret := 0.088889
								if( chinkou_span > 30.05 )
									ret := 0.926829 // buy
							if( senkou_span_a_displaced > 30.0333 )
								ret := -1.000000 // sell
						if( senkou_span_a > 28.5828 )
							if( basis_minus <= -0.166115 )
								if( senkou_span_b_displaced <= 28.7902 )
									ret := 0.878788 // buy
								if( senkou_span_b_displaced > 28.7902 )
									ret := 0.984252 // buy
							if( basis_minus > -0.166115 )
								if( kinjun_sen <= 28.8326 )
									ret := 0.964286 // buy
								if( kinjun_sen > 28.8326 )
									ret := 0.357143
				if( senkou_span_a > 28.8111 )
					if( chinkou_span <= 29.4506 )
						if( basis_max <= 0.351038 )
							if( senkou_span_a_displaced <= 29.6212 )
								if( kinjun_sen <= 29.56 )
									ret := 0.069307
								if( kinjun_sen > 29.56 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 29.6212 )
								if( chinkou_span <= 27.958 )
									ret := -0.882353 // sell
								if( chinkou_span > 27.958 )
									ret := -0.370093
						if( basis_max > 0.351038 )
							if( kinjun_sen <= 30.4977 )
								if( senkou_span_b_displaced <= 34.0064 )
									ret := 0.863014 // buy
								if( senkou_span_b_displaced > 34.0064 )
									ret := -0.500000
							if( kinjun_sen > 30.4977 )
								if( senkou_span_a_displaced <= 36.8925 )
									ret := -0.339623
								if( senkou_span_a_displaced > 36.8925 )
									ret := 0.545455
					if( chinkou_span > 29.4506 )
						if( senkou_span_a <= 29.7898 )
							if( senkou_span_a <= 29.4088 )
								if( senkou_span_a <= 29.1824 )
									ret := 0.548077
								if( senkou_span_a > 29.1824 )
									ret := -0.260274
							if( senkou_span_a > 29.4088 )
								if( chinkou_span <= 29.6824 )
									ret := 0.288136
								if( chinkou_span > 29.6824 )
									ret := 0.841699 // buy
						if( senkou_span_a > 29.7898 )
							if( chinkou_span <= 30.3055 )
								if( senkou_span_b_displaced <= 29.9797 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 29.9797 )
									ret := -0.278736
							if( chinkou_span > 30.3055 )
								if( senkou_span_b_displaced <= 65.012 )
									ret := 0.077758
								if( senkou_span_b_displaced > 65.012 )
									ret := -0.897436 // sell
		if( basis_minus > -0.093153 )
			if( chinkou_span <= 34.891 )
				if( basis_max <= -0.073586 )
					if( basis_minus <= 0.250814 )
						if( chinkou_span <= 22.3942 )
							if( senkou_span_b <= 21.7677 )
								if( chinkou_span <= 16.2338 )
									ret := -0.820000 // sell
								if( chinkou_span > 16.2338 )
									ret := -0.068299
							if( senkou_span_b > 21.7677 )
								if( senkou_span_a_displaced <= 23.2764 )
									ret := -0.704663 // sell
								if( senkou_span_a_displaced > 23.2764 )
									ret := 0.285714
						if( chinkou_span > 22.3942 )
							if( senkou_span_a_displaced <= 22.3932 )
								if( chinkou_span <= 22.7863 )
									ret := 0.082645
								if( chinkou_span > 22.7863 )
									ret := 0.876190 // buy
							if( senkou_span_a_displaced > 22.3932 )
								if( chinkou_span <= 28.3819 )
									ret := -0.094493
								if( chinkou_span > 28.3819 )
									ret := 0.119171
					if( basis_minus > 0.250814 )
						if( chinkou_span <= 16.8313 )
							if( kinjun_sen <= 16.4626 )
								ret := -1.000000 // sell
							if( kinjun_sen > 16.4626 )
								if( senkou_span_b_displaced <= 15.1731 )
									ret := -0.285714
								if( senkou_span_b_displaced > 15.1731 )
									ret := -0.916667 // sell
						if( chinkou_span > 16.8313 )
							if( senkou_span_b_displaced <= 23.4392 )
								if( chinkou_span <= 23.3059 )
									ret := -0.287902
								if( chinkou_span > 23.3059 )
									ret := 0.459649
							if( senkou_span_b_displaced > 23.4392 )
								if( senkou_span_b_displaced <= 29.1651 )
									ret := -0.417129
								if( senkou_span_b_displaced > 29.1651 )
									ret := -0.116375
				if( basis_max > -0.073586 )
					if( senkou_span_a <= 33.8987 )
						if( chinkou_span <= 30.6644 )
							if( tenkan_sen <= 29.8924 )
								if( chinkou_span <= 29.5466 )
									ret := 0.029996
								if( chinkou_span > 29.5466 )
									ret := 0.413479
							if( tenkan_sen > 29.8924 )
								if( basis_minus <= 0.506262 )
									ret := -0.372617
								if( basis_minus > 0.506262 )
									ret := -0.792308 // sell
						if( chinkou_span > 30.6644 )
							if( senkou_span_a <= 31.9054 )
								if( tenkan_sen <= 31.0466 )
									ret := 0.662651
								if( tenkan_sen > 31.0466 )
									ret := 0.348624
							if( senkou_span_a > 31.9054 )
								if( senkou_span_b <= 31.9835 )
									ret := -0.587302
								if( senkou_span_b > 31.9835 )
									ret := 0.045845
					if( senkou_span_a > 33.8987 )
						if( chinkou_span <= 28.4262 )
							ret := 0.000000
						if( chinkou_span > 28.4262 )
							if( basis_max <= 0.366203 )
								if( basis_minus <= -0.074463 )
									ret := -0.400000
								if( basis_minus > -0.074463 )
									ret := -0.924138 // sell
							if( basis_max > 0.366203 )
								if( senkou_span_a_displaced <= 35.5009 )
									ret := 0.000000
								if( senkou_span_a_displaced > 35.5009 )
									ret := -0.777778 // sell
			if( chinkou_span > 34.891 )
				if( senkou_span_a <= 36.0575 )
					if( senkou_span_a_displaced <= 35.5501 )
						if( basis_minus <= 0.475176 )
							if( basis_minus <= 0.470948 )
								if( senkou_span_b <= 34.1173 )
									ret := 0.709677 // buy
								if( senkou_span_b > 34.1173 )
									ret := 0.222222
							if( basis_minus > 0.470948 )
								ret := -1.000000 // sell
						if( basis_minus > 0.475176 )
							if( tenkan_sen <= 34.9061 )
								if( senkou_span_b <= 33.5607 )
									ret := 0.920635 // buy
								if( senkou_span_b > 33.5607 )
									ret := 0.576923
							if( tenkan_sen > 34.9061 )
								if( senkou_span_a <= 35.922 )
									ret := 0.973214 // buy
								if( senkou_span_a > 35.922 )
									ret := 0.600000
					if( senkou_span_a_displaced > 35.5501 )
						if( senkou_span_a <= 35.4875 )
							if( chinkou_span <= 37.503 )
								ret := -0.750000 // sell
							if( chinkou_span > 37.503 )
								ret := 1.000000 // buy
						if( senkou_span_a > 35.4875 )
							ret := -1.000000 // sell
				if( senkou_span_a > 36.0575 )
					if( senkou_span_b_displaced <= 54.3418 )
						if( basis_minus <= 0.125551 )
							if( basis_max <= 0.037804 )
								if( senkou_span_b_displaced <= 48.0024 )
									ret := -0.673684
								if( senkou_span_b_displaced > 48.0024 )
									ret := -0.029412
							if( basis_max > 0.037804 )
								if( chinkou_span <= 53.9861 )
									ret := 0.010870
								if( chinkou_span > 53.9861 )
									ret := 0.937500 // buy
						if( basis_minus > 0.125551 )
							if( senkou_span_b <= 35.175 )
								if( senkou_span_a_displaced <= 22.9299 )
									ret := 0.222222
								if( senkou_span_a_displaced > 22.9299 )
									ret := -0.740000 // sell
							if( senkou_span_b > 35.175 )
								if( basis_minus <= 0.73022 )
									ret := 0.485890
								if( basis_minus > 0.73022 )
									ret := 0.185135
					if( senkou_span_b_displaced > 54.3418 )
						if( chinkou_span <= 62.474 )
							if( chinkou_span <= 49.7878 )
								if( basis_max <= 0.391529 )
									ret := 0.250000
								if( basis_max > 0.391529 )
									ret := 1.000000 // buy
							if( chinkou_span > 49.7878 )
								if( basis_max <= 0.26625 )
									ret := -0.624324
								if( basis_max > 0.26625 )
									ret := -0.051724
						if( chinkou_span > 62.474 )
							if( tenkan_sen <= 66.886 )
								if( tenkan_sen <= 65.845 )
									ret := 0.478873
								if( tenkan_sen > 65.845 )
									ret := 0.916667 // buy
							if( tenkan_sen > 66.886 )
								if( basis_max <= -1.15345 )
									ret := -0.250000
								if( basis_max > -1.15345 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_GME_1Min_65a9271e(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


