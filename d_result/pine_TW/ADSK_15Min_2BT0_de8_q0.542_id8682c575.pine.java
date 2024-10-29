//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ADSK_15Min_2BT0_8682c575 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2BT0_8682c575", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_8682c575(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.09466 )
		if( ema3 <= 198.653 )
			if( ema12 <= -3.51441 )
				if( bullPower <= -4.39693 )
					if( bbm <= 4.25 )
						if( ema12 <= -5.19126 )
							if( bearPower <= -10.0414 )
								ret := 1.000000 // buy
							if( bearPower > -10.0414 )
								ret := 0.750000 // buy
						if( ema12 > -5.19126 )
							ret := 1.000000 // buy
					if( bbm > 4.25 )
						ret := 0.666667
				if( bullPower > -4.39693 )
					if( ema13 <= -6.2271 )
						if( ema13 <= -7.18623 )
							ret := 0.200000
						if( ema13 > -7.18623 )
							ret := -1.000000 // sell
					if( ema13 > -6.2271 )
						if( tema <= 138.184 )
							ret := 1.000000 // buy
						if( tema > 138.184 )
							ret := 0.750000 // buy
			if( ema12 > -3.51441 )
				if( ema2 <= 196.477 )
					if( bearPower <= -4.00881 )
						if( tema <= 146.642 )
							if( tema <= 141.564 )
								if( bearPower <= -6.11794 )
									ret := -0.818182 // sell
								if( bearPower > -6.11794 )
									ret := 0.269231
							if( tema > 141.564 )
								if( ema1 <= 146.813 )
									ret := 0.864865 // buy
								if( ema1 > 146.813 )
									ret := 0.250000
						if( tema > 146.642 )
							if( ema12 <= -2.95695 )
								if( tema <= 185.074 )
									ret := 0.589744
								if( tema > 185.074 )
									ret := -0.800000 // sell
							if( ema12 > -2.95695 )
								if( ema2 <= 187.405 )
									ret := -0.541899
								if( ema2 > 187.405 )
									ret := 0.300000
					if( bearPower > -4.00881 )
						if( tema <= 141.047 )
							if( ema2 <= 142.598 )
								if( ema2 <= 130.274 )
									ret := 0.147826
								if( ema2 > 130.274 )
									ret := 0.003476
							if( ema2 > 142.598 )
								if( ema13 <= -2.69415 )
									ret := -0.250000
								if( ema13 > -2.69415 )
									ret := -0.965517 // sell
						if( tema > 141.047 )
							if( ema12 <= -1.87609 )
								if( ema1 <= 161.898 )
									ret := 0.736842 // buy
								if( ema1 > 161.898 )
									ret := 0.319149
							if( ema12 > -1.87609 )
								if( bullPower <= -1.80439 )
									ret := -0.084175
								if( bullPower > -1.80439 )
									ret := 0.177818
				if( ema2 > 196.477 )
					if( tema <= 196.541 )
						if( tema <= 194.306 )
							if( bbp <= -3.32052 )
								if( ema1 <= 195.19 )
									ret := 0.250000
								if( ema1 > 195.19 )
									ret := 0.961538 // buy
							if( bbp > -3.32052 )
								ret := 0.285714
						if( tema > 194.306 )
							if( ema12 <= -1.02181 )
								if( ema12 <= -1.08396 )
									ret := 0.100000
								if( ema12 > -1.08396 )
									ret := -0.700000 // sell
							if( ema12 > -1.02181 )
								if( bearPower <= -3.62495 )
									ret := -1.000000 // sell
								if( bearPower > -3.62495 )
									ret := 0.611702
					if( tema > 196.541 )
						if( ema13 <= -0.740265 )
							if( ema3 <= 198.165 )
								ret := 0.200000
							if( ema3 > 198.165 )
								if( ema3 <= 198.596 )
									ret := -0.928571 // sell
								if( ema3 > 198.596 )
									ret := -0.500000
						if( ema13 > -0.740265 )
							if( ema13 <= 0.211633 )
								if( bearPower <= -0.221078 )
									ret := 0.058824
								if( bearPower > -0.221078 )
									ret := 0.800000 // buy
							if( ema13 > 0.211633 )
								if( bearPower <= -1.08036 )
									ret := 0.000000
								if( bearPower > -1.08036 )
									ret := 1.000000 // buy
		if( ema3 > 198.653 )
			if( ema13 <= -0.870984 )
				if( bbp <= -4.65799 )
					if( ema2 <= 292.052 )
						if( ema2 <= 261.23 )
							if( ema1 <= 255.876 )
								if( ema2 <= 256.725 )
									ret := 0.070204
								if( ema2 > 256.725 )
									ret := 0.734694 // buy
							if( ema1 > 255.876 )
								if( bullPower <= -2.86982 )
									ret := 0.217391
								if( bullPower > -2.86982 )
									ret := -0.877551 // sell
						if( ema2 > 261.23 )
							if( ema1 <= 262.529 )
								if( bbm <= 1.23108 )
									ret := 0.181818
								if( bbm > 1.23108 )
									ret := 0.937500 // buy
							if( ema1 > 262.529 )
								if( ema2 <= 288.393 )
									ret := 0.202381
								if( ema2 > 288.393 )
									ret := 0.833333 // buy
					if( ema2 > 292.052 )
						if( ema2 <= 297.843 )
							if( bbp <= -4.81773 )
								if( ema13 <= -3.48254 )
									ret := -0.500000
								if( ema13 > -3.48254 )
									ret := -0.937500 // sell
							if( bbp > -4.81773 )
								ret := 0.250000
						if( ema2 > 297.843 )
							if( bbm <= 1.86635 )
								if( ema3 <= 312.117 )
									ret := 0.476923
								if( ema3 > 312.117 )
									ret := -0.305556
							if( bbm > 1.86635 )
								if( ema1 <= 331.466 )
									ret := -0.517647
								if( ema1 > 331.466 )
									ret := 1.000000 // buy
				if( bbp > -4.65799 )
					if( ema13 <= -1.60335 )
						if( ema3 <= 290.177 )
							if( bullPower <= -0.507466 )
								if( ema13 <= -3.6906 )
									ret := -0.538462
								if( ema13 > -3.6906 )
									ret := -0.203117
							if( bullPower > -0.507466 )
								if( ema3 <= 199.164 )
									ret := 1.000000 // buy
								if( ema3 > 199.164 )
									ret := -0.039894
						if( ema3 > 290.177 )
							if( ema3 <= 312.621 )
								if( bearPower <= -0.751506 )
									ret := 0.337963
								if( bearPower > -0.751506 )
									ret := -1.000000 // sell
							if( ema3 > 312.621 )
								if( tema <= 323.92 )
									ret := -0.200000
								if( tema > 323.92 )
									ret := -0.750000 // sell
					if( ema13 > -1.60335 )
						if( ema2 <= 256.351 )
							if( tema <= 245.616 )
								if( ema12 <= -0.547088 )
									ret := 0.030353
								if( ema12 > -0.547088 )
									ret := -0.197183
							if( tema > 245.616 )
								if( bbm <= 1.03499 )
									ret := 0.695312
								if( bbm > 1.03499 )
									ret := 0.160000
						if( ema2 > 256.351 )
							if( tema <= 263.27 )
								if( bbp <= -2.09707 )
									ret := -0.663793
								if( bbp > -2.09707 )
									ret := -0.206349
							if( tema > 263.27 )
								if( bbm <= 0.089849 )
									ret := 0.302326
								if( bbm > 0.089849 )
									ret := -0.083658
			if( ema13 > -0.870984 )
				if( ema3 <= 207.674 )
					if( ema3 <= 204.867 )
						if( ema12 <= -0.279047 )
							if( bbm <= 0.55 )
								if( bbp <= -0.90797 )
									ret := 0.702128 // buy
								if( bbp > -0.90797 )
									ret := -0.037037
							if( bbm > 0.55 )
								if( ema3 <= 199.951 )
									ret := -0.428571
								if( ema3 > 199.951 )
									ret := 0.214286
						if( ema12 > -0.279047 )
							if( ema13 <= -0.211673 )
								if( ema13 <= -0.524536 )
									ret := -0.814815 // sell
								if( ema13 > -0.524536 )
									ret := -0.297619
							if( ema13 > -0.211673 )
								if( bbm <= 0.31027 )
									ret := 0.573770
								if( bbm > 0.31027 )
									ret := -0.150000
					if( ema3 > 204.867 )
						if( ema2 <= 206.859 )
							if( ema1 <= 206.388 )
								if( bearPower <= -1.05525 )
									ret := -0.585714
								if( bearPower > -1.05525 )
									ret := -0.280488
							if( ema1 > 206.388 )
								ret := -1.000000 // sell
						if( ema2 > 206.859 )
							if( ema3 <= 207.413 )
								if( bearPower <= -1.02397 )
									ret := 0.166667
								if( bearPower > -1.02397 )
									ret := 1.000000 // buy
							if( ema3 > 207.413 )
								if( bearPower <= -0.547915 )
									ret := -0.555556
								if( bearPower > -0.547915 )
									ret := 0.333333
				if( ema3 > 207.674 )
					if( ema3 <= 234.902 )
						if( bearPower <= -3.58 )
							if( ema12 <= -0.315323 )
								if( bullPower <= -2.31341 )
									ret := -0.400000
								if( bullPower > -2.31341 )
									ret := -0.941176 // sell
							if( ema12 > -0.315323 )
								ret := 0.200000
						if( bearPower > -3.58 )
							if( ema2 <= 224.073 )
								if( tema <= 207.581 )
									ret := 0.642857
								if( tema > 207.581 )
									ret := 0.161954
							if( ema2 > 224.073 )
								if( ema12 <= 0.105884 )
									ret := 0.551515
								if( ema12 > 0.105884 )
									ret := -0.368421
					if( ema3 > 234.902 )
						if( bbm <= 0.213729 )
							if( bearPower <= -0.176397 )
								if( tema <= 236.058 )
									ret := -0.666667
								if( tema > 236.058 )
									ret := 0.341155
							if( bearPower > -0.176397 )
								if( ema12 <= -0.186136 )
									ret := 0.416667
								if( ema12 > -0.186136 )
									ret := -0.333333
						if( bbm > 0.213729 )
							if( tema <= 237.193 )
								if( ema12 <= -0.135593 )
									ret := -0.666667
								if( ema12 > -0.135593 )
									ret := -0.125000
							if( tema > 237.193 )
								if( tema <= 237.574 )
									ret := 0.928571 // buy
								if( tema > 237.574 )
									ret := 0.066712
	if( bullPower > -0.09466 )
		if( ema13 <= -1.31174 )
			if( tema <= 280.355 )
				if( bbm <= 2.52723 )
					if( ema1 <= 163.565 )
						if( ema2 <= 109.151 )
							ret := 0.714286 // buy
						if( ema2 > 109.151 )
							if( bullPower <= 2.62018 )
								if( bbm <= 1.26362 )
									ret := -0.297619
								if( bbm > 1.26362 )
									ret := -0.694444
							if( bullPower > 2.62018 )
								ret := 0.666667
					if( ema1 > 163.565 )
						if( tema <= 188.284 )
							if( ema3 <= 180.886 )
								if( ema3 <= 179.144 )
									ret := 0.277778
								if( ema3 > 179.144 )
									ret := -0.700000 // sell
							if( ema3 > 180.886 )
								if( ema13 <= -2.47972 )
									ret := 1.000000 // buy
								if( ema13 > -2.47972 )
									ret := 0.420000
						if( tema > 188.284 )
							if( ema2 <= 216.037 )
								if( ema1 <= 211.631 )
									ret := -0.367232
								if( ema1 > 211.631 )
									ret := -0.967742 // sell
							if( ema2 > 216.037 )
								if( bullPower <= 0.097121 )
									ret := 0.188235
								if( bullPower > 0.097121 )
									ret := -0.059829
				if( bbm > 2.52723 )
					if( tema <= 211.052 )
						if( ema13 <= -1.40797 )
							if( ema12 <= -0.604927 )
								if( bbm <= 11.7986 )
									ret := 0.747475 // buy
								if( bbm > 11.7986 )
									ret := -0.500000
							if( ema12 > -0.604927 )
								if( bbm <= 3.9425 )
									ret := 0.800000 // buy
								if( bbm > 3.9425 )
									ret := -0.750000 // sell
						if( ema13 > -1.40797 )
							if( tema <= 193.776 )
								ret := 0.600000
							if( tema > 193.776 )
								ret := -0.857143 // sell
					if( tema > 211.052 )
						if( tema <= 267.466 )
							if( ema13 <= -3.90089 )
								if( ema12 <= -2.13668 )
									ret := 0.166667
								if( ema12 > -2.13668 )
									ret := 1.000000 // buy
							if( ema13 > -3.90089 )
								if( ema13 <= -3.4851 )
									ret := -1.000000 // sell
								if( ema13 > -3.4851 )
									ret := -0.105263
						if( tema > 267.466 )
							if( ema3 <= 276.593 )
								ret := 1.000000 // buy
							if( ema3 > 276.593 )
								if( bbm <= 3.37653 )
									ret := 0.200000
								if( bbm > 3.37653 )
									ret := 0.857143 // buy
			if( tema > 280.355 )
				if( ema1 <= 285.955 )
					if( ema1 <= 284.795 )
						if( ema3 <= 285.353 )
							if( bbm <= 0.975 )
								if( ema1 <= 281.029 )
									ret := -1.000000 // sell
								if( ema1 > 281.029 )
									ret := 0.000000
							if( bbm > 0.975 )
								if( tema <= 281.626 )
									ret := -0.500000
								if( tema > 281.626 )
									ret := -1.000000 // sell
						if( ema3 > 285.353 )
							ret := 0.000000
					if( ema1 > 284.795 )
						if( ema12 <= -0.630847 )
							ret := -1.000000 // sell
						if( ema12 > -0.630847 )
							ret := -0.750000 // sell
				if( ema1 > 285.955 )
					if( tema <= 286.917 )
						ret := 0.666667
					if( tema > 286.917 )
						if( ema13 <= -1.9104 )
							if( bbp <= -1.27692 )
								if( ema3 <= 315.519 )
									ret := -0.714286 // sell
								if( ema3 > 315.519 )
									ret := 0.333333
							if( bbp > -1.27692 )
								if( bearPower <= -1.08998 )
									ret := -0.875000 // sell
								if( bearPower > -1.08998 )
									ret := -0.615385
						if( ema13 > -1.9104 )
							if( ema2 <= 289.818 )
								if( tema <= 288.699 )
									ret := 0.000000
								if( tema > 288.699 )
									ret := 1.000000 // buy
							if( ema2 > 289.818 )
								if( bbm <= 0.678574 )
									ret := -1.000000 // sell
								if( bbm > 0.678574 )
									ret := -0.250000
		if( ema13 > -1.31174 )
			if( tema <= 341.142 )
				if( bearPower <= -0.160088 )
					if( bbp <= 1.24388 )
						if( ema13 <= -0.212059 )
							if( tema <= 137.676 )
								if( ema12 <= -0.231871 )
									ret := 0.277338
								if( ema12 > -0.231871 )
									ret := -0.001245
							if( tema > 137.676 )
								if( bullPower <= 0.22136 )
									ret := 0.064220
								if( bullPower > 0.22136 )
									ret := -0.035882
						if( ema13 > -0.212059 )
							if( bbp <= -1.92513 )
								if( bearPower <= -3.52546 )
									ret := -0.025641
								if( bearPower > -3.52546 )
									ret := -0.517241
							if( bbp > -1.92513 )
								if( tema <= 71.1569 )
									ret := 1.000000 // buy
								if( tema > 71.1569 )
									ret := -0.025144
					if( bbp > 1.24388 )
						if( ema1 <= 176.576 )
							if( ema12 <= 0.496092 )
								if( tema <= 124.253 )
									ret := 0.111111
								if( tema > 124.253 )
									ret := -0.678571
							if( ema12 > 0.496092 )
								if( ema13 <= 2.96808 )
									ret := 0.472727
								if( ema13 > 2.96808 )
									ret := -0.875000 // sell
						if( ema1 > 176.576 )
							if( ema3 <= 186.453 )
								if( bullPower <= 3.35885 )
									ret := 1.000000 // buy
								if( bullPower > 3.35885 )
									ret := 0.166667
							if( ema3 > 186.453 )
								if( ema1 <= 195.603 )
									ret := -0.323529
								if( ema1 > 195.603 )
									ret := 0.250000
				if( bearPower > -0.160088 )
					if( ema12 <= 2.30409 )
						if( ema3 <= 134.216 )
							if( ema1 <= 132.956 )
								if( ema3 <= 70.2769 )
									ret := 0.771429 // buy
								if( ema3 > 70.2769 )
									ret := 0.067571
							if( ema1 > 132.956 )
								if( bearPower <= 0.091771 )
									ret := 0.089286
								if( bearPower > 0.091771 )
									ret := 0.528908
						if( ema3 > 134.216 )
							if( ema2 <= 139.525 )
								if( tema <= 139.09 )
									ret := -0.066430
								if( tema > 139.09 )
									ret := -0.362934
							if( ema2 > 139.525 )
								if( ema2 <= 147.865 )
									ret := 0.178059
								if( ema2 > 147.865 )
									ret := 0.046682
					if( ema12 > 2.30409 )
						if( bbm <= 0.47 )
							if( tema <= 206.021 )
								if( ema2 <= 144.197 )
									ret := -0.500000
								if( ema2 > 144.197 )
									ret := -0.941176 // sell
							if( tema > 206.021 )
								if( ema2 <= 239.244 )
									ret := -0.259259
								if( ema2 > 239.244 )
									ret := -0.720000 // sell
						if( bbm > 0.47 )
							if( ema1 <= 247.728 )
								if( ema2 <= 152.035 )
									ret := -0.393443
								if( ema2 > 152.035 )
									ret := 0.167910
							if( ema1 > 247.728 )
								if( bearPower <= 6.66507 )
									ret := -0.287671
								if( bearPower > 6.66507 )
									ret := -1.000000 // sell
			if( tema > 341.142 )
				if( ema13 <= 0.823705 )
					if( ema1 <= 341.888 )
						ret := -1.000000 // sell
					if( ema1 > 341.888 )
						if( ema1 <= 342.265 )
							ret := 0.000000
						if( ema1 > 342.265 )
							ret := -0.800000 // sell
				if( ema13 > 0.823705 )
					ret := 0.000000
	
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
float op_operation = decision_tree_0_ADSK_15Min_8682c575(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


