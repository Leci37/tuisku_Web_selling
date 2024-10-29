//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: SNOW_1Min_1SMA_651f3cfe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1SMA_651f3cfe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_651f3cfe(atr, FVG_UpInt, Bullish_CHoCHInt, Discount_Zone, Swing_High, FVG_DownInt, Internal_Swing_Low, Order_Block_Low, Bearish_CHoCHInt, Bearish_BOSInt, Equilibrium_Zone, Order_Block_High, Internal_Swing_High, Swing_Low, Premium_Zone, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Discount_Zone <= 111.081 )
		if( Internal_Swing_Low <= 116.811 )
			if( Discount_Zone <= 106.652 )
				if( atr <= 12.4697 )
					if( Equilibrium_Zone <= 110.084 )
						if( Equilibrium_Zone <= 109.818 )
							if( Internal_Swing_High <= 110.27 )
								if( Discount_Zone <= 104.835 )
									ret := 0.286458
								if( Discount_Zone > 104.835 )
									ret := -0.029613
							if( Internal_Swing_High > 110.27 )
								if( Internal_Swing_High <= 149.24 )
									ret := -0.434783
								if( Internal_Swing_High > 149.24 )
									ret := -0.846154 // sell
						if( Equilibrium_Zone > 109.818 )
							if( Premium_Zone <= 115.093 )
								if( Equilibrium_Zone <= 109.999 )
									ret := 0.931818 // buy
								if( Equilibrium_Zone > 109.999 )
									ret := 0.395833
							if( Premium_Zone > 115.093 )
								if( atr <= 11.6916 )
									ret := -0.153846
								if( atr > 11.6916 )
									ret := 0.500000
					if( Equilibrium_Zone > 110.084 )
						if( Premium_Zone <= 115.656 )
							if( Swing_High <= 111.05 )
								if( Swing_Low <= 53.6959 )
									ret := -0.532847
								if( Swing_Low > 53.6959 )
									ret := 0.214286
							if( Swing_High > 111.05 )
								if( atr <= 3.81495 )
									ret := 0.476190
								if( atr > 3.81495 )
									ret := -0.400000
						if( Premium_Zone > 115.656 )
							if( atr <= 7.48702 )
								if( Discount_Zone <= 103.667 )
									ret := 0.900000 // buy
								if( Discount_Zone > 103.667 )
									ret := 0.091765
							if( atr > 7.48702 )
								if( Equilibrium_Zone <= 114.99 )
									ret := -0.241270
								if( Equilibrium_Zone > 114.99 )
									ret := 0.937500 // buy
				if( atr > 12.4697 )
					if( Internal_Swing_High <= 109.816 )
						if( Premium_Zone <= 123.072 )
							ret := 1.000000 // buy
						if( Premium_Zone > 123.072 )
							if( Internal_Swing_High <= 108.557 )
								ret := 0.700000 // buy
							if( Internal_Swing_High > 108.557 )
								ret := 1.000000 // buy
					if( Internal_Swing_High > 109.816 )
						ret := 0.500000
			if( Discount_Zone > 106.652 )
				if( Premium_Zone <= 111.73 )
					if( Discount_Zone <= 107.951 )
						if( Equilibrium_Zone <= 108.231 )
							if( Internal_Swing_Low <= 53.75 )
								if( Premium_Zone <= 109.443 )
									ret := 0.000000
								if( Premium_Zone > 109.443 )
									ret := 0.461538
							if( Internal_Swing_Low > 53.75 )
								if( atr <= 1.41553 )
									ret := 0.750000 // buy
								if( atr > 1.41553 )
									ret := 1.000000 // buy
						if( Equilibrium_Zone > 108.231 )
							if( atr <= 2.15891 )
								if( Discount_Zone <= 107.183 )
									ret := -0.412500
								if( Discount_Zone > 107.183 )
									ret := -0.067227
							if( atr > 2.15891 )
								if( Premium_Zone <= 111.568 )
									ret := 0.000000
								if( Premium_Zone > 111.568 )
									ret := 0.724138 // buy
					if( Discount_Zone > 107.951 )
						if( Discount_Zone <= 108.237 )
							if( Premium_Zone <= 111.635 )
								if( Order_Block_Low <= 109.26 )
									ret := 0.743719 // buy
								if( Order_Block_Low > 109.26 )
									ret := 0.062500
							if( Premium_Zone > 111.635 )
								if( atr <= 1.81604 )
									ret := 0.150943
								if( atr > 1.81604 )
									ret := 1.000000 // buy
						if( Discount_Zone > 108.237 )
							if( Premium_Zone <= 111.332 )
								if( atr <= 0.952917 )
									ret := 0.256055
								if( atr > 0.952917 )
									ret := -0.023881
							if( Premium_Zone > 111.332 )
								if( Discount_Zone <= 108.824 )
									ret := 0.600000
								if( Discount_Zone > 108.824 )
									ret := 0.235714
				if( Premium_Zone > 111.73 )
					if( Premium_Zone <= 111.75 )
						if( Discount_Zone <= 109.482 )
							if( Discount_Zone <= 107.653 )
								if( Internal_Swing_High <= 55.13 )
									ret := 0.181818
								if( Internal_Swing_High > 55.13 )
									ret := 0.000000
							if( Discount_Zone > 107.653 )
								if( Premium_Zone <= 111.743 )
									ret := -0.763158 // sell
								if( Premium_Zone > 111.743 )
									ret := -0.358974
						if( Discount_Zone > 109.482 )
							ret := 1.000000 // buy
					if( Premium_Zone > 111.75 )
						if( atr <= 4.76078 )
							if( atr <= 4.31339 )
								if( Premium_Zone <= 118.497 )
									ret := 0.089183
								if( Premium_Zone > 118.497 )
									ret := 0.634921
							if( atr > 4.31339 )
								if( Premium_Zone <= 118.883 )
									ret := 0.067873
								if( Premium_Zone > 118.883 )
									ret := -0.300000
						if( atr > 4.76078 )
							if( Equilibrium_Zone <= 113.298 )
								if( Premium_Zone <= 117.046 )
									ret := 0.241379
								if( Premium_Zone > 117.046 )
									ret := 0.658537
							if( Equilibrium_Zone > 113.298 )
								if( Discount_Zone <= 109.975 )
									ret := 0.037152
								if( Discount_Zone > 109.975 )
									ret := 0.422764
		if( Internal_Swing_Low > 116.811 )
			if( Internal_Swing_Low <= 118.776 )
				if( Discount_Zone <= 110.811 )
					if( Premium_Zone <= 122.569 )
						ret := 1.000000 // buy
					if( Premium_Zone > 122.569 )
						if( Internal_Swing_Low <= 117.944 )
							ret := 0.909091 // buy
						if( Internal_Swing_Low > 117.944 )
							ret := 0.000000
				if( Discount_Zone > 110.811 )
					if( Equilibrium_Zone <= 115.561 )
						ret := 0.800000 // buy
					if( Equilibrium_Zone > 115.561 )
						if( Internal_Swing_Low <= 117.156 )
							ret := 0.000000
						if( Internal_Swing_Low > 117.156 )
							ret := 0.250000
			if( Internal_Swing_Low > 118.776 )
				if( Swing_Low <= 147.84 )
					if( Discount_Zone <= 108.475 )
						if( Discount_Zone <= 60.9618 )
							if( Internal_Swing_Low <= 150.48 )
								if( Equilibrium_Zone <= 149.278 )
									ret := 0.408163
								if( Equilibrium_Zone > 149.278 )
									ret := 1.000000 // buy
							if( Internal_Swing_Low > 150.48 )
								ret := -0.750000 // sell
						if( Discount_Zone > 60.9618 )
							if( Internal_Swing_Low <= 119.306 )
								ret := 0.941176 // buy
							if( Internal_Swing_Low > 119.306 )
								if( Premium_Zone <= 123.069 )
									ret := 0.000000
								if( Premium_Zone > 123.069 )
									ret := 0.928571 // buy
					if( Discount_Zone > 108.475 )
						if( Discount_Zone <= 109.128 )
							if( Equilibrium_Zone <= 116.753 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 116.753 )
								if( Internal_Swing_Low <= 120.265 )
									ret := -0.250000
								if( Internal_Swing_Low > 120.265 )
									ret := -0.166667
						if( Discount_Zone > 109.128 )
							if( Discount_Zone <= 110.111 )
								if( Discount_Zone <= 109.172 )
									ret := 0.000000
								if( Discount_Zone > 109.172 )
									ret := 0.676471
							if( Discount_Zone > 110.111 )
								if( atr <= 9.765 )
									ret := 0.000000
								if( atr > 9.765 )
									ret := 0.071429
				if( Swing_Low > 147.84 )
					if( Internal_Swing_Low <= 149.598 )
						ret := -0.500000
					if( Internal_Swing_Low > 149.598 )
						ret := -0.166667
	if( Discount_Zone > 111.081 )
		if( Premium_Zone <= 121.697 )
			if( Discount_Zone <= 112.759 )
				if( Discount_Zone <= 111.235 )
					if( Equilibrium_Zone <= 114.889 )
						if( Equilibrium_Zone <= 113.389 )
							if( Internal_Swing_Low <= 112.672 )
								if( Premium_Zone <= 113.586 )
									ret := 0.571429
								if( Premium_Zone > 113.586 )
									ret := -0.142857
							if( Internal_Swing_Low > 112.672 )
								if( Internal_Swing_Low <= 113.13 )
									ret := 0.923077 // buy
								if( Internal_Swing_Low > 113.13 )
									ret := 0.500000
						if( Equilibrium_Zone > 113.389 )
							if( Swing_Low <= 112.615 )
								if( Discount_Zone <= 111.2 )
									ret := -0.371648
								if( Discount_Zone > 111.2 )
									ret := -0.767123 // sell
							if( Swing_Low > 112.615 )
								if( Swing_Low <= 112.627 )
									ret := 1.000000 // buy
								if( Swing_Low > 112.627 )
									ret := 0.176471
					if( Equilibrium_Zone > 114.889 )
						if( Equilibrium_Zone <= 114.983 )
							if( Swing_High <= 58.088 )
								if( Order_Block_High <= 56.6025 )
									ret := 0.675000
								if( Order_Block_High > 56.6025 )
									ret := 1.000000 // buy
							if( Swing_High > 58.088 )
								ret := -0.600000
						if( Equilibrium_Zone > 114.983 )
							if( Order_Block_High <= 56.6297 )
								if( atr <= 4.02005 )
									ret := -0.565217
								if( atr > 4.02005 )
									ret := 0.333333
							if( Order_Block_High > 56.6297 )
								if( Discount_Zone <= 111.181 )
									ret := 1.000000 // buy
								if( Discount_Zone > 111.181 )
									ret := 0.500000
				if( Discount_Zone > 111.235 )
					if( Swing_High <= 113.964 )
						if( Discount_Zone <= 111.494 )
							if( Order_Block_Low <= 112.373 )
								if( atr <= 3.8459 )
									ret := 0.255224
								if( atr > 3.8459 )
									ret := -0.130952
							if( Order_Block_Low > 112.373 )
								if( Swing_Low <= 112.717 )
									ret := -0.700000 // sell
								if( Swing_Low > 112.717 )
									ret := 0.000000
						if( Discount_Zone > 111.494 )
							if( Discount_Zone <= 111.625 )
								if( Equilibrium_Zone <= 112.95 )
									ret := 0.322581
								if( Equilibrium_Zone > 112.95 )
									ret := -0.297059
							if( Discount_Zone > 111.625 )
								if( Bearish_BOSInt <= 0.5 )
									ret := 0.012758
								if( Bearish_BOSInt > 0.5 )
									ret := 0.425926
					if( Swing_High > 113.964 )
						if( Equilibrium_Zone <= 114.631 )
							if( Discount_Zone <= 111.638 )
								if( atr <= 2.01165 )
									ret := 0.714286 // buy
								if( atr > 2.01165 )
									ret := -0.210526
							if( Discount_Zone > 111.638 )
								if( Discount_Zone <= 112.088 )
									ret := 0.820225 // buy
								if( Discount_Zone > 112.088 )
									ret := 0.178571
						if( Equilibrium_Zone > 114.631 )
							if( Order_Block_Low <= 117.373 )
								if( Order_Block_Low <= 57.6408 )
									ret := 0.040000
								if( Order_Block_Low > 57.6408 )
									ret := -0.666667
							if( Order_Block_Low > 117.373 )
								ret := 1.000000 // buy
			if( Discount_Zone > 112.759 )
				if( Equilibrium_Zone <= 119.845 )
					if( atr <= 2.16807 )
						if( atr <= 1.917 )
							if( Internal_Swing_Low <= 116.865 )
								if( Premium_Zone <= 116.065 )
									ret := -0.178827
								if( Premium_Zone > 116.065 )
									ret := -0.041353
							if( Internal_Swing_Low > 116.865 )
								if( Discount_Zone <= 117.876 )
									ret := -0.590909
								if( Discount_Zone > 117.876 )
									ret := 0.183673
						if( atr > 1.917 )
							if( Equilibrium_Zone <= 117.33 )
								if( Order_Block_High <= 114.249 )
									ret := -0.470745
								if( Order_Block_High > 114.249 )
									ret := -0.925926 // sell
							if( Equilibrium_Zone > 117.33 )
								if( Premium_Zone <= 120.85 )
									ret := 0.404255
								if( Premium_Zone > 120.85 )
									ret := -0.677419
					if( atr > 2.16807 )
						if( atr <= 2.17689 )
							ret := 1.000000 // buy
						if( atr > 2.17689 )
							if( Premium_Zone <= 121.33 )
								if( Bullish_BOSInt <= 0.5 )
									ret := -0.032959
								if( Bullish_BOSInt > 0.5 )
									ret := -0.526316
							if( Premium_Zone > 121.33 )
								if( Internal_Swing_Low <= 118.845 )
									ret := 0.540000
								if( Internal_Swing_Low > 118.845 )
									ret := -0.750000 // sell
				if( Equilibrium_Zone > 119.845 )
					if( Equilibrium_Zone <= 119.882 )
						if( Internal_Swing_Low <= 59.6 )
							if( Discount_Zone <= 118.17 )
								ret := -1.000000 // sell
							if( Discount_Zone > 118.17 )
								ret := -0.500000
						if( Internal_Swing_Low > 59.6 )
							ret := -0.500000
					if( Equilibrium_Zone > 119.882 )
						if( Internal_Swing_Low <= 119.8 )
							if( Discount_Zone <= 118.212 )
								ret := 0.062500
							if( Discount_Zone > 118.212 )
								if( Discount_Zone <= 118.289 )
									ret := -1.000000 // sell
								if( Discount_Zone > 118.289 )
									ret := -0.250000
						if( Internal_Swing_Low > 119.8 )
							if( Internal_Swing_Low <= 120.046 )
								ret := -0.750000 // sell
							if( Internal_Swing_Low > 120.046 )
								ret := -0.857143 // sell
		if( Premium_Zone > 121.697 )
			if( Discount_Zone <= 123.337 )
				if( Internal_Swing_High <= 130.035 )
					if( Swing_Low <= 123.384 )
						if( Internal_Swing_Low <= 132.298 )
							if( Premium_Zone <= 128.031 )
								if( Swing_Low <= 118.192 )
									ret := 0.079798
								if( Swing_Low > 118.192 )
									ret := 0.375451
							if( Premium_Zone > 128.031 )
								if( Premium_Zone <= 133.112 )
									ret := 0.249477
								if( Premium_Zone > 133.112 )
									ret := 0.057851
						if( Internal_Swing_Low > 132.298 )
							if( Internal_Swing_Low <= 132.391 )
								if( Internal_Swing_Low <= 132.328 )
									ret := -1.000000 // sell
								if( Internal_Swing_Low > 132.328 )
									ret := -0.500000
							if( Internal_Swing_Low > 132.391 )
								ret := -1.000000 // sell
					if( Swing_Low > 123.384 )
						if( Order_Block_High <= 125.213 )
							if( Equilibrium_Zone <= 124.649 )
								if( Premium_Zone <= 126.367 )
									ret := 0.000000
								if( Premium_Zone > 126.367 )
									ret := 0.600000
							if( Equilibrium_Zone > 124.649 )
								if( atr <= 7.52495 )
									ret := -0.554622
								if( atr > 7.52495 )
									ret := 0.235294
						if( Order_Block_High > 125.213 )
							if( Equilibrium_Zone <= 128.606 )
								if( Premium_Zone <= 134.422 )
									ret := 1.000000 // buy
								if( Premium_Zone > 134.422 )
									ret := 0.750000 // buy
							if( Equilibrium_Zone > 128.606 )
								ret := -0.333333
				if( Internal_Swing_High > 130.035 )
					if( atr <= 6.6247 )
						if( atr <= 6.22977 )
							if( Equilibrium_Zone <= 126.898 )
								ret := -0.333333
							if( Equilibrium_Zone > 126.898 )
								if( Premium_Zone <= 132.685 )
									ret := 0.000000
								if( Premium_Zone > 132.685 )
									ret := 0.800000 // buy
						if( atr > 6.22977 )
							if( Order_Block_High <= 65.105 )
								ret := 1.000000 // buy
							if( Order_Block_High > 65.105 )
								if( Discount_Zone <= 120.207 )
									ret := 0.250000
								if( Discount_Zone > 120.207 )
									ret := 1.000000 // buy
					if( atr > 6.6247 )
						if( Discount_Zone <= 120.518 )
							if( Premium_Zone <= 138.847 )
								if( Internal_Swing_High <= 130.564 )
									ret := 0.500000
								if( Internal_Swing_High > 130.564 )
									ret := -0.541667
							if( Premium_Zone > 138.847 )
								if( Internal_Swing_High <= 130.556 )
									ret := 0.750000 // buy
								if( Internal_Swing_High > 130.556 )
									ret := 0.500000
						if( Discount_Zone > 120.518 )
							if( Equilibrium_Zone <= 128.306 )
								if( Internal_Swing_High <= 131.175 )
									ret := 0.625000
								if( Internal_Swing_High > 131.175 )
									ret := -1.000000 // sell
							if( Equilibrium_Zone > 128.306 )
								if( atr <= 6.7659 )
									ret := -0.250000
								if( atr > 6.7659 )
									ret := 0.641975
			if( Discount_Zone > 123.337 )
				if( Equilibrium_Zone <= 175.368 )
					if( Equilibrium_Zone <= 164.586 )
						if( Premium_Zone <= 180.434 )
							if( Internal_Swing_Low <= 146.193 )
								if( atr <= 3.77006 )
									ret := 0.034917
								if( atr > 3.77006 )
									ret := -0.029572
							if( Internal_Swing_Low > 146.193 )
								if( Internal_Swing_Low <= 164.423 )
									ret := 0.114416
								if( Internal_Swing_Low > 164.423 )
									ret := -0.384615
						if( Premium_Zone > 180.434 )
							if( atr <= 16.4231 )
								ret := 0.428571
							if( atr > 16.4231 )
								if( Internal_Swing_High <= 157.371 )
									ret := 0.764706 // buy
								if( Internal_Swing_High > 157.371 )
									ret := 1.000000 // buy
					if( Equilibrium_Zone > 164.586 )
						if( Equilibrium_Zone <= 169.009 )
							if( Equilibrium_Zone <= 168.822 )
								if( Internal_Swing_High <= 164.644 )
									ret := -0.183206
								if( Internal_Swing_High > 164.644 )
									ret := -0.514286
							if( Equilibrium_Zone > 168.822 )
								if( Equilibrium_Zone <= 168.873 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 168.873 )
									ret := -0.500000
						if( Equilibrium_Zone > 169.009 )
							if( Equilibrium_Zone <= 170.8 )
								if( Internal_Swing_Low <= 170.416 )
									ret := 0.177419
								if( Internal_Swing_Low > 170.416 )
									ret := -0.590909
							if( Equilibrium_Zone > 170.8 )
								if( Internal_Swing_Low <= 82.1545 )
									ret := -0.465649
								if( Internal_Swing_Low > 82.1545 )
									ret := 0.094340
				if( Equilibrium_Zone > 175.368 )
					if( Premium_Zone <= 197.184 )
						if( atr <= 21.4881 )
							if( Premium_Zone <= 196.7 )
								ret := 1.000000 // buy
							if( Premium_Zone > 196.7 )
								if( Premium_Zone <= 196.817 )
									ret := 0.700000 // buy
								if( Premium_Zone > 196.817 )
									ret := 1.000000 // buy
						if( atr > 21.4881 )
							if( Internal_Swing_High <= 170.16 )
								if( atr <= 21.4915 )
									ret := 0.069767
								if( atr > 21.4915 )
									ret := 0.600000
							if( Internal_Swing_High > 170.16 )
								ret := -0.500000
					if( Premium_Zone > 197.184 )
						if( Premium_Zone <= 197.291 )
							if( Discount_Zone <= 153.544 )
								ret := 1.000000 // buy
							if( Discount_Zone > 153.544 )
								if( Premium_Zone <= 197.246 )
									ret := 1.000000 // buy
								if( Premium_Zone > 197.246 )
									ret := 0.800000 // buy
						if( Premium_Zone > 197.291 )
							if( Internal_Swing_High <= 170.07 )
								if( Internal_Swing_Low <= 169.528 )
									ret := 0.814815 // buy
								if( Internal_Swing_Low > 169.528 )
									ret := 0.571429
							if( Internal_Swing_High > 170.07 )
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
float op_operation = decision_tree_0_SNOW_1Min_651f3cfe(atr, FVG_UpInt, Bullish_CHoCHInt, Discount_Zone, Swing_High, FVG_DownInt, Internal_Swing_Low, Order_Block_Low, Bearish_CHoCHInt, Bearish_BOSInt, Equilibrium_Zone, Order_Block_High, Internal_Swing_High, Swing_Low, Premium_Zone, Bullish_BOSInt)

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


