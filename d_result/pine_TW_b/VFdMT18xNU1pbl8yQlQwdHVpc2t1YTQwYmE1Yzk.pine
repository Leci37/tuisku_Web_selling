//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: TWLO_15Min_2BT0_a40ba5c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2BT0_a40ba5c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_a40ba5c9(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.4609 )
		if( bbm <= 0.089763 )
			if( bbp <= -0.154122 )
				if( ema2 <= 31.0231 )
					if( bbm <= 0.049628 )
						if( ema13 <= -0.216077 )
							if( ema1 <= 25.2753 )
								if( ema1 <= 25.0862 )
									ret := 0.272727
								if( ema1 > 25.0862 )
									ret := -1.000000 // sell
							if( ema1 > 25.2753 )
								if( bullPower <= -0.194942 )
									ret := 0.843750 // buy
								if( bullPower > -0.194942 )
									ret := 0.214286
						if( ema13 > -0.216077 )
							if( bearPower <= -0.127632 )
								if( ema13 <= -0.175259 )
									ret := 0.578125
								if( ema13 > -0.175259 )
									ret := 0.809524 // buy
							if( bearPower > -0.127632 )
								if( ema13 <= -0.046788 )
									ret := 0.572193
								if( ema13 > -0.046788 )
									ret := 0.080000
					if( bbm > 0.049628 )
						if( ema3 <= 30.9166 )
							if( ema2 <= 29.4584 )
								if( bbm <= 0.085134 )
									ret := 0.216495
								if( bbm > 0.085134 )
									ret := 1.000000 // buy
							if( ema2 > 29.4584 )
								if( bbp <= -0.21348 )
									ret := -0.214286
								if( bbp > -0.21348 )
									ret := -0.444444
						if( ema3 > 30.9166 )
							ret := 0.923077 // buy
				if( ema2 > 31.0231 )
					if( ema12 <= -0.419625 )
						if( ema3 <= 360.026 )
							if( ema2 <= 163.888 )
								if( ema13 <= -2.91348 )
									ret := -1.000000 // sell
								if( ema13 > -2.91348 )
									ret := -0.037037
							if( ema2 > 163.888 )
								if( ema12 <= -1.69518 )
									ret := 0.575540
								if( ema12 > -1.69518 )
									ret := 0.162328
						if( ema3 > 360.026 )
							if( ema2 <= 376.356 )
								if( bearPower <= -0.625873 )
									ret := -0.268519
								if( bearPower > -0.625873 )
									ret := -0.775862 // sell
							if( ema2 > 376.356 )
								if( ema13 <= -1.78464 )
									ret := 0.363636
								if( ema13 > -1.78464 )
									ret := -0.191489
					if( ema12 > -0.419625 )
						if( bearPower <= -0.421657 )
							if( ema1 <= 46.1514 )
								if( ema1 <= 35.6247 )
									ret := 0.727273 // buy
								if( ema1 > 35.6247 )
									ret := 0.963636 // buy
							if( ema1 > 46.1514 )
								if( tema <= 52.4464 )
									ret := -0.326087
								if( tema > 52.4464 )
									ret := 0.398073
						if( bearPower > -0.421657 )
							if( ema12 <= -0.208099 )
								if( ema3 <= 76.5691 )
									ret := 0.487805
								if( ema3 > 76.5691 )
									ret := 0.141994
							if( ema12 > -0.208099 )
								if( ema2 <= 31.1338 )
									ret := -0.962963 // sell
								if( ema2 > 31.1338 )
									ret := 0.115667
			if( bbp > -0.154122 )
				if( ema3 <= 28.8979 )
					if( bbp <= 0.335366 )
						if( ema1 <= 28.8137 )
							if( ema2 <= 26.8272 )
								if( ema3 <= 26.0842 )
									ret := 0.189219
								if( ema3 > 26.0842 )
									ret := -0.273973
							if( ema2 > 26.8272 )
								if( ema1 <= 28.5764 )
									ret := 0.447761
								if( ema1 > 28.5764 )
									ret := -0.130952
						if( ema1 > 28.8137 )
							if( bbp <= 0.183249 )
								if( bullPower <= 0.085052 )
									ret := 1.000000 // buy
								if( bullPower > 0.085052 )
									ret := 0.533333
							if( bbp > 0.183249 )
								if( ema3 <= 28.8196 )
									ret := 1.000000 // buy
								if( ema3 > 28.8196 )
									ret := 0.818182 // buy
					if( bbp > 0.335366 )
						if( ema1 <= 28.8608 )
							if( ema13 <= 0.04985 )
								ret := -0.900000 // sell
							if( ema13 > 0.04985 )
								if( tema <= 25.7767 )
									ret := 0.409091
								if( tema > 25.7767 )
									ret := -0.266667
						if( ema1 > 28.8608 )
							ret := 0.692308
				if( ema3 > 28.8979 )
					if( ema1 <= 29.1596 )
						if( ema13 <= -0.127452 )
							ret := 0.550000
						if( ema13 > -0.127452 )
							if( bbm <= 0.021302 )
								if( bearPower <= 0.012991 )
									ret := -0.603448
								if( bearPower > 0.012991 )
									ret := -0.941176 // sell
							if( bbm > 0.021302 )
								if( ema12 <= -0.046434 )
									ret := -0.941176 // sell
								if( ema12 > -0.046434 )
									ret := -0.060000
					if( ema1 > 29.1596 )
						if( ema1 <= 109.765 )
							if( bullPower <= 0.24108 )
								if( ema3 <= 29.2746 )
									ret := 0.500000
								if( ema3 > 29.2746 )
									ret := -0.023949
							if( bullPower > 0.24108 )
								if( ema1 <= 60.241 )
									ret := 0.758621 // buy
								if( ema1 > 60.241 )
									ret := 0.227273
						if( ema1 > 109.765 )
							if( ema13 <= 0.381188 )
								if( bbp <= 0.426739 )
									ret := 0.132832
								if( bbp > 0.426739 )
									ret := -0.591837
							if( ema13 > 0.381188 )
								if( tema <= 128.596 )
									ret := 0.805556 // buy
								if( tema > 128.596 )
									ret := 0.261438
		if( bbm > 0.089763 )
			if( ema1 <= 101.089 )
				if( bbp <= -0.492777 )
					if( ema1 <= 98.8659 )
						if( ema13 <= -4.91788 )
							if( bearPower <= -3.94142 )
								ret := -1.000000 // sell
							if( bearPower > -3.94142 )
								ret := -0.916667 // sell
						if( ema13 > -4.91788 )
							if( ema2 <= 24.2211 )
								if( ema13 <= -0.449391 )
									ret := 0.961538 // buy
								if( ema13 > -0.449391 )
									ret := 0.500000
							if( ema2 > 24.2211 )
								if( ema1 <= 32.7778 )
									ret := -0.070026
								if( ema1 > 32.7778 )
									ret := 0.074084
					if( ema1 > 98.8659 )
						if( tema <= 99.5544 )
							if( bbm <= 2.00341 )
								if( tema <= 98.9079 )
									ret := 0.623853
								if( tema > 98.9079 )
									ret := 0.933333 // buy
							if( bbm > 2.00341 )
								if( ema12 <= -1.35013 )
									ret := 0.941176 // buy
								if( ema12 > -1.35013 )
									ret := -0.233333
						if( tema > 99.5544 )
							if( bbm <= 0.566403 )
								if( bullPower <= -0.272386 )
									ret := 0.270270
								if( bullPower > -0.272386 )
									ret := -0.705882 // sell
							if( bbm > 0.566403 )
								if( bbp <= -2.47601 )
									ret := -0.416667
								if( bbp > -2.47601 )
									ret := 0.596491
				if( bbp > -0.492777 )
					if( ema2 <= 34.6041 )
						if( bbp <= 0.389414 )
							if( ema2 <= 33.8586 )
								if( ema2 <= 24.8043 )
									ret := 0.162754
								if( ema2 > 24.8043 )
									ret := -0.052389
							if( ema2 > 33.8586 )
								if( bearPower <= 0.07605 )
									ret := -0.682171
								if( bearPower > 0.07605 )
									ret := -0.058824
						if( bbp > 0.389414 )
							if( ema13 <= 0.196361 )
								if( bullPower <= 0.339907 )
									ret := -0.302326
								if( bullPower > 0.339907 )
									ret := 0.193548
							if( ema13 > 0.196361 )
								if( ema13 <= 0.420631 )
									ret := 0.453416
								if( ema13 > 0.420631 )
									ret := -0.100000
					if( ema2 > 34.6041 )
						if( ema13 <= -0.064118 )
							if( bbp <= 0.187223 )
								if( ema3 <= 86.4266 )
									ret := -0.020363
								if( ema3 > 86.4266 )
									ret := 0.196154
							if( bbp > 0.187223 )
								if( ema2 <= 52.8934 )
									ret := -0.539130
								if( ema2 > 52.8934 )
									ret := -0.069091
						if( ema13 > -0.064118 )
							if( tema <= 85.0463 )
								if( ema3 <= 81.7469 )
									ret := 0.079643
								if( ema3 > 81.7469 )
									ret := 0.700535 // buy
							if( tema > 85.0463 )
								if( ema2 <= 85.181 )
									ret := -0.843750 // sell
								if( ema2 > 85.181 )
									ret := -0.141935
			if( ema1 > 101.089 )
				if( bullPower <= 0.266017 )
					if( bearPower <= -11.7418 )
						if( ema13 <= -18.5892 )
							ret := -0.888889 // sell
						if( ema13 > -18.5892 )
							if( bbp <= -17.7562 )
								if( bbm <= 6.80513 )
									ret := 0.571429
								if( bbm > 6.80513 )
									ret := 0.980769 // buy
							if( bbp > -17.7562 )
								if( bbm <= 9.97495 )
									ret := -0.200000
								if( bbm > 9.97495 )
									ret := 0.714286 // buy
					if( bearPower > -11.7418 )
						if( ema2 <= 369.531 )
							if( ema2 <= 102.803 )
								if( bbm <= 1.5453 )
									ret := -0.420664
								if( bbm > 1.5453 )
									ret := 0.666667
							if( ema2 > 102.803 )
								if( ema3 <= 367.14 )
									ret := 0.005983
								if( ema3 > 367.14 )
									ret := 0.447853
						if( ema2 > 369.531 )
							if( ema2 <= 421.148 )
								if( bullPower <= -0.58499 )
									ret := -0.322034
								if( bullPower > -0.58499 )
									ret := -0.024390
							if( ema2 > 421.148 )
								if( bearPower <= -1.70219 )
									ret := 0.322785
								if( bearPower > -1.70219 )
									ret := -0.739130 // sell
				if( bullPower > 0.266017 )
					if( bullPower <= 2.92224 )
						if( ema3 <= 434.327 )
							if( ema1 <= 102.153 )
								if( tema <= 102.057 )
									ret := -0.600000
								if( tema > 102.057 )
									ret := -1.000000 // sell
							if( ema1 > 102.153 )
								if( tema <= 426.38 )
									ret := -0.107206
								if( tema > 426.38 )
									ret := 0.636364
						if( ema3 > 434.327 )
							if( tema <= 444.596 )
								ret := -0.545455
							if( tema > 444.596 )
								if( ema13 <= -0.878372 )
									ret := -0.967742 // sell
								if( ema13 > -0.878372 )
									ret := -0.750000 // sell
					if( bullPower > 2.92224 )
						if( ema2 <= 365.393 )
							if( ema13 <= 0.475985 )
								if( bearPower <= -4.6754 )
									ret := 0.428571
								if( bearPower > -4.6754 )
									ret := 0.136364
							if( ema13 > 0.475985 )
								ret := -0.411765
						if( ema2 > 365.393 )
							if( ema13 <= 0.16953 )
								ret := 1.000000 // buy
							if( ema13 > 0.16953 )
								ret := 0.777778 // buy
	if( bbp > 0.4609 )
		if( ema13 <= 0.560995 )
			if( ema3 <= 52.0622 )
				if( ema13 <= 0.20406 )
					if( ema3 <= 24.7971 )
						if( bbm <= 0.14 )
							ret := -0.705882 // sell
						if( bbm > 0.14 )
							if( tema <= 24.3029 )
								ret := 0.562500
							if( tema > 24.3029 )
								ret := 1.000000 // buy
					if( ema3 > 24.7971 )
						if( bullPower <= 1.025 )
							if( tema <= 26.7966 )
								if( bearPower <= 0.22451 )
									ret := -0.720000 // sell
								if( bearPower > 0.22451 )
									ret := -1.000000 // sell
							if( tema > 26.7966 )
								if( ema3 <= 28.135 )
									ret := 0.384615
								if( ema3 > 28.135 )
									ret := -0.421583
						if( bullPower > 1.025 )
							ret := 0.545455
				if( ema13 > 0.20406 )
					if( tema <= 50.7971 )
						if( ema2 <= 50.1626 )
							if( ema1 <= 24.1547 )
								if( ema13 <= 0.266525 )
									ret := -0.818182 // sell
								if( ema13 > 0.266525 )
									ret := -1.000000 // sell
							if( ema1 > 24.1547 )
								if( ema2 <= 24.9339 )
									ret := 0.246753
								if( ema2 > 24.9339 )
									ret := -0.163126
						if( ema2 > 50.1626 )
							ret := 0.869565 // buy
					if( tema > 50.7971 )
						if( ema2 <= 50.5174 )
							if( ema1 <= 50.6182 )
								ret := -1.000000 // sell
							if( ema1 > 50.6182 )
								ret := -0.750000 // sell
						if( ema2 > 50.5174 )
							if( bearPower <= 0.079909 )
								ret := 0.764706 // buy
							if( bearPower > 0.079909 )
								if( ema12 <= 0.170172 )
									ret := -0.078947
								if( ema12 > 0.170172 )
									ret := -0.702703 // sell
			if( ema3 > 52.0622 )
				if( ema1 <= 53.7735 )
					if( ema3 <= 52.9552 )
						if( ema3 <= 52.1446 )
							ret := 0.526316
						if( ema3 > 52.1446 )
							if( ema13 <= 0.319859 )
								if( tema <= 52.8425 )
									ret := 0.000000
								if( tema > 52.8425 )
									ret := -0.235294
							if( ema13 > 0.319859 )
								ret := 0.312500
					if( ema3 > 52.9552 )
						if( ema13 <= 0.437046 )
							if( tema <= 53.5274 )
								if( bbm <= 0.19 )
									ret := 0.571429
								if( bbm > 0.19 )
									ret := 0.666667
							if( tema > 53.5274 )
								if( ema12 <= 0.184486 )
									ret := 0.984127 // buy
								if( ema12 > 0.184486 )
									ret := 0.809524 // buy
						if( ema13 > 0.437046 )
							ret := 0.272727
				if( ema1 > 53.7735 )
					if( bearPower <= 1.32811 )
						if( tema <= 98.9252 )
							if( bearPower <= 0.46613 )
								if( bbp <= 2.0266 )
									ret := -0.109050
								if( bbp > 2.0266 )
									ret := 0.279412
							if( bearPower > 0.46613 )
								if( bullPower <= 0.872641 )
									ret := -0.495708
								if( bullPower > 0.872641 )
									ret := -0.115493
						if( tema > 98.9252 )
							if( bullPower <= 0.65435 )
								if( ema2 <= 100.974 )
									ret := 0.542056
								if( ema2 > 100.974 )
									ret := -0.143445
							if( bullPower > 0.65435 )
								if( bbm <= 1.83347 )
									ret := 0.058468
								if( bbm > 1.83347 )
									ret := -0.084758
					if( bearPower > 1.32811 )
						if( ema2 <= 291.61 )
							if( ema13 <= -0.008693 )
								if( ema1 <= 179.506 )
									ret := -0.565217
								if( ema1 > 179.506 )
									ret := -0.920635 // sell
							if( ema13 > -0.008693 )
								if( bullPower <= 1.68665 )
									ret := -0.050000
								if( bullPower > 1.68665 )
									ret := -0.618557
						if( ema2 > 291.61 )
							if( ema2 <= 318.18 )
								if( bbm <= 0.664261 )
									ret := 0.444444
								if( bbm > 0.664261 )
									ret := -0.545455
							if( ema2 > 318.18 )
								if( ema12 <= 0.01928 )
									ret := 0.200000
								if( ema12 > 0.01928 )
									ret := -0.504065
		if( ema13 > 0.560995 )
			if( ema2 <= 94.8502 )
				if( tema <= 79.8398 )
					if( ema3 <= 75.3348 )
						if( ema12 <= 0.273666 )
							if( ema1 <= 35.236 )
								ret := 1.000000 // buy
							if( ema1 > 35.236 )
								if( bbp <= 0.636756 )
									ret := 0.142857
								if( bbp > 0.636756 )
									ret := 0.833333 // buy
						if( ema12 > 0.273666 )
							if( bullPower <= 2.06348 )
								if( bearPower <= -0.257162 )
									ret := 0.840000 // buy
								if( bearPower > -0.257162 )
									ret := 0.035149
							if( bullPower > 2.06348 )
								if( ema1 <= 76.1002 )
									ret := -0.376712
								if( ema1 > 76.1002 )
									ret := 0.560000
					if( ema3 > 75.3348 )
						if( bbm <= 1.11344 )
							if( bbm <= 0.106719 )
								if( tema <= 78.6552 )
									ret := -0.857143 // sell
								if( tema > 78.6552 )
									ret := -1.000000 // sell
							if( bbm > 0.106719 )
								if( ema2 <= 78.25 )
									ret := -0.690476
								if( ema2 > 78.25 )
									ret := 0.846154 // buy
						if( bbm > 1.11344 )
							if( bearPower <= 0.900371 )
								if( tema <= 79.5567 )
									ret := -1.000000 // sell
								if( tema > 79.5567 )
									ret := 0.555556
							if( bearPower > 0.900371 )
								if( ema3 <= 75.7587 )
									ret := 0.300000
								if( ema3 > 75.7587 )
									ret := 0.708333 // buy
				if( tema > 79.8398 )
					if( ema3 <= 93.2814 )
						if( tema <= 84.5581 )
							if( bbp <= 2.93248 )
								if( ema3 <= 81.9086 )
									ret := 0.801724 // buy
								if( ema3 > 81.9086 )
									ret := 0.403509
							if( bbp > 2.93248 )
								if( bbm <= 0.8045 )
									ret := 0.500000
								if( bbm > 0.8045 )
									ret := -0.761905 // sell
						if( tema > 84.5581 )
							if( bbm <= 1.8973 )
								if( ema2 <= 82.7075 )
									ret := -1.000000 // sell
								if( ema2 > 82.7075 )
									ret := 0.085531
							if( bbm > 1.8973 )
								if( tema <= 97.6645 )
									ret := 0.700000 // buy
								if( tema > 97.6645 )
									ret := -0.800000 // sell
					if( ema3 > 93.2814 )
						if( ema13 <= 0.594255 )
							ret := -0.100000
						if( ema13 > 0.594255 )
							if( bearPower <= 1.0393 )
								if( bbp <= 0.635955 )
									ret := 0.500000
								if( bbp > 0.635955 )
									ret := 0.983193 // buy
							if( bearPower > 1.0393 )
								if( ema2 <= 94.52 )
									ret := 0.076923
								if( ema2 > 94.52 )
									ret := 0.454545
			if( ema2 > 94.8502 )
				if( tema <= 389.957 )
					if( ema1 <= 344.511 )
						if( bullPower <= 8.87832 )
							if( bbm <= 3.4605 )
								if( ema3 <= 95.4977 )
									ret := -0.526667
								if( ema3 > 95.4977 )
									ret := -0.096684
							if( bbm > 3.4605 )
								if( ema3 <= 315.794 )
									ret := 0.195076
								if( ema3 > 315.794 )
									ret := -0.337500
						if( bullPower > 8.87832 )
							if( bullPower <= 18.9868 )
								if( ema12 <= 5.46544 )
									ret := 0.681034
								if( ema12 > 5.46544 )
									ret := -0.025641
							if( bullPower > 18.9868 )
								if( ema12 <= 13.3177 )
									ret := -1.000000 // sell
								if( ema12 > 13.3177 )
									ret := 0.285714
					if( ema1 > 344.511 )
						if( ema2 <= 380.852 )
							if( ema12 <= 2.56114 )
								if( ema3 <= 346.668 )
									ret := 0.392405
								if( ema3 > 346.668 )
									ret := 0.094398
							if( ema12 > 2.56114 )
								if( tema <= 384.504 )
									ret := -0.038760
								if( tema > 384.504 )
									ret := -0.865672 // sell
						if( ema2 > 380.852 )
							if( bearPower <= 2.49419 )
								if( bbm <= 3.40595 )
									ret := 0.414201
								if( bbm > 3.40595 )
									ret := 0.916667 // buy
							if( bearPower > 2.49419 )
								if( ema13 <= 4.86035 )
									ret := 0.000000
								if( ema13 > 4.86035 )
									ret := -0.714286 // sell
				if( tema > 389.957 )
					if( ema1 <= 397.373 )
						if( ema13 <= 1.34459 )
							if( tema <= 390.47 )
								if( bullPower <= 1.47453 )
									ret := -0.727273 // sell
								if( bullPower > 1.47453 )
									ret := -1.000000 // sell
							if( tema > 390.47 )
								if( ema1 <= 392.947 )
									ret := 0.709677 // buy
								if( ema1 > 392.947 )
									ret := 0.000000
						if( ema13 > 1.34459 )
							if( tema <= 398.914 )
								if( ema2 <= 394.989 )
									ret := -0.480427
								if( ema2 > 394.989 )
									ret := -0.888889 // sell
							if( tema > 398.914 )
								if( ema13 <= 3.08514 )
									ret := -0.900000 // sell
								if( ema13 > 3.08514 )
									ret := -1.000000 // sell
					if( ema1 > 397.373 )
						if( ema1 <= 435.395 )
							if( bearPower <= 1.97595 )
								if( ema3 <= 396.262 )
									ret := 1.000000 // buy
								if( ema3 > 396.262 )
									ret := 0.261438
							if( bearPower > 1.97595 )
								if( tema <= 412.841 )
									ret := -0.020000
								if( tema > 412.841 )
									ret := -0.744681 // sell
						if( ema1 > 435.395 )
							if( bearPower <= 4.28232 )
								if( bearPower <= 1.49256 )
									ret := -0.840000 // sell
								if( bearPower > 1.49256 )
									ret := -0.966667 // sell
							if( bearPower > 4.28232 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_TWLO_15Min_a40ba5c9(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


