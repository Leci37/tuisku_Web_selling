//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: BTCUSDT_30Min_2BS0_59a6bf4c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2BS0_59a6bf4c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_59a6bf4c(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 27.7619 )
		if( rsi1 <= 31.6591 )
			if( bullPower <= 22.4654 )
				if( rsi1 <= 22.2747 )
					if( bearPower <= -2877.64 )
						if( rsi1 <= 14.0146 )
							ret := -0.750000 // sell
						if( rsi1 > 14.0146 )
							if( d <= 32.8615 )
								if( smoothD_d <= 11.9932 )
									ret := 0.625000
								if( smoothD_d > 11.9932 )
									ret := 1.000000 // buy
							if( d > 32.8615 )
								ret := -0.500000
					if( bearPower > -2877.64 )
						if( k <= 5.83954 )
							if( bbm <= 26.2 )
								if( d <= 7.58755 )
									ret := 0.000000
								if( d > 7.58755 )
									ret := 0.500000
							if( bbm > 26.2 )
								if( bullPower <= -39.3956 )
									ret := -0.747734 // sell
								if( bullPower > -39.3956 )
									ret := -0.861650 // sell
						if( k > 5.83954 )
							if( d_k <= -5.79041 )
								if( d <= 7.96406 )
									ret := -0.707317 // sell
								if( d > 7.96406 )
									ret := -0.154762
							if( d_k > -5.79041 )
								if( rsi1 <= 19.0897 )
									ret := -0.723906 // sell
								if( rsi1 > 19.0897 )
									ret := -0.557587
				if( rsi1 > 22.2747 )
					if( bbp <= -2700.03 )
						if( bearPower <= -2831.85 )
							if( rsi1 <= 25.1702 )
								if( bbm <= 2366.59 )
									ret := 0.200000
								if( bbm > 2366.59 )
									ret := 0.750000 // buy
							if( rsi1 > 25.1702 )
								ret := -1.000000 // sell
						if( bearPower > -2831.85 )
							if( bearPower <= -1784.87 )
								if( bearPower <= -2021.22 )
									ret := 0.365385
								if( bearPower > -2021.22 )
									ret := 0.851852 // buy
							if( bearPower > -1784.87 )
								ret := -0.500000
					if( bbp > -2700.03 )
						if( bullPower <= -205.25 )
							if( smoothK_k <= 8.97422 )
								if( bbm <= 226.745 )
									ret := -0.014085
								if( bbm > 226.745 )
									ret := -0.376577
							if( smoothK_k > 8.97422 )
								if( bbm <= 238.269 )
									ret := 0.346939
								if( bbm > 238.269 )
									ret := -0.132353
						if( bullPower > -205.25 )
							if( bbm <= 71.3564 )
								if( d_k <= 7.31888 )
									ret := -0.136659
								if( d_k > 7.31888 )
									ret := -0.452703
							if( bbm > 71.3564 )
								if( bullPower <= -62.9006 )
									ret := -0.440339
								if( bullPower > -62.9006 )
									ret := -0.593032
			if( bullPower > 22.4654 )
				if( bullPower <= 184.78 )
					if( rsi1 <= 26.8494 )
						if( rsi1 <= 23.8132 )
							if( bullPower <= 40.9227 )
								if( bbp <= -33.4841 )
									ret := -0.855263 // sell
								if( bbp > -33.4841 )
									ret := -0.523810
							if( bullPower > 40.9227 )
								if( smoothD_d <= 21.4949 )
									ret := -0.940510 // sell
								if( smoothD_d > 21.4949 )
									ret := -0.833333 // sell
						if( rsi1 > 23.8132 )
							if( d <= 1.45882 )
								if( bullPower <= 70.082 )
									ret := -0.111111
								if( bullPower > 70.082 )
									ret := -0.705882 // sell
							if( d > 1.45882 )
								if( bbm <= 52.37 )
									ret := -0.285714
								if( bbm > 52.37 )
									ret := -0.831034 // sell
					if( rsi1 > 26.8494 )
						if( smoothD_d <= 3.86843 )
							if( bbp <= -248.995 )
								if( bbp <= -260.572 )
									ret := -0.365854
								if( bbp > -260.572 )
									ret := 1.000000 // buy
							if( bbp > -248.995 )
								if( bullPower <= 81.5324 )
									ret := -0.544118
								if( bullPower > 81.5324 )
									ret := -0.735537 // sell
						if( smoothD_d > 3.86843 )
							if( bearPower <= -114.515 )
								if( k <= 14.8595 )
									ret := -0.792453 // sell
								if( k > 14.8595 )
									ret := -0.913669 // sell
							if( bearPower > -114.515 )
								if( bullPower <= 36.7644 )
									ret := -0.388889
								if( bullPower > 36.7644 )
									ret := -0.691892
				if( bullPower > 184.78 )
					if( bearPower <= -1017.64 )
						if( bbp <= -1416.49 )
							if( k <= 11.1392 )
								ret := -0.750000 // sell
							if( k > 11.1392 )
								ret := -1.000000 // sell
						if( bbp > -1416.49 )
							ret := -0.250000
					if( bearPower > -1017.64 )
						if( bullPower <= 267.313 )
							if( bbm <= 598.905 )
								if( d <= 0.143055 )
									ret := -0.500000
								if( d > 0.143055 )
									ret := -0.891720 // sell
							if( bbm > 598.905 )
								ret := -1.000000 // sell
						if( bullPower > 267.313 )
							if( rsi1 <= 25.3696 )
								if( d_k <= 2.07945 )
									ret := -0.812500 // sell
								if( d_k > 2.07945 )
									ret := -1.000000 // sell
							if( rsi1 > 25.3696 )
								if( d_k <= 12.7704 )
									ret := -1.000000 // sell
								if( d_k > 12.7704 )
									ret := -0.971429 // sell
		if( rsi1 > 31.6591 )
			if( bullPower <= 62.4446 )
				if( bullPower <= -81.3979 )
					if( k <= 15.1579 )
						if( rsi1 <= 36.2289 )
							if( bbp <= -597.708 )
								if( smoothK_k <= 0.311799 )
									ret := -0.326923
								if( smoothK_k > 0.311799 )
									ret := 0.164659
							if( bbp > -597.708 )
								if( bbp <= -490.232 )
									ret := -0.476923
								if( bbp > -490.232 )
									ret := -0.028846
						if( rsi1 > 36.2289 )
							if( bbp <= -576.49 )
								if( smoothD_d <= -1.29235 )
									ret := -0.500000
								if( smoothD_d > -1.29235 )
									ret := 0.418462
							if( bbp > -576.49 )
								if( bbp <= -478.633 )
									ret := -0.283582
								if( bbp > -478.633 )
									ret := 0.219048
					if( k > 15.1579 )
						if( d_k <= -2.40743 )
							if( rsi1 <= 36.0248 )
								if( bbm <= 1360.21 )
									ret := 0.408397
								if( bbm > 1360.21 )
									ret := -0.750000 // sell
							if( rsi1 > 36.0248 )
								if( bbp <= -752.428 )
									ret := 0.811808 // buy
								if( bbp > -752.428 )
									ret := 0.528689
						if( d_k > -2.40743 )
							if( bearPower <= -619.237 )
								if( d_k <= 10.4464 )
									ret := 0.605263
								if( d_k > 10.4464 )
									ret := -0.071429
							if( bearPower > -619.237 )
								if( bbp <= -420.627 )
									ret := 0.151724
								if( bbp > -420.627 )
									ret := -0.181818
				if( bullPower > -81.3979 )
					if( rsi1 <= 42.6391 )
						if( bullPower <= 43.5154 )
							if( d <= 22.4267 )
								if( rsi1 <= 36.6724 )
									ret := -0.220029
								if( rsi1 > 36.6724 )
									ret := 0.006849
							if( d > 22.4267 )
								if( bbm <= 89.1502 )
									ret := -0.122715
								if( bbm > 89.1502 )
									ret := -0.384615
						if( bullPower > 43.5154 )
							if( bbm <= 60.0114 )
								if( smoothK_k <= -1.16788 )
									ret := -0.636364
								if( smoothK_k > -1.16788 )
									ret := 0.105263
							if( bbm > 60.0114 )
								if( rsi1 <= 40.8774 )
									ret := -0.589812
								if( rsi1 > 40.8774 )
									ret := -0.197183
					if( rsi1 > 42.6391 )
						if( bbm <= 140.658 )
							if( bbm <= 59.0655 )
								if( d_k <= 1.69826 )
									ret := 0.063063
								if( d_k > 1.69826 )
									ret := -0.051188
							if( bbm > 59.0655 )
								if( rsi1 <= 49.8726 )
									ret := 0.039494
								if( rsi1 > 49.8726 )
									ret := 0.306329
						if( bbm > 140.658 )
							if( d_k <= -4.10471 )
								if( k <= 27.7204 )
									ret := 0.477419
								if( k > 27.7204 )
									ret := 0.761194 // buy
							if( d_k > -4.10471 )
								if( smoothD_d <= 5.21126 )
									ret := -0.055172
								if( smoothD_d > 5.21126 )
									ret := 0.323580
			if( bullPower > 62.4446 )
				if( d_k <= -4.3618 )
					if( rsi1 <= 51.3075 )
						if( bbp <= -1.20228 )
							if( bullPower <= 196.798 )
								if( bearPower <= -592.661 )
									ret := 0.738095 // buy
								if( bearPower > -592.661 )
									ret := 0.144279
							if( bullPower > 196.798 )
								if( bearPower <= -285.165 )
									ret := -0.621622
								if( bearPower > -285.165 )
									ret := 0.800000 // buy
						if( bbp > -1.20228 )
							if( bbp <= 239.339 )
								if( rsi1 <= 42.2788 )
									ret := -0.615385
								if( rsi1 > 42.2788 )
									ret := -0.075630
							if( bbp > 239.339 )
								if( d_k <= -5.69736 )
									ret := -0.438356
								if( d_k > -5.69736 )
									ret := -0.950000 // sell
					if( rsi1 > 51.3075 )
						if( bullPower <= 493.139 )
							if( rsi1 <= 60.1509 )
								if( bearPower <= -103.959 )
									ret := 0.570312
								if( bearPower > -103.959 )
									ret := 0.239216
							if( rsi1 > 60.1509 )
								if( bearPower <= -107.136 )
									ret := 0.888889 // buy
								if( bearPower > -107.136 )
									ret := 0.554974
						if( bullPower > 493.139 )
							if( rsi1 <= 62.3219 )
								if( bbp <= 1009.71 )
									ret := -0.333333
								if( bbp > 1009.71 )
									ret := -0.941176 // sell
							if( rsi1 > 62.3219 )
								if( rsi1 <= 65.8245 )
									ret := 0.666667
								if( rsi1 > 65.8245 )
									ret := 0.057143
				if( d_k > -4.3618 )
					if( rsi1 <= 52.4206 )
						if( bbp <= 245.766 )
							if( rsi1 <= 42.6279 )
								if( bbp <= -303.227 )
									ret := -0.248619
								if( bbp > -303.227 )
									ret := -0.609436
							if( rsi1 > 42.6279 )
								if( d_k <= 6.47149 )
									ret := -0.059690
								if( d_k > 6.47149 )
									ret := -0.373626
						if( bbp > 245.766 )
							if( rsi1 <= 45.8665 )
								if( bbp <= 347.227 )
									ret := -0.696517
								if( bbp > 347.227 )
									ret := -0.838272 // sell
							if( rsi1 > 45.8665 )
								if( bearPower <= 103.297 )
									ret := -0.553415
								if( bearPower > 103.297 )
									ret := -0.775414 // sell
					if( rsi1 > 52.4206 )
						if( bearPower <= 68.4422 )
							if( bbp <= 68.7173 )
								if( bullPower <= 98.9501 )
									ret := 0.320000
								if( bullPower > 98.9501 )
									ret := 0.620553
							if( bbp > 68.7173 )
								if( bearPower <= -188.683 )
									ret := 0.697674
								if( bearPower > -188.683 )
									ret := 0.103758
						if( bearPower > 68.4422 )
							if( rsi1 <= 65.9478 )
								if( bbp <= 675.686 )
									ret := -0.224949
								if( bbp > 675.686 )
									ret := -0.549195
							if( rsi1 > 65.9478 )
								if( bbp <= 1940.75 )
									ret := 0.380841
								if( bbp > 1940.75 )
									ret := -0.500000
	if( smoothK_k > 27.7619 )
		if( d_k <= 3.46648 )
			if( rsi1 <= 55.7335 )
				if( bbp <= -229.782 )
					if( rsi1 <= 39.7225 )
						if( bullPower <= -669.486 )
							if( rsi1 <= 26.7504 )
								if( d_k <= -7.28547 )
									ret := 0.444444
								if( d_k > -7.28547 )
									ret := -0.281250
							if( rsi1 > 26.7504 )
								if( d <= 85.7947 )
									ret := 0.822727 // buy
								if( d > 85.7947 )
									ret := 0.272727
						if( bullPower > -669.486 )
							if( d_k <= -6.36441 )
								if( rsi1 <= 30.1974 )
									ret := -0.187500
								if( rsi1 > 30.1974 )
									ret := 0.258741
							if( d_k > -6.36441 )
								if( rsi1 <= 34.5526 )
									ret := -0.365169
								if( rsi1 > 34.5526 )
									ret := 0.033797
					if( rsi1 > 39.7225 )
						if( d_k <= -3.64302 )
							if( bbp <= -310.705 )
								if( bearPower <= -762.95 )
									ret := 0.799427 // buy
								if( bearPower > -762.95 )
									ret := 0.655451
							if( bbp > -310.705 )
								if( rsi1 <= 49.0728 )
									ret := 0.209677
								if( rsi1 > 49.0728 )
									ret := 0.608108
						if( d_k > -3.64302 )
							if( bullPower <= -104.655 )
								if( bbm <= 1003.37 )
									ret := 0.569124
								if( bbm > 1003.37 )
									ret := -0.066667
							if( bullPower > -104.655 )
								if( bbp <= -741.676 )
									ret := 0.775862 // buy
								if( bbp > -741.676 )
									ret := 0.199153
				if( bbp > -229.782 )
					if( rsi1 <= 43.6745 )
						if( bullPower <= 79.0153 )
							if( bearPower <= -128.202 )
								if( rsi1 <= 36.2823 )
									ret := -0.621469
								if( rsi1 > 36.2823 )
									ret := -0.151261
							if( bearPower > -128.202 )
								if( bullPower <= -13.0676 )
									ret := 0.050955
								if( bullPower > -13.0676 )
									ret := -0.125535
						if( bullPower > 79.0153 )
							if( d_k <= -17.3719 )
								if( k <= 84.4407 )
									ret := -0.076923
								if( k > 84.4407 )
									ret := 1.000000 // buy
							if( d_k > -17.3719 )
								if( bbm <= 115.265 )
									ret := 0.000000
								if( bbm > 115.265 )
									ret := -0.596187
					if( rsi1 > 43.6745 )
						if( bbp <= 237.233 )
							if( bbp <= -27.2939 )
								if( rsi1 <= 50.5656 )
									ret := 0.175072
								if( rsi1 > 50.5656 )
									ret := 0.352359
							if( bbp > -27.2939 )
								if( rsi1 <= 50.4754 )
									ret := -0.101459
								if( rsi1 > 50.4754 )
									ret := 0.113391
						if( bbp > 237.233 )
							if( rsi1 <= 49.8224 )
								if( smoothK_k <= 29.303 )
									ret := 0.500000
								if( smoothK_k > 29.303 )
									ret := -0.561688
							if( rsi1 > 49.8224 )
								if( d_k <= -5.8393 )
									ret := -0.013274
								if( d_k > -5.8393 )
									ret := -0.338028
			if( rsi1 > 55.7335 )
				if( bearPower <= -50.4383 )
					if( rsi1 <= 62.7596 )
						if( bearPower <= -244.999 )
							if( bullPower <= 900.43 )
								if( smoothD_d <= 86.1986 )
									ret := 0.832195 // buy
								if( smoothD_d > 86.1986 )
									ret := 0.663158
							if( bullPower > 900.43 )
								if( bbm <= 1645.4 )
									ret := -0.750000 // sell
								if( bbm > 1645.4 )
									ret := 0.400000
						if( bearPower > -244.999 )
							if( bullPower <= 843.756 )
								if( rsi1 <= 59.0476 )
									ret := 0.469722
								if( rsi1 > 59.0476 )
									ret := 0.626866
							if( bullPower > 843.756 )
								if( bbm <= 1160.84 )
									ret := -0.833333 // sell
								if( bbm > 1160.84 )
									ret := -0.500000
					if( rsi1 > 62.7596 )
						if( bullPower <= 1371.76 )
							if( rsi1 <= 72.7351 )
								if( bearPower <= -181.649 )
									ret := 0.845494 // buy
								if( bearPower > -181.649 )
									ret := 0.710706 // buy
							if( rsi1 > 72.7351 )
								if( smoothD_d <= 78.3774 )
									ret := 0.768786 // buy
								if( smoothD_d > 78.3774 )
									ret := 0.908629 // buy
						if( bullPower > 1371.76 )
							if( d_k <= -4.84717 )
								ret := -0.750000 // sell
							if( d_k > -4.84717 )
								ret := 0.000000
				if( bearPower > -50.4383 )
					if( k <= 93.6281 )
						if( rsi1 <= 69.1216 )
							if( bullPower <= 605.34 )
								if( d_k <= -4.02864 )
									ret := 0.307995
								if( d_k > -4.02864 )
									ret := 0.115250
							if( bullPower > 605.34 )
								if( bbp <= 1533.65 )
									ret := -0.020045
								if( bbp > 1533.65 )
									ret := -0.534351
						if( rsi1 > 69.1216 )
							if( bbp <= 1232.59 )
								if( bbm <= 164.44 )
									ret := 0.433711
								if( bbm > 164.44 )
									ret := 0.613029
							if( bbp > 1232.59 )
								if( bearPower <= 448.937 )
									ret := 0.541935
								if( bearPower > 448.937 )
									ret := 0.195011
					if( k > 93.6281 )
						if( rsi1 <= 70.7843 )
							if( rsi1 <= 64.7843 )
								if( bearPower <= -23.4936 )
									ret := 0.321608
								if( bearPower > -23.4936 )
									ret := 0.080737
							if( rsi1 > 64.7843 )
								if( bearPower <= 42.5258 )
									ret := 0.497674
								if( bearPower > 42.5258 )
									ret := 0.205379
						if( rsi1 > 70.7843 )
							if( bearPower <= 268.731 )
								if( rsi1 <= 75.5973 )
									ret := 0.557159
								if( rsi1 > 75.5973 )
									ret := 0.779098 // buy
							if( bearPower > 268.731 )
								if( d_k <= -17.1165 )
									ret := -0.625000
								if( d_k > -17.1165 )
									ret := 0.619979
		if( d_k > 3.46648 )
			if( smoothK_k <= 72.039 )
				if( bbm <= 281.632 )
					if( d_k <= 14.3594 )
						if( rsi1 <= 59.8101 )
							if( bearPower <= 35.5752 )
								if( bullPower <= 82.2101 )
									ret := -0.068851
								if( bullPower > 82.2101 )
									ret := -0.360691
							if( bearPower > 35.5752 )
								if( bearPower <= 82.7644 )
									ret := -0.407725
								if( bearPower > 82.7644 )
									ret := -0.631111
						if( rsi1 > 59.8101 )
							if( bearPower <= 214.039 )
								if( rsi1 <= 70.0295 )
									ret := 0.193582
								if( rsi1 > 70.0295 )
									ret := 0.493421
							if( bearPower > 214.039 )
								if( rsi1 <= 73.5468 )
									ret := -0.461538
								if( rsi1 > 73.5468 )
									ret := 0.366667
					if( d_k > 14.3594 )
						if( bullPower <= 98.7284 )
							if( d <= 79.2487 )
								if( rsi1 <= 49.83 )
									ret := -0.320588
								if( rsi1 > 49.83 )
									ret := 0.085174
							if( d > 79.2487 )
								if( bullPower <= 23.4894 )
									ret := 0.320000
								if( bullPower > 23.4894 )
									ret := -0.102041
						if( bullPower > 98.7284 )
							if( d <= 82.8726 )
								if( bbm <= 117.815 )
									ret := -0.185484
								if( bbm > 117.815 )
									ret := -0.432373
							if( d > 82.8726 )
								if( rsi1 <= 49.7301 )
									ret := -0.482759
								if( rsi1 > 49.7301 )
									ret := 0.360000
				if( bbm > 281.632 )
					if( rsi1 <= 63.3212 )
						if( bbp <= 23.2797 )
							if( bullPower <= 205.242 )
								if( d <= 48.3696 )
									ret := 0.033708
								if( d > 48.3696 )
									ret := -0.209279
							if( bullPower > 205.242 )
								if( rsi1 <= 47.7592 )
									ret := -0.640625
								if( rsi1 > 47.7592 )
									ret := 0.784810 // buy
						if( bbp > 23.2797 )
							if( rsi1 <= 56.2288 )
								if( smoothD_d <= 45.729 )
									ret := -0.408451
								if( smoothD_d > 45.729 )
									ret := -0.764133 // sell
							if( rsi1 > 56.2288 )
								if( bbp <= 951.434 )
									ret := -0.240099
								if( bbp > 951.434 )
									ret := -0.791304 // sell
					if( rsi1 > 63.3212 )
						if( bbp <= 853.611 )
							if( d_k <= 20.4653 )
								if( bearPower <= 95.7278 )
									ret := 0.505102
								if( bearPower > 95.7278 )
									ret := 0.113043
							if( d_k > 20.4653 )
								if( bearPower <= 65.2403 )
									ret := -1.000000 // sell
								if( bearPower > 65.2403 )
									ret := 0.111111
						if( bbp > 853.611 )
							if( rsi1 <= 73.5929 )
								if( d_k <= 3.80312 )
									ret := 0.666667
								if( d_k > 3.80312 )
									ret := -0.443730
							if( rsi1 > 73.5929 )
								if( bearPower <= 783.059 )
									ret := 0.288136
								if( bearPower > 783.059 )
									ret := -0.535714
			if( smoothK_k > 72.039 )
				if( rsi1 <= 62.805 )
					if( bearPower <= 60.0305 )
						if( rsi1 <= 55.1039 )
							if( bullPower <= 137.266 )
								if( bullPower <= 33.4237 )
									ret := 0.005780
								if( bullPower > 33.4237 )
									ret := -0.204604
							if( bullPower > 137.266 )
								if( smoothD_d <= 92.7578 )
									ret := -0.586667
								if( smoothD_d > 92.7578 )
									ret := 0.000000
						if( rsi1 > 55.1039 )
							if( bbp <= -66.0153 )
								if( smoothK_k <= 78.326 )
									ret := 0.414634
								if( smoothK_k > 78.326 )
									ret := 0.691176
							if( bbp > -66.0153 )
								if( bbp <= 527.77 )
									ret := 0.106239
								if( bbp > 527.77 )
									ret := -0.628571
					if( bearPower > 60.0305 )
						if( bbp <= 904.52 )
							if( bbm <= 382.49 )
								if( bullPower <= 494.674 )
									ret := -0.419355
								if( bullPower > 494.674 )
									ret := 0.030303
							if( bbm > 382.49 )
								if( d_k <= 7.17447 )
									ret := -0.411765
								if( d_k > 7.17447 )
									ret := -1.000000 // sell
						if( bbp > 904.52 )
							if( bbm <= 582.413 )
								if( rsi1 <= 61.4805 )
									ret := -0.830189 // sell
								if( rsi1 > 61.4805 )
									ret := -0.384615
							if( bbm > 582.413 )
								if( smoothK_k <= 84.5854 )
									ret := -0.979167 // sell
								if( smoothK_k > 84.5854 )
									ret := -0.714286 // sell
				if( rsi1 > 62.805 )
					if( bearPower <= 123.231 )
						if( rsi1 <= 68.9871 )
							if( bbp <= -51.9735 )
								if( d_k <= 5.76486 )
									ret := 0.676471
								if( d_k > 5.76486 )
									ret := 0.961538 // buy
							if( bbp > -51.9735 )
								if( bullPower <= 678.701 )
									ret := 0.282353
								if( bullPower > 678.701 )
									ret := -0.470588
						if( rsi1 > 68.9871 )
							if( bbm <= 65.5033 )
								if( bbp <= 99.8421 )
									ret := 0.553846
								if( bbp > 99.8421 )
									ret := 0.206349
							if( bbm > 65.5033 )
								if( bearPower <= -43.4246 )
									ret := 0.866667 // buy
								if( bearPower > -43.4246 )
									ret := 0.615854
					if( bearPower > 123.231 )
						if( d <= 90.9674 )
							if( rsi1 <= 79.5449 )
								if( bbm <= 530.638 )
									ret := -0.338369
								if( bbm > 530.638 )
									ret := 0.013699
							if( rsi1 > 79.5449 )
								if( bullPower <= 949.537 )
									ret := 0.569620
								if( bullPower > 949.537 )
									ret := 0.030303
						if( d > 90.9674 )
							if( d <= 92.7948 )
								if( rsi1 <= 67.2747 )
									ret := -0.312500
								if( rsi1 > 67.2747 )
									ret := 0.255556
							if( d > 92.7948 )
								if( rsi1 <= 65.4449 )
									ret := -0.266667
								if( rsi1 > 65.4449 )
									ret := 0.437956
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_BTCUSDT_30Min_59a6bf4c(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


