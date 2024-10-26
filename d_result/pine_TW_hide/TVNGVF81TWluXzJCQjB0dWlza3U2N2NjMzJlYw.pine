//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: MSFT_5Min_2BB0_67cc32ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2BB0_67cc32ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_67cc32ec(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbm <= 1.01749 )
		if( bullPower <= 0.035223 )
			if( Lower_Band <= 318.031 )
				if( basis <= 311.586 )
					if( bullPower <= -0.265666 )
						if( bbm <= 0.865 )
							if( bearPower <= -0.924523 )
								if( basis <= 280.819 )
									ret := -0.300000
								if( basis > 280.819 )
									ret := 0.613924
							if( bearPower > -0.924523 )
								if( Lower_Band <= 299.749 )
									ret := -0.065789
								if( Lower_Band > 299.749 )
									ret := 0.387597
						if( bbm > 0.865 )
							ret := -0.800000 // sell
					if( bullPower > -0.265666 )
						if( Lower_Band <= 310.049 )
							if( basis <= 310.46 )
								if( bbp <= -0.113531 )
									ret := 0.037227
								if( bbp > -0.113531 )
									ret := -0.278261
							if( basis > 310.46 )
								if( bullPower <= -0.078137 )
									ret := 0.551724
								if( bullPower > -0.078137 )
									ret := 1.000000 // buy
						if( Lower_Band > 310.049 )
							if( bullPower <= -0.11252 )
								ret := -0.100000
							if( bullPower > -0.11252 )
								if( bbm <= 0.178882 )
									ret := -0.045455
								if( bbm > 0.178882 )
									ret := -0.709091 // sell
				if( basis > 311.586 )
					if( bearPower <= -1.87183 )
						if( bearPower <= -1.98803 )
							ret := -0.117647
						if( bearPower > -1.98803 )
							ret := -0.823529 // sell
					if( bearPower > -1.87183 )
						if( basis <= 316.746 )
							if( bbp <= -1.30311 )
								if( bullPower <= -0.939772 )
									ret := 0.953488 // buy
								if( bullPower > -0.939772 )
									ret := 0.637500
							if( bbp > -1.30311 )
								if( Lower_Band <= 313.369 )
									ret := 0.088816
								if( Lower_Band > 313.369 )
									ret := 0.484694
						if( basis > 316.746 )
							if( bbp <= -2.4398 )
								ret := -0.437500
							if( bbp > -2.4398 )
								if( Upper_Band <= 317.941 )
									ret := -0.532258
								if( Upper_Band > 317.941 )
									ret := 0.297235
			if( Lower_Band > 318.031 )
				if( Upper_Band <= 463.54 )
					if( basis <= 444.131 )
						if( bearPower <= -1.81631 )
							if( Lower_Band <= 334.834 )
								if( Lower_Band <= 333.16 )
									ret := 0.166667
								if( Lower_Band > 333.16 )
									ret := 0.941176 // buy
							if( Lower_Band > 334.834 )
								if( Upper_Band <= 366.808 )
									ret := -0.775510 // sell
								if( Upper_Band > 366.808 )
									ret := -0.119891
						if( bearPower > -1.81631 )
							if( bbp <= -0.751361 )
								if( Upper_Band <= 444.807 )
									ret := 0.048681
								if( Upper_Band > 444.807 )
									ret := -0.448980
							if( bbp > -0.751361 )
								if( bbm <= 0.454052 )
									ret := 0.026084
								if( bbm > 0.454052 )
									ret := -0.106599
					if( basis > 444.131 )
						if( bbm <= 0.028667 )
							if( basis <= 448.017 )
								if( bullPower <= -0.154886 )
									ret := 0.500000
								if( bullPower > -0.154886 )
									ret := -0.066667
							if( basis > 448.017 )
								if( bullPower <= -0.420797 )
									ret := 0.480000
								if( bullPower > -0.420797 )
									ret := -0.232704
						if( bbm > 0.028667 )
							if( bbm <= 0.62664 )
								if( basis <= 460.233 )
									ret := 0.259972
								if( basis > 460.233 )
									ret := 0.621212
							if( bbm > 0.62664 )
								if( bullPower <= -0.049323 )
									ret := 0.634731
								if( bullPower > -0.049323 )
									ret := -0.038462
				if( Upper_Band > 463.54 )
					if( basis <= 463.728 )
						if( bbm <= 0.779845 )
							if( bbp <= -1.78948 )
								ret := -0.416667
							if( bbp > -1.78948 )
								if( bbm <= 0.527431 )
									ret := -0.950000 // sell
								if( bbm > 0.527431 )
									ret := -0.454545
						if( bbm > 0.779845 )
							ret := -1.000000 // sell
					if( basis > 463.728 )
						if( Lower_Band <= 462.594 )
							ret := -1.000000 // sell
						if( Lower_Band > 462.594 )
							if( Upper_Band <= 466.324 )
								if( bullPower <= -0.021758 )
									ret := 0.285714
								if( bullPower > -0.021758 )
									ret := 0.777778 // buy
							if( Upper_Band > 466.324 )
								if( Lower_Band <= 464.468 )
									ret := 0.043478
								if( Lower_Band > 464.468 )
									ret := -0.300000
		if( bullPower > 0.035223 )
			if( bbp <= -0.235661 )
				if( bbm <= 0.812844 )
					if( Lower_Band <= 431.978 )
						if( bbp <= -0.237555 )
							if( Upper_Band <= 307.559 )
								if( bbm <= 0.559277 )
									ret := -0.285714
								if( bbm > 0.559277 )
									ret := 0.960000 // buy
							if( Upper_Band > 307.559 )
								if( Upper_Band <= 309.86 )
									ret := -0.794118 // sell
								if( Upper_Band > 309.86 )
									ret := -0.128205
						if( bbp > -0.237555 )
							if( Upper_Band <= 408.255 )
								ret := -0.600000
							if( Upper_Band > 408.255 )
								ret := -0.850000 // sell
					if( Lower_Band > 431.978 )
						if( Upper_Band <= 445.438 )
							if( bearPower <= -0.393391 )
								if( bullPower <= 0.080246 )
									ret := 0.142857
								if( bullPower > 0.080246 )
									ret := 0.738462 // buy
							if( bearPower > -0.393391 )
								ret := -0.105263
						if( Upper_Band > 445.438 )
							if( bullPower <= 0.159135 )
								if( bearPower <= -0.580742 )
									ret := -0.677419
								if( bearPower > -0.580742 )
									ret := 0.147059
							if( bullPower > 0.159135 )
								ret := 0.600000
				if( bbm > 0.812844 )
					if( Lower_Band <= 415.898 )
						if( bearPower <= -0.880622 )
							if( bullPower <= 0.081012 )
								if( bbm <= 0.992952 )
									ret := -0.111111
								if( bbm > 0.992952 )
									ret := 0.384615
							if( bullPower > 0.081012 )
								ret := 0.888889 // buy
						if( bearPower > -0.880622 )
							if( basis <= 406.049 )
								if( basis <= 392.312 )
									ret := -0.100917
								if( basis > 392.312 )
									ret := 0.372549
							if( basis > 406.049 )
								if( bbp <= -0.503831 )
									ret := 0.034483
								if( bbp > -0.503831 )
									ret := -0.489130
					if( Lower_Band > 415.898 )
						if( Upper_Band <= 426.632 )
							if( bbp <= -0.477952 )
								if( bbp <= -0.611303 )
									ret := 0.771429 // buy
								if( bbp > -0.611303 )
									ret := 0.523810
							if( bbp > -0.477952 )
								if( bbm <= 0.92495 )
									ret := -0.272727
								if( bbm > 0.92495 )
									ret := 0.772727 // buy
						if( Upper_Band > 426.632 )
							if( Lower_Band <= 436.93 )
								if( bearPower <= -0.732224 )
									ret := -0.096774
								if( bearPower > -0.732224 )
									ret := -0.500000
							if( Lower_Band > 436.93 )
								if( bullPower <= 0.26735 )
									ret := 0.350000
								if( bullPower > 0.26735 )
									ret := -0.111111
			if( bbp > -0.235661 )
				if( basis <= 349.162 )
					if( basis <= 331.769 )
						if( basis <= 286.222 )
							if( basis <= 282.902 )
								if( Upper_Band <= 278.782 )
									ret := -0.961538 // sell
								if( Upper_Band > 278.782 )
									ret := 0.060403
							if( basis > 282.902 )
								if( bearPower <= -0.32767 )
									ret := -0.800000 // sell
								if( bearPower > -0.32767 )
									ret := -0.985294 // sell
						if( basis > 286.222 )
							if( bearPower <= 1.85039 )
								if( Lower_Band <= 294.701 )
									ret := 0.840426 // buy
								if( Lower_Band > 294.701 )
									ret := -0.003155
							if( bearPower > 1.85039 )
								ret := -1.000000 // sell
					if( basis > 331.769 )
						if( Upper_Band <= 349.569 )
							if( bearPower <= 1.25789 )
								if( bearPower <= -0.320803 )
									ret := -0.301370
								if( bearPower > -0.320803 )
									ret := -0.099210
							if( bearPower > 1.25789 )
								if( basis <= 342.056 )
									ret := 0.796296 // buy
								if( basis > 342.056 )
									ret := -0.066667
						if( Upper_Band > 349.569 )
							if( Upper_Band <= 349.852 )
								if( bearPower <= 0.258559 )
									ret := -0.883721 // sell
								if( bearPower > 0.258559 )
									ret := -0.500000
							if( Upper_Band > 349.852 )
								if( bbm <= 0.297838 )
									ret := -0.694915
								if( bbm > 0.297838 )
									ret := -0.152174
				if( basis > 349.162 )
					if( basis <= 405.169 )
						if( bbp <= 4.54948 )
							if( BBPower_Color <= 0.5 )
								if( basis <= 349.315 )
									ret := 1.000000 // buy
								if( basis > 349.315 )
									ret := -0.021680
							if( BBPower_Color > 0.5 )
								if( bearPower <= 1.28605 )
									ret := 0.084068
								if( bearPower > 1.28605 )
									ret := -0.313869
						if( bbp > 4.54948 )
							if( bbm <= 0.775 )
								if( bbp <= 5.22557 )
									ret := 0.800000 // buy
								if( bbp > 5.22557 )
									ret := 0.541667
							if( bbm > 0.775 )
								ret := 0.285714
					if( basis > 405.169 )
						if( Upper_Band <= 413.522 )
							if( bbm <= 1.00595 )
								if( Upper_Band <= 405.978 )
									ret := -0.750000 // sell
								if( Upper_Band > 405.978 )
									ret := -0.085770
							if( bbm > 1.00595 )
								ret := 0.750000 // buy
						if( Upper_Band > 413.522 )
							if( Lower_Band <= 467.245 )
								if( Upper_Band <= 413.868 )
									ret := 0.538462
								if( Upper_Band > 413.868 )
									ret := -0.016632
							if( Lower_Band > 467.245 )
								if( bearPower <= -0.000718 )
									ret := 0.583333
								if( bearPower > -0.000718 )
									ret := 1.000000 // buy
	if( bbm > 1.01749 )
		if( bbm <= 2.28098 )
			if( bbp <= 1.60645 )
				if( bbp <= 1.58902 )
					if( bearPower <= 0.223481 )
						if( Upper_Band <= 333.47 )
							if( bullPower <= -0.373544 )
								if( bearPower <= -2.30163 )
									ret := -0.266667
								if( bearPower > -2.30163 )
									ret := 0.591241
							if( bullPower > -0.373544 )
								if( bbp <= 1.07593 )
									ret := -0.011211
								if( bbp > 1.07593 )
									ret := 0.328467
						if( Upper_Band > 333.47 )
							if( basis <= 454.807 )
								if( Upper_Band <= 350.455 )
									ret := -0.252462
								if( Upper_Band > 350.455 )
									ret := -0.052999
							if( basis > 454.807 )
								if( basis <= 466.529 )
									ret := -0.752212 // sell
								if( basis > 466.529 )
									ret := 0.000000
					if( bearPower > 0.223481 )
						if( bullPower <= 1.29085 )
							ret := 0.900000 // buy
						if( bullPower > 1.29085 )
							ret := 0.714286 // buy
				if( bbp > 1.58902 )
					ret := 0.937500 // buy
			if( bbp > 1.60645 )
				if( Upper_Band <= 308.084 )
					if( Upper_Band <= 298.479 )
						ret := 1.000000 // buy
					if( Upper_Band > 298.479 )
						if( basis <= 304.653 )
							ret := -0.090909
						if( basis > 304.653 )
							ret := 1.000000 // buy
				if( Upper_Band > 308.084 )
					if( bearPower <= 0.279662 )
						if( bbp <= 2.25762 )
							if( basis <= 420.353 )
								if( basis <= 405.751 )
									ret := -0.398148
								if( basis > 405.751 )
									ret := -0.825581 // sell
							if( basis > 420.353 )
								if( bullPower <= 1.94513 )
									ret := 0.000000
								if( bullPower > 1.94513 )
									ret := -0.214286
						if( bbp > 2.25762 )
							if( bearPower <= 0.218116 )
								ret := -0.277778
							if( bearPower > 0.218116 )
								ret := 0.636364
					if( bearPower > 0.279662 )
						if( bbp <= 1.89155 )
							if( bbp <= 1.75189 )
								if( Lower_Band <= 328.454 )
									ret := 0.666667
								if( Lower_Band > 328.454 )
									ret := -0.312500
							if( bbp > 1.75189 )
								if( Upper_Band <= 372.375 )
									ret := 0.566667
								if( Upper_Band > 372.375 )
									ret := -0.068966
						if( bbp > 1.89155 )
							if( basis <= 459.755 )
								if( basis <= 415.774 )
									ret := -0.156496
								if( basis > 415.774 )
									ret := -0.594488
							if( basis > 459.755 )
								if( basis <= 461.505 )
									ret := 1.000000 // buy
								if( basis > 461.505 )
									ret := 0.466667
		if( bbm > 2.28098 )
			if( bullPower <= 1.22193 )
				if( bbp <= -1.61704 )
					if( bearPower <= -8.97284 )
						ret := 1.000000 // buy
					if( bearPower > -8.97284 )
						if( Upper_Band <= 373.312 )
							if( bullPower <= -0.568283 )
								ret := -0.600000
							if( bullPower > -0.568283 )
								if( Upper_Band <= 360.576 )
									ret := 0.195122
								if( Upper_Band > 360.576 )
									ret := -0.833333 // sell
						if( Upper_Band > 373.312 )
							if( bearPower <= -4.97314 )
								if( Upper_Band <= 416.651 )
									ret := 0.727273 // buy
								if( Upper_Band > 416.651 )
									ret := -0.272727
							if( bearPower > -4.97314 )
								if( bearPower <= -4.48242 )
									ret := 0.888889 // buy
								if( bearPower > -4.48242 )
									ret := 0.277108
				if( bbp > -1.61704 )
					if( basis <= 322.795 )
						ret := -0.545455
					if( basis > 322.795 )
						if( Upper_Band <= 407.376 )
							if( bbm <= 2.52143 )
								if( bearPower <= -1.50937 )
									ret := 0.458333
								if( bearPower > -1.50937 )
									ret := -0.454545
							if( bbm > 2.52143 )
								if( Lower_Band <= 358.249 )
									ret := 1.000000 // buy
								if( Lower_Band > 358.249 )
									ret := 0.913043 // buy
						if( Upper_Band > 407.376 )
							if( bbm <= 3.35874 )
								if( bbm <= 2.84 )
									ret := 0.735632 // buy
								if( bbm > 2.84 )
									ret := 0.545455
							if( bbm > 3.35874 )
								ret := 1.000000 // buy
			if( bullPower > 1.22193 )
				if( bbm <= 10.8715 )
					if( bbp <= 15.0078 )
						if( Upper_Band <= 407.057 )
							if( Lower_Band <= 375.666 )
								if( bullPower <= 4.36606 )
									ret := -0.193939
								if( bullPower > 4.36606 )
									ret := 0.425926
							if( Lower_Band > 375.666 )
								if( Lower_Band <= 385.51 )
									ret := 0.980769 // buy
								if( Lower_Band > 385.51 )
									ret := 0.370787
						if( Upper_Band > 407.057 )
							if( Upper_Band <= 407.674 )
								if( Lower_Band <= 404.097 )
									ret := -0.416667
								if( Lower_Band > 404.097 )
									ret := -1.000000 // sell
							if( Upper_Band > 407.674 )
								if( bbm <= 7.41734 )
									ret := -0.135952
								if( bbm > 7.41734 )
									ret := 0.875000 // buy
					if( bbp > 15.0078 )
						ret := -1.000000 // sell
				if( bbm > 10.8715 )
					if( Lower_Band <= 353.06 )
						ret := -1.000000 // sell
					if( Lower_Band > 353.06 )
						if( bearPower <= -8.98976 )
							ret := 0.076923
						if( bearPower > -8.98976 )
							ret := -0.636364
	
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
float op_operation = decision_tree_0_MSFT_5Min_67cc32ec(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


