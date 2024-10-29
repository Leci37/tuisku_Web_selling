//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: LTCUSDT_15Min_2CS0_fa64a3a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2CS0_fa64a3a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_fa64a3a2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 35.0452 )
		if( rsi1 <= 36.2715 )
			if( mf <= -0.048425 )
				if( rsi1 <= 27.6329 )
					if( ad <= -8414.91 )
						if( ad_mf <= -68386.9 )
							if( rsi1 <= 14.8106 )
								ret := 0.777778 // buy
							if( rsi1 > 14.8106 )
								ret := 1.000000 // buy
						if( ad_mf > -68386.9 )
							if( ad_mf <= -9114.41 )
								if( ad_mf <= -9634.51 )
									ret := -0.139568
								if( ad_mf > -9634.51 )
									ret := -0.810345 // sell
							if( ad_mf > -9114.41 )
								if( k <= 0.439453 )
									ret := -0.333333
								if( k > 0.439453 )
									ret := 0.675000
					if( ad > -8414.91 )
						if( rsi1 <= 20.6595 )
							if( ad <= -7370.96 )
								if( smoothK_k <= 2.82787 )
									ret := -0.914894 // sell
								if( smoothK_k > 2.82787 )
									ret := -0.181818
							if( ad > -7370.96 )
								if( d_k <= 6.20989 )
									ret := -0.417628
								if( d_k > 6.20989 )
									ret := -0.711111 // sell
						if( rsi1 > 20.6595 )
							if( d <= 42.1486 )
								if( ad <= 2818.11 )
									ret := -0.332956
								if( ad > 2818.11 )
									ret := -0.083784
							if( d > 42.1486 )
								if( k <= 24.3807 )
									ret := -0.968750 // sell
								if( k > 24.3807 )
									ret := -0.411765
				if( rsi1 > 27.6329 )
					if( d <= 35.7877 )
						if( ad <= -15957.4 )
							if( ad_mf <= -16948.9 )
								if( d_k <= -6.86822 )
									ret := -0.818182 // sell
								if( d_k > -6.86822 )
									ret := 0.238095
							if( ad_mf > -16948.9 )
								if( k <= 17.2099 )
									ret := 1.000000 // buy
								if( k > 17.2099 )
									ret := 0.900000 // buy
						if( ad > -15957.4 )
							if( ad_mf <= 3433.48 )
								if( ad_mf <= 1103.14 )
									ret := -0.108501
								if( ad_mf > 1103.14 )
									ret := -0.346093
							if( ad_mf > 3433.48 )
								if( ad_mf <= 36082.6 )
									ret := 0.007194
								if( ad_mf > 36082.6 )
									ret := 1.000000 // buy
					if( d > 35.7877 )
						if( ad <= -17914.5 )
							if( mf <= -0.206316 )
								ret := 0.222222
							if( mf > -0.206316 )
								ret := 0.700000 // buy
						if( ad > -17914.5 )
							if( ad_mf <= 1194.87 )
								if( d_k <= 28.6696 )
									ret := -0.379630
								if( d_k > 28.6696 )
									ret := -0.833333 // sell
							if( ad_mf > 1194.87 )
								if( ad <= 2177.5 )
									ret := -0.900000 // sell
								if( ad > 2177.5 )
									ret := -0.555556
			if( mf > -0.048425 )
				if( smoothD_d <= 3.44203 )
					if( mf <= 0.009098 )
						if( ad <= -595.457 )
							if( smoothD_d <= 0.617838 )
								if( rsi1 <= 24.0248 )
									ret := -0.695652
								if( rsi1 > 24.0248 )
									ret := -0.321888
							if( smoothD_d > 0.617838 )
								if( d <= 5.38017 )
									ret := -0.748744 // sell
								if( d > 5.38017 )
									ret := -0.468468
						if( ad > -595.457 )
							if( rsi1 <= 20.1449 )
								if( d_k <= 2.04893 )
									ret := -0.326087
								if( d_k > 2.04893 )
									ret := 0.478261
							if( rsi1 > 20.1449 )
								if( ad <= 6900.24 )
									ret := -0.522026
								if( ad > 6900.24 )
									ret := -0.111111
					if( mf > 0.009098 )
						if( ad_mf <= 1878.89 )
							if( k <= 3.51834 )
								if( ad_mf <= -789.228 )
									ret := -0.651639
								if( ad_mf > -789.228 )
									ret := -0.496653
							if( k > 3.51834 )
								if( ad_mf <= 1735.22 )
									ret := -0.734494 // sell
								if( ad_mf > 1735.22 )
									ret := 0.058824
						if( ad_mf > 1878.89 )
							if( d_k <= -1.6779 )
								if( mf <= 0.098663 )
									ret := -0.323810
								if( mf > 0.098663 )
									ret := -0.864583 // sell
							if( d_k > -1.6779 )
								if( ad <= 9117.81 )
									ret := -0.822123 // sell
								if( ad > 9117.81 )
									ret := -0.547170
				if( smoothD_d > 3.44203 )
					if( k <= 32.0582 )
						if( rsi1 <= 29.6259 )
							if( smoothK_k <= 0.228696 )
								if( d_k <= 5.78041 )
									ret := -0.978723 // sell
								if( d_k > 5.78041 )
									ret := -0.656977
							if( smoothK_k > 0.228696 )
								if( ad <= 77.0782 )
									ret := -0.472901
								if( ad > 77.0782 )
									ret := -0.588595
						if( rsi1 > 29.6259 )
							if( mf <= 0.081121 )
								if( d <= 28.7509 )
									ret := -0.281932
								if( d > 28.7509 )
									ret := -0.509390
							if( mf > 0.081121 )
								if( d <= 15.5967 )
									ret := -0.572776
								if( d > 15.5967 )
									ret := -0.398319
					if( k > 32.0582 )
						if( smoothD_d <= 16.4268 )
							ret := -0.904762 // sell
						if( smoothD_d > 16.4268 )
							if( d <= 49.663 )
								if( ad_mf <= 1778.61 )
									ret := 0.211009
								if( ad_mf > 1778.61 )
									ret := -0.200000
							if( d > 49.663 )
								if( ad_mf <= 2450.9 )
									ret := -0.333333
								if( ad_mf > 2450.9 )
									ret := -0.888889 // sell
		if( rsi1 > 36.2715 )
			if( mf <= 0.042465 )
				if( smoothK_k <= 13.9901 )
					if( ad_mf <= 4650.69 )
						if( mf <= -0.201588 )
							if( ad_mf <= -6211.9 )
								if( ad <= -8469.32 )
									ret := 0.333333
								if( ad > -8469.32 )
									ret := 0.846154 // buy
							if( ad_mf > -6211.9 )
								if( ad <= -492.769 )
									ret := -0.115789
								if( ad > -492.769 )
									ret := 0.239437
						if( mf > -0.201588 )
							if( rsi1 <= 46.479 )
								if( ad_mf <= 4599 )
									ret := -0.205055
								if( ad_mf > 4599 )
									ret := 0.809524 // buy
							if( rsi1 > 46.479 )
								if( rsi1 <= 66.3316 )
									ret := -0.028235
								if( rsi1 > 66.3316 )
									ret := 0.555556
					if( ad_mf > 4650.69 )
						if( ad_mf <= 17623.3 )
							if( mf <= -0.107426 )
								if( d_k <= -3.34613 )
									ret := -0.593750
								if( d_k > -3.34613 )
									ret := 0.181818
							if( mf > -0.107426 )
								if( k <= 2.6027 )
									ret := 0.060606
								if( k > 2.6027 )
									ret := -0.428571
						if( ad_mf > 17623.3 )
							if( ad <= 18866.4 )
								ret := 0.500000
							if( ad > 18866.4 )
								ret := 0.333333
				if( smoothK_k > 13.9901 )
					if( d_k <= 5.40342 )
						if( d <= 15.4739 )
							if( smoothD_d <= 12.0623 )
								if( smoothD_d <= 11.9217 )
									ret := -0.148634
								if( smoothD_d > 11.9217 )
									ret := 0.363636
							if( smoothD_d > 12.0623 )
								if( d <= 15.3112 )
									ret := -0.527273
								if( d > 15.3112 )
									ret := -0.162791
						if( d > 15.4739 )
							if( rsi1 <= 49.1827 )
								if( smoothK_k <= 19.4615 )
									ret := 0.172650
								if( smoothK_k > 19.4615 )
									ret := -0.004310
							if( rsi1 > 49.1827 )
								if( smoothD_d <= 13.3966 )
									ret := 0.629630
								if( smoothD_d > 13.3966 )
									ret := 0.162916
					if( d_k > 5.40342 )
						if( smoothD_d <= 25.795 )
							if( smoothD_d <= 21.3152 )
								ret := -0.500000
							if( smoothD_d > 21.3152 )
								if( smoothD_d <= 22.4534 )
									ret := 0.937500 // buy
								if( smoothD_d > 22.4534 )
									ret := 0.190141
						if( smoothD_d > 25.795 )
							if( d_k <= 21.5783 )
								if( mf <= -0.050188 )
									ret := -0.105263
								if( mf > -0.050188 )
									ret := -0.275239
							if( d_k > 21.5783 )
								if( ad_mf <= -23901.9 )
									ret := 1.000000 // buy
								if( ad_mf > -23901.9 )
									ret := 0.000000
			if( mf > 0.042465 )
				if( rsi1 <= 50.8866 )
					if( k <= 9.71811 )
						if( rsi1 <= 36.4346 )
							if( mf <= 0.104484 )
								if( d_k <= 0.763897 )
									ret := 0.363636
								if( d_k > 0.763897 )
									ret := 0.769231 // buy
							if( mf > 0.104484 )
								if( smoothK_k <= -2.51136 )
									ret := 0.066667
								if( smoothK_k > -2.51136 )
									ret := -0.875000 // sell
						if( rsi1 > 36.4346 )
							if( smoothK_k <= -2.98652 )
								if( ad_mf <= 2874.7 )
									ret := -0.229974
								if( ad_mf > 2874.7 )
									ret := -0.610390
							if( smoothK_k > -2.98652 )
								if( d_k <= 0.899453 )
									ret := -0.480828
								if( d_k > 0.899453 )
									ret := -0.416224
					if( k > 9.71811 )
						if( rsi1 <= 45.2337 )
							if( ad_mf <= 100.434 )
								if( ad <= -5433.72 )
									ret := -0.440000
								if( ad > -5433.72 )
									ret := -0.167832
							if( ad_mf > 100.434 )
								if( smoothD_d <= 26.3351 )
									ret := -0.377463
								if( smoothD_d > 26.3351 )
									ret := -0.570600
						if( rsi1 > 45.2337 )
							if( mf <= 0.196588 )
								if( ad <= -1386.09 )
									ret := 0.042857
								if( ad > -1386.09 )
									ret := -0.234395
							if( mf > 0.196588 )
								if( d_k <= -3.72224 )
									ret := -0.084906
								if( d_k > -3.72224 )
									ret := -0.405333
				if( rsi1 > 50.8866 )
					if( ad <= 7886.25 )
						if( smoothD_d <= 8.07005 )
							if( ad <= 976.14 )
								if( d <= 4.14346 )
									ret := -0.282209
								if( d > 4.14346 )
									ret := 0.006383
							if( ad > 976.14 )
								if( mf <= 0.059136 )
									ret := -0.882353 // sell
								if( mf > 0.059136 )
									ret := -0.428152
						if( smoothD_d > 8.07005 )
							if( smoothK_k <= 23.9136 )
								if( k <= 6.75145 )
									ret := 0.104693
								if( k > 6.75145 )
									ret := -0.076433
							if( smoothK_k > 23.9136 )
								if( ad <= 6543.79 )
									ret := 0.040157
								if( ad > 6543.79 )
									ret := 0.424242
					if( ad > 7886.25 )
						if( ad <= 19451.2 )
							if( smoothK_k <= 18.6729 )
								if( ad <= 17738.9 )
									ret := -0.642308
								if( ad > 17738.9 )
									ret := -0.100000
							if( smoothK_k > 18.6729 )
								if( smoothD_d <= 23.429 )
									ret := -0.438596
								if( smoothD_d > 23.429 )
									ret := 0.044872
						if( ad > 19451.2 )
							if( d <= 22.0248 )
								if( d_k <= 3.04749 )
									ret := -0.900000 // sell
								if( d_k > 3.04749 )
									ret := -0.529412
							if( d > 22.0248 )
								if( mf <= 0.224146 )
									ret := -1.000000 // sell
								if( mf > 0.224146 )
									ret := -0.823529 // sell
	if( k > 35.0452 )
		if( rsi1 <= 65.6252 )
			if( rsi1 <= 48.0871 )
				if( mf <= -0.174166 )
					if( ad <= -3650.48 )
						if( rsi1 <= 26.1351 )
							if( smoothD_d <= 77.1898 )
								if( smoothD_d <= 50.3736 )
									ret := 0.190476
								if( smoothD_d > 50.3736 )
									ret := -0.617647
							if( smoothD_d > 77.1898 )
								ret := 0.875000 // buy
						if( rsi1 > 26.1351 )
							if( d_k <= -9.40104 )
								if( mf <= -0.24446 )
									ret := 0.397727
								if( mf > -0.24446 )
									ret := -0.089109
							if( d_k > -9.40104 )
								if( ad_mf <= -35729.9 )
									ret := 0.943662 // buy
								if( ad_mf > -35729.9 )
									ret := 0.508050
					if( ad > -3650.48 )
						if( d <= 23.5789 )
							if( smoothK_k <= 35.6043 )
								ret := -0.062500
							if( smoothK_k > 35.6043 )
								ret := -0.705882 // sell
						if( d > 23.5789 )
							if( smoothK_k <= 42.3819 )
								if( ad <= 10223.6 )
									ret := 0.270463
								if( ad > 10223.6 )
									ret := -0.588235
							if( smoothK_k > 42.3819 )
								if( d <= 85.8735 )
									ret := -0.001821
								if( d > 85.8735 )
									ret := 0.180095
				if( mf > -0.174166 )
					if( ad_mf <= -4571.7 )
						if( smoothK_k <= 78.3626 )
							if( ad <= -33647 )
								if( k <= 38.2483 )
									ret := 0.300000
								if( k > 38.2483 )
									ret := 0.814433 // buy
							if( ad > -33647 )
								if( rsi1 <= 28.3236 )
									ret := -0.457944
								if( rsi1 > 28.3236 )
									ret := 0.142222
						if( smoothK_k > 78.3626 )
							if( mf <= -0.157973 )
								if( d_k <= -8.8526 )
									ret := -0.636364
								if( d_k > -8.8526 )
									ret := 0.000000
							if( mf > -0.157973 )
								if( d <= 83.4118 )
									ret := 0.416667
								if( d > 83.4118 )
									ret := 0.764368 // buy
					if( ad_mf > -4571.7 )
						if( rsi1 <= 35.8593 )
							if( ad_mf <= 49387.9 )
								if( smoothK_k <= 47.3959 )
									ret := -0.349750
								if( smoothK_k > 47.3959 )
									ret := -0.182296
							if( ad_mf > 49387.9 )
								ret := 0.777778 // buy
						if( rsi1 > 35.8593 )
							if( k <= 82.5041 )
								if( smoothK_k <= 41.9965 )
									ret := -0.112397
								if( smoothK_k > 41.9965 )
									ret := -0.048473
							if( k > 82.5041 )
								if( rsi1 <= 46.5992 )
									ret := 0.058050
								if( rsi1 > 46.5992 )
									ret := 0.239411
			if( rsi1 > 48.0871 )
				if( d <= 87.0676 )
					if( ad_mf <= 270.312 )
						if( k <= 75.6753 )
							if( k <= 74.3066 )
								if( ad_mf <= -30759.9 )
									ret := 0.789474 // buy
								if( ad_mf > -30759.9 )
									ret := 0.188977
							if( k > 74.3066 )
								if( mf <= -0.084841 )
									ret := 0.447761
								if( mf > -0.084841 )
									ret := -0.071918
						if( k > 75.6753 )
							if( ad_mf <= -3515.6 )
								if( mf <= -0.024684 )
									ret := 0.548387
								if( mf > -0.024684 )
									ret := 0.307918
							if( ad_mf > -3515.6 )
								if( ad <= -3419.82 )
									ret := -0.838710 // sell
								if( ad > -3419.82 )
									ret := 0.241403
					if( ad_mf > 270.312 )
						if( d_k <= -1.61214 )
							if( ad <= 30449.9 )
								if( rsi1 <= 57.0526 )
									ret := 0.020961
								if( rsi1 > 57.0526 )
									ret := 0.166372
							if( ad > 30449.9 )
								if( d <= 69.5843 )
									ret := -0.743590 // sell
								if( d > 69.5843 )
									ret := 0.090909
						if( d_k > -1.61214 )
							if( ad_mf <= 5341.52 )
								if( mf <= 0.108524 )
									ret := 0.044762
								if( mf > 0.108524 )
									ret := -0.143284
							if( ad_mf > 5341.52 )
								if( d <= 80.6829 )
									ret := -0.231561
								if( d > 80.6829 )
									ret := 0.048689
				if( d > 87.0676 )
					if( ad <= -1995.98 )
						if( mf <= 0.018977 )
							if( rsi1 <= 57.6203 )
								if( d_k <= 1.66611 )
									ret := 0.415948
								if( d_k > 1.66611 )
									ret := 0.149206
							if( rsi1 > 57.6203 )
								if( mf <= -0.219918 )
									ret := 0.153846
								if( mf > -0.219918 )
									ret := 0.630657
						if( mf > 0.018977 )
							if( mf <= 0.295154 )
								if( d_k <= -3.18281 )
									ret := 0.540000
								if( d_k > -3.18281 )
									ret := 0.184071
							if( mf > 0.295154 )
								ret := -0.277778
					if( ad > -1995.98 )
						if( ad_mf <= -1948.96 )
							if( k <= 90.6122 )
								ret := 0.000000
							if( k > 90.6122 )
								if( k <= 94.0037 )
									ret := -0.967742 // sell
								if( k > 94.0037 )
									ret := -0.333333
						if( ad_mf > -1948.96 )
							if( k <= 94.667 )
								if( d_k <= 4.08036 )
									ret := 0.116279
								if( d_k > 4.08036 )
									ret := 0.284667
							if( k > 94.667 )
								if( mf <= 0.074921 )
									ret := 0.338306
								if( mf > 0.074921 )
									ret := 0.145570
		if( rsi1 > 65.6252 )
			if( rsi1 <= 76.0146 )
				if( ad_mf <= 7723.81 )
					if( smoothK_k <= 90.9359 )
						if( d_k <= -7.91862 )
							if( mf <= 0.262861 )
								if( d <= 69.9742 )
									ret := 0.495920
								if( d > 69.9742 )
									ret := 0.355030
							if( mf > 0.262861 )
								if( smoothK_k <= 68.6002 )
									ret := -0.100000
								if( smoothK_k > 68.6002 )
									ret := 0.121951
						if( d_k > -7.91862 )
							if( ad_mf <= -35398.4 )
								if( rsi1 <= 69.848 )
									ret := 0.777778 // buy
								if( rsi1 > 69.848 )
									ret := 1.000000 // buy
							if( ad_mf > -35398.4 )
								if( ad <= -32107.4 )
									ret := -0.812500 // sell
								if( ad > -32107.4 )
									ret := 0.286931
					if( smoothK_k > 90.9359 )
						if( ad <= -517.74 )
							if( ad_mf <= -12921.2 )
								if( d_k <= 0.330843 )
									ret := -0.078125
								if( d_k > 0.330843 )
									ret := 0.578947
							if( ad_mf > -12921.2 )
								if( d <= 85.8023 )
									ret := 0.707602 // buy
								if( d > 85.8023 )
									ret := 0.533026
						if( ad > -517.74 )
							if( mf <= 0.094006 )
								if( ad_mf <= 225.006 )
									ret := 0.189189
								if( ad_mf > 225.006 )
									ret := 0.547250
							if( mf > 0.094006 )
								if( k <= 98.3475 )
									ret := 0.144578
								if( k > 98.3475 )
									ret := 0.336870
				if( ad_mf > 7723.81 )
					if( d <= 81.3153 )
						if( ad <= 68868 )
							if( ad_mf <= 13515.5 )
								if( ad <= 13003.1 )
									ret := -0.062069
								if( ad > 13003.1 )
									ret := -0.656250
							if( ad_mf > 13515.5 )
								if( smoothK_k <= 90.0842 )
									ret := 0.131833
								if( smoothK_k > 90.0842 )
									ret := 1.000000 // buy
						if( ad > 68868 )
							ret := -1.000000 // sell
					if( d > 81.3153 )
						if( ad <= 9871.99 )
							if( smoothK_k <= 95.2638 )
								if( d <= 87.5905 )
									ret := -0.384615
								if( d > 87.5905 )
									ret := 0.316176
							if( smoothK_k > 95.2638 )
								if( smoothD_d <= 94.4879 )
									ret := 0.187500
								if( smoothD_d > 94.4879 )
									ret := -0.638889
						if( ad > 9871.99 )
							if( rsi1 <= 75.6072 )
								if( d_k <= 2.50995 )
									ret := 0.326154
								if( d_k > 2.50995 )
									ret := 0.707317 // buy
							if( rsi1 > 75.6072 )
								ret := -0.368421
			if( rsi1 > 76.0146 )
				if( d <= 91.5572 )
					if( d_k <= 16.6607 )
						if( ad <= 3191.53 )
							if( d_k <= -2.09505 )
								if( ad_mf <= -13854.7 )
									ret := 0.000000
								if( ad_mf > -13854.7 )
									ret := 0.619974
							if( d_k > -2.09505 )
								if( smoothD_d <= 71.2188 )
									ret := 0.446602
								if( smoothD_d > 71.2188 )
									ret := 0.220503
						if( ad > 3191.53 )
							if( smoothK_k <= 62.7532 )
								if( ad_mf <= 28822.5 )
									ret := 0.114754
								if( ad_mf > 28822.5 )
									ret := -0.812500 // sell
							if( smoothK_k > 62.7532 )
								if( smoothD_d <= 88.1047 )
									ret := 0.315722
								if( smoothD_d > 88.1047 )
									ret := -0.333333
					if( d_k > 16.6607 )
						if( rsi1 <= 77.9892 )
							ret := 0.083333
						if( rsi1 > 77.9892 )
							if( d <= 70.106 )
								ret := -0.909091 // sell
							if( d > 70.106 )
								ret := -0.533333
				if( d > 91.5572 )
					if( mf <= 0.16883 )
						if( ad <= -7888.76 )
							if( ad <= -8556.93 )
								if( ad <= -12081.8 )
									ret := 0.000000
								if( ad > -12081.8 )
									ret := 0.666667
							if( ad > -8556.93 )
								ret := -0.416667
						if( ad > -7888.76 )
							if( mf <= 0.096158 )
								if( mf <= 0.087458 )
									ret := 0.671088
								if( mf > 0.087458 )
									ret := 0.845070 // buy
							if( mf > 0.096158 )
								if( k <= 96.5928 )
									ret := 0.447284
								if( k > 96.5928 )
									ret := 0.624138
					if( mf > 0.16883 )
						if( k <= 96.519 )
							if( ad <= 14073.4 )
								if( ad <= 12100.5 )
									ret := 0.457447
								if( ad > 12100.5 )
									ret := -0.052632
							if( ad > 14073.4 )
								if( ad <= 22139.3 )
									ret := 0.950000 // buy
								if( ad > 22139.3 )
									ret := 0.695652
						if( k > 96.519 )
							if( ad <= 1709.46 )
								if( ad_mf <= -913.764 )
									ret := 0.549020
								if( ad_mf > -913.764 )
									ret := -0.039841
							if( ad > 1709.46 )
								if( rsi1 <= 79.172 )
									ret := 0.076923
								if( rsi1 > 79.172 )
									ret := 0.492308
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_fa64a3a2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


