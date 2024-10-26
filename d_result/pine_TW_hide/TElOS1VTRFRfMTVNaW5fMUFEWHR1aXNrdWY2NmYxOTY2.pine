//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: LINKUSDT_15Min_1ADX_f66f1966 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1ADX_f66f1966", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_f66f1966(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 0.014025 )
		if( smoothedDirectionalMovementMinus <= 0.012216 )
			if( diPlus <= 36.2095 )
				if( trueRange <= 0.112262 )
					if( diMinus <= 5.3092 )
						if( smoothedTrueRange <= 0.05073 )
							if( adx <= 25.4081 )
								if( adx <= 17.6848 )
									ret := -0.928571 // sell
								if( adx > 17.6848 )
									ret := -0.413793
							if( adx > 25.4081 )
								if( directionalMovementMinus <= 0.00509 )
									ret := -0.003883
								if( directionalMovementMinus > 0.00509 )
									ret := 0.442308
						if( smoothedTrueRange > 0.05073 )
							if( smoothedTrueRange <= 0.066996 )
								if( diMinus <= 4.38124 )
									ret := -0.446009
								if( diMinus > 4.38124 )
									ret := -0.130841
							if( smoothedTrueRange > 0.066996 )
								if( dx <= 67.3578 )
									ret := -0.595238
								if( dx > 67.3578 )
									ret := -0.042283
					if( diMinus > 5.3092 )
						if( adx <= 9.23335 )
							if( smoothedTrueRange <= 0.028536 )
								if( directionalMovementMinus <= 0.003384 )
									ret := -0.063492
								if( directionalMovementMinus > 0.003384 )
									ret := 0.214286
							if( smoothedTrueRange > 0.028536 )
								if( trueRange <= 0.017618 )
									ret := -0.555556
								if( trueRange > 0.017618 )
									ret := 0.391026
						if( adx > 9.23335 )
							if( smoothedTrueRange <= 0.034929 )
								if( diMinus <= 18.3308 )
									ret := 0.020058
								if( diMinus > 18.3308 )
									ret := -0.035191
							if( smoothedTrueRange > 0.034929 )
								if( smoothedTrueRange <= 0.053625 )
									ret := 0.048845
								if( smoothedTrueRange > 0.053625 )
									ret := -0.015263
				if( trueRange > 0.112262 )
					if( dx <= 45.9742 )
						if( directionalMovementPlus <= 0.035708 )
							if( adx <= 42.9354 )
								if( diPlus <= 25.5255 )
									ret := -0.088889
								if( diPlus > 25.5255 )
									ret := 0.612903
							if( adx > 42.9354 )
								if( diMinus <= 11.5861 )
									ret := 1.000000 // buy
								if( diMinus > 11.5861 )
									ret := 0.400000
						if( directionalMovementPlus > 0.035708 )
							if( smoothedDirectionalMovementPlus <= 0.011213 )
								if( directionalMovementPlus <= 0.056297 )
									ret := -0.111111
								if( directionalMovementPlus > 0.056297 )
									ret := 0.857143 // buy
							if( smoothedDirectionalMovementPlus > 0.011213 )
								if( trueRange <= 0.196519 )
									ret := -0.189024
								if( trueRange > 0.196519 )
									ret := 0.727273 // buy
					if( dx > 45.9742 )
						if( diMinus <= 4.60369 )
							if( adx <= 47.2325 )
								if( smoothedDirectionalMovementMinus <= 0.005284 )
									ret := 0.750000 // buy
								if( smoothedDirectionalMovementMinus > 0.005284 )
									ret := -0.600000
							if( adx > 47.2325 )
								if( directionalMovementMinus <= 0.008373 )
									ret := -0.285714
								if( directionalMovementMinus > 0.008373 )
									ret := 0.800000 // buy
						if( diMinus > 4.60369 )
							if( adx <= 18.157 )
								if( diPlus <= 31.7073 )
									ret := -0.444444
								if( diPlus > 31.7073 )
									ret := 0.846154 // buy
							if( adx > 18.157 )
								if( adx <= 49.6795 )
									ret := -0.458696
								if( adx > 49.6795 )
									ret := -0.181818
			if( diPlus > 36.2095 )
				if( adx <= 19.2146 )
					if( trueRange <= 0.092373 )
						if( diPlus <= 39.8292 )
							if( directionalMovementPlus <= 0.0485 )
								if( trueRange <= 0.0735 )
									ret := -0.043478
								if( trueRange > 0.0735 )
									ret := 0.500000
							if( directionalMovementPlus > 0.0485 )
								if( smoothedDirectionalMovementMinus <= 0.006429 )
									ret := -0.285714
								if( smoothedDirectionalMovementMinus > 0.006429 )
									ret := -1.000000 // sell
						if( diPlus > 39.8292 )
							if( diPlus <= 40.9655 )
								ret := 1.000000 // buy
							if( diPlus > 40.9655 )
								ret := 0.250000
					if( trueRange > 0.092373 )
						if( trueRange <= 0.119507 )
							if( dx <= 44.813 )
								ret := 0.000000
							if( dx > 44.813 )
								ret := -1.000000 // sell
						if( trueRange > 0.119507 )
							if( smoothedTrueRange <= 0.054861 )
								if( smoothedDirectionalMovementPlus <= 0.020679 )
									ret := -0.500000
								if( smoothedDirectionalMovementPlus > 0.020679 )
									ret := -1.000000 // sell
							if( smoothedTrueRange > 0.054861 )
								if( trueRange <= 0.206801 )
									ret := 0.500000
								if( trueRange > 0.206801 )
									ret := -0.400000
				if( adx > 19.2146 )
					if( adx <= 41.0405 )
						if( trueRange <= 0.119676 )
							if( diMinus <= 7.12213 )
								if( dx <= 93.5796 )
									ret := 0.242373
								if( dx > 93.5796 )
									ret := -0.382353
							if( diMinus > 7.12213 )
								if( diMinus <= 8.23791 )
									ret := -0.234899
								if( diMinus > 8.23791 )
									ret := 0.072139
						if( trueRange > 0.119676 )
							if( adx <= 30.9881 )
								if( adx <= 23.1984 )
									ret := 0.020833
								if( adx > 23.1984 )
									ret := 0.711111 // buy
							if( adx > 30.9881 )
								if( smoothedTrueRange <= 0.064893 )
									ret := 0.636364
								if( smoothedTrueRange > 0.064893 )
									ret := 0.120603
					if( adx > 41.0405 )
						if( trueRange <= 0.037412 )
							if( smoothedTrueRange <= 0.061422 )
								if( smoothedTrueRange <= 0.03625 )
									ret := 0.052632
								if( smoothedTrueRange > 0.03625 )
									ret := 0.305233
							if( smoothedTrueRange > 0.061422 )
								if( dx <= 79.84 )
									ret := 0.135135
								if( dx > 79.84 )
									ret := -0.548387
						if( trueRange > 0.037412 )
							if( adx <= 44.6853 )
								if( adx <= 43.1187 )
									ret := 0.027273
								if( adx > 43.1187 )
									ret := -0.432624
							if( adx > 44.6853 )
								if( smoothedDirectionalMovementPlus <= 0.098685 )
									ret := 0.051059
								if( smoothedDirectionalMovementPlus > 0.098685 )
									ret := -0.866667 // sell
		if( smoothedDirectionalMovementMinus > 0.012216 )
			if( dx <= 62.1928 )
				if( diMinus <= 8.90913 )
					if( smoothedTrueRange <= 0.206535 )
						if( adx <= 44.4392 )
							if( adx <= 34.1794 )
								if( diPlus <= 28.382 )
									ret := -1.000000 // sell
								if( diPlus > 28.382 )
									ret := -0.142857
							if( adx > 34.1794 )
								if( directionalMovementPlus <= 0.044 )
									ret := 0.000000
								if( directionalMovementPlus > 0.044 )
									ret := 0.500000
						if( adx > 44.4392 )
							if( diMinus <= 8.09914 )
								ret := -1.000000 // sell
							if( diMinus > 8.09914 )
								if( diPlus <= 34.1981 )
									ret := -0.166667
								if( diPlus > 34.1981 )
									ret := -0.900000 // sell
					if( smoothedTrueRange > 0.206535 )
						if( dx <= 61.151 )
							ret := -0.250000
						if( dx > 61.151 )
							ret := 1.000000 // buy
				if( diMinus > 8.90913 )
					if( smoothedDirectionalMovementMinus <= 0.019732 )
						if( diPlus <= 30.2454 )
							if( adx <= 50.4048 )
								if( diMinus <= 26.4801 )
									ret := 0.085501
								if( diMinus > 26.4801 )
									ret := -0.041017
							if( adx > 50.4048 )
								if( diMinus <= 41.5039 )
									ret := 0.206796
								if( diMinus > 41.5039 )
									ret := 0.694444
						if( diPlus > 30.2454 )
							if( adx <= 43.0041 )
								if( adx <= 39.0102 )
									ret := -0.052133
								if( adx > 39.0102 )
									ret := -0.512821
							if( adx > 43.0041 )
								if( adx <= 62.2777 )
									ret := 0.256000
								if( adx > 62.2777 )
									ret := -0.234043
					if( smoothedDirectionalMovementMinus > 0.019732 )
						if( adx <= 51.3642 )
							if( smoothedTrueRange <= 0.148726 )
								if( diPlus <= 27.7089 )
									ret := 0.029930
								if( diPlus > 27.7089 )
									ret := -0.216418
							if( smoothedTrueRange > 0.148726 )
								if( dx <= 3.7417 )
									ret := -0.285714
								if( dx > 3.7417 )
									ret := 0.157127
						if( adx > 51.3642 )
							if( dx <= 56.0538 )
								if( smoothedTrueRange <= 0.137075 )
									ret := -0.087071
								if( smoothedTrueRange > 0.137075 )
									ret := -0.300518
							if( dx > 56.0538 )
								if( directionalMovementPlus <= 0.070154 )
									ret := 0.085324
								if( directionalMovementPlus > 0.070154 )
									ret := 0.756757 // buy
			if( dx > 62.1928 )
				if( diMinus <= 40.1956 )
					if( diMinus <= 26.9214 )
						if( smoothedTrueRange <= 0.238307 )
							if( directionalMovementPlus <= 0.187095 )
								if( adx <= 86.5384 )
									ret := -0.003906
								if( adx > 86.5384 )
									ret := -1.000000 // sell
							if( directionalMovementPlus > 0.187095 )
								if( diMinus <= 9.05897 )
									ret := 1.000000 // buy
								if( diMinus > 9.05897 )
									ret := 0.444444
						if( smoothedTrueRange > 0.238307 )
							if( adx <= 60.7718 )
								if( dx <= 67.9829 )
									ret := -0.571429
								if( dx > 67.9829 )
									ret := -0.944444 // sell
							if( adx > 60.7718 )
								ret := 0.000000
					if( diMinus > 26.9214 )
						if( smoothedTrueRange <= 0.046013 )
							if( smoothedTrueRange <= 0.045178 )
								if( diPlus <= 8.67173 )
									ret := 0.051051
								if( diPlus > 8.67173 )
									ret := -0.600000
							if( smoothedTrueRange > 0.045178 )
								if( directionalMovementMinus <= 0.004731 )
									ret := -0.125000
								if( directionalMovementMinus > 0.004731 )
									ret := -0.727273 // sell
						if( smoothedTrueRange > 0.046013 )
							if( adx <= 45.128 )
								if( directionalMovementPlus <= 0.000821 )
									ret := 0.095137
								if( directionalMovementPlus > 0.000821 )
									ret := 0.288557
							if( adx > 45.128 )
								if( trueRange <= 0.204988 )
									ret := 0.300489
								if( trueRange > 0.204988 )
									ret := 0.935484 // buy
				if( diMinus > 40.1956 )
					if( trueRange <= 0.243174 )
						if( diPlus <= 7.59498 )
							if( diMinus <= 53.3565 )
								if( smoothedDirectionalMovementMinus <= 0.083607 )
									ret := -0.069079
								if( smoothedDirectionalMovementMinus > 0.083607 )
									ret := -0.484848
							if( diMinus > 53.3565 )
								if( directionalMovementPlus <= 0.002811 )
									ret := 0.565217
								if( directionalMovementPlus > 0.002811 )
									ret := 0.062500
						if( diPlus > 7.59498 )
							if( smoothedDirectionalMovementPlus <= 0.003818 )
								if( adx <= 44.1001 )
									ret := -0.375000
								if( adx > 44.1001 )
									ret := 0.058824
							if( smoothedDirectionalMovementPlus > 0.003818 )
								if( diMinus <= 54.4729 )
									ret := 0.334459
								if( diMinus > 54.4729 )
									ret := -0.230769
					if( trueRange > 0.243174 )
						if( diPlus <= 4.39107 )
							if( adx <= 76.069 )
								if( diMinus <= 54.0499 )
									ret := -1.000000 // sell
								if( diMinus > 54.0499 )
									ret := 0.500000
							if( adx > 76.069 )
								if( dx <= 93.3356 )
									ret := 0.750000 // buy
								if( dx > 93.3356 )
									ret := 1.000000 // buy
						if( diPlus > 4.39107 )
							if( adx <= 58.4234 )
								ret := 0.142857
							if( adx > 58.4234 )
								ret := 1.000000 // buy
	if( directionalMovementMinus > 0.014025 )
		if( smoothedDirectionalMovementMinus <= 0.048072 )
			if( adx <= 39.7033 )
				if( diPlus <= 36.2145 )
					if( dx <= 0.888019 )
						if( trueRange <= 0.097305 )
							if( diPlus <= 17.5403 )
								if( trueRange <= 0.060403 )
									ret := -0.133333
								if( trueRange > 0.060403 )
									ret := -0.733333 // sell
							if( diPlus > 17.5403 )
								if( dx <= 0.439428 )
									ret := 0.119048
								if( dx > 0.439428 )
									ret := -0.166667
						if( trueRange > 0.097305 )
							if( adx <= 11.7488 )
								ret := 0.500000
							if( adx > 11.7488 )
								if( dx <= 0.569548 )
									ret := -0.775000 // sell
								if( dx > 0.569548 )
									ret := -0.136364
					if( dx > 0.888019 )
						if( diMinus <= 12.0667 )
							if( smoothedDirectionalMovementPlus <= 0.021047 )
								if( directionalMovementMinus <= 0.059221 )
									ret := 0.042105
								if( directionalMovementMinus > 0.059221 )
									ret := -0.692308
							if( smoothedDirectionalMovementPlus > 0.021047 )
								if( diPlus <= 23.3592 )
									ret := -0.616667
								if( diPlus > 23.3592 )
									ret := -0.163218
						if( diMinus > 12.0667 )
							if( smoothedDirectionalMovementPlus <= 0.033361 )
								if( diMinus <= 34.7761 )
									ret := 0.088476
								if( diMinus > 34.7761 )
									ret := -0.042415
							if( smoothedDirectionalMovementPlus > 0.033361 )
								if( diPlus <= 26.602 )
									ret := 0.088652
								if( diPlus > 26.602 )
									ret := -0.175439
				if( diPlus > 36.2145 )
					if( dx <= 67.8361 )
						if( smoothedTrueRange <= 0.093584 )
							if( dx <= 60.5137 )
								if( adx <= 24.4287 )
									ret := -0.526316
								if( adx > 24.4287 )
									ret := 0.206452
							if( dx > 60.5137 )
								if( trueRange <= 0.062305 )
									ret := 0.500000
								if( trueRange > 0.062305 )
									ret := 1.000000 // buy
						if( smoothedTrueRange > 0.093584 )
							if( directionalMovementMinus <= 0.020873 )
								if( smoothedDirectionalMovementMinus <= 0.017455 )
									ret := -0.071429
								if( smoothedDirectionalMovementMinus > 0.017455 )
									ret := 1.000000 // buy
							if( directionalMovementMinus > 0.020873 )
								if( directionalMovementMinus <= 0.084834 )
									ret := 0.820513 // buy
								if( directionalMovementMinus > 0.084834 )
									ret := 0.318182
					if( dx > 67.8361 )
						if( diMinus <= 4.13893 )
							if( diPlus <= 39.5853 )
								ret := 0.500000
							if( diPlus > 39.5853 )
								ret := 1.000000 // buy
						if( diMinus > 4.13893 )
							if( adx <= 30.8341 )
								ret := 0.400000
							if( adx > 30.8341 )
								if( directionalMovementMinus <= 0.03 )
									ret := -0.869565 // sell
								if( directionalMovementMinus > 0.03 )
									ret := -0.333333
			if( adx > 39.7033 )
				if( adx <= 95.4454 )
					if( diPlus <= 4.47598 )
						if( trueRange <= 0.084471 )
							if( smoothedDirectionalMovementPlus <= 1e-06 )
								if( diMinus <= 46.9948 )
									ret := -0.250000
								if( diMinus > 46.9948 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementPlus > 1e-06 )
								if( dx <= 83.7683 )
									ret := 0.353933
								if( dx > 83.7683 )
									ret := 0.124113
						if( trueRange > 0.084471 )
							if( diMinus <= 39.4712 )
								if( adx <= 75.566 )
									ret := 0.721519 // buy
								if( adx > 75.566 )
									ret := 0.219512
							if( diMinus > 39.4712 )
								if( smoothedTrueRange <= 0.080293 )
									ret := 0.472441
								if( smoothedTrueRange > 0.080293 )
									ret := 0.023810
					if( diPlus > 4.47598 )
						if( dx <= 8.19129 )
							if( trueRange <= 0.134868 )
								if( directionalMovementMinus <= 0.063243 )
									ret := 0.345361
								if( directionalMovementMinus > 0.063243 )
									ret := 0.643836
							if( trueRange > 0.134868 )
								if( adx <= 48.8381 )
									ret := 0.182927
								if( adx > 48.8381 )
									ret := -0.387755
						if( dx > 8.19129 )
							if( diMinus <= 48.4405 )
								if( smoothedTrueRange <= 0.034102 )
									ret := -0.060127
								if( smoothedTrueRange > 0.034102 )
									ret := 0.114992
							if( diMinus > 48.4405 )
								if( directionalMovementPlus <= 7.6e-05 )
									ret := 0.460000
								if( directionalMovementPlus > 7.6e-05 )
									ret := 1.000000 // buy
				if( adx > 95.4454 )
					ret := -1.000000 // sell
		if( smoothedDirectionalMovementMinus > 0.048072 )
			if( dx <= 72.5579 )
				if( dx <= 34.0609 )
					if( smoothedDirectionalMovementPlus <= 0.052584 )
						if( dx <= 26.9906 )
							if( adx <= 52.8748 )
								if( directionalMovementPlus <= 0.058677 )
									ret := 0.170213
								if( directionalMovementPlus > 0.058677 )
									ret := 1.000000 // buy
							if( adx > 52.8748 )
								ret := -1.000000 // sell
						if( dx > 26.9906 )
							if( trueRange <= 0.203787 )
								if( diMinus <= 25.925 )
									ret := 0.500000
								if( diMinus > 25.925 )
									ret := -0.688889
							if( trueRange > 0.203787 )
								if( directionalMovementPlus <= 0.001275 )
									ret := 0.705882 // buy
								if( directionalMovementPlus > 0.001275 )
									ret := -1.000000 // sell
					if( smoothedDirectionalMovementPlus > 0.052584 )
						if( smoothedDirectionalMovementPlus <= 0.105894 )
							if( smoothedTrueRange <= 0.221629 )
								ret := 0.000000
							if( smoothedTrueRange > 0.221629 )
								if( diMinus <= 29.7587 )
									ret := -0.928571 // sell
								if( diMinus > 29.7587 )
									ret := -0.684211
						if( smoothedDirectionalMovementPlus > 0.105894 )
							ret := 1.000000 // buy
				if( dx > 34.0609 )
					if( diPlus <= 10.0393 )
						if( directionalMovementMinus <= 0.110344 )
							if( adx <= 75.5267 )
								if( smoothedDirectionalMovementPlus <= 0.011881 )
									ret := 0.322581
								if( smoothedDirectionalMovementPlus > 0.011881 )
									ret := -0.142157
							if( adx > 75.5267 )
								if( smoothedTrueRange <= 0.159267 )
									ret := -1.000000 // sell
								if( smoothedTrueRange > 0.159267 )
									ret := -0.750000 // sell
						if( directionalMovementMinus > 0.110344 )
							if( adx <= 54.223 )
								if( smoothedDirectionalMovementMinus <= 0.05775 )
									ret := 0.017544
								if( smoothedDirectionalMovementMinus > 0.05775 )
									ret := 0.650602
							if( adx > 54.223 )
								if( adx <= 62.0513 )
									ret := -0.615385
								if( adx > 62.0513 )
									ret := 0.285714
					if( diPlus > 10.0393 )
						if( smoothedDirectionalMovementMinus <= 0.081166 )
							if( adx <= 16.433 )
								if( directionalMovementMinus <= 0.057813 )
									ret := -1.000000 // sell
								if( directionalMovementMinus > 0.057813 )
									ret := -0.250000
							if( adx > 16.433 )
								if( diMinus <= 39.8004 )
									ret := 0.582524
								if( diMinus > 39.8004 )
									ret := 0.083333
						if( smoothedDirectionalMovementMinus > 0.081166 )
							if( smoothedDirectionalMovementPlus <= 0.036265 )
								if( directionalMovementMinus <= 0.082983 )
									ret := -0.500000
								if( directionalMovementMinus > 0.082983 )
									ret := 0.250000
							if( smoothedDirectionalMovementPlus > 0.036265 )
								if( directionalMovementMinus <= 0.17541 )
									ret := -0.444444
								if( directionalMovementMinus > 0.17541 )
									ret := -1.000000 // sell
			if( dx > 72.5579 )
				if( smoothedDirectionalMovementPlus <= 0.005021 )
					if( adx <= 31.1785 )
						if( smoothedTrueRange <= 0.139907 )
							ret := 0.571429
						if( smoothedTrueRange > 0.139907 )
							ret := -1.000000 // sell
					if( adx > 31.1785 )
						if( adx <= 60.7115 )
							if( dx <= 84.9213 )
								if( dx <= 84.4541 )
									ret := 0.900000 // buy
								if( dx > 84.4541 )
									ret := -0.666667
							if( dx > 84.9213 )
								if( diPlus <= 1.41844 )
									ret := 0.459459
								if( diPlus > 1.41844 )
									ret := 0.776316 // buy
						if( adx > 60.7115 )
							if( adx <= 97.2595 )
								if( diMinus <= 46.1502 )
									ret := 0.394737
								if( diMinus > 46.1502 )
									ret := -0.480769
							if( adx > 97.2595 )
								if( smoothedTrueRange <= 0.29096 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 0.29096 )
									ret := 0.750000 // buy
				if( smoothedDirectionalMovementPlus > 0.005021 )
					if( smoothedDirectionalMovementPlus <= 0.023821 )
						if( adx <= 25.3771 )
							ret := -0.500000
						if( adx > 25.3771 )
							if( trueRange <= 0.146636 )
								if( diPlus <= 6.93747 )
									ret := 0.563636
								if( diPlus > 6.93747 )
									ret := -0.750000 // sell
							if( trueRange > 0.146636 )
								if( directionalMovementPlus <= 0.016813 )
									ret := 0.806818 // buy
								if( directionalMovementPlus > 0.016813 )
									ret := 0.411765
					if( smoothedDirectionalMovementPlus > 0.023821 )
						if( dx <= 78.1366 )
							ret := -0.750000 // sell
						if( dx > 78.1366 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_f66f1966(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


