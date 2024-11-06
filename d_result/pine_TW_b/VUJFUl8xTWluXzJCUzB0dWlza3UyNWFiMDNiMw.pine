//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: UBER_1Min_2BS0_25ab03b3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2BS0_25ab03b3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_25ab03b3(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.111127 )
		if( bbm <= 0.019439 )
			if( bbp <= -0.056647 )
				if( rsi1 <= 13.1907 )
					if( bullPower <= -0.070945 )
						if( d_k <= 5.03012 )
							if( d <= 2.93061 )
								ret := 0.052632
							if( d > 2.93061 )
								if( k <= 11.2656 )
									ret := -1.000000 // sell
								if( k > 11.2656 )
									ret := -0.333333
						if( d_k > 5.03012 )
							ret := 0.388889
					if( bullPower > -0.070945 )
						ret := -1.000000 // sell
				if( rsi1 > 13.1907 )
					if( bullPower <= -0.117031 )
						if( d <= 14.6372 )
							if( d_k <= -3.02705 )
								if( smoothD_d <= 4.6566 )
									ret := -0.638889
								if( smoothD_d > 4.6566 )
									ret := 0.040000
							if( d_k > -3.02705 )
								if( smoothD_d <= 0.415249 )
									ret := 0.648352
								if( smoothD_d > 0.415249 )
									ret := 0.304688
						if( d > 14.6372 )
							if( rsi1 <= 38.9815 )
								if( bbp <= -0.454928 )
									ret := 0.863248 // buy
								if( bbp > -0.454928 )
									ret := 0.645522
							if( rsi1 > 38.9815 )
								if( bullPower <= -0.130549 )
									ret := 0.301653
								if( bullPower > -0.130549 )
									ret := 0.652778
					if( bullPower > -0.117031 )
						if( k <= 95.0767 )
							if( smoothD_d <= 88.916 )
								if( bbm <= 0.018606 )
									ret := 0.269857
								if( bbm > 0.018606 )
									ret := 0.857143 // buy
							if( smoothD_d > 88.916 )
								if( d_k <= 3.4693 )
									ret := 0.931034 // buy
								if( d_k > 3.4693 )
									ret := 0.611111
						if( k > 95.0767 )
							if( bullPower <= -0.071245 )
								ret := -0.666667
							if( bullPower > -0.071245 )
								if( rsi1 <= 50.2025 )
									ret := -0.142857
								if( rsi1 > 50.2025 )
									ret := -0.444444
			if( bbp > -0.056647 )
				if( bearPower <= 0.00898 )
					if( d_k <= -2.95051 )
						if( k <= 63.3118 )
							if( d_k <= -4.80031 )
								if( k <= 39.6516 )
									ret := 0.260684
								if( k > 39.6516 )
									ret := 0.046083
							if( d_k > -4.80031 )
								if( smoothK_k <= 53.815 )
									ret := -0.259843
								if( smoothK_k > 53.815 )
									ret := 0.647059
						if( k > 63.3118 )
							if( bbp <= -0.006479 )
								if( k <= 64.0033 )
									ret := -0.727273 // sell
								if( k > 64.0033 )
									ret := 0.044554
							if( bbp > -0.006479 )
								if( smoothK_k <= 76.2134 )
									ret := -0.606061
								if( smoothK_k > 76.2134 )
									ret := 0.000000
					if( d_k > -2.95051 )
						if( k <= 3.67485 )
							if( d_k <= -0.629292 )
								ret := -0.900000 // sell
							if( d_k > -0.629292 )
								if( BBPower_Color <= 0.5 )
									ret := -0.176471
								if( BBPower_Color > 0.5 )
									ret := 0.240000
						if( k > 3.67485 )
							if( rsi1 <= 56.2265 )
								if( k <= 53.7633 )
									ret := 0.152915
								if( k > 53.7633 )
									ret := 0.361742
							if( rsi1 > 56.2265 )
								if( d <= 97.3799 )
									ret := 0.091216
								if( d > 97.3799 )
									ret := -0.538462
				if( bearPower > 0.00898 )
					if( d <= 1.27177 )
						ret := -0.740741 // sell
					if( d > 1.27177 )
						if( k <= 98.1924 )
							if( k <= 69.3255 )
								if( smoothK_k <= 64.7907 )
									ret := -0.047099
								if( smoothK_k > 64.7907 )
									ret := -0.661538
							if( k > 69.3255 )
								if( d <= 82.9208 )
									ret := 0.200000
								if( d > 82.9208 )
									ret := -0.037433
						if( k > 98.1924 )
							if( d_k <= -4.29796 )
								if( bullPower <= 0.023044 )
									ret := -0.250000
								if( bullPower > 0.023044 )
									ret := -0.037037
							if( d_k > -4.29796 )
								if( d <= 96.8489 )
									ret := -0.857143 // sell
								if( d > 96.8489 )
									ret := -0.253731
		if( bbm > 0.019439 )
			if( bbp <= -0.258761 )
				if( rsi1 <= 15.1258 )
					if( bullPower <= -0.150954 )
						if( rsi1 <= 10.7656 )
							if( k <= 0.013096 )
								if( bbp <= -0.573606 )
									ret := -0.735632 // sell
								if( bbp > -0.573606 )
									ret := -0.062500
							if( k > 0.013096 )
								if( bullPower <= -0.188799 )
									ret := 0.416667
								if( bullPower > -0.188799 )
									ret := -0.462687
						if( rsi1 > 10.7656 )
							if( smoothD_d <= -2.26309 )
								if( bearPower <= -0.394387 )
									ret := -0.890625 // sell
								if( bearPower > -0.394387 )
									ret := -0.593750
							if( smoothD_d > -2.26309 )
								if( bbp <= -1.15492 )
									ret := 0.571429
								if( bbp > -1.15492 )
									ret := -0.605634
					if( bullPower > -0.150954 )
						if( rsi1 <= 2.05137 )
							ret := -0.705882 // sell
						if( rsi1 > 2.05137 )
							if( k <= 9.65006 )
								if( smoothD_d <= 8.94817 )
									ret := 0.050633
								if( smoothD_d > 8.94817 )
									ret := 1.000000 // buy
							if( k > 9.65006 )
								if( smoothD_d <= 11.6754 )
									ret := -0.882353 // sell
								if( smoothD_d > 11.6754 )
									ret := 0.111111
				if( rsi1 > 15.1258 )
					if( smoothK_k <= 77.0234 )
						if( bullPower <= -0.262456 )
							if( k <= 19.9738 )
								if( d_k <= 3.62645 )
									ret := 0.441667
								if( d_k > 3.62645 )
									ret := -0.181818
							if( k > 19.9738 )
								if( bbm <= 0.478562 )
									ret := 0.883871 // buy
								if( bbm > 0.478562 )
									ret := -0.307692
						if( bullPower > -0.262456 )
							if( bbm <= 0.422312 )
								if( bbm <= 0.074733 )
									ret := 0.222222
								if( bbm > 0.074733 )
									ret := 0.070075
							if( bbm > 0.422312 )
								if( bbp <= -0.52875 )
									ret := 0.130435
								if( bbp > -0.52875 )
									ret := 0.833333 // buy
					if( smoothK_k > 77.0234 )
						if( bearPower <= -0.18789 )
							if( bbm <= 0.182538 )
								if( rsi1 <= 49.8738 )
									ret := -0.510101
								if( rsi1 > 49.8738 )
									ret := 0.705882 // buy
							if( bbm > 0.182538 )
								if( d <= 96.0067 )
									ret := -0.211538
								if( d > 96.0067 )
									ret := 0.526316
						if( bearPower > -0.18789 )
							if( rsi1 <= 39.3864 )
								if( d <= 84.1489 )
									ret := -0.312500
								if( d > 84.1489 )
									ret := 0.846154 // buy
							if( rsi1 > 39.3864 )
								ret := -0.411765
			if( bbp > -0.258761 )
				if( d <= 12.0016 )
					if( bullPower <= -0.042931 )
						if( d <= 0.941824 )
							if( smoothK_k <= -2.1169 )
								if( smoothD_d <= -2.84463 )
									ret := -0.175325
								if( smoothD_d > -2.84463 )
									ret := 0.131387
							if( smoothK_k > -2.1169 )
								if( rsi1 <= 23.4416 )
									ret := -0.080000
								if( rsi1 > 23.4416 )
									ret := -0.648148
						if( d > 0.941824 )
							if( bbm <= 0.106267 )
								if( smoothD_d <= 0.181043 )
									ret := 0.182971
								if( smoothD_d > 0.181043 )
									ret := 0.013219
							if( bbm > 0.106267 )
								if( smoothD_d <= -1.05734 )
									ret := 0.121212
								if( smoothD_d > -1.05734 )
									ret := -0.258824
					if( bullPower > -0.042931 )
						if( k <= 2.22848 )
							if( smoothK_k <= -2.15769 )
								if( bearPower <= -0.064798 )
									ret := -0.195531
								if( bearPower > -0.064798 )
									ret := 0.062374
							if( smoothK_k > -2.15769 )
								if( k <= 2.11422 )
									ret := -0.323699
								if( k > 2.11422 )
									ret := -0.761905 // sell
						if( k > 2.22848 )
							if( bullPower <= 0.038484 )
								if( smoothD_d <= -0.357835 )
									ret := 0.142506
								if( smoothD_d > -0.357835 )
									ret := -0.040745
							if( bullPower > 0.038484 )
								if( rsi1 <= 56.5316 )
									ret := -0.208376
								if( rsi1 > 56.5316 )
									ret := 0.101322
				if( d > 12.0016 )
					if( bullPower <= -0.078961 )
						if( bbm <= 0.069722 )
							if( smoothD_d <= 92.543 )
								if( k <= 88.7065 )
									ret := 0.283951
								if( k > 88.7065 )
									ret := 0.823529 // buy
							if( smoothD_d > 92.543 )
								ret := -0.764706 // sell
						if( bbm > 0.069722 )
							if( d <= 28.4671 )
								if( bbp <= -0.242562 )
									ret := 0.000000
								if( bbp > -0.242562 )
									ret := 0.695652
							if( d > 28.4671 )
								if( k <= 37.1259 )
									ret := -0.659091
								if( k > 37.1259 )
									ret := -0.184615
					if( bullPower > -0.078961 )
						if( bearPower <= -0.117796 )
							if( rsi1 <= 33.521 )
								if( d <= 13.4849 )
									ret := 0.610526
								if( d > 13.4849 )
									ret := 0.054203
							if( rsi1 > 33.521 )
								if( d <= 32.7268 )
									ret := -0.225722
								if( d > 32.7268 )
									ret := -0.061852
						if( bearPower > -0.117796 )
							if( smoothK_k <= 0.560795 )
								if( bbp <= -0.075374 )
									ret := 0.037234
								if( bbp > -0.075374 )
									ret := -0.315287
							if( smoothK_k > 0.560795 )
								if( bbp <= -0.157128 )
									ret := 0.232472
								if( bbp > -0.157128 )
									ret := 0.013803
	if( bbp > 0.111127 )
		if( bbp <= 1.32428 )
			if( d_k <= -2.3987 )
				if( bbp <= 0.302881 )
					if( smoothD_d <= 52.0936 )
						if( smoothK_k <= 79.3107 )
							if( rsi1 <= 48.4384 )
								if( bearPower <= 0.072675 )
									ret := 0.315217
								if( bearPower > 0.072675 )
									ret := -0.500000
							if( rsi1 > 48.4384 )
								if( bbm <= 0.054707 )
									ret := -0.404141
								if( bbm > 0.054707 )
									ret := -0.100322
						if( smoothK_k > 79.3107 )
							ret := -0.950000 // sell
					if( smoothD_d > 52.0936 )
						if( d <= 95.2254 )
							if( k <= 77.0425 )
								if( rsi1 <= 53.9101 )
									ret := 0.596154
								if( rsi1 > 53.9101 )
									ret := -0.040881
							if( k > 77.0425 )
								if( bearPower <= 0.112413 )
									ret := -0.041718
								if( bearPower > 0.112413 )
									ret := -0.462151
						if( d > 95.2254 )
							if( rsi1 <= 75.939 )
								if( d <= 97.4454 )
									ret := -0.518072
								if( d > 97.4454 )
									ret := 0.062500
							if( rsi1 > 75.939 )
								if( d_k <= -3.87973 )
									ret := 0.294118
								if( d_k > -3.87973 )
									ret := -0.395349
				if( bbp > 0.302881 )
					if( smoothD_d <= 14.0147 )
						if( bbm <= 0.025269 )
							if( smoothK_k <= 19.9867 )
								ret := -0.526316
							if( smoothK_k > 19.9867 )
								ret := -1.000000 // sell
						if( bbm > 0.025269 )
							if( d_k <= -8.2579 )
								if( rsi1 <= 62.5658 )
									ret := -0.312500
								if( rsi1 > 62.5658 )
									ret := 0.625000
							if( d_k > -8.2579 )
								if( d_k <= -5.4911 )
									ret := 0.862069 // buy
								if( d_k > -5.4911 )
									ret := 1.000000 // buy
					if( smoothD_d > 14.0147 )
						if( d_k <= -11.9752 )
							if( smoothK_k <= 87.3037 )
								if( k <= 83.2384 )
									ret := -0.103918
								if( k > 83.2384 )
									ret := -0.538071
							if( smoothK_k > 87.3037 )
								if( d <= 85.212 )
									ret := 0.264493
								if( d > 85.212 )
									ret := -0.441860
						if( d_k > -11.9752 )
							if( bearPower <= 0.064136 )
								if( k <= 76.3744 )
									ret := 0.562500
								if( k > 76.3744 )
									ret := -0.338028
							if( bearPower > 0.064136 )
								if( rsi1 <= 84.9036 )
									ret := -0.412999
								if( rsi1 > 84.9036 )
									ret := -0.073394
			if( d_k > -2.3987 )
				if( bearPower <= -0.010149 )
					if( smoothK_k <= 62.6808 )
						if( bearPower <= -0.074588 )
							if( k <= 30.0033 )
								if( bullPower <= 0.450899 )
									ret := 0.470588
								if( bullPower > 0.450899 )
									ret := 0.812500 // buy
							if( k > 30.0033 )
								if( d <= 60.8432 )
									ret := 1.000000 // buy
								if( d > 60.8432 )
									ret := 0.777778 // buy
						if( bearPower > -0.074588 )
							if( rsi1 <= 54.4994 )
								if( d_k <= 10.1008 )
									ret := -0.375000
								if( d_k > 10.1008 )
									ret := 0.129032
							if( rsi1 > 54.4994 )
								if( bbm <= 0.169002 )
									ret := 0.040000
								if( bbm > 0.169002 )
									ret := 0.490000
					if( smoothK_k > 62.6808 )
						if( d <= 89.9241 )
							if( bullPower <= 0.234861 )
								if( d_k <= 1.70468 )
									ret := 0.875000 // buy
								if( d_k > 1.70468 )
									ret := -0.265823
							if( bullPower > 0.234861 )
								if( bearPower <= -0.021784 )
									ret := -0.736842 // sell
								if( bearPower > -0.021784 )
									ret := 0.000000
						if( d > 89.9241 )
							if( rsi1 <= 66.6197 )
								if( bullPower <= 0.16978 )
									ret := -0.047619
								if( bullPower > 0.16978 )
									ret := 0.835443 // buy
							if( rsi1 > 66.6197 )
								if( k <= 94.4255 )
									ret := -0.375000
								if( k > 94.4255 )
									ret := 0.500000
				if( bearPower > -0.010149 )
					if( k <= 38.1245 )
						if( bbp <= 0.242213 )
							if( bbm <= 0.017448 )
								if( d_k <= 2.63747 )
									ret := -0.081633
								if( d_k > 2.63747 )
									ret := -0.397849
							if( bbm > 0.017448 )
								if( smoothK_k <= 33.2303 )
									ret := 0.036509
								if( smoothK_k > 33.2303 )
									ret := 0.775510 // buy
						if( bbp > 0.242213 )
							if( smoothK_k <= 7.6956 )
								if( rsi1 <= 64.9687 )
									ret := 0.777778 // buy
								if( rsi1 > 64.9687 )
									ret := -0.057143
							if( smoothK_k > 7.6956 )
								if( d_k <= 8.60851 )
									ret := -0.095420
								if( d_k > 8.60851 )
									ret := 0.463415
					if( k > 38.1245 )
						if( k <= 45.2128 )
							if( rsi1 <= 59.6091 )
								if( smoothD_d <= 38.3464 )
									ret := 0.545455
								if( smoothD_d > 38.3464 )
									ret := -0.636364
							if( rsi1 > 59.6091 )
								if( d_k <= 2.95009 )
									ret := -0.494949
								if( d_k > 2.95009 )
									ret := 0.158371
						if( k > 45.2128 )
							if( k <= 99.9687 )
								if( k <= 97.3776 )
									ret := -0.021779
								if( k > 97.3776 )
									ret := -0.237631
							if( k > 99.9687 )
								if( d_k <= -1.05521 )
									ret := -0.133333
								if( d_k > -1.05521 )
									ret := 0.174803
		if( bbp > 1.32428 )
			if( smoothK_k <= 71.873 )
				if( k <= 69.5575 )
					if( bearPower <= 0.479352 )
						ret := -0.904762 // sell
					if( bearPower > 0.479352 )
						ret := -0.555556
				if( k > 69.5575 )
					ret := 1.000000 // buy
			if( smoothK_k > 71.873 )
				if( bearPower <= 0.535446 )
					if( bbm <= 1.665 )
						ret := -0.214286
					if( bbm > 1.665 )
						ret := -0.916667 // sell
				if( bearPower > 0.535446 )
					if( smoothD_d <= 91.2524 )
						ret := -1.000000 // sell
					if( smoothD_d > 91.2524 )
						ret := -0.800000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_25ab03b3(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


