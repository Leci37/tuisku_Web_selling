//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: XRPUSDT_30Min_2BB0_d094b465 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2BB0_d094b465", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_d094b465(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.014667 )
		if( Upper_Band <= 0.653654 )
			if( Upper_Band <= 0.338857 )
				if( Lower_Band <= 0.225795 )
					if( basis <= 0.215719 )
						ret := 1.000000 // buy
					if( basis > 0.215719 )
						if( bullPower <= -0.001643 )
							if( bearPower <= -0.018564 )
								if( bbm <= 0.012647 )
									ret := 0.500000
								if( bbm > 0.012647 )
									ret := -0.200000
							if( bearPower > -0.018564 )
								if( basis <= 0.242584 )
									ret := -1.000000 // sell
								if( basis > 0.242584 )
									ret := -0.600000
						if( bullPower > -0.001643 )
							ret := 1.000000 // buy
				if( Lower_Band > 0.225795 )
					if( Upper_Band <= 0.328398 )
						if( basis <= 0.266242 )
							ret := 0.500000
						if( basis > 0.266242 )
							if( Upper_Band <= 0.28845 )
								ret := 0.500000
							if( Upper_Band > 0.28845 )
								if( Lower_Band <= 0.299214 )
									ret := 0.985075 // buy
								if( Lower_Band > 0.299214 )
									ret := 0.818182 // buy
					if( Upper_Band > 0.328398 )
						if( bbp <= -0.016365 )
							if( basis <= 0.309131 )
								ret := 0.333333
							if( basis > 0.309131 )
								ret := 1.000000 // buy
						if( bbp > -0.016365 )
							if( Upper_Band <= 0.331085 )
								if( bearPower <= -0.01144 )
									ret := -1.000000 // sell
								if( bearPower > -0.01144 )
									ret := -0.500000
							if( Upper_Band > 0.331085 )
								if( Upper_Band <= 0.332134 )
									ret := 1.000000 // buy
								if( Upper_Band > 0.332134 )
									ret := 0.500000
			if( Upper_Band > 0.338857 )
				if( bearPower <= -0.041239 )
					if( bbp <= -0.136534 )
						ret := -0.500000
					if( bbp > -0.136534 )
						if( bbp <= -0.039265 )
							if( bbm <= 0.022944 )
								ret := -0.142857
							if( bbm > 0.022944 )
								if( basis <= 0.531483 )
									ret := 0.858824 // buy
								if( basis > 0.531483 )
									ret := 0.514286
						if( bbp > -0.039265 )
							ret := -0.500000
				if( bearPower > -0.041239 )
					if( Upper_Band <= 0.382523 )
						if( bbm <= 0.015182 )
							if( basis <= 0.324001 )
								if( Upper_Band <= 0.345477 )
									ret := 0.250000
								if( Upper_Band > 0.345477 )
									ret := 1.000000 // buy
							if( basis > 0.324001 )
								if( Lower_Band <= 0.317691 )
									ret := -0.865385 // sell
								if( Lower_Band > 0.317691 )
									ret := -0.166667
						if( bbm > 0.015182 )
							if( Upper_Band <= 0.363622 )
								if( bearPower <= -0.029257 )
									ret := 0.714286 // buy
								if( bearPower > -0.029257 )
									ret := 1.000000 // buy
							if( Upper_Band > 0.363622 )
								ret := 0.428571
					if( Upper_Band > 0.382523 )
						if( bbp <= -0.022856 )
							if( basis <= 0.562979 )
								if( basis <= 0.382197 )
									ret := 0.914286 // buy
								if( basis > 0.382197 )
									ret := 0.038304
							if( basis > 0.562979 )
								if( bbp <= -0.026821 )
									ret := 0.544061
								if( bbp > -0.026821 )
									ret := 0.154839
						if( bbp > -0.022856 )
							if( Lower_Band <= 0.447548 )
								if( Upper_Band <= 0.438197 )
									ret := 0.366279
								if( Upper_Band > 0.438197 )
									ret := 0.717391 // buy
							if( Lower_Band > 0.447548 )
								if( bearPower <= -0.009789 )
									ret := 0.338616
								if( bearPower > -0.009789 )
									ret := -0.270270
		if( Upper_Band > 0.653654 )
			if( bbm <= 0.008105 )
				if( Upper_Band <= 0.910098 )
					if( Lower_Band <= 0.793412 )
						if( basis <= 0.788916 )
							if( basis <= 0.764294 )
								if( basis <= 0.76059 )
									ret := -0.037671
								if( basis > 0.76059 )
									ret := -0.764706 // sell
							if( basis > 0.764294 )
								if( Upper_Band <= 0.777371 )
									ret := -1.000000 // sell
								if( Upper_Band > 0.777371 )
									ret := 0.612903
						if( basis > 0.788916 )
							if( bullPower <= -0.009699 )
								if( Upper_Band <= 0.824425 )
									ret := 1.000000 // buy
								if( Upper_Band > 0.824425 )
									ret := -0.142857
							if( bullPower > -0.009699 )
								if( basis <= 0.816237 )
									ret := -0.814815 // sell
								if( basis > 0.816237 )
									ret := 0.000000
					if( Lower_Band > 0.793412 )
						if( bbm <= 0.004397 )
							if( bullPower <= -0.00692 )
								ret := 0.571429
							if( bullPower > -0.00692 )
								ret := 1.000000 // buy
						if( bbm > 0.004397 )
							if( basis <= 0.83726 )
								if( Lower_Band <= 0.819438 )
									ret := 0.433333
								if( Lower_Band > 0.819438 )
									ret := 1.000000 // buy
							if( basis > 0.83726 )
								if( Lower_Band <= 0.836524 )
									ret := -0.185185
								if( Lower_Band > 0.836524 )
									ret := 0.461538
				if( Upper_Band > 0.910098 )
					if( basis <= 0.978518 )
						if( Upper_Band <= 0.949669 )
							if( Upper_Band <= 0.916394 )
								ret := -1.000000 // sell
							if( Upper_Band > 0.916394 )
								if( bearPower <= -0.016029 )
									ret := 0.750000 // buy
								if( bearPower > -0.016029 )
									ret := 0.000000
						if( Upper_Band > 0.949669 )
							if( basis <= 0.952142 )
								if( Upper_Band <= 0.971453 )
									ret := -0.545455
								if( Upper_Band > 0.971453 )
									ret := -1.000000 // sell
							if( basis > 0.952142 )
								if( Lower_Band <= 0.939929 )
									ret := -0.125000
								if( Lower_Band > 0.939929 )
									ret := -1.000000 // sell
					if( basis > 0.978518 )
						if( bearPower <= -0.013916 )
							if( bearPower <= -0.014126 )
								if( bullPower <= -0.00771 )
									ret := -0.421053
								if( bullPower > -0.00771 )
									ret := 0.250000
							if( bearPower > -0.014126 )
								ret := -1.000000 // sell
						if( bearPower > -0.013916 )
							if( Upper_Band <= 1.19799 )
								if( Lower_Band <= 1.13847 )
									ret := 0.046154
								if( Lower_Band > 1.13847 )
									ret := 1.000000 // buy
							if( Upper_Band > 1.19799 )
								if( basis <= 1.25484 )
									ret := -0.714286 // sell
								if( basis > 1.25484 )
									ret := 0.000000
			if( bbm > 0.008105 )
				if( Lower_Band <= 1.71445 )
					if( Upper_Band <= 1.84792 )
						if( basis <= 1.4053 )
							if( basis <= 0.643594 )
								if( basis <= 0.5909 )
									ret := 0.580645
								if( basis > 0.5909 )
									ret := -0.279070
							if( basis > 0.643594 )
								if( Upper_Band <= 1.42841 )
									ret := 0.188794
								if( Upper_Band > 1.42841 )
									ret := 0.601399
						if( basis > 1.4053 )
							if( bbp <= -0.050138 )
								if( Upper_Band <= 1.65308 )
									ret := -0.022831
								if( Upper_Band > 1.65308 )
									ret := 0.720779 // buy
							if( bbp > -0.050138 )
								if( Lower_Band <= 1.36879 )
									ret := -0.655556
								if( Lower_Band > 1.36879 )
									ret := -0.113372
					if( Upper_Band > 1.84792 )
						if( Upper_Band <= 1.92198 )
							ret := 1.000000 // buy
						if( Upper_Band > 1.92198 )
							if( bbp <= -0.106959 )
								ret := 1.000000 // buy
							if( bbp > -0.106959 )
								ret := -0.250000
				if( Lower_Band > 1.71445 )
					if( Lower_Band <= 1.72066 )
						ret := -0.750000 // sell
					if( Lower_Band > 1.72066 )
						ret := -1.000000 // sell
	if( bbp > -0.014667 )
		if( bearPower <= 0.005581 )
			if( Upper_Band <= 0.229142 )
				if( bbp <= 0.009212 )
					if( bullPower <= 0.005619 )
						if( Lower_Band <= 0.216766 )
							if( bbp <= 0.003187 )
								if( Lower_Band <= 0.216606 )
									ret := 0.917647 // buy
								if( Lower_Band > 0.216606 )
									ret := 0.600000
							if( bbp > 0.003187 )
								if( bbp <= 0.003564 )
									ret := -0.250000
								if( bbp > 0.003564 )
									ret := 0.645161
						if( Lower_Band > 0.216766 )
							if( bbm <= 0.002204 )
								if( Upper_Band <= 0.226612 )
									ret := 0.375000
								if( Upper_Band > 0.226612 )
									ret := 0.903226 // buy
							if( bbm > 0.002204 )
								if( basis <= 0.222827 )
									ret := -0.777778 // sell
								if( basis > 0.222827 )
									ret := 0.333333
					if( bullPower > 0.005619 )
						if( basis <= 0.210114 )
							if( Upper_Band <= 0.220482 )
								ret := 0.750000 // buy
							if( Upper_Band > 0.220482 )
								ret := 1.000000 // buy
						if( basis > 0.210114 )
							if( basis <= 0.217442 )
								if( bbm <= 0.006852 )
									ret := -1.000000 // sell
								if( bbm > 0.006852 )
									ret := -0.500000
							if( basis > 0.217442 )
								if( bullPower <= 0.006378 )
									ret := 1.000000 // buy
								if( bullPower > 0.006378 )
									ret := -0.142857
				if( bbp > 0.009212 )
					if( bbp <= 0.017026 )
						ret := -1.000000 // sell
					if( bbp > 0.017026 )
						ret := -0.750000 // sell
			if( Upper_Band > 0.229142 )
				if( basis <= 1.5752 )
					if( bearPower <= -0.006262 )
						if( bearPower <= -0.020474 )
							if( basis <= 0.663298 )
								if( bullPower <= 0.014683 )
									ret := -0.500000
								if( bullPower > 0.014683 )
									ret := -1.000000 // sell
							if( basis > 0.663298 )
								if( basis <= 1.29353 )
									ret := 0.771429 // buy
								if( basis > 1.29353 )
									ret := 0.222222
						if( bearPower > -0.020474 )
							if( Upper_Band <= 0.640706 )
								if( basis <= 0.364381 )
									ret := -0.028871
								if( basis > 0.364381 )
									ret := 0.157139
							if( Upper_Band > 0.640706 )
								if( Upper_Band <= 0.71426 )
									ret := -0.221485
								if( Upper_Band > 0.71426 )
									ret := 0.083313
					if( bearPower > -0.006262 )
						if( Lower_Band <= 0.352652 )
							if( Upper_Band <= 0.397588 )
								if( Upper_Band <= 0.369106 )
									ret := 0.071683
								if( Upper_Band > 0.369106 )
									ret := 0.407080
							if( Upper_Band > 0.397588 )
								if( bearPower <= -0.000953 )
									ret := 0.233333
								if( bearPower > -0.000953 )
									ret := -0.937500 // sell
						if( Lower_Band > 0.352652 )
							if( bullPower <= 0.00197 )
								if( basis <= 0.829568 )
									ret := 0.001614
								if( basis > 0.829568 )
									ret := -0.159730
							if( bullPower > 0.00197 )
								if( basis <= 0.390926 )
									ret := -0.078818
								if( basis > 0.390926 )
									ret := 0.052038
				if( basis > 1.5752 )
					if( basis <= 1.69429 )
						if( Lower_Band <= 1.55951 )
							if( bearPower <= -0.008069 )
								if( bullPower <= 0.024398 )
									ret := 0.340909
								if( bullPower > 0.024398 )
									ret := -0.470588
							if( bearPower > -0.008069 )
								if( Lower_Band <= 1.55136 )
									ret := -0.728155 // sell
								if( Lower_Band > 1.55136 )
									ret := 0.416667
						if( Lower_Band > 1.55951 )
							if( bearPower <= -0.020931 )
								ret := 0.400000
							if( bearPower > -0.020931 )
								if( bullPower <= 0.02862 )
									ret := -0.932203 // sell
								if( bullPower > 0.02862 )
									ret := -0.692308
					if( basis > 1.69429 )
						if( Upper_Band <= 1.87523 )
							if( basis <= 1.73742 )
								if( bearPower <= 0.002793 )
									ret := 0.913043 // buy
								if( bearPower > 0.002793 )
									ret := 0.250000
							if( basis > 1.73742 )
								if( Lower_Band <= 1.71174 )
									ret := -0.592593
								if( Lower_Band > 1.71174 )
									ret := 1.000000 // buy
						if( Upper_Band > 1.87523 )
							ret := -1.000000 // sell
		if( bearPower > 0.005581 )
			if( Lower_Band <= 0.236039 )
				if( bearPower <= 0.007307 )
					if( bbp <= 0.022699 )
						ret := -1.000000 // sell
					if( bbp > 0.022699 )
						ret := 0.400000
				if( bearPower > 0.007307 )
					if( bbp <= 0.073523 )
						if( Lower_Band <= 0.225076 )
							ret := -1.000000 // sell
						if( Lower_Band > 0.225076 )
							if( Upper_Band <= 0.300516 )
								ret := -0.750000 // sell
							if( Upper_Band > 0.300516 )
								ret := -1.000000 // sell
					if( bbp > 0.073523 )
						ret := -0.714286 // sell
			if( Lower_Band > 0.236039 )
				if( Lower_Band <= 1.21071 )
					if( Lower_Band <= 0.628419 )
						if( Lower_Band <= 0.473491 )
							if( bbp <= 0.029863 )
								if( basis <= 0.473645 )
									ret := -0.238916
								if( basis > 0.473645 )
									ret := 0.444444
							if( bbp > 0.029863 )
								if( Lower_Band <= 0.436415 )
									ret := 0.186544
								if( Lower_Band > 0.436415 )
									ret := -0.306818
						if( Lower_Band > 0.473491 )
							if( basis <= 0.513216 )
								if( bbp <= 0.018701 )
									ret := 0.250000
								if( bbp > 0.018701 )
									ret := -0.752941 // sell
							if( basis > 0.513216 )
								if( Upper_Band <= 0.727659 )
									ret := -0.183696
								if( Upper_Band > 0.727659 )
									ret := -0.916667 // sell
					if( Lower_Band > 0.628419 )
						if( basis <= 0.730783 )
							if( Upper_Band <= 0.736102 )
								if( bearPower <= 0.015397 )
									ret := 0.101449
								if( bearPower > 0.015397 )
									ret := 1.000000 // buy
							if( Upper_Band > 0.736102 )
								if( basis <= 0.69079 )
									ret := -0.750000 // sell
								if( basis > 0.69079 )
									ret := 0.726415 // buy
						if( basis > 0.730783 )
							if( bbp <= 0.151563 )
								if( Upper_Band <= 1.26636 )
									ret := -0.053892
								if( Upper_Band > 1.26636 )
									ret := 0.421053
							if( bbp > 0.151563 )
								if( bullPower <= 0.106574 )
									ret := -0.600000
								if( bullPower > 0.106574 )
									ret := -1.000000 // sell
				if( Lower_Band > 1.21071 )
					if( Upper_Band <= 1.83421 )
						if( Upper_Band <= 1.76568 )
							if( Lower_Band <= 1.23807 )
								if( bearPower <= 0.009368 )
									ret := -0.294118
								if( bearPower > 0.009368 )
									ret := -0.844444 // sell
							if( Lower_Band > 1.23807 )
								if( Lower_Band <= 1.42496 )
									ret := -0.155172
								if( Lower_Band > 1.42496 )
									ret := -0.564516
						if( Upper_Band > 1.76568 )
							if( Lower_Band <= 1.67832 )
								if( Upper_Band <= 1.80385 )
									ret := 0.812500 // buy
								if( Upper_Band > 1.80385 )
									ret := 0.266667
							if( Lower_Band > 1.67832 )
								ret := -1.000000 // sell
					if( Upper_Band > 1.83421 )
						if( bbm <= 0.065345 )
							ret := -1.000000 // sell
						if( bbm > 0.065345 )
							ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_d094b465(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


