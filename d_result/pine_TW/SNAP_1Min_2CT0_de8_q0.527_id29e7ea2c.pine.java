//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: SNAP_1Min_2CT0_29e7ea2c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2CT0_29e7ea2c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_29e7ea2c(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= 198.051 )
		if( tema <= 15.1251 )
			if( ema12 <= 0.00418 )
				if( ema1 <= 8.3138 )
					if( ad_mf <= 0.301801 )
						if( ema12 <= -0.000221 )
							if( ema3 <= 8.29093 )
								if( ema12 <= -0.002213 )
									ret := 0.750000 // buy
								if( ema12 > -0.002213 )
									ret := 1.000000 // buy
							if( ema3 > 8.29093 )
								if( ad <= -2132 )
									ret := 0.000000
								if( ad > -2132 )
									ret := 0.375000
						if( ema12 > -0.000221 )
							if( ad_mf <= 0.189407 )
								if( ema3 <= 8.29028 )
									ret := 0.666667
								if( ema3 > 8.29028 )
									ret := 0.264706
							if( ad_mf > 0.189407 )
								ret := -0.545455
					if( ad_mf > 0.301801 )
						if( ema3 <= 8.29463 )
							ret := 0.166667
						if( ema3 > 8.29463 )
							if( tema <= 8.29707 )
								ret := 0.800000 // buy
							if( tema > 8.29707 )
								ret := 1.000000 // buy
				if( ema1 > 8.3138 )
					if( ema13 <= 0.00957 )
						if( tema <= 14.9952 )
							if( ad_mf <= -6135.17 )
								if( ad <= -754045 )
									ret := 0.721519 // buy
								if( ad > -754045 )
									ret := 0.050027
							if( ad_mf > -6135.17 )
								if( ema2 <= 9.565 )
									ret := 0.097765
								if( ema2 > 9.565 )
									ret := 0.161643
						if( tema > 14.9952 )
							if( ad_mf <= -4878.55 )
								if( ad <= -55601.8 )
									ret := 0.410256
								if( ad > -55601.8 )
									ret := -0.023490
							if( ad_mf > -4878.55 )
								if( tema <= 15.0505 )
									ret := 0.639130
								if( tema > 15.0505 )
									ret := 0.184397
					if( ema13 > 0.00957 )
						if( ema2 <= 14.8136 )
							if( ad <= -3121.32 )
								if( ad <= -8113.25 )
									ret := 0.190608
								if( ad > -8113.25 )
									ret := -0.209302
							if( ad > -3121.32 )
								if( ema13 <= 0.01084 )
									ret := 0.627273
								if( ema13 > 0.01084 )
									ret := 0.348039
						if( ema2 > 14.8136 )
							if( mf <= 0.404709 )
								if( ema13 <= 0.014502 )
									ret := 0.837838 // buy
								if( ema13 > 0.014502 )
									ret := 0.416667
							if( mf > 0.404709 )
								ret := 0.000000
			if( ema12 > 0.00418 )
				if( ad_mf <= -0.322036 )
					if( tema <= 15.0376 )
						if( ad_mf <= -170133 )
							if( tema <= 9.49282 )
								ret := 0.846154 // buy
							if( tema > 9.49282 )
								if( mf <= 0.139751 )
									ret := -0.455000
								if( mf > 0.139751 )
									ret := 0.093750
						if( ad_mf > -170133 )
							if( ad_mf <= -147686 )
								if( mf <= 0.035508 )
									ret := 0.000000
								if( mf > 0.035508 )
									ret := 0.898305 // buy
							if( ad_mf > -147686 )
								if( ad_mf <= -19980.7 )
									ret := -0.024934
								if( ad_mf > -19980.7 )
									ret := 0.063261
					if( tema > 15.0376 )
						if( ema1 <= 15.0721 )
							if( tema <= 15.0703 )
								if( mf <= 0.175092 )
									ret := 0.086957
								if( mf > 0.175092 )
									ret := 0.650000
							if( tema > 15.0703 )
								if( ema3 <= 15.0457 )
									ret := 0.785714 // buy
								if( ema3 > 15.0457 )
									ret := 1.000000 // buy
						if( ema1 > 15.0721 )
							if( ad <= -15207 )
								if( ema1 <= 15.1061 )
									ret := 0.416667
								if( ema1 > 15.1061 )
									ret := 0.928571 // buy
							if( ad > -15207 )
								if( tema <= 15.0993 )
									ret := -0.111111
								if( tema > 15.0993 )
									ret := 0.214286
				if( ad_mf > -0.322036 )
					if( ema12 <= 0.013347 )
						if( tema <= 10.1228 )
							if( ema1 <= 8.48403 )
								if( ad_mf <= -0.217174 )
									ret := -0.461538
								if( ad_mf > -0.217174 )
									ret := -0.818182 // sell
							if( ema1 > 8.48403 )
								if( ad_mf <= 0.365724 )
									ret := -0.270535
								if( ad_mf > 0.365724 )
									ret := 0.038961
						if( tema > 10.1228 )
							if( ema12 <= 0.006694 )
								if( ema13 <= 0.001798 )
									ret := -0.840000 // sell
								if( ema13 > 0.001798 )
									ret := 0.147887
							if( ema12 > 0.006694 )
								if( tema <= 10.1483 )
									ret := 0.833333 // buy
								if( tema > 10.1483 )
									ret := -0.063212
					if( ema12 > 0.013347 )
						if( ad_mf <= 0.04774 )
							if( ema3 <= 14.5245 )
								if( ema1 <= 13.3681 )
									ret := -0.421199
								if( ema1 > 13.3681 )
									ret := 0.122951
							if( ema3 > 14.5245 )
								if( ema1 <= 14.6945 )
									ret := -0.969697 // sell
								if( ema1 > 14.6945 )
									ret := -0.406780
						if( ad_mf > 0.04774 )
							if( mf <= -0.389093 )
								if( ema12 <= 0.027065 )
									ret := -0.636364
								if( ema12 > 0.027065 )
									ret := -1.000000 // sell
							if( mf > -0.389093 )
								if( ema3 <= 11.161 )
									ret := -0.140000
								if( ema3 > 11.161 )
									ret := 0.350000
		if( tema > 15.1251 )
			if( ema13 <= 0.008272 )
				if( ema13 <= -0.128711 )
					if( ema13 <= -0.180851 )
						ret := 1.000000 // buy
					if( ema13 > -0.180851 )
						if( ema1 <= 15.8991 )
							ret := 1.000000 // buy
						if( ema1 > 15.8991 )
							if( ema12 <= -0.079621 )
								ret := 0.181818
							if( ema12 > -0.079621 )
								ret := 0.769231 // buy
				if( ema13 > -0.128711 )
					if( ad_mf <= 0.419687 )
						if( mf <= 0.039957 )
							if( ad_mf <= -43757.5 )
								if( ad <= -85417.9 )
									ret := -0.005556
								if( ad > -85417.9 )
									ret := 0.300353
							if( ad_mf > -43757.5 )
								if( ad_mf <= -39671.9 )
									ret := -0.295455
								if( ad_mf > -39671.9 )
									ret := 0.060045
						if( mf > 0.039957 )
							if( tema <= 15.7499 )
								if( ad <= -46.5905 )
									ret := -0.030120
								if( ad > -46.5905 )
									ret := -0.224215
							if( tema > 15.7499 )
								if( ema12 <= 0.005747 )
									ret := 0.029956
								if( ema12 > 0.005747 )
									ret := -0.789474 // sell
					if( ad_mf > 0.419687 )
						if( ad <= 130.127 )
							if( ema12 <= -0.020471 )
								if( ad_mf <= 0.480676 )
									ret := 0.852941 // buy
								if( ad_mf > 0.480676 )
									ret := 0.428571
							if( ema12 > -0.020471 )
								if( mf <= -0.698852 )
									ret := 0.627907
								if( mf > -0.698852 )
									ret := 0.175000
						if( ad > 130.127 )
							ret := -0.466667
			if( ema13 > 0.008272 )
				if( mf <= 0.066397 )
					if( ema13 <= 0.03134 )
						if( ad <= -35.2827 )
							if( ema2 <= 15.8753 )
								if( ad <= -12793.3 )
									ret := 0.137500
								if( ad > -12793.3 )
									ret := -0.144796
							if( ema2 > 15.8753 )
								if( ema12 <= 0.005305 )
									ret := 0.064327
								if( ema12 > 0.005305 )
									ret := -0.166667
						if( ad > -35.2827 )
							if( ema13 <= 0.028899 )
								if( ad_mf <= 0.346623 )
									ret := -0.306226
								if( ad_mf > 0.346623 )
									ret := 0.202247
							if( ema13 > 0.028899 )
								if( ema13 <= 0.03004 )
									ret := 0.687500
								if( ema13 > 0.03004 )
									ret := -0.192308
					if( ema13 > 0.03134 )
						if( tema <= 16.7297 )
							if( ema13 <= 0.055167 )
								if( ad <= -104196 )
									ret := 0.088235
								if( ad > -104196 )
									ret := -0.348485
							if( ema13 > 0.055167 )
								if( ad <= -14299.2 )
									ret := -0.262500
								if( ad > -14299.2 )
									ret := 0.333333
						if( tema > 16.7297 )
							if( ema13 <= 0.044474 )
								if( mf <= -0.036032 )
									ret := -0.562500
								if( mf > -0.036032 )
									ret := -0.973684 // sell
							if( ema13 > 0.044474 )
								if( ad <= -42004.6 )
									ret := 0.181818
								if( ad > -42004.6 )
									ret := -0.656250
				if( mf > 0.066397 )
					if( mf <= 0.686929 )
						if( ema13 <= 0.066857 )
							if( ema12 <= 0.00133 )
								if( ema12 <= -0.001156 )
									ret := 0.150000
								if( ema12 > -0.001156 )
									ret := -0.600000
							if( ema12 > 0.00133 )
								if( ad <= -26930.2 )
									ret := 0.146998
								if( ad > -26930.2 )
									ret := -0.014079
						if( ema13 > 0.066857 )
							if( ad <= -35119.3 )
								if( ad <= -123056 )
									ret := 0.066667
								if( ad > -123056 )
									ret := -0.563830
							if( ad > -35119.3 )
								if( tema <= 16.3077 )
									ret := -0.288732
								if( tema > 16.3077 )
									ret := 0.192771
					if( mf > 0.686929 )
						if( mf <= 0.804167 )
							if( ema13 <= 0.02949 )
								if( ema2 <= 15.1714 )
									ret := 0.700000 // buy
								if( ema2 > 15.1714 )
									ret := -0.318182
							if( ema13 > 0.02949 )
								if( ema13 <= 0.042912 )
									ret := -0.800000 // sell
								if( ema13 > 0.042912 )
									ret := -1.000000 // sell
						if( mf > 0.804167 )
							ret := -1.000000 // sell
	if( ad_mf > 198.051 )
		if( ad <= 6441.07 )
			if( ema12 <= 0.005534 )
				if( ema12 <= -0.028779 )
					if( ema2 <= 10.5732 )
						if( mf <= -0.20202 )
							ret := -0.875000 // sell
						if( mf > -0.20202 )
							ret := -0.416667
					if( ema2 > 10.5732 )
						if( ema1 <= 15.0803 )
							if( ema13 <= -0.059863 )
								if( ad <= 2277.46 )
									ret := 0.071429
								if( ad > 2277.46 )
									ret := 0.714286 // buy
							if( ema13 > -0.059863 )
								if( tema <= 12.2411 )
									ret := 0.833333 // buy
								if( tema > 12.2411 )
									ret := 1.000000 // buy
						if( ema1 > 15.0803 )
							if( ema3 <= 16.5299 )
								if( tema <= 15.9765 )
									ret := 0.041667
								if( tema > 15.9765 )
									ret := -0.692308
							if( ema3 > 16.5299 )
								ret := 0.625000
				if( ema12 > -0.028779 )
					if( ad_mf <= 5922.3 )
						if( ema12 <= -0.028067 )
							ret := -1.000000 // sell
						if( ema12 > -0.028067 )
							if( ema1 <= 9.60453 )
								if( ad <= 503.279 )
									ret := 0.125749
								if( ad > 503.279 )
									ret := -0.211883
							if( ema1 > 9.60453 )
								if( ema1 <= 9.68676 )
									ret := 0.377778
								if( ema1 > 9.68676 )
									ret := -0.059218
					if( ad_mf > 5922.3 )
						if( ema3 <= 13.4705 )
							if( ad <= 6029.48 )
								if( mf <= 0.093205 )
									ret := -1.000000 // sell
								if( mf > 0.093205 )
									ret := -0.571429
							if( ad > 6029.48 )
								if( ad_mf <= 6268.03 )
									ret := 0.117647
								if( ad_mf > 6268.03 )
									ret := -0.480769
						if( ema3 > 13.4705 )
							if( ad_mf <= 6002.34 )
								if( ema13 <= -0.013585 )
									ret := 0.153846
								if( ema13 > -0.013585 )
									ret := -0.783784 // sell
							if( ad_mf > 6002.34 )
								if( ema13 <= 0.007794 )
									ret := 0.051724
								if( ema13 > 0.007794 )
									ret := -0.777778 // sell
			if( ema12 > 0.005534 )
				if( ema2 <= 15.9906 )
					if( mf <= 0.215512 )
						if( ema12 <= 0.024448 )
							if( ema1 <= 13.3474 )
								if( ema2 <= 13.1801 )
									ret := -0.313907
								if( ema2 > 13.1801 )
									ret := 0.416667
							if( ema1 > 13.3474 )
								if( ema12 <= 0.021864 )
									ret := -0.491135
								if( ema12 > 0.021864 )
									ret := 0.193548
						if( ema12 > 0.024448 )
							if( ema1 <= 14.9765 )
								if( ad <= 1711.87 )
									ret := -0.288462
								if( ad > 1711.87 )
									ret := -0.937008 // sell
							if( ema1 > 14.9765 )
								if( ema3 <= 15.6195 )
									ret := -0.177778
								if( ema3 > 15.6195 )
									ret := -0.720000 // sell
					if( mf > 0.215512 )
						if( mf <= 0.409075 )
							if( ad_mf <= 2693.47 )
								if( ema1 <= 10.6846 )
									ret := -0.337500
								if( ema1 > 10.6846 )
									ret := 0.247475
							if( ad_mf > 2693.47 )
								if( ad_mf <= 3555.78 )
									ret := -0.686275
								if( ad_mf > 3555.78 )
									ret := -0.312102
						if( mf > 0.409075 )
							if( ema12 <= 0.023402 )
								if( ad <= 1144.95 )
									ret := 0.053333
								if( ad > 1144.95 )
									ret := -0.468927
							if( ema12 > 0.023402 )
								if( ema12 <= 0.046982 )
									ret := -0.752941 // sell
								if( ema12 > 0.046982 )
									ret := -0.100000
				if( ema2 > 15.9906 )
					if( ema12 <= 0.026034 )
						if( ema13 <= 0.002507 )
							ret := -0.600000
						if( ema13 > 0.002507 )
							if( ema2 <= 16.8961 )
								if( ad <= 1300.44 )
									ret := -0.268657
								if( ad > 1300.44 )
									ret := 0.116751
							if( ema2 > 16.8961 )
								ret := -0.500000
					if( ema12 > 0.026034 )
						if( ema12 <= 0.035039 )
							ret := -0.363636
						if( ema12 > 0.035039 )
							ret := -0.764706 // sell
		if( ad > 6441.07 )
			if( ema12 <= -0.084247 )
				if( ema13 <= -0.28867 )
					ret := 1.000000 // buy
				if( ema13 > -0.28867 )
					if( ema3 <= 13.4228 )
						if( tema <= 10.6369 )
							ret := -0.083333
						if( tema > 10.6369 )
							ret := -0.214286
					if( ema3 > 13.4228 )
						if( ema1 <= 16.1638 )
							ret := 1.000000 // buy
						if( ema1 > 16.1638 )
							ret := 0.700000 // buy
			if( ema12 > -0.084247 )
				if( ema3 <= 15.1524 )
					if( mf <= 0.252243 )
						if( ad <= 6594.3 )
							if( ema13 <= -0.033963 )
								ret := 1.000000 // buy
							if( ema13 > -0.033963 )
								if( ad <= 6531.68 )
									ret := 0.314286
								if( ad > 6531.68 )
									ret := 0.769231 // buy
						if( ad > 6594.3 )
							if( ad <= 149990 )
								if( ad_mf <= 67328.1 )
									ret := -0.074312
								if( ad_mf > 67328.1 )
									ret := 0.015049
							if( ad > 149990 )
								if( ad_mf <= 344354 )
									ret := -0.264664
								if( ad_mf > 344354 )
									ret := 0.004695
					if( mf > 0.252243 )
						if( mf <= 0.684735 )
							if( ema13 <= 0.007122 )
								if( ad <= 937468 )
									ret := 0.042389
								if( ad > 937468 )
									ret := -0.882353 // sell
							if( ema13 > 0.007122 )
								if( ema12 <= 0.006309 )
									ret := 0.045161
								if( ema12 > 0.006309 )
									ret := -0.262792
						if( mf > 0.684735 )
							if( ema13 <= 0.028993 )
								if( mf <= 0.759072 )
									ret := -0.846154 // sell
								if( mf > 0.759072 )
									ret := -0.230769
							if( ema13 > 0.028993 )
								ret := -1.000000 // sell
				if( ema3 > 15.1524 )
					if( ema13 <= 0.045294 )
						if( ad_mf <= 81410.3 )
							if( ema13 <= -0.004634 )
								if( ema12 <= -1e-06 )
									ret := -0.003798
								if( ema12 > -1e-06 )
									ret := -0.315789
							if( ema13 > -0.004634 )
								if( ad <= 69180.1 )
									ret := 0.054284
								if( ad > 69180.1 )
									ret := 0.631579
						if( ad_mf > 81410.3 )
							if( ad <= 155022 )
								if( tema <= 16.9652 )
									ret := -0.323462
								if( tema > 16.9652 )
									ret := 0.533333
							if( ad > 155022 )
								if( ema12 <= -0.009115 )
									ret := 0.729730 // buy
								if( ema12 > -0.009115 )
									ret := -0.171875
					if( ema13 > 0.045294 )
						if( ema1 <= 15.5094 )
							if( ad <= 105493 )
								if( ad_mf <= 36753.1 )
									ret := 0.000000
								if( ad_mf > 36753.1 )
									ret := 0.580000
							if( ad > 105493 )
								ret := -1.000000 // sell
						if( ema1 > 15.5094 )
							if( ad_mf <= 38515.3 )
								if( ema12 <= 0.037496 )
									ret := -0.177885
								if( ema12 > 0.037496 )
									ret := -0.542857
							if( ad_mf > 38515.3 )
								if( ema12 <= 0.05863 )
									ret := -0.011299
								if( ema12 > 0.05863 )
									ret := -0.463415
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_29e7ea2c(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


