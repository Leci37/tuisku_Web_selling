//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ADAUSDT_15Min_1S00_4766ff75 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1S00_4766ff75", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_4766ff75(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 48.6988 )
		if( k <= 23.27 )
			if( rsi1 <= 32.8356 )
				if( smoothD_d <= -1.53109 )
					if( rsi1 <= 19.9588 )
						if( smoothK_k <= -1.76131 )
							if( smoothD_d <= -2.10691 )
								if( smoothD_d <= -2.29442 )
									ret := -0.554878
								if( smoothD_d > -2.29442 )
									ret := -0.258065
							if( smoothD_d > -2.10691 )
								if( rsi1 <= 8.00302 )
									ret := 0.777778 // buy
								if( rsi1 > 8.00302 )
									ret := -0.856115 // sell
						if( smoothK_k > -1.76131 )
							if( d_k <= -1.62233 )
								if( smoothD_d <= -2.00528 )
									ret := -0.583333
								if( smoothD_d > -2.00528 )
									ret := -0.842105 // sell
							if( d_k > -1.62233 )
								if( k <= 1.89621 )
									ret := -0.065574
								if( k > 1.89621 )
									ret := -0.453125
					if( rsi1 > 19.9588 )
						if( rsi1 <= 26.6493 )
							if( d <= 1.20729 )
								if( smoothD_d <= -2.9132 )
									ret := -0.880866 // sell
								if( smoothD_d > -2.9132 )
									ret := -0.781955 // sell
							if( d > 1.20729 )
								if( k <= 1.3408 )
									ret := -0.103448
								if( k > 1.3408 )
									ret := -0.750000 // sell
						if( rsi1 > 26.6493 )
							if( rsi1 <= 31.4699 )
								if( rsi1 <= 30.9103 )
									ret := -0.512922
								if( rsi1 > 30.9103 )
									ret := 0.074074
							if( rsi1 > 31.4699 )
								if( k <= 0.561151 )
									ret := -0.720588 // sell
								if( k > 0.561151 )
									ret := -0.862500 // sell
				if( smoothD_d > -1.53109 )
					if( d_k <= -2.09942 )
						if( k <= 4.16979 )
							ret := 0.666667
						if( k > 4.16979 )
							if( d <= 9.81956 )
								if( smoothK_k <= 1.35483 )
									ret := -0.105263
								if( smoothK_k > 1.35483 )
									ret := -0.595083
							if( d > 9.81956 )
								if( k <= 22.62 )
									ret := -0.499474
								if( k > 22.62 )
									ret := -0.157895
					if( d_k > -2.09942 )
						if( rsi1 <= 24.6047 )
							if( k <= 15.0009 )
								if( d <= 25.6331 )
									ret := -0.421255
								if( d > 25.6331 )
									ret := -0.889571 // sell
							if( k > 15.0009 )
								if( d_k <= 21.9803 )
									ret := -0.115385
								if( d_k > 21.9803 )
									ret := -0.820000 // sell
						if( rsi1 > 24.6047 )
							if( smoothK_k <= -2.81413 )
								if( d_k <= 2.03427 )
									ret := -0.140625
								if( d_k > 2.03427 )
									ret := -0.586154
							if( smoothK_k > -2.81413 )
								if( smoothD_d <= 0.049827 )
									ret := -0.505618
								if( smoothD_d > 0.049827 )
									ret := -0.285258
			if( rsi1 > 32.8356 )
				if( d <= 6.31617 )
					if( smoothD_d <= -2.99032 )
						ret := -0.654028
					if( smoothD_d > -2.99032 )
						if( d <= 4.66955 )
							if( k <= 2.66807 )
								if( k <= 0.22255 )
									ret := -0.435364
								if( k > 0.22255 )
									ret := -0.166491
							if( k > 2.66807 )
								if( rsi1 <= 34.0882 )
									ret := -0.727273 // sell
								if( rsi1 > 34.0882 )
									ret := -0.354959
						if( d > 4.66955 )
							if( d <= 4.7985 )
								if( rsi1 <= 36.4507 )
									ret := -0.964286 // sell
								if( rsi1 > 36.4507 )
									ret := -0.651515
							if( d > 4.7985 )
								if( smoothK_k <= 2.07107 )
									ret := -0.532495
								if( smoothK_k > 2.07107 )
									ret := -0.388000
				if( d > 6.31617 )
					if( rsi1 <= 34.5563 )
						if( smoothK_k <= 0.008628 )
							if( smoothD_d <= 4.27126 )
								ret := 0.315789
							if( smoothD_d > 4.27126 )
								if( d_k <= 18.9152 )
									ret := -0.375000
								if( d_k > 18.9152 )
									ret := -0.782609 // sell
						if( smoothK_k > 0.008628 )
							if( d_k <= 17.7685 )
								if( smoothK_k <= 3.76677 )
									ret := 0.213793
								if( smoothK_k > 3.76677 )
									ret := -0.130864
							if( d_k > 17.7685 )
								if( smoothD_d <= 37.0774 )
									ret := -0.716049 // sell
								if( smoothD_d > 37.0774 )
									ret := 0.071429
					if( rsi1 > 34.5563 )
						if( smoothK_k <= 10.1427 )
							if( k <= 11.0476 )
								if( d_k <= -1.77781 )
									ret := -0.086580
								if( d_k > -1.77781 )
									ret := -0.327624
							if( k > 11.0476 )
								if( smoothD_d <= 23.612 )
									ret := -0.332244
								if( smoothD_d > 23.612 )
									ret := -0.590000
						if( smoothK_k > 10.1427 )
							if( smoothD_d <= 46.9764 )
								if( smoothK_k <= 12.2679 )
									ret := -0.159747
								if( smoothK_k > 12.2679 )
									ret := -0.289717
							if( smoothD_d > 46.9764 )
								if( smoothK_k <= 17.9976 )
									ret := 0.520000
								if( smoothK_k > 17.9976 )
									ret := -0.133333
		if( k > 23.27 )
			if( smoothK_k <= 72.5101 )
				if( rsi1 <= 31.9785 )
					if( d <= 19.7143 )
						if( rsi1 <= 29.838 )
							if( d <= 19.3888 )
								if( smoothD_d <= 15.0709 )
									ret := -0.586207
								if( smoothD_d > 15.0709 )
									ret := -0.288136
							if( d > 19.3888 )
								if( rsi1 <= 21.0235 )
									ret := -0.833333 // sell
								if( rsi1 > 21.0235 )
									ret := -1.000000 // sell
						if( rsi1 > 29.838 )
							if( d <= 14.978 )
								if( smoothK_k <= 22.1449 )
									ret := -0.947368 // sell
								if( smoothK_k > 22.1449 )
									ret := -0.384615
							if( d > 14.978 )
								if( smoothD_d <= 13.2759 )
									ret := 0.615385
								if( smoothD_d > 13.2759 )
									ret := -0.360000
					if( d > 19.7143 )
						if( d_k <= 6.9444 )
							if( smoothK_k <= 70.3893 )
								if( d_k <= -9.3518 )
									ret := -0.277311
								if( d_k > -9.3518 )
									ret := -0.082420
							if( smoothK_k > 70.3893 )
								if( d <= 66.5888 )
									ret := -0.545455
								if( d > 66.5888 )
									ret := -0.891892 // sell
						if( d_k > 6.9444 )
							if( smoothK_k <= 47.3719 )
								if( k <= 33.3943 )
									ret := -0.319797
								if( k > 33.3943 )
									ret := -0.626943
							if( smoothK_k > 47.3719 )
								if( d <= 66.405 )
									ret := 0.392857
								if( d > 66.405 )
									ret := -0.185185
				if( rsi1 > 31.9785 )
					if( smoothD_d <= 46.6201 )
						if( smoothD_d <= 17.7567 )
							if( k <= 23.8202 )
								if( d_k <= -4.04435 )
									ret := -0.086207
								if( d_k > -4.04435 )
									ret := 0.875000 // buy
							if( k > 23.8202 )
								if( smoothD_d <= 16.6543 )
									ret := -0.178542
								if( smoothD_d > 16.6543 )
									ret := -0.411111
						if( smoothD_d > 17.7567 )
							if( smoothK_k <= 38.3379 )
								if( k <= 29.7878 )
									ret := -0.140581
								if( k > 29.7878 )
									ret := -0.067049
							if( smoothK_k > 38.3379 )
								if( rsi1 <= 40.0102 )
									ret := -0.089298
								if( rsi1 > 40.0102 )
									ret := 0.090242
					if( smoothD_d > 46.6201 )
						if( smoothD_d <= 49.1441 )
							if( d_k <= -2.48306 )
								if( rsi1 <= 33.0277 )
									ret := 0.750000 // buy
								if( rsi1 > 33.0277 )
									ret := 0.007843
							if( d_k > -2.48306 )
								if( k <= 35.9197 )
									ret := -0.177143
								if( k > 35.9197 )
									ret := -0.548913
						if( smoothD_d > 49.1441 )
							if( k <= 37.2392 )
								if( rsi1 <= 42.428 )
									ret := -0.573427
								if( rsi1 > 42.428 )
									ret := -0.161290
							if( k > 37.2392 )
								if( smoothD_d <= 58.7543 )
									ret := -0.016796
								if( smoothD_d > 58.7543 )
									ret := -0.180902
			if( smoothK_k > 72.5101 )
				if( smoothK_k <= 86.5531 )
					if( rsi1 <= 31.4808 )
						if( rsi1 <= 30.4655 )
							if( smoothK_k <= 81.0131 )
								if( k <= 80.5593 )
									ret := -0.051724
								if( k > 80.5593 )
									ret := -0.621951
							if( smoothK_k > 81.0131 )
								if( k <= 87.4084 )
									ret := 0.200000
								if( k > 87.4084 )
									ret := -0.250000
						if( rsi1 > 30.4655 )
							if( d_k <= 1.25056 )
								if( smoothD_d <= 72.4637 )
									ret := -0.526316
								if( smoothD_d > 72.4637 )
									ret := -0.950000 // sell
							if( d_k > 1.25056 )
								if( smoothK_k <= 77.4914 )
									ret := -0.777778 // sell
								if( smoothK_k > 77.4914 )
									ret := 0.444444
					if( rsi1 > 31.4808 )
						if( d <= 68.076 )
							if( d <= 57.4092 )
								if( d <= 56.3698 )
									ret := 0.154930
								if( d > 56.3698 )
									ret := -0.312500
							if( d > 57.4092 )
								if( rsi1 <= 36.2999 )
									ret := -0.152941
								if( rsi1 > 36.2999 )
									ret := 0.323689
						if( d > 68.076 )
							if( d_k <= -0.258615 )
								if( smoothD_d <= 81.8395 )
									ret := 0.019281
								if( smoothD_d > 81.8395 )
									ret := -0.530864
							if( d_k > -0.258615 )
								if( smoothD_d <= 74.3177 )
									ret := 0.909091 // buy
								if( smoothD_d > 74.3177 )
									ret := 0.099778
				if( smoothK_k > 86.5531 )
					if( d <= 90.9393 )
						if( d <= 90.1267 )
							if( smoothD_d <= 67.5528 )
								if( k <= 91.0141 )
									ret := 0.243243
								if( k > 91.0141 )
									ret := -0.517241
							if( smoothD_d > 67.5528 )
								if( rsi1 <= 40.9203 )
									ret := 0.014245
								if( rsi1 > 40.9203 )
									ret := 0.292398
						if( d > 90.1267 )
							if( rsi1 <= 43.0366 )
								if( rsi1 <= 38.0293 )
									ret := -0.450000
								if( rsi1 > 38.0293 )
									ret := -0.857143 // sell
							if( rsi1 > 43.0366 )
								if( smoothK_k <= 92.1114 )
									ret := 0.000000
								if( smoothK_k > 92.1114 )
									ret := 0.100000
					if( d > 90.9393 )
						if( smoothD_d <= 96.801 )
							if( d <= 99.0045 )
								if( smoothD_d <= 95.5202 )
									ret := 0.340426
								if( smoothD_d > 95.5202 )
									ret := 0.774648 // buy
							if( d > 99.0045 )
								if( smoothK_k <= 96.9804 )
									ret := -0.611111
								if( smoothK_k > 96.9804 )
									ret := 0.347826
						if( smoothD_d > 96.801 )
							if( rsi1 <= 47.9488 )
								ret := 0.952381 // buy
							if( rsi1 > 47.9488 )
								ret := 0.818182 // buy
	if( rsi1 > 48.6988 )
		if( d <= 85.7809 )
			if( k <= 43.0433 )
				if( smoothK_k <= 17.5337 )
					if( rsi1 <= 66.7712 )
						if( smoothK_k <= -2.07756 )
							if( smoothD_d <= 3.66229 )
								if( d <= 0.03174 )
									ret := -0.568182
								if( d > 0.03174 )
									ret := 0.246499
							if( smoothD_d > 3.66229 )
								if( rsi1 <= 50.4739 )
									ret := 0.391304
								if( rsi1 > 50.4739 )
									ret := -0.325103
						if( smoothK_k > -2.07756 )
							if( rsi1 <= 51.9222 )
								if( d <= 6.98306 )
									ret := -0.433428
								if( d > 6.98306 )
									ret := -0.238897
							if( rsi1 > 51.9222 )
								if( d_k <= 11.08 )
									ret := -0.113872
								if( d_k > 11.08 )
									ret := -0.216856
					if( rsi1 > 66.7712 )
						if( smoothK_k <= 8.40475 )
							if( rsi1 <= 77.4197 )
								if( k <= 0.611252 )
									ret := -0.518519
								if( k > 0.611252 )
									ret := 0.316583
							if( rsi1 > 77.4197 )
								if( d <= 11.3402 )
									ret := -0.666667
								if( d > 11.3402 )
									ret := -0.100000
						if( smoothK_k > 8.40475 )
							if( d <= 18.8984 )
								if( smoothD_d <= 5.5367 )
									ret := 0.476190
								if( smoothD_d > 5.5367 )
									ret := 0.862385 // buy
							if( d > 18.8984 )
								if( rsi1 <= 69.4723 )
									ret := 0.083333
								if( rsi1 > 69.4723 )
									ret := 0.777778 // buy
				if( smoothK_k > 17.5337 )
					if( smoothD_d <= 38.1178 )
						if( smoothD_d <= 26.1386 )
							if( rsi1 <= 61.2311 )
								if( smoothD_d <= 7.19225 )
									ret := -0.735294 // sell
								if( smoothD_d > 7.19225 )
									ret := -0.050888
							if( rsi1 > 61.2311 )
								if( d_k <= 0.386847 )
									ret := 0.063114
								if( d_k > 0.386847 )
									ret := 0.774648 // buy
						if( smoothD_d > 26.1386 )
							if( smoothK_k <= 24.0853 )
								if( smoothK_k <= 22.6368 )
									ret := 0.169666
								if( smoothK_k > 22.6368 )
									ret := -0.320000
							if( smoothK_k > 24.0853 )
								if( k <= 30.1188 )
									ret := 0.386167
								if( k > 30.1188 )
									ret := 0.197909
					if( smoothD_d > 38.1178 )
						if( d_k <= 27.1403 )
							if( d <= 53.6094 )
								if( d <= 52.6008 )
									ret := -0.069976
								if( d > 52.6008 )
									ret := 0.303030
							if( d > 53.6094 )
								if( smoothK_k <= 27.7845 )
									ret := -0.825000 // sell
								if( smoothK_k > 27.7845 )
									ret := -0.144258
						if( d_k > 27.1403 )
							if( smoothK_k <= 20.7676 )
								if( d <= 51.866 )
									ret := -0.227273
								if( d > 51.866 )
									ret := 0.222222
							if( smoothK_k > 20.7676 )
								if( d <= 55.0851 )
									ret := 0.942857 // buy
								if( d > 55.0851 )
									ret := 0.382353
			if( k > 43.0433 )
				if( rsi1 <= 61.8299 )
					if( d <= 26.9644 )
						if( smoothK_k <= 41.9644 )
							if( k <= 44.4878 )
								if( k <= 43.7616 )
									ret := -0.411765
								if( k > 43.7616 )
									ret := -0.105263
							if( k > 44.4878 )
								ret := 0.454545
						if( smoothK_k > 41.9644 )
							if( smoothD_d <= 18.9324 )
								ret := 0.100000
							if( smoothD_d > 18.9324 )
								if( smoothD_d <= 23.4539 )
									ret := -0.596774
								if( smoothD_d > 23.4539 )
									ret := -0.923077 // sell
					if( d > 26.9644 )
						if( smoothD_d <= 37.0688 )
							if( rsi1 <= 51.3744 )
								if( smoothD_d <= 35.9733 )
									ret := 0.336000
								if( smoothD_d > 35.9733 )
									ret := 0.750000 // buy
							if( rsi1 > 51.3744 )
								if( k <= 57.6742 )
									ret := 0.249169
								if( k > 57.6742 )
									ret := -0.073034
						if( smoothD_d > 37.0688 )
							if( k <= 75.6141 )
								if( d_k <= -4.25253 )
									ret := 0.147916
								if( d_k > -4.25253 )
									ret := 0.016491
							if( k > 75.6141 )
								if( k <= 94.7155 )
									ret := 0.185319
								if( k > 94.7155 )
									ret := 0.453237
				if( rsi1 > 61.8299 )
					if( smoothD_d <= 39.1939 )
						if( smoothD_d <= 23.4972 )
							if( d_k <= -25.9479 )
								ret := -0.636364
							if( d_k > -25.9479 )
								if( rsi1 <= 77.3187 )
									ret := 0.054545
								if( rsi1 > 77.3187 )
									ret := 0.769231 // buy
						if( smoothD_d > 23.4972 )
							if( d_k <= -24.8526 )
								if( smoothD_d <= 31.3041 )
									ret := 0.840580 // buy
								if( smoothD_d > 31.3041 )
									ret := 0.584270
							if( d_k > -24.8526 )
								if( smoothD_d <= 33.5032 )
									ret := 0.391003
								if( smoothD_d > 33.5032 )
									ret := 0.611732
					if( smoothD_d > 39.1939 )
						if( k <= 68.5294 )
							if( rsi1 <= 75.5179 )
								if( d_k <= 13.9939 )
									ret := 0.061352
								if( d_k > 13.9939 )
									ret := 0.338983
							if( rsi1 > 75.5179 )
								if( smoothD_d <= 69.604 )
									ret := 0.357143
								if( smoothD_d > 69.604 )
									ret := 0.830000 // buy
						if( k > 68.5294 )
							if( k <= 95.2145 )
								if( d_k <= -11.9993 )
									ret := 0.479979
								if( d_k > -11.9993 )
									ret := 0.292140
							if( k > 95.2145 )
								if( d_k <= -23.0303 )
									ret := 0.839744 // buy
								if( d_k > -23.0303 )
									ret := 0.481481
		if( d > 85.7809 )
			if( k <= 94.2318 )
				if( d <= 91.7982 )
					if( rsi1 <= 54.4346 )
						if( k <= 81.9044 )
							if( d <= 91.0365 )
								if( rsi1 <= 51.7256 )
									ret := 0.519380
								if( rsi1 > 51.7256 )
									ret := 0.120301
							if( d > 91.0365 )
								ret := -0.454545
						if( k > 81.9044 )
							if( k <= 82.7527 )
								if( k <= 82.351 )
									ret := -0.266667
								if( k > 82.351 )
									ret := -1.000000 // sell
							if( k > 82.7527 )
								if( rsi1 <= 50.4535 )
									ret := -0.162791
								if( rsi1 > 50.4535 )
									ret := 0.212987
					if( rsi1 > 54.4346 )
						if( d_k <= 2.69745 )
							if( smoothK_k <= 84.1448 )
								if( d <= 88.275 )
									ret := 0.085308
								if( d > 88.275 )
									ret := -0.489796
							if( smoothK_k > 84.1448 )
								if( smoothK_k <= 85.2252 )
									ret := 0.464135
								if( smoothK_k > 85.2252 )
									ret := 0.211014
						if( d_k > 2.69745 )
							if( smoothK_k <= 83.1013 )
								if( k <= 85.8183 )
									ret := 0.416954
								if( k > 85.8183 )
									ret := 0.880000 // buy
							if( smoothK_k > 83.1013 )
								if( k <= 86.939 )
									ret := -0.084906
								if( k > 86.939 )
									ret := 0.438356
				if( d > 91.7982 )
					if( d_k <= 7.67165 )
						if( rsi1 <= 59.1343 )
							if( smoothK_k <= 90.2659 )
								if( d_k <= 5.24796 )
									ret := 0.007421
								if( d_k > 5.24796 )
									ret := 0.293930
							if( smoothK_k > 90.2659 )
								if( d <= 96.1323 )
									ret := 0.674242
								if( d > 96.1323 )
									ret := 0.355556
						if( rsi1 > 59.1343 )
							if( d <= 94.6113 )
								if( smoothD_d <= 89.4824 )
									ret := 0.521064
								if( smoothD_d > 89.4824 )
									ret := 0.359428
							if( d > 94.6113 )
								if( k <= 94.1789 )
									ret := 0.571335
								if( k > 94.1789 )
									ret := -0.333333
					if( d_k > 7.67165 )
						if( k <= 82.4547 )
							if( k <= 82.0659 )
								if( smoothK_k <= 77.623 )
									ret := 0.153846
								if( smoothK_k > 77.623 )
									ret := 0.520000
							if( k > 82.0659 )
								ret := 0.117647
						if( k > 82.4547 )
							if( d <= 92.8817 )
								if( d_k <= 7.75237 )
									ret := 1.000000 // buy
								if( d_k > 7.75237 )
									ret := 0.765517 // buy
							if( d > 92.8817 )
								if( d_k <= 9.51646 )
									ret := 0.698324
								if( d_k > 9.51646 )
									ret := 0.108108
			if( k > 94.2318 )
				if( smoothD_d <= 94.2434 )
					if( d_k <= -8.77523 )
						if( smoothK_k <= 92.6102 )
							ret := -0.263158
						if( smoothK_k > 92.6102 )
							if( d <= 88.5476 )
								if( d_k <= -12.3341 )
									ret := 0.116667
								if( d_k > -12.3341 )
									ret := 0.545455
							if( d > 88.5476 )
								if( rsi1 <= 87.7091 )
									ret := 0.730479 // buy
								if( rsi1 > 87.7091 )
									ret := 0.000000
					if( d_k > -8.77523 )
						if( rsi1 <= 83.7635 )
							if( k <= 96.8747 )
								if( smoothD_d <= 87.7777 )
									ret := 0.562152
								if( smoothD_d > 87.7777 )
									ret := 0.347707
							if( k > 96.8747 )
								if( rsi1 <= 60.7406 )
									ret := 0.106280
								if( rsi1 > 60.7406 )
									ret := 0.371209
						if( rsi1 > 83.7635 )
							if( smoothD_d <= 93.9609 )
								if( k <= 99.9623 )
									ret := 0.613445
								if( k > 99.9623 )
									ret := 0.885965 // buy
							if( smoothD_d > 93.9609 )
								if( d_k <= 0.427047 )
									ret := 0.358974
								if( d_k > 0.427047 )
									ret := -0.555556
				if( smoothD_d > 94.2434 )
					if( k <= 95.4318 )
						if( rsi1 <= 68.2031 )
							if( smoothD_d <= 94.8499 )
								if( d_k <= 2.96041 )
									ret := 0.553191
								if( d_k > 2.96041 )
									ret := 1.000000 // buy
							if( smoothD_d > 94.8499 )
								if( d_k <= 3.54847 )
									ret := 0.220000
								if( d_k > 3.54847 )
									ret := 0.862069 // buy
						if( rsi1 > 68.2031 )
							if( rsi1 <= 77.548 )
								if( d_k <= 3.33561 )
									ret := 0.846154 // buy
								if( d_k > 3.33561 )
									ret := 0.526316
							if( rsi1 > 77.548 )
								if( d <= 98.0678 )
									ret := 0.900000 // buy
								if( d > 98.0678 )
									ret := 1.000000 // buy
					if( k > 95.4318 )
						if( rsi1 <= 82.4477 )
							if( smoothD_d <= 96.9852 )
								if( smoothD_d <= 96.8688 )
									ret := 0.399190
								if( smoothD_d > 96.8688 )
									ret := 0.141176
							if( smoothD_d > 96.9852 )
								if( smoothD_d <= 96.9991 )
									ret := 0.916667 // buy
								if( smoothD_d > 96.9991 )
									ret := 0.505710
						if( rsi1 > 82.4477 )
							if( k <= 95.892 )
								ret := -0.333333
							if( k > 95.892 )
								if( k <= 97.9578 )
									ret := 0.940594 // buy
								if( k > 97.9578 )
									ret := 0.740058 // buy
	
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
float op_operation = decision_tree_0_ADAUSDT_15Min_4766ff75(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


