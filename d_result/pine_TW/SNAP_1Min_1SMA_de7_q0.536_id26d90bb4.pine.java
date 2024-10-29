//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: SNAP_1Min_1SMA_26d90bb4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1SMA_26d90bb4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_26d90bb4(atr, FVG_UpInt, Bullish_CHoCHInt, Discount_Zone, Swing_High, FVG_DownInt, Internal_Swing_Low, Order_Block_Low, Bearish_CHoCHInt, Bearish_BOSInt, Equilibrium_Zone, Order_Block_High, Internal_Swing_High, Swing_Low, Premium_Zone, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( Swing_High <= 8.56981 )
		if( Internal_Swing_Low <= 2.14269 )
			if( atr <= 0.655128 )
				if( atr <= 0.562549 )
					if( Premium_Zone <= 17.6097 )
						if( Internal_Swing_High <= 11.0939 )
							if( Premium_Zone <= 9.37425 )
								ret := -0.064664
							if( Premium_Zone > 9.37425 )
								ret := 0.010722
						if( Internal_Swing_High > 11.0939 )
							if( Equilibrium_Zone <= 14.0673 )
								ret := -0.189938
							if( Equilibrium_Zone > 14.0673 )
								ret := -0.060388
					if( Premium_Zone > 17.6097 )
						if( Premium_Zone <= 17.6918 )
							if( Premium_Zone <= 17.645 )
								ret := -0.690909
							if( Premium_Zone > 17.645 )
								ret := 0.454545
						if( Premium_Zone > 17.6918 )
							if( Premium_Zone <= 17.7295 )
								ret := -0.909091 // sell
							if( Premium_Zone > 17.7295 )
								ret := -0.652174
				if( atr > 0.562549 )
					if( Equilibrium_Zone <= 14.9546 )
						if( Premium_Zone <= 9.40104 )
							if( Premium_Zone <= 9.2158 )
								ret := 0.193548
							if( Premium_Zone > 9.2158 )
								ret := 0.873418 // buy
						if( Premium_Zone > 9.40104 )
							if( Equilibrium_Zone <= 12.6231 )
								ret := 0.062500
							if( Equilibrium_Zone > 12.6231 )
								ret := 0.309524
					if( Equilibrium_Zone > 14.9546 )
						if( Equilibrium_Zone <= 15.3354 )
							if( Internal_Swing_High <= 7.33589 )
								ret := -0.333333
							if( Internal_Swing_High > 7.33589 )
								ret := -0.836735 // sell
						if( Equilibrium_Zone > 15.3354 )
							if( Premium_Zone <= 16.0071 )
								ret := 0.657895
							if( Premium_Zone > 16.0071 )
								ret := -0.066586
			if( atr > 0.655128 )
				if( Discount_Zone <= 10.5529 )
					if( Premium_Zone <= 11.0547 )
						if( Internal_Swing_High <= 8.675 )
							if( Equilibrium_Zone <= 9.60945 )
								ret := 0.166667
							if( Equilibrium_Zone > 9.60945 )
								ret := -0.347518
						if( Internal_Swing_High > 8.675 )
							if( Equilibrium_Zone <= 10.0825 )
								ret := -0.776119 // sell
							if( Equilibrium_Zone > 10.0825 )
								ret := -0.250000
					if( Premium_Zone > 11.0547 )
						if( Internal_Swing_High <= 14.5373 )
							if( atr <= 0.846303 )
								ret := -0.058621
							if( atr > 0.846303 )
								ret := 0.234694
						if( Internal_Swing_High > 14.5373 )
							if( atr <= 3.6925 )
								ret := -1.000000 // sell
							if( atr > 3.6925 )
								ret := -0.833333 // sell
				if( Discount_Zone > 10.5529 )
					if( Discount_Zone <= 10.7332 )
						if( atr <= 0.808311 )
							if( Premium_Zone <= 12.105 )
								ret := -0.629032
							if( Premium_Zone > 12.105 )
								ret := -0.918919 // sell
						if( atr > 0.808311 )
							if( Internal_Swing_High <= 11.0849 )
								ret := 0.666667
							if( Internal_Swing_High > 11.0849 )
								ret := -1.000000 // sell
					if( Discount_Zone > 10.7332 )
						if( Equilibrium_Zone <= 15.9197 )
							if( Equilibrium_Zone <= 14.3577 )
								ret := -0.056013
							if( Equilibrium_Zone > 14.3577 )
								ret := -0.283092
						if( Equilibrium_Zone > 15.9197 )
							if( Internal_Swing_High <= 16.158 )
								ret := 0.040394
							if( Internal_Swing_High > 16.158 )
								ret := -0.289286
		if( Internal_Swing_Low > 2.14269 )
			if( atr <= 0.208413 )
				if( FVG_DownInt <= 0.5 )
					if( Internal_Swing_Low <= 8.43785 )
						if( atr <= 0.187072 )
							if( Discount_Zone <= 8.14141 )
								ret := 0.150000
							if( Discount_Zone > 8.14141 )
								ret := 0.758929 // buy
						if( atr > 0.187072 )
							if( Discount_Zone <= 8.19723 )
								ret := -0.357143
							if( Discount_Zone > 8.19723 )
								ret := 0.437500
					if( Internal_Swing_Low > 8.43785 )
						if( Premium_Zone <= 8.77002 )
							if( Equilibrium_Zone <= 8.51714 )
								ret := 0.294118
							if( Equilibrium_Zone > 8.51714 )
								ret := -0.132565
						if( Premium_Zone > 8.77002 )
							if( Premium_Zone <= 9.28955 )
								ret := 0.286943
							if( Premium_Zone > 9.28955 )
								ret := 0.131960
				if( FVG_DownInt > 0.5 )
					if( Internal_Swing_Low <= 8.53 )
						if( Equilibrium_Zone <= 8.49483 )
							ret := 1.000000 // buy
						if( Equilibrium_Zone > 8.49483 )
							if( Discount_Zone <= 8.3549 )
								ret := -0.500000
							if( Discount_Zone > 8.3549 )
								ret := -0.869565 // sell
					if( Internal_Swing_Low > 8.53 )
						if( Order_Block_Low <= 9.39005 )
							if( Internal_Swing_Low <= 10.635 )
								ret := 0.804734 // buy
							if( Internal_Swing_Low > 10.635 )
								ret := 0.483871
						if( Order_Block_Low > 9.39005 )
							if( Order_Block_Low <= 10.5049 )
								ret := -0.500000
							if( Order_Block_Low > 10.5049 )
								ret := 0.444444
			if( atr > 0.208413 )
				if( Equilibrium_Zone <= 17.0047 )
					if( Equilibrium_Zone <= 8.68833 )
						if( atr <= 0.46827 )
							if( atr <= 0.247828 )
								ret := 0.058366
							if( atr > 0.247828 )
								ret := 0.600694
						if( atr > 0.46827 )
							if( Discount_Zone <= 8.12126 )
								ret := -0.181287
							if( Discount_Zone > 8.12126 )
								ret := 0.888889 // buy
					if( Equilibrium_Zone > 8.68833 )
						if( Discount_Zone <= 10.7328 )
							if( Swing_Low <= 10.7075 )
								ret := 0.024472
							if( Swing_Low > 10.7075 )
								ret := -0.469325
						if( Discount_Zone > 10.7328 )
							if( Discount_Zone <= 14.7515 )
								ret := 0.138606
							if( Discount_Zone > 14.7515 )
								ret := 0.033844
				if( Equilibrium_Zone > 17.0047 )
					if( Internal_Swing_Low <= 17.1104 )
						if( Internal_Swing_Low <= 16.7751 )
							ret := -1.000000 // sell
						if( Internal_Swing_Low > 16.7751 )
							if( Swing_Low <= 17.0475 )
								ret := -0.201005
							if( Swing_Low > 17.0475 )
								ret := 0.550000
					if( Internal_Swing_Low > 17.1104 )
						if( Equilibrium_Zone <= 17.0503 )
							if( Internal_Swing_Low <= 17.1617 )
								ret := -0.444444
							if( Internal_Swing_Low > 17.1617 )
								ret := -0.709677 // sell
						if( Equilibrium_Zone > 17.0503 )
							if( Premium_Zone <= 17.3603 )
								ret := -1.000000 // sell
							if( Premium_Zone > 17.3603 )
								ret := -0.833333 // sell
	if( Swing_High > 8.56981 )
		if( Discount_Zone <= 14.7347 )
			if( Order_Block_High <= 7.32938 )
				if( atr <= 0.146356 )
					if( Internal_Swing_Low <= 8.9998 )
						if( atr <= 0.079743 )
							if( Swing_High <= 11.5425 )
								ret := 0.583333
							if( Swing_High > 11.5425 )
								ret := -0.812500 // sell
						if( atr > 0.079743 )
							if( atr <= 0.11984 )
								ret := -0.536932
							if( atr > 0.11984 )
								ret := -0.337469
					if( Internal_Swing_Low > 8.9998 )
						if( Discount_Zone <= 8.9 )
							if( Swing_High <= 9.05529 )
								ret := 0.750000 // buy
							if( Swing_High > 9.05529 )
								ret := 0.833333 // buy
						if( Discount_Zone > 8.9 )
							if( Swing_High <= 9.24919 )
								ret := -0.428571
							if( Swing_High > 9.24919 )
								ret := 0.160714
				if( atr > 0.146356 )
					if( Premium_Zone <= 13.29 )
						if( Swing_Low <= 8.72 )
							if( Discount_Zone <= 11.1044 )
								ret := -0.058413
							if( Discount_Zone > 11.1044 )
								ret := 0.309645
						if( Swing_Low > 8.72 )
							if( Internal_Swing_High <= 10.9826 )
								ret := -0.689655
							if( Internal_Swing_High > 10.9826 )
								ret := -1.000000 // sell
					if( Premium_Zone > 13.29 )
						if( Internal_Swing_High <= 15.3145 )
							if( atr <= 0.399776 )
								ret := -0.412281
							if( atr > 0.399776 )
								ret := 0.040462
						if( Internal_Swing_High > 15.3145 )
							if( Internal_Swing_High <= 15.5693 )
								ret := -0.869565 // sell
							if( Internal_Swing_High > 15.5693 )
								ret := -0.702703 // sell
			if( Order_Block_High > 7.32938 )
				if( Premium_Zone <= 9.30365 )
					if( atr <= 0.197193 )
						if( Premium_Zone <= 9.1425 )
							if( Equilibrium_Zone <= 8.72001 )
								ret := -0.642857
							if( Equilibrium_Zone > 8.72001 )
								ret := 0.139535
						if( Premium_Zone > 9.1425 )
							if( atr <= 0.14015 )
								ret := -0.285714
							if( atr > 0.14015 )
								ret := -0.884615 // sell
					if( atr > 0.197193 )
						if( Premium_Zone <= 9.03323 )
							if( Swing_High <= 8.78487 )
								ret := -0.741935 // sell
							if( Swing_High > 8.78487 )
								ret := 0.312500
						if( Premium_Zone > 9.03323 )
							if( Order_Block_High <= 8.90906 )
								ret := -1.000000 // sell
							if( Order_Block_High > 8.90906 )
								ret := -0.913043 // sell
				if( Premium_Zone > 9.30365 )
					if( atr <= 0.50039 )
						if( Premium_Zone <= 9.55155 )
							if( Equilibrium_Zone <= 9.355 )
								ret := -0.008547
							if( Equilibrium_Zone > 9.355 )
								ret := 0.700000 // buy
						if( Premium_Zone > 9.55155 )
							if( Premium_Zone <= 15.6907 )
								ret := -0.287617
							if( Premium_Zone > 15.6907 )
								ret := 0.909091 // buy
					if( atr > 0.50039 )
						if( Swing_High <= 13.8878 )
							if( Premium_Zone <= 10.085 )
								ret := 0.500000
							if( Premium_Zone > 10.085 )
								ret := -0.359649
						if( Swing_High > 13.8878 )
							if( Internal_Swing_High <= 15.58 )
								ret := -0.878505 // sell
							if( Internal_Swing_High > 15.58 )
								ret := -0.400000
		if( Discount_Zone > 14.7347 )
			if( Discount_Zone <= 14.8796 )
				if( Premium_Zone <= 15.5923 )
					if( Equilibrium_Zone <= 15.1453 )
						if( Premium_Zone <= 15.4637 )
							if( Order_Block_High <= 15.0025 )
								ret := -0.315789
							if( Order_Block_High > 15.0025 )
								ret := 0.750000 // buy
						if( Premium_Zone > 15.4637 )
							if( Equilibrium_Zone <= 15.142 )
								ret := 0.875000 // buy
							if( Equilibrium_Zone > 15.142 )
								ret := 0.000000
					if( Equilibrium_Zone > 15.1453 )
						if( Swing_High <= 15.2601 )
							if( Discount_Zone <= 14.8438 )
								ret := -0.250000
							if( Discount_Zone > 14.8438 )
								ret := 0.000000
						if( Swing_High > 15.2601 )
							if( Premium_Zone <= 15.5649 )
								ret := -0.793103 // sell
							if( Premium_Zone > 15.5649 )
								ret := 0.000000
				if( Premium_Zone > 15.5923 )
					if( Order_Block_High <= 15.5143 )
						if( atr <= 0.795 )
							if( Discount_Zone <= 14.8242 )
								ret := 0.777778 // buy
							if( Discount_Zone > 14.8242 )
								ret := 0.435294
						if( atr > 0.795 )
							ret := -1.000000 // sell
					if( Order_Block_High > 15.5143 )
						if( Discount_Zone <= 14.8571 )
							if( Order_Block_High <= 15.5431 )
								ret := 0.000000
							if( Order_Block_High > 15.5431 )
								ret := -0.842105 // sell
						if( Discount_Zone > 14.8571 )
							if( Swing_High <= 15.5777 )
								ret := 0.000000
							if( Swing_High > 15.5777 )
								ret := 0.750000 // buy
			if( Discount_Zone > 14.8796 )
				if( Swing_High <= 17.2646 )
					if( Equilibrium_Zone <= 15.3295 )
						if( Swing_High <= 15.31 )
							if( Internal_Swing_High <= 15.294 )
								ret := -0.058824
							if( Internal_Swing_High > 15.294 )
								ret := 0.423077
						if( Swing_High > 15.31 )
							if( Premium_Zone <= 15.6119 )
								ret := -0.659259
							if( Premium_Zone > 15.6119 )
								ret := 0.176471
					if( Equilibrium_Zone > 15.3295 )
						if( atr <= 0.649624 )
							if( Internal_Swing_High <= 16.8395 )
								ret := -0.026673
							if( Internal_Swing_High > 16.8395 )
								ret := 0.156379
						if( atr > 0.649624 )
							if( Premium_Zone <= 16.4415 )
								ret := 0.769231 // buy
							if( Premium_Zone > 16.4415 )
								ret := -0.379310
				if( Swing_High > 17.2646 )
					if( Discount_Zone <= 16.4353 )
						if( Internal_Swing_High <= 17.305 )
							ret := -0.250000
						if( Internal_Swing_High > 17.305 )
							ret := -1.000000 // sell
					if( Discount_Zone > 16.4353 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_SNAP_1Min_26d90bb4(atr, FVG_UpInt, Bullish_CHoCHInt, Discount_Zone, Swing_High, FVG_DownInt, Internal_Swing_Low, Order_Block_Low, Bearish_CHoCHInt, Bearish_BOSInt, Equilibrium_Zone, Order_Block_High, Internal_Swing_High, Swing_Low, Premium_Zone, Bullish_BOSInt)

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


