//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: NVDA_30Min_2ST0_f42bdcd4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2ST0_f42bdcd4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_f42bdcd4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.994238 )
		if( d <= 3.12856 )
			if( k <= 7.0286 )
				if( tema <= 60.7773 )
					if( smoothK_k <= -2.21492 )
						if( k <= 0.060396 )
							if( ema3 <= 37.072 )
								ret := 0.200000
							if( ema3 > 37.072 )
								if( d <= 0.009658 )
									ret := -0.800000 // sell
								if( d > 0.009658 )
									ret := -0.454545
						if( k > 0.060396 )
							if( smoothK_k <= -2.51425 )
								ret := -1.000000 // sell
							if( smoothK_k > -2.51425 )
								ret := -0.545455
					if( smoothK_k > -2.21492 )
						if( ema1 <= 29.9391 )
							if( ema2 <= 29.4576 )
								ret := -0.083333
							if( ema2 > 29.4576 )
								ret := -1.000000 // sell
						if( ema1 > 29.9391 )
							if( tema <= 33.8011 )
								ret := 1.000000 // buy
							if( tema > 33.8011 )
								if( tema <= 56.0485 )
									ret := 0.020000
								if( tema > 56.0485 )
									ret := 0.545455
				if( tema > 60.7773 )
					if( ema1 <= 98.4018 )
						if( rsi1 <= 34.6745 )
							if( ema3 <= 93.9185 )
								if( rsi1 <= 25.4156 )
									ret := 0.423077
								if( rsi1 > 25.4156 )
									ret := 0.911765 // buy
							if( ema3 > 93.9185 )
								if( d <= 1.02401 )
									ret := 1.000000 // buy
								if( d > 1.02401 )
									ret := 0.900000 // buy
						if( rsi1 > 34.6745 )
							if( tema <= 91.5448 )
								if( k <= 1.25977 )
									ret := 0.000000
								if( k > 1.25977 )
									ret := 0.100000
							if( tema > 91.5448 )
								if( d_k <= -0.007948 )
									ret := 0.875000 // buy
								if( d_k > -0.007948 )
									ret := 0.500000
					if( ema1 > 98.4018 )
						if( ema1 <= 104.216 )
							if( ema12 <= -0.500021 )
								if( k <= 0.198075 )
									ret := -0.041667
								if( k > 0.198075 )
									ret := -0.673077
							if( ema12 > -0.500021 )
								if( ema12 <= -0.247893 )
									ret := 0.000000
								if( ema12 > -0.247893 )
									ret := 0.285714
						if( ema1 > 104.216 )
							if( ema13 <= -4.33451 )
								if( ema3 <= 188.861 )
									ret := -0.673611
								if( ema3 > 188.861 )
									ret := 0.141333
							if( ema13 > -4.33451 )
								if( ema13 <= -3.96742 )
									ret := 0.534091
								if( ema13 > -3.96742 )
									ret := 0.150468
			if( k > 7.0286 )
				if( rsi1 <= 42.9067 )
					if( rsi1 <= 24.6693 )
						ret := 0.066667
					if( rsi1 > 24.6693 )
						if( d <= 2.63212 )
							ret := -0.384615
						if( d > 2.63212 )
							if( d <= 2.89189 )
								ret := -0.941176 // sell
							if( d > 2.89189 )
								ret := -0.777778 // sell
				if( rsi1 > 42.9067 )
					ret := 0.550000
		if( d > 3.12856 )
			if( smoothD_d <= 90.3392 )
				if( ema3 <= 157.666 )
					if( ema13 <= -1.33006 )
						if( d <= 66.1284 )
							if( ema2 <= 106.09 )
								if( d_k <= 5.47364 )
									ret := 0.445161
								if( d_k > 5.47364 )
									ret := -0.541667
							if( ema2 > 106.09 )
								if( k <= 17.683 )
									ret := -0.260982
								if( k > 17.683 )
									ret := 0.010124
						if( d > 66.1284 )
							if( smoothK_k <= 84.7766 )
								if( ema2 <= 151.742 )
									ret := -0.301205
								if( ema2 > 151.742 )
									ret := 0.542857
							if( smoothK_k > 84.7766 )
								if( tema <= 106.152 )
									ret := 0.076923
								if( tema > 106.152 )
									ret := -0.648000
					if( ema13 > -1.33006 )
						if( rsi1 <= 59.7668 )
							if( ema3 <= 139.588 )
								if( ema1 <= 104.585 )
									ret := 0.090586
								if( ema1 > 104.585 )
									ret := -0.014659
							if( ema3 > 139.588 )
								if( ema3 <= 149.479 )
									ret := 0.346185
								if( ema3 > 149.479 )
									ret := 0.094841
						if( rsi1 > 59.7668 )
							if( ema1 <= 117.917 )
								if( ema2 <= 108.106 )
									ret := 0.006627
								if( ema2 > 108.106 )
									ret := 0.374631
							if( ema1 > 117.917 )
								if( d <= 33.0673 )
									ret := 0.115566
								if( d > 33.0673 )
									ret := -0.109881
				if( ema3 > 157.666 )
					if( tema <= 183.627 )
						if( ema13 <= 0.304821 )
							if( d_k <= 25.9843 )
								if( ema2 <= 163.821 )
									ret := -0.064475
								if( ema2 > 163.821 )
									ret := -0.255194
							if( d_k > 25.9843 )
								if( ema2 <= 171.49 )
									ret := 0.084337
								if( ema2 > 171.49 )
									ret := 0.838710 // buy
						if( ema13 > 0.304821 )
							if( ema13 <= 0.879597 )
								if( ema12 <= 0.595631 )
									ret := 0.062031
								if( ema12 > 0.595631 )
									ret := 0.750000 // buy
							if( ema13 > 0.879597 )
								if( tema <= 183.103 )
									ret := -0.116570
								if( tema > 183.103 )
									ret := -0.828571 // sell
					if( tema > 183.627 )
						if( ema3 <= 1206.22 )
							if( ema2 <= 969.257 )
								if( k <= 65.71 )
									ret := -0.022239
								if( k > 65.71 )
									ret := -0.080903
							if( ema2 > 969.257 )
								if( ema1 <= 1136.35 )
									ret := 0.800000 // buy
								if( ema1 > 1136.35 )
									ret := 0.185714
						if( ema3 > 1206.22 )
							if( ema2 <= 1210.75 )
								ret := -0.650000
							if( ema2 > 1210.75 )
								if( ema13 <= -11.7784 )
									ret := -0.888889 // sell
								if( ema13 > -11.7784 )
									ret := -1.000000 // sell
			if( smoothD_d > 90.3392 )
				if( tema <= 275.443 )
					if( ema1 <= 265.405 )
						if( ema12 <= 0.323943 )
							if( smoothK_k <= 86.5107 )
								if( smoothD_d <= 90.76 )
									ret := 0.275862
								if( smoothD_d > 90.76 )
									ret := 0.581967
							if( smoothK_k > 86.5107 )
								if( ema2 <= 256.051 )
									ret := -0.013838
								if( ema2 > 256.051 )
									ret := -0.657534
						if( ema12 > 0.323943 )
							if( smoothD_d <= 95.8615 )
								if( smoothK_k <= 93.5425 )
									ret := 0.264615
								if( smoothK_k > 93.5425 )
									ret := 0.004357
							if( smoothD_d > 95.8615 )
								if( k <= 99.9047 )
									ret := 0.400000
								if( k > 99.9047 )
									ret := 0.106280
					if( ema1 > 265.405 )
						if( k <= 98.0108 )
							if( ema12 <= 0.499639 )
								if( smoothD_d <= 93.718 )
									ret := 0.696970
								if( smoothD_d > 93.718 )
									ret := 0.375000
							if( ema12 > 0.499639 )
								if( ema1 <= 268.673 )
									ret := 1.000000 // buy
								if( ema1 > 268.673 )
									ret := 0.870968 // buy
						if( k > 98.0108 )
							if( rsi1 <= 75.0146 )
								if( rsi1 <= 59.5107 )
									ret := 0.333333
								if( rsi1 > 59.5107 )
									ret := -0.565217
							if( rsi1 > 75.0146 )
								ret := 0.571429
				if( tema > 275.443 )
					if( ema3 <= 544.908 )
						if( ema12 <= 0.211605 )
							if( k <= 92.0154 )
								if( ema3 <= 484.452 )
									ret := 0.088235
								if( ema3 > 484.452 )
									ret := -0.800000 // sell
							if( k > 92.0154 )
								if( k <= 99.9932 )
									ret := -0.690678
								if( k > 99.9932 )
									ret := -0.242424
						if( ema12 > 0.211605 )
							if( tema <= 277.389 )
								if( k <= 95.4287 )
									ret := -0.454545
								if( k > 95.4287 )
									ret := -0.964286 // sell
							if( tema > 277.389 )
								if( tema <= 449.799 )
									ret := -0.233831
								if( tema > 449.799 )
									ret := 0.031088
					if( ema3 > 544.908 )
						if( ema2 <= 576.463 )
							if( k <= 96.8165 )
								if( ema2 <= 553.581 )
									ret := 0.769231 // buy
								if( ema2 > 553.581 )
									ret := 1.000000 // buy
							if( k > 96.8165 )
								ret := 0.523810
						if( ema2 > 576.463 )
							if( smoothD_d <= 92.9007 )
								if( ema3 <= 881.6 )
									ret := -0.438596
								if( ema3 > 881.6 )
									ret := -0.928571 // sell
							if( smoothD_d > 92.9007 )
								if( ema12 <= -0.169046 )
									ret := 0.758621 // buy
								if( ema12 > -0.169046 )
									ret := -0.159091
	if( ema12 > 0.994238 )
		if( ema12 <= 5.2399 )
			if( rsi1 <= 68.0582 )
				if( ema3 <= 868.511 )
					if( tema <= 566.928 )
						if( ema1 <= 421.19 )
							if( smoothK_k <= 81.7991 )
								if( ema1 <= 189.651 )
									ret := -0.375940
								if( ema1 > 189.651 )
									ret := -0.006194
							if( smoothK_k > 81.7991 )
								if( k <= 99.3247 )
									ret := 0.188596
								if( k > 99.3247 )
									ret := 0.538462
						if( ema1 > 421.19 )
							if( tema <= 528.136 )
								if( tema <= 496.15 )
									ret := -0.150177
								if( tema > 496.15 )
									ret := -0.407631
							if( tema > 528.136 )
								if( ema2 <= 539.022 )
									ret := 0.156627
								if( ema2 > 539.022 )
									ret := -0.125000
					if( tema > 566.928 )
						if( k <= 82.3044 )
							if( ema1 <= 754.085 )
								if( ema2 <= 734.53 )
									ret := 0.275862
								if( ema2 > 734.53 )
									ret := 0.744681 // buy
							if( ema1 > 754.085 )
								if( smoothK_k <= 42.1664 )
									ret := -0.313953
								if( smoothK_k > 42.1664 )
									ret := 0.429630
						if( k > 82.3044 )
							if( d <= 90.7585 )
								if( ema3 <= 621.378 )
									ret := 0.130435
								if( ema3 > 621.378 )
									ret := -0.517857
							if( d > 90.7585 )
								if( tema <= 851.688 )
									ret := 0.076923
								if( tema > 851.688 )
									ret := 0.631579
				if( ema3 > 868.511 )
					if( d_k <= 13.5948 )
						if( d <= 94.9396 )
							if( ema3 <= 946.681 )
								if( ema13 <= 4.84408 )
									ret := -0.172840
								if( ema13 > 4.84408 )
									ret := -0.672727
							if( ema3 > 946.681 )
								if( ema3 <= 1132.36 )
									ret := 0.454545
								if( ema3 > 1132.36 )
									ret := -0.428571
						if( d > 94.9396 )
							if( rsi1 <= 65.1751 )
								if( ema12 <= 2.61004 )
									ret := -0.750000 // sell
								if( ema12 > 2.61004 )
									ret := -1.000000 // sell
							if( rsi1 > 65.1751 )
								ret := -0.333333
					if( d_k > 13.5948 )
						if( ema3 <= 927.986 )
							if( smoothK_k <= 20.7861 )
								ret := -0.666667
							if( smoothK_k > 20.7861 )
								ret := 0.388889
						if( ema3 > 927.986 )
							if( k <= 17.3199 )
								ret := 0.857143 // buy
							if( k > 17.3199 )
								ret := 0.650000
			if( rsi1 > 68.0582 )
				if( ema13 <= 1.61096 )
					if( d <= 99.0194 )
						if( smoothK_k <= 72.5728 )
							if( k <= 66.8887 )
								ret := -0.272727
							if( k > 66.8887 )
								if( ema12 <= 1.0688 )
									ret := 0.846154 // buy
								if( ema12 > 1.0688 )
									ret := 0.363636
						if( smoothK_k > 72.5728 )
							if( d <= 98.5498 )
								if( ema3 <= 768.433 )
									ret := -0.248963
								if( ema3 > 768.433 )
									ret := 0.437500
							if( d > 98.5498 )
								ret := 0.470588
					if( d > 99.0194 )
						if( ema3 <= 266.259 )
							ret := -0.470588
						if( ema3 > 266.259 )
							if( ema13 <= 1.37526 )
								ret := -0.583333
							if( ema13 > 1.37526 )
								ret := -0.882353 // sell
				if( ema13 > 1.61096 )
					if( ema2 <= 73.6558 )
						if( ema3 <= 70.4578 )
							ret := -0.888889 // sell
						if( ema3 > 70.4578 )
							ret := -1.000000 // sell
					if( ema2 > 73.6558 )
						if( tema <= 120.525 )
							if( ema12 <= 2.73517 )
								if( d_k <= -2.24703 )
									ret := 0.250000
								if( d_k > -2.24703 )
									ret := 0.655172
							if( ema12 > 2.73517 )
								ret := -0.833333 // sell
						if( tema > 120.525 )
							if( rsi1 <= 85.6454 )
								if( smoothD_d <= 95.1732 )
									ret := 0.098621
								if( smoothD_d > 95.1732 )
									ret := -0.133748
							if( rsi1 > 85.6454 )
								if( ema12 <= 4.56222 )
									ret := 0.258127
								if( ema12 > 4.56222 )
									ret := -0.073394
		if( ema12 > 5.2399 )
			if( ema1 <= 229.574 )
				if( ema13 <= 8.89744 )
					ret := -0.800000 // sell
				if( ema13 > 8.89744 )
					ret := -1.000000 // sell
			if( ema1 > 229.574 )
				if( smoothK_k <= 5.07914 )
					if( ema2 <= 509.536 )
						ret := -1.000000 // sell
					if( ema2 > 509.536 )
						ret := -0.052632
				if( smoothK_k > 5.07914 )
					if( ema2 <= 508.935 )
						if( d_k <= 6.31943 )
							if( k <= 92.7671 )
								if( k <= 63.6212 )
									ret := 0.571429
								if( k > 63.6212 )
									ret := 0.964286 // buy
							if( k > 92.7671 )
								if( ema2 <= 288.667 )
									ret := -0.280000
								if( ema2 > 288.667 )
									ret := 0.606061
						if( d_k > 6.31943 )
							if( tema <= 415.515 )
								ret := -0.818182 // sell
							if( tema > 415.515 )
								if( smoothD_d <= 58.1216 )
									ret := -0.200000
								if( smoothD_d > 58.1216 )
									ret := 0.761905 // buy
					if( ema2 > 508.935 )
						if( tema <= 724.68 )
							if( d_k <= -0.556665 )
								if( ema3 <= 570.732 )
									ret := -0.774194 // sell
								if( ema3 > 570.732 )
									ret := -0.230769
							if( d_k > -0.556665 )
								if( ema1 <= 680.072 )
									ret := 0.164706
								if( ema1 > 680.072 )
									ret := -0.533333
						if( tema > 724.68 )
							if( tema <= 1194.57 )
								if( ema2 <= 1110.72 )
									ret := 0.352442
								if( ema2 > 1110.72 )
									ret := -0.405405
							if( tema > 1194.57 )
								if( ema12 <= 10.0829 )
									ret := 0.972973 // buy
								if( ema12 > 10.0829 )
									ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_f42bdcd4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


