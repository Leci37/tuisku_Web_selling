//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: TRXUSDT_1Min_2SV0_e3974a50 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_2SV0_e3974a50", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_e3974a50(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 54.0444 )
		if( VIM <= 0.99999 )
			if( d_k <= -3.41239 )
				if( VIP <= 1.01619 )
					if( rsi1 <= 51.3468 )
						if( VIP <= 1.00362 )
							if( rsi1 <= 46.6665 )
								if( smoothK_k <= 68.2414 )
									ret := 0.409556
								if( smoothK_k > 68.2414 )
									ret := 0.754098 // buy
							if( rsi1 > 46.6665 )
								if( VIP <= 0.999812 )
									ret := -0.054496
								if( VIP > 0.999812 )
									ret := 0.178977
						if( VIP > 1.00362 )
							if( VIM <= 0.925945 )
								ret := -0.461538
							if( VIM > 0.925945 )
								if( d <= 85.9752 )
									ret := 0.524917
								if( d > 85.9752 )
									ret := -0.750000 // sell
					if( rsi1 > 51.3468 )
						if( VIM <= 0.995348 )
							if( smoothD_d <= 91.136 )
								if( smoothD_d <= 75.4218 )
									ret := -0.296029
								if( smoothD_d > 75.4218 )
									ret := 0.153846
							if( smoothD_d > 91.136 )
								if( k <= 98.3257 )
									ret := -1.000000 // sell
								if( k > 98.3257 )
									ret := -0.800000 // sell
						if( VIM > 0.995348 )
							ret := -1.000000 // sell
				if( VIP > 1.01619 )
					if( rsi1 <= 50.7241 )
						if( VIP_VIM <= 0.162668 )
							if( k <= 85.6884 )
								if( k <= 58.7988 )
									ret := 0.445828
								if( k > 58.7988 )
									ret := 0.643045
							if( k > 85.6884 )
								if( d <= 72.9595 )
									ret := -0.651163
								if( d > 72.9595 )
									ret := 0.426540
						if( VIP_VIM > 0.162668 )
							if( smoothD_d <= 58.309 )
								if( VIP_VIM <= 0.168079 )
									ret := -0.692308
								if( VIP_VIM > 0.168079 )
									ret := 0.025000
							if( smoothD_d > 58.309 )
								ret := 0.333333
					if( rsi1 > 50.7241 )
						if( VIP <= 1.03818 )
							if( k <= 99.5762 )
								if( smoothK_k <= 89.335 )
									ret := -0.138028
								if( smoothK_k > 89.335 )
									ret := 0.333333
							if( k > 99.5762 )
								if( d_k <= -8.77774 )
									ret := -0.333333
								if( d_k > -8.77774 )
									ret := -0.909091 // sell
						if( VIP > 1.03818 )
							if( d_k <= -9.53467 )
								if( d <= 81.4667 )
									ret := 0.005831
								if( d > 81.4667 )
									ret := -0.750000 // sell
							if( d_k > -9.53467 )
								if( k <= 95.2148 )
									ret := 0.149798
								if( k > 95.2148 )
									ret := 0.745455 // buy
			if( d_k > -3.41239 )
				if( rsi1 <= 50.0092 )
					if( VIP <= 1.00011 )
						if( rsi1 <= 46.1076 )
							if( rsi1 <= 39.4915 )
								if( VIP <= 0.955481 )
									ret := 0.145631
								if( VIP > 0.955481 )
									ret := 0.898305 // buy
							if( rsi1 > 39.4915 )
								if( VIM <= 0.933668 )
									ret := 0.250704
								if( VIM > 0.933668 )
									ret := 0.579380
						if( rsi1 > 46.1076 )
							if( d <= 96.5756 )
								if( VIP <= 0.996188 )
									ret := 0.000000
								if( VIP > 0.996188 )
									ret := 0.241833
							if( d > 96.5756 )
								if( smoothD_d <= 95.2292 )
									ret := -0.595238
								if( smoothD_d > 95.2292 )
									ret := 0.117647
					if( VIP > 1.00011 )
						if( VIM <= 0.96538 )
							if( d <= 32.1313 )
								if( VIP <= 1.06532 )
									ret := 0.517838
								if( VIP > 1.06532 )
									ret := 0.333333
							if( d > 32.1313 )
								if( d <= 40.2607 )
									ret := 0.733216 // buy
								if( d > 40.2607 )
									ret := 0.598535
						if( VIM > 0.96538 )
							if( d <= 13.3519 )
								if( smoothD_d <= 8.48996 )
									ret := 0.220657
								if( smoothD_d > 8.48996 )
									ret := -0.576923
							if( d > 13.3519 )
								if( d_k <= 0.227845 )
									ret := 0.762295 // buy
								if( d_k > 0.227845 )
									ret := 0.403327
				if( rsi1 > 50.0092 )
					if( VIP_VIM <= 0.137621 )
						if( VIP_VIM <= 0.070017 )
							if( k <= 58.0542 )
								if( smoothD_d <= 0.344997 )
									ret := -0.622642
								if( smoothD_d > 0.344997 )
									ret := -0.129118
							if( k > 58.0542 )
								if( smoothD_d <= 59.8435 )
									ret := 0.625000
								if( smoothD_d > 59.8435 )
									ret := 0.006410
						if( VIP_VIM > 0.070017 )
							if( rsi1 <= 50.317 )
								if( rsi1 <= 50.0856 )
									ret := 0.000000
								if( rsi1 > 50.0856 )
									ret := 0.777778 // buy
							if( rsi1 > 50.317 )
								if( k <= 2.74614 )
									ret := -0.217647
								if( k > 2.74614 )
									ret := 0.080153
					if( VIP_VIM > 0.137621 )
						if( VIM <= 0.93147 )
							if( d_k <= 1.60651 )
								if( smoothK_k <= 83.8057 )
									ret := 0.005464
								if( smoothK_k > 83.8057 )
									ret := 0.509091
							if( d_k > 1.60651 )
								if( d <= 8.61931 )
									ret := -0.400000
								if( d > 8.61931 )
									ret := 0.459669
						if( VIM > 0.93147 )
							if( d <= 72.6042 )
								if( d_k <= 0.539229 )
									ret := -0.530612
								if( d_k > 0.539229 )
									ret := 0.169811
							if( d > 72.6042 )
								if( smoothK_k <= 69.3705 )
									ret := -0.742857 // sell
								if( smoothK_k > 69.3705 )
									ret := 0.000000
		if( VIM > 0.99999 )
			if( k <= 1.6e-05 )
				if( VIP <= 0.798155 )
					if( VIP_VIM <= -1.07478 )
						if( d <= 6.02154 )
							if( VIP <= 0.343165 )
								if( VIP_VIM <= -1.25353 )
									ret := -0.318182
								if( VIP_VIM > -1.25353 )
									ret := 0.500000
							if( VIP > 0.343165 )
								if( smoothD_d <= -1.19067 )
									ret := -0.412844
								if( smoothD_d > -1.19067 )
									ret := 0.375000
						if( d > 6.02154 )
							if( rsi1 <= 6.62809 )
								ret := -1.000000 // sell
							if( rsi1 > 6.62809 )
								ret := -0.615385
					if( VIP_VIM > -1.07478 )
						if( VIP <= 0.788307 )
							if( d <= 4.14934 )
								if( VIP_VIM <= -0.403128 )
									ret := 0.006394
								if( VIP_VIM > -0.403128 )
									ret := 0.381679
							if( d > 4.14934 )
								if( VIP_VIM <= -0.827526 )
									ret := -0.141509
								if( VIP_VIM > -0.827526 )
									ret := 0.171665
						if( VIP > 0.788307 )
							if( smoothD_d <= 5.36012 )
								if( d_k <= 7.27113 )
									ret := -0.226131
								if( d_k > 7.27113 )
									ret := -0.923077 // sell
							if( smoothD_d > 5.36012 )
								if( VIP <= 0.791725 )
									ret := 0.105263
								if( VIP > 0.791725 )
									ret := 0.538462
				if( VIP > 0.798155 )
					if( VIM <= 1.21246 )
						if( d <= 10.191 )
							if( rsi1 <= 46.2497 )
								if( rsi1 <= 36.3907 )
									ret := 0.337704
								if( rsi1 > 36.3907 )
									ret := 0.214332
							if( rsi1 > 46.2497 )
								if( VIP_VIM <= -0.00193 )
									ret := -0.389222
								if( VIP_VIM > -0.00193 )
									ret := -0.135008
						if( d > 10.191 )
							if( rsi1 <= 37.7242 )
								if( VIP_VIM <= -0.185967 )
									ret := 0.325383
								if( VIP_VIM > -0.185967 )
									ret := 0.700483 // buy
							if( rsi1 > 37.7242 )
								if( VIP_VIM <= -0.016427 )
									ret := 0.017454
								if( VIP_VIM > -0.016427 )
									ret := 0.349003
					if( VIM > 1.21246 )
						if( rsi1 <= 17.1394 )
							ret := 0.882353 // buy
						if( rsi1 > 17.1394 )
							if( smoothD_d <= 19.5151 )
								if( VIP <= 0.804655 )
									ret := 0.523810
								if( VIP > 0.804655 )
									ret := -0.225225
							if( smoothD_d > 19.5151 )
								if( VIP <= 0.839271 )
									ret := 0.363636
								if( VIP > 0.839271 )
									ret := 0.900000 // buy
			if( k > 1.6e-05 )
				if( d_k <= 0.751594 )
					if( rsi1 <= 45.4592 )
						if( d_k <= -6.09037 )
							if( VIP_VIM <= -0.089797 )
								if( smoothK_k <= 11.0801 )
									ret := -0.377778
								if( smoothK_k > 11.0801 )
									ret := -0.040437
							if( VIP_VIM > -0.089797 )
								if( VIP_VIM <= -0.029353 )
									ret := 0.285916
								if( VIP_VIM > -0.029353 )
									ret := 0.567834
						if( d_k > -6.09037 )
							if( k <= 0.528317 )
								if( smoothK_k <= -2.60926 )
									ret := -0.074074
								if( smoothK_k > -2.60926 )
									ret := -0.692308
							if( k > 0.528317 )
								if( smoothD_d <= 13.8018 )
									ret := 0.081935
								if( smoothD_d > 13.8018 )
									ret := 0.141268
					if( rsi1 > 45.4592 )
						if( smoothD_d <= 87.1121 )
							if( VIP <= 0.999729 )
								if( VIM <= 1.11764 )
									ret := -0.300386
								if( VIM > 1.11764 )
									ret := -0.088415
							if( VIP > 0.999729 )
								if( smoothK_k <= 75.6299 )
									ret := -0.096022
								if( smoothK_k > 75.6299 )
									ret := 0.026071
						if( smoothD_d > 87.1121 )
							if( VIP_VIM <= -0.001192 )
								if( VIM <= 1.0682 )
									ret := -0.089692
								if( VIM > 1.0682 )
									ret := 0.218182
							if( VIP_VIM > -0.001192 )
								if( smoothD_d <= 88.0087 )
									ret := -0.080645
								if( smoothD_d > 88.0087 )
									ret := 0.315888
				if( d_k > 0.751594 )
					if( rsi1 <= 45.4728 )
						if( k <= 7.99145 )
							if( VIM <= 1.05926 )
								if( VIP_VIM <= -0.006873 )
									ret := 0.266432
								if( VIP_VIM > -0.006873 )
									ret := 0.616000
							if( VIM > 1.05926 )
								if( smoothK_k <= -2.84189 )
									ret := -0.450292
								if( smoothK_k > -2.84189 )
									ret := 0.074002
						if( k > 7.99145 )
							if( VIP_VIM <= -0.064916 )
								if( rsi1 <= 40.0712 )
									ret := 0.204131
								if( rsi1 > 40.0712 )
									ret := 0.007529
							if( VIP_VIM > -0.064916 )
								if( VIM <= 1.0323 )
									ret := 0.604923
								if( VIM > 1.0323 )
									ret := 0.311546
					if( rsi1 > 45.4728 )
						if( VIP <= 0.999839 )
							if( d_k <= 3.20638 )
								if( d <= 17.4936 )
									ret := 0.223048
								if( d > 17.4936 )
									ret := -0.212121
							if( d_k > 3.20638 )
								if( smoothK_k <= 79.0265 )
									ret := -0.279049
								if( smoothK_k > 79.0265 )
									ret := -0.594470
						if( VIP > 0.999839 )
							if( d_k <= 2.9737 )
								if( smoothD_d <= 5.8645 )
									ret := -0.266667
								if( smoothD_d > 5.8645 )
									ret := 0.090562
							if( d_k > 2.9737 )
								if( VIP_VIM <= -7.7e-05 )
									ret := -0.200465
								if( VIP_VIM > -7.7e-05 )
									ret := -0.066050
	if( rsi1 > 54.0444 )
		if( VIP <= 1.04992 )
			if( VIP_VIM <= 0.099836 )
				if( rsi1 <= 54.5456 )
					if( k <= 91.8768 )
						if( d_k <= 8.69366 )
							if( smoothK_k <= 34.3167 )
								if( d <= 27.2079 )
									ret := -0.223684
								if( d > 27.2079 )
									ret := 0.216667
							if( smoothK_k > 34.3167 )
								if( VIM <= 1.06286 )
									ret := -0.323408
								if( VIM > 1.06286 )
									ret := 0.311111
						if( d_k > 8.69366 )
							if( smoothD_d <= 41.3744 )
								if( k <= 17.1939 )
									ret := -0.130435
								if( k > 17.1939 )
									ret := -0.545455
							if( smoothD_d > 41.3744 )
								if( k <= 76.182 )
									ret := 0.312925
								if( k > 76.182 )
									ret := 0.846154 // buy
					if( k > 91.8768 )
						if( k <= 93.7414 )
							if( smoothD_d <= 84.3897 )
								if( VIM <= 0.999662 )
									ret := 1.000000 // buy
								if( VIM > 0.999662 )
									ret := -0.111111
							if( smoothD_d > 84.3897 )
								ret := -0.307692
						if( k > 93.7414 )
							if( smoothD_d <= 94.2831 )
								if( d <= 94.633 )
									ret := -0.197802
								if( d > 94.633 )
									ret := -0.680000
							if( smoothD_d > 94.2831 )
								ret := 0.428571
				if( rsi1 > 54.5456 )
					if( d <= 96.3038 )
						if( VIM <= 0.941186 )
							if( rsi1 <= 60.0441 )
								if( d <= 68.0524 )
									ret := -0.088060
								if( d > 68.0524 )
									ret := -0.332054
							if( rsi1 > 60.0441 )
								if( VIP <= 1.00017 )
									ret := -0.257840
								if( VIP > 1.00017 )
									ret := -0.738095 // sell
						if( VIM > 0.941186 )
							if( VIP_VIM <= 3.9e-05 )
								if( VIP_VIM <= -0.094266 )
									ret := 0.077419
								if( VIP_VIM > -0.094266 )
									ret := -0.361403
							if( VIP_VIM > 3.9e-05 )
								if( VIP <= 1.02826 )
									ret := -0.537568
								if( VIP > 1.02826 )
									ret := -0.423154
					if( d > 96.3038 )
						if( VIP <= 1.00361 )
							if( rsi1 <= 58.5714 )
								if( rsi1 <= 55.7778 )
									ret := -0.674157
								if( rsi1 > 55.7778 )
									ret := -0.389474
							if( rsi1 > 58.5714 )
								if( rsi1 <= 61.25 )
									ret := 0.309524
								if( rsi1 > 61.25 )
									ret := 0.000000
						if( VIP > 1.00361 )
							if( rsi1 <= 58.3357 )
								if( d <= 99.9855 )
									ret := 0.231405
								if( d > 99.9855 )
									ret := -0.833333 // sell
							if( rsi1 > 58.3357 )
								if( VIM <= 0.952593 )
									ret := 0.111111
								if( VIM > 0.952593 )
									ret := 0.763158 // buy
			if( VIP_VIM > 0.099836 )
				if( rsi1 <= 55.875 )
					if( smoothK_k <= 51.3098 )
						if( VIP <= 1.02798 )
							if( rsi1 <= 54.8374 )
								if( smoothD_d <= 37.4511 )
									ret := 0.250000
								if( smoothD_d > 37.4511 )
									ret := -0.428571
							if( rsi1 > 54.8374 )
								if( VIP <= 1.02083 )
									ret := -0.838710 // sell
								if( VIP > 1.02083 )
									ret := -0.470588
						if( VIP > 1.02798 )
							if( VIM <= 0.930961 )
								if( smoothK_k <= 32.8808 )
									ret := 0.429752
								if( smoothK_k > 32.8808 )
									ret := -0.087719
							if( VIM > 0.930961 )
								if( k <= 47.2521 )
									ret := -0.076923
								if( k > 47.2521 )
									ret := -0.727273 // sell
					if( smoothK_k > 51.3098 )
						if( rsi1 <= 55.2777 )
							if( rsi1 <= 54.7954 )
								if( smoothK_k <= 68.6117 )
									ret := 0.696429
								if( smoothK_k > 68.6117 )
									ret := -0.050633
							if( rsi1 > 54.7954 )
								if( VIP <= 1.03514 )
									ret := 0.272727
								if( VIP > 1.03514 )
									ret := -0.444444
						if( rsi1 > 55.2777 )
							if( d <= 56.5362 )
								ret := 0.894737 // buy
							if( d > 56.5362 )
								if( d <= 66.2663 )
									ret := -0.750000 // sell
								if( d > 66.2663 )
									ret := 0.383929
				if( rsi1 > 55.875 )
					if( VIM <= 0.924486 )
						if( d_k <= -12.0258 )
							if( smoothD_d <= 18.2419 )
								if( rsi1 <= 62.002 )
									ret := -0.200000
								if( rsi1 > 62.002 )
									ret := -0.916667 // sell
							if( smoothD_d > 18.2419 )
								if( VIP_VIM <= 0.123139 )
									ret := -0.076923
								if( VIP_VIM > 0.123139 )
									ret := -0.410876
						if( d_k > -12.0258 )
							if( smoothD_d <= 48.7435 )
								if( smoothD_d <= 42.4826 )
									ret := -0.175166
								if( smoothD_d > 42.4826 )
									ret := -0.511111
							if( smoothD_d > 48.7435 )
								if( d_k <= -8.89255 )
									ret := 0.289474
								if( d_k > -8.89255 )
									ret := -0.057174
					if( VIM > 0.924486 )
						if( smoothK_k <= 1.61012 )
							ret := 0.565217
						if( smoothK_k > 1.61012 )
							if( rsi1 <= 60.0736 )
								if( d <= 43.0022 )
									ret := -0.189781
								if( d > 43.0022 )
									ret := -0.430000
							if( rsi1 > 60.0736 )
								if( rsi1 <= 62.6777 )
									ret := -0.913580 // sell
								if( rsi1 > 62.6777 )
									ret := -0.088889
		if( VIP > 1.04992 )
			if( d_k <= -2.95726 )
				if( VIP <= 1.19992 )
					if( k <= 28.5888 )
						if( rsi1 <= 60.2271 )
							if( VIP_VIM <= 0.177564 )
								if( smoothD_d <= 0.679929 )
									ret := 0.428571
								if( smoothD_d > 0.679929 )
									ret := -0.063796
							if( VIP_VIM > 0.177564 )
								if( VIM <= 0.905245 )
									ret := 0.082051
								if( VIM > 0.905245 )
									ret := 0.636364
						if( rsi1 > 60.2271 )
							if( VIP <= 1.14448 )
								if( VIP_VIM <= 0.226846 )
									ret := -0.444767
								if( VIP_VIM > 0.226846 )
									ret := -0.074074
							if( VIP > 1.14448 )
								if( VIM <= 0.804176 )
									ret := -0.446809
								if( VIM > 0.804176 )
									ret := 0.125000
					if( k > 28.5888 )
						if( rsi1 <= 59.6779 )
							if( VIM <= 0.933414 )
								if( rsi1 <= 57.2085 )
									ret := 0.164049
								if( rsi1 > 57.2085 )
									ret := -0.079223
							if( VIM > 0.933414 )
								if( VIP <= 1.06655 )
									ret := -0.162092
								if( VIP > 1.06655 )
									ret := -0.007362
						if( rsi1 > 59.6779 )
							if( VIP_VIM <= 0.249982 )
								if( smoothD_d <= 89.244 )
									ret := -0.370331
								if( smoothD_d > 89.244 )
									ret := -0.112676
							if( VIP_VIM > 0.249982 )
								if( rsi1 <= 63.5512 )
									ret := -0.010989
								if( rsi1 > 63.5512 )
									ret := -0.261382
				if( VIP > 1.19992 )
					if( rsi1 <= 79.4289 )
						if( VIM <= 1.30157 )
							if( VIP <= 1.30127 )
								if( d <= 69.7147 )
									ret := -0.002141
								if( d > 69.7147 )
									ret := -0.150115
							if( VIP > 1.30127 )
								if( VIP_VIM <= 0.843289 )
									ret := 0.049195
								if( VIP_VIM > 0.843289 )
									ret := 0.758621 // buy
						if( VIM > 1.30157 )
							ret := 0.944444 // buy
					if( rsi1 > 79.4289 )
						if( rsi1 <= 79.6726 )
							if( VIP_VIM <= 0.581565 )
								if( d <= 72.7965 )
									ret := -1.000000 // sell
								if( d > 72.7965 )
									ret := -0.727273 // sell
							if( VIP_VIM > 0.581565 )
								if( d_k <= -8.81686 )
									ret := -0.066667
								if( d_k > -8.81686 )
									ret := -0.807692 // sell
						if( rsi1 > 79.6726 )
							if( rsi1 <= 89.473 )
								if( smoothK_k <= 90.336 )
									ret := -0.116838
								if( smoothK_k > 90.336 )
									ret := -0.300101
							if( rsi1 > 89.473 )
								if( d <= 94.9735 )
									ret := 0.091216
								if( d > 94.9735 )
									ret := -0.500000
			if( d_k > -2.95726 )
				if( smoothD_d <= 96.9353 )
					if( rsi1 <= 58.8349 )
						if( VIM <= 0.926729 )
							if( k <= 46.6293 )
								if( d <= 17.0495 )
									ret := 0.291339
								if( d > 17.0495 )
									ret := 0.037992
							if( k > 46.6293 )
								if( rsi1 <= 57.6362 )
									ret := 0.356656
								if( rsi1 > 57.6362 )
									ret := 0.091158
						if( VIM > 0.926729 )
							if( smoothD_d <= 75.4294 )
								if( smoothK_k <= 36.6222 )
									ret := -0.239167
								if( smoothK_k > 36.6222 )
									ret := -0.092441
							if( smoothD_d > 75.4294 )
								if( d_k <= 11.9088 )
									ret := 0.030735
								if( d_k > 11.9088 )
									ret := 0.272251
					if( rsi1 > 58.8349 )
						if( VIM <= 0.888913 )
							if( VIP_VIM <= 1.21666 )
								if( smoothD_d <= 96.5192 )
									ret := -0.086042
								if( smoothD_d > 96.5192 )
									ret := 0.126783
							if( VIP_VIM > 1.21666 )
								if( VIM <= 0.42535 )
									ret := 0.722772 // buy
								if( VIM > 0.42535 )
									ret := 0.076923
						if( VIM > 0.888913 )
							if( smoothK_k <= 23.9112 )
								if( VIP_VIM <= 0.241831 )
									ret := -0.425343
								if( VIP_VIM > 0.241831 )
									ret := 0.087719
							if( smoothK_k > 23.9112 )
								if( rsi1 <= 61.5397 )
									ret := -0.135046
								if( rsi1 > 61.5397 )
									ret := -0.264435
				if( smoothD_d > 96.9353 )
					if( rsi1 <= 57.1434 )
						if( VIP_VIM <= 0.132472 )
							if( VIP_VIM <= 0.102437 )
								if( rsi1 <= 55.8353 )
									ret := -0.600000
								if( rsi1 > 55.8353 )
									ret := 0.565217
							if( VIP_VIM > 0.102437 )
								if( VIM <= 0.944383 )
									ret := -0.526316
								if( VIM > 0.944383 )
									ret := -0.171429
						if( VIP_VIM > 0.132472 )
							if( VIP <= 1.06667 )
								if( VIP_VIM <= 0.137926 )
									ret := 0.200000
								if( VIP_VIM > 0.137926 )
									ret := -0.307692
							if( VIP > 1.06667 )
								if( VIM <= 0.932149 )
									ret := 1.000000 // buy
								if( VIM > 0.932149 )
									ret := 0.500000
					if( rsi1 > 57.1434 )
						if( VIP <= 1.50935 )
							if( VIP_VIM <= 0.803126 )
								if( smoothK_k <= 96.9691 )
									ret := -0.783784 // sell
								if( smoothK_k > 96.9691 )
									ret := -0.313444
							if( VIP_VIM > 0.803126 )
								if( VIP_VIM <= 0.90096 )
									ret := 0.236220
								if( VIP_VIM > 0.90096 )
									ret := -0.240876
						if( VIP > 1.50935 )
							if( k <= 99.9633 )
								ret := 0.545455
							if( k > 99.9633 )
								if( VIP <= 1.62382 )
									ret := 0.289474
								if( VIP > 1.62382 )
									ret := -0.037037
	
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
float op_operation = decision_tree_0_TRXUSDT_1Min_e3974a50(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


