//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: DOTUSDT_15Min_2TV0_fd95d66b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2TV0_fd95d66b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_fd95d66b(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema13 <= -0.043201 )
		if( ema1 <= 6.76512 )
			if( ema3 <= 6.8267 )
				if( VIP_VIM <= -0.469183 )
					if( VIP <= 0.502786 )
						if( VIM <= 1.37876 )
							if( VIP_VIM <= -0.824131 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.824131 )
								ret := 0.928571 // buy
						if( VIM > 1.37876 )
							ret := 0.000000
					if( VIP > 0.502786 )
						if( ema2 <= 4.15673 )
							if( ema3 <= 4.09345 )
								ret := 0.500000
							if( ema3 > 4.09345 )
								if( VIP_VIM <= -0.592845 )
									ret := 0.974359 // buy
								if( VIP_VIM > -0.592845 )
									ret := 0.750000 // buy
						if( ema2 > 4.15673 )
							if( ema2 <= 6.31018 )
								if( ema13 <= -0.054321 )
									ret := 0.151576
								if( ema13 > -0.054321 )
									ret := -0.135734
							if( ema2 > 6.31018 )
								if( VIM <= 1.40859 )
									ret := -0.134478
								if( VIM > 1.40859 )
									ret := 0.952381 // buy
				if( VIP_VIM > -0.469183 )
					if( VIM <= 1.13341 )
						if( tema <= 6.23122 )
							if( ema13 <= -0.057987 )
								if( ema3 <= 5.55933 )
									ret := 0.117647
								if( ema3 > 5.55933 )
									ret := -0.633987
							if( ema13 > -0.057987 )
								if( VIP <= 0.884936 )
									ret := 0.460870
								if( VIP > 0.884936 )
									ret := -0.042105
						if( tema > 6.23122 )
							if( tema <= 6.58205 )
								if( ema1 <= 6.46751 )
									ret := 0.366337
								if( ema1 > 6.46751 )
									ret := 0.763359 // buy
							if( tema > 6.58205 )
								if( ema1 <= 6.66042 )
									ret := -0.636364
								if( ema1 > 6.66042 )
									ret := 0.112782
					if( VIM > 1.13341 )
						if( ema2 <= 4.4095 )
							if( ema2 <= 4.03995 )
								ret := 1.000000 // buy
							if( ema2 > 4.03995 )
								if( ema3 <= 4.32926 )
									ret := -0.030928
								if( ema3 > 4.32926 )
									ret := -0.733333 // sell
						if( ema2 > 4.4095 )
							if( ema2 <= 5.17367 )
								if( VIM <= 1.18115 )
									ret := 0.854701 // buy
								if( VIM > 1.18115 )
									ret := 0.517045
							if( ema2 > 5.17367 )
								if( ema12 <= -0.057692 )
									ret := 0.836478 // buy
								if( ema12 > -0.057692 )
									ret := 0.213096
			if( ema3 > 6.8267 )
				if( tema <= 6.41892 )
					ret := 0.285714
				if( tema > 6.41892 )
					if( VIM <= 1.14162 )
						ret := 0.000000
					if( VIM > 1.14162 )
						if( tema <= 6.59618 )
							if( ema13 <= -0.276972 )
								ret := 1.000000 // buy
							if( ema13 > -0.276972 )
								ret := 0.181818
						if( tema > 6.59618 )
							if( ema13 <= -0.090784 )
								if( ema3 <= 6.85671 )
									ret := 1.000000 // buy
								if( ema3 > 6.85671 )
									ret := 0.871795 // buy
							if( ema13 > -0.090784 )
								ret := 0.750000 // buy
		if( ema1 > 6.76512 )
			if( ema13 <= -0.528434 )
				if( ema1 <= 12.3414 )
					ret := 1.000000 // buy
				if( ema1 > 12.3414 )
					ret := -0.882353 // sell
			if( ema13 > -0.528434 )
				if( tema <= 6.84199 )
					if( VIP_VIM <= -0.487904 )
						if( ema1 <= 6.85644 )
							if( ema13 <= -0.059378 )
								if( tema <= 6.64046 )
									ret := -0.272727
								if( tema > 6.64046 )
									ret := 0.787500 // buy
							if( ema13 > -0.059378 )
								if( VIM <= 1.22877 )
									ret := -1.000000 // sell
								if( VIM > 1.22877 )
									ret := 0.050000
						if( ema1 > 6.85644 )
							if( tema <= 6.69473 )
								ret := 1.000000 // buy
							if( tema > 6.69473 )
								if( ema13 <= -0.11233 )
									ret := -0.847458 // sell
								if( ema13 > -0.11233 )
									ret := -0.166667
					if( VIP_VIM > -0.487904 )
						if( ema1 <= 6.8076 )
							if( ema12 <= -0.034879 )
								if( VIP <= 0.885719 )
									ret := 0.100000
								if( VIP > 0.885719 )
									ret := 1.000000 // buy
							if( ema12 > -0.034879 )
								if( ema13 <= -0.047522 )
									ret := -0.549020
								if( ema13 > -0.047522 )
									ret := 0.368421
						if( ema1 > 6.8076 )
							if( VIP_VIM <= -0.275724 )
								if( VIM <= 1.17796 )
									ret := -0.875000 // sell
								if( VIM > 1.17796 )
									ret := -0.440860
							if( VIP_VIM > -0.275724 )
								if( ema1 <= 6.8473 )
									ret := -0.500000
								if( ema1 > 6.8473 )
									ret := 0.600000
				if( tema > 6.84199 )
					if( VIP_VIM <= -0.572324 )
						if( ema3 <= 16.7911 )
							if( tema <= 15.514 )
								if( tema <= 14.7852 )
									ret := -0.053763
								if( tema > 14.7852 )
									ret := -1.000000 // sell
							if( tema > 15.514 )
								ret := 0.928571 // buy
						if( ema3 > 16.7911 )
							ret := -1.000000 // sell
					if( VIP_VIM > -0.572324 )
						if( ema2 <= 11.4357 )
							if( VIP <= 0.743328 )
								if( VIP <= 0.712051 )
									ret := -0.018519
								if( VIP > 0.712051 )
									ret := 0.446809
							if( VIP > 0.743328 )
								if( tema <= 7.1295 )
									ret := 0.296296
								if( tema > 7.1295 )
									ret := 0.037609
						if( ema2 > 11.4357 )
							if( ema12 <= -0.150247 )
								if( VIM <= 1.23524 )
									ret := 0.875000 // buy
								if( VIM > 1.23524 )
									ret := -0.611111
							if( ema12 > -0.150247 )
								if( ema1 <= 13.1038 )
									ret := -0.708696 // sell
								if( ema1 > 13.1038 )
									ret := 0.049839
	if( ema13 > -0.043201 )
		if( ema2 <= 10.4217 )
			if( ema13 <= 0.199283 )
				if( VIP_VIM <= 0.312139 )
					if( tema <= 4.5187 )
						if( ema1 <= 4.03648 )
							if( ema13 <= -0.019883 )
								if( VIP_VIM <= -0.389725 )
									ret := 0.655844
								if( VIP_VIM > -0.389725 )
									ret := 0.169492
							if( ema13 > -0.019883 )
								if( ema3 <= 3.93551 )
									ret := 0.015842
								if( ema3 > 3.93551 )
									ret := 0.186220
						if( ema1 > 4.03648 )
							if( ema2 <= 4.04255 )
								if( VIM <= 0.915742 )
									ret := -0.735294 // sell
								if( VIM > 0.915742 )
									ret := -0.152941
							if( ema2 > 4.04255 )
								if( ema2 <= 4.48648 )
									ret := 0.020680
								if( ema2 > 4.48648 )
									ret := 0.178156
					if( tema > 4.5187 )
						if( ema13 <= 0.031655 )
							if( ema12 <= -0.002008 )
								if( ema1 <= 6.05348 )
									ret := -0.045812
								if( ema1 > 6.05348 )
									ret := 0.017566
							if( ema12 > -0.002008 )
								if( ema12 <= 0.039085 )
									ret := -0.042192
								if( ema12 > 0.039085 )
									ret := 0.833333 // buy
						if( ema13 > 0.031655 )
							if( ema1 <= 9.93122 )
								if( tema <= 7.22624 )
									ret := -0.015486
								if( tema > 7.22624 )
									ret := -0.198054
							if( ema1 > 9.93122 )
								if( VIP_VIM <= 0.276271 )
									ret := 0.328194
								if( VIP_VIM > 0.276271 )
									ret := -0.292135
				if( VIP_VIM > 0.312139 )
					if( ema2 <= 8.38349 )
						if( VIM <= 0.668545 )
							if( tema <= 5.87748 )
								if( ema13 <= 0.05278 )
									ret := -0.080439
								if( ema13 > 0.05278 )
									ret := -0.378323
							if( tema > 5.87748 )
								if( VIP <= 1.38089 )
									ret := -0.097291
								if( VIP > 1.38089 )
									ret := 0.256228
						if( VIM > 0.668545 )
							if( ema1 <= 8.27971 )
								if( ema1 <= 7.52268 )
									ret := 0.089675
								if( ema1 > 7.52268 )
									ret := -0.057826
							if( ema1 > 8.27971 )
								if( ema1 <= 8.36633 )
									ret := 0.359649
								if( ema1 > 8.36633 )
									ret := 0.842105 // buy
					if( ema2 > 8.38349 )
						if( VIM <= 0.615595 )
							if( VIP <= 1.40553 )
								if( tema <= 8.6834 )
									ret := 0.954545 // buy
								if( tema > 8.6834 )
									ret := 0.375000
							if( VIP > 1.40553 )
								ret := -0.318182
						if( VIM > 0.615595 )
							if( ema12 <= 0.10663 )
								if( ema1 <= 10.1571 )
									ret := -0.159918
								if( ema1 > 10.1571 )
									ret := -0.621795
							if( ema12 > 0.10663 )
								if( ema2 <= 8.82607 )
									ret := -0.625000
								if( ema2 > 8.82607 )
									ret := 0.823529 // buy
			if( ema13 > 0.199283 )
				if( ema2 <= 8.45071 )
					if( VIM <= 0.624832 )
						if( ema1 <= 6.26565 )
							ret := -0.733333 // sell
						if( ema1 > 6.26565 )
							if( ema1 <= 6.68937 )
								ret := 1.000000 // buy
							if( ema1 > 6.68937 )
								if( VIP_VIM <= 0.743472 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.743472 )
									ret := -0.562500
					if( VIM > 0.624832 )
						if( ema12 <= 0.185129 )
							if( VIP <= 1.20732 )
								ret := -0.117647
							if( VIP > 1.20732 )
								if( ema12 <= 0.13576 )
									ret := 0.879630 // buy
								if( ema12 > 0.13576 )
									ret := 0.528571
						if( ema12 > 0.185129 )
							ret := 1.000000 // buy
				if( ema2 > 8.45071 )
					if( tema <= 9.42639 )
						if( VIM <= 0.744419 )
							if( ema2 <= 8.60787 )
								ret := -0.545455
							if( ema2 > 8.60787 )
								if( ema2 <= 8.90039 )
									ret := 0.897436 // buy
								if( ema2 > 8.90039 )
									ret := 0.000000
						if( VIM > 0.744419 )
							if( VIP <= 1.18197 )
								ret := -0.166667
							if( VIP > 1.18197 )
								if( tema <= 9.03999 )
									ret := -0.285714
								if( tema > 9.03999 )
									ret := -1.000000 // sell
					if( tema > 9.42639 )
						if( VIM <= 0.70886 )
							if( ema2 <= 9.44885 )
								if( VIP <= 1.28452 )
									ret := -0.583333
								if( VIP > 1.28452 )
									ret := 0.708861 // buy
							if( ema2 > 9.44885 )
								if( VIP_VIM <= 0.943076 )
									ret := -0.918367 // sell
								if( VIP_VIM > 0.943076 )
									ret := 0.333333
						if( VIM > 0.70886 )
							if( ema3 <= 10.2109 )
								if( VIP_VIM <= 0.539444 )
									ret := 0.957983 // buy
								if( VIP_VIM > 0.539444 )
									ret := 0.500000
							if( ema3 > 10.2109 )
								ret := 0.200000
		if( ema2 > 10.4217 )
			if( ema3 <= 10.5802 )
				if( tema <= 10.396 )
					if( ema2 <= 10.4468 )
						ret := 1.000000 // buy
					if( ema2 > 10.4468 )
						ret := 0.400000
				if( tema > 10.396 )
					if( ema3 <= 10.4005 )
						if( VIP <= 1.22045 )
							ret := -0.636364
						if( VIP > 1.22045 )
							if( tema <= 10.9072 )
								ret := 1.000000 // buy
							if( tema > 10.9072 )
								ret := 0.250000
					if( ema3 > 10.4005 )
						if( ema12 <= 0.013975 )
							if( VIM <= 0.940483 )
								if( ema2 <= 10.5685 )
									ret := -0.258065
								if( ema2 > 10.5685 )
									ret := 1.000000 // buy
							if( VIM > 0.940483 )
								if( ema13 <= -0.026388 )
									ret := -1.000000 // sell
								if( ema13 > -0.026388 )
									ret := -0.510067
						if( ema12 > 0.013975 )
							if( VIM <= 0.807574 )
								if( VIP_VIM <= 0.422902 )
									ret := -0.928571 // sell
								if( VIP_VIM > 0.422902 )
									ret := -0.369565
							if( VIM > 0.807574 )
								if( ema13 <= 0.040483 )
									ret := -0.704545 // sell
								if( ema13 > 0.040483 )
									ret := -0.936000 // sell
			if( ema3 > 10.5802 )
				if( ema1 <= 11.0682 )
					if( tema <= 10.6262 )
						if( VIP <= 0.948743 )
							ret := 0.444444
						if( VIP > 0.948743 )
							if( VIP <= 1.00907 )
								if( ema2 <= 10.6297 )
									ret := 0.923077 // buy
								if( ema2 > 10.6297 )
									ret := 1.000000 // buy
							if( VIP > 1.00907 )
								ret := 0.750000 // buy
					if( tema > 10.6262 )
						if( VIP_VIM <= -0.223142 )
							if( ema1 <= 10.7273 )
								ret := -1.000000 // sell
							if( ema1 > 10.7273 )
								ret := -0.714286 // sell
						if( VIP_VIM > -0.223142 )
							if( ema12 <= 0.025805 )
								if( ema12 <= -0.008881 )
									ret := -0.135802
								if( ema12 > -0.008881 )
									ret := 0.447644
							if( ema12 > 0.025805 )
								if( ema1 <= 10.8616 )
									ret := -0.650602
								if( ema1 > 10.8616 )
									ret := 0.256983
				if( ema1 > 11.0682 )
					if( tema <= 14.4383 )
						if( tema <= 11.8236 )
							if( ema2 <= 11.6416 )
								if( ema12 <= 0.007472 )
									ret := -0.804511 // sell
								if( ema12 > 0.007472 )
									ret := -0.157895
							if( ema2 > 11.6416 )
								if( ema2 <= 11.7494 )
									ret := 1.000000 // buy
								if( ema2 > 11.7494 )
									ret := -0.071429
						if( tema > 11.8236 )
							if( VIP_VIM <= 0.468996 )
								if( ema3 <= 11.7483 )
									ret := 0.692308
								if( ema3 > 11.7483 )
									ret := -0.622581
							if( VIP_VIM > 0.468996 )
								if( ema2 <= 11.4411 )
									ret := -0.687500
								if( ema2 > 11.4411 )
									ret := -1.000000 // sell
					if( tema > 14.4383 )
						if( tema <= 15.057 )
							if( ema2 <= 14.7128 )
								if( ema2 <= 14.5063 )
									ret := 0.142857
								if( ema2 > 14.5063 )
									ret := -0.806452 // sell
							if( ema2 > 14.7128 )
								if( VIP <= 0.930305 )
									ret := -0.095238
								if( VIP > 0.930305 )
									ret := 0.647059
						if( tema > 15.057 )
							if( ema2 <= 17.0173 )
								if( tema <= 16.1163 )
									ret := -0.411765
								if( tema > 16.1163 )
									ret := 0.078125
							if( ema2 > 17.0173 )
								if( tema <= 17.0769 )
									ret := 0.333333
								if( tema > 17.0769 )
									ret := -0.906977 // sell
	
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
float op_operation = decision_tree_0_DOTUSDT_15Min_fd95d66b(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


