//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MELI_15Min_2ST0_d78e90a0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2ST0_d78e90a0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_d78e90a0(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d <= 97.5284 )
		if( ema12 <= -4.94824 )
			if( ema12 <= -22.5757 )
				if( rsi1 <= 28.9135 )
					if( ema3 <= 1314.97 )
						if( ema1 <= 1127.72 )
							ret := 0.200000
						if( ema1 > 1127.72 )
							ret := -0.050000
					if( ema3 > 1314.97 )
						if( ema3 <= 1783.3 )
							if( ema2 <= 1512.18 )
								ret := 1.000000 // buy
							if( ema2 > 1512.18 )
								if( ema13 <= -51.2611 )
									ret := 1.000000 // buy
								if( ema13 > -51.2611 )
									ret := 0.828571 // buy
						if( ema3 > 1783.3 )
							if( d <= 4.77096 )
								ret := 0.888889 // buy
							if( d > 4.77096 )
								ret := 0.000000
				if( rsi1 > 28.9135 )
					if( ema2 <= 1372.4 )
						ret := -0.923077 // sell
					if( ema2 > 1372.4 )
						if( rsi1 <= 30.5013 )
							ret := -0.428571
						if( rsi1 > 30.5013 )
							ret := 0.692308
			if( ema12 > -22.5757 )
				if( tema <= 564.99 )
					if( ema13 <= -15.383 )
						if( rsi1 <= 31.0077 )
							if( d_k <= -3.9163 )
								ret := -0.111111
							if( d_k > -3.9163 )
								ret := 1.000000 // buy
						if( rsi1 > 31.0077 )
							if( rsi1 <= 35.4946 )
								if( rsi1 <= 32.4775 )
									ret := 0.500000
								if( rsi1 > 32.4775 )
									ret := -0.692308
							if( rsi1 > 35.4946 )
								ret := 1.000000 // buy
					if( ema13 > -15.383 )
						if( tema <= 448.392 )
							if( smoothD_d <= -1.7446 )
								if( ema12 <= -5.88766 )
									ret := -0.333333
								if( ema12 > -5.88766 )
									ret := -1.000000 // sell
							if( smoothD_d > -1.7446 )
								if( ema12 <= -5.12462 )
									ret := 0.715789 // buy
								if( ema12 > -5.12462 )
									ret := -0.500000
						if( tema > 448.392 )
							if( ema12 <= -8.09123 )
								if( smoothD_d <= 2.29615 )
									ret := 1.000000 // buy
								if( smoothD_d > 2.29615 )
									ret := 0.600000
							if( ema12 > -8.09123 )
								if( ema3 <= 481.517 )
									ret := -0.777778 // sell
								if( ema3 > 481.517 )
									ret := -0.039801
				if( tema > 564.99 )
					if( ema13 <= -12.1588 )
						if( ema3 <= 769.851 )
							if( d_k <= 16.4922 )
								if( ema3 <= 678.118 )
									ret := 0.100000
								if( ema3 > 678.118 )
									ret := -0.726027 // sell
							if( d_k > 16.4922 )
								ret := 1.000000 // buy
						if( ema3 > 769.851 )
							if( ema2 <= 768.194 )
								if( d <= 13.2386 )
									ret := 0.500000
								if( d > 13.2386 )
									ret := 0.902439 // buy
							if( ema2 > 768.194 )
								if( rsi1 <= 15.2981 )
									ret := 0.064417
								if( rsi1 > 15.2981 )
									ret := -0.165364
					if( ema13 > -12.1588 )
						if( smoothD_d <= 11.4788 )
							if( ema3 <= 838.623 )
								if( ema3 <= 625.139 )
									ret := -0.760870 // sell
								if( ema3 > 625.139 )
									ret := -0.369565
							if( ema3 > 838.623 )
								if( rsi1 <= 29.3234 )
									ret := 0.060790
								if( rsi1 > 29.3234 )
									ret := -0.128637
						if( smoothD_d > 11.4788 )
							if( ema2 <= 1031.3 )
								if( k <= 46.0827 )
									ret := 0.300885
								if( k > 46.0827 )
									ret := -0.137255
							if( ema2 > 1031.3 )
								if( ema12 <= -8.47366 )
									ret := -0.787879 // sell
								if( ema12 > -8.47366 )
									ret := -0.043192
		if( ema12 > -4.94824 )
			if( ema2 <= 237.65 )
				if( ema2 <= 153.427 )
					if( ema1 <= 152.56 )
						if( ema1 <= 151.755 )
							if( ema3 <= 151.521 )
								ret := 1.000000 // buy
							if( ema3 > 151.521 )
								ret := 0.636364
						if( ema1 > 151.755 )
							if( smoothD_d <= 71.9746 )
								if( ema3 <= 152.099 )
									ret := 0.000000
								if( ema3 > 152.099 )
									ret := 0.210526
							if( smoothD_d > 71.9746 )
								ret := 0.625000
					if( ema1 > 152.56 )
						if( k <= 93.9761 )
							if( smoothK_k <= 78.9437 )
								ret := 0.916667 // buy
							if( smoothK_k > 78.9437 )
								ret := 1.000000 // buy
						if( k > 93.9761 )
							ret := 0.300000
				if( ema2 > 153.427 )
					if( d <= 94.8081 )
						if( ema2 <= 170.319 )
							if( ema2 <= 158.203 )
								if( d_k <= 9.76596 )
									ret := 0.031579
								if( d_k > 9.76596 )
									ret := 0.410714
							if( ema2 > 158.203 )
								if( ema2 <= 158.586 )
									ret := -0.823529 // sell
								if( ema2 > 158.586 )
									ret := -0.268722
						if( ema2 > 170.319 )
							if( rsi1 <= 38.0158 )
								if( ema1 <= 233.424 )
									ret := 0.270153
								if( ema1 > 233.424 )
									ret := 0.683673
							if( rsi1 > 38.0158 )
								if( tema <= 197.923 )
									ret := 0.233281
								if( tema > 197.923 )
									ret := 0.023952
					if( d > 94.8081 )
						if( tema <= 165.464 )
							if( ema3 <= 160.931 )
								ret := -0.111111
							if( ema3 > 160.931 )
								ret := -0.833333 // sell
						if( tema > 165.464 )
							if( smoothD_d <= 93.4845 )
								if( k <= 92.0839 )
									ret := 0.125000
								if( k > 92.0839 )
									ret := 0.727273 // buy
							if( smoothD_d > 93.4845 )
								if( ema1 <= 227.63 )
									ret := 0.047619
								if( ema1 > 227.63 )
									ret := 0.538462
			if( ema2 > 237.65 )
				if( ema2 <= 248.915 )
					if( ema13 <= 1.46645 )
						if( ema12 <= -1.1123 )
							if( ema1 <= 237.256 )
								ret := -0.294118
							if( ema1 > 237.256 )
								if( d_k <= -5.38601 )
									ret := -0.400000
								if( d_k > -5.38601 )
									ret := -0.873418 // sell
						if( ema12 > -1.1123 )
							if( ema2 <= 247.822 )
								if( smoothK_k <= 9.38027 )
									ret := 0.000000
								if( smoothK_k > 9.38027 )
									ret := -0.323810
							if( ema2 > 247.822 )
								ret := 0.600000
					if( ema13 > 1.46645 )
						if( ema2 <= 240.625 )
							if( ema12 <= 2.28529 )
								if( smoothD_d <= 73.5759 )
									ret := 0.185185
								if( smoothD_d > 73.5759 )
									ret := -0.600000
							if( ema12 > 2.28529 )
								ret := 0.800000 // buy
						if( ema2 > 240.625 )
							if( k <= 91.233 )
								ret := 0.375000
							if( k > 91.233 )
								if( d_k <= -2.51233 )
									ret := 1.000000 // buy
								if( d_k > -2.51233 )
									ret := 0.888889 // buy
				if( ema2 > 248.915 )
					if( ema2 <= 1201.41 )
						if( ema2 <= 1156.79 )
							if( ema3 <= 1122.03 )
								if( ema1 <= 1094.45 )
									ret := 0.019074
								if( ema1 > 1094.45 )
									ret := 0.182494
							if( ema3 > 1122.03 )
								if( ema3 <= 1128.18 )
									ret := -0.478261
								if( ema3 > 1128.18 )
									ret := -0.123360
						if( ema2 > 1156.79 )
							if( ema3 <= 1164.66 )
								if( smoothK_k <= 89.553 )
									ret := 0.567308
								if( smoothK_k > 89.553 )
									ret := -0.233333
							if( ema3 > 1164.66 )
								if( k <= 65.5538 )
									ret := 0.077148
								if( k > 65.5538 )
									ret := 0.235632
					if( ema2 > 1201.41 )
						if( ema3 <= 1202.53 )
							if( ema12 <= 6.63834 )
								if( d <= 60.2454 )
									ret := -0.858209 // sell
								if( d > 60.2454 )
									ret := -0.437500
							if( ema12 > 6.63834 )
								if( ema2 <= 1205.63 )
									ret := -0.040000
								if( ema2 > 1205.63 )
									ret := 0.363636
						if( ema3 > 1202.53 )
							if( ema1 <= 1302.22 )
								if( d_k <= 0.885939 )
									ret := -0.008333
								if( d_k > 0.885939 )
									ret := -0.190789
							if( ema1 > 1302.22 )
								if( ema12 <= 0.80051 )
									ret := 0.062153
								if( ema12 > 0.80051 )
									ret := -0.032202
	if( d > 97.5284 )
		if( ema2 <= 292.351 )
			if( ema12 <= -0.958891 )
				ret := -0.428571
			if( ema12 > -0.958891 )
				if( ema3 <= 164.757 )
					if( ema13 <= 0.865237 )
						if( ema1 <= 162.957 )
							ret := -0.333333
						if( ema1 > 162.957 )
							ret := -1.000000 // sell
					if( ema13 > 0.865237 )
						ret := 0.300000
				if( ema3 > 164.757 )
					if( rsi1 <= 49.1501 )
						ret := 0.826087 // buy
					if( rsi1 > 49.1501 )
						if( ema3 <= 242.808 )
							if( tema <= 177.892 )
								ret := 0.727273 // buy
							if( tema > 177.892 )
								if( ema1 <= 228.109 )
									ret := -0.056338
								if( ema1 > 228.109 )
									ret := 0.200000
						if( ema3 > 242.808 )
							if( rsi1 <= 65.6173 )
								if( k <= 99.3421 )
									ret := 0.266667
								if( k > 99.3421 )
									ret := -0.142857
							if( rsi1 > 65.6173 )
								if( ema2 <= 261.119 )
									ret := 0.800000 // buy
								if( ema2 > 261.119 )
									ret := 0.279503
		if( ema2 > 292.351 )
			if( tema <= 957.575 )
				if( ema3 <= 484.016 )
					if( ema2 <= 355.607 )
						if( ema12 <= 1.30484 )
							if( ema1 <= 339.102 )
								if( smoothD_d <= 96.9624 )
									ret := -0.244275
								if( smoothD_d > 96.9624 )
									ret := -0.888889 // sell
							if( ema1 > 339.102 )
								if( rsi1 <= 80.6276 )
									ret := 0.200000
								if( rsi1 > 80.6276 )
									ret := 1.000000 // buy
						if( ema12 > 1.30484 )
							if( ema1 <= 350.028 )
								if( ema13 <= 2.39863 )
									ret := -0.793103 // sell
								if( ema13 > 2.39863 )
									ret := -0.306358
							if( ema1 > 350.028 )
								if( k <= 99.9462 )
									ret := -0.975000 // sell
								if( k > 99.9462 )
									ret := -0.375000
					if( ema2 > 355.607 )
						if( d_k <= -0.680787 )
							if( rsi1 <= 67.7799 )
								ret := 0.333333
							if( rsi1 > 67.7799 )
								if( k <= 99.9333 )
									ret := -1.000000 // sell
								if( k > 99.9333 )
									ret := -0.500000
						if( d_k > -0.680787 )
							if( ema3 <= 456.081 )
								if( smoothD_d <= 94.9578 )
									ret := -0.200000
								if( smoothD_d > 94.9578 )
									ret := 0.466667
							if( ema3 > 456.081 )
								ret := -0.133333
				if( ema3 > 484.016 )
					if( ema12 <= 9.4317 )
						if( ema2 <= 566.581 )
							if( ema3 <= 564.058 )
								if( ema13 <= 6.20322 )
									ret := -0.486957
								if( ema13 > 6.20322 )
									ret := -0.884615 // sell
							if( ema3 > 564.058 )
								ret := -1.000000 // sell
						if( ema2 > 566.581 )
							if( k <= 99.9523 )
								if( ema1 <= 860.556 )
									ret := -0.248677
								if( ema1 > 860.556 )
									ret := -0.642857
							if( k > 99.9523 )
								if( smoothK_k <= 96.9969 )
									ret := 0.875000 // buy
								if( smoothK_k > 96.9969 )
									ret := -0.157895
					if( ema12 > 9.4317 )
						if( ema13 <= 26.5229 )
							if( ema2 <= 720.374 )
								if( d <= 99.2042 )
									ret := -0.933333 // sell
								if( d > 99.2042 )
									ret := -1.000000 // sell
							if( ema2 > 720.374 )
								if( k <= 99.4003 )
									ret := -0.640000
								if( k > 99.4003 )
									ret := -0.125000
						if( ema13 > 26.5229 )
							if( d_k <= 0.88744 )
								ret := 0.400000
							if( d_k > 0.88744 )
								ret := -0.400000
			if( tema > 957.575 )
				if( ema3 <= 1202.54 )
					if( smoothK_k <= 91.3634 )
						ret := 0.857143 // buy
					if( smoothK_k > 91.3634 )
						if( ema2 <= 1121.73 )
							if( ema3 <= 1090.33 )
								if( tema <= 988.965 )
									ret := 0.368421
								if( tema > 988.965 )
									ret := -0.106145
							if( ema3 > 1090.33 )
								if( ema12 <= 6.27895 )
									ret := -0.750000 // sell
								if( ema12 > 6.27895 )
									ret := 0.029412
						if( ema2 > 1121.73 )
							if( tema <= 1172.45 )
								if( ema1 <= 1153.32 )
									ret := 0.277778
								if( ema1 > 1153.32 )
									ret := 0.885714 // buy
							if( tema > 1172.45 )
								if( ema13 <= 3.33234 )
									ret := -0.566667
								if( ema13 > 3.33234 )
									ret := 0.242236
				if( ema3 > 1202.54 )
					if( ema12 <= 4.56522 )
						if( ema1 <= 1556.11 )
							if( ema13 <= -0.180994 )
								if( ema13 <= -0.456468 )
									ret := -0.077778
								if( ema13 > -0.456468 )
									ret := -0.777778 // sell
							if( ema13 > -0.180994 )
								if( ema2 <= 1507.94 )
									ret := 0.141026
								if( ema2 > 1507.94 )
									ret := 0.642857
						if( ema1 > 1556.11 )
							if( ema2 <= 1597.02 )
								if( smoothK_k <= 95.9891 )
									ret := -0.850000 // sell
								if( smoothK_k > 95.9891 )
									ret := -0.375000
							if( ema2 > 1597.02 )
								if( ema12 <= -4.42111 )
									ret := 0.473684
								if( ema12 > -4.42111 )
									ret := -0.113208
					if( ema12 > 4.56522 )
						if( rsi1 <= 84.2498 )
							if( ema2 <= 1634.91 )
								if( ema1 <= 1505.08 )
									ret := -0.350575
								if( ema1 > 1505.08 )
									ret := -0.694444
							if( ema2 > 1634.91 )
								if( ema13 <= 10.4474 )
									ret := -0.468085
								if( ema13 > 10.4474 )
									ret := 0.077922
						if( rsi1 > 84.2498 )
							if( tema <= 1812.13 )
								if( d_k <= 2.31343 )
									ret := -0.023585
								if( d_k > 2.31343 )
									ret := -0.777778 // sell
							if( tema > 1812.13 )
								if( ema3 <= 1772.45 )
									ret := -1.000000 // sell
								if( ema3 > 1772.45 )
									ret := -0.555556
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_MELI_15Min_d78e90a0(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


