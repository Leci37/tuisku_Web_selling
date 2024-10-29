//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: MDB_5Min_1SMA_a1b1a7d6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_1SMA_a1b1a7d6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_a1b1a7d6(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Swing_High <= 264.971 )
		if( Premium_Zone <= 427.767 )
			if( Discount_Zone <= 373.244 )
				if( Equilibrium_Zone <= 353.221 )
					if( atr <= 37.7167 )
						if( atr <= 19.6568 )
							ret := 0.077107
						if( atr > 19.6568 )
							ret := -0.034518
					if( atr > 37.7167 )
						if( Premium_Zone <= 324.274 )
							ret := 0.677885
						if( Premium_Zone > 324.274 )
							ret := 0.238792
				if( Equilibrium_Zone > 353.221 )
					if( Equilibrium_Zone <= 355.456 )
						if( Equilibrium_Zone <= 354.106 )
							ret := -0.172269
						if( Equilibrium_Zone > 354.106 )
							ret := -0.391781
					if( Equilibrium_Zone > 355.456 )
						if( Premium_Zone <= 369.215 )
							ret := 0.321792
						if( Premium_Zone > 369.215 )
							ret := -0.026327
			if( Discount_Zone > 373.244 )
				if( atr <= 19.8556 )
					if( Premium_Zone <= 405.609 )
						if( Equilibrium_Zone <= 390.024 )
							ret := -0.316667
						if( Equilibrium_Zone > 390.024 )
							ret := 0.707447 // buy
					if( Premium_Zone > 405.609 )
						if( Discount_Zone <= 379.51 )
							ret := -0.189258
						if( Discount_Zone > 379.51 )
							ret := 0.074018
				if( atr > 19.8556 )
					if( Premium_Zone <= 427.09 )
						if( Internal_Swing_Low <= 405.935 )
							ret := 0.246134
						if( Internal_Swing_Low > 405.935 )
							ret := 0.795455 // buy
					if( Premium_Zone > 427.09 )
						if( Discount_Zone <= 381.842 )
							ret := 0.806723 // buy
						if( Discount_Zone > 381.842 )
							ret := 0.086957
		if( Premium_Zone > 427.767 )
			if( atr <= 16.779 )
				if( Discount_Zone <= 401.418 )
					if( Premium_Zone <= 431.903 )
						ret := -1.000000 // sell
					if( Premium_Zone > 431.903 )
						if( Equilibrium_Zone <= 416.795 )
							ret := -0.242424
						if( Equilibrium_Zone > 416.795 )
							ret := -1.000000 // sell
				if( Discount_Zone > 401.418 )
					if( Premium_Zone <= 432.662 )
						if( Internal_Swing_High <= 415.217 )
							ret := 0.107914
						if( Internal_Swing_High > 415.217 )
							ret := -0.758621 // sell
					if( Premium_Zone > 432.662 )
						if( Premium_Zone <= 465.701 )
							ret := -0.641176
						if( Premium_Zone > 465.701 )
							ret := -0.120690
			if( atr > 16.779 )
				if( Discount_Zone <= 462.414 )
					if( Equilibrium_Zone <= 487.364 )
						if( Premium_Zone <= 441.8 )
							ret := -0.111221
						if( Premium_Zone > 441.8 )
							ret := 0.007104
					if( Equilibrium_Zone > 487.364 )
						if( Equilibrium_Zone <= 500.104 )
							ret := 0.782609 // buy
						if( Equilibrium_Zone > 500.104 )
							ret := -0.333333
				if( Discount_Zone > 462.414 )
					if( atr <= 32.3668 )
						ret := -1.000000 // sell
					if( atr > 32.3668 )
						if( Internal_Swing_High <= 245.105 )
							ret := -0.557143
						if( Internal_Swing_High > 245.105 )
							ret := -1.000000 // sell
	if( Swing_High > 264.971 )
		if( Equilibrium_Zone <= 426.077 )
			if( Premium_Zone <= 441.058 )
				if( Equilibrium_Zone <= 369.134 )
					if( Order_Block_Low <= 336.437 )
						if( Order_Block_Low <= 285.681 )
							ret := -0.181009
						if( Order_Block_Low > 285.681 )
							ret := 0.318584
					if( Order_Block_Low > 336.437 )
						if( Discount_Zone <= 311.802 )
							ret := 0.000000
						if( Discount_Zone > 311.802 )
							ret := -0.603175
				if( Equilibrium_Zone > 369.134 )
					if( atr <= 25.2151 )
						if( Internal_Swing_High <= 420.1 )
							ret := 0.131026
						if( Internal_Swing_High > 420.1 )
							ret := -0.722222 // sell
					if( atr > 25.2151 )
						if( Equilibrium_Zone <= 407.347 )
							ret := -0.545946
						if( Equilibrium_Zone > 407.347 )
							ret := 0.392857
			if( Premium_Zone > 441.058 )
				if( Premium_Zone <= 447.819 )
					if( Discount_Zone <= 381.646 )
						if( Internal_Swing_High <= 421.227 )
							ret := -0.800000 // sell
						if( Internal_Swing_High > 421.227 )
							ret := -1.000000 // sell
					if( Discount_Zone > 381.646 )
						if( Discount_Zone <= 381.987 )
							ret := 1.000000 // buy
						if( Discount_Zone > 381.987 )
							ret := -0.723404 // sell
				if( Premium_Zone > 447.819 )
					if( Internal_Swing_High <= 434.923 )
						if( atr <= 36.3625 )
							ret := 0.200000
						if( atr > 36.3625 )
							ret := -0.444444
					if( Internal_Swing_High > 434.923 )
						if( Equilibrium_Zone <= 415.55 )
							ret := 0.000000
						if( Equilibrium_Zone > 415.55 )
							ret := -1.000000 // sell
		if( Equilibrium_Zone > 426.077 )
			if( Order_Block_High <= 464.363 )
				if( Premium_Zone <= 461.828 )
					if( atr <= 29.9875 )
						if( Equilibrium_Zone <= 428.096 )
							ret := -0.625000
						if( Equilibrium_Zone > 428.096 )
							ret := -0.187500
					if( atr > 29.9875 )
						ret := 1.000000 // buy
				if( Premium_Zone > 461.828 )
					if( Swing_High <= 453.34 )
						if( Equilibrium_Zone <= 434.693 )
							ret := 0.543478
						if( Equilibrium_Zone > 434.693 )
							ret := 1.000000 // buy
					if( Swing_High > 453.34 )
						if( Internal_Swing_High <= 473.254 )
							ret := -0.166667
						if( Internal_Swing_High > 473.254 )
							ret := 0.518519
			if( Order_Block_High > 464.363 )
				if( Discount_Zone <= 411.007 )
					ret := 1.000000 // buy
				if( Discount_Zone > 411.007 )
					if( Internal_Swing_High <= 495.2 )
						if( Swing_High <= 486.569 )
							ret := -0.461538
						if( Swing_High > 486.569 )
							ret := -1.000000 // sell
					if( Internal_Swing_High > 495.2 )
						ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MDB_5Min_a1b1a7d6(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


