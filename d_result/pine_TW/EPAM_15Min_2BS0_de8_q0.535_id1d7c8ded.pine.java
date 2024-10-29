//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: EPAM_15Min_2BS0_1d7c8ded Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2BS0_1d7c8ded", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_1d7c8ded(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 1.59824 )
		if( d_k <= 12.8792 )
			if( bearPower <= -0.817881 )
				if( rsi1 <= 21.2209 )
					if( smoothD_d <= -1.75832 )
						if( rsi1 <= 4.48254 )
							if( bullPower <= -22.3223 )
								ret := 0.000000
							if( bullPower > -22.3223 )
								if( bbp <= -7.77826 )
									ret := -0.963636 // sell
								if( bbp > -7.77826 )
									ret := -0.375000
						if( rsi1 > 4.48254 )
							if( bullPower <= -0.441888 )
								if( rsi1 <= 17.1699 )
									ret := 0.165432
								if( rsi1 > 17.1699 )
									ret := -0.331633
							if( bullPower > -0.441888 )
								if( d_k <= 0.034499 )
									ret := 0.111111
								if( d_k > 0.034499 )
									ret := 0.862069 // buy
					if( smoothD_d > -1.75832 )
						if( smoothD_d <= 5.12719 )
							if( rsi1 <= 4.33689 )
								if( bearPower <= -13.5594 )
									ret := -1.000000 // sell
								if( bearPower > -13.5594 )
									ret := 0.166667
							if( rsi1 > 4.33689 )
								if( bearPower <= -15.526 )
									ret := -0.264706
								if( bearPower > -15.526 )
									ret := 0.253414
						if( smoothD_d > 5.12719 )
							if( bearPower <= -10.7868 )
								if( k <= 9.57099 )
									ret := -0.142857
								if( k > 9.57099 )
									ret := -0.644068
							if( bearPower > -10.7868 )
								if( d_k <= 0.655771 )
									ret := -0.110112
								if( d_k > 0.655771 )
									ret := 0.328326
				if( rsi1 > 21.2209 )
					if( smoothK_k <= 96.9937 )
						if( rsi1 <= 24.3069 )
							if( d <= 32.9735 )
								if( bearPower <= -3.26708 )
									ret := -0.397504
								if( bearPower > -3.26708 )
									ret := -0.157274
							if( d > 32.9735 )
								if( smoothK_k <= 80.3206 )
									ret := 0.275862
								if( smoothK_k > 80.3206 )
									ret := -0.684211
						if( rsi1 > 24.3069 )
							if( rsi1 <= 47.2634 )
								if( k <= 2.21493 )
									ret := 0.044430
								if( k > 2.21493 )
									ret := -0.086804
							if( rsi1 > 47.2634 )
								if( smoothD_d <= 92.2754 )
									ret := -0.006350
								if( smoothD_d > 92.2754 )
									ret := 0.295918
					if( smoothK_k > 96.9937 )
						if( bearPower <= -2.96941 )
							if( d <= 98.9056 )
								ret := 0.166667
							if( d > 98.9056 )
								ret := -0.777778 // sell
						if( bearPower > -2.96941 )
							if( d <= 99.7796 )
								if( rsi1 <= 42.1593 )
									ret := 0.714286 // buy
								if( rsi1 > 42.1593 )
									ret := 0.000000
							if( d > 99.7796 )
								if( bbm <= 1.49165 )
									ret := 0.615385
								if( bbm > 1.49165 )
									ret := 1.000000 // buy
			if( bearPower > -0.817881 )
				if( d <= 98.2445 )
					if( smoothK_k <= 96.764 )
						if( k <= 78.147 )
							if( bbp <= 0.870254 )
								if( smoothD_d <= 1.55759 )
									ret := -0.057718
								if( smoothD_d > 1.55759 )
									ret := 0.049462
							if( bbp > 0.870254 )
								if( k <= 5.9809 )
									ret := 0.308036
								if( k > 5.9809 )
									ret := -0.045984
						if( k > 78.147 )
							if( smoothK_k <= 79.7439 )
								if( smoothD_d <= 67.521 )
									ret := 0.011299
								if( smoothD_d > 67.521 )
									ret := 0.261860
							if( smoothK_k > 79.7439 )
								if( smoothD_d <= 67.3731 )
									ret := -0.151365
								if( smoothD_d > 67.3731 )
									ret := 0.101379
					if( smoothK_k > 96.764 )
						if( rsi1 <= 50.2909 )
							if( bearPower <= 0.239254 )
								if( smoothK_k <= 96.9977 )
									ret := -0.780488 // sell
								if( smoothK_k > 96.9977 )
									ret := -0.328947
							if( bearPower > 0.239254 )
								ret := -0.875000 // sell
						if( rsi1 > 50.2909 )
							if( bbp <= 1.48375 )
								if( bullPower <= 1.34536 )
									ret := -0.012346
								if( bullPower > 1.34536 )
									ret := -0.933333 // sell
							if( bbp > 1.48375 )
								ret := -0.750000 // sell
				if( d > 98.2445 )
					if( bullPower <= 0.265292 )
						if( d <= 98.716 )
							if( rsi1 <= 59.6835 )
								if( bbm <= 0.240688 )
									ret := -0.954545 // sell
								if( bbm > 0.240688 )
									ret := -0.733333 // sell
							if( rsi1 > 59.6835 )
								if( bearPower <= 0.0442 )
									ret := -0.150000
								if( bearPower > 0.0442 )
									ret := -0.733333 // sell
						if( d > 98.716 )
							if( d <= 99.9602 )
								if( BBPower_Color <= 0.5 )
									ret := -0.397059
								if( BBPower_Color > 0.5 )
									ret := -0.025000
							if( d > 99.9602 )
								ret := 0.090909
					if( bullPower > 0.265292 )
						if( bbm <= 0.943787 )
							if( bearPower <= -0.285899 )
								if( d <= 99.528 )
									ret := -0.909091 // sell
								if( d > 99.528 )
									ret := -0.800000 // sell
							if( bearPower > -0.285899 )
								if( d_k <= 2.89261 )
									ret := -0.075697
								if( d_k > 2.89261 )
									ret := 0.727273 // buy
						if( bbm > 0.943787 )
							if( d_k <= -0.391627 )
								if( smoothD_d <= 96.238 )
									ret := 0.304348
								if( smoothD_d > 96.238 )
									ret := -0.833333 // sell
							if( d_k > -0.391627 )
								if( smoothK_k <= 94.926 )
									ret := 0.153846
								if( smoothK_k > 94.926 )
									ret := 0.627907
		if( d_k > 12.8792 )
			if( bearPower <= -13.551 )
				if( d_k <= 23.3818 )
					if( bbp <= -22.5409 )
						if( bbm <= 10.4112 )
							if( bbp <= -26.0386 )
								ret := -0.823529 // sell
							if( bbp > -26.0386 )
								ret := 0.200000
						if( bbm > 10.4112 )
							ret := 0.777778 // buy
					if( bbp > -22.5409 )
						ret := -1.000000 // sell
				if( d_k > 23.3818 )
					if( bbp <= -24.1586 )
						if( smoothK_k <= 32.9116 )
							ret := 0.083333
						if( smoothK_k > 32.9116 )
							ret := 1.000000 // buy
					if( bbp > -24.1586 )
						ret := 0.166667
			if( bearPower > -13.551 )
				if( rsi1 <= 18.7189 )
					if( rsi1 <= 7.94052 )
						ret := -0.900000 // sell
					if( rsi1 > 7.94052 )
						if( bbm <= 1.71255 )
							if( bearPower <= -1.53091 )
								if( smoothK_k <= -2.72253 )
									ret := 0.769231 // buy
								if( smoothK_k > -2.72253 )
									ret := 0.240741
							if( bearPower > -1.53091 )
								if( smoothK_k <= 11.9509 )
									ret := -0.266667
								if( smoothK_k > 11.9509 )
									ret := 0.125000
						if( bbm > 1.71255 )
							if( smoothD_d <= 38.1542 )
								if( d <= 28.0996 )
									ret := 0.894737 // buy
								if( d > 28.0996 )
									ret := 1.000000 // buy
							if( smoothD_d > 38.1542 )
								if( smoothK_k <= 29.9436 )
									ret := 0.200000
								if( smoothK_k > 29.9436 )
									ret := 1.000000 // buy
				if( rsi1 > 18.7189 )
					if( rsi1 <= 41.1563 )
						if( bearPower <= -0.368847 )
							if( bearPower <= -1.44244 )
								if( d <= 18.2928 )
									ret := 0.554217
								if( d > 18.2928 )
									ret := 0.046945
							if( bearPower > -1.44244 )
								if( rsi1 <= 37.5184 )
									ret := -0.087363
								if( rsi1 > 37.5184 )
									ret := -0.411111
						if( bearPower > -0.368847 )
							if( smoothK_k <= 34.3546 )
								if( smoothD_d <= 13.6552 )
									ret := 0.928571 // buy
								if( smoothD_d > 13.6552 )
									ret := 0.109489
							if( smoothK_k > 34.3546 )
								if( bearPower <= -0.186995 )
									ret := 0.671429
								if( bearPower > -0.186995 )
									ret := 0.052632
					if( rsi1 > 41.1563 )
						if( k <= 0.122514 )
							if( smoothK_k <= -2.97861 )
								if( bbp <= -2.06472 )
									ret := 0.777778 // buy
								if( bbp > -2.06472 )
									ret := -0.254777
							if( smoothK_k > -2.97861 )
								ret := -0.888889 // sell
						if( k > 0.122514 )
							if( bearPower <= -0.254212 )
								if( d_k <= 29.5462 )
									ret := 0.170245
								if( d_k > 29.5462 )
									ret := 0.601504
							if( bearPower > -0.254212 )
								if( bbp <= 1.53486 )
									ret := 0.034641
								if( bbp > 1.53486 )
									ret := 0.369565
	if( bbp > 1.59824 )
		if( bearPower <= 6.32163 )
			if( smoothK_k <= -0.367669 )
				if( bbp <= 6.4005 )
					if( bearPower <= 0.445964 )
						if( d_k <= -0.119067 )
							ret := 1.000000 // buy
						if( d_k > -0.119067 )
							if( smoothD_d <= 3.47115 )
								if( bullPower <= 1.92123 )
									ret := 0.083333
								if( bullPower > 1.92123 )
									ret := -0.800000 // sell
							if( smoothD_d > 3.47115 )
								if( d <= 9.19532 )
									ret := 0.777778 // buy
								if( d > 9.19532 )
									ret := -0.200000
					if( bearPower > 0.445964 )
						if( d <= 2.02551 )
							if( bullPower <= 1.78667 )
								if( bbm <= 0.780702 )
									ret := 0.714286 // buy
								if( bbm > 0.780702 )
									ret := 1.000000 // buy
							if( bullPower > 1.78667 )
								if( smoothK_k <= -2.66629 )
									ret := 0.142857
								if( smoothK_k > -2.66629 )
									ret := 0.615385
						if( d > 2.02551 )
							if( rsi1 <= 47.6665 )
								ret := -0.933333 // sell
							if( rsi1 > 47.6665 )
								if( d_k <= 3.88606 )
									ret := 0.040000
								if( d_k > 3.88606 )
									ret := 0.692308
				if( bbp > 6.4005 )
					if( bearPower <= 3.4588 )
						ret := 1.000000 // buy
					if( bearPower > 3.4588 )
						ret := 0.615385
			if( smoothK_k > -0.367669 )
				if( d_k <= 3.88944 )
					if( bullPower <= 3.1299 )
						if( k <= 41.5425 )
							if( bearPower <= -0.191382 )
								if( bullPower <= 3.04934 )
									ret := -0.553846
								if( bullPower > 3.04934 )
									ret := -1.000000 // sell
							if( bearPower > -0.191382 )
								if( k <= 35.3214 )
									ret := -0.079588
								if( k > 35.3214 )
									ret := -0.397490
						if( k > 41.5425 )
							if( smoothD_d <= 96.8695 )
								if( smoothD_d <= 94.4965 )
									ret := 0.016580
								if( smoothD_d > 94.4965 )
									ret := -0.166501
							if( smoothD_d > 96.8695 )
								if( d <= 99.994 )
									ret := 0.500000
								if( d > 99.994 )
									ret := 0.202128
					if( bullPower > 3.1299 )
						if( bbp <= 9.9058 )
							if( rsi1 <= 73.1144 )
								if( bbm <= 11.0298 )
									ret := -0.194367
								if( bbm > 11.0298 )
									ret := -1.000000 // sell
							if( rsi1 > 73.1144 )
								if( d <= 99.9945 )
									ret := -0.068923
								if( d > 99.9945 )
									ret := 0.613636
						if( bbp > 9.9058 )
							if( bearPower <= 3.48654 )
								if( rsi1 <= 59.815 )
									ret := -0.393939
								if( rsi1 > 59.815 )
									ret := 0.529101
							if( bearPower > 3.48654 )
								if( smoothD_d <= 82.1026 )
									ret := 0.019753
								if( smoothD_d > 82.1026 )
									ret := -0.195767
				if( d_k > 3.88944 )
					if( k <= 37.5176 )
						if( bearPower <= 0.065101 )
							if( k <= 18.6396 )
								if( k <= 14.3226 )
									ret := 0.464286
								if( k > 14.3226 )
									ret := -0.578947
							if( k > 18.6396 )
								if( d <= 31.2358 )
									ret := 1.000000 // buy
								if( d > 31.2358 )
									ret := 0.473684
						if( bearPower > 0.065101 )
							if( k <= 5.03245 )
								if( bbm <= 0.896622 )
									ret := 0.235294
								if( bbm > 0.896622 )
									ret := -0.589286
							if( k > 5.03245 )
								if( bbm <= 0.050401 )
									ret := 0.666667
								if( bbm > 0.050401 )
									ret := 0.019017
					if( k > 37.5176 )
						if( k <= 92.0728 )
							if( smoothD_d <= 76.8676 )
								if( smoothK_k <= 51.9601 )
									ret := -0.160000
								if( smoothK_k > 51.9601 )
									ret := -0.428325
							if( smoothD_d > 76.8676 )
								if( rsi1 <= 46.5759 )
									ret := 0.863636 // buy
								if( rsi1 > 46.5759 )
									ret := -0.169202
						if( k > 92.0728 )
							if( bbm <= 0.672252 )
								ret := -0.900000 // sell
							if( bbm > 0.672252 )
								if( bearPower <= 0.911024 )
									ret := -0.040000
								if( bearPower > 0.911024 )
									ret := 0.621622
		if( bearPower > 6.32163 )
			if( smoothD_d <= 96.2686 )
				if( d <= 90.8971 )
					if( smoothD_d <= 31.9884 )
						if( smoothK_k <= 32.6584 )
							if( rsi1 <= 74.1219 )
								ret := -0.222222
							if( rsi1 > 74.1219 )
								ret := 0.785714 // buy
						if( smoothK_k > 32.6584 )
							if( k <= 51.6697 )
								ret := 1.000000 // buy
							if( k > 51.6697 )
								ret := 0.818182 // buy
					if( smoothD_d > 31.9884 )
						if( d_k <= -18.8919 )
							if( k <= 90.1749 )
								if( rsi1 <= 81.6507 )
									ret := -0.692308
								if( rsi1 > 81.6507 )
									ret := 0.756757 // buy
							if( k > 90.1749 )
								if( bbm <= 3.47313 )
									ret := 0.964286 // buy
								if( bbm > 3.47313 )
									ret := 0.384615
						if( d_k > -18.8919 )
							if( rsi1 <= 72.6568 )
								if( smoothK_k <= 66.8818 )
									ret := 0.142857
								if( smoothK_k > 66.8818 )
									ret := -0.580645
							if( rsi1 > 72.6568 )
								if( bbp <= 27.7773 )
									ret := 0.241573
								if( bbp > 27.7773 )
									ret := -0.477273
				if( d > 90.8971 )
					if( bullPower <= 9.81636 )
						if( d <= 97.7878 )
							if( bullPower <= 8.11602 )
								ret := 1.000000 // buy
							if( bullPower > 8.11602 )
								ret := 0.363636
						if( d > 97.7878 )
							if( smoothK_k <= 96.6143 )
								ret := 0.117647
							if( smoothK_k > 96.6143 )
								ret := 0.222222
					if( bullPower > 9.81636 )
						if( rsi1 <= 79.4251 )
							if( bbm <= 5.9725 )
								ret := -0.857143 // sell
							if( bbm > 5.9725 )
								ret := 0.631579
						if( rsi1 > 79.4251 )
							if( smoothK_k <= 93.9171 )
								if( smoothD_d <= 93.8446 )
									ret := -0.947368 // sell
								if( smoothD_d > 93.8446 )
									ret := -0.739130 // sell
							if( smoothK_k > 93.9171 )
								if( d_k <= -4.75738 )
									ret := 0.222222
								if( d_k > -4.75738 )
									ret := -0.666667
			if( smoothD_d > 96.2686 )
				if( bearPower <= 6.56066 )
					ret := 0.000000
				if( bearPower > 6.56066 )
					if( bearPower <= 9.37386 )
						if( bbm <= 2.57754 )
							if( rsi1 <= 93.8536 )
								if( k <= 99.5459 )
									ret := 0.875000 // buy
								if( k > 99.5459 )
									ret := 1.000000 // buy
							if( rsi1 > 93.8536 )
								ret := 0.818182 // buy
						if( bbm > 2.57754 )
							if( d <= 99.8115 )
								ret := 1.000000 // buy
							if( d > 99.8115 )
								ret := 0.307692
					if( bearPower > 9.37386 )
						if( bearPower <= 9.82928 )
							ret := -0.200000
						if( bearPower > 9.82928 )
							ret := 0.538462
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_EPAM_15Min_1d7c8ded(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


