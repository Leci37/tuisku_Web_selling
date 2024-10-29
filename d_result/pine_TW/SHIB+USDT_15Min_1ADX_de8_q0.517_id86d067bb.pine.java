//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: SHIBUSDT_15Min_1ADX_86d067bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_1ADX_86d067bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_86d067bb(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( diMinus <= 32.0759 )
		if( dx <= 87.3387 )
			if( diMinus <= 27.3116 )
				if( diPlus <= 36.5735 )
					if( diPlus <= 18.0032 )
						if( adx <= 27.9663 )
							if( dx <= 48.6447 )
								if( adx <= 9.54486 )
									ret := -0.241860
								if( adx > 9.54486 )
									ret := -0.019052
							if( dx > 48.6447 )
								if( diMinus <= 24.5138 )
									ret := 0.275654
								if( diMinus > 24.5138 )
									ret := -0.067308
						if( adx > 27.9663 )
							if( diPlus <= 3.81155 )
								if( diPlus <= 1.87798 )
									ret := 0.533333
								if( diPlus > 1.87798 )
									ret := -0.205950
							if( diPlus > 3.81155 )
								if( dx <= 75.33 )
									ret := 0.036231
								if( dx > 75.33 )
									ret := -0.733333 // sell
					if( diPlus > 18.0032 )
						if( diMinus <= 25.1537 )
							if( adx <= 54.3307 )
								if( dx <= 43.8894 )
									ret := 0.057101
								if( dx > 43.8894 )
									ret := 0.002354
							if( adx > 54.3307 )
								if( dx <= 36.8956 )
									ret := -0.015186
								if( dx > 36.8956 )
									ret := 0.144848
						if( diMinus > 25.1537 )
							if( diPlus <= 25.6457 )
								if( adx <= 17.861 )
									ret := -0.327160
								if( adx > 17.861 )
									ret := -0.034803
							if( diPlus > 25.6457 )
								if( diMinus <= 25.4215 )
									ret := 0.166667
								if( diMinus > 25.4215 )
									ret := -0.470588
				if( diPlus > 36.5735 )
					if( dx <= 81.432 )
						if( diMinus <= 11.5959 )
							if( diPlus <= 46.9391 )
								if( adx <= 21.3524 )
									ret := 0.354167
								if( adx > 21.3524 )
									ret := -0.121224
							if( diPlus > 46.9391 )
								if( adx <= 66.9412 )
									ret := -0.483254
								if( adx > 66.9412 )
									ret := 0.250000
						if( diMinus > 11.5959 )
							if( adx <= 57.607 )
								if( adx <= 51.9931 )
									ret := 0.037500
								if( adx > 51.9931 )
									ret := -0.647059
							if( adx > 57.607 )
								if( diMinus <= 16.5666 )
									ret := 0.640212
								if( diMinus > 16.5666 )
									ret := -0.375000
					if( dx > 81.432 )
						if( diPlus <= 53.0858 )
							if( adx <= 77.8877 )
								if( adx <= 56.2453 )
									ret := 0.273077
								if( adx > 56.2453 )
									ret := -0.146739
							if( adx > 77.8877 )
								if( dx <= 83.9953 )
									ret := 0.166667
								if( dx > 83.9953 )
									ret := 0.862069 // buy
						if( diPlus > 53.0858 )
							if( dx <= 82.7538 )
								ret := 0.200000
							if( dx > 82.7538 )
								if( diMinus <= 4.91155 )
									ret := 0.800000 // buy
								if( diMinus > 4.91155 )
									ret := 1.000000 // buy
			if( diMinus > 27.3116 )
				if( dx <= 52.6034 )
					if( dx <= 33.529 )
						if( diMinus <= 28.4159 )
							if( diPlus <= 14.9968 )
								if( adx <= 40.1428 )
									ret := -0.260000
								if( adx > 40.1428 )
									ret := 0.207317
							if( diPlus > 14.9968 )
								if( adx <= 22.5605 )
									ret := 0.012766
								if( adx > 22.5605 )
									ret := 0.231496
						if( diMinus > 28.4159 )
							if( diPlus <= 24.3138 )
								if( diPlus <= 15.5081 )
									ret := 0.046358
								if( diPlus > 15.5081 )
									ret := -0.110176
							if( diPlus > 24.3138 )
								if( dx <= 6.11506 )
									ret := 0.375000
								if( dx > 6.11506 )
									ret := -0.732143 // sell
					if( dx > 33.529 )
						if( dx <= 36.3546 )
							if( dx <= 36.017 )
								if( adx <= 26.1735 )
									ret := 0.504587
								if( adx > 26.1735 )
									ret := 0.102190
							if( dx > 36.017 )
								if( adx <= 26.4988 )
									ret := 0.200000
								if( adx > 26.4988 )
									ret := 0.735294 // buy
						if( dx > 36.3546 )
							if( adx <= 15.1439 )
								if( adx <= 11.0085 )
									ret := 0.600000
								if( adx > 11.0085 )
									ret := -0.622222
							if( adx > 15.1439 )
								if( adx <= 77.1819 )
									ret := 0.071001
								if( adx > 77.1819 )
									ret := -0.560000
				if( dx > 52.6034 )
					if( diPlus <= 3.64017 )
						if( adx <= 59.6098 )
							if( adx <= 45.9947 )
								if( diMinus <= 29.8258 )
									ret := -0.329545
								if( diMinus > 29.8258 )
									ret := 0.283333
							if( adx > 45.9947 )
								if( adx <= 55.8128 )
									ret := 0.597561
								if( adx > 55.8128 )
									ret := 0.121212
						if( adx > 59.6098 )
							if( diPlus <= 2.9991 )
								if( diMinus <= 30.92 )
									ret := 0.200000
								if( diMinus > 30.92 )
									ret := -0.625000
							if( diPlus > 2.9991 )
								if( adx <= 75.1978 )
									ret := -0.769231 // sell
								if( adx > 75.1978 )
									ret := -0.185185
					if( diPlus > 3.64017 )
						if( adx <= 33.4952 )
							if( dx <= 57.8917 )
								if( adx <= 31.2994 )
									ret := 0.300366
								if( adx > 31.2994 )
									ret := -0.162162
							if( dx > 57.8917 )
								if( adx <= 22.5612 )
									ret := 0.400000
								if( adx > 22.5612 )
									ret := -0.075419
						if( adx > 33.4952 )
							if( dx <= 65.4001 )
								if( diPlus <= 9.72402 )
									ret := 0.175883
								if( diPlus > 9.72402 )
									ret := 0.772727 // buy
							if( dx > 65.4001 )
								if( diPlus <= 5.5569 )
									ret := 0.286477
								if( diPlus > 5.5569 )
									ret := 0.464286
		if( dx > 87.3387 )
			if( diPlus <= 39.7797 )
				if( dx <= 88.6922 )
					if( diPlus <= 1.93235 )
						if( adx <= 60.0254 )
							if( adx <= 36.2451 )
								ret := 0.000000
							if( adx > 36.2451 )
								if( adx <= 39.334 )
									ret := 1.000000 // buy
								if( adx > 39.334 )
									ret := 0.272727
						if( adx > 60.0254 )
							if( adx <= 66.31 )
								ret := -0.500000
							if( adx > 66.31 )
								ret := 0.333333
					if( diPlus > 1.93235 )
						if( diMinus <= 1.5877 )
							ret := 1.000000 // buy
						if( diMinus > 1.5877 )
							if( diPlus <= 38.6385 )
								if( dx <= 87.513 )
									ret := -0.192308
								if( dx > 87.513 )
									ret := -0.639344
							if( diPlus > 38.6385 )
								if( diPlus <= 39.2747 )
									ret := 0.800000 // buy
								if( diPlus > 39.2747 )
									ret := -0.400000
				if( dx > 88.6922 )
					if( adx <= 61.1418 )
						if( diMinus <= 28.2486 )
							if( dx <= 90.6412 )
								if( diMinus <= 26.7436 )
									ret := -0.085106
								if( diMinus > 26.7436 )
									ret := 0.875000 // buy
							if( dx > 90.6412 )
								if( diMinus <= 0.238228 )
									ret := 0.046358
								if( diMinus > 0.238228 )
									ret := 0.364754
						if( diMinus > 28.2486 )
							if( adx <= 49.6828 )
								if( dx <= 91.9516 )
									ret := -0.695652
								if( dx > 91.9516 )
									ret := -0.266667
							if( adx > 49.6828 )
								if( diMinus <= 31.004 )
									ret := 0.000000
								if( diMinus > 31.004 )
									ret := 0.700000 // buy
					if( adx > 61.1418 )
						if( dx <= 89.6933 )
							if( diPlus <= 28.295 )
								if( diMinus <= 30.3415 )
									ret := 0.857143 // buy
								if( diMinus > 30.3415 )
									ret := 0.500000
							if( diPlus > 28.295 )
								if( adx <= 83.7267 )
									ret := 0.052632
								if( adx > 83.7267 )
									ret := -1.000000 // sell
						if( dx > 89.6933 )
							if( adx <= 76.3333 )
								if( diPlus <= 38.4169 )
									ret := -0.170213
								if( diPlus > 38.4169 )
									ret := 0.375000
							if( adx > 76.3333 )
								if( diPlus <= 29.1403 )
									ret := -0.108108
								if( diPlus > 29.1403 )
									ret := -0.642857
			if( diPlus > 39.7797 )
				if( adx <= 65.5556 )
					if( trueRange <= 2e-06 )
						if( adx <= 61.1903 )
							if( dx <= 94.0647 )
								if( adx <= 52.9974 )
									ret := -0.618785
								if( adx > 52.9974 )
									ret := -0.314815
							if( dx > 94.0647 )
								if( diMinus <= 1.65387 )
									ret := -0.433962
								if( diMinus > 1.65387 )
									ret := 1.000000 // buy
						if( adx > 61.1903 )
							if( diPlus <= 43.0264 )
								if( smoothedDirectionalMovementPlus <= 0 )
									ret := -0.250000
								if( smoothedDirectionalMovementPlus > 0 )
									ret := 0.000000
							if( diPlus > 43.0264 )
								if( diMinus <= 2.77268 )
									ret := -0.958333 // sell
								if( diMinus > 2.77268 )
									ret := -0.250000
					if( trueRange > 2e-06 )
						if( adx <= 46.9293 )
							ret := 0.750000 // buy
						if( adx > 46.9293 )
							ret := -0.500000
				if( adx > 65.5556 )
					if( adx <= 67.2507 )
						if( dx <= 90.3704 )
							ret := 0.000000
						if( dx > 90.3704 )
							if( diMinus <= 1.00185 )
								ret := 0.333333
							if( diMinus > 1.00185 )
								ret := 1.000000 // buy
					if( adx > 67.2507 )
						if( diPlus <= 49.2915 )
							if( diPlus <= 43.9856 )
								if( dx <= 93.9609 )
									ret := 0.250000
								if( dx > 93.9609 )
									ret := -0.857143 // sell
							if( diPlus > 43.9856 )
								if( adx <= 80.7845 )
									ret := -0.962963 // sell
								if( adx > 80.7845 )
									ret := -0.692308
						if( diPlus > 49.2915 )
							if( adx <= 78.0291 )
								if( diPlus <= 57.1954 )
									ret := -0.583333
								if( diPlus > 57.1954 )
									ret := 0.800000 // buy
							if( adx > 78.0291 )
								if( dx <= 95.9448 )
									ret := 1.000000 // buy
								if( dx > 95.9448 )
									ret := 0.750000 // buy
	if( diMinus > 32.0759 )
		if( dx <= 73.7582 )
			if( diMinus <= 41.1322 )
				if( diPlus <= 10.316 )
					if( dx <= 53.5969 )
						if( dx <= 53.502 )
							if( diMinus <= 33.2446 )
								if( dx <= 53.4806 )
									ret := 0.613861
								if( dx > 53.4806 )
									ret := -0.750000 // sell
							if( diMinus > 33.2446 )
								if( adx <= 52.3649 )
									ret := -0.181818
								if( adx > 52.3649 )
									ret := 1.000000 // buy
						if( dx > 53.502 )
							if( diMinus <= 32.3375 )
								ret := 0.500000
							if( diMinus > 32.3375 )
								ret := 1.000000 // buy
					if( dx > 53.5969 )
						if( adx <= 68.4307 )
							if( smoothedTrueRange <= 1e-06 )
								if( dx <= 66.8267 )
									ret := 0.148487
								if( dx > 66.8267 )
									ret := 0.047699
							if( smoothedTrueRange > 1e-06 )
								if( diMinus <= 34.3982 )
									ret := 1.000000 // buy
								if( diMinus > 34.3982 )
									ret := -1.000000 // sell
						if( adx > 68.4307 )
							if( diPlus <= 6.10154 )
								if( adx <= 72.9756 )
									ret := -0.454545
								if( adx > 72.9756 )
									ret := 0.107143
							if( diPlus > 6.10154 )
								if( diMinus <= 34.2816 )
									ret := 0.187970
								if( diMinus > 34.2816 )
									ret := 0.563063
				if( diPlus > 10.316 )
					if( diPlus <= 12.5383 )
						if( adx <= 22.347 )
							if( diPlus <= 12.1393 )
								if( diMinus <= 36.5421 )
									ret := -0.458333
								if( diMinus > 36.5421 )
									ret := -0.866667 // sell
							if( diPlus > 12.1393 )
								if( dx <= 45.4597 )
									ret := 0.250000
								if( dx > 45.4597 )
									ret := 0.833333 // buy
						if( adx > 22.347 )
							if( diPlus <= 11.9051 )
								if( diMinus <= 39.7954 )
									ret := 0.098952
								if( diMinus > 39.7954 )
									ret := -0.271605
							if( diPlus > 11.9051 )
								if( adx <= 34.0343 )
									ret := 0.041237
								if( adx > 34.0343 )
									ret := -0.288462
					if( diPlus > 12.5383 )
						if( diPlus <= 15.7313 )
							if( adx <= 68.9514 )
								if( dx <= 41.3301 )
									ret := 0.312020
								if( dx > 41.3301 )
									ret := 0.123662
							if( adx > 68.9514 )
								if( dx <= 46.1806 )
									ret := -0.575758
								if( dx > 46.1806 )
									ret := 0.400000
						if( diPlus > 15.7313 )
							if( diMinus <= 36.3488 )
								if( adx <= 20.1318 )
									ret := 0.444444
								if( adx > 20.1318 )
									ret := 0.010593
							if( diMinus > 36.3488 )
								if( dx <= 32.3429 )
									ret := 0.275000
								if( dx > 32.3429 )
									ret := -0.390977
			if( diMinus > 41.1322 )
				if( dx <= 62.6588 )
					if( diPlus <= 13.3906 )
						if( diPlus <= 11.89 )
							if( adx <= 72.4886 )
								if( diMinus <= 42.506 )
									ret := 0.432099
								if( diMinus > 42.506 )
									ret := 0.731343 // buy
							if( adx > 72.4886 )
								if( dx <= 58.2262 )
									ret := -1.000000 // sell
								if( dx > 58.2262 )
									ret := -0.111111
						if( diPlus > 11.89 )
							if( adx <= 37.279 )
								if( dx <= 53.139 )
									ret := 0.944444 // buy
								if( dx > 53.139 )
									ret := 0.242424
							if( adx > 37.279 )
								if( diMinus <= 42.4504 )
									ret := -0.588235
								if( diMinus > 42.4504 )
									ret := 0.264706
					if( diPlus > 13.3906 )
						if( adx <= 36.0503 )
							if( adx <= 23.538 )
								if( diMinus <= 44.5778 )
									ret := 0.642857
								if( diMinus > 44.5778 )
									ret := -0.250000
							if( adx > 23.538 )
								if( dx <= 49.1848 )
									ret := 0.862069 // buy
								if( dx > 49.1848 )
									ret := 1.000000 // buy
						if( adx > 36.0503 )
							if( diPlus <= 15.1728 )
								if( adx <= 43.5163 )
									ret := 0.800000 // buy
								if( adx > 43.5163 )
									ret := 0.269231
							if( diPlus > 15.1728 )
								if( adx <= 60.8394 )
									ret := -0.333333
								if( adx > 60.8394 )
									ret := 0.500000
				if( dx > 62.6588 )
					if( dx <= 67.6391 )
						if( adx <= 52.4315 )
							if( adx <= 34.6915 )
								if( diPlus <= 9.06353 )
									ret := -0.125000
								if( diPlus > 9.06353 )
									ret := 0.487179
							if( adx > 34.6915 )
								if( diMinus <= 42.4753 )
									ret := 0.000000
								if( diMinus > 42.4753 )
									ret := -0.538462
						if( adx > 52.4315 )
							if( adx <= 56.7616 )
								if( diPlus <= 9.4049 )
									ret := 0.810811 // buy
								if( diPlus > 9.4049 )
									ret := 0.300000
							if( adx > 56.7616 )
								if( diPlus <= 10.5437 )
									ret := -0.032787
								if( diPlus > 10.5437 )
									ret := 0.857143 // buy
					if( dx > 67.6391 )
						if( dx <= 72.6406 )
							if( adx <= 34.8322 )
								if( dx <= 68.5065 )
									ret := 0.166667
								if( dx > 68.5065 )
									ret := 0.700000 // buy
							if( adx > 34.8322 )
								if( adx <= 45.6225 )
									ret := -0.093333
								if( adx > 45.6225 )
									ret := 0.424837
						if( dx > 72.6406 )
							if( adx <= 32.9362 )
								if( adx <= 29.5638 )
									ret := 1.000000 // buy
								if( adx > 29.5638 )
									ret := 0.750000 // buy
							if( adx > 32.9362 )
								if( diMinus <= 41.4222 )
									ret := 0.875000 // buy
								if( diMinus > 41.4222 )
									ret := -0.232323
		if( dx > 73.7582 )
			if( diMinus <= 66.6483 )
				if( adx <= 68.7027 )
					if( adx <= 62.7127 )
						if( dx <= 79.9783 )
							if( diPlus <= 5.37875 )
								if( dx <= 74.8964 )
									ret := 0.676923
								if( dx > 74.8964 )
									ret := 0.394322
							if( diPlus > 5.37875 )
								if( adx <= 52.4381 )
									ret := 0.263666
								if( adx > 52.4381 )
									ret := -0.222222
						if( dx > 79.9783 )
							if( adx <= 59.0134 )
								if( diPlus <= 3.46579 )
									ret := 0.232727
								if( diPlus > 3.46579 )
									ret := 0.009107
							if( adx > 59.0134 )
								if( diMinus <= 60.5245 )
									ret := 0.505495
								if( diMinus > 60.5245 )
									ret := -1.000000 // sell
					if( adx > 62.7127 )
						if( diMinus <= 42.7731 )
							if( diMinus <= 41.7194 )
								if( diMinus <= 39.4029 )
									ret := 0.193548
								if( diMinus > 39.4029 )
									ret := -0.084746
							if( diMinus > 41.7194 )
								if( diMinus <= 41.9615 )
									ret := 1.000000 // buy
								if( diMinus > 41.9615 )
									ret := 0.454545
						if( diMinus > 42.7731 )
							if( adx <= 67.482 )
								if( diPlus <= 6.3207 )
									ret := -0.267241
								if( diPlus > 6.3207 )
									ret := -0.909091 // sell
							if( adx > 67.482 )
								if( trueRange <= 0 )
									ret := 0.086957
								if( trueRange > 0 )
									ret := 1.000000 // buy
				if( adx > 68.7027 )
					if( diMinus <= 45.9895 )
						if( adx <= 74.3436 )
							if( dx <= 94.8043 )
								if( diMinus <= 42.101 )
									ret := 0.686275
								if( diMinus > 42.101 )
									ret := 0.232558
							if( dx > 94.8043 )
								if( diMinus <= 38.3996 )
									ret := -0.800000 // sell
								if( diMinus > 38.3996 )
									ret := 0.642857
						if( adx > 74.3436 )
							if( adx <= 77.3815 )
								if( diPlus <= 5.34335 )
									ret := -0.128571
								if( diPlus > 5.34335 )
									ret := -0.785714 // sell
							if( adx > 77.3815 )
								if( diPlus <= 2.86981 )
									ret := -0.022222
								if( diPlus > 2.86981 )
									ret := 0.402116
					if( diMinus > 45.9895 )
						if( diMinus <= 58.9477 )
							if( dx <= 79.728 )
								if( adx <= 70.1883 )
									ret := -1.000000 // sell
								if( adx > 70.1883 )
									ret := 0.487179
							if( dx > 79.728 )
								if( dx <= 81.1262 )
									ret := 1.000000 // buy
								if( dx > 81.1262 )
									ret := 0.696970
						if( diMinus > 58.9477 )
							if( trueRange <= 0 )
								if( diMinus <= 62.9965 )
									ret := -0.750000 // sell
								if( diMinus > 62.9965 )
									ret := -1.000000 // sell
							if( trueRange > 0 )
								ret := 1.000000 // buy
			if( diMinus > 66.6483 )
				if( directionalMovementMinus <= 0 )
					ret := 0.714286 // buy
				if( directionalMovementMinus > 0 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_SHIBUSDT_15Min_86d067bb(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)

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


