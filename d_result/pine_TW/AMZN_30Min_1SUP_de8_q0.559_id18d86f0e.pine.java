//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: AMZN_30Min_1SUP_18d86f0e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1SUP_18d86f0e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_18d86f0e(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dn1 <= 3306.03 )
		if( dn <= 1796.49 )
			if( up <= 1021.99 )
				if( atr2 <= 7.83462 )
					if( dn1 <= 767.784 )
						if( atr2 <= 1.68721 )
							if( dn1 <= 758.622 )
								if( dn <= 185.897 )
									ret := 0.055134
								if( dn > 185.897 )
									ret := -0.014925
							if( dn1 > 758.622 )
								if( up1 <= 759.928 )
									ret := 0.397380
								if( up1 > 759.928 )
									ret := -0.200000
						if( atr2 > 1.68721 )
							if( dn <= 108.744 )
								if( dn1 <= 105.254 )
									ret := -0.055556
								if( dn1 > 105.254 )
									ret := 0.916667 // buy
							if( dn > 108.744 )
								if( up1 <= 100.289 )
									ret := -0.289855
								if( up1 > 100.289 )
									ret := 0.138939
					if( dn1 > 767.784 )
						if( up1 <= 1002.51 )
							if( dn1 <= 789.583 )
								if( atr2 <= 3.05047 )
									ret := -0.054134
								if( atr2 > 3.05047 )
									ret := -0.258373
							if( dn1 > 789.583 )
								if( atr <= 4.88444 )
									ret := 0.005501
								if( atr > 4.88444 )
									ret := 0.256281
						if( up1 > 1002.51 )
							if( dn <= 1015.98 )
								if( dn1 <= 1015.31 )
									ret := -0.313725
								if( dn1 > 1015.31 )
									ret := -0.807692 // sell
							if( dn > 1015.98 )
								if( atr <= 3.9631 )
									ret := 0.010309
								if( atr > 3.9631 )
									ret := -0.642857
				if( atr2 > 7.83462 )
					if( up1 <= 782.805 )
						if( dn <= 612.762 )
							if( atr <= 8.36015 )
								if( dn1 <= 552.013 )
									ret := 0.928571 // buy
								if( dn1 > 552.013 )
									ret := 0.375000
							if( atr > 8.36015 )
								ret := 1.000000 // buy
						if( dn > 612.762 )
							if( up <= 725.873 )
								if( up1 <= 704.347 )
									ret := 0.294118
								if( up1 > 704.347 )
									ret := -0.500000
							if( up > 725.873 )
								if( atr <= 13.2604 )
									ret := 0.857143 // buy
								if( atr > 13.2604 )
									ret := 0.250000
					if( up1 > 782.805 )
						if( up <= 1006.75 )
							if( dn <= 973.755 )
								ret := -0.666667
							if( dn > 973.755 )
								if( atr2 <= 10.9601 )
									ret := -0.040000
								if( atr2 > 10.9601 )
									ret := 0.257143
						if( up > 1006.75 )
							if( up1 <= 1012.52 )
								ret := -1.000000 // sell
							if( up1 > 1012.52 )
								ret := -0.750000 // sell
			if( up > 1021.99 )
				if( dn1 <= 1463.68 )
					if( up <= 1440.07 )
						if( dn1 <= 1259.01 )
							if( up <= 1088.67 )
								if( up <= 1082.95 )
									ret := 0.360000
								if( up > 1082.95 )
									ret := 0.708333 // buy
							if( up > 1088.67 )
								if( atr <= 6.82947 )
									ret := 0.094041
								if( atr > 6.82947 )
									ret := -0.260870
						if( dn1 > 1259.01 )
							if( up <= 1427.49 )
								if( dn1 <= 1389.88 )
									ret := 0.427146
								if( dn1 > 1389.88 )
									ret := 0.232843
							if( up > 1427.49 )
								if( up1 <= 1432.19 )
									ret := -0.536585
								if( up1 > 1432.19 )
									ret := 0.294118
					if( up > 1440.07 )
						if( dn1 <= 1461.41 )
							ret := 1.000000 // buy
						if( dn1 > 1461.41 )
							ret := 0.600000
				if( dn1 > 1463.68 )
					if( dn1 <= 1479.12 )
						if( up <= 1375.02 )
							if( up1 <= 1297.37 )
								ret := -1.000000 // sell
							if( up1 > 1297.37 )
								if( up1 <= 1347.44 )
									ret := 0.750000 // buy
								if( up1 > 1347.44 )
									ret := 1.000000 // buy
						if( up > 1375.02 )
							if( trend <= 0.860407 )
								ret := 1.000000 // buy
							if( trend > 0.860407 )
								if( up1 <= 1434.05 )
									ret := -0.619048
								if( up1 > 1434.05 )
									ret := -0.325000
					if( dn1 > 1479.12 )
						if( atr2 <= 28.3011 )
							if( up <= 1418.28 )
								if( dn <= 1477.26 )
									ret := 0.933333 // buy
								if( dn > 1477.26 )
									ret := -0.288235
							if( up > 1418.28 )
								if( dn <= 1520.77 )
									ret := 0.289474
								if( dn > 1520.77 )
									ret := 0.115534
						if( atr2 > 28.3011 )
							if( up <= 1607.19 )
								if( atr <= 35.3068 )
									ret := -0.640625
								if( atr > 35.3068 )
									ret := 0.875000 // buy
							if( up > 1607.19 )
								if( atr <= 31.9805 )
									ret := 0.450000
								if( atr > 31.9805 )
									ret := -1.000000 // sell
		if( dn > 1796.49 )
			if( up <= 2002.48 )
				if( dn <= 1991.37 )
					if( atr2 <= 17.1414 )
						if( atr <= 13.455 )
							if( dn1 <= 1984.03 )
								if( up <= 1945.8 )
									ret := 0.007957
								if( up > 1945.8 )
									ret := -0.759036 // sell
							if( dn1 > 1984.03 )
								if( dn1 <= 1991.01 )
									ret := 0.524476
								if( dn1 > 1991.01 )
									ret := 0.114286
						if( atr > 13.455 )
							if( trend <= 0.648042 )
								ret := 1.000000 // buy
							if( trend > 0.648042 )
								if( up <= 1876.07 )
									ret := -0.444840
								if( up > 1876.07 )
									ret := -0.035294
					if( atr2 > 17.1414 )
						if( atr <= 24.8798 )
							if( dn <= 1971.7 )
								if( up1 <= 1762.55 )
									ret := 0.201835
								if( up1 > 1762.55 )
									ret := 0.619469
							if( dn > 1971.7 )
								if( up1 <= 1824.93 )
									ret := 1.000000 // buy
								if( up1 > 1824.93 )
									ret := -0.479167
						if( atr > 24.8798 )
							if( dn1 <= 1974.91 )
								if( up <= 1773.83 )
									ret := -0.029412
								if( up > 1773.83 )
									ret := -0.617647
							if( dn1 > 1974.91 )
								if( atr <= 33.254 )
									ret := 1.000000 // buy
								if( atr > 33.254 )
									ret := 0.500000
				if( dn > 1991.37 )
					if( up1 <= 1948.68 )
						if( dn <= 1998.41 )
							if( dn1 <= 2007.7 )
								if( up <= 1918.26 )
									ret := -0.562500
								if( up > 1918.26 )
									ret := -0.056604
							if( dn1 > 2007.7 )
								ret := 1.000000 // buy
						if( dn > 1998.41 )
							if( atr <= 20.2361 )
								if( atr <= 17.7445 )
									ret := -0.628571
								if( atr > 17.7445 )
									ret := 0.111111
							if( atr > 20.2361 )
								if( atr2 <= 32.4422 )
									ret := -0.886792 // sell
								if( atr2 > 32.4422 )
									ret := -0.600000
					if( up1 > 1948.68 )
						if( up <= 1955.36 )
							if( atr <= 11.2918 )
								if( up1 <= 1949.55 )
									ret := 0.250000
								if( up1 > 1949.55 )
									ret := 1.000000 // buy
							if( atr > 11.2918 )
								if( atr2 <= 15.6193 )
									ret := -1.000000 // sell
								if( atr2 > 15.6193 )
									ret := 0.400000
						if( up > 1955.36 )
							if( atr <= 5.69648 )
								if( atr2 <= 4.60341 )
									ret := -0.142157
								if( atr2 > 4.60341 )
									ret := 0.298246
							if( atr > 5.69648 )
								if( dn <= 2004.31 )
									ret := -0.638889
								if( dn > 2004.31 )
									ret := -0.169054
			if( up > 2002.48 )
				if( atr <= 7.0944 )
					if( dn <= 2050.17 )
						if( atr2 <= 5.971 )
							if( atr2 <= 3.99151 )
								if( atr <= 3.91439 )
									ret := -0.148148
								if( atr > 3.91439 )
									ret := -0.700000 // sell
							if( atr2 > 3.99151 )
								if( up <= 2012.32 )
									ret := 0.621622
								if( up > 2012.32 )
									ret := -0.181818
						if( atr2 > 5.971 )
							if( atr2 <= 6.84838 )
								ret := -1.000000 // sell
							if( atr2 > 6.84838 )
								ret := 0.000000
					if( dn > 2050.17 )
						if( up <= 2033.7 )
							if( dn <= 2064.18 )
								if( atr <= 4.39743 )
									ret := 0.384615
								if( atr > 4.39743 )
									ret := 0.904762 // buy
							if( dn > 2064.18 )
								ret := 0.000000
						if( up > 2033.7 )
							if( dn1 <= 2198.47 )
								if( up1 <= 2153.74 )
									ret := 0.090909
								if( up1 > 2153.74 )
									ret := -0.407407
							if( dn1 > 2198.47 )
								if( up1 <= 3081.3 )
									ret := 0.435456
								if( up1 > 3081.3 )
									ret := 0.207898
				if( atr > 7.0944 )
					if( dn1 <= 2426.39 )
						if( up1 <= 2270.57 )
							if( up <= 2041.84 )
								if( dn <= 2086.12 )
									ret := 0.112245
								if( dn > 2086.12 )
									ret := 0.714286 // buy
							if( up > 2041.84 )
								if( dn1 <= 2150.24 )
									ret := -0.473214
								if( dn1 > 2150.24 )
									ret := 0.069767
						if( up1 > 2270.57 )
							if( up <= 2300.35 )
								if( dn1 <= 2420.71 )
									ret := 0.838095 // buy
								if( dn1 > 2420.71 )
									ret := 0.250000
							if( up > 2300.35 )
								if( dn <= 2358.14 )
									ret := -0.750000 // sell
								if( dn > 2358.14 )
									ret := 0.341216
					if( dn1 > 2426.39 )
						if( up <= 2612.63 )
							if( dn <= 2650.8 )
								if( up <= 2478.62 )
									ret := -0.180587
								if( up > 2478.62 )
									ret := 0.253333
							if( dn > 2650.8 )
								if( up <= 2442.27 )
									ret := 1.000000 // buy
								if( up > 2442.27 )
									ret := -0.703297 // sell
						if( up > 2612.63 )
							if( dn <= 3087.84 )
								if( up1 <= 3022.14 )
									ret := 0.122231
								if( up1 > 3022.14 )
									ret := 0.628571
							if( dn > 3087.84 )
								if( atr <= 24.3464 )
									ret := 0.017737
								if( atr > 24.3464 )
									ret := -0.196837
	if( dn1 > 3306.03 )
		if( atr <= 18.5264 )
			if( dn <= 3308.12 )
				if( atr <= 11.1983 )
					if( up1 <= 3270.98 )
						if( atr <= 8.27235 )
							if( up <= 3263.91 )
								if( up1 <= 3253.49 )
									ret := 0.500000
								if( up1 > 3253.49 )
									ret := -0.100000
							if( up > 3263.91 )
								if( dn1 <= 3307.15 )
									ret := -0.375000
								if( dn1 > 3307.15 )
									ret := -0.862069 // sell
						if( atr > 8.27235 )
							if( dn <= 3301.29 )
								ret := -0.250000
							if( dn > 3301.29 )
								if( dn1 <= 3312.34 )
									ret := -0.937500 // sell
								if( dn1 > 3312.34 )
									ret := -0.625000
					if( up1 > 3270.98 )
						if( atr <= 5.81719 )
							ret := 0.400000
						if( atr > 5.81719 )
							ret := 0.000000
				if( atr > 11.1983 )
					if( dn1 <= 3310.99 )
						if( atr2 <= 10.5791 )
							ret := 1.000000 // buy
						if( atr2 > 10.5791 )
							if( atr2 <= 11.8071 )
								ret := -0.285714
							if( atr2 > 11.8071 )
								if( atr <= 13.9229 )
									ret := 0.000000
								if( atr > 13.9229 )
									ret := 0.727273 // buy
					if( dn1 > 3310.99 )
						if( atr <= 16.4386 )
							if( atr <= 12.5772 )
								ret := 0.000000
							if( atr > 12.5772 )
								if( up <= 3227.7 )
									ret := -0.500000
								if( up > 3227.7 )
									ret := -0.800000 // sell
						if( atr > 16.4386 )
							ret := 0.500000
			if( dn > 3308.12 )
				if( atr2 <= 6.27859 )
					if( atr2 <= 6.03576 )
						if( dn <= 3375.45 )
							if( dn1 <= 3360.66 )
								if( up <= 3322.97 )
									ret := -0.019417
								if( up > 3322.97 )
									ret := -0.695652
							if( dn1 > 3360.66 )
								if( up1 <= 3338.81 )
									ret := 0.186047
								if( up1 > 3338.81 )
									ret := 0.720000 // buy
						if( dn > 3375.45 )
							if( dn <= 3406.64 )
								if( up <= 3366.85 )
									ret := -0.625000
								if( up > 3366.85 )
									ret := -0.256410
							if( dn > 3406.64 )
								if( up <= 3386.45 )
									ret := 0.540984
								if( up > 3386.45 )
									ret := -0.119101
					if( atr2 > 6.03576 )
						if( trend <= 0.899856 )
							ret := -1.000000 // sell
						if( trend > 0.899856 )
							if( dn <= 3385.93 )
								if( up1 <= 3336.21 )
									ret := -0.406250
								if( up1 > 3336.21 )
									ret := -1.000000 // sell
							if( dn > 3385.93 )
								if( dn1 <= 3433.34 )
									ret := 0.150000
								if( dn1 > 3433.34 )
									ret := -0.366667
				if( atr2 > 6.27859 )
					if( dn1 <= 3522.78 )
						if( dn <= 3478.7 )
							if( atr <= 17.6557 )
								if( atr2 <= 6.58271 )
									ret := 0.261364
								if( atr2 > 6.58271 )
									ret := -0.018664
							if( atr > 17.6557 )
								if( dn1 <= 3464.59 )
									ret := 0.328467
								if( dn1 > 3464.59 )
									ret := -0.700000 // sell
						if( dn > 3478.7 )
							if( up1 <= 3475.4 )
								if( up <= 3387.52 )
									ret := -1.000000 // sell
								if( up > 3387.52 )
									ret := 0.347932
							if( up1 > 3475.4 )
								if( up1 <= 3480.2 )
									ret := -1.000000 // sell
								if( up1 > 3480.2 )
									ret := -0.500000
					if( dn1 > 3522.78 )
						if( atr2 <= 16.7739 )
							if( dn <= 3525.69 )
								if( up <= 3457.56 )
									ret := 0.062500
								if( up > 3457.56 )
									ret := -0.704545 // sell
							if( dn > 3525.69 )
								if( atr <= 6.90584 )
									ret := -0.411765
								if( atr > 6.90584 )
									ret := 0.023916
						if( atr2 > 16.7739 )
							if( atr2 <= 19.9099 )
								if( up1 <= 3544.48 )
									ret := -0.598039
								if( up1 > 3544.48 )
									ret := -0.033333
							if( atr2 > 19.9099 )
								if( atr <= 15.1737 )
									ret := -0.600000
								if( atr > 15.1737 )
									ret := 0.166667
		if( atr > 18.5264 )
			if( dn <= 3433.51 )
				if( up <= 3184.87 )
					if( dn1 <= 3333.94 )
						if( up1 <= 3030.64 )
							ret := 0.250000
						if( up1 > 3030.64 )
							if( dn <= 3308.27 )
								if( up1 <= 3178.69 )
									ret := -0.757576 // sell
								if( up1 > 3178.69 )
									ret := 0.000000
							if( dn > 3308.27 )
								if( up <= 3157.71 )
									ret := -0.900000 // sell
								if( up > 3157.71 )
									ret := -1.000000 // sell
					if( dn1 > 3333.94 )
						if( up <= 2966.95 )
							ret := -1.000000 // sell
						if( up > 2966.95 )
							if( dn <= 3340.35 )
								if( dn1 <= 3343.32 )
									ret := -0.181818
								if( dn1 > 3343.32 )
									ret := -0.727273 // sell
							if( dn > 3340.35 )
								if( dn1 <= 3361.09 )
									ret := 0.800000 // buy
								if( dn1 > 3361.09 )
									ret := 0.162162
				if( up > 3184.87 )
					if( dn <= 3328.12 )
						if( dn <= 3314.07 )
							if( dn1 <= 3318.2 )
								if( atr <= 23.558 )
									ret := 1.000000 // buy
								if( atr > 23.558 )
									ret := 0.750000 // buy
							if( dn1 > 3318.2 )
								ret := 0.500000
						if( dn > 3314.07 )
							if( up <= 3219.71 )
								if( dn <= 3321.28 )
									ret := 0.125000
								if( dn > 3321.28 )
									ret := 0.900000 // buy
							if( up > 3219.71 )
								ret := -0.666667
					if( dn > 3328.12 )
						if( dn <= 3425.81 )
							if( atr2 <= 30.0775 )
								if( up1 <= 3190.83 )
									ret := 0.900000 // buy
								if( up1 > 3190.83 )
									ret := -0.104972
							if( atr2 > 30.0775 )
								if( up <= 3254.16 )
									ret := -0.600000
								if( up > 3254.16 )
									ret := 0.600000
						if( dn > 3425.81 )
							if( up1 <= 3317.24 )
								if( up <= 3294.09 )
									ret := 0.400000
								if( up > 3294.09 )
									ret := 1.000000 // buy
							if( up1 > 3317.24 )
								ret := -0.142857
			if( dn > 3433.51 )
				if( atr2 <= 27.8094 )
					if( dn <= 3761.71 )
						if( dn <= 3688.9 )
							if( dn <= 3522.36 )
								if( atr2 <= 22.2151 )
									ret := -0.363636
								if( atr2 > 22.2151 )
									ret := 0.142857
							if( dn > 3522.36 )
								if( up1 <= 3472.34 )
									ret := -0.616667
								if( up1 > 3472.34 )
									ret := -0.274725
						if( dn > 3688.9 )
							if( up <= 3567.48 )
								ret := 1.000000 // buy
							if( up > 3567.48 )
								if( up <= 3593.56 )
									ret := -0.160000
								if( up > 3593.56 )
									ret := 0.346154
					if( dn > 3761.71 )
						if( up <= 3650.78 )
							if( atr2 <= 21.8638 )
								ret := -0.666667
							if( atr2 > 21.8638 )
								ret := -1.000000 // sell
						if( up > 3650.78 )
							if( up <= 3684.87 )
								if( up1 <= 3667.47 )
									ret := -0.444444
								if( up1 > 3667.47 )
									ret := 0.000000
							if( up > 3684.87 )
								ret := -1.000000 // sell
				if( atr2 > 27.8094 )
					if( trend <= 0.354866 )
						ret := 0.500000
					if( trend > 0.354866 )
						if( up1 <= 3468.11 )
							if( up1 <= 3171.19 )
								if( dn1 <= 3671 )
									ret := -1.000000 // sell
								if( dn1 > 3671 )
									ret := -0.750000 // sell
							if( up1 > 3171.19 )
								if( dn <= 3520.7 )
									ret := -0.580645
								if( dn > 3520.7 )
									ret := -0.826923 // sell
						if( up1 > 3468.11 )
							if( up1 <= 3479.16 )
								ret := 0.250000
							if( up1 > 3479.16 )
								ret := -0.142857
	
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
float op_operation = decision_tree_0_AMZN_30Min_18d86f0e(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)

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


