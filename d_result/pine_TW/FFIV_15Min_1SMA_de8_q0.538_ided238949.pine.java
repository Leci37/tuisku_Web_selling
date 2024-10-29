//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: FFIV_15Min_1SMA_ed238949 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1SMA_ed238949", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_ed238949(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Equilibrium_Zone <= 145.23 )
		if( atr <= 34.9575 )
			if( Equilibrium_Zone <= 144.913 )
				if( Premium_Zone <= 160.449 )
					if( atr <= 8.3826 )
						if( atr <= 7.76751 )
							if( Equilibrium_Zone <= 128.882 )
								if( Premium_Zone <= 127.625 )
									ret := 0.047301
								if( Premium_Zone > 127.625 )
									ret := 0.173891
							if( Equilibrium_Zone > 128.882 )
								if( Discount_Zone <= 124.724 )
									ret := -0.251163
								if( Discount_Zone > 124.724 )
									ret := 0.043408
						if( atr > 7.76751 )
							if( Premium_Zone <= 136.477 )
								if( atr <= 7.96257 )
									ret := 0.071429
								if( atr > 7.96257 )
									ret := 0.506849
							if( Premium_Zone > 136.477 )
								if( Premium_Zone <= 138.02 )
									ret := -0.384615
								if( Premium_Zone > 138.02 )
									ret := -0.091308
					if( atr > 8.3826 )
						if( Equilibrium_Zone <= 100.572 )
							if( Equilibrium_Zone <= 92.5511 )
								if( Discount_Zone <= 64.3912 )
									ret := -0.187500
								if( Discount_Zone > 64.3912 )
									ret := 0.687500
							if( Equilibrium_Zone > 92.5511 )
								if( Bearish_BOSInt <= 0.5 )
									ret := -0.510417
								if( Bearish_BOSInt > 0.5 )
									ret := 0.500000
						if( Equilibrium_Zone > 100.572 )
							if( Discount_Zone <= 135.277 )
								if( Internal_Swing_Low <= 133.718 )
									ret := 0.112242
								if( Internal_Swing_Low > 133.718 )
									ret := 0.254640
							if( Discount_Zone > 135.277 )
								if( Discount_Zone <= 136.05 )
									ret := 0.594595
								if( Discount_Zone > 136.05 )
									ret := -0.111111
				if( Premium_Zone > 160.449 )
					if( Discount_Zone <= 123.297 )
						if( Discount_Zone <= 118.49 )
							if( Swing_Low <= 67 )
								if( Equilibrium_Zone <= 133 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 133 )
									ret := -0.386555
							if( Swing_Low > 67 )
								ret := 1.000000 // buy
						if( Discount_Zone > 118.49 )
							if( Premium_Zone <= 163.675 )
								if( atr <= 21.7 )
									ret := -0.105263
								if( atr > 21.7 )
									ret := 0.750000 // buy
							if( Premium_Zone > 163.675 )
								if( atr <= 20.4243 )
									ret := 0.312500
								if( atr > 20.4243 )
									ret := 0.857143 // buy
					if( Discount_Zone > 123.297 )
						if( atr <= 17.4291 )
							if( Equilibrium_Zone <= 144.559 )
								if( atr <= 16.1527 )
									ret := -0.928571 // sell
								if( atr > 16.1527 )
									ret := 0.000000
							if( Equilibrium_Zone > 144.559 )
								if( Equilibrium_Zone <= 144.743 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 144.743 )
									ret := 0.461538
						if( atr > 17.4291 )
							if( Swing_Low <= 66.685 )
								if( Internal_Swing_Low <= 146.714 )
									ret := -0.553846
								if( Internal_Swing_Low > 146.714 )
									ret := 0.000000
							if( Swing_Low > 66.685 )
								if( Internal_Swing_Low <= 134.872 )
									ret := 0.363636
								if( Internal_Swing_Low > 134.872 )
									ret := -0.750000 // sell
			if( Equilibrium_Zone > 144.913 )
				if( Swing_Low <= 135.579 )
					if( atr <= 5.83737 )
						if( Equilibrium_Zone <= 145.007 )
							if( Equilibrium_Zone <= 144.977 )
								if( atr <= 5.38506 )
									ret := 0.500000
								if( atr > 5.38506 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 144.977 )
								if( Discount_Zone <= 139.515 )
									ret := 0.040000
								if( Discount_Zone > 139.515 )
									ret := 0.352941
						if( Equilibrium_Zone > 145.007 )
							if( Internal_Swing_Low <= 71.8 )
								if( Discount_Zone <= 139.595 )
									ret := 1.000000 // buy
								if( Discount_Zone > 139.595 )
									ret := 0.707317 // buy
							if( Internal_Swing_Low > 71.8 )
								ret := -0.166667
					if( atr > 5.83737 )
						if( Internal_Swing_High <= 146.203 )
							if( Equilibrium_Zone <= 145 )
								if( Discount_Zone <= 130.431 )
									ret := 0.375000
								if( Discount_Zone > 130.431 )
									ret := 0.909091 // buy
							if( Equilibrium_Zone > 145 )
								if( Internal_Swing_Low <= 146.485 )
									ret := 0.433735
								if( Internal_Swing_Low > 146.485 )
									ret := -0.600000
						if( Internal_Swing_High > 146.203 )
							if( Swing_High <= 149.995 )
								if( Internal_Swing_High <= 147.852 )
									ret := -1.000000 // sell
								if( Internal_Swing_High > 147.852 )
									ret := -0.416667
							if( Swing_High > 149.995 )
								ret := 1.000000 // buy
				if( Swing_Low > 135.579 )
					if( Premium_Zone <= 150.462 )
						ret := -1.000000 // sell
					if( Premium_Zone > 150.462 )
						if( Discount_Zone <= 139.339 )
							if( Swing_Low <= 139.455 )
								ret := -1.000000 // sell
							if( Swing_Low > 139.455 )
								if( atr <= 11.5869 )
									ret := -0.333333
								if( atr > 11.5869 )
									ret := 0.250000
						if( Discount_Zone > 139.339 )
							ret := 0.750000 // buy
		if( atr > 34.9575 )
			if( Swing_High <= 99.68 )
				if( atr <= 36.7399 )
					if( Equilibrium_Zone <= 90.8969 )
						if( Premium_Zone <= 125.916 )
							ret := 1.000000 // buy
						if( Premium_Zone > 125.916 )
							ret := 0.333333
					if( Equilibrium_Zone > 90.8969 )
						if( Premium_Zone <= 180.621 )
							if( Internal_Swing_High <= 91.2671 )
								if( Discount_Zone <= 56.7956 )
									ret := 0.925926 // buy
								if( Discount_Zone > 56.7956 )
									ret := 1.000000 // buy
							if( Internal_Swing_High > 91.2671 )
								ret := 1.000000 // buy
						if( Premium_Zone > 180.621 )
							ret := 0.750000 // buy
				if( atr > 36.7399 )
					ret := 0.285714
			if( Swing_High > 99.68 )
				ret := 0.142857
	if( Equilibrium_Zone > 145.23 )
		if( Internal_Swing_Low <= 181.857 )
			if( Equilibrium_Zone <= 238.85 )
				if( Equilibrium_Zone <= 146.738 )
					if( Equilibrium_Zone <= 146.513 )
						if( Discount_Zone <= 121.026 )
							if( Premium_Zone <= 180.315 )
								if( Internal_Swing_Low <= 149.218 )
									ret := -0.843137 // sell
								if( Internal_Swing_Low > 149.218 )
									ret := 0.000000
							if( Premium_Zone > 180.315 )
								ret := 1.000000 // buy
						if( Discount_Zone > 121.026 )
							if( Discount_Zone <= 142.205 )
								if( atr <= 3.97587 )
									ret := 0.581818
								if( atr > 3.97587 )
									ret := -0.027825
							if( Discount_Zone > 142.205 )
								if( Swing_Low <= 144.323 )
									ret := -0.430894
								if( Swing_Low > 144.323 )
									ret := 0.750000 // buy
					if( Equilibrium_Zone > 146.513 )
						if( Order_Block_Low <= 150.287 )
							if( Internal_Swing_Low <= 146.511 )
								if( Equilibrium_Zone <= 146.532 )
									ret := -0.696970
								if( Equilibrium_Zone > 146.532 )
									ret := -0.258567
							if( Internal_Swing_Low > 146.511 )
								if( Discount_Zone <= 141.718 )
									ret := -0.796610 // sell
								if( Discount_Zone > 141.718 )
									ret := 0.000000
						if( Order_Block_Low > 150.287 )
							ret := 1.000000 // buy
				if( Equilibrium_Zone > 146.738 )
					if( Order_Block_Low <= 155.375 )
						if( Premium_Zone <= 252.51 )
							if( Discount_Zone <= 220.724 )
								if( Discount_Zone <= 201.385 )
									ret := 0.034793
								if( Discount_Zone > 201.385 )
									ret := -0.133486
							if( Discount_Zone > 220.724 )
								if( Premium_Zone <= 246.516 )
									ret := 0.812500 // buy
								if( Premium_Zone > 246.516 )
									ret := 0.360000
						if( Premium_Zone > 252.51 )
							if( Swing_High <= 119.5 )
								if( atr <= 15.985 )
									ret := -0.473684
								if( atr > 15.985 )
									ret := 0.431535
							if( Swing_High > 119.5 )
								if( Swing_High <= 245.511 )
									ret := -1.000000 // sell
								if( Swing_High > 245.511 )
									ret := -0.400000
					if( Order_Block_Low > 155.375 )
						if( Swing_Low <= 178.707 )
							if( Discount_Zone <= 142.116 )
								if( Equilibrium_Zone <= 150.972 )
									ret := 0.400000
								if( Equilibrium_Zone > 150.972 )
									ret := -0.754386 // sell
							if( Discount_Zone > 142.116 )
								if( Equilibrium_Zone <= 158.292 )
									ret := 0.205128
								if( Equilibrium_Zone > 158.292 )
									ret := -0.111507
						if( Swing_Low > 178.707 )
							if( atr <= 11.7283 )
								ret := -1.000000 // sell
							if( atr > 11.7283 )
								if( Discount_Zone <= 170.481 )
									ret := -1.000000 // sell
								if( Discount_Zone > 170.481 )
									ret := -0.500000
			if( Equilibrium_Zone > 238.85 )
				if( atr <= 18.9847 )
					if( Equilibrium_Zone <= 238.974 )
						ret := -0.285714
					if( Equilibrium_Zone > 238.974 )
						if( Premium_Zone <= 259.979 )
							if( Equilibrium_Zone <= 241.499 )
								if( Discount_Zone <= 224.204 )
									ret := -1.000000 // sell
								if( Discount_Zone > 224.204 )
									ret := -0.766667 // sell
							if( Equilibrium_Zone > 241.499 )
								ret := -1.000000 // sell
						if( Premium_Zone > 259.979 )
							if( atr <= 17.1977 )
								if( Equilibrium_Zone <= 245.19 )
									ret := -0.571429
								if( Equilibrium_Zone > 245.19 )
									ret := -0.250000
							if( atr > 17.1977 )
								ret := -1.000000 // sell
				if( atr > 18.9847 )
					if( Premium_Zone <= 260.139 )
						if( Discount_Zone <= 219.376 )
							ret := -0.468750
						if( Discount_Zone > 219.376 )
							ret := -1.000000 // sell
					if( Premium_Zone > 260.139 )
						if( atr <= 21.2932 )
							if( Discount_Zone <= 224.605 )
								if( Premium_Zone <= 260.785 )
									ret := -0.277778
								if( Premium_Zone > 260.785 )
									ret := -0.058824
							if( Discount_Zone > 224.605 )
								if( Equilibrium_Zone <= 248.012 )
									ret := -0.241379
								if( Equilibrium_Zone > 248.012 )
									ret := -1.000000 // sell
						if( atr > 21.2932 )
							ret := 0.428571
		if( Internal_Swing_Low > 181.857 )
			if( Discount_Zone <= 179.709 )
				if( Discount_Zone <= 161.423 )
					if( Internal_Swing_Low <= 183.991 )
						if( atr <= 30.525 )
							if( Internal_Swing_Low <= 182.068 )
								ret := 1.000000 // buy
							if( Internal_Swing_Low > 182.068 )
								if( Premium_Zone <= 215.399 )
									ret := -0.250000
								if( Premium_Zone > 215.399 )
									ret := 0.473684
						if( atr > 30.525 )
							ret := -0.200000
					if( Internal_Swing_Low > 183.991 )
						if( Equilibrium_Zone <= 189.201 )
							if( Internal_Swing_Low <= 201.347 )
								if( Internal_Swing_Low <= 186.947 )
									ret := -0.026316
								if( Internal_Swing_Low > 186.947 )
									ret := -0.857143 // sell
							if( Internal_Swing_Low > 201.347 )
								if( Discount_Zone <= 150.348 )
									ret := 0.428571
								if( Discount_Zone > 150.348 )
									ret := 0.666667
						if( Equilibrium_Zone > 189.201 )
							if( Internal_Swing_Low <= 201.261 )
								if( Discount_Zone <= 158.601 )
									ret := 0.650000
								if( Discount_Zone > 158.601 )
									ret := -0.142857
							if( Internal_Swing_Low > 201.261 )
								if( atr <= 39.5615 )
									ret := -1.000000 // sell
								if( atr > 39.5615 )
									ret := -0.500000
				if( Discount_Zone > 161.423 )
					if( Discount_Zone <= 171.477 )
						if( Premium_Zone <= 227.87 )
							if( Discount_Zone <= 162.154 )
								if( Internal_Swing_Low <= 189.494 )
									ret := 0.000000
								if( Internal_Swing_Low > 189.494 )
									ret := -1.000000 // sell
							if( Discount_Zone > 162.154 )
								if( Discount_Zone <= 169.494 )
									ret := 0.620879
								if( Discount_Zone > 169.494 )
									ret := 0.373737
						if( Premium_Zone > 227.87 )
							if( Discount_Zone <= 163.59 )
								if( Swing_Low <= 190.407 )
									ret := 0.621622
								if( Swing_Low > 190.407 )
									ret := -0.250000
							if( Discount_Zone > 163.59 )
								if( atr <= 32.374 )
									ret := 0.166667
								if( atr > 32.374 )
									ret := -0.406250
					if( Discount_Zone > 171.477 )
						if( Premium_Zone <= 213.155 )
							if( Premium_Zone <= 209.259 )
								if( Internal_Swing_Low <= 192.351 )
									ret := 0.246944
								if( Internal_Swing_Low > 192.351 )
									ret := -0.357143
							if( Premium_Zone > 209.259 )
								if( Internal_Swing_Low <= 198.685 )
									ret := 0.860465 // buy
								if( Internal_Swing_Low > 198.685 )
									ret := 0.111111
						if( Premium_Zone > 213.155 )
							if( Internal_Swing_Low <= 192.21 )
								if( Premium_Zone <= 215.872 )
									ret := -0.875000 // sell
								if( Premium_Zone > 215.872 )
									ret := -0.045455
							if( Internal_Swing_Low > 192.21 )
								if( Premium_Zone <= 224.308 )
									ret := 0.619048
								if( Premium_Zone > 224.308 )
									ret := -0.571429
			if( Discount_Zone > 179.709 )
				if( atr <= 9.98115 )
					if( atr <= 9.00172 )
						if( Discount_Zone <= 180.135 )
							if( Equilibrium_Zone <= 187.941 )
								if( Discount_Zone <= 179.851 )
									ret := -0.500000
								if( Discount_Zone > 179.851 )
									ret := -0.958333 // sell
							if( Equilibrium_Zone > 187.941 )
								ret := 0.000000
						if( Discount_Zone > 180.135 )
							if( Internal_Swing_Low <= 187.834 )
								if( Internal_Swing_Low <= 185.548 )
									ret := 0.785714 // buy
								if( Internal_Swing_Low > 185.548 )
									ret := 0.328125
							if( Internal_Swing_Low > 187.834 )
								if( Discount_Zone <= 180.894 )
									ret := -0.818182 // sell
								if( Discount_Zone > 180.894 )
									ret := 0.029178
					if( atr > 9.00172 )
						if( Swing_Low <= 186.122 )
							if( Discount_Zone <= 181.046 )
								if( Internal_Swing_Low <= 187.955 )
									ret := 0.222222
								if( Internal_Swing_Low > 187.955 )
									ret := 0.000000
							if( Discount_Zone > 181.046 )
								if( Discount_Zone <= 183.877 )
									ret := -0.794872 // sell
								if( Discount_Zone > 183.877 )
									ret := -0.324786
						if( Swing_Low > 186.122 )
							if( Swing_Low <= 207.347 )
								if( Equilibrium_Zone <= 202.251 )
									ret := -0.078947
								if( Equilibrium_Zone > 202.251 )
									ret := 0.478261
							if( Swing_Low > 207.347 )
								ret := -0.571429
				if( atr > 9.98115 )
					if( Premium_Zone <= 210.365 )
						if( Internal_Swing_Low <= 191.32 )
							if( Order_Block_High <= 186.712 )
								if( Premium_Zone <= 204.365 )
									ret := -0.681818
								if( Premium_Zone > 204.365 )
									ret := -0.074074
							if( Order_Block_High > 186.712 )
								if( Internal_Swing_Low <= 187.175 )
									ret := 1.000000 // buy
								if( Internal_Swing_Low > 187.175 )
									ret := -0.250000
						if( Internal_Swing_Low > 191.32 )
							if( Premium_Zone <= 205.013 )
								ret := 0.000000
							if( Premium_Zone > 205.013 )
								if( Swing_Low <= 192.68 )
									ret := 0.655556
								if( Swing_Low > 192.68 )
									ret := -0.076923
					if( Premium_Zone > 210.365 )
						if( Internal_Swing_Low <= 201.884 )
							if( Discount_Zone <= 186.977 )
								if( Internal_Swing_Low <= 199.336 )
									ret := 0.297101
								if( Internal_Swing_Low > 199.336 )
									ret := -0.489796
							if( Discount_Zone > 186.977 )
								if( atr <= 11.1814 )
									ret := 0.285714
								if( atr > 11.1814 )
									ret := -0.439252
						if( Internal_Swing_Low > 201.884 )
							if( atr <= 12.5357 )
								if( atr <= 10.3103 )
									ret := -0.035088
								if( atr > 10.3103 )
									ret := 0.479592
							if( atr > 12.5357 )
								if( Swing_Low <= 201.956 )
									ret := 0.031722
								if( Swing_Low > 201.956 )
									ret := 0.251282
	
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
float op_operation = decision_tree_0_FFIV_15Min_ed238949(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


