//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: LINKUSDT_30Min_1SMA_6bfaff1d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_1SMA_6bfaff1d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_6bfaff1d(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( atr <= 5.43634 )
		if( Internal_Swing_High <= 7.16011 )
			if( Order_Block_High <= 11.8561 )
				if( Premium_Zone <= 7.75157 )
					if( Discount_Zone <= 5.35226 )
						if( Swing_Low <= 5.091 )
							if( Equilibrium_Zone <= 11.2406 )
								if( atr <= 1.44231 )
									ret := 0.155172
								if( atr > 1.44231 )
									ret := 0.725000 // buy
							if( Equilibrium_Zone > 11.2406 )
								ret := 0.886792 // buy
						if( Swing_Low > 5.091 )
							if( Premium_Zone <= 5.96632 )
								ret := 0.821429 // buy
							if( Premium_Zone > 5.96632 )
								if( Discount_Zone <= 5.26638 )
									ret := 0.684211
								if( Discount_Zone > 5.26638 )
									ret := 0.000000
					if( Discount_Zone > 5.35226 )
						if( Discount_Zone <= 5.67137 )
							if( Internal_Swing_High <= 6.87767 )
								if( Internal_Swing_High <= 6.42085 )
									ret := -0.055868
								if( Internal_Swing_High > 6.42085 )
									ret := 0.218884
							if( Internal_Swing_High > 6.87767 )
								if( atr <= 1.06821 )
									ret := -0.582609
								if( atr > 1.06821 )
									ret := 0.500000
						if( Discount_Zone > 5.67137 )
							if( Premium_Zone <= 7.18498 )
								if( Premium_Zone <= 7.02067 )
									ret := 0.076431
								if( Premium_Zone > 7.02067 )
									ret := -0.195426
							if( Premium_Zone > 7.18498 )
								if( Discount_Zone <= 5.85008 )
									ret := 0.513595
								if( Discount_Zone > 5.85008 )
									ret := 0.125876
				if( Premium_Zone > 7.75157 )
					if( Internal_Swing_Low <= 28.5183 )
						if( atr <= 2.42624 )
							if( Equilibrium_Zone <= 14.8035 )
								if( Discount_Zone <= 4.01794 )
									ret := 0.711538 // buy
								if( Discount_Zone > 4.01794 )
									ret := -0.010676
							if( Equilibrium_Zone > 14.8035 )
								if( Equilibrium_Zone <= 18.3246 )
									ret := -0.135733
								if( Equilibrium_Zone > 18.3246 )
									ret := 0.032418
						if( atr > 2.42624 )
							if( atr <= 2.4511 )
								if( Swing_Low <= 10.0024 )
									ret := 0.369811
								if( Swing_Low > 10.0024 )
									ret := 0.533333
							if( atr > 2.4511 )
								if( atr <= 3.73077 )
									ret := 0.020598
								if( atr > 3.73077 )
									ret := 0.095556
					if( Internal_Swing_Low > 28.5183 )
						if( Premium_Zone <= 36.2802 )
							if( Equilibrium_Zone <= 30.7663 )
								if( Premium_Zone <= 35.4104 )
									ret := 0.228840
								if( Premium_Zone > 35.4104 )
									ret := 0.681818
							if( Equilibrium_Zone > 30.7663 )
								if( Premium_Zone <= 35.064 )
									ret := 0.941176 // buy
								if( Premium_Zone > 35.064 )
									ret := 0.666667
						if( Premium_Zone > 36.2802 )
							if( Premium_Zone <= 42.0485 )
								if( Equilibrium_Zone <= 32.5112 )
									ret := 0.125000
								if( Equilibrium_Zone > 32.5112 )
									ret := -0.345178
							if( Premium_Zone > 42.0485 )
								ret := 1.000000 // buy
			if( Order_Block_High > 11.8561 )
				if( Discount_Zone <= 21.2411 )
					if( Order_Block_Low <= 17.4103 )
						if( Equilibrium_Zone <= 14.8521 )
							if( Discount_Zone <= 12.2783 )
								if( Swing_Low <= 11.7779 )
									ret := 0.956522 // buy
								if( Swing_Low > 11.7779 )
									ret := 0.034483
							if( Discount_Zone > 12.2783 )
								if( Discount_Zone <= 12.8307 )
									ret := 0.884058 // buy
								if( Discount_Zone > 12.8307 )
									ret := 0.105263
						if( Equilibrium_Zone > 14.8521 )
							if( Order_Block_High <= 14.8856 )
								if( Internal_Swing_Low <= 14.4098 )
									ret := -0.774194 // sell
								if( Internal_Swing_Low > 14.4098 )
									ret := -0.619048
							if( Order_Block_High > 14.8856 )
								if( Order_Block_High <= 15.994 )
									ret := 0.647059
								if( Order_Block_High > 15.994 )
									ret := -0.136364
					if( Order_Block_Low > 17.4103 )
						if( Premium_Zone <= 27.6788 )
							if( Equilibrium_Zone <= 20.9673 )
								if( Equilibrium_Zone <= 20.2006 )
									ret := 0.448276
								if( Equilibrium_Zone > 20.2006 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 20.9673 )
								ret := -0.250000
						if( Premium_Zone > 27.6788 )
							if( Discount_Zone <= 18.348 )
								ret := 0.947368 // buy
							if( Discount_Zone > 18.348 )
								ret := 0.666667
				if( Discount_Zone > 21.2411 )
					if( Premium_Zone <= 32.1159 )
						if( Premium_Zone <= 29.4921 )
							if( Discount_Zone <= 22.9055 )
								ret := -0.636364
							if( Discount_Zone > 22.9055 )
								ret := -0.894737 // sell
						if( Premium_Zone > 29.4921 )
							if( Order_Block_Low <= 26.2797 )
								ret := -0.647059
							if( Order_Block_Low > 26.2797 )
								ret := -0.375000
					if( Premium_Zone > 32.1159 )
						if( Order_Block_Low <= 29.0686 )
							if( Equilibrium_Zone <= 28.4168 )
								ret := 0.222222
							if( Equilibrium_Zone > 28.4168 )
								ret := 1.000000 // buy
						if( Order_Block_Low > 29.0686 )
							ret := 0.066667
		if( Internal_Swing_High > 7.16011 )
			if( Swing_High <= 31.2191 )
				if( atr <= 1.20109 )
					if( Discount_Zone <= 10.0617 )
						if( Internal_Swing_Low <= 7.4027 )
							if( Internal_Swing_Low <= 7.2232 )
								if( Order_Block_High <= 7.59743 )
									ret := -0.023652
								if( Order_Block_High > 7.59743 )
									ret := 0.275000
							if( Internal_Swing_Low > 7.2232 )
								if( Equilibrium_Zone <= 7.24075 )
									ret := 0.866667 // buy
								if( Equilibrium_Zone > 7.24075 )
									ret := 0.076923
						if( Internal_Swing_Low > 7.4027 )
							if( Premium_Zone <= 11.3227 )
								if( Internal_Swing_High <= 10.235 )
									ret := -0.442308
								if( Internal_Swing_High > 10.235 )
									ret := -0.913043 // sell
							if( Premium_Zone > 11.3227 )
								ret := -0.111111
					if( Discount_Zone > 10.0617 )
						if( Order_Block_Low <= 5.6343 )
							if( Internal_Swing_Low <= 11.625 )
								if( Discount_Zone <= 10.3957 )
									ret := 0.723164 // buy
								if( Discount_Zone > 10.3957 )
									ret := 0.052841
							if( Internal_Swing_Low > 11.625 )
								if( Internal_Swing_High <= 14.1635 )
									ret := -0.285714
								if( Internal_Swing_High > 14.1635 )
									ret := 0.142857
						if( Order_Block_Low > 5.6343 )
							if( Equilibrium_Zone <= 11.3474 )
								ret := 1.000000 // buy
							if( Equilibrium_Zone > 11.3474 )
								if( Premium_Zone <= 16.2298 )
									ret := 0.055556
								if( Premium_Zone > 16.2298 )
									ret := 0.300000
				if( atr > 1.20109 )
					if( Equilibrium_Zone <= 11.7054 )
						if( Discount_Zone <= 9.88839 )
							if( Discount_Zone <= 5.64959 )
								if( Equilibrium_Zone <= 6.51995 )
									ret := 0.386364
								if( Equilibrium_Zone > 6.51995 )
									ret := -0.546358
							if( Discount_Zone > 5.64959 )
								if( Swing_High <= 11.9851 )
									ret := -0.156142
								if( Swing_High > 11.9851 )
									ret := 0.647059
						if( Discount_Zone > 9.88839 )
							if( Swing_High <= 12.2611 )
								if( atr <= 1.24855 )
									ret := -0.939394 // sell
								if( atr > 1.24855 )
									ret := -0.401575
							if( Swing_High > 12.2611 )
								ret := -0.880000 // sell
					if( Equilibrium_Zone > 11.7054 )
						if( atr <= 1.38608 )
							if( atr <= 1.38178 )
								if( Bullish_BOSInt <= 0.5 )
									ret := 0.134206
								if( Bullish_BOSInt > 0.5 )
									ret := -0.025000
							if( atr > 1.38178 )
								if( Premium_Zone <= 17.5785 )
									ret := 1.000000 // buy
								if( Premium_Zone > 17.5785 )
									ret := 0.700000 // buy
						if( atr > 1.38608 )
							if( Discount_Zone <= 13.5821 )
								if( Internal_Swing_High <= 14.0662 )
									ret := 0.035253
								if( Internal_Swing_High > 14.0662 )
									ret := -0.203247
							if( Discount_Zone > 13.5821 )
								if( Discount_Zone <= 14.7892 )
									ret := 0.161197
								if( Discount_Zone > 14.7892 )
									ret := -0.008769
			if( Swing_High > 31.2191 )
				if( atr <= 5.31866 )
					if( Discount_Zone <= 28.8705 )
						if( Swing_High <= 32.3089 )
							if( Internal_Swing_High <= 31.5658 )
								ret := 0.848485 // buy
							if( Internal_Swing_High > 31.5658 )
								if( Equilibrium_Zone <= 30.4833 )
									ret := 0.166667
								if( Equilibrium_Zone > 30.4833 )
									ret := 0.722222 // buy
						if( Swing_High > 32.3089 )
							if( Discount_Zone <= 28.3301 )
								if( Equilibrium_Zone <= 31.1356 )
									ret := 0.193548
								if( Equilibrium_Zone > 31.1356 )
									ret := -0.388889
							if( Discount_Zone > 28.3301 )
								if( Order_Block_High <= 16.66 )
									ret := 0.718750 // buy
								if( Order_Block_High > 16.66 )
									ret := -0.583333
					if( Discount_Zone > 28.8705 )
						if( Order_Block_High <= 16.3176 )
							if( Internal_Swing_High <= 35.5183 )
								if( Equilibrium_Zone <= 32.9267 )
									ret := 0.636364
								if( Equilibrium_Zone > 32.9267 )
									ret := 0.300000
							if( Internal_Swing_High > 35.5183 )
								if( Internal_Swing_High <= 37.4163 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 37.4163 )
									ret := 0.588235
						if( Order_Block_High > 16.3176 )
							if( atr <= 3.9272 )
								if( Discount_Zone <= 29.567 )
									ret := 0.888889 // buy
								if( Discount_Zone > 29.567 )
									ret := 1.000000 // buy
							if( atr > 3.9272 )
								ret := 0.625000
				if( atr > 5.31866 )
					ret := -0.250000
	if( atr > 5.43634 )
		if( Swing_Low <= 22.0095 )
			if( atr <= 7.68312 )
				if( Equilibrium_Zone <= 19.8819 )
					if( Discount_Zone <= 10.7141 )
						if( atr <= 6.39413 )
							ret := 0.228916
						if( atr > 6.39413 )
							if( Premium_Zone <= 23.4989 )
								if( Discount_Zone <= 8.69 )
									ret := -0.642857
								if( Discount_Zone > 8.69 )
									ret := -0.052632
							if( Premium_Zone > 23.4989 )
								if( Internal_Swing_Low <= 17.6715 )
									ret := -0.425532
								if( Internal_Swing_Low > 17.6715 )
									ret := -0.818182 // sell
					if( Discount_Zone > 10.7141 )
						if( Swing_High <= 19.0429 )
							if( Discount_Zone <= 12.1411 )
								if( Equilibrium_Zone <= 18.5291 )
									ret := 0.844156 // buy
								if( Equilibrium_Zone > 18.5291 )
									ret := 0.666667
							if( Discount_Zone > 12.1411 )
								if( Premium_Zone <= 25.0124 )
									ret := -0.916667 // sell
								if( Premium_Zone > 25.0124 )
									ret := 0.258333
						if( Swing_High > 19.0429 )
							ret := -0.461538
				if( Equilibrium_Zone > 19.8819 )
					if( Internal_Swing_Low <= 22.8348 )
						if( Swing_High <= 30.2972 )
							if( Discount_Zone <= 18.237 )
								if( Discount_Zone <= 17.9767 )
									ret := -0.345933
								if( Discount_Zone > 17.9767 )
									ret := -0.784615 // sell
							if( Discount_Zone > 18.237 )
								if( Internal_Swing_Low <= 10.7649 )
									ret := -0.178943
								if( Internal_Swing_Low > 10.7649 )
									ret := -0.272727
						if( Swing_High > 30.2972 )
							if( Swing_High <= 39.8693 )
								if( Equilibrium_Zone <= 27.9605 )
									ret := -0.470588
								if( Equilibrium_Zone > 27.9605 )
									ret := -0.807018 // sell
							if( Swing_High > 39.8693 )
								if( Internal_Swing_High <= 44.0525 )
									ret := 0.325581
								if( Internal_Swing_High > 44.0525 )
									ret := -0.846154 // sell
					if( Internal_Swing_Low > 22.8348 )
						if( atr <= 7.34835 )
							if( Equilibrium_Zone <= 23.4071 )
								if( Premium_Zone <= 28.786 )
									ret := -0.250000
								if( Premium_Zone > 28.786 )
									ret := 0.648649
							if( Equilibrium_Zone > 23.4071 )
								ret := -0.023085
						if( atr > 7.34835 )
							ret := -0.770115 // sell
			if( atr > 7.68312 )
				if( Premium_Zone <= 36.3709 )
					if( Equilibrium_Zone <= 18.2436 )
						if( Equilibrium_Zone <= 15.225 )
							if( atr <= 8.67468 )
								ret := 0.071429
							if( atr > 8.67468 )
								ret := 1.000000 // buy
						if( Equilibrium_Zone > 15.225 )
							if( Internal_Swing_High <= 15.8919 )
								if( Premium_Zone <= 23.6906 )
									ret := -0.833333 // sell
								if( Premium_Zone > 23.6906 )
									ret := 0.099526
							if( Internal_Swing_High > 15.8919 )
								if( Discount_Zone <= 8.27435 )
									ret := -0.700000 // sell
								if( Discount_Zone > 8.27435 )
									ret := -1.000000 // sell
					if( Equilibrium_Zone > 18.2436 )
						if( Premium_Zone <= 26.6589 )
							ret := 0.956522 // buy
						if( Premium_Zone > 26.6589 )
							if( Premium_Zone <= 31.5607 )
								if( Discount_Zone <= 13.4721 )
									ret := 0.215103
								if( Discount_Zone > 13.4721 )
									ret := -0.404494
							if( Premium_Zone > 31.5607 )
								if( Premium_Zone <= 33.7885 )
									ret := 0.630682
								if( Premium_Zone > 33.7885 )
									ret := 0.234339
				if( Premium_Zone > 36.3709 )
					if( Premium_Zone <= 39.6491 )
						if( Premium_Zone <= 38.4313 )
							if( Equilibrium_Zone <= 30.1259 )
								if( Premium_Zone <= 37.808 )
									ret := -0.067047
								if( Premium_Zone > 37.808 )
									ret := -0.617886
							if( Equilibrium_Zone > 30.1259 )
								if( Internal_Swing_High <= 27.17 )
									ret := 0.823529 // buy
								if( Internal_Swing_High > 27.17 )
									ret := -0.088235
						if( Premium_Zone > 38.4313 )
							if( Internal_Swing_High <= 28.7703 )
								if( Equilibrium_Zone <= 24.4755 )
									ret := 0.928571 // buy
								if( Equilibrium_Zone > 24.4755 )
									ret := -0.631068
							if( Internal_Swing_High > 28.7703 )
								if( atr <= 8.6668 )
									ret := -0.800000 // sell
								if( atr > 8.6668 )
									ret := -0.888889 // sell
					if( Premium_Zone > 39.6491 )
						if( Discount_Zone <= 7.64796 )
							if( Internal_Swing_Low <= 8.72919 )
								if( Equilibrium_Zone <= 25.7857 )
									ret := -0.962264 // sell
								if( Equilibrium_Zone > 25.7857 )
									ret := -0.233161
							if( Internal_Swing_Low > 8.72919 )
								if( Equilibrium_Zone <= 27.0168 )
									ret := 0.421053
								if( Equilibrium_Zone > 27.0168 )
									ret := -0.333333
						if( Discount_Zone > 7.64796 )
							if( Equilibrium_Zone <= 24.0263 )
								if( Equilibrium_Zone <= 24.0207 )
									ret := 0.533333
								if( Equilibrium_Zone > 24.0207 )
									ret := 0.978723 // buy
							if( Equilibrium_Zone > 24.0263 )
								if( Internal_Swing_High <= 43.4914 )
									ret := 0.028817
								if( Internal_Swing_High > 43.4914 )
									ret := -0.535714
		if( Swing_Low > 22.0095 )
			if( Premium_Zone <= 58.6181 )
				if( Internal_Swing_Low <= 23.9254 )
					if( Premium_Zone <= 32.6678 )
						if( Discount_Zone <= 18.2189 )
							if( Discount_Zone <= 17.5671 )
								ret := 0.700000 // buy
							if( Discount_Zone > 17.5671 )
								ret := 1.000000 // buy
						if( Discount_Zone > 18.2189 )
							if( atr <= 5.95786 )
								ret := 0.545455
							if( atr > 5.95786 )
								ret := -0.421053
					if( Premium_Zone > 32.6678 )
						if( Discount_Zone <= 17.1331 )
							ret := 0.818182 // buy
						if( Discount_Zone > 17.1331 )
							if( Premium_Zone <= 34.0793 )
								ret := 0.888889 // buy
							if( Premium_Zone > 34.0793 )
								ret := 1.000000 // buy
				if( Internal_Swing_Low > 23.9254 )
					if( Equilibrium_Zone <= 27.7461 )
						if( Premium_Zone <= 33.0813 )
							ret := -0.076923
						if( Premium_Zone > 33.0813 )
							if( Internal_Swing_Low <= 25.7229 )
								ret := -0.588235
							if( Internal_Swing_Low > 25.7229 )
								ret := -1.000000 // sell
					if( Equilibrium_Zone > 27.7461 )
						if( Internal_Swing_Low <= 36.2834 )
							if( atr <= 13.848 )
								if( Equilibrium_Zone <= 37.5858 )
									ret := 0.294118
								if( Equilibrium_Zone > 37.5858 )
									ret := 0.891892 // buy
							if( atr > 13.848 )
								ret := -0.400000
						if( Internal_Swing_Low > 36.2834 )
							if( Discount_Zone <= 32.1718 )
								ret := 0.900000 // buy
							if( Discount_Zone > 32.1718 )
								if( Premium_Zone <= 52.2193 )
									ret := -0.971429 // sell
								if( Premium_Zone > 52.2193 )
									ret := 0.129032
			if( Premium_Zone > 58.6181 )
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
float op_operation = decision_tree_0_LINKUSDT_30Min_6bfaff1d(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


