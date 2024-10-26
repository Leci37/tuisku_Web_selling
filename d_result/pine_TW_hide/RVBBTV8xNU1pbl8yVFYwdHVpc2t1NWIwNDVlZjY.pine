//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: EPAM_15Min_2TV0_5b045ef6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2TV0_5b045ef6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_5b045ef6(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -0.179918 )
		if( tema <= 183.238 )
			if( ema3 <= 182.552 )
				if( VIP <= 1.08978 )
					if( ema12 <= -2.03353 )
						if( ema1 <= 165.627 )
							if( ema2 <= 167.543 )
								ret := 1.000000 // buy
							if( ema2 > 167.543 )
								ret := 0.750000 // buy
						if( ema1 > 165.627 )
							if( ema13 <= -4.99283 )
								if( VIP_VIM <= -0.413207 )
									ret := 0.333333
								if( VIP_VIM > -0.413207 )
									ret := -0.818182 // sell
							if( ema13 > -4.99283 )
								if( tema <= 165.035 )
									ret := 0.000000
								if( tema > 165.035 )
									ret := 0.954545 // buy
					if( ema12 > -2.03353 )
						if( ema3 <= 175.623 )
							if( ema1 <= 171.158 )
								if( tema <= 168.7 )
									ret := -0.071458
								if( tema > 168.7 )
									ret := 0.372414
							if( ema1 > 171.158 )
								if( ema12 <= -0.306131 )
									ret := -0.617284
								if( ema12 > -0.306131 )
									ret := -0.032000
						if( ema3 > 175.623 )
							if( VIP_VIM <= -0.325765 )
								if( tema <= 175.863 )
									ret := 0.238462
								if( tema > 175.863 )
									ret := -0.219780
							if( VIP_VIM > -0.325765 )
								if( ema12 <= -0.109347 )
									ret := 0.359073
								if( ema12 > -0.109347 )
									ret := -0.184211
				if( VIP > 1.08978 )
					if( tema <= 167.302 )
						if( ema13 <= -0.533143 )
							if( ema2 <= 112.037 )
								if( ema1 <= 82.8541 )
									ret := 0.750000 // buy
								if( ema1 > 82.8541 )
									ret := -0.333333
							if( ema2 > 112.037 )
								if( ema12 <= -0.305837 )
									ret := 0.807692 // buy
								if( ema12 > -0.305837 )
									ret := 0.409091
						if( ema13 > -0.533143 )
							if( ema12 <= -0.26398 )
								if( ema1 <= 115.911 )
									ret := 0.833333 // buy
								if( ema1 > 115.911 )
									ret := -0.809524 // sell
							if( ema12 > -0.26398 )
								if( VIP <= 1.21381 )
									ret := 0.033613
								if( VIP > 1.21381 )
									ret := 0.486486
					if( tema > 167.302 )
						if( ema13 <= -1.41766 )
							ret := -1.000000 // sell
						if( ema13 > -1.41766 )
							if( ema13 <= -0.709329 )
								if( ema2 <= 175.407 )
									ret := 0.210526
								if( ema2 > 175.407 )
									ret := 0.809524 // buy
							if( ema13 > -0.709329 )
								if( ema2 <= 178.719 )
									ret := -0.175439
								if( ema2 > 178.719 )
									ret := 0.500000
			if( ema3 > 182.552 )
				if( tema <= 174.519 )
					ret := 1.000000 // buy
				if( tema > 174.519 )
					if( ema1 <= 182.061 )
						if( ema3 <= 182.826 )
							if( ema1 <= 180.692 )
								ret := -1.000000 // sell
							if( ema1 > 180.692 )
								if( ema13 <= -1.42783 )
									ret := 0.750000 // buy
								if( ema13 > -1.42783 )
									ret := -0.200000
						if( ema3 > 182.826 )
							if( VIP <= 1.57416 )
								if( ema13 <= -2.4071 )
									ret := -0.915663 // sell
								if( ema13 > -2.4071 )
									ret := -0.529412
							if( VIP > 1.57416 )
								ret := -0.333333
					if( ema1 > 182.061 )
						if( VIP_VIM <= -0.522291 )
							if( VIM <= 1.30938 )
								if( VIP_VIM <= -0.560449 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.560449 )
									ret := 0.500000
							if( VIM > 1.30938 )
								if( ema12 <= -3.4772 )
									ret := 0.833333 // buy
								if( ema12 > -3.4772 )
									ret := -0.250000
						if( VIP_VIM > -0.522291 )
							if( ema12 <= -0.295181 )
								if( tema <= 178.273 )
									ret := 0.428571
								if( tema > 178.273 )
									ret := -0.623853
							if( ema12 > -0.295181 )
								if( ema1 <= 183.149 )
									ret := -0.222222
								if( ema1 > 183.149 )
									ret := 0.600000
		if( tema > 183.238 )
			if( ema2 <= 635.307 )
				if( VIP_VIM <= -0.654435 )
					if( ema13 <= -10.3786 )
						if( VIP <= 1.62605 )
							if( ema12 <= -29.5309 )
								if( tema <= 235.16 )
									ret := 1.000000 // buy
								if( tema > 235.16 )
									ret := 0.090909
							if( ema12 > -29.5309 )
								if( ema13 <= -17.9583 )
									ret := -0.741379 // sell
								if( ema13 > -17.9583 )
									ret := -0.207317
						if( VIP > 1.62605 )
							ret := 1.000000 // buy
					if( ema13 > -10.3786 )
						if( ema13 <= -0.983188 )
							if( ema1 <= 346.316 )
								if( ema13 <= -6.79157 )
									ret := 0.699248
								if( ema13 > -6.79157 )
									ret := 0.281377
							if( ema1 > 346.316 )
								if( ema3 <= 380.164 )
									ret := -0.323308
								if( ema3 > 380.164 )
									ret := 0.228070
						if( ema13 > -0.983188 )
							if( VIP_VIM <= -0.685221 )
								if( ema13 <= -0.787835 )
									ret := -0.416667
								if( ema13 > -0.787835 )
									ret := 0.076923
							if( VIP_VIM > -0.685221 )
								if( ema13 <= -0.779164 )
									ret := -0.416667
								if( ema13 > -0.779164 )
									ret := -0.833333 // sell
				if( VIP_VIM > -0.654435 )
					if( ema3 <= 185.996 )
						if( ema12 <= -0.566079 )
							ret := -0.833333 // sell
						if( ema12 > -0.566079 )
							if( ema1 <= 183.631 )
								if( VIM <= 1.00008 )
									ret := -0.500000
								if( VIM > 1.00008 )
									ret := 0.200000
							if( ema1 > 183.631 )
								if( ema12 <= -0.355643 )
									ret := 0.190476
								if( ema12 > -0.355643 )
									ret := 0.677419
					if( ema3 > 185.996 )
						if( ema3 <= 509.683 )
							if( ema1 <= 448.124 )
								if( ema3 <= 448.58 )
									ret := 0.017673
								if( ema3 > 448.58 )
									ret := 0.709677 // buy
							if( ema1 > 448.124 )
								if( VIP <= 1.12322 )
									ret := -0.174377
								if( VIP > 1.12322 )
									ret := -0.676923
						if( ema3 > 509.683 )
							if( ema3 <= 548.202 )
								if( ema1 <= 531.396 )
									ret := 0.220779
								if( ema1 > 531.396 )
									ret := 0.664000
							if( ema3 > 548.202 )
								if( ema3 <= 635.346 )
									ret := 0.044954
								if( ema3 > 635.346 )
									ret := 0.692308
			if( ema2 > 635.307 )
				if( tema <= 645.754 )
					if( tema <= 628.253 )
						if( VIP <= 0.753533 )
							if( tema <= 622.249 )
								if( VIP <= 0.483918 )
									ret := -0.500000
								if( VIP > 0.483918 )
									ret := -1.000000 // sell
							if( tema > 622.249 )
								ret := 0.000000
						if( VIP > 0.753533 )
							ret := 1.000000 // buy
					if( tema > 628.253 )
						if( VIP_VIM <= -0.00266 )
							if( VIM <= 1.31357 )
								if( ema3 <= 641.295 )
									ret := -0.612903
								if( ema3 > 641.295 )
									ret := -0.891304 // sell
							if( VIM > 1.31357 )
								if( VIP_VIM <= -0.829876 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.829876 )
									ret := -0.217391
						if( VIP_VIM > -0.00266 )
							ret := 0.333333
				if( tema > 645.754 )
					if( ema3 <= 712.352 )
						if( ema2 <= 656.479 )
							if( ema2 <= 650.777 )
								ret := 0.000000
							if( ema2 > 650.777 )
								if( VIP_VIM <= 0.374078 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.374078 )
									ret := 0.750000 // buy
						if( ema2 > 656.479 )
							if( ema3 <= 683.809 )
								if( tema <= 656.469 )
									ret := -0.696970
								if( tema > 656.469 )
									ret := -0.107477
							if( ema3 > 683.809 )
								if( tema <= 678.746 )
									ret := 0.806452 // buy
								if( tema > 678.746 )
									ret := 0.077922
					if( ema3 > 712.352 )
						if( ema13 <= -0.692385 )
							if( ema3 <= 717.433 )
								if( VIP_VIM <= -0.414189 )
									ret := -0.333333
								if( VIP_VIM > -0.414189 )
									ret := -0.976190 // sell
							if( ema3 > 717.433 )
								ret := 0.000000
						if( ema13 > -0.692385 )
							ret := 0.142857
	if( ema13 > -0.179918 )
		if( tema <= 298.268 )
			if( ema3 <= 290.98 )
				if( tema <= 291.81 )
					if( VIM <= 0.73518 )
						if( ema12 <= 4.39639 )
							if( ema12 <= 3.03515 )
								if( VIM <= 0.518579 )
									ret := 0.296296
								if( VIM > 0.518579 )
									ret := -0.001597
							if( ema12 > 3.03515 )
								if( ema1 <= 225.361 )
									ret := -0.902439 // sell
								if( ema1 > 225.361 )
									ret := 0.147059
						if( ema12 > 4.39639 )
							if( ema3 <= 244.92 )
								if( ema3 <= 227.467 )
									ret := 0.928571 // buy
								if( ema3 > 227.467 )
									ret := 1.000000 // buy
							if( ema3 > 244.92 )
								ret := -0.250000
					if( VIM > 0.73518 )
						if( ema3 <= 65.9382 )
							if( VIP_VIM <= 0.189964 )
								if( ema13 <= 0.254722 )
									ret := 0.366269
								if( ema13 > 0.254722 )
									ret := -0.470588
							if( VIP_VIM > 0.189964 )
								if( ema3 <= 64.8193 )
									ret := -0.171875
								if( ema3 > 64.8193 )
									ret := 0.354167
						if( ema3 > 65.9382 )
							if( tema <= 91.6931 )
								if( ema3 <= 83.1315 )
									ret := 0.070870
								if( ema3 > 83.1315 )
									ret := -0.051166
							if( tema > 91.6931 )
								if( ema3 <= 97.6627 )
									ret := 0.718310 // buy
								if( ema3 > 97.6627 )
									ret := 0.103497
				if( tema > 291.81 )
					if( VIP <= 1.50485 )
						if( VIP_VIM <= 0.169647 )
							if( VIP <= 1.05873 )
								if( ema3 <= 290.544 )
									ret := 0.250000
								if( ema3 > 290.544 )
									ret := -0.750000 // sell
							if( VIP > 1.05873 )
								if( VIM <= 1.02711 )
									ret := 0.928571 // buy
								if( VIM > 1.02711 )
									ret := 0.000000
						if( VIP_VIM > 0.169647 )
							if( ema3 <= 282.642 )
								if( ema2 <= 283.605 )
									ret := 1.000000 // buy
								if( ema2 > 283.605 )
									ret := 0.500000
							if( ema3 > 282.642 )
								if( ema12 <= 0.652326 )
									ret := 0.400000
								if( ema12 > 0.652326 )
									ret := -0.530612
					if( VIP > 1.50485 )
						if( ema3 <= 283.775 )
							ret := -0.400000
						if( ema3 > 283.775 )
							if( tema <= 293.175 )
								if( ema3 <= 285.004 )
									ret := -1.000000 // sell
								if( ema3 > 285.004 )
									ret := -0.500000
							if( tema > 293.175 )
								ret := -1.000000 // sell
			if( ema3 > 290.98 )
				if( tema <= 294.707 )
					if( VIP <= 0.965485 )
						if( ema1 <= 291.666 )
							ret := -1.000000 // sell
						if( ema1 > 291.666 )
							ret := 0.000000
					if( VIP > 0.965485 )
						if( tema <= 293.228 )
							if( ema2 <= 291.261 )
								ret := 1.000000 // buy
							if( ema2 > 291.261 )
								if( VIP <= 1.02371 )
									ret := 0.541667
								if( VIP > 1.02371 )
									ret := 0.000000
						if( tema > 293.228 )
							if( VIP_VIM <= -0.144912 )
								ret := 0.250000
							if( VIP_VIM > -0.144912 )
								if( ema1 <= 292.312 )
									ret := 0.500000
								if( ema1 > 292.312 )
									ret := 0.904762 // buy
				if( tema > 294.707 )
					if( ema1 <= 293.69 )
						if( ema12 <= 1.18777 )
							ret := -1.000000 // sell
						if( ema12 > 1.18777 )
							if( ema13 <= 2.29951 )
								ret := 0.750000 // buy
							if( ema13 > 2.29951 )
								ret := -0.500000
					if( ema1 > 293.69 )
						if( VIP <= 1.30689 )
							if( tema <= 296.704 )
								if( ema13 <= 0.723643 )
									ret := 0.066667
								if( ema13 > 0.723643 )
									ret := 0.644860
							if( tema > 296.704 )
								if( VIM <= 0.992594 )
									ret := -0.132530
								if( VIM > 0.992594 )
									ret := 0.458716
						if( VIP > 1.30689 )
							if( ema2 <= 295.6 )
								if( ema3 <= 292.507 )
									ret := -0.500000
								if( ema3 > 292.507 )
									ret := 0.230769
							if( ema2 > 295.6 )
								if( ema1 <= 296.865 )
									ret := -1.000000 // sell
								if( ema1 > 296.865 )
									ret := -0.166667
		if( tema > 298.268 )
			if( VIP <= 1.89322 )
				if( ema12 <= 8.7257 )
					if( VIM <= 1.53848 )
						if( ema12 <= 4.83157 )
							if( ema3 <= 669.233 )
								if( ema3 <= 462.21 )
									ret := 0.006085
								if( ema3 > 462.21 )
									ret := 0.109878
							if( ema3 > 669.233 )
								if( ema2 <= 702.577 )
									ret := -0.620690
								if( ema2 > 702.577 )
									ret := 0.252336
						if( ema12 > 4.83157 )
							if( ema1 <= 312.266 )
								if( VIP <= 1.28419 )
									ret := -1.000000 // sell
								if( VIP > 1.28419 )
									ret := 0.849057 // buy
							if( ema1 > 312.266 )
								if( ema2 <= 651.226 )
									ret := 0.031250
								if( ema2 > 651.226 )
									ret := 0.596774
					if( VIM > 1.53848 )
						if( VIP <= 1.04098 )
							if( VIP_VIM <= -0.895665 )
								ret := -0.750000 // sell
							if( VIP_VIM > -0.895665 )
								if( ema3 <= 362.437 )
									ret := -0.142857
								if( ema3 > 362.437 )
									ret := 1.000000 // buy
						if( VIP > 1.04098 )
							if( ema12 <= 0.15976 )
								ret := -0.166667
							if( ema12 > 0.15976 )
								if( ema1 <= 332.222 )
									ret := -0.250000
								if( ema1 > 332.222 )
									ret := -0.866667 // sell
				if( ema12 > 8.7257 )
					if( ema3 <= 668.08 )
						if( ema2 <= 295.888 )
							ret := -0.750000 // sell
						if( ema2 > 295.888 )
							if( VIP_VIM <= 0.444791 )
								ret := -0.750000 // sell
							if( VIP_VIM > 0.444791 )
								ret := -1.000000 // sell
					if( ema3 > 668.08 )
						ret := 0.000000
			if( VIP > 1.89322 )
				if( ema1 <= 527.493 )
					if( tema <= 319.54 )
						if( ema12 <= 3.11009 )
							if( tema <= 308.271 )
								ret := 0.000000
							if( tema > 308.271 )
								ret := 0.250000
						if( ema12 > 3.11009 )
							ret := 0.500000
					if( tema > 319.54 )
						if( VIM <= 1.13498 )
							ret := 0.142857
						if( VIM > 1.13498 )
							if( tema <= 367.468 )
								if( ema13 <= 4.24359 )
									ret := 0.750000 // buy
								if( ema13 > 4.24359 )
									ret := 1.000000 // buy
							if( tema > 367.468 )
								if( VIP_VIM <= 0.731779 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.731779 )
									ret := -0.250000
				if( ema1 > 527.493 )
					if( ema3 <= 659.95 )
						if( VIP <= 2.04142 )
							ret := -0.250000
						if( VIP > 2.04142 )
							ret := 0.000000
					if( ema3 > 659.95 )
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
float op_operation = decision_tree_0_EPAM_15Min_5b045ef6(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


