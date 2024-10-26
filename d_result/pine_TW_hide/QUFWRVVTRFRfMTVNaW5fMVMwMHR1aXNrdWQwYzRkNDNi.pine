//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AAVEUSDT_15Min_1S00_d0c4d43b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_1S00_d0c4d43b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_d0c4d43b(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 54.2667 )
		if( k <= 28.4087 )
			if( rsi1 <= 34.8766 )
				if( smoothD_d <= 0.231988 )
					if( rsi1 <= 33.9005 )
						if( d <= 0.215874 )
							if( smoothD_d <= -2.79526 )
								if( smoothD_d <= -2.80868 )
									ret := -0.482612
								if( smoothD_d > -2.80868 )
									ret := -0.857143 // sell
							if( smoothD_d > -2.79526 )
								ret := 0.538462
						if( d > 0.215874 )
							if( rsi1 <= 23.8445 )
								if( d_k <= -3.29293 )
									ret := -0.457944
								if( d_k > -3.29293 )
									ret := -0.676679
							if( rsi1 > 23.8445 )
								if( smoothD_d <= -1.47325 )
									ret := -0.573383
								if( smoothD_d > -1.47325 )
									ret := -0.464750
					if( rsi1 > 33.9005 )
						if( k <= 3.08508 )
							if( smoothD_d <= -2.33543 )
								if( rsi1 <= 34.4813 )
									ret := -0.925926 // sell
								if( rsi1 > 34.4813 )
									ret := -0.666667
							if( smoothD_d > -2.33543 )
								if( smoothD_d <= -1.14271 )
									ret := 0.741935 // buy
								if( smoothD_d > -1.14271 )
									ret := 0.317073
						if( k > 3.08508 )
							if( k <= 4.24243 )
								if( rsi1 <= 34.6441 )
									ret := -0.750000 // sell
								if( rsi1 > 34.6441 )
									ret := -1.000000 // sell
							if( k > 4.24243 )
								if( rsi1 <= 34.4242 )
									ret := -0.500000
								if( rsi1 > 34.4242 )
									ret := -1.000000 // sell
				if( smoothD_d > 0.231988 )
					if( d <= 10.8513 )
						if( d_k <= -4.48037 )
							if( k <= 14.8092 )
								if( d <= 6.7846 )
									ret := -0.580122
								if( d > 6.7846 )
									ret := -0.803030 // sell
							if( k > 14.8092 )
								if( smoothK_k <= 12.8305 )
									ret := 0.263889
								if( smoothK_k > 12.8305 )
									ret := -0.539326
						if( d_k > -4.48037 )
							if( smoothD_d <= 1.01764 )
								if( rsi1 <= 23.6571 )
									ret := -0.493548
								if( rsi1 > 23.6571 )
									ret := -0.145336
							if( smoothD_d > 1.01764 )
								if( rsi1 <= 32.0469 )
									ret := -0.375468
								if( rsi1 > 32.0469 )
									ret := -0.542312
					if( d > 10.8513 )
						if( k <= 2.9082 )
							if( rsi1 <= 13.0795 )
								ret := 0.800000 // buy
							if( rsi1 > 13.0795 )
								if( smoothK_k <= -2.95196 )
									ret := -0.370229
								if( smoothK_k > -2.95196 )
									ret := -0.636628
						if( k > 2.9082 )
							if( d_k <= -6.34194 )
								if( smoothD_d <= 11.4291 )
									ret := -0.357143
								if( smoothD_d > 11.4291 )
									ret := -0.652422
							if( d_k > -6.34194 )
								if( d_k <= 9.26856 )
									ret := -0.231859
								if( d_k > 9.26856 )
									ret := -0.405677
			if( rsi1 > 34.8766 )
				if( smoothD_d <= 1.353 )
					if( d_k <= 4.0019 )
						if( d <= 1.35191 )
							if( k <= 3.25141 )
								if( d_k <= -1.37827 )
									ret := 0.048387
								if( d_k > -1.37827 )
									ret := -0.488981
							if( k > 3.25141 )
								if( d_k <= -2.27585 )
									ret := -0.782609 // sell
								if( d_k > -2.27585 )
									ret := -1.000000 // sell
						if( d > 1.35191 )
							if( smoothK_k <= 3.80823 )
								if( d <= 3.61177 )
									ret := -0.355060
								if( d > 3.61177 )
									ret := -0.180645
							if( smoothK_k > 3.80823 )
								if( rsi1 <= 44.0939 )
									ret := -0.548387
								if( rsi1 > 44.0939 )
									ret := -0.361963
					if( d_k > 4.0019 )
						if( rsi1 <= 42.297 )
							if( rsi1 <= 37.0256 )
								ret := -1.000000 // sell
							if( rsi1 > 37.0256 )
								ret := -0.823529 // sell
						if( rsi1 > 42.297 )
							ret := -0.363636
				if( smoothD_d > 1.353 )
					if( smoothK_k <= 12.5533 )
						if( d_k <= 7.13045 )
							if( d_k <= -3.41383 )
								if( smoothK_k <= 6.02594 )
									ret := -0.844444 // sell
								if( smoothK_k > 6.02594 )
									ret := -0.289788
							if( d_k > -3.41383 )
								if( rsi1 <= 42.4505 )
									ret := -0.227252
								if( rsi1 > 42.4505 )
									ret := -0.094270
						if( d_k > 7.13045 )
							if( d <= 33.0122 )
								if( k <= 9.36188 )
									ret := -0.259228
								if( k > 9.36188 )
									ret := -0.335700
							if( d > 33.0122 )
								if( d <= 34.3108 )
									ret := -0.724138 // sell
								if( d > 34.3108 )
									ret := -0.356000
					if( smoothK_k > 12.5533 )
						if( smoothD_d <= 22.0022 )
							if( smoothD_d <= 21.0722 )
								if( smoothK_k <= 24.0908 )
									ret := -0.099608
								if( smoothK_k > 24.0908 )
									ret := -0.333333
							if( smoothD_d > 21.0722 )
								if( smoothK_k <= 23.5234 )
									ret := 0.380682
								if( smoothK_k > 23.5234 )
									ret := -0.250000
						if( smoothD_d > 22.0022 )
							if( smoothK_k <= 24.63 )
								if( rsi1 <= 50.9008 )
									ret := -0.254335
								if( rsi1 > 50.9008 )
									ret := -0.095116
							if( smoothK_k > 24.63 )
								if( d <= 53.6143 )
									ret := -0.061224
								if( d > 53.6143 )
									ret := 0.615385
		if( k > 28.4087 )
			if( k <= 68.3171 )
				if( rsi1 <= 38.2633 )
					if( smoothD_d <= 50.4597 )
						if( rsi1 <= 16.6148 )
							if( smoothK_k <= 34.1261 )
								if( smoothK_k <= 28.6355 )
									ret := -0.454545
								if( smoothK_k > 28.6355 )
									ret := -0.837838 // sell
							if( smoothK_k > 34.1261 )
								ret := -0.384615
						if( rsi1 > 16.6148 )
							if( smoothD_d <= 47.6373 )
								if( d_k <= 5.4493 )
									ret := -0.144375
								if( d_k > 5.4493 )
									ret := -0.376364
							if( smoothD_d > 47.6373 )
								if( rsi1 <= 29.6562 )
									ret := 0.456522
								if( rsi1 > 29.6562 )
									ret := -0.080508
					if( smoothD_d > 50.4597 )
						if( smoothK_k <= 64.6202 )
							if( k <= 35.7139 )
								if( smoothK_k <= 31.5975 )
									ret := -0.526316
								if( smoothK_k > 31.5975 )
									ret := -0.937500 // sell
							if( k > 35.7139 )
								if( smoothD_d <= 71.8591 )
									ret := -0.255814
								if( smoothD_d > 71.8591 )
									ret := -0.425000
						if( smoothK_k > 64.6202 )
							if( d <= 79.4727 )
								if( smoothD_d <= 71.9633 )
									ret := -0.882353 // sell
								if( smoothD_d > 71.9633 )
									ret := -1.000000 // sell
							if( d > 79.4727 )
								ret := -0.866667 // sell
				if( rsi1 > 38.2633 )
					if( smoothD_d <= 43.8439 )
						if( k <= 51.221 )
							if( rsi1 <= 48.6624 )
								if( smoothD_d <= 21.3022 )
									ret := 0.018702
								if( smoothD_d > 21.3022 )
									ret := -0.109663
							if( rsi1 > 48.6624 )
								if( smoothK_k <= 42.0922 )
									ret := -0.013221
								if( smoothK_k > 42.0922 )
									ret := 0.295400
						if( k > 51.221 )
							if( k <= 52.3244 )
								if( d <= 45.5732 )
									ret := 0.477124
								if( d > 45.5732 )
									ret := 0.956522 // buy
							if( k > 52.3244 )
								if( smoothD_d <= 31.7886 )
									ret := -0.147982
								if( smoothD_d > 31.7886 )
									ret := 0.215724
					if( smoothD_d > 43.8439 )
						if( d_k <= 1.87523 )
							if( d <= 62.8311 )
								if( smoothD_d <= 44.3692 )
									ret := -0.205357
								if( smoothD_d > 44.3692 )
									ret := 0.069792
							if( d > 62.8311 )
								if( d <= 65.3942 )
									ret := -0.340164
								if( d > 65.3942 )
									ret := 0.235849
						if( d_k > 1.87523 )
							if( k <= 67.2455 )
								if( smoothD_d <= 80.7617 )
									ret := -0.148644
								if( smoothD_d > 80.7617 )
									ret := 0.647059
							if( k > 67.2455 )
								if( smoothK_k <= 64.7636 )
									ret := 0.115789
								if( smoothK_k > 64.7636 )
									ret := 0.338028
			if( k > 68.3171 )
				if( rsi1 <= 25.4535 )
					if( d_k <= -16.6291 )
						if( smoothK_k <= 76.1274 )
							if( d_k <= -19.6875 )
								ret := -1.000000 // sell
							if( d_k > -19.6875 )
								ret := -0.923077 // sell
						if( smoothK_k > 76.1274 )
							ret := -0.363636
					if( d_k > -16.6291 )
						if( k <= 88.1123 )
							if( rsi1 <= 23.1076 )
								if( smoothD_d <= 75.3399 )
									ret := 0.432432
								if( smoothD_d > 75.3399 )
									ret := 0.000000
							if( rsi1 > 23.1076 )
								if( rsi1 <= 24.7186 )
									ret := -0.625000
								if( rsi1 > 24.7186 )
									ret := -0.214286
						if( k > 88.1123 )
							if( d <= 85.6409 )
								ret := 0.100000
							if( d > 85.6409 )
								if( d <= 89.1379 )
									ret := -0.846154 // sell
								if( d > 89.1379 )
									ret := -0.576923
				if( rsi1 > 25.4535 )
					if( d <= 94.3909 )
						if( rsi1 <= 47.6682 )
							if( d_k <= -12.6982 )
								if( smoothD_d <= 49.2227 )
									ret := -0.136201
								if( smoothD_d > 49.2227 )
									ret := 0.223514
							if( d_k > -12.6982 )
								if( smoothD_d <= 85.6562 )
									ret := -0.019796
								if( smoothD_d > 85.6562 )
									ret := 0.166202
						if( rsi1 > 47.6682 )
							if( k <= 94.5705 )
								if( d <= 93.1217 )
									ret := 0.141667
								if( d > 93.1217 )
									ret := -0.354839
							if( k > 94.5705 )
								if( smoothD_d <= 88.3782 )
									ret := 0.466951
								if( smoothD_d > 88.3782 )
									ret := 0.230241
					if( d > 94.3909 )
						if( k <= 88.1226 )
							if( rsi1 <= 46.4578 )
								if( rsi1 <= 43.243 )
									ret := 0.000000
								if( rsi1 > 43.243 )
									ret := 0.416667
							if( rsi1 > 46.4578 )
								if( smoothD_d <= 91.6916 )
									ret := 0.526316
								if( smoothD_d > 91.6916 )
									ret := 0.902439 // buy
						if( k > 88.1226 )
							if( smoothK_k <= 87.2245 )
								if( smoothD_d <= 91.8405 )
									ret := 0.266667
								if( smoothD_d > 91.8405 )
									ret := -0.325000
							if( smoothK_k > 87.2245 )
								if( d <= 94.6983 )
									ret := 0.532468
								if( d > 94.6983 )
									ret := 0.223842
	if( rsi1 > 54.2667 )
		if( k <= 80.6305 )
			if( smoothK_k <= 13.5464 )
				if( smoothD_d <= 0.216745 )
					if( d_k <= -1.48792 )
						if( k <= 4.61806 )
							if( smoothD_d <= -1.31625 )
								ret := -0.437500
							if( smoothD_d > -1.31625 )
								ret := -0.818182 // sell
						if( k > 4.61806 )
							if( rsi1 <= 70.5201 )
								if( rsi1 <= 65.488 )
									ret := 0.000000
								if( rsi1 > 65.488 )
									ret := 0.714286 // buy
							if( rsi1 > 70.5201 )
								ret := -0.500000
					if( d_k > -1.48792 )
						if( d_k <= 1.72661 )
							if( d_k <= -0.217743 )
								if( rsi1 <= 60.3919 )
									ret := 0.272727
								if( rsi1 > 60.3919 )
									ret := 0.866667 // buy
							if( d_k > -0.217743 )
								if( rsi1 <= 68.1628 )
									ret := -0.075949
								if( rsi1 > 68.1628 )
									ret := 0.650000
						if( d_k > 1.72661 )
							if( d <= 2.50074 )
								ret := 0.869565 // buy
							if( d > 2.50074 )
								ret := 0.187500
				if( smoothD_d > 0.216745 )
					if( d <= 5.07697 )
						if( smoothK_k <= -0.617867 )
							if( rsi1 <= 56.645 )
								ret := -0.538462
							if( rsi1 > 56.645 )
								if( k <= 1.97355 )
									ret := 0.117647
								if( k > 1.97355 )
									ret := 0.500000
						if( smoothK_k > -0.617867 )
							if( rsi1 <= 57.9813 )
								if( k <= 8.57197 )
									ret := 0.250000
								if( k > 8.57197 )
									ret := -0.300000
							if( rsi1 > 57.9813 )
								if( smoothD_d <= 1.74248 )
									ret := -0.738739 // sell
								if( smoothD_d > 1.74248 )
									ret := -0.384615
					if( d > 5.07697 )
						if( rsi1 <= 67.0167 )
							if( smoothD_d <= 4.81318 )
								if( smoothD_d <= 3.39456 )
									ret := -0.122951
								if( smoothD_d > 3.39456 )
									ret := 0.173077
							if( smoothD_d > 4.81318 )
								if( d_k <= 18.6779 )
									ret := -0.197566
								if( d_k > 18.6779 )
									ret := -0.412037
						if( rsi1 > 67.0167 )
							if( smoothD_d <= 5.13392 )
								if( d_k <= 1.13033 )
									ret := 0.674419
								if( d_k > 1.13033 )
									ret := 0.300000
							if( smoothD_d > 5.13392 )
								if( smoothK_k <= 8.39866 )
									ret := 0.226087
								if( smoothK_k > 8.39866 )
									ret := -0.234694
			if( smoothK_k > 13.5464 )
				if( smoothK_k <= 47.1506 )
					if( k <= 16.8558 )
						if( smoothD_d <= 17.7483 )
							if( d <= 13.7633 )
								if( d_k <= -4.22243 )
									ret := 0.307692
								if( d_k > -4.22243 )
									ret := 0.846154 // buy
							if( d > 13.7633 )
								ret := -0.375000
						if( smoothD_d > 17.7483 )
							ret := 0.650000
					if( k > 16.8558 )
						if( d_k <= 11.1799 )
							if( smoothD_d <= 19.1664 )
								if( d_k <= -4.69443 )
									ret := 0.039511
								if( d_k > -4.69443 )
									ret := -0.230769
							if( smoothD_d > 19.1664 )
								if( d_k <= -11.27 )
									ret := 0.018987
								if( d_k > -11.27 )
									ret := 0.171345
						if( d_k > 11.1799 )
							if( rsi1 <= 72.6966 )
								if( d <= 70.2543 )
									ret := -0.045900
								if( d > 70.2543 )
									ret := -0.528571
							if( rsi1 > 72.6966 )
								if( d <= 60.8366 )
									ret := 0.165049
								if( d > 60.8366 )
									ret := 0.629630
				if( smoothK_k > 47.1506 )
					if( k <= 72.4928 )
						if( k <= 53.4597 )
							if( rsi1 <= 69.3287 )
								if( d_k <= -2.32652 )
									ret := 0.309973
								if( d_k > -2.32652 )
									ret := 0.070953
							if( rsi1 > 69.3287 )
								if( smoothD_d <= 53.6197 )
									ret := 0.820755 // buy
								if( smoothD_d > 53.6197 )
									ret := 0.452555
						if( k > 53.4597 )
							if( rsi1 <= 69.2708 )
								if( smoothD_d <= 43.9188 )
									ret := 0.231317
								if( smoothD_d > 43.9188 )
									ret := 0.060829
							if( rsi1 > 69.2708 )
								if( k <= 56.7797 )
									ret := 0.515789
								if( k > 56.7797 )
									ret := 0.300194
					if( k > 72.4928 )
						if( smoothD_d <= 79.5021 )
							if( d_k <= 7.60277 )
								if( k <= 77.1805 )
									ret := 0.222712
								if( k > 77.1805 )
									ret := 0.083333
							if( d_k > 7.60277 )
								if( smoothD_d <= 78.9304 )
									ret := -0.641026
								if( smoothD_d > 78.9304 )
									ret := 0.071429
						if( smoothD_d > 79.5021 )
							if( rsi1 <= 58.3387 )
								if( d <= 85.0157 )
									ret := -0.052632
								if( d > 85.0157 )
									ret := 0.274194
							if( rsi1 > 58.3387 )
								if( smoothK_k <= 74.7919 )
									ret := 0.527473
								if( smoothK_k > 74.7919 )
									ret := 0.318033
		if( k > 80.6305 )
			if( smoothD_d <= 92.8353 )
				if( d_k <= -8.80654 )
					if( rsi1 <= 62.6718 )
						if( k <= 84.3417 )
							if( smoothK_k <= 79.5039 )
								if( k <= 82.1606 )
									ret := 0.130081
								if( k > 82.1606 )
									ret := 0.806452 // buy
							if( smoothK_k > 79.5039 )
								if( smoothD_d <= 70.7245 )
									ret := 0.016807
								if( smoothD_d > 70.7245 )
									ret := -0.846154 // sell
						if( k > 84.3417 )
							if( k <= 85.9497 )
								if( d_k <= -12.8422 )
									ret := 0.494845
								if( d_k > -12.8422 )
									ret := 0.813187 // buy
							if( k > 85.9497 )
								if( k <= 91.1057 )
									ret := 0.241164
								if( k > 91.1057 )
									ret := 0.402260
					if( rsi1 > 62.6718 )
						if( k <= 83.1548 )
							if( k <= 81.0967 )
								if( rsi1 <= 66.5351 )
									ret := 0.818182 // buy
								if( rsi1 > 66.5351 )
									ret := 0.432432
							if( k > 81.0967 )
								if( smoothD_d <= 66.3075 )
									ret := 0.891026 // buy
								if( smoothD_d > 66.3075 )
									ret := 0.589744
						if( k > 83.1548 )
							if( d <= 66.7607 )
								if( d <= 63.4124 )
									ret := 0.414286
								if( d > 63.4124 )
									ret := -0.280374
							if( d > 66.7607 )
								if( rsi1 <= 71.1171 )
									ret := 0.478362
								if( rsi1 > 71.1171 )
									ret := 0.613296
				if( d_k > -8.80654 )
					if( k <= 97.1752 )
						if( rsi1 <= 74.087 )
							if( d <= 74.55 )
								if( smoothK_k <= 78.9025 )
									ret := -0.375000
								if( smoothK_k > 78.9025 )
									ret := -1.000000 // sell
							if( d > 74.55 )
								if( d_k <= 4.02259 )
									ret := 0.195443
								if( d_k > 4.02259 )
									ret := 0.333002
						if( rsi1 > 74.087 )
							if( d <= 93.5642 )
								if( smoothK_k <= 93.0027 )
									ret := 0.419296
								if( smoothK_k > 93.0027 )
									ret := 0.030769
							if( d > 93.5642 )
								if( d_k <= 4.04886 )
									ret := 0.518018
								if( d_k > 4.04886 )
									ret := 0.834906 // buy
					if( k > 97.1752 )
						if( rsi1 <= 74.0865 )
							if( smoothD_d <= 90.5247 )
								if( rsi1 <= 55.0472 )
									ret := -0.454545
								if( rsi1 > 55.0472 )
									ret := 0.497217
							if( smoothD_d > 90.5247 )
								if( smoothK_k <= 95.3374 )
									ret := 0.430000
								if( smoothK_k > 95.3374 )
									ret := 0.167849
						if( rsi1 > 74.0865 )
							if( d_k <= -4.14553 )
								if( d <= 95.1676 )
									ret := 0.624390
								if( d > 95.1676 )
									ret := 0.230769
							if( d_k > -4.14553 )
								if( smoothK_k <= 95.1358 )
									ret := 0.905660 // buy
								if( smoothK_k > 95.1358 )
									ret := 0.619048
			if( smoothD_d > 92.8353 )
				if( smoothD_d <= 96.9068 )
					if( rsi1 <= 80.8491 )
						if( smoothD_d <= 96.8956 )
							if( k <= 99.9999 )
								if( d <= 99.1357 )
									ret := 0.422574
								if( d > 99.1357 )
									ret := 0.568182
							if( k > 99.9999 )
								if( d <= 98.7972 )
									ret := 0.369565
								if( d > 98.7972 )
									ret := 0.120120
						if( smoothD_d > 96.8956 )
							ret := -0.842105 // sell
					if( rsi1 > 80.8491 )
						if( d_k <= 0.459336 )
							if( d_k <= -0.671154 )
								if( smoothD_d <= 94.4629 )
									ret := 0.871508 // buy
								if( smoothD_d > 94.4629 )
									ret := 0.679452
							if( d_k > -0.671154 )
								if( d_k <= -0.382353 )
									ret := 0.185185
								if( d_k > -0.382353 )
									ret := 0.585302
						if( d_k > 0.459336 )
							if( d_k <= 4.99062 )
								if( d <= 96.0344 )
									ret := 0.333333
								if( d > 96.0344 )
									ret := 0.846422 // buy
							if( d_k > 4.99062 )
								ret := -0.111111
				if( smoothD_d > 96.9068 )
					if( rsi1 <= 78.8208 )
						if( d <= 100 )
							if( rsi1 <= 60.9852 )
								if( d_k <= -0.064147 )
									ret := 0.181818
								if( d_k > -0.064147 )
									ret := -0.200000
							if( rsi1 > 60.9852 )
								if( smoothD_d <= 96.9696 )
									ret := 0.636364
								if( smoothD_d > 96.9696 )
									ret := 0.914894 // buy
						if( d > 100 )
							if( rsi1 <= 67.7983 )
								if( rsi1 <= 66.6695 )
									ret := 0.423729
								if( rsi1 > 66.6695 )
									ret := 0.857143 // buy
							if( rsi1 > 67.7983 )
								if( rsi1 <= 69.2206 )
									ret := -0.250000
								if( rsi1 > 69.2206 )
									ret := 0.408784
					if( rsi1 > 78.8208 )
						if( rsi1 <= 88.4624 )
							if( rsi1 <= 84.6009 )
								if( d_k <= 0.000888 )
									ret := 0.874494 // buy
								if( d_k > 0.000888 )
									ret := 1.000000 // buy
							if( rsi1 > 84.6009 )
								if( rsi1 <= 84.9066 )
									ret := -0.428571
								if( rsi1 > 84.9066 )
									ret := 0.633663
						if( rsi1 > 88.4624 )
							if( k <= 99.9836 )
								if( smoothK_k <= 96.9598 )
									ret := 0.951220 // buy
								if( smoothK_k > 96.9598 )
									ret := 0.333333
							if( k > 99.9836 )
								if( d <= 100 )
									ret := 1.000000 // buy
								if( d > 100 )
									ret := 0.916129 // buy
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_d0c4d43b(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


