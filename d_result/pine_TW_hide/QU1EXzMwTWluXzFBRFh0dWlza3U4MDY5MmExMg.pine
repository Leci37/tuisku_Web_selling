//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: AMD_30Min_1ADX_80692a12 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1ADX_80692a12", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_80692a12(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 0.08422 )
		if( smoothedTrueRange <= 0.03031 )
			if( smoothedDirectionalMovementMinus <= 0.007149 )
				if( dx <= 51.6757 )
					if( diMinus <= 21.4738 )
						if( smoothedDirectionalMovementMinus <= 0.001817 )
							ret := -0.545455
						if( smoothedDirectionalMovementMinus > 0.001817 )
							if( diPlus <= 32.9901 )
								if( dx <= 12.0378 )
									ret := 0.481481
								if( dx > 12.0378 )
									ret := 0.233618
							if( diPlus > 32.9901 )
								if( smoothedDirectionalMovementPlus <= 0.009575 )
									ret := -0.424242
								if( smoothedDirectionalMovementPlus > 0.009575 )
									ret := 0.214286
					if( diMinus > 21.4738 )
						if( diMinus <= 24.5122 )
							if( diPlus <= 24.8224 )
								if( directionalMovementMinus <= 0.004716 )
									ret := 0.044444
								if( directionalMovementMinus > 0.004716 )
									ret := -0.333333
							if( diPlus > 24.8224 )
								if( adx <= 18.7639 )
									ret := -0.869565 // sell
								if( adx > 18.7639 )
									ret := -0.212766
						if( diMinus > 24.5122 )
							if( adx <= 48.7038 )
								if( smoothedDirectionalMovementPlus <= 0.005455 )
									ret := 0.380952
								if( smoothedDirectionalMovementPlus > 0.005455 )
									ret := -0.137255
							if( adx > 48.7038 )
								ret := 0.818182 // buy
				if( dx > 51.6757 )
					if( smoothedDirectionalMovementMinus <= 0.001656 )
						if( diPlus <= 22.4627 )
							ret := -0.944444 // sell
						if( diPlus > 22.4627 )
							if( diMinus <= 5.36937 )
								if( dx <= 83.8427 )
									ret := 0.000000
								if( dx > 83.8427 )
									ret := 0.882353 // buy
							if( diMinus > 5.36937 )
								if( diPlus <= 38.3499 )
									ret := 0.958333 // buy
								if( diPlus > 38.3499 )
									ret := 0.666667
					if( smoothedDirectionalMovementMinus > 0.001656 )
						if( adx <= 37.9319 )
							if( adx <= 22.8572 )
								ret := -0.545455
							if( adx > 22.8572 )
								if( diPlus <= 16.1917 )
									ret := 0.416667
								if( diPlus > 16.1917 )
									ret := 0.058824
						if( adx > 37.9319 )
							if( diPlus <= 34.1998 )
								if( smoothedDirectionalMovementMinus <= 0.005357 )
									ret := -0.923077 // sell
								if( smoothedDirectionalMovementMinus > 0.005357 )
									ret := -0.500000
							if( diPlus > 34.1998 )
								ret := -0.125000
			if( smoothedDirectionalMovementMinus > 0.007149 )
				if( diMinus <= 31.6521 )
					if( directionalMovementPlus <= 0.019748 )
						if( smoothedDirectionalMovementMinus <= 0.008074 )
							if( diPlus <= 8.11403 )
								ret := 0.933333 // buy
							if( diPlus > 8.11403 )
								if( diMinus <= 27.1158 )
									ret := 0.800000 // buy
								if( diMinus > 27.1158 )
									ret := 0.000000
						if( smoothedDirectionalMovementMinus > 0.008074 )
							if( trueRange <= 0.032126 )
								ret := -0.571429
							if( trueRange > 0.032126 )
								ret := -0.400000
					if( directionalMovementPlus > 0.019748 )
						ret := 0.750000 // buy
				if( diMinus > 31.6521 )
					if( smoothedDirectionalMovementMinus <= 0.010004 )
						if( trueRange <= 0.052247 )
							if( dx <= 38.3613 )
								if( diPlus <= 21.6695 )
									ret := 0.777778 // buy
								if( diPlus > 21.6695 )
									ret := 0.200000
							if( dx > 38.3613 )
								if( directionalMovementMinus <= 0.015 )
									ret := -0.384615
								if( directionalMovementMinus > 0.015 )
									ret := 0.750000 // buy
						if( trueRange > 0.052247 )
							if( smoothedTrueRange <= 0.026122 )
								ret := 0.666667
							if( smoothedTrueRange > 0.026122 )
								ret := 1.000000 // buy
					if( smoothedDirectionalMovementMinus > 0.010004 )
						if( dx <= 78.3626 )
							if( trueRange <= 0.048952 )
								if( diMinus <= 39.0909 )
									ret := 0.909091 // buy
								if( diMinus > 39.0909 )
									ret := 0.928571 // buy
							if( trueRange > 0.048952 )
								if( adx <= 28.1921 )
									ret := 0.900000 // buy
								if( adx > 28.1921 )
									ret := 0.222222
						if( dx > 78.3626 )
							ret := 1.000000 // buy
		if( smoothedTrueRange > 0.03031 )
			if( diMinus <= 37.7364 )
				if( smoothedDirectionalMovementPlus <= 0.000722 )
					if( diMinus <= 34.0204 )
						if( directionalMovementMinus <= 0.001069 )
							if( adx <= 55.3327 )
								ret := -0.416667
							if( adx > 55.3327 )
								ret := 0.181818
						if( directionalMovementMinus > 0.001069 )
							if( directionalMovementMinus <= 0.022016 )
								if( dx <= 88.5331 )
									ret := -1.000000 // sell
								if( dx > 88.5331 )
									ret := -0.600000
							if( directionalMovementMinus > 0.022016 )
								if( diPlus <= 0.255258 )
									ret := -1.000000 // sell
								if( diPlus > 0.255258 )
									ret := -0.777778 // sell
					if( diMinus > 34.0204 )
						if( trueRange <= 0.06 )
							if( trueRange <= 0.025 )
								ret := 0.400000
							if( trueRange > 0.025 )
								ret := 0.000000
						if( trueRange > 0.06 )
							ret := 0.625000
				if( smoothedDirectionalMovementPlus > 0.000722 )
					if( adx <= 21.4386 )
						if( trueRange <= 0.009998 )
							if( adx <= 14.6573 )
								if( smoothedTrueRange <= 0.0401 )
									ret := 0.600000
								if( smoothedTrueRange > 0.0401 )
									ret := 0.800000 // buy
							if( adx > 14.6573 )
								if( smoothedDirectionalMovementMinus <= 0.008208 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.008208 )
									ret := 0.371429
						if( trueRange > 0.009998 )
							if( diMinus <= 20.9069 )
								if( adx <= 15.4131 )
									ret := -0.052023
								if( adx > 15.4131 )
									ret := 0.154193
							if( diMinus > 20.9069 )
								if( trueRange <= 1.16175 )
									ret := 0.004810
								if( trueRange > 1.16175 )
									ret := 0.789474 // buy
					if( adx > 21.4386 )
						if( smoothedDirectionalMovementPlus <= 0.003186 )
							if( diMinus <= 23.3763 )
								if( trueRange <= 0.031264 )
									ret := 0.393443
								if( trueRange > 0.031264 )
									ret := 0.857143 // buy
							if( diMinus > 23.3763 )
								if( trueRange <= 0.095061 )
									ret := 0.141264
								if( trueRange > 0.095061 )
									ret := 0.516129
						if( smoothedDirectionalMovementPlus > 0.003186 )
							if( directionalMovementMinus <= 0.070677 )
								if( dx <= 0.101665 )
									ret := 0.287611
								if( dx > 0.101665 )
									ret := -0.002382
							if( directionalMovementMinus > 0.070677 )
								if( smoothedDirectionalMovementPlus <= 0.181805 )
									ret := -0.039854
								if( smoothedDirectionalMovementPlus > 0.181805 )
									ret := -0.203366
			if( diMinus > 37.7364 )
				if( adx <= 22.115 )
					if( smoothedDirectionalMovementPlus <= 0.007826 )
						if( smoothedDirectionalMovementPlus <= 0.006271 )
							if( adx <= 19.589 )
								ret := 1.000000 // buy
							if( adx > 19.589 )
								ret := 0.700000 // buy
						if( smoothedDirectionalMovementPlus > 0.006271 )
							ret := 0.272727
					if( smoothedDirectionalMovementPlus > 0.007826 )
						if( diMinus <= 38.7323 )
							if( adx <= 17.706 )
								ret := 0.812500 // buy
							if( adx > 17.706 )
								ret := 0.181818
						if( diMinus > 38.7323 )
							if( smoothedTrueRange <= 0.156227 )
								if( diPlus <= 15.1288 )
									ret := 0.090909
								if( diPlus > 15.1288 )
									ret := -0.819149 // sell
							if( smoothedTrueRange > 0.156227 )
								ret := -0.071429
				if( adx > 22.115 )
					if( smoothedDirectionalMovementMinus <= 0.033029 )
						if( diMinus <= 48.6651 )
							if( dx <= 23.6245 )
								if( adx <= 26.2257 )
									ret := -0.454545
								if( adx > 26.2257 )
									ret := 0.698113
							if( dx > 23.6245 )
								if( trueRange <= 0.195811 )
									ret := 0.042553
								if( trueRange > 0.195811 )
									ret := 0.525000
						if( diMinus > 48.6651 )
							if( smoothedDirectionalMovementMinus <= 0.025143 )
								if( smoothedDirectionalMovementPlus <= 0.003214 )
									ret := 0.210526
								if( smoothedDirectionalMovementPlus > 0.003214 )
									ret := -0.783784 // sell
							if( smoothedDirectionalMovementMinus > 0.025143 )
								if( smoothedTrueRange <= 0.053614 )
									ret := 0.346154
								if( smoothedTrueRange > 0.053614 )
									ret := -0.371429
					if( smoothedDirectionalMovementMinus > 0.033029 )
						if( diPlus <= 20.47 )
							if( diPlus <= 11.7978 )
								if( dx <= 61.3082 )
									ret := -0.045977
								if( dx > 61.3082 )
									ret := 0.261745
							if( diPlus > 11.7978 )
								if( trueRange <= 0.219753 )
									ret := 0.489002
								if( trueRange > 0.219753 )
									ret := 0.200692
						if( diPlus > 20.47 )
							if( dx <= 23.4096 )
								if( smoothedDirectionalMovementMinus <= 0.060733 )
									ret := 0.650000
								if( smoothedDirectionalMovementMinus > 0.060733 )
									ret := 0.142857
							if( dx > 23.4096 )
								if( directionalMovementMinus <= 0.121136 )
									ret := -0.260870
								if( directionalMovementMinus > 0.121136 )
									ret := 0.215385
	if( smoothedDirectionalMovementMinus > 0.08422 )
		if( diPlus <= 17.0521 )
			if( adx <= 56.8432 )
				if( diMinus <= 53.4474 )
					if( dx <= 31.802 )
						if( smoothedDirectionalMovementPlus <= 0.298752 )
							if( diMinus <= 22.8355 )
								if( smoothedTrueRange <= 0.436016 )
									ret := -0.438596
								if( smoothedTrueRange > 0.436016 )
									ret := 0.010347
							if( diMinus > 22.8355 )
								if( diMinus <= 25.0353 )
									ret := 0.319444
								if( diMinus > 25.0353 )
									ret := 0.075690
						if( smoothedDirectionalMovementPlus > 0.298752 )
							if( directionalMovementPlus <= 0.004981 )
								if( smoothedDirectionalMovementMinus <= 0.541192 )
									ret := -0.040000
								if( smoothedDirectionalMovementMinus > 0.541192 )
									ret := 0.470588
							if( directionalMovementPlus > 0.004981 )
								if( smoothedDirectionalMovementPlus <= 0.362729 )
									ret := 0.923077 // buy
								if( smoothedDirectionalMovementPlus > 0.362729 )
									ret := 0.428571
					if( dx > 31.802 )
						if( dx <= 52.325 )
							if( dx <= 50.3273 )
								if( adx <= 42.2512 )
									ret := -0.013171
								if( adx > 42.2512 )
									ret := -0.226219
							if( dx > 50.3273 )
								if( smoothedTrueRange <= 0.641169 )
									ret := -0.190813
								if( smoothedTrueRange > 0.641169 )
									ret := -0.487805
						if( dx > 52.325 )
							if( trueRange <= 0.346681 )
								if( directionalMovementPlus <= 0.150555 )
									ret := -0.098160
								if( directionalMovementPlus > 0.150555 )
									ret := 0.362069
							if( trueRange > 0.346681 )
								if( dx <= 80.6589 )
									ret := 0.084574
								if( dx > 80.6589 )
									ret := -0.139908
				if( diMinus > 53.4474 )
					if( smoothedDirectionalMovementPlus <= 0.063371 )
						if( diMinus <= 54.3256 )
							if( diPlus <= 4.21257 )
								ret := 0.312500
							if( diPlus > 4.21257 )
								if( dx <= 66.7964 )
									ret := 0.615385
								if( dx > 66.7964 )
									ret := 0.969697 // buy
						if( diMinus > 54.3256 )
							if( trueRange <= 1.66378 )
								if( dx <= 96.767 )
									ret := 0.458333
								if( dx > 96.767 )
									ret := 0.944444 // buy
							if( trueRange > 1.66378 )
								if( smoothedDirectionalMovementPlus <= 0.032711 )
									ret := -0.571429
								if( smoothedDirectionalMovementPlus > 0.032711 )
									ret := -0.333333
					if( smoothedDirectionalMovementPlus > 0.063371 )
						if( dx <= 75.4243 )
							if( diPlus <= 14.7595 )
								if( smoothedDirectionalMovementPlus <= 0.083214 )
									ret := 0.052632
								if( smoothedDirectionalMovementPlus > 0.083214 )
									ret := -0.400000
							if( diPlus > 14.7595 )
								ret := -0.750000 // sell
						if( dx > 75.4243 )
							ret := 0.727273 // buy
			if( adx > 56.8432 )
				if( dx <= 76.9741 )
					if( dx <= 44.6703 )
						if( diPlus <= 13.5325 )
							if( adx <= 75.7039 )
								if( directionalMovementPlus <= 0.199847 )
									ret := 0.101852
								if( directionalMovementPlus > 0.199847 )
									ret := 0.925000 // buy
							if( adx > 75.7039 )
								if( smoothedDirectionalMovementPlus <= 0.055466 )
									ret := 0.200000
								if( smoothedDirectionalMovementPlus > 0.055466 )
									ret := -0.681818
						if( diPlus > 13.5325 )
							if( trueRange <= 0.833219 )
								if( smoothedTrueRange <= 0.547602 )
									ret := -0.191011
								if( smoothedTrueRange > 0.547602 )
									ret := 0.382716
							if( trueRange > 0.833219 )
								if( smoothedDirectionalMovementPlus <= 0.158461 )
									ret := -0.771930 // sell
								if( smoothedDirectionalMovementPlus > 0.158461 )
									ret := -0.333333
					if( dx > 44.6703 )
						if( directionalMovementPlus <= 0.126305 )
							if( smoothedDirectionalMovementMinus <= 0.64085 )
								if( diMinus <= 46.0267 )
									ret := 0.234556
								if( diMinus > 46.0267 )
									ret := 0.684729
							if( smoothedDirectionalMovementMinus > 0.64085 )
								if( diMinus <= 43.8529 )
									ret := -0.347826
								if( diMinus > 43.8529 )
									ret := -0.785714 // sell
						if( directionalMovementPlus > 0.126305 )
							if( diMinus <= 43.5327 )
								if( smoothedTrueRange <= 0.503603 )
									ret := -0.358209
								if( smoothedTrueRange > 0.503603 )
									ret := -0.025210
							if( diMinus > 43.5327 )
								if( directionalMovementPlus <= 0.490234 )
									ret := 0.241935
								if( directionalMovementPlus > 0.490234 )
									ret := 0.913043 // buy
				if( dx > 76.9741 )
					if( directionalMovementMinus <= 0.195801 )
						if( directionalMovementPlus <= 0.2875 )
							if( smoothedDirectionalMovementMinus <= 0.743661 )
								if( smoothedTrueRange <= 0.20375 )
									ret := 0.583333
								if( smoothedTrueRange > 0.20375 )
									ret := -0.266667
							if( smoothedDirectionalMovementMinus > 0.743661 )
								if( adx <= 73.3993 )
									ret := 0.315789
								if( adx > 73.3993 )
									ret := 1.000000 // buy
						if( directionalMovementPlus > 0.2875 )
							if( smoothedDirectionalMovementMinus <= 0.797078 )
								if( smoothedDirectionalMovementMinus <= 0.460522 )
									ret := 0.750000 // buy
								if( smoothedDirectionalMovementMinus > 0.460522 )
									ret := -0.687500
							if( smoothedDirectionalMovementMinus > 0.797078 )
								ret := 0.850000 // buy
					if( directionalMovementMinus > 0.195801 )
						if( diPlus <= 2.96209 )
							if( smoothedDirectionalMovementMinus <= 0.45734 )
								if( trueRange <= 0.632523 )
									ret := -0.129032
								if( trueRange > 0.632523 )
									ret := 0.607843
							if( smoothedDirectionalMovementMinus > 0.45734 )
								if( diPlus <= 2.32066 )
									ret := -0.222222
								if( diPlus > 2.32066 )
									ret := -0.766667 // sell
						if( diPlus > 2.96209 )
							if( directionalMovementPlus <= 0.001086 )
								if( directionalMovementMinus <= 1.10091 )
									ret := 0.686275
								if( directionalMovementMinus > 1.10091 )
									ret := -0.181818
							if( directionalMovementPlus > 0.001086 )
								ret := 1.000000 // buy
		if( diPlus > 17.0521 )
			if( trueRange <= 0.516616 )
				if( smoothedTrueRange <= 0.483361 )
					if( smoothedDirectionalMovementPlus <= 0.102205 )
						if( dx <= 5.91434 )
							if( adx <= 15.7217 )
								if( dx <= 2.62681 )
									ret := -0.923077 // sell
								if( dx > 2.62681 )
									ret := -0.538462
							if( adx > 15.7217 )
								if( diMinus <= 24.8034 )
									ret := 0.046296
								if( diMinus > 24.8034 )
									ret := -0.315789
						if( dx > 5.91434 )
							if( directionalMovementMinus <= 0.225765 )
								if( dx <= 20.2649 )
									ret := 0.089831
								if( dx > 20.2649 )
									ret := -0.100271
							if( directionalMovementMinus > 0.225765 )
								if( trueRange <= 0.454994 )
									ret := 0.471264
								if( trueRange > 0.454994 )
									ret := -0.166667
					if( smoothedDirectionalMovementPlus > 0.102205 )
						if( smoothedDirectionalMovementPlus <= 0.1057 )
							if( trueRange <= 0.219768 )
								if( smoothedDirectionalMovementMinus <= 0.091675 )
									ret := 0.272727
								if( smoothedDirectionalMovementMinus > 0.091675 )
									ret := -0.666667
							if( trueRange > 0.219768 )
								if( smoothedDirectionalMovementMinus <= 0.118727 )
									ret := -0.871795 // sell
								if( smoothedDirectionalMovementMinus > 0.118727 )
									ret := -0.423077
						if( smoothedDirectionalMovementPlus > 0.1057 )
							if( trueRange <= 0.177889 )
								if( diPlus <= 30.8323 )
									ret := 0.280000
								if( diPlus > 30.8323 )
									ret := -0.318182
							if( trueRange > 0.177889 )
								if( diPlus <= 36.5645 )
									ret := -0.323529
								if( diPlus > 36.5645 )
									ret := 0.098592
				if( smoothedTrueRange > 0.483361 )
					if( smoothedTrueRange <= 0.538745 )
						if( diMinus <= 18.6262 )
							if( adx <= 35.8015 )
								if( smoothedDirectionalMovementMinus <= 0.086835 )
									ret := -0.266667
								if( smoothedDirectionalMovementMinus > 0.086835 )
									ret := 0.712500 // buy
							if( adx > 35.8015 )
								if( adx <= 50.0697 )
									ret := -0.136364
								if( adx > 50.0697 )
									ret := 0.294118
						if( diMinus > 18.6262 )
							if( directionalMovementPlus <= 0.129713 )
								if( smoothedDirectionalMovementMinus <= 0.122661 )
									ret := -0.195489
								if( smoothedDirectionalMovementMinus > 0.122661 )
									ret := 0.247253
							if( directionalMovementPlus > 0.129713 )
								if( directionalMovementPlus <= 0.181123 )
									ret := 0.609756
								if( directionalMovementPlus > 0.181123 )
									ret := 0.261905
					if( smoothedTrueRange > 0.538745 )
						if( smoothedTrueRange <= 0.785372 )
							if( directionalMovementMinus <= 0.257193 )
								if( diPlus <= 32.1856 )
									ret := -0.001171
								if( diPlus > 32.1856 )
									ret := -0.260684
							if( directionalMovementMinus > 0.257193 )
								if( smoothedTrueRange <= 0.608923 )
									ret := 0.600000
								if( smoothedTrueRange > 0.608923 )
									ret := 0.151515
						if( smoothedTrueRange > 0.785372 )
							if( diPlus <= 40.4155 )
								if( adx <= 14.6713 )
									ret := -0.253247
								if( adx > 14.6713 )
									ret := 0.128682
							if( diPlus > 40.4155 )
								if( smoothedDirectionalMovementMinus <= 0.1125 )
									ret := 0.923077 // buy
								if( smoothedDirectionalMovementMinus > 0.1125 )
									ret := 0.096774
			if( trueRange > 0.516616 )
				if( dx <= 68.0155 )
					if( diMinus <= 10.7254 )
						if( dx <= 54.874 )
							if( adx <= 36.5006 )
								if( dx <= 46.5002 )
									ret := 0.114286
								if( dx > 46.5002 )
									ret := -0.464286
							if( adx > 36.5006 )
								if( smoothedTrueRange <= 1.26021 )
									ret := -0.766990 // sell
								if( smoothedTrueRange > 1.26021 )
									ret := -0.382716
						if( dx > 54.874 )
							if( dx <= 58.5904 )
								if( smoothedDirectionalMovementMinus <= 0.114277 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.114277 )
									ret := 0.491228
							if( dx > 58.5904 )
								if( directionalMovementMinus <= 0.353494 )
									ret := -0.299107
								if( directionalMovementMinus > 0.353494 )
									ret := 0.236364
					if( diMinus > 10.7254 )
						if( diPlus <= 25.721 )
							if( smoothedDirectionalMovementPlus <= 0.669204 )
								if( dx <= 2.45388 )
									ret := 0.087028
								if( dx > 2.45388 )
									ret := -0.152778
							if( smoothedDirectionalMovementPlus > 0.669204 )
								ret := 0.933333 // buy
						if( diPlus > 25.721 )
							if( smoothedTrueRange <= 0.915732 )
								if( adx <= 33.4889 )
									ret := -0.006232
								if( adx > 33.4889 )
									ret := -0.130733
							if( smoothedTrueRange > 0.915732 )
								if( smoothedDirectionalMovementMinus <= 0.16418 )
									ret := 0.303419
								if( smoothedDirectionalMovementMinus > 0.16418 )
									ret := 0.028446
				if( dx > 68.0155 )
					if( directionalMovementPlus <= 0.001338 )
						if( diMinus <= 7.43597 )
							if( dx <= 73.4187 )
								ret := -0.222222
							if( dx > 73.4187 )
								ret := 0.461538
						if( diMinus > 7.43597 )
							ret := -0.687500
					if( directionalMovementPlus > 0.001338 )
						if( directionalMovementMinus <= 0.060772 )
							if( directionalMovementPlus <= 1.25062 )
								if( smoothedTrueRange <= 1.67888 )
									ret := 0.742857 // buy
								if( smoothedTrueRange > 1.67888 )
									ret := 0.964286 // buy
							if( directionalMovementPlus > 1.25062 )
								if( dx <= 72.0496 )
									ret := 0.950000 // buy
								if( dx > 72.0496 )
									ret := 0.125000
						if( directionalMovementMinus > 0.060772 )
							ret := -0.272727
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_AMD_30Min_80692a12(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


