//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: MATICUSDT_30Min_2BB0_34f76a66 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2BB0_34f76a66", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_34f76a66(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Lower_Band <= 1.57886 )
		if( bearPower <= -0.031311 )
			if( Lower_Band <= 0.735897 )
				if( basis <= 0.393635 )
					if( bullPower <= -0.014021 )
						ret := 1.000000 // buy
					if( bullPower > -0.014021 )
						ret := 0.333333
				if( basis > 0.393635 )
					if( Lower_Band <= 0.420163 )
						ret := -1.000000 // sell
					if( Lower_Band > 0.420163 )
						if( bearPower <= -0.086244 )
							ret := 0.818182 // buy
						if( bearPower > -0.086244 )
							if( basis <= 0.632451 )
								if( Lower_Band <= 0.526936 )
									ret := 0.214286
								if( Lower_Band > 0.526936 )
									ret := 0.714286 // buy
							if( basis > 0.632451 )
								if( bearPower <= -0.037128 )
									ret := -0.752688 // sell
								if( bearPower > -0.037128 )
									ret := -0.178571
			if( Lower_Band > 0.735897 )
				if( basis <= 1.10725 )
					if( bbp <= -0.107764 )
						if( basis <= 0.957003 )
							ret := 1.000000 // buy
						if( basis > 0.957003 )
							if( bullPower <= -0.041538 )
								ret := 0.500000
							if( bullPower > -0.041538 )
								ret := 0.214286
					if( bbp > -0.107764 )
						if( bbm <= 0.044018 )
							if( bearPower <= -0.041503 )
								if( bbp <= -0.060777 )
									ret := 0.575610
								if( bbp > -0.060777 )
									ret := 0.880000 // buy
							if( bearPower > -0.041503 )
								if( basis <= 0.952789 )
									ret := 0.079681
								if( basis > 0.952789 )
									ret := 0.605932
						if( bbm > 0.044018 )
							if( Lower_Band <= 0.795205 )
								if( bbp <= -0.046868 )
									ret := 0.750000 // buy
								if( bbp > -0.046868 )
									ret := 1.000000 // buy
							if( Lower_Band > 0.795205 )
								if( Lower_Band <= 0.903559 )
									ret := -0.683333
								if( Lower_Band > 0.903559 )
									ret := 0.144737
				if( basis > 1.10725 )
					if( bbm <= 0.022847 )
						if( Upper_Band <= 1.24233 )
							if( Upper_Band <= 1.17887 )
								if( Upper_Band <= 1.1673 )
									ret := -0.272727
								if( Upper_Band > 1.1673 )
									ret := 0.600000
							if( Upper_Band > 1.17887 )
								if( bullPower <= -0.020112 )
									ret := -0.214286
								if( bullPower > -0.020112 )
									ret := -0.836735 // sell
						if( Upper_Band > 1.24233 )
							if( Upper_Band <= 1.56482 )
								if( Lower_Band <= 1.46755 )
									ret := 0.148410
								if( Lower_Band > 1.46755 )
									ret := 1.000000 // buy
							if( Upper_Band > 1.56482 )
								if( bbm <= 0.021941 )
									ret := 0.000000
								if( bbm > 0.021941 )
									ret := -0.883721 // sell
					if( bbm > 0.022847 )
						if( bbp <= -0.016592 )
							if( Lower_Band <= 1.08173 )
								if( Upper_Band <= 1.29277 )
									ret := -0.699187
								if( Upper_Band > 1.29277 )
									ret := 1.000000 // buy
							if( Lower_Band > 1.08173 )
								if( bbm <= 0.087381 )
									ret := 0.237454
								if( bbm > 0.087381 )
									ret := 0.678322
						if( bbp > -0.016592 )
							if( basis <= 1.291 )
								ret := -0.846154 // sell
							if( basis > 1.291 )
								if( bullPower <= 0.025357 )
									ret := -0.545455
								if( bullPower > 0.025357 )
									ret := 0.000000
		if( bearPower > -0.031311 )
			if( basis <= 0.339134 )
				if( bearPower <= -5e-06 )
					if( basis <= 0.328715 )
						if( Lower_Band <= 0.304096 )
							if( basis <= 0.264757 )
								if( Upper_Band <= 0.015516 )
									ret := -0.187817
								if( Upper_Band > 0.015516 )
									ret := 0.112969
							if( basis > 0.264757 )
								if( Lower_Band <= 0.300498 )
									ret := 0.618357
								if( Lower_Band > 0.300498 )
									ret := 0.000000
						if( Lower_Band > 0.304096 )
							if( Lower_Band <= 0.312972 )
								if( basis <= 0.322297 )
									ret := -0.380952
								if( basis > 0.322297 )
									ret := -0.865385 // sell
							if( Lower_Band > 0.312972 )
								if( bbm <= 0.00615 )
									ret := 0.500000
								if( bbm > 0.00615 )
									ret := 0.000000
					if( basis > 0.328715 )
						if( bullPower <= -0.002087 )
							if( Upper_Band <= 0.356563 )
								ret := -0.083333
							if( Upper_Band > 0.356563 )
								ret := 1.000000 // buy
						if( bullPower > -0.002087 )
							if( bullPower <= 0.007512 )
								if( Upper_Band <= 0.344036 )
									ret := 0.837209 // buy
								if( Upper_Band > 0.344036 )
									ret := 0.960938 // buy
							if( bullPower > 0.007512 )
								ret := 0.692308
				if( bearPower > -5e-06 )
					if( Upper_Band <= 0.016421 )
						if( basis <= 0.015289 )
							if( bbm <= 0.000136 )
								if( Upper_Band <= 0.013197 )
									ret := -0.920000 // sell
								if( Upper_Band > 0.013197 )
									ret := -0.038462
							if( bbm > 0.000136 )
								if( basis <= 0.014876 )
									ret := 0.552000
								if( basis > 0.014876 )
									ret := -0.454545
						if( basis > 0.015289 )
							if( Lower_Band <= 0.015355 )
								if( basis <= 0.015544 )
									ret := 0.810811 // buy
								if( basis > 0.015544 )
									ret := -0.307692
							if( Lower_Band > 0.015355 )
								if( bullPower <= 0.000146 )
									ret := 0.187500
								if( bullPower > 0.000146 )
									ret := 0.931034 // buy
					if( Upper_Band > 0.016421 )
						if( Upper_Band <= 0.023998 )
							if( bbm <= 0.00029 )
								if( Lower_Band <= 0.017338 )
									ret := 0.028902
								if( Lower_Band > 0.017338 )
									ret := -0.225965
							if( bbm > 0.00029 )
								if( bullPower <= 0.001036 )
									ret := -0.455078
								if( bullPower > 0.001036 )
									ret := 0.275862
						if( Upper_Band > 0.023998 )
							if( bearPower <= 0.000402 )
								if( basis <= 0.026519 )
									ret := 0.726316 // buy
								if( basis > 0.026519 )
									ret := 0.118734
							if( bearPower > 0.000402 )
								if( Upper_Band <= 0.057437 )
									ret := -0.313596
								if( Upper_Band > 0.057437 )
									ret := -0.035047
			if( basis > 0.339134 )
				if( bbp <= 0.00666 )
					if( bbp <= -0.016356 )
						if( bearPower <= -0.031199 )
							ret := -0.571429
						if( bearPower > -0.031199 )
							if( basis <= 1.12827 )
								if( bbp <= -0.029638 )
									ret := 0.002217
								if( bbp > -0.029638 )
									ret := 0.109631
							if( basis > 1.12827 )
								if( Lower_Band <= 1.10956 )
									ret := -0.375000
								if( Lower_Band > 1.10956 )
									ret := -0.054750
					if( bbp > -0.016356 )
						if( Lower_Band <= 0.327682 )
							if( bbm <= 0.008913 )
								if( Lower_Band <= 0.324152 )
									ret := -0.407407
								if( Lower_Band > 0.324152 )
									ret := -0.978022 // sell
							if( bbm > 0.008913 )
								if( BBPower_Color <= 0.5 )
									ret := -0.166667
								if( BBPower_Color > 0.5 )
									ret := -0.870968 // sell
						if( Lower_Band > 0.327682 )
							if( bearPower <= -0.012942 )
								if( Upper_Band <= 0.783784 )
									ret := 0.433213
								if( Upper_Band > 0.783784 )
									ret := 0.017782
							if( bearPower > -0.012942 )
								if( bbp <= -0.00975 )
									ret := -0.091937
								if( bbp > -0.00975 )
									ret := -0.027083
				if( bbp > 0.00666 )
					if( bbp <= 0.345727 )
						if( bbm <= 0.005492 )
							if( Lower_Band <= 0.335521 )
								ret := -0.736842 // sell
							if( Lower_Band > 0.335521 )
								if( Lower_Band <= 0.740747 )
									ret := 0.193462
								if( Lower_Band > 0.740747 )
									ret := 0.088794
						if( bbm > 0.005492 )
							if( bullPower <= 0.023696 )
								if( basis <= 0.431211 )
									ret := -0.275897
								if( basis > 0.431211 )
									ret := -0.000508
							if( bullPower > 0.023696 )
								if( bbm <= 0.012594 )
									ret := 0.268692
								if( bbm > 0.012594 )
									ret := 0.013328
					if( bbp > 0.345727 )
						if( bbm <= 0.153863 )
							ret := -0.777778 // sell
						if( bbm > 0.153863 )
							ret := -0.882353 // sell
	if( Lower_Band > 1.57886 )
		if( bearPower <= -0.073138 )
			if( basis <= 1.77292 )
				if( bearPower <= -0.080969 )
					if( Upper_Band <= 1.84552 )
						if( Lower_Band <= 1.59565 )
							ret := -0.800000 // sell
						if( Lower_Band > 1.59565 )
							ret := -0.916667 // sell
					if( Upper_Band > 1.84552 )
						if( Lower_Band <= 1.62076 )
							ret := -0.800000 // sell
						if( Lower_Band > 1.62076 )
							ret := -1.000000 // sell
				if( bearPower > -0.080969 )
					ret := -0.428571
			if( basis > 1.77292 )
				if( Upper_Band <= 1.9096 )
					ret := -0.500000
				if( Upper_Band > 1.9096 )
					if( bbp <= -0.13591 )
						if( bbp <= -0.196316 )
							if( basis <= 2.38769 )
								if( bearPower <= -0.208791 )
									ret := 0.795455 // buy
								if( bearPower > -0.208791 )
									ret := 0.350000
							if( basis > 2.38769 )
								ret := -0.636364
						if( bbp > -0.196316 )
							if( Lower_Band <= 1.64756 )
								if( Upper_Band <= 2.32301 )
									ret := -0.600000
								if( Upper_Band > 2.32301 )
									ret := -1.000000 // sell
							if( Lower_Band > 1.64756 )
								if( bearPower <= -0.11499 )
									ret := -0.181818
								if( bearPower > -0.11499 )
									ret := 0.234234
					if( bbp > -0.13591 )
						if( bearPower <= -0.117782 )
							ret := -0.733333 // sell
						if( bearPower > -0.117782 )
							if( basis <= 2.06376 )
								if( bearPower <= -0.077791 )
									ret := 0.352273
								if( bearPower > -0.077791 )
									ret := -0.090909
							if( basis > 2.06376 )
								if( Upper_Band <= 2.41559 )
									ret := 0.837209 // buy
								if( Upper_Band > 2.41559 )
									ret := 0.481481
		if( bearPower > -0.073138 )
			if( bearPower <= 0.007925 )
				if( Upper_Band <= 1.96486 )
					if( basis <= 1.92382 )
						if( bearPower <= -0.063613 )
							if( bearPower <= -0.06836 )
								if( Lower_Band <= 1.69571 )
									ret := -0.769231 // sell
								if( Lower_Band > 1.69571 )
									ret := -1.000000 // sell
							if( bearPower > -0.06836 )
								if( Upper_Band <= 1.84794 )
									ret := 0.083333
								if( Upper_Band > 1.84794 )
									ret := -0.800000 // sell
						if( bearPower > -0.063613 )
							if( bbm <= 0.04509 )
								if( bearPower <= -0.028024 )
									ret := 0.257687
								if( bearPower > -0.028024 )
									ret := -0.036472
							if( bbm > 0.04509 )
								if( basis <= 1.71277 )
									ret := 0.523810
								if( basis > 1.71277 )
									ret := -0.387352
					if( basis > 1.92382 )
						if( bbp <= 0.008515 )
							ret := 0.833333 // buy
						if( bbp > 0.008515 )
							ret := 1.000000 // buy
				if( Upper_Band > 1.96486 )
					if( bearPower <= -0.018101 )
						if( bearPower <= -0.01961 )
							if( basis <= 2.478 )
								if( Lower_Band <= 2.08058 )
									ret := -0.130214
								if( Lower_Band > 2.08058 )
									ret := -0.406100
							if( basis > 2.478 )
								if( bbm <= 0.037047 )
									ret := -0.045714
								if( bbm > 0.037047 )
									ret := 0.293333
						if( bearPower > -0.01961 )
							if( bullPower <= -0.001236 )
								if( basis <= 2.40675 )
									ret := -0.733333 // sell
								if( basis > 2.40675 )
									ret := -0.954545 // sell
							if( bullPower > -0.001236 )
								if( Upper_Band <= 2.08426 )
									ret := -0.777778 // sell
								if( Upper_Band > 2.08426 )
									ret := -0.310345
					if( bearPower > -0.018101 )
						if( Upper_Band <= 2.57595 )
							if( basis <= 2.01977 )
								if( bbp <= 0.046379 )
									ret := -0.468013
								if( bbp > 0.046379 )
									ret := 0.545455
							if( basis > 2.01977 )
								if( bullPower <= 0.027347 )
									ret := 0.148396
								if( bullPower > 0.027347 )
									ret := -0.182540
						if( Upper_Band > 2.57595 )
							if( Lower_Band <= 2.36686 )
								ret := -1.000000 // sell
							if( Lower_Band > 2.36686 )
								if( Upper_Band <= 2.6097 )
									ret := -0.543860
								if( Upper_Band > 2.6097 )
									ret := -0.147541
			if( bearPower > 0.007925 )
				if( bearPower <= 0.06769 )
					if( Upper_Band <= 1.68416 )
						if( Upper_Band <= 1.649 )
							if( bearPower <= 0.009735 )
								ret := -0.818182 // sell
							if( bearPower > 0.009735 )
								ret := -1.000000 // sell
						if( Upper_Band > 1.649 )
							if( basis <= 1.63183 )
								ret := -0.157895
							if( basis > 1.63183 )
								if( Lower_Band <= 1.60841 )
									ret := -0.950000 // sell
								if( Lower_Band > 1.60841 )
									ret := -0.500000
					if( Upper_Band > 1.68416 )
						if( bearPower <= 0.041871 )
							if( bearPower <= 0.038891 )
								if( basis <= 1.91607 )
									ret := -0.379906
								if( basis > 1.91607 )
									ret := -0.137566
							if( bearPower > 0.038891 )
								if( bbm <= 0.048531 )
									ret := 0.050000
								if( bbm > 0.048531 )
									ret := 0.714286 // buy
						if( bearPower > 0.041871 )
							if( basis <= 1.78086 )
								ret := 0.294118
							if( basis > 1.78086 )
								if( basis <= 2.09549 )
									ret := -0.817460 // sell
								if( basis > 2.09549 )
									ret := -0.384615
				if( bearPower > 0.06769 )
					if( bbp <= 0.36429 )
						if( bullPower <= 0.13456 )
							if( Upper_Band <= 2.16915 )
								ret := 0.090909
							if( Upper_Band > 2.16915 )
								ret := -0.818182 // sell
						if( bullPower > 0.13456 )
							if( Upper_Band <= 2.15849 )
								ret := 1.000000 // buy
							if( Upper_Band > 2.15849 )
								if( Lower_Band <= 1.82382 )
									ret := 0.437500
								if( Lower_Band > 1.82382 )
									ret := 0.894737 // buy
					if( bbp > 0.36429 )
						ret := -0.304348
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MATICUSDT_30Min_34f76a66(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


