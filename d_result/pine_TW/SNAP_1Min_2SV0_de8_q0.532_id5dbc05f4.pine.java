//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: SNAP_1Min_2SV0_5dbc05f4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2SV0_5dbc05f4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_5dbc05f4(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 56.7778 )
		if( VIM <= 1.42213 )
			if( d_k <= 0.022902 )
				if( k <= 48.0384 )
					if( k <= 21.4935 )
						if( smoothK_k <= 3.02363 )
							if( smoothK_k <= 0.740311 )
								if( smoothK_k <= -0.247608 )
									ret := -0.059647
								if( smoothK_k > -0.247608 )
									ret := 0.315186
							if( smoothK_k > 0.740311 )
								if( VIM <= 1.00277 )
									ret := 0.446154
								if( VIM > 1.00277 )
									ret := -0.325287
						if( smoothK_k > 3.02363 )
							if( rsi1 <= 12.3344 )
								if( smoothK_k <= 9.39331 )
									ret := 0.771429 // buy
								if( smoothK_k > 9.39331 )
									ret := -0.071429
							if( rsi1 > 12.3344 )
								if( VIP_VIM <= -0.196482 )
									ret := -0.016104
								if( VIP_VIM > -0.196482 )
									ret := 0.077287
					if( k > 21.4935 )
						if( smoothD_d <= 39.0817 )
							if( VIP <= 0.571023 )
								ret := 1.000000 // buy
							if( VIP > 0.571023 )
								if( smoothD_d <= 13.2729 )
									ret := -0.241866
								if( smoothD_d > 13.2729 )
									ret := -0.079656
						if( smoothD_d > 39.0817 )
							if( rsi1 <= 51.2836 )
								if( VIP_VIM <= -0.061597 )
									ret := 0.220126
								if( VIP_VIM > -0.061597 )
									ret := 0.769231 // buy
							if( rsi1 > 51.2836 )
								if( VIP_VIM <= 0.085156 )
									ret := -0.827586 // sell
								if( VIP_VIM > 0.085156 )
									ret := 0.466667
				if( k > 48.0384 )
					if( k <= 99.0109 )
						if( VIP_VIM <= 0.041651 )
							if( k <= 98.0624 )
								if( smoothD_d <= 91.5871 )
									ret := 0.023658
								if( smoothD_d > 91.5871 )
									ret := -0.473214
							if( k > 98.0624 )
								if( VIP <= 0.951183 )
									ret := 0.637500
								if( VIP > 0.951183 )
									ret := 0.111111
						if( VIP_VIM > 0.041651 )
							if( d <= 34.7433 )
								if( d <= 29.1074 )
									ret := 0.272727
								if( d > 29.1074 )
									ret := 0.833333 // buy
							if( d > 34.7433 )
								if( VIP <= 1.17227 )
									ret := 0.182640
								if( VIP > 1.17227 )
									ret := -0.108696
					if( k > 99.0109 )
						if( d_k <= -2.77968 )
							if( d <= 92.3085 )
								if( smoothD_d <= 79.9176 )
									ret := 0.033333
								if( smoothD_d > 79.9176 )
									ret := -0.342657
							if( d > 92.3085 )
								if( smoothK_k <= 96.9975 )
									ret := 0.582278
								if( smoothK_k > 96.9975 )
									ret := 0.215278
						if( d_k > -2.77968 )
							if( rsi1 <= 55.6252 )
								if( smoothK_k <= 96.8194 )
									ret := -0.673469
								if( smoothK_k > 96.8194 )
									ret := -0.141844
							if( rsi1 > 55.6252 )
								if( rsi1 <= 56.3053 )
									ret := -1.000000 // sell
								if( rsi1 > 56.3053 )
									ret := -0.636364
			if( d_k > 0.022902 )
				if( VIP <= 0.988139 )
					if( rsi1 <= 38.2342 )
						if( smoothK_k <= 4.05456 )
							if( smoothD_d <= 3.27873 )
								if( d_k <= 0.368376 )
									ret := 0.345588
								if( d_k > 0.368376 )
									ret := 0.037556
							if( smoothD_d > 3.27873 )
								if( k <= 0.024332 )
									ret := 0.178470
								if( k > 0.024332 )
									ret := -0.162562
						if( smoothK_k > 4.05456 )
							if( k <= 97.5791 )
								if( VIP_VIM <= -0.772045 )
									ret := -0.580645
								if( VIP_VIM > -0.772045 )
									ret := 0.123871
							if( k > 97.5791 )
								ret := -1.000000 // sell
					if( rsi1 > 38.2342 )
						if( k <= 18.8682 )
							if( smoothK_k <= 12.8526 )
								if( rsi1 <= 43.5976 )
									ret := -0.068471
								if( rsi1 > 43.5976 )
									ret := 0.113793
							if( smoothK_k > 12.8526 )
								if( smoothD_d <= 17.4638 )
									ret := 0.684783
								if( smoothD_d > 17.4638 )
									ret := 0.150602
						if( k > 18.8682 )
							if( VIP <= 0.909895 )
								if( k <= 87.6082 )
									ret := -0.229885
								if( k > 87.6082 )
									ret := 0.321429
							if( VIP > 0.909895 )
								if( VIM <= 0.928324 )
									ret := 0.652174
								if( VIM > 0.928324 )
									ret := -0.046284
				if( VIP > 0.988139 )
					if( smoothK_k <= -2.93288 )
						if( smoothD_d <= -0.501728 )
							if( rsi1 <= 45.2725 )
								if( rsi1 <= 42.0296 )
									ret := 0.840000 // buy
								if( rsi1 > 42.0296 )
									ret := -0.375000
							if( rsi1 > 45.2725 )
								if( d_k <= 1.91709 )
									ret := 0.851064 // buy
								if( d_k > 1.91709 )
									ret := 1.000000 // buy
						if( smoothD_d > -0.501728 )
							if( VIM <= 0.898047 )
								ret := -0.600000
							if( VIM > 0.898047 )
								if( VIP <= 1.03554 )
									ret := 0.218182
								if( VIP > 1.03554 )
									ret := 0.509804
					if( smoothK_k > -2.93288 )
						if( smoothK_k <= 26.8098 )
							if( rsi1 <= 30.7809 )
								if( k <= 15.0611 )
									ret := 0.916667 // buy
								if( k > 15.0611 )
									ret := 0.111111
							if( rsi1 > 30.7809 )
								if( VIP_VIM <= -0.129892 )
									ret := 0.180392
								if( VIP_VIM > -0.129892 )
									ret := -0.028179
						if( smoothK_k > 26.8098 )
							if( rsi1 <= 49.9887 )
								if( smoothD_d <= 42.627 )
									ret := 0.541063
								if( smoothD_d > 42.627 )
									ret := 0.253749
							if( rsi1 > 49.9887 )
								if( d_k <= 0.357345 )
									ret := -0.250000
								if( d_k > 0.357345 )
									ret := 0.083754
		if( VIM > 1.42213 )
			if( rsi1 <= 44.8105 )
				if( d_k <= -2.37982 )
					if( smoothK_k <= 2.02526 )
						ret := -0.894737 // sell
					if( smoothK_k > 2.02526 )
						if( VIM <= 3.67157 )
							if( d <= 17.4727 )
								if( d <= 3.91318 )
									ret := 0.652174
								if( d > 3.91318 )
									ret := 0.009174
							if( d > 17.4727 )
								if( d <= 18.6823 )
									ret := 0.977778 // buy
								if( d > 18.6823 )
									ret := 0.281490
						if( VIM > 3.67157 )
							if( rsi1 <= 30.1595 )
								if( smoothD_d <= 18.5613 )
									ret := 0.606061
								if( smoothD_d > 18.5613 )
									ret := -0.125000
							if( rsi1 > 30.1595 )
								if( VIP_VIM <= -0.431232 )
									ret := -0.247899
								if( VIP_VIM > -0.431232 )
									ret := 0.161290
				if( d_k > -2.37982 )
					if( VIP <= 0.562286 )
						if( smoothD_d <= -2.39148 )
							if( k <= 0.001 )
								if( VIP_VIM <= -1.12757 )
									ret := 0.833333 // buy
								if( VIP_VIM > -1.12757 )
									ret := -0.250000
							if( k > 0.001 )
								if( d_k <= -0.118316 )
									ret := 0.666667
								if( d_k > -0.118316 )
									ret := 1.000000 // buy
						if( smoothD_d > -2.39148 )
							if( VIP_VIM <= -0.889706 )
								if( smoothD_d <= 30.2932 )
									ret := 0.016393
								if( smoothD_d > 30.2932 )
									ret := -0.687500
							if( VIP_VIM > -0.889706 )
								ret := -1.000000 // sell
					if( VIP > 0.562286 )
						if( k <= 95.8961 )
							if( smoothK_k <= 23.2321 )
								if( rsi1 <= 22.5467 )
									ret := 0.461409
								if( rsi1 > 22.5467 )
									ret := 0.266694
							if( smoothK_k > 23.2321 )
								if( rsi1 <= 42.2491 )
									ret := 0.324013
								if( rsi1 > 42.2491 )
									ret := 0.556439
						if( k > 95.8961 )
							ret := -0.888889 // sell
			if( rsi1 > 44.8105 )
				if( VIP_VIM <= -0.273722 )
					if( d_k <= 2.45062 )
						if( VIP <= 1.54701 )
							if( d_k <= -10.2623 )
								if( VIP <= 1.31946 )
									ret := -0.611940
								if( VIP > 1.31946 )
									ret := 0.107143
							if( d_k > -10.2623 )
								if( VIP_VIM <= -0.403096 )
									ret := 0.483607
								if( VIP_VIM > -0.403096 )
									ret := 0.030612
						if( VIP > 1.54701 )
							if( k <= 72.4774 )
								if( k <= 57.9004 )
									ret := -0.248819
								if( k > 57.9004 )
									ret := -0.511364
							if( k > 72.4774 )
								if( smoothD_d <= 50.9074 )
									ret := 0.906250 // buy
								if( smoothD_d > 50.9074 )
									ret := -0.151751
					if( d_k > 2.45062 )
						if( smoothK_k <= 63.8437 )
							if( smoothK_k <= 48.7702 )
								if( d <= 58.4095 )
									ret := 0.130841
								if( d > 58.4095 )
									ret := 0.562500
							if( smoothK_k > 48.7702 )
								if( VIP <= 3.03338 )
									ret := -0.508475
								if( VIP > 3.03338 )
									ret := 0.076923
						if( smoothK_k > 63.8437 )
							if( smoothD_d <= 81.1944 )
								if( d <= 82.4172 )
									ret := 0.594595
								if( d > 82.4172 )
									ret := 1.000000 // buy
							if( smoothD_d > 81.1944 )
								if( VIM <= 5.64957 )
									ret := 0.344262
								if( VIM > 5.64957 )
									ret := -0.250000
				if( VIP_VIM > -0.273722 )
					if( smoothK_k <= 53.6018 )
						if( d_k <= -9.15342 )
							if( VIP <= 2.2753 )
								if( VIP <= 2.13399 )
									ret := -0.131387
								if( VIP > 2.13399 )
									ret := 0.730769 // buy
							if( VIP > 2.2753 )
								if( rsi1 <= 54.179 )
									ret := -0.379679
								if( rsi1 > 54.179 )
									ret := -0.700000 // sell
						if( d_k > -9.15342 )
							if( VIP <= 8.67637 )
								if( rsi1 <= 52.633 )
									ret := 0.193029
								if( rsi1 > 52.633 )
									ret := -0.034375
							if( VIP > 8.67637 )
								if( d_k <= -1.23618 )
									ret := -0.466019
								if( d_k > -1.23618 )
									ret := -0.158672
					if( smoothK_k > 53.6018 )
						if( d_k <= -13.189 )
							if( VIP <= 3.92467 )
								if( smoothD_d <= 44.1644 )
									ret := -0.666667
								if( smoothD_d > 44.1644 )
									ret := -0.132075
							if( VIP > 3.92467 )
								if( VIM <= 9.265 )
									ret := 0.173333
								if( VIM > 9.265 )
									ret := -0.111111
						if( d_k > -13.189 )
							if( d <= 74.7072 )
								if( smoothK_k <= 71.2151 )
									ret := 0.366718
								if( smoothK_k > 71.2151 )
									ret := 0.084211
							if( d > 74.7072 )
								if( d <= 98.1293 )
									ret := 0.080906
								if( d > 98.1293 )
									ret := -0.500000
	if( rsi1 > 56.7778 )
		if( VIP <= 1.34511 )
			if( VIM <= 1.00552 )
				if( VIM <= 0.767558 )
					if( d_k <= -10.9933 )
						if( d <= 37.5884 )
							if( d_k <= -20.7814 )
								if( VIP <= 1.19359 )
									ret := -1.000000 // sell
								if( VIP > 1.19359 )
									ret := -0.625000
							if( d_k > -20.7814 )
								if( d_k <= -13.3979 )
									ret := -0.090909
								if( d_k > -13.3979 )
									ret := 0.375000
						if( d > 37.5884 )
							if( VIM <= 0.688817 )
								if( smoothK_k <= 87.3925 )
									ret := 0.840580 // buy
								if( smoothK_k > 87.3925 )
									ret := 0.025000
							if( VIM > 0.688817 )
								if( VIP <= 1.15729 )
									ret := 0.681818
								if( VIP > 1.15729 )
									ret := 0.171806
					if( d_k > -10.9933 )
						if( rsi1 <= 88.3898 )
							if( d_k <= 29.5107 )
								if( d <= 98.4496 )
									ret := 0.001427
								if( d > 98.4496 )
									ret := 0.134199
							if( d_k > 29.5107 )
								ret := -0.947368 // sell
						if( rsi1 > 88.3898 )
							if( smoothK_k <= 94.486 )
								if( smoothK_k <= 91.0144 )
									ret := -0.725000 // sell
								if( smoothK_k > 91.0144 )
									ret := 0.516667
							if( smoothK_k > 94.486 )
								if( smoothD_d <= 95.3735 )
									ret := -0.796875 // sell
								if( smoothD_d > 95.3735 )
									ret := -0.178571
				if( VIM > 0.767558 )
					if( k <= 75.6241 )
						if( k <= 71.0777 )
							if( d <= 70.8241 )
								if( d_k <= 30.5614 )
									ret := -0.032329
								if( d_k > 30.5614 )
									ret := -0.844444 // sell
							if( d > 70.8241 )
								if( VIP_VIM <= 0.267002 )
									ret := -0.454874
								if( VIP_VIM > 0.267002 )
									ret := -0.211429
						if( k > 71.0777 )
							if( k <= 72.7418 )
								if( rsi1 <= 60.0955 )
									ret := -0.081967
								if( rsi1 > 60.0955 )
									ret := 0.420408
							if( k > 72.7418 )
								if( d <= 76.1688 )
									ret := -0.094276
								if( d > 76.1688 )
									ret := 0.136187
					if( k > 75.6241 )
						if( smoothD_d <= 82.8961 )
							if( d_k <= -4.11932 )
								if( smoothK_k <= 83.2248 )
									ret := 0.003606
								if( smoothK_k > 83.2248 )
									ret := -0.167702
							if( d_k > -4.11932 )
								if( smoothK_k <= 73.0427 )
									ret := 0.189189
								if( smoothK_k > 73.0427 )
									ret := -0.407317
						if( smoothD_d > 82.8961 )
							if( VIP <= 1.26144 )
								if( k <= 77.1906 )
									ret := -0.666667
								if( k > 77.1906 )
									ret := -0.044736
							if( VIP > 1.26144 )
								if( VIP_VIM <= 0.535409 )
									ret := -0.406897
								if( VIP_VIM > 0.535409 )
									ret := 0.227273
			if( VIM > 1.00552 )
				if( smoothK_k <= 10.7399 )
					ret := 0.722222 // buy
				if( smoothK_k > 10.7399 )
					if( VIP_VIM <= 0.285181 )
						if( rsi1 <= 59.0285 )
							if( VIP_VIM <= 0.003615 )
								if( VIP_VIM <= -0.268099 )
									ret := -0.793103 // sell
								if( VIP_VIM > -0.268099 )
									ret := -0.333333
							if( VIP_VIM > 0.003615 )
								if( d <= 96.7975 )
									ret := 0.061538
								if( d > 96.7975 )
									ret := -0.733333 // sell
						if( rsi1 > 59.0285 )
							if( VIP_VIM <= 0.199169 )
								if( d_k <= -6.76615 )
									ret := -0.387755
								if( d_k > -6.76615 )
									ret := -0.641129
							if( VIP_VIM > 0.199169 )
								if( d <= 58.3187 )
									ret := -0.791667 // sell
								if( d > 58.3187 )
									ret := -0.016949
					if( VIP_VIM > 0.285181 )
						ret := 0.545455
		if( VIP > 1.34511 )
			if( smoothD_d <= 63.4814 )
				if( smoothK_k <= 58.526 )
					if( rsi1 <= 58.9687 )
						if( VIM <= 1.61689 )
							if( VIP_VIM <= 0.889636 )
								if( d <= 19.308 )
									ret := -0.843137 // sell
								if( d > 19.308 )
									ret := -0.353448
							if( VIP_VIM > 0.889636 )
								ret := 0.600000
						if( VIM > 1.61689 )
							if( d_k <= 9.90566 )
								if( smoothK_k <= 56.565 )
									ret := -0.150407
								if( smoothK_k > 56.565 )
									ret := 0.416667
							if( d_k > 9.90566 )
								if( rsi1 <= 57.4665 )
									ret := 0.166667
								if( rsi1 > 57.4665 )
									ret := 0.789474 // buy
					if( rsi1 > 58.9687 )
						if( d_k <= -19.4334 )
							if( VIM <= 2.85595 )
								if( VIP <= 1.472 )
									ret := -0.615385
								if( VIP > 1.472 )
									ret := -0.950000 // sell
							if( VIM > 2.85595 )
								ret := -0.315789
						if( d_k > -19.4334 )
							if( d_k <= -8.445 )
								if( VIM <= 12.014 )
									ret := 0.020492
								if( VIM > 12.014 )
									ret := -0.923077 // sell
							if( d_k > -8.445 )
								if( smoothK_k <= 0.443701 )
									ret := 0.666667
								if( smoothK_k > 0.443701 )
									ret := -0.472222
				if( smoothK_k > 58.526 )
					if( smoothD_d <= 47.9697 )
						if( VIP_VIM <= 0.53297 )
							if( smoothK_k <= 60.0376 )
								if( k <= 62.2861 )
									ret := 0.000000
								if( k > 62.2861 )
									ret := 1.000000 // buy
							if( smoothK_k > 60.0376 )
								if( k <= 67.447 )
									ret := -0.647059
								if( k > 67.447 )
									ret := 0.111111
						if( VIP_VIM > 0.53297 )
							if( rsi1 <= 72.8141 )
								if( VIM <= 2.28333 )
									ret := 0.722772 // buy
								if( VIM > 2.28333 )
									ret := -0.095238
							if( rsi1 > 72.8141 )
								ret := -0.800000 // sell
					if( smoothD_d > 47.9697 )
						if( VIM <= 0.788304 )
							if( d <= 58.6655 )
								ret := 0.842105 // buy
							if( d > 58.6655 )
								ret := 0.076923
						if( VIM > 0.788304 )
							if( smoothD_d <= 49.327 )
								if( VIM <= 2.19446 )
									ret := -0.909091 // sell
								if( VIM > 2.19446 )
									ret := -0.681818
							if( smoothD_d > 49.327 )
								if( VIM <= 1.82513 )
									ret := -0.069869
								if( VIM > 1.82513 )
									ret := -0.448980
			if( smoothD_d > 63.4814 )
				if( smoothK_k <= 96.6389 )
					if( VIP <= 318.379 )
						if( d_k <= -19.5812 )
							if( rsi1 <= 68.494 )
								if( smoothK_k <= 94.2336 )
									ret := -0.583333
								if( smoothK_k > 94.2336 )
									ret := 0.941176 // buy
							if( rsi1 > 68.494 )
								if( d <= 69.7629 )
									ret := 1.000000 // buy
								if( d > 69.7629 )
									ret := 0.666667
						if( d_k > -19.5812 )
							if( k <= 84.3636 )
								if( k <= 80.3598 )
									ret := -0.079243
								if( k > 80.3598 )
									ret := 0.130120
							if( k > 84.3636 )
								if( VIM <= 0.561224 )
									ret := 0.340000
								if( VIM > 0.561224 )
									ret := -0.176535
					if( VIP > 318.379 )
						if( d <= 92.8421 )
							if( d_k <= 1.6356 )
								if( d <= 81.4172 )
									ret := -0.818182 // sell
								if( d > 81.4172 )
									ret := -1.000000 // sell
							if( d_k > 1.6356 )
								ret := -0.428571
						if( d > 92.8421 )
							ret := 0.100000
				if( smoothK_k > 96.6389 )
					if( VIP_VIM <= 0.113154 )
						if( VIP <= 5.30654 )
							if( rsi1 <= 60.0746 )
								ret := 0.823529 // buy
							if( rsi1 > 60.0746 )
								if( VIM <= 2.7399 )
									ret := -0.133333
								if( VIM > 2.7399 )
									ret := 0.500000
						if( VIP > 5.30654 )
							ret := -0.368421
					if( VIP_VIM > 0.113154 )
						if( VIP <= 1.42613 )
							if( VIM <= 0.603875 )
								if( VIP_VIM <= 0.787751 )
									ret := -0.500000
								if( VIP_VIM > 0.787751 )
									ret := 0.076923
							if( VIM > 0.603875 )
								if( k <= 99.7931 )
									ret := -0.863636 // sell
								if( k > 99.7931 )
									ret := -0.316129
						if( VIP > 1.42613 )
							if( VIM <= 1.08546 )
								if( d <= 99.798 )
									ret := -0.625000
								if( d > 99.798 )
									ret := -0.868687 // sell
							if( VIM > 1.08546 )
								if( d <= 97.4191 )
									ret := -0.142857
								if( d > 97.4191 )
									ret := -0.661538
	
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_SNAP_1Min_5dbc05f4(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


