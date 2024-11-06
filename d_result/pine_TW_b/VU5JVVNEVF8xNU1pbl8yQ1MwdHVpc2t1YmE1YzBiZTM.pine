//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: UNIUSDT_15Min_2CS0_ba5c0be3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2CS0_ba5c0be3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_ba5c0be3(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothD_d <= 67.621 )
		if( d <= 16.0109 )
			if( k <= 11.0874 )
				if( rsi1 <= 37.4993 )
					if( ad <= -8937.85 )
						if( mf <= -0.162815 )
							if( d_k <= -0.089139 )
								if( d <= 7.21928 )
									ret := -0.587302
								if( d > 7.21928 )
									ret := -0.282051
							if( d_k > -0.089139 )
								if( d_k <= 10.4332 )
									ret := -0.047407
								if( d_k > 10.4332 )
									ret := -0.705882 // sell
						if( mf > -0.162815 )
							if( smoothD_d <= 5.08779 )
								if( d_k <= 2.20939 )
									ret := -0.634554
								if( d_k > 2.20939 )
									ret := -0.359249
							if( smoothD_d > 5.08779 )
								if( ad <= -57151.5 )
									ret := -0.755556 // sell
								if( ad > -57151.5 )
									ret := -0.175123
					if( ad > -8937.85 )
						if( k <= 0.000149 )
							if( d <= 0.002235 )
								if( rsi1 <= 9.33351 )
									ret := -0.935484 // sell
								if( rsi1 > 9.33351 )
									ret := -0.232558
							if( d > 0.002235 )
								if( ad <= 1414.52 )
									ret := -0.300000
								if( ad > 1414.52 )
									ret := -0.586022
						if( k > 0.000149 )
							if( k <= 3.86607 )
								if( rsi1 <= 6.83661 )
									ret := 0.000000
								if( rsi1 > 6.83661 )
									ret := -0.622775
							if( k > 3.86607 )
								if( rsi1 <= 28.5647 )
									ret := -0.572309
								if( rsi1 > 28.5647 )
									ret := -0.444246
				if( rsi1 > 37.4993 )
					if( k <= 9.67751 )
						if( ad <= 13377.3 )
							if( mf <= -0.011733 )
								if( k <= 8.04062 )
									ret := -0.041667
								if( k > 8.04062 )
									ret := -0.293893
							if( mf > -0.011733 )
								if( rsi1 <= 49.9562 )
									ret := -0.353818
								if( rsi1 > 49.9562 )
									ret := -0.109612
						if( ad > 13377.3 )
							if( mf <= 0.053246 )
								if( ad <= 41664.7 )
									ret := -0.427350
								if( ad > 41664.7 )
									ret := 0.063830
							if( mf > 0.053246 )
								if( smoothK_k <= 6.38886 )
									ret := -0.647863
								if( smoothK_k > 6.38886 )
									ret := 0.272727
					if( k > 9.67751 )
						if( rsi1 <= 53.2006 )
							if( ad_mf <= 8706.43 )
								if( mf <= 0.046533 )
									ret := -0.282528
								if( mf > 0.046533 )
									ret := -0.531707
							if( ad_mf > 8706.43 )
								if( smoothD_d <= 3.50751 )
									ret := -0.400000
								if( smoothD_d > 3.50751 )
									ret := -0.798387 // sell
						if( rsi1 > 53.2006 )
							if( ad <= 9415.57 )
								if( ad <= 3261.55 )
									ret := 0.032258
								if( ad > 3261.55 )
									ret := 0.461538
							if( ad > 9415.57 )
								if( smoothK_k <= 7.22672 )
									ret := -0.666667
								if( smoothK_k > 7.22672 )
									ret := -0.156250
			if( k > 11.0874 )
				if( ad <= 15165.1 )
					if( rsi1 <= 51.0808 )
						if( d <= 11.4091 )
							if( mf <= 0.149039 )
								if( rsi1 <= 41.3617 )
									ret := -0.433644
								if( rsi1 > 41.3617 )
									ret := -0.110561
							if( mf > 0.149039 )
								if( d_k <= -4.19196 )
									ret := -0.615672
								if( d_k > -4.19196 )
									ret := -0.356322
						if( d > 11.4091 )
							if( ad_mf <= 14995.9 )
								if( rsi1 <= 45.7964 )
									ret := -0.276786
								if( rsi1 > 45.7964 )
									ret := -0.085648
							if( ad_mf > 14995.9 )
								ret := 0.846154 // buy
					if( rsi1 > 51.0808 )
						if( ad <= -18177.8 )
							if( ad <= -144335 )
								ret := 1.000000 // buy
							if( ad > -144335 )
								if( rsi1 <= 54.2078 )
									ret := 0.000000
								if( rsi1 > 54.2078 )
									ret := 0.604396
						if( ad > -18177.8 )
							if( d_k <= -3.95657 )
								if( d_k <= -6.00912 )
									ret := 0.119192
								if( d_k > -6.00912 )
									ret := -0.099291
							if( d_k > -3.95657 )
								if( mf <= -0.107953 )
									ret := 0.818182 // buy
								if( mf > -0.107953 )
									ret := 0.279167
				if( ad > 15165.1 )
					if( mf <= 0.066813 )
						if( smoothD_d <= 9.76452 )
							if( d <= 11.7881 )
								if( k <= 22.9335 )
									ret := -0.286667
								if( k > 22.9335 )
									ret := -0.937500 // sell
							if( d > 11.7881 )
								if( rsi1 <= 33.243 )
									ret := 0.625000
								if( rsi1 > 33.243 )
									ret := -0.150000
						if( smoothD_d > 9.76452 )
							if( rsi1 <= 48.6287 )
								if( mf <= -0.166547 )
									ret := -0.064516
								if( mf > -0.166547 )
									ret := -0.654822
							if( rsi1 > 48.6287 )
								if( mf <= 0.006808 )
									ret := -0.227273
								if( mf > 0.006808 )
									ret := 0.733333 // buy
					if( mf > 0.066813 )
						if( k <= 27.7067 )
							if( rsi1 <= 56.897 )
								if( ad_mf <= 17586.7 )
									ret := -0.845070 // sell
								if( ad_mf > 17586.7 )
									ret := -0.575658
							if( rsi1 > 56.897 )
								if( ad_mf <= 31156.6 )
									ret := -0.022727
								if( ad_mf > 31156.6 )
									ret := -0.555556
						if( k > 27.7067 )
							ret := 0.411765
		if( d > 16.0109 )
			if( rsi1 <= 51.1663 )
				if( mf <= 0.024731 )
					if( d_k <= 3.5172 )
						if( ad <= -16709.7 )
							if( rsi1 <= 39.6469 )
								if( smoothD_d <= 46.1542 )
									ret := 0.036863
								if( smoothD_d > 46.1542 )
									ret := 0.317726
							if( rsi1 > 39.6469 )
								if( k <= 16.767 )
									ret := -0.666667
								if( k > 16.767 )
									ret := 0.407299
						if( ad > -16709.7 )
							if( smoothK_k <= 58.4031 )
								if( smoothD_d <= 54.0659 )
									ret := -0.091088
								if( smoothD_d > 54.0659 )
									ret := -0.367150
							if( smoothK_k > 58.4031 )
								if( ad <= -2860.84 )
									ret := 0.238349
								if( ad > -2860.84 )
									ret := -0.007701
					if( d_k > 3.5172 )
						if( ad_mf <= -15537.1 )
							if( smoothK_k <= 30.6685 )
								if( ad <= -16891.3 )
									ret := -0.189001
								if( ad > -16891.3 )
									ret := 0.217391
							if( smoothK_k > 30.6685 )
								if( smoothD_d <= 66.9792 )
									ret := 0.051980
								if( smoothD_d > 66.9792 )
									ret := 0.888889 // buy
						if( ad_mf > -15537.1 )
							if( rsi1 <= 38.8777 )
								if( d_k <= 5.49616 )
									ret := -0.186916
								if( d_k > 5.49616 )
									ret := -0.391356
							if( rsi1 > 38.8777 )
								if( ad_mf <= 1307.66 )
									ret := -0.054945
								if( ad_mf > 1307.66 )
									ret := -0.292221
				if( mf > 0.024731 )
					if( ad_mf <= 5342.89 )
						if( rsi1 <= 48.5343 )
							if( ad_mf <= -52542.8 )
								if( ad_mf <= -286950 )
									ret := 0.600000
								if( ad_mf > -286950 )
									ret := -0.587209
							if( ad_mf > -52542.8 )
								if( ad_mf <= -50457.6 )
									ret := 0.842105 // buy
								if( ad_mf > -50457.6 )
									ret := -0.224159
						if( rsi1 > 48.5343 )
							if( ad <= -63154.9 )
								if( d_k <= 1.12407 )
									ret := -0.555556
								if( d_k > 1.12407 )
									ret := -0.933333 // sell
							if( ad > -63154.9 )
								if( ad_mf <= -19672.6 )
									ret := 0.337838
								if( ad_mf > -19672.6 )
									ret := -0.057728
					if( ad_mf > 5342.89 )
						if( smoothK_k <= 22.4254 )
							if( smoothD_d <= 16.467 )
								if( rsi1 <= 49.5747 )
									ret := -0.419355
								if( rsi1 > 49.5747 )
									ret := 0.081081
							if( smoothD_d > 16.467 )
								if( d_k <= 28.0443 )
									ret := -0.625954
								if( d_k > 28.0443 )
									ret := -0.100000
						if( smoothK_k > 22.4254 )
							if( d <= 45.3471 )
								if( smoothK_k <= 34.6809 )
									ret := -0.349660
								if( smoothK_k > 34.6809 )
									ret := -0.098039
							if( d > 45.3471 )
								if( smoothK_k <= 49.0665 )
									ret := -0.617308
								if( smoothK_k > 49.0665 )
									ret := -0.253823
			if( rsi1 > 51.1663 )
				if( mf <= 0.139985 )
					if( ad_mf <= -5067.83 )
						if( k <= 54.144 )
							if( ad_mf <= -5604.87 )
								if( d_k <= 3.42347 )
									ret := 0.308057
								if( d_k > 3.42347 )
									ret := 0.136007
							if( ad_mf > -5604.87 )
								if( d <= 60.1977 )
									ret := 0.661538
								if( d > 60.1977 )
									ret := -0.153846
						if( k > 54.144 )
							if( ad <= -133632 )
								if( ad_mf <= -148973 )
									ret := 0.191489
								if( ad_mf > -148973 )
									ret := -0.866667 // sell
							if( ad > -133632 )
								if( d_k <= -6.86331 )
									ret := 0.529312
								if( d_k > -6.86331 )
									ret := 0.282303
					if( ad_mf > -5067.83 )
						if( rsi1 <= 63.0466 )
							if( ad_mf <= -531.188 )
								if( d_k <= -0.20304 )
									ret := 0.288344
								if( d_k > -0.20304 )
									ret := -0.020333
							if( ad_mf > -531.188 )
								if( mf <= -0.004133 )
									ret := 0.104193
								if( mf > -0.004133 )
									ret := -0.002643
						if( rsi1 > 63.0466 )
							if( d_k <= -8.6293 )
								if( rsi1 <= 65.686 )
									ret := 0.341463
								if( rsi1 > 65.686 )
									ret := 0.491848
							if( d_k > -8.6293 )
								if( ad_mf <= 29018.3 )
									ret := 0.090539
								if( ad_mf > 29018.3 )
									ret := 0.345029
				if( mf > 0.139985 )
					if( ad_mf <= 15200.7 )
						if( d_k <= 4.25062 )
							if( ad <= -398.952 )
								if( k <= 27.6673 )
									ret := -0.108434
								if( k > 27.6673 )
									ret := 0.303471
							if( ad > -398.952 )
								if( ad_mf <= 422.518 )
									ret := -0.263889
								if( ad_mf > 422.518 )
									ret := 0.164371
						if( d_k > 4.25062 )
							if( ad <= 15073.5 )
								if( ad_mf <= 5189.72 )
									ret := -0.007879
								if( ad_mf > 5189.72 )
									ret := -0.201439
							if( ad > 15073.5 )
								ret := 1.000000 // buy
					if( ad_mf > 15200.7 )
						if( rsi1 <= 69.6072 )
							if( k <= 23.7894 )
								if( rsi1 <= 56.5095 )
									ret := -0.745902 // sell
								if( rsi1 > 56.5095 )
									ret := -0.425532
							if( k > 23.7894 )
								if( k <= 80.9238 )
									ret := -0.295623
								if( k > 80.9238 )
									ret := 0.333333
						if( rsi1 > 69.6072 )
							if( d <= 52.6338 )
								if( ad_mf <= 66843 )
									ret := 0.068966
								if( ad_mf > 66843 )
									ret := -0.490566
							if( d > 52.6338 )
								if( ad <= 85861 )
									ret := 0.481818
								if( ad > 85861 )
									ret := -0.192982
	if( smoothD_d > 67.621 )
		if( rsi1 <= 59.1271 )
			if( ad_mf <= -22885.3 )
				if( rsi1 <= 33.3345 )
					if( d_k <= -3.63425 )
						if( d_k <= -11.6862 )
							ret := -0.400000
						if( d_k > -11.6862 )
							ret := 0.894737 // buy
					if( d_k > -3.63425 )
						if( rsi1 <= 26.432 )
							ret := -0.785714 // sell
						if( rsi1 > 26.432 )
							if( mf <= -0.208465 )
								if( smoothD_d <= 81.5232 )
									ret := -0.750000 // sell
								if( smoothD_d > 81.5232 )
									ret := -0.230769
							if( mf > -0.208465 )
								ret := 0.200000
				if( rsi1 > 33.3345 )
					if( mf <= -0.143374 )
						if( ad <= -23692.7 )
							if( smoothD_d <= 72.2761 )
								if( rsi1 <= 36.7214 )
									ret := 1.000000 // buy
								if( rsi1 > 36.7214 )
									ret := 0.757143 // buy
							if( smoothD_d > 72.2761 )
								if( smoothK_k <= 88.9253 )
									ret := 0.478049
								if( smoothK_k > 88.9253 )
									ret := 0.700000 // buy
						if( ad > -23692.7 )
							if( smoothD_d <= 72.0909 )
								ret := 0.571429
							if( smoothD_d > 72.0909 )
								ret := 1.000000 // buy
					if( mf > -0.143374 )
						if( rsi1 <= 57.661 )
							if( d <= 79.4545 )
								if( k <= 89.8352 )
									ret := 0.137536
								if( k > 89.8352 )
									ret := 0.916667 // buy
							if( d > 79.4545 )
								if( smoothD_d <= 83.706 )
									ret := 0.606811
								if( smoothD_d > 83.706 )
									ret := 0.370492
						if( rsi1 > 57.661 )
							if( mf <= 0.084893 )
								if( d <= 91.3445 )
									ret := 0.057971
								if( d > 91.3445 )
									ret := 1.000000 // buy
							if( mf > 0.084893 )
								ret := -0.714286 // sell
			if( ad_mf > -22885.3 )
				if( k <= 81.5857 )
					if( ad_mf <= 8329.66 )
						if( smoothD_d <= 81.1818 )
							if( mf <= -0.159617 )
								if( mf <= -0.160859 )
									ret := 0.150870
								if( mf > -0.160859 )
									ret := 0.666667
							if( mf > -0.159617 )
								if( ad_mf <= -4789.74 )
									ret := -0.214900
								if( ad_mf > -4789.74 )
									ret := 0.036010
						if( smoothD_d > 81.1818 )
							if( ad <= -16758.6 )
								if( rsi1 <= 53.2527 )
									ret := 0.612903
								if( rsi1 > 53.2527 )
									ret := -0.037037
							if( ad > -16758.6 )
								if( rsi1 <= 50.0263 )
									ret := -0.042500
								if( rsi1 > 50.0263 )
									ret := 0.199566
					if( ad_mf > 8329.66 )
						if( ad_mf <= 11849.9 )
							if( d_k <= -5.03398 )
								if( smoothD_d <= 69.8485 )
									ret := 0.076923
								if( smoothD_d > 69.8485 )
									ret := -0.153846
							if( d_k > -5.03398 )
								if( ad_mf <= 8851.77 )
									ret := -0.828571 // sell
								if( ad_mf > 8851.77 )
									ret := -0.387543
						if( ad_mf > 11849.9 )
							if( ad <= 48103.5 )
								if( ad_mf <= 45486.3 )
									ret := -0.058664
								if( ad_mf > 45486.3 )
									ret := 0.846154 // buy
							if( ad > 48103.5 )
								if( mf <= -0.140336 )
									ret := 0.550000
								if( mf > -0.140336 )
									ret := -0.430493
				if( k > 81.5857 )
					if( ad <= 636.91 )
						if( rsi1 <= 45.8389 )
							if( d <= 85.3329 )
								if( k <= 96.1986 )
									ret := 0.133676
								if( k > 96.1986 )
									ret := 0.629630
							if( d > 85.3329 )
								if( d <= 91.1494 )
									ret := -0.250000
								if( d > 91.1494 )
									ret := 0.082781
						if( rsi1 > 45.8389 )
							if( ad_mf <= 0.072158 )
								if( ad <= -12798.3 )
									ret := 0.166071
								if( ad > -12798.3 )
									ret := 0.337818
							if( ad_mf > 0.072158 )
								if( ad_mf <= 0.183659 )
									ret := -0.238462
								if( ad_mf > 0.183659 )
									ret := 0.313636
					if( ad > 636.91 )
						if( ad_mf <= 22971.4 )
							if( smoothK_k <= 90.4765 )
								if( smoothK_k <= 84.1536 )
									ret := 0.073964
								if( smoothK_k > 84.1536 )
									ret := -0.053402
							if( smoothK_k > 90.4765 )
								if( mf <= 0.057866 )
									ret := 0.192952
								if( mf > 0.057866 )
									ret := 0.075758
						if( ad_mf > 22971.4 )
							if( rsi1 <= 44.7919 )
								if( d_k <= 3.70197 )
									ret := -0.234940
								if( d_k > 3.70197 )
									ret := 0.714286 // buy
							if( rsi1 > 44.7919 )
								if( mf <= 0.120204 )
									ret := 0.408805
								if( mf > 0.120204 )
									ret := -0.283019
		if( rsi1 > 59.1271 )
			if( rsi1 <= 77.4714 )
				if( smoothD_d <= 81.7366 )
					if( d_k <= -7.37451 )
						if( ad <= 8033.65 )
							if( d <= 70.8283 )
								ret := -0.100000
							if( d > 70.8283 )
								if( ad_mf <= -5516.63 )
									ret := 0.632495
								if( ad_mf > -5516.63 )
									ret := 0.461098
						if( ad > 8033.65 )
							if( rsi1 <= 69.5096 )
								if( smoothK_k <= 95.6643 )
									ret := 0.128788
								if( smoothK_k > 95.6643 )
									ret := 0.652174
							if( rsi1 > 69.5096 )
								if( d <= 76.2866 )
									ret := 0.550725
								if( d > 76.2866 )
									ret := 0.284672
					if( d_k > -7.37451 )
						if( mf <= 0.205878 )
							if( mf <= 0.020287 )
								if( mf <= -0.09714 )
									ret := 0.171569
								if( mf > -0.09714 )
									ret := 0.412611
							if( mf > 0.020287 )
								if( ad <= 6805.52 )
									ret := 0.253693
								if( ad > 6805.52 )
									ret := 0.114387
						if( mf > 0.205878 )
							if( mf <= 0.337055 )
								if( ad <= -38198.9 )
									ret := -0.461538
								if( ad > -38198.9 )
									ret := 0.122699
							if( mf > 0.337055 )
								if( d_k <= 8.68232 )
									ret := -0.284848
								if( d_k > 8.68232 )
									ret := 0.156250
				if( smoothD_d > 81.7366 )
					if( mf <= 0.067971 )
						if( d <= 99.9293 )
							if( k <= 92.1212 )
								if( ad_mf <= -28853.4 )
									ret := 0.648352
								if( ad_mf > -28853.4 )
									ret := 0.395319
							if( k > 92.1212 )
								if( rsi1 <= 74.0743 )
									ret := 0.530307
								if( rsi1 > 74.0743 )
									ret := 0.696925
						if( d > 99.9293 )
							if( ad_mf <= 1526.65 )
								if( ad <= -2075.6 )
									ret := 0.317460
								if( ad > -2075.6 )
									ret := -0.571429
							if( ad_mf > 1526.65 )
								if( ad <= 10923.3 )
									ret := 0.166667
								if( ad > 10923.3 )
									ret := 0.518519
					if( mf > 0.067971 )
						if( ad_mf <= 86736.6 )
							if( mf <= 0.184394 )
								if( d <= 99.6678 )
									ret := 0.421899
								if( d > 99.6678 )
									ret := 0.090000
							if( mf > 0.184394 )
								if( rsi1 <= 72.795 )
									ret := 0.250179
								if( rsi1 > 72.795 )
									ret := 0.428384
						if( ad_mf > 86736.6 )
							if( rsi1 <= 66.4885 )
								if( d_k <= -2.22802 )
									ret := -0.333333
								if( d_k > -2.22802 )
									ret := 0.447368
							if( rsi1 > 66.4885 )
								if( ad <= 101057 )
									ret := -0.900000 // sell
								if( ad > 101057 )
									ret := 0.012048
			if( rsi1 > 77.4714 )
				if( d <= 95.6453 )
					if( k <= 89.0506 )
						if( mf <= 0.113316 )
							if( mf <= 0.067234 )
								if( ad <= 32380.8 )
									ret := 0.409091
								if( ad > 32380.8 )
									ret := -0.230769
							if( mf > 0.067234 )
								if( d_k <= 3.67795 )
									ret := -0.127660
								if( d_k > 3.67795 )
									ret := 0.428571
						if( mf > 0.113316 )
							if( ad_mf <= 8175.8 )
								if( ad <= -11685 )
									ret := 0.752688 // buy
								if( ad > -11685 )
									ret := 0.220884
							if( ad_mf > 8175.8 )
								if( d_k <= -4.63768 )
									ret := 0.000000
								if( d_k > -4.63768 )
									ret := 0.633641
					if( k > 89.0506 )
						if( d <= 92.7734 )
							if( mf <= 0.275759 )
								if( ad <= -536.961 )
									ret := 0.804781 // buy
								if( ad > -536.961 )
									ret := 0.658153
							if( mf > 0.275759 )
								if( smoothK_k <= 90.1945 )
									ret := 0.705263 // buy
								if( smoothK_k > 90.1945 )
									ret := 0.076923
						if( d > 92.7734 )
							if( mf <= 0.07859 )
								if( d_k <= 1.33989 )
									ret := 0.795000 // buy
								if( d_k > 1.33989 )
									ret := 0.388889
							if( mf > 0.07859 )
								if( ad_mf <= 73817.4 )
									ret := 0.371490
								if( ad_mf > 73817.4 )
									ret := 0.652174
				if( d > 95.6453 )
					if( smoothK_k <= 96.9994 )
						if( rsi1 <= 97.3818 )
							if( smoothK_k <= 96.8287 )
								if( mf <= -0.273197 )
									ret := 0.058824
								if( mf > -0.273197 )
									ret := 0.685455
							if( smoothK_k > 96.8287 )
								if( mf <= 0.040308 )
									ret := 0.714286 // buy
								if( mf > 0.040308 )
									ret := 0.904762 // buy
						if( rsi1 > 97.3818 )
							ret := 0.100000
					if( smoothK_k > 96.9994 )
						if( d_k <= -1.24841 )
							if( mf <= 0.079926 )
								if( rsi1 <= 80.4874 )
									ret := 0.851852 // buy
								if( rsi1 > 80.4874 )
									ret := 0.657143
							if( mf > 0.079926 )
								if( ad_mf <= 69584.3 )
									ret := 0.315789
								if( ad_mf > 69584.3 )
									ret := 0.800000 // buy
						if( d_k > -1.24841 )
							if( ad <= -12458.4 )
								ret := 0.130435
							if( ad > -12458.4 )
								if( rsi1 <= 80.0066 )
									ret := 0.450549
								if( rsi1 > 80.0066 )
									ret := 0.718354 // buy
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_ba5c0be3(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


