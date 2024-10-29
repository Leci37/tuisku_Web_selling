//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: META_30Min_2BT0_7f835ced Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2BT0_7f835ced", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_7f835ced(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.200611 )
		if( bbm <= 1.16995 )
			if( ema12 <= 0.251609 )
				if( ema1 <= 229.206 )
					if( bearPower <= -2.71493 )
						if( ema1 <= 161.167 )
							if( bbm <= 1.06516 )
								if( tema <= 106.592 )
									ret := -1.000000 // sell
								if( tema > 106.592 )
									ret := 0.111111
							if( bbm > 1.06516 )
								if( ema12 <= -1.78532 )
									ret := 0.466667
								if( ema12 > -1.78532 )
									ret := 0.916667 // buy
						if( ema1 > 161.167 )
							if( ema2 <= 188.799 )
								if( bearPower <= -4.22261 )
									ret := -0.062500
								if( bearPower > -4.22261 )
									ret := -0.594737
							if( ema2 > 188.799 )
								if( ema12 <= -2.71705 )
									ret := -0.653846
								if( ema12 > -2.71705 )
									ret := 0.210526
					if( bearPower > -2.71493 )
						if( tema <= 161.583 )
							if( tema <= 161.28 )
								if( bullPower <= -1.52947 )
									ret := 0.500000
								if( bullPower > -1.52947 )
									ret := 0.077145
							if( tema > 161.28 )
								if( bearPower <= -1.10069 )
									ret := -0.700000 // sell
								if( bearPower > -1.10069 )
									ret := 0.707965 // buy
						if( tema > 161.583 )
							if( tema <= 162.737 )
								if( ema2 <= 164.068 )
									ret := -0.253086
								if( ema2 > 164.068 )
									ret := -0.813953 // sell
							if( tema > 162.737 )
								if( bullPower <= 0.28995 )
									ret := -0.008193
								if( bullPower > 0.28995 )
									ret := 0.336634
				if( ema1 > 229.206 )
					if( ema1 <= 277.014 )
						if( ema3 <= 275.696 )
							if( tema <= 230.927 )
								if( bbp <= -4.12219 )
									ret := 0.000000
								if( bbp > -4.12219 )
									ret := 0.698276
							if( tema > 230.927 )
								if( ema1 <= 254.061 )
									ret := 0.025210
								if( ema1 > 254.061 )
									ret := 0.288889
						if( ema3 > 275.696 )
							if( ema1 <= 276.442 )
								if( ema2 <= 276.609 )
									ret := 0.476190
								if( ema2 > 276.609 )
									ret := 0.843750 // buy
							if( ema1 > 276.442 )
								if( bbm <= 0.970324 )
									ret := 1.000000 // buy
								if( bbm > 0.970324 )
									ret := 0.909091 // buy
					if( ema1 > 277.014 )
						if( ema3 <= 280.026 )
							if( ema3 <= 278.507 )
								if( bbm <= 0.680373 )
									ret := 0.600000
								if( bbm > 0.680373 )
									ret := -1.000000 // sell
							if( ema3 > 278.507 )
								if( bbp <= -1.29713 )
									ret := -0.843137 // sell
								if( bbp > -1.29713 )
									ret := -0.333333
						if( ema3 > 280.026 )
							if( ema2 <= 368.211 )
								if( ema3 <= 366.609 )
									ret := 0.067434
								if( ema3 > 366.609 )
									ret := -0.781818 // sell
							if( ema2 > 368.211 )
								if( ema2 <= 368.444 )
									ret := 0.933333 // buy
								if( ema2 > 368.444 )
									ret := 0.209283
			if( ema12 > 0.251609 )
				if( bullPower <= 0.139243 )
					if( ema12 <= 0.489666 )
						if( ema2 <= 273.474 )
							if( bbp <= -0.605907 )
								ret := -0.181818
							if( bbp > -0.605907 )
								ret := 0.000000
						if( ema2 > 273.474 )
							if( bbp <= -0.536576 )
								if( bullPower <= -0.202653 )
									ret := 0.300000
								if( bullPower > -0.202653 )
									ret := -0.111111
							if( bbp > -0.536576 )
								if( bbm <= 0.373868 )
									ret := 0.222222
								if( bbm > 0.373868 )
									ret := 0.800000 // buy
					if( ema12 > 0.489666 )
						ret := -0.400000
				if( bullPower > 0.139243 )
					if( bearPower <= -0.656875 )
						if( ema13 <= 1.11376 )
							if( bearPower <= -0.729774 )
								ret := -0.090909
							if( bearPower > -0.729774 )
								ret := -1.000000 // sell
						if( ema13 > 1.11376 )
							ret := -0.954545 // sell
					if( bearPower > -0.656875 )
						if( ema13 <= 0.929978 )
							ret := -0.615385
						if( ema13 > 0.929978 )
							ret := 0.157895
		if( bbm > 1.16995 )
			if( ema13 <= -34.6784 )
				ret := 1.000000 // buy
			if( ema13 > -34.6784 )
				if( tema <= 301.813 )
					if( ema3 <= 94.7482 )
						ret := 1.000000 // buy
					if( ema3 > 94.7482 )
						if( ema12 <= -5.34702 )
							if( ema2 <= 275.323 )
								if( bullPower <= -11.8538 )
									ret := 0.111111
								if( bullPower > -11.8538 )
									ret := -0.969697 // sell
							if( ema2 > 275.323 )
								ret := -0.111111
						if( ema12 > -5.34702 )
							if( ema1 <= 291.698 )
								if( tema <= 281.622 )
									ret := 0.010291
								if( tema > 281.622 )
									ret := -0.431034
							if( ema1 > 291.698 )
								if( bearPower <= -6.27989 )
									ret := 0.948052 // buy
								if( bearPower > -6.27989 )
									ret := 0.105615
				if( tema > 301.813 )
					if( ema3 <= 311.715 )
						if( ema3 <= 310.148 )
							if( ema12 <= -0.690335 )
								if( bbp <= -3.21688 )
									ret := -0.285714
								if( bbp > -3.21688 )
									ret := 0.444444
							if( ema12 > -0.690335 )
								if( bbp <= -0.899381 )
									ret := -0.658537
								if( bbp > -0.899381 )
									ret := -0.395349
						if( ema3 > 310.148 )
							if( bearPower <= -2.85335 )
								if( ema3 <= 311.015 )
									ret := -1.000000 // sell
								if( ema3 > 311.015 )
									ret := -0.733333 // sell
							if( bearPower > -2.85335 )
								if( ema12 <= -0.084743 )
									ret := -0.166667
								if( ema12 > -0.084743 )
									ret := -0.750000 // sell
					if( ema3 > 311.715 )
						if( bullPower <= 2.80286 )
							if( ema13 <= -3.23558 )
								if( ema1 <= 469.688 )
									ret := 0.332061
								if( ema1 > 469.688 )
									ret := -0.145877
							if( ema13 > -3.23558 )
								if( ema1 <= 322.415 )
									ret := -0.306383
								if( ema1 > 322.415 )
									ret := -0.087770
						if( bullPower > 2.80286 )
							if( ema13 <= 1.81323 )
								if( ema12 <= 0.016178 )
									ret := 0.514286
								if( ema12 > 0.016178 )
									ret := 0.916667 // buy
							if( ema13 > 1.81323 )
								ret := -0.454545
	if( bbp > -0.200611 )
		if( ema2 <= 278.317 )
			if( tema <= 188.467 )
				if( bullPower <= 0.249073 )
					if( tema <= 187.05 )
						if( ema1 <= 94.9976 )
							if( tema <= 95.0072 )
								ret := 0.714286 // buy
							if( tema > 95.0072 )
								ret := 1.000000 // buy
						if( ema1 > 94.9976 )
							if( tema <= 105.188 )
								if( ema3 <= 98.8614 )
									ret := -0.015873
								if( ema3 > 98.8614 )
									ret := -0.739130 // sell
							if( tema > 105.188 )
								if( ema1 <= 117.194 )
									ret := 0.089385
								if( ema1 > 117.194 )
									ret := -0.073517
					if( tema > 187.05 )
						if( ema3 <= 187.817 )
							if( bearPower <= 0.043279 )
								if( ema1 <= 187.789 )
									ret := -0.877778 // sell
								if( ema1 > 187.789 )
									ret := -0.200000
							if( bearPower > 0.043279 )
								ret := 0.000000
						if( ema3 > 187.817 )
							if( bbp <= -0.121385 )
								ret := -0.416667
							if( bbp > -0.121385 )
								ret := 0.111111
				if( bullPower > 0.249073 )
					if( ema3 <= 185.358 )
						if( ema3 <= 183.942 )
							if( bbp <= 4.56179 )
								if( ema2 <= 182.638 )
									ret := -0.004687
								if( ema2 > 182.638 )
									ret := 0.220168
							if( bbp > 4.56179 )
								if( bullPower <= 4.02711 )
									ret := 0.325823
								if( bullPower > 4.02711 )
									ret := 0.053125
						if( ema3 > 183.942 )
							if( ema13 <= 1.80097 )
								if( bbp <= 0.123349 )
									ret := 0.381818
								if( bbp > 0.123349 )
									ret := -0.462532
							if( ema13 > 1.80097 )
								ret := 1.000000 // buy
					if( ema3 > 185.358 )
						if( ema13 <= 0.401479 )
							if( bbm <= 1.63712 )
								if( ema1 <= 186.873 )
									ret := 0.286585
								if( ema1 > 186.873 )
									ret := -0.155172
							if( bbm > 1.63712 )
								if( bbp <= 2.00588 )
									ret := 0.733333 // buy
								if( bbp > 2.00588 )
									ret := 0.111111
						if( ema13 > 0.401479 )
							if( bbm <= 0.7025 )
								if( ema2 <= 186.539 )
									ret := -0.116883
								if( ema2 > 186.539 )
									ret := 0.565891
							if( bbm > 0.7025 )
								if( ema13 <= 0.749934 )
									ret := 0.879310 // buy
								if( ema13 > 0.749934 )
									ret := 0.566667
			if( tema > 188.467 )
				if( ema12 <= -0.359394 )
					if( ema1 <= 234.251 )
						if( tema <= 207.201 )
							if( ema12 <= -0.398955 )
								if( ema13 <= -1.16439 )
									ret := -0.416667
								if( ema13 > -1.16439 )
									ret := 0.321429
							if( ema12 > -0.398955 )
								ret := 0.625000
						if( tema > 207.201 )
							if( bullPower <= 2.76321 )
								if( ema13 <= -1.68733 )
									ret := 0.640000
								if( ema13 > -1.68733 )
									ret := 0.866667 // buy
							if( bullPower > 2.76321 )
								ret := 0.500000
					if( ema1 > 234.251 )
						if( ema13 <= -2.116 )
							if( ema3 <= 275.058 )
								ret := -0.333333
							if( ema3 > 275.058 )
								ret := -1.000000 // sell
						if( ema13 > -2.116 )
							if( ema1 <= 262.002 )
								if( bbp <= 0.0749 )
									ret := 0.153846
								if( bbp > 0.0749 )
									ret := -0.533333
							if( ema1 > 262.002 )
								if( ema1 <= 272.749 )
									ret := 0.605263
								if( ema1 > 272.749 )
									ret := 0.105263
				if( ema12 > -0.359394 )
					if( ema3 <= 276.487 )
						if( bbp <= 8.89202 )
							if( bbp <= 5.58352 )
								if( ema2 <= 192.087 )
									ret := -0.211552
								if( ema2 > 192.087 )
									ret := -0.056875
							if( bbp > 5.58352 )
								if( ema1 <= 189.83 )
									ret := 0.721311 // buy
								if( ema1 > 189.83 )
									ret := 0.133452
						if( bbp > 8.89202 )
							if( ema2 <= 186.142 )
								if( tema <= 192.404 )
									ret := 1.000000 // buy
								if( tema > 192.404 )
									ret := -0.363636
							if( ema2 > 186.142 )
								if( ema13 <= 12.4674 )
									ret := -0.482270
								if( ema13 > 12.4674 )
									ret := -1.000000 // sell
					if( ema3 > 276.487 )
						if( ema1 <= 277.926 )
							if( bullPower <= 0.474364 )
								if( ema12 <= 0.068832 )
									ret := 0.666667
								if( ema12 > 0.068832 )
									ret := -0.222222
							if( bullPower > 0.474364 )
								if( tema <= 278.01 )
									ret := -0.688679
								if( tema > 278.01 )
									ret := -0.886364 // sell
						if( ema1 > 277.926 )
							if( ema3 <= 277.579 )
								if( ema3 <= 277.188 )
									ret := -0.272727
								if( ema3 > 277.188 )
									ret := 0.621622
							if( ema3 > 277.579 )
								if( ema12 <= 0.389789 )
									ret := -0.333333
								if( ema12 > 0.389789 )
									ret := -1.000000 // sell
		if( ema2 > 278.317 )
			if( tema <= 498.581 )
				if( ema2 <= 395.278 )
					if( ema1 <= 280.204 )
						if( bearPower <= -0.343559 )
							ret := 0.111111
						if( bearPower > -0.343559 )
							if( ema1 <= 279.51 )
								if( bbm <= 0.540561 )
									ret := 0.214286
								if( bbm > 0.540561 )
									ret := 0.896552 // buy
							if( ema1 > 279.51 )
								if( tema <= 280.644 )
									ret := 1.000000 // buy
								if( tema > 280.644 )
									ret := 0.875000 // buy
					if( ema1 > 280.204 )
						if( ema13 <= 9.1658 )
							if( bbp <= 4.84707 )
								if( bearPower <= -1.75772 )
									ret := -0.429630
								if( bearPower > -1.75772 )
									ret := 0.032517
							if( bbp > 4.84707 )
								if( tema <= 387.083 )
									ret := -0.156087
								if( tema > 387.083 )
									ret := -1.000000 // sell
						if( ema13 > 9.1658 )
							if( bullPower <= 7.06533 )
								ret := 0.750000 // buy
							if( bullPower > 7.06533 )
								ret := 1.000000 // buy
				if( ema2 > 395.278 )
					if( ema2 <= 461.305 )
						if( ema3 <= 443.958 )
							if( bullPower <= 3.46151 )
								if( ema3 <= 400.51 )
									ret := 0.710526 // buy
								if( ema3 > 400.51 )
									ret := -0.438095
							if( bullPower > 3.46151 )
								if( bullPower <= 6.68939 )
									ret := 0.890110 // buy
								if( bullPower > 6.68939 )
									ret := 0.175000
						if( ema3 > 443.958 )
							if( ema3 <= 455.132 )
								if( ema12 <= 0.905094 )
									ret := 1.000000 // buy
								if( ema12 > 0.905094 )
									ret := 0.710526 // buy
							if( ema3 > 455.132 )
								if( ema2 <= 459.797 )
									ret := 0.236842
								if( ema2 > 459.797 )
									ret := 0.923077 // buy
					if( ema2 > 461.305 )
						if( ema1 <= 486.342 )
							if( bbp <= 3.62741 )
								if( ema3 <= 467.167 )
									ret := 0.497006
								if( ema3 > 467.167 )
									ret := 0.042308
							if( bbp > 3.62741 )
								if( ema1 <= 472.926 )
									ret := 0.047393
								if( ema1 > 472.926 )
									ret := -0.331707
						if( ema1 > 486.342 )
							if( ema2 <= 492.16 )
								if( tema <= 488.056 )
									ret := 0.066667
								if( tema > 488.056 )
									ret := 0.553435
							if( ema2 > 492.16 )
								if( ema13 <= 0.185972 )
									ret := -0.423529
								if( ema13 > 0.185972 )
									ret := 0.320652
			if( tema > 498.581 )
				if( bearPower <= -0.024377 )
					if( ema1 <= 508.978 )
						if( tema <= 499.43 )
							ret := -1.000000 // sell
						if( tema > 499.43 )
							if( tema <= 501.027 )
								ret := 0.388889
							if( tema > 501.027 )
								if( ema3 <= 501.176 )
									ret := -0.850000 // sell
								if( ema3 > 501.176 )
									ret := -0.467626
					if( ema1 > 508.978 )
						if( tema <= 516.647 )
							if( ema2 <= 511.412 )
								if( BBPower_Color <= 0.5 )
									ret := 0.500000
								if( BBPower_Color > 0.5 )
									ret := -0.142857
							if( ema2 > 511.412 )
								if( bullPower <= 2.80878 )
									ret := 0.869565 // buy
								if( bullPower > 2.80878 )
									ret := 0.444444
						if( tema > 516.647 )
							if( ema1 <= 522.325 )
								if( ema13 <= 1.18344 )
									ret := -0.368421
								if( ema13 > 1.18344 )
									ret := -0.814815 // sell
							if( ema1 > 522.325 )
								if( ema2 <= 590.984 )
									ret := 0.039216
								if( ema2 > 590.984 )
									ret := -0.827586 // sell
				if( bearPower > -0.024377 )
					if( ema13 <= 3.02413 )
						if( ema12 <= 1.00379 )
							if( ema2 <= 497.514 )
								ret := 0.750000 // buy
							if( ema2 > 497.514 )
								if( tema <= 501.331 )
									ret := -0.896552 // sell
								if( tema > 501.331 )
									ret := 0.001795
						if( ema12 > 1.00379 )
							if( ema2 <= 578.802 )
								if( bbm <= 1.78395 )
									ret := -0.136752
								if( bbm > 1.78395 )
									ret := -0.565217
							if( ema2 > 578.802 )
								if( bullPower <= 2.56426 )
									ret := 0.000000
								if( bullPower > 2.56426 )
									ret := 0.714286 // buy
					if( ema13 > 3.02413 )
						if( bullPower <= 5.44189 )
							if( ema3 <= 518.605 )
								if( tema <= 502.972 )
									ret := 0.277778
								if( tema > 502.972 )
									ret := 0.619266
							if( ema3 > 518.605 )
								if( ema2 <= 521.891 )
									ret := -1.000000 // sell
								if( ema2 > 521.891 )
									ret := -0.108696
						if( bullPower > 5.44189 )
							if( ema3 <= 504.259 )
								if( ema13 <= 12.4262 )
									ret := -0.587629
								if( ema13 > 12.4262 )
									ret := 0.440000
							if( ema3 > 504.259 )
								if( ema13 <= 10.4787 )
									ret := -0.074766
								if( ema13 > 10.4787 )
									ret := 0.846154 // buy
	
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
float op_operation = decision_tree_0_META_30Min_7f835ced(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


