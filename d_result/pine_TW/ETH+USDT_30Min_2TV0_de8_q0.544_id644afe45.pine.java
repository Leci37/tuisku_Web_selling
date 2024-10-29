//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ETHUSDT_30Min_2TV0_644afe45 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_2TV0_644afe45", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_644afe45(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema1 <= 1201.57 )
		if( ema1 <= 427.461 )
			if( ema2 <= 338.739 )
				if( VIM <= 0.960284 )
					if( VIP_VIM <= 0.520065 )
						if( ema3 <= 324.962 )
							ret := 0.750000 // buy
						if( ema3 > 324.962 )
							if( ema13 <= 6.12653 )
								ret := 1.000000 // buy
							if( ema13 > 6.12653 )
								ret := 0.750000 // buy
					if( VIP_VIM > 0.520065 )
						ret := 0.250000
				if( VIM > 0.960284 )
					if( VIP <= 1.04274 )
						if( ema13 <= -2.15466 )
							if( ema12 <= -1.34909 )
								if( ema2 <= 331.28 )
									ret := 0.857143 // buy
								if( ema2 > 331.28 )
									ret := 0.217391
							if( ema12 > -1.34909 )
								if( VIM <= 1.0334 )
									ret := -1.000000 // sell
								if( VIM > 1.0334 )
									ret := -0.333333
						if( ema13 > -2.15466 )
							if( ema3 <= 338.953 )
								if( VIM <= 1.01278 )
									ret := 0.750000 // buy
								if( VIM > 1.01278 )
									ret := 0.973684 // buy
							if( ema3 > 338.953 )
								ret := 0.142857
					if( VIP > 1.04274 )
						if( ema2 <= 332.601 )
							ret := 0.000000
						if( ema2 > 332.601 )
							if( VIP_VIM <= 0.070755 )
								ret := -0.250000
							if( VIP_VIM > 0.070755 )
								ret := -0.833333 // sell
			if( ema2 > 338.739 )
				if( VIP_VIM <= -0.492419 )
					if( tema <= 352.221 )
						if( ema3 <= 355.444 )
							if( ema2 <= 347.717 )
								if( VIP <= 0.719847 )
									ret := 0.000000
								if( VIP > 0.719847 )
									ret := -0.200000
							if( ema2 > 347.717 )
								if( ema1 <= 346.85 )
									ret := -1.000000 // sell
								if( ema1 > 346.85 )
									ret := 0.000000
						if( ema3 > 355.444 )
							if( ema3 <= 363.439 )
								if( ema13 <= -5.27202 )
									ret := 0.571429
								if( ema13 > -5.27202 )
									ret := 1.000000 // buy
							if( ema3 > 363.439 )
								if( ema3 <= 369.868 )
									ret := -0.555556
								if( ema3 > 369.868 )
									ret := 0.800000 // buy
					if( tema > 352.221 )
						if( VIP <= 0.724634 )
							if( VIM <= 1.3663 )
								if( ema1 <= 361.793 )
									ret := -0.111111
								if( ema1 > 361.793 )
									ret := -0.735849 // sell
							if( VIM > 1.3663 )
								ret := 0.250000
						if( VIP > 0.724634 )
							if( tema <= 368.038 )
								if( tema <= 365.279 )
									ret := -0.142857
								if( tema > 365.279 )
									ret := 1.000000 // buy
							if( tema > 368.038 )
								if( ema2 <= 385.539 )
									ret := -0.700000 // sell
								if( ema2 > 385.539 )
									ret := 0.000000
				if( VIP_VIM > -0.492419 )
					if( ema3 <= 339.982 )
						if( VIP_VIM <= 0.16264 )
							if( ema3 <= 339.272 )
								ret := -1.000000 // sell
							if( ema3 > 339.272 )
								if( ema1 <= 339.025 )
									ret := -0.285714
								if( ema1 > 339.025 )
									ret := -0.718750 // sell
						if( VIP_VIM > 0.16264 )
							if( ema13 <= 8.37855 )
								if( VIM <= 0.842352 )
									ret := 0.800000 // buy
								if( VIM > 0.842352 )
									ret := -0.125000
							if( ema13 > 8.37855 )
								ret := -1.000000 // sell
					if( ema3 > 339.982 )
						if( ema2 <= 415.23 )
							if( ema13 <= 5.06974 )
								if( ema1 <= 339.944 )
									ret := 0.544444
								if( ema1 > 339.944 )
									ret := 0.054887
							if( ema13 > 5.06974 )
								if( ema2 <= 386.551 )
									ret := -0.511111
								if( ema2 > 386.551 )
									ret := 0.046512
						if( ema2 > 415.23 )
							if( VIM <= 1.00225 )
								if( tema <= 416.678 )
									ret := -0.875000 // sell
								if( tema > 416.678 )
									ret := -1.000000 // sell
							if( VIM > 1.00225 )
								ret := -0.250000
		if( ema1 > 427.461 )
			if( ema13 <= 42.913 )
				if( tema <= 446.937 )
					if( ema3 <= 453.718 )
						if( VIP <= 1.03551 )
							if( ema13 <= -7.27765 )
								if( VIM <= 1.20143 )
									ret := 0.000000
								if( VIM > 1.20143 )
									ret := 0.750000 // buy
							if( ema13 > -7.27765 )
								if( tema <= 440.56 )
									ret := 1.000000 // buy
								if( tema > 440.56 )
									ret := 0.700000 // buy
						if( VIP > 1.03551 )
							if( ema12 <= 1.12413 )
								if( VIP_VIM <= 0.125455 )
									ret := -0.375000
								if( VIP_VIM > 0.125455 )
									ret := 0.000000
							if( ema12 > 1.12413 )
								if( ema2 <= 440.842 )
									ret := 0.263158
								if( ema2 > 440.842 )
									ret := 1.000000 // buy
					if( ema3 > 453.718 )
						if( VIP_VIM <= -0.432511 )
							ret := 0.000000
						if( VIP_VIM > -0.432511 )
							ret := -0.750000 // sell
				if( tema > 446.937 )
					if( ema12 <= -2.69631 )
						if( ema2 <= 1075.05 )
							if( ema3 <= 607.597 )
								if( ema3 <= 554.31 )
									ret := 0.656000
								if( ema3 > 554.31 )
									ret := -0.088435
							if( ema3 > 607.597 )
								if( VIM <= 1.13219 )
									ret := 0.682008
								if( VIM > 1.13219 )
									ret := 0.365145
						if( ema2 > 1075.05 )
							if( ema1 <= 1185.24 )
								if( VIM <= 1.05386 )
									ret := -0.364583
								if( VIM > 1.05386 )
									ret := 0.146184
							if( ema1 > 1185.24 )
								if( ema13 <= -17.529 )
									ret := 0.800000 // buy
								if( ema13 > -17.529 )
									ret := 0.256410
					if( ema12 > -2.69631 )
						if( ema2 <= 460.805 )
							if( ema2 <= 448.578 )
								if( VIP_VIM <= 0.109946 )
									ret := -0.375000
								if( VIP_VIM > 0.109946 )
									ret := 0.508772
							if( ema2 > 448.578 )
								if( ema12 <= -1.48447 )
									ret := 0.500000
								if( ema12 > -1.48447 )
									ret := -0.297170
						if( ema2 > 460.805 )
							if( ema1 <= 584.344 )
								if( ema1 <= 577.714 )
									ret := 0.259398
								if( ema1 > 577.714 )
									ret := 0.754545 // buy
							if( ema1 > 584.344 )
								if( ema3 <= 673.454 )
									ret := -0.081413
								if( ema3 > 673.454 )
									ret := 0.192664
			if( ema13 > 42.913 )
				if( tema <= 944.763 )
					ret := 1.000000 // buy
				if( tema > 944.763 )
					if( tema <= 1210.19 )
						if( tema <= 1064.3 )
							if( tema <= 986.369 )
								ret := -1.000000 // sell
							if( tema > 986.369 )
								ret := 0.250000
						if( tema > 1064.3 )
							if( VIP <= 1.31738 )
								if( VIP_VIM <= 0.56634 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.56634 )
									ret := -0.857143 // sell
							if( VIP > 1.31738 )
								if( ema3 <= 1127.12 )
									ret := -0.250000
								if( ema3 > 1127.12 )
									ret := -1.000000 // sell
					if( tema > 1210.19 )
						ret := 0.400000
	if( ema1 > 1201.57 )
		if( ema3 <= 1241.72 )
			if( ema1 <= 1248.36 )
				if( tema <= 1186.3 )
					if( VIP <= 0.74679 )
						ret := -0.750000 // sell
					if( VIP > 0.74679 )
						ret := -1.000000 // sell
				if( tema > 1186.3 )
					if( VIM <= 0.789276 )
						if( tema <= 1264.42 )
							if( ema3 <= 1165.66 )
								ret := -0.750000 // sell
							if( ema3 > 1165.66 )
								if( tema <= 1222.13 )
									ret := 0.097561
								if( tema > 1222.13 )
									ret := 0.388350
						if( tema > 1264.42 )
							if( ema3 <= 1192.15 )
								ret := 1.000000 // buy
							if( ema3 > 1192.15 )
								if( VIP_VIM <= 0.574199 )
									ret := -0.866667 // sell
								if( VIP_VIM > 0.574199 )
									ret := 0.000000
					if( VIM > 0.789276 )
						if( ema3 <= 1196.62 )
							if( ema1 <= 1203.76 )
								if( ema12 <= 6.64733 )
									ret := 0.250000
								if( ema12 > 6.64733 )
									ret := 0.833333 // buy
							if( ema1 > 1203.76 )
								if( ema2 <= 1199.3 )
									ret := -0.588235
								if( ema2 > 1199.3 )
									ret := -0.914894 // sell
						if( ema3 > 1196.62 )
							if( VIM <= 1.2477 )
								if( ema12 <= -6.02853 )
									ret := 0.193798
								if( ema12 > -6.02853 )
									ret := -0.116959
							if( VIM > 1.2477 )
								if( ema2 <= 1224.19 )
									ret := -0.333333
								if( ema2 > 1224.19 )
									ret := -0.904762 // sell
			if( ema1 > 1248.36 )
				if( VIM <= 0.775896 )
					if( tema <= 1324.53 )
						if( ema1 <= 1265.84 )
							if( ema3 <= 1221.29 )
								if( ema12 <= 20.1974 )
									ret := -1.000000 // sell
								if( ema12 > 20.1974 )
									ret := -0.500000
							if( ema3 > 1221.29 )
								if( ema1 <= 1250.54 )
									ret := 0.500000
								if( ema1 > 1250.54 )
									ret := -0.285714
						if( ema1 > 1265.84 )
							if( ema13 <= 34.5643 )
								ret := 1.000000 // buy
							if( ema13 > 34.5643 )
								ret := 0.750000 // buy
					if( tema > 1324.53 )
						if( ema2 <= 1259.46 )
							ret := -1.000000 // sell
						if( ema2 > 1259.46 )
							ret := -0.750000 // sell
				if( VIM > 0.775896 )
					if( ema13 <= 14.4555 )
						if( tema <= 1259.66 )
							if( VIM <= 0.906817 )
								ret := -1.000000 // sell
							if( VIM > 0.906817 )
								ret := -0.750000 // sell
						if( tema > 1259.66 )
							ret := -0.333333
					if( ema13 > 14.4555 )
						if( ema3 <= 1223.46 )
							if( VIP <= 1.21728 )
								ret := -0.750000 // sell
							if( VIP > 1.21728 )
								ret := -1.000000 // sell
						if( ema3 > 1223.46 )
							ret := -1.000000 // sell
		if( ema3 > 1241.72 )
			if( tema <= 3448.08 )
				if( ema12 <= -89.3758 )
					if( VIM <= 1.21201 )
						if( ema1 <= 2788.8 )
							if( ema13 <= -159.777 )
								ret := 1.000000 // buy
							if( ema13 > -159.777 )
								ret := 0.750000 // buy
						if( ema1 > 2788.8 )
							ret := 0.142857
					if( VIM > 1.21201 )
						if( ema13 <= -200.625 )
							if( ema12 <= -118.64 )
								ret := 0.857143 // buy
							if( ema12 > -118.64 )
								ret := 0.500000
						if( ema13 > -200.625 )
							ret := 1.000000 // buy
				if( ema12 > -89.3758 )
					if( ema12 <= -32.6614 )
						if( VIM <= 1.37691 )
							if( tema <= 2192.74 )
								if( ema12 <= -62.4974 )
									ret := 0.952381 // buy
								if( ema12 > -62.4974 )
									ret := 0.366559
							if( tema > 2192.74 )
								if( tema <= 2983.46 )
									ret := 0.024828
								if( tema > 2983.46 )
									ret := 0.392105
						if( VIM > 1.37691 )
							if( ema3 <= 2551.39 )
								if( ema3 <= 1726.48 )
									ret := -1.000000 // sell
								if( ema3 > 1726.48 )
									ret := 0.357143
							if( ema3 > 2551.39 )
								if( ema13 <= -124.277 )
									ret := 0.400000
								if( ema13 > -124.277 )
									ret := -0.781818 // sell
					if( ema12 > -32.6614 )
						if( VIP <= 0.733438 )
							if( ema1 <= 1499.85 )
								if( ema3 <= 1493.25 )
									ret := 0.073770
								if( ema3 > 1493.25 )
									ret := 0.657143
							if( ema1 > 1499.85 )
								if( tema <= 1833.97 )
									ret := -0.202073
								if( tema > 1833.97 )
									ret := -0.063559
						if( VIP > 0.733438 )
							if( tema <= 1797.92 )
								if( ema2 <= 1727.26 )
									ret := 0.061531
								if( ema2 > 1727.26 )
									ret := 0.189703
							if( tema > 1797.92 )
								if( ema1 <= 3434.05 )
									ret := 0.034504
								if( ema1 > 3434.05 )
									ret := 0.334375
			if( tema > 3448.08 )
				if( tema <= 3630.3 )
					if( ema1 <= 3580.23 )
						if( VIP_VIM <= 0.570429 )
							if( ema12 <= 33.7113 )
								if( ema3 <= 3649.49 )
									ret := -0.077596
								if( ema3 > 3649.49 )
									ret := -0.941176 // sell
							if( ema12 > 33.7113 )
								if( ema2 <= 3373.84 )
									ret := 0.500000
								if( ema2 > 3373.84 )
									ret := -0.880000 // sell
						if( VIP_VIM > 0.570429 )
							if( tema <= 3585.68 )
								if( VIM <= 0.607713 )
									ret := 0.944444 // buy
								if( VIM > 0.607713 )
									ret := 0.439394
							if( tema > 3585.68 )
								if( VIM <= 0.689837 )
									ret := 0.222222
								if( VIM > 0.689837 )
									ret := -0.500000
					if( ema1 > 3580.23 )
						if( VIM <= 0.951439 )
							if( ema12 <= 3.15742 )
								if( VIM <= 0.92699 )
									ret := 0.800000 // buy
								if( VIM > 0.92699 )
									ret := 0.142857
							if( ema12 > 3.15742 )
								if( ema1 <= 3584.56 )
									ret := -0.730769 // sell
								if( ema1 > 3584.56 )
									ret := -0.170940
						if( VIM > 0.951439 )
							if( ema2 <= 3616.18 )
								if( VIP <= 0.884302 )
									ret := 0.205128
								if( VIP > 0.884302 )
									ret := -0.554054
							if( ema2 > 3616.18 )
								if( ema1 <= 3637.04 )
									ret := -0.740385 // sell
								if( ema1 > 3637.04 )
									ret := -0.400000
				if( tema > 3630.3 )
					if( ema1 <= 4201.36 )
						if( ema12 <= -56.2656 )
							if( tema <= 4020.97 )
								if( ema13 <= -115.858 )
									ret := 0.911111 // buy
								if( ema13 > -115.858 )
									ret := 0.687500
							if( tema > 4020.97 )
								if( ema3 <= 4255.31 )
									ret := 0.333333
								if( ema3 > 4255.31 )
									ret := -0.833333 // sell
						if( ema12 > -56.2656 )
							if( ema1 <= 4162.7 )
								if( ema12 <= 42.0957 )
									ret := 0.025462
								if( ema12 > 42.0957 )
									ret := 0.405941
							if( ema1 > 4162.7 )
								if( ema3 <= 4209.01 )
									ret := 0.664516
								if( ema3 > 4209.01 )
									ret := -0.424242
					if( ema1 > 4201.36 )
						if( ema3 <= 4213.45 )
							if( ema2 <= 4175.49 )
								if( ema12 <= 55.1114 )
									ret := 1.000000 // buy
								if( ema12 > 55.1114 )
									ret := 0.500000
							if( ema2 > 4175.49 )
								if( ema13 <= 43.7944 )
									ret := -0.747475 // sell
								if( ema13 > 43.7944 )
									ret := -0.276596
						if( ema3 > 4213.45 )
							if( VIM <= 1.24154 )
								if( tema <= 4277.67 )
									ret := 0.297297
								if( tema > 4277.67 )
									ret := -0.056860
							if( VIM > 1.24154 )
								if( ema1 <= 4616.39 )
									ret := -0.627907
								if( ema1 > 4616.39 )
									ret := 0.222222
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_644afe45(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


