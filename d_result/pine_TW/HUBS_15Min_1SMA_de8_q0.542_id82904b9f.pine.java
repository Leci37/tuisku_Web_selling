//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: HUBS_15Min_1SMA_82904b9f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1SMA_82904b9f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_82904b9f(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( atr <= 34.0737 )
		if( Discount_Zone <= 608.66 )
			if( atr <= 21.577 )
				if( Premium_Zone <= 152.371 )
					if( Discount_Zone <= 132.373 )
						if( Swing_Low <= 106.636 )
							if( Equilibrium_Zone <= 134.651 )
								if( atr <= 3.80176 )
									ret := 0.166316
								if( atr > 3.80176 )
									ret := 0.016966
							if( Equilibrium_Zone > 134.651 )
								if( Discount_Zone <= 123.302 )
									ret := -0.711712 // sell
								if( Discount_Zone > 123.302 )
									ret := -0.055556
						if( Swing_Low > 106.636 )
							if( Equilibrium_Zone <= 133.867 )
								if( Order_Block_High <= 54.375 )
									ret := 0.364372
								if( Order_Block_High > 54.375 )
									ret := 0.688312
							if( Equilibrium_Zone > 133.867 )
								if( Discount_Zone <= 123.488 )
									ret := -0.108108
								if( Discount_Zone > 123.488 )
									ret := -0.947368 // sell
					if( Discount_Zone > 132.373 )
						ret := 0.490446
				if( Premium_Zone > 152.371 )
					if( Equilibrium_Zone <= 132.586 )
						ret := -0.933333 // sell
					if( Equilibrium_Zone > 132.586 )
						if( atr <= 7.54198 )
							if( Discount_Zone <= 158.709 )
								if( atr <= 4.8825 )
									ret := 0.687500
								if( atr > 4.8825 )
									ret := -0.170370
							if( Discount_Zone > 158.709 )
								if( Equilibrium_Zone <= 181.11 )
									ret := 0.559524
								if( Equilibrium_Zone > 181.11 )
									ret := 0.294118
						if( atr > 7.54198 )
							if( atr <= 13.7398 )
								if( Equilibrium_Zone <= 182.885 )
									ret := -0.039025
								if( Equilibrium_Zone > 182.885 )
									ret := -0.315068
							if( atr > 13.7398 )
								if( Discount_Zone <= 128.488 )
									ret := -0.156951
								if( Discount_Zone > 128.488 )
									ret := 0.029655
			if( atr > 21.577 )
				if( Order_Block_Low <= 620.206 )
					if( Premium_Zone <= 147.388 )
						if( Order_Block_High <= 112.409 )
							if( Internal_Swing_High <= 108.675 )
								if( Equilibrium_Zone <= 118.96 )
									ret := 0.503759
								if( Equilibrium_Zone > 118.96 )
									ret := 0.675556
							if( Internal_Swing_High > 108.675 )
								if( Swing_High <= 60.035 )
									ret := 0.187500
								if( Swing_High > 60.035 )
									ret := 0.531915
						if( Order_Block_High > 112.409 )
							ret := -0.200000
					if( Premium_Zone > 147.388 )
						if( Bearish_BOSInt <= 0.5 )
							if( Internal_Swing_Low <= 514.745 )
								if( Swing_Low <= 124.46 )
									ret := 0.077049
								if( Swing_Low > 124.46 )
									ret := 0.258621
							if( Internal_Swing_Low > 514.745 )
								if( atr <= 32.9732 )
									ret := -0.087866
								if( atr > 32.9732 )
									ret := -0.512195
						if( Bearish_BOSInt > 0.5 )
							if( Swing_Low <= 125.223 )
								ret := -0.600000
							if( Swing_Low > 125.223 )
								if( Premium_Zone <= 322.896 )
									ret := 0.783333 // buy
								if( Premium_Zone > 322.896 )
									ret := 0.029412
				if( Order_Block_Low > 620.206 )
					ret := 1.000000 // buy
		if( Discount_Zone > 608.66 )
			if( atr <= 33.8617 )
				if( Equilibrium_Zone <= 692.166 )
					if( atr <= 30.5747 )
						if( Equilibrium_Zone <= 675.723 )
							ret := -0.565217
						if( Equilibrium_Zone > 675.723 )
							ret := -0.702703 // sell
					if( atr > 30.5747 )
						ret := -0.866667 // sell
				if( Equilibrium_Zone > 692.166 )
					if( Equilibrium_Zone <= 805.161 )
						if( Equilibrium_Zone <= 692.43 )
							ret := -0.315789
						if( Equilibrium_Zone > 692.43 )
							ret := -0.076923
					if( Equilibrium_Zone > 805.161 )
						ret := -0.708333 // sell
			if( atr > 33.8617 )
				if( Internal_Swing_Low <= 397.53 )
					ret := -0.200000
				if( Internal_Swing_Low > 397.53 )
					ret := 0.250000
	if( atr > 34.0737 )
		if( Equilibrium_Zone <= 117.323 )
			if( Premium_Zone <= 156.011 )
				if( Discount_Zone <= 61.7319 )
					if( Premium_Zone <= 154.594 )
						ret := 0.888889 // buy
					if( Premium_Zone > 154.594 )
						ret := 0.437500
				if( Discount_Zone > 61.7319 )
					if( Premium_Zone <= 155.466 )
						if( atr <= 41.7266 )
							ret := -0.800000 // sell
						if( atr > 41.7266 )
							if( atr <= 44.6154 )
								ret := -1.000000 // sell
							if( atr > 44.6154 )
								ret := -0.909091 // sell
					if( Premium_Zone > 155.466 )
						ret := -0.520000
			if( Premium_Zone > 156.011 )
				if( Discount_Zone <= 73.7956 )
					if( Equilibrium_Zone <= 114.57 )
						if( Internal_Swing_High <= 103.6 )
							if( Discount_Zone <= 52.0111 )
								ret := 0.888889 // buy
							if( Discount_Zone > 52.0111 )
								ret := 1.000000 // buy
						if( Internal_Swing_High > 103.6 )
							if( Premium_Zone <= 164.106 )
								ret := 0.857143 // buy
							if( Premium_Zone > 164.106 )
								ret := 0.689655
					if( Equilibrium_Zone > 114.57 )
						ret := -0.400000
				if( Discount_Zone > 73.7956 )
					if( Premium_Zone <= 159.205 )
						ret := 0.944444 // buy
					if( Premium_Zone > 159.205 )
						ret := 0.916667 // buy
		if( Equilibrium_Zone > 117.323 )
			if( Order_Block_Low <= 452.691 )
				if( Discount_Zone <= 175.37 )
					if( Swing_Low <= 115.697 )
						if( Premium_Zone <= 177.803 )
							if( Premium_Zone <= 172.294 )
								if( Swing_High <= 129.21 )
									ret := -0.310526
								if( Swing_High > 129.21 )
									ret := 0.333333
							if( Premium_Zone > 172.294 )
								if( atr <= 41.6807 )
									ret := -0.545455
								if( atr > 41.6807 )
									ret := 0.508197
						if( Premium_Zone > 177.803 )
							if( Equilibrium_Zone <= 152.104 )
								if( Premium_Zone <= 179.775 )
									ret := -0.808081 // sell
								if( Premium_Zone > 179.775 )
									ret := -0.080550
							if( Equilibrium_Zone > 152.104 )
								if( Premium_Zone <= 197.889 )
									ret := -0.666667
								if( Premium_Zone > 197.889 )
									ret := -0.350217
					if( Swing_Low > 115.697 )
						if( Internal_Swing_Low <= 162.992 )
							if( Premium_Zone <= 180.973 )
								ret := -0.300000
							if( Premium_Zone > 180.973 )
								if( Equilibrium_Zone <= 148.054 )
									ret := 0.500000
								if( Equilibrium_Zone > 148.054 )
									ret := 0.879310 // buy
						if( Internal_Swing_Low > 162.992 )
							ret := 0.000000
				if( Discount_Zone > 175.37 )
					if( atr <= 172.18 )
						if( Discount_Zone <= 225.99 )
							if( Internal_Swing_High <= 315.593 )
								if( Premium_Zone <= 326.442 )
									ret := 0.356423
								if( Premium_Zone > 326.442 )
									ret := 0.008333
							if( Internal_Swing_High > 315.593 )
								if( Swing_High <= 157.97 )
									ret := -0.733333 // sell
								if( Swing_High > 157.97 )
									ret := -0.933333 // sell
						if( Discount_Zone > 225.99 )
							if( Order_Block_Low <= 441.515 )
								if( Order_Block_High <= 386.675 )
									ret := -0.041841
								if( Order_Block_High > 386.675 )
									ret := -0.187773
							if( Order_Block_Low > 441.515 )
								if( Equilibrium_Zone <= 472.794 )
									ret := 0.787879 // buy
								if( Equilibrium_Zone > 472.794 )
									ret := 0.400000
					if( atr > 172.18 )
						if( Swing_High <= 773.847 )
							if( Premium_Zone <= 762.611 )
								if( Discount_Zone <= 330.188 )
									ret := 1.000000 // buy
								if( Discount_Zone > 330.188 )
									ret := -0.554054
							if( Premium_Zone > 762.611 )
								if( Internal_Swing_Low <= 754.55 )
									ret := 0.646552
								if( Internal_Swing_Low > 754.55 )
									ret := -0.350000
						if( Swing_High > 773.847 )
							ret := -0.916667 // sell
			if( Order_Block_Low > 452.691 )
				if( Discount_Zone <= 537.242 )
					if( Equilibrium_Zone <= 566.269 )
						if( Order_Block_High <= 468.677 )
							if( Equilibrium_Zone <= 503.658 )
								if( Equilibrium_Zone <= 436.401 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 436.401 )
									ret := -0.562500
							if( Equilibrium_Zone > 503.658 )
								ret := -1.000000 // sell
						if( Order_Block_High > 468.677 )
							if( Discount_Zone <= 418.277 )
								if( Order_Block_High <= 474.964 )
									ret := 0.260870
								if( Order_Block_High > 474.964 )
									ret := -0.607143
							if( Discount_Zone > 418.277 )
								if( Equilibrium_Zone <= 474.281 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 474.281 )
									ret := -0.144578
					if( Equilibrium_Zone > 566.269 )
						if( Swing_Low <= 552.287 )
							if( Premium_Zone <= 688.697 )
								if( Discount_Zone <= 532.674 )
									ret := -0.956522 // sell
								if( Discount_Zone > 532.674 )
									ret := -0.750000 // sell
							if( Premium_Zone > 688.697 )
								ret := -0.692308
						if( Swing_Low > 552.287 )
							ret := -0.692308
				if( Discount_Zone > 537.242 )
					if( Order_Block_Low <= 585.86 )
						if( Order_Block_Low <= 581.874 )
							if( Equilibrium_Zone <= 587.176 )
								ret := 0.833333 // buy
							if( Equilibrium_Zone > 587.176 )
								ret := 0.466667
						if( Order_Block_Low > 581.874 )
							ret := 1.000000 // buy
					if( Order_Block_Low > 585.86 )
						if( atr <= 64.5108 )
							if( Premium_Zone <= 632.45 )
								ret := 0.312500
							if( Premium_Zone > 632.45 )
								if( Equilibrium_Zone <= 646.963 )
									ret := -0.609756
								if( Equilibrium_Zone > 646.963 )
									ret := -0.222222
						if( atr > 64.5108 )
							if( Discount_Zone <= 648.73 )
								if( Internal_Swing_Low <= 593.668 )
									ret := 0.137931
								if( Internal_Swing_Low > 593.668 )
									ret := 0.870968 // buy
							if( Discount_Zone > 648.73 )
								if( Order_Block_Low <= 773.156 )
									ret := -0.625000
								if( Order_Block_Low > 773.156 )
									ret := 0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_HUBS_15Min_82904b9f(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


