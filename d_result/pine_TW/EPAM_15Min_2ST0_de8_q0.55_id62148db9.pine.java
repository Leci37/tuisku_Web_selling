//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: EPAM_15Min_2ST0_62148db9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2ST0_62148db9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_62148db9(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.312064 )
		if( d_k <= 24.1329 )
			if( rsi1 <= 19.6717 )
				if( rsi1 <= 4.38284 )
					if( ema3 <= 219.705 )
						ret := 0.153846
					if( ema3 > 219.705 )
						if( ema1 <= 320.967 )
							if( ema1 <= 231.02 )
								if( ema2 <= 221.952 )
									ret := -1.000000 // sell
								if( ema2 > 221.952 )
									ret := -0.777778 // sell
							if( ema1 > 231.02 )
								ret := 0.000000
						if( ema1 > 320.967 )
							ret := -1.000000 // sell
				if( rsi1 > 4.38284 )
					if( ema13 <= -8.06842 )
						if( d <= 12.7231 )
							if( ema2 <= 402.484 )
								if( tema <= 218.93 )
									ret := -0.818182 // sell
								if( tema > 218.93 )
									ret := 0.669355
							if( ema2 > 402.484 )
								if( d_k <= -1.63901 )
									ret := 0.163934
								if( d_k > -1.63901 )
									ret := -0.509091
						if( d > 12.7231 )
							if( ema1 <= 191.89 )
								ret := 1.000000 // buy
							if( ema1 > 191.89 )
								if( tema <= 558.1 )
									ret := -0.872549 // sell
								if( tema > 558.1 )
									ret := -0.291667
					if( ema13 > -8.06842 )
						if( ema3 <= 187.58 )
							if( rsi1 <= 15.1073 )
								if( ema13 <= -2.36458 )
									ret := -0.157895
								if( ema13 > -2.36458 )
									ret := 0.364312
							if( rsi1 > 15.1073 )
								if( smoothK_k <= 0.874521 )
									ret := -0.438776
								if( smoothK_k > 0.874521 )
									ret := -0.018587
						if( ema3 > 187.58 )
							if( smoothD_d <= 3.35331 )
								if( d_k <= 0.123185 )
									ret := 0.359223
								if( d_k > 0.123185 )
									ret := 0.590793
							if( smoothD_d > 3.35331 )
								if( ema1 <= 205.138 )
									ret := 0.685185
								if( ema1 > 205.138 )
									ret := -0.006667
			if( rsi1 > 19.6717 )
				if( ema1 <= 633.453 )
					if( smoothD_d <= 11.6528 )
						if( k <= 19.53 )
							if( smoothD_d <= 4.23159 )
								if( ema12 <= -4.64729 )
									ret := 0.413462
								if( ema12 > -4.64729 )
									ret := -0.083918
							if( smoothD_d > 4.23159 )
								if( rsi1 <= 38.8912 )
									ret := -0.177657
								if( rsi1 > 38.8912 )
									ret := -0.433781
						if( k > 19.53 )
							if( smoothK_k <= 19.6488 )
								if( ema2 <= 450.08 )
									ret := 0.322222
								if( ema2 > 450.08 )
									ret := -0.583333
							if( smoothK_k > 19.6488 )
								if( d <= 12.9846 )
									ret := 0.128713
								if( d > 12.9846 )
									ret := -0.436364
					if( smoothD_d > 11.6528 )
						if( ema3 <= 600.932 )
							if( smoothD_d <= 79.1957 )
								if( ema3 <= 93.1123 )
									ret := 0.526316
								if( ema3 > 93.1123 )
									ret := -0.047453
							if( smoothD_d > 79.1957 )
								if( ema3 <= 330.94 )
									ret := -0.123786
								if( ema3 > 330.94 )
									ret := -0.335294
						if( ema3 > 600.932 )
							if( rsi1 <= 49.4398 )
								if( ema13 <= -1.38281 )
									ret := 0.233333
								if( ema13 > -1.38281 )
									ret := 0.615385
							if( rsi1 > 49.4398 )
								if( ema1 <= 613.234 )
									ret := 0.173913
								if( ema1 > 613.234 )
									ret := -0.379310
				if( ema1 > 633.453 )
					if( k <= 83.3327 )
						if( tema <= 656.964 )
							if( ema2 <= 636.192 )
								ret := -0.266667
							if( ema2 > 636.192 )
								if( d_k <= -5.79179 )
									ret := -0.222222
								if( d_k > -5.79179 )
									ret := -0.863014 // sell
						if( tema > 656.964 )
							if( rsi1 <= 27.4134 )
								if( ema12 <= -3.54771 )
									ret := -0.970588 // sell
								if( ema12 > -3.54771 )
									ret := -0.325000
							if( rsi1 > 27.4134 )
								if( smoothD_d <= 8.22492 )
									ret := 0.396825
								if( smoothD_d > 8.22492 )
									ret := -0.184211
					if( k > 83.3327 )
						if( ema3 <= 649.97 )
							ret := -0.875000 // sell
						if( ema3 > 649.97 )
							if( ema1 <= 675.708 )
								if( d <= 91.5039 )
									ret := 0.545455
								if( d > 91.5039 )
									ret := 0.875000 // buy
							if( ema1 > 675.708 )
								ret := -0.400000
		if( d_k > 24.1329 )
			if( d_k <= 25.5398 )
				if( tema <= 208.039 )
					if( smoothK_k <= 16.0427 )
						ret := 0.333333
					if( smoothK_k > 16.0427 )
						ret := 1.000000 // buy
				if( tema > 208.039 )
					if( rsi1 <= 25.5551 )
						ret := -0.133333
					if( rsi1 > 25.5551 )
						if( ema2 <= 304.411 )
							ret := -0.285714
						if( ema2 > 304.411 )
							if( ema1 <= 309.67 )
								ret := 1.000000 // buy
							if( ema1 > 309.67 )
								if( ema1 <= 344.784 )
									ret := 0.000000
								if( ema1 > 344.784 )
									ret := 0.750000 // buy
			if( d_k > 25.5398 )
				if( tema <= 311.714 )
					if( tema <= 117.384 )
						ret := -0.529412
					if( tema > 117.384 )
						if( ema3 <= 223.005 )
							if( smoothD_d <= 42.89 )
								if( k <= 5.97057 )
									ret := 0.692308
								if( k > 5.97057 )
									ret := 0.952381 // buy
							if( smoothD_d > 42.89 )
								if( ema12 <= -0.756505 )
									ret := 0.869565 // buy
								if( ema12 > -0.756505 )
									ret := 0.157895
						if( ema3 > 223.005 )
							if( ema2 <= 302.64 )
								if( d_k <= 29.4201 )
									ret := -0.291667
								if( d_k > 29.4201 )
									ret := 0.500000
							if( ema2 > 302.64 )
								ret := 0.950000 // buy
				if( tema > 311.714 )
					if( tema <= 348.559 )
						if( k <= 4.08915 )
							ret := 0.750000 // buy
						if( k > 4.08915 )
							if( ema12 <= -0.686592 )
								if( tema <= 340.293 )
									ret := -0.800000 // sell
								if( tema > 340.293 )
									ret := -1.000000 // sell
							if( ema12 > -0.686592 )
								ret := -0.285714
					if( tema > 348.559 )
						if( smoothD_d <= 36.5606 )
							ret := 0.421053
						if( smoothD_d > 36.5606 )
							if( ema2 <= 436.715 )
								ret := 0.428571
							if( ema2 > 436.715 )
								if( ema12 <= -1.30391 )
									ret := -1.000000 // sell
								if( ema12 > -1.30391 )
									ret := -0.500000
	if( ema12 > -0.312064 )
		if( tema <= 278.771 )
			if( rsi1 <= 79.5284 )
				if( ema3 <= 270.973 )
					if( ema12 <= 1.48697 )
						if( smoothD_d <= 95.2265 )
							if( ema1 <= 179.734 )
								if( smoothD_d <= 79.0099 )
									ret := 0.008044
								if( smoothD_d > 79.0099 )
									ret := 0.149639
							if( ema1 > 179.734 )
								if( ema3 <= 182.676 )
									ret := 0.377049
								if( ema3 > 182.676 )
									ret := 0.078099
						if( smoothD_d > 95.2265 )
							if( ema3 <= 230.283 )
								if( ema12 <= 1.06679 )
									ret := -0.293103
								if( ema12 > 1.06679 )
									ret := 0.658537
							if( ema3 > 230.283 )
								if( ema2 <= 233.711 )
									ret := 0.820000 // buy
								if( ema2 > 233.711 )
									ret := -0.178862
					if( ema12 > 1.48697 )
						if( ema3 <= 195.572 )
							if( k <= 99.3327 )
								if( tema <= 175.228 )
									ret := 0.022727
								if( tema > 175.228 )
									ret := -0.593750
							if( k > 99.3327 )
								ret := 0.950000 // buy
						if( ema3 > 195.572 )
							if( ema2 <= 201.623 )
								if( smoothK_k <= 49.6017 )
									ret := 1.000000 // buy
								if( smoothK_k > 49.6017 )
									ret := 0.250000
							if( ema2 > 201.623 )
								if( rsi1 <= 75.4958 )
									ret := -0.201327
								if( rsi1 > 75.4958 )
									ret := 0.284211
				if( ema3 > 270.973 )
					if( ema12 <= 0.879246 )
						if( smoothK_k <= 73.8956 )
							if( k <= 56.6696 )
								if( ema3 <= 277.185 )
									ret := 0.263830
								if( ema3 > 277.185 )
									ret := 0.712121 // buy
							if( k > 56.6696 )
								if( d <= 71.3934 )
									ret := -0.459016
								if( d > 71.3934 )
									ret := 0.205128
						if( smoothK_k > 73.8956 )
							if( d <= 73.1281 )
								ret := 0.071429
							if( d > 73.1281 )
								if( smoothK_k <= 77.994 )
									ret := 1.000000 // buy
								if( smoothK_k > 77.994 )
									ret := 0.696000
					if( ema12 > 0.879246 )
						if( ema3 <= 272.745 )
							if( d <= 76.9212 )
								ret := 0.875000 // buy
							if( d > 76.9212 )
								ret := -0.176471
						if( ema3 > 272.745 )
							if( k <= 52.7932 )
								ret := 0.300000
							if( k > 52.7932 )
								if( rsi1 <= 68.5736 )
									ret := -0.615385
								if( rsi1 > 68.5736 )
									ret := -0.166667
			if( rsi1 > 79.5284 )
				if( ema1 <= 186.815 )
					if( ema2 <= 177.61 )
						if( tema <= 82.6716 )
							if( ema3 <= 81.0628 )
								if( ema12 <= 0.401533 )
									ret := -0.250000
								if( ema12 > 0.401533 )
									ret := 0.375000
							if( ema3 > 81.0628 )
								ret := -0.875000 // sell
						if( tema > 82.6716 )
							if( ema12 <= 0.405322 )
								if( ema3 <= 83.8571 )
									ret := 0.522727
								if( ema3 > 83.8571 )
									ret := -0.021277
							if( ema12 > 0.405322 )
								if( smoothD_d <= 96.9956 )
									ret := -0.097734
								if( smoothD_d > 96.9956 )
									ret := 0.545455
					if( ema2 > 177.61 )
						if( ema13 <= 2.60517 )
							if( ema13 <= 1.16424 )
								ret := -0.125000
							if( ema13 > 1.16424 )
								if( d_k <= 2.04413 )
									ret := 0.923913 // buy
								if( d_k > 2.04413 )
									ret := 0.250000
						if( ema13 > 2.60517 )
							ret := -0.208333
				if( ema1 > 186.815 )
					if( tema <= 225.819 )
						if( ema13 <= 2.03029 )
							if( d <= 98.2717 )
								if( k <= 99.9885 )
									ret := -0.234694
								if( k > 99.9885 )
									ret := 0.130435
							if( d > 98.2717 )
								if( ema3 <= 189.784 )
									ret := -0.125000
								if( ema3 > 189.784 )
									ret := 0.645161
						if( ema13 > 2.03029 )
							if( smoothD_d <= 96.92 )
								if( ema12 <= 2.89799 )
									ret := -0.502326
								if( ema12 > 2.89799 )
									ret := -0.952381 // sell
							if( smoothD_d > 96.92 )
								ret := 0.428571
					if( tema > 225.819 )
						if( ema2 <= 242.595 )
							if( ema13 <= 2.05013 )
								if( rsi1 <= 90.4568 )
									ret := -0.412281
								if( rsi1 > 90.4568 )
									ret := 0.800000 // buy
							if( ema13 > 2.05013 )
								if( k <= 69.5824 )
									ret := -0.235294
								if( k > 69.5824 )
									ret := 0.561404
						if( ema2 > 242.595 )
							if( ema1 <= 253.19 )
								if( smoothK_k <= 96.8408 )
									ret := -0.684211
								if( smoothK_k > 96.8408 )
									ret := 0.000000
							if( ema1 > 253.19 )
								if( d_k <= -1.6838 )
									ret := -0.253165
								if( d_k > -1.6838 )
									ret := 0.277027
		if( tema > 278.771 )
			if( k <= 17.4287 )
				if( tema <= 282.622 )
					if( rsi1 <= 42.31 )
						if( ema3 <= 280.851 )
							ret := -0.437500
						if( ema3 > 280.851 )
							ret := -0.952381 // sell
					if( rsi1 > 42.31 )
						if( smoothD_d <= 19.7397 )
							if( d <= 5.36577 )
								ret := -0.250000
							if( d > 5.36577 )
								if( ema2 <= 279.289 )
									ret := 0.125000
								if( ema2 > 279.289 )
									ret := 0.636364
						if( smoothD_d > 19.7397 )
							ret := -0.789474 // sell
				if( tema > 282.622 )
					if( ema3 <= 287.244 )
						if( tema <= 284.064 )
							ret := 0.333333
						if( tema > 284.064 )
							if( k <= 7.32298 )
								ret := 1.000000 // buy
							if( k > 7.32298 )
								if( tema <= 289.231 )
									ret := 0.466667
								if( tema > 289.231 )
									ret := 0.916667 // buy
					if( ema3 > 287.244 )
						if( rsi1 <= 72.0876 )
							if( smoothD_d <= 3.80436 )
								if( smoothD_d <= -2.90462 )
									ret := -0.125000
								if( smoothD_d > -2.90462 )
									ret := 0.313808
							if( smoothD_d > 3.80436 )
								if( ema1 <= 315.885 )
									ret := -0.157343
								if( ema1 > 315.885 )
									ret := 0.147128
						if( rsi1 > 72.0876 )
							if( smoothK_k <= 1.49068 )
								ret := 1.000000 // buy
							if( smoothK_k > 1.49068 )
								if( smoothK_k <= 4.52189 )
									ret := 0.285714
								if( smoothK_k > 4.52189 )
									ret := 0.826087 // buy
			if( k > 17.4287 )
				if( ema12 <= 0.054296 )
					if( ema13 <= -0.272312 )
						if( rsi1 <= 62.8267 )
							if( ema12 <= -0.309525 )
								ret := 0.666667
							if( ema12 > -0.309525 )
								if( ema1 <= 347.721 )
									ret := -0.195498
								if( ema1 > 347.721 )
									ret := 0.101240
						if( rsi1 > 62.8267 )
							if( ema2 <= 336.546 )
								if( k <= 96.5938 )
									ret := 0.954545 // buy
								if( k > 96.5938 )
									ret := 0.687500
							if( ema2 > 336.546 )
								if( ema13 <= -0.7783 )
									ret := -0.428571
								if( ema13 > -0.7783 )
									ret := 0.307692
					if( ema13 > -0.272312 )
						if( tema <= 668.685 )
							if( d_k <= 5.23903 )
								if( d_k <= -0.17755 )
									ret := 0.185096
								if( d_k > -0.17755 )
									ret := 0.449074
							if( d_k > 5.23903 )
								if( ema1 <= 629.277 )
									ret := -0.072513
								if( ema1 > 629.277 )
									ret := 0.458333
						if( tema > 668.685 )
							if( d <= 29.7884 )
								ret := 0.166667
							if( d > 29.7884 )
								ret := -0.750000 // sell
				if( ema12 > 0.054296 )
					if( rsi1 <= 50.1811 )
						if( smoothK_k <= 95.4374 )
							if( ema3 <= 296.114 )
								if( ema2 <= 283.515 )
									ret := 0.023256
								if( ema2 > 283.515 )
									ret := 0.760000 // buy
							if( ema3 > 296.114 )
								if( ema3 <= 320.983 )
									ret := -0.168605
								if( ema3 > 320.983 )
									ret := 0.086538
						if( smoothK_k > 95.4374 )
							ret := -0.888889 // sell
					if( rsi1 > 50.1811 )
						if( rsi1 <= 74.9935 )
							if( ema1 <= 466.906 )
								if( tema <= 457.936 )
									ret := -0.137733
								if( tema > 457.936 )
									ret := -0.615063
							if( ema1 > 466.906 )
								if( ema1 <= 477.296 )
									ret := 0.768116 // buy
								if( ema1 > 477.296 )
									ret := -0.012677
						if( rsi1 > 74.9935 )
							if( d <= 89.0471 )
								if( ema3 <= 285.624 )
									ret := 0.578947
								if( ema3 > 285.624 )
									ret := 0.113244
							if( d > 89.0471 )
								if( ema13 <= 6.08493 )
									ret := -0.206735
								if( ema13 > 6.08493 )
									ret := 0.131274
	
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
float op_operation = decision_tree_0_EPAM_15Min_62148db9(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


