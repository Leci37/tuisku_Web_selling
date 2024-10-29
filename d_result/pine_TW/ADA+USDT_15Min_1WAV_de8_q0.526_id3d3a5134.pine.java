//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: ADAUSDT_15Min_1WAV_3d3a5134 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1WAV_3d3a5134", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_3d3a5134(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_tci <= 25.7958 )
		if( tci <= 73.6021 )
			if( esa <= 0.582843 )
				if( d <= 0.005312 )
					if( esa <= 0.390417 )
						if( ci <= 91.5985 )
							if( ci <= 72.0748 )
								if( tci <= 56.4028 )
									ret := 0.047680
								if( tci > 56.4028 )
									ret := -0.080710
							if( ci > 72.0748 )
								if( d_tci <= -53.3015 )
									ret := 0.116864
								if( d_tci > -53.3015 )
									ret := -0.065534
						if( ci > 91.5985 )
							if( ci_wt2 <= 65.0925 )
								if( tci <= 63.8761 )
									ret := 0.297806
								if( tci > 63.8761 )
									ret := 0.058824
							if( ci_wt2 > 65.0925 )
								if( ci_wt2 <= 74.4371 )
									ret := -0.120823
								if( ci_wt2 > 74.4371 )
									ret := 0.093210
					if( esa > 0.390417 )
						if( ci_wt2 <= -2.2677 )
							if( esa <= 0.410396 )
								if( wt2 <= -23.7747 )
									ret := 0.714286 // buy
								if( wt2 > -23.7747 )
									ret := -0.051526
							if( esa > 0.410396 )
								if( wt2 <= 69.574 )
									ret := 0.055988
								if( wt2 > 69.574 )
									ret := 0.465839
						if( ci_wt2 > -2.2677 )
							if( ci_wt2 <= 0.283194 )
								if( tci <= -20.6082 )
									ret := 0.636364
								if( tci > -20.6082 )
									ret := -0.309278
							if( ci_wt2 > 0.283194 )
								if( d <= 0.002394 )
									ret := 0.017772
								if( d > 0.002394 )
									ret := -0.073998
				if( d > 0.005312 )
					if( ci_wt2 <= 26.4039 )
						if( esa <= 0.504104 )
							if( wt2 <= 2.70837 )
								if( esa <= 0.45132 )
									ret := 0.777778 // buy
								if( esa > 0.45132 )
									ret := -0.214286
							if( wt2 > 2.70837 )
								if( ci <= -74.4491 )
									ret := -0.777778 // sell
								if( ci > -74.4491 )
									ret := 0.139601
						if( esa > 0.504104 )
							if( d_tci <= -71.1002 )
								if( tci <= 71.3517 )
									ret := -1.000000 // sell
								if( tci > 71.3517 )
									ret := 0.266667
							if( d_tci > -71.1002 )
								if( wt2 <= 67.9155 )
									ret := 0.389571
								if( wt2 > 67.9155 )
									ret := 0.735849 // buy
					if( ci_wt2 > 26.4039 )
						if( ci <= 63.3824 )
							if( wt2 <= -11.2095 )
								if( ci <= 29.1769 )
									ret := -1.000000 // sell
								if( ci > 29.1769 )
									ret := -0.653846
							if( wt2 > -11.2095 )
								if( tci <= 27.5769 )
									ret := 0.333333
								if( tci > 27.5769 )
									ret := -0.933333 // sell
						if( ci > 63.3824 )
							if( ci_wt2 <= 119.859 )
								if( wt2 <= 0.883161 )
									ret := -0.666667
								if( wt2 > 0.883161 )
									ret := -0.019157
							if( ci_wt2 > 119.859 )
								if( ci <= 188.388 )
									ret := 0.484375
								if( ci > 188.388 )
									ret := -1.000000 // sell
			if( esa > 0.582843 )
				if( ci_wt2 <= -9.17581 )
					if( tci <= 65.8715 )
						if( wt2 <= -11.4076 )
							if( d <= 0.001172 )
								if( ap <= 0.648417 )
									ret := -0.157895
								if( ap > 0.648417 )
									ret := -0.750000 // sell
							if( d > 0.001172 )
								if( ci <= -36.7173 )
									ret := 0.404669
								if( ci > -36.7173 )
									ret := -0.135135
						if( wt2 > -11.4076 )
							if( tci <= -15.6811 )
								if( wt2 <= 2.00778 )
									ret := -0.291304
								if( wt2 > 2.00778 )
									ret := 1.000000 // buy
							if( tci > -15.6811 )
								if( ci_wt2 <= -203.065 )
									ret := 0.700000 // buy
								if( ci_wt2 > -203.065 )
									ret := 0.010542
					if( tci > 65.8715 )
						if( esa <= 0.61737 )
							if( wt2 <= 72.3422 )
								if( tci <= 69.5649 )
									ret := 0.300000
								if( tci > 69.5649 )
									ret := 1.000000 // buy
							if( wt2 > 72.3422 )
								if( ci <= 51.0469 )
									ret := -0.400000
								if( ci > 51.0469 )
									ret := 0.500000
						if( esa > 0.61737 )
							if( d <= 0.004322 )
								ret := 0.333333
							if( d > 0.004322 )
								if( wt2 <= 69.1139 )
									ret := 0.250000
								if( wt2 > 69.1139 )
									ret := 0.850000 // buy
				if( ci_wt2 > -9.17581 )
					if( ci_wt2 <= 162.516 )
						if( esa <= 0.620489 )
							if( ci <= 46.4445 )
								if( d <= 0.004806 )
									ret := -0.121723
								if( d > 0.004806 )
									ret := -0.826087 // sell
							if( ci > 46.4445 )
								if( tci <= 31.2938 )
									ret := 0.072670
								if( tci > 31.2938 )
									ret := -0.051064
						if( esa > 0.620489 )
							if( wt2 <= -21.634 )
								if( wt2 <= -28.1603 )
									ret := -0.148760
								if( wt2 > -28.1603 )
									ret := -0.506579
							if( wt2 > -21.634 )
								if( tci <= -16.4909 )
									ret := 0.479167
								if( tci > -16.4909 )
									ret := -0.127985
					if( ci_wt2 > 162.516 )
						if( ci <= 147.153 )
							if( ap <= 0.622835 )
								ret := 0.500000
							if( ap > 0.622835 )
								ret := 1.000000 // buy
						if( ci > 147.153 )
							if( esa <= 0.642621 )
								if( ci_wt2 <= 182.161 )
									ret := -0.272727
								if( ci_wt2 > 182.161 )
									ret := 0.666667
							if( esa > 0.642621 )
								if( esa <= 0.751511 )
									ret := 0.900000 // buy
								if( esa > 0.751511 )
									ret := 0.000000
		if( tci > 73.6021 )
			if( ci <= 56.4306 )
				if( esa <= 0.566451 )
					if( d <= 0.003131 )
						if( ci <= 26.27 )
							ret := -0.800000 // sell
						if( ci > 26.27 )
							if( d <= 0.002418 )
								if( esa <= 0.328132 )
									ret := 0.000000
								if( esa > 0.328132 )
									ret := -0.250000
							if( d > 0.002418 )
								ret := 0.333333
					if( d > 0.003131 )
						if( tci <= 84.271 )
							if( ap <= 0.394033 )
								if( esa <= 0.297338 )
									ret := 0.166667
								if( esa > 0.297338 )
									ret := 0.914894 // buy
							if( ap > 0.394033 )
								if( ci <= 41.701 )
									ret := 0.821429 // buy
								if( ci > 41.701 )
									ret := 0.250000
						if( tci > 84.271 )
							if( ci_wt2 <= -39.8976 )
								ret := -0.800000 // sell
							if( ci_wt2 > -39.8976 )
								ret := 1.000000 // buy
				if( esa > 0.566451 )
					if( tci <= 105.29 )
						if( ci_wt2 <= -30.6482 )
							if( ap <= 0.591075 )
								ret := 0.800000 // buy
							if( ap > 0.591075 )
								ret := 1.000000 // buy
						if( ci_wt2 > -30.6482 )
							ret := 0.750000 // buy
					if( tci > 105.29 )
						ret := 0.571429
			if( ci > 56.4306 )
				if( ci_wt2 <= -11.5581 )
					if( tci <= 74.7101 )
						if( ci <= 59.5398 )
							ret := -0.166667
						if( ci > 59.5398 )
							if( ap <= 0.531403 )
								ret := 0.250000
							if( ap > 0.531403 )
								ret := 1.000000 // buy
					if( tci > 74.7101 )
						if( wt2 <= 78.675 )
							if( d <= 0.004999 )
								if( ci_wt2 <= -14.3245 )
									ret := 0.285714
								if( ci_wt2 > -14.3245 )
									ret := -0.750000 // sell
							if( d > 0.004999 )
								if( ci <= 64.744 )
									ret := -0.923077 // sell
								if( ci > 64.744 )
									ret := -0.428571
						if( wt2 > 78.675 )
							if( ap <= 0.597371 )
								if( ci <= 67.0984 )
									ret := -0.169231
								if( ci > 67.0984 )
									ret := -0.800000 // sell
							if( ap > 0.597371 )
								if( ap <= 0.648361 )
									ret := 1.000000 // buy
								if( ap > 0.648361 )
									ret := 0.125000
				if( ci_wt2 > -11.5581 )
					if( ap <= 0.502003 )
						if( ci <= 84.7406 )
							if( d_tci <= -81.1865 )
								if( esa <= 0.32968 )
									ret := 0.966667 // buy
								if( esa > 0.32968 )
									ret := 0.625000
							if( d_tci > -81.1865 )
								if( ci <= 81.5275 )
									ret := -0.139785
								if( ci > 81.5275 )
									ret := 0.666667
						if( ci > 84.7406 )
							if( wt2 <= 77.5149 )
								if( tci <= 82.3612 )
									ret := 0.011765
								if( tci > 82.3612 )
									ret := 0.900000 // buy
							if( wt2 > 77.5149 )
								if( esa <= 0.378236 )
									ret := -0.750000 // sell
								if( esa > 0.378236 )
									ret := -0.032258
					if( ap > 0.502003 )
						if( d <= 0.011803 )
							if( ci <= 67.0104 )
								ret := 1.000000 // buy
							if( ci > 67.0104 )
								if( d_tci <= -75.9762 )
									ret := 0.620690
								if( d_tci > -75.9762 )
									ret := 0.197368
						if( d > 0.011803 )
							if( ap <= 0.76885 )
								if( d <= 0.018228 )
									ret := -0.533333
								if( d > 0.018228 )
									ret := 0.500000
							if( ap > 0.76885 )
								ret := 0.750000 // buy
	if( d_tci > 25.7958 )
		if( ci <= -38.8849 )
			if( d <= 0.001148 )
				if( esa <= 0.467298 )
					if( ci_wt2 <= -74.3061 )
						if( ci_wt2 <= -78.2389 )
							if( tci <= -49.4675 )
								if( ci <= -131.442 )
									ret := 0.299363
								if( ci > -131.442 )
									ret := -0.189189
							if( tci > -49.4675 )
								if( wt2 <= -40.21 )
									ret := -0.400000
								if( wt2 > -40.21 )
									ret := 0.069892
						if( ci_wt2 > -78.2389 )
							if( tci <= -44.6711 )
								if( d_tci <= 47.1077 )
									ret := -0.571429
								if( d_tci > 47.1077 )
									ret := -0.034483
							if( tci > -44.6711 )
								if( wt2 <= -29.731 )
									ret := 0.666667
								if( wt2 > -29.731 )
									ret := 0.197674
					if( ci_wt2 > -74.3061 )
						if( ci_wt2 <= -42.3459 )
							if( esa <= 0.46421 )
								if( ci <= -65.7944 )
									ret := -0.066194
								if( ci > -65.7944 )
									ret := 0.470588
							if( esa > 0.46421 )
								if( wt2 <= -28.8962 )
									ret := 1.000000 // buy
								if( wt2 > -28.8962 )
									ret := 0.750000 // buy
						if( ci_wt2 > -42.3459 )
							if( d_tci <= 31.3388 )
								if( ci <= -55.8234 )
									ret := 0.389831
								if( ci > -55.8234 )
									ret := 0.080000
							if( d_tci > 31.3388 )
								if( ci_wt2 <= -42.1634 )
									ret := 0.571429
								if( ci_wt2 > -42.1634 )
									ret := 0.031670
				if( esa > 0.467298 )
					if( tci <= -36.6319 )
						if( d_tci <= 39.1874 )
							if( ci_wt2 <= -55.5077 )
								if( ci_wt2 <= -74.4486 )
									ret := 0.000000
								if( ci_wt2 > -74.4486 )
									ret := -0.500000
							if( ci_wt2 > -55.5077 )
								if( ap <= 0.533983 )
									ret := 0.615385
								if( ap > 0.533983 )
									ret := 0.000000
						if( d_tci > 39.1874 )
							if( tci <= -39.7416 )
								if( wt2 <= -55.6483 )
									ret := 0.750000 // buy
								if( wt2 > -55.6483 )
									ret := -0.022727
							if( tci > -39.7416 )
								if( tci <= -39.5176 )
									ret := -0.833333 // sell
								if( tci > -39.5176 )
									ret := 0.000000
					if( tci > -36.6319 )
						if( ci_wt2 <= -128.338 )
							if( d_tci <= 31.005 )
								ret := -0.500000
							if( d_tci > 31.005 )
								ret := -1.000000 // sell
						if( ci_wt2 > -128.338 )
							if( tci <= -26.3446 )
								if( esa <= 0.476188 )
									ret := -0.523810
								if( esa > 0.476188 )
									ret := -0.221154
							if( tci > -26.3446 )
								if( ci_wt2 <= -79.2295 )
									ret := 0.600000
								if( ci_wt2 > -79.2295 )
									ret := 0.000000
			if( d > 0.001148 )
				if( esa <= 0.454481 )
					if( wt2 <= -78.846 )
						if( tci <= -84.8132 )
							if( ap <= 0.384582 )
								if( d <= 0.00866 )
									ret := 0.454545
								if( d > 0.00866 )
									ret := 0.900000 // buy
							if( ap > 0.384582 )
								if( d <= 0.004565 )
									ret := -1.000000 // sell
								if( d > 0.004565 )
									ret := 0.000000
						if( tci > -84.8132 )
							if( ci_wt2 <= 16.3556 )
								if( d <= 0.002779 )
									ret := 0.600000
								if( d > 0.002779 )
									ret := -0.722222 // sell
							if( ci_wt2 > 16.3556 )
								if( ci_wt2 <= 24.437 )
									ret := 0.764706 // buy
								if( ci_wt2 > 24.437 )
									ret := -0.392157
					if( wt2 > -78.846 )
						if( d <= 0.004597 )
							if( tci <= -56.9731 )
								if( tci <= -61.3278 )
									ret := 0.194224
								if( tci > -61.3278 )
									ret := 0.027097
							if( tci > -56.9731 )
								if( tci <= -46.8189 )
									ret := 0.297482
								if( tci > -46.8189 )
									ret := 0.180823
						if( d > 0.004597 )
							if( tci <= -42.5964 )
								if( d_tci <= 72.1973 )
									ret := 0.619469
								if( d_tci > 72.1973 )
									ret := 0.316667
							if( tci > -42.5964 )
								if( tci <= -28.8768 )
									ret := -0.250000
								if( tci > -28.8768 )
									ret := 0.818182 // buy
				if( esa > 0.454481 )
					if( ap <= 0.773683 )
						if( wt2 <= -63.8557 )
							if( esa <= 0.561276 )
								if( d_tci <= 62.6383 )
									ret := -0.916667 // sell
								if( d_tci > 62.6383 )
									ret := 0.161538
							if( esa > 0.561276 )
								if( d <= 0.003373 )
									ret := -0.222222
								if( d > 0.003373 )
									ret := 0.626126
						if( wt2 > -63.8557 )
							if( wt2 <= -13.6063 )
								if( tci <= -33.2281 )
									ret := 0.071987
								if( tci > -33.2281 )
									ret := 0.231618
							if( wt2 > -13.6063 )
								if( tci <= -32.305 )
									ret := 0.666667
								if( tci > -32.305 )
									ret := -0.405063
					if( ap > 0.773683 )
						if( ci <= -63.9699 )
							if( ci_wt2 <= -1.83614 )
								if( esa <= 0.843895 )
									ret := -0.371134
								if( esa > 0.843895 )
									ret := -0.894737 // sell
							if( ci_wt2 > -1.83614 )
								ret := 0.500000
						if( ci > -63.9699 )
							if( d <= 0.003003 )
								if( d <= 0.002589 )
									ret := -0.333333
								if( d > 0.002589 )
									ret := -1.000000 // sell
							if( d > 0.003003 )
								if( tci <= -68.1355 )
									ret := 0.000000
								if( tci > -68.1355 )
									ret := 0.666667
		if( ci > -38.8849 )
			if( ci_wt2 <= 22.1835 )
				if( tci <= -27.3169 )
					if( d <= 0.001217 )
						if( wt2 <= -24.9268 )
							if( ci_wt2 <= 13.8918 )
								if( wt2 <= -41.1872 )
									ret := -0.173611
								if( wt2 > -41.1872 )
									ret := 0.012931
							if( ci_wt2 > 13.8918 )
								if( wt2 <= -39.5281 )
									ret := -0.057143
								if( wt2 > -39.5281 )
									ret := -0.381818
						if( wt2 > -24.9268 )
							if( d_tci <= 28.3505 )
								if( wt2 <= -22.0283 )
									ret := -0.833333 // sell
								if( wt2 > -22.0283 )
									ret := 0.000000
							if( d_tci > 28.3505 )
								if( ci <= -29.4727 )
									ret := -0.250000
								if( ci > -29.4727 )
									ret := 0.000000
					if( d > 0.001217 )
						if( ci <= -27.1447 )
							if( wt2 <= -52.8367 )
								if( d_tci <= 54.0583 )
									ret := -0.571429
								if( d_tci > 54.0583 )
									ret := 0.050000
							if( wt2 > -52.8367 )
								if( ci_wt2 <= 9.32407 )
									ret := -0.012048
								if( ci_wt2 > 9.32407 )
									ret := 0.331230
						if( ci > -27.1447 )
							if( ci <= -21.0039 )
								if( d <= 0.002414 )
									ret := -0.054795
								if( d > 0.002414 )
									ret := -0.566372
							if( ci > -21.0039 )
								if( d_tci <= 32.8059 )
									ret := 0.265487
								if( d_tci > 32.8059 )
									ret := -0.197368
				if( tci > -27.3169 )
					if( d <= 0.002407 )
						if( esa <= 0.459761 )
							if( d <= 0.000785 )
								if( wt2 <= -26.7555 )
									ret := 0.320000
								if( wt2 > -26.7555 )
									ret := -0.240000
							if( d > 0.000785 )
								if( tci <= -26.5673 )
									ret := 0.761905 // buy
								if( tci > -26.5673 )
									ret := 0.324324
						if( esa > 0.459761 )
							if( d <= 0.001131 )
								if( esa <= 0.466022 )
									ret := -0.250000
								if( esa > 0.466022 )
									ret := -0.833333 // sell
							if( d > 0.001131 )
								if( d <= 0.00177 )
									ret := 0.400000
								if( d > 0.00177 )
									ret := -0.344828
					if( d > 0.002407 )
						if( ci <= -27.5426 )
							ret := -0.250000
						if( ci > -27.5426 )
							if( ci_wt2 <= 4.34241 )
								if( ci <= -25.9754 )
									ret := 0.750000 // buy
								if( ci > -25.9754 )
									ret := 1.000000 // buy
							if( ci_wt2 > 4.34241 )
								if( ap <= 0.486067 )
									ret := 1.000000 // buy
								if( ap > 0.486067 )
									ret := 0.250000
			if( ci_wt2 > 22.1835 )
				if( d_tci <= 40.5491 )
					if( d <= 0.000964 )
						if( ap <= 0.38668 )
							if( ci <= 5.19969 )
								if( ci_wt2 <= 34.0979 )
									ret := 0.083969
								if( ci_wt2 > 34.0979 )
									ret := -0.294118
							if( ci > 5.19969 )
								if( d_tci <= 39.9057 )
									ret := 0.044776
								if( d_tci > 39.9057 )
									ret := 0.428571
						if( ap > 0.38668 )
							if( wt2 <= -31.3592 )
								if( wt2 <= -34.1996 )
									ret := -0.052632
								if( wt2 > -34.1996 )
									ret := -0.354430
							if( wt2 > -31.3592 )
								if( wt2 <= -29.6537 )
									ret := 0.647059
								if( wt2 > -29.6537 )
									ret := 0.000000
					if( d > 0.000964 )
						if( ci <= -7.00066 )
							if( ci <= -16.4446 )
								if( wt2 <= -41.7619 )
									ret := 0.125000
								if( wt2 > -41.7619 )
									ret := -1.000000 // sell
							if( ci > -16.4446 )
								if( ci <= -13.8973 )
									ret := 0.791667 // buy
								if( ci > -13.8973 )
									ret := 0.407643
						if( ci > -7.00066 )
							if( wt2 <= -34.5991 )
								if( ci_wt2 <= 123.209 )
									ret := 0.217699
								if( ci_wt2 > 123.209 )
									ret := -0.035573
							if( wt2 > -34.5991 )
								if( ap <= 0.443387 )
									ret := 0.297297
								if( ap > 0.443387 )
									ret := -0.192308
				if( d_tci > 40.5491 )
					if( d <= 0.001301 )
						if( ci <= -14.1341 )
							if( wt2 <= -59.5191 )
								if( ci <= -19.5206 )
									ret := -0.025862
								if( ci > -19.5206 )
									ret := -0.285714
							if( wt2 > -59.5191 )
								if( tci <= -42.7093 )
									ret := 0.215947
								if( tci > -42.7093 )
									ret := -0.266667
						if( ci > -14.1341 )
							if( esa <= 0.323171 )
								if( esa <= 0.285997 )
									ret := -0.096070
								if( esa > 0.285997 )
									ret := 0.170103
							if( esa > 0.323171 )
								if( ci_wt2 <= 35.2377 )
									ret := -0.612903
								if( ci_wt2 > 35.2377 )
									ret := -0.183099
					if( d > 0.001301 )
						if( wt2 <= -48.4935 )
							if( esa <= 0.447261 )
								if( d <= 0.010263 )
									ret := 0.142379
								if( d > 0.010263 )
									ret := 1.000000 // buy
							if( esa > 0.447261 )
								if( ci <= -11.5494 )
									ret := -0.130802
								if( ci > -11.5494 )
									ret := 0.061562
						if( wt2 > -48.4935 )
							if( d <= 0.002258 )
								if( wt2 <= -40.0384 )
									ret := 0.078947
								if( wt2 > -40.0384 )
									ret := 1.000000 // buy
							if( d > 0.002258 )
								if( ci_wt2 <= 33.1722 )
									ret := 0.753623 // buy
								if( ci_wt2 > 33.1722 )
									ret := 0.465517
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_ADAUSDT_15Min_3d3a5134(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


