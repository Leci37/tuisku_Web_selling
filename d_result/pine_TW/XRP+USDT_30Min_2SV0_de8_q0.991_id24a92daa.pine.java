//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: XRPUSDT_30Min_2SV0_24a92daa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2SV0_24a92daa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_24a92daa(smoothK_k, d_k, k, smoothD_d, rsi1, d, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 26.8654 )
		if( rsi1 <= 33.148 )
			if( d_k <= -1.1549 )
				if( VIP <= 0.834652 )
					if( VIP_VIM <= -0.518179 )
						if( d_k <= -7.13502 )
							if( VIP <= 0.711554 )
								if( d <= 11.2873 )
									ret := 0.342857
								if( d > 11.2873 )
									ret := 0.752381 // buy
							if( VIP > 0.711554 )
								if( VIP <= 0.743387 )
									ret := -0.944444 // sell
								if( VIP > 0.743387 )
									ret := 0.125000
						if( d_k > -7.13502 )
							if( k <= 11.3316 )
								if( d_k <= -5.12927 )
									ret := -0.785714 // sell
								if( d_k > -5.12927 )
									ret := -0.200000
							if( k > 11.3316 )
								if( k <= 20.037 )
									ret := 0.255319
								if( k > 20.037 )
									ret := -0.151515
					if( VIP_VIM > -0.518179 )
						if( rsi1 <= 29.4719 )
							if( VIP_VIM <= -0.474265 )
								if( rsi1 <= 20.1367 )
									ret := -0.549020
								if( rsi1 > 20.1367 )
									ret := -0.248366
							if( VIP_VIM > -0.474265 )
								if( rsi1 <= 20.9456 )
									ret := -0.859259 // sell
								if( rsi1 > 20.9456 )
									ret := -0.535390
						if( rsi1 > 29.4719 )
							if( d_k <= -5.02962 )
								if( rsi1 <= 31.6889 )
									ret := -0.465278
								if( rsi1 > 31.6889 )
									ret := 0.024691
							if( d_k > -5.02962 )
								if( smoothD_d <= 15.0651 )
									ret := 0.399209
								if( smoothD_d > 15.0651 )
									ret := -0.209302
				if( VIP > 0.834652 )
					if( rsi1 <= 28.6405 )
						if( rsi1 <= 22.9533 )
							if( d <= 2.37506 )
								if( d <= 1.49165 )
									ret := -0.857143 // sell
								if( d > 1.49165 )
									ret := -1.000000 // sell
							if( d > 2.37506 )
								if( d_k <= -3.10569 )
									ret := -0.923077 // sell
								if( d_k > -3.10569 )
									ret := -0.735849 // sell
						if( rsi1 > 22.9533 )
							if( VIM <= 1.22988 )
								if( k <= 7.52483 )
									ret := -0.660494
								if( k > 7.52483 )
									ret := -0.835294 // sell
							if( VIM > 1.22988 )
								ret := 0.000000
					if( rsi1 > 28.6405 )
						if( VIM <= 1.1212 )
							if( smoothD_d <= 13.9537 )
								if( smoothD_d <= 3.45257 )
									ret := -0.772201 // sell
								if( smoothD_d > 3.45257 )
									ret := -0.637795
							if( smoothD_d > 13.9537 )
								if( k <= 26.1382 )
									ret := 0.000000
								if( k > 26.1382 )
									ret := -0.631579
						if( VIM > 1.1212 )
							if( k <= 3.69455 )
								ret := 0.750000 // buy
							if( k > 3.69455 )
								if( k <= 23.4064 )
									ret := -0.263415
								if( k > 23.4064 )
									ret := -0.727273 // sell
			if( d_k > -1.1549 )
				if( k <= 7.00921 )
					if( VIM <= 1.14722 )
						if( rsi1 <= 23.2652 )
							if( d_k <= 2.45214 )
								if( rsi1 <= 18.8649 )
									ret := -0.936675 // sell
								if( rsi1 > 18.8649 )
									ret := -0.756098 // sell
							if( d_k > 2.45214 )
								if( smoothK_k <= -2.99994 )
									ret := -0.865455 // sell
								if( smoothK_k > -2.99994 )
									ret := -0.942808 // sell
						if( rsi1 > 23.2652 )
							if( VIP <= 0.904675 )
								if( VIP_VIM <= -0.280295 )
									ret := -0.302013
								if( VIP_VIM > -0.280295 )
									ret := -0.614865
							if( VIP > 0.904675 )
								if( smoothD_d <= 11.1233 )
									ret := -0.738983 // sell
								if( smoothD_d > 11.1233 )
									ret := -0.870712 // sell
					if( VIM > 1.14722 )
						if( rsi1 <= 23.8507 )
							if( d <= 18.4782 )
								if( rsi1 <= 19.2779 )
									ret := -0.741130 // sell
								if( rsi1 > 19.2779 )
									ret := -0.501188
							if( d > 18.4782 )
								ret := 0.583333
						if( rsi1 > 23.8507 )
							if( smoothK_k <= -0.850148 )
								if( VIP_VIM <= -0.303625 )
									ret := 0.227941
								if( VIP_VIM > -0.303625 )
									ret := -0.500000
							if( smoothK_k > -0.850148 )
								if( k <= 3.01525 )
									ret := -0.688525
								if( k > 3.01525 )
									ret := -0.343023
				if( k > 7.00921 )
					if( VIP <= 0.660538 )
						if( VIM <= 1.34722 )
							if( VIP <= 0.64809 )
								if( k <= 14.1382 )
									ret := 0.942857 // buy
								if( k > 14.1382 )
									ret := 0.558824
							if( VIP > 0.64809 )
								ret := 0.052632
						if( VIM > 1.34722 )
							ret := -0.416667
					if( VIP > 0.660538 )
						if( d_k <= 7.70163 )
							if( VIP <= 0.870022 )
								if( smoothK_k <= 23.6339 )
									ret := -0.494403
								if( smoothK_k > 23.6339 )
									ret := -0.157895
							if( VIP > 0.870022 )
								if( VIM <= 1.16472 )
									ret := -0.688073
								if( VIM > 1.16472 )
									ret := -0.279070
						if( d_k > 7.70163 )
							if( VIP_VIM <= -0.404468 )
								if( d_k <= 16.7541 )
									ret := -0.521127
								if( d_k > 16.7541 )
									ret := 0.250000
							if( VIP_VIM > -0.404468 )
								if( VIM <= 0.888939 )
									ret := 0.045455
								if( VIM > 0.888939 )
									ret := -0.754400 // sell
		if( rsi1 > 33.148 )
			if( VIP_VIM <= -0.215473 )
				if( k <= 15.6047 )
					if( rsi1 <= 43.3355 )
						if( rsi1 <= 38.1548 )
							if( VIP_VIM <= -0.302281 )
								if( k <= 13.0013 )
									ret := 0.458194
								if( k > 13.0013 )
									ret := -0.118421
							if( VIP_VIM > -0.302281 )
								if( k <= 7.56568 )
									ret := 0.074866
								if( k > 7.56568 )
									ret := -0.251799
						if( rsi1 > 38.1548 )
							if( VIP_VIM <= -0.306103 )
								if( d_k <= -4.70317 )
									ret := 0.873016 // buy
								if( d_k > -4.70317 )
									ret := 0.452381
							if( VIP_VIM > -0.306103 )
								if( VIP <= 0.875135 )
									ret := -0.024390
								if( VIP > 0.875135 )
									ret := 0.401575
					if( rsi1 > 43.3355 )
						if( d_k <= -6.41901 )
							ret := -1.000000 // sell
						if( d_k > -6.41901 )
							ret := -0.600000
				if( k > 15.6047 )
					if( d <= 16.0119 )
						if( VIP_VIM <= -0.427291 )
							if( VIP_VIM <= -0.516079 )
								if( k <= 24.9837 )
									ret := 1.000000 // buy
								if( k > 24.9837 )
									ret := 0.800000 // buy
							if( VIP_VIM > -0.516079 )
								if( rsi1 <= 34.8147 )
									ret := 0.880000 // buy
								if( rsi1 > 34.8147 )
									ret := 0.474576
						if( VIP_VIM > -0.427291 )
							if( rsi1 <= 42.2616 )
								if( VIP_VIM <= -0.285041 )
									ret := 0.461059
								if( VIP_VIM > -0.285041 )
									ret := 0.033520
							if( rsi1 > 42.2616 )
								if( smoothK_k <= 19.9009 )
									ret := 0.777778 // buy
								if( smoothK_k > 19.9009 )
									ret := 0.483333
					if( d > 16.0119 )
						if( smoothD_d <= 13.3699 )
							if( rsi1 <= 37.9362 )
								ret := -0.680000
							if( rsi1 > 37.9362 )
								ret := 0.125000
						if( smoothD_d > 13.3699 )
							if( VIM <= 1.09203 )
								if( d <= 22.6644 )
									ret := 0.892857 // buy
								if( d > 22.6644 )
									ret := 0.314286
							if( VIM > 1.09203 )
								if( k <= 27.752 )
									ret := 0.184701
								if( k > 27.752 )
									ret := 0.497297
			if( VIP_VIM > -0.215473 )
				if( k <= 9.52333 )
					if( VIP <= 0.963559 )
						if( rsi1 <= 36.4302 )
							if( smoothK_k <= -2.45573 )
								if( d_k <= 3.93547 )
									ret := -0.595745
								if( d_k > 3.93547 )
									ret := 0.529412
							if( smoothK_k > -2.45573 )
								if( VIP <= 0.882741 )
									ret := 0.142857
								if( VIP > 0.882741 )
									ret := -0.584450
						if( rsi1 > 36.4302 )
							if( smoothK_k <= 5.15104 )
								if( smoothD_d <= 1.31303 )
									ret := -0.062016
								if( smoothD_d > 1.31303 )
									ret := 0.189504
							if( smoothK_k > 5.15104 )
								if( smoothD_d <= 8.5743 )
									ret := -0.651163
								if( smoothD_d > 8.5743 )
									ret := 0.056604
					if( VIP > 0.963559 )
						if( rsi1 <= 43.7452 )
							if( smoothK_k <= -0.270467 )
								if( VIM <= 0.83372 )
									ret := -0.866995 // sell
								if( VIM > 0.83372 )
									ret := -0.627324
							if( smoothK_k > -0.270467 )
								if( d_k <= 8.62204 )
									ret := -0.468293
								if( d_k > 8.62204 )
									ret := -0.637895
						if( rsi1 > 43.7452 )
							if( VIM <= 0.854745 )
								if( rsi1 <= 60.0446 )
									ret := -0.536197
								if( rsi1 > 60.0446 )
									ret := -0.059553
							if( VIM > 0.854745 )
								if( VIP_VIM <= -0.006276 )
									ret := 0.197183
								if( VIP_VIM > -0.006276 )
									ret := -0.170455
				if( k > 9.52333 )
					if( VIP <= 1.0562 )
						if( d <= 26.6805 )
							if( rsi1 <= 40.3628 )
								if( VIM <= 1.03445 )
									ret := -0.568966
								if( VIM > 1.03445 )
									ret := -0.343750
							if( rsi1 > 40.3628 )
								if( rsi1 <= 54.2984 )
									ret := 0.085087
								if( rsi1 > 54.2984 )
									ret := 0.589796
						if( d > 26.6805 )
							if( k <= 28.1446 )
								if( d <= 51.2813 )
									ret := -0.334819
								if( d > 51.2813 )
									ret := 0.380952
							if( k > 28.1446 )
								if( VIP_VIM <= 0.110326 )
									ret := -0.013841
								if( VIP_VIM > 0.110326 )
									ret := -0.777778 // sell
					if( VIP > 1.0562 )
						if( d_k <= 11.8572 )
							if( VIM <= 0.866143 )
								if( d <= 36.6788 )
									ret := -0.015829
								if( d > 36.6788 )
									ret := -0.636364
							if( VIM > 0.866143 )
								if( rsi1 <= 60.1059 )
									ret := -0.310182
								if( rsi1 > 60.1059 )
									ret := 0.433180
						if( d_k > 11.8572 )
							if( k <= 25.9869 )
								if( d_k <= 19.8631 )
									ret := -0.392523
								if( d_k > 19.8631 )
									ret := -0.618661
							if( k > 25.9869 )
								if( d <= 43.9323 )
									ret := 0.064516
								if( d > 43.9323 )
									ret := -0.396907
	if( smoothK_k > 26.8654 )
		if( d_k <= 5.20395 )
			if( smoothD_d <= 90.7751 )
				if( VIP <= 0.786488 )
					if( rsi1 <= 34.0597 )
						if( VIP_VIM <= -0.678586 )
							if( d_k <= -8.73832 )
								if( VIP <= 0.560588 )
									ret := 1.000000 // buy
								if( VIP > 0.560588 )
									ret := 0.597122
							if( d_k > -8.73832 )
								if( VIM <= 1.24412 )
									ret := 1.000000 // buy
								if( VIM > 1.24412 )
									ret := -0.050000
						if( VIP_VIM > -0.678586 )
							if( d <= 50.4286 )
								if( smoothD_d <= 13.1037 )
									ret := -0.888889 // sell
								if( smoothD_d > 13.1037 )
									ret := 0.040282
							if( d > 50.4286 )
								if( rsi1 <= 29.8997 )
									ret := -0.545024
								if( rsi1 > 29.8997 )
									ret := -0.040462
					if( rsi1 > 34.0597 )
						if( smoothD_d <= 82.4288 )
							if( rsi1 <= 39.1537 )
								if( VIP_VIM <= -0.377281 )
									ret := 0.590044
								if( VIP_VIM > -0.377281 )
									ret := -0.500000
							if( rsi1 > 39.1537 )
								if( d_k <= -22.0766 )
									ret := 0.831746 // buy
								if( d_k > -22.0766 )
									ret := 0.718841 // buy
						if( smoothD_d > 82.4288 )
							if( d <= 88.2288 )
								if( rsi1 <= 38.4676 )
									ret := -0.500000
								if( rsi1 > 38.4676 )
									ret := 0.384615
							if( d > 88.2288 )
								if( d <= 89.3419 )
									ret := 0.909091 // buy
								if( d > 89.3419 )
									ret := 0.496689
				if( VIP > 0.786488 )
					if( k <= 90.4288 )
						if( rsi1 <= 48.4477 )
							if( d_k <= -6.45296 )
								if( d <= 16.0207 )
									ret := -0.531250
								if( d > 16.0207 )
									ret := 0.066681
							if( d_k > -6.45296 )
								if( rsi1 <= 33.7574 )
									ret := -0.580060
								if( rsi1 > 33.7574 )
									ret := -0.120118
						if( rsi1 > 48.4477 )
							if( VIP_VIM <= -0.00574 )
								if( VIP <= 0.921482 )
									ret := 0.604284
								if( VIP > 0.921482 )
									ret := 0.403724
							if( VIP_VIM > -0.00574 )
								if( d_k <= -3.14814 )
									ret := 0.338379
								if( d_k > -3.14814 )
									ret := 0.139615
					if( k > 90.4288 )
						if( rsi1 <= 54.4786 )
							if( d <= 90.6721 )
								if( VIP <= 0.928346 )
									ret := 0.406542
								if( VIP > 0.928346 )
									ret := -0.081395
							if( d > 90.6721 )
								if( VIM <= 0.952973 )
									ret := -1.000000 // sell
								if( VIM > 0.952973 )
									ret := 0.025445
						if( rsi1 > 54.4786 )
							if( VIP_VIM <= 0.275999 )
								if( rsi1 <= 67.789 )
									ret := 0.496250
								if( rsi1 > 67.789 )
									ret := 0.757114 // buy
							if( VIP_VIM > 0.275999 )
								if( VIP_VIM <= 0.57322 )
									ret := 0.332940
								if( VIP_VIM > 0.57322 )
									ret := -0.223881
			if( smoothD_d > 90.7751 )
				if( d <= 99.6054 )
					if( VIP_VIM <= 0.111267 )
						if( d_k <= -0.59938 )
							if( VIP <= 0.790439 )
								if( VIM <= 1.26003 )
									ret := 0.847222 // buy
								if( VIM > 1.26003 )
									ret := 0.565217
							if( VIP > 0.790439 )
								if( d_k <= -3.98364 )
									ret := 0.654040
								if( d_k > -3.98364 )
									ret := 0.512391
						if( d_k > -0.59938 )
							if( smoothK_k <= 92.8765 )
								if( rsi1 <= 57.4582 )
									ret := -0.096870
								if( rsi1 > 57.4582 )
									ret := 0.524272
							if( smoothK_k > 92.8765 )
								if( VIM <= 0.950611 )
									ret := -0.387097
								if( VIM > 0.950611 )
									ret := 0.408466
					if( VIP_VIM > 0.111267 )
						if( rsi1 <= 63.0984 )
							if( d <= 97.8773 )
								if( k <= 98.7541 )
									ret := -0.222222
								if( k > 98.7541 )
									ret := -0.692308
							if( d > 97.8773 )
								if( k <= 97.9135 )
									ret := 0.586957
								if( k > 97.9135 )
									ret := -0.631579
						if( rsi1 > 63.0984 )
							if( VIP_VIM <= 0.377412 )
								if( d_k <= -3.2633 )
									ret := 0.799163 // buy
								if( d_k > -3.2633 )
									ret := 0.628133
							if( VIP_VIM > 0.377412 )
								if( rsi1 <= 76.8238 )
									ret := 0.015789
								if( rsi1 > 76.8238 )
									ret := 0.553295
				if( d > 99.6054 )
					if( VIP <= 1.19298 )
						if( VIM <= 1.05937 )
							if( smoothD_d <= 96.9938 )
								if( VIP <= 1.14958 )
									ret := 0.785408 // buy
								if( VIP > 1.14958 )
									ret := 0.987805 // buy
							if( smoothD_d > 96.9938 )
								if( rsi1 <= 67.5159 )
									ret := -0.137931
								if( rsi1 > 67.5159 )
									ret := 0.804000 // buy
						if( VIM > 1.05937 )
							if( VIP_VIM <= -0.052656 )
								if( d <= 99.8997 )
									ret := 0.180328
								if( d > 99.8997 )
									ret := 0.604396
							if( VIP_VIM > -0.052656 )
								ret := -0.555556
					if( VIP > 1.19298 )
						if( rsi1 <= 86.8538 )
							if( rsi1 <= 80.8468 )
								if( VIP_VIM <= 0.437849 )
									ret := 0.500000
								if( VIP_VIM > 0.437849 )
									ret := -0.866667 // sell
							if( rsi1 > 80.8468 )
								if( VIM <= 0.720459 )
									ret := -0.500000
								if( VIM > 0.720459 )
									ret := 0.894737 // buy
						if( rsi1 > 86.8538 )
							if( VIP <= 1.30611 )
								if( rsi1 <= 88.7017 )
									ret := 0.777778 // buy
								if( rsi1 > 88.7017 )
									ret := 0.984848 // buy
							if( VIP > 1.30611 )
								if( VIP_VIM <= 0.66778 )
									ret := 0.500000
								if( VIP_VIM > 0.66778 )
									ret := 0.913043 // buy
		if( d_k > 5.20395 )
			if( d_k <= 9.74809 )
				if( d <= 88.2358 )
					if( VIM <= 0.738973 )
						if( rsi1 <= 71.6947 )
							if( smoothD_d <= 38.3118 )
								ret := 0.222222
							if( smoothD_d > 38.3118 )
								if( VIP <= 1.32789 )
									ret := -0.766129 // sell
								if( VIP > 1.32789 )
									ret := -0.312500
						if( rsi1 > 71.6947 )
							if( d <= 80.777 )
								if( d <= 64.1696 )
									ret := -0.342857
								if( d > 64.1696 )
									ret := 0.620000
							if( d > 80.777 )
								if( VIP <= 1.2824 )
									ret := -0.052632
								if( VIP > 1.2824 )
									ret := -0.734694 // sell
					if( VIM > 0.738973 )
						if( VIP <= 0.993285 )
							if( k <= 70.3931 )
								if( k <= 56.2852 )
									ret := -0.128978
								if( k > 56.2852 )
									ret := -0.523659
							if( k > 70.3931 )
								if( rsi1 <= 41.7227 )
									ret := -0.581081
								if( rsi1 > 41.7227 )
									ret := 0.303922
						if( VIP > 0.993285 )
							if( smoothD_d <= 56.3756 )
								if( smoothK_k <= 47.3461 )
									ret := -0.036209
								if( smoothK_k > 47.3461 )
									ret := -0.532468
							if( smoothD_d > 56.3756 )
								if( rsi1 <= 61.1733 )
									ret := -0.131718
								if( rsi1 > 61.1733 )
									ret := 0.316468
				if( d > 88.2358 )
					if( VIM <= 0.682639 )
						if( VIP_VIM <= 0.871095 )
							if( k <= 85.9807 )
								if( d_k <= 7.16098 )
									ret := -0.781250 // sell
								if( d_k > 7.16098 )
									ret := -0.200000
							if( k > 85.9807 )
								if( d_k <= 5.4365 )
									ret := -0.250000
								if( d_k > 5.4365 )
									ret := 0.451613
						if( VIP_VIM > 0.871095 )
							ret := 0.866667 // buy
					if( VIM > 0.682639 )
						if( d <= 95.4435 )
							if( k <= 87.5169 )
								if( VIP <= 0.963046 )
									ret := 0.016260
								if( VIP > 0.963046 )
									ret := 0.254219
							if( k > 87.5169 )
								if( VIP_VIM <= 0.064631 )
									ret := 0.366197
								if( VIP_VIM > 0.064631 )
									ret := -0.217647
						if( d > 95.4435 )
							if( VIM <= 1.15009 )
								if( VIP <= 1.05523 )
									ret := 0.577778
								if( VIP > 1.05523 )
									ret := 0.337748
							if( VIM > 1.15009 )
								ret := -0.230769
			if( d_k > 9.74809 )
				if( rsi1 <= 57.1208 )
					if( VIP <= 1.06038 )
						if( rsi1 <= 42.7174 )
							if( VIP_VIM <= -0.098536 )
								if( rsi1 <= 34.9474 )
									ret := -0.633752
								if( rsi1 > 34.9474 )
									ret := 0.081081
							if( VIP_VIM > -0.098536 )
								if( d_k <= 22.7511 )
									ret := -0.762338 // sell
								if( d_k > 22.7511 )
									ret := -0.294118
						if( rsi1 > 42.7174 )
							if( VIM <= 0.900897 )
								if( d <= 77.49 )
									ret := -0.661290
								if( d > 77.49 )
									ret := -0.083333
							if( VIM > 0.900897 )
								if( rsi1 <= 50.214 )
									ret := -0.064087
								if( rsi1 > 50.214 )
									ret := 0.363636
					if( VIP > 1.06038 )
						if( VIM <= 0.816303 )
							if( d_k <= 27.1725 )
								if( VIP <= 1.21832 )
									ret := -0.796078 // sell
								if( VIP > 1.21832 )
									ret := -0.617347
							if( d_k > 27.1725 )
								ret := -1.000000 // sell
						if( VIM > 0.816303 )
							if( rsi1 <= 47.8759 )
								if( smoothK_k <= 56.9548 )
									ret := -0.580282
								if( smoothK_k > 56.9548 )
									ret := -0.803493 // sell
							if( rsi1 > 47.8759 )
								if( k <= 35.0896 )
									ret := -0.171642
								if( k > 35.0896 )
									ret := -0.460354
				if( rsi1 > 57.1208 )
					if( VIP_VIM <= 0.452287 )
						if( VIP_VIM <= 0.245998 )
							if( VIP <= 1.12342 )
								if( smoothD_d <= 87.1931 )
									ret := 0.551308
								if( smoothD_d > 87.1931 )
									ret := -0.222222
							if( VIP > 1.12342 )
								if( VIP <= 1.15272 )
									ret := 0.018182
								if( VIP > 1.15272 )
									ret := 0.750000 // buy
						if( VIP_VIM > 0.245998 )
							if( k <= 39.7475 )
								if( d <= 45.9927 )
									ret := 0.650000
								if( d > 45.9927 )
									ret := 0.148148
							if( k > 39.7475 )
								if( d_k <= 10.8097 )
									ret := -0.341667
								if( d_k > 10.8097 )
									ret := 0.019370
					if( VIP_VIM > 0.452287 )
						if( rsi1 <= 78.8412 )
							if( VIP <= 1.26273 )
								if( smoothK_k <= 64.4047 )
									ret := -0.295775
								if( smoothK_k > 64.4047 )
									ret := -0.581395
							if( VIP > 1.26273 )
								if( VIM <= 0.631137 )
									ret := -0.836364 // sell
								if( VIM > 0.631137 )
									ret := -0.530364
						if( rsi1 > 78.8412 )
							if( k <= 53.3125 )
								ret := 0.000000
							if( k > 53.3125 )
								if( VIP <= 1.29009 )
									ret := 0.812500 // buy
								if( VIP > 1.29009 )
									ret := 0.476190
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_24a92daa(smoothK_k, d_k, k, smoothD_d, rsi1, d, VIP_VIM, VIP, VIM)

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


