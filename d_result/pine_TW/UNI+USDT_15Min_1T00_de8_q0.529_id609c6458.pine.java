//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: UNIUSDT_15Min_1T00_609c6458 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1T00_609c6458", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_609c6458(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.024929 )
		if( ema12 <= -0.126177 )
			if( ema1 <= 12.0956 )
				if( ema3 <= 12.1479 )
					if( ema1 <= 4.79421 )
						if( ema3 <= 4.55971 )
							if( ema12 <= -0.177078 )
								if( ema1 <= 4.10464 )
									ret := -0.750000 // sell
								if( ema1 > 4.10464 )
									ret := -1.000000 // sell
							if( ema12 > -0.177078 )
								ret := 1.000000 // buy
						if( ema3 > 4.55971 )
							if( tema <= 4.19435 )
								ret := -1.000000 // sell
							if( tema > 4.19435 )
								if( tema <= 4.33025 )
									ret := 0.000000
								if( tema > 4.33025 )
									ret := -1.000000 // sell
					if( ema1 > 4.79421 )
						if( tema <= 6.43145 )
							if( ema2 <= 5.80819 )
								if( ema12 <= -0.127727 )
									ret := 0.972222 // buy
								if( ema12 > -0.127727 )
									ret := 0.400000
							if( ema2 > 5.80819 )
								if( tema <= 5.4657 )
									ret := -0.750000 // sell
								if( tema > 5.4657 )
									ret := 0.704082 // buy
						if( tema > 6.43145 )
							if( ema1 <= 6.7871 )
								if( ema3 <= 6.96882 )
									ret := -0.625000
								if( ema3 > 6.96882 )
									ret := -1.000000 // sell
							if( ema1 > 6.7871 )
								if( ema12 <= -0.138035 )
									ret := 0.468254
								if( ema12 > -0.138035 )
									ret := 0.035294
				if( ema3 > 12.1479 )
					if( ema1 <= 11.935 )
						ret := -0.750000 // sell
					if( ema1 > 11.935 )
						if( tema <= 11.7245 )
							ret := -1.000000 // sell
						if( tema > 11.7245 )
							ret := -0.750000 // sell
			if( ema1 > 12.0956 )
				if( ema1 <= 13.2205 )
					if( ema12 <= -0.154513 )
						if( tema <= 12.843 )
							ret := 1.000000 // buy
						if( tema > 12.843 )
							ret := 0.750000 // buy
					if( ema12 > -0.154513 )
						if( ema12 <= -0.136065 )
							ret := 0.200000
						if( ema12 > -0.136065 )
							if( ema13 <= -0.231728 )
								ret := 0.750000 // buy
							if( ema13 > -0.231728 )
								ret := 1.000000 // buy
				if( ema1 > 13.2205 )
					if( ema1 <= 13.6915 )
						if( ema13 <= -0.362392 )
							ret := 0.200000
						if( ema13 > -0.362392 )
							ret := -0.500000
					if( ema1 > 13.6915 )
						if( tema <= 13.5729 )
							ret := 1.000000 // buy
						if( tema > 13.5729 )
							if( ema13 <= -0.258051 )
								if( ema13 <= -0.302104 )
									ret := 0.750000 // buy
								if( ema13 > -0.302104 )
									ret := 1.000000 // buy
							if( ema13 > -0.258051 )
								if( tema <= 13.7993 )
									ret := 0.888889 // buy
								if( tema > 13.7993 )
									ret := 0.250000
		if( ema12 > -0.126177 )
			if( ema1 <= 5.0639 )
				if( ema2 <= 5.01435 )
					if( tema <= 4.91308 )
						if( ema1 <= 3.52672 )
							ret := 1.000000 // buy
						if( ema1 > 3.52672 )
							if( ema3 <= 3.88575 )
								if( ema13 <= -0.115656 )
									ret := 0.888889 // buy
								if( ema13 > -0.115656 )
									ret := -0.390977
							if( ema3 > 3.88575 )
								if( ema1 <= 3.91326 )
									ret := 0.809524 // buy
								if( ema1 > 3.91326 )
									ret := 0.245495
					if( tema > 4.91308 )
						if( ema13 <= -0.061471 )
							if( tema <= 4.93405 )
								ret := 0.000000
							if( tema > 4.93405 )
								ret := -0.500000
						if( ema13 > -0.061471 )
							if( ema13 <= -0.046567 )
								if( ema12 <= -0.034079 )
									ret := -0.750000 // sell
								if( ema12 > -0.034079 )
									ret := -1.000000 // sell
							if( ema13 > -0.046567 )
								ret := -0.200000
				if( ema2 > 5.01435 )
					if( ema13 <= -0.214332 )
						ret := -0.833333 // sell
					if( ema13 > -0.214332 )
						if( tema <= 5.03 )
							if( ema13 <= -0.048891 )
								if( ema12 <= -0.048379 )
									ret := 0.636986
								if( ema12 > -0.048379 )
									ret := 0.838983 // buy
							if( ema13 > -0.048891 )
								if( ema2 <= 5.07781 )
									ret := 0.041667
								if( ema2 > 5.07781 )
									ret := 1.000000 // buy
						if( tema > 5.03 )
							ret := -0.571429
			if( ema1 > 5.0639 )
				if( ema2 <= 6.59 )
					if( ema2 <= 6.47739 )
						if( ema13 <= -0.029881 )
							if( tema <= 6.06845 )
								if( tema <= 5.95684 )
									ret := 0.084567
								if( tema > 5.95684 )
									ret := 0.341308
							if( tema > 6.06845 )
								if( ema3 <= 6.40926 )
									ret := -0.080366
								if( ema3 > 6.40926 )
									ret := 0.203085
						if( ema13 > -0.029881 )
							if( ema1 <= 6.37918 )
								if( ema2 <= 6.01902 )
									ret := 0.434783
								if( ema2 > 6.01902 )
									ret := 0.933333 // buy
							if( ema1 > 6.37918 )
								ret := -0.500000
					if( ema2 > 6.47739 )
						if( ema3 <= 6.56488 )
							if( ema1 <= 6.47568 )
								if( ema13 <= -0.054083 )
									ret := -0.237500
								if( ema13 > -0.054083 )
									ret := -0.666667
							if( ema1 > 6.47568 )
								if( tema <= 6.43417 )
									ret := 0.722222 // buy
								if( tema > 6.43417 )
									ret := -0.150943
						if( ema3 > 6.56488 )
							if( ema1 <= 6.51527 )
								if( ema13 <= -0.190794 )
									ret := 0.166667
								if( ema13 > -0.190794 )
									ret := -0.591398
							if( ema1 > 6.51527 )
								if( ema1 <= 6.53664 )
									ret := -0.062500
								if( ema1 > 6.53664 )
									ret := -0.451613
				if( ema2 > 6.59 )
					if( tema <= 6.95612 )
						if( ema2 <= 7.04646 )
							if( tema <= 6.40765 )
								if( ema1 <= 6.53297 )
									ret := -0.333333
								if( ema1 > 6.53297 )
									ret := -1.000000 // sell
							if( tema > 6.40765 )
								if( ema2 <= 6.82833 )
									ret := 0.362280
								if( ema2 > 6.82833 )
									ret := 0.166467
						if( ema2 > 7.04646 )
							if( ema13 <= -0.107619 )
								if( ema3 <= 7.12309 )
									ret := 0.857143 // buy
								if( ema3 > 7.12309 )
									ret := 0.975904 // buy
							if( ema13 > -0.107619 )
								if( ema2 <= 7.05668 )
									ret := 1.000000 // buy
								if( ema2 > 7.05668 )
									ret := 0.052632
					if( tema > 6.95612 )
						if( ema12 <= -0.036344 )
							if( ema2 <= 7.07789 )
								if( ema1 <= 7.01122 )
									ret := 0.111111
								if( ema1 > 7.01122 )
									ret := -0.840000 // sell
							if( ema2 > 7.07789 )
								if( ema13 <= -0.215017 )
									ret := -0.432692
								if( ema13 > -0.215017 )
									ret := 0.105935
						if( ema12 > -0.036344 )
							if( ema1 <= 7.08553 )
								if( tema <= 6.98008 )
									ret := 0.500000
								if( tema > 6.98008 )
									ret := -0.342105
							if( ema1 > 7.08553 )
								if( ema13 <= -0.082823 )
									ret := -0.284314
								if( ema13 > -0.082823 )
									ret := 0.239216
	if( ema12 > -0.024929 )
		if( ema1 <= 6.16149 )
			if( ema2 <= 3.59482 )
				if( tema <= 3.67717 )
					if( ema3 <= 3.52322 )
						ret := 0.500000
					if( ema3 > 3.52322 )
						if( ema2 <= 3.58189 )
							if( ema2 <= 3.5807 )
								if( ema3 <= 3.55034 )
									ret := 1.000000 // buy
								if( ema3 > 3.55034 )
									ret := 0.923077 // buy
							if( ema2 > 3.5807 )
								ret := 0.250000
						if( ema2 > 3.58189 )
							ret := 1.000000 // buy
				if( tema > 3.67717 )
					ret := 0.000000
			if( ema2 > 3.59482 )
				if( ema1 <= 3.65179 )
					if( tema <= 3.57864 )
						ret := 1.000000 // buy
					if( tema > 3.57864 )
						if( ema2 <= 3.60525 )
							if( ema1 <= 3.64144 )
								if( ema13 <= -0.021228 )
									ret := 0.200000
								if( ema13 > -0.021228 )
									ret := -0.769231 // sell
							if( ema1 > 3.64144 )
								ret := 0.600000
						if( ema2 > 3.60525 )
							if( ema1 <= 3.60362 )
								ret := -0.500000
							if( ema1 > 3.60362 )
								if( ema1 <= 3.64773 )
									ret := -1.000000 // sell
								if( ema1 > 3.64773 )
									ret := -0.750000 // sell
				if( ema1 > 3.65179 )
					if( tema <= 6.20344 )
						if( ema1 <= 4.67728 )
							if( ema12 <= 0.079628 )
								if( tema <= 3.70243 )
									ret := 0.481928
								if( tema > 3.70243 )
									ret := 0.001617
							if( ema12 > 0.079628 )
								if( ema2 <= 4.3654 )
									ret := 0.857143 // buy
								if( ema2 > 4.3654 )
									ret := 0.090909
						if( ema1 > 4.67728 )
							if( ema13 <= 0.013766 )
								if( ema12 <= -0.012309 )
									ret := 0.140359
								if( ema12 > -0.012309 )
									ret := 0.034214
							if( ema13 > 0.013766 )
								if( ema3 <= 4.85255 )
									ret := 0.285135
								if( ema3 > 4.85255 )
									ret := 0.103429
					if( tema > 6.20344 )
						if( ema3 <= 6.06576 )
							if( tema <= 6.2262 )
								if( tema <= 6.21162 )
									ret := -0.923077 // sell
								if( tema > 6.21162 )
									ret := -0.166667
							if( tema > 6.2262 )
								if( ema13 <= 0.10761 )
									ret := -0.500000
								if( ema13 > 0.10761 )
									ret := -1.000000 // sell
						if( ema3 > 6.06576 )
							if( ema3 <= 6.07557 )
								if( ema1 <= 6.13994 )
									ret := 0.500000
								if( ema1 > 6.13994 )
									ret := -0.200000
							if( ema3 > 6.07557 )
								if( ema12 <= 0.045347 )
									ret := -0.500000
								if( ema12 > 0.045347 )
									ret := -0.800000 // sell
		if( ema1 > 6.16149 )
			if( tema <= 11.0104 )
				if( ema1 <= 10.3959 )
					if( ema2 <= 6.18968 )
						if( ema12 <= 0.037772 )
							if( ema13 <= 0.04987 )
								if( ema2 <= 6.17762 )
									ret := -0.090769
								if( ema2 > 6.17762 )
									ret := -0.318486
							if( ema13 > 0.04987 )
								if( ema1 <= 6.16437 )
									ret := -0.666667
								if( ema1 > 6.16437 )
									ret := 0.331395
						if( ema12 > 0.037772 )
							if( tema <= 6.29999 )
								if( ema3 <= 6.12134 )
									ret := -0.761905 // sell
								if( ema3 > 6.12134 )
									ret := -0.357143
							if( tema > 6.29999 )
								if( tema <= 6.33246 )
									ret := -0.083333
								if( tema > 6.33246 )
									ret := 0.583333
					if( ema2 > 6.18968 )
						if( ema2 <= 7.14825 )
							if( tema <= 7.17016 )
								if( ema13 <= 0.203595 )
									ret := 0.026440
								if( ema13 > 0.203595 )
									ret := -0.609375
							if( tema > 7.17016 )
								if( ema1 <= 7.10612 )
									ret := 0.723404 // buy
								if( ema1 > 7.10612 )
									ret := 0.216438
						if( ema2 > 7.14825 )
							if( ema13 <= -0.027012 )
								if( ema12 <= -0.009419 )
									ret := 0.098443
								if( ema12 > -0.009419 )
									ret := -0.326203
							if( ema13 > -0.027012 )
								if( ema3 <= 7.16062 )
									ret := -0.310606
								if( ema3 > 7.16062 )
									ret := -0.037168
				if( ema1 > 10.3959 )
					if( ema3 <= 10.6992 )
						if( ema1 <= 10.7301 )
							if( ema3 <= 10.4698 )
								if( ema13 <= 0.254523 )
									ret := 0.885246 // buy
								if( ema13 > 0.254523 )
									ret := -0.416667
							if( ema3 > 10.4698 )
								if( ema3 <= 10.5251 )
									ret := -0.720000 // sell
								if( ema3 > 10.5251 )
									ret := 0.324100
						if( ema1 > 10.7301 )
							if( ema12 <= 0.081126 )
								if( ema12 <= 0.041101 )
									ret := 0.222222
								if( ema12 > 0.041101 )
									ret := 0.925373 // buy
							if( ema12 > 0.081126 )
								if( ema13 <= 0.228555 )
									ret := -0.583333
								if( ema13 > 0.228555 )
									ret := 1.000000 // buy
					if( ema3 > 10.6992 )
						if( tema <= 10.7525 )
							if( ema13 <= -0.046172 )
								if( ema2 <= 10.7316 )
									ret := 0.666667
								if( ema2 > 10.7316 )
									ret := 0.200000
							if( ema13 > -0.046172 )
								if( ema3 <= 10.7557 )
									ret := -0.810811 // sell
								if( ema3 > 10.7557 )
									ret := -0.125000
						if( tema > 10.7525 )
							if( ema3 <= 10.8496 )
								if( ema13 <= 0.05969 )
									ret := 0.502646
								if( ema13 > 0.05969 )
									ret := -0.007576
							if( ema3 > 10.8496 )
								if( ema1 <= 10.8762 )
									ret := -0.575342
								if( ema1 > 10.8762 )
									ret := 0.205882
			if( tema > 11.0104 )
				if( ema2 <= 10.8659 )
					if( ema2 <= 10.8319 )
						if( ema12 <= 0.089413 )
							if( ema13 <= 0.138182 )
								ret := -0.500000
							if( ema13 > 0.138182 )
								ret := -1.000000 // sell
						if( ema12 > 0.089413 )
							if( ema13 <= 0.178646 )
								if( ema13 <= 0.162499 )
									ret := -1.000000 // sell
								if( ema13 > 0.162499 )
									ret := -0.500000
							if( ema13 > 0.178646 )
								if( ema13 <= 2.06837 )
									ret := -1.000000 // sell
								if( ema13 > 2.06837 )
									ret := -0.900000 // sell
					if( ema2 > 10.8319 )
						if( ema13 <= 0.126195 )
							ret := -1.000000 // sell
						if( ema13 > 0.126195 )
							if( ema12 <= 0.108991 )
								ret := 0.400000
							if( ema12 > 0.108991 )
								ret := -1.000000 // sell
				if( ema2 > 10.8659 )
					if( ema12 <= 0.217105 )
						if( tema <= 11.3902 )
							if( tema <= 11.1415 )
								if( ema12 <= 0.004175 )
									ret := -0.303279
								if( ema12 > 0.004175 )
									ret := 0.146429
							if( tema > 11.1415 )
								if( ema13 <= 0.071289 )
									ret := -0.203774
								if( ema13 > 0.071289 )
									ret := -0.633508
						if( tema > 11.3902 )
							if( tema <= 12.4858 )
								if( tema <= 12.3077 )
									ret := 0.000908
								if( tema > 12.3077 )
									ret := 0.429688
							if( tema > 12.4858 )
								if( ema12 <= -0.013307 )
									ret := 0.214660
								if( ema12 > -0.013307 )
									ret := -0.176117
					if( ema12 > 0.217105 )
						if( ema2 <= 12.6008 )
							if( ema1 <= 12.3476 )
								if( ema1 <= 11.9984 )
									ret := -0.100000
								if( ema1 > 11.9984 )
									ret := 0.888889 // buy
							if( ema1 > 12.3476 )
								if( ema1 <= 12.4328 )
									ret := -0.750000 // sell
								if( ema1 > 12.4328 )
									ret := -1.000000 // sell
						if( ema2 > 12.6008 )
							if( tema <= 16.018 )
								if( ema12 <= 0.431676 )
									ret := 0.971831 // buy
								if( ema12 > 0.431676 )
									ret := 0.750000 // buy
							if( tema > 16.018 )
								ret := -0.500000
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_609c6458(ema2, ema1, ema12, ema3, ema13, tema)

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


