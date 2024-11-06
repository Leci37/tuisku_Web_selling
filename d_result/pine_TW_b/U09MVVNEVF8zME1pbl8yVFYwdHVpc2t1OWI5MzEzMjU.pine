//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: SOLUSDT_30Min_2TV0_9b931325 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2TV0_9b931325", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_9b931325(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 140.062 )
		if( ema12 <= -1.33639 )
			if( ema2 <= 116.47 )
				if( VIP <= 0.802606 )
					if( tema <= 98.4096 )
						if( ema3 <= 93.0252 )
							if( ema3 <= 91.1638 )
								if( ema3 <= 35.0691 )
									ret := -0.057143
								if( ema3 > 35.0691 )
									ret := 0.531034
							if( ema3 > 91.1638 )
								if( VIP_VIM <= -0.493231 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.493231 )
									ret := 0.250000
						if( ema3 > 93.0252 )
							if( VIM <= 1.38769 )
								if( tema <= 92.7886 )
									ret := 0.901961 // buy
								if( tema > 92.7886 )
									ret := 0.555556
							if( VIM > 1.38769 )
								ret := -0.250000
					if( tema > 98.4096 )
						if( ema1 <= 107.513 )
							if( ema13 <= -3.37242 )
								if( ema3 <= 107.676 )
									ret := -0.250000
								if( ema3 > 107.676 )
									ret := -0.909091 // sell
							if( ema13 > -3.37242 )
								if( VIP <= 0.763188 )
									ret := -0.208333
								if( VIP > 0.763188 )
									ret := 0.500000
						if( ema1 > 107.513 )
							if( tema <= 109.004 )
								if( tema <= 106.234 )
									ret := 0.941176 // buy
								if( tema > 106.234 )
									ret := 0.357143
							if( tema > 109.004 )
								if( VIM <= 1.23369 )
									ret := -0.800000 // sell
								if( VIM > 1.23369 )
									ret := 0.250000
				if( VIP > 0.802606 )
					if( ema2 <= 48.2906 )
						if( ema3 <= 44.955 )
							if( ema3 <= 41.8871 )
								ret := 0.000000
							if( ema3 > 41.8871 )
								if( VIP_VIM <= -0.251767 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.251767 )
									ret := -0.750000 // sell
						if( ema3 > 44.955 )
							if( VIP <= 0.86028 )
								ret := 1.000000 // buy
							if( VIP > 0.86028 )
								ret := 0.857143 // buy
					if( ema2 > 48.2906 )
						if( VIP <= 0.827052 )
							if( ema13 <= -2.9566 )
								if( tema <= 68.3292 )
									ret := -1.000000 // sell
								if( tema > 68.3292 )
									ret := -0.518519
							if( ema13 > -2.9566 )
								if( VIP_VIM <= -0.37937 )
									ret := 0.000000
								if( VIP_VIM > -0.37937 )
									ret := 0.750000 // buy
						if( VIP > 0.827052 )
							if( tema <= 112.363 )
								if( ema2 <= 111.496 )
									ret := -0.565217
								if( ema2 > 111.496 )
									ret := -1.000000 // sell
							if( tema > 112.363 )
								ret := 0.200000
			if( ema2 > 116.47 )
				if( VIM <= 1.27712 )
					if( ema13 <= -2.57589 )
						if( ema3 <= 124.543 )
							if( tema <= 117.963 )
								if( ema1 <= 118.274 )
									ret := 0.819672 // buy
								if( ema1 > 118.274 )
									ret := 0.000000
							if( tema > 117.963 )
								ret := 1.000000 // buy
						if( ema3 > 124.543 )
							if( ema1 <= 121.842 )
								ret := -1.000000 // sell
							if( ema1 > 121.842 )
								if( ema3 <= 140.783 )
									ret := 0.431298
								if( ema3 > 140.783 )
									ret := 0.660377
					if( ema13 > -2.57589 )
						if( VIM <= 1.18962 )
							if( VIP_VIM <= -0.155132 )
								if( VIP_VIM <= -0.308786 )
									ret := 0.222222
								if( VIP_VIM > -0.308786 )
									ret := 0.920000 // buy
							if( VIP_VIM > -0.155132 )
								ret := -0.400000
						if( VIM > 1.18962 )
							if( VIP <= 0.772087 )
								if( ema12 <= -1.52166 )
									ret := -0.600000
								if( ema12 > -1.52166 )
									ret := 0.000000
							if( VIP > 0.772087 )
								ret := -1.000000 // sell
				if( VIM > 1.27712 )
					if( ema3 <= 139.791 )
						if( ema3 <= 137.917 )
							if( ema13 <= -2.55432 )
								if( tema <= 125.213 )
									ret := 0.714286 // buy
								if( tema > 125.213 )
									ret := -0.125000
							if( ema13 > -2.55432 )
								ret := -0.714286 // sell
						if( ema3 > 137.917 )
							if( ema12 <= -2.2748 )
								ret := -1.000000 // sell
							if( ema12 > -2.2748 )
								ret := 0.000000
					if( ema3 > 139.791 )
						if( ema1 <= 144.282 )
							if( ema12 <= -2.03153 )
								if( ema2 <= 143.655 )
									ret := 0.950000 // buy
								if( ema2 > 143.655 )
									ret := 0.200000
							if( ema12 > -2.03153 )
								ret := -0.285714
						if( ema1 > 144.282 )
							ret := -1.000000 // sell
		if( ema12 > -1.33639 )
			if( ema13 <= 0.05256 )
				if( ema1 <= 1.35017 )
					if( ema13 <= -0.023212 )
						if( ema12 <= -0.021027 )
							if( VIM <= 1.2816 )
								if( ema3 <= 1.31229 )
									ret := 0.909091 // buy
								if( ema3 > 1.31229 )
									ret := -0.200000
							if( VIM > 1.2816 )
								ret := 1.000000 // buy
						if( ema12 > -0.021027 )
							if( ema13 <= -0.028789 )
								if( tema <= 1.2627 )
									ret := 0.250000
								if( tema > 1.2627 )
									ret := -1.000000 // sell
							if( ema13 > -0.028789 )
								if( ema12 <= -0.013141 )
									ret := 0.800000 // buy
								if( ema12 > -0.013141 )
									ret := -0.250000
					if( ema13 > -0.023212 )
						if( ema12 <= 0.007743 )
							if( tema <= 1.30848 )
								if( ema13 <= -0.010974 )
									ret := 0.758621 // buy
								if( ema13 > -0.010974 )
									ret := 1.000000 // buy
							if( tema > 1.30848 )
								if( VIP_VIM <= -0.008511 )
									ret := 0.228571
								if( VIP_VIM > -0.008511 )
									ret := 0.857143 // buy
						if( ema12 > 0.007743 )
							if( tema <= 1.32878 )
								if( ema2 <= 1.26832 )
									ret := -0.400000
								if( ema2 > 1.26832 )
									ret := 0.100000
							if( tema > 1.32878 )
								if( ema2 <= 1.33249 )
									ret := 0.444444
								if( ema2 > 1.33249 )
									ret := 1.000000 // buy
				if( ema1 > 1.35017 )
					if( VIP_VIM <= -0.715804 )
						if( tema <= 12.9165 )
							if( ema13 <= -0.348205 )
								if( tema <= 9.90116 )
									ret := 1.000000 // buy
								if( tema > 9.90116 )
									ret := 0.705882 // buy
							if( ema13 > -0.348205 )
								if( ema3 <= 2.29798 )
									ret := 0.611765
								if( ema3 > 2.29798 )
									ret := 0.000000
						if( tema > 12.9165 )
							if( ema13 <= -0.421454 )
								if( ema2 <= 14.1299 )
									ret := 1.000000 // buy
								if( ema2 > 14.1299 )
									ret := 0.066176
							if( ema13 > -0.421454 )
								if( VIP_VIM <= -0.7621 )
									ret := -0.611111
								if( VIP_VIM > -0.7621 )
									ret := -0.153846
					if( VIP_VIM > -0.715804 )
						if( ema1 <= 1.44119 )
							if( ema12 <= 0.003478 )
								if( tema <= 1.37545 )
									ret := -0.192308
								if( tema > 1.37545 )
									ret := -0.666667
							if( ema12 > 0.003478 )
								if( VIM <= 0.817676 )
									ret := -0.377049
								if( VIM > 0.817676 )
									ret := 0.581395
						if( ema1 > 1.44119 )
							if( ema3 <= 13.4795 )
								if( VIP <= 1.01492 )
									ret := 0.115842
								if( VIP > 1.01492 )
									ret := -0.027993
							if( ema3 > 13.4795 )
								if( ema1 <= 139.444 )
									ret := 0.019324
								if( ema1 > 139.444 )
									ret := 0.314286
			if( ema13 > 0.05256 )
				if( VIM <= 0.763409 )
					if( ema13 <= 1.21102 )
						if( ema2 <= 1.53316 )
							if( VIM <= 0.680952 )
								if( tema <= 1.53141 )
									ret := 0.750000 // buy
								if( tema > 1.53141 )
									ret := 1.000000 // buy
							if( VIM > 0.680952 )
								ret := -1.000000 // sell
						if( ema2 > 1.53316 )
							if( ema1 <= 4.39805 )
								if( tema <= 3.44798 )
									ret := 0.086283
								if( tema > 3.44798 )
									ret := -0.743802 // sell
							if( ema1 > 4.39805 )
								if( ema1 <= 12.5435 )
									ret := 0.314540
								if( ema1 > 12.5435 )
									ret := 0.087610
					if( ema13 > 1.21102 )
						if( ema3 <= 40.3366 )
							if( tema <= 13.6172 )
								if( ema1 <= 12.7549 )
									ret := 0.500000
								if( ema1 > 12.7549 )
									ret := 1.000000 // buy
							if( tema > 13.6172 )
								if( ema1 <= 32.5115 )
									ret := -0.288235
								if( ema1 > 32.5115 )
									ret := -0.598131
						if( ema3 > 40.3366 )
							if( ema12 <= 1.25298 )
								if( VIP <= 1.22729 )
									ret := -0.142857
								if( VIP > 1.22729 )
									ret := 0.170040
							if( ema12 > 1.25298 )
								if( ema2 <= 128.745 )
									ret := -0.331325
								if( ema2 > 128.745 )
									ret := 0.164384
				if( VIM > 0.763409 )
					if( ema1 <= 61.4343 )
						if( ema1 <= 2.13596 )
							if( VIP_VIM <= 0.34365 )
								if( VIM <= 0.901674 )
									ret := 0.787500 // buy
								if( VIM > 0.901674 )
									ret := 0.100000
							if( VIP_VIM > 0.34365 )
								if( VIP <= 1.17429 )
									ret := -0.750000 // sell
								if( VIP > 1.17429 )
									ret := 0.475000
						if( ema1 > 2.13596 )
							if( ema3 <= 2.13031 )
								if( ema13 <= 0.089022 )
									ret := -0.853659 // sell
								if( ema13 > 0.089022 )
									ret := -0.266667
							if( ema3 > 2.13031 )
								if( ema1 <= 2.25347 )
									ret := 0.931034 // buy
								if( ema1 > 2.25347 )
									ret := 0.074060
					if( ema1 > 61.4343 )
						if( tema <= 71.8348 )
							if( ema2 <= 66.2597 )
								if( ema1 <= 63.5298 )
									ret := 0.652893
								if( ema1 > 63.5298 )
									ret := -0.037975
							if( ema2 > 66.2597 )
								if( VIM <= 0.995342 )
									ret := 0.740541 // buy
								if( VIM > 0.995342 )
									ret := 0.041667
						if( tema > 71.8348 )
							if( ema2 <= 71.1139 )
								if( tema <= 72.0996 )
									ret := -0.500000
								if( tema > 72.0996 )
									ret := -1.000000 // sell
							if( ema2 > 71.1139 )
								if( ema12 <= 1.23785 )
									ret := 0.129504
								if( ema12 > 1.23785 )
									ret := 0.408624
	if( tema > 140.062 )
		if( ema3 <= 139.091 )
			if( ema2 <= 139.774 )
				if( ema2 <= 135.687 )
					if( tema <= 141.416 )
						if( ema2 <= 134.208 )
							ret := 0.000000
						if( ema2 > 134.208 )
							ret := 0.500000
					if( tema > 141.416 )
						ret := 1.000000 // buy
				if( ema2 > 135.687 )
					if( VIP <= 1.2056 )
						if( ema13 <= 1.10669 )
							if( ema1 <= 139.766 )
								ret := 0.250000
							if( ema1 > 139.766 )
								ret := 0.666667
						if( ema13 > 1.10669 )
							if( VIM <= 0.766254 )
								if( tema <= 141.07 )
									ret := 0.000000
								if( tema > 141.07 )
									ret := 1.000000 // buy
							if( VIM > 0.766254 )
								if( ema13 <= 1.47732 )
									ret := -0.387097
								if( ema13 > 1.47732 )
									ret := -0.030303
					if( VIP > 1.2056 )
						if( tema <= 141.141 )
							ret := 0.000000
						if( tema > 141.141 )
							if( VIM <= 0.79303 )
								if( ema12 <= 3.50656 )
									ret := -0.758065 // sell
								if( ema12 > 3.50656 )
									ret := -0.250000
							if( VIM > 0.79303 )
								ret := 0.000000
			if( ema2 > 139.774 )
				if( ema2 <= 140.288 )
					if( VIP <= 1.13563 )
						if( ema12 <= 0.973826 )
							ret := -1.000000 // sell
						if( ema12 > 0.973826 )
							ret := -0.500000
					if( VIP > 1.13563 )
						if( ema13 <= 5.0463 )
							ret := -1.000000 // sell
						if( ema13 > 5.0463 )
							ret := -0.750000 // sell
				if( ema2 > 140.288 )
					ret := -0.250000
		if( ema3 > 139.091 )
			if( ema13 <= 4.41584 )
				if( ema12 <= -5.10023 )
					if( ema1 <= 198.839 )
						if( ema1 <= 162.419 )
							ret := 0.250000
						if( ema1 > 162.419 )
							if( tema <= 186.618 )
								ret := 1.000000 // buy
							if( tema > 186.618 )
								ret := 0.571429
					if( ema1 > 198.839 )
						ret := 0.000000
				if( ema12 > -5.10023 )
					if( tema <= 244.511 )
						if( ema2 <= 243.934 )
							if( ema3 <= 240.524 )
								if( tema <= 221.531 )
									ret := -0.011911
								if( tema > 221.531 )
									ret := 0.169369
							if( ema3 > 240.524 )
								if( tema <= 231.125 )
									ret := 1.000000 // buy
								if( tema > 231.125 )
									ret := -0.451613
						if( ema2 > 243.934 )
							if( ema2 <= 244.573 )
								if( tema <= 242.422 )
									ret := 0.500000
								if( tema > 242.422 )
									ret := 1.000000 // buy
							if( ema2 > 244.573 )
								if( tema <= 243.94 )
									ret := 0.181818
								if( tema > 243.94 )
									ret := -0.500000
					if( tema > 244.511 )
						if( ema3 <= 242.954 )
							if( ema2 <= 241.955 )
								if( ema13 <= 4.02778 )
									ret := 0.000000
								if( ema13 > 4.02778 )
									ret := -0.750000 // sell
							if( ema2 > 241.955 )
								if( tema <= 247.349 )
									ret := -0.777778 // sell
								if( tema > 247.349 )
									ret := -1.000000 // sell
						if( ema3 > 242.954 )
							if( ema3 <= 248.386 )
								if( ema1 <= 248.291 )
									ret := -0.061224
								if( ema1 > 248.291 )
									ret := 0.400000
							if( ema3 > 248.386 )
								if( ema12 <= -0.299912 )
									ret := -0.115385
								if( ema12 > -0.299912 )
									ret := -0.633333
			if( ema13 > 4.41584 )
				if( tema <= 204.106 )
					if( VIM <= 0.672605 )
						if( VIM <= 0.524249 )
							ret := 0.750000 // buy
						if( VIM > 0.524249 )
							if( VIM <= 0.610201 )
								if( ema3 <= 167.968 )
									ret := -0.250000
								if( ema3 > 167.968 )
									ret := -0.800000 // sell
							if( VIM > 0.610201 )
								if( VIM <= 0.667591 )
									ret := 0.057143
								if( VIM > 0.667591 )
									ret := -0.666667
					if( VIM > 0.672605 )
						if( ema12 <= 3.29386 )
							if( tema <= 203.194 )
								if( ema2 <= 177.132 )
									ret := 0.436782
								if( ema2 > 177.132 )
									ret := -0.259259
							if( tema > 203.194 )
								if( ema1 <= 201.184 )
									ret := 1.000000 // buy
								if( ema1 > 201.184 )
									ret := 0.750000 // buy
						if( ema12 > 3.29386 )
							if( ema2 <= 147.51 )
								ret := -0.750000 // sell
							if( ema2 > 147.51 )
								if( ema3 <= 189.089 )
									ret := 0.748031 // buy
								if( ema3 > 189.089 )
									ret := 0.000000
				if( tema > 204.106 )
					if( ema12 <= 2.00979 )
						if( ema13 <= 4.65864 )
							ret := 0.750000 // buy
						if( ema13 > 4.65864 )
							ret := 1.000000 // buy
					if( ema12 > 2.00979 )
						if( ema13 <= 4.75921 )
							if( ema12 <= 2.54818 )
								if( ema13 <= 4.45622 )
									ret := -0.750000 // sell
								if( ema13 > 4.45622 )
									ret := 0.222222
							if( ema12 > 2.54818 )
								if( VIM <= 0.773486 )
									ret := 0.000000
								if( VIM > 0.773486 )
									ret := 1.000000 // buy
						if( ema13 > 4.75921 )
							if( ema3 <= 209.971 )
								if( VIP <= 1.31413 )
									ret := -0.470588
								if( VIP > 1.31413 )
									ret := -1.000000 // sell
							if( ema3 > 209.971 )
								if( tema <= 230.325 )
									ret := 0.352941
								if( tema > 230.325 )
									ret := -0.375000
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_9b931325(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)

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


