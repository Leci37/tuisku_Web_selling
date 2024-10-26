//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: TRXUSDT_30Min_2CS0_f3b1bc5c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2CS0_f3b1bc5c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_f3b1bc5c(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 36.0757 )
		if( smoothD_d <= 29.4942 )
			if( rsi1 <= 41.9986 )
				if( d_k <= -1.53532 )
					if( k <= 17.3073 )
						if( rsi1 <= 21.2053 )
							if( ad_mf <= -3.4512e+07 )
								if( ad <= -3.96726e+07 )
									ret := -0.603448
								if( ad > -3.96726e+07 )
									ret := 0.200000
							if( ad_mf > -3.4512e+07 )
								if( ad <= 1.824e+06 )
									ret := -0.720721 // sell
								if( ad > 1.824e+06 )
									ret := -0.489583
						if( rsi1 > 21.2053 )
							if( ad_mf <= -8.27027e+06 )
								if( smoothD_d <= 4.41667 )
									ret := -0.253333
								if( smoothD_d > 4.41667 )
									ret := 0.187135
							if( ad_mf > -8.27027e+06 )
								if( ad_mf <= 6.2902e+06 )
									ret := -0.383104
								if( ad_mf > 6.2902e+06 )
									ret := -0.155702
					if( k > 17.3073 )
						if( rsi1 <= 31.1482 )
							if( d <= 28.742 )
								if( rsi1 <= 23.9351 )
									ret := -0.406162
								if( rsi1 > 23.9351 )
									ret := -0.165344
							if( d > 28.742 )
								if( ad_mf <= -1.48094e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -1.48094e+07 )
									ret := -0.600000
						if( rsi1 > 31.1482 )
							if( ad <= -1.04961e+07 )
								if( d_k <= -4.46301 )
									ret := 0.598945
								if( d_k > -4.46301 )
									ret := 0.133858
							if( ad > -1.04961e+07 )
								if( mf <= 0.086413 )
									ret := 0.052874
								if( mf > 0.086413 )
									ret := -0.405498
				if( d_k > -1.53532 )
					if( ad <= 5.86999e+06 )
						if( d_k <= 6.70121 )
							if( rsi1 <= 33.3297 )
								if( rsi1 <= 23.4311 )
									ret := -0.700473 // sell
								if( rsi1 > 23.4311 )
									ret := -0.536707
							if( rsi1 > 33.3297 )
								if( d_k <= 1.86685 )
									ret := -0.250796
								if( d_k > 1.86685 )
									ret := -0.401991
						if( d_k > 6.70121 )
							if( ad <= -1.74253e+06 )
								if( ad_mf <= -1.58783e+08 )
									ret := 0.461538
								if( ad_mf > -1.58783e+08 )
									ret := -0.729135 // sell
							if( ad > -1.74253e+06 )
								if( ad_mf <= -383842 )
									ret := -0.412060
								if( ad_mf > -383842 )
									ret := -0.562921
					if( ad > 5.86999e+06 )
						if( ad <= 1.23353e+08 )
							if( d_k <= 6.27429 )
								if( rsi1 <= 33.2362 )
									ret := -0.700483 // sell
								if( rsi1 > 33.2362 )
									ret := -0.507151
							if( d_k > 6.27429 )
								if( ad_mf <= 7.04544e+07 )
									ret := -0.772668 // sell
								if( ad_mf > 7.04544e+07 )
									ret := -0.310345
						if( ad > 1.23353e+08 )
							if( ad_mf <= 1.39735e+08 )
								ret := 1.000000 // buy
							if( ad_mf > 1.39735e+08 )
								ret := -0.208333
			if( rsi1 > 41.9986 )
				if( mf <= 0.038862 )
					if( smoothK_k <= 14.6495 )
						if( d <= 20.9065 )
							if( rsi1 <= 46.0415 )
								if( smoothD_d <= 13.7204 )
									ret := -0.109836
								if( smoothD_d > 13.7204 )
									ret := -0.405660
							if( rsi1 > 46.0415 )
								if( rsi1 <= 58.8319 )
									ret := 0.113111
								if( rsi1 > 58.8319 )
									ret := 0.461538
						if( d > 20.9065 )
							if( ad_mf <= -2.74839e+07 )
								if( ad <= -4.38738e+07 )
									ret := -0.975610 // sell
								if( ad > -4.38738e+07 )
									ret := -0.625000
							if( ad_mf > -2.74839e+07 )
								if( k <= 9.73949 )
									ret := -0.603448
								if( k > 9.73949 )
									ret := -0.235849
					if( smoothK_k > 14.6495 )
						if( d_k <= -3.24413 )
							if( ad <= -7.07601e+06 )
								if( d <= 12.1779 )
									ret := 0.370370
								if( d > 12.1779 )
									ret := 0.690531
							if( ad > -7.07601e+06 )
								if( mf <= -0.251801 )
									ret := -0.210526
								if( mf > -0.251801 )
									ret := 0.430601
						if( d_k > -3.24413 )
							if( ad_mf <= -8.45929e+06 )
								if( ad_mf <= -3.7862e+07 )
									ret := -0.100000
								if( ad_mf > -3.7862e+07 )
									ret := 0.474286
							if( ad_mf > -8.45929e+06 )
								if( rsi1 <= 58.0055 )
									ret := -0.013283
								if( rsi1 > 58.0055 )
									ret := 0.416667
				if( mf > 0.038862 )
					if( rsi1 <= 51.9185 )
						if( smoothK_k <= 14.7502 )
							if( smoothD_d <= 11.6722 )
								if( ad <= 3.39491e+06 )
									ret := -0.198092
								if( ad > 3.39491e+06 )
									ret := -0.366106
							if( smoothD_d > 11.6722 )
								if( smoothD_d <= 22.8556 )
									ret := -0.438479
								if( smoothD_d > 22.8556 )
									ret := -0.691057
						if( smoothK_k > 14.7502 )
							if( d_k <= 0.949009 )
								if( mf <= 0.109942 )
									ret := 0.229452
								if( mf > 0.109942 )
									ret := 0.031879
							if( d_k > 0.949009 )
								if( d_k <= 8.9837 )
									ret := -0.331445
								if( d_k > 8.9837 )
									ret := -0.647887
					if( rsi1 > 51.9185 )
						if( k <= 6.97195 )
							if( ad <= -1.50752e+07 )
								if( k <= 2.69098 )
									ret := -0.707692 // sell
								if( k > 2.69098 )
									ret := -0.228916
							if( ad > -1.50752e+07 )
								if( ad_mf <= 3.72757e+07 )
									ret := -0.078638
								if( ad_mf > 3.72757e+07 )
									ret := -0.735294 // sell
						if( k > 6.97195 )
							if( d_k <= 2.99885 )
								if( mf <= 0.217363 )
									ret := 0.371378
								if( mf > 0.217363 )
									ret := 0.068966
							if( d_k > 2.99885 )
								if( ad <= -2.68841e+06 )
									ret := 0.137584
								if( ad > -2.68841e+06 )
									ret := -0.137006
		if( smoothD_d > 29.4942 )
			if( ad_mf <= 5.57414e+06 )
				if( rsi1 <= 52.2685 )
					if( k <= 32.8585 )
						if( ad <= -8.41835e+07 )
							if( mf <= -0.063824 )
								if( rsi1 <= 37.8182 )
									ret := -0.200000
								if( rsi1 > 37.8182 )
									ret := -0.800000 // sell
							if( mf > -0.063824 )
								if( ad_mf <= -1.05876e+08 )
									ret := 0.875000 // buy
								if( ad_mf > -1.05876e+08 )
									ret := -0.058824
						if( ad > -8.41835e+07 )
							if( k <= 32.7631 )
								if( rsi1 <= 36.9532 )
									ret := -0.716129 // sell
								if( rsi1 > 36.9532 )
									ret := -0.478312
							if( k > 32.7631 )
								ret := -1.000000 // sell
					if( k > 32.8585 )
						if( d_k <= 0.458018 )
							if( k <= 35.1076 )
								if( mf <= 0.000897 )
									ret := 0.235294
								if( mf > 0.000897 )
									ret := 0.729730 // buy
							if( k > 35.1076 )
								if( smoothK_k <= 32.2965 )
									ret := -0.705882 // sell
								if( smoothK_k > 32.2965 )
									ret := -0.075472
						if( d_k > 0.458018 )
							if( mf <= 0.012103 )
								if( d_k <= 19.5941 )
									ret := -0.346032
								if( d_k > 19.5941 )
									ret := 0.100000
							if( mf > 0.012103 )
								if( d_k <= 19.9287 )
									ret := -0.692308
								if( d_k > 19.9287 )
									ret := -0.369565
				if( rsi1 > 52.2685 )
					if( d_k <= 13.6009 )
						if( rsi1 <= 62.6206 )
							if( d_k <= -0.561337 )
								ret := 0.687500
							if( d_k > -0.561337 )
								if( ad_mf <= -724892 )
									ret := 0.130435
								if( ad_mf > -724892 )
									ret := -0.059406
						if( rsi1 > 62.6206 )
							if( k <= 25.7833 )
								ret := -0.133333
							if( k > 25.7833 )
								if( mf <= 0.079592 )
									ret := 0.783784 // buy
								if( mf > 0.079592 )
									ret := 0.346939
					if( d_k > 13.6009 )
						if( mf <= 0.346429 )
							if( ad <= -7.94855e+06 )
								if( d_k <= 17.7008 )
									ret := -0.027397
								if( d_k > 17.7008 )
									ret := -0.542373
							if( ad > -7.94855e+06 )
								if( mf <= 0.097108 )
									ret := 0.000000
								if( mf > 0.097108 )
									ret := -0.152027
						if( mf > 0.346429 )
							if( d_k <= 16.7637 )
								ret := 0.312500
							if( d_k > 16.7637 )
								if( d_k <= 29.2779 )
									ret := -0.153846
								if( d_k > 29.2779 )
									ret := 0.400000
			if( ad_mf > 5.57414e+06 )
				if( smoothK_k <= 18.3188 )
					if( rsi1 <= 59.6487 )
						if( rsi1 <= 43.0963 )
							if( ad <= 3.9495e+07 )
								if( smoothK_k <= 9.15905 )
									ret := -0.785714 // sell
								if( smoothK_k > 9.15905 )
									ret := -0.961905 // sell
							if( ad > 3.9495e+07 )
								ret := -0.764706 // sell
						if( rsi1 > 43.0963 )
							if( smoothD_d <= 41.7551 )
								if( ad <= 2.4983e+07 )
									ret := -0.750000 // sell
								if( ad > 2.4983e+07 )
									ret := -0.954545 // sell
							if( smoothD_d > 41.7551 )
								ret := -0.454545
					if( rsi1 > 59.6487 )
						if( ad_mf <= 1.21285e+07 )
							ret := 0.450000
						if( ad_mf > 1.21285e+07 )
							if( rsi1 <= 62.0045 )
								ret := -0.300000
							if( rsi1 > 62.0045 )
								if( k <= 18.0969 )
									ret := -0.800000 // sell
								if( k > 18.0969 )
									ret := -1.000000 // sell
				if( smoothK_k > 18.3188 )
					if( d_k <= 1.05996 )
						if( rsi1 <= 50.5687 )
							if( k <= 34.7486 )
								if( d_k <= -0.446252 )
									ret := 0.375000
								if( d_k > -0.446252 )
									ret := -0.444444
							if( k > 34.7486 )
								if( mf <= -0.006607 )
									ret := -1.000000 // sell
								if( mf > -0.006607 )
									ret := -0.600000
						if( rsi1 > 50.5687 )
							if( d_k <= 0.255443 )
								ret := 0.052632
							if( d_k > 0.255443 )
								ret := 1.000000 // buy
					if( d_k > 1.05996 )
						if( mf <= -0.025861 )
							if( rsi1 <= 56.0527 )
								if( mf <= -0.111219 )
									ret := -0.480000
								if( mf > -0.111219 )
									ret := -0.890710 // sell
							if( rsi1 > 56.0527 )
								ret := 0.333333
						if( mf > -0.025861 )
							if( smoothD_d <= 36.8778 )
								if( smoothD_d <= 36.7002 )
									ret := -0.463822
								if( smoothD_d > 36.7002 )
									ret := 0.416667
							if( smoothD_d > 36.8778 )
								if( rsi1 <= 54.2166 )
									ret := -0.737470 // sell
								if( rsi1 > 54.2166 )
									ret := -0.343220
	if( k > 36.0757 )
		if( d_k <= 2.04315 )
			if( rsi1 <= 46.6963 )
				if( d_k <= -4.10763 )
					if( ad <= -7.95163e+06 )
						if( d_k <= -13.4541 )
							if( ad <= -6.09882e+07 )
								if( smoothD_d <= 39.9369 )
									ret := 0.939394 // buy
								if( smoothD_d > 39.9369 )
									ret := 0.761194 // buy
							if( ad > -6.09882e+07 )
								if( mf <= -0.329682 )
									ret := -0.066667
								if( mf > -0.329682 )
									ret := 0.544355
						if( d_k > -13.4541 )
							if( rsi1 <= 33.231 )
								if( ad_mf <= -1.4063e+08 )
									ret := 1.000000 // buy
								if( ad_mf > -1.4063e+08 )
									ret := -0.081448
							if( rsi1 > 33.231 )
								if( d <= 53.0498 )
									ret := 0.562334
								if( d > 53.0498 )
									ret := 0.363985
					if( ad > -7.95163e+06 )
						if( d_k <= -10.3276 )
							if( ad_mf <= 6.03673e+06 )
								if( d <= 42.5536 )
									ret := -0.078910
								if( d > 42.5536 )
									ret := 0.123698
							if( ad_mf > 6.03673e+06 )
								if( rsi1 <= 36.7016 )
									ret := 0.021201
								if( rsi1 > 36.7016 )
									ret := 0.428786
						if( d_k > -10.3276 )
							if( rsi1 <= 38.7956 )
								if( k <= 90.5027 )
									ret := -0.256211
								if( k > 90.5027 )
									ret := 0.454545
							if( rsi1 > 38.7956 )
								if( mf <= 0.080742 )
									ret := 0.153675
								if( mf > 0.080742 )
									ret := -0.167702
				if( d_k > -4.10763 )
					if( smoothD_d <= 79.2749 )
						if( d_k <= -0.584164 )
							if( ad <= -3.72797e+07 )
								if( d_k <= -3.00117 )
									ret := -0.941176 // sell
								if( d_k > -3.00117 )
									ret := -0.548387
							if( ad > -3.72797e+07 )
								if( ad_mf <= -6.70384e+06 )
									ret := 0.142384
								if( ad_mf > -6.70384e+06 )
									ret := -0.284188
						if( d_k > -0.584164 )
							if( d_k <= 1.99691 )
								if( ad_mf <= 2.22884e+06 )
									ret := -0.357564
								if( ad_mf > 2.22884e+06 )
									ret := -0.574163
							if( d_k > 1.99691 )
								ret := 0.222222
					if( smoothD_d > 79.2749 )
						if( ad <= -1.79156e+07 )
							if( k <= 97.455 )
								if( rsi1 <= 39.1379 )
									ret := 0.117647
								if( rsi1 > 39.1379 )
									ret := 0.703704 // buy
							if( k > 97.455 )
								ret := 0.928571 // buy
						if( ad > -1.79156e+07 )
							if( smoothD_d <= 92.487 )
								if( ad <= -7.88361e+06 )
									ret := 0.289474
								if( ad > -7.88361e+06 )
									ret := -0.132616
							if( smoothD_d > 92.487 )
								if( rsi1 <= 43.8308 )
									ret := 0.044643
								if( rsi1 > 43.8308 )
									ret := 0.555556
			if( rsi1 > 46.6963 )
				if( d_k <= -0.112802 )
					if( rsi1 <= 60.7427 )
						if( rsi1 <= 53.5736 )
							if( d_k <= -6.69865 )
								if( ad <= -4.96113e+06 )
									ret := 0.628077
								if( ad > -4.96113e+06 )
									ret := 0.394552
							if( d_k > -6.69865 )
								if( d_k <= -4.422 )
									ret := 0.316667
								if( d_k > -4.422 )
									ret := 0.174658
						if( rsi1 > 53.5736 )
							if( d_k <= -3.89825 )
								if( ad <= -5.04709e+06 )
									ret := 0.720827 // buy
								if( ad > -5.04709e+06 )
									ret := 0.426739
							if( d_k > -3.89825 )
								if( mf <= 0.053947 )
									ret := 0.446486
								if( mf > 0.053947 )
									ret := 0.193638
					if( rsi1 > 60.7427 )
						if( ad <= -6.03759e+06 )
							if( ad <= -7.13282e+07 )
								if( ad_mf <= -2.53792e+08 )
									ret := -0.833333 // sell
								if( ad_mf > -2.53792e+08 )
									ret := 0.175676
							if( ad > -7.13282e+07 )
								if( d <= 90.6582 )
									ret := 0.794490 // buy
								if( d > 90.6582 )
									ret := 0.630021
						if( ad > -6.03759e+06 )
							if( ad_mf <= 4.58239e+06 )
								if( ad_mf <= -2.48492e+06 )
									ret := 0.596251
								if( ad_mf > -2.48492e+06 )
									ret := 0.431258
							if( ad_mf > 4.58239e+06 )
								if( mf <= 0.43539 )
									ret := 0.615133
								if( mf > 0.43539 )
									ret := -0.100000
				if( d_k > -0.112802 )
					if( ad <= 6.74364e+07 )
						if( d <= 85.3887 )
							if( rsi1 <= 53.9087 )
								if( ad_mf <= 6.17012e+06 )
									ret := 0.182540
								if( ad_mf > 6.17012e+06 )
									ret := -0.337143
							if( rsi1 > 53.9087 )
								if( ad_mf <= -1.09285e+07 )
									ret := 0.592683
								if( ad_mf > -1.09285e+07 )
									ret := 0.265335
						if( d > 85.3887 )
							if( d_k <= -0.001058 )
								if( smoothK_k <= 87.2364 )
									ret := 0.173913
								if( smoothK_k > 87.2364 )
									ret := 0.586207
							if( d_k > -0.001058 )
								if( mf <= -0.118101 )
									ret := 0.298329
								if( mf > -0.118101 )
									ret := 0.389334
					if( ad > 6.74364e+07 )
						if( mf <= 0.279545 )
							if( rsi1 <= 59.1454 )
								if( ad <= 1.25549e+08 )
									ret := -0.920000 // sell
								if( ad > 1.25549e+08 )
									ret := -0.090909
							if( rsi1 > 59.1454 )
								if( smoothD_d <= 78.6249 )
									ret := 0.409091
								if( smoothD_d > 78.6249 )
									ret := -0.070707
						if( mf > 0.279545 )
							if( rsi1 <= 73.8994 )
								ret := -0.466667
							if( rsi1 > 73.8994 )
								ret := -1.000000 // sell
		if( d_k > 2.04315 )
			if( k <= 78.3679 )
				if( ad_mf <= 7.9451e+06 )
					if( k <= 63.8128 )
						if( ad_mf <= -1.63285e+08 )
							if( smoothD_d <= 45.5456 )
								ret := -0.250000
							if( smoothD_d > 45.5456 )
								if( ad <= -1.69271e+08 )
									ret := 0.642857
								if( ad > -1.69271e+08 )
									ret := 1.000000 // buy
						if( ad_mf > -1.63285e+08 )
							if( d_k <= 8.56066 )
								if( mf <= 0.088995 )
									ret := -0.198974
								if( mf > 0.088995 )
									ret := -0.001903
							if( d_k > 8.56066 )
								if( smoothD_d <= 71.4181 )
									ret := -0.332329
								if( smoothD_d > 71.4181 )
									ret := -0.149805
					if( k > 63.8128 )
						if( rsi1 <= 57.333 )
							if( rsi1 <= 48.7042 )
								if( smoothD_d <= 66.5976 )
									ret := -0.063830
								if( smoothD_d > 66.5976 )
									ret := -0.403439
							if( rsi1 > 48.7042 )
								if( ad_mf <= -2.0318e+07 )
									ret := -0.465753
								if( ad_mf > -2.0318e+07 )
									ret := -0.096774
						if( rsi1 > 57.333 )
							if( ad_mf <= -2.76617e+07 )
								if( rsi1 <= 63.1762 )
									ret := -0.522936
								if( rsi1 > 63.1762 )
									ret := 0.174603
							if( ad_mf > -2.76617e+07 )
								if( d_k <= 5.06936 )
									ret := 0.338809
								if( d_k > 5.06936 )
									ret := 0.111495
				if( ad_mf > 7.9451e+06 )
					if( rsi1 <= 62.8731 )
						if( smoothD_d <= 43.4708 )
							if( ad <= 1.40737e+07 )
								if( smoothK_k <= 36.0998 )
									ret := -0.833333 // sell
								if( smoothK_k > 36.0998 )
									ret := -0.520000
							if( ad > 1.40737e+07 )
								if( k <= 41.2182 )
									ret := -0.247863
								if( k > 41.2182 )
									ret := 0.789474 // buy
						if( smoothD_d > 43.4708 )
							if( k <= 72.8711 )
								if( rsi1 <= 52.0349 )
									ret := -0.761940 // sell
								if( rsi1 > 52.0349 )
									ret := -0.512518
							if( k > 72.8711 )
								if( ad_mf <= 1.16909e+07 )
									ret := -0.122449
								if( ad_mf > 1.16909e+07 )
									ret := -0.463636
					if( rsi1 > 62.8731 )
						if( smoothD_d <= 53.1095 )
							if( ad_mf <= 1.54132e+07 )
								if( mf <= 0.216464 )
									ret := -0.045455
								if( mf > 0.216464 )
									ret := -0.652174
							if( ad_mf > 1.54132e+07 )
								if( k <= 39.5545 )
									ret := -0.111111
								if( k > 39.5545 )
									ret := 0.393617
						if( smoothD_d > 53.1095 )
							if( d_k <= 5.21292 )
								if( smoothD_d <= 69.0584 )
									ret := 0.348624
								if( smoothD_d > 69.0584 )
									ret := -0.136691
							if( d_k > 5.21292 )
								if( ad <= 6.89237e+07 )
									ret := -0.225577
								if( ad > 6.89237e+07 )
									ret := -0.751515 // sell
			if( k > 78.3679 )
				if( smoothD_d <= 89.9643 )
					if( ad <= 7.49084e+06 )
						if( ad_mf <= -6.99262e+06 )
							if( d <= 83.0976 )
								if( rsi1 <= 53.8425 )
									ret := -0.400000
								if( rsi1 > 53.8425 )
									ret := 0.840000 // buy
							if( d > 83.0976 )
								if( smoothK_k <= 79.5717 )
									ret := -0.259516
								if( smoothK_k > 79.5717 )
									ret := 0.135231
						if( ad_mf > -6.99262e+06 )
							if( rsi1 <= 58.0758 )
								if( ad <= 6.26535e+06 )
									ret := -0.103950
								if( ad > 6.26535e+06 )
									ret := 0.333333
							if( rsi1 > 58.0758 )
								if( k <= 79.4976 )
									ret := 0.369128
								if( k > 79.4976 )
									ret := 0.211099
					if( ad > 7.49084e+06 )
						if( ad <= 1.83667e+08 )
							if( ad_mf <= 1.06477e+08 )
								if( ad <= 7.02206e+07 )
									ret := -0.160227
								if( ad > 7.02206e+07 )
									ret := -0.620690
							if( ad_mf > 1.06477e+08 )
								if( mf <= 0.284563 )
									ret := 0.764706 // buy
								if( mf > 0.284563 )
									ret := -0.333333
						if( ad > 1.83667e+08 )
							ret := -1.000000 // sell
				if( smoothD_d > 89.9643 )
					if( ad_mf <= -6.45936e+07 )
						if( smoothK_k <= 87.1634 )
							ret := -0.700000 // sell
						if( smoothK_k > 87.1634 )
							ret := 0.142857
					if( ad_mf > -6.45936e+07 )
						if( rsi1 <= 55.057 )
							if( mf <= -0.258322 )
								if( smoothD_d <= 94.5264 )
									ret := 0.000000
								if( smoothD_d > 94.5264 )
									ret := 0.666667
							if( mf > -0.258322 )
								if( smoothD_d <= 94.894 )
									ret := -0.100000
								if( smoothD_d > 94.894 )
									ret := -0.454545
						if( rsi1 > 55.057 )
							if( smoothK_k <= 85.4537 )
								if( rsi1 <= 80.0052 )
									ret := 0.088889
								if( rsi1 > 80.0052 )
									ret := 0.642857
							if( smoothK_k > 85.4537 )
								if( mf <= -0.05334 )
									ret := 0.160839
								if( mf > -0.05334 )
									ret := 0.337500
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TRXUSDT_30Min_f3b1bc5c(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


