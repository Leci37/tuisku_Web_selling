//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MSFT_30Min_2BS0_a4ca86fa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2BS0_a4ca86fa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_a4ca86fa(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 4.29695 )
		if( d_k <= -7.87771 )
			if( d <= 30.4218 )
				if( rsi1 <= 38.4175 )
					if( bbm <= 1.01363 )
						if( rsi1 <= 26.242 )
							if( bullPower <= -0.84204 )
								if( d_k <= -13.0787 )
									ret := 0.250000
								if( d_k > -13.0787 )
									ret := 0.655172
							if( bullPower > -0.84204 )
								if( bullPower <= -0.56004 )
									ret := -0.625000
								if( bullPower > -0.56004 )
									ret := -0.279279
						if( rsi1 > 26.242 )
							if( rsi1 <= 27.8706 )
								if( d_k <= -8.24029 )
									ret := 0.805195 // buy
								if( d_k > -8.24029 )
									ret := 0.285714
							if( rsi1 > 27.8706 )
								if( bbm <= 0.95634 )
									ret := 0.129738
								if( bbm > 0.95634 )
									ret := 0.595238
					if( bbm > 1.01363 )
						if( smoothK_k <= 22.5089 )
							if( bullPower <= -0.41899 )
								if( smoothK_k <= 11.9459 )
									ret := -0.916667 // sell
								if( smoothK_k > 11.9459 )
									ret := 0.102941
							if( bullPower > -0.41899 )
								if( rsi1 <= 29.0418 )
									ret := 0.142857
								if( rsi1 > 29.0418 )
									ret := -0.702970 // sell
						if( smoothK_k > 22.5089 )
							if( bbp <= -1.45588 )
								if( d_k <= -21.3193 )
									ret := -0.923077 // sell
								if( d_k > -21.3193 )
									ret := 0.060606
							if( bbp > -1.45588 )
								if( d_k <= -14.7205 )
									ret := -0.130435
								if( d_k > -14.7205 )
									ret := 0.410256
				if( rsi1 > 38.4175 )
					if( bearPower <= 0.31732 )
						if( bbm <= 0.365842 )
							if( rsi1 <= 58.7451 )
								if( bearPower <= 0.129726 )
									ret := 0.082063
								if( bearPower > 0.129726 )
									ret := -0.338462
							if( rsi1 > 58.7451 )
								if( rsi1 <= 70.7679 )
									ret := -0.169960
								if( rsi1 > 70.7679 )
									ret := -0.575000
						if( bbm > 0.365842 )
							if( smoothK_k <= 34.6243 )
								if( d_k <= -10.3456 )
									ret := -0.016888
								if( d_k > -10.3456 )
									ret := -0.322727
							if( smoothK_k > 34.6243 )
								if( d_k <= -21.2573 )
									ret := 0.049080
								if( d_k > -21.2573 )
									ret := -0.500000
					if( bearPower > 0.31732 )
						if( smoothD_d <= 24.337 )
							if( bbp <= 3.26669 )
								if( bbm <= 0.973582 )
									ret := -0.081545
								if( bbm > 0.973582 )
									ret := 0.253333
							if( bbp > 3.26669 )
								if( d_k <= -10.6772 )
									ret := -0.622222
								if( d_k > -10.6772 )
									ret := 0.363636
						if( smoothD_d > 24.337 )
							if( k <= 38.3541 )
								ret := -0.153846
							if( k > 38.3541 )
								if( bbp <= 1.25753 )
									ret := -0.200000
								if( bbp > 1.25753 )
									ret := 0.666667
			if( d > 30.4218 )
				if( d_k <= -11.1638 )
					if( d <= 40.5128 )
						if( rsi1 <= 50.7377 )
							if( bbm <= 2.21341 )
								if( d_k <= -12.7148 )
									ret := 0.178849
								if( d_k > -12.7148 )
									ret := 0.526316
							if( bbm > 2.21341 )
								if( bbp <= -1.93317 )
									ret := 0.411765
								if( bbp > -1.93317 )
									ret := 0.886792 // buy
						if( rsi1 > 50.7377 )
							if( d <= 38.2441 )
								if( smoothD_d <= 30.679 )
									ret := 0.136986
								if( smoothD_d > 30.679 )
									ret := -0.209845
							if( d > 38.2441 )
								if( d_k <= -18.6439 )
									ret := 0.008197
								if( d_k > -18.6439 )
									ret := 0.473214
					if( d > 40.5128 )
						if( rsi1 <= 23.1102 )
							if( k <= 69.7092 )
								ret := 0.076923
							if( k > 69.7092 )
								if( bbp <= -3.14445 )
									ret := 1.000000 // buy
								if( bbp > -3.14445 )
									ret := 0.555556
						if( rsi1 > 23.1102 )
							if( smoothK_k <= 50.0239 )
								if( d <= 40.886 )
									ret := -1.000000 // sell
								if( d > 40.886 )
									ret := -0.750000 // sell
							if( smoothK_k > 50.0239 )
								if( bbm <= 1.90231 )
									ret := -0.008523
								if( bbm > 1.90231 )
									ret := -0.182000
				if( d_k > -11.1638 )
					if( d <= 31.9867 )
						if( bbm <= 1.32238 )
							if( rsi1 <= 31.1227 )
								ret := -0.818182 // sell
							if( rsi1 > 31.1227 )
								if( smoothK_k <= 37.026 )
									ret := 0.933333 // buy
								if( smoothK_k > 37.026 )
									ret := 0.372093
						if( bbm > 1.32238 )
							ret := -0.733333 // sell
					if( d > 31.9867 )
						if( k <= 99.8598 )
							if( rsi1 <= 72.0347 )
								if( bbp <= -4.09629 )
									ret := 0.894737 // buy
								if( bbp > -4.09629 )
									ret := -0.185881
							if( rsi1 > 72.0347 )
								if( bearPower <= 0.45984 )
									ret := 0.228814
								if( bearPower > 0.45984 )
									ret := -0.123077
						if( k > 99.8598 )
							if( smoothD_d <= 86.8322 )
								if( rsi1 <= 74.0017 )
									ret := 0.157895
								if( rsi1 > 74.0017 )
									ret := -0.636364
							if( smoothD_d > 86.8322 )
								if( smoothD_d <= 87.9048 )
									ret := 0.740000 // buy
								if( smoothD_d > 87.9048 )
									ret := 0.186441
		if( d_k > -7.87771 )
			if( rsi1 <= 25.8482 )
				if( smoothK_k <= 20.4524 )
					if( k <= 3.91503 )
						if( smoothD_d <= -2.34378 )
							if( bbp <= -8.88397 )
								if( d <= 0.00567 )
									ret := 0.391304
								if( d > 0.00567 )
									ret := 0.972222 // buy
							if( bbp > -8.88397 )
								if( bbm <= 0.807326 )
									ret := 0.342776
								if( bbm > 0.807326 )
									ret := 0.090909
						if( smoothD_d > -2.34378 )
							if( bbp <= -10.588 )
								if( bbp <= -12.5836 )
									ret := 0.400000
								if( bbp > -12.5836 )
									ret := -0.888889 // sell
							if( bbp > -10.588 )
								if( smoothK_k <= -2.53865 )
									ret := 0.106383
								if( smoothK_k > -2.53865 )
									ret := -0.121543
					if( k > 3.91503 )
						if( bearPower <= -1.81796 )
							if( d_k <= 0.169965 )
								if( d <= 5.8212 )
									ret := 0.113269
								if( d > 5.8212 )
									ret := -0.240260
							if( d_k > 0.169965 )
								if( d <= 42.6544 )
									ret := 0.248804
								if( d > 42.6544 )
									ret := -0.481481
						if( bearPower > -1.81796 )
							if( d_k <= 2.66249 )
								if( bearPower <= -1.72502 )
									ret := 0.534091
								if( bearPower > -1.72502 )
									ret := 0.089825
							if( d_k > 2.66249 )
								if( d_k <= 3.93653 )
									ret := 0.732026 // buy
								if( d_k > 3.93653 )
									ret := 0.291322
				if( smoothK_k > 20.4524 )
					if( d <= 52.63 )
						if( bbm <= 0.952079 )
							if( bearPower <= -0.344557 )
								if( k <= 24.1784 )
									ret := -0.562500
								if( k > 24.1784 )
									ret := 0.245690
							if( bearPower > -0.344557 )
								if( k <= 28.0427 )
									ret := 0.862069 // buy
								if( k > 28.0427 )
									ret := 0.500000
						if( bbm > 0.952079 )
							if( rsi1 <= 18.9595 )
								if( bullPower <= -1.21517 )
									ret := 0.827586 // buy
								if( bullPower > -1.21517 )
									ret := 0.000000
							if( rsi1 > 18.9595 )
								if( k <= 40.9141 )
									ret := 0.898551 // buy
								if( k > 40.9141 )
									ret := 0.400000
					if( d > 52.63 )
						if( d_k <= 27.9377 )
							if( smoothK_k <= 47.4482 )
								if( rsi1 <= 23.8414 )
									ret := -0.647887
								if( rsi1 > 23.8414 )
									ret := -0.120000
							if( smoothK_k > 47.4482 )
								if( bbm <= 3.49954 )
									ret := 0.282258
								if( bbm > 3.49954 )
									ret := -0.607143
						if( d_k > 27.9377 )
							if( bearPower <= -0.511814 )
								ret := 1.000000 // buy
							if( bearPower > -0.511814 )
								ret := 0.875000 // buy
			if( rsi1 > 25.8482 )
				if( rsi1 <= 47.8402 )
					if( d <= 51.3733 )
						if( k <= 56.4624 )
							if( bbp <= 1.17396 )
								if( k <= 46.6146 )
									ret := -0.008960
								if( k > 46.6146 )
									ret := 0.190805
							if( bbp > 1.17396 )
								if( d_k <= -3.20271 )
									ret := 0.784314 // buy
								if( d_k > -3.20271 )
									ret := 0.123711
						if( k > 56.4624 )
							ret := -0.741935 // sell
					if( d > 51.3733 )
						if( bullPower <= 0.532077 )
							if( smoothK_k <= 93.7927 )
								if( bbm <= 1.60123 )
									ret := 0.184355
								if( bbm > 1.60123 )
									ret := -0.029536
							if( smoothK_k > 93.7927 )
								if( d <= 98.3813 )
									ret := -0.257426
								if( d > 98.3813 )
									ret := 0.196850
						if( bullPower > 0.532077 )
							if( d_k <= 19.6352 )
								if( bbp <= 0.015293 )
									ret := -0.213115
								if( bbp > 0.015293 )
									ret := 0.109756
							if( d_k > 19.6352 )
								if( smoothK_k <= 28.6267 )
									ret := -0.380952
								if( smoothK_k > 28.6267 )
									ret := 0.552632
				if( rsi1 > 47.8402 )
					if( d <= 99.3112 )
						if( bbp <= -0.113614 )
							if( k <= 91.8107 )
								if( smoothK_k <= 55.8171 )
									ret := -0.097184
								if( smoothK_k > 55.8171 )
									ret := 0.034435
							if( k > 91.8107 )
								if( bbm <= 2.55 )
									ret := -0.281179
								if( bbm > 2.55 )
									ret := 0.384615
						if( bbp > -0.113614 )
							if( d_k <= 17.6099 )
								if( d <= 93.2995 )
									ret := 0.008032
								if( d > 93.2995 )
									ret := -0.032992
							if( d_k > 17.6099 )
								if( k <= 51.879 )
									ret := -0.065817
								if( k > 51.879 )
									ret := -0.333333
					if( d > 99.3112 )
						if( d_k <= -0.012235 )
							if( k <= 99.8372 )
								if( bullPower <= 0.491051 )
									ret := -0.692308
								if( bullPower > 0.491051 )
									ret := 0.000000
							if( k > 99.8372 )
								if( bearPower <= -0.248408 )
									ret := 0.645833
								if( bearPower > -0.248408 )
									ret := 0.306189
						if( d_k > -0.012235 )
							if( bbm <= 1.62423 )
								if( bearPower <= 1.19519 )
									ret := -0.059468
								if( bearPower > 1.19519 )
									ret := 0.247059
							if( bbm > 1.62423 )
								if( smoothD_d <= 96.6005 )
									ret := 1.000000 // buy
								if( smoothD_d > 96.6005 )
									ret := 0.125000
	if( bbp > 4.29695 )
		if( bearPower <= 3.28505 )
			if( bearPower <= 2.83593 )
				if( smoothK_k <= 96.5845 )
					if( smoothK_k <= 96.2532 )
						if( bullPower <= 3.63 )
							if( k <= 93.2907 )
								if( d_k <= 7.8239 )
									ret := 0.049689
								if( d_k > 7.8239 )
									ret := -0.253731
							if( k > 93.2907 )
								if( d <= 98.4714 )
									ret := -0.103448
								if( d > 98.4714 )
									ret := -0.619048
						if( bullPower > 3.63 )
							if( bearPower <= 0.72785 )
								if( smoothK_k <= 36.8947 )
									ret := -0.846154 // sell
								if( smoothK_k > 36.8947 )
									ret := 0.147368
							if( bearPower > 0.72785 )
								if( smoothD_d <= 95.989 )
									ret := -0.387707
								if( smoothD_d > 95.989 )
									ret := 0.526316
					if( smoothK_k > 96.2532 )
						if( smoothD_d <= 96.5012 )
							if( bbm <= 1.70962 )
								ret := -0.090909
							if( bbm > 1.70962 )
								ret := 0.363636
						if( smoothD_d > 96.5012 )
							ret := 0.791667 // buy
				if( smoothK_k > 96.5845 )
					if( bbp <= 7.62062 )
						if( rsi1 <= 93.6513 )
							if( bearPower <= 1.99671 )
								if( bearPower <= 1.18951 )
									ret := -0.727273 // sell
								if( bearPower > 1.18951 )
									ret := -0.126126
							if( bearPower > 1.99671 )
								if( bbm <= 2.00233 )
									ret := -0.532847
								if( bbm > 2.00233 )
									ret := 0.071429
						if( rsi1 > 93.6513 )
							if( smoothK_k <= 96.9507 )
								ret := -1.000000 // sell
							if( smoothK_k > 96.9507 )
								ret := -0.454545
					if( bbp > 7.62062 )
						if( rsi1 <= 79.2048 )
							ret := -0.272727
						if( rsi1 > 79.2048 )
							ret := 0.357143
			if( bearPower > 2.83593 )
				if( smoothD_d <= 93.5894 )
					if( rsi1 <= 76.6279 )
						if( smoothK_k <= 87.8308 )
							if( bullPower <= 4.50937 )
								ret := 0.000000
							if( bullPower > 4.50937 )
								ret := -0.555556
						if( smoothK_k > 87.8308 )
							if( d <= 91.5703 )
								ret := 0.000000
							if( d > 91.5703 )
								ret := 0.588235
					if( rsi1 > 76.6279 )
						if( bullPower <= 4.69043 )
							if( bbp <= 7.31408 )
								ret := 0.133333
							if( bbp > 7.31408 )
								ret := -0.571429
						if( bullPower > 4.69043 )
							if( bullPower <= 5.59314 )
								ret := -0.894737 // sell
							if( bullPower > 5.59314 )
								ret := -0.545455
				if( smoothD_d > 93.5894 )
					if( bullPower <= 3.84859 )
						ret := -0.266667
					if( bullPower > 3.84859 )
						if( rsi1 <= 88.4503 )
							if( bearPower <= 3.22313 )
								if( bearPower <= 3.06949 )
									ret := 0.384615
								if( bearPower > 3.06949 )
									ret := 0.916667 // buy
							if( bearPower > 3.22313 )
								ret := 0.200000
						if( rsi1 > 88.4503 )
							ret := 1.000000 // buy
		if( bearPower > 3.28505 )
			if( d <= 44.7261 )
				if( d_k <= -20.7548 )
					ret := 0.636364
				if( d_k > -20.7548 )
					ret := -0.111111
			if( d > 44.7261 )
				if( rsi1 <= 60.6466 )
					ret := 0.285714
				if( rsi1 > 60.6466 )
					if( k <= 90.1824 )
						if( smoothK_k <= 77.8925 )
							ret := -0.600000
						if( smoothK_k > 77.8925 )
							ret := -1.000000 // sell
					if( k > 90.1824 )
						if( rsi1 <= 80.177 )
							if( rsi1 <= 76.7074 )
								if( bearPower <= 3.68607 )
									ret := -0.642857
								if( bearPower > 3.68607 )
									ret := 0.500000
							if( rsi1 > 76.7074 )
								ret := 0.615385
						if( rsi1 > 80.177 )
							if( bbp <= 9.17108 )
								if( d <= 99.9382 )
									ret := -0.681818
								if( d > 99.9382 )
									ret := -1.000000 // sell
							if( bbp > 9.17108 )
								if( bearPower <= 4.29752 )
									ret := 0.000000
								if( bearPower > 4.29752 )
									ret := -0.577778
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_MSFT_30Min_a4ca86fa(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


