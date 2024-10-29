//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: BNBUSDT_15Min_1S00_8a3aa3a0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_1S00_8a3aa3a0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_8a3aa3a0(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 46.9163 )
		if( k <= 26.0365 )
			if( rsi1 <= 29.6294 )
				if( smoothD_d <= 10.8567 )
					if( k <= 0.155221 )
						if( d <= 6.11481 )
							if( smoothD_d <= -0.236897 )
								if( smoothD_d <= -1.67118 )
									ret := -0.610927
								if( smoothD_d > -1.67118 )
									ret := -0.361702
							if( smoothD_d > -0.236897 )
								if( rsi1 <= 16.2495 )
									ret := -0.547945
								if( rsi1 > 16.2495 )
									ret := -0.799465 // sell
						if( d > 6.11481 )
							if( d <= 6.38636 )
								if( smoothD_d <= 3.26082 )
									ret := -0.391304
								if( smoothD_d > 3.26082 )
									ret := 0.684211
							if( d > 6.38636 )
								if( k <= 0.037793 )
									ret := -0.464516
								if( k > 0.037793 )
									ret := -1.000000 // sell
					if( k > 0.155221 )
						if( rsi1 <= 10.3353 )
							if( d <= 5.89099 )
								if( smoothD_d <= -2.67955 )
									ret := 0.666667
								if( smoothD_d > -2.67955 )
									ret := -0.109375
							if( d > 5.89099 )
								if( k <= 1.75457 )
									ret := -1.000000 // sell
								if( k > 1.75457 )
									ret := -0.678571
						if( rsi1 > 10.3353 )
							if( d <= 2.94168 )
								if( d <= 2.62859 )
									ret := -0.523780
								if( d > 2.62859 )
									ret := -0.793814 // sell
							if( d > 2.94168 )
								if( k <= 22.1516 )
									ret := -0.453586
								if( k > 22.1516 )
									ret := -0.053333
				if( smoothD_d > 10.8567 )
					if( d_k <= 3.88129 )
						if( d <= 22.9361 )
							if( d_k <= -2.5241 )
								if( smoothK_k <= 20.4851 )
									ret := -0.539171
								if( smoothK_k > 20.4851 )
									ret := -0.054054
							if( d_k > -2.5241 )
								if( smoothD_d <= 14.2481 )
									ret := 0.114068
								if( smoothD_d > 14.2481 )
									ret := -0.234615
						if( d > 22.9361 )
							if( rsi1 <= 24.8035 )
								if( rsi1 <= 22.2953 )
									ret := 0.714286 // buy
								if( rsi1 > 22.2953 )
									ret := 0.970588 // buy
							if( rsi1 > 24.8035 )
								if( k <= 24.5667 )
									ret := 0.413043
								if( k > 24.5667 )
									ret := -0.238095
					if( d_k > 3.88129 )
						if( d_k <= 12.6596 )
							if( smoothD_d <= 28.705 )
								if( d_k <= 8.53903 )
									ret := -0.503650
								if( d_k > 8.53903 )
									ret := -0.120690
							if( smoothD_d > 28.705 )
								if( d_k <= 10.7536 )
									ret := 0.461538
								if( d_k > 10.7536 )
									ret := -0.538462
						if( d_k > 12.6596 )
							if( d_k <= 18.5753 )
								if( d_k <= 16.4108 )
									ret := -0.464589
								if( d_k > 16.4108 )
									ret := -0.767442 // sell
							if( d_k > 18.5753 )
								if( d_k <= 21.0964 )
									ret := 0.000000
								if( d_k > 21.0964 )
									ret := -0.473684
			if( rsi1 > 29.6294 )
				if( d <= 6.80689 )
					if( k <= 7.85382 )
						if( d_k <= -2.82043 )
							if( rsi1 <= 43.4786 )
								if( d <= 1.77814 )
									ret := -0.796610 // sell
								if( d > 1.77814 )
									ret := -0.336879
							if( rsi1 > 43.4786 )
								if( rsi1 <= 43.7351 )
									ret := -1.000000 // sell
								if( rsi1 > 43.7351 )
									ret := -0.710145 // sell
						if( d_k > -2.82043 )
							if( rsi1 <= 31.2284 )
								if( smoothK_k <= 2.22779 )
									ret := -0.134357
								if( smoothK_k > 2.22779 )
									ret := 0.193182
							if( rsi1 > 31.2284 )
								if( rsi1 <= 33.3246 )
									ret := -0.580997
								if( rsi1 > 33.3246 )
									ret := -0.307485
					if( k > 7.85382 )
						if( smoothK_k <= 5.55153 )
							if( d_k <= -3.76739 )
								if( smoothD_d <= -0.114919 )
									ret := -0.363636
								if( smoothD_d > -0.114919 )
									ret := -0.854369 // sell
							if( d_k > -3.76739 )
								if( d <= 6.21783 )
									ret := -0.254545
								if( d > 6.21783 )
									ret := -0.918919 // sell
						if( smoothK_k > 5.55153 )
							if( rsi1 <= 43.9067 )
								if( d <= 3.30044 )
									ret := -0.857143 // sell
								if( d > 3.30044 )
									ret := -0.525352
							if( rsi1 > 43.9067 )
								if( k <= 10.1282 )
									ret := 0.418182
								if( k > 10.1282 )
									ret := -0.393617
				if( d > 6.80689 )
					if( d_k <= -7.07068 )
						if( smoothD_d <= 11.9692 )
							if( smoothD_d <= 9.88605 )
								if( smoothK_k <= 15.39 )
									ret := -0.625000
								if( smoothK_k > 15.39 )
									ret := -0.328063
							if( smoothD_d > 9.88605 )
								if( smoothK_k <= 20.205 )
									ret := 0.178082
								if( smoothK_k > 20.205 )
									ret := -0.290000
						if( smoothD_d > 11.9692 )
							if( smoothK_k <= 22.5614 )
								if( rsi1 <= 30.8247 )
									ret := 0.000000
								if( rsi1 > 30.8247 )
									ret := -0.687500
							if( smoothK_k > 22.5614 )
								if( d <= 16.9961 )
									ret := -0.820513 // sell
								if( d > 16.9961 )
									ret := -0.960000 // sell
					if( d_k > -7.07068 )
						if( k <= 0.018462 )
							if( rsi1 <= 37.1494 )
								if( smoothD_d <= 20.3263 )
									ret := -0.718543 // sell
								if( smoothD_d > 20.3263 )
									ret := 0.173913
							if( rsi1 > 37.1494 )
								if( rsi1 <= 45.3507 )
									ret := -0.240132
								if( rsi1 > 45.3507 )
									ret := 0.211538
						if( k > 0.018462 )
							if( d <= 26.6244 )
								if( d_k <= -1.63722 )
									ret := -0.270119
								if( d_k > -1.63722 )
									ret := -0.177597
							if( d > 26.6244 )
								if( smoothK_k <= 20.988 )
									ret := -0.318890
								if( smoothK_k > 20.988 )
									ret := -0.493976
		if( k > 26.0365 )
			if( d_k <= 5.16488 )
				if( rsi1 <= 34.4867 )
					if( smoothK_k <= 57.4904 )
						if( d <= 20.8113 )
							if( smoothK_k <= 24.4192 )
								if( smoothD_d <= 16.069 )
									ret := 0.194444
								if( smoothD_d > 16.069 )
									ret := -0.763158 // sell
							if( smoothK_k > 24.4192 )
								if( d <= 18.2622 )
									ret := -0.652482
								if( d > 18.2622 )
									ret := -0.366667
						if( d > 20.8113 )
							if( smoothD_d <= 41.718 )
								if( rsi1 <= 26.4728 )
									ret := -0.356490
								if( rsi1 > 26.4728 )
									ret := -0.131148
							if( smoothD_d > 41.718 )
								if( smoothD_d <= 47.2223 )
									ret := -0.488095
								if( smoothD_d > 47.2223 )
									ret := -0.198413
					if( smoothK_k > 57.4904 )
						if( d_k <= -1.19151 )
							if( smoothD_d <= 63.7571 )
								if( smoothK_k <= 75.2593 )
									ret := -0.104762
								if( smoothK_k > 75.2593 )
									ret := 0.391304
							if( smoothD_d > 63.7571 )
								if( k <= 98.8706 )
									ret := -0.302941
								if( k > 98.8706 )
									ret := 0.451613
						if( d_k > -1.19151 )
							if( d <= 94.3279 )
								if( smoothD_d <= 88.1945 )
									ret := 0.245399
								if( smoothD_d > 88.1945 )
									ret := -0.809524 // sell
							if( d > 94.3279 )
								if( smoothK_k <= 93.6562 )
									ret := 0.827586 // buy
								if( smoothK_k > 93.6562 )
									ret := 0.500000
				if( rsi1 > 34.4867 )
					if( d <= 26.7725 )
						if( k <= 26.3987 )
							if( d <= 14.5596 )
								ret := -0.181818
							if( d > 14.5596 )
								if( rsi1 <= 39.596 )
									ret := 0.740741 // buy
								if( rsi1 > 39.596 )
									ret := 0.085714
						if( k > 26.3987 )
							if( smoothK_k <= 32.0475 )
								if( smoothK_k <= 30.5387 )
									ret := -0.162437
								if( smoothK_k > 30.5387 )
									ret := 0.120482
							if( smoothK_k > 32.0475 )
								if( rsi1 <= 43.8105 )
									ret := -0.486239
								if( rsi1 > 43.8105 )
									ret := 0.036585
					if( d > 26.7725 )
						if( d_k <= -5.12432 )
							if( d_k <= -14.2369 )
								if( k <= 43.5247 )
									ret := 0.720930 // buy
								if( k > 43.5247 )
									ret := 0.001830
							if( d_k > -14.2369 )
								if( k <= 83.5666 )
									ret := 0.148919
								if( k > 83.5666 )
									ret := 0.304645
						if( d_k > -5.12432 )
							if( d_k <= 2.70204 )
								if( smoothD_d <= 78.8097 )
									ret := -0.087201
								if( smoothD_d > 78.8097 )
									ret := 0.126326
							if( d_k > 2.70204 )
								if( smoothK_k <= 80.7708 )
									ret := 0.064208
								if( smoothK_k > 80.7708 )
									ret := 0.414530
			if( d_k > 5.16488 )
				if( d <= 54.1197 )
					if( d <= 53.3767 )
						if( d <= 35.0555 )
							if( rsi1 <= 42.0522 )
								if( d_k <= 6.78346 )
									ret := -0.611111
								if( d_k > 6.78346 )
									ret := -0.907407 // sell
							if( rsi1 > 42.0522 )
								if( smoothD_d <= 30.8622 )
									ret := 0.166667
								if( smoothD_d > 30.8622 )
									ret := 0.363636
						if( d > 35.0555 )
							if( k <= 40.5369 )
								if( k <= 37.6762 )
									ret := -0.290402
								if( k > 37.6762 )
									ret := -0.041322
							if( k > 40.5369 )
								if( d <= 48.1748 )
									ret := -0.900000 // sell
								if( d > 48.1748 )
									ret := -0.422857
					if( d > 53.3767 )
						if( smoothD_d <= 50.6507 )
							if( k <= 38.4457 )
								if( smoothK_k <= 31.0652 )
									ret := -0.800000 // sell
								if( smoothK_k > 31.0652 )
									ret := -0.428571
							if( k > 38.4457 )
								ret := -1.000000 // sell
						if( smoothD_d > 50.6507 )
							if( rsi1 <= 43.0861 )
								if( rsi1 <= 36.7582 )
									ret := -0.333333
								if( rsi1 > 36.7582 )
									ret := -0.771429 // sell
							if( rsi1 > 43.0861 )
								ret := -0.076923
				if( d > 54.1197 )
					if( smoothK_k <= 75.4657 )
						if( smoothD_d <= 68.4932 )
							if( d <= 70.1049 )
								if( smoothD_d <= 51.3235 )
									ret := 0.650000
								if( smoothD_d > 51.3235 )
									ret := -0.163049
							if( d > 70.1049 )
								if( d_k <= 11.7501 )
									ret := -0.078947
								if( d_k > 11.7501 )
									ret := 0.496732
						if( smoothD_d > 68.4932 )
							if( smoothD_d <= 70.0257 )
								if( d_k <= 16.5612 )
									ret := -0.460000
								if( d_k > 16.5612 )
									ret := -0.728261 // sell
							if( smoothD_d > 70.0257 )
								if( d_k <= 7.61257 )
									ret := -0.625767
								if( d_k > 7.61257 )
									ret := -0.142412
					if( smoothK_k > 75.4657 )
						if( smoothD_d <= 86.8104 )
							if( d_k <= 5.9796 )
								if( smoothK_k <= 79.0114 )
									ret := -0.300000
								if( smoothK_k > 79.0114 )
									ret := -0.714286 // sell
							if( d_k > 5.9796 )
								if( smoothD_d <= 85.5246 )
									ret := 0.113636
								if( smoothD_d > 85.5246 )
									ret := 0.716216 // buy
						if( smoothD_d > 86.8104 )
							if( d_k <= 9.10215 )
								if( rsi1 <= 34.5024 )
									ret := -0.464286
								if( rsi1 > 34.5024 )
									ret := 0.300000
							if( d_k > 9.10215 )
								if( rsi1 <= 41.9705 )
									ret := 0.000000
								if( rsi1 > 41.9705 )
									ret := -0.813953 // sell
	if( rsi1 > 46.9163 )
		if( smoothK_k <= 61.1584 )
			if( d <= 21.1293 )
				if( smoothK_k <= 11.0144 )
					if( rsi1 <= 51.0461 )
						if( d <= 17.4322 )
							if( rsi1 <= 50.0364 )
								if( d <= 10.4803 )
									ret := -0.278539
								if( d > 10.4803 )
									ret := -0.066838
							if( rsi1 > 50.0364 )
								if( smoothD_d <= -2.36318 )
									ret := -1.000000 // sell
								if( smoothD_d > -2.36318 )
									ret := -0.473430
						if( d > 17.4322 )
							if( smoothK_k <= 1.21611 )
								if( k <= 2.53704 )
									ret := -1.000000 // sell
								if( k > 2.53704 )
									ret := -0.666667
							if( smoothK_k > 1.21611 )
								if( rsi1 <= 47.712 )
									ret := -0.777778 // sell
								if( rsi1 > 47.712 )
									ret := -0.255814
					if( rsi1 > 51.0461 )
						if( d_k <= 17.2598 )
							if( smoothD_d <= 15.8788 )
								if( k <= 8.56174 )
									ret := -0.174825
								if( k > 8.56174 )
									ret := -0.037810
							if( smoothD_d > 15.8788 )
								if( smoothK_k <= 0.722497 )
									ret := -0.923077 // sell
								if( smoothK_k > 0.722497 )
									ret := -0.426036
						if( d_k > 17.2598 )
							ret := 0.722222 // buy
				if( smoothK_k > 11.0144 )
					if( smoothK_k <= 32.6177 )
						if( k <= 33.3221 )
							if( d_k <= 3.87148 )
								if( d <= 18.0891 )
									ret := 0.014778
								if( d > 18.0891 )
									ret := -0.151057
							if( d_k > 3.87148 )
								if( d <= 19.8903 )
									ret := 0.821429 // buy
								if( d > 19.8903 )
									ret := 0.416667
						if( k > 33.3221 )
							if( d_k <= -19.0774 )
								if( smoothD_d <= 10.6608 )
									ret := -0.090909
								if( smoothD_d > 10.6608 )
									ret := -0.538462
							if( d_k > -19.0774 )
								if( d <= 19.3924 )
									ret := 0.606061
								if( d > 19.3924 )
									ret := -0.151515
					if( smoothK_k > 32.6177 )
						if( d <= 16.2386 )
							ret := -0.875000 // sell
						if( d > 16.2386 )
							if( smoothK_k <= 40.1654 )
								if( d <= 20.0195 )
									ret := 0.012987
								if( d > 20.0195 )
									ret := -0.280000
							if( smoothK_k > 40.1654 )
								if( smoothK_k <= 40.7196 )
									ret := -0.916667 // sell
								if( smoothK_k > 40.7196 )
									ret := -0.100000
			if( d > 21.1293 )
				if( k <= 36.2834 )
					if( k <= 10.4704 )
						if( smoothD_d <= 19.8322 )
							if( d_k <= 13.2039 )
								if( smoothD_d <= 18.5271 )
									ret := 0.384615
								if( smoothD_d > 18.5271 )
									ret := 0.083333
							if( d_k > 13.2039 )
								if( rsi1 <= 54.3488 )
									ret := 0.853333 // buy
								if( rsi1 > 54.3488 )
									ret := 0.423077
						if( smoothD_d > 19.8322 )
							if( smoothK_k <= 6.65285 )
								if( k <= 7.69307 )
									ret := 0.000000
								if( k > 7.69307 )
									ret := -0.330000
							if( smoothK_k > 6.65285 )
								if( k <= 9.8094 )
									ret := 0.941176 // buy
								if( k > 9.8094 )
									ret := 0.220000
					if( k > 10.4704 )
						if( d_k <= 0.465824 )
							if( smoothD_d <= 18.263 )
								if( smoothD_d <= 18.2136 )
									ret := 0.461538
								if( smoothD_d > 18.2136 )
									ret := 0.944444 // buy
							if( smoothD_d > 18.263 )
								if( smoothD_d <= 19.6096 )
									ret := -0.137809
								if( smoothD_d > 19.6096 )
									ret := 0.142461
						if( d_k > 0.465824 )
							if( d <= 58.4915 )
								if( rsi1 <= 76.4769 )
									ret := -0.098377
								if( rsi1 > 76.4769 )
									ret := 0.661290
							if( d > 58.4915 )
								if( d_k <= 28.4294 )
									ret := 0.026316
								if( d_k > 28.4294 )
									ret := 0.541176
				if( k > 36.2834 )
					if( d_k <= 2.72166 )
						if( rsi1 <= 71.2061 )
							if( k <= 63.4214 )
								if( rsi1 <= 65.4806 )
									ret := 0.120150
								if( rsi1 > 65.4806 )
									ret := 0.245455
							if( k > 63.4214 )
								if( d_k <= -0.465847 )
									ret := -0.094937
								if( d_k > -0.465847 )
									ret := -0.693878
						if( rsi1 > 71.2061 )
							if( smoothD_d <= 60.9618 )
								if( k <= 46.5955 )
									ret := -0.056818
								if( k > 46.5955 )
									ret := 0.514831
							if( smoothD_d > 60.9618 )
								ret := -0.666667
					if( d_k > 2.72166 )
						if( d_k <= 13.1918 )
							if( k <= 55.9477 )
								if( k <= 47.7231 )
									ret := -0.070393
								if( k > 47.7231 )
									ret := -0.209993
							if( k > 55.9477 )
								if( d <= 62.6244 )
									ret := 0.431655
								if( d > 62.6244 )
									ret := -0.031095
						if( d_k > 13.1918 )
							if( rsi1 <= 63.4676 )
								if( smoothD_d <= 62.3726 )
									ret := -0.028065
								if( smoothD_d > 62.3726 )
									ret := 0.224094
							if( rsi1 > 63.4676 )
								if( d <= 80.1327 )
									ret := 0.393993
								if( d > 80.1327 )
									ret := -0.228571
		if( smoothK_k > 61.1584 )
			if( rsi1 <= 64.3778 )
				if( k <= 87.5578 )
					if( k <= 71.556 )
						if( d_k <= 15.3164 )
							if( d_k <= -8.0089 )
								if( smoothK_k <= 63.4326 )
									ret := 0.458599
								if( smoothK_k > 63.4326 )
									ret := 0.228121
							if( d_k > -8.0089 )
								if( d <= 58.7264 )
									ret := -0.411765
								if( d > 58.7264 )
									ret := 0.099866
						if( d_k > 15.3164 )
							if( smoothK_k <= 61.5497 )
								ret := 0.857143 // buy
							if( smoothK_k > 61.5497 )
								if( smoothK_k <= 67.5892 )
									ret := 0.436275
								if( smoothK_k > 67.5892 )
									ret := 0.842105 // buy
					if( k > 71.556 )
						if( d_k <= -6.48837 )
							if( rsi1 <= 56.972 )
								if( smoothD_d <= 50.931 )
									ret := -0.216981
								if( smoothD_d > 50.931 )
									ret := 0.164223
							if( rsi1 > 56.972 )
								if( d <= 73.5707 )
									ret := 0.243519
								if( d > 73.5707 )
									ret := 0.609524
						if( d_k > -6.48837 )
							if( rsi1 <= 60.0043 )
								if( smoothD_d <= 71.6376 )
									ret := -0.175299
								if( smoothD_d > 71.6376 )
									ret := 0.089133
							if( rsi1 > 60.0043 )
								if( d <= 81.7962 )
									ret := -0.009311
								if( d > 81.7962 )
									ret := 0.298701
				if( k > 87.5578 )
					if( d <= 78.4079 )
						if( smoothD_d <= 73.1986 )
							if( k <= 99.0212 )
								if( smoothD_d <= 68.1973 )
									ret := 0.408219
								if( smoothD_d > 68.1973 )
									ret := 0.151671
							if( k > 99.0212 )
								if( d <= 71.6778 )
									ret := 0.352941
								if( d > 71.6778 )
									ret := 0.837838 // buy
						if( smoothD_d > 73.1986 )
							if( smoothK_k <= 87.0644 )
								if( d <= 77.5209 )
									ret := -0.541667
								if( d > 77.5209 )
									ret := -0.829787 // sell
							if( smoothK_k > 87.0644 )
								if( d_k <= -21.697 )
									ret := -0.437500
								if( d_k > -21.697 )
									ret := 0.070064
					if( d > 78.4079 )
						if( d_k <= -13.966 )
							if( smoothK_k <= 94.3774 )
								if( smoothK_k <= 91.4599 )
									ret := 0.285714
								if( smoothK_k > 91.4599 )
									ret := 0.710938 // buy
							if( smoothK_k > 94.3774 )
								if( d_k <= -17.4452 )
									ret := -0.094340
								if( d_k > -17.4452 )
									ret := 0.579310
						if( d_k > -13.966 )
							if( d <= 82.4661 )
								if( d_k <= -7.9837 )
									ret := 0.355263
								if( d_k > -7.9837 )
									ret := 0.727273 // buy
							if( d > 82.4661 )
								if( d <= 84.5202 )
									ret := -0.076923
								if( d > 84.5202 )
									ret := 0.297681
			if( rsi1 > 64.3778 )
				if( rsi1 <= 75.6113 )
					if( d_k <= 8.04548 )
						if( smoothD_d <= 71.922 )
							if( rsi1 <= 69.8802 )
								if( smoothD_d <= 59.4374 )
									ret := 0.523214
								if( smoothD_d > 59.4374 )
									ret := 0.211029
							if( rsi1 > 69.8802 )
								if( k <= 67.0384 )
									ret := -0.392000
								if( k > 67.0384 )
									ret := 0.184241
						if( smoothD_d > 71.922 )
							if( d_k <= -15.2236 )
								if( k <= 91.8579 )
									ret := 0.931034 // buy
								if( k > 91.8579 )
									ret := 0.613139
							if( d_k > -15.2236 )
								if( smoothK_k <= 68.5316 )
									ret := 0.000000
								if( smoothK_k > 68.5316 )
									ret := 0.356346
					if( d_k > 8.04548 )
						if( smoothK_k <= 78.4547 )
							if( smoothK_k <= 77.7911 )
								if( k <= 74.8174 )
									ret := 0.387218
								if( k > 74.8174 )
									ret := 0.571429
							if( smoothK_k > 77.7911 )
								ret := -0.076923
						if( smoothK_k > 78.4547 )
							if( rsi1 <= 65.9864 )
								ret := 0.500000
							if( rsi1 > 65.9864 )
								if( rsi1 <= 74.6872 )
									ret := 0.798165 // buy
								if( rsi1 > 74.6872 )
									ret := 0.942857 // buy
				if( rsi1 > 75.6113 )
					if( d <= 98.8867 )
						if( smoothD_d <= 95.6658 )
							if( d_k <= -6.27241 )
								if( k <= 67.6755 )
									ret := -0.451613
								if( k > 67.6755 )
									ret := 0.668439
							if( d_k > -6.27241 )
								if( smoothD_d <= 92.451 )
									ret := 0.370814
								if( smoothD_d > 92.451 )
									ret := 0.535433
						if( smoothD_d > 95.6658 )
							if( d_k <= -0.671774 )
								if( k <= 99.9951 )
									ret := -0.894737 // sell
								if( k > 99.9951 )
									ret := -0.360000
							if( d_k > -0.671774 )
								if( k <= 96.7566 )
									ret := 0.833333 // buy
								if( k > 96.7566 )
									ret := 0.250000
					if( d > 98.8867 )
						if( smoothD_d <= 95.9715 )
							if( rsi1 <= 85.1662 )
								if( smoothD_d <= 95.943 )
									ret := 0.454545
								if( smoothD_d > 95.943 )
									ret := 0.769231 // buy
							if( rsi1 > 85.1662 )
								ret := 1.000000 // buy
						if( smoothD_d > 95.9715 )
							if( d_k <= 1.64623 )
								if( rsi1 <= 84.3594 )
									ret := 0.486009
								if( rsi1 > 84.3594 )
									ret := 0.672700
							if( d_k > 1.64623 )
								ret := -0.583333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_BNBUSDT_15Min_8a3aa3a0(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


