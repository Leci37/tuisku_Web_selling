//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AAVEUSDT_15Min_2CS0_b128a280 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_2CS0_b128a280", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_b128a280(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 40.1089 )
		if( d <= 5.6679 )
			if( mf <= -0.166085 )
				if( rsi1 <= 33.6537 )
					if( ad_mf <= -3407.49 )
						if( mf <= -0.437499 )
							if( d <= 0.948788 )
								ret := 0.529412
							if( d > 0.948788 )
								ret := -0.250000
						if( mf > -0.437499 )
							if( d_k <= 2.20758 )
								if( d <= 2.43436 )
									ret := -0.585366
								if( d > 2.43436 )
									ret := -0.838095 // sell
							if( d_k > 2.20758 )
								if( ad_mf <= -6245.68 )
									ret := -0.222222
								if( ad_mf > -6245.68 )
									ret := 0.636364
					if( ad_mf > -3407.49 )
						if( d <= 2.07731 )
							if( d <= 0.223778 )
								if( d_k <= -0.024187 )
									ret := 0.333333
								if( d_k > -0.024187 )
									ret := -0.256637
							if( d > 0.223778 )
								if( smoothK_k <= -2.34002 )
									ret := -0.431034
								if( smoothK_k > -2.34002 )
									ret := -0.617910
						if( d > 2.07731 )
							if( d_k <= -5.76003 )
								if( k <= 10.4372 )
									ret := -0.806452 // sell
								if( k > 10.4372 )
									ret := -0.410256
							if( d_k > -5.76003 )
								if( mf <= -0.309576 )
									ret := -0.254902
								if( mf > -0.309576 )
									ret := -0.082910
				if( rsi1 > 33.6537 )
					if( rsi1 <= 38.1559 )
						if( ad <= 1820.43 )
							if( mf <= -0.218081 )
								if( rsi1 <= 37.3775 )
									ret := -0.054054
								if( rsi1 > 37.3775 )
									ret := 0.111111
							if( mf > -0.218081 )
								if( d_k <= 0.469505 )
									ret := 0.136364
								if( d_k > 0.469505 )
									ret := 0.611111
						if( ad > 1820.43 )
							ret := 0.833333 // buy
					if( rsi1 > 38.1559 )
						if( d_k <= -1.02045 )
							if( rsi1 <= 44.2561 )
								if( smoothD_d <= 0.765169 )
									ret := -0.166667
								if( smoothD_d > 0.765169 )
									ret := -0.692308
							if( rsi1 > 44.2561 )
								if( ad_mf <= 0.296179 )
									ret := 0.266667
								if( ad_mf > 0.296179 )
									ret := -0.083333
						if( d_k > -1.02045 )
							if( ad_mf <= -78.7712 )
								if( ad_mf <= -193.902 )
									ret := 0.129032
								if( ad_mf > -193.902 )
									ret := 0.642857
							if( ad_mf > -78.7712 )
								if( smoothK_k <= 0.508238 )
									ret := -0.181818
								if( smoothK_k > 0.508238 )
									ret := 0.500000
			if( mf > -0.166085 )
				if( rsi1 <= 38.4044 )
					if( smoothD_d <= -0.28097 )
						if( d_k <= 0.377379 )
							if( mf <= -0.004746 )
								if( ad_mf <= -302.235 )
									ret := -0.666667
								if( ad_mf > -302.235 )
									ret := -0.420949
							if( mf > -0.004746 )
								if( ad_mf <= 3345.28 )
									ret := -0.683636
								if( ad_mf > 3345.28 )
									ret := -0.190476
						if( d_k > 0.377379 )
							if( rsi1 <= 33.171 )
								if( smoothK_k <= -2.99753 )
									ret := -0.719160 // sell
								if( smoothK_k > -2.99753 )
									ret := -0.859127 // sell
							if( rsi1 > 33.171 )
								if( d_k <= 0.620169 )
									ret := -0.840000 // sell
								if( d_k > 0.620169 )
									ret := -0.461538
					if( smoothD_d > -0.28097 )
						if( ad_mf <= -70.6543 )
							if( mf <= -0.069546 )
								if( k <= 6.60603 )
									ret := -0.229592
								if( k > 6.60603 )
									ret := -0.579310
							if( mf > -0.069546 )
								if( rsi1 <= 23.0699 )
									ret := -0.787611 // sell
								if( rsi1 > 23.0699 )
									ret := -0.488662
						if( ad_mf > -70.6543 )
							if( mf <= -0.01813 )
								if( ad_mf <= 2490.57 )
									ret := -0.477396
								if( ad_mf > 2490.57 )
									ret := -0.815385 // sell
							if( mf > -0.01813 )
								if( ad <= 426.227 )
									ret := -0.630400
								if( ad > 426.227 )
									ret := -0.825054 // sell
				if( rsi1 > 38.4044 )
					if( ad_mf <= 734.56 )
						if( rsi1 <= 51.0452 )
							if( d <= 4.62746 )
								if( smoothD_d <= -2.93087 )
									ret := -0.109589
								if( smoothD_d > -2.93087 )
									ret := -0.376432
							if( d > 4.62746 )
								if( smoothD_d <= 2.63999 )
									ret := -0.127877
								if( smoothD_d > 2.63999 )
									ret := -1.000000 // sell
						if( rsi1 > 51.0452 )
							if( ad_mf <= 429.675 )
								if( mf <= 0.140865 )
									ret := 0.131222
								if( mf > 0.140865 )
									ret := -0.084211
							if( ad_mf > 429.675 )
								if( ad <= 647.342 )
									ret := -0.666667
								if( ad > 647.342 )
									ret := 0.000000
					if( ad_mf > 734.56 )
						if( ad <= 2774.4 )
							if( ad <= 2337.25 )
								if( rsi1 <= 48.2082 )
									ret := -0.715867 // sell
								if( rsi1 > 48.2082 )
									ret := -0.522222
							if( ad > 2337.25 )
								if( mf <= 0.036453 )
									ret := 0.833333 // buy
								if( mf > 0.036453 )
									ret := -0.428571
						if( ad > 2774.4 )
							if( mf <= -0.067233 )
								ret := 0.000000
							if( mf > -0.067233 )
								if( smoothD_d <= 0.322077 )
									ret := -0.746667 // sell
								if( smoothD_d > 0.322077 )
									ret := -0.906667 // sell
		if( d > 5.6679 )
			if( ad_mf <= 0.443363 )
				if( rsi1 <= 50.7228 )
					if( smoothK_k <= 23.3517 )
						if( mf <= 0.001029 )
							if( ad_mf <= 0.047895 )
								if( rsi1 <= 34.4723 )
									ret := -0.262957
								if( rsi1 > 34.4723 )
									ret := -0.060364
							if( ad_mf > 0.047895 )
								if( d <= 7.07543 )
									ret := -0.409836
								if( d > 7.07543 )
									ret := 0.150592
						if( mf > 0.001029 )
							if( rsi1 <= 36.2587 )
								if( ad <= -3172.4 )
									ret := -0.950820 // sell
								if( ad > -3172.4 )
									ret := -0.472973
							if( rsi1 > 36.2587 )
								if( smoothK_k <= 19.1705 )
									ret := -0.272197
								if( smoothK_k > 19.1705 )
									ret := 0.002174
					if( smoothK_k > 23.3517 )
						if( ad_mf <= -724.041 )
							if( smoothD_d <= 49.166 )
								if( d_k <= -13.1515 )
									ret := -0.276423
								if( d_k > -13.1515 )
									ret := 0.120117
							if( smoothD_d > 49.166 )
								if( ad_mf <= -1303.03 )
									ret := -0.163265
								if( ad_mf > -1303.03 )
									ret := -0.616667
						if( ad_mf > -724.041 )
							if( ad <= -462.464 )
								if( rsi1 <= 37.9271 )
									ret := -0.421053
								if( rsi1 > 37.9271 )
									ret := -0.037736
							if( ad > -462.464 )
								if( ad <= -438.914 )
									ret := 0.500000
								if( ad > -438.914 )
									ret := -0.121504
				if( rsi1 > 50.7228 )
					if( ad <= -497.205 )
						if( rsi1 <= 56.9163 )
							if( d <= 17.8029 )
								if( d_k <= 3.13293 )
									ret := -0.276680
								if( d_k > 3.13293 )
									ret := 0.142857
							if( d > 17.8029 )
								if( smoothD_d <= 26.5319 )
									ret := 0.400000
								if( smoothD_d > 26.5319 )
									ret := 0.041667
						if( rsi1 > 56.9163 )
							if( smoothD_d <= 18.4671 )
								if( ad_mf <= -3377.62 )
									ret := -0.035714
								if( ad_mf > -3377.62 )
									ret := 0.474619
							if( smoothD_d > 18.4671 )
								if( k <= 24.5966 )
									ret := -0.095477
								if( k > 24.5966 )
									ret := 0.187625
					if( ad > -497.205 )
						if( ad <= -474.255 )
							if( smoothD_d <= 15.059 )
								if( smoothK_k <= 2.88883 )
									ret := -0.800000 // sell
								if( smoothK_k > 2.88883 )
									ret := -1.000000 // sell
							if( smoothD_d > 15.059 )
								if( rsi1 <= 61.5499 )
									ret := -0.380952
								if( rsi1 > 61.5499 )
									ret := -0.700000 // sell
						if( ad > -474.255 )
							if( k <= 38.1322 )
								if( rsi1 <= 69.2964 )
									ret := 0.043052
								if( rsi1 > 69.2964 )
									ret := 0.659794
							if( k > 38.1322 )
								if( ad <= -11.8762 )
									ret := 0.030000
								if( ad > -11.8762 )
									ret := -0.687500
			if( ad_mf > 0.443363 )
				if( smoothK_k <= 13.42 )
					if( rsi1 <= 38.8883 )
						if( d_k <= 4.85327 )
							if( mf <= -0.205552 )
								if( rsi1 <= 24.6367 )
									ret := -0.319149
								if( rsi1 > 24.6367 )
									ret := 0.111765
							if( mf > -0.205552 )
								if( d <= 14.1937 )
									ret := -0.464371
								if( d > 14.1937 )
									ret := -0.217877
						if( d_k > 4.85327 )
							if( mf <= -0.058315 )
								if( ad <= 743.502 )
									ret := -0.504425
								if( ad > 743.502 )
									ret := -0.147929
							if( mf > -0.058315 )
								if( d_k <= 5.8923 )
									ret := -0.761194 // sell
								if( d_k > 5.8923 )
									ret := -0.595133
					if( rsi1 > 38.8883 )
						if( ad <= 628.15 )
							if( rsi1 <= 55.4827 )
								if( d_k <= 12.0709 )
									ret := -0.106858
								if( d_k > 12.0709 )
									ret := -0.358056
							if( rsi1 > 55.4827 )
								if( ad_mf <= 36.9984 )
									ret := -0.800000 // sell
								if( ad_mf > 36.9984 )
									ret := 0.096875
						if( ad > 628.15 )
							if( d_k <= 1.62716 )
								if( ad <= 3323.05 )
									ret := -0.161002
								if( ad > 3323.05 )
									ret := -0.670103
							if( d_k > 1.62716 )
								if( ad <= 1188.96 )
									ret := -0.320755
								if( ad > 1188.96 )
									ret := -0.575866
				if( smoothK_k > 13.42 )
					if( rsi1 <= 49.9519 )
						if( d_k <= 6.35818 )
							if( ad <= 141.802 )
								if( d <= 24.4646 )
									ret := -0.458498
								if( d > 24.4646 )
									ret := -0.116592
							if( ad > 141.802 )
								if( mf <= -0.078241 )
									ret := -0.049118
								if( mf > -0.078241 )
									ret := -0.258192
						if( d_k > 6.35818 )
							if( d_k <= 12.9301 )
								if( rsi1 <= 42.7856 )
									ret := -0.488739
								if( rsi1 > 42.7856 )
									ret := -0.271698
							if( d_k > 12.9301 )
								if( rsi1 <= 38.6945 )
									ret := -0.660088
								if( rsi1 > 38.6945 )
									ret := -0.456522
					if( rsi1 > 49.9519 )
						if( rsi1 <= 69.3069 )
							if( mf <= 0.111544 )
								if( rsi1 <= 58.0427 )
									ret := -0.075317
								if( rsi1 > 58.0427 )
									ret := 0.119929
							if( mf > 0.111544 )
								if( d <= 30.4621 )
									ret := -0.086158
								if( d > 30.4621 )
									ret := -0.287942
						if( rsi1 > 69.3069 )
							if( ad <= 7279.27 )
								if( ad <= 270.715 )
									ret := 0.681818
								if( ad > 270.715 )
									ret := 0.248927
							if( ad > 7279.27 )
								ret := -0.666667
	if( k > 40.1089 )
		if( d_k <= 2.96103 )
			if( rsi1 <= 65.2623 )
				if( smoothK_k <= 89.1814 )
					if( rsi1 <= 43.932 )
						if( ad_mf <= -475.434 )
							if( ad <= -528.41 )
								if( rsi1 <= 20.7377 )
									ret := -0.526316
								if( rsi1 > 20.7377 )
									ret := 0.101610
							if( ad > -528.41 )
								if( d_k <= -11.9859 )
									ret := -0.041667
								if( d_k > -11.9859 )
									ret := 0.548077
						if( ad_mf > -475.434 )
							if( d_k <= -0.502083 )
								if( ad <= 4664.43 )
									ret := -0.130724
								if( ad > 4664.43 )
									ret := 0.235294
							if( d_k > -0.502083 )
								if( d <= 91.3024 )
									ret := -0.303390
								if( d > 91.3024 )
									ret := 0.521739
					if( rsi1 > 43.932 )
						if( rsi1 <= 54.6949 )
							if( ad <= -240.953 )
								if( d_k <= -8.02828 )
									ret := 0.324636
								if( d_k > -8.02828 )
									ret := 0.181818
							if( ad > -240.953 )
								if( ad_mf <= 1299.47 )
									ret := -0.007799
								if( ad_mf > 1299.47 )
									ret := -0.120438
						if( rsi1 > 54.6949 )
							if( smoothD_d <= 74.7955 )
								if( ad_mf <= -38.9115 )
									ret := 0.299828
								if( ad_mf > -38.9115 )
									ret := 0.100931
							if( smoothD_d > 74.7955 )
								if( ad <= 784.539 )
									ret := 0.135628
								if( ad > 784.539 )
									ret := -0.165029
				if( smoothK_k > 89.1814 )
					if( ad <= -745.868 )
						if( rsi1 <= 33.631 )
							if( d <= 78.06 )
								ret := -0.900000 // sell
							if( d > 78.06 )
								if( mf <= -0.284781 )
									ret := 0.000000
								if( mf > -0.284781 )
									ret := -0.333333
						if( rsi1 > 33.631 )
							if( k <= 96.3686 )
								if( rsi1 <= 58.2395 )
									ret := 0.542328
								if( rsi1 > 58.2395 )
									ret := 0.212963
							if( k > 96.3686 )
								if( k <= 99.9974 )
									ret := 0.716049 // buy
								if( k > 99.9974 )
									ret := 0.446154
					if( ad > -745.868 )
						if( k <= 97.8216 )
							if( rsi1 <= 52.8074 )
								if( ad_mf <= -715.432 )
									ret := -0.750000 // sell
								if( ad_mf > -715.432 )
									ret := 0.118672
							if( rsi1 > 52.8074 )
								if( d <= 77.5916 )
									ret := 0.532967
								if( d > 77.5916 )
									ret := 0.242918
						if( k > 97.8216 )
							if( k <= 99.9969 )
								if( rsi1 <= 61.9864 )
									ret := 0.345957
								if( rsi1 > 61.9864 )
									ret := 0.626566
							if( k > 99.9969 )
								if( ad <= -335.375 )
									ret := 0.510949
								if( ad > -335.375 )
									ret := 0.089888
			if( rsi1 > 65.2623 )
				if( smoothK_k <= 89.2261 )
					if( mf <= 0.173169 )
						if( ad_mf <= 1537.22 )
							if( d_k <= -6.51497 )
								if( mf <= -0.070148 )
									ret := 0.355172
								if( mf > -0.070148 )
									ret := 0.583668
							if( d_k > -6.51497 )
								if( ad_mf <= -2145.02 )
									ret := 0.634703
								if( ad_mf > -2145.02 )
									ret := 0.298216
						if( ad_mf > 1537.22 )
							if( rsi1 <= 72.6477 )
								if( d <= 63.0778 )
									ret := 0.319149
								if( d > 63.0778 )
									ret := -0.072072
							if( rsi1 > 72.6477 )
								if( ad <= 1719.74 )
									ret := -0.333333
								if( ad > 1719.74 )
									ret := 0.505882
					if( mf > 0.173169 )
						if( rsi1 <= 73.6437 )
							if( ad_mf <= 7231.64 )
								if( ad_mf <= 5142.26 )
									ret := 0.095331
								if( ad_mf > 5142.26 )
									ret := 0.510638
							if( ad_mf > 7231.64 )
								if( rsi1 <= 70.5723 )
									ret := -0.836066 // sell
								if( rsi1 > 70.5723 )
									ret := -0.181818
						if( rsi1 > 73.6437 )
							if( ad_mf <= 12499.7 )
								if( smoothD_d <= 88.4029 )
									ret := 0.338549
								if( smoothD_d > 88.4029 )
									ret := -0.179104
							if( ad_mf > 12499.7 )
								if( d <= 71.7062 )
									ret := 0.238095
								if( d > 71.7062 )
									ret := -0.657143
				if( smoothK_k > 89.2261 )
					if( d <= 97.0403 )
						if( mf <= 0.271812 )
							if( ad_mf <= -0.126707 )
								if( d_k <= -0.224329 )
									ret := 0.656144
								if( d_k > -0.224329 )
									ret := 0.421687
							if( ad_mf > -0.126707 )
								if( rsi1 <= 81.3645 )
									ret := 0.382661
								if( rsi1 > 81.3645 )
									ret := 0.700873 // buy
						if( mf > 0.271812 )
							if( smoothK_k <= 90.3772 )
								if( ad_mf <= 173.123 )
									ret := 0.421053
								if( ad_mf > 173.123 )
									ret := 0.888889 // buy
							if( smoothK_k > 90.3772 )
								if( ad_mf <= 14641.8 )
									ret := 0.191038
								if( ad_mf > 14641.8 )
									ret := -0.666667
					if( d > 97.0403 )
						if( mf <= 0.13292 )
							if( d_k <= 2.41601 )
								if( rsi1 <= 72.0975 )
									ret := 0.479815
								if( rsi1 > 72.0975 )
									ret := 0.690278
							if( d_k > 2.41601 )
								if( ad <= -381.779 )
									ret := -0.266667
								if( ad > -381.779 )
									ret := 0.529412
						if( mf > 0.13292 )
							if( rsi1 <= 80.673 )
								if( d_k <= 0.198401 )
									ret := 0.129338
								if( d_k > 0.198401 )
									ret := 0.491039
							if( rsi1 > 80.673 )
								if( d_k <= 0.451277 )
									ret := 0.608985
								if( d_k > 0.451277 )
									ret := 0.857798 // buy
		if( d_k > 2.96103 )
			if( d <= 80.5984 )
				if( rsi1 <= 54.7247 )
					if( ad_mf <= 141.53 )
						if( ad_mf <= -226.171 )
							if( rsi1 <= 34.0251 )
								if( mf <= -0.316758 )
									ret := 0.138889
								if( mf > -0.316758 )
									ret := -0.406639
							if( rsi1 > 34.0251 )
								if( k <= 44.0802 )
									ret := 0.207493
								if( k > 44.0802 )
									ret := -0.030470
						if( ad_mf > -226.171 )
							if( smoothD_d <= 54.7186 )
								if( ad <= -202.343 )
									ret := -0.904762 // sell
								if( ad > -202.343 )
									ret := -0.315789
							if( smoothD_d > 54.7186 )
								if( rsi1 <= 42.4363 )
									ret := -0.238443
								if( rsi1 > 42.4363 )
									ret := -0.022599
					if( ad_mf > 141.53 )
						if( k <= 53.6791 )
							if( d_k <= 6.39016 )
								if( ad_mf <= 1691.36 )
									ret := -0.063158
								if( ad_mf > 1691.36 )
									ret := -0.580000
							if( d_k > 6.39016 )
								if( ad <= 4982.75 )
									ret := -0.466192
								if( ad > 4982.75 )
									ret := 0.190476
						if( k > 53.6791 )
							if( k <= 66.0868 )
								if( ad <= 195.768 )
									ret := -0.491525
								if( ad > 195.768 )
									ret := -0.098266
							if( k > 66.0868 )
								if( rsi1 <= 46.0938 )
									ret := -0.541353
								if( rsi1 > 46.0938 )
									ret := -0.228311
				if( rsi1 > 54.7247 )
					if( rsi1 <= 61.9244 )
						if( k <= 64.4352 )
							if( smoothD_d <= 66.1108 )
								if( d <= 49.7387 )
									ret := -0.337838
								if( d > 49.7387 )
									ret := 0.050000
							if( smoothD_d > 66.1108 )
								if( mf <= 0.172982 )
									ret := 0.291060
								if( mf > 0.172982 )
									ret := -0.037594
						if( k > 64.4352 )
							if( ad_mf <= 1383.56 )
								if( smoothK_k <= 70.3997 )
									ret := -0.063425
								if( smoothK_k > 70.3997 )
									ret := 0.444444
							if( ad_mf > 1383.56 )
								if( d <= 72.678 )
									ret := 0.461538
								if( d > 72.678 )
									ret := -0.740260 // sell
					if( rsi1 > 61.9244 )
						if( k <= 73.9413 )
							if( d_k <= 6.97811 )
								if( mf <= 0.195736 )
									ret := 0.190311
								if( mf > 0.195736 )
									ret := -0.171642
							if( d_k > 6.97811 )
								if( ad_mf <= 9606.59 )
									ret := 0.302130
								if( ad_mf > 9606.59 )
									ret := -0.837838 // sell
						if( k > 73.9413 )
							if( ad <= 4575.88 )
								if( rsi1 <= 71.2467 )
									ret := -0.163043
								if( rsi1 > 71.2467 )
									ret := 0.650000
							if( ad > 4575.88 )
								ret := -1.000000 // sell
			if( d > 80.5984 )
				if( ad <= 1063.71 )
					if( ad <= -1767.81 )
						if( ad_mf <= -1868.67 )
							if( ad_mf <= -3548.14 )
								if( k <= 93.209 )
									ret := 0.026706
								if( k > 93.209 )
									ret := -0.807692 // sell
							if( ad_mf > -3548.14 )
								if( ad <= -2558.4 )
									ret := 0.508108
								if( ad > -2558.4 )
									ret := 0.052863
						if( ad_mf > -1868.67 )
							if( d <= 92.6115 )
								if( ad <= -1813.76 )
									ret := -0.540541
								if( ad > -1813.76 )
									ret := 0.458333
							if( d > 92.6115 )
								if( ad_mf <= -1807.15 )
									ret := -1.000000 // sell
								if( ad_mf > -1807.15 )
									ret := -0.571429
					if( ad > -1767.81 )
						if( k <= 85.4788 )
							if( ad <= 742.567 )
								if( ad_mf <= -1316.02 )
									ret := 0.509615
								if( ad_mf > -1316.02 )
									ret := 0.208067
							if( ad > 742.567 )
								if( d <= 90.0607 )
									ret := -0.174672
								if( d > 90.0607 )
									ret := 0.365385
						if( k > 85.4788 )
							if( ad <= 632.656 )
								if( d_k <= 3.73921 )
									ret := 0.234375
								if( d_k > 3.73921 )
									ret := 0.376831
							if( ad > 632.656 )
								if( ad_mf <= 705.947 )
									ret := 0.817308 // buy
								if( ad_mf > 705.947 )
									ret := 0.438679
				if( ad > 1063.71 )
					if( d <= 89.9174 )
						if( mf <= 0.215745 )
							if( ad_mf <= 1287.12 )
								if( smoothD_d <= 84.4146 )
									ret := 0.677083
								if( smoothD_d > 84.4146 )
									ret := 0.000000
							if( ad_mf > 1287.12 )
								if( smoothD_d <= 78.4867 )
									ret := -0.352941
								if( smoothD_d > 78.4867 )
									ret := 0.198091
						if( mf > 0.215745 )
							if( d <= 81.3787 )
								ret := 0.058824
							if( d > 81.3787 )
								if( ad <= 1269.95 )
									ret := 1.000000 // buy
								if( ad > 1269.95 )
									ret := 0.614525
					if( d > 89.9174 )
						if( rsi1 <= 62.1674 )
							if( ad_mf <= 2080.96 )
								if( smoothD_d <= 90.4282 )
									ret := 0.528302
								if( smoothD_d > 90.4282 )
									ret := -0.102041
							if( ad_mf > 2080.96 )
								if( rsi1 <= 61.0363 )
									ret := 0.630769
								if( rsi1 > 61.0363 )
									ret := -0.222222
						if( rsi1 > 62.1674 )
							if( smoothD_d <= 90.656 )
								if( ad_mf <= 1170.45 )
									ret := 0.961538 // buy
								if( ad_mf > 1170.45 )
									ret := 0.550459
							if( smoothD_d > 90.656 )
								if( ad <= 2819.88 )
									ret := 0.782123 // buy
								if( ad > 2819.88 )
									ret := 0.908333 // buy
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_b128a280(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


