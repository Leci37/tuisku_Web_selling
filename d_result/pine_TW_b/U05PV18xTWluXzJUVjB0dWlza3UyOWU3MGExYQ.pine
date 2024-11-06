//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: SNOW_1Min_2TV0_29e70a1a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2TV0_29e70a1a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_29e70a1a(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP_VIM <= 0.856739 )
		if( VIM <= 3.49462 )
			if( tema <= 109.648 )
				if( ema2 <= 108.984 )
					if( VIP_VIM <= 0.223699 )
						if( tema <= 107.696 )
							if( ema12 <= -0.164614 )
								ret := 1.000000 // buy
							if( ema12 > -0.164614 )
								if( tema <= 107.426 )
									ret := 0.720000 // buy
								if( tema > 107.426 )
									ret := -0.291667
						if( tema > 107.696 )
							if( VIP <= 1.11513 )
								if( VIP_VIM <= -0.252959 )
									ret := -0.476744
								if( VIP_VIM > -0.252959 )
									ret := -0.100000
							if( VIP > 1.11513 )
								if( VIM <= 2.0649 )
									ret := -0.862745 // sell
								if( VIM > 2.0649 )
									ret := -0.090909
					if( VIP_VIM > 0.223699 )
						if( ema12 <= 0.004676 )
							ret := -0.714286 // sell
						if( ema12 > 0.004676 )
							if( ema3 <= 108.813 )
								if( VIP_VIM <= 0.571865 )
									ret := 0.728155 // buy
								if( VIP_VIM > 0.571865 )
									ret := 0.362069
							if( ema3 > 108.813 )
								ret := 1.000000 // buy
				if( ema2 > 108.984 )
					if( ema2 <= 109.685 )
						if( ema3 <= 109.219 )
							if( VIM <= 0.729469 )
								ret := -0.105263
							if( VIM > 0.729469 )
								if( ema2 <= 109.093 )
									ret := 0.575758
								if( ema2 > 109.093 )
									ret := 0.854167 // buy
						if( ema3 > 109.219 )
							if( ema2 <= 109.177 )
								if( tema <= 108.935 )
									ret := -0.666667
								if( tema > 108.935 )
									ret := -1.000000 // sell
							if( ema2 > 109.177 )
								if( ema2 <= 109.419 )
									ret := 0.406475
								if( ema2 > 109.419 )
									ret := 0.121951
					if( ema2 > 109.685 )
						if( ema3 <= 109.889 )
							if( VIP <= 0.84424 )
								if( ema13 <= -0.243213 )
									ret := 0.750000 // buy
								if( ema13 > -0.243213 )
									ret := 0.076923
							if( VIP > 0.84424 )
								if( tema <= 109.594 )
									ret := 0.938462 // buy
								if( tema > 109.594 )
									ret := 0.738095 // buy
						if( ema3 > 109.889 )
							if( ema12 <= -0.299064 )
								if( ema1 <= 109.99 )
									ret := 0.905405 // buy
								if( ema1 > 109.99 )
									ret := 0.250000
							if( ema12 > -0.299064 )
								if( tema <= 109.456 )
									ret := -0.283019
								if( tema > 109.456 )
									ret := 0.566667
			if( tema > 109.648 )
				if( ema2 <= 137.128 )
					if( ema2 <= 136.583 )
						if( ema12 <= -0.256846 )
							if( ema13 <= -1.66855 )
								if( ema12 <= -2.18978 )
									ret := 0.809524 // buy
								if( ema12 > -2.18978 )
									ret := -0.715447 // sell
							if( ema13 > -1.66855 )
								if( VIP <= 0.576797 )
									ret := -0.249057
								if( VIP > 0.576797 )
									ret := 0.306871
						if( ema12 > -0.256846 )
							if( ema3 <= 136.129 )
								if( ema13 <= -0.134935 )
									ret := -0.051091
								if( ema13 > -0.134935 )
									ret := 0.014317
							if( ema3 > 136.129 )
								if( VIM <= 0.855041 )
									ret := 0.350000
								if( VIM > 0.855041 )
									ret := -0.429150
					if( ema2 > 136.583 )
						if( ema13 <= -0.640274 )
							if( VIM <= 1.36709 )
								ret := 1.000000 // buy
							if( VIM > 1.36709 )
								ret := -0.777778 // sell
						if( ema13 > -0.640274 )
							if( VIP_VIM <= -0.758043 )
								if( VIP_VIM <= -0.778361 )
									ret := -0.222222
								if( VIP_VIM > -0.778361 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.758043 )
								if( ema2 <= 136.779 )
									ret := 0.111111
								if( ema2 > 136.779 )
									ret := 0.348950
				if( ema2 > 137.128 )
					if( ema13 <= 0.504588 )
						if( ema3 <= 141.48 )
							if( ema1 <= 136.889 )
								ret := 1.000000 // buy
							if( ema1 > 136.889 )
								if( VIP <= 0.987203 )
									ret := -0.331343
								if( VIP > 0.987203 )
									ret := -0.081064
						if( ema3 > 141.48 )
							if( ema2 <= 141.591 )
								if( ema2 <= 141.4 )
									ret := -0.666667
								if( ema2 > 141.4 )
									ret := 0.411985
							if( ema2 > 141.591 )
								if( ema3 <= 154.99 )
									ret := -0.072194
								if( ema3 > 154.99 )
									ret := 0.007990
					if( ema13 > 0.504588 )
						if( ema3 <= 157.169 )
							if( ema1 <= 149.521 )
								if( tema <= 141.128 )
									ret := 0.069307
								if( tema > 141.128 )
									ret := -0.828571 // sell
							if( ema1 > 149.521 )
								if( ema1 <= 150.78 )
									ret := 0.925926 // buy
								if( ema1 > 150.78 )
									ret := 0.057692
						if( ema3 > 157.169 )
							if( VIM <= 1.16999 )
								if( VIP <= 1.37781 )
									ret := -0.663551
								if( VIP > 1.37781 )
									ret := -0.961538 // sell
							if( VIM > 1.16999 )
								if( ema2 <= 169.396 )
									ret := 0.700000 // buy
								if( ema2 > 169.396 )
									ret := -0.935484 // sell
		if( VIM > 3.49462 )
			if( ema12 <= 0.017344 )
				if( ema2 <= 143.867 )
					if( ema1 <= 113.708 )
						if( ema12 <= -0.055872 )
							if( ema2 <= 109.018 )
								ret := -0.476190
							if( ema2 > 109.018 )
								if( ema13 <= -0.928227 )
									ret := -0.400000
								if( ema13 > -0.928227 )
									ret := 0.558974
						if( ema12 > -0.055872 )
							if( tema <= 112.048 )
								if( ema1 <= 110.287 )
									ret := 0.228571
								if( ema1 > 110.287 )
									ret := -0.319444
							if( tema > 112.048 )
								if( ema13 <= 0.024643 )
									ret := 0.220513
								if( ema13 > 0.024643 )
									ret := 0.837209 // buy
					if( ema1 > 113.708 )
						if( ema3 <= 116.155 )
							if( ema12 <= -0.127436 )
								if( tema <= 113.621 )
									ret := 0.454545
								if( tema > 113.621 )
									ret := -0.839080 // sell
							if( ema12 > -0.127436 )
								if( ema13 <= 0.029954 )
									ret := -0.163636
								if( ema13 > 0.029954 )
									ret := 0.842105 // buy
						if( ema3 > 116.155 )
							if( ema1 <= 143.199 )
								if( VIP <= 3.30438 )
									ret := -0.340000
								if( VIP > 3.30438 )
									ret := 0.189691
							if( ema1 > 143.199 )
								if( ema13 <= -0.089584 )
									ret := -0.400000
								if( ema13 > -0.089584 )
									ret := -0.920000 // sell
				if( ema2 > 143.867 )
					if( ema2 <= 169.911 )
						if( ema1 <= 147.775 )
							if( ema2 <= 147.327 )
								if( VIP_VIM <= -0.861686 )
									ret := 0.372881
								if( VIP_VIM > -0.861686 )
									ret := 0.837838 // buy
							if( ema2 > 147.327 )
								ret := 1.000000 // buy
						if( ema1 > 147.775 )
							if( ema1 <= 151.803 )
								if( VIP <= 3.62117 )
									ret := -1.000000 // sell
								if( VIP > 3.62117 )
									ret := -0.231405
							if( ema1 > 151.803 )
								if( ema3 <= 156.486 )
									ret := 0.631313
								if( ema3 > 156.486 )
									ret := 0.332518
					if( ema2 > 169.911 )
						ret := -1.000000 // sell
			if( ema12 > 0.017344 )
				if( ema2 <= 130.075 )
					if( ema2 <= 122.396 )
						if( VIP <= 6.07055 )
							if( VIP <= 4.87353 )
								if( VIM <= 4.05904 )
									ret := 0.338028
								if( VIM > 4.05904 )
									ret := -0.276316
							if( VIP > 4.87353 )
								if( VIP <= 5.13833 )
									ret := 0.942029 // buy
								if( VIP > 5.13833 )
									ret := 0.265306
						if( VIP > 6.07055 )
							if( ema1 <= 109.255 )
								if( ema3 <= 108.292 )
									ret := 0.555556
								if( ema3 > 108.292 )
									ret := 1.000000 // buy
							if( ema1 > 109.255 )
								if( ema2 <= 110.383 )
									ret := -0.738318 // sell
								if( ema2 > 110.383 )
									ret := -0.104478
					if( ema2 > 122.396 )
						if( VIP_VIM <= -1.25941 )
							if( VIM <= 11.367 )
								ret := -0.333333
							if( VIM > 11.367 )
								if( ema1 <= 128.474 )
									ret := 0.500000
								if( ema1 > 128.474 )
									ret := 0.666667
						if( VIP_VIM > -1.25941 )
							if( VIP <= 11.386 )
								if( ema2 <= 128.046 )
									ret := -0.608911
								if( ema2 > 128.046 )
									ret := -0.392857
							if( VIP > 11.386 )
								if( VIP <= 12.1504 )
									ret := 0.909091 // buy
								if( VIP > 12.1504 )
									ret := -0.400000
				if( ema2 > 130.075 )
					if( ema3 <= 130.388 )
						if( ema2 <= 130.358 )
							ret := 0.687500
						if( ema2 > 130.358 )
							if( VIP_VIM <= 0.210871 )
								ret := 0.916667 // buy
							if( VIP_VIM > 0.210871 )
								ret := 1.000000 // buy
					if( ema3 > 130.388 )
						if( VIM <= 58.4598 )
							if( VIM <= 5.8804 )
								if( VIP <= 5.35069 )
									ret := 0.066158
								if( VIP > 5.35069 )
									ret := -0.456000
							if( VIM > 5.8804 )
								if( ema1 <= 131.399 )
									ret := -0.525424
								if( ema1 > 131.399 )
									ret := 0.272346
						if( VIM > 58.4598 )
							if( VIP <= 252.956 )
								if( ema3 <= 145.279 )
									ret := -0.037037
								if( ema3 > 145.279 )
									ret := -0.888889 // sell
							if( VIP > 252.956 )
								if( ema13 <= 0.069361 )
									ret := 0.066667
								if( ema13 > 0.069361 )
									ret := 0.619048
	if( VIP_VIM > 0.856739 )
		if( VIP <= 25.4422 )
			if( VIP_VIM <= 1.54033 )
				if( ema1 <= 159.063 )
					if( ema2 <= 113.174 )
						if( ema13 <= -0.007074 )
							if( ema3 <= 109.964 )
								ret := 0.782609 // buy
							if( ema3 > 109.964 )
								if( ema12 <= -0.025831 )
									ret := 0.615385
								if( ema12 > -0.025831 )
									ret := -0.583333
						if( ema13 > -0.007074 )
							if( tema <= 113.123 )
								if( ema13 <= 0.384034 )
									ret := -0.457364
								if( ema13 > 0.384034 )
									ret := -0.117647
							if( tema > 113.123 )
								if( ema12 <= 0.54783 )
									ret := -0.976744 // sell
								if( ema12 > 0.54783 )
									ret := -0.714286 // sell
					if( ema2 > 113.174 )
						if( VIP <= 3.3186 )
							if( ema2 <= 114.082 )
								if( ema3 <= 113.199 )
									ret := 0.838710 // buy
								if( ema3 > 113.199 )
									ret := 0.333333
							if( ema2 > 114.082 )
								if( ema1 <= 158.254 )
									ret := -0.013809
								if( ema1 > 158.254 )
									ret := 0.750000 // buy
						if( VIP > 3.3186 )
							if( tema <= 113.414 )
								ret := 0.714286 // buy
							if( tema > 113.414 )
								if( VIM <= 12.1552 )
									ret := -0.315488
								if( VIM > 12.1552 )
									ret := 0.041096
				if( ema1 > 159.063 )
					if( ema1 <= 159.676 )
						if( ema12 <= 0.104577 )
							ret := -0.500000
						if( ema12 > 0.104577 )
							ret := -1.000000 // sell
					if( ema1 > 159.676 )
						if( ema2 <= 159.498 )
							ret := 0.000000
						if( ema2 > 159.498 )
							if( ema13 <= 0.169647 )
								ret := -0.058824
							if( ema13 > 0.169647 )
								if( VIM <= 0.596749 )
									ret := -0.306122
								if( VIM > 0.596749 )
									ret := -0.828125 // sell
			if( VIP_VIM > 1.54033 )
				if( ema3 <= 114.086 )
					if( ema3 <= 109.616 )
						ret := 0.833333 // buy
					if( ema3 > 109.616 )
						if( ema13 <= -0.064551 )
							ret := 1.000000 // buy
						if( ema13 > -0.064551 )
							if( ema2 <= 112.626 )
								if( ema13 <= 0.040059 )
									ret := -0.066667
								if( ema13 > 0.040059 )
									ret := -0.866667 // sell
							if( ema2 > 112.626 )
								if( ema13 <= 0.162095 )
									ret := 0.259259
								if( ema13 > 0.162095 )
									ret := -0.625000
				if( ema3 > 114.086 )
					if( VIM <= 9.91294 )
						if( VIP_VIM <= 1.97965 )
							if( ema1 <= 158.315 )
								if( ema13 <= 0.009229 )
									ret := -0.075000
								if( ema13 > 0.009229 )
									ret := -0.706215 // sell
							if( ema1 > 158.315 )
								if( ema3 <= 158.626 )
									ret := 0.833333 // buy
								if( ema3 > 158.626 )
									ret := -0.628571
						if( VIP_VIM > 1.97965 )
							if( ema2 <= 135.332 )
								if( ema2 <= 126.707 )
									ret := 0.142857
								if( ema2 > 126.707 )
									ret := -0.888889 // sell
							if( ema2 > 135.332 )
								ret := 0.263158
					if( VIM > 9.91294 )
						if( tema <= 128.016 )
							ret := -1.000000 // sell
						if( tema > 128.016 )
							if( ema1 <= 141.827 )
								if( ema2 <= 131.333 )
									ret := -0.181818
								if( ema2 > 131.333 )
									ret := 0.000000
							if( ema1 > 141.827 )
								if( ema13 <= 0.057429 )
									ret := -0.916667 // sell
								if( ema13 > 0.057429 )
									ret := -0.416667
		if( VIP > 25.4422 )
			if( VIP <= 135.743 )
				if( ema13 <= 0.171151 )
					if( ema3 <= 109.168 )
						ret := 1.000000 // buy
					if( ema3 > 109.168 )
						if( VIP_VIM <= 1.00033 )
							if( VIM <= 39.8701 )
								ret := -0.428571
							if( VIM > 39.8701 )
								ret := 0.333333
						if( VIP_VIM > 1.00033 )
							if( ema2 <= 110.493 )
								ret := 0.000000
							if( ema2 > 110.493 )
								if( ema12 <= 0.023471 )
									ret := 0.714286 // buy
								if( ema12 > 0.023471 )
									ret := 0.243243
				if( ema13 > 0.171151 )
					if( VIM <= 37.9043 )
						if( VIP_VIM <= 1.27451 )
							ret := 0.666667
						if( VIP_VIM > 1.27451 )
							ret := 0.133333
					if( VIM > 37.9043 )
						if( VIP <= 49.2527 )
							if( ema1 <= 156.963 )
								ret := -1.000000 // sell
							if( ema1 > 156.963 )
								ret := -0.545455
						if( VIP > 49.2527 )
							if( ema1 <= 124.554 )
								ret := 0.533333
							if( ema1 > 124.554 )
								if( ema1 <= 127.797 )
									ret := -0.666667
								if( ema1 > 127.797 )
									ret := 0.272727
			if( VIP > 135.743 )
				if( ema3 <= 127.21 )
					if( VIP <= 346.612 )
						ret := 0.000000
					if( VIP > 346.612 )
						ret := 0.785714 // buy
				if( ema3 > 127.21 )
					if( tema <= 157.253 )
						if( VIM <= 235.755 )
							if( ema1 <= 137.366 )
								ret := -1.000000 // sell
							if( ema1 > 137.366 )
								if( tema <= 139.537 )
									ret := -0.833333 // sell
								if( tema > 139.537 )
									ret := -1.000000 // sell
						if( VIM > 235.755 )
							ret := -0.562500
					if( tema > 157.253 )
						ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_29e70a1a(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)

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


