//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: LYFT_1Min_1T00_0fadbfdc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1T00_0fadbfdc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_0fadbfdc(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.003355 )
		if( tema <= 12.494 )
			if( tema <= 12.4472 )
				if( ema2 <= 10.8937 )
					if( ema12 <= -0.002658 )
						if( ema3 <= 10.6504 )
							if( tema <= 10.5046 )
								if( ema2 <= 10.5078 )
									ret := 0.186583
								if( ema2 > 10.5078 )
									ret := 0.707865 // buy
							if( tema > 10.5046 )
								if( ema12 <= -0.01709 )
									ret := -0.982759 // sell
								if( ema12 > -0.01709 )
									ret := -0.611111
						if( ema3 > 10.6504 )
							if( ema1 <= 10.7043 )
								if( ema1 <= 10.6276 )
									ret := 0.294118
								if( ema1 > 10.6276 )
									ret := 0.880682 // buy
							if( ema1 > 10.7043 )
								if( ema3 <= 10.7977 )
									ret := 0.384021
								if( ema3 > 10.7977 )
									ret := 0.179724
					if( ema12 > -0.002658 )
						if( ema2 <= 9.24499 )
							if( ema1 <= 9.08632 )
								if( ema2 <= 9.07602 )
									ret := 0.444444
								if( ema2 > 9.07602 )
									ret := 1.000000 // buy
							if( ema1 > 9.08632 )
								if( ema2 <= 9.11431 )
									ret := 0.042857
								if( ema2 > 9.11431 )
									ret := 0.666667
						if( ema2 > 9.24499 )
							if( ema1 <= 9.45565 )
								if( ema12 <= 0.00147 )
									ret := -0.051282
								if( ema12 > 0.00147 )
									ret := -0.972973 // sell
							if( ema1 > 9.45565 )
								if( tema <= 9.52975 )
									ret := 1.000000 // buy
								if( tema > 9.52975 )
									ret := 0.039315
				if( ema2 > 10.8937 )
					if( ema13 <= -0.14267 )
						if( ema1 <= 11.8785 )
							if( ema1 <= 11.2667 )
								if( ema13 <= -0.411456 )
									ret := -0.857143 // sell
								if( ema13 > -0.411456 )
									ret := 0.000000
							if( ema1 > 11.2667 )
								if( ema2 <= 11.5972 )
									ret := -1.000000 // sell
								if( ema2 > 11.5972 )
									ret := -0.947368 // sell
						if( ema1 > 11.8785 )
							if( ema2 <= 12.2818 )
								ret := -0.090909
							if( ema2 > 12.2818 )
								ret := -0.555556
					if( ema13 > -0.14267 )
						if( tema <= 12.0292 )
							if( tema <= 11.9142 )
								if( ema13 <= 0.002717 )
									ret := 0.012456
								if( ema13 > 0.002717 )
									ret := 0.222026
							if( tema > 11.9142 )
								if( ema2 <= 11.9648 )
									ret := -0.417989
								if( ema2 > 11.9648 )
									ret := -0.060109
						if( tema > 12.0292 )
							if( ema13 <= -0.046337 )
								if( ema2 <= 12.2012 )
									ret := 0.763158 // buy
								if( ema2 > 12.2012 )
									ret := -0.165339
							if( ema13 > -0.046337 )
								if( ema13 <= -0.020556 )
									ret := 0.292164
								if( ema13 > -0.020556 )
									ret := 0.105403
			if( tema > 12.4472 )
				if( ema13 <= -0.014723 )
					if( ema2 <= 12.4719 )
						if( ema12 <= -0.007591 )
							ret := -0.866667 // sell
						if( ema12 > -0.007591 )
							ret := -0.333333
					if( ema2 > 12.4719 )
						if( tema <= 12.4863 )
							if( ema13 <= -0.043763 )
								if( ema12 <= -0.025464 )
									ret := 0.567568
								if( ema12 > -0.025464 )
									ret := -0.307692
							if( ema13 > -0.043763 )
								if( ema1 <= 12.486 )
									ret := 0.641791
								if( ema1 > 12.486 )
									ret := 0.822034 // buy
						if( tema > 12.4863 )
							if( ema12 <= -0.011206 )
								if( ema12 <= -0.020936 )
									ret := -0.357143
								if( ema12 > -0.020936 )
									ret := -0.125000
							if( ema12 > -0.011206 )
								if( ema3 <= 12.516 )
									ret := 0.285714
								if( ema3 > 12.516 )
									ret := 1.000000 // buy
				if( ema13 > -0.014723 )
					if( ema12 <= -0.009572 )
						ret := -0.952381 // sell
					if( ema12 > -0.009572 )
						if( ema3 <= 12.5099 )
							if( ema12 <= -0.002073 )
								if( ema2 <= 12.4822 )
									ret := 0.408602
								if( ema2 > 12.4822 )
									ret := -0.077778
							if( ema12 > -0.002073 )
								if( ema1 <= 12.4539 )
									ret := 0.913043 // buy
								if( ema1 > 12.4539 )
									ret := 0.331683
						if( ema3 > 12.5099 )
							if( ema2 <= 12.5129 )
								if( ema1 <= 12.4998 )
									ret := 1.000000 // buy
								if( ema1 > 12.4998 )
									ret := 0.880000 // buy
							if( ema2 > 12.5129 )
								ret := 0.083333
		if( tema > 12.494 )
			if( tema <= 17.906 )
				if( ema1 <= 17.9666 )
					if( ema12 <= -0.143287 )
						if( ema12 <= -0.157471 )
							ret := 1.000000 // buy
						if( ema12 > -0.157471 )
							if( ema2 <= 16.9708 )
								if( ema2 <= 16.3373 )
									ret := 0.916667 // buy
								if( ema2 > 16.3373 )
									ret := -1.000000 // sell
							if( ema2 > 16.9708 )
								ret := 0.937500 // buy
					if( ema12 > -0.143287 )
						if( ema3 <= 12.5113 )
							if( ema12 <= -0.002337 )
								if( tema <= 12.4955 )
									ret := -0.789474 // sell
								if( tema > 12.4955 )
									ret := -1.000000 // sell
							if( ema12 > -0.002337 )
								if( tema <= 12.5043 )
									ret := 0.076923
								if( tema > 12.5043 )
									ret := -0.469697
						if( ema3 > 12.5113 )
							if( ema12 <= -0.061419 )
								if( tema <= 13.5354 )
									ret := 0.193878
								if( tema > 13.5354 )
									ret := -0.377990
							if( ema12 > -0.061419 )
								if( ema12 <= -0.040866 )
									ret := 0.181347
								if( ema12 > -0.040866 )
									ret := 0.012862
				if( ema1 > 17.9666 )
					ret := 1.000000 // buy
			if( tema > 17.906 )
				if( ema3 <= 18.0567 )
					if( ema3 <= 18.0481 )
						ret := -1.000000 // sell
					if( ema3 > 18.0481 )
						ret := -0.666667
				if( ema3 > 18.0567 )
					if( ema3 <= 18.0614 )
						ret := 0.384615
					if( ema3 > 18.0614 )
						if( ema1 <= 18.0689 )
							ret := -0.190476
						if( ema1 > 18.0689 )
							if( ema12 <= -0.002655 )
								ret := -0.714286 // sell
							if( ema12 > -0.002655 )
								ret := -1.000000 // sell
	if( ema12 > 0.003355 )
		if( ema3 <= 17.5492 )
			if( ema1 <= 11.6517 )
				if( ema3 <= 10.3245 )
					if( ema2 <= 10.2587 )
						if( ema1 <= 10.2428 )
							if( tema <= 9.70135 )
								if( ema2 <= 9.45577 )
									ret := -0.308081
								if( ema2 > 9.45577 )
									ret := 0.398417
							if( tema > 9.70135 )
								if( tema <= 9.73043 )
									ret := -0.592784
								if( tema > 9.73043 )
									ret := -0.138958
						if( ema1 > 10.2428 )
							if( ema13 <= 0.118683 )
								if( ema1 <= 10.2742 )
									ret := 1.000000 // buy
								if( ema1 > 10.2742 )
									ret := 0.846154 // buy
							if( ema13 > 0.118683 )
								ret := -0.100000
					if( ema2 > 10.2587 )
						if( ema2 <= 10.3089 )
							if( tema <= 10.3398 )
								if( ema1 <= 10.2941 )
									ret := -0.870968 // sell
								if( ema1 > 10.2941 )
									ret := -1.000000 // sell
							if( tema > 10.3398 )
								if( ema2 <= 10.2798 )
									ret := -1.000000 // sell
								if( ema2 > 10.2798 )
									ret := -0.076923
						if( ema2 > 10.3089 )
							if( ema3 <= 10.315 )
								ret := 0.318182
							if( ema3 > 10.315 )
								ret := -1.000000 // sell
				if( ema3 > 10.3245 )
					if( ema1 <= 10.3892 )
						if( ema2 <= 10.3612 )
							ret := 0.500000
						if( ema2 > 10.3612 )
							ret := 1.000000 // buy
					if( ema1 > 10.3892 )
						if( tema <= 11.4751 )
							if( ema12 <= 0.025329 )
								if( ema3 <= 11.3021 )
									ret := -0.046960
								if( ema3 > 11.3021 )
									ret := 0.156076
							if( ema12 > 0.025329 )
								if( tema <= 10.9703 )
									ret := -0.174242
								if( tema > 10.9703 )
									ret := 0.428854
						if( tema > 11.4751 )
							if( ema2 <= 11.5 )
								if( ema12 <= 0.06595 )
									ret := -0.270125
								if( ema12 > 0.06595 )
									ret := -0.888889 // sell
							if( ema2 > 11.5 )
								if( ema13 <= 0.042333 )
									ret := 0.038301
								if( ema13 > 0.042333 )
									ret := 0.371795
			if( ema1 > 11.6517 )
				if( ema13 <= 0.055612 )
					if( ema3 <= 15.6506 )
						if( ema13 <= 0.006771 )
							if( ema2 <= 11.8968 )
								if( ema3 <= 11.8855 )
									ret := -0.510000
								if( ema3 > 11.8855 )
									ret := -1.000000 // sell
							if( ema2 > 11.8968 )
								if( ema12 <= 0.013248 )
									ret := -0.223340
								if( ema12 > 0.013248 )
									ret := 1.000000 // buy
						if( ema13 > 0.006771 )
							if( ema2 <= 13.4786 )
								if( ema1 <= 11.8252 )
									ret := -0.231898
								if( ema1 > 11.8252 )
									ret := -0.040117
							if( ema2 > 13.4786 )
								if( ema12 <= 0.011571 )
									ret := -0.095483
								if( ema12 > 0.011571 )
									ret := -0.257361
					if( ema3 > 15.6506 )
						if( ema2 <= 16.2736 )
							if( ema1 <= 16.0209 )
								if( tema <= 15.7873 )
									ret := 0.206202
								if( tema > 15.7873 )
									ret := -0.132464
							if( ema1 > 16.0209 )
								if( tema <= 16.3028 )
									ret := 0.234538
								if( tema > 16.3028 )
									ret := -0.820896 // sell
						if( ema2 > 16.2736 )
							if( ema2 <= 16.2996 )
								if( ema3 <= 16.277 )
									ret := -0.480000
								if( ema3 > 16.277 )
									ret := -0.842105 // sell
							if( ema2 > 16.2996 )
								if( ema1 <= 16.4249 )
									ret := -0.235507
								if( ema1 > 16.4249 )
									ret := -0.026485
				if( ema13 > 0.055612 )
					if( ema12 <= 0.040787 )
						if( ema12 <= 0.03635 )
							if( ema2 <= 17.4182 )
								if( tema <= 12.6032 )
									ret := -0.063348
								if( tema > 12.6032 )
									ret := -0.315364
							if( ema2 > 17.4182 )
								if( ema2 <= 17.4674 )
									ret := 0.769231 // buy
								if( ema2 > 17.4674 )
									ret := -0.176471
						if( ema12 > 0.03635 )
							if( ema1 <= 16.2336 )
								if( ema2 <= 13.9529 )
									ret := -0.529412
								if( ema2 > 13.9529 )
									ret := 0.320000
							if( ema1 > 16.2336 )
								if( ema3 <= 16.2846 )
									ret := -0.962963 // sell
								if( ema3 > 16.2846 )
									ret := -0.392593
					if( ema12 > 0.040787 )
						if( ema2 <= 16.4597 )
							if( ema1 <= 15.9835 )
								if( tema <= 15.9873 )
									ret := -0.061979
								if( tema > 15.9873 )
									ret := -0.682927
							if( ema1 > 15.9835 )
								if( ema3 <= 16.1307 )
									ret := 0.486667
								if( ema3 > 16.1307 )
									ret := 0.123288
						if( ema2 > 16.4597 )
							if( ema13 <= 0.141004 )
								if( ema3 <= 17.1355 )
									ret := -0.320988
								if( ema3 > 17.1355 )
									ret := 0.083333
							if( ema13 > 0.141004 )
								if( ema2 <= 17.3113 )
									ret := -0.962264 // sell
								if( ema2 > 17.3113 )
									ret := -0.409091
		if( ema3 > 17.5492 )
			if( ema13 <= 0.143213 )
				if( ema1 <= 17.655 )
					if( ema2 <= 17.5685 )
						ret := 0.055556
					if( ema2 > 17.5685 )
						if( ema1 <= 17.5944 )
							if( ema13 <= 0.005817 )
								ret := -1.000000 // sell
							if( ema13 > 0.005817 )
								ret := -0.166667
						if( ema1 > 17.5944 )
							if( ema3 <= 17.5796 )
								if( ema12 <= 0.03489 )
									ret := -0.972973 // sell
								if( ema12 > 0.03489 )
									ret := -1.000000 // sell
							if( ema3 > 17.5796 )
								if( ema1 <= 17.6253 )
									ret := -0.666667
								if( ema1 > 17.6253 )
									ret := -0.952381 // sell
				if( ema1 > 17.655 )
					if( ema1 <= 17.7575 )
						if( tema <= 17.72 )
							ret := -0.250000
						if( tema > 17.72 )
							if( ema1 <= 17.6822 )
								ret := 1.000000 // buy
							if( ema1 > 17.6822 )
								if( ema12 <= 0.009245 )
									ret := 0.409091
								if( ema12 > 0.009245 )
									ret := -0.153846
					if( ema1 > 17.7575 )
						if( ema2 <= 17.8925 )
							if( ema12 <= 0.010249 )
								if( ema12 <= 0.007956 )
									ret := -0.785714 // sell
								if( ema12 > 0.007956 )
									ret := -0.545455
							if( ema12 > 0.010249 )
								if( tema <= 17.8053 )
									ret := -0.937500 // sell
								if( tema > 17.8053 )
									ret := -0.750000 // sell
						if( ema2 > 17.8925 )
							if( tema <= 18.068 )
								ret := 1.000000 // buy
							if( tema > 18.068 )
								if( ema3 <= 18.0455 )
									ret := -0.363636
								if( ema3 > 18.0455 )
									ret := -1.000000 // sell
			if( ema13 > 0.143213 )
				if( tema <= 18.2113 )
					ret := 0.764706 // buy
				if( tema > 18.2113 )
					ret := 0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_LYFT_1Min_0fadbfdc(ema12, ema3, ema13, tema, ema1, ema2)

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


