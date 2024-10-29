//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: UNIUSDT_15Min_2ST0_578b9290 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2ST0_578b9290", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_578b9290(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( k <= 62.1538 )
		if( smoothK_k <= 16.9794 )
			if( ema1 <= 7.16066 )
				if( ema12 <= -0.016415 )
					if( rsi1 <= 26.8384 )
						if( ema13 <= -0.062855 )
							if( k <= 0.003327 )
								if( d_k <= 25.806 )
									ret := 0.391489
								if( d_k > 25.806 )
									ret := -0.800000 // sell
							if( k > 0.003327 )
								if( rsi1 <= 10.2548 )
									ret := -0.417476
								if( rsi1 > 10.2548 )
									ret := 0.071489
						if( ema13 > -0.062855 )
							if( d <= 9.45479 )
								if( rsi1 <= 21.6928 )
									ret := -0.620791
								if( rsi1 > 21.6928 )
									ret := -0.325112
							if( d > 9.45479 )
								if( tema <= 6.10279 )
									ret := -0.064935
								if( tema > 6.10279 )
									ret := -0.353659
					if( rsi1 > 26.8384 )
						if( d_k <= -4.17451 )
							if( d <= 10.6786 )
								if( ema3 <= 5.32409 )
									ret := 0.146667
								if( ema3 > 5.32409 )
									ret := -0.304348
							if( d > 10.6786 )
								if( smoothD_d <= 10.3076 )
									ret := 0.391753
								if( smoothD_d > 10.3076 )
									ret := -0.529412
						if( d_k > -4.17451 )
							if( tema <= 6.07693 )
								if( rsi1 <= 28.0491 )
									ret := -0.122951
								if( rsi1 > 28.0491 )
									ret := 0.298471
							if( tema > 6.07693 )
								if( rsi1 <= 45.4604 )
									ret := 0.056572
								if( rsi1 > 45.4604 )
									ret := 0.903226 // buy
				if( ema12 > -0.016415 )
					if( rsi1 <= 38.8765 )
						if( ema12 <= -0.00036 )
							if( smoothD_d <= 4.54301 )
								if( rsi1 <= 31.0302 )
									ret := -0.617949
								if( rsi1 > 31.0302 )
									ret := -0.276786
							if( smoothD_d > 4.54301 )
								if( d_k <= 0.744191 )
									ret := -0.371257
								if( d_k > 0.744191 )
									ret := -0.208784
						if( ema12 > -0.00036 )
							if( ema2 <= 6.15374 )
								if( ema12 <= 0.009143 )
									ret := -0.501703
								if( ema12 > 0.009143 )
									ret := -0.797814 // sell
							if( ema2 > 6.15374 )
								if( ema12 <= 0.001881 )
									ret := -0.668539
								if( ema12 > 0.001881 )
									ret := -0.810044 // sell
					if( rsi1 > 38.8765 )
						if( ema13 <= 0.039845 )
							if( rsi1 <= 49.8775 )
								if( ema12 <= 0.008363 )
									ret := -0.045121
								if( ema12 > 0.008363 )
									ret := -0.479197
							if( rsi1 > 49.8775 )
								if( ema12 <= 0.013446 )
									ret := 0.119686
								if( ema12 > 0.013446 )
									ret := -0.104712
						if( ema13 > 0.039845 )
							if( rsi1 <= 56.9314 )
								if( ema12 <= 0.020849 )
									ret := -0.176656
								if( ema12 > 0.020849 )
									ret := -0.640152
							if( rsi1 > 56.9314 )
								if( rsi1 <= 61.9975 )
									ret := -0.130045
								if( rsi1 > 61.9975 )
									ret := 0.156309
			if( ema1 > 7.16066 )
				if( rsi1 <= 46.9639 )
					if( ema2 <= 10.0425 )
						if( ema12 <= 0.004776 )
							if( rsi1 <= 34.2196 )
								if( ema12 <= -0.032667 )
									ret := -0.246294
								if( ema12 > -0.032667 )
									ret := -0.652018
							if( rsi1 > 34.2196 )
								if( ema12 <= -0.024033 )
									ret := 0.266160
								if( ema12 > -0.024033 )
									ret := -0.204793
						if( ema12 > 0.004776 )
							if( ema12 <= 0.022041 )
								if( ema13 <= 0.06127 )
									ret := -0.688976
								if( ema13 > 0.06127 )
									ret := 0.200000
							if( ema12 > 0.022041 )
								if( ema3 <= 9.78291 )
									ret := -0.888136 // sell
								if( ema3 > 9.78291 )
									ret := -0.250000
					if( ema2 > 10.0425 )
						if( ema12 <= -0.078233 )
							if( d <= 4.91138 )
								if( rsi1 <= 31.8597 )
									ret := -0.780488 // sell
								if( rsi1 > 31.8597 )
									ret := 0.600000
							if( d > 4.91138 )
								if( ema3 <= 13.8545 )
									ret := 0.246154
								if( ema3 > 13.8545 )
									ret := -0.842105 // sell
						if( ema12 > -0.078233 )
							if( rsi1 <= 39.1034 )
								if( ema12 <= -0.011283 )
									ret := -0.662595
								if( ema12 > -0.011283 )
									ret := -0.865260 // sell
							if( rsi1 > 39.1034 )
								if( ema13 <= 0.033184 )
									ret := -0.243243
								if( ema13 > 0.033184 )
									ret := -0.709016 // sell
				if( rsi1 > 46.9639 )
					if( rsi1 <= 54.8575 )
						if( ema12 <= -0.001286 )
							if( rsi1 <= 53.4207 )
								if( ema3 <= 11.6636 )
									ret := 0.264463
								if( ema3 > 11.6636 )
									ret := 0.888889 // buy
							if( rsi1 > 53.4207 )
								ret := -0.714286 // sell
						if( ema12 > -0.001286 )
							if( ema12 <= 0.025409 )
								if( smoothK_k <= 2.13571 )
									ret := 0.060976
								if( smoothK_k > 2.13571 )
									ret := -0.266447
							if( ema12 > 0.025409 )
								if( d <= 11.9009 )
									ret := -0.309524
								if( d > 11.9009 )
									ret := -0.720207 // sell
					if( rsi1 > 54.8575 )
						if( ema13 <= 0.629828 )
							if( ema2 <= 7.48932 )
								if( rsi1 <= 65.483 )
									ret := -0.353846
								if( rsi1 > 65.483 )
									ret := 0.210526
							if( ema2 > 7.48932 )
								if( ema12 <= 0.070399 )
									ret := 0.264095
								if( ema12 > 0.070399 )
									ret := -0.050360
						if( ema13 > 0.629828 )
							if( ema12 <= 0.386516 )
								ret := -0.600000
							if( ema12 > 0.386516 )
								ret := -1.000000 // sell
		if( smoothK_k > 16.9794 )
			if( rsi1 <= 51.6989 )
				if( ema12 <= 0.003536 )
					if( ema12 <= -0.019576 )
						if( tema <= 12.4937 )
							if( smoothD_d <= 20.7616 )
								if( rsi1 <= 35.1566 )
									ret := -0.154589
								if( rsi1 > 35.1566 )
									ret := 0.188347
							if( smoothD_d > 20.7616 )
								if( d_k <= 3.30192 )
									ret := 0.227174
								if( d_k > 3.30192 )
									ret := 0.051688
						if( tema > 12.4937 )
							if( rsi1 <= 32.988 )
								if( d_k <= -0.83677 )
									ret := -0.872727 // sell
								if( d_k > -0.83677 )
									ret := -0.347826
							if( rsi1 > 32.988 )
								if( rsi1 <= 47.0252 )
									ret := -0.247706
								if( rsi1 > 47.0252 )
									ret := 0.562500
					if( ema12 > -0.019576 )
						if( ema13 <= 0.00547 )
							if( tema <= 7.1188 )
								if( rsi1 <= 39.9978 )
									ret := -0.239244
								if( rsi1 > 39.9978 )
									ret := 0.020262
							if( tema > 7.1188 )
								if( ema12 <= -0.004869 )
									ret := -0.170997
								if( ema12 > -0.004869 )
									ret := -0.465116
						if( ema13 > 0.00547 )
							if( d <= 22.2901 )
								if( rsi1 <= 50.8943 )
									ret := -0.190909
								if( rsi1 > 50.8943 )
									ret := 0.714286 // buy
							if( d > 22.2901 )
								if( ema12 <= -0.002817 )
									ret := 0.684211
								if( ema12 > -0.002817 )
									ret := 0.179204
				if( ema12 > 0.003536 )
					if( rsi1 <= 44.6908 )
						if( ema12 <= 0.013607 )
							if( ema13 <= 0.004359 )
								if( smoothD_d <= 71.6945 )
									ret := -0.804878 // sell
								if( smoothD_d > 71.6945 )
									ret := -0.200000
							if( ema13 > 0.004359 )
								if( d_k <= 17.7041 )
									ret := -0.577061
								if( d_k > 17.7041 )
									ret := -0.184615
						if( ema12 > 0.013607 )
							if( ema13 <= 0.239938 )
								if( d_k <= 23.7727 )
									ret := -0.928571 // sell
								if( d_k > 23.7727 )
									ret := -0.516129
							if( ema13 > 0.239938 )
								ret := 0.750000 // buy
					if( rsi1 > 44.6908 )
						if( ema3 <= 6.93639 )
							if( ema13 <= 0.023927 )
								if( d_k <= 5.70513 )
									ret := -0.302483
								if( d_k > 5.70513 )
									ret := -0.049107
							if( ema13 > 0.023927 )
								if( ema12 <= 0.014204 )
									ret := 0.015625
								if( ema12 > 0.014204 )
									ret := -0.486772
						if( ema3 > 6.93639 )
							if( d_k <= 16.8439 )
								if( ema12 <= 0.02163 )
									ret := -0.440281
								if( ema12 > 0.02163 )
									ret := -0.771574 // sell
							if( d_k > 16.8439 )
								if( ema12 <= 0.031931 )
									ret := -0.117188
								if( ema12 > 0.031931 )
									ret := -0.655172
			if( rsi1 > 51.6989 )
				if( ema12 <= -0.003342 )
					if( ema1 <= 8.91426 )
						if( d_k <= 5.6851 )
							if( ema12 <= -0.013237 )
								if( k <= 46.2632 )
									ret := 0.358974
								if( k > 46.2632 )
									ret := 0.847826 // buy
							if( ema12 > -0.013237 )
								if( d_k <= -14.1014 )
									ret := 0.204545
								if( d_k > -14.1014 )
									ret := 0.546917
						if( d_k > 5.6851 )
							if( ema13 <= 0.002481 )
								if( rsi1 <= 56.9792 )
									ret := 0.373333
								if( rsi1 > 56.9792 )
									ret := -0.750000 // sell
							if( ema13 > 0.002481 )
								if( ema12 <= -0.004305 )
									ret := -0.611111
								if( ema12 > -0.004305 )
									ret := 0.000000
					if( ema1 > 8.91426 )
						if( ema2 <= 14.1519 )
							if( smoothK_k <= 50.0015 )
								if( k <= 46.5438 )
									ret := 0.777778 // buy
								if( k > 46.5438 )
									ret := 0.375000
							if( smoothK_k > 50.0015 )
								if( smoothD_d <= 39.9122 )
									ret := 0.444444
								if( smoothD_d > 39.9122 )
									ret := 0.952381 // buy
						if( ema2 > 14.1519 )
							ret := 0.000000
				if( ema12 > -0.003342 )
					if( smoothD_d <= 41.1233 )
						if( ema3 <= 12.6417 )
							if( ema12 <= 0.105988 )
								if( rsi1 <= 61.6325 )
									ret := 0.019735
								if( rsi1 > 61.6325 )
									ret := 0.297281
							if( ema12 > 0.105988 )
								if( rsi1 <= 69.6531 )
									ret := -0.967742 // sell
								if( rsi1 > 69.6531 )
									ret := 0.142857
						if( ema3 > 12.6417 )
							if( rsi1 <= 58.1004 )
								if( ema1 <= 12.998 )
									ret := 0.714286 // buy
								if( ema1 > 12.998 )
									ret := -0.473684
							if( rsi1 > 58.1004 )
								if( k <= 25.5499 )
									ret := 0.500000
								if( k > 25.5499 )
									ret := 0.981481 // buy
					if( smoothD_d > 41.1233 )
						if( d_k <= 17.4856 )
							if( rsi1 <= 69.4431 )
								if( ema12 <= 0.024138 )
									ret := 0.003060
								if( ema12 > 0.024138 )
									ret := -0.231506
							if( rsi1 > 69.4431 )
								if( rsi1 <= 75.8111 )
									ret := 0.139785
								if( rsi1 > 75.8111 )
									ret := 0.433333
						if( d_k > 17.4856 )
							if( rsi1 <= 65.3394 )
								if( ema12 <= 0.075225 )
									ret := 0.048780
								if( ema12 > 0.075225 )
									ret := -0.789474 // sell
							if( rsi1 > 65.3394 )
								if( ema13 <= 0.174962 )
									ret := 0.432099
								if( ema13 > 0.174962 )
									ret := -0.267857
	if( k > 62.1538 )
		if( rsi1 <= 70.9699 )
			if( ema12 <= -0.000965 )
				if( rsi1 <= 50.0189 )
					if( ema12 <= -0.027682 )
						if( rsi1 <= 39.419 )
							if( rsi1 <= 31.931 )
								if( tema <= 7.01207 )
									ret := 0.122517
								if( tema > 7.01207 )
									ret := -0.315789
							if( rsi1 > 31.931 )
								if( ema12 <= -0.112305 )
									ret := 0.666667
								if( ema12 > -0.112305 )
									ret := 0.177885
						if( rsi1 > 39.419 )
							if( ema12 <= -0.055314 )
								if( d <= 39.3819 )
									ret := -0.636364
								if( d > 39.3819 )
									ret := 0.726755 // buy
							if( ema12 > -0.055314 )
								if( ema13 <= -0.096999 )
									ret := -0.026596
								if( ema13 > -0.096999 )
									ret := 0.545755
					if( ema12 > -0.027682 )
						if( ema13 <= -0.056906 )
							if( ema12 <= -0.025767 )
								if( tema <= 5.96057 )
									ret := 0.250000
								if( tema > 5.96057 )
									ret := -0.265306
							if( ema12 > -0.025767 )
								if( tema <= 4.17907 )
									ret := 1.000000 // buy
								if( tema > 4.17907 )
									ret := -0.427350
						if( ema13 > -0.056906 )
							if( rsi1 <= 39.4085 )
								if( ema12 <= -0.018881 )
									ret := -0.039275
								if( ema12 > -0.018881 )
									ret := -0.241327
							if( rsi1 > 39.4085 )
								if( smoothD_d <= 39.6112 )
									ret := -0.393939
								if( smoothD_d > 39.6112 )
									ret := 0.047250
				if( rsi1 > 50.0189 )
					if( ema12 <= -0.011953 )
						if( rsi1 <= 53.1842 )
							if( ema12 <= -0.037207 )
								if( ema12 <= -0.059332 )
									ret := 0.945205 // buy
								if( ema12 > -0.059332 )
									ret := 0.730769 // buy
							if( ema12 > -0.037207 )
								if( d <= 93.4179 )
									ret := 0.582117
								if( d > 93.4179 )
									ret := 0.187097
						if( rsi1 > 53.1842 )
							if( ema13 <= -0.024481 )
								if( rsi1 <= 64.3015 )
									ret := 0.709790 // buy
								if( rsi1 > 64.3015 )
									ret := 0.868794 // buy
							if( ema13 > -0.024481 )
								if( ema12 <= -0.013378 )
									ret := 0.969925 // buy
								if( ema12 > -0.013378 )
									ret := 0.831325 // buy
					if( ema12 > -0.011953 )
						if( ema13 <= -0.051572 )
							if( smoothK_k <= 90.4509 )
								if( smoothD_d <= 88.1338 )
									ret := -1.000000 // sell
								if( smoothD_d > 88.1338 )
									ret := -0.750000 // sell
							if( smoothK_k > 90.4509 )
								if( k <= 99.654 )
									ret := 0.142857
								if( k > 99.654 )
									ret := -0.600000
						if( ema13 > -0.051572 )
							if( ema13 <= -0.00355 )
								if( ema12 <= -0.003037 )
									ret := 0.463930
								if( ema12 > -0.003037 )
									ret := 0.280000
							if( ema13 > -0.00355 )
								if( rsi1 <= 57.9074 )
									ret := 0.353933
								if( rsi1 > 57.9074 )
									ret := 0.794964 // buy
			if( ema12 > -0.000965 )
				if( ema12 <= 0.038218 )
					if( rsi1 <= 58.7071 )
						if( d_k <= 2.90203 )
							if( ema2 <= 5.49395 )
								if( smoothK_k <= 76.8951 )
									ret := -0.082317
								if( smoothK_k > 76.8951 )
									ret := 0.154386
							if( ema2 > 5.49395 )
								if( ema12 <= 0.009463 )
									ret := -0.099260
								if( ema12 > 0.009463 )
									ret := -0.307339
						if( d_k > 2.90203 )
							if( d <= 74.2227 )
								if( d <= 69.2409 )
									ret := 0.153846
								if( d > 69.2409 )
									ret := -0.222222
							if( d > 74.2227 )
								if( rsi1 <= 45.5214 )
									ret := -0.411290
								if( rsi1 > 45.5214 )
									ret := 0.107430
					if( rsi1 > 58.7071 )
						if( ema12 <= 0.019155 )
							if( ema3 <= 9.50737 )
								if( ema12 <= 0.003515 )
									ret := 0.346384
								if( ema12 > 0.003515 )
									ret := 0.239652
							if( ema3 > 9.50737 )
								if( smoothD_d <= 53.6585 )
									ret := 0.100000
								if( smoothD_d > 53.6585 )
									ret := 0.638968
						if( ema12 > 0.019155 )
							if( d_k <= 6.68818 )
								if( ema3 <= 9.14954 )
									ret := 0.014778
								if( ema3 > 9.14954 )
									ret := 0.442623
							if( d_k > 6.68818 )
								if( tema <= 4.05537 )
									ret := -1.000000 // sell
								if( tema > 4.05537 )
									ret := 0.355311
				if( ema12 > 0.038218 )
					if( rsi1 <= 59.0518 )
						if( smoothD_d <= 76.3095 )
							if( tema <= 7.23745 )
								if( ema12 <= 0.04383 )
									ret := -0.100000
								if( ema12 > 0.04383 )
									ret := -1.000000 // sell
							if( tema > 7.23745 )
								if( d_k <= 9.07689 )
									ret := -0.941176 // sell
								if( d_k > 9.07689 )
									ret := -0.571429
						if( smoothD_d > 76.3095 )
							if( d_k <= 10.7413 )
								if( ema2 <= 5.77893 )
									ret := 0.714286 // buy
								if( ema2 > 5.77893 )
									ret := -0.574468
							if( d_k > 10.7413 )
								if( rsi1 <= 53.8134 )
									ret := 0.777778 // buy
								if( rsi1 > 53.8134 )
									ret := -0.181818
					if( rsi1 > 59.0518 )
						if( ema3 <= 9.05749 )
							if( tema <= 5.10445 )
								if( smoothD_d <= 94.571 )
									ret := 0.506494
								if( smoothD_d > 94.571 )
									ret := -1.000000 // sell
							if( tema > 5.10445 )
								if( ema12 <= 0.057066 )
									ret := -0.135878
								if( ema12 > 0.057066 )
									ret := -0.432624
						if( ema3 > 9.05749 )
							if( smoothD_d <= 71.2516 )
								if( rsi1 <= 67.9426 )
									ret := -0.444444
								if( rsi1 > 67.9426 )
									ret := 0.476190
							if( smoothD_d > 71.2516 )
								if( k <= 94.8672 )
									ret := 0.452381
								if( k > 94.8672 )
									ret := -0.375000
		if( rsi1 > 70.9699 )
			if( ema12 <= 0.030598 )
				if( rsi1 <= 76.9858 )
					if( ema12 <= 0.001609 )
						if( ema12 <= -0.003141 )
							if( ema2 <= 4.1953 )
								if( smoothD_d <= 95.2909 )
									ret := 0.000000
								if( smoothD_d > 95.2909 )
									ret := 1.000000 // buy
							if( ema2 > 4.1953 )
								if( ema13 <= -0.0089 )
									ret := 0.850980 // buy
								if( ema13 > -0.0089 )
									ret := 1.000000 // buy
						if( ema12 > -0.003141 )
							if( ema3 <= 5.28529 )
								if( d_k <= -11.7038 )
									ret := 0.863636 // buy
								if( d_k > -11.7038 )
									ret := 0.457831
							if( ema3 > 5.28529 )
								if( d_k <= -0.992818 )
									ret := 0.738636 // buy
								if( d_k > -0.992818 )
									ret := 0.905405 // buy
					if( ema12 > 0.001609 )
						if( ema1 <= 7.41688 )
							if( rsi1 <= 72.7358 )
								if( ema1 <= 6.92099 )
									ret := 0.293023
								if( ema1 > 6.92099 )
									ret := 0.551020
							if( rsi1 > 72.7358 )
								if( d <= 99.1863 )
									ret := 0.495276
								if( d > 99.1863 )
									ret := 0.206897
						if( ema1 > 7.41688 )
							if( d <= 99.0912 )
								if( smoothK_k <= 72.4998 )
									ret := 0.350000
								if( smoothK_k > 72.4998 )
									ret := 0.739003 // buy
							if( d > 99.0912 )
								if( ema12 <= 0.020244 )
									ret := 0.750000 // buy
								if( ema12 > 0.020244 )
									ret := -0.500000
				if( rsi1 > 76.9858 )
					if( smoothD_d <= 95.8843 )
						if( ema2 <= 6.13704 )
							if( ema13 <= 0.051833 )
								if( smoothK_k <= 67.8352 )
									ret := 0.052632
								if( smoothK_k > 67.8352 )
									ret := 0.619981
							if( ema13 > 0.051833 )
								if( ema12 <= 0.027368 )
									ret := -0.666667
								if( ema12 > 0.027368 )
									ret := 0.333333
						if( ema2 > 6.13704 )
							if( d_k <= -29.3108 )
								if( ema13 <= 0.033364 )
									ret := 0.750000 // buy
								if( ema13 > 0.033364 )
									ret := -0.833333 // sell
							if( d_k > -29.3108 )
								if( ema13 <= 0.022067 )
									ret := 0.848665 // buy
								if( ema13 > 0.022067 )
									ret := 0.717996 // buy
					if( smoothD_d > 95.8843 )
						if( tema <= 6.70476 )
							if( rsi1 <= 84.2005 )
								if( d_k <= -0.665841 )
									ret := 0.250000
								if( d_k > -0.665841 )
									ret := 0.770370 // buy
							if( rsi1 > 84.2005 )
								if( smoothD_d <= 96.6942 )
									ret := 0.775000 // buy
								if( smoothD_d > 96.6942 )
									ret := 0.916667 // buy
						if( tema > 6.70476 )
							if( ema13 <= -0.023929 )
								if( ema1 <= 9.24278 )
									ret := 1.000000 // buy
								if( ema1 > 9.24278 )
									ret := 0.400000
							if( ema13 > -0.023929 )
								if( smoothD_d <= 95.9335 )
									ret := 0.750000 // buy
								if( smoothD_d > 95.9335 )
									ret := 0.966667 // buy
			if( ema12 > 0.030598 )
				if( tema <= 9.63739 )
					if( rsi1 <= 80.0511 )
						if( d_k <= 0.001811 )
							if( d_k <= -8.94291 )
								if( ema3 <= 7.46615 )
									ret := 0.136364
								if( ema3 > 7.46615 )
									ret := 0.782609 // buy
							if( d_k > -8.94291 )
								if( d_k <= -4.11091 )
									ret := -0.224670
								if( d_k > -4.11091 )
									ret := 0.070547
						if( d_k > 0.001811 )
							if( k <= 75.9544 )
								if( d <= 70.4802 )
									ret := -0.758621 // sell
								if( d > 70.4802 )
									ret := 0.003135
							if( k > 75.9544 )
								if( smoothK_k <= 94.1327 )
									ret := 0.396973
								if( smoothK_k > 94.1327 )
									ret := -0.061538
					if( rsi1 > 80.0511 )
						if( ema13 <= 0.080551 )
							if( d_k <= 3.94031 )
								if( rsi1 <= 86.2688 )
									ret := 0.514223
								if( rsi1 > 86.2688 )
									ret := 0.776923 // buy
							if( d_k > 3.94031 )
								if( ema3 <= 4.97417 )
									ret := 0.500000
								if( ema3 > 4.97417 )
									ret := 0.897436 // buy
						if( ema13 > 0.080551 )
							if( tema <= 7.26293 )
								if( tema <= 5.24525 )
									ret := 0.471545
								if( tema > 5.24525 )
									ret := 0.068182
							if( tema > 7.26293 )
								if( smoothD_d <= 95.4464 )
									ret := 0.447257
								if( smoothD_d > 95.4464 )
									ret := 0.802198 // buy
				if( tema > 9.63739 )
					if( rsi1 <= 78.6409 )
						if( ema12 <= 0.082185 )
							if( ema13 <= 0.095998 )
								if( d_k <= -0.680996 )
									ret := 0.333333
								if( d_k > -0.680996 )
									ret := 0.743902 // buy
							if( ema13 > 0.095998 )
								if( ema1 <= 12.2717 )
									ret := 0.941176 // buy
								if( ema1 > 12.2717 )
									ret := 0.500000
						if( ema12 > 0.082185 )
							if( d_k <= 0.297518 )
								if( d <= 79.3983 )
									ret := 0.428571
								if( d > 79.3983 )
									ret := -0.363636
							if( d_k > 0.297518 )
								if( ema12 <= 0.246688 )
									ret := 0.179487
								if( ema12 > 0.246688 )
									ret := 1.000000 // buy
					if( rsi1 > 78.6409 )
						if( k <= 87.8563 )
							if( ema3 <= 12.8184 )
								if( ema1 <= 9.98921 )
									ret := 1.000000 // buy
								if( ema1 > 9.98921 )
									ret := 0.700000 // buy
							if( ema3 > 12.8184 )
								if( ema12 <= 0.128118 )
									ret := 0.000000
								if( ema12 > 0.128118 )
									ret := 0.500000
						if( k > 87.8563 )
							if( tema <= 14.2922 )
								if( k <= 98.4405 )
									ret := 0.884956 // buy
								if( k > 98.4405 )
									ret := 0.971429 // buy
							if( tema > 14.2922 )
								if( d_k <= -0.115727 )
									ret := 0.000000
								if( d_k > -0.115727 )
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
float op_operation = decision_tree_0_UNIUSDT_15Min_578b9290(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


