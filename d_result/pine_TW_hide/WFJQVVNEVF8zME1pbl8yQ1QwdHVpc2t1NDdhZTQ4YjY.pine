//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: XRPUSDT_30Min_2CT0_47ae48b6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2CT0_47ae48b6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_47ae48b6(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= -8.93937e+06 )
		if( tema <= 1.38013 )
			if( ema12 <= -0.005587 )
				if( ema2 <= 0.523058 )
					if( ema2 <= 0.515855 )
						if( ema13 <= -0.016871 )
							if( ema12 <= -0.009106 )
								if( tema <= 0.33898 )
									ret := 0.882353 // buy
								if( tema > 0.33898 )
									ret := 0.276596
							if( ema12 > -0.009106 )
								ret := -0.529412
						if( ema13 > -0.016871 )
							if( ema13 <= -0.010958 )
								if( ema1 <= 0.493482 )
									ret := 0.629310
								if( ema1 > 0.493482 )
									ret := 0.086957
							if( ema13 > -0.010958 )
								if( ad_mf <= -4.21828e+07 )
									ret := 0.230769
								if( ad_mf > -4.21828e+07 )
									ret := 0.863636 // buy
					if( ema2 > 0.515855 )
						if( ema1 <= 0.506522 )
							ret := 0.888889 // buy
						if( ema1 > 0.506522 )
							ret := 1.000000 // buy
				if( ema2 > 0.523058 )
					if( ema12 <= -0.012904 )
						if( ema3 <= 0.640373 )
							if( ema2 <= 0.587109 )
								if( ema3 <= 0.57629 )
									ret := 0.157895
								if( ema3 > 0.57629 )
									ret := 0.904762 // buy
							if( ema2 > 0.587109 )
								if( ema3 <= 0.6066 )
									ret := 0.166667
								if( ema3 > 0.6066 )
									ret := -0.416667
						if( ema3 > 0.640373 )
							if( tema <= 0.920818 )
								if( ad <= -2.3051e+07 )
									ret := 0.483607
								if( ad > -2.3051e+07 )
									ret := 0.878788 // buy
							if( tema > 0.920818 )
								if( ema3 <= 1.03773 )
									ret := -0.133333
								if( ema3 > 1.03773 )
									ret := 0.471042
					if( ema12 > -0.012904 )
						if( tema <= 1.06916 )
							if( ema12 <= -0.011044 )
								if( ema13 <= -0.021728 )
									ret := -0.415094
								if( ema13 > -0.021728 )
									ret := 0.155844
							if( ema12 > -0.011044 )
								if( ema2 <= 0.548696 )
									ret := -0.067568
								if( ema2 > 0.548696 )
									ret := 0.388136
						if( tema > 1.06916 )
							if( ad_mf <= -1.81262e+07 )
								if( ema13 <= -0.017359 )
									ret := -0.100000
								if( ema13 > -0.017359 )
									ret := 0.678571
							if( ad_mf > -1.81262e+07 )
								if( ema13 <= -0.021472 )
									ret := -0.857143 // sell
								if( ema13 > -0.021472 )
									ret := -0.259259
			if( ema12 > -0.005587 )
				if( ad_mf <= -9.05309e+06 )
					if( tema <= 0.432629 )
						if( mf <= 0.109583 )
							if( ema13 <= 0.003484 )
								if( mf <= -0.014417 )
									ret := 0.160602
								if( mf > -0.014417 )
									ret := 0.398860
							if( ema13 > 0.003484 )
								if( ad <= -1.25765e+07 )
									ret := -0.251969
								if( ad > -1.25765e+07 )
									ret := 0.397959
						if( mf > 0.109583 )
							if( ad <= -2.74384e+07 )
								if( mf <= 0.156872 )
									ret := -0.666667
								if( mf > 0.156872 )
									ret := 0.307692
							if( ad > -2.74384e+07 )
								if( ema12 <= -1.6e-05 )
									ret := 0.050000
								if( ema12 > -1.6e-05 )
									ret := 0.595238
					if( tema > 0.432629 )
						if( ema13 <= 0.062924 )
							if( ad <= -9.63719e+06 )
								if( ema1 <= 0.43246 )
									ret := -0.621622
								if( ema1 > 0.43246 )
									ret := 0.087107
							if( ad > -9.63719e+06 )
								if( ad_mf <= -9.28576e+06 )
									ret := -0.310078
								if( ad_mf > -9.28576e+06 )
									ret := 0.103261
						if( ema13 > 0.062924 )
							if( ema13 <= 0.074723 )
								if( ad_mf <= -3.66143e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -3.66143e+07 )
									ret := 0.000000
							if( ema13 > 0.074723 )
								ret := -0.294118
				if( ad_mf > -9.05309e+06 )
					if( mf <= -0.124701 )
						ret := -0.500000
					if( mf > -0.124701 )
						if( mf <= 0.025988 )
							if( ad <= -9.00403e+06 )
								if( mf <= -0.059687 )
									ret := 0.928571 // buy
								if( mf > -0.059687 )
									ret := 0.500000
							if( ad > -9.00403e+06 )
								if( mf <= 0.005271 )
									ret := 0.645161
								if( mf > 0.005271 )
									ret := 0.071429
						if( mf > 0.025988 )
							if( ema12 <= 0.003582 )
								ret := 1.000000 // buy
							if( ema12 > 0.003582 )
								ret := 0.769231 // buy
		if( tema > 1.38013 )
			if( ema12 <= -0.033037 )
				ret := 1.000000 // buy
			if( ema12 > -0.033037 )
				if( ema13 <= 0.064597 )
					if( mf <= 0.233925 )
						if( mf <= 0.040174 )
							if( ema1 <= 1.67788 )
								if( ema1 <= 1.60757 )
									ret := -0.373333
								if( ema1 > 1.60757 )
									ret := -1.000000 // sell
							if( ema1 > 1.67788 )
								ret := 0.105263
						if( mf > 0.040174 )
							if( ema12 <= 0.004982 )
								if( ema3 <= 1.58234 )
									ret := 0.473684
								if( ema3 > 1.58234 )
									ret := -0.114286
							if( ema12 > 0.004982 )
								if( ad_mf <= -1.3017e+07 )
									ret := -0.431818
								if( ad_mf > -1.3017e+07 )
									ret := 0.083333
					if( mf > 0.233925 )
						ret := -0.933333 // sell
				if( ema13 > 0.064597 )
					if( ema2 <= 1.53749 )
						ret := 0.529412
					if( ema2 > 1.53749 )
						ret := -0.100000
	if( ad > -8.93937e+06 )
		if( ema13 <= 0.005853 )
			if( ema12 <= -0.00316 )
				if( ad_mf <= -5.53439e+06 )
					if( ad <= -6.65409e+06 )
						if( ad_mf <= -6.71839e+06 )
							if( mf <= 0.091081 )
								if( ema12 <= -0.009165 )
									ret := -0.293706
								if( ema12 > -0.009165 )
									ret := 0.129518
							if( mf > 0.091081 )
								if( tema <= 0.945865 )
									ret := 0.837838 // buy
								if( tema > 0.945865 )
									ret := 0.526316
						if( ad_mf > -6.71839e+06 )
							ret := -0.900000 // sell
					if( ad > -6.65409e+06 )
						if( mf <= -0.151969 )
							if( ad <= -6.06771e+06 )
								if( ema12 <= -0.00456 )
									ret := -0.083333
								if( ema12 > -0.00456 )
									ret := -0.588235
							if( ad > -6.06771e+06 )
								if( ema12 <= -0.005914 )
									ret := 0.875000 // buy
								if( ema12 > -0.005914 )
									ret := -0.100000
						if( mf > -0.151969 )
							if( ema13 <= -0.025613 )
								ret := -0.200000
							if( ema13 > -0.025613 )
								if( ad <= -6.11627e+06 )
									ret := 0.751323 // buy
								if( ad > -6.11627e+06 )
									ret := 0.485356
				if( ad_mf > -5.53439e+06 )
					if( mf <= -0.047424 )
						if( tema <= 1.23392 )
							if( ad <= -2.24501e+06 )
								if( ema13 <= -0.019726 )
									ret := -0.400000
								if( ema13 > -0.019726 )
									ret := 0.144078
							if( ad > -2.24501e+06 )
								if( ad <= -2.17216e+06 )
									ret := -1.000000 // sell
								if( ad > -2.17216e+06 )
									ret := -0.019491
						if( tema > 1.23392 )
							if( ema13 <= -0.053311 )
								ret := 0.875000 // buy
							if( ema13 > -0.053311 )
								if( ema1 <= 1.53513 )
									ret := -0.529412
								if( ema1 > 1.53513 )
									ret := -0.037037
					if( mf > -0.047424 )
						if( ema13 <= -0.004034 )
							if( ema12 <= -0.060963 )
								ret := 0.947368 // buy
							if( ema12 > -0.060963 )
								if( ema13 <= -0.011411 )
									ret := 0.032854
								if( ema13 > -0.011411 )
									ret := 0.138041
						if( ema13 > -0.004034 )
							if( ema12 <= -0.004538 )
								if( ema3 <= 1.33184 )
									ret := 0.477273
								if( ema3 > 1.33184 )
									ret := 0.000000
							if( ema12 > -0.004538 )
								if( ad <= 3.16359e+07 )
									ret := -0.307143
								if( ad > 3.16359e+07 )
									ret := -0.950000 // sell
			if( ema12 > -0.00316 )
				if( tema <= 0.655244 )
					if( ad_mf <= 2.54457e+07 )
						if( ema2 <= 0.228477 )
							if( ema13 <= 0.00037 )
								if( ema1 <= 0.222249 )
									ret := -0.230769
								if( ema1 > 0.222249 )
									ret := 0.276596
							if( ema13 > 0.00037 )
								if( ad <= -2.17449e+06 )
									ret := -0.153846
								if( ad > -2.17449e+06 )
									ret := 0.646154
						if( ema2 > 0.228477 )
							if( ema13 <= -0.006248 )
								if( ema12 <= -0.001105 )
									ret := -0.185615
								if( ema12 > -0.001105 )
									ret := 0.625000
							if( ema13 > -0.006248 )
								if( ema13 <= -0.004276 )
									ret := 0.092341
								if( ema13 > -0.004276 )
									ret := -0.000214
					if( ad_mf > 2.54457e+07 )
						if( tema <= 0.326644 )
							if( tema <= 0.294612 )
								if( tema <= 0.23657 )
									ret := -0.933333 // sell
								if( tema > 0.23657 )
									ret := -0.419355
							if( tema > 0.294612 )
								if( ema1 <= 0.317325 )
									ret := -1.000000 // sell
								if( ema1 > 0.317325 )
									ret := -0.800000 // sell
						if( tema > 0.326644 )
							if( ad <= 6.83201e+07 )
								if( ema13 <= -0.000849 )
									ret := 0.267606
								if( ema13 > -0.000849 )
									ret := -0.238095
							if( ad > 6.83201e+07 )
								ret := -0.857143 // sell
				if( tema > 0.655244 )
					if( ad <= -8.70118e+06 )
						if( ema2 <= 0.833801 )
							ret := -0.058824
						if( ema2 > 0.833801 )
							if( ema12 <= -1.1e-05 )
								if( mf <= 0.010132 )
									ret := -1.000000 // sell
								if( mf > 0.010132 )
									ret := -0.800000 // sell
							if( ema12 > -1.1e-05 )
								ret := -0.444444
					if( ad > -8.70118e+06 )
						if( ema13 <= -0.00717 )
							if( ad <= 2.0477e+07 )
								if( ad_mf <= -7.36774e+06 )
									ret := -1.000000 // sell
								if( ad_mf > -7.36774e+06 )
									ret := -0.295082
							if( ad > 2.0477e+07 )
								if( ad <= 2.47167e+07 )
									ret := 0.909091 // buy
								if( ad > 2.47167e+07 )
									ret := -0.142857
						if( ema13 > -0.00717 )
							if( ema12 <= 0.0059 )
								if( tema <= 0.674667 )
									ret := -0.151809
								if( tema > 0.674667 )
									ret := -0.036742
							if( ema12 > 0.0059 )
								if( mf <= 0.152092 )
									ret := -0.206897
								if( mf > 0.152092 )
									ret := -1.000000 // sell
		if( ema13 > 0.005853 )
			if( ad_mf <= -4.61085e+06 )
				if( ema1 <= 0.745987 )
					if( ad_mf <= -5.32493e+06 )
						if( ema12 <= 0.005212 )
							if( ema2 <= 0.639654 )
								if( ad_mf <= -8.40744e+06 )
									ret := 0.470588
								if( ad_mf > -8.40744e+06 )
									ret := -0.160377
							if( ema2 > 0.639654 )
								if( ad <= -5.99322e+06 )
									ret := 0.553571
								if( ad > -5.99322e+06 )
									ret := -0.142857
						if( ema12 > 0.005212 )
							if( ad_mf <= -6.46059e+06 )
								if( tema <= 0.695306 )
									ret := -0.187500
								if( tema > 0.695306 )
									ret := -0.735294 // sell
							if( ad_mf > -6.46059e+06 )
								if( ema3 <= 0.603673 )
									ret := -0.734694 // sell
								if( ema3 > 0.603673 )
									ret := -1.000000 // sell
					if( ad_mf > -5.32493e+06 )
						if( ad <= -5.26192e+06 )
							if( ema1 <= 0.546489 )
								ret := 0.615385
							if( ema1 > 0.546489 )
								if( tema <= 0.62402 )
									ret := 1.000000 // buy
								if( tema > 0.62402 )
									ret := 0.600000
						if( ad > -5.26192e+06 )
							if( ema1 <= 0.573309 )
								if( mf <= -0.002359 )
									ret := 0.230769
								if( mf > -0.002359 )
									ret := 0.750000 // buy
							if( ema1 > 0.573309 )
								if( ad <= -5.22964e+06 )
									ret := -0.600000
								if( ad > -5.22964e+06 )
									ret := 0.000000
				if( ema1 > 0.745987 )
					if( ad_mf <= -5.17043e+06 )
						if( ema12 <= 0.004412 )
							if( tema <= 0.838034 )
								if( ad <= -7.06385e+06 )
									ret := 0.181818
								if( ad > -7.06385e+06 )
									ret := 0.842105 // buy
							if( tema > 0.838034 )
								if( mf <= -0.071493 )
									ret := -0.722222 // sell
								if( mf > -0.071493 )
									ret := 0.216667
						if( ema12 > 0.004412 )
							if( tema <= 0.789224 )
								if( ad <= -6.51511e+06 )
									ret := 0.580645
								if( ad > -6.51511e+06 )
									ret := -0.235294
							if( tema > 0.789224 )
								if( ad <= -6.01169e+06 )
									ret := 0.112000
								if( ad > -6.01169e+06 )
									ret := -0.459677
					if( ad_mf > -5.17043e+06 )
						if( mf <= -0.031569 )
							ret := -0.250000
						if( mf > -0.031569 )
							if( ema2 <= 1.22214 )
								if( mf <= 0.137516 )
									ret := 0.661017
								if( mf > 0.137516 )
									ret := 0.285714
							if( ema2 > 1.22214 )
								ret := 0.894737 // buy
			if( ad_mf > -4.61085e+06 )
				if( ema12 <= 0.01745 )
					if( ad <= -3.96591e+06 )
						if( ad <= -4.12772e+06 )
							if( ema12 <= 0.005911 )
								if( ad_mf <= -4.45234e+06 )
									ret := -0.500000
								if( ad_mf > -4.45234e+06 )
									ret := 0.098765
							if( ema12 > 0.005911 )
								if( ema3 <= 0.978946 )
									ret := -0.742424 // sell
								if( ema3 > 0.978946 )
									ret := 0.277778
						if( ad > -4.12772e+06 )
							if( ema3 <= 0.465698 )
								ret := -1.000000 // sell
							if( ema3 > 0.465698 )
								if( ema1 <= 0.836677 )
									ret := -0.568627
								if( ema1 > 0.836677 )
									ret := -0.906977 // sell
					if( ad > -3.96591e+06 )
						if( ema12 <= 0.000943 )
							if( ema13 <= 0.009137 )
								if( mf <= 0.140312 )
									ret := 0.185185
								if( mf > 0.140312 )
									ret := 1.000000 // buy
							if( ema13 > 0.009137 )
								if( ema1 <= 1.09798 )
									ret := 0.777778 // buy
								if( ema1 > 1.09798 )
									ret := 1.000000 // buy
						if( ema12 > 0.000943 )
							if( ema13 <= 0.023994 )
								if( ema13 <= 0.019977 )
									ret := -0.108601
								if( ema13 > 0.019977 )
									ret := -0.322314
							if( ema13 > 0.023994 )
								if( ema3 <= 1.17906 )
									ret := -0.021692
								if( ema3 > 1.17906 )
									ret := 0.387324
				if( ema12 > 0.01745 )
					if( ad <= 8.68834e+07 )
						if( ad <= -1.66932e+06 )
							if( tema <= 1.29177 )
								if( ema12 <= 0.022611 )
									ret := -0.772727 // sell
								if( ema12 > 0.022611 )
									ret := -1.000000 // sell
							if( tema > 1.29177 )
								ret := -0.545455
						if( ad > -1.66932e+06 )
							if( ema12 <= 0.038741 )
								if( ema3 <= 1.12965 )
									ret := -0.436658
								if( ema3 > 1.12965 )
									ret := -0.177419
							if( ema12 > 0.038741 )
								if( ema3 <= 0.627074 )
									ret := -0.230769
								if( ema3 > 0.627074 )
									ret := -0.821918 // sell
					if( ad > 8.68834e+07 )
						if( ad_mf <= 1.70068e+08 )
							if( ad_mf <= 1.17563e+08 )
								ret := 0.363636
							if( ad_mf > 1.17563e+08 )
								ret := 1.000000 // buy
						if( ad_mf > 1.70068e+08 )
							if( ema1 <= 0.59926 )
								ret := -1.000000 // sell
							if( ema1 > 0.59926 )
								ret := -0.272727
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_47ae48b6(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)

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


