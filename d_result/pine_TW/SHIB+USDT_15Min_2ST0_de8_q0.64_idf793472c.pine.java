//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: SHIBUSDT_15Min_2ST0_f793472c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_2ST0_f793472c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_f793472c(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 55.2744 )
		if( smoothK_k <= 36.5845 )
			if( smoothD_d <= 1.21921 )
				if( d_k <= 0.007171 )
					if( tema <= 1.7e-05 )
						if( rsi1 <= 32.7856 )
							if( k <= 4.78639 )
								if( smoothD_d <= -1.88712 )
									ret := -0.513854
								if( smoothD_d > -1.88712 )
									ret := -0.273196
							if( k > 4.78639 )
								if( k <= 6.63516 )
									ret := -0.703947 // sell
								if( k > 6.63516 )
									ret := -0.301370
						if( rsi1 > 32.7856 )
							if( tema <= 1.5e-05 )
								if( d <= 2.97046 )
									ret := -0.320482
								if( d > 2.97046 )
									ret := -0.164021
							if( tema > 1.5e-05 )
								if( d_k <= -3.35354 )
									ret := -0.230769
								if( d_k > -3.35354 )
									ret := -0.743590 // sell
					if( tema > 1.7e-05 )
						if( rsi1 <= 8.89836 )
							if( rsi1 <= 7.56689 )
								if( d_k <= -0.022275 )
									ret := -1.000000 // sell
								if( d_k > -0.022275 )
									ret := -0.181818
							if( rsi1 > 7.56689 )
								ret := 1.000000 // buy
						if( rsi1 > 8.89836 )
							if( k <= 0.724215 )
								if( smoothK_k <= -2.99875 )
									ret := -0.794643 // sell
								if( smoothK_k > -2.99875 )
									ret := -0.968750 // sell
							if( k > 0.724215 )
								if( rsi1 <= 48.3359 )
									ret := -0.711775 // sell
								if( rsi1 > 48.3359 )
									ret := -0.477273
				if( d_k > 0.007171 )
					if( ema2 <= 1.9e-05 )
						if( smoothK_k <= -2.98185 )
							if( d <= 0.643771 )
								if( ema2 <= 1e-05 )
									ret := -0.586207
								if( ema2 > 1e-05 )
									ret := 0.112782
							if( d > 0.643771 )
								if( d_k <= 3.6584 )
									ret := -0.417402
								if( d_k > 3.6584 )
									ret := -0.116667
						if( smoothK_k > -2.98185 )
							if( smoothK_k <= -2.3052 )
								if( ema3 <= 9e-06 )
									ret := -0.625000
								if( ema3 > 9e-06 )
									ret := 0.194175
							if( smoothK_k > -2.3052 )
								if( tema <= 1.4e-05 )
									ret := -0.175943
								if( tema > 1.4e-05 )
									ret := -0.633803
					if( ema2 > 1.9e-05 )
						if( rsi1 <= 43.3138 )
							if( rsi1 <= 7.30439 )
								ret := 0.600000
							if( rsi1 > 7.30439 )
								if( d_k <= 2.18363 )
									ret := -0.722513 // sell
								if( d_k > 2.18363 )
									ret := -0.916667 // sell
						if( rsi1 > 43.3138 )
							if( smoothD_d <= -1.78156 )
								if( rsi1 <= 48.2703 )
									ret := 0.857143 // buy
								if( rsi1 > 48.2703 )
									ret := 0.250000
							if( smoothD_d > -1.78156 )
								if( smoothD_d <= 0.386592 )
									ret := -0.642857
								if( smoothD_d > 0.386592 )
									ret := 0.100000
			if( smoothD_d > 1.21921 )
				if( k <= 17.3964 )
					if( rsi1 <= 37.0363 )
						if( ema2 <= 2.6e-05 )
							if( smoothK_k <= -2.95512 )
								if( rsi1 <= 25.4529 )
									ret := -0.642424
								if( rsi1 > 25.4529 )
									ret := -0.311828
							if( smoothK_k > -2.95512 )
								if( d_k <= -3.2879 )
									ret := -0.380112
								if( d_k > -3.2879 )
									ret := -0.239645
						if( ema2 > 2.6e-05 )
							if( k <= 3.76625 )
								if( smoothK_k <= -1.78111 )
									ret := -0.700000 // sell
								if( smoothK_k > -1.78111 )
									ret := -0.891304 // sell
							if( k > 3.76625 )
								if( rsi1 <= 33.3139 )
									ret := -0.728972 // sell
								if( rsi1 > 33.3139 )
									ret := -0.210526
					if( rsi1 > 37.0363 )
						if( smoothK_k <= 5.60875 )
							if( ema1 <= 1.9e-05 )
								if( d_k <= -2.72055 )
									ret := -0.632653
								if( d_k > -2.72055 )
									ret := -0.134045
							if( ema1 > 1.9e-05 )
								if( k <= 1.14452 )
									ret := -0.646465
								if( k > 1.14452 )
									ret := -0.396355
						if( smoothK_k > 5.60875 )
							if( rsi1 <= 46.0098 )
								if( ema3 <= 1.8e-05 )
									ret := -0.117031
								if( ema3 > 1.8e-05 )
									ret := -0.401361
							if( rsi1 > 46.0098 )
								if( d <= 34.004 )
									ret := -0.010101
								if( d > 34.004 )
									ret := -0.338129
				if( k > 17.3964 )
					if( d <= 20.2149 )
						if( ema3 <= 2.4e-05 )
							if( rsi1 <= 30.231 )
								if( smoothD_d <= 11.3653 )
									ret := -0.553903
								if( smoothD_d > 11.3653 )
									ret := -0.186321
							if( rsi1 > 30.231 )
								if( ema2 <= 2e-05 )
									ret := -0.120185
								if( ema2 > 2e-05 )
									ret := -0.415966
						if( ema3 > 2.4e-05 )
							if( ema12 <= -1e-06 )
								ret := 1.000000 // buy
							if( ema12 > -1e-06 )
								if( rsi1 <= 38.9683 )
									ret := -0.619632
								if( rsi1 > 38.9683 )
									ret := -0.310345
					if( d > 20.2149 )
						if( rsi1 <= 19.633 )
							if( d_k <= 25.0935 )
								if( k <= 26.3096 )
									ret := -0.763636 // sell
								if( k > 26.3096 )
									ret := -0.516667
							if( d_k > 25.0935 )
								if( smoothK_k <= 17.5066 )
									ret := 1.000000 // buy
								if( smoothK_k > 17.5066 )
									ret := 0.000000
						if( rsi1 > 19.633 )
							if( d_k <= 3.03298 )
								if( k <= 21.4423 )
									ret := 0.296429
								if( k > 21.4423 )
									ret := -0.052697
							if( d_k > 3.03298 )
								if( ema2 <= 2.5e-05 )
									ret := -0.112072
								if( ema2 > 2.5e-05 )
									ret := -0.442623
		if( smoothK_k > 36.5845 )
			if( k <= 75.2077 )
				if( d <= 53.7913 )
					if( rsi1 <= 40.4283 )
						if( smoothD_d <= 28.0513 )
							if( rsi1 <= 35.007 )
								if( smoothK_k <= 38.1096 )
									ret := -0.820000 // sell
								if( smoothK_k > 38.1096 )
									ret := -0.434426
							if( rsi1 > 35.007 )
								if( tema <= 1.9e-05 )
									ret := -0.038462
								if( tema > 1.9e-05 )
									ret := -0.615385
						if( smoothD_d > 28.0513 )
							if( d <= 52.8354 )
								if( k <= 70.871 )
									ret := -0.010398
								if( k > 70.871 )
									ret := -0.590909
							if( d > 52.8354 )
								if( smoothK_k <= 44.7746 )
									ret := 0.827586 // buy
								if( smoothK_k > 44.7746 )
									ret := 0.242991
					if( rsi1 > 40.4283 )
						if( rsi1 <= 50.1815 )
							if( rsi1 <= 46.4309 )
								if( d_k <= -22.1308 )
									ret := -0.184466
								if( d_k > -22.1308 )
									ret := 0.132833
							if( rsi1 > 46.4309 )
								if( smoothK_k <= 43.5426 )
									ret := 0.127273
								if( smoothK_k > 43.5426 )
									ret := -0.066161
						if( rsi1 > 50.1815 )
							if( smoothK_k <= 56.8322 )
								if( rsi1 <= 53.4841 )
									ret := 0.168659
								if( rsi1 > 53.4841 )
									ret := -0.046036
							if( smoothK_k > 56.8322 )
								if( d_k <= -14.508 )
									ret := 0.222997
								if( d_k > -14.508 )
									ret := 0.581818
				if( d > 53.7913 )
					if( k <= 58.6094 )
						if( rsi1 <= 39.8413 )
							if( k <= 55.6316 )
								if( k <= 49.0053 )
									ret := -0.290244
								if( k > 49.0053 )
									ret := -0.016393
							if( k > 55.6316 )
								if( rsi1 <= 28.546 )
									ret := -0.951220 // sell
								if( rsi1 > 28.546 )
									ret := -0.335714
						if( rsi1 > 39.8413 )
							if( smoothD_d <= 65.908 )
								if( d_k <= 18.3849 )
									ret := -0.072615
								if( d_k > 18.3849 )
									ret := -0.376623
							if( smoothD_d > 65.908 )
								if( ema1 <= 1.3e-05 )
									ret := 0.197568
								if( ema1 > 1.3e-05 )
									ret := -0.103448
					if( k > 58.6094 )
						if( rsi1 <= 48.1163 )
							if( smoothD_d <= 52.9619 )
								if( rsi1 <= 36.3166 )
									ret := -0.627119
								if( rsi1 > 36.3166 )
									ret := -0.142857
							if( smoothD_d > 52.9619 )
								if( rsi1 <= 31.9995 )
									ret := 0.267717
								if( rsi1 > 31.9995 )
									ret := -0.039039
						if( rsi1 > 48.1163 )
							if( rsi1 <= 49.859 )
								if( d <= 81.973 )
									ret := 0.309211
								if( d > 81.973 )
									ret := -0.413043
							if( rsi1 > 49.859 )
								if( d_k <= -3.75683 )
									ret := 0.190377
								if( d_k > -3.75683 )
									ret := -0.000706
			if( k > 75.2077 )
				if( smoothK_k <= 82.7188 )
					if( d_k <= -2.17264 )
						if( d_k <= -12.7218 )
							if( rsi1 <= 36.2727 )
								if( smoothD_d <= 63.0254 )
									ret := -0.392857
								if( smoothD_d > 63.0254 )
									ret := -0.857143 // sell
							if( rsi1 > 36.2727 )
								if( d <= 62.6465 )
									ret := 0.240246
								if( d > 62.6465 )
									ret := 0.020050
						if( d_k > -12.7218 )
							if( rsi1 <= 24.8492 )
								ret := -1.000000 // sell
							if( rsi1 > 24.8492 )
								if( ema3 <= 1.8e-05 )
									ret := 0.239814
								if( ema3 > 1.8e-05 )
									ret := 0.473958
					if( d_k > -2.17264 )
						if( rsi1 <= 50.3721 )
							if( d <= 78.0346 )
								if( smoothD_d <= 74.311 )
									ret := -0.062500
								if( smoothD_d > 74.311 )
									ret := -0.744186 // sell
							if( d > 78.0346 )
								if( k <= 79.327 )
									ret := 0.216418
								if( k > 79.327 )
									ret := -0.077230
						if( rsi1 > 50.3721 )
							if( ema13 <= -1e-06 )
								ret := 1.000000 // buy
							if( ema13 > -1e-06 )
								if( d <= 76.652 )
									ret := 0.642857
								if( d > 76.652 )
									ret := 0.160420
				if( smoothK_k > 82.7188 )
					if( smoothD_d <= 94.5576 )
						if( smoothK_k <= 87.9316 )
							if( d_k <= 2.2752 )
								if( d <= 90.5885 )
									ret := 0.265900
								if( d > 90.5885 )
									ret := -0.145161
							if( d_k > 2.2752 )
								if( ema3 <= 1.3e-05 )
									ret := 0.273312
								if( ema3 > 1.3e-05 )
									ret := 0.516393
						if( smoothK_k > 87.9316 )
							if( rsi1 <= 47.419 )
								if( rsi1 <= 45.3654 )
									ret := 0.143742
								if( rsi1 > 45.3654 )
									ret := -0.063401
							if( rsi1 > 47.419 )
								if( ema2 <= 1.5e-05 )
									ret := 0.152527
								if( ema2 > 1.5e-05 )
									ret := 0.420949
					if( smoothD_d > 94.5576 )
						if( rsi1 <= 34.7892 )
							if( ema2 <= 1.8e-05 )
								if( ema3 <= 1e-05 )
									ret := -1.000000 // sell
								if( ema3 > 1e-05 )
									ret := -0.750000 // sell
							if( ema2 > 1.8e-05 )
								ret := 0.000000
						if( rsi1 > 34.7892 )
							if( ema2 <= 2.1e-05 )
								if( ema3 <= 1.2e-05 )
									ret := 0.336283
								if( ema3 > 1.2e-05 )
									ret := 0.612150
							if( ema2 > 2.1e-05 )
								if( rsi1 <= 52.7163 )
									ret := 0.313725
								if( rsi1 > 52.7163 )
									ret := -0.409091
	if( rsi1 > 55.2744 )
		if( k <= 73.2786 )
			if( k <= 36.3612 )
				if( rsi1 <= 60.3577 )
					if( k <= 16.125 )
						if( rsi1 <= 58.2309 )
							if( ema13 <= 1e-06 )
								if( d <= 27.92 )
									ret := 0.006557
								if( d > 27.92 )
									ret := -0.379310
							if( ema13 > 1e-06 )
								ret := -1.000000 // sell
						if( rsi1 > 58.2309 )
							if( d <= 1.14887 )
								if( tema <= 9e-06 )
									ret := -0.750000 // sell
								if( tema > 9e-06 )
									ret := -1.000000 // sell
							if( d > 1.14887 )
								if( d <= 2.90772 )
									ret := 0.450000
								if( d > 2.90772 )
									ret := -0.308901
					if( k > 16.125 )
						if( d <= 27.4375 )
							if( k <= 20.011 )
								if( ema3 <= 1.1e-05 )
									ret := 0.000000
								if( ema3 > 1.1e-05 )
									ret := 0.538462
							if( k > 20.011 )
								if( smoothD_d <= 22.2464 )
									ret := -0.016432
								if( smoothD_d > 22.2464 )
									ret := 0.363636
						if( d > 27.4375 )
							if( smoothK_k <= 19.4555 )
								if( k <= 20.6746 )
									ret := -0.285714
								if( k > 20.6746 )
									ret := -0.582090
							if( smoothK_k > 19.4555 )
								if( d <= 30.3884 )
									ret := -0.287500
								if( d > 30.3884 )
									ret := 0.013595
				if( rsi1 > 60.3577 )
					if( ema2 <= 1.9e-05 )
						if( smoothD_d <= 0.881893 )
							if( ema2 <= 1.2e-05 )
								if( ema1 <= 1.1e-05 )
									ret := -0.350000
								if( ema1 > 1.1e-05 )
									ret := 0.500000
							if( ema2 > 1.2e-05 )
								if( tema <= 1.4e-05 )
									ret := -0.538462
								if( tema > 1.4e-05 )
									ret := -0.900000 // sell
						if( smoothD_d > 0.881893 )
							if( smoothK_k <= 5.77177 )
								if( ema13 <= 1e-06 )
									ret := 0.271255
								if( ema13 > 1e-06 )
									ret := -0.866667 // sell
							if( smoothK_k > 5.77177 )
								if( d_k <= 19.345 )
									ret := -0.006614
								if( d_k > 19.345 )
									ret := 0.244565
					if( ema2 > 1.9e-05 )
						if( d_k <= -5.4928 )
							if( ema13 <= 0 )
								if( ema3 <= 2e-05 )
									ret := 0.000000
								if( ema3 > 2e-05 )
									ret := 0.571429
							if( ema13 > 0 )
								if( ema3 <= 2.6e-05 )
									ret := -1.000000 // sell
								if( ema3 > 2.6e-05 )
									ret := -0.700000 // sell
						if( d_k > -5.4928 )
							if( ema12 <= 1e-06 )
								if( rsi1 <= 63.2527 )
									ret := 0.296970
								if( rsi1 > 63.2527 )
									ret := 0.553672
							if( ema12 > 1e-06 )
								if( k <= 9.29198 )
									ret := -1.000000 // sell
								if( k > 9.29198 )
									ret := -0.750000 // sell
			if( k > 36.3612 )
				if( rsi1 <= 68.6751 )
					if( d_k <= 12.8957 )
						if( d <= 34.9712 )
							if( tema <= 1.3e-05 )
								if( d <= 29.5133 )
									ret := 0.144366
								if( d > 29.5133 )
									ret := 0.299003
							if( tema > 1.3e-05 )
								if( rsi1 <= 59.9674 )
									ret := 0.552632
								if( rsi1 > 59.9674 )
									ret := 0.223404
						if( d > 34.9712 )
							if( k <= 41.1553 )
								if( rsi1 <= 67.4331 )
									ret := -0.236686
								if( rsi1 > 67.4331 )
									ret := 0.333333
							if( k > 41.1553 )
								if( d_k <= -0.91603 )
									ret := 0.200993
								if( d_k > -0.91603 )
									ret := 0.096063
					if( d_k > 12.8957 )
						if( smoothK_k <= 66.2873 )
							if( rsi1 <= 65.6408 )
								if( d <= 82.7141 )
									ret := 0.245128
								if( d > 82.7141 )
									ret := -0.148936
							if( rsi1 > 65.6408 )
								if( d <= 73.3473 )
									ret := 0.642336
								if( d > 73.3473 )
									ret := 0.290698
						if( smoothK_k > 66.2873 )
							if( d <= 85.6707 )
								if( rsi1 <= 57.3341 )
									ret := 0.250000
								if( rsi1 > 57.3341 )
									ret := 0.879310 // buy
							if( d > 85.6707 )
								if( rsi1 <= 62.9758 )
									ret := 0.172414
								if( rsi1 > 62.9758 )
									ret := 0.666667
				if( rsi1 > 68.6751 )
					if( smoothD_d <= 75.6566 )
						if( ema3 <= 1.8e-05 )
							if( smoothD_d <= 40.908 )
								if( ema3 <= 1.4e-05 )
									ret := 0.306338
								if( ema3 > 1.4e-05 )
									ret := 0.868852 // buy
							if( smoothD_d > 40.908 )
								if( smoothD_d <= 48.1098 )
									ret := -0.114130
								if( smoothD_d > 48.1098 )
									ret := 0.264582
						if( ema3 > 1.8e-05 )
							if( d_k <= -9.35161 )
								if( smoothD_d <= 27.4071 )
									ret := 0.619048
								if( smoothD_d > 27.4071 )
									ret := 0.916667 // buy
							if( d_k > -9.35161 )
								if( smoothD_d <= 65.3164 )
									ret := 0.170588
								if( smoothD_d > 65.3164 )
									ret := 0.558559
					if( smoothD_d > 75.6566 )
						if( ema1 <= 1.2e-05 )
							if( d <= 84.7038 )
								if( d_k <= 13.4776 )
									ret := 0.606383
								if( d_k > 13.4776 )
									ret := -0.300000
							if( d > 84.7038 )
								if( rsi1 <= 70.6256 )
									ret := 0.500000
								if( rsi1 > 70.6256 )
									ret := 0.904762 // buy
						if( ema1 > 1.2e-05 )
							if( smoothK_k <= 70.1097 )
								if( ema3 <= 2.3e-05 )
									ret := 0.847059 // buy
								if( ema3 > 2.3e-05 )
									ret := 0.583333
							if( smoothK_k > 70.1097 )
								ret := 0.200000
		if( k > 73.2786 )
			if( rsi1 <= 66.6668 )
				if( d <= 88.6236 )
					if( d_k <= -10.1619 )
						if( tema <= 1.5e-05 )
							if( smoothK_k <= 90.8446 )
								if( d_k <= -12.1078 )
									ret := 0.220039
								if( d_k > -12.1078 )
									ret := 0.391892
							if( smoothK_k > 90.8446 )
								if( ema3 <= 1.4e-05 )
									ret := 0.062907
								if( ema3 > 1.4e-05 )
									ret := 0.611111
						if( tema > 1.5e-05 )
							if( d <= 56.4058 )
								if( rsi1 <= 59.7553 )
									ret := -0.428571
								if( rsi1 > 59.7553 )
									ret := 0.555556
							if( d > 56.4058 )
								if( k <= 99.9085 )
									ret := 0.711579 // buy
								if( k > 99.9085 )
									ret := 0.228571
					if( d_k > -10.1619 )
						if( rsi1 <= 60.2999 )
							if( d_k <= -6.78405 )
								if( ema3 <= 1.4e-05 )
									ret := 0.061674
								if( ema3 > 1.4e-05 )
									ret := 0.808219 // buy
							if( d_k > -6.78405 )
								if( rsi1 <= 56.1636 )
									ret := 0.227273
								if( rsi1 > 56.1636 )
									ret := 0.017682
						if( rsi1 > 60.2999 )
							if( k <= 74.4946 )
								if( ema2 <= 1.3e-05 )
									ret := 0.410072
								if( ema2 > 1.3e-05 )
									ret := 0.670588
							if( k > 74.4946 )
								if( ema3 <= 2e-05 )
									ret := 0.183884
								if( ema3 > 2e-05 )
									ret := 0.456140
				if( d > 88.6236 )
					if( ema3 <= 2.9e-05 )
						if( rsi1 <= 66.613 )
							if( rsi1 <= 65.6384 )
								if( ema3 <= 2.1e-05 )
									ret := 0.319454
								if( ema3 > 2.1e-05 )
									ret := 0.574506
							if( rsi1 > 65.6384 )
								if( ema2 <= 1.4e-05 )
									ret := 0.380392
								if( ema2 > 1.4e-05 )
									ret := 0.711538 // buy
						if( rsi1 > 66.613 )
							if( smoothK_k <= 84.9651 )
								if( tema <= 1.1e-05 )
									ret := 0.037037
								if( tema > 1.1e-05 )
									ret := -0.250000
							if( smoothK_k > 84.9651 )
								if( ema3 <= 1.4e-05 )
									ret := 0.223577
								if( ema3 > 1.4e-05 )
									ret := 0.500000
					if( ema3 > 2.9e-05 )
						if( rsi1 <= 61.8953 )
							if( ema3 <= 3.2e-05 )
								if( smoothK_k <= 84.5908 )
									ret := 0.700000 // buy
								if( smoothK_k > 84.5908 )
									ret := 0.960000 // buy
							if( ema3 > 3.2e-05 )
								if( ema13 <= -0 )
									ret := 0.842105 // buy
								if( ema13 > -0 )
									ret := 0.100000
						if( rsi1 > 61.8953 )
							if( tema <= 3.2e-05 )
								if( smoothK_k <= 91.3163 )
									ret := 0.500000
								if( smoothK_k > 91.3163 )
									ret := 0.800000 // buy
							if( tema > 3.2e-05 )
								if( rsi1 <= 64.8153 )
									ret := -0.333333
								if( rsi1 > 64.8153 )
									ret := 0.750000 // buy
			if( rsi1 > 66.6668 )
				if( rsi1 <= 78.6962 )
					if( d_k <= 7.72672 )
						if( smoothD_d <= 91.9294 )
							if( d_k <= -2.98852 )
								if( ema2 <= 1.8e-05 )
									ret := 0.395012
								if( ema2 > 1.8e-05 )
									ret := 0.677149
							if( d_k > -2.98852 )
								if( ema1 <= 1.6e-05 )
									ret := 0.263534
								if( ema1 > 1.6e-05 )
									ret := 0.504967
						if( smoothD_d > 91.9294 )
							if( rsi1 <= 67.6322 )
								if( rsi1 <= 67.2278 )
									ret := 0.965812 // buy
								if( rsi1 > 67.2278 )
									ret := 0.687500
							if( rsi1 > 67.6322 )
								if( ema1 <= 1.6e-05 )
									ret := 0.348735
								if( ema1 > 1.6e-05 )
									ret := 0.696481
					if( d_k > 7.72672 )
						if( tema <= 1.4e-05 )
							if( d <= 87.8337 )
								if( d <= 87.4539 )
									ret := 0.453782
								if( d > 87.4539 )
									ret := -0.571429
							if( d > 87.8337 )
								if( rsi1 <= 69.0452 )
									ret := 0.849315 // buy
								if( rsi1 > 69.0452 )
									ret := 0.562092
						if( tema > 1.4e-05 )
							if( d <= 83.4963 )
								ret := 0.166667
							if( d > 83.4963 )
								if( tema <= 2.4e-05 )
									ret := 0.932692 // buy
								if( tema > 2.4e-05 )
									ret := 0.714286 // buy
				if( rsi1 > 78.6962 )
					if( tema <= 2e-05 )
						if( ema3 <= 1.8e-05 )
							if( k <= 95.3629 )
								if( ema1 <= 1.5e-05 )
									ret := 0.329396
								if( ema1 > 1.5e-05 )
									ret := 0.818182 // buy
							if( k > 95.3629 )
								if( ema1 <= 1.4e-05 )
									ret := 0.503317
								if( ema1 > 1.4e-05 )
									ret := 0.776536 // buy
						if( ema3 > 1.8e-05 )
							if( smoothK_k <= 84.3336 )
								if( smoothD_d <= 82.1167 )
									ret := -0.125000
								if( smoothD_d > 82.1167 )
									ret := 0.857143 // buy
							if( smoothK_k > 84.3336 )
								if( d <= 98.7859 )
									ret := 0.987500 // buy
								if( d > 98.7859 )
									ret := 0.703704 // buy
					if( tema > 2e-05 )
						if( d <= 99.4106 )
							if( rsi1 <= 78.9033 )
								if( ema2 <= 2.5e-05 )
									ret := -0.200000
								if( ema2 > 2.5e-05 )
									ret := 0.888889 // buy
							if( rsi1 > 78.9033 )
								if( smoothK_k <= 93.1891 )
									ret := 0.892683 // buy
								if( smoothK_k > 93.1891 )
									ret := 0.767241 // buy
						if( d > 99.4106 )
							ret := 1.000000 // buy
	
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_SHIBUSDT_15Min_f793472c(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


