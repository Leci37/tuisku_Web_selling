//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: ADSK_15Min_2BB0_ad7acc93 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2BB0_ad7acc93", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_ad7acc93(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Lower_Band <= 195.772 )
		if( Upper_Band <= 207.175 )
			if( basis <= 195.481 )
				if( bbp <= -0.518678 )
					if( Lower_Band <= 117.914 )
						if( basis <= 113.785 )
							if( Upper_Band <= 116.459 )
								if( Upper_Band <= 113.868 )
									ret := 0.057598
								if( Upper_Band > 113.868 )
									ret := 0.402516
							if( Upper_Band > 116.459 )
								if( Upper_Band <= 116.92 )
									ret := -0.880000 // sell
								if( Upper_Band > 116.92 )
									ret := -0.434783
						if( basis > 113.785 )
							if( bbp <= -3.70581 )
								if( Lower_Band <= 111.854 )
									ret := -0.250000
								if( Lower_Band > 111.854 )
									ret := 0.958333 // buy
							if( bbp > -3.70581 )
								if( basis <= 115.362 )
									ret := -0.477419
								if( basis > 115.362 )
									ret := -0.111111
					if( Lower_Band > 117.914 )
						if( Lower_Band <= 118.382 )
							if( Lower_Band <= 118.08 )
								if( basis <= 119.792 )
									ret := 0.250000
								if( basis > 119.792 )
									ret := 1.000000 // buy
							if( Lower_Band > 118.08 )
								ret := 1.000000 // buy
						if( Lower_Band > 118.382 )
							if( bbm <= 0.097632 )
								if( basis <= 169.886 )
									ret := 0.331148
								if( basis > 169.886 )
									ret := 0.035144
							if( bbm > 0.097632 )
								if( bbp <= -13.109 )
									ret := 0.692308
								if( bbp > -13.109 )
									ret := 0.113279
				if( bbp > -0.518678 )
					if( bearPower <= 3.80751 )
						if( bearPower <= 1.41048 )
							if( Upper_Band <= 197.028 )
								if( Upper_Band <= 71.17 )
									ret := 0.688889
								if( Upper_Band > 71.17 )
									ret := 0.045295
							if( Upper_Band > 197.028 )
								if( Lower_Band <= 193.199 )
									ret := -0.297794
								if( Lower_Band > 193.199 )
									ret := 0.800000 // buy
						if( bearPower > 1.41048 )
							if( Lower_Band <= 190.948 )
								if( Lower_Band <= 86.6921 )
									ret := -0.750000 // sell
								if( Lower_Band > 86.6921 )
									ret := 0.255376
							if( Lower_Band > 190.948 )
								if( Upper_Band <= 197.543 )
									ret := -0.681818
								if( Upper_Band > 197.543 )
									ret := 0.125000
					if( bearPower > 3.80751 )
						if( Lower_Band <= 174.08 )
							if( Upper_Band <= 116.141 )
								ret := 1.000000 // buy
							if( Upper_Band > 116.141 )
								if( Lower_Band <= 150.415 )
									ret := -0.840580 // sell
								if( Lower_Band > 150.415 )
									ret := -0.272727
						if( Lower_Band > 174.08 )
							if( Upper_Band <= 198.938 )
								if( Lower_Band <= 179.802 )
									ret := 0.500000
								if( Lower_Band > 179.802 )
									ret := 0.916667 // buy
							if( Upper_Band > 198.938 )
								if( Upper_Band <= 199.009 )
									ret := -1.000000 // sell
								if( Upper_Band > 199.009 )
									ret := 0.000000
			if( basis > 195.481 )
				if( bbp <= 3.70795 )
					if( bbp <= -3.50596 )
						if( bbp <= -7.24508 )
							if( Upper_Band <= 203.896 )
								ret := -1.000000 // sell
							if( Upper_Band > 203.896 )
								ret := -0.250000
						if( bbp > -7.24508 )
							if( bearPower <= -2.41632 )
								if( basis <= 198.386 )
									ret := 0.750000 // buy
								if( basis > 198.386 )
									ret := 0.428571
							if( bearPower > -2.41632 )
								if( Upper_Band <= 200.174 )
									ret := 0.785714 // buy
								if( Upper_Band > 200.174 )
									ret := -0.250000
					if( bbp > -3.50596 )
						if( Upper_Band <= 205.626 )
							if( Lower_Band <= 193.372 )
								if( bbm <= 2.71056 )
									ret := -0.153846
								if( bbm > 2.71056 )
									ret := 0.857143 // buy
							if( Lower_Band > 193.372 )
								if( Upper_Band <= 199.833 )
									ret := 0.155272
								if( Upper_Band > 199.833 )
									ret := 0.316239
						if( Upper_Band > 205.626 )
							if( bbm <= 0.910566 )
								ret := 0.250000
							if( bbm > 0.910566 )
								if( Lower_Band <= 195.082 )
									ret := -1.000000 // sell
								if( Lower_Band > 195.082 )
									ret := -0.642857
				if( bbp > 3.70795 )
					if( Upper_Band <= 200.01 )
						if( basis <= 196.084 )
							ret := 1.000000 // buy
						if( basis > 196.084 )
							if( Upper_Band <= 199.713 )
								ret := 0.250000
							if( Upper_Band > 199.713 )
								if( basis <= 197.041 )
									ret := 0.750000 // buy
								if( basis > 197.041 )
									ret := 1.000000 // buy
					if( Upper_Band > 200.01 )
						if( bearPower <= 2.3328 )
							if( Upper_Band <= 200.373 )
								if( bullPower <= 2.59664 )
									ret := -1.000000 // sell
								if( bullPower > 2.59664 )
									ret := 0.800000 // buy
							if( Upper_Band > 200.373 )
								if( bearPower <= 1.05002 )
									ret := -0.142857
								if( bearPower > 1.05002 )
									ret := 0.702970 // buy
						if( bearPower > 2.3328 )
							if( bullPower <= 6.08154 )
								if( bbp <= 6.07135 )
									ret := 0.500000
								if( bbp > 6.07135 )
									ret := -0.560000
							if( bullPower > 6.08154 )
								if( Upper_Band <= 205.576 )
									ret := 1.000000 // buy
								if( Upper_Band > 205.576 )
									ret := 0.500000
		if( Upper_Band > 207.175 )
			if( bullPower <= 5.54277 )
				if( bullPower <= -2.41971 )
					if( bearPower <= -7.54784 )
						ret := -1.000000 // sell
					if( bearPower > -7.54784 )
						if( Lower_Band <= 193.596 )
							ret := 0.000000
						if( Lower_Band > 193.596 )
							ret := 0.750000 // buy
				if( bullPower > -2.41971 )
					if( bullPower <= 3.1461 )
						if( bbm <= 1.08995 )
							if( Upper_Band <= 209.371 )
								if( basis <= 198.131 )
									ret := -1.000000 // sell
								if( basis > 198.131 )
									ret := -0.071429
							if( Upper_Band > 209.371 )
								if( bearPower <= 0.648002 )
									ret := -1.000000 // sell
								if( bearPower > 0.648002 )
									ret := -0.600000
						if( bbm > 1.08995 )
							if( bbm <= 2.31112 )
								if( bbp <= -4.05356 )
									ret := -0.733333 // sell
								if( bbp > -4.05356 )
									ret := -0.974359 // sell
							if( bbm > 2.31112 )
								ret := -0.500000
					if( bullPower > 3.1461 )
						if( Lower_Band <= 191.942 )
							if( Upper_Band <= 209.734 )
								if( Upper_Band <= 207.587 )
									ret := -0.750000 // sell
								if( Upper_Band > 207.587 )
									ret := -1.000000 // sell
							if( Upper_Band > 209.734 )
								if( Lower_Band <= 189.55 )
									ret := 0.000000
								if( Lower_Band > 189.55 )
									ret := -0.800000 // sell
						if( Lower_Band > 191.942 )
							ret := 0.333333
			if( bullPower > 5.54277 )
				if( Lower_Band <= 188.048 )
					if( bbm <= 1.34179 )
						if( bearPower <= 6.12168 )
							ret := 1.000000 // buy
						if( bearPower > 6.12168 )
							ret := 0.200000
					if( bbm > 1.34179 )
						if( bullPower <= 6.5234 )
							ret := 0.750000 // buy
						if( bullPower > 6.5234 )
							ret := 1.000000 // buy
				if( Lower_Band > 188.048 )
					ret := -0.600000
	if( Lower_Band > 195.772 )
		if( bbp <= 6.60028 )
			if( bbm <= 0.28969 )
				if( bbp <= 3.17855 )
					if( basis <= 247.812 )
						if( Lower_Band <= 245.483 )
							if( Lower_Band <= 205.642 )
								if( basis <= 202.766 )
									ret := 0.241697
								if( basis > 202.766 )
									ret := -0.314961
							if( Lower_Band > 205.642 )
								if( basis <= 208.331 )
									ret := 0.670000
								if( basis > 208.331 )
									ret := 0.118743
						if( Lower_Band > 245.483 )
							if( bbp <= 1.62882 )
								if( bearPower <= -0.104994 )
									ret := 0.000000
								if( bearPower > -0.104994 )
									ret := -0.688889
							if( bbp > 1.62882 )
								if( basis <= 247.352 )
									ret := -0.800000 // sell
								if( basis > 247.352 )
									ret := 1.000000 // buy
					if( basis > 247.812 )
						if( basis <= 248.81 )
							if( bearPower <= 0.68519 )
								if( bbp <= -0.911169 )
									ret := 0.928571 // buy
								if( bbp > -0.911169 )
									ret := 0.500000
							if( bearPower > 0.68519 )
								if( bbp <= 2.01517 )
									ret := 1.000000 // buy
								if( bbp > 2.01517 )
									ret := 0.818182 // buy
						if( basis > 248.81 )
							if( bearPower <= 1.11682 )
								if( bearPower <= -0.514281 )
									ret := 0.126935
								if( bearPower > -0.514281 )
									ret := 0.270548
							if( bearPower > 1.11682 )
								if( Upper_Band <= 268.553 )
									ret := 0.277778
								if( Upper_Band > 268.553 )
									ret := -0.223301
				if( bbp > 3.17855 )
					if( basis <= 235.478 )
						if( Upper_Band <= 223.211 )
							if( basis <= 214.714 )
								if( Lower_Band <= 207.393 )
									ret := -0.613636
								if( Lower_Band > 207.393 )
									ret := 0.888889 // buy
							if( basis > 214.714 )
								if( Lower_Band <= 218.403 )
									ret := -1.000000 // sell
								if( Lower_Band > 218.403 )
									ret := -0.200000
						if( Upper_Band > 223.211 )
							if( bullPower <= 1.90246 )
								if( bearPower <= 1.74392 )
									ret := -0.600000
								if( bearPower > 1.74392 )
									ret := 0.000000
							if( bullPower > 1.90246 )
								if( Lower_Band <= 219.759 )
									ret := 0.935484 // buy
								if( Lower_Band > 219.759 )
									ret := 0.617647
					if( basis > 235.478 )
						if( Lower_Band <= 251.633 )
							if( Lower_Band <= 239.673 )
								if( bearPower <= 1.74876 )
									ret := 0.625000
								if( bearPower > 1.74876 )
									ret := -0.631579
							if( Lower_Band > 239.673 )
								if( bbp <= 5.80167 )
									ret := -0.913043 // sell
								if( bbp > 5.80167 )
									ret := -0.300000
						if( Lower_Band > 251.633 )
							if( Lower_Band <= 276.323 )
								if( Lower_Band <= 273.815 )
									ret := -0.018868
								if( Lower_Band > 273.815 )
									ret := 0.923077 // buy
							if( Lower_Band > 276.323 )
								if( Lower_Band <= 333.582 )
									ret := -0.477612
								if( Lower_Band > 333.582 )
									ret := 1.000000 // buy
			if( bbm > 0.28969 )
				if( bearPower <= -3.59156 )
					if( Lower_Band <= 274.972 )
						if( Upper_Band <= 282.304 )
							if( basis <= 205.317 )
								if( bearPower <= -5.85379 )
									ret := -0.200000
								if( bearPower > -5.85379 )
									ret := 0.758621 // buy
							if( basis > 205.317 )
								if( Lower_Band <= 201.434 )
									ret := -0.720000 // sell
								if( Lower_Band > 201.434 )
									ret := 0.162281
						if( Upper_Band > 282.304 )
							if( Upper_Band <= 304.442 )
								if( bbp <= -13.1136 )
									ret := 0.000000
								if( bbp > -13.1136 )
									ret := 0.831325 // buy
							if( Upper_Band > 304.442 )
								if( bbm <= 1.3696 )
									ret := -0.714286 // sell
								if( bbm > 1.3696 )
									ret := 0.266667
					if( Lower_Band > 274.972 )
						if( bbm <= 1.54746 )
							if( Lower_Band <= 276.63 )
								ret := -0.800000 // sell
							if( Lower_Band > 276.63 )
								if( Lower_Band <= 304.027 )
									ret := 0.611940
								if( Lower_Band > 304.027 )
									ret := -0.153846
						if( bbm > 1.54746 )
							if( basis <= 314.979 )
								if( bearPower <= -3.86067 )
									ret := -0.460829
								if( bearPower > -3.86067 )
									ret := 0.576923
							if( basis > 314.979 )
								if( basis <= 320.919 )
									ret := 0.826087 // buy
								if( basis > 320.919 )
									ret := 0.031250
				if( bearPower > -3.59156 )
					if( bullPower <= 1.50587 )
						if( bbm <= 0.771142 )
							if( basis <= 199.567 )
								if( basis <= 199.063 )
									ret := -0.009259
								if( basis > 199.063 )
									ret := -0.469565
							if( basis > 199.567 )
								if( Lower_Band <= 200.102 )
									ret := 0.145833
								if( Lower_Band > 200.102 )
									ret := 0.020829
						if( bbm > 0.771142 )
							if( bullPower <= 0.120281 )
								if( Lower_Band <= 283.129 )
									ret := -0.026650
								if( Lower_Band > 283.129 )
									ret := 0.120482
							if( bullPower > 0.120281 )
								if( Upper_Band <= 200.705 )
									ret := 0.425373
								if( Upper_Band > 200.705 )
									ret := -0.082861
					if( bullPower > 1.50587 )
						if( basis <= 197.979 )
							ret := -1.000000 // sell
						if( basis > 197.979 )
							if( bbm <= 2.64479 )
								if( bullPower <= 1.60691 )
									ret := 0.189239
								if( bullPower > 1.60691 )
									ret := 0.020292
							if( bbm > 2.64479 )
								if( bearPower <= -1.9964 )
									ret := -0.177778
								if( bearPower > -1.9964 )
									ret := 0.199670
		if( bbp > 6.60028 )
			if( basis <= 275.064 )
				if( bearPower <= 6.68267 )
					if( bbp <= 6.72415 )
						if( bearPower <= 2.63366 )
							if( bullPower <= 4.28446 )
								ret := -0.500000
							if( bullPower > 4.28446 )
								ret := -1.000000 // sell
						if( bearPower > 2.63366 )
							ret := -1.000000 // sell
					if( bbp > 6.72415 )
						if( Lower_Band <= 215.378 )
							if( Lower_Band <= 200.345 )
								if( bearPower <= 4.10483 )
									ret := -0.783784 // sell
								if( bearPower > 4.10483 )
									ret := 0.400000
							if( Lower_Band > 200.345 )
								if( bullPower <= 6.25382 )
									ret := 0.447368
								if( bullPower > 6.25382 )
									ret := -0.857143 // sell
						if( Lower_Band > 215.378 )
							if( Upper_Band <= 230.293 )
								if( bearPower <= 2.56408 )
									ret := -0.500000
								if( bearPower > 2.56408 )
									ret := -1.000000 // sell
							if( Upper_Band > 230.293 )
								if( Lower_Band <= 264.009 )
									ret := -0.222222
								if( Lower_Band > 264.009 )
									ret := -0.857143 // sell
				if( bearPower > 6.68267 )
					if( Lower_Band <= 208.901 )
						ret := -0.500000
					if( Lower_Band > 208.901 )
						if( bbp <= 20.582 )
							ret := -1.000000 // sell
						if( bbp > 20.582 )
							ret := -0.750000 // sell
			if( basis > 275.064 )
				if( Lower_Band <= 296.725 )
					if( bbp <= 10.057 )
						if( Lower_Band <= 294.56 )
							if( bearPower <= 3.7291 )
								if( Upper_Band <= 291.429 )
									ret := 0.482759
								if( Upper_Band > 291.429 )
									ret := 0.000000
							if( bearPower > 3.7291 )
								if( basis <= 279.052 )
									ret := 0.250000
								if( basis > 279.052 )
									ret := -0.714286 // sell
						if( Lower_Band > 294.56 )
							if( Lower_Band <= 294.862 )
								ret := 1.000000 // buy
							if( Lower_Band > 294.862 )
								ret := 0.250000
					if( bbp > 10.057 )
						if( bullPower <= 6.11068 )
							ret := 0.250000
						if( bullPower > 6.11068 )
							if( bullPower <= 7.21141 )
								ret := 1.000000 // buy
							if( bullPower > 7.21141 )
								ret := 0.500000
				if( Lower_Band > 296.725 )
					if( bearPower <= 3.14782 )
						if( basis <= 307.086 )
							ret := -0.750000 // sell
						if( basis > 307.086 )
							if( Lower_Band <= 307.691 )
								ret := 0.250000
							if( Lower_Band > 307.691 )
								ret := 0.000000
					if( bearPower > 3.14782 )
						if( bbp <= 9.19315 )
							ret := -1.000000 // sell
						if( bbp > 9.19315 )
							ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADSK_15Min_ad7acc93(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


