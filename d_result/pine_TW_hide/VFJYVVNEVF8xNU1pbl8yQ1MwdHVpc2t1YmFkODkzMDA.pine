//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: TRXUSDT_15Min_2CS0_bad89300 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2CS0_bad89300", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_bad89300(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 47.7483 )
		if( smoothD_d <= 15.9147 )
			if( rsi1 <= 39.651 )
				if( smoothK_k <= 8.61599 )
					if( ad_mf <= -3.25582e+06 )
						if( rsi1 <= 26.2148 )
							if( smoothD_d <= 3.88071 )
								if( ad <= -1.66509e+08 )
									ret := 1.000000 // buy
								if( ad > -1.66509e+08 )
									ret := -0.545538
							if( smoothD_d > 3.88071 )
								if( smoothK_k <= -1.25398 )
									ret := 0.175000
								if( smoothK_k > -1.25398 )
									ret := -0.350543
						if( rsi1 > 26.2148 )
							if( k <= 0.196081 )
								if( ad <= -2.1133e+07 )
									ret := -0.541667
								if( ad > -2.1133e+07 )
									ret := 0.193548
							if( k > 0.196081 )
								if( smoothD_d <= 3.00065 )
									ret := -0.323256
								if( smoothD_d > 3.00065 )
									ret := -0.096626
					if( ad_mf > -3.25582e+06 )
						if( rsi1 <= 18.8517 )
							if( d <= 2.03749 )
								if( d <= 0.714671 )
									ret := -0.580460
								if( d > 0.714671 )
									ret := -0.794366 // sell
							if( d > 2.03749 )
								if( d <= 2.1792 )
									ret := -0.138889
								if( d > 2.1792 )
									ret := -0.599776
						if( rsi1 > 18.8517 )
							if( ad <= 6.2336e+06 )
								if( k <= 0.000174 )
									ret := -0.320356
								if( k > 0.000174 )
									ret := -0.485175
							if( ad > 6.2336e+06 )
								if( mf <= -0.099258 )
									ret := 0.180180
								if( mf > -0.099258 )
									ret := -0.314721
				if( smoothK_k > 8.61599 )
					if( ad <= 3.94725e+06 )
						if( ad_mf <= -1.37159e+07 )
							if( k <= 22.3429 )
								if( rsi1 <= 20.718 )
									ret := -0.391304
								if( rsi1 > 20.718 )
									ret := 0.047619
							if( k > 22.3429 )
								if( ad <= -3.93368e+07 )
									ret := 0.076923
								if( ad > -3.93368e+07 )
									ret := 0.857143 // buy
						if( ad_mf > -1.37159e+07 )
							if( rsi1 <= 25.6787 )
								if( mf <= -0.162528 )
									ret := -0.450085
								if( mf > -0.162528 )
									ret := -0.599057
							if( rsi1 > 25.6787 )
								if( mf <= -0.132149 )
									ret := -0.034060
								if( mf > -0.132149 )
									ret := -0.404346
					if( ad > 3.94725e+06 )
						if( d_k <= 0.731204 )
							if( d <= 16.4897 )
								if( rsi1 <= 15.4464 )
									ret := -1.000000 // sell
								if( rsi1 > 15.4464 )
									ret := 0.015291
							if( d > 16.4897 )
								if( smoothK_k <= 20.0784 )
									ret := -0.888889 // sell
								if( smoothK_k > 20.0784 )
									ret := -0.375000
						if( d_k > 0.731204 )
							if( ad_mf <= 5.855e+06 )
								if( ad_mf <= 4.68278e+06 )
									ret := 1.000000 // buy
								if( ad_mf > 4.68278e+06 )
									ret := 0.454545
							if( ad_mf > 5.855e+06 )
								ret := -0.263158
			if( rsi1 > 39.651 )
				if( ad_mf <= 926700 )
					if( ad_mf <= -2.61607e+07 )
						if( ad <= -4.56418e+07 )
							if( smoothD_d <= 11.9401 )
								ret := -1.000000 // sell
							if( smoothD_d > 11.9401 )
								ret := -0.900000 // sell
						if( ad > -4.56418e+07 )
							if( mf <= -0.106462 )
								if( d_k <= -0.129226 )
									ret := -0.625000
								if( d_k > -0.129226 )
									ret := 0.750000 // buy
							if( mf > -0.106462 )
								if( d_k <= 3.51475 )
									ret := -0.842105 // sell
								if( d_k > 3.51475 )
									ret := -0.111111
					if( ad_mf > -2.61607e+07 )
						if( d_k <= 0.86972 )
							if( ad <= -4.27058e+06 )
								if( ad <= -5.00866e+06 )
									ret := -0.258160
								if( ad > -5.00866e+06 )
									ret := -0.590361
							if( ad > -4.27058e+06 )
								if( ad <= -2.92056e+06 )
									ret := 0.067227
								if( ad > -2.92056e+06 )
									ret := -0.172161
						if( d_k > 0.86972 )
							if( mf <= 0.039025 )
								if( ad_mf <= 841320 )
									ret := 0.019582
								if( ad_mf > 841320 )
									ret := 0.933333 // buy
							if( mf > 0.039025 )
								if( k <= 14.3624 )
									ret := -0.153132
								if( k > 14.3624 )
									ret := 0.144928
				if( ad_mf > 926700 )
					if( d_k <= -0.662537 )
						if( smoothK_k <= 19.4046 )
							if( smoothK_k <= 19.1987 )
								if( mf <= -0.050942 )
									ret := 0.007692
								if( mf > -0.050942 )
									ret := -0.307745
							if( smoothK_k > 19.1987 )
								ret := -0.833333 // sell
						if( smoothK_k > 19.4046 )
							if( ad <= 1.73063e+07 )
								if( mf <= 0.065976 )
									ret := 0.095041
								if( mf > 0.065976 )
									ret := -0.180147
							if( ad > 1.73063e+07 )
								if( mf <= 0.198517 )
									ret := -0.866667 // sell
								if( mf > 0.198517 )
									ret := 0.111111
					if( d_k > -0.662537 )
						if( rsi1 <= 49.493 )
							if( d_k <= 0.660588 )
								if( ad <= 1.77759e+06 )
									ret := -0.490741
								if( ad > 1.77759e+06 )
									ret := -0.711957 // sell
							if( d_k > 0.660588 )
								if( ad <= 7.50285e+06 )
									ret := -0.425121
								if( ad > 7.50285e+06 )
									ret := -0.844828 // sell
						if( rsi1 > 49.493 )
							if( mf <= -0.083456 )
								ret := 0.500000
							if( mf > -0.083456 )
								if( ad_mf <= 3.71984e+06 )
									ret := -0.203540
								if( ad_mf > 3.71984e+06 )
									ret := -0.565934
		if( smoothD_d > 15.9147 )
			if( d_k <= 3.23586 )
				if( rsi1 <= 48.3809 )
					if( ad <= -2.03944e+06 )
						if( ad_mf <= -2.30135e+06 )
							if( rsi1 <= 35.6903 )
								if( k <= 26.1139 )
									ret := -0.084906
								if( k > 26.1139 )
									ret := -0.279811
							if( rsi1 > 35.6903 )
								if( ad <= -3.37501e+06 )
									ret := 0.141084
								if( ad > -3.37501e+06 )
									ret := -0.064777
						if( ad_mf > -2.30135e+06 )
							if( mf <= 0.164212 )
								if( rsi1 <= 30.9506 )
									ret := -0.204545
								if( rsi1 > 30.9506 )
									ret := 0.321101
							if( mf > 0.164212 )
								ret := -0.769231 // sell
					if( ad > -2.03944e+06 )
						if( mf <= 0.116752 )
							if( d <= 48.8381 )
								if( rsi1 <= 39.7252 )
									ret := -0.220269
								if( rsi1 > 39.7252 )
									ret := -0.028468
							if( d > 48.8381 )
								if( d_k <= 2.5411 )
									ret := -0.133333
								if( d_k > 2.5411 )
									ret := -0.933333 // sell
						if( mf > 0.116752 )
							if( d <= 43.9996 )
								if( d_k <= 3.11221 )
									ret := -0.449024
								if( d_k > 3.11221 )
									ret := 0.636364
							if( d > 43.9996 )
								if( mf <= 0.24083 )
									ret := 0.230769
								if( mf > 0.24083 )
									ret := -0.500000
				if( rsi1 > 48.3809 )
					if( d <= 30.0196 )
						if( d_k <= -20.4618 )
							if( d_k <= -21.1706 )
								if( d_k <= -24.6152 )
									ret := -0.388889
								if( d_k > -24.6152 )
									ret := -0.037037
							if( d_k > -21.1706 )
								if( rsi1 <= 62.2245 )
									ret := -0.333333
								if( rsi1 > 62.2245 )
									ret := -0.909091 // sell
						if( d_k > -20.4618 )
							if( ad_mf <= 3.40111e+06 )
								if( ad_mf <= -8.94307e+06 )
									ret := -0.590909
								if( ad_mf > -8.94307e+06 )
									ret := 0.141165
							if( ad_mf > 3.40111e+06 )
								if( smoothD_d <= 26.4464 )
									ret := -0.187354
								if( smoothD_d > 26.4464 )
									ret := -0.931034 // sell
					if( d > 30.0196 )
						if( mf <= 0.171648 )
							if( d <= 30.9096 )
								if( ad <= -701598 )
									ret := 0.711538 // buy
								if( ad > -701598 )
									ret := 0.309735
							if( d > 30.9096 )
								if( smoothD_d <= 29.4412 )
									ret := 0.027668
								if( smoothD_d > 29.4412 )
									ret := 0.217391
						if( mf > 0.171648 )
							if( mf <= 0.241586 )
								if( d_k <= -0.907639 )
									ret := 0.078431
								if( d_k > -0.907639 )
									ret := -0.222222
							if( mf > 0.241586 )
								if( ad <= 1.10747e+06 )
									ret := 0.346341
								if( ad > 1.10747e+06 )
									ret := 0.033175
			if( d_k > 3.23586 )
				if( smoothK_k <= 24.6422 )
					if( rsi1 <= 48.1313 )
						if( rsi1 <= 36.219 )
							if( ad <= -1.28472e+06 )
								if( d <= 20.5727 )
									ret := -0.579439
								if( d > 20.5727 )
									ret := -0.288248
							if( ad > -1.28472e+06 )
								if( k <= 20.4468 )
									ret := -0.559573
								if( k > 20.4468 )
									ret := -0.381471
						if( rsi1 > 36.219 )
							if( ad <= -1.40129e+06 )
								if( smoothD_d <= 38.5149 )
									ret := -0.049856
								if( smoothD_d > 38.5149 )
									ret := -0.420168
							if( ad > -1.40129e+06 )
								if( smoothK_k <= 20.8655 )
									ret := -0.349524
								if( smoothK_k > 20.8655 )
									ret := -0.517895
					if( rsi1 > 48.1313 )
						if( mf <= 0.032664 )
							if( ad_mf <= -7.97238e+06 )
								if( rsi1 <= 50.8338 )
									ret := 0.076923
								if( rsi1 > 50.8338 )
									ret := -0.820000 // sell
							if( ad_mf > -7.97238e+06 )
								if( rsi1 <= 58.4244 )
									ret := 0.057866
								if( rsi1 > 58.4244 )
									ret := 0.609756
						if( mf > 0.032664 )
							if( d_k <= 7.80949 )
								if( ad_mf <= 4.62776e+06 )
									ret := -0.140127
								if( ad_mf > 4.62776e+06 )
									ret := -0.734375 // sell
							if( d_k > 7.80949 )
								if( ad <= 1.65395e+06 )
									ret := -0.001435
								if( ad > 1.65395e+06 )
									ret := -0.217195
				if( smoothK_k > 24.6422 )
					if( smoothK_k <= 24.7187 )
						ret := 0.636364
					if( smoothK_k > 24.7187 )
						if( rsi1 <= 43.7177 )
							if( mf <= 0.001245 )
								if( ad_mf <= -1.80804e+06 )
									ret := -0.058065
								if( ad_mf > -1.80804e+06 )
									ret := -0.423664
							if( mf > 0.001245 )
								if( ad_mf <= -3.90179e+06 )
									ret := 0.089109
								if( ad_mf > -3.90179e+06 )
									ret := -0.475410
						if( rsi1 > 43.7177 )
							if( rsi1 <= 68.7834 )
								if( ad_mf <= 294661 )
									ret := 0.027149
								if( ad_mf > 294661 )
									ret := -0.210154
							if( rsi1 > 68.7834 )
								if( d_k <= 12.0797 )
									ret := 0.129032
								if( d_k > 12.0797 )
									ret := 0.364929
	if( k > 47.7483 )
		if( rsi1 <= 57.4894 )
			if( ad <= 53293.4 )
				if( k <= 74.2662 )
					if( d_k <= -1.55163 )
						if( mf <= 0.18121 )
							if( mf <= -0.073271 )
								if( rsi1 <= 25.5377 )
									ret := -0.425532
								if( rsi1 > 25.5377 )
									ret := 0.218213
							if( mf > -0.073271 )
								if( ad_mf <= -804765 )
									ret := 0.133230
								if( ad_mf > -804765 )
									ret := -0.017886
						if( mf > 0.18121 )
							if( rsi1 <= 55.3123 )
								if( d_k <= -7.38776 )
									ret := -0.437500
								if( d_k > -7.38776 )
									ret := 0.189189
							if( rsi1 > 55.3123 )
								if( ad_mf <= -2.48423e+06 )
									ret := -0.933333 // sell
								if( ad_mf > -2.48423e+06 )
									ret := -0.400000
					if( d_k > -1.55163 )
						if( k <= 61.9863 )
							if( rsi1 <= 29.6682 )
								if( d_k <= 15.8851 )
									ret := -0.780702 // sell
								if( d_k > 15.8851 )
									ret := 0.200000
							if( rsi1 > 29.6682 )
								if( rsi1 <= 48.01 )
									ret := -0.095382
								if( rsi1 > 48.01 )
									ret := 0.105939
						if( k > 61.9863 )
							if( rsi1 <= 32.4206 )
								if( ad_mf <= -5.78073e+06 )
									ret := -0.805556 // sell
								if( ad_mf > -5.78073e+06 )
									ret := -0.275862
							if( rsi1 > 32.4206 )
								if( k <= 62.3063 )
									ret := 0.596774
								if( k > 62.3063 )
									ret := 0.087032
				if( k > 74.2662 )
					if( mf <= -0.123193 )
						if( rsi1 <= 41.6877 )
							if( k <= 92.8351 )
								if( d_k <= -4.24405 )
									ret := 0.227891
								if( d_k > -4.24405 )
									ret := -0.036364
							if( k > 92.8351 )
								if( ad_mf <= -1.35262e+06 )
									ret := 0.461538
								if( ad_mf > -1.35262e+06 )
									ret := 0.000000
						if( rsi1 > 41.6877 )
							if( ad <= -3.85534e+06 )
								if( k <= 93.655 )
									ret := 0.434010
								if( k > 93.655 )
									ret := 0.779661 // buy
							if( ad > -3.85534e+06 )
								if( d_k <= 12.1029 )
									ret := 0.338940
								if( d_k > 12.1029 )
									ret := -0.400000
					if( mf > -0.123193 )
						if( ad <= -7.05636e+06 )
							if( ad <= -2.71409e+07 )
								if( smoothK_k <= 84.3874 )
									ret := 0.360000
								if( smoothK_k > 84.3874 )
									ret := 0.928571 // buy
							if( ad > -2.71409e+07 )
								if( k <= 87.8561 )
									ret := -0.269231
								if( k > 87.8561 )
									ret := -0.693878
						if( ad > -7.05636e+06 )
							if( rsi1 <= 42.6141 )
								if( rsi1 <= 33.7408 )
									ret := -0.370370
								if( rsi1 > 33.7408 )
									ret := 0.021672
							if( rsi1 > 42.6141 )
								if( d_k <= -10.294 )
									ret := 0.096241
								if( d_k > -10.294 )
									ret := 0.262319
			if( ad > 53293.4 )
				if( rsi1 <= 47.018 )
					if( k <= 82.6265 )
						if( d_k <= -1.62016 )
							if( ad <= 1.66676e+07 )
								if( k <= 82.2581 )
									ret := -0.146937
								if( k > 82.2581 )
									ret := -0.812500 // sell
							if( ad > 1.66676e+07 )
								if( mf <= -0.205928 )
									ret := 0.634146
								if( mf > -0.205928 )
									ret := 0.196970
						if( d_k > -1.62016 )
							if( ad <= 7.77316e+06 )
								if( ad_mf <= 6.04001e+06 )
									ret := -0.258150
								if( ad_mf > 6.04001e+06 )
									ret := -0.880952 // sell
							if( ad > 7.77316e+06 )
								if( smoothK_k <= 58.4932 )
									ret := -0.208333
								if( smoothK_k > 58.4932 )
									ret := 0.460674
					if( k > 82.6265 )
						if( rsi1 <= 29.3304 )
							if( k <= 96.668 )
								if( mf <= -0.316113 )
									ret := -0.269231
								if( mf > -0.316113 )
									ret := -0.885714 // sell
							if( k > 96.668 )
								ret := 0.111111
						if( rsi1 > 29.3304 )
							if( smoothK_k <= 82.608 )
								if( mf <= -0.179432 )
									ret := 0.530612
								if( mf > -0.179432 )
									ret := 0.163462
							if( smoothK_k > 82.608 )
								if( smoothD_d <= 94.0735 )
									ret := -0.037396
								if( smoothD_d > 94.0735 )
									ret := 0.298851
				if( rsi1 > 47.018 )
					if( smoothK_k <= 67.9511 )
						if( mf <= 0.224977 )
							if( d_k <= 1.05566 )
								if( smoothK_k <= 67.2904 )
									ret := 0.072993
								if( smoothK_k > 67.2904 )
									ret := -0.316667
							if( d_k > 1.05566 )
								if( mf <= -0.217912 )
									ret := 0.558824
								if( mf > -0.217912 )
									ret := -0.050267
						if( mf > 0.224977 )
							if( smoothD_d <= 67.0806 )
								if( d <= 68.64 )
									ret := -0.325581
								if( d > 68.64 )
									ret := -0.916667 // sell
							if( smoothD_d > 67.0806 )
								if( d <= 71.6615 )
									ret := 0.454545
								if( d > 71.6615 )
									ret := -0.084746
					if( smoothK_k > 67.9511 )
						if( ad_mf <= 1.37229e+07 )
							if( rsi1 <= 50.2113 )
								if( k <= 96.6063 )
									ret := 0.025232
								if( k > 96.6063 )
									ret := 0.303279
							if( rsi1 > 50.2113 )
								if( ad_mf <= 8.36335e+06 )
									ret := 0.173978
								if( ad_mf > 8.36335e+06 )
									ret := -0.257732
						if( ad_mf > 1.37229e+07 )
							if( mf <= 0.035984 )
								if( ad_mf <= 2.63991e+07 )
									ret := 0.837838 // buy
								if( ad_mf > 2.63991e+07 )
									ret := 0.283019
							if( mf > 0.035984 )
								if( ad <= 1.85192e+07 )
									ret := 0.333333
								if( ad > 1.85192e+07 )
									ret := -0.866667 // sell
		if( rsi1 > 57.4894 )
			if( rsi1 <= 70.3483 )
				if( k <= 79.1264 )
					if( mf <= 0.24688 )
						if( d_k <= 1.4848 )
							if( ad_mf <= 2.37851e+06 )
								if( ad <= -5.80289e+06 )
									ret := -0.040541
								if( ad > -5.80289e+06 )
									ret := 0.382116
							if( ad_mf > 2.37851e+06 )
								if( rsi1 <= 70.0203 )
									ret := 0.089844
								if( rsi1 > 70.0203 )
									ret := -0.714286 // sell
						if( d_k > 1.4848 )
							if( ad_mf <= 2.65132e+06 )
								if( ad_mf <= -5.31985e+06 )
									ret := 0.002762
								if( ad_mf > -5.31985e+06 )
									ret := 0.255943
							if( ad_mf > 2.65132e+06 )
								if( ad <= 8.29907e+06 )
									ret := 0.014953
								if( ad > 8.29907e+06 )
									ret := -0.295775
					if( mf > 0.24688 )
						if( k <= 48.0256 )
							ret := 0.812500 // buy
						if( k > 48.0256 )
							if( ad <= -6.46896e+06 )
								ret := -0.958333 // sell
							if( ad > -6.46896e+06 )
								if( mf <= 0.247753 )
									ret := -0.750000 // sell
								if( mf > 0.247753 )
									ret := 0.054589
				if( k > 79.1264 )
					if( ad <= -8.09218e+06 )
						if( mf <= 0.095932 )
							if( ad <= -6.77173e+07 )
								ret := -0.800000 // sell
							if( ad > -6.77173e+07 )
								if( ad_mf <= -4.35809e+07 )
									ret := 0.500000
								if( ad_mf > -4.35809e+07 )
									ret := -0.033816
						if( mf > 0.095932 )
							if( rsi1 <= 67.3711 )
								if( ad_mf <= -1.78919e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -1.78919e+07 )
									ret := -0.419355
							if( rsi1 > 67.3711 )
								ret := 0.384615
					if( ad > -8.09218e+06 )
						if( mf <= 0.096953 )
							if( ad_mf <= 1.65064e+06 )
								if( smoothD_d <= 82.2607 )
									ret := 0.473047
								if( smoothD_d > 82.2607 )
									ret := 0.392442
							if( ad_mf > 1.65064e+06 )
								if( d_k <= -15.6784 )
									ret := 0.000000
								if( d_k > -15.6784 )
									ret := 0.308015
						if( mf > 0.096953 )
							if( d_k <= 2.80124 )
								if( d_k <= 1.94348 )
									ret := 0.209882
								if( d_k > 1.94348 )
									ret := -0.096386
							if( d_k > 2.80124 )
								if( smoothK_k <= 88.2898 )
									ret := 0.273529
								if( smoothK_k > 88.2898 )
									ret := 0.589041
			if( rsi1 > 70.3483 )
				if( ad <= 5.98482e+06 )
					if( ad <= -6.54888e+06 )
						if( ad_mf <= -4.01208e+07 )
							if( d <= 84.2658 )
								ret := -0.400000
							if( d > 84.2658 )
								if( rsi1 <= 73.3144 )
									ret := 0.000000
								if( rsi1 > 73.3144 )
									ret := 0.849057 // buy
						if( ad_mf > -4.01208e+07 )
							if( d_k <= 0.17078 )
								if( rsi1 <= 74.4374 )
									ret := 0.648148
								if( rsi1 > 74.4374 )
									ret := 0.164179
							if( d_k > 0.17078 )
								if( smoothD_d <= 67.5112 )
									ret := 0.454545
								if( smoothD_d > 67.5112 )
									ret := -0.262626
					if( ad > -6.54888e+06 )
						if( ad_mf <= 326764 )
							if( mf <= 0.017222 )
								if( d_k <= 7.26645 )
									ret := 0.640893
								if( d_k > 7.26645 )
									ret := 0.000000
							if( mf > 0.017222 )
								if( ad <= -1.5036e+06 )
									ret := 0.430028
								if( ad > -1.5036e+06 )
									ret := 0.552723
						if( ad_mf > 326764 )
							if( d <= 87.4053 )
								if( ad_mf <= 2.91838e+06 )
									ret := 0.436637
								if( ad_mf > 2.91838e+06 )
									ret := 0.221498
							if( d > 87.4053 )
								if( ad_mf <= 344342 )
									ret := -0.200000
								if( ad_mf > 344342 )
									ret := 0.505034
				if( ad > 5.98482e+06 )
					if( k <= 85.2081 )
						if( mf <= 0.109397 )
							if( d_k <= -3.79538 )
								if( smoothD_d <= 48.9265 )
									ret := -0.333333
								if( smoothD_d > 48.9265 )
									ret := 0.523810
							if( d_k > -3.79538 )
								if( ad_mf <= 1.96029e+07 )
									ret := -0.216216
								if( ad_mf > 1.96029e+07 )
									ret := -0.909091 // sell
						if( mf > 0.109397 )
							if( ad_mf <= 7.02337e+06 )
								if( ad_mf <= 6.75542e+06 )
									ret := -0.113208
								if( ad_mf > 6.75542e+06 )
									ret := -0.727273 // sell
							if( ad_mf > 7.02337e+06 )
								if( d <= 87.0198 )
									ret := 0.125290
								if( d > 87.0198 )
									ret := 0.714286 // buy
					if( k > 85.2081 )
						if( d_k <= -9.75156 )
							if( mf <= 0.11096 )
								if( smoothD_d <= 73.9904 )
									ret := 0.750000 // buy
								if( smoothD_d > 73.9904 )
									ret := 0.055556
							if( mf > 0.11096 )
								if( d_k <= -21.3595 )
									ret := -0.894737 // sell
								if( d_k > -21.3595 )
									ret := -0.215686
						if( d_k > -9.75156 )
							if( k <= 97.9667 )
								if( mf <= 0.250702 )
									ret := 0.204420
								if( mf > 0.250702 )
									ret := 0.458498
							if( k > 97.9667 )
								if( d <= 98.903 )
									ret := 0.717949 // buy
								if( d > 98.903 )
									ret := 0.297297
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TRXUSDT_15Min_bad89300(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


