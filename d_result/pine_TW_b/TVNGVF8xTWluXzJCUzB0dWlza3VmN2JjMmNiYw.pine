//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MSFT_1Min_2BS0_f7bc2cbc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BS0_f7bc2cbc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_f7bc2cbc(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.319674 )
		if( bbm <= 0.126937 )
			if( smoothK_k <= 62.1099 )
				if( bbp <= -0.956365 )
					if( bearPower <= -2.04798 )
						if( bbp <= -4.89823 )
							ret := 0.272727
						if( bbp > -4.89823 )
							ret := -0.866667 // sell
					if( bearPower > -2.04798 )
						if( smoothD_d <= 63.9031 )
							if( k <= 57.7639 )
								if( d <= 27.2363 )
									ret := 0.311085
								if( d > 27.2363 )
									ret := 0.509804
							if( k > 57.7639 )
								if( rsi1 <= 38.7226 )
									ret := -0.083333
								if( rsi1 > 38.7226 )
									ret := -0.571429
						if( smoothD_d > 63.9031 )
							if( bearPower <= -0.642494 )
								ret := 0.117647
							if( bearPower > -0.642494 )
								ret := -0.600000
				if( bbp > -0.956365 )
					if( d <= 30.1613 )
						if( bbm <= 0.123591 )
							if( k <= 11.3022 )
								if( bullPower <= -0.324186 )
									ret := 0.128806
								if( bullPower > -0.324186 )
									ret := -0.061375
							if( k > 11.3022 )
								if( smoothK_k <= 8.77172 )
									ret := 0.538462
								if( smoothK_k > 8.77172 )
									ret := 0.062253
						if( bbm > 0.123591 )
							if( smoothK_k <= 0.06585 )
								ret := -0.357143
							if( smoothK_k > 0.06585 )
								if( k <= 6.01075 )
									ret := 1.000000 // buy
								if( k > 6.01075 )
									ret := 0.476190
					if( d > 30.1613 )
						if( k <= 23.3238 )
							if( rsi1 <= 26.1871 )
								ret := -0.312500
							if( rsi1 > 26.1871 )
								if( d <= 43.8563 )
									ret := 0.350575
								if( d > 43.8563 )
									ret := 0.890909 // buy
						if( k > 23.3238 )
							if( k <= 60.3808 )
								if( smoothD_d <= 61.0177 )
									ret := 0.126735
								if( smoothD_d > 61.0177 )
									ret := 0.400000
							if( k > 60.3808 )
								if( d <= 56.1144 )
									ret := -0.500000
								if( d > 56.1144 )
									ret := 0.088235
			if( smoothK_k > 62.1099 )
				if( rsi1 <= 41.7996 )
					if( bearPower <= -0.648493 )
						if( smoothD_d <= 71.1809 )
							ret := -0.882353 // sell
						if( smoothD_d > 71.1809 )
							ret := -0.222222
					if( bearPower > -0.648493 )
						if( bearPower <= -0.461699 )
							if( d_k <= 0.553415 )
								ret := 0.437500
							if( d_k > 0.553415 )
								ret := 0.900000 // buy
						if( bearPower > -0.461699 )
							if( rsi1 <= 37.5131 )
								if( k <= 86.7333 )
									ret := 0.602740
								if( k > 86.7333 )
									ret := 0.102041
							if( rsi1 > 37.5131 )
								if( smoothD_d <= 82.5657 )
									ret := 0.105263
								if( smoothD_d > 82.5657 )
									ret := -0.300000
				if( rsi1 > 41.7996 )
					if( bbp <= -0.726761 )
						if( d <= 85.4421 )
							if( k <= 72.1109 )
								if( d <= 74.5649 )
									ret := 0.875000 // buy
								if( d > 74.5649 )
									ret := 1.000000 // buy
							if( k > 72.1109 )
								if( rsi1 <= 43.6271 )
									ret := 0.916667 // buy
								if( rsi1 > 43.6271 )
									ret := 0.470588
						if( d > 85.4421 )
							if( d <= 90.0517 )
								ret := -0.272727
							if( d > 90.0517 )
								ret := 0.800000 // buy
					if( bbp > -0.726761 )
						if( d_k <= 12.1554 )
							if( k <= 94.1321 )
								if( smoothK_k <= 65.0389 )
									ret := 0.781818 // buy
								if( smoothK_k > 65.0389 )
									ret := 0.483965
							if( k > 94.1321 )
								if( k <= 96.6746 )
									ret := -0.555556
								if( k > 96.6746 )
									ret := 0.608696
						if( d_k > 12.1554 )
							if( smoothK_k <= 69.8167 )
								ret := 0.444444
							if( smoothK_k > 69.8167 )
								ret := -0.818182 // sell
		if( bbm > 0.126937 )
			if( d_k <= -1.85635 )
				if( smoothK_k <= 62.0715 )
					if( rsi1 <= 40.6635 )
						if( bbm <= 1.1303 )
							if( d_k <= -22.0171 )
								if( d_k <= -22.4189 )
									ret := -0.380952
								if( d_k > -22.4189 )
									ret := -1.000000 // sell
							if( d_k > -22.0171 )
								if( smoothD_d <= 20.5999 )
									ret := -0.147285
								if( smoothD_d > 20.5999 )
									ret := -0.008340
						if( bbm > 1.1303 )
							if( smoothK_k <= 46.4316 )
								if( rsi1 <= 38.0235 )
									ret := 0.622951
								if( rsi1 > 38.0235 )
									ret := -0.400000
							if( smoothK_k > 46.4316 )
								ret := -0.875000 // sell
					if( rsi1 > 40.6635 )
						if( k <= 14.0489 )
							if( bullPower <= 0.171373 )
								if( d <= 3.63282 )
									ret := 0.015385
								if( d > 3.63282 )
									ret := 0.515625
							if( bullPower > 0.171373 )
								ret := -0.700000 // sell
						if( k > 14.0489 )
							if( bbm <= 0.611055 )
								if( bbp <= -1.34828 )
									ret := -0.818182 // sell
								if( bbp > -1.34828 )
									ret := 0.073482
							if( bbm > 0.611055 )
								if( bbp <= -0.841354 )
									ret := 0.089552
								if( bbp > -0.841354 )
									ret := -0.557143
				if( smoothK_k > 62.0715 )
					if( rsi1 <= 45.4182 )
						if( bbm <= 0.766491 )
							if( d_k <= -2.4394 )
								if( bbp <= -0.758439 )
									ret := 0.427673
								if( bbp > -0.758439 )
									ret := 0.141337
							if( d_k > -2.4394 )
								if( smoothD_d <= 66.5849 )
									ret := 0.071429
								if( smoothD_d > 66.5849 )
									ret := -0.702128 // sell
						if( bbm > 0.766491 )
							if( smoothK_k <= 64.8043 )
								ret := 0.619048
							if( smoothK_k > 64.8043 )
								if( d <= 72.5362 )
									ret := -0.282051
								if( d > 72.5362 )
									ret := -0.923077 // sell
					if( rsi1 > 45.4182 )
						if( rsi1 <= 60.8524 )
							if( d <= 91.6563 )
								if( d <= 63.1103 )
									ret := -0.459016
								if( d > 63.1103 )
									ret := -0.067073
							if( d > 91.6563 )
								if( smoothD_d <= 90.6916 )
									ret := 0.727273 // buy
								if( smoothD_d > 90.6916 )
									ret := 0.444444
						if( rsi1 > 60.8524 )
							if( k <= 93.546 )
								ret := -0.222222
							if( k > 93.546 )
								ret := -1.000000 // sell
			if( d_k > -1.85635 )
				if( bullPower <= 0.210701 )
					if( rsi1 <= 27.1884 )
						if( rsi1 <= 4.14388 )
							if( d <= 0.37109 )
								if( bbm <= 0.671312 )
									ret := 0.625000
								if( bbm > 0.671312 )
									ret := 1.000000 // buy
							if( d > 0.37109 )
								if( bullPower <= -0.433487 )
									ret := 0.266667
								if( bullPower > -0.433487 )
									ret := -0.500000
						if( rsi1 > 4.14388 )
							if( bbm <= 0.699084 )
								if( d_k <= -0.177013 )
									ret := 0.102286
								if( d_k > -0.177013 )
									ret := -0.081551
							if( bbm > 0.699084 )
								if( bbp <= -1.03274 )
									ret := 0.148748
								if( bbp > -1.03274 )
									ret := 0.791667 // buy
					if( rsi1 > 27.1884 )
						if( bbp <= -2.23839 )
							if( smoothD_d <= 6.57519 )
								if( bbp <= -2.58814 )
									ret := -0.105263
								if( bbp > -2.58814 )
									ret := 0.380952
							if( smoothD_d > 6.57519 )
								if( d <= 19.0239 )
									ret := 0.978261 // buy
								if( d > 19.0239 )
									ret := 0.446429
						if( bbp > -2.23839 )
							if( d_k <= 30.445 )
								if( d <= 4.41014 )
									ret := -0.006220
								if( d > 4.41014 )
									ret := 0.098214
							if( d_k > 30.445 )
								if( rsi1 <= 35.6542 )
									ret := 0.346154
								if( rsi1 > 35.6542 )
									ret := -0.756757 // sell
				if( bullPower > 0.210701 )
					if( smoothK_k <= 74.4196 )
						if( smoothK_k <= -2.98742 )
							ret := -0.263158
						if( smoothK_k > -2.98742 )
							if( k <= 20.8535 )
								if( bearPower <= -0.908782 )
									ret := 0.968254 // buy
								if( bearPower > -0.908782 )
									ret := 0.620690
							if( k > 20.8535 )
								if( rsi1 <= 41.3504 )
									ret := 0.895349 // buy
								if( rsi1 > 41.3504 )
									ret := 0.000000
					if( smoothK_k > 74.4196 )
						if( smoothD_d <= 88.5191 )
							ret := -0.777778 // sell
						if( smoothD_d > 88.5191 )
							ret := 0.181818
	if( bbp > -0.319674 )
		if( bearPower <= 0.458941 )
			if( bbm <= 1.21355 )
				if( smoothK_k <= -2.2223 )
					if( smoothD_d <= 17.927 )
						if( bullPower <= 0.129396 )
							if( bearPower <= -0.352614 )
								ret := 0.833333 // buy
							if( bearPower > -0.352614 )
								if( k <= 0.037532 )
									ret := -0.116197
								if( k > 0.037532 )
									ret := -0.377682
						if( bullPower > 0.129396 )
							if( rsi1 <= 63.782 )
								if( d <= 14.344 )
									ret := -0.554878
								if( d > 14.344 )
									ret := -0.033333
							if( rsi1 > 63.782 )
								if( smoothD_d <= 1.61789 )
									ret := 0.684211
								if( smoothD_d > 1.61789 )
									ret := -0.500000
					if( smoothD_d > 17.927 )
						if( rsi1 <= 53.2121 )
							if( smoothD_d <= 22.3195 )
								if( bbp <= -0.196902 )
									ret := 0.571429
								if( bbp > -0.196902 )
									ret := 0.090909
							if( smoothD_d > 22.3195 )
								ret := -0.142857
						if( rsi1 > 53.2121 )
							ret := 0.615385
				if( smoothK_k > -2.2223 )
					if( smoothK_k <= 20.0002 )
						if( rsi1 <= 68.3773 )
							if( d_k <= -4.09072 )
								if( rsi1 <= 34.8908 )
									ret := 0.122449
								if( rsi1 > 34.8908 )
									ret := -0.167905
							if( d_k > -4.09072 )
								if( bullPower <= 0.708592 )
									ret := -0.019388
								if( bullPower > 0.708592 )
									ret := -0.404412
						if( rsi1 > 68.3773 )
							if( bbm <= 0.202516 )
								if( d <= 27.1285 )
									ret := -0.232877
								if( d > 27.1285 )
									ret := 0.191489
							if( bbm > 0.202516 )
								if( d_k <= -3.61116 )
									ret := 0.090909
								if( d_k > -3.61116 )
									ret := -0.684932
					if( smoothK_k > 20.0002 )
						if( d_k <= -29.8073 )
							if( bullPower <= 0.534148 )
								if( rsi1 <= 45.8943 )
									ret := 0.027027
								if( rsi1 > 45.8943 )
									ret := -0.486631
							if( bullPower > 0.534148 )
								if( smoothK_k <= 70.5487 )
									ret := 0.647059
								if( smoothK_k > 70.5487 )
									ret := -0.130435
						if( d_k > -29.8073 )
							if( bbp <= 0.158118 )
								if( bbp <= -0.310602 )
									ret := -0.170732
								if( bbp > -0.310602 )
									ret := 0.029876
							if( bbp > 0.158118 )
								if( smoothK_k <= 94.4421 )
									ret := -0.024780
								if( smoothK_k > 94.4421 )
									ret := 0.043949
			if( bbm > 1.21355 )
				if( bearPower <= -1.50672 )
					if( d <= 38.4269 )
						ret := 1.000000 // buy
					if( d > 38.4269 )
						if( k <= 64.0052 )
							ret := 0.833333 // buy
						if( k > 64.0052 )
							ret := -0.142857
				if( bearPower > -1.50672 )
					if( rsi1 <= 57.413 )
						if( d_k <= 0.036725 )
							if( bbp <= 0.306454 )
								if( d_k <= -7.75091 )
									ret := -0.682540
								if( d_k > -7.75091 )
									ret := 0.782609 // buy
							if( bbp > 0.306454 )
								if( d_k <= -5.5774 )
									ret := 0.303571
								if( d_k > -5.5774 )
									ret := 0.888889 // buy
						if( d_k > 0.036725 )
							if( k <= 63.9227 )
								if( bbp <= 0.224294 )
									ret := -0.437500
								if( bbp > 0.224294 )
									ret := -0.875000 // sell
							if( k > 63.9227 )
								if( bearPower <= -0.658048 )
									ret := -0.500000
								if( bearPower > -0.658048 )
									ret := 0.000000
					if( rsi1 > 57.413 )
						if( bullPower <= 1.43224 )
							if( smoothK_k <= 12.7361 )
								ret := 0.142857
							if( smoothK_k > 12.7361 )
								if( bbm <= 1.73448 )
									ret := -0.704000 // sell
								if( bbm > 1.73448 )
									ret := -1.000000 // sell
						if( bullPower > 1.43224 )
							if( smoothK_k <= 82.7729 )
								if( d <= 21.6301 )
									ret := -1.000000 // sell
								if( d > 21.6301 )
									ret := -0.439024
							if( smoothK_k > 82.7729 )
								if( bullPower <= 2.51346 )
									ret := 0.326923
								if( bullPower > 2.51346 )
									ret := -0.800000 // sell
		if( bearPower > 0.458941 )
			if( d <= 99.9375 )
				if( rsi1 <= 85.36 )
					if( smoothD_d <= 96.5707 )
						if( d <= 11.4158 )
							if( d_k <= -3.05628 )
								ret := -0.176471
							if( d_k > -3.05628 )
								if( d_k <= -0.091405 )
									ret := -1.000000 // sell
								if( d_k > -0.091405 )
									ret := -0.550000
						if( d > 11.4158 )
							if( bullPower <= 0.569912 )
								if( smoothD_d <= 80.7759 )
									ret := -0.194872
								if( smoothD_d > 80.7759 )
									ret := -0.512195
							if( bullPower > 0.569912 )
								if( d <= 96.5663 )
									ret := -0.058582
								if( d > 96.5663 )
									ret := -0.247059
					if( smoothD_d > 96.5707 )
						if( d_k <= -0.161844 )
							if( bbp <= 1.99179 )
								ret := 0.578947
							if( bbp > 1.99179 )
								ret := 0.882353 // buy
						if( d_k > -0.161844 )
							if( d_k <= 0.021573 )
								if( bullPower <= 1.24751 )
									ret := -0.615385
								if( bullPower > 1.24751 )
									ret := -0.333333
							if( d_k > 0.021573 )
								if( rsi1 <= 78.8209 )
									ret := 0.250000
								if( rsi1 > 78.8209 )
									ret := 1.000000 // buy
				if( rsi1 > 85.36 )
					if( d <= 99.5275 )
						if( bullPower <= 1.59142 )
							if( bbp <= 1.60958 )
								if( smoothK_k <= 95.36 )
									ret := -0.601124
								if( smoothK_k > 95.36 )
									ret := -0.300885
							if( bbp > 1.60958 )
								if( d <= 85.3724 )
									ret := -0.550000
								if( d > 85.3724 )
									ret := -0.072539
						if( bullPower > 1.59142 )
							if( k <= 84.1071 )
								ret := -0.100000
							if( k > 84.1071 )
								if( bbp <= 3.00358 )
									ret := -1.000000 // sell
								if( bbp > 3.00358 )
									ret := -0.558140
					if( d > 99.5275 )
						if( smoothD_d <= 96.809 )
							if( k <= 99.0911 )
								ret := -0.714286 // sell
							if( k > 99.0911 )
								if( bbm <= 0.2428 )
									ret := -0.846154 // sell
								if( bbm > 0.2428 )
									ret := -1.000000 // sell
						if( smoothD_d > 96.809 )
							if( smoothK_k <= 96.7289 )
								ret := -0.100000
							if( smoothK_k > 96.7289 )
								if( bbp <= 1.31564 )
									ret := -0.428571
								if( bbp > 1.31564 )
									ret := -0.897436 // sell
			if( d > 99.9375 )
				if( d <= 99.998 )
					if( rsi1 <= 95.3526 )
						if( bearPower <= 0.746143 )
							if( smoothK_k <= 96.9859 )
								if( smoothD_d <= 96.9682 )
									ret := 0.222222
								if( smoothD_d > 96.9682 )
									ret := -0.833333 // sell
							if( smoothK_k > 96.9859 )
								ret := 1.000000 // buy
						if( bearPower > 0.746143 )
							if( bearPower <= 1.14246 )
								ret := 0.823529 // buy
							if( bearPower > 1.14246 )
								ret := 0.181818
					if( rsi1 > 95.3526 )
						ret := 1.000000 // buy
				if( d > 99.998 )
					if( bbp <= 1.5071 )
						if( bullPower <= 0.857226 )
							if( bearPower <= 0.522612 )
								if( bbm <= 0.252036 )
									ret := -0.583333
								if( bbm > 0.252036 )
									ret := -0.916667 // sell
							if( bearPower > 0.522612 )
								ret := -0.375000
						if( bullPower > 0.857226 )
							ret := -0.153846
					if( bbp > 1.5071 )
						if( bearPower <= 2.21178 )
							if( bbp <= 2.15514 )
								if( bearPower <= 0.601867 )
									ret := 0.714286 // buy
								if( bearPower > 0.601867 )
									ret := -0.190476
							if( bbp > 2.15514 )
								if( bearPower <= 1.61022 )
									ret := 0.382979
								if( bearPower > 1.61022 )
									ret := 1.000000 // buy
						if( bearPower > 2.21178 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_MSFT_1Min_f7bc2cbc(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


