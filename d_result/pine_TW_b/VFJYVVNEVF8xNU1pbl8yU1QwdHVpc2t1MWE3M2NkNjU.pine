//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: TRXUSDT_15Min_2ST0_1a73cd65 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2ST0_1a73cd65", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_1a73cd65(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 45.8336 )
		if( tema <= 0.071732 )
			if( ema12 <= -3.2e-05 )
				if( ema12 <= -0.000142 )
					if( smoothD_d <= -2.99917 )
						if( ema3 <= 0.064809 )
							if( rsi1 <= 14.5443 )
								if( tema <= 0.059222 )
									ret := 0.250000
								if( tema > 0.059222 )
									ret := -0.666667
							if( rsi1 > 14.5443 )
								if( ema13 <= -0.000238 )
									ret := 0.634146
								if( ema13 > -0.000238 )
									ret := -0.750000 // sell
						if( ema3 > 0.064809 )
							if( ema2 <= 0.069316 )
								if( ema2 <= 0.068587 )
									ret := -0.580000
								if( ema2 > 0.068587 )
									ret := 0.750000 // buy
							if( ema2 > 0.069316 )
								if( rsi1 <= 19.3629 )
									ret := -1.000000 // sell
								if( rsi1 > 19.3629 )
									ret := -0.833333 // sell
					if( smoothD_d > -2.99917 )
						if( ema1 <= 0.066038 )
							if( smoothK_k <= 11.8137 )
								if( d_k <= 1.48051 )
									ret := 0.322171
								if( d_k > 1.48051 )
									ret := 0.503439
							if( smoothK_k > 11.8137 )
								if( ema2 <= 0.064729 )
									ret := 0.188218
								if( ema2 > 0.064729 )
									ret := 0.381395
						if( ema1 > 0.066038 )
							if( rsi1 <= 24.3993 )
								if( d_k <= -0.28625 )
									ret := -0.241758
								if( d_k > -0.28625 )
									ret := 0.103825
							if( rsi1 > 24.3993 )
								if( d <= 43.6985 )
									ret := 0.229661
								if( d > 43.6985 )
									ret := 0.475983
				if( ema12 > -0.000142 )
					if( ema2 <= 0.063648 )
						if( k <= 0.812009 )
							if( k <= 0.00018 )
								if( smoothD_d <= 9.21969 )
									ret := 0.434211
								if( smoothD_d > 9.21969 )
									ret := -0.100000
							if( k > 0.00018 )
								if( smoothK_k <= -2.54658 )
									ret := 0.924528 // buy
								if( smoothK_k > -2.54658 )
									ret := 0.484848
						if( k > 0.812009 )
							if( d_k <= 0.86258 )
								if( d <= 68.647 )
									ret := 0.082634
								if( d > 68.647 )
									ret := 0.362573
							if( d_k > 0.86258 )
								if( smoothK_k <= 70.2516 )
									ret := 0.234823
								if( smoothK_k > 70.2516 )
									ret := 0.503937
					if( ema2 > 0.063648 )
						if( d <= 7.35882 )
							if( rsi1 <= 29.2085 )
								if( ema12 <= -7.8e-05 )
									ret := -0.362319
								if( ema12 > -7.8e-05 )
									ret := -0.743590 // sell
							if( rsi1 > 29.2085 )
								if( smoothK_k <= 5.82019 )
									ret := 0.120393
								if( smoothK_k > 5.82019 )
									ret := -0.315789
						if( d > 7.35882 )
							if( d_k <= -16.1685 )
								if( tema <= 0.063918 )
									ret := -0.500000
								if( tema > 0.063918 )
									ret := 0.337017
							if( d_k > -16.1685 )
								if( rsi1 <= 27.5796 )
									ret := -0.428571
								if( rsi1 > 27.5796 )
									ret := 0.030735
			if( ema12 > -3.2e-05 )
				if( ema3 <= 0.065521 )
					if( ema3 <= 0.06363 )
						if( tema <= 0.058535 )
							if( d_k <= 11.4043 )
								if( ema3 <= 0.05241 )
									ret := -0.420000
								if( ema3 > 0.05241 )
									ret := -0.050971
							if( d_k > 11.4043 )
								if( d <= 17.7573 )
									ret := 0.800000 // buy
								if( d > 17.7573 )
									ret := 0.086022
						if( tema > 0.058535 )
							if( d <= 4.61984 )
								if( d_k <= 0.887064 )
									ret := 0.530303
								if( d_k > 0.887064 )
									ret := -0.095238
							if( d > 4.61984 )
								if( rsi1 <= 42.4081 )
									ret := -0.002817
								if( rsi1 > 42.4081 )
									ret := 0.179669
					if( ema3 > 0.06363 )
						if( ema1 <= 0.065373 )
							if( rsi1 <= 40.9687 )
								if( ema12 <= 3e-06 )
									ret := -0.140845
								if( ema12 > 3e-06 )
									ret := -0.739726 // sell
							if( rsi1 > 40.9687 )
								if( smoothK_k <= 1.97808 )
									ret := 0.317073
								if( smoothK_k > 1.97808 )
									ret := -0.116000
						if( ema1 > 0.065373 )
							if( d_k <= 0.142242 )
								if( smoothK_k <= 0.879808 )
									ret := 1.000000 // buy
								if( smoothK_k > 0.879808 )
									ret := 0.636364
							if( d_k > 0.142242 )
								if( ema12 <= 4.3e-05 )
									ret := 0.250000
								if( ema12 > 4.3e-05 )
									ret := -0.750000 // sell
				if( ema3 > 0.065521 )
					if( ema12 <= 2.5e-05 )
						if( smoothD_d <= 13.7835 )
							if( rsi1 <= 45.061 )
								if( rsi1 <= 32.2128 )
									ret := -0.734513 // sell
								if( rsi1 > 32.2128 )
									ret := -0.349333
							if( rsi1 > 45.061 )
								if( k <= 7.57742 )
									ret := 0.722222 // buy
								if( k > 7.57742 )
									ret := 0.000000
						if( smoothD_d > 13.7835 )
							if( ema13 <= 6.8e-05 )
								if( rsi1 <= 35.2012 )
									ret := -0.625000
								if( rsi1 > 35.2012 )
									ret := -0.072897
							if( ema13 > 6.8e-05 )
								if( tema <= 0.069517 )
									ret := 0.636364
								if( tema > 0.069517 )
									ret := 0.000000
					if( ema12 > 2.5e-05 )
						if( ema3 <= 0.071325 )
							if( d <= 0.522241 )
								if( ema12 <= 8.6e-05 )
									ret := 0.444444
								if( ema12 > 8.6e-05 )
									ret := -1.000000 // sell
							if( d > 0.522241 )
								if( ema2 <= 0.066457 )
									ret := -0.455882
								if( ema2 > 0.066457 )
									ret := -0.693878
						if( ema3 > 0.071325 )
							ret := 0.200000
		if( tema > 0.071732 )
			if( k <= 14.7898 )
				if( rsi1 <= 23.4843 )
					if( rsi1 <= 14.2844 )
						if( ema12 <= -0.000666 )
							if( ema3 <= 0.077245 )
								if( smoothK_k <= -2.76581 )
									ret := 1.000000 // buy
								if( smoothK_k > -2.76581 )
									ret := 0.000000
							if( ema3 > 0.077245 )
								if( ema1 <= 0.080951 )
									ret := -0.384615
								if( ema1 > 0.080951 )
									ret := -0.871287 // sell
						if( ema12 > -0.000666 )
							if( ema1 <= 0.140711 )
								if( ema2 <= 0.115307 )
									ret := -0.931436 // sell
								if( ema2 > 0.115307 )
									ret := -0.842541 // sell
							if( ema1 > 0.140711 )
								if( ema3 <= 0.143176 )
									ret := -0.076923
								if( ema3 > 0.143176 )
									ret := -0.612903
					if( rsi1 > 14.2844 )
						if( ema12 <= -0.000202 )
							if( ema2 <= 0.081956 )
								if( ema13 <= -0.000749 )
									ret := 0.142857
								if( ema13 > -0.000749 )
									ret := -0.358779
							if( ema2 > 0.081956 )
								if( ema12 <= -0.000951 )
									ret := -0.259259
								if( ema12 > -0.000951 )
									ret := -0.632990
						if( ema12 > -0.000202 )
							if( ema13 <= -5.1e-05 )
								if( rsi1 <= 21.79 )
									ret := -0.772152 // sell
								if( rsi1 > 21.79 )
									ret := -0.586957
							if( ema13 > -5.1e-05 )
								if( k <= 3.75425 )
									ret := -0.871681 // sell
								if( k > 3.75425 )
									ret := -0.715686 // sell
				if( rsi1 > 23.4843 )
					if( ema12 <= -7e-06 )
						if( rsi1 <= 32.8839 )
							if( ema13 <= -0.000945 )
								if( ema3 <= 0.085332 )
									ret := 0.708333 // buy
								if( ema3 > 0.085332 )
									ret := -0.045455
							if( ema13 > -0.000945 )
								if( ema12 <= -0.000111 )
									ret := -0.293033
								if( ema12 > -0.000111 )
									ret := -0.553754
						if( rsi1 > 32.8839 )
							if( ema12 <= -9.1e-05 )
								if( ema1 <= 0.079853 )
									ret := 0.246914
								if( ema1 > 0.079853 )
									ret := -0.031373
							if( ema12 > -9.1e-05 )
								if( rsi1 <= 39.8506 )
									ret := -0.342308
								if( rsi1 > 39.8506 )
									ret := -0.072464
					if( ema12 > -7e-06 )
						if( rsi1 <= 39.9913 )
							if( ema13 <= 0.000158 )
								if( ema12 <= 4.1e-05 )
									ret := -0.609259
								if( ema12 > 4.1e-05 )
									ret := -0.788462 // sell
							if( ema13 > 0.000158 )
								if( ema12 <= 6.5e-05 )
									ret := -0.464567
								if( ema12 > 6.5e-05 )
									ret := -0.842593 // sell
						if( rsi1 > 39.9913 )
							if( ema12 <= 0.000149 )
								if( ema12 <= 3.7e-05 )
									ret := -0.254989
								if( ema12 > 3.7e-05 )
									ret := -0.482566
							if( ema12 > 0.000149 )
								if( smoothK_k <= 9.21214 )
									ret := -0.858921 // sell
								if( smoothK_k > 9.21214 )
									ret := 0.000000
			if( k > 14.7898 )
				if( ema12 <= -0.0001 )
					if( k <= 83.8364 )
						if( rsi1 <= 33.8579 )
							if( rsi1 <= 28.8328 )
								if( ema13 <= -0.001273 )
									ret := 0.024752
								if( ema13 > -0.001273 )
									ret := -0.443813
							if( rsi1 > 28.8328 )
								if( ema12 <= -0.0002 )
									ret := -0.012821
								if( ema12 > -0.0002 )
									ret := -0.311983
						if( rsi1 > 33.8579 )
							if( d_k <= -17.147 )
								if( smoothK_k <= 56.8565 )
									ret := -0.403614
								if( smoothK_k > 56.8565 )
									ret := 0.072115
							if( d_k > -17.147 )
								if( ema12 <= -0.000138 )
									ret := 0.268531
								if( ema12 > -0.000138 )
									ret := 0.019345
					if( k > 83.8364 )
						if( ema12 <= -0.000561 )
							if( rsi1 <= 33.6291 )
								if( tema <= 0.122532 )
									ret := 0.435897
								if( tema > 0.122532 )
									ret := -0.307692
							if( rsi1 > 33.6291 )
								if( rsi1 <= 40.6024 )
									ret := 0.620690
								if( rsi1 > 40.6024 )
									ret := 0.958333 // buy
						if( ema12 > -0.000561 )
							if( rsi1 <= 33.9569 )
								if( ema1 <= 0.081808 )
									ret := 0.120000
								if( ema1 > 0.081808 )
									ret := -0.340541
							if( rsi1 > 33.9569 )
								if( d <= 89.3798 )
									ret := 0.362559
								if( d > 89.3798 )
									ret := 0.041783
				if( ema12 > -0.0001 )
					if( rsi1 <= 38.2749 )
						if( rsi1 <= 33.3332 )
							if( ema13 <= 0.000198 )
								if( ema3 <= 0.114855 )
									ret := -0.656772
								if( ema3 > 0.114855 )
									ret := -0.473684
							if( ema13 > 0.000198 )
								if( smoothK_k <= 13.5739 )
									ret := 1.000000 // buy
								if( smoothK_k > 13.5739 )
									ret := 0.428571
						if( rsi1 > 33.3332 )
							if( ema12 <= -4.1e-05 )
								if( d_k <= -17.7726 )
									ret := -0.760000 // sell
								if( d_k > -17.7726 )
									ret := -0.294363
							if( ema12 > -4.1e-05 )
								if( ema12 <= 6.7e-05 )
									ret := -0.476695
								if( ema12 > 6.7e-05 )
									ret := -0.787234 // sell
					if( rsi1 > 38.2749 )
						if( ema12 <= -1.2e-05 )
							if( rsi1 <= 42.3834 )
								if( tema <= 0.083823 )
									ret := -0.069892
								if( tema > 0.083823 )
									ret := -0.250356
							if( rsi1 > 42.3834 )
								if( tema <= 0.073986 )
									ret := 0.411765
								if( tema > 0.073986 )
									ret := -0.049234
						if( ema12 > -1.2e-05 )
							if( ema12 <= 9.1e-05 )
								if( d_k <= -4.27562 )
									ret := -0.632948
								if( d_k > -4.27562 )
									ret := -0.326419
							if( ema12 > 9.1e-05 )
								if( d <= 76.6295 )
									ret := -0.767296 // sell
								if( d > 76.6295 )
									ret := -0.125000
	if( rsi1 > 45.8336 )
		if( rsi1 <= 69.9123 )
			if( ema12 <= -7.8e-05 )
				if( rsi1 <= 55.6857 )
					if( ema1 <= 0.084893 )
						if( smoothK_k <= 48.4421 )
							if( ema12 <= -0.000167 )
								if( smoothD_d <= 7.98228 )
									ret := 0.160000
								if( smoothD_d > 7.98228 )
									ret := -0.687500
							if( ema12 > -0.000167 )
								if( ema13 <= 0.000102 )
									ret := 0.280822
								if( ema13 > 0.000102 )
									ret := -0.631579
						if( smoothK_k > 48.4421 )
							if( smoothD_d <= 95.6221 )
								if( k <= 96.1852 )
									ret := 0.364362
								if( k > 96.1852 )
									ret := 0.655738
							if( smoothD_d > 95.6221 )
								if( d_k <= 0.265147 )
									ret := -0.750000 // sell
								if( d_k > 0.265147 )
									ret := 0.684211
					if( ema1 > 0.084893 )
						if( ema3 <= 0.128064 )
							if( tema <= 0.110929 )
								if( ema13 <= -1.9e-05 )
									ret := 0.689740
								if( ema13 > -1.9e-05 )
									ret := -0.750000 // sell
							if( tema > 0.110929 )
								if( ema12 <= -0.000144 )
									ret := 0.621849
								if( ema12 > -0.000144 )
									ret := 0.283019
						if( ema3 > 0.128064 )
							if( tema <= 0.132604 )
								if( smoothD_d <= 26.8451 )
									ret := 0.777778 // buy
								if( smoothD_d > 26.8451 )
									ret := 0.308824
							if( tema > 0.132604 )
								if( ema12 <= -0.000289 )
									ret := 0.617647
								if( ema12 > -0.000289 )
									ret := 0.117647
				if( rsi1 > 55.6857 )
					if( tema <= 0.120351 )
						if( ema2 <= 0.068909 )
							if( k <= 59.8378 )
								ret := -0.800000 // sell
							if( k > 59.8378 )
								if( ema13 <= -0.000266 )
									ret := 0.256410
								if( ema13 > -0.000266 )
									ret := 0.789474 // buy
						if( ema2 > 0.068909 )
							if( rsi1 <= 56.5251 )
								if( ema12 <= -0.000195 )
									ret := 0.947368 // buy
								if( ema12 > -0.000195 )
									ret := 0.467742
							if( rsi1 > 56.5251 )
								if( tema <= 0.102823 )
									ret := 0.879310 // buy
								if( tema > 0.102823 )
									ret := 0.725564 // buy
					if( tema > 0.120351 )
						if( d_k <= -23.1581 )
							ret := 0.000000
						if( d_k > -23.1581 )
							if( rsi1 <= 60.6323 )
								if( ema13 <= -0.000216 )
									ret := 0.306667
								if( ema13 > -0.000216 )
									ret := 0.731707 // buy
							if( rsi1 > 60.6323 )
								if( ema12 <= -0.000109 )
									ret := 0.759036 // buy
								if( ema12 > -0.000109 )
									ret := 0.500000
			if( ema12 > -7.8e-05 )
				if( ema12 <= 0.000144 )
					if( rsi1 <= 55.9325 )
						if( ema13 <= 6.1e-05 )
							if( d_k <= -5.90913 )
								if( ema13 <= -1e-06 )
									ret := 0.082524
								if( ema13 > -1e-06 )
									ret := -0.080734
							if( d_k > -5.90913 )
								if( ema12 <= -2e-05 )
									ret := 0.265606
								if( ema12 > -2e-05 )
									ret := 0.045376
						if( ema13 > 6.1e-05 )
							if( ema1 <= 0.063847 )
								if( d <= 20.7955 )
									ret := -0.115672
								if( d > 20.7955 )
									ret := 0.202420
							if( ema1 > 0.063847 )
								if( ema12 <= 6.1e-05 )
									ret := 0.067887
								if( ema12 > 6.1e-05 )
									ret := -0.230797
					if( rsi1 > 55.9325 )
						if( ema3 <= 0.070926 )
							if( ema12 <= 1.8e-05 )
								if( ema1 <= 0.063877 )
									ret := 0.071429
								if( ema1 > 0.063877 )
									ret := 0.377419
							if( ema12 > 1.8e-05 )
								if( ema3 <= 0.064653 )
									ret := -0.010167
								if( ema3 > 0.064653 )
									ret := 0.080891
						if( ema3 > 0.070926 )
							if( ema12 <= 2e-06 )
								if( ema3 <= 0.112116 )
									ret := 0.612452
								if( ema3 > 0.112116 )
									ret := 0.363043
							if( ema12 > 2e-06 )
								if( d <= 82.6955 )
									ret := 0.210016
								if( d > 82.6955 )
									ret := 0.348729
				if( ema12 > 0.000144 )
					if( d <= 34.1252 )
						if( ema12 <= 0.000351 )
							if( rsi1 <= 62.2451 )
								if( smoothK_k <= -0.300429 )
									ret := -0.178082
								if( smoothK_k > -0.300429 )
									ret := -0.462387
							if( rsi1 > 62.2451 )
								if( smoothD_d <= 28.3974 )
									ret := 0.064639
								if( smoothD_d > 28.3974 )
									ret := -0.465517
						if( ema12 > 0.000351 )
							if( rsi1 <= 64.9274 )
								if( d_k <= -10.6537 )
									ret := 0.250000
								if( d_k > -10.6537 )
									ret := -0.761006 // sell
							if( rsi1 > 64.9274 )
								if( d_k <= -0.085656 )
									ret := 0.382353
								if( d_k > -0.085656 )
									ret := -0.359649
					if( d > 34.1252 )
						if( rsi1 <= 66.6673 )
							if( d <= 69.2135 )
								if( rsi1 <= 54.8057 )
									ret := -0.549801
								if( rsi1 > 54.8057 )
									ret := -0.150241
							if( d > 69.2135 )
								if( ema12 <= 0.000667 )
									ret := -0.011342
								if( ema12 > 0.000667 )
									ret := -0.583333
						if( rsi1 > 66.6673 )
							if( ema1 <= 0.082091 )
								if( d_k <= 4.47919 )
									ret := -0.158730
								if( d_k > 4.47919 )
									ret := 0.219436
							if( ema1 > 0.082091 )
								if( d <= 89.4553 )
									ret := 0.190931
								if( d > 89.4553 )
									ret := 0.635294
		if( rsi1 > 69.9123 )
			if( ema3 <= 0.072113 )
				if( ema13 <= 0.000345 )
					if( ema1 <= 0.065879 )
						if( ema12 <= 2.8e-05 )
							if( ema1 <= 0.063447 )
								if( d <= 92.4908 )
									ret := 0.500000
								if( d > 92.4908 )
									ret := 0.000000
							if( ema1 > 0.063447 )
								if( rsi1 <= 70.8995 )
									ret := 0.200000
								if( rsi1 > 70.8995 )
									ret := 0.885714 // buy
						if( ema12 > 2.8e-05 )
							if( d_k <= -17.8801 )
								if( ema2 <= 0.061524 )
									ret := -0.166667
								if( ema2 > 0.061524 )
									ret := -0.568966
							if( d_k > -17.8801 )
								if( smoothD_d <= 95.1917 )
									ret := 0.022488
								if( smoothD_d > 95.1917 )
									ret := -0.232673
					if( ema1 > 0.065879 )
						if( rsi1 <= 85.0604 )
							if( d_k <= -0.009882 )
								if( ema12 <= 6.4e-05 )
									ret := 0.483444
								if( ema12 > 6.4e-05 )
									ret := 0.118056
							if( d_k > -0.009882 )
								if( d <= 91.0983 )
									ret := 0.299517
								if( d > 91.0983 )
									ret := 0.617450
						if( rsi1 > 85.0604 )
							if( d_k <= 0.010868 )
								if( rsi1 <= 90.0557 )
									ret := 0.762712 // buy
								if( rsi1 > 90.0557 )
									ret := 0.974359 // buy
							if( d_k > 0.010868 )
								if( smoothK_k <= 94.9644 )
									ret := 0.555556
								if( smoothK_k > 94.9644 )
									ret := -0.250000
				if( ema13 > 0.000345 )
					if( smoothD_d <= 96.9964 )
						if( ema13 <= 0.000544 )
							if( ema2 <= 0.070867 )
								if( d <= 96.5474 )
									ret := -0.009449
								if( d > 96.5474 )
									ret := -0.384181
							if( ema2 > 0.070867 )
								if( d <= 99.2465 )
									ret := 0.742857 // buy
								if( d > 99.2465 )
									ret := -0.200000
						if( ema13 > 0.000544 )
							if( ema2 <= 0.071384 )
								if( rsi1 <= 83.3477 )
									ret := -0.159907
								if( rsi1 > 83.3477 )
									ret := -0.513308
							if( ema2 > 0.071384 )
								if( d <= 99.7253 )
									ret := -0.851852 // sell
								if( d > 99.7253 )
									ret := 0.500000
					if( smoothD_d > 96.9964 )
						if( rsi1 <= 86.1078 )
							if( ema12 <= 0.000291 )
								if( ema12 <= 0.000243 )
									ret := -0.750000 // sell
								if( ema12 > 0.000243 )
									ret := -1.000000 // sell
							if( ema12 > 0.000291 )
								if( ema1 <= 0.06086 )
									ret := 1.000000 // buy
								if( ema1 > 0.06086 )
									ret := -0.050000
						if( rsi1 > 86.1078 )
							if( ema3 <= 0.0623 )
								if( ema12 <= 0.001568 )
									ret := 0.714286 // buy
								if( ema12 > 0.001568 )
									ret := -0.500000
							if( ema3 > 0.0623 )
								ret := 1.000000 // buy
			if( ema3 > 0.072113 )
				if( k <= 96.3006 )
					if( smoothK_k <= 34.0458 )
						if( ema3 <= 0.077417 )
							if( ema12 <= 0.000301 )
								if( ema12 <= 0.000136 )
									ret := 0.625000
								if( ema12 > 0.000136 )
									ret := 0.086957
							if( ema12 > 0.000301 )
								if( ema12 <= 0.000369 )
									ret := -0.428571
								if( ema12 > 0.000369 )
									ret := -0.833333 // sell
						if( ema3 > 0.077417 )
							if( k <= 33.2713 )
								if( tema <= 0.13548 )
									ret := 0.269720
								if( tema > 0.13548 )
									ret := 0.555556
							if( k > 33.2713 )
								if( ema12 <= 0.000536 )
									ret := 0.137255
								if( ema12 > 0.000536 )
									ret := -0.500000
					if( smoothK_k > 34.0458 )
						if( ema12 <= 0.001478 )
							if( ema3 <= 0.081079 )
								if( ema12 <= 0.000265 )
									ret := 0.533485
								if( ema12 > 0.000265 )
									ret := -0.064615
							if( ema3 > 0.081079 )
								if( rsi1 <= 81.8196 )
									ret := 0.475736
								if( rsi1 > 81.8196 )
									ret := 0.691786
						if( ema12 > 0.001478 )
							if( d <= 50.8036 )
								ret := 1.000000 // buy
							if( d > 50.8036 )
								if( d <= 80.4795 )
									ret := -0.846154 // sell
								if( d > 80.4795 )
									ret := 0.000000
				if( k > 96.3006 )
					if( ema12 <= 0.001117 )
						if( rsi1 <= 87.3949 )
							if( ema13 <= 0.0006 )
								if( tema <= 0.119112 )
									ret := 0.731161 // buy
								if( tema > 0.119112 )
									ret := 0.589781
							if( ema13 > 0.0006 )
								if( tema <= 0.085121 )
									ret := 0.018868
								if( tema > 0.085121 )
									ret := 0.750000 // buy
						if( rsi1 > 87.3949 )
							if( smoothD_d <= 96.7692 )
								if( rsi1 <= 99.8322 )
									ret := 0.758900 // buy
								if( rsi1 > 99.8322 )
									ret := 0.266667
							if( smoothD_d > 96.7692 )
								if( k <= 99.6654 )
									ret := 0.625000
								if( k > 99.6654 )
									ret := 0.926471 // buy
					if( ema12 > 0.001117 )
						if( tema <= 0.085864 )
							if( rsi1 <= 83.9822 )
								if( ema1 <= 0.075676 )
									ret := -0.750000 // sell
								if( ema1 > 0.075676 )
									ret := -1.000000 // sell
							if( rsi1 > 83.9822 )
								if( k <= 99.9884 )
									ret := -0.666667
								if( k > 99.9884 )
									ret := 0.571429
						if( tema > 0.085864 )
							if( ema12 <= 0.001519 )
								ret := 1.000000 // buy
							if( ema12 > 0.001519 )
								ret := 0.250000
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_1a73cd65(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


