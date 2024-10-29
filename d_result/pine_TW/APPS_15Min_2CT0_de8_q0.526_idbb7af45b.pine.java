//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: APPS_15Min_2CT0_bb7af45b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2CT0_bb7af45b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_bb7af45b(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= -0.708383 )
		if( tema <= 1.64758 )
			if( mf <= -0.162813 )
				if( ema13 <= -0.005632 )
					if( ema3 <= 1.41606 )
						if( ema2 <= 0.827966 )
							if( ema2 <= 0.745987 )
								if( mf <= -0.358896 )
									ret := 0.627907
								if( mf > -0.358896 )
									ret := -0.047619
							if( ema2 > 0.745987 )
								if( ema13 <= -0.01346 )
									ret := -0.700000 // sell
								if( ema13 > -0.01346 )
									ret := 0.333333
						if( ema2 > 0.827966 )
							if( ema12 <= -0.005367 )
								if( ema2 <= 1.10929 )
									ret := 0.861111 // buy
								if( ema2 > 1.10929 )
									ret := 0.569444
							if( ema12 > -0.005367 )
								if( ema13 <= -0.008384 )
									ret := 0.094340
								if( ema13 > -0.008384 )
									ret := 0.580247
					if( ema3 > 1.41606 )
						if( tema <= 1.59221 )
							if( tema <= 1.54026 )
								if( ema3 <= 1.52091 )
									ret := 0.275862
								if( ema3 > 1.52091 )
									ret := 0.641509
							if( tema > 1.54026 )
								if( ad_mf <= -15820.7 )
									ret := -0.179487
								if( ad_mf > -15820.7 )
									ret := 0.340000
						if( tema > 1.59221 )
							if( ema13 <= -0.033315 )
								ret := 0.045455
							if( ema13 > -0.033315 )
								if( tema <= 1.60826 )
									ret := 0.941176 // buy
								if( tema > 1.60826 )
									ret := 0.566667
				if( ema13 > -0.005632 )
					if( ad <= -1043.73 )
						if( tema <= 1.48456 )
							if( ad_mf <= -6495.96 )
								if( ema2 <= 0.84211 )
									ret := 0.316456
								if( ema2 > 0.84211 )
									ret := 0.630137
							if( ad_mf > -6495.96 )
								if( mf <= -0.251701 )
									ret := 0.371711
								if( mf > -0.251701 )
									ret := 0.114035
						if( tema > 1.48456 )
							if( mf <= -0.2216 )
								if( ema1 <= 1.56115 )
									ret := -0.102041
								if( ema1 > 1.56115 )
									ret := 0.235294
							if( mf > -0.2216 )
								if( ema1 <= 1.52833 )
									ret := 0.846154 // buy
								if( ema1 > 1.52833 )
									ret := 0.280000
					if( ad > -1043.73 )
						if( ema1 <= 1.07424 )
							if( ema3 <= 0.932067 )
								if( ema1 <= 0.819149 )
									ret := 0.444444
								if( ema1 > 0.819149 )
									ret := -0.250000
							if( ema3 > 0.932067 )
								ret := 0.857143 // buy
						if( ema1 > 1.07424 )
							if( ema2 <= 1.53646 )
								if( ad_mf <= -870.375 )
									ret := -0.857143 // sell
								if( ad_mf > -870.375 )
									ret := -0.300000
							if( ema2 > 1.53646 )
								ret := 0.454545
			if( mf > -0.162813 )
				if( ad_mf <= -1495.33 )
					if( ad_mf <= -1520.7 )
						if( ad_mf <= -6286.13 )
							if( ema13 <= 0.017766 )
								if( mf <= 0.435683 )
									ret := 0.358450
								if( mf > 0.435683 )
									ret := -0.056604
							if( ema13 > 0.017766 )
								if( ema1 <= 0.85509 )
									ret := -0.875000 // sell
								if( ema1 > 0.85509 )
									ret := 0.071429
						if( ad_mf > -6286.13 )
							if( ad <= -5248.63 )
								if( ema3 <= 1.61096 )
									ret := -0.344156
								if( ema3 > 1.61096 )
									ret := 0.615385
							if( ad > -5248.63 )
								if( ema12 <= -0.004035 )
									ret := 0.495868
								if( ema12 > -0.004035 )
									ret := 0.091065
					if( ad_mf > -1520.7 )
						if( ema12 <= 0.002208 )
							ret := -0.076923
						if( ema12 > 0.002208 )
							ret := -1.000000 // sell
				if( ad_mf > -1495.33 )
					if( mf <= -0.031414 )
						if( mf <= -0.046069 )
							if( tema <= 1.58062 )
								if( ad <= -1276.88 )
									ret := 0.666667
								if( ad > -1276.88 )
									ret := 0.191304
							if( tema > 1.58062 )
								ret := -0.500000
						if( mf > -0.046069 )
							if( ema1 <= 1.2358 )
								ret := -0.117647
							if( ema1 > 1.2358 )
								ret := -0.500000
					if( mf > -0.031414 )
						if( ad_mf <= -1400.36 )
							if( ema13 <= 0.002378 )
								if( ema2 <= 1.24738 )
									ret := 1.000000 // buy
								if( ema2 > 1.24738 )
									ret := 0.884615 // buy
							if( ema13 > 0.002378 )
								ret := 0.125000
						if( ad_mf > -1400.36 )
							if( ema1 <= 0.808479 )
								if( ad_mf <= -1108.13 )
									ret := -0.466667
								if( ad_mf > -1108.13 )
									ret := 0.087719
							if( ema1 > 0.808479 )
								if( ad_mf <= -675.635 )
									ret := 0.532374
								if( ad_mf > -675.635 )
									ret := 0.269373
		if( tema > 1.64758 )
			if( ad <= -100942 )
				if( ad <= -104164 )
					if( ad <= -112333 )
						if( ema12 <= -0.90695 )
							if( mf <= -0.405257 )
								if( ema3 <= 68.0909 )
									ret := 0.750000 // buy
								if( ema3 > 68.0909 )
									ret := -0.264706
							if( mf > -0.405257 )
								if( ad <= -183292 )
									ret := 0.466667
								if( ad > -183292 )
									ret := 0.790323 // buy
						if( ema12 > -0.90695 )
							if( ad_mf <= -119696 )
								if( mf <= -0.347309 )
									ret := -0.008444
								if( mf > -0.347309 )
									ret := 0.231071
							if( ad_mf > -119696 )
								if( ad <= -116780 )
									ret := 0.673913
								if( ad > -116780 )
									ret := 0.241026
					if( ad > -112333 )
						if( ema12 <= -0.988039 )
							ret := -1.000000 // sell
						if( ema12 > -0.988039 )
							if( ema13 <= -0.08882 )
								if( ad_mf <= -105348 )
									ret := 0.398496
								if( ad_mf > -105348 )
									ret := -0.818182 // sell
							if( ema13 > -0.08882 )
								if( tema <= 2.07513 )
									ret := -0.823529 // sell
								if( tema > 2.07513 )
									ret := -0.139073
				if( ad > -104164 )
					if( mf <= -0.023293 )
						if( ad <= -103885 )
							ret := 1.000000 // buy
						if( ad > -103885 )
							if( ema2 <= 60.9903 )
								if( ema2 <= 4.96217 )
									ret := 0.769231 // buy
								if( ema2 > 4.96217 )
									ret := 0.277778
							if( ema2 > 60.9903 )
								ret := -0.600000
					if( mf > -0.023293 )
						if( ema12 <= -0.119954 )
							ret := 0.285714
						if( ema12 > -0.119954 )
							if( ema12 <= 0.072787 )
								if( ema1 <= 3.84599 )
									ret := 0.700000 // buy
								if( ema1 > 3.84599 )
									ret := 0.949153 // buy
							if( ema12 > 0.072787 )
								if( ema12 <= 0.392562 )
									ret := 0.363636
								if( ema12 > 0.392562 )
									ret := 0.916667 // buy
			if( ad > -100942 )
				if( ad <= -7529.24 )
					if( ema1 <= 11.526 )
						if( ad <= -7888.79 )
							if( ema12 <= 0.0224 )
								if( ema3 <= 4.71436 )
									ret := 0.117706
								if( ema3 > 4.71436 )
									ret := 0.039255
							if( ema12 > 0.0224 )
								if( ema1 <= 3.3942 )
									ret := -0.217857
								if( ema1 > 3.3942 )
									ret := -0.014093
						if( ad > -7888.79 )
							if( ema3 <= 1.88054 )
								ret := -0.733333 // sell
							if( ema3 > 1.88054 )
								if( ad_mf <= -7563.16 )
									ret := -0.184466
								if( ad_mf > -7563.16 )
									ret := -0.954545 // sell
					if( ema1 > 11.526 )
						if( ad_mf <= -8007.15 )
							if( ema13 <= -2.30306 )
								if( ema1 <= 74.6433 )
									ret := -0.900000 // sell
								if( ema1 > 74.6433 )
									ret := -0.423077
							if( ema13 > -2.30306 )
								if( ad <= -10676.1 )
									ret := -0.050761
								if( ad > -10676.1 )
									ret := -0.234120
						if( ad_mf > -8007.15 )
							if( ad <= -7961.34 )
								ret := 1.000000 // buy
							if( ad > -7961.34 )
								if( ema13 <= -0.42685 )
									ret := 0.900000 // buy
								if( ema13 > -0.42685 )
									ret := 0.000000
				if( ad > -7529.24 )
					if( ema1 <= 40.2389 )
						if( ema3 <= 32.3475 )
							if( ad <= -7335.54 )
								if( ad <= -7368.28 )
									ret := 0.488095
								if( ad > -7368.28 )
									ret := 0.909091 // buy
							if( ad > -7335.54 )
								if( ad <= -624 )
									ret := 0.163206
								if( ad > -624 )
									ret := 0.057728
						if( ema3 > 32.3475 )
							if( ema13 <= -0.136186 )
								if( mf <= -0.436046 )
									ret := -0.333333
								if( mf > -0.436046 )
									ret := 0.536082
							if( ema13 > -0.136186 )
								if( ema3 <= 32.6302 )
									ret := 0.875000 // buy
								if( ema3 > 32.6302 )
									ret := 0.247813
					if( ema1 > 40.2389 )
						if( ema13 <= -1.14587 )
							if( ema12 <= -0.563807 )
								if( ad <= -931.44 )
									ret := 0.247706
								if( ad > -931.44 )
									ret := 0.674419
							if( ema12 > -0.563807 )
								ret := 0.900000 // buy
						if( ema13 > -1.14587 )
							if( ema12 <= -0.108802 )
								if( ema12 <= -0.277116 )
									ret := -0.057495
								if( ema12 > -0.277116 )
									ret := 0.150198
							if( ema12 > -0.108802 )
								if( ad_mf <= -1781.6 )
									ret := -0.176471
								if( ad_mf > -1781.6 )
									ret := 0.010572
	if( ad_mf > -0.708383 )
		if( ema2 <= 4.25918 )
			if( ema12 <= -0.002028 )
				if( ema3 <= 1.49911 )
					if( ad <= 11128.3 )
						if( ema3 <= 1.44752 )
							if( ema1 <= 1.0095 )
								if( ema1 <= 0.677412 )
									ret := -0.285714
								if( ema1 > 0.677412 )
									ret := 0.409548
							if( ema1 > 1.0095 )
								if( ema12 <= -0.004208 )
									ret := 0.269414
								if( ema12 > -0.004208 )
									ret := -0.065041
						if( ema3 > 1.44752 )
							if( ad_mf <= 0.532306 )
								if( ad_mf <= 0.227605 )
									ret := 0.573034
								if( ad_mf > 0.227605 )
									ret := 0.926829 // buy
							if( ad_mf > 0.532306 )
								if( ema13 <= -0.006582 )
									ret := 0.321429
								if( ema13 > -0.006582 )
									ret := -0.360000
					if( ad > 11128.3 )
						if( ema3 <= 1.28668 )
							if( ema1 <= 1.21205 )
								if( ema3 <= 1.00579 )
									ret := -0.355556
								if( ema3 > 1.00579 )
									ret := 0.031250
							if( ema1 > 1.21205 )
								if( ema13 <= -0.006437 )
									ret := -0.312500
								if( ema13 > -0.006437 )
									ret := -1.000000 // sell
						if( ema3 > 1.28668 )
							if( ema3 <= 1.32397 )
								ret := 0.636364
							if( ema3 > 1.32397 )
								if( mf <= 0.038561 )
									ret := 0.058824
								if( mf > 0.038561 )
									ret := -0.297297
				if( ema3 > 1.49911 )
					if( ad <= 5.56784 )
						if( ema12 <= -0.016495 )
							if( tema <= 2.07097 )
								if( ema13 <= -0.042108 )
									ret := -0.577778
								if( ema13 > -0.042108 )
									ret := 0.147059
							if( tema > 2.07097 )
								if( ema1 <= 2.38187 )
									ret := 0.774648 // buy
								if( ema1 > 2.38187 )
									ret := 0.453704
						if( ema12 > -0.016495 )
							if( ema1 <= 3.24876 )
								if( ad_mf <= -0.166849 )
									ret := 0.388462
								if( ad_mf > -0.166849 )
									ret := 0.016691
							if( ema1 > 3.24876 )
								if( ema3 <= 3.58898 )
									ret := -0.663551
								if( ema3 > 3.58898 )
									ret := -0.126984
					if( ad > 5.56784 )
						if( ad <= 3626.61 )
							if( ad <= 2956.8 )
								if( ad <= 2853.03 )
									ret := -0.250464
								if( ad > 2853.03 )
									ret := 0.529412
							if( ad > 2956.8 )
								if( ad <= 2990.32 )
									ret := -0.947368 // sell
								if( ad > 2990.32 )
									ret := -0.500000
						if( ad > 3626.61 )
							if( ad_mf <= 4175.89 )
								if( ema12 <= -0.011618 )
									ret := 0.342105
								if( ema12 > -0.011618 )
									ret := 0.654545
							if( ad_mf > 4175.89 )
								if( mf <= 0.218236 )
									ret := -0.059482
								if( mf > 0.218236 )
									ret := 0.166667
			if( ema12 > -0.002028 )
				if( tema <= 4.27466 )
					if( ad_mf <= -0.566946 )
						if( ema12 <= 0.002471 )
							if( ema13 <= -0.001191 )
								ret := -0.722222 // sell
							if( ema13 > -0.001191 )
								if( ema12 <= 0.001374 )
									ret := 0.000000
								if( ema12 > 0.001374 )
									ret := 0.400000
						if( ema12 > 0.002471 )
							if( ad_mf <= -0.695316 )
								ret := 0.000000
							if( ad_mf > -0.695316 )
								if( ema1 <= 1.306 )
									ret := -0.939394 // sell
								if( ema1 > 1.306 )
									ret := -0.490566
					if( ad_mf > -0.566946 )
						if( ad_mf <= -0.43492 )
							if( ema2 <= 1.42832 )
								if( ema1 <= 1.13114 )
									ret := 0.228571
								if( ema1 > 1.13114 )
									ret := 0.723077 // buy
							if( ema2 > 1.42832 )
								if( mf <= 0.503291 )
									ret := 0.326316
								if( mf > 0.503291 )
									ret := -0.449275
						if( ad_mf > -0.43492 )
							if( ema3 <= 1.40579 )
								if( ad_mf <= 7353.94 )
									ret := -0.181193
								if( ad_mf > 7353.94 )
									ret := -0.375000
							if( ema3 > 1.40579 )
								if( tema <= 1.43714 )
									ret := 0.242718
								if( tema > 1.43714 )
									ret := -0.137340
				if( tema > 4.27466 )
					if( ema12 <= 0.022962 )
						ret := -1.000000 // sell
					if( ema12 > 0.022962 )
						if( ema3 <= 4.1897 )
							if( tema <= 4.32167 )
								ret := -0.538462
							if( tema > 4.32167 )
								ret := -1.000000 // sell
						if( ema3 > 4.1897 )
							if( ema12 <= 0.040926 )
								if( ema13 <= 0.05102 )
									ret := -0.384615
								if( ema13 > 0.05102 )
									ret := -0.833333 // sell
							if( ema12 > 0.040926 )
								ret := 0.076923
		if( ema2 > 4.25918 )
			if( ema12 <= 0.009825 )
				if( tema <= 4.53845 )
					if( mf <= 0.233435 )
						if( ad <= 191.013 )
							if( ema1 <= 4.35308 )
								if( ad_mf <= 0.14546 )
									ret := 0.882353 // buy
								if( ad_mf > 0.14546 )
									ret := -0.866667 // sell
							if( ema1 > 4.35308 )
								if( ema2 <= 4.56366 )
									ret := 0.918367 // buy
								if( ema2 > 4.56366 )
									ret := 0.166667
						if( ad > 191.013 )
							if( tema <= 4.20515 )
								ret := -0.642857
							if( tema > 4.20515 )
								if( ema13 <= 0.012573 )
									ret := 0.136585
								if( ema13 > 0.012573 )
									ret := 1.000000 // buy
					if( mf > 0.233435 )
						if( ad <= 2412.9 )
							ret := -0.900000 // sell
						if( ad > 2412.9 )
							ret := -0.400000
				if( tema > 4.53845 )
					if( tema <= 85.9321 )
						if( ema13 <= -0.002651 )
							if( ad_mf <= 0.285776 )
								if( tema <= 6.32975 )
									ret := 0.220472
								if( tema > 6.32975 )
									ret := 0.036179
							if( ad_mf > 0.285776 )
								if( ema13 <= -0.013656 )
									ret := -0.023463
								if( ema13 > -0.013656 )
									ret := -0.170426
						if( ema13 > -0.002651 )
							if( ad_mf <= 77634.7 )
								if( mf <= 0.08023 )
									ret := 0.202450
								if( mf > 0.08023 )
									ret := 0.003295
							if( ad_mf > 77634.7 )
								if( mf <= -0.020937 )
									ret := -0.857143 // sell
								if( mf > -0.020937 )
									ret := -0.155340
					if( tema > 85.9321 )
						if( ad_mf <= 60132.3 )
							if( ad <= 45151.6 )
								if( ad_mf <= -0.281557 )
									ret := 0.375000
								if( ad_mf > -0.281557 )
									ret := -0.259887
							if( ad > 45151.6 )
								ret := -0.818182 // sell
						if( ad_mf > 60132.3 )
							ret := 0.137931
			if( ema12 > 0.009825 )
				if( ema2 <= 4.62634 )
					if( ema1 <= 4.62753 )
						if( ad_mf <= 467.992 )
							if( ad_mf <= 0.07377 )
								if( ad_mf <= -0.117995 )
									ret := -0.090909
								if( ad_mf > -0.117995 )
									ret := 0.448276
							if( ad_mf > 0.07377 )
								ret := 0.933333 // buy
						if( ad_mf > 467.992 )
							if( ad <= 59671.7 )
								if( ad <= 31521.5 )
									ret := -0.014493
								if( ad > 31521.5 )
									ret := -0.628571
							if( ad > 59671.7 )
								if( ad <= 127637 )
									ret := 0.757576 // buy
								if( ad > 127637 )
									ret := 0.000000
					if( ema1 > 4.62753 )
						if( ema1 <= 4.64774 )
							if( mf <= 0.15311 )
								ret := 1.000000 // buy
							if( mf > 0.15311 )
								ret := 0.777778 // buy
						if( ema1 > 4.64774 )
							ret := 0.545455
				if( ema2 > 4.62634 )
					if( ad_mf <= 21549.4 )
						if( tema <= 4.70552 )
							ret := 1.000000 // buy
						if( tema > 4.70552 )
							if( ema3 <= 4.64204 )
								if( ema1 <= 4.69778 )
									ret := -0.972222 // sell
								if( ema1 > 4.69778 )
									ret := -0.272727
							if( ema3 > 4.64204 )
								if( ema2 <= 4.69697 )
									ret := 0.764706 // buy
								if( ema2 > 4.69697 )
									ret := -0.147823
					if( ad_mf > 21549.4 )
						if( ad <= 323032 )
							if( ema13 <= 0.57555 )
								if( mf <= -0.143893 )
									ret := -0.291829
								if( mf > -0.143893 )
									ret := -0.057199
							if( ema13 > 0.57555 )
								if( ema12 <= 1.65311 )
									ret := 0.032852
								if( ema12 > 1.65311 )
									ret := -0.627907
						if( ad > 323032 )
							if( mf <= 0.473362 )
								if( ema3 <= 33.2599 )
									ret := 0.579882
								if( ema3 > 33.2599 )
									ret := -0.162162
							if( mf > 0.473362 )
								if( ema12 <= 0.852852 )
									ret := 0.006135
								if( ema12 > 0.852852 )
									ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_APPS_15Min_bb7af45b(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


