//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: MELI_15Min_1SMA_a8bb86c4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1SMA_a8bb86c4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_a8bb86c4(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Discount_Zone <= 793.991 )
		if( Discount_Zone <= 725.096 )
			if( Internal_Swing_Low <= 811.81 )
				if( Swing_Low <= 772.87 )
					if( Swing_Low <= 656.84 )
						if( Order_Block_High <= 655.856 )
							if( Internal_Swing_Low <= 709.5 )
								if( Swing_Low <= 305.492 )
									ret := 0.050141
								if( Swing_Low > 305.492 )
									ret := 0.223824
							if( Internal_Swing_Low > 709.5 )
								if( Discount_Zone <= 670.947 )
									ret := 0.162857
								if( Discount_Zone > 670.947 )
									ret := 0.663636
						if( Order_Block_High > 655.856 )
							if( atr <= 302.679 )
								if( atr <= 131.866 )
									ret := 0.534884
								if( atr > 131.866 )
									ret := -0.180328
							if( atr > 302.679 )
								if( Swing_High <= 1173.69 )
									ret := 1.000000 // buy
								if( Swing_High > 1173.69 )
									ret := 0.666667
					if( Swing_Low > 656.84 )
						if( atr <= 285.064 )
							if( Premium_Zone <= 942.619 )
								if( Internal_Swing_Low <= 761.541 )
									ret := -0.310606
								if( Internal_Swing_Low > 761.541 )
									ret := -0.937500 // sell
							if( Premium_Zone > 942.619 )
								if( atr <= 211.135 )
									ret := 0.433333
								if( atr > 211.135 )
									ret := -0.375000
						if( atr > 285.064 )
							if( Internal_Swing_Low <= 696.159 )
								ret := -0.600000
							if( Internal_Swing_Low > 696.159 )
								ret := -1.000000 // sell
				if( Swing_Low > 772.87 )
					if( Equilibrium_Zone <= 855.425 )
						if( atr <= 101.225 )
							ret := 0.500000
						if( atr > 101.225 )
							ret := 1.000000 // buy
					if( Equilibrium_Zone > 855.425 )
						if( Equilibrium_Zone <= 869.909 )
							if( atr <= 158.838 )
								ret := 0.000000
							if( atr > 158.838 )
								ret := 1.000000 // buy
						if( Equilibrium_Zone > 869.909 )
							ret := -0.166667
			if( Internal_Swing_Low > 811.81 )
				if( atr <= 297.139 )
					if( Internal_Swing_Low <= 982.892 )
						if( atr <= 118.049 )
							if( Internal_Swing_Low <= 853.938 )
								if( Equilibrium_Zone <= 815.035 )
									ret := -0.750000 // sell
								if( Equilibrium_Zone > 815.035 )
									ret := 0.307692
							if( Internal_Swing_Low > 853.938 )
								ret := -1.000000 // sell
						if( atr > 118.049 )
							if( Premium_Zone <= 946.896 )
								if( Equilibrium_Zone <= 794.631 )
									ret := 0.500000
								if( Equilibrium_Zone > 794.631 )
									ret := 0.900000 // buy
							if( Premium_Zone > 946.896 )
								if( Premium_Zone <= 1100.81 )
									ret := -0.060870
								if( Premium_Zone > 1100.81 )
									ret := -0.482143
					if( Internal_Swing_Low > 982.892 )
						if( Discount_Zone <= 705.464 )
							if( atr <= 276.6 )
								ret := -0.428571
							if( atr > 276.6 )
								if( atr <= 286.226 )
									ret := 0.833333 // buy
								if( atr > 286.226 )
									ret := 0.095238
						if( Discount_Zone > 705.464 )
							if( atr <= 235.061 )
								ret := 1.000000 // buy
							if( atr > 235.061 )
								ret := 0.800000 // buy
				if( atr > 297.139 )
					if( Internal_Swing_Low <= 877.005 )
						ret := 0.250000
					if( Internal_Swing_Low > 877.005 )
						if( Discount_Zone <= 708.854 )
							if( Discount_Zone <= 632.307 )
								ret := -0.200000
							if( Discount_Zone > 632.307 )
								if( Premium_Zone <= 1430.31 )
									ret := -0.871795 // sell
								if( Premium_Zone > 1430.31 )
									ret := -0.500000
						if( Discount_Zone > 708.854 )
							if( Internal_Swing_Low <= 1145.03 )
								ret := 0.500000
							if( Internal_Swing_Low > 1145.03 )
								if( Discount_Zone <= 717.109 )
									ret := 0.000000
								if( Discount_Zone > 717.109 )
									ret := -0.857143 // sell
		if( Discount_Zone > 725.096 )
			if( Premium_Zone <= 1204.97 )
				if( Premium_Zone <= 1024.94 )
					if( atr <= 132.672 )
						if( Discount_Zone <= 764.084 )
							if( Discount_Zone <= 750.814 )
								if( Equilibrium_Zone <= 860.871 )
									ret := 0.274272
								if( Equilibrium_Zone > 860.871 )
									ret := -0.534884
							if( Discount_Zone > 750.814 )
								if( Internal_Swing_High <= 832.706 )
									ret := 0.598015
								if( Internal_Swing_High > 832.706 )
									ret := 0.225166
						if( Discount_Zone > 764.084 )
							if( Internal_Swing_Low <= 906.33 )
								if( atr <= 72.7808 )
									ret := 0.386935
								if( atr > 72.7808 )
									ret := 0.092127
							if( Internal_Swing_Low > 906.33 )
								if( Premium_Zone <= 1023.13 )
									ret := 1.000000 // buy
								if( Premium_Zone > 1023.13 )
									ret := 0.000000
					if( atr > 132.672 )
						if( Equilibrium_Zone <= 887.792 )
							if( Equilibrium_Zone <= 863.617 )
								ret := 0.857143 // buy
							if( Equilibrium_Zone > 863.617 )
								if( Internal_Swing_High <= 887.949 )
									ret := -0.407407
								if( Internal_Swing_High > 887.949 )
									ret := 0.500000
						if( Equilibrium_Zone > 887.792 )
							if( Discount_Zone <= 753.774 )
								ret := 0.500000
							if( Discount_Zone > 753.774 )
								ret := 1.000000 // buy
				if( Premium_Zone > 1024.94 )
					if( Internal_Swing_High <= 930.656 )
						if( atr <= 142.337 )
							if( Equilibrium_Zone <= 889.52 )
								if( atr <= 140.824 )
									ret := -0.827586 // sell
								if( atr > 140.824 )
									ret := 0.250000
							if( Equilibrium_Zone > 889.52 )
								if( Premium_Zone <= 1050.14 )
									ret := -0.152941
								if( Premium_Zone > 1050.14 )
									ret := -0.531915
						if( atr > 142.337 )
							if( Internal_Swing_Low <= 943.409 )
								if( Discount_Zone <= 788.48 )
									ret := 0.175182
								if( Discount_Zone > 788.48 )
									ret := -0.574074
							if( Internal_Swing_Low > 943.409 )
								if( Equilibrium_Zone <= 960.105 )
									ret := -0.714286 // sell
								if( Equilibrium_Zone > 960.105 )
									ret := 0.000000
					if( Internal_Swing_High > 930.656 )
						if( Order_Block_High <= 964.785 )
							if( atr <= 128.831 )
								if( Swing_High <= 941.201 )
									ret := -0.500000
								if( Swing_High > 941.201 )
									ret := 0.250000
							if( atr > 128.831 )
								if( Discount_Zone <= 731.409 )
									ret := 0.285714
								if( Discount_Zone > 731.409 )
									ret := 0.639175
						if( Order_Block_High > 964.785 )
							if( Equilibrium_Zone <= 973.365 )
								if( Internal_Swing_High <= 1003.5 )
									ret := -0.250000
								if( Internal_Swing_High > 1003.5 )
									ret := 0.250000
							if( Equilibrium_Zone > 973.365 )
								ret := -0.750000 // sell
			if( Premium_Zone > 1204.97 )
				if( Swing_Low <= 885.155 )
					if( Discount_Zone <= 782.395 )
						if( Internal_Swing_High <= 1167.72 )
							if( Premium_Zone <= 1413 )
								if( Equilibrium_Zone <= 1023.05 )
									ret := 0.826087 // buy
								if( Equilibrium_Zone > 1023.05 )
									ret := 0.612745
							if( Premium_Zone > 1413 )
								if( Internal_Swing_Low <= 1158.51 )
									ret := 0.500000
								if( Internal_Swing_Low > 1158.51 )
									ret := -1.000000 // sell
						if( Internal_Swing_High > 1167.72 )
							if( Equilibrium_Zone <= 1049.03 )
								ret := -0.461538
							if( Equilibrium_Zone > 1049.03 )
								if( Swing_High <= 584 )
									ret := 0.750000 // buy
								if( Swing_High > 584 )
									ret := -0.142857
					if( Discount_Zone > 782.395 )
						if( Discount_Zone <= 783.201 )
							ret := -1.000000 // sell
						if( Discount_Zone > 783.201 )
							if( Equilibrium_Zone <= 1042.3 )
								ret := 1.000000 // buy
							if( Equilibrium_Zone > 1042.3 )
								if( Discount_Zone <= 787.358 )
									ret := 0.714286 // buy
								if( Discount_Zone > 787.358 )
									ret := -0.238095
				if( Swing_Low > 885.155 )
					if( Internal_Swing_Low <= 909.475 )
						ret := -1.000000 // sell
					if( Internal_Swing_Low > 909.475 )
						if( Equilibrium_Zone <= 1036.54 )
							ret := -0.500000
						if( Equilibrium_Zone > 1036.54 )
							ret := 0.250000
	if( Discount_Zone > 793.991 )
		if( Premium_Zone <= 1017.17 )
			if( Premium_Zone <= 945.328 )
				if( Internal_Swing_Low <= 868.219 )
					if( atr <= 50.4276 )
						if( Equilibrium_Zone <= 862.825 )
							if( Premium_Zone <= 896.864 )
								if( Internal_Swing_Low <= 862.415 )
									ret := 0.000000
								if( Internal_Swing_Low > 862.415 )
									ret := 0.250000
							if( Premium_Zone > 896.864 )
								if( Premium_Zone <= 903.561 )
									ret := 0.571429
								if( Premium_Zone > 903.561 )
									ret := 0.200000
						if( Equilibrium_Zone > 862.825 )
							ret := 1.000000 // buy
					if( atr > 50.4276 )
						if( Equilibrium_Zone <= 869.139 )
							if( Premium_Zone <= 924.065 )
								if( Discount_Zone <= 812.609 )
									ret := -0.387097
								if( Discount_Zone > 812.609 )
									ret := -1.000000 // sell
							if( Premium_Zone > 924.065 )
								if( atr <= 65.343 )
									ret := 0.714286 // buy
								if( atr > 65.343 )
									ret := -0.375000
						if( Equilibrium_Zone > 869.139 )
							if( Discount_Zone <= 817.35 )
								if( Internal_Swing_High <= 889.645 )
									ret := 0.600000
								if( Internal_Swing_High > 889.645 )
									ret := -0.166667
							if( Discount_Zone > 817.35 )
								if( Internal_Swing_Low <= 426.085 )
									ret := -0.750000 // sell
								if( Internal_Swing_Low > 426.085 )
									ret := -0.250000
				if( Internal_Swing_Low > 868.219 )
					if( Internal_Swing_Low <= 878.546 )
						if( Internal_Swing_Low <= 869.423 )
							if( Premium_Zone <= 919.696 )
								ret := 0.500000
							if( Premium_Zone > 919.696 )
								ret := 1.000000 // buy
						if( Internal_Swing_Low > 869.423 )
							ret := 1.000000 // buy
					if( Internal_Swing_Low > 878.546 )
						if( Premium_Zone <= 925.59 )
							ret := -1.000000 // sell
						if( Premium_Zone > 925.59 )
							ret := 0.833333 // buy
			if( Premium_Zone > 945.328 )
				if( Premium_Zone <= 958.817 )
					if( Internal_Swing_Low <= 859.173 )
						if( Discount_Zone <= 798.661 )
							if( Premium_Zone <= 956.788 )
								ret := -1.000000 // sell
							if( Premium_Zone > 956.788 )
								ret := -0.750000 // sell
						if( Discount_Zone > 798.661 )
							if( Internal_Swing_Low <= 852.522 )
								ret := -0.600000
							if( Internal_Swing_Low > 852.522 )
								ret := -0.400000
					if( Internal_Swing_Low > 859.173 )
						ret := -1.000000 // sell
				if( Premium_Zone > 958.817 )
					if( Premium_Zone <= 972.145 )
						if( Internal_Swing_Low <= 434.49 )
							if( Equilibrium_Zone <= 883.894 )
								if( Internal_Swing_High <= 871.686 )
									ret := 0.500000
								if( Internal_Swing_High > 871.686 )
									ret := -0.250000
							if( Equilibrium_Zone > 883.894 )
								ret := 1.000000 // buy
						if( Internal_Swing_Low > 434.49 )
							ret := -1.000000 // sell
					if( Premium_Zone > 972.145 )
						if( atr <= 89.9766 )
							if( Premium_Zone <= 1016.15 )
								if( Internal_Swing_Low <= 426.496 )
									ret := -0.671756
								if( Internal_Swing_Low > 426.496 )
									ret := -0.340000
							if( Premium_Zone > 1016.15 )
								if( Discount_Zone <= 901.119 )
									ret := -0.250000
								if( Discount_Zone > 901.119 )
									ret := 0.000000
						if( atr > 89.9766 )
							if( atr <= 102.63 )
								if( Internal_Swing_Low <= 932.988 )
									ret := 0.052632
								if( Internal_Swing_Low > 932.988 )
									ret := -0.923077 // sell
							if( atr > 102.63 )
								if( atr <= 108.408 )
									ret := -0.818182 // sell
								if( atr > 108.408 )
									ret := 0.500000
		if( Premium_Zone > 1017.17 )
			if( atr <= 181.554 )
				if( Order_Block_High <= 1536.45 )
					if( Premium_Zone <= 1085.2 )
						if( atr <= 72.9712 )
							if( Equilibrium_Zone <= 975.187 )
								if( Internal_Swing_Low <= 479.592 )
									ret := 0.076923
								if( Internal_Swing_Low > 479.592 )
									ret := 0.720000 // buy
							if( Equilibrium_Zone > 975.187 )
								if( Discount_Zone <= 943.77 )
									ret := 0.960000 // buy
								if( Discount_Zone > 943.77 )
									ret := 0.600000
						if( atr > 72.9712 )
							if( atr <= 111.035 )
								if( Equilibrium_Zone <= 920.77 )
									ret := -0.500000
								if( Equilibrium_Zone > 920.77 )
									ret := 0.024169
							if( atr > 111.035 )
								if( Swing_High <= 967.044 )
									ret := 0.273927
								if( Swing_High > 967.044 )
									ret := 0.777778 // buy
					if( Premium_Zone > 1085.2 )
						if( Premium_Zone <= 1098.82 )
							if( atr <= 142.39 )
								if( Equilibrium_Zone <= 998.368 )
									ret := -0.593407
								if( Equilibrium_Zone > 998.368 )
									ret := 0.750000 // buy
							if( atr > 142.39 )
								if( Internal_Swing_Low <= 911.763 )
									ret := -0.068966
								if( Internal_Swing_Low > 911.763 )
									ret := 0.615385
						if( Premium_Zone > 1098.82 )
							if( Discount_Zone <= 958.603 )
								if( Equilibrium_Zone <= 1069.23 )
									ret := 0.034870
								if( Equilibrium_Zone > 1069.23 )
									ret := -0.343454
							if( Discount_Zone > 958.603 )
								if( Equilibrium_Zone <= 1205.28 )
									ret := 0.139126
								if( Equilibrium_Zone > 1205.28 )
									ret := 0.029243
				if( Order_Block_High > 1536.45 )
					if( Discount_Zone <= 1653.08 )
						if( atr <= 91.9601 )
							if( Discount_Zone <= 1504.3 )
								if( Order_Block_Low <= 1570.04 )
									ret := 0.000000
								if( Order_Block_Low > 1570.04 )
									ret := -0.833333 // sell
							if( Discount_Zone > 1504.3 )
								if( Swing_High <= 1749.33 )
									ret := 0.041667
								if( Swing_High > 1749.33 )
									ret := -0.250000
						if( atr > 91.9601 )
							if( Discount_Zone <= 1466.2 )
								if( Internal_Swing_Low <= 1535.46 )
									ret := 0.346667
								if( Internal_Swing_Low > 1535.46 )
									ret := -0.500000
							if( Discount_Zone > 1466.2 )
								if( Premium_Zone <= 1860.85 )
									ret := 0.625000
								if( Premium_Zone > 1860.85 )
									ret := -0.071429
					if( Discount_Zone > 1653.08 )
						if( Equilibrium_Zone <= 1761.88 )
							ret := -1.000000 // sell
						if( Equilibrium_Zone > 1761.88 )
							if( Discount_Zone <= 1738.38 )
								if( Discount_Zone <= 1687.81 )
									ret := 0.750000 // buy
								if( Discount_Zone > 1687.81 )
									ret := 0.428571
							if( Discount_Zone > 1738.38 )
								if( Order_Block_High <= 1924.98 )
									ret := -0.666667
								if( Order_Block_High > 1924.98 )
									ret := 0.000000
			if( atr > 181.554 )
				if( atr <= 275.001 )
					if( Premium_Zone <= 1638.89 )
						if( Discount_Zone <= 1052.35 )
							if( Internal_Swing_Low <= 1072.63 )
								if( atr <= 212.7 )
									ret := -0.097628
								if( atr > 212.7 )
									ret := -0.382848
							if( Internal_Swing_Low > 1072.63 )
								if( Internal_Swing_Low <= 1109.01 )
									ret := 0.578947
								if( Internal_Swing_Low > 1109.01 )
									ret := 0.125683
						if( Discount_Zone > 1052.35 )
							if( Swing_High <= 1382.91 )
								if( Premium_Zone <= 1489.38 )
									ret := 0.094595
								if( Premium_Zone > 1489.38 )
									ret := 0.369775
							if( Swing_High > 1382.91 )
								if( Order_Block_Low <= 691.97 )
									ret := -0.475410
								if( Order_Block_Low > 691.97 )
									ret := 0.333333
					if( Premium_Zone > 1638.89 )
						if( Equilibrium_Zone <= 1469.51 )
							if( Swing_Low <= 1241.68 )
								if( atr <= 258.815 )
									ret := -0.560606
								if( atr > 258.815 )
									ret := -0.290000
							if( Swing_Low > 1241.68 )
								if( Discount_Zone <= 1195.74 )
									ret := 0.800000 // buy
								if( Discount_Zone > 1195.74 )
									ret := 0.285714
						if( Equilibrium_Zone > 1469.51 )
							if( Discount_Zone <= 1600.62 )
								if( Swing_Low <= 677.777 )
									ret := -0.062941
								if( Swing_Low > 677.777 )
									ret := -0.350575
							if( Discount_Zone > 1600.62 )
								if( Discount_Zone <= 1676.48 )
									ret := -0.669565
								if( Discount_Zone > 1676.48 )
									ret := -0.133333
				if( atr > 275.001 )
					if( Discount_Zone <= 1481.25 )
						if( Premium_Zone <= 1637.33 )
							if( atr <= 276.518 )
								if( atr <= 275.987 )
									ret := 0.736842 // buy
								if( atr > 275.987 )
									ret := 0.969697 // buy
							if( atr > 276.518 )
								if( atr <= 345.386 )
									ret := 0.005814
								if( atr > 345.386 )
									ret := 0.754717 // buy
						if( Premium_Zone > 1637.33 )
							if( Equilibrium_Zone <= 1438.8 )
								if( Swing_Low <= 1168.8 )
									ret := -0.740741 // sell
								if( Swing_Low > 1168.8 )
									ret := -0.200000
							if( Equilibrium_Zone > 1438.8 )
								if( atr <= 285.207 )
									ret := -0.308271
								if( atr > 285.207 )
									ret := 0.100423
					if( Discount_Zone > 1481.25 )
						if( Swing_High <= 1899.26 )
							if( atr <= 306.672 )
								if( Bullish_BOSInt <= 0.5 )
									ret := 0.605263
								if( Bullish_BOSInt > 0.5 )
									ret := -0.400000
							if( atr > 306.672 )
								if( Internal_Swing_Low <= 828.8 )
									ret := 0.012346
								if( Internal_Swing_Low > 828.8 )
									ret := 0.681818
						if( Swing_High > 1899.26 )
							if( Equilibrium_Zone <= 1780.71 )
								ret := 0.250000
							if( Equilibrium_Zone > 1780.71 )
								if( Equilibrium_Zone <= 1802.15 )
									ret := -0.800000 // sell
								if( Equilibrium_Zone > 1802.15 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_MELI_15Min_a8bb86c4(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


