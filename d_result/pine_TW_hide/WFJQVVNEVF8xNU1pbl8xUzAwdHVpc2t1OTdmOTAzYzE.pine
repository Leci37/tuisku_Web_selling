//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: XRPUSDT_15Min_1S00_97f903c1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1S00_97f903c1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_97f903c1(smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothK_k <= 46.7482 )
		if( smoothK_k <= 15.7504 )
			if( smoothD_d <= -0.176415 )
				if( smoothD_d <= -2.99987 )
					if( rsi1 <= 5.35915 )
						ret := 0.733333 // buy
					if( rsi1 > 5.35915 )
						if( rsi1 <= 30.6684 )
							if( rsi1 <= 9.47503 )
								if( rsi1 <= 7.39034 )
									ret := -0.937500 // sell
								if( rsi1 > 7.39034 )
									ret := -0.111111
							if( rsi1 > 9.47503 )
								if( rsi1 <= 21.6853 )
									ret := -0.859375 // sell
								if( rsi1 > 21.6853 )
									ret := -0.699605
						if( rsi1 > 30.6684 )
							if( rsi1 <= 36.8877 )
								if( rsi1 <= 33.7783 )
									ret := 0.021739
								if( rsi1 > 33.7783 )
									ret := -0.222222
							if( rsi1 > 36.8877 )
								if( rsi1 <= 38.8188 )
									ret := -0.900000 // sell
								if( rsi1 > 38.8188 )
									ret := -0.422535
				if( smoothD_d > -2.99987 )
					if( d_k <= -0.08167 )
						if( rsi1 <= 7.62223 )
							if( k <= 1.88467 )
								ret := 0.545455
							if( k > 1.88467 )
								if( rsi1 <= 7.1616 )
									ret := 0.777778 // buy
								if( rsi1 > 7.1616 )
									ret := 1.000000 // buy
						if( rsi1 > 7.62223 )
							if( rsi1 <= 30.7098 )
								if( smoothK_k <= 2.32025 )
									ret := -0.617669
								if( smoothK_k > 2.32025 )
									ret := -0.853503 // sell
							if( rsi1 > 30.7098 )
								if( d_k <= -3.36844 )
									ret := -0.645522
								if( d_k > -3.36844 )
									ret := -0.434375
					if( d_k > -0.08167 )
						if( d <= 2.79466 )
							if( smoothD_d <= -2.66339 )
								if( smoothD_d <= -2.87013 )
									ret := -0.400709
								if( smoothD_d > -2.87013 )
									ret := -0.172727
							if( smoothD_d > -2.66339 )
								if( d_k <= 0.879585 )
									ret := -0.483770
								if( d_k > 0.879585 )
									ret := -0.349118
						if( d > 2.79466 )
							if( rsi1 <= 34.0377 )
								ret := -0.960000 // sell
							if( rsi1 > 34.0377 )
								ret := -0.700000 // sell
			if( smoothD_d > -0.176415 )
				if( rsi1 <= 46.9568 )
					if( d <= 11.5531 )
						if( d_k <= -3.34785 )
							if( k <= 17.2786 )
								if( d_k <= -5.39468 )
									ret := -0.407668
								if( d_k > -5.39468 )
									ret := -0.505411
							if( k > 17.2786 )
								if( k <= 18.4184 )
									ret := -0.735751 // sell
								if( k > 18.4184 )
									ret := -0.431373
						if( d_k > -3.34785 )
							if( rsi1 <= 25.4368 )
								if( d_k <= 8.3729 )
									ret := -0.424395
								if( d_k > 8.3729 )
									ret := -0.865169 // sell
							if( rsi1 > 25.4368 )
								if( rsi1 <= 26.9155 )
									ret := -0.074946
								if( rsi1 > 26.9155 )
									ret := -0.324159
					if( d > 11.5531 )
						if( k <= 4.4898 )
							if( rsi1 <= 43.1611 )
								if( d <= 12.0547 )
									ret := -0.087719
								if( d > 12.0547 )
									ret := -0.466495
							if( rsi1 > 43.1611 )
								if( d <= 13.1973 )
									ret := 0.321429
								if( d > 13.1973 )
									ret := -0.350000
						if( k > 4.4898 )
							if( d <= 32.0386 )
								if( d <= 31.6607 )
									ret := -0.261824
								if( d > 31.6607 )
									ret := 0.609756
							if( d > 32.0386 )
								if( k <= 6.72372 )
									ret := 0.352941
								if( k > 6.72372 )
									ret := -0.432193
				if( rsi1 > 46.9568 )
					if( rsi1 <= 64.6666 )
						if( smoothD_d <= 0.033067 )
							if( smoothD_d <= -0.082421 )
								ret := 0.000000
							if( smoothD_d > -0.082421 )
								if( d <= 2.97871 )
									ret := 0.846154 // buy
								if( d > 2.97871 )
									ret := 0.500000
						if( smoothD_d > 0.033067 )
							if( d <= 16.4494 )
								if( d_k <= -3.2006 )
									ret := -0.226300
								if( d_k > -3.2006 )
									ret := -0.060061
							if( d > 16.4494 )
								if( k <= 16.4053 )
									ret := -0.244382
								if( k > 16.4053 )
									ret := 0.023061
					if( rsi1 > 64.6666 )
						if( smoothD_d <= 3.22196 )
							if( d_k <= 0.563468 )
								if( k <= 10.3318 )
									ret := -0.937500 // sell
								if( k > 10.3318 )
									ret := -0.647059
							if( d_k > 0.563468 )
								ret := 0.000000
						if( smoothD_d > 3.22196 )
							if( rsi1 <= 73.3831 )
								if( smoothD_d <= 5.20929 )
									ret := 0.721311 // buy
								if( smoothD_d > 5.20929 )
									ret := 0.061425
							if( rsi1 > 73.3831 )
								if( smoothD_d <= 16.9463 )
									ret := 0.000000
								if( smoothD_d > 16.9463 )
									ret := 0.897436 // buy
		if( smoothK_k > 15.7504 )
			if( smoothK_k <= 31.2341 )
				if( d_k <= -11.1991 )
					if( smoothK_k <= 30.3365 )
						if( rsi1 <= 43.391 )
							if( d <= 8.36159 )
								if( rsi1 <= 36.5847 )
									ret := -1.000000 // sell
								if( rsi1 > 36.5847 )
									ret := -0.214286
							if( d > 8.36159 )
								if( d <= 8.43852 )
									ret := 0.400000
								if( d > 8.43852 )
									ret := -0.448698
						if( rsi1 > 43.391 )
							if( d_k <= -17.1954 )
								if( smoothD_d <= 11.2747 )
									ret := 0.214286
								if( smoothD_d > 11.2747 )
									ret := 0.650000
							if( d_k > -17.1954 )
								if( rsi1 <= 51.8109 )
									ret := -0.144928
								if( rsi1 > 51.8109 )
									ret := 0.063910
					if( smoothK_k > 30.3365 )
						if( d <= 19.2017 )
							if( d_k <= -16.0837 )
								if( smoothD_d <= 12.7155 )
									ret := -0.083333
								if( smoothD_d > 12.7155 )
									ret := 0.285714
							if( d_k > -16.0837 )
								if( d <= 18.2634 )
									ret := -0.555556
								if( d > 18.2634 )
									ret := -0.166667
						if( d > 19.2017 )
							if( smoothK_k <= 30.6898 )
								if( smoothK_k <= 30.4106 )
									ret := -0.714286 // sell
								if( smoothK_k > 30.4106 )
									ret := -0.979167 // sell
							if( smoothK_k > 30.6898 )
								if( k <= 33.8391 )
									ret := -0.100000
								if( k > 33.8391 )
									ret := -0.666667
				if( d_k > -11.1991 )
					if( rsi1 <= 23.3696 )
						if( d <= 56.3952 )
							if( smoothK_k <= 17.2674 )
								if( d <= 19.6022 )
									ret := -0.484848
								if( d > 19.6022 )
									ret := -0.962963 // sell
							if( smoothK_k > 17.2674 )
								if( smoothD_d <= 42.5119 )
									ret := -0.471299
								if( smoothD_d > 42.5119 )
									ret := -0.916667 // sell
						if( d > 56.3952 )
							ret := 0.647059
					if( rsi1 > 23.3696 )
						if( rsi1 <= 45.8864 )
							if( smoothK_k <= 15.8355 )
								if( smoothD_d <= 10.4295 )
									ret := 0.666667
								if( smoothD_d > 10.4295 )
									ret := 0.022222
							if( smoothK_k > 15.8355 )
								if( d <= 16.5713 )
									ret := -0.308340
								if( d > 16.5713 )
									ret := -0.137498
						if( rsi1 > 45.8864 )
							if( smoothD_d <= 23.5718 )
								if( smoothD_d <= 6.69968 )
									ret := -0.722222 // sell
								if( smoothD_d > 6.69968 )
									ret := 0.047717
							if( smoothD_d > 23.5718 )
								if( smoothK_k <= 22.3132 )
									ret := -0.160370
								if( smoothK_k > 22.3132 )
									ret := -0.042355
			if( smoothK_k > 31.2341 )
				if( d <= 18.4415 )
					if( rsi1 <= 57.5898 )
						if( smoothK_k <= 33.4009 )
							if( rsi1 <= 42.995 )
								if( k <= 34.9889 )
									ret := -0.769231 // sell
								if( k > 34.9889 )
									ret := -0.914286 // sell
							if( rsi1 > 42.995 )
								if( d <= 17.4614 )
									ret := -0.666667
								if( d > 17.4614 )
									ret := 0.000000
						if( smoothK_k > 33.4009 )
							if( d <= 17.1734 )
								ret := 0.466667
							if( d > 17.1734 )
								if( k <= 39.2245 )
									ret := -0.166667
								if( k > 39.2245 )
									ret := -0.722222 // sell
					if( rsi1 > 57.5898 )
						if( smoothD_d <= 13.5722 )
							ret := 0.461538
						if( smoothD_d > 13.5722 )
							ret := 0.000000
				if( d > 18.4415 )
					if( rsi1 <= 41.6843 )
						if( d <= 46.079 )
							if( d_k <= -13.9365 )
								if( k <= 43.7161 )
									ret := -0.520958
								if( k > 43.7161 )
									ret := -0.231092
							if( d_k > -13.9365 )
								if( rsi1 <= 23.8505 )
									ret := -0.602410
								if( rsi1 > 23.8505 )
									ret := -0.011479
						if( d > 46.079 )
							if( d_k <= 4.89828 )
								if( rsi1 <= 37.8685 )
									ret := -0.275641
								if( rsi1 > 37.8685 )
									ret := 0.263158
							if( d_k > 4.89828 )
								if( rsi1 <= 23.5066 )
									ret := -0.721311 // sell
								if( rsi1 > 23.5066 )
									ret := -0.345508
					if( rsi1 > 41.6843 )
						if( d <= 39.1466 )
							if( rsi1 <= 78.1442 )
								if( d_k <= 3.04428 )
									ret := 0.103937
								if( d_k > 3.04428 )
									ret := 0.717949 // buy
							if( rsi1 > 78.1442 )
								if( d_k <= -8.17568 )
									ret := -0.545455
								if( d_k > -8.17568 )
									ret := -0.947368 // sell
						if( d > 39.1466 )
							if( rsi1 <= 73.7388 )
								if( smoothK_k <= 46.1288 )
									ret := 0.017101
								if( smoothK_k > 46.1288 )
									ret := -0.367164
							if( rsi1 > 73.7388 )
								if( smoothK_k <= 41.6155 )
									ret := 0.714286 // buy
								if( smoothK_k > 41.6155 )
									ret := 0.200000
	if( smoothK_k > 46.7482 )
		if( k <= 85.5566 )
			if( rsi1 <= 45.2711 )
				if( d <= 88.172 )
					if( d_k <= 1.64415 )
						if( smoothK_k <= 48.1178 )
							if( rsi1 <= 25.6779 )
								if( smoothK_k <= 47.6026 )
									ret := 0.700000 // buy
								if( smoothK_k > 47.6026 )
									ret := 0.500000
							if( rsi1 > 25.6779 )
								if( d <= 47.2342 )
									ret := -0.062147
								if( d > 47.2342 )
									ret := -0.855072 // sell
						if( smoothK_k > 48.1178 )
							if( d_k <= -12.4562 )
								if( smoothD_d <= 53.6603 )
									ret := -0.009608
								if( smoothD_d > 53.6603 )
									ret := -0.170874
							if( d_k > -12.4562 )
								if( rsi1 <= 32.7908 )
									ret := -0.026585
								if( rsi1 > 32.7908 )
									ret := 0.112431
					if( d_k > 1.64415 )
						if( k <= 76.9525 )
							if( smoothK_k <= 65.9096 )
								if( d_k <= 15.44 )
									ret := -0.166391
								if( d_k > 15.44 )
									ret := 0.041152
							if( smoothK_k > 65.9096 )
								if( d <= 75.9738 )
									ret := -0.454545
								if( d > 75.9738 )
									ret := 0.168646
						if( k > 76.9525 )
							if( smoothK_k <= 77.2414 )
								if( k <= 78.9223 )
									ret := -0.548387
								if( k > 78.9223 )
									ret := 0.333333
							if( smoothK_k > 77.2414 )
								if( d_k <= 2.85664 )
									ret := -0.083333
								if( d_k > 2.85664 )
									ret := -0.741935 // sell
				if( d > 88.172 )
					if( smoothK_k <= 82.2272 )
						if( rsi1 <= 41.3835 )
							if( rsi1 <= 29.8083 )
								ret := 0.888889 // buy
							if( rsi1 > 29.8083 )
								if( smoothD_d <= 88.5837 )
									ret := -0.341463
								if( smoothD_d > 88.5837 )
									ret := 0.136364
						if( rsi1 > 41.3835 )
							if( k <= 76.0241 )
								if( d <= 89.4565 )
									ret := 0.769231 // buy
								if( d > 89.4565 )
									ret := 1.000000 // buy
							if( k > 76.0241 )
								if( k <= 80.8035 )
									ret := 0.000000
								if( k > 80.8035 )
									ret := 0.740000 // buy
					if( smoothK_k > 82.2272 )
						ret := -0.615385
			if( rsi1 > 45.2711 )
				if( rsi1 <= 74.6637 )
					if( smoothD_d <= 56.0692 )
						if( d_k <= -3.59588 )
							if( d_k <= -15.5795 )
								if( k <= 50.3132 )
									ret := 0.743590 // buy
								if( k > 50.3132 )
									ret := 0.186344
							if( d_k > -15.5795 )
								if( smoothD_d <= 34.4562 )
									ret := 0.729167 // buy
								if( smoothD_d > 34.4562 )
									ret := 0.313604
						if( d_k > -3.59588 )
							if( k <= 53.9813 )
								if( smoothD_d <= 55.9362 )
									ret := -0.101533
								if( smoothD_d > 55.9362 )
									ret := 0.823529 // buy
							if( k > 53.9813 )
								if( d_k <= -2.5622 )
									ret := -0.238095
								if( d_k > -2.5622 )
									ret := 0.282407
					if( smoothD_d > 56.0692 )
						if( smoothD_d <= 79.3781 )
							if( k <= 76.1968 )
								if( smoothD_d <= 69.725 )
									ret := 0.042722
								if( smoothD_d > 69.725 )
									ret := 0.109686
							if( k > 76.1968 )
								if( d_k <= -11.1552 )
									ret := 0.291702
								if( d_k > -11.1552 )
									ret := 0.132336
						if( smoothD_d > 79.3781 )
							if( d_k <= 4.53332 )
								if( d_k <= 2.68482 )
									ret := 0.149206
								if( d_k > 2.68482 )
									ret := -0.142857
							if( d_k > 4.53332 )
								if( k <= 83.8549 )
									ret := 0.301934
								if( k > 83.8549 )
									ret := 0.116883
				if( rsi1 > 74.6637 )
					if( rsi1 <= 82.9866 )
						if( d <= 88.0948 )
							if( smoothD_d <= 78.8948 )
								if( d_k <= -8.47594 )
									ret := 0.582386
								if( d_k > -8.47594 )
									ret := 0.153351
							if( smoothD_d > 78.8948 )
								if( k <= 78.9263 )
									ret := 0.751592 // buy
								if( k > 78.9263 )
									ret := 0.423868
						if( d > 88.0948 )
							if( d_k <= 10.9349 )
								if( d_k <= 8.38297 )
									ret := 0.044248
								if( d_k > 8.38297 )
									ret := -0.452830
							if( d_k > 10.9349 )
								ret := 0.925926 // buy
					if( rsi1 > 82.9866 )
						if( smoothD_d <= 86.6857 )
							if( k <= 64.587 )
								if( d_k <= -5.18486 )
									ret := 1.000000 // buy
								if( d_k > -5.18486 )
									ret := 0.923077 // buy
							if( k > 64.587 )
								if( rsi1 <= 86.7697 )
									ret := 0.532374
								if( rsi1 > 86.7697 )
									ret := 0.924051 // buy
						if( smoothD_d > 86.6857 )
							ret := -0.142857
		if( k > 85.5566 )
			if( rsi1 <= 56.6844 )
				if( d <= 97.972 )
					if( rsi1 <= 52.8606 )
						if( smoothD_d <= 67.2039 )
							if( smoothD_d <= 63.7764 )
								if( k <= 86.1768 )
									ret := -0.444444
								if( k > 86.1768 )
									ret := 0.233083
							if( smoothD_d > 63.7764 )
								if( rsi1 <= 46.6628 )
									ret := -0.472527
								if( rsi1 > 46.6628 )
									ret := -0.070175
						if( smoothD_d > 67.2039 )
							if( d <= 72.3534 )
								if( smoothK_k <= 84.4008 )
									ret := 0.090909
								if( smoothK_k > 84.4008 )
									ret := 0.754098 // buy
							if( d > 72.3534 )
								if( smoothK_k <= 84.9626 )
									ret := 0.020033
								if( smoothK_k > 84.9626 )
									ret := 0.135255
					if( rsi1 > 52.8606 )
						if( rsi1 <= 56.0929 )
							if( k <= 89.4423 )
								if( d <= 67.8386 )
									ret := -0.513514
								if( d > 67.8386 )
									ret := 0.192641
							if( k > 89.4423 )
								if( smoothK_k <= 86.779 )
									ret := 0.743902 // buy
								if( smoothK_k > 86.779 )
									ret := 0.326460
						if( rsi1 > 56.0929 )
							if( d <= 97.5672 )
								if( smoothD_d <= 75.3874 )
									ret := -0.288462
								if( smoothD_d > 75.3874 )
									ret := 0.123134
							if( d > 97.5672 )
								ret := -1.000000 // sell
				if( d > 97.972 )
					if( k <= 99.713 )
						if( k <= 99.1727 )
							if( k <= 94.9935 )
								if( smoothD_d <= 95.238 )
									ret := 0.857143 // buy
								if( smoothD_d > 95.238 )
									ret := 0.800000 // buy
							if( k > 94.9935 )
								if( d_k <= 2.4691 )
									ret := 0.483019
								if( d_k > 2.4691 )
									ret := -0.152174
						if( k > 99.1727 )
							if( rsi1 <= 51.2463 )
								if( k <= 99.5091 )
									ret := 0.818182 // buy
								if( k > 99.5091 )
									ret := 0.000000
							if( rsi1 > 51.2463 )
								if( k <= 99.4329 )
									ret := -0.947368 // sell
								if( k > 99.4329 )
									ret := -0.312500
					if( k > 99.713 )
						if( rsi1 <= 49.5306 )
							if( k <= 99.9983 )
								ret := 1.000000 // buy
							if( k > 99.9983 )
								if( rsi1 <= 46.283 )
									ret := 0.277778
								if( rsi1 > 46.283 )
									ret := -0.257143
						if( rsi1 > 49.5306 )
							if( rsi1 <= 52.2204 )
								if( d_k <= -0.414495 )
									ret := 0.884615 // buy
								if( d_k > -0.414495 )
									ret := 0.230769
							if( rsi1 > 52.2204 )
								if( d <= 98.7621 )
									ret := 0.953488 // buy
								if( d > 98.7621 )
									ret := 0.691176
			if( rsi1 > 56.6844 )
				if( d <= 97.5144 )
					if( rsi1 <= 74.7005 )
						if( d_k <= -12.3685 )
							if( d <= 78.1682 )
								if( smoothD_d <= 63.1061 )
									ret := 0.542289
								if( smoothD_d > 63.1061 )
									ret := 0.306587
							if( d > 78.1682 )
								if( d <= 79.9698 )
									ret := 0.755952 // buy
								if( d > 79.9698 )
									ret := 0.521930
						if( d_k > -12.3685 )
							if( d_k <= -2.34051 )
								if( rsi1 <= 63.8488 )
									ret := 0.199087
								if( rsi1 > 63.8488 )
									ret := 0.302114
							if( d_k > -2.34051 )
								if( smoothD_d <= 92.8952 )
									ret := 0.396862
								if( smoothD_d > 92.8952 )
									ret := 0.218417
					if( rsi1 > 74.7005 )
						if( smoothK_k <= 92.054 )
							if( smoothK_k <= 89.479 )
								if( smoothD_d <= 93.8438 )
									ret := 0.487233
								if( smoothD_d > 93.8438 )
									ret := -0.571429
							if( smoothK_k > 89.479 )
								if( smoothD_d <= 79.5283 )
									ret := 0.392405
								if( smoothD_d > 79.5283 )
									ret := 0.727273 // buy
						if( smoothK_k > 92.054 )
							if( k <= 95.4831 )
								if( rsi1 <= 78.669 )
									ret := -0.338235
								if( rsi1 > 78.669 )
									ret := 0.509091
							if( k > 95.4831 )
								if( smoothD_d <= 93.5351 )
									ret := 0.516243
								if( smoothD_d > 93.5351 )
									ret := 0.239203
				if( d > 97.5144 )
					if( rsi1 <= 63.0291 )
						if( d_k <= -0.063204 )
							if( smoothD_d <= 95.7572 )
								if( smoothD_d <= 94.8624 )
									ret := -0.031250
								if( smoothD_d > 94.8624 )
									ret := 0.328947
							if( smoothD_d > 95.7572 )
								if( smoothD_d <= 96.42 )
									ret := -0.390625
								if( smoothD_d > 96.42 )
									ret := 0.090909
						if( d_k > -0.063204 )
							if( rsi1 <= 61.8903 )
								if( rsi1 <= 60.9192 )
									ret := 0.392727
								if( rsi1 > 60.9192 )
									ret := 0.772727 // buy
							if( rsi1 > 61.8903 )
								if( k <= 99.522 )
									ret := 0.211538
								if( k > 99.522 )
									ret := -0.636364
					if( rsi1 > 63.0291 )
						if( k <= 99.171 )
							if( d_k <= 0.859828 )
								if( d_k <= -0.525407 )
									ret := 0.548673
								if( d_k > -0.525407 )
									ret := 0.766625 // buy
							if( d_k > 0.859828 )
								if( d_k <= 1.93518 )
									ret := 0.254902
								if( d_k > 1.93518 )
									ret := 0.562762
						if( k > 99.171 )
							if( d_k <= 0.00231 )
								if( smoothK_k <= 96.287 )
									ret := -0.361111
								if( smoothK_k > 96.287 )
									ret := 0.490390
							if( d_k > 0.00231 )
								if( k <= 99.9493 )
									ret := 0.346320
								if( k > 99.9493 )
									ret := -0.360000
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_97f903c1(smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


