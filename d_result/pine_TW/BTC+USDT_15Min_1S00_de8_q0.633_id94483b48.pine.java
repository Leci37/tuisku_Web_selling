//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: BTCUSDT_15Min_1S00_94483b48 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_1S00_94483b48", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_94483b48(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 49.7726 )
		if( k <= 22.3635 )
			if( rsi1 <= 29.0946 )
				if( smoothD_d <= -0.697373 )
					if( rsi1 <= 2.38958 )
						if( smoothK_k <= -2.99946 )
							ret := 0.500000
						if( smoothK_k > -2.99946 )
							ret := 0.076923
					if( rsi1 > 2.38958 )
						if( smoothD_d <= -2.95455 )
							if( smoothD_d <= -2.99935 )
								if( rsi1 <= 25.7485 )
									ret := -0.765133 // sell
								if( rsi1 > 25.7485 )
									ret := -0.436782
							if( smoothD_d > -2.99935 )
								if( d <= 0.01194 )
									ret := -0.973684 // sell
								if( d > 0.01194 )
									ret := -0.766667 // sell
						if( smoothD_d > -2.95455 )
							if( smoothD_d <= -2.23914 )
								if( k <= 4.9e-05 )
									ret := -0.216102
								if( k > 4.9e-05 )
									ret := -0.470721
							if( smoothD_d > -2.23914 )
								if( smoothD_d <= -1.84416 )
									ret := -0.766110 // sell
								if( smoothD_d > -1.84416 )
									ret := -0.576923
				if( smoothD_d > -0.697373 )
					if( rsi1 <= 14.8192 )
						if( smoothD_d <= 2.97897 )
							if( smoothD_d <= 1.40851 )
								if( d <= 3.42533 )
									ret := -0.757812 // sell
								if( d > 3.42533 )
									ret := -0.491228
							if( smoothD_d > 1.40851 )
								if( rsi1 <= 11.856 )
									ret := 0.325000
								if( rsi1 > 11.856 )
									ret := -0.550000
						if( smoothD_d > 2.97897 )
							if( k <= 17.4067 )
								if( d_k <= 20.8589 )
									ret := -0.779503 // sell
								if( d_k > 20.8589 )
									ret := 0.166667
							if( k > 17.4067 )
								if( d <= 12.2762 )
									ret := 0.272727
								if( d > 12.2762 )
									ret := -0.714286 // sell
					if( rsi1 > 14.8192 )
						if( d_k <= 16.2683 )
							if( d_k <= 13.7013 )
								if( smoothD_d <= 23.6358 )
									ret := -0.403599
								if( smoothD_d > 23.6358 )
									ret := 0.382353
							if( d_k > 13.7013 )
								if( rsi1 <= 18.2488 )
									ret := -0.714286 // sell
								if( rsi1 > 18.2488 )
									ret := 0.231343
						if( d_k > 16.2683 )
							if( rsi1 <= 16.0907 )
								ret := 0.142857
							if( rsi1 > 16.0907 )
								if( d <= 27.6889 )
									ret := -0.751295 // sell
								if( d > 27.6889 )
									ret := -0.578947
			if( rsi1 > 29.0946 )
				if( rsi1 <= 41.1511 )
					if( smoothD_d <= 2.22362 )
						if( smoothK_k <= -0.97055 )
							if( d_k <= 0.384293 )
								if( d <= 7.1e-05 )
									ret := -0.621762
								if( d > 7.1e-05 )
									ret := -0.739035 // sell
							if( d_k > 0.384293 )
								if( smoothD_d <= -2.40273 )
									ret := 0.611111
								if( smoothD_d > -2.40273 )
									ret := -0.440860
						if( smoothK_k > -0.97055 )
							if( d_k <= -1.02865 )
								if( rsi1 <= 29.5373 )
									ret := -0.862745 // sell
								if( rsi1 > 29.5373 )
									ret := -0.437309
							if( d_k > -1.02865 )
								if( k <= 2.67941 )
									ret := -0.354651
								if( k > 2.67941 )
									ret := -0.142857
					if( smoothD_d > 2.22362 )
						if( d_k <= -2.92185 )
							if( rsi1 <= 36.9624 )
								if( smoothK_k <= 7.48006 )
									ret := 0.025316
								if( smoothK_k > 7.48006 )
									ret := -0.472063
							if( rsi1 > 36.9624 )
								if( d <= 16.6198 )
									ret := -0.232095
								if( d > 16.6198 )
									ret := -0.787234 // sell
						if( d_k > -2.92185 )
							if( smoothK_k <= -2.82986 )
								if( rsi1 <= 35.52 )
									ret := -0.555932
								if( rsi1 > 35.52 )
									ret := -0.251121
							if( smoothK_k > -2.82986 )
								if( smoothK_k <= 12.2995 )
									ret := -0.239651
								if( smoothK_k > 12.2995 )
									ret := -0.135959
				if( rsi1 > 41.1511 )
					if( smoothD_d <= 7.94773 )
						if( rsi1 <= 47.7205 )
							if( smoothD_d <= -0.595289 )
								if( smoothK_k <= 1.71265 )
									ret := -0.415865
								if( smoothK_k > 1.71265 )
									ret := -0.852459 // sell
							if( smoothD_d > -0.595289 )
								if( rsi1 <= 42.1554 )
									ret := -0.112385
								if( rsi1 > 42.1554 )
									ret := -0.330982
						if( rsi1 > 47.7205 )
							if( d <= 1.51962 )
								if( k <= 2.9455 )
									ret := 0.301887
								if( k > 2.9455 )
									ret := 0.888889 // buy
							if( d > 1.51962 )
								if( d_k <= -6.90504 )
									ret := -0.547170
								if( d_k > -6.90504 )
									ret := -0.145221
					if( smoothD_d > 7.94773 )
						if( smoothD_d <= 21.7841 )
							if( rsi1 <= 42.0365 )
								if( smoothK_k <= 3.37751 )
									ret := -0.523810
								if( smoothK_k > 3.37751 )
									ret := 0.182482
							if( rsi1 > 42.0365 )
								if( smoothK_k <= -1.97901 )
									ret := -0.647727
								if( smoothK_k > -1.97901 )
									ret := -0.092670
						if( smoothD_d > 21.7841 )
							if( smoothK_k <= 18.2563 )
								if( rsi1 <= 49.2961 )
									ret := -0.317121
								if( rsi1 > 49.2961 )
									ret := 0.109375
							if( smoothK_k > 18.2563 )
								if( k <= 22.0487 )
									ret := 0.300000
								if( k > 22.0487 )
									ret := -0.125000
		if( k > 22.3635 )
			if( k <= 65.1084 )
				if( d <= 56.2156 )
					if( smoothD_d <= 24.1621 )
						if( smoothK_k <= 25.0657 )
							if( d <= 17.4744 )
								if( d_k <= -6.71233 )
									ret := -0.254822
								if( d_k > -6.71233 )
									ret := -0.523256
							if( d > 17.4744 )
								if( smoothD_d <= 22.0208 )
									ret := 0.020392
								if( smoothD_d > 22.0208 )
									ret := -0.287273
						if( smoothK_k > 25.0657 )
							if( d_k <= -15.9704 )
								if( rsi1 <= 31.8422 )
									ret := -0.725806 // sell
								if( rsi1 > 31.8422 )
									ret := -0.404858
							if( d_k > -15.9704 )
								if( d_k <= -2.16073 )
									ret := -0.270382
								if( d_k > -2.16073 )
									ret := -0.851852 // sell
					if( smoothD_d > 24.1621 )
						if( d <= 40.3733 )
							if( smoothK_k <= 52.3137 )
								if( smoothD_d <= 33.8886 )
									ret := -0.031989
								if( smoothD_d > 33.8886 )
									ret := 0.095451
							if( smoothK_k > 52.3137 )
								if( d <= 40.0124 )
									ret := -0.369492
								if( d > 40.0124 )
									ret := 0.294118
						if( d > 40.3733 )
							if( k <= 40.913 )
								if( rsi1 <= 37.6695 )
									ret := -0.458493
								if( rsi1 > 37.6695 )
									ret := -0.222798
							if( k > 40.913 )
								if( k <= 58.1354 )
									ret := -0.033190
								if( k > 58.1354 )
									ret := 0.100621
				if( d > 56.2156 )
					if( d_k <= -1.00469 )
						if( smoothD_d <= 58.9756 )
							if( smoothD_d <= 56.9935 )
								if( k <= 61.276 )
									ret := 0.459016
								if( k > 61.276 )
									ret := 0.052632
							if( smoothD_d > 56.9935 )
								if( rsi1 <= 38.1344 )
									ret := -0.363636
								if( rsi1 > 38.1344 )
									ret := 0.645161
						if( smoothD_d > 58.9756 )
							if( smoothD_d <= 59.607 )
								ret := -0.352941
							if( smoothD_d > 59.607 )
								ret := 0.100000
					if( d_k > -1.00469 )
						if( d_k <= 6.59861 )
							if( rsi1 <= 48.0963 )
								if( smoothD_d <= 57.8536 )
									ret := -0.235110
								if( smoothD_d > 57.8536 )
									ret := -0.490909
							if( rsi1 > 48.0963 )
								if( k <= 60.4167 )
									ret := -0.619718
								if( k > 60.4167 )
									ret := -0.881579 // sell
						if( d_k > 6.59861 )
							if( rsi1 <= 40.136 )
								if( smoothD_d <= 63.1954 )
									ret := -0.568075
								if( smoothD_d > 63.1954 )
									ret := -0.224626
							if( rsi1 > 40.136 )
								if( smoothK_k <= 55.267 )
									ret := -0.212203
								if( smoothK_k > 55.267 )
									ret := -0.002105
			if( k > 65.1084 )
				if( rsi1 <= 33.4915 )
					if( rsi1 <= 24.4725 )
						if( d_k <= -19.8221 )
							if( k <= 75.3685 )
								ret := 0.538462
							if( k > 75.3685 )
								ret := -0.285714
						if( d_k > -19.8221 )
							if( k <= 92.5399 )
								if( rsi1 <= 21.839 )
									ret := -0.565217
								if( rsi1 > 21.839 )
									ret := -0.885714 // sell
							if( k > 92.5399 )
								ret := -0.461538
					if( rsi1 > 24.4725 )
						if( k <= 72.6262 )
							if( smoothK_k <= 67.4543 )
								if( rsi1 <= 31.8143 )
									ret := -0.098485
								if( rsi1 > 31.8143 )
									ret := -0.441176
							if( smoothK_k > 67.4543 )
								if( d <= 61.5426 )
									ret := -0.965517 // sell
								if( d > 61.5426 )
									ret := -0.476190
						if( k > 72.6262 )
							if( d <= 59.2282 )
								if( smoothD_d <= 51.5532 )
									ret := -0.200000
								if( smoothD_d > 51.5532 )
									ret := 0.560976
							if( d > 59.2282 )
								if( d_k <= 0.911352 )
									ret := -0.229462
								if( d_k > 0.911352 )
									ret := 0.156028
				if( rsi1 > 33.4915 )
					if( smoothD_d <= 90.1566 )
						if( smoothD_d <= 68.9892 )
							if( d <= 58.0083 )
								if( d <= 55.4783 )
									ret := 0.147399
								if( d > 55.4783 )
									ret := -0.225926
							if( d > 58.0083 )
								if( smoothK_k <= 66.0219 )
									ret := 0.027778
								if( smoothK_k > 66.0219 )
									ret := 0.254781
						if( smoothD_d > 68.9892 )
							if( k <= 74.1721 )
								if( smoothK_k <= 65.9911 )
									ret := 0.015198
								if( smoothK_k > 65.9911 )
									ret := -0.267703
							if( k > 74.1721 )
								if( rsi1 <= 45.6892 )
									ret := -0.012346
								if( rsi1 > 45.6892 )
									ret := 0.165989
					if( smoothD_d > 90.1566 )
						if( rsi1 <= 45.4628 )
							if( smoothK_k <= 94.6792 )
								if( smoothD_d <= 95.5408 )
									ret := -0.048387
								if( smoothD_d > 95.5408 )
									ret := -0.777778 // sell
							if( smoothK_k > 94.6792 )
								if( d <= 94.54 )
									ret := 0.727273 // buy
								if( d > 94.54 )
									ret := 0.195312
						if( rsi1 > 45.4628 )
							if( k <= 96.874 )
								if( smoothK_k <= 89.207 )
									ret := 0.299065
								if( smoothK_k > 89.207 )
									ret := 0.578431
							if( k > 96.874 )
								if( smoothD_d <= 96.4044 )
									ret := 0.052632
								if( smoothD_d > 96.4044 )
									ret := 0.714286 // buy
	if( rsi1 > 49.7726 )
		if( d <= 76.6643 )
			if( k <= 49.5659 )
				if( smoothK_k <= 24.9331 )
					if( rsi1 <= 66.8767 )
						if( rsi1 <= 57.7288 )
							if( d_k <= 15.6145 )
								if( d <= 34.9293 )
									ret := -0.157250
								if( d > 34.9293 )
									ret := -0.656934
							if( d_k > 15.6145 )
								if( d <= 37.9609 )
									ret := -0.533170
								if( d > 37.9609 )
									ret := -0.149644
						if( rsi1 > 57.7288 )
							if( smoothD_d <= 16.247 )
								if( d <= 2.9541 )
									ret := 0.214876
								if( d > 2.9541 )
									ret := -0.161765
							if( smoothD_d > 16.247 )
								if( d <= 21.3145 )
									ret := 0.434109
								if( d > 21.3145 )
									ret := -0.011236
					if( rsi1 > 66.8767 )
						if( smoothK_k <= 21.2231 )
							if( d_k <= 20.0487 )
								if( d <= 36.7857 )
									ret := 0.089888
								if( d > 36.7857 )
									ret := -0.620690
							if( d_k > 20.0487 )
								if( rsi1 <= 73.9575 )
									ret := 0.746988 // buy
								if( rsi1 > 73.9575 )
									ret := 0.250000
						if( smoothK_k > 21.2231 )
							if( d <= 12.6626 )
								if( smoothD_d <= 6.714 )
									ret := 0.941176 // buy
								if( smoothD_d > 6.714 )
									ret := 1.000000 // buy
							if( d > 12.6626 )
								if( rsi1 <= 70.2627 )
									ret := 0.319149
								if( rsi1 > 70.2627 )
									ret := 0.721311 // buy
				if( smoothK_k > 24.9331 )
					if( smoothD_d <= 16.5761 )
						if( rsi1 <= 56.308 )
							if( d_k <= -10.1025 )
								if( k <= 29.3035 )
									ret := -0.725000 // sell
								if( k > 29.3035 )
									ret := -0.362500
							if( d_k > -10.1025 )
								ret := 0.357143
						if( rsi1 > 56.308 )
							if( k <= 30.5859 )
								if( smoothK_k <= 26.1984 )
									ret := 0.387097
								if( smoothK_k > 26.1984 )
									ret := 0.600000
							if( k > 30.5859 )
								if( smoothK_k <= 29.2369 )
									ret := -0.527778
								if( smoothK_k > 29.2369 )
									ret := -0.024194
					if( smoothD_d > 16.5761 )
						if( k <= 30.6814 )
							if( smoothD_d <= 17.889 )
								if( d <= 20.3215 )
									ret := 0.250000
								if( d > 20.3215 )
									ret := -0.708333 // sell
							if( smoothD_d > 17.889 )
								if( d <= 25.6347 )
									ret := 0.590909
								if( d > 25.6347 )
									ret := 0.141379
						if( k > 30.6814 )
							if( d_k <= 24.0627 )
								if( smoothD_d <= 45.6582 )
									ret := 0.083727
								if( smoothD_d > 45.6582 )
									ret := -0.057932
							if( d_k > 24.0627 )
								if( d <= 59.3018 )
									ret := -0.250000
								if( d > 59.3018 )
									ret := 0.472727
			if( k > 49.5659 )
				if( d_k <= -1.23594 )
					if( rsi1 <= 69.2468 )
						if( d <= 49.6735 )
							if( smoothK_k <= 66.4162 )
								if( k <= 66.1732 )
									ret := 0.290612
								if( k > 66.1732 )
									ret := 0.648889
							if( smoothK_k > 66.4162 )
								if( k <= 72.8467 )
									ret := 0.185841
								if( k > 72.8467 )
									ret := 0.034188
						if( d > 49.6735 )
							if( smoothD_d <= 49.2437 )
								if( smoothD_d <= 49.1013 )
									ret := 0.084980
								if( smoothD_d > 49.1013 )
									ret := -0.566667
							if( smoothD_d > 49.2437 )
								if( rsi1 <= 66.2959 )
									ret := 0.198759
								if( rsi1 > 66.2959 )
									ret := 0.332773
					if( rsi1 > 69.2468 )
						if( d_k <= -30.024 )
							if( smoothK_k <= 62.0205 )
								ret := -0.900000 // sell
							if( smoothK_k > 62.0205 )
								if( k <= 90.7255 )
									ret := 0.119048
								if( k > 90.7255 )
									ret := -0.230769
						if( d_k > -30.024 )
							if( k <= 76.0063 )
								if( smoothD_d <= 47.7394 )
									ret := 0.608511
								if( smoothD_d > 47.7394 )
									ret := 0.311667
							if( k > 76.0063 )
								if( k <= 93.1293 )
									ret := 0.645365
								if( k > 93.1293 )
									ret := 0.243478
				if( d_k > -1.23594 )
					if( smoothD_d <= 68.0557 )
						if( rsi1 <= 64.6905 )
							if( d_k <= 19.2585 )
								if( smoothK_k <= 66.7664 )
									ret := -0.044394
								if( smoothK_k > 66.7664 )
									ret := -0.571429
							if( d_k > 19.2585 )
								ret := 0.846154 // buy
						if( rsi1 > 64.6905 )
							if( smoothD_d <= 49.175 )
								if( smoothD_d <= 48.7162 )
									ret := -0.600000
								if( smoothD_d > 48.7162 )
									ret := -0.214286
							if( smoothD_d > 49.175 )
								if( rsi1 <= 71.325 )
									ret := 0.233883
								if( rsi1 > 71.325 )
									ret := -0.024691
					if( smoothD_d > 68.0557 )
						if( k <= 62.3068 )
							if( rsi1 <= 87.3342 )
								if( k <= 50.6469 )
									ret := 0.812500 // buy
								if( k > 50.6469 )
									ret := 0.302926
							if( rsi1 > 87.3342 )
								ret := -0.875000 // sell
						if( k > 62.3068 )
							if( smoothD_d <= 73.3693 )
								if( k <= 72.1452 )
									ret := 0.036929
								if( k > 72.1452 )
									ret := 0.208029
							if( smoothD_d > 73.3693 )
								if( k <= 71.1538 )
									ret := -0.111111
								if( k > 71.1538 )
									ret := -0.380952
		if( d > 76.6643 )
			if( k <= 95.7426 )
				if( d_k <= -11.2833 )
					if( k <= 94.7107 )
						if( rsi1 <= 71.3178 )
							if( smoothD_d <= 74.8249 )
								if( d <= 76.8404 )
									ret := 0.250000
								if( d > 76.8404 )
									ret := 0.750000 // buy
							if( smoothD_d > 74.8249 )
								if( d <= 78.4042 )
									ret := -0.057692
								if( d > 78.4042 )
									ret := 0.557447
						if( rsi1 > 71.3178 )
							if( k <= 94.5042 )
								if( k <= 93.4232 )
									ret := 0.884058 // buy
								if( k > 93.4232 )
									ret := 1.000000 // buy
							if( k > 94.5042 )
								ret := 0.545455
					if( k > 94.7107 )
						if( d_k <= -16.1278 )
							if( d_k <= -17.3035 )
								ret := 0.000000
							if( d_k > -17.3035 )
								ret := -0.692308
						if( d_k > -16.1278 )
							if( smoothK_k <= 91.839 )
								ret := -0.050000
							if( smoothK_k > 91.839 )
								if( d_k <= -13.3228 )
									ret := 0.814815 // buy
								if( d_k > -13.3228 )
									ret := -0.047619
				if( d_k > -11.2833 )
					if( d <= 91.2515 )
						if( d_k <= 8.76955 )
							if( k <= 75.119 )
								if( k <= 74.0845 )
									ret := 0.138672
								if( k > 74.0845 )
									ret := -0.231132
							if( k > 75.119 )
								if( smoothD_d <= 87.452 )
									ret := 0.261489
								if( smoothD_d > 87.452 )
									ret := 0.088496
						if( d_k > 8.76955 )
							if( rsi1 <= 65.6702 )
								if( rsi1 <= 65.3248 )
									ret := 0.249162
								if( rsi1 > 65.3248 )
									ret := -0.416667
							if( rsi1 > 65.6702 )
								if( smoothD_d <= 84.1594 )
									ret := 0.639222
								if( smoothD_d > 84.1594 )
									ret := 0.813149 // buy
					if( d > 91.2515 )
						if( rsi1 <= 68.3491 )
							if( smoothK_k <= 92.1106 )
								if( smoothD_d <= 93.6444 )
									ret := 0.295680
								if( smoothD_d > 93.6444 )
									ret := 0.455026
							if( smoothK_k > 92.1106 )
								if( rsi1 <= 66.6031 )
									ret := 0.062500
								if( rsi1 > 66.6031 )
									ret := 0.560000
						if( rsi1 > 68.3491 )
							if( k <= 88.1595 )
								if( d <= 92.138 )
									ret := 0.846715 // buy
								if( d > 92.138 )
									ret := 0.647273
							if( k > 88.1595 )
								if( smoothK_k <= 90.8555 )
									ret := 0.499682
								if( smoothK_k > 90.8555 )
									ret := 0.368020
			if( k > 95.7426 )
				if( d <= 98.4884 )
					if( k <= 99.5623 )
						if( smoothK_k <= 96.4413 )
							if( smoothD_d <= 76.1448 )
								if( d_k <= -20.4845 )
									ret := 0.687500
								if( d_k > -20.4845 )
									ret := -0.298246
							if( smoothD_d > 76.1448 )
								if( smoothK_k <= 94.0639 )
									ret := 0.423711
								if( smoothK_k > 94.0639 )
									ret := 0.333467
						if( smoothK_k > 96.4413 )
							if( d <= 97.3918 )
								if( d_k <= -13.7267 )
									ret := 0.428571
								if( d_k > -13.7267 )
									ret := -0.152000
							if( d > 97.3918 )
								if( d <= 98.1326 )
									ret := 0.720000 // buy
								if( d > 98.1326 )
									ret := 0.307692
					if( k > 99.5623 )
						if( rsi1 <= 73.7289 )
							if( d_k <= -9.05305 )
								if( rsi1 <= 50.435 )
									ret := -0.583333
								if( rsi1 > 50.435 )
									ret := 0.527721
							if( d_k > -9.05305 )
								if( rsi1 <= 67.2677 )
									ret := 0.108696
								if( rsi1 > 67.2677 )
									ret := 0.390244
						if( rsi1 > 73.7289 )
							if( smoothD_d <= 91.9729 )
								if( k <= 99.9942 )
									ret := 0.750000 // buy
								if( k > 99.9942 )
									ret := 0.460106
							if( smoothD_d > 91.9729 )
								if( d_k <= -1.64793 )
									ret := 0.754253 // buy
								if( d_k > -1.64793 )
									ret := 0.111111
				if( d > 98.4884 )
					if( k <= 97.0117 )
						if( rsi1 <= 66.4576 )
							if( smoothD_d <= 95.8379 )
								if( smoothK_k <= 93.4711 )
									ret := 0.285714
								if( smoothK_k > 93.4711 )
									ret := -0.052632
							if( smoothD_d > 95.8379 )
								if( d_k <= 2.0774 )
									ret := 0.909091 // buy
								if( d_k > 2.0774 )
									ret := 0.666667
						if( rsi1 > 66.4576 )
							if( smoothK_k <= 93.4764 )
								if( rsi1 <= 80.5068 )
									ret := 0.558140
								if( rsi1 > 80.5068 )
									ret := 0.909091 // buy
							if( smoothK_k > 93.4764 )
								if( d <= 98.9073 )
									ret := 0.985915 // buy
								if( d > 98.9073 )
									ret := 0.761905 // buy
					if( k > 97.0117 )
						if( rsi1 <= 86.3778 )
							if( d_k <= -0.12819 )
								if( smoothD_d <= 95.7869 )
									ret := 0.473430
								if( smoothD_d > 95.7869 )
									ret := 0.226506
							if( d_k > -0.12819 )
								if( smoothK_k <= 94.9778 )
									ret := 0.282297
								if( smoothK_k > 94.9778 )
									ret := 0.486524
						if( rsi1 > 86.3778 )
							if( d_k <= 0.511222 )
								if( d_k <= 8e-05 )
									ret := 0.695122
								if( d_k > 8e-05 )
									ret := 0.907104 // buy
							if( d_k > 0.511222 )
								if( k <= 97.8472 )
									ret := 0.888889 // buy
								if( k > 97.8472 )
									ret := -0.136364
	
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
float op_operation = decision_tree_0_BTCUSDT_15Min_94483b48(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


