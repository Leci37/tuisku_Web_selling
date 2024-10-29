//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: QCOM_1Min_1SMA_fb1ff1d5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1SMA_fb1ff1d5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_fb1ff1d5(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Discount_Zone <= 152.647 )
		if( Equilibrium_Zone <= 158.986 )
			if( Internal_Swing_Low <= 160.049 )
				if( Premium_Zone <= 165.099 )
					if( Order_Block_Low <= 157.272 )
						if( Swing_High <= 160.494 )
							if( Premium_Zone <= 162.823 )
								if( Discount_Zone <= 152.325 )
									ret := 0.299735
								if( Discount_Zone > 152.325 )
									ret := -0.483871
							if( Premium_Zone > 162.823 )
								if( Equilibrium_Zone <= 149.441 )
									ret := 0.671329
								if( Equilibrium_Zone > 149.441 )
									ret := 0.442029
						if( Swing_High > 160.494 )
							ret := -1.000000 // sell
					if( Order_Block_Low > 157.272 )
						if( Internal_Swing_High <= 159.7 )
							if( atr <= 5.54602 )
								if( Equilibrium_Zone <= 156.546 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 156.546 )
									ret := -0.625000
							if( atr > 5.54602 )
								ret := -1.000000 // sell
						if( Internal_Swing_High > 159.7 )
							ret := 0.750000 // buy
				if( Premium_Zone > 165.099 )
					if( Equilibrium_Zone <= 155.399 )
						if( Premium_Zone <= 167.667 )
							if( Internal_Swing_High <= 160.025 )
								if( atr <= 10.6942 )
									ret := -0.146341
								if( atr > 10.6942 )
									ret := 0.411960
							if( Internal_Swing_High > 160.025 )
								if( atr <= 11.8796 )
									ret := 0.636364
								if( atr > 11.8796 )
									ret := -0.777778 // sell
						if( Premium_Zone > 167.667 )
							if( Internal_Swing_Low <= 159.137 )
								if( atr <= 14.7394 )
									ret := -1.000000 // sell
								if( atr > 14.7394 )
									ret := -0.857143 // sell
							if( Internal_Swing_Low > 159.137 )
								ret := 0.200000
					if( Equilibrium_Zone > 155.399 )
						if( Equilibrium_Zone <= 158.432 )
							if( Discount_Zone <= 149.145 )
								if( Swing_Low <= 150.04 )
									ret := -0.418919
								if( Swing_Low > 150.04 )
									ret := 1.000000 // buy
							if( Discount_Zone > 149.145 )
								if( atr <= 7.44917 )
									ret := -1.000000 // sell
								if( atr > 7.44917 )
									ret := -0.968750 // sell
						if( Equilibrium_Zone > 158.432 )
							if( Swing_High <= 159.97 )
								if( Premium_Zone <= 165.401 )
									ret := 0.058824
								if( Premium_Zone > 165.401 )
									ret := 0.857143 // buy
							if( Swing_High > 159.97 )
								if( atr <= 7.60813 )
									ret := -0.782609 // sell
								if( atr > 7.60813 )
									ret := -0.200000
			if( Internal_Swing_Low > 160.049 )
				if( Internal_Swing_Low <= 163.562 )
					if( Equilibrium_Zone <= 105.036 )
						if( Internal_Swing_Low <= 161.21 )
							ret := 0.000000
						if( Internal_Swing_Low > 161.21 )
							if( Internal_Swing_Low <= 162.066 )
								ret := -0.750000 // sell
							if( Internal_Swing_Low > 162.066 )
								ret := -0.950000 // sell
					if( Equilibrium_Zone > 105.036 )
						ret := -0.428571
				if( Internal_Swing_Low > 163.562 )
					ret := -0.277778
		if( Equilibrium_Zone > 158.986 )
			if( Internal_Swing_High <= 162.708 )
				if( Premium_Zone <= 169.913 )
					if( Internal_Swing_Low <= 162.191 )
						if( Order_Block_High <= 160.919 )
							if( atr <= 7.45623 )
								if( Swing_High <= 162.245 )
									ret := 0.450331
								if( Swing_High > 162.245 )
									ret := 0.933333 // buy
							if( atr > 7.45623 )
								if( Internal_Swing_Low <= 77.9312 )
									ret := 0.683417
								if( Internal_Swing_Low > 77.9312 )
									ret := 0.883333 // buy
						if( Order_Block_High > 160.919 )
							if( Discount_Zone <= 152.064 )
								ret := 0.000000
							if( Discount_Zone > 152.064 )
								ret := -0.833333 // sell
					if( Internal_Swing_Low > 162.191 )
						if( atr <= 8.535 )
							if( Equilibrium_Zone <= 161.1 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 161.1 )
								ret := 0.000000
						if( atr > 8.535 )
							ret := 0.571429
				if( Premium_Zone > 169.913 )
					if( Equilibrium_Zone <= 160.887 )
						ret := -0.750000 // sell
					if( Equilibrium_Zone > 160.887 )
						ret := -1.000000 // sell
			if( Internal_Swing_High > 162.708 )
				if( Order_Block_High <= 163.283 )
					if( atr <= 8.43436 )
						if( Order_Block_Low <= 162.605 )
							if( Equilibrium_Zone <= 160.528 )
								ret := -0.857143 // sell
							if( Equilibrium_Zone > 160.528 )
								if( Swing_High <= 18.8907 )
									ret := 0.000000
								if( Swing_High > 18.8907 )
									ret := -0.400000
						if( Order_Block_Low > 162.605 )
							ret := 0.500000
					if( atr > 8.43436 )
						if( Internal_Swing_High <= 163.13 )
							ret := 0.714286 // buy
						if( Internal_Swing_High > 163.13 )
							if( Equilibrium_Zone <= 160.585 )
								ret := -0.250000
							if( Equilibrium_Zone > 160.585 )
								ret := 0.200000
				if( Order_Block_High > 163.283 )
					ret := -0.857143 // sell
	if( Discount_Zone > 152.647 )
		if( atr <= 7.52992 )
			if( atr <= 7.25076 )
				if( Internal_Swing_High <= 157.299 )
					if( Premium_Zone <= 210.581 )
						if( Discount_Zone <= 198.732 )
							if( Equilibrium_Zone <= 172.803 )
								if( Premium_Zone <= 176.117 )
									ret := 0.080405
								if( Premium_Zone > 176.117 )
									ret := 0.212333
							if( Equilibrium_Zone > 172.803 )
								if( Premium_Zone <= 178.252 )
									ret := -0.092668
								if( Premium_Zone > 178.252 )
									ret := 0.048565
						if( Discount_Zone > 198.732 )
							if( Swing_Low <= 200.785 )
								if( Internal_Swing_Low <= 200.658 )
									ret := 0.157870
								if( Internal_Swing_Low > 200.658 )
									ret := 0.263106
							if( Swing_Low > 200.785 )
								if( Premium_Zone <= 206.522 )
									ret := -0.698413
								if( Premium_Zone > 206.522 )
									ret := -0.031142
					if( Premium_Zone > 210.581 )
						if( Premium_Zone <= 216.393 )
							if( Discount_Zone <= 199.074 )
								if( Premium_Zone <= 212.357 )
									ret := 0.666667
								if( Premium_Zone > 212.357 )
									ret := 0.090909
							if( Discount_Zone > 199.074 )
								if( atr <= 2.37854 )
									ret := 0.095990
								if( atr > 2.37854 )
									ret := -0.143009
						if( Premium_Zone > 216.393 )
							if( Internal_Swing_Low <= 206.635 )
								if( atr <= 3.47246 )
									ret := 0.168514
								if( atr > 3.47246 )
									ret := -0.040029
							if( Internal_Swing_Low > 206.635 )
								if( Discount_Zone <= 206.969 )
									ret := 0.637931
								if( Discount_Zone > 206.969 )
									ret := 0.128378
				if( Internal_Swing_High > 157.299 )
					if( Equilibrium_Zone <= 174.413 )
						if( Equilibrium_Zone <= 173.972 )
							if( Discount_Zone <= 161.037 )
								if( Internal_Swing_High <= 164.282 )
									ret := -0.034138
								if( Internal_Swing_High > 164.282 )
									ret := -0.308072
							if( Discount_Zone > 161.037 )
								if( Internal_Swing_High <= 163.628 )
									ret := 0.491379
								if( Internal_Swing_High > 163.628 )
									ret := 0.016369
						if( Equilibrium_Zone > 173.972 )
							if( Discount_Zone <= 171.19 )
								if( atr <= 3.08743 )
									ret := 0.162162
								if( atr > 3.08743 )
									ret := -0.392857
							if( Discount_Zone > 171.19 )
								if( Internal_Swing_High <= 175.694 )
									ret := -0.720000 // sell
								if( Internal_Swing_High > 175.694 )
									ret := 0.250000
					if( Equilibrium_Zone > 174.413 )
						if( Equilibrium_Zone <= 206.898 )
							if( Internal_Swing_High <= 174.953 )
								if( Equilibrium_Zone <= 174.468 )
									ret := 0.000000
								if( Equilibrium_Zone > 174.468 )
									ret := 0.745455 // buy
							if( Internal_Swing_High > 174.953 )
								if( Discount_Zone <= 169.346 )
									ret := -0.840000 // sell
								if( Discount_Zone > 169.346 )
									ret := 0.089407
						if( Equilibrium_Zone > 206.898 )
							if( Order_Block_Low <= 212.478 )
								if( Swing_High <= 209.295 )
									ret := -0.008551
								if( Swing_High > 209.295 )
									ret := -0.209644
							if( Order_Block_Low > 212.478 )
								if( Premium_Zone <= 217.563 )
									ret := -0.400000
								if( Premium_Zone > 217.563 )
									ret := 0.508929
			if( atr > 7.25076 )
				if( Equilibrium_Zone <= 207.364 )
					if( Premium_Zone <= 207.318 )
						if( Swing_High <= 170.055 )
							if( Equilibrium_Zone <= 160.461 )
								if( Equilibrium_Zone <= 160.262 )
									ret := 0.000000
								if( Equilibrium_Zone > 160.262 )
									ret := -0.714286 // sell
							if( Equilibrium_Zone > 160.461 )
								if( Discount_Zone <= 164.927 )
									ret := 0.606218
								if( Discount_Zone > 164.927 )
									ret := 0.305085
						if( Swing_High > 170.055 )
							if( Equilibrium_Zone <= 175.194 )
								if( Swing_High <= 173.099 )
									ret := 0.000000
								if( Swing_High > 173.099 )
									ret := -1.000000 // sell
							if( Equilibrium_Zone > 175.194 )
								if( Swing_High <= 197.705 )
									ret := 0.000000
								if( Swing_High > 197.705 )
									ret := 0.500000
					if( Premium_Zone > 207.318 )
						if( Equilibrium_Zone <= 207.23 )
							if( Discount_Zone <= 199.606 )
								if( Internal_Swing_High <= 208.597 )
									ret := 0.006757
								if( Internal_Swing_High > 208.597 )
									ret := -1.000000 // sell
							if( Discount_Zone > 199.606 )
								if( Order_Block_High <= 101.795 )
									ret := -0.840909 // sell
								if( Order_Block_High > 101.795 )
									ret := 0.000000
						if( Equilibrium_Zone > 207.23 )
							if( Internal_Swing_Low <= 102.956 )
								if( Equilibrium_Zone <= 207.333 )
									ret := 0.493671
								if( Equilibrium_Zone > 207.333 )
									ret := 0.000000
							if( Internal_Swing_Low > 102.956 )
								if( Discount_Zone <= 199.925 )
									ret := -0.235294
								if( Discount_Zone > 199.925 )
									ret := 0.166667
				if( Equilibrium_Zone > 207.364 )
					if( Discount_Zone <= 207.998 )
						if( Premium_Zone <= 216.038 )
							if( Internal_Swing_High <= 210.973 )
								if( Equilibrium_Zone <= 208.492 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 208.492 )
									ret := 0.787234 // buy
							if( Internal_Swing_High > 210.973 )
								ret := 0.333333
						if( Premium_Zone > 216.038 )
							if( Equilibrium_Zone <= 211.268 )
								ret := 0.000000
							if( Equilibrium_Zone > 211.268 )
								ret := 0.833333 // buy
					if( Discount_Zone > 207.998 )
						if( Swing_High <= 225.58 )
							if( Premium_Zone <= 234.159 )
								if( Internal_Swing_Low <= 106.943 )
									ret := -0.500000
								if( Internal_Swing_Low > 106.943 )
									ret := 0.200000
							if( Premium_Zone > 234.159 )
								ret := -1.000000 // sell
						if( Swing_High > 225.58 )
							ret := 1.000000 // buy
		if( atr > 7.52992 )
			if( Internal_Swing_High <= 213.264 )
				if( atr <= 9.99049 )
					if( Discount_Zone <= 181.538 )
						if( atr <= 8.47689 )
							if( Premium_Zone <= 170.788 )
								if( Discount_Zone <= 153.756 )
									ret := -0.206612
								if( Discount_Zone > 153.756 )
									ret := 0.814815 // buy
							if( Premium_Zone > 170.788 )
								if( Discount_Zone <= 166.917 )
									ret := -0.551724
								if( Discount_Zone > 166.917 )
									ret := -0.223975
						if( atr > 8.47689 )
							if( Premium_Zone <= 183.937 )
								if( Equilibrium_Zone <= 168.395 )
									ret := -0.360000
								if( Equilibrium_Zone > 168.395 )
									ret := 0.164051
							if( Premium_Zone > 183.937 )
								if( Discount_Zone <= 164.78 )
									ret := -0.966667 // sell
								if( Discount_Zone > 164.78 )
									ret := -0.146530
					if( Discount_Zone > 181.538 )
						if( Discount_Zone <= 195.974 )
							if( Premium_Zone <= 214.451 )
								if( Discount_Zone <= 194.501 )
									ret := 0.133556
								if( Discount_Zone > 194.501 )
									ret := 0.619048
							if( Premium_Zone > 214.451 )
								if( Internal_Swing_High <= 205.84 )
									ret := 0.058824
								if( Internal_Swing_High > 205.84 )
									ret := -0.928571 // sell
						if( Discount_Zone > 195.974 )
							if( Premium_Zone <= 217.267 )
								if( Internal_Swing_Low <= 210.16 )
									ret := -0.320285
								if( Internal_Swing_Low > 210.16 )
									ret := 0.500000
							if( Premium_Zone > 217.267 )
								if( Internal_Swing_High <= 208.92 )
									ret := -0.003984
								if( Internal_Swing_High > 208.92 )
									ret := 0.750000 // buy
				if( atr > 9.99049 )
					if( atr <= 10.357 )
						if( Order_Block_Low <= 91.25 )
							if( Equilibrium_Zone <= 199.184 )
								if( Premium_Zone <= 184.866 )
									ret := -0.809524 // sell
								if( Premium_Zone > 184.866 )
									ret := -0.322581
							if( Equilibrium_Zone > 199.184 )
								if( Premium_Zone <= 212.284 )
									ret := -0.890244 // sell
								if( Premium_Zone > 212.284 )
									ret := -0.637681
						if( Order_Block_Low > 91.25 )
							ret := 0.166667
					if( atr > 10.357 )
						if( Premium_Zone <= 185.212 )
							if( Swing_Low <= 81.9 )
								if( Internal_Swing_High <= 165.77 )
									ret := -0.776471 // sell
								if( Internal_Swing_High > 165.77 )
									ret := 1.000000 // buy
							if( Swing_Low > 81.9 )
								if( Equilibrium_Zone <= 173.686 )
									ret := 0.500000
								if( Equilibrium_Zone > 173.686 )
									ret := -1.000000 // sell
						if( Premium_Zone > 185.212 )
							if( Internal_Swing_Low <= 217.129 )
								if( Swing_Low <= 82.3449 )
									ret := -0.051661
								if( Swing_Low > 82.3449 )
									ret := 0.306931
							if( Internal_Swing_Low > 217.129 )
								if( atr <= 12.7653 )
									ret := -0.827586 // sell
								if( atr > 12.7653 )
									ret := -0.166667
			if( Internal_Swing_High > 213.264 )
				if( atr <= 11.9651 )
					if( Equilibrium_Zone <= 227.462 )
						if( Premium_Zone <= 224.347 )
							if( Equilibrium_Zone <= 213.457 )
								ret := 0.000000
							if( Equilibrium_Zone > 213.457 )
								if( Premium_Zone <= 223.888 )
									ret := -1.000000 // sell
								if( Premium_Zone > 223.888 )
									ret := -0.600000
						if( Premium_Zone > 224.347 )
							if( Discount_Zone <= 218.258 )
								if( Discount_Zone <= 217.544 )
									ret := -0.170455
								if( Discount_Zone > 217.544 )
									ret := -0.800000 // sell
							if( Discount_Zone > 218.258 )
								ret := 0.428571
					if( Equilibrium_Zone > 227.462 )
						ret := -1.000000 // sell
				if( atr > 11.9651 )
					if( Internal_Swing_High <= 218.11 )
						if( Premium_Zone <= 236.521 )
							ret := 0.000000
						if( Premium_Zone > 236.521 )
							ret := -0.800000 // sell
					if( Internal_Swing_High > 218.11 )
						if( Premium_Zone <= 236.494 )
							ret := -1.000000 // sell
						if( Premium_Zone > 236.494 )
							ret := -0.600000
	
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
float op_operation = decision_tree_0_QCOM_1Min_fb1ff1d5(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


