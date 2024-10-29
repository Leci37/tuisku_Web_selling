//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: CRWD_1Min_2BT0_b15a49af Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2BT0_b15a49af", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_b15a49af(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= 0.437079 )
		if( tema <= 229.699 )
			if( ema2 <= 219.021 )
				if( ema12 <= -0.191152 )
					if( BBPower_Color <= 0.5 )
						if( ema2 <= 202.483 )
							if( ema3 <= 198.709 )
								ret := 1.000000 // buy
							if( ema3 > 198.709 )
								if( bbp <= -2.07844 )
									ret := 0.300000
								if( bbp > -2.07844 )
									ret := -0.761905 // sell
						if( ema2 > 202.483 )
							if( bbm <= 1.0501 )
								if( ema1 <= 204.744 )
									ret := 0.868852 // buy
								if( ema1 > 204.744 )
									ret := 0.209040
							if( bbm > 1.0501 )
								if( bearPower <= -2.09672 )
									ret := 0.440000
								if( bearPower > -2.09672 )
									ret := 0.955882 // buy
					if( BBPower_Color > 0.5 )
						if( bbm <= 0.430146 )
							ret := -1.000000 // sell
						if( bbm > 0.430146 )
							ret := -0.777778 // sell
				if( ema12 > -0.191152 )
					if( tema <= 202.825 )
						if( ema3 <= 201.927 )
							if( bullPower <= 0.654634 )
								ret := 1.000000 // buy
							if( bullPower > 0.654634 )
								ret := 0.857143 // buy
						if( ema3 > 201.927 )
							ret := 0.111111
					if( tema > 202.825 )
						if( ema1 <= 217.283 )
							if( bullPower <= 1.18064 )
								if( ema3 <= 204.85 )
									ret := -0.813559 // sell
								if( ema3 > 204.85 )
									ret := -0.112871
							if( bullPower > 1.18064 )
								ret := 0.823529 // buy
						if( ema1 > 217.283 )
							if( ema3 <= 218.495 )
								if( bearPower <= 0.378528 )
									ret := -0.675214
								if( bearPower > 0.378528 )
									ret := 0.071429
							if( ema3 > 218.495 )
								if( ema13 <= -0.035816 )
									ret := 1.000000 // buy
								if( ema13 > -0.035816 )
									ret := 0.100000
			if( ema2 > 219.021 )
				if( bullPower <= 0.708778 )
					if( ema3 <= 229.617 )
						if( bearPower <= -0.706438 )
							if( bbp <= -1.22358 )
								if( ema3 <= 227.753 )
									ret := 0.714286 // buy
								if( ema3 > 227.753 )
									ret := 0.160000
							if( bbp > -1.22358 )
								if( ema3 <= 221.282 )
									ret := 0.821429 // buy
								if( ema3 > 221.282 )
									ret := -0.061069
						if( bearPower > -0.706438 )
							if( bbp <= 0.102046 )
								if( ema12 <= -0.290325 )
									ret := 0.555556
								if( ema12 > -0.290325 )
									ret := -0.122807
							if( bbp > 0.102046 )
								if( ema13 <= 0.745007 )
									ret := 0.301449
								if( ema13 > 0.745007 )
									ret := -0.736842 // sell
					if( ema3 > 229.617 )
						if( ema2 <= 230.171 )
							if( ema3 <= 229.799 )
								if( BBPower_Color <= 0.5 )
									ret := 0.742857 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.222222
							if( ema3 > 229.799 )
								if( bearPower <= -0.268892 )
									ret := 0.957447 // buy
								if( bearPower > -0.268892 )
									ret := 0.300000
						if( ema2 > 230.171 )
							if( ema1 <= 229.698 )
								ret := 0.619048
							if( ema1 > 229.698 )
								if( bullPower <= -0.910118 )
									ret := 0.727273 // buy
								if( bullPower > -0.910118 )
									ret := -0.720000 // sell
				if( bullPower > 0.708778 )
					if( bullPower <= 1.50832 )
						if( ema1 <= 229.106 )
							if( ema1 <= 227.919 )
								if( ema3 <= 223.453 )
									ret := 0.604167
								if( ema3 > 223.453 )
									ret := 0.841463 // buy
							if( ema1 > 227.919 )
								if( ema13 <= 0.343568 )
									ret := 0.875000 // buy
								if( ema13 > 0.343568 )
									ret := -0.200000
						if( ema1 > 229.106 )
							ret := 1.000000 // buy
					if( bullPower > 1.50832 )
						ret := -0.230769
		if( tema > 229.699 )
			if( bbm <= 0.058326 )
				if( tema <= 391.774 )
					if( bbp <= 0.623075 )
						if( bbp <= -0.759662 )
							if( ema12 <= -0.206861 )
								if( tema <= 268.535 )
									ret := -0.075949
								if( tema > 268.535 )
									ret := 0.178910
							if( ema12 > -0.206861 )
								if( ema13 <= -0.057818 )
									ret := 0.558065
								if( ema13 > -0.057818 )
									ret := 0.348416
						if( bbp > -0.759662 )
							if( ema2 <= 258.767 )
								if( tema <= 257.584 )
									ret := 0.148180
								if( tema > 257.584 )
									ret := 0.485380
							if( ema2 > 258.767 )
								if( ema3 <= 266.493 )
									ret := -0.138504
								if( ema3 > 266.493 )
									ret := 0.075234
					if( bbp > 0.623075 )
						if( bullPower <= 0.434518 )
							if( tema <= 305.286 )
								if( ema3 <= 304.152 )
									ret := -0.279612
								if( ema3 > 304.152 )
									ret := -1.000000 // sell
							if( tema > 305.286 )
								if( ema2 <= 316.06 )
									ret := 0.648649
								if( ema2 > 316.06 )
									ret := -0.250000
						if( bullPower > 0.434518 )
							if( tema <= 295.593 )
								if( bearPower <= 0.425572 )
									ret := -0.277778
								if( bearPower > 0.425572 )
									ret := 0.642857
							if( tema > 295.593 )
								if( ema12 <= 0.272168 )
									ret := 0.928571 // buy
								if( ema12 > 0.272168 )
									ret := 0.500000
				if( tema > 391.774 )
					if( ema2 <= 392.089 )
						ret := -0.625000
					if( ema2 > 392.089 )
						ret := -0.928571 // sell
			if( bbm > 0.058326 )
				if( ema1 <= 230.618 )
					if( bearPower <= 0.32416 )
						if( bearPower <= -0.58915 )
							if( ema2 <= 230.835 )
								ret := -1.000000 // sell
							if( ema2 > 230.835 )
								ret := -0.769231 // sell
						if( bearPower > -0.58915 )
							if( bullPower <= 0.728222 )
								if( bbm <= 0.604657 )
									ret := -0.578231
								if( bbm > 0.604657 )
									ret := 0.296296
							if( bullPower > 0.728222 )
								if( bullPower <= 0.869047 )
									ret := 0.791667 // buy
								if( bullPower > 0.869047 )
									ret := -0.750000 // sell
					if( bearPower > 0.32416 )
						if( bbm <= 0.425911 )
							ret := 0.454545
						if( bbm > 0.425911 )
							ret := 0.842105 // buy
				if( ema1 > 230.618 )
					if( ema12 <= 1.26108 )
						if( bullPower <= -0.48183 )
							if( ema12 <= -10.4195 )
								ret := -1.000000 // sell
							if( ema12 > -10.4195 )
								if( bearPower <= -5.96547 )
									ret := 0.822785 // buy
								if( bearPower > -5.96547 )
									ret := 0.051441
						if( bullPower > -0.48183 )
							if( tema <= 231.026 )
								if( tema <= 230.667 )
									ret := -0.212766
								if( tema > 230.667 )
									ret := 0.737705 // buy
							if( tema > 231.026 )
								if( ema13 <= -0.885459 )
									ret := -0.119295
								if( ema13 > -0.885459 )
									ret := -0.007694
					if( ema12 > 1.26108 )
						if( bearPower <= 0.227794 )
							if( ema13 <= 3.55813 )
								if( bullPower <= 4.39262 )
									ret := 0.967742 // buy
								if( bullPower > 4.39262 )
									ret := 0.600000
							if( ema13 > 3.55813 )
								ret := 1.000000 // buy
						if( bearPower > 0.227794 )
							ret := 0.052632
	if( bearPower > 0.437079 )
		if( ema3 <= 382.692 )
			if( tema <= 268.309 )
				if( ema3 <= 266.34 )
					if( ema3 <= 214.436 )
						if( ema13 <= 0.000461 )
							ret := -1.000000 // sell
						if( ema13 > 0.000461 )
							if( bbm <= 0.756512 )
								if( bearPower <= 0.611608 )
									ret := 0.903226 // buy
								if( bearPower > 0.611608 )
									ret := -0.528302
							if( bbm > 0.756512 )
								if( bearPower <= 3.09399 )
									ret := 0.880597 // buy
								if( bearPower > 3.09399 )
									ret := -0.294118
					if( ema3 > 214.436 )
						if( ema3 <= 228.99 )
							if( ema13 <= 0.605043 )
								if( ema13 <= 0.069308 )
									ret := -0.750000 // sell
								if( ema13 > 0.069308 )
									ret := 0.342105
							if( ema13 > 0.605043 )
								if( tema <= 221.364 )
									ret := -0.054054
								if( tema > 221.364 )
									ret := -0.819209 // sell
						if( ema3 > 228.99 )
							if( ema1 <= 229.774 )
								if( bullPower <= 0.653748 )
									ret := 0.769231 // buy
								if( bullPower > 0.653748 )
									ret := 1.000000 // buy
							if( ema1 > 229.774 )
								if( ema12 <= 0.510514 )
									ret := -0.085415
								if( ema12 > 0.510514 )
									ret := -0.372679
				if( ema3 > 266.34 )
					if( ema12 <= 0.149779 )
						ret := -0.600000
					if( ema12 > 0.149779 )
						if( ema12 <= 0.36365 )
							if( ema2 <= 267.211 )
								ret := -1.000000 // sell
							if( ema2 > 267.211 )
								ret := -0.866667 // sell
						if( ema12 > 0.36365 )
							ret := -1.000000 // sell
			if( tema > 268.309 )
				if( ema3 <= 339.7 )
					if( bearPower <= 1.25782 )
						if( ema13 <= 0.355342 )
							if( bearPower <= 0.463977 )
								if( ema13 <= 0.105167 )
									ret := -0.826087 // sell
								if( ema13 > 0.105167 )
									ret := -0.425000
							if( bearPower > 0.463977 )
								if( ema1 <= 290.942 )
									ret := 0.178082
								if( ema1 > 290.942 )
									ret := -0.261084
						if( ema13 > 0.355342 )
							if( ema2 <= 270.884 )
								if( ema3 <= 266.87 )
									ret := -0.529412
								if( ema3 > 266.87 )
									ret := 0.542289
							if( ema2 > 270.884 )
								if( ema1 <= 317.319 )
									ret := 0.014864
								if( ema1 > 317.319 )
									ret := 0.312500
					if( bearPower > 1.25782 )
						if( bbm <= 3.66334 )
							if( ema2 <= 266.405 )
								ret := 1.000000 // buy
							if( ema2 > 266.405 )
								if( ema13 <= 2.6972 )
									ret := -0.083045
								if( ema13 > 2.6972 )
									ret := -0.386667
						if( bbm > 3.66334 )
							if( ema2 <= 303.441 )
								ret := 1.000000 // buy
							if( ema2 > 303.441 )
								ret := 0.666667
				if( ema3 > 339.7 )
					if( tema <= 365.292 )
						if( bullPower <= 2.35463 )
							if( ema12 <= 0.891507 )
								if( bbm <= 0.128607 )
									ret := -0.461864
								if( bbm > 0.128607 )
									ret := -0.100703
							if( ema12 > 0.891507 )
								if( bearPower <= 1.36717 )
									ret := -0.967742 // sell
								if( bearPower > 1.36717 )
									ret := -0.076923
						if( bullPower > 2.35463 )
							if( ema2 <= 342.99 )
								ret := -0.400000
							if( ema2 > 342.99 )
								if( tema <= 353.029 )
									ret := -0.960784 // sell
								if( tema > 353.029 )
									ret := -0.666667
					if( tema > 365.292 )
						if( ema3 <= 367.669 )
							if( bbp <= 1.98027 )
								ret := 0.000000
							if( bbp > 1.98027 )
								if( bullPower <= 5.53336 )
									ret := 0.895833 // buy
								if( bullPower > 5.53336 )
									ret := 0.583333
						if( ema3 > 367.669 )
							if( bullPower <= 1.31197 )
								if( ema3 <= 372.054 )
									ret := -0.513761
								if( ema3 > 372.054 )
									ret := -0.150000
							if( bullPower > 1.31197 )
								if( bbm <= 1.6175 )
									ret := 0.200803
								if( bbm > 1.6175 )
									ret := -0.705882 // sell
		if( ema3 > 382.692 )
			if( bearPower <= 0.84671 )
				if( ema2 <= 390.026 )
					if( ema12 <= 1.21895 )
						if( ema12 <= 0.088152 )
							ret := 0.176471
						if( ema12 > 0.088152 )
							if( bearPower <= 0.65439 )
								if( bbp <= 1.65063 )
									ret := -0.352201
								if( bbp > 1.65063 )
									ret := 0.285714
							if( bearPower > 0.65439 )
								if( ema12 <= 0.457808 )
									ret := -0.838710 // sell
								if( ema12 > 0.457808 )
									ret := -0.520000
					if( ema12 > 1.21895 )
						ret := 1.000000 // buy
				if( ema2 > 390.026 )
					if( bbm <= 0.51905 )
						if( ema3 <= 391 )
							if( ema3 <= 390.291 )
								if( ema1 <= 390.644 )
									ret := -0.909091 // sell
								if( ema1 > 390.644 )
									ret := -0.777778 // sell
							if( ema3 > 390.291 )
								ret := -1.000000 // sell
						if( ema3 > 391 )
							ret := -0.555556
					if( bbm > 0.51905 )
						ret := -0.416667
			if( bearPower > 0.84671 )
				if( ema13 <= 0.351002 )
					ret := -0.363636
				if( ema13 > 0.351002 )
					if( bullPower <= 1.91811 )
						if( ema3 <= 388.25 )
							if( bbm <= 0.261136 )
								if( tema <= 388.388 )
									ret := -1.000000 // sell
								if( tema > 388.388 )
									ret := -0.583333
							if( bbm > 0.261136 )
								ret := -0.388889
						if( ema3 > 388.25 )
							if( bbm <= 0.30918 )
								ret := -1.000000 // sell
							if( bbm > 0.30918 )
								ret := -0.909091 // sell
					if( bullPower > 1.91811 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_CRWD_1Min_b15a49af(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


