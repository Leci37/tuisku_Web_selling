//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: LINKUSDT_15Min_2BV0_8e7b4014 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2BV0_8e7b4014", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_8e7b4014(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.117411 )
		if( bearPower <= -0.422838 )
			if( bullPower <= -0.582821 )
				ret := 1.000000 // buy
			if( bullPower > -0.582821 )
				if( VIP <= 0.862375 )
					if( bearPower <= -0.540998 )
						if( bearPower <= -0.54166 )
							if( VIP <= 0.619641 )
								if( VIP <= 0.529204 )
									ret := 0.354839
								if( VIP > 0.529204 )
									ret := -0.478261
							if( VIP > 0.619641 )
								if( VIM <= 1.29871 )
									ret := 0.513889
								if( VIM > 1.29871 )
									ret := -0.075000
						if( bearPower > -0.54166 )
							ret := -1.000000 // sell
					if( bearPower > -0.540998 )
						if( VIP_VIM <= -0.729841 )
							if( bullPower <= -0.230417 )
								if( VIP <= 0.464285 )
									ret := 0.800000 // buy
								if( VIP > 0.464285 )
									ret := 0.000000
							if( bullPower > -0.230417 )
								if( bullPower <= -0.183825 )
									ret := -1.000000 // sell
								if( bullPower > -0.183825 )
									ret := -0.500000
						if( VIP_VIM > -0.729841 )
							if( VIP_VIM <= -0.485723 )
								if( bearPower <= -0.469696 )
									ret := 0.876404 // buy
								if( bearPower > -0.469696 )
									ret := 0.611940
							if( VIP_VIM > -0.485723 )
								if( bbm <= 0.271616 )
									ret := -0.209302
								if( bbm > 0.271616 )
									ret := 0.744444 // buy
				if( VIP > 0.862375 )
					if( VIP <= 0.891155 )
						ret := -1.000000 // sell
					if( VIP > 0.891155 )
						if( VIP_VIM <= -0.063064 )
							ret := 0.333333
						if( VIP_VIM > -0.063064 )
							ret := -1.000000 // sell
		if( bearPower > -0.422838 )
			if( VIM <= 1.15549 )
				if( bullPower <= -0.002475 )
					if( VIP <= 1.18664 )
						if( bbm <= 0.325612 )
							if( VIM <= 0.939187 )
								if( bbm <= 0.1055 )
									ret := 0.000000
								if( bbm > 0.1055 )
									ret := -0.730769 // sell
							if( VIM > 0.939187 )
								if( bullPower <= -0.010139 )
									ret := 0.075647
								if( bullPower > -0.010139 )
									ret := -0.086053
						if( bbm > 0.325612 )
							if( bullPower <= -0.04984 )
								ret := 0.000000
							if( bullPower > -0.04984 )
								if( bbp <= -0.361968 )
									ret := 1.000000 // buy
								if( bbp > -0.361968 )
									ret := 0.500000
					if( VIP > 1.18664 )
						ret := 1.000000 // buy
				if( bullPower > -0.002475 )
					if( VIP <= 1.00619 )
						if( VIM <= 1.02316 )
							if( VIP <= 0.786828 )
								if( bbp <= -0.201563 )
									ret := -1.000000 // sell
								if( bbp > -0.201563 )
									ret := 0.384615
							if( VIP > 0.786828 )
								if( VIP_VIM <= -0.115572 )
									ret := 0.800000 // buy
								if( VIP_VIM > -0.115572 )
									ret := 0.313433
						if( VIM > 1.02316 )
							if( VIP_VIM <= -0.086569 )
								if( bullPower <= 0.027473 )
									ret := 0.215726
								if( bullPower > 0.027473 )
									ret := -0.180645
							if( VIP_VIM > -0.086569 )
								if( bbp <= -0.15356 )
									ret := 0.200000
								if( bbp > -0.15356 )
									ret := 0.909091 // buy
					if( VIP > 1.00619 )
						if( bearPower <= -0.169745 )
							if( VIM <= 0.911052 )
								if( VIP <= 1.15884 )
									ret := -0.285714
								if( VIP > 1.15884 )
									ret := 0.250000
							if( VIM > 0.911052 )
								if( bearPower <= -0.244476 )
									ret := -0.300000
								if( bearPower > -0.244476 )
									ret := -0.875000 // sell
						if( bearPower > -0.169745 )
							if( VIM <= 0.973878 )
								if( VIM <= 0.915513 )
									ret := 1.000000 // buy
								if( VIM > 0.915513 )
									ret := -0.294118
							if( VIM > 0.973878 )
								if( bearPower <= -0.143685 )
									ret := 1.000000 // buy
								if( bearPower > -0.143685 )
									ret := 0.571429
			if( VIM > 1.15549 )
				if( VIP_VIM <= -0.537766 )
					if( VIP_VIM <= -0.921259 )
						if( bbm <= 0.065133 )
							if( bearPower <= -0.181145 )
								ret := -0.500000
							if( bearPower > -0.181145 )
								if( bullPower <= -0.090911 )
									ret := 0.941176 // buy
								if( bullPower > -0.090911 )
									ret := 0.000000
						if( bbm > 0.065133 )
							if( bearPower <= -0.265874 )
								ret := 0.833333 // buy
							if( bearPower > -0.265874 )
								ret := 1.000000 // buy
					if( VIP_VIM > -0.921259 )
						if( bbm <= 0.178142 )
							if( bullPower <= -0.053243 )
								if( VIM <= 1.23574 )
									ret := 0.772727 // buy
								if( VIM > 1.23574 )
									ret := 0.081312
							if( bullPower > -0.053243 )
								if( VIP_VIM <= -0.598155 )
									ret := -0.264591
								if( VIP_VIM > -0.598155 )
									ret := 0.066667
						if( bbm > 0.178142 )
							if( VIP_VIM <= -0.685797 )
								if( bbp <= -0.5479 )
									ret := -0.450000
								if( bbp > -0.5479 )
									ret := 0.484848
							if( VIP_VIM > -0.685797 )
								if( VIP <= 0.563126 )
									ret := 0.857143 // buy
								if( VIP > 0.563126 )
									ret := -0.387324
				if( VIP_VIM > -0.537766 )
					if( VIP <= 0.754989 )
						if( VIP_VIM <= -0.509173 )
							if( bbp <= -0.491137 )
								if( VIM <= 1.20454 )
									ret := 0.000000
								if( VIM > 1.20454 )
									ret := 0.789474 // buy
							if( bbp > -0.491137 )
								if( bearPower <= -0.202164 )
									ret := -0.187970
								if( bearPower > -0.202164 )
									ret := 0.200000
						if( VIP_VIM > -0.509173 )
							if( bbp <= -0.253985 )
								if( VIM <= 1.20632 )
									ret := 0.321429
								if( VIM > 1.20632 )
									ret := 0.687764
							if( bbp > -0.253985 )
								if( bearPower <= -0.164512 )
									ret := -0.051282
								if( bearPower > -0.164512 )
									ret := 0.366848
					if( VIP > 0.754989 )
						if( VIM <= 1.16994 )
							if( bearPower <= -0.271804 )
								if( bearPower <= -0.295547 )
									ret := 0.162791
								if( bearPower > -0.295547 )
									ret := -0.406250
							if( bearPower > -0.271804 )
								if( bullPower <= -0.10449 )
									ret := 0.777778 // buy
								if( bullPower > -0.10449 )
									ret := 0.292857
						if( VIM > 1.16994 )
							if( bullPower <= -0.110188 )
								if( bullPower <= -0.166327 )
									ret := -0.009434
								if( bullPower > -0.166327 )
									ret := 0.341667
							if( bullPower > -0.110188 )
								if( bearPower <= -0.26931 )
									ret := -0.274510
								if( bearPower > -0.26931 )
									ret := 0.152542
	if( bbp > -0.117411 )
		if( bearPower <= -0.12682 )
			if( bbp <= -0.033284 )
				if( VIP_VIM <= 0.126124 )
					if( VIP <= 0.780378 )
						if( bearPower <= -0.145851 )
							if( bullPower <= 0.070193 )
								ret := -0.250000
							if( bullPower > 0.070193 )
								ret := 0.500000
						if( bearPower > -0.145851 )
							ret := 1.000000 // buy
					if( VIP > 0.780378 )
						if( bearPower <= -0.247822 )
							ret := 0.750000 // buy
						if( bearPower > -0.247822 )
							if( VIP_VIM <= 0.073421 )
								if( VIP_VIM <= 0.057474 )
									ret := -0.419355
								if( VIP_VIM > 0.057474 )
									ret := 0.500000
							if( VIP_VIM > 0.073421 )
								if( VIP <= 1.03452 )
									ret := -0.727273 // sell
								if( VIP > 1.03452 )
									ret := -1.000000 // sell
				if( VIP_VIM > 0.126124 )
					if( bullPower <= 0.055968 )
						if( bearPower <= -0.140767 )
							if( VIM <= 0.914558 )
								ret := 1.000000 // buy
							if( VIM > 0.914558 )
								ret := -0.250000
						if( bearPower > -0.140767 )
							if( bbp <= -0.090995 )
								ret := 0.000000
							if( bbp > -0.090995 )
								ret := -1.000000 // sell
					if( bullPower > 0.055968 )
						if( bbm <= 0.234874 )
							ret := 0.800000 // buy
						if( bbm > 0.234874 )
							if( VIM <= 0.885569 )
								ret := 0.000000
							if( VIM > 0.885569 )
								ret := 0.833333 // buy
			if( bbp > -0.033284 )
				if( VIP_VIM <= 0.051651 )
					if( bbp <= -0.001423 )
						if( VIP_VIM <= -0.195517 )
							ret := 0.400000
						if( VIP_VIM > -0.195517 )
							if( VIP <= 1.02032 )
								ret := 1.000000 // buy
							if( VIP > 1.02032 )
								ret := 0.750000 // buy
					if( bbp > -0.001423 )
						if( bbp <= 0.028362 )
							ret := -0.166667
						if( bbp > 0.028362 )
							if( bbp <= 0.073763 )
								ret := 1.000000 // buy
							if( bbp > 0.073763 )
								if( bbm <= 0.414152 )
									ret := -0.250000
								if( bbm > 0.414152 )
									ret := 0.500000
				if( VIP_VIM > 0.051651 )
					if( bullPower <= 0.210946 )
						if( VIP_VIM <= 0.173805 )
							if( bullPower <= 0.173642 )
								ret := 0.200000
							if( bullPower > 0.173642 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.173805 )
							if( VIP_VIM <= 0.233377 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.233377 )
								ret := 0.500000
					if( bullPower > 0.210946 )
						if( bullPower <= 0.283742 )
							ret := -1.000000 // sell
						if( bullPower > 0.283742 )
							ret := 0.000000
		if( bearPower > -0.12682 )
			if( bearPower <= -0.067794 )
				if( VIP_VIM <= -0.343286 )
					if( VIP <= 0.819935 )
						if( bbp <= -0.058854 )
							if( VIP_VIM <= -0.670575 )
								if( bullPower <= -0.034005 )
									ret := -0.250000
								if( bullPower > -0.034005 )
									ret := -0.809524 // sell
							if( VIP_VIM > -0.670575 )
								if( VIP <= 0.685185 )
									ret := 0.402174
								if( VIP > 0.685185 )
									ret := 0.002691
						if( bbp > -0.058854 )
							if( bearPower <= -0.080501 )
								if( VIM <= 1.18922 )
									ret := 0.200000
								if( VIM > 1.18922 )
									ret := -1.000000 // sell
							if( bearPower > -0.080501 )
								if( bbp <= -0.036506 )
									ret := 0.920000 // buy
								if( bbp > -0.036506 )
									ret := 0.000000
					if( VIP > 0.819935 )
						if( bbp <= -0.10122 )
							if( bbm <= 0.094356 )
								if( VIP <= 0.826236 )
									ret := 0.450000
								if( VIP > 0.826236 )
									ret := -0.202532
							if( bbm > 0.094356 )
								if( VIP <= 0.835605 )
									ret := 0.666667
								if( VIP > 0.835605 )
									ret := 1.000000 // buy
						if( bbp > -0.10122 )
							if( VIP_VIM <= -0.383313 )
								if( bearPower <= -0.070914 )
									ret := 0.000000
								if( bearPower > -0.070914 )
									ret := 0.666667
							if( VIP_VIM > -0.383313 )
								if( VIM <= 1.20366 )
									ret := -0.782609 // sell
								if( VIM > 1.20366 )
									ret := -0.200000
				if( VIP_VIM > -0.343286 )
					if( VIP <= 0.85357 )
						if( bbm <= 0.156427 )
							if( bbm <= 0.128094 )
								if( VIM <= 1.14975 )
									ret := 0.324324
								if( VIM > 1.14975 )
									ret := 0.020305
							if( bbm > 0.128094 )
								if( bbm <= 0.1455 )
									ret := 0.712766 // buy
								if( bbm > 0.1455 )
									ret := 0.190476
						if( bbm > 0.156427 )
							if( VIP <= 0.849777 )
								if( VIP_VIM <= -0.212901 )
									ret := -0.760000 // sell
								if( VIP_VIM > -0.212901 )
									ret := 0.000000
							if( VIP > 0.849777 )
								ret := 0.714286 // buy
					if( VIP > 0.85357 )
						if( bbp <= 0.039359 )
							if( bbm <= 0.044479 )
								if( bearPower <= -0.073066 )
									ret := 0.567568
								if( bearPower > -0.073066 )
									ret := 0.264706
							if( bbm > 0.044479 )
								if( VIM <= 0.887167 )
									ret := 0.333333
								if( VIM > 0.887167 )
									ret := 0.084527
						if( bbp > 0.039359 )
							if( VIP <= 0.926642 )
								if( bbp <= 0.11814 )
									ret := 0.653846
								if( bbp > 0.11814 )
									ret := -0.666667
							if( VIP > 0.926642 )
								if( VIP_VIM <= 0.310866 )
									ret := -0.369565
								if( VIP_VIM > 0.310866 )
									ret := 0.200000
			if( bearPower > -0.067794 )
				if( VIM <= 0.705768 )
					if( bullPower <= 0.307292 )
						if( bullPower <= 0.109529 )
							if( VIP_VIM <= 0.730462 )
								if( bearPower <= 0.029605 )
									ret := 0.111597
								if( bearPower > 0.029605 )
									ret := 0.358814
							if( VIP_VIM > 0.730462 )
								if( VIP <= 1.42346 )
									ret := -0.150000
								if( VIP > 1.42346 )
									ret := 0.320000
						if( bullPower > 0.109529 )
							if( bbm <= 0.072309 )
								if( bearPower <= 0.139443 )
									ret := -0.222539
								if( bearPower > 0.139443 )
									ret := 0.321429
							if( bbm > 0.072309 )
								if( VIM <= 0.539182 )
									ret := 0.525641
								if( VIM > 0.539182 )
									ret := 0.049608
					if( bullPower > 0.307292 )
						if( bbp <= 0.907841 )
							if( VIP <= 1.28911 )
								if( bullPower <= 0.339487 )
									ret := 0.400000
								if( bullPower > 0.339487 )
									ret := 0.796053 // buy
							if( VIP > 1.28911 )
								if( bbp <= 0.800274 )
									ret := 0.250000
								if( bbp > 0.800274 )
									ret := 0.666667
						if( bbp > 0.907841 )
							if( VIP_VIM <= 0.720852 )
								if( VIM <= 0.653113 )
									ret := -1.000000 // sell
								if( VIM > 0.653113 )
									ret := -0.750000 // sell
							if( VIP_VIM > 0.720852 )
								if( bbm <= 0.340957 )
									ret := 0.470588
								if( bbm > 0.340957 )
									ret := -0.666667
				if( VIM > 0.705768 )
					if( bullPower <= 0.123923 )
						if( VIM <= 0.804904 )
							if( VIP_VIM <= 0.566539 )
								if( VIM <= 0.788987 )
									ret := 0.073712
								if( VIM > 0.788987 )
									ret := 0.229902
							if( VIP_VIM > 0.566539 )
								if( bbm <= 0.077916 )
									ret := -0.035813
								if( bbm > 0.077916 )
									ret := -0.900000 // sell
						if( VIM > 0.804904 )
							if( VIP_VIM <= -0.529986 )
								if( VIP <= 0.679725 )
									ret := 0.132812
								if( VIP > 0.679725 )
									ret := -0.209302
							if( VIP_VIM > -0.529986 )
								if( bbm <= 0.167155 )
									ret := 0.024506
								if( bbm > 0.167155 )
									ret := -0.456522
					if( bullPower > 0.123923 )
						if( VIP <= 1.2703 )
							if( bullPower <= 0.59743 )
								if( bearPower <= -0.017307 )
									ret := -0.135618
								if( bearPower > -0.017307 )
									ret := -0.016556
							if( bullPower > 0.59743 )
								if( bbp <= 0.949069 )
									ret := 0.923077 // buy
								if( bbp > 0.949069 )
									ret := 0.250000
						if( VIP > 1.2703 )
							if( VIP_VIM <= 0.638629 )
								if( VIP <= 1.30687 )
									ret := -0.334066
								if( VIP > 1.30687 )
									ret := 0.055118
							if( VIP_VIM > 0.638629 )
								if( VIM <= 0.728235 )
									ret := 0.375000
								if( VIM > 0.728235 )
									ret := 0.937500 // buy
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_8e7b4014(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


