//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: LTCUSDT_15Min_2TV0_e1429194 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2TV0_e1429194", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_e1429194(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.242736 )
		if( ema1 <= 101.462 )
			if( ema2 <= 59.3286 )
				if( VIM <= 1.1159 )
					if( VIP <= 0.757728 )
						ret := 0.444444
					if( VIP > 0.757728 )
						if( ema2 <= 52.2324 )
							if( VIP_VIM <= -0.227921 )
								ret := -0.818182 // sell
							if( VIP_VIM > -0.227921 )
								if( ema2 <= 48.1112 )
									ret := -0.310345
								if( ema2 > 48.1112 )
									ret := 0.800000 // buy
						if( ema2 > 52.2324 )
							if( ema3 <= 58.2905 )
								if( VIP <= 0.981998 )
									ret := -0.821138 // sell
								if( VIP > 0.981998 )
									ret := -0.357143
							if( ema3 > 58.2905 )
								if( ema2 <= 59.0798 )
									ret := 1.000000 // buy
								if( ema2 > 59.0798 )
									ret := -0.785714 // sell
				if( VIM > 1.1159 )
					if( VIP_VIM <= -0.465411 )
						if( ema1 <= 46.0681 )
							if( VIM <= 1.27391 )
								if( tema <= 43.367 )
									ret := 0.928571 // buy
								if( tema > 43.367 )
									ret := 0.300000
							if( VIM > 1.27391 )
								if( ema1 <= 44.8016 )
									ret := 1.000000 // buy
								if( ema1 > 44.8016 )
									ret := 0.888889 // buy
						if( ema1 > 46.0681 )
							if( ema3 <= 52.9517 )
								if( tema <= 45.322 )
									ret := 0.850000 // buy
								if( tema > 45.322 )
									ret := -0.428184
							if( ema3 > 52.9517 )
								if( tema <= 55.2262 )
									ret := 0.171190
								if( tema > 55.2262 )
									ret := -0.189024
					if( VIP_VIM > -0.465411 )
						if( ema1 <= 53.678 )
							if( ema1 <= 50.2438 )
								if( ema1 <= 42.7316 )
									ret := 1.000000 // buy
								if( ema1 > 42.7316 )
									ret := -0.062500
							if( ema1 > 50.2438 )
								if( ema2 <= 53.1608 )
									ret := 0.439024
								if( ema2 > 53.1608 )
									ret := 0.787879 // buy
						if( ema1 > 53.678 )
							if( ema2 <= 54.5424 )
								if( VIM <= 1.19597 )
									ret := -1.000000 // sell
								if( VIM > 1.19597 )
									ret := -0.846154 // sell
							if( ema2 > 54.5424 )
								if( ema13 <= -0.770207 )
									ret := -0.197279
								if( ema13 > -0.770207 )
									ret := 0.298182
			if( ema2 > 59.3286 )
				if( ema12 <= -0.459439 )
					if( ema3 <= 91.6348 )
						if( tema <= 87.7729 )
							if( ema2 <= 88.3865 )
								if( ema1 <= 87.1966 )
									ret := 0.202291
								if( ema1 > 87.1966 )
									ret := -0.573333
							if( ema2 > 88.3865 )
								if( ema12 <= -0.950268 )
									ret := 0.467742
								if( ema12 > -0.950268 )
									ret := 0.750000 // buy
						if( tema > 87.7729 )
							if( ema3 <= 89.8122 )
								if( ema13 <= -0.830281 )
									ret := -0.961538 // sell
								if( ema13 > -0.830281 )
									ret := -0.272727
							if( ema3 > 89.8122 )
								if( VIP_VIM <= -0.687083 )
									ret := -0.677419
								if( VIP_VIM > -0.687083 )
									ret := 0.094595
					if( ema3 > 91.6348 )
						if( ema3 <= 100.501 )
							if( ema1 <= 95.3951 )
								if( ema2 <= 92.8376 )
									ret := 0.651261
								if( ema2 > 92.8376 )
									ret := 0.206490
							if( ema1 > 95.3951 )
								if( ema13 <= -2.10909 )
									ret := 0.162162
								if( ema13 > -2.10909 )
									ret := 0.760291 // buy
						if( ema3 > 100.501 )
							if( ema3 <= 101.104 )
								if( VIP <= 0.651046 )
									ret := 0.714286 // buy
								if( VIP > 0.651046 )
									ret := -0.887097 // sell
							if( ema3 > 101.104 )
								if( tema <= 98.7019 )
									ret := -0.025641
								if( tema > 98.7019 )
									ret := 0.685714
				if( ema12 > -0.459439 )
					if( ema2 <= 93.7629 )
						if( ema3 <= 86.8761 )
							if( tema <= 62.6953 )
								if( VIM <= 1.17669 )
									ret := 0.559767
								if( VIM > 1.17669 )
									ret := 0.235828
							if( tema > 62.6953 )
								if( ema13 <= -0.846531 )
									ret := -0.278443
								if( ema13 > -0.846531 )
									ret := 0.102637
						if( ema3 > 86.8761 )
							if( VIP_VIM <= -0.525838 )
								if( VIM <= 1.24194 )
									ret := -0.538462
								if( VIM > 1.24194 )
									ret := -0.051948
							if( VIP_VIM > -0.525838 )
								if( ema1 <= 92.2909 )
									ret := 0.332370
								if( ema1 > 92.2909 )
									ret := 0.614865
					if( ema2 > 93.7629 )
						if( VIP_VIM <= -0.099994 )
							if( ema3 <= 97.4577 )
								if( tema <= 96.2601 )
									ret := -0.257576
								if( tema > 96.2601 )
									ret := -0.892857 // sell
							if( ema3 > 97.4577 )
								if( tema <= 96.8157 )
									ret := 0.827586 // buy
								if( tema > 96.8157 )
									ret := -0.045238
						if( VIP_VIM > -0.099994 )
							if( ema2 <= 99.4471 )
								if( tema <= 94.9092 )
									ret := 0.000000
								if( tema > 94.9092 )
									ret := 0.794872 // buy
							if( ema2 > 99.4471 )
								ret := -0.294118
		if( ema1 > 101.462 )
			if( ema3 <= 102.095 )
				if( tema <= 101.152 )
					ret := 0.800000 // buy
				if( tema > 101.152 )
					ret := 0.363636
			if( ema3 > 102.095 )
				if( VIM <= 1.26876 )
					if( ema2 <= 102.9 )
						if( ema3 <= 102.629 )
							if( ema12 <= -0.431426 )
								ret := -0.461538
							if( ema12 > -0.431426 )
								if( ema13 <= -0.535659 )
									ret := -0.947368 // sell
								if( ema13 > -0.535659 )
									ret := -0.600000
						if( ema3 > 102.629 )
							if( ema12 <= -0.297891 )
								if( ema2 <= 102.525 )
									ret := 0.600000
								if( ema2 > 102.525 )
									ret := -0.923077 // sell
							if( ema12 > -0.297891 )
								if( ema1 <= 102.47 )
									ret := -0.800000 // sell
								if( ema1 > 102.47 )
									ret := -1.000000 // sell
					if( ema2 > 102.9 )
						if( tema <= 102.198 )
							if( VIP_VIM <= -0.404761 )
								ret := 0.235294
							if( VIP_VIM > -0.404761 )
								ret := 0.947368 // buy
						if( tema > 102.198 )
							if( ema3 <= 105.22 )
								if( ema2 <= 104.503 )
									ret := -0.448718
								if( ema2 > 104.503 )
									ret := -0.979167 // sell
							if( ema3 > 105.22 )
								if( VIP <= 0.770197 )
									ret := 0.928571 // buy
								if( VIP > 0.770197 )
									ret := -0.285156
				if( VIM > 1.26876 )
					if( ema12 <= -0.676614 )
						ret := -1.000000 // sell
					if( ema12 > -0.676614 )
						ret := -0.600000
	if( ema12 > -0.242736 )
		if( ema13 <= 0.379356 )
			if( ema1 <= 92.0978 )
				if( tema <= 52.5499 )
					if( VIM <= 0.884897 )
						if( ema1 <= 52.168 )
							if( tema <= 51.9259 )
								if( VIP_VIM <= 0.309311 )
									ret := -0.170103
								if( VIP_VIM > 0.309311 )
									ret := 0.253456
							if( tema > 51.9259 )
								if( VIM <= 0.769755 )
									ret := 0.111111
								if( VIM > 0.769755 )
									ret := -0.697674
						if( ema1 > 52.168 )
							if( VIM <= 0.776132 )
								ret := 0.900000 // buy
							if( VIM > 0.776132 )
								if( VIM <= 0.828604 )
									ret := -0.407407
								if( VIM > 0.828604 )
									ret := 0.500000
					if( VIM > 0.884897 )
						if( ema2 <= 52.4008 )
							if( VIM <= 1.11309 )
								if( ema12 <= -0.163895 )
									ret := 0.711538 // buy
								if( ema12 > -0.163895 )
									ret := 0.126445
							if( VIM > 1.11309 )
								if( ema1 <= 50.5576 )
									ret := -0.322034
								if( ema1 > 50.5576 )
									ret := 0.067538
						if( ema2 > 52.4008 )
							if( ema1 <= 52.6942 )
								if( tema <= 52.2781 )
									ret := 0.791667 // buy
								if( tema > 52.2781 )
									ret := 0.335907
							if( ema1 > 52.6942 )
								ret := -0.636364
				if( tema > 52.5499 )
					if( ema12 <= 0.340201 )
						if( ema1 <= 52.781 )
							if( ema3 <= 52.6798 )
								if( VIM <= 0.783664 )
									ret := 0.733333 // buy
								if( VIM > 0.783664 )
									ret := -0.203320
							if( ema3 > 52.6798 )
								if( ema12 <= -0.079122 )
									ret := 0.000000
								if( ema12 > -0.079122 )
									ret := -0.637931
						if( ema1 > 52.781 )
							if( ema2 <= 71.8054 )
								if( ema1 <= 71.5571 )
									ret := 0.018740
								if( ema1 > 71.5571 )
									ret := 0.258721
							if( ema2 > 71.8054 )
								if( tema <= 91.3308 )
									ret := -0.025732
								if( tema > 91.3308 )
									ret := 0.123772
					if( ema12 > 0.340201 )
						if( VIP_VIM <= 0.099553 )
							ret := 0.100000
						if( VIP_VIM > 0.099553 )
							if( VIP <= 1.08965 )
								ret := -0.777778 // sell
							if( VIP > 1.08965 )
								ret := -1.000000 // sell
			if( ema1 > 92.0978 )
				if( ema13 <= -0.057798 )
					if( ema2 <= 92.6249 )
						if( ema1 <= 92.2587 )
							if( tema <= 91.9076 )
								ret := 0.666667
							if( tema > 91.9076 )
								if( ema1 <= 92.1892 )
									ret := -0.410714
								if( ema1 > 92.1892 )
									ret := 0.129032
						if( ema1 > 92.2587 )
							if( VIP <= 0.83563 )
								if( VIM <= 1.16093 )
									ret := -0.500000
								if( VIM > 1.16093 )
									ret := -0.058824
							if( VIP > 0.83563 )
								if( VIP <= 0.956538 )
									ret := -0.793651 // sell
								if( VIP > 0.956538 )
									ret := -0.421053
					if( ema2 > 92.6249 )
						if( ema3 <= 96.7733 )
							if( ema12 <= -0.115439 )
								if( VIM <= 1.12461 )
									ret := 0.209732
								if( VIM > 1.12461 )
									ret := -0.090411
							if( ema12 > -0.115439 )
								if( ema1 <= 96.5233 )
									ret := -0.175166
								if( ema1 > 96.5233 )
									ret := 0.596154
						if( ema3 > 96.7733 )
							if( VIP_VIM <= -0.176882 )
								if( ema3 <= 98.5306 )
									ret := -0.285714
								if( ema3 > 98.5306 )
									ret := 0.052830
							if( VIP_VIM > -0.176882 )
								if( ema2 <= 97.0562 )
									ret := -0.679389
								if( ema2 > 97.0562 )
									ret := -0.253381
				if( ema13 > -0.057798 )
					if( ema3 <= 93.018 )
						if( ema2 <= 92.8022 )
							if( ema2 <= 92.3163 )
								if( ema1 <= 92.3372 )
									ret := -0.176471
								if( ema1 > 92.3372 )
									ret := -0.787611 // sell
							if( ema2 > 92.3163 )
								if( ema12 <= 0.057211 )
									ret := 0.270936
								if( ema12 > 0.057211 )
									ret := -0.104046
						if( ema2 > 92.8022 )
							if( tema <= 92.7522 )
								ret := 0.000000
							if( tema > 92.7522 )
								if( ema12 <= 0.000995 )
									ret := -0.555556
								if( ema12 > 0.000995 )
									ret := -0.823204 // sell
					if( ema3 > 93.018 )
						if( VIM <= 0.865246 )
							if( ema2 <= 96.4096 )
								if( tema <= 93.643 )
									ret := -0.714286 // sell
								if( tema > 93.643 )
									ret := 0.379888
							if( ema2 > 96.4096 )
								if( ema1 <= 99.1674 )
									ret := -0.371681
								if( ema1 > 99.1674 )
									ret := 0.133333
						if( VIM > 0.865246 )
							if( tema <= 105.529 )
								if( ema1 <= 100.112 )
									ret := -0.014778
								if( ema1 > 100.112 )
									ret := -0.296854
							if( tema > 105.529 )
								if( ema12 <= 0.139735 )
									ret := 0.463415
								if( ema12 > 0.139735 )
									ret := -0.140000
		if( ema13 > 0.379356 )
			if( tema <= 107.772 )
				if( VIP <= 1.05351 )
					if( ema1 <= 95.3787 )
						if( ema12 <= 0.442361 )
							if( ema13 <= 0.888615 )
								if( ema1 <= 66.1333 )
									ret := 0.382979
								if( ema1 > 66.1333 )
									ret := 0.020050
							if( ema13 > 0.888615 )
								if( tema <= 80.7502 )
									ret := -0.933333 // sell
								if( tema > 80.7502 )
									ret := -0.388889
						if( ema12 > 0.442361 )
							if( tema <= 71.0138 )
								ret := 0.625000
							if( tema > 71.0138 )
								ret := 1.000000 // buy
					if( ema1 > 95.3787 )
						if( VIP <= 1.02521 )
							if( VIM <= 1.01758 )
								if( tema <= 101.543 )
									ret := 0.925000 // buy
								if( tema > 101.543 )
									ret := 0.538462
							if( VIM > 1.01758 )
								if( ema2 <= 100.759 )
									ret := 0.000000
								if( ema2 > 100.759 )
									ret := 0.650000
						if( VIP > 1.02521 )
							if( ema12 <= 0.16307 )
								ret := -0.333333
							if( ema12 > 0.16307 )
								if( tema <= 102.719 )
									ret := 0.297297
								if( tema > 102.719 )
									ret := 0.714286 // buy
				if( VIP > 1.05351 )
					if( ema2 <= 81.1391 )
						if( ema3 <= 77.4702 )
							if( ema2 <= 78.0055 )
								if( tema <= 44.2555 )
									ret := 0.937500 // buy
								if( tema > 44.2555 )
									ret := -0.113443
							if( ema2 > 78.0055 )
								if( VIP_VIM <= 0.64872 )
									ret := 0.692308
								if( VIP_VIM > 0.64872 )
									ret := 1.000000 // buy
						if( ema3 > 77.4702 )
							if( ema2 <= 78.7324 )
								if( VIP <= 1.31798 )
									ret := -0.645161
								if( VIP > 1.31798 )
									ret := 0.176471
							if( ema2 > 78.7324 )
								if( ema13 <= 1.12715 )
									ret := -0.084746
								if( ema13 > 1.12715 )
									ret := -0.588571
					if( ema2 > 81.1391 )
						if( tema <= 85.7506 )
							if( tema <= 85.2881 )
								if( VIM <= 0.743774 )
									ret := -0.283626
								if( VIM > 0.743774 )
									ret := 0.177394
							if( tema > 85.2881 )
								if( VIP <= 1.18539 )
									ret := 0.228261
								if( VIP > 1.18539 )
									ret := 0.836364 // buy
						if( tema > 85.7506 )
							if( ema12 <= 0.894091 )
								if( ema3 <= 106.414 )
									ret := -0.103148
								if( ema3 > 106.414 )
									ret := -0.833333 // sell
							if( ema12 > 0.894091 )
								if( ema1 <= 104.002 )
									ret := 0.297989
								if( ema1 > 104.002 )
									ret := -0.685714
			if( tema > 107.772 )
				if( ema2 <= 110.224 )
					if( ema3 <= 107.332 )
						if( ema13 <= 3.0567 )
							if( ema12 <= 1.35005 )
								if( VIM <= 0.869838 )
									ret := -0.981132 // sell
								if( VIM > 0.869838 )
									ret := -0.821429 // sell
							if( ema12 > 1.35005 )
								ret := -0.333333
						if( ema13 > 3.0567 )
							ret := -1.000000 // sell
					if( ema3 > 107.332 )
						if( ema3 <= 107.746 )
							ret := 0.125000
						if( ema3 > 107.746 )
							if( ema2 <= 109.267 )
								ret := -0.562500
							if( ema2 > 109.267 )
								ret := -1.000000 // sell
				if( ema2 > 110.224 )
					if( tema <= 113.196 )
						if( tema <= 112.328 )
							ret := 0.142857
						if( tema > 112.328 )
							ret := 0.894737 // buy
					if( tema > 113.196 )
						if( tema <= 113.543 )
							ret := -0.888889 // sell
						if( tema > 113.543 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_e1429194(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


