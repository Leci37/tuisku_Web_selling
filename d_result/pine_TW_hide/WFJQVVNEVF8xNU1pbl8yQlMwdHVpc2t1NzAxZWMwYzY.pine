//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: XRPUSDT_15Min_2BS0_701ec0c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2BS0_701ec0c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_701ec0c6(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( k <= 51.7556 )
		if( rsi1 <= 40.833 )
			if( bullPower <= 0.000352 )
				if( bbp <= -0.010192 )
					if( d <= 20.7397 )
						if( rsi1 <= 33.9719 )
							if( rsi1 <= 10.9187 )
								if( smoothK_k <= -1.79145 )
									ret := 0.509434
								if( smoothK_k > -1.79145 )
									ret := -0.120690
							if( rsi1 > 10.9187 )
								if( rsi1 <= 23.8206 )
									ret := -0.213421
								if( rsi1 > 23.8206 )
									ret := -0.028858
						if( rsi1 > 33.9719 )
							if( d_k <= -10.3794 )
								if( k <= 30.5312 )
									ret := -0.722222 // sell
								if( k > 30.5312 )
									ret := 0.571429
							if( d_k > -10.3794 )
								if( k <= 0.740174 )
									ret := -0.294118
								if( k > 0.740174 )
									ret := 0.657609
					if( d > 20.7397 )
						if( d_k <= -7.26603 )
							if( rsi1 <= 25.7575 )
								if( k <= 49.7167 )
									ret := -0.714286 // sell
								if( k > 49.7167 )
									ret := 0.571429
							if( rsi1 > 25.7575 )
								if( bbm <= 0.005629 )
									ret := -0.183099
								if( bbm > 0.005629 )
									ret := 0.368932
						if( d_k > -7.26603 )
							if( rsi1 <= 25.8758 )
								if( bearPower <= -0.013761 )
									ret := 0.433333
								if( bearPower > -0.013761 )
									ret := -0.074074
							if( rsi1 > 25.8758 )
								if( smoothD_d <= 24.5289 )
									ret := 0.750000 // buy
								if( smoothD_d > 24.5289 )
									ret := 0.450633
				if( bbp > -0.010192 )
					if( rsi1 <= 27.922 )
						if( bullPower <= -0.000318 )
							if( rsi1 <= 22.0883 )
								if( bullPower <= -0.001933 )
									ret := -0.350190
								if( bullPower > -0.001933 )
									ret := -0.536032
							if( rsi1 > 22.0883 )
								if( d_k <= 0.189252 )
									ret := -0.341709
								if( d_k > 0.189252 )
									ret := -0.109444
						if( bullPower > -0.000318 )
							if( bbm <= 0.001103 )
								if( rsi1 <= 24.3416 )
									ret := -0.484211
								if( rsi1 > 24.3416 )
									ret := -0.218182
							if( bbm > 0.001103 )
								if( rsi1 <= 25 )
									ret := -0.759036 // sell
								if( rsi1 > 25 )
									ret := -0.495238
					if( rsi1 > 27.922 )
						if( bbp <= -0.003388 )
							if( bullPower <= -0.000669 )
								if( d_k <= -3.5945 )
									ret := -0.151818
								if( d_k > -3.5945 )
									ret := 0.181638
							if( bullPower > -0.000669 )
								if( d_k <= -2.60807 )
									ret := -0.321429
								if( d_k > -2.60807 )
									ret := -0.053812
						if( bbp > -0.003388 )
							if( rsi1 <= 36.5648 )
								if( bbm <= 0.001401 )
									ret := -0.158948
								if( bbm > 0.001401 )
									ret := -0.333757
							if( rsi1 > 36.5648 )
								if( bullPower <= -0.000707 )
									ret := 0.141304
								if( bullPower > -0.000707 )
									ret := -0.098870
			if( bullPower > 0.000352 )
				if( bbp <= 0.001368 )
					if( rsi1 <= 34.0263 )
						if( bbp <= -0.006818 )
							if( d <= 18.4604 )
								if( bbp <= -0.032036 )
									ret := 0.600000
								if( bbp > -0.032036 )
									ret := -0.744186 // sell
							if( d > 18.4604 )
								if( rsi1 <= 24.2085 )
									ret := -0.461538
								if( rsi1 > 24.2085 )
									ret := 0.810811 // buy
						if( bbp > -0.006818 )
							if( bbp <= -0.001994 )
								if( d_k <= -13.6158 )
									ret := 0.600000
								if( d_k > -13.6158 )
									ret := -0.598485
							if( bbp > -0.001994 )
								if( rsi1 <= 30.6108 )
									ret := -0.800926 // sell
								if( rsi1 > 30.6108 )
									ret := -0.653430
					if( rsi1 > 34.0263 )
						if( bearPower <= -0.001766 )
							if( rsi1 <= 38.5979 )
								if( k <= 36.2751 )
									ret := -0.396518
								if( k > 36.2751 )
									ret := 0.052632
							if( rsi1 > 38.5979 )
								if( bearPower <= -0.00288 )
									ret := 0.109589
								if( bearPower > -0.00288 )
									ret := -0.201878
						if( bearPower > -0.001766 )
							if( bullPower <= 0.000854 )
								if( k <= 47.4754 )
									ret := -0.342362
								if( k > 47.4754 )
									ret := 0.187500
							if( bullPower > 0.000854 )
								if( BBPower_Color <= 0.5 )
									ret := -0.691974
								if( BBPower_Color > 0.5 )
									ret := -0.426370
				if( bbp > 0.001368 )
					if( smoothK_k <= 13.3581 )
						if( bbm <= 0.000901 )
							if( bullPower <= 0.001323 )
								if( rsi1 <= 36.143 )
									ret := -0.700000 // sell
								if( rsi1 > 36.143 )
									ret := -0.227273
							if( bullPower > 0.001323 )
								if( d_k <= 3.58555 )
									ret := -1.000000 // sell
								if( d_k > 3.58555 )
									ret := -0.692308
						if( bbm > 0.000901 )
							if( rsi1 <= 35.6156 )
								if( d_k <= 3.49616 )
									ret := -0.853420 // sell
								if( d_k > 3.49616 )
									ret := -0.934708 // sell
							if( rsi1 > 35.6156 )
								if( bullPower <= 0.001577 )
									ret := -0.500000
								if( bullPower > 0.001577 )
									ret := -0.824399 // sell
					if( smoothK_k > 13.3581 )
						if( smoothD_d <= 24.8634 )
							if( rsi1 <= 40.2925 )
								if( smoothD_d <= 19.6298 )
									ret := -0.640000
								if( smoothD_d > 19.6298 )
									ret := -0.157895
							if( rsi1 > 40.2925 )
								if( rsi1 <= 40.7232 )
									ret := 0.500000
								if( rsi1 > 40.7232 )
									ret := -0.750000 // sell
						if( smoothD_d > 24.8634 )
							if( rsi1 <= 37.7031 )
								if( smoothD_d <= 36.9743 )
									ret := -0.593750
								if( smoothD_d > 36.9743 )
									ret := -0.925000 // sell
							if( rsi1 > 37.7031 )
								if( bullPower <= 0.002863 )
									ret := -0.480519
								if( bullPower > 0.002863 )
									ret := -0.810811 // sell
		if( rsi1 > 40.833 )
			if( bbp <= -0.000263 )
				if( rsi1 <= 46.9962 )
					if( bbp <= -0.003124 )
						if( smoothD_d <= 15.1847 )
							if( d <= 11.3592 )
								if( k <= 15.7067 )
									ret := -0.017668
								if( k > 15.7067 )
									ret := -0.513514
							if( d > 11.3592 )
								if( k <= 14.156 )
									ret := 0.576471
								if( k > 14.156 )
									ret := -0.016484
						if( smoothD_d > 15.1847 )
							if( bbp <= -0.004907 )
								if( d_k <= 12.6334 )
									ret := 0.594595
								if( d_k > 12.6334 )
									ret := 0.266187
							if( bbp > -0.004907 )
								if( bbm <= 0.009407 )
									ret := 0.266892
								if( bbm > 0.009407 )
									ret := -1.000000 // sell
					if( bbp > -0.003124 )
						if( smoothD_d <= 16.5309 )
							if( smoothK_k <= 2.21945 )
								if( d_k <= -0.484918 )
									ret := -0.160000
								if( d_k > -0.484918 )
									ret := 0.144970
							if( smoothK_k > 2.21945 )
								if( bullPower <= 0.000665 )
									ret := -0.111982
								if( bullPower > 0.000665 )
									ret := -0.421053
						if( smoothD_d > 16.5309 )
							if( bbp <= -0.001104 )
								if( smoothD_d <= 49.7195 )
									ret := 0.086796
								if( smoothD_d > 49.7195 )
									ret := 0.241026
							if( bbp > -0.001104 )
								if( d_k <= 21.6406 )
									ret := -0.059113
								if( d_k > 21.6406 )
									ret := 0.145161
				if( rsi1 > 46.9962 )
					if( bearPower <= -0.002334 )
						if( d_k <= 4.25454 )
							if( bearPower <= -0.004086 )
								if( d <= 5.87286 )
									ret := 0.173913
								if( d > 5.87286 )
									ret := 0.812500 // buy
							if( bearPower > -0.004086 )
								if( d <= 17.9004 )
									ret := 0.397924
								if( d > 17.9004 )
									ret := 0.600939
						if( d_k > 4.25454 )
							if( bbm <= 0.002338 )
								if( bullPower <= -0.001425 )
									ret := -0.750000 // sell
								if( bullPower > -0.001425 )
									ret := 0.000000
							if( bbm > 0.002338 )
								if( bullPower <= 0.005177 )
									ret := 0.417266
								if( bullPower > 0.005177 )
									ret := -1.000000 // sell
					if( bearPower > -0.002334 )
						if( bbm <= 0.001318 )
							if( d <= 0.257258 )
								ret := -0.714286 // sell
							if( d > 0.257258 )
								if( smoothK_k <= 46.7054 )
									ret := 0.072464
								if( smoothK_k > 46.7054 )
									ret := 0.340909
						if( bbm > 0.001318 )
							if( d <= 38.6297 )
								if( rsi1 <= 57.2689 )
									ret := 0.170624
								if( rsi1 > 57.2689 )
									ret := 0.461538
							if( d > 38.6297 )
								if( d <= 55.7656 )
									ret := 0.445844
								if( d > 55.7656 )
									ret := 0.241758
			if( bbp > -0.000263 )
				if( bbp <= 0.003183 )
					if( d <= 21.1213 )
						if( bbp <= 0.000338 )
							if( bearPower <= -0.003076 )
								if( smoothK_k <= 4.71076 )
									ret := 0.250000
								if( smoothK_k > 4.71076 )
									ret := 0.909091 // buy
							if( bearPower > -0.003076 )
								if( k <= 15.7348 )
									ret := 0.006400
								if( k > 15.7348 )
									ret := -0.147632
						if( bbp > 0.000338 )
							if( rsi1 <= 48.3362 )
								if( bullPower <= 0.000952 )
									ret := -0.219895
								if( bullPower > 0.000952 )
									ret := -0.448026
							if( rsi1 > 48.3362 )
								if( rsi1 <= 56.4152 )
									ret := -0.098706
								if( rsi1 > 56.4152 )
									ret := 0.121255
					if( d > 21.1213 )
						if( rsi1 <= 53.3724 )
							if( bbp <= 0.001317 )
								if( rsi1 <= 44.6387 )
									ret := -0.185965
								if( rsi1 > 44.6387 )
									ret := -0.041088
							if( bbp > 0.001317 )
								if( rsi1 <= 43.0366 )
									ret := -0.589147
								if( rsi1 > 43.0366 )
									ret := -0.292663
						if( rsi1 > 53.3724 )
							if( bearPower <= -0.001391 )
								if( smoothD_d <= 52.8824 )
									ret := 0.458101
								if( smoothD_d > 52.8824 )
									ret := -0.115385
							if( bearPower > -0.001391 )
								if( rsi1 <= 61.9421 )
									ret := 0.046414
								if( rsi1 > 61.9421 )
									ret := 0.244493
				if( bbp > 0.003183 )
					if( rsi1 <= 64.3843 )
						if( bearPower <= 0.001883 )
							if( rsi1 <= 55.0504 )
								if( k <= 28.255 )
									ret := -0.621578
								if( k > 28.255 )
									ret := -0.369369
							if( rsi1 > 55.0504 )
								if( bbp <= 0.006168 )
									ret := -0.109637
								if( bbp > 0.006168 )
									ret := -0.396078
						if( bearPower > 0.001883 )
							if( d <= 61.973 )
								if( bbp <= 0.011512 )
									ret := -0.618105
								if( bbp > 0.011512 )
									ret := -0.814255 // sell
							if( d > 61.973 )
								if( bearPower <= 0.004627 )
									ret := 0.300000
								if( bearPower > 0.004627 )
									ret := -0.857143 // sell
					if( rsi1 > 64.3843 )
						if( d_k <= 18.2289 )
							if( bearPower <= 0.001711 )
								if( d <= 6.22868 )
									ret := -0.500000
								if( d > 6.22868 )
									ret := 0.280702
							if( bearPower > 0.001711 )
								if( rsi1 <= 72.097 )
									ret := -0.265203
								if( rsi1 > 72.097 )
									ret := 0.151751
						if( d_k > 18.2289 )
							if( rsi1 <= 71.1204 )
								if( bbp <= 0.02341 )
									ret := 0.439716
								if( bbp > 0.02341 )
									ret := -0.750000 // sell
							if( rsi1 > 71.1204 )
								if( d <= 63.1243 )
									ret := 0.886364 // buy
								if( d > 63.1243 )
									ret := 0.450000
	if( k > 51.7556 )
		if( bbp <= -0.001835 )
			if( rsi1 <= 49.2629 )
				if( bullPower <= -0.00215 )
					if( rsi1 <= 34.1658 )
						if( d_k <= -20.733 )
							if( bearPower <= -0.012879 )
								ret := 1.000000 // buy
							if( bearPower > -0.012879 )
								if( d_k <= -25.905 )
									ret := 0.600000
								if( d_k > -25.905 )
									ret := -0.776119 // sell
						if( d_k > -20.733 )
							if( bullPower <= -0.004417 )
								if( k <= 78.9253 )
									ret := 0.728571 // buy
								if( k > 78.9253 )
									ret := 0.350000
							if( bullPower > -0.004417 )
								if( k <= 88.9681 )
									ret := 0.254098
								if( k > 88.9681 )
									ret := -0.468750
					if( rsi1 > 34.1658 )
						if( bearPower <= -0.005889 )
							if( smoothD_d <= 42.6319 )
								if( rsi1 <= 37.0288 )
									ret := 0.680000
								if( rsi1 > 37.0288 )
									ret := 0.200000
							if( smoothD_d > 42.6319 )
								if( d_k <= 18.1602 )
									ret := 0.792066 // buy
								if( d_k > 18.1602 )
									ret := -0.500000
						if( bearPower > -0.005889 )
							if( smoothK_k <= 51.7914 )
								if( smoothD_d <= 44.1175 )
									ret := 0.000000
								if( smoothD_d > 44.1175 )
									ret := -0.750000 // sell
							if( smoothK_k > 51.7914 )
								if( d_k <= -11.6134 )
									ret := 0.356322
								if( d_k > -11.6134 )
									ret := 0.660000
				if( bullPower > -0.00215 )
					if( bullPower <= -0.000939 )
						if( rsi1 <= 35.9991 )
							if( d_k <= -12.8946 )
								if( rsi1 <= 30.8466 )
									ret := -0.540984
								if( rsi1 > 30.8466 )
									ret := -0.125000
							if( d_k > -12.8946 )
								if( d_k <= -2.53938 )
									ret := 0.185629
								if( d_k > -2.53938 )
									ret := -0.144578
						if( rsi1 > 35.9991 )
							if( d_k <= -22.1625 )
								if( k <= 69.6933 )
									ret := -0.393939
								if( k > 69.6933 )
									ret := 0.152542
							if( d_k > -22.1625 )
								if( bbm <= 0.001719 )
									ret := 0.278626
								if( bbm > 0.001719 )
									ret := 0.538283
					if( bullPower > -0.000939 )
						if( d_k <= -21.7291 )
							if( bullPower <= 0.00092 )
								if( bbp <= -0.005991 )
									ret := -0.800000 // sell
								if( bbp > -0.005991 )
									ret := -0.074534
							if( bullPower > 0.00092 )
								if( bullPower <= 0.001258 )
									ret := -0.750000 // sell
								if( bullPower > 0.001258 )
									ret := -1.000000 // sell
						if( d_k > -21.7291 )
							if( rsi1 <= 42.1427 )
								if( bbp <= -0.015666 )
									ret := 0.772727 // buy
								if( bbp > -0.015666 )
									ret := -0.061840
							if( rsi1 > 42.1427 )
								if( d_k <= 3.08505 )
									ret := 0.366026
								if( d_k > 3.08505 )
									ret := 0.164530
			if( rsi1 > 49.2629 )
				if( bearPower <= -0.00291 )
					if( bullPower <= -0.0002 )
						if( bullPower <= -0.009051 )
							ret := -1.000000 // sell
						if( bullPower > -0.009051 )
							if( bbm <= 0.011684 )
								if( d_k <= 9.62895 )
									ret := 0.861816 // buy
								if( d_k > 9.62895 )
									ret := 0.378378
							if( bbm > 0.011684 )
								ret := -0.200000
					if( bullPower > -0.0002 )
						if( d_k <= 8.39057 )
							if( d_k <= -25.2324 )
								if( d <= 40.7806 )
									ret := 1.000000 // buy
								if( d > 40.7806 )
									ret := 0.000000
							if( d_k > -25.2324 )
								if( rsi1 <= 55.3934 )
									ret := 0.641026
								if( rsi1 > 55.3934 )
									ret := 0.824766 // buy
						if( d_k > 8.39057 )
							if( rsi1 <= 55.9596 )
								if( d_k <= 18.2213 )
									ret := -0.468085
								if( d_k > 18.2213 )
									ret := 0.900000 // buy
							if( rsi1 > 55.9596 )
								if( bearPower <= -0.00358 )
									ret := 0.789474 // buy
								if( bearPower > -0.00358 )
									ret := -0.166667
				if( bearPower > -0.00291 )
					if( bbm <= 0.001503 )
						if( d <= 96.2142 )
							if( rsi1 <= 52.3875 )
								if( d <= 81.2897 )
									ret := 0.195122
								if( d > 81.2897 )
									ret := -0.054054
							if( rsi1 > 52.3875 )
								if( bullPower <= -0.000292 )
									ret := 0.560811
								if( bullPower > -0.000292 )
									ret := 0.210526
						if( d > 96.2142 )
							if( d <= 98.8898 )
								if( rsi1 <= 51.9675 )
									ret := 0.454545
								if( rsi1 > 51.9675 )
									ret := 0.954545 // buy
							if( d > 98.8898 )
								if( smoothD_d <= 96.7741 )
									ret := 0.166667
								if( smoothD_d > 96.7741 )
									ret := 0.705882 // buy
					if( bbm > 0.001503 )
						if( rsi1 <= 54.209 )
							if( d_k <= -22.8005 )
								if( d_k <= -29.9997 )
									ret := 1.000000 // buy
								if( d_k > -29.9997 )
									ret := -0.045455
							if( d_k > -22.8005 )
								if( rsi1 <= 51.3387 )
									ret := 0.402235
								if( rsi1 > 51.3387 )
									ret := 0.589041
						if( rsi1 > 54.209 )
							if( rsi1 <= 61.4747 )
								if( d_k <= 15.0749 )
									ret := 0.682510
								if( d_k > 15.0749 )
									ret := -0.400000
							if( rsi1 > 61.4747 )
								if( d_k <= -27.5531 )
									ret := 0.000000
								if( d_k > -27.5531 )
									ret := 0.888112 // buy
		if( bbp > -0.001835 )
			if( smoothD_d <= 88.4686 )
				if( rsi1 <= 57.2747 )
					if( bbp <= 0.002439 )
						if( rsi1 <= 43.4925 )
							if( bbp <= 0.00047 )
								if( bearPower <= -0.001561 )
									ret := -0.344729
								if( bearPower > -0.001561 )
									ret := -0.104950
							if( bbp > 0.00047 )
								if( bbm <= 0.001576 )
									ret := -0.265487
								if( bbm > 0.001576 )
									ret := -0.613497
						if( rsi1 > 43.4925 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 52.8654 )
									ret := 0.069568
								if( rsi1 > 52.8654 )
									ret := 0.277587
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.001539 )
									ret := -0.004550
								if( bullPower > 0.001539 )
									ret := -0.093822
					if( bbp > 0.002439 )
						if( smoothD_d <= 53.7393 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 53.0772 )
									ret := -0.250000
								if( rsi1 > 53.0772 )
									ret := 0.846154 // buy
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.002678 )
									ret := -0.526316
								if( bbp > 0.002678 )
									ret := -0.071795
						if( smoothD_d > 53.7393 )
							if( bbp <= 0.004937 )
								if( rsi1 <= 56.6875 )
									ret := -0.288939
								if( rsi1 > 56.6875 )
									ret := 0.112360
							if( bbp > 0.004937 )
								if( bbm <= 0.004478 )
									ret := -0.644351
								if( bbm > 0.004478 )
									ret := -0.393162
				if( rsi1 > 57.2747 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 0.00074 )
							if( bbm <= 0.001414 )
								if( rsi1 <= 67.5187 )
									ret := 0.196078
								if( rsi1 > 67.5187 )
									ret := 0.656977
							if( bbm > 0.001414 )
								if( rsi1 <= 60.8496 )
									ret := 0.433333
								if( rsi1 > 60.8496 )
									ret := 0.724340 // buy
						if( bullPower > 0.00074 )
							if( rsi1 <= 63.3757 )
								if( d_k <= -4.16994 )
									ret := 0.753769 // buy
								if( d_k > -4.16994 )
									ret := 0.448578
							if( rsi1 > 63.3757 )
								if( d_k <= 9.14049 )
									ret := 0.853316 // buy
								if( d_k > 9.14049 )
									ret := 0.071429
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 77.7784 )
							if( bearPower <= 0.000825 )
								if( bbp <= 0.009887 )
									ret := 0.198091
								if( bbp > 0.009887 )
									ret := -0.450000
							if( bearPower > 0.000825 )
								if( d_k <= 3.6837 )
									ret := -0.086003
								if( d_k > 3.6837 )
									ret := 0.214411
						if( rsi1 > 77.7784 )
							if( bearPower <= 0.000538 )
								if( bbm <= 0.001303 )
									ret := 0.505376
								if( bbm > 0.001303 )
									ret := 0.805556 // buy
							if( bearPower > 0.000538 )
								if( smoothK_k <= 59.9409 )
									ret := 0.762887 // buy
								if( smoothK_k > 59.9409 )
									ret := 0.344076
			if( smoothD_d > 88.4686 )
				if( rsi1 <= 63.0974 )
					if( bearPower <= -0.000696 )
						if( bullPower <= 0.002582 )
							if( rsi1 <= 52.5543 )
								if( smoothK_k <= 81.1233 )
									ret := 0.441860
								if( smoothK_k > 81.1233 )
									ret := -0.030837
							if( rsi1 > 52.5543 )
								if( d_k <= 0.328109 )
									ret := 0.279006
								if( d_k > 0.328109 )
									ret := 0.490421
						if( bullPower > 0.002582 )
							if( k <= 97.3673 )
								if( d <= 93.2408 )
									ret := 0.250000
								if( d > 93.2408 )
									ret := 0.712766 // buy
							if( k > 97.3673 )
								if( rsi1 <= 59.5938 )
									ret := -0.022222
								if( rsi1 > 59.5938 )
									ret := 0.750000 // buy
					if( bearPower > -0.000696 )
						if( smoothK_k <= 84.3511 )
							if( bbp <= 0.005114 )
								if( bbm <= 0.00161 )
									ret := 0.176471
								if( bbm > 0.00161 )
									ret := 0.471910
							if( bbp > 0.005114 )
								if( d <= 91.9432 )
									ret := -1.000000 // sell
								if( d > 91.9432 )
									ret := -0.333333
						if( smoothK_k > 84.3511 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= 0.000213 )
									ret := -0.084615
								if( bbp > 0.000213 )
									ret := 0.457143
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 55.8634 )
									ret := -0.268000
								if( rsi1 > 55.8634 )
									ret := 0.014170
				if( rsi1 > 63.0974 )
					if( bearPower <= -0.000122 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.001202 )
								if( bullPower <= 3.9e-05 )
									ret := 0.214286
								if( bullPower > 3.9e-05 )
									ret := 0.590551
							if( bbm > 0.001202 )
								if( rsi1 <= 71.8302 )
									ret := 0.755789 // buy
								if( rsi1 > 71.8302 )
									ret := 0.943820 // buy
						if( BBPower_Color > 0.5 )
							if( bullPower <= 0.001111 )
								if( rsi1 <= 73.2947 )
									ret := 0.151832
								if( rsi1 > 73.2947 )
									ret := 0.652778
							if( bullPower > 0.001111 )
								if( d_k <= 8.23022 )
									ret := 0.598020
								if( d_k > 8.23022 )
									ret := -0.555556
					if( bearPower > -0.000122 )
						if( rsi1 <= 73.4236 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 68.5134 )
									ret := 1.000000 // buy
								if( rsi1 > 68.5134 )
									ret := 0.689655
							if( BBPower_Color > 0.5 )
								if( d_k <= -2.06761 )
									ret := -0.101266
								if( d_k > -2.06761 )
									ret := 0.250382
						if( rsi1 > 73.4236 )
							if( bearPower <= 0.003541 )
								if( rsi1 <= 84.7089 )
									ret := 0.451214
								if( rsi1 > 84.7089 )
									ret := 0.708564 // buy
							if( bearPower > 0.003541 )
								if( bbm <= 0.002708 )
									ret := -0.148649
								if( bbm > 0.002708 )
									ret := 0.263815
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XRPUSDT_15Min_701ec0c6(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


