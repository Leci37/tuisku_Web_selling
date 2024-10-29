//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SOLUSDT_30Min_2BS0_3eb20eff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2BS0_3eb20eff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_3eb20eff(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d <= 71.4257 )
		if( k <= 15.9108 )
			if( bbm <= 0.110064 )
				if( bearPower <= 0.002101 )
					if( rsi1 <= 14.3349 )
						if( smoothD_d <= -2.30668 )
							if( bullPower <= -0.07744 )
								ret := 0.500000
							if( bullPower > -0.07744 )
								if( bbp <= -0.115766 )
									ret := -0.083333
								if( bbp > -0.115766 )
									ret := 0.363636
						if( smoothD_d > -2.30668 )
							if( bullPower <= -0.072511 )
								if( smoothD_d <= 3.76259 )
									ret := -0.960000 // sell
								if( smoothD_d > 3.76259 )
									ret := -0.750000 // sell
							if( bullPower > -0.072511 )
								if( smoothD_d <= -0.985348 )
									ret := 0.714286 // buy
								if( smoothD_d > -0.985348 )
									ret := -0.370968
					if( rsi1 > 14.3349 )
						if( smoothD_d <= -2.8795 )
							if( rsi1 <= 21.9818 )
								if( BBPower_Color <= 0.5 )
									ret := -0.714286 // sell
								if( BBPower_Color > 0.5 )
									ret := -1.000000 // sell
							if( rsi1 > 21.9818 )
								if( bbm <= 0.0292 )
									ret := 0.333333
								if( bbm > 0.0292 )
									ret := -0.615385
						if( smoothD_d > -2.8795 )
							if( bullPower <= -0.012061 )
								if( bbm <= 0.056839 )
									ret := 0.199219
								if( bbm > 0.056839 )
									ret := -0.006831
							if( bullPower > -0.012061 )
								if( d <= 36.2244 )
									ret := -0.115998
								if( d > 36.2244 )
									ret := 0.600000
				if( bearPower > 0.002101 )
					if( bullPower <= 0.224703 )
						if( smoothD_d <= 5.00106 )
							if( rsi1 <= 62.1862 )
								if( bullPower <= 0.118195 )
									ret := -0.629630
								if( bullPower > 0.118195 )
									ret := -0.196429
							if( rsi1 > 62.1862 )
								if( smoothK_k <= 8.90705 )
									ret := 0.181818
								if( smoothK_k > 8.90705 )
									ret := -0.571429
						if( smoothD_d > 5.00106 )
							if( smoothD_d <= 8.74913 )
								if( k <= 4.84649 )
									ret := 0.592593
								if( k > 4.84649 )
									ret := 0.105263
							if( smoothD_d > 8.74913 )
								if( bbp <= 0.260655 )
									ret := -0.230392
								if( bbp > 0.260655 )
									ret := -0.750000 // sell
					if( bullPower > 0.224703 )
						if( bbm <= 0.09765 )
							ret := -1.000000 // sell
						if( bbm > 0.09765 )
							ret := -0.666667
			if( bbm > 0.110064 )
				if( rsi1 <= 36.195 )
					if( k <= 3.06746 )
						if( rsi1 <= 26.7539 )
							if( bullPower <= -0.033042 )
								if( bearPower <= -0.327846 )
									ret := -0.790214 // sell
								if( bearPower > -0.327846 )
									ret := -0.459854
							if( bullPower > -0.033042 )
								if( smoothD_d <= -1.89822 )
									ret := -0.956647 // sell
								if( smoothD_d > -1.89822 )
									ret := -0.872752 // sell
						if( rsi1 > 26.7539 )
							if( bbp <= -0.005069 )
								if( d_k <= 3.90632 )
									ret := -0.453704
								if( d_k > 3.90632 )
									ret := -0.733333 // sell
							if( bbp > -0.005069 )
								if( BBPower_Color <= 0.5 )
									ret := -0.981818 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.820225 // sell
					if( k > 3.06746 )
						if( bbp <= -0.135175 )
							if( bbm <= 0.160023 )
								if( smoothK_k <= 9.62834 )
									ret := -0.098726
								if( smoothK_k > 9.62834 )
									ret := -0.512500
							if( bbm > 0.160023 )
								if( bullPower <= -0.303857 )
									ret := -0.383960
								if( bullPower > -0.303857 )
									ret := -0.655045
						if( bbp > -0.135175 )
							if( smoothD_d <= 19.9448 )
								if( bullPower <= 0.115985 )
									ret := -0.625592
								if( bullPower > 0.115985 )
									ret := -0.852857 // sell
							if( smoothD_d > 19.9448 )
								if( bbm <= 0.14233 )
									ret := -0.413793
								if( bbm > 0.14233 )
									ret := -0.948905 // sell
				if( rsi1 > 36.195 )
					if( bullPower <= 0.189057 )
						if( smoothK_k <= 3.78195 )
							if( bbp <= -0.020048 )
								if( bbp <= -0.179762 )
									ret := -0.143969
								if( bbp > -0.179762 )
									ret := 0.057143
							if( bbp > -0.020048 )
								if( rsi1 <= 39.9203 )
									ret := -0.662162
								if( rsi1 > 39.9203 )
									ret := -0.221344
						if( smoothK_k > 3.78195 )
							if( d_k <= 3.92681 )
								if( bearPower <= -0.198278 )
									ret := 0.325147
								if( bearPower > -0.198278 )
									ret := -0.060052
							if( d_k > 3.92681 )
								if( d <= 26.8764 )
									ret := -0.199105
								if( d > 26.8764 )
									ret := -0.540230
					if( bullPower > 0.189057 )
						if( bbp <= 0.233953 )
							if( rsi1 <= 46.5207 )
								if( d <= 23.8742 )
									ret := -0.441235
								if( d > 23.8742 )
									ret := -0.750000 // sell
							if( rsi1 > 46.5207 )
								if( bbm <= 1.17524 )
									ret := 0.060748
								if( bbm > 1.17524 )
									ret := 0.509901
						if( bbp > 0.233953 )
							if( smoothD_d <= 17.3008 )
								if( rsi1 <= 47.1942 )
									ret := -0.709396 // sell
								if( rsi1 > 47.1942 )
									ret := -0.244127
							if( smoothD_d > 17.3008 )
								if( rsi1 <= 58.8595 )
									ret := -0.690141
								if( rsi1 > 58.8595 )
									ret := -0.244444
		if( k > 15.9108 )
			if( d_k <= -4.25635 )
				if( d_k <= -13.4671 )
					if( bearPower <= -0.090119 )
						if( rsi1 <= 48.7189 )
							if( bullPower <= -0.05197 )
								if( d_k <= -22.3083 )
									ret := 0.597953
								if( d_k > -22.3083 )
									ret := 0.317591
							if( bullPower > -0.05197 )
								if( rsi1 <= 38.8611 )
									ret := -0.468750
								if( rsi1 > 38.8611 )
									ret := 0.048780
						if( rsi1 > 48.7189 )
							if( rsi1 <= 60.755 )
								if( bbp <= -0.161271 )
									ret := 0.701743 // buy
								if( bbp > -0.161271 )
									ret := 0.353659
							if( rsi1 > 60.755 )
								if( BBPower_Color <= 0.5 )
									ret := 0.891033 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.725857 // buy
					if( bearPower > -0.090119 )
						if( rsi1 <= 61.8889 )
							if( smoothD_d <= 59.6677 )
								if( k <= 38.4123 )
									ret := -0.353774
								if( k > 38.4123 )
									ret := 0.003024
							if( smoothD_d > 59.6677 )
								if( rsi1 <= 53.9825 )
									ret := 0.051948
								if( rsi1 > 53.9825 )
									ret := 0.478632
						if( rsi1 > 61.8889 )
							if( rsi1 <= 74.2951 )
								if( BBPower_Color <= 0.5 )
									ret := 0.846715 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.337349
							if( rsi1 > 74.2951 )
								if( bearPower <= 0.036798 )
									ret := 0.506410
								if( bearPower > 0.036798 )
									ret := 0.769565 // buy
				if( d_k > -13.4671 )
					if( k <= 23.8733 )
						if( rsi1 <= 32.0043 )
							if( bullPower <= -0.013361 )
								if( smoothD_d <= 4.58948 )
									ret := 0.777778 // buy
								if( smoothD_d > 4.58948 )
									ret := -0.198058
							if( bullPower > -0.013361 )
								if( smoothK_k <= 19.1699 )
									ret := -0.851852 // sell
								if( smoothK_k > 19.1699 )
									ret := -0.444444
						if( rsi1 > 32.0043 )
							if( bearPower <= -0.113323 )
								if( bbp <= -0.091349 )
									ret := 0.342360
								if( bbp > -0.091349 )
									ret := -0.152466
							if( bearPower > -0.113323 )
								if( bullPower <= 2.59523 )
									ret := -0.028892
								if( bullPower > 2.59523 )
									ret := -0.761905 // sell
					if( k > 23.8733 )
						if( bearPower <= -0.055222 )
							if( bearPower <= -4.2077 )
								if( rsi1 <= 34.0527 )
									ret := 0.264463
								if( rsi1 > 34.0527 )
									ret := 0.728916 // buy
							if( bearPower > -4.2077 )
								if( d <= 64.3071 )
									ret := 0.230098
								if( d > 64.3071 )
									ret := 0.463376
						if( bearPower > -0.055222 )
							if( bullPower <= 0.170275 )
								if( bullPower <= -0.013667 )
									ret := 0.560000
								if( bullPower > -0.013667 )
									ret := -0.165599
							if( bullPower > 0.170275 )
								if( d <= 51.4658 )
									ret := 0.251179
								if( d > 51.4658 )
									ret := 0.028470
			if( d_k > -4.25635 )
				if( rsi1 <= 52.9659 )
					if( bbp <= 0.125317 )
						if( d <= 62.4463 )
							if( bearPower <= -0.165505 )
								if( d_k <= 1.5075 )
									ret := -0.071567
								if( d_k > 1.5075 )
									ret := -0.416452
							if( bearPower > -0.165505 )
								if( bbm <= 0.084856 )
									ret := 0.075672
								if( bbm > 0.084856 )
									ret := -0.239427
						if( d > 62.4463 )
							if( rsi1 <= 41.5521 )
								if( bullPower <= 0.068974 )
									ret := -0.532051
								if( bullPower > 0.068974 )
									ret := -0.816406 // sell
							if( rsi1 > 41.5521 )
								if( smoothD_d <= 67.5169 )
									ret := -0.139200
								if( smoothD_d > 67.5169 )
									ret := 0.385965
					if( bbp > 0.125317 )
						if( rsi1 <= 47.0754 )
							if( BBPower_Color <= 0.5 )
								if( k <= 25.2134 )
									ret := -0.867925 // sell
								if( k > 25.2134 )
									ret := -0.984674 // sell
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.188825 )
									ret := -0.350649
								if( bullPower > 0.188825 )
									ret := -0.759468 // sell
						if( rsi1 > 47.0754 )
							if( bullPower <= 1.41574 )
								if( smoothK_k <= 61.365 )
									ret := -0.423769
								if( smoothK_k > 61.365 )
									ret := -0.688312
							if( bullPower > 1.41574 )
								if( bullPower <= 2.70829 )
									ret := -0.630769
								if( bullPower > 2.70829 )
									ret := -0.832432 // sell
				if( rsi1 > 52.9659 )
					if( rsi1 <= 61.3967 )
						if( bearPower <= -0.038471 )
							if( smoothK_k <= 55.9185 )
								if( d_k <= 3.8234 )
									ret := 0.491589
								if( d_k > 3.8234 )
									ret := 0.230028
							if( smoothK_k > 55.9185 )
								if( bearPower <= -0.183678 )
									ret := 0.742991 // buy
								if( bearPower > -0.183678 )
									ret := 0.308219
						if( bearPower > -0.038471 )
							if( smoothK_k <= 20.3585 )
								if( BBPower_Color <= 0.5 )
									ret := 0.823529 // buy
								if( BBPower_Color > 0.5 )
									ret := -0.292683
							if( smoothK_k > 20.3585 )
								if( bearPower <= 0.124393 )
									ret := -0.192564
								if( bearPower > 0.124393 )
									ret := -0.640875
					if( rsi1 > 61.3967 )
						if( d_k <= 10.161 )
							if( bbm <= 0.588663 )
								if( bullPower <= 0.560266 )
									ret := 0.114439
								if( bullPower > 0.560266 )
									ret := -0.248780
							if( bbm > 0.588663 )
								if( smoothD_d <= 66.8897 )
									ret := 0.426146
								if( smoothD_d > 66.8897 )
									ret := -0.035294
						if( d_k > 10.161 )
							if( smoothD_d <= 42.5869 )
								if( k <= 25.7284 )
									ret := 0.010753
								if( k > 25.7284 )
									ret := 0.661765
							if( smoothD_d > 42.5869 )
								if( bbp <= 2.00242 )
									ret := 0.029060
								if( bbp > 2.00242 )
									ret := -0.430446
	if( d > 71.4257 )
		if( k <= 87.7505 )
			if( smoothK_k <= 72.1919 )
				if( rsi1 <= 57.3452 )
					if( bearPower <= 0.028851 )
						if( bbp <= 0.021677 )
							if( rsi1 <= 35.3411 )
								if( d <= 85.7007 )
									ret := -0.721154 // sell
								if( d > 85.7007 )
									ret := 0.166667
							if( rsi1 > 35.3411 )
								if( d_k <= 14.5408 )
									ret := -0.034230
								if( d_k > 14.5408 )
									ret := 0.294118
						if( bbp > 0.021677 )
							if( bearPower <= -0.717316 )
								if( smoothK_k <= 71.119 )
									ret := -0.071429
								if( smoothK_k > 71.119 )
									ret := 0.769231 // buy
							if( bearPower > -0.717316 )
								if( d <= 79.8642 )
									ret := -0.554828
								if( d > 79.8642 )
									ret := -0.303249
					if( bearPower > 0.028851 )
						if( bbm <= 0.185 )
							if( smoothD_d <= 75.2636 )
								if( smoothK_k <= 57.3806 )
									ret := 0.000000
								if( smoothK_k > 57.3806 )
									ret := -0.166667
							if( smoothD_d > 75.2636 )
								if( k <= 69.792 )
									ret := -0.500000
								if( k > 69.792 )
									ret := -0.285714
						if( bbm > 0.185 )
							if( d_k <= 12.1471 )
								if( k <= 66.8899 )
									ret := -0.460000
								if( k > 66.8899 )
									ret := -0.707865 // sell
							if( d_k > 12.1471 )
								if( bullPower <= 0.689155 )
									ret := -0.895522 // sell
								if( bullPower > 0.689155 )
									ret := -0.761317 // sell
				if( rsi1 > 57.3452 )
					if( bullPower <= 3.58302 )
						if( bbm <= 1.82912 )
							if( bearPower <= -0.025521 )
								if( bbp <= 0.504821 )
									ret := 0.549091
								if( bbp > 0.504821 )
									ret := 0.080460
							if( bearPower > -0.025521 )
								if( d_k <= 7.81208 )
									ret := 0.180243
								if( d_k > 7.81208 )
									ret := -0.102465
						if( bbm > 1.82912 )
							if( d <= 74.0263 )
								if( rsi1 <= 65.4318 )
									ret := 0.904762 // buy
								if( rsi1 > 65.4318 )
									ret := 0.650000
							if( d > 74.0263 )
								if( d <= 78.4077 )
									ret := 0.052632
								if( d > 78.4077 )
									ret := 0.681818
					if( bullPower > 3.58302 )
						if( smoothD_d <= 80.963 )
							if( bullPower <= 5.97945 )
								if( smoothK_k <= 58.7114 )
									ret := -0.041667
								if( smoothK_k > 58.7114 )
									ret := -0.685185
							if( bullPower > 5.97945 )
								if( smoothK_k <= 63.1861 )
									ret := -0.621622
								if( smoothK_k > 63.1861 )
									ret := -1.000000 // sell
						if( smoothD_d > 80.963 )
							if( smoothD_d <= 82.0435 )
								ret := -0.200000
							if( smoothD_d > 82.0435 )
								ret := 0.062500
			if( smoothK_k > 72.1919 )
				if( d <= 83.255 )
					if( k <= 78.8064 )
						if( d_k <= -6.04902 )
							ret := -0.526316
						if( d_k > -6.04902 )
							if( bearPower <= 0.065125 )
								if( k <= 77.2805 )
									ret := 0.232033
								if( k > 77.2805 )
									ret := -0.153571
							if( bearPower > 0.065125 )
								if( d_k <= -1.94186 )
									ret := 0.061538
								if( d_k > -1.94186 )
									ret := 0.379310
					if( k > 78.8064 )
						if( d_k <= -11.2689 )
							if( bearPower <= -0.027501 )
								if( bearPower <= -1.71116 )
									ret := -0.153846
								if( bearPower > -1.71116 )
									ret := 0.371134
							if( bearPower > -0.027501 )
								if( bullPower <= 0.030909 )
									ret := -0.947368 // sell
								if( bullPower > 0.030909 )
									ret := 0.000000
						if( d_k > -11.2689 )
							if( k <= 83.7691 )
								if( bbm <= 0.149621 )
									ret := 0.036364
								if( bbm > 0.149621 )
									ret := 0.349492
							if( k > 83.7691 )
								if( d <= 78.9679 )
									ret := 0.533487
								if( d > 78.9679 )
									ret := 0.295739
				if( d > 83.255 )
					if( bearPower <= -0.019141 )
						if( rsi1 <= 55.5749 )
							if( smoothK_k <= 73.7023 )
								if( bbm <= 0.163542 )
									ret := 0.333333
								if( bbm > 0.163542 )
									ret := -0.739726 // sell
							if( smoothK_k > 73.7023 )
								if( bullPower <= 0.025775 )
									ret := 0.022876
								if( bullPower > 0.025775 )
									ret := -0.325513
						if( rsi1 > 55.5749 )
							if( bearPower <= -0.24278 )
								if( bbp <= 0.351349 )
									ret := 0.834356 // buy
								if( bbp > 0.351349 )
									ret := 0.489130
							if( bearPower > -0.24278 )
								if( rsi1 <= 59.422 )
									ret := 0.147287
								if( rsi1 > 59.422 )
									ret := 0.617188
					if( bearPower > -0.019141 )
						if( rsi1 <= 67.5595 )
							if( bbp <= 0.336629 )
								if( bullPower <= 0.280706 )
									ret := -0.254647
								if( bullPower > 0.280706 )
									ret := 0.750000 // buy
							if( bbp > 0.336629 )
								if( bullPower <= 0.687264 )
									ret := -0.581227
								if( bullPower > 0.687264 )
									ret := -0.361702
						if( rsi1 > 67.5595 )
							if( bearPower <= 3.9514 )
								if( bullPower <= 0.036427 )
									ret := -0.470588
								if( bullPower > 0.036427 )
									ret := 0.398331
							if( bearPower > 3.9514 )
								ret := -0.500000
		if( k > 87.7505 )
			if( k <= 96.0742 )
				if( bbm <= 0.10015 )
					if( BBPower_Color <= 0.5 )
						if( d_k <= -0.273619 )
							if( bbm <= 0.012139 )
								ret := -0.866667 // sell
							if( bbm > 0.012139 )
								if( d <= 92.1462 )
									ret := 0.171806
								if( d > 92.1462 )
									ret := -0.346154
						if( d_k > -0.273619 )
							if( rsi1 <= 73.5336 )
								if( bearPower <= -0.031093 )
									ret := 0.142857
								if( bearPower > -0.031093 )
									ret := 0.692308
							if( rsi1 > 73.5336 )
								ret := 1.000000 // buy
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 74.6541 )
							if( rsi1 <= 60.3288 )
								if( k <= 90.834 )
									ret := 0.234234
								if( k > 90.834 )
									ret := -0.044118
							if( rsi1 > 60.3288 )
								if( smoothK_k <= 91.2186 )
									ret := -0.126761
								if( smoothK_k > 91.2186 )
									ret := -0.393333
						if( rsi1 > 74.6541 )
							if( smoothK_k <= 88.4643 )
								if( k <= 88.5204 )
									ret := -0.333333
								if( k > 88.5204 )
									ret := 0.575000
							if( smoothK_k > 88.4643 )
								if( d <= 81.1037 )
									ret := 0.733333 // buy
								if( d > 81.1037 )
									ret := -0.028571
				if( bbm > 0.10015 )
					if( d <= 89.4967 )
						if( rsi1 <= 54.1174 )
							if( bearPower <= -0.060952 )
								if( d_k <= -2.04287 )
									ret := 0.402454
								if( d_k > -2.04287 )
									ret := -0.269841
							if( bearPower > -0.060952 )
								if( smoothK_k <= 87.7516 )
									ret := -0.843750 // sell
								if( smoothK_k > 87.7516 )
									ret := -0.030303
						if( rsi1 > 54.1174 )
							if( bbp <= 8.1329 )
								if( bbm <= 0.181605 )
									ret := 0.377863
								if( bbm > 0.181605 )
									ret := 0.671239
							if( bbp > 8.1329 )
								if( smoothD_d <= 80.8243 )
									ret := -0.538462
								if( smoothD_d > 80.8243 )
									ret := 0.000000
					if( d > 89.4967 )
						if( rsi1 <= 58.8374 )
							if( bullPower <= 0.039893 )
								if( rsi1 <= 38.498 )
									ret := -0.504762
								if( rsi1 > 38.498 )
									ret := 0.431925
							if( bullPower > 0.039893 )
								if( rsi1 <= 45.8088 )
									ret := -0.777273 // sell
								if( rsi1 > 45.8088 )
									ret := -0.148741
						if( rsi1 > 58.8374 )
							if( bbp <= 0.109295 )
								if( bearPower <= -1.88394 )
									ret := 0.355556
								if( bearPower > -1.88394 )
									ret := 0.801113 // buy
							if( bbp > 0.109295 )
								if( rsi1 <= 68.2382 )
									ret := 0.171162
								if( rsi1 > 68.2382 )
									ret := 0.581926
			if( k > 96.0742 )
				if( bearPower <= 0.080292 )
					if( bullPower <= 0.166384 )
						if( BBPower_Color <= 0.5 )
							if( smoothD_d <= 92.5238 )
								if( d_k <= -16.2987 )
									ret := 0.536810
								if( d_k > -16.2987 )
									ret := 0.647296
							if( smoothD_d > 92.5238 )
								if( bbp <= -0.12978 )
									ret := 0.614014
								if( bbp > -0.12978 )
									ret := 0.316726
						if( BBPower_Color > 0.5 )
							if( bearPower <= 0.001236 )
								if( bullPower <= 0.087539 )
									ret := 0.125000
								if( bullPower > 0.087539 )
									ret := 0.643885
							if( bearPower > 0.001236 )
								if( smoothD_d <= 96.9999 )
									ret := -0.177691
								if( smoothD_d > 96.9999 )
									ret := 0.285714
					if( bullPower > 0.166384 )
						if( d <= 99.9537 )
							if( bbm <= 0.121261 )
								if( smoothK_k <= 96.714 )
									ret := 0.000000
								if( smoothK_k > 96.714 )
									ret := -0.444444
							if( bbm > 0.121261 )
								if( smoothK_k <= 96.7219 )
									ret := 0.611480
								if( smoothK_k > 96.7219 )
									ret := 0.686375
						if( d > 99.9537 )
							if( rsi1 <= 58.4317 )
								if( bearPower <= -0.323911 )
									ret := -0.100000
								if( bearPower > -0.323911 )
									ret := 0.470588
							if( rsi1 > 58.4317 )
								if( bbm <= 0.917341 )
									ret := 0.841808 // buy
								if( bbm > 0.917341 )
									ret := 0.940476 // buy
				if( bearPower > 0.080292 )
					if( smoothK_k <= 96.7525 )
						if( d <= 99.1609 )
							if( bullPower <= 0.41638 )
								if( d_k <= 1.87927 )
									ret := 0.316176
								if( d_k > 1.87927 )
									ret := 0.920000 // buy
							if( bullPower > 0.41638 )
								if( bearPower <= 0.418106 )
									ret := 0.738211 // buy
								if( bearPower > 0.418106 )
									ret := 0.568558
						if( d > 99.1609 )
							if( d_k <= -0.075168 )
								ret := -0.687500
							if( d_k > -0.075168 )
								if( rsi1 <= 61.0573 )
									ret := -0.750000 // sell
								if( rsi1 > 61.0573 )
									ret := 0.502304
					if( smoothK_k > 96.7525 )
						if( rsi1 <= 74.8941 )
							if( d_k <= -8.51611 )
								if( bullPower <= 1.17383 )
									ret := 0.111111
								if( bullPower > 1.17383 )
									ret := -0.181818
							if( d_k > -8.51611 )
								if( bbp <= 4.82834 )
									ret := 0.556098
								if( bbp > 4.82834 )
									ret := 0.148148
						if( rsi1 > 74.8941 )
							if( bbp <= 0.362947 )
								if( d_k <= -0.058328 )
									ret := -0.130435
								if( d_k > -0.058328 )
									ret := 0.818182 // buy
							if( bbp > 0.362947 )
								if( bullPower <= 1.62581 )
									ret := 0.918169 // buy
								if( bullPower > 1.62581 )
									ret := 0.828652 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_3eb20eff(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


