//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: NVDA_15Min_1BOL_66a7c108 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_15Min_1BOL_66a7c108", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_15Min_66a7c108(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBupper <= -4.6831 )
		if( dif_source_BBupper <= -39.3002 )
			if( BBupper <= 220.381 )
				if( dif_source_BBupper <= -50.2961 )
					if( BBlower <= 128.045 )
						if( BBupper <= 203.416 )
							if( dif_source_BBupper <= -53.9202 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -53.9202 )
								ret := -0.666667
						if( BBupper > 203.416 )
							if( BBlower <= 126.459 )
								ret := 1.000000 // buy
							if( BBlower > 126.459 )
								ret := 0.750000 // buy
					if( BBlower > 128.045 )
						if( dif_source_BBlower <= 1.07744 )
							if( dif_source_BBlower <= -4.11455 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -4.11455 )
								if( BBupper <= 218.278 )
									ret := -0.666667
								if( BBupper > 218.278 )
									ret := 0.444444
						if( dif_source_BBlower > 1.07744 )
							if( dif_source_BBupper <= -70.803 )
								ret := -0.142857
							if( dif_source_BBupper > -70.803 )
								if( dif_source_BBlower <= 6.57292 )
									ret := -0.448276
								if( dif_source_BBlower > 6.57292 )
									ret := -0.908333 // sell
				if( dif_source_BBupper > -50.2961 )
					if( vrsi <= 24.7206 )
						if( BBlower <= 157.155 )
							if( dif_source_BBlower <= 4.25417 )
								ret := 0.250000
							if( dif_source_BBlower > 4.25417 )
								if( BBupper <= 196.702 )
									ret := 0.750000 // buy
								if( BBupper > 196.702 )
									ret := 1.000000 // buy
						if( BBlower > 157.155 )
							if( vrsi <= 11.6722 )
								if( dif_source_BBlower <= -10.563 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -10.563 )
									ret := 0.750000 // buy
							if( vrsi > 11.6722 )
								ret := 1.000000 // buy
					if( vrsi > 24.7206 )
						if( BBlower <= 154.833 )
							if( vrsi <= 43.7357 )
								if( BBlower <= 127.674 )
									ret := 0.750000 // buy
								if( BBlower > 127.674 )
									ret := 0.500000
							if( vrsi > 43.7357 )
								ret := 0.000000
						if( BBlower > 154.833 )
							if( dif_source_BBlower <= -7.69854 )
								if( BBlower <= 178.883 )
									ret := 0.833333 // buy
								if( BBlower > 178.883 )
									ret := -0.333333
							if( dif_source_BBlower > -7.69854 )
								if( vrsi <= 85.1573 )
									ret := -0.476190
								if( vrsi > 85.1573 )
									ret := -1.000000 // sell
			if( BBupper > 220.381 )
				if( vrsi <= 17.3245 )
					if( dif_source_BBlower <= -0.174866 )
						if( BBlower <= 510.412 )
							if( BBlower <= 226.807 )
								if( BBupper <= 266.307 )
									ret := 0.519231
								if( BBupper > 266.307 )
									ret := -0.619048
							if( BBlower > 226.807 )
								if( dif_source_BBupper <= -49.4614 )
									ret := 0.914634 // buy
								if( dif_source_BBupper > -49.4614 )
									ret := 0.619048
						if( BBlower > 510.412 )
							if( BBupper <= 896.438 )
								if( BBlower <= 539.923 )
									ret := 0.318841
								if( BBlower > 539.923 )
									ret := -0.189394
							if( BBupper > 896.438 )
								if( BBupper <= 904.517 )
									ret := 0.911111 // buy
								if( BBupper > 904.517 )
									ret := 0.413793
					if( dif_source_BBlower > -0.174866 )
						if( BBupper <= 603.509 )
							if( dif_source_BBupper <= -82.184 )
								if( BBlower <= 466.957 )
									ret := -0.428571
								if( BBlower > 466.957 )
									ret := -0.869565 // sell
							if( dif_source_BBupper > -82.184 )
								if( dif_source_BBupper <= -57.3858 )
									ret := 0.540541
								if( dif_source_BBupper > -57.3858 )
									ret := -0.041841
						if( BBupper > 603.509 )
							if( dif_source_BBupper <= -52.2486 )
								if( dif_source_BBlower <= 25.7473 )
									ret := 0.594595
								if( dif_source_BBlower > 25.7473 )
									ret := 0.259259
							if( dif_source_BBupper > -52.2486 )
								if( BBupper <= 947.193 )
									ret := 0.222222
								if( BBupper > 947.193 )
									ret := -0.391304
				if( vrsi > 17.3245 )
					if( BBupper <= 524.81 )
						if( dif_source_BBupper <= -45.8538 )
							if( BBlower <= 219.86 )
								if( vrsi <= 25.9749 )
									ret := 0.100000
								if( vrsi > 25.9749 )
									ret := 0.746781 // buy
							if( BBlower > 219.86 )
								if( BBupper <= 509.014 )
									ret := 0.061404
								if( BBupper > 509.014 )
									ret := 0.843137 // buy
						if( dif_source_BBupper > -45.8538 )
							if( BBlower <= 230.392 )
								if( BBlower <= 189.91 )
									ret := 1.000000 // buy
								if( BBlower > 189.91 )
									ret := -0.214008
							if( BBlower > 230.392 )
								if( BBlower <= 274.082 )
									ret := 0.622222
								if( BBlower > 274.082 )
									ret := 0.146214
					if( BBupper > 524.81 )
						if( BBupper <= 534.992 )
							if( BBupper <= 528.647 )
								if( vrsi <= 43.6375 )
									ret := -0.615385
								if( vrsi > 43.6375 )
									ret := 0.357143
							if( BBupper > 528.647 )
								if( BBlower <= 472.416 )
									ret := -0.967742 // sell
								if( BBlower > 472.416 )
									ret := -0.608696
						if( BBupper > 534.992 )
							if( dif_source_BBupper <= -46.4424 )
								if( BBupper <= 601.611 )
									ret := -0.081277
								if( BBupper > 601.611 )
									ret := 0.138705
							if( dif_source_BBupper > -46.4424 )
								if( BBupper <= 558.1 )
									ret := 0.473282
								if( BBupper > 558.1 )
									ret := -0.148668
		if( dif_source_BBupper > -39.3002 )
			if( BBlower <= 95.969 )
				if( BBlower <= 87.3477 )
					if( dif_source_BBupper <= -6.45475 )
						if( BBupper <= 97.0574 )
							ret := 1.000000 // buy
						if( BBupper > 97.0574 )
							if( dif_source_BBlower <= 2.89085 )
								if( dif_source_BBlower <= 2.49081 )
									ret := 0.914286 // buy
								if( dif_source_BBlower > 2.49081 )
									ret := 0.571429
							if( dif_source_BBlower > 2.89085 )
								if( BBlower <= 85.2604 )
									ret := 0.166667
								if( BBlower > 85.2604 )
									ret := -0.250000
					if( dif_source_BBupper > -6.45475 )
						if( BBlower <= 86.5695 )
							if( dif_source_BBupper <= -5.71777 )
								if( dif_source_BBlower <= 5.57185 )
									ret := 0.000000
								if( dif_source_BBlower > 5.57185 )
									ret := -0.750000 // sell
							if( dif_source_BBupper > -5.71777 )
								ret := 0.333333
						if( BBlower > 86.5695 )
							ret := 1.000000 // buy
				if( BBlower > 87.3477 )
					if( BBlower <= 91.5157 )
						if( BBupper <= 96.6157 )
							if( dif_source_BBupper <= -7.82013 )
								if( BBupper <= 96.3817 )
									ret := 1.000000 // buy
								if( BBupper > 96.3817 )
									ret := 0.000000
							if( dif_source_BBupper > -7.82013 )
								if( dif_source_BBupper <= -5.52092 )
									ret := -0.904762 // sell
								if( dif_source_BBupper > -5.52092 )
									ret := -0.363636
						if( BBupper > 96.6157 )
							if( dif_source_BBlower <= 3.87664 )
								if( BBlower <= 88.5442 )
									ret := 0.483871
								if( BBlower > 88.5442 )
									ret := 0.842105 // buy
							if( dif_source_BBlower > 3.87664 )
								ret := -0.166667
					if( BBlower > 91.5157 )
						if( vrsi <= 56.4242 )
							if( BBlower <= 93.2148 )
								if( BBlower <= 92.8143 )
									ret := 0.500000
								if( BBlower > 92.8143 )
									ret := 1.000000 // buy
							if( BBlower > 93.2148 )
								if( dif_source_BBupper <= -6.13809 )
									ret := 0.521368
								if( dif_source_BBupper > -6.13809 )
									ret := 0.806452 // buy
						if( vrsi > 56.4242 )
							if( BBupper <= 122.278 )
								if( BBlower <= 93.9767 )
									ret := -0.739130 // sell
								if( BBlower > 93.9767 )
									ret := 0.150794
							if( BBupper > 122.278 )
								if( vrsi <= 78.1585 )
									ret := 0.961538 // buy
								if( vrsi > 78.1585 )
									ret := 0.625000
			if( BBlower > 95.969 )
				if( dif_source_BBupper <= -14.9255 )
					if( BBlower <= 918.271 )
						if( BBupper <= 895.959 )
							if( dif_source_BBlower <= 5.62087 )
								if( BBlower <= 110.231 )
									ret := 0.197943
								if( BBlower > 110.231 )
									ret := -0.051064
							if( dif_source_BBlower > 5.62087 )
								if( BBlower <= 562.844 )
									ret := 0.006132
								if( BBlower > 562.844 )
									ret := 0.150099
						if( BBupper > 895.959 )
							if( dif_source_BBupper <= -27.9948 )
								if( dif_source_BBlower <= 57.8548 )
									ret := -0.084189
								if( dif_source_BBlower > 57.8548 )
									ret := 0.294521
							if( dif_source_BBupper > -27.9948 )
								if( dif_source_BBlower <= 58.4963 )
									ret := -0.159140
								if( dif_source_BBlower > 58.4963 )
									ret := -0.578313
					if( BBlower > 918.271 )
						if( BBlower <= 1081.78 )
							if( BBlower <= 987.793 )
								if( dif_source_BBlower <= 149.629 )
									ret := 0.796460 // buy
								if( dif_source_BBlower > 149.629 )
									ret := 0.333333
							if( BBlower > 987.793 )
								if( vrsi <= 60.3803 )
									ret := 0.418605
								if( vrsi > 60.3803 )
									ret := -0.055556
						if( BBlower > 1081.78 )
							if( BBupper <= 1207.04 )
								ret := -1.000000 // sell
							if( BBupper > 1207.04 )
								ret := -0.750000 // sell
				if( dif_source_BBupper > -14.9255 )
					if( BBlower <= 103.339 )
						if( BBupper <= 115.406 )
							if( BBupper <= 113.76 )
								if( dif_source_BBlower <= 6.75141 )
									ret := -0.046341
								if( dif_source_BBlower > 6.75141 )
									ret := -0.559524
							if( BBupper > 113.76 )
								if( dif_source_BBlower <= -0.20429 )
									ret := -0.380952
								if( dif_source_BBlower > -0.20429 )
									ret := 0.423358
						if( BBupper > 115.406 )
							if( dif_source_BBupper <= -8.85336 )
								if( BBupper <= 119.946 )
									ret := -0.736364 // sell
								if( BBupper > 119.946 )
									ret := -0.415686
							if( dif_source_BBupper > -8.85336 )
								if( BBupper <= 133.927 )
									ret := -0.292929
								if( BBupper > 133.927 )
									ret := 0.611111
					if( BBlower > 103.339 )
						if( vrsi <= 26.4893 )
							if( dif_source_BBlower <= 0.539262 )
								if( vrsi <= 14.5323 )
									ret := 0.108179
								if( vrsi > 14.5323 )
									ret := 0.286148
							if( dif_source_BBlower > 0.539262 )
								if( dif_source_BBlower <= 5.83707 )
									ret := -0.028402
								if( dif_source_BBlower > 5.83707 )
									ret := 0.115826
						if( vrsi > 26.4893 )
							if( BBlower <= 105.334 )
								if( dif_source_BBupper <= -8.89855 )
									ret := 0.105263
								if( dif_source_BBupper > -8.89855 )
									ret := 0.467890
							if( BBlower > 105.334 )
								if( BBupper <= 1224.54 )
									ret := 0.030073
								if( BBupper > 1224.54 )
									ret := -1.000000 // sell
	if( dif_source_BBupper > -4.6831 )
		if( dif_source_BBupper <= 0.829665 )
			if( vrsi <= 98.5836 )
				if( BBlower <= 144.463 )
					if( BBlower <= 127.286 )
						if( BBupper <= 136.029 )
							if( dif_source_BBlower <= 3.05132 )
								if( BBlower <= 123.775 )
									ret := 0.026288
								if( BBlower > 123.775 )
									ret := -0.806452 // sell
							if( dif_source_BBlower > 3.05132 )
								if( dif_source_BBupper <= -2.56083 )
									ret := 0.220510
								if( dif_source_BBupper > -2.56083 )
									ret := 0.119751
						if( BBupper > 136.029 )
							if( vrsi <= 72.9062 )
								if( dif_source_BBupper <= 0.127136 )
									ret := -0.224215
								if( dif_source_BBupper > 0.127136 )
									ret := 0.538462
							if( vrsi > 72.9062 )
								if( BBupper <= 139.937 )
									ret := 0.313043
								if( BBupper > 139.937 )
									ret := -0.350000
					if( BBlower > 127.286 )
						if( BBlower <= 128.635 )
							if( BBupper <= 138.117 )
								if( vrsi <= 42.8887 )
									ret := 0.944444 // buy
								if( vrsi > 42.8887 )
									ret := 0.600000
							if( BBupper > 138.117 )
								if( dif_source_BBupper <= -1.23447 )
									ret := 0.226415
								if( dif_source_BBupper > -1.23447 )
									ret := -0.692308
						if( BBlower > 128.635 )
							if( dif_source_BBlower <= 10.0437 )
								if( BBlower <= 140.852 )
									ret := 0.316563
								if( BBlower > 140.852 )
									ret := 0.155245
							if( dif_source_BBlower > 10.0437 )
								if( dif_source_BBlower <= 17.8082 )
									ret := 0.116805
								if( dif_source_BBlower > 17.8082 )
									ret := -0.133829
				if( BBlower > 144.463 )
					if( BBupper <= 396.674 )
						if( dif_source_BBlower <= 29.033 )
							if( vrsi <= 75.5168 )
								if( BBupper <= 168.791 )
									ret := 0.128095
								if( BBupper > 168.791 )
									ret := 0.041722
							if( vrsi > 75.5168 )
								if( BBlower <= 154.327 )
									ret := -0.126718
								if( BBlower > 154.327 )
									ret := -0.010650
						if( dif_source_BBlower > 29.033 )
							if( BBupper <= 294.994 )
								if( BBupper <= 266.989 )
									ret := -0.004608
								if( BBupper > 266.989 )
									ret := -0.535865
							if( BBupper > 294.994 )
								if( BBupper <= 300.7 )
									ret := 0.693333
								if( BBupper > 300.7 )
									ret := -0.087464
					if( BBupper > 396.674 )
						if( BBupper <= 421.339 )
							if( dif_source_BBlower <= 13.0774 )
								if( dif_source_BBupper <= -3.0461 )
									ret := -0.333333
								if( dif_source_BBupper > -3.0461 )
									ret := 0.500000
							if( dif_source_BBlower > 13.0774 )
								if( vrsi <= 48.3349 )
									ret := 0.478992
								if( vrsi > 48.3349 )
									ret := 0.777070 // buy
						if( BBupper > 421.339 )
							if( BBupper <= 428.968 )
								if( dif_source_BBlower <= 11.1007 )
									ret := 0.203125
								if( dif_source_BBlower > 11.1007 )
									ret := -0.291667
							if( BBupper > 428.968 )
								if( BBupper <= 451.485 )
									ret := 0.272727
								if( BBupper > 451.485 )
									ret := 0.083204
			if( vrsi > 98.5836 )
				if( BBupper <= 522.402 )
					if( BBlower <= 88.3367 )
						if( vrsi <= 99.9729 )
							ret := 1.000000 // buy
						if( vrsi > 99.9729 )
							if( dif_source_BBupper <= -1.26178 )
								ret := 0.200000
							if( dif_source_BBupper > -1.26178 )
								ret := 0.500000
					if( BBlower > 88.3367 )
						if( BBlower <= 97.2657 )
							if( vrsi <= 99.1377 )
								ret := -0.200000
							if( vrsi > 99.1377 )
								if( dif_source_BBupper <= -1.56854 )
									ret := -0.933333 // sell
								if( dif_source_BBupper > -1.56854 )
									ret := -0.333333
						if( BBlower > 97.2657 )
							if( dif_source_BBupper <= -4.19788 )
								if( dif_source_BBlower <= 9.66478 )
									ret := -0.066667
								if( dif_source_BBlower > 9.66478 )
									ret := 0.555556
							if( dif_source_BBupper > -4.19788 )
								if( dif_source_BBupper <= -0.56229 )
									ret := -0.147783
								if( dif_source_BBupper > -0.56229 )
									ret := -0.014493
				if( BBupper > 522.402 )
					if( dif_source_BBlower <= 51.5452 )
						if( dif_source_BBlower <= 39.1675 )
							if( dif_source_BBlower <= 13.3992 )
								ret := 0.800000 // buy
							if( dif_source_BBlower > 13.3992 )
								if( dif_source_BBlower <= 25.1747 )
									ret := 0.000000
								if( dif_source_BBlower > 25.1747 )
									ret := 0.230769
						if( dif_source_BBlower > 39.1675 )
							if( dif_source_BBlower <= 41.1393 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > 41.1393 )
								ret := 0.750000 // buy
					if( dif_source_BBlower > 51.5452 )
						if( dif_source_BBlower <= 63.4727 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 63.4727 )
							ret := 0.000000
		if( dif_source_BBupper > 0.829665 )
			if( dif_source_BBlower <= 131.422 )
				if( BBupper <= 118.964 )
					if( BBupper <= 110.586 )
						if( vrsi <= 97.4401 )
							if( vrsi <= 65.8269 )
								if( vrsi <= 43.7302 )
									ret := -0.500000
								if( vrsi > 43.7302 )
									ret := -0.846154 // sell
							if( vrsi > 65.8269 )
								if( BBupper <= 99.5985 )
									ret := -0.777778 // sell
								if( BBupper > 99.5985 )
									ret := 0.308824
						if( vrsi > 97.4401 )
							if( vrsi <= 99.3788 )
								ret := -1.000000 // sell
							if( vrsi > 99.3788 )
								ret := 0.000000
					if( BBupper > 110.586 )
						if( BBlower <= 106.031 )
							if( vrsi <= 86.7012 )
								if( dif_source_BBlower <= 9.87392 )
									ret := 0.250000
								if( dif_source_BBlower > 9.87392 )
									ret := 0.784946 // buy
							if( vrsi > 86.7012 )
								if( BBupper <= 112.748 )
									ret := 0.695652
								if( BBupper > 112.748 )
									ret := -0.100000
						if( BBlower > 106.031 )
							if( BBlower <= 112.232 )
								if( BBupper <= 112.162 )
									ret := -0.250000
								if( BBupper > 112.162 )
									ret := 0.071429
							if( BBlower > 112.232 )
								if( dif_source_BBupper <= 1.0347 )
									ret := 0.500000
								if( dif_source_BBupper > 1.0347 )
									ret := 1.000000 // buy
				if( BBupper > 118.964 )
					if( BBupper <= 139.373 )
						if( dif_source_BBlower <= 11.642 )
							if( BBlower <= 128.512 )
								if( dif_source_BBlower <= 7.04837 )
									ret := 0.562500
								if( dif_source_BBlower > 7.04837 )
									ret := -0.056604
							if( BBlower > 128.512 )
								if( dif_source_BBupper <= 1.11064 )
									ret := 0.666667
								if( dif_source_BBupper > 1.11064 )
									ret := -0.894737 // sell
						if( dif_source_BBlower > 11.642 )
							if( dif_source_BBupper <= 1.50315 )
								if( BBlower <= 103.324 )
									ret := -0.500000
								if( BBlower > 103.324 )
									ret := -0.869565 // sell
							if( dif_source_BBupper > 1.50315 )
								if( BBupper <= 129.611 )
									ret := -0.240000
								if( BBupper > 129.611 )
									ret := -0.707317 // sell
					if( BBupper > 139.373 )
						if( dif_source_BBupper <= 17.3587 )
							if( BBlower <= 135.382 )
								if( BBupper <= 143.515 )
									ret := 0.179775
								if( BBupper > 143.515 )
									ret := 0.712329 // buy
							if( BBlower > 135.382 )
								if( BBlower <= 547.951 )
									ret := 0.104867
								if( BBlower > 547.951 )
									ret := 0.245803
						if( dif_source_BBupper > 17.3587 )
							if( dif_source_BBupper <= 18.3461 )
								if( vrsi <= 84.247 )
									ret := 0.375000
								if( vrsi > 84.247 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > 18.3461 )
								if( BBlower <= 273.929 )
									ret := 0.822222 // buy
								if( BBlower > 273.929 )
									ret := 0.226804
			if( dif_source_BBlower > 131.422 )
				if( BBlower <= 902.613 )
					if( dif_source_BBlower <= 132.928 )
						if( BBlower <= 824.212 )
							ret := -1.000000 // sell
						if( BBlower > 824.212 )
							ret := -0.250000
					if( dif_source_BBlower > 132.928 )
						ret := -1.000000 // sell
				if( BBlower > 902.613 )
					if( vrsi <= 59.6464 )
						ret := 1.000000 // buy
					if( vrsi > 59.6464 )
						if( BBlower <= 1094.24 )
							if( BBlower <= 967.045 )
								if( BBupper <= 1132.38 )
									ret := -0.083333
								if( BBupper > 1132.38 )
									ret := -0.900000 // sell
							if( BBlower > 967.045 )
								if( dif_source_BBlower <= 142.065 )
									ret := 0.250000
								if( dif_source_BBlower > 142.065 )
									ret := 0.000000
						if( BBlower > 1094.24 )
							if( dif_source_BBlower <= 147.216 )
								ret := -0.500000
							if( dif_source_BBlower > 147.216 )
								if( dif_source_BBlower <= 148.874 )
									ret := -0.777778 // sell
								if( dif_source_BBlower > 148.874 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_NVDA_15Min_66a7c108(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


