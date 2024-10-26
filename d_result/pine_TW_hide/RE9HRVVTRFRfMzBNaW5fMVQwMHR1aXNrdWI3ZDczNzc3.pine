//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: DOGEUSDT_30Min_1T00_b7d73777 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1T00_b7d73777", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_b7d73777(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.001511 )
		if( tema <= 0.298833 )
			if( tema <= 0.084853 )
				if( tema <= 0.056954 )
					if( tema <= 0.052342 )
						if( ema1 <= 0.040466 )
							if( ema2 <= 0.038937 )
								if( ema2 <= 0.032161 )
									ret := -0.176471
								if( ema2 > 0.032161 )
									ret := 1.000000 // buy
							if( ema2 > 0.038937 )
								if( tema <= 0.031531 )
									ret := -0.500000
								if( tema > 0.031531 )
									ret := -1.000000 // sell
						if( ema1 > 0.040466 )
							if( ema13 <= -0.002671 )
								if( ema2 <= 0.049641 )
									ret := 0.652174
								if( ema2 > 0.049641 )
									ret := 1.000000 // buy
							if( ema13 > -0.002671 )
								ret := -0.500000
					if( tema > 0.052342 )
						if( tema <= 0.054714 )
							ret := -0.833333 // sell
						if( tema > 0.054714 )
							ret := -0.090909
				if( tema > 0.056954 )
					if( ema2 <= 0.085672 )
						if( ema1 <= 0.083144 )
							if( ema2 <= 0.069945 )
								if( tema <= 0.064455 )
									ret := 0.690909
								if( tema > 0.064455 )
									ret := -0.300000
							if( ema2 > 0.069945 )
								if( ema1 <= 0.081297 )
									ret := 0.771654 // buy
								if( ema1 > 0.081297 )
									ret := 0.083333
						if( ema1 > 0.083144 )
							ret := -1.000000 // sell
					if( ema2 > 0.085672 )
						if( ema1 <= 0.08631 )
							if( ema1 <= 0.084635 )
								if( ema2 <= 0.086154 )
									ret := 1.000000 // buy
								if( ema2 > 0.086154 )
									ret := 0.966667 // buy
							if( ema1 > 0.084635 )
								if( tema <= 0.082806 )
									ret := 0.200000
								if( tema > 0.082806 )
									ret := 1.000000 // buy
						if( ema1 > 0.08631 )
							ret := 0.250000
			if( tema > 0.084853 )
				if( ema1 <= 0.088442 )
					ret := -1.000000 // sell
				if( ema1 > 0.088442 )
					if( ema3 <= 0.307206 )
						if( tema <= 0.285505 )
							if( ema12 <= -0.007569 )
								if( tema <= 0.20297 )
									ret := 0.938144 // buy
								if( tema > 0.20297 )
									ret := 0.309278
							if( ema12 > -0.007569 )
								if( tema <= 0.245316 )
									ret := 0.210476
								if( tema > 0.245316 )
									ret := 0.030162
						if( tema > 0.285505 )
							if( ema13 <= -0.004318 )
								if( ema2 <= 0.29631 )
									ret := 0.841270 // buy
								if( ema2 > 0.29631 )
									ret := 0.269231
							if( ema13 > -0.004318 )
								if( ema13 <= -0.003345 )
									ret := 0.804348 // buy
								if( ema13 > -0.003345 )
									ret := 0.961039 // buy
					if( ema3 > 0.307206 )
						if( ema13 <= -0.0234 )
							ret := 1.000000 // buy
						if( ema13 > -0.0234 )
							if( ema1 <= 0.291912 )
								ret := 0.200000
							if( ema1 > 0.291912 )
								if( ema13 <= -0.005185 )
									ret := -0.880597 // sell
								if( ema13 > -0.005185 )
									ret := -0.300000
		if( tema > 0.298833 )
			if( ema13 <= -0.024341 )
				if( ema12 <= -0.026056 )
					if( ema2 <= 0.523954 )
						ret := 1.000000 // buy
					if( ema2 > 0.523954 )
						if( ema13 <= -0.054866 )
							if( ema12 <= -0.03009 )
								ret := -0.909091 // sell
							if( ema12 > -0.03009 )
								ret := -1.000000 // sell
						if( ema13 > -0.054866 )
							ret := -0.333333
				if( ema12 > -0.026056 )
					if( ema3 <= 0.391686 )
						ret := -0.066667
					if( ema3 > 0.391686 )
						if( ema12 <= -0.015396 )
							ret := 1.000000 // buy
						if( ema12 > -0.015396 )
							ret := 0.470588
			if( ema13 > -0.024341 )
				if( ema12 <= -0.006296 )
					if( ema3 <= 0.405349 )
						if( ema3 <= 0.369322 )
							if( ema2 <= 0.337753 )
								if( ema13 <= -0.014961 )
									ret := -1.000000 // sell
								if( ema13 > -0.014961 )
									ret := -0.409091
							if( ema2 > 0.337753 )
								if( ema2 <= 0.345929 )
									ret := 0.961538 // buy
								if( ema2 > 0.345929 )
									ret := 0.227273
						if( ema3 > 0.369322 )
							if( ema1 <= 0.369038 )
								if( ema2 <= 0.366622 )
									ret := -1.000000 // sell
								if( ema2 > 0.366622 )
									ret := -0.843750 // sell
							if( ema1 > 0.369038 )
								ret := -0.230769
					if( ema3 > 0.405349 )
						if( ema1 <= 0.418523 )
							if( tema <= 0.390655 )
								ret := 1.000000 // buy
							if( tema > 0.390655 )
								ret := 0.562500
						if( ema1 > 0.418523 )
							if( ema13 <= -0.011493 )
								if( ema12 <= -0.013999 )
									ret := 1.000000 // buy
								if( ema12 > -0.013999 )
									ret := -0.159420
							if( ema13 > -0.011493 )
								if( ema2 <= 0.549758 )
									ret := 0.811321 // buy
								if( ema2 > 0.549758 )
									ret := 0.222222
				if( ema12 > -0.006296 )
					if( ema3 <= 0.383894 )
						if( ema2 <= 0.379048 )
							if( ema3 <= 0.312903 )
								if( ema12 <= -0.002327 )
									ret := -0.941176 // sell
								if( ema12 > -0.002327 )
									ret := 0.296296
							if( ema3 > 0.312903 )
								if( tema <= 0.308956 )
									ret := 0.373832
								if( tema > 0.308956 )
									ret := -0.110701
						if( ema2 > 0.379048 )
							if( tema <= 0.369266 )
								ret := 1.000000 // buy
							if( tema > 0.369266 )
								ret := 0.250000
					if( ema3 > 0.383894 )
						if( ema1 <= 0.623317 )
							if( ema2 <= 0.607334 )
								if( ema3 <= 0.528454 )
									ret := -0.302956
								if( ema3 > 0.528454 )
									ret := -0.918033 // sell
							if( ema2 > 0.607334 )
								if( ema3 <= 0.621077 )
									ret := 0.500000
								if( ema3 > 0.621077 )
									ret := 1.000000 // buy
						if( ema1 > 0.623317 )
							ret := -1.000000 // sell
	if( ema12 > -0.001511 )
		if( ema3 <= 0.168599 )
			if( ema2 <= 0.067269 )
				if( ema13 <= -0.000638 )
					if( ema3 <= 0.055354 )
						if( ema3 <= 0.035958 )
							if( tema <= 0.033326 )
								if( ema3 <= 0.028751 )
									ret := 0.021277
								if( ema3 > 0.028751 )
									ret := 0.776471 // buy
							if( tema > 0.033326 )
								ret := -0.714286 // sell
						if( ema3 > 0.035958 )
							if( ema2 <= 0.038933 )
								if( ema1 <= 0.033646 )
									ret := -0.750000 // sell
								if( ema1 > 0.033646 )
									ret := -1.000000 // sell
							if( ema2 > 0.038933 )
								if( tema <= 0.051015 )
									ret := 0.115942
								if( tema > 0.051015 )
									ret := -0.281690
					if( ema3 > 0.055354 )
						if( ema12 <= -0.000921 )
							if( tema <= 0.052344 )
								if( ema13 <= -0.002378 )
									ret := 0.727273 // buy
								if( ema13 > -0.002378 )
									ret := 1.000000 // buy
							if( tema > 0.052344 )
								if( ema2 <= 0.064358 )
									ret := -0.287770
								if( ema2 > 0.064358 )
									ret := 0.461538
						if( ema12 > -0.000921 )
							if( ema2 <= 0.056646 )
								if( tema <= 0.054113 )
									ret := 1.000000 // buy
								if( tema > 0.054113 )
									ret := 0.533333
							if( ema2 > 0.056646 )
								if( ema1 <= 0.056182 )
									ret := -0.875000 // sell
								if( ema1 > 0.056182 )
									ret := 0.294118
				if( ema13 > -0.000638 )
					if( ema2 <= 0.066131 )
						if( ema13 <= 0.001943 )
							if( ema12 <= 0.001132 )
								if( tema <= 0.066934 )
									ret := 0.029614
								if( tema > 0.066934 )
									ret := -0.316327
							if( ema12 > 0.001132 )
								if( tema <= 0.058766 )
									ret := -0.547945
								if( tema > 0.058766 )
									ret := 0.222222
						if( ema13 > 0.001943 )
							if( tema <= 0.050887 )
								if( ema2 <= 0.013186 )
									ret := -0.958333 // sell
								if( ema2 > 0.013186 )
									ret := 0.542683
							if( tema > 0.050887 )
								if( ema3 <= 0.059567 )
									ret := -0.551821
								if( ema3 > 0.059567 )
									ret := -0.050000
					if( ema2 > 0.066131 )
						if( ema12 <= 0.000116 )
							if( ema13 <= 4e-05 )
								if( ema13 <= -0.000404 )
									ret := -0.235294
								if( ema13 > -0.000404 )
									ret := 0.289086
							if( ema13 > 4e-05 )
								if( tema <= 0.066334 )
									ret := 0.081633
								if( tema > 0.066334 )
									ret := -0.333333
						if( ema12 > 0.000116 )
							if( tema <= 0.067732 )
								if( ema12 <= 0.000209 )
									ret := 0.372727
								if( ema12 > 0.000209 )
									ret := 0.787356 // buy
							if( tema > 0.067732 )
								if( tema <= 0.068588 )
									ret := -0.237113
								if( tema > 0.068588 )
									ret := 0.744681 // buy
			if( ema2 > 0.067269 )
				if( ema3 <= 0.069778 )
					if( ema1 <= 0.069351 )
						if( ema2 <= 0.068945 )
							if( ema2 <= 0.068114 )
								if( ema2 <= 0.067658 )
									ret := -0.222222
								if( ema2 > 0.067658 )
									ret := 0.132653
							if( ema2 > 0.068114 )
								if( ema13 <= 0.001145 )
									ret := -0.207566
								if( ema13 > 0.001145 )
									ret := 0.916667 // buy
						if( ema2 > 0.068945 )
							if( ema2 <= 0.069229 )
								if( tema <= 0.068904 )
									ret := 0.537975
								if( tema > 0.068904 )
									ret := 0.173228
							if( ema2 > 0.069229 )
								if( tema <= 0.069073 )
									ret := -0.056604
								if( tema > 0.069073 )
									ret := -0.476190
					if( ema1 > 0.069351 )
						if( ema2 <= 0.069165 )
							if( ema3 <= 0.068868 )
								if( tema <= 0.070976 )
									ret := -0.224138
								if( tema > 0.070976 )
									ret := -0.833333 // sell
							if( ema3 > 0.068868 )
								ret := -1.000000 // sell
						if( ema2 > 0.069165 )
							if( ema3 <= 0.069172 )
								if( ema12 <= 0.001834 )
									ret := -0.059459
								if( ema12 > 0.001834 )
									ret := -0.913043 // sell
							if( ema3 > 0.069172 )
								if( ema2 <= 0.070192 )
									ret := -0.452431
								if( ema2 > 0.070192 )
									ret := 0.608696
				if( ema3 > 0.069778 )
					if( ema3 <= 0.163777 )
						if( ema2 <= 0.078545 )
							if( ema2 <= 0.077056 )
								if( tema <= 0.075907 )
									ret := 0.061759
								if( tema > 0.075907 )
									ret := -0.184441
							if( ema2 > 0.077056 )
								if( ema13 <= 0.001848 )
									ret := 0.223610
								if( ema13 > 0.001848 )
									ret := -0.275000
						if( ema2 > 0.078545 )
							if( ema12 <= 0.000109 )
								if( ema13 <= -0.002872 )
									ret := 0.429448
								if( ema13 > -0.002872 )
									ret := -0.054190
							if( ema12 > 0.000109 )
								if( tema <= 0.118434 )
									ret := -0.053382
								if( tema > 0.118434 )
									ret := 0.090721
					if( ema3 > 0.163777 )
						if( ema2 <= 0.164559 )
							if( ema12 <= 0 )
								if( ema3 <= 0.164157 )
									ret := -0.023810
								if( ema3 > 0.164157 )
									ret := 0.617021
							if( ema12 > 0 )
								if( ema13 <= 0.00074 )
									ret := 0.800000 // buy
								if( ema13 > 0.00074 )
									ret := 0.500000
						if( ema2 > 0.164559 )
							if( ema13 <= 0.00016 )
								if( ema1 <= 0.164769 )
									ret := -0.328358
								if( ema1 > 0.164769 )
									ret := 0.448363
							if( ema13 > 0.00016 )
								if( ema12 <= 0.00042 )
									ret := -0.386861
								if( ema12 > 0.00042 )
									ret := 0.044665
		if( ema3 > 0.168599 )
			if( ema3 <= 0.169632 )
				if( ema13 <= -0.002833 )
					ret := 0.692308
				if( ema13 > -0.002833 )
					if( ema2 <= 0.171805 )
						if( ema12 <= -0.001062 )
							if( tema <= 0.165535 )
								ret := -0.900000 // sell
							if( tema > 0.165535 )
								ret := -1.000000 // sell
						if( ema12 > -0.001062 )
							if( ema1 <= 0.168518 )
								if( ema1 <= 0.168342 )
									ret := -0.322581
								if( ema1 > 0.168342 )
									ret := 0.739130 // buy
							if( ema1 > 0.168518 )
								if( ema2 <= 0.169136 )
									ret := -0.326087
								if( ema2 > 0.169136 )
									ret := -0.634483
					if( ema2 > 0.171805 )
						if( ema12 <= 0.003131 )
							ret := 1.000000 // buy
						if( ema12 > 0.003131 )
							ret := -0.333333
			if( ema3 > 0.169632 )
				if( tema <= 0.713496 )
					if( ema2 <= 0.662327 )
						if( ema13 <= 0.048955 )
							if( tema <= 0.169656 )
								if( ema13 <= -0.001675 )
									ret := -0.549020
								if( ema13 > -0.001675 )
									ret := 0.463855
							if( tema > 0.169656 )
								if( tema <= 0.1704 )
									ret := -0.473684
								if( tema > 0.1704 )
									ret := -0.075351
						if( ema13 > 0.048955 )
							if( ema3 <= 0.531203 )
								if( ema3 <= 0.266315 )
									ret := -1.000000 // sell
								if( ema3 > 0.266315 )
									ret := -0.600000
							if( ema3 > 0.531203 )
								ret := -1.000000 // sell
					if( ema2 > 0.662327 )
						if( ema2 <= 0.704365 )
							ret := 1.000000 // buy
						if( ema2 > 0.704365 )
							ret := 0.928571 // buy
				if( tema > 0.713496 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_b7d73777(ema12, ema3, ema13, tema, ema1, ema2)

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


