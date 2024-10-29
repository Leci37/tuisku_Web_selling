//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: XLMUSDT_30Min_2BT0_3b7ffeee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2BT0_3b7ffeee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_3b7ffeee(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tema <= 0.671185 )
		if( tema <= 0.084807 )
			if( ema13 <= -0.001857 )
				if( ema1 <= 0.083313 )
					if( bbm <= 0.001401 )
						if( ema13 <= -0.003291 )
							ret := -0.647059
						if( ema13 > -0.003291 )
							if( bearPower <= -0.001678 )
								if( tema <= 0.072166 )
									ret := -0.800000 // sell
								if( tema > 0.072166 )
									ret := 0.078431
							if( bearPower > -0.001678 )
								if( bullPower <= -0.000651 )
									ret := 0.823529 // buy
								if( bullPower > -0.000651 )
									ret := 0.333333
					if( bbm > 0.001401 )
						if( ema1 <= 0.080301 )
							if( tema <= 0.076193 )
								ret := 0.750000 // buy
							if( tema > 0.076193 )
								if( bullPower <= -0.000608 )
									ret := 1.000000 // buy
								if( bullPower > -0.000608 )
									ret := 0.909091 // buy
						if( ema1 > 0.080301 )
							if( bearPower <= -0.004895 )
								ret := 0.600000
							if( bearPower > -0.004895 )
								ret := 0.000000
				if( ema1 > 0.083313 )
					if( ema2 <= 0.087835 )
						if( bearPower <= -0.004333 )
							ret := 1.000000 // buy
						if( bearPower > -0.004333 )
							if( bullPower <= -0.00124 )
								ret := 0.500000
							if( bullPower > -0.00124 )
								ret := 1.000000 // buy
					if( ema2 > 0.087835 )
						ret := 0.333333
			if( ema13 > -0.001857 )
				if( ema12 <= -0.000657 )
					if( ema2 <= 0.086991 )
						if( ema2 <= 0.077986 )
							if( ema1 <= 0.071997 )
								if( ema12 <= -0.000765 )
									ret := 0.545455
								if( ema12 > -0.000765 )
									ret := -0.969697 // sell
							if( ema1 > 0.071997 )
								if( ema1 <= 0.075651 )
									ret := 0.256410
								if( ema1 > 0.075651 )
									ret := 0.700000 // buy
						if( ema2 > 0.077986 )
							if( bearPower <= -0.00278 )
								ret := 0.416667
							if( bearPower > -0.00278 )
								if( ema1 <= 0.079973 )
									ret := -0.914286 // sell
								if( ema1 > 0.079973 )
									ret := -0.446602
					if( ema2 > 0.086991 )
						ret := 1.000000 // buy
				if( ema12 > -0.000657 )
					if( ema12 <= -0.000531 )
						if( tema <= 0.072315 )
							ret := -0.400000
						if( tema > 0.072315 )
							if( tema <= 0.079737 )
								if( ema13 <= -0.000938 )
									ret := 0.870370 // buy
								if( ema13 > -0.000938 )
									ret := 0.500000
							if( tema > 0.079737 )
								if( bullPower <= -0.000232 )
									ret := 0.275000
								if( bullPower > -0.000232 )
									ret := -0.727273 // sell
					if( ema12 > -0.000531 )
						if( ema1 <= 0.084516 )
							if( tema <= 0.069917 )
								if( bearPower <= -0.000404 )
									ret := 0.961538 // buy
								if( bearPower > -0.000404 )
									ret := 0.652174
							if( tema > 0.069917 )
								if( bbp <= 0.001356 )
									ret := 0.064176
								if( bbp > 0.001356 )
									ret := 0.226994
						if( ema1 > 0.084516 )
							if( bullPower <= -0.000356 )
								if( bbp <= -0.001442 )
									ret := 0.692308
								if( bbp > -0.001442 )
									ret := 1.000000 // buy
							if( bullPower > -0.000356 )
								if( ema3 <= 0.084823 )
									ret := 0.610390
								if( ema3 > 0.084823 )
									ret := 0.061224
		if( tema > 0.084807 )
			if( bbm <= 0.002502 )
				if( ema2 <= 0.118397 )
					if( tema <= 0.08556 )
						if( bbp <= -0.002442 )
							if( bearPower <= -0.001878 )
								ret := -0.833333 // sell
							if( bearPower > -0.001878 )
								ret := -0.937500 // sell
						if( bbp > -0.002442 )
							if( bbp <= 0.001329 )
								if( bearPower <= 0.000292 )
									ret := -0.256471
								if( bearPower > 0.000292 )
									ret := 0.291667
							if( bbp > 0.001329 )
								if( ema1 <= 0.083939 )
									ret := -0.400000
								if( ema1 > 0.083939 )
									ret := 0.322581
					if( tema > 0.08556 )
						if( ema2 <= 0.08669 )
							if( tema <= 0.087352 )
								if( ema12 <= -5.2e-05 )
									ret := 0.441860
								if( ema12 > -5.2e-05 )
									ret := 0.005607
							if( tema > 0.087352 )
								if( ema3 <= 0.084735 )
									ret := -0.705882 // sell
								if( ema3 > 0.084735 )
									ret := 0.840000 // buy
						if( ema2 > 0.08669 )
							if( ema13 <= -0.000542 )
								if( tema <= 0.086036 )
									ret := -0.857143 // sell
								if( tema > 0.086036 )
									ret := 0.092404
							if( ema13 > -0.000542 )
								if( bbp <= 0.004737 )
									ret := -0.016889
								if( bbp > 0.004737 )
									ret := -0.303965
				if( ema2 > 0.118397 )
					if( ema1 <= 0.367507 )
						if( ema2 <= 0.119333 )
							if( ema2 <= 0.119182 )
								if( tema <= 0.11789 )
									ret := -0.405594
								if( tema > 0.11789 )
									ret := -0.149278
							if( ema2 > 0.119182 )
								if( tema <= 0.120675 )
									ret := -0.560284
								if( tema > 0.120675 )
									ret := 0.300000
						if( ema2 > 0.119333 )
							if( ema3 <= 0.345391 )
								if( ema1 <= 0.119204 )
									ret := 0.629371
								if( ema1 > 0.119204 )
									ret := -0.050844
							if( ema3 > 0.345391 )
								if( ema12 <= 0.000719 )
									ret := -0.124434
								if( ema12 > 0.000719 )
									ret := -0.571429
					if( ema1 > 0.367507 )
						if( bbp <= 0.000878 )
							if( bearPower <= -0.004566 )
								if( bbm <= 0.00224 )
									ret := 0.230769
								if( bbm > 0.00224 )
									ret := -0.656250
							if( bearPower > -0.004566 )
								if( ema1 <= 0.406483 )
									ret := 0.244576
								if( ema1 > 0.406483 )
									ret := 0.643678
						if( bbp > 0.000878 )
							if( ema12 <= 0.001346 )
								if( ema1 <= 0.402621 )
									ret := 0.106017
								if( ema1 > 0.402621 )
									ret := -0.552381
							if( ema12 > 0.001346 )
								if( ema1 <= 0.375373 )
									ret := 0.794118 // buy
								if( ema1 > 0.375373 )
									ret := 0.008000
			if( bbm > 0.002502 )
				if( bearPower <= -0.033338 )
					if( bullPower <= -0.016886 )
						if( bullPower <= -0.033179 )
							ret := 0.750000 // buy
						if( bullPower > -0.033179 )
							if( bbp <= -0.060988 )
								ret := 1.000000 // buy
							if( bbp > -0.060988 )
								ret := 0.900000 // buy
					if( bullPower > -0.016886 )
						if( ema1 <= 0.585502 )
							if( bbp <= -0.062203 )
								ret := -0.294118
							if( bbp > -0.062203 )
								if( tema <= 0.359504 )
									ret := 0.806452 // buy
								if( tema > 0.359504 )
									ret := 0.085106
						if( ema1 > 0.585502 )
							if( tema <= 0.649005 )
								if( bbp <= -0.053106 )
									ret := 0.882353 // buy
								if( bbp > -0.053106 )
									ret := 1.000000 // buy
							if( tema > 0.649005 )
								ret := -0.444444
				if( bearPower > -0.033338 )
					if( bullPower <= 0.011575 )
						if( ema13 <= -0.020709 )
							if( bearPower <= -0.022601 )
								if( ema13 <= -0.023091 )
									ret := 0.247788
								if( ema13 > -0.023091 )
									ret := -0.458333
							if( bearPower > -0.022601 )
								if( ema2 <= 0.337877 )
									ret := 0.363636
								if( ema2 > 0.337877 )
									ret := -0.657143
						if( ema13 > -0.020709 )
							if( ema1 <= 0.104281 )
								if( ema2 <= 0.094693 )
									ret := -0.023256
								if( ema2 > 0.094693 )
									ret := 0.753247 // buy
							if( ema1 > 0.104281 )
								if( ema3 <= 0.670611 )
									ret := 0.038655
								if( ema3 > 0.670611 )
									ret := 0.684211
					if( bullPower > 0.011575 )
						if( bbm <= 0.006824 )
							if( ema3 <= 0.401237 )
								if( bullPower <= 0.016317 )
									ret := -0.703947 // sell
								if( bullPower > 0.016317 )
									ret := 0.272727
							if( ema3 > 0.401237 )
								if( bbm <= 0.005601 )
									ret := 0.500000
								if( bbm > 0.005601 )
									ret := -0.577778
						if( bbm > 0.006824 )
							if( tema <= 0.303539 )
								if( tema <= 0.226818 )
									ret := -0.161017
								if( tema > 0.226818 )
									ret := 0.588571
							if( tema > 0.303539 )
								if( ema2 <= 0.447203 )
									ret := -0.293991
								if( ema2 > 0.447203 )
									ret := -0.004916
	if( tema > 0.671185 )
		if( ema13 <= 0.017184 )
			if( bullPower <= 0.02126 )
				if( bbm <= 0.036178 )
					if( bullPower <= -0.001568 )
						if( ema12 <= -0.008032 )
							ret := -1.000000 // sell
						if( ema12 > -0.008032 )
							if( bearPower <= -0.019528 )
								ret := 0.894737 // buy
							if( bearPower > -0.019528 )
								ret := -0.666667
					if( bullPower > -0.001568 )
						if( ema1 <= 0.668206 )
							ret := -0.285714
						if( ema1 > 0.668206 )
							if( bbm <= 0.016881 )
								if( ema1 <= 0.690762 )
									ret := -1.000000 // sell
								if( ema1 > 0.690762 )
									ret := -0.851351 // sell
							if( bbm > 0.016881 )
								if( ema1 <= 0.687489 )
									ret := -0.931034 // sell
								if( ema1 > 0.687489 )
									ret := -0.521739
				if( bbm > 0.036178 )
					ret := 1.000000 // buy
			if( bullPower > 0.02126 )
				if( bbm <= 0.019444 )
					if( tema <= 0.685227 )
						ret := 0.636364
					if( tema > 0.685227 )
						ret := 1.000000 // buy
				if( bbm > 0.019444 )
					ret := -0.666667
		if( ema13 > 0.017184 )
			if( tema <= 0.721559 )
				if( tema <= 0.701844 )
					if( ema2 <= 0.64861 )
						ret := -1.000000 // sell
					if( ema2 > 0.64861 )
						if( bearPower <= 0.009081 )
							ret := 0.772727 // buy
						if( bearPower > 0.009081 )
							ret := -0.750000 // sell
				if( tema > 0.701844 )
					if( ema2 <= 0.674274 )
						ret := 0.928571 // buy
					if( ema2 > 0.674274 )
						ret := 1.000000 // buy
			if( tema > 0.721559 )
				if( bearPower <= 0.012401 )
					if( ema1 <= 0.748166 )
						ret := -1.000000 // sell
					if( ema1 > 0.748166 )
						ret := -0.750000 // sell
				if( bearPower > 0.012401 )
					if( ema2 <= 0.698193 )
						ret := -0.882353 // sell
					if( ema2 > 0.698193 )
						if( ema13 <= 0.030569 )
							ret := 0.928571 // buy
						if( ema13 > 0.030569 )
							ret := 0.642857
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XLMUSDT_30Min_3b7ffeee(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


