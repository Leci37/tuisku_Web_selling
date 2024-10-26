//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: LTCUSDT_30Min_2BT0_be203519 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_2BT0_be203519", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_be203519(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -1.63528 )
		if( tema <= 359.566 )
			if( ema13 <= -1.7048 )
				if( bbp <= -15.1104 )
					if( ema12 <= -11.7518 )
						if( ema1 <= 220.518 )
							ret := 1.000000 // buy
						if( ema1 > 220.518 )
							ret := 0.909091 // buy
					if( ema12 > -11.7518 )
						if( ema2 <= 318.156 )
							if( tema <= 139.067 )
								if( ema12 <= -6.0675 )
									ret := 1.000000 // buy
								if( ema12 > -6.0675 )
									ret := 0.523810
							if( tema > 139.067 )
								if( ema1 <= 154.581 )
									ret := -0.894737 // sell
								if( ema1 > 154.581 )
									ret := 0.167064
						if( ema2 > 318.156 )
							if( ema2 <= 353.634 )
								if( ema12 <= -7.86833 )
									ret := 0.727273 // buy
								if( ema12 > -7.86833 )
									ret := 1.000000 // buy
							if( ema2 > 353.634 )
								if( tema <= 350.202 )
									ret := 1.000000 // buy
								if( tema > 350.202 )
									ret := -0.600000
				if( bbp > -15.1104 )
					if( ema13 <= -11.1344 )
						if( bullPower <= -3.21502 )
							if( ema13 <= -12.1318 )
								if( ema13 <= -12.7306 )
									ret := -0.928571 // sell
								if( ema13 > -12.7306 )
									ret := -0.461538
							if( ema13 > -12.1318 )
								if( tema <= 173.817 )
									ret := -0.916667 // sell
								if( tema > 173.817 )
									ret := -1.000000 // sell
						if( bullPower > -3.21502 )
							if( tema <= 176.59 )
								ret := 0.111111
							if( tema > 176.59 )
								if( ema13 <= -12.2919 )
									ret := -0.736842 // sell
								if( ema13 > -12.2919 )
									ret := -0.307692
					if( ema13 > -11.1344 )
						if( ema3 <= 186.352 )
							if( bbm <= 4.30892 )
								if( ema2 <= 183.156 )
									ret := 0.035957
								if( ema2 > 183.156 )
									ret := 0.649351
							if( bbm > 4.30892 )
								if( ema1 <= 136.226 )
									ret := 0.701571 // buy
								if( ema1 > 136.226 )
									ret := 0.277045
						if( ema3 > 186.352 )
							if( ema1 <= 193.69 )
								if( ema2 <= 193.912 )
									ret := -0.336815
								if( ema2 > 193.912 )
									ret := -0.915493 // sell
							if( ema1 > 193.69 )
								if( ema2 <= 262.822 )
									ret := 0.099662
								if( ema2 > 262.822 )
									ret := -0.290123
			if( ema13 > -1.7048 )
				if( ema3 <= 102.531 )
					if( ema3 <= 48.7987 )
						if( bbm <= 0.522947 )
							if( tema <= 44.811 )
								ret := -0.733333 // sell
							if( tema > 44.811 )
								ret := 0.363636
						if( bbm > 0.522947 )
							if( ema13 <= -0.578631 )
								if( bbp <= -2.79387 )
									ret := 0.652174
								if( bbp > -2.79387 )
									ret := 0.966667 // buy
							if( ema13 > -0.578631 )
								if( ema1 <= 45.9454 )
									ret := 0.090909
								if( ema1 > 45.9454 )
									ret := 0.782609 // buy
					if( ema3 > 48.7987 )
						if( tema <= 50.1372 )
							if( ema12 <= -0.556324 )
								if( ema12 <= -0.642543 )
									ret := -0.275862
								if( ema12 > -0.642543 )
									ret := 0.517241
							if( ema12 > -0.556324 )
								if( bbp <= -1.69868 )
									ret := -0.650794
								if( bbp > -1.69868 )
									ret := 0.166667
						if( tema > 50.1372 )
							if( bbp <= -4.78282 )
								if( tema <= 84.4579 )
									ret := 0.500000
								if( tema > 84.4579 )
									ret := 0.941176 // buy
							if( bbp > -4.78282 )
								if( ema13 <= 0.00989 )
									ret := 0.207699
								if( ema13 > 0.00989 )
									ret := 0.718447 // buy
				if( ema3 > 102.531 )
					if( tema <= 120.412 )
						if( ema13 <= -1.18949 )
							if( ema3 <= 106.021 )
								if( bearPower <= -1.39643 )
									ret := -0.378378
								if( bearPower > -1.39643 )
									ret := 0.636364
							if( ema3 > 106.021 )
								if( ema2 <= 114.421 )
									ret := -0.576923
								if( ema2 > 114.421 )
									ret := -0.076923
						if( ema13 > -1.18949 )
							if( bbm <= 0.688234 )
								if( bbp <= -2.01936 )
									ret := 0.593750
								if( bbp > -2.01936 )
									ret := -0.090909
							if( bbm > 0.688234 )
								if( ema3 <= 104.405 )
									ret := -0.717949 // sell
								if( ema3 > 104.405 )
									ret := -0.120267
					if( tema > 120.412 )
						if( tema <= 123.635 )
							if( bullPower <= -0.151627 )
								if( bbm <= 1.10567 )
									ret := 0.438596
								if( bbm > 1.10567 )
									ret := 0.790698 // buy
							if( bullPower > -0.151627 )
								if( bearPower <= -2.60026 )
									ret := 0.923077 // buy
								if( bearPower > -2.60026 )
									ret := -0.785714 // sell
						if( tema > 123.635 )
							if( bearPower <= -6.18837 )
								if( ema3 <= 237.955 )
									ret := 0.829268 // buy
								if( ema3 > 237.955 )
									ret := 0.183673
							if( bearPower > -6.18837 )
								if( ema3 <= 273.821 )
									ret := 0.109531
								if( ema3 > 273.821 )
									ret := -0.343750
		if( tema > 359.566 )
			if( bbp <= -21.8152 )
				ret := 0.800000 // buy
			if( bbp > -21.8152 )
				if( bbm <= 13.1577 )
					if( bbp <= -8.97552 )
						if( bearPower <= -11.2469 )
							ret := -1.000000 // sell
						if( bearPower > -11.2469 )
							ret := 0.277778
					if( bbp > -8.97552 )
						if( ema3 <= 382.509 )
							if( ema2 <= 379.69 )
								ret := -1.000000 // sell
							if( ema2 > 379.69 )
								ret := -0.800000 // sell
						if( ema3 > 382.509 )
							ret := -1.000000 // sell
				if( bbm > 13.1577 )
					ret := 0.000000
	if( bbp > -1.63528 )
		if( ema2 <= 62.8693 )
			if( bullPower <= 0.90074 )
				if( ema1 <= 61.9979 )
					if( ema13 <= 0.838439 )
						if( bbm <= 0.710396 )
							if( ema13 <= 0.358673 )
								if( ema2 <= 44.4984 )
									ret := 0.496933
								if( ema2 > 44.4984 )
									ret := 0.017859
							if( ema13 > 0.358673 )
								if( ema1 <= 58.7681 )
									ret := -0.068221
								if( ema1 > 58.7681 )
									ret := -0.438438
						if( bbm > 0.710396 )
							if( ema3 <= 59.4579 )
								if( ema13 <= -0.545885 )
									ret := -0.290598
								if( ema13 > -0.545885 )
									ret := 0.272989
							if( ema3 > 59.4579 )
								if( ema3 <= 62.4557 )
									ret := 0.490385
								if( ema3 > 62.4557 )
									ret := -0.750000 // sell
					if( ema13 > 0.838439 )
						if( tema <= 54.4655 )
							if( tema <= 53.5407 )
								if( ema3 <= 50.6844 )
									ret := -0.416667
								if( ema3 > 50.6844 )
									ret := 1.000000 // buy
							if( tema > 53.5407 )
								ret := -1.000000 // sell
						if( tema > 54.4655 )
							if( bearPower <= -0.126485 )
								if( ema1 <= 58.5441 )
									ret := 1.000000 // buy
								if( ema1 > 58.5441 )
									ret := 0.727273 // buy
							if( bearPower > -0.126485 )
								if( tema <= 61.1378 )
									ret := 0.650794
								if( tema > 61.1378 )
									ret := 0.080000
				if( ema1 > 61.9979 )
					if( tema <= 61.5628 )
						ret := -0.642857
					if( tema > 61.5628 )
						if( ema2 <= 62.582 )
							if( ema3 <= 62.4746 )
								if( ema1 <= 62.499 )
									ret := 0.450135
								if( ema1 > 62.499 )
									ret := 0.039474
							if( ema3 > 62.4746 )
								if( bearPower <= -0.743816 )
									ret := 0.863636 // buy
								if( bearPower > -0.743816 )
									ret := -0.424779
						if( ema2 > 62.582 )
							if( ema12 <= -0.214404 )
								if( bullPower <= -0.069972 )
									ret := 0.538462
								if( bullPower > -0.069972 )
									ret := 0.970588 // buy
							if( ema12 > -0.214404 )
								if( bbm <= 0.341656 )
									ret := 0.260000
								if( bbm > 0.341656 )
									ret := 0.626016
			if( bullPower > 0.90074 )
				if( bbp <= 1.61605 )
					if( bbm <= 0.722929 )
						if( bearPower <= 0.544323 )
							if( ema2 <= 57.5417 )
								if( bbm <= 0.555182 )
									ret := 0.244898
								if( bbm > 0.555182 )
									ret := -0.285714
							if( ema2 > 57.5417 )
								if( ema3 <= 58.1024 )
									ret := 0.724138 // buy
								if( ema3 > 58.1024 )
									ret := 0.073171
						if( bearPower > 0.544323 )
							if( ema13 <= 0.696277 )
								ret := -0.809524 // sell
							if( ema13 > 0.696277 )
								ret := 0.090909
					if( bbm > 0.722929 )
						if( ema13 <= 0.474657 )
							if( BBPower_Color <= 0.5 )
								ret := 0.650000
							if( BBPower_Color > 0.5 )
								if( bullPower <= 1.01582 )
									ret := -0.504854
								if( bullPower > 1.01582 )
									ret := -0.142105
						if( ema13 > 0.474657 )
							if( tema <= 62.9775 )
								if( ema2 <= 60.2766 )
									ret := -0.444444
								if( ema2 > 60.2766 )
									ret := -1.000000 // sell
							if( tema > 62.9775 )
								if( ema2 <= 62.2091 )
									ret := 0.750000 // buy
								if( ema2 > 62.2091 )
									ret := -0.333333
				if( bbp > 1.61605 )
					if( ema12 <= 1.50269 )
						if( ema1 <= 46.709 )
							if( ema1 <= 44.8734 )
								if( ema3 <= 43.4957 )
									ret := -0.875000 // sell
								if( ema3 > 43.4957 )
									ret := 0.454545
							if( ema1 > 44.8734 )
								if( ema2 <= 45.0667 )
									ret := -1.000000 // sell
								if( ema2 > 45.0667 )
									ret := -0.533333
						if( ema1 > 46.709 )
							if( ema3 <= 58.0615 )
								if( ema1 <= 57.9281 )
									ret := 0.080435
								if( ema1 > 57.9281 )
									ret := 0.521368
							if( ema3 > 58.0615 )
								if( bearPower <= 0.670338 )
									ret := 0.247423
								if( bearPower > 0.670338 )
									ret := -0.424084
					if( ema12 > 1.50269 )
						ret := -0.826087 // sell
		if( ema2 > 62.8693 )
			if( ema2 <= 379.617 )
				if( ema2 <= 358.307 )
					if( bullPower <= 8.33234 )
						if( ema12 <= 3.29043 )
							if( ema3 <= 62.8978 )
								if( tema <= 66.1784 )
									ret := -0.314286
								if( tema > 66.1784 )
									ret := -0.875000 // sell
							if( ema3 > 62.8978 )
								if( ema1 <= 62.9011 )
									ret := -0.416185
								if( ema1 > 62.9011 )
									ret := -0.026001
						if( ema12 > 3.29043 )
							if( ema13 <= 8.90886 )
								if( ema1 <= 112.597 )
									ret := -1.000000 // sell
								if( ema1 > 112.597 )
									ret := 0.336585
							if( ema13 > 8.90886 )
								if( ema2 <= 195.181 )
									ret := -1.000000 // sell
								if( ema2 > 195.181 )
									ret := -0.357143
					if( bullPower > 8.33234 )
						if( ema2 <= 343.683 )
							if( ema3 <= 189.429 )
								if( bearPower <= 4.31515 )
									ret := -0.858974 // sell
								if( bearPower > 4.31515 )
									ret := -0.420000
							if( ema3 > 189.429 )
								if( tema <= 209.537 )
									ret := 0.787234 // buy
								if( tema > 209.537 )
									ret := -0.277445
						if( ema2 > 343.683 )
							if( tema <= 358.788 )
								if( ema3 <= 345.167 )
									ret := -0.800000 // sell
								if( ema3 > 345.167 )
									ret := -0.100000
							if( tema > 358.788 )
								ret := -1.000000 // sell
				if( ema2 > 358.307 )
					if( ema12 <= 0.830158 )
						ret := -0.166667
					if( ema12 > 0.830158 )
						if( bbp <= 5.59611 )
							if( ema2 <= 359.131 )
								ret := 0.700000 // buy
							if( ema2 > 359.131 )
								ret := 1.000000 // buy
						if( bbp > 5.59611 )
							if( bearPower <= 7.34762 )
								ret := 0.333333
							if( bearPower > 7.34762 )
								ret := 1.000000 // buy
			if( ema2 > 379.617 )
				if( ema13 <= 9.46692 )
					if( BBPower_Color <= 0.5 )
						ret := -0.692308
					if( BBPower_Color > 0.5 )
						ret := -1.000000 // sell
				if( ema13 > 9.46692 )
					ret := -0.357143
	
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
float op_operation = decision_tree_0_LTCUSDT_30Min_be203519(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


