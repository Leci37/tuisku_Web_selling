//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: ETHUSDT_30Min_1FIB_4270f070 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1FIB_4270f070", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_4270f070(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( lower_6 <= 1650.28 )
		if( upper_4 <= 1943.24 )
			if( lower_4 <= 1072.43 )
				if( upper_5 <= 699.634 )
					if( lower_4 <= 578.491 )
						if( upper_1 <= 359.987 )
							if( basis_max <= -15.0024 )
								if( upper_2 <= 352.043 )
									ret := 0.647059
								if( upper_2 > 352.043 )
									ret := 0.190898
							if( basis_max > -15.0024 )
								if( upper_1 <= 359.28 )
									ret := -0.273810
								if( upper_1 > 359.28 )
									ret := 0.600000
						if( upper_1 > 359.987 )
							if( lower_1 <= 361.613 )
								if( upper_5 <= 390.073 )
									ret := -0.052885
								if( upper_5 > 390.073 )
									ret := -0.521875
							if( lower_1 > 361.613 )
								if( lower_2 <= 361.201 )
									ret := 0.633721
								if( lower_2 > 361.201 )
									ret := 0.035521
					if( lower_4 > 578.491 )
						if( upper_3 <= 665.038 )
							if( upper_1 <= 655.778 )
								if( lower_4 <= 620.941 )
									ret := -0.541463
								if( lower_4 > 620.941 )
									ret := 0.205882
							if( upper_1 > 655.778 )
								if( basis <= 649.312 )
									ret := -0.692308
								if( basis > 649.312 )
									ret := -1.000000 // sell
						if( upper_3 > 665.038 )
							if( upper_4 <= 672.663 )
								if( lower_5 <= 596.514 )
									ret := 0.950000 // buy
								if( lower_5 > 596.514 )
									ret := 0.666667
							if( upper_4 > 672.663 )
								if( lower_5 <= 599.26 )
									ret := -0.236842
								if( lower_5 > 599.26 )
									ret := -0.944444 // sell
				if( upper_5 > 699.634 )
					if( basis <= 1138.94 )
						if( upper_2 <= 1252.92 )
							if( upper_4 <= 750.652 )
								if( lower_3 <= 601.857 )
									ret := 0.586466
								if( lower_3 > 601.857 )
									ret := 0.978723 // buy
							if( upper_4 > 750.652 )
								if( upper_2 <= 725.376 )
									ret := -0.848485 // sell
								if( upper_2 > 725.376 )
									ret := 0.219810
						if( upper_2 > 1252.92 )
							ret := -1.000000 // sell
					if( basis > 1138.94 )
						if( basis <= 1168.02 )
							if( upper_5 <= 1255.34 )
								if( basis_max <= -114.064 )
									ret := 0.658537
								if( basis_max > -114.064 )
									ret := 0.062500
							if( upper_5 > 1255.34 )
								if( basis_minus <= 206.703 )
									ret := -0.413690
								if( basis_minus > 206.703 )
									ret := 0.108911
						if( basis > 1168.02 )
							if( lower_1 <= 1112.48 )
								if( lower_2 <= 1068.29 )
									ret := 1.000000 // buy
								if( lower_2 > 1068.29 )
									ret := 0.714286 // buy
							if( lower_1 > 1112.48 )
								if( lower_5 <= 971.607 )
									ret := -0.169565
								if( lower_5 > 971.607 )
									ret := 0.369919
			if( lower_4 > 1072.43 )
				if( lower_6 <= 1108.1 )
					if( lower_4 <= 1139.61 )
						if( upper_5 <= 1296.94 )
							if( upper_3 <= 1259.36 )
								if( upper_3 <= 1257.22 )
									ret := -0.293333
								if( upper_3 > 1257.22 )
									ret := 0.794118 // buy
							if( upper_3 > 1259.36 )
								if( lower_2 <= 1153.93 )
									ret := -0.969697 // sell
								if( lower_2 > 1153.93 )
									ret := -0.636364
						if( upper_5 > 1296.94 )
							if( basis <= 1200.81 )
								if( lower_2 <= 1134.37 )
									ret := 0.465909
								if( lower_2 > 1134.37 )
									ret := 0.939394 // buy
							if( basis > 1200.81 )
								if( upper_1 <= 1263.75 )
									ret := -0.530726
								if( upper_1 > 1263.75 )
									ret := 0.016970
					if( lower_4 > 1139.61 )
						if( upper_5 <= 1626.29 )
							if( upper_1 <= 1351.68 )
								if( upper_2 <= 1373.95 )
									ret := -0.478723
								if( upper_2 > 1373.95 )
									ret := 0.063291
							if( upper_1 > 1351.68 )
								if( lower_3 <= 1192.56 )
									ret := 0.000000
								if( lower_3 > 1192.56 )
									ret := -0.861702 // sell
						if( upper_5 > 1626.29 )
							if( upper_6 <= 1756.63 )
								if( basis <= 1387.79 )
									ret := 0.863636 // buy
								if( basis > 1387.79 )
									ret := 0.411765
							if( upper_6 > 1756.63 )
								if( lower_6 <= 974.158 )
									ret := 1.000000 // buy
								if( lower_6 > 974.158 )
									ret := -0.403846
				if( lower_6 > 1108.1 )
					if( upper_4 <= 1816.57 )
						if( upper_6 <= 1797.68 )
							if( lower_3 <= 1645.12 )
								if( upper_6 <= 1790.63 )
									ret := 0.035090
								if( upper_6 > 1790.63 )
									ret := -0.277580
							if( lower_3 > 1645.12 )
								if( basis <= 1684.04 )
									ret := -0.655738
								if( basis > 1684.04 )
									ret := -0.332130
						if( upper_6 > 1797.68 )
							if( lower_3 <= 1359.72 )
								if( upper_1 <= 1615.9 )
									ret := 0.645161
								if( upper_1 > 1615.9 )
									ret := 1.000000 // buy
							if( lower_3 > 1359.72 )
								if( basis_max <= -318.097 )
									ret := -0.252294
								if( basis_max > -318.097 )
									ret := 0.202338
					if( upper_4 > 1816.57 )
						if( lower_2 <= 1496.88 )
							if( upper_2 <= 1824.71 )
								if( lower_1 <= 1519.47 )
									ret := -0.183206
								if( lower_1 > 1519.47 )
									ret := -0.733333 // sell
							if( upper_2 > 1824.71 )
								ret := 1.000000 // buy
						if( lower_2 > 1496.88 )
							if( lower_3 <= 1523.38 )
								if( lower_3 <= 1496.86 )
									ret := 0.052632
								if( lower_3 > 1496.86 )
									ret := 0.619048
							if( lower_3 > 1523.38 )
								if( upper_3 <= 1856.18 )
									ret := -0.171353
								if( upper_3 > 1856.18 )
									ret := 0.106557
		if( upper_4 > 1943.24 )
			if( lower_4 <= 1391.63 )
				if( lower_5 <= 1314.54 )
					if( upper_5 <= 2060.73 )
						if( basis_max <= -464.636 )
							ret := 0.666667
						if( basis_max > -464.636 )
							ret := 0.363636
					if( upper_5 > 2060.73 )
						ret := 0.315789
				if( lower_5 > 1314.54 )
					if( upper_1 <= 1831.16 )
						ret := -1.000000 // sell
					if( upper_1 > 1831.16 )
						if( upper_3 <= 1971.45 )
							ret := -0.777778 // sell
						if( upper_3 > 1971.45 )
							ret := -0.923077 // sell
			if( lower_4 > 1391.63 )
				if( upper_6 <= 2112.54 )
					if( upper_4 <= 2012.32 )
						if( upper_5 <= 2043.21 )
							if( upper_5 <= 1991.99 )
								if( upper_5 <= 1984.03 )
									ret := 0.529412
								if( upper_5 > 1984.03 )
									ret := -0.342105
							if( upper_5 > 1991.99 )
								if( lower_3 <= 1570.74 )
									ret := 1.000000 // buy
								if( lower_3 > 1570.74 )
									ret := 0.390000
						if( upper_5 > 2043.21 )
							ret := -0.916667 // sell
					if( upper_4 > 2012.32 )
						if( lower_6 <= 1641.7 )
							if( lower_3 <= 1752.53 )
								ret := -0.142857
							if( lower_3 > 1752.53 )
								if( lower_1 <= 1816.55 )
									ret := 0.975309 // buy
								if( lower_1 > 1816.55 )
									ret := 0.757576 // buy
						if( lower_6 > 1641.7 )
							ret := 0.071429
				if( upper_6 > 2112.54 )
					if( lower_1 <= 1641.07 )
						if( lower_5 <= 1317.65 )
							ret := 0.416667
						if( lower_5 > 1317.65 )
							if( lower_1 <= 1609.61 )
								if( lower_5 <= 1321.2 )
									ret := 1.000000 // buy
								if( lower_5 > 1321.2 )
									ret := 0.687500
							if( lower_1 > 1609.61 )
								ret := 1.000000 // buy
					if( lower_1 > 1641.07 )
						if( upper_2 <= 1983.11 )
							if( basis_max <= -265.994 )
								if( lower_6 <= 1322.45 )
									ret := -0.884615 // sell
								if( lower_6 > 1322.45 )
									ret := 0.172589
							if( basis_max > -265.994 )
								if( basis <= 1887.74 )
									ret := -0.378698
								if( basis > 1887.74 )
									ret := -1.000000 // sell
						if( upper_2 > 1983.11 )
							if( upper_4 <= 2196 )
								if( lower_4 <= 1736.32 )
									ret := 0.280156
								if( lower_4 > 1736.32 )
									ret := 0.721805 // buy
							if( upper_4 > 2196 )
								if( upper_6 <= 2418.69 )
									ret := -0.432692
								if( upper_6 > 2418.69 )
									ret := 0.232038
	if( lower_6 > 1650.28 )
		if( upper_5 <= 3517.4 )
			if( basis <= 3313.87 )
				if( basis_max <= -647.347 )
					if( upper_6 <= 3558.87 )
						if( basis_minus <= 738.218 )
							if( upper_1 <= 2983.46 )
								if( upper_6 <= 3113.07 )
									ret := -0.230769
								if( upper_6 > 3113.07 )
									ret := -0.923372 // sell
							if( upper_1 > 2983.46 )
								ret := 0.944444 // buy
						if( basis_minus > 738.218 )
							if( upper_3 <= 3006.75 )
								if( lower_1 <= 2321.29 )
									ret := -0.043860
								if( lower_1 > 2321.29 )
									ret := 0.556522
							if( upper_3 > 3006.75 )
								if( lower_2 <= 2487.84 )
									ret := -0.950000 // sell
								if( lower_2 > 2487.84 )
									ret := -0.153846
					if( upper_6 > 3558.87 )
						if( upper_3 <= 3122.47 )
							ret := 1.000000 // buy
						if( upper_3 > 3122.47 )
							if( upper_2 <= 3052.51 )
								if( upper_6 <= 3595.22 )
									ret := -0.727273 // sell
								if( upper_6 > 3595.22 )
									ret := -1.000000 // sell
							if( upper_2 > 3052.51 )
								if( lower_4 <= 2207.66 )
									ret := 0.341463
								if( lower_4 > 2207.66 )
									ret := 0.965517 // buy
				if( basis_max > -647.347 )
					if( lower_6 <= 3120.68 )
						if( upper_4 <= 2202.09 )
							if( upper_3 <= 1842.65 )
								if( upper_4 <= 1849.19 )
									ret := 0.073428
								if( upper_4 > 1849.19 )
									ret := 0.472222
							if( upper_3 > 1842.65 )
								if( basis <= 1799.11 )
									ret := -0.370787
								if( basis > 1799.11 )
									ret := -0.069513
						if( upper_4 > 2202.09 )
							if( upper_1 <= 2175.37 )
								if( lower_1 <= 1989.2 )
									ret := 0.187500
								if( lower_1 > 1989.2 )
									ret := 0.768595 // buy
							if( upper_1 > 2175.37 )
								if( upper_3 <= 2228.86 )
									ret := 0.563025
								if( upper_3 > 2228.86 )
									ret := 0.016507
					if( lower_6 > 3120.68 )
						if( basis_max <= -85.2296 )
							if( upper_3 <= 3372.69 )
								if( lower_2 <= 3232.69 )
									ret := -0.748428 // sell
								if( lower_2 > 3232.69 )
									ret := -0.417910
							if( upper_3 > 3372.69 )
								if( lower_4 <= 3230.41 )
									ret := 0.000000
								if( lower_4 > 3230.41 )
									ret := 0.066667
						if( basis_max > -85.2296 )
							ret := 0.625000
			if( basis > 3313.87 )
				if( lower_2 <= 3311.21 )
					if( upper_6 <= 3472.41 )
						if( upper_3 <= 3361.79 )
							ret := 1.000000 // buy
						if( upper_3 > 3361.79 )
							if( basis <= 3316.5 )
								ret := -0.437500
							if( basis > 3316.5 )
								if( basis_minus <= 115.899 )
									ret := 0.000000
								if( basis_minus > 115.899 )
									ret := 0.428571
					if( upper_6 > 3472.41 )
						if( upper_1 <= 3404.75 )
							if( lower_2 <= 3244.92 )
								ret := 1.000000 // buy
							if( lower_2 > 3244.92 )
								if( lower_1 <= 3301.45 )
									ret := 0.173913
								if( lower_1 > 3301.45 )
									ret := 0.905405 // buy
						if( upper_1 > 3404.75 )
							if( upper_6 <= 3549.83 )
								if( upper_1 <= 3407.01 )
									ret := 0.142857
								if( upper_1 > 3407.01 )
									ret := 0.857143 // buy
							if( upper_6 > 3549.83 )
								ret := -0.076923
				if( lower_2 > 3311.21 )
					if( lower_3 <= 3308.28 )
						if( basis <= 3369.17 )
							if( upper_5 <= 3477.56 )
								if( upper_4 <= 3450.16 )
									ret := 0.000000
								if( upper_4 > 3450.16 )
									ret := -0.642857
							if( upper_5 > 3477.56 )
								ret := 0.555556
						if( basis > 3369.17 )
							if( lower_4 <= 3282.64 )
								ret := -0.636364
							if( lower_4 > 3282.64 )
								if( upper_2 <= 3423.06 )
									ret := -1.000000 // sell
								if( upper_2 > 3423.06 )
									ret := -0.923077 // sell
					if( lower_3 > 3308.28 )
						if( lower_5 <= 3340.21 )
							if( basis_max <= -124.865 )
								if( upper_4 <= 3476.41 )
									ret := 0.000000
								if( upper_4 > 3476.41 )
									ret := 0.500000
							if( basis_max > -124.865 )
								if( upper_4 <= 3479.29 )
									ret := 0.027397
								if( upper_4 > 3479.29 )
									ret := -0.142857
						if( lower_5 > 3340.21 )
							if( lower_1 <= 3408.3 )
								if( upper_1 <= 3454.17 )
									ret := 0.441176
								if( upper_1 > 3454.17 )
									ret := 0.848485 // buy
							if( lower_1 > 3408.3 )
								ret := 0.083333
		if( upper_5 > 3517.4 )
			if( basis_max <= -527.338 )
				if( lower_2 <= 2446.6 )
					if( upper_5 <= 3612.57 )
						ret := -0.555556
					if( upper_5 > 3612.57 )
						ret := -1.000000 // sell
				if( lower_2 > 2446.6 )
					if( lower_2 <= 3505.71 )
						if( upper_1 <= 3832.24 )
							if( basis <= 3627.99 )
								if( upper_5 <= 4232.55 )
									ret := 0.002801
								if( upper_5 > 4232.55 )
									ret := 0.662651
							if( basis > 3627.99 )
								if( lower_5 <= 3245.38 )
									ret := 0.734177 // buy
								if( lower_5 > 3245.38 )
									ret := -0.454545
						if( upper_1 > 3832.24 )
							if( upper_3 <= 4023.84 )
								if( lower_4 <= 3298.56 )
									ret := -0.611111
								if( lower_4 > 3298.56 )
									ret := -0.973684 // sell
							if( upper_3 > 4023.84 )
								if( upper_5 <= 4254.71 )
									ret := -0.125000
								if( upper_5 > 4254.71 )
									ret := -0.620000
					if( lower_2 > 3505.71 )
						if( lower_5 <= 3840.61 )
							if( upper_4 <= 4764.24 )
								if( basis_minus <= 762.799 )
									ret := 0.390543
								if( basis_minus > 762.799 )
									ret := -0.714286 // sell
							if( upper_4 > 4764.24 )
								if( upper_6 <= 5089.41 )
									ret := 1.000000 // buy
								if( upper_6 > 5089.41 )
									ret := 0.761905 // buy
						if( lower_5 > 3840.61 )
							if( lower_5 <= 3906.04 )
								if( lower_1 <= 4218.11 )
									ret := -0.262500
								if( lower_1 > 4218.11 )
									ret := -0.810811 // sell
							if( lower_5 > 3906.04 )
								if( lower_5 <= 3965.94 )
									ret := 0.408451
								if( lower_5 > 3965.94 )
									ret := -0.375000
			if( basis_max > -527.338 )
				if( lower_2 <= 3127.21 )
					if( lower_2 <= 3103.89 )
						if( lower_1 <= 3026.51 )
							if( upper_6 <= 3665.63 )
								if( basis <= 3145.51 )
									ret := -1.000000 // sell
								if( basis > 3145.51 )
									ret := -0.812500 // sell
							if( upper_6 > 3665.63 )
								ret := 0.000000
						if( lower_1 > 3026.51 )
							if( upper_6 <= 3743.32 )
								if( basis_minus <= 493.71 )
									ret := 0.404255
								if( basis_minus > 493.71 )
									ret := 1.000000 // buy
							if( upper_6 > 3743.32 )
								if( lower_3 <= 3040.29 )
									ret := 0.085714
								if( lower_3 > 3040.29 )
									ret := -1.000000 // sell
					if( lower_2 > 3103.89 )
						if( lower_4 <= 3025.86 )
							if( lower_5 <= 2958.93 )
								if( upper_6 <= 3722.39 )
									ret := -1.000000 // sell
								if( upper_6 > 3722.39 )
									ret := -0.714286 // sell
							if( lower_5 > 2958.93 )
								ret := 0.000000
						if( lower_4 > 3025.86 )
							if( lower_5 <= 2987.13 )
								ret := -1.000000 // sell
							if( lower_5 > 2987.13 )
								ret := -0.818182 // sell
				if( lower_2 > 3127.21 )
					if( upper_3 <= 3471.08 )
						if( lower_4 <= 3132.15 )
							if( upper_5 <= 3546.79 )
								if( lower_5 <= 3035.8 )
									ret := 0.050000
								if( lower_5 > 3035.8 )
									ret := -0.370370
							if( upper_5 > 3546.79 )
								if( basis_max <= -359.341 )
									ret := -0.470588
								if( basis_max > -359.341 )
									ret := 0.714286 // buy
						if( lower_4 > 3132.15 )
							if( lower_1 <= 3284.73 )
								if( lower_3 <= 3213.06 )
									ret := 1.000000 // buy
								if( lower_3 > 3213.06 )
									ret := 0.909091 // buy
							if( lower_1 > 3284.73 )
								ret := -0.090909
					if( upper_3 > 3471.08 )
						if( upper_3 <= 3494.22 )
							if( basis_minus <= 276.7 )
								if( upper_1 <= 3410.88 )
									ret := 0.000000
								if( upper_1 > 3410.88 )
									ret := -0.516539
							if( basis_minus > 276.7 )
								if( upper_5 <= 3578.59 )
									ret := 0.227273
								if( upper_5 > 3578.59 )
									ret := -0.666667
						if( upper_3 > 3494.22 )
							if( lower_2 <= 3217.06 )
								if( lower_1 <= 3238.02 )
									ret := -0.201613
								if( lower_1 > 3238.02 )
									ret := 0.304348
							if( lower_2 > 3217.06 )
								if( basis_minus <= 92.5278 )
									ret := -0.347826
								if( basis_minus > 92.5278 )
									ret := -0.075025
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_ETHUSDT_30Min_4270f070(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


