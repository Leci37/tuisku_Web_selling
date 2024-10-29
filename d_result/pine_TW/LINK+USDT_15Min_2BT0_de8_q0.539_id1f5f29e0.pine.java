//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: LINKUSDT_15Min_2BT0_1f5f29e0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2BT0_1f5f29e0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_1f5f29e0(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.066973 )
		if( ema1 <= 6.43939 )
			if( ema2 <= 6.03181 )
				if( bbp <= -0.044899 )
					if( ema1 <= 5.92944 )
						if( ema13 <= -0.365905 )
							if( bullPower <= -0.246391 )
								ret := -0.750000 // sell
							if( bullPower > -0.246391 )
								ret := -0.750000 // sell
						if( ema13 > -0.365905 )
							if( bbp <= -0.334809 )
								if( bearPower <= -0.351883 )
									ret := 0.750000 // buy
								if( bearPower > -0.351883 )
									ret := 1.000000 // buy
							if( bbp > -0.334809 )
								if( bullPower <= -0.070354 )
									ret := -0.179487
								if( bullPower > -0.070354 )
									ret := 0.303922
					if( ema1 > 5.92944 )
						if( tema <= 5.95455 )
							if( bullPower <= -0.033169 )
								if( bullPower <= -0.046569 )
									ret := 0.750000 // buy
								if( bullPower > -0.046569 )
									ret := 0.000000
							if( bullPower > -0.033169 )
								if( ema13 <= -0.05418 )
									ret := -0.944444 // sell
								if( ema13 > -0.05418 )
									ret := -0.437500
						if( tema > 5.95455 )
							if( ema12 <= -0.016749 )
								ret := 0.250000
							if( ema12 > -0.016749 )
								if( ema2 <= 5.9999 )
									ret := 0.666667
								if( ema2 > 5.9999 )
									ret := 1.000000 // buy
				if( bbp > -0.044899 )
					if( ema1 <= 5.85104 )
						ret := -1.000000 // sell
					if( ema1 > 5.85104 )
						ret := -0.750000 // sell
			if( ema2 > 6.03181 )
				if( ema3 <= 6.50753 )
					if( ema2 <= 6.45498 )
						if( bbp <= -0.235132 )
							if( bullPower <= -0.099703 )
								if( tema <= 6.10139 )
									ret := 0.596154
								if( tema > 6.10139 )
									ret := -0.700000 // sell
							if( bullPower > -0.099703 )
								if( ema1 <= 6.26056 )
									ret := -0.617647
								if( ema1 > 6.26056 )
									ret := 0.400000
						if( bbp > -0.235132 )
							if( bbm <= 0.103039 )
								if( ema12 <= -0.041784 )
									ret := 0.577586
								if( ema12 > -0.041784 )
									ret := 0.285408
							if( bbm > 0.103039 )
								if( ema2 <= 6.35847 )
									ret := 0.756579 // buy
								if( ema2 > 6.35847 )
									ret := 0.446809
					if( ema2 > 6.45498 )
						if( ema12 <= -0.040172 )
							if( bearPower <= -0.129516 )
								if( bearPower <= -0.178147 )
									ret := 0.750000 // buy
								if( bearPower > -0.178147 )
									ret := -0.777778 // sell
							if( bearPower > -0.129516 )
								if( bearPower <= -0.107296 )
									ret := 1.000000 // buy
								if( bearPower > -0.107296 )
									ret := 0.000000
						if( ema12 > -0.040172 )
							if( ema1 <= 6.43732 )
								ret := -1.000000 // sell
							if( ema1 > 6.43732 )
								ret := -0.250000
				if( ema3 > 6.50753 )
					if( tema <= 6.30295 )
						if( ema13 <= -0.268872 )
							if( tema <= 6.03767 )
								ret := 1.000000 // buy
							if( tema > 6.03767 )
								if( bearPower <= -0.271352 )
									ret := 0.000000
								if( bearPower > -0.271352 )
									ret := 1.000000 // buy
						if( ema13 > -0.268872 )
							if( bullPower <= -0.09439 )
								ret := -1.000000 // sell
							if( bullPower > -0.09439 )
								if( bbp <= -0.246581 )
									ret := 0.866667 // buy
								if( bbp > -0.246581 )
									ret := 0.000000
					if( tema > 6.30295 )
						if( ema12 <= -0.055667 )
							if( bullPower <= -0.065478 )
								if( ema3 <= 6.59101 )
									ret := 0.933333 // buy
								if( ema3 > 6.59101 )
									ret := 0.500000
							if( bullPower > -0.065478 )
								ret := 1.000000 // buy
						if( ema12 > -0.055667 )
							if( ema12 <= -0.054974 )
								ret := -0.500000
							if( ema12 > -0.054974 )
								if( ema13 <= -0.091248 )
									ret := 1.000000 // buy
								if( ema13 > -0.091248 )
									ret := 0.000000
		if( ema1 > 6.43939 )
			if( bearPower <= -0.381694 )
				if( ema3 <= 11.0623 )
					if( ema2 <= 8.67695 )
						if( ema1 <= 6.60616 )
							ret := -1.000000 // sell
						if( ema1 > 6.60616 )
							if( ema12 <= -0.050373 )
								if( bullPower <= -0.33001 )
									ret := -0.444444
								if( bullPower > -0.33001 )
									ret := 0.792683 // buy
							if( ema12 > -0.050373 )
								ret := -1.000000 // sell
					if( ema2 > 8.67695 )
						if( bearPower <= -0.388685 )
							if( ema12 <= -0.194072 )
								if( tema <= 8.65178 )
									ret := 0.000000
								if( tema > 8.65178 )
									ret := -0.909091 // sell
							if( ema12 > -0.194072 )
								if( ema1 <= 8.87458 )
									ret := -0.560000
								if( ema1 > 8.87458 )
									ret := 0.454545
						if( bearPower > -0.388685 )
							ret := 0.800000 // buy
				if( ema3 > 11.0623 )
					if( tema <= 19.2824 )
						if( bbp <= -1.51234 )
							if( ema3 <= 19.9224 )
								if( ema2 <= 16.0634 )
									ret := 1.000000 // buy
								if( ema2 > 16.0634 )
									ret := 0.964286 // buy
							if( ema3 > 19.9224 )
								ret := 0.750000 // buy
						if( bbp > -1.51234 )
							if( bullPower <= -0.36184 )
								if( tema <= 13.4772 )
									ret := 0.750000 // buy
								if( tema > 13.4772 )
									ret := -0.080000
							if( bullPower > -0.36184 )
								if( bearPower <= -0.480838 )
									ret := 0.741176 // buy
								if( bearPower > -0.480838 )
									ret := 0.470085
					if( tema > 19.2824 )
						if( ema2 <= 20.2518 )
							if( ema13 <= -0.119092 )
								if( ema2 <= 19.9442 )
									ret := 0.307692
								if( ema2 > 19.9442 )
									ret := -0.769231 // sell
							if( ema13 > -0.119092 )
								if( ema3 <= 19.7388 )
									ret := -0.750000 // sell
								if( ema3 > 19.7388 )
									ret := -1.000000 // sell
						if( ema2 > 20.2518 )
							if( tema <= 20.5946 )
								if( bullPower <= -0.324819 )
									ret := -0.181818
								if( bullPower > -0.324819 )
									ret := 0.805970 // buy
							if( tema > 20.5946 )
								if( ema2 <= 20.9973 )
									ret := -1.000000 // sell
								if( ema2 > 20.9973 )
									ret := -0.166667
			if( bearPower > -0.381694 )
				if( ema13 <= -0.02482 )
					if( bullPower <= 0.083859 )
						if( ema3 <= 6.53137 )
							if( bbp <= -0.093401 )
								if( bearPower <= -0.117301 )
									ret := 0.166667
								if( bearPower > -0.117301 )
									ret := -0.875000 // sell
							if( bbp > -0.093401 )
								if( bullPower <= 0.003194 )
									ret := 0.692308
								if( bullPower > 0.003194 )
									ret := -0.600000
						if( ema3 > 6.53137 )
							if( bbm <= 0.281696 )
								if( ema2 <= 6.97752 )
									ret := 0.208900
								if( ema2 > 6.97752 )
									ret := 0.097362
							if( bbm > 0.281696 )
								if( bearPower <= -0.369548 )
									ret := -0.083333
								if( bearPower > -0.369548 )
									ret := 0.576923
					if( bullPower > 0.083859 )
						if( tema <= 13.2079 )
							if( ema13 <= -0.100439 )
								if( ema2 <= 8.51585 )
									ret := 0.900000 // buy
								if( ema2 > 8.51585 )
									ret := 0.375000
							if( ema13 > -0.100439 )
								if( bullPower <= 0.197723 )
									ret := 0.142857
								if( bullPower > 0.197723 )
									ret := -1.000000 // sell
						if( tema > 13.2079 )
							if( tema <= 14.306 )
								if( ema2 <= 13.586 )
									ret := -0.500000
								if( ema2 > 13.586 )
									ret := -0.882353 // sell
							if( tema > 14.306 )
								if( bbp <= -0.029718 )
									ret := -0.638889
								if( bbp > -0.029718 )
									ret := -0.079365
				if( ema13 > -0.02482 )
					if( ema3 <= 15.0278 )
						if( bullPower <= -0.00201 )
							if( bbp <= -0.188816 )
								if( bullPower <= -0.079459 )
									ret := 0.600000
								if( bullPower > -0.079459 )
									ret := -0.309091
							if( bbp > -0.188816 )
								if( bbp <= -0.164802 )
									ret := 0.363636
								if( bbp > -0.164802 )
									ret := -0.012111
						if( bullPower > -0.00201 )
							if( tema <= 13.3445 )
								if( ema2 <= 13.2549 )
									ret := 0.133808
								if( ema2 > 13.2549 )
									ret := -0.769231 // sell
							if( tema > 13.3445 )
								if( ema12 <= -0.028264 )
									ret := -0.833333 // sell
								if( ema12 > -0.028264 )
									ret := 0.294007
					if( ema3 > 15.0278 )
						if( ema13 <= 0.240251 )
							if( tema <= 15.5934 )
								if( tema <= 15.3517 )
									ret := -0.104478
								if( tema > 15.3517 )
									ret := -0.561905
							if( tema > 15.5934 )
								if( ema3 <= 15.9904 )
									ret := 0.362205
								if( ema3 > 15.9904 )
									ret := -0.149701
						if( ema13 > 0.240251 )
							if( bbp <= -0.059072 )
								ret := 1.000000 // buy
							if( bbp > -0.059072 )
								if( ema12 <= 0.117549 )
									ret := 0.444444
								if( ema12 > 0.117549 )
									ret := 1.000000 // buy
	if( bearPower > -0.066973 )
		if( ema3 <= 5.09386 )
			if( bullPower <= 0.046817 )
				if( bbm <= 0.016102 )
					if( bbp <= 0.004038 )
						ret := 0.000000
					if( bbp > 0.004038 )
						ret := 0.250000
				if( bbm > 0.016102 )
					if( ema3 <= 5.06143 )
						if( tema <= 5.00077 )
							ret := 1.000000 // buy
						if( tema > 5.00077 )
							if( ema1 <= 5.02426 )
								if( ema13 <= -0.012001 )
									ret := 0.250000
								if( ema13 > -0.012001 )
									ret := 0.750000 // buy
							if( ema1 > 5.02426 )
								if( bbp <= 0.038442 )
									ret := 1.000000 // buy
								if( bbp > 0.038442 )
									ret := 0.900000 // buy
					if( ema3 > 5.06143 )
						if( bbm <= 0.053448 )
							if( tema <= 5.10763 )
								if( ema1 <= 5.0623 )
									ret := 0.840000 // buy
								if( ema1 > 5.0623 )
									ret := 0.250000
							if( tema > 5.10763 )
								ret := 1.000000 // buy
						if( bbm > 0.053448 )
							ret := -0.500000
			if( bullPower > 0.046817 )
				if( ema3 <= 5.05412 )
					if( bbm <= 0.05024 )
						ret := -1.000000 // sell
					if( bbm > 0.05024 )
						ret := -0.500000
				if( ema3 > 5.05412 )
					if( ema12 <= 0.029789 )
						if( ema12 <= 0.025665 )
							ret := 0.500000
						if( ema12 > 0.025665 )
							ret := -0.750000 // sell
					if( ema12 > 0.029789 )
						ret := 0.800000 // buy
		if( ema3 > 5.09386 )
			if( ema1 <= 20.5233 )
				if( ema2 <= 5.94121 )
					if( ema1 <= 5.89492 )
						if( ema12 <= 0.042133 )
							if( bbm <= 0.085418 )
								if( bbp <= -0.051203 )
									ret := 0.336788
								if( bbp > -0.051203 )
									ret := 0.033031
							if( bbm > 0.085418 )
								if( bbm <= 0.165073 )
									ret := -0.843750 // sell
								if( bbm > 0.165073 )
									ret := 1.000000 // buy
						if( ema12 > 0.042133 )
							if( bbp <= 0.384865 )
								if( bbm <= 0.034203 )
									ret := 0.058824
								if( bbm > 0.034203 )
									ret := 0.739130 // buy
							if( bbp > 0.384865 )
								ret := -0.857143 // sell
					if( ema1 > 5.89492 )
						if( ema3 <= 5.91399 )
							if( bullPower <= 0.276111 )
								if( bbm <= 0.0085 )
									ret := 0.000000
								if( bbm > 0.0085 )
									ret := 0.708333 // buy
							if( bullPower > 0.276111 )
								ret := -1.000000 // sell
						if( ema3 > 5.91399 )
							if( bbm <= 0.015206 )
								if( ema12 <= 0.012578 )
									ret := 0.000000
								if( ema12 > 0.012578 )
									ret := -0.727273 // sell
							if( bbm > 0.015206 )
								if( tema <= 5.93787 )
									ret := 0.147727
								if( tema > 5.93787 )
									ret := 0.536232
				if( ema2 > 5.94121 )
					if( ema12 <= 0.144145 )
						if( bbp <= 0.199765 )
							if( ema3 <= 6.00148 )
								if( ema13 <= -0.036763 )
									ret := -0.702128 // sell
								if( ema13 > -0.036763 )
									ret := -0.089528
							if( ema3 > 6.00148 )
								if( ema3 <= 6.15037 )
									ret := 0.110039
								if( ema3 > 6.15037 )
									ret := 0.023612
						if( bbp > 0.199765 )
							if( bbm <= 0.11779 )
								if( ema3 <= 11.1946 )
									ret := -0.194486
								if( ema3 > 11.1946 )
									ret := -0.045306
							if( bbm > 0.11779 )
								if( ema3 <= 20.3377 )
									ret := 0.037362
								if( ema3 > 20.3377 )
									ret := -0.818182 // sell
					if( ema12 > 0.144145 )
						if( ema3 <= 11.5652 )
							if( ema13 <= 0.380199 )
								if( ema13 <= 0.30765 )
									ret := 0.513812
								if( ema13 > 0.30765 )
									ret := 0.007752
							if( ema13 > 0.380199 )
								if( ema2 <= 8.16276 )
									ret := 0.304348
								if( ema2 > 8.16276 )
									ret := 0.894118 // buy
						if( ema3 > 11.5652 )
							if( ema2 <= 17.3927 )
								if( ema3 <= 16.8485 )
									ret := -0.008602
								if( ema3 > 16.8485 )
									ret := -0.706897 // sell
							if( ema2 > 17.3927 )
								if( ema3 <= 17.8576 )
									ret := 0.907692 // buy
								if( ema3 > 17.8576 )
									ret := 0.112360
			if( ema1 > 20.5233 )
				if( bullPower <= 0.284799 )
					if( tema <= 20.5634 )
						if( ema1 <= 20.539 )
							if( ema12 <= 0.00103 )
								ret := -0.500000
							if( ema12 > 0.00103 )
								ret := 0.000000
						if( ema1 > 20.539 )
							if( bbm <= 0.098375 )
								ret := 0.750000 // buy
							if( bbm > 0.098375 )
								ret := 1.000000 // buy
					if( tema > 20.5634 )
						if( ema3 <= 20.5181 )
							if( ema2 <= 20.467 )
								ret := 0.333333
							if( ema2 > 20.467 )
								if( ema3 <= 20.4307 )
									ret := -0.500000
								if( ema3 > 20.4307 )
									ret := -0.940299 // sell
						if( ema3 > 20.5181 )
							if( tema <= 21.2897 )
								if( ema3 <= 20.971 )
									ret := -0.405063
								if( ema3 > 20.971 )
									ret := 0.238095
							if( tema > 21.2897 )
								if( ema13 <= 0.060171 )
									ret := -0.875000 // sell
								if( ema13 > 0.060171 )
									ret := -0.519231
				if( bullPower > 0.284799 )
					if( tema <= 21.3192 )
						if( bbp <= 0.497554 )
							if( ema2 <= 20.4513 )
								ret := 1.000000 // buy
							if( ema2 > 20.4513 )
								if( bbm <= 0.1965 )
									ret := -0.800000 // sell
								if( bbm > 0.1965 )
									ret := 0.555556
						if( bbp > 0.497554 )
							if( bullPower <= 0.383085 )
								if( ema3 <= 20.5986 )
									ret := 1.000000 // buy
								if( ema3 > 20.5986 )
									ret := 0.750000 // buy
							if( bullPower > 0.383085 )
								if( bbm <= 0.248338 )
									ret := -0.142857
								if( bbm > 0.248338 )
									ret := 0.750000 // buy
					if( tema > 21.3192 )
						if( bullPower <= 0.395147 )
							if( ema13 <= 0.371542 )
								ret := -0.500000
							if( ema13 > 0.371542 )
								ret := 0.800000 // buy
						if( bullPower > 0.395147 )
							if( tema <= 21.6796 )
								if( ema3 <= 20.9306 )
									ret := -0.200000
								if( ema3 > 20.9306 )
									ret := -1.000000 // sell
							if( tema > 21.6796 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_1f5f29e0(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


