//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: AFRM_1Min_1B00_c47b5858 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1B00_c47b5858", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_c47b5858(bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= -0.001174 )
		if( bbm <= 0.00186 )
			if( bbp <= -0.30286 )
				if( bearPower <= -0.414994 )
					ret := -0.266667
				if( bearPower > -0.414994 )
					if( bearPower <= -0.176026 )
						if( bullPower <= -0.193405 )
							if( bbm <= 0.00019 )
								if( bearPower <= -0.209034 )
									ret := 0.699588
								if( bearPower > -0.209034 )
									ret := 0.250000
							if( bbm > 0.00019 )
								ret := 0.894737 // buy
						if( bullPower > -0.193405 )
							if( bbp <= -0.370239 )
								if( bullPower <= -0.19149 )
									ret := 0.846154 // buy
								if( bullPower > -0.19149 )
									ret := 1.000000 // buy
							if( bbp > -0.370239 )
								if( bbp <= -0.354567 )
									ret := 0.764706 // buy
								if( bbp > -0.354567 )
									ret := 0.631579
					if( bearPower > -0.176026 )
						if( bullPower <= -0.163725 )
							if( bbp <= -0.341267 )
								if( bbp <= -0.347159 )
									ret := -0.416667
								if( bbp > -0.347159 )
									ret := 0.807692 // buy
							if( bbp > -0.341267 )
								ret := -0.228571
						if( bullPower > -0.163725 )
							if( bearPower <= -0.152456 )
								if( bbp <= -0.31584 )
									ret := 0.641509
								if( bbp > -0.31584 )
									ret := 0.893617 // buy
							if( bearPower > -0.152456 )
								ret := 0.454545
			if( bbp > -0.30286 )
				if( bbp <= -0.077115 )
					if( bearPower <= -0.04248 )
						if( bearPower <= -0.044879 )
							if( bearPower <= -0.149818 )
								if( bullPower <= -0.150682 )
									ret := 0.111111
								if( bullPower > -0.150682 )
									ret := -0.666667
							if( bearPower > -0.149818 )
								if( bbm <= 0.000216 )
									ret := 0.299576
								if( bbm > 0.000216 )
									ret := 0.466667
						if( bearPower > -0.044879 )
							if( bbp <= -0.088205 )
								if( bullPower <= -0.044341 )
									ret := -0.214286
								if( bullPower > -0.044341 )
									ret := -0.944444 // sell
							if( bbp > -0.088205 )
								if( bbp <= -0.086019 )
									ret := 0.531915
								if( bbp > -0.086019 )
									ret := -0.232143
					if( bearPower > -0.04248 )
						if( bbp <= -0.08371 )
							if( bbp <= -0.084418 )
								if( bullPower <= -0.042399 )
									ret := 0.727273 // buy
								if( bullPower > -0.042399 )
									ret := 0.333333
							if( bbp > -0.084418 )
								ret := 0.884615 // buy
						if( bbp > -0.08371 )
							if( bullPower <= -0.041331 )
								if( bearPower <= -0.041722 )
									ret := 0.454545
								if( bearPower > -0.041722 )
									ret := -0.052632
							if( bullPower > -0.041331 )
								if( bearPower <= -0.040622 )
									ret := 0.745098 // buy
								if( bearPower > -0.040622 )
									ret := 0.529412
				if( bbp > -0.077115 )
					if( bearPower <= -0.037691 )
						if( bearPower <= -0.037994 )
							if( bbp <= -0.076799 )
								ret := -0.266667
							if( bbp > -0.076799 )
								if( bearPower <= -0.038129 )
									ret := 0.625000
								if( bearPower > -0.038129 )
									ret := -0.100000
						if( bearPower > -0.037994 )
							ret := -0.625000
					if( bearPower > -0.037691 )
						if( bbm <= 0.000426 )
							if( bearPower <= -0.001366 )
								if( bullPower <= -0.013029 )
									ret := 0.162876
								if( bullPower > -0.013029 )
									ret := 0.062807
							if( bearPower > -0.001366 )
								if( bearPower <= -0.001307 )
									ret := 0.636364
								if( bearPower > -0.001307 )
									ret := 0.538462
						if( bbm > 0.000426 )
							if( bbm <= 0.000845 )
								ret := 0.739130 // buy
							if( bbm > 0.000845 )
								if( bbm <= 0.001375 )
									ret := -0.166667
								if( bbm > 0.001375 )
									ret := 0.583333
		if( bbm > 0.00186 )
			if( bbm <= 0.720382 )
				if( bearPower <= -0.538949 )
					if( bbp <= -0.821376 )
						if( bearPower <= -1.11763 )
							ret := 0.733333 // buy
						if( bearPower > -1.11763 )
							if( bullPower <= -0.558487 )
								if( bearPower <= -0.829388 )
									ret := -0.900000 // sell
								if( bearPower > -0.829388 )
									ret := -0.208333
							if( bullPower > -0.558487 )
								if( bbm <= 0.528657 )
									ret := 0.019608
								if( bbm > 0.528657 )
									ret := -0.772727 // sell
					if( bbp > -0.821376 )
						if( bbm <= 0.423091 )
							ret := -0.153846
						if( bbm > 0.423091 )
							if( bullPower <= -0.108642 )
								if( bbp <= -0.745436 )
									ret := -1.000000 // sell
								if( bbp > -0.745436 )
									ret := -0.500000
							if( bullPower > -0.108642 )
								ret := -1.000000 // sell
				if( bearPower > -0.538949 )
					if( bbp <= -0.542062 )
						if( bbm <= 0.312047 )
							if( bbm <= 0.086331 )
								if( bbm <= 0.010496 )
									ret := -0.073171
								if( bbm > 0.010496 )
									ret := 0.704545 // buy
							if( bbm > 0.086331 )
								if( bbp <= -0.550967 )
									ret := 0.159341
								if( bbp > -0.550967 )
									ret := 0.740000 // buy
						if( bbm > 0.312047 )
							if( bbm <= 0.351688 )
								if( bearPower <= -0.458814 )
									ret := 1.000000 // buy
								if( bearPower > -0.458814 )
									ret := 0.900000 // buy
							if( bbm > 0.351688 )
								if( bearPower <= -0.509555 )
									ret := 0.842105 // buy
								if( bearPower > -0.509555 )
									ret := 0.437500
					if( bbp > -0.542062 )
						if( bearPower <= -0.404623 )
							if( bearPower <= -0.44738 )
								ret := -0.166667
							if( bearPower > -0.44738 )
								if( bullPower <= -0.068987 )
									ret := -1.000000 // sell
								if( bullPower > -0.068987 )
									ret := -0.860000 // sell
						if( bearPower > -0.404623 )
							if( bbp <= -0.359722 )
								if( bearPower <= -0.357471 )
									ret := 0.254717
								if( bearPower > -0.357471 )
									ret := -0.157794
							if( bbp > -0.359722 )
								if( bullPower <= -0.004175 )
									ret := 0.020412
								if( bullPower > -0.004175 )
									ret := 0.156022
			if( bbm > 0.720382 )
				if( bbp <= -1.3671 )
					ret := 0.363636
				if( bbp > -1.3671 )
					ret := 1.000000 // buy
	if( bullPower > -0.001174 )
		if( bbm <= 0.003474 )
			if( bbp <= 0.120731 )
				if( bbm <= 4e-06 )
					if( bbp <= 0.034792 )
						if( bearPower <= 0.001243 )
							if( bbp <= 0.001832 )
								if( bearPower <= 0.000574 )
									ret := -0.240310
								if( bearPower > 0.000574 )
									ret := 0.307692
							if( bbp > 0.001832 )
								if( bbp <= 0.00213 )
									ret := -0.812500 // sell
								if( bbp > 0.00213 )
									ret := -0.500000
						if( bearPower > 0.001243 )
							if( bullPower <= 0.001566 )
								ret := 0.809524 // buy
							if( bullPower > 0.001566 )
								if( bbp <= 0.003949 )
									ret := -0.645161
								if( bbp > 0.003949 )
									ret := 0.063110
					if( bbp > 0.034792 )
						if( bullPower <= 0.036581 )
							if( bearPower <= 0.030295 )
								if( bbp <= 0.038916 )
									ret := -0.398936
								if( bbp > 0.038916 )
									ret := -0.060748
							if( bearPower > 0.030295 )
								if( bbp <= 0.069484 )
									ret := -0.369478
								if( bbp > 0.069484 )
									ret := -0.653846
						if( bullPower > 0.036581 )
							if( bullPower <= 0.048221 )
								if( bearPower <= 0.048096 )
									ret := 0.075235
								if( bearPower > 0.048096 )
									ret := 0.875000 // buy
							if( bullPower > 0.048221 )
								if( bullPower <= 0.052347 )
									ret := -0.382022
								if( bullPower > 0.052347 )
									ret := 0.021277
				if( bbm > 4e-06 )
					if( bearPower <= 0.030368 )
						if( bearPower <= 0.024044 )
							if( bbp <= 0.017674 )
								if( bbp <= 0.013673 )
									ret := -0.312500
								if( bbp > 0.013673 )
									ret := -1.000000 // sell
							if( bbp > 0.017674 )
								if( bbm <= 0.000497 )
									ret := -0.045455
								if( bbm > 0.000497 )
									ret := -0.538462
						if( bearPower > 0.024044 )
							ret := -1.000000 // sell
					if( bearPower > 0.030368 )
						if( bbm <= 0.00069 )
							ret := 0.000000
						if( bbm > 0.00069 )
							if( bearPower <= 0.040613 )
								ret := -0.727273 // sell
							if( bearPower > 0.040613 )
								ret := -0.285714
			if( bbp > 0.120731 )
				if( bbm <= 9.6e-05 )
					if( bullPower <= 0.126558 )
						if( bullPower <= 0.121706 )
							if( bearPower <= 0.06115 )
								if( bbp <= 0.121494 )
									ret := -0.900000 // sell
								if( bbp > 0.121494 )
									ret := -1.000000 // sell
							if( bearPower > 0.06115 )
								if( bbp <= 0.176025 )
									ret := -0.349066
								if( bbp > 0.176025 )
									ret := -0.208272
						if( bullPower > 0.121706 )
							if( bullPower <= 0.123156 )
								if( bearPower <= 0.122706 )
									ret := 0.545455
								if( bearPower > 0.122706 )
									ret := 0.875000 // buy
							if( bullPower > 0.123156 )
								if( bbp <= 0.248976 )
									ret := -0.260870
								if( bbp > 0.248976 )
									ret := 0.538462
					if( bullPower > 0.126558 )
						if( bbp <= 0.483614 )
							if( bullPower <= 0.161647 )
								if( bullPower <= 0.154419 )
									ret := -0.548287
								if( bullPower > 0.154419 )
									ret := -0.916667 // sell
							if( bullPower > 0.161647 )
								if( bbp <= 0.379287 )
									ret := -0.311628
								if( bbp > 0.379287 )
									ret := -0.674877
						if( bbp > 0.483614 )
							if( bearPower <= 0.268403 )
								if( bullPower <= 0.263736 )
									ret := -0.177419
								if( bullPower > 0.263736 )
									ret := 1.000000 // buy
							if( bearPower > 0.268403 )
								if( bbp <= 0.710957 )
									ret := -0.605263
								if( bbp > 0.710957 )
									ret := -0.018868
				if( bbm > 9.6e-05 )
					if( bearPower <= 0.387855 )
						if( bbm <= 0.002445 )
							if( bbp <= 0.47092 )
								if( bearPower <= 0.128814 )
									ret := -0.111111
								if( bearPower > 0.128814 )
									ret := 0.500000
							if( bbp > 0.47092 )
								ret := -1.000000 // sell
						if( bbm > 0.002445 )
							ret := -0.666667
					if( bearPower > 0.387855 )
						ret := 0.789474 // buy
		if( bbm > 0.003474 )
			if( bearPower <= 0.176191 )
				if( bbp <= 0.649967 )
					if( bullPower <= 0.005731 )
						if( bearPower <= -0.094661 )
							if( bbp <= -0.306083 )
								ret := 0.600000
							if( bbp > -0.306083 )
								if( bbm <= 0.100049 )
									ret := -0.695122
								if( bbm > 0.100049 )
									ret := -0.252396
						if( bearPower > -0.094661 )
							if( bbm <= 0.089989 )
								if( bearPower <= -0.070474 )
									ret := -0.283951
								if( bearPower > -0.070474 )
									ret := -0.076749
							if( bbm > 0.089989 )
								if( bullPower <= 0.002749 )
									ret := 0.783784 // buy
								if( bullPower > 0.002749 )
									ret := -0.200000
					if( bullPower > 0.005731 )
						if( bbp <= -0.223028 )
							if( bbp <= -0.234115 )
								if( bbm <= 0.350366 )
									ret := 0.523810
								if( bbm > 0.350366 )
									ret := 0.063927
							if( bbp > -0.234115 )
								if( bearPower <= -0.266109 )
									ret := 1.000000 // buy
								if( bearPower > -0.266109 )
									ret := 0.764706 // buy
						if( bbp > -0.223028 )
							if( bbm <= 0.144793 )
								if( bearPower <= 0.133011 )
									ret := -0.002080
								if( bearPower > 0.133011 )
									ret := 0.118866
							if( bbm > 0.144793 )
								if( bbp <= 0.080472 )
									ret := -0.011685
								if( bbp > 0.080472 )
									ret := -0.109275
				if( bbp > 0.649967 )
					if( bbm <= 0.721948 )
						if( bbm <= 0.493659 )
							if( bbm <= 0.425 )
								ret := 0.550000
							if( bbm > 0.425 )
								ret := 1.000000 // buy
						if( bbm > 0.493659 )
							if( bearPower <= 0.160907 )
								if( bullPower <= 0.667637 )
									ret := 0.888889 // buy
								if( bullPower > 0.667637 )
									ret := -0.142857
							if( bearPower > 0.160907 )
								ret := -0.636364
					if( bbm > 0.721948 )
						if( bearPower <= 0.019451 )
							ret := 0.545455
						if( bearPower > 0.019451 )
							ret := 1.000000 // buy
			if( bearPower > 0.176191 )
				if( bullPower <= 0.370023 )
					if( bearPower <= 0.199016 )
						if( bbm <= 0.07985 )
							if( bullPower <= 0.21416 )
								if( bbm <= 0.020633 )
									ret := -0.625000
								if( bbm > 0.020633 )
									ret := -1.000000 // sell
							if( bullPower > 0.21416 )
								if( bbp <= 0.408893 )
									ret := 0.666667
								if( bbp > 0.408893 )
									ret := -0.360902
						if( bbm > 0.07985 )
							if( bbm <= 0.125183 )
								if( bbp <= 0.493931 )
									ret := 0.316327
								if( bbp > 0.493931 )
									ret := 0.888889 // buy
							if( bbm > 0.125183 )
								if( bearPower <= 0.180697 )
									ret := -0.829268 // sell
								if( bearPower > 0.180697 )
									ret := -0.119048
					if( bearPower > 0.199016 )
						if( bullPower <= 0.252365 )
							if( bbm <= 0.025942 )
								if( bbm <= 0.019881 )
									ret := 0.960000 // buy
								if( bbm > 0.019881 )
									ret := 0.700000 // buy
							if( bbm > 0.025942 )
								if( bullPower <= 0.243276 )
									ret := -0.909091 // sell
								if( bullPower > 0.243276 )
									ret := -0.692308
						if( bullPower > 0.252365 )
							if( bullPower <= 0.331624 )
								if( bullPower <= 0.299207 )
									ret := -0.513274
								if( bullPower > 0.299207 )
									ret := -0.754601 // sell
							if( bullPower > 0.331624 )
								if( bbm <= 0.09967 )
									ret := -0.800000 // sell
								if( bbm > 0.09967 )
									ret := -0.291667
				if( bullPower > 0.370023 )
					if( bbp <= 0.747861 )
						if( bearPower <= 0.187485 )
							ret := -0.428571
						if( bearPower > 0.187485 )
							if( bbm <= 0.238032 )
								if( bearPower <= 0.224621 )
									ret := -0.142857
								if( bearPower > 0.224621 )
									ret := 0.351485
							if( bbm > 0.238032 )
								if( bullPower <= 0.507826 )
									ret := 0.931818 // buy
								if( bullPower > 0.507826 )
									ret := 0.214286
					if( bbp > 0.747861 )
						if( bullPower <= 0.927547 )
							if( bbm <= 0.032052 )
								if( bearPower <= 0.402018 )
									ret := 0.000000
								if( bearPower > 0.402018 )
									ret := 0.740741 // buy
							if( bbm > 0.032052 )
								if( bullPower <= 0.496695 )
									ret := -0.722222 // sell
								if( bullPower > 0.496695 )
									ret := -0.136283
						if( bullPower > 0.927547 )
							if( bullPower <= 1.04715 )
								if( bbp <= 1.46678 )
									ret := 0.230769
								if( bbp > 1.46678 )
									ret := 0.931034 // buy
							if( bullPower > 1.04715 )
								if( bullPower <= 1.17958 )
									ret := -0.500000
								if( bullPower > 1.17958 )
									ret := 0.312500
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_AFRM_1Min_c47b5858(bullPower, bbp, bearPower, bbm, BBPower_Color)

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


