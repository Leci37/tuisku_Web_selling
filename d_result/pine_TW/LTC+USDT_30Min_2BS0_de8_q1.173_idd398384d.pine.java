//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LTCUSDT_30Min_2BS0_d398384d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_2BS0_d398384d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_d398384d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 51.7866 )
		if( d_k <= -2.03645 )
			if( bbp <= -1.36429 )
				if( k <= 15.9894 )
					if( rsi1 <= 34.6737 )
						if( rsi1 <= 17.872 )
							if( rsi1 <= 11.8879 )
								if( rsi1 <= 10.2181 )
									ret := 0.000000
								if( rsi1 > 10.2181 )
									ret := -0.375000
							if( rsi1 > 11.8879 )
								if( smoothK_k <= 9.00536 )
									ret := -0.766667 // sell
								if( smoothK_k > 9.00536 )
									ret := -0.428571
						if( rsi1 > 17.872 )
							if( k <= 8.66968 )
								if( d_k <= -3.71855 )
									ret := -0.652174
								if( d_k > -3.71855 )
									ret := -0.292553
							if( k > 8.66968 )
								if( bbp <= -4.23654 )
									ret := 0.122172
								if( bbp > -4.23654 )
									ret := -0.246212
					if( rsi1 > 34.6737 )
						if( smoothD_d <= 0.212163 )
							if( bbm <= 5.49575 )
								if( d_k <= -4.04408 )
									ret := -0.111111
								if( d_k > -4.04408 )
									ret := -0.857143 // sell
							if( bbm > 5.49575 )
								if( bearPower <= -6.25885 )
									ret := 1.000000 // buy
								if( bearPower > -6.25885 )
									ret := 0.500000
						if( smoothD_d > 0.212163 )
							if( bullPower <= -0.005911 )
								if( bbp <= -11.8887 )
									ret := 0.937500 // buy
								if( bbp > -11.8887 )
									ret := 0.454277
							if( bullPower > -0.005911 )
								if( bbp <= -3.99022 )
									ret := 1.000000 // buy
								if( bbp > -3.99022 )
									ret := -0.321429
				if( k > 15.9894 )
					if( rsi1 <= 36.3055 )
						if( bullPower <= -0.996041 )
							if( d_k <= -13.6262 )
								if( bearPower <= -3.27077 )
									ret := 0.711382 // buy
								if( bearPower > -3.27077 )
									ret := 0.260563
							if( d_k > -13.6262 )
								if( rsi1 <= 18.2601 )
									ret := -0.657143
								if( rsi1 > 18.2601 )
									ret := 0.156446
						if( bullPower > -0.996041 )
							if( rsi1 <= 34.2834 )
								if( d <= 68.2177 )
									ret := -0.187761
								if( d > 68.2177 )
									ret := -0.696078
							if( rsi1 > 34.2834 )
								if( bullPower <= -0.525657 )
									ret := 0.328859
								if( bullPower > -0.525657 )
									ret := -0.206667
					if( rsi1 > 36.3055 )
						if( bullPower <= -0.505147 )
							if( bearPower <= -4.84313 )
								if( d <= 9.05725 )
									ret := 0.277778
								if( d > 9.05725 )
									ret := 0.808594 // buy
							if( bearPower > -4.84313 )
								if( rsi1 <= 41.0739 )
									ret := 0.474315
								if( rsi1 > 41.0739 )
									ret := 0.718436 // buy
						if( bullPower > -0.505147 )
							if( rsi1 <= 43.0366 )
								if( k <= 38.6934 )
									ret := 0.409894
								if( k > 38.6934 )
									ret := 0.063613
							if( rsi1 > 43.0366 )
								if( rsi1 <= 46.7387 )
									ret := 0.511161
								if( rsi1 > 46.7387 )
									ret := 0.700165 // buy
			if( bbp > -1.36429 )
				if( rsi1 <= 38.3065 )
					if( bbm <= 0.500062 )
						if( smoothD_d <= 26.9341 )
							if( rsi1 <= 32.5338 )
								if( rsi1 <= 26.1402 )
									ret := -0.609137
								if( rsi1 > 26.1402 )
									ret := -0.437500
							if( rsi1 > 32.5338 )
								if( bbp <= -0.224926 )
									ret := -0.163793
								if( bbp > -0.224926 )
									ret := -0.454955
						if( smoothD_d > 26.9341 )
							if( rsi1 <= 32.536 )
								if( bullPower <= -0.205665 )
									ret := -0.089286
								if( bullPower > -0.205665 )
									ret := -0.420290
							if( rsi1 > 32.536 )
								if( bbp <= -1.29668 )
									ret := 0.500000
								if( bbp > -1.29668 )
									ret := -0.095023
					if( bbm > 0.500062 )
						if( bullPower <= 0.060913 )
							if( bullPower <= -0.247102 )
								if( rsi1 <= 35.2343 )
									ret := -0.347222
								if( rsi1 > 35.2343 )
									ret := 0.379310
							if( bullPower > -0.247102 )
								if( rsi1 <= 30.0985 )
									ret := -0.744186 // sell
								if( rsi1 > 30.0985 )
									ret := -0.326347
						if( bullPower > 0.060913 )
							if( d_k <= -3.96649 )
								if( d <= 18.9177 )
									ret := -0.860000 // sell
								if( d > 18.9177 )
									ret := -0.687500
							if( d_k > -3.96649 )
								if( bearPower <= -1.14167 )
									ret := -0.307692
								if( bearPower > -1.14167 )
									ret := -0.671429
				if( rsi1 > 38.3065 )
					if( bullPower <= 0.003703 )
						if( rsi1 <= 42.1213 )
							if( bbp <= -0.858226 )
								if( smoothD_d <= 37.7136 )
									ret := 0.200980
								if( smoothD_d > 37.7136 )
									ret := -0.060000
							if( bbp > -0.858226 )
								if( d_k <= -10.2231 )
									ret := -0.175141
								if( d_k > -10.2231 )
									ret := -0.008850
						if( rsi1 > 42.1213 )
							if( bearPower <= -0.566563 )
								if( smoothK_k <= 96.3964 )
									ret := 0.398284
								if( smoothK_k > 96.3964 )
									ret := 0.857143 // buy
							if( bearPower > -0.566563 )
								if( d <= 6.68875 )
									ret := -0.200000
								if( d > 6.68875 )
									ret := 0.119946
					if( bullPower > 0.003703 )
						if( rsi1 <= 45.6563 )
							if( bbp <= -0.661485 )
								if( rsi1 <= 43.5311 )
									ret := -0.138889
								if( rsi1 > 43.5311 )
									ret := 0.348214
							if( bbp > -0.661485 )
								if( bbp <= 0.61061 )
									ret := -0.240703
								if( bbp > 0.61061 )
									ret := -0.494505
						if( rsi1 > 45.6563 )
							if( bearPower <= -0.427157 )
								if( k <= 7.47762 )
									ret := -0.777778 // sell
								if( k > 7.47762 )
									ret := 0.303896
							if( bearPower > -0.427157 )
								if( bearPower <= -0.101852 )
									ret := -0.026131
								if( bearPower > -0.101852 )
									ret := -0.268623
		if( d_k > -2.03645 )
			if( bbp <= 0.33862 )
				if( rsi1 <= 39.4286 )
					if( bullPower <= 0.070776 )
						if( rsi1 <= 28.3988 )
							if( rsi1 <= 21.9459 )
								if( bbm <= 8.93048 )
									ret := -0.722647 // sell
								if( bbm > 8.93048 )
									ret := 0.046512
							if( rsi1 > 21.9459 )
								if( bullPower <= -0.69286 )
									ret := -0.194307
								if( bullPower > -0.69286 )
									ret := -0.530973
						if( rsi1 > 28.3988 )
							if( bullPower <= -0.212035 )
								if( rsi1 <= 35.2667 )
									ret := -0.087941
								if( rsi1 > 35.2667 )
									ret := 0.164848
							if( bullPower > -0.212035 )
								if( bbm <= 0.463102 )
									ret := -0.163053
								if( bbm > 0.463102 )
									ret := -0.363559
					if( bullPower > 0.070776 )
						if( bbm <= 0.310119 )
							if( bbm <= 0.172305 )
								if( bullPower <= 0.116277 )
									ret := -0.054054
								if( bullPower > 0.116277 )
									ret := -0.255814
							if( bbm > 0.172305 )
								if( bullPower <= 0.223276 )
									ret := -0.346479
								if( bullPower > 0.223276 )
									ret := -0.556604
						if( bbm > 0.310119 )
							if( rsi1 <= 31.6468 )
								if( bearPower <= -3.24031 )
									ret := -0.476636
								if( bearPower > -3.24031 )
									ret := -0.837969 // sell
							if( rsi1 > 31.6468 )
								if( d_k <= 4.33904 )
									ret := -0.471006
								if( d_k > 4.33904 )
									ret := -0.675940
				if( rsi1 > 39.4286 )
					if( bullPower <= 0.15626 )
						if( bbp <= -0.805845 )
							if( smoothK_k <= 91.8596 )
								if( k <= 3.42816 )
									ret := -0.044643
								if( k > 3.42816 )
									ret := 0.302162
							if( smoothK_k > 91.8596 )
								if( bbm <= 0.702603 )
									ret := 0.302326
								if( bbm > 0.702603 )
									ret := 0.758621 // buy
						if( bbp > -0.805845 )
							if( rsi1 <= 43.101 )
								if( bbm <= 0.481519 )
									ret := -0.036918
								if( bbm > 0.481519 )
									ret := -0.292079
							if( rsi1 > 43.101 )
								if( bearPower <= -0.394628 )
									ret := 0.221350
								if( bearPower > -0.394628 )
									ret := 0.060783
					if( bullPower > 0.15626 )
						if( bbp <= -0.506311 )
							if( rsi1 <= 45.3255 )
								if( smoothD_d <= -1.22958 )
									ret := 0.500000
								if( smoothD_d > -1.22958 )
									ret := -0.217119
							if( rsi1 > 45.3255 )
								if( bullPower <= 1.00584 )
									ret := 0.303258
								if( bullPower > 1.00584 )
									ret := -0.176471
						if( bbp > -0.506311 )
							if( rsi1 <= 47.737 )
								if( BBPower_Color <= 0.5 )
									ret := -0.435540
								if( BBPower_Color > 0.5 )
									ret := -0.233591
							if( rsi1 > 47.737 )
								if( bbp <= -0.092826 )
									ret := 0.219672
								if( bbp > -0.092826 )
									ret := -0.049711
			if( bbp > 0.33862 )
				if( rsi1 <= 42.8567 )
					if( rsi1 <= 35.9265 )
						if( bbm <= 0.241895 )
							if( bullPower <= 0.310795 )
								ret := 0.000000
							if( bullPower > 0.310795 )
								if( bbp <= 0.482688 )
									ret := -1.000000 // sell
								if( bbp > 0.482688 )
									ret := -0.500000
						if( bbm > 0.241895 )
							if( bbm <= 1.26274 )
								if( BBPower_Color <= 0.5 )
									ret := -1.000000 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.864865 // sell
							if( bbm > 1.26274 )
								if( d_k <= -1.12541 )
									ret := -0.750000 // sell
								if( d_k > -1.12541 )
									ret := -0.976510 // sell
					if( rsi1 > 35.9265 )
						if( bullPower <= 0.448442 )
							if( bullPower <= 0.306068 )
								if( bearPower <= 0.119632 )
									ret := -0.052632
								if( bearPower > 0.119632 )
									ret := -0.600000
							if( bullPower > 0.306068 )
								if( k <= 30.0158 )
									ret := -0.384615
								if( k > 30.0158 )
									ret := -0.666667
						if( bullPower > 0.448442 )
							if( d_k <= 15.5066 )
								if( bearPower <= -1.64563 )
									ret := -0.285714
								if( bearPower > -1.64563 )
									ret := -0.736777 // sell
							if( d_k > 15.5066 )
								if( bbm <= 0.23 )
									ret := 0.000000
								if( bbm > 0.23 )
									ret := -0.899344 // sell
				if( rsi1 > 42.8567 )
					if( bbp <= 1.20528 )
						if( bbp <= 0.577511 )
							if( bbm <= 0.351438 )
								if( rsi1 <= 46.2275 )
									ret := -0.402062
								if( rsi1 > 46.2275 )
									ret := -0.110390
							if( bbm > 0.351438 )
								if( rsi1 <= 47.0511 )
									ret := -0.555970
								if( rsi1 > 47.0511 )
									ret := -0.239130
						if( bbp > 0.577511 )
							if( rsi1 <= 46.2199 )
								if( BBPower_Color <= 0.5 )
									ret := -0.906977 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.623501
							if( rsi1 > 46.2199 )
								if( bbp <= 0.79638 )
									ret := -0.333333
								if( bbp > 0.79638 )
									ret := -0.452083
					if( bbp > 1.20528 )
						if( smoothD_d <= 93.532 )
							if( d_k <= 7.05116 )
								if( BBPower_Color <= 0.5 )
									ret := 0.000000
								if( BBPower_Color > 0.5 )
									ret := -0.608541
							if( d_k > 7.05116 )
								if( k <= 0.06498 )
									ret := -0.218750
								if( k > 0.06498 )
									ret := -0.814229 // sell
						if( smoothD_d > 93.532 )
							if( bbm <= 1.9 )
								ret := -0.285714
							if( bbm > 1.9 )
								if( smoothK_k <= 92.9084 )
									ret := 1.000000 // buy
								if( smoothK_k > 92.9084 )
									ret := 0.500000
	if( rsi1 > 51.7866 )
		if( BBPower_Color <= 0.5 )
			if( bbm <= 0.320058 )
				if( bbp <= -6.3e-05 )
					if( rsi1 <= 63.1092 )
						if( bearPower <= -0.305609 )
							if( rsi1 <= 53.2823 )
								if( rsi1 <= 52.4143 )
									ret := 0.000000
								if( rsi1 > 52.4143 )
									ret := 0.189189
							if( rsi1 > 53.2823 )
								if( bearPower <= -0.41305 )
									ret := 0.578313
								if( bearPower > -0.41305 )
									ret := 0.340909
						if( bearPower > -0.305609 )
							if( rsi1 <= 56.9407 )
								if( smoothK_k <= 6.47188 )
									ret := 0.352941
								if( smoothK_k > 6.47188 )
									ret := 0.041750
							if( rsi1 > 56.9407 )
								if( bbm <= 0.211229 )
									ret := 0.091398
								if( bbm > 0.211229 )
									ret := 0.258772
					if( rsi1 > 63.1092 )
						if( bearPower <= -0.246825 )
							if( d_k <= -13.9135 )
								if( bbp <= -0.365179 )
									ret := 0.125000
								if( bbp > -0.365179 )
									ret := 0.750000 // buy
							if( d_k > -13.9135 )
								if( smoothD_d <= 95.7709 )
									ret := 0.698113
								if( smoothD_d > 95.7709 )
									ret := 0.964286 // buy
						if( bearPower > -0.246825 )
							if( rsi1 <= 79.6394 )
								if( bbm <= 0.220904 )
									ret := 0.216667
								if( bbm > 0.220904 )
									ret := 0.459459
							if( rsi1 > 79.6394 )
								if( rsi1 <= 85.3008 )
									ret := 0.964286 // buy
								if( rsi1 > 85.3008 )
									ret := 0.500000
				if( bbp > -6.3e-05 )
					if( rsi1 <= 57.4 )
						if( k <= 69.6079 )
							if( d <= 25.8396 )
								ret := 1.000000 // buy
							if( d > 25.8396 )
								ret := 0.000000
						if( k > 69.6079 )
							if( bbp <= 0.117284 )
								ret := -1.000000 // sell
							if( bbp > 0.117284 )
								ret := 0.000000
					if( rsi1 > 57.4 )
						if( d_k <= -18.9297 )
							if( rsi1 <= 64.1673 )
								ret := 0.500000
							if( rsi1 > 64.1673 )
								ret := 1.000000 // buy
						if( d_k > -18.9297 )
							ret := 1.000000 // buy
			if( bbm > 0.320058 )
				if( rsi1 <= 61.1134 )
					if( bbp <= -0.583526 )
						if( d_k <= 16.7276 )
							if( d_k <= -8.29643 )
								if( bbp <= -1.7765 )
									ret := 0.920477 // buy
								if( bbp > -1.7765 )
									ret := 0.751419 // buy
							if( d_k > -8.29643 )
								if( k <= 12.7327 )
									ret := 0.200000
								if( k > 12.7327 )
									ret := 0.657222
						if( d_k > 16.7276 )
							if( bbm <= 0.831358 )
								ret := 0.750000 // buy
							if( bbm > 0.831358 )
								if( bbm <= 1.34736 )
									ret := -0.833333 // sell
								if( bbm > 1.34736 )
									ret := -0.071429
					if( bbp > -0.583526 )
						if( bbp <= -0.000245 )
							if( rsi1 <= 55.362 )
								if( bearPower <= -0.828268 )
									ret := 0.546875
								if( bearPower > -0.828268 )
									ret := 0.331486
							if( rsi1 > 55.362 )
								if( bbm <= 0.501223 )
									ret := 0.464427
								if( bbm > 0.501223 )
									ret := 0.630225
						if( bbp > -0.000245 )
							if( rsi1 <= 53.8494 )
								if( d_k <= 13.6363 )
									ret := 0.354839
								if( d_k > 13.6363 )
									ret := -0.500000
							if( rsi1 > 53.8494 )
								if( smoothD_d <= 94.7326 )
									ret := 0.761151 // buy
								if( smoothD_d > 94.7326 )
									ret := -0.052632
				if( rsi1 > 61.1134 )
					if( rsi1 <= 66.242 )
						if( d_k <= -12.5439 )
							if( bearPower <= -0.663416 )
								if( bearPower <= -3.33307 )
									ret := 0.769231 // buy
								if( bearPower > -3.33307 )
									ret := 0.953488 // buy
							if( bearPower > -0.663416 )
								if( bbm <= 0.550923 )
									ret := 0.696721
								if( bbm > 0.550923 )
									ret := 0.923977 // buy
						if( d_k > -12.5439 )
							if( d <= 87.7294 )
								if( smoothD_d <= 84.6605 )
									ret := 0.708621 // buy
								if( smoothD_d > 84.6605 )
									ret := -0.500000
							if( d > 87.7294 )
								if( bbp <= 1.37542 )
									ret := 0.820771 // buy
								if( bbp > 1.37542 )
									ret := 0.000000
					if( rsi1 > 66.242 )
						if( bbp <= -0.002403 )
							if( bullPower <= 0.320471 )
								if( bearPower <= -0.176837 )
									ret := 0.874855 // buy
								if( bearPower > -0.176837 )
									ret := 0.200000
							if( bullPower > 0.320471 )
								if( d_k <= 1.77832 )
									ret := 0.951311 // buy
								if( d_k > 1.77832 )
									ret := 0.750000 // buy
						if( bbp > -0.002403 )
							if( d_k <= 2.03744 )
								if( bearPower <= 0.220084 )
									ret := 1.000000 // buy
								if( bearPower > 0.220084 )
									ret := 0.931034 // buy
							if( d_k > 2.03744 )
								if( bearPower <= -0.374064 )
									ret := -0.500000
								if( bearPower > -0.374064 )
									ret := 0.894737 // buy
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 63.7723 )
				if( bbp <= 1.04086 )
					if( rsi1 <= 55.1919 )
						if( bbp <= 0.374734 )
							if( rsi1 <= 54.6223 )
								if( bullPower <= 1.15335 )
									ret := -0.022005
								if( bullPower > 1.15335 )
									ret := -0.437500
							if( rsi1 > 54.6223 )
								if( smoothD_d <= 51.86 )
									ret := 0.191489
								if( smoothD_d > 51.86 )
									ret := -0.023529
						if( bbp > 0.374734 )
							if( d_k <= 3.42131 )
								if( bearPower <= -0.276044 )
									ret := 0.043860
								if( bearPower > -0.276044 )
									ret := -0.201342
							if( d_k > 3.42131 )
								if( bullPower <= 0.717539 )
									ret := -0.189415
								if( bullPower > 0.717539 )
									ret := -0.464455
					if( rsi1 > 55.1919 )
						if( bbm <= 0.651821 )
							if( d <= 88.5003 )
								if( bearPower <= -0.024938 )
									ret := 0.118908
								if( bearPower > -0.024938 )
									ret := -0.034995
							if( d > 88.5003 )
								if( bbm <= 0.292035 )
									ret := 0.039216
								if( bbm > 0.292035 )
									ret := 0.258427
						if( bbm > 0.651821 )
							if( bbp <= 0.387175 )
								if( rsi1 <= 56.4016 )
									ret := 0.208333
								if( rsi1 > 56.4016 )
									ret := 0.486216
							if( bbp > 0.387175 )
								if( d_k <= 0.093355 )
									ret := 0.294320
								if( d_k > 0.093355 )
									ret := 0.098684
				if( bbp > 1.04086 )
					if( d_k <= 2.0056 )
						if( bearPower <= -0.285473 )
							if( rsi1 <= 59.1277 )
								if( bbp <= 3.09491 )
									ret := 0.056701
								if( bbp > 3.09491 )
									ret := 0.647059
							if( rsi1 > 59.1277 )
								if( k <= 88.2741 )
									ret := 0.391304
								if( k > 88.2741 )
									ret := 0.785714 // buy
						if( bearPower > -0.285473 )
							if( bearPower <= 1.95763 )
								if( bbm <= 1.09257 )
									ret := -0.165963
								if( bbm > 1.09257 )
									ret := 0.057993
							if( bearPower > 1.95763 )
								if( bearPower <= 3.28076 )
									ret := -0.640625
								if( bearPower > 3.28076 )
									ret := 0.000000
					if( d_k > 2.0056 )
						if( bearPower <= 0.412387 )
							if( rsi1 <= 57.5251 )
								if( smoothK_k <= 62.3866 )
									ret := -0.467890
								if( smoothK_k > 62.3866 )
									ret := -0.177778
							if( rsi1 > 57.5251 )
								if( smoothD_d <= 18.7968 )
									ret := 0.253731
								if( smoothD_d > 18.7968 )
									ret := -0.120567
						if( bearPower > 0.412387 )
							if( d <= 91.5642 )
								if( rsi1 <= 55.3111 )
									ret := -0.712794 // sell
								if( rsi1 > 55.3111 )
									ret := -0.499194
							if( d > 91.5642 )
								if( smoothK_k <= 91.1956 )
									ret := -0.184874
								if( smoothK_k > 91.1956 )
									ret := 0.500000
			if( rsi1 > 63.7723 )
				if( d_k <= 0.896463 )
					if( rsi1 <= 72.5445 )
						if( bearPower <= -0.172501 )
							if( smoothK_k <= 32.277 )
								if( bbm <= 2.80553 )
									ret := -0.312500
								if( bbm > 2.80553 )
									ret := 0.750000 // buy
							if( smoothK_k > 32.277 )
								if( bullPower <= 0.252007 )
									ret := 0.000000
								if( bullPower > 0.252007 )
									ret := 0.721957 // buy
						if( bearPower > -0.172501 )
							if( bbm <= 0.341542 )
								if( d <= 99.6459 )
									ret := 0.130000
								if( d > 99.6459 )
									ret := 0.571429
							if( bbm > 0.341542 )
								if( bbp <= 20.7024 )
									ret := 0.364281
								if( bbp > 20.7024 )
									ret := -1.000000 // sell
					if( rsi1 > 72.5445 )
						if( k <= 97.5419 )
							if( bbp <= 7.2689 )
								if( bbm <= 0.440819 )
									ret := 0.415292
								if( bbm > 0.440819 )
									ret := 0.663479
							if( bbp > 7.2689 )
								if( smoothD_d <= 93.4695 )
									ret := 0.111765
								if( smoothD_d > 93.4695 )
									ret := 0.894737 // buy
						if( k > 97.5419 )
							if( bbm <= 0.270058 )
								if( d_k <= 0.003392 )
									ret := 0.233577
								if( d_k > 0.003392 )
									ret := 0.745098 // buy
							if( bbm > 0.270058 )
								if( bearPower <= 0.302274 )
									ret := 0.803141 // buy
								if( bearPower > 0.302274 )
									ret := 0.685385
				if( d_k > 0.896463 )
					if( bearPower <= 0.990762 )
						if( k <= 91.5303 )
							if( bearPower <= 0.204585 )
								if( rsi1 <= 69.7889 )
									ret := 0.306238
								if( rsi1 > 69.7889 )
									ret := 0.543974
							if( bearPower > 0.204585 )
								if( smoothK_k <= 76.8557 )
									ret := 0.109506
								if( smoothK_k > 76.8557 )
									ret := 0.262925
						if( k > 91.5303 )
							if( d <= 93.4192 )
								if( bbm <= 0.625 )
									ret := 0.000000
								if( bbm > 0.625 )
									ret := -0.500000
							if( d > 93.4192 )
								if( rsi1 <= 68.812 )
									ret := 0.225806
								if( rsi1 > 68.812 )
									ret := 0.621333
					if( bearPower > 0.990762 )
						if( smoothD_d <= 92.1806 )
							if( k <= 87.9858 )
								if( rsi1 <= 68.7994 )
									ret := -0.551282
								if( rsi1 > 68.7994 )
									ret := -0.085575
							if( k > 87.9858 )
								if( bbm <= 6.43648 )
									ret := 0.137363
								if( bbm > 6.43648 )
									ret := -0.705882 // sell
						if( smoothD_d > 92.1806 )
							if( d_k <= 1.78811 )
								if( rsi1 <= 78.1181 )
									ret := -0.187500
								if( rsi1 > 78.1181 )
									ret := 0.468085
							if( d_k > 1.78811 )
								if( rsi1 <= 89.939 )
									ret := 0.615385
								if( rsi1 > 89.939 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_LTCUSDT_30Min_d398384d(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


