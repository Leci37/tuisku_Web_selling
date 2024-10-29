//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: UPST_1Min_2BB0_1a100c25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2BB0_1a100c25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_1a100c25(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= -0.026284 )
		if( bearPower <= -0.11334 )
			if( Lower_Band <= 23.1124 )
				if( Upper_Band <= 22.8685 )
					if( bbp <= -0.308586 )
						if( Upper_Band <= 21.9793 )
							if( bbp <= -0.495381 )
								if( bullPower <= -0.263878 )
									ret := -0.363636
								if( bullPower > -0.263878 )
									ret := 0.833333 // buy
							if( bbp > -0.495381 )
								if( bbp <= -0.450553 )
									ret := -0.611111
								if( bbp > -0.450553 )
									ret := 0.047619
						if( Upper_Band > 21.9793 )
							if( bullPower <= -0.169639 )
								if( bearPower <= -0.337801 )
									ret := -0.285714
								if( bearPower > -0.337801 )
									ret := -0.773585 // sell
							if( bullPower > -0.169639 )
								if( Lower_Band <= 22.005 )
									ret := 0.470588
								if( Lower_Band > 22.005 )
									ret := -0.625000
					if( bbp > -0.308586 )
						if( bearPower <= -0.192776 )
							if( Lower_Band <= 21.6932 )
								ret := 0.842105 // buy
							if( Lower_Band > 21.6932 )
								ret := 0.428571
						if( bearPower > -0.192776 )
							if( Upper_Band <= 22.2505 )
								if( Lower_Band <= 20.4391 )
									ret := 1.000000 // buy
								if( Lower_Band > 20.4391 )
									ret := -0.253333
							if( Upper_Band > 22.2505 )
								if( bullPower <= -0.070899 )
									ret := 0.362963
								if( bullPower > -0.070899 )
									ret := -0.049383
				if( Upper_Band > 22.8685 )
					if( bearPower <= -0.120985 )
						if( Upper_Band <= 22.9627 )
							if( Lower_Band <= 22.5265 )
								ret := 1.000000 // buy
							if( Lower_Band > 22.5265 )
								ret := 0.750000 // buy
						if( Upper_Band > 22.9627 )
							if( Upper_Band <= 23.0393 )
								ret := -0.333333
							if( Upper_Band > 23.0393 )
								if( bbp <= -0.1744 )
									ret := 0.521042
								if( bbp > -0.1744 )
									ret := -0.666667
					if( bearPower > -0.120985 )
						if( basis <= 23.07 )
							if( basis <= 22.9166 )
								ret := 0.217391
							if( basis > 22.9166 )
								ret := 0.833333 // buy
						if( basis > 23.07 )
							ret := -0.363636
			if( Lower_Band > 23.1124 )
				if( bearPower <= -0.538009 )
					if( bullPower <= -0.858404 )
						ret := -0.692308
					if( bullPower > -0.858404 )
						if( Upper_Band <= 25.8545 )
							ret := -0.809524 // sell
						if( Upper_Band > 25.8545 )
							if( bbp <= -1.32995 )
								ret := 1.000000 // buy
							if( bbp > -1.32995 )
								if( Lower_Band <= 40.268 )
									ret := 0.470874
								if( Lower_Band > 40.268 )
									ret := 0.868421 // buy
				if( bearPower > -0.538009 )
					if( bbm <= 0.029914 )
						if( Upper_Band <= 28.6408 )
							if( basis <= 27.1937 )
								if( bbp <= -0.275326 )
									ret := 0.664062
								if( bbp > -0.275326 )
									ret := 0.255319
							if( basis > 27.1937 )
								if( bearPower <= -0.153279 )
									ret := 0.949153 // buy
								if( bearPower > -0.153279 )
									ret := 0.592593
						if( Upper_Band > 28.6408 )
							if( Upper_Band <= 28.8625 )
								if( Upper_Band <= 28.7545 )
									ret := -0.555556
								if( Upper_Band > 28.7545 )
									ret := -0.884615 // sell
							if( Upper_Band > 28.8625 )
								if( basis <= 36.3438 )
									ret := 0.474747
								if( basis > 36.3438 )
									ret := -0.008333
					if( bbm > 0.029914 )
						if( bearPower <= -0.204045 )
							if( Upper_Band <= 25.4766 )
								if( Upper_Band <= 24.9184 )
									ret := 0.072115
								if( Upper_Band > 24.9184 )
									ret := 0.737705 // buy
							if( Upper_Band > 25.4766 )
								if( basis <= 31.0092 )
									ret := -0.188919
								if( basis > 31.0092 )
									ret := 0.055306
						if( bearPower > -0.204045 )
							if( Lower_Band <= 46.5667 )
								if( basis <= 37.473 )
									ret := -0.024185
								if( basis > 37.473 )
									ret := -0.202634
							if( Lower_Band > 46.5667 )
								if( bearPower <= -0.17633 )
									ret := -0.696970
								if( bearPower > -0.17633 )
									ret := -0.959184 // sell
		if( bearPower > -0.11334 )
			if( bbp <= -0.181942 )
				if( Upper_Band <= 23.4015 )
					if( Lower_Band <= 22.9405 )
						if( Upper_Band <= 23.2201 )
							if( basis <= 23.019 )
								if( bearPower <= -0.109764 )
									ret := 0.363636
								if( bearPower > -0.109764 )
									ret := 0.861111 // buy
							if( basis > 23.019 )
								ret := 0.363636
						if( Upper_Band > 23.2201 )
							ret := 0.875000 // buy
					if( Lower_Band > 22.9405 )
						ret := 1.000000 // buy
				if( Upper_Band > 23.4015 )
					if( bearPower <= -0.108611 )
						if( bbp <= -0.217835 )
							if( Upper_Band <= 28.1173 )
								ret := 0.550000
							if( Upper_Band > 28.1173 )
								if( bbp <= -0.224532 )
									ret := 0.333333
								if( bbp > -0.224532 )
									ret := -0.105263
						if( bbp > -0.217835 )
							if( bullPower <= -0.077179 )
								if( bbp <= -0.198872 )
									ret := -0.166667
								if( bbp > -0.198872 )
									ret := -0.437500
							if( bullPower > -0.077179 )
								if( bearPower <= -0.112418 )
									ret := 0.692308
								if( bearPower > -0.112418 )
									ret := -0.304348
					if( bearPower > -0.108611 )
						if( basis <= 24.3726 )
							if( Upper_Band <= 24.0397 )
								if( bullPower <= -0.093004 )
									ret := 0.375000
								if( bullPower > -0.093004 )
									ret := 0.181818
							if( Upper_Band > 24.0397 )
								if( basis <= 23.9496 )
									ret := -0.750000 // sell
								if( basis > 23.9496 )
									ret := 0.157895
						if( basis > 24.3726 )
							if( Lower_Band <= 30.8274 )
								if( Upper_Band <= 24.9656 )
									ret := 1.000000 // buy
								if( Upper_Band > 24.9656 )
									ret := 0.690647
							if( Lower_Band > 30.8274 )
								if( Lower_Band <= 36.1909 )
									ret := -0.027027
								if( Lower_Band > 36.1909 )
									ret := 0.470588
			if( bbp > -0.181942 )
				if( bbm <= 0.009414 )
					if( Upper_Band <= 33.3125 )
						if( Lower_Band <= 22.3245 )
							if( bbp <= -0.062165 )
								if( Lower_Band <= 21.2145 )
									ret := 0.034483
								if( Lower_Band > 21.2145 )
									ret := 0.740741 // buy
							if( bbp > -0.062165 )
								if( Lower_Band <= 21.8136 )
									ret := 0.500000
								if( Lower_Band > 21.8136 )
									ret := 0.058824
						if( Lower_Band > 22.3245 )
							if( bullPower <= -0.035681 )
								if( Upper_Band <= 27.809 )
									ret := 0.400000
								if( Upper_Band > 27.809 )
									ret := 0.618590
							if( bullPower > -0.035681 )
								if( bullPower <= -0.026817 )
									ret := 0.087766
								if( bullPower > -0.026817 )
									ret := 0.677419
					if( Upper_Band > 33.3125 )
						if( Upper_Band <= 40.3689 )
							if( Lower_Band <= 40.0776 )
								if( bbm <= 0.007313 )
									ret := 0.205835
								if( bbm > 0.007313 )
									ret := -0.846154 // sell
							if( Lower_Band > 40.0776 )
								ret := 1.000000 // buy
						if( Upper_Band > 40.3689 )
							if( Lower_Band <= 40.2344 )
								if( Lower_Band <= 39.8819 )
									ret := -0.789474 // sell
								if( Lower_Band > 39.8819 )
									ret := -0.258065
							if( Lower_Band > 40.2344 )
								if( basis <= 43.3518 )
									ret := 0.215447
								if( basis > 43.3518 )
									ret := -0.065574
				if( bbm > 0.009414 )
					if( basis <= 21.8365 )
						if( bullPower <= -0.049878 )
							if( Upper_Band <= 21.1904 )
								ret := 1.000000 // buy
							if( Upper_Band > 21.1904 )
								if( bbm <= 0.02922 )
									ret := 0.100000
								if( bbm > 0.02922 )
									ret := 0.916667 // buy
						if( bullPower > -0.049878 )
							if( basis <= 21.6584 )
								if( bullPower <= -0.03974 )
									ret := 0.526316
								if( bullPower > -0.03974 )
									ret := 0.083333
							if( basis > 21.6584 )
								if( bbp <= -0.104497 )
									ret := 0.250000
								if( bbp > -0.104497 )
									ret := 1.000000 // buy
					if( basis > 21.8365 )
						if( basis <= 30.7112 )
							if( bullPower <= -0.074877 )
								if( Lower_Band <= 23.4326 )
									ret := 0.040000
								if( Lower_Band > 23.4326 )
									ret := -0.385965
							if( bullPower > -0.074877 )
								if( Upper_Band <= 23.7087 )
									ret := 0.144675
								if( Upper_Band > 23.7087 )
									ret := 0.017817
						if( basis > 30.7112 )
							if( Upper_Band <= 36.5226 )
								if( Lower_Band <= 34.3634 )
									ret := 0.168889
								if( Lower_Band > 34.3634 )
									ret := 0.440171
							if( Upper_Band > 36.5226 )
								if( bbm <= 0.035199 )
									ret := 0.180095
								if( bbm > 0.035199 )
									ret := 0.050667
	if( bullPower > -0.026284 )
		if( bbm <= 0.009867 )
			if( BBPower_Color <= 0.5 )
				if( basis <= 23.0381 )
					if( Lower_Band <= 22.8307 )
						if( basis <= 22.8257 )
							if( Upper_Band <= 22.9539 )
								if( Upper_Band <= 21.8547 )
									ret := 0.297297
								if( Upper_Band > 21.8547 )
									ret := -0.104603
							if( Upper_Band > 22.9539 )
								ret := -1.000000 // sell
						if( basis > 22.8257 )
							if( bbp <= -0.022705 )
								if( basis <= 22.8994 )
									ret := 1.000000 // buy
								if( basis > 22.8994 )
									ret := 0.333333
							if( bbp > -0.022705 )
								ret := 0.307692
					if( Lower_Band > 22.8307 )
						if( bbp <= -0.026833 )
							if( basis <= 22.9132 )
								ret := -1.000000 // sell
							if( basis > 22.9132 )
								if( basis <= 22.9904 )
									ret := -0.083333
								if( basis > 22.9904 )
									ret := -0.694444
						if( bbp > -0.026833 )
							if( bearPower <= -0.007301 )
								ret := 0.214286
							if( bearPower > -0.007301 )
								ret := 0.466667
				if( basis > 23.0381 )
					if( Lower_Band <= 40.3056 )
						if( Lower_Band <= 33.9027 )
							if( bbp <= -0.005944 )
								if( basis <= 28.2643 )
									ret := 0.139774
								if( basis > 28.2643 )
									ret := -0.360000
							if( bbp > -0.005944 )
								if( Upper_Band <= 28.1228 )
									ret := -0.017699
								if( Upper_Band > 28.1228 )
									ret := -0.625000
						if( Lower_Band > 33.9027 )
							if( Lower_Band <= 34.222 )
								if( bbm <= 0.000955 )
									ret := 0.576923
								if( bbm > 0.000955 )
									ret := 1.000000 // buy
							if( Lower_Band > 34.222 )
								if( Lower_Band <= 34.8799 )
									ret := -0.666667
								if( Lower_Band > 34.8799 )
									ret := 0.248521
					if( Lower_Band > 40.3056 )
						if( Upper_Band <= 40.9922 )
							ret := -0.500000
						if( Upper_Band > 40.9922 )
							if( Lower_Band <= 46.9666 )
								if( bullPower <= -0.00945 )
									ret := 0.012346
								if( bullPower > -0.00945 )
									ret := -0.232558
							if( Lower_Band > 46.9666 )
								ret := 0.166667
			if( BBPower_Color > 0.5 )
				if( bearPower <= 0.050476 )
					if( Lower_Band <= 25.0234 )
						if( basis <= 24.5715 )
							if( bbp <= 0.017118 )
								if( bbm <= 0.001811 )
									ret := -0.027559
								if( bbm > 0.001811 )
									ret := -0.337838
							if( bbp > 0.017118 )
								if( bbp <= 0.044226 )
									ret := 0.090074
								if( bbp > 0.044226 )
									ret := -0.050743
						if( basis > 24.5715 )
							if( Lower_Band <= 24.6356 )
								if( Lower_Band <= 24.5807 )
									ret := 0.311475
								if( Lower_Band > 24.5807 )
									ret := 0.956522 // buy
							if( Lower_Band > 24.6356 )
								if( basis <= 25.0104 )
									ret := -0.030612
								if( basis > 25.0104 )
									ret := 0.469697
					if( Lower_Band > 25.0234 )
						if( bullPower <= 0.038829 )
							if( Lower_Band <= 25.3511 )
								if( bbp <= 0.023489 )
									ret := -0.764706 // sell
								if( bbp > 0.023489 )
									ret := -0.276596
							if( Lower_Band > 25.3511 )
								if( basis <= 25.5162 )
									ret := 0.571429
								if( basis > 25.5162 )
									ret := -0.033876
						if( bullPower > 0.038829 )
							if( bbm <= 0.004678 )
								if( basis <= 25.4887 )
									ret := -0.782609 // sell
								if( basis > 25.4887 )
									ret := -0.134680
							if( bbm > 0.004678 )
								if( bearPower <= 0.034162 )
									ret := -0.400000
								if( bearPower > 0.034162 )
									ret := -0.787500 // sell
				if( bearPower > 0.050476 )
					if( Upper_Band <= 26.0433 )
						if( basis <= 25.4847 )
							if( basis <= 23.6387 )
								if( bullPower <= 0.084726 )
									ret := -0.486207
								if( bullPower > 0.084726 )
									ret := -0.741722 // sell
							if( basis > 23.6387 )
								if( Upper_Band <= 23.9841 )
									ret := 0.297297
								if( Upper_Band > 23.9841 )
									ret := -0.488889
						if( basis > 25.4847 )
							if( bbm <= 0.000422 )
								if( basis <= 25.7328 )
									ret := -0.841463 // sell
								if( basis > 25.7328 )
									ret := -0.500000
							if( bbm > 0.000422 )
								ret := -1.000000 // sell
					if( Upper_Band > 26.0433 )
						if( Upper_Band <= 44.1517 )
							if( bbm <= 0.000248 )
								if( basis <= 42.5024 )
									ret := -0.194062
								if( basis > 42.5024 )
									ret := -0.592000
							if( bbm > 0.000248 )
								if( bbp <= 0.219266 )
									ret := -0.351064
								if( bbp > 0.219266 )
									ret := -0.537415
						if( Upper_Band > 44.1517 )
							if( bearPower <= 0.095378 )
								if( bearPower <= 0.068175 )
									ret := 0.538462
								if( bearPower > 0.068175 )
									ret := 0.363636
							if( bearPower > 0.095378 )
								ret := 0.000000
		if( bbm > 0.009867 )
			if( bearPower <= -0.42339 )
				if( Lower_Band <= 29.1693 )
					if( Upper_Band <= 25.9793 )
						ret := 0.000000
					if( Upper_Band > 25.9793 )
						if( bbp <= -0.510864 )
							ret := 1.000000 // buy
						if( bbp > -0.510864 )
							if( bullPower <= 0.091638 )
								ret := 1.000000 // buy
							if( bullPower > 0.091638 )
								ret := 0.866667 // buy
				if( Lower_Band > 29.1693 )
					if( bbp <= -0.442058 )
						if( bullPower <= -0.007815 )
							ret := 0.636364
						if( bullPower > -0.007815 )
							if( bearPower <= -0.561668 )
								if( basis <= 38.4896 )
									ret := -0.500000
								if( basis > 38.4896 )
									ret := 0.750000 // buy
							if( bearPower > -0.561668 )
								if( bbp <= -0.464782 )
									ret := -0.285714
								if( bbp > -0.464782 )
									ret := -0.636364
					if( bbp > -0.442058 )
						if( bbm <= 0.862816 )
							if( bullPower <= 0.164018 )
								ret := 0.437500
							if( bullPower > 0.164018 )
								ret := 1.000000 // buy
						if( bbm > 0.862816 )
							ret := 0.266667
			if( bearPower > -0.42339 )
				if( basis <= 54.6032 )
					if( bbp <= 1.21671 )
						if( basis <= 51.9623 )
							if( basis <= 20.9198 )
								if( bbm <= 0.051958 )
									ret := -0.333333
								if( bbm > 0.051958 )
									ret := 0.807692 // buy
							if( basis > 20.9198 )
								if( bbp <= 0.061079 )
									ret := 0.004380
								if( bbp > 0.061079 )
									ret := -0.031059
						if( basis > 51.9623 )
							if( Upper_Band <= 54.9233 )
								if( basis <= 52.2667 )
									ret := 0.375000
								if( basis > 52.2667 )
									ret := 0.748503 // buy
							if( Upper_Band > 54.9233 )
								if( BBPower_Color <= 0.5 )
									ret := -0.909091 // sell
								if( BBPower_Color > 0.5 )
									ret := 0.357143
					if( bbp > 1.21671 )
						if( basis <= 46.5531 )
							if( bullPower <= 0.824833 )
								if( bearPower <= 0.565045 )
									ret := -0.648649
								if( bearPower > 0.565045 )
									ret := -0.187500
							if( bullPower > 0.824833 )
								if( bbp <= 1.31467 )
									ret := -0.666667
								if( bbp > 1.31467 )
									ret := -0.840909 // sell
						if( basis > 46.5531 )
							if( bullPower <= 1.11936 )
								if( basis <= 49.9939 )
									ret := 1.000000 // buy
								if( basis > 49.9939 )
									ret := 0.000000
							if( bullPower > 1.11936 )
								ret := -0.200000
				if( basis > 54.6032 )
					if( bearPower <= -0.135624 )
						ret := 0.100000
					if( bearPower > -0.135624 )
						if( Upper_Band <= 54.9752 )
							ret := -0.266667
						if( Upper_Band > 54.9752 )
							if( Lower_Band <= 54.488 )
								if( Upper_Band <= 55.1703 )
									ret := -0.966102 // sell
								if( Upper_Band > 55.1703 )
									ret := -0.761905 // sell
							if( Lower_Band > 54.488 )
								if( basis <= 55.3105 )
									ret := 0.176471
								if( basis > 55.3105 )
									ret := -0.903226 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_UPST_1Min_1a100c25(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


