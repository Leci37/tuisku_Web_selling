//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: PYPL_1Min_1ADX_10bf9092 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1ADX_10bf9092", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_10bf9092(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 0.050131 )
		if( directionalMovementPlus <= 0.099991 )
			if( directionalMovementMinus <= 0.00539 )
				if( diPlus <= 53.3587 )
					if( adx <= 30.4627 )
						if( dx <= 44.6918 )
							if( adx <= 19.5232 )
								if( diPlus <= 48.9785 )
									ret := -0.035221
								if( diPlus > 48.9785 )
									ret := 0.133816
							if( adx > 19.5232 )
								if( trueRange <= 0.170796 )
									ret := 0.036451
								if( trueRange > 0.170796 )
									ret := -0.335366
						if( dx > 44.6918 )
							if( trueRange <= 0.184401 )
								if( dx <= 48.3924 )
									ret := -0.211864
								if( dx > 48.3924 )
									ret := -0.020728
							if( trueRange > 0.184401 )
								if( diMinus <= 52.4122 )
									ret := -0.554054
								if( diMinus > 52.4122 )
									ret := 0.555556
					if( adx > 30.4627 )
						if( trueRange <= 0.331292 )
							if( dx <= 43.0457 )
								if( trueRange <= 0.297796 )
									ret := 0.076446
								if( trueRange > 0.297796 )
									ret := -1.000000 // sell
							if( dx > 43.0457 )
								if( smoothedDirectionalMovementPlus <= 0.075897 )
									ret := 0.008477
								if( smoothedDirectionalMovementPlus > 0.075897 )
									ret := 0.462121
						if( trueRange > 0.331292 )
							if( smoothedTrueRange <= 1.41216 )
								if( diMinus <= 30.4571 )
									ret := 0.888889 // buy
								if( diMinus > 30.4571 )
									ret := 0.350000
							if( smoothedTrueRange > 1.41216 )
								ret := -1.000000 // sell
				if( diPlus > 53.3587 )
					if( trueRange <= 0.040925 )
						if( smoothedDirectionalMovementMinus <= 0.034103 )
							if( diPlus <= 77.6593 )
								if( dx <= 49.3128 )
									ret := 0.019556
								if( dx > 49.3128 )
									ret := -0.235955
							if( diPlus > 77.6593 )
								if( smoothedDirectionalMovementPlus <= 0.019643 )
									ret := -0.250000
								if( smoothedDirectionalMovementPlus > 0.019643 )
									ret := 0.447368
						if( smoothedDirectionalMovementMinus > 0.034103 )
							if( directionalMovementPlus <= 0.030428 )
								if( diPlus <= 57.3148 )
									ret := 0.500000
								if( diPlus > 57.3148 )
									ret := 0.933333 // buy
							if( directionalMovementPlus > 0.030428 )
								ret := 0.000000
					if( trueRange > 0.040925 )
						if( smoothedTrueRange <= 0.07012 )
							if( trueRange <= 0.043495 )
								if( directionalMovementPlus <= 0.041918 )
									ret := -0.941176 // sell
								if( directionalMovementPlus > 0.041918 )
									ret := -0.142857
							if( trueRange > 0.043495 )
								if( diMinus <= 43.6516 )
									ret := -0.191646
								if( diMinus > 43.6516 )
									ret := 0.321429
						if( smoothedTrueRange > 0.07012 )
							if( dx <= 86.1879 )
								if( dx <= 69.5269 )
									ret := -0.459459
								if( dx > 69.5269 )
									ret := 0.414634
							if( dx > 86.1879 )
								if( smoothedTrueRange <= 0.079444 )
									ret := -0.500000
								if( smoothedTrueRange > 0.079444 )
									ret := -0.972222 // sell
			if( directionalMovementMinus > 0.00539 )
				if( directionalMovementPlus <= 1e-06 )
					if( diMinus <= 51.4899 )
						if( dx <= 94.1107 )
							if( smoothedTrueRange <= 0.052586 )
								if( trueRange <= 0.006822 )
									ret := 0.833333 // buy
								if( trueRange > 0.006822 )
									ret := 0.013592
							if( smoothedTrueRange > 0.052586 )
								if( adx <= 18.5371 )
									ret := -0.006675
								if( adx > 18.5371 )
									ret := 0.089660
						if( dx > 94.1107 )
							if( smoothedTrueRange <= 0.052632 )
								if( trueRange <= 0.062236 )
									ret := -0.041667
								if( trueRange > 0.062236 )
									ret := 0.500000
							if( smoothedTrueRange > 0.052632 )
								if( directionalMovementMinus <= 0.015618 )
									ret := -0.227273
								if( directionalMovementMinus > 0.015618 )
									ret := -0.666667
					if( diMinus > 51.4899 )
						if( diPlus <= 11.6534 )
							if( dx <= 78.8448 )
								if( smoothedDirectionalMovementPlus <= 0.006698 )
									ret := -0.235294
								if( smoothedDirectionalMovementPlus > 0.006698 )
									ret := -0.729730 // sell
							if( dx > 78.8448 )
								if( smoothedDirectionalMovementPlus <= 0.005772 )
									ret := 0.006410
								if( smoothedDirectionalMovementPlus > 0.005772 )
									ret := 0.888889 // buy
						if( diPlus > 11.6534 )
							if( smoothedDirectionalMovementPlus <= 0.013608 )
								if( smoothedDirectionalMovementMinus <= 0.021826 )
									ret := 0.081505
								if( smoothedDirectionalMovementMinus > 0.021826 )
									ret := 0.414201
							if( smoothedDirectionalMovementPlus > 0.013608 )
								if( diPlus <= 23.5522 )
									ret := 0.095890
								if( diPlus > 23.5522 )
									ret := 0.437500
				if( directionalMovementPlus > 1e-06 )
					if( adx <= 20.9645 )
						if( directionalMovementMinus <= 0.013546 )
							if( dx <= 3.99438 )
								if( diMinus <= 41.8954 )
									ret := 0.111111
								if( diMinus > 41.8954 )
									ret := 0.826087 // buy
							if( dx > 3.99438 )
								if( adx <= 10.9132 )
									ret := 0.437500
								if( adx > 10.9132 )
									ret := -0.244656
						if( directionalMovementMinus > 0.013546 )
							if( smoothedDirectionalMovementPlus <= 0.020751 )
								if( trueRange <= 0.059756 )
									ret := 0.417722
								if( trueRange > 0.059756 )
									ret := 0.107692
							if( smoothedDirectionalMovementPlus > 0.020751 )
								if( smoothedDirectionalMovementMinus <= 0.044106 )
									ret := -0.027708
								if( smoothedDirectionalMovementMinus > 0.044106 )
									ret := 0.436620
					if( adx > 20.9645 )
						if( diMinus <= 54.3732 )
							if( diMinus <= 27.3916 )
								if( adx <= 35.459 )
									ret := 0.137725
								if( adx > 35.459 )
									ret := 0.268456
							if( diMinus > 27.3916 )
								if( adx <= 28.4878 )
									ret := 0.276316
								if( adx > 28.4878 )
									ret := 0.021110
						if( diMinus > 54.3732 )
							if( adx <= 22.7842 )
								if( directionalMovementPlus <= 0.021881 )
									ret := -1.000000 // sell
								if( directionalMovementPlus > 0.021881 )
									ret := 0.000000
							if( adx > 22.7842 )
								if( smoothedTrueRange <= 0.128145 )
									ret := 0.714286 // buy
								if( smoothedTrueRange > 0.128145 )
									ret := -0.250000
		if( directionalMovementPlus > 0.099991 )
			if( smoothedTrueRange <= 0.158718 )
				if( directionalMovementPlus <= 0.140202 )
					if( trueRange <= 0.129914 )
						if( smoothedDirectionalMovementMinus <= 0.059639 )
							if( adx <= 31.9104 )
								if( diMinus <= 57.8521 )
									ret := -0.394805
								if( diMinus > 57.8521 )
									ret := 0.833333 // buy
							if( adx > 31.9104 )
								if( adx <= 43.6442 )
									ret := -0.008197
								if( adx > 43.6442 )
									ret := -0.310680
						if( smoothedDirectionalMovementMinus > 0.059639 )
							ret := 0.833333 // buy
					if( trueRange > 0.129914 )
						if( trueRange <= 0.24464 )
							if( dx <= 94.1494 )
								if( diPlus <= 67.5091 )
									ret := -0.047486
								if( diPlus > 67.5091 )
									ret := 0.520000
							if( dx > 94.1494 )
								ret := -1.000000 // sell
						if( trueRange > 0.24464 )
							if( directionalMovementPlus <= 0.10021 )
								ret := 0.250000
							if( directionalMovementPlus > 0.10021 )
								if( trueRange <= 0.352474 )
									ret := -0.904762 // sell
								if( trueRange > 0.352474 )
									ret := 0.000000
				if( directionalMovementPlus > 0.140202 )
					if( trueRange <= 0.928126 )
						if( adx <= 8.26943 )
							ret := 1.000000 // buy
						if( adx > 8.26943 )
							if( dx <= 48.724 )
								if( dx <= 2.23206 )
									ret := 0.230769
								if( dx > 2.23206 )
									ret := -0.395901
							if( dx > 48.724 )
								if( adx <= 37.2003 )
									ret := 0.092025
								if( adx > 37.2003 )
									ret := -0.576471
					if( trueRange > 0.928126 )
						ret := 1.000000 // buy
			if( smoothedTrueRange > 0.158718 )
				if( diPlus <= 52.2814 )
					if( dx <= 84.2043 )
						if( diMinus <= 11.8605 )
							if( adx <= 69.9473 )
								if( diPlus <= 38.7377 )
									ret := 0.492308
								if( diPlus > 38.7377 )
									ret := 0.955556 // buy
							if( adx > 69.9473 )
								ret := -1.000000 // sell
						if( diMinus > 11.8605 )
							if( adx <= 66.9885 )
								if( dx <= 70.4522 )
									ret := 0.101149
								if( dx > 70.4522 )
									ret := -0.900000 // sell
							if( adx > 66.9885 )
								if( directionalMovementPlus <= 0.140637 )
									ret := 0.750000 // buy
								if( directionalMovementPlus > 0.140637 )
									ret := 1.000000 // buy
					if( dx > 84.2043 )
						if( trueRange <= 0.164518 )
							ret := -0.500000
						if( trueRange > 0.164518 )
							if( trueRange <= 0.253104 )
								ret := -1.000000 // sell
							if( trueRange > 0.253104 )
								ret := -0.750000 // sell
				if( diPlus > 52.2814 )
					if( smoothedTrueRange <= 0.220093 )
						if( smoothedTrueRange <= 0.162597 )
							ret := -0.250000
						if( smoothedTrueRange > 0.162597 )
							if( directionalMovementPlus <= 0.656199 )
								if( trueRange <= 0.1531 )
									ret := -0.600000
								if( trueRange > 0.1531 )
									ret := -0.965517 // sell
							if( directionalMovementPlus > 0.656199 )
								ret := -0.500000
					if( smoothedTrueRange > 0.220093 )
						if( smoothedTrueRange <= 0.229199 )
							ret := 0.500000
						if( smoothedTrueRange > 0.229199 )
							if( smoothedTrueRange <= 0.239935 )
								ret := -1.000000 // sell
							if( smoothedTrueRange > 0.239935 )
								ret := -0.750000 // sell
	if( directionalMovementMinus > 0.050131 )
		if( diMinus <= 42.9549 )
			if( smoothedDirectionalMovementMinus <= 0.014811 )
				if( smoothedDirectionalMovementPlus <= 0.01905 )
					if( smoothedTrueRange <= 0.04761 )
						if( smoothedDirectionalMovementPlus <= 0.005361 )
							if( diMinus <= 32.7562 )
								if( adx <= 48.4935 )
									ret := -0.105263
								if( adx > 48.4935 )
									ret := 0.500000
							if( diMinus > 32.7562 )
								if( dx <= 49.2447 )
									ret := -0.833333 // sell
								if( dx > 49.2447 )
									ret := -0.277778
						if( smoothedDirectionalMovementPlus > 0.005361 )
							if( diPlus <= 58.176 )
								if( trueRange <= 0.141899 )
									ret := 0.053797
								if( trueRange > 0.141899 )
									ret := 1.000000 // buy
							if( diPlus > 58.176 )
								ret := 1.000000 // buy
					if( smoothedTrueRange > 0.04761 )
						if( dx <= 13.4032 )
							if( directionalMovementMinus <= 0.052575 )
								ret := -1.000000 // sell
							if( directionalMovementMinus > 0.052575 )
								if( diPlus <= 26.9723 )
									ret := -0.186275
								if( diPlus > 26.9723 )
									ret := -0.541667
						if( dx > 13.4032 )
							if( dx <= 15.3527 )
								if( directionalMovementMinus <= 0.0625 )
									ret := 0.750000 // buy
								if( directionalMovementMinus > 0.0625 )
									ret := 0.000000
							if( dx > 15.3527 )
								if( smoothedTrueRange <= 0.048099 )
									ret := -0.750000 // sell
								if( smoothedTrueRange > 0.048099 )
									ret := -0.105882
				if( smoothedDirectionalMovementPlus > 0.01905 )
					if( diMinus <= 14.8769 )
						if( trueRange <= 0.059987 )
							ret := 0.857143 // buy
						if( trueRange > 0.059987 )
							if( trueRange <= 0.090227 )
								if( smoothedDirectionalMovementMinus <= 0.011447 )
									ret := -0.142857
								if( smoothedDirectionalMovementMinus > 0.011447 )
									ret := -0.933333 // sell
							if( trueRange > 0.090227 )
								if( adx <= 68.7269 )
									ret := 0.084967
								if( adx > 68.7269 )
									ret := -0.565217
					if( diMinus > 14.8769 )
						if( adx <= 41.3838 )
							if( diMinus <= 16.2673 )
								if( adx <= 29.3305 )
									ret := 0.933333 // buy
								if( adx > 29.3305 )
									ret := 0.500000
							if( diMinus > 16.2673 )
								if( smoothedTrueRange <= 0.04094 )
									ret := 0.750000 // buy
								if( smoothedTrueRange > 0.04094 )
									ret := 0.183908
						if( adx > 41.3838 )
							if( adx <= 58.0845 )
								if( smoothedDirectionalMovementPlus <= 0.01925 )
									ret := 0.750000 // buy
								if( smoothedDirectionalMovementPlus > 0.01925 )
									ret := -0.314815
							if( adx > 58.0845 )
								if( dx <= 30.7623 )
									ret := -0.250000
								if( dx > 30.7623 )
									ret := 0.666667
			if( smoothedDirectionalMovementMinus > 0.014811 )
				if( smoothedDirectionalMovementMinus <= 0.039785 )
					if( smoothedDirectionalMovementPlus <= 0.069785 )
						if( dx <= 93.7296 )
							if( smoothedDirectionalMovementPlus <= 0.002494 )
								if( dx <= 82.0894 )
									ret := 0.000000
								if( dx > 82.0894 )
									ret := 0.821429 // buy
							if( smoothedDirectionalMovementPlus > 0.002494 )
								if( diPlus <= 20.5398 )
									ret := 0.122164
								if( diPlus > 20.5398 )
									ret := 0.247639
						if( dx > 93.7296 )
							if( trueRange <= 0.1088 )
								if( trueRange <= 0.081593 )
									ret := -0.750000 // sell
								if( trueRange > 0.081593 )
									ret := -1.000000 // sell
							if( trueRange > 0.1088 )
								ret := 0.000000
					if( smoothedDirectionalMovementPlus > 0.069785 )
						if( trueRange <= 0.11495 )
							if( trueRange <= 0.078464 )
								if( smoothedDirectionalMovementMinus <= 0.022391 )
									ret := 0.750000 // buy
								if( smoothedDirectionalMovementMinus > 0.022391 )
									ret := 1.000000 // buy
							if( trueRange > 0.078464 )
								ret := 0.200000
						if( trueRange > 0.11495 )
							if( adx <= 32.9384 )
								if( trueRange <= 0.321312 )
									ret := -0.950000 // sell
								if( trueRange > 0.321312 )
									ret := -0.500000
							if( adx > 32.9384 )
								if( adx <= 40.5612 )
									ret := 0.555556
								if( adx > 40.5612 )
									ret := -0.550000
				if( smoothedDirectionalMovementMinus > 0.039785 )
					if( adx <= 23.4551 )
						if( adx <= 18.608 )
							if( dx <= 38.7019 )
								if( trueRange <= 0.07428 )
									ret := 0.785714 // buy
								if( trueRange > 0.07428 )
									ret := 0.066986
							if( dx > 38.7019 )
								if( smoothedTrueRange <= 0.143031 )
									ret := 0.000000
								if( smoothedTrueRange > 0.143031 )
									ret := -0.866667 // sell
						if( adx > 18.608 )
							if( directionalMovementMinus <= 0.12003 )
								if( dx <= 42.5863 )
									ret := -0.065217
								if( dx > 42.5863 )
									ret := -0.823529 // sell
							if( directionalMovementMinus > 0.12003 )
								if( smoothedTrueRange <= 0.121992 )
									ret := 0.200000
								if( smoothedTrueRange > 0.121992 )
									ret := -0.789474 // sell
					if( adx > 23.4551 )
						if( smoothedDirectionalMovementPlus <= 0.042004 )
							if( dx <= 66.3756 )
								if( dx <= 64.4023 )
									ret := 0.006329
								if( dx > 64.4023 )
									ret := -0.700000 // sell
							if( dx > 66.3756 )
								if( smoothedTrueRange <= 0.69685 )
									ret := 0.484127
								if( smoothedTrueRange > 0.69685 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementPlus > 0.042004 )
							if( diMinus <= 19.9085 )
								if( dx <= 38.4916 )
									ret := -0.692308
								if( dx > 38.4916 )
									ret := 0.647059
							if( diMinus > 19.9085 )
								if( trueRange <= 0.391979 )
									ret := 0.590000
								if( trueRange > 0.391979 )
									ret := 0.206349
		if( diMinus > 42.9549 )
			if( diPlus <= 22.291 )
				if( adx <= 50.3201 )
					if( diPlus <= 20.1633 )
						if( directionalMovementMinus <= 0.1067 )
							if( smoothedDirectionalMovementMinus <= 0.040093 )
								if( diMinus <= 43.4053 )
									ret := 0.800000 // buy
								if( diMinus > 43.4053 )
									ret := 0.015504
							if( smoothedDirectionalMovementMinus > 0.040093 )
								if( dx <= 55.9801 )
									ret := -0.040816
								if( dx > 55.9801 )
									ret := 0.407643
						if( directionalMovementMinus > 0.1067 )
							if( smoothedTrueRange <= 0.382113 )
								if( diMinus <= 80.5571 )
									ret := 0.468657
								if( diMinus > 80.5571 )
									ret := -0.068966
							if( smoothedTrueRange > 0.382113 )
								ret := -1.000000 // sell
					if( diPlus > 20.1633 )
						if( smoothedDirectionalMovementMinus <= 0.073415 )
							if( smoothedDirectionalMovementMinus <= 0.037021 )
								if( trueRange <= 0.122987 )
									ret := 0.000000
								if( trueRange > 0.122987 )
									ret := 0.727273 // buy
							if( smoothedDirectionalMovementMinus > 0.037021 )
								if( adx <= 40.2524 )
									ret := -0.560606
								if( adx > 40.2524 )
									ret := 1.000000 // buy
						if( smoothedDirectionalMovementMinus > 0.073415 )
							if( smoothedDirectionalMovementPlus <= 0.036546 )
								if( smoothedTrueRange <= 0.123812 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 0.123812 )
									ret := 0.400000
							if( smoothedDirectionalMovementPlus > 0.036546 )
								ret := 1.000000 // buy
				if( adx > 50.3201 )
					if( smoothedTrueRange <= 0.306827 )
						if( dx <= 93.8523 )
							if( adx <= 76.7915 )
								if( diMinus <= 63.9161 )
									ret := 0.082840
								if( diMinus > 63.9161 )
									ret := -0.431818
							if( adx > 76.7915 )
								if( smoothedTrueRange <= 0.079593 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 0.079593 )
									ret := 0.000000
						if( dx > 93.8523 )
							if( dx <= 97.8781 )
								if( diMinus <= 90.1937 )
									ret := -0.727273 // sell
								if( diMinus > 90.1937 )
									ret := 0.500000
							if( dx > 97.8781 )
								ret := 0.285714
					if( smoothedTrueRange > 0.306827 )
						ret := 1.000000 // buy
			if( diPlus > 22.291 )
				if( adx <= 12.9882 )
					if( smoothedTrueRange <= 0.052859 )
						if( diMinus <= 59.412 )
							if( diMinus <= 43.8558 )
								ret := -0.666667
							if( diMinus > 43.8558 )
								if( adx <= 9.55085 )
									ret := 0.708333 // buy
								if( adx > 9.55085 )
									ret := 0.145161
						if( diMinus > 59.412 )
							if( directionalMovementPlus <= 3.6e-05 )
								if( diMinus <= 62.7302 )
									ret := -0.806452 // sell
								if( diMinus > 62.7302 )
									ret := 0.500000
							if( directionalMovementPlus > 3.6e-05 )
								ret := 0.500000
					if( smoothedTrueRange > 0.052859 )
						if( trueRange <= 0.060441 )
							if( smoothedTrueRange <= 0.059374 )
								ret := 0.600000
							if( smoothedTrueRange > 0.059374 )
								if( adx <= 11.7075 )
									ret := -0.153846
								if( adx > 11.7075 )
									ret := -1.000000 // sell
						if( trueRange > 0.060441 )
							if( diPlus <= 48.7497 )
								if( adx <= 10.6813 )
									ret := 0.661157
								if( adx > 10.6813 )
									ret := 0.368421
							if( diPlus > 48.7497 )
								if( diMinus <= 45.2945 )
									ret := 0.900000 // buy
								if( diMinus > 45.2945 )
									ret := -0.416667
				if( adx > 12.9882 )
					if( dx <= 2.38903 )
						if( smoothedTrueRange <= 0.072227 )
							if( directionalMovementPlus <= 0.00333 )
								if( directionalMovementPlus <= 1.5e-05 )
									ret := -0.022222
								if( directionalMovementPlus > 1.5e-05 )
									ret := 1.000000 // buy
							if( directionalMovementPlus > 0.00333 )
								if( diPlus <= 47.6247 )
									ret := -0.500000
								if( diPlus > 47.6247 )
									ret := -1.000000 // sell
						if( smoothedTrueRange > 0.072227 )
							if( directionalMovementMinus <= 0.12897 )
								if( smoothedTrueRange <= 0.088968 )
									ret := 0.500000
								if( smoothedTrueRange > 0.088968 )
									ret := 1.000000 // buy
							if( directionalMovementMinus > 0.12897 )
								ret := 0.000000
					if( dx > 2.38903 )
						if( diMinus <= 50.2716 )
							if( dx <= 4.99738 )
								if( directionalMovementPlus <= 0.04506 )
									ret := 0.768519 // buy
								if( directionalMovementPlus > 0.04506 )
									ret := -0.200000
							if( dx > 4.99738 )
								if( diMinus <= 47.6127 )
									ret := 0.451163
								if( diMinus > 47.6127 )
									ret := 0.078571
						if( diMinus > 50.2716 )
							if( diMinus <= 53.4865 )
								if( adx <= 43.7997 )
									ret := 0.786765 // buy
								if( adx > 43.7997 )
									ret := 0.000000
							if( diMinus > 53.4865 )
								if( adx <= 48.4197 )
									ret := 0.505666
								if( adx > 48.4197 )
									ret := -0.151515
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_10bf9092(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


