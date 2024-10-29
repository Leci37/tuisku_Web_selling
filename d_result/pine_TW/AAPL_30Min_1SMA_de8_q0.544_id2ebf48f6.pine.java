//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: AAPL_30Min_1SMA_2ebf48f6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_1SMA_2ebf48f6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_2ebf48f6(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Swing_High <= 381.104 )
		if( Discount_Zone <= 145.615 )
			if( Order_Block_High <= 120.841 )
				if( atr <= 11.9795 )
					if( Swing_Low <= 144.506 )
						if( Premium_Zone <= 140.957 )
							if( Premium_Zone <= 139.644 )
								if( Swing_Low <= 95.3195 )
									ret := 0.063037
								if( Swing_Low > 95.3195 )
									ret := 0.234332
							if( Premium_Zone > 139.644 )
								if( Discount_Zone <= 124.573 )
									ret := -0.345029
								if( Discount_Zone > 124.573 )
									ret := -0.031818
						if( Premium_Zone > 140.957 )
							if( atr <= 10.602 )
								if( Discount_Zone <= 135.237 )
									ret := 0.209082
								if( Discount_Zone > 135.237 )
									ret := 0.063975
							if( atr > 10.602 )
								if( Internal_Swing_Low <= 158.848 )
									ret := 0.268576
								if( Internal_Swing_Low > 158.848 )
									ret := -0.750000 // sell
					if( Swing_Low > 144.506 )
						if( Equilibrium_Zone <= 148.754 )
							if( Premium_Zone <= 154.021 )
								if( Internal_Swing_Low <= 145 )
									ret := -0.750000 // sell
								if( Internal_Swing_Low > 145 )
									ret := 0.200000
							if( Premium_Zone > 154.021 )
								if( Internal_Swing_Low <= 146.161 )
									ret := -0.547619
								if( Internal_Swing_Low > 146.161 )
									ret := -0.923077 // sell
						if( Equilibrium_Zone > 148.754 )
							if( Internal_Swing_Low <= 147.394 )
								if( Discount_Zone <= 143.034 )
									ret := 0.346154
								if( Discount_Zone > 143.034 )
									ret := 1.000000 // buy
							if( Internal_Swing_Low > 147.394 )
								if( Discount_Zone <= 141.062 )
									ret := 0.750000 // buy
								if( Discount_Zone > 141.062 )
									ret := -0.203540
				if( atr > 11.9795 )
					if( atr <= 15.0444 )
						if( Equilibrium_Zone <= 153.669 )
							if( Equilibrium_Zone <= 140.62 )
								if( Equilibrium_Zone <= 120.147 )
									ret := -0.144518
								if( Equilibrium_Zone > 120.147 )
									ret := 0.102041
							if( Equilibrium_Zone > 140.62 )
								if( Premium_Zone <= 155.044 )
									ret := -0.682927
								if( Premium_Zone > 155.044 )
									ret := -0.235031
						if( Equilibrium_Zone > 153.669 )
							if( Equilibrium_Zone <= 156.71 )
								if( Equilibrium_Zone <= 155.337 )
									ret := 0.189189
								if( Equilibrium_Zone > 155.337 )
									ret := 0.676471
							if( Equilibrium_Zone > 156.71 )
								if( Discount_Zone <= 143.71 )
									ret := -0.538462
								if( Discount_Zone > 143.71 )
									ret := 0.085393
					if( atr > 15.0444 )
						if( Swing_High <= 15.9665 )
							if( Internal_Swing_High <= 148.94 )
								if( Swing_Low <= 134.525 )
									ret := 0.108049
								if( Swing_Low > 134.525 )
									ret := -0.271318
							if( Internal_Swing_High > 148.94 )
								if( atr <= 17.954 )
									ret := 0.219008
								if( atr > 17.954 )
									ret := 0.681529
						if( Swing_High > 15.9665 )
							if( Internal_Swing_High <= 169.615 )
								if( Premium_Zone <= 174.9 )
									ret := -0.296117
								if( Premium_Zone > 174.9 )
									ret := -0.837209 // sell
							if( Internal_Swing_High > 169.615 )
								if( Premium_Zone <= 183.747 )
									ret := 0.333333
								if( Premium_Zone > 183.747 )
									ret := -1.000000 // sell
			if( Order_Block_High > 120.841 )
				if( Discount_Zone <= 135.803 )
					if( Order_Block_High <= 126.489 )
						if( Order_Block_High <= 122.525 )
							if( Discount_Zone <= 115.264 )
								ret := 1.000000 // buy
							if( Discount_Zone > 115.264 )
								if( Internal_Swing_Low <= 121.003 )
									ret := 0.200000
								if( Internal_Swing_Low > 121.003 )
									ret := -0.750000 // sell
						if( Order_Block_High > 122.525 )
							if( atr <= 11.2733 )
								if( Order_Block_Low <= 123.669 )
									ret := 0.925000 // buy
								if( Order_Block_Low > 123.669 )
									ret := 0.545455
							if( atr > 11.2733 )
								ret := -0.428571
					if( Order_Block_High > 126.489 )
						if( Swing_High <= 130.934 )
							if( atr <= 17.0504 )
								if( Premium_Zone <= 161.309 )
									ret := -0.106742
								if( Premium_Zone > 161.309 )
									ret := -0.862069 // sell
							if( atr > 17.0504 )
								if( Equilibrium_Zone <= 142.271 )
									ret := 0.200000
								if( Equilibrium_Zone > 142.271 )
									ret := 0.857143 // buy
						if( Swing_High > 130.934 )
							if( Premium_Zone <= 146.868 )
								if( Equilibrium_Zone <= 136.262 )
									ret := 0.344262
								if( Equilibrium_Zone > 136.262 )
									ret := 0.860465 // buy
							if( Premium_Zone > 146.868 )
								if( Premium_Zone <= 152.744 )
									ret := -0.619048
								if( Premium_Zone > 152.744 )
									ret := 0.204819
				if( Discount_Zone > 135.803 )
					if( Internal_Swing_Low <= 139.662 )
						if( Order_Block_Low <= 163.305 )
							if( Equilibrium_Zone <= 147.01 )
								if( Premium_Zone <= 147.183 )
									ret := 0.567568
								if( Premium_Zone > 147.183 )
									ret := -0.134615
							if( Equilibrium_Zone > 147.01 )
								if( Swing_High <= 152.656 )
									ret := 0.842105 // buy
								if( Swing_High > 152.656 )
									ret := 0.412500
						if( Order_Block_Low > 163.305 )
							if( Order_Block_High <= 167.662 )
								if( Order_Block_High <= 166.436 )
									ret := -0.916667 // sell
								if( Order_Block_High > 166.436 )
									ret := -0.500000
							if( Order_Block_High > 167.662 )
								if( Internal_Swing_High <= 168.111 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 168.111 )
									ret := 0.222222
					if( Internal_Swing_Low > 139.662 )
						if( Premium_Zone <= 156.674 )
							if( Discount_Zone <= 139.763 )
								if( atr <= 5.57028 )
									ret := 0.750000 // buy
								if( atr > 5.57028 )
									ret := 1.000000 // buy
							if( Discount_Zone > 139.763 )
								if( Equilibrium_Zone <= 149.622 )
									ret := 0.444444
								if( Equilibrium_Zone > 149.622 )
									ret := 1.000000 // buy
						if( Premium_Zone > 156.674 )
							if( Discount_Zone <= 138.467 )
								if( Internal_Swing_Low <= 144.506 )
									ret := 0.000000
								if( Internal_Swing_Low > 144.506 )
									ret := -0.750000 // sell
							if( Discount_Zone > 138.467 )
								if( Order_Block_Low <= 147.359 )
									ret := 0.200000
								if( Order_Block_Low > 147.359 )
									ret := 0.727273 // buy
		if( Discount_Zone > 145.615 )
			if( Discount_Zone <= 264.568 )
				if( Equilibrium_Zone <= 285.875 )
					if( atr <= 52.5786 )
						if( Discount_Zone <= 241.124 )
							if( Premium_Zone <= 307.722 )
								if( Equilibrium_Zone <= 263.643 )
									ret := 0.019558
								if( Equilibrium_Zone > 263.643 )
									ret := -0.636364
							if( Premium_Zone > 307.722 )
								if( Internal_Swing_Low <= 120 )
									ret := -0.563707
								if( Internal_Swing_Low > 120 )
									ret := -0.094017
						if( Discount_Zone > 241.124 )
							if( Premium_Zone <= 301.144 )
								if( Internal_Swing_Low <= 267.063 )
									ret := 0.171498
								if( Internal_Swing_Low > 267.063 )
									ret := -0.560976
							if( Premium_Zone > 301.144 )
								if( atr <= 29.9611 )
									ret := 0.398601
								if( atr > 29.9611 )
									ret := 0.097561
					if( atr > 52.5786 )
						if( Internal_Swing_High <= 230.687 )
							if( atr <= 60.2257 )
								if( Premium_Zone <= 311.745 )
									ret := 0.804878 // buy
								if( Premium_Zone > 311.745 )
									ret := 0.246154
							if( atr > 60.2257 )
								if( Internal_Swing_High <= 112.72 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 112.72 )
									ret := 0.444444
						if( Internal_Swing_High > 230.687 )
							if( atr <= 55.67 )
								if( Internal_Swing_High <= 256.18 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 256.18 )
									ret := 0.400000
							if( atr > 55.67 )
								if( Premium_Zone <= 296.62 )
									ret := 0.333333
								if( Premium_Zone > 296.62 )
									ret := -0.566667
				if( Equilibrium_Zone > 285.875 )
					if( atr <= 57.4759 )
						if( atr <= 39.5988 )
							if( Discount_Zone <= 264.072 )
								if( Premium_Zone <= 315.434 )
									ret := 0.000000
								if( Premium_Zone > 315.434 )
									ret := -0.769697 // sell
							if( Discount_Zone > 264.072 )
								if( Internal_Swing_Low <= 284.04 )
									ret := -0.466667
								if( Internal_Swing_Low > 284.04 )
									ret := 0.666667
						if( atr > 39.5988 )
							if( Internal_Swing_High <= 136.948 )
								if( atr <= 41.5096 )
									ret := 0.360000
								if( atr > 41.5096 )
									ret := -0.350649
							if( Internal_Swing_High > 136.948 )
								if( Internal_Swing_High <= 285.803 )
									ret := -0.600000
								if( Internal_Swing_High > 285.803 )
									ret := -0.947368 // sell
					if( atr > 57.4759 )
						if( Internal_Swing_High <= 268.11 )
							if( Premium_Zone <= 348.975 )
								ret := 1.000000 // buy
							if( Premium_Zone > 348.975 )
								if( Internal_Swing_Low <= 128.565 )
									ret := -0.333333
								if( Internal_Swing_Low > 128.565 )
									ret := 0.875000 // buy
						if( Internal_Swing_High > 268.11 )
							if( atr <= 60.2127 )
								if( atr <= 58.6051 )
									ret := 1.000000 // buy
								if( atr > 58.6051 )
									ret := 0.000000
							if( atr > 60.2127 )
								if( Internal_Swing_High <= 275.181 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 275.181 )
									ret := 0.750000 // buy
			if( Discount_Zone > 264.568 )
				if( Equilibrium_Zone <= 472.826 )
					if( Premium_Zone <= 330.78 )
						if( Swing_High <= 289.806 )
							if( atr <= 19.8784 )
								if( atr <= 18.9686 )
									ret := 0.262662
								if( atr > 18.9686 )
									ret := -0.070588
							if( atr > 19.8784 )
								if( Internal_Swing_High <= 314.699 )
									ret := 0.577236
								if( Internal_Swing_High > 314.699 )
									ret := -0.416667
						if( Swing_High > 289.806 )
							if( Swing_High <= 312.315 )
								if( atr <= 19.6215 )
									ret := -0.064516
								if( atr > 19.6215 )
									ret := -0.509804
							if( Swing_High > 312.315 )
								if( Bullish_BOSInt <= 0.5 )
									ret := 0.406780
								if( Bullish_BOSInt > 0.5 )
									ret := -0.210526
					if( Premium_Zone > 330.78 )
						if( Discount_Zone <= 304.112 )
							if( atr <= 18.979 )
								if( Internal_Swing_Low <= 319.019 )
									ret := -0.569892
								if( Internal_Swing_Low > 319.019 )
									ret := 0.062500
							if( atr > 18.979 )
								if( Equilibrium_Zone <= 306.954 )
									ret := -0.393258
								if( Equilibrium_Zone > 306.954 )
									ret := 0.056569
						if( Discount_Zone > 304.112 )
							if( Equilibrium_Zone <= 452.755 )
								if( atr <= 78.3906 )
									ret := 0.148770
								if( atr > 78.3906 )
									ret := -0.627451
							if( Equilibrium_Zone > 452.755 )
								if( Internal_Swing_High <= 500.839 )
									ret := 0.816092 // buy
								if( Internal_Swing_High > 500.839 )
									ret := -0.400000
				if( Equilibrium_Zone > 472.826 )
					if( Discount_Zone <= 449.565 )
						if( Internal_Swing_Low <= 501.156 )
							if( Discount_Zone <= 445.626 )
								if( atr <= 57.0756 )
									ret := -0.888889 // sell
								if( atr > 57.0756 )
									ret := -0.203390
							if( Discount_Zone > 445.626 )
								if( Equilibrium_Zone <= 501.417 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 501.417 )
									ret := 0.000000
						if( Internal_Swing_Low > 501.156 )
							if( Internal_Swing_Low <= 503.185 )
								ret := -1.000000 // sell
							if( Internal_Swing_Low > 503.185 )
								ret := -0.600000
					if( Discount_Zone > 449.565 )
						if( Internal_Swing_Low <= 249.155 )
							if( Discount_Zone <= 450.758 )
								if( Discount_Zone <= 450.613 )
									ret := -1.000000 // sell
								if( Discount_Zone > 450.613 )
									ret := -0.750000 // sell
							if( Discount_Zone > 450.758 )
								ret := -1.000000 // sell
						if( Internal_Swing_Low > 249.155 )
							ret := -0.500000
	if( Swing_High > 381.104 )
		if( Order_Block_Low <= 451.655 )
			if( Internal_Swing_High <= 415.86 )
				if( Equilibrium_Zone <= 392.383 )
					if( Order_Block_Low <= 390.605 )
						if( Discount_Zone <= 342.489 )
							ret := -0.750000 // sell
						if( Discount_Zone > 342.489 )
							if( Swing_High <= 383.09 )
								if( Order_Block_High <= 190.905 )
									ret := 0.750000 // buy
								if( Order_Block_High > 190.905 )
									ret := 0.000000
							if( Swing_High > 383.09 )
								if( Premium_Zone <= 427.705 )
									ret := 0.883721 // buy
								if( Premium_Zone > 427.705 )
									ret := 0.500000
					if( Order_Block_Low > 390.605 )
						ret := -0.250000
				if( Equilibrium_Zone > 392.383 )
					ret := -1.000000 // sell
			if( Internal_Swing_High > 415.86 )
				if( Equilibrium_Zone <= 449.225 )
					if( Premium_Zone <= 465.659 )
						if( atr <= 62.35 )
							ret := 1.000000 // buy
						if( atr > 62.35 )
							ret := 0.600000
					if( Premium_Zone > 465.659 )
						if( Premium_Zone <= 490.039 )
							ret := 1.000000 // buy
						if( Premium_Zone > 490.039 )
							ret := 0.750000 // buy
				if( Equilibrium_Zone > 449.225 )
					if( Swing_High <= 465.234 )
						ret := 0.250000
					if( Swing_High > 465.234 )
						if( Discount_Zone <= 425.139 )
							if( Discount_Zone <= 424.308 )
								ret := 0.571429
							if( Discount_Zone > 424.308 )
								ret := 1.000000 // buy
						if( Discount_Zone > 425.139 )
							ret := 0.250000
		if( Order_Block_Low > 451.655 )
			if( Discount_Zone <= 425.975 )
				if( Swing_High <= 475.239 )
					if( Discount_Zone <= 424.249 )
						ret := -0.250000
					if( Discount_Zone > 424.249 )
						if( Discount_Zone <= 425.39 )
							ret := -1.000000 // sell
						if( Discount_Zone > 425.39 )
							ret := -0.750000 // sell
				if( Swing_High > 475.239 )
					if( Discount_Zone <= 422.793 )
						ret := -0.500000
					if( Discount_Zone > 422.793 )
						ret := 1.000000 // buy
			if( Discount_Zone > 425.975 )
				if( Order_Block_Low <= 463.267 )
					ret := 0.500000
				if( Order_Block_Low > 463.267 )
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
float op_operation = decision_tree_0_AAPL_30Min_2ebf48f6(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)

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


