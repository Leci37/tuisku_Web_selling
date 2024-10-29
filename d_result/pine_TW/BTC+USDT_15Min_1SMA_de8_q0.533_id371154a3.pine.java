//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: BTCUSDT_15Min_1SMA_371154a3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_1SMA_371154a3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_371154a3(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Internal_Swing_Low <= 3711.61 )
		if( Internal_Swing_High <= 70860.2 )
			if( Discount_Zone <= 38469 )
				if( Premium_Zone <= 29804.6 )
					if( Equilibrium_Zone <= 28341.8 )
						if( Internal_Swing_High <= 28228 )
							if( Equilibrium_Zone <= 19952.2 )
								if( Internal_Swing_High <= 18476.5 )
									ret := 0.017365
								if( Internal_Swing_High > 18476.5 )
									ret := 0.116279
							if( Equilibrium_Zone > 19952.2 )
								if( Internal_Swing_High <= 22198.8 )
									ret := -0.037801
								if( Internal_Swing_High > 22198.8 )
									ret := 0.036651
						if( Internal_Swing_High > 28228 )
							if( atr <= 670.481 )
								if( Premium_Zone <= 14224.5 )
									ret := -0.012346
								if( Premium_Zone > 14224.5 )
									ret := 0.548387
							if( atr > 670.481 )
								if( Internal_Swing_High <= 28703.9 )
									ret := -0.428571
								if( Internal_Swing_High > 28703.9 )
									ret := 0.444444
					if( Equilibrium_Zone > 28341.8 )
						if( Discount_Zone <= 28588.8 )
							if( Equilibrium_Zone <= 39601.4 )
								if( Equilibrium_Zone <= 28809.3 )
									ret := 0.132231
								if( Equilibrium_Zone > 28809.3 )
									ret := 0.630952
							if( Equilibrium_Zone > 39601.4 )
								ret := -0.700000 // sell
						if( Discount_Zone > 28588.8 )
							if( Swing_High <= 29354.1 )
								if( Swing_High <= 29195.9 )
									ret := 0.086400
								if( Swing_High > 29195.9 )
									ret := -0.571429
							if( Swing_High > 29354.1 )
								if( Discount_Zone <= 28888.9 )
									ret := 1.000000 // buy
								if( Discount_Zone > 28888.9 )
									ret := 0.000000
				if( Premium_Zone > 29804.6 )
					if( Premium_Zone <= 30172.3 )
						if( Equilibrium_Zone <= 28899.8 )
							if( Equilibrium_Zone <= 27200.2 )
								if( Premium_Zone <= 30017.7 )
									ret := 0.346154
								if( Premium_Zone > 30017.7 )
									ret := -0.916667 // sell
							if( Equilibrium_Zone > 27200.2 )
								if( Internal_Swing_High <= 13259.5 )
									ret := -0.376321
								if( Internal_Swing_High > 13259.5 )
									ret := -0.613260
						if( Equilibrium_Zone > 28899.8 )
							if( Discount_Zone <= 28571.9 )
								if( Internal_Swing_High <= 29432.3 )
									ret := 0.111765
								if( Internal_Swing_High > 29432.3 )
									ret := 0.681818
							if( Discount_Zone > 28571.9 )
								if( atr <= 476.22 )
									ret := 0.025000
								if( atr > 476.22 )
									ret := -0.234783
					if( Premium_Zone > 30172.3 )
						if( Order_Block_Low <= 30719.7 )
							if( Equilibrium_Zone <= 27407.3 )
								if( atr <= 7002.32 )
									ret := -0.401515
								if( atr > 7002.32 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 27407.3 )
								if( Discount_Zone <= 24170.2 )
									ret := 0.433862
								if( Discount_Zone > 24170.2 )
									ret := -0.053765
						if( Order_Block_Low > 30719.7 )
							if( Discount_Zone <= 35816.9 )
								if( Equilibrium_Zone <= 36443.8 )
									ret := -0.485714
								if( Equilibrium_Zone > 36443.8 )
									ret := -0.954545 // sell
							if( Discount_Zone > 35816.9 )
								if( atr <= 1520.24 )
									ret := 0.687500
								if( atr > 1520.24 )
									ret := -1.000000 // sell
			if( Discount_Zone > 38469 )
				if( Equilibrium_Zone <= 62409.8 )
					if( Discount_Zone <= 39641.1 )
						if( Internal_Swing_High <= 43029.9 )
							if( Swing_High <= 42743.7 )
								if( Premium_Zone <= 43660 )
									ret := 0.246819
								if( Premium_Zone > 43660 )
									ret := 0.420844
							if( Swing_High > 42743.7 )
								ret := -0.590909
						if( Internal_Swing_High > 43029.9 )
							if( atr <= 2792.83 )
								ret := -0.794118 // sell
							if( atr > 2792.83 )
								if( Premium_Zone <= 45747.8 )
									ret := 0.444444
								if( Premium_Zone > 45747.8 )
									ret := -0.574074
					if( Discount_Zone > 39641.1 )
						if( Premium_Zone <= 42398.3 )
							if( Discount_Zone <= 40234.1 )
								ret := -0.200000
							if( Discount_Zone > 40234.1 )
								if( Equilibrium_Zone <= 41688.9 )
									ret := -0.818182 // sell
								if( Equilibrium_Zone > 41688.9 )
									ret := -0.400000
						if( Premium_Zone > 42398.3 )
							if( Discount_Zone <= 60564.9 )
								if( atr <= 9482.28 )
									ret := 0.024674
								if( atr > 9482.28 )
									ret := 0.318750
							if( Discount_Zone > 60564.9 )
								if( atr <= 1469.65 )
									ret := 0.406250
								if( atr > 1469.65 )
									ret := 0.800000 // buy
				if( Equilibrium_Zone > 62409.8 )
					if( Swing_High <= 64964.8 )
						if( Discount_Zone <= 56241 )
							if( Discount_Zone <= 55580.1 )
								ret := -0.068966
							if( Discount_Zone > 55580.1 )
								if( Premium_Zone <= 70502.6 )
									ret := 0.857143 // buy
								if( Premium_Zone > 70502.6 )
									ret := 1.000000 // buy
						if( Discount_Zone > 56241 )
							if( Premium_Zone <= 66954.5 )
								if( Equilibrium_Zone <= 63970.1 )
									ret := -0.108820
								if( Equilibrium_Zone > 63970.1 )
									ret := -0.428030
							if( Premium_Zone > 66954.5 )
								if( Swing_High <= 64326.5 )
									ret := -0.006970
								if( Swing_High > 64326.5 )
									ret := -0.735849 // sell
					if( Swing_High > 64964.8 )
						if( Swing_High <= 66636.2 )
							if( Order_Block_High <= 66108.5 )
								if( Internal_Swing_High <= 66158.7 )
									ret := 0.244755
								if( Internal_Swing_High > 66158.7 )
									ret := 0.698413
							if( Order_Block_High > 66108.5 )
								ret := -0.777778 // sell
						if( Swing_High > 66636.2 )
							if( Premium_Zone <= 66311.8 )
								ret := 1.000000 // buy
							if( Premium_Zone > 66311.8 )
								if( atr <= 2551.5 )
									ret := -0.335484
								if( atr > 2551.5 )
									ret := 0.006289
		if( Internal_Swing_High > 70860.2 )
			if( Premium_Zone <= 75686.8 )
				if( Order_Block_High <= 71045.9 )
					if( Order_Block_Low <= 35191.1 )
						if( Discount_Zone <= 65858.1 )
							if( Swing_High <= 70943.1 )
								if( Equilibrium_Zone <= 69651.6 )
									ret := -0.745098 // sell
								if( Equilibrium_Zone > 69651.6 )
									ret := -0.307692
							if( Swing_High > 70943.1 )
								if( atr <= 4462.33 )
									ret := -0.727273 // sell
								if( atr > 4462.33 )
									ret := -0.942857 // sell
						if( Discount_Zone > 65858.1 )
							if( Swing_High <= 71680.6 )
								if( Equilibrium_Zone <= 69679.8 )
									ret := 0.000000
								if( Equilibrium_Zone > 69679.8 )
									ret := -0.505155
							if( Swing_High > 71680.6 )
								ret := 0.600000
					if( Order_Block_Low > 35191.1 )
						ret := -0.727273 // sell
				if( Order_Block_High > 71045.9 )
					if( atr <= 3746.27 )
						ret := 0.777778 // buy
					if( atr > 3746.27 )
						if( Internal_Swing_High <= 71621.5 )
							ret := -1.000000 // sell
						if( Internal_Swing_High > 71621.5 )
							ret := -0.400000
			if( Premium_Zone > 75686.8 )
				if( atr <= 4930.67 )
					if( Discount_Zone <= 68711.2 )
						if( Internal_Swing_High <= 72280.3 )
							ret := -0.500000
						if( Internal_Swing_High > 72280.3 )
							ret := -0.800000 // sell
					if( Discount_Zone > 68711.2 )
						ret := 0.050000
				if( atr > 4930.67 )
					if( Internal_Swing_High <= 71386.7 )
						ret := 0.875000 // buy
					if( Internal_Swing_High > 71386.7 )
						ret := -0.111111
	if( Internal_Swing_Low > 3711.61 )
		if( Internal_Swing_Low <= 16078.6 )
			if( Discount_Zone <= 13537.9 )
				ret := 1.000000 // buy
			if( Discount_Zone > 13537.9 )
				if( Discount_Zone <= 15149.6 )
					if( Internal_Swing_Low <= 15783.9 )
						ret := 0.470588
					if( Internal_Swing_Low > 15783.9 )
						ret := -0.166667
				if( Discount_Zone > 15149.6 )
					if( Internal_Swing_Low <= 15953.2 )
						if( Internal_Swing_Low <= 15853.7 )
							ret := 0.800000 // buy
						if( Internal_Swing_Low > 15853.7 )
							ret := 0.960000 // buy
					if( Internal_Swing_Low > 15953.2 )
						ret := 0.529412
		if( Internal_Swing_Low > 16078.6 )
			if( Order_Block_Low <= 16431 )
				if( Internal_Swing_High <= 29903.3 )
					if( atr <= 2325.89 )
						if( Discount_Zone <= 62892.6 )
							if( Equilibrium_Zone <= 61305.6 )
								if( Premium_Zone <= 61036.5 )
									ret := 0.029191
								if( Premium_Zone > 61036.5 )
									ret := -0.472393
							if( Equilibrium_Zone > 61305.6 )
								if( atr <= 2293.33 )
									ret := 0.270701
								if( atr > 2293.33 )
									ret := -0.550000
						if( Discount_Zone > 62892.6 )
							if( Internal_Swing_Low <= 64188.9 )
								if( Discount_Zone <= 63188.9 )
									ret := -0.970588 // sell
								if( Discount_Zone > 63188.9 )
									ret := -0.562500
							if( Internal_Swing_Low > 64188.9 )
								if( Premium_Zone <= 70481.8 )
									ret := -0.113924
								if( Premium_Zone > 70481.8 )
									ret := -0.526066
					if( atr > 2325.89 )
						if( atr <= 2578.98 )
							if( Internal_Swing_Low <= 37181.3 )
								if( Equilibrium_Zone <= 20931.3 )
									ret := 0.341317
								if( Equilibrium_Zone > 20931.3 )
									ret := 0.675325
							if( Internal_Swing_Low > 37181.3 )
								if( Internal_Swing_Low <= 59220.9 )
									ret := -0.083333
								if( Internal_Swing_Low > 59220.9 )
									ret := 0.270202
						if( atr > 2578.98 )
							if( atr <= 2724.21 )
								if( Equilibrium_Zone <= 63105.8 )
									ret := 0.034226
								if( Equilibrium_Zone > 63105.8 )
									ret := -0.310606
							if( atr > 2724.21 )
								if( atr <= 10858.3 )
									ret := 0.079662
								if( atr > 10858.3 )
									ret := -0.460000
				if( Internal_Swing_High > 29903.3 )
					if( Equilibrium_Zone <= 30320.6 )
						if( Discount_Zone <= 28673.8 )
							ret := -0.400000
						if( Discount_Zone > 28673.8 )
							if( atr <= 1321.72 )
								if( Internal_Swing_High <= 30323.5 )
									ret := -0.833333 // sell
								if( Internal_Swing_High > 30323.5 )
									ret := -0.555556
							if( atr > 1321.72 )
								ret := -1.000000 // sell
					if( Equilibrium_Zone > 30320.6 )
						if( atr <= 2319.77 )
							if( Internal_Swing_High <= 36628 )
								if( Internal_Swing_Low <= 30563.4 )
									ret := -0.050000
								if( Internal_Swing_Low > 30563.4 )
									ret := 0.702703 // buy
							if( Internal_Swing_High > 36628 )
								if( Equilibrium_Zone <= 46087.8 )
									ret := -0.571429
								if( Equilibrium_Zone > 46087.8 )
									ret := 0.444444
						if( atr > 2319.77 )
							if( Premium_Zone <= 64066.3 )
								ret := 0.000000
							if( Premium_Zone > 64066.3 )
								if( Equilibrium_Zone <= 64815.6 )
									ret := -0.602564
								if( Equilibrium_Zone > 64815.6 )
									ret := 0.076923
			if( Order_Block_Low > 16431 )
				if( Order_Block_High <= 29337.1 )
					if( Equilibrium_Zone <= 23526.8 )
						if( Order_Block_High <= 21214.6 )
							if( Swing_Low <= 18915.3 )
								if( Order_Block_Low <= 18611.2 )
									ret := 0.692308
								if( Order_Block_Low > 18611.2 )
									ret := 1.000000 // buy
							if( Swing_Low > 18915.3 )
								if( Premium_Zone <= 21759.5 )
									ret := 0.117647
								if( Premium_Zone > 21759.5 )
									ret := 0.796875 // buy
						if( Order_Block_High > 21214.6 )
							if( Internal_Swing_Low <= 22840.8 )
								if( Swing_Low <= 22409.5 )
									ret := -0.627907
								if( Swing_Low > 22409.5 )
									ret := 0.933333 // buy
							if( Internal_Swing_Low > 22840.8 )
								if( Equilibrium_Zone <= 23318.5 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 23318.5 )
									ret := -0.818182 // sell
					if( Equilibrium_Zone > 23526.8 )
						if( Internal_Swing_Low <= 27451.4 )
							if( Swing_Low <= 26859.4 )
								if( atr <= 2735.11 )
									ret := 0.694118
								if( atr > 2735.11 )
									ret := 0.176471
							if( Swing_Low > 26859.4 )
								if( Order_Block_High <= 27202.7 )
									ret := -0.666667
								if( Order_Block_High > 27202.7 )
									ret := 0.500000
						if( Internal_Swing_Low > 27451.4 )
							if( Order_Block_Low <= 28990.8 )
								if( Discount_Zone <= 27718.9 )
									ret := 0.951220 // buy
								if( Discount_Zone > 27718.9 )
									ret := 0.428571
							if( Order_Block_Low > 28990.8 )
								ret := 0.470588
				if( Order_Block_High > 29337.1 )
					if( Equilibrium_Zone <= 62682.8 )
						if( Order_Block_Low <= 54553.5 )
							if( Premium_Zone <= 42946.9 )
								if( atr <= 2978.79 )
									ret := -0.427230
								if( atr > 2978.79 )
									ret := 0.895833 // buy
							if( Premium_Zone > 42946.9 )
								if( atr <= 2965.72 )
									ret := 0.592593
								if( atr > 2965.72 )
									ret := 0.047619
						if( Order_Block_Low > 54553.5 )
							if( Discount_Zone <= 56001.6 )
								if( Equilibrium_Zone <= 59657.5 )
									ret := -0.638889
								if( Equilibrium_Zone > 59657.5 )
									ret := -1.000000 // sell
							if( Discount_Zone > 56001.6 )
								if( Order_Block_High <= 59955.1 )
									ret := 0.555556
								if( Order_Block_High > 59955.1 )
									ret := -0.743590 // sell
					if( Equilibrium_Zone > 62682.8 )
						if( Internal_Swing_Low <= 70250.2 )
							if( Premium_Zone <= 66191.4 )
								if( Discount_Zone <= 60711.6 )
									ret := 0.200000
								if( Discount_Zone > 60711.6 )
									ret := -0.222222
							if( Premium_Zone > 66191.4 )
								if( atr <= 4985.61 )
									ret := 0.656442
								if( atr > 4985.61 )
									ret := 0.195122
						if( Internal_Swing_Low > 70250.2 )
							ret := -0.869565 // sell
	
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
float op_operation = decision_tree_0_BTCUSDT_15Min_371154a3(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)

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


