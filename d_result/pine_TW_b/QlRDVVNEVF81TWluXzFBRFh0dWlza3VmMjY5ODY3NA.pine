//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: BTCUSDT_5Min_1ADX_f2698674 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_5Min_1ADX_f2698674", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_5Min_f2698674(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 20.4503 )
		if( smoothedDirectionalMovementMinus <= 74.2089 )
			if( diPlus <= 47.7586 )
				if( diMinus <= 15.5579 )
					if( smoothedTrueRange <= 84.0229 )
						if( smoothedDirectionalMovementMinus <= 3.95817 )
							if( directionalMovementPlus <= 121.93 )
								if( smoothedTrueRange <= 23.2388 )
									ret := 0.093079
								if( smoothedTrueRange > 23.2388 )
									ret := -0.057277
							if( directionalMovementPlus > 121.93 )
								if( smoothedTrueRange <= 71.709 )
									ret := 0.923077 // buy
								if( smoothedTrueRange > 71.709 )
									ret := 0.000000
						if( smoothedDirectionalMovementMinus > 3.95817 )
							if( adx <= 68.0334 )
								if( trueRange <= 125.4 )
									ret := 0.074558
								if( trueRange > 125.4 )
									ret := -0.176056
							if( adx > 68.0334 )
								if( dx <= 37.5209 )
									ret := -0.424242
								if( dx > 37.5209 )
									ret := 0.476793
					if( smoothedTrueRange > 84.0229 )
						if( smoothedTrueRange <= 306.894 )
							if( dx <= 95.7539 )
								if( directionalMovementMinus <= 1.57923 )
									ret := -0.084196
								if( directionalMovementMinus > 1.57923 )
									ret := 0.040140
							if( dx > 95.7539 )
								if( smoothedDirectionalMovementPlus <= 52.0721 )
									ret := -0.314286
								if( smoothedDirectionalMovementPlus > 52.0721 )
									ret := 0.521277
						if( smoothedTrueRange > 306.894 )
							if( smoothedDirectionalMovementMinus <= 38.6379 )
								if( smoothedTrueRange <= 401.066 )
									ret := 0.637821
								if( smoothedTrueRange > 401.066 )
									ret := -0.400000
							if( smoothedDirectionalMovementMinus > 38.6379 )
								if( smoothedDirectionalMovementPlus <= 160.304 )
									ret := -0.103627
								if( smoothedDirectionalMovementPlus > 160.304 )
									ret := -0.676923
				if( diMinus > 15.5579 )
					if( smoothedDirectionalMovementPlus <= 69.3346 )
						if( adx <= 31.656 )
							if( smoothedTrueRange <= 59.6606 )
								if( trueRange <= 88.565 )
									ret := 0.025047
								if( trueRange > 88.565 )
									ret := 0.188011
							if( smoothedTrueRange > 59.6606 )
								if( smoothedDirectionalMovementMinus <= 11.2501 )
									ret := 0.352151
								if( smoothedDirectionalMovementMinus > 11.2501 )
									ret := 0.072080
						if( adx > 31.656 )
							if( diMinus <= 47.2865 )
								if( smoothedDirectionalMovementMinus <= 53.0357 )
									ret := 0.016765
								if( smoothedDirectionalMovementMinus > 53.0357 )
									ret := 0.099242
							if( diMinus > 47.2865 )
								if( adx <= 80.4981 )
									ret := -0.095588
								if( adx > 80.4981 )
									ret := 0.418182
					if( smoothedDirectionalMovementPlus > 69.3346 )
						if( diPlus <= 25.0415 )
							if( smoothedDirectionalMovementMinus <= 65.7833 )
								if( directionalMovementPlus <= 4.88052 )
									ret := -0.416667
								if( directionalMovementPlus > 4.88052 )
									ret := 0.714286 // buy
							if( smoothedDirectionalMovementMinus > 65.7833 )
								if( directionalMovementPlus <= 217.945 )
									ret := 0.023810
								if( directionalMovementPlus > 217.945 )
									ret := -1.000000 // sell
						if( diPlus > 25.0415 )
							if( directionalMovementPlus <= 289.781 )
								if( smoothedDirectionalMovementMinus <= 70.5003 )
									ret := -0.301676
								if( smoothedDirectionalMovementMinus > 70.5003 )
									ret := 0.320000
							if( directionalMovementPlus > 289.781 )
								if( diPlus <= 40.2574 )
									ret := -0.018349
								if( diPlus > 40.2574 )
									ret := 0.647059
			if( diPlus > 47.7586 )
				if( directionalMovementPlus <= 44.0072 )
					if( smoothedTrueRange <= 14.3857 )
						if( dx <= 65.2154 )
							if( diPlus <= 49.3153 )
								if( dx <= 33.2803 )
									ret := -0.029412
								if( dx > 33.2803 )
									ret := 0.067797
							if( diPlus > 49.3153 )
								if( adx <= 17.9756 )
									ret := -0.045455
								if( adx > 17.9756 )
									ret := 0.002132
						if( dx > 65.2154 )
							if( adx <= 38.9891 )
								if( smoothedDirectionalMovementMinus <= 0.694571 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.694571 )
									ret := 0.421053
							if( adx > 38.9891 )
								if( trueRange <= 14.341 )
									ret := -0.015385
								if( trueRange > 14.341 )
									ret := 0.093750
					if( smoothedTrueRange > 14.3857 )
						if( diPlus <= 54.9596 )
							if( trueRange <= 300.302 )
								if( dx <= 92.8568 )
									ret := 0.215290
								if( dx > 92.8568 )
									ret := 0.543689
							if( trueRange > 300.302 )
								if( dx <= 90.5559 )
									ret := 1.000000 // buy
								if( dx > 90.5559 )
									ret := 0.500000
						if( diPlus > 54.9596 )
							if( smoothedDirectionalMovementMinus <= 13.9334 )
								if( smoothedTrueRange <= 251.816 )
									ret := 0.089109
								if( smoothedTrueRange > 251.816 )
									ret := -0.833333 // sell
							if( smoothedDirectionalMovementMinus > 13.9334 )
								ret := 1.000000 // buy
				if( directionalMovementPlus > 44.0072 )
					if( trueRange <= 322.125 )
						if( diMinus <= 8.28317 )
							if( smoothedTrueRange <= 200.474 )
								if( smoothedDirectionalMovementPlus <= 54.3163 )
									ret := -0.200828
								if( smoothedDirectionalMovementPlus > 54.3163 )
									ret := 0.128134
							if( smoothedTrueRange > 200.474 )
								if( adx <= 51.6327 )
									ret := 0.117647
								if( adx > 51.6327 )
									ret := -0.676471
						if( diMinus > 8.28317 )
							if( adx <= 34.572 )
								if( trueRange <= 305.18 )
									ret := 0.291667
								if( trueRange > 305.18 )
									ret := -0.714286 // sell
							if( adx > 34.572 )
								if( adx <= 53.44 )
									ret := -0.058511
								if( adx > 53.44 )
									ret := 0.338235
					if( trueRange > 322.125 )
						if( smoothedDirectionalMovementMinus <= 12.1179 )
							if( adx <= 50.1695 )
								if( trueRange <= 457.139 )
									ret := 0.390244
								if( trueRange > 457.139 )
									ret := -0.354167
							if( adx > 50.1695 )
								if( diMinus <= 1.16365 )
									ret := 0.300000
								if( diMinus > 1.16365 )
									ret := 0.773333 // buy
						if( smoothedDirectionalMovementMinus > 12.1179 )
							if( adx <= 49.5784 )
								if( diMinus <= 6.67291 )
									ret := -0.687500
								if( diMinus > 6.67291 )
									ret := 0.207547
							if( adx > 49.5784 )
								if( trueRange <= 392.784 )
									ret := -1.000000 // sell
								if( trueRange > 392.784 )
									ret := -0.444444
		if( smoothedDirectionalMovementMinus > 74.2089 )
			if( diPlus <= 14.289 )
				if( smoothedDirectionalMovementPlus <= 20.4314 )
					if( smoothedDirectionalMovementMinus <= 78.1971 )
						if( diMinus <= 34.5067 )
							if( adx <= 41.574 )
								ret := 0.500000
							if( adx > 41.574 )
								if( adx <= 66.1679 )
									ret := -0.818182 // sell
								if( adx > 66.1679 )
									ret := 0.000000
						if( diMinus > 34.5067 )
							if( smoothedTrueRange <= 142.438 )
								ret := -0.833333 // sell
							if( smoothedTrueRange > 142.438 )
								if( dx <= 64.9598 )
									ret := 0.312500
								if( dx > 64.9598 )
									ret := 0.728395 // buy
					if( smoothedDirectionalMovementMinus > 78.1971 )
						if( smoothedTrueRange <= 180.842 )
							if( diMinus <= 53.23 )
								if( dx <= 71.4298 )
									ret := 0.000000
								if( dx > 71.4298 )
									ret := 0.931818 // buy
							if( diMinus > 53.23 )
								if( adx <= 69.177 )
									ret := 0.400000
								if( adx > 69.177 )
									ret := -0.833333 // sell
						if( smoothedTrueRange > 180.842 )
							if( smoothedDirectionalMovementMinus <= 94.0593 )
								if( adx <= 39.862 )
									ret := 0.736842 // buy
								if( adx > 39.862 )
									ret := -0.346667
							if( smoothedDirectionalMovementMinus > 94.0593 )
								if( directionalMovementMinus <= 0.903141 )
									ret := 0.234742
								if( directionalMovementMinus > 0.903141 )
									ret := -0.179688
				if( smoothedDirectionalMovementPlus > 20.4314 )
					if( diMinus <= 45.4744 )
						if( trueRange <= 425.571 )
							if( adx <= 30.4577 )
								if( trueRange <= 234.861 )
									ret := 0.268293
								if( trueRange > 234.861 )
									ret := -0.617021
							if( adx > 30.4577 )
								if( diMinus <= 25.925 )
									ret := 0.808511 // buy
								if( diMinus > 25.925 )
									ret := 0.298561
						if( trueRange > 425.571 )
							if( diPlus <= 5.25921 )
								ret := 1.000000 // buy
							if( diPlus > 5.25921 )
								if( smoothedDirectionalMovementMinus <= 160.913 )
									ret := -0.419048
								if( smoothedDirectionalMovementMinus > 160.913 )
									ret := 0.132867
					if( diMinus > 45.4744 )
						if( smoothedDirectionalMovementPlus <= 22.9305 )
							if( smoothedTrueRange <= 406.534 )
								if( trueRange <= 207.34 )
									ret := -0.400000
								if( trueRange > 207.34 )
									ret := 0.800000 // buy
							if( smoothedTrueRange > 406.534 )
								ret := -0.800000 // sell
						if( smoothedDirectionalMovementPlus > 22.9305 )
							if( diPlus <= 5.01452 )
								ret := 0.000000
							if( diPlus > 5.01452 )
								if( trueRange <= 119.954 )
									ret := 0.000000
								if( trueRange > 119.954 )
									ret := 0.839080 // buy
			if( diPlus > 14.289 )
				if( smoothedDirectionalMovementMinus <= 98.3296 )
					if( trueRange <= 316.236 )
						if( smoothedDirectionalMovementPlus <= 71.632 )
							if( directionalMovementMinus <= 0.426409 )
								if( dx <= 14.2213 )
									ret := -0.326531
								if( dx > 14.2213 )
									ret := 0.231250
							if( directionalMovementMinus > 0.426409 )
								if( smoothedDirectionalMovementMinus <= 91.7769 )
									ret := -0.612903
								if( smoothedDirectionalMovementMinus > 91.7769 )
									ret := 0.200000
						if( smoothedDirectionalMovementPlus > 71.632 )
							if( dx <= 8.09511 )
								if( smoothedDirectionalMovementMinus <= 92.0718 )
									ret := 0.811321 // buy
								if( smoothedDirectionalMovementMinus > 92.0718 )
									ret := 0.000000
							if( dx > 8.09511 )
								if( smoothedDirectionalMovementPlus <= 100.487 )
									ret := 0.138889
								if( smoothedDirectionalMovementPlus > 100.487 )
									ret := 0.611111
					if( trueRange > 316.236 )
						if( trueRange <= 376.938 )
							if( trueRange <= 337.865 )
								if( diPlus <= 19.7207 )
									ret := -0.476190
								if( diPlus > 19.7207 )
									ret := 0.727273 // buy
							if( trueRange > 337.865 )
								if( smoothedDirectionalMovementPlus <= 42.6489 )
									ret := 0.250000
								if( smoothedDirectionalMovementPlus > 42.6489 )
									ret := -0.820513 // sell
						if( trueRange > 376.938 )
							if( smoothedTrueRange <= 313.308 )
								if( adx <= 52.2635 )
									ret := -0.444444
								if( adx > 52.2635 )
									ret := 0.444444
							if( smoothedTrueRange > 313.308 )
								if( smoothedTrueRange <= 417.966 )
									ret := 0.636364
								if( smoothedTrueRange > 417.966 )
									ret := -0.142857
				if( smoothedDirectionalMovementMinus > 98.3296 )
					if( smoothedTrueRange <= 554.677 )
						if( adx <= 34.2385 )
							if( directionalMovementMinus <= 0.10917 )
								if( smoothedTrueRange <= 467.095 )
									ret := -0.519481
								if( smoothedTrueRange > 467.095 )
									ret := -0.866667 // sell
							if( directionalMovementMinus > 0.10917 )
								if( diPlus <= 19.6025 )
									ret := 1.000000 // buy
								if( diPlus > 19.6025 )
									ret := 0.000000
						if( adx > 34.2385 )
							if( diPlus <= 20.8486 )
								if( adx <= 62.0458 )
									ret := -0.260700
								if( adx > 62.0458 )
									ret := 0.500000
							if( diPlus > 20.8486 )
								if( smoothedTrueRange <= 490.702 )
									ret := 0.512500
								if( smoothedTrueRange > 490.702 )
									ret := -0.545455
					if( smoothedTrueRange > 554.677 )
						if( diPlus <= 16.8174 )
							if( smoothedDirectionalMovementPlus <= 101.236 )
								if( trueRange <= 300.818 )
									ret := 0.000000
								if( trueRange > 300.818 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementPlus > 101.236 )
								if( smoothedTrueRange <= 813.073 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 813.073 )
									ret := 0.142857
						if( diPlus > 16.8174 )
							if( smoothedTrueRange <= 915.412 )
								if( dx <= 29.9196 )
									ret := 0.666667
								if( dx > 29.9196 )
									ret := 1.000000 // buy
							if( smoothedTrueRange > 915.412 )
								if( dx <= 23.5504 )
									ret := -1.000000 // sell
								if( dx > 23.5504 )
									ret := 0.000000
	if( directionalMovementMinus > 20.4503 )
		if( diPlus <= 8.17559 )
			if( smoothedTrueRange <= 250.223 )
				if( smoothedTrueRange <= 166.295 )
					if( smoothedTrueRange <= 62.7491 )
						if( directionalMovementMinus <= 48.3838 )
							if( diPlus <= 5.46425 )
								if( trueRange <= 68.8032 )
									ret := -0.226415
								if( trueRange > 68.8032 )
									ret := 0.142857
							if( diPlus > 5.46425 )
								if( adx <= 37.558 )
									ret := 0.265957
								if( adx > 37.558 )
									ret := -0.051724
						if( directionalMovementMinus > 48.3838 )
							if( diPlus <= 5.66169 )
								if( diMinus <= 47.4071 )
									ret := 0.617647
								if( diMinus > 47.4071 )
									ret := 0.175000
							if( diPlus > 5.66169 )
								if( directionalMovementMinus <= 163.101 )
									ret := 0.059172
								if( directionalMovementMinus > 163.101 )
									ret := -0.777778 // sell
					if( smoothedTrueRange > 62.7491 )
						if( directionalMovementMinus <= 469.78 )
							if( trueRange <= 481.083 )
								if( directionalMovementMinus <= 284.346 )
									ret := 0.225094
								if( directionalMovementMinus > 284.346 )
									ret := 0.607477
							if( trueRange > 481.083 )
								if( smoothedDirectionalMovementMinus <= 72.0861 )
									ret := -0.750000 // sell
								if( smoothedDirectionalMovementMinus > 72.0861 )
									ret := -0.916667 // sell
						if( directionalMovementMinus > 469.78 )
							if( smoothedDirectionalMovementPlus <= 6.52161 )
								if( smoothedDirectionalMovementMinus <= 67.1223 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementMinus > 67.1223 )
									ret := 0.000000
							if( smoothedDirectionalMovementPlus > 6.52161 )
								if( smoothedDirectionalMovementPlus <= 10.7443 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 10.7443 )
									ret := 0.750000 // buy
				if( smoothedTrueRange > 166.295 )
					if( adx <= 54.5858 )
						if( directionalMovementMinus <= 96.85 )
							if( smoothedDirectionalMovementMinus <= 59.323 )
								if( diPlus <= 8.01316 )
									ret := -0.062500
								if( diPlus > 8.01316 )
									ret := 0.666667
							if( smoothedDirectionalMovementMinus > 59.323 )
								if( trueRange <= 116.905 )
									ret := 0.857143 // buy
								if( trueRange > 116.905 )
									ret := -0.596899
						if( directionalMovementMinus > 96.85 )
							if( smoothedTrueRange <= 172.541 )
								if( smoothedDirectionalMovementPlus <= 11.751 )
									ret := -0.269231
								if( smoothedDirectionalMovementPlus > 11.751 )
									ret := -1.000000 // sell
							if( smoothedTrueRange > 172.541 )
								if( adx <= 35.5701 )
									ret := 0.521739
								if( adx > 35.5701 )
									ret := -0.032787
					if( adx > 54.5858 )
						if( trueRange <= 511.868 )
							if( dx <= 78.1058 )
								if( trueRange <= 330.362 )
									ret := -0.038462
								if( trueRange > 330.362 )
									ret := 0.727273 // buy
							if( dx > 78.1058 )
								if( smoothedDirectionalMovementMinus <= 118.939 )
									ret := 0.515385
								if( smoothedDirectionalMovementMinus > 118.939 )
									ret := -0.888889 // sell
						if( trueRange > 511.868 )
							if( diPlus <= 1.54391 )
								ret := 1.000000 // buy
							if( diPlus > 1.54391 )
								if( adx <= 58.3638 )
									ret := 0.400000
								if( adx > 58.3638 )
									ret := -1.000000 // sell
			if( smoothedTrueRange > 250.223 )
				if( directionalMovementMinus <= 49.5421 )
					if( smoothedTrueRange <= 268.729 )
						if( smoothedTrueRange <= 254.665 )
							ret := 1.000000 // buy
						if( smoothedTrueRange > 254.665 )
							ret := 0.666667
					if( smoothedTrueRange > 268.729 )
						if( diPlus <= 6.79582 )
							if( trueRange <= 197.972 )
								if( adx <= 74.6508 )
									ret := -1.000000 // sell
								if( adx > 74.6508 )
									ret := -0.200000
							if( trueRange > 197.972 )
								if( adx <= 49.7347 )
									ret := 0.375000
								if( adx > 49.7347 )
									ret := -0.529412
						if( diPlus > 6.79582 )
							if( diMinus <= 36.7333 )
								if( adx <= 74.5416 )
									ret := -1.000000 // sell
								if( adx > 74.5416 )
									ret := 0.500000
							if( diMinus > 36.7333 )
								if( trueRange <= 295.965 )
									ret := 0.285714
								if( trueRange > 295.965 )
									ret := 1.000000 // buy
				if( directionalMovementMinus > 49.5421 )
					if( diMinus <= 43.0052 )
						if( smoothedDirectionalMovementPlus <= 31.9082 )
							if( adx <= 41.2116 )
								if( trueRange <= 302.712 )
									ret := -0.357143
								if( trueRange > 302.712 )
									ret := 0.243902
							if( adx > 41.2116 )
								if( trueRange <= 275.785 )
									ret := 0.489583
								if( trueRange > 275.785 )
									ret := 0.779221 // buy
						if( smoothedDirectionalMovementPlus > 31.9082 )
							if( trueRange <= 622.85 )
								if( trueRange <= 327.678 )
									ret := 1.000000 // buy
								if( trueRange > 327.678 )
									ret := -0.657143
							if( trueRange > 622.85 )
								if( dx <= 67.023 )
									ret := 0.750000 // buy
								if( dx > 67.023 )
									ret := 1.000000 // buy
					if( diMinus > 43.0052 )
						if( directionalMovementMinus <= 1375.3 )
							if( smoothedDirectionalMovementMinus <= 272.543 )
								if( diMinus <= 59.3728 )
									ret := 0.096774
								if( diMinus > 59.3728 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 272.543 )
								if( adx <= 58.0175 )
									ret := -1.000000 // sell
								if( adx > 58.0175 )
									ret := 0.939394 // buy
						if( directionalMovementMinus > 1375.3 )
							ret := 1.000000 // buy
		if( diPlus > 8.17559 )
			if( smoothedDirectionalMovementPlus <= 33.5529 )
				if( trueRange <= 412.013 )
					if( diPlus <= 9.08475 )
						if( smoothedTrueRange <= 287.389 )
							if( smoothedDirectionalMovementMinus <= 74.8323 )
								if( directionalMovementMinus <= 280.9 )
									ret := -0.013636
								if( directionalMovementMinus > 280.9 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 74.8323 )
								if( diMinus <= 48.4825 )
									ret := -0.547619
								if( diMinus > 48.4825 )
									ret := 0.428571
						if( smoothedTrueRange > 287.389 )
							if( adx <= 73.466 )
								if( diMinus <= 34.182 )
									ret := -0.285714
								if( diMinus > 34.182 )
									ret := 0.750000 // buy
							if( adx > 73.466 )
								ret := -1.000000 // sell
					if( diPlus > 9.08475 )
						if( smoothedDirectionalMovementMinus <= 20.5055 )
							if( adx <= 29.3641 )
								if( directionalMovementMinus <= 37.4808 )
									ret := 0.067656
								if( directionalMovementMinus > 37.4808 )
									ret := -0.045485
							if( adx > 29.3641 )
								if( dx <= 45.9028 )
									ret := 0.082868
								if( dx > 45.9028 )
									ret := 0.187055
						if( smoothedDirectionalMovementMinus > 20.5055 )
							if( directionalMovementMinus <= 66.751 )
								if( trueRange <= 165.032 )
									ret := 0.147599
								if( trueRange > 165.032 )
									ret := 0.336957
							if( directionalMovementMinus > 66.751 )
								if( smoothedTrueRange <= 109.094 )
									ret := 0.165141
								if( smoothedTrueRange > 109.094 )
									ret := 0.025635
				if( trueRange > 412.013 )
					if( trueRange <= 446.131 )
						if( adx <= 15.3106 )
							ret := -0.500000
						if( adx > 15.3106 )
							if( diPlus <= 8.39761 )
								ret := -0.250000
							if( diPlus > 8.39761 )
								if( directionalMovementMinus <= 308.913 )
									ret := 0.980769 // buy
								if( directionalMovementMinus > 308.913 )
									ret := 0.619048
					if( trueRange > 446.131 )
						if( trueRange <= 543.797 )
							if( diMinus <= 35.0453 )
								if( dx <= 33.7337 )
									ret := 1.000000 // buy
								if( dx > 33.7337 )
									ret := 0.187500
							if( diMinus > 35.0453 )
								if( smoothedDirectionalMovementPlus <= 10.6136 )
									ret := 0.500000
								if( smoothedDirectionalMovementPlus > 10.6136 )
									ret := -0.615385
						if( trueRange > 543.797 )
							if( directionalMovementMinus <= 617.572 )
								if( adx <= 44.1863 )
									ret := 0.819277 // buy
								if( adx > 44.1863 )
									ret := 0.136364
							if( directionalMovementMinus > 617.572 )
								if( smoothedTrueRange <= 228.659 )
									ret := -0.636364
								if( smoothedTrueRange > 228.659 )
									ret := 0.681818
			if( smoothedDirectionalMovementPlus > 33.5529 )
				if( trueRange <= 86.3862 )
					if( smoothedTrueRange <= 97.863 )
						if( adx <= 51.6019 )
							if( smoothedDirectionalMovementMinus <= 9.12964 )
								if( adx <= 47.3333 )
									ret := 0.769231 // buy
								if( adx > 47.3333 )
									ret := 0.000000
							if( smoothedDirectionalMovementMinus > 9.12964 )
								if( directionalMovementMinus <= 38.1332 )
									ret := -0.533333
								if( directionalMovementMinus > 38.1332 )
									ret := 0.354839
						if( adx > 51.6019 )
							if( diMinus <= 8.8229 )
								if( smoothedTrueRange <= 91.29 )
									ret := 0.333333
								if( smoothedTrueRange > 91.29 )
									ret := -0.750000 // sell
							if( diMinus > 8.8229 )
								if( directionalMovementMinus <= 47.43 )
									ret := -0.516129
								if( directionalMovementMinus > 47.43 )
									ret := -0.933333 // sell
					if( smoothedTrueRange > 97.863 )
						if( dx <= 26.2446 )
							if( trueRange <= 77.05 )
								if( smoothedTrueRange <= 164.494 )
									ret := 0.000000
								if( smoothedTrueRange > 164.494 )
									ret := -0.730769 // sell
							if( trueRange > 77.05 )
								if( smoothedDirectionalMovementPlus <= 40.7539 )
									ret := 0.684211
								if( smoothedDirectionalMovementPlus > 40.7539 )
									ret := -0.307692
						if( dx > 26.2446 )
							if( dx <= 73.8365 )
								if( diPlus <= 35.6356 )
									ret := 0.294606
								if( diPlus > 35.6356 )
									ret := 0.566502
							if( dx > 73.8365 )
								if( smoothedTrueRange <= 105.417 )
									ret := 0.800000 // buy
								if( smoothedTrueRange > 105.417 )
									ret := -0.272727
				if( trueRange > 86.3862 )
					if( dx <= 7.58257 )
						if( trueRange <= 112.586 )
							if( smoothedDirectionalMovementMinus <= 47.1785 )
								if( smoothedTrueRange <= 177.377 )
									ret := 0.577465
								if( smoothedTrueRange > 177.377 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementMinus > 47.1785 )
								if( directionalMovementMinus <= 47.675 )
									ret := -0.777778 // sell
								if( directionalMovementMinus > 47.675 )
									ret := 0.571429
						if( trueRange > 112.586 )
							if( smoothedDirectionalMovementPlus <= 40.9317 )
								if( diPlus <= 18.8559 )
									ret := 0.388889
								if( diPlus > 18.8559 )
									ret := -0.165354
							if( smoothedDirectionalMovementPlus > 40.9317 )
								if( smoothedDirectionalMovementPlus <= 84.5004 )
									ret := 0.264122
								if( smoothedDirectionalMovementPlus > 84.5004 )
									ret := -0.393939
					if( dx > 7.58257 )
						if( smoothedDirectionalMovementMinus <= 127.665 )
							if( smoothedDirectionalMovementPlus <= 119.74 )
								if( smoothedTrueRange <= 110.299 )
									ret := 0.180180
								if( smoothedTrueRange > 110.299 )
									ret := -0.036672
							if( smoothedDirectionalMovementPlus > 119.74 )
								if( smoothedDirectionalMovementMinus <= 19.4114 )
									ret := 0.758621 // buy
								if( smoothedDirectionalMovementMinus > 19.4114 )
									ret := 0.181347
						if( smoothedDirectionalMovementMinus > 127.665 )
							if( smoothedDirectionalMovementMinus <= 218.886 )
								if( trueRange <= 208.71 )
									ret := -0.400000
								if( trueRange > 208.71 )
									ret := 0.475248
							if( smoothedDirectionalMovementMinus > 218.886 )
								if( trueRange <= 641.602 )
									ret := -0.425532
								if( trueRange > 641.602 )
									ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_BTCUSDT_5Min_f2698674(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


