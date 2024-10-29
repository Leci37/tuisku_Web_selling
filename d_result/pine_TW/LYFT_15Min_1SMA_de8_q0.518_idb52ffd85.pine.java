//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: LYFT_15Min_1SMA_b52ffd85 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_15Min_1SMA_b52ffd85", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_15Min_b52ffd85(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Equilibrium_Zone <= 10.0694 )
		if( Internal_Swing_High <= 10.4158 )
			if( Swing_High <= 8.39818 )
				if( Equilibrium_Zone <= 9.93284 )
					if( Discount_Zone <= 8.7612 )
						if( Internal_Swing_High <= 8.32967 )
							if( Premium_Zone <= 9.2825 )
								if( atr <= 0.765 )
									ret := -0.052349
								if( atr > 0.765 )
									ret := 0.265823
							if( Premium_Zone > 9.2825 )
								if( atr <= 1.22613 )
									ret := 0.374865
								if( atr > 1.22613 )
									ret := 0.102240
						if( Internal_Swing_High > 8.32967 )
							if( Premium_Zone <= 9.06 )
								if( Internal_Swing_High <= 8.39185 )
									ret := -0.347826
								if( Internal_Swing_High > 8.39185 )
									ret := -0.900000 // sell
							if( Premium_Zone > 9.06 )
								if( Internal_Swing_Low <= 9.42993 )
									ret := -0.049462
								if( Internal_Swing_Low > 9.42993 )
									ret := 0.645161
					if( Discount_Zone > 8.7612 )
						if( Internal_Swing_Low <= 9.96079 )
							if( Discount_Zone <= 8.86845 )
								if( Discount_Zone <= 8.84297 )
									ret := -0.105442
								if( Discount_Zone > 8.84297 )
									ret := -0.954545 // sell
							if( Discount_Zone > 8.86845 )
								if( Premium_Zone <= 10.8386 )
									ret := 0.013233
								if( Premium_Zone > 10.8386 )
									ret := 0.396552
						if( Internal_Swing_Low > 9.96079 )
							if( atr <= 0.576536 )
								ret := -0.800000 // sell
							if( atr > 0.576536 )
								if( Equilibrium_Zone <= 9.88778 )
									ret := 0.307692
								if( Equilibrium_Zone > 9.88778 )
									ret := -0.402597
				if( Equilibrium_Zone > 9.93284 )
					if( Premium_Zone <= 10.56 )
						if( Premium_Zone <= 10.5186 )
							if( atr <= 0.50156 )
								ret := -0.411765
							if( atr > 0.50156 )
								if( Discount_Zone <= 9.43 )
									ret := -0.076923
								if( Discount_Zone > 9.43 )
									ret := 0.000000
						if( Premium_Zone > 10.5186 )
							if( Discount_Zone <= 9.43315 )
								ret := -1.000000 // sell
							if( Discount_Zone > 9.43315 )
								ret := -0.680000
					if( Premium_Zone > 10.56 )
						if( atr <= 0.949609 )
							if( Equilibrium_Zone <= 9.98885 )
								if( Order_Block_High <= 9.80575 )
									ret := 0.741071 // buy
								if( Order_Block_High > 9.80575 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 9.98885 )
								if( Internal_Swing_Low <= 9.93098 )
									ret := 0.308772
								if( Internal_Swing_Low > 9.93098 )
									ret := 0.776119 // buy
						if( atr > 0.949609 )
							if( Discount_Zone <= 7.7125 )
								if( Internal_Swing_High <= 4.41287 )
									ret := 0.900000 // buy
								if( Internal_Swing_High > 4.41287 )
									ret := 0.750000 // buy
							if( Discount_Zone > 7.7125 )
								ret := -0.206186
			if( Swing_High > 8.39818 )
				if( Equilibrium_Zone <= 9.78517 )
					if( atr <= 1.27478 )
						if( FVG_UpInt <= 0.5 )
							if( Swing_High <= 9.15907 )
								if( atr <= 1.04295 )
									ret := 0.457944
								if( atr > 1.04295 )
									ret := -0.545455
							if( Swing_High > 9.15907 )
								if( Order_Block_High <= 10.0053 )
									ret := 0.726496 // buy
								if( Order_Block_High > 10.0053 )
									ret := 1.000000 // buy
						if( FVG_UpInt > 0.5 )
							ret := -0.047619
					if( atr > 1.27478 )
						if( Order_Block_High <= 9.28724 )
							if( Internal_Swing_High <= 9.67467 )
								if( Swing_High <= 9.44984 )
									ret := -0.150000
								if( Swing_High > 9.44984 )
									ret := -0.848485 // sell
							if( Internal_Swing_High > 9.67467 )
								if( Swing_High <= 9.845 )
									ret := 1.000000 // buy
								if( Swing_High > 9.845 )
									ret := 0.828571 // buy
						if( Order_Block_High > 9.28724 )
							ret := -0.315789
				if( Equilibrium_Zone > 9.78517 )
					if( Internal_Swing_High <= 10.3146 )
						if( Discount_Zone <= 8.7125 )
							ret := 1.000000 // buy
						if( Discount_Zone > 8.7125 )
							if( Order_Block_High <= 5.02 )
								if( Discount_Zone <= 9.1876 )
									ret := -0.738095 // sell
								if( Discount_Zone > 9.1876 )
									ret := 0.650000
							if( Order_Block_High > 5.02 )
								ret := -0.153846
					if( Internal_Swing_High > 10.3146 )
						if( Discount_Zone <= 9.11448 )
							if( Equilibrium_Zone <= 9.9025 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 9.9025 )
								ret := -0.500000
						if( Discount_Zone > 9.11448 )
							ret := 0.416667
		if( Internal_Swing_High > 10.4158 )
			if( Discount_Zone <= 7.47554 )
				ret := -0.741379 // sell
			if( Discount_Zone > 7.47554 )
				if( Equilibrium_Zone <= 9.66 )
					ret := -0.615385
				if( Equilibrium_Zone > 9.66 )
					if( Premium_Zone <= 11.2197 )
						ret := 0.222222
					if( Premium_Zone > 11.2197 )
						if( Premium_Zone <= 11.5162 )
							ret := -0.500000
						if( Premium_Zone > 11.5162 )
							ret := -0.111111
	if( Equilibrium_Zone > 10.0694 )
		if( Internal_Swing_Low <= 10.22 )
			if( Equilibrium_Zone <= 72.3834 )
				if( Discount_Zone <= 7.82069 )
					if( atr <= 8.55019 )
						if( Equilibrium_Zone <= 10.7224 )
							if( Premium_Zone <= 17.5088 )
								if( Discount_Zone <= 7.77124 )
									ret := 0.848101 // buy
								if( Discount_Zone > 7.77124 )
									ret := 0.428571
							if( Premium_Zone > 17.5088 )
								ret := 0.333333
						if( Equilibrium_Zone > 10.7224 )
							if( Swing_High <= 17.475 )
								ret := 0.017699
							if( Swing_High > 17.475 )
								ret := 0.900000 // buy
					if( atr > 8.55019 )
						if( atr <= 9.07802 )
							ret := 0.916667 // buy
						if( atr > 9.07802 )
							ret := 1.000000 // buy
				if( Discount_Zone > 7.82069 )
					if( atr <= 6.02039 )
						if( Premium_Zone <= 10.673 )
							if( Internal_Swing_High <= 10.0809 )
								if( Discount_Zone <= 9.52182 )
									ret := 1.000000 // buy
								if( Discount_Zone > 9.52182 )
									ret := 0.800000 // buy
							if( Internal_Swing_High > 10.0809 )
								if( Discount_Zone <= 9.57181 )
									ret := 0.000000
								if( Discount_Zone > 9.57181 )
									ret := 1.000000 // buy
						if( Premium_Zone > 10.673 )
							if( Order_Block_Low <= 56.315 )
								if( Order_Block_High <= 52.48 )
									ret := -0.032923
								if( Order_Block_High > 52.48 )
									ret := -0.787234 // sell
							if( Order_Block_Low > 56.315 )
								if( Order_Block_High <= 61.3888 )
									ret := 0.637931
								if( Order_Block_High > 61.3888 )
									ret := -0.131579
					if( atr > 6.02039 )
						if( atr <= 6.87645 )
							if( Equilibrium_Zone <= 26.1824 )
								if( Premium_Zone <= 29.0125 )
									ret := 0.516129
								if( Premium_Zone > 29.0125 )
									ret := 0.850932 // buy
							if( Equilibrium_Zone > 26.1824 )
								if( Premium_Zone <= 32.7138 )
									ret := -0.725806 // sell
								if( Premium_Zone > 32.7138 )
									ret := 0.133533
						if( atr > 6.87645 )
							if( atr <= 8.14767 )
								if( Internal_Swing_High <= 28.895 )
									ret := -0.040541
								if( Internal_Swing_High > 28.895 )
									ret := -0.329060
							if( atr > 8.14767 )
								if( Order_Block_High <= 53.5958 )
									ret := 0.031360
								if( Order_Block_High > 53.5958 )
									ret := -0.680000
			if( Equilibrium_Zone > 72.3834 )
				if( atr <= 7.46298 )
					if( Internal_Swing_High <= 35.44 )
						ret := -0.526316
					if( Internal_Swing_High > 35.44 )
						ret := -1.000000 // sell
				if( atr > 7.46298 )
					ret := -1.000000 // sell
		if( Internal_Swing_Low > 10.22 )
			if( Internal_Swing_High <= 57.8183 )
				if( Swing_Low <= 11.42 )
					if( Premium_Zone <= 11.9145 )
						if( Swing_High <= 10.5737 )
							if( Equilibrium_Zone <= 10.2564 )
								ret := 0.344262
							if( Equilibrium_Zone > 10.2564 )
								if( Discount_Zone <= 9.98723 )
									ret := -0.085795
								if( Discount_Zone > 9.98723 )
									ret := -0.310345
						if( Swing_High > 10.5737 )
							if( Premium_Zone <= 11.6846 )
								ret := -0.769231 // sell
							if( Premium_Zone > 11.6846 )
								ret := -0.923077 // sell
					if( Premium_Zone > 11.9145 )
						if( atr <= 1.85313 )
							if( Equilibrium_Zone <= 10.5741 )
								if( Swing_High <= 5.57788 )
									ret := 0.574803
								if( Swing_High > 5.57788 )
									ret := 0.923077 // buy
							if( Equilibrium_Zone > 10.5741 )
								if( Equilibrium_Zone <= 29.6508 )
									ret := 0.118836
								if( Equilibrium_Zone > 29.6508 )
									ret := -0.342342
						if( atr > 1.85313 )
							if( Premium_Zone <= 12.7999 )
								ret := 0.916667 // buy
							if( Premium_Zone > 12.7999 )
								if( Discount_Zone <= 12.3956 )
									ret := 0.163380
								if( Discount_Zone > 12.3956 )
									ret := 0.026591
				if( Swing_Low > 11.42 )
					if( atr <= 0.616208 )
						if( Order_Block_High <= 5.95539 )
							if( atr <= 0.565 )
								ret := -0.437500
							if( atr > 0.565 )
								ret := -0.866667 // sell
						if( Order_Block_High > 5.95539 )
							ret := -0.863636 // sell
					if( atr > 0.616208 )
						if( Internal_Swing_Low <= 12.1361 )
							if( atr <= 2.23942 )
								if( Bearish_BOSInt <= 0.5 )
									ret := -0.780142 // sell
								if( Bearish_BOSInt > 0.5 )
									ret := -0.073171
							if( atr > 2.23942 )
								if( Discount_Zone <= 9.24269 )
									ret := -1.000000 // sell
								if( Discount_Zone > 9.24269 )
									ret := 0.148148
						if( Internal_Swing_Low > 12.1361 )
							if( Discount_Zone <= 12.0971 )
								ret := 0.381546
							if( Discount_Zone > 12.0971 )
								if( Internal_Swing_Low <= 16.2175 )
									ret := -0.225501
								if( Internal_Swing_Low > 16.2175 )
									ret := -0.021124
			if( Internal_Swing_High > 57.8183 )
				if( Swing_High <= 60.5039 )
					if( Discount_Zone <= 54.8485 )
						if( Premium_Zone <= 65.6897 )
							if( Equilibrium_Zone <= 57.72 )
								if( Equilibrium_Zone <= 57.4009 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 57.4009 )
									ret := -0.888889 // sell
							if( Equilibrium_Zone > 57.72 )
								ret := -0.733333 // sell
						if( Premium_Zone > 65.6897 )
							if( Discount_Zone <= 51.4062 )
								ret := 0.461538
							if( Discount_Zone > 51.4062 )
								if( Equilibrium_Zone <= 61.9016 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 61.9016 )
									ret := -0.416667
					if( Discount_Zone > 54.8485 )
						if( atr <= 5.22997 )
							if( Premium_Zone <= 68.72 )
								if( Discount_Zone <= 57.1837 )
									ret := -0.291667
								if( Discount_Zone > 57.1837 )
									ret := 0.181818
							if( Premium_Zone > 68.72 )
								ret := -0.750000 // sell
						if( atr > 5.22997 )
							if( Equilibrium_Zone <= 63.2719 )
								ret := -0.363636
							if( Equilibrium_Zone > 63.2719 )
								ret := 0.440000
				if( Swing_High > 60.5039 )
					if( Equilibrium_Zone <= 59.2117 )
						ret := -0.950000 // sell
					if( Equilibrium_Zone > 59.2117 )
						ret := -0.181818
	
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
float op_operation = decision_tree_0_LYFT_15Min_b52ffd85(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


