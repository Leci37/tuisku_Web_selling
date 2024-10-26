//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: NIO_5Min_2BS0_685fdfbc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_2BS0_685fdfbc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_685fdfbc(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 49.8442 )
		if( d_k <= -9.41433 )
			if( d_k <= -16.9449 )
				if( bbm <= 0.031983 )
					if( smoothD_d <= 10.811 )
						if( d <= 12.8807 )
							if( rsi1 <= 41.7106 )
								ret := 0.000000
							if( rsi1 > 41.7106 )
								ret := -1.000000 // sell
						if( d > 12.8807 )
							ret := -0.833333 // sell
					if( smoothD_d > 10.811 )
						if( smoothD_d <= 15.7526 )
							if( bearPower <= -0.016854 )
								if( d <= 18.2327 )
									ret := -0.200000
								if( d > 18.2327 )
									ret := 0.600000
							if( bearPower > -0.016854 )
								if( d <= 16.5501 )
									ret := 0.250000
								if( d > 16.5501 )
									ret := 0.900000 // buy
						if( smoothD_d > 15.7526 )
							if( d_k <= -27.3796 )
								if( bbm <= 0.011849 )
									ret := 0.042553
								if( bbm > 0.011849 )
									ret := -0.349398
							if( d_k > -27.3796 )
								if( d <= 21.5155 )
									ret := -0.372093
								if( d > 21.5155 )
									ret := 0.061678
				if( bbm > 0.031983 )
					if( rsi1 <= 34.6376 )
						if( bearPower <= -0.030896 )
							if( smoothD_d <= 66.1246 )
								if( bearPower <= -0.073472 )
									ret := -0.060000
								if( bearPower > -0.073472 )
									ret := -0.475410
							if( smoothD_d > 66.1246 )
								if( rsi1 <= 29.9681 )
									ret := 0.250000
								if( rsi1 > 29.9681 )
									ret := 1.000000 // buy
						if( bearPower > -0.030896 )
							if( bbp <= 0.021292 )
								ret := 1.000000 // buy
							if( bbp > 0.021292 )
								ret := 0.750000 // buy
					if( rsi1 > 34.6376 )
						if( k <= 97.833 )
							if( bearPower <= 0.005629 )
								if( bbp <= -0.138353 )
									ret := -0.214286
								if( bbp > -0.138353 )
									ret := 0.467866
							if( bearPower > 0.005629 )
								if( smoothK_k <= 72.9465 )
									ret := -0.333333
								if( smoothK_k > 72.9465 )
									ret := -0.750000 // sell
						if( k > 97.833 )
							if( smoothD_d <= 77.2628 )
								if( smoothK_k <= 96.9294 )
									ret := -1.000000 // sell
								if( smoothK_k > 96.9294 )
									ret := -0.400000
							if( smoothD_d > 77.2628 )
								ret := 0.285714
			if( d_k > -16.9449 )
				if( bearPower <= -0.02581 )
					if( smoothD_d <= 22.3321 )
						if( rsi1 <= 47.2121 )
							if( k <= 23.2444 )
								if( smoothK_k <= 12.7494 )
									ret := 0.636364
								if( smoothK_k > 12.7494 )
									ret := -0.420635
							if( k > 23.2444 )
								if( bearPower <= -0.134995 )
									ret := -0.703704 // sell
								if( bearPower > -0.134995 )
									ret := 0.168798
						if( rsi1 > 47.2121 )
							if( bearPower <= -0.026921 )
								if( bullPower <= 0.035373 )
									ret := -1.000000 // sell
								if( bullPower > 0.035373 )
									ret := -0.750000 // sell
							if( bearPower > -0.026921 )
								ret := -0.250000
					if( smoothD_d > 22.3321 )
						if( smoothK_k <= 72.2178 )
							if( bbm <= 0.031199 )
								if( smoothD_d <= 25.151 )
									ret := -0.750000 // sell
								if( smoothD_d > 25.151 )
									ret := -0.036232
							if( bbm > 0.031199 )
								if( bullPower <= -0.046222 )
									ret := 0.263158
								if( bullPower > -0.046222 )
									ret := -0.569132
						if( smoothK_k > 72.2178 )
							if( bullPower <= 0.035247 )
								if( bbm <= 0.060023 )
									ret := -0.024845
								if( bbm > 0.060023 )
									ret := 0.440000
							if( bullPower > 0.035247 )
								ret := -1.000000 // sell
				if( bearPower > -0.02581 )
					if( d_k <= -12.1174 )
						if( rsi1 <= 27.2587 )
							if( k <= 29.5171 )
								if( smoothD_d <= 10.6169 )
									ret := 0.000000
								if( smoothD_d > 10.6169 )
									ret := -0.800000 // sell
							if( k > 29.5171 )
								if( rsi1 <= 20.3516 )
									ret := 0.000000
								if( rsi1 > 20.3516 )
									ret := 0.782609 // buy
						if( rsi1 > 27.2587 )
							if( k <= 85.5675 )
								if( smoothD_d <= 62.0638 )
									ret := -0.074675
								if( smoothD_d > 62.0638 )
									ret := 0.462500
							if( k > 85.5675 )
								if( bullPower <= 0.015647 )
									ret := -0.087912
								if( bullPower > 0.015647 )
									ret := -0.650000
					if( d_k > -12.1174 )
						if( k <= 83.1603 )
							if( rsi1 <= 37.6784 )
								if( d <= 50.0112 )
									ret := 0.155963
								if( d > 50.0112 )
									ret := 0.574468
							if( rsi1 > 37.6784 )
								if( bearPower <= -0.008438 )
									ret := -0.120968
								if( bearPower > -0.008438 )
									ret := 0.142857
						if( k > 83.1603 )
							if( k <= 87.0089 )
								if( rsi1 <= 38.3603 )
									ret := -0.250000
								if( rsi1 > 38.3603 )
									ret := 0.937500 // buy
							if( k > 87.0089 )
								if( bearPower <= -0.004794 )
									ret := 0.469136
								if( bearPower > -0.004794 )
									ret := -0.055556
		if( d_k > -9.41433 )
			if( bullPower <= -0.026697 )
				if( rsi1 <= 21.5369 )
					if( bbp <= -0.276271 )
						if( bbm <= 0.238675 )
							if( smoothK_k <= 43.1126 )
								if( d_k <= -2.05366 )
									ret := -0.057692
								if( d_k > -2.05366 )
									ret := 0.397163
							if( smoothK_k > 43.1126 )
								ret := -1.000000 // sell
						if( bbm > 0.238675 )
							if( bbp <= -0.500014 )
								ret := -1.000000 // sell
							if( bbp > -0.500014 )
								ret := -0.250000
					if( bbp > -0.276271 )
						if( d_k <= 18.6096 )
							if( bbm <= 0.03957 )
								if( rsi1 <= 10.1113 )
									ret := -0.114458
								if( rsi1 > 10.1113 )
									ret := 0.168008
							if( bbm > 0.03957 )
								if( smoothD_d <= 6.21725 )
									ret := -0.222414
								if( smoothD_d > 6.21725 )
									ret := 0.129747
						if( d_k > 18.6096 )
							if( rsi1 <= 21.4114 )
								if( k <= 21.3442 )
									ret := 0.368421
								if( k > 21.3442 )
									ret := 0.733333 // buy
							if( rsi1 > 21.4114 )
								ret := -0.750000 // sell
				if( rsi1 > 21.5369 )
					if( smoothD_d <= -2.46604 )
						if( rsi1 <= 26.4508 )
							if( k <= 0.006867 )
								if( rsi1 <= 26.0064 )
									ret := -0.750000 // sell
								if( rsi1 > 26.0064 )
									ret := 0.000000
							if( k > 0.006867 )
								if( smoothD_d <= -2.74849 )
									ret := 0.250000
								if( smoothD_d > -2.74849 )
									ret := 1.000000 // buy
						if( rsi1 > 26.4508 )
							if( bbm <= 0.010734 )
								if( d <= 0.247687 )
									ret := -0.500000
								if( d > 0.247687 )
									ret := 0.500000
							if( bbm > 0.010734 )
								if( rsi1 <= 34.888 )
									ret := 0.838710 // buy
								if( rsi1 > 34.888 )
									ret := 0.153846
					if( smoothD_d > -2.46604 )
						if( d <= 29.4152 )
							if( bbp <= -0.279179 )
								if( d <= 9.82455 )
									ret := -0.796875 // sell
								if( d > 9.82455 )
									ret := -0.063830
							if( bbp > -0.279179 )
								if( rsi1 <= 43.4494 )
									ret := -0.114885
								if( rsi1 > 43.4494 )
									ret := 0.419355
						if( d > 29.4152 )
							if( k <= 83.1612 )
								if( k <= 63.3409 )
									ret := 0.112727
								if( k > 63.3409 )
									ret := -0.258621
							if( k > 83.1612 )
								if( k <= 93.4509 )
									ret := 0.652778
								if( k > 93.4509 )
									ret := 0.052632
			if( bullPower > -0.026697 )
				if( bullPower <= 0.002441 )
					if( rsi1 <= 31.632 )
						if( bearPower <= -0.016997 )
							if( rsi1 <= 8.57608 )
								if( bearPower <= -0.050714 )
									ret := 0.428571
								if( bearPower > -0.050714 )
									ret := -0.450000
							if( rsi1 > 8.57608 )
								if( d_k <= -5.15263 )
									ret := 0.328600
								if( d_k > -5.15263 )
									ret := 0.162764
						if( bearPower > -0.016997 )
							if( d_k <= 1.78985 )
								if( smoothK_k <= 1.32996 )
									ret := -0.197802
								if( smoothK_k > 1.32996 )
									ret := 0.011142
							if( d_k > 1.78985 )
								if( bearPower <= -0.010708 )
									ret := 0.210084
								if( bearPower > -0.010708 )
									ret := -0.020270
					if( rsi1 > 31.632 )
						if( d_k <= -1.60361 )
							if( bearPower <= -0.039152 )
								if( d <= 15.7202 )
									ret := -0.368030
								if( d > 15.7202 )
									ret := 0.006061
							if( bearPower > -0.039152 )
								if( k <= 59.4032 )
									ret := -0.012144
								if( k > 59.4032 )
									ret := 0.159322
						if( d_k > -1.60361 )
							if( k <= 85.6465 )
								if( d <= 88.7188 )
									ret := 0.086100
								if( d > 88.7188 )
									ret := -0.270270
							if( k > 85.6465 )
								if( smoothK_k <= 91.3172 )
									ret := 0.401460
								if( smoothK_k > 91.3172 )
									ret := 0.000000
				if( bullPower > 0.002441 )
					if( rsi1 <= 35.3441 )
						if( smoothK_k <= 90.2383 )
							if( bearPower <= -0.045972 )
								if( d_k <= 22.5151 )
									ret := 0.363636
								if( d_k > 22.5151 )
									ret := 0.794872 // buy
							if( bearPower > -0.045972 )
								if( smoothK_k <= 54.9796 )
									ret := 0.158761
								if( smoothK_k > 54.9796 )
									ret := 0.584270
						if( smoothK_k > 90.2383 )
							if( bearPower <= -0.009846 )
								if( smoothK_k <= 96.8676 )
									ret := -1.000000 // sell
								if( smoothK_k > 96.8676 )
									ret := -0.750000 // sell
							if( bearPower > -0.009846 )
								ret := -0.250000
					if( rsi1 > 35.3441 )
						if( bbp <= -0.099406 )
							if( rsi1 <= 41.4034 )
								if( smoothD_d <= 35.3016 )
									ret := -0.945946 // sell
								if( smoothD_d > 35.3016 )
									ret := 0.250000
							if( rsi1 > 41.4034 )
								if( bearPower <= -0.131278 )
									ret := 0.541667
								if( bearPower > -0.131278 )
									ret := -0.800000 // sell
						if( bbp > -0.099406 )
							if( d <= 0.145255 )
								if( bbm <= 0.016747 )
									ret := 0.179487
								if( bbm > 0.016747 )
									ret := 0.816327 // buy
							if( d > 0.145255 )
								if( bearPower <= -0.053432 )
									ret := -0.036017
								if( bearPower > -0.053432 )
									ret := 0.125921
	if( rsi1 > 49.8442 )
		if( bbm <= 0.054063 )
			if( bullPower <= 0.023486 )
				if( d <= 45.1915 )
					if( d <= 43.3924 )
						if( bbm <= 0.039925 )
							if( bbm <= 0.038178 )
								if( bbp <= -0.055687 )
									ret := 0.516129
								if( bbp > -0.055687 )
									ret := -0.022074
							if( bbm > 0.038178 )
								if( smoothD_d <= 26.6061 )
									ret := 0.333333
								if( smoothD_d > 26.6061 )
									ret := 0.888889 // buy
						if( bbm > 0.039925 )
							if( smoothD_d <= 34.8039 )
								if( bearPower <= -0.023986 )
									ret := -0.337580
								if( bearPower > -0.023986 )
									ret := -0.047619
							if( smoothD_d > 34.8039 )
								if( k <= 25.7382 )
									ret := 0.812500 // buy
								if( k > 25.7382 )
									ret := 0.000000
					if( d > 43.3924 )
						if( bbm <= 0.037541 )
							if( bbm <= 0.020405 )
								if( d_k <= -25.0312 )
									ret := -0.700000 // sell
								if( d_k > -25.0312 )
									ret := -0.144092
							if( bbm > 0.020405 )
								if( k <= 33.4532 )
									ret := -0.846154 // sell
								if( k > 33.4532 )
									ret := -0.312500
						if( bbm > 0.037541 )
							if( bbp <= -0.005601 )
								if( d_k <= 17.9576 )
									ret := 1.000000 // buy
								if( d_k > 17.9576 )
									ret := 0.750000 // buy
							if( bbp > -0.005601 )
								ret := -0.333333
				if( d > 45.1915 )
					if( smoothK_k <= 93.2924 )
						if( bearPower <= -0.017789 )
							if( bullPower <= -0.014166 )
								if( k <= 93.8197 )
									ret := -0.304762
								if( k > 93.8197 )
									ret := 0.666667
							if( bullPower > -0.014166 )
								if( smoothD_d <= 79.4892 )
									ret := 0.192464
								if( smoothD_d > 79.4892 )
									ret := -0.002392
						if( bearPower > -0.017789 )
							if( d <= 77.0852 )
								if( d <= 69.8794 )
									ret := 0.013478
								if( d > 69.8794 )
									ret := -0.064201
							if( d > 77.0852 )
								if( k <= 69.7054 )
									ret := 0.317680
								if( k > 69.7054 )
									ret := 0.032615
					if( smoothK_k > 93.2924 )
						if( bbm <= 0.035493 )
							if( rsi1 <= 88.135 )
								if( d_k <= 0.396275 )
									ret := -0.058721
								if( d_k > 0.396275 )
									ret := -0.248555
							if( rsi1 > 88.135 )
								if( bbm <= 0.0074 )
									ret := 0.714286 // buy
								if( bbm > 0.0074 )
									ret := -0.040000
						if( bbm > 0.035493 )
							if( bbp <= -0.001797 )
								if( bbp <= -0.032782 )
									ret := 0.294118
								if( bbp > -0.032782 )
									ret := 0.843750 // buy
							if( bbp > -0.001797 )
								ret := -0.285714
			if( bullPower > 0.023486 )
				if( k <= 17.804 )
					if( rsi1 <= 61.7088 )
						if( smoothD_d <= 39.5862 )
							if( smoothD_d <= -1.29603 )
								if( smoothD_d <= -2.26195 )
									ret := 0.571429
								if( smoothD_d > -2.26195 )
									ret := 0.928571 // buy
							if( smoothD_d > -1.29603 )
								if( d <= 29.1506 )
									ret := 0.298368
								if( d > 29.1506 )
									ret := 0.616667
						if( smoothD_d > 39.5862 )
							if( bearPower <= -0.008091 )
								ret := -0.750000 // sell
							if( bearPower > -0.008091 )
								ret := -0.833333 // sell
					if( rsi1 > 61.7088 )
						if( bearPower <= 0.024437 )
							if( d <= 10.1552 )
								if( bullPower <= 0.051121 )
									ret := -0.081081
								if( bullPower > 0.051121 )
									ret := -0.750000 // sell
							if( d > 10.1552 )
								if( rsi1 <= 65.8289 )
									ret := 0.119403
								if( rsi1 > 65.8289 )
									ret := 0.625000
						if( bearPower > 0.024437 )
							if( smoothD_d <= 18.9027 )
								if( rsi1 <= 63.4477 )
									ret := -0.833333 // sell
								if( rsi1 > 63.4477 )
									ret := 0.305556
							if( smoothD_d > 18.9027 )
								if( bbm <= 0.023263 )
									ret := -0.333333
								if( bbm > 0.023263 )
									ret := -0.958333 // sell
				if( k > 17.804 )
					if( d <= 61.1981 )
						if( rsi1 <= 53.6741 )
							if( bbm <= 0.011398 )
								if( d_k <= -3.49916 )
									ret := -0.700000 // sell
								if( d_k > -3.49916 )
									ret := 0.000000
							if( bbm > 0.011398 )
								if( bbp <= 0.012057 )
									ret := -0.315789
								if( bbp > 0.012057 )
									ret := 0.320917
						if( rsi1 > 53.6741 )
							if( rsi1 <= 75.4765 )
								if( bbp <= 0.115897 )
									ret := -0.068952
								if( bbp > 0.115897 )
									ret := -0.312500
							if( rsi1 > 75.4765 )
								if( rsi1 <= 84.5093 )
									ret := 0.330317
								if( rsi1 > 84.5093 )
									ret := -0.377778
					if( d > 61.1981 )
						if( bbp <= 0.03722 )
							if( d_k <= -12.0512 )
								if( k <= 85.5508 )
									ret := 0.264706
								if( k > 85.5508 )
									ret := -0.234637
							if( d_k > -12.0512 )
								if( rsi1 <= 64.877 )
									ret := 0.213323
								if( rsi1 > 64.877 )
									ret := 0.077790
						if( bbp > 0.03722 )
							if( rsi1 <= 73.356 )
								if( d_k <= 6.63878 )
									ret := -0.027886
								if( d_k > 6.63878 )
									ret := 0.167521
							if( rsi1 > 73.356 )
								if( smoothD_d <= 62.1392 )
									ret := 0.506024
								if( smoothD_d > 62.1392 )
									ret := 0.078287
		if( bbm > 0.054063 )
			if( smoothK_k <= 18.5398 )
				if( smoothD_d <= 30.1577 )
					if( bullPower <= 0.079233 )
						if( rsi1 <= 58.2059 )
							if( rsi1 <= 57.0974 )
								if( d <= 19.5492 )
									ret := -0.299320
								if( d > 19.5492 )
									ret := 0.166667
							if( rsi1 > 57.0974 )
								if( d <= 13.2698 )
									ret := 0.736842 // buy
								if( d > 13.2698 )
									ret := -0.384615
						if( rsi1 > 58.2059 )
							if( smoothD_d <= 25.4878 )
								if( smoothD_d <= 5.31345 )
									ret := 0.000000
								if( smoothD_d > 5.31345 )
									ret := -0.628205
							if( smoothD_d > 25.4878 )
								ret := 0.571429
					if( bullPower > 0.079233 )
						if( rsi1 <= 63.5363 )
							if( d_k <= -0.238084 )
								if( smoothD_d <= -1.28252 )
									ret := 0.750000 // buy
								if( smoothD_d > -1.28252 )
									ret := 1.000000 // buy
							if( d_k > -0.238084 )
								if( bbp <= 0.118399 )
									ret := -0.416667
								if( bbp > 0.118399 )
									ret := 0.800000 // buy
						if( rsi1 > 63.5363 )
							if( bullPower <= 0.097808 )
								if( k <= 18.0416 )
									ret := 0.666667
								if( k > 18.0416 )
									ret := -0.714286 // sell
							if( bullPower > 0.097808 )
								if( bbm <= 0.1328 )
									ret := -1.000000 // sell
								if( bbm > 0.1328 )
									ret := -0.500000
				if( smoothD_d > 30.1577 )
					if( smoothK_k <= 12.6569 )
						if( bullPower <= 0.076618 )
							if( bbm <= 0.069496 )
								ret := -1.000000 // sell
							if( bbm > 0.069496 )
								ret := 0.000000
						if( bullPower > 0.076618 )
							ret := -1.000000 // sell
					if( smoothK_k > 12.6569 )
						if( rsi1 <= 62.7265 )
							if( d_k <= 20.497 )
								ret := 0.166667
							if( d_k > 20.497 )
								if( d_k <= 24.4936 )
									ret := -1.000000 // sell
								if( d_k > 24.4936 )
									ret := -0.200000
						if( rsi1 > 62.7265 )
							ret := 0.285714
			if( smoothK_k > 18.5398 )
				if( bbp <= -0.00235 )
					if( bbp <= -0.006759 )
						if( rsi1 <= 75.0211 )
							if( rsi1 <= 57.3145 )
								if( bullPower <= 0.03668 )
									ret := 0.126354
								if( bullPower > 0.03668 )
									ret := -0.340000
							if( rsi1 > 57.3145 )
								if( k <= 61.1467 )
									ret := -0.129032
								if( k > 61.1467 )
									ret := 0.615942
						if( rsi1 > 75.0211 )
							if( d_k <= -0.001763 )
								if( bbp <= -0.176307 )
									ret := -0.750000 // sell
								if( bbp > -0.176307 )
									ret := -1.000000 // sell
							if( d_k > -0.001763 )
								if( bbm <= 0.125 )
									ret := -0.500000
								if( bbm > 0.125 )
									ret := 0.000000
					if( bbp > -0.006759 )
						if( rsi1 <= 51.2455 )
							if( d_k <= 8.04706 )
								if( bullPower <= 0.027466 )
									ret := -0.800000 // sell
								if( bullPower > 0.027466 )
									ret := 0.000000
							if( d_k > 8.04706 )
								ret := 1.000000 // buy
						if( rsi1 > 51.2455 )
							if( bbp <= -0.003815 )
								if( bbp <= -0.004317 )
									ret := 0.772727 // buy
								if( bbp > -0.004317 )
									ret := 0.000000
							if( bbp > -0.003815 )
								ret := 1.000000 // buy
				if( bbp > -0.00235 )
					if( smoothK_k <= 48.0082 )
						if( bbp <= 0.055591 )
							if( d_k <= -10.888 )
								if( smoothD_d <= 12.914 )
									ret := -0.814815 // sell
								if( smoothD_d > 12.914 )
									ret := -0.178571
							if( d_k > -10.888 )
								if( smoothK_k <= 28.7579 )
									ret := 0.583333
								if( smoothK_k > 28.7579 )
									ret := -0.040323
						if( bbp > 0.055591 )
							if( d_k <= 9.94614 )
								if( bbm <= 0.323 )
									ret := 0.333333
								if( bbm > 0.323 )
									ret := -0.750000 // sell
							if( d_k > 9.94614 )
								if( d_k <= 19.4883 )
									ret := -0.517241
								if( d_k > 19.4883 )
									ret := 0.351351
					if( smoothK_k > 48.0082 )
						if( smoothK_k <= 50.0319 )
							if( bullPower <= 0.184945 )
								if( smoothK_k <= 49.0329 )
									ret := -0.235294
								if( smoothK_k > 49.0329 )
									ret := -0.777778 // sell
							if( bullPower > 0.184945 )
								ret := -1.000000 // sell
						if( smoothK_k > 50.0319 )
							if( smoothK_k <= 86.24 )
								if( d <= 86.9729 )
									ret := -0.061774
								if( d > 86.9729 )
									ret := -0.377465
							if( smoothK_k > 86.24 )
								if( d <= 76.9478 )
									ret := 0.421053
								if( d > 76.9478 )
									ret := -0.034929
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NIO_5Min_685fdfbc(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


