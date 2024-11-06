//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TRXUSDT_15Min_1T00_0481268f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1T00_0481268f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_0481268f(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema1 <= 0.061418 )
		if( ema2 <= 0.049855 )
			if( ema1 <= 0.049018 )
				if( ema2 <= 0.048112 )
					if( ema1 <= 0.047181 )
						ret := 1.000000 // buy
					if( ema1 > 0.047181 )
						ret := 0.100000
				if( ema2 > 0.048112 )
					if( ema3 <= 0.049176 )
						ret := 1.000000 // buy
					if( ema3 > 0.049176 )
						ret := 0.727273 // buy
			if( ema1 > 0.049018 )
				if( ema2 <= 0.049487 )
					if( ema3 <= 0.049421 )
						if( ema1 <= 0.049623 )
							if( ema12 <= 0.000661 )
								if( ema3 <= 0.048508 )
									ret := 0.750000 // buy
								if( ema3 > 0.048508 )
									ret := 0.955556 // buy
							if( ema12 > 0.000661 )
								ret := -0.333333
						if( ema1 > 0.049623 )
							ret := -0.500000
					if( ema3 > 0.049421 )
						if( tema <= 0.048949 )
							ret := 0.400000
						if( tema > 0.048949 )
							if( ema1 <= 0.049291 )
								ret := -0.909091 // sell
							if( ema1 > 0.049291 )
								ret := -1.000000 // sell
				if( ema2 > 0.049487 )
					if( ema3 <= 0.04986 )
						if( ema13 <= -2e-05 )
							if( ema13 <= -0.000331 )
								ret := 0.866667 // buy
							if( ema13 > -0.000331 )
								ret := -0.384615
						if( ema13 > -2e-05 )
							if( ema3 <= 0.049644 )
								if( ema3 <= 0.049431 )
									ret := 0.800000 // buy
								if( ema3 > 0.049431 )
									ret := 0.333333
							if( ema3 > 0.049644 )
								ret := 1.000000 // buy
					if( ema3 > 0.04986 )
						if( ema3 <= 0.049903 )
							ret := 0.818182 // buy
						if( ema3 > 0.049903 )
							ret := 1.000000 // buy
		if( ema2 > 0.049855 )
			if( ema12 <= -2.1e-05 )
				if( ema2 <= 0.059583 )
					if( ema3 <= 0.05479 )
						if( tema <= 0.05019 )
							if( ema2 <= 0.050488 )
								if( ema13 <= -0.000197 )
									ret := 0.344828
								if( ema13 > -0.000197 )
									ret := -0.655172
							if( ema2 > 0.050488 )
								if( ema2 <= 0.050557 )
									ret := -0.960000 // sell
								if( ema2 > 0.050557 )
									ret := -0.533333
						if( tema > 0.05019 )
							if( ema3 <= 0.050639 )
								if( ema12 <= -4.4e-05 )
									ret := 1.000000 // buy
								if( ema12 > -4.4e-05 )
									ret := 0.380952
							if( ema3 > 0.050639 )
								if( tema <= 0.054365 )
									ret := 0.134933
								if( tema > 0.054365 )
									ret := 0.435685
					if( ema3 > 0.05479 )
						if( ema12 <= -0.0001 )
							if( ema12 <= -0.000421 )
								if( ema3 <= 0.059712 )
									ret := -0.031111
								if( ema3 > 0.059712 )
									ret := 0.925926 // buy
							if( ema12 > -0.000421 )
								if( ema13 <= -0.000807 )
									ret := -0.777778 // sell
								if( ema13 > -0.000807 )
									ret := -0.180180
						if( ema12 > -0.0001 )
							if( ema13 <= -0.000219 )
								if( ema3 <= 0.059568 )
									ret := 0.662338
								if( ema3 > 0.059568 )
									ret := -0.272727
							if( ema13 > -0.000219 )
								if( ema2 <= 0.058486 )
									ret := -0.135185
								if( ema2 > 0.058486 )
									ret := 0.486631
				if( ema2 > 0.059583 )
					if( ema2 <= 0.060145 )
						if( ema1 <= 0.059731 )
							if( ema3 <= 0.060466 )
								if( ema3 <= 0.059953 )
									ret := 0.392000
								if( ema3 > 0.059953 )
									ret := 0.800000 // buy
							if( ema3 > 0.060466 )
								ret := -0.333333
						if( ema1 > 0.059731 )
							if( tema <= 0.059594 )
								ret := 0.227273
							if( tema > 0.059594 )
								if( ema1 <= 0.060017 )
									ret := 0.876404 // buy
								if( ema1 > 0.060017 )
									ret := 0.564103
					if( ema2 > 0.060145 )
						if( tema <= 0.060628 )
							if( ema13 <= -0.000514 )
								if( ema12 <= -0.000513 )
									ret := 0.046784
								if( ema12 > -0.000513 )
									ret := 0.677215
							if( ema13 > -0.000514 )
								if( ema12 <= -3.3e-05 )
									ret := -0.245575
								if( ema12 > -3.3e-05 )
									ret := 0.600000
						if( tema > 0.060628 )
							if( ema3 <= 0.061223 )
								if( ema13 <= -0.000114 )
									ret := 0.211268
								if( ema13 > -0.000114 )
									ret := 0.688742
							if( ema3 > 0.061223 )
								if( ema3 <= 0.061334 )
									ret := -0.193277
								if( ema3 > 0.061334 )
									ret := 0.355330
			if( ema12 > -2.1e-05 )
				if( tema <= 0.061327 )
					if( ema3 <= 0.060165 )
						if( ema1 <= 0.060068 )
							if( ema1 <= 0.059919 )
								if( ema13 <= -1e-05 )
									ret := -0.143524
								if( ema13 > -1e-05 )
									ret := 0.024824
							if( ema1 > 0.059919 )
								if( tema <= 0.060157 )
									ret := 0.595960
								if( tema > 0.060157 )
									ret := 0.066667
						if( ema1 > 0.060068 )
							if( tema <= 0.060097 )
								ret := 0.761905 // buy
							if( tema > 0.060097 )
								if( ema1 <= 0.060298 )
									ret := -0.456604
								if( ema1 > 0.060298 )
									ret := -0.144737
					if( ema3 > 0.060165 )
						if( ema3 <= 0.060351 )
							if( ema2 <= 0.060042 )
								ret := -1.000000 // sell
							if( ema2 > 0.060042 )
								if( ema1 <= 0.060541 )
									ret := 0.492308
								if( ema1 > 0.060541 )
									ret := 0.941176 // buy
						if( ema3 > 0.060351 )
							if( ema13 <= -6e-06 )
								if( tema <= 0.061092 )
									ret := 0.575540
								if( tema > 0.061092 )
									ret := -0.019608
							if( ema13 > -6e-06 )
								if( tema <= 0.060831 )
									ret := -0.359813
								if( tema > 0.060831 )
									ret := -0.002092
				if( tema > 0.061327 )
					if( ema12 <= 0.000702 )
						if( ema13 <= 0.000457 )
							if( ema12 <= 0.000185 )
								if( ema1 <= 0.061328 )
									ret := -0.125000
								if( ema1 > 0.061328 )
									ret := 0.360000
							if( ema12 > 0.000185 )
								if( tema <= 0.06158 )
									ret := 0.500000
								if( tema > 0.06158 )
									ret := 0.895522 // buy
						if( ema13 > 0.000457 )
							if( ema2 <= 0.060977 )
								if( tema <= 0.061514 )
									ret := 0.333333
								if( tema > 0.061514 )
									ret := -0.425532
							if( ema2 > 0.060977 )
								ret := -1.000000 // sell
					if( ema12 > 0.000702 )
						if( ema13 <= 0.001393 )
							ret := -1.000000 // sell
						if( ema13 > 0.001393 )
							if( ema3 <= 0.059274 )
								ret := 1.000000 // buy
							if( ema3 > 0.059274 )
								ret := 0.800000 // buy
	if( ema1 > 0.061418 )
		if( ema13 <= 0.000897 )
			if( ema13 <= -0.001643 )
				if( ema2 <= 0.069228 )
					if( ema1 <= 0.067539 )
						if( ema3 <= 0.068209 )
							if( tema <= 0.063242 )
								ret := 0.947368 // buy
							if( tema > 0.063242 )
								ret := -0.142857
						if( ema3 > 0.068209 )
							if( tema <= 0.063787 )
								if( ema3 <= 0.070547 )
									ret := 0.857143 // buy
								if( ema3 > 0.070547 )
									ret := 0.777778 // buy
							if( tema > 0.063787 )
								ret := 1.000000 // buy
					if( ema1 > 0.067539 )
						ret := 0.230769
				if( ema2 > 0.069228 )
					if( ema3 <= 0.07093 )
						ret := -1.000000 // sell
					if( ema3 > 0.07093 )
						if( ema12 <= -0.001579 )
							if( ema3 <= 0.081869 )
								if( ema13 <= -0.004536 )
									ret := 0.142857
								if( ema13 > -0.004536 )
									ret := -0.821429 // sell
							if( ema3 > 0.081869 )
								if( ema2 <= 0.082013 )
									ret := 1.000000 // buy
								if( ema2 > 0.082013 )
									ret := 0.000000
						if( ema12 > -0.001579 )
							if( ema1 <= 0.10991 )
								if( tema <= 0.071534 )
									ret := 1.000000 // buy
								if( tema > 0.071534 )
									ret := 0.519126
							if( ema1 > 0.10991 )
								if( ema2 <= 0.118186 )
									ret := -0.600000
								if( ema2 > 0.118186 )
									ret := 0.053846
			if( ema13 > -0.001643 )
				if( ema13 <= -0.000699 )
					if( ema1 <= 0.08231 )
						if( tema <= 0.062359 )
							if( ema12 <= -0.000619 )
								ret := 0.153846
							if( ema12 > -0.000619 )
								if( tema <= 0.061652 )
									ret := -0.465517
								if( tema > 0.061652 )
									ret := -0.840000 // sell
						if( tema > 0.062359 )
							if( ema1 <= 0.065913 )
								if( ema2 <= 0.065123 )
									ret := 0.199005
								if( ema2 > 0.065123 )
									ret := 0.664430
							if( ema1 > 0.065913 )
								if( tema <= 0.08068 )
									ret := -0.123639
								if( tema > 0.08068 )
									ret := 0.283505
					if( ema1 > 0.08231 )
						if( ema1 <= 0.100498 )
							if( ema13 <= -0.000819 )
								if( ema3 <= 0.084173 )
									ret := -0.805556 // sell
								if( ema3 > 0.084173 )
									ret := -0.401929
							if( ema13 > -0.000819 )
								if( ema13 <= -0.000715 )
									ret := -0.890244 // sell
								if( ema13 > -0.000715 )
									ret := -0.454545
						if( ema1 > 0.100498 )
							if( ema13 <= -0.001022 )
								if( ema3 <= 0.108819 )
									ret := 0.686275
								if( ema3 > 0.108819 )
									ret := -0.096774
							if( ema13 > -0.001022 )
								if( ema2 <= 0.119624 )
									ret := -0.037736
								if( ema2 > 0.119624 )
									ret := -0.496094
				if( ema13 > -0.000699 )
					if( ema2 <= 0.061426 )
						if( ema13 <= 0.000422 )
							if( ema13 <= 0.000362 )
								if( ema2 <= 0.061356 )
									ret := 0.100000
								if( ema2 > 0.061356 )
									ret := -0.549550
							if( ema13 > 0.000362 )
								if( tema <= 0.061782 )
									ret := 0.888889 // buy
								if( tema > 0.061782 )
									ret := 0.111111
						if( ema13 > 0.000422 )
							if( ema12 <= 0.000366 )
								if( ema13 <= 0.000552 )
									ret := -0.800000 // sell
								if( ema13 > 0.000552 )
									ret := -1.000000 // sell
							if( ema12 > 0.000366 )
								ret := -0.666667
					if( ema2 > 0.061426 )
						if( ema2 <= 0.160465 )
							if( ema13 <= 0.000256 )
								if( ema3 <= 0.103562 )
									ret := 0.012823
								if( ema3 > 0.103562 )
									ret := -0.047785
							if( ema13 > 0.000256 )
								if( ema2 <= 0.100662 )
									ret := -0.059551
								if( ema2 > 0.100662 )
									ret := 0.147440
						if( ema2 > 0.160465 )
							if( ema12 <= 0.00014 )
								if( ema1 <= 0.162285 )
									ret := -0.557940
								if( ema1 > 0.162285 )
									ret := -0.128713
							if( ema12 > 0.00014 )
								if( ema3 <= 0.16488 )
									ret := -0.044118
								if( ema3 > 0.16488 )
									ret := 0.352941
		if( ema13 > 0.000897 )
			if( ema2 <= 0.125957 )
				if( tema <= 0.062854 )
					if( ema12 <= 0.00052 )
						ret := -0.928571 // sell
					if( ema12 > 0.00052 )
						ret := -1.000000 // sell
				if( tema > 0.062854 )
					if( tema <= 0.063972 )
						if( ema13 <= 0.00126 )
							ret := 0.500000
						if( ema13 > 0.00126 )
							if( ema12 <= 0.000846 )
								ret := 1.000000 // buy
							if( ema12 > 0.000846 )
								ret := 0.666667
					if( tema > 0.063972 )
						if( ema3 <= 0.124142 )
							if( ema1 <= 0.12334 )
								if( ema3 <= 0.119886 )
									ret := -0.248590
								if( ema3 > 0.119886 )
									ret := -0.906250 // sell
							if( ema1 > 0.12334 )
								ret := 1.000000 // buy
						if( ema3 > 0.124142 )
							if( ema3 <= 0.124688 )
								ret := -1.000000 // sell
							if( ema3 > 0.124688 )
								ret := -0.833333 // sell
			if( ema2 > 0.125957 )
				if( tema <= 0.159452 )
					if( ema12 <= 0.001699 )
						if( ema2 <= 0.156292 )
							if( ema1 <= 0.138352 )
								if( ema2 <= 0.136667 )
									ret := 0.390244
								if( ema2 > 0.136667 )
									ret := -0.125000
							if( ema1 > 0.138352 )
								if( ema3 <= 0.150345 )
									ret := 0.728477 // buy
								if( ema3 > 0.150345 )
									ret := 0.977011 // buy
						if( ema2 > 0.156292 )
							ret := -0.333333
					if( ema12 > 0.001699 )
						ret := -0.923077 // sell
				if( tema > 0.159452 )
					if( tema <= 0.164465 )
						if( ema2 <= 0.159658 )
							if( ema13 <= 0.001042 )
								ret := 0.454545
							if( ema13 > 0.001042 )
								if( ema1 <= 0.159555 )
									ret := -0.218750
								if( ema1 > 0.159555 )
									ret := -1.000000 // sell
						if( ema2 > 0.159658 )
							if( ema2 <= 0.161263 )
								if( ema12 <= 0.000656 )
									ret := 0.848485 // buy
								if( ema12 > 0.000656 )
									ret := 0.222222
							if( ema2 > 0.161263 )
								if( tema <= 0.164281 )
									ret := -0.290323
								if( tema > 0.164281 )
									ret := 1.000000 // buy
					if( tema > 0.164465 )
						if( ema2 <= 0.164339 )
							if( tema <= 0.165769 )
								if( ema13 <= 0.001713 )
									ret := -0.941176 // sell
								if( ema13 > 0.001713 )
									ret := -1.000000 // sell
							if( tema > 0.165769 )
								ret := -0.727273 // sell
						if( ema2 > 0.164339 )
							ret := -0.437500
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_0481268f(ema1, tema, ema12, ema2, ema3, ema13)

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


