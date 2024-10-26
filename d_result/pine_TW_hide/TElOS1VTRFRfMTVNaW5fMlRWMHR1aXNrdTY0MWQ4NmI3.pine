//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: LINKUSDT_15Min_2TV0_641d86b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2TV0_641d86b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_641d86b7(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.031054 )
		if( ema1 <= 6.44174 )
			if( ema2 <= 6.32525 )
				if( VIM <= 1.07898 )
					if( tema <= 5.82967 )
						ret := -0.076923
					if( tema > 5.82967 )
						if( ema2 <= 6.1449 )
							if( VIP_VIM <= -0.140712 )
								ret := -0.750000 // sell
							if( VIP_VIM > -0.140712 )
								ret := -1.000000 // sell
						if( ema2 > 6.1449 )
							ret := -0.266667
				if( VIM > 1.07898 )
					if( ema1 <= 6.18518 )
						if( ema3 <= 5.89029 )
							if( ema13 <= -0.111957 )
								if( ema2 <= 5.67734 )
									ret := 0.022222
								if( ema2 > 5.67734 )
									ret := 0.863636 // buy
							if( ema13 > -0.111957 )
								if( ema13 <= -0.060739 )
									ret := 0.762500 // buy
								if( ema13 > -0.060739 )
									ret := 0.285714
						if( ema3 > 5.89029 )
							if( ema2 <= 5.9117 )
								if( VIM <= 1.1998 )
									ret := -0.245902
								if( VIM > 1.1998 )
									ret := -0.866667 // sell
							if( ema2 > 5.9117 )
								if( tema <= 5.90571 )
									ret := 0.727273 // buy
								if( tema > 5.90571 )
									ret := 0.178392
					if( ema1 > 6.18518 )
						if( ema1 <= 6.25346 )
							if( ema3 <= 6.35508 )
								if( VIP <= 0.743817 )
									ret := -0.612903
								if( VIP > 0.743817 )
									ret := 0.318182
							if( ema3 > 6.35508 )
								if( ema12 <= -0.083662 )
									ret := -1.000000 // sell
								if( ema12 > -0.083662 )
									ret := -0.750000 // sell
						if( ema1 > 6.25346 )
							if( ema3 <= 6.33973 )
								ret := 1.000000 // buy
							if( ema3 > 6.33973 )
								ret := 0.125000
			if( ema2 > 6.32525 )
				if( tema <= 6.06139 )
					ret := 1.000000 // buy
				if( tema > 6.06139 )
					if( VIP <= 0.743598 )
						if( ema3 <= 6.54155 )
							if( tema <= 6.31324 )
								if( ema3 <= 6.45051 )
									ret := -0.166667
								if( ema3 > 6.45051 )
									ret := -0.852941 // sell
							if( tema > 6.31324 )
								if( VIM <= 1.38332 )
									ret := -0.454545
								if( VIM > 1.38332 )
									ret := 1.000000 // buy
						if( ema3 > 6.54155 )
							if( VIM <= 1.35617 )
								ret := 0.222222
							if( VIM > 1.35617 )
								ret := 0.857143 // buy
					if( VIP > 0.743598 )
						if( tema <= 6.41524 )
							if( tema <= 6.2751 )
								if( tema <= 6.25236 )
									ret := 0.986111 // buy
								if( tema > 6.25236 )
									ret := 0.857143 // buy
							if( tema > 6.2751 )
								if( ema1 <= 6.36248 )
									ret := -0.275862
								if( ema1 > 6.36248 )
									ret := 0.800995 // buy
						if( tema > 6.41524 )
							ret := -0.500000
		if( ema1 > 6.44174 )
			if( ema13 <= -0.960647 )
				if( ema12 <= -0.536079 )
					ret := 1.000000 // buy
				if( ema12 > -0.536079 )
					ret := 0.818182 // buy
			if( ema13 > -0.960647 )
				if( ema13 <= -0.059967 )
					if( VIP_VIM <= -0.921221 )
						if( tema <= 6.754 )
							ret := 0.470588
						if( tema > 6.754 )
							if( ema1 <= 7.16225 )
								ret := 1.000000 // buy
							if( ema1 > 7.16225 )
								ret := 0.850000 // buy
					if( VIP_VIM > -0.921221 )
						if( ema1 <= 6.67602 )
							if( ema13 <= -0.114279 )
								if( ema3 <= 6.64381 )
									ret := 0.233333
								if( ema3 > 6.64381 )
									ret := -0.530303
							if( ema13 > -0.114279 )
								if( tema <= 6.54003 )
									ret := 0.273810
								if( tema > 6.54003 )
									ret := -0.373333
						if( ema1 > 6.67602 )
							if( ema3 <= 19.9859 )
								if( ema3 <= 15.7291 )
									ret := 0.082111
								if( ema3 > 15.7291 )
									ret := 0.190423
							if( ema3 > 19.9859 )
								if( ema1 <= 20.0248 )
									ret := -0.434146
								if( ema1 > 20.0248 )
									ret := -0.003868
				if( ema13 > -0.059967 )
					if( tema <= 7.7999 )
						if( VIM <= 1.16233 )
							if( ema13 <= -0.044838 )
								if( VIP_VIM <= -0.15807 )
									ret := 0.609848
								if( VIP_VIM > -0.15807 )
									ret := 0.000000
							if( ema13 > -0.044838 )
								if( VIM <= 1.04068 )
									ret := 0.736842 // buy
								if( VIM > 1.04068 )
									ret := -0.168831
						if( VIM > 1.16233 )
							if( ema1 <= 6.5606 )
								if( VIP_VIM <= -0.583976 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.583976 )
									ret := -0.600000
							if( ema1 > 6.5606 )
								if( ema3 <= 6.90666 )
									ret := 0.581081
								if( ema3 > 6.90666 )
									ret := -0.241007
					if( tema > 7.7999 )
						if( VIP_VIM <= -0.014734 )
							if( tema <= 20.6823 )
								if( ema2 <= 20.1055 )
									ret := -0.120648
								if( ema2 > 20.1055 )
									ret := 0.460000
							if( tema > 20.6823 )
								if( ema2 <= 21.1881 )
									ret := -1.000000 // sell
								if( ema2 > 21.1881 )
									ret := -0.090909
						if( VIP_VIM > -0.014734 )
							if( ema3 <= 20.415 )
								if( tema <= 13.7747 )
									ret := 0.605263
								if( tema > 13.7747 )
									ret := -0.375000
							if( ema3 > 20.415 )
								ret := 0.954545 // buy
	if( ema12 > -0.031054 )
		if( VIP <= 1.20536 )
			if( ema2 <= 6.96377 )
				if( ema3 <= 6.14827 )
					if( ema1 <= 6.09668 )
						if( ema13 <= 0.004767 )
							if( ema12 <= -0.026639 )
								if( tema <= 6.0009 )
									ret := 0.666667
								if( tema > 6.0009 )
									ret := -0.277778
							if( ema12 > -0.026639 )
								if( ema1 <= 5.06948 )
									ret := 0.363636
								if( ema1 > 5.06948 )
									ret := -0.034491
						if( ema13 > 0.004767 )
							if( ema3 <= 6.05373 )
								if( ema3 <= 5.93569 )
									ret := 0.188456
								if( ema3 > 5.93569 )
									ret := -0.070444
							if( ema3 > 6.05373 )
								if( ema1 <= 6.0943 )
									ret := 0.637037
								if( ema1 > 6.0943 )
									ret := -0.578947
					if( ema1 > 6.09668 )
						if( ema13 <= 0.027316 )
							if( VIP <= 0.943909 )
								if( ema12 <= -0.009145 )
									ret := 0.355263
								if( ema12 > -0.009145 )
									ret := -0.318182
							if( VIP > 0.943909 )
								if( tema <= 6.14076 )
									ret := 0.310705
								if( tema > 6.14076 )
									ret := 0.636678
						if( ema13 > 0.027316 )
							if( VIP <= 1.06013 )
								ret := -0.684211
							if( VIP > 1.06013 )
								if( tema <= 6.11661 )
									ret := 0.714286 // buy
								if( tema > 6.11661 )
									ret := -0.075676
				if( ema3 > 6.14827 )
					if( VIP <= 0.762084 )
						if( ema1 <= 6.35787 )
							if( tema <= 6.13612 )
								if( VIP_VIM <= -0.467557 )
									ret := -0.033333
								if( VIP_VIM > -0.467557 )
									ret := 0.363636
							if( tema > 6.13612 )
								if( ema2 <= 6.30343 )
									ret := -0.358025
								if( ema2 > 6.30343 )
									ret := -0.811321 // sell
						if( ema1 > 6.35787 )
							if( ema2 <= 6.7624 )
								if( tema <= 6.67013 )
									ret := 0.015152
								if( tema > 6.67013 )
									ret := 0.550000
							if( ema2 > 6.7624 )
								if( ema2 <= 6.77345 )
									ret := -1.000000 // sell
								if( ema2 > 6.77345 )
									ret := -0.225166
					if( VIP > 0.762084 )
						if( VIP <= 0.997007 )
							if( ema1 <= 6.73008 )
								if( ema12 <= -0.0144 )
									ret := 0.106667
								if( ema12 > -0.0144 )
									ret := -0.052174
							if( ema1 > 6.73008 )
								if( ema3 <= 6.85779 )
									ret := 0.241048
								if( ema3 > 6.85779 )
									ret := 0.073474
						if( VIP > 0.997007 )
							if( tema <= 6.39428 )
								if( ema12 <= 0.050518 )
									ret := -0.092616
								if( ema12 > 0.050518 )
									ret := -0.980769 // sell
							if( tema > 6.39428 )
								if( VIP_VIM <= 0.149779 )
									ret := -0.066725
								if( VIP_VIM > 0.149779 )
									ret := 0.075024
			if( ema2 > 6.96377 )
				if( ema3 <= 19.984 )
					if( ema1 <= 19.7266 )
						if( ema2 <= 19.5236 )
							if( ema2 <= 9.41997 )
								if( ema3 <= 9.31055 )
									ret := -0.063732
								if( ema3 > 9.31055 )
									ret := -0.851240 // sell
							if( ema2 > 9.41997 )
								if( ema1 <= 15.3729 )
									ret := -0.001203
								if( ema1 > 15.3729 )
									ret := -0.084362
						if( ema2 > 19.5236 )
							if( VIP_VIM <= 0.002959 )
								if( ema3 <= 19.7706 )
									ret := 0.437500
								if( ema3 > 19.7706 )
									ret := -0.962963 // sell
							if( VIP_VIM > 0.002959 )
								if( ema13 <= -0.02335 )
									ret := -1.000000 // sell
								if( ema13 > -0.02335 )
									ret := -0.583333
					if( ema1 > 19.7266 )
						if( ema2 <= 19.9975 )
							if( ema1 <= 19.8038 )
								if( VIM <= 1.02429 )
									ret := 0.537037
								if( VIM > 1.02429 )
									ret := 0.937500 // buy
							if( ema1 > 19.8038 )
								if( ema2 <= 19.8263 )
									ret := -0.483333
								if( ema2 > 19.8263 )
									ret := 0.224543
						if( ema2 > 19.9975 )
							if( VIP <= 1.18934 )
								if( tema <= 20.1074 )
									ret := 0.741935 // buy
								if( tema > 20.1074 )
									ret := 0.000000
							if( VIP > 1.18934 )
								ret := 0.933333 // buy
				if( ema3 > 19.984 )
					if( ema13 <= -0.0382 )
						if( tema <= 20.2167 )
							if( tema <= 20.0419 )
								ret := 0.315789
							if( tema > 20.0419 )
								ret := 0.000000
						if( tema > 20.2167 )
							if( ema12 <= -0.027667 )
								ret := 0.380952
							if( ema12 > -0.027667 )
								if( VIP <= 1.06588 )
									ret := 0.716981 // buy
								if( VIP > 1.06588 )
									ret := 1.000000 // buy
					if( ema13 > -0.0382 )
						if( VIP_VIM <= -0.192277 )
							if( ema3 <= 20.5631 )
								if( VIP_VIM <= -0.234058 )
									ret := -0.357143
								if( VIP_VIM > -0.234058 )
									ret := 0.100000
							if( ema3 > 20.5631 )
								if( ema3 <= 20.6066 )
									ret := 0.956522 // buy
								if( ema3 > 20.6066 )
									ret := 0.545455
						if( VIP_VIM > -0.192277 )
							if( VIM <= 1.0035 )
								if( ema2 <= 20.1774 )
									ret := -0.548896
								if( ema2 > 20.1774 )
									ret := -0.175038
							if( VIM > 1.0035 )
								if( ema1 <= 20.169 )
									ret := -0.432836
								if( ema1 > 20.169 )
									ret := -0.816754 // sell
		if( VIP > 1.20536 )
			if( ema12 <= 0.073827 )
				if( ema3 <= 5.91661 )
					if( ema1 <= 5.84354 )
						if( VIP <= 1.36722 )
							if( ema2 <= 5.44152 )
								if( VIP_VIM <= 0.430133 )
									ret := 0.625000
								if( VIP_VIM > 0.430133 )
									ret := -0.433333
							if( ema2 > 5.44152 )
								if( VIM <= 0.706066 )
									ret := 0.754902 // buy
								if( VIM > 0.706066 )
									ret := -0.012658
						if( VIP > 1.36722 )
							if( VIP_VIM <= 0.858491 )
								if( VIP <= 1.37567 )
									ret := -0.615385
								if( VIP > 1.37567 )
									ret := -0.875000 // sell
							if( VIP_VIM > 0.858491 )
								ret := 0.000000
					if( ema1 > 5.84354 )
						if( ema1 <= 5.95623 )
							if( ema3 <= 5.84114 )
								if( VIP <= 1.25364 )
									ret := 0.000000
								if( VIP > 1.25364 )
									ret := 0.818182 // buy
							if( ema3 > 5.84114 )
								if( ema1 <= 5.94805 )
									ret := 0.887931 // buy
								if( ema1 > 5.94805 )
									ret := 0.125000
						if( ema1 > 5.95623 )
							ret := 1.000000 // buy
				if( ema3 > 5.91661 )
					if( ema1 <= 6.1436 )
						if( VIP_VIM <= 0.569716 )
							if( tema <= 6.03177 )
								if( ema12 <= 0.002116 )
									ret := -0.571429
								if( ema12 > 0.002116 )
									ret := -0.029412
							if( tema > 6.03177 )
								if( ema2 <= 6.0045 )
									ret := -0.821429 // sell
								if( ema2 > 6.0045 )
									ret := -0.477876
						if( VIP_VIM > 0.569716 )
							if( ema1 <= 6.10559 )
								if( tema <= 5.96882 )
									ret := -0.727273 // sell
								if( tema > 5.96882 )
									ret := 0.386139
							if( ema1 > 6.10559 )
								if( tema <= 6.16209 )
									ret := -0.111111
								if( tema > 6.16209 )
									ret := -0.952381 // sell
					if( ema1 > 6.1436 )
						if( ema3 <= 6.13278 )
							if( ema12 <= 0.024597 )
								ret := -0.071429
							if( ema12 > 0.024597 )
								if( ema12 <= 0.052746 )
									ret := 0.746479 // buy
								if( ema12 > 0.052746 )
									ret := 0.111111
						if( ema3 > 6.13278 )
							if( VIP_VIM <= 0.752778 )
								if( ema2 <= 20.9034 )
									ret := 0.086415
								if( ema2 > 20.9034 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.752778 )
								if( ema2 <= 6.87759 )
									ret := -0.702703 // sell
								if( ema2 > 6.87759 )
									ret := 0.174157
			if( ema12 > 0.073827 )
				if( ema1 <= 21.191 )
					if( ema2 <= 16.2484 )
						if( VIP <= 1.25295 )
							if( VIM <= 0.714886 )
								if( ema2 <= 6.74242 )
									ret := -0.130435
								if( ema2 > 6.74242 )
									ret := 0.645390
							if( VIM > 0.714886 )
								if( tema <= 14.8104 )
									ret := 0.102431
								if( tema > 14.8104 )
									ret := -0.214876
						if( VIP > 1.25295 )
							if( VIM <= 0.713755 )
								if( tema <= 15.4734 )
									ret := -0.012805
								if( tema > 15.4734 )
									ret := -0.422078
							if( VIM > 0.713755 )
								if( VIP <= 1.37141 )
									ret := -0.424000
								if( VIP > 1.37141 )
									ret := 1.000000 // buy
					if( ema2 > 16.2484 )
						if( ema3 <= 16.5441 )
							if( VIM <= 0.732718 )
								ret := 0.625000
							if( VIM > 0.732718 )
								if( VIP <= 1.2291 )
									ret := 0.777778 // buy
								if( VIP > 1.2291 )
									ret := 1.000000 // buy
						if( ema3 > 16.5441 )
							if( VIM <= 0.71819 )
								if( ema13 <= 0.261555 )
									ret := -0.012876
								if( ema13 > 0.261555 )
									ret := 0.590698
							if( VIM > 0.71819 )
								if( ema13 <= 0.217493 )
									ret := -0.269663
								if( ema13 > 0.217493 )
									ret := 0.000000
				if( ema1 > 21.191 )
					if( VIP <= 1.24145 )
						ret := -1.000000 // sell
					if( VIP > 1.24145 )
						ret := -0.642857
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_LINKUSDT_15Min_641d86b7(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


