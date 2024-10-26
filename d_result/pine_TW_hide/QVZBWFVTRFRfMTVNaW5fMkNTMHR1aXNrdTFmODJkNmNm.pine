//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AVAXUSDT_15Min_2CS0_1f82d6cf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_2CS0_1f82d6cf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_1f82d6cf(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 47.0427 )
		if( d <= 14.0788 )
			if( mf <= -0.104212 )
				if( rsi1 <= 25.8376 )
					if( ad_mf <= 0.133102 )
						if( mf <= -0.197645 )
							if( d_k <= -0.613344 )
								if( smoothK_k <= 1.42986 )
									ret := -0.831169 // sell
								if( smoothK_k > 1.42986 )
									ret := -0.466667
							if( d_k > -0.613344 )
								if( mf <= -0.437574 )
									ret := 0.166667
								if( mf > -0.437574 )
									ret := -0.330684
						if( mf > -0.197645 )
							if( ad_mf <= -3387.5 )
								if( d_k <= -0.614155 )
									ret := -0.683594
								if( d_k > -0.614155 )
									ret := -0.490530
							if( ad_mf > -3387.5 )
								if( k <= 10.8956 )
									ret := -0.821918 // sell
								if( k > 10.8956 )
									ret := -0.052632
					if( ad_mf > 0.133102 )
						if( smoothD_d <= 4.71486 )
							if( smoothD_d <= 1.76435 )
								if( rsi1 <= 13.1054 )
									ret := -0.106383
								if( rsi1 > 13.1054 )
									ret := -0.434641
							if( smoothD_d > 1.76435 )
								if( ad_mf <= 1590.81 )
									ret := 0.800000 // buy
								if( ad_mf > 1590.81 )
									ret := -0.257732
						if( smoothD_d > 4.71486 )
							if( mf <= -0.301623 )
								ret := -0.058824
							if( mf > -0.301623 )
								if( k <= 22.4797 )
									ret := -0.579882
								if( k > 22.4797 )
									ret := -1.000000 // sell
				if( rsi1 > 25.8376 )
					if( rsi1 <= 32.0882 )
						if( smoothK_k <= 15.1731 )
							if( ad_mf <= 2329.68 )
								if( d_k <= -5.34668 )
									ret := -0.534884
								if( d_k > -5.34668 )
									ret := -0.092614
							if( ad_mf > 2329.68 )
								if( smoothD_d <= 6.84758 )
									ret := -0.454545
								if( smoothD_d > 6.84758 )
									ret := -0.102564
						if( smoothK_k > 15.1731 )
							if( mf <= -0.194444 )
								if( smoothD_d <= 9.95033 )
									ret := -0.700000 // sell
								if( smoothD_d > 9.95033 )
									ret := 0.375000
							if( mf > -0.194444 )
								if( ad_mf <= -6076.23 )
									ret := -0.976190 // sell
								if( ad_mf > -6076.23 )
									ret := -0.586957
					if( rsi1 > 32.0882 )
						if( ad_mf <= -11687.9 )
							if( ad_mf <= -52594.3 )
								if( smoothD_d <= 7.17211 )
									ret := -0.051282
								if( smoothD_d > 7.17211 )
									ret := -0.666667
							if( ad_mf > -52594.3 )
								if( rsi1 <= 46.4244 )
									ret := 0.077810
								if( rsi1 > 46.4244 )
									ret := 0.709677 // buy
						if( ad_mf > -11687.9 )
							if( smoothD_d <= 0.070872 )
								if( ad_mf <= -3392.07 )
									ret := -0.145455
								if( ad_mf > -3392.07 )
									ret := 0.265487
							if( smoothD_d > 0.070872 )
								if( ad_mf <= 4004.21 )
									ret := -0.224543
								if( ad_mf > 4004.21 )
									ret := -0.015453
			if( mf > -0.104212 )
				if( ad <= 906.052 )
					if( d <= 7.10834 )
						if( rsi1 <= 39.7835 )
							if( smoothK_k <= -2.99952 )
								if( ad <= -14536.6 )
									ret := -0.232143
								if( ad > -14536.6 )
									ret := -0.487805
							if( smoothK_k > -2.99952 )
								if( rsi1 <= 26.6637 )
									ret := -0.730530 // sell
								if( rsi1 > 26.6637 )
									ret := -0.540737
						if( rsi1 > 39.7835 )
							if( rsi1 <= 51.6716 )
								if( rsi1 <= 39.9155 )
									ret := 0.538462
								if( rsi1 > 39.9155 )
									ret := -0.237825
							if( rsi1 > 51.6716 )
								if( rsi1 <= 67.3871 )
									ret := 0.019391
								if( rsi1 > 67.3871 )
									ret := 0.619048
					if( d > 7.10834 )
						if( d_k <= 10.3902 )
							if( ad_mf <= -140568 )
								if( ad <= -176267 )
									ret := 0.222222
								if( ad > -176267 )
									ret := 0.750000 // buy
							if( ad_mf > -140568 )
								if( k <= 5.84605 )
									ret := -0.401515
								if( k > 5.84605 )
									ret := -0.259717
						if( d_k > 10.3902 )
							if( k <= 0.017376 )
								if( rsi1 <= 45.2805 )
									ret := -0.365385
								if( rsi1 > 45.2805 )
									ret := -0.041667
							if( k > 0.017376 )
								if( d_k <= 12.0446 )
									ret := -0.709677 // sell
								if( d_k > 12.0446 )
									ret := -0.934783 // sell
				if( ad > 906.052 )
					if( d <= 4.36857 )
						if( smoothK_k <= 0.516011 )
							if( mf <= 0.42649 )
								if( rsi1 <= 42.4066 )
									ret := -0.719072 // sell
								if( rsi1 > 42.4066 )
									ret := -0.352941
							if( mf > 0.42649 )
								ret := 0.150000
						if( smoothK_k > 0.516011 )
							if( rsi1 <= 34.1223 )
								if( smoothD_d <= 0.217805 )
									ret := -0.578231
								if( smoothD_d > 0.217805 )
									ret := -0.851064 // sell
							if( rsi1 > 34.1223 )
								if( k <= 7.29368 )
									ret := -0.329480
								if( k > 7.29368 )
									ret := -0.555556
					if( d > 4.36857 )
						if( k <= 21.6116 )
							if( rsi1 <= 47.4455 )
								if( k <= 0.003558 )
									ret := -0.338624
								if( k > 0.003558 )
									ret := -0.581320
							if( rsi1 > 47.4455 )
								if( ad <= 15808.9 )
									ret := -0.124346
								if( ad > 15808.9 )
									ret := -0.441860
						if( k > 21.6116 )
							if( rsi1 <= 32.9166 )
								if( d_k <= -10.918 )
									ret := -0.428571
								if( d_k > -10.918 )
									ret := -1.000000 // sell
							if( rsi1 > 32.9166 )
								if( ad <= 14669.6 )
									ret := 0.005780
								if( ad > 14669.6 )
									ret := -0.385542
		if( d > 14.0788 )
			if( ad <= 7403.63 )
				if( rsi1 <= 49.5122 )
					if( ad_mf <= -93294.7 )
						if( mf <= -0.191369 )
							if( smoothK_k <= 11.9485 )
								if( d_k <= 13.4864 )
									ret := -0.722222 // sell
								if( d_k > 13.4864 )
									ret := 0.071429
							if( smoothK_k > 11.9485 )
								if( smoothK_k <= 29.893 )
									ret := 0.414634
								if( smoothK_k > 29.893 )
									ret := 0.820225 // buy
						if( mf > -0.191369 )
							if( k <= 17.1241 )
								if( d_k <= 14.6288 )
									ret := -0.661290
								if( d_k > 14.6288 )
									ret := 0.421053
							if( k > 17.1241 )
								if( ad <= -148644 )
									ret := -0.181818
								if( ad > -148644 )
									ret := 0.452991
					if( ad_mf > -93294.7 )
						if( k <= 29.2407 )
							if( rsi1 <= 35.7819 )
								if( smoothK_k <= 3.75757 )
									ret := -0.506399
								if( smoothK_k > 3.75757 )
									ret := -0.291282
							if( rsi1 > 35.7819 )
								if( smoothD_d <= 26.6798 )
									ret := -0.118539
								if( smoothD_d > 26.6798 )
									ret := -0.278231
						if( k > 29.2407 )
							if( rsi1 <= 39.3794 )
								if( ad_mf <= -21639.5 )
									ret := -0.049296
								if( ad_mf > -21639.5 )
									ret := -0.242372
							if( rsi1 > 39.3794 )
								if( d_k <= 3.29262 )
									ret := 0.017906
								if( d_k > 3.29262 )
									ret := -0.158520
				if( rsi1 > 49.5122 )
					if( d_k <= 4.16272 )
						if( ad <= -6741.43 )
							if( ad <= -73939.6 )
								if( k <= 42.6446 )
									ret := 0.515873
								if( k > 42.6446 )
									ret := 1.000000 // buy
							if( ad > -73939.6 )
								if( smoothK_k <= 13.8225 )
									ret := -0.317073
								if( smoothK_k > 13.8225 )
									ret := 0.343295
						if( ad > -6741.43 )
							if( d <= 20.4872 )
								if( smoothK_k <= 16.9429 )
									ret := 0.217105
								if( smoothK_k > 16.9429 )
									ret := -0.069364
							if( d > 20.4872 )
								if( ad_mf <= 7177.93 )
									ret := 0.160000
								if( ad_mf > 7177.93 )
									ret := 0.814815 // buy
					if( d_k > 4.16272 )
						if( k <= 42.6976 )
							if( rsi1 <= 69.6778 )
								if( mf <= 0.203223 )
									ret := 0.024705
								if( mf > 0.203223 )
									ret := -0.184397
							if( rsi1 > 69.6778 )
								if( smoothK_k <= 10.2719 )
									ret := 0.052632
								if( smoothK_k > 10.2719 )
									ret := 0.450617
						if( k > 42.6976 )
							if( rsi1 <= 56.3953 )
								if( smoothD_d <= 47.9188 )
									ret := 0.533333
								if( smoothD_d > 47.9188 )
									ret := -0.109290
							if( rsi1 > 56.3953 )
								if( mf <= 0.170793 )
									ret := 0.283133
								if( mf > 0.170793 )
									ret := 0.545455
			if( ad > 7403.63 )
				if( rsi1 <= 54.245 )
					if( k <= 26.882 )
						if( mf <= 0.025851 )
							if( ad_mf <= 81225.7 )
								if( d_k <= 7.62582 )
									ret := -0.255814
								if( d_k > 7.62582 )
									ret := -0.441941
							if( ad_mf > 81225.7 )
								if( k <= 21.5917 )
									ret := -1.000000 // sell
								if( k > 21.5917 )
									ret := -0.500000
						if( mf > 0.025851 )
							if( ad <= 50336.8 )
								if( d_k <= -0.665739 )
									ret := -0.346715
								if( d_k > -0.665739 )
									ret := -0.551876
							if( ad > 50336.8 )
								if( ad <= 135673 )
									ret := -0.865979 // sell
								if( ad > 135673 )
									ret := -0.500000
					if( k > 26.882 )
						if( d_k <= 5.09103 )
							if( ad <= 239062 )
								if( mf <= -0.121699 )
									ret := -0.027907
								if( mf > -0.121699 )
									ret := -0.238864
							if( ad > 239062 )
								ret := 0.904762 // buy
						if( d_k > 5.09103 )
							if( rsi1 <= 45.2456 )
								if( smoothK_k <= 37.586 )
									ret := -0.376289
								if( smoothK_k > 37.586 )
									ret := -0.573171
							if( rsi1 > 45.2456 )
								if( d <= 59.277 )
									ret := -0.306818
								if( d > 59.277 )
									ret := -0.054348
				if( rsi1 > 54.245 )
					if( ad_mf <= 68658.6 )
						if( ad_mf <= 64326.9 )
							if( ad_mf <= 39124.6 )
								if( ad <= 7571.04 )
									ret := -0.666667
								if( ad > 7571.04 )
									ret := -0.030435
							if( ad_mf > 39124.6 )
								if( d_k <= -13.63 )
									ret := 0.178571
								if( d_k > -13.63 )
									ret := -0.360606
						if( ad_mf > 64326.9 )
							if( ad_mf <= 67990.1 )
								if( mf <= 0.243438 )
									ret := 1.000000 // buy
								if( mf > 0.243438 )
									ret := 0.800000 // buy
							if( ad_mf > 67990.1 )
								ret := 0.153846
					if( ad_mf > 68658.6 )
						if( rsi1 <= 63.5645 )
							if( mf <= 0.070786 )
								if( d <= 32.8851 )
									ret := -0.642857
								if( d > 32.8851 )
									ret := 0.235294
							if( mf > 0.070786 )
								if( smoothD_d <= 13.7781 )
									ret := -0.352941
								if( smoothD_d > 13.7781 )
									ret := -0.745223 // sell
						if( rsi1 > 63.5645 )
							if( ad <= 90340.7 )
								if( ad <= 86106.6 )
									ret := -0.541667
								if( ad > 86106.6 )
									ret := -1.000000 // sell
							if( ad > 90340.7 )
								if( d_k <= 6.05209 )
									ret := 0.116667
								if( d_k > 6.05209 )
									ret := -0.545455
	if( k > 47.0427 )
		if( rsi1 <= 57.1487 )
			if( ad <= -5024.94 )
				if( k <= 94.1862 )
					if( d_k <= 3.09777 )
						if( rsi1 <= 49.5614 )
							if( d <= 60.9601 )
								if( d_k <= -17.5463 )
									ret := 0.009940
								if( d_k > -17.5463 )
									ret := 0.235258
							if( d > 60.9601 )
								if( ad <= -44453.8 )
									ret := 0.373626
								if( ad > -44453.8 )
									ret := 0.008409
						if( rsi1 > 49.5614 )
							if( d <= 59.0458 )
								if( mf <= 0.114823 )
									ret := 0.466033
								if( mf > 0.114823 )
									ret := 0.107143
							if( d > 59.0458 )
								if( smoothK_k <= 78.7722 )
									ret := 0.120112
								if( smoothK_k > 78.7722 )
									ret := 0.363839
					if( d_k > 3.09777 )
						if( d <= 84.7588 )
							if( rsi1 <= 40.5351 )
								if( ad <= -18311.1 )
									ret := -0.026490
								if( ad > -18311.1 )
									ret := -0.376543
							if( rsi1 > 40.5351 )
								if( mf <= -0.065867 )
									ret := 0.169492
								if( mf > -0.065867 )
									ret := -0.063280
						if( d > 84.7588 )
							if( smoothK_k <= 79.5978 )
								if( smoothK_k <= 76.2781 )
									ret := 0.145833
								if( smoothK_k > 76.2781 )
									ret := 0.414013
							if( smoothK_k > 79.5978 )
								if( d_k <= 5.53413 )
									ret := 0.227679
								if( d_k > 5.53413 )
									ret := -0.050847
				if( k > 94.1862 )
					if( d_k <= -11.1759 )
						if( smoothD_d <= 83.1253 )
							if( rsi1 <= 43.2255 )
								if( ad_mf <= -45040.8 )
									ret := 0.687500
								if( ad_mf > -45040.8 )
									ret := -0.184211
							if( rsi1 > 43.2255 )
								if( ad_mf <= -12601.3 )
									ret := 0.196078
								if( ad_mf > -12601.3 )
									ret := 0.663462
						if( smoothD_d > 83.1253 )
							if( k <= 99.6691 )
								ret := -0.461538
							if( k > 99.6691 )
								ret := 0.375000
					if( d_k > -11.1759 )
						if( ad <= -34237.6 )
							if( rsi1 <= 46.86 )
								if( rsi1 <= 39.9173 )
									ret := 0.920000 // buy
								if( rsi1 > 39.9173 )
									ret := 0.296296
							if( rsi1 > 46.86 )
								if( mf <= -0.214383 )
									ret := 1.000000 // buy
								if( mf > -0.214383 )
									ret := 0.812500 // buy
						if( ad > -34237.6 )
							if( k <= 99.8212 )
								if( smoothK_k <= 91.8039 )
									ret := 0.177778
								if( smoothK_k > 91.8039 )
									ret := 0.530242
							if( k > 99.8212 )
								if( mf <= -0.093314 )
									ret := 0.444444
								if( mf > -0.093314 )
									ret := -0.047619
			if( ad > -5024.94 )
				if( k <= 85.7367 )
					if( d_k <= -3.46332 )
						if( ad <= 8294.26 )
							if( ad <= -2838.03 )
								if( smoothK_k <= 74.7655 )
									ret := 0.304569
								if( smoothK_k > 74.7655 )
									ret := -0.009615
							if( ad > -2838.03 )
								if( smoothD_d <= 30.2758 )
									ret := -0.227848
								if( smoothD_d > 30.2758 )
									ret := 0.057584
						if( ad > 8294.26 )
							if( mf <= 0.003521 )
								if( ad_mf <= 79124.2 )
									ret := -0.053640
								if( ad_mf > 79124.2 )
									ret := 0.450000
							if( mf > 0.003521 )
								if( rsi1 <= 50.7342 )
									ret := -0.409978
								if( rsi1 > 50.7342 )
									ret := 0.029925
					if( d_k > -3.46332 )
						if( rsi1 <= 45.2323 )
							if( ad_mf <= 180424 )
								if( smoothD_d <= 52.1097 )
									ret := -0.009202
								if( smoothD_d > 52.1097 )
									ret := -0.287702
							if( ad_mf > 180424 )
								ret := 0.862069 // buy
						if( rsi1 > 45.2323 )
							if( smoothD_d <= 81.1318 )
								if( ad_mf <= 91151.1 )
									ret := -0.071251
								if( ad_mf > 91151.1 )
									ret := -0.514925
							if( smoothD_d > 81.1318 )
								if( d_k <= 7.2774 )
									ret := 0.033259
								if( d_k > 7.2774 )
									ret := 0.193133
				if( k > 85.7367 )
					if( rsi1 <= 50.2778 )
						if( k <= 90.8346 )
							if( d_k <= -14.4854 )
								if( rsi1 <= 35.3862 )
									ret := 0.750000 // buy
								if( rsi1 > 35.3862 )
									ret := 0.090909
							if( d_k > -14.4854 )
								if( rsi1 <= 38.3646 )
									ret := -0.445255
								if( rsi1 > 38.3646 )
									ret := -0.068047
						if( k > 90.8346 )
							if( ad <= 74182.4 )
								if( mf <= -0.296916 )
									ret := 0.407407
								if( mf > -0.296916 )
									ret := -0.009680
							if( ad > 74182.4 )
								if( mf <= -0.064437 )
									ret := 0.846154 // buy
								if( mf > -0.064437 )
									ret := -0.111111
					if( rsi1 > 50.2778 )
						if( d_k <= 5.24862 )
							if( rsi1 <= 54.5492 )
								if( ad_mf <= 14916.9 )
									ret := 0.074208
								if( ad_mf > 14916.9 )
									ret := 0.307246
							if( rsi1 > 54.5492 )
								if( ad_mf <= 15316.5 )
									ret := 0.189521
								if( ad_mf > 15316.5 )
									ret := 0.476190
						if( d_k > 5.24862 )
							if( ad <= 4607.8 )
								if( mf <= -0.043971 )
									ret := 0.368421
								if( mf > -0.043971 )
									ret := 0.769231 // buy
							if( ad > 4607.8 )
								if( smoothK_k <= 84.5156 )
									ret := -0.222222
								if( smoothK_k > 84.5156 )
									ret := 0.210526
		if( rsi1 > 57.1487 )
			if( rsi1 <= 75.017 )
				if( k <= 88.5534 )
					if( mf <= 0.081228 )
						if( d <= 84.9419 )
							if( d_k <= -7.8979 )
								if( ad_mf <= -3589.14 )
									ret := 0.551255
								if( ad_mf > -3589.14 )
									ret := 0.293777
							if( d_k > -7.8979 )
								if( d <= 48.5551 )
									ret := 0.654762
								if( d > 48.5551 )
									ret := 0.258057
						if( d > 84.9419 )
							if( smoothK_k <= 68.9645 )
								ret := -0.307692
							if( smoothK_k > 68.9645 )
								if( rsi1 <= 72.009 )
									ret := 0.417106
								if( rsi1 > 72.009 )
									ret := 0.672727
					if( mf > 0.081228 )
						if( ad <= 26461.6 )
							if( smoothD_d <= 48.109 )
								if( ad <= -2916.73 )
									ret := 0.540541
								if( ad > -2916.73 )
									ret := 0.300481
							if( smoothD_d > 48.109 )
								if( smoothK_k <= 65.751 )
									ret := 0.125473
								if( smoothK_k > 65.751 )
									ret := 0.243652
						if( ad > 26461.6 )
							if( smoothD_d <= 66.3249 )
								if( smoothK_k <= 61.0205 )
									ret := -0.319829
								if( smoothK_k > 61.0205 )
									ret := 0.040441
							if( smoothD_d > 66.3249 )
								if( rsi1 <= 62.994 )
									ret := -0.166667
								if( rsi1 > 62.994 )
									ret := 0.255151
				if( k > 88.5534 )
					if( ad_mf <= -6047 )
						if( k <= 96.3849 )
							if( mf <= 0.107458 )
								if( mf <= -0.043173 )
									ret := 0.633678
								if( mf > -0.043173 )
									ret := 0.470264
							if( mf > 0.107458 )
								if( d <= 92.4947 )
									ret := 0.376404
								if( d > 92.4947 )
									ret := 0.028369
						if( k > 96.3849 )
							if( k <= 99.99 )
								if( ad <= -23944.1 )
									ret := 0.565934
								if( ad > -23944.1 )
									ret := 0.734815 // buy
							if( k > 99.99 )
								if( mf <= -0.195458 )
									ret := 0.789474 // buy
								if( mf > -0.195458 )
									ret := 0.369458
					if( ad_mf > -6047 )
						if( rsi1 <= 63.3116 )
							if( ad_mf <= 4305.26 )
								if( ad_mf <= 4282.28 )
									ret := 0.187643
								if( ad_mf > 4282.28 )
									ret := -0.913043 // sell
							if( ad_mf > 4305.26 )
								if( ad <= 43357.7 )
									ret := 0.437588
								if( ad > 43357.7 )
									ret := 0.114754
						if( rsi1 > 63.3116 )
							if( mf <= 0.223567 )
								if( ad_mf <= -5864.34 )
									ret := -0.161290
								if( ad_mf > -5864.34 )
									ret := 0.473239
							if( mf > 0.223567 )
								if( smoothK_k <= 94.8024 )
									ret := 0.277778
								if( smoothK_k > 94.8024 )
									ret := -0.073394
			if( rsi1 > 75.017 )
				if( d <= 91.1797 )
					if( ad_mf <= -0.460832 )
						if( k <= 91.3161 )
							if( d_k <= -23.9993 )
								if( ad_mf <= -11580.3 )
									ret := 0.969697 // buy
								if( ad_mf > -11580.3 )
									ret := 0.700000 // buy
							if( d_k > -23.9993 )
								if( k <= 90.0083 )
									ret := 0.480377
								if( k > 90.0083 )
									ret := 0.127660
						if( k > 91.3161 )
							if( ad_mf <= -17376.1 )
								if( ad <= -47443.1 )
									ret := 0.766667 // buy
								if( ad > -47443.1 )
									ret := 1.000000 // buy
							if( ad_mf > -17376.1 )
								if( d_k <= -3.48212 )
									ret := 0.628788
								if( d_k > -3.48212 )
									ret := 1.000000 // buy
					if( ad_mf > -0.460832 )
						if( ad <= 306284 )
							if( ad_mf <= -0.029274 )
								if( rsi1 <= 80.9318 )
									ret := -0.222222
								if( rsi1 > 80.9318 )
									ret := 0.291667
							if( ad_mf > -0.029274 )
								if( ad_mf <= 114089 )
									ret := 0.377680
								if( ad_mf > 114089 )
									ret := 0.706422 // buy
						if( ad > 306284 )
							ret := -0.666667
				if( d > 91.1797 )
					if( ad_mf <= 89858.5 )
						if( mf <= 0.095515 )
							if( ad_mf <= -26239.3 )
								if( ad_mf <= -39564 )
									ret := 0.657143
								if( ad_mf > -39564 )
									ret := 0.090909
							if( ad_mf > -26239.3 )
								if( ad <= 21206.2 )
									ret := 0.771808 // buy
								if( ad > 21206.2 )
									ret := 0.608163
						if( mf > 0.095515 )
							if( ad_mf <= 4707.05 )
								if( ad_mf <= -9215.76 )
									ret := 0.649852
								if( ad_mf > -9215.76 )
									ret := 0.365049
							if( ad_mf > 4707.05 )
								if( ad_mf <= 40054.2 )
									ret := 0.694006
								if( ad_mf > 40054.2 )
									ret := 0.543379
					if( ad_mf > 89858.5 )
						if( d_k <= -0.656958 )
							if( rsi1 <= 87.0475 )
								if( d_k <= -3.18083 )
									ret := 0.857143 // buy
								if( d_k > -3.18083 )
									ret := 0.285714
							if( rsi1 > 87.0475 )
								ret := 1.000000 // buy
						if( d_k > -0.656958 )
							if( ad <= 127148 )
								if( rsi1 <= 83.2477 )
									ret := 0.185185
								if( rsi1 > 83.2477 )
									ret := -0.666667
							if( ad > 127148 )
								if( d <= 93.7851 )
									ret := 0.857143 // buy
								if( d > 93.7851 )
									ret := 0.200000
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_1f82d6cf(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


