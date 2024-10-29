//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: U_1Min_1SMA_a9e78b05 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1SMA_a9e78b05", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_a9e78b05(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Internal_Swing_Low <= 13.6333 )
		if( Premium_Zone <= 25.8465 )
			if( atr <= 0.313633 )
				if( Swing_High <= 16.17 )
					if( Internal_Swing_High <= 15.9077 )
						if( Swing_High <= 15.7641 )
							if( atr <= 0.018199 )
								if( Equilibrium_Zone <= 23.61 )
									ret := 0.463415
								if( Equilibrium_Zone > 23.61 )
									ret := -0.250000
							if( atr > 0.018199 )
								if( Equilibrium_Zone <= 14.2582 )
									ret := -0.531250
								if( Equilibrium_Zone > 14.2582 )
									ret := 0.005435
						if( Swing_High > 15.7641 )
							if( Discount_Zone <= 15.4884 )
								if( Swing_High <= 15.7912 )
									ret := 0.666667
								if( Swing_High > 15.7912 )
									ret := 0.962264 // buy
							if( Discount_Zone > 15.4884 )
								if( Premium_Zone <= 16.0384 )
									ret := -0.500000
								if( Premium_Zone > 16.0384 )
									ret := 0.166667
					if( Internal_Swing_High > 15.9077 )
						if( Equilibrium_Zone <= 15.8898 )
							if( Internal_Swing_High <= 23.8208 )
								if( atr <= 0.24745 )
									ret := -0.243243
								if( atr > 0.24745 )
									ret := -0.777778 // sell
							if( Internal_Swing_High > 23.8208 )
								ret := -1.000000 // sell
						if( Equilibrium_Zone > 15.8898 )
							if( Swing_High <= 16.096 )
								if( atr <= 0.271991 )
									ret := -0.073743
								if( atr > 0.271991 )
									ret := -0.238245
							if( Swing_High > 16.096 )
								if( atr <= 0.275439 )
									ret := 0.090909
								if( atr > 0.275439 )
									ret := 0.703704 // buy
				if( Swing_High > 16.17 )
					if( Internal_Swing_High <= 18.2853 )
						if( Internal_Swing_High <= 18.2196 )
							if( Order_Block_High <= 16.7555 )
								if( Premium_Zone <= 18.2287 )
									ret := -0.317490
								if( Premium_Zone > 18.2287 )
									ret := 0.666667
							if( Order_Block_High > 16.7555 )
								if( Equilibrium_Zone <= 17.0487 )
									ret := 0.437500
								if( Equilibrium_Zone > 17.0487 )
									ret := -0.111111
						if( Internal_Swing_High > 18.2196 )
							if( atr <= 0.260656 )
								ret := -0.500000
							if( atr > 0.260656 )
								ret := -1.000000 // sell
					if( Internal_Swing_High > 18.2853 )
						if( Swing_High <= 20.749 )
							if( Premium_Zone <= 18.4097 )
								if( Discount_Zone <= 18.1463 )
									ret := 0.750000 // buy
								if( Discount_Zone > 18.1463 )
									ret := 1.000000 // buy
							if( Premium_Zone > 18.4097 )
								if( Swing_High <= 20.6638 )
									ret := 0.121212
								if( Swing_High > 20.6638 )
									ret := 0.800000 // buy
						if( Swing_High > 20.749 )
							if( Internal_Swing_High <= 22.8324 )
								if( atr <= 0.3075 )
									ret := -0.352941
								if( atr > 0.3075 )
									ret := -0.857143 // sell
							if( Internal_Swing_High > 22.8324 )
								if( Equilibrium_Zone <= 25.37 )
									ret := 0.196262
								if( Equilibrium_Zone > 25.37 )
									ret := -0.583333
			if( atr > 0.313633 )
				if( Order_Block_High <= 23.653 )
					if( Premium_Zone <= 25.5759 )
						if( Swing_High <= 15.7575 )
							if( Internal_Swing_High <= 14.3367 )
								if( Discount_Zone <= 12.1263 )
									ret := 0.572581
								if( Discount_Zone > 12.1263 )
									ret := 0.041536
							if( Internal_Swing_High > 14.3367 )
								if( atr <= 0.470021 )
									ret := -0.075283
								if( atr > 0.470021 )
									ret := 0.009351
						if( Swing_High > 15.7575 )
							if( Internal_Swing_High <= 16.3477 )
								if( Swing_High <= 16.2203 )
									ret := 0.170279
								if( Swing_High > 16.2203 )
									ret := 0.690000
							if( Internal_Swing_High > 16.3477 )
								if( atr <= 0.717277 )
									ret := 0.007547
								if( atr > 0.717277 )
									ret := 0.207535
					if( Premium_Zone > 25.5759 )
						if( Discount_Zone <= 24.0038 )
							if( Premium_Zone <= 25.8212 )
								if( Swing_High <= 24.215 )
									ret := 0.642857
								if( Swing_High > 24.215 )
									ret := -0.111111
							if( Premium_Zone > 25.8212 )
								if( Equilibrium_Zone <= 24.6614 )
									ret := -0.352941
								if( Equilibrium_Zone > 24.6614 )
									ret := 0.666667
						if( Discount_Zone > 24.0038 )
							if( atr <= 0.335785 )
								if( Equilibrium_Zone <= 25.3725 )
									ret := -0.250000
								if( Equilibrium_Zone > 25.3725 )
									ret := 0.756098 // buy
							if( atr > 0.335785 )
								if( Premium_Zone <= 25.6223 )
									ret := -0.555556
								if( Premium_Zone > 25.6223 )
									ret := 0.059603
				if( Order_Block_High > 23.653 )
					if( atr <= 0.518369 )
						if( Premium_Zone <= 24.9537 )
							if( Order_Block_Low <= 24.3291 )
								if( Order_Block_High <= 24.2674 )
									ret := 0.000000
								if( Order_Block_High > 24.2674 )
									ret := -0.500000
							if( Order_Block_Low > 24.3291 )
								if( Discount_Zone <= 23.9024 )
									ret := 0.833333 // buy
								if( Discount_Zone > 23.9024 )
									ret := 0.400000
						if( Premium_Zone > 24.9537 )
							ret := -0.750000 // sell
					if( atr > 0.518369 )
						if( Equilibrium_Zone <= 23.3525 )
							if( atr <= 1.2631 )
								ret := 0.500000
							if( atr > 1.2631 )
								ret := -0.750000 // sell
						if( Equilibrium_Zone > 23.3525 )
							if( Equilibrium_Zone <= 23.5186 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 23.5186 )
								if( Swing_High <= 25.0615 )
									ret := -0.557377
								if( Swing_High > 25.0615 )
									ret := -1.000000 // sell
		if( Premium_Zone > 25.8465 )
			if( atr <= 1.3276 )
				if( Discount_Zone <= 24.055 )
					if( Premium_Zone <= 26.0688 )
						if( atr <= 0.99886 )
							if( atr <= 0.951995 )
								if( Discount_Zone <= 24.0134 )
									ret := -0.461538
								if( Discount_Zone > 24.0134 )
									ret := -0.928571 // sell
							if( atr > 0.951995 )
								if( Equilibrium_Zone <= 24.9689 )
									ret := 0.500000
								if( Equilibrium_Zone > 24.9689 )
									ret := 0.052632
						if( atr > 0.99886 )
							if( Premium_Zone <= 26.0215 )
								if( Internal_Swing_High <= 24.2235 )
									ret := -0.505263
								if( Internal_Swing_High > 24.2235 )
									ret := -0.804878 // sell
							if( Premium_Zone > 26.0215 )
								if( Internal_Swing_High <= 12.105 )
									ret := -0.304348
								if( Internal_Swing_High > 12.105 )
									ret := 0.000000
					if( Premium_Zone > 26.0688 )
						if( Discount_Zone <= 23.6518 )
							ret := -1.000000 // sell
						if( Discount_Zone > 23.6518 )
							if( Equilibrium_Zone <= 24.9255 )
								ret := -0.812500 // sell
							if( Equilibrium_Zone > 24.9255 )
								ret := -1.000000 // sell
				if( Discount_Zone > 24.055 )
					if( Internal_Swing_High <= 25.3405 )
						if( Equilibrium_Zone <= 25.2745 )
							if( atr <= 0.664956 )
								ret := 0.000000
							if( atr > 0.664956 )
								if( Premium_Zone <= 25.8962 )
									ret := 0.000000
								if( Premium_Zone > 25.8962 )
									ret := 0.200000
						if( Equilibrium_Zone > 25.2745 )
							if( Internal_Swing_High <= 12.6225 )
								if( Discount_Zone <= 24.7144 )
									ret := 0.500000
								if( Discount_Zone > 24.7144 )
									ret := 0.200000
							if( Internal_Swing_High > 12.6225 )
								ret := 0.000000
					if( Internal_Swing_High > 25.3405 )
						ret := -0.285714
			if( atr > 1.3276 )
				if( Discount_Zone <= 23.1234 )
					if( Discount_Zone <= 22.7812 )
						if( Equilibrium_Zone <= 24.3417 )
							if( Internal_Swing_High <= 23.2899 )
								if( Equilibrium_Zone <= 24.133 )
									ret := 0.125000
								if( Equilibrium_Zone > 24.133 )
									ret := -0.613636
							if( Internal_Swing_High > 23.2899 )
								if( Internal_Swing_High <= 23.7692 )
									ret := 0.823529 // buy
								if( Internal_Swing_High > 23.7692 )
									ret := -0.666667
						if( Equilibrium_Zone > 24.3417 )
							if( Internal_Swing_High <= 11.575 )
								if( Discount_Zone <= 22.7456 )
									ret := 0.547619
								if( Discount_Zone > 22.7456 )
									ret := -0.200000
							if( Internal_Swing_High > 11.575 )
								if( Discount_Zone <= 22.6904 )
									ret := -0.351852
								if( Discount_Zone > 22.6904 )
									ret := 0.250000
					if( Discount_Zone > 22.7812 )
						ret := -1.000000 // sell
				if( Discount_Zone > 23.1234 )
					if( Internal_Swing_High <= 24.1798 )
						ret := 1.000000 // buy
					if( Internal_Swing_High > 24.1798 )
						ret := 0.250000
	if( Internal_Swing_Low > 13.6333 )
		if( Equilibrium_Zone <= 15.7611 )
			if( Internal_Swing_Low <= 14.2403 )
				if( atr <= 0.433921 )
					if( Internal_Swing_High <= 14.1277 )
						if( Equilibrium_Zone <= 14.3515 )
							if( Equilibrium_Zone <= 13.9065 )
								if( Equilibrium_Zone <= 13.9044 )
									ret := 0.909091 // buy
								if( Equilibrium_Zone > 13.9044 )
									ret := -0.105263
							if( Equilibrium_Zone > 13.9065 )
								if( Internal_Swing_Low <= 14.2216 )
									ret := 0.669118
								if( Internal_Swing_Low > 14.2216 )
									ret := 1.000000 // buy
						if( Equilibrium_Zone > 14.3515 )
							ret := -0.500000
					if( Internal_Swing_High > 14.1277 )
						ret := -0.600000
				if( atr > 0.433921 )
					if( Equilibrium_Zone <= 14.0167 )
						if( Internal_Swing_Low <= 14.1809 )
							if( Discount_Zone <= 12.0824 )
								ret := 0.500000
							if( Discount_Zone > 12.0824 )
								ret := 1.000000 // buy
						if( Internal_Swing_Low > 14.1809 )
							if( atr <= 1.615 )
								ret := 0.200000
							if( atr > 1.615 )
								ret := 1.000000 // buy
					if( Equilibrium_Zone > 14.0167 )
						if( Premium_Zone <= 14.5256 )
							ret := -1.000000 // sell
						if( Premium_Zone > 14.5256 )
							if( Swing_Low <= 13.7494 )
								if( atr <= 1.66586 )
									ret := 0.116505
								if( atr > 1.66586 )
									ret := 1.000000 // buy
							if( Swing_Low > 13.7494 )
								if( atr <= 0.797022 )
									ret := 0.333333
								if( atr > 0.797022 )
									ret := 0.805556 // buy
			if( Internal_Swing_Low > 14.2403 )
				if( Equilibrium_Zone <= 14.3331 )
					if( Premium_Zone <= 15.8583 )
						if( Equilibrium_Zone <= 14.2863 )
							if( atr <= 1.83603 )
								if( Discount_Zone <= 14.0177 )
									ret := -0.048780
								if( Discount_Zone > 14.0177 )
									ret := 0.590909
							if( atr > 1.83603 )
								ret := 1.000000 // buy
						if( Equilibrium_Zone > 14.2863 )
							if( Discount_Zone <= 13.9863 )
								ret := -0.166667
							if( Discount_Zone > 13.9863 )
								if( Internal_Swing_Low <= 14.3188 )
									ret := -0.875000 // sell
								if( Internal_Swing_Low > 14.3188 )
									ret := -0.500000
					if( Premium_Zone > 15.8583 )
						if( Internal_Swing_Low <= 14.4932 )
							if( Internal_Swing_Low <= 14.4675 )
								ret := 0.200000
							if( Internal_Swing_Low > 14.4675 )
								ret := -0.142857
						if( Internal_Swing_Low > 14.4932 )
							if( Internal_Swing_Low <= 14.6203 )
								if( Internal_Swing_Low <= 14.5645 )
									ret := -0.833333 // sell
								if( Internal_Swing_Low > 14.5645 )
									ret := -0.692308
							if( Internal_Swing_Low > 14.6203 )
								ret := -1.000000 // sell
				if( Equilibrium_Zone > 14.3331 )
					if( Premium_Zone <= 15.7208 )
						if( Discount_Zone <= 13.9396 )
							if( Internal_Swing_Low <= 14.5955 )
								if( atr <= 0.929266 )
									ret := 0.729323 // buy
								if( atr > 0.929266 )
									ret := 0.131579
							if( Internal_Swing_Low > 14.5955 )
								if( Premium_Zone <= 15.4713 )
									ret := -0.150000
								if( Premium_Zone > 15.4713 )
									ret := -0.809524 // sell
						if( Discount_Zone > 13.9396 )
							if( Internal_Swing_Low <= 14.8914 )
								if( Premium_Zone <= 14.8907 )
									ret := 0.226994
								if( Premium_Zone > 14.8907 )
									ret := -0.272358
							if( Internal_Swing_Low > 14.8914 )
								if( Internal_Swing_Low <= 15.2496 )
									ret := 0.362445
								if( Internal_Swing_Low > 15.2496 )
									ret := -0.021352
					if( Premium_Zone > 15.7208 )
						if( Order_Block_Low <= 15.49 )
							if( Internal_Swing_Low <= 15.4455 )
								if( Internal_Swing_Low <= 15.3905 )
									ret := 0.420048
								if( Internal_Swing_Low > 15.3905 )
									ret := 0.833333 // buy
							if( Internal_Swing_Low > 15.4455 )
								if( Equilibrium_Zone <= 14.9925 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 14.9925 )
									ret := 0.213542
						if( Order_Block_Low > 15.49 )
							if( Premium_Zone <= 16.0646 )
								ret := -1.000000 // sell
							if( Premium_Zone > 16.0646 )
								ret := -0.250000
		if( Equilibrium_Zone > 15.7611 )
			if( atr <= 0.559649 )
				if( Premium_Zone <= 16.0635 )
					if( Equilibrium_Zone <= 15.8014 )
						if( Swing_Low <= 7.845 )
							if( Internal_Swing_Low <= 15.8101 )
								if( atr <= 0.203231 )
									ret := -0.066667
								if( atr > 0.203231 )
									ret := 0.285714
							if( Internal_Swing_Low > 15.8101 )
								if( Discount_Zone <= 15.4907 )
									ret := -0.444444
								if( Discount_Zone > 15.4907 )
									ret := -1.000000 // sell
						if( Swing_Low > 7.845 )
							ret := -1.000000 // sell
					if( Equilibrium_Zone > 15.8014 )
						if( Swing_Low <= 0.887479 )
							if( Equilibrium_Zone <= 16.3186 )
								if( Internal_Swing_Low <= 15.8201 )
									ret := 0.000000
								if( Internal_Swing_Low > 15.8201 )
									ret := 0.250000
							if( Equilibrium_Zone > 16.3186 )
								if( Internal_Swing_Low <= 23.805 )
									ret := -0.307692
								if( Internal_Swing_Low > 23.805 )
									ret := 0.166667
						if( Swing_Low > 0.887479 )
							if( Equilibrium_Zone <= 23.8212 )
								ret := 0.800000 // buy
							if( Equilibrium_Zone > 23.8212 )
								ret := 0.000000
				if( Premium_Zone > 16.0635 )
					if( Premium_Zone <= 16.1813 )
						if( Internal_Swing_Low <= 15.8289 )
							if( atr <= 0.297309 )
								if( Swing_Low <= 15.755 )
									ret := 0.888889 // buy
								if( Swing_Low > 15.755 )
									ret := 0.500000
							if( atr > 0.297309 )
								if( Premium_Zone <= 16.1601 )
									ret := -0.034483
								if( Premium_Zone > 16.1601 )
									ret := 0.650000
						if( Internal_Swing_Low > 15.8289 )
							if( Equilibrium_Zone <= 15.9719 )
								if( Premium_Zone <= 16.1087 )
									ret := 0.366667
								if( Premium_Zone > 16.1087 )
									ret := -0.148936
							if( Equilibrium_Zone > 15.9719 )
								ret := 0.750000 // buy
					if( Premium_Zone > 16.1813 )
						if( Premium_Zone <= 19.9413 )
							if( Premium_Zone <= 18.1799 )
								if( Discount_Zone <= 17.3678 )
									ret := 0.119643
								if( Discount_Zone > 17.3678 )
									ret := 0.308351
							if( Premium_Zone > 18.1799 )
								if( Internal_Swing_Low <= 17.8648 )
									ret := -0.211604
								if( Internal_Swing_Low > 17.8648 )
									ret := 0.037748
						if( Premium_Zone > 19.9413 )
							if( Equilibrium_Zone <= 23.1425 )
								if( atr <= 0.505046 )
									ret := 0.175896
								if( atr > 0.505046 )
									ret := 0.391499
							if( Equilibrium_Zone > 23.1425 )
								if( Internal_Swing_Low <= 25.3516 )
									ret := 0.107424
								if( Internal_Swing_Low > 25.3516 )
									ret := -0.261364
			if( atr > 0.559649 )
				if( Discount_Zone <= 15.1578 )
					if( Internal_Swing_Low <= 15.3233 )
						if( Equilibrium_Zone <= 15.8712 )
							if( Swing_Low <= 7.61 )
								if( Internal_Swing_Low <= 15.2773 )
									ret := 1.000000 // buy
								if( Internal_Swing_Low > 15.2773 )
									ret := 0.500000
							if( Swing_Low > 7.61 )
								if( Swing_Low <= 15.2702 )
									ret := -0.428571
								if( Swing_Low > 15.2702 )
									ret := 0.400000
						if( Equilibrium_Zone > 15.8712 )
							ret := 1.000000 // buy
					if( Internal_Swing_Low > 15.3233 )
						if( Internal_Swing_Low <= 16.7156 )
							if( Premium_Zone <= 18.5663 )
								if( Discount_Zone <= 14.9594 )
									ret := -0.044643
								if( Discount_Zone > 14.9594 )
									ret := -0.407080
							if( Premium_Zone > 18.5663 )
								if( Premium_Zone <= 18.7669 )
									ret := -0.923077 // sell
								if( Premium_Zone > 18.7669 )
									ret := -0.571429
						if( Internal_Swing_Low > 16.7156 )
							if( Internal_Swing_Low <= 17.0397 )
								if( Internal_Swing_Low <= 16.7392 )
									ret := -0.750000 // sell
								if( Internal_Swing_Low > 16.7392 )
									ret := -1.000000 // sell
							if( Internal_Swing_Low > 17.0397 )
								ret := -0.250000
				if( Discount_Zone > 15.1578 )
					if( Internal_Swing_High <= 22.4675 )
						if( Premium_Zone <= 17.4513 )
							if( Equilibrium_Zone <= 16.8048 )
								if( Discount_Zone <= 15.9005 )
									ret := -0.129825
								if( Discount_Zone > 15.9005 )
									ret := 0.156522
							if( Equilibrium_Zone > 16.8048 )
								if( Internal_Swing_Low <= 16.565 )
									ret := -0.473684
								if( Internal_Swing_Low > 16.565 )
									ret := -0.864865 // sell
						if( Premium_Zone > 17.4513 )
							if( Premium_Zone <= 17.5751 )
								if( Equilibrium_Zone <= 16.5651 )
									ret := 0.666667
								if( Equilibrium_Zone > 16.5651 )
									ret := 0.368715
							if( Premium_Zone > 17.5751 )
								if( Swing_Low <= 17.4805 )
									ret := 0.058316
								if( Swing_Low > 17.4805 )
									ret := 0.197682
					if( Internal_Swing_High > 22.4675 )
						if( Swing_Low <= 23.3501 )
							if( atr <= 0.570488 )
								ret := 0.142857
							if( atr > 0.570488 )
								if( Discount_Zone <= 23.98 )
									ret := -0.377551
								if( Discount_Zone > 23.98 )
									ret := -0.875000 // sell
						if( Swing_Low > 23.3501 )
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
float op_operation = decision_tree_0_U_1Min_a9e78b05(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


