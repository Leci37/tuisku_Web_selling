//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ETHUSDT_15Min_1S00_2737677a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1S00_2737677a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_2737677a(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 52.3976 )
		if( smoothK_k <= 14.4421 )
			if( rsi1 <= 34.5495 )
				if( rsi1 <= 23.7407 )
					if( rsi1 <= 2.696 )
						if( k <= 0.000112 )
							ret := 0.000000
						if( k > 0.000112 )
							ret := 1.000000 // buy
					if( rsi1 > 2.696 )
						if( d <= 32.9147 )
							if( d <= 5.92016 )
								if( smoothK_k <= 2.19409 )
									ret := -0.421714
								if( smoothK_k > 2.19409 )
									ret := -0.619355
							if( d > 5.92016 )
								if( smoothK_k <= 13.1797 )
									ret := -0.292870
								if( smoothK_k > 13.1797 )
									ret := -0.670732
						if( d > 32.9147 )
							if( k <= 9.70703 )
								ret := -0.500000
							if( k > 9.70703 )
								if( d_k <= 26.5321 )
									ret := -1.000000 // sell
								if( d_k > 26.5321 )
									ret := -0.866667 // sell
				if( rsi1 > 23.7407 )
					if( d_k <= 0.000313 )
						if( k <= 0.257225 )
							if( rsi1 <= 33.6338 )
								if( d <= 0.016905 )
									ret := -0.618056
								if( d > 0.016905 )
									ret := -0.890909 // sell
							if( rsi1 > 33.6338 )
								ret := 0.500000
						if( k > 0.257225 )
							if( d_k <= -3.69509 )
								if( smoothD_d <= -0.853733 )
									ret := -0.941176 // sell
								if( smoothD_d > -0.853733 )
									ret := -0.416849
							if( d_k > -3.69509 )
								if( k <= 0.400892 )
									ret := 0.388889
								if( k > 0.400892 )
									ret := -0.299159
					if( d_k > 0.000313 )
						if( d <= 2.91501 )
							if( rsi1 <= 25.4707 )
								if( smoothD_d <= -0.530616 )
									ret := -0.640625
								if( smoothD_d > -0.530616 )
									ret := 0.117647
							if( rsi1 > 25.4707 )
								if( rsi1 <= 27.5241 )
									ret := 0.277778
								if( rsi1 > 27.5241 )
									ret := -0.126866
						if( d > 2.91501 )
							if( d <= 42.1401 )
								if( d_k <= 13.5257 )
									ret := -0.252739
								if( d_k > 13.5257 )
									ret := -0.419825
							if( d > 42.1401 )
								if( k <= 15.248 )
									ret := 0.900000 // buy
								if( k > 15.248 )
									ret := -0.400000
			if( rsi1 > 34.5495 )
				if( smoothD_d <= 6.63532 )
					if( d_k <= -5.49065 )
						if( rsi1 <= 40.2064 )
							if( smoothK_k <= 9.11979 )
								if( rsi1 <= 39.3134 )
									ret := -0.697917
								if( rsi1 > 39.3134 )
									ret := 0.166667
							if( smoothK_k > 9.11979 )
								if( rsi1 <= 37.9314 )
									ret := -0.202020
								if( rsi1 > 37.9314 )
									ret := -0.600000
						if( rsi1 > 40.2064 )
							if( rsi1 <= 55.0999 )
								if( rsi1 <= 49.5712 )
									ret := -0.304207
								if( rsi1 > 49.5712 )
									ret := 0.065041
							if( rsi1 > 55.0999 )
								if( smoothK_k <= 9.59893 )
									ret := -0.756757 // sell
								if( smoothK_k > 9.59893 )
									ret := -0.326733
					if( d_k > -5.49065 )
						if( d_k <= 7.94886 )
							if( d <= 0.09592 )
								if( rsi1 <= 43.0409 )
									ret := -0.695652
								if( rsi1 > 43.0409 )
									ret := 0.000000
							if( d > 0.09592 )
								if( rsi1 <= 56.5072 )
									ret := -0.208677
								if( rsi1 > 56.5072 )
									ret := -0.080479
						if( d_k > 7.94886 )
							if( k <= 0.802339 )
								if( d_k <= 8.3063 )
									ret := -0.741935 // sell
								if( d_k > 8.3063 )
									ret := -0.490196
							if( k > 0.802339 )
								if( smoothK_k <= -1.80369 )
									ret := 0.166667
								if( smoothK_k > -1.80369 )
									ret := -0.500000
				if( smoothD_d > 6.63532 )
					if( rsi1 <= 41.619 )
						if( d_k <= 7.42801 )
							if( smoothD_d <= 12.311 )
								if( d_k <= 0.203012 )
									ret := -0.292621
								if( d_k > 0.203012 )
									ret := -0.062344
							if( smoothD_d > 12.311 )
								if( rsi1 <= 36.3951 )
									ret := 0.548780
								if( rsi1 > 36.3951 )
									ret := -0.018265
						if( d_k > 7.42801 )
							if( d_k <= 8.93916 )
								if( smoothK_k <= 11.2841 )
									ret := -0.632432
								if( smoothK_k > 11.2841 )
									ret := 0.500000
							if( d_k > 8.93916 )
								if( d_k <= 12.7411 )
									ret := -0.130952
								if( d_k > 12.7411 )
									ret := -0.307475
					if( rsi1 > 41.619 )
						if( rsi1 <= 65.0735 )
							if( d_k <= 3.48973 )
								if( d_k <= 1.7251 )
									ret := -0.029954
								if( d_k > 1.7251 )
									ret := 0.234177
							if( d_k > 3.48973 )
								if( d_k <= 21.3583 )
									ret := -0.123352
								if( d_k > 21.3583 )
									ret := 0.061758
						if( rsi1 > 65.0735 )
							if( smoothD_d <= 33.3319 )
								if( d <= 28.7178 )
									ret := 0.253886
								if( d > 28.7178 )
									ret := -0.300000
							if( smoothD_d > 33.3319 )
								if( d <= 42.6955 )
									ret := 0.777778 // buy
								if( d > 42.6955 )
									ret := -0.500000
		if( smoothK_k > 14.4421 )
			if( rsi1 <= 51.4929 )
				if( smoothK_k <= 31.8851 )
					if( rsi1 <= 39.0298 )
						if( d_k <= -7.42613 )
							if( d_k <= -14.0102 )
								if( rsi1 <= 32.8203 )
									ret := -0.817073 // sell
								if( rsi1 > 32.8203 )
									ret := -0.328358
							if( d_k > -14.0102 )
								if( smoothK_k <= 30.4404 )
									ret := -0.304971
								if( smoothK_k > 30.4404 )
									ret := 0.010526
						if( d_k > -7.42613 )
							if( d_k <= 6.82533 )
								if( d <= 34.4872 )
									ret := -0.058591
								if( d > 34.4872 )
									ret := -0.382114
							if( d_k > 6.82533 )
								if( rsi1 <= 28.4413 )
									ret := -0.423611
								if( rsi1 > 28.4413 )
									ret := -0.225621
					if( rsi1 > 39.0298 )
						if( d <= 50.6226 )
							if( d <= 42.1643 )
								if( d_k <= -11.1009 )
									ret := -0.253940
								if( d_k > -11.1009 )
									ret := -0.065448
							if( d > 42.1643 )
								if( k <= 34.3472 )
									ret := -0.322160
								if( k > 34.3472 )
									ret := 0.240000
						if( d > 50.6226 )
							if( rsi1 <= 48.075 )
								if( d_k <= 21.4725 )
									ret := -0.428571
								if( d_k > 21.4725 )
									ret := 0.045455
							if( rsi1 > 48.075 )
								if( d <= 51.4172 )
									ret := 0.000000
								if( d > 51.4172 )
									ret := 0.643678
				if( smoothK_k > 31.8851 )
					if( rsi1 <= 30.6524 )
						if( d_k <= 2.93678 )
							if( smoothK_k <= 37.5628 )
								if( rsi1 <= 26.5772 )
									ret := -0.150000
								if( rsi1 > 26.5772 )
									ret := 0.259259
							if( smoothK_k > 37.5628 )
								if( k <= 53.082 )
									ret := -0.283096
								if( k > 53.082 )
									ret := 0.175439
						if( d_k > 2.93678 )
							if( k <= 51.1029 )
								if( smoothD_d <= 43.2174 )
									ret := -0.704545 // sell
								if( smoothD_d > 43.2174 )
									ret := -0.296748
							if( k > 51.1029 )
								if( d <= 60.977 )
									ret := -0.681818
								if( d > 60.977 )
									ret := -0.870968 // sell
					if( rsi1 > 30.6524 )
						if( d <= 20.8854 )
							if( rsi1 <= 37.3903 )
								if( smoothK_k <= 31.9776 )
									ret := 0.600000
								if( smoothK_k > 31.9776 )
									ret := -0.698113
							if( rsi1 > 37.3903 )
								if( k <= 37.6983 )
									ret := 0.000000
								if( k > 37.6983 )
									ret := -0.394737
						if( d > 20.8854 )
							if( d_k <= 1.55109 )
								if( d_k <= -14.8598 )
									ret := -0.103933
								if( d_k > -14.8598 )
									ret := 0.077096
							if( d_k > 1.55109 )
								if( smoothD_d <= 61.1386 )
									ret := -0.101730
								if( smoothD_d > 61.1386 )
									ret := 0.018919
			if( rsi1 > 51.4929 )
				if( rsi1 <= 71.763 )
					if( smoothD_d <= 39.1574 )
						if( d <= 18.3721 )
							if( d_k <= -16.6578 )
								if( smoothD_d <= 14.0919 )
									ret := 0.411765
								if( smoothD_d > 14.0919 )
									ret := -0.187500
							if( d_k > -16.6578 )
								if( d_k <= -13.8839 )
									ret := -0.362637
								if( d_k > -13.8839 )
									ret := -0.074392
						if( d > 18.3721 )
							if( rsi1 <= 55.4387 )
								if( smoothK_k <= 41.1057 )
									ret := 0.095357
								if( smoothK_k > 41.1057 )
									ret := -0.178322
							if( rsi1 > 55.4387 )
								if( d_k <= 13.5874 )
									ret := 0.193444
								if( d_k > 13.5874 )
									ret := -0.128342
					if( smoothD_d > 39.1574 )
						if( smoothD_d <= 68.2872 )
							if( smoothD_d <= 47.8876 )
								if( d_k <= 17.7935 )
									ret := -0.028651
								if( d_k > 17.7935 )
									ret := -0.243478
							if( smoothD_d > 47.8876 )
								if( smoothK_k <= 36.8742 )
									ret := 0.148454
								if( smoothK_k > 36.8742 )
									ret := -0.019704
						if( smoothD_d > 68.2872 )
							if( k <= 49.2837 )
								if( smoothD_d <= 68.5685 )
									ret := 0.400000
								if( smoothD_d > 68.5685 )
									ret := 0.785714 // buy
							if( k > 49.2837 )
								if( d_k <= 19.7599 )
									ret := 0.500000
								if( d_k > 19.7599 )
									ret := 0.234375
				if( rsi1 > 71.763 )
					if( smoothD_d <= 35.7625 )
						if( d <= 14.3847 )
							if( d <= 13.644 )
								ret := 0.285714
							if( d > 13.644 )
								if( smoothK_k <= 28.6008 )
									ret := -0.750000 // sell
								if( smoothK_k > 28.6008 )
									ret := -1.000000 // sell
						if( d > 14.3847 )
							if( d_k <= -16.2739 )
								if( k <= 52.5119 )
									ret := 0.000000
								if( k > 52.5119 )
									ret := 0.807692 // buy
							if( d_k > -16.2739 )
								if( d_k <= 3.77202 )
									ret := 0.734940 // buy
								if( d_k > 3.77202 )
									ret := 0.130435
					if( smoothD_d > 35.7625 )
						if( d_k <= 11.0999 )
							if( smoothD_d <= 50.9643 )
								if( d_k <= -1.48106 )
									ret := -0.311111
								if( d_k > -1.48106 )
									ret := 0.300000
							if( smoothD_d > 50.9643 )
								if( smoothK_k <= 48.7195 )
									ret := -0.735294 // sell
								if( smoothK_k > 48.7195 )
									ret := -0.076923
						if( d_k > 11.0999 )
							if( smoothD_d <= 61.3669 )
								if( smoothD_d <= 59.588 )
									ret := 0.367925
								if( smoothD_d > 59.588 )
									ret := -0.200000
							if( smoothD_d > 61.3669 )
								if( k <= 54.1063 )
									ret := 0.556818
								if( k > 54.1063 )
									ret := -0.250000
	if( smoothK_k > 52.3976 )
		if( rsi1 <= 66.8362 )
			if( smoothK_k <= 73.9733 )
				if( d <= 60.8708 )
					if( rsi1 <= 56.8396 )
						if( smoothD_d <= 49.3343 )
							if( rsi1 <= 41.3692 )
								if( k <= 74.1249 )
									ret := -0.044577
								if( k > 74.1249 )
									ret := -0.678571
							if( rsi1 > 41.3692 )
								if( smoothD_d <= 49.0899 )
									ret := 0.106711
								if( smoothD_d > 49.0899 )
									ret := -0.461538
						if( smoothD_d > 49.3343 )
							if( d_k <= -2.98608 )
								if( smoothK_k <= 71.5214 )
									ret := 0.202256
								if( smoothK_k > 71.5214 )
									ret := 0.432432
							if( d_k > -2.98608 )
								if( rsi1 <= 54.3682 )
									ret := 0.067385
								if( rsi1 > 54.3682 )
									ret := -0.400000
					if( rsi1 > 56.8396 )
						if( k <= 69.9725 )
							if( d <= 53.899 )
								if( d_k <= -25.1342 )
									ret := 0.052083
								if( d_k > -25.1342 )
									ret := 0.368696
							if( d > 53.899 )
								if( smoothD_d <= 56.14 )
									ret := 0.020906
								if( smoothD_d > 56.14 )
									ret := 0.352381
						if( k > 69.9725 )
							if( rsi1 <= 66.1346 )
								if( smoothD_d <= 45.1798 )
									ret := 0.228070
								if( smoothD_d > 45.1798 )
									ret := 0.579151
							if( rsi1 > 66.1346 )
								if( smoothK_k <= 69.3178 )
									ret := -1.000000 // sell
								if( smoothK_k > 69.3178 )
									ret := -0.250000
				if( d > 60.8708 )
					if( d_k <= 9.62691 )
						if( k <= 67.6222 )
							if( smoothD_d <= 63.998 )
								if( rsi1 <= 28.6094 )
									ret := -0.722222 // sell
								if( rsi1 > 28.6094 )
									ret := 0.027938
							if( smoothD_d > 63.998 )
								if( rsi1 <= 48.0905 )
									ret := -0.341317
								if( rsi1 > 48.0905 )
									ret := -0.053628
						if( k > 67.6222 )
							if( d <= 62.7436 )
								if( smoothK_k <= 68.0486 )
									ret := 0.028571
								if( smoothK_k > 68.0486 )
									ret := -0.226994
							if( d > 62.7436 )
								if( d_k <= -11.5367 )
									ret := 0.392157
								if( d_k > -11.5367 )
									ret := 0.044079
					if( d_k > 9.62691 )
						if( rsi1 <= 61.6839 )
							if( k <= 60.536 )
								if( smoothD_d <= 64.0187 )
									ret := 0.678571
								if( smoothD_d > 64.0187 )
									ret := -0.077496
							if( k > 60.536 )
								if( rsi1 <= 45.5993 )
									ret := -0.011650
								if( rsi1 > 45.5993 )
									ret := 0.189189
						if( rsi1 > 61.6839 )
							if( d <= 67.4269 )
								ret := 1.000000 // buy
							if( d > 67.4269 )
								if( smoothD_d <= 73.9946 )
									ret := 0.158192
								if( smoothD_d > 73.9946 )
									ret := 0.428094
			if( smoothK_k > 73.9733 )
				if( rsi1 <= 35.3331 )
					if( smoothK_k <= 85.3739 )
						if( d_k <= -21.3157 )
							if( d <= 55.2048 )
								ret := 0.250000
							if( d > 55.2048 )
								if( d <= 60.1289 )
									ret := -0.928571 // sell
								if( d > 60.1289 )
									ret := -0.500000
						if( d_k > -21.3157 )
							if( k <= 86.0466 )
								if( d <= 63.1559 )
									ret := 0.580645
								if( d > 63.1559 )
									ret := 0.008547
							if( k > 86.0466 )
								if( d <= 93.102 )
									ret := 0.250000
								if( d > 93.102 )
									ret := 0.916667 // buy
					if( smoothK_k > 85.3739 )
						if( smoothD_d <= 81.1208 )
							if( smoothK_k <= 86.8153 )
								if( smoothK_k <= 86.2467 )
									ret := -0.357143
								if( smoothK_k > 86.2467 )
									ret := -0.857143 // sell
							if( smoothK_k > 86.8153 )
								if( rsi1 <= 23.7923 )
									ret := -0.666667
								if( rsi1 > 23.7923 )
									ret := 0.305556
						if( smoothD_d > 81.1208 )
							if( d_k <= -8.39433 )
								if( k <= 98.5831 )
									ret := 0.666667
								if( k > 98.5831 )
									ret := -0.333333
							if( d_k > -8.39433 )
								if( d <= 96.8037 )
									ret := -0.543103
								if( d > 96.8037 )
									ret := 0.035714
				if( rsi1 > 35.3331 )
					if( smoothD_d <= 90.495 )
						if( rsi1 <= 55.1246 )
							if( k <= 90.1858 )
								if( d_k <= 2.31891 )
									ret := 0.111984
								if( d_k > 2.31891 )
									ret := 0.210008
							if( k > 90.1858 )
								if( smoothD_d <= 64.8839 )
									ret := 0.567164
								if( smoothD_d > 64.8839 )
									ret := 0.218510
						if( rsi1 > 55.1246 )
							if( d <= 55.5544 )
								if( rsi1 <= 64.7271 )
									ret := 0.034483
								if( rsi1 > 64.7271 )
									ret := -0.400000
							if( d > 55.5544 )
								if( smoothK_k <= 86.0549 )
									ret := 0.272833
								if( smoothK_k > 86.0549 )
									ret := 0.209065
					if( smoothD_d > 90.495 )
						if( smoothK_k <= 96.6552 )
							if( d_k <= 10.5153 )
								if( rsi1 <= 38.979 )
									ret := -0.126437
								if( rsi1 > 38.979 )
									ret := 0.344167
							if( d_k > 10.5153 )
								if( smoothK_k <= 79.8816 )
									ret := 0.125000
								if( smoothK_k > 79.8816 )
									ret := -0.625000
						if( smoothK_k > 96.6552 )
							if( k <= 99.8087 )
								if( d <= 99.2544 )
									ret := -0.214286
								if( d > 99.2544 )
									ret := 0.434783
							if( k > 99.8087 )
								if( rsi1 <= 47.8145 )
									ret := 0.476190
								if( rsi1 > 47.8145 )
									ret := 0.226250
		if( rsi1 > 66.8362 )
			if( rsi1 <= 75.665 )
				if( smoothK_k <= 71.5631 )
					if( d_k <= 12.0156 )
						if( smoothD_d <= 51.1356 )
							if( k <= 66.7214 )
								if( d_k <= -27.3343 )
									ret := 0.870968 // buy
								if( d_k > -27.3343 )
									ret := 0.458824
							if( k > 66.7214 )
								if( d <= 47.1241 )
									ret := -0.228070
								if( d > 47.1241 )
									ret := 0.557377
						if( smoothD_d > 51.1356 )
							if( smoothD_d <= 72.7502 )
								if( d <= 66.137 )
									ret := 0.200000
								if( d > 66.137 )
									ret := -0.050403
							if( smoothD_d > 72.7502 )
								if( d <= 79.7272 )
									ret := 0.519337
								if( d > 79.7272 )
									ret := 0.024194
					if( d_k > 12.0156 )
						if( d <= 79.3726 )
							if( rsi1 <= 69.4528 )
								if( d <= 71.8305 )
									ret := 1.000000 // buy
								if( d > 71.8305 )
									ret := 0.381818
							if( rsi1 > 69.4528 )
								if( smoothD_d <= 75.5753 )
									ret := 0.666667
								if( smoothD_d > 75.5753 )
									ret := 1.000000 // buy
						if( d > 79.3726 )
							if( smoothD_d <= 79.7152 )
								if( smoothK_k <= 64.4667 )
									ret := 0.322581
								if( smoothK_k > 64.4667 )
									ret := -0.400000
							if( smoothD_d > 79.7152 )
								if( d <= 85.9006 )
									ret := 0.630435
								if( d > 85.9006 )
									ret := 0.166667
				if( smoothK_k > 71.5631 )
					if( smoothD_d <= 90.3027 )
						if( d_k <= 7.16186 )
							if( d <= 66.4219 )
								if( d_k <= -31.3153 )
									ret := -0.368421
								if( d_k > -31.3153 )
									ret := 0.561462
							if( d > 66.4219 )
								if( k <= 80.8857 )
									ret := 0.196667
								if( k > 80.8857 )
									ret := 0.350074
						if( d_k > 7.16186 )
							if( rsi1 <= 69.2205 )
								if( d <= 83.4894 )
									ret := 0.875000 // buy
								if( d > 83.4894 )
									ret := 0.317073
							if( rsi1 > 69.2205 )
								if( rsi1 <= 72.9654 )
									ret := 0.703448 // buy
								if( rsi1 > 72.9654 )
									ret := 0.421875
					if( smoothD_d > 90.3027 )
						if( smoothK_k <= 86.1185 )
							if( k <= 84.9873 )
								if( k <= 84.1085 )
									ret := 0.250000
								if( k > 84.1085 )
									ret := -0.250000
							if( k > 84.9873 )
								if( k <= 86.8493 )
									ret := 0.634146
								if( k > 86.8493 )
									ret := 0.860140 // buy
						if( smoothK_k > 86.1185 )
							if( d_k <= 4.45643 )
								if( k <= 92.0998 )
									ret := 0.124183
								if( k > 92.0998 )
									ret := 0.383097
							if( d_k > 4.45643 )
								if( k <= 89.6742 )
									ret := 0.333333
								if( k > 89.6742 )
									ret := 0.723077 // buy
			if( rsi1 > 75.665 )
				if( smoothD_d <= 91.7388 )
					if( d <= 94.2898 )
						if( d_k <= -9.15581 )
							if( d <= 74.865 )
								if( d <= 72.9254 )
									ret := 0.629371
								if( d > 72.9254 )
									ret := -0.470588
							if( d > 74.865 )
								if( k <= 99.9907 )
									ret := 0.734584 // buy
								if( k > 99.9907 )
									ret := 0.482759
						if( d_k > -9.15581 )
							if( d_k <= -0.943007 )
								if( smoothD_d <= 90.9305 )
									ret := 0.282004
								if( smoothD_d > 90.9305 )
									ret := 0.740741 // buy
							if( d_k > -0.943007 )
								if( smoothK_k <= 53.2558 )
									ret := -0.666667
								if( smoothK_k > 53.2558 )
									ret := 0.480493
					if( d > 94.2898 )
						if( k <= 91.1019 )
							if( d_k <= 4.40325 )
								ret := 1.000000 // buy
							if( d_k > 4.40325 )
								if( smoothD_d <= 91.4392 )
									ret := 0.571429
								if( smoothD_d > 91.4392 )
									ret := 0.000000
						if( k > 91.1019 )
							if( rsi1 <= 80.5149 )
								if( rsi1 <= 78.6375 )
									ret := 0.086957
								if( rsi1 > 78.6375 )
									ret := -0.571429
							if( rsi1 > 80.5149 )
								if( d_k <= 1.89258 )
									ret := 0.430769
								if( d_k > 1.89258 )
									ret := -0.714286 // sell
				if( smoothD_d > 91.7388 )
					if( d_k <= 7.42567 )
						if( d <= 99.2227 )
							if( rsi1 <= 87.2131 )
								if( smoothK_k <= 93.3596 )
									ret := 0.680973
								if( smoothK_k > 93.3596 )
									ret := 0.512869
							if( rsi1 > 87.2131 )
								if( k <= 94.4618 )
									ret := 0.294118
								if( k > 94.4618 )
									ret := 0.826430 // buy
						if( d > 99.2227 )
							if( d <= 99.8295 )
								if( k <= 98.2097 )
									ret := 0.785714 // buy
								if( k > 98.2097 )
									ret := 0.291793
							if( d > 99.8295 )
								if( k <= 99.9996 )
									ret := 0.813397 // buy
								if( k > 99.9996 )
									ret := 0.517544
					if( d_k > 7.42567 )
						ret := -0.571429
	
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
float op_operation = decision_tree_0_ETHUSDT_15Min_2737677a(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


