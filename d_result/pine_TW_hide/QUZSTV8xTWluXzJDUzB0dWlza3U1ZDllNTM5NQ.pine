//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AFRM_1Min_2CS0_5d9e5395 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2CS0_5d9e5395", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_5d9e5395(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -83.9794 )
		if( d <= 93.1177 )
			if( smoothD_d <= 24.9293 )
				if( d_k <= 3.64455 )
					if( mf <= -0.291567 )
						if( ad_mf <= -113749 )
							if( ad_mf <= -344148 )
								ret := 0.250000
							if( ad_mf > -344148 )
								if( rsi1 <= 17.6857 )
									ret := -0.600000
								if( rsi1 > 17.6857 )
									ret := -1.000000 // sell
						if( ad_mf > -113749 )
							if( smoothK_k <= -2.8432 )
								if( ad <= -22019.7 )
									ret := 0.650000
								if( ad > -22019.7 )
									ret := 0.166667
							if( smoothK_k > -2.8432 )
								if( ad_mf <= -98406.8 )
									ret := 0.857143 // buy
								if( ad_mf > -98406.8 )
									ret := -0.049881
					if( mf > -0.291567 )
						if( ad_mf <= -1176.73 )
							if( ad <= -2080.68 )
								if( ad <= -28970 )
									ret := 0.222433
								if( ad > -28970 )
									ret := 0.079823
							if( ad > -2080.68 )
								if( mf <= 0.367429 )
									ret := -0.118375
								if( mf > 0.367429 )
									ret := 0.360000
						if( ad_mf > -1176.73 )
							if( mf <= 0.181639 )
								if( ad <= -661 )
									ret := 0.245455
								if( ad > -661 )
									ret := -0.055556
							if( mf > 0.181639 )
								if( k <= 2.831 )
									ret := 0.076923
								if( k > 2.831 )
									ret := 0.595745
				if( d_k > 3.64455 )
					if( ad_mf <= -655.078 )
						if( ad <= -3725.03 )
							if( ad <= -3788.74 )
								if( mf <= -0.409015 )
									ret := -0.372549
								if( mf > -0.409015 )
									ret := -0.024890
							if( ad > -3788.74 )
								if( k <= 8.45596 )
									ret := -0.913043 // sell
								if( k > 8.45596 )
									ret := -0.500000
						if( ad > -3725.03 )
							if( smoothK_k <= 11.3255 )
								if( mf <= 0.324478 )
									ret := 0.136671
								if( mf > 0.324478 )
									ret := 0.534884
							if( smoothK_k > 11.3255 )
								if( ad <= -2087.21 )
									ret := 0.285714
								if( ad > -2087.21 )
									ret := -0.514286
					if( ad_mf > -655.078 )
						if( mf <= 0.06841 )
							if( d_k <= 11.4826 )
								if( ad_mf <= -371.607 )
									ret := -0.857143 // sell
								if( ad_mf > -371.607 )
									ret := -0.294118
							if( d_k > 11.4826 )
								if( ad_mf <= -573.146 )
									ret := 0.250000
								if( ad_mf > -573.146 )
									ret := 0.000000
						if( mf > 0.06841 )
							if( ad <= -488.7 )
								if( rsi1 <= 29.7309 )
									ret := -1.000000 // sell
								if( rsi1 > 29.7309 )
									ret := -0.190476
							if( ad > -488.7 )
								if( mf <= 0.225016 )
									ret := 0.727273 // buy
								if( mf > 0.225016 )
									ret := -0.222222
			if( smoothD_d > 24.9293 )
				if( mf <= 0.041311 )
					if( ad <= -818.076 )
						if( ad_mf <= -45519.4 )
							if( ad_mf <= -49766.5 )
								if( rsi1 <= 64.0342 )
									ret := 0.228733
								if( rsi1 > 64.0342 )
									ret := -0.441176
							if( ad_mf > -49766.5 )
								if( d_k <= 15.6468 )
									ret := 0.647059
								if( d_k > 15.6468 )
									ret := -0.285714
						if( ad_mf > -45519.4 )
							if( ad <= -7739.03 )
								if( mf <= -0.32031 )
									ret := -0.202100
								if( mf > -0.32031 )
									ret := 0.086754
							if( ad > -7739.03 )
								if( ad_mf <= -950.856 )
									ret := 0.146743
								if( ad_mf > -950.856 )
									ret := -0.076923
					if( ad > -818.076 )
						if( rsi1 <= 52.191 )
							if( ad_mf <= -305.254 )
								if( rsi1 <= 40.241 )
									ret := 0.191489
								if( rsi1 > 40.241 )
									ret := 0.466667
							if( ad_mf > -305.254 )
								if( ad_mf <= -217.331 )
									ret := -0.139535
								if( ad_mf > -217.331 )
									ret := 0.476190
						if( rsi1 > 52.191 )
							if( smoothK_k <= 76.5487 )
								if( ad_mf <= -741.794 )
									ret := 0.562500
								if( ad_mf > -741.794 )
									ret := -0.074324
							if( smoothK_k > 76.5487 )
								if( smoothD_d <= 77.0626 )
									ret := 0.800000 // buy
								if( smoothD_d > 77.0626 )
									ret := 0.241935
				if( mf > 0.041311 )
					if( ad_mf <= -20930.9 )
						if( ad <= -37562.8 )
							if( d_k <= -8.71809 )
								if( ad <= -66148.2 )
									ret := -0.500000
								if( ad > -66148.2 )
									ret := 0.592593
							if( d_k > -8.71809 )
								if( ad_mf <= -45607.4 )
									ret := 0.057416
								if( ad_mf > -45607.4 )
									ret := -0.391892
						if( ad > -37562.8 )
							if( smoothK_k <= 50.0094 )
								if( smoothD_d <= 62.4947 )
									ret := 0.303797
								if( smoothD_d > 62.4947 )
									ret := -0.625000
							if( smoothK_k > 50.0094 )
								if( mf <= 0.154161 )
									ret := 0.273292
								if( mf > 0.154161 )
									ret := 0.630872
					if( ad_mf > -20930.9 )
						if( ad_mf <= -20247.8 )
							if( smoothD_d <= 63.3413 )
								if( mf <= 0.133332 )
									ret := -0.846154 // sell
								if( mf > 0.133332 )
									ret := -1.000000 // sell
							if( smoothD_d > 63.3413 )
								if( smoothK_k <= 79.1997 )
									ret := -0.111111
								if( smoothK_k > 79.1997 )
									ret := 0.600000
						if( ad_mf > -20247.8 )
							if( ad_mf <= -20023.9 )
								if( smoothD_d <= 71.4234 )
									ret := 1.000000 // buy
								if( smoothD_d > 71.4234 )
									ret := 0.400000
							if( ad_mf > -20023.9 )
								if( ad <= -17516.2 )
									ret := -0.210526
								if( ad > -17516.2 )
									ret := 0.050473
		if( d > 93.1177 )
			if( ad <= -19283.4 )
				if( ad <= -21433.7 )
					if( d_k <= -3.20212 )
						if( mf <= 0.027243 )
							if( ad <= -25465.6 )
								ret := 0.000000
							if( ad > -25465.6 )
								ret := -0.750000 // sell
						if( mf > 0.027243 )
							ret := -0.857143 // sell
					if( d_k > -3.20212 )
						if( ad_mf <= -35611.2 )
							if( d_k <= -0.110801 )
								if( mf <= -0.056825 )
									ret := 0.666667
								if( mf > -0.056825 )
									ret := 0.125000
							if( d_k > -0.110801 )
								if( ad <= -35818.5 )
									ret := -0.100000
								if( ad > -35818.5 )
									ret := -1.000000 // sell
						if( ad_mf > -35611.2 )
							if( ad <= -34482.5 )
								if( d <= 97.0964 )
									ret := 1.000000 // buy
								if( d > 97.0964 )
									ret := 0.500000
							if( ad > -34482.5 )
								if( k <= 97.1455 )
									ret := 0.295455
								if( k > 97.1455 )
									ret := -0.160000
				if( ad > -21433.7 )
					if( mf <= -0.009518 )
						if( rsi1 <= 49.9199 )
							ret := 1.000000 // buy
						if( rsi1 > 49.9199 )
							if( mf <= -0.245169 )
								ret := 1.000000 // buy
							if( mf > -0.245169 )
								ret := 0.428571
					if( mf > -0.009518 )
						if( rsi1 <= 68.1843 )
							if( ad_mf <= -20268 )
								if( rsi1 <= 66.0922 )
									ret := 0.000000
								if( rsi1 > 66.0922 )
									ret := -0.600000
							if( ad_mf > -20268 )
								ret := 0.250000
						if( rsi1 > 68.1843 )
							if( d <= 96.8236 )
								if( rsi1 <= 74.6012 )
									ret := 0.500000
								if( rsi1 > 74.6012 )
									ret := 1.000000 // buy
							if( d > 96.8236 )
								ret := 0.000000
			if( ad > -19283.4 )
				if( ad <= -11192.8 )
					if( rsi1 <= 76.7156 )
						if( ad_mf <= -17884.6 )
							if( rsi1 <= 63.1022 )
								if( mf <= -0.011125 )
									ret := -0.666667
								if( mf > -0.011125 )
									ret := 0.000000
							if( rsi1 > 63.1022 )
								if( mf <= 0.209076 )
									ret := -1.000000 // sell
								if( mf > 0.209076 )
									ret := -0.500000
						if( ad_mf > -17884.6 )
							if( ad <= -14652.7 )
								if( k <= 95.5637 )
									ret := 0.297872
								if( k > 95.5637 )
									ret := -0.217391
							if( ad > -14652.7 )
								if( ad_mf <= -13973 )
									ret := -0.775000 // sell
								if( ad_mf > -13973 )
									ret := -0.222222
					if( rsi1 > 76.7156 )
						if( mf <= 0.168403 )
							if( rsi1 <= 84.2386 )
								if( smoothK_k <= 92.5222 )
									ret := 0.250000
								if( smoothK_k > 92.5222 )
									ret := 0.000000
							if( rsi1 > 84.2386 )
								if( ad <= -16529.2 )
									ret := 1.000000 // buy
								if( ad > -16529.2 )
									ret := 0.500000
						if( mf > 0.168403 )
							if( mf <= 0.286775 )
								if( ad <= -15159.5 )
									ret := -0.250000
								if( ad > -15159.5 )
									ret := -0.500000
							if( mf > 0.286775 )
								if( ad_mf <= -16354.4 )
									ret := 0.500000
								if( ad_mf > -16354.4 )
									ret := 0.000000
				if( ad > -11192.8 )
					if( smoothK_k <= 89.7673 )
						if( d_k <= 6.33463 )
							if( smoothD_d <= 91.6736 )
								if( rsi1 <= 71.3644 )
									ret := 0.025000
								if( rsi1 > 71.3644 )
									ret := -0.314286
							if( smoothD_d > 91.6736 )
								if( rsi1 <= 40.3872 )
									ret := -0.875000 // sell
								if( rsi1 > 40.3872 )
									ret := -0.259804
						if( d_k > 6.33463 )
							if( ad_mf <= -2648.9 )
								if( smoothK_k <= 81.8553 )
									ret := -0.368421
								if( smoothK_k > 81.8553 )
									ret := 0.091837
							if( ad_mf > -2648.9 )
								if( rsi1 <= 47.1531 )
									ret := -0.200000
								if( rsi1 > 47.1531 )
									ret := 0.714286 // buy
					if( smoothK_k > 89.7673 )
						if( ad_mf <= -6585.29 )
							if( smoothD_d <= 93.5269 )
								if( rsi1 <= 46.1732 )
									ret := -0.600000
								if( rsi1 > 46.1732 )
									ret := 0.134615
							if( smoothD_d > 93.5269 )
								if( smoothK_k <= 92.5157 )
									ret := 0.040816
								if( smoothK_k > 92.5157 )
									ret := 0.435583
						if( ad_mf > -6585.29 )
							if( ad <= -2349 )
								if( ad <= -2960.41 )
									ret := -0.037698
								if( ad > -2960.41 )
									ret := -0.284615
							if( ad > -2349 )
								if( ad <= -1972.88 )
									ret := 0.428571
								if( ad > -1972.88 )
									ret := 0.033333
	if( ad > -83.9794 )
		if( rsi1 <= 52.9461 )
			if( ad <= 64.6818 )
				if( rsi1 <= 45.8275 )
					if( ad <= -43.0407 )
						if( d <= 6.85838 )
							ret := -1.000000 // sell
						if( d > 6.85838 )
							if( smoothD_d <= 12.6965 )
								ret := 0.500000
							if( smoothD_d > 12.6965 )
								ret := 0.000000
					if( ad > -43.0407 )
						if( k <= 33.6914 )
							if( k <= 28.2172 )
								if( smoothD_d <= 13.0536 )
									ret := 0.157336
								if( smoothD_d > 13.0536 )
									ret := 0.262590
							if( k > 28.2172 )
								if( rsi1 <= 35.5897 )
									ret := 0.272727
								if( rsi1 > 35.5897 )
									ret := -0.096045
						if( k > 33.6914 )
							if( ad_mf <= -0.427738 )
								if( d_k <= -2.63006 )
									ret := -0.333333
								if( d_k > -2.63006 )
									ret := 0.142857
							if( ad_mf > -0.427738 )
								if( d_k <= -19.8062 )
									ret := -0.230769
								if( d_k > -19.8062 )
									ret := 0.331340
				if( rsi1 > 45.8275 )
					if( k <= 64.3254 )
						if( smoothK_k <= -1.83946 )
							if( smoothD_d <= 7.15219 )
								if( ad_mf <= -0.181079 )
									ret := 0.380952
								if( ad_mf > -0.181079 )
									ret := -0.090909
							if( smoothD_d > 7.15219 )
								if( rsi1 <= 50.0025 )
									ret := 0.933333 // buy
								if( rsi1 > 50.0025 )
									ret := 0.200000
						if( smoothK_k > -1.83946 )
							if( d_k <= 14.9267 )
								if( smoothK_k <= 13.5241 )
									ret := 0.124675
								if( smoothK_k > 13.5241 )
									ret := -0.047959
							if( d_k > 14.9267 )
								if( k <= 13.3544 )
									ret := -0.207547
								if( k > 13.3544 )
									ret := 0.319249
					if( k > 64.3254 )
						if( mf <= 0.280195 )
							if( k <= 65.3954 )
								if( mf <= -0.1673 )
									ret := 0.944444 // buy
								if( mf > -0.1673 )
									ret := 0.388889
							if( k > 65.3954 )
								if( k <= 73.4299 )
									ret := -0.004608
								if( k > 73.4299 )
									ret := 0.198347
						if( mf > 0.280195 )
							if( d_k <= 0.161942 )
								if( k <= 84.7913 )
									ret := -0.190476
								if( k > 84.7913 )
									ret := 0.666667
							if( d_k > 0.161942 )
								if( d <= 80.2178 )
									ret := 0.913043 // buy
								if( d > 80.2178 )
									ret := 0.466667
			if( ad > 64.6818 )
				if( ad_mf <= 7854.58 )
					if( mf <= -0.443967 )
						if( ad_mf <= 4024.08 )
							if( smoothD_d <= 61.6155 )
								if( smoothK_k <= 2.20559 )
									ret := 0.333333
								if( smoothK_k > 2.20559 )
									ret := -0.513274
							if( smoothD_d > 61.6155 )
								if( smoothD_d <= 83.6395 )
									ret := 0.333333
								if( smoothD_d > 83.6395 )
									ret := -0.500000
						if( ad_mf > 4024.08 )
							if( ad <= 6868.35 )
								if( mf <= -0.491224 )
									ret := 0.363636
								if( mf > -0.491224 )
									ret := 0.750000 // buy
							if( ad > 6868.35 )
								ret := -0.833333 // sell
					if( mf > -0.443967 )
						if( ad <= 7827.11 )
							if( k <= 32.711 )
								if( ad_mf <= 7531.21 )
									ret := -0.021967
								if( ad_mf > 7531.21 )
									ret := 0.251748
							if( k > 32.711 )
								if( ad <= 734.972 )
									ret := 0.210526
								if( ad > 734.972 )
									ret := 0.028623
						if( ad > 7827.11 )
							if( d_k <= -2.25131 )
								ret := 0.142857
							if( d_k > -2.25131 )
								if( mf <= -0.024965 )
									ret := -0.636364
								if( mf > -0.024965 )
									ret := -1.000000 // sell
				if( ad_mf > 7854.58 )
					if( smoothD_d <= 2.32487 )
						if( mf <= 0.166293 )
							if( ad <= 8646.74 )
								if( rsi1 <= 31.472 )
									ret := -0.173913
								if( rsi1 > 31.472 )
									ret := 0.617647
							if( ad > 8646.74 )
								if( k <= 5.24822 )
									ret := -0.154799
								if( k > 5.24822 )
									ret := 0.068493
						if( mf > 0.166293 )
							if( ad <= 16919.1 )
								if( smoothK_k <= -0.926498 )
									ret := 0.066667
								if( smoothK_k > -0.926498 )
									ret := -0.400000
							if( ad > 16919.1 )
								if( k <= 0.727391 )
									ret := -0.833333 // sell
								if( k > 0.727391 )
									ret := -0.434783
					if( smoothD_d > 2.32487 )
						if( ad <= 11740 )
							if( k <= 90.7526 )
								if( ad_mf <= 10561.4 )
									ret := 0.101806
								if( ad_mf > 10561.4 )
									ret := 0.272727
							if( k > 90.7526 )
								if( ad_mf <= 11110 )
									ret := 0.529412
								if( ad_mf > 11110 )
									ret := -0.214286
						if( ad > 11740 )
							if( ad_mf <= 12474 )
								if( d_k <= -4.0068 )
									ret := -0.308725
								if( d_k > -4.0068 )
									ret := 0.097015
							if( ad_mf > 12474 )
								if( ad <= 343028 )
									ret := 0.087156
								if( ad > 343028 )
									ret := -0.687500
		if( rsi1 > 52.9461 )
			if( ad_mf <= 1866.17 )
				if( d_k <= 0.586003 )
					if( ad_mf <= -0.168526 )
						if( smoothK_k <= 83.8384 )
							if( rsi1 <= 59.1124 )
								if( smoothK_k <= 44.0112 )
									ret := 0.226667
								if( smoothK_k > 44.0112 )
									ret := -0.148148
							if( rsi1 > 59.1124 )
								if( rsi1 <= 73.7716 )
									ret := -0.318966
								if( rsi1 > 73.7716 )
									ret := 0.185185
						if( smoothK_k > 83.8384 )
							if( smoothD_d <= 94.8728 )
								if( ad <= -45.6422 )
									ret := -0.722222 // sell
								if( ad > -45.6422 )
									ret := 0.156805
							if( smoothD_d > 94.8728 )
								if( ad_mf <= -0.325735 )
									ret := 0.037037
								if( ad_mf > -0.325735 )
									ret := -0.657143
					if( ad_mf > -0.168526 )
						if( rsi1 <= 58.0093 )
							if( smoothK_k <= 8.99278 )
								if( rsi1 <= 55.7094 )
									ret := 0.714286 // buy
								if( rsi1 > 55.7094 )
									ret := -0.166667
							if( smoothK_k > 8.99278 )
								if( mf <= -0.11182 )
									ret := -0.233415
								if( mf > -0.11182 )
									ret := -0.038239
						if( rsi1 > 58.0093 )
							if( ad <= 648.614 )
								if( smoothD_d <= 64.2043 )
									ret := -0.401697
								if( smoothD_d > 64.2043 )
									ret := -0.274223
							if( ad > 648.614 )
								if( rsi1 <= 60.6277 )
									ret := 0.062500
								if( rsi1 > 60.6277 )
									ret := -0.210243
				if( d_k > 0.586003 )
					if( k <= 67.5963 )
						if( ad_mf <= 0.027665 )
							if( smoothK_k <= -2.54684 )
								if( d_k <= 8.47944 )
									ret := 0.928571 // buy
								if( d_k > 8.47944 )
									ret := 0.250000
							if( smoothK_k > -2.54684 )
								if( d_k <= 1.47135 )
									ret := -0.555556
								if( d_k > 1.47135 )
									ret := -0.127973
						if( ad_mf > 0.027665 )
							if( smoothK_k <= 43.6597 )
								if( ad <= 1230 )
									ret := 0.147059
								if( ad > 1230 )
									ret := -0.166667
							if( smoothK_k > 43.6597 )
								if( mf <= 0.149702 )
									ret := -0.233108
								if( mf > 0.149702 )
									ret := 0.166667
					if( k > 67.5963 )
						if( ad_mf <= -0.1327 )
							if( k <= 94.9471 )
								if( rsi1 <= 59.7614 )
									ret := 0.428571
								if( rsi1 > 59.7614 )
									ret := 0.062963
							if( k > 94.9471 )
								if( rsi1 <= 71.0389 )
									ret := 0.000000
								if( rsi1 > 71.0389 )
									ret := 0.893617 // buy
						if( ad_mf > -0.1327 )
							if( k <= 73.3354 )
								if( d <= 80.5125 )
									ret := 0.367742
								if( d > 80.5125 )
									ret := -0.083333
							if( k > 73.3354 )
								if( smoothK_k <= 74.7208 )
									ret := -0.339181
								if( smoothK_k > 74.7208 )
									ret := -0.009447
			if( ad_mf > 1866.17 )
				if( rsi1 <= 74.1954 )
					if( ad_mf <= 480295 )
						if( ad <= 218179 )
							if( ad_mf <= 190804 )
								if( mf <= 0.57612 )
									ret := 0.053960
								if( mf > 0.57612 )
									ret := -0.286957
							if( ad_mf > 190804 )
								ret := 1.000000 // buy
						if( ad > 218179 )
							if( smoothD_d <= 55.1731 )
								ret := -1.000000 // sell
							if( smoothD_d > 55.1731 )
								if( smoothK_k <= 85.173 )
									ret := -0.272727
								if( smoothK_k > 85.173 )
									ret := 0.600000
					if( ad_mf > 480295 )
						if( d_k <= 0.893736 )
							ret := 1.000000 // buy
						if( d_k > 0.893736 )
							ret := 0.750000 // buy
				if( rsi1 > 74.1954 )
					if( ad_mf <= 16842.2 )
						if( ad <= 4545.98 )
							if( ad_mf <= 2903.9 )
								if( ad <= 2177.05 )
									ret := -0.343750
								if( ad > 2177.05 )
									ret := 0.066667
							if( ad_mf > 2903.9 )
								if( k <= 99.0671 )
									ret := -0.367347
								if( k > 99.0671 )
									ret := -0.106667
						if( ad > 4545.98 )
							if( ad_mf <= 9951.97 )
								if( ad <= 9790.91 )
									ret := -0.027829
								if( ad > 9790.91 )
									ret := 0.687500
							if( ad_mf > 9951.97 )
								if( ad_mf <= 10975.1 )
									ret := -0.402062
								if( ad_mf > 10975.1 )
									ret := -0.133550
					if( ad_mf > 16842.2 )
						if( d <= 98.1019 )
							if( mf <= 0.51051 )
								if( ad <= 16967.5 )
									ret := 0.833333 // buy
								if( ad > 16967.5 )
									ret := 0.046610
							if( mf > 0.51051 )
								if( d <= 31.9268 )
									ret := -1.000000 // sell
								if( d > 31.9268 )
									ret := 0.586667
						if( d > 98.1019 )
							if( rsi1 <= 87.8787 )
								if( smoothD_d <= 95.287 )
									ret := -1.000000 // sell
								if( smoothD_d > 95.287 )
									ret := -0.245098
							if( rsi1 > 87.8787 )
								if( ad_mf <= 35240.9 )
									ret := 0.571429
								if( ad_mf > 35240.9 )
									ret := -0.285714
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AFRM_1Min_5d9e5395(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


