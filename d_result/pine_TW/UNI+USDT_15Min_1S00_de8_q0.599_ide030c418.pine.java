//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: UNIUSDT_15Min_1S00_e030c418 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1S00_e030c418", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_e030c418(rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( k <= 62.0386 )
		if( k <= 19.9831 )
			if( rsi1 <= 38.887 )
				if( smoothD_d <= 2.43318 )
					if( rsi1 <= 21.2735 )
						if( smoothD_d <= -2.2821 )
							if( smoothD_d <= -2.5824 )
								if( rsi1 <= 8.71236 )
									ret := -0.766871 // sell
								if( rsi1 > 8.71236 )
									ret := -0.367725
							if( smoothD_d > -2.5824 )
								if( d_k <= 0.45734 )
									ret := -0.256637
								if( d_k > 0.45734 )
									ret := 0.352941
						if( smoothD_d > -2.2821 )
							if( rsi1 <= 20.3723 )
								if( d <= 1.90799 )
									ret := -0.708678 // sell
								if( d > 1.90799 )
									ret := -0.404762
							if( rsi1 > 20.3723 )
								if( d_k <= -3.74618 )
									ret := 0.133333
								if( d_k > -3.74618 )
									ret := -0.794595 // sell
					if( rsi1 > 21.2735 )
						if( smoothK_k <= 4.25357 )
							if( d <= 1.54893 )
								if( d_k <= 1.47256 )
									ret := -0.450244
								if( d_k > 1.47256 )
									ret := 0.045455
							if( d > 1.54893 )
								if( rsi1 <= 23.519 )
									ret := -0.458824
								if( rsi1 > 23.519 )
									ret := -0.301666
						if( smoothK_k > 4.25357 )
							if( rsi1 <= 32.1325 )
								if( rsi1 <= 22.9008 )
									ret := 0.000000
								if( rsi1 > 22.9008 )
									ret := -0.627297
							if( rsi1 > 32.1325 )
								if( rsi1 <= 35.9065 )
									ret := -0.127660
								if( rsi1 > 35.9065 )
									ret := -0.565657
				if( smoothD_d > 2.43318 )
					if( rsi1 <= 23.9999 )
						if( k <= 13.8583 )
							if( d <= 5.92356 )
								if( d_k <= 4.5929 )
									ret := -0.020833
								if( d_k > 4.5929 )
									ret := -0.560000
							if( d > 5.92356 )
								if( smoothD_d <= 3.34452 )
									ret := -0.689655
								if( smoothD_d > 3.34452 )
									ret := -0.411315
						if( k > 13.8583 )
							if( d_k <= -4.96021 )
								if( d <= 13.09 )
									ret := -0.656489
								if( d > 13.09 )
									ret := 0.111111
							if( d_k > -4.96021 )
								if( smoothD_d <= 22.0468 )
									ret := 0.104545
								if( smoothD_d > 22.0468 )
									ret := -0.396552
					if( rsi1 > 23.9999 )
						if( d_k <= 6.91211 )
							if( smoothD_d <= 6.15238 )
								if( k <= 12.446 )
									ret := -0.233986
								if( k > 12.446 )
									ret := -0.426087
							if( smoothD_d > 6.15238 )
								if( d <= 23.9863 )
									ret := -0.147718
								if( d > 23.9863 )
									ret := 0.326087
						if( d_k > 6.91211 )
							if( d_k <= 10.5572 )
								if( d_k <= 8.69662 )
									ret := -0.308765
								if( d_k > 8.69662 )
									ret := -0.509677
							if( d_k > 10.5572 )
								if( d_k <= 19.3815 )
									ret := -0.231111
								if( d_k > 19.3815 )
									ret := -0.356031
			if( rsi1 > 38.887 )
				if( smoothD_d <= 4.48258 )
					if( rsi1 <= 56.9597 )
						if( rsi1 <= 54.1567 )
							if( rsi1 <= 46.0566 )
								if( smoothK_k <= 4.62875 )
									ret := -0.203390
								if( smoothK_k > 4.62875 )
									ret := -0.372000
							if( rsi1 > 46.0566 )
								if( smoothK_k <= 15.6853 )
									ret := -0.102007
								if( smoothK_k > 15.6853 )
									ret := 0.888889 // buy
						if( rsi1 > 54.1567 )
							if( k <= 5.13364 )
								if( k <= 2.34978 )
									ret := -0.400000
								if( k > 2.34978 )
									ret := -0.636364
							if( k > 5.13364 )
								if( smoothK_k <= 7.05036 )
									ret := -0.079545
								if( smoothK_k > 7.05036 )
									ret := -0.638298
					if( rsi1 > 56.9597 )
						if( rsi1 <= 73.0872 )
							if( d <= 3.83663 )
								if( k <= 9.23339 )
									ret := 0.266667
								if( k > 9.23339 )
									ret := -0.636364
							if( d > 3.83663 )
								if( rsi1 <= 68.71 )
									ret := -0.191388
								if( rsi1 > 68.71 )
									ret := 0.480000
						if( rsi1 > 73.0872 )
							if( smoothK_k <= 2.61279 )
								if( rsi1 <= 77.4225 )
									ret := -0.958333 // sell
								if( rsi1 > 77.4225 )
									ret := -0.500000
							if( smoothK_k > 2.61279 )
								ret := 0.250000
				if( smoothD_d > 4.48258 )
					if( rsi1 <= 55.1645 )
						if( smoothD_d <= 5.02381 )
							if( smoothK_k <= -1.7118 )
								if( rsi1 <= 44.6545 )
									ret := -0.200000
								if( rsi1 > 44.6545 )
									ret := 0.647059
							if( smoothK_k > -1.7118 )
								if( rsi1 <= 39.9102 )
									ret := 0.714286 // buy
								if( rsi1 > 39.9102 )
									ret := -0.094017
						if( smoothD_d > 5.02381 )
							if( smoothK_k <= -2.9924 )
								if( rsi1 <= 40.0467 )
									ret := 0.090909
								if( rsi1 > 40.0467 )
									ret := -0.375000
							if( smoothK_k > -2.9924 )
								if( d_k <= -7.9259 )
									ret := -0.378531
								if( d_k > -7.9259 )
									ret := -0.154283
					if( rsi1 > 55.1645 )
						if( d_k <= 4.65392 )
							if( d <= 8.46129 )
								if( rsi1 <= 66.0724 )
									ret := -0.387500
								if( rsi1 > 66.0724 )
									ret := 0.454545
							if( d > 8.46129 )
								if( k <= 12.6644 )
									ret := 0.444444
								if( k > 12.6644 )
									ret := 0.116766
						if( d_k > 4.65392 )
							if( smoothD_d <= 5.57375 )
								if( d_k <= 6.73181 )
									ret := -0.750000 // sell
								if( d_k > 6.73181 )
									ret := -0.173913
							if( smoothD_d > 5.57375 )
								if( rsi1 <= 62.003 )
									ret := -0.078804
								if( rsi1 > 62.003 )
									ret := 0.126697
		if( k > 19.9831 )
			if( d_k <= 4.72163 )
				if( rsi1 <= 48.9705 )
					if( d <= 19.165 )
						if( d <= 11.1006 )
							if( d_k <= -10.0982 )
								if( rsi1 <= 23.4754 )
									ret := -0.950000 // sell
								if( rsi1 > 23.4754 )
									ret := -0.465517
							if( d_k > -10.0982 )
								if( d <= 10.6803 )
									ret := 0.818182 // buy
								if( d > 10.6803 )
									ret := -0.333333
						if( d > 11.1006 )
							if( smoothK_k <= 21.4635 )
								if( rsi1 <= 17.544 )
									ret := -0.772727 // sell
								if( rsi1 > 17.544 )
									ret := -0.099794
							if( smoothK_k > 21.4635 )
								if( rsi1 <= 31.9814 )
									ret := -0.467181
								if( rsi1 > 31.9814 )
									ret := -0.213033
					if( d > 19.165 )
						if( rsi1 <= 20.5645 )
							if( d <= 49.0115 )
								if( k <= 34.5217 )
									ret := -0.580247
								if( k > 34.5217 )
									ret := -0.185714
							if( d > 49.0115 )
								if( rsi1 <= 19.6836 )
									ret := 0.900000 // buy
								if( rsi1 > 19.6836 )
									ret := 0.500000
						if( rsi1 > 20.5645 )
							if( d <= 57.567 )
								if( smoothD_d <= 20.1172 )
									ret := -0.080112
								if( smoothD_d > 20.1172 )
									ret := 0.029779
							if( d > 57.567 )
								if( smoothK_k <= 57.8605 )
									ret := -0.270492
								if( smoothK_k > 57.8605 )
									ret := 0.092593
				if( rsi1 > 48.9705 )
					if( rsi1 <= 71.4376 )
						if( smoothD_d <= 46.1639 )
							if( smoothK_k <= 46.983 )
								if( rsi1 <= 63.0302 )
									ret := 0.085852
								if( rsi1 > 63.0302 )
									ret := 0.272393
							if( smoothK_k > 46.983 )
								if( rsi1 <= 52.6727 )
									ret := 0.068421
								if( rsi1 > 52.6727 )
									ret := 0.268535
						if( smoothD_d > 46.1639 )
							if( d <= 64.4206 )
								if( d <= 57.7145 )
									ret := -0.063666
								if( d > 57.7145 )
									ret := -0.229851
							if( d > 64.4206 )
								if( d_k <= 3.1201 )
									ret := 0.000000
								if( d_k > 3.1201 )
									ret := 0.608696
					if( rsi1 > 71.4376 )
						if( d_k <= -26.1136 )
							if( smoothD_d <= 23.1715 )
								if( rsi1 <= 75.6786 )
									ret := -1.000000 // sell
								if( rsi1 > 75.6786 )
									ret := 0.250000
							if( smoothD_d > 23.1715 )
								ret := 0.250000
						if( d_k > -26.1136 )
							if( d_k <= -17.751 )
								if( rsi1 <= 78.017 )
									ret := 0.600000
								if( rsi1 > 78.017 )
									ret := 0.956522 // buy
							if( d_k > -17.751 )
								if( rsi1 <= 72.7467 )
									ret := 0.212500
								if( rsi1 > 72.7467 )
									ret := 0.473214
			if( d_k > 4.72163 )
				if( rsi1 <= 61.9675 )
					if( smoothD_d <= 68.371 )
						if( smoothK_k <= 22.8012 )
							if( d <= 27.2888 )
								if( rsi1 <= 37.6736 )
									ret := -0.187500
								if( rsi1 > 37.6736 )
									ret := 0.255814
							if( d > 27.2888 )
								if( rsi1 <= 30.6135 )
									ret := -0.473988
								if( rsi1 > 30.6135 )
									ret := -0.192982
						if( smoothK_k > 22.8012 )
							if( d_k <= 29.3384 )
								if( smoothK_k <= 25.049 )
									ret := 0.009690
								if( smoothK_k > 25.049 )
									ret := -0.125174
							if( d_k > 29.3384 )
								if( k <= 32.2107 )
									ret := 0.526316
								if( k > 32.2107 )
									ret := 0.179487
					if( smoothD_d > 68.371 )
						if( rsi1 <= 58.7221 )
							if( smoothK_k <= 58.1526 )
								if( d_k <= 21.8487 )
									ret := 0.134981
								if( d_k > 21.8487 )
									ret := -0.065934
							if( smoothK_k > 58.1526 )
								if( rsi1 <= 36.7896 )
									ret := -0.764706 // sell
								if( rsi1 > 36.7896 )
									ret := -0.212121
						if( rsi1 > 58.7221 )
							if( rsi1 <= 61.3134 )
								if( d_k <= 12.8991 )
									ret := 0.000000
								if( d_k > 12.8991 )
									ret := 0.652778
							if( rsi1 > 61.3134 )
								if( smoothD_d <= 69.5013 )
									ret := -0.875000 // sell
								if( smoothD_d > 69.5013 )
									ret := 0.526316
				if( rsi1 > 61.9675 )
					if( rsi1 <= 69.3589 )
						if( d_k <= 17.7421 )
							if( smoothD_d <= 28.3647 )
								if( d <= 28.9069 )
									ret := 0.000000
								if( d > 28.9069 )
									ret := 0.894737 // buy
							if( smoothD_d > 28.3647 )
								if( rsi1 <= 62.0672 )
									ret := 0.750000 // buy
								if( rsi1 > 62.0672 )
									ret := -0.008083
						if( d_k > 17.7421 )
							if( rsi1 <= 65.5773 )
								if( d <= 57.6352 )
									ret := 0.351351
								if( d > 57.6352 )
									ret := -0.075472
							if( rsi1 > 65.5773 )
								if( smoothD_d <= 43.1737 )
									ret := -0.250000
								if( smoothD_d > 43.1737 )
									ret := 0.423077
					if( rsi1 > 69.3589 )
						if( rsi1 <= 71.9956 )
							if( smoothK_k <= 27.6021 )
								if( k <= 24.0441 )
									ret := 0.200000
								if( k > 24.0441 )
									ret := 0.825000 // buy
							if( smoothK_k > 27.6021 )
								if( d <= 57.614 )
									ret := -0.020408
								if( d > 57.614 )
									ret := 0.500000
						if( rsi1 > 71.9956 )
							if( rsi1 <= 77.4034 )
								if( smoothD_d <= 41.3974 )
									ret := 0.391304
								if( smoothD_d > 41.3974 )
									ret := -0.036000
							if( rsi1 > 77.4034 )
								if( d_k <= 22.6354 )
									ret := 0.585366
								if( d_k > 22.6354 )
									ret := -0.588235
	if( k > 62.0386 )
		if( rsi1 <= 69.3048 )
			if( rsi1 <= 52.2729 )
				if( smoothD_d <= 96.1286 )
					if( d_k <= -8.08232 )
						if( smoothD_d <= 39.5129 )
							if( d <= 38.9366 )
								if( smoothD_d <= 31.7548 )
									ret := 0.181818
								if( smoothD_d > 31.7548 )
									ret := -0.525424
							if( d > 38.9366 )
								if( smoothD_d <= 37.0759 )
									ret := 0.419355
								if( smoothD_d > 37.0759 )
									ret := -0.273973
						if( smoothD_d > 39.5129 )
							if( d_k <= -27.6276 )
								if( smoothD_d <= 44.1327 )
									ret := 0.150000
								if( smoothD_d > 44.1327 )
									ret := -0.247706
							if( d_k > -27.6276 )
								if( rsi1 <= 34.2219 )
									ret := 0.047733
								if( rsi1 > 34.2219 )
									ret := 0.229692
					if( d_k > -8.08232 )
						if( d <= 82.4618 )
							if( d_k <= 0.745275 )
								if( smoothD_d <= 78.6209 )
									ret := 0.014379
								if( smoothD_d > 78.6209 )
									ret := 0.412698
							if( d_k > 0.745275 )
								if( rsi1 <= 32.0569 )
									ret := -0.477477
								if( rsi1 > 32.0569 )
									ret := -0.058824
						if( d > 82.4618 )
							if( smoothD_d <= 80.0083 )
								if( rsi1 <= 49.6305 )
									ret := 0.221053
								if( rsi1 > 49.6305 )
									ret := 0.653846
							if( smoothD_d > 80.0083 )
								if( rsi1 <= 46.6678 )
									ret := 0.004425
								if( rsi1 > 46.6678 )
									ret := 0.168528
				if( smoothD_d > 96.1286 )
					if( rsi1 <= 40.1789 )
						if( d <= 99.9114 )
							ret := -0.800000 // sell
						if( d > 99.9114 )
							ret := 0.000000
					if( rsi1 > 40.1789 )
						if( smoothK_k <= 96.9898 )
							if( smoothK_k <= 96.6184 )
								if( d_k <= 1.05638 )
									ret := 0.464286
								if( d_k > 1.05638 )
									ret := 1.000000 // buy
							if( smoothK_k > 96.6184 )
								if( d <= 99.7385 )
									ret := 1.000000 // buy
								if( d > 99.7385 )
									ret := 0.923077 // buy
						if( smoothK_k > 96.9898 )
							if( rsi1 <= 47.1014 )
								if( d <= 99.6282 )
									ret := 0.875000 // buy
								if( d > 99.6282 )
									ret := 0.555556
							if( rsi1 > 47.1014 )
								if( d <= 99.3008 )
									ret := 1.000000 // buy
								if( d > 99.3008 )
									ret := 0.269231
			if( rsi1 > 52.2729 )
				if( k <= 82.2433 )
					if( smoothD_d <= 77.592 )
						if( smoothD_d <= 62.4399 )
							if( d_k <= -22.581 )
								if( rsi1 <= 59.6032 )
									ret := 0.058577
								if( rsi1 > 59.6032 )
									ret := 0.252252
							if( d_k > -22.581 )
								if( rsi1 <= 67.0625 )
									ret := 0.246935
								if( rsi1 > 67.0625 )
									ret := 0.542254
						if( smoothD_d > 62.4399 )
							if( rsi1 <= 54.5593 )
								if( d_k <= -12.3692 )
									ret := 0.800000 // buy
								if( d_k > -12.3692 )
									ret := 0.166667
							if( rsi1 > 54.5593 )
								if( rsi1 <= 58.9655 )
									ret := -0.017582
								if( rsi1 > 58.9655 )
									ret := 0.110494
					if( smoothD_d > 77.592 )
						if( k <= 78.9197 )
							if( d <= 89.4308 )
								if( d <= 85.3581 )
									ret := 0.340704
								if( d > 85.3581 )
									ret := 0.192593
							if( d > 89.4308 )
								if( smoothK_k <= 73.6912 )
									ret := 0.153846
								if( smoothK_k > 73.6912 )
									ret := 0.708333 // buy
						if( k > 78.9197 )
							if( k <= 81.3676 )
								if( rsi1 <= 64.1844 )
									ret := 0.009070
								if( rsi1 > 64.1844 )
									ret := 0.295302
							if( k > 81.3676 )
								if( d <= 84.8893 )
									ret := 0.000000
								if( d > 84.8893 )
									ret := 0.412698
				if( k > 82.2433 )
					if( d <= 99.857 )
						if( rsi1 <= 58.8236 )
							if( k <= 82.5147 )
								if( d_k <= -10.3153 )
									ret := 0.142857
								if( d_k > -10.3153 )
									ret := 0.763158 // buy
							if( k > 82.5147 )
								if( k <= 99.9919 )
									ret := 0.267641
								if( k > 99.9919 )
									ret := 0.092262
						if( rsi1 > 58.8236 )
							if( k <= 83.6412 )
								if( k <= 82.5414 )
									ret := 0.469388
								if( k > 82.5414 )
									ret := 0.047782
							if( k > 83.6412 )
								if( d_k <= 7.34209 )
									ret := 0.330604
								if( d_k > 7.34209 )
									ret := 0.704301 // buy
					if( d > 99.857 )
						if( smoothD_d <= 96.9995 )
							if( k <= 99.8023 )
								ret := 0.285714
							if( k > 99.8023 )
								if( d_k <= -0.049262 )
									ret := 0.777778 // buy
								if( d_k > -0.049262 )
									ret := 0.964286 // buy
						if( smoothD_d > 96.9995 )
							if( rsi1 <= 58.0873 )
								if( rsi1 <= 53.9164 )
									ret := 0.400000
								if( rsi1 > 53.9164 )
									ret := 0.821429 // buy
							if( rsi1 > 58.0873 )
								if( rsi1 <= 65.7519 )
									ret := 0.157895
								if( rsi1 > 65.7519 )
									ret := 0.622449
		if( rsi1 > 69.3048 )
			if( smoothK_k <= 81.887 )
				if( d_k <= -5.05826 )
					if( k <= 83.3712 )
						if( d_k <= -32.7557 )
							ret := -0.400000
						if( d_k > -32.7557 )
							if( k <= 66.6741 )
								if( rsi1 <= 75.8938 )
									ret := 0.500000
								if( rsi1 > 75.8938 )
									ret := 0.037037
							if( k > 66.6741 )
								if( rsi1 <= 74.1845 )
									ret := 0.471380
								if( rsi1 > 74.1845 )
									ret := 0.644444
					if( k > 83.3712 )
						if( smoothK_k <= 80.8765 )
							if( rsi1 <= 77.46 )
								if( smoothK_k <= 80.8185 )
									ret := 0.062500
								if( smoothK_k > 80.8185 )
									ret := -0.600000
							if( rsi1 > 77.46 )
								ret := -0.800000 // sell
						if( smoothK_k > 80.8765 )
							if( rsi1 <= 70.8427 )
								ret := -0.800000 // sell
							if( rsi1 > 70.8427 )
								if( smoothK_k <= 81.6837 )
									ret := 0.606061
								if( smoothK_k > 81.6837 )
									ret := -0.333333
				if( d_k > -5.05826 )
					if( smoothD_d <= 71.4446 )
						if( smoothK_k <= 61.1392 )
							if( rsi1 <= 73.2483 )
								if( smoothD_d <= 64.321 )
									ret := -0.833333 // sell
								if( smoothD_d > 64.321 )
									ret := -0.250000
							if( rsi1 > 73.2483 )
								if( rsi1 <= 76.0644 )
									ret := 0.222222
								if( rsi1 > 76.0644 )
									ret := -0.526316
						if( smoothK_k > 61.1392 )
							if( smoothD_d <= 58.0944 )
								ret := -1.000000 // sell
							if( smoothD_d > 58.0944 )
								if( smoothD_d <= 68.0234 )
									ret := 0.312500
								if( smoothD_d > 68.0234 )
									ret := -0.049180
					if( smoothD_d > 71.4446 )
						if( rsi1 <= 78.5884 )
							if( smoothD_d <= 86.0099 )
								if( k <= 82.4943 )
									ret := 0.252781
								if( k > 82.4943 )
									ret := -0.201439
							if( smoothD_d > 86.0099 )
								if( rsi1 <= 77.2113 )
									ret := 0.601266
								if( rsi1 > 77.2113 )
									ret := -0.100000
						if( rsi1 > 78.5884 )
							if( d_k <= 8.54273 )
								if( k <= 77.3743 )
									ret := 0.038462
								if( k > 77.3743 )
									ret := 0.433824
							if( d_k > 8.54273 )
								if( rsi1 <= 90.3483 )
									ret := 0.797386 // buy
								if( rsi1 > 90.3483 )
									ret := -0.500000
			if( smoothK_k > 81.887 )
				if( rsi1 <= 76.9863 )
					if( d_k <= 2.55166 )
						if( k <= 94.8028 )
							if( d <= 80.8653 )
								if( d <= 71.0283 )
									ret := 0.340659
								if( d > 71.0283 )
									ret := 0.600877
							if( d > 80.8653 )
								if( d_k <= 0.505315 )
									ret := 0.187668
								if( d_k > 0.505315 )
									ret := 0.473510
						if( k > 94.8028 )
							if( d <= 99.3583 )
								if( d_k <= 2.25164 )
									ret := 0.489301
								if( d_k > 2.25164 )
									ret := 0.000000
							if( d > 99.3583 )
								if( d_k <= -0.118399 )
									ret := -0.104167
								if( d_k > -0.118399 )
									ret := 0.400000
					if( d_k > 2.55166 )
						if( smoothK_k <= 87.6606 )
							if( smoothD_d <= 90.8312 )
								if( d <= 92.7125 )
									ret := 0.400000
								if( d > 92.7125 )
									ret := 0.688406
							if( smoothD_d > 90.8312 )
								if( rsi1 <= 74.5776 )
									ret := 0.388889
								if( rsi1 > 74.5776 )
									ret := -0.030303
						if( smoothK_k > 87.6606 )
							if( rsi1 <= 69.7966 )
								if( smoothK_k <= 90.9278 )
									ret := 0.705882 // buy
								if( smoothK_k > 90.9278 )
									ret := -0.500000
							if( rsi1 > 69.7966 )
								if( smoothD_d <= 91.7235 )
									ret := 0.954545 // buy
								if( smoothD_d > 91.7235 )
									ret := 0.624549
				if( rsi1 > 76.9863 )
					if( d_k <= -0.245506 )
						if( rsi1 <= 94.467 )
							if( d_k <= -2.39911 )
								if( d_k <= -16.7785 )
									ret := 0.746914 // buy
								if( d_k > -16.7785 )
									ret := 0.524590
							if( d_k > -2.39911 )
								if( smoothD_d <= 81.6802 )
									ret := -0.363636
								if( smoothD_d > 81.6802 )
									ret := 0.374168
						if( rsi1 > 94.467 )
							if( d_k <= -6.60045 )
								ret := 0.600000
							if( d_k > -6.60045 )
								if( d_k <= -1.54827 )
									ret := 0.846154 // buy
								if( d_k > -1.54827 )
									ret := 0.980000 // buy
					if( d_k > -0.245506 )
						if( d <= 97.2817 )
							if( d <= 87.3289 )
								ret := -0.400000
							if( d > 87.3289 )
								if( smoothD_d <= 85.5563 )
									ret := 0.818182 // buy
								if( smoothD_d > 85.5563 )
									ret := 0.548321
						if( d > 97.2817 )
							if( k <= 95.8244 )
								if( smoothK_k <= 92.0005 )
									ret := 0.800000 // buy
								if( smoothK_k > 92.0005 )
									ret := 0.925373 // buy
							if( k > 95.8244 )
								if( smoothK_k <= 93.5057 )
									ret := 0.352941
								if( smoothK_k > 93.5057 )
									ret := 0.692308
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_e030c418(rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


