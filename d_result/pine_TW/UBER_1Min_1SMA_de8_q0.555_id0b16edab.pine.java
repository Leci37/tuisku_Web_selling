//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: UBER_1Min_1SMA_0b16edab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1SMA_0b16edab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_0b16edab(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Internal_Swing_High <= 55.4651 )
		if( Internal_Swing_Low <= 62.3712 )
			if( Equilibrium_Zone <= 81.6476 )
				if( Internal_Swing_High <= 54.2093 )
					if( Premium_Zone <= 64.7172 )
						if( atr <= 1.71846 )
							if( Internal_Swing_Low <= 60.7657 )
								if( Discount_Zone <= 63.6784 )
									ret := 0.127889
								if( Discount_Zone > 63.6784 )
									ret := 0.682540
							if( Internal_Swing_Low > 60.7657 )
								if( Swing_Low <= 30.4 )
									ret := 0.625000
								if( Swing_Low > 30.4 )
									ret := 0.500000
						if( atr > 1.71846 )
							if( Equilibrium_Zone <= 55.338 )
								if( atr <= 5.46908 )
									ret := 0.846154 // buy
								if( atr > 5.46908 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 55.338 )
								if( Discount_Zone <= 59.36 )
									ret := -0.035076
								if( Discount_Zone > 59.36 )
									ret := -0.531250
					if( Premium_Zone > 64.7172 )
						if( Premium_Zone <= 64.7904 )
							if( Discount_Zone <= 59.2362 )
								if( Discount_Zone <= 59.1113 )
									ret := -0.047059
								if( Discount_Zone > 59.1113 )
									ret := 0.636364
							if( Discount_Zone > 59.2362 )
								if( Equilibrium_Zone <= 63.4967 )
									ret := -0.768657 // sell
								if( Equilibrium_Zone > 63.4967 )
									ret := 0.027778
						if( Premium_Zone > 64.7904 )
							if( Discount_Zone <= 57.7346 )
								if( Premium_Zone <= 73.6398 )
									ret := -0.718750 // sell
								if( Premium_Zone > 73.6398 )
									ret := -0.380531
							if( Discount_Zone > 57.7346 )
								if( Premium_Zone <= 78.7444 )
									ret := -0.016560
								if( Premium_Zone > 78.7444 )
									ret := -0.181667
				if( Internal_Swing_High > 54.2093 )
					if( Swing_High <= 27.335 )
						ret := 0.947368 // buy
					if( Swing_High > 27.335 )
						ret := 1.000000 // buy
			if( Equilibrium_Zone > 81.6476 )
				if( Premium_Zone <= 84.916 )
					ret := 0.925000 // buy
				if( Premium_Zone > 84.916 )
					if( Discount_Zone <= 77.45 )
						if( Premium_Zone <= 86.3106 )
							ret := 0.450000
						if( Premium_Zone > 86.3106 )
							ret := -1.000000 // sell
					if( Discount_Zone > 77.45 )
						if( Equilibrium_Zone <= 81.7898 )
							ret := 0.777778 // buy
						if( Equilibrium_Zone > 81.7898 )
							if( Premium_Zone <= 88.5875 )
								if( Equilibrium_Zone <= 82.9882 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 82.9882 )
									ret := 0.229249
							if( Premium_Zone > 88.5875 )
								if( atr <= 4.04713 )
									ret := -0.076923
								if( atr > 4.04713 )
									ret := -0.645161
		if( Internal_Swing_Low > 62.3712 )
			if( atr <= 8.97773 )
				if( Discount_Zone <= 68.8262 )
					if( Premium_Zone <= 65.0176 )
						if( Bearish_BOSInt <= 0.5 )
							if( Premium_Zone <= 63.9815 )
								if( Swing_Low <= 31.2955 )
									ret := -0.125786
								if( Swing_Low > 31.2955 )
									ret := -0.687500
							if( Premium_Zone > 63.9815 )
								if( Equilibrium_Zone <= 64.1942 )
									ret := 0.511494
								if( Equilibrium_Zone > 64.1942 )
									ret := 0.000000
						if( Bearish_BOSInt > 0.5 )
							if( atr <= 0.755 )
								ret := -0.333333
							if( atr > 0.755 )
								ret := 0.625000
					if( Premium_Zone > 65.0176 )
						if( Equilibrium_Zone <= 72.5741 )
							if( Order_Block_Low <= 68.0183 )
								if( atr <= 1.72056 )
									ret := 0.113105
								if( atr > 1.72056 )
									ret := 0.026259
							if( Order_Block_Low > 68.0183 )
								if( Premium_Zone <= 70.5342 )
									ret := 0.707692 // buy
								if( Premium_Zone > 70.5342 )
									ret := 0.102410
						if( Equilibrium_Zone > 72.5741 )
							ret := -0.783784 // sell
				if( Discount_Zone > 68.8262 )
					if( Premium_Zone <= 85.1982 )
						if( Premium_Zone <= 84.1754 )
							if( Discount_Zone <= 69.3253 )
								if( Equilibrium_Zone <= 72.1394 )
									ret := -0.185185
								if( Equilibrium_Zone > 72.1394 )
									ret := 0.361446
							if( Discount_Zone > 69.3253 )
								if( Swing_Low <= 34.28 )
									ret := -0.057329
								if( Swing_Low > 34.28 )
									ret := 0.115018
						if( Premium_Zone > 84.1754 )
							if( Internal_Swing_Low <= 81.6868 )
								ret := -0.800000 // sell
							if( Internal_Swing_Low > 81.6868 )
								ret := -1.000000 // sell
					if( Premium_Zone > 85.1982 )
						if( Internal_Swing_Low <= 84.6781 )
							if( Discount_Zone <= 83.2733 )
								if( Equilibrium_Zone <= 82.593 )
									ret := 0.583333
								if( Equilibrium_Zone > 82.593 )
									ret := 0.861538 // buy
							if( Discount_Zone > 83.2733 )
								if( Discount_Zone <= 83.4154 )
									ret := 0.000000
								if( Discount_Zone > 83.4154 )
									ret := 0.650000
						if( Internal_Swing_Low > 84.6781 )
							if( Premium_Zone <= 85.6475 )
								if( Discount_Zone <= 84.2103 )
									ret := 0.857143 // buy
								if( Discount_Zone > 84.2103 )
									ret := 0.481481
							if( Premium_Zone > 85.6475 )
								if( Swing_Low <= 85.1963 )
									ret := -0.018779
								if( Swing_Low > 85.1963 )
									ret := 0.400000
			if( atr > 8.97773 )
				ret := 1.000000 // buy
	if( Internal_Swing_High > 55.4651 )
		if( Internal_Swing_High <= 77.1567 )
			if( Equilibrium_Zone <= 64.7899 )
				if( Premium_Zone <= 66.5702 )
					if( Internal_Swing_Low <= 64.7225 )
						if( Equilibrium_Zone <= 64.7025 )
							if( Swing_High <= 64.4915 )
								if( Internal_Swing_High <= 55.8695 )
									ret := -0.847826 // sell
								if( Internal_Swing_High > 55.8695 )
									ret := -0.078419
							if( Swing_High > 64.4915 )
								if( Equilibrium_Zone <= 64.2961 )
									ret := -0.578680
								if( Equilibrium_Zone > 64.2961 )
									ret := 0.047170
						if( Equilibrium_Zone > 64.7025 )
							if( Internal_Swing_Low <= 64.4638 )
								if( Premium_Zone <= 66.2444 )
									ret := -0.623377
								if( Premium_Zone > 66.2444 )
									ret := 0.083333
							if( Internal_Swing_Low > 64.4638 )
								ret := 0.909091 // buy
					if( Internal_Swing_Low > 64.7225 )
						ret := -0.733333 // sell
				if( Premium_Zone > 66.5702 )
					if( Equilibrium_Zone <= 64.7116 )
						if( Swing_High <= 64.3728 )
							if( Premium_Zone <= 66.6391 )
								if( Internal_Swing_High <= 63.4898 )
									ret := -1.000000 // sell
								if( Internal_Swing_High > 63.4898 )
									ret := -0.550000
							if( Premium_Zone > 66.6391 )
								if( atr <= 3.81358 )
									ret := -0.089744
								if( atr > 3.81358 )
									ret := -1.000000 // sell
						if( Swing_High > 64.3728 )
							if( Premium_Zone <= 67.1668 )
								if( Discount_Zone <= 61.6004 )
									ret := -0.823529 // sell
								if( Discount_Zone > 61.6004 )
									ret := -0.538462
							if( Premium_Zone > 67.1668 )
								ret := -1.000000 // sell
					if( Equilibrium_Zone > 64.7116 )
						if( Swing_High <= 65.4582 )
							if( atr <= 2.34734 )
								ret := 0.625000
							if( atr > 2.34734 )
								ret := 0.363636
						if( Swing_High > 65.4582 )
							ret := -0.400000
			if( Equilibrium_Zone > 64.7899 )
				if( atr <= 0.700431 )
					if( Internal_Swing_High <= 76.29 )
						if( Internal_Swing_Low <= 74.1352 )
							if( Internal_Swing_High <= 65.1525 )
								ret := -0.818182 // sell
							if( Internal_Swing_High > 65.1525 )
								if( Equilibrium_Zone <= 65.0876 )
									ret := 0.765957 // buy
								if( Equilibrium_Zone > 65.0876 )
									ret := -0.159940
						if( Internal_Swing_Low > 74.1352 )
							ret := 0.700000 // buy
					if( Internal_Swing_High > 76.29 )
						if( Internal_Swing_High <= 76.5689 )
							ret := -1.000000 // sell
						if( Internal_Swing_High > 76.5689 )
							ret := -0.800000 // sell
				if( atr > 0.700431 )
					if( Premium_Zone <= 70.2549 )
						if( Equilibrium_Zone <= 65.6862 )
							if( Swing_High <= 65.5221 )
								if( atr <= 1.05117 )
									ret := -0.236264
								if( atr > 1.05117 )
									ret := 0.277070
							if( Swing_High > 65.5221 )
								if( Order_Block_High <= 65.595 )
									ret := 0.663265
								if( Order_Block_High > 65.595 )
									ret := 0.077778
						if( Equilibrium_Zone > 65.6862 )
							if( Premium_Zone <= 68.1553 )
								if( Swing_High <= 66.9066 )
									ret := -0.272817
								if( Swing_High > 66.9066 )
									ret := 0.150538
							if( Premium_Zone > 68.1553 )
								if( Discount_Zone <= 66.351 )
									ret := 0.231343
								if( Discount_Zone > 66.351 )
									ret := -0.011670
					if( Premium_Zone > 70.2549 )
						if( Internal_Swing_High <= 68.7501 )
							if( Discount_Zone <= 63.5175 )
								if( atr <= 8.89788 )
									ret := -0.653846
								if( atr > 8.89788 )
									ret := 0.181818
							if( Discount_Zone > 63.5175 )
								if( Premium_Zone <= 71.2889 )
									ret := -0.049080
								if( Premium_Zone > 71.2889 )
									ret := -0.310526
						if( Internal_Swing_High > 68.7501 )
							if( Equilibrium_Zone <= 76.5567 )
								if( Order_Block_Low <= 76.5651 )
									ret := -0.022778
								if( Order_Block_Low > 76.5651 )
									ret := -0.805556 // sell
							if( Equilibrium_Zone > 76.5567 )
								if( Swing_High <= 38.3752 )
									ret := -0.393939
								if( Swing_High > 38.3752 )
									ret := 0.000000
		if( Internal_Swing_High > 77.1567 )
			if( Discount_Zone <= 83.3082 )
				if( Order_Block_High <= 81.4647 )
					if( Equilibrium_Zone <= 82.231 )
						if( Order_Block_Low <= 78.125 )
							if( Discount_Zone <= 76.5375 )
								if( Premium_Zone <= 78.5325 )
									ret := 0.526316
								if( Premium_Zone > 78.5325 )
									ret := 0.169355
							if( Discount_Zone > 76.5375 )
								if( atr <= 0.777403 )
									ret := 0.218274
								if( atr > 0.777403 )
									ret := -0.079038
						if( Order_Block_Low > 78.125 )
							if( Order_Block_Low <= 80.4841 )
								if( Discount_Zone <= 76.1775 )
									ret := 1.000000 // buy
								if( Discount_Zone > 76.1775 )
									ret := 0.888889 // buy
							if( Order_Block_Low > 80.4841 )
								ret := 0.428571
					if( Equilibrium_Zone > 82.231 )
						if( Equilibrium_Zone <= 83.1715 )
							if( Internal_Swing_High <= 85.0956 )
								if( Premium_Zone <= 86.499 )
									ret := 0.785714 // buy
								if( Premium_Zone > 86.499 )
									ret := 1.000000 // buy
							if( Internal_Swing_High > 85.0956 )
								ret := 0.454545
						if( Equilibrium_Zone > 83.1715 )
							if( Discount_Zone <= 83.0228 )
								if( Premium_Zone <= 88.6576 )
									ret := -0.163934
								if( Premium_Zone > 88.6576 )
									ret := 0.800000 // buy
							if( Discount_Zone > 83.0228 )
								if( atr <= 2.03061 )
									ret := 0.735294 // buy
								if( atr > 2.03061 )
									ret := 0.583333
				if( Order_Block_High > 81.4647 )
					if( Discount_Zone <= 76.0555 )
						ret := -1.000000 // sell
					if( Discount_Zone > 76.0555 )
						if( Discount_Zone <= 79.1767 )
							ret := -0.125000
						if( Discount_Zone > 79.1767 )
							ret := -0.720000 // sell
			if( Discount_Zone > 83.3082 )
				if( atr <= 1.0625 )
					if( Discount_Zone <= 84.7245 )
						if( atr <= 0.579155 )
							ret := -0.187500
						if( atr > 0.579155 )
							if( Internal_Swing_High <= 84.9375 )
								ret := 0.000000
							if( Internal_Swing_High > 84.9375 )
								ret := 0.000000
					if( Discount_Zone > 84.7245 )
						if( Discount_Zone <= 84.825 )
							ret := 0.863636 // buy
						if( Discount_Zone > 84.825 )
							ret := 0.210526
				if( atr > 1.0625 )
					if( Order_Block_High <= 42.8938 )
						if( Swing_High <= 86.3634 )
							if( Internal_Swing_High <= 85.6359 )
								if( atr <= 1.24109 )
									ret := -0.545455
								if( atr > 1.24109 )
									ret := -0.827586 // sell
							if( Internal_Swing_High > 85.6359 )
								if( atr <= 1.90787 )
									ret := -0.057692
								if( atr > 1.90787 )
									ret := -0.666667
						if( Swing_High > 86.3634 )
							ret := -0.705882 // sell
					if( Order_Block_High > 42.8938 )
						ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_0b16edab(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


