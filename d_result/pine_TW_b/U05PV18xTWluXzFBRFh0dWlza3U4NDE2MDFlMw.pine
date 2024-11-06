//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: SNOW_1Min_1ADX_841601e3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1ADX_841601e3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_841601e3(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 0.170794 )
		if( smoothedDirectionalMovementPlus <= 0.004971 )
			if( trueRange <= 0.200895 )
				if( smoothedDirectionalMovementMinus <= 0.065079 )
					if( adx <= 47.7791 )
						if( smoothedDirectionalMovementMinus <= 0.002857 )
							if( dx <= 16.6962 )
								ret := 1.000000 // buy
							if( dx > 16.6962 )
								ret := 0.750000 // buy
						if( smoothedDirectionalMovementMinus > 0.002857 )
							if( smoothedDirectionalMovementMinus <= 0.049266 )
								if( trueRange <= 0.12025 )
									ret := -0.165803
								if( trueRange > 0.12025 )
									ret := -0.511111
							if( smoothedDirectionalMovementMinus > 0.049266 )
								if( diMinus <= 39.7575 )
									ret := 0.473684
								if( diMinus > 39.7575 )
									ret := -0.142857
					if( adx > 47.7791 )
						if( directionalMovementMinus <= 0.012555 )
							if( smoothedTrueRange <= 0.164223 )
								if( trueRange <= 0.154602 )
									ret := -0.037594
								if( trueRange > 0.154602 )
									ret := 0.700000 // buy
							if( smoothedTrueRange > 0.164223 )
								ret := -1.000000 // sell
						if( directionalMovementMinus > 0.012555 )
							if( smoothedTrueRange <= 0.1506 )
								if( smoothedTrueRange <= 0.141818 )
									ret := 0.157534
								if( smoothedTrueRange > 0.141818 )
									ret := -0.500000
							if( smoothedTrueRange > 0.1506 )
								if( smoothedDirectionalMovementPlus <= 0.003584 )
									ret := 0.166667
								if( smoothedDirectionalMovementPlus > 0.003584 )
									ret := 1.000000 // buy
				if( smoothedDirectionalMovementMinus > 0.065079 )
					if( diMinus <= 62.0432 )
						if( diMinus <= 51.6976 )
							if( smoothedDirectionalMovementMinus <= 0.12244 )
								if( adx <= 56.312 )
									ret := 0.100000
								if( adx > 56.312 )
									ret := -0.482143
							if( smoothedDirectionalMovementMinus > 0.12244 )
								ret := 0.833333 // buy
						if( diMinus > 51.6976 )
							if( diPlus <= 1.95584 )
								if( dx <= 93.7854 )
									ret := 0.111111
								if( dx > 93.7854 )
									ret := -0.633333
							if( diPlus > 1.95584 )
								if( dx <= 90.9678 )
									ret := -0.615385
								if( dx > 90.9678 )
									ret := -0.909091 // sell
					if( diMinus > 62.0432 )
						if( directionalMovementPlus <= 0.01345 )
							if( adx <= 46.6435 )
								ret := 0.800000 // buy
							if( adx > 46.6435 )
								if( diMinus <= 63.2457 )
									ret := 1.000000 // buy
								if( diMinus > 63.2457 )
									ret := 0.100000
						if( directionalMovementPlus > 0.01345 )
							ret := -0.800000 // sell
			if( trueRange > 0.200895 )
				if( smoothedDirectionalMovementPlus <= 0.002861 )
					if( smoothedTrueRange <= 0.286398 )
						if( adx <= 45.6471 )
							ret := 0.000000
						if( adx > 45.6471 )
							if( diMinus <= 58.2232 )
								if( trueRange <= 0.3 )
									ret := -0.857143 // sell
								if( trueRange > 0.3 )
									ret := -0.200000
							if( diMinus > 58.2232 )
								ret := 0.000000
					if( smoothedTrueRange > 0.286398 )
						if( adx <= 89.1402 )
							ret := -1.000000 // sell
						if( adx > 89.1402 )
							ret := -0.200000
				if( smoothedDirectionalMovementPlus > 0.002861 )
					if( trueRange <= 0.263074 )
						if( smoothedDirectionalMovementPlus <= 0.004287 )
							if( diMinus <= 52.4162 )
								ret := 0.142857
							if( diMinus > 52.4162 )
								ret := -0.500000
						if( smoothedDirectionalMovementPlus > 0.004287 )
							ret := -0.666667
					if( trueRange > 0.263074 )
						if( diPlus <= 1.82445 )
							ret := 1.000000 // buy
						if( diPlus > 1.82445 )
							ret := 0.000000
		if( smoothedDirectionalMovementPlus > 0.004971 )
			if( directionalMovementPlus <= 0.155514 )
				if( diPlus <= 55.1685 )
					if( smoothedDirectionalMovementPlus <= 0.038015 )
						if( diMinus <= 41.8603 )
							if( diPlus <= 11.5931 )
								if( smoothedTrueRange <= 0.164379 )
									ret := 0.139134
								if( smoothedTrueRange > 0.164379 )
									ret := 0.029656
							if( diPlus > 11.5931 )
								if( dx <= 25.9425 )
									ret := 0.019349
								if( dx > 25.9425 )
									ret := -0.025517
						if( diMinus > 41.8603 )
							if( diMinus <= 72.0871 )
								if( smoothedDirectionalMovementPlus <= 0.016357 )
									ret := 0.030607
								if( smoothedDirectionalMovementPlus > 0.016357 )
									ret := 0.142541
							if( diMinus > 72.0871 )
								if( adx <= 18.211 )
									ret := -0.411765
								if( adx > 18.211 )
									ret := 0.417021
					if( smoothedDirectionalMovementPlus > 0.038015 )
						if( diPlus <= 17.1049 )
							if( adx <= 58.2414 )
								if( diMinus <= 36.7483 )
									ret := -0.156879
								if( diMinus > 36.7483 )
									ret := 0.152263
							if( adx > 58.2414 )
								if( diMinus <= 31.6209 )
									ret := 0.628866
								if( diMinus > 31.6209 )
									ret := 0.116279
						if( diPlus > 17.1049 )
							if( diPlus <= 41.1179 )
								if( adx <= 27.4847 )
									ret := 0.141579
								if( adx > 27.4847 )
									ret := 0.077019
							if( diPlus > 41.1179 )
								if( smoothedTrueRange <= 0.12315 )
									ret := 0.148588
								if( smoothedTrueRange > 0.12315 )
									ret := -0.041280
				if( diPlus > 55.1685 )
					if( adx <= 10.6151 )
						if( smoothedDirectionalMovementPlus <= 0.036529 )
							if( directionalMovementPlus <= 0.061386 )
								if( smoothedTrueRange <= 0.029946 )
									ret := -0.500000
								if( smoothedTrueRange > 0.029946 )
									ret := -0.071429
							if( directionalMovementPlus > 0.061386 )
								ret := 1.000000 // buy
						if( smoothedDirectionalMovementPlus > 0.036529 )
							if( trueRange <= 0.09932 )
								if( directionalMovementMinus <= 5e-05 )
									ret := -0.193548
								if( directionalMovementMinus > 5e-05 )
									ret := -0.538462
							if( trueRange > 0.09932 )
								if( dx <= 28.6267 )
									ret := -0.892857 // sell
								if( dx > 28.6267 )
									ret := -0.500000
					if( adx > 10.6151 )
						if( trueRange <= 0.365099 )
							if( diMinus <= 2.359 )
								if( trueRange <= 0.18505 )
									ret := -0.150000
								if( trueRange > 0.18505 )
									ret := -0.904762 // sell
							if( diMinus > 2.359 )
								if( diMinus <= 5.10373 )
									ret := 0.396825
								if( diMinus > 5.10373 )
									ret := -0.062633
						if( trueRange > 0.365099 )
							if( adx <= 50.7261 )
								if( trueRange <= 0.447649 )
									ret := -0.875000 // sell
								if( trueRange > 0.447649 )
									ret := -0.285714
							if( adx > 50.7261 )
								ret := -1.000000 // sell
			if( directionalMovementPlus > 0.155514 )
				if( diMinus <= 15.7002 )
					if( dx <= 46.8666 )
						if( dx <= 43.9162 )
							if( smoothedDirectionalMovementMinus <= 0.057255 )
								if( diMinus <= 15.4985 )
									ret := 0.048433
								if( diMinus > 15.4985 )
									ret := 0.608696
							if( smoothedDirectionalMovementMinus > 0.057255 )
								if( smoothedDirectionalMovementMinus <= 0.120337 )
									ret := 0.705882 // buy
								if( smoothedDirectionalMovementMinus > 0.120337 )
									ret := -0.857143 // sell
						if( dx > 43.9162 )
							if( diMinus <= 13.2404 )
								if( smoothedDirectionalMovementMinus <= 0.020224 )
									ret := 0.333333
								if( smoothedDirectionalMovementMinus > 0.020224 )
									ret := 0.938776 // buy
							if( diMinus > 13.2404 )
								if( smoothedDirectionalMovementMinus <= 0.028732 )
									ret := 0.428571
								if( smoothedDirectionalMovementMinus > 0.028732 )
									ret := -0.750000 // sell
					if( dx > 46.8666 )
						if( diPlus <= 56.9046 )
							if( trueRange <= 0.5596 )
								if( dx <= 97.4871 )
									ret := -0.026371
								if( dx > 97.4871 )
									ret := 0.800000 // buy
							if( trueRange > 0.5596 )
								if( smoothedDirectionalMovementPlus <= 0.157238 )
									ret := 0.649485
								if( smoothedDirectionalMovementPlus > 0.157238 )
									ret := 0.084112
						if( diPlus > 56.9046 )
							if( smoothedDirectionalMovementPlus <= 0.127785 )
								if( directionalMovementPlus <= 0.650049 )
									ret := -0.200000
								if( directionalMovementPlus > 0.650049 )
									ret := 0.583333
							if( smoothedDirectionalMovementPlus > 0.127785 )
								if( dx <= 67.6344 )
									ret := 0.176471
								if( dx > 67.6344 )
									ret := -0.764706 // sell
				if( diMinus > 15.7002 )
					if( adx <= 48.0968 )
						if( diPlus <= 38.2839 )
							if( smoothedTrueRange <= 0.455853 )
								if( smoothedDirectionalMovementPlus <= 0.115675 )
									ret := -0.059072
								if( smoothedDirectionalMovementPlus > 0.115675 )
									ret := 0.248175
							if( smoothedTrueRange > 0.455853 )
								if( adx <= 18.1304 )
									ret := 0.126984
								if( adx > 18.1304 )
									ret := -0.412500
						if( diPlus > 38.2839 )
							if( directionalMovementMinus <= 0.021541 )
								if( smoothedDirectionalMovementPlus <= 0.212004 )
									ret := -0.247273
								if( smoothedDirectionalMovementPlus > 0.212004 )
									ret := 0.021583
							if( directionalMovementMinus > 0.021541 )
								if( diPlus <= 54.3942 )
									ret := -0.113043
								if( diPlus > 54.3942 )
									ret := 0.500000
					if( adx > 48.0968 )
						if( smoothedTrueRange <= 0.624114 )
							if( trueRange <= 0.280345 )
								if( smoothedDirectionalMovementMinus <= 0.127192 )
									ret := -0.157068
								if( smoothedDirectionalMovementMinus > 0.127192 )
									ret := 0.588235
							if( trueRange > 0.280345 )
								if( smoothedDirectionalMovementMinus <= 0.209943 )
									ret := 0.208571
								if( smoothedDirectionalMovementMinus > 0.209943 )
									ret := -0.413793
						if( smoothedTrueRange > 0.624114 )
							if( smoothedDirectionalMovementPlus <= 0.209571 )
								if( trueRange <= 0.50827 )
									ret := 0.222222
								if( trueRange > 0.50827 )
									ret := 0.833333 // buy
							if( smoothedDirectionalMovementPlus > 0.209571 )
								if( smoothedDirectionalMovementMinus <= 0.603939 )
									ret := -0.500000
								if( smoothedDirectionalMovementMinus > 0.603939 )
									ret := -1.000000 // sell
	if( directionalMovementMinus > 0.170794 )
		if( diMinus <= 41.3074 )
			if( smoothedDirectionalMovementPlus <= 0.093271 )
				if( dx <= 3.2052 )
					if( directionalMovementPlus <= 0.003324 )
						if( adx <= 27.6502 )
							if( dx <= 0.987731 )
								if( diPlus <= 22.9245 )
									ret := 0.600000
								if( diPlus > 22.9245 )
									ret := -0.388889
							if( dx > 0.987731 )
								if( smoothedDirectionalMovementMinus <= 0.034427 )
									ret := -0.500000
								if( smoothedDirectionalMovementMinus > 0.034427 )
									ret := 0.653846
						if( adx > 27.6502 )
							if( trueRange <= 0.301266 )
								if( adx <= 30.1835 )
									ret := -0.818182 // sell
								if( adx > 30.1835 )
									ret := -0.028571
							if( trueRange > 0.301266 )
								if( diMinus <= 23.4621 )
									ret := 0.666667
								if( diMinus > 23.4621 )
									ret := -0.043478
					if( directionalMovementPlus > 0.003324 )
						if( dx <= 2.68738 )
							ret := 1.000000 // buy
						if( dx > 2.68738 )
							ret := 0.000000
				if( dx > 3.2052 )
					if( trueRange <= 0.423172 )
						if( smoothedDirectionalMovementMinus <= 0.14842 )
							if( dx <= 4.13611 )
								if( diPlus <= 19.4315 )
									ret := 1.000000 // buy
								if( diPlus > 19.4315 )
									ret := -0.604651
							if( dx > 4.13611 )
								if( smoothedDirectionalMovementPlus <= 0.022791 )
									ret := -0.112211
								if( smoothedDirectionalMovementPlus > 0.022791 )
									ret := 0.053401
						if( smoothedDirectionalMovementMinus > 0.14842 )
							if( smoothedTrueRange <= 0.536365 )
								if( directionalMovementMinus <= 0.194728 )
									ret := -0.166667
								if( directionalMovementMinus > 0.194728 )
									ret := -0.941176 // sell
							if( smoothedTrueRange > 0.536365 )
								if( smoothedTrueRange <= 0.571987 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 0.571987 )
									ret := -0.500000
					if( trueRange > 0.423172 )
						if( diMinus <= 40.9251 )
							if( adx <= 70.1379 )
								if( smoothedTrueRange <= 0.329618 )
									ret := 0.126543
								if( smoothedTrueRange > 0.329618 )
									ret := 0.367965
							if( adx > 70.1379 )
								if( diMinus <= 30.2092 )
									ret := -1.000000 // sell
								if( diMinus > 30.2092 )
									ret := 0.300000
						if( diMinus > 40.9251 )
							ret := -1.000000 // sell
			if( smoothedDirectionalMovementPlus > 0.093271 )
				if( diPlus <= 16.7398 )
					if( diMinus <= 27.7861 )
						ret := 0.500000
					if( diMinus > 27.7861 )
						if( smoothedDirectionalMovementMinus <= 0.385194 )
							if( trueRange <= 0.540398 )
								ret := -0.857143 // sell
							if( trueRange > 0.540398 )
								ret := -0.333333
						if( smoothedDirectionalMovementMinus > 0.385194 )
							ret := -1.000000 // sell
				if( diPlus > 16.7398 )
					if( dx <= 11.3404 )
						if( diPlus <= 48.6582 )
							if( directionalMovementPlus <= 0.000682 )
								if( diPlus <= 24.0442 )
									ret := -0.068966
								if( diPlus > 24.0442 )
									ret := 0.492857
							if( directionalMovementPlus > 0.000682 )
								if( dx <= 3.65639 )
									ret := 0.600000
								if( dx > 3.65639 )
									ret := 1.000000 // buy
						if( diPlus > 48.6582 )
							ret := -0.800000 // sell
					if( dx > 11.3404 )
						if( trueRange <= 0.370409 )
							if( smoothedTrueRange <= 0.263176 )
								if( diPlus <= 78.28 )
									ret := 0.036145
								if( diPlus > 78.28 )
									ret := 1.000000 // buy
							if( smoothedTrueRange > 0.263176 )
								if( adx <= 48.9542 )
									ret := 0.564935
								if( adx > 48.9542 )
									ret := 0.122449
						if( trueRange > 0.370409 )
							if( smoothedTrueRange <= 0.230626 )
								if( dx <= 19.2286 )
									ret := -0.111111
								if( dx > 19.2286 )
									ret := 0.857143 // buy
							if( smoothedTrueRange > 0.230626 )
								if( directionalMovementPlus <= 0.081341 )
									ret := 0.029613
								if( directionalMovementPlus > 0.081341 )
									ret := 0.586207
		if( diMinus > 41.3074 )
			if( smoothedTrueRange <= 0.30528 )
				if( diMinus <= 60.6161 )
					if( smoothedDirectionalMovementPlus <= 0.01287 )
						if( adx <= 63.6511 )
							if( smoothedDirectionalMovementMinus <= 0.117099 )
								if( adx <= 49.5982 )
									ret := 0.060976
								if( adx > 49.5982 )
									ret := -0.475000
							if( smoothedDirectionalMovementMinus > 0.117099 )
								if( diMinus <= 53.2526 )
									ret := 0.833333 // buy
								if( diMinus > 53.2526 )
									ret := 0.250000
						if( adx > 63.6511 )
							if( smoothedTrueRange <= 0.202986 )
								if( diMinus <= 50.3387 )
									ret := 0.578947
								if( diMinus > 50.3387 )
									ret := -0.384615
							if( smoothedTrueRange > 0.202986 )
								if( smoothedDirectionalMovementMinus <= 0.124268 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementMinus > 0.124268 )
									ret := 0.625000
					if( smoothedDirectionalMovementPlus > 0.01287 )
						if( smoothedDirectionalMovementMinus <= 0.133306 )
							if( diPlus <= 49.6522 )
								if( diMinus <= 46.777 )
									ret := 0.202667
								if( diMinus > 46.777 )
									ret := 0.425216
							if( diPlus > 49.6522 )
								if( smoothedDirectionalMovementPlus <= 0.115768 )
									ret := 0.711538 // buy
								if( smoothedDirectionalMovementPlus > 0.115768 )
									ret := 0.133333
						if( smoothedDirectionalMovementMinus > 0.133306 )
							if( smoothedTrueRange <= 0.253182 )
								if( trueRange <= 0.903524 )
									ret := -0.782609 // sell
								if( trueRange > 0.903524 )
									ret := 0.250000
							if( smoothedTrueRange > 0.253182 )
								if( trueRange <= 0.676076 )
									ret := -0.065574
								if( trueRange > 0.676076 )
									ret := 0.709677 // buy
				if( diMinus > 60.6161 )
					if( diPlus <= 31.8387 )
						if( adx <= 29.7265 )
							if( diMinus <= 63.1184 )
								if( trueRange <= 0.285204 )
									ret := 0.272727
								if( trueRange > 0.285204 )
									ret := 0.885714 // buy
							if( diMinus > 63.1184 )
								if( smoothedDirectionalMovementMinus <= 0.160085 )
									ret := -0.152381
								if( smoothedDirectionalMovementMinus > 0.160085 )
									ret := 0.761905 // buy
						if( adx > 29.7265 )
							if( smoothedDirectionalMovementPlus <= 0.051038 )
								if( dx <= 82.7399 )
									ret := 0.696970
								if( dx > 82.7399 )
									ret := 0.269231
							if( smoothedDirectionalMovementPlus > 0.051038 )
								if( adx <= 37.508 )
									ret := -0.666667
								if( adx > 37.508 )
									ret := 0.375000
					if( diPlus > 31.8387 )
						if( smoothedTrueRange <= 0.146804 )
							if( smoothedTrueRange <= 0.065059 )
								ret := 0.500000
							if( smoothedTrueRange > 0.065059 )
								if( trueRange <= 0.222828 )
									ret := 0.862069 // buy
								if( trueRange > 0.222828 )
									ret := 0.983333 // buy
						if( smoothedTrueRange > 0.146804 )
							if( adx <= 13.4055 )
								if( adx <= 11.1665 )
									ret := 0.000000
								if( adx > 11.1665 )
									ret := -1.000000 // sell
							if( adx > 13.4055 )
								if( smoothedDirectionalMovementMinus <= 0.101326 )
									ret := 0.250000
								if( smoothedDirectionalMovementMinus > 0.101326 )
									ret := 0.942857 // buy
			if( smoothedTrueRange > 0.30528 )
				if( diMinus <= 47.2354 )
					if( adx <= 40.3709 )
						if( smoothedTrueRange <= 0.356586 )
							if( adx <= 18.9989 )
								if( dx <= 5.43694 )
									ret := 1.000000 // buy
								if( dx > 5.43694 )
									ret := 0.166667
							if( adx > 18.9989 )
								if( diPlus <= 18.1652 )
									ret := -0.153846
								if( diPlus > 18.1652 )
									ret := -0.866667 // sell
						if( smoothedTrueRange > 0.356586 )
							if( trueRange <= 0.441789 )
								if( adx <= 12.4424 )
									ret := 0.250000
								if( adx > 12.4424 )
									ret := 0.827586 // buy
							if( trueRange > 0.441789 )
								if( diMinus <= 46.9247 )
									ret := 0.000000
								if( diMinus > 46.9247 )
									ret := 0.750000 // buy
					if( adx > 40.3709 )
						if( adx <= 50.8699 )
							if( diPlus <= 11.6037 )
								if( dx <= 71.1096 )
									ret := 0.333333
								if( dx > 71.1096 )
									ret := 1.000000 // buy
							if( diPlus > 11.6037 )
								ret := 1.000000 // buy
						if( adx > 50.8699 )
							if( directionalMovementMinus <= 0.253049 )
								if( smoothedDirectionalMovementPlus <= 0.024093 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 0.024093 )
									ret := 0.444444
							if( directionalMovementMinus > 0.253049 )
								if( smoothedDirectionalMovementPlus <= 0.042949 )
									ret := 0.333333
								if( smoothedDirectionalMovementPlus > 0.042949 )
									ret := -0.666667
				if( diMinus > 47.2354 )
					if( diPlus <= 8.06265 )
						if( adx <= 55.8731 )
							if( directionalMovementMinus <= 0.41185 )
								if( dx <= 84.0136 )
									ret := -1.000000 // sell
								if( dx > 84.0136 )
									ret := 0.875000 // buy
							if( directionalMovementMinus > 0.41185 )
								if( trueRange <= 1.49964 )
									ret := 0.722222 // buy
								if( trueRange > 1.49964 )
									ret := 1.000000 // buy
						if( adx > 55.8731 )
							if( directionalMovementMinus <= 1.15973 )
								if( diMinus <= 52.9367 )
									ret := 0.142857
								if( diMinus > 52.9367 )
									ret := 0.833333 // buy
							if( directionalMovementMinus > 1.15973 )
								if( smoothedDirectionalMovementMinus <= 0.842106 )
									ret := -1.000000 // sell
								if( smoothedDirectionalMovementMinus > 0.842106 )
									ret := -0.750000 // sell
					if( diPlus > 8.06265 )
						if( diMinus <= 47.8478 )
							if( diMinus <= 47.4131 )
								ret := -0.750000 // sell
							if( diMinus > 47.4131 )
								ret := -1.000000 // sell
						if( diMinus > 47.8478 )
							if( dx <= 41.5799 )
								if( smoothedDirectionalMovementMinus <= 0.244605 )
									ret := -0.142857
								if( smoothedDirectionalMovementMinus > 0.244605 )
									ret := 0.527778
							if( dx > 41.5799 )
								if( diPlus <= 19.7096 )
									ret := -0.068376
								if( diPlus > 19.7096 )
									ret := -0.852941 // sell
	
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
float op_operation = decision_tree_0_SNOW_1Min_841601e3(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)

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


