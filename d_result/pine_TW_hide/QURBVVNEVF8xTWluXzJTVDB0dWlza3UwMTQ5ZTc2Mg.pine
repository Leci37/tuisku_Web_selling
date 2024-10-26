//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADAUSDT_1Min_2ST0_0149e762 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_1Min_2ST0_0149e762", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_1Min_0149e762(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 44.2981 )
		if( ema3 <= 0.367229 )
			if( k <= 17.5444 )
				if( k <= 5.39932 )
					if( rsi1 <= 18.7594 )
						if( d <= 7.19405 )
							if( tema <= 0.349941 )
								if( d_k <= -2.36295 )
									ret := -0.294118
								if( d_k > -2.36295 )
									ret := 0.256741
							if( tema > 0.349941 )
								if( smoothD_d <= -2.98105 )
									ret := 0.283465
								if( smoothD_d > -2.98105 )
									ret := -0.040541
						if( d > 7.19405 )
							if( d <= 10.0645 )
								if( rsi1 <= 11.5927 )
									ret := 0.375000
								if( rsi1 > 11.5927 )
									ret := -0.596774
							if( d > 10.0645 )
								if( ema13 <= 0.000675 )
									ret := -0.075949
								if( ema13 > 0.000675 )
									ret := 0.857143 // buy
					if( rsi1 > 18.7594 )
						if( ema3 <= 0.312805 )
							if( smoothK_k <= -1.12566 )
								if( d_k <= 5.07062 )
									ret := 0.977778 // buy
								if( d_k > 5.07062 )
									ret := 0.750000 // buy
							if( smoothK_k > -1.12566 )
								if( ema3 <= 0.294152 )
									ret := -0.166667
								if( ema3 > 0.294152 )
									ret := 0.729167 // buy
						if( ema3 > 0.312805 )
							if( smoothD_d <= -0.563836 )
								if( rsi1 <= 42.7552 )
									ret := 0.347700
								if( rsi1 > 42.7552 )
									ret := 0.007299
							if( smoothD_d > -0.563836 )
								if( ema12 <= -0.000184 )
									ret := 0.382260
								if( ema12 > -0.000184 )
									ret := 0.194881
				if( k > 5.39932 )
					if( ema12 <= 0.000778 )
						if( ema13 <= -0.000829 )
							if( tema <= 0.330074 )
								if( k <= 15.727 )
									ret := 0.842697 // buy
								if( k > 15.727 )
									ret := 0.142857
							if( tema > 0.330074 )
								if( d_k <= -4.61239 )
									ret := -0.075000
								if( d_k > -4.61239 )
									ret := 0.385159
						if( ema13 > -0.000829 )
							if( rsi1 <= 25.0708 )
								if( ema2 <= 0.352393 )
									ret := 0.062619
								if( ema2 > 0.352393 )
									ret := -0.176685
							if( rsi1 > 25.0708 )
								if( d <= 11.7763 )
									ret := 0.199893
								if( d > 11.7763 )
									ret := 0.074554
					if( ema12 > 0.000778 )
						if( rsi1 <= 32.5603 )
							if( smoothD_d <= 9.99522 )
								if( k <= 5.65689 )
									ret := 0.000000
								if( k > 5.65689 )
									ret := -0.901235 // sell
							if( smoothD_d > 9.99522 )
								ret := 0.000000
						if( rsi1 > 32.5603 )
							if( k <= 14.4613 )
								if( d_k <= 10.6417 )
									ret := 0.188406
								if( d_k > 10.6417 )
									ret := -0.888889 // sell
							if( k > 14.4613 )
								if( smoothK_k <= 12.391 )
									ret := -1.000000 // sell
								if( smoothK_k > 12.391 )
									ret := -0.733333 // sell
			if( k > 17.5444 )
				if( d <= 78.5427 )
					if( ema12 <= 0.000259 )
						if( k <= 50.3139 )
							if( ema2 <= 0.35597 )
								if( rsi1 <= 31.0709 )
									ret := -0.061404
								if( rsi1 > 31.0709 )
									ret := 0.080325
							if( ema2 > 0.35597 )
								if( d <= 38.5791 )
									ret := -0.175520
								if( d > 38.5791 )
									ret := 0.131980
						if( k > 50.3139 )
							if( ema1 <= 0.31307 )
								if( ema13 <= -0.001234 )
									ret := -1.000000 // sell
								if( ema13 > -0.001234 )
									ret := -0.791667 // sell
							if( ema1 > 0.31307 )
								if( d_k <= 14.4409 )
									ret := -0.135155
								if( d_k > 14.4409 )
									ret := 0.171674
					if( ema12 > 0.000259 )
						if( d <= 39.7499 )
							if( rsi1 <= 37.4987 )
								if( tema <= 0.340295 )
									ret := -0.555133
								if( tema > 0.340295 )
									ret := -0.274090
							if( rsi1 > 37.4987 )
								if( k <= 55.3925 )
									ret := -0.193084
								if( k > 55.3925 )
									ret := 0.550000
						if( d > 39.7499 )
							if( ema3 <= 0.31561 )
								if( ema12 <= 0.000387 )
									ret := -0.250000
								if( ema12 > 0.000387 )
									ret := -1.000000 // sell
							if( ema3 > 0.31561 )
								if( ema2 <= 0.354993 )
									ret := -0.071736
								if( ema2 > 0.354993 )
									ret := 0.182927
				if( d > 78.5427 )
					if( ema12 <= -0.000276 )
						if( d_k <= 16.051 )
							if( k <= 83.559 )
								if( rsi1 <= 36.6504 )
									ret := -0.850000 // sell
								if( rsi1 > 36.6504 )
									ret := -0.204225
							if( k > 83.559 )
								if( rsi1 <= 42.5701 )
									ret := -0.765363 // sell
								if( rsi1 > 42.5701 )
									ret := -0.489796
						if( d_k > 16.051 )
							if( smoothD_d <= 79.5657 )
								if( k <= 59.9021 )
									ret := 0.000000
								if( k > 59.9021 )
									ret := -0.625000
							if( smoothD_d > 79.5657 )
								if( d <= 85.1208 )
									ret := 1.000000 // buy
								if( d > 85.1208 )
									ret := -0.142857
					if( ema12 > -0.000276 )
						if( ema13 <= 0.000959 )
							if( d_k <= -15.1041 )
								if( rsi1 <= 40.1231 )
									ret := 0.000000
								if( rsi1 > 40.1231 )
									ret := 0.650000
							if( d_k > -15.1041 )
								if( d_k <= 22.1534 )
									ret := -0.185974
								if( d_k > 22.1534 )
									ret := 0.290323
						if( ema13 > 0.000959 )
							if( rsi1 <= 41.6574 )
								if( ema13 <= 0.001482 )
									ret := -0.850000 // sell
								if( ema13 > 0.001482 )
									ret := -0.500000
							if( rsi1 > 41.6574 )
								if( ema12 <= 0.000682 )
									ret := -0.200000
								if( ema12 > 0.000682 )
									ret := -0.750000 // sell
		if( ema3 > 0.367229 )
			if( d_k <= -0.005535 )
				if( ema1 <= 0.448316 )
					if( d_k <= -5.75929 )
						if( ema12 <= -0.000274 )
							if( k <= 66.1527 )
								if( rsi1 <= 35.1229 )
									ret := -0.347495
								if( rsi1 > 35.1229 )
									ret := 0.155431
							if( k > 66.1527 )
								if( rsi1 <= 29.0191 )
									ret := -0.763052 // sell
								if( rsi1 > 29.0191 )
									ret := -0.338649
						if( ema12 > -0.000274 )
							if( ema3 <= 0.39211 )
								if( smoothD_d <= 12.9086 )
									ret := -0.247917
								if( smoothD_d > 12.9086 )
									ret := -0.436231
							if( ema3 > 0.39211 )
								if( d_k <= -11.5591 )
									ret := -0.601095
								if( d_k > -11.5591 )
									ret := -0.478064
					if( d_k > -5.75929 )
						if( rsi1 <= 26.3113 )
							if( ema2 <= 0.38642 )
								if( ema3 <= 0.37196 )
									ret := -0.165829
								if( ema3 > 0.37196 )
									ret := -0.370000
							if( ema2 > 0.38642 )
								if( rsi1 <= 19.9787 )
									ret := -0.611675
								if( rsi1 > 19.9787 )
									ret := -0.429153
						if( rsi1 > 26.3113 )
							if( smoothK_k <= 9.86683 )
								if( rsi1 <= 35.1301 )
									ret := -0.165449
								if( rsi1 > 35.1301 )
									ret := 0.045428
							if( smoothK_k > 9.86683 )
								if( d <= 91.5323 )
									ret := -0.248861
								if( d > 91.5323 )
									ret := -0.536437
				if( ema1 > 0.448316 )
					if( ema12 <= -4.6e-05 )
						if( k <= 15.3355 )
							if( smoothK_k <= 0.056102 )
								if( rsi1 <= 37.0099 )
									ret := -0.476852
								if( rsi1 > 37.0099 )
									ret := 0.307692
							if( smoothK_k > 0.056102 )
								if( rsi1 <= 23.0249 )
									ret := -0.353846
								if( rsi1 > 23.0249 )
									ret := -0.082993
						if( k > 15.3355 )
							if( rsi1 <= 34.0659 )
								if( rsi1 <= 20.2202 )
									ret := -0.589744
								if( rsi1 > 20.2202 )
									ret := -0.090993
							if( rsi1 > 34.0659 )
								if( ema2 <= 0.463164 )
									ret := 0.068646
								if( ema2 > 0.463164 )
									ret := 0.212567
					if( ema12 > -4.6e-05 )
						if( ema13 <= 0.000248 )
							if( rsi1 <= 29.8649 )
								if( tema <= 0.448805 )
									ret := 0.000000
								if( tema > 0.448805 )
									ret := -0.729412 // sell
							if( rsi1 > 29.8649 )
								if( rsi1 <= 39.8553 )
									ret := -0.370558
								if( rsi1 > 39.8553 )
									ret := -0.155000
						if( ema13 > 0.000248 )
							if( ema1 <= 0.448466 )
								ret := 0.333333
							if( ema1 > 0.448466 )
								if( ema12 <= 0.00014 )
									ret := -0.500000
								if( ema12 > 0.00014 )
									ret := -0.730159 // sell
			if( d_k > -0.005535 )
				if( rsi1 <= 28.8556 )
					if( ema3 <= 0.442309 )
						if( d_k <= 14.2685 )
							if( smoothK_k <= 6.7945 )
								if( ema13 <= -0.000499 )
									ret := 0.012931
								if( ema13 > -0.000499 )
									ret := -0.183948
							if( smoothK_k > 6.7945 )
								if( smoothD_d <= 47.2765 )
									ret := -0.355596
								if( smoothD_d > 47.2765 )
									ret := -0.633663
						if( d_k > 14.2685 )
							if( ema12 <= -0.000159 )
								if( k <= 0.269898 )
									ret := 0.666667
								if( k > 0.269898 )
									ret := 0.091111
							if( ema12 > -0.000159 )
								if( ema3 <= 0.42253 )
									ret := -0.148338
								if( ema3 > 0.42253 )
									ret := -0.584615
					if( ema3 > 0.442309 )
						if( rsi1 <= 22.6877 )
							if( smoothD_d <= 13.306 )
								if( k <= 1.90298 )
									ret := -0.531646
								if( k > 1.90298 )
									ret := -0.275194
							if( smoothD_d > 13.306 )
								if( ema12 <= 0.000133 )
									ret := -0.648501
								if( ema12 > 0.000133 )
									ret := 0.400000
						if( rsi1 > 22.6877 )
							if( d <= 44.6323 )
								if( ema12 <= -0.000642 )
									ret := 0.133333
								if( ema12 > -0.000642 )
									ret := -0.334027
							if( d > 44.6323 )
								if( k <= 73.2693 )
									ret := -0.595238
								if( k > 73.2693 )
									ret := -0.200000
				if( rsi1 > 28.8556 )
					if( ema1 <= 0.43938 )
						if( k <= 68.7172 )
							if( ema12 <= -0.000128 )
								if( d_k <= 11.7293 )
									ret := 0.155448
								if( d_k > 11.7293 )
									ret := 0.464652
							if( ema12 > -0.000128 )
								if( smoothK_k <= 4.2905 )
									ret := 0.165944
								if( smoothK_k > 4.2905 )
									ret := -0.098252
						if( k > 68.7172 )
							if( d_k <= 11.4457 )
								if( rsi1 <= 35.6645 )
									ret := -0.530488
								if( rsi1 > 35.6645 )
									ret := -0.235702
							if( d_k > 11.4457 )
								if( ema13 <= -0.000713 )
									ret := 0.480000
								if( ema13 > -0.000713 )
									ret := -0.116883
					if( ema1 > 0.43938 )
						if( ema12 <= 1.1e-05 )
							if( rsi1 <= 38.2214 )
								if( ema12 <= -0.000237 )
									ret := -0.086039
								if( ema12 > -0.000237 )
									ret := -0.208167
							if( rsi1 > 38.2214 )
								if( ema12 <= -0.000566 )
									ret := 0.568966
								if( ema12 > -0.000566 )
									ret := -0.059490
						if( ema12 > 1.1e-05 )
							if( ema12 <= 0.000892 )
								if( ema2 <= 0.450059 )
									ret := -0.280835
								if( ema2 > 0.450059 )
									ret := -0.471066
							if( ema12 > 0.000892 )
								if( tema <= 0.450044 )
									ret := 0.931034 // buy
								if( tema > 0.450044 )
									ret := 0.000000
	if( rsi1 > 44.2981 )
		if( d_k <= 0.000624 )
			if( tema <= 0.44091 )
				if( smoothK_k <= 28.6666 )
					if( smoothD_d <= -0.149228 )
						if( ema12 <= 0.000321 )
							if( ema12 <= 2.5e-05 )
								if( smoothK_k <= -1.15079 )
									ret := 0.393258
								if( smoothK_k > -1.15079 )
									ret := 0.117647
							if( ema12 > 2.5e-05 )
								if( smoothK_k <= -2.13319 )
									ret := 0.097087
								if( smoothK_k > -2.13319 )
									ret := 0.445876
						if( ema12 > 0.000321 )
							if( rsi1 <= 44.6143 )
								if( ema13 <= 0.001124 )
									ret := 0.250000
								if( ema13 > 0.001124 )
									ret := -1.000000 // sell
							if( rsi1 > 44.6143 )
								if( tema <= 0.388045 )
									ret := 0.750916 // buy
								if( tema > 0.388045 )
									ret := 0.549296
					if( smoothD_d > -0.149228 )
						if( rsi1 <= 59.1353 )
							if( ema3 <= 0.346557 )
								if( d <= 28.7287 )
									ret := 0.284440
								if( d > 28.7287 )
									ret := 0.888889 // buy
							if( ema3 > 0.346557 )
								if( ema12 <= 0.000167 )
									ret := 0.176000
								if( ema12 > 0.000167 )
									ret := -0.025076
						if( rsi1 > 59.1353 )
							if( ema13 <= 0.000571 )
								if( d_k <= -7.37289 )
									ret := 0.088670
								if( d_k > -7.37289 )
									ret := 0.370513
							if( ema13 > 0.000571 )
								if( rsi1 <= 68.1335 )
									ret := 0.393684
								if( rsi1 > 68.1335 )
									ret := 0.779279 // buy
				if( smoothK_k > 28.6666 )
					if( rsi1 <= 61.6068 )
						if( ema12 <= 0.000126 )
							if( k <= 82.5346 )
								if( ema12 <= -1.7e-05 )
									ret := 0.109594
								if( ema12 > -1.7e-05 )
									ret := -0.070167
							if( k > 82.5346 )
								if( smoothK_k <= 94.6305 )
									ret := -0.095492
								if( smoothK_k > 94.6305 )
									ret := -0.278564
						if( ema12 > 0.000126 )
							if( ema1 <= 0.356866 )
								if( ema12 <= 0.000454 )
									ret := -0.090255
								if( ema12 > 0.000454 )
									ret := -0.312102
							if( ema1 > 0.356866 )
								if( d <= 85.451 )
									ret := -0.414966
								if( d > 85.451 )
									ret := -0.004598
					if( rsi1 > 61.6068 )
						if( ema2 <= 0.366605 )
							if( k <= 97.6297 )
								if( k <= 63.0854 )
									ret := 0.232073
								if( k > 63.0854 )
									ret := 0.009726
							if( k > 97.6297 )
								if( d_k <= -0.327052 )
									ret := -0.120551
								if( d_k > -0.327052 )
									ret := -0.248848
						if( ema2 > 0.366605 )
							if( ema13 <= 0.000557 )
								if( rsi1 <= 77.3792 )
									ret := 0.122054
								if( rsi1 > 77.3792 )
									ret := 0.294808
							if( ema13 > 0.000557 )
								if( rsi1 <= 72.1775 )
									ret := -0.224674
								if( rsi1 > 72.1775 )
									ret := 0.268411
			if( tema > 0.44091 )
				if( rsi1 <= 66.7921 )
					if( ema13 <= -0.000258 )
						if( ema12 <= -0.000273 )
							if( ema2 <= 0.449196 )
								if( d <= 83.6928 )
									ret := 0.583333
								if( d > 83.6928 )
									ret := 0.146789
							if( ema2 > 0.449196 )
								if( ema12 <= -0.000351 )
									ret := 0.783270 // buy
								if( ema12 > -0.000351 )
									ret := 0.577465
						if( ema12 > -0.000273 )
							if( k <= 99.5721 )
								if( k <= 99.1103 )
									ret := 0.296337
								if( k > 99.1103 )
									ret := -0.818182 // sell
							if( k > 99.5721 )
								if( rsi1 <= 57.9796 )
									ret := 0.218543
								if( rsi1 > 57.9796 )
									ret := 0.700000 // buy
					if( ema13 > -0.000258 )
						if( ema12 <= 4.9e-05 )
							if( rsi1 <= 50.1053 )
								if( smoothK_k <= 35.7937 )
									ret := 0.112903
								if( smoothK_k > 35.7937 )
									ret := -0.020619
							if( rsi1 > 50.1053 )
								if( k <= 85.1696 )
									ret := 0.337537
								if( k > 85.1696 )
									ret := 0.166898
						if( ema12 > 4.9e-05 )
							if( rsi1 <= 52.2043 )
								if( k <= 51.6189 )
									ret := -0.189139
								if( k > 51.6189 )
									ret := -0.640000
							if( rsi1 > 52.2043 )
								if( rsi1 <= 59.4646 )
									ret := -0.020877
								if( rsi1 > 59.4646 )
									ret := 0.123779
				if( rsi1 > 66.7921 )
					if( rsi1 <= 83.3979 )
						if( ema13 <= -1e-05 )
							if( ema12 <= -0.000308 )
								if( tema <= 0.450623 )
									ret := -0.114286
								if( tema > 0.450623 )
									ret := 1.000000 // buy
							if( ema12 > -0.000308 )
								if( smoothD_d <= 95.7719 )
									ret := 0.498208
								if( smoothD_d > 95.7719 )
									ret := 0.752747 // buy
						if( ema13 > -1e-05 )
							if( smoothD_d <= 49.3023 )
								if( ema2 <= 0.441051 )
									ret := -0.142857
								if( ema2 > 0.441051 )
									ret := 0.521197
							if( smoothD_d > 49.3023 )
								if( ema12 <= 0.000767 )
									ret := 0.306674
								if( ema12 > 0.000767 )
									ret := -0.171429
					if( rsi1 > 83.3979 )
						if( smoothK_k <= 93.7784 )
							if( ema13 <= 0.001643 )
								if( smoothD_d <= 73.0684 )
									ret := 0.658537
								if( smoothD_d > 73.0684 )
									ret := 0.310345
							if( ema13 > 0.001643 )
								if( ema1 <= 0.470573 )
									ret := -1.000000 // sell
								if( ema1 > 0.470573 )
									ret := 0.500000
						if( smoothK_k > 93.7784 )
							if( ema3 <= 0.47657 )
								if( ema13 <= 0.001371 )
									ret := 0.687332
								if( ema13 > 0.001371 )
									ret := 0.929825 // buy
							if( ema3 > 0.47657 )
								if( ema2 <= 0.482817 )
									ret := 0.057143
								if( ema2 > 0.482817 )
									ret := 0.709677 // buy
		if( d_k > 0.000624 )
			if( ema3 <= 0.359914 )
				if( k <= 51.0559 )
					if( ema12 <= 0.000619 )
						if( ema13 <= -0.000142 )
							if( ema2 <= 0.318902 )
								if( d <= 11.8877 )
									ret := -0.384615
								if( d > 11.8877 )
									ret := 0.718519 // buy
							if( ema2 > 0.318902 )
								if( rsi1 <= 78.6149 )
									ret := 0.293135
								if( rsi1 > 78.6149 )
									ret := -0.434783
						if( ema13 > -0.000142 )
							if( k <= 28.4562 )
								if( rsi1 <= 62.6897 )
									ret := 0.219646
								if( rsi1 > 62.6897 )
									ret := 0.431616
							if( k > 28.4562 )
								if( rsi1 <= 69.7855 )
									ret := 0.023525
								if( rsi1 > 69.7855 )
									ret := 0.401747
					if( ema12 > 0.000619 )
						if( smoothD_d <= 36.2813 )
							if( ema3 <= 0.357451 )
								if( k <= 11.4468 )
									ret := 0.814070 // buy
								if( k > 11.4468 )
									ret := 0.600000
							if( ema3 > 0.357451 )
								if( ema13 <= 0.002013 )
									ret := -0.250000
								if( ema13 > 0.002013 )
									ret := 0.600000
						if( smoothD_d > 36.2813 )
							if( rsi1 <= 69.5891 )
								if( d_k <= 28.9678 )
									ret := -0.300000
								if( d_k > 28.9678 )
									ret := 1.000000 // buy
							if( rsi1 > 69.5891 )
								ret := 1.000000 // buy
				if( k > 51.0559 )
					if( smoothD_d <= 94.6013 )
						if( ema12 <= -0.000259 )
							if( smoothD_d <= 90.8512 )
								if( rsi1 <= 56.4568 )
									ret := 0.037120
								if( rsi1 > 56.4568 )
									ret := 0.269286
							if( smoothD_d > 90.8512 )
								if( ema1 <= 0.342782 )
									ret := -0.235880
								if( ema1 > 0.342782 )
									ret := 0.169065
						if( ema12 > -0.000259 )
							if( rsi1 <= 73.1736 )
								if( ema1 <= 0.345478 )
									ret := -0.119895
								if( ema1 > 0.345478 )
									ret := -0.022543
							if( rsi1 > 73.1736 )
								if( k <= 76.5427 )
									ret := 0.253086
								if( k > 76.5427 )
									ret := -0.002280
					if( smoothD_d > 94.6013 )
						if( ema3 <= 0.345305 )
							if( ema13 <= 0.000968 )
								if( ema13 <= -0.001399 )
									ret := -0.796875 // sell
								if( ema13 > -0.001399 )
									ret := -0.336000
							if( ema13 > 0.000968 )
								if( ema2 <= 0.337901 )
									ret := 0.950000 // buy
								if( ema2 > 0.337901 )
									ret := 0.000000
						if( ema3 > 0.345305 )
							if( rsi1 <= 73.1323 )
								if( k <= 98.4251 )
									ret := -0.147059
								if( k > 98.4251 )
									ret := -0.480000
							if( rsi1 > 73.1323 )
								if( tema <= 0.355067 )
									ret := 0.106996
								if( tema > 0.355067 )
									ret := 0.434783
			if( ema3 > 0.359914 )
				if( tema <= 0.447792 )
					if( rsi1 <= 68.9809 )
						if( d_k <= 10.884 )
							if( smoothK_k <= 24.4014 )
								if( smoothK_k <= 2.7537 )
									ret := 0.429574
								if( smoothK_k > 2.7537 )
									ret := 0.303912
							if( smoothK_k > 24.4014 )
								if( ema12 <= 0.000155 )
									ret := 0.227486
								if( ema12 > 0.000155 )
									ret := -0.069967
						if( d_k > 10.884 )
							if( ema12 <= 2.4e-05 )
								if( ema3 <= 0.403104 )
									ret := 0.477660
								if( ema3 > 0.403104 )
									ret := 0.639938
							if( ema12 > 2.4e-05 )
								if( smoothK_k <= 19.7495 )
									ret := 0.380068
								if( smoothK_k > 19.7495 )
									ret := 0.235062
					if( rsi1 > 68.9809 )
						if( smoothK_k <= 88.6501 )
							if( d_k <= 5.01219 )
								if( rsi1 <= 70.0204 )
									ret := 0.197581
								if( rsi1 > 70.0204 )
									ret := 0.547089
							if( d_k > 5.01219 )
								if( ema3 <= 0.438946 )
									ret := 0.664006
								if( ema3 > 0.438946 )
									ret := 0.421739
						if( smoothK_k > 88.6501 )
							if( ema2 <= 0.409325 )
								if( rsi1 <= 81.4969 )
									ret := 0.266763
								if( rsi1 > 81.4969 )
									ret := 0.538020
							if( ema2 > 0.409325 )
								if( rsi1 <= 75.6467 )
									ret := 0.486239
								if( rsi1 > 75.6467 )
									ret := 0.678824
				if( tema > 0.447792 )
					if( rsi1 <= 61.1204 )
						if( ema12 <= 0.000162 )
							if( ema12 <= -8e-05 )
								if( rsi1 <= 48.0244 )
									ret := 0.073930
								if( rsi1 > 48.0244 )
									ret := 0.435597
							if( ema12 > -8e-05 )
								if( rsi1 <= 52.5885 )
									ret := -0.096049
								if( rsi1 > 52.5885 )
									ret := 0.090317
						if( ema12 > 0.000162 )
							if( ema12 <= 0.000293 )
								if( rsi1 <= 52.9056 )
									ret := -0.362398
								if( rsi1 > 52.9056 )
									ret := -0.066038
							if( ema12 > 0.000293 )
								if( d <= 0.474651 )
									ret := 1.000000 // buy
								if( d > 0.474651 )
									ret := -0.435414
					if( rsi1 > 61.1204 )
						if( ema12 <= 0.000185 )
							if( ema12 <= -6.4e-05 )
								if( tema <= 0.470628 )
									ret := 0.894737 // buy
								if( tema > 0.470628 )
									ret := 0.250000
							if( ema12 > -6.4e-05 )
								if( rsi1 <= 70.0097 )
									ret := 0.266355
								if( rsi1 > 70.0097 )
									ret := 0.539735
						if( ema12 > 0.000185 )
							if( rsi1 <= 76.4265 )
								if( ema12 <= 0.000525 )
									ret := 0.136499
								if( ema12 > 0.000525 )
									ret := -0.161736
							if( rsi1 > 76.4265 )
								if( ema1 <= 0.481861 )
									ret := 0.361371
								if( ema1 > 0.481861 )
									ret := 0.090090
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_ADAUSDT_1Min_0149e762(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


