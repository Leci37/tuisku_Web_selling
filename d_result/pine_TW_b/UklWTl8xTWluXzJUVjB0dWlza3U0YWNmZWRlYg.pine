//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: RIVN_1Min_2TV0_4acfedeb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2TV0_4acfedeb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_4acfedeb(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.000291 )
		if( ema3 <= 10.3557 )
			if( tema <= 8.45158 )
				if( ema2 <= 8.45734 )
					ret := 0.461538
				if( ema2 > 8.45734 )
					if( ema12 <= -0.037266 )
						ret := 1.000000 // buy
					if( ema12 > -0.037266 )
						if( VIP <= 0.855295 )
							if( VIM <= 1.27255 )
								ret := 1.000000 // buy
							if( VIM > 1.27255 )
								ret := 0.666667
						if( VIP > 0.855295 )
							ret := 1.000000 // buy
			if( tema > 8.45158 )
				if( ema13 <= -0.062996 )
					if( VIP <= 0.857246 )
						if( VIP_VIM <= -0.740769 )
							if( VIM <= 1.43451 )
								if( ema12 <= -0.067782 )
									ret := 1.000000 // buy
								if( ema12 > -0.067782 )
									ret := 0.375000
							if( VIM > 1.43451 )
								ret := -0.272727
						if( VIP_VIM > -0.740769 )
							if( ema13 <= -0.13338 )
								if( ema3 <= 10.1259 )
									ret := -0.636364
								if( ema3 > 10.1259 )
									ret := -1.000000 // sell
							if( ema13 > -0.13338 )
								if( ema3 <= 10.3163 )
									ret := -0.320442
								if( ema3 > 10.3163 )
									ret := 0.812500 // buy
					if( VIP > 0.857246 )
						if( ema12 <= -0.031602 )
							if( tema <= 9.85087 )
								if( ema2 <= 10.0824 )
									ret := 0.978261 // buy
								if( ema2 > 10.0824 )
									ret := 0.500000
							if( tema > 9.85087 )
								ret := 0.214286
						if( ema12 > -0.031602 )
							ret := -0.590909
				if( ema13 > -0.062996 )
					if( ema12 <= -0.011309 )
						if( tema <= 8.51793 )
							if( ema2 <= 8.52529 )
								ret := -0.266667
							if( ema2 > 8.52529 )
								ret := -0.833333 // sell
						if( tema > 8.51793 )
							if( ema13 <= -0.02461 )
								if( tema <= 10.203 )
									ret := 0.135669
								if( tema > 10.203 )
									ret := 0.376761
							if( ema13 > -0.02461 )
								if( ema2 <= 9.97856 )
									ret := 0.528846
								if( ema2 > 9.97856 )
									ret := 0.095982
					if( ema12 > -0.011309 )
						if( VIP <= 1.10013 )
							if( ema12 <= -0.008062 )
								if( VIP <= 0.834797 )
									ret := 0.109145
								if( VIP > 0.834797 )
									ret := -0.118526
							if( ema12 > -0.008062 )
								if( tema <= 8.47378 )
									ret := -0.764706 // sell
								if( tema > 8.47378 )
									ret := 0.099842
						if( VIP > 1.10013 )
							if( ema3 <= 8.73468 )
								if( ema2 <= 8.67168 )
									ret := 0.231884
								if( ema2 > 8.67168 )
									ret := 0.597884
							if( ema3 > 8.73468 )
								if( ema12 <= -0.007846 )
									ret := 0.470948
								if( ema12 > -0.007846 )
									ret := 0.149018
		if( ema3 > 10.3557 )
			if( ema12 <= -0.008431 )
				if( tema <= 16.0187 )
					if( ema1 <= 15.8623 )
						if( VIM <= 3.46141 )
							if( ema13 <= -0.35437 )
								if( VIM <= 1.51474 )
									ret := 1.000000 // buy
								if( VIM > 1.51474 )
									ret := 0.875000 // buy
							if( ema13 > -0.35437 )
								if( ema13 <= -0.216925 )
									ret := -0.397906
								if( ema13 > -0.216925 )
									ret := 0.037208
						if( VIM > 3.46141 )
							if( VIM <= 4.39102 )
								if( tema <= 14.8601 )
									ret := 0.553114
								if( tema > 14.8601 )
									ret := -0.290323
							if( VIM > 4.39102 )
								if( ema2 <= 15.0237 )
									ret := 0.030418
								if( ema2 > 15.0237 )
									ret := 0.826087 // buy
					if( ema1 > 15.8623 )
						if( ema3 <= 16.2451 )
							if( ema12 <= -0.013088 )
								if( ema12 <= -0.054892 )
									ret := -0.405405
								if( ema12 > -0.054892 )
									ret := -0.835366 // sell
							if( ema12 > -0.013088 )
								if( ema2 <= 15.9357 )
									ret := -0.888889 // sell
								if( ema2 > 15.9357 )
									ret := 0.384615
						if( ema3 > 16.2451 )
							if( ema12 <= -0.14277 )
								ret := -0.272727
							if( ema12 > -0.14277 )
								ret := 1.000000 // buy
				if( tema > 16.0187 )
					if( ema2 <= 17.6616 )
						if( ema2 <= 16.282 )
							if( VIP <= 0.915638 )
								if( VIP <= 0.749313 )
									ret := 0.246154
								if( VIP > 0.749313 )
									ret := 0.643564
							if( VIP > 0.915638 )
								if( ema12 <= -0.03922 )
									ret := 0.875000 // buy
								if( ema12 > -0.03922 )
									ret := 0.011236
						if( ema2 > 16.282 )
							if( ema1 <= 16.7514 )
								if( VIM <= 1.3972 )
									ret := 0.012202
								if( VIM > 1.3972 )
									ret := 0.312500
							if( ema1 > 16.7514 )
								if( ema1 <= 17.1086 )
									ret := 0.368923
								if( ema1 > 17.1086 )
									ret := 0.135609
					if( ema2 > 17.6616 )
						if( VIP <= 0.845488 )
							if( VIP_VIM <= -0.566692 )
								if( tema <= 17.4007 )
									ret := -1.000000 // sell
								if( tema > 17.4007 )
									ret := 0.168675
							if( VIP_VIM > -0.566692 )
								if( VIP <= 0.823175 )
									ret := -0.692308
								if( VIP > 0.823175 )
									ret := -0.200000
						if( VIP > 0.845488 )
							if( VIP_VIM <= -0.794493 )
								if( VIP <= 1.29466 )
									ret := 1.000000 // buy
								if( VIP > 1.29466 )
									ret := 0.833333 // buy
							if( VIP_VIM > -0.794493 )
								if( tema <= 17.6115 )
									ret := -0.774194 // sell
								if( tema > 17.6115 )
									ret := 0.064639
			if( ema12 > -0.008431 )
				if( ema3 <= 16.351 )
					if( VIP_VIM <= -0.058363 )
						if( VIM <= 1.1546 )
							if( ema2 <= 10.4134 )
								if( ema3 <= 10.4089 )
									ret := -0.294444
								if( ema3 > 10.4089 )
									ret := -0.767442 // sell
							if( ema2 > 10.4134 )
								if( ema2 <= 10.4514 )
									ret := 0.236842
								if( ema2 > 10.4514 )
									ret := -0.071340
						if( VIM > 1.1546 )
							if( tema <= 13.3539 )
								if( ema3 <= 13.353 )
									ret := 0.057745
								if( ema3 > 13.353 )
									ret := 0.857143 // buy
							if( tema > 13.3539 )
								if( ema1 <= 14.0952 )
									ret := -0.116105
								if( ema1 > 14.0952 )
									ret := 0.094737
					if( VIP_VIM > -0.058363 )
						if( ema3 <= 16.2467 )
							if( ema1 <= 16.1745 )
								if( VIP <= 1.22721 )
									ret := 0.023716
								if( VIP > 1.22721 )
									ret := 0.103939
							if( ema1 > 16.1745 )
								if( VIP_VIM <= 0.054588 )
									ret := -0.304348
								if( VIP_VIM > 0.054588 )
									ret := -0.857143 // sell
						if( ema3 > 16.2467 )
							if( ema3 <= 16.262 )
								if( VIP <= 0.987594 )
									ret := 0.909091 // buy
								if( VIP > 0.987594 )
									ret := 1.000000 // buy
							if( ema3 > 16.262 )
								if( ema1 <= 16.3392 )
									ret := 0.271845
								if( ema1 > 16.3392 )
									ret := 1.000000 // buy
				if( ema3 > 16.351 )
					if( ema2 <= 17.0808 )
						if( VIM <= 10.9767 )
							if( ema13 <= -0.023312 )
								if( VIP <= 0.911806 )
									ret := 0.684211
								if( VIP > 0.911806 )
									ret := 0.280000
							if( ema13 > -0.023312 )
								if( VIP <= 1.10188 )
									ret := -0.339785
								if( VIP > 1.10188 )
									ret := -0.072106
						if( VIM > 10.9767 )
							if( ema12 <= -0.002981 )
								ret := -0.846154 // sell
							if( ema12 > -0.002981 )
								ret := -1.000000 // sell
					if( ema2 > 17.0808 )
						if( VIP <= 0.954127 )
							if( ema3 <= 18.2891 )
								if( ema1 <= 17.1656 )
									ret := 0.234043
								if( ema1 > 17.1656 )
									ret := -0.425121
							if( ema3 > 18.2891 )
								if( ema3 <= 18.6166 )
									ret := 0.785714 // buy
								if( ema3 > 18.6166 )
									ret := 0.500000
						if( VIP > 0.954127 )
							if( ema2 <= 17.7804 )
								if( ema1 <= 17.6517 )
									ret := 0.113537
								if( ema1 > 17.6517 )
									ret := 0.591304
							if( ema2 > 17.7804 )
								if( ema2 <= 17.9161 )
									ret := -0.500000
								if( ema2 > 17.9161 )
									ret := -0.020408
	if( ema12 > -0.000291 )
		if( tema <= 18.3648 )
			if( VIP <= 1.45274 )
				if( ema1 <= 17.8879 )
					if( VIM <= 0.591808 )
						if( ema3 <= 11.15 )
							if( VIP <= 1.24168 )
								if( ema3 <= 10.1311 )
									ret := 0.416667
								if( ema3 > 10.1311 )
									ret := -1.000000 // sell
							if( VIP > 1.24168 )
								if( VIP_VIM <= 0.824822 )
									ret := 0.872549 // buy
								if( VIP_VIM > 0.824822 )
									ret := 0.604651
						if( ema3 > 11.15 )
							if( ema1 <= 14.5712 )
								if( VIP_VIM <= 0.836963 )
									ret := -0.223301
								if( VIP_VIM > 0.836963 )
									ret := 0.445946
							if( ema1 > 14.5712 )
								if( ema1 <= 17.736 )
									ret := -0.401460
								if( ema1 > 17.736 )
									ret := 0.714286 // buy
					if( VIM > 0.591808 )
						if( ema12 <= 0.021548 )
							if( ema3 <= 17.6499 )
								if( VIP_VIM <= 0.137844 )
									ret := -0.049261
								if( VIP_VIM > 0.137844 )
									ret := 0.019420
							if( ema3 > 17.6499 )
								if( ema2 <= 17.7079 )
									ret := -0.687500
								if( ema2 > 17.7079 )
									ret := -0.177570
						if( ema12 > 0.021548 )
							if( ema12 <= 0.128503 )
								if( ema2 <= 16.7572 )
									ret := -0.077198
								if( ema2 > 16.7572 )
									ret := -0.318744
							if( ema12 > 0.128503 )
								if( ema2 <= 17.0132 )
									ret := 0.101190
								if( ema2 > 17.0132 )
									ret := 0.926829 // buy
				if( ema1 > 17.8879 )
					if( ema1 <= 18.2098 )
						if( VIP_VIM <= 0.085193 )
							if( VIP_VIM <= 0.057202 )
								if( tema <= 18.1028 )
									ret := -0.222222
								if( tema > 18.1028 )
									ret := 0.807692 // buy
							if( VIP_VIM > 0.057202 )
								ret := -0.590909
						if( VIP_VIM > 0.085193 )
							if( ema13 <= 0.012613 )
								if( ema2 <= 18.0689 )
									ret := 0.076923
								if( ema2 > 18.0689 )
									ret := -0.642857
							if( ema13 > 0.012613 )
								if( VIP <= 1.09171 )
									ret := 0.947368 // buy
								if( VIP > 1.09171 )
									ret := 0.681818
					if( ema1 > 18.2098 )
						if( ema2 <= 18.2614 )
							if( ema3 <= 18.2242 )
								if( ema2 <= 18.2218 )
									ret := -0.320000
								if( ema2 > 18.2218 )
									ret := -0.783784 // sell
							if( ema3 > 18.2242 )
								ret := 0.444444
						if( ema2 > 18.2614 )
							if( VIM <= 0.956968 )
								if( ema1 <= 18.315 )
									ret := 0.315789
								if( ema1 > 18.315 )
									ret := 1.000000 // buy
							if( VIM > 0.956968 )
								if( VIP <= 1.23259 )
									ret := -0.285714
								if( VIP > 1.23259 )
									ret := 0.800000 // buy
			if( VIP > 1.45274 )
				if( ema12 <= 0.011012 )
					if( VIM <= 1.50093 )
						if( VIP <= 2.42567 )
							if( VIM <= 1.19424 )
								if( ema3 <= 10.2137 )
									ret := 0.267045
								if( ema3 > 10.2137 )
									ret := -0.070988
							if( VIM > 1.19424 )
								if( VIP_VIM <= 0.979965 )
									ret := -0.238179
								if( VIP_VIM > 0.979965 )
									ret := 0.270270
						if( VIP > 2.42567 )
							if( tema <= 16.27 )
								if( VIP_VIM <= 1.03469 )
									ret := 0.090909
								if( VIP_VIM > 1.03469 )
									ret := -0.708861 // sell
							if( tema > 16.27 )
								ret := 0.214286
					if( VIM > 1.50093 )
						if( ema3 <= 8.71153 )
							if( ema3 <= 8.62368 )
								if( ema2 <= 8.61305 )
									ret := 0.000000
								if( ema2 > 8.61305 )
									ret := -0.228571
							if( ema3 > 8.62368 )
								if( VIP_VIM <= -0.195363 )
									ret := 0.125000
								if( VIP_VIM > -0.195363 )
									ret := -0.652542
						if( ema3 > 8.71153 )
							if( tema <= 10.4933 )
								if( ema13 <= 0.00956 )
									ret := -0.014934
								if( ema13 > 0.00956 )
									ret := 0.164885
							if( tema > 10.4933 )
								if( ema3 <= 10.7656 )
									ret := -0.347280
								if( ema3 > 10.7656 )
									ret := -0.042459
				if( ema12 > 0.011012 )
					if( ema2 <= 13.5682 )
						if( ema2 <= 11.2448 )
							if( tema <= 10.6115 )
								if( ema1 <= 10.4729 )
									ret := -0.275728
								if( ema1 > 10.4729 )
									ret := -0.734940 // sell
							if( tema > 10.6115 )
								if( ema2 <= 10.6179 )
									ret := 0.888889 // buy
								if( ema2 > 10.6179 )
									ret := 0.015228
						if( ema2 > 11.2448 )
							if( ema13 <= 0.160579 )
								if( tema <= 13.5701 )
									ret := -0.457109
								if( tema > 13.5701 )
									ret := -0.901961 // sell
							if( ema13 > 0.160579 )
								if( ema13 <= 0.184248 )
									ret := 1.000000 // buy
								if( ema13 > 0.184248 )
									ret := -0.250000
					if( ema2 > 13.5682 )
						if( ema3 <= 16.9506 )
							if( VIM <= 2.56963 )
								if( VIM <= 2.17446 )
									ret := -0.113208
								if( VIM > 2.17446 )
									ret := -0.625000
							if( VIM > 2.56963 )
								if( ema2 <= 16.6034 )
									ret := 0.219807
								if( ema2 > 16.6034 )
									ret := -0.642857
						if( ema3 > 16.9506 )
							if( ema12 <= 0.030197 )
								if( VIP_VIM <= 0.583159 )
									ret := 0.181818
								if( VIP_VIM > 0.583159 )
									ret := -0.602273
							if( ema12 > 0.030197 )
								if( VIP <= 1.65952 )
									ret := -0.666667
								if( VIP > 1.65952 )
									ret := -1.000000 // sell
		if( tema > 18.3648 )
			if( ema2 <= 18.345 )
				if( ema13 <= 0.085202 )
					ret := -0.400000
				if( ema13 > 0.085202 )
					if( ema1 <= 18.3972 )
						if( tema <= 18.4702 )
							ret := -1.000000 // sell
						if( tema > 18.4702 )
							ret := -0.818182 // sell
					if( ema1 > 18.3972 )
						ret := -0.600000
			if( ema2 > 18.345 )
				if( ema3 <= 18.6935 )
					if( VIP <= 1.198 )
						if( ema13 <= 0.10879 )
							if( VIM <= 0.920431 )
								if( VIP_VIM <= 0.240711 )
									ret := -0.674419
								if( VIP_VIM > 0.240711 )
									ret := -0.148936
							if( VIM > 0.920431 )
								if( VIP <= 1.05533 )
									ret := -0.390625
								if( VIP > 1.05533 )
									ret := 0.875000 // buy
						if( ema13 > 0.10879 )
							if( tema <= 18.6252 )
								ret := -1.000000 // sell
							if( tema > 18.6252 )
								ret := -0.888889 // sell
					if( VIP > 1.198 )
						if( ema2 <= 18.5178 )
							if( VIP <= 1.50763 )
								if( ema1 <= 18.4616 )
									ret := 1.000000 // buy
								if( ema1 > 18.4616 )
									ret := 0.750000 // buy
							if( VIP > 1.50763 )
								ret := 0.181818
						if( ema2 > 18.5178 )
							ret := -0.916667 // sell
				if( ema3 > 18.6935 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_RIVN_1Min_4acfedeb(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)

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


