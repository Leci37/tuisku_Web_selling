//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AFRM_1Min_2BS0_f40b6b19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2BS0_f40b6b19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_f40b6b19(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= 0.0161 )
		if( k <= 18.8151 )
			if( bullPower <= -0.170515 )
				if( d <= 0.000726 )
					if( bbm <= 0.068596 )
						ret := 0.555556
					if( bbm > 0.068596 )
						if( bearPower <= -0.639095 )
							ret := 0.700000 // buy
						if( bearPower > -0.639095 )
							if( bbm <= 0.105 )
								ret := 1.000000 // buy
							if( bbm > 0.105 )
								if( bbp <= -0.669943 )
									ret := 0.956522 // buy
								if( bbp > -0.669943 )
									ret := 0.653846
				if( d > 0.000726 )
					if( bearPower <= -0.499803 )
						if( d <= 13.3748 )
							if( bbm <= 0.226459 )
								if( d <= 3.70459 )
									ret := 0.567568
								if( d > 3.70459 )
									ret := -0.288889
							if( bbm > 0.226459 )
								if( rsi1 <= 18.5686 )
									ret := -0.940476 // sell
								if( rsi1 > 18.5686 )
									ret := -0.269231
						if( d > 13.3748 )
							if( k <= 10.0003 )
								if( smoothK_k <= 1.69172 )
									ret := 0.777778 // buy
								if( smoothK_k > 1.69172 )
									ret := 1.000000 // buy
							if( k > 10.0003 )
								if( rsi1 <= 21.505 )
									ret := -0.541667
								if( rsi1 > 21.505 )
									ret := 0.800000 // buy
					if( bearPower > -0.499803 )
						if( smoothK_k <= -0.731924 )
							if( bullPower <= -0.254934 )
								if( bbm <= 0.092302 )
									ret := 0.800000 // buy
								if( bbm > 0.092302 )
									ret := 0.080000
							if( bullPower > -0.254934 )
								if( k <= 1.997 )
									ret := 0.100649
								if( k > 1.997 )
									ret := -0.518519
						if( smoothK_k > -0.731924 )
							if( smoothK_k <= 14.022 )
								if( bullPower <= -0.279951 )
									ret := 0.718447 // buy
								if( bullPower > -0.279951 )
									ret := 0.321479
							if( smoothK_k > 14.022 )
								if( bullPower <= -0.236814 )
									ret := -0.066667
								if( bullPower > -0.236814 )
									ret := -0.882353 // sell
			if( bullPower > -0.170515 )
				if( bbp <= 0.136315 )
					if( bearPower <= -0.291069 )
						if( rsi1 <= 27.3819 )
							if( smoothK_k <= -2.98146 )
								if( d <= 0.550067 )
									ret := -0.423077
								if( d > 0.550067 )
									ret := -0.882353 // sell
							if( smoothK_k > -2.98146 )
								if( smoothD_d <= 26.6157 )
									ret := 0.163265
								if( smoothD_d > 26.6157 )
									ret := -0.866667 // sell
						if( rsi1 > 27.3819 )
							if( bullPower <= -0.142551 )
								if( rsi1 <= 30.9286 )
									ret := -0.484848
								if( rsi1 > 30.9286 )
									ret := 0.087719
							if( bullPower > -0.142551 )
								if( bbp <= -0.233283 )
									ret := -0.493392
								if( bbp > -0.233283 )
									ret := 0.181818
					if( bearPower > -0.291069 )
						if( bbm <= 0.009859 )
							if( bbp <= -0.064288 )
								if( bearPower <= -0.092773 )
									ret := 0.103203
								if( bearPower > -0.092773 )
									ret := 0.368657
							if( bbp > -0.064288 )
								if( k <= 1.03508 )
									ret := 0.254237
								if( k > 1.03508 )
									ret := -0.030822
						if( bbm > 0.009859 )
							if( bbp <= -0.251758 )
								if( d <= 11.5703 )
									ret := 0.093808
								if( d > 11.5703 )
									ret := -0.113390
							if( bbp > -0.251758 )
								if( bearPower <= -0.076842 )
									ret := -0.086920
								if( bearPower > -0.076842 )
									ret := -0.014990
				if( bbp > 0.136315 )
					if( smoothK_k <= 5.03869 )
						if( bbm <= 0.19377 )
							if( d <= 2.49036 )
								ret := 0.000000
							if( d > 2.49036 )
								if( smoothK_k <= 1.20662 )
									ret := -0.733333 // sell
								if( smoothK_k > 1.20662 )
									ret := -0.909091 // sell
						if( bbm > 0.19377 )
							if( rsi1 <= 61.9295 )
								ret := -1.000000 // sell
							if( rsi1 > 61.9295 )
								ret := -0.909091 // sell
					if( smoothK_k > 5.03869 )
						if( bullPower <= 0.218096 )
							if( bullPower <= 0.145715 )
								ret := 0.071429
							if( bullPower > 0.145715 )
								if( k <= 10.6621 )
									ret := -0.214286
								if( k > 10.6621 )
									ret := -0.657143
						if( bullPower > 0.218096 )
							if( bullPower <= 0.329542 )
								ret := 0.461538
							if( bullPower > 0.329542 )
								ret := -0.545455
		if( k > 18.8151 )
			if( bullPower <= -0.037991 )
				if( d <= 96.8008 )
					if( k <= 21.327 )
						if( smoothK_k <= 16.5109 )
							if( bbp <= -0.538247 )
								ret := -0.928571 // sell
							if( bbp > -0.538247 )
								if( bullPower <= -0.097728 )
									ret := 0.767442 // buy
								if( bullPower > -0.097728 )
									ret := 0.424242
						if( smoothK_k > 16.5109 )
							if( smoothD_d <= 26.0986 )
								if( d_k <= -9.92133 )
									ret := -0.720930 // sell
								if( d_k > -9.92133 )
									ret := -0.205645
							if( smoothD_d > 26.0986 )
								if( d <= 36.2939 )
									ret := 0.610169
								if( d > 36.2939 )
									ret := -0.138889
					if( k > 21.327 )
						if( bearPower <= -0.365557 )
							if( smoothD_d <= 71.3585 )
								if( bbm <= 0.02849 )
									ret := -0.666667
								if( bbm > 0.02849 )
									ret := 0.373188
							if( smoothD_d > 71.3585 )
								if( smoothD_d <= 87.975 )
									ret := 0.926471 // buy
								if( smoothD_d > 87.975 )
									ret := 0.636364
						if( bearPower > -0.365557 )
							if( bbm <= 0.039565 )
								if( d_k <= -22.4261 )
									ret := -0.760000 // sell
								if( d_k > -22.4261 )
									ret := 0.283204
							if( bbm > 0.039565 )
								if( smoothD_d <= 13.7127 )
									ret := 0.683060
								if( smoothD_d > 13.7127 )
									ret := 0.082809
				if( d > 96.8008 )
					if( bearPower <= -0.112797 )
						if( bearPower <= -0.173518 )
							if( smoothD_d <= 95.2256 )
								ret := -1.000000 // sell
							if( smoothD_d > 95.2256 )
								ret := -0.800000 // sell
						if( bearPower > -0.173518 )
							if( smoothD_d <= 95.0273 )
								ret := -0.375000
							if( smoothD_d > 95.0273 )
								ret := -0.600000
					if( bearPower > -0.112797 )
						if( bullPower <= -0.056481 )
							ret := 0.444444
						if( bullPower > -0.056481 )
							ret := 0.055556
			if( bullPower > -0.037991 )
				if( d <= 95.4167 )
					if( smoothD_d <= 91.7284 )
						if( rsi1 <= 73.5589 )
							if( k <= 97.8652 )
								if( smoothD_d <= 83.0363 )
									ret := 0.024468
								if( smoothD_d > 83.0363 )
									ret := 0.105915
							if( k > 97.8652 )
								if( rsi1 <= 66.8465 )
									ret := -0.188020
								if( rsi1 > 66.8465 )
									ret := 0.487805
						if( rsi1 > 73.5589 )
							if( bbm <= 0.06995 )
								if( smoothD_d <= 78.2883 )
									ret := -0.168675
								if( smoothD_d > 78.2883 )
									ret := 0.208955
							if( bbm > 0.06995 )
								if( bullPower <= 0.304773 )
									ret := -0.439306
								if( bullPower > 0.304773 )
									ret := 0.200000
					if( smoothD_d > 91.7284 )
						if( bbm <= 0.131639 )
							if( rsi1 <= 39.2255 )
								if( smoothK_k <= 90.429 )
									ret := 0.461538
								if( smoothK_k > 90.429 )
									ret := 1.000000 // buy
							if( rsi1 > 39.2255 )
								if( d_k <= 8.01413 )
									ret := 0.174074
								if( d_k > 8.01413 )
									ret := 0.888889 // buy
						if( bbm > 0.131639 )
							if( smoothK_k <= 92.654 )
								if( bullPower <= 0.121468 )
									ret := 0.545455
								if( bullPower > 0.121468 )
									ret := 0.875000 // buy
							if( smoothK_k > 92.654 )
								ret := 1.000000 // buy
				if( d > 95.4167 )
					if( smoothD_d <= 92.7165 )
						if( d_k <= -2.51003 )
							ret := -0.736842 // sell
						if( d_k > -2.51003 )
							if( bbp <= 0.078815 )
								if( rsi1 <= 61.9207 )
									ret := -0.145161
								if( rsi1 > 61.9207 )
									ret := -0.703704 // sell
							if( bbp > 0.078815 )
								ret := 0.235294
					if( smoothD_d > 92.7165 )
						if( d_k <= -2.27106 )
							if( rsi1 <= 55.3283 )
								if( bbm <= 0.0725 )
									ret := 0.224138
								if( bbm > 0.0725 )
									ret := -0.375000
							if( rsi1 > 55.3283 )
								if( d_k <= -3.29562 )
									ret := -0.047619
								if( d_k > -3.29562 )
									ret := -0.634409
						if( d_k > -2.27106 )
							if( d_k <= -0.714856 )
								if( bearPower <= -0.026267 )
									ret := -0.253731
								if( bearPower > -0.026267 )
									ret := 0.374332
							if( d_k > -0.714856 )
								if( smoothK_k <= 93.4822 )
									ret := -0.005505
								if( smoothK_k > 93.4822 )
									ret := -0.167394
	if( bearPower > 0.0161 )
		if( bbm <= 0.009988 )
			if( bearPower <= 0.059975 )
				if( smoothK_k <= 70.0467 )
					if( d <= 53.3055 )
						if( d <= 49.6061 )
							if( bearPower <= 0.057036 )
								if( bearPower <= 0.055852 )
									ret := -0.180052
								if( bearPower > 0.055852 )
									ret := -0.846154 // sell
							if( bearPower > 0.057036 )
								if( bbm <= 0.000383 )
									ret := 0.028571
								if( bbm > 0.000383 )
									ret := 0.388889
						if( d > 49.6061 )
							if( bearPower <= 0.032105 )
								if( smoothK_k <= 51.6376 )
									ret := -0.266667
								if( smoothK_k > 51.6376 )
									ret := 0.000000
							if( bearPower > 0.032105 )
								if( d <= 50.8134 )
									ret := -0.055556
								if( d > 50.8134 )
									ret := 0.428571
					if( d > 53.3055 )
						if( bullPower <= 0.031924 )
							if( rsi1 <= 48.3774 )
								if( d <= 60.6164 )
									ret := 0.000000
								if( d > 60.6164 )
									ret := 0.333333
							if( rsi1 > 48.3774 )
								if( rsi1 <= 58.0444 )
									ret := -0.360000
								if( rsi1 > 58.0444 )
									ret := -0.083333
						if( bullPower > 0.031924 )
							if( d_k <= 13.9066 )
								if( bullPower <= 0.056233 )
									ret := -0.458101
								if( bullPower > 0.056233 )
									ret := -0.794872 // sell
							if( d_k > 13.9066 )
								if( rsi1 <= 58.2704 )
									ret := 0.500000
								if( rsi1 > 58.2704 )
									ret := -0.208333
				if( smoothK_k > 70.0467 )
					if( smoothK_k <= 70.5365 )
						ret := 0.791667 // buy
					if( smoothK_k > 70.5365 )
						if( d_k <= -12.3631 )
							if( k <= 99.0901 )
								if( d_k <= -14.783 )
									ret := -0.050000
								if( d_k > -14.783 )
									ret := -0.340000
							if( k > 99.0901 )
								ret := -0.666667
						if( d_k > -12.3631 )
							if( k <= 84.1832 )
								if( bbp <= 0.052542 )
									ret := 0.161290
								if( bbp > 0.052542 )
									ret := -0.213333
							if( k > 84.1832 )
								if( k <= 89.3353 )
									ret := 0.308271
								if( k > 89.3353 )
									ret := -0.024194
			if( bearPower > 0.059975 )
				if( smoothK_k <= 74.6847 )
					if( bbp <= 0.239797 )
						if( bearPower <= 0.062142 )
							if( d_k <= 1.35618 )
								if( d <= 39.8444 )
									ret := -0.705882 // sell
								if( d > 39.8444 )
									ret := -1.000000 // sell
							if( d_k > 1.35618 )
								ret := -0.555556
						if( bearPower > 0.062142 )
							if( k <= 72.7939 )
								if( smoothD_d <= 19.47 )
									ret := -0.546053
								if( smoothD_d > 19.47 )
									ret := -0.184265
							if( k > 72.7939 )
								if( d_k <= -12.6867 )
									ret := -0.950000 // sell
								if( d_k > -12.6867 )
									ret := -0.610169
					if( bbp > 0.239797 )
						if( d_k <= -20.9497 )
							if( d_k <= -25.3099 )
								ret := -0.866667 // sell
							if( d_k > -25.3099 )
								ret := -1.000000 // sell
						if( d_k > -20.9497 )
							if( rsi1 <= 75.2644 )
								if( smoothK_k <= 6.81957 )
									ret := 0.071429
								if( smoothK_k > 6.81957 )
									ret := -0.722433 // sell
							if( rsi1 > 75.2644 )
								if( bbp <= 0.495169 )
									ret := -0.296296
								if( bbp > 0.495169 )
									ret := 0.142857
				if( smoothK_k > 74.6847 )
					if( d_k <= 0.021585 )
						if( bearPower <= 0.080569 )
							if( bbm <= 0.005934 )
								if( k <= 98.7503 )
									ret := -0.083969
								if( k > 98.7503 )
									ret := -0.555556
							if( bbm > 0.005934 )
								if( bbp <= 0.152405 )
									ret := 0.000000
								if( bbp > 0.152405 )
									ret := 0.818182 // buy
						if( bearPower > 0.080569 )
							if( smoothK_k <= 76.5201 )
								ret := 0.357143
							if( smoothK_k > 76.5201 )
								if( d <= 87.6999 )
									ret := -0.529825
								if( d > 87.6999 )
									ret := -0.259259
					if( d_k > 0.021585 )
						if( rsi1 <= 70.432 )
							if( smoothD_d <= 87.329 )
								if( k <= 81.8594 )
									ret := -0.428571
								if( k > 81.8594 )
									ret := 0.425000
							if( smoothD_d > 87.329 )
								if( bbm <= 5e-06 )
									ret := -0.354167
								if( bbm > 5e-06 )
									ret := -0.840000 // sell
						if( rsi1 > 70.432 )
							if( k <= 90.4584 )
								if( d_k <= 2.21281 )
									ret := -0.529412
								if( d_k > 2.21281 )
									ret := 0.260870
							if( k > 90.4584 )
								if( smoothK_k <= 94.2127 )
									ret := 0.380952
								if( smoothK_k > 94.2127 )
									ret := 0.000000
		if( bbm > 0.009988 )
			if( bbm <= 0.04749 )
				if( bbp <= 0.118155 )
					if( bullPower <= 0.077227 )
						if( bullPower <= 0.073087 )
							if( smoothK_k <= 95.9391 )
								if( bbm <= 0.046617 )
									ret := -0.041126
								if( bbm > 0.046617 )
									ret := -0.727273 // sell
							if( smoothK_k > 95.9391 )
								if( d_k <= -15.4885 )
									ret := 0.821429 // buy
								if( d_k > -15.4885 )
									ret := 0.063636
						if( bullPower > 0.073087 )
							if( d <= 95.8026 )
								if( d <= 89.5211 )
									ret := -0.261745
								if( d > 89.5211 )
									ret := 0.000000
							if( d > 95.8026 )
								ret := -0.826087 // sell
					if( bullPower > 0.077227 )
						if( bullPower <= 0.078787 )
							if( k <= 43.6724 )
								ret := 0.857143 // buy
							if( k > 43.6724 )
								if( bbm <= 0.04495 )
									ret := 0.125000
								if( bbm > 0.04495 )
									ret := 0.687500
						if( bullPower > 0.078787 )
							if( smoothK_k <= 52.7876 )
								ret := 0.687500
							if( smoothK_k > 52.7876 )
								if( smoothK_k <= 91.4903 )
									ret := -0.764706 // sell
								if( smoothK_k > 91.4903 )
									ret := 0.416667
				if( bbp > 0.118155 )
					if( d_k <= -0.809903 )
						if( d_k <= -7.71356 )
							if( k <= 93.9301 )
								if( d <= 81.4332 )
									ret := -0.264198
								if( d > 81.4332 )
									ret := 0.466667
							if( k > 93.9301 )
								if( d_k <= -10.8901 )
									ret := -0.082759
								if( d_k > -10.8901 )
									ret := 0.348837
						if( d_k > -7.71356 )
							if( d_k <= -5.5286 )
								if( bullPower <= 0.085253 )
									ret := -0.340000
								if( bullPower > 0.085253 )
									ret := -0.720000 // sell
							if( d_k > -5.5286 )
								if( rsi1 <= 73.6702 )
									ret := -0.374422
								if( rsi1 > 73.6702 )
									ret := -0.051829
					if( d_k > -0.809903 )
						if( bullPower <= 0.401679 )
							if( d_k <= 5.4236 )
								if( rsi1 <= 66.6328 )
									ret := -0.179837
								if( rsi1 > 66.6328 )
									ret := 0.058190
							if( d_k > 5.4236 )
								if( bbp <= 0.154229 )
									ret := -0.092511
								if( bbp > 0.154229 )
									ret := -0.361486
						if( bullPower > 0.401679 )
							ret := 0.950000 // buy
			if( bbm > 0.04749 )
				if( rsi1 <= 71.3209 )
					if( bbm <= 0.205728 )
						if( rsi1 <= 70.0133 )
							if( k <= 4.10572 )
								if( bullPower <= 0.161511 )
									ret := 0.174312
								if( bullPower > 0.161511 )
									ret := 0.790698 // buy
							if( k > 4.10572 )
								if( bbm <= 0.202964 )
									ret := 0.006189
								if( bbm > 0.202964 )
									ret := 0.818182 // buy
						if( rsi1 > 70.0133 )
							if( bbm <= 0.09995 )
								if( smoothD_d <= 96.0981 )
									ret := 0.288770
								if( smoothD_d > 96.0981 )
									ret := 0.590909
							if( bbm > 0.09995 )
								if( bbm <= 0.184356 )
									ret := -0.148810
								if( bbm > 0.184356 )
									ret := 0.518519
					if( bbm > 0.205728 )
						if( d_k <= -3.13308 )
							if( smoothK_k <= 35.0722 )
								if( d <= 11.6799 )
									ret := -1.000000 // sell
								if( d > 11.6799 )
									ret := -0.909091 // sell
							if( smoothK_k > 35.0722 )
								if( smoothK_k <= 52.5153 )
									ret := 0.333333
								if( smoothK_k > 52.5153 )
									ret := -0.391837
						if( d_k > -3.13308 )
							if( smoothK_k <= 92.8534 )
								if( d <= 79.0225 )
									ret := 0.138298
								if( d > 79.0225 )
									ret := -0.495238
							if( smoothK_k > 92.8534 )
								if( smoothK_k <= 96.0807 )
									ret := 0.961538 // buy
								if( smoothK_k > 96.0807 )
									ret := 0.222222
				if( rsi1 > 71.3209 )
					if( smoothD_d <= 95.431 )
						if( d_k <= 2.43514 )
							if( bearPower <= 0.07411 )
								if( d <= 65.0218 )
									ret := 0.236842
								if( d > 65.0218 )
									ret := -0.071237
							if( bearPower > 0.07411 )
								if( rsi1 <= 84.2388 )
									ret := -0.236653
								if( rsi1 > 84.2388 )
									ret := 0.113475
						if( d_k > 2.43514 )
							if( rsi1 <= 84.2415 )
								if( bbm <= 0.053636 )
									ret := 0.184211
								if( bbm > 0.053636 )
									ret := -0.054106
							if( rsi1 > 84.2415 )
								if( k <= 65.2875 )
									ret := -0.818182 // sell
								if( k > 65.2875 )
									ret := 0.546218
					if( smoothD_d > 95.431 )
						if( rsi1 <= 77.122 )
							if( d <= 98.5593 )
								ret := -0.187500
							if( d > 98.5593 )
								if( bullPower <= 0.132838 )
									ret := -0.406250
								if( bullPower > 0.132838 )
									ret := -0.777778 // sell
						if( rsi1 > 77.122 )
							if( smoothK_k <= 95.44 )
								if( bbp <= 0.30649 )
									ret := -0.437500
								if( bbp > 0.30649 )
									ret := 0.735849 // buy
							if( smoothK_k > 95.44 )
								if( bbp <= 0.327896 )
									ret := 0.021201
								if( bbp > 0.327896 )
									ret := -0.375451
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_f40b6b19(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


