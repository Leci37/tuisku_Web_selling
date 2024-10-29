//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: SHIBUSDT_15Min_1S00_842e299d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_1S00_842e299d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_842e299d(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 54.4136 )
		if( k <= 25.6955 )
			if( k <= 8.82703 )
				if( k <= 0.151732 )
					if( d_k <= 0.006533 )
						if( smoothD_d <= -2.99884 )
							if( rsi1 <= 17.2886 )
								if( rsi1 <= 15.5048 )
									ret := -0.534483
								if( rsi1 > 15.5048 )
									ret := 0.633333
							if( rsi1 > 17.2886 )
								if( rsi1 <= 25.6802 )
									ret := -0.776978 // sell
								if( rsi1 > 25.6802 )
									ret := -0.577778
						if( smoothD_d > -2.99884 )
							if( d <= 0.057401 )
								ret := -1.000000 // sell
							if( d > 0.057401 )
								if( rsi1 <= 7.8737 )
									ret := -1.000000 // sell
								if( rsi1 > 7.8737 )
									ret := -0.500000
					if( d_k > 0.006533 )
						if( rsi1 <= 29.9854 )
							if( k <= 0.003149 )
								if( d <= 0.614 )
									ret := -0.260116
								if( d > 0.614 )
									ret := -0.604827
							if( k > 0.003149 )
								if( k <= 0.026014 )
									ret := 0.777778 // buy
								if( k > 0.026014 )
									ret := -0.390244
						if( rsi1 > 29.9854 )
							if( rsi1 <= 43.7811 )
								if( d_k <= 0.125047 )
									ret := 0.769231 // buy
								if( d_k > 0.125047 )
									ret := -0.369330
							if( rsi1 > 43.7811 )
								if( smoothK_k <= -2.99528 )
									ret := -0.162000
								if( smoothK_k > -2.99528 )
									ret := 0.102564
				if( k > 0.151732 )
					if( smoothD_d <= 1.34323 )
						if( d_k <= -0.088411 )
							if( rsi1 <= 29.522 )
								if( d_k <= -0.495952 )
									ret := -0.614343
								if( d_k > -0.495952 )
									ret := -0.365217
							if( rsi1 > 29.522 )
								if( k <= 1.18419 )
									ret := -0.784483 // sell
								if( k > 1.18419 )
									ret := -0.422071
						if( d_k > -0.088411 )
							if( d <= 4.06944 )
								if( rsi1 <= 27.0736 )
									ret := -0.339062
								if( rsi1 > 27.0736 )
									ret := -0.133159
							if( d > 4.06944 )
								if( smoothD_d <= 1.21958 )
									ret := -0.674157
								if( smoothD_d > 1.21958 )
									ret := -0.277778
					if( smoothD_d > 1.34323 )
						if( smoothK_k <= 4.86278 )
							if( smoothK_k <= 1.45742 )
								if( smoothK_k <= -2.78554 )
									ret := 0.303030
								if( smoothK_k > -2.78554 )
									ret := -0.352542
							if( smoothK_k > 1.45742 )
								if( smoothK_k <= 1.46772 )
									ret := 0.588235
								if( smoothK_k > 1.46772 )
									ret := -0.253541
						if( smoothK_k > 4.86278 )
							if( d <= 6.85061 )
								if( d_k <= -3.89137 )
									ret := 0.000000
								if( d_k > -3.89137 )
									ret := -0.649682
							if( d > 6.85061 )
								if( d_k <= 23.8592 )
									ret := -0.317791
								if( d_k > 23.8592 )
									ret := -0.771429 // sell
			if( k > 8.82703 )
				if( d <= 15.0407 )
					if( k <= 20.4463 )
						if( d <= 7.23019 )
							if( d <= 6.35043 )
								if( smoothD_d <= 3.19544 )
									ret := -0.322550
								if( smoothD_d > 3.19544 )
									ret := -0.084337
							if( d > 6.35043 )
								if( d <= 6.71672 )
									ret := -0.532468
								if( d > 6.71672 )
									ret := -0.397306
						if( d > 7.23019 )
							if( rsi1 <= 39.2376 )
								if( smoothK_k <= 14.9472 )
									ret := -0.380399
								if( smoothK_k > 14.9472 )
									ret := -0.226141
							if( rsi1 > 39.2376 )
								if( rsi1 <= 53.2877 )
									ret := -0.140683
								if( rsi1 > 53.2877 )
									ret := 0.214286
					if( k > 20.4463 )
						if( k <= 22.6555 )
							if( rsi1 <= 48.6393 )
								if( k <= 21.8937 )
									ret := -0.476190
								if( k > 21.8937 )
									ret := -0.765517 // sell
							if( rsi1 > 48.6393 )
								if( d_k <= -10.126 )
									ret := 0.000000
								if( d_k > -10.126 )
									ret := 0.500000
						if( k > 22.6555 )
							if( k <= 25.0847 )
								if( d <= 8.73794 )
									ret := -0.909091 // sell
								if( d > 8.73794 )
									ret := -0.290625
							if( k > 25.0847 )
								if( d <= 14.6967 )
									ret := -0.696970
								if( d > 14.6967 )
									ret := 0.000000
				if( d > 15.0407 )
					if( rsi1 <= 28.1489 )
						if( smoothD_d <= 25.6427 )
							if( smoothD_d <= 24.5144 )
								if( d_k <= 10.9898 )
									ret := -0.287013
								if( d_k > 10.9898 )
									ret := -0.674157
							if( smoothD_d > 24.5144 )
								if( k <= 15.2961 )
									ret := -0.666667
								if( k > 15.2961 )
									ret := 0.566667
						if( smoothD_d > 25.6427 )
							if( d_k <= 27.6355 )
								if( d <= 39.4651 )
									ret := -0.653386
								if( d > 39.4651 )
									ret := -0.273585
							if( d_k > 27.6355 )
								if( rsi1 <= 21.1655 )
									ret := -0.600000
								if( rsi1 > 21.1655 )
									ret := -0.906977 // sell
					if( rsi1 > 28.1489 )
						if( smoothD_d <= 26.9348 )
							if( k <= 20.2829 )
								if( smoothK_k <= 17.2391 )
									ret := -0.199949
								if( smoothK_k > 17.2391 )
									ret := -0.869565 // sell
							if( k > 20.2829 )
								if( rsi1 <= 29.6326 )
									ret := 0.285714
								if( rsi1 > 29.6326 )
									ret := -0.094851
						if( smoothD_d > 26.9348 )
							if( smoothK_k <= 8.22036 )
								if( d <= 30.2687 )
									ret := -0.600000
								if( d > 30.2687 )
									ret := 0.124260
							if( smoothK_k > 8.22036 )
								if( smoothK_k <= 14.28 )
									ret := -0.468579
								if( smoothK_k > 14.28 )
									ret := -0.217714
		if( k > 25.6955 )
			if( k <= 84.8415 )
				if( smoothD_d <= 19.056 )
					if( d_k <= -5.73673 )
						if( k <= 38.3705 )
							if( d_k <= -17.7131 )
								if( rsi1 <= 39.1245 )
									ret := -0.314286
								if( rsi1 > 39.1245 )
									ret := -0.690722
							if( d_k > -17.7131 )
								if( d_k <= -15.805 )
									ret := 0.039216
								if( d_k > -15.805 )
									ret := -0.271348
						if( k > 38.3705 )
							if( smoothK_k <= 36.077 )
								if( k <= 38.7731 )
									ret := 0.266667
								if( k > 38.7731 )
									ret := 0.700000 // buy
							if( smoothK_k > 36.077 )
								if( rsi1 <= 36.4607 )
									ret := -0.606061
								if( rsi1 > 36.4607 )
									ret := 0.064935
					if( d_k > -5.73673 )
						if( d_k <= -4.3341 )
							if( d <= 21.0665 )
								if( rsi1 <= 35.5183 )
									ret := -0.600000
								if( rsi1 > 35.5183 )
									ret := 0.416667
							if( d > 21.0665 )
								if( smoothK_k <= 23.5784 )
									ret := 0.800000 // buy
								if( smoothK_k > 23.5784 )
									ret := 0.518519
						if( d_k > -4.3341 )
							ret := -0.250000
				if( smoothD_d > 19.056 )
					if( k <= 58.5122 )
						if( d_k <= 3.01977 )
							if( d_k <= -22.6634 )
								if( d_k <= -24.0784 )
									ret := -0.175439
								if( d_k > -24.0784 )
									ret := -0.597938
							if( d_k > -22.6634 )
								if( rsi1 <= 40.3923 )
									ret := -0.096767
								if( rsi1 > 40.3923 )
									ret := 0.046262
						if( d_k > 3.01977 )
							if( d_k <= 6.39249 )
								if( rsi1 <= 52.351 )
									ret := -0.293197
								if( rsi1 > 52.351 )
									ret := 0.096591
							if( d_k > 6.39249 )
								if( d <= 48.3891 )
									ret := -0.037437
								if( d > 48.3891 )
									ret := -0.168341
					if( k > 58.5122 )
						if( smoothD_d <= 89.1396 )
							if( d_k <= -3.60942 )
								if( d_k <= -13.1826 )
									ret := -0.026536
								if( d_k > -13.1826 )
									ret := 0.191930
							if( d_k > -3.60942 )
								if( d <= 70.1122 )
									ret := -0.163154
								if( d > 70.1122 )
									ret := 0.016099
						if( smoothD_d > 89.1396 )
							if( rsi1 <= 41.1111 )
								ret := -0.181818
							if( rsi1 > 41.1111 )
								if( smoothD_d <= 89.5153 )
									ret := -0.724138 // sell
								if( smoothD_d > 89.5153 )
									ret := -0.371429
			if( k > 84.8415 )
				if( d <= 97.8586 )
					if( rsi1 <= 46.1755 )
						if( k <= 90.9013 )
							if( rsi1 <= 42.8702 )
								if( rsi1 <= 38.9417 )
									ret := 0.368732
								if( rsi1 > 38.9417 )
									ret := 0.038710
							if( rsi1 > 42.8702 )
								if( k <= 90.2366 )
									ret := 0.347044
								if( k > 90.2366 )
									ret := 0.800000 // buy
						if( k > 90.9013 )
							if( d_k <= -0.333806 )
								if( d_k <= -24.5234 )
									ret := -0.472222
								if( d_k > -24.5234 )
									ret := 0.142402
							if( d_k > -0.333806 )
								if( rsi1 <= 45.917 )
									ret := -0.422680
								if( rsi1 > 45.917 )
									ret := 0.238095
					if( rsi1 > 46.1755 )
						if( smoothD_d <= 71.8402 )
							if( k <= 97.259 )
								if( smoothD_d <= 70.4794 )
									ret := 0.427673
								if( smoothD_d > 70.4794 )
									ret := 0.731343 // buy
							if( k > 97.259 )
								ret := -0.153846
						if( smoothD_d > 71.8402 )
							if( d <= 75.2207 )
								if( d <= 74.9991 )
									ret := -0.363636
								if( d > 74.9991 )
									ret := -1.000000 // sell
							if( d > 75.2207 )
								if( d_k <= 5.87148 )
									ret := 0.221985
								if( d_k > 5.87148 )
									ret := 0.523077
				if( d > 97.8586 )
					if( rsi1 <= 34.5017 )
						ret := -1.000000 // sell
					if( rsi1 > 34.5017 )
						if( rsi1 <= 51.3274 )
							if( rsi1 <= 46.0718 )
								if( smoothK_k <= 96.9982 )
									ret := 0.680556
								if( smoothK_k > 96.9982 )
									ret := 0.049180
							if( rsi1 > 46.0718 )
								if( d <= 99.9493 )
									ret := 0.762712 // buy
								if( d > 99.9493 )
									ret := 0.433333
						if( rsi1 > 51.3274 )
							if( k <= 99.9703 )
								if( smoothK_k <= 96.0587 )
									ret := 0.347826
								if( smoothK_k > 96.0587 )
									ret := -0.866667 // sell
							if( k > 99.9703 )
								if( smoothD_d <= 96.2256 )
									ret := 0.731707 // buy
								if( smoothD_d > 96.2256 )
									ret := -0.260870
	if( rsi1 > 54.4136 )
		if( smoothK_k <= 66.9611 )
			if( smoothD_d <= 65.238 )
				if( smoothK_k <= 33.7917 )
					if( smoothK_k <= 3.8117 )
						if( d <= 11.5504 )
							if( d <= 7.91245 )
								if( k <= 3.27936 )
									ret := -0.337979
								if( k > 3.27936 )
									ret := 0.060870
							if( d > 7.91245 )
								if( k <= 0.094962 )
									ret := -0.214286
								if( k > 0.094962 )
									ret := 0.420168
						if( d > 11.5504 )
							if( rsi1 <= 59.9704 )
								if( d <= 15.077 )
									ret := -0.774194 // sell
								if( d > 15.077 )
									ret := -0.314961
							if( rsi1 > 59.9704 )
								if( d_k <= 8.77929 )
									ret := -0.866667 // sell
								if( d_k > 8.77929 )
									ret := 0.106509
					if( smoothK_k > 3.8117 )
						if( k <= 9.26822 )
							if( d_k <= 4.77197 )
								if( rsi1 <= 61.4209 )
									ret := 0.352000
								if( rsi1 > 61.4209 )
									ret := 0.675325
							if( d_k > 4.77197 )
								if( smoothD_d <= 24.9006 )
									ret := -0.138462
								if( smoothD_d > 24.9006 )
									ret := 0.818182 // buy
						if( k > 9.26822 )
							if( rsi1 <= 59.0645 )
								if( d <= 27.8908 )
									ret := -0.021106
								if( d > 27.8908 )
									ret := -0.222325
							if( rsi1 > 59.0645 )
								if( d <= 6.55581 )
									ret := -0.705882 // sell
								if( d > 6.55581 )
									ret := 0.066332
				if( smoothK_k > 33.7917 )
					if( d_k <= -3.79743 )
						if( smoothK_k <= 63.2986 )
							if( smoothD_d <= 20.2251 )
								if( smoothD_d <= 18.4114 )
									ret := 0.329670
								if( smoothD_d > 18.4114 )
									ret := -0.354167
							if( smoothD_d > 20.2251 )
								if( smoothD_d <= 56.2054 )
									ret := 0.248356
								if( smoothD_d > 56.2054 )
									ret := 0.628571
						if( smoothK_k > 63.2986 )
							if( rsi1 <= 71.5136 )
								if( d_k <= -28.7661 )
									ret := -0.633333
								if( d_k > -28.7661 )
									ret := 0.003846
							if( rsi1 > 71.5136 )
								if( smoothK_k <= 65.1122 )
									ret := 0.674419
								if( smoothK_k > 65.1122 )
									ret := 0.055556
					if( d_k > -3.79743 )
						if( smoothK_k <= 35.8909 )
							if( rsi1 <= 62.0924 )
								if( k <= 38.0641 )
									ret := -0.214953
								if( k > 38.0641 )
									ret := 0.241758
							if( rsi1 > 62.0924 )
								if( smoothK_k <= 34.6543 )
									ret := 0.402985
								if( smoothK_k > 34.6543 )
									ret := 0.548077
						if( smoothK_k > 35.8909 )
							if( smoothD_d <= 45.1528 )
								if( rsi1 <= 59.6455 )
									ret := 0.155102
								if( rsi1 > 59.6455 )
									ret := -0.255263
							if( smoothD_d > 45.1528 )
								if( k <= 60.3532 )
									ret := 0.066602
								if( k > 60.3532 )
									ret := -0.052117
			if( smoothD_d > 65.238 )
				if( d_k <= 11.1578 )
					if( d_k <= 9.58675 )
						if( d <= 74.4818 )
							if( smoothK_k <= 65.9731 )
								if( rsi1 <= 74.9226 )
									ret := 0.120000
								if( rsi1 > 74.9226 )
									ret := 0.846154 // buy
							if( smoothK_k > 65.9731 )
								if( d <= 71.9382 )
									ret := -0.648649
								if( d > 71.9382 )
									ret := 0.341463
						if( d > 74.4818 )
							if( smoothD_d <= 72.5506 )
								if( d_k <= 7.70452 )
									ret := 0.839286 // buy
								if( d_k > 7.70452 )
									ret := 0.568182
							if( smoothD_d > 72.5506 )
								if( rsi1 <= 62.2024 )
									ret := 0.051282
								if( rsi1 > 62.2024 )
									ret := 0.473684
					if( d_k > 9.58675 )
						if( smoothK_k <= 64.1879 )
							if( d_k <= 10.7963 )
								if( k <= 62.93 )
									ret := -0.151515
								if( k > 62.93 )
									ret := -0.707692 // sell
							if( d_k > 10.7963 )
								if( d <= 69.6948 )
									ret := 0.846154 // buy
								if( d > 69.6948 )
									ret := -0.195652
						if( smoothK_k > 64.1879 )
							if( smoothK_k <= 65.65 )
								if( d <= 78.3105 )
									ret := 0.809524 // buy
								if( d > 78.3105 )
									ret := 0.478261
							if( smoothK_k > 65.65 )
								if( smoothK_k <= 66.739 )
									ret := 0.142857
								if( smoothK_k > 66.739 )
									ret := -0.416667
				if( d_k > 11.1578 )
					if( rsi1 <= 70.0847 )
						if( d <= 82.124 )
							if( d_k <= 13.4254 )
								if( smoothD_d <= 75.4348 )
									ret := 0.109170
								if( smoothD_d > 75.4348 )
									ret := 0.372549
							if( d_k > 13.4254 )
								if( smoothK_k <= 50.0686 )
									ret := 0.180723
								if( smoothK_k > 50.0686 )
									ret := 0.422777
						if( d > 82.124 )
							if( rsi1 <= 63.0399 )
								if( d_k <= 15.6522 )
									ret := 0.403226
								if( d_k > 15.6522 )
									ret := -0.054054
							if( rsi1 > 63.0399 )
								if( smoothK_k <= 65.1723 )
									ret := 0.096774
								if( smoothK_k > 65.1723 )
									ret := -0.896552 // sell
					if( rsi1 > 70.0847 )
						if( smoothK_k <= 56.9543 )
							if( d_k <= 13.2189 )
								ret := -0.400000
							if( d_k > 13.2189 )
								if( k <= 58.072 )
									ret := 0.596154
								if( k > 58.072 )
									ret := 0.137931
						if( smoothK_k > 56.9543 )
							if( d <= 74.439 )
								ret := 1.000000 // buy
							if( d > 74.439 )
								if( d_k <= 11.7192 )
									ret := 0.440000
								if( d_k > 11.7192 )
									ret := 0.792079 // buy
		if( smoothK_k > 66.9611 )
			if( rsi1 <= 66.6684 )
				if( d <= 88.5692 )
					if( d_k <= -5.3964 )
						if( d_k <= -28.8 )
							if( d <= 42.8197 )
								if( k <= 71.2313 )
									ret := -0.500000
								if( k > 71.2313 )
									ret := -0.500000
							if( d > 42.8197 )
								if( d <= 52.8721 )
									ret := 0.301887
								if( d > 52.8721 )
									ret := -0.200000
						if( d_k > -28.8 )
							if( smoothK_k <= 96.9533 )
								if( k <= 99.8092 )
									ret := 0.268812
								if( k > 99.8092 )
									ret := 1.000000 // buy
							if( smoothK_k > 96.9533 )
								if( smoothD_d <= 81.0333 )
									ret := -0.104762
								if( smoothD_d > 81.0333 )
									ret := 0.205357
					if( d_k > -5.3964 )
						if( d_k <= 9.53701 )
							if( d <= 65.8128 )
								ret := 1.000000 // buy
							if( d > 65.8128 )
								if( smoothK_k <= 70.2907 )
									ret := -0.042484
								if( smoothK_k > 70.2907 )
									ret := 0.130740
						if( d_k > 9.53701 )
							if( d <= 87.7316 )
								if( d <= 80.9385 )
									ret := 0.941176 // buy
								if( d > 80.9385 )
									ret := 0.373737
							if( d > 87.7316 )
								if( rsi1 <= 57.2071 )
									ret := -0.500000
								if( rsi1 > 57.2071 )
									ret := 0.371429
				if( d > 88.5692 )
					if( d <= 99.5923 )
						if( k <= 80.7681 )
							if( rsi1 <= 59.0185 )
								if( d_k <= 14.5322 )
									ret := 0.287879
								if( d_k > 14.5322 )
									ret := 0.900000 // buy
							if( rsi1 > 59.0185 )
								if( rsi1 <= 65.9586 )
									ret := 0.772727 // buy
								if( rsi1 > 65.9586 )
									ret := 0.300000
						if( k > 80.7681 )
							if( d_k <= 6.98861 )
								if( k <= 87.2397 )
									ret := 0.065126
								if( k > 87.2397 )
									ret := 0.309954
							if( d_k > 6.98861 )
								if( rsi1 <= 59.1142 )
									ret := 0.121076
								if( rsi1 > 59.1142 )
									ret := 0.623003
					if( d > 99.5923 )
						if( smoothK_k <= 96.9973 )
							if( smoothD_d <= 96.7093 )
								ret := 0.714286 // buy
							if( smoothD_d > 96.7093 )
								ret := 1.000000 // buy
						if( smoothK_k > 96.9973 )
							if( smoothD_d <= 96.9991 )
								if( d_k <= -0.052547 )
									ret := 0.673469
								if( d_k > -0.052547 )
									ret := 0.941176 // buy
							if( smoothD_d > 96.9991 )
								if( rsi1 <= 61.3248 )
									ret := 0.586957
								if( rsi1 > 61.3248 )
									ret := 0.142857
			if( rsi1 > 66.6684 )
				if( smoothD_d <= 85.5869 )
					if( d_k <= -4.14738 )
						if( d_k <= -26.5257 )
							if( d <= 67.7344 )
								if( smoothD_d <= 60.3726 )
									ret := 0.653846
								if( smoothD_d > 60.3726 )
									ret := 0.976190 // buy
							if( d > 67.7344 )
								if( d_k <= -28.6722 )
									ret := -0.400000
								if( d_k > -28.6722 )
									ret := 0.840000 // buy
						if( d_k > -26.5257 )
							if( rsi1 <= 69.3323 )
								if( d <= 51.5975 )
									ret := -0.750000 // sell
								if( d > 51.5975 )
									ret := 0.317032
							if( rsi1 > 69.3323 )
								if( smoothD_d <= 85.0065 )
									ret := 0.512821
								if( smoothD_d > 85.0065 )
									ret := -0.227273
					if( d_k > -4.14738 )
						if( smoothK_k <= 85.1502 )
							if( rsi1 <= 74.9747 )
								if( d_k <= 10.3953 )
									ret := 0.350410
								if( d_k > 10.3953 )
									ret := 0.774869 // buy
							if( rsi1 > 74.9747 )
								if( rsi1 <= 78.9523 )
									ret := -0.030374
								if( rsi1 > 78.9523 )
									ret := 0.484716
						if( smoothK_k > 85.1502 )
							if( smoothK_k <= 85.8784 )
								if( smoothD_d <= 83.5466 )
									ret := -0.080000
								if( smoothD_d > 83.5466 )
									ret := -0.779661 // sell
							if( smoothK_k > 85.8784 )
								if( rsi1 <= 72.964 )
									ret := 0.373626
								if( rsi1 > 72.964 )
									ret := -0.119048
				if( smoothD_d > 85.5869 )
					if( d_k <= 5.43653 )
						if( d <= 94.7732 )
							if( d_k <= -9.90655 )
								if( d <= 89.4565 )
									ret := 0.275862
								if( d > 89.4565 )
									ret := -0.285714
							if( d_k > -9.90655 )
								if( d <= 90.1356 )
									ret := 0.574887
								if( d > 90.1356 )
									ret := 0.390925
						if( d > 94.7732 )
							if( rsi1 <= 67.6736 )
								if( smoothD_d <= 92.0089 )
									ret := 0.307692
								if( smoothD_d > 92.0089 )
									ret := 0.927660 // buy
							if( rsi1 > 67.6736 )
								if( smoothD_d <= 93.3177 )
									ret := 0.579668
								if( smoothD_d > 93.3177 )
									ret := 0.473864
					if( d_k > 5.43653 )
						if( smoothD_d <= 86.1279 )
							if( d <= 88.9155 )
								ret := 0.363636
							if( d > 88.9155 )
								ret := -0.250000
						if( smoothD_d > 86.1279 )
							if( d_k <= 10.2701 )
								if( smoothK_k <= 79.1998 )
									ret := 0.403509
								if( smoothK_k > 79.1998 )
									ret := 0.690000
							if( d_k > 10.2701 )
								if( smoothK_k <= 77.1515 )
									ret := 1.000000 // buy
								if( smoothK_k > 77.1515 )
									ret := 0.791667 // buy
	
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
float op_operation = decision_tree_0_SHIBUSDT_15Min_842e299d(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


