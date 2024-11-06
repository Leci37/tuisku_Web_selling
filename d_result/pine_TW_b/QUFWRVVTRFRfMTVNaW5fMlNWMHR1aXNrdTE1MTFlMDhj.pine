//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AAVEUSDT_15Min_2SV0_1511e08c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_2SV0_1511e08c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_1511e08c(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 48.47 )
		if( VIM <= 0.999992 )
			if( rsi1 <= 40.6743 )
				if( VIP_VIM <= -0.080288 )
					if( k <= 18.0387 )
						if( smoothD_d <= 7.87218 )
							if( d_k <= -0.008831 )
								ret := -0.884615 // sell
							if( d_k > -0.008831 )
								ret := -0.384615
						if( smoothD_d > 7.87218 )
							ret := 0.000000
					if( k > 18.0387 )
						if( smoothD_d <= 68.2562 )
							if( VIP_VIM <= -0.096892 )
								ret := 0.173913
							if( VIP_VIM > -0.096892 )
								ret := 0.937500 // buy
						if( smoothD_d > 68.2562 )
							ret := -0.923077 // sell
				if( VIP_VIM > -0.080288 )
					if( VIP <= 0.89039 )
						ret := 0.375000
					if( VIP > 0.89039 )
						if( smoothD_d <= -2.88862 )
							if( VIP <= 0.97103 )
								ret := -0.608696
							if( VIP > 0.97103 )
								if( VIP_VIM <= 0.220644 )
									ret := -0.946903 // sell
								if( VIP_VIM > 0.220644 )
									ret := -0.795620 // sell
						if( smoothD_d > -2.88862 )
							if( d <= 57.7631 )
								if( d <= 0.163797 )
									ret := -0.391304
								if( d > 0.163797 )
									ret := -0.750000 // sell
							if( d > 57.7631 )
								if( d <= 59.0771 )
									ret := 0.000000
								if( d > 59.0771 )
									ret := -0.628571
			if( rsi1 > 40.6743 )
				if( VIP <= 1.01607 )
					if( d <= 65.6471 )
						if( k <= 15.3288 )
							if( d <= 3.72422 )
								if( d_k <= -0.376631 )
									ret := -0.720000 // sell
								if( d_k > -0.376631 )
									ret := -0.294118
							if( d > 3.72422 )
								if( VIP <= 0.975292 )
									ret := 0.315789
								if( VIP > 0.975292 )
									ret := -0.030303
						if( k > 15.3288 )
							if( VIP_VIM <= 0.052936 )
								if( smoothD_d <= 32.3893 )
									ret := -0.458065
								if( smoothD_d > 32.3893 )
									ret := -0.252212
							if( VIP_VIM > 0.052936 )
								if( smoothD_d <= 43.2465 )
									ret := -0.507692
								if( smoothD_d > 43.2465 )
									ret := -0.938776 // sell
					if( d > 65.6471 )
						if( VIP_VIM <= 0.02186 )
							if( rsi1 <= 47.0093 )
								if( d_k <= -3.04987 )
									ret := -0.500000
								if( d_k > -3.04987 )
									ret := 0.435115
							if( rsi1 > 47.0093 )
								if( d <= 90.9946 )
									ret := 0.187500
								if( d > 90.9946 )
									ret := -0.636364
						if( VIP_VIM > 0.02186 )
							if( smoothD_d <= 64.1254 )
								ret := 0.700000 // buy
							if( smoothD_d > 64.1254 )
								if( d <= 70.1642 )
									ret := -0.941176 // sell
								if( d > 70.1642 )
									ret := -0.244444
				if( VIP > 1.01607 )
					if( smoothD_d <= 75.4014 )
						if( d_k <= 30.6511 )
							if( VIP_VIM <= 0.265244 )
								if( d_k <= 20.1478 )
									ret := -0.530298
								if( d_k > 20.1478 )
									ret := -0.308594
							if( VIP_VIM > 0.265244 )
								if( smoothD_d <= 67.729 )
									ret := -0.674808
								if( smoothD_d > 67.729 )
									ret := 0.000000
						if( d_k > 30.6511 )
							if( d <= 41.8878 )
								ret := -0.727273 // sell
							if( d > 41.8878 )
								ret := 0.318182
					if( smoothD_d > 75.4014 )
						if( rsi1 <= 44.2559 )
							if( k <= 67.4335 )
								ret := -0.090909
							if( k > 67.4335 )
								ret := -0.714286 // sell
						if( rsi1 > 44.2559 )
							if( smoothK_k <= 72.0711 )
								if( VIP <= 1.04722 )
									ret := 0.743590 // buy
								if( VIP > 1.04722 )
									ret := 0.310345
							if( smoothK_k > 72.0711 )
								if( d <= 85.5243 )
									ret := -0.840000 // sell
								if( d > 85.5243 )
									ret := 0.279070
		if( VIM > 0.999992 )
			if( smoothD_d <= 8.73103 )
				if( d <= 3.09006 )
					if( rsi1 <= 32.0327 )
						if( VIP_VIM <= -0.381781 )
							if( k <= 0.139287 )
								if( VIM <= 1.35333 )
									ret := -0.132463
								if( VIM > 1.35333 )
									ret := 0.480392
							if( k > 0.139287 )
								if( d <= 2.01177 )
									ret := -0.342105
								if( d > 2.01177 )
									ret := -0.169972
						if( VIP_VIM > -0.381781 )
							if( VIM <= 1.21661 )
								if( rsi1 <= 25.4732 )
									ret := -0.882353 // sell
								if( rsi1 > 25.4732 )
									ret := -0.595611
							if( VIM > 1.21661 )
								if( smoothK_k <= -2.97921 )
									ret := 0.866667 // buy
								if( smoothK_k > -2.97921 )
									ret := 0.538462
					if( rsi1 > 32.0327 )
						if( VIM <= 1.09588 )
							if( k <= 3.02343 )
								if( rsi1 <= 39.6483 )
									ret := -0.358209
								if( rsi1 > 39.6483 )
									ret := 0.082569
							if( k > 3.02343 )
								if( smoothD_d <= -0.309821 )
									ret := -0.631148
								if( smoothD_d > -0.309821 )
									ret := -0.956522 // sell
						if( VIM > 1.09588 )
							if( d_k <= -1.93799 )
								if( k <= 4.30769 )
									ret := -0.750000 // sell
								if( k > 4.30769 )
									ret := 0.184466
							if( d_k > -1.93799 )
								if( VIP_VIM <= -0.34096 )
									ret := 0.017544
								if( VIP_VIM > -0.34096 )
									ret := 0.468000
				if( d > 3.09006 )
					if( VIP_VIM <= -0.256937 )
						if( k <= 6.28814 )
							if( rsi1 <= 27.5172 )
								if( VIP <= 0.79269 )
									ret := 0.010896
								if( VIP > 0.79269 )
									ret := -0.391892
							if( rsi1 > 27.5172 )
								if( rsi1 <= 35.7355 )
									ret := 0.161290
								if( rsi1 > 35.7355 )
									ret := 0.671875
						if( k > 6.28814 )
							if( d_k <= -4.43058 )
								if( VIP <= 0.602743 )
									ret := -0.836735 // sell
								if( VIP > 0.602743 )
									ret := -0.342790
							if( d_k > -4.43058 )
								if( k <= 7.00679 )
									ret := -0.428571
								if( k > 7.00679 )
									ret := -0.135994
					if( VIP_VIM > -0.256937 )
						if( rsi1 <= 35.7136 )
							if( smoothK_k <= -0.932808 )
								if( rsi1 <= 32.4756 )
									ret := -0.648990
								if( rsi1 > 32.4756 )
									ret := 0.064103
							if( smoothK_k > -0.932808 )
								if( VIP <= 0.85482 )
									ret := -0.385714
								if( VIP > 0.85482 )
									ret := -0.709112 // sell
						if( rsi1 > 35.7136 )
							if( VIP <= 0.906655 )
								if( k <= 8.24134 )
									ret := 0.382075
								if( k > 8.24134 )
									ret := -0.045946
							if( VIP > 0.906655 )
								if( rsi1 <= 44.8094 )
									ret := -0.284683
								if( rsi1 > 44.8094 )
									ret := 0.116228
			if( smoothD_d > 8.73103 )
				if( rsi1 <= 36.2577 )
					if( VIP <= 0.857755 )
						if( rsi1 <= 25.1946 )
							if( VIP <= 0.774964 )
								if( k <= 21.9033 )
									ret := 0.039872
								if( k > 21.9033 )
									ret := -0.264948
							if( VIP > 0.774964 )
								if( k <= 10.0618 )
									ret := -0.063158
								if( k > 10.0618 )
									ret := -0.571429
						if( rsi1 > 25.1946 )
							if( VIP_VIM <= -0.444854 )
								if( d_k <= -10.3485 )
									ret := -0.107438
								if( d_k > -10.3485 )
									ret := 0.252427
							if( VIP_VIM > -0.444854 )
								if( d_k <= -0.547928 )
									ret := -0.211614
								if( d_k > -0.547928 )
									ret := 0.010365
					if( VIP > 0.857755 )
						if( VIP_VIM <= -0.193798 )
							if( rsi1 <= 29.9926 )
								if( VIP_VIM <= -0.390656 )
									ret := 0.692308
								if( VIP_VIM > -0.390656 )
									ret := -0.588723
							if( rsi1 > 29.9926 )
								if( smoothK_k <= 21.0113 )
									ret := -0.058929
								if( smoothK_k > 21.0113 )
									ret := -0.346939
						if( VIP_VIM > -0.193798 )
							if( VIM <= 1.07831 )
								if( VIP <= 0.873103 )
									ret := -0.107143
								if( VIP > 0.873103 )
									ret := -0.689498
							if( VIM > 1.07831 )
								if( k <= 0.130318 )
									ret := 0.076923
								if( k > 0.130318 )
									ret := -0.540496
				if( rsi1 > 36.2577 )
					if( k <= 91.9266 )
						if( VIP_VIM <= -0.306572 )
							if( rsi1 <= 39.1374 )
								if( smoothD_d <= 64.5003 )
									ret := 0.133735
								if( smoothD_d > 64.5003 )
									ret := 0.500000
							if( rsi1 > 39.1374 )
								if( VIP_VIM <= -0.419399 )
									ret := 0.505632
								if( VIP_VIM > -0.419399 )
									ret := 0.350421
						if( VIP_VIM > -0.306572 )
							if( VIP_VIM <= -0.151721 )
								if( d <= 59.1168 )
									ret := 0.093445
								if( d > 59.1168 )
									ret := -0.017912
							if( VIP_VIM > -0.151721 )
								if( VIM <= 1.05083 )
									ret := -0.150798
								if( VIM > 1.05083 )
									ret := -0.023497
					if( k > 91.9266 )
						if( VIM <= 1.13738 )
							if( smoothD_d <= 76.0342 )
								if( d <= 76.5534 )
									ret := 0.185185
								if( d > 76.5534 )
									ret := 0.771429 // buy
							if( smoothD_d > 76.0342 )
								if( d_k <= -4.31967 )
									ret := -0.185484
								if( d_k > -4.31967 )
									ret := 0.095406
						if( VIM > 1.13738 )
							if( VIP_VIM <= -0.486559 )
								if( d_k <= -9.04834 )
									ret := 0.472222
								if( d_k > -9.04834 )
									ret := 0.735450 // buy
							if( VIP_VIM > -0.486559 )
								if( smoothD_d <= 76.8145 )
									ret := 0.572917
								if( smoothD_d > 76.8145 )
									ret := 0.263039
	if( rsi1 > 48.47 )
		if( VIP <= 0.958251 )
			if( rsi1 <= 55.6242 )
				if( VIP_VIM <= -0.170481 )
					if( VIP_VIM <= -0.342107 )
						if( VIP <= 0.785617 )
							if( d_k <= -17.5328 )
								if( d_k <= -22.4064 )
									ret := 0.820513 // buy
								if( d_k > -22.4064 )
									ret := 0.435484
							if( d_k > -17.5328 )
								if( VIP_VIM <= -0.415837 )
									ret := 0.765343 // buy
								if( VIP_VIM > -0.415837 )
									ret := 0.941176 // buy
						if( VIP > 0.785617 )
							if( smoothK_k <= 91.5133 )
								if( VIP_VIM <= -0.374895 )
									ret := 0.337838
								if( VIP_VIM > -0.374895 )
									ret := 0.598802
							if( smoothK_k > 91.5133 )
								if( smoothD_d <= 91.5519 )
									ret := 0.800000 // buy
								if( smoothD_d > 91.5519 )
									ret := 0.540541
					if( VIP_VIM > -0.342107 )
						if( smoothK_k <= 96.2305 )
							if( VIP <= 0.890827 )
								if( VIM <= 1.16028 )
									ret := 0.644281
								if( VIM > 1.16028 )
									ret := 0.376623
							if( VIP > 0.890827 )
								if( d <= 39.931 )
									ret := 0.132075
								if( d > 39.931 )
									ret := 0.467772
						if( smoothK_k > 96.2305 )
							if( VIP <= 0.907485 )
								if( rsi1 <= 52.147 )
									ret := -0.055556
								if( rsi1 > 52.147 )
									ret := 0.204082
							if( VIP > 0.907485 )
								ret := 0.636364
				if( VIP_VIM > -0.170481 )
					if( k <= 95.2699 )
						if( d <= 19.0053 )
							if( VIP_VIM <= -0.041828 )
								if( d_k <= -9.10763 )
									ret := 0.085714
								if( d_k > -9.10763 )
									ret := -0.224490
							if( VIP_VIM > -0.041828 )
								if( d <= 12.9665 )
									ret := 0.807692 // buy
								if( d > 12.9665 )
									ret := 0.090909
						if( d > 19.0053 )
							if( smoothK_k <= 90.3769 )
								if( k <= 81.77 )
									ret := 0.376634
								if( k > 81.77 )
									ret := 0.134367
							if( smoothK_k > 90.3769 )
								if( VIP <= 0.918107 )
									ret := 0.562500
								if( VIP > 0.918107 )
									ret := 0.861111 // buy
					if( k > 95.2699 )
						if( d <= 88.6603 )
							if( k <= 98.0098 )
								ret := 0.266667
							if( k > 98.0098 )
								ret := 0.875000 // buy
						if( d > 88.6603 )
							if( d <= 89.099 )
								ret := -0.785714 // sell
							if( d > 89.099 )
								if( k <= 96.2468 )
									ret := 0.421053
								if( k > 96.2468 )
									ret := -0.260870
			if( rsi1 > 55.6242 )
				if( rsi1 <= 64.7086 )
					if( VIP <= 0.901529 )
						if( k <= 43.0597 )
							ret := 0.105263
						if( k > 43.0597 )
							if( d_k <= -24.1137 )
								if( smoothK_k <= 74.1617 )
									ret := 0.000000
								if( smoothK_k > 74.1617 )
									ret := 0.758621 // buy
							if( d_k > -24.1137 )
								if( rsi1 <= 64.3918 )
									ret := 0.773779 // buy
								if( rsi1 > 64.3918 )
									ret := 0.290323
					if( VIP > 0.901529 )
						if( rsi1 <= 61.6228 )
							if( VIM <= 1.02606 )
								if( smoothK_k <= 82.3403 )
									ret := 0.405941
								if( smoothK_k > 82.3403 )
									ret := 0.000000
							if( VIM > 1.02606 )
								if( smoothD_d <= 90.4293 )
									ret := 0.626750
								if( smoothD_d > 90.4293 )
									ret := 0.370588
						if( rsi1 > 61.6228 )
							if( VIP <= 0.925395 )
								if( smoothD_d <= 76.5811 )
									ret := 0.360000
								if( smoothD_d > 76.5811 )
									ret := 0.690265
							if( VIP > 0.925395 )
								if( smoothD_d <= 82.4826 )
									ret := 0.873134 // buy
								if( smoothD_d > 82.4826 )
									ret := 0.640000
				if( rsi1 > 64.7086 )
					if( k <= 95.6536 )
						if( smoothK_k <= 92.5539 )
							if( VIM <= 1.00402 )
								if( VIP_VIM <= -0.044004 )
									ret := 0.166667
								if( VIP_VIM > -0.044004 )
									ret := 0.583333
							if( VIM > 1.00402 )
								if( k <= 94.2011 )
									ret := 0.751232 // buy
								if( k > 94.2011 )
									ret := 0.888889 // buy
						if( smoothK_k > 92.5539 )
							ret := 0.214286
					if( k > 95.6536 )
						if( rsi1 <= 86.0611 )
							if( rsi1 <= 71.525 )
								if( VIP_VIM <= -0.18183 )
									ret := 0.880000 // buy
								if( VIP_VIM > -0.18183 )
									ret := 0.729730 // buy
							if( rsi1 > 71.525 )
								if( d <= 100 )
									ret := 0.922170 // buy
								if( d > 100 )
									ret := 0.781818 // buy
						if( rsi1 > 86.0611 )
							ret := 0.466667
		if( VIP > 0.958251 )
			if( d <= 82.5991 )
				if( smoothK_k <= 25.4202 )
					if( VIM <= 0.822209 )
						if( rsi1 <= 59.2104 )
							if( VIM <= 0.70952 )
								if( d <= 4.59478 )
									ret := -0.125000
								if( d > 4.59478 )
									ret := -0.836134 // sell
							if( VIM > 0.70952 )
								if( k <= 10.4256 )
									ret := -0.395582
								if( k > 10.4256 )
									ret := -0.591633
						if( rsi1 > 59.2104 )
							if( VIP_VIM <= 0.674548 )
								if( rsi1 <= 69.7218 )
									ret := -0.153680
								if( rsi1 > 69.7218 )
									ret := 0.236434
							if( VIP_VIM > 0.674548 )
								if( k <= 7.15493 )
									ret := -0.352941
								if( k > 7.15493 )
									ret := -0.688623
					if( VIM > 0.822209 )
						if( d_k <= 1.36332 )
							if( rsi1 <= 65.8691 )
								if( VIM <= 0.984118 )
									ret := -0.188094
								if( VIM > 0.984118 )
									ret := 0.064052
							if( rsi1 > 65.8691 )
								if( VIM <= 0.848678 )
									ret := 0.155556
								if( VIM > 0.848678 )
									ret := 0.707071 // buy
						if( d_k > 1.36332 )
							if( k <= 3.31867 )
								if( d_k <= 6.45691 )
									ret := 0.089820
								if( d_k > 6.45691 )
									ret := 0.420849
							if( k > 3.31867 )
								if( smoothD_d <= 51.4852 )
									ret := -0.009194
								if( smoothD_d > 51.4852 )
									ret := -0.583333
				if( smoothK_k > 25.4202 )
					if( VIM <= 1.00037 )
						if( k <= 89.4813 )
							if( rsi1 <= 62.5731 )
								if( VIM <= 0.841802 )
									ret := -0.401106
								if( VIM > 0.841802 )
									ret := -0.031534
							if( rsi1 > 62.5731 )
								if( VIM <= 0.865301 )
									ret := 0.092041
								if( VIM > 0.865301 )
									ret := 0.372506
						if( k > 89.4813 )
							if( smoothD_d <= 78.1097 )
								if( d <= 71.0804 )
									ret := 0.024793
								if( d > 71.0804 )
									ret := 0.378717
							if( smoothD_d > 78.1097 )
								if( rsi1 <= 76.5929 )
									ret := -0.252252
								if( rsi1 > 76.5929 )
									ret := 0.800000 // buy
					if( VIM > 1.00037 )
						if( d <= 72.2771 )
							if( d_k <= 6.40263 )
								if( smoothD_d <= 19.2666 )
									ret := -0.111111
								if( smoothD_d > 19.2666 )
									ret := 0.245661
							if( d_k > 6.40263 )
								if( rsi1 <= 50.2622 )
									ret := -0.302752
								if( rsi1 > 50.2622 )
									ret := 0.081818
						if( d > 72.2771 )
							if( d_k <= -12.7554 )
								if( VIP <= 1.07548 )
									ret := 0.625551
								if( VIP > 1.07548 )
									ret := -0.416667
							if( d_k > -12.7554 )
								if( smoothD_d <= 78.3595 )
									ret := 0.431304
								if( smoothD_d > 78.3595 )
									ret := -0.210000
			if( d > 82.5991 )
				if( d <= 95.4546 )
					if( smoothK_k <= 78.4341 )
						if( rsi1 <= 58.3387 )
							if( smoothK_k <= 75.2009 )
								if( rsi1 <= 50.0832 )
									ret := -0.379747
								if( rsi1 > 50.0832 )
									ret := 0.088531
							if( smoothK_k > 75.2009 )
								if( VIP <= 1.00995 )
									ret := 0.453704
								if( VIP > 1.00995 )
									ret := 0.180952
						if( rsi1 > 58.3387 )
							if( VIP <= 1.15291 )
								if( smoothK_k <= 77.2302 )
									ret := 0.626409
								if( smoothK_k > 77.2302 )
									ret := 0.370861
							if( VIP > 1.15291 )
								if( k <= 77.1563 )
									ret := 0.466981
								if( k > 77.1563 )
									ret := 0.138889
					if( smoothK_k > 78.4341 )
						if( rsi1 <= 62.6726 )
							if( VIP <= 1.05433 )
								if( rsi1 <= 56.3474 )
									ret := -0.098330
								if( rsi1 > 56.3474 )
									ret := 0.456476
							if( VIP > 1.05433 )
								if( rsi1 <= 48.9536 )
									ret := 0.928571 // buy
								if( rsi1 > 48.9536 )
									ret := -0.133584
						if( rsi1 > 62.6726 )
							if( VIP_VIM <= 0.192199 )
								if( VIP <= 1.0607 )
									ret := 0.659830
								if( VIP > 1.0607 )
									ret := 0.550355
							if( VIP_VIM > 0.192199 )
								if( VIP_VIM <= 0.34907 )
									ret := 0.344435
								if( VIP_VIM > 0.34907 )
									ret := 0.157516
				if( d > 95.4546 )
					if( VIM <= 0.903352 )
						if( VIP_VIM <= 0.374735 )
							if( d_k <= 0.000499 )
								if( rsi1 <= 71.8111 )
									ret := -0.247978
								if( rsi1 > 71.8111 )
									ret := 0.722892 // buy
							if( d_k > 0.000499 )
								if( smoothK_k <= 95.2463 )
									ret := 0.483294
								if( smoothK_k > 95.2463 )
									ret := 0.748971 // buy
						if( VIP_VIM > 0.374735 )
							if( k <= 89.1585 )
								ret := -0.714286 // sell
							if( k > 89.1585 )
								if( VIM <= 0.524248 )
									ret := 0.823529 // buy
								if( VIM > 0.524248 )
									ret := 0.255258
					if( VIM > 0.903352 )
						if( d <= 99.9529 )
							if( VIP <= 1.03445 )
								if( rsi1 <= 62.707 )
									ret := 0.197943
								if( rsi1 > 62.707 )
									ret := 0.794342 // buy
							if( VIP > 1.03445 )
								if( VIM <= 0.912773 )
									ret := 0.701493 // buy
								if( VIM > 0.912773 )
									ret := 0.381107
						if( d > 99.9529 )
							if( rsi1 <= 67.0513 )
								if( rsi1 <= 54.7727 )
									ret := -0.444444
								if( rsi1 > 54.7727 )
									ret := 0.305085
							if( rsi1 > 67.0513 )
								if( VIM <= 1.06965 )
									ret := 0.940860 // buy
								if( VIM > 1.06965 )
									ret := 0.727273 // buy
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_1511e08c(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


