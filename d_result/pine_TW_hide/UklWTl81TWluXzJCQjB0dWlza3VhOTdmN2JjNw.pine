//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: RIVN_5Min_2BB0_a97f7bc7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_2BB0_a97f7bc7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_a97f7bc7(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Lower_Band <= 10.1429 )
		if( Upper_Band <= 9.68012 )
			if( Upper_Band <= 9.56204 )
				if( Lower_Band <= 8.45829 )
					if( bbm <= 0.021891 )
						if( Upper_Band <= 8.43086 )
							if( bearPower <= -0.006286 )
								ret := 1.000000 // buy
							if( bearPower > -0.006286 )
								ret := 0.000000
						if( Upper_Band > 8.43086 )
							if( Upper_Band <= 8.50983 )
								if( bearPower <= -0.001911 )
									ret := -0.312500
								if( bearPower > -0.001911 )
									ret := -0.846154 // sell
							if( Upper_Band > 8.50983 )
								if( bbp <= 0.024021 )
									ret := -0.111111
								if( bbp > 0.024021 )
									ret := 0.250000
					if( bbm > 0.021891 )
						if( Lower_Band <= 8.42564 )
							if( bbm <= 0.037424 )
								if( basis <= 8.39407 )
									ret := 0.600000
								if( basis > 8.39407 )
									ret := -0.208333
							if( bbm > 0.037424 )
								if( Lower_Band <= 8.37474 )
									ret := 0.553030
								if( Lower_Band > 8.37474 )
									ret := -0.176471
						if( Lower_Band > 8.42564 )
							if( Lower_Band <= 8.44653 )
								if( Lower_Band <= 8.43968 )
									ret := 0.937500 // buy
								if( Lower_Band > 8.43968 )
									ret := 0.700000 // buy
							if( Lower_Band > 8.44653 )
								if( bbp <= 0.061854 )
									ret := -0.142857
								if( bbp > 0.061854 )
									ret := 0.700000 // buy
				if( Lower_Band > 8.45829 )
					if( basis <= 8.59055 )
						if( Upper_Band <= 8.53181 )
							if( bbp <= 0.03635 )
								ret := -1.000000 // sell
							if( bbp > 0.03635 )
								ret := -0.500000
						if( Upper_Band > 8.53181 )
							if( basis <= 8.54372 )
								if( Upper_Band <= 8.5789 )
									ret := 0.032258
								if( Upper_Band > 8.5789 )
									ret := 0.785714 // buy
							if( basis > 8.54372 )
								if( bbp <= 0.020295 )
									ret := -0.759259 // sell
								if( bbp > 0.020295 )
									ret := 0.090909
					if( basis > 8.59055 )
						if( bearPower <= 0.001225 )
							if( Lower_Band <= 9.06846 )
								if( basis <= 9.04689 )
									ret := 0.095631
								if( basis > 9.04689 )
									ret := 0.671756
							if( Lower_Band > 9.06846 )
								if( bullPower <= -0.001376 )
									ret := 0.112554
								if( bullPower > -0.001376 )
									ret := -0.192857
						if( bearPower > 0.001225 )
							if( basis <= 9.48152 )
								if( Upper_Band <= 8.79152 )
									ret := 0.190476
								if( Upper_Band > 8.79152 )
									ret := -0.130662
							if( basis > 9.48152 )
								if( bbm <= 0.04606 )
									ret := 0.833333 // buy
								if( bbm > 0.04606 )
									ret := 0.250000
			if( Upper_Band > 9.56204 )
				if( bbm <= 0.041957 )
					if( bearPower <= 0.015676 )
						if( Lower_Band <= 9.46399 )
							if( Upper_Band <= 9.58826 )
								if( BBPower_Color <= 0.5 )
									ret := -0.923077 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.400000
							if( Upper_Band > 9.58826 )
								if( bbp <= 0.034195 )
									ret := 0.500000
								if( bbp > 0.034195 )
									ret := -0.400000
						if( Lower_Band > 9.46399 )
							if( Lower_Band <= 9.53736 )
								if( bbm <= 0.031495 )
									ret := -0.055556
								if( bbm > 0.031495 )
									ret := 0.818182 // buy
							if( Lower_Band > 9.53736 )
								if( Upper_Band <= 9.65367 )
									ret := -0.166667
								if( Upper_Band > 9.65367 )
									ret := -0.823529 // sell
					if( bearPower > 0.015676 )
						if( Upper_Band <= 9.60125 )
							ret := 1.000000 // buy
						if( Upper_Band > 9.60125 )
							ret := 0.250000
				if( bbm > 0.041957 )
					if( bullPower <= 0.055503 )
						if( bbm <= 0.074774 )
							if( bullPower <= 0.020878 )
								if( bullPower <= 0.005152 )
									ret := -1.000000 // sell
								if( bullPower > 0.005152 )
									ret := -0.750000 // sell
							if( bullPower > 0.020878 )
								if( bbm <= 0.044595 )
									ret := -1.000000 // sell
								if( bbm > 0.044595 )
									ret := -0.230769
						if( bbm > 0.074774 )
							if( Lower_Band <= 9.3948 )
								ret := 0.571429
							if( Lower_Band > 9.3948 )
								ret := 0.000000
					if( bullPower > 0.055503 )
						if( bbp <= 0.059906 )
							ret := -0.800000 // sell
						if( bbp > 0.059906 )
							ret := -1.000000 // sell
		if( Upper_Band > 9.68012 )
			if( Lower_Band <= 9.32923 )
				if( basis <= 9.55243 )
					ret := 1.000000 // buy
				if( basis > 9.55243 )
					if( basis <= 9.63463 )
						if( bbm <= 0.129822 )
							ret := 0.400000
						if( bbm > 0.129822 )
							ret := -1.000000 // sell
					if( basis > 9.63463 )
						if( bullPower <= -0.08422 )
							ret := -0.250000
						if( bullPower > -0.08422 )
							if( Upper_Band <= 10.1123 )
								ret := -0.750000 // sell
							if( Upper_Band > 10.1123 )
								ret := -1.000000 // sell
			if( Lower_Band > 9.32923 )
				if( Upper_Band <= 10.3052 )
					if( bbm <= 0.040112 )
						if( basis <= 9.64749 )
							if( Upper_Band <= 9.78591 )
								if( bullPower <= 0.009972 )
									ret := 1.000000 // buy
								if( bullPower > 0.009972 )
									ret := 0.750000 // buy
							if( Upper_Band > 9.78591 )
								ret := 0.500000
						if( basis > 9.64749 )
							if( Upper_Band <= 9.8872 )
								if( bbp <= -0.025245 )
									ret := -0.875000 // sell
								if( bbp > -0.025245 )
									ret := 0.181818
							if( Upper_Band > 9.8872 )
								if( bbp <= -0.040332 )
									ret := 0.522472
								if( bbp > -0.040332 )
									ret := 0.142996
					if( bbm > 0.040112 )
						if( basis <= 9.92309 )
							if( Lower_Band <= 9.58234 )
								if( basis <= 9.54705 )
									ret := 0.969697 // buy
								if( basis > 9.54705 )
									ret := 0.310345
							if( Lower_Band > 9.58234 )
								if( Lower_Band <= 9.79163 )
									ret := 0.971429 // buy
								if( Lower_Band > 9.79163 )
									ret := 0.500000
						if( basis > 9.92309 )
							if( bullPower <= 0.08296 )
								if( Lower_Band <= 9.72345 )
									ret := -0.166667
								if( Lower_Band > 9.72345 )
									ret := 0.655786
							if( bullPower > 0.08296 )
								if( bearPower <= -0.073087 )
									ret := -1.000000 // sell
								if( bearPower > -0.073087 )
									ret := 0.209790
				if( Upper_Band > 10.3052 )
					if( Upper_Band <= 11.3127 )
						if( bullPower <= 0.01771 )
							if( bbm <= 0.064782 )
								if( bbm <= 0.037867 )
									ret := 0.080000
								if( bbm > 0.037867 )
									ret := 0.459459
							if( bbm > 0.064782 )
								if( bbp <= -0.39677 )
									ret := 0.722222 // buy
								if( bbp > -0.39677 )
									ret := -0.134921
						if( bullPower > 0.01771 )
							if( Lower_Band <= 9.91917 )
								if( bbm <= 0.241878 )
									ret := -0.635294
								if( bbm > 0.241878 )
									ret := 0.333333
							if( Lower_Band > 9.91917 )
								if( Lower_Band <= 10.0457 )
									ret := 0.281250
								if( Lower_Band > 10.0457 )
									ret := -0.288462
					if( Upper_Band > 11.3127 )
						if( bullPower <= -0.148431 )
							if( Upper_Band <= 11.6492 )
								if( bullPower <= -0.199076 )
									ret := 0.909091 // buy
								if( bullPower > -0.199076 )
									ret := 0.500000
							if( Upper_Band > 11.6492 )
								if( bbm <= 0.083113 )
									ret := -1.000000 // sell
								if( bbm > 0.083113 )
									ret := -0.600000
						if( bullPower > -0.148431 )
							if( basis <= 14.0194 )
								if( Lower_Band <= 9.90974 )
									ret := 0.948718 // buy
								if( Lower_Band > 9.90974 )
									ret := 0.533333
							if( basis > 14.0194 )
								ret := 0.000000
	if( Lower_Band > 10.1429 )
		if( bearPower <= -0.004897 )
			if( basis <= 28.1403 )
				if( bbm <= 0.8755 )
					if( basis <= 25.7103 )
						if( bullPower <= 0.033018 )
							if( Upper_Band <= 26.2708 )
								if( basis <= 17.7888 )
									ret := 0.062274
								if( basis > 17.7888 )
									ret := 0.019584
							if( Upper_Band > 26.2708 )
								if( Lower_Band <= 24.3048 )
									ret := 0.981132 // buy
								if( Lower_Band > 24.3048 )
									ret := -0.333333
						if( bullPower > 0.033018 )
							if( basis <= 19.8727 )
								if( basis <= 18.9602 )
									ret := 0.078853
								if( basis > 18.9602 )
									ret := -0.145414
							if( basis > 19.8727 )
								if( bbp <= 0.168494 )
									ret := 0.191230
								if( bbp > 0.168494 )
									ret := -0.121827
					if( basis > 25.7103 )
						if( Upper_Band <= 25.9946 )
							if( bearPower <= -0.180139 )
								if( bearPower <= -0.22622 )
									ret := 0.250000
								if( bearPower > -0.22622 )
									ret := 0.750000 // buy
							if( bearPower > -0.180139 )
								if( bbm <= 0.074559 )
									ret := -0.338235
								if( bbm > 0.074559 )
									ret := -0.723404 // sell
						if( Upper_Band > 25.9946 )
							if( basis <= 26.1777 )
								if( basis <= 26.0712 )
									ret := 0.025641
								if( basis > 26.0712 )
									ret := -0.621429
							if( basis > 26.1777 )
								if( basis <= 26.6634 )
									ret := 0.333333
								if( basis > 26.6634 )
									ret := -0.035276
				if( bbm > 0.8755 )
					if( basis <= 23.2789 )
						if( bearPower <= -1.03893 )
							ret := 0.857143 // buy
						if( bearPower > -1.03893 )
							if( bbp <= 0.881964 )
								if( bbp <= 0.254708 )
									ret := -0.500000
								if( bbp > 0.254708 )
									ret := -1.000000 // sell
							if( bbp > 0.881964 )
								ret := 0.500000
					if( basis > 23.2789 )
						if( Upper_Band <= 25.8934 )
							if( bbp <= -1.06745 )
								ret := -0.500000
							if( bbp > -1.06745 )
								if( bbp <= 0.39358 )
									ret := -1.000000 // sell
								if( bbp > 0.39358 )
									ret := -0.500000
						if( Upper_Band > 25.8934 )
							ret := -0.250000
			if( basis > 28.1403 )
				if( basis <= 28.2407 )
					ret := -0.714286 // sell
				if( basis > 28.2407 )
					ret := -1.000000 // sell
		if( bearPower > -0.004897 )
			if( bbm <= 0.145358 )
				if( Upper_Band <= 14.1917 )
					if( bbm <= 0.019762 )
						if( bbp <= 0.048974 )
							if( basis <= 10.3577 )
								if( bbm <= 0.009762 )
									ret := -0.310606
								if( bbm > 0.009762 )
									ret := -0.022556
							if( basis > 10.3577 )
								if( Upper_Band <= 13.9537 )
									ret := -0.016350
								if( Upper_Band > 13.9537 )
									ret := -0.220859
						if( bbp > 0.048974 )
							if( Upper_Band <= 11.2893 )
								if( Upper_Band <= 10.7714 )
									ret := -0.297619
								if( Upper_Band > 10.7714 )
									ret := 0.112245
							if( Upper_Band > 11.2893 )
								if( basis <= 13.0227 )
									ret := -0.601227
								if( basis > 13.0227 )
									ret := -0.184426
					if( bbm > 0.019762 )
						if( basis <= 14.0239 )
							if( bbp <= 0.27757 )
								if( Upper_Band <= 10.5336 )
									ret := -0.136752
								if( Upper_Band > 10.5336 )
									ret := 0.017717
							if( bbp > 0.27757 )
								if( Upper_Band <= 13.9349 )
									ret := 0.304598
								if( Upper_Band > 13.9349 )
									ret := -0.575758
						if( basis > 14.0239 )
							if( bullPower <= 0.090309 )
								if( bbm <= 0.021278 )
									ret := 0.000000
								if( bbm > 0.021278 )
									ret := -0.804348 // sell
							if( bullPower > 0.090309 )
								ret := 0.166667
				if( Upper_Band > 14.1917 )
					if( bbm <= 0.020274 )
						if( basis <= 17.6079 )
							if( bullPower <= 0.074457 )
								if( Lower_Band <= 17.483 )
									ret := 0.042248
								if( Lower_Band > 17.483 )
									ret := 0.782609 // buy
							if( bullPower > 0.074457 )
								if( Upper_Band <= 14.8825 )
									ret := -0.800000 // sell
								if( Upper_Band > 14.8825 )
									ret := -0.200000
						if( basis > 17.6079 )
							if( Upper_Band <= 18.0455 )
								if( Lower_Band <= 17.846 )
									ret := -0.194444
								if( Lower_Band > 17.846 )
									ret := -0.629630
							if( Upper_Band > 18.0455 )
								if( Lower_Band <= 17.5932 )
									ret := 1.000000 // buy
								if( Lower_Band > 17.5932 )
									ret := -0.011957
					if( bbm > 0.020274 )
						if( Upper_Band <= 14.3226 )
							if( bearPower <= 0.08578 )
								if( Lower_Band <= 14.1658 )
									ret := 0.534591
								if( Lower_Band > 14.1658 )
									ret := -0.285714
							if( bearPower > 0.08578 )
								ret := -1.000000 // sell
						if( Upper_Band > 14.3226 )
							if( Upper_Band <= 18.1426 )
								if( Lower_Band <= 17.7573 )
									ret := 0.035136
								if( Lower_Band > 17.7573 )
									ret := -0.461538
							if( Upper_Band > 18.1426 )
								if( Upper_Band <= 18.2943 )
									ret := 0.631068
								if( Upper_Band > 18.2943 )
									ret := 0.106938
			if( bbm > 0.145358 )
				if( Lower_Band <= 24.0518 )
					if( Lower_Band <= 19.9641 )
						if( basis <= 11.2991 )
							if( Upper_Band <= 10.9708 )
								if( bbm <= 0.155 )
									ret := -0.750000 // sell
								if( bbm > 0.155 )
									ret := 0.000000
							if( Upper_Band > 10.9708 )
								if( bbm <= 0.2225 )
									ret := -1.000000 // sell
								if( bbm > 0.2225 )
									ret := -0.750000 // sell
						if( basis > 11.2991 )
							if( Upper_Band <= 14.6577 )
								if( Lower_Band <= 12.7054 )
									ret := -0.236842
								if( Lower_Band > 12.7054 )
									ret := 0.376682
							if( Upper_Band > 14.6577 )
								if( Upper_Band <= 20.9136 )
									ret := -0.141553
								if( Upper_Band > 20.9136 )
									ret := -0.853659 // sell
					if( Lower_Band > 19.9641 )
						if( Lower_Band <= 21.6002 )
							if( Upper_Band <= 22.4906 )
								if( Lower_Band <= 20.295 )
									ret := 0.514286
								if( Lower_Band > 20.295 )
									ret := 0.096154
							if( Upper_Band > 22.4906 )
								if( basis <= 22.0098 )
									ret := 0.750000 // buy
								if( basis > 22.0098 )
									ret := 0.974359 // buy
						if( Lower_Band > 21.6002 )
							if( Lower_Band <= 23.0479 )
								if( bearPower <= 0.069017 )
									ret := -0.016129
								if( bearPower > 0.069017 )
									ret := -0.500000
							if( Lower_Band > 23.0479 )
								if( Upper_Band <= 24.7415 )
									ret := 0.036232
								if( Upper_Band > 24.7415 )
									ret := 0.489510
				if( Lower_Band > 24.0518 )
					if( Lower_Band <= 24.6561 )
						if( Lower_Band <= 24.2612 )
							if( Lower_Band <= 24.1379 )
								ret := -0.750000 // sell
							if( Lower_Band > 24.1379 )
								ret := -1.000000 // sell
						if( Lower_Band > 24.2612 )
							if( Upper_Band <= 25.0408 )
								ret := -0.142857
							if( Upper_Band > 25.0408 )
								if( bullPower <= 0.377101 )
									ret := -0.956522 // sell
								if( bullPower > 0.377101 )
									ret := -0.333333
					if( Lower_Band > 24.6561 )
						if( Upper_Band <= 25.8597 )
							if( Upper_Band <= 25.665 )
								if( basis <= 25.2991 )
									ret := 0.250000
								if( basis > 25.2991 )
									ret := -0.888889 // sell
							if( Upper_Band > 25.665 )
								if( bbm <= 0.275 )
									ret := 0.727273 // buy
								if( bbm > 0.275 )
									ret := -0.333333
						if( Upper_Band > 25.8597 )
							if( bbp <= 0.914255 )
								if( Lower_Band <= 25.1004 )
									ret := -0.879310 // sell
								if( Lower_Band > 25.1004 )
									ret := -0.451977
							if( bbp > 0.914255 )
								if( Upper_Band <= 27.4097 )
									ret := 0.760000 // buy
								if( Upper_Band > 27.4097 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_RIVN_5Min_a97f7bc7(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)

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


