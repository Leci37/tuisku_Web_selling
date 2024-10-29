//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: TTD_30Min_1SMA_52f5e2a3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_30Min_1SMA_52f5e2a3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_30Min_52f5e2a3(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Discount_Zone <= 40.4325 )
		if( atr <= 20.0938 )
			if( Premium_Zone <= 72.3641 )
				if( Equilibrium_Zone <= 25.1367 )
					if( Internal_Swing_Low <= 28.48 )
						if( Discount_Zone <= 15.9199 )
							ret := 0.256757
						if( Discount_Zone > 15.9199 )
							ret := 0.605882
					if( Internal_Swing_Low > 28.48 )
						ret := -0.944444 // sell
				if( Equilibrium_Zone > 25.1367 )
					if( Swing_Low <= 48.9769 )
						if( Discount_Zone <= 22.3245 )
							ret := -0.182573
						if( Discount_Zone > 22.3245 )
							ret := 0.093117
					if( Swing_Low > 48.9769 )
						if( atr <= 16.7051 )
							ret := -0.500000
						if( atr > 16.7051 )
							ret := -1.000000 // sell
			if( Premium_Zone > 72.3641 )
				if( Equilibrium_Zone <= 58.1885 )
					if( Internal_Swing_High <= 22.875 )
						if( atr <= 18.7501 )
							ret := -0.046512
						if( atr > 18.7501 )
							ret := -0.593548
					if( Internal_Swing_High > 22.875 )
						if( Internal_Swing_High <= 63.955 )
							ret := -0.984375 // sell
						if( Internal_Swing_High > 63.955 )
							ret := -0.300000
				if( Equilibrium_Zone > 58.1885 )
					ret := 0.533333
		if( atr > 20.0938 )
			if( Premium_Zone <= 94.2258 )
				if( Internal_Swing_High <= 43.7912 )
					if( Equilibrium_Zone <= 47.714 )
						if( atr <= 21.8659 )
							ret := 0.983871 // buy
						if( atr > 21.8659 )
							ret := 0.769231 // buy
					if( Equilibrium_Zone > 47.714 )
						if( Discount_Zone <= 28.0466 )
							ret := 0.282609
						if( Discount_Zone > 28.0466 )
							ret := 0.634286
				if( Internal_Swing_High > 43.7912 )
					if( Internal_Swing_High <= 45.655 )
						if( Discount_Zone <= 28.3524 )
							ret := 0.250000
						if( Discount_Zone > 28.3524 )
							ret := -0.846154 // sell
					if( Internal_Swing_High > 45.655 )
						if( Discount_Zone <= 28.4149 )
							ret := 0.000000
						if( Discount_Zone > 28.4149 )
							ret := 0.414966
			if( Premium_Zone > 94.2258 )
				if( Premium_Zone <= 96.4725 )
					if( Internal_Swing_Low <= 70.3194 )
						if( Swing_High <= 76.2544 )
							ret := -1.000000 // sell
						if( Swing_High > 76.2544 )
							ret := -0.500000
					if( Internal_Swing_Low > 70.3194 )
						ret := -0.454545
				if( Premium_Zone > 96.4725 )
					if( atr <= 34.2485 )
						if( Premium_Zone <= 99.0092 )
							ret := 0.250000
						if( Premium_Zone > 99.0092 )
							ret := 0.788732 // buy
					if( atr > 34.2485 )
						if( Equilibrium_Zone <= 65.9117 )
							ret := 0.422535
						if( Equilibrium_Zone > 65.9117 )
							ret := -0.074627
	if( Discount_Zone > 40.4325 )
		if( Internal_Swing_High <= 792.88 )
			if( Premium_Zone <= 117.935 )
				if( Internal_Swing_High <= 82.485 )
					if( atr <= 3.94432 )
						if( Equilibrium_Zone <= 61.455 )
							ret := 0.451493
						if( Equilibrium_Zone > 61.455 )
							ret := -0.018868
					if( atr > 3.94432 )
						if( Swing_High <= 70.6986 )
							ret := -0.046936
						if( Swing_High > 70.6986 )
							ret := 0.294964
				if( Internal_Swing_High > 82.485 )
					if( Premium_Zone <= 96.8567 )
						if( Equilibrium_Zone <= 84.8885 )
							ret := -0.407063
						if( Equilibrium_Zone > 84.8885 )
							ret := -0.102837
					if( Premium_Zone > 96.8567 )
						if( Swing_Low <= 41.0906 )
							ret := -0.085966
						if( Swing_Low > 41.0906 )
							ret := 0.850000 // buy
			if( Premium_Zone > 117.935 )
				if( Premium_Zone <= 139.469 )
					if( Discount_Zone <= 74.2015 )
						if( atr <= 29.1103 )
							ret := 0.975000 // buy
						if( atr > 29.1103 )
							ret := 0.475138
					if( Discount_Zone > 74.2015 )
						if( Discount_Zone <= 83.5542 )
							ret := -0.133005
						if( Discount_Zone > 83.5542 )
							ret := 0.375701
				if( Premium_Zone > 139.469 )
					if( atr <= 15.7642 )
						if( Discount_Zone <= 186.607 )
							ret := 0.265560
						if( Discount_Zone > 186.607 )
							ret := 0.712329 // buy
					if( atr > 15.7642 )
						if( Internal_Swing_High <= 759.515 )
							ret := 0.004356
						if( Internal_Swing_High > 759.515 )
							ret := 0.456790
		if( Internal_Swing_High > 792.88 )
			if( Swing_High <= 847.054 )
				if( Discount_Zone <= 560.583 )
					if( Equilibrium_Zone <= 687.177 )
						ret := -0.800000 // sell
					if( Equilibrium_Zone > 687.177 )
						ret := -1.000000 // sell
				if( Discount_Zone > 560.583 )
					if( Equilibrium_Zone <= 789.132 )
						if( Internal_Swing_High <= 806.206 )
							ret := -0.368421
						if( Internal_Swing_High > 806.206 )
							ret := 0.416667
					if( Equilibrium_Zone > 789.132 )
						if( Equilibrium_Zone <= 802.641 )
							ret := -0.862069 // sell
						if( Equilibrium_Zone > 802.641 )
							ret := -0.233503
			if( Swing_High > 847.054 )
				if( Premium_Zone <= 1014.05 )
					if( Equilibrium_Zone <= 812.438 )
						if( Equilibrium_Zone <= 796.859 )
							ret := -0.789474 // sell
						if( Equilibrium_Zone > 796.859 )
							ret := -0.368421
					if( Equilibrium_Zone > 812.438 )
						if( Equilibrium_Zone <= 900.008 )
							ret := -1.000000 // sell
						if( Equilibrium_Zone > 900.008 )
							ret := -0.666667
				if( Premium_Zone > 1014.05 )
					ret := -0.166667
	
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
float op_operation = decision_tree_0_TTD_30Min_52f5e2a3(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


