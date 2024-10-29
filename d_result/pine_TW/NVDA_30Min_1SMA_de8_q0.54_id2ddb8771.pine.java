//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: NVDA_30Min_1SMA_2ddb8771 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1SMA_2ddb8771", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_2ddb8771(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( atr <= 1.45277 )
		if( Discount_Zone <= 35.2875 )
			if( atr <= 0.675 )
				if( Swing_Low <= 31.0635 )
					if( Internal_Swing_High <= 30.395 )
						if( Swing_Low <= 13.92 )
							if( Internal_Swing_Low <= 30.027 )
								if( Internal_Swing_High <= 29.1172 )
									ret := -0.564103
								if( Internal_Swing_High > 29.1172 )
									ret := 0.818182 // buy
							if( Internal_Swing_Low > 30.027 )
								if( Internal_Swing_Low <= 32.0594 )
									ret := 0.956522 // buy
								if( Internal_Swing_Low > 32.0594 )
									ret := 0.714286 // buy
						if( Swing_Low > 13.92 )
							ret := 0.275000
					if( Internal_Swing_High > 30.395 )
						if( Internal_Swing_High <= 31.7888 )
							if( Internal_Swing_High <= 30.9306 )
								ret := -1.000000 // sell
							if( Internal_Swing_High > 30.9306 )
								ret := -0.875000 // sell
						if( Internal_Swing_High > 31.7888 )
							ret := -0.437500
				if( Swing_Low > 31.0635 )
					ret := -1.000000 // sell
			if( atr > 0.675 )
				ret := 0.352941
		if( Discount_Zone > 35.2875 )
			if( Internal_Swing_Low <= 18.075 )
				ret := -0.950000 // sell
			if( Internal_Swing_Low > 18.075 )
				ret := -0.846154 // sell
	if( atr > 1.45277 )
		if( Equilibrium_Zone <= 99.8693 )
			if( Discount_Zone <= 80.2481 )
				if( Order_Block_High <= 69.0754 )
					if( Swing_Low <= 27.7659 )
						if( Premium_Zone <= 60.3992 )
							if( Discount_Zone <= 45.0959 )
								if( Internal_Swing_High <= 29.0942 )
									ret := 0.148086
								if( Internal_Swing_High > 29.0942 )
									ret := 0.007463
							if( Discount_Zone > 45.0959 )
								if( atr <= 1.89486 )
									ret := 0.844444 // buy
								if( atr > 1.89486 )
									ret := 0.313783
						if( Premium_Zone > 60.3992 )
							if( atr <= 2.08922 )
								if( Discount_Zone <= 60.069 )
									ret := 0.656250
								if( Discount_Zone > 60.069 )
									ret := 0.000000
							if( atr > 2.08922 )
								if( Internal_Swing_Low <= 85.5766 )
									ret := -0.036931
								if( Internal_Swing_Low > 85.5766 )
									ret := 0.514286
					if( Swing_Low > 27.7659 )
						if( Discount_Zone <= 57.237 )
							if( Swing_Low <= 54.8718 )
								if( Internal_Swing_Low <= 35.8474 )
									ret := 0.688889
								if( Internal_Swing_Low > 35.8474 )
									ret := 0.310345
							if( Swing_Low > 54.8718 )
								ret := 0.916667 // buy
						if( Discount_Zone > 57.237 )
							if( Equilibrium_Zone <= 64.5394 )
								if( Discount_Zone <= 59.4082 )
									ret := -0.800000 // sell
								if( Discount_Zone > 59.4082 )
									ret := -0.250000
							if( Equilibrium_Zone > 64.5394 )
								ret := 0.644444
				if( Order_Block_High > 69.0754 )
					if( Order_Block_Low <= 87.77 )
						if( Discount_Zone <= 62.7657 )
							if( Internal_Swing_High <= 70.4635 )
								if( Equilibrium_Zone <= 66.9513 )
									ret := 0.750000 // buy
								if( Equilibrium_Zone > 66.9513 )
									ret := 1.000000 // buy
							if( Internal_Swing_High > 70.4635 )
								ret := 0.500000
						if( Discount_Zone > 62.7657 )
							ret := 0.363636
					if( Order_Block_Low > 87.77 )
						ret := -0.454545
			if( Discount_Zone > 80.2481 )
				if( Equilibrium_Zone <= 90.125 )
					ret := 0.648148
				if( Equilibrium_Zone > 90.125 )
					if( Swing_Low <= 88.5814 )
						if( Internal_Swing_High <= 107.311 )
							if( atr <= 11.9441 )
								if( Equilibrium_Zone <= 97.3022 )
									ret := -0.068852
								if( Equilibrium_Zone > 97.3022 )
									ret := 0.263666
							if( atr > 11.9441 )
								if( atr <= 16.6484 )
									ret := 0.728814 // buy
								if( atr > 16.6484 )
									ret := -0.217391
						if( Internal_Swing_High > 107.311 )
							if( Equilibrium_Zone <= 98.6456 )
								ret := 0.904762 // buy
							if( Equilibrium_Zone > 98.6456 )
								ret := 0.642857
					if( Swing_Low > 88.5814 )
						ret := -0.476190
		if( Equilibrium_Zone > 99.8693 )
			if( Order_Block_Low <= 299.424 )
				if( Equilibrium_Zone <= 374.31 )
					if( Equilibrium_Zone <= 161.081 )
						if( Discount_Zone <= 134.435 )
							if( Premium_Zone <= 110.459 )
								if( Internal_Swing_Low <= 102.325 )
									ret := 0.185273
								if( Internal_Swing_Low > 102.325 )
									ret := 0.403509
							if( Premium_Zone > 110.459 )
								if( Discount_Zone <= 90.3523 )
									ret := 0.123225
								if( Discount_Zone > 90.3523 )
									ret := -0.037092
						if( Discount_Zone > 134.435 )
							if( Bearish_BOSInt <= 0.5 )
								if( Discount_Zone <= 140.638 )
									ret := 0.196886
								if( Discount_Zone > 140.638 )
									ret := -0.040516
							if( Bearish_BOSInt > 0.5 )
								if( Order_Block_Low <= 150.609 )
									ret := 0.878788 // buy
								if( Order_Block_Low > 150.609 )
									ret := 0.533333
					if( Equilibrium_Zone > 161.081 )
						if( Discount_Zone <= 151.359 )
							if( Order_Block_High <= 173.955 )
								if( Premium_Zone <= 182.06 )
									ret := -0.029444
								if( Premium_Zone > 182.06 )
									ret := -0.229248
							if( Order_Block_High > 173.955 )
								if( Equilibrium_Zone <= 162.569 )
									ret := -0.142857
								if( Equilibrium_Zone > 162.569 )
									ret := 0.680556
						if( Discount_Zone > 151.359 )
							if( Discount_Zone <= 196.787 )
								if( Equilibrium_Zone <= 193.33 )
									ret := -0.046818
								if( Equilibrium_Zone > 193.33 )
									ret := 0.057423
							if( Discount_Zone > 196.787 )
								if( Equilibrium_Zone <= 219.302 )
									ret := -0.306467
								if( Equilibrium_Zone > 219.302 )
									ret := -0.030489
				if( Equilibrium_Zone > 374.31 )
					if( Equilibrium_Zone <= 950.671 )
						if( atr <= 32.5914 )
							if( Internal_Swing_Low <= 440.623 )
								if( Internal_Swing_Low <= 435.336 )
									ret := -0.033436
								if( Internal_Swing_Low > 435.336 )
									ret := 0.935484 // buy
							if( Internal_Swing_Low > 440.623 )
								if( Premium_Zone <= 558.225 )
									ret := -0.185759
								if( Premium_Zone > 558.225 )
									ret := -0.517241
						if( atr > 32.5914 )
							if( atr <= 78.8264 )
								if( Internal_Swing_High <= 885.474 )
									ret := 0.078010
								if( Internal_Swing_High > 885.474 )
									ret := -0.204651
							if( atr > 78.8264 )
								if( atr <= 85.8159 )
									ret := -0.279555
								if( atr > 85.8159 )
									ret := 0.023658
					if( Equilibrium_Zone > 950.671 )
						if( atr <= 153.822 )
							if( Internal_Swing_Low <= 1120.28 )
								if( atr <= 118.327 )
									ret := 0.781250 // buy
								if( atr > 118.327 )
									ret := 0.383333
							if( Internal_Swing_Low > 1120.28 )
								ret := 1.000000 // buy
						if( atr > 153.822 )
							if( Internal_Swing_High <= 1135 )
								if( Equilibrium_Zone <= 1124.46 )
									ret := 0.469072
								if( Equilibrium_Zone > 1124.46 )
									ret := -0.170455
							if( Internal_Swing_High > 1135 )
								if( Swing_High <= 572.018 )
									ret := -0.604651
								if( Swing_High > 572.018 )
									ret := -0.882353 // sell
			if( Order_Block_Low > 299.424 )
				if( atr <= 69.1032 )
					if( Premium_Zone <= 588.215 )
						if( Premium_Zone <= 561.164 )
							if( atr <= 31.937 )
								if( Equilibrium_Zone <= 477.49 )
									ret := -0.181818
								if( Equilibrium_Zone > 477.49 )
									ret := 0.750000 // buy
							if( atr > 31.937 )
								if( atr <= 41.5093 )
									ret := 0.559322
								if( atr > 41.5093 )
									ret := 0.305699
						if( Premium_Zone > 561.164 )
							if( Order_Block_High <= 516.45 )
								ret := 0.700000 // buy
							if( Order_Block_High > 516.45 )
								if( Equilibrium_Zone <= 530.518 )
									ret := -0.562500
								if( Equilibrium_Zone > 530.518 )
									ret := 0.214286
					if( Premium_Zone > 588.215 )
						if( Bullish_BOSInt <= 0.5 )
							if( Premium_Zone <= 635.205 )
								if( Swing_Low <= 548.225 )
									ret := 0.941176 // buy
								if( Swing_Low > 548.225 )
									ret := 0.375000
							if( Premium_Zone > 635.205 )
								if( Order_Block_Low <= 780.542 )
									ret := -0.571429
								if( Order_Block_Low > 780.542 )
									ret := 0.727273 // buy
						if( Bullish_BOSInt > 0.5 )
							if( atr <= 61.0068 )
								if( Equilibrium_Zone <= 559.815 )
									ret := 0.903226 // buy
								if( Equilibrium_Zone > 559.815 )
									ret := 0.298246
							if( atr > 61.0068 )
								if( Equilibrium_Zone <= 576.119 )
									ret := 0.615385
								if( Equilibrium_Zone > 576.119 )
									ret := 0.897959 // buy
				if( atr > 69.1032 )
					if( Order_Block_High <= 934.45 )
						if( Internal_Swing_Low <= 804.761 )
							if( atr <= 115.011 )
								if( Order_Block_Low <= 833.306 )
									ret := -0.318919
								if( Order_Block_Low > 833.306 )
									ret := 0.380952
							if( atr > 115.011 )
								if( Equilibrium_Zone <= 496.41 )
									ret := -0.904762 // sell
								if( Equilibrium_Zone > 496.41 )
									ret := -0.567568
						if( Internal_Swing_Low > 804.761 )
							if( Premium_Zone <= 965.044 )
								ret := 0.000000
							if( Premium_Zone > 965.044 )
								ret := 0.764706 // buy
					if( Order_Block_High > 934.45 )
						if( Equilibrium_Zone <= 888.834 )
							ret := 0.962963 // buy
						if( Equilibrium_Zone > 888.834 )
							if( Equilibrium_Zone <= 1115.67 )
								if( Internal_Swing_High <= 997.67 )
									ret := -0.600000
								if( Internal_Swing_High > 997.67 )
									ret := -0.100000
							if( Equilibrium_Zone > 1115.67 )
								if( Swing_High <= 1211.57 )
									ret := 0.750000 // buy
								if( Swing_High > 1211.57 )
									ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_NVDA_30Min_2ddb8771(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


