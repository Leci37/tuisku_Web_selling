//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: BTCUSDT_30Min_2CT0_02f012e9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2CT0_02f012e9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_02f012e9(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= -125.444 )
		if( tema <= 64049.7 )
			if( ema2 <= 60641.4 )
				if( ema13 <= 728.761 )
					if( ema12 <= -1110.83 )
						if( ema2 <= 49486.7 )
							ret := 1.000000 // buy
						if( ema2 > 49486.7 )
							if( ad_mf <= -4043.18 )
								ret := 0.882353 // buy
							if( ad_mf > -4043.18 )
								ret := 0.600000
					if( ema12 > -1110.83 )
						if( tema <= 60298.8 )
							if( ema1 <= 16443.6 )
								if( ad_mf <= -595.155 )
									ret := 0.290214
								if( ad_mf > -595.155 )
									ret := 0.015213
							if( ema1 > 16443.6 )
								if( ema13 <= -1942.74 )
									ret := -0.774194 // sell
								if( ema13 > -1942.74 )
									ret := 0.024067
						if( tema > 60298.8 )
							if( ema13 <= 6.7896 )
								if( tema <= 60532.4 )
									ret := -0.967742 // sell
								if( tema > 60532.4 )
									ret := -0.742857 // sell
							if( ema13 > 6.7896 )
								if( ema12 <= 69.1373 )
									ret := 0.700000 // buy
								if( ema12 > 69.1373 )
									ret := -0.348837
				if( ema13 > 728.761 )
					if( tema <= 38280.3 )
						if( ema12 <= 655.736 )
							if( mf <= 0.230457 )
								if( ema3 <= 31725.5 )
									ret := -0.307692
								if( ema3 > 31725.5 )
									ret := 0.595745
							if( mf > 0.230457 )
								if( ema3 <= 26660.6 )
									ret := 0.250000
								if( ema3 > 26660.6 )
									ret := -0.861111 // sell
						if( ema12 > 655.736 )
							if( mf <= 0.141673 )
								ret := -0.166667
							if( mf > 0.141673 )
								ret := -1.000000 // sell
					if( tema > 38280.3 )
						if( ema3 <= 38503.9 )
							if( ema12 <= 498.225 )
								if( mf <= 0.087052 )
									ret := 1.000000 // buy
								if( mf > 0.087052 )
									ret := 0.772727 // buy
							if( ema12 > 498.225 )
								if( ema3 <= 36617.9 )
									ret := 1.000000 // buy
								if( ema3 > 36617.9 )
									ret := 0.285714
						if( ema3 > 38503.9 )
							if( ema2 <= 44694.6 )
								if( ad_mf <= -428.279 )
									ret := 0.053763
								if( ad_mf > -428.279 )
									ret := -0.378378
							if( ema2 > 44694.6 )
								if( ad_mf <= -2327.72 )
									ret := -0.529412
								if( ad_mf > -2327.72 )
									ret := 0.389706
			if( ema2 > 60641.4 )
				if( ad_mf <= -2103.81 )
					if( ema1 <= 64195.1 )
						if( ema2 <= 62835.4 )
							ret := 0.950000 // buy
						if( ema2 > 62835.4 )
							ret := 0.692308
					if( ema1 > 64195.1 )
						ret := 1.000000 // buy
				if( ad_mf > -2103.81 )
					if( tema <= 60914.3 )
						if( ad_mf <= -617.521 )
							if( ad_mf <= -1023.82 )
								if( ema1 <= 60792.2 )
									ret := -0.068966
								if( ema1 > 60792.2 )
									ret := 0.736842 // buy
							if( ad_mf > -1023.82 )
								if( ad_mf <= -863.651 )
									ret := -0.900000 // sell
								if( ad_mf > -863.651 )
									ret := -0.333333
						if( ad_mf > -617.521 )
							if( ema2 <= 60909.4 )
								if( ema1 <= 60586.5 )
									ret := 0.166667
								if( ema1 > 60586.5 )
									ret := 0.850877 // buy
							if( ema2 > 60909.4 )
								if( ema2 <= 61273.5 )
									ret := 0.382979
								if( ema2 > 61273.5 )
									ret := 0.753247 // buy
					if( tema > 60914.3 )
						if( ema13 <= 174.468 )
							if( ema3 <= 62400.3 )
								if( ema12 <= 76.1268 )
									ret := -0.268722
								if( ema12 > 76.1268 )
									ret := 0.438202
							if( ema3 > 62400.3 )
								if( ema3 <= 65098.9 )
									ret := 0.142336
								if( ema3 > 65098.9 )
									ret := -0.567568
						if( ema13 > 174.468 )
							if( mf <= 0.197784 )
								if( ad_mf <= -1658.97 )
									ret := -0.533333
								if( ad_mf > -1658.97 )
									ret := 0.432802
							if( mf > 0.197784 )
								if( ad <= -341.366 )
									ret := 0.235294
								if( ad > -341.366 )
									ret := -0.404255
		if( tema > 64049.7 )
			if( ema1 <= 64635.8 )
				if( ad_mf <= -199.281 )
					if( ema13 <= -91.2353 )
						if( tema <= 64243.1 )
							if( tema <= 64168.9 )
								ret := -0.250000
							if( tema > 64168.9 )
								ret := 0.200000
						if( tema > 64243.1 )
							ret := -0.500000
					if( ema13 > -91.2353 )
						if( ema13 <= 66.008 )
							if( mf <= -0.030598 )
								ret := -1.000000 // sell
							if( mf > -0.030598 )
								if( ema13 <= -52.7427 )
									ret := -0.400000
								if( ema13 > -52.7427 )
									ret := -0.888889 // sell
						if( ema13 > 66.008 )
							if( ema13 <= 485.825 )
								if( ema2 <= 64475.1 )
									ret := -0.135593
								if( ema2 > 64475.1 )
									ret := -0.937500 // sell
							if( ema13 > 485.825 )
								if( ema12 <= 447.888 )
									ret := -0.862069 // sell
								if( ema12 > 447.888 )
									ret := 0.000000
				if( ad_mf > -199.281 )
					if( ema12 <= 135.72 )
						if( ema3 <= 64100.9 )
							ret := 0.000000
						if( ema3 > 64100.9 )
							if( ema1 <= 64382.4 )
								ret := 0.916667 // buy
							if( ema1 > 64382.4 )
								ret := 0.166667
					if( ema12 > 135.72 )
						ret := -0.631579
			if( ema1 > 64635.8 )
				if( ad_mf <= -567.598 )
					if( mf <= -0.044361 )
						if( tema <= 68076.8 )
							if( ema12 <= -181.45 )
								if( ema13 <= -1113.79 )
									ret := -0.166667
								if( ema13 > -1113.79 )
									ret := 0.368421
							if( ema12 > -181.45 )
								if( ema2 <= 66402.2 )
									ret := -0.346154
								if( ema2 > 66402.2 )
									ret := 0.142857
						if( tema > 68076.8 )
							if( ema13 <= -358.389 )
								if( mf <= -0.132572 )
									ret := -0.214286
								if( mf > -0.132572 )
									ret := 1.000000 // buy
							if( ema13 > -358.389 )
								if( ad <= -677.31 )
									ret := -0.897059 // sell
								if( ad > -677.31 )
									ret := -0.375000
					if( mf > -0.044361 )
						if( mf <= 0.14932 )
							if( ad_mf <= -1686.64 )
								if( ema12 <= -295.329 )
									ret := 0.222222
								if( ema12 > -295.329 )
									ret := 0.571429
							if( ad_mf > -1686.64 )
								if( ema12 <= -8.75321 )
									ret := -0.734807 // sell
								if( ema12 > -8.75321 )
									ret := -0.337580
						if( mf > 0.14932 )
							if( ad_mf <= -633.931 )
								if( ema12 <= 692.778 )
									ret := 0.185185
								if( ema12 > 692.778 )
									ret := 0.923077 // buy
							if( ad_mf > -633.931 )
								if( ad <= -589.079 )
									ret := -0.400000
								if( ad > -589.079 )
									ret := -0.750000 // sell
				if( ad_mf > -567.598 )
					if( ema1 <= 70116.8 )
						if( ad <= -545.406 )
							if( ema12 <= -38.8471 )
								ret := 0.928571 // buy
							if( ema12 > -38.8471 )
								ret := 0.388889
						if( ad > -545.406 )
							if( ema13 <= 55.0614 )
								if( ema1 <= 69793.8 )
									ret := -0.106725
								if( ema1 > 69793.8 )
									ret := 0.727273 // buy
							if( ema13 > 55.0614 )
								if( ema3 <= 64275.8 )
									ret := -0.625000
								if( ema3 > 64275.8 )
									ret := 0.231911
					if( ema1 > 70116.8 )
						if( ema1 <= 70360.8 )
							if( ema2 <= 70059.1 )
								ret := -0.428571
							if( ema2 > 70059.1 )
								if( ema1 <= 70285.5 )
									ret := -1.000000 // sell
								if( ema1 > 70285.5 )
									ret := -0.888889 // sell
						if( ema1 > 70360.8 )
							if( ad <= -364.642 )
								if( tema <= 71145.5 )
									ret := -0.041667
								if( tema > 71145.5 )
									ret := 0.320000
							if( ad > -364.642 )
								if( mf <= 0.193399 )
									ret := -0.302632
								if( mf > 0.193399 )
									ret := -0.866667 // sell
	if( ad_mf > -125.444 )
		if( ema1 <= 19147 )
			if( ad <= 970.262 )
				if( tema <= 10088.7 )
					if( ema3 <= 10114.9 )
						ret := 1.000000 // buy
					if( ema3 > 10114.9 )
						ret := 0.571429
				if( tema > 10088.7 )
					if( ema1 <= 10285.8 )
						if( ad <= 4.90384 )
							if( ema13 <= -2.31693 )
								ret := -1.000000 // sell
							if( ema13 > -2.31693 )
								ret := -0.846154 // sell
						if( ad > 4.90384 )
							if( mf <= 0.028219 )
								if( ema3 <= 10090.2 )
									ret := -1.000000 // sell
								if( ema3 > 10090.2 )
									ret := -0.418605
							if( mf > 0.028219 )
								if( ema12 <= 17.6199 )
									ret := 0.459459
								if( ema12 > 17.6199 )
									ret := -0.360000
					if( ema1 > 10285.8 )
						if( mf <= 0.248025 )
							if( ema13 <= 136.003 )
								if( ema1 <= 19095.4 )
									ret := 0.040253
								if( ema1 > 19095.4 )
									ret := 0.414894
							if( ema13 > 136.003 )
								if( tema <= 15526.2 )
									ret := 0.400000
								if( tema > 15526.2 )
									ret := -0.442029
						if( mf > 0.248025 )
							if( ema1 <= 13293 )
								if( tema <= 10403.6 )
									ret := 0.909091 // buy
								if( tema > 10403.6 )
									ret := -0.320000
							if( ema1 > 13293 )
								if( ema2 <= 13365.2 )
									ret := 1.000000 // buy
								if( ema2 > 13365.2 )
									ret := 0.384615
			if( ad > 970.262 )
				if( ema3 <= 18048.9 )
					if( ad <= 1684.98 )
						if( ema3 <= 16680.1 )
							if( ema3 <= 13717.7 )
								if( ema2 <= 13641.4 )
									ret := 0.350254
								if( ema2 > 13641.4 )
									ret := -0.600000
							if( ema3 > 13717.7 )
								if( ema12 <= 13.362 )
									ret := 0.348148
								if( ema12 > 13.362 )
									ret := 0.859813 // buy
						if( ema3 > 16680.1 )
							if( ad_mf <= 1128.07 )
								if( ema13 <= 95.0331 )
									ret := 0.163934
								if( ema13 > 95.0331 )
									ret := 0.923077 // buy
							if( ad_mf > 1128.07 )
								if( ema1 <= 17285.3 )
									ret := 0.132812
								if( ema1 > 17285.3 )
									ret := -0.475000
					if( ad > 1684.98 )
						if( ema3 <= 17898.4 )
							if( ema3 <= 10331 )
								ret := -1.000000 // sell
							if( ema3 > 10331 )
								if( ema13 <= 248.175 )
									ret := 0.041199
								if( ema13 > 248.175 )
									ret := -0.571429
						if( ema3 > 17898.4 )
							if( mf <= 0.18718 )
								ret := -0.727273 // sell
							if( mf > 0.18718 )
								ret := -1.000000 // sell
				if( ema3 > 18048.9 )
					if( ema3 <= 19058.8 )
						if( ema13 <= 110.935 )
							if( ad <= 2163.74 )
								if( ad <= 1910.36 )
									ret := 0.503106
								if( ad > 1910.36 )
									ret := -0.352941
							if( ad > 2163.74 )
								if( ema2 <= 19023.9 )
									ret := 0.768293 // buy
								if( ema2 > 19023.9 )
									ret := 0.117647
						if( ema13 > 110.935 )
							if( ema3 <= 18580.9 )
								if( tema <= 18749.6 )
									ret := -0.263158
								if( tema > 18749.6 )
									ret := 0.750000 // buy
							if( ema3 > 18580.9 )
								if( ema13 <= 173.189 )
									ret := 0.196078
								if( ema13 > 173.189 )
									ret := -0.727273 // sell
					if( ema3 > 19058.8 )
						if( ema12 <= -256.272 )
							ret := 0.785714 // buy
						if( ema12 > -256.272 )
							if( ema12 <= 0.621129 )
								if( mf <= -0.07903 )
									ret := 0.409091
								if( mf > -0.07903 )
									ret := -0.336066
							if( ema12 > 0.621129 )
								if( ema12 <= 7.69353 )
									ret := 0.692308
								if( ema12 > 7.69353 )
									ret := -0.027778
		if( ema1 > 19147 )
			if( ema2 <= 38876.7 )
				if( ema2 <= 37900.5 )
					if( ema13 <= 684.459 )
						if( tema <= 37863.2 )
							if( mf <= 0.213594 )
								if( ema2 <= 19397.6 )
									ret := -0.195783
								if( ema2 > 19397.6 )
									ret := -0.008977
							if( mf > 0.213594 )
								if( tema <= 37244.5 )
									ret := 0.084814
								if( tema > 37244.5 )
									ret := 0.718750 // buy
						if( tema > 37863.2 )
							if( ema3 <= 37131.3 )
								if( ad_mf <= 27.1524 )
									ret := -1.000000 // sell
								if( ad_mf > 27.1524 )
									ret := -0.909091 // sell
							if( ema3 > 37131.3 )
								if( ema2 <= 37763 )
									ret := -0.076923
								if( ema2 > 37763 )
									ret := -0.610000
					if( ema13 > 684.459 )
						if( tema <= 36120.9 )
							if( ema2 <= 32899 )
								if( ema13 <= 1337.01 )
									ret := -0.008772
								if( ema13 > 1337.01 )
									ret := -0.882353 // sell
							if( ema2 > 32899 )
								if( ema2 <= 34607.2 )
									ret := -0.964286 // sell
								if( ema2 > 34607.2 )
									ret := -0.736842 // sell
						if( tema > 36120.9 )
							if( ema1 <= 36875.9 )
								if( tema <= 36535.6 )
									ret := 0.884615 // buy
								if( tema > 36535.6 )
									ret := 0.112500
							if( ema1 > 36875.9 )
								if( ema13 <= 1641.47 )
									ret := -0.578947
								if( ema13 > 1641.47 )
									ret := 0.150000
				if( ema2 > 37900.5 )
					if( ema2 <= 38409.5 )
						if( ema1 <= 37828.6 )
							if( mf <= -0.003925 )
								if( ema3 <= 38244.3 )
									ret := -0.444444
								if( ema3 > 38244.3 )
									ret := -0.931818 // sell
							if( mf > -0.003925 )
								ret := 0.857143 // buy
						if( ema1 > 37828.6 )
							if( ema1 <= 38352.8 )
								if( ema1 <= 38251.9 )
									ret := 0.402036
								if( ema1 > 38251.9 )
									ret := -0.073171
							if( ema1 > 38352.8 )
								if( ad <= 697.148 )
									ret := 0.671642
								if( ad > 697.148 )
									ret := 0.298851
					if( ema2 > 38409.5 )
						if( mf <= -0.064764 )
							if( ema1 <= 38510.1 )
								if( tema <= 38272.7 )
									ret := 0.269231
								if( tema > 38272.7 )
									ret := -0.391304
							if( ema1 > 38510.1 )
								if( tema <= 38526.6 )
									ret := 0.909091 // buy
								if( tema > 38526.6 )
									ret := 0.440860
						if( mf > -0.064764 )
							if( ad_mf <= 1511.22 )
								if( ema12 <= -193.673 )
									ret := -0.727273 // sell
								if( ema12 > -193.673 )
									ret := -0.087678
							if( ad_mf > 1511.22 )
								if( ema3 <= 38237 )
									ret := -0.750000 // sell
								if( ema3 > 38237 )
									ret := 0.525424
			if( ema2 > 38876.7 )
				if( ema1 <= 40740.2 )
					if( tema <= 38408.5 )
						if( ema3 <= 39369.1 )
							if( ema3 <= 39151.8 )
								ret := 0.500000
							if( ema3 > 39151.8 )
								ret := 1.000000 // buy
						if( ema3 > 39369.1 )
							ret := 0.363636
					if( tema > 38408.5 )
						if( ema3 <= 40658.1 )
							if( ema3 <= 40516.5 )
								if( tema <= 38782 )
									ret := -0.571429
								if( tema > 38782 )
									ret := -0.185675
							if( ema3 > 40516.5 )
								if( ema12 <= 47.9006 )
									ret := 0.489796
								if( ema12 > 47.9006 )
									ret := -1.000000 // sell
						if( ema3 > 40658.1 )
							if( ema13 <= -511.087 )
								if( tema <= 39940.2 )
									ret := -0.608696
								if( tema > 39940.2 )
									ret := -0.921053 // sell
							if( ema13 > -511.087 )
								if( tema <= 40545.3 )
									ret := 0.000000
								if( tema > 40545.3 )
									ret := -0.631579
				if( ema1 > 40740.2 )
					if( ema12 <= -394.332 )
						if( ema2 <= 62451.2 )
							if( ema3 <= 56697.8 )
								if( ad_mf <= 721.744 )
									ret := -0.533019
								if( ad_mf > 721.744 )
									ret := 0.011396
							if( ema3 > 56697.8 )
								if( ema12 <= -426.051 )
									ret := 0.457014
								if( ema12 > -426.051 )
									ret := -0.603774
						if( ema2 > 62451.2 )
							if( mf <= -0.165186 )
								if( ema2 <= 65027.3 )
									ret := 0.640000
								if( ema2 > 65027.3 )
									ret := -0.083333
							if( mf > -0.165186 )
								if( ema2 <= 65977.7 )
									ret := -0.739884 // sell
								if( ema2 > 65977.7 )
									ret := -0.500000
					if( ema12 > -394.332 )
						if( tema <= 40861.6 )
							if( ema3 <= 41405.7 )
								if( tema <= 40799.7 )
									ret := 0.432432
								if( tema > 40799.7 )
									ret := -0.181818
							if( ema3 > 41405.7 )
								if( ema2 <= 41334.1 )
									ret := 0.857143 // buy
								if( ema2 > 41334.1 )
									ret := 1.000000 // buy
						if( tema > 40861.6 )
							if( ema1 <= 71122.6 )
								if( ema13 <= 1487.43 )
									ret := -0.035223
								if( ema13 > 1487.43 )
									ret := -0.700000 // sell
							if( ema1 > 71122.6 )
								if( ad_mf <= 285.73 )
									ret := -0.114286
								if( ad_mf > 285.73 )
									ret := -0.724771 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_BTCUSDT_30Min_02f012e9(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


