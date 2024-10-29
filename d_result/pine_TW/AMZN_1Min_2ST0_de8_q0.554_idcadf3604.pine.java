//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AMZN_1Min_2ST0_cadf3604 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Min_2ST0_cadf3604", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Min_cadf3604(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 199.815 )
		if( ema12 <= -0.050833 )
			if( tema <= 161.871 )
				if( k <= 35.7432 )
					if( ema13 <= -0.223409 )
						if( ema3 <= 161.695 )
							if( ema1 <= 158.332 )
								if( smoothD_d <= 11.4354 )
									ret := 0.480000
								if( smoothD_d > 11.4354 )
									ret := -0.857143 // sell
							if( ema1 > 158.332 )
								if( k <= 15.418 )
									ret := 0.569620
								if( k > 15.418 )
									ret := 0.846667 // buy
						if( ema3 > 161.695 )
							if( ema1 <= 161.547 )
								if( rsi1 <= 19.3025 )
									ret := -1.000000 // sell
								if( rsi1 > 19.3025 )
									ret := -0.034483
							if( ema1 > 161.547 )
								if( ema13 <= -0.643656 )
									ret := 0.885714 // buy
								if( ema13 > -0.643656 )
									ret := 0.465517
					if( ema13 > -0.223409 )
						if( ema3 <= 162.135 )
							if( ema3 <= 160.701 )
								if( ema1 <= 157.307 )
									ret := 1.000000 // buy
								if( ema1 > 157.307 )
									ret := -0.642857
							if( ema3 > 160.701 )
								if( ema3 <= 161.226 )
									ret := 0.660000
								if( ema3 > 161.226 )
									ret := 0.110169
						if( ema3 > 162.135 )
							if( ema1 <= 162.034 )
								ret := -1.000000 // sell
							if( ema1 > 162.034 )
								ret := -0.500000
				if( k > 35.7432 )
					if( d_k <= -4.21516 )
						if( k <= 67.4656 )
							if( ema13 <= -0.123201 )
								if( ema12 <= -0.121714 )
									ret := -0.062500
								if( ema12 > -0.121714 )
									ret := 0.500000
							if( ema13 > -0.123201 )
								ret := -1.000000 // sell
						if( k > 67.4656 )
							if( ema3 <= 155.894 )
								if( k <= 82.4796 )
									ret := -1.000000 // sell
								if( k > 82.4796 )
									ret := 1.000000 // buy
							if( ema3 > 155.894 )
								if( d_k <= -21.1014 )
									ret := 0.454545
								if( d_k > -21.1014 )
									ret := 0.870370 // buy
					if( d_k > -4.21516 )
						if( ema13 <= -0.269302 )
							if( smoothD_d <= 36.0421 )
								if( ema13 <= -0.507425 )
									ret := 1.000000 // buy
								if( ema13 > -0.507425 )
									ret := -0.222222
							if( smoothD_d > 36.0421 )
								if( d <= 61.9372 )
									ret := -0.851064 // sell
								if( d > 61.9372 )
									ret := -0.407407
						if( ema13 > -0.269302 )
							if( d_k <= 4.70056 )
								if( smoothD_d <= 65.3589 )
									ret := 0.735294 // buy
								if( smoothD_d > 65.3589 )
									ret := -0.058824
							if( d_k > 4.70056 )
								if( ema12 <= -0.06143 )
									ret := -0.529412
								if( ema12 > -0.06143 )
									ret := 0.500000
			if( tema > 161.871 )
				if( k <= 31.4155 )
					if( tema <= 192.043 )
						if( ema1 <= 184.204 )
							if( ema12 <= -0.996778 )
								if( d <= 7.75034 )
									ret := 0.666667
								if( d > 7.75034 )
									ret := 0.951220 // buy
							if( ema12 > -0.996778 )
								if( d_k <= -9.21823 )
									ret := -0.201754
								if( d_k > -9.21823 )
									ret := 0.087944
						if( ema1 > 184.204 )
							if( smoothD_d <= -2.60692 )
								if( rsi1 <= 28.3092 )
									ret := -0.319588
								if( rsi1 > 28.3092 )
									ret := -0.791667 // sell
							if( smoothD_d > -2.60692 )
								if( k <= 26.9177 )
									ret := 0.015204
								if( k > 26.9177 )
									ret := -0.229665
					if( tema > 192.043 )
						if( smoothK_k <= 0.870867 )
							if( d_k <= 2e-06 )
								if( ema3 <= 193.906 )
									ret := -0.442623
								if( ema3 > 193.906 )
									ret := 0.333333
							if( d_k > 2e-06 )
								if( ema1 <= 197.76 )
									ret := 0.702265 // buy
								if( ema1 > 197.76 )
									ret := 0.256757
						if( smoothK_k > 0.870867 )
							if( smoothK_k <= 19.1788 )
								if( smoothD_d <= 12.5195 )
									ret := 0.105624
								if( smoothD_d > 12.5195 )
									ret := -0.201320
							if( smoothK_k > 19.1788 )
								if( d_k <= 19.2034 )
									ret := 0.175966
								if( d_k > 19.2034 )
									ret := 0.836735 // buy
				if( k > 31.4155 )
					if( d <= 69.962 )
						if( d <= 43.7981 )
							if( ema3 <= 167.266 )
								if( tema <= 163.691 )
									ret := 0.090909
								if( tema > 163.691 )
									ret := 0.556818
							if( ema3 > 167.266 )
								if( ema1 <= 171.928 )
									ret := -0.223301
								if( ema1 > 171.928 )
									ret := 0.102213
						if( d > 43.7981 )
							if( k <= 61.0561 )
								if( ema2 <= 170.521 )
									ret := 0.602230
								if( ema2 > 170.521 )
									ret := 0.254011
							if( k > 61.0561 )
								if( ema3 <= 166.792 )
									ret := -0.302326
								if( ema3 > 166.792 )
									ret := 0.183540
					if( d > 69.962 )
						if( ema3 <= 176.754 )
							if( rsi1 <= 30.8773 )
								if( smoothD_d <= 85.4767 )
									ret := -0.381679
								if( smoothD_d > 85.4767 )
									ret := -0.972222 // sell
							if( rsi1 > 30.8773 )
								if( d_k <= 0.258497 )
									ret := 0.025352
								if( d_k > 0.258497 )
									ret := -0.359155
						if( ema3 > 176.754 )
							if( ema3 <= 193.983 )
								if( d_k <= -8.96641 )
									ret := 0.401496
								if( d_k > -8.96641 )
									ret := 0.140206
							if( ema3 > 193.983 )
								if( smoothD_d <= 71.3232 )
									ret := 0.166667
								if( smoothD_d > 71.3232 )
									ret := -0.455446
		if( ema12 > -0.050833 )
			if( ema12 <= 0.237287 )
				if( smoothD_d <= 96.1542 )
					if( smoothK_k <= 37.6555 )
						if( k <= 38.5124 )
							if( ema2 <= 184.117 )
								if( tema <= 180.496 )
									ret := 0.052115
								if( tema > 180.496 )
									ret := 0.126766
							if( ema2 > 184.117 )
								if( d_k <= -4.1205 )
									ret := -0.032712
								if( d_k > -4.1205 )
									ret := 0.052195
						if( k > 38.5124 )
							if( ema12 <= 0.019013 )
								if( d <= 28.2735 )
									ret := -0.201117
								if( d > 28.2735 )
									ret := 0.121818
							if( ema12 > 0.019013 )
								if( rsi1 <= 67.7597 )
									ret := 0.358149
								if( rsi1 > 67.7597 )
									ret := -0.156250
					if( smoothK_k > 37.6555 )
						if( tema <= 181.239 )
							if( ema1 <= 163.307 )
								if( ema1 <= 161.48 )
									ret := 0.054217
								if( ema1 > 161.48 )
									ret := -0.258065
							if( ema1 > 163.307 )
								if( ema12 <= 0.043654 )
									ret := 0.017996
								if( ema12 > 0.043654 )
									ret := 0.111605
						if( tema > 181.239 )
							if( tema <= 194.65 )
								if( ema1 <= 190.751 )
									ret := 0.001665
								if( ema1 > 190.751 )
									ret := 0.096924
							if( tema > 194.65 )
								if( ema13 <= 0.2596 )
									ret := -0.040283
								if( ema13 > 0.2596 )
									ret := -0.260504
				if( smoothD_d > 96.1542 )
					if( ema3 <= 176.094 )
						if( tema <= 174.139 )
							if( ema3 <= 162.772 )
								if( k <= 99.9984 )
									ret := 0.956522 // buy
								if( k > 99.9984 )
									ret := 0.210526
							if( ema3 > 162.772 )
								if( ema2 <= 164.239 )
									ret := -0.666667
								if( ema2 > 164.239 )
									ret := 0.246154
						if( tema > 174.139 )
							if( ema13 <= 0.299081 )
								if( k <= 99.5478 )
									ret := 0.428571
								if( k > 99.5478 )
									ret := 0.742268 // buy
							if( ema13 > 0.299081 )
								ret := -0.333333
					if( ema3 > 176.094 )
						if( rsi1 <= 54.7859 )
							if( rsi1 <= 50.4134 )
								if( ema3 <= 188.818 )
									ret := -0.052632
								if( ema3 > 188.818 )
									ret := 0.692308
							if( rsi1 > 50.4134 )
								if( tema <= 192.541 )
									ret := 0.808219 // buy
								if( tema > 192.541 )
									ret := -0.285714
						if( rsi1 > 54.7859 )
							if( ema12 <= 0.116449 )
								if( ema3 <= 188.718 )
									ret := 0.035088
								if( ema3 > 188.718 )
									ret := -0.270270
							if( ema12 > 0.116449 )
								if( ema13 <= 0.226263 )
									ret := 0.336207
								if( ema13 > 0.226263 )
									ret := 0.059621
			if( ema12 > 0.237287 )
				if( ema1 <= 175.623 )
					if( rsi1 <= 81.6554 )
						if( ema13 <= 0.557889 )
							if( smoothK_k <= 60.1182 )
								if( ema13 <= 0.360072 )
									ret := 0.875000 // buy
								if( ema13 > 0.360072 )
									ret := -0.612245
							if( smoothK_k > 60.1182 )
								if( ema13 <= 0.267806 )
									ret := -1.000000 // sell
								if( ema13 > 0.267806 )
									ret := 0.269784
						if( ema13 > 0.557889 )
							if( smoothD_d <= 92.7185 )
								if( d_k <= -2.93499 )
									ret := 0.670455
								if( d_k > -2.93499 )
									ret := 0.261364
							if( smoothD_d > 92.7185 )
								if( ema13 <= 0.590036 )
									ret := 0.000000
								if( ema13 > 0.590036 )
									ret := 0.892473 // buy
					if( rsi1 > 81.6554 )
						if( ema12 <= 0.706057 )
							if( k <= 99.7254 )
								if( rsi1 <= 85.8987 )
									ret := -0.078431
								if( rsi1 > 85.8987 )
									ret := -0.633333
							if( k > 99.7254 )
								if( d_k <= -1.62935 )
									ret := 0.789474 // buy
								if( d_k > -1.62935 )
									ret := -0.027778
						if( ema12 > 0.706057 )
							if( k <= 98.107 )
								ret := 0.500000
							if( k > 98.107 )
								ret := 1.000000 // buy
				if( ema1 > 175.623 )
					if( ema2 <= 195.631 )
						if( d_k <= -4.04873 )
							if( tema <= 194.529 )
								if( ema12 <= 0.903734 )
									ret := 0.066964
								if( ema12 > 0.903734 )
									ret := -1.000000 // sell
							if( tema > 194.529 )
								if( ema12 <= 0.273877 )
									ret := -0.400000
								if( ema12 > 0.273877 )
									ret := -1.000000 // sell
						if( d_k > -4.04873 )
							if( d_k <= 8.63756 )
								if( rsi1 <= 74.3872 )
									ret := -0.205310
								if( rsi1 > 74.3872 )
									ret := -0.435307
							if( d_k > 8.63756 )
								if( ema3 <= 190.385 )
									ret := 0.098446
								if( ema3 > 190.385 )
									ret := -0.812500 // sell
					if( ema2 > 195.631 )
						if( d_k <= -2.60634 )
							if( d_k <= -6.04854 )
								ret := -1.000000 // sell
							if( d_k > -6.04854 )
								if( ema12 <= 0.279227 )
									ret := -0.500000
								if( ema12 > 0.279227 )
									ret := -0.750000 // sell
						if( d_k > -2.60634 )
							if( k <= 42.1566 )
								if( smoothD_d <= 28.909 )
									ret := -1.000000 // sell
								if( smoothD_d > 28.909 )
									ret := -0.750000 // sell
							if( k > 42.1566 )
								if( ema1 <= 199.38 )
									ret := 0.681818
								if( ema1 > 199.38 )
									ret := -0.800000 // sell
	if( tema > 199.815 )
		if( tema <= 200.043 )
			if( smoothD_d <= 20.2578 )
				if( rsi1 <= 61.1189 )
					if( smoothK_k <= 31.4634 )
						if( ema12 <= -0.017517 )
							if( rsi1 <= 41.191 )
								if( tema <= 200.019 )
									ret := -0.175676
								if( tema > 200.019 )
									ret := -0.666667
							if( rsi1 > 41.191 )
								if( tema <= 199.947 )
									ret := -0.760000 // sell
								if( tema > 199.947 )
									ret := 0.166667
						if( ema12 > -0.017517 )
							if( smoothK_k <= 20.9415 )
								if( ema13 <= 0.128212 )
									ret := -0.037383
								if( ema13 > 0.128212 )
									ret := 0.250000
							if( smoothK_k > 20.9415 )
								if( smoothK_k <= 23.4331 )
									ret := -0.571429
								if( smoothK_k > 23.4331 )
									ret := 0.000000
					if( smoothK_k > 31.4634 )
						if( ema13 <= 0.009515 )
							if( tema <= 199.985 )
								ret := 0.000000
							if( tema > 199.985 )
								ret := -0.600000
						if( ema13 > 0.009515 )
							ret := -1.000000 // sell
				if( rsi1 > 61.1189 )
					if( d_k <= 0.482633 )
						ret := -1.000000 // sell
					if( d_k > 0.482633 )
						ret := -0.750000 // sell
			if( smoothD_d > 20.2578 )
				if( ema2 <= 199.902 )
					if( ema3 <= 199.692 )
						if( ema13 <= 0.128733 )
							if( d_k <= -7.62719 )
								if( ema3 <= 199.639 )
									ret := 0.250000
								if( ema3 > 199.639 )
									ret := 1.000000 // buy
							if( d_k > -7.62719 )
								if( rsi1 <= 60.2627 )
									ret := -0.250000
								if( rsi1 > 60.2627 )
									ret := 0.000000
						if( ema13 > 0.128733 )
							if( ema3 <= 199.088 )
								ret := 0.400000
							if( ema3 > 199.088 )
								if( ema3 <= 199.538 )
									ret := -0.500000
								if( ema3 > 199.538 )
									ret := -0.048780
					if( ema3 > 199.692 )
						if( smoothD_d <= 22.2525 )
							ret := 0.750000 // buy
						if( smoothD_d > 22.2525 )
							if( ema1 <= 199.874 )
								if( smoothD_d <= 90.5047 )
									ret := -0.375000
								if( smoothD_d > 90.5047 )
									ret := 0.071429
							if( ema1 > 199.874 )
								if( ema2 <= 199.9 )
									ret := -0.075000
								if( ema2 > 199.9 )
									ret := -0.500000
				if( ema2 > 199.902 )
					if( d <= 95.4757 )
						if( tema <= 199.887 )
							if( ema1 <= 199.962 )
								if( ema13 <= -0.0055 )
									ret := 0.057143
								if( ema13 > -0.0055 )
									ret := 0.500000
							if( ema1 > 199.962 )
								ret := 0.600000
						if( tema > 199.887 )
							if( ema13 <= 0.067569 )
								if( ema13 <= -0.019839 )
									ret := -0.134831
								if( ema13 > -0.019839 )
									ret := -0.013746
							if( ema13 > 0.067569 )
								if( d_k <= 0.969566 )
									ret := -0.571429
								if( d_k > 0.969566 )
									ret := -0.100000
					if( d > 95.4757 )
						if( ema1 <= 199.991 )
							ret := 0.333333
						if( ema1 > 199.991 )
							ret := 1.000000 // buy
		if( tema > 200.043 )
			if( ema12 <= 0.381333 )
				if( ema13 <= 0.370904 )
					if( rsi1 <= 39.6303 )
						if( ema3 <= 200.626 )
							if( ema3 <= 200.238 )
								if( smoothD_d <= 0.965075 )
									ret := -0.500000
								if( smoothD_d > 0.965075 )
									ret := 0.000000
							if( ema3 > 200.238 )
								if( ema12 <= -0.101452 )
									ret := -0.250000
								if( ema12 > -0.101452 )
									ret := -0.965517 // sell
						if( ema3 > 200.626 )
							ret := 0.000000
					if( rsi1 > 39.6303 )
						if( ema12 <= -0.043767 )
							ret := 0.833333 // buy
						if( ema12 > -0.043767 )
							if( d <= 98.014 )
								if( d_k <= -28.3862 )
									ret := 0.750000 // buy
								if( d_k > -28.3862 )
									ret := -0.313253
							if( d > 98.014 )
								if( tema <= 200.087 )
									ret := 0.000000
								if( tema > 200.087 )
									ret := -0.724138 // sell
				if( ema13 > 0.370904 )
					if( d_k <= 8.96674 )
						if( d_k <= 5.25412 )
							ret := -1.000000 // sell
						if( d_k > 5.25412 )
							if( d <= 67.0462 )
								ret := -1.000000 // sell
							if( d > 67.0462 )
								ret := -0.500000
					if( d_k > 8.96674 )
						ret := 0.250000
			if( ema12 > 0.381333 )
				ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AMZN_1Min_cadf3604(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


