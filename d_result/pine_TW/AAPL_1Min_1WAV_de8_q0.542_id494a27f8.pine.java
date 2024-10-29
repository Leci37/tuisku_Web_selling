//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AAPL_1Min_1WAV_494a27f8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_1WAV_494a27f8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_494a27f8(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= -5.91145 )
		if( d_tci <= 55.86 )
			if( d <= 0.067229 )
				if( d <= 0.052913 )
					if( d <= 0.052894 )
						if( ci_wt2 <= -7.58017 )
							if( tci <= 52.224 )
								if( esa <= 205.986 )
									ret := -0.030484
								if( esa > 205.986 )
									ret := 0.003256
							if( tci > 52.224 )
								if( ap <= 196.949 )
									ret := 0.198020
								if( ap > 196.949 )
									ret := 0.031746
						if( ci_wt2 > -7.58017 )
							if( d_tci <= -31.7062 )
								if( wt2 <= 36.6986 )
									ret := -0.166667
								if( wt2 > 36.6986 )
									ret := 0.000000
							if( d_tci > -31.7062 )
								if( wt2 <= 5.85501 )
									ret := 0.092784
								if( wt2 > 5.85501 )
									ret := 0.462963
					if( d > 0.052894 )
						if( d <= 0.052906 )
							ret := -0.857143 // sell
						if( d > 0.052906 )
							ret := -0.250000
				if( d > 0.052913 )
					if( ci <= -140.91 )
						if( wt2 <= -46.4257 )
							ret := -1.000000 // sell
						if( wt2 > -46.4257 )
							if( ci_wt2 <= -188.957 )
								if( d_tci <= -21.8995 )
									ret := 1.000000 // buy
								if( d_tci > -21.8995 )
									ret := 0.473684
							if( ci_wt2 > -188.957 )
								if( ci <= -149.929 )
									ret := 0.076923
								if( ci > -149.929 )
									ret := 0.478873
					if( ci > -140.91 )
						if( ci_wt2 <= -6.52974 )
							if( tci <= -25.9637 )
								if( wt2 <= -21.1345 )
									ret := -0.018051
								if( wt2 > -21.1345 )
									ret := -0.350515
							if( tci > -25.9637 )
								if( tci <= -11.6834 )
									ret := 0.150066
								if( tci > -11.6834 )
									ret := 0.023529
						if( ci_wt2 > -6.52974 )
							if( d <= 0.058195 )
								if( wt2 <= 12.2158 )
									ret := 1.000000 // buy
								if( wt2 > 12.2158 )
									ret := 0.666667
							if( d > 0.058195 )
								if( ci <= -4.04413 )
									ret := -0.200000
								if( ci > -4.04413 )
									ret := 0.466667
			if( d > 0.067229 )
				if( ci_wt2 <= -188.657 )
					if( ci <= -224.099 )
						if( ap <= 221.32 )
							if( ci_wt2 <= -250.701 )
								if( esa <= 215.83 )
									ret := 0.142857
								if( esa > 215.83 )
									ret := -0.896552 // sell
							if( ci_wt2 > -250.701 )
								if( tci <= -17.3442 )
									ret := 0.810811 // buy
								if( tci > -17.3442 )
									ret := 0.230769
						if( ap > 221.32 )
							if( ci <= -233.137 )
								if( esa <= 224.772 )
									ret := 0.428571
								if( esa > 224.772 )
									ret := 0.913043 // buy
							if( ci > -233.137 )
								if( d <= 0.208918 )
									ret := -0.125000
								if( d > 0.208918 )
									ret := -1.000000 // sell
					if( ci > -224.099 )
						if( tci <= 13.1669 )
							if( ci_wt2 <= -242.728 )
								if( d_tci <= -5.99299 )
									ret := -1.000000 // sell
								if( d_tci > -5.99299 )
									ret := 0.500000
							if( ci_wt2 > -242.728 )
								if( ci_wt2 <= -196.842 )
									ret := 0.804598 // buy
								if( ci_wt2 > -196.842 )
									ret := 0.571429
						if( tci > 13.1669 )
							if( d_tci <= -26.6116 )
								if( ap <= 218.04 )
									ret := 0.894737 // buy
								if( ap > 218.04 )
									ret := 0.550000
							if( d_tci > -26.6116 )
								if( ci <= -158.067 )
									ret := -0.318182
								if( ci > -158.067 )
									ret := 0.375000
				if( ci_wt2 > -188.657 )
					if( ci <= -33.7459 )
						if( ap <= 172.815 )
							if( wt2 <= -46.0329 )
								if( ci <= -66.8347 )
									ret := 0.196078
								if( ci > -66.8347 )
									ret := -0.714286 // sell
							if( wt2 > -46.0329 )
								if( esa <= 166.065 )
									ret := 0.020725
								if( esa > 166.065 )
									ret := 0.328330
						if( ap > 172.815 )
							if( d <= 0.523127 )
								if( ci_wt2 <= -178.027 )
									ret := -0.220930
								if( ci_wt2 > -178.027 )
									ret := 0.121786
							if( d > 0.523127 )
								if( ci_wt2 <= -65.5198 )
									ret := 0.165049
								if( ci_wt2 > -65.5198 )
									ret := -0.457317
					if( ci > -33.7459 )
						if( ci_wt2 <= -11.3186 )
							if( ap <= 221.183 )
								if( esa <= 187.834 )
									ret := -0.015091
								if( esa > 187.834 )
									ret := 0.139223
							if( ap > 221.183 )
								if( d <= 0.29144 )
									ret := 0.043890
								if( d > 0.29144 )
									ret := -0.280130
						if( ci_wt2 > -11.3186 )
							if( d <= 0.53811 )
								if( ci <= 50.6027 )
									ret := -0.030198
								if( ci > 50.6027 )
									ret := -0.227811
							if( d > 0.53811 )
								if( wt2 <= 72.7193 )
									ret := 0.634146
								if( wt2 > 72.7193 )
									ret := -0.750000 // sell
		if( d_tci > 55.86 )
			if( ci <= -69.6927 )
				if( esa <= 170.097 )
					if( wt2 <= -51.0301 )
						if( ci <= -77.4331 )
							if( ci_wt2 <= -31.3135 )
								if( esa <= 164.956 )
									ret := -0.111111
								if( esa > 164.956 )
									ret := 0.711111 // buy
							if( ci_wt2 > -31.3135 )
								if( tci <= -73.9726 )
									ret := 0.909091 // buy
								if( tci > -73.9726 )
									ret := 0.051724
						if( ci > -77.4331 )
							if( tci <= -60.9092 )
								if( d_tci <= 66.3654 )
									ret := 1.000000 // buy
								if( d_tci > 66.3654 )
									ret := 0.714286 // buy
							if( tci > -60.9092 )
								if( ci <= -74.3664 )
									ret := 0.750000 // buy
								if( ci > -74.3664 )
									ret := 0.200000
					if( wt2 > -51.0301 )
						if( d_tci <= 60.4509 )
							if( ci <= -128.22 )
								if( tci <= -57.3614 )
									ret := -1.000000 // sell
								if( tci > -57.3614 )
									ret := -0.750000 // sell
							if( ci > -128.22 )
								if( wt2 <= -49.7688 )
									ret := -0.333333
								if( wt2 > -49.7688 )
									ret := 0.555556
						if( d_tci > 60.4509 )
							ret := 0.428571
				if( esa > 170.097 )
					if( ci <= -131.478 )
						if( esa <= 190.532 )
							if( tci <= -63.194 )
								if( ci <= -142.559 )
									ret := 0.968750 // buy
								if( ci > -142.559 )
									ret := 0.571429
							if( tci > -63.194 )
								if( ap <= 185.64 )
									ret := 0.740741 // buy
								if( ap > 185.64 )
									ret := 0.312500
						if( esa > 190.532 )
							if( d_tci <= 80.8679 )
								if( ci_wt2 <= -90.8161 )
									ret := 0.150407
								if( ci_wt2 > -90.8161 )
									ret := 0.421384
							if( d_tci > 80.8679 )
								if( ci <= -152.791 )
									ret := 0.636364
								if( ci > -152.791 )
									ret := 1.000000 // buy
					if( ci > -131.478 )
						if( esa <= 200.443 )
							if( esa <= 194.586 )
								if( ci_wt2 <= -12.3646 )
									ret := 0.093863
								if( ci_wt2 > -12.3646 )
									ret := 0.696970
							if( esa > 194.586 )
								if( d <= 0.12066 )
									ret := 0.064516
								if( d > 0.12066 )
									ret := -0.492063
						if( esa > 200.443 )
							if( ci_wt2 <= -57.6567 )
								if( ci_wt2 <= -64.5401 )
									ret := 0.189744
								if( ci_wt2 > -64.5401 )
									ret := 0.635036
							if( ci_wt2 > -57.6567 )
								if( ci <= -111.588 )
									ret := -0.303030
								if( ci > -111.588 )
									ret := 0.206533
			if( ci > -69.6927 )
				if( d <= 0.151833 )
					if( tci <= -57.9402 )
						if( d_tci <= 59.4997 )
							if( esa <= 220.918 )
								if( d_tci <= 58.9016 )
									ret := -1.000000 // sell
								if( d_tci > 58.9016 )
									ret := -0.750000 // sell
							if( esa > 220.918 )
								ret := 0.000000
						if( d_tci > 59.4997 )
							if( esa <= 169.743 )
								ret := 0.500000
							if( esa > 169.743 )
								if( wt2 <= -60.3727 )
									ret := -0.333333
								if( wt2 > -60.3727 )
									ret := 0.090909
					if( tci > -57.9402 )
						if( wt2 <= -54.6018 )
							if( wt2 <= -56.9112 )
								if( d <= 0.096416 )
									ret := 0.000000
								if( d > 0.096416 )
									ret := 0.500000
							if( wt2 > -56.9112 )
								if( d <= 0.120627 )
									ret := 1.000000 // buy
								if( d > 0.120627 )
									ret := 0.333333
						if( wt2 > -54.6018 )
							if( tci <= -55.9018 )
								if( ap <= 224.497 )
									ret := 0.125000
								if( ap > 224.497 )
									ret := -0.500000
							if( tci > -55.9018 )
								ret := 0.500000
				if( d > 0.151833 )
					if( wt2 <= -53.7937 )
						if( ci_wt2 <= -6.10308 )
							if( ci_wt2 <= -11.0281 )
								if( d_tci <= 57.1052 )
									ret := 0.923077 // buy
								if( d_tci > 57.1052 )
									ret := 0.000000
							if( ci_wt2 > -11.0281 )
								if( esa <= 226.287 )
									ret := 0.865546 // buy
								if( esa > 226.287 )
									ret := 0.571429
						if( ci_wt2 > -6.10308 )
							ret := 0.000000
					if( wt2 > -53.7937 )
						if( tci <= -56.064 )
							if( ap <= 196.143 )
								ret := -0.600000
							if( ap > 196.143 )
								if( esa <= 217.017 )
									ret := 0.500000
								if( esa > 217.017 )
									ret := 0.000000
						if( tci > -56.064 )
							if( d_tci <= 56.2492 )
								ret := 1.000000 // buy
							if( d_tci > 56.2492 )
								ret := 0.750000 // buy
	if( ci_wt2 > -5.91145 )
		if( ci <= 56.085 )
			if( ap <= 228.005 )
				if( ci_wt2 <= 77.2446 )
					if( d <= 0.053348 )
						if( ci <= 21.8561 )
							if( ci_wt2 <= 44.1704 )
								if( tci <= -27.9296 )
									ret := 0.005139
								if( tci > -27.9296 )
									ret := 0.079933
							if( ci_wt2 > 44.1704 )
								if( wt2 <= -34.175 )
									ret := 0.003759
								if( wt2 > -34.175 )
									ret := -0.517241
						if( ci > 21.8561 )
							if( ap <= 189.632 )
								if( ci <= 28.0297 )
									ret := -0.201389
								if( ci > 28.0297 )
									ret := 0.082298
							if( ap > 189.632 )
								if( wt2 <= -31.5539 )
									ret := 0.090090
								if( wt2 > -31.5539 )
									ret := -0.079787
					if( d > 0.053348 )
						if( ci_wt2 <= 47.2136 )
							if( d_tci <= 84.5732 )
								if( d <= 0.338654 )
									ret := 0.094338
								if( d > 0.338654 )
									ret := -0.050378
							if( d_tci > 84.5732 )
								if( d <= 0.42003 )
									ret := 0.900000 // buy
								if( d > 0.42003 )
									ret := 0.000000
						if( ci_wt2 > 47.2136 )
							if( ap <= 222.633 )
								if( ci_wt2 <= 59.1693 )
									ret := -0.043248
								if( ci_wt2 > 59.1693 )
									ret := 0.107269
							if( ap > 222.633 )
								if( wt2 <= -36.3406 )
									ret := -0.263918
								if( wt2 > -36.3406 )
									ret := 0.009434
				if( ci_wt2 > 77.2446 )
					if( tci <= -48.6271 )
						if( ci <= 38.391 )
							if( esa <= 207.919 )
								if( esa <= 199.731 )
									ret := -0.147541
								if( esa > 199.731 )
									ret := -1.000000 // sell
							if( esa > 207.919 )
								if( ap <= 221.671 )
									ret := 0.526316
								if( ap > 221.671 )
									ret := -0.090909
						if( ci > 38.391 )
							if( esa <= 199.146 )
								if( d <= 0.157845 )
									ret := -0.200000
								if( d > 0.157845 )
									ret := 1.000000 // buy
							if( esa > 199.146 )
								if( d <= 0.171452 )
									ret := -0.235294
								if( d > 0.171452 )
									ret := -0.960000 // sell
					if( tci > -48.6271 )
						if( ci <= 48.9133 )
							if( wt2 <= -45.0973 )
								if( esa <= 166.182 )
									ret := -0.750000 // sell
								if( esa > 166.182 )
									ret := 0.202381
							if( wt2 > -45.0973 )
								if( d <= 0.081302 )
									ret := 0.206667
								if( d > 0.081302 )
									ret := 0.646288
						if( ci > 48.9133 )
							if( ci <= 53.4022 )
								if( d <= 0.141272 )
									ret := -0.133690
								if( d > 0.141272 )
									ret := 0.188406
							if( ci > 53.4022 )
								if( wt2 <= -25.4221 )
									ret := 0.120567
								if( wt2 > -25.4221 )
									ret := 0.451613
			if( ap > 228.005 )
				if( d <= 0.169279 )
					if( wt2 <= -65.7003 )
						if( d <= 0.102197 )
							ret := 0.000000
						if( d > 0.102197 )
							if( d <= 0.126977 )
								ret := 0.571429
							if( d > 0.126977 )
								ret := 1.000000 // buy
					if( wt2 > -65.7003 )
						if( tci <= -17.4464 )
							if( d_tci <= 36.3223 )
								if( esa <= 228.556 )
									ret := -0.006452
								if( esa > 228.556 )
									ret := -0.251908
							if( d_tci > 36.3223 )
								if( ci <= 46.387 )
									ret := -0.022059
								if( ci > 46.387 )
									ret := 0.777778 // buy
						if( tci > -17.4464 )
							if( tci <= 19.4497 )
								if( esa <= 231.125 )
									ret := 0.158892
								if( esa > 231.125 )
									ret := -0.201835
							if( tci > 19.4497 )
								if( ap <= 230.454 )
									ret := -0.210660
								if( ap > 230.454 )
									ret := 0.070175
				if( d > 0.169279 )
					if( ci <= 45.3905 )
						if( wt2 <= -73.3287 )
							if( d <= 0.635041 )
								if( ci <= -59.5078 )
									ret := 0.750000 // buy
								if( ci > -59.5078 )
									ret := 1.000000 // buy
							if( d > 0.635041 )
								ret := -1.000000 // sell
						if( wt2 > -73.3287 )
							if( wt2 <= 29.2518 )
								if( wt2 <= 5.12996 )
									ret := -0.376777
								if( wt2 > 5.12996 )
									ret := 0.297297
							if( wt2 > 29.2518 )
								if( tci <= 36.949 )
									ret := -0.956522 // sell
								if( tci > 36.949 )
									ret := -0.500000
					if( ci > 45.3905 )
						if( esa <= 234.982 )
							if( d <= 0.467056 )
								if( tci <= -19.2873 )
									ret := -0.600000
								if( tci > -19.2873 )
									ret := 0.214286
							if( d > 0.467056 )
								if( ap <= 228.637 )
									ret := 1.000000 // buy
								if( ap > 228.637 )
									ret := 0.625000
						if( esa > 234.982 )
							if( ci <= 49.0151 )
								ret := -1.000000 // sell
							if( ci > 49.0151 )
								ret := -0.750000 // sell
		if( ci > 56.085 )
			if( d_tci <= -60.6828 )
				if( ci_wt2 <= 8.91371 )
					if( ap <= 229.089 )
						if( wt2 <= 84.2261 )
							if( ci <= 61.4318 )
								if( tci <= 64.3429 )
									ret := 0.000000
								if( tci > 64.3429 )
									ret := 0.606061
							if( ci > 61.4318 )
								if( esa <= 224.25 )
									ret := -0.304000
								if( esa > 224.25 )
									ret := -0.051724
						if( wt2 > 84.2261 )
							if( esa <= 224.171 )
								ret := -1.000000 // sell
							if( esa > 224.171 )
								ret := -0.750000 // sell
					if( ap > 229.089 )
						if( wt2 <= 68.937 )
							if( d <= 0.090805 )
								if( d_tci <= -61.3683 )
									ret := -0.222222
								if( d_tci > -61.3683 )
									ret := 0.571429
							if( d > 0.090805 )
								if( ci_wt2 <= 5.55243 )
									ret := -0.660377
								if( ci_wt2 > 5.55243 )
									ret := -1.000000 // sell
						if( wt2 > 68.937 )
							if( d <= 0.225456 )
								ret := 1.000000 // buy
							if( d > 0.225456 )
								if( tci <= 71.0359 )
									ret := 0.250000
								if( tci > 71.0359 )
									ret := -0.500000
				if( ci_wt2 > 8.91371 )
					if( esa <= 209.607 )
						if( d <= 0.710004 )
							if( ci <= 124.254 )
								if( wt2 <= 66.6584 )
									ret := 0.170686
								if( wt2 > 66.6584 )
									ret := -0.217105
							if( ci > 124.254 )
								if( esa <= 195.561 )
									ret := -0.436364
								if( esa > 195.561 )
									ret := 0.080000
						if( d > 0.710004 )
							if( d <= 1.91719 )
								ret := 1.000000 // buy
							if( d > 1.91719 )
								ret := -0.250000
					if( esa > 209.607 )
						if( ci <= 129.916 )
							if( esa <= 222.036 )
								if( d <= 0.606201 )
									ret := -0.332370
								if( d > 0.606201 )
									ret := 0.461538
							if( esa > 222.036 )
								if( d_tci <= -68.41 )
									ret := -0.179153
								if( d_tci > -68.41 )
									ret := 0.023033
						if( ci > 129.916 )
							if( ci_wt2 <= 119.98 )
								if( ci_wt2 <= 94.6812 )
									ret := 0.066298
								if( ci_wt2 > 94.6812 )
									ret := 0.732394 // buy
							if( ci_wt2 > 119.98 )
								if( ap <= 223.403 )
									ret := 0.222222
								if( ap > 223.403 )
									ret := -0.862069 // sell
			if( d_tci > -60.6828 )
				if( ci_wt2 <= 227.878 )
					if( d_tci <= 34.0735 )
						if( ap <= 224.825 )
							if( ap <= 222.707 )
								if( wt2 <= 55.2073 )
									ret := -0.002663
								if( wt2 > 55.2073 )
									ret := 0.154786
							if( ap > 222.707 )
								if( ci <= 63.5649 )
									ret := 0.365031
								if( ci > 63.5649 )
									ret := 0.100184
						if( ap > 224.825 )
							if( wt2 <= -43.0287 )
								if( esa <= 228.882 )
									ret := 0.312500
								if( esa > 228.882 )
									ret := 0.666667
							if( wt2 > -43.0287 )
								if( tci <= -18.4872 )
									ret := -0.210526
								if( tci > -18.4872 )
									ret := -0.035936
					if( d_tci > 34.0735 )
						if( d <= 0.365554 )
							if( ci <= 59.6627 )
								if( ci_wt2 <= 109.081 )
									ret := -0.488372
								if( ci_wt2 > 109.081 )
									ret := 0.815789 // buy
							if( ci > 59.6627 )
								if( esa <= 171.716 )
									ret := 0.258065
								if( esa > 171.716 )
									ret := -0.336761
						if( d > 0.365554 )
							if( ap <= 225.252 )
								if( ci_wt2 <= 123.696 )
									ret := 0.500000
								if( ci_wt2 > 123.696 )
									ret := -0.500000
							if( ap > 225.252 )
								if( ap <= 234.53 )
									ret := 1.000000 // buy
								if( ap > 234.53 )
									ret := 0.750000 // buy
				if( ci_wt2 > 227.878 )
					if( ci_wt2 <= 286.221 )
						if( ci <= 236.56 )
							if( ci <= 232.481 )
								if( wt2 <= -28.5271 )
									ret := -0.034483
								if( wt2 > -28.5271 )
									ret := -0.475000
							if( ci > 232.481 )
								ret := 0.600000
						if( ci > 236.56 )
							if( d <= 0.059806 )
								if( ci <= 242.579 )
									ret := 0.750000 // buy
								if( ci > 242.579 )
									ret := -0.384615
							if( d > 0.059806 )
								if( esa <= 198.759 )
									ret := -0.461538
								if( esa > 198.759 )
									ret := -0.929825 // sell
					if( ci_wt2 > 286.221 )
						if( ci <= 309.512 )
							if( tci <= -21.4415 )
								if( wt2 <= -52.0074 )
									ret := -0.250000
								if( wt2 > -52.0074 )
									ret := 1.000000 // buy
							if( tci > -21.4415 )
								if( esa <= 194.764 )
									ret := 0.500000
								if( esa > 194.764 )
									ret := -0.600000
						if( ci > 309.512 )
							if( wt2 <= -17.1589 )
								ret := 1.000000 // buy
							if( wt2 > -17.1589 )
								ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_AAPL_1Min_494a27f8(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


