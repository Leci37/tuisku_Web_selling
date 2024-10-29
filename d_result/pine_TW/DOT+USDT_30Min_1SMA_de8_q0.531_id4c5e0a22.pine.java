//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: DOTUSDT_30Min_1SMA_4c5e0a22 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_1SMA_4c5e0a22", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_4c5e0a22(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Swing_Low <= 3.45394 )
		if( Discount_Zone <= 6.31895 )
			if( Order_Block_High <= 7.72542 )
				if( Equilibrium_Zone <= 7.87481 )
					if( Discount_Zone <= 3.75804 )
						if( Order_Block_Low <= 3.90104 )
							if( Premium_Zone <= 4.40115 )
								if( Internal_Swing_Low <= 4.29324 )
									ret := -0.007585
								if( Internal_Swing_Low > 4.29324 )
									ret := -0.641026
							if( Premium_Zone > 4.40115 )
								if( atr <= 3.61406 )
									ret := 0.155155
								if( atr > 3.61406 )
									ret := -0.584615
						if( Order_Block_Low > 3.90104 )
							if( Equilibrium_Zone <= 4.2405 )
								if( FVG_UpInt <= 0.5 )
									ret := -0.727273 // sell
								if( FVG_UpInt > 0.5 )
									ret := -0.058824
							if( Equilibrium_Zone > 4.2405 )
								ret := 0.200000
					if( Discount_Zone > 3.75804 )
						if( Premium_Zone <= 9.89128 )
							if( Swing_High <= 5.32019 )
								if( Equilibrium_Zone <= 7.21795 )
									ret := -0.003566
								if( Equilibrium_Zone > 7.21795 )
									ret := 0.124658
							if( Swing_High > 5.32019 )
								if( Order_Block_High <= 7.349 )
									ret := 0.060576
								if( Order_Block_High > 7.349 )
									ret := 0.854545 // buy
						if( Premium_Zone > 9.89128 )
							if( Equilibrium_Zone <= 7.44132 )
								if( Premium_Zone <= 9.95927 )
									ret := -1.000000 // sell
								if( Premium_Zone > 9.95927 )
									ret := 0.252336
							if( Equilibrium_Zone > 7.44132 )
								if( atr <= 2.22002 )
									ret := -0.150943
								if( atr > 2.22002 )
									ret := -0.731343 // sell
				if( Equilibrium_Zone > 7.87481 )
					if( atr <= 7.2602 )
						if( Discount_Zone <= 6.13212 )
							if( Premium_Zone <= 11.0444 )
								if( Equilibrium_Zone <= 8.11423 )
									ret := 0.243902
								if( Equilibrium_Zone > 8.11423 )
									ret := -0.380282
							if( Premium_Zone > 11.0444 )
								if( Internal_Swing_Low <= 8.52699 )
									ret := 0.440501
								if( Internal_Swing_Low > 8.52699 )
									ret := 0.064935
						if( Discount_Zone > 6.13212 )
							ret := 0.605670
					if( atr > 7.2602 )
						if( Internal_Swing_High <= 16.2146 )
							if( Premium_Zone <= 33.0053 )
								if( Internal_Swing_Low <= 13.1595 )
									ret := -0.579832
								if( Internal_Swing_Low > 13.1595 )
									ret := 0.367347
							if( Premium_Zone > 33.0053 )
								if( Premium_Zone <= 34.1739 )
									ret := 0.702128 // buy
								if( Premium_Zone > 34.1739 )
									ret := -0.400000
						if( Internal_Swing_High > 16.2146 )
							if( Internal_Swing_High <= 22.6226 )
								if( Swing_High <= 17.148 )
									ret := 0.944444 // buy
								if( Swing_High > 17.148 )
									ret := -0.363636
							if( Internal_Swing_High > 22.6226 )
								ret := -1.000000 // sell
			if( Order_Block_High > 7.72542 )
				if( Internal_Swing_High <= 8.95585 )
					if( Equilibrium_Zone <= 7.68318 )
						if( Order_Block_High <= 8.16695 )
							ret := -0.875000 // sell
						if( Order_Block_High > 8.16695 )
							ret := -0.857143 // sell
					if( Equilibrium_Zone > 7.68318 )
						ret := 0.166667
				if( Internal_Swing_High > 8.95585 )
					if( Order_Block_Low <= 9.3797 )
						ret := -1.000000 // sell
					if( Order_Block_Low > 9.3797 )
						ret := -0.666667
		if( Discount_Zone > 6.31895 )
			if( Internal_Swing_Low <= 13.3521 )
				if( Internal_Swing_Low <= 12.5116 )
					if( Internal_Swing_Low <= 12.2497 )
						if( Equilibrium_Zone <= 44.0313 )
							if( atr <= 0.810311 )
								if( Premium_Zone <= 9.08423 )
									ret := -0.088074
								if( Premium_Zone > 9.08423 )
									ret := -0.317881
							if( atr > 0.810311 )
								if( Order_Block_Low <= 42.4168 )
									ret := -0.035226
								if( Order_Block_Low > 42.4168 )
									ret := -0.489362
						if( Equilibrium_Zone > 44.0313 )
							if( Equilibrium_Zone <= 46.2382 )
								if( Premium_Zone <= 48.85 )
									ret := 0.789474 // buy
								if( Premium_Zone > 48.85 )
									ret := -0.470942
							if( Equilibrium_Zone > 46.2382 )
								if( Discount_Zone <= 46.0539 )
									ret := -0.131295
								if( Discount_Zone > 46.0539 )
									ret := 0.164021
					if( Internal_Swing_Low > 12.2497 )
						if( atr <= 2.34487 )
							ret := 0.181818
						if( atr > 2.34487 )
							if( Discount_Zone <= 9.89514 )
								ret := 0.916667 // buy
							if( Discount_Zone > 9.89514 )
								ret := 0.705882 // buy
				if( Internal_Swing_Low > 12.5116 )
					if( Internal_Swing_Low <= 13.1033 )
						if( Premium_Zone <= 14.7768 )
							ret := -0.833333 // sell
						if( Premium_Zone > 14.7768 )
							if( Premium_Zone <= 16.9175 )
								ret := -1.000000 // sell
							if( Premium_Zone > 16.9175 )
								ret := -0.888889 // sell
					if( Internal_Swing_Low > 13.1033 )
						ret := -0.400000
			if( Internal_Swing_Low > 13.3521 )
				if( Internal_Swing_Low <= 14.035 )
					if( Equilibrium_Zone <= 15.1422 )
						if( Equilibrium_Zone <= 14.4065 )
							if( atr <= 2.757 )
								if( Discount_Zone <= 11.9147 )
									ret := 0.000000
								if( Discount_Zone > 11.9147 )
									ret := 0.692308
							if( atr > 2.757 )
								if( Internal_Swing_Low <= 13.5862 )
									ret := 0.900000 // buy
								if( Internal_Swing_Low > 13.5862 )
									ret := 0.687500
						if( Equilibrium_Zone > 14.4065 )
							if( Premium_Zone <= 17.85 )
								ret := 0.233333
							if( Premium_Zone > 17.85 )
								ret := 0.636364
					if( Equilibrium_Zone > 15.1422 )
						ret := 0.956522 // buy
				if( Internal_Swing_Low > 14.035 )
					if( Premium_Zone <= 29.446 )
						if( atr <= 7.55938 )
							if( atr <= 1.44779 )
								if( Internal_Swing_Low <= 16.7709 )
									ret := -0.948718 // sell
								if( Internal_Swing_Low > 16.7709 )
									ret := -0.272727
							if( atr > 1.44779 )
								if( Internal_Swing_Low <= 16.8573 )
									ret := 0.203105
								if( Internal_Swing_Low > 16.8573 )
									ret := -0.023952
						if( atr > 7.55938 )
							if( atr <= 7.869 )
								ret := 1.000000 // buy
							if( atr > 7.869 )
								if( Discount_Zone <= 9.871 )
									ret := 0.230769
								if( Discount_Zone > 9.871 )
									ret := 0.632653
					if( Premium_Zone > 29.446 )
						if( Internal_Swing_Low <= 23.8487 )
							if( Discount_Zone <= 12.2471 )
								if( Premium_Zone <= 51.934 )
									ret := -0.809524 // sell
								if( Premium_Zone > 51.934 )
									ret := 0.272727
							if( Discount_Zone > 12.2471 )
								if( Equilibrium_Zone <= 24.5374 )
									ret := 0.422535
								if( Equilibrium_Zone > 24.5374 )
									ret := 0.762376 // buy
						if( Internal_Swing_Low > 23.8487 )
							if( Equilibrium_Zone <= 27.2474 )
								if( Internal_Swing_High <= 24.39 )
									ret := 0.281314
								if( Internal_Swing_High > 24.39 )
									ret := 0.714286 // buy
							if( Equilibrium_Zone > 27.2474 )
								if( atr <= 5.17063 )
									ret := -0.059904
								if( atr > 5.17063 )
									ret := 0.155875
	if( Swing_Low > 3.45394 )
		if( atr <= 0.5615 )
			if( Equilibrium_Zone <= 4.69491 )
				if( Equilibrium_Zone <= 4.59359 )
					if( Order_Block_Low <= 0.99427 )
						if( Premium_Zone <= 4.97404 )
							if( Swing_Low <= 3.91235 )
								ret := 0.342857
							if( Swing_Low > 3.91235 )
								if( FVG_DownInt <= 0.5 )
									ret := -0.155894
								if( FVG_DownInt > 0.5 )
									ret := 0.363636
						if( Premium_Zone > 4.97404 )
							ret := 0.750000 // buy
					if( Order_Block_Low > 0.99427 )
						if( Order_Block_High <= 4.04915 )
							if( atr <= 0.266318 )
								ret := 0.615385
							if( atr > 0.266318 )
								ret := 0.823529 // buy
						if( Order_Block_High > 4.04915 )
							if( FVG_DownInt <= 0.5 )
								if( Order_Block_Low <= 4.2955 )
									ret := 0.000000
								if( Order_Block_Low > 4.2955 )
									ret := -0.478261
							if( FVG_DownInt > 0.5 )
								if( Swing_Low <= 4.15801 )
									ret := -0.454545
								if( Swing_Low > 4.15801 )
									ret := 0.923077 // buy
				if( Equilibrium_Zone > 4.59359 )
					if( atr <= 0.4155 )
						if( Equilibrium_Zone <= 4.6415 )
							ret := 0.444444
						if( Equilibrium_Zone > 4.6415 )
							ret := 0.050000
					if( atr > 0.4155 )
						ret := 0.888889 // buy
			if( Equilibrium_Zone > 4.69491 )
				if( Discount_Zone <= 6.22328 )
					if( Discount_Zone <= 6.09101 )
						if( Internal_Swing_Low <= 6.30139 )
							if( Swing_Low <= 5.96002 )
								if( Swing_Low <= 5.7395 )
									ret := -0.093110
								if( Swing_Low > 5.7395 )
									ret := -0.536585
							if( Swing_Low > 5.96002 )
								if( Premium_Zone <= 6.896 )
									ret := 0.189781
								if( Premium_Zone > 6.896 )
									ret := -0.525000
						if( Internal_Swing_Low > 6.30139 )
							ret := 0.550000
					if( Discount_Zone > 6.09101 )
						if( atr <= 0.489627 )
							if( Internal_Swing_Low <= 6.37565 )
								ret := 0.235294
							if( Internal_Swing_Low > 6.37565 )
								if( atr <= 0.42 )
									ret := -0.800000 // sell
								if( atr > 0.42 )
									ret := -0.384615
						if( atr > 0.489627 )
							ret := -1.000000 // sell
				if( Discount_Zone > 6.22328 )
					if( Equilibrium_Zone <= 6.79121 )
						if( Discount_Zone <= 6.25949 )
							if( Swing_Low <= 6.51158 )
								ret := 0.538462
							if( Swing_Low > 6.51158 )
								ret := 1.000000 // buy
						if( Discount_Zone > 6.25949 )
							if( Internal_Swing_Low <= 6.465 )
								ret := 0.692308
							if( Internal_Swing_Low > 6.465 )
								ret := 0.214286
					if( Equilibrium_Zone > 6.79121 )
						if( Swing_Low <= 6.80554 )
							ret := -0.481481
						if( Swing_Low > 6.80554 )
							if( FVG_DownInt <= 0.5 )
								if( Swing_Low <= 7.042 )
									ret := 0.225806
								if( Swing_Low > 7.042 )
									ret := -0.105263
							if( FVG_DownInt > 0.5 )
								ret := -0.555556
		if( atr > 0.5615 )
			if( Internal_Swing_Low <= 8.89867 )
				if( Internal_Swing_Low <= 8.54162 )
					if( Premium_Zone <= 6.98989 )
						if( Equilibrium_Zone <= 5.73696 )
							if( Discount_Zone <= 4.74236 )
								if( atr <= 1.43991 )
									ret := 0.341176
								if( atr > 1.43991 )
									ret := 1.000000 // buy
							if( Discount_Zone > 4.74236 )
								if( Premium_Zone <= 6.12909 )
									ret := 0.406250
								if( Premium_Zone > 6.12909 )
									ret := -0.520833
						if( Equilibrium_Zone > 5.73696 )
							if( Discount_Zone <= 5.42472 )
								if( Discount_Zone <= 5.04302 )
									ret := 0.962963 // buy
								if( Discount_Zone > 5.04302 )
									ret := 0.827586 // buy
							if( Discount_Zone > 5.42472 )
								if( Swing_Low <= 5.95434 )
									ret := 0.111111
								if( Swing_Low > 5.95434 )
									ret := 0.820000 // buy
					if( Premium_Zone > 6.98989 )
						if( Swing_Low <= 6.23848 )
							if( Premium_Zone <= 7.66 )
								if( Swing_Low <= 5.88145 )
									ret := 0.454545
								if( Swing_Low > 5.88145 )
									ret := -0.369942
							if( Premium_Zone > 7.66 )
								if( Premium_Zone <= 7.95845 )
									ret := 0.875000 // buy
								if( Premium_Zone > 7.95845 )
									ret := 0.352941
						if( Swing_Low > 6.23848 )
							if( Discount_Zone <= 7.63631 )
								if( Swing_Low <= 8.00271 )
									ret := 0.222581
								if( Swing_Low > 8.00271 )
									ret := 0.911765 // buy
							if( Discount_Zone > 7.63631 )
								if( Discount_Zone <= 7.976 )
									ret := -0.777778 // sell
								if( Discount_Zone > 7.976 )
									ret := -0.055556
				if( Internal_Swing_Low > 8.54162 )
					if( Discount_Zone <= 7.38533 )
						ret := -0.307692
					if( Discount_Zone > 7.38533 )
						if( Order_Block_High <= 8.82477 )
							if( atr <= 1.13631 )
								if( Premium_Zone <= 10.0475 )
									ret := 1.000000 // buy
								if( Premium_Zone > 10.0475 )
									ret := 0.181818
							if( atr > 1.13631 )
								ret := 1.000000 // buy
						if( Order_Block_High > 8.82477 )
							ret := 0.800000 // buy
			if( Internal_Swing_Low > 8.89867 )
				if( Internal_Swing_Low <= 12.7349 )
					if( Order_Block_Low <= 10.4125 )
						if( Swing_Low <= 11.4186 )
							if( Discount_Zone <= 9.23108 )
								if( Premium_Zone <= 14.2773 )
									ret := -0.299401
								if( Premium_Zone > 14.2773 )
									ret := 0.520000
							if( Discount_Zone > 9.23108 )
								if( Premium_Zone <= 11.8375 )
									ret := 0.941176 // buy
								if( Premium_Zone > 11.8375 )
									ret := 0.360000
						if( Swing_Low > 11.4186 )
							if( atr <= 3.41702 )
								ret := 0.000000
							if( atr > 3.41702 )
								if( Internal_Swing_Low <= 11.9868 )
									ret := -0.916667 // sell
								if( Internal_Swing_Low > 11.9868 )
									ret := -1.000000 // sell
					if( Order_Block_Low > 10.4125 )
						ret := -0.814815 // sell
				if( Internal_Swing_Low > 12.7349 )
					if( Swing_Low <= 14.8203 )
						if( Premium_Zone <= 18.939 )
							if( Order_Block_High <= 14.2413 )
								if( Bearish_BOSInt <= 0.5 )
									ret := 0.422819
								if( Bearish_BOSInt > 0.5 )
									ret := 0.541667
							if( Order_Block_High > 14.2413 )
								ret := -0.700000 // sell
						if( Premium_Zone > 18.939 )
							if( Equilibrium_Zone <= 16.3697 )
								if( Discount_Zone <= 10.5749 )
									ret := 1.000000 // buy
								if( Discount_Zone > 10.5749 )
									ret := 0.692308
							if( Equilibrium_Zone > 16.3697 )
								ret := 1.000000 // buy
					if( Swing_Low > 14.8203 )
						if( Premium_Zone <= 34.6656 )
							if( Premium_Zone <= 18.6275 )
								if( Discount_Zone <= 14.0328 )
									ret := -0.333333
								if( Discount_Zone > 14.0328 )
									ret := -0.850000 // sell
							if( Premium_Zone > 18.6275 )
								if( Equilibrium_Zone <= 23.0202 )
									ret := 0.119403
								if( Equilibrium_Zone > 23.0202 )
									ret := -0.283286
						if( Premium_Zone > 34.6656 )
							if( Swing_Low <= 29.1692 )
								if( Swing_Low <= 25.7472 )
									ret := 0.486486
								if( Swing_Low > 25.7472 )
									ret := 0.758389 // buy
							if( Swing_Low > 29.1692 )
								if( Discount_Zone <= 28.4778 )
									ret := -0.364929
								if( Discount_Zone > 28.4778 )
									ret := 0.267974
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_4c5e0a22(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


