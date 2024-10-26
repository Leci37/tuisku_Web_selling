//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: XLMUSDT_30Min_2ST0_caac6d66 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2ST0_caac6d66", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_caac6d66(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 50.0036 )
		if( ema12 <= 0.000113 )
			if( rsi1 <= 36.9438 )
				if( d_k <= -4.77907 )
					if( d_k <= -11.5735 )
						if( ema12 <= -0.001062 )
							if( rsi1 <= 22.1688 )
								if( d <= 19.3984 )
									ret := 0.066667
								if( d > 19.3984 )
									ret := -0.594595
							if( rsi1 > 22.1688 )
								if( ema12 <= -0.002245 )
									ret := 0.600739
								if( ema12 > -0.002245 )
									ret := 0.212500
						if( ema12 > -0.001062 )
							if( ema2 <= 0.096503 )
								if( smoothK_k <= 29.838 )
									ret := 0.366667
								if( smoothK_k > 29.838 )
									ret := -0.007042
							if( ema2 > 0.096503 )
								if( rsi1 <= 33.269 )
									ret := -0.630573
								if( rsi1 > 33.269 )
									ret := -0.212121
					if( d_k > -11.5735 )
						if( ema12 <= -0.001409 )
							if( rsi1 <= 26.3849 )
								if( ema1 <= 0.123277 )
									ret := 0.534884
								if( ema1 > 0.123277 )
									ret := -0.369718
							if( rsi1 > 26.3849 )
								if( smoothD_d <= 1.64921 )
									ret := -0.800000 // sell
								if( smoothD_d > 1.64921 )
									ret := 0.221180
						if( ema12 > -0.001409 )
							if( tema <= 0.093236 )
								if( ema12 <= -0.000396 )
									ret := 0.237410
								if( ema12 > -0.000396 )
									ret := -0.093750
							if( tema > 0.093236 )
								if( ema13 <= -0.000873 )
									ret := -0.304673
								if( ema13 > -0.000873 )
									ret := -0.555351
				if( d_k > -4.77907 )
					if( rsi1 <= 26.2818 )
						if( tema <= 0.093221 )
							if( rsi1 <= 11.0188 )
								if( ema13 <= -0.00072 )
									ret := -0.958333 // sell
								if( ema13 > -0.00072 )
									ret := -0.392857
							if( rsi1 > 11.0188 )
								if( tema <= 0.080364 )
									ret := 0.010870
								if( tema > 0.080364 )
									ret := -0.386667
						if( tema > 0.093221 )
							if( rsi1 <= 15.9931 )
								if( d_k <= -3.79112 )
									ret := -0.428571
								if( d_k > -3.79112 )
									ret := -0.851675 // sell
							if( rsi1 > 15.9931 )
								if( ema12 <= -0.001684 )
									ret := -0.396396
								if( ema12 > -0.001684 )
									ret := -0.681590
					if( rsi1 > 26.2818 )
						if( tema <= 0.119821 )
							if( ema13 <= -5.4e-05 )
								if( ema12 <= -0.000813 )
									ret := 0.200820
								if( ema12 > -0.000813 )
									ret := -0.180847
							if( ema13 > -5.4e-05 )
								if( ema12 <= 3.7e-05 )
									ret := -0.306250
								if( ema12 > 3.7e-05 )
									ret := -0.565957
						if( tema > 0.119821 )
							if( ema12 <= -0.001508 )
								if( tema <= 0.303241 )
									ret := 0.006438
								if( tema > 0.303241 )
									ret := -0.314922
							if( ema12 > -0.001508 )
								if( ema12 <= -0.000543 )
									ret := -0.454208
								if( ema12 > -0.000543 )
									ret := -0.710275 // sell
			if( rsi1 > 36.9438 )
				if( ema12 <= -0.000536 )
					if( rsi1 <= 39.9235 )
						if( d_k <= -3.83392 )
							if( ema12 <= -0.001599 )
								if( smoothK_k <= 39.1369 )
									ret := 0.381890
								if( smoothK_k > 39.1369 )
									ret := 0.674576
							if( ema12 > -0.001599 )
								if( ema1 <= 0.193817 )
									ret := 0.234568
								if( ema1 > 0.193817 )
									ret := -0.155689
						if( d_k > -3.83392 )
							if( ema1 <= 0.210322 )
								if( ema12 <= -0.002448 )
									ret := 0.833333 // buy
								if( ema12 > -0.002448 )
									ret := 0.012658
							if( ema1 > 0.210322 )
								if( smoothD_d <= 14.4193 )
									ret := -0.023697
								if( smoothD_d > 14.4193 )
									ret := -0.404706
					if( rsi1 > 39.9235 )
						if( d_k <= -4.9871 )
							if( ema12 <= -0.001933 )
								if( d_k <= -20.3623 )
									ret := 0.930131 // buy
								if( d_k > -20.3623 )
									ret := 0.685678
							if( ema12 > -0.001933 )
								if( rsi1 <= 45.3047 )
									ret := 0.335341
								if( rsi1 > 45.3047 )
									ret := 0.596455
						if( d_k > -4.9871 )
							if( tema <= 0.379914 )
								if( ema2 <= 0.162038 )
									ret := 0.508972
								if( ema2 > 0.162038 )
									ret := 0.196929
							if( tema > 0.379914 )
								if( k <= 71.0444 )
									ret := -0.054237
								if( k > 71.0444 )
									ret := -0.479290
				if( ema12 > -0.000536 )
					if( tema <= 0.119541 )
						if( ema12 <= -0.000103 )
							if( ema12 <= -0.000357 )
								if( rsi1 <= 45.9232 )
									ret := 0.157895
								if( rsi1 > 45.9232 )
									ret := 0.470270
							if( ema12 > -0.000357 )
								if( ema3 <= 0.102068 )
									ret := 0.094170
								if( ema3 > 0.102068 )
									ret := 0.008289
						if( ema12 > -0.000103 )
							if( rsi1 <= 39.9921 )
								if( ema12 <= 4.1e-05 )
									ret := -0.235149
								if( ema12 > 4.1e-05 )
									ret := -0.523077
							if( rsi1 > 39.9921 )
								if( ema2 <= 0.088443 )
									ret := 0.024236
								if( ema2 > 0.088443 )
									ret := -0.115752
					if( tema > 0.119541 )
						if( rsi1 <= 44.7354 )
							if( rsi1 <= 39.9653 )
								if( ema12 <= -0.000221 )
									ret := -0.345609
								if( ema12 > -0.000221 )
									ret := -0.584650
							if( rsi1 > 39.9653 )
								if( ema12 <= -0.000356 )
									ret := -0.108861
								if( ema12 > -0.000356 )
									ret := -0.346223
						if( rsi1 > 44.7354 )
							if( ema12 <= -0.00011 )
								if( ema13 <= -0.001175 )
									ret := -0.277027
								if( ema13 > -0.001175 )
									ret := 0.165489
							if( ema12 > -0.00011 )
								if( d_k <= -19.8572 )
									ret := -0.777778 // sell
								if( d_k > -19.8572 )
									ret := -0.085443
		if( ema12 > 0.000113 )
			if( rsi1 <= 41.6608 )
				if( tema <= 0.126509 )
					if( rsi1 <= 37.7575 )
						if( ema12 <= 0.000263 )
							if( tema <= 0.098622 )
								if( ema13 <= 0.000303 )
									ret := -0.827586 // sell
								if( ema13 > 0.000303 )
									ret := -0.457143
							if( tema > 0.098622 )
								if( ema2 <= 0.106615 )
									ret := -0.897436 // sell
								if( ema2 > 0.106615 )
									ret := -0.661290
						if( ema12 > 0.000263 )
							if( d_k <= -2e-06 )
								if( ema12 <= 0.000323 )
									ret := -0.857143 // sell
								if( ema12 > 0.000323 )
									ret := -1.000000 // sell
							if( d_k > -2e-06 )
								if( ema13 <= 0.000696 )
									ret := -0.927536 // sell
								if( ema13 > 0.000696 )
									ret := -0.684211
					if( rsi1 > 37.7575 )
						if( ema12 <= 0.000357 )
							if( rsi1 <= 41.1749 )
								if( k <= 4.49319 )
									ret := -0.357895
								if( k > 4.49319 )
									ret := -0.601562
							if( rsi1 > 41.1749 )
								if( d_k <= 5.89254 )
									ret := -0.421053
								if( d_k > 5.89254 )
									ret := 0.000000
						if( ema12 > 0.000357 )
							if( smoothD_d <= -1.57414 )
								if( rsi1 <= 39.3183 )
									ret := 0.000000
								if( rsi1 > 39.3183 )
									ret := -0.250000
							if( smoothD_d > -1.57414 )
								if( ema13 <= 0.00138 )
									ret := -0.911111 // sell
								if( ema13 > 0.00138 )
									ret := -0.555556
				if( tema > 0.126509 )
					if( rsi1 <= 39.7212 )
						if( d_k <= 3.65335 )
							if( ema12 <= 0.000459 )
								if( ema13 <= 0.001688 )
									ret := -0.800000 // sell
								if( ema13 > 0.001688 )
									ret := -0.222222
							if( ema12 > 0.000459 )
								if( d_k <= 3.53341 )
									ret := -0.940120 // sell
								if( d_k > 3.53341 )
									ret := -0.600000
						if( d_k > 3.65335 )
							if( tema <= 0.138399 )
								if( ema13 <= 0.00118 )
									ret := -0.870968 // sell
								if( ema13 > 0.00118 )
									ret := -0.428571
							if( tema > 0.138399 )
								if( k <= 46.2319 )
									ret := -0.950658 // sell
								if( k > 46.2319 )
									ret := -0.777778 // sell
					if( rsi1 > 39.7212 )
						if( d_k <= 9.73692 )
							if( smoothD_d <= 18.057 )
								if( ema12 <= 0.000142 )
									ret := -0.142857
								if( ema12 > 0.000142 )
									ret := -0.728000 // sell
							if( smoothD_d > 18.057 )
								if( smoothD_d <= 26.8999 )
									ret := 0.500000
								if( smoothD_d > 26.8999 )
									ret := -0.633333
						if( d_k > 9.73692 )
							if( smoothK_k <= 2.29252 )
								if( ema12 <= 0.000499 )
									ret := -0.333333
								if( ema12 > 0.000499 )
									ret := -0.909091 // sell
							if( smoothK_k > 2.29252 )
								if( smoothD_d <= 79.1163 )
									ret := -0.933333 // sell
								if( smoothD_d > 79.1163 )
									ret := -0.500000
			if( rsi1 > 41.6608 )
				if( ema12 <= 0.000418 )
					if( d <= 62.9484 )
						if( k <= 9.04108 )
							if( ema2 <= 0.43913 )
								if( ema12 <= 0.000278 )
									ret := -0.078240
								if( ema12 > 0.000278 )
									ret := -0.375610
							if( ema2 > 0.43913 )
								ret := 1.000000 // buy
						if( k > 9.04108 )
							if( rsi1 <= 46.8697 )
								if( d <= 19.8788 )
									ret := -0.622857
								if( d > 19.8788 )
									ret := -0.406176
							if( rsi1 > 46.8697 )
								if( ema3 <= 0.233455 )
									ret := -0.245243
								if( ema3 > 0.233455 )
									ret := 0.129870
					if( d > 62.9484 )
						if( rsi1 <= 49.1769 )
							if( ema12 <= 0.000117 )
								if( d_k <= 12.407 )
									ret := 0.500000
								if( d_k > 12.407 )
									ret := -0.250000
							if( ema12 > 0.000117 )
								if( d_k <= 18.3036 )
									ret := -0.691176
								if( d_k > 18.3036 )
									ret := -0.472222
						if( rsi1 > 49.1769 )
							if( d_k <= 7.817 )
								if( tema <= 0.2481 )
									ret := -0.560976
								if( tema > 0.2481 )
									ret := 0.285714
							if( d_k > 7.817 )
								if( d_k <= 13.1178 )
									ret := 0.156250
								if( d_k > 13.1178 )
									ret := -0.315789
				if( ema12 > 0.000418 )
					if( smoothD_d <= 16.6251 )
						if( d <= 16.5234 )
							if( k <= 6.57791 )
								if( ema12 <= 0.0011 )
									ret := -0.586006
								if( ema12 > 0.0011 )
									ret := -0.796813 // sell
							if( k > 6.57791 )
								if( k <= 12.6989 )
									ret := -0.317647
								if( k > 12.6989 )
									ret := -0.781609 // sell
						if( d > 16.5234 )
							if( smoothK_k <= 11.3119 )
								if( ema13 <= 0.007257 )
									ret := -0.459016
								if( ema13 > 0.007257 )
									ret := 0.875000 // buy
							if( smoothK_k > 11.3119 )
								if( ema13 <= 0.001795 )
									ret := 0.333333
								if( ema13 > 0.001795 )
									ret := 0.900000 // buy
					if( smoothD_d > 16.6251 )
						if( d_k <= -4.15944 )
							if( k <= 50.2646 )
								if( ema3 <= 0.42166 )
									ret := 0.090909
								if( ema3 > 0.42166 )
									ret := 1.000000 // buy
							if( k > 50.2646 )
								if( ema2 <= 0.196198 )
									ret := 0.250000
								if( ema2 > 0.196198 )
									ret := -0.763158 // sell
						if( d_k > -4.15944 )
							if( ema12 <= 0.000675 )
								if( tema <= 0.110295 )
									ret := -0.194444
								if( tema > 0.110295 )
									ret := -0.610619
							if( ema12 > 0.000675 )
								if( ema13 <= 0.005428 )
									ret := -0.763966 // sell
								if( ema13 > 0.005428 )
									ret := -0.971698 // sell
	if( rsi1 > 50.0036 )
		if( d_k <= 5.18619 )
			if( ema12 <= -0.000207 )
				if( d_k <= -2.63259 )
					if( ema3 <= 0.156211 )
						if( rsi1 <= 58.3401 )
							if( ema12 <= -0.00035 )
								if( ema2 <= 0.149212 )
									ret := 0.702174 // buy
								if( ema2 > 0.149212 )
									ret := 0.172414
							if( ema12 > -0.00035 )
								if( ema13 <= -0.000558 )
									ret := 0.179245
								if( ema13 > -0.000558 )
									ret := 0.518367
						if( rsi1 > 58.3401 )
							if( ema13 <= -0.002708 )
								ret := 0.142857
							if( ema13 > -0.002708 )
								if( ema1 <= 0.130141 )
									ret := 0.702532 // buy
								if( ema1 > 0.130141 )
									ret := 0.878049 // buy
					if( ema3 > 0.156211 )
						if( ema12 <= -0.000969 )
							if( d_k <= -32.4088 )
								ret := -0.250000
							if( d_k > -32.4088 )
								if( ema2 <= 0.167344 )
									ret := 0.384615
								if( ema2 > 0.167344 )
									ret := 0.863736 // buy
						if( ema12 > -0.000969 )
							if( ema13 <= -0.004414 )
								if( ema12 <= -0.000515 )
									ret := -0.750000 // sell
								if( ema12 > -0.000515 )
									ret := -1.000000 // sell
							if( ema13 > -0.004414 )
								if( ema3 <= 0.511152 )
									ret := 0.785395 // buy
								if( ema3 > 0.511152 )
									ret := 0.250000
				if( d_k > -2.63259 )
					if( smoothK_k <= 96.4909 )
						if( rsi1 <= 58.4862 )
							if( smoothK_k <= 95.4621 )
								if( d_k <= 3.75535 )
									ret := 0.419602
								if( d_k > 3.75535 )
									ret := 0.737705 // buy
							if( smoothK_k > 95.4621 )
								if( smoothD_d <= 95.8119 )
									ret := 0.045455
								if( smoothD_d > 95.8119 )
									ret := -0.681818
						if( rsi1 > 58.4862 )
							if( tema <= 0.49844 )
								if( ema1 <= 0.120426 )
									ret := 0.687943
								if( ema1 > 0.120426 )
									ret := 0.854167 // buy
							if( tema > 0.49844 )
								ret := -0.500000
					if( smoothK_k > 96.4909 )
						if( rsi1 <= 60.3486 )
							if( ema13 <= -0.005153 )
								ret := 1.000000 // buy
							if( ema13 > -0.005153 )
								if( ema13 <= -0.003776 )
									ret := -0.333333
								if( ema13 > -0.003776 )
									ret := 0.511111
						if( rsi1 > 60.3486 )
							if( smoothD_d <= 94.5532 )
								if( d <= 97.4097 )
									ret := 1.000000 // buy
								if( d > 97.4097 )
									ret := 0.285714
							if( smoothD_d > 94.5532 )
								if( ema13 <= -0.000702 )
									ret := 0.922581 // buy
								if( ema13 > -0.000702 )
									ret := 0.600000
			if( ema12 > -0.000207 )
				if( rsi1 <= 63.6544 )
					if( rsi1 <= 55.8838 )
						if( ema12 <= 0.000225 )
							if( ema12 <= -4.3e-05 )
								if( d <= 62.0379 )
									ret := 0.350467
								if( d > 62.0379 )
									ret := 0.119171
							if( ema12 > -4.3e-05 )
								if( ema13 <= 0.000355 )
									ret := 0.018182
								if( ema13 > 0.000355 )
									ret := 0.274854
						if( ema12 > 0.000225 )
							if( ema12 <= 0.001295 )
								if( smoothK_k <= 3.93062 )
									ret := 0.199095
								if( smoothK_k > 3.93062 )
									ret := -0.188186
							if( ema12 > 0.001295 )
								if( d_k <= -10.1565 )
									ret := 0.294118
								if( d_k > -10.1565 )
									ret := -0.540682
					if( rsi1 > 55.8838 )
						if( ema12 <= -4e-05 )
							if( ema3 <= 0.125167 )
								if( rsi1 <= 60.002 )
									ret := 0.302326
								if( rsi1 > 60.002 )
									ret := 0.490964
							if( ema3 > 0.125167 )
								if( ema13 <= -0.000209 )
									ret := 0.512605
								if( ema13 > -0.000209 )
									ret := 0.802083 // buy
						if( ema12 > -4e-05 )
							if( ema2 <= 0.122606 )
								if( ema12 <= 0.000239 )
									ret := 0.126161
								if( ema12 > 0.000239 )
									ret := -0.044181
							if( ema2 > 0.122606 )
								if( ema13 <= 0.003203 )
									ret := 0.339248
								if( ema13 > 0.003203 )
									ret := 0.062291
				if( rsi1 > 63.6544 )
					if( ema3 <= 0.129395 )
						if( rsi1 <= 75.0001 )
							if( ema12 <= 0.000891 )
								if( ema3 <= 0.09463 )
									ret := 0.181575
								if( ema3 > 0.09463 )
									ret := 0.395485
							if( ema12 > 0.000891 )
								if( d <= 2.60376 )
									ret := -0.888889 // sell
								if( d > 2.60376 )
									ret := -0.033445
						if( rsi1 > 75.0001 )
							if( ema3 <= 0.084084 )
								if( ema12 <= 0.001242 )
									ret := 0.307958
								if( ema12 > 0.001242 )
									ret := -0.666667
							if( ema3 > 0.084084 )
								if( rsi1 <= 91.7701 )
									ret := 0.547733
								if( rsi1 > 91.7701 )
									ret := 0.877419 // buy
					if( ema3 > 0.129395 )
						if( ema12 <= 0.003199 )
							if( d_k <= 0.803856 )
								if( rsi1 <= 71.0267 )
									ret := 0.606387
								if( rsi1 > 71.0267 )
									ret := 0.797468 // buy
							if( d_k > 0.803856 )
								if( rsi1 <= 68.8647 )
									ret := 0.347732
								if( rsi1 > 68.8647 )
									ret := 0.563939
						if( ema12 > 0.003199 )
							if( ema1 <= 0.299361 )
								if( d <= 71.9331 )
									ret := -0.346405
								if( d > 71.9331 )
									ret := 0.232409
							if( ema1 > 0.299361 )
								if( smoothK_k <= 95.1832 )
									ret := 0.455216
								if( smoothK_k > 95.1832 )
									ret := 0.864198 // buy
		if( d_k > 5.18619 )
			if( ema12 <= 0.001274 )
				if( rsi1 <= 58.2279 )
					if( ema12 <= 0.000294 )
						if( ema3 <= 0.125826 )
							if( smoothD_d <= 91.9449 )
								if( ema13 <= 7.8e-05 )
									ret := 0.175799
								if( ema13 > 7.8e-05 )
									ret := 0.033097
							if( smoothD_d > 91.9449 )
								if( ema13 <= -0.000206 )
									ret := 0.722222 // buy
								if( ema13 > -0.000206 )
									ret := -0.111111
						if( ema3 > 0.125826 )
							if( ema12 <= 0.000171 )
								if( smoothD_d <= 14.9334 )
									ret := -0.857143 // sell
								if( smoothD_d > 14.9334 )
									ret := 0.510689
							if( ema12 > 0.000171 )
								if( k <= 52.643 )
									ret := 0.240741
								if( k > 52.643 )
									ret := -0.178082
					if( ema12 > 0.000294 )
						if( ema12 <= 0.000646 )
							if( ema1 <= 0.280326 )
								if( ema12 <= 0.000501 )
									ret := -0.165455
								if( ema12 > 0.000501 )
									ret := -0.385965
							if( ema1 > 0.280326 )
								if( ema13 <= 0.000284 )
									ret := -0.571429
								if( ema13 > 0.000284 )
									ret := 0.432836
						if( ema12 > 0.000646 )
							if( ema13 <= 0.001845 )
								if( rsi1 <= 55.3104 )
									ret := -0.663818
								if( rsi1 > 55.3104 )
									ret := -0.335000
							if( ema13 > 0.001845 )
								if( ema12 <= 0.000983 )
									ret := 0.135802
								if( ema12 > 0.000983 )
									ret := -0.295699
				if( rsi1 > 58.2279 )
					if( ema12 <= 2.1e-05 )
						if( ema3 <= 0.103879 )
							if( rsi1 <= 63.0177 )
								if( smoothD_d <= 80.9444 )
									ret := 0.000000
								if( smoothD_d > 80.9444 )
									ret := 0.272727
							if( rsi1 > 63.0177 )
								if( ema13 <= -0.00027 )
									ret := 0.200000
								if( ema13 > -0.00027 )
									ret := 0.750000 // buy
						if( ema3 > 0.103879 )
							if( k <= 87.5302 )
								if( ema12 <= -3.2e-05 )
									ret := 0.461538
								if( ema12 > -3.2e-05 )
									ret := 0.785714 // buy
							if( k > 87.5302 )
								if( rsi1 <= 62.091 )
									ret := 1.000000 // buy
								if( rsi1 > 62.091 )
									ret := 0.714286 // buy
					if( ema12 > 2.1e-05 )
						if( rsi1 <= 66.8743 )
							if( ema12 <= 0.000381 )
								if( ema1 <= 0.128978 )
									ret := 0.206131
								if( ema1 > 0.128978 )
									ret := 0.589147
							if( ema12 > 0.000381 )
								if( d_k <= 5.89991 )
									ret := -0.259615
								if( d_k > 5.89991 )
									ret := 0.109696
						if( rsi1 > 66.8743 )
							if( ema1 <= 0.094345 )
								if( ema13 <= 0.001011 )
									ret := 0.089202
								if( ema13 > 0.001011 )
									ret := 0.449153
							if( ema1 > 0.094345 )
								if( ema1 <= 0.103931 )
									ret := 0.698113
								if( ema1 > 0.103931 )
									ret := 0.429178
			if( ema12 > 0.001274 )
				if( rsi1 <= 65.1752 )
					if( rsi1 <= 55.5887 )
						if( d <= 32.502 )
							if( k <= 15.1817 )
								if( d_k <= 6.59938 )
									ret := 0.000000
								if( d_k > 6.59938 )
									ret := -0.766667 // sell
							if( k > 15.1817 )
								if( ema1 <= 0.238065 )
									ret := -0.500000
								if( ema1 > 0.238065 )
									ret := 0.750000 // buy
						if( d > 32.502 )
							if( ema12 <= 0.001749 )
								if( ema13 <= 0.002834 )
									ret := -0.687500
								if( ema13 > 0.002834 )
									ret := -0.275000
							if( ema12 > 0.001749 )
								if( ema12 <= 0.002284 )
									ret := -0.747664 // sell
								if( ema12 > 0.002284 )
									ret := -0.884921 // sell
					if( rsi1 > 55.5887 )
						if( d_k <= 11.9801 )
							if( k <= 37.7403 )
								if( smoothD_d <= 16.4791 )
									ret := -0.342857
								if( smoothD_d > 16.4791 )
									ret := 0.360000
							if( k > 37.7403 )
								if( ema13 <= 0.00206 )
									ret := -0.815789 // sell
								if( ema13 > 0.00206 )
									ret := -0.287149
						if( d_k > 11.9801 )
							if( ema12 <= 0.003665 )
								if( ema2 <= 0.401971 )
									ret := -0.465116
								if( ema2 > 0.401971 )
									ret := 0.063830
							if( ema12 > 0.003665 )
								if( tema <= 0.528728 )
									ret := -0.751323 // sell
								if( tema > 0.528728 )
									ret := -0.357143
				if( rsi1 > 65.1752 )
					if( d <= 44.0678 )
						if( smoothK_k <= 18.7056 )
							if( tema <= 0.524324 )
								if( d <= 15.6857 )
									ret := -0.565217
								if( d > 15.6857 )
									ret := 0.258065
							if( tema > 0.524324 )
								ret := -1.000000 // sell
						if( smoothK_k > 18.7056 )
							if( d_k <= 5.3044 )
								ret := -0.250000
							if( d_k > 5.3044 )
								if( ema13 <= 0.002598 )
									ret := 0.000000
								if( ema13 > 0.002598 )
									ret := 0.790698 // buy
					if( d > 44.0678 )
						if( ema12 <= 0.002699 )
							if( rsi1 <= 74.9845 )
								if( ema2 <= 0.226807 )
									ret := -0.136364
								if( ema2 > 0.226807 )
									ret := 0.160000
							if( rsi1 > 74.9845 )
								if( rsi1 <= 79.1552 )
									ret := 0.348485
								if( rsi1 > 79.1552 )
									ret := 0.744186 // buy
						if( ema12 > 0.002699 )
							if( ema2 <= 0.200644 )
								if( tema <= 0.181427 )
									ret := -0.303571
								if( tema > 0.181427 )
									ret := -0.826923 // sell
							if( ema2 > 0.200644 )
								if( d_k <= 15.4108 )
									ret := -0.090308
								if( d_k > 15.4108 )
									ret := -0.537815
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XLMUSDT_30Min_caac6d66(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


