//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: TRXUSDT_30Min_1S00_48ac94dd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1S00_48ac94dd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_48ac94dd(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 52.0516 )
		if( d_k <= -3.67267 )
			if( d_k <= -11.8001 )
				if( k <= 27.4502 )
					if( k <= 26.1397 )
						if( smoothD_d <= 9.79435 )
							if( k <= 23.4989 )
								if( smoothK_k <= 18.4791 )
									ret := 0.266667
								if( smoothK_k > 18.4791 )
									ret := -0.235294
							if( k > 23.4989 )
								if( d_k <= -12.6821 )
									ret := 0.428571
								if( d_k > -12.6821 )
									ret := -0.500000
						if( smoothD_d > 9.79435 )
							ret := 0.833333 // buy
					if( k > 26.1397 )
						if( rsi1 <= 41.3093 )
							if( smoothK_k <= 23.9175 )
								if( k <= 26.6483 )
									ret := -0.916667 // sell
								if( k > 26.6483 )
									ret := -1.000000 // sell
							if( smoothK_k > 23.9175 )
								if( smoothK_k <= 24.1667 )
									ret := -0.181818
								if( smoothK_k > 24.1667 )
									ret := -0.545455
						if( rsi1 > 41.3093 )
							if( smoothD_d <= 10.1217 )
								ret := 0.866667 // buy
							if( smoothD_d > 10.1217 )
								ret := -0.611111
				if( k > 27.4502 )
					if( smoothD_d <= 84.1497 )
						if( k <= 99.7135 )
							if( smoothD_d <= 11.7164 )
								if( d_k <= -16.1806 )
									ret := -0.492063
								if( d_k > -16.1806 )
									ret := 0.564103
							if( smoothD_d > 11.7164 )
								if( k <= 53.5073 )
									ret := 0.396602
								if( k > 53.5073 )
									ret := 0.289325
						if( k > 99.7135 )
							if( rsi1 <= 35.4802 )
								if( smoothD_d <= 77.2803 )
									ret := 0.411765
								if( smoothD_d > 77.2803 )
									ret := -0.636364
							if( rsi1 > 35.4802 )
								if( smoothD_d <= 72.949 )
									ret := 0.076923
								if( smoothD_d > 72.949 )
									ret := 0.828947 // buy
					if( smoothD_d > 84.1497 )
						ret := -0.722222 // sell
			if( d_k > -11.8001 )
				if( rsi1 <= 33.9541 )
					if( k <= 11.4518 )
						if( d_k <= -5.25073 )
							if( d_k <= -5.92784 )
								if( k <= 11.1752 )
									ret := -0.216216
								if( k > 11.1752 )
									ret := -0.777778 // sell
							if( d_k > -5.92784 )
								if( rsi1 <= 33.6534 )
									ret := -0.671233
								if( rsi1 > 33.6534 )
									ret := -1.000000 // sell
						if( d_k > -5.25073 )
							if( d <= 5.03268 )
								if( rsi1 <= 20.5563 )
									ret := -0.824742 // sell
								if( rsi1 > 20.5563 )
									ret := -0.175325
							if( d > 5.03268 )
								if( rsi1 <= 23.9309 )
									ret := -0.537037
								if( rsi1 > 23.9309 )
									ret := 0.212766
					if( k > 11.4518 )
						if( rsi1 <= 23.4002 )
							if( smoothK_k <= 68.2476 )
								if( smoothK_k <= 28.3577 )
									ret := -0.434690
								if( smoothK_k > 28.3577 )
									ret := -0.691489
							if( smoothK_k > 68.2476 )
								ret := 0.285714
						if( rsi1 > 23.4002 )
							if( d_k <= -6.88121 )
								if( smoothK_k <= 13.102 )
									ret := -0.600000
								if( smoothK_k > 13.102 )
									ret := -0.135942
							if( d_k > -6.88121 )
								if( k <= 26.7058 )
									ret := 0.147425
								if( k > 26.7058 )
									ret := -0.114865
				if( rsi1 > 33.9541 )
					if( rsi1 <= 37.9996 )
						if( smoothD_d <= -0.151912 )
							if( smoothD_d <= -0.635709 )
								ret := 0.411765
							if( smoothD_d > -0.635709 )
								ret := 0.900000 // buy
						if( smoothD_d > -0.151912 )
							if( d <= 5.83768 )
								if( d <= 5.31424 )
									ret := -0.243243
								if( d > 5.31424 )
									ret := -0.733333 // sell
							if( d > 5.83768 )
								if( d_k <= -5.34337 )
									ret := 0.149727
								if( d_k > -5.34337 )
									ret := -0.111913
					if( rsi1 > 37.9996 )
						if( d <= 6.71776 )
							if( rsi1 <= 47.2936 )
								if( rsi1 <= 47.1135 )
									ret := -0.043373
								if( rsi1 > 47.1135 )
									ret := 0.880000 // buy
							if( rsi1 > 47.2936 )
								if( smoothD_d <= -0.24239 )
									ret := -0.742857 // sell
								if( smoothD_d > -0.24239 )
									ret := -0.191358
						if( d > 6.71776 )
							if( d_k <= -11.762 )
								if( smoothD_d <= 14.2182 )
									ret := -0.875000 // sell
								if( smoothD_d > 14.2182 )
									ret := 0.000000
							if( d_k > -11.762 )
								if( d <= 92.9915 )
									ret := 0.238341
								if( d > 92.9915 )
									ret := 0.621849
		if( d_k > -3.67267 )
			if( rsi1 <= 31.3098 )
				if( smoothK_k <= -2.74818 )
					if( d_k <= 0.068129 )
						if( smoothK_k <= -2.99991 )
							if( smoothD_d <= -2.95703 )
								if( d <= 0.02766 )
									ret := -0.821483 // sell
								if( d > 0.02766 )
									ret := -0.444444
							if( smoothD_d > -2.95703 )
								ret := -1.000000 // sell
						if( smoothK_k > -2.99991 )
							if( k <= 0.088289 )
								ret := -1.000000 // sell
							if( k > 0.088289 )
								if( smoothK_k <= -2.86411 )
									ret := -0.666667
								if( smoothK_k > -2.86411 )
									ret := -0.904762 // sell
					if( d_k > 0.068129 )
						if( d_k <= 0.087953 )
							ret := 0.545455
						if( d_k > 0.087953 )
							if( d_k <= 9.16998 )
								if( smoothD_d <= 1.60801 )
									ret := -0.682540
								if( smoothD_d > 1.60801 )
									ret := -0.893333 // sell
							if( d_k > 9.16998 )
								if( d <= 18.9581 )
									ret := -0.510460
								if( d > 18.9581 )
									ret := -0.870968 // sell
				if( smoothK_k > -2.74818 )
					if( smoothK_k <= 1.53309 )
						if( rsi1 <= 20.5809 )
							if( d <= 0.686527 )
								if( rsi1 <= 18.4602 )
									ret := -0.901554 // sell
								if( rsi1 > 18.4602 )
									ret := -0.526316
							if( d > 0.686527 )
								if( d <= 0.848618 )
									ret := -0.220000
								if( d > 0.848618 )
									ret := -0.710891 // sell
						if( rsi1 > 20.5809 )
							if( d <= 0.179672 )
								ret := 0.736842 // buy
							if( d > 0.179672 )
								if( smoothK_k <= -1.3873 )
									ret := -0.429429
								if( smoothK_k > -1.3873 )
									ret := -0.610169
					if( smoothK_k > 1.53309 )
						if( d <= 8.56273 )
							if( smoothD_d <= -0.143036 )
								if( rsi1 <= 21.7293 )
									ret := -0.444444
								if( rsi1 > 21.7293 )
									ret := -0.793814 // sell
							if( smoothD_d > -0.143036 )
								if( smoothD_d <= 2.36831 )
									ret := -0.226277
								if( smoothD_d > 2.36831 )
									ret := -0.414089
						if( d > 8.56273 )
							if( d_k <= 2.73017 )
								if( smoothD_d <= 6.51476 )
									ret := -0.691892
								if( smoothD_d > 6.51476 )
									ret := -0.371728
							if( d_k > 2.73017 )
								if( d_k <= 8.82019 )
									ret := -0.590869
								if( d_k > 8.82019 )
									ret := -0.705743 // sell
			if( rsi1 > 31.3098 )
				if( smoothK_k <= 94.3499 )
					if( smoothD_d <= 87.7365 )
						if( d <= 18.5543 )
							if( smoothK_k <= -0.956823 )
								if( smoothD_d <= 0.789946 )
									ret := -0.293737
								if( smoothD_d > 0.789946 )
									ret := -0.498534
							if( smoothK_k > -0.956823 )
								if( rsi1 <= 39.6521 )
									ret := -0.301044
								if( rsi1 > 39.6521 )
									ret := -0.117882
						if( d > 18.5543 )
							if( d_k <= 3.55074 )
								if( smoothD_d <= 74.3151 )
									ret := -0.073701
								if( smoothD_d > 74.3151 )
									ret := -0.311218
							if( d_k > 3.55074 )
								if( k <= 9.24634 )
									ret := -0.652643
								if( k > 9.24634 )
									ret := -0.420160
					if( smoothD_d > 87.7365 )
						if( d_k <= 4.54904 )
							if( smoothD_d <= 94.9494 )
								if( k <= 88.7405 )
									ret := 0.514286
								if( k > 88.7405 )
									ret := -0.054726
							if( smoothD_d > 94.9494 )
								if( d_k <= 2.50544 )
									ret := -0.655172
								if( d_k > 2.50544 )
									ret := -0.266667
						if( d_k > 4.54904 )
							if( rsi1 <= 42.902 )
								if( d <= 93.2385 )
									ret := -0.333333
								if( d > 93.2385 )
									ret := -0.774648 // sell
							if( rsi1 > 42.902 )
								if( rsi1 <= 47.3005 )
									ret := 0.104762
								if( rsi1 > 47.3005 )
									ret := -0.295858
				if( smoothK_k > 94.3499 )
					if( k <= 99.0638 )
						if( d_k <= 0.32814 )
							if( smoothD_d <= 91.9486 )
								ret := -0.714286 // sell
							if( smoothD_d > 91.9486 )
								if( d <= 96.2233 )
									ret := 0.850000 // buy
								if( d > 96.2233 )
									ret := 0.413043
						if( d_k > 0.32814 )
							if( smoothK_k <= 95.4619 )
								if( smoothD_d <= 95.402 )
									ret := 0.692308
								if( smoothD_d > 95.402 )
									ret := 0.967742 // buy
							if( smoothK_k > 95.4619 )
								ret := 0.700000 // buy
					if( k > 99.0638 )
						if( smoothD_d <= 95.0699 )
							if( d_k <= -3.23066 )
								ret := 0.235294
							if( d_k > -3.23066 )
								if( rsi1 <= 48.5463 )
									ret := 0.785714 // buy
								if( rsi1 > 48.5463 )
									ret := 0.333333
						if( smoothD_d > 95.0699 )
							if( smoothK_k <= 96.8288 )
								if( smoothD_d <= 96.5012 )
									ret := 0.000000
								if( smoothD_d > 96.5012 )
									ret := 0.724138 // buy
							if( smoothK_k > 96.8288 )
								if( smoothK_k <= 96.9999 )
									ret := -0.882353 // sell
								if( smoothK_k > 96.9999 )
									ret := 0.129412
	if( rsi1 > 52.0516 )
		if( smoothK_k <= 82.1909 )
			if( smoothD_d <= 67.3255 )
				if( smoothK_k <= 49.8342 )
					if( d_k <= 8.59156 )
						if( d_k <= -2.03844 )
							if( smoothD_d <= -1.0561 )
								if( k <= 5.04298 )
									ret := -0.750000 // sell
								if( k > 5.04298 )
									ret := 0.222222
							if( smoothD_d > -1.0561 )
								if( smoothD_d <= 11.2353 )
									ret := 0.469901
								if( smoothD_d > 11.2353 )
									ret := 0.382794
						if( d_k > -2.03844 )
							if( smoothD_d <= 1.46163 )
								if( smoothD_d <= -1.64793 )
									ret := -0.434555
								if( smoothD_d > -1.64793 )
									ret := -0.156740
							if( smoothD_d > 1.46163 )
								if( rsi1 <= 68.5848 )
									ret := 0.125359
								if( rsi1 > 68.5848 )
									ret := 0.457778
					if( d_k > 8.59156 )
						if( d_k <= 14.2155 )
							if( rsi1 <= 63.5285 )
								if( k <= 47.7559 )
									ret := -0.104816
								if( k > 47.7559 )
									ret := -0.583710
							if( rsi1 > 63.5285 )
								if( smoothD_d <= 37.5522 )
									ret := 0.079070
								if( smoothD_d > 37.5522 )
									ret := 0.323232
						if( d_k > 14.2155 )
							if( rsi1 <= 66.3947 )
								if( d <= 30.2865 )
									ret := -0.500000
								if( d > 30.2865 )
									ret := -0.311458
							if( rsi1 > 66.3947 )
								if( smoothD_d <= 63.9725 )
									ret := -0.086747
								if( smoothD_d > 63.9725 )
									ret := -0.555556
				if( smoothK_k > 49.8342 )
					if( rsi1 <= 67.9807 )
						if( d_k <= 0.228505 )
							if( smoothD_d <= 51.6972 )
								if( d <= 43.017 )
									ret := 0.644345
								if( d > 43.017 )
									ret := 0.497547
							if( smoothD_d > 51.6972 )
								if( rsi1 <= 56.1247 )
									ret := 0.125245
								if( rsi1 > 56.1247 )
									ret := 0.404719
						if( d_k > 0.228505 )
							if( smoothD_d <= 54.5206 )
								if( rsi1 <= 63.9886 )
									ret := 0.509804
								if( rsi1 > 63.9886 )
									ret := 1.000000 // buy
							if( smoothD_d > 54.5206 )
								if( k <= 65.4194 )
									ret := -0.140387
								if( k > 65.4194 )
									ret := 0.305344
					if( rsi1 > 67.9807 )
						if( d_k <= 12.6753 )
							if( k <= 84.1231 )
								if( smoothK_k <= 65.6262 )
									ret := 0.541919
								if( smoothK_k > 65.6262 )
									ret := 0.684755
							if( k > 84.1231 )
								if( d <= 66.236 )
									ret := 0.148148
								if( d > 66.236 )
									ret := -0.444444
						if( d_k > 12.6753 )
							if( smoothD_d <= 65.0378 )
								ret := -0.600000
							if( smoothD_d > 65.0378 )
								ret := -1.000000 // sell
			if( smoothD_d > 67.3255 )
				if( d_k <= 4.08005 )
					if( d_k <= -4.01795 )
						if( k <= 83.7836 )
							if( rsi1 <= 81.6894 )
								if( d <= 74.276 )
									ret := 0.408497
								if( d > 74.276 )
									ret := 0.652174
							if( rsi1 > 81.6894 )
								ret := -0.166667
						if( k > 83.7836 )
							if( d <= 78.7756 )
								if( d <= 71.5464 )
									ret := 0.928571 // buy
								if( d > 71.5464 )
									ret := -0.066667
							if( d > 78.7756 )
								if( rsi1 <= 68.8652 )
									ret := 0.678571
								if( rsi1 > 68.8652 )
									ret := 0.461538
					if( d_k > -4.01795 )
						if( smoothK_k <= 71.1189 )
							if( rsi1 <= 59.1037 )
								if( d <= 72.0288 )
									ret := 0.576923
								if( d > 72.0288 )
									ret := 0.157895
							if( rsi1 > 59.1037 )
								if( d <= 73.8701 )
									ret := -0.096386
								if( d > 73.8701 )
									ret := 0.109244
						if( smoothK_k > 71.1189 )
							if( rsi1 <= 70.1698 )
								if( rsi1 <= 55.5416 )
									ret := 0.347418
								if( rsi1 > 55.5416 )
									ret := 0.128781
							if( rsi1 > 70.1698 )
								if( d_k <= 2.00301 )
									ret := 0.472772
								if( d_k > 2.00301 )
									ret := 0.068182
				if( d_k > 4.08005 )
					if( smoothK_k <= 63.0918 )
						if( d <= 76.1376 )
							if( k <= 48.7226 )
								if( d <= 71.7001 )
									ret := -0.883721 // sell
								if( d > 71.7001 )
									ret := -0.517241
							if( k > 48.7226 )
								if( smoothD_d <= 71.2309 )
									ret := -0.305512
								if( smoothD_d > 71.2309 )
									ret := -0.501493
						if( d > 76.1376 )
							if( smoothD_d <= 73.3668 )
								if( d_k <= 12.0958 )
									ret := -0.363636
								if( d_k > 12.0958 )
									ret := 0.782609 // buy
							if( smoothD_d > 73.3668 )
								if( d_k <= 13.9063 )
									ret := -0.544554
								if( d_k > 13.9063 )
									ret := -0.163158
					if( smoothK_k > 63.0918 )
						if( d <= 76.9345 )
							if( k <= 70.9789 )
								if( smoothD_d <= 68.2643 )
									ret := 0.850000 // buy
								if( smoothD_d > 68.2643 )
									ret := -0.004065
							if( k > 70.9789 )
								if( rsi1 <= 63.2256 )
									ret := 0.739130 // buy
								if( rsi1 > 63.2256 )
									ret := 0.454545
						if( d > 76.9345 )
							if( smoothD_d <= 88.4962 )
								if( smoothK_k <= 68.3439 )
									ret := -0.287009
								if( smoothK_k > 68.3439 )
									ret := -0.119403
							if( smoothD_d > 88.4962 )
								if( d_k <= 12.1147 )
									ret := 0.069959
								if( d_k > 12.1147 )
									ret := 0.647059
		if( smoothK_k > 82.1909 )
			if( rsi1 <= 72.2615 )
				if( d_k <= -2.73873 )
					if( rsi1 <= 68.2683 )
						if( smoothD_d <= 81.6205 )
							if( d_k <= -5.26272 )
								if( k <= 95.9448 )
									ret := 0.457769
								if( k > 95.9448 )
									ret := 0.719101 // buy
							if( d_k > -5.26272 )
								if( d <= 83.8572 )
									ret := 0.233766
								if( d > 83.8572 )
									ret := -0.195652
						if( smoothD_d > 81.6205 )
							if( k <= 93.7996 )
								if( smoothD_d <= 84.9767 )
									ret := -0.054054
								if( smoothD_d > 84.9767 )
									ret := 0.393939
							if( k > 93.7996 )
								if( d <= 84.7586 )
									ret := -0.222222
								if( d > 84.7586 )
									ret := 0.425631
					if( rsi1 > 68.2683 )
						if( k <= 95.9083 )
							if( k <= 85.8666 )
								if( rsi1 <= 69.6052 )
									ret := 0.769231 // buy
								if( rsi1 > 69.6052 )
									ret := -0.285714
							if( k > 85.8666 )
								if( smoothK_k <= 92.5704 )
									ret := 0.702614 // buy
								if( smoothK_k > 92.5704 )
									ret := 0.950000 // buy
						if( k > 95.9083 )
							if( smoothK_k <= 93.1221 )
								ret := -0.333333
							if( smoothK_k > 93.1221 )
								if( k <= 99.8018 )
									ret := 0.462121
								if( k > 99.8018 )
									ret := 0.631579
				if( d_k > -2.73873 )
					if( smoothD_d <= 95.6076 )
						if( d_k <= 3.5763 )
							if( k <= 86.7762 )
								if( d <= 87.8445 )
									ret := 0.665138
								if( d > 87.8445 )
									ret := 0.384615
							if( k > 86.7762 )
								if( rsi1 <= 60.573 )
									ret := -0.044464
								if( rsi1 > 60.573 )
									ret := 0.328232
						if( d_k > 3.5763 )
							if( rsi1 <= 69.7335 )
								if( d <= 97.1449 )
									ret := 0.038961
								if( d > 97.1449 )
									ret := 0.552083
							if( rsi1 > 69.7335 )
								if( smoothK_k <= 83.7697 )
									ret := -0.676471
								if( smoothK_k > 83.7697 )
									ret := -0.007634
					if( smoothD_d > 95.6076 )
						if( smoothK_k <= 96.7387 )
							if( rsi1 <= 55.8521 )
								if( rsi1 <= 54.1565 )
									ret := 0.357143
								if( rsi1 > 54.1565 )
									ret := -0.242424
							if( rsi1 > 55.8521 )
								if( d_k <= -0.160619 )
									ret := 0.029412
								if( d_k > -0.160619 )
									ret := 0.434650
						if( smoothK_k > 96.7387 )
							if( rsi1 <= 55.7351 )
								if( d_k <= -0.082578 )
									ret := -0.380952
								if( d_k > -0.082578 )
									ret := 0.619048
							if( rsi1 > 55.7351 )
								if( d <= 99.9967 )
									ret := 0.696721
								if( d > 99.9967 )
									ret := 0.489362
			if( rsi1 > 72.2615 )
				if( rsi1 <= 83.3369 )
					if( d_k <= 0.876289 )
						if( smoothK_k <= 82.391 )
							ret := -0.444444
						if( smoothK_k > 82.391 )
							if( smoothD_d <= 95.4001 )
								if( k <= 98.0336 )
									ret := 0.530602
								if( k > 98.0336 )
									ret := 0.671212
							if( smoothD_d > 95.4001 )
								if( smoothD_d <= 96.5325 )
									ret := 0.223881
								if( smoothD_d > 96.5325 )
									ret := 0.666667
					if( d_k > 0.876289 )
						if( k <= 89.3726 )
							if( smoothK_k <= 83.8484 )
								if( smoothD_d <= 89.8842 )
									ret := 0.449541
								if( smoothD_d > 89.8842 )
									ret := 0.924528 // buy
							if( smoothK_k > 83.8484 )
								if( rsi1 <= 77.7071 )
									ret := 0.159763
								if( rsi1 > 77.7071 )
									ret := -0.471154
						if( k > 89.3726 )
							if( rsi1 <= 72.6557 )
								if( d <= 97.3555 )
									ret := 0.473684
								if( d > 97.3555 )
									ret := -0.117647
							if( rsi1 > 72.6557 )
								if( d <= 92.8946 )
									ret := 0.750000 // buy
								if( d > 92.8946 )
									ret := 0.448276
				if( rsi1 > 83.3369 )
					if( d <= 99.9693 )
						if( smoothK_k <= 96.7508 )
							if( d_k <= 1.72966 )
								if( smoothK_k <= 89.9394 )
									ret := 0.805687 // buy
								if( smoothK_k > 89.9394 )
									ret := 0.641855
							if( d_k > 1.72966 )
								if( d_k <= 1.82097 )
									ret := -0.076923
								if( d_k > 1.82097 )
									ret := 0.530435
						if( smoothK_k > 96.7508 )
							if( rsi1 <= 88.9595 )
								if( d_k <= -0.010962 )
									ret := 0.936639 // buy
								if( d_k > -0.010962 )
									ret := 0.666667
							if( rsi1 > 88.9595 )
								if( d <= 99.424 )
									ret := 0.774725 // buy
								if( d > 99.424 )
									ret := 0.622642
					if( d > 99.9693 )
						if( smoothD_d <= 96.9789 )
							ret := 1.000000 // buy
						if( smoothD_d > 96.9789 )
							if( k <= 99.9848 )
								ret := 0.750000 // buy
							if( k > 99.9848 )
								if( rsi1 <= 84.2632 )
									ret := 0.222222
								if( rsi1 > 84.2632 )
									ret := 0.882353 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TRXUSDT_30Min_48ac94dd(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


