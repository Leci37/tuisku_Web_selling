//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: SNAP_15Min_1SQU_e10b85da Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_15Min_1SQU_e10b85da", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_15Min_e10b85da(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( val <= 0.002181 )
		if( upperBB <= 41.3835 )
			if( rangema <= 0.03591 )
				if( lowerBB <= 6.28938 )
					if( lowerBB <= 5.08397 )
						if( dev <= 0.040709 )
							ret := -0.750000 // sell
						if( dev > 0.040709 )
							ret := -1.000000 // sell
					if( lowerBB > 5.08397 )
						if( priceRange <= 0.078521 )
							if( lowerBB <= 6.05964 )
								if( avgHighLow <= 6 )
									ret := 0.648402
								if( avgHighLow > 6 )
									ret := -0.833333 // sell
							if( lowerBB > 6.05964 )
								if( dev <= 0.042852 )
									ret := 0.740000 // buy
								if( dev > 0.042852 )
									ret := 0.945455 // buy
						if( priceRange > 0.078521 )
							if( dev <= 0.064146 )
								if( sqzOffInt <= 0.5 )
									ret := -0.125000
								if( sqzOffInt > 0.5 )
									ret := 0.727273 // buy
							if( dev > 0.064146 )
								if( dev <= 0.073839 )
									ret := -1.000000 // sell
								if( dev > 0.073839 )
									ret := -0.250000
				if( lowerBB > 6.28938 )
					if( lowerKC <= 10.4163 )
						if( lowerBB <= 6.45046 )
							if( lowerKC <= 6.43498 )
								if( dev <= 0.042404 )
									ret := 0.100000
								if( dev > 0.042404 )
									ret := -0.400000
							if( lowerKC > 6.43498 )
								if( basis <= 6.47715 )
									ret := -0.714286 // sell
								if( basis > 6.47715 )
									ret := -1.000000 // sell
						if( lowerBB > 6.45046 )
							if( ma <= 6.66312 )
								if( basis <= 6.62739 )
									ret := 0.400000
								if( basis > 6.62739 )
									ret := 0.947368 // buy
							if( ma > 6.66312 )
								if( lowerKC <= 6.66879 )
									ret := -0.666667
								if( lowerKC > 6.66879 )
									ret := 0.072782
					if( lowerKC > 10.4163 )
						if( avgHighLow <= 16.2786 )
							if( rangema <= 0.025592 )
								if( upperKC <= 10.7192 )
									ret := 0.333333
								if( upperKC > 10.7192 )
									ret := 0.000000
							if( rangema > 0.025592 )
								if( upperKC <= 11.7357 )
									ret := 0.182033
								if( upperKC > 11.7357 )
									ret := 0.329806
						if( avgHighLow > 16.2786 )
							if( ma <= 17.51 )
								if( dev <= 0.073021 )
									ret := -0.279793
								if( dev > 0.073021 )
									ret := 0.156863
							if( ma > 17.51 )
								if( ma <= 17.9628 )
									ret := 0.888889 // buy
								if( ma > 17.9628 )
									ret := 0.255814
			if( rangema > 0.03591 )
				if( ma <= 18.1856 )
					if( avgHighLow <= 17.6806 )
						if( dev <= 0.14424 )
							if( upperBB <= 5.88301 )
								if( lowerBB <= 5.60283 )
									ret := 0.204545
								if( lowerBB > 5.60283 )
									ret := -0.615385
							if( upperBB > 5.88301 )
								if( dev <= 0.106652 )
									ret := 0.058954
								if( dev > 0.106652 )
									ret := -0.022887
						if( dev > 0.14424 )
							if( ma <= 10.3918 )
								if( basis <= 10.1319 )
									ret := 0.130126
								if( basis > 10.1319 )
									ret := 0.452652
							if( ma > 10.3918 )
								if( lowerBB <= 10.2524 )
									ret := -0.381526
								if( lowerBB > 10.2524 )
									ret := 0.084404
					if( avgHighLow > 17.6806 )
						if( upperKC <= 17.9531 )
							if( rangema <= 0.20251 )
								if( dev <= 0.088773 )
									ret := -0.021739
								if( dev > 0.088773 )
									ret := -0.648148
							if( rangema > 0.20251 )
								if( ma <= 17.3026 )
									ret := 0.250000
								if( ma > 17.3026 )
									ret := 0.750000 // buy
						if( upperKC > 17.9531 )
							if( upperKC <= 18.1103 )
								if( rangema <= 0.088485 )
									ret := 0.338129
								if( rangema > 0.088485 )
									ret := -0.134146
							if( upperKC > 18.1103 )
								if( dev <= 0.140485 )
									ret := -0.392157
								if( dev > 0.140485 )
									ret := -0.067708
				if( ma > 18.1856 )
					if( lowerBB <= 18.5338 )
						if( ma <= 18.7063 )
							if( avgHighLow <= 18.4036 )
								if( lowerBB <= 18.1729 )
									ret := 0.258216
								if( lowerBB > 18.1729 )
									ret := -0.344262
							if( avgHighLow > 18.4036 )
								if( avgHighLow <= 18.5795 )
									ret := 0.670330
								if( avgHighLow > 18.5795 )
									ret := 0.142857
						if( ma > 18.7063 )
							if( basis <= 20.5304 )
								if( val <= -0.013099 )
									ret := 0.891304 // buy
								if( val > -0.013099 )
									ret := 0.444444
							if( basis > 20.5304 )
								ret := -0.166667
					if( lowerBB > 18.5338 )
						if( lowerKC <= 39.4657 )
							if( avgHighLow <= 39.5312 )
								if( upperKC <= 40.1813 )
									ret := 0.097013
								if( upperKC > 40.1813 )
									ret := 0.913043 // buy
							if( avgHighLow > 39.5312 )
								if( ma <= 39.5402 )
									ret := -0.742857 // sell
								if( ma > 39.5402 )
									ret := -0.140187
						if( lowerKC > 39.4657 )
							if( lowerBB <= 40.408 )
								if( basis <= 40.7004 )
									ret := 0.388571
								if( basis > 40.7004 )
									ret := 0.975610 // buy
							if( lowerBB > 40.408 )
								if( upperBB <= 41.1052 )
									ret := -0.941176 // sell
								if( upperBB > 41.1052 )
									ret := 0.283582
		if( upperBB > 41.3835 )
			if( upperBB <= 41.9776 )
				if( avgHighLow <= 40.7323 )
					if( lowerBB <= 39.9027 )
						if( avgHighLow <= 40.2272 )
							if( upperKC <= 40.9868 )
								if( lowerBB <= 38.9366 )
									ret := 0.250000
								if( lowerBB > 38.9366 )
									ret := 1.000000 // buy
							if( upperKC > 40.9868 )
								ret := -0.250000
						if( avgHighLow > 40.2272 )
							if( basis <= 40.6905 )
								if( upperBB <= 41.8125 )
									ret := -0.533333
								if( upperBB > 41.8125 )
									ret := -1.000000 // sell
							if( basis > 40.6905 )
								if( ma <= 40.7366 )
									ret := -0.250000
								if( ma > 40.7366 )
									ret := 0.000000
					if( lowerBB > 39.9027 )
						if( ma <= 40.8292 )
							ret := 1.000000 // buy
						if( ma > 40.8292 )
							if( upperKC <= 41.2387 )
								ret := 1.000000 // buy
							if( upperKC > 41.2387 )
								if( avgHighLow <= 40.615 )
									ret := 0.166667
								if( avgHighLow > 40.615 )
									ret := -0.800000 // sell
				if( avgHighLow > 40.7323 )
					if( priceRange <= 0.349342 )
						if( lowerKC <= 41.1394 )
							if( upperKC <= 41.3102 )
								if( dev <= 0.320003 )
									ret := -0.750000 // sell
								if( dev > 0.320003 )
									ret := -1.000000 // sell
							if( upperKC > 41.3102 )
								if( rangema <= 0.497423 )
									ret := 0.136364
								if( rangema > 0.497423 )
									ret := -0.888889 // sell
						if( lowerKC > 41.1394 )
							if( lowerBB <= 41.1781 )
								if( priceRange <= 0.10897 )
									ret := -0.166667
								if( priceRange > 0.10897 )
									ret := -0.857143 // sell
							if( lowerBB > 41.1781 )
								if( ma <= 41.6165 )
									ret := -1.000000 // sell
								if( ma > 41.6165 )
									ret := -0.750000 // sell
					if( priceRange > 0.349342 )
						if( lowerKC <= 40.9282 )
							if( val <= -0.093861 )
								if( dev <= 0.77313 )
									ret := 0.000000
								if( dev > 0.77313 )
									ret := -0.888889 // sell
							if( val > -0.093861 )
								if( val <= -0.004959 )
									ret := -0.976190 // sell
								if( val > -0.004959 )
									ret := -0.750000 // sell
						if( lowerKC > 40.9282 )
							ret := 0.250000
			if( upperBB > 41.9776 )
				if( dev <= 2.1642 )
					if( upperBB <= 79.7374 )
						if( upperBB <= 42.4691 )
							if( lowerBB <= 41.7291 )
								if( basis <= 41.8188 )
									ret := 0.513514
								if( basis > 41.8188 )
									ret := -0.224490
							if( lowerBB > 41.7291 )
								if( lowerKC <= 41.8775 )
									ret := 0.500000
								if( lowerKC > 41.8775 )
									ret := 1.000000 // buy
						if( upperBB > 42.4691 )
							if( ma <= 43.6615 )
								if( avgHighLow <= 43.3725 )
									ret := -0.087227
								if( avgHighLow > 43.3725 )
									ret := -0.726316 // sell
							if( ma > 43.6615 )
								if( upperBB <= 45.6885 )
									ret := 0.470356
								if( upperBB > 45.6885 )
									ret := 0.003336
					if( upperBB > 79.7374 )
						if( rangema <= 0.192753 )
							ret := -1.000000 // sell
						if( rangema > 0.192753 )
							if( ma <= 79.2899 )
								if( upperBB <= 79.8657 )
									ret := -0.750000 // sell
								if( upperBB > 79.8657 )
									ret := -1.000000 // sell
							if( ma > 79.2899 )
								if( lowerKC <= 79.7856 )
									ret := 0.153846
								if( lowerKC > 79.7856 )
									ret := -0.391304
				if( dev > 2.1642 )
					if( rangema <= 1.02054 )
						if( basis <= 74.4071 )
							if( basis <= 72.0341 )
								if( dev <= 2.44481 )
									ret := 0.600000
								if( dev > 2.44481 )
									ret := 0.133333
							if( basis > 72.0341 )
								if( avgHighLow <= 72.7004 )
									ret := 0.083333
								if( avgHighLow > 72.7004 )
									ret := -0.529412
						if( basis > 74.4071 )
							if( val <= -0.167952 )
								ret := 0.250000
							if( val > -0.167952 )
								if( priceRange <= 0.54305 )
									ret := 1.000000 // buy
								if( priceRange > 0.54305 )
									ret := 0.684211
					if( rangema > 1.02054 )
						if( lowerBB <= 59.7692 )
							if( rangema <= 2.00154 )
								if( priceRange <= 0.320035 )
									ret := 0.714286 // buy
								if( priceRange > 0.320035 )
									ret := 0.987013 // buy
							if( rangema > 2.00154 )
								ret := 0.500000
						if( lowerBB > 59.7692 )
							if( basis <= 72.4649 )
								if( ma <= 68.9544 )
									ret := 0.250000
								if( ma > 68.9544 )
									ret := 0.000000
							if( basis > 72.4649 )
								ret := 1.000000 // buy
	if( val > 0.002181 )
		if( upperKC <= 45.274 )
			if( upperKC <= 11.5964 )
				if( basis <= 11.3155 )
					if( dev <= 0.35552 )
						if( dev <= 0.189472 )
							if( dev <= 0.081593 )
								if( upperKC <= 11.2635 )
									ret := 0.015442
								if( upperKC > 11.2635 )
									ret := -0.375587
							if( dev > 0.081593 )
								if( avgHighLow <= 11.3188 )
									ret := 0.122638
								if( avgHighLow > 11.3188 )
									ret := -0.435897
						if( dev > 0.189472 )
							if( rangema <= 0.12327 )
								if( rangema <= 0.081968 )
									ret := -0.206963
								if( rangema > 0.081968 )
									ret := 0.075255
							if( rangema > 0.12327 )
								if( upperKC <= 8.07315 )
									ret := 0.350000
								if( upperKC > 8.07315 )
									ret := -0.290385
					if( dev > 0.35552 )
						if( upperKC <= 9.41538 )
							if( lowerKC <= 8.2385 )
								if( upperKC <= 8.84108 )
									ret := 0.511111
								if( upperKC > 8.84108 )
									ret := -0.800000 // sell
							if( lowerKC > 8.2385 )
								if( rangema <= 0.130587 )
									ret := 0.586207
								if( rangema > 0.130587 )
									ret := 0.897059 // buy
						if( upperKC > 9.41538 )
							if( avgHighLow <= 11.2148 )
								if( dev <= 0.564544 )
									ret := 0.229508
								if( dev > 0.564544 )
									ret := -0.287234
							if( avgHighLow > 11.2148 )
								if( lowerBB <= 10.8982 )
									ret := 0.852941 // buy
								if( lowerBB > 10.8982 )
									ret := -0.833333 // sell
				if( basis > 11.3155 )
					if( ma <= 11.4753 )
						if( lowerBB <= 11.022 )
							if( basis <= 11.334 )
								ret := 0.200000
							if( basis > 11.334 )
								if( lowerBB <= 10.9887 )
									ret := -1.000000 // sell
								if( lowerBB > 10.9887 )
									ret := -0.750000 // sell
						if( lowerBB > 11.022 )
							if( basis <= 11.4216 )
								if( dev <= 0.050526 )
									ret := -0.255319
								if( dev > 0.050526 )
									ret := 0.424561
							if( basis > 11.4216 )
								if( rangema <= 0.038398 )
									ret := 0.000000
								if( rangema > 0.038398 )
									ret := 0.633987
					if( ma > 11.4753 )
						if( upperBB <= 11.7449 )
							if( dev <= 0.132128 )
								if( upperKC <= 11.5945 )
									ret := -0.243243
								if( upperKC > 11.5945 )
									ret := 0.500000
							if( dev > 0.132128 )
								if( avgHighLow <= 11.4335 )
									ret := -1.000000 // sell
								if( avgHighLow > 11.4335 )
									ret := -0.625000
						if( upperBB > 11.7449 )
							ret := 1.000000 // buy
			if( upperKC > 11.5964 )
				if( val <= 0.086858 )
					if( lowerKC <= 11.33 )
						if( lowerBB <= 11.1339 )
							if( rangema <= 0.16098 )
								if( dev <= 0.388645 )
									ret := 0.250000
								if( dev > 0.388645 )
									ret := -0.857143 // sell
							if( rangema > 0.16098 )
								if( priceRange <= 0.268619 )
									ret := 0.217949
								if( priceRange > 0.268619 )
									ret := -0.916667 // sell
						if( lowerBB > 11.1339 )
							if( upperKC <= 12.1343 )
								if( dev <= 0.114896 )
									ret := 0.250000
								if( dev > 0.114896 )
									ret := -0.824074 // sell
							if( upperKC > 12.1343 )
								ret := 1.000000 // buy
					if( lowerKC > 11.33 )
						if( sqzOffInt <= 0.5 )
							if( lowerKC <= 11.4567 )
								if( lowerBB <= 11.3966 )
									ret := -0.666667
								if( lowerBB > 11.3966 )
									ret := 0.681818
							if( lowerKC > 11.4567 )
								if( lowerKC <= 12.3737 )
									ret := -0.108911
								if( lowerKC > 12.3737 )
									ret := 0.040245
						if( sqzOffInt > 0.5 )
							if( rangema <= 0.074998 )
								if( ma <= 15.9472 )
									ret := -0.054300
								if( ma > 15.9472 )
									ret := -0.189881
							if( rangema > 0.074998 )
								if( basis <= 39.7092 )
									ret := 0.017293
								if( basis > 39.7092 )
									ret := -0.201229
				if( val > 0.086858 )
					if( upperBB <= 36.4945 )
						if( priceRange <= 2.62 )
							if( priceRange <= 0.240283 )
								if( val <= 0.196809 )
									ret := -0.549550
								if( val > 0.196809 )
									ret := 0.066667
							if( priceRange > 0.240283 )
								if( sqzOnInt <= 0.5 )
									ret := -0.598361
								if( sqzOnInt > 0.5 )
									ret := -0.923077 // sell
						if( priceRange > 2.62 )
							ret := 1.000000 // buy
					if( upperBB > 36.4945 )
						if( upperBB <= 37.1526 )
							if( upperKC <= 36.3648 )
								if( lowerKC <= 34.8782 )
									ret := 0.555556
								if( lowerKC > 34.8782 )
									ret := -0.166667
							if( upperKC > 36.3648 )
								ret := 1.000000 // buy
						if( upperBB > 37.1526 )
							if( lowerKC <= 29.7237 )
								ret := 1.000000 // buy
							if( lowerKC > 29.7237 )
								if( upperKC <= 37.3976 )
									ret := -0.702703 // sell
								if( upperKC > 37.3976 )
									ret := -0.045161
		if( upperKC > 45.274 )
			if( upperKC <= 75.3676 )
				if( lowerKC <= 73.1411 )
					if( lowerKC <= 55.1367 )
						if( priceRange <= 0.623663 )
							if( dev <= 0.58158 )
								if( lowerKC <= 47.7003 )
									ret := -0.153061
								if( lowerKC > 47.7003 )
									ret := 0.123464
							if( dev > 0.58158 )
								if( rangema <= 0.492216 )
									ret := 0.332230
								if( rangema > 0.492216 )
									ret := 0.015291
						if( priceRange > 0.623663 )
							if( upperBB <= 52.0722 )
								if( upperKC <= 49.2546 )
									ret := 0.207547
								if( upperKC > 49.2546 )
									ret := 0.638298
							if( upperBB > 52.0722 )
								if( lowerBB <= 51.4035 )
									ret := -0.225806
								if( lowerBB > 51.4035 )
									ret := 0.363636
					if( lowerKC > 55.1367 )
						if( rangema <= 1.22256 )
							if( ma <= 57.7953 )
								if( upperKC <= 57.2261 )
									ret := 0.008850
								if( upperKC > 57.2261 )
									ret := -0.459016
							if( ma > 57.7953 )
								if( upperKC <= 74.6094 )
									ret := 0.037363
								if( upperKC > 74.6094 )
									ret := -0.666667
						if( rangema > 1.22256 )
							if( lowerBB <= 57.5961 )
								if( priceRange <= 2.07 )
									ret := 0.978261 // buy
								if( priceRange > 2.07 )
									ret := 0.400000
							if( lowerBB > 57.5961 )
								if( ma <= 65.4694 )
									ret := 0.625000
								if( ma > 65.4694 )
									ret := 0.250000
				if( lowerKC > 73.1411 )
					if( upperBB <= 75.0126 )
						if( val <= 0.033758 )
							if( lowerKC <= 73.2806 )
								ret := 1.000000 // buy
							if( lowerKC > 73.2806 )
								if( priceRange <= 0.061013 )
									ret := 0.083333
								if( priceRange > 0.061013 )
									ret := 0.702703 // buy
						if( val > 0.033758 )
							if( upperBB <= 74.0719 )
								if( lowerBB <= 73.2136 )
									ret := -1.000000 // sell
								if( lowerBB > 73.2136 )
									ret := 0.000000
							if( upperBB > 74.0719 )
								if( lowerKC <= 73.5824 )
									ret := 0.666667
								if( lowerKC > 73.5824 )
									ret := 0.164557
					if( upperBB > 75.0126 )
						if( dev <= 1.54147 )
							if( dev <= 0.234028 )
								ret := 0.857143 // buy
							if( dev > 0.234028 )
								if( ma <= 74.9745 )
									ret := 0.057143
								if( ma > 74.9745 )
									ret := -0.666667
						if( dev > 1.54147 )
							ret := 1.000000 // buy
			if( upperKC > 75.3676 )
				if( rangema <= 0.429702 )
					if( dev <= 0.305551 )
						if( priceRange <= 0.546071 )
							if( sqzOffInt <= 0.5 )
								if( dev <= 0.288427 )
									ret := 0.016949
								if( dev > 0.288427 )
									ret := -0.250000
							if( sqzOffInt > 0.5 )
								if( upperKC <= 76.2821 )
									ret := 0.555556
								if( upperKC > 76.2821 )
									ret := 0.000000
						if( priceRange > 0.546071 )
							ret := 0.750000 // buy
					if( dev > 0.305551 )
						if( val <= 0.027968 )
							if( priceRange <= 0.139762 )
								if( lowerBB <= 78.8873 )
									ret := -0.066667
								if( lowerBB > 78.8873 )
									ret := -1.000000 // sell
							if( priceRange > 0.139762 )
								if( avgHighLow <= 79.29 )
									ret := -0.738854 // sell
								if( avgHighLow > 79.29 )
									ret := 0.666667
						if( val > 0.027968 )
							if( rangema <= 0.331097 )
								if( lowerKC <= 75.0809 )
									ret := -0.437500
								if( lowerKC > 75.0809 )
									ret := 0.311475
							if( rangema > 0.331097 )
								if( basis <= 78.3203 )
									ret := -0.666667
								if( basis > 78.3203 )
									ret := 0.111111
				if( rangema > 0.429702 )
					if( avgHighLow <= 78.9975 )
						if( lowerBB <= 75.0925 )
							if( upperKC <= 75.9106 )
								if( val <= 0.041635 )
									ret := 0.058824
								if( val > 0.041635 )
									ret := -0.593750
							if( upperKC > 75.9106 )
								if( val <= 0.081467 )
									ret := 0.560976
								if( val > 0.081467 )
									ret := -0.160000
						if( lowerBB > 75.0925 )
							if( lowerBB <= 75.6385 )
								if( avgHighLow <= 75.68 )
									ret := 0.000000
								if( avgHighLow > 75.68 )
									ret := -0.844444 // sell
							if( lowerBB > 75.6385 )
								if( upperKC <= 77.3218 )
									ret := 1.000000 // buy
								if( upperKC > 77.3218 )
									ret := -0.183099
					if( avgHighLow > 78.9975 )
						if( avgHighLow <= 80.4785 )
							if( lowerBB <= 77.9395 )
								ret := 0.750000 // buy
							if( lowerBB > 77.9395 )
								ret := 1.000000 // buy
						if( avgHighLow > 80.4785 )
							if( priceRange <= 0.36 )
								ret := 0.000000
							if( priceRange > 0.36 )
								ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_SNAP_15Min_e10b85da(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


