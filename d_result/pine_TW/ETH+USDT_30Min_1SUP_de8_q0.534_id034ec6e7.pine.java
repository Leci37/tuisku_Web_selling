//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: ETHUSDT_30Min_1SUP_034ec6e7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1SUP_034ec6e7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_034ec6e7(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up1 <= 3121.2 )
		if( atr <= 12.9643 )
			if( dn <= 349.344 )
				if( up <= 333.138 )
					if( trend <= 0.997322 )
						ret := -1.000000 // sell
					if( trend > 0.997322 )
						if( dn1 <= 346.187 )
							if( atr2 <= 2.7495 )
								if( dn <= 345.268 )
									ret := 0.810127 // buy
								if( dn > 345.268 )
									ret := -0.600000
							if( atr2 > 2.7495 )
								if( atr <= 3.4253 )
									ret := 0.142857
								if( atr > 3.4253 )
									ret := -0.285714
						if( dn1 > 346.187 )
							if( atr2 <= 3.27082 )
								if( up1 <= 332.042 )
									ret := 0.214286
								if( up1 > 332.042 )
									ret := 1.000000 // buy
							if( atr2 > 3.27082 )
								if( up1 <= 326.119 )
									ret := 0.821429 // buy
								if( up1 > 326.119 )
									ret := 1.000000 // buy
				if( up > 333.138 )
					if( dn <= 346.766 )
						if( atr <= 1.93034 )
							if( atr2 <= 1.91341 )
								if( up <= 335.007 )
									ret := 0.800000 // buy
								if( up > 335.007 )
									ret := -0.130435
							if( atr2 > 1.91341 )
								ret := -0.666667
						if( atr > 1.93034 )
							if( atr2 <= 1.9951 )
								if( dn <= 345.468 )
									ret := -0.666667
								if( dn > 345.468 )
									ret := -1.000000 // sell
							if( atr2 > 1.9951 )
								if( dn <= 346.113 )
									ret := 0.000000
								if( dn > 346.113 )
									ret := -0.750000 // sell
					if( dn > 346.766 )
						if( atr <= 2.19452 )
							ret := 0.000000
						if( atr > 2.19452 )
							ret := 0.500000
			if( dn > 349.344 )
				if( up <= 2293.45 )
					if( up <= 321.386 )
						if( up <= 309.348 )
							if( atr2 <= 12.922 )
								if( atr2 <= 7.88171 )
									ret := 1.000000 // buy
								if( atr2 > 7.88171 )
									ret := -0.888889 // sell
							if( atr2 > 12.922 )
								ret := 1.000000 // buy
						if( up > 309.348 )
							if( dn1 <= 373.818 )
								if( up <= 320.589 )
									ret := 0.981132 // buy
								if( up > 320.589 )
									ret := 0.500000
							if( dn1 > 373.818 )
								if( up1 <= 316.731 )
									ret := -0.400000
								if( up1 > 316.731 )
									ret := 0.750000 // buy
					if( up > 321.386 )
						if( up1 <= 331.805 )
							if( dn <= 373.34 )
								if( atr2 <= 8.27718 )
									ret := -0.287770
								if( atr2 > 8.27718 )
									ret := 0.875000 // buy
							if( dn > 373.34 )
								if( dn <= 381.062 )
									ret := -1.000000 // sell
								if( dn > 381.062 )
									ret := -0.750000 // sell
						if( up1 > 331.805 )
							if( dn <= 2337.77 )
								if( dn1 <= 1623.41 )
									ret := 0.045915
								if( dn1 > 1623.41 )
									ret := 0.006363
							if( dn > 2337.77 )
								if( up <= 2278.27 )
									ret := 0.666667
								if( up > 2278.27 )
									ret := 0.076923
				if( up > 2293.45 )
					if( dn <= 2373.64 )
						if( atr2 <= 9.68369 )
							if( dn1 <= 2350.53 )
								if( up <= 2300.47 )
									ret := 0.000000
								if( up > 2300.47 )
									ret := -0.250000
							if( dn1 > 2350.53 )
								if( up <= 2323.38 )
									ret := -0.666667
								if( up > 2323.38 )
									ret := -0.095238
						if( atr2 > 9.68369 )
							if( up1 <= 2298.28 )
								if( up1 <= 2295.1 )
									ret := -0.222222
								if( up1 > 2295.1 )
									ret := -0.888889 // sell
							if( up1 > 2298.28 )
								if( up1 <= 2317.72 )
									ret := 0.444444
								if( up1 > 2317.72 )
									ret := -1.000000 // sell
					if( dn > 2373.64 )
						if( up1 <= 2320.52 )
							if( dn <= 2381.73 )
								if( up <= 2319.67 )
									ret := 0.300000
								if( up > 2319.67 )
									ret := -0.750000 // sell
							if( dn > 2381.73 )
								if( dn1 <= 2384.85 )
									ret := 0.928571 // buy
								if( dn1 > 2384.85 )
									ret := 0.333333
						if( up1 > 2320.52 )
							if( up1 <= 2394.43 )
								if( atr2 <= 11.9626 )
									ret := -0.083045
								if( atr2 > 11.9626 )
									ret := -0.533981
							if( up1 > 2394.43 )
								if( up1 <= 2416.03 )
									ret := 0.207071
								if( up1 > 2416.03 )
									ret := -0.045455
		if( atr > 12.9643 )
			if( dn1 <= 1153.09 )
				if( up1 <= 1022.7 )
					if( atr <= 26.0185 )
						if( atr2 <= 13.4079 )
							if( up1 <= 478.965 )
								if( up <= 457.612 )
									ret := 0.750000 // buy
								if( up > 457.612 )
									ret := 1.000000 // buy
							if( up1 > 478.965 )
								if( atr2 <= 12.179 )
									ret := 0.000000
								if( atr2 > 12.179 )
									ret := -0.692308
						if( atr2 > 13.4079 )
							if( dn <= 1009.89 )
								if( dn <= 983.225 )
									ret := 0.493333
								if( dn > 983.225 )
									ret := -0.692308
							if( dn > 1009.89 )
								if( dn <= 1144.29 )
									ret := 0.729443 // buy
								if( dn > 1144.29 )
									ret := -0.500000
					if( atr > 26.0185 )
						if( atr <= 27.0726 )
							if( dn1 <= 1111.4 )
								if( dn1 <= 1088.52 )
									ret := -0.538462
								if( dn1 > 1088.52 )
									ret := 0.666667
							if( dn1 > 1111.4 )
								if( atr <= 26.5399 )
									ret := -0.571429
								if( atr > 26.5399 )
									ret := -1.000000 // sell
						if( atr > 27.0726 )
							if( atr <= 42.1747 )
								if( atr2 <= 28.8123 )
									ret := -0.105263
								if( atr2 > 28.8123 )
									ret := 0.461538
							if( atr > 42.1747 )
								if( atr2 <= 55.0762 )
									ret := 1.000000 // buy
								if( atr2 > 55.0762 )
									ret := 0.666667
				if( up1 > 1022.7 )
					if( up <= 1052.46 )
						if( dn1 <= 1123.04 )
							if( dn <= 1114.35 )
								if( dn <= 1103.83 )
									ret := 0.500000
								if( dn > 1103.83 )
									ret := -0.866667 // sell
							if( dn > 1114.35 )
								ret := 1.000000 // buy
						if( dn1 > 1123.04 )
							if( atr <= 19.2784 )
								if( up <= 1040.19 )
									ret := -0.861111 // sell
								if( up > 1040.19 )
									ret := -0.416667
							if( atr > 19.2784 )
								ret := 0.250000
					if( up > 1052.46 )
						if( up1 <= 1065.99 )
							if( dn1 <= 1148.6 )
								if( dn <= 1132.31 )
									ret := 0.894737 // buy
								if( dn > 1132.31 )
									ret := -0.117647
							if( dn1 > 1148.6 )
								ret := 1.000000 // buy
						if( up1 > 1065.99 )
							if( up <= 1073.07 )
								if( up <= 1069.57 )
									ret := -0.500000
								if( up > 1069.57 )
									ret := -1.000000 // sell
							if( up > 1073.07 )
								ret := 0.250000
			if( dn1 > 1153.09 )
				if( dn1 <= 3418.16 )
					if( up1 <= 2299.09 )
						if( atr <= 19.3108 )
							if( up1 <= 1739.72 )
								if( dn1 <= 1178.28 )
									ret := -0.187097
								if( dn1 > 1178.28 )
									ret := 0.184459
							if( up1 > 1739.72 )
								if( dn1 <= 1854.83 )
									ret := -0.179331
								if( dn1 > 1854.83 )
									ret := 0.096015
						if( atr > 19.3108 )
							if( atr <= 32.5033 )
								if( atr2 <= 25.824 )
									ret := 0.058167
								if( atr2 > 25.824 )
									ret := -0.047835
							if( atr > 32.5033 )
								if( dn <= 1841.99 )
									ret := 0.028504
								if( dn > 1841.99 )
									ret := 0.233333
					if( up1 > 2299.09 )
						if( dn1 <= 2488.86 )
							if( up <= 2335.13 )
								if( atr2 <= 26.7126 )
									ret := 0.014989
								if( atr2 > 26.7126 )
									ret := -0.712121 // sell
							if( up > 2335.13 )
								if( dn <= 2469.38 )
									ret := -0.549180
								if( dn > 2469.38 )
									ret := -0.084906
						if( dn1 > 2488.86 )
							if( trend <= 0.97199 )
								if( atr2 <= 20.604 )
									ret := -0.307692
								if( atr2 > 20.604 )
									ret := -0.742857 // sell
							if( trend > 0.97199 )
								if( dn <= 2511.8 )
									ret := 0.275641
								if( dn > 2511.8 )
									ret := 0.063232
				if( dn1 > 3418.16 )
					if( dn <= 3769.64 )
						if( up <= 3111.6 )
							if( atr <= 83.7771 )
								if( up1 <= 2971.42 )
									ret := -0.400000
								if( up1 > 2971.42 )
									ret := 0.770492 // buy
							if( atr > 83.7771 )
								if( atr2 <= 122.06 )
									ret := 1.000000 // buy
								if( atr2 > 122.06 )
									ret := 0.750000 // buy
						if( up > 3111.6 )
							if( dn <= 3663.73 )
								if( dn1 <= 3573.32 )
									ret := 0.210526
								if( dn1 > 3573.32 )
									ret := -0.666667
							if( dn > 3663.73 )
								if( up <= 3142 )
									ret := 1.000000 // buy
								if( up > 3142 )
									ret := 0.750000 // buy
					if( dn > 3769.64 )
						if( up <= 3061.55 )
							ret := 0.250000
						if( up > 3061.55 )
							ret := -1.000000 // sell
	if( up1 > 3121.2 )
		if( atr <= 24.6999 )
			if( atr <= 17.8365 )
				if( dn1 <= 3303.31 )
					if( up1 <= 3213 )
						if( dn <= 3218.32 )
							if( dn <= 3204.75 )
								ret := 0.000000
							if( dn > 3204.75 )
								if( up <= 3136.01 )
									ret := 0.380952
								if( up > 3136.01 )
									ret := 0.777778 // buy
						if( dn > 3218.32 )
							if( dn1 <= 3235.46 )
								if( atr <= 14.9485 )
									ret := -0.142857
								if( atr > 14.9485 )
									ret := -0.548387
							if( dn1 > 3235.46 )
								if( atr <= 17.2099 )
									ret := 0.124324
								if( atr > 17.2099 )
									ret := 0.500000
					if( up1 > 3213 )
						if( atr2 <= 11.6555 )
							if( dn1 <= 3284.29 )
								if( dn1 <= 3283.75 )
									ret := 0.250000
								if( dn1 > 3283.75 )
									ret := 0.800000 // buy
							if( dn1 > 3284.29 )
								if( up <= 3244.24 )
									ret := 0.130435
								if( up > 3244.24 )
									ret := 0.500000
						if( atr2 > 11.6555 )
							if( dn <= 3293.25 )
								ret := 0.571429
							if( dn > 3293.25 )
								if( atr <= 14.8234 )
									ret := 1.000000 // buy
								if( atr > 14.8234 )
									ret := 0.500000
				if( dn1 > 3303.31 )
					if( dn <= 3860.29 )
						if( dn1 <= 3754.54 )
							if( dn1 <= 3599.42 )
								if( up1 <= 3488.77 )
									ret := -0.059618
								if( up1 > 3488.77 )
									ret := 0.375000
							if( dn1 > 3599.42 )
								if( atr2 <= 13.5043 )
									ret := -0.035714
								if( atr2 > 13.5043 )
									ret := -0.404110
						if( dn1 > 3754.54 )
							if( atr2 <= 13.8645 )
								if( atr2 <= 12.448 )
									ret := 0.000000
								if( atr2 > 12.448 )
									ret := 0.080000
							if( atr2 > 13.8645 )
								if( dn <= 3794.61 )
									ret := 0.547170
								if( dn > 3794.61 )
									ret := 0.201550
					if( dn > 3860.29 )
						if( up <= 3793.31 )
							if( up1 <= 3773.5 )
								ret := 0.000000
							if( up1 > 3773.5 )
								if( dn1 <= 3882.87 )
									ret := -0.833333 // sell
								if( dn1 > 3882.87 )
									ret := -0.250000
						if( up > 3793.31 )
							if( up1 <= 3805.42 )
								if( dn <= 3905.5 )
									ret := -0.111111
								if( dn > 3905.5 )
									ret := 1.000000 // buy
							if( up1 > 3805.42 )
								if( up <= 4003.22 )
									ret := -0.288462
								if( up > 4003.22 )
									ret := 0.022222
			if( atr > 17.8365 )
				if( up <= 3150.04 )
					if( atr2 <= 19.0814 )
						if( dn <= 3235.6 )
							if( dn1 <= 3222.86 )
								ret := 0.750000 // buy
							if( dn1 > 3222.86 )
								if( up1 <= 3129.36 )
									ret := -0.142857
								if( up1 > 3129.36 )
									ret := -1.000000 // sell
						if( dn > 3235.6 )
							if( dn <= 3247.02 )
								if( atr2 <= 17.7579 )
									ret := 0.250000
								if( atr2 > 17.7579 )
									ret := 0.857143 // buy
							if( dn > 3247.02 )
								ret := -0.428571
					if( atr2 > 19.0814 )
						if( dn1 <= 3246.31 )
							if( dn1 <= 3238.2 )
								ret := -0.500000
							if( dn1 > 3238.2 )
								ret := 0.166667
						if( dn1 > 3246.31 )
							if( atr2 <= 24.0066 )
								if( atr <= 21.9072 )
									ret := -1.000000 // sell
								if( atr > 21.9072 )
									ret := -0.620690
							if( atr2 > 24.0066 )
								if( up1 <= 3133.14 )
									ret := -0.533333
								if( up1 > 3133.14 )
									ret := 0.200000
				if( up > 3150.04 )
					if( dn <= 3267.85 )
						if( dn <= 3262.53 )
							if( atr2 <= 18.8747 )
								if( atr <= 18.7385 )
									ret := 0.250000
								if( atr > 18.7385 )
									ret := 0.800000 // buy
							if( atr2 > 18.8747 )
								ret := 1.000000 // buy
						if( dn > 3262.53 )
							if( dn <= 3266.32 )
								ret := -0.166667
							if( dn > 3266.32 )
								if( dn1 <= 3267.65 )
									ret := 0.200000
								if( dn1 > 3267.65 )
									ret := 1.000000 // buy
					if( dn > 3267.85 )
						if( dn <= 3284.06 )
							if( dn1 <= 3280.57 )
								if( up1 <= 3158.46 )
									ret := -0.444444
								if( up1 > 3158.46 )
									ret := 0.625000
							if( dn1 > 3280.57 )
								if( atr <= 22.5587 )
									ret := -0.693878
								if( atr > 22.5587 )
									ret := 0.000000
						if( dn > 3284.06 )
							if( up <= 3347.8 )
								if( dn1 <= 3446.98 )
									ret := -0.060790
								if( dn1 > 3446.98 )
									ret := 0.323699
							if( up > 3347.8 )
								if( dn <= 3705.96 )
									ret := -0.208850
								if( dn > 3705.96 )
									ret := -0.077381
		if( atr > 24.6999 )
			if( dn1 <= 4845.09 )
				if( dn1 <= 4357.94 )
					if( dn1 <= 4045.64 )
						if( atr <= 92.6794 )
							if( atr2 <= 37.904 )
								if( dn <= 3866.62 )
									ret := 0.094846
								if( dn > 3866.62 )
									ret := -0.076923
							if( atr2 > 37.904 )
								if( up <= 3484.95 )
									ret := -0.156283
								if( up > 3484.95 )
									ret := 0.105263
						if( atr > 92.6794 )
							if( up <= 3327.78 )
								if( atr2 <= 112.193 )
									ret := -0.285714
								if( atr2 > 112.193 )
									ret := 1.000000 // buy
							if( up > 3327.78 )
								if( dn <= 4004.54 )
									ret := 0.962963 // buy
								if( dn > 4004.54 )
									ret := 0.250000
					if( dn1 > 4045.64 )
						if( up <= 3672.12 )
							if( up <= 3504.73 )
								if( up1 <= 3420.82 )
									ret := 0.500000
								if( up1 > 3420.82 )
									ret := 1.000000 // buy
							if( up > 3504.73 )
								if( atr <= 118.018 )
									ret := -0.575342
								if( atr > 118.018 )
									ret := 0.571429
						if( up > 3672.12 )
							if( up <= 3696.76 )
								if( up1 <= 3638.47 )
									ret := 0.500000
								if( up1 > 3638.47 )
									ret := 0.967742 // buy
							if( up > 3696.76 )
								if( atr <= 56.6939 )
									ret := 0.261741
								if( atr > 56.6939 )
									ret := -0.081967
				if( dn1 > 4357.94 )
					if( up <= 4330.19 )
						if( dn <= 4432.99 )
							if( dn <= 4381.64 )
								if( atr <= 35.3089 )
									ret := 0.053571
								if( atr > 35.3089 )
									ret := -0.485075
							if( dn > 4381.64 )
								if( dn1 <= 4389.25 )
									ret := 0.807692 // buy
								if( dn1 > 4389.25 )
									ret := 0.000000
						if( dn > 4432.99 )
							if( up1 <= 4161.37 )
								if( atr2 <= 73.643 )
									ret := -0.869565 // sell
								if( atr2 > 73.643 )
									ret := -0.285714
							if( up1 > 4161.37 )
								if( up <= 4291.97 )
									ret := -0.366071
								if( up > 4291.97 )
									ret := -0.046729
					if( up > 4330.19 )
						if( up1 <= 4348.92 )
							if( atr <= 41.4162 )
								if( atr <= 40.244 )
									ret := 0.594595
								if( atr > 40.244 )
									ret := -0.666667
							if( atr > 41.4162 )
								if( up1 <= 4326.95 )
									ret := 0.833333 // buy
								if( up1 > 4326.95 )
									ret := 1.000000 // buy
						if( up1 > 4348.92 )
							if( dn <= 4616.31 )
								if( dn <= 4583.09 )
									ret := 0.237500
								if( dn > 4583.09 )
									ret := -0.545455
							if( dn > 4616.31 )
								if( up <= 4426.05 )
									ret := 0.567164
								if( up > 4426.05 )
									ret := 0.046358
			if( dn1 > 4845.09 )
				if( atr2 <= 47.3724 )
					if( up1 <= 4615.83 )
						if( atr <= 43.3258 )
							ret := -1.000000 // sell
						if( atr > 43.3258 )
							if( atr2 <= 45.3385 )
								ret := -0.400000
							if( atr2 > 45.3385 )
								ret := -0.833333 // sell
					if( up1 > 4615.83 )
						if( up1 <= 4681.83 )
							if( dn <= 4846.69 )
								ret := 0.250000
							if( dn > 4846.69 )
								ret := 0.000000
						if( up1 > 4681.83 )
							if( atr2 <= 29.0189 )
								ret := -0.200000
							if( atr2 > 29.0189 )
								if( dn <= 4936.07 )
									ret := -0.868421 // sell
								if( dn > 4936.07 )
									ret := -0.250000
				if( atr2 > 47.3724 )
					if( atr <= 57.8423 )
						ret := 0.666667
					if( atr > 57.8423 )
						if( dn1 <= 4864.59 )
							ret := -0.250000
						if( dn1 > 4864.59 )
							ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_ETHUSDT_30Min_034ec6e7(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


