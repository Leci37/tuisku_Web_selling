//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MSFT_5Min_2SV0_47506ab7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2SV0_47506ab7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_47506ab7(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 48.8958 )
		if( VIP <= 0.944892 )
			if( smoothK_k <= 76.2084 )
				if( rsi1 <= 41.3668 )
					if( VIM <= 1.43206 )
						if( VIM <= 1.05218 )
							if( smoothK_k <= 30.1265 )
								if( smoothD_d <= 4.29731 )
									ret := -0.014286
								if( smoothD_d > 4.29731 )
									ret := 0.459677
							if( smoothK_k > 30.1265 )
								if( rsi1 <= 22.6148 )
									ret := -1.000000 // sell
								if( rsi1 > 22.6148 )
									ret := 0.151961
						if( VIM > 1.05218 )
							if( rsi1 <= 12.6514 )
								if( rsi1 <= 12.1037 )
									ret := -0.068536
								if( rsi1 > 12.1037 )
									ret := -0.547170
							if( rsi1 > 12.6514 )
								if( VIM <= 1.29422 )
									ret := 0.053242
								if( VIM > 1.29422 )
									ret := 0.158800
					if( VIM > 1.43206 )
						if( d <= 2.19781 )
							if( rsi1 <= 28.9845 )
								if( VIP_VIM <= -0.915552 )
									ret := 0.350877
								if( VIP_VIM > -0.915552 )
									ret := 0.725275 // buy
							if( rsi1 > 28.9845 )
								if( smoothK_k <= -2.1679 )
									ret := 0.250000
								if( smoothK_k > -2.1679 )
									ret := -0.800000 // sell
						if( d > 2.19781 )
							if( rsi1 <= 32.3422 )
								if( VIP <= 0.677129 )
									ret := -0.010638
								if( VIP > 0.677129 )
									ret := 0.286374
							if( rsi1 > 32.3422 )
								if( d_k <= -14.5253 )
									ret := -0.583333
								if( d_k > -14.5253 )
									ret := 0.038760
				if( rsi1 > 41.3668 )
					if( VIP_VIM <= -0.134626 )
						if( smoothD_d <= 58.9922 )
							if( d_k <= 9.26742 )
								if( d_k <= 4.16336 )
									ret := -0.101429
								if( d_k > 4.16336 )
									ret := -0.379464
							if( d_k > 9.26742 )
								if( VIM <= 1.08304 )
									ret := 0.402439
								if( VIM > 1.08304 )
									ret := -0.089655
						if( smoothD_d > 58.9922 )
							if( VIP_VIM <= -0.15269 )
								if( rsi1 <= 43.5679 )
									ret := 0.407407
								if( rsi1 > 43.5679 )
									ret := -0.019231
							if( VIP_VIM > -0.15269 )
								if( smoothD_d <= 73.7716 )
									ret := -0.481481
								if( smoothD_d > 73.7716 )
									ret := 0.230769
					if( VIP_VIM > -0.134626 )
						if( rsi1 <= 47.5708 )
							if( smoothD_d <= 73.9799 )
								if( VIP_VIM <= -0.001094 )
									ret := 0.128978
								if( VIP_VIM > -0.001094 )
									ret := 0.625000
							if( smoothD_d > 73.9799 )
								if( VIM <= 0.97594 )
									ret := 0.000000
								if( VIM > 0.97594 )
									ret := 0.760000 // buy
						if( rsi1 > 47.5708 )
							if( VIP <= 0.911763 )
								if( d_k <= -14.339 )
									ret := 0.000000
								if( d_k > -14.339 )
									ret := -0.809524 // sell
							if( VIP > 0.911763 )
								if( d <= 13.6153 )
									ret := -0.600000
								if( d > 13.6153 )
									ret := 0.098361
			if( smoothK_k > 76.2084 )
				if( VIM <= 0.974584 )
					if( smoothK_k <= 81.5158 )
						ret := -1.000000 // sell
					if( smoothK_k > 81.5158 )
						ret := -0.750000 // sell
				if( VIM > 0.974584 )
					if( VIM <= 1.01553 )
						if( smoothD_d <= 80.2745 )
							if( smoothD_d <= 71.3022 )
								ret := 0.500000
							if( smoothD_d > 71.3022 )
								ret := -0.666667
						if( smoothD_d > 80.2745 )
							if( rsi1 <= 47.2889 )
								if( smoothK_k <= 87.3036 )
									ret := 0.777778 // buy
								if( smoothK_k > 87.3036 )
									ret := 0.250000
							if( rsi1 > 47.2889 )
								ret := 1.000000 // buy
					if( VIM > 1.01553 )
						if( smoothK_k <= 87.6402 )
							if( smoothK_k <= 81.315 )
								if( d <= 55.4674 )
									ret := -0.700000 // sell
								if( d > 55.4674 )
									ret := 0.018657
							if( smoothK_k > 81.315 )
								if( VIM <= 1.27193 )
									ret := -0.392491
								if( VIM > 1.27193 )
									ret := 0.138889
						if( smoothK_k > 87.6402 )
							if( smoothK_k <= 87.7874 )
								ret := 1.000000 // buy
							if( smoothK_k > 87.7874 )
								if( VIP <= 0.877739 )
									ret := -0.223301
								if( VIP > 0.877739 )
									ret := 0.068627
		if( VIP > 0.944892 )
			if( VIP <= 1.32564 )
				if( VIM <= 0.961536 )
					if( k <= 70.5517 )
						if( smoothD_d <= 80.5132 )
							if( smoothD_d <= 64.8375 )
								if( smoothK_k <= 30.3552 )
									ret := 0.428571
								if( smoothK_k > 30.3552 )
									ret := 0.023810
							if( smoothD_d > 64.8375 )
								if( d <= 72.1329 )
									ret := 1.000000 // buy
								if( d > 72.1329 )
									ret := 0.375000
						if( smoothD_d > 80.5132 )
							ret := -1.000000 // sell
					if( k > 70.5517 )
						if( VIP_VIM <= 0.031715 )
							if( VIP <= 0.973958 )
								ret := -0.250000
							if( VIP > 0.973958 )
								ret := 0.250000
						if( VIP_VIM > 0.031715 )
							if( VIP <= 0.99696 )
								if( VIP_VIM <= 0.075514 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.075514 )
									ret := 0.750000 // buy
							if( VIP > 0.99696 )
								if( smoothD_d <= 87.6261 )
									ret := 0.363636
								if( smoothD_d > 87.6261 )
									ret := 0.875000 // buy
				if( VIM > 0.961536 )
					if( d_k <= 19.5546 )
						if( rsi1 <= 19.4799 )
							if( d <= 3.86204 )
								if( d <= 3.59323 )
									ret := 0.222222
								if( d > 3.59323 )
									ret := -0.750000 // sell
							if( d > 3.86204 )
								if( rsi1 <= 13.6694 )
									ret := 0.100000
								if( rsi1 > 13.6694 )
									ret := 0.712121 // buy
						if( rsi1 > 19.4799 )
							if( VIP_VIM <= 0.140245 )
								if( d <= 12.5361 )
									ret := 0.049467
								if( d > 12.5361 )
									ret := 0.119125
							if( VIP_VIM > 0.140245 )
								if( k <= 34.6539 )
									ret := 0.176471
								if( k > 34.6539 )
									ret := 0.674419
					if( d_k > 19.5546 )
						if( rsi1 <= 30.4735 )
							if( smoothK_k <= -0.077451 )
								if( d_k <= 24.1461 )
									ret := 0.500000
								if( d_k > 24.1461 )
									ret := 1.000000 // buy
							if( smoothK_k > -0.077451 )
								if( smoothD_d <= 33.0053 )
									ret := -0.400000
								if( smoothD_d > 33.0053 )
									ret := 0.605263
						if( rsi1 > 30.4735 )
							if( VIP <= 0.945901 )
								if( d <= 45.1611 )
									ret := -1.000000 // sell
								if( d > 45.1611 )
									ret := -0.500000
							if( VIP > 0.945901 )
								if( smoothK_k <= -2.99752 )
									ret := -0.176471
								if( smoothK_k > -2.99752 )
									ret := 0.246154
			if( VIP > 1.32564 )
				if( smoothK_k <= 82.2736 )
					if( rsi1 <= 37.8978 )
						if( k <= 0.142421 )
							if( VIM <= 2.7385 )
								if( d_k <= 17.3623 )
									ret := -0.370690
								if( d_k > 17.3623 )
									ret := 0.333333
							if( VIM > 2.7385 )
								if( d <= 1.01722 )
									ret := -0.187500
								if( d > 1.01722 )
									ret := 0.302326
						if( k > 0.142421 )
							if( smoothD_d <= -1.6529 )
								if( VIP_VIM <= -0.710128 )
									ret := 0.321429
								if( VIP_VIM > -0.710128 )
									ret := 0.758621 // buy
							if( smoothD_d > -1.6529 )
								if( VIP_VIM <= -0.528778 )
									ret := 0.257718
								if( VIP_VIM > -0.528778 )
									ret := 0.022947
					if( rsi1 > 37.8978 )
						if( VIP_VIM <= -1.79103 )
							if( d_k <= 15.3164 )
								ret := -0.714286 // sell
							if( d_k > 15.3164 )
								ret := -1.000000 // sell
						if( VIP_VIM > -1.79103 )
							if( d_k <= 26.1253 )
								if( d_k <= 19.1341 )
									ret := 0.001969
								if( d_k > 19.1341 )
									ret := 0.232955
							if( d_k > 26.1253 )
								if( VIP_VIM <= -0.027547 )
									ret := -0.718750 // sell
								if( VIP_VIM > -0.027547 )
									ret := -0.050000
				if( smoothK_k > 82.2736 )
					if( VIP <= 3.27632 )
						if( rsi1 <= 43.0311 )
							if( VIP <= 2.10135 )
								if( VIP_VIM <= -0.382427 )
									ret := 0.933333 // buy
								if( VIP_VIM > -0.382427 )
									ret := 0.647059
							if( VIP > 2.10135 )
								if( VIP_VIM <= -0.09738 )
									ret := 0.166667
								if( VIP_VIM > -0.09738 )
									ret := 0.800000 // buy
						if( rsi1 > 43.0311 )
							if( VIM <= 1.39981 )
								if( k <= 86.6225 )
									ret := 1.000000 // buy
								if( k > 86.6225 )
									ret := 0.590909
							if( VIM > 1.39981 )
								if( smoothK_k <= 89.6738 )
									ret := 0.430769
								if( smoothK_k > 89.6738 )
									ret := -0.080000
					if( VIP > 3.27632 )
						if( d <= 74.2073 )
							ret := -0.500000
						if( d > 74.2073 )
							if( VIP_VIM <= -0.872926 )
								if( d_k <= -3.35 )
									ret := 0.750000 // buy
								if( d_k > -3.35 )
									ret := 0.000000
							if( VIP_VIM > -0.872926 )
								if( smoothK_k <= 89.1686 )
									ret := -0.250000
								if( smoothK_k > 89.1686 )
									ret := 0.000000
	if( rsi1 > 48.8958 )
		if( d <= 98.0428 )
			if( k <= 59.2349 )
				if( d <= 21.2197 )
					if( VIP <= 0.935484 )
						if( k <= 15.8626 )
							if( smoothD_d <= 10.4115 )
								if( rsi1 <= 49.9413 )
									ret := -0.142857
								if( rsi1 > 49.9413 )
									ret := 0.666667
							if( smoothD_d > 10.4115 )
								ret := -0.833333 // sell
						if( k > 15.8626 )
							if( VIM <= 0.969487 )
								if( smoothD_d <= 11.6098 )
									ret := -0.500000
								if( smoothD_d > 11.6098 )
									ret := -0.952381 // sell
							if( VIM > 0.969487 )
								if( smoothK_k <= 30.6025 )
									ret := -0.176471
								if( smoothK_k > 30.6025 )
									ret := -0.785714 // sell
					if( VIP > 0.935484 )
						if( smoothD_d <= 13.6022 )
							if( smoothD_d <= 9.77363 )
								if( VIP <= 1.2567 )
									ret := 0.117340
								if( VIP > 1.2567 )
									ret := -0.108696
							if( smoothD_d > 9.77363 )
								if( d_k <= -17.6941 )
									ret := -0.440678
								if( d_k > -17.6941 )
									ret := -0.064136
						if( smoothD_d > 13.6022 )
							if( VIM <= 0.84297 )
								if( d_k <= -10.3416 )
									ret := -0.111111
								if( d_k > -10.3416 )
									ret := 0.597015
							if( VIM > 0.84297 )
								if( k <= 23.5701 )
									ret := 0.084942
								if( k > 23.5701 )
									ret := 0.219959
				if( d > 21.2197 )
					if( d <= 23.0019 )
						if( d_k <= 15.0165 )
							if( VIM <= 0.905033 )
								if( rsi1 <= 70.2436 )
									ret := -0.750000 // sell
								if( rsi1 > 70.2436 )
									ret := 0.235294
							if( VIM > 0.905033 )
								if( d <= 21.938 )
									ret := -0.045872
								if( d > 21.938 )
									ret := -0.352601
						if( d_k > 15.0165 )
							if( VIP_VIM <= 0.062285 )
								ret := 0.000000
							if( VIP_VIM > 0.062285 )
								if( rsi1 <= 56.3409 )
									ret := 0.769231 // buy
								if( rsi1 > 56.3409 )
									ret := 0.000000
					if( d > 23.0019 )
						if( VIM <= 0.668227 )
							if( d_k <= -18.0773 )
								ret := -1.000000 // sell
							if( d_k > -18.0773 )
								if( rsi1 <= 78.2174 )
									ret := 0.765957 // buy
								if( rsi1 > 78.2174 )
									ret := 0.120000
						if( VIM > 0.668227 )
							if( VIP <= 1.06737 )
								if( d_k <= -19.1954 )
									ret := -0.465409
								if( d_k > -19.1954 )
									ret := -0.053144
							if( VIP > 1.06737 )
								if( rsi1 <= 63.4586 )
									ret := 0.039561
								if( rsi1 > 63.4586 )
									ret := -0.050181
			if( k > 59.2349 )
				if( VIP_VIM <= 0.718773 )
					if( rsi1 <= 57.1177 )
						if( d <= 50.3283 )
							if( rsi1 <= 53.2557 )
								if( d <= 41.8855 )
									ret := -0.211538
								if( d > 41.8855 )
									ret := 0.379032
							if( rsi1 > 53.2557 )
								if( d_k <= -11.9159 )
									ret := 0.522167
								if( d_k > -11.9159 )
									ret := -0.307692
						if( d > 50.3283 )
							if( d <= 60.113 )
								if( VIP <= 1.1172 )
									ret := 0.054496
								if( VIP > 1.1172 )
									ret := -0.282178
							if( d > 60.113 )
								if( d <= 66.3901 )
									ret := 0.261438
								if( d > 66.3901 )
									ret := 0.068041
					if( rsi1 > 57.1177 )
						if( k <= 88.3192 )
							if( smoothK_k <= 80.1183 )
								if( k <= 76.5378 )
									ret := -0.006111
								if( k > 76.5378 )
									ret := 0.090013
							if( smoothK_k > 80.1183 )
								if( smoothD_d <= 88.2844 )
									ret := -0.059137
								if( smoothD_d > 88.2844 )
									ret := -0.245714
						if( k > 88.3192 )
							if( smoothK_k <= 89.0769 )
								if( VIM <= 1.32706 )
									ret := 0.198902
								if( VIM > 1.32706 )
									ret := -0.065421
							if( smoothK_k > 89.0769 )
								if( smoothD_d <= 93.6528 )
									ret := 0.018087
								if( smoothD_d > 93.6528 )
									ret := 0.135722
				if( VIP_VIM > 0.718773 )
					if( rsi1 <= 80.7544 )
						if( k <= 98.4837 )
							if( rsi1 <= 72.3318 )
								if( smoothK_k <= 63.2966 )
									ret := 0.283784
								if( smoothK_k > 63.2966 )
									ret := -0.068053
							if( rsi1 > 72.3318 )
								if( smoothD_d <= 92.9855 )
									ret := -0.308163
								if( smoothD_d > 92.9855 )
									ret := 0.192308
						if( k > 98.4837 )
							if( VIP_VIM <= 0.747454 )
								ret := 0.857143 // buy
							if( VIP_VIM > 0.747454 )
								if( d <= 94.2328 )
									ret := 0.333333
								if( d > 94.2328 )
									ret := 0.000000
					if( rsi1 > 80.7544 )
						if( VIP_VIM <= 0.839706 )
							if( k <= 96.654 )
								if( d_k <= 0.612895 )
									ret := -0.152381
								if( d_k > 0.612895 )
									ret := 0.270677
							if( k > 96.654 )
								if( smoothD_d <= 93.895 )
									ret := -0.680000
								if( smoothD_d > 93.895 )
									ret := -0.236842
						if( VIP_VIM > 0.839706 )
							if( VIP <= 1.54488 )
								if( k <= 99.9733 )
									ret := 0.469231
								if( k > 99.9733 )
									ret := -0.222222
							if( VIP > 1.54488 )
								if( d <= 89.887 )
									ret := -0.100840
								if( d > 89.887 )
									ret := 0.241379
		if( d > 98.0428 )
			if( rsi1 <= 57.7339 )
				if( k <= 97.9447 )
					if( smoothD_d <= 95.3677 )
						if( d <= 98.192 )
							if( VIM <= 1.16511 )
								if( rsi1 <= 54.812 )
									ret := 0.750000 // buy
								if( rsi1 > 54.812 )
									ret := 0.000000
							if( VIM > 1.16511 )
								ret := -0.750000 // sell
						if( d > 98.192 )
							if( rsi1 <= 56.3536 )
								if( smoothD_d <= 95.2862 )
									ret := -0.777778 // sell
								if( smoothD_d > 95.2862 )
									ret := -1.000000 // sell
							if( rsi1 > 56.3536 )
								ret := 0.000000
					if( smoothD_d > 95.3677 )
						if( smoothK_k <= 93.372 )
							if( smoothK_k <= 92.923 )
								ret := 0.285714
							if( smoothK_k > 92.923 )
								if( VIP_VIM <= 0.082012 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.082012 )
									ret := 1.000000 // buy
						if( smoothK_k > 93.372 )
							if( VIP <= 1.48303 )
								if( VIP <= 1.04637 )
									ret := 0.200000
								if( VIP > 1.04637 )
									ret := -0.416667
							if( VIP > 1.48303 )
								ret := -1.000000 // sell
				if( k > 97.9447 )
					if( rsi1 <= 51.1078 )
						if( VIP <= 1.00373 )
							if( VIP_VIM <= -0.052895 )
								ret := 0.000000
							if( VIP_VIM > -0.052895 )
								ret := 0.833333 // buy
						if( VIP > 1.00373 )
							if( k <= 99.5108 )
								ret := -1.000000 // sell
							if( k > 99.5108 )
								if( VIP_VIM <= -0.018951 )
									ret := 0.000000
								if( VIP_VIM > -0.018951 )
									ret := -0.833333 // sell
					if( rsi1 > 51.1078 )
						if( smoothK_k <= 96.9983 )
							if( smoothK_k <= 96.7759 )
								if( VIM <= 0.968394 )
									ret := 0.181818
								if( VIM > 0.968394 )
									ret := 0.725490 // buy
							if( smoothK_k > 96.7759 )
								ret := 1.000000 // buy
						if( smoothK_k > 96.9983 )
							if( VIP_VIM <= -0.032234 )
								ret := -0.200000
							if( VIP_VIM > -0.032234 )
								if( VIM <= 0.97722 )
									ret := 0.680000
								if( VIM > 0.97722 )
									ret := 0.133333
			if( rsi1 > 57.7339 )
				if( VIP <= 1.05835 )
					if( smoothD_d <= 96.4909 )
						if( rsi1 <= 59.0374 )
							ret := -1.000000 // sell
						if( rsi1 > 59.0374 )
							if( rsi1 <= 61.9303 )
								ret := -0.200000
							if( rsi1 > 61.9303 )
								if( smoothD_d <= 95.7856 )
									ret := -0.750000 // sell
								if( smoothD_d > 95.7856 )
									ret := -1.000000 // sell
					if( smoothD_d > 96.4909 )
						if( smoothD_d <= 96.6742 )
							ret := 0.600000
						if( smoothD_d > 96.6742 )
							if( d <= 99.9793 )
								ret := -0.800000 // sell
							if( d > 99.9793 )
								ret := 0.000000
				if( VIP > 1.05835 )
					if( d_k <= 0.463843 )
						if( VIP_VIM <= 0.40533 )
							if( smoothK_k <= 95.9196 )
								if( VIP <= 1.11189 )
									ret := 0.090909
								if( VIP > 1.11189 )
									ret := -0.602941
							if( smoothK_k > 95.9196 )
								if( rsi1 <= 80.3842 )
									ret := -0.127660
								if( rsi1 > 80.3842 )
									ret := -0.739130 // sell
						if( VIP_VIM > 0.40533 )
							if( d_k <= 0.115202 )
								if( d_k <= -1.70957 )
									ret := -0.535714
								if( d_k > -1.70957 )
									ret := 0.007389
							if( d_k > 0.115202 )
								if( VIM <= 0.946597 )
									ret := -0.340580
								if( VIM > 0.946597 )
									ret := 0.190476
					if( d_k > 0.463843 )
						if( d <= 98.7123 )
							if( VIP <= 1.26331 )
								if( VIM <= 0.938084 )
									ret := 0.000000
								if( VIM > 0.938084 )
									ret := 0.888889 // buy
							if( VIP > 1.26331 )
								if( VIP <= 1.31107 )
									ret := -0.644444
								if( VIP > 1.31107 )
									ret := -0.156716
						if( d > 98.7123 )
							if( rsi1 <= 62.4466 )
								if( smoothK_k <= 94.3199 )
									ret := -0.250000
								if( smoothK_k > 94.3199 )
									ret := 0.848485 // buy
							if( rsi1 > 62.4466 )
								if( rsi1 <= 73.2964 )
									ret := -0.100000
								if( rsi1 > 73.2964 )
									ret := 0.218391
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MSFT_5Min_47506ab7(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


