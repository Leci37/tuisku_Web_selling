//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: DOGEUSDT_15Min_2CS0_aa4e4bf6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_2CS0_aa4e4bf6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_aa4e4bf6(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 48.3671 )
		if( rsi1 <= 42.5432 )
			if( mf <= -0.044437 )
				if( smoothD_d <= 15.4772 )
					if( ad <= -6.88057e+07 )
						if( smoothK_k <= 3.90729 )
							if( smoothK_k <= -0.429629 )
								ret := 0.866667 // buy
							if( smoothK_k > -0.429629 )
								ret := 0.375000
						if( smoothK_k > 3.90729 )
							if( d_k <= -3.80767 )
								ret := -0.523810
							if( d_k > -3.80767 )
								ret := 0.350000
					if( ad > -6.88057e+07 )
						if( rsi1 <= 39.2444 )
							if( rsi1 <= 21.038 )
								if( smoothK_k <= -2.99002 )
									ret := -0.261745
								if( smoothK_k > -2.99002 )
									ret := -0.527403
							if( rsi1 > 21.038 )
								if( k <= 5.33952 )
									ret := -0.219773
								if( k > 5.33952 )
									ret := -0.341272
						if( rsi1 > 39.2444 )
							if( smoothD_d <= 4.85903 )
								if( smoothD_d <= 2.95123 )
									ret := -0.156250
								if( smoothD_d > 2.95123 )
									ret := -0.384615
							if( smoothD_d > 4.85903 )
								if( smoothK_k <= 15.7174 )
									ret := 0.119565
								if( smoothK_k > 15.7174 )
									ret := -0.074380
				if( smoothD_d > 15.4772 )
					if( ad <= -1.46195e+07 )
						if( rsi1 <= 29.9165 )
							if( d_k <= -11.1248 )
								ret := -0.500000
							if( d_k > -11.1248 )
								if( mf <= -0.147828 )
									ret := 0.588889
								if( mf > -0.147828 )
									ret := 0.179487
						if( rsi1 > 29.9165 )
							if( ad_mf <= -2.15095e+07 )
								if( d <= 32.691 )
									ret := 0.014085
								if( d > 32.691 )
									ret := 0.497653
							if( ad_mf > -2.15095e+07 )
								if( k <= 14.8458 )
									ret := 0.187500
								if( k > 14.8458 )
									ret := -0.219388
					if( ad > -1.46195e+07 )
						if( ad_mf <= -4.01239e+06 )
							if( d <= 48.8325 )
								if( ad_mf <= -4.16591e+06 )
									ret := -0.147018
								if( ad_mf > -4.16591e+06 )
									ret := 0.403509
							if( d > 48.8325 )
								if( mf <= -0.096566 )
									ret := 0.231707
								if( mf > -0.096566 )
									ret := 0.620690
						if( ad_mf > -4.01239e+06 )
							if( mf <= -0.137712 )
								if( ad_mf <= 3.12211e+07 )
									ret := -0.153305
								if( ad_mf > 3.12211e+07 )
									ret := 0.285714
							if( mf > -0.137712 )
								if( d_k <= 6.30819 )
									ret := -0.254078
								if( d_k > 6.30819 )
									ret := -0.385106
			if( mf > -0.044437 )
				if( smoothK_k <= 19.2608 )
					if( ad <= 7.10824e+07 )
						if( smoothK_k <= -2.99977 )
							if( ad <= 5.67521e+06 )
								if( smoothD_d <= -2.49958 )
									ret := -0.429825
								if( smoothD_d > -2.49958 )
									ret := -0.227630
							if( ad > 5.67521e+06 )
								if( ad <= 2.09788e+07 )
									ret := -0.496063
								if( ad > 2.09788e+07 )
									ret := -0.904762 // sell
						if( smoothK_k > -2.99977 )
							if( d <= 27.5685 )
								if( rsi1 <= 28.3681 )
									ret := -0.640770
								if( rsi1 > 28.3681 )
									ret := -0.488588
							if( d > 27.5685 )
								if( d_k <= 14.0228 )
									ret := -0.545045
								if( d_k > 14.0228 )
									ret := -0.325770
					if( ad > 7.10824e+07 )
						if( rsi1 <= 31.7035 )
							if( ad_mf <= 1.19043e+08 )
								ret := 0.384615
							if( ad_mf > 1.19043e+08 )
								ret := 0.900000 // buy
						if( rsi1 > 31.7035 )
							if( k <= 17.8572 )
								ret := -0.388889
							if( k > 17.8572 )
								ret := 0.600000
				if( smoothK_k > 19.2608 )
					if( ad_mf <= -1.92413e+07 )
						if( smoothK_k <= 23.6722 )
							if( ad_mf <= -3.10021e+07 )
								if( d <= 26.9481 )
									ret := -0.500000
								if( d > 26.9481 )
									ret := 0.166667
							if( ad_mf > -3.10021e+07 )
								if( k <= 24.3391 )
									ret := -0.333333
								if( k > 24.3391 )
									ret := -0.928571 // sell
						if( smoothK_k > 23.6722 )
							if( k <= 39.7163 )
								if( rsi1 <= 42.0579 )
									ret := 0.336000
								if( rsi1 > 42.0579 )
									ret := -1.000000 // sell
							if( k > 39.7163 )
								if( smoothK_k <= 38.8518 )
									ret := -0.733333 // sell
								if( smoothK_k > 38.8518 )
									ret := 0.108108
					if( ad_mf > -1.92413e+07 )
						if( rsi1 <= 32.8652 )
							if( ad <= 3.02361e+07 )
								if( ad_mf <= 7.56120e+06 )
									ret := -0.487085
								if( ad_mf > 7.56120e+06 )
									ret := -0.662983
							if( ad > 3.02361e+07 )
								if( rsi1 <= 30.2371 )
									ret := 0.340909
								if( rsi1 > 30.2371 )
									ret := -0.777778 // sell
						if( rsi1 > 32.8652 )
							if( mf <= 0.080508 )
								if( smoothK_k <= 36.4728 )
									ret := -0.338586
								if( smoothK_k > 36.4728 )
									ret := -0.203242
							if( mf > 0.080508 )
								if( k <= 39.7796 )
									ret := -0.511156
								if( k > 39.7796 )
									ret := -0.348315
		if( rsi1 > 42.5432 )
			if( ad_mf <= 4.11204e+06 )
				if( d <= 23.2625 )
					if( mf <= 0.059592 )
						if( smoothD_d <= 6.27112 )
							if( ad_mf <= -2.24194e+07 )
								if( mf <= 0.005835 )
									ret := -0.225000
								if( mf > 0.005835 )
									ret := -0.903846 // sell
							if( ad_mf > -2.24194e+07 )
								if( k <= 9.1732 )
									ret := -0.035656
								if( k > 9.1732 )
									ret := -0.189394
						if( smoothD_d > 6.27112 )
							if( rsi1 <= 50.5598 )
								if( ad <= 281659 )
									ret := -0.028343
								if( ad > 281659 )
									ret := -0.198068
							if( rsi1 > 50.5598 )
								if( rsi1 <= 64.526 )
									ret := 0.085354
								if( rsi1 > 64.526 )
									ret := 0.403226
					if( mf > 0.059592 )
						if( ad_mf <= -6.30461e+06 )
							if( ad_mf <= -5.0011e+07 )
								if( ad_mf <= -5.07751e+07 )
									ret := -0.423729
								if( ad_mf > -5.07751e+07 )
									ret := -1.000000 // sell
							if( ad_mf > -5.0011e+07 )
								if( ad <= -8.57233e+06 )
									ret := 0.007022
								if( ad > -8.57233e+06 )
									ret := 0.242268
						if( ad_mf > -6.30461e+06 )
							if( k <= 1.65792 )
								if( mf <= 0.216229 )
									ret := -0.025253
								if( mf > 0.216229 )
									ret := -0.186667
							if( k > 1.65792 )
								if( ad <= -4.17288e+06 )
									ret := -0.407534
								if( ad > -4.17288e+06 )
									ret := -0.178428
				if( d > 23.2625 )
					if( mf <= -0.073569 )
						if( d <= 50.865 )
							if( k <= 43.1596 )
								if( smoothD_d <= 28.6643 )
									ret := 0.248148
								if( smoothD_d > 28.6643 )
									ret := 0.112828
							if( k > 43.1596 )
								if( d <= 28.8673 )
									ret := -0.125000
								if( d > 28.8673 )
									ret := 0.443077
						if( d > 50.865 )
							if( rsi1 <= 49.6683 )
								if( d <= 54.0336 )
									ret := -0.564103
								if( d > 54.0336 )
									ret := -0.102804
							if( rsi1 > 49.6683 )
								if( smoothK_k <= 41.661 )
									ret := 0.129870
								if( smoothK_k > 41.661 )
									ret := 0.377049
					if( mf > -0.073569 )
						if( ad <= -814313 )
							if( ad <= -2.17589e+07 )
								if( k <= 35.324 )
									ret := -0.272237
								if( k > 35.324 )
									ret := -0.005063
							if( ad > -2.17589e+07 )
								if( d_k <= -2.88911 )
									ret := 0.246445
								if( d_k > -2.88911 )
									ret := 0.062331
						if( ad > -814313 )
							if( mf <= -0.059289 )
								if( ad_mf <= 2.16556e+06 )
									ret := -0.042735
								if( ad_mf > 2.16556e+06 )
									ret := -0.573770
							if( mf > -0.059289 )
								if( rsi1 <= 53.9744 )
									ret := -0.121404
								if( rsi1 > 53.9744 )
									ret := 0.112033
			if( ad_mf > 4.11204e+06 )
				if( k <= 28.3812 )
					if( rsi1 <= 56.3534 )
						if( mf <= 0.225671 )
							if( d_k <= 21.1839 )
								if( mf <= -0.067017 )
									ret := -0.102703
								if( mf > -0.067017 )
									ret := -0.416845
							if( d_k > 21.1839 )
								if( rsi1 <= 48.0893 )
									ret := -0.133333
								if( rsi1 > 48.0893 )
									ret := 0.292683
						if( mf > 0.225671 )
							if( d_k <= 16.3708 )
								if( smoothD_d <= -1.32406 )
									ret := -0.125000
								if( smoothD_d > -1.32406 )
									ret := -0.821138 // sell
							if( d_k > 16.3708 )
								if( rsi1 <= 46.0518 )
									ret := -0.857143 // sell
								if( rsi1 > 46.0518 )
									ret := -0.250000
					if( rsi1 > 56.3534 )
						if( ad_mf <= 2.46532e+07 )
							if( ad <= 2.04889e+07 )
								if( smoothD_d <= 41.575 )
									ret := -0.118902
								if( smoothD_d > 41.575 )
									ret := 0.625000
							if( ad > 2.04889e+07 )
								if( mf <= 0.198132 )
									ret := 0.875000 // buy
								if( mf > 0.198132 )
									ret := 0.062500
						if( ad_mf > 2.46532e+07 )
							if( ad <= 3.2248e+07 )
								if( d_k <= 2.11134 )
									ret := -0.766667 // sell
								if( d_k > 2.11134 )
									ret := -1.000000 // sell
							if( ad > 3.2248e+07 )
								if( ad <= 1.17617e+08 )
									ret := -0.247312
								if( ad > 1.17617e+08 )
									ret := -0.952381 // sell
				if( k > 28.3812 )
					if( smoothK_k <= 34.3307 )
						if( mf <= -0.011307 )
							if( ad_mf <= 7.12272e+06 )
								if( smoothD_d <= 20.5449 )
									ret := 0.684211
								if( smoothD_d > 20.5449 )
									ret := 0.160494
							if( ad_mf > 7.12272e+06 )
								if( smoothK_k <= 28.2166 )
									ret := -0.326531
								if( smoothK_k > 28.2166 )
									ret := 0.027273
						if( mf > -0.011307 )
							if( d_k <= 22.5686 )
								if( rsi1 <= 54.3963 )
									ret := -0.394933
								if( rsi1 > 54.3963 )
									ret := -0.109870
							if( d_k > 22.5686 )
								if( ad <= 1.28476e+07 )
									ret := 0.447368
								if( ad > 1.28476e+07 )
									ret := -0.222222
					if( smoothK_k > 34.3307 )
						if( smoothD_d <= 42.9624 )
							if( d <= 45.6922 )
								if( smoothK_k <= 34.389 )
									ret := 0.866667 // buy
								if( smoothK_k > 34.389 )
									ret := 0.000876
							if( d > 45.6922 )
								if( d <= 45.8012 )
									ret := 0.769231 // buy
								if( d > 45.8012 )
									ret := 0.266667
						if( smoothD_d > 42.9624 )
							if( rsi1 <= 45.6821 )
								if( mf <= -0.031004 )
									ret := 0.000000
								if( mf > -0.031004 )
									ret := -0.659091
							if( rsi1 > 45.6821 )
								if( d <= 57.1067 )
									ret := -0.223529
								if( d > 57.1067 )
									ret := 0.031873
	if( k > 48.3671 )
		if( rsi1 <= 57.716 )
			if( k <= 77.5098 )
				if( ad <= -4.63765e+06 )
					if( ad <= -9.00353e+07 )
						if( smoothK_k <= 50.074 )
							ret := 0.384615
						if( smoothK_k > 50.074 )
							if( smoothD_d <= 63.4744 )
								ret := 1.000000 // buy
							if( smoothD_d > 63.4744 )
								ret := 0.857143 // buy
					if( ad > -9.00353e+07 )
						if( d_k <= -22.3552 )
							if( d_k <= -28.0905 )
								ret := 0.368421
							if( d_k > -28.0905 )
								if( ad_mf <= -5.93903e+06 )
									ret := -0.477778
								if( ad_mf > -5.93903e+06 )
									ret := 0.250000
						if( d_k > -22.3552 )
							if( smoothK_k <= 59.7708 )
								if( d_k <= 3.43779 )
									ret := 0.211217
								if( d_k > 3.43779 )
									ret := 0.043150
							if( smoothK_k > 59.7708 )
								if( d_k <= -10.9449 )
									ret := 0.540107
								if( d_k > -10.9449 )
									ret := 0.215859
				if( ad > -4.63765e+06 )
					if( rsi1 <= 47.9215 )
						if( d_k <= 2.9594 )
							if( mf <= 0.098872 )
								if( mf <= -0.161129 )
									ret := 0.134251
								if( mf > -0.161129 )
									ret := -0.043900
							if( mf > 0.098872 )
								if( ad <= 5.21838e+06 )
									ret := -0.218421
								if( ad > 5.21838e+06 )
									ret := -0.594286
						if( d_k > 2.9594 )
							if( smoothD_d <= 70.7396 )
								if( ad <= 3.78855e+07 )
									ret := -0.249599
								if( ad > 3.78855e+07 )
									ret := -0.875000 // sell
							if( smoothD_d > 70.7396 )
								if( ad_mf <= -2.40675e+06 )
									ret := 0.156716
								if( ad_mf > -2.40675e+06 )
									ret := -0.186649
					if( rsi1 > 47.9215 )
						if( mf <= 0.050839 )
							if( d <= 37.1332 )
								if( ad_mf <= 1.44756e+07 )
									ret := -0.086207
								if( ad_mf > 1.44756e+07 )
									ret := -0.739130 // sell
							if( d > 37.1332 )
								if( smoothD_d <= 68.5213 )
									ret := 0.155832
								if( smoothD_d > 68.5213 )
									ret := 0.048878
						if( mf > 0.050839 )
							if( smoothK_k <= 61.8292 )
								if( k <= 51.6527 )
									ret := 0.074830
								if( k > 51.6527 )
									ret := -0.133885
							if( smoothK_k > 61.8292 )
								if( smoothK_k <= 61.9296 )
									ret := 0.800000 // buy
								if( smoothK_k > 61.9296 )
									ret := 0.043137
			if( k > 77.5098 )
				if( rsi1 <= 39.0432 )
					if( d <= 80.3277 )
						if( ad_mf <= -6.0993e+06 )
							if( k <= 81.0173 )
								if( smoothD_d <= 68.8727 )
									ret := 0.200000
								if( smoothD_d > 68.8727 )
									ret := 0.565217
							if( k > 81.0173 )
								if( ad_mf <= -1.6563e+07 )
									ret := -0.193548
								if( ad_mf > -1.6563e+07 )
									ret := 0.296296
						if( ad_mf > -6.0993e+06 )
							if( k <= 85.4135 )
								if( ad_mf <= 2.96373e+06 )
									ret := -0.482014
								if( ad_mf > 2.96373e+06 )
									ret := -0.141176
							if( k > 85.4135 )
								if( mf <= 0.061085 )
									ret := 0.047059
								if( mf > 0.061085 )
									ret := -0.545455
					if( d > 80.3277 )
						if( ad <= -2.46287e+07 )
							if( d_k <= 2.6467 )
								ret := 0.437500
							if( d_k > 2.6467 )
								ret := 1.000000 // buy
						if( ad > -2.46287e+07 )
							if( ad <= 2.47363e+07 )
								if( ad <= 1.92097e+07 )
									ret := 0.082126
								if( ad > 1.92097e+07 )
									ret := -0.666667
							if( ad > 2.47363e+07 )
								if( mf <= -0.059394 )
									ret := 0.000000
								if( mf > -0.059394 )
									ret := 0.928571 // buy
				if( rsi1 > 39.0432 )
					if( ad_mf <= -2.67252e+06 )
						if( mf <= 0.030803 )
							if( rsi1 <= 55.005 )
								if( ad <= -1.34066e+07 )
									ret := 0.530568
								if( ad > -1.34066e+07 )
									ret := 0.368893
							if( rsi1 > 55.005 )
								if( mf <= -0.252807 )
									ret := -0.142857
								if( mf > -0.252807 )
									ret := 0.617414
						if( mf > 0.030803 )
							if( rsi1 <= 55.8117 )
								if( smoothD_d <= 70.0976 )
									ret := 0.486111
								if( smoothD_d > 70.0976 )
									ret := 0.140044
							if( rsi1 > 55.8117 )
								if( mf <= 0.038243 )
									ret := -0.285714
								if( mf > 0.038243 )
									ret := 0.536842
					if( ad_mf > -2.67252e+06 )
						if( mf <= 0.076131 )
							if( d_k <= -15.9214 )
								if( ad_mf <= 8.84908e+06 )
									ret := -0.007533
								if( ad_mf > 8.84908e+06 )
									ret := 0.308411
							if( d_k > -15.9214 )
								if( ad <= 5.07246e+06 )
									ret := 0.192320
								if( ad > 5.07246e+06 )
									ret := 0.351506
						if( mf > 0.076131 )
							if( k <= 91.4849 )
								if( rsi1 <= 57.6043 )
									ret := 0.011435
								if( rsi1 > 57.6043 )
									ret := -0.785714 // sell
							if( k > 91.4849 )
								if( ad <= -363645 )
									ret := 0.401575
								if( ad > -363645 )
									ret := 0.069333
		if( rsi1 > 57.716 )
			if( k <= 78.8028 )
				if( ad <= 1.7586e+07 )
					if( ad_mf <= -1.51002e+07 )
						if( ad_mf <= -1.55924e+07 )
							if( d_k <= 2.73537 )
								if( mf <= -0.116733 )
									ret := 0.875000 // buy
								if( mf > -0.116733 )
									ret := 0.165450
							if( d_k > 2.73537 )
								if( d_k <= 12.809 )
									ret := -0.160458
								if( d_k > 12.809 )
									ret := 0.375000
						if( ad_mf > -1.55924e+07 )
							if( smoothK_k <= 55.7791 )
								ret := 0.000000
							if( smoothK_k > 55.7791 )
								if( smoothD_d <= 68.278 )
									ret := -1.000000 // sell
								if( smoothD_d > 68.278 )
									ret := -0.722222 // sell
					if( ad_mf > -1.51002e+07 )
						if( mf <= 0.175449 )
							if( ad <= -518101 )
								if( ad <= -4.52121e+06 )
									ret := 0.476868
								if( ad > -4.52121e+06 )
									ret := 0.363869
							if( ad > -518101 )
								if( smoothK_k <= 63.3167 )
									ret := 0.197268
								if( smoothK_k > 63.3167 )
									ret := 0.334773
						if( mf > 0.175449 )
							if( d_k <= 15.2155 )
								if( ad_mf <= 5.76463e+06 )
									ret := 0.193660
								if( ad_mf > 5.76463e+06 )
									ret := -0.019678
							if( d_k > 15.2155 )
								if( mf <= 0.182161 )
									ret := -0.500000
								if( mf > 0.182161 )
									ret := 0.577586
				if( ad > 1.7586e+07 )
					if( smoothD_d <= 73.6499 )
						if( mf <= 0.04904 )
							if( k <= 55.3352 )
								if( ad <= 1.9463e+07 )
									ret := 0.304348
								if( ad > 1.9463e+07 )
									ret := 0.903226 // buy
							if( k > 55.3352 )
								if( ad_mf <= 2.02603e+07 )
									ret := -0.172414
								if( ad_mf > 2.02603e+07 )
									ret := 0.369748
						if( mf > 0.04904 )
							if( d <= 51.8315 )
								if( smoothK_k <= 54.2704 )
									ret := -0.275229
								if( smoothK_k > 54.2704 )
									ret := 0.477612
							if( d > 51.8315 )
								if( ad <= 4.51271e+07 )
									ret := -0.141002
								if( ad > 4.51271e+07 )
									ret := -0.417266
					if( smoothD_d > 73.6499 )
						if( smoothK_k <= 74.7808 )
							if( mf <= 0.295326 )
								if( smoothD_d <= 81.7604 )
									ret := 0.225806
								if( smoothD_d > 81.7604 )
									ret := 0.904762 // buy
							if( mf > 0.295326 )
								if( d <= 79.8646 )
									ret := 1.000000 // buy
								if( d > 79.8646 )
									ret := 0.611111
						if( smoothK_k > 74.7808 )
							if( d_k <= 2.39701 )
								ret := -0.818182 // sell
							if( d_k > 2.39701 )
								if( rsi1 <= 68.7847 )
									ret := -0.400000
								if( rsi1 > 68.7847 )
									ret := 0.736842 // buy
			if( k > 78.8028 )
				if( ad_mf <= 4.24716e+07 )
					if( rsi1 <= 66.0498 )
						if( mf <= 0.006388 )
							if( ad_mf <= -2.09826e+06 )
								if( k <= 97.1255 )
									ret := 0.510532
								if( k > 97.1255 )
									ret := 0.704403 // buy
							if( ad_mf > -2.09826e+06 )
								if( rsi1 <= 63.1934 )
									ret := 0.318660
								if( rsi1 > 63.1934 )
									ret := 0.447633
						if( mf > 0.006388 )
							if( d_k <= -5.84811 )
								if( ad <= -3.98583e+07 )
									ret := -0.450000
								if( ad > -3.98583e+07 )
									ret := 0.210158
							if( d_k > -5.84811 )
								if( mf <= 0.171081 )
									ret := 0.331966
								if( mf > 0.171081 )
									ret := 0.174632
					if( rsi1 > 66.0498 )
						if( rsi1 <= 77.6166 )
							if( mf <= 0.139641 )
								if( ad <= 3.1227e+07 )
									ret := 0.495130
								if( ad > 3.1227e+07 )
									ret := 0.840000 // buy
							if( mf > 0.139641 )
								if( ad <= -1.69255e+07 )
									ret := -0.113924
								if( ad > -1.69255e+07 )
									ret := 0.304389
						if( rsi1 > 77.6166 )
							if( ad <= 2.35484e+07 )
								if( mf <= 0.202053 )
									ret := 0.605416
								if( mf > 0.202053 )
									ret := 0.420472
							if( ad > 2.35484e+07 )
								if( mf <= 0.106463 )
									ret := 0.830189 // buy
								if( mf > 0.106463 )
									ret := 0.031250
				if( ad_mf > 4.24716e+07 )
					if( d <= 94.5393 )
						if( mf <= 0.490969 )
							if( ad <= 4.34735e+07 )
								ret := -0.928571 // sell
							if( ad > 4.34735e+07 )
								if( smoothK_k <= 93.8986 )
									ret := 0.175824
								if( smoothK_k > 93.8986 )
									ret := -0.347826
						if( mf > 0.490969 )
							if( mf <= 0.550775 )
								ret := -0.900000 // sell
							if( mf > 0.550775 )
								ret := -0.692308
					if( d > 94.5393 )
						if( rsi1 <= 85.7704 )
							if( d <= 95.221 )
								ret := 1.000000 // buy
							if( d > 95.221 )
								if( mf <= 0.075392 )
									ret := 0.937500 // buy
								if( mf > 0.075392 )
									ret := 0.461538
						if( rsi1 > 85.7704 )
							if( smoothK_k <= 96.2199 )
								ret := 0.473684
							if( smoothK_k > 96.2199 )
								if( d <= 99.0042 )
									ret := -0.444444
								if( d > 99.0042 )
									ret := 0.250000
	
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_aa4e4bf6(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


