//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: CRWD_1Min_2TV0_826fe9ea Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2TV0_826fe9ea", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_826fe9ea(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.031717 )
		if( VIP_VIM <= -0.193235 )
			if( ema2 <= 228.52 )
				if( VIM <= 1.41303 )
					if( tema <= 215.905 )
						if( ema2 <= 213.134 )
							if( ema2 <= 212.241 )
								if( ema2 <= 196.7 )
									ret := 1.000000 // buy
								if( ema2 > 196.7 )
									ret := 0.454545
							if( ema2 > 212.241 )
								if( VIP_VIM <= -0.304132 )
									ret := 0.983051 // buy
								if( VIP_VIM > -0.304132 )
									ret := 0.846154 // buy
						if( ema2 > 213.134 )
							if( ema13 <= -1.37036 )
								if( VIP_VIM <= -0.472866 )
									ret := 0.500000
								if( VIP_VIM > -0.472866 )
									ret := -0.846154 // sell
							if( ema13 > -1.37036 )
								if( VIP_VIM <= -0.217349 )
									ret := 0.859375 // buy
								if( VIP_VIM > -0.217349 )
									ret := 0.375000
					if( tema > 215.905 )
						if( VIM <= 1.26398 )
							if( VIM <= 1.13661 )
								if( ema2 <= 222.957 )
									ret := 0.600000
								if( ema2 > 222.957 )
									ret := 0.060606
							if( VIM > 1.13661 )
								if( ema13 <= -0.74349 )
									ret := 0.429907
								if( ema13 > -0.74349 )
									ret := -0.203540
						if( VIM > 1.26398 )
							if( VIP <= 0.961731 )
								if( tema <= 222.685 )
									ret := 0.846154 // buy
								if( tema > 222.685 )
									ret := 0.312500
							if( VIP > 0.961731 )
								ret := -0.583333
				if( VIM > 1.41303 )
					if( ema13 <= -0.92248 )
						if( ema3 <= 210.127 )
							if( ema13 <= -1.20169 )
								if( ema2 <= 207.883 )
									ret := -0.137931
								if( ema2 > 207.883 )
									ret := -1.000000 // sell
							if( ema13 > -1.20169 )
								if( ema3 <= 199.729 )
									ret := -1.000000 // sell
								if( ema3 > 199.729 )
									ret := -0.846154 // sell
						if( ema3 > 210.127 )
							if( tema <= 205.399 )
								ret := 1.000000 // buy
							if( tema > 205.399 )
								if( ema2 <= 216.948 )
									ret := -0.833333 // sell
								if( ema2 > 216.948 )
									ret := -0.272727
					if( ema13 > -0.92248 )
						if( VIM <= 8.1267 )
							if( ema13 <= -0.112611 )
								if( ema3 <= 223.661 )
									ret := 0.123711
								if( ema3 > 223.661 )
									ret := 0.772727 // buy
							if( ema13 > -0.112611 )
								ret := 1.000000 // buy
						if( VIM > 8.1267 )
							ret := -0.666667
			if( ema2 > 228.52 )
				if( VIM <= 1.45612 )
					if( ema2 <= 228.963 )
						if( ema13 <= -0.481815 )
							ret := -1.000000 // sell
						if( ema13 > -0.481815 )
							if( ema2 <= 228.762 )
								ret := -0.625000
							if( ema2 > 228.762 )
								ret := -1.000000 // sell
					if( ema2 > 228.963 )
						if( ema12 <= -3.4449 )
							if( VIM <= 1.38467 )
								ret := 1.000000 // buy
							if( VIM > 1.38467 )
								ret := 0.875000 // buy
						if( ema12 > -3.4449 )
							if( ema13 <= -4.29931 )
								if( tema <= 275.279 )
									ret := 0.461538
								if( tema > 275.279 )
									ret := -0.722772 // sell
							if( ema13 > -4.29931 )
								if( ema1 <= 384.782 )
									ret := -0.026210
								if( ema1 > 384.782 )
									ret := -0.187895
				if( VIM > 1.45612 )
					if( ema12 <= -9.03959 )
						ret := -1.000000 // sell
					if( ema12 > -9.03959 )
						if( ema13 <= -0.197441 )
							if( VIP <= 17.4032 )
								if( tema <= 306.843 )
									ret := 0.149161
								if( tema > 306.843 )
									ret := 0.349065
							if( VIP > 17.4032 )
								if( tema <= 347.072 )
									ret := -0.071066
								if( tema > 347.072 )
									ret := -0.663366
						if( ema13 > -0.197441 )
							if( ema3 <= 258.878 )
								if( ema13 <= -0.031663 )
									ret := 0.005291
								if( ema13 > -0.031663 )
									ret := 0.545977
							if( ema3 > 258.878 )
								if( tema <= 258.962 )
									ret := -0.888889 // sell
								if( tema > 258.962 )
									ret := -0.077885
		if( VIP_VIM > -0.193235 )
			if( ema13 <= -0.721941 )
				if( tema <= 315.577 )
					if( VIP_VIM <= -0.070491 )
						if( ema2 <= 241.904 )
							if( VIP_VIM <= -0.176346 )
								ret := -0.454545
							if( VIP_VIM > -0.176346 )
								if( ema12 <= -0.497841 )
									ret := 0.733333 // buy
								if( ema12 > -0.497841 )
									ret := 0.972973 // buy
						if( ema2 > 241.904 )
							if( ema3 <= 256.582 )
								if( ema12 <= -0.468583 )
									ret := -0.875000 // sell
								if( ema12 > -0.468583 )
									ret := -0.300000
							if( ema3 > 256.582 )
								if( ema12 <= -0.526653 )
									ret := 0.651786
								if( ema12 > -0.526653 )
									ret := 0.084746
					if( VIP_VIM > -0.070491 )
						if( ema2 <= 221.535 )
							if( tema <= 207.643 )
								ret := 0.750000 // buy
							if( tema > 207.643 )
								ret := -1.000000 // sell
						if( ema2 > 221.535 )
							if( ema13 <= -3.05172 )
								ret := 0.090909
							if( ema13 > -3.05172 )
								if( tema <= 287.938 )
									ret := 0.677419
								if( tema > 287.938 )
									ret := 0.881356 // buy
				if( tema > 315.577 )
					if( VIM <= 1.06415 )
						if( ema2 <= 382.225 )
							if( tema <= 321.917 )
								ret := -0.777778 // sell
							if( tema > 321.917 )
								if( ema12 <= -0.362817 )
									ret := -0.552632
								if( ema12 > -0.362817 )
									ret := 0.307692
						if( ema2 > 382.225 )
							ret := 0.833333 // buy
					if( VIM > 1.06415 )
						if( VIP <= 1.59314 )
							if( ema12 <= -0.84465 )
								ret := -0.200000
							if( ema12 > -0.84465 )
								if( tema <= 371.465 )
									ret := 0.750000 // buy
								if( tema > 371.465 )
									ret := 0.340000
						if( VIP > 1.59314 )
							if( ema1 <= 377.615 )
								if( tema <= 374.417 )
									ret := -0.416667
								if( tema > 374.417 )
									ret := -1.000000 // sell
							if( ema1 > 377.615 )
								if( ema12 <= -0.711818 )
									ret := 0.054054
								if( ema12 > -0.711818 )
									ret := 0.722222 // buy
			if( ema13 > -0.721941 )
				if( ema3 <= 205.044 )
					if( ema12 <= 0.002084 )
						if( VIP <= 1.65803 )
							if( ema12 <= -0.224892 )
								ret := -1.000000 // sell
							if( ema12 > -0.224892 )
								ret := -0.250000
						if( VIP > 1.65803 )
							ret := -1.000000 // sell
					if( ema12 > 0.002084 )
						ret := -0.153846
				if( ema3 > 205.044 )
					if( tema <= 259.6 )
						if( ema1 <= 244.355 )
							if( tema <= 242.305 )
								if( VIM <= 16.2866 )
									ret := 0.094164
								if( VIM > 16.2866 )
									ret := -0.672727
							if( tema > 242.305 )
								if( ema1 <= 242.894 )
									ret := -0.787879 // sell
								if( ema1 > 242.894 )
									ret := -0.105882
						if( ema1 > 244.355 )
							if( tema <= 245.89 )
								if( ema1 <= 245.796 )
									ret := 0.546256
								if( ema1 > 245.796 )
									ret := -0.105263
							if( tema > 245.89 )
								if( tema <= 251.349 )
									ret := 0.088235
								if( tema > 251.349 )
									ret := 0.303493
					if( tema > 259.6 )
						if( ema2 <= 327.318 )
							if( tema <= 324.186 )
								if( VIM <= 9.28652 )
									ret := -0.015010
								if( VIM > 9.28652 )
									ret := 0.402214
							if( tema > 324.186 )
								if( VIP <= 1.28768 )
									ret := -0.679012
								if( VIP > 1.28768 )
									ret := 0.500000
						if( ema2 > 327.318 )
							if( ema1 <= 339.636 )
								if( ema12 <= -0.193233 )
									ret := -0.333333
								if( ema12 > -0.193233 )
									ret := 0.587879
							if( ema1 > 339.636 )
								if( ema3 <= 373.893 )
									ret := 0.024604
								if( ema3 > 373.893 )
									ret := 0.159273
	if( ema12 > 0.031717 )
		if( tema <= 391.584 )
			if( VIM <= 0.814913 )
				if( ema1 <= 389.827 )
					if( tema <= 212.31 )
						if( ema1 <= 199.054 )
							if( ema12 <= 0.702367 )
								ret := 0.636364
							if( ema12 > 0.702367 )
								ret := -1.000000 // sell
						if( ema1 > 199.054 )
							if( VIM <= 0.479111 )
								ret := 0.263158
							if( VIM > 0.479111 )
								if( ema3 <= 200.838 )
									ret := 1.000000 // buy
								if( ema3 > 200.838 )
									ret := 0.941176 // buy
					if( tema > 212.31 )
						if( ema1 <= 236.436 )
							if( ema1 <= 233.655 )
								if( ema3 <= 232.27 )
									ret := -0.383019
								if( ema3 > 232.27 )
									ret := 0.740000 // buy
							if( ema1 > 233.655 )
								if( VIP_VIM <= 0.401031 )
									ret := -0.300000
								if( VIP_VIM > 0.401031 )
									ret := -0.833333 // sell
						if( ema1 > 236.436 )
							if( ema2 <= 238.791 )
								if( ema12 <= 0.506834 )
									ret := 0.903226 // buy
								if( ema12 > 0.506834 )
									ret := 0.545455
							if( ema2 > 238.791 )
								if( ema13 <= 0.916378 )
									ret := -0.044913
								if( ema13 > 0.916378 )
									ret := -0.156585
				if( ema1 > 389.827 )
					if( ema1 <= 390.833 )
						if( ema13 <= 0.709187 )
							ret := -0.437500
						if( ema13 > 0.709187 )
							if( VIM <= 0.731849 )
								ret := -0.769231 // sell
							if( VIM > 0.731849 )
								ret := -1.000000 // sell
					if( ema1 > 390.833 )
						ret := 0.000000
			if( VIM > 0.814913 )
				if( ema13 <= 2.15582 )
					if( ema3 <= 198.102 )
						if( tema <= 198.521 )
							ret := 1.000000 // buy
						if( tema > 198.521 )
							if( ema2 <= 198.057 )
								ret := 0.500000
							if( ema2 > 198.057 )
								ret := 1.000000 // buy
					if( ema3 > 198.102 )
						if( VIP <= 227.518 )
							if( VIP <= 1.06485 )
								if( ema13 <= 0.714267 )
									ret := -0.066461
								if( ema13 > 0.714267 )
									ret := -0.474074
							if( VIP > 1.06485 )
								if( VIM <= 39.4005 )
									ret := -0.005082
								if( VIM > 39.4005 )
									ret := 0.280769
						if( VIP > 227.518 )
							if( ema3 <= 335.439 )
								if( tema <= 313.922 )
									ret := -0.615385
								if( tema > 313.922 )
									ret := 0.307692
							if( ema3 > 335.439 )
								if( tema <= 357.954 )
									ret := -1.000000 // sell
								if( tema > 357.954 )
									ret := -0.777778 // sell
				if( ema13 > 2.15582 )
					if( VIP_VIM <= 0.515346 )
						if( VIP <= 1.09751 )
							if( tema <= 281.816 )
								ret := 1.000000 // buy
							if( tema > 281.816 )
								if( ema1 <= 304.523 )
									ret := 0.444444
								if( ema1 > 304.523 )
									ret := 0.937500 // buy
						if( VIP > 1.09751 )
							if( ema12 <= 1.76027 )
								if( ema12 <= 1.62765 )
									ret := 0.379747
								if( ema12 > 1.62765 )
									ret := 0.969697 // buy
							if( ema12 > 1.76027 )
								if( tema <= 304.563 )
									ret := -0.562500
								if( tema > 304.563 )
									ret := 0.647059
					if( VIP_VIM > 0.515346 )
						if( VIM <= 2.69103 )
							if( VIM <= 0.849386 )
								ret := 0.571429
							if( VIM > 0.849386 )
								if( ema1 <= 314.508 )
									ret := -0.873016 // sell
								if( ema1 > 314.508 )
									ret := -0.238095
						if( VIM > 2.69103 )
							if( ema1 <= 301.736 )
								if( ema2 <= 270.208 )
									ret := 0.428571
								if( ema2 > 270.208 )
									ret := 0.928571 // buy
							if( ema1 > 301.736 )
								ret := -0.100000
		if( tema > 391.584 )
			if( ema2 <= 391.555 )
				if( VIP <= 2.12018 )
					if( ema12 <= 0.504324 )
						if( VIP_VIM <= 0.096433 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.096433 )
							if( VIP <= 1.15396 )
								ret := 0.000000
							if( VIP > 1.15396 )
								if( tema <= 391.88 )
									ret := -0.545455
								if( tema > 391.88 )
									ret := -0.911765 // sell
					if( ema12 > 0.504324 )
						if( ema12 <= 0.650297 )
							ret := -0.941176 // sell
						if( ema12 > 0.650297 )
							ret := -1.000000 // sell
				if( VIP > 2.12018 )
					ret := 0.250000
			if( ema2 > 391.555 )
				if( ema1 <= 392.106 )
					if( tema <= 392.004 )
						ret := 0.846154 // buy
					if( tema > 392.004 )
						if( ema13 <= 0.345533 )
							ret := 0.000000
						if( ema13 > 0.345533 )
							ret := 0.400000
				if( ema1 > 392.106 )
					if( ema3 <= 391.888 )
						if( VIP <= 1.22128 )
							ret := -0.875000 // sell
						if( VIP > 1.22128 )
							ret := -1.000000 // sell
					if( ema3 > 391.888 )
						if( ema12 <= 0.127243 )
							if( VIP_VIM <= 0.08219 )
								ret := -0.333333
							if( VIP_VIM > 0.08219 )
								if( VIM <= 0.931451 )
									ret := -0.562500
								if( VIM > 0.931451 )
									ret := -0.925926 // sell
						if( ema12 > 0.127243 )
							if( VIM <= 0.949851 )
								if( ema1 <= 393.779 )
									ret := 0.133333
								if( ema1 > 393.779 )
									ret := -0.777778 // sell
							if( VIM > 0.949851 )
								ret := -0.916667 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3



//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_CRWD_1Min_826fe9ea(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


