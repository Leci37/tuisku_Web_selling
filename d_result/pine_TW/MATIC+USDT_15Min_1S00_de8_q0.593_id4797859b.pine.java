//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: MATICUSDT_15Min_1S00_4797859b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1S00_4797859b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_4797859b(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 33.3667 )
		if( k <= 13.0437 )
			if( d <= 2.44208 )
				if( k <= 4.36631 )
					if( d <= 1.32119 )
						if( rsi1 <= 26.3575 )
							if( k <= 2.28408 )
								if( rsi1 <= 12.3156 )
									ret := -0.369085
								if( rsi1 > 12.3156 )
									ret := -0.612385
							if( k > 2.28408 )
								if( d <= 1.2895 )
									ret := -0.846154 // sell
								if( d > 1.2895 )
									ret := -1.000000 // sell
						if( rsi1 > 26.3575 )
							if( rsi1 <= 26.7101 )
								if( smoothD_d <= -2.32407 )
									ret := 0.370370
								if( smoothD_d > -2.32407 )
									ret := -0.285714
							if( rsi1 > 26.7101 )
								if( d_k <= 0.021778 )
									ret := -0.411765
								if( d_k > 0.021778 )
									ret := -0.259508
					if( d > 1.32119 )
						if( smoothD_d <= -0.710037 )
							if( rsi1 <= 10.5422 )
								if( rsi1 <= 6.45506 )
									ret := -0.948718 // sell
								if( rsi1 > 6.45506 )
									ret := -0.594203
							if( rsi1 > 10.5422 )
								if( k <= 1.01278 )
									ret := -0.075848
								if( k > 1.01278 )
									ret := -0.365563
						if( smoothD_d > -0.710037 )
							if( rsi1 <= 23.2528 )
								if( rsi1 <= 17.9639 )
									ret := -0.692308
								if( rsi1 > 17.9639 )
									ret := -0.043478
							if( rsi1 > 23.2528 )
								if( rsi1 <= 43.6732 )
									ret := -0.744186 // sell
								if( rsi1 > 43.6732 )
									ret := -0.342857
				if( k > 4.36631 )
					if( smoothK_k <= 2.60455 )
						if( k <= 4.73824 )
							if( smoothK_k <= 1.55441 )
								if( smoothK_k <= 1.43634 )
									ret := -0.642857
								if( smoothK_k > 1.43634 )
									ret := -0.933333 // sell
							if( smoothK_k > 1.55441 )
								if( k <= 4.63832 )
									ret := -0.125000
								if( k > 4.63832 )
									ret := -0.666667
						if( k > 4.73824 )
							if( smoothD_d <= -0.770486 )
								if( k <= 5.32231 )
									ret := -0.889655 // sell
								if( k > 5.32231 )
									ret := -0.744186 // sell
							if( smoothD_d > -0.770486 )
								if( k <= 5.05928 )
									ret := -0.500000
								if( k > 5.05928 )
									ret := -0.739130 // sell
					if( smoothK_k > 2.60455 )
						if( smoothK_k <= 3.06072 )
							if( smoothD_d <= -1.05658 )
								ret := -0.550000
							if( smoothD_d > -1.05658 )
								if( d_k <= -3.63922 )
									ret := 0.384615
								if( d_k > -3.63922 )
									ret := -0.454545
						if( smoothK_k > 3.06072 )
							if( smoothD_d <= -0.855688 )
								if( rsi1 <= 20.688 )
									ret := -0.800000 // sell
								if( rsi1 > 20.688 )
									ret := -0.111111
							if( smoothD_d > -0.855688 )
								if( smoothD_d <= -0.653009 )
									ret := -0.766667 // sell
								if( smoothD_d > -0.653009 )
									ret := -0.363636
			if( d > 2.44208 )
				if( smoothK_k <= -2.58462 )
					if( rsi1 <= 16.5465 )
						if( smoothD_d <= -0.011759 )
							ret := 0.000000
						if( smoothD_d > -0.011759 )
							if( k <= 0.003564 )
								if( d <= 12.2521 )
									ret := -0.808333 // sell
								if( d > 12.2521 )
									ret := -0.392857
							if( k > 0.003564 )
								if( smoothK_k <= -2.7353 )
									ret := -1.000000 // sell
								if( smoothK_k > -2.7353 )
									ret := -0.733333 // sell
					if( rsi1 > 16.5465 )
						if( d <= 12.3688 )
							if( d_k <= 3.31436 )
								if( d <= 2.52517 )
									ret := 0.062500
								if( d > 2.52517 )
									ret := -0.618705
							if( d_k > 3.31436 )
								if( d_k <= 3.37206 )
									ret := 0.230769
								if( d_k > 3.37206 )
									ret := -0.389535
						if( d > 12.3688 )
							if( smoothD_d <= 11.5108 )
								if( d <= 14.0807 )
									ret := -0.173913
								if( d > 14.0807 )
									ret := 0.466667
							if( smoothD_d > 11.5108 )
								if( rsi1 <= 21.6661 )
									ret := 0.209302
								if( rsi1 > 21.6661 )
									ret := -0.355634
				if( smoothK_k > -2.58462 )
					if( d_k <= -4.515 )
						if( d <= 6.45764 )
							if( d_k <= -4.74971 )
								if( d_k <= -4.91037 )
									ret := -0.519512
								if( d_k > -4.91037 )
									ret := -0.092105
							if( d_k > -4.74971 )
								if( rsi1 <= 24.9437 )
									ret := -0.931034 // sell
								if( rsi1 > 24.9437 )
									ret := -0.682353
						if( d > 6.45764 )
							if( smoothD_d <= 4.85863 )
								if( d <= 6.87352 )
									ret := -0.375000
								if( d > 6.87352 )
									ret := -0.103093
							if( smoothD_d > 4.85863 )
								if( d_k <= -4.67958 )
									ret := -0.937500 // sell
								if( d_k > -4.67958 )
									ret := -0.454545
					if( d_k > -4.515 )
						if( d_k <= 18.8336 )
							if( d_k <= 3.23425 )
								if( k <= 11.0342 )
									ret := -0.320188
								if( k > 11.0342 )
									ret := -0.211499
							if( d_k > 3.23425 )
								if( smoothK_k <= 8.38606 )
									ret := -0.224570
								if( smoothK_k > 8.38606 )
									ret := -0.388081
						if( d_k > 18.8336 )
							if( d <= 32.9097 )
								if( smoothK_k <= 1.81656 )
									ret := -0.457219
								if( smoothK_k > 1.81656 )
									ret := -0.634820
							if( d > 32.9097 )
								if( smoothD_d <= 34.9406 )
									ret := -0.045662
								if( smoothD_d > 34.9406 )
									ret := -0.647619
		if( k > 13.0437 )
			if( d <= 13.8588 )
				if( d_k <= -0.998345 )
					if( rsi1 <= 43.2624 )
						if( d_k <= -8.74549 )
							if( smoothK_k <= 24.1828 )
								if( d_k <= -13.0542 )
									ret := -0.152542
								if( d_k > -13.0542 )
									ret := -0.554675
							if( smoothK_k > 24.1828 )
								if( rsi1 <= 40.3281 )
									ret := -0.911765 // sell
								if( rsi1 > 40.3281 )
									ret := -0.555556
						if( d_k > -8.74549 )
							if( smoothK_k <= 16.3424 )
								if( k <= 15.8075 )
									ret := -0.292063
								if( k > 15.8075 )
									ret := -0.432815
							if( smoothK_k > 16.3424 )
								if( smoothD_d <= 10.2894 )
									ret := 0.184000
								if( smoothD_d > 10.2894 )
									ret := -0.540541
					if( rsi1 > 43.2624 )
						if( smoothK_k <= 19.0651 )
							if( k <= 18.5547 )
								if( d <= 8.23728 )
									ret := 0.122449
								if( d > 8.23728 )
									ret := -0.287736
							if( k > 18.5547 )
								if( smoothD_d <= 10.4749 )
									ret := 0.058282
								if( smoothD_d > 10.4749 )
									ret := 0.800000 // buy
						if( smoothK_k > 19.0651 )
							if( rsi1 <= 46.3422 )
								if( smoothD_d <= 10.3908 )
									ret := 0.196429
								if( smoothD_d > 10.3908 )
									ret := -0.652174
							if( rsi1 > 46.3422 )
								if( d_k <= -13.1055 )
									ret := -0.180952
								if( d_k > -13.1055 )
									ret := -0.487437
				if( d_k > -0.998345 )
					if( d_k <= 0.104581 )
						if( d <= 12.8371 )
							ret := 0.636364
						if( d > 12.8371 )
							if( smoothK_k <= 10.478 )
								ret := -0.238095
							if( smoothK_k > 10.478 )
								if( rsi1 <= 42.7768 )
									ret := -0.055556
								if( rsi1 > 42.7768 )
									ret := 0.500000
					if( d_k > 0.104581 )
						if( smoothK_k <= 10.3099 )
							ret := 0.333333
						if( smoothK_k > 10.3099 )
							ret := 0.846154 // buy
			if( d > 13.8588 )
				if( smoothD_d <= 25.2915 )
					if( k <= 21.2318 )
						if( k <= 16.2043 )
							if( smoothD_d <= 24.6968 )
								if( k <= 13.8125 )
									ret := -0.295522
								if( k > 13.8125 )
									ret := 0.027290
							if( smoothD_d > 24.6968 )
								if( d <= 28.0963 )
									ret := 0.772727 // buy
								if( d > 28.0963 )
									ret := 0.454545
						if( k > 16.2043 )
							if( rsi1 <= 53.3399 )
								if( rsi1 <= 43.8282 )
									ret := -0.158328
								if( rsi1 > 43.8282 )
									ret := -0.384354
							if( rsi1 > 53.3399 )
								if( rsi1 <= 56.8963 )
									ret := 0.198718
								if( rsi1 > 56.8963 )
									ret := -0.150442
					if( k > 21.2318 )
						if( d_k <= -4.59326 )
							if( rsi1 <= 48.4256 )
								if( k <= 21.3216 )
									ret := 0.909091 // buy
								if( k > 21.3216 )
									ret := -0.196889
							if( rsi1 > 48.4256 )
								if( d <= 22.6711 )
									ret := 0.077487
								if( d > 22.6711 )
									ret := 0.312336
						if( d_k > -4.59326 )
							if( smoothK_k <= 21.576 )
								if( smoothD_d <= 16.5405 )
									ret := 0.333333
								if( smoothD_d > 16.5405 )
									ret := 0.094340
							if( smoothK_k > 21.576 )
								if( smoothK_k <= 24.7195 )
									ret := -0.233397
								if( smoothK_k > 24.7195 )
									ret := 0.144165
				if( smoothD_d > 25.2915 )
					if( d <= 39.597 )
						if( rsi1 <= 49.9946 )
							if( smoothD_d <= 27.7423 )
								if( k <= 13.2514 )
									ret := 0.388889
								if( k > 13.2514 )
									ret := -0.197975
							if( smoothD_d > 27.7423 )
								if( smoothK_k <= 15.092 )
									ret := -0.582524
								if( smoothK_k > 15.092 )
									ret := -0.296418
						if( rsi1 > 49.9946 )
							if( smoothK_k <= 11.6206 )
								if( smoothD_d <= 34.3507 )
									ret := 0.483871
								if( smoothD_d > 34.3507 )
									ret := -0.066667
							if( smoothK_k > 11.6206 )
								if( smoothK_k <= 15.3548 )
									ret := -0.286822
								if( smoothK_k > 15.3548 )
									ret := -0.063604
					if( d > 39.597 )
						if( d <= 41.2926 )
							if( rsi1 <= 49.1804 )
								if( smoothD_d <= 38.0112 )
									ret := -0.185714
								if( smoothD_d > 38.0112 )
									ret := 0.322581
							if( rsi1 > 49.1804 )
								if( d_k <= 7.80739 )
									ret := 0.711538 // buy
								if( d_k > 7.80739 )
									ret := 0.220096
						if( d > 41.2926 )
							if( k <= 27.9538 )
								if( smoothD_d <= 50.4599 )
									ret := -0.293019
								if( smoothD_d > 50.4599 )
									ret := 0.067227
							if( k > 27.9538 )
								if( smoothD_d <= 42.9423 )
									ret := -0.008333
								if( smoothD_d > 42.9423 )
									ret := -0.220770
	if( smoothK_k > 33.3667 )
		if( rsi1 <= 62.2647 )
			if( smoothD_d <= 88.1448 )
				if( rsi1 <= 45.4318 )
					if( rsi1 <= 33.7817 )
						if( d_k <= 4.10771 )
							if( d <= 83.5446 )
								if( d_k <= -7.17528 )
									ret := -0.269260
								if( d_k > -7.17528 )
									ret := -0.048138
							if( d > 83.5446 )
								if( rsi1 <= 26.0431 )
									ret := -0.636364
								if( rsi1 > 26.0431 )
									ret := 0.308271
						if( d_k > 4.10771 )
							if( smoothK_k <= 37.7442 )
								if( smoothK_k <= 33.7657 )
									ret := 0.708333 // buy
								if( smoothK_k > 33.7657 )
									ret := -0.044693
							if( smoothK_k > 37.7442 )
								if( smoothD_d <= 68.9089 )
									ret := -0.596195
								if( smoothD_d > 68.9089 )
									ret := -0.253133
					if( rsi1 > 33.7817 )
						if( d_k <= 3.64777 )
							if( smoothK_k <= 48.0609 )
								if( d_k <= -10.741 )
									ret := -0.176471
								if( d_k > -10.741 )
									ret := 0.028731
							if( smoothK_k > 48.0609 )
								if( rsi1 <= 41.7778 )
									ret := 0.034796
								if( rsi1 > 41.7778 )
									ret := 0.125570
						if( d_k > 3.64777 )
							if( k <= 62.6276 )
								if( d <= 50.8211 )
									ret := -0.076667
								if( d > 50.8211 )
									ret := -0.260062
							if( k > 62.6276 )
								if( k <= 63.6656 )
									ret := 0.460000
								if( k > 63.6656 )
									ret := -0.097143
				if( rsi1 > 45.4318 )
					if( smoothK_k <= 83.2861 )
						if( d_k <= -1.30122 )
							if( smoothD_d <= 27.3878 )
								if( d <= 25.7024 )
									ret := 0.055046
								if( d > 25.7024 )
									ret := -0.119461
							if( smoothD_d > 27.3878 )
								if( rsi1 <= 48.9505 )
									ret := 0.073469
								if( rsi1 > 48.9505 )
									ret := 0.216076
						if( d_k > -1.30122 )
							if( smoothD_d <= 82.2965 )
								if( rsi1 <= 52.5741 )
									ret := 0.002152
								if( rsi1 > 52.5741 )
									ret := -0.061018
							if( smoothD_d > 82.2965 )
								if( d_k <= 2.97854 )
									ret := 0.373134
								if( d_k > 2.97854 )
									ret := 0.110690
					if( smoothK_k > 83.2861 )
						if( d_k <= -6.04364 )
							if( d_k <= -24.0325 )
								if( rsi1 <= 47.2624 )
									ret := 0.811321 // buy
								if( rsi1 > 47.2624 )
									ret := 0.428571
							if( d_k > -24.0325 )
								if( smoothK_k <= 86.8072 )
									ret := 0.383821
								if( smoothK_k > 86.8072 )
									ret := 0.276270
						if( d_k > -6.04364 )
							if( rsi1 <= 61.4211 )
								if( d_k <= 0.857119 )
									ret := 0.116016
								if( d_k > 0.857119 )
									ret := -0.236025
							if( rsi1 > 61.4211 )
								if( smoothD_d <= 85.2028 )
									ret := -0.737705 // sell
								if( smoothD_d > 85.2028 )
									ret := -0.031250
			if( smoothD_d > 88.1448 )
				if( rsi1 <= 31.6268 )
					if( rsi1 <= 31.2354 )
						if( d_k <= 3.34746 )
							ret := -0.727273 // sell
						if( d_k > 3.34746 )
							ret := -1.000000 // sell
					if( rsi1 > 31.2354 )
						ret := -0.333333
				if( rsi1 > 31.6268 )
					if( smoothD_d <= 96.9915 )
						if( d_k <= -7.14918 )
							if( d_k <= -7.27483 )
								if( d_k <= -8.30887 )
									ret := -0.391304
								if( d_k > -8.30887 )
									ret := 0.000000
							if( d_k > -7.27483 )
								ret := -0.500000
						if( d_k > -7.14918 )
							if( d <= 99.9028 )
								if( rsi1 <= 46.789 )
									ret := 0.154146
								if( rsi1 > 46.789 )
									ret := 0.308971
							if( d > 99.9028 )
								if( d <= 99.9508 )
									ret := 0.826087 // buy
								if( d > 99.9508 )
									ret := 1.000000 // buy
					if( smoothD_d > 96.9915 )
						if( rsi1 <= 60.9047 )
							if( rsi1 <= 59.0908 )
								if( rsi1 <= 52.1053 )
									ret := 0.361111
								if( rsi1 > 52.1053 )
									ret := -0.166667
							if( rsi1 > 59.0908 )
								if( rsi1 <= 60.3277 )
									ret := 0.642857
								if( rsi1 > 60.3277 )
									ret := 0.125000
						if( rsi1 > 60.9047 )
							ret := -0.736842 // sell
		if( rsi1 > 62.2647 )
			if( k <= 94.4285 )
				if( smoothD_d <= 87.103 )
					if( d <= 40.611 )
						if( smoothK_k <= 60.288 )
							if( smoothK_k <= 59.3959 )
								if( k <= 46.7835 )
									ret := 0.565757
								if( k > 46.7835 )
									ret := 0.392857
							if( smoothK_k > 59.3959 )
								if( d_k <= -24.9658 )
									ret := -0.400000
								if( d_k > -24.9658 )
									ret := 0.090909
						if( smoothK_k > 60.288 )
							if( d <= 38.6726 )
								ret := 0.176471
							if( d > 38.6726 )
								if( smoothK_k <= 62.5713 )
									ret := 1.000000 // buy
								if( smoothK_k > 62.5713 )
									ret := 0.800000 // buy
					if( d > 40.611 )
						if( rsi1 <= 81.5698 )
							if( d_k <= -15.2808 )
								if( smoothK_k <= 87.9432 )
									ret := 0.474182
								if( smoothK_k > 87.9432 )
									ret := 0.154185
							if( d_k > -15.2808 )
								if( d_k <= 5.86972 )
									ret := 0.168252
								if( d_k > 5.86972 )
									ret := 0.301977
						if( rsi1 > 81.5698 )
							if( d_k <= -1.32109 )
								if( smoothD_d <= 49.9399 )
									ret := -0.352941
								if( smoothD_d > 49.9399 )
									ret := 0.330097
							if( d_k > -1.32109 )
								if( k <= 80.2365 )
									ret := 0.762195 // buy
								if( k > 80.2365 )
									ret := 0.396040
				if( smoothD_d > 87.103 )
					if( rsi1 <= 72.5398 )
						if( rsi1 <= 64.3428 )
							if( k <= 89.6244 )
								if( d_k <= 2.91459 )
									ret := -0.800000 // sell
								if( d_k > 2.91459 )
									ret := 0.627778
							if( k > 89.6244 )
								if( d <= 94.9505 )
									ret := -0.145349
								if( d > 94.9505 )
									ret := 0.154472
						if( rsi1 > 64.3428 )
							if( k <= 82.4992 )
								if( smoothK_k <= 78.7386 )
									ret := 0.551724
								if( smoothK_k > 78.7386 )
									ret := 0.960000 // buy
							if( k > 82.4992 )
								if( k <= 85.2375 )
									ret := -0.043103
								if( k > 85.2375 )
									ret := 0.398369
					if( rsi1 > 72.5398 )
						if( smoothD_d <= 87.8175 )
							if( smoothD_d <= 87.7017 )
								if( d <= 90.4013 )
									ret := 0.826667 // buy
								if( d > 90.4013 )
									ret := 0.632911
							if( smoothD_d > 87.7017 )
								ret := 1.000000 // buy
						if( smoothD_d > 87.8175 )
							if( smoothK_k <= 86.1372 )
								if( d_k <= 4.0394 )
									ret := -0.203704
								if( d_k > 4.0394 )
									ret := 0.453488
							if( smoothK_k > 86.1372 )
								if( rsi1 <= 73.9166 )
									ret := 0.734300 // buy
								if( rsi1 > 73.9166 )
									ret := 0.483755
			if( k > 94.4285 )
				if( smoothD_d <= 95.6032 )
					if( d <= 78.5998 )
						if( rsi1 <= 64.1444 )
							ret := 0.000000
						if( rsi1 > 64.1444 )
							if( smoothD_d <= 64.6461 )
								ret := 1.000000 // buy
							if( smoothD_d > 64.6461 )
								if( d <= 69.6069 )
									ret := 0.000000
								if( d > 69.6069 )
									ret := 0.727679 // buy
					if( d > 78.5998 )
						if( rsi1 <= 75.5867 )
							if( k <= 99.9996 )
								if( rsi1 <= 69.23 )
									ret := 0.421226
								if( rsi1 > 69.23 )
									ret := 0.284060
							if( k > 99.9996 )
								if( d_k <= -6.63419 )
									ret := 0.602273
								if( d_k > -6.63419 )
									ret := 0.441774
						if( rsi1 > 75.5867 )
							if( d <= 95.9565 )
								if( smoothD_d <= 79.4061 )
									ret := 0.000000
								if( smoothD_d > 79.4061 )
									ret := 0.472507
							if( d > 95.9565 )
								if( d_k <= 1.99328 )
									ret := 0.578303
								if( d_k > 1.99328 )
									ret := 0.810427 // buy
				if( smoothD_d > 95.6032 )
					if( smoothK_k <= 93.9279 )
						if( rsi1 <= 68.4742 )
							if( d <= 98.8165 )
								ret := 0.500000
							if( d > 98.8165 )
								ret := 0.800000 // buy
						if( rsi1 > 68.4742 )
							if( smoothK_k <= 93.2393 )
								ret := 0.583333
							if( smoothK_k > 93.2393 )
								if( smoothD_d <= 95.8351 )
									ret := 0.981818 // buy
								if( smoothD_d > 95.8351 )
									ret := 0.795918 // buy
					if( smoothK_k > 93.9279 )
						if( smoothK_k <= 96.8623 )
							if( k <= 99.8543 )
								if( rsi1 <= 81.3617 )
									ret := 0.391254
								if( rsi1 > 81.3617 )
									ret := 0.676393
							if( k > 99.8543 )
								ret := -0.600000
						if( smoothK_k > 96.8623 )
							if( smoothK_k <= 96.9914 )
								if( rsi1 <= 71.8474 )
									ret := 0.564103
								if( rsi1 > 71.8474 )
									ret := 0.894040 // buy
							if( smoothK_k > 96.9914 )
								if( d <= 99.6214 )
									ret := 0.694149
								if( d > 99.6214 )
									ret := 0.513234
	
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
float op_operation = decision_tree_0_MATICUSDT_15Min_4797859b(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


