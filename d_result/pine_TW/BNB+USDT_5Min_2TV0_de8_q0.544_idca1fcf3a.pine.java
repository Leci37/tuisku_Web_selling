//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: BNBUSDT_5Min_2TV0_ca1fcf3a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_5Min_2TV0_ca1fcf3a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_5Min_ca1fcf3a(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP <= 0.764532 )
		if( ema2 <= 706.286 )
			if( ema1 <= 480.578 )
				if( ema12 <= -0.455083 )
					if( VIP <= 0.605703 )
						if( VIP_VIM <= -0.866405 )
							if( ema2 <= 359.818 )
								if( ema13 <= -3.28683 )
									ret := -0.636364
								if( ema13 > -3.28683 )
									ret := 0.541667
							if( ema2 > 359.818 )
								ret := -0.285714
						if( VIP_VIM > -0.866405 )
							if( VIM <= 1.39552 )
								if( VIP <= 0.572985 )
									ret := 0.892405 // buy
								if( VIP > 0.572985 )
									ret := 0.637500
							if( VIM > 1.39552 )
								if( VIM <= 1.41408 )
									ret := -0.666667
								if( VIM > 1.41408 )
									ret := 0.700000 // buy
					if( VIP > 0.605703 )
						if( ema2 <= 312.415 )
							if( ema1 <= 295.731 )
								if( ema13 <= -7.43553 )
									ret := -1.000000 // sell
								if( ema13 > -7.43553 )
									ret := 0.297550
							if( ema1 > 295.731 )
								if( ema1 <= 299.855 )
									ret := -0.661538
								if( ema1 > 299.855 )
									ret := 0.079186
						if( ema2 > 312.415 )
							if( ema2 <= 318.783 )
								if( VIP <= 0.697724 )
									ret := 0.490385
								if( VIP > 0.697724 )
									ret := 0.802817 // buy
							if( ema2 > 318.783 )
								if( VIP <= 0.739601 )
									ret := 0.428854
								if( VIP > 0.739601 )
									ret := 0.120690
				if( ema12 > -0.455083 )
					if( ema3 <= 206.131 )
						if( ema13 <= -0.377056 )
							ret := 0.500000
						if( ema13 > -0.377056 )
							ret := 0.833333 // buy
					if( ema3 > 206.131 )
						if( ema12 <= -0.321736 )
							if( ema13 <= -0.587332 )
								if( tema <= 228.459 )
									ret := 0.071146
								if( tema > 228.459 )
									ret := -0.179272
							if( ema13 > -0.587332 )
								if( ema12 <= -0.348939 )
									ret := 0.442177
								if( ema12 > -0.348939 )
									ret := 0.044118
						if( ema12 > -0.321736 )
							if( VIP_VIM <= -0.471563 )
								if( ema3 <= 215.192 )
									ret := -0.028369
								if( ema3 > 215.192 )
									ret := -0.263158
							if( VIP_VIM > -0.471563 )
								if( ema2 <= 226.256 )
									ret := -0.122951
								if( ema2 > 226.256 )
									ret := 0.213235
			if( ema1 > 480.578 )
				if( ema12 <= -3.14607 )
					if( ema13 <= -6.8602 )
						if( ema1 <= 592.705 )
							if( ema13 <= -8.30318 )
								if( ema2 <= 508.074 )
									ret := -0.727273 // sell
								if( ema2 > 508.074 )
									ret := 0.638060
							if( ema13 > -8.30318 )
								if( ema3 <= 579.773 )
									ret := -0.388601
								if( ema3 > 579.773 )
									ret := 0.785714 // buy
						if( ema1 > 592.705 )
							if( ema2 <= 600.413 )
								ret := -1.000000 // sell
							if( ema2 > 600.413 )
								if( VIM <= 1.30945 )
									ret := 0.368421
								if( VIM > 1.30945 )
									ret := -0.651163
					if( ema13 > -6.8602 )
						if( tema <= 489.326 )
							ret := -0.833333 // sell
						if( tema > 489.326 )
							if( VIM <= 1.16902 )
								if( ema3 <= 583.884 )
									ret := 0.555556
								if( ema3 > 583.884 )
									ret := -0.333333
							if( VIM > 1.16902 )
								if( ema12 <= -3.25501 )
									ret := 0.691395
								if( ema12 > -3.25501 )
									ret := 0.287671
				if( ema12 > -3.14607 )
					if( tema <= 542.317 )
						if( ema12 <= -3.05385 )
							if( ema13 <= -5.67025 )
								ret := -0.500000
							if( ema13 > -5.67025 )
								if( tema <= 514.561 )
									ret := -1.000000 // sell
								if( tema > 514.561 )
									ret := -0.800000 // sell
						if( ema12 > -3.05385 )
							if( ema13 <= -5.59726 )
								if( ema12 <= -2.92177 )
									ret := -0.625000
								if( ema12 > -2.92177 )
									ret := -1.000000 // sell
							if( ema13 > -5.59726 )
								if( ema2 <= 542.463 )
									ret := -0.023202
								if( ema2 > 542.463 )
									ret := -0.345291
					if( tema > 542.317 )
						if( ema12 <= -0.804448 )
							if( ema1 <= 569.843 )
								if( ema13 <= -2.01188 )
									ret := 0.353963
								if( ema13 > -2.01188 )
									ret := -0.073333
							if( ema1 > 569.843 )
								if( VIM <= 1.27148 )
									ret := 0.140899
								if( VIM > 1.27148 )
									ret := -0.002604
						if( ema12 > -0.804448 )
							if( ema2 <= 604.229 )
								if( ema2 <= 602.288 )
									ret := -0.032459
								if( ema2 > 602.288 )
									ret := 0.391304
							if( ema2 > 604.229 )
								if( ema3 <= 678.974 )
									ret := -0.585586
								if( ema3 > 678.974 )
									ret := 0.071429
		if( ema2 > 706.286 )
			if( ema3 <= 710.155 )
				ret := -0.692308
			if( ema3 > 710.155 )
				if( ema3 <= 713.072 )
					ret := -1.000000 // sell
				if( ema3 > 713.072 )
					ret := -0.916667 // sell
	if( VIP > 0.764532 )
		if( ema1 <= 584.612 )
			if( VIP <= 1.08645 )
				if( ema12 <= -0.087128 )
					if( ema3 <= 206.22 )
						if( ema2 <= 205.254 )
							if( ema13 <= -0.317651 )
								if( ema1 <= 204.842 )
									ret := 0.500000
								if( ema1 > 204.842 )
									ret := 0.181818
							if( ema13 > -0.317651 )
								if( ema2 <= 205.126 )
									ret := 0.250000
								if( ema2 > 205.126 )
									ret := -0.687500
						if( ema2 > 205.254 )
							if( ema3 <= 205.851 )
								if( ema1 <= 205.138 )
									ret := 1.000000 // buy
								if( ema1 > 205.138 )
									ret := 0.174603
							if( ema3 > 205.851 )
								if( ema13 <= -0.205148 )
									ret := 0.824176 // buy
								if( ema13 > -0.205148 )
									ret := 0.200000
					if( ema3 > 206.22 )
						if( ema2 <= 211.801 )
							if( VIM <= 1.15408 )
								if( ema13 <= -0.665072 )
									ret := -0.557692
								if( ema13 > -0.665072 )
									ret := 0.025243
							if( VIM > 1.15408 )
								if( ema1 <= 207.269 )
									ret := 0.166667
								if( ema1 > 207.269 )
									ret := -0.427778
						if( ema2 > 211.801 )
							if( ema13 <= -4.96071 )
								if( ema1 <= 461.653 )
									ret := 0.085470
								if( ema1 > 461.653 )
									ret := 0.492593
							if( ema13 > -4.96071 )
								if( ema2 <= 527.51 )
									ret := 0.062994
								if( ema2 > 527.51 )
									ret := -0.001451
				if( ema12 > -0.087128 )
					if( ema13 <= 1.05882 )
						if( ema3 <= 533.489 )
							if( ema3 <= 504.177 )
								if( ema3 <= 485.741 )
									ret := -0.004784
								if( ema3 > 485.741 )
									ret := 0.216216
							if( ema3 > 504.177 )
								if( VIP <= 1.03837 )
									ret := -0.166444
								if( VIP > 1.03837 )
									ret := 0.008204
						if( ema3 > 533.489 )
							if( ema12 <= 0.90456 )
								if( ema1 <= 535.631 )
									ret := 0.607306
								if( ema1 > 535.631 )
									ret := 0.031825
							if( ema12 > 0.90456 )
								if( ema1 <= 579.472 )
									ret := 0.344828
								if( ema1 > 579.472 )
									ret := 1.000000 // buy
					if( ema13 > 1.05882 )
						if( ema12 <= 1.26107 )
							if( ema1 <= 243.966 )
								if( VIP_VIM <= 0.154658 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.154658 )
									ret := 0.454545
							if( ema1 > 243.966 )
								if( ema3 <= 564.765 )
									ret := -0.205860
								if( ema3 > 564.765 )
									ret := 0.003215
						if( ema12 > 1.26107 )
							if( ema3 <= 530.135 )
								if( tema <= 428.553 )
									ret := -0.666667
								if( tema > 428.553 )
									ret := 0.842105 // buy
							if( ema3 > 530.135 )
								if( VIM <= 0.918616 )
									ret := -0.720000 // sell
								if( VIM > 0.918616 )
									ret := -0.260870
			if( VIP > 1.08645 )
				if( ema3 <= 264.655 )
					if( ema13 <= 2.0606 )
						if( ema12 <= 0.082626 )
							if( ema13 <= -0.711453 )
								ret := 0.960000 // buy
							if( ema13 > -0.711453 )
								if( ema1 <= 247.33 )
									ret := 0.056808
								if( ema1 > 247.33 )
									ret := -0.215278
						if( ema12 > 0.082626 )
							if( VIM <= 0.536014 )
								if( ema13 <= 1.59972 )
									ret := -0.783333 // sell
								if( ema13 > 1.59972 )
									ret := -0.176471
							if( VIM > 0.536014 )
								if( ema13 <= 0.929583 )
									ret := -0.094434
								if( ema13 > 0.929583 )
									ret := 0.013260
					if( ema13 > 2.0606 )
						if( VIM <= 0.708877 )
							if( tema <= 248.486 )
								if( ema3 <= 219.688 )
									ret := -0.250000
								if( ema3 > 219.688 )
									ret := -0.977778 // sell
							if( tema > 248.486 )
								if( VIP_VIM <= 0.534039 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.534039 )
									ret := 0.526882
						if( VIM > 0.708877 )
							if( ema3 <= 262.17 )
								if( VIP_VIM <= 0.437908 )
									ret := -0.674157
								if( VIP_VIM > 0.437908 )
									ret := -0.941176 // sell
							if( ema3 > 262.17 )
								ret := 0.555556
				if( ema3 > 264.655 )
					if( VIP_VIM <= 0.348969 )
						if( ema1 <= 293.469 )
							if( ema1 <= 278.333 )
								if( ema2 <= 270.688 )
									ret := 0.162879
								if( ema2 > 270.688 )
									ret := -0.400000
							if( ema1 > 278.333 )
								if( ema12 <= 0.151986 )
									ret := -0.113636
								if( ema12 > 0.151986 )
									ret := 0.835294 // buy
						if( ema1 > 293.469 )
							if( ema3 <= 309.837 )
								if( ema3 <= 294.196 )
									ret := -0.761364 // sell
								if( ema3 > 294.196 )
									ret := -0.210141
							if( ema3 > 309.837 )
								if( ema3 <= 310.157 )
									ret := 0.569620
								if( ema3 > 310.157 )
									ret := -0.048319
					if( VIP_VIM > 0.348969 )
						if( ema2 <= 518.97 )
							if( tema <= 523.465 )
								if( ema1 <= 268.544 )
									ret := 0.608696
								if( ema1 > 268.544 )
									ret := 0.086178
							if( tema > 523.465 )
								ret := 1.000000 // buy
						if( ema2 > 518.97 )
							if( ema2 <= 534.999 )
								if( ema1 <= 534.417 )
									ret := -0.060345
								if( ema1 > 534.417 )
									ret := -0.705357 // sell
							if( ema2 > 534.999 )
								if( ema1 <= 541.436 )
									ret := 0.318271
								if( ema1 > 541.436 )
									ret := -0.007226
		if( ema1 > 584.612 )
			if( tema <= 706.98 )
				if( ema12 <= 0.757249 )
					if( tema <= 694.607 )
						if( ema3 <= 685.428 )
							if( ema3 <= 630.489 )
								if( ema1 <= 617.449 )
									ret := -0.054149
								if( ema1 > 617.449 )
									ret := -0.210788
							if( ema3 > 630.489 )
								if( ema12 <= -0.662268 )
									ret := 0.557377
								if( ema12 > -0.662268 )
									ret := 0.067227
						if( ema3 > 685.428 )
							if( VIP_VIM <= 0.214453 )
								if( ema12 <= -1.63857 )
									ret := 0.000000
								if( ema12 > -1.63857 )
									ret := -0.736434 // sell
							if( VIP_VIM > 0.214453 )
								ret := 0.615385
					if( tema > 694.607 )
						if( ema2 <= 699.527 )
							if( ema13 <= 0.975862 )
								if( tema <= 700.367 )
									ret := 0.804233 // buy
								if( tema > 700.367 )
									ret := 0.333333
							if( ema13 > 0.975862 )
								ret := 0.000000
						if( ema2 > 699.527 )
							if( ema1 <= 701.022 )
								if( ema13 <= -0.834145 )
									ret := -0.151515
								if( ema13 > -0.834145 )
									ret := -0.765306 // sell
							if( ema1 > 701.022 )
								if( ema1 <= 703.688 )
									ret := 0.606557
								if( ema1 > 703.688 )
									ret := 0.072115
				if( ema12 > 0.757249 )
					if( ema2 <= 587.183 )
						if( ema12 <= 3.33164 )
							if( ema3 <= 585.201 )
								if( ema12 <= 2.57425 )
									ret := -0.279070
								if( ema12 > 2.57425 )
									ret := -0.915254 // sell
							if( ema3 > 585.201 )
								if( VIP <= 1.2096 )
									ret := -0.958333 // sell
								if( VIP > 1.2096 )
									ret := -0.557692
						if( ema12 > 3.33164 )
							if( VIP <= 1.34405 )
								if( ema12 <= 3.77978 )
									ret := 1.000000 // buy
								if( ema12 > 3.77978 )
									ret := 0.153846
							if( VIP > 1.34405 )
								if( ema1 <= 587.686 )
									ret := -0.166667
								if( ema1 > 587.686 )
									ret := -0.866667 // sell
					if( ema2 > 587.183 )
						if( ema3 <= 602.578 )
							if( ema1 <= 608.915 )
								if( VIM <= 0.47152 )
									ret := 0.804348 // buy
								if( VIM > 0.47152 )
									ret := -0.033481
							if( ema1 > 608.915 )
								ret := 1.000000 // buy
						if( ema3 > 602.578 )
							if( ema1 <= 607.021 )
								if( ema1 <= 604.842 )
									ret := -0.968750 // sell
								if( ema1 > 604.842 )
									ret := -0.560847
							if( ema1 > 607.021 )
								if( ema12 <= 2.35901 )
									ret := -0.269107
								if( ema12 > 2.35901 )
									ret := 0.083004
			if( tema > 706.98 )
				if( VIM <= 0.885115 )
					if( ema1 <= 713.363 )
						if( ema12 <= 1.51394 )
							if( ema2 <= 706.596 )
								if( VIM <= 0.864784 )
									ret := -0.150000
								if( VIM > 0.864784 )
									ret := 0.800000 // buy
							if( ema2 > 706.596 )
								if( VIP <= 1.16404 )
									ret := -0.944444 // sell
								if( VIP > 1.16404 )
									ret := -0.600000
						if( ema12 > 1.51394 )
							if( ema12 <= 2.61863 )
								ret := 1.000000 // buy
							if( ema12 > 2.61863 )
								ret := 0.000000
					if( ema1 > 713.363 )
						ret := -0.812500 // sell
				if( VIM > 0.885115 )
					if( ema1 <= 706.403 )
						ret := -0.062500
					if( ema1 > 706.403 )
						if( tema <= 707.117 )
							ret := -0.538462
						if( tema > 707.117 )
							if( VIP_VIM <= -0.034162 )
								if( ema13 <= -0.885128 )
									ret := -0.923077 // sell
								if( ema13 > -0.885128 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.034162 )
								if( ema13 <= 1.25841 )
									ret := -0.666667
								if( ema13 > 1.25841 )
									ret := -0.930556 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_5Min_ca1fcf3a(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


