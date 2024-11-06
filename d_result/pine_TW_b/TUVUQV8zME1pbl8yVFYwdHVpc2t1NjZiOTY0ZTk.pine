//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: META_30Min_2TV0_66b964e9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2TV0_66b964e9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_66b964e9(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ema12 <= -0.102622 )
		if( ema1 <= 159.6 )
			if( tema <= 93.1058 )
				if( tema <= 89.4848 )
					if( ema3 <= 89.6094 )
						ret := 1.000000 // buy
					if( ema3 > 89.6094 )
						ret := 0.600000
				if( tema > 89.4848 )
					if( ema13 <= -1.19195 )
						if( ema2 <= 93.3735 )
							ret := 0.400000
						if( ema2 > 93.3735 )
							ret := -0.210526
					if( ema13 > -1.19195 )
						if( ema12 <= -0.554489 )
							ret := -0.625000
						if( ema12 > -0.554489 )
							if( VIM <= 1.37876 )
								ret := -1.000000 // sell
							if( VIM > 1.37876 )
								ret := -0.818182 // sell
			if( tema > 93.1058 )
				if( VIP_VIM <= -0.254426 )
					if( ema12 <= -1.06723 )
						if( VIP <= 0.783797 )
							if( tema <= 106.722 )
								if( ema2 <= 108.278 )
									ret := -0.250000
								if( ema2 > 108.278 )
									ret := -0.960000 // sell
							if( tema > 106.722 )
								if( VIM <= 1.39359 )
									ret := 0.400000
								if( VIM > 1.39359 )
									ret := -0.219512
						if( VIP > 0.783797 )
							if( VIP_VIM <= -0.395049 )
								if( VIM <= 1.21185 )
									ret := 0.250000
								if( VIM > 1.21185 )
									ret := 0.857143 // buy
							if( VIP_VIM > -0.395049 )
								if( VIP <= 0.858028 )
									ret := -0.108108
								if( VIP > 0.858028 )
									ret := 0.775862 // buy
					if( ema12 > -1.06723 )
						if( VIP <= 0.668723 )
							if( ema2 <= 151.856 )
								if( ema2 <= 130.194 )
									ret := -0.385135
								if( ema2 > 130.194 )
									ret := 0.305263
							if( ema2 > 151.856 )
								if( ema3 <= 155.201 )
									ret := -0.931034 // sell
								if( ema3 > 155.201 )
									ret := -0.631579
						if( VIP > 0.668723 )
							if( ema1 <= 157.302 )
								if( ema1 <= 154.942 )
									ret := 0.070234
								if( ema1 > 154.942 )
									ret := -0.517241
							if( ema1 > 157.302 )
								if( VIM <= 1.17093 )
									ret := 0.797101 // buy
								if( VIM > 1.17093 )
									ret := 0.169811
				if( VIP_VIM > -0.254426 )
					if( ema3 <= 135.684 )
						if( tema <= 133.294 )
							if( ema12 <= -0.547309 )
								if( VIP_VIM <= -0.047278 )
									ret := -0.436782
								if( VIP_VIM > -0.047278 )
									ret := 0.909091 // buy
							if( ema12 > -0.547309 )
								if( tema <= 94.4788 )
									ret := 0.952381 // buy
								if( tema > 94.4788 )
									ret := 0.220351
						if( tema > 133.294 )
							if( VIP <= 0.934711 )
								if( tema <= 134.439 )
									ret := 0.500000
								if( tema > 134.439 )
									ret := -0.166667
							if( VIP > 0.934711 )
								if( ema12 <= -0.215656 )
									ret := -0.857143 // sell
								if( ema12 > -0.215656 )
									ret := -0.272727
					if( ema3 > 135.684 )
						if( ema3 <= 138.89 )
							if( VIM <= 1.0092 )
								ret := -0.400000
							if( VIM > 1.0092 )
								if( ema12 <= -0.571092 )
									ret := 0.461538
								if( ema12 > -0.571092 )
									ret := 0.836364 // buy
						if( ema3 > 138.89 )
							if( ema3 <= 141.742 )
								if( VIP <= 0.896424 )
									ret := -0.800000 // sell
								if( VIP > 0.896424 )
									ret := 0.012048
							if( ema3 > 141.742 )
								if( tema <= 146.317 )
									ret := 0.532710
								if( tema > 146.317 )
									ret := 0.189858
		if( ema1 > 159.6 )
			if( VIM <= 1.0127 )
				if( ema12 <= -1.6626 )
					if( VIP <= 0.97098 )
						if( ema13 <= -4.44539 )
							ret := 0.666667
						if( ema13 > -4.44539 )
							ret := 0.062500
					if( VIP > 0.97098 )
						ret := 0.952381 // buy
				if( ema12 > -1.6626 )
					if( ema2 <= 160.79 )
						ret := -1.000000 // sell
					if( ema2 > 160.79 )
						if( ema2 <= 161.85 )
							if( VIM <= 0.987077 )
								ret := 0.714286 // buy
							if( VIM > 0.987077 )
								ret := 1.000000 // buy
						if( ema2 > 161.85 )
							if( ema1 <= 472.126 )
								if( ema1 <= 467.912 )
									ret := -0.071429
								if( ema1 > 467.912 )
									ret := 0.769231 // buy
							if( ema1 > 472.126 )
								if( VIM <= 0.966981 )
									ret := -0.750000 // sell
								if( VIM > 0.966981 )
									ret := -0.185567
			if( VIM > 1.0127 )
				if( ema13 <= -2.05961 )
					if( ema3 <= 236.998 )
						if( tema <= 162.9 )
							if( ema2 <= 162.846 )
								if( ema3 <= 163.182 )
									ret := -0.380952
								if( ema3 > 163.182 )
									ret := 0.615385
							if( ema2 > 162.846 )
								if( ema13 <= -4.36473 )
									ret := 0.000000
								if( ema13 > -4.36473 )
									ret := -0.863309 // sell
						if( tema > 162.9 )
							if( VIM <= 1.59731 )
								if( ema2 <= 168.038 )
									ret := 0.436364
								if( ema2 > 168.038 )
									ret := -0.152841
							if( VIM > 1.59731 )
								if( VIP <= 1.19778 )
									ret := 0.500000
								if( VIP > 1.19778 )
									ret := 1.000000 // buy
					if( ema3 > 236.998 )
						if( tema <= 239.836 )
							if( ema13 <= -3.74823 )
								if( ema3 <= 245.885 )
									ret := 1.000000 // buy
								if( ema3 > 245.885 )
									ret := 0.722222 // buy
							if( ema13 > -3.74823 )
								if( ema12 <= -1.51654 )
									ret := -0.142857
								if( ema12 > -1.51654 )
									ret := 0.931034 // buy
						if( tema > 239.836 )
							if( ema2 <= 253.343 )
								if( ema2 <= 248.346 )
									ret := 0.117647
								if( ema2 > 248.346 )
									ret := -0.803571 // sell
							if( ema2 > 253.343 )
								if( ema3 <= 260.697 )
									ret := 0.802817 // buy
								if( ema3 > 260.697 )
									ret := 0.047985
				if( ema13 > -2.05961 )
					if( VIP <= 1.37395 )
						if( ema2 <= 314.085 )
							if( ema2 <= 237.387 )
								if( ema3 <= 236.534 )
									ret := 0.073694
								if( ema3 > 236.534 )
									ret := -0.862500 // sell
							if( ema2 > 237.387 )
								if( ema3 <= 267.801 )
									ret := 0.317782
								if( ema3 > 267.801 )
									ret := 0.148101
						if( ema2 > 314.085 )
							if( tema <= 323.037 )
								if( ema1 <= 318.038 )
									ret := 0.015075
								if( ema1 > 318.038 )
									ret := -0.498008
							if( tema > 323.037 )
								if( tema <= 324.909 )
									ret := 0.712644 // buy
								if( tema > 324.909 )
									ret := 0.038013
					if( VIP > 1.37395 )
						if( ema13 <= -0.507363 )
							if( ema3 <= 185.403 )
								if( VIM <= 1.70961 )
									ret := 0.974359 // buy
								if( VIM > 1.70961 )
									ret := 0.761905 // buy
							if( ema3 > 185.403 )
								if( ema12 <= -0.328981 )
									ret := 0.525862
								if( ema12 > -0.328981 )
									ret := -0.272727
						if( ema13 > -0.507363 )
							if( VIP_VIM <= 0.225908 )
								if( VIM <= 1.73862 )
									ret := 0.507042
								if( VIM > 1.73862 )
									ret := -0.192308
							if( VIP_VIM > 0.225908 )
								if( ema13 <= -0.233888 )
									ret := -0.535714
								if( ema13 > -0.233888 )
									ret := 0.230769
	if( ema12 > -0.102622 )
		if( VIP_VIM <= 0.423065 )
			if( ema2 <= 359.098 )
				if( ema3 <= 348.438 )
					if( ema13 <= 2.74695 )
						if( tema <= 95.2463 )
							if( ema2 <= 95.0036 )
								if( ema3 <= 89.4845 )
									ret := -0.416667
								if( ema3 > 89.4845 )
									ret := 0.653465
							if( ema2 > 95.0036 )
								if( tema <= 95.0071 )
									ret := -0.700000 // sell
								if( tema > 95.0071 )
									ret := 0.000000
						if( tema > 95.2463 )
							if( tema <= 95.8963 )
								if( ema12 <= 0.359626 )
									ret := -0.878049 // sell
								if( ema12 > 0.359626 )
									ret := -0.062500
							if( tema > 95.8963 )
								if( ema13 <= -0.171411 )
									ret := -0.065173
								if( ema13 > -0.171411 )
									ret := 0.020567
					if( ema13 > 2.74695 )
						if( VIM <= 0.872784 )
							if( ema12 <= 2.71464 )
								if( ema2 <= 193.275 )
									ret := -0.849315 // sell
								if( ema2 > 193.275 )
									ret := -0.419890
							if( ema12 > 2.71464 )
								if( ema12 <= 3.20332 )
									ret := 0.500000
								if( ema12 > 3.20332 )
									ret := -0.357143
						if( VIM > 0.872784 )
							if( ema1 <= 186.135 )
								if( ema3 <= 163.27 )
									ret := -0.043478
								if( ema3 > 163.27 )
									ret := 0.931818 // buy
							if( ema1 > 186.135 )
								if( ema12 <= 2.21523 )
									ret := -0.415385
								if( ema12 > 2.21523 )
									ret := 0.428571
				if( ema3 > 348.438 )
					if( VIM <= 1.34362 )
						if( ema13 <= 0.299265 )
							if( tema <= 355.371 )
								if( ema3 <= 351.511 )
									ret := 0.280000
								if( ema3 > 351.511 )
									ret := -0.431373
							if( tema > 355.371 )
								if( ema1 <= 356.949 )
									ret := 0.888889 // buy
								if( ema1 > 356.949 )
									ret := -0.083333
						if( ema13 > 0.299265 )
							if( VIP_VIM <= 0.365091 )
								if( ema2 <= 352.188 )
									ret := -0.033333
								if( ema2 > 352.188 )
									ret := -0.536946
							if( VIP_VIM > 0.365091 )
								if( ema13 <= 1.25872 )
									ret := -0.071429
								if( ema13 > 1.25872 )
									ret := 0.900000 // buy
					if( VIM > 1.34362 )
						if( VIP_VIM <= 0.021517 )
							if( tema <= 349.084 )
								ret := -1.000000 // sell
							if( tema > 349.084 )
								if( ema3 <= 357.247 )
									ret := -0.642857
								if( ema3 > 357.247 )
									ret := -0.894737 // sell
						if( VIP_VIM > 0.021517 )
							ret := -0.111111
			if( ema2 > 359.098 )
				if( ema2 <= 498.263 )
					if( ema13 <= 1.8778 )
						if( ema1 <= 359.805 )
							if( VIM <= 0.975698 )
								ret := 0.909091 // buy
							if( VIM > 0.975698 )
								ret := 1.000000 // buy
						if( ema1 > 359.805 )
							if( VIP <= 1.2594 )
								if( ema1 <= 497.494 )
									ret := 0.013900
								if( ema1 > 497.494 )
									ret := 0.818182 // buy
							if( VIP > 1.2594 )
								if( ema12 <= 0.836303 )
									ret := 0.532258
								if( ema12 > 0.836303 )
									ret := -0.407407
					if( ema13 > 1.8778 )
						if( ema3 <= 466.943 )
							if( tema <= 470.059 )
								if( ema1 <= 451.835 )
									ret := 0.279570
								if( ema1 > 451.835 )
									ret := 0.645161
							if( tema > 470.059 )
								ret := -0.823529 // sell
						if( ema3 > 466.943 )
							if( VIM <= 0.915545 )
								if( ema3 <= 491.923 )
									ret := 0.740385 // buy
								if( ema3 > 491.923 )
									ret := 0.047619
							if( VIM > 0.915545 )
								if( ema13 <= 2.25385 )
									ret := -0.136364
								if( ema13 > 2.25385 )
									ret := 0.323529
				if( ema2 > 498.263 )
					if( tema <= 509.593 )
						if( ema13 <= 0.915805 )
							if( ema3 <= 505.498 )
								if( tema <= 503.887 )
									ret := -0.239130
								if( tema > 503.887 )
									ret := 0.276923
							if( ema3 > 505.498 )
								if( ema12 <= 0.218289 )
									ret := -0.783784 // sell
								if( ema12 > 0.218289 )
									ret := 0.000000
						if( ema13 > 0.915805 )
							if( tema <= 505.002 )
								if( VIM <= 1.04748 )
									ret := -0.811881 // sell
								if( VIM > 1.04748 )
									ret := -0.214286
							if( tema > 505.002 )
								if( ema1 <= 505.464 )
									ret := 0.571429
								if( ema1 > 505.464 )
									ret := -0.689655
					if( tema > 509.593 )
						if( ema13 <= 1.12449 )
							if( ema1 <= 515.853 )
								if( ema13 <= 0.835461 )
									ret := 0.826087 // buy
								if( ema13 > 0.835461 )
									ret := 0.468750
							if( ema1 > 515.853 )
								if( ema1 <= 521.208 )
									ret := -0.381579
								if( ema1 > 521.208 )
									ret := 0.272472
						if( ema13 > 1.12449 )
							if( ema1 <= 515.129 )
								if( ema3 <= 509.097 )
									ret := -0.055556
								if( ema3 > 509.097 )
									ret := 0.392857
							if( ema1 > 515.129 )
								if( VIP <= 1.28517 )
									ret := -0.196721
								if( VIP > 1.28517 )
									ret := -0.714286 // sell
		if( VIP_VIM > 0.423065 )
			if( VIM <= 0.41333 )
				if( VIP_VIM <= 1.18808 )
					ret := 1.000000 // buy
				if( VIP_VIM > 1.18808 )
					ret := 0.555556
			if( VIM > 0.41333 )
				if( ema12 <= 3.14378 )
					if( ema13 <= 0.40018 )
						if( ema3 <= 169.43 )
							if( VIP <= 1.2104 )
								ret := -0.769231 // sell
							if( VIP > 1.2104 )
								if( VIM <= 0.820752 )
									ret := -0.248447
								if( VIM > 0.820752 )
									ret := 0.029304
						if( ema3 > 169.43 )
							if( ema1 <= 199.592 )
								if( ema2 <= 195.393 )
									ret := 0.288136
								if( ema2 > 195.393 )
									ret := 0.933333 // buy
							if( ema1 > 199.592 )
								if( tema <= 239.431 )
									ret := -0.294118
								if( tema > 239.431 )
									ret := 0.058065
					if( ema13 > 0.40018 )
						if( VIP <= 1.38804 )
							if( VIM <= 0.613687 )
								if( ema3 <= 338.811 )
									ret := 0.391892
								if( ema3 > 338.811 )
									ret := -0.162162
							if( VIM > 0.613687 )
								if( ema1 <= 98.1597 )
									ret := -0.360656
								if( ema1 > 98.1597 )
									ret := 0.129513
						if( VIP > 1.38804 )
							if( tema <= 118.881 )
								if( VIM <= 0.523405 )
									ret := 0.866667 // buy
								if( VIM > 0.523405 )
									ret := 0.250000
							if( tema > 118.881 )
								if( ema13 <= 1.57757 )
									ret := 0.057899
								if( ema13 > 1.57757 )
									ret := -0.094545
				if( ema12 > 3.14378 )
					if( VIP <= 1.33175 )
						if( VIM <= 0.761073 )
							if( tema <= 506.759 )
								if( ema1 <= 192.276 )
									ret := -0.818182 // sell
								if( ema1 > 192.276 )
									ret := -0.213483
							if( tema > 506.759 )
								if( VIP_VIM <= 0.602406 )
									ret := -0.941176 // sell
								if( VIP_VIM > 0.602406 )
									ret := -0.454545
						if( VIM > 0.761073 )
							if( VIP_VIM <= 0.45798 )
								ret := 0.100000
							if( VIP_VIM > 0.45798 )
								ret := 0.750000 // buy
					if( VIP > 1.33175 )
						if( ema3 <= 196.456 )
							if( tema <= 182.589 )
								ret := 0.545455
							if( tema > 182.589 )
								if( VIP <= 1.42098 )
									ret := -0.769231 // sell
								if( VIP > 1.42098 )
									ret := -0.967742 // sell
						if( ema3 > 196.456 )
							if( ema13 <= 9.90886 )
								if( ema3 <= 254.014 )
									ret := 0.600000
								if( ema3 > 254.014 )
									ret := -0.035294
							if( ema13 > 9.90886 )
								if( VIP_VIM <= 0.85012 )
									ret := 0.966667 // buy
								if( VIP_VIM > 0.85012 )
									ret := 0.470588
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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



//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_META_30Min_66b964e9(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


