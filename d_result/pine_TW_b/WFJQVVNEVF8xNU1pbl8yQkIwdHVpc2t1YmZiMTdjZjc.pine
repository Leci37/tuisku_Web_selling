//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: XRPUSDT_15Min_2BB0_bfb17cf7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2BB0_bfb17cf7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_bfb17cf7(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.00297 )
		if( bbp <= -0.015851 )
			if( Upper_Band <= 0.565267 )
				if( bbm <= 0.003878 )
					if( basis <= 0.514294 )
						if( Upper_Band <= 0.372335 )
							if( Lower_Band <= 0.320406 )
								ret := 1.000000 // buy
							if( Lower_Band > 0.320406 )
								if( Upper_Band <= 0.363862 )
									ret := -0.500000
								if( Upper_Band > 0.363862 )
									ret := 0.000000
						if( Upper_Band > 0.372335 )
							if( bullPower <= -0.006887 )
								ret := 1.000000 // buy
							if( bullPower > -0.006887 )
								if( basis <= 0.461315 )
									ret := 1.000000 // buy
								if( basis > 0.461315 )
									ret := 0.428571
					if( basis > 0.514294 )
						ret := -0.200000
				if( bbm > 0.003878 )
					if( bearPower <= -0.028733 )
						if( basis <= 0.523258 )
							if( Upper_Band <= 0.553919 )
								if( Upper_Band <= 0.458702 )
									ret := 0.812500 // buy
								if( Upper_Band > 0.458702 )
									ret := 1.000000 // buy
							if( Upper_Band > 0.553919 )
								ret := -0.428571
						if( basis > 0.523258 )
							ret := -1.000000 // sell
					if( bearPower > -0.028733 )
						if( Lower_Band <= 0.454754 )
							if( basis <= 0.433602 )
								if( bearPower <= -0.016898 )
									ret := 0.015152
								if( bearPower > -0.016898 )
									ret := 0.372222
							if( basis > 0.433602 )
								if( bbm <= 0.0063 )
									ret := 0.078947
								if( bbm > 0.0063 )
									ret := -0.596899
						if( Lower_Band > 0.454754 )
							if( basis <= 0.514366 )
								if( bullPower <= -0.006801 )
									ret := 0.850000 // buy
								if( bullPower > -0.006801 )
									ret := 0.204082
							if( basis > 0.514366 )
								if( basis <= 0.543311 )
									ret := -0.175573
								if( basis > 0.543311 )
									ret := 0.750000 // buy
			if( Upper_Band > 0.565267 )
				if( Lower_Band <= 0.570252 )
					if( bearPower <= -0.013746 )
						if( Upper_Band <= 0.593454 )
							if( bbm <= 0.012937 )
								if( Upper_Band <= 0.588988 )
									ret := 0.710526 // buy
								if( Upper_Band > 0.588988 )
									ret := -0.285714
							if( bbm > 0.012937 )
								if( bullPower <= -0.029814 )
									ret := 0.750000 // buy
								if( bullPower > -0.029814 )
									ret := 0.965517 // buy
						if( Upper_Band > 0.593454 )
							if( Upper_Band <= 0.659921 )
								if( basis <= 0.550418 )
									ret := 0.750000 // buy
								if( basis > 0.550418 )
									ret := 0.977011 // buy
							if( Upper_Band > 0.659921 )
								if( bullPower <= -0.021359 )
									ret := 0.666667
								if( bullPower > -0.021359 )
									ret := 0.250000
					if( bearPower > -0.013746 )
						if( Lower_Band <= 0.560105 )
							if( basis <= 0.56476 )
								if( bbm <= 0.0072 )
									ret := 0.181818
								if( bbm > 0.0072 )
									ret := 0.666667
							if( basis > 0.56476 )
								ret := -0.857143 // sell
						if( Lower_Band > 0.560105 )
							if( Lower_Band <= 0.561346 )
								ret := 0.750000 // buy
							if( Lower_Band > 0.561346 )
								if( basis <= 0.578765 )
									ret := 1.000000 // buy
								if( basis > 0.578765 )
									ret := 0.750000 // buy
				if( Lower_Band > 0.570252 )
					if( bearPower <= -0.024124 )
						if( basis <= 0.754435 )
							if( basis <= 0.644716 )
								if( Upper_Band <= 0.649047 )
									ret := 0.142857
								if( Upper_Band > 0.649047 )
									ret := -0.857143 // sell
							if( basis > 0.644716 )
								if( bbp <= -0.036301 )
									ret := 0.911765 // buy
								if( bbp > -0.036301 )
									ret := 0.000000
						if( basis > 0.754435 )
							if( Upper_Band <= 0.835682 )
								if( bearPower <= -0.028869 )
									ret := -0.833333 // sell
								if( bearPower > -0.028869 )
									ret := 0.250000
							if( Upper_Band > 0.835682 )
								ret := 0.833333 // buy
					if( bearPower > -0.024124 )
						if( Lower_Band <= 0.598264 )
							if( Upper_Band <= 0.644272 )
								if( bullPower <= -0.010863 )
									ret := -1.000000 // sell
								if( bullPower > -0.010863 )
									ret := 0.383838
							if( Upper_Band > 0.644272 )
								if( bbp <= -0.021346 )
									ret := -0.600000
								if( bbp > -0.021346 )
									ret := -1.000000 // sell
						if( Lower_Band > 0.598264 )
							if( bearPower <= -0.014532 )
								if( Lower_Band <= 0.621797 )
									ret := 0.902439 // buy
								if( Lower_Band > 0.621797 )
									ret := 0.647727
							if( bearPower > -0.014532 )
								if( Upper_Band <= 0.634558 )
									ret := 0.769231 // buy
								if( Upper_Band > 0.634558 )
									ret := 0.329897
		if( bbp > -0.015851 )
			if( basis <= 0.523688 )
				if( basis <= 0.519531 )
					if( bbm <= 0.00272 )
						if( basis <= 0.314997 )
							if( bullPower <= -0.00077 )
								if( Lower_Band <= 0.308527 )
									ret := 0.903846 // buy
								if( Lower_Band > 0.308527 )
									ret := 0.222222
							if( bullPower > -0.00077 )
								if( bbm <= 0.002328 )
									ret := -0.428571
								if( bbm > 0.002328 )
									ret := 0.625000
						if( basis > 0.314997 )
							if( Upper_Band <= 0.32636 )
								if( bearPower <= -0.002253 )
									ret := -0.336842
								if( bearPower > -0.002253 )
									ret := 0.818182 // buy
							if( Upper_Band > 0.32636 )
								if( Upper_Band <= 0.329895 )
									ret := 0.495238
								if( Upper_Band > 0.329895 )
									ret := 0.105593
					if( bbm > 0.00272 )
						if( basis <= 0.512628 )
							if( Upper_Band <= 0.465035 )
								if( basis <= 0.406464 )
									ret := 0.247649
								if( basis > 0.406464 )
									ret := 0.086558
							if( Upper_Band > 0.465035 )
								if( bullPower <= -0.001364 )
									ret := 0.411557
								if( bullPower > -0.001364 )
									ret := 0.230328
						if( basis > 0.512628 )
							if( bearPower <= -0.004344 )
								if( bbp <= -0.00788 )
									ret := -0.056818
								if( bbp > -0.00788 )
									ret := -0.384615
							if( bearPower > -0.004344 )
								if( Upper_Band <= 0.521466 )
									ret := 0.206897
								if( Upper_Band > 0.521466 )
									ret := 0.621622
				if( basis > 0.519531 )
					if( Lower_Band <= 0.514651 )
						if( Upper_Band <= 0.549341 )
							if( bbm <= 0.007677 )
								if( bbm <= 0.0015 )
									ret := 0.000000
								if( bbm > 0.0015 )
									ret := 0.759124 // buy
							if( bbm > 0.007677 )
								ret := -0.750000 // sell
						if( Upper_Band > 0.549341 )
							ret := -1.000000 // sell
					if( Lower_Band > 0.514651 )
						if( bullPower <= -0.003037 )
							if( bbp <= -0.00953 )
								ret := 0.000000
							if( bbp > -0.00953 )
								ret := -1.000000 // sell
						if( bullPower > -0.003037 )
							if( Upper_Band <= 0.528395 )
								if( Lower_Band <= 0.519485 )
									ret := 0.500000
								if( Lower_Band > 0.519485 )
									ret := -0.041667
							if( Upper_Band > 0.528395 )
								if( Lower_Band <= 0.516782 )
									ret := -0.291667
								if( Lower_Band > 0.516782 )
									ret := 0.357143
			if( basis > 0.523688 )
				if( Upper_Band <= 0.640462 )
					if( Lower_Band <= 0.51523 )
						if( basis <= 0.525263 )
							if( bbm <= 0.00495 )
								if( Lower_Band <= 0.510826 )
									ret := 1.000000 // buy
								if( Lower_Band > 0.510826 )
									ret := 0.500000
							if( bbm > 0.00495 )
								ret := -1.000000 // sell
						if( basis > 0.525263 )
							if( Upper_Band <= 0.606427 )
								if( bbm <= 0.00275 )
									ret := -0.428571
								if( bbm > 0.00275 )
									ret := -0.833333 // sell
							if( Upper_Band > 0.606427 )
								ret := 0.500000
					if( Lower_Band > 0.51523 )
						if( bbm <= 0.002271 )
							if( Upper_Band <= 0.529359 )
								if( bullPower <= -0.001243 )
									ret := 0.000000
								if( bullPower > -0.001243 )
									ret := -0.620690
							if( Upper_Band > 0.529359 )
								if( bullPower <= -0.001453 )
									ret := -0.069124
								if( bullPower > -0.001453 )
									ret := 0.054945
						if( bbm > 0.002271 )
							if( basis <= 0.540096 )
								if( bbp <= -0.012957 )
									ret := -0.658537
								if( bbp > -0.012957 )
									ret := 0.002451
							if( basis > 0.540096 )
								if( bullPower <= -0.000889 )
									ret := 0.211693
								if( bullPower > -0.000889 )
									ret := 0.081736
				if( Upper_Band > 0.640462 )
					if( basis <= 0.675063 )
						if( Lower_Band <= 0.647332 )
							if( Upper_Band <= 0.661616 )
								if( Lower_Band <= 0.645557 )
									ret := -0.175305
								if( Lower_Band > 0.645557 )
									ret := 0.655172
							if( Upper_Band > 0.661616 )
								if( basis <= 0.665021 )
									ret := 0.488372
								if( basis > 0.665021 )
									ret := -0.833333 // sell
						if( Lower_Band > 0.647332 )
							if( Lower_Band <= 0.654824 )
								if( Upper_Band <= 0.671528 )
									ret := -0.817308 // sell
								if( Upper_Band > 0.671528 )
									ret := 0.285714
							if( Lower_Band > 0.654824 )
								if( basis <= 0.661592 )
									ret := 0.806452 // buy
								if( basis > 0.661592 )
									ret := -0.335294
					if( basis > 0.675063 )
						if( basis <= 0.789876 )
							if( basis <= 0.67798 )
								if( bearPower <= -0.009821 )
									ret := 1.000000 // buy
								if( bearPower > -0.009821 )
									ret := 0.692308
							if( basis > 0.67798 )
								if( Upper_Band <= 0.691131 )
									ret := -0.359375
								if( Upper_Band > 0.691131 )
									ret := 0.125835
						if( basis > 0.789876 )
							if( Upper_Band <= 0.843097 )
								if( bbm <= 0.003869 )
									ret := -0.052632
								if( bbm > 0.003869 )
									ret := -0.720930 // sell
							if( Upper_Band > 0.843097 )
								if( Lower_Band <= 0.820115 )
									ret := 0.814815 // buy
								if( Lower_Band > 0.820115 )
									ret := -0.500000
	if( bbp > -0.00297 )
		if( Lower_Band <= 0.612088 )
			if( Upper_Band <= 0.462425 )
				if( basis <= 0.448652 )
					if( Lower_Band <= 0.328813 )
						if( basis <= 0.33903 )
							if( Upper_Band <= 0.309124 )
								if( bbm <= 0.004819 )
									ret := 0.935484 // buy
								if( bbm > 0.004819 )
									ret := 0.500000
							if( Upper_Band > 0.309124 )
								if( Lower_Band <= 0.293274 )
									ret := -0.736842 // sell
								if( Lower_Band > 0.293274 )
									ret := 0.123645
						if( basis > 0.33903 )
							if( Lower_Band <= 0.327455 )
								if( bbm <= 0.004926 )
									ret := 1.000000 // buy
								if( bbm > 0.004926 )
									ret := 0.764706 // buy
							if( Lower_Band > 0.327455 )
								ret := 0.250000
					if( Lower_Band > 0.328813 )
						if( bearPower <= -0.001291 )
							if( bbm <= 0.00845 )
								if( basis <= 0.448341 )
									ret := 0.116655
								if( basis > 0.448341 )
									ret := -1.000000 // sell
							if( bbm > 0.00845 )
								if( Lower_Band <= 0.396714 )
									ret := -0.328125
								if( Lower_Band > 0.396714 )
									ret := -0.869565 // sell
						if( bearPower > -0.001291 )
							if( basis <= 0.332516 )
								if( Upper_Band <= 0.332251 )
									ret := 0.138889
								if( Upper_Band > 0.332251 )
									ret := -0.555556
							if( basis > 0.332516 )
								if( bbp <= 0.032379 )
									ret := 0.024639
								if( bbp > 0.032379 )
									ret := 0.700000 // buy
				if( basis > 0.448652 )
					if( basis <= 0.456277 )
						if( Lower_Band <= 0.449185 )
							if( Upper_Band <= 0.452004 )
								if( bbm <= 0.001446 )
									ret := 1.000000 // buy
								if( bbm > 0.001446 )
									ret := 0.000000
							if( Upper_Band > 0.452004 )
								if( Lower_Band <= 0.444498 )
									ret := 0.653846
								if( Lower_Band > 0.444498 )
									ret := 0.144628
						if( Lower_Band > 0.449185 )
							if( Lower_Band <= 0.451504 )
								if( bbp <= -0.001072 )
									ret := 0.400000
								if( bbp > -0.001072 )
									ret := 0.737557 // buy
							if( Lower_Band > 0.451504 )
								if( Upper_Band <= 0.458922 )
									ret := 0.432432
								if( Upper_Band > 0.458922 )
									ret := 0.086207
					if( basis > 0.456277 )
						if( Lower_Band <= 0.455465 )
							if( bbm <= 0.000903 )
								if( Upper_Band <= 0.458996 )
									ret := 0.600000
								if( Upper_Band > 0.458996 )
									ret := 0.000000
							if( bbm > 0.000903 )
								if( bbm <= 0.002596 )
									ret := -0.443750
								if( bbm > 0.002596 )
									ret := -0.027027
						if( Lower_Band > 0.455465 )
							if( bbm <= 0.00275 )
								if( Lower_Band <= 0.458094 )
									ret := 0.230435
								if( Lower_Band > 0.458094 )
									ret := -0.102564
							if( bbm > 0.00275 )
								if( basis <= 0.458892 )
									ret := 0.000000
								if( basis > 0.458892 )
									ret := -0.666667
			if( Upper_Band > 0.462425 )
				if( bearPower <= -0.001393 )
					if( bullPower <= -0.00056 )
						if( Upper_Band <= 0.527786 )
							if( bullPower <= -0.000688 )
								if( bbp <= -0.002611 )
									ret := 0.209150
								if( bbp > -0.002611 )
									ret := -0.068376
							if( bullPower > -0.000688 )
								if( bearPower <= -0.002262 )
									ret := -0.451613
								if( bearPower > -0.002262 )
									ret := -0.086207
						if( Upper_Band > 0.527786 )
							if( bbp <= -0.00276 )
								if( Upper_Band <= 0.528169 )
									ret := -1.000000 // sell
								if( Upper_Band > 0.528169 )
									ret := 0.052632
							if( bbp > -0.00276 )
								if( bullPower <= -0.000568 )
									ret := -0.237548
								if( bullPower > -0.000568 )
									ret := -1.000000 // sell
					if( bullPower > -0.00056 )
						if( basis <= 0.620091 )
							if( Upper_Band <= 0.463635 )
								if( basis <= 0.458458 )
									ret := -0.700000 // sell
								if( basis > 0.458458 )
									ret := -0.282051
							if( Upper_Band > 0.463635 )
								if( Lower_Band <= 0.611562 )
									ret := 0.089520
								if( Lower_Band > 0.611562 )
									ret := 0.709677 // buy
						if( basis > 0.620091 )
							if( bearPower <= -0.003481 )
								ret := -1.000000 // sell
							if( bearPower > -0.003481 )
								if( bearPower <= -0.00285 )
									ret := 0.428571
								if( bearPower > -0.00285 )
									ret := -0.387097
				if( bearPower > -0.001393 )
					if( Upper_Band <= 0.606391 )
						if( bbp <= 0.005331 )
							if( bbm <= 0.001714 )
								if( Lower_Band <= 0.462471 )
									ret := -0.174672
								if( Lower_Band > 0.462471 )
									ret := -0.021961
							if( bbm > 0.001714 )
								if( Lower_Band <= 0.577793 )
									ret := 0.056512
								if( Lower_Band > 0.577793 )
									ret := -0.100610
						if( bbp > 0.005331 )
							if( Lower_Band <= 0.512336 )
								if( Upper_Band <= 0.518194 )
									ret := -0.086464
								if( Upper_Band > 0.518194 )
									ret := -0.416526
							if( Lower_Band > 0.512336 )
								if( Upper_Band <= 0.53351 )
									ret := 0.301754
								if( Upper_Band > 0.53351 )
									ret := -0.072077
					if( Upper_Band > 0.606391 )
						if( Upper_Band <= 0.613237 )
							if( bbm <= 0.001548 )
								if( bbp <= 0.003 )
									ret := -0.138614
								if( bbp > 0.003 )
									ret := 0.176471
							if( bbm > 0.001548 )
								if( bearPower <= -0.001122 )
									ret := -0.060000
								if( bearPower > -0.001122 )
									ret := 0.351036
						if( Upper_Band > 0.613237 )
							if( Lower_Band <= 0.423191 )
								if( bearPower <= 0.079148 )
									ret := 1.000000 // buy
								if( bearPower > 0.079148 )
									ret := 0.250000
							if( Lower_Band > 0.423191 )
								if( Lower_Band <= 0.604748 )
									ret := -0.128788
								if( Lower_Band > 0.604748 )
									ret := 0.103837
		if( Lower_Band > 0.612088 )
			if( bearPower <= 0.000907 )
				if( bearPower <= -0.001061 )
					if( basis <= 0.714917 )
						if( bullPower <= 0.000209 )
							if( Lower_Band <= 0.635904 )
								if( basis <= 0.63719 )
									ret := -0.026856
								if( basis > 0.63719 )
									ret := -0.769231 // sell
							if( Lower_Band > 0.635904 )
								if( basis <= 0.66075 )
									ret := 0.504854
								if( basis > 0.66075 )
									ret := 0.033149
						if( bullPower > 0.000209 )
							if( bearPower <= -0.001815 )
								if( bbm <= 0.006514 )
									ret := 0.000000
								if( bbm > 0.006514 )
									ret := -0.365385
							if( bearPower > -0.001815 )
								if( Lower_Band <= 0.617873 )
									ret := -0.401961
								if( Lower_Band > 0.617873 )
									ret := -0.122383
					if( basis > 0.714917 )
						if( Upper_Band <= 0.743972 )
							if( Upper_Band <= 0.727049 )
								if( bullPower <= 0.000111 )
									ret := -0.684211
								if( bullPower > 0.000111 )
									ret := -0.062500
							if( Upper_Band > 0.727049 )
								if( Lower_Band <= 0.700775 )
									ret := 0.400000
								if( Lower_Band > 0.700775 )
									ret := -0.747253 // sell
						if( Upper_Band > 0.743972 )
							if( basis <= 0.742905 )
								if( bullPower <= 0.006059 )
									ret := 0.510638
								if( bullPower > 0.006059 )
									ret := -0.818182 // sell
							if( basis > 0.742905 )
								if( bullPower <= 0.004951 )
									ret := -0.304348
								if( bullPower > 0.004951 )
									ret := 0.100000
				if( bearPower > -0.001061 )
					if( Lower_Band <= 0.770256 )
						if( bbm <= 0.003436 )
							if( basis <= 0.742079 )
								if( basis <= 0.638774 )
									ret := -0.021739
								if( basis > 0.638774 )
									ret := 0.133396
							if( basis > 0.742079 )
								if( Lower_Band <= 0.747949 )
									ret := -0.894737 // sell
								if( Lower_Band > 0.747949 )
									ret := -0.181818
						if( bbm > 0.003436 )
							if( Upper_Band <= 0.62373 )
								if( bbp <= 0.004105 )
									ret := -0.400000
								if( bbp > 0.004105 )
									ret := 0.857143 // buy
							if( Upper_Band > 0.62373 )
								if( basis <= 0.623545 )
									ret := -0.500000
								if( basis > 0.623545 )
									ret := -0.105666
					if( Lower_Band > 0.770256 )
						if( bbp <= 0.006137 )
							if( bearPower <= 0.000113 )
								if( Lower_Band <= 0.79582 )
									ret := 0.100000
								if( Lower_Band > 0.79582 )
									ret := -1.000000 // sell
							if( bearPower > 0.000113 )
								ret := 0.714286 // buy
						if( bbp > 0.006137 )
							if( basis <= 0.808933 )
								if( bbp <= 0.009109 )
									ret := 1.000000 // buy
								if( bbp > 0.009109 )
									ret := 0.666667
							if( basis > 0.808933 )
								if( Lower_Band <= 0.803328 )
									ret := -0.500000
								if( Lower_Band > 0.803328 )
									ret := 0.666667
			if( bearPower > 0.000907 )
				if( basis <= 0.752747 )
					if( Upper_Band <= 0.723208 )
						if( Upper_Band <= 0.712489 )
							if( Upper_Band <= 0.689041 )
								if( bbm <= 0.006004 )
									ret := -0.273538
								if( bbm > 0.006004 )
									ret := 0.131034
							if( Upper_Band > 0.689041 )
								if( bbm <= 0.002837 )
									ret := 0.228571
								if( bbm > 0.002837 )
									ret := -0.644444
						if( Upper_Band > 0.712489 )
							if( Lower_Band <= 0.696001 )
								if( bullPower <= 0.016614 )
									ret := 1.000000 // buy
								if( bullPower > 0.016614 )
									ret := 0.400000
							if( Lower_Band > 0.696001 )
								if( bearPower <= 0.002658 )
									ret := 0.090909
								if( bearPower > 0.002658 )
									ret := -0.500000
					if( Upper_Band > 0.723208 )
						if( bbm <= 0.00235 )
							ret := 0.750000 // buy
						if( bbm > 0.00235 )
							if( basis <= 0.722119 )
								if( bearPower <= 0.004005 )
									ret := -0.725490 // sell
								if( bearPower > 0.004005 )
									ret := -0.975610 // sell
							if( basis > 0.722119 )
								if( bbp <= 0.025949 )
									ret := -0.521739
								if( bbp > 0.025949 )
									ret := 0.500000
				if( basis > 0.752747 )
					if( basis <= 0.783513 )
						if( bbp <= 0.031352 )
							if( Lower_Band <= 0.767285 )
								if( bullPower <= 0.016175 )
									ret := 0.833333 // buy
								if( bullPower > 0.016175 )
									ret := -0.250000
							if( Lower_Band > 0.767285 )
								if( bbm <= 0.004737 )
									ret := -1.000000 // sell
								if( bbm > 0.004737 )
									ret := 0.000000
						if( bbp > 0.031352 )
							ret := -1.000000 // sell
					if( basis > 0.783513 )
						if( Lower_Band <= 0.788027 )
							if( Upper_Band <= 0.801383 )
								ret := 0.600000
							if( Upper_Band > 0.801383 )
								if( Lower_Band <= 0.763221 )
									ret := 0.250000
								if( Lower_Band > 0.763221 )
									ret := -0.794872 // sell
						if( Lower_Band > 0.788027 )
							if( bbm <= 0.009626 )
								if( basis <= 0.827073 )
									ret := 0.857143 // buy
								if( basis > 0.827073 )
									ret := -1.000000 // sell
							if( bbm > 0.009626 )
								ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_XRPUSDT_15Min_bfb17cf7(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


