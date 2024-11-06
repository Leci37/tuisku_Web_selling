//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TRXUSDT_5Min_1T00_76f8252c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_5Min_1T00_76f8252c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_5Min_76f8252c(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.000168 )
		if( ema13 <= 0.000265 )
			if( tema <= 0.162507 )
				if( ema2 <= 0.074864 )
					if( ema3 <= 0.074049 )
						if( ema1 <= 0.073837 )
							if( ema1 <= 0.073473 )
								if( tema <= 0.073361 )
									ret := 0.126214
								if( tema > 0.073361 )
									ret := -0.565217
							if( ema1 > 0.073473 )
								if( ema3 <= 0.073481 )
									ret := 0.791667 // buy
								if( ema3 > 0.073481 )
									ret := 0.250000
						if( ema1 > 0.073837 )
							if( ema13 <= 8.7e-05 )
								if( ema2 <= 0.073866 )
									ret := -0.500000
								if( ema2 > 0.073866 )
									ret := 0.034483
							if( ema13 > 8.7e-05 )
								if( ema13 <= 9.3e-05 )
									ret := -0.750000 // sell
								if( ema13 > 9.3e-05 )
									ret := -1.000000 // sell
					if( ema3 > 0.074049 )
						if( ema13 <= -8e-05 )
							if( ema13 <= -0.000349 )
								if( ema2 <= 0.073977 )
									ret := 1.000000 // buy
								if( ema2 > 0.073977 )
									ret := -1.000000 // sell
							if( ema13 > -0.000349 )
								if( ema1 <= 0.074697 )
									ret := 0.752000 // buy
								if( ema1 > 0.074697 )
									ret := 0.307692
						if( ema13 > -8e-05 )
							if( tema <= 0.075001 )
								if( ema3 <= 0.074202 )
									ret := 0.820000 // buy
								if( ema3 > 0.074202 )
									ret := 0.195980
							if( tema > 0.075001 )
								if( ema2 <= 0.074825 )
									ret := 1.000000 // buy
								if( ema2 > 0.074825 )
									ret := 0.846154 // buy
				if( ema2 > 0.074864 )
					if( tema <= 0.075366 )
						if( ema12 <= -0.000166 )
							if( ema3 <= 0.075836 )
								if( ema3 <= 0.075412 )
									ret := 0.700000 // buy
								if( ema3 > 0.075412 )
									ret := -0.333333
							if( ema3 > 0.075836 )
								ret := 1.000000 // buy
						if( ema12 > -0.000166 )
							if( ema13 <= -1.7e-05 )
								if( ema3 <= 0.074949 )
									ret := -0.192308
								if( ema3 > 0.074949 )
									ret := -0.717949 // sell
							if( ema13 > -1.7e-05 )
								if( ema2 <= 0.07511 )
									ret := 0.097436
								if( ema2 > 0.07511 )
									ret := -0.500000
					if( tema > 0.075366 )
						if( tema <= 0.075588 )
							if( ema2 <= 0.075819 )
								if( ema2 <= 0.075576 )
									ret := 0.420000
								if( ema2 > 0.075576 )
									ret := 0.703704 // buy
							if( ema2 > 0.075819 )
								ret := -0.142857
						if( tema > 0.075588 )
							if( ema13 <= -0.000239 )
								if( ema3 <= 0.076963 )
									ret := 0.709677 // buy
								if( ema3 > 0.076963 )
									ret := -0.011660
							if( ema13 > -0.000239 )
								if( ema3 <= 0.086586 )
									ret := 0.016023
								if( ema3 > 0.086586 )
									ret := 0.050678
			if( tema > 0.162507 )
				if( ema1 <= 0.164474 )
					if( ema2 <= 0.163703 )
						if( ema13 <= -1.9e-05 )
							if( ema13 <= -8.1e-05 )
								if( tema <= 0.162858 )
									ret := -0.420000
								if( tema > 0.162858 )
									ret := 0.043478
							if( ema13 > -8.1e-05 )
								if( ema12 <= -2.7e-05 )
									ret := 0.377778
								if( ema12 > -2.7e-05 )
									ret := -0.069767
						if( ema13 > -1.9e-05 )
							if( ema1 <= 0.162724 )
								if( ema1 <= 0.162554 )
									ret := -0.066667
								if( ema1 > 0.162554 )
									ret := -0.771739 // sell
							if( ema1 > 0.162724 )
								if( ema2 <= 0.162895 )
									ret := 0.216216
								if( ema2 > 0.162895 )
									ret := -0.500000
					if( ema2 > 0.163703 )
						if( ema3 <= 0.164653 )
							if( ema12 <= -3.8e-05 )
								if( ema3 <= 0.164624 )
									ret := -0.964286 // sell
								if( ema3 > 0.164624 )
									ret := -0.600000
							if( ema12 > -3.8e-05 )
								if( ema3 <= 0.163693 )
									ret := -1.000000 // sell
								if( ema3 > 0.163693 )
									ret := -0.117647
						if( ema3 > 0.164653 )
							if( ema13 <= -0.000542 )
								ret := 0.750000 // buy
							if( ema13 > -0.000542 )
								ret := 0.000000
				if( ema1 > 0.164474 )
					if( ema3 <= 0.165824 )
						if( ema2 <= 0.165576 )
							if( ema3 <= 0.164755 )
								if( ema13 <= -9.9e-05 )
									ret := -0.600000
								if( ema13 > -9.9e-05 )
									ret := 0.771429 // buy
							if( ema3 > 0.164755 )
								if( ema3 <= 0.165288 )
									ret := -0.313869
								if( ema3 > 0.165288 )
									ret := 0.313953
						if( ema2 > 0.165576 )
							if( ema2 <= 0.165628 )
								if( ema13 <= 7.1e-05 )
									ret := 1.000000 // buy
								if( ema13 > 7.1e-05 )
									ret := 0.000000
							if( ema2 > 0.165628 )
								ret := 1.000000 // buy
					if( ema3 > 0.165824 )
						if( tema <= 0.167622 )
							if( ema1 <= 0.167407 )
								if( ema12 <= 6.1e-05 )
									ret := -0.554054
								if( ema12 > 6.1e-05 )
									ret := 1.000000 // buy
							if( ema1 > 0.167407 )
								if( ema3 <= 0.167627 )
									ret := -0.125000
								if( ema3 > 0.167627 )
									ret := 0.916667 // buy
						if( tema > 0.167622 )
							if( tema <= 0.167815 )
								ret := -0.714286 // sell
							if( tema > 0.167815 )
								ret := -1.000000 // sell
		if( ema13 > 0.000265 )
			if( tema <= 0.095965 )
				if( ema2 <= 0.07706 )
					if( tema <= 0.076976 )
						if( ema12 <= 0.000156 )
							if( ema13 <= 0.000293 )
								ret := -0.200000
							if( ema13 > 0.000293 )
								ret := 0.250000
						if( ema12 > 0.000156 )
							if( ema1 <= 0.075598 )
								ret := 1.000000 // buy
							if( ema1 > 0.075598 )
								ret := 0.500000
					if( tema > 0.076976 )
						ret := 1.000000 // buy
				if( ema2 > 0.07706 )
					if( ema12 <= 0.000127 )
						if( ema3 <= 0.08898 )
							if( ema3 <= 0.081586 )
								ret := 0.000000
							if( ema3 > 0.081586 )
								if( ema13 <= 0.0003 )
									ret := 0.750000 // buy
								if( ema13 > 0.0003 )
									ret := 1.000000 // buy
						if( ema3 > 0.08898 )
							if( ema3 <= 0.090812 )
								if( ema1 <= 0.090288 )
									ret := -0.750000 // sell
								if( ema1 > 0.090288 )
									ret := -1.000000 // sell
							if( ema3 > 0.090812 )
								ret := 0.500000
					if( ema12 > 0.000127 )
						if( ema13 <= 0.000402 )
							if( ema3 <= 0.085528 )
								if( ema1 <= 0.084296 )
									ret := -0.500000
								if( ema1 > 0.084296 )
									ret := -1.000000 // sell
							if( ema3 > 0.085528 )
								if( ema12 <= 0.000157 )
									ret := -0.521739
								if( ema12 > 0.000157 )
									ret := 0.500000
						if( ema13 > 0.000402 )
							ret := -1.000000 // sell
			if( tema > 0.095965 )
				if( ema13 <= 0.000438 )
					if( tema <= 0.109576 )
						if( ema3 <= 0.10695 )
							if( ema1 <= 0.105758 )
								if( tema <= 0.104932 )
									ret := 0.258278
								if( tema > 0.104932 )
									ret := 0.735294 // buy
							if( ema1 > 0.105758 )
								if( ema2 <= 0.107042 )
									ret := -0.019608
								if( ema2 > 0.107042 )
									ret := -1.000000 // sell
						if( ema3 > 0.10695 )
							if( tema <= 0.108332 )
								if( ema1 <= 0.107991 )
									ret := 0.700000 // buy
								if( ema1 > 0.107991 )
									ret := 1.000000 // buy
							if( tema > 0.108332 )
								if( ema2 <= 0.108179 )
									ret := -1.000000 // sell
								if( ema2 > 0.108179 )
									ret := 0.612245
					if( tema > 0.109576 )
						if( ema3 <= 0.109866 )
							if( ema13 <= 0.000284 )
								if( ema13 <= 0.000272 )
									ret := 0.166667
								if( ema13 > 0.000272 )
									ret := 0.500000
							if( ema13 > 0.000284 )
								if( ema1 <= 0.109571 )
									ret := -0.076923
								if( ema1 > 0.109571 )
									ret := -0.805556 // sell
						if( ema3 > 0.109866 )
							if( ema2 <= 0.111192 )
								if( ema3 <= 0.110101 )
									ret := 0.030303
								if( ema3 > 0.110101 )
									ret := 0.852273 // buy
							if( ema2 > 0.111192 )
								if( ema1 <= 0.112871 )
									ret := -0.285714
								if( ema1 > 0.112871 )
									ret := 0.238488
				if( ema13 > 0.000438 )
					if( ema3 <= 0.128908 )
						if( ema1 <= 0.116778 )
							if( ema3 <= 0.105776 )
								ret := -0.750000 // sell
							if( ema3 > 0.105776 )
								ret := -1.000000 // sell
						if( ema1 > 0.116778 )
							if( ema2 <= 0.118401 )
								ret := 0.000000
							if( ema2 > 0.118401 )
								ret := -1.000000 // sell
					if( ema3 > 0.128908 )
						if( ema12 <= 0.000155 )
							ret := 1.000000 // buy
						if( ema12 > 0.000155 )
							ret := 0.571429
	if( ema12 > 0.000168 )
		if( ema3 <= 0.101618 )
			if( ema13 <= 0.000644 )
				if( tema <= 0.101852 )
					if( tema <= 0.099736 )
						if( ema13 <= 0.000294 )
							if( ema13 <= 0.000284 )
								if( ema12 <= 0.000174 )
									ret := -0.222222
								if( ema12 > 0.000174 )
									ret := 0.400000
							if( ema13 > 0.000284 )
								if( ema12 <= 0.000188 )
									ret := 1.000000 // buy
								if( ema12 > 0.000188 )
									ret := 0.500000
						if( ema13 > 0.000294 )
							if( tema <= 0.099617 )
								if( ema3 <= 0.0979 )
									ret := -0.115672
								if( ema3 > 0.0979 )
									ret := 0.416667
							if( tema > 0.099617 )
								if( ema3 <= 0.098976 )
									ret := -1.000000 // sell
								if( ema3 > 0.098976 )
									ret := -0.600000
					if( tema > 0.099736 )
						if( ema3 <= 0.10038 )
							if( ema13 <= 0.000324 )
								if( ema1 <= 0.100337 )
									ret := 0.250000
								if( ema1 > 0.100337 )
									ret := 1.000000 // buy
							if( ema13 > 0.000324 )
								if( tema <= 0.100619 )
									ret := 0.500000
								if( tema > 0.100619 )
									ret := -0.083333
						if( ema3 > 0.10038 )
							if( ema2 <= 0.101365 )
								if( ema2 <= 0.100764 )
									ret := 1.000000 // buy
								if( ema2 > 0.100764 )
									ret := 0.750000 // buy
							if( ema2 > 0.101365 )
								ret := 0.000000
				if( tema > 0.101852 )
					if( ema13 <= 0.000351 )
						if( ema13 <= 0.00034 )
							ret := -1.000000 // sell
						if( ema13 > 0.00034 )
							ret := -0.500000
					if( ema13 > 0.000351 )
						ret := -1.000000 // sell
			if( ema13 > 0.000644 )
				if( tema <= 0.090152 )
					if( ema1 <= 0.08223 )
						if( tema <= 0.082911 )
							if( tema <= 0.081828 )
								ret := -0.200000
							if( tema > 0.081828 )
								ret := -1.000000 // sell
						if( tema > 0.082911 )
							ret := 0.500000
					if( ema1 > 0.08223 )
						if( ema12 <= 0.000377 )
							ret := -0.750000 // sell
						if( ema12 > 0.000377 )
							ret := 1.000000 // buy
				if( tema > 0.090152 )
					if( ema1 <= 0.101046 )
						if( ema12 <= 0.000836 )
							if( ema2 <= 0.089955 )
								ret := 0.000000
							if( ema2 > 0.089955 )
								if( ema3 <= 0.09835 )
									ret := -1.000000 // sell
								if( ema3 > 0.09835 )
									ret := -0.880000 // sell
						if( ema12 > 0.000836 )
							ret := -1.000000 // sell
					if( ema1 > 0.101046 )
						ret := -0.571429
		if( ema3 > 0.101618 )
			if( ema13 <= 0.001594 )
				if( ema3 <= 0.13619 )
					if( ema2 <= 0.115208 )
						if( ema3 <= 0.113718 )
							if( ema12 <= 0.000528 )
								if( ema2 <= 0.11391 )
									ret := 0.198840
								if( ema2 > 0.11391 )
									ret := -1.000000 // sell
							if( ema12 > 0.000528 )
								if( tema <= 0.115005 )
									ret := 0.808511 // buy
								if( tema > 0.115005 )
									ret := 0.000000
						if( ema3 > 0.113718 )
							if( ema2 <= 0.114448 )
								if( ema13 <= 0.000484 )
									ret := 0.738095 // buy
								if( ema13 > 0.000484 )
									ret := 1.000000 // buy
							if( ema2 > 0.114448 )
								if( ema13 <= 0.000429 )
									ret := 0.556962
								if( ema13 > 0.000429 )
									ret := -0.040000
					if( ema2 > 0.115208 )
						if( ema13 <= 0.000972 )
							if( ema2 <= 0.126143 )
								if( ema1 <= 0.125783 )
									ret := 0.020227
								if( ema1 > 0.125783 )
									ret := -0.470000
							if( ema2 > 0.126143 )
								if( tema <= 0.127588 )
									ret := 0.586466
								if( tema > 0.127588 )
									ret := 0.088472
						if( ema13 > 0.000972 )
							if( ema3 <= 0.116065 )
								if( ema1 <= 0.116663 )
									ret := -0.500000
								if( ema1 > 0.116663 )
									ret := -1.000000 // sell
							if( ema3 > 0.116065 )
								if( tema <= 0.128389 )
									ret := 0.823529 // buy
								if( tema > 0.128389 )
									ret := -0.222222
				if( ema3 > 0.13619 )
					if( ema3 <= 0.157293 )
						if( ema2 <= 0.138828 )
							if( ema13 <= 0.000897 )
								if( ema3 <= 0.137945 )
									ret := 0.656250
								if( ema3 > 0.137945 )
									ret := 0.984127 // buy
							if( ema13 > 0.000897 )
								ret := -0.666667
						if( ema2 > 0.138828 )
							if( ema2 <= 0.14424 )
								if( tema <= 0.141874 )
									ret := 0.307692
								if( tema > 0.141874 )
									ret := -0.534483
							if( ema2 > 0.14424 )
								if( ema2 <= 0.150428 )
									ret := 0.757426 // buy
								if( ema2 > 0.150428 )
									ret := 0.370536
					if( ema3 > 0.157293 )
						if( ema12 <= 0.000738 )
							if( ema13 <= 0.000696 )
								if( ema1 <= 0.165418 )
									ret := 0.120858
								if( ema1 > 0.165418 )
									ret := 0.571429
							if( ema13 > 0.000696 )
								if( ema2 <= 0.158245 )
									ret := 0.875000 // buy
								if( ema2 > 0.158245 )
									ret := -0.532468
						if( ema12 > 0.000738 )
							ret := 1.000000 // buy
			if( ema13 > 0.001594 )
				if( ema1 <= 0.119076 )
					if( tema <= 0.10789 )
						if( ema1 <= 0.10669 )
							ret := 0.571429
						if( ema1 > 0.10669 )
							ret := -1.000000 // sell
					if( tema > 0.10789 )
						if( ema12 <= 0.000956 )
							ret := 0.500000
						if( ema12 > 0.000956 )
							ret := 1.000000 // buy
				if( ema1 > 0.119076 )
					if( tema <= 0.157731 )
						if( ema12 <= 0.000954 )
							ret := -0.333333
						if( ema12 > 0.000954 )
							ret := -1.000000 // sell
					if( tema > 0.157731 )
						if( ema1 <= 0.164376 )
							ret := -1.000000 // sell
						if( ema1 > 0.164376 )
							if( ema3 <= 0.163405 )
								ret := -0.750000 // sell
							if( ema3 > 0.163405 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_TRXUSDT_5Min_76f8252c(ema1, tema, ema12, ema2, ema3, ema13)

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


