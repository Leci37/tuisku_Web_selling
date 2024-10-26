//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ADSK_15Min_2TV0_f6074f7c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2TV0_f6074f7c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_f6074f7c(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema3 <= 198.42 )
		if( VIM <= 1.48534 )
			if( ema1 <= 196.545 )
				if( ema12 <= 2.92929 )
					if( ema12 <= 0.622004 )
						if( tema <= 196.034 )
							if( VIM <= 1.12712 )
								if( ema1 <= 74.8124 )
									ret := 0.400000
								if( ema1 > 74.8124 )
									ret := -0.018714
							if( VIM > 1.12712 )
								if( tema <= 112.24 )
									ret := -0.089808
								if( tema > 112.24 )
									ret := 0.090654
						if( tema > 196.034 )
							if( ema2 <= 196.353 )
								if( ema1 <= 195.553 )
									ret := -0.837838 // sell
								if( ema1 > 195.553 )
									ret := -0.138249
							if( ema2 > 196.353 )
								if( VIM <= 1.0704 )
									ret := -0.924528 // sell
								if( VIM > 1.0704 )
									ret := -0.615385
					if( ema12 > 0.622004 )
						if( ema1 <= 149.263 )
							if( VIP_VIM <= -0.031026 )
								ret := -0.666667
							if( VIP_VIM > -0.031026 )
								if( ema1 <= 139.366 )
									ret := 0.235023
								if( ema1 > 139.366 )
									ret := 0.451546
						if( ema1 > 149.263 )
							if( ema2 <= 188.293 )
								if( tema <= 190.34 )
									ret := 0.057056
								if( tema > 190.34 )
									ret := 0.838710 // buy
							if( ema2 > 188.293 )
								if( VIP <= 1.13253 )
									ret := 0.564103
								if( VIP > 1.13253 )
									ret := -0.131175
				if( ema12 > 2.92929 )
					if( ema3 <= 172.51 )
						if( tema <= 149.233 )
							ret := -0.500000
						if( tema > 149.233 )
							if( ema2 <= 152.435 )
								ret := -1.000000 // sell
							if( ema2 > 152.435 )
								ret := -0.687500
					if( ema3 > 172.51 )
						ret := -0.200000
			if( ema1 > 196.545 )
				if( ema1 <= 201.241 )
					if( tema <= 196.147 )
						if( ema12 <= -0.875941 )
							ret := 0.266667
						if( ema12 > -0.875941 )
							if( VIP_VIM <= -0.360017 )
								ret := 0.909091 // buy
							if( VIP_VIM > -0.360017 )
								ret := 1.000000 // buy
					if( tema > 196.147 )
						if( ema2 <= 198.026 )
							if( ema2 <= 197.172 )
								if( tema <= 196.981 )
									ret := 0.102941
								if( tema > 196.981 )
									ret := 0.523077
							if( ema2 > 197.172 )
								if( ema12 <= 1.39159 )
									ret := 0.015306
								if( ema12 > 1.39159 )
									ret := 0.800000 // buy
						if( ema2 > 198.026 )
							if( ema12 <= 0.187025 )
								if( VIP_VIM <= -0.085299 )
									ret := 0.666667
								if( VIP_VIM > -0.085299 )
									ret := 0.955556 // buy
							if( ema12 > 0.187025 )
								if( ema1 <= 198.896 )
									ret := 0.315789
								if( ema1 > 198.896 )
									ret := 0.630682
				if( ema1 > 201.241 )
					if( tema <= 204.254 )
						if( ema2 <= 199.709 )
							ret := -1.000000 // sell
						if( ema2 > 199.709 )
							ret := -0.500000
					if( tema > 204.254 )
						ret := 0.083333
		if( VIM > 1.48534 )
			if( ema13 <= -0.152013 )
				if( ema12 <= -0.25256 )
					if( VIP_VIM <= -0.326016 )
						if( ema3 <= 197.146 )
							if( ema2 <= 181.784 )
								if( tema <= 131.218 )
									ret := 0.519531
								if( tema > 131.218 )
									ret := 0.232323
							if( ema2 > 181.784 )
								if( VIP <= 2.02904 )
									ret := 0.719101 // buy
								if( VIP > 2.02904 )
									ret := 0.333333
						if( ema3 > 197.146 )
							if( tema <= 193.566 )
								ret := -0.714286 // sell
							if( tema > 193.566 )
								ret := -0.111111
					if( VIP_VIM > -0.326016 )
						if( ema2 <= 194.165 )
							if( ema2 <= 178.345 )
								if( ema3 <= 153.463 )
									ret := -0.155102
								if( ema3 > 153.463 )
									ret := 0.764045 // buy
							if( ema2 > 178.345 )
								if( VIP_VIM <= -0.006906 )
									ret := -0.697674
								if( VIP_VIM > -0.006906 )
									ret := 0.384615
						if( ema2 > 194.165 )
							if( ema12 <= -0.759553 )
								ret := 0.200000
							if( ema12 > -0.759553 )
								if( ema12 <= -0.626279 )
									ret := 1.000000 // buy
								if( ema12 > -0.626279 )
									ret := 0.916667 // buy
				if( ema12 > -0.25256 )
					if( ema1 <= 83.2111 )
						ret := -0.454545
					if( ema1 > 83.2111 )
						if( VIM <= 1.5874 )
							if( ema3 <= 106.963 )
								if( tema <= 91.6713 )
									ret := 0.733333 // buy
								if( tema > 91.6713 )
									ret := 1.000000 // buy
							if( ema3 > 106.963 )
								if( ema12 <= -0.191226 )
									ret := 0.840000 // buy
								if( ema12 > -0.191226 )
									ret := 0.458333
						if( VIM > 1.5874 )
							if( ema3 <= 143.515 )
								if( ema3 <= 138.726 )
									ret := 0.488636
								if( ema3 > 138.726 )
									ret := -1.000000 // sell
							if( ema3 > 143.515 )
								if( VIP <= 1.21929 )
									ret := 0.266667
								if( VIP > 1.21929 )
									ret := 0.833333 // buy
			if( ema13 > -0.152013 )
				if( VIP <= 2.6662 )
					if( tema <= 91.2131 )
						if( VIP_VIM <= -0.151427 )
							if( ema1 <= 83.2791 )
								ret := -0.750000 // sell
							if( ema1 > 83.2791 )
								ret := -1.000000 // sell
						if( VIP_VIM > -0.151427 )
							ret := -0.153846
					if( tema > 91.2131 )
						if( ema12 <= -0.002834 )
							if( ema1 <= 136.524 )
								if( ema2 <= 136.448 )
									ret := 0.072727
								if( ema2 > 136.448 )
									ret := -1.000000 // sell
							if( ema1 > 136.524 )
								if( ema3 <= 165.412 )
									ret := 0.746835 // buy
								if( ema3 > 165.412 )
									ret := -0.080000
						if( ema12 > -0.002834 )
							if( ema1 <= 198.981 )
								if( VIP <= 1.66389 )
									ret := -0.303167
								if( VIP > 1.66389 )
									ret := 0.079365
							if( ema1 > 198.981 )
								ret := 0.647059
				if( VIP > 2.6662 )
					if( ema12 <= 0.56686 )
						if( ema3 <= 159.475 )
							if( tema <= 90.1796 )
								ret := 0.416667
							if( tema > 90.1796 )
								if( ema2 <= 143.932 )
									ret := 0.931034 // buy
								if( ema2 > 143.932 )
									ret := 1.000000 // buy
						if( ema3 > 159.475 )
							if( VIP_VIM <= -0.111004 )
								ret := 0.600000
							if( VIP_VIM > -0.111004 )
								ret := 0.181818
					if( ema12 > 0.56686 )
						if( VIP <= 5.87195 )
							if( ema2 <= 166.17 )
								if( ema13 <= 1.1111 )
									ret := 0.727273 // buy
								if( ema13 > 1.1111 )
									ret := -0.166667
							if( ema2 > 166.17 )
								ret := 0.833333 // buy
						if( VIP > 5.87195 )
							ret := -0.818182 // sell
	if( ema3 > 198.42 )
		if( ema3 <= 209.701 )
			if( ema3 <= 200.131 )
				if( ema13 <= 2.31628 )
					if( ema12 <= 0.716473 )
						if( ema12 <= -1.64032 )
							if( VIP_VIM <= -0.543394 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.543394 )
								ret := 0.777778 // buy
						if( ema12 > -1.64032 )
							if( ema1 <= 200.189 )
								if( ema2 <= 199.566 )
									ret := -0.277078
								if( ema2 > 199.566 )
									ret := 0.202128
							if( ema1 > 200.189 )
								if( VIP_VIM <= 0.433014 )
									ret := -0.674419
								if( VIP_VIM > 0.433014 )
									ret := -0.117647
					if( ema12 > 0.716473 )
						if( VIP <= 2.2285 )
							if( ema13 <= 2.19935 )
								if( VIP_VIM <= 0.577832 )
									ret := 0.786885 // buy
								if( VIP_VIM > 0.577832 )
									ret := 0.391304
							if( ema13 > 2.19935 )
								ret := -0.125000
						if( VIP > 2.2285 )
							ret := -1.000000 // sell
				if( ema13 > 2.31628 )
					if( ema13 <= 3.56557 )
						if( VIP_VIM <= 0.902807 )
							if( VIP_VIM <= 0.690878 )
								if( VIM <= 1.30683 )
									ret := -0.666667
								if( VIM > 1.30683 )
									ret := -0.916667 // sell
							if( VIP_VIM > 0.690878 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.902807 )
							ret := 0.200000
					if( ema13 > 3.56557 )
						if( ema12 <= 3.37715 )
							ret := 0.266667
						if( ema12 > 3.37715 )
							ret := -0.476190
			if( ema3 > 200.131 )
				if( ema13 <= -2.18089 )
					if( ema12 <= -1.41319 )
						if( VIM <= 1.22159 )
							ret := -0.947368 // sell
						if( VIM > 1.22159 )
							if( ema13 <= -3.38681 )
								if( ema13 <= -5.23202 )
									ret := -0.318182
								if( ema13 > -5.23202 )
									ret := -0.753623 // sell
							if( ema13 > -3.38681 )
								if( ema13 <= -2.53684 )
									ret := 0.473684
								if( ema13 > -2.53684 )
									ret := 0.846154 // buy
					if( ema12 > -1.41319 )
						if( tema <= 204.916 )
							if( ema3 <= 206.588 )
								if( VIP_VIM <= -0.60863 )
									ret := -0.828125 // sell
								if( VIP_VIM > -0.60863 )
									ret := -0.516129
							if( ema3 > 206.588 )
								ret := -0.200000
						if( tema > 204.916 )
							if( VIP <= 0.873829 )
								ret := -0.933333 // sell
							if( VIP > 0.873829 )
								ret := -1.000000 // sell
				if( ema13 > -2.18089 )
					if( ema12 <= -1.17266 )
						if( VIP_VIM <= -0.66847 )
							ret := 0.000000
						if( VIP_VIM > -0.66847 )
							if( ema1 <= 202.077 )
								ret := 0.227273
							if( ema1 > 202.077 )
								if( ema1 <= 204.909 )
									ret := 0.921053 // buy
								if( ema1 > 204.909 )
									ret := 0.714286 // buy
					if( ema12 > -1.17266 )
						if( ema2 <= 202.928 )
							if( ema12 <= 1.13824 )
								if( ema3 <= 202.714 )
									ret := -0.057123
								if( ema3 > 202.714 )
									ret := 0.285124
							if( ema12 > 1.13824 )
								if( ema1 <= 203.109 )
									ret := 0.785714 // buy
								if( ema1 > 203.109 )
									ret := 0.358491
						if( ema2 > 202.928 )
							if( ema13 <= 7.75362 )
								if( ema2 <= 206.785 )
									ret := -0.227366
								if( ema2 > 206.785 )
									ret := -0.039743
							if( ema13 > 7.75362 )
								if( VIM <= 0.946754 )
									ret := 0.500000
								if( VIM > 0.946754 )
									ret := 1.000000 // buy
		if( ema3 > 209.701 )
			if( ema1 <= 211.879 )
				if( ema12 <= 0.434808 )
					if( ema1 <= 211.761 )
						if( VIM <= 1.27784 )
							if( ema13 <= -1.08261 )
								if( ema3 <= 214.878 )
									ret := -0.486364
								if( ema3 > 214.878 )
									ret := 0.555556
							if( ema13 > -1.08261 )
								if( tema <= 210.903 )
									ret := 0.206977
								if( tema > 210.903 )
									ret := -0.276265
						if( VIM > 1.27784 )
							if( ema13 <= -4.83828 )
								ret := -1.000000 // sell
							if( ema13 > -4.83828 )
								if( VIP_VIM <= -0.568102 )
									ret := 0.077982
								if( VIP_VIM > -0.568102 )
									ret := 0.488889
					if( ema1 > 211.761 )
						if( ema2 <= 211.836 )
							if( ema2 <= 211.484 )
								ret := 0.700000 // buy
							if( ema2 > 211.484 )
								ret := 1.000000 // buy
						if( ema2 > 211.836 )
							if( VIP_VIM <= -0.360994 )
								if( VIM <= 1.35631 )
									ret := 0.133333
								if( VIM > 1.35631 )
									ret := 0.952381 // buy
							if( VIP_VIM > -0.360994 )
								ret := -1.000000 // sell
				if( ema12 > 0.434808 )
					if( ema2 <= 210.79 )
						if( VIP <= 1.27686 )
							ret := 0.785714 // buy
						if( VIP > 1.27686 )
							ret := 0.291667
					if( ema2 > 210.79 )
						if( ema12 <= 0.724533 )
							if( ema1 <= 211.67 )
								ret := 0.625000
							if( ema1 > 211.67 )
								ret := 0.882353 // buy
						if( ema12 > 0.724533 )
							if( VIP <= 1.3621 )
								ret := 1.000000 // buy
							if( VIP > 1.3621 )
								ret := 0.909091 // buy
			if( ema1 > 211.879 )
				if( ema13 <= -1.66648 )
					if( ema12 <= -2.5188 )
						if( VIP <= 0.550288 )
							if( ema12 <= -4.83169 )
								if( ema1 <= 269.166 )
									ret := -0.909091 // sell
								if( ema1 > 269.166 )
									ret := 0.125000
							if( ema12 > -4.83169 )
								if( ema2 <= 298.838 )
									ret := -0.545455
								if( ema2 > 298.838 )
									ret := -1.000000 // sell
						if( VIP > 0.550288 )
							if( ema12 <= -3.39658 )
								if( VIM <= 1.41524 )
									ret := 0.339623
								if( VIM > 1.41524 )
									ret := 0.861111 // buy
							if( ema12 > -3.39658 )
								if( ema1 <= 239.669 )
									ret := 0.531250
								if( ema1 > 239.669 )
									ret := -0.046154
					if( ema12 > -2.5188 )
						if( ema3 <= 324.271 )
							if( ema3 <= 322.813 )
								if( tema <= 212.691 )
									ret := -0.449198
								if( tema > 212.691 )
									ret := -0.127574
							if( ema3 > 322.813 )
								if( VIP_VIM <= -0.425002 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.425002 )
									ret := 0.812500 // buy
						if( ema3 > 324.271 )
							if( VIP <= 0.946572 )
								if( ema12 <= -1.05532 )
									ret := -0.100000
								if( ema12 > -1.05532 )
									ret := -0.791667 // sell
							if( VIP > 0.946572 )
								if( VIP <= 0.976634 )
									ret := -0.882353 // sell
								if( VIP > 0.976634 )
									ret := -1.000000 // sell
				if( ema13 > -1.66648 )
					if( ema1 <= 221.19 )
						if( ema12 <= -0.40928 )
							if( tema <= 217.471 )
								if( ema12 <= -0.486884 )
									ret := -0.382423
								if( ema12 > -0.486884 )
									ret := -0.734848 // sell
							if( tema > 217.471 )
								if( VIP_VIM <= -0.016461 )
									ret := -0.019231
								if( VIP_VIM > -0.016461 )
									ret := 0.800000 // buy
						if( ema12 > -0.40928 )
							if( tema <= 217.097 )
								if( ema3 <= 212.37 )
									ret := -0.188442
								if( ema3 > 212.37 )
									ret := 0.120354
							if( tema > 217.097 )
								if( ema3 <= 220.548 )
									ret := -0.159897
								if( ema3 > 220.548 )
									ret := -0.595506
					if( ema1 > 221.19 )
						if( VIP_VIM <= 0.348819 )
							if( ema2 <= 258.486 )
								if( ema1 <= 257.896 )
									ret := 0.077541
								if( ema1 > 257.896 )
									ret := 0.458333
							if( ema2 > 258.486 )
								if( tema <= 258.43 )
									ret := -0.800000 // sell
								if( tema > 258.43 )
									ret := -0.021849
						if( VIP_VIM > 0.348819 )
							if( VIP <= 2.23179 )
								if( ema3 <= 227.514 )
									ret := 0.163265
								if( ema3 > 227.514 )
									ret := -0.083765
							if( VIP > 2.23179 )
								if( VIP_VIM <= 0.788749 )
									ret := -0.975000 // sell
								if( VIP_VIM > 0.788749 )
									ret := -0.307692
	
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
float op_operation = decision_tree_0_ADSK_15Min_f6074f7c(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


