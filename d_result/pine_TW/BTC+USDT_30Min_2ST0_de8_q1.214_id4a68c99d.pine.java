//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: BTCUSDT_30Min_2ST0_4a68c99d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2ST0_4a68c99d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_4a68c99d(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 53.08 )
		if( ema12 <= 15.3686 )
			if( rsi1 <= 35.5474 )
				if( rsi1 <= 26.6115 )
					if( ema12 <= -685.251 )
						if( ema2 <= 36394.5 )
							if( d <= 2.60643 )
								ret := 0.750000 // buy
							if( d > 2.60643 )
								ret := 1.000000 // buy
						if( ema2 > 36394.5 )
							if( rsi1 <= 19.6602 )
								if( ema3 <= 58378.7 )
									ret := -0.720000 // sell
								if( ema3 > 58378.7 )
									ret := 0.117647
							if( rsi1 > 19.6602 )
								if( ema13 <= -1241.61 )
									ret := 0.281481
								if( ema13 > -1241.61 )
									ret := -0.371429
					if( ema12 > -685.251 )
						if( ema3 <= 13626.9 )
							if( ema1 <= 10293.3 )
								if( d <= 9.58855 )
									ret := -0.250000
								if( d > 9.58855 )
									ret := 0.928571 // buy
							if( ema1 > 10293.3 )
								if( ema3 <= 11150.7 )
									ret := -0.458333
								if( ema3 > 11150.7 )
									ret := 0.552632
						if( ema3 > 13626.9 )
							if( d_k <= -1.3678 )
								if( ema1 <= 39768.6 )
									ret := -0.380297
								if( ema1 > 39768.6 )
									ret := -0.641232
							if( d_k > -1.3678 )
								if( tema <= 38414.2 )
									ret := -0.662673
								if( tema > 38414.2 )
									ret := -0.791667 // sell
				if( rsi1 > 26.6115 )
					if( d_k <= -3.43567 )
						if( tema <= 60684 )
							if( ema12 <= -208.985 )
								if( tema <= 46940.8 )
									ret := 0.422156
								if( tema > 46940.8 )
									ret := 0.120787
							if( ema12 > -208.985 )
								if( tema <= 23949.2 )
									ret := 0.160256
								if( tema > 23949.2 )
									ret := -0.398506
						if( tema > 60684 )
							if( ema12 <= -520.702 )
								if( tema <= 63321.2 )
									ret := 0.545455
								if( tema > 63321.2 )
									ret := -0.500000
							if( ema12 > -520.702 )
								if( ema2 <= 71263.3 )
									ret := -0.637640
								if( ema2 > 71263.3 )
									ret := -1.000000 // sell
					if( d_k > -3.43567 )
						if( tema <= 15927.7 )
							if( ema13 <= -72.2266 )
								if( ema13 <= -143.369 )
									ret := 0.961538 // buy
								if( ema13 > -143.369 )
									ret := 0.483333
							if( ema13 > -72.2266 )
								if( ema1 <= 10282.1 )
									ret := -0.500000
								if( ema1 > 10282.1 )
									ret := 0.206897
						if( tema > 15927.7 )
							if( ema12 <= -196.763 )
								if( tema <= 43036.5 )
									ret := -0.063830
								if( tema > 43036.5 )
									ret := -0.405564
							if( ema12 > -196.763 )
								if( ema1 <= 34555.1 )
									ret := -0.382788
								if( ema1 > 34555.1 )
									ret := -0.644690
			if( rsi1 > 35.5474 )
				if( ema13 <= -137.566 )
					if( d_k <= -3.50673 )
						if( ema12 <= -106.853 )
							if( rsi1 <= 44.0099 )
								if( ema3 <= 56874.7 )
									ret := 0.560389
								if( ema3 > 56874.7 )
									ret := 0.215434
							if( rsi1 > 44.0099 )
								if( ema12 <= -191.026 )
									ret := 0.819038 // buy
								if( ema12 > -191.026 )
									ret := 0.624862
						if( ema12 > -106.853 )
							if( ema3 <= 23182.7 )
								if( ema2 <= 19392.4 )
									ret := 0.371429
								if( ema2 > 19392.4 )
									ret := 0.783626 // buy
							if( ema3 > 23182.7 )
								if( ema2 <= 44459.1 )
									ret := 0.227557
								if( ema2 > 44459.1 )
									ret := -0.077399
					if( d_k > -3.50673 )
						if( ema12 <= -99.2161 )
							if( ema12 <= -258.705 )
								if( tema <= 54850 )
									ret := 0.304038
								if( tema > 54850 )
									ret := 0.622837
							if( ema12 > -258.705 )
								if( ema2 <= 31970 )
									ret := 0.344262
								if( ema2 > 31970 )
									ret := 0.054445
						if( ema12 > -99.2161 )
							if( rsi1 <= 46.3405 )
								if( ema12 <= -51.5494 )
									ret := -0.317580
								if( ema12 > -51.5494 )
									ret := -0.805970 // sell
							if( rsi1 > 46.3405 )
								if( ema12 <= -78.3838 )
									ret := 0.355072
								if( ema12 > -78.3838 )
									ret := -0.085586
				if( ema13 > -137.566 )
					if( ema12 <= -33.3763 )
						if( d_k <= -2.19278 )
							if( rsi1 <= 41.5818 )
								if( tema <= 23789.1 )
									ret := 0.277567
								if( tema > 23789.1 )
									ret := -0.130137
							if( rsi1 > 41.5818 )
								if( smoothD_d <= 52.7889 )
									ret := 0.441568
								if( smoothD_d > 52.7889 )
									ret := 0.135294
						if( d_k > -2.19278 )
							if( rsi1 <= 44.5468 )
								if( ema12 <= -85.9511 )
									ret := 0.222222
								if( ema12 > -85.9511 )
									ret := -0.183319
							if( rsi1 > 44.5468 )
								if( k <= 71.2484 )
									ret := 0.427451
								if( k > 71.2484 )
									ret := 0.113208
					if( ema12 > -33.3763 )
						if( rsi1 <= 43.4505 )
							if( tema <= 19077.5 )
								if( ema1 <= 19026.7 )
									ret := -0.017812
								if( ema1 > 19026.7 )
									ret := 0.736842 // buy
							if( tema > 19077.5 )
								if( ema3 <= 31814.9 )
									ret := -0.286533
								if( ema3 > 31814.9 )
									ret := -0.493213
						if( rsi1 > 43.4505 )
							if( smoothD_d <= 58.7816 )
								if( rsi1 <= 47.27 )
									ret := -0.016788
								if( rsi1 > 47.27 )
									ret := 0.146402
							if( smoothD_d > 58.7816 )
								if( rsi1 <= 48.7713 )
									ret := -0.211679
								if( rsi1 > 48.7713 )
									ret := 0.004985
		if( ema12 > 15.3686 )
			if( ema12 <= 54.3423 )
				if( d_k <= -1.22614 )
					if( tema <= 64331.4 )
						if( tema <= 19269 )
							if( tema <= 17462.2 )
								if( ema2 <= 10062.9 )
									ret := -1.000000 // sell
								if( ema2 > 10062.9 )
									ret := -0.156250
							if( tema > 17462.2 )
								if( tema <= 18746.7 )
									ret := 0.682927
								if( tema > 18746.7 )
									ret := 0.000000
						if( tema > 19269 )
							if( rsi1 <= 46.1318 )
								if( d <= 22.0183 )
									ret := -0.440678
								if( d > 22.0183 )
									ret := -0.756757 // sell
							if( rsi1 > 46.1318 )
								if( ema13 <= 114.022 )
									ret := -0.092838
								if( ema13 > 114.022 )
									ret := 0.268041
					if( tema > 64331.4 )
						if( ema13 <= 30.5133 )
							if( rsi1 <= 50.011 )
								if( ema2 <= 68323.3 )
									ret := -1.000000 // sell
								if( ema2 > 68323.3 )
									ret := -0.750000 // sell
							if( rsi1 > 50.011 )
								ret := -0.250000
						if( ema13 > 30.5133 )
							if( rsi1 <= 39.4527 )
								if( k <= 8.69838 )
									ret := -0.764706 // sell
								if( k > 8.69838 )
									ret := -0.966667 // sell
							if( rsi1 > 39.4527 )
								if( rsi1 <= 49.0882 )
									ret := -0.468085
								if( rsi1 > 49.0882 )
									ret := 0.000000
				if( d_k > -1.22614 )
					if( rsi1 <= 45.8082 )
						if( ema2 <= 15511.5 )
							if( ema3 <= 12678.5 )
								ret := 0.000000
							if( ema3 > 12678.5 )
								ret := 0.666667
						if( ema2 > 15511.5 )
							if( ema13 <= 37.5023 )
								if( ema2 <= 23567.7 )
									ret := -0.898876 // sell
								if( ema2 > 23567.7 )
									ret := -0.725389 // sell
							if( ema13 > 37.5023 )
								if( rsi1 <= 40.5539 )
									ret := -0.690021
								if( rsi1 > 40.5539 )
									ret := -0.477199
					if( rsi1 > 45.8082 )
						if( ema13 <= 77.0447 )
							if( ema12 <= 31.6382 )
								if( ema13 <= 12.0382 )
									ret := -0.507463
								if( ema13 > 12.0382 )
									ret := -0.178634
							if( ema12 > 31.6382 )
								if( k <= 81.3258 )
									ret := -0.528610
								if( k > 81.3258 )
									ret := 0.148148
						if( ema13 > 77.0447 )
							if( ema3 <= 24293.9 )
								if( ema13 <= 88.0004 )
									ret := 0.032258
								if( ema13 > 88.0004 )
									ret := -0.486111
							if( ema3 > 24293.9 )
								if( ema12 <= 33.4671 )
									ret := 0.263566
								if( ema12 > 33.4671 )
									ret := -0.097378
			if( ema12 > 54.3423 )
				if( rsi1 <= 47.3579 )
					if( rsi1 <= 41.6059 )
						if( ema13 <= 140.577 )
							if( k <= 27.935 )
								if( ema12 <= 60.3404 )
									ret := -0.719298 // sell
								if( ema12 > 60.3404 )
									ret := -0.919463 // sell
							if( k > 27.935 )
								if( d_k <= 23.3043 )
									ret := -0.989011 // sell
								if( d_k > 23.3043 )
									ret := -0.857143 // sell
						if( ema13 > 140.577 )
							if( ema12 <= 91.2843 )
								if( d_k <= 26.4275 )
									ret := -0.699229
								if( d_k > 26.4275 )
									ret := 0.125000
							if( ema12 > 91.2843 )
								if( rsi1 <= 31.9825 )
									ret := -0.906542 // sell
								if( rsi1 > 31.9825 )
									ret := -0.775478 // sell
					if( rsi1 > 41.6059 )
						if( smoothD_d <= 30.273 )
							if( ema12 <= 150.567 )
								if( ema3 <= 27848 )
									ret := -0.758621 // sell
								if( ema3 > 27848 )
									ret := -0.478618
							if( ema12 > 150.567 )
								if( ema13 <= 575.574 )
									ret := -0.832599 // sell
								if( ema13 > 575.574 )
									ret := -0.546667
						if( smoothD_d > 30.273 )
							if( ema3 <= 56985.7 )
								if( ema12 <= 64.5653 )
									ret := -0.717647 // sell
								if( ema12 > 64.5653 )
									ret := -0.881643 // sell
							if( ema3 > 56985.7 )
								if( smoothD_d <= 67.8347 )
									ret := -0.681481
								if( smoothD_d > 67.8347 )
									ret := -0.076923
				if( rsi1 > 47.3579 )
					if( ema12 <= 154.873 )
						if( ema13 <= 144.343 )
							if( ema1 <= 58911.6 )
								if( rsi1 <= 49.6776 )
									ret := -0.791667 // sell
								if( rsi1 > 49.6776 )
									ret := -0.578811
							if( ema1 > 58911.6 )
								if( rsi1 <= 50.5473 )
									ret := -0.468750
								if( rsi1 > 50.5473 )
									ret := -0.131579
						if( ema13 > 144.343 )
							if( ema12 <= 79.8165 )
								if( d_k <= -9.22206 )
									ret := 0.454545
								if( d_k > -9.22206 )
									ret := -0.052910
							if( ema12 > 79.8165 )
								if( tema <= 64320.1 )
									ret := -0.476760
								if( tema > 64320.1 )
									ret := -0.033333
					if( ema12 > 154.873 )
						if( d <= 21.8877 )
							if( d <= 1.66107 )
								if( ema3 <= 43381.3 )
									ret := -0.400000
								if( ema3 > 43381.3 )
									ret := 0.000000
							if( d > 1.66107 )
								if( ema12 <= 399.032 )
									ret := -0.607692
								if( ema12 > 399.032 )
									ret := -0.966667 // sell
						if( d > 21.8877 )
							if( ema1 <= 55538.5 )
								if( ema3 <= 35754.4 )
									ret := -0.652174
								if( ema3 > 35754.4 )
									ret := -0.885246 // sell
							if( ema1 > 55538.5 )
								if( ema12 <= 223.962 )
									ret := -0.500000
								if( ema12 > 223.962 )
									ret := -0.867257 // sell
	if( rsi1 > 53.08 )
		if( d_k <= 4.21408 )
			if( rsi1 <= 64.7909 )
				if( ema12 <= -8.33289 )
					if( ema12 <= -66.126 )
						if( smoothD_d <= 82.4337 )
							if( tema <= 68897.5 )
								if( smoothK_k <= 96.9667 )
									ret := 0.837150 // buy
								if( smoothK_k > 96.9667 )
									ret := 0.423077
							if( tema > 68897.5 )
								if( d_k <= -12.3169 )
									ret := -0.250000
								if( d_k > -12.3169 )
									ret := 0.600000
						if( smoothD_d > 82.4337 )
							if( smoothK_k <= 96.9946 )
								if( ema12 <= -355.678 )
									ret := 0.934783 // buy
								if( ema12 > -355.678 )
									ret := 0.657238
							if( smoothK_k > 96.9946 )
								if( ema13 <= -1119.58 )
									ret := 1.000000 // buy
								if( ema13 > -1119.58 )
									ret := 0.419355
					if( ema12 > -66.126 )
						if( smoothD_d <= 80.2148 )
							if( rsi1 <= 57.1261 )
								if( ema12 <= -24.9767 )
									ret := 0.624785
								if( ema12 > -24.9767 )
									ret := 0.434903
							if( rsi1 > 57.1261 )
								if( ema13 <= -10.6744 )
									ret := 0.691124
								if( ema13 > -10.6744 )
									ret := 0.860335 // buy
						if( smoothD_d > 80.2148 )
							if( rsi1 <= 58.433 )
								if( ema13 <= -315.808 )
									ret := -0.800000 // sell
								if( ema13 > -315.808 )
									ret := 0.259804
							if( rsi1 > 58.433 )
								if( smoothK_k <= 96.7762 )
									ret := 0.556745
								if( smoothK_k > 96.7762 )
									ret := 0.142857
				if( ema12 > -8.33289 )
					if( rsi1 <= 59.0884 )
						if( d_k <= -4.70067 )
							if( ema12 <= 101.949 )
								if( rsi1 <= 55.3796 )
									ret := 0.101375
								if( rsi1 > 55.3796 )
									ret := 0.270109
							if( ema12 > 101.949 )
								if( tema <= 61644.5 )
									ret := -0.142857
								if( tema > 61644.5 )
									ret := -0.557692
						if( d_k > -4.70067 )
							if( ema12 <= 45.2514 )
								if( ema13 <= 90.5828 )
									ret := 0.109578
								if( ema13 > 90.5828 )
									ret := 0.528302
							if( ema12 > 45.2514 )
								if( ema12 <= 118.666 )
									ret := -0.122291
								if( ema12 > 118.666 )
									ret := -0.378378
					if( rsi1 > 59.0884 )
						if( ema12 <= 192.639 )
							if( ema1 <= 34396.5 )
								if( ema3 <= 10854.2 )
									ret := -0.141667
								if( ema3 > 10854.2 )
									ret := 0.291946
							if( ema1 > 34396.5 )
								if( ema12 <= 107.457 )
									ret := 0.532228
								if( ema12 > 107.457 )
									ret := 0.258696
						if( ema12 > 192.639 )
							if( k <= 45.0322 )
								if( ema12 <= 300.698 )
									ret := 0.230769
								if( ema12 > 300.698 )
									ret := -0.228571
							if( k > 45.0322 )
								if( ema13 <= 1410.81 )
									ret := -0.298701
								if( ema13 > 1410.81 )
									ret := 1.000000 // buy
			if( rsi1 > 64.7909 )
				if( ema3 <= 18666.7 )
					if( ema13 <= 121.06 )
						if( ema3 <= 11374.2 )
							if( tema <= 10489.9 )
								if( ema3 <= 10332.1 )
									ret := -0.037037
								if( ema3 > 10332.1 )
									ret := 0.800000 // buy
							if( tema > 10489.9 )
								if( ema13 <= 21.7582 )
									ret := 0.219512
								if( ema13 > 21.7582 )
									ret := -0.166667
						if( ema3 > 11374.2 )
							if( tema <= 18176.6 )
								if( rsi1 <= 86.6213 )
									ret := 0.408602
								if( rsi1 > 86.6213 )
									ret := 0.952381 // buy
							if( tema > 18176.6 )
								if( smoothD_d <= 85.8637 )
									ret := 0.000000
								if( smoothD_d > 85.8637 )
									ret := -0.666667
					if( ema13 > 121.06 )
						if( smoothK_k <= 72.0607 )
							if( ema1 <= 14225.1 )
								if( ema3 <= 13004.3 )
									ret := -0.857143 // sell
								if( ema3 > 13004.3 )
									ret := -0.142857
							if( ema1 > 14225.1 )
								if( tema <= 17669.7 )
									ret := 0.660377
								if( tema > 17669.7 )
									ret := 0.217391
						if( smoothK_k > 72.0607 )
							if( rsi1 <= 75.3022 )
								if( tema <= 18745.8 )
									ret := -0.540984
								if( tema > 18745.8 )
									ret := 0.272727
							if( rsi1 > 75.3022 )
								if( ema12 <= 101.409 )
									ret := 0.279070
								if( ema12 > 101.409 )
									ret := -0.246914
				if( ema3 > 18666.7 )
					if( ema12 <= 249.086 )
						if( rsi1 <= 73.9707 )
							if( ema12 <= 150.969 )
								if( ema3 <= 32120.2 )
									ret := 0.529745
								if( ema3 > 32120.2 )
									ret := 0.692236
							if( ema12 > 150.969 )
								if( smoothD_d <= 50.3379 )
									ret := 0.601810
								if( smoothD_d > 50.3379 )
									ret := 0.320896
						if( rsi1 > 73.9707 )
							if( k <= 94.7721 )
								if( ema2 <= 47241.7 )
									ret := 0.704059 // buy
								if( ema2 > 47241.7 )
									ret := 0.821429 // buy
							if( k > 94.7721 )
								if( rsi1 <= 82.0134 )
									ret := 0.767804 // buy
								if( rsi1 > 82.0134 )
									ret := 0.883131 // buy
					if( ema12 > 249.086 )
						if( ema3 <= 19335.3 )
							if( d_k <= 3.55387 )
								ret := -1.000000 // sell
							if( d_k > 3.55387 )
								ret := -0.750000 // sell
						if( ema3 > 19335.3 )
							if( ema12 <= 398.35 )
								if( rsi1 <= 76.7264 )
									ret := 0.330846
								if( rsi1 > 76.7264 )
									ret := 0.692308
							if( ema12 > 398.35 )
								if( rsi1 <= 72.609 )
									ret := -0.145374
								if( rsi1 > 72.609 )
									ret := 0.459746
		if( d_k > 4.21408 )
			if( rsi1 <= 66.2852 )
				if( ema12 <= 105.777 )
					if( ema1 <= 26297.5 )
						if( ema12 <= 65.4673 )
							if( rsi1 <= 57.5356 )
								if( ema3 <= 18250.1 )
									ret := 0.024194
								if( ema3 > 18250.1 )
									ret := -0.172881
							if( rsi1 > 57.5356 )
								if( ema13 <= 157.001 )
									ret := 0.043284
								if( ema13 > 157.001 )
									ret := 0.777778 // buy
						if( ema12 > 65.4673 )
							if( rsi1 <= 59.7289 )
								if( ema13 <= 118.643 )
									ret := -0.920000 // sell
								if( ema13 > 118.643 )
									ret := -0.513274
							if( rsi1 > 59.7289 )
								if( tema <= 21488.4 )
									ret := -0.012658
								if( tema > 21488.4 )
									ret := -0.528302
					if( ema1 > 26297.5 )
						if( ema2 <= 51639.4 )
							if( ema12 <= 2.84226 )
								if( smoothK_k <= 70.6369 )
									ret := 0.633540
								if( smoothK_k > 70.6369 )
									ret := 0.313869
							if( ema12 > 2.84226 )
								if( rsi1 <= 57.997 )
									ret := -0.020701
								if( rsi1 > 57.997 )
									ret := 0.248855
						if( ema2 > 51639.4 )
							if( ema12 <= -18.0687 )
								if( smoothK_k <= 88.4145 )
									ret := 0.803150 // buy
								if( smoothK_k > 88.4145 )
									ret := 0.000000
							if( ema12 > -18.0687 )
								if( rsi1 <= 56.8386 )
									ret := 0.124260
								if( rsi1 > 56.8386 )
									ret := 0.555901
				if( ema12 > 105.777 )
					if( rsi1 <= 61.511 )
						if( ema12 <= 207.651 )
							if( ema2 <= 61681.3 )
								if( ema13 <= 352.842 )
									ret := -0.522048
								if( ema13 > 352.842 )
									ret := -0.013072
							if( ema2 > 61681.3 )
								if( ema13 <= 279.539 )
									ret := -0.014286
								if( ema13 > 279.539 )
									ret := 0.488372
						if( ema12 > 207.651 )
							if( smoothD_d <= 50.2641 )
								if( smoothK_k <= -0.660373 )
									ret := -0.195122
								if( smoothK_k > -0.660373 )
									ret := -0.534759
							if( smoothD_d > 50.2641 )
								if( ema3 <= 68037.4 )
									ret := -0.786469 // sell
								if( ema3 > 68037.4 )
									ret := 0.333333
					if( rsi1 > 61.511 )
						if( ema12 <= 328.019 )
							if( ema3 <= 30728.7 )
								if( k <= 30.8937 )
									ret := -0.096774
								if( k > 30.8937 )
									ret := -0.566372
							if( ema3 > 30728.7 )
								if( ema12 <= 170.068 )
									ret := 0.400000
								if( ema12 > 170.068 )
									ret := -0.060686
						if( ema12 > 328.019 )
							if( smoothK_k <= 38.1612 )
								if( ema12 <= 496.026 )
									ret := -0.103093
								if( ema12 > 496.026 )
									ret := -0.538462
							if( smoothK_k > 38.1612 )
								if( ema12 <= 425.116 )
									ret := -0.609195
								if( ema12 > 425.116 )
									ret := -0.863636 // sell
			if( rsi1 > 66.2852 )
				if( ema12 <= 139.69 )
					if( ema2 <= 24847.5 )
						if( ema1 <= 19316.3 )
							if( ema1 <= 18973.8 )
								if( ema12 <= 129.853 )
									ret := 0.184000
								if( ema12 > 129.853 )
									ret := -0.700000 // sell
							if( ema1 > 18973.8 )
								if( d <= 68.2485 )
									ret := 0.222222
								if( d > 68.2485 )
									ret := -0.560000
						if( ema1 > 19316.3 )
							if( ema2 <= 19327.8 )
								if( d_k <= 6.02704 )
									ret := 0.500000
								if( d_k > 6.02704 )
									ret := 1.000000 // buy
							if( ema2 > 19327.8 )
								if( rsi1 <= 77.3915 )
									ret := 0.187919
								if( rsi1 > 77.3915 )
									ret := 0.875000 // buy
					if( ema2 > 24847.5 )
						if( rsi1 <= 75.94 )
							if( k <= 48.814 )
								if( ema3 <= 27456 )
									ret := 0.058824
								if( ema3 > 27456 )
									ret := 0.617647
							if( k > 48.814 )
								if( smoothD_d <= 90.0923 )
									ret := 0.742126 // buy
								if( smoothD_d > 90.0923 )
									ret := 0.541667
						if( rsi1 > 75.94 )
							if( tema <= 27193.7 )
								if( ema1 <= 26835 )
									ret := 0.923077 // buy
								if( ema1 > 26835 )
									ret := 0.000000
							if( tema > 27193.7 )
								if( rsi1 <= 78.2832 )
									ret := 0.900000 // buy
								if( rsi1 > 78.2832 )
									ret := 0.982456 // buy
				if( ema12 > 139.69 )
					if( ema1 <= 38315 )
						if( tema <= 20625.1 )
							if( ema12 <= 161.873 )
								if( ema3 <= 19973.4 )
									ret := -0.038462
								if( ema3 > 19973.4 )
									ret := -1.000000 // sell
							if( ema12 > 161.873 )
								if( d_k <= 12.0289 )
									ret := -0.595745
								if( d_k > 12.0289 )
									ret := -0.840000 // sell
						if( tema > 20625.1 )
							if( ema12 <= 278.847 )
								if( rsi1 <= 75.8227 )
									ret := -0.020747
								if( rsi1 > 75.8227 )
									ret := 0.471831
							if( ema12 > 278.847 )
								if( d_k <= 6.52223 )
									ret := 0.126582
								if( d_k > 6.52223 )
									ret := -0.327068
					if( ema1 > 38315 )
						if( rsi1 <= 76.3399 )
							if( ema2 <= 58115.7 )
								if( smoothD_d <= 64.9872 )
									ret := 0.240000
								if( smoothD_d > 64.9872 )
									ret := -0.047478
							if( ema2 > 58115.7 )
								if( tema <= 60662.1 )
									ret := 0.731343 // buy
								if( tema > 60662.1 )
									ret := 0.410256
						if( rsi1 > 76.3399 )
							if( ema12 <= 746.651 )
								if( tema <= 63108.4 )
									ret := 0.607973
								if( tema > 63108.4 )
									ret := 0.850877 // buy
							if( ema12 > 746.651 )
								if( smoothD_d <= 75.6384 )
									ret := 0.071429
								if( smoothD_d > 75.6384 )
									ret := -0.363636
	
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
float op_operation = decision_tree_0_BTCUSDT_30Min_4a68c99d(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


