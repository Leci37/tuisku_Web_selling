//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: TRXUSDT_30Min_2ST0_aab470bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2ST0_aab470bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_aab470bb(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 44.7662 )
		if( tema <= 0.049914 )
			if( ema12 <= -0.000144 )
				if( d <= 0.083454 )
					if( tema <= 0.025722 )
						ret := -0.428571
					if( tema > 0.025722 )
						if( rsi1 <= 22.2906 )
							ret := -1.000000 // sell
						if( rsi1 > 22.2906 )
							ret := -0.666667
				if( d > 0.083454 )
					if( rsi1 <= 12.4832 )
						if( d_k <= -0.158019 )
							if( tema <= 0.025849 )
								ret := -0.500000
							if( tema > 0.025849 )
								if( ema12 <= -0.000659 )
									ret := -0.750000 // sell
								if( ema12 > -0.000659 )
									ret := -1.000000 // sell
						if( d_k > -0.158019 )
							ret := 0.500000
					if( rsi1 > 12.4832 )
						if( d <= 6.10973 )
							if( d_k <= 2.43901 )
								if( smoothD_d <= -2.21462 )
									ret := 0.097561
								if( smoothD_d > -2.21462 )
									ret := 0.635104
							if( d_k > 2.43901 )
								if( ema1 <= 0.031111 )
									ret := 0.628571
								if( ema1 > 0.031111 )
									ret := -0.407407
						if( d > 6.10973 )
							if( ema12 <= -0.000284 )
								if( rsi1 <= 17.032 )
									ret := -0.281250
								if( rsi1 > 17.032 )
									ret := 0.458134
							if( ema12 > -0.000284 )
								if( ema13 <= -0.000726 )
									ret := -1.000000 // sell
								if( ema13 > -0.000726 )
									ret := 0.242981
			if( ema12 > -0.000144 )
				if( ema3 <= 0.033466 )
					if( d <= 4.63776 )
						if( d <= 0.008879 )
							if( rsi1 <= 28.9743 )
								if( ema13 <= -9.4e-05 )
									ret := -1.000000 // sell
								if( ema13 > -9.4e-05 )
									ret := -0.250000
							if( rsi1 > 28.9743 )
								if( ema1 <= 0.026695 )
									ret := 0.600000
								if( ema1 > 0.026695 )
									ret := 0.250000
						if( d > 0.008879 )
							if( ema12 <= -7.1e-05 )
								if( smoothK_k <= 4.80236 )
									ret := 0.659794
								if( smoothK_k > 4.80236 )
									ret := -0.400000
							if( ema12 > -7.1e-05 )
								if( ema3 <= 0.027488 )
									ret := 0.045455
								if( ema3 > 0.027488 )
									ret := 0.541667
					if( d > 4.63776 )
						if( tema <= 0.032959 )
							if( ema13 <= 2.6e-05 )
								if( ema1 <= 0.028706 )
									ret := 0.192612
								if( ema1 > 0.028706 )
									ret := 0.019355
							if( ema13 > 2.6e-05 )
								if( rsi1 <= 39.6666 )
									ret := -0.142857
								if( rsi1 > 39.6666 )
									ret := 0.687500
						if( tema > 0.032959 )
							if( k <= 16.2747 )
								ret := 0.000000
							if( k > 16.2747 )
								ret := 1.000000 // buy
				if( ema3 > 0.033466 )
					if( rsi1 <= 40.2908 )
						if( d <= 2.72502 )
							if( tema <= 0.048303 )
								if( d_k <= 0.234177 )
									ret := 0.000000
								if( d_k > 0.234177 )
									ret := 0.909091 // buy
							if( tema > 0.048303 )
								ret := -1.000000 // sell
						if( d > 2.72502 )
							if( ema12 <= -0.000117 )
								if( smoothK_k <= 5.76142 )
									ret := 0.062500
								if( smoothK_k > 5.76142 )
									ret := -0.406250
							if( ema12 > -0.000117 )
								if( tema <= 0.038023 )
									ret := -0.469388
								if( tema > 0.038023 )
									ret := -0.843478 // sell
					if( rsi1 > 40.2908 )
						if( ema13 <= 0.000159 )
							if( smoothD_d <= 78.6914 )
								if( k <= 64.1009 )
									ret := 0.052326
								if( k > 64.1009 )
									ret := -0.782609 // sell
							if( smoothD_d > 78.6914 )
								if( k <= 82.6897 )
									ret := 0.250000
								if( k > 82.6897 )
									ret := 1.000000 // buy
						if( ema13 > 0.000159 )
							if( k <= 0.254621 )
								ret := 0.250000
							if( k > 0.254621 )
								if( ema3 <= 0.047535 )
									ret := -0.894737 // sell
								if( ema3 > 0.047535 )
									ret := -0.375000
		if( tema > 0.049914 )
			if( d_k <= -3.51342 )
				if( ema12 <= -0.000255 )
					if( rsi1 <= 37.2926 )
						if( rsi1 <= 25.5925 )
							if( ema1 <= 0.08488 )
								if( ema12 <= -0.000609 )
									ret := 0.170347
								if( ema12 > -0.000609 )
									ret := -0.489247
							if( ema1 > 0.08488 )
								if( ema12 <= -0.001558 )
									ret := -0.056604
								if( ema12 > -0.001558 )
									ret := -0.587065
						if( rsi1 > 25.5925 )
							if( ema1 <= 0.088799 )
								if( ema12 <= -0.000595 )
									ret := 0.508746
								if( ema12 > -0.000595 )
									ret := 0.057534
							if( ema1 > 0.088799 )
								if( ema12 <= -0.000921 )
									ret := 0.249275
								if( ema12 > -0.000921 )
									ret := -0.288503
					if( rsi1 > 37.2926 )
						if( tema <= 0.098056 )
							if( ema12 <= -0.000357 )
								if( rsi1 <= 42.3521 )
									ret := 0.702786 // buy
								if( rsi1 > 42.3521 )
									ret := 0.906667 // buy
							if( ema12 > -0.000357 )
								if( ema13 <= -0.000514 )
									ret := 0.314721
								if( ema13 > -0.000514 )
									ret := 0.673913
						if( tema > 0.098056 )
							if( ema12 <= -0.001033 )
								if( smoothD_d <= 76.2291 )
									ret := 0.818841 // buy
								if( smoothD_d > 76.2291 )
									ret := -0.733333 // sell
							if( ema12 > -0.001033 )
								if( ema3 <= 0.113595 )
									ret := 0.241379
								if( ema3 > 0.113595 )
									ret := -0.162338
				if( ema12 > -0.000255 )
					if( ema12 <= -9.9e-05 )
						if( tema <= 0.072301 )
							if( ema13 <= -0.000452 )
								if( k <= 36.698 )
									ret := -0.909091 // sell
								if( k > 36.698 )
									ret := -0.213115
							if( ema13 > -0.000452 )
								if( rsi1 <= 40.5268 )
									ret := -0.049485
								if( rsi1 > 40.5268 )
									ret := 0.339683
						if( tema > 0.072301 )
							if( rsi1 <= 30.9575 )
								if( tema <= 0.121972 )
									ret := -0.596154
								if( tema > 0.121972 )
									ret := -0.206349
							if( rsi1 > 30.9575 )
								if( d <= 5.72908 )
									ret := -0.487179
								if( d > 5.72908 )
									ret := -0.072391
					if( ema12 > -9.9e-05 )
						if( ema13 <= 6.5e-05 )
							if( rsi1 <= 40.909 )
								if( rsi1 <= 36.3475 )
									ret := -0.534653
								if( rsi1 > 36.3475 )
									ret := -0.335740
							if( rsi1 > 40.909 )
								if( ema12 <= -4e-05 )
									ret := -0.052632
								if( ema12 > -4e-05 )
									ret := -0.292683
						if( ema13 > 6.5e-05 )
							if( ema12 <= 5.5e-05 )
								if( k <= 12.2241 )
									ret := -0.594203
								if( k > 12.2241 )
									ret := -0.265306
							if( ema12 > 5.5e-05 )
								if( rsi1 <= 31.182 )
									ret := -1.000000 // sell
								if( rsi1 > 31.182 )
									ret := -0.700000 // sell
			if( d_k > -3.51342 )
				if( rsi1 <= 31.4989 )
					if( k <= 3.06 )
						if( tema <= 0.12049 )
							if( rsi1 <= 24.6348 )
								if( k <= 0.579542 )
									ret := -0.880270 // sell
								if( k > 0.579542 )
									ret := -0.777299 // sell
							if( rsi1 > 24.6348 )
								if( ema13 <= -0.000684 )
									ret := -0.422414
								if( ema13 > -0.000684 )
									ret := -0.699179
						if( tema > 0.12049 )
							if( ema12 <= -0.000361 )
								if( d_k <= 3.26214 )
									ret := -0.664286
								if( d_k > 3.26214 )
									ret := -0.921053 // sell
							if( ema12 > -0.000361 )
								if( rsi1 <= 24.7941 )
									ret := -0.522167
								if( rsi1 > 24.7941 )
									ret := -0.255319
					if( k > 3.06 )
						if( d_k <= 5.47274 )
							if( rsi1 <= 24.7019 )
								if( k <= 6.95395 )
									ret := -0.666214
								if( k > 6.95395 )
									ret := -0.515964
							if( rsi1 > 24.7019 )
								if( tema <= 0.066078 )
									ret := -0.190965
								if( tema > 0.066078 )
									ret := -0.464255
						if( d_k > 5.47274 )
							if( ema2 <= 0.109727 )
								if( smoothK_k <= 77.4463 )
									ret := -0.779230 // sell
								if( smoothK_k > 77.4463 )
									ret := 0.250000
							if( ema2 > 0.109727 )
								if( ema13 <= -0.00124 )
									ret := -0.946667 // sell
								if( ema13 > -0.00124 )
									ret := -0.289593
				if( rsi1 > 31.4989 )
					if( ema12 <= -0.000134 )
						if( rsi1 <= 40.1514 )
							if( d_k <= 2.08796 )
								if( ema13 <= -0.000545 )
									ret := 0.083587
								if( ema13 > -0.000545 )
									ret := -0.132956
							if( d_k > 2.08796 )
								if( ema13 <= -0.000333 )
									ret := -0.406040
								if( ema13 > -0.000333 )
									ret := -0.162162
						if( rsi1 > 40.1514 )
							if( d_k <= 1.51597 )
								if( smoothK_k <= 96.321 )
									ret := 0.517241
								if( smoothK_k > 96.321 )
									ret := -0.291667
							if( d_k > 1.51597 )
								if( smoothK_k <= 37.5182 )
									ret := 0.328358
								if( smoothK_k > 37.5182 )
									ret := -0.099071
					if( ema12 > -0.000134 )
						if( ema12 <= 5.5e-05 )
							if( ema13 <= -0.000285 )
								if( d_k <= 3.29336 )
									ret := -0.596491
								if( d_k > 3.29336 )
									ret := -0.851282 // sell
							if( ema13 > -0.000285 )
								if( rsi1 <= 38.8587 )
									ret := -0.444733
								if( rsi1 > 38.8587 )
									ret := -0.237672
						if( ema12 > 5.5e-05 )
							if( tema <= 0.113451 )
								if( ema12 <= 0.000125 )
									ret := -0.661417
								if( ema12 > 0.000125 )
									ret := -0.811337 // sell
							if( tema > 0.113451 )
								if( ema13 <= 0.000553 )
									ret := -0.188235
								if( ema13 > 0.000553 )
									ret := -0.608696
	if( rsi1 > 44.7662 )
		if( d_k <= 4.16486 )
			if( ema3 <= 0.03585 )
				if( ema12 <= 0.000258 )
					if( d <= 15.1541 )
						if( ema1 <= 0.033056 )
							if( tema <= 0.027527 )
								if( ema12 <= 8e-05 )
									ret := 0.000000
								if( ema12 > 8e-05 )
									ret := 0.666667
							if( tema > 0.027527 )
								if( d <= 6.58979 )
									ret := 0.230769
								if( d > 6.58979 )
									ret := 0.571429
						if( ema1 > 0.033056 )
							if( k <= 12.9278 )
								if( rsi1 <= 46.0466 )
									ret := 0.600000
								if( rsi1 > 46.0466 )
									ret := -0.515152
							if( k > 12.9278 )
								if( rsi1 <= 49.9948 )
									ret := -0.444444
								if( rsi1 > 49.9948 )
									ret := 0.692308
					if( d > 15.1541 )
						if( ema1 <= 0.033867 )
							if( smoothD_d <= 16.6079 )
								if( smoothK_k <= 13.8962 )
									ret := 0.285714
								if( smoothK_k > 13.8962 )
									ret := -0.530864
							if( smoothD_d > 16.6079 )
								if( d_k <= 2.55281 )
									ret := -0.037359
								if( d_k > 2.55281 )
									ret := 0.196507
						if( ema1 > 0.033867 )
							if( k <= 94.8976 )
								if( ema2 <= 0.03575 )
									ret := 0.445714
								if( ema2 > 0.03575 )
									ret := -0.400000
							if( k > 94.8976 )
								if( smoothD_d <= 95.998 )
									ret := -0.322581
								if( smoothD_d > 95.998 )
									ret := 1.000000 // buy
				if( ema12 > 0.000258 )
					if( ema13 <= 0.000534 )
						if( d_k <= -0.767444 )
							if( smoothD_d <= 91.2743 )
								if( smoothK_k <= 91.5306 )
									ret := -0.423729
								if( smoothK_k > 91.5306 )
									ret := 0.272727
							if( smoothD_d > 91.2743 )
								if( ema3 <= 0.031535 )
									ret := -1.000000 // sell
								if( ema3 > 0.031535 )
									ret := -0.166667
						if( d_k > -0.767444 )
							if( k <= 97.1154 )
								if( smoothK_k <= 89.6146 )
									ret := -0.285714
								if( smoothK_k > 89.6146 )
									ret := 0.842105 // buy
							if( k > 97.1154 )
								if( k <= 97.5835 )
									ret := -1.000000 // sell
								if( k > 97.5835 )
									ret := -0.125000
					if( ema13 > 0.000534 )
						if( k <= 72.3593 )
							if( d <= 36.822 )
								if( ema12 <= 0.000303 )
									ret := 0.166667
								if( ema12 > 0.000303 )
									ret := -0.723404 // sell
							if( d > 36.822 )
								if( smoothK_k <= 65.8825 )
									ret := 0.043478
								if( smoothK_k > 65.8825 )
									ret := 0.923077 // buy
						if( k > 72.3593 )
							if( smoothD_d <= 94.3889 )
								if( smoothD_d <= 80.5673 )
									ret := -0.800000 // sell
								if( smoothD_d > 80.5673 )
									ret := -0.304878
							if( smoothD_d > 94.3889 )
								if( ema13 <= 0.000574 )
									ret := -0.636364
								if( ema13 > 0.000574 )
									ret := -0.960784 // sell
			if( ema3 > 0.03585 )
				if( smoothK_k <= 17.3591 )
					if( ema13 <= -3.5e-05 )
						if( ema13 <= -0.000175 )
							if( d_k <= -10.4329 )
								ret := -0.500000
							if( d_k > -10.4329 )
								if( ema2 <= 0.093068 )
									ret := 0.961039 // buy
								if( ema2 > 0.093068 )
									ret := 0.580645
						if( ema13 > -0.000175 )
							if( ema12 <= -8.6e-05 )
								if( smoothD_d <= 10.2064 )
									ret := 0.662921
								if( smoothD_d > 10.2064 )
									ret := 0.000000
							if( ema12 > -8.6e-05 )
								if( rsi1 <= 46.693 )
									ret := -0.222222
								if( rsi1 > 46.693 )
									ret := 0.185185
					if( ema13 > -3.5e-05 )
						if( rsi1 <= 52.6348 )
							if( ema12 <= 1.4e-05 )
								if( ema12 <= -9e-05 )
									ret := 0.779661 // buy
								if( ema12 > -9e-05 )
									ret := 0.240356
							if( ema12 > 1.4e-05 )
								if( ema12 <= 0.000142 )
									ret := -0.126866
								if( ema12 > 0.000142 )
									ret := -0.494169
						if( rsi1 > 52.6348 )
							if( d <= 2.55234 )
								if( ema13 <= 0.001145 )
									ret := -0.031646
								if( ema13 > 0.001145 )
									ret := -0.578313
							if( d > 2.55234 )
								if( ema3 <= 0.061169 )
									ret := 0.540323
								if( ema3 > 0.061169 )
									ret := 0.240964
				if( smoothK_k > 17.3591 )
					if( d_k <= 0.406908 )
						if( rsi1 <= 66.9287 )
							if( ema12 <= -0.000117 )
								if( tema <= 0.101549 )
									ret := 0.737910 // buy
								if( tema > 0.101549 )
									ret := 0.387042
							if( ema12 > -0.000117 )
								if( rsi1 <= 54.547 )
									ret := 0.081972
								if( rsi1 > 54.547 )
									ret := 0.374950
						if( rsi1 > 66.9287 )
							if( ema3 <= 0.111143 )
								if( rsi1 <= 79.7181 )
									ret := 0.617849
								if( rsi1 > 79.7181 )
									ret := 0.763731 // buy
							if( ema3 > 0.111143 )
								if( ema12 <= 0.000444 )
									ret := 0.276475
								if( ema12 > 0.000444 )
									ret := 0.710448 // buy
					if( d_k > 0.406908 )
						if( rsi1 <= 60.4455 )
							if( ema13 <= -0.000836 )
								if( smoothD_d <= 95.4083 )
									ret := 0.346405
								if( smoothD_d > 95.4083 )
									ret := 0.958333 // buy
							if( ema13 > -0.000836 )
								if( ema13 <= 0.00022 )
									ret := 0.103618
								if( ema13 > 0.00022 )
									ret := -0.161572
						if( rsi1 > 60.4455 )
							if( rsi1 <= 73.2293 )
								if( ema2 <= 0.055816 )
									ret := 0.139535
								if( ema2 > 0.055816 )
									ret := 0.297809
							if( rsi1 > 73.2293 )
								if( smoothD_d <= 91.0733 )
									ret := 0.326700
								if( smoothD_d > 91.0733 )
									ret := 0.568586
		if( d_k > 4.16486 )
			if( ema12 <= 0.00027 )
				if( rsi1 <= 60.0293 )
					if( ema12 <= 7.1e-05 )
						if( rsi1 <= 48.6565 )
							if( ema12 <= -0.00024 )
								if( ema3 <= 0.056035 )
									ret := -0.666667
								if( ema3 > 0.056035 )
									ret := 0.473684
							if( ema12 > -0.00024 )
								if( k <= 67.9421 )
									ret := -0.035454
								if( k > 67.9421 )
									ret := -0.297872
						if( rsi1 > 48.6565 )
							if( ema12 <= -4.9e-05 )
								if( ema12 <= -0.000354 )
									ret := 0.770833 // buy
								if( ema12 > -0.000354 )
									ret := 0.327869
							if( ema12 > -4.9e-05 )
								if( ema13 <= -0.000319 )
									ret := -0.823529 // sell
								if( ema13 > -0.000319 )
									ret := 0.087652
					if( ema12 > 7.1e-05 )
						if( rsi1 <= 52.0348 )
							if( tema <= 0.102691 )
								if( ema3 <= 0.031162 )
									ret := 0.625000
								if( ema3 > 0.031162 )
									ret := -0.511876
							if( tema > 0.102691 )
								if( ema12 <= 0.00018 )
									ret := 0.031250
								if( ema12 > 0.00018 )
									ret := -0.303030
						if( rsi1 > 52.0348 )
							if( smoothD_d <= 56.4279 )
								if( ema2 <= 0.051933 )
									ret := 0.324873
								if( ema2 > 0.051933 )
									ret := -0.051111
							if( smoothD_d > 56.4279 )
								if( ema12 <= 0.000165 )
									ret := -0.140728
								if( ema12 > 0.000165 )
									ret := -0.387978
				if( rsi1 > 60.0293 )
					if( ema2 <= 0.034937 )
						if( k <= 58.1675 )
							if( rsi1 <= 72.3004 )
								if( d_k <= 17.68 )
									ret := 0.173913
								if( d_k > 17.68 )
									ret := -0.285714
							if( rsi1 > 72.3004 )
								if( d_k <= 10.9935 )
									ret := 0.250000
								if( d_k > 10.9935 )
									ret := 1.000000 // buy
						if( k > 58.1675 )
							if( d <= 82.3975 )
								if( ema12 <= 0.000264 )
									ret := -0.525641
								if( ema12 > 0.000264 )
									ret := 0.750000 // buy
							if( d > 82.3975 )
								if( d_k <= 10.9954 )
									ret := -0.205357
								if( d_k > 10.9954 )
									ret := 0.333333
					if( ema2 > 0.034937 )
						if( ema13 <= -2.5e-05 )
							if( ema12 <= 0.000124 )
								if( d <= 95.5724 )
									ret := 0.624309
								if( d > 95.5724 )
									ret := 0.078947
							if( ema12 > 0.000124 )
								if( ema13 <= -0.000121 )
									ret := -0.750000 // sell
								if( ema13 > -0.000121 )
									ret := -1.000000 // sell
						if( ema13 > -2.5e-05 )
							if( ema12 <= 1.7e-05 )
								if( d_k <= 5.15953 )
									ret := 0.166667
								if( d_k > 5.15953 )
									ret := 0.833333 // buy
							if( ema12 > 1.7e-05 )
								if( d_k <= 7.61758 )
									ret := 0.290616
								if( d_k > 7.61758 )
									ret := 0.161111
			if( ema12 > 0.00027 )
				if( rsi1 <= 62.4486 )
					if( rsi1 <= 55.8707 )
						if( d <= 6.67089 )
							if( ema12 <= 0.000375 )
								ret := -0.200000
							if( ema12 > 0.000375 )
								if( k <= 0.264427 )
									ret := 0.000000
								if( k > 0.264427 )
									ret := 0.875000 // buy
						if( d > 6.67089 )
							if( rsi1 <= 52.0888 )
								if( ema1 <= 0.154618 )
									ret := -0.819462 // sell
								if( ema1 > 0.154618 )
									ret := -0.125000
							if( rsi1 > 52.0888 )
								if( k <= 5.47271 )
									ret := -0.194805
								if( k > 5.47271 )
									ret := -0.673504
					if( rsi1 > 55.8707 )
						if( d <= 57.6342 )
							if( d_k <= 16.5469 )
								if( ema1 <= 0.067238 )
									ret := -0.306569
								if( ema1 > 0.067238 )
									ret := 0.039578
							if( d_k > 16.5469 )
								if( ema3 <= 0.111716 )
									ret := -0.618834
								if( ema3 > 0.111716 )
									ret := -0.140351
						if( d > 57.6342 )
							if( smoothD_d <= 81.2364 )
								if( ema12 <= 0.000394 )
									ret := -0.505263
								if( ema12 > 0.000394 )
									ret := -0.785000 // sell
							if( smoothD_d > 81.2364 )
								if( ema1 <= 0.099962 )
									ret := -0.585034
								if( ema1 > 0.099962 )
									ret := 0.121212
				if( rsi1 > 62.4486 )
					if( ema12 <= 0.000399 )
						if( ema1 <= 0.066628 )
							if( d <= 44.437 )
								if( ema1 <= 0.043336 )
									ret := -0.181818
								if( ema1 > 0.043336 )
									ret := 0.489362
							if( d > 44.437 )
								if( d_k <= 19.7324 )
									ret := -0.032028
								if( d_k > 19.7324 )
									ret := -0.625000
						if( ema1 > 0.066628 )
							if( smoothD_d <= 88.1814 )
								if( ema1 <= 0.103048 )
									ret := 0.305882
								if( ema1 > 0.103048 )
									ret := 0.134783
							if( smoothD_d > 88.1814 )
								if( d <= 94.7115 )
									ret := 0.585714
								if( d > 94.7115 )
									ret := 0.857143 // buy
					if( ema12 > 0.000399 )
						if( ema3 <= 0.101122 )
							if( d_k <= 13.2501 )
								if( ema3 <= 0.052757 )
									ret := -0.520958
								if( ema3 > 0.052757 )
									ret := -0.069519
							if( d_k > 13.2501 )
								if( tema <= 0.053443 )
									ret := 0.152542
								if( tema > 0.053443 )
									ret := -0.514477
						if( ema3 > 0.101122 )
							if( ema12 <= 0.002453 )
								if( smoothD_d <= 90.4467 )
									ret := 0.165272
								if( smoothD_d > 90.4467 )
									ret := 0.745763 // buy
							if( ema12 > 0.002453 )
								if( ema3 <= 0.124396 )
									ret := -0.204545
								if( ema3 > 0.124396 )
									ret := -0.857143 // sell
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_aab470bb(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


